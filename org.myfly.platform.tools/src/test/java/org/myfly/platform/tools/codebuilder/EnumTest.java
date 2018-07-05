package org.myfly.platform.tools.codebuilder;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core3.domain.FlyDataType;

public class EnumTest {
	@Test
	public void enumTest() {
		Class cls = FlyDataType.class;
		System.out.println(cls);
	}

	@Test
	public void userDir() {
		String userDir = System.getProperty("user.dir");
		Assert.assertNotNull(userDir);
	}
	
	@Test
	public void classPath() {
		String pkg = "org.myfly.platform.core3.domain";
		String path = StringUtils.join(pkg.split("\\."), "/");
		Assert.assertEquals("org/myfly/platform/core3/domain", path);
		Assert.assertEquals(pkg.replaceAll("\\.", "/"), path);
	}
}
