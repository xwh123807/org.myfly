package org.org.myfly.apps.skymonitor;

import org.org.myfly.apps.skymonitor.internal.ConfigProperties;
import org.org.myfly.apps.skymonitor.internal.IAccessLogProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class App implements CommandLineRunner{
	@Autowired
	private IAccessLogProcessor processor;
	
	@Autowired
	private ConfigProperties configProperties;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		processor.importAccessLogs(configProperties.getPath(), configProperties.getThreads());
	}
}
