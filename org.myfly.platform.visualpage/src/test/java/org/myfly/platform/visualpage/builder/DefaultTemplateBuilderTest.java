package org.myfly.platform.visualpage.builder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.core.utils.AppUtil;

public class DefaultTemplateBuilderTest {
	@Test
	public void allTemplate() {
		EntityMetaData metaData = AppUtil.getEntityMetaData(Master.class.getName());
		String entityName = metaData.getEntityName();
		//list
		metaData.getListDefinitions().values().stream().forEach(item -> {
			//list view mode
			DefaultListTemplateBuilder builder = new DefaultListTemplateBuilder();
			String content = builder.buildTemplateContent(entityName, item.getName(), ViewMode.DEFAULT_VIEW_MODE);
			Assert.assertNotNull(content);
			// list print mode
			DefaultPrintListTemplateBuilder printBuilder = new DefaultPrintListTemplateBuilder();
			content = printBuilder.buildTemplateContent(entityName, item.getName(), ViewMode.DEFAULT_VIEW_MODE);
			Assert.assertNotNull(content);
			// search mode
			DefaultSearchTemplateBuilder searchBuilder = new DefaultSearchTemplateBuilder();
			content = searchBuilder.buildTemplateContent(entityName, item.getName(), ViewMode.DEFAULT_VIEW_MODE);
			Assert.assertNotNull(content);
		});
		//form
		metaData.getFormDefinitions().values().stream().forEach(item -> {
			//form view mode
			DefaultViewTemplateBuilder viewBuilder = new DefaultViewTemplateBuilder();
			String content = viewBuilder.buildTemplateContent(entityName, item.getName(), ViewMode.DEFAULT_VIEW_MODE);
			Assert.assertNotNull(content);
			//form new mode
			DefaultNewTemplateBuilder newBuilder = new DefaultNewTemplateBuilder();
			content = newBuilder.buildTemplateContent(entityName, item.getName(), ViewMode.DEFAULT_VIEW_MODE);
			Assert.assertNotNull(content);
			//form edit mode
			DefaultEditTemplateBuilder editBuilder = new DefaultEditTemplateBuilder();
			content = editBuilder.buildTemplateContent(entityName, item.getName(), ViewMode.DEFAULT_VIEW_MODE);
			Assert.assertNotNull(content);
			//from print mode
			DefaultPrintTemplateBuilder printBuilder = new DefaultPrintTemplateBuilder();
			content = printBuilder.buildTemplateContent(entityName, item.getName(), ViewMode.DEFAULT_VIEW_MODE);
			Assert.assertNotNull(content);
		});
		//outline
		metaData.getOutlineDefinitions().values().stream().forEach(item -> {
			//form view mode
			DefaultOutlineTemplateBuilder viewBuilder = new DefaultOutlineTemplateBuilder();
			String content = viewBuilder.buildTemplateContent(entityName, item.getName(), ViewMode.DEFAULT_VIEW_MODE);
			Assert.assertNotNull(content);
		});
	}
}
