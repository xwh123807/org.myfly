package org.myfly.platform.core.visualpage;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.visualpage.builder.BaseTemplateBuilder;
import org.myfly.platform.core.visualpage.builder.MockTemplateBuilder;
import org.myfly.platform.core.visualpage.internal.TemplateBuilderFactory;
import org.myfly.platform.core.visualpage.service.VisualPageType;
import org.myfly.platform.core.visualpage.ui.ViewMode;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class TemplateBuilderFactoryTest extends ServiceTestCase {
	@Autowired
	private MockTemplateBuilder testTemplateBuilder;

	@Test
	public void getAllTemplates() {
		Map<String, BaseTemplateBuilder> map = TemplateBuilderFactory.getAllTemplates();
		Assert.assertNotNull(map);
		Assert.assertTrue(map.size() > 0);
	}

	@Test
	public void getTemplate() throws IOException {
		BaseTemplateBuilder testTemplateBuilder = TemplateBuilderFactory.getTemplate("test", VisualPageType.VIEW);
		Assert.assertNotNull(testTemplateBuilder);
	}

	//@Test
	public void getTemplateAndTestTemplateBuilderSuccess() throws IOException {
		Assert.assertNotNull(testTemplateBuilder);
		Assert.assertEquals("test-VIEW", testTemplateBuilder.getTemplateName());
		Assert.assertEquals("<h1>test</h1>", testTemplateBuilder.buildTemplateContent("suser", null, ViewMode.SUBPAGE));
		String templateFileName = FileUtils.getTempDirectoryPath() + testTemplateBuilder.getTemplateName();
		testTemplateBuilder.buildTemplateFile(templateFileName, "suser", null, ViewMode.SUBPAGE);
		String result = FileUtils.readFileToString(new File(templateFileName));
		Assert.assertEquals("<h1>test</h1>", result);
	}
}
