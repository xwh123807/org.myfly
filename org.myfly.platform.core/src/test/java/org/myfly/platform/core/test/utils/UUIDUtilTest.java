package org.myfly.platform.core.test.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.UUIDUtil;

public class UUIDUtilTest {
	@Test
	public void uuid(){
		String uuid = UUIDUtil.newUUID();
		Assert.assertNotNull(uuid);
		System.out.println(uuid);
		Assert.assertEquals(32, uuid.length());
	}
}
