package org.myfly.platform.core.metadata.entity;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.metadata.define.SubTableDefinition;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 实体子表定义
 * 
 * @author xiangwanhong
 *
 */
public class EntitySubTableDefinition extends SubTableDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6828261057348054913L;
	/**
	 * 子表中用到的实体字段定义
	 */
	private EntityFieldDefinition[] fieldDefinitions;
	/**
	 * 主实体的元模型
	 */
	@JsonIgnore
	private EntityMetaData parent;

	public EntitySubTableDefinition(SubTableDefinition builder) {
		setName(builder.getName());
		setSubTableAttr(builder.getSubTableAttr());
		setRefName(builder.getRefName());
		setTitle(builder.getTitle());
		setHeader(builder.getHeader());
		setFields(builder.getFields());
		setLabelField(builder.getLabelField());
		setListStyle(builder.getListStyle());
		setEnableActions(builder.isEnableActions());
		setFetchMode(builder.getFetchMode());
		setListActions(builder.getListActions());
		setItemActions(builder.getItemActions());
		setFields(builder.getFields());
	}

	public EntityMetaData getParent() {
		return parent;
	}

	public void setParent(EntityMetaData parent) {
		this.parent = parent;
		generateFieldDefinitions(parent);
	}

	/**
	 * 生成子表的定义信息
	 * 
	 * @param parentMetaData
	 */
	private void generateFieldDefinitions(EntityMetaData parentMetaData) {
		EntityMetaData subEntityMetaData = parentMetaData.getSubEntityMetaData(getSubTableAttr());
		if (StringUtils.isBlank(getRefName())) {
			setFieldDefinitions(subEntityMetaData.getFields(getFields()));
		} else {
			setFields(subEntityMetaData.getListDefinition(getRefName()).getFields());
			setFieldDefinitions(subEntityMetaData.getListDefinition(getRefName()).getFieldDefinitions());
		}
	}

	public EntityFieldDefinition[] getFieldDefinitions() {
		return fieldDefinitions;
	}

	public void setFieldDefinitions(EntityFieldDefinition[] fieldDefinitions) {
		this.fieldDefinitions = fieldDefinitions;
	}

	@Override
	public void validate() {
		super.validate();
		Assert.notNull(getParent(), "属性[parent]不能为空.");
		Assert.isTrue(getFields() != null && getFields().length > 0, "属性[fields]不能为空，且长度至少为1.");
		Assert.isTrue(getFieldDefinitions() != null && getFieldDefinitions().length > 0,
				"属性[fieldDefinitions]不能为空，且长度至少为1.");
	}

}
