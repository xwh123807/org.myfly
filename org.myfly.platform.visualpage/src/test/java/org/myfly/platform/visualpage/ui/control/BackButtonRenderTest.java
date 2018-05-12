package org.myfly.platform.visualpage.ui.control;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.visualpage.ui.control.button.BackButtonRender;

public class BackButtonRenderTest {
	@Test
	public void render(){
		BackButtonRender render = new BackButtonRender();
		String html = render.html();
		Assert.assertTrue(html.contains("返回"));
		Assert.assertTrue(html.contains("javascript:autoback()"));
	}
}
