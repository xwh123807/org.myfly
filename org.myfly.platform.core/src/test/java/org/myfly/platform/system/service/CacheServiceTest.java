package org.myfly.platform.system.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.cache.service.CacheInfo;
import org.myfly.platform.core.cache.service.ICacheService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes=CoreApplication.class)
public class CacheServiceTest extends ServiceTestCase{
	@Autowired
	private ICacheService cacheService;
	
	@Test
	public void getCachesInfo(){
		List<CacheInfo> list = cacheService.getCachesInfo();
		Assert.assertNotNull(list);
	}

}
