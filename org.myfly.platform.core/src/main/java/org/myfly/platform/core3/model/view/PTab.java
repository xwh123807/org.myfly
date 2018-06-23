package org.myfly.platform.core3.model.view;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.dict.PImage;

@Entity
@Table
@FlyTable(name = "Tab", description = "Tab within a Window")
public class PTab extends FlyEntity {
	@FlyField(name = "Window", description = "Data entry or display window", help = "The Window field identifies a unique Window in the system.")
	@ManyToOne()
	private PWindow window;

	@FlyField(name = "Table", description = "Database Table information", help = "The Database Table provides the information of the table definition")
	@ManyToOne()
	private PTable table;

	@FlyField(name = "Image", description = "Image or Icon", help = "Images and Icon can be used to display supported graphic formats (gif, jpg, png).\n"
			+ "You can either load the image (in the database) or point to a graphic via a URI (i.e. it can point to a resource, http address)")
	@ManyToOne()
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
	@ManyToOne()
	private PTab includedTab;

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
	@ManyToOne
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
	private String ReadOnlyLogic;

	@FlyField(name = "Sequence", description = "Method of ordering records; lowest number comes first", help = "The Sequence indicates the order of records")
	@Column(name = "SeqNo")
	private Integer seqNo;

	@FlyField(name = "Tab Level", description = "Hierarchical Tab Level (0 = top)", help = "Hierarchical level of the tab. If the level is 0, it is the top entity. Level 1 entries are dependent on level 0, etc.")
	@Column(name = "TabLevel")
	private Integer tabLevel;

	@FlyField(name = "Sql WHERE", description = "Fully qualified SQL WHERE clause", help = "The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means \"tablename.columnname\".")
	@Column(name = "WhereClause")
	private String whereClause;

	@OneToMany(mappedBy="tab")
	private Set<PField> fields;
}
