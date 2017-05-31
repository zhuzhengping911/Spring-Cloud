package com.zzp.common.util;

import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by zhuzhengping on 2017/5/16.
 */
public class Security {

    private static final Logger logger = Logger.getLogger(Security.class);

    /**
     * map按key排序取值
     *
     * @param param 参数
     * @return 排序后的value拼接字符串
     * @throws UnsupportedEncodingException
     */
    public static String parseStrBykey(Map<String, Object> param) throws UnsupportedEncodingException {

        String str = "";

        param.remove("signature");
        Object[] key = param.keySet().toArray();
        Arrays.sort(key);

        int i = 0, len = key.length;
        while (i < len) {
            str += param.get(key[i++]);
        }

        return URLEncoder.encode(str, "UTF-8");
    }
}
