package org.myfly.platform.core.spring;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.DateUtil;

public class StringToDateConverterFactoryTest {
	@Test
	public void convert() {
		String dateStr = "2018-05-15";
		StringToDateConverterFactory factory = new StringToDateConverterFactory();
		Date value = factory.getConverter(Date.class).convert(dateStr);
		Assert.assertEquals(dateStr, DateUtil.toString(value));
		Assert.assertNull(factory.getConverter(Date.class).convert(null));
		Assert.assertNull(factory.getConverter(Date.class).convert(""));
	}
}
