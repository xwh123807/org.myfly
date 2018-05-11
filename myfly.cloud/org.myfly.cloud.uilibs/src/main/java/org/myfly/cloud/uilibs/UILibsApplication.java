package org.myfly.cloud.uilibs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UILibsApplication {
	public static void main(String args[]) {
		SpringApplication.run(UILibsApplication.class, args);
	}
}
