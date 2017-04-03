package com.zzp.feign.controller;

import com.zzp.feign.service.CommonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/4/3.
 */
@RestController
public class ConsumeController {

    @Autowired
    CommonClient commonClient;

    @RequestMapping(value = "/addFead",method = RequestMethod.GET)
    public String addFead(){
        return commonClient.addFead();
    }
}
