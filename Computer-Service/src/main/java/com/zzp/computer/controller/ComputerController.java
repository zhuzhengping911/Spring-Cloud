package com.zzp.computer.controller;

import com.zzp.computer.dao.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@Controller
public class ComputerController {

    @Autowired
    ComputerMapper computerMapper;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }


    @RequestMapping(value = "/getComputer/{address}",method = RequestMethod.GET)
    public String getComputer(@PathVariable String address){
        return computerMapper.findByComputerName(address);
    }

}
