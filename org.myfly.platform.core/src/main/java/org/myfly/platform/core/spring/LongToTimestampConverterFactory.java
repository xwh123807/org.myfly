package org.myfly.platform.core.spring;

import java.sql.Timestamp;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class LongToTimestampConverterFactory implements ConverterFactory<Long, Timestamp> {

	@Override
	public <T extends Timestamp> Converter<Long, T> getConverter(Class<T> targetType) {
		return new LongToTimeStamp<>(targetType);
	}

	private static final class LongToTimeStamp<T extends Timestamp> implements Converter<Long, T> {
		private final Class<T> targetType;

		public LongToTimeStamp(Class<T> targetType) {
			this.targetType = targetType;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T convert(Long source) {
			if (source.longValue() == 0) {
				return null;
			}else {
				return (T) new Timestamp(source.longValue());
			}
		}
	}
}
