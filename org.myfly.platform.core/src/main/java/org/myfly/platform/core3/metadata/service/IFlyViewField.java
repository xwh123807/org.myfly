package org.myfly.platform.core3.metadata.service;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.model.dict.PRefList;
import org.myfly.platform.core3.model.dict.PReference;
import org.myfly.platform.core3.model.view.PFieldGroup;

public interface IFlyViewField extends IFlyEntity{

	IFlyColumn getColumn();

	void setColumn(IFlyColumn column);

	PFieldGroup getFieldGroup();

	void setFieldGroup(PFieldGroup fieldGroup);

	PReference getReference();

	void setReference(PReference reference);

	PRefList getRefList();

	void setRefList(PRefList refList);

	IFlyViewTab getTab();

	void setTab(IFlyViewTab tab);

	String getDefaultValue();

	void setDefaultValue(String defaultValue);

	String getDescription();

	void setDescription(String description);

	EntityType getEntityType();

	void setEntityType(EntityType entityType);

	String getHelp();

	void setHelp(String help);

	IFlyViewTab getIncludedTab();

	void setIncludedTab(IFlyViewTab includedTab);

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

	String getName();

	void setName(String name);

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