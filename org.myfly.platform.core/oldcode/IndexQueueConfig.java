package org.myfly.platform.system.application.queue;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.myfly.platform.system.core.service.MessageQueueConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IndexQueueConfig {
	/**
	 * 队列
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_INDEX)
	public Queue indexSyncQueue(){
		return new ActiveMQQueue(MessageQueueConstants.QUEUE_INDEX);
	}
}
