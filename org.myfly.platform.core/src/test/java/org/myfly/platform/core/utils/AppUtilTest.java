package org.myfly.platform.core.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes=CoreApplication.class)
public class AppUtilTest extends ServiceTestCase{
	@Test
	public void getApplicationConext(){
		Assert.assertNotNull(AppUtil.getApplicationConext());
	}
	
	@Test
	public void getJpaMetamodelMappingContext(){
		Assert.assertNotNull(AppUtil.getJpaMetamodelMappingContext());
	}
}
