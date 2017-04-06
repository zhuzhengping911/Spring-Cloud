package com.zzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@RestController
@SpringBootApplication
public class SpringcloudApplication {

	@RequestMapping(value = "/")
	public String location(){
		return "ShangHai-eureka service";

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
//		new SpringApplicationBuilder(SpringcloudApplication.class).web(true).run(args);
	}

}
