package org.myfly.platform.core.visualpage.ui.control;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.visualpage.ui.control.HtmlCellRender;

public class HtmlCellRenderTest {
	@Test
	public void html(){
		HtmlCellRender render  = new HtmlCellRender("hello");
		String html = render.html();
		Assert.assertEquals("<td>hello</td>", html);
	}
	
	@Test
	public void htmlForHead(){
		HtmlCellRender render  = new HtmlCellRender("hello");
		render.setHeader(true);
		String html = render.html();
		Assert.assertEquals("<th>hello</th>", html);
	}
}
