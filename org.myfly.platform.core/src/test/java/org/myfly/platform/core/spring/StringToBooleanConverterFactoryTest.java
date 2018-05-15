package org.myfly.platform.core.spring;

import org.junit.Assert;
import org.junit.Test;

public class StringToBooleanConverterFactoryTest {
	@Test
	public void convert() {
		StringToBooleanConverterFactory factory = new StringToBooleanConverterFactory();
		Boolean value = factory.getConverter(Boolean.class).convert("true");
		Assert.assertEquals(true, value);
		Assert.assertFalse(factory.getConverter(Boolean.class).convert("false"));
		Assert.assertFalse(factory.getConverter(Boolean.class).convert("falsesdsd"));
	}
}
