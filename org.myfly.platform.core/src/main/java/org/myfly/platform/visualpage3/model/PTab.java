package org.myfly.platform.visualpage3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core3.datamodel.annotation.FlyReferences;
import org.myfly.platform.core3.datamodel.annotation.FlyTable;
import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.visualpage3.annotation.TableStyle;
import org.myfly.platform.visualpage3.service.IFlyViewTab;

@Entity
@Table
@FlyTable(name = "Tab", description = "Tab within a Window")
@FlyReferences(references = {
		@FlyRefTable(apiName = "tabID", name = "PTab ID", keyColumn = "tabID", displayColumn = "name"),
		@FlyRefTable(apiName = "includedTab", name = "包含页", keyColumn = "tabID", displayColumn = "name") })
public class PTab extends FlyMetaEntity implements IFlyViewTab {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3115436765057343911L;

	@Id
	@Column(length = 32)
	private String tabID;

	@Column(length = 32)
	private String windowID;

	@Column(length = 32)
	private String tableID;

	@Column(length = 32)
	private String imageID;

	@Column(name = "CommitWarning", length = 2000)
	private String commitWarning;

	@Column(name = "DisplayLogic", length = 2000)
	private String displayLogic;

	@Column(name = "EntityType")
	private String entityType;

	@Column(name = "HasTree")
	private Boolean hasTree;

	@Column(name = "ImportFields", length = 1)
	private String importFields;

	@Column(length = 32)
	private String includedTab;

	@Column(name = "IsAdvancedTab")
	private Boolean isAdvancedTab;

	@Column(name = "IsInfoTab")
	private Boolean isInfoTab;

	@Column(name = "IsInsertRecord")
	private Boolean isInsertRecord;

	@Column(name = "IsReadOnly")
	private Boolean isReadOnly;

	@Column(name = "IsSingleRow")
	private Boolean isSingleRow;

	@Column(name = "IsSortTab")
	private Boolean isSortTab;

	@Column(name = "IsTranslationTab")
	private Boolean isTranslationTab;

	@Column(name = "OrderByClause", length = 2000)
	private String orderByClause;

	@Column(length = 32)
	private String parentColumn;

	@Column(name = "Processing")
	private Boolean processing;

	@Column(name = "ReadOnlyLogic", length = 2000)
	private String readOnlyLogic;

	@Column(name = "SeqNo")
	private Integer seqNo;

	@Column(name = "TabLevel")
	private Integer tabLevel;

	@Column(name = "WhereClause")
	private String whereClause;
	
	@Column(name="TableStyle")
	private TableStyle tableStyle;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getCommitWarning()
	 */
	@Override
	public String getCommitWarning() {
		return commitWarning;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setCommitWarning(java.lang.String)
	 */
	@Override
	public void setCommitWarning(String commitWarning) {
		this.commitWarning = commitWarning;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getDisplayLogic()
	 */
	@Override
	public String getDisplayLogic() {
		return displayLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setDisplayLogic(java.lang.String)
	 */
	@Override
	public void setDisplayLogic(String displayLogic) {
		this.displayLogic = displayLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getEntityType()
	 */
	@Override
	public String getEntityType() {
		return entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setEntityType(String)
	 */
	@Override
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getHasTree()
	 */
	@Override
	public Boolean getHasTree() {
		return hasTree;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setHasTree(java.lang.Boolean)
	 */
	@Override
	public void setHasTree(Boolean hasTree) {
		this.hasTree = hasTree;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getImportFields()
	 */
	@Override
	public String getImportFields() {
		return importFields;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setImportFields(java.lang.String)
	 */
	@Override
	public void setImportFields(String importFields) {
		this.importFields = importFields;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getIsAdvancedTab()
	 */
	@Override
	public Boolean getIsAdvancedTab() {
		return isAdvancedTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setIsAdvancedTab(java.lang.Boolean)
	 */
	@Override
	public void setIsAdvancedTab(Boolean isAdvancedTab) {
		this.isAdvancedTab = isAdvancedTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getIsInfoTab()
	 */
	@Override
	public Boolean getIsInfoTab() {
		return isInfoTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setIsInfoTab(java.lang.Boolean)
	 */
	@Override
	public void setIsInfoTab(Boolean isInfoTab) {
		this.isInfoTab = isInfoTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getIsInsertRecord()
	 */
	@Override
	public Boolean getIsInsertRecord() {
		return isInsertRecord;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setIsInsertRecord(java.lang.Boolean)
	 */
	@Override
	public void setIsInsertRecord(Boolean isInsertRecord) {
		this.isInsertRecord = isInsertRecord;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getIsReadOnly()
	 */
	@Override
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setIsReadOnly(java.lang.Boolean)
	 */
	@Override
	public void setIsReadOnly(Boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getIsSingleRow()
	 */
	@Override
	public Boolean getIsSingleRow() {
		return isSingleRow;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setIsSingleRow(java.lang.Boolean)
	 */
	@Override
	public void setIsSingleRow(Boolean isSingleRow) {
		this.isSingleRow = isSingleRow;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getIsSortTab()
	 */
	@Override
	public Boolean getIsSortTab() {
		return isSortTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setIsSortTab(java.lang.Boolean)
	 */
	@Override
	public void setIsSortTab(Boolean isSortTab) {
		this.isSortTab = isSortTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getIsTranslationTab()
	 */
	@Override
	public Boolean getIsTranslationTab() {
		return isTranslationTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setIsTranslationTab(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsTranslationTab(Boolean isTranslationTab) {
		this.isTranslationTab = isTranslationTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getOrderByClause()
	 */
	@Override
	public String getOrderByClause() {
		return orderByClause;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setOrderByClause(java.lang.String)
	 */
	@Override
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getProcessing()
	 */
	@Override
	public Boolean getProcessing() {
		return processing;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setProcessing(java.lang.Boolean)
	 */
	@Override
	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getReadOnlyLogic()
	 */
	@Override
	public String getReadOnlyLogic() {
		return readOnlyLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setReadOnlyLogic(java.lang.String)
	 */
	@Override
	public void setReadOnlyLogic(String readOnlyLogic) {
		this.readOnlyLogic = readOnlyLogic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getSeqNo()
	 */
	@Override
	public Integer getSeqNo() {
		return seqNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setSeqNo(java.lang.Integer)
	 */
	@Override
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getTabLevel()
	 */
	@Override
	public Integer getTabLevel() {
		return tabLevel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setTabLevel(java.lang.Integer)
	 */
	@Override
	public void setTabLevel(Integer tabLevel) {
		this.tabLevel = tabLevel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getWhereClause()
	 */
	@Override
	public String getWhereClause() {
		return whereClause;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setWhereClause(java.lang.String)
	 */
	@Override
	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}

	@Override
	public String getWindowID() {
		return windowID;
	}

	@Override
	public void setWindowID(String windowID) {
		this.windowID = windowID;
	}

	@Override
	public String getTableID() {
		return tableID;
	}

	@Override
	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	@Override
	public String getImageID() {
		return imageID;
	}

	@Override
	public void setImageID(String imageID) {
		this.imageID = imageID;
	}

	@Override
	public String getIncludedTab() {
		return includedTab;
	}

	@Override
	public void setIncludedTab(String includedTab) {
		this.includedTab = includedTab;
	}

	@Override
	public String getParentColumn() {
		return parentColumn;
	}

	@Override
	public void setParentColumn(String parentColumn) {
		this.parentColumn = parentColumn;
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
	public TableStyle getTableStyle() {
		return tableStyle;
	}

	@Override
	public void setTableStyle(TableStyle tableStyle) {
		this.tableStyle = tableStyle;
	}

}
