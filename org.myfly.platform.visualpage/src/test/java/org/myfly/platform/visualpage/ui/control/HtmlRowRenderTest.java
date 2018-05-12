package org.myfly.platform.visualpage.ui.control;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.visualpage.ui.control.HtmlCellRender;
import org.myfly.platform.visualpage.ui.control.HtmlRowRender;

public class HtmlRowRenderTest {
	@Test
	public void html() {
		HtmlRowRender render = new HtmlRowRender();
		List<HtmlCellRender> cells = new ArrayList<>();
		HtmlCellRender cell1 = new HtmlCellRender("col1");
		cells.add(cell1);
		HtmlCellRender cell2 = new HtmlCellRender("col2");
		cells.add(cell2);
		render.setCells(cells);
		String html = render.html();
		Assert.assertEquals("<tr><td>col1</td><td>col2</td></tr>", html);
	}
}
