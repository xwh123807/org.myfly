package org.myfly.platform.metamodel.spring;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.myfly.platform.metamodel.utils.DateUtil;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class StringToDateConverterFactory implements ConverterFactory<String, Date>{

	@Override
	public <T extends Date> Converter<String, T> getConverter(Class<T> targetType) {
		return new StringToDate<>(targetType);
	}

	private static final class StringToDate<T extends Date> implements Converter<String, T> {
		private final Class<T> targetType;
		
		public StringToDate(Class<T> targetType) {
			this.targetType = targetType;
		}
		
		@Override
		public T convert(String source) {
			if (StringUtils.isEmpty(source)) {
				return null;
			}
			return DateUtil.parseDate(source, this.targetType);
		}
	}
}
