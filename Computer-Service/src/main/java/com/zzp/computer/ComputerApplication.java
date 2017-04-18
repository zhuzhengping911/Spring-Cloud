package com.zzp.computer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.RestController;

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
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@RestController
public class ComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerApplication.class, args);
    }

//    @Value("${server.port}")
//    String port;
//    @RequestMapping("/hi")
//    @HystrixCommand(fallbackMethod = "hiError")
//    public String home(@RequestParam String name) {
//        return "hi "+name+",i am from port:" +port;
//    }
//
//    public String hiError(String name) {
//        return "hi,"+name+",sorry,error!";
//    }
}
