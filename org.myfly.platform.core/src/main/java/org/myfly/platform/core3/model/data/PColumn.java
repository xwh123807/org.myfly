package org.myfly.platform.core3.model.data;

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
import org.myfly.platform.core3.metadata.service.IFlyColumn;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;

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
public class PColumn extends FlyEntity implements IFlyColumn {
	@FlyField(name = "API Name")
	@Column(length = 50, name = "ApiName")
	private String apiName;

	@FlyField(description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;

	@FlyField(description = "Optional short description of the record", help = "A description is limited to 255 characters.", entityType = EntityType.D)
	@Column(length = 255)
	private String description;

	@FlyField(name = "Comment/Help", dataType = FlyDataType.Text, description = "Comment or Hint", help = "The Help field contains a hint, comment or help about the use of this item.")
	@Column(length = 2000)
	private String help;

	@FlyField(description = "Dictionary Entity Type; Determines ownership and synchronization", help = "The Entity Types \"Dictionary\", \"Adempiere\" and \"Application\" might be automatically synchronized and customizations deleted or overwritten.  \n"
			+ "\n" + "For customizations, copy the entity and select \"User\"!")
	@Column(name = "EntityType")
	private EntityType entityType;

	@FlyField(name = "Callout", description = "Fully qualified class names and method - separated by semicolons", help = "A Callout allow you to create Java extensions to perform certain tasks always after a value changed. Callouts should not be used for validation but consequences of a user selecting a certain value.\n"
			+ "The callout is a Java class implementing org.compiere.model.Callout and a method name to call.  Example: \"org.compiere.model.CalloutRequest.copyText\" instantiates the class \"CalloutRequest\" and calls the method \"copyText\". You can have multiple callouts by separating them via a semicolon")
	@Column(length = 255)
	private String callout;

	@FlyField(name = "DB Column Name", description = "Name of the column in the database", help = "The Column Name indicates the name of a column on a table as defined in the database.")
	@Column(length = 30, name = "ColumnName")
	private String columnName;

	@FlyField(name = "Data Type")
	@Column(name = "DataType")
	private FlyDataType dataType;

	@FlyField(name = "Column SQL", dataType = FlyDataType.Text, description = "Virtual Column (r/o)", help = "You can define virtual columns (not stored in the database). If defined, the Column name is the synonym of the SQL expression defined here. The SQL expression must be valid.<br>\n"
			+ "Example: \"Updated-Created\" would list the age of the entry in days")
	@Column(length = 2000, name = "ColumnSQL")
	private String columnSQL;

	@FlyField(name = "Default Logic", dataType = FlyDataType.Text, description = "Default value hierarchy, separated by ;", help = "The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.")
	@Column(length = 2000, name = "DefaultValue")
	private String defaultValue;

	@FlyField(name = "Length", description = "Length of the column in the database", help = "The Length indicates the length of a column as defined in the database.")
	@Column(name = "FieldLength")
	private Integer fieldLength;

	@FlyField(name = "Format Pattern", description = "The pattern used to format a number or date.", help = "A string complying with either Java SimpleDateFormat or DecimalFormat pattern syntax used to override the default presentation format of a date or number type field.")
	@Column(length = 22, name = "FormatPattern")
	private String formatPattern;

	@FlyField(name = "Info Factory Class", description = "Fully qualified class name that implements the InfoFactory interface", help = "Fully qualified class name that implements the InfoFactory interface. This can be use to provide custom Info class for column.")
	@Column(length = 255, name = "InfoFactoryClass")
	private String infoFactoryClass;

	@FlyField(name = "Allow Copy", dataType = FlyDataType.YesNo, defaultValue = "Y", description = "Defines whether the value of this field is considered in the copy of record", help = "The default value is yes, it is recommended that values such as ID, document action, document status  should be defined as no.")
	@Column(name = "IsAllowCopy")
	private Boolean isAllowCopy;

	@FlyField(name = "Allow Logging", dataType = FlyDataType.YesNo, description = "Determine if a column must be recorded into the change log")
	@Column(name = "IsAllowLogging")
	private Boolean isAllowLogging;

	@FlyField(name = "Always Updateable", description = "The column is always updateable, even if the record is not active or processed", help = "If selected and if the window / tab is not read only, you can always update the column.  This might be useful for comments, etc.")
	@Column(name = "IsAlwaysUpdateable")
	private Boolean isAlwaysUpdateable;

	@FlyField(name = "Autocomplete", description = "Automatic completion for textfields", help = "The autocompletion uses all existing values (from the same client and organization) of the field.")
	@Column(name = "IsAutocomplete")
	private Boolean isAutocomplete;

	@FlyField(name = "Encrypted", dataType = FlyDataType.Button, description = "Display or Storage is encrypted", help = "Display encryption (in Window/Tab/Field) - all characters are displayed as '*' - in the database it is stored in clear text. You will not be able to report on these columns.<br>\n"
			+ "Data storage encryption (in Table/Column) - data is stored encrypted in the database (dangerous!) and you will not be able to report on those columns. Independent from Display encryption.")
	@Column(name = "IsEncrypted")
	private Boolean isEncrypted;

	@FlyField(name = "Identifier", description = "This column is part of the record identifier", help = "The Identifier checkbox indicates that this column is part of the identifier or key for this table.  ")
	@Column(name = "IsIdentifier")
	private Boolean isIdentifier;

	@FlyField(name = "Key column", description = "This column is the key in this table", help = "The key column must also be display sequence 0 in the field definition and may be hidden.")
	@Column(name = "IsKey")
	private Boolean isKey;

	@FlyField(name = "Mandatory", description = "Data entry is required in this column", help = "The field must have a value for the record to be saved to the database.")
	@Column(name = "IsMandatory")
	private Boolean isMandatory;

	@FlyField(name = "Parent link column", description = "This column is a link to the parent table (e.g. header from lines) - incl. Association key columns", help = "The Parent checkbox indicates if this column is a link to the parent table.")
	@Column(name = "IsParent")
	private Boolean isParent;

	@FlyField(name = "Range", description = "The parameter is a range of values", help = "The Range checkbox indicates that this parameter is a range of values.")
	@Column(name = "IsRange")
	private Boolean isRange;

	@FlyField(name = "Selection Column", description = "Is this column used for finding rows in windows", help = "If selected, the column is listed in the first find window tab and in the selection part of the window")
	@Column(name = "IsSelectionColumn")
	private Boolean isSelectionColumn;

	@FlyField(name = "Synchronize Database", description = "Change database table definition when changing dictionary definition", help = "When selected, the database column definition is updated based on your entries in the Column definition of the Application Dictionary.")
	@Column(name = "IsSyncDatabase")
	private Boolean isSyncDatabase;

	@FlyField(name = "Translated", description = "This column is translated", help = "The Translated checkbox indicates if this column is translated.")
	@Column(name = "IsTranslated")
	private Boolean isTranslated;

	@FlyField(name = "Updatable", defaultValue = "Y", description = "Determines, if the field can be updated", help = "The Updatable checkbox indicates if a field can be updated by the user.")
	@Column(name = "IsUpdateable")
	private Boolean isUpdateable;

	@FlyField(name = "Mandatory Logic", dataType = FlyDataType.Text)
	@Column(name = "MandatoryLogic")
	private String mandatoryLogic;

	@Column(name = "ReadOnlyLogic")
	@FlyField(name = "Read Only Logic", dataType = FlyDataType.Text, description = "Logic to determine if field is read only (applies only when field is read-write)", help = "format := {expression} [{logic} {expression}]<br> \n"
			+ "expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> \n"
			+ "logic := {|}|{&}<br>\n" + "context := any global or window context <br>\n"
			+ "value := strings or numbers<br>\n"
			+ "logic operators	:= AND or OR with the previous result from left to right <br>\n"
			+ "operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>\n" + "Examples: <br>\n"
			+ "@AD_Table_ID@=14 | @Language@!GERGER <br>\n" + "@PriceLimit@>10 | @PriceList@>@PriceActual@<br>\n"
			+ "@Name@>J<br>\n" + "Strings may be in single quotes (optional)")
	private String readOnlyLogic;

	@FlyField(name = "Sequence", description = "Method of ordering records; lowest number comes first", help = "The Sequence indicates the order of records")
	@Column(name = "SeqNo")
	private Integer seqNo;

	@FlyField(name = "Max. Value", description = "Maximum Value for a field", help = "The Maximum Value indicates the highest allowable value for a field")
	@Column(name = "ValueMax", length = 20)
	private String valueMax;

	@FlyField(name = "Min. Value", description = "Minimum Value for a field", help = "The Minimum Value indicates the highest allowable value for a field")
	@Column(name = "ValueMin", length = 20)
	private String valueMin;

	@FlyField(name = "Version", description = "Version of the table definition", help = "The Version indicates the version of this table definition.")
	@Column(length = 32)
	private String version;

	@FlyField(name = "Value Format", description = "Format of the value; Can contain fixed format elements, Variables: \"_lLoOaAcCa09\"", help = "<B>Validation elements:</B>\n"
			+ " 	(Space) any character\n" + "_	Space (fixed character)\n" + "l	any Letter a..Z NO space\n"
			+ "L	any Letter a..Z NO space converted to upper case\n" + "o	any Letter a..Z or space\n"
			+ "O	any Letter a..Z or space converted to upper case\n" + "a	any Letters & Digits NO space\n"
			+ "A	any Letters & Digits NO space converted to upper case\n" + "c	any Letters & Digits or space\n"
			+ "C	any Letters & Digits or space converted to upper case\n" + "0	Digits 0..9 NO space\n"
			+ "9	Digits 0..9 or space\n" + "\n" + "Example of format \"(000)_000-0000\"")
	@Column(length = 60, name = "VFormat")
	private String vFormat;

	@ManyToOne(optional = false, fetch = FetchType.LAZY, targetEntity = PTable.class)
	private IFlyDataModel table;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setDescription(java.lang.
	 * String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getHelp()
	 */
	@Override
	public String getHelp() {
		return help;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setHelp(java.lang.String)
	 */
	@Override
	public void setHelp(String help) {
		this.help = help;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getEntityType()
	 */
	@Override
	public EntityType getEntityType() {
		return entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#setEntityType(org.myfly.
	 * platform.core3.domain.EntityType)
	 */
	@Override
	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

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
	 * @see org.myfly.platform.core3.model.data.IFlyColumn#getTable()
	 */
	@Override
	public IFlyDataModel getTable() {
		return table;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.data.IFlyColumn#setTable(org.myfly.platform.
	 * core3.model.data.IFlyDataModel)
	 */
	@Override
	public void setTable(IFlyDataModel table) {
		this.table = table;
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
}
