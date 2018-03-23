package org.org.myfly.apps.skymonitor.internal;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Assert;
import org.junit.Test;
import org.org.myfly.apps.skymonitor.domain.AccessLog;

public class AccessLogProcessorTest {
	private AccessLogProcessor processor = new AccessLogProcessor();
	
	public AccessLogProcessorTest() {
		processor.setConfig(new ConfigProperties());
	}
	
	@Test
	public void readAccessLogFile() throws IOException{
		File file = new File("/Users/xiangwanhong/logs/access_log.1465111085");
		List<AccessLog> lines = processor.readAccessLog(file);
		lines.forEach(new Consumer<AccessLog>() {

			@Override
			public void accept(AccessLog entity) {
				System.out.println(entity);
			}
		});
	}
	
	@Test
	public void lineToObject(){
		String line = "123.139.75.37|-|-|05/Jun/2016:10:14:14 +0800|GET|/grm/core.workflow.engine/scripts/components/com.ygsoft.ecp.workflow.rollbackAudit.js?_v=1464796779178|HTTP/1.1|304|-|1263|http://ygfs.ygsoft.com:9080/grm/reimburse/portal/index.html?|Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.66 Safari/537.36|748|204";
		AccessLog entity = processor.logLineToObject(line);
		Assert.assertNotNull(entity);
		Assert.assertEquals("/grm/core.workflow.engine/scripts/components/com.ygsoft.ecp.workflow.rollbackAudit.js?_v=1464796779178", entity.getUrl());
	}
	
	@Test
	public void importAccessLogs(){
		processor.importAccessLogs("/Users/xiangwanhong/logs");
	}
}
