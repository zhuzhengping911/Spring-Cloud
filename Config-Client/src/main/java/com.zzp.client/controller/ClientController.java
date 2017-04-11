package com.zzp.client.controller;

import com.zzp.client.properties.ZzpProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/4/6.
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class ClientController {

    @Autowired
    ZzpProperties zzpProperties;


    @RequestMapping("/from")
    public String from(){
        return zzpProperties.getFrom().toString();


    }
}
