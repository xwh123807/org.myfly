package org.myfly.platform.metadata.service;

import org.junit.Test;
import org.myfly.MetaDataApplication;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cache.CacheManager;


@SpringApplicationConfiguration(classes=MetaDataApplication.class)
public class HibernateCacheTest extends ServiceTestCase{
	@Autowired
	@Qualifier("cacheManager")
	private CacheManager ehCacheCacheManager;
	
	@Test
	public void allCacheNames(){
		for (String name : ehCacheCacheManager.getCacheNames()){
			System.out.println(name);
		}
	}
}
