package org.myfly.platform.system.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.visualpage.domain.VisualPageType;
import org.myfly.platform.core.visualpage.service.IVisualPageService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class AllEntityTemplateTest extends ServiceTestCase {
	@Autowired
	private IVisualPageService visualPageService;
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	@Test
	public void fetchAllTemplates() {
		List<Class<?>> items = entityMetaDataService.getAllEntityClasses();
		for (Class<?> item : items) {
			EntityMetaData metaData = entityMetaDataService.getEntityMetaData(item.getName());
			String table = metaData.getEntityName();
			for (VisualPageType pageType : new VisualPageType[] { VisualPageType.LIST, VisualPageType.VIEW,
					VisualPageType.EDIT, VisualPageType.PRINT }) {
				String content = visualPageService.getEntityTemplateContent(table, pageType, null);
				Assert.assertNotNull(content);
			}
		}
	}
	
	@Test
	public void templateForSSoftApp(){
		String table = "SoftApp";
		String content = visualPageService.getEntityTemplateContent(table, VisualPageType.VIEW, null);
		Assert.assertNotNull(content);
	}
	
	@Test
	public void templateForOrderLine(){
		String table = "SUser";
		String content = visualPageService.getEntityTemplateContent(table, VisualPageType.LIST, null);
		Assert.assertNotNull(content);
	}
}
