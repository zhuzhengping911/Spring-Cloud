package com.zzp.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by zhuzhengping on 2017/4/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zzp.feign.service")
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
