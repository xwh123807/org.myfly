package org.myfly.platform.core3.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyReferences;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;

/**
 * 表定义 <br>
 * 1、结构同AD_Table <br>
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_TABLE")
@FlyTable(name = "Table", description = "Table for the Fields", isHighVolume = true)
@FlyReferences(references = {
		@FlyRefTable(apiName = "tableID", name = "PTable ID", keyColumn = "tableID", displayColumn = "name"),
		@FlyRefTable(apiName = "tableName", name = "PTable name", displayColumn = "name", keyColumn = "tableName") })
public class PTable extends FlyMetaEntity implements IFlyDataModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9033044830736476897L;

	@Id
	@Column(length = 32, name="TableID")
	private String tableID;

	@Column(length = 255, name = "ApiName", unique = true)
	private String apiName;

	@Column(length = 40)
	private String entityType;

	@Column(length = 40, name = "TableName", unique = true)
	private String tableName;

	@Column(name = "IsHighVolume")
	private Boolean isHighVolume;

	@Column(name = "AccessLevel")
	private AccessLevel accessLevel;

	@Column(name = "ReplicationType")
	private String replicationType;

	@Column(name = "IsChangeLog")
	private Boolean isChangeLog;

	@Column(name = "ACTriggerLength")
	private Integer aCTriggerLength;

	@Column(name = "IgnoreMigration")
	private Boolean isIgnoreMigration;

	@Column(name = "IsDocument")
	private Boolean isDocument;

	@Column(name = "ImportTable", length = 1)
	private String importTable;

	@Column(name = "IsSecurityEnabled")
	private Boolean isSecurityEnabled;

	@Column(name = "IsDeleteable")
	private Boolean isDeleteable;

	@Column(name = "IsView")
	private Boolean isView;

	@Column(name = "CopyColumnsFromTable", length = 1)
	private String copyColumnsFromTable;

	@Column(name = "IsCentrallyMaintained")
	private Boolean isCentrallyMaintained;

	@Column(length = 32)
	private String windowID;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getTableName()
	 */
	@Override
	public String getTableName() {
		return tableName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setTableName(java.lang.
	 * String)
	 */
	@Override
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getIsHighVolume()
	 */
	@Override
	public Boolean getIsHighVolume() {
		return isHighVolume;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setIsHighVolume(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsHighVolume(Boolean isHighVolume) {
		this.isHighVolume = isHighVolume;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getAccessLevel()
	 */
	@Override
	public AccessLevel getAccessLevel() {
		return accessLevel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setAccessLevel(org.myfly.
	 * platform.core3.model.data.AccessLevel)
	 */
	@Override
	public void setAccessLevel(AccessLevel accessLevel) {
		this.accessLevel = accessLevel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getReplicationType()
	 */
	@Override
	public String getReplicationType() {
		return replicationType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setReplicationType(java.
	 * lang.String)
	 */
	@Override
	public void setReplicationType(String replicationType) {
		this.replicationType = replicationType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getIsChangeLog()
	 */
	@Override
	public Boolean getIsChangeLog() {
		return isChangeLog;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setIsChangeLog(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsChangeLog(Boolean isChangeLog) {
		this.isChangeLog = isChangeLog;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getaCTriggerLength()
	 */
	@Override
	public Integer getaCTriggerLength() {
		return aCTriggerLength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setaCTriggerLength(java.
	 * lang.Integer)
	 */
	@Override
	public void setaCTriggerLength(Integer aCTriggerLength) {
		this.aCTriggerLength = aCTriggerLength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getIsIgnoreMigration()
	 */
	@Override
	public Boolean getIsIgnoreMigration() {
		return isIgnoreMigration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setIsIgnoreMigration(java.
	 * lang.Boolean)
	 */
	@Override
	public void setIsIgnoreMigration(Boolean isIgnoreMigration) {
		this.isIgnoreMigration = isIgnoreMigration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getIsDocument()
	 */
	@Override
	public Boolean getIsDocument() {
		return isDocument;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setIsDocument(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsDocument(Boolean isDocument) {
		this.isDocument = isDocument;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getImportTable()
	 */
	@Override
	public String getImportTable() {
		return importTable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setImportTable(java.lang.
	 * String)
	 */
	@Override
	public void setImportTable(String importTable) {
		this.importTable = importTable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getIsSecurityEnabled()
	 */
	@Override
	public Boolean getIsSecurityEnabled() {
		return isSecurityEnabled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setIsSecurityEnabled(java.
	 * lang.Boolean)
	 */
	@Override
	public void setIsSecurityEnabled(Boolean isSecurityEnabled) {
		this.isSecurityEnabled = isSecurityEnabled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getIsDeleteable()
	 */
	@Override
	public Boolean getIsDeleteable() {
		return isDeleteable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setIsDeleteable(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsDeleteable(Boolean isDeleteable) {
		this.isDeleteable = isDeleteable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getIsView()
	 */
	@Override
	public Boolean getIsView() {
		return isView;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#setIsView(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsView(Boolean isView) {
		this.isView = isView;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#getCopyColumnsFromTable()
	 */
	@Override
	public String getCopyColumnsFromTable() {
		return copyColumnsFromTable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setCopyColumnsFromTable(
	 * java.lang.String)
	 */
	@Override
	public void setCopyColumnsFromTable(String copyColumnsFromTable) {
		this.copyColumnsFromTable = copyColumnsFromTable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#getApiName()
	 */
	@Override
	public String getApiName() {
		return apiName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyDataModel#setApiName(java.lang.
	 * String)
	 */
	@Override
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#getIsCentrallyMaintained()
	 */
	@Override
	public Boolean getIsCentrallyMaintained() {
		return isCentrallyMaintained;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyDataModel#setIsCentrallyMaintained(
	 * java.lang.Boolean)
	 */
	@Override
	public void setIsCentrallyMaintained(Boolean isCentrallyMaintained) {
		this.isCentrallyMaintained = isCentrallyMaintained;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getWindowID() {
		return windowID;
	}

	public void setWindowID(String windowID) {
		this.windowID = windowID;
	}
}
