package com.zzp.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by zhuzhengping on 2017/4/5.
 */
@Component
public class CommonClientHystrix implements CommonClient {
    @Override
    public String addFead() {
        return "出错啦";
    }
}
