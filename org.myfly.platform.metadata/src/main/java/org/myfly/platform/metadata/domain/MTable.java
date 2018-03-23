package org.myfly.platform.metadata.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.myfly.platform.system.core.domain.DevelopStateType;
import org.myfly.platform.system.core.domain.OwnerLevel;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.SchemaConstants;
import org.myfly.platform.system.core.domain.SoftApp;
import org.myfly.platform.system.metadata.annotation.FieldSetView;
import org.myfly.platform.system.metadata.annotation.FieldView;
import org.myfly.platform.system.metadata.annotation.FilterView;
import org.myfly.platform.system.metadata.annotation.FormView;
import org.myfly.platform.system.metadata.annotation.ListView;
import org.myfly.platform.system.metadata.annotation.MetaDataView;
import org.myfly.platform.system.metadata.annotation.SectionView;
import org.myfly.platform.system.metadata.annotation.SubTableView;
import org.myfly.platform.system.metadata.annotation.TableView;
import org.myfly.platform.system.metadata.define.ListStyle;

/**
 * 存储表元数据
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PM)
@MetaDataView(
//
tableView = @TableView(title = "对象") ,
//
listViews = @ListView(fields = { "name", "description", "active", "createdBy", "created", "developState", "softApp",
		"softAppVersion" }, serverSideMode = true, filters = { @FilterView(field = "name"),
				@FilterView(field = "tableName") }) ,
				//
				formViews = @FormView(sections = {
						@SectionView(title = "对象信息", fieldSets = {
								@FieldSetView(title = "基本信息", fields = { "name", "description", "tableName",
										"entityName" }),
								@FieldSetView(title = "开发信息", fields = { "ownerLevel", "developState", "softApp",
										"softAppVersion" }),
						@FieldSetView(title = "参数", fields = { "enableSearch", "enableTrace", "enableReport",
								"enableActivity", "enableCommunication" }),
						@FieldSetView(title = "审计", fields = { "active", "createdBy", "created", "updatedBy",
								"updated" }) }),
						@SectionView(title = "字段信息", subTables = {
								@SubTableView(tableAttr = "fields", listStyle = ListStyle.TABLE, itemActions = {}),
								@SubTableView(tableAttr = "indexes", listStyle = ListStyle.TABLE, itemActions = {}) }) }) )
// @Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="javaClassName")
public class MTable extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 873998034947630774L;
	/**
	 * 实体名称
	 */
	@Column(length = 50, nullable = false)
	@FieldView(title = "实体名称")
	private String entityName;
	/**
	 * 数据库表名称
	 */
	@Column(length = 32, nullable = false)
	@FieldView(title = "表名称")
	private String tableName;

	@Column(length = 32)
	@FieldView(title = "方案")
	private String schemaName;
	
	@Column(length = 100)
	@FieldView(title = "数据库")
	private String catalogName;

	/**
	 * 描述
	 */
	@Column(length = 1000)
	@FieldView(title = "描述")
	private String description;

	/**
	 * 是否允许搜索
	 */
	@Column
	@FieldView(title = "允许搜索")
	private boolean enableSearch;
	/**
	 * 开发状态
	 */
	@Column
	@FieldView(title = "开发状态")
	private DevelopStateType developState;
	/**
	 * 允许跟踪字段历史
	 */
	@Column
	@FieldView(title = "允许跟踪", description = "允许跟踪字段历史")
	private boolean enableTrace;
	/**
	 * 允许报表
	 */
	@Column
	@FieldView(title = "允许报表")
	private boolean enableReport;
	/**
	 * 允许活动
	 */
	@Column
	@FieldView(title = "允许活动")
	private boolean enableActivity;
	/**
	 * 允许在通讯组件中显示
	 */
	@Column
	@FieldView(title = "允许消息", description = "允许在通讯组件中显示")
	private boolean enableCommunication;
	/**
	 * 来源软件包
	 */
	@JoinColumn(name = "softAppId")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@FieldView(title = "来源软件包")
	private SoftApp softApp;
	/**
	 * 软件包版本
	 */
	@Column(length = 10)
	@FieldView(title = "软件包版本")
	private String softAppVersion;

	/**
	 * 字段
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "table")
	@FieldView(title = "字段")
	private Set<MField> fields;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "table")
	@FieldView(title = "索引")
	private Set<MIndex> indexes;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "pkTable")
	@FieldView(title = "外键")
	private Set<MFKConstraint> fkConstraints;

	/**
	 * 表类型
	 */
	@Column
	@FieldView(title = "所有者级别")
	private OwnerLevel ownerLevel;

	@Column
	@FieldView(title = "数据源")
	private String dataSourceId;

	/**
	 * 主键字段，如果没有定义主键字段，则取表唯一索引;如果是复合主键，多个字段间用逗号分隔
	 */
	@Column
	@FieldView(title = "主键字段")
	private String primaryKeys;

	public MTable() {
		setInternalTable("MTable");
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnableSearch() {
		return enableSearch;
	}

	public void setEnableSearch(boolean enableSearch) {
		this.enableSearch = enableSearch;
	}

	public DevelopStateType getDevelopState() {
		return developState;
	}

	public void setDevelopState(DevelopStateType developState) {
		this.developState = developState;
	}

	public boolean isEnableTrace() {
		return enableTrace;
	}

	public void setEnableTrace(boolean enableTrace) {
		this.enableTrace = enableTrace;
	}

	public boolean isEnableReport() {
		return enableReport;
	}

	public void setEnableReport(boolean enableReport) {
		this.enableReport = enableReport;
	}

	public boolean isEnableActivity() {
		return enableActivity;
	}

	public void setEnableActivity(boolean enableActivity) {
		this.enableActivity = enableActivity;
	}

	public boolean isEnableCommunication() {
		return enableCommunication;
	}

	public void setEnableCommunication(boolean enableCommunication) {
		this.enableCommunication = enableCommunication;
	}

	public SoftApp getSoftApp() {
		return softApp;
	}

	public void setSoftApp(SoftApp softApp) {
		this.softApp = softApp;
	}

	public String getSoftAppVersion() {
		return softAppVersion;
	}

	public void setSoftAppVersion(String softAppVersion) {
		this.softAppVersion = softAppVersion;
	}

	public Set<MField> getFields() {
		return fields;
	}

	public void setFields(Set<MField> fields) {
		this.fields = fields;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public OwnerLevel getOwnerLevel() {
		return ownerLevel;
	}

	public void setOwnerLevel(OwnerLevel ownerLevel) {
		this.ownerLevel = ownerLevel;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getDataSourceId() {
		return dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	public String getPrimaryKeys() {
		return primaryKeys;
	}

	public void setPrimaryKeys(String primaryKeys) {
		this.primaryKeys = primaryKeys;
	}

	public Set<MIndex> getIndexes() {
		return indexes;
	}

	public void setIndexes(Set<MIndex> indexes) {
		this.indexes = indexes;
	}

	@Override
	public String toString() {
		return "uid: " + getUid() + ", name: " + getName() + ", entityName: " + getEntityName() + ", schema: "
				+ getSchemaName() + ", tableName: " + getTableName() + ", primaryKeys: " + getPrimaryKeys();
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public Set<MFKConstraint> getFkConstraints() {
		return fkConstraints;
	}

	public void setFkConstraints(Set<MFKConstraint> fkConstraints) {
		this.fkConstraints = fkConstraints;
	}
}
