package org.myfly.platform.core.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.test.ServiceTestCase;

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
