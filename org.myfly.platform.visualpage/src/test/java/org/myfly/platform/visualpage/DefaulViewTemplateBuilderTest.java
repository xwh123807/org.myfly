package org.myfly.platform.visualpage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.metamodel.domain.ViewMode;
import org.myfly.platform.metamodel.utils.UUIDUtil;
import org.myfly.platform.test.ServiceTestCase;
import org.myfly.platform.visualpage.builder.DefaultViewTemplateBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaulViewTemplateBuilderTest extends ServiceTestCase {
	@Autowired
	private DefaultViewTemplateBuilder builder;

	@Test
	public void buildTemplateFile() {
		String templateFile = FileUtils.getTempDirectoryPath() + UUIDUtil.newUUID();
		builder.buildTemplateFile(templateFile, "suser", null, ViewMode.PAGE);
		Assert.assertNotNull(templateFile);
		Assert.assertTrue(new File(templateFile).exists());
	}
}
