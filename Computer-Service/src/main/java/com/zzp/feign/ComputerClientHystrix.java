package com.zzp.feign;

import com.zzp.computer.client.ComputerClient;
import org.springframework.stereotype.Component;

/**
 * Created by zhuzhengping on 2017/4/15.
 */
@Component
public class ComputerClientHystrix implements ComputerClient {
    @Override
    public String getComputer(String address) {
        return "result is fail!!!";
    }
}
