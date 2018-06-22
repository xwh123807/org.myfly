package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core3.metadata.handler.DefaultValueHandler;

/**
 * 字段值读取类工厂
 * 
 * @author xiangwanhong
 *
 */
public class ValueHandlerFactory {
	/**
	 * 根据数据类型获取字段值读取类 <br>
	 * 
	 * @param dataType
	 * @return
	 */
	public static IValueHandler getValueHandler(FlyFieldDefinition field) {
		return new DefaultValueHandler(field);
	}
}
