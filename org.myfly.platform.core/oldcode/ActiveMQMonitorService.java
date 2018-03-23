package org.myfly.platform.system.activemq;

import java.util.ArrayList;
import java.util.List;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.jmx.BrokerViewMBean;
import org.apache.activemq.broker.jmx.DestinationViewMBean;
import org.apache.activemq.broker.jmx.QueueViewMBean;
import org.apache.activemq.broker.jmx.TopicViewMBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.system.utils.JmxUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActiveMQMonitorService {
	private static Log log = LogFactory.getLog(ActiveMQMonitorService.class);

	@Autowired
	private ActiveMQConnectionFactory activeMQConnectionFactory;

	private String getServiceUrl() {
		return "service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi";
	}

	public MBeanServerConnection getMBServer(String serviceUrl) throws Exception {
		JMXServiceURL url = new JMXServiceURL(serviceUrl);
		JMXConnector jmxc = JMXConnectorFactory.connect(url, null);
		return jmxc.getMBeanServerConnection();
	}

	public String getBrokerName() {
		return "localhost";
	}

	public List<DestinationInfo> getActiveMQStatistics() throws Exception {
		MBeanServerConnection mbServer = getMBServer(getServiceUrl());
		ObjectName mbeanName = new ObjectName("org.apache.activemq:type=Broker,brokerName=" + getBrokerName());

		BrokerViewMBean brokerView = JmxUtil.getManagedObject(mbServer, mbeanName);
		List<DestinationInfo> list = new ArrayList<>();
		list.add(getTotalInfo(brokerView));
		List<QueueViewMBean> queues = (List<QueueViewMBean>) JmxUtil.getManagedObjects(mbServer, brokerView.getQueues(),
				QueueViewMBean.class);
		list.addAll(getQueueInfos(queues));
		List<TopicViewMBean> topics = (List<TopicViewMBean>) JmxUtil.getManagedObjects(mbServer, brokerView.getTopics(),
				TopicViewMBean.class);
		list.addAll(getTopicInfos(topics));
		return list;
	}

	public DestinationInfo getTotalInfo(BrokerViewMBean broker) {
		DestinationInfo info = new DestinationInfo();
		info.setType(DestinationType.TOTAL);
		info.setName(broker.getBrokerName());
		info.setConsumerCount(broker.getTotalConsumerCount());
		info.setDequeueCount(broker.getTotalDequeueCount());
		info.setEnqueueCount(broker.getTotalEnqueueCount());
		info.setProducerCount(broker.getTotalProducerCount());
		return info;
	}

	public List<DestinationInfo> getQueueInfos(List<QueueViewMBean> queues) {
		List<DestinationInfo> list = new ArrayList<>();
		for (DestinationViewMBean queue : queues) {
			DestinationInfo info = getQueueInfo(queue);
			info.setType(DestinationType.QUEUE);
			list.add(info);
		}
		return list;
	}

	public List<DestinationInfo> getTopicInfos(List<TopicViewMBean> queues) {
		List<DestinationInfo> list = new ArrayList<>();
		for (DestinationViewMBean queue : queues) {
			DestinationInfo info = getQueueInfo(queue);
			info.setType(DestinationType.TOPIC);
			list.add(info);
		}
		return list;
	}

	public DestinationInfo getQueueInfo(DestinationViewMBean viewBean) {
		DestinationInfo info = new DestinationInfo();
		info.setName(viewBean.getName());
		info.setConsumerCount(viewBean.getConsumerCount());
		info.setDequeueCount(viewBean.getDequeueCount());
		info.setDispatchCount(viewBean.getDispatchCount());
		info.setEnqueueCount(viewBean.getEnqueueCount());
		info.setExpiredCount(viewBean.getExpiredCount());
		info.setForwardCount(viewBean.getForwardCount());
		info.setInFlightCount(viewBean.getInFlightCount());
		info.setProducerCount(viewBean.getProducerCount());
		info.setQueueSize(viewBean.getQueueSize());
		info.setStoreMessageSize(viewBean.getStoreMessageSize());
		return info;
	}
}
