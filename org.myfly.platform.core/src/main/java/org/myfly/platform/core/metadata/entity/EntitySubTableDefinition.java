package org.myfly.platform.core.metadata.entity;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.metadata.define.SubTableDefinition;
import org.springframework.util.Assert;

/**
 * 实体子表定义
 * 
 * @author xiangwanhong
 *
 */
public class EntitySubTableDefinition extends EntityListDefinition {
	/**
	 * 子表属性名
	 */
	private String subTableAttr;
	/**
	 * 引用子表实体列表视图名
	 */
	private String refName;
	/**
	 * 所在表单视图名称
	 */
	private String formViewName;
	/**
	 * 
	 */
	private static final long serialVersionUID = -6828261057348054913L;

	public EntitySubTableDefinition(EntityMetaData parent, SubTableDefinition builder) {
		super(parent, builder);
		setSubTableAttr(builder.getSubTableAttr());
		setRefName(builder.getRefName());
	}
	

	public String getSubTableAttr() {
		return subTableAttr;
	}

	public void setSubTableAttr(String subTableAttr) {
		this.subTableAttr = subTableAttr;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}
	
	public String getFormViewName() {
		return formViewName;
	}


	public void setFormViewName(String formViewName) {
		this.formViewName = formViewName;
	}

	/**
	 * 生成子表的定义信息
	 * 
	 * @param parentMetaData
	 */
	private void generateFieldDefinitions(EntityMetaData parentMetaData) {
		EntityMetaData subEntityMetaData = parentMetaData.getSubEntityMetaData(getSubTableAttr());
		if (StringUtils.isNotBlank(getLabelField())) {
			Assert.notNull(subEntityMetaData.getField(getLabelField()));
		}else {
			setLabelField(subEntityMetaData.getLableField().getName());
		}
		if (StringUtils.isBlank(getRefName())) {
			setFieldDefinitions(subEntityMetaData.getFields(getFields()));
		} else {
			setFields(subEntityMetaData.getListDefinition(getRefName()).getFields());
			setFieldDefinitions(subEntityMetaData.getListDefinition(getRefName()).getFieldDefinitions());
		}
	}
	
	@Override
	public void config() {
		generateFieldDefinitions(getParent());
	}

	@Override
	public void validate() {
		Assert.hasLength(getName(), "属性[name]不能为空.");
		Assert.hasLength(getTitle(), "属性[title]不能为空.");
		Assert.notNull(getFetchMode(), "属性[fetchMode]不能为空.");
		Assert.notNull(getListStyle(), "属性[listStyle]不能为空.");
		Assert.hasLength(getSubTableAttr(),  "属性[subTableAttr]不能为空.");
		Assert.hasLength(getFormViewName(),  "属性[formViewName]不能为空.");
		// 如果没有设置引用，则fields必须设置
		if (StringUtils.isBlank(getRefName())) {
			Assert.isTrue(getFields().length > 0, "属性[fields]至少要有一个字段.");
		}
		Assert.notNull(getParent(), "属性[parent]不能为空.");
		Assert.notNull(getLabelField(), "属性[labelField]不能为空.");
		Assert.isTrue(getFields() != null && getFields().length > 0, "属性[fields]不能为空，且长度至少为1.");
		Assert.isTrue(getFieldDefinitions() != null && getFieldDefinitions().length > 0,
				"属性[fieldDefinitions]不能为空，且长度至少为1.");
	}
}
