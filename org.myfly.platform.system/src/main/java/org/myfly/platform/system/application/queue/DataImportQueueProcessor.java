package org.myfly.platform.system.application.queue;

import java.sql.Timestamp;

import org.myfly.platform.core.domain.DataImportInfo;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.message.service.IMessageQueueService;
import org.myfly.platform.core.message.service.MessageQueueConstants;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.domain.Attachment;
import org.myfly.platform.system.domain.DataImportLog;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataImportQueueProcessor {
	@Autowired
	private IJpaDataAccessService jpaDataAccessService;
	
	@Autowired
	private IMessageQueueService messageQueueService;
	
	@Bean(name = MessageQueueConstants.QUEUE_DATAIMPORT_LOG)
	public Queue dataImportQueue(){
		return new Queue(MessageQueueConstants.QUEUE_DATAIMPORT_LOG);
	}
	
	@RabbitListener(queues = MessageQueueConstants.QUEUE_DATAIMPORT_LOG)
	@RabbitHandler
	public void receiveIndexData(DataImportInfo importInfo){
		DataImportLog entity = dataImportInfoToEntity(importInfo);
		jpaDataAccessService.saveEntity(entity);
		
		Attachment attachment = new Attachment();
		attachment.setParentId(entity.getUid());
		attachment.setName(entity.getImportFile());
		attachment.setCreated(entity.getCreated());
		messageQueueService.sendMessageToQueue(MessageQueueConstants.QUEUE_ATTACHMENT_LOG, attachment);
	}

	private DataImportLog dataImportInfoToEntity(DataImportInfo importInfo) {
		DataImportLog entity = new DataImportLog();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName(importInfo.getTitle());
		entity.setActionUrl(importInfo.getActionUrl());
		entity.setCreated(new Timestamp(importInfo.getCreated().getTime()));
		entity.setGroupUid(importInfo.getGroupUid());
		entity.setTotalCount(importInfo.getTotalCount());
		entity.setSuccessCount(importInfo.getSuccessCount());
		entity.setImportFile(importInfo.getImportFile());
		entity.setFaultCount(importInfo.getFaultCount());
		entity.setState(importInfo.getState());
		return entity;
	}
}
