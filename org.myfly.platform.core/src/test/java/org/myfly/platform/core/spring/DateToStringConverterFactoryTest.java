package org.myfly.platform.core.spring;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.DateUtil;

public class DateToStringConverterFactoryTest {
	@Test
	public void convert() {
		Calendar now = Calendar.getInstance();
		DateToStringConverterFactory factory = new DateToStringConverterFactory();
		String value = factory.getConverter(String.class).convert(now.getTime());
		Assert.assertEquals(DateUtil.toString(now), value);
		Assert.assertNull(factory.getConverter(String.class).convert(null));
	}
}
