package org.myfly.platform.visualpage.builder;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.testmodel.Master;

public class DefaultListTemplateBuilderTest {
	@Test
	public void buildTemplateContent() {
		DefaultListTemplateBuilder builder = new DefaultListTemplateBuilder();
		String content = builder.buildTemplateContent(Master.class.getName(), EntityMetaDataConstants.DEFAULT_ALL_NAME,
				ViewMode.DEFAULT_VIEW_MODE);
		Assert.assertNotNull(content);
	}
}
