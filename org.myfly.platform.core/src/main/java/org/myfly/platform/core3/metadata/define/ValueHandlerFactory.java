package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core3.metadata.handler.DefaultValueHandler;
import org.myfly.platform.core3.metadata.handler.ListValueHandler;
import org.myfly.platform.core3.metadata.handler.SubTableValueHandler;
import org.myfly.platform.core3.metadata.handler.TableDirectValueHandler;

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
		switch (field.getDataType()) {
		case List:
		case Table:
			return new ListValueHandler(field);
		case TableDirect:
			return new TableDirectValueHandler(field);
		case SubTable:
			return new SubTableValueHandler(field);
		default:
			return new DefaultValueHandler(field);
		}
	}
}
