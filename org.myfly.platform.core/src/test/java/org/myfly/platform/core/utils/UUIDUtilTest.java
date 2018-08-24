package org.myfly.platform.core.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.UUIDUtil;

public class UUIDUtilTest {
	@Test
	public void uuid32(){
		String uuid = UUIDUtil.newUUID32();
		Assert.assertNotNull(uuid);
		System.out.println(uuid);
		Assert.assertEquals(32, uuid.length());
	}
	
	@Test
	public void UUID() {
		String uuid = java.util.UUID.randomUUID().toString();
		Assert.assertEquals(36, uuid.length());
	}
	
	@Test
	public void uuid16(){
		String uuid = UUIDUtil.newUUID();
		Assert.assertNotNull(uuid);
		System.out.println(uuid);
		Assert.assertEquals(16, uuid.length());
	}
	
	@Test
	public void multiUUID() {
		
	}
}
