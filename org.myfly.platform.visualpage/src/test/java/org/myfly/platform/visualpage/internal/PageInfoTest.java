package org.myfly.platform.visualpage.internal;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.visualpage.domain.PageInfo;

public class PageInfoTest {
	@Test
	public void base(){
		PageInfo page = new PageInfo("titile", "template", new String[]{"/a.js"});
		Assert.assertEquals("titile", page.getTitle());
		Assert.assertEquals("template", page.getTemplate());
		Assert.assertArrayEquals(new String[]{"/a.js"}, page.getScripts());
	}
}
