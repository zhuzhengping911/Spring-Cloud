package com.zzp.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuzhengping on 2017/4/3.
 */
@Service
public class CommonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String getComputer(){
        return restTemplate.postForEntity("http://COMMON-SERVICE/common/addFead",Object.class,String.class).getBody();
    }

    public String addServiceFallback(){
        return "error";
    }
}
