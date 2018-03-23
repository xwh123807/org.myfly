package org.myfly.platform.system.application.queue;

import javax.transaction.Transactional;

import org.myfly.platform.core.context.UserContext;
import org.myfly.platform.core.message.service.IMessageQueueService;
import org.myfly.platform.core.message.service.MessageQueueConstants;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.system.domain.Attachment;
import org.myfly.platform.system.domain.ExportLog;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ExportQueueProcessor {
	/**
	 * 队列
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_EXPORT_LOG)
	public Queue globalNameSyncQueue(){
		return new Queue(MessageQueueConstants.QUEUE_EXPORT_LOG);
	}

	@Autowired
	private IMessageQueueService messageQueueService;
	
	@Autowired
	private AttachmentQueueProcessor attachmentQueueProcessor;

	@RabbitListener(queues = MessageQueueConstants.QUEUE_EXPORT_LOG)
	@RabbitHandler
	@Transactional
	public void receiveExportLogData(ExportLog message) {
		//保存导出日志
		String uid = AppUtil.getFlyDataAccessService(ExportLog.class.getName()).saveEntity(message);
		//发送附件保存消息队列
		Attachment attachment = new Attachment();
		attachment.setName(message.getName());
		attachment.setParentId(uid);
		attachment.setCreated(message.getCreated());
		attachment.setCreatedBy(message.getCreatedBy());
		attachment.setTenant(message.getTenant());
		attachmentQueueProcessor.sendAttachmentDataToQueue(attachment);
	}

	/**
	 * 发送记录导出日志消息
	 * @param url
	 * @param file
	 */
	public void sendExportLogDataToQueue(final String url, final String fileName) {
		ExportLog entity = new ExportLog();
		entity.setUrl(url);
		entity.setCreated(DateUtil.nowSqlTimestamp());
		entity.setName(fileName);
		entity.setCreatedBy(UserContext.getUserSession().getUser());
		entity.setTenant(UserContext.getUserSession().getTenant());
		messageQueueService.sendMessageToQueue(MessageQueueConstants.QUEUE_EXPORT_LOG, entity);
	}
}
