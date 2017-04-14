package com.zzp.feign;

import com.zzp.client.ComputerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/4/15.
 */
@RestController
public class ComputerFeign {

    @Autowired
    private ComputerClient computerClient;

    @RequestMapping(value = "/getComputer/{address}",method = RequestMethod.GET)
    public String getComputer(@PathVariable String address){
        return computerClient.getComputer(address);
    }
}
