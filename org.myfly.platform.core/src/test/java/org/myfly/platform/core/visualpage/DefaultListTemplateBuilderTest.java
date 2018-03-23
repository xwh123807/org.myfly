package org.myfly.platform.core.visualpage;

import java.io.File;

import javax.transaction.Transactional;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core.visualpage.builder.DefaultListTemplateBuilder;
import org.myfly.platform.core.visualpage.ui.ViewMode;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class DefaultListTemplateBuilderTest extends ServiceTestCase {
	@Autowired
	private DefaultListTemplateBuilder builder;

	@Test
	@Transactional
	public void buildTemplateFile() {
		String templateFile = FileUtils.getTempDirectoryPath() + UUIDUtil.newUUID();
		builder.buildTemplateFile(templateFile, "suser", null, ViewMode.PAGE);
		Assert.assertNotNull(templateFile);
		Assert.assertTrue(new File(templateFile).exists());
	}
}
