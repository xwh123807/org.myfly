package org.myfly.platform.core3.metadata.service;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IFlyEntity;

public interface IFlyColumn extends IFlyEntity{

	String getName();

	void setName(String name);

	String getDescription();

	void setDescription(String description);

	String getHelp();

	void setHelp(String help);

	EntityType getEntityType();

	void setEntityType(EntityType entityType);

	String getCallout();

	void setCallout(String callout);

	String getColumnName();

	void setColumnName(String columnName);

	String getColumnSQL();

	void setColumnSQL(String columnSQL);

	String getDefaultValue();

	void setDefaultValue(String defaultValue);

	Integer getFieldLength();

	void setFieldLength(Integer fieldLength);

	String getFormatPattern();

	void setFormatPattern(String formatPattern);

	String getInfoFactoryClass();

	void setInfoFactoryClass(String infoFactoryClass);

	Boolean getIsAllowCopy();

	void setIsAllowCopy(Boolean isAllowCopy);

	Boolean getIsAllowLogging();

	void setIsAllowLogging(Boolean isAllowLogging);

	Boolean getIsAlwaysUpdateable();

	void setIsAlwaysUpdateable(Boolean isAlwaysUpdateable);

	Boolean getIsAutocomplete();

	void setIsAutocomplete(Boolean isAutocomplete);

	Boolean getIsEncrypted();

	void setIsEncrypted(Boolean isEncrypted);

	Boolean getIsIdentifier();

	void setIsIdentifier(Boolean isIdentifier);

	Boolean getIsKey();

	void setIsKey(Boolean isKey);

	Boolean getIsMandatory();

	void setIsMandatory(Boolean isMandatory);

	Boolean getIsParent();

	void setIsParent(Boolean isParent);

	Boolean getIsRange();

	void setIsRange(Boolean isRange);

	Boolean getIsSelectionColumn();

	void setIsSelectionColumn(Boolean isSelectionColumn);

	Boolean getIsSyncDatabase();

	void setIsSyncDatabase(Boolean isSyncDatabase);

	Boolean getIsTranslated();

	void setIsTranslated(Boolean isTranslated);

	Boolean getIsUpdateable();

	void setIsUpdateable(Boolean isUpdateable);

	String getMandatoryLogic();

	void setMandatoryLogic(String mandatoryLogic);

	String getReadOnlyLogic();

	void setReadOnlyLogic(String readOnlyLogic);

	Integer getSeqNo();

	void setSeqNo(Integer seqNo);

	String getValueMax();

	void setValueMax(String valueMax);

	String getValueMin();

	void setValueMin(String valueMin);

	String getVersion();

	void setVersion(String version);

	String getvFormat();

	void setvFormat(String vFormat);

	IFlyDataModel getTable();

	void setTable(IFlyDataModel table);

	String getApiName();

	void setApiName(String apiName);

	FlyDataType getDataType();

	void setDataType(FlyDataType dataType);

}