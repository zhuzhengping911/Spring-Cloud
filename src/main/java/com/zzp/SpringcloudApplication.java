package com.zzp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringcloudApplication.class, args);
		new SpringApplicationBuilder(SpringcloudApplication.class).web(true).run(args);
	}

}
