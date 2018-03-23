package org.myfly.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {
	public static void main(String args[]) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ConfigServerApplication.class);
		builder.profiles("native").run(args);
	}
}
