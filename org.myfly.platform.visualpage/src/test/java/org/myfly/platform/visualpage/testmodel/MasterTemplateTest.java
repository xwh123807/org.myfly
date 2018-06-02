package org.myfly.platform.visualpage.testmodel;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.visualpage.builder.DefaultViewTemplateBuilder;


/**
 * 实体Master的模板
 * 
 * @author xiangwanhong
 *
 */
public class MasterTemplateTest {
	@Test
	public void master() {
		DefaultViewTemplateBuilder builder = new DefaultViewTemplateBuilder();
		String content = builder.buildTemplateContent(Master.class.getName(), EntityMetaDataConstants.DEFAULT_ALL_NAME,
				ViewMode.PAGE);
		Assert.assertNotNull(content);
	}
}
