package com.zzp.user.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@RestController
public class UserCenterController {

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public String getUser(@PathVariable("userId") Long userId){
        return "ShangHai";
    }

    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
//        return "login";
        return new Date() + "";
    }

    public String error() {
        return "hi,"+new Date()+",sorry,error!";
    }
}
