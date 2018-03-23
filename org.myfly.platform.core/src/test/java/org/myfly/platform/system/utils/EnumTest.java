package org.myfly.platform.system.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.springframework.web.bind.annotation.RequestMethod;


public class EnumTest {
	@Test
	public void requestMethod(){
		RequestMethod item = RequestMethod.GET;
		
		Assert.assertEquals(0, item.ordinal());
		Assert.assertEquals("GET", item.name());
	}
	
	@Test
	public void fieldDataType(){
		FieldDataType item = FieldDataType.NONE;
		
		Assert.assertEquals(0, item.ordinal());
		Assert.assertEquals("NONE", item.name());
		Assert.assertEquals("未指定", item.getTitle());
	}
}
