package org.myfly.platform.system.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.HtmlUtils;

public class HtmlUtilsTest {
	@Test
	public void addProperty(){
		String value = HtmlUtils.addProperty("name", "v1");
		Assert.assertEquals(" name='v1'", value);
	}
	
	@Test
	public void addPropertyForValueIsNull(){
		String value = HtmlUtils.addProperty("name", null);
		Assert.assertEquals("", value);
	}
	
	@Test
	public void addPropertyForValueIsEmpty(){
		String value = HtmlUtils.addProperty("name", "");
		Assert.assertEquals("", value);
	}
}
