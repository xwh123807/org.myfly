package org.myfly.platform.core3.metadata.service;

import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.domain.IFlyMetaEntity;
import org.myfly.platform.core3.model.AccessLevel;

public interface IFlyDataModel extends IFlyEntity, IFlyMetaEntity {
	String getTableID();

	void setTableID(String tableID);

	String getTableName();

	void setTableName(String tableName);

	Boolean getIsHighVolume();

	void setIsHighVolume(Boolean isHighVolume);

	String getEntityType();

	void setEntityType(String entityType);

	AccessLevel getAccessLevel();

	void setAccessLevel(AccessLevel accessLevel);

	String getReplicationType();

	void setReplicationType(String replicationType);

	Boolean getIsChangeLog();

	void setIsChangeLog(Boolean isChangeLog);

	Integer getaCTriggerLength();

	void setaCTriggerLength(Integer aCTriggerLength);

	Boolean getIsIgnoreMigration();

	void setIsIgnoreMigration(Boolean isIgnoreMigration);

	Boolean getIsDocument();

	void setIsDocument(Boolean isDocument);

	String getImportTable();

	void setImportTable(String importTable);

	Boolean getIsSecurityEnabled();

	void setIsSecurityEnabled(Boolean isSecurityEnabled);

	Boolean getIsDeleteable();

	void setIsDeleteable(Boolean isDeleteable);

	Boolean getIsView();

	void setIsView(Boolean isView);

	String getCopyColumnsFromTable();

	void setCopyColumnsFromTable(String copyColumnsFromTable);

	String getApiName();

	void setApiName(String apiName);

	Boolean getIsCentrallyMaintained();

	void setIsCentrallyMaintained(Boolean isCentrallyMaintained);

	String getWindowID();

	void setWindowID(String windowID);

	String getDisplayColumn();
	
	void setDisplayColumn(String displayColumn);
}