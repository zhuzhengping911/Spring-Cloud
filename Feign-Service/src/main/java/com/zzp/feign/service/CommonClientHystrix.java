package com.zzp.feign.service;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by zhuzhengping on 2017/4/6.
 */
@Component
public class CommonClientHystrix implements CommonClient {
    @Override
    public String addFead(Map<String, Object> reqMap) {
        return "出错啦";
    }
}
