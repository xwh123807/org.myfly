package org.myfly.platform.core3.metadata.handler;

import org.myfly.platform.core3.metadata.define.ColumnDefinition;
import org.myfly.platform.core3.metadata.define.IValueHandler;

/**
 * 列表(一般为枚举)数据类型字段值读取类
 * 
 * @author xiangwanhong
 *
 */
public class ListValueHandler extends DefaultValueHandler implements IValueHandler {

	public ListValueHandler(ColumnDefinition columnDefinition) {
		super(columnDefinition);
	}

	@Override
	public Object getFieldValueForEntity(Object entity) {
		return super.getFieldValueForEntity(entity);
	}
}
