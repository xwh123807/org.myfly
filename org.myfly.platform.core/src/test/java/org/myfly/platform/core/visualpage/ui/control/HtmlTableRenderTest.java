package org.myfly.platform.core.visualpage.ui.control;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.visualpage.ui.control.HtmlCellRender;
import org.myfly.platform.core.visualpage.ui.control.HtmlRowRender;
import org.myfly.platform.core.visualpage.ui.control.HtmlTableRender;

public class HtmlTableRenderTest {
	@Test
	public void html(){
		HtmlTableRender render = new HtmlTableRender();
		List<HtmlRowRender> tbody = new ArrayList<>();
		HtmlRowRender row = new HtmlRowRender();
		List<HtmlCellRender> cells = new ArrayList<>();
		HtmlCellRender cell1 = new HtmlCellRender("col1");
		cells.add(cell1);
		HtmlCellRender cell2 = new HtmlCellRender("col2");
		cells.add(cell2);
		row.setCells(cells);
		tbody.add(row);
		render.setTbody(tbody);
		String html = render.html();
		//Assert.assertEquals("<table class=\"table responsive table-bordered table-striped table-hover\"  style='width:100%'><tbody><tr><td>col1</td><td>col2</td></tr></tbody></table>", html);
	}
	
	@Test
	public void htmlForExtAttrs(){
		HtmlTableRender render = new HtmlTableRender();
		//render.addExtAttr("style", "padding:0px");
		String html = render.html();
		//Assert.assertEquals("<table class=\"table responsive table-bordered table-striped table-hover\"  style='width:100%'></table>", html);
	}
}
