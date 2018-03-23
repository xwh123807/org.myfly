package org.myfly.platform.core.flydata.queue;

import org.myfly.platform.core.message.service.IMessageQueueService;
import org.myfly.platform.core.message.service.MessageQueueConstants;
import org.myfly.platform.core.search.service.ISearchService;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 索引队列
 * @author xiangwanhong
 *
 */
@Component
public class IndexQueueProcessor {
	
	/**
	 * 队列
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_INDEX)
	public Queue indexSyncQueue(){
		return new Queue(MessageQueueConstants.QUEUE_INDEX);
	}
	
	@Autowired
	private IMessageQueueService messageQueueService;
	
	@Autowired
	private ISearchService searchService;
	
	/**
	 * 
	 * @param operator
	 * @param entityName
	 * @param uid
	 */
	public void sendIndexData(EntityOperator operator, String entityName, String uid){
		EntityMessage message = new EntityMessage(operator, entityName, uid);
		messageQueueService.sendMessageToQueue(MessageQueueConstants.QUEUE_INDEX, message);
	}
	
	@RabbitListener(queues = MessageQueueConstants.QUEUE_INDEX)
	@RabbitHandler
	public void receiveIndexData(EntityMessage message){
		switch (message.getOperator()){
		case DELETE:
			searchService.deleteEntity(message.getEntityName(), message.getUid());
			break;
		case INSERT:
		case UPDATE:
			searchService.indexEntity(message.getEntityName(), message.getUid());
			break;
		}
	}
}
