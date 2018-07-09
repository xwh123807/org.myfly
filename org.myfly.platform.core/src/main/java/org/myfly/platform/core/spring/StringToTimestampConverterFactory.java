package org.myfly.platform.core.spring;

import java.sql.Timestamp;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.utils.DateUtil;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class StringToTimestampConverterFactory implements ConverterFactory<String, Timestamp>{

	@Override
	public <T extends Timestamp> Converter<String, T> getConverter(Class<T> targetType) {
		return new StringToDate(targetType);
	}

	private static final class StringToDate<T extends Timestamp> implements Converter<String, T> {
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
