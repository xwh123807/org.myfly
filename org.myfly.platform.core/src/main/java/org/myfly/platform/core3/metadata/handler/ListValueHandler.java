package org.myfly.platform.core3.metadata.handler;

import org.myfly.platform.core3.metadata.define.IValueHandler;
import org.myfly.platform.core3.metadata.service.IFlyColumn;

/**
 * 列表(一般为枚举)数据类型字段值读取类
 * 
 * @author xiangwanhong
 *
 */
public class ListValueHandler extends DefaultValueHandler implements IValueHandler {

	public ListValueHandler(IFlyColumn field) {
		super(field);
	}

	@Override
	public Object getFieldValueForEntity(Object entity) {
		return super.getFieldValueForEntity(entity);
	}
}
