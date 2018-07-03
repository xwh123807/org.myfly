package org.myfly.platform.core3.metadata.service;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.domain.IFlyMetaEntity;

public interface IFlyViewField extends IFlyEntity, IFlyMetaEntity{
	String getFieldID();
	
	void setFieldID(String fieldID);

	String getColumnID();

	void setColumn(String columnID);

	String getFieldGroupID();

	void setFieldGroup(String fieldGroupID);

	FlyDataType getDataType();

	void setDataType(FlyDataType dataType);

	String getReferenceID();

	void setReferenceID(String referenceID);

	String getTabID();

	void setTab(String tabID);

	String getDefaultValue();

	void setDefaultValue(String defaultValue);

	String getEntityType();

	void setEntityType(String entityType);

	String getIncludedTab();

	void setIncludedTab(String includedTab);

	String getInfoFactoryClass();

	void setInfoFactoryClass(String infoFactoryClass);

	Boolean getIsAllowCopy();

	void setIsAllowCopy(Boolean isAllowCopy);

	Boolean getIsCentrallyMaintained();

	void setIsCentrallyMaintained(Boolean isCentrallyMaintained);

	Boolean getIsDisplayed();

	void setIsDisplayed(Boolean isDisplayed);

	Boolean getIsDisplayedGrid();

	void setIsDisplayedGrid(Boolean isDisplayedGrid);

	Boolean getIsEmbedded();

	void setIsEmbedded(Boolean isEmbedded);

	Boolean getIsEncrypted();

	void setIsEncrypted(Boolean isEncrypted);

	Boolean getIsFieldOnly();

	void setIsFieldOnly(Boolean isFieldOnly);

	Boolean getIsHeading();

	void setIsHeading(Boolean isHeading);

	Boolean getIsMandatory();

	void setIsMandatory(Boolean isMandatory);

	Boolean getIsReadOnly();

	void setIsReadOnly(Boolean isReadOnly);

	Boolean getIsSameLine();

	void setIsSameLine(Boolean isSameLine);

	Boolean getPreferredWidth();

	void setPreferredWidth(Boolean preferredWidth);

	Integer getSeqNo();

	void setSeqNo(Integer seqNo);

	Integer getSeqNoGrid();

	void setSeqNoGrid(Integer seqNoGrid);

	Integer getSortNo();

	void setSortNo(Integer sortNo);

	Integer getDisplayLength();

	void setDisplayLength(Integer displayLength);

	String getDisplayLogic();

	void setDisplayLogic(String displayLogic);

	String getObscureType();

	void setObscureType(String obscureType);

}