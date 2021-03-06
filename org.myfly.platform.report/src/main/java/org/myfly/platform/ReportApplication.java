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
public class ReportApplication {
	public static void main(String args[]){
		SpringApplication app = new SpringApplication(ReportApplication.class);
		app.run(args);
	}
}
