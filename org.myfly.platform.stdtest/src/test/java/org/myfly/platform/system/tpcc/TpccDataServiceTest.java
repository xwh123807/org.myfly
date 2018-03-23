package org.myfly.platform.system.tpcc;

import org.junit.Test;
import org.myfly.platform.SystemApplication;
import org.myfly.platform.system.tpcc.service.ITpccDataService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes=SystemApplication.class)
public class TpccDataServiceTest extends ServiceTestCase{
	@Autowired
	private ITpccDataService tpccDataService;
	
	@Test
	public void buildTpccDatas(){
		tpccDataService.generateDimensionDatas(10);
		tpccDataService.generateOrderDatas(10);
	}
	
}
