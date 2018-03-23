package org.myfly.platform.core.spring;

import org.myfly.platform.core.domain.IKeyEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class StringToKeyEntityConverterFactory implements ConverterFactory<String, IKeyEntity>{

	@Override
	public <T extends IKeyEntity> Converter<String, T> getConverter(Class<T> targetType) {
		return new StringToKeyEntity(targetType);
	}

	
	private static final class StringToKeyEntity<T extends IKeyEntity> implements Converter<String, T> {

		private Class<T> targetType;

		public StringToKeyEntity(Class<T> targetType) {
			this.targetType = targetType;
		}

		@Override
		public T convert(String source) {
			if (source.length() == 0) {
				return null;
			}
			T entity = null;
			try {
				entity = targetType.newInstance();
				entity.setUid(source);
			} catch (Exception e) {
			}
			return entity;
		}

	}
}
