package com.zzp.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhuzhengping on 2017/4/3.
 */
@FeignClient("common-service")
public interface CommonClient {

    @RequestMapping(value = "/addFead",method = RequestMethod.POST)
     String addFead();
}
