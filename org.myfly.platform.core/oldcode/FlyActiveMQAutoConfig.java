package org.myfly.platform.system.activemq;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FlyActiveMQAutoConfig {
	
	@Autowired
	public void updateActiveMQConfig(ActiveMQConnectionFactory activeMQConnectionFactory){
		activeMQConnectionFactory.setWatchTopicAdvisories(true);
		activeMQConnectionFactory.setTrustAllPackages(true);
	}
}
