package org.myfly.platform.core.visualpage.ui.view;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.visualpage.ui.view.ListViewRender;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes=CoreApplication.class)
public class ListViewRenderTest extends ServiceTestCase{
	@Test
	public void renderForStdTestTable(){
		ListViewRender render = new ListViewRender("Tenant");
		String html = render.html();
		Assert.assertNotNull(html);
	}
	
	@Test
	public void renderForSUser(){
		ListViewRender render = new ListViewRender("SUser");
		String html = render.html();
		Assert.assertNotNull(html);
	}
	
}
