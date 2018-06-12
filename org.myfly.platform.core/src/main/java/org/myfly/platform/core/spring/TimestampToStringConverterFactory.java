package org.myfly.platform.core.spring;

import java.sql.Timestamp;

import org.myfly.platform.core.utils.DateUtil;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class TimestampToStringConverterFactory implements ConverterFactory<Timestamp, String>{

	@Override
	public <T extends String> Converter<Timestamp, T> getConverter(Class<T> targetType) {
		return new DateToString(targetType);
	}

	private static final class DateToString<T extends Timestamp> implements Converter<T, String>{

		private Class<T> targetType;

		public DateToString(Class<T> targetType) {
			this.targetType = targetType;
		}

		@Override
		public String convert(T source) {
			if (source == null) {
				return null;
			}
			return DateUtil.toString(source);
		}
		
	}
}
