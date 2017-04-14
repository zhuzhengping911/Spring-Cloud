package com.zzp.client;

import com.zzp.feign.ComputerClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhuzhengping on 2017/4/15.
 */
@FeignClient(value = "computer-service",fallback = ComputerClientHystrix.class)
public interface ComputerClient {

    @RequestMapping(value = "/getComputer/{address}",method = RequestMethod.POST)
    String getComputer(@PathVariable("address") String address);
}
