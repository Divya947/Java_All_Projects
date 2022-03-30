package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan("com.simplilearn.demo")

public class EdgeServerAndRoutingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServerAndRoutingDemoApplication.class, args);
	}

}
