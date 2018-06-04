package org.myfly.platform.core.metadata.entity.handler;

import org.myfly.platform.core.metadata.entity.EntityActionsFieldDefinition;

/**
 * 操作集字段
 * 
 * @author xiangwanhong
 *
 */
public class EntityActionsFieldValueHandler implements IFieldValueHandler {
	private EntityActionsFieldDefinition field;

	public EntityActionsFieldValueHandler(EntityActionsFieldDefinition field) {
		setField(field);
	}

	@Override
	public Object getFieldValue(Object entity) {
		return null;
	}

	@Override
	public void setFieldValue(Object entity, Object value) {
	}

	public EntityActionsFieldDefinition getField() {
		return field;
	}

	public void setField(EntityActionsFieldDefinition field) {
		this.field = field;
	}
}
