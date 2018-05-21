package org.myfly.platform.core.metadata.define;

import java.util.Map;

import org.myfly.platform.core.metadata.annotation.CommonSubTableType;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.springframework.util.Assert;

/**
 * 数据库表信息定义，对应实体定义信息
 * 
 * @author xiangwanhong
 *
 */
public class TableDefinition extends BaseDenifition {
	/**
	 * 表标题，也就是简要名称
	 */
	private String title;
	/**
	 * 表详细描述
	 */
	private String description;
	/**
	 * 数据库Schema
	 */
	private String schema;
	/**
	 * 表名称，数据库创建名称
	 */
	private String tableName;
	/**
	 * 所在数据库
	 */
	private String catalog;
	/**
	 * 显示字段，用于标记记录简要显示时显示的字段
	 */
	private String labelField;

	/**
	 * 通用子表
	 */
	private CommonSubTableType[] commonSubTables;
	/**
	 * 是否创建全文索引
	 */
	private boolean createIndex;
	/**
	 * 全文索引索引名称，默认情况下和name相同
	 */
	private String indexName;
	/**
	 * 字段列表
	 */
	private FieldDefinition[] fields;
	/**
	 * 设置主键
	 */
	private String[] primaryKeys;
	/**
	 * 主键字段
	 */
	private PKFieldDefinition pkFieldDefinition;
	/**
	 * 外键定义,查找关系
	 */
	private Map<String, FKFieldDefinition> fkFieldDefinitions;

	public TableDefinition(TableView view) {
		setName(view.name());
		setTitle(view.title());
		setDescription(view.description());
		setLabelField(view.labelField());
		setCommonSubTables(view.commonSubTables());
		setCreateIndex(view.createIndex());
		setIndexName(view.indexName());
		setPrimaryKeys(view.primaryKeys());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getLabelField() {
		return labelField;
	}

	public void setLabelField(String labelField) {
		this.labelField = labelField;
	}

	@Override
	public String toString() {
		return "tableName: " + getTableName() + ", title: " + getTitle() + ", schema: " + getSchema() + ", labelField: "
				+ getLabelField() + ", createIndex: " + isCreateIndex() + ", indexName: " + getIndexName();
	}

	public CommonSubTableType[] getCommonSubTables() {
		return commonSubTables;
	}

	public void setCommonSubTables(CommonSubTableType[] commonSubTables) {
		this.commonSubTables = commonSubTables;
	}

	public boolean isCreateIndex() {
		return createIndex;
	}

	public void setCreateIndex(boolean createIndex) {
		this.createIndex = createIndex;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void validate() {
		Assert.hasLength(getName());
		Assert.hasLength(getTitle());
		Assert.hasLength(getTableName());
		if (isCreateIndex())
			Assert.hasLength(getIndexName());
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public FieldDefinition[] getFields() {
		return fields;
	}

	public void setFields(FieldDefinition[] fields) {
		this.fields = fields;
	}

	public Map<String, FKFieldDefinition> getFkFieldDefinitions() {
		return fkFieldDefinitions;
	}

	public void setFkFieldDefinitions(Map<String, FKFieldDefinition> fkFieldDefinitions) {
		this.fkFieldDefinitions = fkFieldDefinitions;
	}

	public PKFieldDefinition getPkFieldDefinition() {
		return pkFieldDefinition;
	}

	public void setPkFieldDefinition(PKFieldDefinition pkFieldDefinition) {
		this.pkFieldDefinition = pkFieldDefinition;
	}

	public String[] getPrimaryKeys() {
		return primaryKeys;
	}

	public void setPrimaryKeys(String[] primaryKeys) {
		this.primaryKeys = primaryKeys;
	}
}
