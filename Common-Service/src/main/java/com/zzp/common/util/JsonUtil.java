package com.zzp.common.util;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by zhuzhengping on 2017/5/10.
 */
public class JsonUtil {
    private JsonUtil() {
    }

    /**
     * 对象转换成json字符串
     *
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    /**
     * json字符串转成对象
     *
     * @param str
     * @param type
     * @return
     */
    public static <T> T fromJson(String str, Type type) {
        Gson gson = new Gson();
        return gson.fromJson(str, type);
    }

    /**
     * json字符串转成对象
     *
     * @param str
     * @param type
     * @return
     */
    public static <T> T fromJson(String str, Class<T> type) {
        Gson gson = new Gson();
        return gson.fromJson(str, type);
    }

    /**
     * 根据json字符串返回Map对象
     *
     * @param json
     * @return
     */
    public static Map<String, Object> mapFromJson(String json) {
        return mapFromJsonObject(parseJsonObject(json));
    }

    /**
     * 将JSONObjec对象转换成Map-List集合
     *
     * @param json
     * @return
     */
    public static Map<String, Object> mapFromJsonObject(JsonObject json) {
        Map<String, Object> map = new HashMap<String, Object>();
        Set<Map.Entry<String, JsonElement>> entrySet = json.entrySet();
        for (Iterator<Map.Entry<String, JsonElement>> iter = entrySet.iterator(); iter
                .hasNext();) {
            Map.Entry<String, JsonElement> entry = iter.next();
            String key = entry.getKey();
            Object value = entry.getValue().getAsString();
            map.put(key, value);
        }
        return map;
    }

    /**
     * 根据json字符串返回Map对象
     *
     * @param json
     * @return
     */
    public static Map<String, Object> mapFromJsonCpl(String json) {
        return mapFromJsonObjectCpl(parseJsonObject(json));
    }

    /**
     * 将JSONObjec对象转换成Map-List集合
     *
     * @param json
     * @return
     */
    public static Map<String, Object> mapFromJsonObjectCpl(JsonObject json) {
        Map<String, Object> map = new HashMap<String, Object>();
        Set<Map.Entry<String, JsonElement>> entrySet = json.entrySet();
        for (Iterator<Map.Entry<String, JsonElement>> iter = entrySet.iterator(); iter
                .hasNext();) {
            Map.Entry<String, JsonElement> entry = iter.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JsonArray)
                map.put(key, listFromJsonArrayCpl((JsonArray) value));
            else if (value instanceof JsonObject)
                map.put(key, mapFromJsonObjectCpl((JsonObject) value));
            else if (value instanceof JsonNull)
                map.put(key, "");
            else
                map.put(key, entry.getValue().getAsString());
        }
        return map;
    }

    /**
     * 根据json字符串返回Map对象
     *
     * @param json
     * @return
     */
    public static List<Object> listFromJson(String json) {
        return listFromJsonArray(parseJsonArray(json));
    }

    /**
     * 将JSONArray对象转换成List集合
     *
     * @param json
     * @return
     */
    public static List<Object> listFromJsonArray(JsonArray json) {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < json.size(); i++) {
            Object value = json.get(i).getAsString();
            list.add(value);
        }
        return list;
    }

    /**
     * 将JSONArray对象转换成List集合
     *
     * @param json
     * @return
     */
    public static List<Object> listObjFromJsonArray(JsonArray json) {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < json.size(); i++) {
            Object value = json.get(i);
            list.add(value);
        }
        return list;
    }

    /**
     * 根据json字符串返回Map对象
     *
     * @param json
     * @return
     */
    public static List<Object> listFromJsonCpl(String json) {
        return listFromJsonArrayCpl(parseJsonArray(json));
    }

    /**
     * 将JSONArray对象转换成List集合
     *
     * @param json
     * @return
     */
    public static List<Object> listFromJsonArrayCpl(JsonArray json) {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < json.size(); i++) {
            Object value = json.get(i);
            if (value instanceof JsonArray) {
                list.add(listFromJsonArrayCpl((JsonArray) value));
            } else if (value instanceof JsonObject) {
                list.add(mapFromJsonObjectCpl((JsonObject) value));
            } else if (value instanceof JsonNull) {
                list.add("");
            } else {
                list.add(json.get(i).getAsString());
            }
        }
        return list;
    }

    /**
     * 获取JsonObject
     *
     * @param json
     * @return
     */
    public static JsonObject parseJsonObject(String json) {
        JsonParser parser = new JsonParser();
        JsonObject jsonObj = parser.parse(json).getAsJsonObject();
        return jsonObj;
    }

    /**
     * 获取JsonArray
     *
     * @param json
     * @return
     */
    public static JsonArray parseJsonArray(String json) {
        JsonParser parser = new JsonParser();
        JsonArray jsonObj = parser.parse(json).getAsJsonArray();
        return jsonObj;
    }
}
