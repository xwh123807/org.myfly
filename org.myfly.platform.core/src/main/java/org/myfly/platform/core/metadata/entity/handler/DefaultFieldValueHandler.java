package org.myfly.platform.core.metadata.entity.handler;

import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;

/**
 * 默认实体属性设置和获取类 <br>
 * 1、只支持基本数据类型 <br>
 * 
 * @author xiangwanhong
 *
 */
public class DefaultFieldValueHandler extends AbstractFieldValueHandler {

	public DefaultFieldValueHandler(EntityFieldDefinition fieldDefinition) {
		super(fieldDefinition);
	}
}
