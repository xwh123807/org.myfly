package org.myfly.platform.visualpage.ui.control;

import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.system.domain.Menu;
import org.myfly.platform.visualpage.ui.control.SideBarRender;

public class SideBarRenderTest {
	@Test
	public void render(){
		URL url = getClass().getResource("/config/coreMenuConfig.json");
		Menu[] menus = JSONUtil.fromJSON(url, Menu[].class);
		Assert.assertNotNull(menus);
		SideBarRender render = new SideBarRender(menus);
		String html = render.html();
		Assert.assertNotNull(html);
		System.out.println(html);
	}
}
