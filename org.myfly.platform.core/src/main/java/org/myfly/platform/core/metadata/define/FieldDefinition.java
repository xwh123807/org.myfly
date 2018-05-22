package org.myfly.platform.core.metadata.define;

import java.util.Map;

import org.apache.commons.lang.NotImplementedException;
import org.hibernate.annotations.GenericGenerator;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.PropertyView;
import org.myfly.platform.core.utils.UUIDUtil;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FieldDefinition extends BaseDenifition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6387040692213679693L;

	/**
	 * 标签
	 */
	private String title;

	/**
	 * 字段名称
	 */
	private String fieldName;
	/**
	 * 简档
	 */
	private String description;
	/**
	 * 是否必填
	 */
	private boolean required;
	/**
	 * 数据类型
	 */
	private FieldDataType dataType;
	/**
	 * 控件值
	 */
	private String value;
	/**
	 * 最小长度
	 */
	private int minLength;
	/**
	 * 最大长度，如果是字符串类型时，取长度
	 */
	private int maxLength;
	/**
	 * 精度
	 */
	private int precision;
	/**
	 * 小数位数
	 */
	private int scale;
	/**
	 * 输入限制
	 */
	private String mask;
	/**
	 * 字段值类型
	 */
	private Class<?> type;
	/**
	 * 字段链接配置
	 */
	private String linkUrl;

	/**
	 * 只读，不能更改
	 */
	private boolean readonly;

	/**
	 * 是否为主键字段，如果是复合主键，则一个实体中有多个属性
	 */
	private boolean isIdField;

	/**
	 * 值自动生成器,@GenericGenerator
	 */
	@JsonIgnore
	private GenericGenerator generator;

	public FieldDefinition() {
	}

	public FieldDefinition(FieldView fieldView) {
		if (fieldView != null) {
			setTitle(fieldView.title());
			setDescription(fieldView.description());
			setDataType(fieldView.dataType());
			setMinLength(fieldView.minLength());
		}
	}

	public FieldDefinition(PropertyView view) {
		setName(view.name());
		setTitle(view.title());
		setDescription(view.description());
		setFieldName(view.fieldName());
		setDataType(view.dataType());
		setMaxLength(view.maxLength());
		setMinLength(view.minLength());
		setRequired(view.required());
		setPrecision(view.precision());
		setScale(view.scale());
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public FieldDataType getDataType() {
		return dataType;
	}

	public void setDataType(FieldDataType dataType) {
		this.dataType = dataType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getMinLength() {
		return minLength;
	}

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	@Override
	public String toString() {
		return "title: " + getTitle() + "; name: " + getName() + "; dataType: " + getDataType() + "; fieldName: "
				+ getName();
	}

	public boolean isIdField() {
		return isIdField;
	}

	public void setIdField(boolean isIdField) {
		this.isIdField = isIdField;
	}

	public GenericGenerator getGenerator() {
		return generator;
	}

	public void setGenerator(GenericGenerator generator) {
		this.generator = generator;
	}

	/**
	 * 生成值
	 * 
	 * @return
	 */
	public void generatedValue(Map<String, Object> entity) {
		if (getGenerator() != null) {
			if ("system-uuid".equals(getGenerator().name())) {
				// UUID
				entity.put(getName(), UUIDUtil.newUUID());
			} else {
				throw new NotImplementedException();
			}
		} else {
			throw new IllegalArgumentException("字段必须有@GenericGenerator注解，才能调用generateValue方法.");
		}
	}

	public void validate() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	// private Boolean isFlyEntityForRelationClass;
	//
	// public Boolean relationClassIsFlyEntity() {
	// if (isFlyEntityForRelationClass == null) {
	// EntityMetaData relEntityMetaData =
	// AppUtil.getEntityMetadata(getRelationTable());
	// isFlyEntityForRelationClass = relEntityMetaData.isFlyEntity();
	// }
	// return isFlyEntityForRelationClass;
	// }
	//
	// /**
	// * 查找关系时，获取查找表显示字段定义
	// *
	// * @return
	// */
	// public FieldDefinition getLabelFieldDefinition() {
	// if (labelFieldDefinition == null) {
	// if (FieldDataType.SEARCHRELATION.equals(getDataType())
	// || FieldDataType.FLYSEARCHRELATION.equals(getDataType())
	// || FieldDataType.AUTORELATION.equals(getDataType())
	// || FieldDataType.FLYMDRELATION.equals(getDataType())) {
	// if (StringUtils.isBlank(getLabelField())) {
	// AssertUtil.parameterInvalide("field", "字段[" + getName() +
	// "]没有配置LabelField字段");
	// }
	// EntityMetaData metaData = AppUtil.getEntityMetadata(getRelationClass());
	// AssertUtil.parameterEmpty(metaData, "metaData", "没有名称为[" + getRelationClass()
	// + "]的实体元模型");
	// labelFieldDefinition = metaData.getField(getLabelField());
	// AssertUtil.parameterEmpty(labelFieldDefinition, "labelFieldDefinition", "字段["
	// + getName()
	// + "]的LabelField属性配置错误，实体[" + getRelationClass() + "]中没有字段[" + getLabelField()
	// + "]");
	// } else {
	// AssertUtil.parameterInvalide(true,
	// "字段[" + getName() + "]不是关联属性，只有[" + FieldDataType.SEARCHRELATION.getTitle() +
	// "和"
	// + FieldDataType.AUTORELATION.getTitle() + "]的字段才支持.");
	// }
	// }
	// return labelFieldDefinition;
	// }
	//
	// /**
	// * 查找关系时，获取查找表主键定义
	// *
	// * @return
	// */
	// public PKFieldDefinition getPKFieldDefinition() {
	// if (pkFieldDefinition == null) {
	// AssertUtil.parameterInvalide(!FieldDataType.SEARCHRELATION.equals(getDataType()),
	// "字段[" + getName() + "]不是关联属性，只有[" + FieldDataType.SEARCHRELATION.getTitle() +
	// "]的字段才支持.");
	// pkFieldDefinition =
	// AppUtil.getEntityMetadata(getRelationClass()).getPKFieldDefinition();
	// }
	// return pkFieldDefinition;
	// }
	//
	// /**
	// * 为主子表关联字段时，获取关联属性
	// *
	// * @return
	// */
	// public FieldDefinition getRelationField() {
	// if (FieldDataType.MDRELATION.equals(getDataType())) {
	// if (relationField != null && relationField.getDataType() == null) {
	// // 由于在元模型构造时存在循环调用，更改为需要时获取。 更新关联字段等信息
	// AssertUtil.parameterEmpty(getRelationTable(), "getRelationTable()");
	// EntityMetaData relEntityMetaData =
	// AppUtil.getEntityMetadata(getRelationTable());
	// relationField = relEntityMetaData.getField(relationField.getName());
	// }
	// }
	// return relationField;
	// }
	//
	// public String getFieldName() {
	// if (FieldDataType.SEARCHRELATION.equals(getDataType())) {
	// // 复合外键，wid=wid;did=did；将属性名转换为字段名
	// if (fieldName.startsWith("tmp|")) {
	// if (fieldName.contains("=")) {
	// String searchField = fieldName.substring(4);
	// EntityMetaData metaData = getParent();
	// EntityMetaData relEntityMetaData =
	// AppUtil.getEntityMetadata(getRelationTable());
	// String[] items = searchField.split(";");
	// String result = "";
	// for (String item : items) {
	// String name = metaData.getField(StringUtils.substringBefore(item,
	// "=")).getFieldName();
	// String value = relEntityMetaData.getField(StringUtils.substringAfter(item,
	// "=")).getFieldName();
	// result += ";" + name + "=" + value;
	// }
	// if (StringUtils.isNotBlank(result)) {
	// result = result.substring(1);
	// }
	// fieldName = result;
	// }
	// }
	// }
	// return fieldName;
	// }
}
