package org.myfly.platform.core.spring;

import org.myfly.platform.core.domain.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class BaseEnumToStringConverterFactory<X extends BaseEnum> implements ConverterFactory<X, String>{

	@SuppressWarnings("unchecked")
	@Override
	public <T extends String> Converter<X, T> getConverter(Class<T> targetType) {
		return (Converter<X, T>) new BaseEnumToString<>();
	}

	private static final class BaseEnumToString<T extends BaseEnum> implements Converter<T, String>{

		@Override
		public String convert(T source) {
			if (source == null) {
				return null;
			}
			return source.getTitle();
		}
		
	}
}
