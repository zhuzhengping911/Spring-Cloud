package com.zzp.computer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zzp.computer.dao.ComputerMapper;
import com.zzp.computer.pojo.LearnResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@Controller
//@RestController
public class ComputerController {

    @Autowired
    ComputerMapper computerMapper;


    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping(value = "/login")
    public String index(ModelMap map){
        map.addAttribute("author","zzp");
        map.addAttribute("url","http://www.google.com");
        map.addAttribute("title","blog");
        return "index";
    }

    @RequestMapping("/t")
    public ModelAndView index2(){

        List<LearnResource> learnList =new ArrayList<LearnResource>();

        ModelAndView modelAndView = new ModelAndView("/template");

        return modelAndView;
    }

    public String error() {
        return "hi,"+new Date()+",sorry,error!";
    }


    @RequestMapping(value = "/getComputer/{address}",method = RequestMethod.GET)
    public String getComputer(@PathVariable String address){
        return computerMapper.findByComputerName(address);
    }

}
