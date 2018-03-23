package org.myfly.research.internal;

import java.util.UUID;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.myfly.research.domain.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AutoActiveMQMessageProcessor {
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("sample.queue");
	}
	
	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private AttachmentService service;
	
	@Autowired
	public void updateActiveMQConfig(ActiveMQConnectionFactory activeMQConnectionFactory){
		activeMQConnectionFactory.setWatchTopicAdvisories(true);
		activeMQConnectionFactory.setTrustAllPackages(true);
	}
	
	@Scheduled(fixedDelay=5000)
	public void autoSend(){
		Attachment entity = new Attachment();
		entity.setUid(UUID.randomUUID().toString());
		entity.setName("hello 你好 " + System.currentTimeMillis());
		jmsTemplate.convertAndSend(queue, entity);
	}
	
	@JmsListener(destination = "sample.queue")
	public void receiveMessage(Attachment entity){
		service.save(entity);
	}
}
