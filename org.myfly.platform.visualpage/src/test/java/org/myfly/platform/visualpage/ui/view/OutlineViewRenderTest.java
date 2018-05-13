package org.myfly.platform.visualpage.ui.view;

import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes=CoreApplication.class)
public class OutlineViewRenderTest extends ServiceTestCase{
	@Test
	public void empty(){
		
	}
	
//	@Test
//	public void outlineViewRenderForSUser(){
//		OutlineViewRender render = new OutlineViewRender(SUser.class.getName(), ViewType.VIEW);
//		String html = render.html();
//		Assert.assertNotNull(html);
//		System.out.println(html);
//	}
//	
//	@Test
//	public void outlineViewRenderForSUserAndOutlineViewIsNull(){
//		OutlineViewRender render = new OutlineViewRender(SUser.class.getName(), ViewType.VIEW);
//		String html = render.html();
//		Assert.assertNotNull(html);
//		System.out.println(html);
//	}
}
