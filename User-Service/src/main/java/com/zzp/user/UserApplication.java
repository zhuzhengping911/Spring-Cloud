package com.zzp.user;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScans({
        @ComponentScan("com.zzp.common.util"),
        @ComponentScan("com.zzp.user")
})
@EnableHystrix
@EnableHystrixDashboard
@RestController
@EnableFeignClients
@MapperScan("com.zzp.user.**.dao")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String index() {
//        return "login";
        return "this is user";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
//        return "login";
//        return new Date() + "";
        return restTemplate.getForObject("http://localhost:1113/computer",String.class);
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
