package org.myfly.platform.core.datamodel.define;

import org.myfly.platform.core.datamodel.handler.DefaultValueHandler;
import org.myfly.platform.core.datamodel.handler.ListValueHandler;
import org.myfly.platform.core.datamodel.handler.SubTableValueHandler;
import org.myfly.platform.core.datamodel.handler.TableDirectValueHandler;

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
	public static IValueHandler getValueHandler(FlyColumn column) {
		IValueHandler result = null;
		switch (column.getDataType()) {
		case List:
			result = new ListValueHandler(column);
			break;
		case Table:
		case TableDirect:
			result = new TableDirectValueHandler(column);
			break;
		case SubTable:
			result = new SubTableValueHandler(column);
			break;
		default:
			result = new DefaultValueHandler(column);
		}
		return result;
	}
}
