package com.zzp.computer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@RestController
@RequestMapping("/computer")
public class ComputerController {

    @RequestMapping(value = "/getComputer",method = RequestMethod.GET)
    public String getComputer(){
        return "ShangHai";
    }
}
