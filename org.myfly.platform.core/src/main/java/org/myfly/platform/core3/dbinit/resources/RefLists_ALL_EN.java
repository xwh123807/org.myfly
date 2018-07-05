package org.myfly.platform.core3.dbinit.resources;

import org.myfly.platform.core3.metadata.annotation.FlyRefItem;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;

public enum RefLists_ALL_EN {
	//
	@FlyRefList(name = "A_Table_Rate_Type", description = "List that contains type of rate", items = {
			@FlyRefItem(name = "Amount", value = "Amount"), @FlyRefItem(name = "Rate", value = "Rate"), }, help = "")
	A_Table_Rate_Type,
	//
	@FlyRefList(name = "AD_Validation Rule Types", description = "Validation Rule Type list", help = "e.g. S - SQL", items = {
			@FlyRefItem(name = "SQL", value = "SQL"), @FlyRefItem(name = "Java Language", value = "Java Language"),
			@FlyRefItem(name = "Java Script", value = "Java Script"), })
	AD_Validation_Rule_Types,
	//
	@FlyRefList(name = "AD_Message Type", description = "Message Type list", items = {
			@FlyRefItem(name = "Error", value = "Error"), @FlyRefItem(name = "Information", value = "Information"),
			@FlyRefItem(name = "Menu", value = "Menu"), })
	AD_Message_Type,
	//
	@FlyRefList(name = "AD_Print Label Line Type", items = { @FlyRefItem(name = "Field", value = "Field"),
			@FlyRefItem(name = "Text", value = "Text"), })
	AD_Print_Label_Line_Type,
	//
	@FlyRefList(name = "C_Recurring Frequency", items = { @FlyRefItem(name = "Daily", value = "Daily"),
			@FlyRefItem(name = "Weekly", value = "Weekly"), @FlyRefItem(name = "Monthly", value = "Monthly"),
			@FlyRefItem(name = "Quarterly", value = "Quarterly"), })
	C_Recurring_Frequency,
	//
	@FlyRefList(name = "C_Recurring Type", items = { @FlyRefItem(name = "Invoice", value = "Invoice"),
			@FlyRefItem(name = "Order", value = "Order"), @FlyRefItem(name = "GL Journal", value = "GL Journal"),
			@FlyRefItem(name = "Project", value = "Project"), })
	C_Recurring_Type,
	//
	@FlyRefList(name = "AD_Menu Action", description = "Menu Action list", items = {
			@FlyRefItem(name = "Form", value = "Form"), @FlyRefItem(name = "Process", value = "Process"),
			@FlyRefItem(name = "Report", value = "Report"), @FlyRefItem(name = "Workbench", value = "Workbench"),
			@FlyRefItem(name = "Window", value = "Window"), @FlyRefItem(name = "Task", value = "Task"),
			@FlyRefItem(name = "WorkFlow", value = "WorkFlow"),
			@FlyRefItem(name = "Smart Browse", value = "Smart Browse"), })
	AD_Menu_Action,
	//
	@FlyRefList(name = "CM_Container Type", items = { @FlyRefItem(name = "Document", value = "Document"),
			@FlyRefItem(name = "Internal Link", value = "Internal Link"),
			@FlyRefItem(name = "External URL", value = "External URL"), })
	CM_Container_Type,
	//
	@FlyRefList(name = "CM_WebAccessLog Type", items = { @FlyRefItem(name = "Web Access", value = "Web Access"),
			@FlyRefItem(name = "Ad display", value = "Ad display"),
			@FlyRefItem(name = "Redirect", value = "Redirect"), })
	CM_WebAccessLog_Type,
	//
	@FlyRefList(name = "K_IndexLog QuerySource", items = { @FlyRefItem(name = "Self Service", value = "Self Service"),
			@FlyRefItem(name = "Collaboration Management", value = "Collaboration Management"),
			@FlyRefItem(name = "Java Client", value = "Java Client"),
			@FlyRefItem(name = "HTML Client", value = "HTML Client"), })
	K_IndexLog_QuerySource,
	//
	@FlyRefList(name = "C_AcctSchema TaxCorrectionType", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "Write-off only", value = "Write-off only"),
			@FlyRefItem(name = "Discount only", value = "Discount only"),
			@FlyRefItem(name = "Write-off and Discount", value = "Write-off and Discount"), })
	C_AcctSchema_TaxCorrectionType,
	//
	@FlyRefList(name = "CM_Media Media Type", items = { @FlyRefItem(name = "text/js", value = "text/js"),
			@FlyRefItem(name = "image/jpeg", value = "image/jpeg"),
			@FlyRefItem(name = "image/png", value = "image/png"),
			@FlyRefItem(name = "application/pdf", value = "application/pdf"),
			@FlyRefItem(name = "text/css", value = "text/css"), @FlyRefItem(name = "image/gif", value = "image/gif"), })
	CM_Media_Media_Type,
	//
	@FlyRefList(name = "AD_Window Types", description = "Window Type list", help = "e.g. M = Multi/Single (one uppercase character)", items = {
			@FlyRefItem(name = "Single Record", value = "Single Record"),
			@FlyRefItem(name = "Maintain", value = "Maintain"),
			@FlyRefItem(name = "Transaction", value = "Transaction"),
			@FlyRefItem(name = "Query Only", value = "Query Only"), })
	AD_Window_Types,
	//
	@FlyRefList(name = "C_Conversion_Rate Types", description = "Conversion Rate Type list", items = {
			@FlyRefItem(name = "Company", value = "Company"), @FlyRefItem(name = "User Type", value = "User Type"),
			@FlyRefItem(name = "Manual Rate", value = "Manual Rate"), @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "Spot", value = "Spot"), @FlyRefItem(name = "Period End", value = "Period End"),
			@FlyRefItem(name = "Fixed", value = "Fixed"), @FlyRefItem(name = "Average", value = "Average"), })
	C_Conversion_Rate_Types,
	//
	@FlyRefList(name = "M_InOutConfirm Type", items = {
			@FlyRefItem(name = "Vendor Confirmation", value = "Vendor Confirmation"),
			@FlyRefItem(name = "Customer Confirmation", value = "Customer Confirmation"),
			@FlyRefItem(name = "Drop Ship Confirm", value = "Drop Ship Confirm"),
			@FlyRefItem(name = "Ship/Receipt Confirm", value = "Ship/Receipt Confirm"),
			@FlyRefItem(name = "Pick/QA Confirm", value = "Pick/QA Confirm"), })
	M_InOutConfirm_Type,
	//
	@FlyRefList(name = "C_Period Type", description = "Period Type list", items = {
			@FlyRefItem(name = "Standard Calendar Period", value = "Standard Calendar Period"),
			@FlyRefItem(name = "Adjustment Period", value = "Adjustment Period"), })
	C_Period_Type,
	//
	@FlyRefList(name = "C_Element Type", description = "Account Element Types", items = {
			@FlyRefItem(name = "Account", value = "Account"),
			@FlyRefItem(name = "User defined", value = "User defined"), })
	C_Element_Type,
	//
	@FlyRefList(name = "C_ElementValue AccountType", description = "Account Type list", items = {
			@FlyRefItem(name = "Asset", value = "Asset"), @FlyRefItem(name = "Liability", value = "Liability"),
			@FlyRefItem(name = "Revenue", value = "Revenue"), @FlyRefItem(name = "Expense", value = "Expense"),
			@FlyRefItem(name = "Owner's Equity", value = "Owner's Equity"),
			@FlyRefItem(name = "Memo", value = "Memo"), })
	C_ElementValue_AccountType,
	//
	@FlyRefList(name = "C_ElementValue Account Sign", description = "Account Sign list", items = {
			@FlyRefItem(name = "Natural", value = "Natural"), @FlyRefItem(name = "Debit", value = "Debit"),
			@FlyRefItem(name = "Credit", value = "Credit"), })
	C_ElementValue_Account_Sign,
	//
	@FlyRefList(name = "AD_TreeType Type", description = "Tree Type list", help = "Determines which element to use as the base for the information", items = {
			@FlyRefItem(name = "User 1", value = "User 1"), @FlyRefItem(name = "User 2", value = "User 2"),
			@FlyRefItem(name = "User 3", value = "User 3"), @FlyRefItem(name = "User 4", value = "User 4"),
			@FlyRefItem(name = "CM Container", value = "CM Container"),
			@FlyRefItem(name = "CM Container Stage", value = "CM Container Stage"),
			@FlyRefItem(name = "CM Template", value = "CM Template"),
			@FlyRefItem(name = "CM Media", value = "CM Media"), @FlyRefItem(name = "Menu", value = "Menu"),
			@FlyRefItem(name = "Element Value", value = "Element Value"),
			@FlyRefItem(name = "Product", value = "Product"), @FlyRefItem(name = "BPartner", value = "BPartner"),
			@FlyRefItem(name = "Organization", value = "Organization"), @FlyRefItem(name = "BoM", value = "BoM"),
			@FlyRefItem(name = "Project", value = "Project"),
			@FlyRefItem(name = "Sales Region", value = "Sales Region"),
			@FlyRefItem(name = "Product Category", value = "Product Category"),
			@FlyRefItem(name = "Campaign", value = "Campaign"), @FlyRefItem(name = "Activity", value = "Activity"), })
	AD_TreeType_Type,
	//
	@FlyRefList(name = "X12DE98 Entity Identifier Code", description = "X12DE98 Entity Identifier Code list", help = "Identify organizational entity physical location property or individual list", items = {
			@FlyRefItem(name = "Regional Office", value = "Regional Office"),
			@FlyRefItem(name = "Accounts Payable Office", value = "Accounts Payable Office"),
			@FlyRefItem(name = "Plant", value = "Plant"),
			@FlyRefItem(name = "Small Business", value = "Small Business"),
			@FlyRefItem(name = "Minority-Owned Small Business", value = "Minority-Owned Small Business"),
			@FlyRefItem(name = "Minority-Owned Business", value = "Minority-Owned Business"),
			@FlyRefItem(name = "Woman-Owned Small Business", value = "Woman-Owned Small Business"),
			@FlyRefItem(name = "Woman-Owned Business", value = "Woman-Owned Business"),
			@FlyRefItem(name = "Subcontractor", value = "Subcontractor"),
			@FlyRefItem(name = "Individual", value = "Individual"),
			@FlyRefItem(name = "Partnership", value = "Partnership"),
			@FlyRefItem(name = "Corporation", value = "Corporation"),
			@FlyRefItem(name = "Drop-off Location", value = "Drop-off Location"), })
	X12DE98_Entity_Identifier_Code,
	//
	@FlyRefList(name = "C_AcctSchema Costing Method", description = "Costing Method list", items = {
			@FlyRefItem(name = "Last PO Price", value = "Last PO Price"), @FlyRefItem(name = "_", value = "_"),
			@FlyRefItem(name = "Standard Costing", value = "Standard Costing"),
			@FlyRefItem(name = "Average PO", value = "Average PO"), @FlyRefItem(name = "Lifo", value = "Lifo"),
			@FlyRefItem(name = "Fifo", value = "Fifo"),
			@FlyRefItem(name = "Average Invoice", value = "Average Invoice"),
			@FlyRefItem(name = "Last Invoice", value = "Last Invoice"),
			@FlyRefItem(name = "User Defined", value = "User Defined"), })
	C_AcctSchema_Costing_Method,
	//
	@FlyRefList(name = "C_AcctSchema GAAP", description = "General Accepted Accounting Principle list", items = {
			@FlyRefItem(name = "International GAAP", value = "International GAAP"),
			@FlyRefItem(name = "US GAAP", value = "US GAAP"), @FlyRefItem(name = "German HGB", value = "German HGB"),
			@FlyRefItem(name = "French Accounting Standard", value = "French Accounting Standard"),
			@FlyRefItem(name = "Custom Accounting Rules", value = "Custom Accounting Rules"), })
	C_AcctSchema_GAAP,
	//
	@FlyRefList(name = "AD_Table Replication Type", description = "Replication Type", items = {
			@FlyRefItem(name = "Local", value = "Local"), @FlyRefItem(name = "Merge", value = "Merge"),
			@FlyRefItem(name = "Reference", value = "Reference"),
			@FlyRefItem(name = "Broadcast", value = "Broadcast"), })
	AD_Table_Replication_Type,
	//
	@FlyRefList(name = "M_Product BOM Product TypeX", description = "Old", items = {
			@FlyRefItem(name = "In alternative Group 5", value = "In alternative Group 5"),
			@FlyRefItem(name = "In alternative Group 6", value = "In alternative Group 6"),
			@FlyRefItem(name = "In alternative Group 7", value = "In alternative Group 7"),
			@FlyRefItem(name = "In alternative Group 8", value = "In alternative Group 8"),
			@FlyRefItem(name = "In alternative Group 9", value = "In alternative Group 9"),
			@FlyRefItem(name = "Standard Part", value = "Standard Part"),
			@FlyRefItem(name = "Optional Part", value = "Optional Part"),
			@FlyRefItem(name = "In alternative Group 1", value = "In alternative Group 1"),
			@FlyRefItem(name = "In alternative Group 2", value = "In alternative Group 2"),
			@FlyRefItem(name = "In alternaltve Group 3", value = "In alternaltve Group 3"),
			@FlyRefItem(name = "In alternative Group 4", value = "In alternative Group 4"), })
	M_Product_BOM_Product_TypeX,
	//
	@FlyRefList(name = "AD_Workflow Type", description = "Workflow Type", items = {
			@FlyRefItem(name = "General", value = "General"),
			@FlyRefItem(name = "Document Process", value = "Document Process"),
			@FlyRefItem(name = "Document Value", value = "Document Value"),
			@FlyRefItem(name = "Quality", value = "Quality"),
			@FlyRefItem(name = "Manufacturing", value = "Manufacturing"), })
	AD_Workflow_Type,
	//
	@FlyRefList(name = "M_Replenishment Create", items = {
			@FlyRefItem(name = "Inventory Move", value = "Inventory Move"),
			@FlyRefItem(name = "Purchase Order", value = "Purchase Order"),
			@FlyRefItem(name = "Requisition", value = "Requisition"),
			@FlyRefItem(name = "Distribution Order", value = "Distribution Order"), })
	M_Replenishment_Create,
	//
	@FlyRefList(name = "AD_Role PreferenceType", description = "Preference Type", items = {
			@FlyRefItem(name = "Client", value = "Client"), @FlyRefItem(name = "Organization", value = "Organization"),
			@FlyRefItem(name = "User", value = "User"), @FlyRefItem(name = "None", value = "None"), })
	AD_Role_PreferenceType,
	//
	@FlyRefList(name = "APAR", description = "AP and/or AR", items = {
			@FlyRefItem(name = "Receivables & Payables", value = "Receivables & Payables"),
			@FlyRefItem(name = "Receivables only", value = "Receivables only"),
			@FlyRefItem(name = "Payables only", value = "Payables only"), })
	APAR,
	//
	@FlyRefList(name = "_Posting Type", description = "Posting Type (Actual Budget etc.) list", items = {
			@FlyRefItem(name = "Actual", value = "Actual"), @FlyRefItem(name = "Budget", value = "Budget"),
			@FlyRefItem(name = "Commitment", value = "Commitment"),
			@FlyRefItem(name = "Statistical", value = "Statistical"),
			@FlyRefItem(name = "Reservation", value = "Reservation"), })
	_Posting_Type,
	//
	@FlyRefList(name = "_Entity Type", description = "Entity Type (Dictionary, ..)", items = {
			@FlyRefItem(name = "Dictionary", value = "Dictionary"),
			@FlyRefItem(name = "Adempiere", value = "Adempiere"),
			@FlyRefItem(name = "User maintained", value = "User maintained"),
			@FlyRefItem(name = "Applications", value = "Applications"),
			@FlyRefItem(name = "Customization", value = "Customization"), })
	_Entity_Type,
	//
	@FlyRefList(name = "ShowHelp List", items = {
			@FlyRefItem(name = "Run silently - Take Defaults", value = "Run silently - Take Defaults"),
			@FlyRefItem(name = "Ask user (for future use)", value = "Ask user (for future use)"),
			@FlyRefItem(name = "Don't show help", value = "Don't show help"),
			@FlyRefItem(name = "Show Help", value = "Show Help"), })
	ShowHelp_List,
	//
	@FlyRefList(name = "_Document Status", description = "Document Status list", items = {
			@FlyRefItem(name = "Approved", value = "Approved"), @FlyRefItem(name = "Closed", value = "Closed"),
			@FlyRefItem(name = "Completed", value = "Completed"), @FlyRefItem(name = "Invalid", value = "Invalid"),
			@FlyRefItem(name = "Reversed", value = "Reversed"), @FlyRefItem(name = "Voided", value = "Voided"),
			@FlyRefItem(name = "Unknown", value = "Unknown"), @FlyRefItem(name = "In Progress", value = "In Progress"),
			@FlyRefItem(name = "Not Approved", value = "Not Approved"),
			@FlyRefItem(name = "Waiting Payment", value = "Waiting Payment"),
			@FlyRefItem(name = "Drafted", value = "Drafted"),
			@FlyRefItem(name = "Waiting Confirmation", value = "Waiting Confirmation"), })
	_Document_Status,
	//
	@FlyRefList(name = "_Document Action", description = "Document action list", items = {
			@FlyRefItem(name = "Complete", value = "Complete"), @FlyRefItem(name = "Approve", value = "Approve"),
			@FlyRefItem(name = "Reject", value = "Reject"), @FlyRefItem(name = "Post", value = "Post"),
			@FlyRefItem(name = "Void", value = "Void"), @FlyRefItem(name = "Close", value = "Close"),
			@FlyRefItem(name = "Reverse - Correct", value = "Reverse - Correct"),
			@FlyRefItem(name = "Reverse - Accrual", value = "Reverse - Accrual"),
			@FlyRefItem(name = "Invalidate", value = "Invalidate"),
			@FlyRefItem(name = "Re-activate", value = "Re-activate"), @FlyRefItem(name = "<None>", value = "<None>"),
			@FlyRefItem(name = "Wait Complete", value = "Wait Complete"),
			@FlyRefItem(name = "Prepare", value = "Prepare"), @FlyRefItem(name = "Unlock", value = "Unlock"), })
	_Document_Action,
	//
	@FlyRefList(name = "M_Discount CumulativeLevel", items = { @FlyRefItem(name = "Line", value = "Line"), })
	M_Discount_CumulativeLevel,
	//
	@FlyRefList(name = "M_Discount Type", items = { @FlyRefItem(name = "Flat Percent", value = "Flat Percent"),
			@FlyRefItem(name = "Formula", value = "Formula"), @FlyRefItem(name = "Breaks", value = "Breaks"),
			@FlyRefItem(name = "Pricelist", value = "Pricelist"), })
	M_Discount_Type,
	//
	@FlyRefList(name = "AD_Color StartPoint", description = "Nord-West-..", items = {
			@FlyRefItem(name = "North", value = "North"), @FlyRefItem(name = "North East", value = "North East"),
			@FlyRefItem(name = "East", value = "East"), @FlyRefItem(name = "South East", value = "South East"),
			@FlyRefItem(name = "South", value = "South"), @FlyRefItem(name = "South West", value = "South West"),
			@FlyRefItem(name = "West", value = "West"), @FlyRefItem(name = "North West", value = "North West"), })
	AD_Color_StartPoint,
	//
	@FlyRefList(name = "CostUpdate Source", items = { @FlyRefItem(name = "FiFo", value = "FiFo"),
			@FlyRefItem(name = "LiFo", value = "LiFo"),
			@FlyRefItem(name = "Average Invoice", value = "Average Invoice"),
			@FlyRefItem(name = "Old Standard Cost", value = "Old Standard Cost"),
			@FlyRefItem(name = "Future Standard Cost", value = "Future Standard Cost"),
			@FlyRefItem(name = "Standard Cost", value = "Standard Cost"),
			@FlyRefItem(name = "Average PO", value = "Average PO"),
			@FlyRefItem(name = "Last PO Price", value = "Last PO Price"),
			@FlyRefItem(name = "Last Invoice Price", value = "Last Invoice Price"),
			@FlyRefItem(name = "Price List (Limit)", value = "Price List (Limit)"),
			@FlyRefItem(name = "Average PO History", value = "Average PO History"),
			@FlyRefItem(name = "Average Invoice History", value = "Average Invoice History"), })
	CostUpdate_Source,
	//
	@FlyRefList(name = "C_Tax SPPOType", items = { @FlyRefItem(name = "Both", value = "Both"),
			@FlyRefItem(name = "Sales Tax", value = "Sales Tax"),
			@FlyRefItem(name = "Purchase Tax", value = "Purchase Tax"), })
	C_Tax_SPPOType,
	//
	@FlyRefList(name = "C_BPartner SOCreditStatus", description = "Sales Credit Status", items = {
			@FlyRefItem(name = "Credit Stop", value = "Credit Stop"),
			@FlyRefItem(name = "Credit Hold", value = "Credit Hold"),
			@FlyRefItem(name = "Credit Watch", value = "Credit Watch"),
			@FlyRefItem(name = "No Credit Check", value = "No Credit Check"),
			@FlyRefItem(name = "Credit OK", value = "Credit OK"), })
	C_BPartner_SOCreditStatus,
	//
	@FlyRefList(name = "AD_Field ObscureType", items = {
			@FlyRefItem(name = "Obscure Digits but last 4", value = "Obscure Digits but last 4"),
			@FlyRefItem(name = "Obscure Digits but first/last 4", value = "Obscure Digits but first/last 4"),
			@FlyRefItem(name = "Obscure AlphaNumeric but first/last 4", value = "Obscure AlphaNumeric but first/last 4"),
			@FlyRefItem(name = "Obscure AlphaNumeric but last 4", value = "Obscure AlphaNumeric but last 4"), })
	AD_Field_ObscureType,
	//
	@FlyRefList(name = "AD_Table_Access RuleType", description = "AccessRuleType", items = {
			@FlyRefItem(name = "Accessing", value = "Accessing"), @FlyRefItem(name = "Reporting", value = "Reporting"),
			@FlyRefItem(name = "Exporting", value = "Exporting"), })
	AD_Table_Access_RuleType,
	//
	@FlyRefList(name = "M_TransactionAllocation Type", items = { @FlyRefItem(name = "LiFo", value = "LiFo"),
			@FlyRefItem(name = "FiFo", value = "FiFo"), })
	M_TransactionAllocation_Type,
	//
	@FlyRefList(name = "M_Inventory Type", description = "Inventory Type (Difference - Charge)", items = {
			@FlyRefItem(name = "Inventory Difference", value = "Inventory Difference"),
			@FlyRefItem(name = "Charge Account", value = "Charge Account"), })
	M_Inventory_Type,
	//
	@FlyRefList(name = "C_ProjectType Category", items = { @FlyRefItem(name = "General", value = "General"),
			@FlyRefItem(name = "Asset Project", value = "Asset Project"),
			@FlyRefItem(name = "Work Order (Job)", value = "Work Order (Job)"),
			@FlyRefItem(name = "Service (Charge) Project", value = "Service (Charge) Project"), })
	C_ProjectType_Category,
	//
	@FlyRefList(name = "AD_Reference Validation Types", description = "Reference Validation Type list", help = "e.g. I - Independent ", items = {
			@FlyRefItem(name = "List Validation", value = "List Validation"),
			@FlyRefItem(name = "DataType", value = "DataType"),
			@FlyRefItem(name = "Table Validation", value = "Table Validation"), })
	AD_Reference_Validation_Types,
	//
	@FlyRefList(name = "AD_Table Access Levels", description = "Table Access and Sharing Level list", items = {
			@FlyRefItem(name = "System+Client", value = "System+Client"),
			@FlyRefItem(name = "Organization", value = "Organization"),
			@FlyRefItem(name = "Client+Organization", value = "Client+Organization"),
			@FlyRefItem(name = "System only", value = "System only"), @FlyRefItem(name = "All", value = "All"),
			@FlyRefItem(name = "Client only", value = "Client only"), })
	AD_Table_Access_Levels,
	//
	@FlyRefList(name = "PP_Process Type", description = "Process Type", items = {
			@FlyRefItem(name = "Batch Flow ", value = "Batch Flow "),
			@FlyRefItem(name = "Continuous Flow", value = "Continuous Flow"),
			@FlyRefItem(name = "Dedicate Repetititive Flow", value = "Dedicate Repetititive Flow"),
			@FlyRefItem(name = "Job Shop", value = "Job Shop"),
			@FlyRefItem(name = "Mixed Repetitive Flow", value = "Mixed Repetitive Flow"),
			@FlyRefItem(name = "Plant", value = "Plant"), })
	PP_Process_Type,
	//
	@FlyRefList(name = "PP_ComponentType", items = { @FlyRefItem(name = "By-Product", value = "By-Product"),
			@FlyRefItem(name = "Component", value = "Component"), @FlyRefItem(name = "Phantom", value = "Phantom"),
			@FlyRefItem(name = "Packing", value = "Packing"), @FlyRefItem(name = "Planning", value = "Planning"),
			@FlyRefItem(name = "Tools", value = "Tools"), @FlyRefItem(name = "Option", value = "Option"),
			@FlyRefItem(name = "Variant", value = "Variant"), @FlyRefItem(name = "Co-Product", value = "Co-Product"), })
	PP_ComponentType,
	//
	@FlyRefList(name = "PP_Product_BOM IssueMethod", description = "Issue Method", items = {
			@FlyRefItem(name = "Issue", value = "Issue"), @FlyRefItem(name = "Backflush", value = "Backflush"),
			@FlyRefItem(name = "Floor Stock", value = "Floor Stock"), })
	PP_Product_BOM_IssueMethod,
	//
	@FlyRefList(name = "PP_Product_BOM Component Change", description = "Component Change", help = "Component Change", items = {
			@FlyRefItem(name = "Add", value = "Add"), @FlyRefItem(name = "Deactivate", value = "Deactivate"),
			@FlyRefItem(name = "Expire", value = "Expire"), @FlyRefItem(name = "Replace", value = "Replace"),
			@FlyRefItem(name = "Replace & Expire", value = "Replace & Expire"), })
	PP_Product_BOM_Component_Change,
	//
	@FlyRefList(name = "PP_Product_Planning Order Policy", items = {
			@FlyRefItem(name = "Fixed Order Quantity", value = "Fixed Order Quantity"),
			@FlyRefItem(name = "Lot-for-Lot", value = "Lot-for-Lot"),
			@FlyRefItem(name = "Period Order Quantity", value = "Period Order Quantity"), })
	PP_Product_Planning_Order_Policy,
	//
	@FlyRefList(name = "CRM Schedule", help = "Forward and Backward Scheduling", items = {
			@FlyRefItem(name = "Backward ", value = "Backward "), @FlyRefItem(name = "Forward", value = "Forward"), })
	CRM_Schedule,
	//
	@FlyRefList(name = "C_TaxBase", items = { @FlyRefItem(name = "Weight", value = "Weight"),
			@FlyRefItem(name = "Cost", value = "Cost"), @FlyRefItem(name = "Price", value = "Price"),
			@FlyRefItem(name = "Quantity", value = "Quantity"), })
	C_TaxBase,
	//
	@FlyRefList(name = "EXP_Line_Type", description = "List with Export Line types", items = {
			@FlyRefItem(name = "XML Element", value = "XML Element"),
			@FlyRefItem(name = "XML Attribute", value = "XML Attribute"),
			@FlyRefItem(name = "Embedded EXP Format", value = "Embedded EXP Format"),
			@FlyRefItem(name = "Referenced EXP Format", value = "Referenced EXP Format"), })
	EXP_Line_Type,
	//
	@FlyRefList(name = "HR Type", items = { @FlyRefItem(name = "Concept", value = "Concept"),
			@FlyRefItem(name = "Rule Engine", value = "Rule Engine"),
			@FlyRefItem(name = "Information", value = "Information"),
			@FlyRefItem(name = "Reference", value = "Reference"), })
	HR_Type,
	//
	@FlyRefList(name = "_MRP Type", description = "MRP type can be a Demand or Supply", items = {
			@FlyRefItem(name = "Supply", value = "Supply"), @FlyRefItem(name = "Demand", value = "Demand"), })
	_MRP_Type,
	//
	@FlyRefList(name = "S_Resource MFG Type", description = "Manufacturing Resource Type", items = {
			@FlyRefItem(name = "Production Line", value = "Production Line"),
			@FlyRefItem(name = "Plant", value = "Plant"), @FlyRefItem(name = "Work Center", value = "Work Center"),
			@FlyRefItem(name = "Work Station", value = "Work Station"), })
	S_Resource_MFG_Type,
	//
	@FlyRefList(name = "HR ColumnType", items = { @FlyRefItem(name = "Amount", value = "Amount"),
			@FlyRefItem(name = "Date", value = "Date"), @FlyRefItem(name = "Quantity", value = "Quantity"),
			@FlyRefItem(name = "Text", value = "Text"), })
	HR_ColumnType,
	//
	@FlyRefList(name = "C_DocType SubTypeSO", description = "Order Types list", items = {
			@FlyRefItem(name = "On Credit Order", value = "On Credit Order"),
			@FlyRefItem(name = "POS Order", value = "POS Order"),
			@FlyRefItem(name = "Warehouse Order", value = "Warehouse Order"),
			@FlyRefItem(name = "Standard Order", value = "Standard Order"),
			@FlyRefItem(name = "Proposal", value = "Proposal"), @FlyRefItem(name = "Quotation", value = "Quotation"),
			@FlyRefItem(name = "Return Material", value = "Return Material"),
			@FlyRefItem(name = "Prepay Order", value = "Prepay Order"), })
	C_DocType_SubTypeSO,
	//
	@FlyRefList(name = "AD_Print Graph Type", items = { @FlyRefItem(name = "Pie Chart", value = "Pie Chart"),
			@FlyRefItem(name = "Line Chart", value = "Line Chart"),
			@FlyRefItem(name = "Bar Chart", value = "Bar Chart"), })
	AD_Print_Graph_Type,
	//
	@FlyRefList(name = "_MRP Order Type", items = { @FlyRefItem(name = "Safety Stock", value = "Safety Stock"),
			@FlyRefItem(name = "Forecast", value = "Forecast"),
			@FlyRefItem(name = "Purchase Order", value = "Purchase Order"),
			@FlyRefItem(name = "Material Requisition", value = "Material Requisition"),
			@FlyRefItem(name = "Sales Order", value = "Sales Order"),
			@FlyRefItem(name = "Distribution Order", value = "Distribution Order"),
			@FlyRefItem(name = "Manufacturing Order", value = "Manufacturing Order"), })
	_MRP_Order_Type,
	//
	@FlyRefList(name = "C_Payment CreditCard Type", description = "C_Payment Credit Card Type list", items = {
			@FlyRefItem(name = "Amex", value = "Amex"), @FlyRefItem(name = "ATM", value = "ATM"),
			@FlyRefItem(name = "MasterCard", value = "MasterCard"), @FlyRefItem(name = "Visa", value = "Visa"),
			@FlyRefItem(name = "Purchase Card", value = "Purchase Card"),
			@FlyRefItem(name = "Diners", value = "Diners"), @FlyRefItem(name = "Discover", value = "Discover"), })
	C_Payment_CreditCard_Type,
	//
	@FlyRefList(name = "M_Product_ProductType", items = { @FlyRefItem(name = "Item", value = "Item"),
			@FlyRefItem(name = "Service", value = "Service"), @FlyRefItem(name = "Resource", value = "Resource"),
			@FlyRefItem(name = "Expense type", value = "Expense type"),
			@FlyRefItem(name = "Online", value = "Online"), })
	M_Product_ProductType,
	//
	@FlyRefList(name = "M_DiscountPriceList RoundingRule", description = "Price Rounding Rule list", items = {
			@FlyRefItem(name = "Whole Number .00", value = "Whole Number .00"),
			@FlyRefItem(name = "No Rounding", value = "No Rounding"),
			@FlyRefItem(name = "Quarter .25 .50 .75", value = "Quarter .25 .50 .75"),
			@FlyRefItem(name = "Dime .10, .20, .30, ...", value = "Dime .10, .20, .30, ..."),
			@FlyRefItem(name = "Nickel .05, .10, .15, ...", value = "Nickel .05, .10, .15, ..."),
			@FlyRefItem(name = "Ten 10.00, 20.00, ..", value = "Ten 10.00, 20.00, .."),
			@FlyRefItem(name = "Currency Precision", value = "Currency Precision"),
			@FlyRefItem(name = "Ending in 9/5", value = "Ending in 9/5"), })
	M_DiscountPriceList_RoundingRule,
	//
	@FlyRefList(name = "AD_PrintFormatItem ShapeType", items = {
			@FlyRefItem(name = "3D Rectangle", value = "3D Rectangle"), @FlyRefItem(name = "Oval", value = "Oval"),
			@FlyRefItem(name = "Round Rectangle", value = "Round Rectangle"),
			@FlyRefItem(name = "Normal Rectangle", value = "Normal Rectangle"), })
	AD_PrintFormatItem_ShapeType,
	//
	@FlyRefList(name = "AD_Client AutoArchive", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "All (Reports, Documents)", value = "All (Reports, Documents)"),
			@FlyRefItem(name = "Documents", value = "Documents"),
			@FlyRefItem(name = "External Documents", value = "External Documents"), })
	AD_Client_AutoArchive,
	//
	@FlyRefList(name = "R_Request Confidential", items = {
			@FlyRefItem(name = "Public Information", value = "Public Information"),
			@FlyRefItem(name = "Partner Confidential", value = "Partner Confidential"),
			@FlyRefItem(name = "Private Information", value = "Private Information"),
			@FlyRefItem(name = "Internal", value = "Internal"), })
	R_Request_Confidential,
	//
	@FlyRefList(name = "W_MailMsg Type", items = {
			@FlyRefItem(name = "Order Acknowledgement", value = "Order Acknowledgement"),
			@FlyRefItem(name = "Payment Acknowledgement", value = "Payment Acknowledgement"),
			@FlyRefItem(name = "Payment Error", value = "Payment Error"),
			@FlyRefItem(name = "User Verification", value = "User Verification"),
			@FlyRefItem(name = "User Password", value = "User Password"),
			@FlyRefItem(name = "Subscribe", value = "Subscribe"),
			@FlyRefItem(name = "UnSubscribe", value = "UnSubscribe"),
			@FlyRefItem(name = "User Account", value = "User Account"),
			@FlyRefItem(name = "Request", value = "Request"), })
	W_MailMsg_Type,
	//
	@FlyRefList(name = "AD_SysConfig ConfigurationLevel", description = "Configuration Level", items = {
			@FlyRefItem(name = "System", value = "System"), @FlyRefItem(name = "Client", value = "Client"),
			@FlyRefItem(name = "Organization", value = "Organization"), })
	AD_SysConfig_ConfigurationLevel,
	//
	@FlyRefList(name = "ASP_Status", items = { @FlyRefItem(name = "Hide", value = "Hide"),
			@FlyRefItem(name = "Show", value = "Show"), @FlyRefItem(name = "Undefined", value = "Undefined"), })
	ASP_Status,
	//
	@FlyRefList(name = "AD_Rule_RuleType", items = {
			@FlyRefItem(name = "Aspect Orient Program", value = "Aspect Orient Program"),
			@FlyRefItem(name = "JSR 223 Scripting APIs", value = "JSR 223 Scripting APIs"),
			@FlyRefItem(name = "JSR 94 Rule Engine API", value = "JSR 94 Rule Engine API"),
			@FlyRefItem(name = "SQL", value = "SQL"), })
	AD_Rule_RuleType,
	//
	@FlyRefList(name = "AD_Rule_EventType", items = {
			@FlyRefItem(name = "Human Resource & Payroll", value = "Human Resource & Payroll"),
			@FlyRefItem(name = "Measure for Performance Analysis", value = "Measure for Performance Analysis"),
			@FlyRefItem(name = "Callout", value = "Callout"), @FlyRefItem(name = "Process", value = "Process"),
			@FlyRefItem(name = "Model Validator Table Event", value = "Model Validator Table Event"),
			@FlyRefItem(name = "Model Validator Document Event", value = "Model Validator Document Event"),
			@FlyRefItem(name = "Model Validator Login Event", value = "Model Validator Login Event"),
			@FlyRefItem(name = "GL Reconciliation", value = "GL Reconciliation"), })
	AD_Rule_EventType,
	//
	@FlyRefList(name = "EventModelValidator", items = {
			@FlyRefItem(name = "Table Before New", value = "Table Before New"),
			@FlyRefItem(name = "Table Before Change", value = "Table Before Change"),
			@FlyRefItem(name = "Table Before Delete", value = "Table Before Delete"),
			@FlyRefItem(name = "Table After New", value = "Table After New"),
			@FlyRefItem(name = "Table After Change", value = "Table After Change"),
			@FlyRefItem(name = "Table After Delete", value = "Table After Delete"),
			@FlyRefItem(name = "Document Before Prepare", value = "Document Before Prepare"),
			@FlyRefItem(name = "Document Before Void", value = "Document Before Void"),
			@FlyRefItem(name = "Document Before Close", value = "Document Before Close"),
			@FlyRefItem(name = "Document Before Reactivate", value = "Document Before Reactivate"),
			@FlyRefItem(name = "Document Before Reverse Correct", value = "Document Before Reverse Correct"),
			@FlyRefItem(name = "Document Before Reverse Accrual", value = "Document Before Reverse Accrual"),
			@FlyRefItem(name = "Document Before Complete", value = "Document Before Complete"),
			@FlyRefItem(name = "Document Before Post", value = "Document Before Post"),
			@FlyRefItem(name = "Document After Prepare", value = "Document After Prepare"),
			@FlyRefItem(name = "Document After Void", value = "Document After Void"),
			@FlyRefItem(name = "Document After Close", value = "Document After Close"),
			@FlyRefItem(name = "Document After Reactivate", value = "Document After Reactivate"),
			@FlyRefItem(name = "Document After Reverse Correct", value = "Document After Reverse Correct"),
			@FlyRefItem(name = "Document After Reverse Accrual", value = "Document After Reverse Accrual"),
			@FlyRefItem(name = "Document After Complete", value = "Document After Complete"),
			@FlyRefItem(name = "Document After Post", value = "Document After Post"),
			@FlyRefItem(name = "Table After New Replication", value = "Table After New Replication"),
			@FlyRefItem(name = "Table After Change Replication", value = "Table After Change Replication"),
			@FlyRefItem(name = "Table Before Delete Replication", value = "Table Before Delete Replication"), })
	EventModelValidator,
	//
	@FlyRefList(name = "EventChangeLog", items = { @FlyRefItem(name = "Delete", value = "Delete"),
			@FlyRefItem(name = "Insert", value = "Insert"), @FlyRefItem(name = "Update", value = "Update"), })
	EventChangeLog,
	//
	@FlyRefList(name = "MigrationScriptStatus", description = "Migration Script Status", items = {
			@FlyRefItem(name = "In Progress", value = "In Progress"),
			@FlyRefItem(name = "Completed", value = "Completed"), @FlyRefItem(name = "Error", value = "Error"), })
	MigrationScriptStatus,
	//
	@FlyRefList(name = "AD_User NotificationType", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "EMail+Notice", value = "EMail+Notice"), @FlyRefItem(name = "EMail", value = "EMail"),
			@FlyRefItem(name = "Notice", value = "Notice"), })
	AD_User_NotificationType,
	//
	@FlyRefList(name = "AD_Column Encrypted", items = { @FlyRefItem(name = "Encrypted", value = "Encrypted"),
			@FlyRefItem(name = "Not Encrypted", value = "Not Encrypted"), })
	AD_Column_Encrypted,
	//
	@FlyRefList(name = "C_AcctSchema CostingLevel", items = { @FlyRefItem(name = "Client", value = "Client"),
			@FlyRefItem(name = "Organization", value = "Organization"),
			@FlyRefItem(name = "Batch/Lot", value = "Batch/Lot"),
			@FlyRefItem(name = "Warehouse", value = "Warehouse"), })
	C_AcctSchema_CostingLevel,
	//
	@FlyRefList(name = "AD_WF_Node EMailRecipient", items = {
			@FlyRefItem(name = "Document Owner", value = "Document Owner"),
			@FlyRefItem(name = "Document Business Partner", value = "Document Business Partner"),
			@FlyRefItem(name = "WF Responsible", value = "WF Responsible"), })
	AD_WF_Node_EMailRecipient,
	//
	@FlyRefList(name = "C_AcctSchema CommitmentType", items = {
			@FlyRefItem(name = "PO/SO Commitment & Reservation", value = "PO/SO Commitment & Reservation"),
			@FlyRefItem(name = "SO Commitment only", value = "SO Commitment only"),
			@FlyRefItem(name = "PO/SO Commitment", value = "PO/SO Commitment"),
			@FlyRefItem(name = "PO Commitment only", value = "PO Commitment only"),
			@FlyRefItem(name = "PO Commitment & Reservation", value = "PO Commitment & Reservation"),
			@FlyRefItem(name = "None", value = "None"), })
	C_AcctSchema_CommitmentType,
	//
	@FlyRefList(name = "GL_BudgetControl Scope", items = { @FlyRefItem(name = "Period only", value = "Period only"),
			@FlyRefItem(name = "Year To Date", value = "Year To Date"), @FlyRefItem(name = "Total", value = "Total"), })
	GL_BudgetControl_Scope,
	//
	@FlyRefList(name = "AD_User ConnectionProfile", items = { @FlyRefItem(name = "VPN", value = "VPN"),
			@FlyRefItem(name = "WAN", value = "WAN"), @FlyRefItem(name = "LAN", value = "LAN"),
			@FlyRefItem(name = "Terminal Server", value = "Terminal Server"), })
	AD_User_ConnectionProfile,
	//
	@FlyRefList(name = "AD_Client ShareType", items = {
			@FlyRefItem(name = "Client (all shared)", value = "Client (all shared)"),
			@FlyRefItem(name = "Org (not shared)", value = "Org (not shared)"),
			@FlyRefItem(name = "Client or Org", value = "Client or Org"), })
	AD_Client_ShareType,
	//
	@FlyRefList(name = "R_Request TaskStatus", items = {
			@FlyRefItem(name = " 0% Not Started", value = " 0% Not Started"),
			@FlyRefItem(name = "100% Complete", value = "100% Complete"),
			@FlyRefItem(name = " 20% Started", value = " 20% Started"),
			@FlyRefItem(name = " 80% Nearly Done", value = " 80% Nearly Done"),
			@FlyRefItem(name = " 40% Busy", value = " 40% Busy"),
			@FlyRefItem(name = " 60% Good Progress", value = " 60% Good Progress"),
			@FlyRefItem(name = " 90% Finishing", value = " 90% Finishing"),
			@FlyRefItem(name = " 95% Almost Done", value = " 95% Almost Done"),
			@FlyRefItem(name = " 99% Cleaning up", value = " 99% Cleaning up"), })
	R_Request_TaskStatus,
	//
	@FlyRefList(name = "PA_Goal Scope", items = { @FlyRefItem(name = "Year", value = "Year"),
			@FlyRefItem(name = "Quarter", value = "Quarter"), @FlyRefItem(name = "Month", value = "Month"),
			@FlyRefItem(name = "Total", value = "Total"), @FlyRefItem(name = "Week", value = "Week"),
			@FlyRefItem(name = "Day", value = "Day"), })
	PA_Goal_Scope,
	//
	@FlyRefList(name = "PA_Goal Restriction Type", items = {
			@FlyRefItem(name = "Bus.Partner Group", value = "Bus.Partner Group"),
			@FlyRefItem(name = "Product Category", value = "Product Category"),
			@FlyRefItem(name = "Organization", value = "Organization"),
			@FlyRefItem(name = "Business Partner", value = "Business Partner"),
			@FlyRefItem(name = "Product", value = "Product"), })
	PA_Goal_Restriction_Type,
	//
	@FlyRefList(name = "AD_PrintPaper Units", items = { @FlyRefItem(name = "MM", value = "MM"),
			@FlyRefItem(name = "Inch", value = "Inch"), })
	AD_PrintPaper_Units,
	//
	@FlyRefList(name = "M_Inventory CountSet", items = { @FlyRefItem(name = "On Hand Qty", value = "On Hand Qty"),
			@FlyRefItem(name = "Zero", value = "Zero"), })
	M_Inventory_CountSet,
	//
	@FlyRefList(name = "AD_PrintFormatItem BarcodeType", items = {
			@FlyRefItem(name = "Code 39 USD3 w/o Checksum", value = "Code 39 USD3 w/o Checksum"),
			@FlyRefItem(name = "Code 39  3 of 9 linear with Checksum", value = "Code 39  3 of 9 linear with Checksum"),
			@FlyRefItem(name = "Code 39 linear w/o Checksum", value = "Code 39 linear w/o Checksum"),
			@FlyRefItem(name = "EAN 13", value = "EAN 13"),
			@FlyRefItem(name = "Codabar 2 of 7 linear", value = "Codabar 2 of 7 linear"),
			@FlyRefItem(name = "Code 39  3 of 9 linear w/o Checksum", value = "Code 39  3 of 9 linear w/o Checksum"),
			@FlyRefItem(name = "Codeabar linear", value = "Codeabar linear"),
			@FlyRefItem(name = "Code 128 dynamically switching", value = "Code 128 dynamically switching"),
			@FlyRefItem(name = "Code 128 A character set", value = "Code 128 A character set"),
			@FlyRefItem(name = "Code 128 B character set", value = "Code 128 B character set"),
			@FlyRefItem(name = "Code 128 C character set", value = "Code 128 C character set"),
			@FlyRefItem(name = "Code 39 linear with Checksum", value = "Code 39 linear with Checksum"),
			@FlyRefItem(name = "EAN 128", value = "EAN 128"),
			@FlyRefItem(name = "Global Trade Item No GTIN UCC/EAN 128", value = "Global Trade Item No GTIN UCC/EAN 128"),
			@FlyRefItem(name = "Codabar Monarch linear", value = "Codabar Monarch linear"),
			@FlyRefItem(name = "Codabar NW-7 linear", value = "Codabar NW-7 linear"),
			@FlyRefItem(name = "PDF417 two dimensional", value = "PDF417 two dimensional"),
			@FlyRefItem(name = "SCC-14 shipping code UCC/EAN 128", value = "SCC-14 shipping code UCC/EAN 128"),
			@FlyRefItem(name = "Shipment ID number UCC/EAN 128", value = "Shipment ID number UCC/EAN 128"),
			@FlyRefItem(name = "UCC 128", value = "UCC 128"),
			@FlyRefItem(name = "Code 39 USD3 with Checksum", value = "Code 39 USD3 with Checksum"),
			@FlyRefItem(name = "Codabar USD-4 linear", value = "Codabar USD-4 linear"),
			@FlyRefItem(name = "US Postal Service UCC/EAN 128", value = "US Postal Service UCC/EAN 128"),
			@FlyRefItem(name = "SSCC-18 number UCC/EAN 128", value = "SSCC-18 number UCC/EAN 128"), })
	AD_PrintFormatItem_BarcodeType,
	//
	@FlyRefList(name = "_MMPolicy", description = "Material Movement Policy", items = {
			@FlyRefItem(name = "LiFo", value = "LiFo"), @FlyRefItem(name = "FiFo", value = "FiFo"), })
	_MMPolicy,
	//
	@FlyRefList(name = "M_CostElement Type", items = {
			@FlyRefItem(name = "Burden (M.Overhead)", value = "Burden (M.Overhead)"),
			@FlyRefItem(name = "Outside Processing", value = "Outside Processing"),
			@FlyRefItem(name = "Resource", value = "Resource"), @FlyRefItem(name = "Material", value = "Material"),
			@FlyRefItem(name = "Overhead", value = "Overhead"),
			@FlyRefItem(name = "Landed Cost", value = "Landed Cost"), })
	M_CostElement_Type,
	//
	@FlyRefList(name = "C_LandedCost Distribution", items = { @FlyRefItem(name = "Quantity", value = "Quantity"),
			@FlyRefItem(name = "Line", value = "Line"), @FlyRefItem(name = "Volume", value = "Volume"),
			@FlyRefItem(name = "Weight", value = "Weight"), @FlyRefItem(name = "Costs", value = "Costs"), })
	C_LandedCost_Distribution,
	//
	@FlyRefList(name = "AD_System Status", items = { @FlyRefItem(name = "Production", value = "Production"),
			@FlyRefItem(name = "Evaluation", value = "Evaluation"),
			@FlyRefItem(name = "Implementation", value = "Implementation"), })
	AD_System_Status,
	//
	@FlyRefList(name = "C_BP_Group PriorityBase", items = { @FlyRefItem(name = "Same", value = "Same"),
			@FlyRefItem(name = "Lower", value = "Lower"), @FlyRefItem(name = "Higher", value = "Higher"), })
	C_BP_Group_PriorityBase,
	//
	@FlyRefList(name = "AD_Color Type", items = { @FlyRefItem(name = "Normal (Flat)", value = "Normal (Flat)"),
			@FlyRefItem(name = "Gradient", value = "Gradient"), @FlyRefItem(name = "Line", value = "Line"),
			@FlyRefItem(name = "Texture (Picture)", value = "Texture (Picture)"), })
	AD_Color_Type,
	//
	@FlyRefList(name = "AD_User BP AccessType", items = {
			@FlyRefItem(name = "Business Documents", value = "Business Documents"),
			@FlyRefItem(name = "Requests", value = "Requests"),
			@FlyRefItem(name = "Assets, Download", value = "Assets, Download"), })
	AD_User_BP_AccessType,
	//
	@FlyRefList(name = "C_Project InvoiceRule", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "Committed Amount", value = "Committed Amount"),
			@FlyRefItem(name = "Time&Material max Comitted", value = "Time&Material max Comitted"),
			@FlyRefItem(name = "Time&Material", value = "Time&Material"),
			@FlyRefItem(name = "Product  Quantity", value = "Product  Quantity"), })
	C_Project_InvoiceRule,
	//
	@FlyRefList(name = "C_Project LineLevel", items = { @FlyRefItem(name = "Project", value = "Project"),
			@FlyRefItem(name = "Phase", value = "Phase"), @FlyRefItem(name = "Task", value = "Task"), })
	C_Project_LineLevel,
	//
	@FlyRefList(name = "C_Remuneration Type", items = { @FlyRefItem(name = "Hourly", value = "Hourly"),
			@FlyRefItem(name = "Daily", value = "Daily"), @FlyRefItem(name = "Weekly", value = "Weekly"),
			@FlyRefItem(name = "Monthly", value = "Monthly"),
			@FlyRefItem(name = "Twice Monthly", value = "Twice Monthly"),
			@FlyRefItem(name = "Bi-Weekly", value = "Bi-Weekly"), })
	C_Remuneration_Type,
	//
	@FlyRefList(name = "C_Order InvoiceRule", description = "Invoicing Rules list", items = {
			@FlyRefItem(name = "After Order delivered", value = "After Order delivered"),
			@FlyRefItem(name = "After Delivery", value = "After Delivery"),
			@FlyRefItem(name = "Customer Schedule after Delivery", value = "Customer Schedule after Delivery"),
			@FlyRefItem(name = "Immediate", value = "Immediate"), })
	C_Order_InvoiceRule,
	//
	@FlyRefList(name = "_PriorityRule", description = "Priority scale list", items = {
			@FlyRefItem(name = "High", value = "High"), @FlyRefItem(name = "Medium", value = "Medium"),
			@FlyRefItem(name = "Low", value = "Low"), @FlyRefItem(name = "Urgent", value = "Urgent"),
			@FlyRefItem(name = "Minor", value = "Minor"), })
	_PriorityRule,
	//
	@FlyRefList(name = "C_Order FreightCostRule", description = "Freight cost Rule list", items = {
			@FlyRefItem(name = "Freight included", value = "Freight included"),
			@FlyRefItem(name = "Calculated", value = "Calculated"),
			@FlyRefItem(name = "Fix price", value = "Fix price"), @FlyRefItem(name = "Line", value = "Line"), })
	C_Order_FreightCostRule,
	//
	@FlyRefList(name = "C_Order DeliveryViaRule", description = "Delivery via Rule list", items = {
			@FlyRefItem(name = "Delivery", value = "Delivery"), @FlyRefItem(name = "Shipper", value = "Shipper"),
			@FlyRefItem(name = "Pickup", value = "Pickup"), })
	C_Order_DeliveryViaRule,
	//
	@FlyRefList(name = "M_BOM Type", items = { @FlyRefItem(name = "Current Active", value = "Current Active"),
			@FlyRefItem(name = "Make-To-Order", value = "Make-To-Order"),
			@FlyRefItem(name = "Previous", value = "Previous"),
			@FlyRefItem(name = "Previous, Spare", value = "Previous, Spare"),
			@FlyRefItem(name = "Future", value = "Future"), @FlyRefItem(name = "Maintenance", value = "Maintenance"),
			@FlyRefItem(name = "Repair", value = "Repair"),
			@FlyRefItem(name = "Product Configure", value = "Product Configure"),
			@FlyRefItem(name = "Make-To-Kit", value = "Make-To-Kit"), })
	M_BOM_Type,
	//
	@FlyRefList(name = "M_BOM Use", items = { @FlyRefItem(name = "Master", value = "Master"),
			@FlyRefItem(name = "Engineering", value = "Engineering"),
			@FlyRefItem(name = "Manufacturing", value = "Manufacturing"),
			@FlyRefItem(name = "Planning", value = "Planning"), @FlyRefItem(name = "Quality", value = "Quality"), })
	M_BOM_Use,
	//
	@FlyRefList(name = "M_BOMProduct Type", items = {
			@FlyRefItem(name = "Standard Product", value = "Standard Product"),
			@FlyRefItem(name = "Optional Product", value = "Optional Product"),
			@FlyRefItem(name = "Alternative", value = "Alternative"),
			@FlyRefItem(name = "Alternative (Default)", value = "Alternative (Default)"),
			@FlyRefItem(name = "Outside Processing", value = "Outside Processing"), })
	M_BOMProduct_Type,
	//
	@FlyRefList(name = "PA_Measure DataType", items = {
			@FlyRefItem(name = "Qty/Amount in Time", value = "Qty/Amount in Time"),
			@FlyRefItem(name = "Status Qty/Amount", value = "Status Qty/Amount"), })
	PA_Measure_DataType,
	//
	@FlyRefList(name = "PA_Benschmark Accumulation Type", items = { @FlyRefItem(name = "Average", value = "Average"),
			@FlyRefItem(name = "Sum", value = "Sum"), })
	PA_Benschmark_Accumulation_Type,
	//
	@FlyRefList(name = "PA_Ratio ElementType", items = { @FlyRefItem(name = "Ratio", value = "Ratio"),
			@FlyRefItem(name = "Constant", value = "Constant"),
			@FlyRefItem(name = "Calculation", value = "Calculation"),
			@FlyRefItem(name = "Account Value", value = "Account Value"), })
	PA_Ratio_ElementType,
	//
	@FlyRefList(name = "C_Invoice InvoiceCollectionType", items = { @FlyRefItem(name = "Dunning", value = "Dunning"),
			@FlyRefItem(name = "Collection Agency", value = "Collection Agency"),
			@FlyRefItem(name = "Legal Procedure", value = "Legal Procedure"),
			@FlyRefItem(name = "Uncollectable", value = "Uncollectable"), })
	C_Invoice_InvoiceCollectionType,
	//
	@FlyRefList(name = "CM_Chat ModerationType", items = { @FlyRefItem(name = "Not moderated", value = "Not moderated"),
			@FlyRefItem(name = "Before Publishing", value = "Before Publishing"),
			@FlyRefItem(name = "After Publishing", value = "After Publishing"), })
	CM_Chat_ModerationType,
	//
	@FlyRefList(name = "CM_ChatEntry ModeratorStatus", items = {
			@FlyRefItem(name = "Not Displayed", value = "Not Displayed"),
			@FlyRefItem(name = "Published", value = "Published"),
			@FlyRefItem(name = "To be reviewed", value = "To be reviewed"),
			@FlyRefItem(name = "Suspicious", value = "Suspicious"), })
	CM_ChatEntry_ModeratorStatus,
	//
	@FlyRefList(name = "CM_WikiToken Type", items = { @FlyRefItem(name = "SQL Command", value = "SQL Command"),
			@FlyRefItem(name = "Internal Link", value = "Internal Link"),
			@FlyRefItem(name = "External Link", value = "External Link"),
			@FlyRefItem(name = "Style", value = "Style"), })
	CM_WikiToken_Type,
	//
	@FlyRefList(name = "CM_Chat EntryType", items = { @FlyRefItem(name = "Wiki", value = "Wiki"),
			@FlyRefItem(name = "Note (flat)", value = "Note (flat)"),
			@FlyRefItem(name = "Forum (threaded)", value = "Forum (threaded)"), })
	CM_Chat_EntryType,
	//
	@FlyRefList(name = "C_BPartner BPBankAcctUse", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "Both", value = "Both"), @FlyRefItem(name = "Direct Debit", value = "Direct Debit"),
			@FlyRefItem(name = "Direct Deposit", value = "Direct Deposit"), })
	C_BPartner_BPBankAcctUse,
	//
	@FlyRefList(name = "AD_Package_Type", description = "Defines the type of packages available", items = {
			@FlyRefItem(name = "Local Transfer", value = "Local Transfer"),
			@FlyRefItem(name = "Remote Transfer", value = "Remote Transfer"),
			@FlyRefItem(name = "XML File", value = "XML File"), })
	AD_Package_Type,
	//
	@FlyRefList(name = "Package_Releases", description = "List of Package Releases", help = "Indicates what release the package is for.  Entering no specific release indicates the package is for all releases.", items = {
			@FlyRefItem(name = "Release 3.1.0", value = "Release 3.1.0"),
			@FlyRefItem(name = "Release 3.2.0", value = "Release 3.2.0"),
			@FlyRefItem(name = "Release 3.3.0", value = "Release 3.3.0"),
			@FlyRefItem(name = "Release 2.5.2a", value = "Release 2.5.2a"),
			@FlyRefItem(name = "Release 2.5.2b", value = "Release 2.5.2b"),
			@FlyRefItem(name = "Release 2.5.2c", value = "Release 2.5.2c"),
			@FlyRefItem(name = "Release 2.5.2d", value = "Release 2.5.2d"),
			@FlyRefItem(name = "Release 2.5.2e", value = "Release 2.5.2e"),
			@FlyRefItem(name = "Release 2.5.3a", value = "Release 2.5.3a"),
			@FlyRefItem(name = "Release 2.5.3b", value = "Release 2.5.3b"),
			@FlyRefItem(name = "No specific release", value = "No specific release"), })
	Package_Releases,
	//
	@FlyRefList(name = "AD_Package_Exp_DB", description = "List of database types", help = "This is a list of database types used by the inbound packaging processing to determine if the sql statement is fired.", items = {
			@FlyRefItem(name = "All Database Types", value = "All Database Types"),
			@FlyRefItem(name = "DB2", value = "DB2"), @FlyRefItem(name = "Firebird", value = "Firebird"),
			@FlyRefItem(name = "MySQL", value = "MySQL"), @FlyRefItem(name = "Oracle", value = "Oracle"),
			@FlyRefItem(name = "Postgres", value = "Postgres"), @FlyRefItem(name = "SQL Server", value = "SQL Server"),
			@FlyRefItem(name = "Sybase", value = "Sybase"), })
	AD_Package_Exp_DB,
	//
	@FlyRefList(name = "AD_Package_Build_Type", items = { @FlyRefItem(name = "Workflow", value = "Workflow"),
			@FlyRefItem(name = "Reference", value = "Reference"),
			@FlyRefItem(name = "Dynamic Validation Rule", value = "Dynamic Validation Rule"),
			@FlyRefItem(name = "Message", value = "Message"), @FlyRefItem(name = "PrintFormat", value = "PrintFormat"),
			@FlyRefItem(name = "Model Validator", value = "Model Validator"),
			@FlyRefItem(name = "Entity Type", value = "Entity Type"),
			@FlyRefItem(name = "Workbench", value = "Workbench"),
			@FlyRefItem(name = "File - Code or other", value = "File - Code or other"),
			@FlyRefItem(name = "Data", value = "Data"), @FlyRefItem(name = "Import Format", value = "Import Format"),
			@FlyRefItem(name = "Application or Module", value = "Application or Module"),
			@FlyRefItem(name = "Process/Report", value = "Process/Report"),
			@FlyRefItem(name = "ReportView", value = "ReportView"), @FlyRefItem(name = "Role", value = "Role"),
			@FlyRefItem(name = "Code Snipit", value = "Code Snipit"),
			@FlyRefItem(name = "SQL Statement", value = "SQL Statement"), @FlyRefItem(name = "Table", value = "Table"),
			@FlyRefItem(name = "Window", value = "Window"), @FlyRefItem(name = "Form", value = "Form"),
			@FlyRefItem(name = "Smart Browse", value = "Smart Browse"),
			@FlyRefItem(name = "Smart View", value = "Smart View"), })
	AD_Package_Build_Type,
	//
	@FlyRefList(name = "AD_Package_Source_Type", description = "List of package source types", items = {
			@FlyRefItem(name = "File", value = "File"), @FlyRefItem(name = "WebService", value = "WebService"), })
	AD_Package_Source_Type,
	//
	@FlyRefList(name = "PA_Ratio Operand", items = { @FlyRefItem(name = "Plus", value = "Plus"),
			@FlyRefItem(name = "Minus", value = "Minus"), @FlyRefItem(name = "Multiply", value = "Multiply"),
			@FlyRefItem(name = "Divide", value = "Divide"), })
	PA_Ratio_Operand,
	//
	@FlyRefList(name = "_PublishStatus", description = "Publication Status", items = {
			@FlyRefItem(name = "Released", value = "Released"), @FlyRefItem(name = "Test", value = "Test"),
			@FlyRefItem(name = "Under Revision", value = "Under Revision"),
			@FlyRefItem(name = "Void", value = "Void"), })
	_PublishStatus,
	//
	@FlyRefList(name = "C_Invoice MatchRequirement", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "Receipt", value = "Receipt"),
			@FlyRefItem(name = "Purchase Order", value = "Purchase Order"),
			@FlyRefItem(name = "Purchase Order and Receipt", value = "Purchase Order and Receipt"), })
	C_Invoice_MatchRequirement,
	//
	@FlyRefList(name = "AD_Find Operation", items = { @FlyRefItem(name = " =", value = " ="),
			@FlyRefItem(name = ">=", value = ">="), @FlyRefItem(name = ">", value = ">"),
			@FlyRefItem(name = "<", value = "<"), @FlyRefItem(name = " ~", value = " ~"),
			@FlyRefItem(name = "<=", value = "<="), @FlyRefItem(name = "|<x>|", value = "|<x>|"),
			@FlyRefItem(name = "sql", value = "sql"), @FlyRefItem(name = "!=", value = "!="), })
	AD_Find_Operation,
	//
	@FlyRefList(name = "AD_ImpFormat Type", items = { @FlyRefItem(name = "Product", value = "Product"),
			@FlyRefItem(name = "Business Partner", value = "Business Partner"),
			@FlyRefItem(name = "Accounts", value = "Accounts"),
			@FlyRefItem(name = "GL Balances", value = "GL Balances"),
			@FlyRefItem(name = "Exchange Rates", value = "Exchange Rates"),
			@FlyRefItem(name = "Inventory Count", value = "Inventory Count"), })
	AD_ImpFormat_Type,
	//
	@FlyRefList(name = "AD_ImpFormat FormatType", items = {
			@FlyRefItem(name = "Fixed Position", value = "Fixed Position"),
			@FlyRefItem(name = "Comma Separated", value = "Comma Separated"),
			@FlyRefItem(name = "Tab Separated", value = "Tab Separated"), @FlyRefItem(name = "XML", value = "XML"),
			@FlyRefItem(name = "Custom Separator Char", value = "Custom Separator Char"), })
	AD_ImpFormat_FormatType,
	//
	@FlyRefList(name = "AD_ImpFormat_Row Type", items = { @FlyRefItem(name = "String", value = "String"),
			@FlyRefItem(name = "Number", value = "Number"), @FlyRefItem(name = "Date", value = "Date"),
			@FlyRefItem(name = "Constant", value = "Constant"), })
	AD_ImpFormat_Row_Type,
	//
	@FlyRefList(name = "M_InventoryCount QtyRange", items = { @FlyRefItem(name = "> 0", value = "> 0"),
			@FlyRefItem(name = "= 0", value = "= 0"), @FlyRefItem(name = "< 0", value = "< 0"),
			@FlyRefItem(name = "not 0", value = "not 0"), })
	M_InventoryCount_QtyRange,
	//
	@FlyRefList(name = "C_Bank Account Type", items = { @FlyRefItem(name = "Checking", value = "Checking"),
			@FlyRefItem(name = "Savings", value = "Savings"), })
	C_Bank_Account_Type,
	//
	@FlyRefList(name = "C_Cash Trx Type", items = {
			@FlyRefItem(name = "Bank Account Transfer", value = "Bank Account Transfer"),
			@FlyRefItem(name = "Invoice", value = "Invoice"),
			@FlyRefItem(name = "General Expense", value = "General Expense"),
			@FlyRefItem(name = "General Receipts", value = "General Receipts"),
			@FlyRefItem(name = "Charge", value = "Charge"), @FlyRefItem(name = "Difference", value = "Difference"), })
	C_Cash_Trx_Type,
	//
	@FlyRefList(name = "R_Request Request Type", items = { @FlyRefItem(name = "Information", value = "Information"),
			@FlyRefItem(name = "Service", value = "Service"), @FlyRefItem(name = "Charge", value = "Charge"),
			@FlyRefItem(name = "Account", value = "Account"), @FlyRefItem(name = "Help", value = "Help"),
			@FlyRefItem(name = "Alert", value = "Alert"), @FlyRefItem(name = "Warranty", value = "Warranty"),
			@FlyRefItem(name = "Other", value = "Other"), })
	R_Request_Request_Type,
	//
	@FlyRefList(name = "R_Request Next Action", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "Follow up", value = "Follow up"), })
	R_Request_Next_Action,
	//
	@FlyRefList(name = "_Frequency Type", description = "Processor Frequency Type", items = {
			@FlyRefItem(name = "Minute", value = "Minute"), @FlyRefItem(name = "Hour", value = "Hour"),
			@FlyRefItem(name = "Day", value = "Day"), })
	_Frequency_Type,
	//
	@FlyRefList(name = "R_Request Due Type", items = { @FlyRefItem(name = "Overdue", value = "Overdue"),
			@FlyRefItem(name = "Due", value = "Due"), @FlyRefItem(name = "Scheduled", value = "Scheduled"), })
	R_Request_Due_Type,
	//
	@FlyRefList(name = "C_Commission DocBasis", items = { @FlyRefItem(name = "Order", value = "Order"),
			@FlyRefItem(name = "Invoice", value = "Invoice"), @FlyRefItem(name = "Receipt", value = "Receipt"), })
	C_Commission_DocBasis,
	//
	@FlyRefList(name = "C_Commission Frequency", items = { @FlyRefItem(name = "Yearly", value = "Yearly"),
			@FlyRefItem(name = "Weekly", value = "Weekly"), @FlyRefItem(name = "Monthly", value = "Monthly"),
			@FlyRefItem(name = "Quarterly", value = "Quarterly"), })
	C_Commission_Frequency,
	//
	@FlyRefList(name = "AD_Role User Level", items = { @FlyRefItem(name = "System", value = "System"),
			@FlyRefItem(name = "Client", value = "Client"), @FlyRefItem(name = "Organization", value = "Organization"),
			@FlyRefItem(name = "Client+Organization", value = "Client+Organization"), })
	AD_Role_User_Level,
	//
	@FlyRefList(name = "PA_Measure Type", items = { @FlyRefItem(name = "Request", value = "Request"),
			@FlyRefItem(name = "Project", value = "Project"),
			@FlyRefItem(name = "User defined", value = "User defined"), @FlyRefItem(name = "Ratio", value = "Ratio"),
			@FlyRefItem(name = "Manual", value = "Manual"), @FlyRefItem(name = "Calculated", value = "Calculated"),
			@FlyRefItem(name = "Achievements", value = "Achievements"), })
	PA_Measure_Type,
	//
	@FlyRefList(name = "GL Category Type", items = { @FlyRefItem(name = "System generated", value = "System generated"),
			@FlyRefItem(name = "Document", value = "Document"), @FlyRefItem(name = "Import", value = "Import"),
			@FlyRefItem(name = "Manual", value = "Manual"), })
	GL_Category_Type,
	//
	@FlyRefList(name = "PA_Report AmountType (deprecated)", items = {
			@FlyRefItem(name = "Period Balance", value = "Period Balance"),
			@FlyRefItem(name = "Period Credit Only", value = "Period Credit Only"),
			@FlyRefItem(name = "Period Debit Only", value = "Period Debit Only"),
			@FlyRefItem(name = "Period Quantity", value = "Period Quantity"),
			@FlyRefItem(name = "Total Quantity", value = "Total Quantity"),
			@FlyRefItem(name = "Year Balance", value = "Year Balance"),
			@FlyRefItem(name = "Year Credit Only", value = "Year Credit Only"),
			@FlyRefItem(name = "Year Debit Only", value = "Year Debit Only"),
			@FlyRefItem(name = "Year Quantity", value = "Year Quantity"),
			@FlyRefItem(name = "Total Debit Only", value = "Total Debit Only"),
			@FlyRefItem(name = "Total Credit Only", value = "Total Credit Only"),
			@FlyRefItem(name = "Total Balance", value = "Total Balance"),
			@FlyRefItem(name = "Natural Balance", value = "Natural Balance"), })
	PA_Report_AmountType_deprecated,
	//
	@FlyRefList(name = "PA_Report CalculationType", items = {
			@FlyRefItem(name = "Add (Op1+Op2)", value = "Add (Op1+Op2)"),
			@FlyRefItem(name = "Subtract (Op1-Op2)", value = "Subtract (Op1-Op2)"),
			@FlyRefItem(name = "Percentage (Op1 of Op2)", value = "Percentage (Op1 of Op2)"),
			@FlyRefItem(name = "Add Range (Op1 to Op2)", value = "Add Range (Op1 to Op2)"), })
	PA_Report_CalculationType,
	//
	@FlyRefList(name = "PA_Report ColumnType", items = {
			@FlyRefItem(name = "Relative Period", value = "Relative Period"),
			@FlyRefItem(name = "Calculation", value = "Calculation"),
			@FlyRefItem(name = "Segment Value", value = "Segment Value"), })
	PA_Report_ColumnType,
	//
	@FlyRefList(name = "PA_Report CurrencyType", items = {
			@FlyRefItem(name = "Source Currency", value = "Source Currency"),
			@FlyRefItem(name = "Accounting Currency", value = "Accounting Currency"), })
	PA_Report_CurrencyType,
	//
	@FlyRefList(name = "M_Replenish Type", items = { @FlyRefItem(name = "Custom", value = "Custom"),
			@FlyRefItem(name = "Maintain Maximum Level", value = "Maintain Maximum Level"),
			@FlyRefItem(name = "Manual", value = "Manual"),
			@FlyRefItem(name = "Reorder below Minimum Level", value = "Reorder below Minimum Level"),
			@FlyRefItem(name = "Replenish Plan Calculated", value = "Replenish Plan Calculated"), })
	M_Replenish_Type,
	//
	@FlyRefList(name = "C_Payment AVS", items = { @FlyRefItem(name = "No Match", value = "No Match"),
			@FlyRefItem(name = "Unavailable", value = "Unavailable"), @FlyRefItem(name = "Match", value = "Match"), })
	C_Payment_AVS,
	//
	@FlyRefList(name = "C_Payment Trx Type", description = "CC Trx Type", items = {
			@FlyRefItem(name = "Credit (Payment)", value = "Credit (Payment)"),
			@FlyRefItem(name = "Delayed Capture", value = "Delayed Capture"),
			@FlyRefItem(name = "Voice Authorization", value = "Voice Authorization"),
			@FlyRefItem(name = "Sales", value = "Sales"), @FlyRefItem(name = "Void", value = "Void"),
			@FlyRefItem(name = "Authorization", value = "Authorization"), })
	C_Payment_Trx_Type,
	//
	@FlyRefList(name = "C_Payment Tender Type", description = "Direct Debit/Deposit - Check - CC", items = {
			@FlyRefItem(name = "Direct Deposit", value = "Direct Deposit"),
			@FlyRefItem(name = "Credit Card", value = "Credit Card"), @FlyRefItem(name = "Check", value = "Check"),
			@FlyRefItem(name = "Cash", value = "Cash"), @FlyRefItem(name = "Direct Debit", value = "Direct Debit"),
			@FlyRefItem(name = "Credit Memo", value = "Credit Memo"),
			@FlyRefItem(name = "Account", value = "Account"), })
	C_Payment_Tender_Type,
	//
	@FlyRefList(name = "Weekdays", description = "List of days", items = {
			@FlyRefItem(name = "Sunday", value = "Sunday"), @FlyRefItem(name = "Monday", value = "Monday"),
			@FlyRefItem(name = "Tuesday", value = "Tuesday"), @FlyRefItem(name = "Wednesday", value = "Wednesday"),
			@FlyRefItem(name = "Thursday", value = "Thursday"), @FlyRefItem(name = "Friday", value = "Friday"),
			@FlyRefItem(name = "Saturday", value = "Saturday"), })
	Weekdays,
	//
	@FlyRefList(name = "C_InvoiceSchedule InvoiceFrequency", items = { @FlyRefItem(name = "Daily", value = "Daily"),
			@FlyRefItem(name = "Weekly", value = "Weekly"), @FlyRefItem(name = "Monthly", value = "Monthly"),
			@FlyRefItem(name = "Twice Monthly", value = "Twice Monthly"), })
	C_InvoiceSchedule_InvoiceFrequency,
	//
	@FlyRefList(name = "AD_FieldGroup", description = "Field Group Type", items = {
			@FlyRefItem(name = "Tab", value = "Tab"), @FlyRefItem(name = "Label", value = "Label"),
			@FlyRefItem(name = "Collapse", value = "Collapse"), })
	AD_FieldGroup,
	//
	@FlyRefList(name = "C_PeriodControl Action", items = { @FlyRefItem(name = "Open Period", value = "Open Period"),
			@FlyRefItem(name = "Close Period", value = "Close Period"),
			@FlyRefItem(name = "<No Action>", value = "<No Action>"),
			@FlyRefItem(name = "Permanently Close Period", value = "Permanently Close Period"), })
	C_PeriodControl_Action,
	//
	@FlyRefList(name = "C_PeriodControl Status", items = { @FlyRefItem(name = "Open", value = "Open"),
			@FlyRefItem(name = "Closed", value = "Closed"),
			@FlyRefItem(name = "Permanently closed", value = "Permanently closed"),
			@FlyRefItem(name = "Never opened", value = "Never opened"), })
	C_PeriodControl_Status,
	//
	@FlyRefList(name = "GL_Budget Status", items = { @FlyRefItem(name = "Approved", value = "Approved"),
			@FlyRefItem(name = "Draft", value = "Draft"), })
	GL_Budget_Status,
	//
	@FlyRefList(name = "_ErrorType", description = "List of type of errors", items = {
			@FlyRefItem(name = "Error", value = "Error"), @FlyRefItem(name = "Warning", value = "Warning"),
			@FlyRefItem(name = "Information", value = "Information"), })
	_ErrorType,
	//
	@FlyRefList(name = "C_AcctSchema ElementType", description = "Element Types for Accounting Elements", help = "Hardcoded Element Types", items = {
			@FlyRefItem(name = "Sub Account", value = "Sub Account"),
			@FlyRefItem(name = "User Element 1", value = "User Element 1"),
			@FlyRefItem(name = "User Element 2", value = "User Element 2"),
			@FlyRefItem(name = "User List 2", value = "User List 2"),
			@FlyRefItem(name = "Organization", value = "Organization"),
			@FlyRefItem(name = "Account", value = "Account"), @FlyRefItem(name = "Product", value = "Product"),
			@FlyRefItem(name = "BPartner", value = "BPartner"), @FlyRefItem(name = "Org Trx", value = "Org Trx"),
			@FlyRefItem(name = "Activity", value = "Activity"),
			@FlyRefItem(name = "Location From", value = "Location From"),
			@FlyRefItem(name = "Location To", value = "Location To"),
			@FlyRefItem(name = "Sales Region", value = "Sales Region"),
			@FlyRefItem(name = "Project", value = "Project"), @FlyRefItem(name = "Campaign", value = "Campaign"),
			@FlyRefItem(name = "User List 1", value = "User List 1"),
			@FlyRefItem(name = "User List 3", value = "User List 3"),
			@FlyRefItem(name = "User List 4", value = "User List 4"), })
	C_AcctSchema_ElementType,
	//
	@FlyRefList(name = "M_DiscountPriceList Base", items = { @FlyRefItem(name = "List Price", value = "List Price"),
			@FlyRefItem(name = "Standard Price", value = "Standard Price"),
			@FlyRefItem(name = "Limit (PO) Price", value = "Limit (PO) Price"),
			@FlyRefItem(name = "Fixed Price", value = "Fixed Price"), })
	M_DiscountPriceList_Base,
	//
	@FlyRefList(name = "C_RevenueRecognition Frequency", description = "Frequency of Revenue Recognition", items = {
			@FlyRefItem(name = "Month", value = "Month"), @FlyRefItem(name = "Quarter", value = "Quarter"),
			@FlyRefItem(name = "Year", value = "Year"), })
	C_RevenueRecognition_Frequency,
	//
	@FlyRefList(name = "M_Inventory ReportType", items = {
			@FlyRefItem(name = "Blind list (w/o book quantity)", value = "Blind list (w/o book quantity)"),
			@FlyRefItem(name = "Count list (with book quantity)", value = "Count list (with book quantity)"),
			@FlyRefItem(name = "Control list", value = "Control list"), })
	M_Inventory_ReportType,
	//
	@FlyRefList(name = "AD_Print Field Alignment", items = { @FlyRefItem(name = "Default", value = "Default"),
			@FlyRefItem(name = "Leading (left)", value = "Leading (left)"),
			@FlyRefItem(name = "Trailing (right)", value = "Trailing (right)"),
			@FlyRefItem(name = "Block", value = "Block"), @FlyRefItem(name = "Center", value = "Center"), })
	AD_Print_Field_Alignment,
	//
	@FlyRefList(name = "AD_Print Line Alignment", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "Leading (left)", value = "Leading (left)"),
			@FlyRefItem(name = "Center", value = "Center"),
			@FlyRefItem(name = "Trailing (right)", value = "Trailing (right)"), })
	AD_Print_Line_Alignment,
	//
	@FlyRefList(name = "AD_Print Format Type", items = { @FlyRefItem(name = "Image", value = "Image"),
			@FlyRefItem(name = "Field", value = "Field"), @FlyRefItem(name = "Text", value = "Text"),
			@FlyRefItem(name = "Print Format", value = "Print Format"),
			@FlyRefItem(name = "Rectangle", value = "Rectangle"), @FlyRefItem(name = "Line", value = "Line"), })
	AD_Print_Format_Type,
	//
	@FlyRefList(name = "AD_Print Area", items = { @FlyRefItem(name = "Content", value = "Content"),
			@FlyRefItem(name = "Header", value = "Header"), @FlyRefItem(name = "Footer", value = "Footer"), })
	AD_Print_Area,
	//
	@FlyRefList(name = "C_BP_EDI EDI Type", items = { @FlyRefItem(name = "ASC X12 ", value = "ASC X12 "),
			@FlyRefItem(name = "EDIFACT", value = "EDIFACT"), @FlyRefItem(name = "Email EDI", value = "Email EDI"), })
	C_BP_EDI_EDI_Type,
	//
	@FlyRefList(name = "M_EDI Status", items = { @FlyRefItem(name = "Draft", value = "Draft"),
			@FlyRefItem(name = "Sent", value = "Sent"), @FlyRefItem(name = "Acknowledged", value = "Acknowledged"),
			@FlyRefItem(name = "Answered (complete)", value = "Answered (complete)"), })
	M_EDI_Status,
	//
	@FlyRefList(name = "M_EDI Trx Type", items = { @FlyRefItem(name = "Inquiry", value = "Inquiry"),
			@FlyRefItem(name = "Purchase Order", value = "Purchase Order"), })
	M_EDI_Trx_Type,
	//
	@FlyRefList(name = "AD_Find AndOr", items = { @FlyRefItem(name = "And", value = "And"),
			@FlyRefItem(name = "Or", value = "Or"), })
	AD_Find_AndOr,
	//
	@FlyRefList(name = "WF_DurationUnit", items = { @FlyRefItem(name = "Year", value = "Year"),
			@FlyRefItem(name = "Month", value = "Month"), @FlyRefItem(name = "Day", value = "Day"),
			@FlyRefItem(name = "hour", value = "hour"), @FlyRefItem(name = "minute", value = "minute"),
			@FlyRefItem(name = "second", value = "second"), })
	WF_DurationUnit,
	//
	@FlyRefList(name = "WF_Transition Type", items = { @FlyRefItem(name = "Regular", value = "Regular"),
			@FlyRefItem(name = "Loop Begin", value = "Loop Begin"),
			@FlyRefItem(name = "Loop End", value = "Loop End"), })
	WF_Transition_Type,
	//
	@FlyRefList(name = "WF_Join_Split", items = { @FlyRefItem(name = "AND", value = "AND"),
			@FlyRefItem(name = "XOR", value = "XOR"), })
	WF_Join_Split,
	//
	@FlyRefList(name = "WF_Action", description = "Superset of Menu Action", items = {
			@FlyRefItem(name = "Document Action", value = "Document Action"),
			@FlyRefItem(name = "EMail", value = "EMail"), @FlyRefItem(name = "User Form", value = "User Form"),
			@FlyRefItem(name = "Apps Task", value = "Apps Task"),
			@FlyRefItem(name = "Apps Report", value = "Apps Report"),
			@FlyRefItem(name = "Apps Process", value = "Apps Process"),
			@FlyRefItem(name = "Wait (Sleep)", value = "Wait (Sleep)"),
			@FlyRefItem(name = "User Choice", value = "User Choice"),
			@FlyRefItem(name = "User Workbench", value = "User Workbench"),
			@FlyRefItem(name = "Sub Workflow", value = "Sub Workflow"),
			@FlyRefItem(name = "Set Variable", value = "Set Variable"),
			@FlyRefItem(name = "User Window", value = "User Window"),
			@FlyRefItem(name = "Smart View", value = "Smart View"),
			@FlyRefItem(name = "Smart Browse", value = "Smart Browse"), })
	WF_Action,
	//
	@FlyRefList(name = "WF_Start-Finish Mode", items = { @FlyRefItem(name = "Automatic", value = "Automatic"),
			@FlyRefItem(name = "Manual", value = "Manual"), })
	WF_Start_Finish_Mode,
	//
	@FlyRefList(name = "WF_Participant Type", items = { @FlyRefItem(name = "Organization", value = "Organization"),
			@FlyRefItem(name = "Human", value = "Human"), @FlyRefItem(name = "Role", value = "Role"),
			@FlyRefItem(name = "System Resource", value = "System Resource"), })
	WF_Participant_Type,
	//
	@FlyRefList(name = "WF_Instance State", items = { @FlyRefItem(name = "Running", value = "Running"),
			@FlyRefItem(name = "Suspended", value = "Suspended"),
			@FlyRefItem(name = "Not Started", value = "Not Started"),
			@FlyRefItem(name = "Completed", value = "Completed"), @FlyRefItem(name = "Aborted", value = "Aborted"),
			@FlyRefItem(name = "Terminated", value = "Terminated"), })
	WF_Instance_State,
	//
	@FlyRefList(name = "WF_EventType", items = { @FlyRefItem(name = "Process Created", value = "Process Created"),
			@FlyRefItem(name = "State Changed", value = "State Changed"),
			@FlyRefItem(name = "Process Completed", value = "Process Completed"), })
	WF_EventType,
	//
	@FlyRefList(name = "WF_SubFlow Execution", items = { @FlyRefItem(name = "Asynchronously", value = "Asynchronously"),
			@FlyRefItem(name = "Synchronously", value = "Synchronously"), })
	WF_SubFlow_Execution,
	//
	@FlyRefList(name = "_Payment Rule", description = "In & Out Payment Options", items = {
			@FlyRefItem(name = "Credit Card", value = "Credit Card"),
			@FlyRefItem(name = "On Credit", value = "On Credit"), @FlyRefItem(name = "Check", value = "Check"),
			@FlyRefItem(name = "Direct Deposit", value = "Direct Deposit"), @FlyRefItem(name = "Cash", value = "Cash"),
			@FlyRefItem(name = "Direct Debit", value = "Direct Debit"), @FlyRefItem(name = "Mixed", value = "Mixed"), })
	_Payment_Rule,
	//
	@FlyRefList(name = "M_Transaction Movement Type", items = {
			@FlyRefItem(name = "Production -", value = "Production -"),
			@FlyRefItem(name = "Customer Returns", value = "Customer Returns"),
			@FlyRefItem(name = "Customer Shipment", value = "Customer Shipment"),
			@FlyRefItem(name = "Inventory In", value = "Inventory In"),
			@FlyRefItem(name = "Inventory Out", value = "Inventory Out"),
			@FlyRefItem(name = "Vendor Receipts", value = "Vendor Receipts"),
			@FlyRefItem(name = "Vendor Returns", value = "Vendor Returns"),
			@FlyRefItem(name = "Movement From", value = "Movement From"),
			@FlyRefItem(name = "Work Order -", value = "Work Order -"),
			@FlyRefItem(name = "Movement To", value = "Movement To"),
			@FlyRefItem(name = "Production +", value = "Production +"),
			@FlyRefItem(name = "Work Order +", value = "Work Order +"), })
	M_Transaction_Movement_Type,
	//
	@FlyRefList(name = "WF_LoopType", items = { @FlyRefItem(name = "While Loop", value = "While Loop"),
			@FlyRefItem(name = "Repeat Until Loop", value = "Repeat Until Loop"), })
	WF_LoopType,
	//
	@FlyRefList(name = "AD_Language Maintenance", items = {
			@FlyRefItem(name = "Re-Create Translation", value = "Re-Create Translation"),
			@FlyRefItem(name = "Add Missing Translations", value = "Add Missing Translations"),
			@FlyRefItem(name = "Delete Translation", value = "Delete Translation"), })
	AD_Language_Maintenance,
	//
	@FlyRefList(name = "AD_PrintTableFormat Stroke", description = "Stroke Type", items = {
			@FlyRefItem(name = "Solid Line", value = "Solid Line"),
			@FlyRefItem(name = "Dashed Line", value = "Dashed Line"),
			@FlyRefItem(name = "Dotted Line", value = "Dotted Line"),
			@FlyRefItem(name = "Dash-Dotted Line", value = "Dash-Dotted Line"), })
	AD_PrintTableFormat_Stroke,
	//
	@FlyRefList(name = "M_RelatedProduct Type", items = { @FlyRefItem(name = "Web Promotion", value = "Web Promotion"),
			@FlyRefItem(name = "Alternative", value = "Alternative"),
			@FlyRefItem(name = "Supplemental", value = "Supplemental"), })
	M_RelatedProduct_Type,
	//
	@FlyRefList(name = "C_RfQ QuoteType", items = { @FlyRefItem(name = "Quote Total only", value = "Quote Total only"),
			@FlyRefItem(name = "Quote Selected Lines", value = "Quote Selected Lines"),
			@FlyRefItem(name = "Quote All Lines", value = "Quote All Lines"), })
	C_RfQ_QuoteType,
	//
	@FlyRefList(name = "B_TopicType AuctionType", items = {
			@FlyRefItem(name = "Funding - All Bidders help funding a Topic", value = "Funding - All Bidders help funding a Topic"),
			@FlyRefItem(name = "Auction - The highest Bidder wins the Topic", value = "Auction - The highest Bidder wins the Topic"), })
	B_TopicType_AuctionType,
	//
	@FlyRefList(name = "AD_Scheduler Type", items = { @FlyRefItem(name = "Frequency", value = "Frequency"),
			@FlyRefItem(name = "Week Day", value = "Week Day"), @FlyRefItem(name = "Month Day", value = "Month Day"),
			@FlyRefItem(name = "Cron Scheduling Pattern", value = "Cron Scheduling Pattern"), })
	AD_Scheduler_Type,
	//
	@FlyRefList(name = "M_AttributeSet MandatoryType", items = {
			@FlyRefItem(name = "Not Mandatory", value = "Not Mandatory"),
			@FlyRefItem(name = "Always Mandatory", value = "Always Mandatory"),
			@FlyRefItem(name = "When Shipping", value = "When Shipping"), })
	M_AttributeSet_MandatoryType,
	//
	@FlyRefList(name = "M_Attribute Value Type", items = {
			@FlyRefItem(name = "String (max 40)", value = "String (max 40)"),
			@FlyRefItem(name = "Number", value = "Number"), @FlyRefItem(name = "List", value = "List"), })
	M_Attribute_Value_Type,
	//
	@FlyRefList(name = "PA_Report LineType", items = { @FlyRefItem(name = "Segment Value", value = "Segment Value"),
			@FlyRefItem(name = "Calculation", value = "Calculation"),
			@FlyRefItem(name = "Tabbed Text", value = "Tabbed Text"),
			@FlyRefItem(name = "Customized Line", value = "Customized Line"),
			@FlyRefItem(name = "Blank line", value = "Blank line"), })
	PA_Report_LineType,
	//
	@FlyRefList(name = "A_Reval_Multiplier", description = "Revaluation Multiplier Type", items = {
			@FlyRefItem(name = "Factor", value = "Factor"), @FlyRefItem(name = "Index", value = "Index"), })
	A_Reval_Multiplier,
	//
	@FlyRefList(name = "_Posted Status", items = { @FlyRefItem(name = "Not Posted", value = "Not Posted"),
			@FlyRefItem(name = "Posted", value = "Posted"), @FlyRefItem(name = "Not Balanced", value = "Not Balanced"),
			@FlyRefItem(name = "Not Convertible (no rate)", value = "Not Convertible (no rate)"),
			@FlyRefItem(name = "Invalid Account", value = "Invalid Account"),
			@FlyRefItem(name = "Period Closed", value = "Period Closed"),
			@FlyRefItem(name = "Post Prepared", value = "Post Prepared"),
			@FlyRefItem(name = "Posting Error", value = "Posting Error"), })
	_Posted_Status,
	//
	@FlyRefList(name = "A_Reval_Effectivity", description = "Sets the date as to when the revaluation will be based on", items = {
			@FlyRefItem(name = "Date Aquired", value = "Date Aquired"),
			@FlyRefItem(name = "Revaluation Date", value = "Revaluation Date"),
			@FlyRefItem(name = "Date Depreciation Started", value = "Date Depreciation Started"), })
	A_Reval_Effectivity,
	//
	@FlyRefList(name = "A_Reval_Code", description = "Lookup Valid Revaluation Codes", items = {
			@FlyRefItem(name = "Revaluation Code #3", value = "Revaluation Code #3"),
			@FlyRefItem(name = "Revaluation Code #1", value = "Revaluation Code #1"),
			@FlyRefItem(name = "Revaluation Code #2", value = "Revaluation Code #2"), })
	A_Reval_Code,
	//
	@FlyRefList(name = "A_Split_Type", description = "Split Type", items = {
			@FlyRefItem(name = "Amount", value = "Amount"), @FlyRefItem(name = "Percentage", value = "Percentage"),
			@FlyRefItem(name = "Quantity", value = "Quantity"), })
	A_Split_Type,
	//
	@FlyRefList(name = "PA_ReportSource ElementType", description = "Element Types for Accounting Elements - equal to C_AcctSchema ElementType plus Combination", help = "Hardcoded Element Types", items = {
			@FlyRefItem(name = "Account", value = "Account"), @FlyRefItem(name = "Activity", value = "Activity"),
			@FlyRefItem(name = "BPartner", value = "BPartner"),
			@FlyRefItem(name = "Location From", value = "Location From"),
			@FlyRefItem(name = "Location To", value = "Location To"),
			@FlyRefItem(name = "Campaign", value = "Campaign"),
			@FlyRefItem(name = "Organization", value = "Organization"),
			@FlyRefItem(name = "Org Trx", value = "Org Trx"), @FlyRefItem(name = "Project", value = "Project"),
			@FlyRefItem(name = "Product", value = "Product"), @FlyRefItem(name = "Sub Account", value = "Sub Account"),
			@FlyRefItem(name = "Sales Region", value = "Sales Region"),
			@FlyRefItem(name = "User List 1", value = "User List 1"),
			@FlyRefItem(name = "User List 2", value = "User List 2"),
			@FlyRefItem(name = "User Element 1", value = "User Element 1"),
			@FlyRefItem(name = "User Element 2", value = "User Element 2"),
			@FlyRefItem(name = "Combination", value = "Combination"),
			@FlyRefItem(name = "User List 3", value = "User List 3"),
			@FlyRefItem(name = "User List 4", value = "User List 4"), })
	PA_ReportSource_ElementType,
	//
	@FlyRefList(name = "Scaling Factors", description = "Factors for scaling the results of financial reports.", help = "Currently supported: thousand, million.", items = {
			@FlyRefItem(name = "Thousand", value = "Thousand"), @FlyRefItem(name = "Million", value = "Million"), })
	Scaling_Factors,
	//
	@FlyRefList(name = "_TransferType", description = "Where money should be transfered to", items = {
			@FlyRefItem(name = "Bank Account", value = "Bank Account"),
			@FlyRefItem(name = "CashBook", value = "CashBook"), })
	_TransferType,
	//
	@FlyRefList(name = "PP_CostCollectorType Transaction Manufacturing Management", items = {
			@FlyRefItem(name = "Material Receipt", value = "Material Receipt"),
			@FlyRefItem(name = "Component Issue", value = "Component Issue"),
			@FlyRefItem(name = "Usege Variance", value = "Usege Variance"),
			@FlyRefItem(name = "Method Change Variance", value = "Method Change Variance"),
			@FlyRefItem(name = "Rate Variance", value = "Rate Variance"),
			@FlyRefItem(name = "Mix Variance", value = "Mix Variance"),
			@FlyRefItem(name = "Activity Control", value = "Activity Control"), })
	PP_CostCollectorType_Transaction_Manufacturing_Management,
	//
	@FlyRefList(name = "SearchType", items = { @FlyRefItem(name = "Query", value = "Query"),
			@FlyRefItem(name = "Table", value = "Table"), })
	SearchType,
	//
	@FlyRefList(name = "AD_SearchDefinition_DataType", items = { @FlyRefItem(name = "Integer", value = "Integer"),
			@FlyRefItem(name = "String", value = "String"), })
	AD_SearchDefinition_DataType,
	//
	@FlyRefList(name = "M_PromotionDistribution Operation", items = { @FlyRefItem(name = ">=", value = ">="),
			@FlyRefItem(name = "<=", value = "<="), })
	M_PromotionDistribution_Operation,
	//
	@FlyRefList(name = "M_PromotionDistrition Type", description = "Type of quantity distribution", items = {
			@FlyRefItem(name = "Min", value = "Min"), @FlyRefItem(name = "Max", value = "Max"),
			@FlyRefItem(name = "Minus", value = "Minus"), })
	M_PromotionDistrition_Type,
	//
	@FlyRefList(name = "M_PromotionDistribution Sorting", description = "Quantity distribution sorting direction", items = {
			@FlyRefItem(name = "Ascending", value = "Ascending"),
			@FlyRefItem(name = "Descending", value = "Descending"), })
	M_PromotionDistribution_Sorting,
	//
	@FlyRefList(name = "M_PromotionReward Type", items = { @FlyRefItem(name = "Percentage", value = "Percentage"),
			@FlyRefItem(name = "Flat Discount", value = "Flat Discount"),
			@FlyRefItem(name = "Absolute Amount", value = "Absolute Amount"), })
	M_PromotionReward_Type,
	//
	@FlyRefList(name = "PA_Goal ChartType", description = "Chart Type", items = {
			@FlyRefItem(name = "Bar Chart", value = "Bar Chart"), @FlyRefItem(name = "Pie Chart", value = "Pie Chart"),
			@FlyRefItem(name = "Ring Chart", value = "Ring Chart"),
			@FlyRefItem(name = "Line Chart", value = "Line Chart"),
			@FlyRefItem(name = "Area Chart", value = "Area Chart"),
			@FlyRefItem(name = "Waterfall Chart", value = "Waterfall Chart"), })
	PA_Goal_ChartType,
	//
	@FlyRefList(name = "PA_DashboardContent GoalDisplay", description = "Type of goal display on dashboard", items = {
			@FlyRefItem(name = "HTML Table", value = "HTML Table"), @FlyRefItem(name = "Chart", value = "Chart"), })
	PA_DashboardContent_GoalDisplay,
	//
	@FlyRefList(name = "A_Depreciation_Manual_Period", description = "List available periods for calculating manual depreciation expense", items = {
			@FlyRefItem(name = "Period", value = "Period"), @FlyRefItem(name = "Yearly", value = "Yearly"), })
	A_Depreciation_Manual_Period,
	//
	@FlyRefList(name = "A_Reval_Method_Type", description = "List of Revaluation Types", items = {
			@FlyRefItem(name = "Default", value = "Default"),
			@FlyRefItem(name = "Inception to date", value = "Inception to date"),
			@FlyRefItem(name = "Year Balances", value = "Year Balances"), })
	A_Reval_Method_Type,
	//
	@FlyRefList(name = "A_SourceType", description = "Entry Source Types", help = "Listing of entry source types", items = {
			@FlyRefItem(name = "Invoice", value = "Invoice"),
			@FlyRefItem(name = "Journal Entry", value = "Journal Entry"),
			@FlyRefItem(name = "Manual", value = "Manual"), @FlyRefItem(name = "Imported", value = "Imported"),
			@FlyRefItem(name = "Project", value = "Project"), })
	A_SourceType,
	//
	@FlyRefList(name = "A_CapvsExp", description = "Capital vs Expense", help = "Inidcates if charge is capital or expense", items = {
			@FlyRefItem(name = "Capital", value = "Capital"), @FlyRefItem(name = "Expense", value = "Expense"), })
	A_CapvsExp,
	//
	@FlyRefList(name = "A_Disposed_Reason", description = "Reason for Disposal", items = {
			@FlyRefItem(name = "Charity", value = "Charity"), @FlyRefItem(name = "Destroyed", value = "Destroyed"),
			@FlyRefItem(name = "Scraped", value = "Scraped"), @FlyRefItem(name = "Sold", value = "Sold"),
			@FlyRefItem(name = "Sold w/Trade", value = "Sold w/Trade"), @FlyRefItem(name = "Theft", value = "Theft"), })
	A_Disposed_Reason,
	//
	@FlyRefList(name = "A_Disposal_Method", description = "Method of Disposals", items = {
			@FlyRefItem(name = "Trade", value = "Trade"), @FlyRefItem(name = "Trade w/cash", value = "Trade w/cash"),
			@FlyRefItem(name = "Simple", value = "Simple"), @FlyRefItem(name = "Cash", value = "Cash"),
			@FlyRefItem(name = "Cash_", value = "Cash_"), @FlyRefItem(name = "Simple_", value = "Simple_"),
			@FlyRefItem(name = "Preservation", value = "Preservation"),
			@FlyRefItem(name = "Partial Retirement", value = "Partial Retirement"), })
	A_Disposal_Method,
	//
	@FlyRefList(name = "A_Update_Type", description = "Update Type", items = {
			@FlyRefItem(name = "Addition", value = "Addition"), @FlyRefItem(name = "Balance", value = "Balance"),
			@FlyRefItem(name = "Create", value = "Create"), @FlyRefItem(name = "Depreciation", value = "Depreciation"),
			@FlyRefItem(name = "Disposal", value = "Disposal"), @FlyRefItem(name = "Expense", value = "Expense"),
			@FlyRefItem(name = "Forecast", value = "Forecast"), @FlyRefItem(name = "Import", value = "Import"),
			@FlyRefItem(name = "Revaluation", value = "Revaluation"), @FlyRefItem(name = "Setup", value = "Setup"),
			@FlyRefItem(name = "Split", value = "Split"), @FlyRefItem(name = "Transfer", value = "Transfer"),
			@FlyRefItem(name = "Update", value = "Update"), @FlyRefItem(name = "Usage", value = "Usage"), })
	A_Update_Type,
	//
	@FlyRefList(name = "A_Payment_Due", description = "Payment due every", items = {
			@FlyRefItem(name = "15th of every month", value = "15th of every month"),
			@FlyRefItem(name = "1st of every month", value = "1st of every month"),
			@FlyRefItem(name = "Beginning of every month", value = "Beginning of every month"),
			@FlyRefItem(name = "Yearly on or before contract date", value = "Yearly on or before contract date"), })
	A_Payment_Due,
	//
	@FlyRefList(name = "A_Finance_Method", description = "Financing Methods", help = "List of financing methods for assets", items = {
			@FlyRefItem(name = "Capitalized Lease", value = "Capitalized Lease"),
			@FlyRefItem(name = "Non-Capitalized Lease", value = "Non-Capitalized Lease"),
			@FlyRefItem(name = "Owned", value = "Owned"), @FlyRefItem(name = "Rented", value = "Rented"), })
	A_Finance_Method,
	//
	@FlyRefList(name = "A_Entry_Type", description = "Entry Types for Fixed Assets", items = {
			@FlyRefItem(name = "Depreciation", value = "Depreciation"),
			@FlyRefItem(name = "Disposals", value = "Disposals"), @FlyRefItem(name = "Forecasts", value = "Forecasts"),
			@FlyRefItem(name = "New", value = "New"), @FlyRefItem(name = "Splits", value = "Splits"),
			@FlyRefItem(name = "Transfers", value = "Transfers"), })
	A_Entry_Type,
	//
	@FlyRefList(name = "UOM Type", items = { @FlyRefItem(name = "Angle", value = "Angle"),
			@FlyRefItem(name = "Area", value = "Area"), @FlyRefItem(name = "Data Storage", value = "Data Storage"),
			@FlyRefItem(name = "Density", value = "Density"), @FlyRefItem(name = "Energy", value = "Energy"),
			@FlyRefItem(name = "Force", value = "Force"),
			@FlyRefItem(name = "Kitchen Measures", value = "Kitchen Measures"),
			@FlyRefItem(name = "Length", value = "Length"), @FlyRefItem(name = "Power", value = "Power"),
			@FlyRefItem(name = "Pressure", value = "Pressure"),
			@FlyRefItem(name = "Temperature", value = "Temperature"), @FlyRefItem(name = "Time", value = "Time"),
			@FlyRefItem(name = "Torque", value = "Torque"), @FlyRefItem(name = "Velocity", value = "Velocity"),
			@FlyRefItem(name = "Volume Liquid", value = "Volume Liquid"),
			@FlyRefItem(name = "Volume Dry", value = "Volume Dry"), @FlyRefItem(name = "Weigth", value = "Weigth"),
			@FlyRefItem(name = "Currency", value = "Currency"), @FlyRefItem(name = "Data Speed", value = "Data Speed"),
			@FlyRefItem(name = "Frequency", value = "Frequency"), @FlyRefItem(name = "Other", value = "Other"), })
	UOM_Type,
	//
	@FlyRefList(name = "PA_Report Period Type", items = { @FlyRefItem(name = "Year", value = "Year"),
			@FlyRefItem(name = "Total", value = "Total"), @FlyRefItem(name = "Period", value = "Period"),
			@FlyRefItem(name = "Natural", value = "Natural"), })
	PA_Report_Period_Type,
	//
	@FlyRefList(name = "PA_Report Amount Type", items = {
			@FlyRefItem(name = "Balance (expected sign)", value = "Balance (expected sign)"),
			@FlyRefItem(name = "Credit Only", value = "Credit Only"),
			@FlyRefItem(name = "Debit Only", value = "Debit Only"),
			@FlyRefItem(name = "Quantity (expected sign)", value = "Quantity (expected sign)"),
			@FlyRefItem(name = "Balance (accounted sign)", value = "Balance (accounted sign)"),
			@FlyRefItem(name = "Quantity (accounted sign)", value = "Quantity (accounted sign)"), })
	PA_Report_Amount_Type,
	//
	@FlyRefList(name = "AD_RelationType Role", description = "Defines the possible 'roles' a the records of a relation can have", items = {
			@FlyRefItem(name = "Order", value = "Order"), @FlyRefItem(name = "Invoice", value = "Invoice"), })
	AD_RelationType_Role,
	//
	@FlyRefList(name = "AD_RelationType Type", description = "'Type' of a relation type", help = "For now we only have implicit realtion types, i.e. the record pairs are defined by the rule itself. In future we would like to have explicit type also. An explizit type just defines a template, the actual pairs can be added by a user or by the system itself.", items = {
			@FlyRefItem(name = "Implicit", value = "Implicit"), @FlyRefItem(name = "Explicit", value = "Explicit"), })
	AD_RelationType_Type,
	//
	@FlyRefList(name = "A_Asset Actions", items = { @FlyRefItem(name = "Dispose", value = "Dispose"),
			@FlyRefItem(name = "Inbound", value = "Inbound"), @FlyRefItem(name = "Modify", value = "Modify"),
			@FlyRefItem(name = "Outbound", value = "Outbound"), @FlyRefItem(name = "Reevaluate", value = "Reevaluate"),
			@FlyRefItem(name = "Retire", value = "Retire"), @FlyRefItem(name = "Transfer", value = "Transfer"), })
	A_Asset_Actions,
	//
	@FlyRefList(name = "POSKeyLayoutType", description = "POS Key layout types", items = {
			@FlyRefItem(name = "Keyboard", value = "Keyboard"), @FlyRefItem(name = "Numberpad", value = "Numberpad"),
			@FlyRefItem(name = "Product", value = "Product"), })
	POSKeyLayoutType,
	//
	@FlyRefList(name = "M_Replenishment Production Create ", items = {
			@FlyRefItem(name = "Distribution Order", value = "Distribution Order"),
			@FlyRefItem(name = "Inventory Movement", value = "Inventory Movement"),
			@FlyRefItem(name = "Purchase Order", value = "Purchase Order"),
			@FlyRefItem(name = "Requistion", value = "Requistion"),
			@FlyRefItem(name = "Production", value = "Production"), })
	M_Replenishment_Production_Create_,
	//
	@FlyRefList(name = "PriceOverrideType", description = "Price Override Type", help = "Fixed price or discount off list", items = {
			@FlyRefItem(name = "Fixed Price", value = "Fixed Price"),
			@FlyRefItem(name = "Discount", value = "Discount"), })
	PriceOverrideType,
	//
	@FlyRefList(name = "ChartOrientation", description = "Chart Orientation", help = "Horizontal or vertical", items = {
			@FlyRefItem(name = "Horizontal", value = "Horizontal"),
			@FlyRefItem(name = "Vertical", value = "Vertical"), })
	ChartOrientation,
	//
	@FlyRefList(name = "TimeUnit", description = "Time units for charting.", items = {
			@FlyRefItem(name = "Day", value = "Day"), @FlyRefItem(name = "Week", value = "Week"),
			@FlyRefItem(name = "Month", value = "Month"), @FlyRefItem(name = "Quarter", value = "Quarter"),
			@FlyRefItem(name = "Year", value = "Year"), })
	TimeUnit,
	//
	@FlyRefList(name = "ChartType", description = "Chart Type", items = {
			@FlyRefItem(name = "Area Chart", value = "Area Chart"),
			@FlyRefItem(name = "Stacked Area Chart", value = "Stacked Area Chart"),
			@FlyRefItem(name = "Bar Chart", value = "Bar Chart"),
			@FlyRefItem(name = "3D Bar Chart", value = "3D Bar Chart"),
			@FlyRefItem(name = "Stacked Bar Chart", value = "Stacked Bar Chart"),
			@FlyRefItem(name = "3D Stacked Bar Chart", value = "3D Stacked Bar Chart"),
			@FlyRefItem(name = "Line Chart", value = "Line Chart"),
			@FlyRefItem(name = "3D Line Chart", value = "3D Line Chart"),
			@FlyRefItem(name = "Waterfall Chart", value = "Waterfall Chart"),
			@FlyRefItem(name = "Pie Chart", value = "Pie Chart"),
			@FlyRefItem(name = "3D Pie Chart", value = "3D Pie Chart"),
			@FlyRefItem(name = "Ring Chart", value = "Ring Chart"), })
	ChartType,
	//
	@FlyRefList(name = "AD_Migration Status", items = { @FlyRefItem(name = "Applied", value = "Applied"),
			@FlyRefItem(name = "Unapplied", value = "Unapplied"), @FlyRefItem(name = "Failed", value = "Failed"),
			@FlyRefItem(name = "Partially applied", value = "Partially applied"), })
	AD_Migration_Status,
	//
	@FlyRefList(name = "AD_Migration Apply/Rollback", description = "Apply or Rollback migration", items = {
			@FlyRefItem(name = "Apply", value = "Apply"), @FlyRefItem(name = "Rollback", value = "Rollback"), })
	AD_Migration_Apply_Rollback,
	//
	@FlyRefList(name = "Migration step type", description = "Type of migration step", help = "Either Application Dictionary change or SQL statement.", items = {
			@FlyRefItem(name = "Application Dictionary", value = "Application Dictionary"),
			@FlyRefItem(name = "SQL Statement", value = "SQL Statement"), })
	Migration_step_type,
	//
	@FlyRefList(name = "PP_Forecast Load Type", description = "List Forecast Load Type indicated that period date is use to create the forecast line.", items = {
			@FlyRefItem(name = "Use Period End Date", value = "Use Period End Date"),
			@FlyRefItem(name = "Use Period Start Date", value = "Use Period Start Date"), })
	PP_Forecast_Load_Type,
	//
	@FlyRefList(name = "PP_Forecast Action Type", description = "Forecast Action Type List containt the option if the forecast is replaced or combined", items = {
			@FlyRefItem(name = "Merge", value = "Merge"), @FlyRefItem(name = "Replace", value = "Replace"), })
	PP_Forecast_Action_Type,
	//
	@FlyRefList(name = "_ReportStyle", description = "The styles for a report are defined", items = {
			@FlyRefItem(name = "Total Line", value = "Total Line"),
			@FlyRefItem(name = "Double Line for Total", value = "Double Line for Total"),
			@FlyRefItem(name = "Underlined Descriptions", value = "Underlined Descriptions"),
			@FlyRefItem(name = "Centered Title", value = "Centered Title"), @FlyRefItem(name = "Line", value = "Line"),
			@FlyRefItem(name = "Blank Line", value = "Blank Line"), })
	_ReportStyle,
	//
	@FlyRefList(name = "Reconciliation Type", items = {
			@FlyRefItem(name = "Bank In Transit", value = "Bank In Transit"),
			@FlyRefItem(name = "Payment Clearing (Unalloc Cash/Payment Selection)", value = "Payment Clearing (Unalloc Cash/Payment Selection)"),
			@FlyRefItem(name = "AR/AP Trade (Receivables/Vendor Liabilities)", value = "AR/AP Trade (Receivables/Vendor Liabilities)"), })
	Reconciliation_Type,
	//
	@FlyRefList(name = "Event List", items = { @FlyRefItem(name = "onClick", value = "onClick"),
			@FlyRefItem(name = "onDoubleClick", value = "onDoubleClick"), })
	Event_List,
	//
	@FlyRefList(name = "WM_InOutBound InOutboundType", items = {
			@FlyRefItem(name = "Outbound Operation", value = "Outbound Operation"),
			@FlyRefItem(name = "Inbound Operation", value = "Inbound Operation"), })
	WM_InOutBound_InOutboundType,
	//
	@FlyRefList(name = "WM_InOutBound Inbound & Outbound Rule", items = {
			@FlyRefItem(name = "Custum Interface", value = "Custum Interface"),
			@FlyRefItem(name = "Find any locator with available capacity", value = "Find any locator with available capacity"),
			@FlyRefItem(name = "For the material oldest using FIFO", value = "For the material oldest using FIFO"),
			@FlyRefItem(name = "For the material most recent using LIFO", value = "For the material most recent using LIFO"), })
	WM_InOutBound_Inbound__Outbound_Rule,
	//
	@FlyRefList(name = "HR_Education Year Of Passing", items = { @FlyRefItem(name = "1970", value = "1970"),
			@FlyRefItem(name = "1971", value = "1971"), @FlyRefItem(name = "1972", value = "1972"),
			@FlyRefItem(name = "1973", value = "1973"), @FlyRefItem(name = "1974", value = "1974"),
			@FlyRefItem(name = "1975", value = "1975"), @FlyRefItem(name = "1976", value = "1976"),
			@FlyRefItem(name = "1977", value = "1977"), @FlyRefItem(name = "1978", value = "1978"),
			@FlyRefItem(name = "1979", value = "1979"), @FlyRefItem(name = "1980", value = "1980"),
			@FlyRefItem(name = "1981", value = "1981"), @FlyRefItem(name = "1982", value = "1982"),
			@FlyRefItem(name = "1983", value = "1983"), @FlyRefItem(name = "1984", value = "1984"),
			@FlyRefItem(name = "1985", value = "1985"), @FlyRefItem(name = "1986", value = "1986"),
			@FlyRefItem(name = "1987", value = "1987"), @FlyRefItem(name = "1988", value = "1988"),
			@FlyRefItem(name = "1989", value = "1989"), @FlyRefItem(name = "1990", value = "1990"),
			@FlyRefItem(name = "1991", value = "1991"), @FlyRefItem(name = "1992", value = "1992"),
			@FlyRefItem(name = "1993", value = "1993"), @FlyRefItem(name = "1994", value = "1994"),
			@FlyRefItem(name = "1995", value = "1995"), @FlyRefItem(name = "1996", value = "1996"),
			@FlyRefItem(name = "1997", value = "1997"), @FlyRefItem(name = "1998", value = "1998"),
			@FlyRefItem(name = "1999", value = "1999"), @FlyRefItem(name = "2000", value = "2000"),
			@FlyRefItem(name = "2001", value = "2001"), @FlyRefItem(name = "2002", value = "2002"),
			@FlyRefItem(name = "2003", value = "2003"), @FlyRefItem(name = "2004", value = "2004"),
			@FlyRefItem(name = "2005", value = "2005"), @FlyRefItem(name = "2006", value = "2006"),
			@FlyRefItem(name = "2007", value = "2007"), @FlyRefItem(name = "2008", value = "2008"),
			@FlyRefItem(name = "2009", value = "2009"), @FlyRefItem(name = "2010", value = "2010"),
			@FlyRefItem(name = "2011", value = "2011"), @FlyRefItem(name = "2012", value = "2012"),
			@FlyRefItem(name = "2013", value = "2013"), @FlyRefItem(name = "2014", value = "2014"),
			@FlyRefItem(name = "2015", value = "2015"), @FlyRefItem(name = "2016", value = "2016"),
			@FlyRefItem(name = "2017", value = "2017"), @FlyRefItem(name = "2018", value = "2018"),
			@FlyRefItem(name = "2019", value = "2019"), @FlyRefItem(name = "2020", value = "2020"),
			@FlyRefItem(name = "2021", value = "2021"), @FlyRefItem(name = "2022", value = "2022"),
			@FlyRefItem(name = "2023", value = "2023"), @FlyRefItem(name = "2024", value = "2024"),
			@FlyRefItem(name = "2025", value = "2025"), @FlyRefItem(name = "2026", value = "2026"),
			@FlyRefItem(name = "2027", value = "2027"), @FlyRefItem(name = "2028", value = "2028"),
			@FlyRefItem(name = "2029", value = "2029"), @FlyRefItem(name = "2030", value = "2030"),
			@FlyRefItem(name = "2031", value = "2031"), @FlyRefItem(name = "2032", value = "2032"),
			@FlyRefItem(name = "2033", value = "2033"), @FlyRefItem(name = "2034", value = "2034"),
			@FlyRefItem(name = "2035", value = "2035"), @FlyRefItem(name = "2036", value = "2036"),
			@FlyRefItem(name = "2037", value = "2037"), @FlyRefItem(name = "2038", value = "2038"),
			@FlyRefItem(name = "2039", value = "2039"), @FlyRefItem(name = "2040", value = "2040"),
			@FlyRefItem(name = "2041", value = "2041"), @FlyRefItem(name = "2042", value = "2042"),
			@FlyRefItem(name = "2043", value = "2043"), @FlyRefItem(name = "2044", value = "2044"),
			@FlyRefItem(name = "2045", value = "2045"), @FlyRefItem(name = "2046", value = "2046"),
			@FlyRefItem(name = "2047", value = "2047"), @FlyRefItem(name = "2048", value = "2048"),
			@FlyRefItem(name = "2049", value = "2049"), @FlyRefItem(name = "2050", value = "2050"), })
	HR_Education_Year_Of_Passing,
	//
	@FlyRefList(name = "C_BPartner_Location Contact Type", description = "C_BPartner_Location", items = {
			@FlyRefItem(name = "Emergency", value = "Emergency"), @FlyRefItem(name = "Primary", value = "Primary"), })
	C_BPartner_Location_Contact_Type,
	//
	@FlyRefList(name = "HR_EmployeeInsurance Payment Frequency", description = "Payment Frequency", items = {
			@FlyRefItem(name = "Quarterly", value = "Quarterly"),
			@FlyRefItem(name = "Semi-yearly", value = "Semi-yearly"), @FlyRefItem(name = "Yearly", value = "Yearly"),
			@FlyRefItem(name = "Monthly", value = "Monthly"), })
	HR_EmployeeInsurance_Payment_Frequency,
	//
	@FlyRefList(name = "_Document Action Import budget", description = "Document action list", items = {
			@FlyRefItem(name = "Draft", value = "Draft"), @FlyRefItem(name = "Complete", value = "Complete"), })
	_Document_Action_Import_budget,
	//
	@FlyRefList(name = "HR_LeaveType Credit Time", description = "Leave Type Credit Time", items = {
			@FlyRefItem(name = "Begining Of The Month", value = "Begining Of The Month"),
			@FlyRefItem(name = "End Of The Month", value = "End Of The Month"), })
	HR_LeaveType_Credit_Time,
	//
	@FlyRefList(name = "A_Asset Status", description = "Asset Status", items = {
			@FlyRefItem(name = "Activated", value = "Activated"), @FlyRefItem(name = "Disposed", value = "Disposed"),
			@FlyRefItem(name = "Depreciated", value = "Depreciated"), @FlyRefItem(name = "New", value = "New"),
			@FlyRefItem(name = "Preservation", value = "Preservation"),
			@FlyRefItem(name = "Retired", value = "Retired"), @FlyRefItem(name = "Sold", value = "Sold"), })
	A_Asset_Status,
	//
	@FlyRefList(name = "Gender", description = "Gender", items = { @FlyRefItem(name = "Female", value = "Female"),
			@FlyRefItem(name = "Male", value = "Male"), })
	Gender,
	//
	@FlyRefList(name = "A_Tip_Finantare", description = "Tip finantare investitii", items = {
			@FlyRefItem(name = "Cofinantare", value = "Cofinantare"), @FlyRefItem(name = "Proprie", value = "Proprie"),
			@FlyRefItem(name = "Terti", value = "Terti"), })
	A_Tip_Finantare,
	//
	@FlyRefList(name = "A_Activation_Method", description = "Activation Methods", items = {
			@FlyRefItem(name = "Activation", value = "Activation"), })
	A_Activation_Method,
	//
	@FlyRefList(name = "Yes-No-Unknown", items = { @FlyRefItem(name = "No", value = "No"),
			@FlyRefItem(name = "- / Default No", value = "- / Default No"), @FlyRefItem(name = "-", value = "-"),
			@FlyRefItem(name = "- / Default Yes", value = "- / Default Yes"),
			@FlyRefItem(name = "Yes", value = "Yes"), })
	Yes_No_Unknown,
	//
	@FlyRefList(name = "WS Parameter Type", items = { @FlyRefItem(name = "Constant", value = "Constant"),
			@FlyRefItem(name = "Free", value = "Free"), })
	WS_Parameter_Type,
	//
	@FlyRefList(name = "Lead Source", description = "Lead Source", help = "The source of a lead", items = {
			@FlyRefItem(name = "Cold Call", value = "Cold Call"),
			@FlyRefItem(name = "Existing Customer", value = "Existing Customer"),
			@FlyRefItem(name = "Employee", value = "Employee"), @FlyRefItem(name = "Partner", value = "Partner"),
			@FlyRefItem(name = "Conference", value = "Conference"),
			@FlyRefItem(name = "Trade Show", value = "Trade Show"), @FlyRefItem(name = "Web Site", value = "Web Site"),
			@FlyRefItem(name = "Word of Mouth", value = "Word of Mouth"),
			@FlyRefItem(name = "Email", value = "Email"), })
	Lead_Source,
	//
	@FlyRefList(name = "Lead Status", items = { @FlyRefItem(name = "New", value = "New"),
			@FlyRefItem(name = "Working", value = "Working"), @FlyRefItem(name = "Expired", value = "Expired"),
			@FlyRefItem(name = "Recycled", value = "Recycled"), @FlyRefItem(name = "Converted", value = "Converted"), })
	Lead_Status,
	//
	@FlyRefList(name = "C_ContactActivity Type", description = "Contact Activity Types", items = {
			@FlyRefItem(name = "Email", value = "Email"), @FlyRefItem(name = "Phone call", value = "Phone call"),
			@FlyRefItem(name = "Meeting", value = "Meeting"), @FlyRefItem(name = "Task", value = "Task"), })
	C_ContactActivity_Type,
	//
	@FlyRefList(name = "HR_LeaveType Leave Repeated Type", description = "Leave Repeated Type", help = "Leave Repeated Type", items = {
			@FlyRefItem(name = "Monthly", value = "Monthly"), @FlyRefItem(name = "Quarterly", value = "Quarterly"),
			@FlyRefItem(name = "Yearly", value = "Yearly"), })
	HR_LeaveType_Leave_Repeated_Type,
	//
	@FlyRefList(name = "HR_LeaveType Adjacent Holidays Type", description = "Adjacent Holidays Type", help = "Adjacent Holidays Type", items = {
			@FlyRefItem(name = "Adjacent", value = "Adjacent"), @FlyRefItem(name = "Included", value = "Included"),
			@FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "Included & Adjacent", value = "Included & Adjacent"), })
	HR_LeaveType_Adjacent_Holidays_Type,
	//
	@FlyRefList(name = "HR_LeaveReason Types Of the reasons", description = "Types Of the reasons", help = "Types Of the reasons", items = {
			@FlyRefItem(name = "Leave request disapproval", value = "Leave request disapproval"),
			@FlyRefItem(name = "Leave Request", value = "Leave Request"),
			@FlyRefItem(name = "Other Reason", value = "Other Reason"), })
	HR_LeaveReason_Types_Of_the_reasons,
	//
	@FlyRefList(name = "HR_EmployeeType Wage Level", description = "Wage Level", items = {
			@FlyRefItem(name = "Daily", value = "Daily"), @FlyRefItem(name = "Monthly", value = "Monthly"), })
	HR_EmployeeType_Wage_Level,
	//
	@FlyRefList(name = "HR_JobApplication Identity Proof", description = "Identity Proof", help = "Identity Proof", items = {
			@FlyRefItem(name = "Aadhar Card", value = "Aadhar Card"),
			@FlyRefItem(name = "Driving License", value = "Driving License"),
			@FlyRefItem(name = "PAN card", value = "PAN card"),
			@FlyRefItem(name = "Ration Card", value = "Ration Card"),
			@FlyRefItem(name = "Voter Card", value = "Voter Card"), })
	HR_JobApplication_Identity_Proof,
	//
	@FlyRefList(name = "HR_Application Status", description = "Status Of The Application", help = "Applied	- Shortlisted	- Rejected	- Interview (In-progress)	- Offered	- Offer Accepted	- Joined	", items = {
			@FlyRefItem(name = "Applied", value = "Applied"),
			@FlyRefItem(name = "Interview (In-progress) ", value = "Interview (In-progress) "),
			@FlyRefItem(name = "Joined", value = "Joined"),
			@FlyRefItem(name = "Offer Accepted ", value = "Offer Accepted "),
			@FlyRefItem(name = "Offered", value = "Offered"), @FlyRefItem(name = "Rejected", value = "Rejected"),
			@FlyRefItem(name = "Shortlisted", value = "Shortlisted"), })
	HR_Application_Status,
	//
	@FlyRefList(name = "Inter View Rating / Score", description = "Inter View Rating / Score", help = "Inter View Rating / Score", items = {
			@FlyRefItem(name = "Average", value = "Average"), @FlyRefItem(name = "Bad", value = "Bad"),
			@FlyRefItem(name = "Excellent", value = "Excellent"), @FlyRefItem(name = "Good", value = "Good"),
			@FlyRefItem(name = "Outstanding", value = "Outstanding"),
			@FlyRefItem(name = "Very Bad", value = "Very Bad"), @FlyRefItem(name = "Very Good", value = "Very Good"), })
	Inter_View_Rating__Score,
	//
	@FlyRefList(name = "C_DocType DocBaseType", description = "Base Document Types", items = {
			@FlyRefItem(name = "AR Credit Memo", value = "AR Credit Memo"),
			@FlyRefItem(name = "AP Payment", value = "AP Payment"),
			@FlyRefItem(name = "AR Pro Forma Invoice", value = "AR Pro Forma Invoice"),
			@FlyRefItem(name = "AR Invoice", value = "AR Invoice"),
			@FlyRefItem(name = "AR Receipt", value = "AR Receipt"),
			@FlyRefItem(name = "GL Document", value = "GL Document"),
			@FlyRefItem(name = "Material Movement", value = "Material Movement"),
			@FlyRefItem(name = "Material Receipt", value = "Material Receipt"),
			@FlyRefItem(name = "Material Delivery", value = "Material Delivery"),
			@FlyRefItem(name = "Purchase Order", value = "Purchase Order"),
			@FlyRefItem(name = "Purchase Requisition", value = "Purchase Requisition"),
			@FlyRefItem(name = "Sales Order", value = "Sales Order"),
			@FlyRefItem(name = "Cash Journal", value = "Cash Journal"),
			@FlyRefItem(name = "Payroll", value = "Payroll"),
			@FlyRefItem(name = "Maintenance Order", value = "Maintenance Order"),
			@FlyRefItem(name = "Manufacturing Order", value = "Manufacturing Order"),
			@FlyRefItem(name = "Quality Order", value = "Quality Order"),
			@FlyRefItem(name = "Fixed Assets Disposal", value = "Fixed Assets Disposal"),
			@FlyRefItem(name = "Fixed Assets Depreciation", value = "Fixed Assets Depreciation"),
			@FlyRefItem(name = "AP Credit Memo", value = "AP Credit Memo"),
			@FlyRefItem(name = "AP Invoice", value = "AP Invoice"),
			@FlyRefItem(name = "Payment Allocation", value = "Payment Allocation"),
			@FlyRefItem(name = "Bank Statement", value = "Bank Statement"),
			@FlyRefItem(name = "Distribution Order", value = "Distribution Order"),
			@FlyRefItem(name = "Fixed Assets Addition", value = "Fixed Assets Addition"),
			@FlyRefItem(name = "GL Journal", value = "GL Journal"),
			@FlyRefItem(name = "Manufacturing Cost Collector", value = "Manufacturing Cost Collector"),
			@FlyRefItem(name = "Material Physical Inventory", value = "Material Physical Inventory"),
			@FlyRefItem(name = "Material Production", value = "Material Production"),
			@FlyRefItem(name = "Match Invoice", value = "Match Invoice"),
			@FlyRefItem(name = "Match PO", value = "Match PO"),
			@FlyRefItem(name = "Project Issue", value = "Project Issue"),
			@FlyRefItem(name = "Warehouse Management Order", value = "Warehouse Management Order"),
			@FlyRefItem(name = "AP Payment Selection", value = "AP Payment Selection"),
			@FlyRefItem(name = "Manufacturing Planned Order", value = "Manufacturing Planned Order"),
			@FlyRefItem(name = "Sales Commission", value = "Sales Commission"), })
	C_DocType_DocBaseType,
	//
	@FlyRefList(name = "_YesNo", items = { @FlyRefItem(name = "Yes", value = "Yes"),
			@FlyRefItem(name = "No", value = "No"), })
	_YesNo,
	//
	@FlyRefList(name = "C_Order DeliveryRule", description = "Delivery Rules list", items = {
			@FlyRefItem(name = "After Receipt", value = "After Receipt"),
			@FlyRefItem(name = "Availability", value = "Availability"),
			@FlyRefItem(name = "Complete Line", value = "Complete Line"),
			@FlyRefItem(name = "Complete Order", value = "Complete Order"),
			@FlyRefItem(name = "Force", value = "Force"), @FlyRefItem(name = "Manual", value = "Manual"), })
	C_Order_DeliveryRule,
	//
	@FlyRefList(name = "EncryptionType List", items = { @FlyRefItem(name = "None", value = "None"),
			@FlyRefItem(name = "SSL", value = "SSL"), @FlyRefItem(name = "TLS", value = "TLS"), })
	EncryptionType_List,
	//
	@FlyRefList(name = "AuthMechanisms List", items = { @FlyRefItem(name = "Login", value = "Login"),
			@FlyRefItem(name = "Plain", value = "Plain"), @FlyRefItem(name = "Digest-MD5", value = "Digest-MD5"),
			@FlyRefItem(name = "NTLM", value = "NTLM"), @FlyRefItem(name = "oAuth", value = "oAuth"), })
	AuthMechanisms_List,
	//
	@FlyRefList(name = "Protocol List", items = { @FlyRefItem(name = "SMTP", value = "SMTP"),
			@FlyRefItem(name = "POP3", value = "POP3"), @FlyRefItem(name = "IMAP", value = "IMAP"), })
	Protocol_List,
	//
	@FlyRefList(name = "CreateFromType List", items = { @FlyRefItem(name = "RMA", value = "RMA"),
			@FlyRefItem(name = "Invoice", value = "Invoice"), @FlyRefItem(name = "Order", value = "Order"),
			@FlyRefItem(name = "Delivery / Receipt", value = "Delivery / Receipt"), })
	CreateFromType_List,
	//
	@FlyRefList(name = "HR_Employee Status & ESI Response Code", description = "Employee Status & ESI Response Code", items = {
			@FlyRefItem(name = "Without Reason", value = "Without Reason"),
			@FlyRefItem(name = "On Leave", value = "On Leave"),
			@FlyRefItem(name = "Left Service", value = "Left Service"),
			@FlyRefItem(name = "Retired", value = "Retired"), @FlyRefItem(name = "Expired", value = "Expired"),
			@FlyRefItem(name = "Non Implemented Area", value = "Non Implemented Area"),
			@FlyRefItem(name = "Compliance by Immediate Ex", value = "Compliance by Immediate Ex"),
			@FlyRefItem(name = "Suspension of work", value = "Suspension of work"),
			@FlyRefItem(name = "Strike/Lockout", value = "Strike/Lockout"),
			@FlyRefItem(name = "Retrenchment", value = "Retrenchment"),
			@FlyRefItem(name = "No Work", value = "No Work"),
			@FlyRefItem(name = "Doesnt Belong To This Employee", value = "Doesnt Belong To This Employee"),
			@FlyRefItem(name = "Out of Coverage", value = "Out of Coverage"),
			@FlyRefItem(name = "Active", value = "Active"), })
	HR_Employee_Status__ESI_Response_Code,
	//
	@FlyRefList(name = "PA_ReportLine Line Stroke Type", items = { @FlyRefItem(name = "Solid", value = "Solid"),
			@FlyRefItem(name = "Double Solid", value = "Double Solid"), @FlyRefItem(name = "Dotted", value = "Dotted"),
			@FlyRefItem(name = "Double Dotted", value = "Double Dotted"),
			@FlyRefItem(name = "Dashed", value = "Dashed"),
			@FlyRefItem(name = "Double Dashed", value = "Double Dashed"), })
	PA_ReportLine_Line_Stroke_Type,
	//
	@FlyRefList(name = "ReportType", items = { @FlyRefItem(name = "PDF", value = "PDF"),
			@FlyRefItem(name = "XLS", value = "XLS"), @FlyRefItem(name = "HTML", value = "HTML"),
			@FlyRefItem(name = "XLSX", value = "XLSX"), })
	ReportType,
	//
	@FlyRefList(name = "Marital Status", description = "Marital Status", items = {
			@FlyRefItem(name = "Divorced", value = "Divorced"), @FlyRefItem(name = "Live-in", value = "Live-in"),
			@FlyRefItem(name = "Married", value = "Married"), @FlyRefItem(name = "Single", value = "Single"),
			@FlyRefItem(name = "Widow", value = "Widow"), @FlyRefItem(name = "Windower", value = "Windower"), })
	Marital_Status,
	//
	@FlyRefList(name = "C_BPartner Blood Group", description = "Blood Group", items = {
			@FlyRefItem(name = "O -", value = "O -"), @FlyRefItem(name = "A +", value = "A +"),
			@FlyRefItem(name = "AB +", value = "AB +"), @FlyRefItem(name = "B -", value = "B -"),
			@FlyRefItem(name = "B +", value = "B +"), @FlyRefItem(name = "O +", value = "O +"),
			@FlyRefItem(name = "A -", value = "A -"), @FlyRefItem(name = "AB -", value = "AB -"), })
	C_BPartner_Blood_Group,
	//
	@FlyRefList(name = "DD_LicenseType Transport License Type", description = "Transport License Type", items = {
			@FlyRefItem(name = "License Driver", value = "License Driver"),
			@FlyRefItem(name = "Vehicle License", value = "Vehicle License"), })
	DD_LicenseType_Transport_License_Type,
	//
	@FlyRefList(name = "DD_TransportUnitType Transport Mode", description = "The modes of transport supported", items = {
			@FlyRefItem(name = "Barge", value = "Barge"), @FlyRefItem(name = "Marine", value = "Marine"),
			@FlyRefItem(name = "Pipeline", value = "Pipeline"), @FlyRefItem(name = "Rail", value = "Rail"),
			@FlyRefItem(name = "Road", value = "Road"), })
	DD_TransportUnitType_Transport_Mode,
	//
	@FlyRefList(name = "DD_TransportUnitType Transport Physical Type", description = " physical type of the transport unit into a part that carries the load, a mover, and other load bearing elements", items = {
			@FlyRefItem(name = "Other weight-bearing units", value = "Other weight-bearing units"),
			@FlyRefItem(name = "Prime mover", value = "Prime mover"),
			@FlyRefItem(name = "Single units with engine and loading capacity", value = "Single units with engine and loading capacity"),
			@FlyRefItem(name = "Trailer", value = "Trailer"), })
	DD_TransportUnitType_Transport_Physical_Type,
	//
	@FlyRefList(name = "DD_TransportUnit Transport Unit Status", description = "Transport unit status", items = {
			@FlyRefItem(name = "Available", value = "Available"), @FlyRefItem(name = "In Disuse", value = "In Disuse"),
			@FlyRefItem(name = "Not Available", value = "Not Available"), })
	DD_TransportUnit_Transport_Unit_Status,
	//
	@FlyRefList(name = "DD_Driver Driver Status", description = "Driver Status", items = {
			@FlyRefItem(name = "Available", value = "Available"),
			@FlyRefItem(name = "Not available", value = "Not available"), })
	DD_Driver_Driver_Status,
	//
	@FlyRefList(name = "DD_VehicleType Vehicle Type", items = { @FlyRefItem(name = "Barges", value = "Barges"),
			@FlyRefItem(name = "Pipelines", value = "Pipelines"), @FlyRefItem(name = "Ships", value = "Ships"),
			@FlyRefItem(name = "Trucks", value = "Trucks"), @FlyRefItem(name = "Trains", value = "Trains"), })
	DD_VehicleType_Vehicle_Type,
	//
	@FlyRefList(name = "DD_Vehicle Vehicle Status", description = "Vehicle Status", items = {
			@FlyRefItem(name = "Available", value = "Available"), @FlyRefItem(name = "In Disuse", value = "In Disuse"),
			@FlyRefItem(name = "Not Available", value = "Not Available"), })
	DD_Vehicle_Vehicle_Status,
	//
	@FlyRefList(name = "Print Document", items = { @FlyRefItem(name = "Order", value = "Order"),
			@FlyRefItem(name = "Shipment", value = "Shipment"), @FlyRefItem(name = "Invoice", value = "Invoice"), })
	Print_Document,
	//
	@FlyRefList(name = "M_ReplenishPlanLine RecordType", items = {
			@FlyRefItem(name = "Closing Balance", value = "Closing Balance"),
			@FlyRefItem(name = "Opening Balance", value = "Opening Balance"),
			@FlyRefItem(name = "Supply - Purchasing", value = "Supply - Purchasing"),
			@FlyRefItem(name = "Supply - Requisition", value = "Supply - Requisition"),
			@FlyRefItem(name = "Planned Production", value = "Planned Production"),
			@FlyRefItem(name = "Confirmed Production", value = "Confirmed Production"),
			@FlyRefItem(name = "Total Demand", value = "Total Demand"),
			@FlyRefItem(name = "Total Supply", value = "Total Supply"),
			@FlyRefItem(name = "Total Supply - PO", value = "Total Supply - PO"),
			@FlyRefItem(name = "Total Supply - Requisition", value = "Total Supply - Requisition"),
			@FlyRefItem(name = "Total Planned Production", value = "Total Planned Production"),
			@FlyRefItem(name = "Total Confirmed Production", value = "Total Confirmed Production"),
			@FlyRefItem(name = "Demand", value = "Demand"), })
	M_ReplenishPlanLine_RecordType,
}