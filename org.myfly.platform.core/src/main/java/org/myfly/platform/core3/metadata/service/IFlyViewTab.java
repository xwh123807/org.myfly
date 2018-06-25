package org.myfly.platform.core3.metadata.service;

import java.util.Set;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.dict.PImage;

public interface IFlyViewTab extends IFlyEntity{

	IFlyViewModel getWindow();

	void setWindow(IFlyViewModel window);

	PTable getTable();

	void setTable(PTable table);

	PImage getImage();

	void setImage(PImage image);

	String getCommitWarning();

	void setCommitWarning(String commitWarning);

	String getDescription();

	void setDescription(String description);

	String getDisplayLogic();

	void setDisplayLogic(String displayLogic);

	EntityType getEntityType();

	void setEntityType(EntityType entityType);

	Boolean getHasTree();

	void setHasTree(Boolean hasTree);

	String getHelp();

	void setHelp(String help);

	String getImportFields();

	void setImportFields(String importFields);

	IFlyViewTab getIncludedTab();

	void setIncludedTab(IFlyViewTab includedTab);

	Boolean getIsAdvancedTab();

	void setIsAdvancedTab(Boolean isAdvancedTab);

	Boolean getIsInfoTab();

	void setIsInfoTab(Boolean isInfoTab);

	Boolean getIsInsertRecord();

	void setIsInsertRecord(Boolean isInsertRecord);

	Boolean getIsReadOnly();

	void setIsReadOnly(Boolean isReadOnly);

	Boolean getIsSingleRow();

	void setIsSingleRow(Boolean isSingleRow);

	Boolean getIsSortTab();

	void setIsSortTab(Boolean isSortTab);

	Boolean getIsTranslationTab();

	void setIsTranslationTab(Boolean isTranslationTab);

	String getName();

	void setName(String name);

	String getOrderByClause();

	void setOrderByClause(String orderByClause);

	PColumn getParentColumn();

	void setParentColumn(PColumn parentColumn);

	Boolean getProcessing();

	void setProcessing(Boolean processing);

	String getReadOnlyLogic();

	void setReadOnlyLogic(String readOnlyLogic);

	Integer getSeqNo();

	void setSeqNo(Integer seqNo);

	Integer getTabLevel();

	void setTabLevel(Integer tabLevel);

	String getWhereClause();

	void setWhereClause(String whereClause);

	Set<IFlyViewField> getFields();

	void setFields(Set<IFlyViewField> fields);

}