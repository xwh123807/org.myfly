package org.myfly.platform.core3.metadata.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.AccessLevel;
import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

/**
 * 表定义 <br>
 * 1、结构同AD_Table <br>
 * 
 * @author xiangwanhong
 *
 */
@FlyTable(name = "Table", description = "Table for the Fields", isHighVolume = true)
@Entity
@Table(name = "PT_TABLE")
public class PTable extends Auditable {
	@FlyField(name = "Name", description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;
	@FlyField(name = "DB Table Name", description = "Name of the table in the database", help = "The DB Table Name indicates the name of the table in database.")
	@Column(length = 40, name="TableName")
	private String tableName;
	@FlyField(description = "Use Search instead of Pick list", help = "The High Volume Checkbox indicates if a search screen will display as opposed to a pick list for selecting records from this table.")
	@Column(name = "IsHighVolume")
	private Boolean isHighVolume;
	@FlyField(name = "Entity Type", dataType = FlyDataType.Table, description = "Dictionary Entity Type; Determines ownership and synchronization", help = "The Entity Types \"Dictionary\", \"Adempiere\" and \"Application\" might be automatically synchronized and customizations deleted or overwritten.  \n"
			+ "\n" + "For customizations, copy the entity and select \"User\"!")
	@Column(name = "EntityType")
	private EntityType entityType;
	@FlyField(name = "Description", description = "Optional short description of the record", help = "A description is limited to 255 characters.")
	@Column(length = 255)
	private String description;
	@FlyField(name = "Data Access Level", dataType = FlyDataType.List, description = "Access Level required", help = "Indicates the access level required for this record or process.")
	@Column(name = "AccessLevel")
	private AccessLevel accessLevel;
	@FlyField(name = "Comment/Help", dataType = FlyDataType.Text, description = "Comment or Hint", help = "The Help field contains a hint, comment or help about the use of this item.")
	@Column(length = 2000)
	private String help;
	@FlyField(name = "Replication Type", dataType = FlyDataType.List, description = "Type of Data Replication", help = "The Type of data Replication determines the direction of the data replication.  <br>\n"
			+ "Reference means that the data in this system is read only -> <br>\n"
			+ "Local means that the data in this system is not replicated to other systems - <br>\n"
			+ "Merge means that the data in this system is synchronized with the other system <-> <br>")
	@Column(name = "ReplicationType")
	private String replicationType;
	@FlyField(name = "Maintain Change Log", description = "Maintain a log of changes", help = "If selected, a log of all changes is maintained.")
	@Column(name = "IsChangeLog")
	private Boolean isChangeLog;
	@FlyField(name = "Auto Complete Min Length", defaultValue = "0", description = "Identifier autocomplete trigger length")
	@Column(name = "ACTriggerLength")
	private Integer aCTriggerLength;
	@FlyField(name = "Ignore Migration", description = "Ignore this record in log migration")
	@Column(name = "Ignore Migration")
	private Boolean isIgnoreMigration;
	@FlyField(name = "Is Document", description = "This flag determinate if the record is a document", help = "This flag is used to mark those tables that behave like documents and allow create automatically columns like: C_DocType_ID, DocumentNo, DateDoc, DocAction, DocStatus, Processed, IsApproved, Description")
	@Column(name = "IsDocument")
	private Boolean isDocument;
	@FlyField(name = "Import Table", dataType = FlyDataType.Button, description = "Import Table Columns from Database")
	@Column(name = "ImportTable", length = 1)
	private String importTable;
	@FlyField(name = "Security enabled", description = "If security is enabled, user access to data can be restricted via Roles", help = "The Security Enabled checkbox indicates that user access to the data in this table can be restricted using Roles.")
	@Column(name = "IsSecurityEnabled")
	private Boolean isSecurityEnabled;
	@FlyField(name = "Records deletable", defaultValue = "Y", description = "Indicates if records can be deleted from the database", help = "The Records Deletable checkbox indicates if a record can be deleted from the database.  If records cannot be deleted, you can only deselect the Active flag")
	@Column(name = "IsDeleteable")
	private Boolean isDeleteable;
	@FlyField(name = "View", description = "This is a view", help = "This is a view rather than a table.  A view is always treated as read only in the system.")
	@Column(name = "IsView")
	private Boolean isView;
	@FlyField(name = "Copy Columns From Table", dataType = FlyDataType.Button)
	@Column(name = "CopyColumnsFromTable", length = 1)
	private String copyColumnsFromTable;
	@FlyField(name = "Centrally maintained", defaultValue = "Y", description = "Information maintained in System Element table", help = "The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table  or 'Window' table.")
	@Column(name = "IsCentrallyMaintained")
	private Boolean isCentrallyMaintained;
	@JoinColumn()
	@OneToMany(fetch = FetchType.LAZY, mappedBy="table", cascade = { CascadeType.ALL })
	private Set<PColumn> columns;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Boolean getIsHighVolume() {
		return isHighVolume;
	}

	public void setIsHighVolume(Boolean isHighVolume) {
		this.isHighVolume = isHighVolume;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AccessLevel getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(AccessLevel accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getReplicationType() {
		return replicationType;
	}

	public void setReplicationType(String replicationType) {
		this.replicationType = replicationType;
	}

	public Boolean getIsChangeLog() {
		return isChangeLog;
	}

	public void setIsChangeLog(Boolean isChangeLog) {
		this.isChangeLog = isChangeLog;
	}

	public Integer getaCTriggerLength() {
		return aCTriggerLength;
	}

	public void setaCTriggerLength(Integer aCTriggerLength) {
		this.aCTriggerLength = aCTriggerLength;
	}

	public Boolean getIsIgnoreMigration() {
		return isIgnoreMigration;
	}

	public void setIsIgnoreMigration(Boolean isIgnoreMigration) {
		this.isIgnoreMigration = isIgnoreMigration;
	}

	public Boolean getIsDocument() {
		return isDocument;
	}

	public void setIsDocument(Boolean isDocument) {
		this.isDocument = isDocument;
	}

	public String getImportTable() {
		return importTable;
	}

	public void setImportTable(String importTable) {
		this.importTable = importTable;
	}

	public Boolean getIsSecurityEnabled() {
		return isSecurityEnabled;
	}

	public void setIsSecurityEnabled(Boolean isSecurityEnabled) {
		this.isSecurityEnabled = isSecurityEnabled;
	}

	public Boolean getIsDeleteable() {
		return isDeleteable;
	}

	public void setIsDeleteable(Boolean isDeleteable) {
		this.isDeleteable = isDeleteable;
	}

	public Boolean getIsView() {
		return isView;
	}

	public void setIsView(Boolean isView) {
		this.isView = isView;
	}

	public String getCopyColumnsFromTable() {
		return copyColumnsFromTable;
	}

	public void setCopyColumnsFromTable(String copyColumnsFromTable) {
		this.copyColumnsFromTable = copyColumnsFromTable;
	}

	public Boolean getIsCentrallyMaintained() {
		return isCentrallyMaintained;
	}

	public void setIsCentrallyMaintained(Boolean isCentrallyMaintained) {
		this.isCentrallyMaintained = isCentrallyMaintained;
	}

	public Set<PColumn> getColumns() {
		return columns;
	}

	public void setColumns(Set<PColumn> columns) {
		this.columns = columns;
	}
}
