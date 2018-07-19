package org.myfly.platform.core3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyReferences;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.service.IFlyColumn;

/**
 * 字段定义 <br>
 * 1、结构同AD_Column <br>
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_Column")
@FlyTable(name = "Column", description = "Column in the table")
@FlyReferences(references = {
		@FlyRefTable(apiName = "columnID", name = "PColumn ID", keyColumn = "columnID", displayColumn = "name"),
		@FlyRefTable(apiName = "columnName", name = "PColumn name", displayColumn = "name", keyColumn = "columnName"),
		@FlyRefTable(apiName = "keyColumn", name = "PColumn name", displayColumn = "name", keyColumn = "columnID"),
		@FlyRefTable(apiName = "displayColumn", name = "PColumn name", displayColumn = "name", keyColumn = "columnID"),
		@FlyRefTable(apiName = "parentColumn", name = "Parent Column", keyColumn = "columnID", displayColumn = "name") })
public class PColumn extends FlyMetaEntity implements IFlyColumn {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4129803416173363683L;

	@Id
	@Column(length = 32, name = "ColumnID")
	private String columnID;

	@Column(length = 50, name = "ApiName")
	private String apiName;

	@Column(name = "EntityType", length = 40)
	private String entityType;

	@Column(length = 255)
	private String callout;

	@Column(length = 50, name = "ColumnName")
	private String columnName;

	@Column(length = 32, name = "ElementID")
	private String elementID;

	@Column(name = "DataType")
	private FlyDataType dataType;

	@Column(length = 2000, name = "ColumnSQL")
	private String columnSQL;

	@Column(length = 2000, name = "DefaultValue")
	private String defaultValue;

	@Column(name = "FieldLength")
	private Integer fieldLength;

	@Column(length = 32)
	private String referenceID;

	@Column(length = 22, name = "FormatPattern")
	private String formatPattern;

	@Column(length = 255, name = "InfoFactoryClass")
	private String infoFactoryClass;

	@Column(name = "IsAllowCopy")
	private Boolean isAllowCopy;

	@Column(name = "IsAllowLogging")
	private Boolean isAllowLogging;

	@Column(name = "IsAlwaysUpdateable")
	private Boolean isAlwaysUpdateable;

	@Column(name = "IsAutocomplete")
	private Boolean isAutocomplete;

	@Column(name = "IsEncrypted")
	private Boolean isEncrypted;

	@Column(name = "IsIdentifier")
	private Boolean isIdentifier;

	@Column(name = "IsKey")
	private Boolean isKey;

	@Column(name = "IsMandatory")
	private Boolean isMandatory;

	@Column(name = "IsParent")
	private Boolean isParent;

	@Column(name = "IsRange")
	private Boolean isRange;

	@Column(name = "IsSelectionColumn")
	private Boolean isSelectionColumn;

	@Column(name = "IsSyncDatabase")
	private Boolean isSyncDatabase;

	@Column(name = "IsTranslated")
	private Boolean isTranslated;

	@Column(name = "IsUpdateable")
	private Boolean isUpdateable;

	@Column(name = "MandatoryLogic", length = 2000)
	private String mandatoryLogic;

	@Column(name = "ReadOnlyLogic", length = 2000)
	private String readOnlyLogic;

	@Column(name = "SeqNo")
	private Integer seqNo;

	@Column(name = "ValueMax", length = 20)
	private String valueMax;

	@Column(name = "ValueMin", length = 20)
	private String valueMin;

	@Column(length = 32)
	private String version;

	@Column(length = 60, name = "VFormat")
	private String vFormat;

	@Column(length = 32)
	private String tableID;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getCallout()
	 */
	@Override
	public String getCallout() {
		return callout;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setCallout(java.lang.String)
	 */
	@Override
	public void setCallout(String callout) {
		this.callout = callout;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getColumnName()
	 */
	@Override
	public String getColumnName() {
		return columnName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setColumnName(java.lang.
	 * String)
	 */
	@Override
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getColumnSQL()
	 */
	@Override
	public String getColumnSQL() {
		return columnSQL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setColumnSQL(java.lang.String)
	 */
	@Override
	public void setColumnSQL(String columnSQL) {
		this.columnSQL = columnSQL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getDefaultValue()
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setDefaultValue(java.lang.
	 * String)
	 */
	@Override
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getFieldLength()
	 */
	@Override
	public Integer getFieldLength() {
		return fieldLength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setFieldLength(java.lang.
	 * Integer)
	 */
	@Override
	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getFormatPattern()
	 */
	@Override
	public String getFormatPattern() {
		return formatPattern;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setFormatPattern(java.lang.
	 * String)
	 */
	@Override
	public void setFormatPattern(String formatPattern) {
		this.formatPattern = formatPattern;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getInfoFactoryClass()
	 */
	@Override
	public String getInfoFactoryClass() {
		return infoFactoryClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setInfoFactoryClass(java.lang.
	 * String)
	 */
	@Override
	public void setInfoFactoryClass(String infoFactoryClass) {
		this.infoFactoryClass = infoFactoryClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsAllowCopy()
	 */
	@Override
	public Boolean getIsAllowCopy() {
		return isAllowCopy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setIsAllowCopy(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsAllowCopy(Boolean isAllowCopy) {
		this.isAllowCopy = isAllowCopy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsAllowLogging()
	 */
	@Override
	public Boolean getIsAllowLogging() {
		return isAllowLogging;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsAllowLogging(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsAllowLogging(Boolean isAllowLogging) {
		this.isAllowLogging = isAllowLogging;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsAlwaysUpdateable()
	 */
	@Override
	public Boolean getIsAlwaysUpdateable() {
		return isAlwaysUpdateable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsAlwaysUpdateable(java.
	 * lang.Boolean)
	 */
	@Override
	public void setIsAlwaysUpdateable(Boolean isAlwaysUpdateable) {
		this.isAlwaysUpdateable = isAlwaysUpdateable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsAutocomplete()
	 */
	@Override
	public Boolean getIsAutocomplete() {
		return isAutocomplete;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsAutocomplete(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsAutocomplete(Boolean isAutocomplete) {
		this.isAutocomplete = isAutocomplete;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsEncrypted()
	 */
	@Override
	public Boolean getIsEncrypted() {
		return isEncrypted;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setIsEncrypted(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsEncrypted(Boolean isEncrypted) {
		this.isEncrypted = isEncrypted;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsIdentifier()
	 */
	@Override
	public Boolean getIsIdentifier() {
		return isIdentifier;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsIdentifier(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsIdentifier(Boolean isIdentifier) {
		this.isIdentifier = isIdentifier;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsKey()
	 */
	@Override
	public Boolean getIsKey() {
		return isKey;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsKey(java.lang.Boolean)
	 */
	@Override
	public void setIsKey(Boolean isKey) {
		this.isKey = isKey;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsMandatory()
	 */
	@Override
	public Boolean getIsMandatory() {
		return isMandatory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setIsMandatory(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsParent()
	 */
	@Override
	public Boolean getIsParent() {
		return isParent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsParent(java.lang.Boolean)
	 */
	@Override
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsRange()
	 */
	@Override
	public Boolean getIsRange() {
		return isRange;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsRange(java.lang.Boolean)
	 */
	@Override
	public void setIsRange(Boolean isRange) {
		this.isRange = isRange;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsSelectionColumn()
	 */
	@Override
	public Boolean getIsSelectionColumn() {
		return isSelectionColumn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsSelectionColumn(java.lang
	 * .Boolean)
	 */
	@Override
	public void setIsSelectionColumn(Boolean isSelectionColumn) {
		this.isSelectionColumn = isSelectionColumn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsSyncDatabase()
	 */
	@Override
	public Boolean getIsSyncDatabase() {
		return isSyncDatabase;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsSyncDatabase(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsSyncDatabase(Boolean isSyncDatabase) {
		this.isSyncDatabase = isSyncDatabase;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsTranslated()
	 */
	@Override
	public Boolean getIsTranslated() {
		return isTranslated;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsTranslated(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsTranslated(Boolean isTranslated) {
		this.isTranslated = isTranslated;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getIsUpdateable()
	 */
	@Override
	public Boolean getIsUpdateable() {
		return isUpdateable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setIsUpdateable(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsUpdateable(Boolean isUpdateable) {
		this.isUpdateable = isUpdateable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getMandatoryLogic()
	 */
	@Override
	public String getMandatoryLogic() {
		return mandatoryLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setMandatoryLogic(java.lang.
	 * String)
	 */
	@Override
	public void setMandatoryLogic(String mandatoryLogic) {
		this.mandatoryLogic = mandatoryLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getReadOnlyLogic()
	 */
	@Override
	public String getReadOnlyLogic() {
		return readOnlyLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setReadOnlyLogic(java.lang.
	 * String)
	 */
	@Override
	public void setReadOnlyLogic(String readOnlyLogic) {
		this.readOnlyLogic = readOnlyLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getSeqNo()
	 */
	@Override
	public Integer getSeqNo() {
		return seqNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setSeqNo(java.lang.Integer)
	 */
	@Override
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getValueMax()
	 */
	@Override
	public String getValueMax() {
		return valueMax;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setValueMax(java.lang.String)
	 */
	@Override
	public void setValueMax(String valueMax) {
		this.valueMax = valueMax;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getValueMin()
	 */
	@Override
	public String getValueMin() {
		return valueMin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setValueMin(java.lang.String)
	 */
	@Override
	public void setValueMin(String valueMin) {
		this.valueMin = valueMin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getVersion()
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setVersion(java.lang.String)
	 */
	@Override
	public void setVersion(String version) {
		this.version = version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getvFormat()
	 */
	@Override
	public String getvFormat() {
		return vFormat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setvFormat(java.lang.String)
	 */
	@Override
	public void setvFormat(String vFormat) {
		this.vFormat = vFormat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getApiName()
	 */
	@Override
	public String getApiName() {
		return apiName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setApiName(java.lang.String)
	 */
	@Override
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getDataType()
	 */
	@Override
	public FlyDataType getDataType() {
		return dataType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setDataType(org.myfly.platform
	 * .core3.domain.FlyDataType)
	 */
	@Override
	public void setDataType(FlyDataType dataType) {
		this.dataType = dataType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.metadata.service.IFlyColumn#getEntityType()
	 */
	public String getEntityType() {
		return entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.metadata.service.IFlyColumn#setEntityType(java.lang.
	 * String)
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.metadata.service.IFlyColumn#getTableID()
	 */
	public String getTableID() {
		return tableID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.metadata.service.IFlyColumn#setTableID(java.lang.
	 * String)
	 */
	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public String getColumnID() {
		return columnID;
	}

	public void setColumnID(String columnID) {
		this.columnID = columnID;
	}

	public String getElementID() {
		return elementID;
	}

	public void setElementID(String elementID) {
		this.elementID = elementID;
	}

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}
}
