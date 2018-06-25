package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core3.metadata.handler.DefaultValueHandler;
import org.myfly.platform.core3.metadata.handler.ListValueHandler;
import org.myfly.platform.core3.metadata.handler.SubTableValueHandler;
import org.myfly.platform.core3.metadata.handler.TableDirectValueHandler;
import org.myfly.platform.core3.metadata.service.IFlyColumn;

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
	public static IValueHandler getValueHandler(IFlyColumn field) {
		IValueHandler result = null;
		switch (field.getDataType()) {
		case List:
		case Table:
			result = new ListValueHandler(field);
		case TableDirect:
			result = new TableDirectValueHandler(field);
		case SubTable:
			result = new SubTableValueHandler(field);
		default:
			result = new DefaultValueHandler(field);
		}
		return result;
	}
}
