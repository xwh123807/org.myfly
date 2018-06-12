package org.myfly.platform.core.spring;

import org.myfly.platform.core.utils.StringUtil;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class StringToBooleanConverterFactory implements ConverterFactory<String, Boolean> {

	@Override
	public <T extends Boolean> Converter<String, T> getConverter(Class<T> targetType) {
		return (Converter<String, T>) new StringToBooleanConverter();
	}

	private static final class StringToBooleanConverter implements Converter<String, Boolean> {

		@Override
		public Boolean convert(String source) {
			if (StringUtil.isEmpty(source))
				return false;
			if ("1".equals(source)) {
				return true;
			} else if ("0".equals(source)) {
				return false;
			} else {
				return Boolean.valueOf(source);
			}
		}

	}
}
