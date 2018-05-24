package org.myfly.platform.core.metadata.entity.handler;

import java.util.Map;

import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;

/**
 *
 * @author xiangwanhong
 *
 */
public abstract class AbstractFieldValueHandler implements IFieldValueHandler {
	private EntityFieldDefinition fieldDefinition;
	
	public AbstractFieldValueHandler(EntityFieldDefinition fieldDefinition) {
		this.fieldDefinition = fieldDefinition;
	}

	public EntityFieldDefinition getFieldDefinition() {
		return fieldDefinition;
	}

	public void setFieldDefinition(EntityFieldDefinition fieldDefinition) {
		this.fieldDefinition = fieldDefinition;
	}

	/**
	 * 从Map中获取属性值
	 * 
	 * @param entity
	 * @return
	 */
	public abstract Object getFieldValueFromMap(Map entity);

	/**
	 * 从实体类中获取属性值
	 * 
	 * @param entity
	 * @return
	 */
	public abstract Object getFieldValueFromEntity(Object entity);

	/**
	 * 设置Map属性值
	 * 
	 * @param entity
	 * @param value
	 */
	public abstract void setFieldValueForMap(Map entity, Object value);

	/**
	 * 设置实体类对象属性值
	 * 
	 * @param entity
	 * @param value
	 */
	public abstract void setFieldValueForEntity(Object entity, Object value);

	@Override
	public Object getFieldValue(Object entity) {
		if (entity == null) {
			return null;
		} else {
			if (entity instanceof Map) {
				return getFieldValueFromMap((Map) entity);
			} else {
				return getFieldValueFromEntity(entity);
			}
		}
	}

	@Override
	public void setFieldValue(Object entity, Object value) {
		if (entity == null) {
			return;
		}
		if (entity instanceof Map) {
			setFieldValueForMap((Map) entity, value);
		} else {
			setFieldValueForEntity(entity, value);
		}
	}
}
