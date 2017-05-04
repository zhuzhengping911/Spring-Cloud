package com.zzp.computer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zzp.computer.dao.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
//@Controller
@RestController
public class ComputerController {

    @Autowired
    ComputerMapper computerMapper;


    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String login() {
//        return "login";
        return new Date() + "";
    }

    public String error() {
        return "hi,"+new Date()+",sorry,error!";
    }


    @RequestMapping(value = "/getComputer/{address}",method = RequestMethod.GET)
    public String getComputer(@PathVariable String address){
        return computerMapper.findByComputerName(address);
    }

}
