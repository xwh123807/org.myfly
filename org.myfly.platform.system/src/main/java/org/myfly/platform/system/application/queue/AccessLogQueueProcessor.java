package org.myfly.platform.system.application.queue;

import javax.transaction.Transactional;

import org.myfly.platform.core.flydata.service.IJpaAccessService;
import org.myfly.platform.core.message.service.MessageQueueConstants;
import org.myfly.platform.core.utils.UrlUtils;
import org.myfly.platform.system.domain.AccessLog;
import org.myfly.platform.system.domain.UserAction;
import org.myfly.platform.system.domain.UserBehavior;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * http访问日志消息队列处理器
 * 
 * @author xiangwanhong
 *
 */
@Component
public class AccessLogQueueProcessor {
	/**
	 * http访问日志消息队列
	 * 
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_ACCESS_LOG)
	public Queue accessLogQueue() {
		return new Queue(MessageQueueConstants.QUEUE_ACCESS_LOG);
	}

	@Autowired
	private IJpaAccessService jpaAccessService;

	@RabbitListener(queues = MessageQueueConstants.QUEUE_ACCESS_LOG)
	@RabbitHandler
	@Transactional
	public void receiveQueue(AccessLog accessLog) {
		accessLog.setUid(accessLog.getUid());
		accessLog.setUrl(UrlUtils.decodeUrl(accessLog.getUrl()));
		accessLog.setReferer(UrlUtils.decodeUrl(accessLog.getReferer()));
		jpaAccessService.saveEntity(accessLog);
		UserBehavior userBehavior = new UserBehavior();
		userBehavior.setUid(accessLog.getUid());
		userBehavior.setCreated(accessLog.getCreated());
		userBehavior.setCreatedBy(accessLog.getCreatedBy());
		userBehavior.setUrl(accessLog.getUrl());
		userBehavior.setReferer(accessLog.getReferer());
		userBehavior.setUserAction(UserAction.OPEN);
		jpaAccessService.saveEntity(userBehavior);
	}
}
