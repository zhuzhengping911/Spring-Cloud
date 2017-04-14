package com.zzp.common.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    @RequestMapping(value = "/addFead",method = RequestMethod.POST)
    public String addFead(@RequestBody Map<String,Object> reqMap){
        int a = Integer.parseInt(reqMap.get("userId").toString());
        if(a == 1){
            return "SH";
        }else {
            return "" + 1/0;
        }

    }
}
