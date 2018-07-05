package org.myfly.platform.core3.model.data;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyElement;

public enum Element_zh_CN{
	//
	@FlyElement(name="数据访问级别", description="所要求的访问级别", help="Indicates the access level required for this record or process.", dataType=FlyDataType.List, entityType="D", printName="数据访问级别", fieldLength=1)
	AccessLevel,
	//
	@FlyElement(name="Auto Complete Min Length", description="Identifier autocomplete trigger length", dataType=FlyDataType.Integer, entityType="D", printName="Auto Complete Min Length", fieldLength=10)
	ACTriggerLength,
	//
	@FlyElement(name="Chart", dataType=FlyDataType.ID, entityType="D", printName="Chart", fieldLength=22)
	AD_Chart_ID,
	//
	@FlyElement(name="客户", description="安装此软件的客户", help="客户是一个公司或者合法的实体。你不能在客户之间共享数据。", dataType=FlyDataType.TableDirect, entityType="D", printName="客户", fieldLength=22)
	AD_Client_ID,
	//
	@FlyElement(name="颜色", description="Color for backgrounds or indicators", dataType=FlyDataType.ID, entityType="D", printName="颜色", fieldLength=22)
	AD_Color_ID,
	//
	@FlyElement(name="列", description="在表中的列", help="链接到数据库表中的列。", dataType=FlyDataType.ID, entityType="D", printName="列", fieldLength=22)
	AD_Column_ID,
	//
	@FlyElement(name="定单列", description="列决定定单", help="Integer Column of the table determining the order (display, sort, ..). If defined, the Order By replaces the default Order By clause. It should be fully qualified (i.e. 'tablename.columnname').", dataType=FlyDataType.Table, entityType="D", printName="定单列", fieldLength=22)
	AD_ColumnSortOrder_ID,
	//
	@FlyElement(name="已包括列", description="Column determining if a Table Column is included in Ordering", help="If a Included Column is defined, it decides, if a column is active in the ordering - otherwise it is determined that the Order Column has a value of one or greater", dataType=FlyDataType.Table, entityType="D", printName="已包括列", fieldLength=22)
	AD_ColumnSortYesNo_ID,
	//
	@FlyElement(name="显示列", description="将会显示的列", help="The Display Column indicates the column that will display. 显示列指明了将显示的列。", dataType=FlyDataType.Table, entityType="D", printName="显示列", fieldLength=22)
	AD_Display,
	//
	@FlyElement(name="系统元素", description="系统元素使得我们能够对列的描述和帮助进行集中维护。", help="系统元素使得我们能够对数据库字段的描述、帮助和词汇进行集中维护。", dataType=FlyDataType.ID, entityType="D", printName="元素", fieldLength=22)
	AD_Element_ID,
	//
	@FlyElement(name="EMail Configuration", dataType=FlyDataType.TableDirect, entityType="D", printName="EMail Configuration", fieldLength=10)
	AD_EMailConfig_ID,
	//
	@FlyElement(name="字段组", description="字段的合乎逻辑的配列", help="The Field Group indicates the logical group that this field belongs to (History, Amounts, Quantities)", dataType=FlyDataType.TableDirect, entityType="D", printName="字段组", fieldLength=22)
	AD_FieldGroup_ID,
	//
	@FlyElement(name="字段", description="一张数据库表上的字段", help="字段标识了数据库表的字段。", dataType=FlyDataType.ID, entityType="D", printName="字段", fieldLength=22)
	AD_Field_ID,
	//
	@FlyElement(name="图像", description="系统图像或图标", dataType=FlyDataType.TableDirect, entityType="D", printName="图像", fieldLength=22)
	AD_Image_ID,
	//
	@FlyElement(name="主键列", description="记录的唯一标识符", help="主键列标明了它是这个表的一条记录的唯一标示符。", dataType=FlyDataType.Table, entityType="D", printName="主键列", fieldLength=22)
	AD_Key,
	//
	@FlyElement(name="机构", description="客户内的机构实体。", help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.", dataType=FlyDataType.TableDirect, entityType="D", printName="机构", fieldLength=22)
	AD_Org_ID,
	//
	@FlyElement(name="交易机构", description="Performing or initiating organization", help="The organization which performs or initiates this transaction (for another organization).  The owning Organization may not be the transaction organization in a service bureau environment, with centralized services, and inter-organization transactions.", dataType=FlyDataType.Table, entityType="D", printName="交易机构", fieldLength=22)
	AD_OrgTrx_ID,
	//
	@FlyElement(name="机构类型", description="Organization Type allows you to categorize your organizations", help="Organization Type allows you to categorize your organizations for reporting purposes", dataType=FlyDataType.TableDirect, entityType="D", printName="机构类型", fieldLength=22)
	AD_OrgType_ID,
	//
	@FlyElement(name="进程", description="程序或报表", help="The Process field identifies a unique Process or Report in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="进程", fieldLength=22)
	AD_Process_ID,
	//
	@FlyElement(name="引用", description="系统引用", help="The Reference indicates the type of reference field", dataType=FlyDataType.ID, entityType="D", printName="引用", fieldLength=22)
	AD_Reference_ID,
	//
	@FlyElement(name="引用关键字", description="Required to specify, if data type is Table or List", help="The Reference Value indicates where the reference values are stored.  It must be specified if the data type is Table or List.  ", dataType=FlyDataType.Table, entityType="D", printName="引用关键字", fieldLength=22)
	AD_Reference_Value_ID,
	//
	@FlyElement(name="引用列表", description="基于表的引用列表", help="The Reference List field indicates a list of reference values from a database tables.  Reference lists populate drop down list boxes in data entry screens", dataType=FlyDataType.ID, entityType="D", printName="引用列表", fieldLength=22)
	AD_Ref_List_ID,
	//
	@FlyElement(name="复制策略", description="数据复制策略", help="The Data Replication Strategy determines what and how tables are replicated ", dataType=FlyDataType.TableDirect, entityType="D", printName="复制策略", fieldLength=22)
	AD_ReplicationStrategy_ID,
	//
	@FlyElement(name="角色", description="职责角色", help="The Role determines security and access a user who has this Role will have in the System.", dataType=FlyDataType.ID, entityType="D", printName="角色", fieldLength=22)
	AD_Role_ID,
	//
	@FlyElement(name="页签", description="窗口内的页签", help="The Tab indicates a tab that displays within a window.", dataType=FlyDataType.ID, entityType="D", printName="页签", fieldLength=22)
	AD_Tab_ID,
	//
	@FlyElement(name="表", description="字段所在表", help="The Table indicates the table in which a field or fields reside.", dataType=FlyDataType.ID, entityType="D", printName="表", fieldLength=22)
	AD_Table_ID,
	//
	@FlyElement(name="主树-菜单", dataType=FlyDataType.Table, entityType="D", printName="主树-菜单", fieldLength=22)
	AD_Tree_Menu_ID,
	//
	@FlyElement(name="主树-机构", dataType=FlyDataType.Table, entityType="D", printName="主树-机构", fieldLength=22)
	AD_Tree_Org_ID,
	//
	@FlyElement(name="客户或联系人", description="User within the system - Internal or Business Partner Contact", help="The User identifies a unique user in the system. This could be an internal user or a business partner contact", dataType=FlyDataType.ID, entityType="D", printName="用户", fieldLength=22)
	AD_User_ID,
	//
	@FlyElement(name="动态验证", description="验证规则", help="The Validation Rule indicates a unique validation rule.  These rules define how an entry is determined to valid or invalid. ", dataType=FlyDataType.TableDirect, entityType="D", printName="验证", fieldLength=22)
	AD_Val_Rule_ID,
	//
	@FlyElement(name="窗口 ", description="数据输入或显示视窗", help="The Window field identifies a unique Window in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="窗口 ", fieldLength=22)
	AD_Window_ID,
	//
	@FlyElement(name="Allow HTML View", dataType=FlyDataType.YesNo, entityType="D", printName="Allow HTML View", fieldLength=1)
	Allow_HTML_View,
	//
	@FlyElement(name="Allow Info Account", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Account", fieldLength=1)
	Allow_Info_Account,
	//
	@FlyElement(name="Allow Info Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Asset", fieldLength=1)
	Allow_Info_Asset,
	//
	@FlyElement(name="Allow Info BPartner", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info BPartner", fieldLength=1)
	Allow_Info_BPartner,
	//
	@FlyElement(name="Allow Info CashJournal", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info CashJournal", fieldLength=1)
	Allow_Info_CashJournal,
	//
	@FlyElement(name="Allow Info InOut", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info InOut", fieldLength=1)
	Allow_Info_InOut,
	//
	@FlyElement(name="Allow Info Invoice", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Invoice", fieldLength=1)
	Allow_Info_Invoice,
	//
	@FlyElement(name="Allow Info Order", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Order", fieldLength=1)
	Allow_Info_Order,
	//
	@FlyElement(name="Allow Info Payment", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Payment", fieldLength=1)
	Allow_Info_Payment,
	//
	@FlyElement(name="Allow Info Product", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Product", fieldLength=1)
	Allow_Info_Product,
	//
	@FlyElement(name="Allow Info Resource", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Resource", fieldLength=1)
	Allow_Info_Resource,
	//
	@FlyElement(name="Allow Info Schedule", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Schedule", fieldLength=1)
	Allow_Info_Schedule,
	//
	@FlyElement(name="Allow XLS View", dataType=FlyDataType.YesNo, entityType="D", printName="Allow XLS View", fieldLength=1)
	Allow_XLS_View,
	//
	@FlyElement(name="批准金额", description="The approval amount limit for this role", help="The Approval Amount field indicates the amount limit this Role has for approval of documents.", dataType=FlyDataType.Amount, entityType="D", printName="批准金额", fieldLength=22)
	AmtApproval,
	//
	@FlyElement(name="生日", description="生日或周年日", help="生日或周年日", dataType=FlyDataType.Date, entityType="D", printName="生日", fieldLength=7)
	Birthday,
	//
	@FlyElement(name="BP Address", description="Address of the Business Partner", dataType=FlyDataType.NONE, entityType="D", printName="BP Address", fieldLength=0)
	BP_Location_ID,
	//
	@FlyElement(name="BP Name", dataType=FlyDataType.String, entityType="D", printName="BP Name", fieldLength=60)
	BPName,
	//
	@FlyElement(name="Callout", description="Function Calls separated by semicolons; SE_ SL_ UE_ UL_ - 1st: System User; 2nd: Enter Leave; 3rd: _ Underscore, - then Function Name", help="A Callout allow you to create Java extensions to perform certain tasks always after a value changed. Callouts should not be used for validation but consquences of a user selecting a certain value.	The callout is a Java class implementing org.compiere.model.Callout and a method name to call.  Example: 'org.compiere.model.CalloutRequest.copyText' instanciates the class 'CalloutRequest' and calls the method 'copyText'. You can have multiple callouts by separating them via a semicolon", dataType=FlyDataType.String, entityType="D", printName="Callout", fieldLength=255)
	Callout,
	//
	@FlyElement(name="业务伙伴 ", description="标识业务伙伴", help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson", dataType=FlyDataType.Search, entityType="D", printName="业务伙伴 ", fieldLength=22)
	C_BPartner_ID,
	//
	@FlyElement(name="业务伙伴地址", description="Identifies the (ship to) address for this Business Partner", help="The Partner address indicates the location of a Business Partner", dataType=FlyDataType.TableDirect, entityType="D", printName="业务伙伴地址", fieldLength=22)
	C_BPartner_Location_ID,
	//
	@FlyElement(name="日历", description="会计日历名字", help="The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used.  For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30.", dataType=FlyDataType.ID, entityType="D", printName="日历", fieldLength=22)
	C_Calendar_ID,
	//
	@FlyElement(name="战役", description="营销活动", help="The Campaign defines a unique marketing program.  Projects can be associated with a pre defined Marketing Campaign.  You can then report based on a specific Campaign.", dataType=FlyDataType.Table, entityType="D", printName="战役", fieldLength=22)
	C_Campaign_ID,
	//
	@FlyElement(name="货币", description="币种为该笔记录", help="Indicates the Currency to be used when processing or reporting on this record", dataType=FlyDataType.ID, entityType="D", printName="货币", fieldLength=22)
	C_Currency_ID,
	//
	@FlyElement(name="称谓", description="Greeting to print on correspondence", help="The Greeting identifies the greeting to print on correspondence.", dataType=FlyDataType.ID, entityType="D", printName="称谓", fieldLength=22)
	C_Greeting_ID,
	//
	@FlyElement(name="Position", description="Job Position", dataType=FlyDataType.ID, entityType="D", printName="Position", fieldLength=10)
	C_Job_ID,
	//
	@FlyElement(name="地址", description="位置或地址", help="The Location   Address field defines the location of an entity.", dataType=FlyDataType.ID, entityType="D", printName="地址", fieldLength=22)
	C_Location_ID,
	//
	@FlyElement(name="数据库列名", description="Name of the column in the database", help="The Column Name indicates the name of a column on a table as defined in the database.", dataType=FlyDataType.String, entityType="D", printName="数据库列名", fieldLength=30)
	ColumnName,
	//
	@FlyElement(name="Column SQL", description="Virtual Column (r/o)", help="You can define virtual columns (not stored in the database). If defined, the Column name is the synonym of the SQL expression defined here. The SQL expression must be valid.<br>	Example: 'Updated-Created' would list the age of the entry in days", dataType=FlyDataType.String, entityType="D", printName="Column SQL", fieldLength=2000)
	ColumnSQL,
	//
	@FlyElement(name="注释", description="Comments or additional information", help="The Comments field allows for free form entry of additional information.", dataType=FlyDataType.Text, entityType="D", printName="注释", fieldLength=2000)
	Comments,
	//
	@FlyElement(name="提交警告", description="保存时显示警告", help="Warning or information displayed when committing the record", dataType=FlyDataType.Text, entityType="D", printName="提交警告", fieldLength=2000)
	CommitWarning,
	//
	@FlyElement(name="Confirm Query Records", description="Require Confirmation if more records will be returned by the query (If not defined 500)", help="Enter the number of records the query will return without confirmation to avoid unnecessary system load.  If 0, the system default of 500 is used.", dataType=FlyDataType.Integer, entityType="D", printName="Confirm Query Records", fieldLength=10)
	ConfirmQueryRecords,
	//
	@FlyElement(name="Connection Profile", description="How a Java Client connects to the server(s)", help="Depending on the connection profile, different protocols are used and tasks are performed on the server rather then the client. Usually the user can select different profiles, unless it is enforced by the User or Role definition. The User level profile overwrites the Role based profile.", dataType=FlyDataType.List, entityType="D", printName="Connection Profile", fieldLength=1)
	ConnectionProfile,
	//
	@FlyElement(name="Copy Columns From Table", dataType=FlyDataType.Button, entityType="D", printName="Copy Columns From Table", fieldLength=1)
	CopyColumnsFromTable,
	//
	@FlyElement(name="创建日期", description="本记录产生日期", help="The Created field indicates the date that this record was created.", dataType=FlyDataType.DateTime, entityType="D", printName="创建日期", fieldLength=7)
	Created,
	//
	@FlyElement(name="创建人", description="产生该记录用户", help="The Created By field indicates the user who created this record.", dataType=FlyDataType.Table, entityType="D", printName="创建人", fieldLength=22)
	CreatedBy,
	//
	@FlyElement(name="缺省逻辑", description="Default value hierarchy, separated by ;", help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.", dataType=FlyDataType.Text, entityType="D", printName="缺省逻辑", fieldLength=2000)
	DefaultValue,
	//
	@FlyElement(name="描述", description="该记录的可选描述", help="描述最多为 255 个字符。", dataType=FlyDataType.Text, entityType="D", printName="描述", fieldLength=255)
	Description,
	//
	@FlyElement(name="显示长度", description="Length of the display in characters", help="The display length is mainly for String fields. The length has no impact, if the data type of the field is - Integer, Number, Amount	(length determined by the system) - YesNo	(Checkbox) - List, Table, TableDir	(length of combo boxes are determined by their content at runtime)", dataType=FlyDataType.Integer, entityType="D", printName="显示长度", fieldLength=22)
	DisplayLength,
	//
	@FlyElement(name="显示逻辑", description="If the Field is displayed, the result determines if the field is actually displayed", help="format		:= <表达> [<逻辑> <表达>] expression	:= @<上下文>@=<价值>或 @<上下文>@!<价值> logic		:= <|>|<&>	context		:= any global or window context value		:= strings logic operators	:= AND or OR with the previous result from left to right Example	'@AD_Table_ID@=14 | @Language@!'GERGER' As it is always a string comparison, the string delimiters are optional, but suggested for future compatibility", dataType=FlyDataType.Text, entityType="D", printName="显示逻辑", fieldLength=2000)
	DisplayLogic,
	//
	@FlyElement(name="Display SQL", description="SQL for display of lookup value", help="Fully qualified subquery SQL", dataType=FlyDataType.NONE, entityType="D", printName="Display SQL", fieldLength=0)
	DisplaySQL,
	//
	@FlyElement(name="Drop Ship Warehouse", description="The (logical) warehouse to use for recording drop ship receipts and shipments.", help="The drop ship warehouse will be used for recording material transactions relating to drop shipments to and from this organization.", dataType=FlyDataType.Table, entityType="D", printName="Drop Ship Warehouse", fieldLength=22)
	DropShip_Warehouse_ID,
	//
	@FlyElement(name="催讨", description="催促者 &Bradstreet 数字", help="Used for EDI - For details see   www.dnb.com dunsno list.htm", dataType=FlyDataType.String, entityType="D", printName="催讨", fieldLength=11)
	DUNS,
	//
	@FlyElement(name="电邮", description="电子邮件地址", help="The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web.", dataType=FlyDataType.String, entityType="D", printName="电邮", fieldLength=60)
	EMail,
	//
	@FlyElement(name="电子邮件用户", description="User Name (ID) in the Mail System", help="The user name in the mail system is usually the string before the @ of your email address.  Required if the mail server requires authentification to send emails.", dataType=FlyDataType.String, entityType="D", printName="发电子邮件给用户", fieldLength=60)
	EMailUser,
	//
	@FlyElement(name="发电子邮件给用户密码", description="Password of your email user id", help="Required if the mail server requires authentification to send emails.", dataType=FlyDataType.String, entityType="D", printName="用电子邮件发密码", fieldLength=20)
	EMailUserPW,
	//
	@FlyElement(name="Email验证", description="验证电子邮件地址", help="The field contains the date the EMail Address has been verified", dataType=FlyDataType.String, entityType="D", printName="Email验证", fieldLength=40)
	EMailVerify,
	//
	@FlyElement(name="EMail Verify", description="Date Email was verified", dataType=FlyDataType.DateTime, entityType="D", printName="EMail Verify", fieldLength=7)
	EMailVerifyDate,
	//
	@FlyElement(name="实体类型", description="字典实体类型; 确定所有者和同步性", help="实体类型'字典/Dictionary', 'Adempiere' 和 '应用/Application' 能够自动的同步因此客户化的工作将被删除或覆盖  		要客户化,请复制实体并选择'用户/User'!", dataType=FlyDataType.Table, entityType="D", printName="实体类型", fieldLength=40)
	EntityType,
	//
	@FlyElement(name="传真", description="传真号", help="The Fax identifies a facsimile number for this Business Partner or  Location", dataType=FlyDataType.String, entityType="D", printName="传真", fieldLength=40)
	Fax,
	//
	@FlyElement(name="Field Group Type", dataType=FlyDataType.List, entityType="D", printName="Field Group Type", fieldLength=10)
	FieldGroupType,
	//
	@FlyElement(name="长度", description="Length of the column in the database", help="The Length indicates the length of a column as defined in the database.", dataType=FlyDataType.Integer, entityType="D", printName="长度", fieldLength=22)
	FieldLength,
	//
	@FlyElement(name="Format Pattern", description="The pattern used to format a number or date.", help="A string complying with either Java SimpleDateFormat or DecimalFormat pattern syntax used to override the default presentation format of a date or number type field.", dataType=FlyDataType.String, entityType="D", printName="Format Pattern", fieldLength=22)
	FormatPattern,
	//
	@FlyElement(name="HasRole", description="Has Role Y/N", dataType=FlyDataType.List, entityType="D", printName="Has Role Y/N", fieldLength=1)
	HasRole,
	//
	@FlyElement(name="有树", description="窗口有树", help="The Has Tree checkbox indicates if this window displays a tree metaphor.", dataType=FlyDataType.YesNo, entityType="D", printName="有树", fieldLength=1)
	HasTree,
	//
	@FlyElement(name="注释/帮助", description="注释或提示", help="The Help field contains a hint, comment or help about the use of this item.", dataType=FlyDataType.Text, entityType="D", printName="注释", fieldLength=2000)
	Help,
	//
	@FlyElement(name="导入字段", description="Create Fields from Table Columns", dataType=FlyDataType.Button, entityType="D", printName="导入字段", fieldLength=1)
	ImportFields,
	//
	@FlyElement(name="导入表", description="Import Table Columns from Database", dataType=FlyDataType.Button, entityType="D", printName="导入表", fieldLength=1)
	ImportTable,
	//
	@FlyElement(name="已包括定位键", description="Included Tab in this Tab (Master Dateail)", help="You can include a Tab in a Tab. If displayed in single row record, the included tab is displayed as multi-row table.", dataType=FlyDataType.Table, entityType="D", printName="已包括定位键", fieldLength=22)
	Included_Tab_ID,
	//
	@FlyElement(name="Info Factory Class", description="Fully qualified class name that implements the InfoFactory interface", help="Fully qualified class name that implements the InfoFactory interface. This can be use to provide custom Info class for column.", dataType=FlyDataType.String, entityType="D", printName="Info Factory Class", fieldLength=255)
	InfoFactoryClass,
	//
	@FlyElement(name="Access all Orgs", description="Access all Organizations (no org access control) of the client", help="When selected, the role has access to all organizations of the client automatically. This also increases performance where you have many organizations.", dataType=FlyDataType.YesNo, entityType="D", printName="Access all Orgs", fieldLength=1)
	IsAccessAllOrgs,
	//
	@FlyElement(name="有效", description="本记录有效", help="There are two methods of making records unavailable in the system: One is to delete the record, the other is to de-activate the record. A de-activated record is not available for selection, but available for reports.	There are two reasons for de-activating and not deleting records:	(1) The system requires the record for audit purposes.	(2) The record is referenced by other records. E.g., you cannot delete a Business Partner, if there are invoices for this partner record existing. You de-activate the Business Partner and prevent that this record is used for future entries.", dataType=FlyDataType.YesNo, entityType="D", printName="有效", fieldLength=1)
	IsActive,
	//
	@FlyElement(name="Advanced Tab", description="This Tab contains advanced Functionality", help="The tab with advanced functionality is only displayed, if enabled in Tools>Preference.", dataType=FlyDataType.YesNo, entityType="D", printName="Advanced Tab", fieldLength=1)
	IsAdvancedTab,
	//
	@FlyElement(name="Alert", description="Display alert message when referenced record is accessed", dataType=FlyDataType.NONE, entityType="D", printName="Alert", fieldLength=0)
	IsAlert,
	//
	@FlyElement(name="Allow Copy", description="Defines whether the value of this field is considered in the copy of record", help="The default value is yes, it is recommended that values such as ID, document action, document status  should be defined as no.", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Copy", fieldLength=1)
	IsAllowCopy,
	//
	@FlyElement(name="Allow Logging", description="Determine if a column must be recorded into the change log", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Logging", fieldLength=1)
	IsAllowLogging,
	//
	@FlyElement(name="Always Updateable", description="The column is always updateable, even if the record is not active or processed", help="If selected and if the winow / tab is not read only, you can always update the column.  This might be useful for comments, etc.", dataType=FlyDataType.YesNo, entityType="D", printName="Always Updateable", fieldLength=1)
	IsAlwaysUpdateable,
	//
	@FlyElement(name="Autocomplete", description="Automatic completion for textfields", help="The autocompletion uses all existing values (from the same client and organization) of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Autocomplete", fieldLength=1)
	IsAutocomplete,
	//
	@FlyElement(name="Beta 功能", description="This functionality is considered Beta", help="Beta functionality is not fully tested or completed.", dataType=FlyDataType.YesNo, entityType="D", printName="Beta 功能", fieldLength=1)
	IsBetaFunctionality,
	//
	@FlyElement(name="Approve own Documents", description="Users with this role can approve their own documents", help="If a user cannot approve their own documents (orders, etc.), it needs to be approved by someone else.", dataType=FlyDataType.YesNo, entityType="D", printName="Approve own", fieldLength=1)
	IsCanApproveOwnDoc,
	//
	@FlyElement(name="Can Export", description="Users with this role can export data", help="You can restrict the ability to export data from Adempiere.", dataType=FlyDataType.YesNo, entityType="D", printName="Can Export", fieldLength=1)
	IsCanExport,
	//
	@FlyElement(name="Can Load", description="Users with this role can load data", help="You can restrict the ability to load data from Adempiere.", dataType=FlyDataType.YesNo, entityType="D", printName="Can Load", fieldLength=1)
	IsCanLoad,
	//
	@FlyElement(name="Can Report", description="Users with this role can create reports", help="You can restrict the ability to report on data.", dataType=FlyDataType.YesNo, entityType="D", printName="Can Report", fieldLength=1)
	IsCanReport,
	//
	@FlyElement(name="集中维护", description="Information maintained in System Element table", help="The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table  or 'Window' table.", dataType=FlyDataType.YesNo, entityType="D", printName="集中维护", fieldLength=1)
	IsCentrallyMaintained,
	//
	@FlyElement(name="维护变化日志", description="维护变化的一个日志", help="If selected, a log of all changes is maintained.", dataType=FlyDataType.YesNo, entityType="D", printName="变化日志", fieldLength=1)
	IsChangeLog,
	//
	@FlyElement(name="Collapsed By Default", description="Flag to set the initial state of collapsible field group.", dataType=FlyDataType.YesNo, entityType="D", printName="Collapsed By Default", fieldLength=1)
	IsCollapsedByDefault,
	//
	@FlyElement(name="缺省值", description="缺省值", help="The Default Checkbox indicates if this record will be used as a default value.", dataType=FlyDataType.YesNo, entityType="D", printName="缺省值", fieldLength=1)
	IsDefault,
	//
	@FlyElement(name="可删除的记录", description="Indicates if records can be deleted from the database", help="The Records Deleteable checkbox indicates if a record can be deleted from the database.  If records cannot be deleted, you can only deselect the Active flag", dataType=FlyDataType.YesNo, entityType="D", printName="可删除的记录", fieldLength=1)
	IsDeleteable,
	//
	@FlyElement(name="IsDiscountAllowedOnTotal", dataType=FlyDataType.YesNo, entityType="D", printName="IsDiscountAllowedOnTotal", fieldLength=1)
	IsDiscountAllowedOnTotal,
	//
	@FlyElement(name="IsDiscountUptoLimitPrice", dataType=FlyDataType.YesNo, entityType="D", printName="IsDiscountUptoLimitPrice", fieldLength=1)
	IsDiscountUptoLimitPrice,
	//
	@FlyElement(name="显示", description="Determines, if this field is displayed", help="If the field is displayed, the field Display Logic will determine at runtime, if it is actually displayed", dataType=FlyDataType.YesNo, entityType="D", printName="显示", fieldLength=1)
	IsDisplayed,
	//
	@FlyElement(name="Displayed in Grid", description="Determines, if this field is displayed in grid view", help="Default whether this field is displayed when grid view is selected.", dataType=FlyDataType.NONE, entityType="D", printName="Displayed in Grid", fieldLength=0)
	IsDisplayedGrid,
	//
	@FlyElement(name="Display Identifier", description="Display the record identifier", help="Display the columns that are marked as part of the identifier for this table.  ", dataType=FlyDataType.NONE, entityType="D", printName="Display Identifier", fieldLength=0)
	IsDisplayIdentifier,
	//
	@FlyElement(name="Is Document", description="This flag determinate if the record is a document", help="This flag is used to mark those tables that behave like documents and allow create automatically columns like: C_DocType_ID, DocumentNo, DateDoc, DocAction, DocStatus, Processed, IsApproved, Description", dataType=FlyDataType.YesNo, entityType="D", printName="Is Document", fieldLength=1)
	IsDocument,
	//
	@FlyElement(name="Is Embedded", description="When checked of include tab is embedded", dataType=FlyDataType.YesNo, entityType="D", printName="Allows setting as an Embedded  Tab or Horizontal Tab", fieldLength=1)
	IsEmbedded,
	//
	@FlyElement(name="加密的", description="Display is encrypted by '*' - Independent from data storage encryption", help="Display encryption - all characters are displayed as '*'. Data storage encryption (i.e. you will not be able to report the data via report tools) is set in the Column definition.", dataType=FlyDataType.Button, entityType="D", printName="加密的", fieldLength=1)
	IsEncrypted,
	//
	@FlyElement(name="仅显示字段", description="不显示标签", help="The Field Only checkbox indicates that the column will display without a label.", dataType=FlyDataType.YesNo, entityType="D", printName="仅显示字段", fieldLength=1)
	IsFieldOnly,
	//
	@FlyElement(name="Full BP Access", description="The user/contact has full access to Business Partner information and resources", help="If selected, the user has full access to the Business Partner (BP) information (Business Documents like Orders, Invoices - Requests) or resources (Assets, Downloads). If you deselect it, the user has no access rights unless, you explicitly grant it in tab 'BP Access'", dataType=FlyDataType.YesNo, entityType="D", printName="Full BP Access", fieldLength=1)
	IsFullBPAccess,
	//
	@FlyElement(name="仅显示标题", description="Field without Column - Only label is displayed", help="The Heading Only checkbox indicates if just the label will display on the screen", dataType=FlyDataType.YesNo, entityType="D", printName="仅显示标题", fieldLength=1)
	IsHeading,
	//
	@FlyElement(name="大量数据", description="Use Search instead of Pick list", help="那 High Volume Checkbox indicates if a search screen will display as opposed to a pick list for selecting records from this table.", dataType=FlyDataType.YesNo, entityType="D", printName="大量数据", fieldLength=1)
	IsHighVolume,
	//
	@FlyElement(name="标识符", description="本列是记录标识符的一部分", help="The Identifier checkbox indicates that this column is part of the identifier or key for this table.  ", dataType=FlyDataType.YesNo, entityType="D", printName="标识符", fieldLength=1)
	IsIdentifier,
	//
	@FlyElement(name="Ignore Migration", description="Ignore this record in log migration", dataType=FlyDataType.YesNo, entityType="D", printName="Ignore Migration", fieldLength=1)
	IsIgnoreMigration,
	//
	@FlyElement(name="会计页签", description="This tab contain accounting information", help="The Accounting Tab checkbox indicates if this window contains accounting information.", dataType=FlyDataType.YesNo, entityType="D", printName="会计页签", fieldLength=1)
	IsInfoTab,
	//
	@FlyElement(name="Insert Record", description="The user can insert a new Record", help="If not selected, the user cannot create a new Record.  This is automatically disabled, if the Tab is Read Only.", dataType=FlyDataType.YesNo, entityType="D", printName="Insert Record", fieldLength=1)
	IsInsertRecord,
	//
	@FlyElement(name="关键列", description="This column is the key in this table", help="The key column must also be display sequence 0 in the field definition and may be hidden.", dataType=FlyDataType.YesNo, entityType="D", printName="关键列", fieldLength=1)
	IsKey,
	//
	@FlyElement(name="强制性的", description="Data entry is required in this column", help="The Mandatory checkbox indicates if the field is required for a record to be save to the database.", dataType=FlyDataType.YesNo, entityType="D", printName="强制性的", fieldLength=1)
	IsMandatory,
	//
	@FlyElement(name="手工", description="这是手工的程序", help="The Manual check box indicates if the process will done manually.", dataType=FlyDataType.YesNo, entityType="D", printName="手工", fieldLength=1)
	IsManual,
	//
	@FlyElement(name="Order By Value", description="Order list using the value column instead of the name column", help="Order list using the value column instead of the name column", dataType=FlyDataType.YesNo, entityType="D", printName="Order By Value", fieldLength=1)
	IsOrderByValue,
	//
	@FlyElement(name="父表连接列", description="This column is a link to the parent table (e.g. header from lines) - incl. Association key columns", help="The Parent checkbox indicates if this column is a link to the parent table.", dataType=FlyDataType.YesNo, entityType="D", printName="父表连接列", fieldLength=1)
	IsParent,
	//
	@FlyElement(name="个人数据访问权", description="Allow access to all personal records", help="Users of this role have access to all records locked as personal.", dataType=FlyDataType.YesNo, entityType="D", printName="个人数据访问权", fieldLength=1)
	IsPersonalAccess,
	//
	@FlyElement(name="个人数据加锁", description="Allow users with role to lock access to personal records", help="If enabled, the user with the role can prevent access of others to personal records.  If a record is locked, only the user or people who can read personal locked records can see the record.", dataType=FlyDataType.YesNo, entityType="D", printName="Personal Lock", fieldLength=1)
	IsPersonalLock,
	//
	@FlyElement(name="范围", description="The parameter is a range of values", help="The Range checkbox indicates that this parameter is a range of values.", dataType=FlyDataType.YesNo, entityType="D", printName="范围", fieldLength=1)
	IsRange,
	//
	@FlyElement(name="只读", description="字段被只有读", help="The Read Only indicates that this field may only be Read.  It may not be updated.", dataType=FlyDataType.YesNo, entityType="D", printName="只读", fieldLength=1)
	IsReadOnly,
	//
	@FlyElement(name="Sales Lead", description="This contact is a sales lead", help="Sales leads can be converted into full contacts with Business Partners.", dataType=FlyDataType.NONE, entityType="D", printName="Sales Lead", fieldLength=0)
	IsSalesLead,
	//
	@FlyElement(name="相同的行", description="Displayed on same line as previous field", help="The Same Line checkbox indicates that the field will display on the same line as the previous field.", dataType=FlyDataType.YesNo, entityType="D", printName="相同的行", fieldLength=1)
	IsSameLine,
	//
	@FlyElement(name="启动安全性", description="If security is enabled, user access to data can be restricted via Roles", help="The Security Enabled checkbox indicates that user access to the data in this table can be restricted using Roles.", dataType=FlyDataType.YesNo, entityType="D", printName="启动安全性", fieldLength=1)
	IsSecurityEnabled,
	//
	@FlyElement(name="选择列", description="Is this column used for finding rows in windows", help="If selected, the column is listed in the first find window tab and in the selection part of the window", dataType=FlyDataType.YesNo, entityType="D", printName="选择", fieldLength=1)
	IsSelectionColumn,
	//
	@FlyElement(name="显示财务", description="Users with this role can see accounting information", help="This allows to prevent access to any accounting information.", dataType=FlyDataType.YesNo, entityType="D", printName="显示财务", fieldLength=1)
	IsShowAcct,
	//
	@FlyElement(name="单记录排列", description="Default for toggle between Single- and Multi-Row (Grid) Layout", help="The Single Row Layout checkbox indicates if the default display type for this window is a single row as opposed to multi row.", dataType=FlyDataType.YesNo, entityType="D", printName="单记录排列", fieldLength=1)
	IsSingleRow,
	//
	@FlyElement(name="定单页签", description="页签定单", dataType=FlyDataType.YesNo, entityType="D", printName="定单页签", fieldLength=1)
	IsSortTab,
	//
	@FlyElement(name="销售交易", description="这是销售交易", help="The Sales Transaction checkbox indicates if this item is a Sales Transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="销售交易", fieldLength=1)
	IsSOTrx,
	//
	@FlyElement(name="汇总级别", description="这是父类实体", help="A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.", dataType=FlyDataType.YesNo, entityType="D", printName="汇总级别", fieldLength=1)
	IsSummary,
	//
	@FlyElement(name="同步数据库", description="Change database table definition when changing dictionary definition", help="When selected, the database column definition is updated based on your entries in the Column definition of the Application Dictionary.", dataType=FlyDataType.Button, entityType="D", printName="同步数据库", fieldLength=1)
	IsSyncDatabase,
	//
	@FlyElement(name="已翻译", description="列被翻译", help="The Translated checkbox indicates if this column is translated.", dataType=FlyDataType.YesNo, entityType="D", printName="已翻译", fieldLength=1)
	IsTranslated,
	//
	@FlyElement(name="翻译页签", description="This tab contains translation information", help="The Translation Tab checkbox indicate if a tab contains translation information.", dataType=FlyDataType.YesNo, entityType="D", printName="翻译页签", fieldLength=1)
	IsTranslationTab,
	//
	@FlyElement(name="可更新的", description="Determines, if the field can be updated", help="The Updateable checkbox indicates if a field can be updated by the user.", dataType=FlyDataType.YesNo, entityType="D", printName="可更新的", fieldLength=1)
	IsUpdateable,
	//
	@FlyElement(name="Use User Org Access", description="Use Org Access defined by user instead of Role Org Access", help="You can define the access to Organization either by Role or by User.  You would select this, if you have many organizations.", dataType=FlyDataType.YesNo, entityType="D", printName="Use User Org Access", fieldLength=1)
	IsUseUserOrgAccess,
	//
	@FlyElement(name="显示值", description="Displays Value column with the Display column", help="The Display Value checkbox indicates if the value column will display with the display column.", dataType=FlyDataType.YesNo, entityType="D", printName="显示值", fieldLength=1)
	IsValueDisplayed,
	//
	@FlyElement(name="视图", description="这是视图", help="This is a view rather than a table.  A view is always treated as read only in the system.", dataType=FlyDataType.YesNo, entityType="D", printName="视图", fieldLength=1)
	IsView,
	//
	@FlyElement(name="最近联系人", description="Date this individual was last contacted", help="The Last Contact indicates the date that this Business Partner Contact was last contacted.", dataType=FlyDataType.Date, entityType="D", printName="最近联系人", fieldLength=7)
	LastContact,
	//
	@FlyElement(name="最近结果", description="最后的联系人结果", help="The Last Result identifies the result of the last contact made.", dataType=FlyDataType.String, entityType="D", printName="最近结果", fieldLength=2000)
	LastResult,
	//
	@FlyElement(name="通过LDAP认证", description="Authorize via LDAP (directory) services", help="The user is authorized via LDAP. If LDAP authorization cannot be obtained, access is refused - the password is ignored for local access.", dataType=FlyDataType.String, entityType="D", printName="LDAP认证", fieldLength=60)
	LDAPUser,
	//
	@FlyElement(name="Lead Source", description="The source of this lead/opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Lead Source", fieldLength=0)
	LeadSource,
	//
	@FlyElement(name="Lead Source Description", description="Additional information on the source of this lead/opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Lead Source Description", fieldLength=0)
	LeadSourceDescription,
	//
	@FlyElement(name="Lead Status", description="The status of this lead/opportunity in the sales cycle", dataType=FlyDataType.NONE, entityType="D", printName="Lead Status", fieldLength=0)
	LeadStatus,
	//
	@FlyElement(name="Lead Status Description", description="Additional information on the status of this lead/opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Lead Status Description", fieldLength=0)
	LeadStatusDescription,
	//
	@FlyElement(name="序列", dataType=FlyDataType.Integer, entityType="D", printName="序列", fieldLength=22)
	LoadSeq,
	//
	@FlyElement(name="Logo", dataType=FlyDataType.Image, entityType="D", printName="Logo", fieldLength=10)
	Logo_ID,
	//
	@FlyElement(name="Mandatory Logic", dataType=FlyDataType.Text, entityType="D", printName="Mandatory Logic", fieldLength=2000)
	MandatoryLogic,
	//
	@FlyElement(name="Max Query Records", description="If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records", help="Enter the number of records a user will be able to query to avoid unnecessary system load.  If 0, no restrictions are imposed.", dataType=FlyDataType.Integer, entityType="D", printName="Max Query Records", fieldLength=10)
	MaxQueryRecords,
	//
	@FlyElement(name="仓库或服务位置", description="Storage Warehouse and Service Point", help="The Warehouse identifies a unique Warehouse where products are stored or Services are provided.", dataType=FlyDataType.ID, entityType="D", printName="仓库", fieldLength=22)
	M_Warehouse_ID,
	//
	@FlyElement(name="名称", description="Alphanumeric identifier of the entity", help="The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", dataType=FlyDataType.String, entityType="D", printName="名称", fieldLength=60)
	Name,
	//
	@FlyElement(name="Notification Type", description="Type of Notifications", help="Emails or Notification sent out for Request Updates, etc.", dataType=FlyDataType.List, entityType="D", printName="Notification Type", fieldLength=1)
	NotificationType,
	//
	@FlyElement(name="Obscure", description="Type of obscuring the data (limiting the display)", dataType=FlyDataType.List, entityType="D", printName="Obscure", fieldLength=3)
	ObscureType,
	//
	@FlyElement(name="SQL的Order By子句", description="Fully qualified ORDER BY clause", help="The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection", dataType=FlyDataType.Text, entityType="D", printName="SQL的Order By子句", fieldLength=2000)
	OrderByClause,
	//
	@FlyElement(name="Overwrite Price Limit", description="Overwrite Price Limit if the Price List  enforces the Price Limit", help="The Price List allows to enforce the Price Limit. If set, a user with this role can overwrite the price limit (i.e. enter any price).", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Price Limit", fieldLength=1)
	OverwritePriceLimit,
	//
	@FlyElement(name="目标", description="经营目标", help="The Performance Goal indicates what this users performance will be measured against.", dataType=FlyDataType.ID, entityType="D", printName="目标", fieldLength=22)
	PA_Goal_ID,
	//
	@FlyElement(name="Parent Column", description="The link column on the parent tab.", dataType=FlyDataType.Table, entityType="D", printName="Parent Column", fieldLength=22)
	Parent_Column_ID,
	//
	@FlyElement(name="上级机构", description="上级(管理)机构", help="Parent Organization - the next level in the organizational hierarchy.", dataType=FlyDataType.Table, entityType="D", printName="上级机构", fieldLength=22)
	Parent_Org_ID,
	//
	@FlyElement(name="口令", description="任意长度的口令(区分大小写)", help="The Password indicates the Password for this User Id.  Passwords are required to identify authorized users.", dataType=FlyDataType.String, entityType="D", printName="口令", fieldLength=1024)
	Password,
	//
	@FlyElement(name="电话", description="电话号码", help="The Phone field identifies a telephone number", dataType=FlyDataType.String, entityType="D", printName="电话", fieldLength=40)
	Phone,
	//
	@FlyElement(name="可选电话", description="Identifies an alternate telephone number.", help="The 2nd Phone field identifies an alternate telephone number.", dataType=FlyDataType.String, entityType="D", printName="可选电话", fieldLength=40)
	Phone2,
	//
	@FlyElement(name="采购定单视窗", description="采购定单视窗", help="Window for Purchase Order (AP) Zooms", dataType=FlyDataType.Table, entityType="D", printName="采购定单视窗", fieldLength=22)
	PO_Window_ID,
	//
	@FlyElement(name="Preference Level", description="Determines what preferences the user can set", help="Preferences allow you to define default values.  If set to None, you cannot set any preference nor value preference. Only if set to Client, you can see the Record Info Change Log.", dataType=FlyDataType.List, entityType="D", printName="Preference Level", fieldLength=1)
	PreferenceType,
	//
	@FlyElement(name="Preferred Width", description="Preferred width in pixels", dataType=FlyDataType.Integer, entityType="D", printName="Preferred Width", fieldLength=10)
	PreferredWidth,
	//
	@FlyElement(name="现在处理", dataType=FlyDataType.Button, entityType="D", printName="现在处理", fieldLength=1)
	Processing,
	//
	@FlyElement(name="只读逻辑", description="Logic to determine if field is read only (applies only when field is read-write)", help="format := {expression} [{logic} {expression}]<br> 	expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> 	logic := {|}|{&}<br>	context := any global or window context <br>	value := strings or numbers<br>	logic operators	:= AND or OR with the previous result from left to right <br>	operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>	Examples: <br>	@AD_Table_ID@=14 | @Language@!GERGER <br>	@PriceLimit@>10 | @PriceList@>@PriceActual@<br>	@Name@>J<br>	Strings may be in single quotes (optional)", dataType=FlyDataType.Text, entityType="D", printName="只读逻辑", fieldLength=2000)
	ReadOnlyLogic,
	//
	@FlyElement(name="Receipt Footer Msg", description="This message will be displayed at the bottom of a receipt when doing a sales or purchase", dataType=FlyDataType.LongText, entityType="D", printName="Receipt Footer Msg", fieldLength=0)
	ReceiptFooterMsg,
	//
	@FlyElement(name="复制类型", description="数据复制的类型", help="The Type of data Replication determines the directon of the data replication.  <br>	Reference means that the data in this system is read only -> <br>	Local means that the data in this system is not replicated to other systems - <br>	Merge means that the data in this system is synchronized with the other system <-> <br>	", dataType=FlyDataType.List, entityType="D", printName="复制类型", fieldLength=1)
	ReplicationType,
	//
	@FlyElement(name="销售代表", description="Sales Representative or Company Agent", help="The Sales Representative indicates the Sales Rep for this Region.  Any Sales Rep must be a valid internal user.", dataType=FlyDataType.Table, entityType="D", printName="销售代表", fieldLength=22)
	SalesRep_ID,
	//
	@FlyElement(name="Salt", description="Random data added to improve password hash effectiveness", dataType=FlyDataType.String, entityType="D", printName="Salt", fieldLength=16)
	Salt,
	//
	@FlyElement(name="序列", description="Method of ordering records; lowest number comes first", help="The Sequence indicates the order of records", dataType=FlyDataType.Integer, entityType="D", printName="序列", fieldLength=22)
	SeqNo,
	//
	@FlyElement(name="Grid Sequence", description="Method of ordering records; lowest number comes first", help="The Sequence indicates the order of columns in grid view", dataType=FlyDataType.NONE, entityType="D", printName="Grid Sequence", fieldLength=0)
	SeqNoGrid,
	//
	@FlyElement(name="记录排序号", description="决定记录按怎样的顺序显示。", help="The Record Sort No indicates the ascending sort sequence of the records", dataType=FlyDataType.Number, entityType="D", printName="记录排序号", fieldLength=22)
	SortNo,
	//
	@FlyElement(name="管理者", description="Supervisor for this user - used for escalation", help="The Supervisor indicates who will be used for forwarding and escalating issues for this user.", dataType=FlyDataType.Search, entityType="D", printName="管理者", fieldLength=22)
	Supervisor_ID,
	//
	@FlyElement(name="数据库表名字", description="Name of the table in the database", help="The DB Table Name indicates the name of the table in database.", dataType=FlyDataType.String, entityType="D", printName="数据库表名字", fieldLength=40)
	TableName,
	//
	@FlyElement(name="定位键水平", description="Hierarchical Tab Level (0 = top)", help="Hierarchical level of the tab. If the level is 0, it is the top entity. Level 1 entries are dependent on level 0, etc.", dataType=FlyDataType.Integer, entityType="D", printName="定位键水平", fieldLength=22)
	TabLevel,
	//
	@FlyElement(name="税号", description="税务号", help="The Tax ID field identifies the legal Identification number of this Entity.", dataType=FlyDataType.String, entityType="D", printName="税号", fieldLength=20)
	TaxID,
	//
	@FlyElement(name="名称", description="Name this entity is referred to as", help="The Title indicates the name that an entity is referred to as.", dataType=FlyDataType.String, entityType="D", printName="名称", fieldLength=60)
	Title,
	//
	@FlyElement(name="Bank for transfers", description="Bank account depending on currency will be used from this bank for doing transfers", dataType=FlyDataType.Table, entityType="D", printName="Bank for transfers", fieldLength=22)
	TransferBank_ID,
	//
	@FlyElement(name="CashBook for transfers", dataType=FlyDataType.Table, entityType="D", printName="CashBook for transfers", fieldLength=22)
	TransferCashBook_ID,
	//
	@FlyElement(name="已更新", description="本记录更新日期", help="The Updated field indicates the date that this record was updated.", dataType=FlyDataType.DateTime, entityType="D", printName="已更新", fieldLength=7)
	Updated,
	//
	@FlyElement(name="更新人", description="更新该记录用户", help="The Updated By field indicates the user who updated this record.", dataType=FlyDataType.Table, entityType="D", printName="更新人", fieldLength=22)
	UpdatedBy,
	//
	@FlyElement(name="UserDiscount", dataType=FlyDataType.Number, entityType="D", printName="UserDiscount", fieldLength=22)
	UserDiscount,
	//
	@FlyElement(name="用户级别", description="系统 客户 机构", help="The User Level field determines if users of this Role will have access to System level data, Organization level data, Client level data or Client and Organization level data.", dataType=FlyDataType.List, entityType="D", printName="用户级别", fieldLength=3)
	UserLevel,
	//
	@FlyElement(name="User PIN", dataType=FlyDataType.String, entityType="D", printName="User PIN", fieldLength=20)
	UserPIN,
	//
	@FlyElement(name="Immutable Universally Unique Identifier", description="Immutable Universally Unique Identifier", help="'A surrogate key in a database is a unique identifier for either an entity in the modeled world or an object in the database. The surrogate key is not derived from application data, unlike a natural (or business) key which is derived from application data. ' , According to Wikipedia http://en.wikipedia.org/wiki/Surrogate_key", dataType=FlyDataType.NONE, entityType="D", printName="UUID", fieldLength=0)
	UUID,
	//
	@FlyElement(name="验证类型", description="Different method of validating data", help="The Validation Type indicates the validation method to use.  These include list, table or data type validation.", dataType=FlyDataType.List, entityType="D", printName="验证类型", fieldLength=1)
	ValidationType,
	//
	@FlyElement(name="开始有效", description="Valid from including this date (first day)", help="The Valid From date indicates the first day of a date range", dataType=FlyDataType.Date, entityType="D", printName="开始有效", fieldLength=7)
	ValidFrom,
	//
	@FlyElement(name="结束有效", description="Valid to including this date (last day)", help="The Valid To date indicates the last day of a date range", dataType=FlyDataType.Date, entityType="D", printName="结束有效", fieldLength=7)
	ValidTo,
	//
	@FlyElement(name="检索关键字", description="记录的检索关键字在格式上是必须的 -并且必须唯一", help="A search key allows you a fast method of finding a particular record.	If you leave the search key empty, the system automatically creates a numeric number.  The document sequence used for this fallback number is defined in the 'Maintain Sequence' window with the name 'DocumentNo_<TableName>', where TableName is the actual name of the table (e.g. C_Order).", dataType=FlyDataType.String, entityType="D", printName="检索关键字", fieldLength=60)
	Value,
	//
	@FlyElement(name="最大值", description="字段的最大值", help="The Maximum Value indicates the highest allowable value for a field", dataType=FlyDataType.String, entityType="D", printName="最大值", fieldLength=20)
	ValueMax,
	//
	@FlyElement(name="最小值", description="字段最小量值", help="The Minimum Value indicates the lowest  allowable value for a field.", dataType=FlyDataType.String, entityType="D", printName="最小值", fieldLength=20)
	ValueMin,
	//
	@FlyElement(name="版本", description="Version of the table definition", help="The Version indicates the version of this table definition.", dataType=FlyDataType.Amount, entityType="D", printName="版本", fieldLength=22)
	Version,
	//
	@FlyElement(name="值格式", description="Format of the value; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任何的个性	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="值格式", fieldLength=60)
	VFormat,
	//
	@FlyElement(name="SQL的Where子句", description="Fully qualified WHERE clause", help="The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means 'tablename.columnname'.", dataType=FlyDataType.Text, entityType="D", printName="SQL的Where子句", fieldLength=2000)
	WhereClause,
	//
	@FlyElement(name="窗口类型", description="Type or classification of a Window", help="The Window Type indicates the type of window being defined (Maintain, Transaction or Query)", dataType=FlyDataType.List, entityType="D", printName="窗口类型", fieldLength=1)
	WindowType,
	//
	@FlyElement(name="Window Height", dataType=FlyDataType.Integer, entityType="D", printName="Win Height", fieldLength=22)
	WinHeight,
	//
	@FlyElement(name="Window Width", dataType=FlyDataType.Integer, entityType="D", printName="Win Width", fieldLength=22)
	WinWidth,
}