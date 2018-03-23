package org.myfly.cloud.simpleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SimpleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
