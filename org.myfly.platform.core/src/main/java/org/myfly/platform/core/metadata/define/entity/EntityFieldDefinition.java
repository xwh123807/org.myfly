package org.myfly.platform.core.metadata.define.entity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import javax.persistence.Column;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.FieldDataType.FieldAttr;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.StringUtil;
import org.springframework.data.mapping.PersistentProperty;

public class EntityFieldDefinition extends FieldDefinition {
	/**
	 * get方法
	 */
	private Method getter;

	/**
	 * set方法
	 */
	private Method setter;

	public EntityFieldDefinition(Field property) {
		super(property.getAnnotation(FieldView.class));
		setName(property.getName());
		setType(property.getType());
		Column column = property.getAnnotation(Column.class);
		if (column != null) {
			setMaxLength(column.length());
			setPrecision(column.precision());
			setScale(column.scale());
			setRequired(!column.nullable());
			if (StringUtils.isNotBlank(column.name())) {
				setFieldName(column.name());
			}
		}
		if (StringUtils.isBlank(getFieldName())) {
			setFieldName(StringUtil.getHibernateName(getName()));
		}
		FieldAttr fieldAttr = FieldDataType.fromJavaType(getType(), column);
		if (FieldDataType.NONE.equals(getDataType())) {
			setDataType(fieldAttr.getDataType());
		}
		try {
			Map<String, FieldInfo> fieldInfo = EntityClassUtil.getEntityFieldInfo(property.getDeclaringClass());
			setGetter(fieldInfo.get(getName()).getGetter());
			setSetter(fieldInfo.get(getName()).getSetter());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public EntityFieldDefinition(PersistentProperty<?> property) {
		this(property.getField());
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
}
