package com.zzp.feign.controller;

import com.zzp.feign.service.CommonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by zhuzhengping on 2017/4/3.
 */
@RestController
public class ConsumeController {

    @Autowired
    CommonClient commonClient;

    @RequestMapping(value = "/addFead",method = RequestMethod.POST)
    public String addFead(@RequestBody Map<String,Object> reqMap){
        return commonClient.addFead(reqMap);
    }
}
