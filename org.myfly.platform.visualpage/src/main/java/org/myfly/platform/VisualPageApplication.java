package org.myfly.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJms
@EnableCaching
@EnableScheduling
public class VisualPageApplication {
	public static void main(String args[]){
		SpringApplication app = new SpringApplication(VisualPageApplication.class);
		app.run(args);
	}
}
