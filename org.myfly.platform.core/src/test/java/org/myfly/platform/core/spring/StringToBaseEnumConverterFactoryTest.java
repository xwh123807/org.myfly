package org.myfly.platform.core.spring;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.AlertLevel;

public class StringToBaseEnumConverterFactoryTest {
	@Test
	public void convert() {
		StringToBaseEnumConverterFactory factory = new StringToBaseEnumConverterFactory();
		AlertLevel value = factory.getConverter(AlertLevel.class).convert(AlertLevel.INFO.getTitle());
		Assert.assertEquals(AlertLevel.INFO, value);
		Assert.assertNull(factory.getConverter(AlertLevel.class).convert(null));
		Assert.assertNull(factory.getConverter(AlertLevel.class).convert(""));
	}
}
