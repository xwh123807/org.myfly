package org.myfly.platform.core.spring;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.AlertLevel;

public class BaseEnumToStringConverterFactoryTest {
	@Test
	public void convert() {
		BaseEnumToStringConverterFactory factory = new BaseEnumToStringConverterFactory();
		String value = (String) factory.getConverter(String.class).convert(AlertLevel.INFO);
		Assert.assertEquals(AlertLevel.INFO.getTitle(), value);
		Assert.assertNull(factory.getConverter(String.class).convert(null));
	}
}
