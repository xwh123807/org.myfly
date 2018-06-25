package org.myfly.platform.core3.metadata.handler;

import java.lang.reflect.Method;
import java.util.Map;

import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core3.metadata.define.ColumnDefinition;
import org.myfly.platform.core3.metadata.define.IValueHandler;

/**
 * 基本数据类型字段值读取类
 * 
 * @author xiangwanhong
 *
 */
public class DefaultValueHandler implements IValueHandler {
	private ColumnDefinition columnDefinition;

	public DefaultValueHandler(ColumnDefinition columnDefinition) {
		this.setColumnDefinition(columnDefinition);
	}

	public ColumnDefinition getColumnDefinition() {
		return columnDefinition;
	}

	public void setColumnDefinition(ColumnDefinition columnDefinition) {
		this.columnDefinition = columnDefinition;
	}

	private String getApiName() {
		return getColumnDefinition().getColumn().getApiName();
	}

	private Method getGetter() {
		return getColumnDefinition().getFieldInfo().getGetter();
	}

	private Method getSetter() {
		return getColumnDefinition().getFieldInfo().getSetter();
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
