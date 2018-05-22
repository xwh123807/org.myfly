package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.FieldDataType.FieldAttr;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.entity.handler.DefaultGetFieldValueHandler;
import org.myfly.platform.core.metadata.entity.handler.DefaultSetFieldValueHandler;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.StringUtil;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EntityFieldDefinition extends FieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6572731699308357577L;
	/**
	 * 值不为空时，取值由此函数确定
	 */
	@JsonIgnore
	private IGetFieldValueHandler getValueHandler;
	/**
	 * 设置实体函数
	 */
	@JsonIgnore
	private ISetFieldValueHandler setValueHandler;
	/**
	 * get方法
	 */
	@JsonIgnore
	private Method getter;

	/**
	 * set方法
	 */
	@JsonIgnore
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
		setIdField(property.getAnnotation(Id.class) != null);
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
		setGetValueHandler(new DefaultGetFieldValueHandler(this));
		setSetValueHandler(new DefaultSetFieldValueHandler(this));
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

	public IGetFieldValueHandler getGetValueHandler() {
		return getValueHandler;
	}

	public void setGetValueHandler(IGetFieldValueHandler getValueHandler) {
		this.getValueHandler = getValueHandler;
	}

	public ISetFieldValueHandler getSetValueHandler() {
		return setValueHandler;
	}

	public void setSetValueHandler(ISetFieldValueHandler setValueHandler) {
		this.setValueHandler = setValueHandler;
	}

	@Override
	public void validate() {
		super.validate();
		Assert.hasLength(getName());
		Assert.notNull(getGetter());
		Assert.notNull(getSetter());
		Assert.notNull(getGetValueHandler());
		Assert.notNull(getSetValueHandler());
	}
}
