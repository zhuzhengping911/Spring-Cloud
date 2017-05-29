package com.zzp.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhuzhengping on 2017/5/10.
 * 字符串处理
 */
public class StringUtil {

    public static String formatForSig(String str) {

        if(str == null || "".equals(str))
        {
            return str;
        }

        str = str.replace("-", "").replace(" ", "").replace(":", "");
        return str;
    }

    public static String toString(Object obj) {
        // NULL返回空字符串，其他返回toString后字符串
        return obj == null ? "" : obj.toString();
    }

    public static String toStr(Object obj) {
        // NULL返回空字符串，其他返回toString后字符串
        return obj == null ? "" : obj.toString();
    }

    public static String toIntString(Object obj) {
        // NULL返回空字符串，其他返回toString后字符串
        return obj == null ? "0" : obj.toString();
    }

    public static int toInt(Object obj) {
        String str = toString(obj);
        if (isNotUInt(str)) {
            return 0;
        } else {
            return Integer.parseInt(str);
        }
    }

    public static double toDouble(Object obj) {
        String str = toString(obj);
        if (isNotDouble(str)) {
            return 0;
        } else {
            return Double.parseDouble(str);
        }
    }

    public static String toNullString(Object obj) {
        // NULL返回空字符串，其他返回toString后字符串
        return obj == null ? null : obj.toString();
    }

    public static long toLong(Object obj) {
        // NULL返回空字符串，其他返回toString后字符串
        return obj == null ? 0 : Long.parseLong(obj.toString());
    }

    public static boolean isNotUInt(String str) {

        try{
            if(Integer.parseInt(str) > 0) return false;
        }catch(Exception e){
            return true;
        }
        return false;
    }

    public static boolean isNotDouble(String str) {
        try{
            if(Double.parseDouble(str) > 0) return false;
        }catch(Exception e){
            return true;
        }
        return false;
    }

    public static boolean isNullEmpty(String str) {
        return (str == null || "".equals(str.trim()) || "null".equals(str.trim()));
    }

    public static boolean isNullEmpty(Object obj) {
        return (obj == null || "".equals(obj.toString().trim()));
    }

    public static boolean isNotNullEmpty(String str) {
        return !isNullEmpty(str);
    }

    public static boolean isNotNullEmpty(Object obj) {
        return !isNullEmpty(obj);
    }

    //首字母转小写
    public static String toLowerCaseFirstOne(String str)
    {
        if(Character.isLowerCase(str.charAt(0))){
            return str;
        }
        else{
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
            return sb.toString();
        }
    }
    //首字母转大写
    public static String toUpperCaseFirstOne(String str)
    {
        if(Character.isUpperCase(str.charAt(0))){
            return str;
        }
        else{
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            return sb.toString();
        }
    }

    public static boolean isMobileNo(String mobiles) {

        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m = p.matcher(mobiles);

        return m.matches();
    }

    public static boolean isIllegal(String str, int len) {

        return StringUtil.isNullEmpty(str) || str.length() > len;
    }

    public static boolean isNotEmpty(String code) {
        return ((code != null) && (code.length() > 0));
    }
}
