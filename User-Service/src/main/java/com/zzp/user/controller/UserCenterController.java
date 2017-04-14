package com.zzp.user.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@RestController
public class UserCenterController {

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public String getUser(@PathVariable("userId") Long userId){
        return "ShangHai";
    }
}
