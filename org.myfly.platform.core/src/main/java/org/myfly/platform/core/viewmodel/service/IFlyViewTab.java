package org.myfly.platform.core.viewmodel.service;

import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.domain.IFlyMetaEntity;
import org.myfly.platform.core.viewmodel.annotation.TableStyle;

public interface IFlyViewTab extends IFlyEntity, IFlyMetaEntity{
	String getTabID();
	
	void setTabID(String tabID);

	String getWindowID();

	void setWindowID(String windowID);

	String getTableID();

	void setTableID(String table);

	String getImageID();

	void setImageID(String image);

	String getCommitWarning();

	void setCommitWarning(String commitWarning);

	String getDisplayLogic();

	void setDisplayLogic(String displayLogic);

	String getEntityType();

	void setEntityType(String entityType);

	Boolean getHasTree();

	void setHasTree(Boolean hasTree);

	String getImportFields();

	void setImportFields(String importFields);

	String getIncludedTab();

	void setIncludedTab(String includedTab);

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

	String getOrderByClause();

	void setOrderByClause(String orderByClause);

	String getParentColumn();

	void setParentColumn(String parentColumn);

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
	
	TableStyle getTableStyle();
	
	void setTableStyle(TableStyle tableStyle);

}