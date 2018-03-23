package org.myfly.platform.system.service;

import javax.management.j2ee.statistics.Statistic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;
import org.myfly.platform.system.SystemApplication;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes=SystemApplication.class)
public class ActiveMQConnectionFactoryTest extends ServiceTestCase{
	@Autowired
	private ActiveMQConnectionFactory factory;
	
	@Test
	public void getStats(){
		for (Statistic stat : factory.getStats().getStatistics()){
			System.out.println(stat);
		}
	}
}
