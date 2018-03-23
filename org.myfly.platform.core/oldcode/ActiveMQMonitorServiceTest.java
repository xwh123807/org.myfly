package org.myfly.platform.system.activemq;

import java.util.List;

import org.junit.Test;
import org.springframework.util.Assert;

public class ActiveMQMonitorServiceTest {
	@Test
	public void getActiveMQStatisticsForLocalHost() throws Exception {
		ActiveMQMonitorService service = new ActiveMQMonitorService();
		List<DestinationInfo> list = service.getActiveMQStatistics();
		Assert.notNull(list);
	}
}
