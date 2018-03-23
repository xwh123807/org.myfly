package org.myfly.platform.system.application.queue;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.myfly.platform.system.core.service.MessageQueueConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AttachmentQueueConfig {
	/**
	 * 队列
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_ATTACHMENT_LOG)
	public Queue globalNameSyncQueue(){
		return new ActiveMQQueue(MessageQueueConstants.QUEUE_ATTACHMENT_LOG);
	}
}
