package org.myfly.platform.visualpage.internal;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.VisualPageApplication;
import org.myfly.platform.core.metadata.annotation.ObjectListView;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.internal.EntityViewInfo;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.visualpage.admin.AdminController;
import org.myfly.platform.visualpage.domain.TemplateBuilderInfo;
import org.myfly.platform.visualpage.service.IVisualPageService;
import org.myfly.platform.visualpage.service.VisualPageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = VisualPageApplication.class)
public class VisualPageServiceTest {
	@Autowired
	private IVisualPageService pageService;
	
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	@Test
	public void getAllEntitiesViewInfo() {
		List<EntityViewInfo> views = pageService.getAllEntitiesViewInfo();
		Assert.assertNotNull(views);
	}

	@Test
	public void getAllTemplateBuilder() {
		List<TemplateBuilderInfo> builders = pageService.getAllTemplateBuilder();
		Assert.assertNotNull(builders);
	}

	@Test
	public void getObjectTemplateFileForObjectClass() {
		String content = pageService.getObjectTemplateFile("entityviewinfos", EntityViewInfo.class,
				ObjectListView.class, VisualPageType.OLIST);
		Assert.assertNotNull(content);
	}

	@Test
	public void getObjectTemplateFileForObjectMethod() {
		String content = pageService.getObjectTemplateFile("metrics", AdminController.class, "metrics",
				ObjectListView.class, VisualPageType.OLIST);
		Assert.assertNotNull(content);
	}
	
	@Test
	public void fetchAllTemplates() {
		List<Class<?>> items = entityMetaDataService.getAllEntityClasses();
		for (Class<?> item : items) {
			EntityMetaData metaData = entityMetaDataService.getEntityMetaData(item.getName());
			String table = metaData.getEntityName();
			for (VisualPageType pageType : new VisualPageType[] { VisualPageType.LIST, VisualPageType.VIEW,
					VisualPageType.EDIT, VisualPageType.PRINT }) {
				String content = pageService.getEntityTemplateContent(table, pageType, null);
				Assert.assertNotNull(content);
			}
		}
	}
}
