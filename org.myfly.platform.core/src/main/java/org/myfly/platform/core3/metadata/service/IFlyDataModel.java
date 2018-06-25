package org.myfly.platform.core3.metadata.service;

import java.util.Set;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.model.data.AccessLevel;

public interface IFlyDataModel extends IFlyEntity{

	String getName();

	void setName(String name);

	String getTableName();

	void setTableName(String tableName);

	Boolean getIsHighVolume();

	void setIsHighVolume(Boolean isHighVolume);

	EntityType getEntityType();

	void setEntityType(EntityType entityType);

	String getDescription();

	void setDescription(String description);

	AccessLevel getAccessLevel();

	void setAccessLevel(AccessLevel accessLevel);

	String getHelp();

	void setHelp(String help);

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

	Set<IFlyColumn> getColumns();

	void setColumns(Set<IFlyColumn> columns);

	String getApiName();

	void setApiName(String apiName);

	Boolean getIsCentrallyMaintained();

	void setIsCentrallyMaintained(Boolean isCentrallyMaintained);

	IFlyViewModel getWindow();

	void setWindow(IFlyViewModel window);

}