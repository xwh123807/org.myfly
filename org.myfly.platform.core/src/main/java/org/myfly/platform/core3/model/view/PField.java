package org.myfly.platform.core3.model.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.service.IFlyViewField;
import org.myfly.platform.core3.metadata.service.IFlyViewTab;
import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PRefList;
import org.myfly.platform.core3.model.data.PReference;

@Entity
@Table(name = "PT_Field")
@FlyTable(name = "Field", description = "Field on a database table")
public class PField extends FlyEntity implements IFlyViewField {
	@FlyField(name = "Column", description = "Column in the table", help = "Link to the database column of the table")
	@ManyToOne
	private PColumn column;

	@FlyField(name = "Field Group", description = "Logical grouping of fields", help = "The Field Group indicates the logical group that this field belongs to (History, Amounts, Quantities)")
	@ManyToOne
	private PFieldGroup fieldGroup;

	@FlyField(name = "Reference", description = "System Reference and Validation", help = "The Reference could be a display type, list or table validation.")
	@ManyToOne
	private PReference reference;

	@FlyField(name = "Reference Key", description = "Required to specify, if data type is Table or List", help = "The Reference Value indicates where the reference values are stored.  It must be specified if the data type is Table or List.  ")
	@ManyToOne
	private PRefList refList;

	@FlyField(name = "Tab", description = "Tab within a Window", help = "The Tab indicates a tab that displays within a window.")
	@ManyToOne(targetEntity = PTab.class)
	private IFlyViewTab tab;

	@FlyField(name = "Default Logic", description = "Default value hierarchy, separated by ;", help = "The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.")
	@Column(name = "DefaultValue", length = 2000)
	private String defaultValue;

	@FlyField(name = "Description", description = "Optional short description of the record", help = "A description is limited to 255 characters.")
	@Column(name = "Description")
	private String description;

	@FlyField(name = "Display Length", description = "Length of the display in characters", help = "The display length is mainly for String fields. The length has no impact, if the data type of the field is - Integer, Number, Amount	(length determined by the system) - YesNo	(Checkbox) - List, Table, TableDir	(length of combo boxes are determined by their content at runtime)")
	@Column(name = "DisplayLength")
	private Integer displayLength;

	@FlyField(name = "Display Logic", description = "If the Field is displayed, the result determines if the field is actually displayed", help = "format := {expression} [{logic} {expression}]<br> \n"
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

	@FlyField(name = "Comment/Help", dataType = FlyDataType.Text, description = "Comment or Hint", help = "The Help field contains a hint, comment or help about the use of this item.")
	@Column(length = 2000)
	private String help;

	@FlyField(name = "Included Tab", description = "Included Tab in this Tab (Master Detail)", help = "You can include a Tab in a Tab. If displayed in single row record, the included tab is displayed as multi-row table.")
	@ManyToOne(targetEntity = PTab.class, fetch = FetchType.LAZY)
	private IFlyViewTab includedTab;

	@FlyField(name = "Info Factory Class", description = "Fully qualified class name that implements the InfoFactory interface", help = "Fully qualified class name that implements the InfoFactory interface. This can be use to provide custom Info class for column.")
	@Column(name = "InfoFactoryClass")
	private String infoFactoryClass;

	@FlyField(name = "Allow Copy", description = "Defines whether the value of this field is considered in the copy of record", help = "The default value is yes, it is recommended that values such as ID, document action, document status  should be defined as no.")
	@Column(name = "IsAllowCopy")
	private Boolean isAllowCopy;

	@FlyField(name = "Centrally maintained", description = "Information maintained in System Element table", help = "The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table  or 'Window' table.")
	@Column(name = "IsCentrallyMaintained")
	private Boolean isCentrallyMaintained;

	@FlyField(name = "Displayed", description = "Determines, if this field is displayed", help = "If the field is displayed, the field Display Logic will determine at runtime, if it is actually displayed")
	@Column(name = "IsDisplayed")
	private Boolean isDisplayed;

	@FlyField(name = "Displayed in Grid", description = "Determines, if this field is displayed in grid view", help = "Default whether this field is displayed when grid view is selected.")
	@Column(name = "IsDisplayedGrid")
	private Boolean isDisplayedGrid;

	@FlyField(name = "Is Embedded", description = "When checked of include tab is embedded", help = "")
	@Column(name = "IsEmbedded")
	private Boolean isEmbedded;

	@FlyField(name = "Encrypted", description = "Display or Storage is encrypted", help = "Display encryption (in Window/Tab/Field) - all characters are displayed as '*' - in the database it is stored in clear text. You will not be able to report on these columns.<br>\n"
			+ "Data storage encryption (in Table/Column) - data is stored encrypted in the database (dangerous!) and you will not be able to report on those columns. Independent from Display encryption.")
	@Column(name = "IsEncrypted")
	private Boolean isEncrypted;

	@FlyField(name = "Field Only", description = "The Field Only checkbox indicates that the column will display without a label.", help = "The Field Only checkbox indicates that the column will display without a label.")
	@Column(name = "IsFieldOnly")
	private Boolean isFieldOnly;

	@FlyField(name = "Heading only", description = "Field without Column - Only label is displayed", help = "The Heading Only checkbox indicates if just the label will display on the screen")
	@Column(name = "IsHeading")
	private Boolean IsHeading;

	@FlyField(name = "Mandatory", description = "Data entry is required in this column", help = "The field must have a value for the record to be saved to the database.")
	@Column(name = "IsMandatory")
	private Boolean isMandatory;

	@FlyField(name = "Read Only", description = "Field is read only", help = "The Read Only indicates that this field may only be Read.  It may not be updated.")
	@Column(name = "IsReadOnly")
	private Boolean isReadOnly;

	@FlyField(name = "Same Line", description = "Displayed on same line as previous field", help = "The Same Line checkbox indicates that the field will display on the same line as the previous field.")
	@Column(name = "IsSameLine")
	private Boolean isSameLine;

	@FlyField(name = "Name", description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;

	@FlyField(name = "Obscure", description = "Type of obscuring the data (limiting the display)", help = "")
	@Column(name = "ObscureType")
	private String obscureType;

	@FlyField(name = "Preferred Width", description = "Preferred width in pixels", help = "")
	@Column(name = "PreferredWidth")
	private Boolean PreferredWidth;

	@FlyField(name = "Sequence", description = "Method of ordering records; lowest number comes first", help = "The Sequence indicates the order of records")
	@Column(name = "SeqNo")
	private Integer seqNo;

	@FlyField(name = "Grid Sequence", description = "Method of ordering records; lowest number comes first", help = "The Sequence indicates the order of columns in grid view")
	@Column(name = "SeqNoGrid")
	private Integer seqNoGrid;

	@FlyField(name = "Record Sort No", description = "Determines in what order the records are displayed", help = "The Record Sort No indicates the ascending sort sequence of the records. If the number is negative, the records are sorted descending. \n"
			+ "Example: A tab with C_DocType_ID (1), DocumentNo (-2) will be sorted ascending by document type and descending by document number (SQL: ORDER BY C_DocType, DocumentNo DESC)")
	@Column(name = "SortNo")
	private Integer SortNo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getColumn()
	 */
	@Override
	public PColumn getColumn() {
		return column;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#setColumn(org.myfly.
	 * platform.core3.model.data.PColumn)
	 */
	@Override
	public void setColumn(PColumn column) {
		this.column = column;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getFieldGroup()
	 */
	@Override
	public PFieldGroup getFieldGroup() {
		return fieldGroup;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setFieldGroup(org.myfly.
	 * platform.core3.model.view.PFieldGroup)
	 */
	@Override
	public void setFieldGroup(PFieldGroup fieldGroup) {
		this.fieldGroup = fieldGroup;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getReference()
	 */
	@Override
	public PReference getReference() {
		return reference;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setReference(org.myfly.
	 * platform.core3.model.data.PReference)
	 */
	@Override
	public void setReference(PReference reference) {
		this.reference = reference;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getRefList()
	 */
	@Override
	public PRefList getRefList() {
		return refList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#setRefList(org.myfly.
	 * platform.core3.model.data.PRefList)
	 */
	@Override
	public void setRefList(PRefList refList) {
		this.refList = refList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getTab()
	 */
	@Override
	public IFlyViewTab getTab() {
		return tab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setTab(org.myfly.platform.
	 * core3.model.view.IFlyViewTab)
	 */
	@Override
	public void setTab(IFlyViewTab tab) {
		this.tab = tab;
	}

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
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setDescription(java.lang.
	 * String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getEntityType()
	 */
	@Override
	public EntityType getEntityType() {
		return entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setEntityType(org.myfly.
	 * platform.core3.domain.EntityType)
	 */
	@Override
	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getHelp()
	 */
	@Override
	public String getHelp() {
		return help;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setHelp(java.lang.String)
	 */
	@Override
	public void setHelp(String help) {
		this.help = help;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getIncludedTab()
	 */
	@Override
	public IFlyViewTab getIncludedTab() {
		return includedTab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setIncludedTab(org.myfly.
	 * platform.core3.model.view.IFlyViewTab)
	 */
	@Override
	public void setIncludedTab(IFlyViewTab includedTab) {
		this.includedTab = includedTab;
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
		return IsHeading;
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
		IsHeading = isHeading;
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
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewField#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#getPreferredWidth()
	 */
	@Override
	public Boolean getPreferredWidth() {
		return PreferredWidth;
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
		PreferredWidth = preferredWidth;
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
		return SortNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewField#setSortNo(java.lang.
	 * Integer)
	 */
	@Override
	public void setSortNo(Integer sortNo) {
		SortNo = sortNo;
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
}
