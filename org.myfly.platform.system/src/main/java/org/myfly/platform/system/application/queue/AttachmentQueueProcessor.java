package org.myfly.platform.system.application.queue;

import java.io.File;

import javax.transaction.Transactional;

import org.apache.commons.io.FileUtils;
import org.myfly.platform.core.context.UserContext;
import org.myfly.platform.core.message.service.IMessageQueueService;
import org.myfly.platform.core.message.service.MessageQueueConstants;
import org.myfly.platform.core.search.service.ISearchService;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.FileUtil;
import org.myfly.platform.system.domain.Attachment;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * 附件消息队列处理程序
 * 
 * @author xiangwanhong
 *
 */

@Component
public class AttachmentQueueProcessor {
	/**
	 * 队列
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_ATTACHMENT_LOG)
	public Queue globalNameSyncQueue(){
		return new Queue(MessageQueueConstants.QUEUE_ATTACHMENT_LOG);
	}
	
	@Autowired
	private IMessageQueueService messageQueueService;
	
	@Autowired
	private ISearchService searchService;

	@RabbitListener(queues = MessageQueueConstants.QUEUE_ATTACHMENT_LOG)
	@RabbitHandler
	@Transactional
	public void receiveAttachmentData(Attachment attachment) {
		String fileName = attachment.getName();
		try {
			File file = new File(fileName);
			attachment.setName(file.getName());
			attachment.setContentType(FileUtil.getFileExtention(attachment.getName()));
			byte[] body = FileUtils.readFileToByteArray(file);
			attachment.setBody(body);
			attachment.setBodyLength(body.length);
		} catch (Exception e) {
			e.printStackTrace();
			// 如果文件读取失败，tag字段存放错误信息
			attachment.setTags(e.getMessage());
		}
		AppUtil.getFlyDataAccessService(Attachment.class.getName()).saveEntity(attachment);
		
		//对附件建立全文索引
		searchService.indexAttachments(fileName);
	}

	/**
	 * 发送附件保存消息
	 * 
	 * @param parentId
	 *            父对象id
	 * @param fileName
	 *            附件完整路径
	 */
	public void sendAttachmentDataToQueue(String parentId, String fileName) {
		Assert.hasLength(fileName);
		Attachment entity = new Attachment();
		entity.setName(fileName);
		entity.setParentId(parentId);
		if (entity.getCreated() == null) {
			entity.setCreated(DateUtil.nowSqlTimestamp());
		}
		if (entity.getCreatedBy() == null) {
			entity.setCreatedBy(UserContext.getUserSession().getUser());
		}
		if (entity.getTenant() == null) {
			entity.setTenant(UserContext.getUserSession().getTenant());
		}
		messageQueueService.sendMessageToQueue(MessageQueueConstants.QUEUE_ATTACHMENT_LOG, entity);
	}
	
	/**
	 * 发送附件保存消息
	 * @param message
	 */
	public void sendAttachmentDataToQueue(Attachment message) {
		Assert.notNull(message);
		Assert.hasLength(message.getName(), "name字段不能为空，需要传递文件全路径.");
		if (message.getCreated() == null) {
			message.setCreated(DateUtil.nowSqlTimestamp());
		}
		if (message.getCreatedBy() == null) {
			message.setCreatedBy(UserContext.getUserSession().getUser());
		}
		if (message.getTenant() == null) {
			message.setTenant(UserContext.getUserSession().getTenant());
		}
		messageQueueService.sendMessageToQueue(MessageQueueConstants.QUEUE_ATTACHMENT_LOG, message);
	}
}
