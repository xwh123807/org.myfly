package org.myfly.platform.metadata.service;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.system.utils.UUIDUtil;

public class URLTest {
	@Test
	public void url() throws MalformedURLException{
		String path = FileUtils.getTempDirectoryPath() + UUIDUtil.newUUID() + File.separatorChar + "a.json";
		URL url = new URL("file:" + path);
		Assert.assertNotNull(url);
	}
}
