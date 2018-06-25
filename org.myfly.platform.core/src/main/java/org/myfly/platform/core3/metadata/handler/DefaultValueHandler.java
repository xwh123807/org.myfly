package org.myfly.platform.core3.metadata.handler;

import java.lang.reflect.Method;
import java.util.Map;

import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core3.metadata.define.IValueHandler;
import org.myfly.platform.core3.metadata.service.IFlyColumn;

/**
 * 基本数据类型字段值读取类
 * 
 * @author xiangwanhong
 *
 */
public class DefaultValueHandler implements IValueHandler {
	private IFlyColumn field;
	private Method getter;
	private Method setter;

	public DefaultValueHandler(IFlyColumn field) {
		this.setField(field);
	}

	public DefaultValueHandler(Method getter, Method setter) {
		setGetter(getter);
		setSetter(setter);
	}

	public IFlyColumn getField() {
		return field;
	}

	public void setField(IFlyColumn field) {
		this.field = field;
	}

	public Method getGetter() {
		return getter;
	}

	public void setGetter(Method getter) {
		this.getter = getter;
	}

	public Method getSetter() {
		return setter;
	}

	public void setSetter(Method setter) {
		this.setter = setter;
	}

	@Override
	public Object getFieldValue(Object entity) {
		if (entity != null) {
			if (entity instanceof Map) {
				return getFieldValueForMap((Map) entity);
			} else {
				return getFieldValueForEntity(entity);
			}
		}
		return null;
	}

	private Object getFieldValueForMap(Map entity) {
		return entity.get(getField().getApiName());
	}

	@Override
	public void setFieldValue(Object entity, Object value) {
		if (entity != null) {
			if (entity instanceof Map) {
				setFieldValueForMap((Map) entity, value);
			} else {
				setFieldValueForEntity(entity, value);
			}
		}
	}

	private void setFieldValueForMap(Map entity, Object value) {
		entity.put(getField().getApiName(), value);
	}

	public Object getFieldValueForEntity(Object entity) {
		if (entity != null) {
			Object value = null;
			try {
				value = getGetter().invoke(entity);
			} catch (Exception e) {
				AssertUtil.parameterEmpty(getGetter(), "getGetter()", "属性[" + getField().getName() + "]没有定义Get方法");
				e.printStackTrace();
				throw new IllegalArgumentException("实体属性[" + getField().getName() + "]值获取失败，错误信息：" + e.getMessage());
			}
			return value;
		}
		return null;
	}

	public void setFieldValueForEntity(Object entity, Object value) {
		if (entity != null) {
			try {
				Object newValue = value;
				if (value != null && value.getClass() != getGetter().getReturnType()) {
					// 类型不同，需要进行转换
					newValue = (value != null) ? ClassUtil.convert(value, getGetter().getReturnType()) : null;
				}
				getSetter().invoke(entity, newValue);
			} catch (Exception e) {
				AssertUtil.parameterEmpty(getSetter(), "getSetter()", "属性[" + getField().getName() + "]没有定义Set方法");
				throw new IllegalArgumentException(
						"属性[" + getField().getName() + "]值[" + value + "]设置失败，错误信息：" + e.getMessage());
			}
		}
	}
}
