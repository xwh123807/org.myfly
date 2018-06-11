package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.FieldDataType.FieldAttr;
import org.myfly.platform.core.domain.ViewType;
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
	
	@JsonIgnore
	private EntityMetaData parent;
	/**
	 * 属性Label名称
	 */
	private String labelName;

	public EntityFieldDefinition() {
	}

	/**
	 * 从实体类的实体属性Field中构建
	 * 
	 * @param property
	 */
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
		initLabelName();
	}

	/**
	 * 从FieldDefinition中构建
	 * 
	 * @param parent
	 * @param builder
	 */
	public EntityFieldDefinition(EntityMetaData parent, FieldDefinition builder) {
		setParent(parent);
		setName(builder.getName());
		setTitle(builder.getTitle());
		setDescription(builder.getDescription());
		setFieldName(builder.getFieldName());
		setDataType(builder.getDataType());
		setMaxLength(builder.getMaxLength());
		setMinLength(builder.getMinLength());
		setRequired(builder.isRequired());
		setPrecision(builder.getPrecision());
		setScale(builder.getScale());
		initLabelName();
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

	public EntityMetaData getParent() {
		return parent;
	}

	public void setParent(EntityMetaData parent) {
		this.parent = parent;
	}

	public String getLabelName(ViewType viewType) {
		if (ViewType.PRINT.equals(viewType) || StringUtils.isBlank(getLabelName())) {
			return getName();
		} else {
			return getLabelName();
		}
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public void initLabelName() {
		String label;
		switch (getDataType()) {
		case SYSENUM:
			label = getName() + "__label";
			break;
		case URL:
			label = getName() + "__link";
		default:
			label = getName();
		}
		setLabelName(label);
	}

	private String getCheckInfo(String param) {
		return MessageFormat.format("实体[{0}]字段[{1}]的属性[{2}]不能为空.",
				getParent() != null ? getParent().getEntityName() : null, getName(), param);
	}

	@Override
	public void validate() {
		super.validate();
		Assert.hasLength(getName(), getCheckInfo("name"));
		//Assert.notNull(getParent());
		switch (getDataType()) {
		case ACTIONS:
			break;
		default:
			Assert.hasLength(getFieldName(), getCheckInfo("fieldName"));
			Assert.notNull(getGetter(), getCheckInfo("getter"));
			Assert.notNull(getSetter(), getCheckInfo("setter"));
		}
		Assert.notNull(getValueHandler(), getCheckInfo("valueHandler"));
		Assert.hasLength(getLabelName(), getCheckInfo("labelName"));
	}
}
