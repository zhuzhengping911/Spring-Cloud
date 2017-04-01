package com.zzp.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuzhengping on 2017/4/2.
 */
@RestController
@RequestMapping("/ribbon")
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/getComputer",method = RequestMethod.POST)
    private String getComputer(){
        return restTemplate.postForEntity("http://COMMON-SERVICE/common/addFead",Object.class,String.class).getBody();
    }
}
