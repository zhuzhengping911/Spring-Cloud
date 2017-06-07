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

    /**
     * 验证数据签名
     *
     * @param param 请求参数
     * @return 验证结果
     * @throws Exception
     */
    public static boolean validateSignature(Map<String, Object> param) throws Exception {

        if (param == null || param.size() == 0) {
            logger.warn("validateSignature, param is empty, channelId:" + param.get("channelId") + ", userId:" + param.get("userId"));
            return false;
        }


        String signature = StringUtil.toStr(param.get("signature"));
        if (StringUtil.isNullEmpty(signature)) {
            logger.warn("validateSignature, signature is empty, channelId:" + param.get("channelId") + ", userId:" + param.get("userId"));
            return false;
        }

//        String secret = JedisUtil.hget(StringUtil.toStr(param.get("channelId")) + ':' + StringUtil.toString(param.get("userId")), "secret");
//        if (StringUtil.isNullEmpty(secret)) {
            logger.warn("validateSignature, secret is empty, channelId:" + param.get("channelId") + ", userId:" + param.get("userId"));
            return false;
//        }

//        return signature.equals(Encrypt.getEncryptedData(parseStrBykey(param), secret));
    }

}
