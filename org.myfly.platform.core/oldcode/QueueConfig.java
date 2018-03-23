package org.myfly.platform.system.application.queue;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.myfly.platform.system.core.service.MessageQueueConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
	/**
	 * http访问日志消息队列
	 * 
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_ACCESS_LOG)
	public Queue accessLogQueue() {
		return new ActiveMQQueue(MessageQueueConstants.QUEUE_ACCESS_LOG);
	}
	
	/**
	 * 系统监控数据消息队列
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_SYSTEM_METRICS)
	public Queue systemMetricsQueue(){
		return new ActiveMQQueue(MessageQueueConstants.QUEUE_SYSTEM_METRICS);
	}
	
	/**
	 * GlobalName数据同步队列
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_GLOBAL_NAME)
	public Queue globalNameSyncQueue(){
		return new ActiveMQQueue(MessageQueueConstants.QUEUE_GLOBAL_NAME);
	}
	
	
	/*
	@Bean
	public BrokerService brokerService(){
		BrokerService broker = new BrokerService();
		try {
			broker.setPersistenceAdapter(new MemoryPersistenceAdapter());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return broker;
	}
	*/
}
