package org.myfly.platform.core.spring;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.DateUtil;

public class StringToCalendarConverterFactoryTest {
	@Test
	public void convert() {
		String dateStr = "2018-05-15";
		StringToCalendarConverterFactory factory = new StringToCalendarConverterFactory();
		Calendar value = factory.getConverter(Calendar.class).convert(dateStr);
		Assert.assertEquals(dateStr, DateUtil.toString(value));
		Assert.assertNull(factory.getConverter(Calendar.class).convert(null));
	}
}
