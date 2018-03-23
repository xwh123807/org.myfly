package org.myfly.research.internal;

import java.util.UUID;

import org.myfly.research.domain.Attachment;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "foo")
public class AutoRabbitMessageProcessor {
	@Bean
	public Queue fooQueue() {
		return new Queue("foo");
	}
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private AttachmentService service;

	@Scheduled(fixedDelay = 1000L)
	public void send() {
		Attachment entity = new Attachment();
		entity.setUid(UUID.randomUUID().toString());
		entity.setName("hello 你好 " + System.currentTimeMillis());
		this.rabbitTemplate.convertAndSend("foo", entity);
	}
	
	@RabbitHandler
	public void process(@Payload Attachment entity) {
		service.save(entity);
	}
}
