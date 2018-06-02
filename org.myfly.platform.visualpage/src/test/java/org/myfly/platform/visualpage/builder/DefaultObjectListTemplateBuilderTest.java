package org.myfly.platform.visualpage.builder;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.annotation.ObjectListView;
import org.myfly.platform.core.metadata.internal.EntityViewInfo;

public class DefaultObjectListTemplateBuilderTest {

	@Test
	public void buildTemplateContent() {
		DefaultObjectListTemplateBuilder builder = new DefaultObjectListTemplateBuilder();
		String content = builder.buildTemplateContent(EntityViewInfo.class.getAnnotation(ObjectListView.class));
		Assert.assertNotNull(content);
	}
}
