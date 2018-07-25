package org.myfly.platform.visualpage3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.visualpage3.service.IFlyViewField;

@Entity
@Table(name = "PT_Field")
@FlyTable(name = "Field", description = "Field on a database table")
@FlyRefTable(apiName = "fieldID", name = "Field Name", displayColumn = "name", keyColumn = "fieldID")
public class PField extends FlyMetaEntity implements IFlyViewField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 32)
	private String fieldID;

	@Column(length = 32)
	private String columnID;

	@Column(length = 32)
	private String fieldGroupID;

	@Column(length = 40)
	private FlyDataType dataType;

	@Column(length = 32)
	private String referenceID;

	@Column(length = 32)
	private String tabID;

	@Column(name = "DefaultValue", length = 2000)
	private String defaultValue;

	@Column(name = "DisplayLength")
	private Integer displayLength;

	@Column(name = "DisplayLogic", length = 2000)
	private String displayLogic;

	@Column(name = "EntityType")
	private String entityType;

	@Column(length = 32)
	private String includedTab;

	@Column(name = "InfoFactoryClass")
	private String infoFactoryClass;

	@Column(name = "IsAllowCopy")
	private Boolean isAllowCopy;

	@Column(name = "IsCentrallyMaintained")
	private Boolean isCentrallyMaintained;

	@Column(name = "IsDisplayed")
	private Boolean isDisplayed;

	@Column(name = "IsDisplayedGrid")
	private Boolean isDisplayedGrid;

	@Column(name = "IsEmbedded")
	private Boolean isEmbedded;

	@Column(name = "IsEncrypted")
	private Boolean isEncrypted;

	@Column(name = "IsFieldOnly")
	private Boolean isFieldOnly;

	@Column(name = "IsHeading")
	private Boolean isHeading;

	@Column(name = "IsMandatory")
	private Boolean isMandatory;

	@Column(name = "IsReadOnly")
	private Boolean isReadOnly;

	@Column(name = "IsSameLine")
	private Boolean isSameLine;

	@Column(name = "ObscureType")
	private String obscureType;

	@Column(name = "PreferredWidth")
	private Boolean preferredWidth;

	@Column(name = "SeqNo")
	private Integer seqNo;

	@Column(name = "SeqNoGrid")
	private Integer seqNoGrid;

	@Column(name = "SortNo")
	private Integer sortNo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getDefaultValue()
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setDefaultValue(java.lang.
	 * String)
	 */
	@Override
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getInfoFactoryClass()
	 */
	@Override
	public String getInfoFactoryClass() {
		return infoFactoryClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setInfoFactoryClass(java.
	 * lang.String)
	 */
	@Override
	public void setInfoFactoryClass(String infoFactoryClass) {
		this.infoFactoryClass = infoFactoryClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsAllowCopy()
	 */
	@Override
	public Boolean getIsAllowCopy() {
		return isAllowCopy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsAllowCopy(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsAllowCopy(Boolean isAllowCopy) {
		this.isAllowCopy = isAllowCopy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#getIsCentrallyMaintained()
	 */
	@Override
	public Boolean getIsCentrallyMaintained() {
		return isCentrallyMaintained;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsCentrallyMaintained(
	 * java.lang.Boolean)
	 */
	@Override
	public void setIsCentrallyMaintained(Boolean isCentrallyMaintained) {
		this.isCentrallyMaintained = isCentrallyMaintained;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsDisplayed()
	 */
	@Override
	public Boolean getIsDisplayed() {
		return isDisplayed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsDisplayed(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsDisplayed(Boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsDisplayedGrid()
	 */
	@Override
	public Boolean getIsDisplayedGrid() {
		return isDisplayedGrid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsDisplayedGrid(java.
	 * lang.Boolean)
	 */
	@Override
	public void setIsDisplayedGrid(Boolean isDisplayedGrid) {
		this.isDisplayedGrid = isDisplayedGrid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsEmbedded()
	 */
	@Override
	public Boolean getIsEmbedded() {
		return isEmbedded;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsEmbedded(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsEmbedded(Boolean isEmbedded) {
		this.isEmbedded = isEmbedded;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsEncrypted()
	 */
	@Override
	public Boolean getIsEncrypted() {
		return isEncrypted;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsEncrypted(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsEncrypted(Boolean isEncrypted) {
		this.isEncrypted = isEncrypted;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsFieldOnly()
	 */
	@Override
	public Boolean getIsFieldOnly() {
		return isFieldOnly;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsFieldOnly(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsFieldOnly(Boolean isFieldOnly) {
		this.isFieldOnly = isFieldOnly;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsHeading()
	 */
	@Override
	public Boolean getIsHeading() {
		return isHeading;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsHeading(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsHeading(Boolean isHeading) {
		this.isHeading = isHeading;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsMandatory()
	 */
	@Override
	public Boolean getIsMandatory() {
		return isMandatory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsMandatory(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsReadOnly()
	 */
	@Override
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsReadOnly(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsReadOnly(Boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIsSameLine()
	 */
	@Override
	public Boolean getIsSameLine() {
		return isSameLine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIsSameLine(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsSameLine(Boolean isSameLine) {
		this.isSameLine = isSameLine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getPreferredWidth()
	 */
	@Override
	public Boolean getPreferredWidth() {
		return preferredWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setPreferredWidth(java.lang
	 * .Boolean)
	 */
	@Override
	public void setPreferredWidth(Boolean preferredWidth) {
		this.preferredWidth = preferredWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getSeqNo()
	 */
	@Override
	public Integer getSeqNo() {
		return seqNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setSeqNo(java.lang.Integer)
	 */
	@Override
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getSeqNoGrid()
	 */
	@Override
	public Integer getSeqNoGrid() {
		return seqNoGrid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setSeqNoGrid(java.lang.
	 * Integer)
	 */
	@Override
	public void setSeqNoGrid(Integer seqNoGrid) {
		this.seqNoGrid = seqNoGrid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getSortNo()
	 */
	@Override
	public Integer getSortNo() {
		return sortNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#setSortNo(java.lang.
	 * Integer)
	 */
	@Override
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getDisplayLength()
	 */
	@Override
	public Integer getDisplayLength() {
		return displayLength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setDisplayLength(java.lang.
	 * Integer)
	 */
	@Override
	public void setDisplayLength(Integer displayLength) {
		this.displayLength = displayLength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getDisplayLogic()
	 */
	@Override
	public String getDisplayLogic() {
		return displayLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setDisplayLogic(java.lang.
	 * String)
	 */
	@Override
	public void setDisplayLogic(String displayLogic) {
		this.displayLogic = displayLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getObscureType()
	 */
	@Override
	public String getObscureType() {
		return obscureType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setObscureType(java.lang.
	 * String)
	 */
	@Override
	public void setObscureType(String obscureType) {
		this.obscureType = obscureType;
	}

	@Override
	public String getFieldID() {
		return fieldID;
	}

	@Override
	public void setFieldID(String fieldID) {
		this.fieldID = fieldID;
	}

	@Override
	public String getColumnID() {
		return columnID;
	}

	@Override
	public void setColumnID(String columnID) {
		this.columnID = columnID;
	}

	@Override
	public String getFieldGroupID() {
		return fieldGroupID;
	}

	@Override
	public void setFieldGroupID(String fieldGroupID) {
		this.fieldGroupID = fieldGroupID;
	}

	@Override
	public FlyDataType getDataType() {
		return dataType;
	}

	@Override
	public void setDataType(FlyDataType dataType) {
		this.dataType = dataType;
	}

	@Override
	public String getReferenceID() {
		return referenceID;
	}

	@Override
	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	@Override
	public String getTabID() {
		return tabID;
	}

	@Override
	public void setTabID(String tabID) {
		this.tabID = tabID;
	}

	@Override
	public String getEntityType() {
		return entityType;
	}

	@Override
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	@Override
	public String getIncludedTab() {
		return includedTab;
	}

	@Override
	public void setIncludedTab(String includedTab) {
		this.includedTab = includedTab;
	}
}
