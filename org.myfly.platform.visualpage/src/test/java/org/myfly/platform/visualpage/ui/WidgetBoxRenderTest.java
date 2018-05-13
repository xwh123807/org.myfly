package org.myfly.platform.visualpage.ui;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.ViewType;

public class WidgetBoxRenderTest {
	@Test
	public void html(){
		String title = "基本信息";
		WidgetBoxRender render = new WidgetBoxRender(title, ViewType.VIEW);
		String content = "<h1>hello</h1>";
		render.setContent(content);
		String html = render.html();
		Assert.assertTrue(html.contains(title));
		Assert.assertTrue(html.contains(content));
	}
}
