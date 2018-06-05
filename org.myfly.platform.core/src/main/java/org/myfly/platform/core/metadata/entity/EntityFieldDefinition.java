package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.FieldDataType.FieldAttr;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.entity.handler.DefaultFieldValueHandler;
import org.myfly.platform.core.metadata.entity.handler.IFieldValueHandler;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.StringUtil;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 实体属性定义，支持基本数据类型
 * 
 * @author xiangwanhong
 *
 */
public class EntityFieldDefinition extends FieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6572731699308357577L;
	/**
	 * 值不为空时，取值由此函数确定
	 */
	@JsonIgnore
	private IFieldValueHandler valueHandler;
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
	
	public EntityFieldDefinition() {
	}

	public EntityFieldDefinition(Field property) {
		super(property.getAnnotation(FieldView.class));
		setName(property.getName());
		setType(property.getType());
		if (StringUtils.isBlank(getTitle())) {
			setTitle(getName());
		}
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
		setIdField(property.getAnnotation(Id.class) != null || property.getAnnotation(EmbeddedId.class) != null);
		FieldAttr fieldAttr = FieldDataType.fromJavaType(getType(), column);
		if (getDataType() == null || FieldDataType.NONE.equals(getDataType())) {
			setDataType(fieldAttr.getDataType());
		}
		try {
			Map<String, FieldInfo> fieldInfo = EntityClassUtil.getEntityFieldInfo(property.getDeclaringClass());
			setGetter(fieldInfo.get(getName()).getGetter());
			setSetter(fieldInfo.get(getName()).getSetter());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setValueHandler(new DefaultFieldValueHandler(this));
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

	public IFieldValueHandler getValueHandler() {
		return valueHandler;
	}

	public void setValueHandler(IFieldValueHandler valueHandler) {
		this.valueHandler = valueHandler;
	}

	@Override
	public void validate() {
		super.validate();
		Assert.hasLength(getName());
		Assert.notNull(getGetter());
		Assert.notNull(getSetter());
		Assert.notNull(getValueHandler());
	}
}
