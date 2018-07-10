package org.myfly.platform.core.metadata.entity;

import java.util.Map;
import java.util.stream.Stream;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.metadata.define.TableDefinition;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 实体表信息定义
 * 
 * @author xiangwanhong
 *
 */
public class EntityTableDefinition extends TableDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 203514230427118675L;
	/**
	 * 实体
	 */
	@JsonIgnore
	private EntityMetaData parent;
	/**
	 * 实体中定义的字段，在TableView注解中定义的
	 */
	private Map<String, EntityFieldDefinition> fieldMap;

	/**
	 * 从TableDefinition中构建
	 * 
	 * @param parent
	 * @param builder
	 */
	public EntityTableDefinition(EntityMetaData parent, TableDefinition builder) {
		setParent(parent);
		setName(builder.getName());
		setTitle(builder.getTitle());
		setDescription(builder.getDescription());
		setSchema(builder.getSchema());
		setTableName(builder.getTableName());
		setCatalog(builder.getCatalog());
		setLabelField(builder.getLabelField());
		setCommonSubTables(builder.getCommonSubTables());
		setCreateIndex(builder.isCreateIndex());
		setIndexName(builder.getIndexName());
		setPrimaryKeys(builder.getPrimaryKeys());
		setFields(builder.getFields());
		if (StringUtils.isBlank(getName())) {
			setName(parent.getEntityName());
		}
		if (StringUtils.isBlank(getTitle())) {
			setTitle(getName());
		}
		if (StringUtils.isBlank(getLabelField())) {
			setLabelField(parent.getFieldNames()[0]);
		}
		if (StringUtils.isBlank(getTableName())) {
			setTableName(parent.getEntityName());
		}
	}

	public EntityMetaData getParent() {
		return parent;
	}

	public void setParent(EntityMetaData parent) {
		this.parent = parent;
	}

	public Map<String, EntityFieldDefinition> getFieldMap() {
		return fieldMap;
	}

	public void setFieldMap(Map<String, EntityFieldDefinition> fieldMap) {
		this.fieldMap = fieldMap;
	}

	@Override
	public void validate() {
		super.validate();
		Assert.hasLength(getName(), "属性[name]不能为空.");
		Assert.hasLength(getTitle(), "属性[title]不能为空.");
		Assert.hasLength(getLabelField(), "属性[labelField]不能为空.");
		Assert.hasLength(getTableName(), "属性[tableName]不能为空.");
		Assert.isTrue(ArrayUtils.isNotEmpty(getPrimaryKeys()), "属性[primaryKeys]不能为空，且长度至少为1.");
		if (ArrayUtils.isNotEmpty(getFields())) {
			Stream.of(getFields()).forEach(item -> item.validate());
		}
		if (MapUtils.isNotEmpty(getFieldMap())) {
			getFieldMap().values().forEach(item -> item.validate());
		}
	}
}
