package org.myfly.platform.core3.metadata.handler;

import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;
import org.myfly.platform.core3.metadata.define.IValueHandler;

/**
 * 基本数据类型字段值读取类
 * 
 * @author xiangwanhong
 *
 */
public class DefaultValueHandler implements IValueHandler {
	private FlyFieldDefinition field;

	public DefaultValueHandler(FlyFieldDefinition field) {
		this.setField(field);
	}

	public FlyFieldDefinition getField() {
		return field;
	}

	public void setField(FlyFieldDefinition field) {
		this.field = field;
	}

	@Override
	public Object getFieldValue(Object entity) {
		if (entity != null) {
			if (entity instanceof IFlyEntity) {
				return getFieldValueForFlyEntity((IFlyEntity) entity);
			}
		}
		return null;
	}

	@Override
	public void setFieldValue(Object entity, Object value) {
		if (entity != null) {
			if (entity instanceof IFlyEntity) {
				setFieldValueForFlyEntity((IFlyEntity) entity, value);
			}
		}
	}

	public Object getFieldValueForFlyEntity(IFlyEntity entity) {
		if (entity != null) {
			Object value = null;
			try {
				value = getField().getGetter().invoke(entity);
			} catch (Exception e) {
				AssertUtil.parameterEmpty(getField().getGetter(), "getGetter()",
						"属性[" + getField().getName() + "]没有定义Get方法");
				e.printStackTrace();
				throw new IllegalArgumentException("实体属性[" + getField().getName() + "]值获取失败，错误信息：" + e.getMessage());
			}
			return value;
		}
		return null;
	}

	public void setFieldValueForFlyEntity(IFlyEntity entity, Object value) {
		if (entity != null) {
			try {
				getField().getSetter().invoke(entity, value);
			} catch (Exception e) {
				AssertUtil.parameterEmpty(getField().getSetter(), "getSetter()",
						"属性[" + getField().getName() + "]没有定义Set方法");
				throw new IllegalArgumentException(
						"属性[" + getField().getName() + "]值[" + value + "]设置失败，错误信息：" + e.getMessage());
			}
		}
	}
}
