package com.zzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhuzhengping on 2017/3/28.
 */

@SpringBootApplication
@EnableEurekaClient
public class ComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerApplication.class, args);
    }
}
