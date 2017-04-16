package com.zzp.computer.controller;

import com.zzp.computer.dao.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@RestController
public class ComputerController {

    @Autowired
    ComputerMapper computerMapper;

    @RequestMapping(value = "/")
    public String index(ModelMap map){
        return "login";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/getComputer/{address}",method = RequestMethod.GET)
    public String getComputer(@PathVariable String address){
        return computerMapper.findByComputerName(address);
    }

}
