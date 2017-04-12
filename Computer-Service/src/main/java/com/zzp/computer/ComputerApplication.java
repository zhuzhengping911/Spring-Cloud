package com.zzp.computer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhuzhengping on 2017/3/28.
 */

@SpringBootApplication
//@EnableEurekaClient
//@ComponentScans({
//        @ComponentScan("com.zzp.common.util"),
//        @ComponentScan("com.zzp.computer")
//})
public class ComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerApplication.class, args);
    }
}
