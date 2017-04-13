package com.zzp.computer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * Created by zhuzhengping on 2017/3/28.
 */

@SpringBootApplication
@EnableEurekaClient
@ComponentScans({
        @ComponentScan("com.zzp.common.util"),
        @ComponentScan("com.zzp.computer")
})
@MapperScan(basePackages = "com.zzp.**.dao")
public class ComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerApplication.class, args);
    }
}
