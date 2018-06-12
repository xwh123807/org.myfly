package org.myfly.platform.core.spring;

import java.sql.Timestamp;

import org.myfly.platform.core.utils.DateUtil;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * TODO 序列化时，timestamp没有转换成字符，没有调用到TimestampToStringConverterFactory，但单元测试切正常。  "created" : 1528813258722.
 * @author xiangwanhong
 *
 */
public class TimestampToStringConverterFactory implements ConverterFactory<Timestamp, String>{

	@Override
	public <T extends String> Converter<Timestamp, T> getConverter(Class<T> targetType) {
		return new DateToString(targetType);
	}

	private static final class DateToString<T extends Timestamp> implements Converter<T, String>{
		public DateToString(Class<T> targetType) {
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
