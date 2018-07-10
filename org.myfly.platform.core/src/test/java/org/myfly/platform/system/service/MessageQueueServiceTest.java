package org.myfly.platform.system.service;

import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes=CoreApplication.class)
public class MessageQueueServiceTest extends ServiceTestCase{
	@Test
	public void test(){
		
	}
//	@Autowired
//	private IMessageQueueService messageQueueService;
//	
//	@Test
//	public void sendAccessLog(){
//		SAccessLog accessLog = new SAccessLog();
//		accessLog.setCreated(Calendar.getInstance().getTime());
//		accessLog.setUrl("http://localhost:9080");
//		messageQueueService.sendMessageToQueue(MessageQueueConstants.QUEUE_ACCESS_LOG, accessLog);
//	}
//	
//	@Test
//	public void getMessageQueueStatistics(){
//		Map<String, Object> result = messageQueueService.getMessageQueueStatistics(null);
//		Assert.assertNotNull(result);
//	}
//	
//	@Test
//	public void getMessageQueueStatisticsForAccessLogQueue(){
//		Map<String, Object> result = messageQueueService.getMessageQueueStatistics(MessageQueueConstants.QUEUE_ACCESS_LOG);
//		Assert.assertNotNull(result);
//	}
//	
//	@Test
//	public void getMessageQueueStatisticsForWildcard(){
//		Map<String, Object> result = messageQueueService.getMessageQueueStatistics("*");
//		Assert.assertNotNull(result);
//	}
//	
//	@Test
//	public void getMessageSubscriptionStatistics(){
//		Map<String, Object> result = messageQueueService.getMessageSubscriptionStatistics(null);
//		Assert.assertNotNull(result);
//	}
//	
//	@Test
//	public void getMessageSubscriptionStatisticsForAccessLogQueue(){
//		Map<String, Object> result = messageQueueService.getMessageSubscriptionStatistics(MessageQueueConstants.QUEUE_ACCESS_LOG);
//		Assert.assertNotNull(result);
//	}
//	
//	@Test
//	public void getMessageSubscriptionStatisticsForWildcard(){
//		Map<String, Object> result = messageQueueService.getMessageSubscriptionStatistics("*");
//		Assert.assertNotNull(result);
//	}
}
