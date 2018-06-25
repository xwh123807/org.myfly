package org.myfly.platform.core3.model.view;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.service.IFlyViewField;
import org.myfly.platform.core3.metadata.service.IFlyViewModel;
import org.myfly.platform.core3.metadata.service.IFlyViewTab;
import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.dict.PImage;

@Entity
@Table
@FlyTable(name = "Tab", description = "Tab within a Window")
public class PTab extends FlyEntity implements IFlyViewTab {
	@FlyField(name = "Window", description = "Data entry or display window", help = "The Window field identifies a unique Window in the system.")
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PWindow.class)
	private IFlyViewModel window;

	@FlyField(name = "Table", description = "Database Table information", help = "The Database Table provides the information of the table definition")
	@ManyToOne(fetch = FetchType.LAZY)
	private PTable table;

	@FlyField(name = "Image", description = "Image or Icon", help = "Images and Icon can be used to display supported graphic formats (gif, jpg, png).\n"
			+ "You can either load the image (in the database) or point to a graphic via a URI (i.e. it can point to a resource, http address)")
	@ManyToOne(fetch = FetchType.LAZY)
	private PImage image;

	@FlyField(name = "Commit Warning", dataType = FlyDataType.Text, description = "Warning displayed when saving", help = "Warning or information displayed when committing the record")
	@Column(name = "CommitWarning", length = 2000)
	private String commitWarning;

	@FlyField(name = "Description", description = "Optional short description of the record", help = "A description is limited to 255 characters.")
	@Column(name = "Description")
	private String description;

	@FlyField(name = "Display Logic", dataType = FlyDataType.Text, description = "If the Field is displayed, the result determines if the field is actually displayed", help = "format := {expression} [{logic} {expression}]<br> \n"
			+ "expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> \n"
			+ "logic := {|}|{&}<br>\n" + "context := any global or window context <br>\n"
			+ "value := strings or numbers<br>\n"
			+ "logic operators	:= AND or OR with the previous result from left to right <br>\n"
			+ "operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>\n" + "Examples: <br>\n"
			+ "@AD_Table_ID@=14 | @Language@!GERGER <br>\n" + "@PriceLimit@>10 | @PriceList@>@PriceActual@<br>\n"
			+ "@Name@>J<br>\n" + "Strings may be in single quotes (optional)")
	@Column(name = "DisplayLogic", length = 2000)
	private String displayLogic;

	@FlyField(name = "Entity Type", dataType = FlyDataType.Table, description = "Dictionary Entity Type; Determines ownership and synchronization", help = "The Entity Types \"Dictionary\", \"Adempiere\" and \"Application\" might be automatically synchronized and customizations deleted or overwritten.  \n"
			+ "\n" + "For customizations, copy the entity and select \"User\"!")
	@Column(name = "EntityType")
	private EntityType entityType;

	@FlyField(name = "Has Tree", description = "Window has Tree Graph", help = "The Has Tree checkbox indicates if this window displays a tree metaphor.")
	@Column(name = "HasTree")
	private Boolean hasTree;

	@FlyField(name = "Comment/Help", dataType = FlyDataType.Text, description = "Comment or Hint", help = "The Help field contains a hint, comment or help about the use of this item.")
	@Column(length = 2000)
	private String help;

	@FlyField(name = "Import Fields", dataType = FlyDataType.Button, description = "Create Fields from Table Columns", help = "")
	@Column(name = "ImportFields", length = 1)
	private String importFields;

	@FlyField(name = "Included Tab", description = "Included Tab in this Tab (Master Detail)", help = "You can include a Tab in a Tab. If displayed in single row record, the included tab is displayed as multi-row table.")
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PTab.class)
	private IFlyViewTab includedTab;

	@FlyField(name = "Advanced Tab", description = "This Tab contains advanced Functionality", help = "The tab with advanced functionality is only displayed, if enabled in Tools>Preference.")
	@Column(name = "IsAdvancedTab")
	private Boolean isAdvancedTab;

	@FlyField(name = "Accounting Tab", description = "This Tab contains accounting information", help = "The Accounting Tab checkbox indicates if this window contains accounting information. To display accounting information, enable this in Tools>Preference and Role.")
	@Column(name = "IsInfoTab")
	private Boolean isInfoTab;

	@FlyField(name = "Insert Record", description = "The user can insert a new Record", help = "If not selected, the user cannot create a new Record.  This is automatically disabled, if the Tab is Read Only.")
	@Column(name = "IsInsertRecord")
	private Boolean isInsertRecord;

	@FlyField(name = "Read Only", description = "Field is read only", help = "The Read Only indicates that this field may only be Read.  It may not be updated.")
	@Column(name = "IsReadOnly")
	private Boolean isReadOnly;

	@FlyField(name = "Single Row Layout", description = "Default for toggle between Single- and Multi-Row (Grid) Layout", help = "The Single Row Layout checkbox indicates if the default display type for this window is a single row as opposed to multi row.")
	@Column(name = "IsSingleRow")
	private Boolean isSingleRow;

	@FlyField(name = "Order Tab", description = "The Tab determines the Order", help = "")
	@Column(name = "IsSortTab")
	private Boolean isSortTab;

	@FlyField(name = "TranslationTab", description = "This Tab contains translation information", help = "The Translation Tab checkbox indicate if a tab contains translation information. To display translation information, enable this in Tools>Preference.")
	@Column(name = "IsTranslationTab")
	private Boolean isTranslationTab;

	@FlyField(name = "Name", description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;

	@FlyField(name = "Sql ORDER BY", dataType = FlyDataType.Text, description = "Fully qualified ORDER BY clause", help = "The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection")
	@Column(name = "OrderByClause", length = 2000)
	private String orderByClause;

	@FlyField(name = "Parent Column", description = "The link column on the parent tab.", help = "")
	@ManyToOne(fetch = FetchType.LAZY)
	private PColumn parentColumn;

	@FlyField(name = "Process Now", description = "", help = "")
	@Column(name = "Processing")
	private Boolean processing;

	@FlyField(name = "Read Only Logic", description = "Logic to determine if field is read only (applies only when field is read-write)", help = "format := {expression} [{logic} {expression}]<br> \n"
			+ "expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> \n"
			+ "logic := {|}|{&}<br>\n" + "context := any global or window context <br>\n"
			+ "value := strings or numbers<br>\n"
			+ "logic operators	:= AND or OR with the previous result from left to right <br>\n"
			+ "operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>\n" + "Examples: <br>\n"
			+ "@AD_Table_ID@=14 | @Language@!GERGER <br>\n" + "@PriceLimit@>10 | @PriceList@>@PriceActual@<br>\n"
			+ "@Name@>J<br>\n" + "Strings may be in single quotes (optional)")
	@Column(name = "ReadOnlyLogic", length = 2000)
	private String readOnlyLogic;

	@FlyField(name = "Sequence", description = "Method of ordering records; lowest number comes first", help = "The Sequence indicates the order of records")
	@Column(name = "SeqNo")
	private Integer seqNo;

	@FlyField(name = "Tab Level", description = "Hierarchical Tab Level (0 = top)", help = "Hierarchical level of the tab. If the level is 0, it is the top entity. Level 1 entries are dependent on level 0, etc.")
	@Column(name = "TabLevel")
	private Integer tabLevel;

	@FlyField(name = "Sql WHERE", description = "Fully qualified SQL WHERE clause", help = "The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means \"tablename.columnname\".")
	@Column(name = "WhereClause")
	private String whereClause;

	@OneToMany(mappedBy = "tab", fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, targetEntity = PField.class)
	private Set<IFlyViewField> fields;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getWindow()
	 */
	@Override
	public IFlyViewModel getWindow() {
		return window;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setWindow(org.myfly.platform.core3.
	 * model.view.PWindow)
	 */
	@Override
	public void setWindow(IFlyViewModel window) {
		this.window = window;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getTable()
	 */
	@Override
	public PTable getTable() {
		return table;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setTable(org.myfly.platform.core3.
	 * model.data.PTable)
	 */
	@Override
	public void setTable(PTable table) {
		this.table = table;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getImage()
	 */
	@Override
	public PImage getImage() {
		return image;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setImage(org.myfly.platform.core3.
	 * model.dict.PImage)
	 */
	@Override
	public void setImage(PImage image) {
		this.image = image;
	}

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
	 * @see org.myfly.platform.core3.model.view.ITab#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
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
	public EntityType getEntityType() {
		return entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setEntityType(org.myfly.platform.
	 * core3.domain.EntityType)
	 */
	@Override
	public void setEntityType(EntityType entityType) {
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
	 * @see org.myfly.platform.core3.model.view.ITab#getHelp()
	 */
	@Override
	public String getHelp() {
		return help;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setHelp(java.lang.String)
	 */
	@Override
	public void setHelp(String help) {
		this.help = help;
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
	 * @see org.myfly.platform.core3.model.view.ITab#getIncludedTab()
	 */
	@Override
	public IFlyViewTab getIncludedTab() {
		return includedTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setIncludedTab(org.myfly.platform.
	 * core3.model.view.ITab)
	 */
	@Override
	public void setIncludedTab(IFlyViewTab includedTab) {
		this.includedTab = includedTab;
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
	 * @see org.myfly.platform.core3.model.view.ITab#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
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
	 * @see org.myfly.platform.core3.model.view.ITab#getParentColumn()
	 */
	@Override
	public PColumn getParentColumn() {
		return parentColumn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.ITab#setParentColumn(org.myfly.platform.
	 * core3.model.data.PColumn)
	 */
	@Override
	public void setParentColumn(PColumn parentColumn) {
		this.parentColumn = parentColumn;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#getFields()
	 */
	@Override
	public Set<IFlyViewField> getFields() {
		return fields;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.ITab#setFields(java.util.Set)
	 */
	@Override
	public void setFields(Set<IFlyViewField> fields) {
		this.fields = fields;
	}
}
