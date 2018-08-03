package org.myfly.platform.core.datamodel.handler;

import java.lang.reflect.Method;
import java.util.Map;

import org.myfly.platform.core.datamodel.define.FlyColumn;
import org.myfly.platform.core.datamodel.define.IValueHandler;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.ClassUtil;

/**
 * 基本数据类型字段值读取类
 * 
 * @author xiangwanhong
 *
 */
public class DefaultValueHandler implements IValueHandler {
	private FlyColumn column;

	public DefaultValueHandler(FlyColumn column) {
		this.column = column;
	}
	
	public FlyColumn getColumn() {
		return column;
	}

	public String getApiName() {
		return column.getApiName();
	}

	public Method getGetter() {
		return column.getGetter();
	}

	public Method getSetter() {
		return column.getSetter();
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
		return entity.get(getApiName());
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
		entity.put(getApiName(), value);
	}

	public Object getFieldValueForEntity(Object entity) {
		if (entity != null) {
			Object value = null;
			try {
				value = getGetter().invoke(entity);
			} catch (Exception e) {
				AssertUtil.parameterEmpty(getGetter(), "getGetter()", "属性[" + getApiName() + "]没有定义Get方法");
				e.printStackTrace();
				throw new IllegalArgumentException("实体属性[" + getApiName() + "]值获取失败，错误信息：" + e.getMessage());
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
				AssertUtil.parameterEmpty(getSetter(), "getSetter()", "属性[" + getApiName() + "]没有定义Set方法");
				throw new IllegalArgumentException(
						"属性[" + getApiName() + "]值[" + value + "]设置失败，错误信息：" + e.getMessage());
			}
		}
	}
}
