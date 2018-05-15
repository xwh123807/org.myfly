package org.myfly.platform.core.test.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.FileUtil;

public class FileUtilTest {
	@Test
	public void getFileExtention() {
		String name = "stdtestemployee_2016-05-29 13-43-50.csv";
		String ext = FileUtil.getFileExtention(name);
		Assert.assertEquals("csv", ext);

		name = "/var/folders/7x/1b8n8n797zggx2j3wy8f7fg00000gn/T/40289f3b54f5b6ea0154fb0d364815b8/tenant_2016-05-29 13:47:07.pdf";
		Assert.assertEquals("pdf", FileUtil.getFileExtention(name));

		name = "/var/folders/7x/1b8n8n797zggx2j3wy8f7fg00000gn/T/40289f3b54f5b6ea0154fb0d364815b8/tenant_2016-05-29 13:47:07";
		Assert.assertEquals("", FileUtil.getFileExtention(name));

		name = "tenant_2016-05-29 13:47:07";
		Assert.assertEquals("", FileUtil.getFileExtention(name));

		name = "sdf.tenant_2016-05-29 13:47:07";
		Assert.assertEquals("tenant_2016-05-29 13:47:07", FileUtil.getFileExtention(name));
		
		name = "sdf.sdfs/tenant_2016-05-29 13:47:07";
		Assert.assertEquals("", FileUtil.getFileExtention(name));
	}
}
