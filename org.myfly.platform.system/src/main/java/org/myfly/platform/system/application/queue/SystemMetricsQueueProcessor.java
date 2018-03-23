package org.myfly.platform.system.application.queue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.myfly.platform.core.admin.config.AdminProperties;
import org.myfly.platform.core.message.service.IMessageQueueService;
import org.myfly.platform.core.message.service.MessageQueueConstants;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.domain.SystemMetrics;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.MetricsEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 系统监控数据消息队列处理器
 * @author xiangwanhong
 *
 */
@Component
public class SystemMetricsQueueProcessor {
	/**
	 * 系统监控数据消息队列
	 * @return
	 */
	@Bean(name = MessageQueueConstants.QUEUE_SYSTEM_METRICS)
	public Queue systemMetricsQueue(){
		return new Queue(MessageQueueConstants.QUEUE_SYSTEM_METRICS);
	}
	
	@Autowired
	private MetricsEndpoint metricsEndpoint;
	@Autowired
	private IMessageQueueService messageQueueService;
	@Autowired
	private AdminProperties adminConfigProperties;
	
	/**
	 * 发送系统监控数据到消息队列
	 * TODO 如何实现没有启用时，调度也不会触发
	 */
	@Scheduled(fixedRate=60000)
	public void autoSendSystemMetricsData(){
		if (!adminConfigProperties.isEnableMetrics())
			return;
		Map<String, Object> datas = metricsEndpoint.invoke();
		List<SystemMetrics> list = new ArrayList<>();
		Date now = Calendar.getInstance().getTime();
		for (Map.Entry<String, Object> item : datas.entrySet()){
			SystemMetrics metrics = new SystemMetrics();
			metrics.setUid(UUIDUtil.newUUID());
			metrics.setCreated(now);
			metrics.setName(item.getKey());
			metrics.setValue(item.getValue().toString());
			list.add(metrics);
		}
		messageQueueService.sendMessageToQueue(MessageQueueConstants.QUEUE_SYSTEM_METRICS, list);
	}
	
	/**
	 * 接收系统监控数据
	 * @param systemMetrics
	 */
	@RabbitListener(queues = MessageQueueConstants.QUEUE_ACCESS_LOG)
	@RabbitHandler
	@Transactional
	public void receiveSystemMetricsData(List<SystemMetrics> systemMetrics){
		AppUtil.getJpaFlyDataAccessService().saveEntity(systemMetrics);
	}
}
