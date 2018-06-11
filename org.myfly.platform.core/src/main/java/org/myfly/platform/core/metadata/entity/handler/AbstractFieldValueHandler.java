package org.myfly.platform.core.metadata.entity.handler;

import java.util.Map;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.ClassUtil;
import org.springframework.util.Base64Utils;

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

	public Object getFieldValueFromMap(Map entity) {
		return entity.get(getFieldDefinition().getName());
	}

	public Object getFieldValueFromEntity(Object entity) {
		try {
			return getFieldDefinition().getGetter().invoke(entity);
		} catch (Exception e) {
			AssertUtil.parameterEmpty(getFieldDefinition().getGetter(), "field.getGetter()",
					"属性[" + getFieldDefinition().getName() + "]没有定义Get方法");
			e.printStackTrace();
			throw new IllegalArgumentException(
					"实体属性[" + getFieldDefinition().getName() + "]值获取失败，错误信息：" + e.getMessage());
		}
	}

	public void setFieldValueForMap(Map entity, Object value) {
		entity.put(getFieldDefinition().getName(), value);
	}

	public void setFieldValueForEntity(Object entity, Object value) {
		try {
			if (value != null) {
				if (value.getClass() == getFieldDefinition().getType()) {
					// 类型相同，不需要转换
					getFieldDefinition().getSetter().invoke(entity, value);
				} else if (FieldDataType.FILE.equals(getFieldDefinition().getDataType())) {
					// 文件类型，且传入的为字符串（base64编码后的）
					byte[] newValue = Base64Utils.decodeFromString((String) value);
					getFieldDefinition().getSetter().invoke(entity, newValue);
				} else {
					// 类型不同，需要进行转换
					Object newValue = (value != null) ? ClassUtil.convert(value, getFieldDefinition().getType()) : null;
					getFieldDefinition().getSetter().invoke(entity, newValue);
				}
			} else {
				getFieldDefinition().getSetter().invoke(entity, null);
			}
		} catch (Exception e) {
			AssertUtil.parameterEmpty(getFieldDefinition().getSetter(), "field.getSetter()",
					"属性[" + getFieldDefinition().getName() + "]没有定义Set方法");
			throw new IllegalArgumentException(
					"属性[" + getFieldDefinition().getName() + "]值[" + value + "]设置失败，错误信息：" + e.getMessage());
		}
	}

	@Override
	public FlyEntityResult getFlyFieldValue(Object entity) {
		return null;
	}

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

	@Override
	public String toString() {
		return "entity: " + getFieldDefinition().getParent().getEntityName() + "field: "
				+ getFieldDefinition().getName();
	}
}
