package com.zzp.ribbon.controller;

import com.zzp.ribbon.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/4/2.
 */
@RestController
@RequestMapping("/ribbon")
public class ConsumerController {

    /**
     * 直接使用ribbon，不使用断路器
     */
//    @Autowired
//    RestTemplate restTemplate;
    /**
     * 使用断路器
      */
    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/getComputer",method = RequestMethod.POST)
    public String getComputer(){
        /**
         * 不使用断路器直接虚招url
         */
//        return restTemplate.postForEntity("http://COMMON-SERVICE/common/addFead",Object.class,String.class).getBody();
        /**
         * 使用断路器
         */
        return commonService.getComputer();
    }

}
