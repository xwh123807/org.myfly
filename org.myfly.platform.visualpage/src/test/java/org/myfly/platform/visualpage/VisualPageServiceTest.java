package org.myfly.platform.visualpage;

import java.io.File;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.core.metadata.annotation.ObjectListView;
import org.myfly.platform.core.metadata.annotation.PropertyView;
import org.myfly.platform.core.metadata.internal.EntityViewInfo;
import org.myfly.platform.test.ServiceTestCase;
import org.myfly.platform.visualpage.domain.TemplateBuilderInfo;
import org.myfly.platform.visualpage.service.IVisualPageService;
import org.myfly.platform.visualpage.service.VisualPageConstants;
import org.myfly.platform.visualpage.service.VisualPageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class VisualPageServiceTest extends ServiceTestCase {

	@Autowired
	private IVisualPageService visualPageService;

	@Test
	public void getCurrentLayout() {
		String value = visualPageService.getCurrentLayout();
		Assert.assertEquals(VisualPageConstants.LAYOUT_DEFAULT_NAME, value);
	}

	@Test
	public void getDefaultLayout() {
		Assert.assertEquals(VisualPageConstants.LAYOUT_DEFAULT_NAME, visualPageService.getDefaultLayout());
	}

	@Test
	public void getViewNameWithLayout() {
		String viewName = "suser/list.vm";
		String value = visualPageService.getTemplateFile(viewName);
		Assert.assertEquals(VisualPageConstants.LAYOUT_DEFAULT_NAME + "/" + viewName, value);
	}

	@Test
	public void getTemplateNameWithLayout() {
		String template = "suser/list.vm";
		String value = visualPageService.getTemplateFile(template);
		Assert.assertEquals(VisualPageConstants.LAYOUT_DEFAULT_NAME + "/" + template, value);
	}

	@Test
	public void getWorkTemplatePath() {
		String path = visualPageService.getWorkTemplatePath();
		File file = new File(path);
		Assert.assertNotNull(file);
	}

	@Test
	@Transactional
	public void getVisualPageFileForStdTestTableListView() {
		String table = "suser";
		String value = visualPageService.getEntityTemplateFile(table, VisualPageType.LIST, "default", ViewMode.PAGE);
		Assert.assertNotNull(value);
		Assert.assertEquals(VisualPageConstants.LAYOUT_DEFAULT_NAME + "/" + table + "/default/list/page.vm", value);
	}

	@Test
	@Transactional
	public void getVisualPageFileForStdTestTableFormView() {
		String table = "suser";
		String value = visualPageService.getEntityTemplateFile(table, VisualPageType.VIEW, "default", ViewMode.PAGE);
		Assert.assertNotNull(value);
		Assert.assertEquals(VisualPageConstants.LAYOUT_DEFAULT_NAME + "/" + table + "/default/view/page.vm", value);
	}

	@Test
	@ObjectListView(title = "spring beans info", fields = { @PropertyView(name = "name", title = "名称"),
			@PropertyView(name = "desc", title = "描述") })
	public void getObjectVisualPageFileForBeanInfo() throws Exception {
		ObjectListView objectListView = VisualPageServiceTest.class.getMethod("getObjectVisualPageFileForBeanInfo")
				.getAnnotation(ObjectListView.class);
		Assert.assertNotNull(objectListView);
		String objectName = "spring.beans";
		String value = visualPageService.getObjectTemplateFile(objectName, objectListView, VisualPageType.OLIST);
		Assert.assertNotNull(value);
		Assert.assertEquals(VisualPageConstants.LAYOUT_DEFAULT_NAME + "/" + VisualPageConstants.CUSTOM_OBJECT_PATH
				+ objectName + "/olist.vm", value);
	}

	@Test
	public void getAllEntitiesViewInfo() {
		List<EntityViewInfo> views = visualPageService.getAllEntitiesViewInfo();
		Assert.assertNotNull(views);
	}

	@Test
	public void getObjectVisualPageFileForEntityViewInfo() throws Exception {
		String objectName = "admin.entityview";
		String value = visualPageService.getObjectTemplateFile(objectName, EntityViewInfo.class, ObjectListView.class,
				VisualPageType.OLIST);
		Assert.assertNotNull(value);
		Assert.assertEquals(VisualPageConstants.LAYOUT_DEFAULT_NAME + "/" + VisualPageConstants.CUSTOM_OBJECT_PATH
				+ objectName + "/olist.vm", value);
	}

	@Test
	@Transactional
	public void getTemplateContentForMTableAndListView() {
		String table = "suser";
		VisualPageType pageType = VisualPageType.LIST;
		String content = visualPageService.getEntityTemplateContent(table, pageType, null);
		Assert.assertNotNull(content);
	}
	
	@Test
	public void getAllTemplateBuilder(){
		List<TemplateBuilderInfo> list = visualPageService.getAllTemplateBuilder();
		Assert.assertTrue(list.size() > 0);
	}
}
