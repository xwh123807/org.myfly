package org.myfly.platform.core3.dbinit.resources;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IRefList;
import org.myfly.platform.core3.metadata.annotation.FlyElement;

public enum Element_ALL_EN implements IRefList{
	//
	@FlyElement(name="A_Account_Number", dataType=FlyDataType.Account, entityType="D", printName="A_Account_Number", fieldLength=22)
	A_Account_Number,
	//
	@FlyElement(name="A_Account_Number_Acct", dataType=FlyDataType.NONE, entityType="D", printName="A_Account_Number_Acct", fieldLength=0)
	A_Account_Number_Acct,
	//
	@FlyElement(name="Accumulated Depreciation Account", dataType=FlyDataType.Account, entityType="D", printName="Accumulated Depreciation Account", fieldLength=40)
	A_Accumdepreciation_Acct,
	//
	@FlyElement(name="New Accum Depreciation Acct", dataType=FlyDataType.Account, entityType="D", printName="New Accum Depreciation Acct", fieldLength=22)
	A_Accumdepreciation_Acct_New,
	//
	@FlyElement(name="Old Asset Cost Acct", dataType=FlyDataType.String, entityType="D", printName="Old Asset Cost Acct", fieldLength=40)
	A_Accumdepreciation_Acct_Str,
	//
	@FlyElement(name="Accumulated Depreciation Account (new)", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Depreciation Account (new)", fieldLength=0)
	A_Accumdepreciation_New_Acct,
	//
	@FlyElement(name="Accumulated Depreciation", dataType=FlyDataType.Amount, entityType="D", printName="Accumulated Depreciation", fieldLength=22)
	A_Accumulated_Depr,
	//
	@FlyElement(name="Adjust Accumulated Depreciation", dataType=FlyDataType.NONE, entityType="D", printName="Adjust Accumulated Depreciation", fieldLength=0)
	A_Accumulated_Depr_Adjust,
	//
	@FlyElement(name="Accumulated Depreciation (delta)", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Depreciation (delta)", fieldLength=0)
	A_Accumulated_Depr_Delta,
	//
	@FlyElement(name="Accumulated Depreciation (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Depreciation (fiscal)", fieldLength=0)
	A_Accumulated_Depr_F,
	//
	@FlyElement(name="Accumulated Depreciation - fiscal (delta)", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Depreciation - fiscal (delta)", fieldLength=0)
	A_Accumulated_Depr_F_Delta,
	//
	@FlyElement(name="Activation Method", dataType=FlyDataType.NONE, entityType="D", printName="Activation Method", fieldLength=0)
	A_Activation_Method,
	//
	@FlyElement(name="Amount Split", dataType=FlyDataType.Amount, entityType="D", printName="Amount Split", fieldLength=22)
	A_Amount_Split,
	//
	@FlyElement(name="Asset Acct", dataType=FlyDataType.Account, entityType="D", printName="AssetAcct", fieldLength=40)
	A_Asset_Acct,
	//
	@FlyElement(name="A_Asset_Acct_ID", dataType=FlyDataType.Integer, entityType="D", printName="A_Asset_Acct_ID", fieldLength=22)
	A_Asset_Acct_ID,
	//
	@FlyElement(name="New Asset Cost Acct", dataType=FlyDataType.Account, entityType="D", printName="New Asset Cost Acct", fieldLength=22)
	A_Asset_Acct_New,
	//
	@FlyElement(name="A_Asset_Acct_Str", dataType=FlyDataType.String, entityType="D", printName="A_Asset_Acct_Str", fieldLength=40)
	A_Asset_Acct_Str,
	//
	@FlyElement(name="Asset Action", dataType=FlyDataType.NONE, entityType="D", printName="Asset Action", fieldLength=0)
	A_Asset_Action,
	//
	@FlyElement(name="Asset Addition", dataType=FlyDataType.ID, entityType="D", printName="Asset Addition", fieldLength=22)
	A_Asset_Addition_ID,
	//
	@FlyElement(name="A_Asset_Change_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Change_ID", fieldLength=22)
	A_Asset_Change_ID,
	//
	@FlyElement(name="Asset class", dataType=FlyDataType.NONE, entityType="D", printName="Asset class", fieldLength=0)
	A_Asset_Class_ID,
	//
	@FlyElement(name="Asset Class Key", dataType=FlyDataType.NONE, entityType="D", printName="Asset Class Key", fieldLength=0)
	A_Asset_Class_Value,
	//
	@FlyElement(name="Asset Cost", dataType=FlyDataType.Amount, entityType="D", printName="Asset Cost", fieldLength=22)
	A_Asset_Cost,
	//
	@FlyElement(name="Asset Cost Change", dataType=FlyDataType.NONE, entityType="D", printName="Asset Cost Change", fieldLength=0)
	A_Asset_Cost_Change,
	//
	@FlyElement(name="Delta Asset Cost", dataType=FlyDataType.NONE, entityType="D", printName="Delta Asset Cost", fieldLength=0)
	A_Asset_Cost_Delta,
	//
	@FlyElement(name="Create Date", dataType=FlyDataType.Date, entityType="D", printName="Create Date", fieldLength=7)
	A_Asset_CreateDate,
	//
	@FlyElement(name="Asset Delivery", description="Delivery of Asset", help="The availability of the asset to the business partner (customer).", dataType=FlyDataType.ID, entityType="D", printName="Asset Delivery", fieldLength=22)
	A_Asset_Delivery_ID,
	//
	@FlyElement(name="Asset Disposed", dataType=FlyDataType.ID, entityType="D", printName="Asset Disposed", fieldLength=22)
	A_Asset_Disposed_ID,
	//
	@FlyElement(name="Asset Group Accounting", dataType=FlyDataType.ID, entityType="D", printName="Asset Group Accounting", fieldLength=22)
	A_Asset_Group_Acct_ID,
	//
	@FlyElement(name="Asset Group", description="Group of Assets", help="The group of assets determines default accounts.  If an asset group is selected in the product category, assets are created when delivering the asset.", dataType=FlyDataType.TableDirect, entityType="D", printName="Asset Group", fieldLength=22)
	A_Asset_Group_ID,
	//
	@FlyElement(name="Asset Group Key", dataType=FlyDataType.NONE, entityType="D", printName="Asset Group Key", fieldLength=0)
	A_Asset_Group_Value,
	//
	@FlyElement(name="Asset", description="Asset used internally or by customers", help="An asset is either created by purchasing or by delivering a product.  An asset can be used internally or be a customer asset.", dataType=FlyDataType.ID, entityType="D", printName="Asset", fieldLength=22)
	A_Asset_ID,
	//
	@FlyElement(name="To Asset ID", dataType=FlyDataType.Table, entityType="D", printName="To Asset ID", fieldLength=22)
	A_Asset_ID_To,
	//
	@FlyElement(name="Asset Info Financial ID", dataType=FlyDataType.ID, entityType="D", printName="Asset Info Financial ID", fieldLength=22)
	A_Asset_Info_Fin_ID,
	//
	@FlyElement(name="A_Asset_Info_Ins_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Info_Ins_ID", fieldLength=22)
	A_Asset_Info_Ins_ID,
	//
	@FlyElement(name="A_Asset_Info_Lic_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Info_Lic_ID", fieldLength=22)
	A_Asset_Info_Lic_ID,
	//
	@FlyElement(name="A_Asset_Info_Oth_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Info_Oth_ID", fieldLength=22)
	A_Asset_Info_Oth_ID,
	//
	@FlyElement(name="Asset Info Tax", dataType=FlyDataType.ID, entityType="D", printName="Asset Info Tax", fieldLength=22)
	A_Asset_Info_Tax_ID,
	//
	@FlyElement(name="A_Asset_Life_Current_Year", dataType=FlyDataType.Amount, entityType="D", printName="A_Asset_Life_Current_Year", fieldLength=22)
	A_Asset_Life_Current_Year,
	//
	@FlyElement(name="Life Years", dataType=FlyDataType.Integer, entityType="D", printName="Life Years", fieldLength=22)
	A_Asset_Life_Years,
	//
	@FlyElement(name="Life Years (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Life Years (fiscal)", fieldLength=0)
	A_Asset_Life_Years_F,
	//
	@FlyElement(name="Asset Acct (new)", dataType=FlyDataType.NONE, entityType="D", printName="Asset Acct (new)", fieldLength=0)
	A_Asset_New_Acct,
	//
	@FlyElement(name="Asset Product", dataType=FlyDataType.NONE, entityType="D", printName="Asset Product", fieldLength=0)
	A_Asset_Product_ID,
	//
	@FlyElement(name="Remaining Amt", dataType=FlyDataType.NONE, entityType="D", printName="Remaining Amt", fieldLength=0)
	A_Asset_Remaining,
	//
	@FlyElement(name="Remaining Amt (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Remaining Amt (fiscal)", fieldLength=0)
	A_Asset_Remaining_F,
	//
	@FlyElement(name="Asset Retirement", description="Internally used asset is not longer used.", dataType=FlyDataType.ID, entityType="D", printName="Asset Retirement", fieldLength=22)
	A_Asset_Retirement_ID,
	//
	@FlyElement(name="Revaluation Date", dataType=FlyDataType.Date, entityType="D", printName="Revaluation Date", fieldLength=7)
	A_Asset_RevalDate,
	//
	@FlyElement(name="Asset Reval. Entry", dataType=FlyDataType.ID, entityType="D", printName="Asset Reval. Entry", fieldLength=22)
	A_Asset_Reval_Entry_ID,
	//
	@FlyElement(name="Asset Revaluation", dataType=FlyDataType.NONE, entityType="D", printName="Asset Revaluation", fieldLength=0)
	A_Asset_Reval_ID,
	//
	@FlyElement(name="Asset Reval Index", dataType=FlyDataType.ID, entityType="D", printName="Asset Reval Index", fieldLength=22)
	A_Asset_Reval_Index_ID,
	//
	@FlyElement(name="Asset Split", dataType=FlyDataType.ID, entityType="D", printName="Asset Split", fieldLength=22)
	A_Asset_Split_ID,
	//
	@FlyElement(name="A_Asset_Spread_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Spread_ID", fieldLength=22)
	A_Asset_Spread_ID,
	//
	@FlyElement(name="Spread Type", dataType=FlyDataType.Text, entityType="D", printName="Spread Type", fieldLength=20)
	A_Asset_Spread_Type,
	//
	@FlyElement(name="Asset Status", dataType=FlyDataType.NONE, entityType="D", printName="Asset Status", fieldLength=0)
	A_Asset_Status,
	//
	@FlyElement(name="Asset Trade", dataType=FlyDataType.Table, entityType="D", printName="Asset Trade", fieldLength=22)
	A_Asset_Trade_ID,
	//
	@FlyElement(name="A_Asset_Transfer_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Transfer_ID", fieldLength=22)
	A_Asset_Transfer_ID,
	//
	@FlyElement(name="Asset Type", dataType=FlyDataType.NONE, entityType="D", printName="Asset Type", fieldLength=0)
	A_AssetType,
	//
	@FlyElement(name="Asset Type", dataType=FlyDataType.NONE, entityType="D", printName="Asset Type", fieldLength=0)
	A_Asset_Type_ID,
	//
	@FlyElement(name="Asset Type Value", dataType=FlyDataType.NONE, entityType="D", printName="Asset Type Value", fieldLength=0)
	A_Asset_Type_Value,
	//
	@FlyElement(name="A_Asset_Use_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Use_ID", fieldLength=22)
	A_Asset_Use_ID,
	//
	@FlyElement(name="A_Base_Amount", dataType=FlyDataType.Amount, entityType="D", printName="A_Base_Amount", fieldLength=22)
	A_Base_Amount,
	//
	@FlyElement(name="A_Calc_Accumulated_Depr", dataType=FlyDataType.Amount, entityType="D", printName="A_Calc_Accumulated_Depr", fieldLength=22)
	A_Calc_Accumulated_Depr,
	//
	@FlyElement(name="Capital/Expense", dataType=FlyDataType.List, entityType="D", printName="Capital/Expense", fieldLength=3)
	A_CapvsExp,
	//
	@FlyElement(name="Accept AMEX", description="Accept American Express Card", help="Indicates if American Express Cards are accepted", dataType=FlyDataType.YesNo, entityType="D", printName="AMEX", fieldLength=1)
	AcceptAMEX,
	//
	@FlyElement(name="Accept ATM", description="Accept Bank ATM Card", help="Indicates if Bank ATM Cards are accepted", dataType=FlyDataType.YesNo, entityType="D", printName="ATM", fieldLength=1)
	AcceptATM,
	//
	@FlyElement(name="Accept Electronic Check", description="Accept ECheck (Electronic Checks)", help="Indicates if EChecks are accepted", dataType=FlyDataType.YesNo, entityType="D", printName="ECheck", fieldLength=1)
	AcceptCheck,
	//
	@FlyElement(name="Accept Corporate", description="Accept Corporate Purchase Cards", help="Indicates if Corporate Purchase Cards are accepted ", dataType=FlyDataType.YesNo, entityType="D", printName="Corporate", fieldLength=1)
	AcceptCorporate,
	//
	@FlyElement(name="Accept Diners", description="Accept Diner's Club", help="Indicates if Diner's Club Cards are accepted ", dataType=FlyDataType.YesNo, entityType="D", printName="Diners", fieldLength=1)
	AcceptDiners,
	//
	@FlyElement(name="Accept Direct Debit", description="Accept Direct Debits (vendor initiated)", help="Accept Direct Debit transactions. Direct Debits are initiated by the vendor who has permission to deduct amounts from the payee's account.", dataType=FlyDataType.YesNo, entityType="D", printName="Direct Debit", fieldLength=1)
	AcceptDirectDebit,
	//
	@FlyElement(name="Accept Direct Deposit", description="Accept Direct Deposit (payee initiated)", help="Indicates if Direct Deposits (wire transfers, etc.) are accepted. Direct Deposits are initiated by the payee.", dataType=FlyDataType.YesNo, entityType="D", printName="Direct Deposit", fieldLength=1)
	AcceptDirectDeposit,
	//
	@FlyElement(name="Accept Discover", description="Accept Discover Card", help="Indicates if Discover Cards are accepted", dataType=FlyDataType.YesNo, entityType="D", printName="Discover", fieldLength=1)
	AcceptDiscover,
	//
	@FlyElement(name="Accept Language", description="Language accepted based on browser information", dataType=FlyDataType.String, entityType="D", printName="Accept Language", fieldLength=60)
	AcceptLanguage,
	//
	@FlyElement(name="Accept MasterCard", description="Accept Master Card", help="Indicates if Master Cards are accepted ", dataType=FlyDataType.YesNo, entityType="D", printName="MC", fieldLength=1)
	AcceptMC,
	//
	@FlyElement(name="Accept Visa", description="Accept Visa Cards", help="Indicates if Visa Cards are accepted ", dataType=FlyDataType.YesNo, entityType="D", printName="Visa", fieldLength=1)
	AcceptVisa,
	//
	@FlyElement(name="Data Access Level", description="Access Level required", help="Indicates the access level required for this record or process.", dataType=FlyDataType.List, entityType="D", printName="Data Access Level", fieldLength=1)
	AccessLevel,
	//
	@FlyElement(name="Access Type", description="The type of access for this rule", help="If you restrict Access to the entity, you also cannot Report or Export it (i.e. to have access is a requirement that you can report or export the data).  The Report and Export rules are further restrictions if you have access.", dataType=FlyDataType.List, entityType="D", printName="Access Type", fieldLength=1)
	AccessTypeRule,
	//
	@FlyElement(name="Account", dataType=FlyDataType.String, entityType="EE05", printName="Account", fieldLength=255)
	Account,
	//
	@FlyElement(name="Account_Acct", dataType=FlyDataType.Account, entityType="D", printName="Account_Acct", fieldLength=22)
	Account_Acct,
	//
	@FlyElement(name="Account", description="Account used", help="The (natural) account used", dataType=FlyDataType.Search, entityType="D", printName="Account", fieldLength=22)
	Account_ID,
	//
	@FlyElement(name="Account No", description="Account Number", help="The Account Number indicates the Number assigned to this bank account. ", dataType=FlyDataType.String, entityType="D", printName="Account No", fieldLength=20)
	AccountNo,
	//
	@FlyElement(name="Account Sign", description="Indicates the Natural Sign of the Account as a Debit or Credit", help="Indicates if the expected balance for this account should be a Debit or a Credit. If set to Natural, the account sign for an asset or expense account is Debit Sign (i.e. negative if a credit balance).", dataType=FlyDataType.List, entityType="D", printName="Sign", fieldLength=1)
	AccountSign,
	//
	@FlyElement(name="Account Type", description="Indicates the type of account", help="Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo.  The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners.  Note:  Memo account amounts are ignored when checking for balancing", dataType=FlyDataType.List, entityType="D", printName="Account Type", fieldLength=1)
	AccountType,
	//
	@FlyElement(name="Account Key", description="Key of Account Element", dataType=FlyDataType.String, entityType="D", printName="Account Key", fieldLength=40)
	AccountValue,
	//
	@FlyElement(name="Account Schema Name", description="Name of the Accounting Schema", dataType=FlyDataType.String, entityType="D", printName="AcctSchema Name", fieldLength=60)
	AcctSchemaName,
	//
	@FlyElement(name="Accumulation Type", description="How to accumulate data on time axis", help="Sum adds the data points (e.g. stock volume) - Average is appropriate for e.g. Stock Price", dataType=FlyDataType.List, entityType="D", printName="Accumulation Type", fieldLength=1)
	AccumulationType,
	//
	@FlyElement(name="Change Acumulated Depreciation", dataType=FlyDataType.NONE, entityType="D", printName="Change Acumulated Depreciation", fieldLength=0)
	A_Change_Acumulated_Depr,
	//
	@FlyElement(name="Account City", description="City or the Credit Card or Account Holder", help="The Account City indicates the City of the Credit Card or Account holder", dataType=FlyDataType.String, entityType="D", printName="City", fieldLength=60)
	A_City,
	//
	@FlyElement(name="Contract Date", dataType=FlyDataType.Date, entityType="D", printName="Contract Date", fieldLength=7)
	A_Contract_Date,
	//
	@FlyElement(name="Account Country", description="Country", help="Account Country Name", dataType=FlyDataType.String, entityType="D", printName="Country", fieldLength=40)
	A_Country,
	//
	@FlyElement(name="Acquisition Cost", description="The cost of gaining the prospect as a customer", help="The Acquisition Cost identifies the cost associated with making this prospect a customer.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Acquisition Cost", fieldLength=22)
	AcqusitionCost,
	//
	@FlyElement(name="Create Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Create Asset", fieldLength=1)
	A_CreateAsset,
	//
	@FlyElement(name="Action", description="Indicates the Action to be performed", help="The Action field is a drop down list box which indicates the Action to be performed for this Item.", dataType=FlyDataType.List, entityType="D", printName="Action", fieldLength=1)
	Action,
	//
	@FlyElement(name="Activity Value", dataType=FlyDataType.String, entityType="D", printName="Activity Value", fieldLength=40)
	ActivityValue,
	//
	@FlyElement(name="Auto Complete Min Length", description="Identifier autocomplete trigger length", dataType=FlyDataType.Integer, entityType="D", printName="Auto Complete Min Length", fieldLength=10)
	ACTriggerLength,
	//
	@FlyElement(name="Actual Amount", description="The actual amount", help="Actual amount indicates the agreed upon amount for a document.", dataType=FlyDataType.Amount, entityType="D", printName="Actual Amt", fieldLength=22)
	ActualAmt,
	//
	@FlyElement(name="Actual Click Count", description="How many clicks have been counted", help="Contains info on the actual click count until now", dataType=FlyDataType.Integer, entityType="D", printName="Actual Click Count", fieldLength=10)
	ActualClick,
	//
	@FlyElement(name="Actual Impression Count", description="How many impressions have been counted", help="Contains info on the actual impression count until now", dataType=FlyDataType.Integer, entityType="D", printName="Actual Impression Count", fieldLength=10)
	ActualImpression,
	//
	@FlyElement(name="Actual Life Time Value", description="Actual Life Time Revenue", help="The Actual Life Time Value is the recorded revenue in primary accounting currency generated by the Business Partner.", dataType=FlyDataType.Amount, entityType="D", printName="Actual Life Time Value", fieldLength=22)
	ActualLifeTimeValue,
	//
	@FlyElement(name="Actual Quantity", description="The actual quantity", help="The Actual Quantity indicates the quantity as referenced on a document.", dataType=FlyDataType.Quantity, entityType="D", printName="Actual Qty", fieldLength=22)
	ActualQty,
	//
	@FlyElement(name="A_Curr_Dep_Exp", dataType=FlyDataType.Amount, entityType="D", printName="A_Curr_Dep_Exp", fieldLength=22)
	A_Curr_Dep_Exp,
	//
	@FlyElement(name="Current Period", dataType=FlyDataType.Integer, entityType="D", printName="Current Period", fieldLength=22)
	A_Current_Period,
	//
	@FlyElement(name="Access Log", description="Log of Access to the System", dataType=FlyDataType.ID, entityType="D", printName="Access Log", fieldLength=22)
	AD_AccessLog_ID,
	//
	@FlyElement(name="Alert", description="Adempiere Alert", help="Adempiere Alerts allow you define system conditions you want to be alerted of", dataType=FlyDataType.TableDirect, entityType="D", printName="Alert", fieldLength=22)
	AD_Alert_ID,
	//
	@FlyElement(name="Alert Processor", description="Alert Processor/Server Parameter", help="Alert Processor/Server Parameter", dataType=FlyDataType.TableDirect, entityType="D", printName="Alert Processor", fieldLength=22)
	AD_AlertProcessor_ID,
	//
	@FlyElement(name="Alert Processor Log", description="Result of the execution of the Alert Processor", help="Result of the execution of the Alert Processor", dataType=FlyDataType.ID, entityType="D", printName="Alert Processor Log", fieldLength=22)
	AD_AlertProcessorLog_ID,
	//
	@FlyElement(name="Alert Recipient", description="Recipient of the Alert Notification", help="You can send the notifications to users or roles", dataType=FlyDataType.ID, entityType="D", printName="Alert Recipient", fieldLength=22)
	AD_AlertRecipient_ID,
	//
	@FlyElement(name="Alert Rule", description="Definition of the alert element", dataType=FlyDataType.ID, entityType="D", printName="Alert Rule", fieldLength=22)
	AD_AlertRule_ID,
	//
	@FlyElement(name="Archive", description="Document and Report Archive", help="Depending on the Client Automatic Archive Level documents and reports are saved and available for view.", dataType=FlyDataType.ID, entityType="D", printName="Archive", fieldLength=22)
	AD_Archive_ID,
	//
	@FlyElement(name="Attachment", description="Attachment for the document", help="Attachment can be of any document/file type and can be attached to any record in the system.", dataType=FlyDataType.ID, entityType="D", printName="Attachment", fieldLength=22)
	AD_Attachment_ID,
	//
	@FlyElement(name="Attachment Note", description="Personal Attachment Note", dataType=FlyDataType.ID, entityType="D", printName="Attachment Note", fieldLength=22)
	AD_AttachmentNote_ID,
	//
	@FlyElement(name="System Attribute", dataType=FlyDataType.ID, entityType="D", printName="Attribute", fieldLength=22)
	AD_Attribute_ID,
	//
	@FlyElement(name="Backup", dataType=FlyDataType.ID, entityType="D", printName="Backup", fieldLength=22)
	AD_Backup_ID,
	//
	@FlyElement(name="Browse Field", dataType=FlyDataType.ID, entityType="EE07", printName="Browse Field", fieldLength=22)
	AD_Browse_Field_ID,
	//
	@FlyElement(name="Smart Browse", dataType=FlyDataType.TableDirect, entityType="EE07", printName="Smart Browse", fieldLength=22)
	AD_Browse_ID,
	//
	@FlyElement(name="Change Log", description="Log of data changes", help="Log of data changes", dataType=FlyDataType.ID, entityType="D", printName="Change Log", fieldLength=22)
	AD_ChangeLog_ID,
	//
	@FlyElement(name="Chart Datasource", dataType=FlyDataType.ID, entityType="D", printName="Chart Datasource", fieldLength=22)
	AD_ChartDatasource_ID,
	//
	@FlyElement(name="Chart", dataType=FlyDataType.ID, entityType="D", printName="Chart", fieldLength=22)
	AD_Chart_ID,
	//
	@FlyElement(name="Client", description="Client/Tenant for this installation.", help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.", dataType=FlyDataType.TableDirect, entityType="D", printName="Client", fieldLength=22)
	AD_Client_ID,
	//
	@FlyElement(name="Client Share", description="Force (not) sharing of client/org entities", help="For entities with data access level of Client+Organization either force to share the entries or not. Example: Product and Business Partner can be either defined on Client level (shared) or on Org level (not shared).  You can define here of Products are always shared (i.e. always created under Organization '*') or if they are not shared (i.e. you cannot enter them with Organization '*')", dataType=FlyDataType.ID, entityType="D", printName="Client Share", fieldLength=10)
	AD_ClientShare_ID,
	//
	@FlyElement(name="System Color", description="Color for backgrounds or indicators", dataType=FlyDataType.ID, entityType="D", printName="Color", fieldLength=22)
	AD_Color_ID,
	//
	@FlyElement(name="Column", description="Column in the table", help="Link to the database column of the table", dataType=FlyDataType.ID, entityType="D", printName="Column", fieldLength=22)
	AD_Column_ID,
	//
	@FlyElement(name="Column Link Process", dataType=FlyDataType.NONE, entityType="D", printName="Column Link Process", fieldLength=0)
	AD_ColumnProcess_ID,
	//
	@FlyElement(name="Link Process Parameter", dataType=FlyDataType.NONE, entityType="D", printName="Link Process Parameter", fieldLength=0)
	AD_ColumnProcessPara_ID,
	//
	@FlyElement(name="Order Column", description="Column determining the order", help="Integer Column of the table determining the order (display, sort, ..). If defined, the Order By replaces the default Order By clause. It should be fully qualified (i.e. 'tablename.columnname').", dataType=FlyDataType.Table, entityType="D", printName="Order Column", fieldLength=22)
	AD_ColumnSortOrder_ID,
	//
	@FlyElement(name="Included Column", description="Column determining if a Table Column is included in Ordering", help="If a Included Column is defined, it decides, if a column is active in the ordering - otherwise it is determined that the Order Column has a value of one or greater", dataType=FlyDataType.Table, entityType="D", printName="Included Column", fieldLength=22)
	AD_ColumnSortYesNo_ID,
	//
	@FlyElement(name="Desktop", description="Collection of Workbenches", dataType=FlyDataType.ID, entityType="D", printName="Desktop", fieldLength=22)
	AD_Desktop_ID,
	//
	@FlyElement(name="Desktop Workbench", dataType=FlyDataType.ID, entityType="D", printName="Desktop Workbench", fieldLength=22)
	AD_DesktopWorkbench_ID,
	//
	@FlyElement(name="Display column", description="Column that will display", help="The Display Column indicates the column that will display.", dataType=FlyDataType.Table, entityType="D", printName="Display column", fieldLength=22)
	AD_Display,
	//
	@FlyElement(name="Address 1", description="Address line 1 for this location", help="The Address 1 identifies the address for an entity's location", dataType=FlyDataType.String, entityType="D", printName="Address 1", fieldLength=60)
	Address1,
	//
	@FlyElement(name="Address 2", description="Address line 2 for this location", help="The Address 2 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="Address 2", fieldLength=60)
	Address2,
	//
	@FlyElement(name="Address 3", description="Address Line 3 for the location", help="The Address 2 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="Address 3", fieldLength=60)
	Address3,
	//
	@FlyElement(name="Address 4", description="Address Line 4 for the location", help="The Address 4 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="Address 4", fieldLength=60)
	Address4,
	//
	@FlyElement(name="System Element", description="System Element enables the central maintenance of column description and help.", help="The System Element allows for the central maintenance of help, descriptions and terminology for a database column.", dataType=FlyDataType.ID, entityType="D", printName="Element", fieldLength=22)
	AD_Element_ID,
	//
	@FlyElement(name="EMail Configuration", dataType=FlyDataType.TableDirect, entityType="D", printName="EMail Configuration", fieldLength=10)
	AD_EMailConfig_ID,
	//
	@FlyElement(name="Entity Type", description="System Entity Type", help="The entity type determines the ownership of Application Dictionary entries.  The types 'Dictionary' and 'Adempiere' should not be used and are maintained by Adempiere (i.e. all changes are reversed during migration to the current definition).", dataType=FlyDataType.ID, entityType="D", printName="Entity Type", fieldLength=10)
	AD_EntityType_ID,
	//
	@FlyElement(name="Depreciation Account", dataType=FlyDataType.Account, entityType="D", printName="Depreciation Account", fieldLength=40)
	A_Depreciation_Acct,
	//
	@FlyElement(name="New Depreciation Exp Acct", dataType=FlyDataType.Account, entityType="D", printName="New Depreciation Exp Acct", fieldLength=22)
	A_Depreciation_Acct_New,
	//
	@FlyElement(name="A_Depreciation_Acct_Str", dataType=FlyDataType.String, entityType="D", printName="A_Depreciation_Acct_Str", fieldLength=40)
	A_Depreciation_Acct_Str,
	//
	@FlyElement(name="Build Depreciation", dataType=FlyDataType.ID, entityType="D", printName="Build Depreciation", fieldLength=22)
	A_Depreciation_Build_ID,
	//
	@FlyElement(name="Calculation Type", dataType=FlyDataType.Table, entityType="D", printName="Calculation Type", fieldLength=10)
	A_Depreciation_Calc_Type,
	//
	@FlyElement(name="Depreciation Convention", dataType=FlyDataType.ID, entityType="D", printName="Depreciation Convention", fieldLength=22)
	A_Depreciation_Convention_ID,
	//
	@FlyElement(name="Depreciation Convention (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Convention (fiscal)", fieldLength=0)
	A_Depreciation_Conv_F_ID,
	//
	@FlyElement(name="Convention Type", dataType=FlyDataType.Table, entityType="D", printName="Convention Type", fieldLength=10)
	A_Depreciation_Conv_ID,
	//
	@FlyElement(name="Depreciation Entry", dataType=FlyDataType.ID, entityType="D", printName="Depreciation Entry", fieldLength=22)
	A_Depreciation_Entry_ID,
	//
	@FlyElement(name="A_Depreciation_Exp_ID", dataType=FlyDataType.Integer, entityType="D", printName="A_Depreciation_Exp_ID", fieldLength=22)
	A_Depreciation_Exp_ID,
	//
	@FlyElement(name="Depreciation (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation (fiscal)", fieldLength=0)
	A_Depreciation_F_ID,
	//
	@FlyElement(name="Depreciation Forecast", dataType=FlyDataType.Integer, entityType="D", printName="Depreciation Forecast", fieldLength=22)
	A_Depreciation_Forecast_ID,
	//
	@FlyElement(name="Depreciation", dataType=FlyDataType.ID, entityType="D", printName="Depreciation", fieldLength=22)
	A_Depreciation_ID,
	//
	@FlyElement(name="A_Depreciation_Manual_Amount", dataType=FlyDataType.Amount, entityType="D", printName="A_Depreciation_Manual_Amount", fieldLength=22)
	A_Depreciation_Manual_Amount,
	//
	@FlyElement(name="A_Depreciation_Manual_Period", dataType=FlyDataType.List, entityType="D", printName="A_Depreciation_Manual_Period", fieldLength=2)
	A_Depreciation_Manual_Period,
	//
	@FlyElement(name="Depreciation Method (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Method (fiscal)", fieldLength=0)
	A_Depreciation_Method_F_ID,
	//
	@FlyElement(name="Depreciation Method", dataType=FlyDataType.ID, entityType="D", printName="Depreciation Method", fieldLength=10)
	A_Depreciation_Method_ID,
	//
	@FlyElement(name="Depreciation Acct (new)", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Acct (new)", fieldLength=0)
	A_Depreciation_New_Acct,
	//
	@FlyElement(name="Rate", dataType=FlyDataType.Number, entityType="D", printName="Rate", fieldLength=22)
	A_Depreciation_Rate,
	//
	@FlyElement(name="Depreciation Code", dataType=FlyDataType.String, entityType="D", printName="Depreciation Code", fieldLength=20)
	A_Depreciation_Table_Code,
	//
	@FlyElement(name="Depreciation Table Detail", dataType=FlyDataType.ID, entityType="D", printName="Depreciation Table Detail", fieldLength=22)
	A_Depreciation_Table_Detail_ID,
	//
	@FlyElement(name="A_Depreciation_Table_Header_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Depreciation_Table_Header_ID", fieldLength=22)
	A_Depreciation_Table_Header_ID,
	//
	@FlyElement(name="Variable Percent", dataType=FlyDataType.Number, entityType="D", printName="Variable Percent", fieldLength=22)
	A_Depreciation_Variable_Perc,
	//
	@FlyElement(name="Variable Percent (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Variable Percent (fiscal)", fieldLength=0)
	A_Depreciation_Variable_Perc_F,
	//
	@FlyElement(name="A_Depreciation_Workfile_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Depreciation_Workfile_ID", fieldLength=22)
	A_Depreciation_Workfile_ID,
	//
	@FlyElement(name="Error", dataType=FlyDataType.ID, entityType="D", printName="Error", fieldLength=22)
	AD_Error_ID,
	//
	@FlyElement(name="Field Group", description="Logical grouping of fields", help="The Field Group indicates the logical group that this field belongs to (History, Amounts, Quantities)", dataType=FlyDataType.TableDirect, entityType="D", printName="Field Group", fieldLength=22)
	AD_FieldGroup_ID,
	//
	@FlyElement(name="Field", description="Field on a database table", help="The Field identifies a field on a database table.", dataType=FlyDataType.ID, entityType="D", printName="Field", fieldLength=22)
	AD_Field_ID,
	//
	@FlyElement(name="Find", dataType=FlyDataType.ID, entityType="D", printName="Find", fieldLength=22)
	AD_Find_ID,
	//
	@FlyElement(name="Special Form", description="Special Form", help="The Special Form field identifies a unique Special Form in the system.", dataType=FlyDataType.ID, entityType="D", printName="Special Form", fieldLength=22)
	AD_Form_ID,
	//
	@FlyElement(name="House Keeping Configuration", dataType=FlyDataType.ID, entityType="D", printName="House Keeping Configuration", fieldLength=22)
	AD_HouseKeeping_ID,
	//
	@FlyElement(name="Image", description="Image or Icon", help="Images and Icon can be used to display supported graphic formats (gif, jpg, png).	You can either load the image (in the database) or point to a graphic via a URI (i.e. it can point to a resource, http address)", dataType=FlyDataType.TableDirect, entityType="D", printName="Image", fieldLength=22)
	AD_Image_ID,
	//
	@FlyElement(name="Import Format", dataType=FlyDataType.ID, entityType="D", printName="Import Format", fieldLength=22)
	AD_ImpFormat_ID,
	//
	@FlyElement(name="Format Field", dataType=FlyDataType.ID, entityType="D", printName="Format Field", fieldLength=22)
	AD_ImpFormat_Row_ID,
	//
	@FlyElement(name="Info Column", description="Info Window Column", help="Column in the Info Window for display and/or selection.  If used for selection, the column cannot be a SQL expression. The SQL clause must be fully qualified based on the FROM clause in the Info Window definition", dataType=FlyDataType.ID, entityType="D", printName="Info Column", fieldLength=10)
	AD_InfoColumn_ID,
	//
	@FlyElement(name="Info Window", description="Info and search/select Window", help="The Info window is used to search and select records as well as display information relevant to the selection.", dataType=FlyDataType.ID, entityType="D", printName="Info Window", fieldLength=10)
	AD_InfoWindow_ID,
	//
	@FlyElement(name="Disposal Amount", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Amt", fieldLength=0)
	A_Disposal_Amt,
	//
	@FlyElement(name="Disposal Gain", dataType=FlyDataType.Account, entityType="D", printName="Disposal Gain", fieldLength=10)
	A_Disposal_Gain,
	//
	@FlyElement(name="Disposal Gain Acct", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Gain Acct", fieldLength=0)
	A_Disposal_Gain_Acct,
	//
	@FlyElement(name="Loss on Disposal", dataType=FlyDataType.Account, entityType="D", printName="Loss on Disposal", fieldLength=40)
	A_Disposal_Loss,
	//
	@FlyElement(name="Disposal Loss Acct", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Loss Acct", fieldLength=0)
	A_Disposal_Loss_Acct,
	//
	@FlyElement(name="New Disposal Loss", dataType=FlyDataType.Account, entityType="D", printName="New Disposal Loss", fieldLength=22)
	A_Disposal_Loss_New,
	//
	@FlyElement(name="Disposal Loss Acct (new)", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Loss Acct (new)", fieldLength=0)
	A_Disposal_Loss_New_Acct,
	//
	@FlyElement(name="Disposal Loss Str", dataType=FlyDataType.String, entityType="D", printName="Disposal Loss Str", fieldLength=40)
	A_Disposal_Loss_Str,
	//
	@FlyElement(name="Disposal Revenue", dataType=FlyDataType.Account, entityType="D", printName="Disposal Revenue", fieldLength=40)
	A_Disposal_Revenue,
	//
	@FlyElement(name="Disposal Revenue Acct", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Revenue Acct", fieldLength=0)
	A_Disposal_Revenue_Acct,
	//
	@FlyElement(name="New Disposal Revenue", dataType=FlyDataType.Account, entityType="D", printName="New Disposal Revenue", fieldLength=22)
	A_Disposal_Revenue_New,
	//
	@FlyElement(name="Disposal Revenue Acct (new)", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Revenue Acct (new)", fieldLength=0)
	A_Disposal_Revenue_New_Acct,
	//
	@FlyElement(name="Disposal Revenue Str", dataType=FlyDataType.String, entityType="D", printName="Disposal Revenue Str", fieldLength=40)
	A_Disposal_Revenue_Str,
	//
	@FlyElement(name="Disposed Date", dataType=FlyDataType.Date, entityType="D", printName="Disposed Date", fieldLength=7)
	A_Disposed_Date,
	//
	@FlyElement(name="Disposed Method", dataType=FlyDataType.List, entityType="D", printName="Disposed Method", fieldLength=10)
	A_Disposed_Method,
	//
	@FlyElement(name="Disposed Reason", dataType=FlyDataType.List, entityType="D", printName="Disposed Reason", fieldLength=10)
	A_Disposed_Reason,
	//
	@FlyElement(name="System Issue", description="Automatically created or manually entered System Issue", help="System Issues are created to speed up the resolution of any system related issues (potential bugs).  If enabled, they are automatically reported to Adempiere.  No data or confidential information is transferred.", dataType=FlyDataType.ID, entityType="D", printName="System Issue", fieldLength=10)
	AD_Issue_ID,
	//
	@FlyElement(name="Adjacent Holidays Type", description="Adjacent Holidays Type", help="The Adjacent Holidays Type", dataType=FlyDataType.List, entityType="EE02", printName="Adjacent Holidays Type", fieldLength=0)
	AdjacentHolidayType,
	//
	@FlyElement(name="Key column", description="Unique identifier of a record", help="The Key Column indicates that this the unique identifier of a record on this table.", dataType=FlyDataType.Table, entityType="D", printName="Key column", fieldLength=22)
	AD_Key,
	//
	@FlyElement(name="Label printer Function", description="Function of Label Printer", dataType=FlyDataType.TableDirect, entityType="D", printName="Label printer Function", fieldLength=22)
	AD_LabelPrinterFunction_ID,
	//
	@FlyElement(name="Label printer", description="Label Printer Definition", dataType=FlyDataType.ID, entityType="D", printName="Label printer", fieldLength=22)
	AD_LabelPrinter_ID,
	//
	@FlyElement(name="Language", description="Language for this entity", help="The Language identifies the language to use for display and formatting", dataType=FlyDataType.Table, entityType="D", printName="Language", fieldLength=6)
	AD_Language,
	//
	@FlyElement(name="Language ID", dataType=FlyDataType.ID, entityType="D", printName="Language ID", fieldLength=22)
	AD_Language_ID,
	//
	@FlyElement(name="Ldap Access", description="Ldap Access Log", help="Access via LDAP", dataType=FlyDataType.ID, entityType="D", printName="Ldap Access", fieldLength=10)
	AD_LdapAccess_ID,
	//
	@FlyElement(name="Ldap Processor", description="LDAP Server to authenticate and authorize external systems based on Adempiere", help="The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authenticate and authorize them.  There is only one server per Adempiere system.  The 'o' is the Client key and the optional 'ou' is the Interest Area key.", dataType=FlyDataType.ID, entityType="D", printName="Ldap Processor", fieldLength=10)
	AD_LdapProcessor_ID,
	//
	@FlyElement(name="Ldap Processor Log", description="LDAP Server Log", dataType=FlyDataType.ID, entityType="D", printName="Ldap Log", fieldLength=10)
	AD_LdapProcessorLog_ID,
	//
	@FlyElement(name="Memo", dataType=FlyDataType.NONE, entityType="D", printName="Memo", fieldLength=0)
	AD_Memo_ID,
	//
	@FlyElement(name="Menu", description="Identifies a Menu", help="The Menu identifies a unique Menu.  Menus are used to control the display of those screens a user has access to.", dataType=FlyDataType.ID, entityType="D", printName="Menu", fieldLength=22)
	AD_Menu_ID,
	//
	@FlyElement(name="Message", description="System Message", help="Information and Error messages", dataType=FlyDataType.ID, entityType="D", printName="Message", fieldLength=22)
	AD_Message_ID,
	//
	@FlyElement(name="Migration data", dataType=FlyDataType.NONE, entityType="D", printName="Migration data", fieldLength=0)
	AD_MigrationData_ID,
	//
	@FlyElement(name="Migration", description="Migration change management.", help="Migration change management.", dataType=FlyDataType.NONE, entityType="D", printName="Migration", fieldLength=0)
	AD_Migration_ID,
	//
	@FlyElement(name="Migration Script", description="Table to check whether the migration script has been applied", dataType=FlyDataType.ID, entityType="D", printName="Migration Script", fieldLength=10)
	AD_MigrationScript_ID,
	//
	@FlyElement(name="Migration step", description="A single step in the migration process", dataType=FlyDataType.NONE, entityType="D", printName="Migration step", fieldLength=0)
	AD_MigrationStep_ID,
	//
	@FlyElement(name="Model Validator", dataType=FlyDataType.ID, entityType="D", printName="Model Validator", fieldLength=10)
	AD_ModelValidator_ID,
	//
	@FlyElement(name="Modification", description="System Modification or Extension", help="Description of the System modification or extension", dataType=FlyDataType.ID, entityType="D", printName="Modification", fieldLength=10)
	AD_Modification_ID,
	//
	@FlyElement(name="Notice", description="System Notice", dataType=FlyDataType.ID, entityType="D", printName="Notice", fieldLength=22)
	AD_Note_ID,
	//
	@FlyElement(name="Linked Organization", description="The Business Partner is another Organization for explicit Inter-Org transactions", help="The business partner is another organization in the system. So when performing transactions, the counter-document is created automatically. Example: You have BPartnerA linked to OrgA and BPartnerB linked to OrgB.  If you create a sales order for BPartnerB in OrgA a purchase order is created for BPartnerA in OrgB.  This allows to have explicit documents for Inter-Org transactions.", dataType=FlyDataType.Button, entityType="D", printName="Linked Org", fieldLength=22)
	AD_OrgBP_ID,
	//
	@FlyElement(name="Document Org", description="Document Organization (independent from account organization)", dataType=FlyDataType.Table, entityType="D", printName="Document Org", fieldLength=22)
	AD_OrgDoc_ID,
	//
	@FlyElement(name="Organization", description="Organizational entity within client", help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.", dataType=FlyDataType.TableDirect, entityType="D", printName="Organization", fieldLength=22)
	AD_Org_ID,
	//
	@FlyElement(name="Only Organization", description="Create posting entries only for this organization", help="When you have multiple accounting schema, you may want to restrict the generation of postings entries for the additional accounting schema (i.e. not for the primary).  Example: You have a US and a FR organization. The primary accounting schema is in USD, the second in EUR.  If for the EUR accounting schema, you select the FR organizations, you would not create accounting entries for the transactions of the US organization in EUR.", dataType=FlyDataType.Table, entityType="D", printName="Only Org", fieldLength=10)
	AD_OrgOnly_ID,
	//
	@FlyElement(name="Inter-Organization", description="Organization valid for intercompany documents", help="The Inter Organization field identifies an Organization which can be used by this Organization for intercompany documents.", dataType=FlyDataType.Table, entityType="D", printName="Inter-Organization", fieldLength=22)
	AD_OrgTo_ID,
	//
	@FlyElement(name="Trx Organization", description="Performing or initiating organization", help="The organization which performs or initiates this transaction (for another organization).  The owning Organization may not be the transaction organization in a service bureau environment, with centralized services, and inter-organization transactions.", dataType=FlyDataType.Table, entityType="D", printName="Trx Organization", fieldLength=22)
	AD_OrgTrx_ID,
	//
	@FlyElement(name="Organization Type", description="Organization Type", help="Organization Type allows you to categorize your organizations for reporting purposes", dataType=FlyDataType.TableDirect, entityType="D", printName="Org Type", fieldLength=22)
	AD_OrgType_ID,
	//
	@FlyElement(name="Original", dataType=FlyDataType.ID, entityType="D", printName="Original", fieldLength=22)
	AD_Original_ID,
	//
	@FlyElement(name="Update System Maintained Application Dictionary", dataType=FlyDataType.YesNo, entityType="D", printName="AD_Override_Dict", fieldLength=1)
	AD_Override_Dict,
	//
	@FlyElement(name="New Package Code", dataType=FlyDataType.Memo, entityType="D", printName="New Package Code", fieldLength=2000)
	AD_Package_Code_New,
	//
	@FlyElement(name="Old Package Code", dataType=FlyDataType.Memo, entityType="D", printName="Old Package Code", fieldLength=2000)
	AD_Package_Code_Old,
	//
	@FlyElement(name="Package Directory", description="Package directory, default to AdempiereHome/packages", dataType=FlyDataType.FilePath, entityType="D", printName="Package Directory", fieldLength=255)
	AD_Package_Dir,
	//
	@FlyElement(name="Common Package Exp.", dataType=FlyDataType.ID, entityType="D", printName="Common Package Exp.", fieldLength=10)
	AD_Package_Exp_Common_ID,
	//
	@FlyElement(name="Package Exp. Detail", dataType=FlyDataType.ID, entityType="D", printName="Package Exp. Detail", fieldLength=22)
	AD_Package_Exp_Detail_ID,
	//
	@FlyElement(name="Package Exp.", dataType=FlyDataType.ID, entityType="D", printName="Package Exp.", fieldLength=22)
	AD_Package_Exp_ID,
	//
	@FlyElement(name="Imp. Package Backup", dataType=FlyDataType.ID, entityType="D", printName="Imp. Package Backup", fieldLength=22)
	AD_Package_Imp_Backup_ID,
	//
	@FlyElement(name="Package Imp. Bck. Directory", dataType=FlyDataType.String, entityType="D", printName="Package Imp. Bck. Directory", fieldLength=255)
	AD_Package_Imp_Bck_Dir,
	//
	@FlyElement(name="Imp. Package Detail", dataType=FlyDataType.ID, entityType="D", printName="Imp. Package Detail", fieldLength=22)
	AD_Package_Imp_Detail_ID,
	//
	@FlyElement(name="Package Imp.", dataType=FlyDataType.ID, entityType="D", printName="Package Imp.", fieldLength=22)
	AD_Package_Imp_ID,
	//
	@FlyElement(name="Package Imp. Inst.", dataType=FlyDataType.ID, entityType="D", printName="Package Imp. Inst.", fieldLength=10)
	AD_Package_Imp_Inst_ID,
	//
	@FlyElement(name="Package Imp. Org. Dir.", dataType=FlyDataType.String, entityType="D", printName="Package Imp. Org. Dir.", fieldLength=255)
	AD_Package_Imp_Org_Dir,
	//
	@FlyElement(name="Package Imp. Proc.", dataType=FlyDataType.ID, entityType="D", printName="Package Imp. Proc.", fieldLength=10)
	AD_Package_Imp_Proc_ID,
	//
	@FlyElement(name="Package Source", description="Fully qualified package source file name", dataType=FlyDataType.FileName, entityType="D", printName="Package Source", fieldLength=255)
	AD_Package_Source,
	//
	@FlyElement(name="Package Source Type", description="Type of package source - file, ftp, webservice etc", dataType=FlyDataType.List, entityType="D", printName="Package Source Type", fieldLength=10)
	AD_Package_Source_Type,
	//
	@FlyElement(name="Package Type", dataType=FlyDataType.List, entityType="D", printName="Package Type", fieldLength=1)
	AD_Package_Type,
	//
	@FlyElement(name="Process Instance", description="Instance of the process", dataType=FlyDataType.ID, entityType="D", printName="Process Instance", fieldLength=22)
	AD_PInstance_ID,
	//
	@FlyElement(name="Log", dataType=FlyDataType.ID, entityType="D", printName="Log", fieldLength=22)
	AD_PInstance_Log_ID,
	//
	@FlyElement(name="Preference", description="Personal Value Preference", dataType=FlyDataType.ID, entityType="D", printName="Preference", fieldLength=22)
	AD_Preference_ID,
	//
	@FlyElement(name="Color 1", description="First color used", dataType=FlyDataType.Table, entityType="D", printName="Color 1", fieldLength=10)
	AD_PrintColor1_ID,
	//
	@FlyElement(name="Color 2", description="Second color used", dataType=FlyDataType.Table, entityType="D", printName="Color 2", fieldLength=10)
	AD_PrintColor2_ID,
	//
	@FlyElement(name="Color 3", description="Third color used", dataType=FlyDataType.Table, entityType="D", printName="Color 3", fieldLength=10)
	AD_PrintColor3_ID,
	//
	@FlyElement(name="Color 4", description="Forth color used", dataType=FlyDataType.Table, entityType="D", printName="Color 4", fieldLength=10)
	AD_PrintColor4_ID,
	//
	@FlyElement(name="Print Color", description="Color used for printing and display", help="Colors used for printing and display", dataType=FlyDataType.TableDirect, entityType="D", printName="Print Color", fieldLength=22)
	AD_PrintColor_ID,
	//
	@FlyElement(name="Print Font", description="Maintain Print Font", help="Font used for printing", dataType=FlyDataType.TableDirect, entityType="D", printName="Print Font", fieldLength=22)
	AD_PrintFont_ID,
	//
	@FlyElement(name="Included Print Format", description="Print format that is included here.", help="Included Print formats allow to e.g. Lines to Header records. The Column provides the parent link.", dataType=FlyDataType.Table, entityType="D", printName="Included Print Format", fieldLength=22)
	AD_PrintFormatChild_ID,
	//
	@FlyElement(name="Header Print Format", dataType=FlyDataType.NONE, entityType="D", printName="Header Print Format", fieldLength=0)
	AD_PrintFormatHeader_ID,
	//
	@FlyElement(name="Print Format", description="Data Print Format", help="The print format determines how data is rendered for print.", dataType=FlyDataType.TableDirect, entityType="D", printName="Print Format", fieldLength=22)
	AD_PrintFormat_ID,
	//
	@FlyElement(name="Print Format Item", description="Item/Column in the Print format", help="Item/Column in the print format maintaining layout information", dataType=FlyDataType.ID, entityType="D", printName="Print Format Item", fieldLength=22)
	AD_PrintFormatItem_ID,
	//
	@FlyElement(name="Print Form", description="Form", dataType=FlyDataType.ID, entityType="D", printName="Print Form", fieldLength=22)
	AD_PrintForm_ID,
	//
	@FlyElement(name="Graph", description="Graph included in Reports", help="Pie/Line Graph to be printed in Reports", dataType=FlyDataType.ID, entityType="D", printName="Graph", fieldLength=22)
	AD_PrintGraph_ID,
	//
	@FlyElement(name="Print Label", description="Label Format to print", help="Format for printing Labels", dataType=FlyDataType.TableDirect, entityType="D", printName="Print Label ", fieldLength=22)
	AD_PrintLabel_ID,
	//
	@FlyElement(name="Print Label Line", description="Print Label Line Format", help="Format of the line on a Label", dataType=FlyDataType.TableDirect, entityType="D", printName="Label Line", fieldLength=22)
	AD_PrintLabelLine_ID,
	//
	@FlyElement(name="Print Paper", description="Printer paper definition", help="Printer Paper Size, Orientation and Margins", dataType=FlyDataType.ID, entityType="D", printName="Print Paper", fieldLength=22)
	AD_PrintPaper_ID,
	//
	@FlyElement(name="Print Table Format", description="Table Format in Reports", help="Print Table Format determines Fonts, Colors of  the printed Table", dataType=FlyDataType.ID, entityType="D", printName="Table Format", fieldLength=22)
	AD_PrintTableFormat_ID,
	//
	@FlyElement(name="Process", description="Process or Report", help="The Process field identifies a unique Process or Report in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="Process", fieldLength=22)
	AD_Process_ID,
	//
	@FlyElement(name="Process Parameter", dataType=FlyDataType.ID, entityType="D", printName="Process Parameter", fieldLength=22)
	AD_Process_Para_ID,
	//
	@FlyElement(name="Recent Item", dataType=FlyDataType.NONE, entityType="D", printName="Recent Item", fieldLength=0)
	AD_RecentItem_ID,
	//
	@FlyElement(name="Reference", description="System Reference and Validation", help="The Reference could be a display type, list or table validation.", dataType=FlyDataType.ID, entityType="D", printName="Reference", fieldLength=22)
	AD_Reference_ID,
	//
	@FlyElement(name="Source Reference", dataType=FlyDataType.Table, entityType="D", printName="Source Reference", fieldLength=10)
	AD_Reference_Source_ID,
	//
	@FlyElement(name="Target Reference", dataType=FlyDataType.Table, entityType="D", printName="Target Reference", fieldLength=10)
	AD_Reference_Target_ID,
	//
	@FlyElement(name="Reference Key", description="Required to specify, if data type is Table or List", help="The Reference Value indicates where the reference values are stored.  It must be specified if the data type is Table or List.  ", dataType=FlyDataType.Table, entityType="D", printName="Reference Key", fieldLength=22)
	AD_Reference_Value_ID,
	//
	@FlyElement(name="Reference List", description="Reference List based on Table", help="The Reference List field indicates a list of reference values from a database tables.  Reference lists populate drop down list boxes in data entry screens", dataType=FlyDataType.ID, entityType="D", printName="Reference List", fieldLength=22)
	AD_Ref_List_ID,
	//
	@FlyElement(name="System Registration", description="System Registration", help="The System Registration helps Adempiere to help the installed base", dataType=FlyDataType.ID, entityType="D", printName="Registration", fieldLength=22)
	AD_Registration_ID,
	//
	@FlyElement(name="Relation Type", dataType=FlyDataType.ID, entityType="D", printName="Relation Type", fieldLength=22)
	AD_RelationType_ID,
	//
	@FlyElement(name="Replication Document", dataType=FlyDataType.ID, entityType="EE05", printName="Replication Document", fieldLength=22)
	AD_ReplicationDocument_ID,
	//
	@FlyElement(name="Replication", description="Data Replication Target", help="Data Replication Target Details. Maintained on the central server.", dataType=FlyDataType.TableDirect, entityType="D", printName="Replication", fieldLength=22)
	AD_Replication_ID,
	//
	@FlyElement(name="Replication Log", description="Data Replication Log Details", help="Data Replication Run Log", dataType=FlyDataType.ID, entityType="D", printName="Replication Log", fieldLength=22)
	AD_Replication_Log_ID,
	//
	@FlyElement(name="Replication Organization Access ID", dataType=FlyDataType.NONE, entityType="EE05", printName="Replication Organization Access ID", fieldLength=0)
	AD_ReplicationOrgAccess_ID,
	//
	@FlyElement(name="Replication Role Access ID", dataType=FlyDataType.NONE, entityType="EE05", printName="Replication Role Access ID", fieldLength=0)
	AD_ReplicationRoleAccess_ID,
	//
	@FlyElement(name="Replication Run", description="Data Replication Run", help="Data Replication Run information", dataType=FlyDataType.ID, entityType="D", printName="Replication Run", fieldLength=22)
	AD_Replication_Run_ID,
	//
	@FlyElement(name="Replication Strategy", description="Data Replication Strategy", help="The Data Replication Strategy determines what and how tables are replicated ", dataType=FlyDataType.TableDirect, entityType="D", printName="Replication Strategy", fieldLength=22)
	AD_ReplicationStrategy_ID,
	//
	@FlyElement(name="Replication Table", description="Data Replication Strategy Table Info", help="Determines how the table is replicated", dataType=FlyDataType.ID, entityType="D", printName="Replication Table", fieldLength=22)
	AD_ReplicationTable_ID,
	//
	@FlyElement(name="Report view Column", dataType=FlyDataType.ID, entityType="D", printName="Report view Column", fieldLength=22)
	AD_ReportView_Col_ID,
	//
	@FlyElement(name="Report View", description="View used to generate this report", help="The Report View indicates the view used to generate this report.", dataType=FlyDataType.TableDirect, entityType="D", printName="Report View", fieldLength=22)
	AD_ReportView_ID,
	//
	@FlyElement(name="Role", description="Responsibility Role", help="The Role determines security and access a user who has this Role will have in the System.", dataType=FlyDataType.ID, entityType="D", printName="Role", fieldLength=22)
	AD_Role_ID,
	//
	@FlyElement(name="Rule", dataType=FlyDataType.ID, entityType="D", printName="Rule", fieldLength=22)
	AD_Rule_ID,
	//
	@FlyElement(name="Scheduler", description="Schedule Processes", help="Schedule processes to be executed asynchronously", dataType=FlyDataType.TableDirect, entityType="D", printName="Scheduler", fieldLength=22)
	AD_Scheduler_ID,
	//
	@FlyElement(name="Scheduler Log", description="Result of the execution of the Scheduler", help="Result of the execution of the Scheduler", dataType=FlyDataType.ID, entityType="D", printName="Scheduler Log", fieldLength=22)
	AD_SchedulerLog_ID,
	//
	@FlyElement(name="Scheduler Recipient", description="Recipient of the Scheduler Notification", help="You can send the notifications to users or roles", dataType=FlyDataType.ID, entityType="D", printName="Scheduler Recipient", fieldLength=22)
	AD_SchedulerRecipient_ID,
	//
	@FlyElement(name="Search Definition", dataType=FlyDataType.ID, entityType="D", printName="Search Definition", fieldLength=22)
	AD_SearchDefinition_ID,
	//
	@FlyElement(name="Sequence", description="Document Sequence", help="The Sequence defines the numbering sequence to be used for documents.", dataType=FlyDataType.ID, entityType="D", printName="Sequence", fieldLength=22)
	AD_Sequence_ID,
	//
	@FlyElement(name="Session", description="User Session Online or Web", help="Online or Web Session Information", dataType=FlyDataType.ID, entityType="D", printName="Session", fieldLength=22)
	AD_Session_ID,
	//
	@FlyElement(name="System Configurator", dataType=FlyDataType.ID, entityType="D", printName="System Configurator", fieldLength=10)
	AD_SysConfig_ID,
	//
	@FlyElement(name="System", description="System Definition", help="Common System Definition", dataType=FlyDataType.ID, entityType="D", printName="System", fieldLength=22)
	AD_System_ID,
	//
	@FlyElement(name="Tab", description="Tab within a Window", help="The Tab indicates a tab that displays within a window.", dataType=FlyDataType.ID, entityType="D", printName="Tab", fieldLength=22)
	AD_Tab_ID,
	//
	@FlyElement(name="Table", description="Database Table information", help="The Database Table provides the information of the table definition", dataType=FlyDataType.ID, entityType="D", printName="Table", fieldLength=22)
	AD_Table_ID,
	//
	@FlyElement(name="Table Script Validator", dataType=FlyDataType.ID, entityType="D", printName="Table Script Validator", fieldLength=22)
	AD_Table_ScriptValidator_ID,
	//
	@FlyElement(name="OS Task", description="Operation System Task", help="The Task field identifies a Operation System Task in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="OS Task", fieldLength=22)
	AD_Task_ID,
	//
	@FlyElement(name="Task Instance", dataType=FlyDataType.ID, entityType="D", printName="Task Instance", fieldLength=22)
	AD_TaskInstance_ID,
	//
	@FlyElement(name="Advertisement Text", description="Text of the Advertisement", help="The text of the advertisement with optional HTML tags. The HTML tags are not checked for correctness and may impact the remaining page.", dataType=FlyDataType.Memo, entityType="D", printName="Ad Text", fieldLength=2000)
	AdText,
	//
	@FlyElement(name="Account Tree", description="Tree for Natural Account Tree", dataType=FlyDataType.Table, entityType="D", printName="Account Tree", fieldLength=10)
	AD_Tree_Account_ID,
	//
	@FlyElement(name="Activity Tree", description="Trees are used for (financial) reporting", help="Trees are used for (finanial) reporting", dataType=FlyDataType.Table, entityType="D", printName="Activity Tree", fieldLength=22)
	AD_Tree_Activity_ID,
	//
	@FlyElement(name="BPartner Tree", description="Trees are used for (financial) reporting", help="Trees are used for (finanial) reporting", dataType=FlyDataType.Table, entityType="D", printName="BPartner Tree", fieldLength=22)
	AD_Tree_BPartner_ID,
	//
	@FlyElement(name="Campaign Tree", description="Trees are used for (financial) reporting", help="Trees are used for (finanial) reporting", dataType=FlyDataType.Table, entityType="D", printName="Campaign Tree", fieldLength=22)
	AD_Tree_Campaign_ID,
	//
	@FlyElement(name="Container Tree", description="Container Tree", help="Container Tree", dataType=FlyDataType.Table, entityType="D", printName="Container Tree", fieldLength=10)
	AD_TreeCMC_ID,
	//
	@FlyElement(name="Media Tree", description="Media Tree", help="Media Tree", dataType=FlyDataType.Table, entityType="D", printName="Media Tree", fieldLength=10)
	AD_TreeCMM_ID,
	//
	@FlyElement(name="Stage Tree", description="Stage Tree", help="Stage Tree", dataType=FlyDataType.Table, entityType="D", printName="Stage Tree", fieldLength=10)
	AD_TreeCMS_ID,
	//
	@FlyElement(name="Template Tree", description="Template Tree", help="Template Tree", dataType=FlyDataType.Table, entityType="D", printName="Template Tree", fieldLength=10)
	AD_TreeCMT_ID,
	//
	@FlyElement(name="Tree Favorite ID", dataType=FlyDataType.NONE, entityType="D", printName="Tree Favorite ID", fieldLength=0)
	AD_Tree_Favorite_ID,
	//
	@FlyElement(name="Tree Favorite Node ID", dataType=FlyDataType.NONE, entityType="D", printName="Tree Favorite Node ID", fieldLength=0)
	AD_Tree_Favorite_Node_ID,
	//
	@FlyElement(name="Tree", description="Identifies a Tree", help="The Tree field identifies a unique Tree in the system. Trees define roll ups or summary levels of information.  They are used in reports for defining report points and summarization levels.", dataType=FlyDataType.TableDirect, entityType="D", printName="Tree", fieldLength=22)
	AD_Tree_ID,
	//
	@FlyElement(name="Menu Tree", description="Tree of the menu", help="Menu access tree", dataType=FlyDataType.Table, entityType="D", printName="Menu Tree", fieldLength=22)
	AD_Tree_Menu_ID,
	//
	@FlyElement(name="Organization Tree", description="Trees are used for (financial) reporting and security access (via role)", help="Trees are used for (finanial) reporting and security access (via role)", dataType=FlyDataType.Table, entityType="D", printName="Organization Tree", fieldLength=22)
	AD_Tree_Org_ID,
	//
	@FlyElement(name="Product Tree", description="Trees are used for (financial) reporting", help="Trees are used for (finanial) reporting", dataType=FlyDataType.Table, entityType="D", printName="Product Tree", fieldLength=22)
	AD_Tree_Product_ID,
	//
	@FlyElement(name="Project Tree", description="Trees are used for (financial) reporting", help="Trees are used for (finanial) reporting", dataType=FlyDataType.Table, entityType="D", printName="Project Tree", fieldLength=22)
	AD_Tree_Project_ID,
	//
	@FlyElement(name="Sales Region Tree", description="Trees are used for (financial) reporting", help="Trees are used for (finanial) reporting", dataType=FlyDataType.Table, entityType="D", printName="Sales Region Tree", fieldLength=22)
	AD_Tree_SalesRegion_ID,
	//
	@FlyElement(name="Asset Due On", dataType=FlyDataType.List, entityType="D", printName="Asset Due On", fieldLength=22)
	A_Due_On,
	//
	@FlyElement(name="User BP Access", description="User/contact access to Business Partner information and resources", help="If on User level, 'Full BP Access' is NOT selected, you need to give access explicitly here. ", dataType=FlyDataType.ID, entityType="D", printName="User BP Access", fieldLength=10)
	AD_UserBPAccess_ID,
	//
	@FlyElement(name="User defined Field", dataType=FlyDataType.ID, entityType="D", printName="User Field", fieldLength=22)
	AD_UserDef_Field_ID,
	//
	@FlyElement(name="User defined Tab", dataType=FlyDataType.TableDirect, entityType="D", printName="User Tab", fieldLength=22)
	AD_UserDef_Tab_ID,
	//
	@FlyElement(name="User defined Window", dataType=FlyDataType.TableDirect, entityType="D", printName="User Win", fieldLength=22)
	AD_UserDef_Win_ID,
	//
	@FlyElement(name="User/Contact", description="User within the system - Internal or Business Partner Contact", help="The User identifies a unique user in the system. This could be an internal user or a business partner contact", dataType=FlyDataType.ID, entityType="D", printName="User", fieldLength=22)
	AD_User_ID,
	//
	@FlyElement(name="User Mail", description="Mail sent to the user", help="Archive of mails sent to users", dataType=FlyDataType.ID, entityType="D", printName="User Mail", fieldLength=10)
	AD_UserMail_ID,
	//
	@FlyElement(name="User Query", description="Saved User Query", dataType=FlyDataType.ID, entityType="D", printName="User Query", fieldLength=10)
	AD_UserQuery_ID,
	//
	@FlyElement(name="User Substitute", description="Substitute of the user", help="A user who can act for another user.", dataType=FlyDataType.ID, entityType="D", printName="User Substitute", fieldLength=22)
	AD_User_Substitute_ID,
	//
	@FlyElement(name="Dynamic Validation", description="Dynamic Validation Rule", help="These rules define how an entry is determined to valid. You can use variables for dynamic (context sensitive) validation.", dataType=FlyDataType.TableDirect, entityType="D", printName="Validation", fieldLength=22)
	AD_Val_Rule_ID,
	//
	@FlyElement(name="View Column", description="Column of View", dataType=FlyDataType.TableDirect, entityType="EE07", printName="View Column", fieldLength=22)
	AD_View_Column_ID,
	//
	@FlyElement(name="View Definition", description="The View Definition allow defined the tables for a view.", dataType=FlyDataType.ID, entityType="EE07", printName="View Definition", fieldLength=22)
	AD_View_Definition_ID,
	//
	@FlyElement(name="View", description="View allows you to create dynamic views of information from the dictionary application", help="These views can be based on tables and views of the dictionary application.", dataType=FlyDataType.TableDirect, entityType="EE07", printName="View", fieldLength=22)
	AD_View_ID,
	//
	@FlyElement(name="Workflow Activity", description="Workflow Activity", help="The Workflow Activity is the actual Workflow Node in a Workflow Process instance", dataType=FlyDataType.ID, entityType="D", printName="Wf Activity", fieldLength=22)
	AD_WF_Activity_ID,
	//
	@FlyElement(name="Workflow Activity Result", description="Result of the Workflow Process Activity", help="Activity Result of the execution of the Workflow Process Instance", dataType=FlyDataType.ID, entityType="D", printName="Wf Activity Result", fieldLength=22)
	AD_WF_ActivityResult_ID,
	//
	@FlyElement(name="Workflow Block", description="Workflow Transaction Execution Block", help="A workflow execution block is optional and allows all work to be performed in a single transaction. If one step (node activity) fails, the entire work is rolled back.", dataType=FlyDataType.ID, entityType="D", printName="Wf Block", fieldLength=22)
	AD_WF_Block_ID,
	//
	@FlyElement(name="Workflow Event Audit", description="Workflow Process Activity Event Audit Information", help="History of changes of the Workflow Process Activity", dataType=FlyDataType.ID, entityType="D", printName="Wf Event Audit", fieldLength=22)
	AD_WF_EventAudit_ID,
	//
	@FlyElement(name="Transition Condition", description="Workflow Node Transition Condition", help="Optional restriction of transition of one node to the next", dataType=FlyDataType.ID, entityType="D", printName="Condition", fieldLength=22)
	AD_WF_NextCondition_ID,
	//
	@FlyElement(name="Next Node", description="Next Node in workflow", help="The Next Node indicates the next step or task in this Workflow.", dataType=FlyDataType.Table, entityType="D", printName="Next Node", fieldLength=22)
	AD_WF_Next_ID,
	//
	@FlyElement(name="Node", description="Workflow Node (activity), step or process", help="The Workflow Node indicates a unique step or process in a Workflow.", dataType=FlyDataType.ID, entityType="D", printName="Node", fieldLength=22)
	AD_WF_Node_ID,
	//
	@FlyElement(name="Node Transition", description="Workflow Node Transition", help="The Next Nodes Tab defines the order or Nodes or Steps in a Workflow.", dataType=FlyDataType.ID, entityType="D", printName="Transition", fieldLength=22)
	AD_WF_NodeNext_ID,
	//
	@FlyElement(name="Workflow Node Parameter", description="Workflow Node Execution Parameter", help="Parameter for the execution of the Workflow Node", dataType=FlyDataType.ID, entityType="D", printName="Wf Node Parameter", fieldLength=22)
	AD_WF_Node_Para_ID,
	//
	@FlyElement(name="Workflow Process Data", description="Workflow Process Context", help="Context information of the workflow process and activity", dataType=FlyDataType.ID, entityType="D", printName="Wf Process Data", fieldLength=22)
	AD_WF_ProcessData_ID,
	//
	@FlyElement(name="Workflow Process", description="Actual Workflow Process Instance", help="Instance of a workflow execution", dataType=FlyDataType.TableDirect, entityType="D", printName="Wf Process", fieldLength=22)
	AD_WF_Process_ID,
	//
	@FlyElement(name="Workflow Responsible", description="Responsible for Workflow Execution", help="The ultimate responsibility for a workflow is with an actual user. The Workflow Responsible allows to define ways to find that actual User.", dataType=FlyDataType.TableDirect, entityType="D", printName="Wf Responsible", fieldLength=22)
	AD_WF_Responsible_ID,
	//
	@FlyElement(name="Window", description="Data entry or display window", help="The Window field identifies a unique Window in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="Window", fieldLength=22)
	AD_Window_ID,
	//
	@FlyElement(name="Workbench", description="Collection of windows, reports", dataType=FlyDataType.TableDirect, entityType="D", printName="Workbench", fieldLength=22)
	AD_Workbench_ID,
	//
	@FlyElement(name="Workbench Window", dataType=FlyDataType.ID, entityType="D", printName="Workbench Win", fieldLength=22)
	AD_WorkbenchWindow_ID,
	//
	@FlyElement(name="Workflow", description="Workflow or combination of tasks", help="The Workflow field identifies a unique Workflow in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="Workflow", fieldLength=22)
	AD_Workflow_ID,
	//
	@FlyElement(name="Workflow Processor", description="Workflow Processor Server", help="Workflow Processor Server", dataType=FlyDataType.TableDirect, entityType="D", printName="Workflow Processor", fieldLength=22)
	AD_WorkflowProcessor_ID,
	//
	@FlyElement(name="Workflow Processorl Log", description="Result of the execution of the Workflow Processor", help="Result of the execution of the Workflow Processor", dataType=FlyDataType.ID, entityType="D", printName="Workflow Processor Log", fieldLength=22)
	AD_WorkflowProcessorLog_ID,
	//
	@FlyElement(name="Zoom Condition", dataType=FlyDataType.NONE, entityType="D", printName="Zoom Condition", fieldLength=0)
	AD_ZoomCondition_ID,
	//
	@FlyElement(name="Effective Date", dataType=FlyDataType.Date, entityType="D", printName="Effective Date", fieldLength=7)
	A_Effective_Date,
	//
	@FlyElement(name="Account EMail", description="Email Address", help="The EMail Address indicates the EMail address off the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="EMail", fieldLength=60)
	A_EMail,
	//
	@FlyElement(name="To Asset", dataType=FlyDataType.Table, entityType="D", printName="To Asset", fieldLength=22)
	A_End_Asset_ID,
	//
	@FlyElement(name="Entry Type", dataType=FlyDataType.List, entityType="D", printName="Entry Type", fieldLength=3)
	A_Entry_Type,
	//
	@FlyElement(name="SL Expense/Period", dataType=FlyDataType.NONE, entityType="D", printName="SL Expense/Period", fieldLength=0)
	A_Expense_SL,
	//
	@FlyElement(name="SL Expense/Period (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="SL Expense/Period (fiscal)", fieldLength=0)
	A_Expense_SL_F,
	//
	@FlyElement(name="Asset Expired Date", dataType=FlyDataType.Date, entityType="D", printName="Asset Expired Date", fieldLength=7)
	A_Expired_Date,
	//
	@FlyElement(name="Asset Finance Method", dataType=FlyDataType.List, entityType="D", printName="Asset Finance Method", fieldLength=2)
	A_Finance_Meth,
	//
	@FlyElement(name="After Delivery", description="Due after delivery rather than after invoicing", help="The After Delivery checkbox indicates that payment is due after delivery as opposed to after invoicing.", dataType=FlyDataType.YesNo, entityType="D", printName="After Delivery", fieldLength=1)
	AfterDelivery,
	//
	@FlyElement(name="Funding Mode Account", dataType=FlyDataType.NONE, entityType="D", printName="Funding Mode Acct", fieldLength=0)
	A_FundingMode_Acct,
	//
	@FlyElement(name="Asset Funding Mode", dataType=FlyDataType.NONE, entityType="D", printName="Asset Funding Mode", fieldLength=0)
	A_FundingMode_ID,
	//
	@FlyElement(name="Age", description="Age of a person", help="The age of a person", dataType=FlyDataType.String, entityType="EE02", printName="Age", fieldLength=0)
	Age,
	//
	@FlyElement(name="Driver License", description="Payment Identification - Driver License", help="The Driver's License being used as identification.", dataType=FlyDataType.String, entityType="D", printName="Driver License", fieldLength=20)
	A_Ident_DL,
	//
	@FlyElement(name="Social Security No", description="Payment Identification - Social Security No", help="The Social Security number being used as identification.", dataType=FlyDataType.String, entityType="D", printName="Social Security No", fieldLength=20)
	A_Ident_SSN,
	//
	@FlyElement(name="Asset Insurance Premium", dataType=FlyDataType.Amount, entityType="D", printName="Asset Insurance Premium", fieldLength=22)
	A_Ins_Premium,
	//
	@FlyElement(name="Insurance Company", dataType=FlyDataType.String, entityType="D", printName="Insurance Company", fieldLength=22)
	A_Insurance_Co,
	//
	@FlyElement(name="Asset Insurance Value", dataType=FlyDataType.Amount, entityType="D", printName="Asset Insurance Value", fieldLength=22)
	A_Ins_Value,
	//
	@FlyElement(name="Asset Investment CR", dataType=FlyDataType.Integer, entityType="D", printName="Asset Investment CR", fieldLength=22)
	A_Investment_CR,
	//
	@FlyElement(name="Issuing Agency", dataType=FlyDataType.String, entityType="D", printName="Issuing Agency", fieldLength=22)
	A_Issuing_Agency,
	//
	@FlyElement(name="Alert Message", description="Message of the Alert", help="The message of the email sent for the alert", dataType=FlyDataType.Text, entityType="D", printName="Alert Message", fieldLength=2000)
	AlertMessage,
	//
	@FlyElement(name="Alert over Priority", description="Send alert email when over priority", help="Send alert email when a suspended activity is over the  priority defined", dataType=FlyDataType.Integer, entityType="D", printName="Alert over Priority", fieldLength=22)
	AlertOverPriority,
	//
	@FlyElement(name="Alert Subject", description="Subject of the Alert", help="The subject of the email message sent for the alert", dataType=FlyDataType.String, entityType="D", printName="Alert Subject", fieldLength=60)
	AlertSubject,
	//
	@FlyElement(name="Alias", description="Defines an alternate method of indicating an account combination.", help="The Alias field allows you to define a alternate method for referring to a full account combination.  For example, the Account Receivable Account for Garden World may be aliased as GW_AR.", dataType=FlyDataType.String, entityType="D", printName="Alias", fieldLength=40)
	Alias,
	//
	@FlyElement(name="Alias", dataType=FlyDataType.NONE, entityType="D", printName="Alias", fieldLength=0)
	Alias_ValidCombination_ID,
	//
	@FlyElement(name="Asset License Fee", dataType=FlyDataType.Amount, entityType="D", printName="Asset License Fee", fieldLength=22)
	A_License_Fee,
	//
	@FlyElement(name="Asset License No", dataType=FlyDataType.String, entityType="D", printName="Asset License No", fieldLength=120)
	A_License_No,
	//
	@FlyElement(name="Life Periods", dataType=FlyDataType.Integer, entityType="D", printName="Life Periods", fieldLength=22)
	A_Life_Period,
	//
	@FlyElement(name="Life Periods 2004 (min)", dataType=FlyDataType.NONE, entityType="D", printName="Life Periods 2004 (min)", fieldLength=0)
	A_Life_Period_2004,
	//
	@FlyElement(name="Life Period (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Life Period (fiscal)", fieldLength=0)
	A_Life_Period_F,
	//
	@FlyElement(name="Life periods (max)", dataType=FlyDataType.NONE, entityType="D", printName="Life periods (max)", fieldLength=0)
	A_Life_Period_Max,
	//
	@FlyElement(name="Life periods (min)", dataType=FlyDataType.NONE, entityType="D", printName="Life periods (min)", fieldLength=0)
	A_Life_Period_Min,
	//
	@FlyElement(name="All Allocations", dataType=FlyDataType.NONE, entityType="D", printName="All Allocations", fieldLength=0)
	AllAllocations,
	//
	@FlyElement(name="All Assets", dataType=FlyDataType.NONE, entityType="D", printName="AllAssets", fieldLength=0)
	AllAssets,
	//
	@FlyElement(name="AllFields", dataType=FlyDataType.YesNo, entityType="D", printName="AllFields", fieldLength=1)
	AllFields,
	//
	@FlyElement(name="Allocated Amountt", description="Amount allocated to this document", dataType=FlyDataType.Amount, entityType="D", printName="Allocated Amt", fieldLength=22)
	AllocatedAmt,
	//
	@FlyElement(name="Allocate Oldest First", description="Allocate payments to the oldest invoice", help="Allocate payments to the oldest invoice. There might be an unallocated amount remaining.", dataType=FlyDataType.NONE, entityType="D", printName="Allocate Oldest First", fieldLength=0)
	AllocateOldest,
	//
	@FlyElement(name="Allocation No", dataType=FlyDataType.Integer, entityType="D", printName="Allocation No", fieldLength=22)
	AllocationNo,
	//
	@FlyElement(name="Allocation Strategy", description="Allocation Strategy", help="Allocation from incoming to outgoing transactions", dataType=FlyDataType.List, entityType="D", printName="Allocation", fieldLength=1)
	AllocationStrategyType,
	//
	@FlyElement(name="Allow Cities out of List", description="A flag to allow cities, currently not in the list, to be entered", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Cities out of List", fieldLength=1)
	AllowCitiesOutOfList,
	//
	@FlyElement(name="Allow  Leave with", description="Allow  Leave with", help="The Valid Leave Type for an leave", dataType=FlyDataType.Table, entityType="EE02", printName="Allow  Leave with", fieldLength=0)
	AllowedLeaveType_ID,
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
	@FlyElement(name="Allow Info CRP", dataType=FlyDataType.YesNo, entityType="EE01", printName="Allow Info CRP", fieldLength=1)
	Allow_Info_CRP,
	//
	@FlyElement(name="Allow Info InOut", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info InOut", fieldLength=1)
	Allow_Info_InOut,
	//
	@FlyElement(name="Allow Info Invoice", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Invoice", fieldLength=1)
	Allow_Info_Invoice,
	//
	@FlyElement(name="Allow Info MRP", dataType=FlyDataType.YesNo, entityType="EE01", printName="Allow Info MRP", fieldLength=1)
	Allow_Info_MRP,
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
	@FlyElement(name="Allow UoM Fractions", description="Allow Unit of Measure Fractions", help="If allowed, you can enter UoM Fractions", dataType=FlyDataType.YesNo, entityType="D", printName="Allow UoM Fractions", fieldLength=1)
	AllowUoMFractions,
	//
	@FlyElement(name="Allow XLS View", dataType=FlyDataType.YesNo, entityType="D", printName="Allow XLS View", fieldLength=1)
	Allow_XLS_View,
	//
	@FlyElement(name="Check all DB Tables", description="Check not just this table", dataType=FlyDataType.NONE, entityType="D", printName="Check all DB Tables", fieldLength=0)
	AllTables,
	//
	@FlyElement(name="Alpha", description="Color Alpha value 0-255", dataType=FlyDataType.Integer, entityType="D", printName="Alpha", fieldLength=22)
	Alpha,
	//
	@FlyElement(name="2nd Alpha", description="Alpha value for second color", dataType=FlyDataType.Integer, entityType="D", printName="2nd Alpha", fieldLength=22)
	Alpha_1,
	//
	@FlyElement(name="Asset Monthly Payment", dataType=FlyDataType.Amount, entityType="D", printName="Asset Monthly Payment", fieldLength=22)
	A_Monthly_Payment,
	//
	@FlyElement(name="Amount", description="Amount in a defined currency", help="The Amount indicates the amount for this document line.", dataType=FlyDataType.Amount, entityType="D", printName="Amt", fieldLength=22)
	Amount,
	//
	@FlyElement(name="AmountRefunded", dataType=FlyDataType.Amount, entityType="D", printName="AmountRefunded", fieldLength=22)
	AmountRefunded,
	//
	@FlyElement(name="AmountTendered", dataType=FlyDataType.Amount, entityType="D", printName="AmountTendered", fieldLength=22)
	AmountTendered,
	//
	@FlyElement(name="Amount Type", description="Type of amount to report", help="You can choose between the total and period amounts as well as the balance or just the debit/credit amounts.", dataType=FlyDataType.List, entityType="D", printName="Amt Type", fieldLength=2)
	AmountType,
	//
	@FlyElement(name="Amount", description="Amount", help="Amount", dataType=FlyDataType.Amount, entityType="D", printName="Amt", fieldLength=22)
	Amt,
	//
	@FlyElement(name="Accounted Amount", description="Amount Balance in Currency of Accounting Schema", dataType=FlyDataType.Amount, entityType="D", printName="Accounted", fieldLength=22)
	AmtAcct,
	//
	@FlyElement(name="Accounted Balance", description="Accounted Balance Amount", help="The Account Balance Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="Balance", fieldLength=22)
	AmtAcctBalance,
	//
	@FlyElement(name="Accounted Credit", description="Accounted Credit Amount", help="The Account Credit Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="Acct Credit", fieldLength=22)
	AmtAcctCr,
	//
	@FlyElement(name="Accounted Debit", description="Accounted Debit Amount", help="The Account Debit Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="Acct Debit", fieldLength=22)
	AmtAcctDr,
	//
	@FlyElement(name="Acct Open Balance", description="Open Balance in document currency & rate", dataType=FlyDataType.Amount, entityType="D", printName="Acct Open Balance", fieldLength=22)
	AmtAcctOpenBalance,
	//
	@FlyElement(name="Acct Open Cr", description="Open Credit in document currency & rate", dataType=FlyDataType.Amount, entityType="D", printName="Acct Open Cr", fieldLength=22)
	AmtAcctOpenCr,
	//
	@FlyElement(name="Acct Open Dr", description="Open Debit in document currency & rate", dataType=FlyDataType.Amount, entityType="D", printName="Acct Open Dr", fieldLength=22)
	AmtAcctOpenDr,
	//
	@FlyElement(name="Open Posted Amount", dataType=FlyDataType.NONE, entityType="D", printName="Open Posted Amount", fieldLength=0)
	AmtAcctOpenPosted,
	//
	@FlyElement(name="Open Source Amount", dataType=FlyDataType.NONE, entityType="D", printName="Open Source Amount", fieldLength=0)
	AmtAcctOpenSource,
	//
	@FlyElement(name="Approval Amount", description="The approval amount limit for this role", help="The Approval Amount field indicates the amount limit this Role has for approval of documents.", dataType=FlyDataType.Amount, entityType="D", printName="Approval Amt", fieldLength=22)
	AmtApproval,
	//
	@FlyElement(name="Amt in Words", description="Amount in words", help="Amount in words will be printed.", dataType=FlyDataType.Amount, entityType="D", printName="Amt in Words", fieldLength=22)
	AmtInWords,
	//
	@FlyElement(name="Amount LL", description="Amount Lower Level Cost", help="Amount Lower Level Cost", dataType=FlyDataType.NONE, entityType="D", printName="Amt Lower Level", fieldLength=0)
	AmtLL,
	//
	@FlyElement(name="Lost Sales Amt", description="Amount of lost sales in Invoice Currency", dataType=FlyDataType.Amount, entityType="D", printName="Lost Sales Amt", fieldLength=22)
	AmtLostSales,
	//
	@FlyElement(name="Multiplier Amount", description="Multiplier Amount for generating commissions", help="The Multiplier Amount indicates the amount to multiply the total amount generated by this commission run by.", dataType=FlyDataType.Number, entityType="D", printName="Multiplier Amt", fieldLength=22)
	AmtMultiplier,
	//
	@FlyElement(name="Revaluated Amount Cr", description="Revaluated Cr Amount", dataType=FlyDataType.Amount, entityType="D", printName="Revaluated Amt Cr", fieldLength=22)
	AmtRevalCr,
	//
	@FlyElement(name="Revaluated Difference Cr", description="Revaluated Cr Amount Difference", dataType=FlyDataType.Amount, entityType="D", printName="Difference Cr", fieldLength=22)
	AmtRevalCrDiff,
	//
	@FlyElement(name="Revalue Diff", description="Revaluation difference", dataType=FlyDataType.NONE, entityType="D", printName="Revalue Diff", fieldLength=0)
	AmtRevalDiff,
	//
	@FlyElement(name="Revaluated Amount Dr", description="Revaluated Dr Amount", dataType=FlyDataType.Amount, entityType="D", printName="Revaluated Amt Dr", fieldLength=22)
	AmtRevalDr,
	//
	@FlyElement(name="Revaluated Difference Dr", description="Revaluated Dr Amount Difference", dataType=FlyDataType.Amount, entityType="D", printName="Difference Dr", fieldLength=22)
	AmtRevalDrDiff,
	//
	@FlyElement(name="Source Amount", description="Amount Balance in Source Currency", dataType=FlyDataType.Amount, entityType="D", printName="Source", fieldLength=22)
	AmtSource,
	//
	@FlyElement(name="Source Balance", description="Source Balance Amount", help="The Source Balance Amount indicates the balance amount for this line in the source currency.", dataType=FlyDataType.Amount, entityType="D", printName="Source Balance", fieldLength=22)
	AmtSourceBalance,
	//
	@FlyElement(name="Source Credit", description="Source Credit Amount", help="The Source Credit Amount indicates the credit amount for this line in the source currency.", dataType=FlyDataType.Amount, entityType="D", printName="Source Credit", fieldLength=22)
	AmtSourceCr,
	//
	@FlyElement(name="Source Debit", description="Source Debit Amount", help="The Source Debit Amount indicates the credit amount for this line in the source currency.", dataType=FlyDataType.Amount, entityType="D", printName="Source Debit", fieldLength=22)
	AmtSourceDr,
	//
	@FlyElement(name="Subtract Amount", description="Subtract Amount for generating commissions", help="The Subtract Amount indicates the amount to subtract from the total amount prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="Subtract Amt", fieldLength=22)
	AmtSubtract,
	//
	@FlyElement(name="Account Name", description="Name on Credit Card or Account holder", help="The Name of the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="Account Name", fieldLength=60)
	A_Name,
	//
	@FlyElement(name="And/Or", description="Logical operation: AND or OR", dataType=FlyDataType.List, entityType="D", printName="And/Or", fieldLength=1)
	AndOr,
	//
	@FlyElement(name="Asset New Used", dataType=FlyDataType.YesNo, entityType="D", printName="Asset New Used", fieldLength=1)
	A_New_Used,
	//
	@FlyElement(name="Any Account", description="Match any value of the Account segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Acct", fieldLength=1)
	AnyAcct,
	//
	@FlyElement(name="Any Activity", description="Match any value of the Activity segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Activity", fieldLength=1)
	AnyActivity,
	//
	@FlyElement(name="Any Bus.Partner", description="Match any value of the Business Partner segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any BPartner", fieldLength=1)
	AnyBPartner,
	//
	@FlyElement(name="Any Campaign", description="Match any value of the Campaign segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Campaign", fieldLength=1)
	AnyCampaign,
	//
	@FlyElement(name="Any Location From", description="Match any value of the Location From segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Loc From", fieldLength=1)
	AnyLocFrom,
	//
	@FlyElement(name="Any Location To", description="Match any value of the Location To segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Loc To", fieldLength=1)
	AnyLocTo,
	//
	@FlyElement(name="Any Organization", description="Match any value of the Organization segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Org", fieldLength=1)
	AnyOrg,
	//
	@FlyElement(name="Any Trx Organization", description="Match any value of the Transaction Organization segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Trx Org", fieldLength=1)
	AnyOrgTrx,
	//
	@FlyElement(name="Any Product", description="Match any value of the Product segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Product", fieldLength=1)
	AnyProduct,
	//
	@FlyElement(name="Any Project", description="Match any value of the Project segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Project", fieldLength=1)
	AnyProject,
	//
	@FlyElement(name="Any Sales Region", description="Match any value of the Sales Region segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Sales Region", fieldLength=1)
	AnySalesRegion,
	//
	@FlyElement(name="Any User 1", description="Match any value of the User 1 segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any User 1", fieldLength=1)
	AnyUser1,
	//
	@FlyElement(name="Any User 2", description="Match any value of the User 2 segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any User 2", fieldLength=1)
	AnyUser2,
	//
	@FlyElement(name="Any User 3", description="Match any value of the User 3 segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any User 3", fieldLength=1)
	AnyUser3,
	//
	@FlyElement(name="Any User 4", description="Match any value of the User 4 segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any User 4", fieldLength=1)
	AnyUser4,
	//
	@FlyElement(name="AP - AR", description="Include Receivables and/or Payables transactions", dataType=FlyDataType.List, entityType="D", printName="AP - AR", fieldLength=1)
	APAR,
	//
	@FlyElement(name="Parent Asset", dataType=FlyDataType.Search, entityType="D", printName="Parent Asset", fieldLength=22)
	A_Parent_Asset_ID,
	//
	@FlyElement(name="AP Enquiry", dataType=FlyDataType.NONE, entityType="D", printName="AP Enquiry", fieldLength=0)
	APEnquiry,
	//
	@FlyElement(name="Original Percent", dataType=FlyDataType.Number, entityType="D", printName="Original Percent", fieldLength=22)
	A_Percent_Original,
	//
	@FlyElement(name="A_Percent_Split", dataType=FlyDataType.Number, entityType="D", printName="A_Percent_Split", fieldLength=22)
	A_Percent_Split,
	//
	@FlyElement(name="Asset Period", dataType=FlyDataType.Integer, entityType="D", printName="Asset Period", fieldLength=22)
	A_Period,
	//
	@FlyElement(name="Period 1", dataType=FlyDataType.Number, entityType="D", printName="Period 1", fieldLength=22)
	A_Period_1,
	//
	@FlyElement(name="Period 10", dataType=FlyDataType.Number, entityType="D", printName="Period 10", fieldLength=22)
	A_Period_10,
	//
	@FlyElement(name="Period 11", dataType=FlyDataType.Number, entityType="D", printName="Period 11", fieldLength=22)
	A_Period_11,
	//
	@FlyElement(name="Period 12", dataType=FlyDataType.Number, entityType="D", printName="Period 12", fieldLength=22)
	A_Period_12,
	//
	@FlyElement(name="Period 13", dataType=FlyDataType.Number, entityType="D", printName="Period 13", fieldLength=22)
	A_Period_13,
	//
	@FlyElement(name="Period 14", dataType=FlyDataType.Number, entityType="D", printName="Period 14", fieldLength=22)
	A_Period_14,
	//
	@FlyElement(name="Period 2", dataType=FlyDataType.Number, entityType="D", printName="Period 2", fieldLength=22)
	A_Period_2,
	//
	@FlyElement(name="Period 3", dataType=FlyDataType.Number, entityType="D", printName="Period 3", fieldLength=22)
	A_Period_3,
	//
	@FlyElement(name="Period 4", dataType=FlyDataType.Number, entityType="D", printName="Period 4", fieldLength=22)
	A_Period_4,
	//
	@FlyElement(name="Period 5", dataType=FlyDataType.Number, entityType="D", printName="Period 5", fieldLength=22)
	A_Period_5,
	//
	@FlyElement(name="Period 6", dataType=FlyDataType.Number, entityType="D", printName="Period 6", fieldLength=22)
	A_Period_6,
	//
	@FlyElement(name="Period 7", dataType=FlyDataType.Number, entityType="D", printName="Period 7", fieldLength=22)
	A_Period_7,
	//
	@FlyElement(name="Period 8", dataType=FlyDataType.Number, entityType="D", printName="Period 8", fieldLength=22)
	A_Period_8,
	//
	@FlyElement(name="Period 9", dataType=FlyDataType.Number, entityType="D", printName="Period 9", fieldLength=22)
	A_Period_9,
	//
	@FlyElement(name="A_Period_End", dataType=FlyDataType.Integer, entityType="D", printName="A_Period_End", fieldLength=10)
	A_Period_End,
	//
	@FlyElement(name="A_Period_Forecast", dataType=FlyDataType.Number, entityType="D", printName="A_Period_Forecast", fieldLength=10)
	A_Period_Forecast,
	//
	@FlyElement(name="A_Period_Posted", dataType=FlyDataType.Integer, entityType="D", printName="A_Period_Posted", fieldLength=22)
	A_Period_Posted,
	//
	@FlyElement(name="A_Period_Start", dataType=FlyDataType.Integer, entityType="D", printName="A_Period_Start", fieldLength=10)
	A_Period_Start,
	//
	@FlyElement(name="Asset Policy No", dataType=FlyDataType.String, entityType="D", printName="Asset Policy No", fieldLength=100)
	A_Policy_No,
	//
	@FlyElement(name="Applicants No", description="Applicants No for this position", help="Applicants No for this position", dataType=FlyDataType.String, entityType="EE02", printName="Applicants No", fieldLength=0)
	ApplicantsNo,
	//
	@FlyElement(name="Apply", description="Apply migration", dataType=FlyDataType.NONE, entityType="D", printName="Apply", fieldLength=0)
	Apply,
	//
	@FlyElement(name="Approval Amount", description="Document Approval Amount", help="Approval Amount for Workflow", dataType=FlyDataType.Amount, entityType="D", printName="Approval Amt", fieldLength=22)
	ApprovalAmt,
	//
	@FlyElement(name="A_Prior_Year_Accumulated_Depr", dataType=FlyDataType.Amount, entityType="D", printName="A_Prior_Year_Accumulated_Depr", fieldLength=22)
	A_Prior_Year_Accumulated_Depr,
	//
	@FlyElement(name="Asset Proceeds", dataType=FlyDataType.Amount, entityType="D", printName="Asset Proceeds", fieldLength=22)
	A_Proceeds,
	//
	@FlyElement(name="Processed", dataType=FlyDataType.YesNo, entityType="D", printName="Processed", fieldLength=1)
	A_Processed,
	//
	@FlyElement(name="Purchase Option", dataType=FlyDataType.YesNo, entityType="D", printName="Purchase Option", fieldLength=2)
	A_Purchase_Option,
	//
	@FlyElement(name="Purchase Option Credit", dataType=FlyDataType.Integer, entityType="D", printName="Purchase Option Credit", fieldLength=22)
	A_Purchase_Option_Credit,
	//
	@FlyElement(name="Purchase Option Credit %", dataType=FlyDataType.Number, entityType="D", printName="Purchase Option Credit %", fieldLength=22)
	A_Purchase_Option_Credit_Per,
	//
	@FlyElement(name="Purchase Price", dataType=FlyDataType.Amount, entityType="D", printName="Purchase Price", fieldLength=22)
	A_Purchase_Price,
	//
	@FlyElement(name="Current Qty", dataType=FlyDataType.Number, entityType="D", printName="Current Qty", fieldLength=22)
	A_QTY_Current,
	//
	@FlyElement(name="A_QTY_Original", dataType=FlyDataType.Number, entityType="D", printName="A_QTY_Original", fieldLength=22)
	A_QTY_Original,
	//
	@FlyElement(name="Qty. Split", dataType=FlyDataType.Number, entityType="D", printName="Qty. Split", fieldLength=22)
	A_QTY_Split,
	//
	@FlyElement(name="Arc Diameter", description="Arc Diameter for rounded Rectangles", help="Width of the horizontal/vertical diameter of the arc at the four corners", dataType=FlyDataType.Integer, entityType="D", printName="Arc Diameter", fieldLength=22)
	ArcDiameter,
	//
	@FlyElement(name="Area Code", description="Phone Area Code", help="Phone Area Code", dataType=FlyDataType.String, entityType="D", printName="Area Code", fieldLength=10)
	AreaCode,
	//
	@FlyElement(name="Registration Attribute", description="Asset Registration Attribute", help="Define the individual values for the Asset Registration", dataType=FlyDataType.ID, entityType="D", printName="Registration Attribute", fieldLength=22)
	A_RegistrationAttribute_ID,
	//
	@FlyElement(name="Registration", description="User Asset Registration", help="User Registration of an Asset", dataType=FlyDataType.ID, entityType="D", printName="Registration", fieldLength=22)
	A_Registration_ID,
	//
	@FlyElement(name="Remaining Period", dataType=FlyDataType.NONE, entityType="D", printName="Remaining Period", fieldLength=0)
	A_Remaining_Period,
	//
	@FlyElement(name="Asset Renewal Date", dataType=FlyDataType.Date, entityType="D", printName="Asset Renewal Date", fieldLength=7)
	A_Renewal_Date,
	//
	@FlyElement(name="AR Enquiry", dataType=FlyDataType.NONE, entityType="D", printName="AR Enquiry", fieldLength=0)
	AREnquiry,
	//
	@FlyElement(name="Asset Replace Cost", dataType=FlyDataType.Amount, entityType="D", printName="Asset Replace Cost", fieldLength=22)
	A_Replace_Cost,
	//
	@FlyElement(name="Revaluation Accumulated Depreciation Offset for Current Year", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Accumulated Depreciation Offset for Current Year", fieldLength=22)
	A_Reval_Accumdep_Offset_Cur,
	//
	@FlyElement(name="Revaluation Accumulated Depreciation Offset for Prior Year", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Accumulated Depreciation Offset for Prior Year", fieldLength=22)
	A_Reval_Accumdep_Offset_Prior,
	//
	@FlyElement(name="A_Reval_Accumdep_Offset_Cur", dataType=FlyDataType.NONE, entityType="D", printName="A_Reval_Accumdep_Offset_Cur", fieldLength=0)
	A_Reval_Adep_Offset_Cur_Acct,
	//
	@FlyElement(name="A_Reval_Accumdep_Offset_Prior", dataType=FlyDataType.NONE, entityType="D", printName="A_Reval_Accumdep_Offset_Prior", fieldLength=0)
	A_Reval_Adep_Offset_Prior_Acct,
	//
	@FlyElement(name="A_Reval_Cal_Method", dataType=FlyDataType.List, entityType="D", printName="A_Reval_Cal_Method", fieldLength=3)
	A_Reval_Cal_Method,
	//
	@FlyElement(name="Reval. Code", dataType=FlyDataType.List, entityType="D", printName="Reval. Code", fieldLength=3)
	A_Reval_Code,
	//
	@FlyElement(name="Revaluation Cost Offset for Current Year", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Cost Offset for Current Year", fieldLength=22)
	A_Reval_Cost_Offset,
	//
	@FlyElement(name="Reval Cost Offset Acct", dataType=FlyDataType.NONE, entityType="D", printName="Reval Cost Offset Acct", fieldLength=0)
	A_Reval_Cost_Offset_Acct,
	//
	@FlyElement(name="Revaluation Cost Offset for Prior Year", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Cost Offset for Prior Year", fieldLength=22)
	A_Reval_Cost_Offset_Prior,
	//
	@FlyElement(name="Reval Cost Offset Prior Acct", dataType=FlyDataType.NONE, entityType="D", printName="Reval Cost Offset Prior Acct", fieldLength=0)
	A_Reval_Cost_Offset_Prior_Acct,
	//
	@FlyElement(name="Revaluation Expense Offs", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Expense Offs", fieldLength=22)
	A_Reval_Depexp_Offset,
	//
	@FlyElement(name="Reval Depexp Offset Acct", dataType=FlyDataType.NONE, entityType="D", printName="Reval Depexp Offset Acct", fieldLength=0)
	A_Reval_Depexp_Offset_Acct,
	//
	@FlyElement(name="Reval. Effective Date", dataType=FlyDataType.List, entityType="D", printName="Reval. Effective Date", fieldLength=2)
	A_Reval_Effective_Date,
	//
	@FlyElement(name="Reval. Multiplier", dataType=FlyDataType.List, entityType="D", printName="Reval. Multiplier", fieldLength=3)
	A_Reval_Multiplier,
	//
	@FlyElement(name="Reval. Rate", dataType=FlyDataType.Number, entityType="D", printName="Reval. Rate", fieldLength=22)
	A_Reval_Rate,
	//
	@FlyElement(name="Rev. Code", dataType=FlyDataType.List, entityType="D", printName="Rev. Code", fieldLength=3)
	A_Rev_Code,
	//
	@FlyElement(name="Args", dataType=FlyDataType.String, entityType="D", printName="Args", fieldLength=510)
	Args,
	//
	@FlyElement(name="Asset Salvage Value", dataType=FlyDataType.Amount, entityType="D", printName="Asset Salvage Value", fieldLength=10)
	A_Salvage_Value,
	//
	@FlyElement(name="Source Type", dataType=FlyDataType.List, entityType="D", printName="Source Type", fieldLength=3)
	A_SourceType,
	//
	@FlyElement(name="ASP Browse", dataType=FlyDataType.TableDirect, entityType="ECA02", printName="ASP Browse", fieldLength=10)
	ASP_Browse_ID,
	//
	@FlyElement(name="Client Exception", dataType=FlyDataType.ID, entityType="D", printName="Client Exception", fieldLength=22)
	ASP_ClientException_ID,
	//
	@FlyElement(name="Client Level", dataType=FlyDataType.ID, entityType="D", printName="Client Level", fieldLength=22)
	ASP_ClientLevel_ID,
	//
	@FlyElement(name="ASP Field", dataType=FlyDataType.ID, entityType="D", printName="ASP Field", fieldLength=10)
	ASP_Field_ID,
	//
	@FlyElement(name="ASP Form", dataType=FlyDataType.ID, entityType="D", printName="ASP Form", fieldLength=10)
	ASP_Form_ID,
	//
	@FlyElement(name="ASP Level", dataType=FlyDataType.TableDirect, entityType="D", printName="ASP Level", fieldLength=22)
	ASP_Level_ID,
	//
	@FlyElement(name="Split Percent", dataType=FlyDataType.Number, entityType="D", printName="Split Percent", fieldLength=22)
	A_Split_Percent,
	//
	@FlyElement(name="Split Type", dataType=FlyDataType.List, entityType="D", printName="Split Type", fieldLength=3)
	A_Split_Type,
	//
	@FlyElement(name="ASP Module", dataType=FlyDataType.ID, entityType="D", printName="ASP Module", fieldLength=22)
	ASP_Module_ID,
	//
	@FlyElement(name="ASP Process", dataType=FlyDataType.ID, entityType="D", printName="ASP Process", fieldLength=10)
	ASP_Process_ID,
	//
	@FlyElement(name="ASP Process Parameter", dataType=FlyDataType.ID, entityType="D", printName="ASP Process Parameter", fieldLength=10)
	ASP_Process_Para_ID,
	//
	@FlyElement(name="ASP Status", dataType=FlyDataType.List, entityType="D", printName="ASP Status", fieldLength=1)
	ASP_Status,
	//
	@FlyElement(name="ASP Tab", dataType=FlyDataType.ID, entityType="D", printName="ASP Tab", fieldLength=10)
	ASP_Tab_ID,
	//
	@FlyElement(name="ASP Task", dataType=FlyDataType.ID, entityType="D", printName="ASP Task", fieldLength=10)
	ASP_Task_ID,
	//
	@FlyElement(name="ASP Window", dataType=FlyDataType.ID, entityType="D", printName="ASP Window", fieldLength=10)
	ASP_Window_ID,
	//
	@FlyElement(name="ASP Workflow", dataType=FlyDataType.ID, entityType="D", printName="ASP Workflow", fieldLength=10)
	ASP_Workflow_ID,
	//
	@FlyElement(name="Quantity Assay", description="Indicated the Quantity Assay to use into Quality Order", help="Indicated the Quantity Assay to use into Quality Order", dataType=FlyDataType.Quantity, entityType="EE01", printName="Quantity Assay", fieldLength=22)
	Assay,
	//
	@FlyElement(name="AssetAccumDepreciationAmt", dataType=FlyDataType.Amount, entityType="D", printName="AssetAccumDepreciationAmt", fieldLength=22)
	AssetAccumDepreciationAmt,
	//
	@FlyElement(name="Activation Date", dataType=FlyDataType.NONE, entityType="D", printName="Activation Date", fieldLength=0)
	AssetActivationDate,
	//
	@FlyElement(name="Entered Amount", dataType=FlyDataType.NONE, entityType="D", printName="Amount", fieldLength=0)
	AssetAmtEntered,
	//
	@FlyElement(name="AssetBookValueAmt", dataType=FlyDataType.Amount, entityType="D", printName="AssetBookValueAmt", fieldLength=22)
	AssetBookValueAmt,
	//
	@FlyElement(name="Asset Depreciation Date", description="Date of last depreciation", help="Date of the last deprecation, if the asset is used internally and depreciated.", dataType=FlyDataType.Date, entityType="D", printName="Asset depreciation date", fieldLength=7)
	AssetDepreciationDate,
	//
	@FlyElement(name="Asset Disposal Date", description="Date when the asset is/was disposed", dataType=FlyDataType.Date, entityType="D", printName="Asset disposal date", fieldLength=7)
	AssetDisposalDate,
	//
	@FlyElement(name="Market value Amount", description="Market value of the asset", help="For reporting, the market value of the asset", dataType=FlyDataType.Amount, entityType="D", printName="Market value amt", fieldLength=22)
	AssetMarketValueAmt,
	//
	@FlyElement(name="Depreciation Amount / Period", description="Applies to Straight Line depreciation", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Amount / Period", fieldLength=0)
	AssetPeriodDepreciationAmt,
	//
	@FlyElement(name="In Service Date", description="Date when Asset was put into service", help="The date when the asset was put into service - usually used as start date for depreciation.", dataType=FlyDataType.Date, entityType="D", printName="In Service date", fieldLength=7)
	AssetServiceDate,
	//
	@FlyElement(name="Source Amount", dataType=FlyDataType.NONE, entityType="D", printName="Source Amount", fieldLength=0)
	AssetSourceAmt,
	//
	@FlyElement(name="Asset Value", dataType=FlyDataType.NONE, entityType="D", printName="Asset Value", fieldLength=0)
	AssetValue,
	//
	@FlyElement(name="Asset value", description="Book Value of the asset", dataType=FlyDataType.Amount, entityType="D", printName="Asset value", fieldLength=22)
	AssetValueAmt,
	//
	@FlyElement(name="Assign From", description="Assign resource from", help="Assignment start", dataType=FlyDataType.DateTime, entityType="D", printName="Assign From", fieldLength=7)
	AssignDateFrom,
	//
	@FlyElement(name="Assign To", description="Assign resource until", help="Assignment end", dataType=FlyDataType.DateTime, entityType="D", printName="Assign To", fieldLength=7)
	AssignDateTo,
	//
	@FlyElement(name="From Asset", dataType=FlyDataType.Table, entityType="D", printName="From Asset", fieldLength=22)
	A_Start_Asset_ID,
	//
	@FlyElement(name="Account State", description="State of the Credit Card or Account holder", help="The State of the Credit Card or Account holder", dataType=FlyDataType.String, entityType="D", printName="State", fieldLength=40)
	A_State,
	//
	@FlyElement(name="Account Street", description="Street address of the Credit Card or Account holder", help="The Street Address of the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="Street", fieldLength=60)
	A_Street,
	//
	@FlyElement(name="Type", dataType=FlyDataType.List, entityType="D", printName="Type", fieldLength=2)
	A_Table_Rate_Type,
	//
	@FlyElement(name="Asset Tax Entity", dataType=FlyDataType.String, entityType="D", printName="Asset Tax Entity", fieldLength=22)
	A_Tax_Entity,
	//
	@FlyElement(name="Period/Yearly", dataType=FlyDataType.List, entityType="D", printName="Period/Yearly", fieldLength=2)
	A_Term,
	//
	@FlyElement(name="Financing Type", description="Financing Type", dataType=FlyDataType.NONE, entityType="D", printName="Financing Type", fieldLength=0)
	A_Tip_Finantare,
	//
	@FlyElement(name="A_Transfer_Balance", dataType=FlyDataType.YesNo, entityType="D", printName="A_Transfer_Balance", fieldLength=1)
	A_Transfer_Balance,
	//
	@FlyElement(name="A_Transfer_Balance_IS", dataType=FlyDataType.YesNo, entityType="D", printName="A_Transfer_Balance_IS", fieldLength=1)
	A_Transfer_Balance_IS,
	//
	@FlyElement(name="Attach Asset", description="Attach Asset to be delivered per email", dataType=FlyDataType.NONE, entityType="D", printName="Attach Asset", fieldLength=0)
	AttachAsset,
	//
	@FlyElement(name="Attribute", dataType=FlyDataType.String, entityType="D", printName="Attribute", fieldLength=60)
	Attribute,
	//
	@FlyElement(name="Attribute Name", description="Name of the Attribute", help="Identifier of the attribute", dataType=FlyDataType.String, entityType="D", printName="Attribute Name", fieldLength=60)
	AttributeName,
	//
	@FlyElement(name="Attribute Search Name", description="Name of the Attribute Search", help="Identifier of the Attribute Search", dataType=FlyDataType.NONE, entityType="EE01", printName="Attribute Search Name", fieldLength=0)
	AttributeSearchName,
	//
	@FlyElement(name="Attribute Set Name", description="Name of the Attribute Set", help="Identifier of the Attribute Set", dataType=FlyDataType.NONE, entityType="EE01", printName="Attribute Set Name", fieldLength=0)
	AttributeSetName,
	//
	@FlyElement(name="Attribute Value", description="Value of the Attribute", help="Adempiere converts the (string) field values to the attribute data type.  Booleans (Yes-No) may have the values 'true' and 'false', the date format is YYYY-MM-DD", dataType=FlyDataType.String, entityType="D", printName="Attribute Value", fieldLength=60)
	AttributeValue,
	//
	@FlyElement(name="Attribute Value Type", description="Type of Attribute Value", help="The Attribute Value type determines the data/validation type", dataType=FlyDataType.List, entityType="D", printName="Attribute Value Type", fieldLength=1)
	AttributeValueType,
	//
	@FlyElement(name="Auction Type", dataType=FlyDataType.List, entityType="D", printName="Auction Type", fieldLength=1)
	AuctionType,
	//
	@FlyElement(name="A_User1", dataType=FlyDataType.String, entityType="D", printName="A_User1", fieldLength=3)
	A_User1,
	//
	@FlyElement(name="A_User10", dataType=FlyDataType.String, entityType="D", printName="A_User10", fieldLength=3)
	A_User10,
	//
	@FlyElement(name="A_User11", dataType=FlyDataType.String, entityType="D", printName="A_User11", fieldLength=10)
	A_User11,
	//
	@FlyElement(name="A_User12", dataType=FlyDataType.String, entityType="D", printName="A_User12", fieldLength=10)
	A_User12,
	//
	@FlyElement(name="A_User13", dataType=FlyDataType.String, entityType="D", printName="A_User13", fieldLength=10)
	A_User13,
	//
	@FlyElement(name="A_User14", dataType=FlyDataType.String, entityType="D", printName="A_User14", fieldLength=10)
	A_User14,
	//
	@FlyElement(name="A_User15", dataType=FlyDataType.String, entityType="D", printName="A_User15", fieldLength=10)
	A_User15,
	//
	@FlyElement(name="A_User2", dataType=FlyDataType.String, entityType="D", printName="A_User2", fieldLength=3)
	A_User2,
	//
	@FlyElement(name="A_User3", dataType=FlyDataType.String, entityType="D", printName="A_User3", fieldLength=3)
	A_User3,
	//
	@FlyElement(name="A_User4", dataType=FlyDataType.String, entityType="D", printName="A_User4", fieldLength=3)
	A_User4,
	//
	@FlyElement(name="A_User5", dataType=FlyDataType.String, entityType="D", printName="A_User5", fieldLength=3)
	A_User5,
	//
	@FlyElement(name="A_User6", dataType=FlyDataType.String, entityType="D", printName="A_User6", fieldLength=3)
	A_User6,
	//
	@FlyElement(name="A_User7", dataType=FlyDataType.String, entityType="D", printName="A_User7", fieldLength=3)
	A_User7,
	//
	@FlyElement(name="A_User8", dataType=FlyDataType.String, entityType="D", printName="A_User8", fieldLength=3)
	A_User8,
	//
	@FlyElement(name="A_User9", dataType=FlyDataType.String, entityType="D", printName="A_User9", fieldLength=3)
	A_User9,
	//
	@FlyElement(name="Authentication Mechanism", dataType=FlyDataType.List, entityType="D", printName="Authentication Mechanism", fieldLength=1)
	AuthMechanism,
	//
	@FlyElement(name="Author", description="Author/Creator of the Entity", dataType=FlyDataType.String, entityType="D", printName="Author", fieldLength=20)
	Author,
	//
	@FlyElement(name="Auto Archive", description="Enable and level of automatic Archive of documents", help="Adempiere allows to automatically create archives of Documents (e.g. Invoices) or Reports. You view the archived material with the Archive Viewer", dataType=FlyDataType.List, entityType="D", printName="Auto Archive", fieldLength=1)
	AutoArchive,
	//
	@FlyElement(name="Auto Due Date Days", description="Automatic Due Date Days", help="If a due date is not defined and the Auto Due Days ins greater then zero, a due date in the number of days is automatically created.", dataType=FlyDataType.Integer, entityType="D", printName="Auto Due Date Days", fieldLength=10)
	AutoDueDateDays,
	//
	@FlyElement(name="Auto Lock", description="Whether to automatically lock the terminal when till is closed", dataType=FlyDataType.YesNo, entityType="D", printName="Auto Lock", fieldLength=1)
	AutoLock,
	//
	@FlyElement(name="Auto Logout Delay", description="Automatically logout if terminal inactive for this period", help="Measured in seconds, zero for no automatic logout", dataType=FlyDataType.Integer, entityType="D", printName="Auto Logout Delay", fieldLength=10)
	AutoLogoutDelay,
	//
	@FlyElement(name="Automatic Period Control", description="If selected, the periods are automatically opened and closed", help="In the Automatic Period Control, periods are opened and closed based on the current date.  If the Manual alternative is activated, you have to open and close periods explicitly.", dataType=FlyDataType.YesNo, entityType="D", printName="Automatic Period Control", fieldLength=1)
	AutoPeriodControl,
	//
	@FlyElement(name="Available Amount", description="Amount available for allocation for this document", dataType=FlyDataType.Amount, entityType="D", printName="Available Amt", fieldLength=22)
	AvailableAmt,
	//
	@FlyElement(name="Own contribution", dataType=FlyDataType.NONE, entityType="D", printName="Own contribution", fieldLength=0)
	A_Valoare_Cofinantare,
	//
	@FlyElement(name="Third contribution", dataType=FlyDataType.NONE, entityType="D", printName="Third contribution", fieldLength=0)
	A_Valoare_Tert,
	//
	@FlyElement(name="Value 2004", dataType=FlyDataType.NONE, entityType="D", printName="Value 2004", fieldLength=0)
	A_Value_2004,
	//
	@FlyElement(name="ax_case", dataType=FlyDataType.NONE, entityType="D", printName="ax_case", fieldLength=0)
	ax_case,
	//
	@FlyElement(name="Axis Column", description="Axis the link column.", help="Axis Column defines the base column to show the records on this table as columns inside the browser", dataType=FlyDataType.Table, entityType="EE07", printName="Axis Column", fieldLength=22)
	Axis_Column_ID,
	//
	@FlyElement(name="Axis Parent Column", description="The link Axis column view on the parent key", help="Axis Parent Column filters the records used by Axis Column, the values for the filter are obtained from the context of the Field Browser defined as query criteria	context.", dataType=FlyDataType.Table, entityType="EE07", printName="Axis Parent Column", fieldLength=22)
	Axis_Parent_Column_ID,
	//
	@FlyElement(name="Number of axles", dataType=FlyDataType.Quantity, entityType="EE03", printName="Number of axles", fieldLength=0)
	AxlesNumber,
	//
	@FlyElement(name="Account Zip/Postal", description="Zip Code of the Credit Card or Account Holder", help="The Zip Code of the Credit Card or Account Holder.", dataType=FlyDataType.String, entityType="D", printName="Zip ", fieldLength=20)
	A_Zip,
	//
	@FlyElement(name="Backflush Group", description="The Grouping Components to the Backflush", help="When the components are deliver is possible to indicated The Backflush Group this way you only can deliver the components that are for this Backflush Group.", dataType=FlyDataType.String, entityType="EE01", printName="Backflush Group", fieldLength=20)
	BackflushGroup,
	//
	@FlyElement(name="Backup Folder", description="Backup Folder", dataType=FlyDataType.FilePath, entityType="D", printName="Backup Folder", fieldLength=255)
	BackupFolder,
	//
	@FlyElement(name="Backup Value", description="The value of the column prior to migration.", dataType=FlyDataType.NONE, entityType="D", printName="Backup Value", fieldLength=0)
	BackupValue,
	//
	@FlyElement(name="Balance", dataType=FlyDataType.Amount, entityType="D", printName="Balance", fieldLength=22)
	Balance,
	//
	@FlyElement(name="Balance Amount", description="Balance Amount", help="The Balance Amount", dataType=FlyDataType.Number, entityType="EE02", printName="Balance Amount", fieldLength=0)
	BalanceAmount,
	//
	@FlyElement(name="Bank Account No", description="Bank Account Number", dataType=FlyDataType.String, entityType="D", printName="Bank Account No", fieldLength=20)
	BankAccountNo,
	//
	@FlyElement(name="Bank Account Type", description="Bank Account Type", help="The Bank Account Type field indicates the type of account (savings, checking etc) this account  is defined as.", dataType=FlyDataType.List, entityType="D", printName="Account type", fieldLength=1)
	BankAccountType,
	//
	@FlyElement(name="Bank Name", dataType=FlyDataType.String, entityType="D", printName="Bank Name", fieldLength=120)
	BankName,
	//
	@FlyElement(name="Barcode Scanner", description="This form allows processing the transactions of materials by means of a Barcode Scanner.", help="This form allows processing the transactions of materials by means of a Barcode Scanner using the Search Key, UPC/EAN, SKU, Partner Product Key", dataType=FlyDataType.Button, entityType="EE03", printName="Barcode Scanner", fieldLength=1)
	BarcodeScanner,
	//
	@FlyElement(name="Barcode Type", description="Type of barcode", dataType=FlyDataType.List, entityType="D", printName="Barcode", fieldLength=3)
	BarcodeType,
	//
	@FlyElement(name="Base", description="Calculation Base", dataType=FlyDataType.Number, entityType="D", printName="Base", fieldLength=22)
	Base,
	//
	@FlyElement(name="Base Pricelist", description="Pricelist to be used, if product not found on this pricelist", help="The Base Price List identifies the default price list to be used if a product is not found on the selected price list", dataType=FlyDataType.Table, entityType="D", printName="Base", fieldLength=22)
	BasePriceList_ID,
	//
	@FlyElement(name="Bank Asset", description="Bank Asset Account", help="The Bank Asset Account identifies the account to be used for booking changes to the balance in this bank account", dataType=FlyDataType.Account, entityType="D", printName="Bank Asset", fieldLength=22)
	B_Asset_Acct,
	//
	@FlyElement(name="Batch Description", description="Description of the Batch", dataType=FlyDataType.String, entityType="D", printName="Batch Description", fieldLength=255)
	BatchDescription,
	//
	@FlyElement(name="Batch Document No", description="Document Number of the Batch", dataType=FlyDataType.String, entityType="D", printName="Batch Document No", fieldLength=30)
	BatchDocumentNo,
	//
	@FlyElement(name="BBAN", description="Basic Bank Account Number", help="The Basic (or Domestic) Bank Account Number is used in Bank transfers (see also IBAN). For details see ISO 13616 and http://www.ecbs.org/", dataType=FlyDataType.String, entityType="D", printName="BBAN", fieldLength=40)
	BBAN,
	//
	@FlyElement(name="Bid Comment", description="Make a comment to a Bid Topic", help="Everyone can give comments concerning a Bid Topic - e.g. Questions, Suggestions", dataType=FlyDataType.ID, entityType="D", printName="Bid Comment", fieldLength=22)
	B_BidComment_ID,
	//
	@FlyElement(name="Bid", description="Bid for a Topic", help="You can create a bid for a topic.  Depending on the type, the highest bidder wins the Topic - or you participate in funding for a Topic.", dataType=FlyDataType.ID, entityType="D", printName="Bid", fieldLength=22)
	B_Bid_ID,
	//
	@FlyElement(name="Buyer Funds", description="Buyer Funds for Bids on Topics", help="Available Funds (from Payments) and Committed or Uncommitted funds for Bids", dataType=FlyDataType.ID, entityType="D", printName="Buyer Funds", fieldLength=22)
	B_BuyerFunds_ID,
	//
	@FlyElement(name="Beginning Balance", description="Balance prior to any transactions", help="The Beginning Balance is the balance prior to making any adjustments for payments or disbursements.", dataType=FlyDataType.Amount, entityType="D", printName="Beginning Balance", fieldLength=22)
	BeginningBalance,
	//
	@FlyElement(name="Beginning Qty Balance", description="Quantity Balance prior to any transactions", help="The Quantity Beginning Balance is the balance prior", dataType=FlyDataType.NONE, entityType="D", printName="Beginning Qty Balance", fieldLength=0)
	BeginningQtyBalance,
	//
	@FlyElement(name="Below Column", description="Print this column below the column index entered", help="This column is printed in a second line below the content of the first line identified. Please be aware, that this is depends on the actual sequence. Enter a 1 to add the info below the first column.", dataType=FlyDataType.Integer, entityType="D", printName="Below Column", fieldLength=22)
	BelowColumn,
	//
	@FlyElement(name="Date", description="Benchmark Date", help="Date of the Benchmark Data Point", dataType=FlyDataType.DateTime, entityType="D", printName="Date", fieldLength=7)
	BenchmarkDate,
	//
	@FlyElement(name="Benchmark Difference", description="Difference between Response Price and Benchmark Price", dataType=FlyDataType.Amount, entityType="D", printName="Benchmark Difference", fieldLength=22)
	BenchmarkDifference,
	//
	@FlyElement(name="Benchmark Price", description="Price to compare responses to", dataType=FlyDataType.CostsPrices, entityType="D", printName="Benchmark Price", fieldLength=22)
	BenchmarkPrice,
	//
	@FlyElement(name="Value", description="Benchmark Value", help="Value of the Benchmark Data Point", dataType=FlyDataType.Number, entityType="D", printName="Value", fieldLength=22)
	BenchmarkValue,
	//
	@FlyElement(name="Beneficiary", description="Business Partner to whom payment is made", help="The Beneficiary indicates the Business Partner to whom payment will be made.  This field is only displayed if the Paid to Third Party checkbox is selected.", dataType=FlyDataType.Table, entityType="D", printName="Beneficiary", fieldLength=22)
	Beneficiary,
	//
	@FlyElement(name="Best Response Amount", description="Best Response Amount", help="Filled by Rank Response Process", dataType=FlyDataType.Amount, entityType="D", printName="Best Response", fieldLength=22)
	BestResponseAmt,
	//
	@FlyElement(name="Bank Expense", description="Bank Expense Account", help="The Bank Expense Account identifies the account to be used for recording charges or fees incurred from this Bank.", dataType=FlyDataType.Account, entityType="D", printName="Bank Expense", fieldLength=22)
	B_Expense_Acct,
	//
	@FlyElement(name="Invoice Partner", description="Business Partner to be invoiced", help="If empty the shipment business partner will be invoiced", dataType=FlyDataType.Table, entityType="D", printName="Invoice Partner", fieldLength=22)
	Bill_BPartner_ID,
	//
	@FlyElement(name="Invoice Tax ID", dataType=FlyDataType.String, entityType="D", printName="Invoice Tax ID", fieldLength=20)
	Bill_BPTaxID,
	//
	@FlyElement(name="Invoice Partner Key", dataType=FlyDataType.String, entityType="D", printName="Invoice Partner Key", fieldLength=40)
	Bill_BPValue,
	//
	@FlyElement(name="Invoice Address", description="Address Used for Invoicing", dataType=FlyDataType.Location, entityType="D", printName="Invoice Address", fieldLength=22)
	Bill_C_Location_ID,
	//
	@FlyElement(name="Invoice Contact Name", dataType=FlyDataType.String, entityType="D", printName="Invoice Contact Name", fieldLength=60)
	Bill_ContactName,
	//
	@FlyElement(name="Invoice Location", description="Business Partner Location for invoicing", dataType=FlyDataType.Table, entityType="D", printName="Invoice Location", fieldLength=22)
	Bill_Location_ID,
	//
	@FlyElement(name="Invoice Name", dataType=FlyDataType.String, entityType="D", printName="Invoice Name", fieldLength=60)
	Bill_Name,
	//
	@FlyElement(name="Invoice Name2", dataType=FlyDataType.String, entityType="D", printName="Invoice Name2", fieldLength=60)
	Bill_Name2,
	//
	@FlyElement(name="Invoice Phone", dataType=FlyDataType.String, entityType="D", printName="Invoice Phone", fieldLength=40)
	Bill_Phone,
	//
	@FlyElement(name="Invoice Title", dataType=FlyDataType.String, entityType="D", printName="Invoice Title", fieldLength=40)
	Bill_Title,
	//
	@FlyElement(name="Invoice To", description="Bill to Address", help="The Bill/Invoice To indicates the address to use when remitting bills", dataType=FlyDataType.Table, entityType="D", printName="Invoice To", fieldLength=22)
	BillTo_ID,
	//
	@FlyElement(name="Invoice Contact", description="Business Partner Contact for invoicing", dataType=FlyDataType.Table, entityType="D", printName="Invoice Contact", fieldLength=22)
	Bill_User_ID,
	//
	@FlyElement(name="Binary Data", description="Binary Data", help="The Binary field stores binary data.", dataType=FlyDataType.Binary, entityType="D", printName="Binary", fieldLength=4000)
	BinaryData,
	//
	@FlyElement(name="Bank Interest Expense", description="Bank Interest Expense Account", help="The Bank Interest Expense Account identifies the account to be used for recording interest expenses.", dataType=FlyDataType.Account, entityType="D", printName="Bank Interest Expense", fieldLength=22)
	B_InterestExp_Acct,
	//
	@FlyElement(name="Bank Interest Revenue", description="Bank Interest Revenue Account", help="The Bank Interest Revenue Account identifies the account to be used for recording interest revenue from this Bank.", dataType=FlyDataType.Account, entityType="D", printName="Bank Interest Revenue", fieldLength=22)
	B_InterestRev_Acct,
	//
	@FlyElement(name="Bank In Transit", description="Bank In Transit Account", help="The Bank in Transit Account identifies the account to be used for funds which are in transit.", dataType=FlyDataType.Account, entityType="D", printName="Bank In Transit", fieldLength=22)
	B_InTransit_Acct,
	//
	@FlyElement(name="Birth City", description="Identifies a City of Birth", help="The City identifies a unique City for this Country or Region.", dataType=FlyDataType.String, entityType="ECA02", printName="Birth City", fieldLength=60)
	BirthCity,
	//
	@FlyElement(name="Birth Country Code", description="Country Code of Place of Birth", dataType=FlyDataType.String, entityType="ECA02", printName="Birth Country Code", fieldLength=60)
	BirthCountryCode,
	//
	@FlyElement(name="Birth Country", description="Country of Place of Birth", dataType=FlyDataType.Search, entityType="ECA02", printName="Birth Country", fieldLength=10)
	BirthCountry_ID,
	//
	@FlyElement(name="Birthday", description="Birthday or Anniversary day", help="Birthday or Anniversary day", dataType=FlyDataType.Date, entityType="D", printName="Birthday", fieldLength=7)
	Birthday,
	//
	@FlyElement(name="Birth Postal Zone", description="Postal Zone of Place of Birth", dataType=FlyDataType.String, entityType="ECA02", printName="Birth Postal Zone", fieldLength=60)
	BirthPostal,
	//
	@FlyElement(name="Region of Birth", description="Name of the Region of Birth", help="The Region Name defines the name that will print when this region is used in a document.", dataType=FlyDataType.Search, entityType="ECA02", printName="Region of Birth", fieldLength=10)
	BirthRegion_ID,
	//
	@FlyElement(name="Region of Birth", description="Name of the Region of Birth", help="The Region Name defines the name that will print when this region is used in a document.", dataType=FlyDataType.String, entityType="ECA02", printName="Region of Birth", fieldLength=60)
	BirthRegionName,
	//
	@FlyElement(name="Blood Group", dataType=FlyDataType.List, entityType="EE02", printName="Blood Group", fieldLength=3)
	BloodGroup,
	//
	@FlyElement(name="Blue", description="Color RGB blue value", dataType=FlyDataType.Integer, entityType="D", printName="Blue", fieldLength=22)
	Blue,
	//
	@FlyElement(name="2nd Blue", description="RGB value for second color", dataType=FlyDataType.Integer, entityType="D", printName="2nd Blue", fieldLength=22)
	Blue_1,
	//
	@FlyElement(name="Offer", description="Offer for a Topic", help="You can create an offer for a topic.", dataType=FlyDataType.ID, entityType="D", printName="Offer", fieldLength=22)
	B_Offer_ID,
	//
	@FlyElement(name="Component Type", description="BOM Product Type", dataType=FlyDataType.List, entityType="D", printName="Component Type", fieldLength=1)
	BOMProductType,
	//
	@FlyElement(name="BOM Quantity", description="Bill of Materials Quantity", help="The BOM Quantity indicates the quantity of the product in its Unit of Measure (multiplication)", dataType=FlyDataType.Quantity, entityType="D", printName="Qty", fieldLength=22)
	BOMQty,
	//
	@FlyElement(name="BOM Type", description="Type of BOM", help="The type of Bills of Materials determines the state", dataType=FlyDataType.List, entityType="D", printName="BOM Type", fieldLength=1)
	BOMType,
	//
	@FlyElement(name="BOM Use", description="The use of the Bill of Material", help="By default the Master BOM is used, if the alternatives are not defined", dataType=FlyDataType.List, entityType="D", printName="BOM Use", fieldLength=1)
	BOMUse,
	//
	@FlyElement(name="Access Type", description="Type of Access of the user/contact to Business Partner information and resources", help="If on User level, 'Full BP Access' is NOT selected, give access explicitly", dataType=FlyDataType.List, entityType="D", printName="Access Type", fieldLength=1)
	BPAccessType,
	//
	@FlyElement(name="B.Partner Column", description="Fully qualified Business Partner key column (C_BPartner_ID)", help="The Business Partner Column indicates the Business Partner to use when calculating this measurement", dataType=FlyDataType.String, entityType="D", printName="BPartner Column", fieldLength=60)
	BPartnerColumn,
	//
	@FlyElement(name="Partner Parent", description="Business Partner Parent", help="The parent (organization) of the Business Partner for reporting purposes.", dataType=FlyDataType.ID, entityType="D", printName="Partner Parent", fieldLength=22)
	BPartner_Parent_ID,
	//
	@FlyElement(name="Business Partner Key", description="Key of the Business Partner", dataType=FlyDataType.String, entityType="D", printName="Business Partner Key", fieldLength=40)
	BPartnerValue,
	//
	@FlyElement(name="Business Partner Key", description="The Key of the Business Partner", dataType=FlyDataType.String, entityType="D", printName="Partner Key", fieldLength=40)
	BPartner_Value,
	//
	@FlyElement(name="Payment Selection", description="AP Payment Selection Clearing Account", dataType=FlyDataType.Account, entityType="D", printName="Payment selection", fieldLength=22)
	B_PaymentSelect_Acct,
	//
	@FlyElement(name="Account Usage", description="Business Partner Bank Account usage", help="Determines how the bank account is used.", dataType=FlyDataType.List, entityType="D", printName="Account Usage", fieldLength=1)
	BPBankAcctUse,
	//
	@FlyElement(name="BP Contact Greeting", description="Greeting for Business Partner Contact", dataType=FlyDataType.String, entityType="D", printName="BP Contact Greeting", fieldLength=60)
	BPContactGreeting,
	//
	@FlyElement(name="BP Greeting", description="Greeting for Business Partner", dataType=FlyDataType.String, entityType="D", printName="BP Greeting", fieldLength=60)
	BPGreeting,
	//
	@FlyElement(name="BP Address", description="Address of the Business Partner", dataType=FlyDataType.NONE, entityType="D", printName="BP Address", fieldLength=0)
	BP_Location_ID,
	//
	@FlyElement(name="BP Name", dataType=FlyDataType.String, entityType="D", printName="BP Name", fieldLength=60)
	BPName,
	//
	@FlyElement(name="BP Name2", dataType=FlyDataType.String, entityType="D", printName="BP Name2", fieldLength=60)
	BPName2,
	//
	@FlyElement(name="Partner Tax ID", description="Tax ID of the Business Partner", dataType=FlyDataType.String, entityType="D", printName="BP Tax TD", fieldLength=20)
	BPTaxID,
	//
	@FlyElement(name="BP Search Key", description="Business Partner Key Value", help="Search Key of Business Partner", dataType=FlyDataType.String, entityType="D", printName="Customer No", fieldLength=40)
	BPValue,
	//
	@FlyElement(name="Branch ID", description="Bank Branch ID", help="Dependent on the loader, you may have to provide a bank branch ID", dataType=FlyDataType.String, entityType="D", printName="Branch ID", fieldLength=20)
	BranchID,
	//
	@FlyElement(name="Break Discount %", description="Trade Discount in Percent for the break level", help="Trade Discount in Percent for the break level", dataType=FlyDataType.Number, entityType="D", printName="Break Discount", fieldLength=22)
	BreakDiscount,
	//
	@FlyElement(name="Break Value", description="Low Value of trade discount break level", help="Starting Quantity or Amount Value for break level", dataType=FlyDataType.Number, entityType="D", printName="Break Value", fieldLength=22)
	BreakValue,
	//
	@FlyElement(name="Bank Revaluation Gain", description="Bank Revaluation Gain Account", help="The Bank Revaluation Gain Account identifies the account to be used for recording gains that are recognized when converting currencies.", dataType=FlyDataType.Account, entityType="D", printName="Bank Revaluation Gain", fieldLength=22)
	B_RevaluationGain_Acct,
	//
	@FlyElement(name="Bank Revaluation Loss", description="Bank Revaluation Loss Account", help="The Bank Revaluation Loss Account identifies the account to be used for recording losses that are recognized when converting currencies.", dataType=FlyDataType.Account, entityType="D", printName="Bank Revaluation Loss", fieldLength=22)
	B_RevaluationLoss_Acct,
	//
	@FlyElement(name="Seller Funds", description="Seller Funds from Offers on Topics", help="Available Funds (for Payments) and Committed or Uncommitted funds from Offers", dataType=FlyDataType.ID, entityType="D", printName="Seller Funds", fieldLength=22)
	B_SellerFunds_ID,
	//
	@FlyElement(name="Bank Settlement Gain", description="Bank Settlement Gain Account", help="The Bank Settlement Gain account identifies the account to be used when recording a currency gain when the settlement and receipt currency are not the same.", dataType=FlyDataType.Account, entityType="D", printName="Bank Settlement Gain", fieldLength=22)
	B_SettlementGain_Acct,
	//
	@FlyElement(name="Bank Settlement Loss", description="Bank Settlement Loss Account", help="The Bank Settlement loss account identifies the account to be used when recording a currency loss when the settlement and receipt currency are not the same.", dataType=FlyDataType.Account, entityType="D", printName="Bank Settlement Loss", fieldLength=22)
	B_SettlementLoss_Acct,
	//
	@FlyElement(name="Topic Category", description="Auction Topic Category", help="For an Auction Topic Type, define the different Categories used.", dataType=FlyDataType.TableDirect, entityType="D", printName="Topic Category", fieldLength=22)
	B_TopicCategory_ID,
	//
	@FlyElement(name="Topic", description="Auction Topic", help="Description of the item to sell or create.", dataType=FlyDataType.ID, entityType="D", printName="Topic", fieldLength=22)
	B_Topic_ID,
	//
	@FlyElement(name="Topic Type", description="Auction Topic Type", help="The Auction Topic Type determines what kind of auction is used for a particular area", dataType=FlyDataType.TableDirect, entityType="D", printName="Topic Type", fieldLength=22)
	B_TopicType_ID,
	//
	@FlyElement(name="Budget Code ", dataType=FlyDataType.NONE, entityType="D", printName="Budget Code", fieldLength=0)
	BudgetCode,
	//
	@FlyElement(name="Control Scope", description="Scope of the Budget Control", dataType=FlyDataType.List, entityType="D", printName="Control Scope", fieldLength=1)
	BudgetControlScope,
	//
	@FlyElement(name="Budget Status", description="Indicates the current status of this budget", help="The Budget Status indicates the current status of this budget (i.e Draft, Approved)", dataType=FlyDataType.List, entityType="D", printName="Budget Status", fieldLength=1)
	BudgetStatus,
	//
	@FlyElement(name="Unallocated Cash", description="Unallocated Cash Clearing Account", help="Receipts not allocated to Invoices", dataType=FlyDataType.Account, entityType="D", printName="Unallocated Cash", fieldLength=22)
	B_UnallocatedCash_Acct,
	//
	@FlyElement(name="Bank Unidentified Receipts", description="Bank Unidentified Receipts Account", help="The Bank Unidentified Receipts Account identifies the account to be used when recording receipts that can not be reconciled at the present time.", dataType=FlyDataType.Account, entityType="D", printName="Bank Unidentified", fieldLength=22)
	B_Unidentified_Acct,
	//
	@FlyElement(name="Accounting Processor", description="Accounting Processor/Server Parameters", help="Accounting Processor/Server Parameters", dataType=FlyDataType.TableDirect, entityType="D", printName="Accounting Processor", fieldLength=22)
	C_AcctProcessor_ID,
	//
	@FlyElement(name="Accounting Processor Log", description="Result of the execution of the Accounting Processor", help="Result of the execution of the Accounting Processor", dataType=FlyDataType.ID, entityType="D", printName="Acct Processor Log", fieldLength=22)
	C_AcctProcessorLog_ID,
	//
	@FlyElement(name="Primary Accounting Schema", description="Primary rules for accounting", help="An Accounting  Schema defines the rules used accounting such as costing method, currency and calendar.", dataType=FlyDataType.Table, entityType="D", printName="Primary Accounting Schema", fieldLength=22)
	C_AcctSchema1_ID,
	//
	@FlyElement(name="Acct.Schema Element", dataType=FlyDataType.ID, entityType="D", printName="Acct.Schema Element", fieldLength=22)
	C_AcctSchema_Element_ID,
	//
	@FlyElement(name="Accounting Schema", description="Rules for accounting", help="An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar", dataType=FlyDataType.TableDirect, entityType="D", printName="Accounting Schema", fieldLength=22)
	C_AcctSchema_ID,
	//
	@FlyElement(name="Activity", description="Business Activity", help="Activities indicate tasks that are performed and used to utilize Activity based Costing", dataType=FlyDataType.Table, entityType="D", printName="Activity", fieldLength=22)
	C_Activity_ID,
	//
	@FlyElement(name="Calculation Class", description="Java Class for calculation, implementing Interface Measure", help="The Calculation Class indicates the Java Class used for calculating measures.", dataType=FlyDataType.String, entityType="D", printName="Calculation Class", fieldLength=60)
	CalculationClass,
	//
	@FlyElement(name="Calculation", dataType=FlyDataType.List, entityType="D", printName="Calculation", fieldLength=1)
	CalculationType,
	//
	@FlyElement(name="Year", description="Calendar Year", help="The Year identifies the Calendar year", dataType=FlyDataType.String, entityType="D", printName="Year", fieldLength=4)
	CalendarYear,
	//
	@FlyElement(name="Allocation", description="Payment allocation", dataType=FlyDataType.TableDirect, entityType="D", printName="Allocation", fieldLength=22)
	C_AllocationHdr_ID,
	//
	@FlyElement(name="Allocation Line", description="Allocation Line", help="Allocation of Cash/Payment to Invoice", dataType=FlyDataType.ID, entityType="D", printName="Allocation Line", fieldLength=22)
	C_AllocationLine_ID,
	//
	@FlyElement(name="Callout", description="Fully qualified class names and method - separated by semicolons", help="A Callout allow you to create Java extensions to perform certain tasks always after a value changed. Callouts should not be used for validation but consequences of a user selecting a certain value.	The callout is a Java class implementing org.compiere.model.Callout and a method name to call.  Example: 'org.compiere.model.CalloutRequest.copyText' instantiates the class 'CalloutRequest' and calls the method 'copyText'. You can have multiple callouts by separating them via a semicolon", dataType=FlyDataType.String, entityType="D", printName="Callout", fieldLength=255)
	Callout,
	//
	@FlyElement(name="Campaign Value", dataType=FlyDataType.String, entityType="EE01", printName="Campaign Value", fieldLength=40)
	CampaignValue,
	//
	@FlyElement(name="Capture Sequence", help="The Capture Sequence defines the fields to be used when capturing an address on this country.  The following notations are used: @CO@=Country, @C@=City, @P@=Postal, @A@=PostalAdd, @R@=Region, @A1@=Address 1 to @A4@=Address 4.  Country is always mandatory, add a bang ! to make another field mandatory, for example @C!@ makes city mandatory, @A1!@ makes Address 1 mandatory.", dataType=FlyDataType.String, entityType="D", printName="Capture Sequence", fieldLength=60)
	CaptureSequence,
	//
	@FlyElement(name="Card Bank Account", description="Bank Account on which card transactions will be processed", dataType=FlyDataType.Table, entityType="D", printName="Card Bank Account", fieldLength=22)
	Card_BankAccount_ID,
	//
	@FlyElement(name="Transfer Card trx to", description="Bank account on which to transfer Card transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Card trx to", fieldLength=22)
	CardTransferBankAccount_ID,
	//
	@FlyElement(name="Transfer Card trx to", description="Cash Book on which to transfer all Card transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Card trx to", fieldLength=22)
	CardTransferCashBook_ID,
	//
	@FlyElement(name="Card Transfer Type", dataType=FlyDataType.List, entityType="D", printName="Card Transfer Type", fieldLength=1)
	CardTransferType,
	//
	@FlyElement(name="Career Level Name", description="The Career Level Name for this position", help="Career level name required for this position", dataType=FlyDataType.String, entityType="EE02", printName="Career Level Name", fieldLength=255)
	CareerLevelName,
	//
	@FlyElement(name="Career Level Value", description="The Career Level Value for this position", help="Career level value required for this position", dataType=FlyDataType.String, entityType="EE02", printName="Career Level Value", fieldLength=60)
	CareerLevelValue,
	//
	@FlyElement(name="Carrier Number", dataType=FlyDataType.String, entityType="EE03", printName="Carrier Number", fieldLength=0)
	CarrierNumber,
	//
	@FlyElement(name="Cash Book Transfer Type", description="Where the money in the cash book should be transfered to. Either a Bank Account or another Cash Book", dataType=FlyDataType.List, entityType="D", printName="Cash Book Transfer Type", fieldLength=1)
	CashBookTransferType,
	//
	@FlyElement(name="CashDrawer", dataType=FlyDataType.String, entityType="D", printName="Cash Drawer", fieldLength=120)
	CashDrawer,
	//
	@FlyElement(name="Transfer Cash trx to", description="Bank Account on which to transfer all Cash transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Cash trx to", fieldLength=22)
	CashTransferBankAccount_ID,
	//
	@FlyElement(name="Transfer Cash trx to", description="Cash Book on which to transfer all Cash transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Cash trx to", fieldLength=22)
	CashTransferCashBook_ID,
	//
	@FlyElement(name="Cash Type", description="Source of Cash", help="The Cash Type indicates the source for this Cash Journal Line.", dataType=FlyDataType.List, entityType="D", printName="Cash Type", fieldLength=1)
	CashType,
	//
	@FlyElement(name="Category", dataType=FlyDataType.String, entityType="D", printName="Category", fieldLength=120)
	Category,
	//
	@FlyElement(name="Category Column", description="Fully qualified data category column", help="The Category Column determines how the chart data is grouped", dataType=FlyDataType.String, entityType="D", printName="Category Column", fieldLength=60)
	CategoryColumn,
	//
	@FlyElement(name="Category Name", description="Name of the Category", dataType=FlyDataType.String, entityType="D", printName="Category Name", fieldLength=60)
	CategoryName,
	//
	@FlyElement(name="Category Type", description="Source of the Journal with this category", help="The Category Type indicates the source of the journal for this category.  Journals can be generated from a document, entered manually or imported.", dataType=FlyDataType.List, entityType="D", printName="Category Type", fieldLength=1)
	CategoryType,
	//
	@FlyElement(name="Bank Account Document", description="Checks, Transfers, etc.", help="Bank documents, you generate or track", dataType=FlyDataType.ID, entityType="D", printName="Bank Account Doc", fieldLength=22)
	C_BankAccountDoc_ID,
	//
	@FlyElement(name="Bank Account", description="Account at the Bank", help="The Bank Account identifies an account at this Bank.", dataType=FlyDataType.ID, entityType="D", printName="Bank Account", fieldLength=22)
	C_BankAccount_ID,
	//
	@FlyElement(name="Bank", description="Bank", help="The Bank is a unique identifier of a Bank for this Organization or for a Business Partner with whom this Organization transacts.", dataType=FlyDataType.ID, entityType="D", printName="Bank", fieldLength=22)
	C_Bank_ID,
	//
	@FlyElement(name="Bank Statement", description="Bank Statement of account", help="The Bank Statement identifies a unique Bank Statement for a defined time period.  The statement defines all transactions that occurred", dataType=FlyDataType.ID, entityType="D", printName="Bank Statement", fieldLength=22)
	C_BankStatement_ID,
	//
	@FlyElement(name="Bank statement line", description="Line on a statement from this Bank", help="The Bank Statement Line identifies a unique transaction (Payment, Withdrawal, Charge) for the defined time period at this Bank.", dataType=FlyDataType.ID, entityType="D", printName="Bank statement line", fieldLength=22)
	C_BankStatementLine_ID,
	//
	@FlyElement(name="Bank Statement Loader", description="Definition of Bank Statement Loader (SWIFT, OFX)", help="The loader definition provides the parameters to load bank statements from EFT formats like SWIFT (MT940) or OFX", dataType=FlyDataType.ID, entityType="D", printName="Bank Statement Loader", fieldLength=22)
	C_BankStatementLoader_ID,
	//
	@FlyElement(name="Bank Statement Matcher", description="Algorithm to match Bank Statement Info to Business Partners, Invoices and Payments", help="An algorithm to find Business Partners, Invoices, Payments in imported Bank Statements.  The class needs to implement org.compiere.impexp.BankStatementMatcherInterface", dataType=FlyDataType.ID, entityType="D", printName="Bank Statement Matcher", fieldLength=22)
	C_BankStatementMatcher_ID,
	//
	@FlyElement(name="Cash Book Asset", description="Cash Book Asset Account", help="The Cash Book Asset Account identifies the account to be used for recording payments into and disbursements from this cash book.", dataType=FlyDataType.Account, entityType="D", printName="Cash Book Asset", fieldLength=22)
	CB_Asset_Acct,
	//
	@FlyElement(name="Cash Transfer", description="Cash Transfer Clearing Account", help="Account for Invoices paid by cash", dataType=FlyDataType.Account, entityType="D", printName="Cash Transfer", fieldLength=22)
	CB_CashTransfer_Acct,
	//
	@FlyElement(name="Cash Book Differences", description="Cash Book Differences Account", help="The Cash Book Differences Account identifies the account to be used for recording any differences that affect this cash book", dataType=FlyDataType.Account, entityType="D", printName="Cash Book Differences", fieldLength=22)
	CB_Differences_Acct,
	//
	@FlyElement(name="Cash Book Expense", description="Cash Book Expense Account", help="The Cash Book Expense Account identifies the account to be used for general, non itemized expenses.", dataType=FlyDataType.Account, entityType="D", printName="Cash Book Expense", fieldLength=22)
	CB_Expense_Acct,
	//
	@FlyElement(name="Template B.Partner", description="Business Partner used for creating new Business Partners on the fly", help="When creating a new Business Partner from the Business Partner Search Field (right-click: Create), the selected business partner is used as a template, e.g. to define price list, payment terms, etc.", dataType=FlyDataType.Search, entityType="D", printName="Template BPartner", fieldLength=22)
	C_BPartnerCashTrx_ID,
	//
	@FlyElement(name="Business Partner ", description="Identifies a Business Partner", help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson", dataType=FlyDataType.Search, entityType="D", printName="Business Partner ", fieldLength=22)
	C_BPartner_ID,
	//
	@FlyElement(name="Partner Location", description="Identifies the (ship to) address for this Business Partner", help="The Partner address indicates the location of a Business Partner", dataType=FlyDataType.TableDirect, entityType="D", printName="Partner Location", fieldLength=22)
	C_BPartner_Location_ID,
	//
	@FlyElement(name="Related Partner", description="Related Business Partner", help="The related Business Partner Acts on behalf of the Business Partner - example the Related Partner pays invoices of the Business Partner - or we pay to the Related Partner for invoices received from the Business Partner", dataType=FlyDataType.Search, entityType="D", printName="Related Partner", fieldLength=22)
	C_BPartnerRelation_ID,
	//
	@FlyElement(name="Related Partner Location", description="Location of the related Business Partner", dataType=FlyDataType.Table, entityType="D", printName="Related Partner Location", fieldLength=22)
	C_BPartnerRelation_Location_ID,
	//
	@FlyElement(name="BPartner (Agent)", description="Business Partner (Agent or Sales Rep)", dataType=FlyDataType.Table, entityType="D", printName="BPartner (Agent)", fieldLength=10)
	C_BPartnerSR_ID,
	//
	@FlyElement(name="Partner Bank Account", description="Bank Account of the Business Partner", help="The Partner Bank Account identifies the bank account to be used for this Business Partner", dataType=FlyDataType.ID, entityType="D", printName="Partner Bank Account", fieldLength=22)
	C_BP_BankAccount_ID,
	//
	@FlyElement(name="EDI Definition", description="Electronic Data Interchange", dataType=FlyDataType.ID, entityType="D", printName="EDI Definition", fieldLength=22)
	C_BP_EDI_ID,
	//
	@FlyElement(name="Business Partner Group", description="Business Partner Group", help="The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.", dataType=FlyDataType.TableDirect, entityType="D", printName="BPartner Group", fieldLength=22)
	C_BP_Group_ID,
	//
	@FlyElement(name="Partner Relation", description="Business Partner Relation", help="Business Partner Relation allow to maintain Third Party Relationship rules: who receives invoices for shipments or pays for invoices.", dataType=FlyDataType.ID, entityType="D", printName="Partner Relation", fieldLength=22)
	C_BP_Relation_ID,
	//
	@FlyElement(name="Cash Book Receipt", description="Cash Book Receipts Account", help="The Cash Book Receipt Account identifies the account to be used for general, non itemized cash book receipts.", dataType=FlyDataType.Account, entityType="D", printName="Cash Book Receipt", fieldLength=22)
	CB_Receipt_Acct,
	//
	@FlyElement(name="Calendar", description="Accounting Calendar Name", help="The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used.  For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30.", dataType=FlyDataType.ID, entityType="D", printName="Calendar", fieldLength=22)
	C_Calendar_ID,
	//
	@FlyElement(name="Campaign", description="Marketing Campaign", help="The Campaign defines a unique marketing program.  Projects can be associated with a pre defined Marketing Campaign.  You can then report based on a specific Campaign.", dataType=FlyDataType.Table, entityType="D", printName="Campaign", fieldLength=22)
	C_Campaign_ID,
	//
	@FlyElement(name="Cash Book", description="Cash Book for recording petty cash transactions", help="The Cash Book identifies a unique cash book.  The cash book is used to record cash transactions.", dataType=FlyDataType.TableDirect, entityType="D", printName="Cash Book", fieldLength=22)
	C_CashBook_ID,
	//
	@FlyElement(name="Cash BPartner", description="BPartner to be used for Cash transactions", dataType=FlyDataType.Table, entityType="D", printName="Cash BPartner", fieldLength=22)
	C_CashBPartner_ID,
	//
	@FlyElement(name="C_CashFlow_ID", dataType=FlyDataType.NONE, entityType="EE06", printName="C_CashFlow_ID", fieldLength=0)
	C_CashFlow_ID,
	//
	@FlyElement(name="Cash Journal", description="Cash Journal", help="The Cash Journal uniquely identifies a Cash Journal.  The Cash Journal will record transactions for the cash bank account", dataType=FlyDataType.ID, entityType="D", printName="Cash Journal", fieldLength=22)
	C_Cash_ID,
	//
	@FlyElement(name="Cash Journal Line", description="Cash Journal Line", help="The Cash Journal Line indicates a unique line in a cash journal.", dataType=FlyDataType.Search, entityType="D", printName="Cash Line", fieldLength=22)
	C_CashLine_ID,
	//
	@FlyElement(name="Channel", description="Sales Channel", help="The Sales Channel identifies a channel (or method) of sales generation.", dataType=FlyDataType.TableDirect, entityType="D", printName="Channel", fieldLength=22)
	C_Channel_ID,
	//
	@FlyElement(name="Charge", description="Additional document charges", help="The Charge indicates a type of Charge (Handling, Shipping, Restocking)", dataType=FlyDataType.Table, entityType="D", printName="Charge", fieldLength=22)
	C_Charge_ID,
	//
	@FlyElement(name="Charge Type", dataType=FlyDataType.ID, entityType="D", printName="Charge Type", fieldLength=22)
	C_ChargeType_ID,
	//
	@FlyElement(name="City", description="City", help="City in a country", dataType=FlyDataType.Search, entityType="D", printName="City", fieldLength=22)
	C_City_ID,
	//
	@FlyElement(name="City Value", dataType=FlyDataType.NONE, entityType="D", printName="City Value", fieldLength=0)
	C_City_Value,
	//
	@FlyElement(name="Commission Amount", description="Generated Commission Amount ", help="The Commission Amount indicates the resulting amount from a Commission Run.", dataType=FlyDataType.ID, entityType="D", printName="Comm Amt", fieldLength=22)
	C_CommissionAmt_ID,
	//
	@FlyElement(name="Commission Detail", description="Supporting information for Commission Amounts", help="The Commission Detail provides supporting information on a Commission Run.  Each document line that was part of the Commission Run will be reflected here.", dataType=FlyDataType.ID, entityType="D", printName="Comm Detail", fieldLength=22)
	C_CommissionDetail_ID,
	//
	@FlyElement(name="Commission Group", dataType=FlyDataType.TableDirect, entityType="D", printName="Commission Group", fieldLength=22)
	C_CommissionGroup_ID,
	//
	@FlyElement(name="Commission", description="Commission", help="The Commission Rules or internal or external company agents, sales reps or vendors.", dataType=FlyDataType.ID, entityType="D", printName="Commission", fieldLength=22)
	C_Commission_ID,
	//
	@FlyElement(name="Commission Line", description="Commission Line", help="The Commission Line is a unique instance of a Commission Run.  If the commission run was done in summary mode then there will be a single line representing the selected documents totals.  If the commission run was done in detail mode then each document that was included in the run will have its own commission line.", dataType=FlyDataType.TableDirect, entityType="D", printName="Comm Line", fieldLength=22)
	C_CommissionLine_ID,
	//
	@FlyElement(name="Commission Run", description="Commission Run or Process", help="The Commission Run is a unique system defined identifier of a specific run of commission.  When a Commission is processed on the Commission Screen, the Commission Run will display.", dataType=FlyDataType.TableDirect, entityType="D", printName="Comm Run", fieldLength=22)
	C_CommissionRun_ID,
	//
	@FlyElement(name="Commission Sales Rep ID", dataType=FlyDataType.NONE, entityType="D", printName="Commission Sales Rep ID", fieldLength=0)
	C_CommissionSalesRep_ID,
	//
	@FlyElement(name="Contact Activity", description="Events, tasks, communications related to a contact", dataType=FlyDataType.NONE, entityType="D", printName="Contact Activity", fieldLength=0)
	C_ContactActivity_ID,
	//
	@FlyElement(name="Conversion Rate", description="Rate used for converting currencies", help="The Conversion Rate defines the rate (multiply or divide) to use when converting a source currency to an accounting currency.", dataType=FlyDataType.ID, entityType="D", printName="Conversion Rate", fieldLength=22)
	C_Conversion_Rate_ID,
	//
	@FlyElement(name="Currency Type", description="Currency Conversion Rate Type", help="The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.", dataType=FlyDataType.TableDirect, entityType="D", printName="Currency Type", fieldLength=22)
	C_ConversionType_ID,
	//
	@FlyElement(name="Revaluation Conversion Type", description="Revaluation Currency Conversion Type", dataType=FlyDataType.Table, entityType="D", printName="Reval Conversion Type", fieldLength=22)
	C_ConversionTypeReval_ID,
	//
	@FlyElement(name="Country", description="Country ", help="The Country defines a Country.  Each Country must be defined before it can be used in any document.", dataType=FlyDataType.TableDirect, entityType="D", printName="Country", fieldLength=22)
	C_Country_ID,
	//
	@FlyElement(name="Currency", description="The Currency for this record", help="Indicates the Currency to be used when processing or reporting on this record", dataType=FlyDataType.ID, entityType="D", printName="Currency", fieldLength=22)
	C_Currency_ID,
	//
	@FlyElement(name="Currency To", description="Target currency", help="The Currency To defines the target currency for this conversion rate.", dataType=FlyDataType.Table, entityType="D", printName="Currency To", fieldLength=22)
	C_Currency_ID_To,
	//
	@FlyElement(name="Project Cycle", description="Identifier for this Project Reporting Cycle", help="Identifies a Project Cycle which can be made up of one or more cycle steps and cycle phases.", dataType=FlyDataType.ID, entityType="D", printName="Project Cycle", fieldLength=22)
	C_Cycle_ID,
	//
	@FlyElement(name="Cycle Step", description="The step for this Cycle", help="Identifies one or more steps within a Project Cycle. A cycle Step has multiple Phases", dataType=FlyDataType.TableDirect, entityType="D", printName="Cycle Step", fieldLength=22)
	C_CycleStep_ID,
	//
	@FlyElement(name="Confirmed Mfg Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Confirmed Mfg Order Doc Type", fieldLength=0)
	C_DocType_ConfirmedOrder,
	//
	@FlyElement(name="Counter Document", description="Counter Document Relationship", help="When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction.  Example: a 'Standard Order' creates a 'Standard PO'. 	If you define a relationship here, you overwrite the default counter document type in the Document Type definition. This allows you to define a specific mapping.", dataType=FlyDataType.ID, entityType="D", printName="Counter Document", fieldLength=22)
	C_DocTypeCounter_ID,
	//
	@FlyElement(name="Difference Document", description="Document type for generating in dispute Shipments", help="If the confirmation contains differences, the original document is split allowing the original document (shipment) to be processed and updating Inventory - and the newly created document for handling the dispute at a later time. Until the confirmation is processed, the inventory is not updated.", dataType=FlyDataType.Table, entityType="D", printName="Difference Doc", fieldLength=22)
	C_DocTypeDifference_ID,
	//
	@FlyElement(name="Document Type", description="Document type or rules", help="The Document Type determines document sequence and processing rules", dataType=FlyDataType.ID, entityType="D", printName="Doc Type", fieldLength=22)
	C_DocType_ID,
	//
	@FlyElement(name="Document Type for Invoice", description="Document type used for invoices generated from this sales document", help="The Document Type for Invoice indicates the document type that will be used when an invoice is generated from this sales document.  This field will display only when the base document type is Sales Order.", dataType=FlyDataType.Table, entityType="D", printName="Doc Type Invoice", fieldLength=22)
	C_DocTypeInvoice_ID,
	//
	@FlyElement(name="Planned Mfg Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Planned Mfg Order Doc Type", fieldLength=0)
	C_DocType_PlannedOrder,
	//
	@FlyElement(name="Purchase Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Purchase Order Doc Type", fieldLength=10)
	C_DocType_PO,
	//
	@FlyElement(name="Document Type for ProForma", description="Document type used for pro forma invoices generated from this sales document", help="he Document Type for Invoice indicates the document type that will be used when an invoice is generated from this sales document.  This field will display only when the base document type is Sales Order and the Pro Forma Invoice checkbox is selected", dataType=FlyDataType.Table, entityType="D", printName="Doc Type ProForma", fieldLength=22)
	C_DocTypeProforma_ID,
	//
	@FlyElement(name="Replenish Plan Requisition Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Replenish Plan Requisition Doc Type", fieldLength=0)
	C_DocType_Requisition,
	//
	@FlyElement(name="Revaluation Document Type", description="Document Type for Revaluation Journal", dataType=FlyDataType.Table, entityType="D", printName="Doc Type Reval", fieldLength=10)
	C_DocTypeReval_ID,
	//
	@FlyElement(name="Document Type for Shipment", description="Document type used for shipments generated from this sales document", help="he Document Type for Shipments indicates the document type that will be used when a shipment is generated from this sales document.  This field will display only when the base document type is Sales Order.", dataType=FlyDataType.Table, entityType="D", printName="Doc Type Shipment", fieldLength=22)
	C_DocTypeShipment_ID,
	//
	@FlyElement(name="Target Document Type", description="Target document type for conversing documents", help="You can convert document types (e.g. from Offer to Order or Invoice).  The conversion is then reflected in the current type.  This processing is initiated by selecting the appropriate Document Action.", dataType=FlyDataType.Table, entityType="D", printName="Target Doc Type", fieldLength=22)
	C_DocTypeTarget_ID,
	//
	@FlyElement(name="Dunning", description="Dunning Rules for overdue invoices", help="The Dunning indicates the rules and method of dunning for past due payments.", dataType=FlyDataType.TableDirect, entityType="D", printName="Dunning", fieldLength=22)
	C_Dunning_ID,
	//
	@FlyElement(name="Dunning Level", dataType=FlyDataType.ID, entityType="D", printName="Dunning Level", fieldLength=22)
	C_DunningLevel_ID,
	//
	@FlyElement(name="Dunning Run Entry", description="Dunning Run Entry", dataType=FlyDataType.ID, entityType="D", printName="Dunning Run Entry", fieldLength=22)
	C_DunningRunEntry_ID,
	//
	@FlyElement(name="Dunning Run", description="Dunning Run", dataType=FlyDataType.ID, entityType="D", printName="Dunning Run", fieldLength=22)
	C_DunningRun_ID,
	//
	@FlyElement(name="Dunning Run Line", description="Dunning Run Line", dataType=FlyDataType.ID, entityType="D", printName="Dunning Run Line", fieldLength=22)
	C_DunningRunLine_ID,
	//
	@FlyElement(name="Element", description="Accounting Element", help="The Account Element uniquely identifies an Account Type.  These are commonly known as a Chart of Accounts.", dataType=FlyDataType.ID, entityType="D", printName="Element", fieldLength=22)
	C_Element_ID,
	//
	@FlyElement(name="Account Element", description="Account Element", help="Account Elements can be natural accounts or user defined values.", dataType=FlyDataType.ID, entityType="D", printName="Account Element", fieldLength=22)
	C_ElementValue_ID,
	//
	@FlyElement(name="Greeting", description="Greeting to print on correspondence", help="The Greeting identifies the greeting to print on correspondence.", dataType=FlyDataType.ID, entityType="D", printName="Greeting", fieldLength=22)
	C_Greeting_ID,
	//
	@FlyElement(name="ChangeAmt", dataType=FlyDataType.Amount, entityType="D", printName="ChangeAmt", fieldLength=22)
	ChangeAmt,
	//
	@FlyElement(name="ChangeDate", dataType=FlyDataType.DateTime, entityType="D", printName="ChangeDate", fieldLength=7)
	ChangeDate,
	//
	@FlyElement(name="Change the current Setting", description="Confirm that you want to change the current setting", dataType=FlyDataType.NONE, entityType="D", printName="Change Setting", fieldLength=0)
	ChangeSetting,
	//
	@FlyElement(name="ChangeType", dataType=FlyDataType.List, entityType="D", printName="ChangeType", fieldLength=3)
	ChangeType,
	//
	@FlyElement(name="Character Data", description="Long Character Field", dataType=FlyDataType.LongText, entityType="D", printName="Character Data", fieldLength=4000)
	CharacterData,
	//
	@FlyElement(name="Chargeable Quantity", dataType=FlyDataType.Integer, entityType="D", printName="Chargeable Qty", fieldLength=22)
	ChargeableQty,
	//
	@FlyElement(name="Charge amount", description="Charge Amount", help="The Charge Amount indicates the amount for an additional charge.", dataType=FlyDataType.Amount, entityType="D", printName="Charge Amt", fieldLength=22)
	ChargeAmt,
	//
	@FlyElement(name="Charge fee", description="Indicates if fees will be charged for overdue invoices", help="The Charge Fee checkbox indicates if the dunning letter will include fees for overdue invoices", dataType=FlyDataType.YesNo, entityType="D", printName="Charge fee", fieldLength=1)
	ChargeFee,
	//
	@FlyElement(name="Charge Interest", description="Indicates if interest will be charged on overdue invoices", help="The Charge Interest checkbox indicates if interest will be charged on overdue invoice amounts.", dataType=FlyDataType.YesNo, entityType="D", printName="Charge Interest", fieldLength=1)
	ChargeInterest,
	//
	@FlyElement(name="Charge Name", description="Name of the Charge", dataType=FlyDataType.String, entityType="D", printName="Charge Name", fieldLength=60)
	ChargeName,
	//
	@FlyElement(name="Orientation", description="The orientation of the chart.", dataType=FlyDataType.List, entityType="D", printName="Orientation", fieldLength=1)
	ChartOrientation,
	//
	@FlyElement(name="Chart Type", description="Type fo chart to render", dataType=FlyDataType.List, entityType="D", printName="Chart Type", fieldLength=2)
	ChartType,
	//
	@FlyElement(name="Chat Entry Type", description="Type of Chat/Forum Entry", dataType=FlyDataType.List, entityType="D", printName="Chat Entry Type", fieldLength=1)
	ChatEntryType,
	//
	@FlyElement(name="Check Bank Account", description="Bank Account to be used for processing Check transactions", dataType=FlyDataType.Table, entityType="D", printName="Check Bank Account", fieldLength=22)
	Check_BankAccount_ID,
	//
	@FlyElement(name="Check Complete", dataType=FlyDataType.Button, entityType="D", printName="Check Complete", fieldLength=1)
	CheckComplete,
	//
	@FlyElement(name="Last Checked", description="Info when we did the last check", help="Info on the last check date", dataType=FlyDataType.DateTime, entityType="D", printName="Last Checked", fieldLength=7)
	Checked,
	//
	@FlyElement(name="Validate current (new) Value", description="Ensure that the new value of the change is the current value in the system (i.e. no change since then)", dataType=FlyDataType.NONE, entityType="D", printName="Validate current (new) Value", fieldLength=0)
	CheckNewValue,
	//
	@FlyElement(name="Check No", description="Check Number", help="The Check Number indicates the number on the check.", dataType=FlyDataType.String, entityType="D", printName="Check No", fieldLength=20)
	CheckNo,
	//
	@FlyElement(name="Validate current (old) Value", description="Ensure that the old value of the change is the current value in the system (i.e. original situation)", dataType=FlyDataType.NONE, entityType="D", printName="Validate current (old) Value", fieldLength=0)
	CheckOldValue,
	//
	@FlyElement(name="Check Print Format", description="Print Format for printing Checks", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="Check Print Format", fieldLength=22)
	Check_PrintFormat_ID,
	//
	@FlyElement(name="Tranfer Check trx to", description="Bank account on which to transfer Check transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Check trx to", fieldLength=22)
	CheckTransferBankAccount_ID,
	//
	@FlyElement(name="Transfer Check trx to", description="Cash Book on which to transfer all Check transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Check trx to", fieldLength=22)
	CheckTransferCashBook_ID,
	//
	@FlyElement(name="Check Transfer Type", dataType=FlyDataType.List, entityType="D", printName="Check Transfer Type", fieldLength=1)
	CheckTransferType,
	//
	@FlyElement(name="Cheque No", dataType=FlyDataType.String, entityType="D", printName="Cheque No", fieldLength=120)
	ChequeNo,
	//
	@FlyElement(name="Charge Expense", description="Charge Expense Account", help="The Charge Expense Account identifies the account to use when recording charges paid to vendors.", dataType=FlyDataType.Account, entityType="D", printName="Charge Expense", fieldLength=22)
	Ch_Expense_Acct,
	//
	@FlyElement(name="Charge Revenue", description="Charge Revenue Account", help="The Charge Revenue Account identifies the account to use when recording charges paid by customers.", dataType=FlyDataType.Account, entityType="D", printName="Charge Revenue", fieldLength=22)
	Ch_Revenue_Acct,
	//
	@FlyElement(name="Invoice Batch", description="Expense Invoice Batch Header", dataType=FlyDataType.ID, entityType="D", printName="Invoice Batch", fieldLength=22)
	C_InvoiceBatch_ID,
	//
	@FlyElement(name="Invoice Batch Line", description="Expense Invoice Batch Line", dataType=FlyDataType.ID, entityType="D", printName="Invoice Batch Line", fieldLength=22)
	C_InvoiceBatchLine_ID,
	//
	@FlyElement(name="Invoice", description="Invoice Identifier", help="The Invoice Document.", dataType=FlyDataType.ID, entityType="D", printName="Invoice", fieldLength=22)
	C_Invoice_ID,
	//
	@FlyElement(name="Invoice Line", description="Invoice Detail Line", help="The Invoice Line uniquely identifies a single line of an Invoice.", dataType=FlyDataType.ID, entityType="D", printName="Invoice Line", fieldLength=22)
	C_InvoiceLine_ID,
	//
	@FlyElement(name="Invoice Payment Schedule", description="Invoice Payment Schedule", help="The Invoice Payment Schedule determines when partial payments are due.", dataType=FlyDataType.ID, entityType="D", printName="Invoice Pay Schedule", fieldLength=22)
	C_InvoicePaySchedule_ID,
	//
	@FlyElement(name="Request Invoice", description="The generated invoice for this request", help="The optionally generated invoice for the request", dataType=FlyDataType.Search, entityType="D", printName="Request Invoice", fieldLength=10)
	C_InvoiceRequest_ID,
	//
	@FlyElement(name="Invoice Schedule", description="Schedule for generating Invoices", help="The Invoice Schedule identifies the frequency used when generating invoices.", dataType=FlyDataType.ID, entityType="D", printName="Invoice Schedule", fieldLength=22)
	C_InvoiceSchedule_ID,
	//
	@FlyElement(name="City", description="Identifies a City", help="The City identifies a unique City for this Country or Region.", dataType=FlyDataType.String, entityType="D", printName="City", fieldLength=60)
	City,
	//
	@FlyElement(name="Position Assignment", description="Assignment of Employee (User) to Job Position", dataType=FlyDataType.ID, entityType="D", printName="Position Assignment", fieldLength=10)
	C_JobAssignment_ID,
	//
	@FlyElement(name="Position Category", description="Job Position Category", help="Classification of Job Positions", dataType=FlyDataType.TableDirect, entityType="D", printName="Position Category", fieldLength=10)
	C_JobCategory_ID,
	//
	@FlyElement(name="Position", description="Job Position", dataType=FlyDataType.ID, entityType="D", printName="Position", fieldLength=10)
	C_Job_ID,
	//
	@FlyElement(name="Position Remuneration", description="Remuneration for the Position", dataType=FlyDataType.ID, entityType="D", printName="Position Remuneration", fieldLength=10)
	C_JobRemuneration_ID,
	//
	@FlyElement(name="Claimed Amount", description="Claimed Amount", help="The Claimed Amount of Insurance", dataType=FlyDataType.Number, entityType="EE02", printName="Claimed Amount", fieldLength=0)
	ClaimedAmount,
	//
	@FlyElement(name="Landed Cost Allocation", description="Allocation for Land Costs", dataType=FlyDataType.ID, entityType="D", printName="Landed Cost Allocation", fieldLength=10)
	C_LandedCostAllocation_ID,
	//
	@FlyElement(name="Landed Cost", description="Landed cost to be allocated to material receipts", help="Landed costs allow you to allocate costs to previously received material receipts. Examples are freight, excise tax, insurance, etc.", dataType=FlyDataType.ID, entityType="D", printName="Landed Cost", fieldLength=22)
	C_LandedCost_ID,
	//
	@FlyElement(name="Classification", description="Classification for grouping", help="The Classification can be used to optionally group products.", dataType=FlyDataType.String, entityType="D", printName="Classification", fieldLength=12)
	Classification,
	//
	@FlyElement(name="Classname", description="Java Classname", help="The Classname identifies the Java classname used by this report or process.", dataType=FlyDataType.String, entityType="D", printName="Classname", fieldLength=60)
	Classname,
	//
	@FlyElement(name="Classpath", description="Extension Classpath", help="If your application requires additional jar files, enter them here. The jar files must be located in the $ADEMPIERE_HOME/lib directory.", dataType=FlyDataType.String, entityType="D", printName="Classpath", fieldLength=255)
	Classpath,
	//
	@FlyElement(name="Client Key", description="Key of the Client", dataType=FlyDataType.String, entityType="D", printName="Client Key", fieldLength=40)
	ClientValue,
	//
	@FlyElement(name="Address", description="Location or Address", help="The Location / Address field defines the location of an entity.", dataType=FlyDataType.ID, entityType="D", printName="Address", fieldLength=22)
	C_Location_ID,
	//
	@FlyElement(name="Location From", description="Location that inventory was moved from", help="The Location From indicates the location that a product was moved from.", dataType=FlyDataType.Table, entityType="D", printName="Location From", fieldLength=22)
	C_LocFrom_ID,
	//
	@FlyElement(name="Location To", description="Location that inventory was moved to", help="The Location To indicates the location that a product was moved to.", dataType=FlyDataType.Table, entityType="D", printName="Location To", fieldLength=22)
	C_LocTo_ID,
	//
	@FlyElement(name="Close Date", description="Close Date", help="The Close Date indicates the last or final date", dataType=FlyDataType.DateTime, entityType="D", printName="Close Date", fieldLength=7)
	CloseDate,
	//
	@FlyElement(name="Web Access Profile", description="Web Access Profile", help="Define access to collaboration management content.  You can assign the profile to a internal role or for external access to business partner group.", dataType=FlyDataType.ID, entityType="D", printName="Access Profile", fieldLength=10)
	CM_AccessProfile_ID,
	//
	@FlyElement(name="Advertisement Category", description="Advertisement Category like Banner Homepage ", help="The advertisement category defines a container for ad's like for example all banners used on the homepage in rotation are stored in a category 'Banner Homepage' etc.", dataType=FlyDataType.ID, entityType="D", printName="Advertisement Category", fieldLength=10)
	CM_Ad_Cat_ID,
	//
	@FlyElement(name="Advertisement", description="An Advertisement is something like a banner", help="You could use banner, partner infos, sponsored links etc. as an advertisement", dataType=FlyDataType.ID, entityType="D", printName="Advertisement", fieldLength=10)
	CM_Ad_ID,
	//
	@FlyElement(name="Broadcast Server", description="Web Broadcast Server", dataType=FlyDataType.ID, entityType="D", printName="Broadcast Server", fieldLength=10)
	CM_BroadcastServer_ID,
	//
	@FlyElement(name="Chat Entry Grandparent", description="Link to Grand Parent (root level)", dataType=FlyDataType.Table, entityType="D", printName="Chat Entry Grandparent", fieldLength=10)
	CM_ChatEntryGrandParent_ID,
	//
	@FlyElement(name="Chat Entry", description="Individual Chat / Discussion Entry", help="The entry can not be changed - just the confidentiality", dataType=FlyDataType.ID, entityType="D", printName="Chat Entry", fieldLength=10)
	CM_ChatEntry_ID,
	//
	@FlyElement(name="Chat Entry Parent", description="Link to direct Parent", dataType=FlyDataType.Table, entityType="D", printName="Chat Entry Parent", fieldLength=10)
	CM_ChatEntryParent_ID,
	//
	@FlyElement(name="Chat", description="Chat or discussion thread", help="Thread of discussion", dataType=FlyDataType.ID, entityType="D", printName="Chat", fieldLength=10)
	CM_Chat_ID,
	//
	@FlyElement(name="Chat Type", description="Type of discussion / chat", help="Chat Type allows you to receive subscriptions for particular content of discussions. It is linked to a table.", dataType=FlyDataType.ID, entityType="D", printName="Chat Type", fieldLength=10)
	CM_ChatType_ID,
	//
	@FlyElement(name="Container Element", description="Container element i.e. Headline, Content, Footer etc.", help="A container element defines the smallest definition of content, i.e. the headline, the content etc.", dataType=FlyDataType.ID, entityType="D", printName="Container Element", fieldLength=10)
	CM_Container_Element_ID,
	//
	@FlyElement(name="Web Container", description="Web Container contains content like images, text etc.", help="A Container defines the abstract level around the content, it defines how the content gets displayed, indexed and stored.", dataType=FlyDataType.ID, entityType="D", printName="Container", fieldLength=10)
	CM_Container_ID,
	//
	@FlyElement(name="Container Link", description="Link to another Container in the Web Project", help="Internal Link", dataType=FlyDataType.Table, entityType="D", printName="Container Link", fieldLength=10)
	CM_ContainerLink_ID,
	//
	@FlyElement(name="Container T.Table", description="Container Template Table", help="Link to individual Record", dataType=FlyDataType.ID, entityType="D", printName="Container T.Table", fieldLength=10)
	CM_ContainerTTable_ID,
	//
	@FlyElement(name="Container URL", description="Contains info on used URLs", help="We save the info on all used URLs for checking them on availability etc.", dataType=FlyDataType.ID, entityType="D", printName="Container URL", fieldLength=1)
	CM_Container_URL_ID,
	//
	@FlyElement(name="Container Stage Element", description="Container element i.e. Headline, Content, Footer etc.", help="A container element defines the smallest definition of content, i.e. the headline, the content etc.", dataType=FlyDataType.ID, entityType="D", printName="Container Stage Element", fieldLength=10)
	CM_CStage_Element_ID,
	//
	@FlyElement(name="Web Container Stage", description="Web Container Stage contains the staging content like images, text etc.", help="A Container defines the abstract level around the content, it defines how the content get's displayed, indexed and stored.	The ID is related 1 to 1 to the container ID", dataType=FlyDataType.ID, entityType="D", printName="Container Stage", fieldLength=10)
	CM_CStage_ID,
	//
	@FlyElement(name="Container Link", description="Stage Link to another Container in the Web Project", help="Internal Link", dataType=FlyDataType.Table, entityType="D", printName="Container Link", fieldLength=10)
	CM_CStageLink_ID,
	//
	@FlyElement(name="Stage T.Table", description="Container Stage Template Table", help="Link to individual Record", dataType=FlyDataType.ID, entityType="D", printName="Stage T.Table", fieldLength=10)
	CM_CStageTTable_ID,
	//
	@FlyElement(name="Media Deploy", description="Media Deployment Log", help="Log of Media Deployments", dataType=FlyDataType.ID, entityType="D", printName="Media Deploy", fieldLength=10)
	CM_MediaDeploy_ID,
	//
	@FlyElement(name="Media Item", description="Contains media content like images, flash movies etc.", help="This table contains all the media content like images, flash movies etc.", dataType=FlyDataType.ID, entityType="D", printName="Media Item", fieldLength=10)
	CM_Media_ID,
	//
	@FlyElement(name="Media Server", description="Media Server list to which content should get transfered", help="Media Server list to which content should get transferred", dataType=FlyDataType.ID, entityType="D", printName="Media Server", fieldLength=10)
	CM_Media_Server_ID,
	//
	@FlyElement(name="News Channel", description="News channel for rss feed", help="A news channel defines the content base for the RSS feed", dataType=FlyDataType.ID, entityType="D", printName="News Channel", fieldLength=10)
	CM_NewsChannel_ID,
	//
	@FlyElement(name="News Item / Article", description="News item or article defines base content", help="A news item / article is kind of a teaser for more information on an article", dataType=FlyDataType.ID, entityType="D", printName="News Item / Article", fieldLength=10)
	CM_NewsItem_ID,
	//
	@FlyElement(name="Template", description="Template defines how content is displayed", help="A template describes how content should get displayed, it contains layout and maybe also scripts on how to handle the content", dataType=FlyDataType.ID, entityType="D", printName="Template", fieldLength=10)
	CM_Template_ID,
	//
	@FlyElement(name="Template Table", description="CM Template Table Link", help="Link a Template with a Table", dataType=FlyDataType.ID, entityType="D", printName="Template Table", fieldLength=10)
	CM_TemplateTable_ID,
	//
	@FlyElement(name="Web Access Log", description="Web Access Log Information", dataType=FlyDataType.ID, entityType="D", printName="Web Access Log", fieldLength=10)
	CM_WebAccessLog_ID,
	//
	@FlyElement(name="WebProject Domain", description="Definition of Domainhandling", help="This data describes how the different Domains should get handled and how data is forwarded.", dataType=FlyDataType.ID, entityType="D", printName="WebProject Domain", fieldLength=10)
	CM_WebProject_Domain_ID,
	//
	@FlyElement(name="Web Project", description="A web project is the main data container for Containers, URLs, Ads, Media etc.", help="A web project is the meta definition which will contain later on all data within the Web Content Management Project. ", dataType=FlyDataType.ID, entityType="D", printName="Web Project", fieldLength=10)
	CM_WebProject_ID,
	//
	@FlyElement(name="Wiki Token", description="Wiki Token", dataType=FlyDataType.ID, entityType="D", printName="Wiki Token", fieldLength=10)
	CM_WikiToken_ID,
	//
	@FlyElement(name="Non Business Day", description="Day on which business is not transacted", help="The Non Business Day identifies a day that should not be considered a day when business is transacted", dataType=FlyDataType.ID, entityType="D", printName="Non Business Day", fieldLength=22)
	C_NonBusinessDay_ID,
	//
	@FlyElement(name="Validation code", description="Validation Code", help="The Validation Code displays the date, time and message of the error.", dataType=FlyDataType.Text, entityType="D", printName="Validation code", fieldLength=2000)
	Code,
	//
	@FlyElement(name="Col_0", dataType=FlyDataType.Amount, entityType="D", printName="Col_0", fieldLength=22)
	Col_0,
	//
	@FlyElement(name="Col_1", dataType=FlyDataType.Amount, entityType="D", printName="Col_1", fieldLength=22)
	Col_1,
	//
	@FlyElement(name="Col_10", dataType=FlyDataType.Amount, entityType="D", printName="Col_10", fieldLength=22)
	Col_10,
	//
	@FlyElement(name="Col_11", dataType=FlyDataType.Amount, entityType="D", printName="Col_11", fieldLength=22)
	Col_11,
	//
	@FlyElement(name="Col_12", dataType=FlyDataType.Amount, entityType="D", printName="Col_12", fieldLength=22)
	Col_12,
	//
	@FlyElement(name="Col_13", dataType=FlyDataType.Amount, entityType="D", printName="Col_13", fieldLength=22)
	Col_13,
	//
	@FlyElement(name="Col_14", dataType=FlyDataType.Amount, entityType="D", printName="Col_14", fieldLength=22)
	Col_14,
	//
	@FlyElement(name="Col_15", dataType=FlyDataType.Amount, entityType="D", printName="Col_15", fieldLength=22)
	Col_15,
	//
	@FlyElement(name="Col_16", dataType=FlyDataType.Amount, entityType="D", printName="Col_16", fieldLength=22)
	Col_16,
	//
	@FlyElement(name="Col_17", dataType=FlyDataType.Amount, entityType="D", printName="Col_17", fieldLength=22)
	Col_17,
	//
	@FlyElement(name="Col_18", dataType=FlyDataType.Amount, entityType="D", printName="Col_18", fieldLength=22)
	Col_18,
	//
	@FlyElement(name="Col_19", dataType=FlyDataType.Amount, entityType="D", printName="Col_19", fieldLength=22)
	Col_19,
	//
	@FlyElement(name="Col_2", dataType=FlyDataType.Amount, entityType="D", printName="Col_2", fieldLength=22)
	Col_2,
	//
	@FlyElement(name="Col_20", dataType=FlyDataType.Amount, entityType="D", printName="Col_20", fieldLength=22)
	Col_20,
	//
	@FlyElement(name="Col_3", dataType=FlyDataType.Amount, entityType="D", printName="Col_3", fieldLength=22)
	Col_3,
	//
	@FlyElement(name="Col_4", dataType=FlyDataType.Amount, entityType="D", printName="Col_4", fieldLength=22)
	Col_4,
	//
	@FlyElement(name="Col_5", dataType=FlyDataType.Amount, entityType="D", printName="Col_5", fieldLength=22)
	Col_5,
	//
	@FlyElement(name="Col_6", dataType=FlyDataType.Amount, entityType="D", printName="Col_6", fieldLength=22)
	Col_6,
	//
	@FlyElement(name="Col_7", dataType=FlyDataType.Amount, entityType="D", printName="Col_7", fieldLength=22)
	Col_7,
	//
	@FlyElement(name="Col_8", dataType=FlyDataType.Amount, entityType="D", printName="Col_8", fieldLength=22)
	Col_8,
	//
	@FlyElement(name="Col_9", dataType=FlyDataType.Amount, entityType="D", printName="Col_9", fieldLength=22)
	Col_9,
	//
	@FlyElement(name="Color Type", description="Color presentation for this color", dataType=FlyDataType.List, entityType="D", printName="Color Type", fieldLength=1)
	ColorType,
	//
	@FlyElement(name="DB Column Name", description="Name of the column in the database", help="The Column Name indicates the name of a column on a table as defined in the database.", dataType=FlyDataType.String, entityType="D", printName="DB Column Name", fieldLength=30)
	ColumnName,
	//
	@FlyElement(name="Column No", description="Dashboard content column number", help="Dashboard content column number, not used by the swing client at the moment.", dataType=FlyDataType.Integer, entityType="D", printName="Column No", fieldLength=14)
	ColumnNo,
	//
	@FlyElement(name="Columns", description="Number of columns", help="The number of columns in the layout grid", dataType=FlyDataType.Integer, entityType="D", printName="Columns", fieldLength=10)
	Columns,
	//
	@FlyElement(name="Column SQL", description="Virtual Column (r/o)", help="You can define virtual columns (not stored in the database). If defined, the Column name is the synonym of the SQL expression defined here. The SQL expression must be valid.<br>	Example: 'Updated-Created' would list the age of the entry in days", dataType=FlyDataType.String, entityType="D", printName="Column SQL", fieldLength=2000)
	ColumnSQL,
	//
	@FlyElement(name="Column Type", dataType=FlyDataType.List, entityType="D", printName="Column Type", fieldLength=1)
	ColumnType,
	//
	@FlyElement(name="ColValue", dataType=FlyDataType.String, entityType="D", printName="ColValue", fieldLength=2000)
	ColValue,
	//
	@FlyElement(name="Combination", description="Unique combination of account elements", help="The Combination field defines the unique combination of element values which comprise this account.", dataType=FlyDataType.String, entityType="D", printName="Combination", fieldLength=60)
	Combination,
	//
	@FlyElement(name="Comments", description="Comments or additional information", help="The Comments field allows for free form entry of additional information.", dataType=FlyDataType.Text, entityType="D", printName="Comments", fieldLength=2000)
	Comments,
	//
	@FlyElement(name="Commission %", description="Commission stated as a percentage", help="The Commission indicates (as a percentage) the commission to be paid.", dataType=FlyDataType.Number, entityType="D", printName="Comm %", fieldLength=22)
	Commission,
	//
	@FlyElement(name="Commission Amount", description="Commission Amount", help="The Commission Amount is the total calculated commission.  It is based on the parameters as defined for this Commission Run.", dataType=FlyDataType.Amount, entityType="D", printName="Comm Amt", fieldLength=22)
	CommissionAmt,
	//
	@FlyElement(name="Commissioned B.Partner", description="Business Partner receiving the Commission", dataType=FlyDataType.Table, entityType="D", printName="Comm B.Partner", fieldLength=22)
	Commission_BPartner_ID,
	//
	@FlyElement(name="Commission Converted Amount", description="Commission calculation basis Converted Amount", dataType=FlyDataType.Amount, entityType="D", printName="Comm Conv Amt", fieldLength=22)
	CommissionConvertedAmt,
	//
	@FlyElement(name="Commission only specified Orders", description="Commission only Orders or Invoices, where this Sales Rep is entered", help="Sales Reps are entered in Orders and Invoices. If selected, only Orders and Invoices for this Sales Reps are included in the calculation of the commission.", dataType=FlyDataType.YesNo, entityType="D", printName="Comm o Orders", fieldLength=1)
	CommissionOrders,
	//
	@FlyElement(name="Commission Qty", description="Commission calculation basis Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Comm Qty", fieldLength=22)
	CommissionQty,
	//
	@FlyElement(name="Commitment Offset", description="Budgetary Commitment Offset Account", help="The Commitment Offset Account is used for posting Commitments and Reservations.  It is usually an off-balance sheet and gain-and-loss account.", dataType=FlyDataType.Account, entityType="D", printName="Commitment Offset", fieldLength=10)
	CommitmentOffset_Acct,
	//
	@FlyElement(name="Commitment Offset Sales", description="Budgetary Commitment Offset Account for Sales", help="The Commitment Offset Account is used for posting Commitments Sales and Reservations.  It is usually an off-balance sheet and gain-and-loss account.", dataType=FlyDataType.Account, entityType="D", printName="Commitment Offset Sales", fieldLength=10)
	CommitmentOffsetSales_Acct,
	//
	@FlyElement(name="Commitment Type", description="Create Commitment and/or Reservations for Budget Control", help="The Posting Type Commitments is created when posting Purchase Orders; The Posting Type Reservation is created when posting Requisitions.  This is used for budgetary control.", dataType=FlyDataType.List, entityType="D", printName="Commitment Type", fieldLength=1)
	CommitmentType,
	//
	@FlyElement(name="Committed Amount", description="The (legal) commitment amount", help="The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.", dataType=FlyDataType.Amount, entityType="D", printName="Committed Amt", fieldLength=22)
	CommittedAmt,
	//
	@FlyElement(name="Committed Quantity", description="The (legal) commitment Quantity", help="The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.", dataType=FlyDataType.Quantity, entityType="D", printName="Committed Qty", fieldLength=22)
	CommittedQty,
	//
	@FlyElement(name="Commit Warning", description="Warning displayed when saving", help="Warning or information displayed when committing the record", dataType=FlyDataType.Text, entityType="D", printName="Commit Warning", fieldLength=2000)
	CommitWarning,
	//
	@FlyElement(name="Commodity Code", description="Commodity code used for tax calculation", help="The Commodity Code indicates a code that is used in tax calculations", dataType=FlyDataType.String, entityType="D", printName="Commodity Code", fieldLength=20)
	CommodityCode,
	//
	@FlyElement(name="Company", description="Previous working Company Name(Organization)", help="The Previous working Company Name(Organization)", dataType=FlyDataType.String, entityType="EE02", printName="Company", fieldLength=0)
	Company,
	//
	@FlyElement(name="Number of compartments", dataType=FlyDataType.Integer, entityType="EE03", printName="Number of compartments", fieldLength=0)
	CompartmentsNumber,
	//
	@FlyElement(name="Component Type", description="Component Type for a Bill of Material or Formula", help="The Component Type can be:		1.- By Product: Define a By Product as Component into BOM	2.- Component: Define a normal Component into BOM	3.- Option: Define an Option for Product Configure BOM	4.- Phantom: Define a Phantom as Component into BOM	5.- Packing: Define a Packing as Component into BOM	6.- Planning : Define Planning as Component into BOM	7.- Tools: Define Tools as Component into BOM	8.- Variant: Define Variant  for Product Configure BOM", dataType=FlyDataType.List, entityType="EE01", printName="Component Type", fieldLength=2)
	ComponentType,
	//
	@FlyElement(name="Concept Value", description="Value of the Concept", dataType=FlyDataType.NONE, entityType="EE02", printName="Concept Value", fieldLength=40)
	ConceptValue,
	//
	@FlyElement(name="Confidentiality", description="Type of Confidentiality", dataType=FlyDataType.List, entityType="D", printName="Confidentiality", fieldLength=1)
	ConfidentialType,
	//
	@FlyElement(name="Entry Confidentiality", description="Confidentiality of the individual entry", dataType=FlyDataType.List, entityType="D", printName="Entry Confidentiality", fieldLength=1)
	ConfidentialTypeEntry,
	//
	@FlyElement(name="Configuration Level", description="Configuration Level for this parameter", help="Configuration Level for this parameter	S - just allowed system configuration	C - client configurable parameter	O - org configurable parameter", dataType=FlyDataType.List, entityType="D", printName="Configuration Level for this parameter", fieldLength=1)
	ConfigurationLevel,
	//
	@FlyElement(name="Confirmation No", description="Confirmation Number", dataType=FlyDataType.String, entityType="D", printName="Confirmation No", fieldLength=20)
	ConfirmationNo,
	//
	@FlyElement(name="Confirmed Quantity", description="Confirmation of a received quantity", help="Confirmation of a received quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Confirmed Qty", fieldLength=22)
	ConfirmedQty,
	//
	@FlyElement(name="Confirm Query Records", description="Require Confirmation if more records will be returned by the query (If not defined 500)", help="Enter the number of records the query will return without confirmation to avoid unnecessary system load.  If 0, the system default of 500 is used.", dataType=FlyDataType.Integer, entityType="D", printName="Confirm Query Records", fieldLength=10)
	ConfirmQueryRecords,
	//
	@FlyElement(name="Confirmation Type", description="Type of confirmation", dataType=FlyDataType.List, entityType="D", printName="Confirm Type", fieldLength=2)
	ConfirmType,
	//
	@FlyElement(name="Connection Profile", description="How a Java Client connects to the server(s)", help="Depending on the connection profile, different protocols are used and tasks are performed on the server rather then the client. Usually the user can select different profiles, unless it is enforced by the User or Role definition. The User level profile overwrites the Role based profile.", dataType=FlyDataType.List, entityType="D", printName="Connection Profile", fieldLength=1)
	ConnectionProfile,
	//
	@FlyElement(name="Connection Timeout", description="Is Timeout (In milliseconds) for establishing connection", dataType=FlyDataType.Integer, entityType="D", printName="Connection Timeout", fieldLength=0)
	ConnectionTimeout,
	//
	@FlyElement(name="Consolidate to one Document", description="Consolidate Lines into one Document", dataType=FlyDataType.YesNo, entityType="D", printName="Consolidate", fieldLength=1)
	ConsolidateDocument,
	//
	@FlyElement(name="Constant Value", description="Constant value", dataType=FlyDataType.String, entityType="D", printName="Constant", fieldLength=60)
	ConstantValue,
	//
	@FlyElement(name="Activity Type", description="Type of activity, e.g. task, email, phone call", dataType=FlyDataType.NONE, entityType="D", printName="Activity Type", fieldLength=0)
	ContactActivityType,
	//
	@FlyElement(name="Contact Description", description="Description of Contact", dataType=FlyDataType.String, entityType="D", printName="Contact Description", fieldLength=255)
	ContactDescription,
	//
	@FlyElement(name="Contact Name", description="Business Partner Contact Name", dataType=FlyDataType.String, entityType="D", printName="Contact Name", fieldLength=60)
	ContactName,
	//
	@FlyElement(name="Contact Person", description="Contact Person Defines the contact person for this location", dataType=FlyDataType.String, entityType="EE02", printName="Contact Person", fieldLength=0)
	ContactPerson,
	//
	@FlyElement(name="Contact Type", description="Contact Type defines the type of contact for this location", dataType=FlyDataType.List, entityType="EE02", printName="Contact Type", fieldLength=0)
	ContactType,
	//
	@FlyElement(name="External Link (URL)", description="External Link (URL) for the Container", help="External URL for the Container	", dataType=FlyDataType.URL, entityType="D", printName="External Link", fieldLength=60)
	ContainerLinkURL,
	//
	@FlyElement(name="Web Container Type", description="Web Container Type", help="This parameter defines the type of content for this container.", dataType=FlyDataType.List, entityType="D", printName="Container Type", fieldLength=1)
	ContainerType,
	//
	@FlyElement(name="ContainerXML", description="Autogenerated Containerdefinition as XML Code", help="Autogenerated Containerdefinition as XML Code", dataType=FlyDataType.Text, entityType="D", printName="ContainerXML", fieldLength=2000)
	ContainerXML,
	//
	@FlyElement(name="Content HTML", description="Contains the content itself", help="Contains the content itself as HTML code. Should normally only use basic tags, no real layouting", dataType=FlyDataType.Text, entityType="D", printName="Content HTML", fieldLength=2000)
	ContentHTML,
	//
	@FlyElement(name="Content", dataType=FlyDataType.LongText, entityType="D", printName="Content", fieldLength=0)
	ContentText,
	//
	@FlyElement(name="Payroll Contract Value", description="Payroll Contract Value", dataType=FlyDataType.String, entityType="ECA02", printName="Payroll Contract Value", fieldLength=60)
	ContractValue,
	//
	@FlyElement(name="Control Amount", description="If not zero, the Debit amount of the document must be equal this amount", help="If the control amount is zero, no check is performed.	Otherwise the total Debit amount must be equal to the control amount, before the document is processed.", dataType=FlyDataType.Amount, entityType="D", printName="Control Amt", fieldLength=22)
	ControlAmt,
	//
	@FlyElement(name="ConventionType", dataType=FlyDataType.String, entityType="D", printName="ConventionType", fieldLength=10)
	ConventionType,
	//
	@FlyElement(name="Conversion Date", description="Date for selecting conversion rate", help="The Conversion Date identifies the date used for currency conversion. The conversion rate chosen must include this date in it's date range", dataType=FlyDataType.Date, entityType="D", printName="Conversion Date", fieldLength=7)
	ConversionDate,
	//
	@FlyElement(name="Currency Type Key", description="Key value for the Currency Conversion Rate Type", help="The date type key for the conversion of foreign currency transactions", dataType=FlyDataType.String, entityType="D", printName="Currency Conversion Type", fieldLength=40)
	ConversionTypeValue,
	//
	@FlyElement(name="Converted Amount", description="Converted Amount", help="The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate for this target currency.", dataType=FlyDataType.Amount, entityType="D", printName="Converted", fieldLength=22)
	ConvertedAmt,
	//
	@FlyElement(name="Coordinates", description="Location coordinate", help="This column contains the geographical coordinates (latitude/longitude) of the location.<p>	In order to avoid unnecessary use of non-standard characters and space, the following standard presentation is used:<br>	0000N 00000W 0000S 00000E <br>	where the two last digits refer to minutes and the two or three first digits indicate the degrees", dataType=FlyDataType.String, entityType="D", printName="Coordinates", fieldLength=15)
	Coordinates,
	//
	@FlyElement(name="Sales Opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Sales Opportunity", fieldLength=0)
	C_Opportunity_ID,
	//
	@FlyElement(name="Copy Columns From Table", dataType=FlyDataType.Button, entityType="D", printName="Copy Columns From Table", fieldLength=1)
	CopyColumnsFromTable,
	//
	@FlyElement(name="Copy From", description="Copy From Record", help="Copy From Record", dataType=FlyDataType.Button, entityType="D", printName="Copy From", fieldLength=1)
	CopyFrom,
	//
	@FlyElement(name="Copy From Report and Process", description="Copy settings from one report and process to another.", help="Copy the settings from the selected report and process to the current one.  This overwrites existing settings and translations.", dataType=FlyDataType.Button, entityType="D", printName="Copy From Report and Process", fieldLength=1)
	CopyFromProcess,
	//
	@FlyElement(name="Copy Lines", dataType=FlyDataType.Button, entityType="D", printName="Copy Lines", fieldLength=1)
	CopyLines,
	//
	@FlyElement(name="Copy Overwrite", description="Copy and Overwrite Default Accounts (DANGEROUS!!)", dataType=FlyDataType.NONE, entityType="D", printName="Copy Overwrite", fieldLength=0)
	CopyOverwriteAcct,
	//
	@FlyElement(name="Order", description="Order", help="The Order is a control document.  The  Order is complete when the quantity ordered is the same as the quantity shipped and invoiced.  When you close an order, unshipped (backordered) quantities are cancelled.", dataType=FlyDataType.ID, entityType="D", printName="Order", fieldLength=22)
	C_Order_ID,
	//
	@FlyElement(name="Sales Order Line", description="Sales Order Line", help="The Sales Order Line is a unique identifier for a line in an order.", dataType=FlyDataType.ID, entityType="D", printName="Order Line", fieldLength=22)
	C_OrderLine_ID,
	//
	@FlyElement(name="Purchase Order", description="Purchase Order", dataType=FlyDataType.Table, entityType="D", printName="Purchase Order", fieldLength=22)
	C_OrderPO_ID,
	//
	@FlyElement(name="Order Source", dataType=FlyDataType.ID, entityType="D", printName="Order Source", fieldLength=10)
	C_OrderSource_ID,
	//
	@FlyElement(name="Order Source Key", dataType=FlyDataType.String, entityType="D", printName="Order Source Key", fieldLength=40)
	C_OrderSourceValue,
	//
	@FlyElement(name="Org Assignment", description="Assignment to (transaction) Organization", help="Assignment to the transaction organization (cost center).", dataType=FlyDataType.ID, entityType="D", printName="Org Assignment", fieldLength=22)
	C_OrgAssignment_ID,
	//
	@FlyElement(name="Cost", description="Cost information", dataType=FlyDataType.CostsPrices, entityType="D", printName="Cost", fieldLength=22)
	Cost,
	//
	@FlyElement(name="Cost Adjustment", description="Product Cost Adjustment", help="product cost adjustments", dataType=FlyDataType.NONE, entityType="D", printName="Cost Adjustment", fieldLength=0)
	CostAdjustment,
	//
	@FlyElement(name="Cost Adjustment Date", description="Product Cost Adjustment", help="product cost adjustments", dataType=FlyDataType.NONE, entityType="D", printName="Cost Adjustment Date", fieldLength=0)
	CostAdjustmentDate,
	//
	@FlyElement(name="Cost Adjustment Date", description="Date Product Cost Adjustment Lower Level", help="Date product cost adjustments Lower Level", dataType=FlyDataType.NONE, entityType="D", printName="Cost Adjustment Date", fieldLength=0)
	CostAdjustmentDateLL,
	//
	@FlyElement(name="Cost Adjustment LL", description="Product Cost Adjustment Lower Level", help="product cost adjustments", dataType=FlyDataType.NONE, entityType="D", printName="Cost Adjustment Lower Level", fieldLength=0)
	CostAdjustmentLL,
	//
	@FlyElement(name="Cost Allocation Percent", description="Cost allocation percent in case of a co-product.", dataType=FlyDataType.Number, entityType="EE01", printName="Allocation%", fieldLength=22)
	CostAllocationPerc,
	//
	@FlyElement(name="Cost Value", description="Value with Cost", dataType=FlyDataType.Amount, entityType="D", printName="Cost Value", fieldLength=22)
	CostAmt,
	//
	@FlyElement(name="Cost Value LL", description="Value with Cost Lower Level", dataType=FlyDataType.NONE, entityType="D", printName="Cost Value Lower Level", fieldLength=0)
	CostAmtLL,
	//
	@FlyElement(name="Average Cost", description="Weighted average costs", help="Weighted average (actual) costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="Average Cost", fieldLength=22)
	CostAverage,
	//
	@FlyElement(name="Average Cost Amount Sum", description="Cumulative average cost amounts (internal)", help="Current cumulative costs for calculating the average costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="Average Cost Amount Sum", fieldLength=22)
	CostAverageCumAmt,
	//
	@FlyElement(name="Average Cost Quantity Sum", description="Cumulative average cost quantities (internal)", help="Current cumulative quantity for calculating the average costs", dataType=FlyDataType.Quantity, entityType="D", printName="Average Cost Quantity Sum", fieldLength=22)
	CostAverageCumQty,
	//
	@FlyElement(name="Cost Collector Type", description="Transaction Type for Manufacturing Management", dataType=FlyDataType.List, entityType="EE01", printName="Cost Collector Type", fieldLength=3)
	CostCollectorType,
	//
	@FlyElement(name="Cost Element Type", description="Type of Cost Element", dataType=FlyDataType.List, entityType="D", printName="Cost Element Type", fieldLength=1)
	CostElementType,
	//
	@FlyElement(name="Future Cost", description="Cost information", dataType=FlyDataType.CostsPrices, entityType="D", printName="Future Cost", fieldLength=22)
	CostFuture,
	//
	@FlyElement(name="Costing Level", description="The lowest level to accumulate Costing Information", help="If you want to maintain different costs per organization (warehouse) or per Batch/Lot, you need to make sure that you define the costs for each of the organizations or batch/lot. The Costing Level is defined per Accounting Schema and can be overwritten by Product Category and Accounting Schema.", dataType=FlyDataType.List, entityType="D", printName="Costing Level", fieldLength=1)
	CostingLevel,
	//
	@FlyElement(name="Costing Method", description="Indicates how Costs will be calculated", help="The Costing Method indicates how costs will be calculated (Standard, Average, Lifo, FiFo).  The default costing method is defined on accounting schema level and can be optionally overwritten in the product category.  The costing method cannot conflict with the Material Movement Policy (defined on Product Category).", dataType=FlyDataType.List, entityType="D", printName="Costing Method", fieldLength=1)
	CostingMethod,
	//
	@FlyElement(name="Costing Precision", description="Rounding used costing calculations", help="The Costing Precision defines the number of decimal places that amounts will be rounded to when performing costing calculations.", dataType=FlyDataType.Integer, entityType="D", printName="Costing Precision", fieldLength=22)
	CostingPrecision,
	//
	@FlyElement(name="Cost per Order", description="Fixed Cost Per Order", help="The Cost Per Order indicates the fixed charge levied when an order for this product is placed.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Cost per Order", fieldLength=22)
	CostPerOrder,
	//
	@FlyElement(name="Cost per transaction", description="Fixed cost per transaction", help="The Cost per Transaction indicates the fixed cost per to be charged per transaction.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Cost per Trx", fieldLength=22)
	CostPerTrx,
	//
	@FlyElement(name="Costs", description="Costs in accounting currency", help="The Costs indicates the cost of a campaign in an Organizations accounting currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Costs", fieldLength=22)
	Costs,
	//
	@FlyElement(name="Standard Cost", description="Standard Costs", help="Standard (plan) costs.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Standard Cost", fieldLength=22)
	CostStandard,
	//
	@FlyElement(name="Standard Cost Value", description="Value in Standard Costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="Standard Cost Value", fieldLength=22)
	CostStandardAmt,
	//
	@FlyElement(name="Std Cost Amount Sum", description="Standard Cost Invoice Amount Sum (internal)", help="Current cumulative amount for calculating the standard cost difference based on (actual) invoice price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Std Cost Amount Sum", fieldLength=22)
	CostStandardCumAmt,
	//
	@FlyElement(name="Std Cost Quantity Sum", description="Standard Cost Invoice Quantity Sum (internal)", help="Current cumulative quantity for calculating the standard cost difference based on (actual) invoice price", dataType=FlyDataType.Quantity, entityType="D", printName="Std Cost Quantity Sum", fieldLength=22)
	CostStandardCumQty,
	//
	@FlyElement(name="Standard Cost Invoice Difference", description="Standard Cost Invoice Difference", help="Accumulated difference of Invoice Costs to Standard Costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="Standard Cost Invoice Diff", fieldLength=22)
	CostStandardInvDiff,
	//
	@FlyElement(name="Std PO Cost Amount Sum", description="Standard Cost Purchase Order Amount Sum (internal)", help="Current cumulative amount for calculating the standard cost difference based on (planned) purchase order price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Std PO Cost Amount Sum", fieldLength=22)
	CostStandardPOAmt,
	//
	@FlyElement(name="Standard Cost PO Difference", description="Standard Cost Purchase Order Difference", help="Accumulated difference of Purchase Order Costs to Standard Costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="Standard Cost PO Diff", fieldLength=22)
	CostStandardPODiff,
	//
	@FlyElement(name="Std PO Cost Quantity Sum", description="Standard Cost Purchase Order Quantity Sum (internal)", help="Current cumulative quantity for calculating the standard cost difference based on (planned) purchase order price", dataType=FlyDataType.Quantity, entityType="D", printName="Std PO Cost Quantity Sum", fieldLength=22)
	CostStandardPOQty,
	//
	@FlyElement(name="Count Entered", dataType=FlyDataType.NONE, entityType="D", printName="Entered", fieldLength=0)
	CountEntered,
	//
	@FlyElement(name="Counter", description="Count Value", help="Number counter", dataType=FlyDataType.Integer, entityType="D", printName="Counter", fieldLength=22)
	Counter,
	//
	@FlyElement(name="Counter Document Type", description="Generated Counter Document Type (To)", help="The Document Type of the generated counter document", dataType=FlyDataType.Table, entityType="D", printName="Counter Doc Type", fieldLength=22)
	Counter_C_DocType_ID,
	//
	@FlyElement(name="Count high turnover items", description="Count High Movement products", help="The Count High Movement checkbox indicates if the those items with a high turnover will be counted", dataType=FlyDataType.YesNo, entityType="D", printName="Count high turnover items", fieldLength=1)
	CountHighMovement,
	//
	@FlyElement(name="Order Count", dataType=FlyDataType.Integer, entityType="D", printName="Order Count", fieldLength=0)
	CountOrder,
	//
	@FlyElement(name="ISO Country Code", description="Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html", help="For details - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm", dataType=FlyDataType.String, entityType="D", printName="ISO Country", fieldLength=2)
	CountryCode,
	//
	@FlyElement(name="Country", description="Country Name", dataType=FlyDataType.String, entityType="D", printName="Country", fieldLength=60)
	CountryName,
	//
	@FlyElement(name="Coverage Amount", description="Coverage Amount", help="The Coverage Amount of Insurance", dataType=FlyDataType.Number, entityType="EE02", printName="Coverage Amount", fieldLength=0)
	CoverageAmount,
	//
	@FlyElement(name="Allocate Payment", description="Allocate Payment to Invoices", help="You can directly allocate payments to invoices when creating the Payment. 	Note that you can over- or under-allocate the payment.  When processing the payment, the allocation is created.", dataType=FlyDataType.ID, entityType="D", printName="Allocate Payment", fieldLength=10)
	C_PaymentAllocate_ID,
	//
	@FlyElement(name="Payment Batch", description="Payment batch for EFT", help="Electronic Fund Transfer Payment Batch.", dataType=FlyDataType.TableDirect, entityType="D", printName="Payment Batch", fieldLength=22)
	C_PaymentBatch_ID,
	//
	@FlyElement(name="Payment", description="Payment identifier", help="The Payment is a unique identifier of this payment.", dataType=FlyDataType.Search, entityType="D", printName="Payment", fieldLength=22)
	C_Payment_ID,
	//
	@FlyElement(name="Payment Processor", description="Payment processor for electronic payments", help="The Payment Processor indicates the processor to be used for electronic payments", dataType=FlyDataType.ID, entityType="D", printName="Payment Processor", fieldLength=22)
	C_PaymentProcessor_ID,
	//
	@FlyElement(name="Payment Term", description="The terms of Payment (timing, discount)", help="Payment Terms identify the method and timing of payment.", dataType=FlyDataType.ID, entityType="D", printName="Payment Term", fieldLength=22)
	C_PaymentTerm_ID,
	//
	@FlyElement(name="Payment Schedule", description="Payment Schedule Template", help="Information when parts of the payment are due", dataType=FlyDataType.ID, entityType="D", printName="Payment Schedule", fieldLength=22)
	C_PaySchedule_ID,
	//
	@FlyElement(name="Pay Selection Check", description="Payment Selection Check", dataType=FlyDataType.ID, entityType="D", printName="Pay Selection Check", fieldLength=22)
	C_PaySelectionCheck_ID,
	//
	@FlyElement(name="Payment Selection", description="Payment Selection", help="The Payment Selection identifies a unique Payment", dataType=FlyDataType.ID, entityType="D", printName="Payment Selection", fieldLength=22)
	C_PaySelection_ID,
	//
	@FlyElement(name="Payment Selection Line", description="Payment Selection Line", help="The Payment Selection Line identifies a unique line in a payment", dataType=FlyDataType.ID, entityType="D", printName="Payment Selection Line", fieldLength=22)
	C_PaySelectionLine_ID,
	//
	@FlyElement(name="Parent Pay Selection Line", dataType=FlyDataType.Table, entityType="D", printName="Parent Pay Selection Line", fieldLength=10)
	C_PaySelectionLine_Parent_ID,
	//
	@FlyElement(name="Period Control", dataType=FlyDataType.ID, entityType="D", printName="Period Control", fieldLength=22)
	C_PeriodControl_ID,
	//
	@FlyElement(name="Period", description="Period of the Calendar", help="The Period indicates an exclusive range of dates for a calendar.", dataType=FlyDataType.ID, entityType="D", printName="Period", fieldLength=22)
	C_Period_ID,
	//
	@FlyElement(name="Standard Phase", description="Standard Phase of the Project Type", help="Phase of the project with standard performance information with standard work", dataType=FlyDataType.TableDirect, entityType="D", printName="Std Phase", fieldLength=22)
	C_Phase_ID,
	//
	@FlyElement(name="POS Terminal", description="Point of Sales Terminal", help="The POS Terminal defines the defaults and functions available for the POS Form", dataType=FlyDataType.ID, entityType="D", printName="POS", fieldLength=22)
	C_POS_ID,
	//
	@FlyElement(name="POS Key", description="POS Function Key", help="Define a POS Function Key", dataType=FlyDataType.ID, entityType="D", printName="POS Key", fieldLength=22)
	C_POSKey_ID,
	//
	@FlyElement(name="POS Key Layout", description="POS Function Key Layout", help="POS Function Key Layout", dataType=FlyDataType.TableDirect, entityType="D", printName="POS Key Layout", fieldLength=22)
	C_POSKeyLayout_ID,
	//
	@FlyElement(name="Customer Prepayment", description="Account for customer prepayments", help="The Customer Prepayment account indicates the account to be used for recording prepayments from a customer.", dataType=FlyDataType.Account, entityType="D", printName="Customer Prepayment", fieldLength=22)
	C_Prepayment_Acct,
	//
	@FlyElement(name="Project", description="Financial Project", help="A Project allows you to track and control internal or external activities.", dataType=FlyDataType.ID, entityType="D", printName="Project", fieldLength=22)
	C_Project_ID,
	//
	@FlyElement(name="Project Issue", description="Project Issues (Material, Labor)", help="Issues to the project initiated by the 'Issue to Project' process. You can issue Receipts, Time and Expenses, or Stock.", dataType=FlyDataType.ID, entityType="D", printName="Project Issue", fieldLength=22)
	C_ProjectIssue_ID,
	//
	@FlyElement(name="Project Line", description="Task or step in a project", help="The Project Line indicates a unique project line.", dataType=FlyDataType.ID, entityType="D", printName="Project Line", fieldLength=22)
	C_ProjectLine_ID,
	//
	@FlyElement(name="Project Phase", description="Phase of a Project", dataType=FlyDataType.TableDirect, entityType="D", printName="Project Phase", fieldLength=22)
	C_ProjectPhase_ID,
	//
	@FlyElement(name="Project Task", description="Actual Project Task in a Phase", help="A Project Task in a Project Phase represents the actual work.", dataType=FlyDataType.TableDirect, entityType="D", printName="Project Task", fieldLength=22)
	C_ProjectTask_ID,
	//
	@FlyElement(name="Project Type", description="Type of the project", help="Type of the project with optional phases of the project with standard performance information", dataType=FlyDataType.ID, entityType="D", printName="Project Type", fieldLength=22)
	C_ProjectType_ID,
	//
	@FlyElement(name="Account (credit)", description="Account used", help="The (natural) account used", dataType=FlyDataType.NONE, entityType="D", printName="Account (credit)", fieldLength=0)
	CR_Account_ID,
	//
	@FlyElement(name="Create Confirm", dataType=FlyDataType.Button, entityType="D", printName="Create Confirm", fieldLength=1)
	CreateConfirm,
	//
	@FlyElement(name="Create Copy", dataType=FlyDataType.Button, entityType="D", printName="Create Copy", fieldLength=1)
	CreateCopy,
	//
	@FlyElement(name="Created", description="Date this record was created", help="The Created field indicates the date that this record was created.", dataType=FlyDataType.DateTime, entityType="D", printName="Created", fieldLength=7)
	Created,
	//
	@FlyElement(name="Created By", description="User who created this records", help="The Created By field indicates the user who created this record.", dataType=FlyDataType.Table, entityType="D", printName="Created By", fieldLength=22)
	CreatedBy,
	//
	@FlyElement(name="Created By Issue", dataType=FlyDataType.Table, entityType="EE01", printName="Created By Issue", fieldLength=22)
	CreatedByIssue,
	//
	@FlyElement(name="CreatedDate", dataType=FlyDataType.String, entityType="D", printName="CreatedDate", fieldLength=50)
	CreatedDate,
	//
	@FlyElement(name="Create lines from", description="Process which will generate a new document lines based on an existing document", help="The Create From process will create a new document based on information in an existing document selected by the user.", dataType=FlyDataType.Button, entityType="D", printName="Create lines from", fieldLength=1)
	CreateFrom,
	//
	@FlyElement(name="Create lines from Invoice", description="Process which will generate a new document lines based on an existing document", help="The Create From process will create a new document based on information in an existing document selected by the user.", dataType=FlyDataType.Button, entityType="D", printName="Create lines from Invoice", fieldLength=1)
	CreateFromInvoice,
	//
	@FlyElement(name="Create lines from Order", description="Process which will generate a new document lines based on an existing document", help="The Create From process will create a new document based on information in an existing document selected by the user.", dataType=FlyDataType.Button, entityType="D", printName="Create lines from Order", fieldLength=1)
	CreateFromOrder,
	//
	@FlyElement(name="Create From Type", dataType=FlyDataType.List, entityType="D", printName="Create From Type", fieldLength=1)
	CreateFromType,
	//
	@FlyElement(name="Create levels sequentially", description="Create Dunning Letter by level sequentially", help="If selected, the dunning letters are created in the sequence of the dunning levels.  Otherwise, the dunning level is based on the days (over)due.", dataType=FlyDataType.YesNo, entityType="D", printName="Sequential", fieldLength=1)
	CreateLevelsSequentially,
	//
	@FlyElement(name="Create New Combination", description="Create New Account Combination", dataType=FlyDataType.NONE, entityType="D", printName="Create New Combination", fieldLength=0)
	CreateNewCombination,
	//
	@FlyElement(name="CreateOpportunity", description="Create Opportunity", help="Create a new Sales Opportunity when converting a lead", dataType=FlyDataType.YesNo, entityType="D", printName="Create Opportunity", fieldLength=1)
	CreateOpportunity,
	//
	@FlyElement(name="Create Package", dataType=FlyDataType.Button, entityType="D", printName="Create Package", fieldLength=1)
	CreatePackage,
	//
	@FlyElement(name="Create Payment", dataType=FlyDataType.Button, entityType="D", printName="Create Payment", fieldLength=1)
	CreatePayment,
	//
	@FlyElement(name="Create PO", description="Create Purchase Order", dataType=FlyDataType.Button, entityType="D", printName="Create PO", fieldLength=1)
	CreatePO,
	//
	@FlyElement(name="Create Reciprocal Rate", description="Create Reciprocal Rate from current information", help="If selected, the imported USD->EUR rate is used to create/calculate the reciprocal rate EUR->USD.", dataType=FlyDataType.YesNo, entityType="D", printName="Create Reciprocal", fieldLength=1)
	CreateReciprocalRate,
	//
	@FlyElement(name="Create Shipment", description="Create Shipment From Order Line", dataType=FlyDataType.Button, entityType="D", printName="Create Shipment", fieldLength=1)
	CreateShipment,
	//
	@FlyElement(name="Create SO", dataType=FlyDataType.Button, entityType="D", printName="Create SO", fieldLength=1)
	CreateSO,
	//
	@FlyElement(name="Creator", dataType=FlyDataType.String, entityType="D", printName="Creator", fieldLength=120)
	Creator,
	//
	@FlyElement(name="CreatorContact", dataType=FlyDataType.Text, entityType="D", printName="CreatorContact", fieldLength=510)
	CreatorContact,
	//
	@FlyElement(name="Customer Receivables", description="Account for Customer Receivables", help="The Customer Receivables Accounts indicates the account to be used for recording transaction for customers receivables.", dataType=FlyDataType.Account, entityType="D", printName="Customer Receivables", fieldLength=22)
	C_Receivable_Acct,
	//
	@FlyElement(name="Receivable Services", description="Customer Accounts Receivables Services Account", help="Account to post services related Accounts Receivables if you want to differentiate between Services and Product related revenue. This account is only used, if posting to service accounts is enabled in the accounting schema.", dataType=FlyDataType.Account, entityType="D", printName="AR Services", fieldLength=10)
	C_Receivable_Services_Acct,
	//
	@FlyElement(name="Recurring", description="Recurring Document", help="Recurring Documents", dataType=FlyDataType.TableDirect, entityType="D", printName="Recurring", fieldLength=22)
	C_Recurring_ID,
	//
	@FlyElement(name="Recurring Run", description="Recurring Document Run", help="History of Recurring Document Generation", dataType=FlyDataType.ID, entityType="D", printName="Recurring Run", fieldLength=22)
	C_Recurring_Run_ID,
	//
	@FlyElement(name="Exp. Month", description="Expiry Month", help="The Expiry Month indicates the expiry month for this credit card.", dataType=FlyDataType.Integer, entityType="D", printName="Exp. Month", fieldLength=22)
	CreditCardExpMM,
	//
	@FlyElement(name="Exp. Year", description="Expiry Year", help="The Expiry Year indicates the expiry year for this credit card.", dataType=FlyDataType.Integer, entityType="D", printName="Exp. Year", fieldLength=22)
	CreditCardExpYY,
	//
	@FlyElement(name="Number", description="Credit Card Number ", help="The Credit Card number indicates the number on the credit card, without blanks or spaces.", dataType=FlyDataType.String, entityType="D", printName="Number", fieldLength=20)
	CreditCardNumber,
	//
	@FlyElement(name="Credit Card", description="Credit Card (Visa, MC, AmEx)", help="The Credit Card drop down list box is used for selecting the type of Credit Card presented for payment.", dataType=FlyDataType.List, entityType="D", printName="Credit Card", fieldLength=1)
	CreditCardType,
	//
	@FlyElement(name="Verification Code", description="Credit Card Verification code on credit card", help="The Credit Card Verification indicates the verification code on the credit card (AMEX 4 digits on front; MC,Visa 3 digits back)", dataType=FlyDataType.String, entityType="D", printName="Verification", fieldLength=4)
	CreditCardVV,
	//
	@FlyElement(name="Credit limit", description="Amount of Credit allowed", help="The Credit Limit field indicates the credit limit for this account.", dataType=FlyDataType.Number, entityType="D", printName="Credit limit", fieldLength=22)
	CreditLimit,
	//
	@FlyElement(name="Credit Watch %", description="Credit Watch - Percent of Credit Limit when OK switches to Watch", help="If Adempiere maintains credit status, the status 'Credit OK' is moved to 'Credit Watch' if the credit available reaches the percent entered.  If not defined, 90% is used.", dataType=FlyDataType.Number, entityType="D", printName="Credit Watch %", fieldLength=22)
	CreditWatchPercent,
	//
	@FlyElement(name="Region", description="Identifies a geographical Region", help="The Region identifies a unique Region for this Country.", dataType=FlyDataType.TableDirect, entityType="D", printName="Region", fieldLength=22)
	C_Region_ID,
	//
	@FlyElement(name="Remuneration", description="Wage or Salary", dataType=FlyDataType.ID, entityType="D", printName="Remuneration", fieldLength=10)
	C_Remuneration_ID,
	//
	@FlyElement(name="Revenue Recognition", description="Method for recording revenue", help="The Revenue Recognition indicates how revenue will be recognized for this product", dataType=FlyDataType.TableDirect, entityType="D", printName="Revenue Recognition", fieldLength=22)
	C_RevenueRecognition_ID,
	//
	@FlyElement(name="Revenue Recognition Plan", description="Plan for recognizing or recording revenue", help="The Revenue Recognition Plan identifies a unique Revenue Recognition Plan.", dataType=FlyDataType.TableDirect, entityType="D", printName="Revenue Recognition Plan", fieldLength=22)
	C_RevenueRecognition_Plan_ID,
	//
	@FlyElement(name="Revenue Recognition Run", description="Revenue Recognition Run or Process", help="The Revenue Recognition Runs identifies a unique instance of processing revenue recognition.", dataType=FlyDataType.ID, entityType="D", printName="Revenue Recognition Run", fieldLength=22)
	C_RevenueRecognition_Run_ID,
	//
	@FlyElement(name="RfQ", description="Request for Quotation", help="Request for Quotation to be sent out to vendors of a RfQ Topic. After Vendor selection, optionally create Sales Order or Quote for Customer as well as Purchase Order  for Vendor(s)", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ", fieldLength=22)
	C_RfQ_ID,
	//
	@FlyElement(name="RfQ Line", description="Request for Quotation Line", help="Request for Quotation Line", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Line", fieldLength=22)
	C_RfQLine_ID,
	//
	@FlyElement(name="RfQ Line Quantity", description="Request for Quotation Line Quantity", help="You may request a quotation for different quantities", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Line Qty", fieldLength=22)
	C_RfQLineQty_ID,
	//
	@FlyElement(name="RfQ Response", description="Request for Quotation Response from a potential Vendor", help="Request for Quotation Response from a potential Vendor", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Response", fieldLength=22)
	C_RfQResponse_ID,
	//
	@FlyElement(name="RfQ Response Line", description="Request for Quotation Response Line", help="Request for Quotation Response Line from a potential Vendor", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Response Line", fieldLength=22)
	C_RfQResponseLine_ID,
	//
	@FlyElement(name="RfQ Response Line Qty", description="Request for Quotation Response Line Quantity", help="Request for Quotation Response Line Quantity from a potential Vendor", dataType=FlyDataType.ID, entityType="D", printName="RfQ Response Line Qty", fieldLength=22)
	C_RfQResponseLineQty_ID,
	//
	@FlyElement(name="RfQ Topic", description="Topic for Request for Quotations", help="A Request for Quotation Topic allows you to maintain a subscriber list of potential Vendors to respond to RfQs", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Topic", fieldLength=22)
	C_RfQ_Topic_ID,
	//
	@FlyElement(name="RfQ Subscriber", description="Request for Quotation Topic Subscriber", help="Subscriber to invite to respond to RfQs", dataType=FlyDataType.ID, entityType="D", printName="RfQ Subscriber", fieldLength=22)
	C_RfQ_TopicSubscriber_ID,
	//
	@FlyElement(name="RfQ Topic Subscriber Restriction", description="Include Subscriber only for certain products or product categories", help="Products and/or  Product Categories for which the subscriber should be included.  If no product / category is entered, the subscriber is requested to answer requests for all lines in a RfQ", dataType=FlyDataType.ID, entityType="D", printName="RfQ Topic Subscriber Only", fieldLength=22)
	C_RfQ_TopicSubscriberOnly_ID,
	//
	@FlyElement(name="Cron Scheduling Pattern", description="Cron pattern to define when the process should be invoked.", help="Cron pattern to define when the process should be invoked. See http://en.wikipedia.org/wiki/Cron#crontab_syntax for cron scheduling syntax and example.", dataType=FlyDataType.String, entityType="D", printName="Cron Scheduling Pattern", fieldLength=255)
	CronPattern,
	//
	@FlyElement(name="Sales Dashboard", dataType=FlyDataType.NONE, entityType="D", printName="Sales Dashboard", fieldLength=0)
	C_SalesDashboard_ID,
	//
	@FlyElement(name="Sales History", description="Sales History for statistics and forecast", dataType=FlyDataType.NONE, entityType="EE01", printName="Sales History", fieldLength=0)
	C_SalesHistory_ID,
	//
	@FlyElement(name="Sales Region", description="Sales coverage region", help="The Sales Region indicates a specific area of sales coverage.", dataType=FlyDataType.ID, entityType="D", printName="Sales Region", fieldLength=22)
	C_SalesRegion_ID,
	//
	@FlyElement(name="Sales Stage", description="Stages of the sales process", help="Define what stages your sales process will move through", dataType=FlyDataType.NONE, entityType="D", printName="Sales Stage", fieldLength=0)
	C_SalesStage_ID,
	//
	@FlyElement(name="Service Level", description="Product Revenue Recognition Service Level ", help="The Service Level defines a unique Service Level.", dataType=FlyDataType.ID, entityType="D", printName="Service Level", fieldLength=22)
	C_ServiceLevel_ID,
	//
	@FlyElement(name="Service Level Line", description="Product Revenue Recognition Service Level Line", help="The Service Level Line indicates a unique instance in a Service Level", dataType=FlyDataType.ID, entityType="D", printName="Service Level Line", fieldLength=22)
	C_ServiceLevelLine_ID,
	//
	@FlyElement(name="Sub Account", description="Sub account for Element Value", help="The Element Value (e.g. Account) may have optional sub accounts for further detail. The sub account is dependent on the value of the account, so a further specification. If the sub-accounts are more or less the same, consider using another accounting dimension.", dataType=FlyDataType.ID, entityType="D", printName="Sub Acct", fieldLength=10)
	C_SubAcct_ID,
	//
	@FlyElement(name="Subscription Delivery", description="Optional Delivery Record for a Subscription", help="Record of deliveries for a subscription", dataType=FlyDataType.ID, entityType="D", printName="Subscription Delivery", fieldLength=22)
	C_Subscription_Delivery_ID,
	//
	@FlyElement(name="Subscription", description="Subscription of a Business Partner of a Product to renew", help="Subscription of a Business Partner of a Product to renew", dataType=FlyDataType.TableDirect, entityType="D", printName="Subscription", fieldLength=22)
	C_Subscription_ID,
	//
	@FlyElement(name="Subscription Type", description="Type of subscription", help="Subscription type and renewal frequency", dataType=FlyDataType.TableDirect, entityType="D", printName="Subscription Type", fieldLength=22)
	C_SubscriptionType_ID,
	//
	@FlyElement(name="Standard Task", description="Standard Project Type Task", help="Standard Project Task in a Project Phase with standard effort", dataType=FlyDataType.ID, entityType="D", printName="Standard Task", fieldLength=22)
	C_Task_ID,
	//
	@FlyElement(name="Tax Base", dataType=FlyDataType.TableDirect, entityType="EE04", printName="Tax Base", fieldLength=22)
	C_TaxBase_ID,
	//
	@FlyElement(name="Tax Category", description="Tax Category", help="The Tax Category provides a method of grouping similar taxes.  For example, Sales Tax or Value Added Tax.", dataType=FlyDataType.TableDirect, entityType="D", printName="Tax Category", fieldLength=22)
	C_TaxCategory_ID,
	//
	@FlyElement(name="Tax Declaration Accounting", description="Tax Accounting Reconciliation ", help="Accounting related information for reconciliation with documents. It includes all revenue/expense and tax entries as a base for detail reporting", dataType=FlyDataType.ID, entityType="D", printName="Tax Declaration Acct", fieldLength=10)
	C_TaxDeclarationAcct_ID,
	//
	@FlyElement(name="Tax Declaration", description="Define the declaration to the tax authorities", help="The tax declaration allows you to create supporting information and reconcile the documents with the accounting", dataType=FlyDataType.ID, entityType="D", printName="Tax Declaration", fieldLength=10)
	C_TaxDeclaration_ID,
	//
	@FlyElement(name="Tax Declaration Line", description="Tax Declaration Document Information", help="The lines are created by the create process. You can delete them if you do not want to include them in a particular declaration. ", dataType=FlyDataType.ID, entityType="D", printName="Tax Declaration Line", fieldLength=10)
	C_TaxDeclarationLine_ID,
	//
	@FlyElement(name="Tax Definition", dataType=FlyDataType.ID, entityType="EE04", printName="Tax Definition", fieldLength=10)
	C_TaxDefinition_ID,
	//
	@FlyElement(name="Tax Group", dataType=FlyDataType.ID, entityType="EE04", printName="Tax Group", fieldLength=10)
	C_TaxGroup_ID,
	//
	@FlyElement(name="Tax", description="Tax identifier", help="The Tax indicates the type of tax used in document line.", dataType=FlyDataType.TableDirect, entityType="D", printName="Tax", fieldLength=22)
	C_Tax_ID,
	//
	@FlyElement(name="Tax ZIP", description="Tax Postal/ZIP", help="For local tax, you may have to define a list of (ranges of) postal codes or ZIPs", dataType=FlyDataType.ID, entityType="D", printName="Tax ZIP", fieldLength=22)
	C_TaxPostal_ID,
	//
	@FlyElement(name="Tax Type", dataType=FlyDataType.TableDirect, entityType="EE04", printName="Tax Type", fieldLength=22)
	C_TaxType_ID,
	//
	@FlyElement(name="Template BPartner", description="BPartner that is to be used as template when new customers are created", dataType=FlyDataType.Table, entityType="D", printName="Template BPartner", fieldLength=22)
	C_TemplateBPartner_ID,
	//
	@FlyElement(name="Accumulated Amt", description="Total Amount", help="Sum of all amounts", dataType=FlyDataType.Amount, entityType="D", printName="Accumulated Amt", fieldLength=22)
	CumulatedAmt,
	//
	@FlyElement(name="Accumulated Amt LL", description="Total Amount", help="Sum of all amounts", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Amt Lower Lavel", fieldLength=0)
	CumulatedAmtLL,
	//
	@FlyElement(name="Cumulated Amt Post", dataType=FlyDataType.Quantity, entityType="EE01", printName="Cumulated Amt Post", fieldLength=22)
	CumulatedAmtPost,
	//
	@FlyElement(name="Accumulated Qty", description="Total Quantity", help="Sum of the quantities", dataType=FlyDataType.Quantity, entityType="D", printName="Accumulated Qty", fieldLength=22)
	CumulatedQty,
	//
	@FlyElement(name="Cumulated Qty Post", dataType=FlyDataType.Quantity, entityType="EE01", printName="Cumulated Qty Post", fieldLength=14)
	CumulatedQtyPost,
	//
	@FlyElement(name="Accumulation Level", description="Level for accumulative calculations", dataType=FlyDataType.List, entityType="D", printName="Accumulation Level", fieldLength=1)
	CumulativeLevel,
	//
	@FlyElement(name="UOM Conversion", description="Unit of Measure Conversion", help="The UOM Conversion identifies a unique to and from Unit of Measure, conversion rate and conversion date range.", dataType=FlyDataType.ID, entityType="D", printName="UOM Conversion", fieldLength=22)
	C_UOM_Conversion_ID,
	//
	@FlyElement(name="UOM", description="Unit of Measure", help="The UOM defines a unique non monetary Unit of Measure", dataType=FlyDataType.ID, entityType="D", printName="UOM", fieldLength=22)
	C_UOM_ID,
	//
	@FlyElement(name="UOM for Length", description="Standard Unit of Measure for Length", help="The Standard UOM for Length indicates the UOM to use for products referenced by length in a document.", dataType=FlyDataType.Table, entityType="D", printName="UOM for Length", fieldLength=22)
	C_UOM_Length_ID,
	//
	@FlyElement(name="UOM for Time", description="Standard Unit of Measure for Time", help="The Standard UOM for Time indicates the UOM to use for products referenced by time in a document.", dataType=FlyDataType.Table, entityType="D", printName="UOM for Time", fieldLength=22)
	C_UOM_Time_ID,
	//
	@FlyElement(name="UoM To", description="Target or destination Unit of Measure", help="The UOM To indicates the destination UOM for a UOM Conversion pair.", dataType=FlyDataType.Table, entityType="D", printName="UoM To", fieldLength=22)
	C_UOM_To_ID,
	//
	@FlyElement(name="UOM for Volume", description="Standard Unit of Measure for Volume", help="The Standard UOM for Volume indicates the UOM to use for products referenced by volume in a document.", dataType=FlyDataType.Table, entityType="D", printName="UOM for Volume", fieldLength=22)
	C_UOM_Volume_ID,
	//
	@FlyElement(name="UOM for Weight", description="Standard Unit of Measure for Weight", help="The Standard UOM for Weight indicates the UOM to use for products referenced by weight in a document.", dataType=FlyDataType.Table, entityType="D", printName="UOM for Weight", fieldLength=22)
	C_UOM_Weight_ID,
	//
	@FlyElement(name="Currency Balancing Acct", description="Account used when a currency is out of balance", help="The Currency Balancing Account indicates the account to used when a currency is out of balance (generally due to rounding)", dataType=FlyDataType.Account, entityType="D", printName="Currency Balancing Acct", fieldLength=22)
	CurrencyBalancing_Acct,
	//
	@FlyElement(name="Rate", description="Currency Conversion Rate", help="The Currency Conversion Rate indicates the rate to use when converting the source currency to the accounting currency", dataType=FlyDataType.Number, entityType="D", printName="Rate", fieldLength=22)
	CurrencyRate,
	//
	@FlyElement(name="CurrencyRateType", dataType=FlyDataType.List, entityType="D", printName="CurrencyRateType", fieldLength=1)
	CurrencyRateType,
	//
	@FlyElement(name="Currency Type", dataType=FlyDataType.List, entityType="D", printName="Currency Type", fieldLength=1)
	CurrencyType,
	//
	@FlyElement(name="Current balance", description="Current Balance", help="The Current Balance field indicates the current balance in this account.", dataType=FlyDataType.Number, entityType="D", printName="Current balance", fieldLength=22)
	CurrentBalance,
	//
	@FlyElement(name="Current Cost Price", description="The currently used cost price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Current Cost Price", fieldLength=22)
	CurrentCostPrice,
	//
	@FlyElement(name="Current Cost Price LL", description="Current Price Lower Level Is the sum of the costs of the components of this product manufactured for this level.", help="Current Price Lower Level is used for get the total costs for lower level the a product manufactured.		The Current Price Lower Level always will be calculated.		You can see the Current Cost Price and Current Cost Price Lower Level with Cost  Bill of Material & Formula Detail Report.	 	The sum the Current Cost Price + Current Cost Price Lower Level is the total cost to a product manufactured.	", dataType=FlyDataType.Quantity, entityType="EE01", printName="Current Cost Price Lower Level", fieldLength=22)
	CurrentCostPriceLL,
	//
	@FlyElement(name="currentcostvalue", dataType=FlyDataType.NONE, entityType="D", printName="currentcostvalue", fieldLength=0)
	currentcostvalue,
	//
	@FlyElement(name="Current Next", description="The next number to be used", help="The Current Next indicates the next number to use for this document", dataType=FlyDataType.Integer, entityType="D", printName="Current Next", fieldLength=22)
	CurrentNext,
	//
	@FlyElement(name="Current Next (System)", description="Next sequence for system use", help="This field is for system use only and should not be modified.", dataType=FlyDataType.Integer, entityType="D", printName="Current Next (System)", fieldLength=22)
	CurrentNextSys,
	//
	@FlyElement(name="Current Quantity", description="Current Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Current Qty", fieldLength=22)
	CurrentQty,
	//
	@FlyElement(name="Current Status", description="Indicates the current status", help="The Current Status Indicates the current status", dataType=FlyDataType.String, entityType="EE02", printName="Current Status", fieldLength=0)
	CurrentStatus,
	//
	@FlyElement(name="Current Strength", description="Current Strength ", dataType=FlyDataType.String, entityType="EE02", printName="Current Strength", fieldLength=0)
	CurrentStrength,
	//
	@FlyElement(name="Symbol", description="Symbol of the currency (opt used for printing only)", help="The Currency Symbol defines the symbol that will print when this currency is used.", dataType=FlyDataType.String, entityType="D", printName="Currency", fieldLength=10)
	CurSymbol,
	//
	@FlyElement(name="Employee Remuneration", description="Employee Wage or Salary Overwrite", help="Overwrite the standard Remuneration", dataType=FlyDataType.ID, entityType="D", printName="Employee Remuneration", fieldLength=10)
	C_UserRemuneration_ID,
	//
	@FlyElement(name="Customer No", description="EDI Identification Number ", dataType=FlyDataType.String, entityType="D", printName="Customer No", fieldLength=20)
	CustomerNo,
	//
	@FlyElement(name="Customer Open Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Customer Open Invoices", fieldLength=0)
	CustomerOpenInvoices,
	//
	@FlyElement(name="Custom Prefix", description="Prefix for Custom entities", help="The prefix listed are ignored as customization for database or entity migration", dataType=FlyDataType.String, entityType="D", printName="Custom Prefix", fieldLength=60)
	CustomPrefix,
	//
	@FlyElement(name="Combination", description="Valid Account Combination", help="The Combination identifies a valid combination of element which represent a GL account.", dataType=FlyDataType.ID, entityType="D", printName="Combination", fieldLength=22)
	C_ValidCombination_ID,
	//
	@FlyElement(name="Withholding", description="Withholding type defined", help="The Withholding indicates the type of withholding to be calculated.", dataType=FlyDataType.TableDirect, entityType="D", printName="Withholding", fieldLength=22)
	C_Withholding_ID,
	//
	@FlyElement(name="Cycle Name", description="Name of the Project Cycle", dataType=FlyDataType.String, entityType="D", printName="Cycle", fieldLength=60)
	CycleName,
	//
	@FlyElement(name="Cycle Step Name", description="Name of the Project Cycle Step", dataType=FlyDataType.String, entityType="D", printName="Cycle Step", fieldLength=60)
	CycleStepName,
	//
	@FlyElement(name="Year", description="Calendar Year", help="The Year uniquely identifies an accounting year for a calendar.", dataType=FlyDataType.TableDirect, entityType="D", printName="Year", fieldLength=22)
	C_Year_ID,
	//
	@FlyElement(name="Daily Capacity", dataType=FlyDataType.Quantity, entityType="EE01", printName="Daily Capacity", fieldLength=10)
	DailyCapacity,
	//
	@FlyElement(name="Daily Salary", description="Daily Salary", dataType=FlyDataType.Number, entityType="EE02", printName="Daily Salary", fieldLength=0)
	DailySalary,
	//
	@FlyElement(name="Daily Salary (Concept)", description="Reference to concept used for daily salary", dataType=FlyDataType.Table, entityType="ECA02", printName="Daily Salary (Concept)", fieldLength=10)
	DailySalary_ID,
	//
	@FlyElement(name="Data Column 2", description="Data Column for Line Charts", help="Additional Graph Data Column for Line/Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="Data Column 2", fieldLength=22)
	Data1_PrintFormatItem_ID,
	//
	@FlyElement(name="Data Column 3", description="Data Column for Line Charts", help="Additional Graph Data Column for Line/Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="Data Column 3", fieldLength=22)
	Data2_PrintFormatItem_ID,
	//
	@FlyElement(name="Data Column 4", description="Data Column for Line Charts", help="Additional Graph Data Column for Line/Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="Data Column 4", fieldLength=22)
	Data3_PrintFormatItem_ID,
	//
	@FlyElement(name="Data Column 5", description="Data Column for Line Charts", help="Additional Graph Data Column for Line/Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="Data Column 5", fieldLength=22)
	Data4_PrintFormatItem_ID,
	//
	@FlyElement(name="Database", description="Database Information", dataType=FlyDataType.String, entityType="D", printName="Database", fieldLength=255)
	DatabaseInfo,
	//
	@FlyElement(name="Data Format", description="Format String in Java Notation, e.g. ddMMyy", help="The Date Format indicates how dates are defined on the record to be imported.  It must be in Java Notation", dataType=FlyDataType.String, entityType="D", printName="Data Format", fieldLength=20)
	DataFormat,
	//
	@FlyElement(name="Data Column", description="Data Column for Pie and Line Charts", help="Graph Data Column for Pie and Line/Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="Data Column", fieldLength=22)
	Data_PrintFormatItem_ID,
	//
	@FlyElement(name="Data Type", description="Type of data", dataType=FlyDataType.List, entityType="D", printName="Data Type", fieldLength=1)
	DataType,
	//
	@FlyElement(name="Date", description="Date when business is not conducted", help="The Date field identifies a calendar date on which business will not be conducted.", dataType=FlyDataType.Date, entityType="D", printName="Date", fieldLength=7)
	Date1,
	//
	@FlyElement(name="Account Date", description="Accounting Date", help="The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.", dataType=FlyDataType.Date, entityType="D", printName="Acct Date", fieldLength=7)
	DateAcct,
	//
	@FlyElement(name="DateAcct2", dataType=FlyDataType.NONE, entityType="D", printName="DateAcct2", fieldLength=0)
	DateAcct2,
	//
	@FlyElement(name="Date Column", description="Fully qualified date column", help="The Date Column indicates the date to be used when calculating this measurement", dataType=FlyDataType.String, entityType="D", printName="Date Column", fieldLength=60)
	DateColumn,
	//
	@FlyElement(name="Complete Plan", description="Planned Completion Date", help="Date when the task is planned to be complete", dataType=FlyDataType.Date, entityType="D", printName="Complete Plan", fieldLength=7)
	DateCompletePlan,
	//
	@FlyElement(name="Date Confirm", description="Date Confirm of this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Confirm", fieldLength=29)
	DateConfirm,
	//
	@FlyElement(name="Contract Date", description="The (planned) effective date of this document.", help="The contract date is used to determine when the document becomes effective. This is usually the contract date.  The contract date is used in reports and report parameters.", dataType=FlyDataType.Date, entityType="D", printName="Contract Date", fieldLength=7)
	DateContract,
	//
	@FlyElement(name="Date Delivered", description="Date when the product was delivered", dataType=FlyDataType.Date, entityType="D", printName="Date Delivered", fieldLength=7)
	DateDelivered,
	//
	@FlyElement(name="Document Date", description="Date of the Document", help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.", dataType=FlyDataType.Date, entityType="D", printName="Doc date", fieldLength=7)
	DateDoc,
	//
	@FlyElement(name="Expense Date", description="Date of expense", help="Date of expense", dataType=FlyDataType.Date, entityType="D", printName="Expense Date", fieldLength=7)
	DateExpense,
	//
	@FlyElement(name="Finish Date", description="Finish or (planned) completion date", help="The finish date is used to indicate when the project is expected to be completed or has been completed.", dataType=FlyDataType.Date, entityType="D", printName="Finish Date", fieldLength=7)
	DateFinish,
	//
	@FlyElement(name="Date Finish Schedule", description="Scheduled Finish date for this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Finish Schedule", fieldLength=29)
	DateFinishSchedule,
	//
	@FlyElement(name="Date Format", description="Date format used in the input format", help="The date format is usually detected, but sometimes need to be defined.", dataType=FlyDataType.String, entityType="D", printName="Date Format", fieldLength=20)
	DateFormat,
	//
	@FlyElement(name="Date From", description="Starting date for a range", help="The Date From indicates the starting date of a range.", dataType=FlyDataType.Date, entityType="D", printName="Date From", fieldLength=7)
	DateFrom,
	//
	@FlyElement(name="Invited", description="Date when (last) invitation was sent", dataType=FlyDataType.Date, entityType="D", printName="Invited", fieldLength=7)
	DateInvited,
	//
	@FlyElement(name="Date Invoiced", description="Date printed on Invoice", help="The Date Invoice indicates the date printed on the invoice.", dataType=FlyDataType.Date, entityType="D", printName="Date Invoiced", fieldLength=7)
	DateInvoiced,
	//
	@FlyElement(name="Date last action", description="Date this request was last acted on", help="The Date Last Action indicates that last time that the request was acted on.", dataType=FlyDataType.DateTime, entityType="D", printName="Date last action", fieldLength=7)
	DateLastAction,
	//
	@FlyElement(name="Last Alert", description="Date when last alert were sent", help="The last alert date is updated when a reminder email is sent", dataType=FlyDataType.DateTime, entityType="D", printName="Last Alert", fieldLength=7)
	DateLastAlert,
	//
	@FlyElement(name="Date last inventory count", description="Date of Last Inventory Count", help="The Date Last Inventory Count indicates the last time an Inventory count was done.", dataType=FlyDataType.Date, entityType="D", printName="Date last inventory count", fieldLength=7)
	DateLastInventory,
	//
	@FlyElement(name="Last Paid Date", description="Last Paid Date", help="The Last Paid Date of an Insurance", dataType=FlyDataType.Date, entityType="EE02", printName="Last Paid Date", fieldLength=7)
	DateLastPaid,
	//
	@FlyElement(name="Last Premium Date", description="Last Premium Date", help="The Last Premium Date of an Insurance", dataType=FlyDataType.Date, entityType="EE02", printName="Last Premium Date", fieldLength=7)
	DateLastPremium,
	//
	@FlyElement(name="Date last run", description="Date the process was last run.", help="The Date Last Run indicates the last time that a process was run.", dataType=FlyDataType.DateTime, entityType="D", printName="Date last run", fieldLength=7)
	DateLastRun,
	//
	@FlyElement(name="Date next action", description="Date that this request should be acted on", help="The Date Next Action indicates the next scheduled date for an action to occur for this request.", dataType=FlyDataType.DateTime, entityType="D", printName="Date next action", fieldLength=7)
	DateNextAction,
	//
	@FlyElement(name="Date next run", description="Date the process will run next", help="The Date Next Run indicates the next time this process will run.", dataType=FlyDataType.DateTime, entityType="D", printName="Date next run", fieldLength=7)
	DateNextRun,
	//
	@FlyElement(name="Date Ordered", description="Date of Order", help="Indicates the Date an item was ordered.", dataType=FlyDataType.Date, entityType="D", printName="Date Ordered", fieldLength=7)
	DateOrdered,
	//
	@FlyElement(name="Date Pattern", description="Java Date Pattern", help="Option Date pattern in Java notation. Examples: dd.MM.yyyy - dd/MM/yyyy If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.String, entityType="D", printName="Date Pattern", fieldLength=20)
	DatePattern,
	//
	@FlyElement(name="Date printed", description="Date the document was printed.", help="Indicates the Date that a document was printed.", dataType=FlyDataType.Date, entityType="D", printName="Date printed", fieldLength=7)
	DatePrinted,
	//
	@FlyElement(name="Date Promised", description="Date Order was promised", help="The Date Promised indicates the date, if any, that an Order was promised for.", dataType=FlyDataType.Date, entityType="D", printName="Date Promised", fieldLength=7)
	DatePromised,
	//
	@FlyElement(name="Date received", description="Date a product was received", help="The Date Received indicates the date that product was received.", dataType=FlyDataType.Date, entityType="D", printName="Date received", fieldLength=7)
	DateReceived,
	//
	@FlyElement(name="Report Date", description="Expense/Time Report Date", help="Date of Expense/Time Report", dataType=FlyDataType.Date, entityType="D", printName="Report Date", fieldLength=7)
	DateReport,
	//
	@FlyElement(name="Date Required", description="Date when required", dataType=FlyDataType.Date, entityType="D", printName="Date Required", fieldLength=7)
	DateRequired,
	//
	@FlyElement(name="Response Date", description="Date of the Response", help="Date of the Response", dataType=FlyDataType.Date, entityType="D", printName="Response Date", fieldLength=7)
	DateResponse,
	//
	@FlyElement(name="Revaluation Date", description="Date of Revaluation", dataType=FlyDataType.Date, entityType="D", printName="Reval Date", fieldLength=7)
	DateReval,
	//
	@FlyElement(name="Date Simulation", description="Simulation date for this Material Plan", dataType=FlyDataType.DateTime, entityType="D", printName="Date Simulation", fieldLength=29)
	DateSimulation,
	//
	@FlyElement(name="Date Start", description="Date Start for this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Start", fieldLength=29)
	DateStart,
	//
	@FlyElement(name="Start Plan", description="Planned Start Date", help="Date when you plan to start", dataType=FlyDataType.Date, entityType="D", printName="Start Plan", fieldLength=7)
	DateStartPlan,
	//
	@FlyElement(name="Date Start Schedule", description="Scheduled start date for this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Start Schedule", fieldLength=29)
	DateStartSchedule,
	//
	@FlyElement(name="Date To", description="End date of a date range", help="The Date To indicates the end date of a range (inclusive)", dataType=FlyDataType.Date, entityType="D", printName="Date To", fieldLength=7)
	DateTo,
	//
	@FlyElement(name="Transaction Date", description="Transaction Date", help="The Transaction Date indicates the date of the transaction.", dataType=FlyDataType.Date, entityType="D", printName="Trx Date", fieldLength=7)
	DateTrx,
	//
	@FlyElement(name="Valuation Date", description="Date of valuation", dataType=FlyDataType.Date, entityType="D", printName="Valuation Date", fieldLength=7)
	DateValue,
	//
	@FlyElement(name="Work Complete", description="Date when work is (planned to be) complete", dataType=FlyDataType.Date, entityType="D", printName="Work Complete", fieldLength=7)
	DateWorkComplete,
	//
	@FlyElement(name="Work Start", description="Date when work is (planned to be) started", dataType=FlyDataType.Date, entityType="D", printName="Work Start", fieldLength=7)
	DateWorkStart,
	//
	@FlyElement(name="Days after due date", description="Days after due date to dun (if negative days until due)", help="The Days After Due Date indicates the number of days after the payment due date to initiate dunning. If the number is negative, it includes not the not due invoices.", dataType=FlyDataType.Number, entityType="D", printName="Days after due date", fieldLength=22)
	DaysAfterDue,
	//
	@FlyElement(name="Days between dunning", description="Days between sending dunning notices", help="The Days Between Dunning indicates the number of days between sending dunning notices.", dataType=FlyDataType.Integer, entityType="D", printName="Days between dunning", fieldLength=22)
	DaysBetweenDunning,
	//
	@FlyElement(name="Days due", description="Number of days due (negative: due in number of days)", dataType=FlyDataType.Integer, entityType="D", printName="Days Due", fieldLength=22)
	DaysDue,
	//
	@FlyElement(name="Days From", dataType=FlyDataType.Integer, entityType="D", printName="Days From", fieldLength=0)
	DaysFrom,
	//
	@FlyElement(name="Days To", dataType=FlyDataType.Integer, entityType="D", printName="Days To", fieldLength=0)
	DaysTo,
	//
	@FlyElement(name="DB Address", description="JDBC URL of the database server", dataType=FlyDataType.String, entityType="D", printName="DB Address", fieldLength=255)
	DBAddress,
	//
	@FlyElement(name="Database Name", description="Database Name", dataType=FlyDataType.String, entityType="D", printName="DB Name", fieldLength=60)
	DBInstance,
	//
	@FlyElement(name="DBType", dataType=FlyDataType.List, entityType="D", printName="DBType", fieldLength=22)
	DBType,
	//
	@FlyElement(name="Compartment Assignment  ID", dataType=FlyDataType.NONE, entityType="EE03", printName="Compartment Assignment  ID", fieldLength=0)
	DD_CompartmentAssignment_ID,
	//
	@FlyElement(name="Transport Compartment", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Transport Compartment", fieldLength=0)
	DD_Compartment_ID,
	//
	@FlyElement(name="Transport Compatibility Group", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Transport Compatibility Group", fieldLength=0)
	DD_CompatibilityGroup_ID,
	//
	@FlyElement(name="Driver Assignment", dataType=FlyDataType.NONE, entityType="EE03", printName="Driver Assignment", fieldLength=0)
	DD_DriverAssignment_ID,
	//
	@FlyElement(name="Driver", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Driver", fieldLength=0)
	DD_Driver_ID,
	//
	@FlyElement(name="Order Freight ID", dataType=FlyDataType.NONE, entityType="EE03", printName="Order Freight ID", fieldLength=0)
	DD_Freight_ID,
	//
	@FlyElement(name="Order Freight Line ID", dataType=FlyDataType.NONE, entityType="EE03", printName="Order Freight Line ID", fieldLength=0)
	DD_FreightLine_ID,
	//
	@FlyElement(name="License Types Assignment", dataType=FlyDataType.NONE, entityType="EE03", printName="License Types Assignment", fieldLength=0)
	DD_LicenseAssignment_ID,
	//
	@FlyElement(name="License", dataType=FlyDataType.TableDirect, entityType="EE03", printName="License", fieldLength=0)
	DD_License_ID,
	//
	@FlyElement(name="Transport License Type", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Transport License Type", fieldLength=0)
	DD_LicenseType_ID,
	//
	@FlyElement(name="Network Distribution", description="Identifies a distribution network, distribution networks are used to establish the source and target of the materials in the supply chain", help="DRP uses the distribution networks to generate the distribution plan.		A distribution network defines the supply path by a relationship between the source and target warehouse and a percentage of the supply quantity.", dataType=FlyDataType.ID, entityType="EE01", printName="Network Distribution", fieldLength=22)
	DD_NetworkDistribution_ID,
	//
	@FlyElement(name="Network Distribution Line", dataType=FlyDataType.ID, entityType="EE01", printName="Network Distribution Line", fieldLength=22)
	DD_NetworkDistributionLine_ID,
	//
	@FlyElement(name="Distribution Order", dataType=FlyDataType.ID, entityType="EE01", printName="Distribution Order", fieldLength=22)
	DD_Order_ID,
	//
	@FlyElement(name="Distribution Order Line", dataType=FlyDataType.ID, entityType="EE01", printName="Distribution Order Line", fieldLength=22)
	DD_OrderLine_ID,
	//
	@FlyElement(name="Transport Requirement Assignment", dataType=FlyDataType.NONE, entityType="EE03", printName="Transport Requirement Assignment", fieldLength=0)
	DD_RequirementAssignment_ID,
	//
	@FlyElement(name="Transport Requirement", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Transport Requirement", fieldLength=0)
	DD_Requirement_ID,
	//
	@FlyElement(name="Transport Requirement Type", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Transport Requirement Type", fieldLength=0)
	DD_RequirementType_ID,
	//
	@FlyElement(name="Transport Assignment", dataType=FlyDataType.NONE, entityType="EE03", printName="Transport Assignment", fieldLength=0)
	DD_TransportAssignment_ID,
	//
	@FlyElement(name="Transport Unit", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Transport Unit", fieldLength=0)
	DD_TransportUnit_ID,
	//
	@FlyElement(name="Transport Unit Type", dataType=FlyDataType.NONE, entityType="EE03", printName="Transport Unit Type", fieldLength=0)
	DD_TransportUnitType_ID,
	//
	@FlyElement(name="Vehicle Assignment ID", dataType=FlyDataType.NONE, entityType="EE03", printName="Vehicle Assignment ID", fieldLength=0)
	DD_VehicleAssignment_ID,
	//
	@FlyElement(name="Vehicle", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Vehicle", fieldLength=0)
	DD_Vehicle_ID,
	//
	@FlyElement(name="Vehicle Type", dataType=FlyDataType.TableDirect, entityType="EE03", printName="Vehicle Type", fieldLength=0)
	DD_VehicleType_ID,
	//
	@FlyElement(name="Decimal Pattern", description="Java Decimal Pattern", help="Option Decimal pattern in Java notation. Examples: 0000 will format 23 to 0023", dataType=FlyDataType.String, entityType="D", printName="Decimal Pattern", fieldLength=40)
	DecimalPattern,
	//
	@FlyElement(name="Decimal Point", description="Decimal Point in the data file - if any", dataType=FlyDataType.String, entityType="D", printName="Decimal Point", fieldLength=1)
	DecimalPoint,
	//
	@FlyElement(name="Decision date", dataType=FlyDataType.Date, entityType="D", printName="Decision date", fieldLength=7)
	DecisionDate,
	//
	@FlyElement(name="Default Account", description="Name of the Default Account Column", dataType=FlyDataType.String, entityType="D", printName="Default Account", fieldLength=30)
	Default_Account,
	//
	@FlyElement(name="Default Print Color", dataType=FlyDataType.Table, entityType="D", printName="Default Print Color", fieldLength=22)
	Default_AD_PrintColor_ID,
	//
	@FlyElement(name="Default Print Font", dataType=FlyDataType.Table, entityType="D", printName="Default Print Font", fieldLength=22)
	Default_AD_PrintFont_ID,
	//
	@FlyElement(name="Default Logic", description="Default value hierarchy, separated by ;", help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.", dataType=FlyDataType.Text, entityType="D", printName="Default Logic", fieldLength=2000)
	DefaultValue,
	//
	@FlyElement(name="Default Logic 2", description="Default value hierarchy, separated by ;", help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.", dataType=FlyDataType.String, entityType="D", printName="Default Logic 2", fieldLength=2000)
	DefaultValue2,
	//
	@FlyElement(name="Definite Sequence", dataType=FlyDataType.Table, entityType="D", printName="Definite Sequence", fieldLength=22)
	DefiniteSequence_ID,
	//
	@FlyElement(name="Degree Name", description="Degree Name for an Employee Import", help="The Degree Name for an Employee", dataType=FlyDataType.String, entityType="ECA02", printName="Degree Name", fieldLength=255)
	DegreeName,
	//
	@FlyElement(name="Degree Value", description="Degree Value for an Employee Import", help="The Degree for an Employee", dataType=FlyDataType.String, entityType="ECA02", printName="Degree Value", fieldLength=60)
	DegreeValue,
	//
	@FlyElement(name="Delete old/existing records", description="Otherwise records will be added", dataType=FlyDataType.NONE, entityType="D", printName="Delete old/existing records", fieldLength=0)
	DeleteOld,
	//
	@FlyElement(name="Delete old imported records", description="Before processing delete old imported records in the import table", dataType=FlyDataType.NONE, entityType="D", printName="Delete old imported", fieldLength=0)
	DeleteOldImported,
	//
	@FlyElement(name="Delete existing Accounting Entries", description="The selected accounting entries will be deleted!  DANGEROUS !!!", dataType=FlyDataType.NONE, entityType="D", printName="Delete existing Accounting Entries", fieldLength=0)
	DeletePosting,
	//
	@FlyElement(name="Delivery Confirmation", description="EMail Delivery confirmation", dataType=FlyDataType.String, entityType="D", printName="Delivery Confirmation", fieldLength=120)
	DeliveryConfirmation,
	//
	@FlyElement(name="Delivery Count", description="Number of Deliveries", dataType=FlyDataType.Integer, entityType="D", printName="Delivery Count", fieldLength=22)
	DeliveryCount,
	//
	@FlyElement(name="Delivery Days", description="Number of Days (planned) until Delivery", dataType=FlyDataType.Integer, entityType="D", printName="Delivery Days", fieldLength=22)
	DeliveryDays,
	//
	@FlyElement(name="Delivery Rule", description="Defines the timing of Delivery", help="The Delivery Rule indicates when an order should be delivered. For example should the order be delivered when the entire order is complete, when a line is complete or as the products become available.", dataType=FlyDataType.List, entityType="D", printName="Delivery Rule", fieldLength=1)
	DeliveryRule,
	//
	@FlyElement(name="Actual Delivery Time", description="Actual days between order and delivery", help="The Actual Delivery Time indicates the number of days elapsed between placing an order and the delivery of the order", dataType=FlyDataType.Integer, entityType="D", printName="Actual Delivery Time", fieldLength=22)
	DeliveryTime_Actual,
	//
	@FlyElement(name="Promised Delivery Time", description="Promised days between order and delivery", help="The Promised Delivery Time indicates the number of days between the order date and the date that delivery was promised.", dataType=FlyDataType.Integer, entityType="D", printName="Promised Delivery Time", fieldLength=22)
	DeliveryTime_Promised,
	//
	@FlyElement(name="Delivery Via", description="How the order will be delivered", help="The Delivery Via indicates how the products should be delivered. For example, will the order be picked up or shipped.", dataType=FlyDataType.List, entityType="D", printName="Delivery Via", fieldLength=1)
	DeliveryViaRule,
	//
	@FlyElement(name="Delta Amount", description="Difference Amount", dataType=FlyDataType.Amount, entityType="D", printName="Delta Amt", fieldLength=22)
	DeltaAmt,
	//
	@FlyElement(name="Delta Quantity", description="Quantity Difference", dataType=FlyDataType.Quantity, entityType="D", printName="Delta Qty", fieldLength=22)
	DeltaQty,
	//
	@FlyElement(name="Delta Use Life Years", dataType=FlyDataType.NONE, entityType="D", printName="Delta Use Life Years", fieldLength=0)
	DeltaUseLifeYears,
	//
	@FlyElement(name="Delta Use Life Years (fiscal)", description="Delta Use Life Years (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Delta Use Life Years (fiscal)", fieldLength=0)
	DeltaUseLifeYears_F,
	//
	@FlyElement(name="Department Name", description="Department Name", dataType=FlyDataType.String, entityType="EE02", printName="Department Name", fieldLength=60)
	DepartmentName,
	//
	@FlyElement(name="Department Value", description="Department Value", dataType=FlyDataType.String, entityType="EE02", printName="Department Value", fieldLength=40)
	DepartmentValue,
	//
	@FlyElement(name="Dependent Birthday", description="Dependent Birthday or Anniversary day", help="Dependent Birthday or Anniversary day", dataType=FlyDataType.Date, entityType="ECA02", printName="Dependent Birthday", fieldLength=7)
	DependentBirthday,
	//
	@FlyElement(name="DepreciationType", dataType=FlyDataType.String, entityType="D", printName="DepreciationType", fieldLength=10)
	DepreciationType,
	//
	@FlyElement(name="Description", description="Optional short description of the record", help="A description is limited to 255 characters.", dataType=FlyDataType.Text, entityType="D", printName="Description", fieldLength=255)
	Description,
	//
	@FlyElement(name="Description Column", description="Description Column for Pie/Line/Bar Charts", help="Graph Description Column for Pie and Line/Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="Description Column", fieldLength=22)
	Description_PrintFormatItem_ID,
	//
	@FlyElement(name="Description URL", description="URL for the description", dataType=FlyDataType.URL, entityType="D", printName="Description URL", fieldLength=120)
	DescriptionURL,
	//
	@FlyElement(name="Designation Value", description="Designation Value is a nationally recognized level", help="Designation Value is a nationally recognized level of achievement within the field of human resources.", dataType=FlyDataType.String, entityType="EE02", printName="Designation Value", fieldLength=60)
	DesignationValue,
	//
	@FlyElement(name="Designation (When Left)", description="Designation (When Left)", help="The Designation (When Left)", dataType=FlyDataType.String, entityType="EE02", printName="Designation (When Left)", fieldLength=0)
	DesignationWhenLeft,
	//
	@FlyElement(name="Designation (When Joined)", description="Designation (When Joined)", help="The Designation (When Joined) of an employee in this work.", dataType=FlyDataType.String, entityType="EE02", printName="Designation (When Joined)", fieldLength=0)
	DesignationWhereJoined,
	//
	@FlyElement(name="Destination_Directory", dataType=FlyDataType.String, entityType="D", printName="Destination_Directory", fieldLength=255)
	Destination_Directory,
	//
	@FlyElement(name="Destination_FileName", dataType=FlyDataType.String, entityType="D", printName="Destination_FileName", fieldLength=255)
	Destination_FileName,
	//
	@FlyElement(name="Detail Information", description="Additional Detail Information", dataType=FlyDataType.LongText, entityType="D", printName="Detail Information", fieldLength=0)
	DetailInfo,
	//
	@FlyElement(name="Details/Source First", description="Details and Sources are printed before the Line", dataType=FlyDataType.NONE, entityType="D", printName="Details/Source First", fieldLength=0)
	DetailsSourceFirst,
	//
	@FlyElement(name="Developer Name", dataType=FlyDataType.String, entityType="D", printName="Developer Name", fieldLength=60)
	DeveloperName,
	//
	@FlyElement(name="Difference", description="Difference Amount", dataType=FlyDataType.Amount, entityType="D", printName="Difference", fieldLength=22)
	DifferenceAmt,
	//
	@FlyElement(name="Difference", description="Difference Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Difference", fieldLength=22)
	DifferenceQty,
	//
	@FlyElement(name="Dimension Units", description="Units of Dimension", dataType=FlyDataType.List, entityType="D", printName="Units", fieldLength=1)
	DimensionUnits,
	//
	@FlyElement(name="Dimension Unit of Measure", dataType=FlyDataType.Table, entityType="EE03", printName="Dimension Unit of Measure", fieldLength=0)
	Dimension_UOM_ID,
	//
	@FlyElement(name="Direct Deploy", dataType=FlyDataType.Button, entityType="D", printName="Direct Deploy", fieldLength=1)
	DirectDeploy,
	//
	@FlyElement(name="Discontinued", description="This product is no longer available", help="The Discontinued check box indicates a product that has been discontinued.", dataType=FlyDataType.YesNo, entityType="D", printName="Discontinued", fieldLength=1)
	Discontinued,
	//
	@FlyElement(name="Discontinued At", description="Discontinued At indicates Date when product was discontinued", dataType=FlyDataType.Date, entityType="D", printName="Discontinued At", fieldLength=7)
	DiscontinuedAt,
	//
	@FlyElement(name="Discontinued by", description="Discontinued By", help="The Discontinued By indicates the individual who discontinued this product", dataType=FlyDataType.NONE, entityType="D", printName="Discontinued by", fieldLength=0)
	DiscontinuedBy,
	//
	@FlyElement(name="Discount %", description="Discount in percent", help="The Discount indicates the discount applied or taken as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="Discount %", fieldLength=22)
	Discount,
	//
	@FlyElement(name="Discount 2 %", description="Discount in percent", help="The Discount indicates the discount applied or taken as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="Discount 2 %", fieldLength=22)
	Discount2,
	//
	@FlyElement(name="Discount Amount", description="Calculated amount of discount", help="The Discount Amount indicates the discount amount for a document or line.", dataType=FlyDataType.Amount, entityType="D", printName="Discount", fieldLength=22)
	DiscountAmt,
	//
	@FlyElement(name="Discount Date", description="Last Date for payments with discount", help="Last Date where a deduction of the payment discount is allowed", dataType=FlyDataType.Date, entityType="D", printName="Discount Date", fieldLength=7)
	DiscountDate,
	//
	@FlyElement(name="Discount Days", description="Number of days from invoice date to be eligible for discount", help="The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.  ", dataType=FlyDataType.Integer, entityType="D", printName="Discount Days", fieldLength=22)
	DiscountDays,
	//
	@FlyElement(name="Discount Days 2", description="Number of days from invoice date to be eligible for discount", help="The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.  ", dataType=FlyDataType.Integer, entityType="D", printName="Discount Days 2", fieldLength=22)
	DiscountDays2,
	//
	@FlyElement(name="Discount Type", description="Type of trade discount calculation", help="Type of procedure used to calculate the trade discount percentage", dataType=FlyDataType.List, entityType="D", printName="Discount Type", fieldLength=1)
	DiscountType,
	//
	@FlyElement(name="Display Length", description="Length of the display in characters", help="The display length is mainly for String fields. The length has no impact, if the data type of the field is - Integer, Number, Amount	(length determined by the system) - YesNo	(Checkbox) - List, Table, TableDir	(length of combo boxes are determined by their content at runtime)", dataType=FlyDataType.Integer, entityType="D", printName="Display Length", fieldLength=22)
	DisplayLength,
	//
	@FlyElement(name="Display Logic", description="If the Field is displayed, the result determines if the field is actually displayed", help="format := {expression} [{logic} {expression}]<br> 	expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> 	logic := {|}|{&}<br>	context := any global or window context <br>	value := strings or numbers<br>	logic operators	:= AND or OR with the previous result from left to right <br>	operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>	Examples: <br>	@AD_Table_ID@=14 | @Language@!GERGER <br>	@PriceLimit@>10 | @PriceList@>@PriceActual@<br>	@Name@>J<br>	Strings may be in single quotes (optional)", dataType=FlyDataType.Text, entityType="D", printName="Display Logic", fieldLength=2000)
	DisplayLogic,
	//
	@FlyElement(name="Address Print Format", description="Format for printing this Address", help="The Address Print format defines the format to be used when this address prints.  The following notations are used: @C@=City  @P@=Postal  @A@=PostalAdd  @R@=Region", dataType=FlyDataType.String, entityType="D", printName="Address Print Format", fieldLength=20)
	DisplaySequence,
	//
	@FlyElement(name="Local Address Format", description="Format for printing this Address locally", help="The optional Local Address Print format defines the format to be used when this address prints for the Country.  If defined, this format is used for printing the address for the country rather then the standard address format.	 The following notations are used: @C@=City  @P@=Postal  @A@=PostalAdd  @R@=Region", dataType=FlyDataType.String, entityType="D", printName="Local Address Format", fieldLength=20)
	DisplaySequenceLocal,
	//
	@FlyElement(name="Display SQL", description="SQL for display of lookup value", help="Fully qualified subquery SQL", dataType=FlyDataType.NONE, entityType="D", printName="Display SQL", fieldLength=0)
	DisplaySQL,
	//
	@FlyElement(name="Distribution Order Mail Text", description="Email text used for sending Distribution Order", help="Standard email template used to send Manufacturing Order as attachments.", dataType=FlyDataType.Table, entityType="EE01", printName="Distribution Order Text", fieldLength=22)
	Distrib_Order_MailText_ID,
	//
	@FlyElement(name="Distribution Order Print Format", description="Print Format for printing Distribution Order", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="EE01", printName="Distribution Order Print Format", fieldLength=22)
	Distrib_Order_PrintFormat_ID,
	//
	@FlyElement(name="Distribution Sorting", description="Quantity distribution sorting by unit price", dataType=FlyDataType.List, entityType="D", printName="Distribution Sorting", fieldLength=1)
	DistributionSorting,
	//
	@FlyElement(name="Distribution Type", description="Type of quantity distribution calculation using comparison qty and order qty as operand", dataType=FlyDataType.List, entityType="D", printName="Distribution Type", fieldLength=1)
	DistributionType,
	//
	@FlyElement(name="Divide by 100", description="Divide number by 100 to get correct amount", dataType=FlyDataType.YesNo, entityType="D", printName="Divide by 100", fieldLength=1)
	DivideBy100,
	//
	@FlyElement(name="Divide Rate", description="To convert Source number to Target number, the Source is divided", help="To convert Source number to Target number, the Source is divided by the divide rate.  If you enter a Divide Rate, the Multiply Rate will be automatically calculated.", dataType=FlyDataType.Number, entityType="D", printName="Divide Rate", fieldLength=22)
	DivideRate,
	//
	@FlyElement(name="Document Action", description="The targeted status of the document", help="You find the current status in the Document Status field. The options are listed in a popup", dataType=FlyDataType.Button, entityType="D", printName="Doc Action", fieldLength=2)
	DocAction,
	//
	@FlyElement(name="Document BaseType", description="Logical type of document", help="The Document Base Type identifies the base or starting point for a document.  Multiple document types may share a single document base type.", dataType=FlyDataType.List, entityType="D", printName="Doc BaseType", fieldLength=3)
	DocBaseType,
	//
	@FlyElement(name="Calculation Basis", description="Basis for the calculation the commission", help="The Calculation Basis indicates the basis to be used for the commission calculation. ", dataType=FlyDataType.List, entityType="D", printName="Calculation Basis", fieldLength=1)
	DocBasisType,
	//
	@FlyElement(name="Document Sequence", description="Document sequence determines the numbering of documents", help="The Document Sequence indicates the sequencing rule to use for this document type.", dataType=FlyDataType.Table, entityType="D", printName="Doc Sequence", fieldLength=22)
	DocNoSequence_ID,
	//
	@FlyElement(name="Document Status", description="The current status of the document", help="The Document Status indicates the status of a document at this time.  If you want to change the document status, use the Document Action field", dataType=FlyDataType.List, entityType="D", printName="Doc Status", fieldLength=2)
	DocStatus,
	//
	@FlyElement(name="SO Sub Type", description="Sales Order Sub Type", help="The SO Sub Type indicates the type of sales order this document refers to.  This field only appears when the Document Base Type is Sales Order.  The selection made here will determine which documents will be generated when an order is processed and which documents must be generated manually or in batches.  <br>	The following outlines this process.<br>	SO Sub Type of <b>Standard Order</b> will generate just the <b>Order</b> document when the order is processed.  <br>	The <b>Delivery Note</b>, <b>Invoice</b> and <b>Receipt</b> must be generated via other processes.  <br>	SO Sub Type of <b>Warehouse Order</b> will generate the <b>Order</b> and <b>Delivery Note</b>. <br> The <b>Invoice</b> and <b>Receipt</b> must be generated via other processes.<br>	SO Sub Type of <b>Credit Order</b> will generate the <b>Order</b>, <b>Delivery Note</b> and <b>Invoice</b>. <br> The <b>Receipt</b> must be generated via other processes.<br>	SO Sub Type of <b>POS</b> (Point of Sale) will generate all document", dataType=FlyDataType.List, entityType="D", printName="SO Sub Type", fieldLength=2)
	DocSubTypeSO,
	//
	@FlyElement(name="Document Type Name", description="Name of the Document Type", dataType=FlyDataType.String, entityType="D", printName="DocType Name", fieldLength=60)
	DocTypeName,
	//
	@FlyElement(name="Document Amt", description="Document Amount", dataType=FlyDataType.Amount, entityType="D", printName="Document Amt", fieldLength=22)
	DocumentAmt,
	//
	@FlyElement(name="Document Copies", description="Number of copies to be printed", help="The Document Copies indicates the number of copies of each document that will be generated.", dataType=FlyDataType.Integer, entityType="D", printName="Copies", fieldLength=22)
	DocumentCopies,
	//
	@FlyElement(name="Document Directory", description="Directory for documents from the application server", help="Directory to store documents by the application server.  The path/directory is accessed by the application server and may not be accessible to clients.", dataType=FlyDataType.String, entityType="D", printName="Document Dir", fieldLength=60)
	DocumentDir,
	//
	@FlyElement(name="Document No", description="Document sequence number of the document", help="The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in '<>'.		If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice).  If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the 'Maintain Sequence' window with the name 'DocumentNo_<TableName>', where TableName is the actual name of the table (e.g. C_Order).", dataType=FlyDataType.String, entityType="D", printName="Document No", fieldLength=30)
	DocumentNo,
	//
	@FlyElement(name="Document Note", description="Additional information for a Document", help="The Document Note is used for recording any additional information regarding this product.", dataType=FlyDataType.Text, entityType="D", printName="Doc Note", fieldLength=2000)
	DocumentNote,
	//
	@FlyElement(name="Document No (To)", description="Document sequence number of the document", help="The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in '<>'.		If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice).  If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the 'Maintain Sequence' window with the name 'DocumentNo_<TableName>', where TableName is the actual name of the table (e.g. C_Order).", dataType=FlyDataType.String, entityType="ECA02", printName="Document No (To)", fieldLength=30)
	DocumentNoTo,
	//
	@FlyElement(name="Document Type", description="Document Type", dataType=FlyDataType.String, entityType="D", printName="Document Type", fieldLength=60)
	DocumentType,
	//
	@FlyElement(name="Document Type Note", description="Optional note of a document type", dataType=FlyDataType.String, entityType="D", printName="Document Type Note", fieldLength=2000)
	DocumentTypeNote,
	//
	@FlyElement(name="Document Value Logic", description="Logic to determine Workflow Start - If true, a workflow process is started for the document", help="You can enter simple logic using variables like @Created@=@Updated@, which fires, when a record is created. If you need to evaluate also values of other records, you need to use SQL logic and need to prefix this logic with 'SQL='. Example: start a Order verify workflow, when a business partner ordered something and is over the credit limit  'SQL=EXISTS (SELECT * FROM C_BPartner bp WHERE C_Order. C_BPartner_ID=bp. C_BPartner_ID AND SO_CreditUsed > SO_CreditLimit)'.	Note that the SQL based logic checks for duplicate workflows (i.e. a workflow is started only once per record).", dataType=FlyDataType.String, entityType="D", printName="Doc Value Logic", fieldLength=2000)
	DocValueLogic,
	//
	@FlyElement(name="Domain Label", description="Label for the domain axis.", dataType=FlyDataType.String, entityType="D", printName="Domain Label", fieldLength=60)
	DomainLabel,
	//
	@FlyElement(name="Pricing", dataType=FlyDataType.Button, entityType="D", printName="Pricing", fieldLength=1)
	DoPricing,
	//
	@FlyElement(name="Download URL", description="URL of the Download files", help="Semicolon separated list of URLs to be downloaded or distributed", dataType=FlyDataType.URL, entityType="D", printName="Download URL", fieldLength=120)
	DownloadURL,
	//
	@FlyElement(name="Account (debit)", description="Account used", help="The (natural) account used", dataType=FlyDataType.NONE, entityType="D", printName="Account (debit)", fieldLength=0)
	DR_Account_ID,
	//
	@FlyElement(name="Driver Status", dataType=FlyDataType.List, entityType="EE03", printName="Driver Status", fieldLength=0)
	DriverStatus,
	//
	@FlyElement(name="Drop Shipment Partner", description="Business Partner to ship to", help="If empty the business partner will be shipped to.", dataType=FlyDataType.Search, entityType="D", printName="Drop Shipment  Partner", fieldLength=22)
	DropShip_BPartner_ID,
	//
	@FlyElement(name="Drop Shipment Location", description="Business Partner Location for shipping to", dataType=FlyDataType.Table, entityType="D", printName="Drop Shipment Location", fieldLength=22)
	DropShip_Location_ID,
	//
	@FlyElement(name="Drop Shipment Contact", description="Business Partner Contact for drop shipment", dataType=FlyDataType.Table, entityType="D", printName="Drop Shipment Contact", fieldLength=22)
	DropShip_User_ID,
	//
	@FlyElement(name="Drop Ship Warehouse", description="The (logical) warehouse to use for recording drop ship receipts and shipments.", help="The drop ship warehouse will be used for recording material transactions relating to drop shipments to and from this organization.", dataType=FlyDataType.Table, entityType="D", printName="Drop Ship Warehouse", fieldLength=22)
	DropShip_Warehouse_ID,
	//
	@FlyElement(name="Due Today", dataType=FlyDataType.Amount, entityType="D", printName="Due Today", fieldLength=22)
	Due0,
	//
	@FlyElement(name="Due Today-30", dataType=FlyDataType.Amount, entityType="D", printName="Due Today-30", fieldLength=22)
	Due0_30,
	//
	@FlyElement(name="Due Today-7", dataType=FlyDataType.Amount, entityType="D", printName="Due Today-7", fieldLength=22)
	Due0_7,
	//
	@FlyElement(name="Due 1-7", dataType=FlyDataType.Amount, entityType="D", printName="Due 1-7", fieldLength=22)
	Due1_7,
	//
	@FlyElement(name="Due 31-60", dataType=FlyDataType.Amount, entityType="D", printName="Due 31-60", fieldLength=22)
	Due31_60,
	//
	@FlyElement(name="Due > 31", dataType=FlyDataType.Amount, entityType="D", printName="Due > 31", fieldLength=22)
	Due31_Plus,
	//
	@FlyElement(name="Due 61-90", dataType=FlyDataType.Amount, entityType="D", printName="Due 61-90", fieldLength=22)
	Due61_90,
	//
	@FlyElement(name="Due > 61", dataType=FlyDataType.Amount, entityType="D", printName="Due > 61", fieldLength=22)
	Due61_Plus,
	//
	@FlyElement(name="Due 8-30", dataType=FlyDataType.Amount, entityType="D", printName="Due 8-30", fieldLength=22)
	Due8_30,
	//
	@FlyElement(name="Due > 91", dataType=FlyDataType.Amount, entityType="D", printName="Due > 91", fieldLength=22)
	Due91_Plus,
	//
	@FlyElement(name="Amount due", description="Amount of the payment due", help="Full amount of the payment due", dataType=FlyDataType.Amount, entityType="D", printName="Amount due", fieldLength=22)
	DueAmt,
	//
	@FlyElement(name="Due Date", description="Date when the payment is due", help="Date when the payment is due without deductions or discount", dataType=FlyDataType.Date, entityType="D", printName="Due Date", fieldLength=7)
	DueDate,
	//
	@FlyElement(name="Due Date Tolerance", description="Tolerance in days between the Date Next Action and the date the request is regarded as overdue", help="When the Date Next Action is passed, the Request becomes Due. After the Due Date Tolerance, the Request becomes Overdue.", dataType=FlyDataType.Integer, entityType="D", printName="Due Date Tolerance", fieldLength=22)
	DueDateTolerance,
	//
	@FlyElement(name="Due type", description="Status of the next action for this Request", help="The Due Type indicates if this request is Due, Overdue or Scheduled.", dataType=FlyDataType.List, entityType="D", printName="Due type", fieldLength=1)
	DueType,
	//
	@FlyElement(name="Dunning Date", description="Date of Dunning", dataType=FlyDataType.Date, entityType="D", printName="Dunning Date", fieldLength=7)
	DunningDate,
	//
	@FlyElement(name="Dunning Grace Date", dataType=FlyDataType.Date, entityType="D", printName="Dunning Grace Date", fieldLength=7)
	DunningGrace,
	//
	@FlyElement(name="Dunning Print Format", description="Print Format for printing Dunning Letters", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="Dunning Print Format", fieldLength=22)
	Dunning_PrintFormat_ID,
	//
	@FlyElement(name="D-U-N-S", description="Dun & Bradstreet Number", help="Used for EDI - For details see   www.dnb.com/dunsno/list.htm", dataType=FlyDataType.String, entityType="D", printName="D-U-N-S", fieldLength=11)
	DUNS,
	//
	@FlyElement(name="Duration", description="Normal Duration in Duration Unit", help="Expected (normal) Length of time for the execution", dataType=FlyDataType.Integer, entityType="D", printName="Duration", fieldLength=22)
	Duration,
	//
	@FlyElement(name="Duration Real", dataType=FlyDataType.Integer, entityType="EE01", printName="Duration Real", fieldLength=22)
	DurationReal,
	//
	@FlyElement(name="Duration Required", dataType=FlyDataType.Integer, entityType="EE01", printName="Duration Required", fieldLength=22)
	DurationRequired,
	//
	@FlyElement(name="Duration Unit", description="Unit of Duration", help="Unit to define the length of time for the execution", dataType=FlyDataType.List, entityType="D", printName="Duration Unit", fieldLength=1)
	DurationUnit,
	//
	@FlyElement(name="Dynamic Priority Change", description="Change of priority when Activity is suspended waiting for user", help="Starting with the Process / Node priority level, the priority of the suspended activity can be changed dynamically. Example +5 every 10 minutes", dataType=FlyDataType.Number, entityType="D", printName="Dyn Priority Change", fieldLength=22)
	DynPriorityChange,
	//
	@FlyElement(name="Dyn Priority Start", description="Starting priority before changed dynamically", dataType=FlyDataType.Integer, entityType="D", printName="Dyn Priority Start", fieldLength=22)
	DynPriorityStart,
	//
	@FlyElement(name="Dynamic Priority Unit", description="Change of priority when Activity is suspended waiting for user", help="Starting with the Process / Node priority level, the priority of the suspended activity can be changed dynamically. Example +5 every 10 minutes", dataType=FlyDataType.List, entityType="D", printName="Dyn Priority Unit", fieldLength=1)
	DynPriorityUnit,
	//
	@FlyElement(name="EDI Status", dataType=FlyDataType.List, entityType="D", printName="EDI Status", fieldLength=1)
	EDIStatus,
	//
	@FlyElement(name="EDI Type", dataType=FlyDataType.List, entityType="D", printName="EDI Type", fieldLength=1)
	EDIType,
	//
	@FlyElement(name="Employee Expense", description="Account for Employee Expenses", help="The Employee Expense Account identifies the account to use for recording expenses for this employee.", dataType=FlyDataType.Account, entityType="D", printName="Employee Expense", fieldLength=22)
	E_Expense_Acct,
	//
	@FlyElement(name="EFT Amount", description="Electronic Funds Transfer Amount", dataType=FlyDataType.Amount, entityType="D", printName="EFT Amount", fieldLength=22)
	EftAmt,
	//
	@FlyElement(name="EFT Check No", description="Electronic Funds Transfer Check No", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Check No", fieldLength=20)
	EftCheckNo,
	//
	@FlyElement(name="EFT Currency", description="Electronic Funds Transfer Currency", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Currency", fieldLength=20)
	EftCurrency,
	//
	@FlyElement(name="EFT Memo", description="Electronic Funds Transfer Memo", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Memo", fieldLength=2000)
	EftMemo,
	//
	@FlyElement(name="EFT Payee", description="Electronic Funds Transfer Payee information", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Payee", fieldLength=255)
	EftPayee,
	//
	@FlyElement(name="EFT Payee Account", description="Electronic Funds Transfer Payee Account Information", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Payee Account", fieldLength=40)
	EftPayeeAccount,
	//
	@FlyElement(name="EFT Reference", description="Electronic Funds Transfer Reference", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Reference", fieldLength=60)
	EftReference,
	//
	@FlyElement(name="EFT Statement Date", description="Electronic Funds Transfer Statement Date", help="Information from EFT media", dataType=FlyDataType.Date, entityType="D", printName="EFT Statement Date", fieldLength=7)
	EftStatementDate,
	//
	@FlyElement(name="EFT Statement Line Date", description="Electronic Funds Transfer Statement Line Date", help="Information from EFT media", dataType=FlyDataType.Date, entityType="D", printName="EFT Statement Line Date", fieldLength=7)
	EftStatementLineDate,
	//
	@FlyElement(name="EFT Statement Reference", description="Electronic Funds Transfer Statement Reference", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Statement Reference", fieldLength=60)
	EftStatementReference,
	//
	@FlyElement(name="EFT Trx ID", description="Electronic Funds Transfer Transaction ID", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Trx ID", fieldLength=40)
	EftTrxID,
	//
	@FlyElement(name="EFT Trx Type", description="Electronic Funds Transfer Transaction Type", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Trx Type", fieldLength=20)
	EftTrxType,
	//
	@FlyElement(name="EFT Effective Date", description="Electronic Funds Transfer Valuta (effective) Date", help="Information from EFT media", dataType=FlyDataType.Date, entityType="D", printName="EFT Effective Date", fieldLength=7)
	EftValutaDate,
	//
	@FlyElement(name="Elapsed Time ms", description="Elapsed Time in milli seconds", help="Elapsed Time in milli seconds", dataType=FlyDataType.Number, entityType="D", printName="Elapsed Time", fieldLength=22)
	ElapsedTimeMS,
	//
	@FlyElement(name="Electronic Scales", description="Allows to define path for Device Electronic Scales e.g. /dev/ttyS0/", dataType=FlyDataType.String, entityType="D", printName="Electronic Scales", fieldLength=120)
	ElectronicScales,
	//
	@FlyElement(name="Element Name", description="Name of the Element", dataType=FlyDataType.String, entityType="D", printName="Element Name", fieldLength=60)
	ElementName,
	//
	@FlyElement(name="Elements", description="Contains list of elements separated by CR", help="Contains a list of elements this template uses separated by a Carriage Return. Last line should be empty", dataType=FlyDataType.Text, entityType="D", printName="Elements", fieldLength=2000)
	Elements,
	//
	@FlyElement(name="Type", description="Element Type (account or user defined)", help="The Element Type indicates if this element is the Account element or is a User Defined element.  ", dataType=FlyDataType.List, entityType="D", printName="Type", fieldLength=1)
	ElementType,
	//
	@FlyElement(name="Element Key", description="Key of the element", dataType=FlyDataType.String, entityType="D", printName="Element Key", fieldLength=40)
	ElementValue,
	//
	@FlyElement(name="EMail Address", description="Electronic Mail Address", help="The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web.", dataType=FlyDataType.String, entityType="D", printName="EMail", fieldLength=60)
	EMail,
	//
	@FlyElement(name="Error EMail", description="Email address to send error messages to", dataType=FlyDataType.String, entityType="D", printName="Error EMail", fieldLength=60)
	EMail_Error_To,
	//
	@FlyElement(name="EMail Footer", description="Footer added to EMails", help="The footer is added to every email.", dataType=FlyDataType.Text, entityType="D", printName="EMail Footer", fieldLength=2000)
	EMailFooter,
	//
	@FlyElement(name="From EMail", description="Full EMail address used to send requests - e.g. edi@organization.com", dataType=FlyDataType.String, entityType="D", printName="From EMail", fieldLength=60)
	EMail_From,
	//
	@FlyElement(name="From EMail Password", description="Password of the sending EMail address", dataType=FlyDataType.String, entityType="D", printName="From EMail Pwd", fieldLength=20)
	EMail_From_Pwd,
	//
	@FlyElement(name="From EMail User ID", description="User ID of the sending EMail address (on default SMTP Host) - e.g. edi", dataType=FlyDataType.String, entityType="D", printName="From EMail User", fieldLength=20)
	EMail_From_Uid,
	//
	@FlyElement(name="EMail Header", description="Header added to EMails", help="The header is added to every email.", dataType=FlyDataType.Text, entityType="D", printName="EMail Header", fieldLength=2000)
	EMailHeader,
	//
	@FlyElement(name="Info EMail", description="EMail address to send informational messages and copies", help="The Info EMail address indicates the address to use when sending informational messages or copies of other messages.", dataType=FlyDataType.String, entityType="D", printName="Info EMail", fieldLength=60)
	EMail_Info_To,
	//
	@FlyElement(name="EMail PDF", description="Email Document PDF files to Business Partner", dataType=FlyDataType.NONE, entityType="D", printName="EMail PDF", fieldLength=0)
	EMailPDF,
	//
	@FlyElement(name="EMail Recipient", description="Recipient of the EMail", dataType=FlyDataType.List, entityType="D", printName="EMail Recipient", fieldLength=1)
	EMailRecipient,
	//
	@FlyElement(name="EMail Test", description="Test EMail", dataType=FlyDataType.Button, entityType="D", printName="EMail Test", fieldLength=1)
	EMailTest,
	//
	@FlyElement(name="To EMail", description="EMail address to send requests to - e.g. edi@manufacturer.com ", dataType=FlyDataType.String, entityType="D", printName="To EMail", fieldLength=60)
	EMail_To,
	//
	@FlyElement(name="EMail User ID", description="User Name (ID) in the Mail System", help="The user name in the mail system is usually the string before the @ of your email address.  Required if the mail server requires authentification to send emails.", dataType=FlyDataType.String, entityType="D", printName="EMail User", fieldLength=60)
	EMailUser,
	//
	@FlyElement(name="EMail User Password", description="Password of your email user id", help="Required if the mail server requires authentification to send emails.", dataType=FlyDataType.String, entityType="D", printName="EMail Password", fieldLength=20)
	EMailUserPW,
	//
	@FlyElement(name="Verification Info", description="Verification information of EMail Address", help="The field contains additional information how the EMail Address has been verified", dataType=FlyDataType.String, entityType="D", printName="Verify Info", fieldLength=40)
	EMailVerify,
	//
	@FlyElement(name="EMail Verify", description="Date Email was verified", dataType=FlyDataType.DateTime, entityType="D", printName="EMail Verify", fieldLength=7)
	EMailVerifyDate,
	//
	@FlyElement(name="Employee Image", description="Employee Image", help="Employee Image", dataType=FlyDataType.Image, entityType="EE02", printName="Employee Image", fieldLength=0)
	EmployeeImage_ID,
	//
	@FlyElement(name="Employee Status", dataType=FlyDataType.List, entityType="EE02", printName="Employee Status", fieldLength=2)
	EmployeeStatus,
	//
	@FlyElement(name="Employee Type Name", description="Employee Type Name", dataType=FlyDataType.String, entityType="EE02", printName="Employee Type Name", fieldLength=60)
	EmployeeTypeName,
	//
	@FlyElement(name="Employee Type Value", description="Employee Type Value", dataType=FlyDataType.String, entityType="EE02", printName="Employee Type Value", fieldLength=40)
	EmployeeTypeValue,
	//
	@FlyElement(name="EMU Entry Date", description="Date when the currency joined / will join the EMU", help="The EMU Entry Date defines the date that this currency entered, or will enter the Economic Monetary Union.", dataType=FlyDataType.Date, entityType="D", printName="EMU Entry Date", fieldLength=7)
	EMUEntryDate,
	//
	@FlyElement(name="EMU Rate", description="Official rate to the Euro", help="The EMU Rate defines the official rate to be used when converting from this currency to the Euro.", dataType=FlyDataType.Number, entityType="D", printName="EMU Rate", fieldLength=22)
	EMURate,
	//
	@FlyElement(name="Encryption Class", description="Encryption Class used for securing data content", help="The class needs to implement the interface org.compiere.util.SecureInterface.	You enable it by setting the COMPIERE_SECURE parameter of your Client and Server start scripts to the custom class.", dataType=FlyDataType.String, entityType="D", printName="Encryption Class", fieldLength=255)
	EncryptionKey,
	//
	@FlyElement(name="Encryption Type", description="Encryption Type used for securing data content", dataType=FlyDataType.List, entityType="D", printName="Encryption Type", fieldLength=1)
	EncryptionType,
	//
	@FlyElement(name="End Date", description="Last effective date (inclusive)", help="The End Date indicates the last date in this range.", dataType=FlyDataType.Date, entityType="D", printName="End Date", fieldLength=7)
	EndDate,
	//
	@FlyElement(name="Ending balance", description="Ending  or closing balance", help="The Ending Balance is the result of adjusting the Beginning Balance by any payments or disbursements.", dataType=FlyDataType.Amount, entityType="D", printName="Ending balance", fieldLength=22)
	EndingBalance,
	//
	@FlyElement(name="Ending Qty Balance", description="Quantity Ending  or closing balance", help="The Qunatity Ending Balance is the result of adjusting the Quantity Beginning Balance ", dataType=FlyDataType.NONE, entityType="D", printName="Ending Qty Balance", fieldLength=0)
	EndingQtyBalance,
	//
	@FlyElement(name="End No", dataType=FlyDataType.Integer, entityType="D", printName="End No", fieldLength=22)
	EndNo,
	//
	@FlyElement(name="End Time", description="End of the time span", dataType=FlyDataType.DateTime, entityType="D", printName="End Time", fieldLength=7)
	EndTime,
	//
	@FlyElement(name="End Wait", description="End of sleep time", help="End of suspension (sleep)", dataType=FlyDataType.DateTime, entityType="D", printName="End Wait", fieldLength=7)
	EndWaitTime,
	//
	@FlyElement(name="Enforce Client Security", description="Send alerts to recipient only if the client security rules of the role allows", dataType=FlyDataType.YesNo, entityType="D", printName="Enforce Client Security", fieldLength=1)
	EnforceClientSecurity,
	//
	@FlyElement(name="Enforce price limit", description="Do not allow prices below the limit price", help="The Enforce Price Limit check box indicates that prices cannot be below the limit price in Orders and Invoices.  This can be overwritten, if the role allows this.", dataType=FlyDataType.YesNo, entityType="D", printName="Enforce Price Limit", fieldLength=1)
	EnforcePriceLimit,
	//
	@FlyElement(name="Enforce Role Security", description="Send alerts to recipient only if the data security rules of the role allows", dataType=FlyDataType.YesNo, entityType="D", printName="Enforce Role Security", fieldLength=1)
	EnforceRoleSecurity,
	//
	@FlyElement(name="Entity Type", description="Dictionary Entity Type; Determines ownership and synchronization", help="The Entity Types 'Dictionary', 'Adempiere' and 'Application' might be automatically synchronized and customizations deleted or overwritten.  		For customizations, copy the entity and select 'User'!", dataType=FlyDataType.Table, entityType="D", printName="Entity Type", fieldLength=40)
	EntityType,
	//
	@FlyElement(name="Employee Prepayment", description="Account for Employee Expense Prepayments", help="The Employee Prepayment Account identifies the account to use for recording expense advances made to this employee.", dataType=FlyDataType.Account, entityType="D", printName="Employee Prepayment", fieldLength=22)
	E_Prepayment_Acct,
	//
	@FlyElement(name="Error Msg", dataType=FlyDataType.String, entityType="D", printName="Error Msg", fieldLength=2000)
	ErrorMsg,
	//
	@FlyElement(name="Error Trace", description="System Error Trace", help="Java Trace Info", dataType=FlyDataType.Text, entityType="D", printName="Error Trace", fieldLength=2000)
	ErrorTrace,
	//
	@FlyElement(name="Invoice on even weeks", description="Send invoices on even weeks", help="The Invoice on Even Weeks checkbox indicates if biweekly invoices should be sent on even week numbers.", dataType=FlyDataType.YesNo, entityType="D", printName="Invoice on even weeks", fieldLength=1)
	EvenInvoiceWeek,
	//
	@FlyElement(name="Event Change Log", description="Type of Event in Change Log", dataType=FlyDataType.List, entityType="D", printName="Event Change Log", fieldLength=1)
	EventChangeLog,
	//
	@FlyElement(name="Event Model Validator", dataType=FlyDataType.List, entityType="D", printName="Event Model Validator", fieldLength=4)
	EventModelValidator,
	//
	@FlyElement(name="Event Type", description="Type of Event", dataType=FlyDataType.List, entityType="D", printName="Event Type", fieldLength=2)
	EventType,
	//
	@FlyElement(name="Excerpt", description="Surrounding text of the keyword", help="A passage or segment taken from a document,", dataType=FlyDataType.Text, entityType="D", printName="Excerpt", fieldLength=2000)
	Excerpt,
	//
	@FlyElement(name="Exempt reason", description="Reason for not withholding", help="The Exempt Reason indicates the reason that monies are not withheld from this employee.", dataType=FlyDataType.String, entityType="D", printName="Exempt reason", fieldLength=20)
	ExemptReason,
	//
	@FlyElement(name="Expected Close Date", description="Expected Close Date", help="The Expected Close Date indicates the expected last or final date", dataType=FlyDataType.NONE, entityType="D", printName="Expected Close Date", fieldLength=0)
	ExpectedCloseDate,
	//
	@FlyElement(name="Expected Cost", dataType=FlyDataType.CostsPrices, entityType="EE01", printName="Expected Cost", fieldLength=0)
	ExpectedCost,
	//
	@FlyElement(name="Expected Cost Lower Lever", dataType=FlyDataType.CostsPrices, entityType="EE01", printName="Expected Cost Lower Lever", fieldLength=0)
	ExpectedCostLL,
	//
	@FlyElement(name="Expected Result", dataType=FlyDataType.String, entityType="D", printName="Expected Result", fieldLength=22)
	ExpectedResult,
	//
	@FlyElement(name="Expected Total Cost", dataType=FlyDataType.CostsPrices, entityType="EE01", printName="Expected Total Cost", fieldLength=0)
	ExpectedTotalCost,
	//
	@FlyElement(name="Embedded Format", dataType=FlyDataType.Table, entityType="EE05", printName="Embedded Format", fieldLength=10)
	EXP_EmbeddedFormat_ID,
	//
	@FlyElement(name="Expense", dataType=FlyDataType.Amount, entityType="D", printName="Expense", fieldLength=22)
	Expense,
	//
	@FlyElement(name="Expense Amount", description="Amount for this expense", help="Expense amount in currency", dataType=FlyDataType.Amount, entityType="D", printName="Expense Amount", fieldLength=22)
	ExpenseAmt,
	//
	@FlyElement(name="Expense (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Expense (fiscal)", fieldLength=0)
	Expense_F,
	//
	@FlyElement(name="Export Format", dataType=FlyDataType.ID, entityType="EE05", printName="Export Format", fieldLength=10)
	EXP_Format_ID,
	//
	@FlyElement(name="Format Line", dataType=FlyDataType.ID, entityType="EE05", printName="Format Line", fieldLength=10)
	EXP_FormatLine_ID,
	//
	@FlyElement(name="Export to XML", description="Export this record to XML", dataType=FlyDataType.NONE, entityType="D", printName="Export to XML", fieldLength=0)
	ExportXML,
	//
	@FlyElement(name="Export Processor", dataType=FlyDataType.TableDirect, entityType="EE05", printName="Export Processor", fieldLength=10)
	EXP_Processor_ID,
	//
	@FlyElement(name="Processor Parameter", dataType=FlyDataType.ID, entityType="EE05", printName="Processor Parameter", fieldLength=10)
	EXP_ProcessorParameter_ID,
	//
	@FlyElement(name="Export Processor Type", dataType=FlyDataType.TableDirect, entityType="EE05", printName="Export Processor Type", fieldLength=10)
	EXP_Processor_Type_ID,
	//
	@FlyElement(name="Bank Account No Format", description="Format of the Bank Account", dataType=FlyDataType.String, entityType="D", printName="Bank Account No Format", fieldLength=20)
	ExpressionBankAccountNo,
	//
	@FlyElement(name="Bank Routing No Format", description="Format of the Bank Routing Number", dataType=FlyDataType.String, entityType="D", printName="Bank Routing No Format", fieldLength=20)
	ExpressionBankRoutingNo,
	//
	@FlyElement(name="Phone Format", description="Format of the phone; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>Validation elements:</B>	 	(Space) any character	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters & Digits NO space	A	any Letters & Digits NO space converted to upper case	c	any Letters & Digits or space	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="Phone Format", fieldLength=20)
	ExpressionPhone,
	//
	@FlyElement(name="Postal Code Format", description="Format of the postal code; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>Validation elements:</B>	 	(Space) any character	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters & Digits NO space	A	any Letters & Digits NO space converted to upper case	c	any Letters & Digits or space	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="Postal Code Format", fieldLength=20)
	ExpressionPostal,
	//
	@FlyElement(name="Additional Postal Format", description="Format of the value; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>Validation elements:</B>	 	(Space) any character	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters & Digits NO space	A	any Letters & Digits NO space converted to upper case	c	any Letters & Digits or space	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="Additional Postal Format", fieldLength=20)
	ExpressionPostal_Add,
	//
	@FlyElement(name="Accounting Fact", dataType=FlyDataType.ID, entityType="D", printName="Accounting Fact", fieldLength=22)
	Fact_Acct_ID,
	//
	@FlyElement(name="Factor", description="Scaling factor.", help="Numbers are divided by the scaling factor for presentation.  E.g. 123,000 with a scaling factor of 1,000 will display as 123.", dataType=FlyDataType.List, entityType="D", printName="Factor", fieldLength=1)
	Factor,
	//
	@FlyElement(name="Factor Alpha", description="Identifies an Factor Alpha", help="The Factor Alpha is smoothing constant used in this exponential smoothing model.", dataType=FlyDataType.NONE, entityType="EE01", printName="Factor Alpha", fieldLength=0)
	FactorAlpha,
	//
	@FlyElement(name="Factor Beta", description="Identifies a Factor Beta", help="Factor Beta is the second smoothing constant (beta) used in this Triple exponential smoothing model.		<p>betaTolerance the required precision/accuracy - or tolerance of error - required in the estimate of the beta smoothing constant", dataType=FlyDataType.Number, entityType="EE01", printName="Factor Beta", fieldLength=22)
	FactorBeta,
	//
	@FlyElement(name="Factor Gamma", description="Identifies a Factor Gamma", help="Factor Gamma is the second smoothing constant (gamma) used in this exponential smoothing model This is used to smooth the trend.", dataType=FlyDataType.NONE, entityType="EE01", printName="Factor Gamma", fieldLength=0)
	FactorGamma,
	//
	@FlyElement(name="Factor Multiplier", description="Identifies a Factor Multiplier", help="Factor Multiplier defines the increase or decrease in percentage for the forecast quantity, A negative percentage indicates that the amount is reduced.", dataType=FlyDataType.NONE, entityType="EE01", printName="Factor Multiplier", fieldLength=0)
	FactorMultiplier,
	//
	@FlyElement(name="Factor Scale", description="Identifies a Factor Scale", help="Factor Scale defines the scale in percentage applied for the forecast quantity, this value cannot be negative.", dataType=FlyDataType.NONE, entityType="EE01", printName="Factor Scale", fieldLength=0)
	FactorScale,
	//
	@FlyElement(name="User Factor", description="Identifies a User Factor", help="The User Factor used in some forecast rules.", dataType=FlyDataType.Number, entityType="EE01", printName="User Factor", fieldLength=22)
	FactorUser,
	//
	@FlyElement(name="Accounting Fact Reconciliation", dataType=FlyDataType.NONE, entityType="D", printName="Accounting Fact Reconciliation", fieldLength=0)
	Fact_Reconciliation_ID,
	//
	@FlyElement(name="Father Name", description="Father Name of a person", help="The Father Name of a person", dataType=FlyDataType.String, entityType="EE02", printName="Father Name", fieldLength=0)
	FatherName,
	//
	@FlyElement(name="Father's Name", description="Father's Name", dataType=FlyDataType.String, entityType="EE02", printName="Father's Name", fieldLength=0)
	FathersName,
	//
	@FlyElement(name="Fax", description="Facsimile number", help="The Fax identifies a facsimile number for this Business Partner or  Location", dataType=FlyDataType.String, entityType="D", printName="Fax", fieldLength=40)
	Fax,
	//
	@FlyElement(name="Feature", description="Indicated the Feature for Product Configure", help="Indicated the Feature for Product Configure", dataType=FlyDataType.String, entityType="EE01", printName="Feature", fieldLength=30)
	Feature,
	//
	@FlyElement(name="Fee Amount", description="Fee amount in invoice currency", help="The Fee Amount indicates the charge amount on a dunning letter for overdue invoices.  This field will only display if the charge fee checkbox has been selected.", dataType=FlyDataType.Amount, entityType="D", printName="Fee", fieldLength=22)
	FeeAmt,
	//
	@FlyElement(name="Feedback", dataType=FlyDataType.Text, entityType="EE02", printName="Feedback", fieldLength=0)
	Feedback,
	//
	@FlyElement(name="Field Alignment", description="Field Text Alignment", help="Alignment of field text. The default is determined by the data/display type: Numbers are right aligned, other data is left aligned", dataType=FlyDataType.List, entityType="D", printName="Field Alignment", fieldLength=1)
	FieldAlignmentType,
	//
	@FlyElement(name="Field Group Type", dataType=FlyDataType.List, entityType="D", printName="Field Group Type", fieldLength=10)
	FieldGroupType,
	//
	@FlyElement(name="Length", description="Length of the column in the database", help="The Length indicates the length of a column as defined in the database.", dataType=FlyDataType.Integer, entityType="D", printName="Length", fieldLength=22)
	FieldLength,
	//
	@FlyElement(name="File_Directory", dataType=FlyDataType.Text, entityType="D", printName="File_Directory", fieldLength=255)
	File_Directory,
	//
	@FlyElement(name="File Name", description="Name of the local file or URL", help="Name of a file in the local directory space - or URL (file://.., http://.., ftp://..)", dataType=FlyDataType.String, entityType="D", printName="File Name", fieldLength=120)
	FileName,
	//
	@FlyElement(name="File Path or Name", description="Path of directory or name of the local file or URL", help="Path of the directory or name of a file in the local directory space - or URL (file://.., http://.., ftp://..)", dataType=FlyDataType.FilePathOrName, entityType="D", printName="File Path/Name", fieldLength=120)
	FilePathOrName,
	//
	@FlyElement(name="File Size", description="Size of the File in bytes", dataType=FlyDataType.Number, entityType="D", printName="File Size", fieldLength=22)
	FileSize,
	//
	@FlyElement(name="Financial Institution ID", description="The ID of the Financial Institution / Bank", help="Depending on the loader, it might require a ID of the financial institution", dataType=FlyDataType.String, entityType="D", printName="Financial Institution ID", fieldLength=20)
	FinancialInstitutionID,
	//
	@FlyElement(name="Find", dataType=FlyDataType.Number, entityType="D", printName="Find", fieldLength=22)
	Find_ID,
	//
	@FlyElement(name="Finish Mode", description="Workflow Activity Finish Mode", help="How the system operated at the end of an activity. Automatic  implies return when the invoked applications finished control - Manual the user has to explicitly terminate the activity.", dataType=FlyDataType.List, entityType="D", printName="Finish Mode", fieldLength=1)
	FinishMode,
	//
	@FlyElement(name="First Count Qty", dataType=FlyDataType.NONE, entityType="D", printName="1st Count", fieldLength=0)
	FirstCountQty,
	//
	@FlyElement(name="First Name", description="First Name of a person", help="The First Name of a person", dataType=FlyDataType.String, entityType="EE02", printName="First Name", fieldLength=0)
	FirstName,
	//
	@FlyElement(name="First Sale", description="Date of First Sale", help="The First Sale Date identifies the date of the first sale to this Business Partner", dataType=FlyDataType.Date, entityType="D", printName="First Sale", fieldLength=7)
	FirstSale,
	//
	@FlyElement(name="Year", description="The Fiscal Year", help="The Year identifies the accounting year for a calendar.", dataType=FlyDataType.String, entityType="D", printName="Year", fieldLength=10)
	FiscalYear,
	//
	@FlyElement(name="Fix amount", description="Fix amounted amount to be levied or paid", help="The Fixed Amount indicates a fixed amount to be levied or paid.", dataType=FlyDataType.Amount, entityType="D", printName="Fix Amt", fieldLength=22)
	FixAmt,
	//
	@FlyElement(name="fixedpercentage", dataType=FlyDataType.NONE, entityType="D", printName="fixedpercentage", fieldLength=0)
	fixedpercentage,
	//
	@FlyElement(name="Fix month cutoff", description="Last day to include for next due date", help="The Fix Month Cutoff indicates the last day invoices can have to be included in the current due date.  This field only displays when the fixed due date checkbox has been selected.", dataType=FlyDataType.Integer, entityType="D", printName="Fix month cutoff", fieldLength=22)
	FixMonthCutoff,
	//
	@FlyElement(name="Fix month day", description="Day of the month of the due date", help="The Fix Month Day indicates the day of the month that invoices are due.  This field only displays if the fixed due date checkbox is selected.", dataType=FlyDataType.Integer, entityType="D", printName="Fix month day", fieldLength=22)
	FixMonthDay,
	//
	@FlyElement(name="Fix month offset", description="Number of months (0=same, 1=following)", help="The Fixed Month Offset indicates the number of months from the current month to indicate an invoice is due.  A 0 indicates the same month, a 1 the following month.  This field will only display if the fixed due date checkbox is selected.", dataType=FlyDataType.Integer, entityType="D", printName="Fix month offset", fieldLength=22)
	FixMonthOffset,
	//
	@FlyElement(name="Flat Discount %", description="Flat discount percentage ", dataType=FlyDataType.Number, entityType="D", printName="Flat Discount", fieldLength=22)
	FlatDiscount,
	//
	@FlyElement(name="Float After", dataType=FlyDataType.Quantity, entityType="EE01", printName="Float After", fieldLength=22)
	FloatAfter,
	//
	@FlyElement(name="Float Befored", dataType=FlyDataType.Quantity, entityType="EE01", printName="Float Befored", fieldLength=22)
	FloatBefored,
	//
	@FlyElement(name="Folder", description="A folder on a local or remote system to store data into", help="We store files in folders, especially media files.", dataType=FlyDataType.String, entityType="D", printName="Folder", fieldLength=60)
	Folder,
	//
	@FlyElement(name="Footer Center", description="Content of the center portion of the footer.", dataType=FlyDataType.String, entityType="D", printName="Footer Center", fieldLength=255)
	FooterCenter,
	//
	@FlyElement(name="Footer Left", description="Content of the left portion of the footer.", dataType=FlyDataType.String, entityType="D", printName="Footer Left", fieldLength=255)
	FooterLeft,
	//
	@FlyElement(name="Footer Margin", description="Margin of the Footer in 1/72 of an inch", help="Distance from the bottom of the main content to the end of the printable page in 1/72 of an inch (point)", dataType=FlyDataType.Integer, entityType="D", printName="Footer Margin", fieldLength=22)
	FooterMargin,
	//
	@FlyElement(name="Footer Right", description="Content of the right portion of the footer.", dataType=FlyDataType.String, entityType="D", printName="Footer Right", fieldLength=255)
	FooterRight,
	//
	@FlyElement(name="Forecast", description="Indicated the % of participation this component into a of the BOM Planning", help="The BOM of Planning Type are useful to Planning the Product family.		For example is possible create a BOM Planning for an Automobile		10% Automobile Red	35% Automobile Blue	45% Automobile Black	19% Automobile Green	1%  Automobile Orange		When Material Plan is calculated MRP generate a Manufacturing Order meet to demand to each  of the Automobile", dataType=FlyDataType.Quantity, entityType="EE01", printName="Forecast", fieldLength=22)
	Forecast,
	//
	@FlyElement(name="Forecast Key", description="Key of the Forecast", dataType=FlyDataType.String, entityType="EE01", printName="Forecast Key", fieldLength=40)
	ForecastValue,
	//
	@FlyElement(name="Format Pattern", description="The pattern used to format a number or date.", help="A string complying with either Java SimpleDateFormat or DecimalFormat pattern syntax used to override the default presentation format of a date or number type field.", dataType=FlyDataType.String, entityType="D", printName="Format Pattern", fieldLength=22)
	FormatPattern,
	//
	@FlyElement(name="Format", description="Format of the data", help="The Format is a drop down list box for selecting the format type (text, tab delimited, XML, etc) of the file to be imported", dataType=FlyDataType.List, entityType="D", printName="Format", fieldLength=1)
	FormatType,
	//
	@FlyElement(name="Fully Qualified Domain Name", description="Fully Qualified Domain Name i.e. www.comdivision.com", help="This field contains the so called fully qualified domain name including host and domain, but not anything protocol specific like http or the document path.", dataType=FlyDataType.String, entityType="D", printName="Fully Qualified Domain Name", fieldLength=120)
	FQDN,
	//
	@FlyElement(name="Freight Amount", description="Freight Amount ", help="The Freight Amount indicates the amount charged for Freight in the document currency.", dataType=FlyDataType.Amount, entityType="D", printName="Freight Amt", fieldLength=22)
	FreightAmt,
	//
	@FlyElement(name="Freight Cost Rule", description="Method for charging Freight", help="The Freight Cost Rule indicates the method used when charging for freight.", dataType=FlyDataType.List, entityType="D", printName="Freight Cost Rule", fieldLength=1)
	FreightCostRule,
	//
	@FlyElement(name="Frequency", description="Frequency of events", help="The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks.", dataType=FlyDataType.Integer, entityType="D", printName="Frequency", fieldLength=22)
	Frequency,
	//
	@FlyElement(name="Frequency Type", description="Frequency of event", help="The frequency type is used for calculating the date of the next event.", dataType=FlyDataType.List, entityType="D", printName="Frequency type", fieldLength=1)
	FrequencyType,
	//
	@FlyElement(name="Sql FROM", description="SQL FROM clause", help="The Select Clause indicates the SQL FROM clause to use for selecting the record for a measure calculation. It can have JOIN clauses. Do not include the FROM itself.", dataType=FlyDataType.Text, entityType="D", printName="From Clause", fieldLength=2000)
	FromClause,
	//
	@FlyElement(name="Function BG Color", description="Function Background Color", help="Background color of a function row", dataType=FlyDataType.Table, entityType="D", printName="Function BG Color", fieldLength=22)
	FunctBG_PrintColor_ID,
	//
	@FlyElement(name="Function Color", description="Function Foreground Color", help="Foreground color of a function row", dataType=FlyDataType.Table, entityType="D", printName="Function Color", fieldLength=22)
	FunctFG_PrintColor_ID,
	//
	@FlyElement(name="Function Column", description="Overwrite Column with Function ", help="The Function Column indicates that the column will be overridden with a function", dataType=FlyDataType.String, entityType="D", printName="Function Column", fieldLength=60)
	FunctionColumn,
	//
	@FlyElement(name="Function Prefix", description="Data sent before the function", dataType=FlyDataType.String, entityType="D", printName="Function Prefix", fieldLength=40)
	FunctionPrefix,
	//
	@FlyElement(name="Function Suffix", description="Data sent after the function", dataType=FlyDataType.String, entityType="D", printName="Function Suffix", fieldLength=40)
	FunctionSuffix,
	//
	@FlyElement(name="Function Font", description="Function row Font", help="Font of the function row", dataType=FlyDataType.Table, entityType="D", printName="Function Font", fieldLength=22)
	Funct_PrintFont_ID,
	//
	@FlyElement(name="Future Cost Price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Future Cost price", fieldLength=22)
	FutureCostPrice,
	//
	@FlyElement(name="Future Cost Price LL", dataType=FlyDataType.CostsPrices, entityType="EE01", printName="Future Cost price Lower Level", fieldLength=22)
	FutureCostPriceLL,
	//
	@FlyElement(name="GAAP", description="Generally Accepted Accounting Principles", help="The GAAP identifies the account principles that this accounting schema will adhere to.", dataType=FlyDataType.List, entityType="D", printName="GAAP", fieldLength=2)
	GAAP,
	//
	@FlyElement(name="Gender", dataType=FlyDataType.List, entityType="EE02", printName="Gender", fieldLength=1)
	Gender,
	//
	@FlyElement(name="Generate Class", description="Generate Class Button", dataType=FlyDataType.Button, entityType="D", printName="Generate Class", fieldLength=1)
	GenerateClass,
	//
	@FlyElement(name="Generate List", description="Generate List", dataType=FlyDataType.Button, entityType="D", printName="Generate List", fieldLength=1)
	GenerateList,
	//
	@FlyElement(name="Generate Order", description="Generate Order", dataType=FlyDataType.Button, entityType="D", printName="Generate Order", fieldLength=1)
	GenerateOrder,
	//
	@FlyElement(name="Generate Report", dataType=FlyDataType.NONE, entityType="D", printName="Generate Report", fieldLength=0)
	GenerateReport,
	//
	@FlyElement(name="Generate To", description="Generate To", dataType=FlyDataType.Button, entityType="D", printName="Generate To", fieldLength=1)
	GenerateTo,
	//
	@FlyElement(name="Budget Control", description="Budget Control", help="Budget Control allows you to restrict the use of expenditures, commitments (Purchase Orders) and reservations (Requisitions). If defined, you may not be able to approve Requisitions, Purchase Orders, or AP Invoices.", dataType=FlyDataType.ID, entityType="D", printName="Budget Control", fieldLength=10)
	GL_BudgetControl_ID,
	//
	@FlyElement(name="Budget", description="General Ledger Budget", help="The General Ledger Budget identifies a user defined budget.  These can be used in reporting as a comparison against your actual amounts.", dataType=FlyDataType.TableDirect, entityType="D", printName="Budget", fieldLength=22)
	GL_Budget_ID,
	//
	@FlyElement(name="GL Category", description="General Ledger Category", help="The General Ledger Category is an optional, user defined method of grouping journal lines.", dataType=FlyDataType.TableDirect, entityType="D", printName="GL Category", fieldLength=22)
	GL_Category_ID,
	//
	@FlyElement(name="GL Distribution", description="General Ledger Distribution", help="If the account combination criteria of the Distribution is met, the posting to the account combination is replaced by the account combinations of the distribution lines.  The distribution is prorated based on the ratio of the lines. The distribution must be valid to be used.", dataType=FlyDataType.TableDirect, entityType="D", printName="GL Distribution", fieldLength=22)
	GL_Distribution_ID,
	//
	@FlyElement(name="GL Distribution Line", description="General Ledger Distribution Line", help="If the account combination criteria of the Distribution is met, the posting to the account combination is replaced by the account combinations of the distribution lines.  The distribution is prorated based on the ratio of the lines. ", dataType=FlyDataType.ID, entityType="D", printName="GL Distribution Line", fieldLength=22)
	GL_DistributionLine_ID,
	//
	@FlyElement(name="GL Fund", description="General Ledger Funds Control", help="General Ledger Funds Control allows you to restrict the use of funds.  This is independent from budget control.", dataType=FlyDataType.ID, entityType="D", printName="GL Fund", fieldLength=10)
	GL_Fund_ID,
	//
	@FlyElement(name="Fund Restriction", description="Restriction of Funds", help="If defined, you can use the fund only for the accounts selected.", dataType=FlyDataType.ID, entityType="D", printName="Fund Restriction", fieldLength=10)
	GL_FundRestriction_ID,
	//
	@FlyElement(name="Journal Batch", description="General Ledger Journal Batch", help="The General Ledger Journal Batch identifies a group of journals to be processed as a group.", dataType=FlyDataType.TableDirect, entityType="D", printName="Journal Batch", fieldLength=22)
	GL_JournalBatch_ID,
	//
	@FlyElement(name="Journal", description="General Ledger Journal", help="The General Ledger Journal identifies a group of journal lines which represent a logical business transaction", dataType=FlyDataType.ID, entityType="D", printName="Journal", fieldLength=22)
	GL_Journal_ID,
	//
	@FlyElement(name="Journal Line", description="General Ledger Journal Line", help="The General Ledger Journal Line identifies a single transaction in a journal.", dataType=FlyDataType.ID, entityType="D", printName="Journal Line", fieldLength=22)
	GL_JournalLine_ID,
	//
	@FlyElement(name="Goal Display", description="Type of goal display on dashboard", help="Display goal on dashboard as html table or graph.", dataType=FlyDataType.List, entityType="D", printName="Goal Display", fieldLength=1)
	GoalDisplay,
	//
	@FlyElement(name="Performance Goal", description="Target achievement from 0..1", help="The Goal Performance indicates the target achievement from 0 to 1.", dataType=FlyDataType.Number, entityType="D", printName="Performance Goal", fieldLength=22)
	GoalPerformance,
	//
	@FlyElement(name="Restriction Type", description="Goal Restriction Type", help="Enter one or more records per Goal Restriction Type (e.g. Org o1, o2)", dataType=FlyDataType.List, entityType="D", printName="Restriction Type", fieldLength=1)
	GoalRestrictionType,
	//
	@FlyElement(name="Good for Days", description="Shelf Life Days remaining to Guarantee Date (minus minimum guarantee days)", help="Shelf Life of products with Guarantee Date instance compared to today minus the minimum guaranteed days.	(Guarantee Date-Today) – Min Guarantee Days", dataType=FlyDataType.Integer, entityType="D", printName="Good Days", fieldLength=22)
	GoodForDays,
	//
	@FlyElement(name="Grace Days", description="Days after due date to send first dunning letter", help="The Grace Days indicates the number of days after the due date to send the first dunning letter.  This field displays only if the send dunning letters checkbox has been selected.", dataType=FlyDataType.Integer, entityType="D", printName="Grace Days", fieldLength=22)
	GraceDays,
	//
	@FlyElement(name="Grade Name", description="Grade Name for Impor Employee", help="Grade Name for Employee", dataType=FlyDataType.String, entityType="ECA02", printName="Grade Name", fieldLength=255)
	GradeName,
	//
	@FlyElement(name="Grade Value", description="Grade Value for Impor Employee", help="Grade Value for Employee", dataType=FlyDataType.String, entityType="ECA02", printName="Grade Value", fieldLength=60)
	GradeValue,
	//
	@FlyElement(name="Grand Total", description="Total amount of document", help="The Grand Total displays the total amount including Tax and Freight in document currency", dataType=FlyDataType.Amount, entityType="D", printName="Grand Total", fieldLength=22)
	GrandTotal,
	//
	@FlyElement(name="Graph Type", description="Type of graph to be painted", help="Type of graph to be painted", dataType=FlyDataType.List, entityType="D", printName="Graph Type", fieldLength=1)
	GraphType,
	//
	@FlyElement(name="Green", description="RGB value ", dataType=FlyDataType.Integer, entityType="D", printName="Green", fieldLength=22)
	Green,
	//
	@FlyElement(name="2nd Green", description="RGB value for second color", dataType=FlyDataType.Integer, entityType="D", printName="2nd Green", fieldLength=22)
	Green_1,
	//
	@FlyElement(name="Greeting", description="For letters, e.g. 'Dear {0}' or 'Dear Mr. {0}' - At runtime, '{0}' is replaced by the name", help="The Greeting indicates what will print on letters sent to a Business Partner.", dataType=FlyDataType.String, entityType="D", printName="Greeting", fieldLength=60)
	Greeting,
	//
	@FlyElement(name="Gross Amount", description="Gross Remuneration Amount", help="Gross Salary or Wage Amount (without Overtime, Benefits and Employer overhead)", dataType=FlyDataType.Amount, entityType="D", printName="Gross", fieldLength=22)
	GrossRAmt,
	//
	@FlyElement(name="Gross Cost", description="Gross Remuneration Costs", help="Gross Salary or Wage Costs (without Overtime, with Benefits and Employer overhead)", dataType=FlyDataType.CostsPrices, entityType="D", printName="Gross Cost", fieldLength=22)
	GrossRCost,
	//
	@FlyElement(name="Group1", dataType=FlyDataType.String, entityType="D", printName="Group1", fieldLength=255)
	Group1,
	//
	@FlyElement(name="Group2", dataType=FlyDataType.String, entityType="D", printName="Group2", fieldLength=255)
	Group2,
	//
	@FlyElement(name="Group Key", description="Business Partner Group Key", dataType=FlyDataType.String, entityType="D", printName="Group Key", fieldLength=40)
	GroupValue,
	//
	@FlyElement(name="Guarantee Date", description="Date when guarantee expires", help="Date when the normal guarantee or availability expires", dataType=FlyDataType.Date, entityType="D", printName="Guarantee date", fieldLength=7)
	GuaranteeDate,
	//
	@FlyElement(name="Guarantee Days", description="Number of days the product is guaranteed or available", help="If the value is 0, there is no limit to the availability or guarantee, otherwise the guarantee date is calculated by adding the days to the delivery date.", dataType=FlyDataType.Integer, entityType="D", printName="Guarantee days", fieldLength=22)
	GuaranteeDays,
	//
	@FlyElement(name="Min Guarantee Days", description="Minimum number of guarantee days", help="When selecting batch/products with a guarantee date, the minimum left guarantee days for automatic picking.  You can pick any batch/product manually. ", dataType=FlyDataType.Integer, entityType="D", printName="Min Guarantee", fieldLength=22)
	GuaranteeDaysMin,
	//
	@FlyElement(name="Use Account Alias", description="Ability to select (partial) account combinations by an Alias", help="The Alias checkbox indicates that account combination can be selected using a user defined alias or short key.", dataType=FlyDataType.YesNo, entityType="D", printName="Alias", fieldLength=1)
	HasAlias,
	//
	@FlyElement(name="Charges", description="Charges can be added to the document", help="The Charges checkbox indicates that charges can be added to this document.  Charges can include items like shipping, handling or bank charges.", dataType=FlyDataType.YesNo, entityType="D", printName="Charges", fieldLength=1)
	HasCharges,
	//
	@FlyElement(name="Use Account Combination Control", description="Combination of account elements are checked", help="The Combination Control checkbox indicates if the combination of account elements will be verified against the defined acceptable combination.", dataType=FlyDataType.YesNo, entityType="D", printName="Combination Control", fieldLength=1)
	HasCombination,
	//
	@FlyElement(name="Additional Postal code", description="Has Additional Postal Code", help="The Additional Postal Code checkbox indicates if this address uses an additional Postal Code.  If it is selected an additional field displays for entry of the additional Postal Code.", dataType=FlyDataType.YesNo, entityType="D", printName="Additional Postal code", fieldLength=1)
	HasPostal_Add,
	//
	@FlyElement(name="Pro forma Invoice", description="Indicates if Pro Forma Invoices can be generated from this document", help="The Pro Forma Invoice checkbox indicates if pro forma invoices can be generated from this sales document. A pro forma invoice indicates the amount that will be due should an order be shipped.", dataType=FlyDataType.YesNo, entityType="D", printName="Pro forma Invoice", fieldLength=1)
	HasProforma,
	//
	@FlyElement(name="Country has Region", description="Country contains Regions", help="The Country has Region checkbox is selected if the Country being defined is divided into regions.  If this checkbox is selected, the Region Tab is accessible.", dataType=FlyDataType.YesNo, entityType="D", printName="Country has Region", fieldLength=1)
	HasRegion,
	//
	@FlyElement(name="HasRole", description="Has Role Y/N", dataType=FlyDataType.List, entityType="D", printName="Has Role Y/N", fieldLength=1)
	HasRole,
	//
	@FlyElement(name="Has SubMenu", dataType=FlyDataType.YesNo, entityType="D", printName="Has SubMenu", fieldLength=1)
	HasSubMenu,
	//
	@FlyElement(name="Has Supply/Demand", description="This product has supply or demand in the current Replenish Plan run.", dataType=FlyDataType.YesNo, entityType="D", printName="Has Supply/Demand", fieldLength=1)
	HasSupplyDemand,
	//
	@FlyElement(name="Has Tree", description="Window has Tree Graph", help="The Has Tree checkbox indicates if this window displays a tree metaphor.", dataType=FlyDataType.YesNo, entityType="D", printName="Has Tree", fieldLength=1)
	HasTree,
	//
	@FlyElement(name="Has Vapor Recovery System", description="Indicates the existence of a vapor recovery system", dataType=FlyDataType.YesNo, entityType="EE03", printName="Has Vapor Recovery System", fieldLength=0)
	HasVaporRecoverySystem,
	//
	@FlyElement(name="Header Line Color", description="Table header row line color", help="Color of the table header row lines", dataType=FlyDataType.Table, entityType="D", printName="Header Line Color", fieldLength=22)
	HdrLine_PrintColor_ID,
	//
	@FlyElement(name="Header Row Font", description="Header row Font", help="Font of the table header row", dataType=FlyDataType.Table, entityType="D", printName="Header Row Font", fieldLength=22)
	Hdr_PrintFont_ID,
	//
	@FlyElement(name="Header Stroke", description="Width of the Header Line Stroke", help="The width of the header line stroke (line thickness) in Points.", dataType=FlyDataType.Number, entityType="D", printName="Hdr Stroke", fieldLength=22)
	HdrStroke,
	//
	@FlyElement(name="Header Stroke Type", description="Type of the Header Line Stroke", help="Type of the line printed", dataType=FlyDataType.List, entityType="D", printName="Hdr Stroke Type", fieldLength=1)
	HdrStrokeType,
	//
	@FlyElement(name="Header Row BG Color", description="Background color of header row", help="Table header row background color", dataType=FlyDataType.Table, entityType="D", printName="Header Row GB Color", fieldLength=22)
	HdrTextBG_PrintColor_ID,
	//
	@FlyElement(name="Header Row Color", description="Foreground color if the table header row", help="Table header row foreground color", dataType=FlyDataType.Table, entityType="D", printName="Header Row Color", fieldLength=22)
	HdrTextFG_PrintColor_ID,
	//
	@FlyElement(name="Header Center", description="Content of the center portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Center", fieldLength=255)
	HeaderCenter,
	//
	@FlyElement(name="Header Left", description="Content of the left portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Left", fieldLength=255)
	HeaderLeft,
	//
	@FlyElement(name="Header Margin", description="Margin of the Header in 1/72 of an inch", help="Distance from the top of the printable page to the start of the main content in 1/72 of an inch (point)", dataType=FlyDataType.Integer, entityType="D", printName="Header Margin", fieldLength=22)
	HeaderMargin,
	//
	@FlyElement(name="Header Right", description="Content of the right portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Right", fieldLength=255)
	HeaderRight,
	//
	@FlyElement(name="Comment/Help", description="Comment or Hint", help="The Help field contains a hint, comment or help about the use of this item.", dataType=FlyDataType.Text, entityType="D", printName="Comment", fieldLength=2000)
	Help,
	//
	@FlyElement(name="Highest Education", description="Highest Education for this position", help="The Highest Education for this position", dataType=FlyDataType.String, entityType="EE02", printName="Highest Education", fieldLength=0)
	HighestEducation,
	//
	@FlyElement(name="HistoryYears", description="Number of years prior to current year to create in calendar", dataType=FlyDataType.Integer, entityType="D", printName="History Years", fieldLength=22)
	HistoryYears,
	//
	@FlyElement(name="Host", dataType=FlyDataType.String, entityType="EE05", printName="Host", fieldLength=255)
	Host,
	//
	@FlyElement(name="Host Address", description="Host Address URL or DNS", help="The Host Address identifies the URL or DNS of the target host", dataType=FlyDataType.String, entityType="D", printName="Host Address", fieldLength=60)
	HostAddress,
	//
	@FlyElement(name="Host port", description="Host Communication Port", help="The Host Port identifies the port to communicate with the host.", dataType=FlyDataType.Integer, entityType="D", printName="Host port", fieldLength=22)
	HostPort,
	//
	@FlyElement(name="Payroll Attribute Account", dataType=FlyDataType.Account, entityType="EE02", printName="Payroll Attribute Account", fieldLength=10)
	HR_Attribute_Acct,
	//
	@FlyElement(name="Payroll Employee Attribute", description="Employee Attribute allows to add any metadata of type (text, date , quantity and amount ) of an Employee.", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll Employee Attribute", fieldLength=22)
	HR_Attribute_ID,
	//
	@FlyElement(name="Career Level", description="The Career Level for this position", help="Career level required for this position", dataType=FlyDataType.ID, entityType="EE02", printName="Career Level", fieldLength=0)
	HR_CareerLevel_ID,
	//
	@FlyElement(name="Payroll Concept Account", dataType=FlyDataType.Account, entityType="EE02", printName="Payroll Concept Account", fieldLength=10)
	HR_Concept_Acct,
	//
	@FlyElement(name="Payroll Concept Account", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll Concept Account", fieldLength=10)
	HR_Concept_Acct_ID,
	//
	@FlyElement(name="Global Payroll Concept Category", description="Global Payroll Concept Category allows to grouping of Global Concept to reports and queries", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Global Payroll Concept Category", fieldLength=10)
	HR_Concept_Category_ID,
	//
	@FlyElement(name="Global Payroll Concept", description="The Payroll Concept allows to define all the perception and deductions elements needed to define a payroll.", dataType=FlyDataType.ID, entityType="EE02", printName="Global Payroll Concept", fieldLength=10)
	HR_Concept_ID,
	//
	@FlyElement(name="Global Payroll Concept Type", description="Allows define types for concepts", dataType=FlyDataType.ID, entityType="EE02", printName="Global Payroll Concept Type", fieldLength=22)
	HR_Concept_Type_ID,
	//
	@FlyElement(name="Payroll Contract", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Payroll Contract", fieldLength=10)
	HR_Contract_ID,
	//
	@FlyElement(name="Degree", description="Degree for an Employee", help="The Degree for an Employee", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Degree", fieldLength=22)
	HR_Degree_ID,
	//
	@FlyElement(name="Payroll Department", dataType=FlyDataType.NONE, entityType="EE02", printName="Payroll Department", fieldLength=10)
	HR_Department_ID,
	//
	@FlyElement(name="Department Consumption Limit", dataType=FlyDataType.ID, entityType="EE02", printName="Department Consumption Limit", fieldLength=0)
	HR_DepartmentProduct_ID,
	//
	@FlyElement(name="Designation", description="Designation is a nationally recognized level", help="Designation is a nationally recognized level of achievement within the field of human resources.", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Designation", fieldLength=0)
	HR_Designation_ID,
	//
	@FlyElement(name="Education", description="Education of an Employee", help="The Education of an Employee", dataType=FlyDataType.ID, entityType="EE02", printName="Education", fieldLength=0)
	HR_Education_ID,
	//
	@FlyElement(name="Employee Dependents", description="Employee Dependents", help="Employee Dependents", dataType=FlyDataType.ID, entityType="EE02", printName="Employee Dependents", fieldLength=0)
	HR_EmployeeDependent_ID,
	//
	@FlyElement(name="Work Experience", description="Work Experience", help="The Work Experience", dataType=FlyDataType.ID, entityType="EE02", printName="Work Experience", fieldLength=0)
	HR_EmployeeExperience_ID,
	//
	@FlyElement(name="Payroll Employee", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll Employee", fieldLength=10)
	HR_Employee_ID,
	//
	@FlyElement(name="HR_EmployeeInsurance_ID", description="Employee Insurance", help="The Employee Insurance", dataType=FlyDataType.ID, entityType="EE02", printName="HR_EmployeeInsurance_ID", fieldLength=0)
	HR_EmployeeInsurance_ID,
	//
	@FlyElement(name="Employee Type", description="Employee Type", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Employee Type", fieldLength=0)
	HR_EmployeeType_ID,
	//
	@FlyElement(name="Employee Weekly Off", description="Employee Weekly Off of an Employee", help="The Employee Weekly Off defines the weekdays working and nonworking an Employee", dataType=FlyDataType.ID, entityType="EE02", printName="Employee Weekly Off", fieldLength=0)
	HR_EmployeeWeeklyOff_ID,
	//
	@FlyElement(name="Payroll Expense Account", dataType=FlyDataType.Account, entityType="EE02", printName="Payroll Expense Account", fieldLength=10)
	HR_Expense_Acct,
	//
	@FlyElement(name="Grade", description="Grade", help="Grade", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Grade", fieldLength=0)
	HR_Grade_ID,
	//
	@FlyElement(name="Insurance Type", description="Insurance Type", help="The Insurance Type defined for an employee", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Insurance Type", fieldLength=0)
	HR_InsuranceType_ID,
	//
	@FlyElement(name="Applicants Interview", dataType=FlyDataType.ID, entityType="EE02", printName="Applicants Interview", fieldLength=0)
	HR_Interview_ID,
	//
	@FlyElement(name="Job Application History", description="Job Application History", help="The Job Application History", dataType=FlyDataType.ID, entityType="EE02", printName="Job Application History", fieldLength=0)
	HR_JobApplicationHistory_ID,
	//
	@FlyElement(name="Job Application", description="Job Application", help="The Job Application", dataType=FlyDataType.ID, entityType="EE02", printName="Job Application", fieldLength=0)
	HR_JobApplication_ID,
	//
	@FlyElement(name="Job Education", description="The Job Education for this position", help="Job Education required for this position", dataType=FlyDataType.ID, entityType="EE02", printName="Job Education", fieldLength=0)
	HR_JobEducation_ID,
	//
	@FlyElement(name="Payroll Job", dataType=FlyDataType.NONE, entityType="EE02", printName="Payroll Job", fieldLength=10)
	HR_Job_ID,
	//
	@FlyElement(name="Job Opening History", dataType=FlyDataType.ID, entityType="EE02", printName="Job Opening History", fieldLength=0)
	HR_JobOpeningHistory_ID,
	//
	@FlyElement(name="Job Openings ", description="Job Openings for Recruitment Management", help="The Job Opening required for a Department", dataType=FlyDataType.ID, entityType="EE02", printName="Job Openings ", fieldLength=0)
	HR_JobOpening_ID,
	//
	@FlyElement(name="Job Type", description="The Job Type for a Job Openings", help="Job Type for Recruitment Management", dataType=FlyDataType.ID, entityType="EE02", printName="Job Type", fieldLength=0)
	HR_JobType_ID,
	//
	@FlyElement(name="Leave Assign", description="Leave Assign", help="Leave Assign for an Employee", dataType=FlyDataType.ID, entityType="EE02", printName="Leave Assign", fieldLength=0)
	HR_LeaveAssign_ID,
	//
	@FlyElement(name="Leave Credit History", description="The Leave Credit History of an Employee", dataType=FlyDataType.ID, entityType="EE02", printName="Leave Credit History", fieldLength=0)
	HR_LeaveCreditHistory_ID,
	//
	@FlyElement(name="Leave Reason", description="Predefiend reasons", help="Select predefiend reason for leave or select Others for new reason", dataType=FlyDataType.ID, entityType="EE02", printName="Leave Reason", fieldLength=0)
	HR_LeaveReason_ID,
	//
	@FlyElement(name="Leave Type Combination", description="Leave Type Combination", help="The combination valid leave type for an leave", dataType=FlyDataType.ID, entityType="EE02", printName="Leave Type Combination", fieldLength=0)
	HR_LeaveTypeCombination_ID,
	//
	@FlyElement(name="Leave Type for employee type", description="Leave type for employee type", help="The Leave Type for employee type", dataType=FlyDataType.ID, entityType="EE02", printName="Leave Type for employee type", fieldLength=0)
	HR_LeaveTypeEmployeeType_ID,
	//
	@FlyElement(name="Leave Type", description="Leave Type for an Employee", help="The Leave Type for an Employee", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Leave Type", fieldLength=0)
	HR_LeaveType_ID,
	//
	@FlyElement(name="Payroll List Base", dataType=FlyDataType.Table, entityType="EE02", printName="Payroll List Base", fieldLength=10)
	HR_ListBase_ID,
	//
	@FlyElement(name="Payroll List", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll List", fieldLength=10)
	HR_List_ID,
	//
	@FlyElement(name="Payroll List Line", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll List Line", fieldLength=10)
	HR_ListLine_ID,
	//
	@FlyElement(name="Payroll List Type", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll List Type", fieldLength=10)
	HR_ListType_ID,
	//
	@FlyElement(name="Payroll List Version", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll List Version", fieldLength=10)
	HR_ListVersion_ID,
	//
	@FlyElement(name="Payroll Movement", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll Movement", fieldLength=10)
	HR_Movement_ID,
	//
	@FlyElement(name="Payroll Concept", description="The payroll concept allows to define all those Global Concept that are using to calculate a payroll.", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll Concept", fieldLength=10)
	HR_PayrollConcept_ID,
	//
	@FlyElement(name="Payroll", dataType=FlyDataType.NONE, entityType="EE02", printName="Payroll", fieldLength=22)
	HR_Payroll_ID,
	//
	@FlyElement(name="Payroll Pay Selection Check ID", dataType=FlyDataType.NONE, entityType="EE02", printName="Payroll Pay Selection Check ID", fieldLength=0)
	HR_PaySelectionCheck_ID,
	//
	@FlyElement(name="Payroll Payment Selection ID", dataType=FlyDataType.NONE, entityType="EE02", printName="Payroll Payment Selection ID", fieldLength=0)
	HR_PaySelection_ID,
	//
	@FlyElement(name="Payroll Payment Selection Line ID", dataType=FlyDataType.NONE, entityType="EE02", printName="Payroll Payment Selection Line ID", fieldLength=0)
	HR_PaySelectionLine_ID,
	//
	@FlyElement(name="Payroll Period", dataType=FlyDataType.Table, entityType="EE02", printName="Payroll Period", fieldLength=10)
	HR_Period_ID,
	//
	@FlyElement(name="Payroll Process", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll Process", fieldLength=10)
	HR_Process_ID,
	//
	@FlyElement(name="Race", description="Race", help="Race", dataType=FlyDataType.ID, entityType="EE02", printName="Race", fieldLength=0)
	HR_Race_ID,
	//
	@FlyElement(name="Employee Relationship", description="Employee Relationship Identifies an employee relations", help="The Employee Relationship  Identifies an employee relations", dataType=FlyDataType.ID, entityType="EE02", printName="Employee Relationship", fieldLength=0)
	HR_Relationship_ID,
	//
	@FlyElement(name="Payroll Revenue Account", dataType=FlyDataType.Account, entityType="EE02", printName="Payroll Revenue Account", fieldLength=10)
	HR_Revenue_Acct,
	//
	@FlyElement(name="Salary Range", description="The Salary Rage is use in Job Openings", help="Salary range for Job Opening", dataType=FlyDataType.ID, entityType="EE02", printName="Salary Range", fieldLength=0)
	HR_SalaryRange_ID,
	//
	@FlyElement(name="Salary Structure", description="Salary Structure of an Employee", help="The Salary Structure define ", dataType=FlyDataType.ID, entityType="EE02", printName="Salary Structure", fieldLength=0)
	HR_SalaryStructure_ID,
	//
	@FlyElement(name="Salary Structure Line", description="Salary Structure Line", help="Salary Structure Line", dataType=FlyDataType.ID, entityType="EE02", printName="Salary Structure Line", fieldLength=0)
	HR_SalaryStructureLine_ID,
	//
	@FlyElement(name="Shift Group", description="Shift Group", help="The Shift Group provides a way to grouping of Shifts", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Shift Group", fieldLength=10)
	HR_ShiftGroup_ID,
	//
	@FlyElement(name="Skill Type", description="Skill Type for an Employee", help="The Skill Type for an Employee", dataType=FlyDataType.ID, entityType="EE02", printName="Skill Type", fieldLength=10)
	HR_SkillType_ID,
	//
	@FlyElement(name="Work Group", description="Work Group", help="The Work Group provides a way to grouping of Work", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Work Group", fieldLength=10)
	HR_WorkGroup_ID,
	//
	@FlyElement(name="Work Shift", description="Work Shift", help=".", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Work Shift", fieldLength=0)
	HR_WorkShift_ID,
	//
	@FlyElement(name="Payroll Year", dataType=FlyDataType.TableDirect, entityType="EE02", printName="Payroll Year", fieldLength=10)
	HR_Year_ID,
	//
	@FlyElement(name="HTML", dataType=FlyDataType.LongText, entityType="D", printName="HTML", fieldLength=0)
	HTML,
	//
	@FlyElement(name="Hyphen", dataType=FlyDataType.String, entityType="D", printName="Hyphen", fieldLength=20)
	Hyphen,
	//
	@FlyElement(name="Asset", dataType=FlyDataType.ID, entityType="D", printName="Asset", fieldLength=22)
	I_Asset_ID,
	//
	@FlyElement(name="IBAN", description="International Bank Account Number", help="If your bank provides an International Bank Account Number, enter it here	Details ISO 13616 and http://www.ecbs.org. The account number has the maximum length of 22 characters (without spaces). The IBAN is often printed with a apace after 4 characters. Do not enter the spaces in Adempiere.", dataType=FlyDataType.String, entityType="D", printName="IBAN", fieldLength=40)
	IBAN,
	//
	@FlyElement(name="Import Bank Statement", description="Import of the Bank Statement", dataType=FlyDataType.ID, entityType="D", printName="Import Bank Statement", fieldLength=22)
	I_BankStatement_ID,
	//
	@FlyElement(name="Import Business Partner", dataType=FlyDataType.ID, entityType="D", printName="Import B.Partner", fieldLength=22)
	I_BPartner_ID,
	//
	@FlyElement(name="I_Budget_ID", dataType=FlyDataType.NONE, entityType="D", printName="I_Budget_ID", fieldLength=0)
	I_Budget_ID,
	//
	@FlyElement(name="Import Conversion Rate", description="Import Currency Conversion Rate", dataType=FlyDataType.ID, entityType="D", printName="Import Conversion Rate", fieldLength=22)
	I_Conversion_Rate_ID,
	//
	@FlyElement(name="Identification Mark", description="Identification Mark", help="Identification Mark", dataType=FlyDataType.String, entityType="EE02", printName="Identification Mark", fieldLength=0)
	IdentificationMark,
	//
	@FlyElement(name="Identity Proof", description="Defines the type of Identity Proof", help="Defines the type of Identity Proof", dataType=FlyDataType.List, entityType="EE02", printName="Identity Proof", fieldLength=0)
	IdentityProof,
	//
	@FlyElement(name="Identity Proof No", description="Identity Proof No of applicant", help="The Identity Proof No of applicant", dataType=FlyDataType.String, entityType="EE02", printName="Identity Proof No", fieldLength=0)
	IdentityProofNo,
	//
	@FlyElement(name="ID Range End", description="End if the ID Range used", help="The ID Range allows to restrict the range of the internally used IDs. Please note that the ID range is NOT enforced.", dataType=FlyDataType.Number, entityType="D", printName="ID End", fieldLength=22)
	IDRangeEnd,
	//
	@FlyElement(name="ID Range Start", description="Start of the ID Range used", help="The ID Range allows to restrict the range of the internally used IDs. The standard rages are 0-899,999 for the Application Dictionary 900,000-999,999 for Application Dictionary customizations/extensions and > 1,000,000 for client data. The standard system limit is 9,999,999,999 but can easily be extended.  The ID range is on a per table basis.	Please note that the ID range is NOT enforced.", dataType=FlyDataType.Number, entityType="D", printName="ID Start", fieldLength=22)
	IDRangeStart,
	//
	@FlyElement(name="Import Account", description="Import Account Value", dataType=FlyDataType.ID, entityType="D", printName="Import Account", fieldLength=22)
	I_ElementValue_ID,
	//
	@FlyElement(name="Import Error Message", description="Messages generated from import process", help="The Import Error Message displays any error messages generated during the import process.", dataType=FlyDataType.String, entityType="D", printName="Import Error Message", fieldLength=2000)
	I_ErrorMsg,
	//
	@FlyElement(name="FA Journal", dataType=FlyDataType.Integer, entityType="D", printName="FA Journal", fieldLength=22)
	I_FAJournal_ID,
	//
	@FlyElement(name="Imported Fixed Asset", dataType=FlyDataType.NONE, entityType="D", printName="Imported Fixed Asset", fieldLength=0)
	I_FixedAsset_ID,
	//
	@FlyElement(name="Import Forecast ID", dataType=FlyDataType.NONE, entityType="EE01", printName="Import Forecast ID", fieldLength=0)
	I_Forecast_ID,
	//
	@FlyElement(name="Import GL Journal", description="Import General Ledger Journal", dataType=FlyDataType.ID, entityType="D", printName="Import GL Journal", fieldLength=22)
	I_GLJournal_ID,
	//
	@FlyElement(name="IgnorePrevProduction", description="IgnorePrevProduction", help="IgnorePrevProduction", dataType=FlyDataType.YesNo, entityType="D", printName="IgnorePrevProduction", fieldLength=1)
	IgnorePrevProduction,
	//
	@FlyElement(name="I_HR_Attribute", dataType=FlyDataType.NONE, entityType="EE02", printName="I_HR_Attribute", fieldLength=0)
	I_HR_Attribute_ID,
	//
	@FlyElement(name="I_HR_Employee ID", dataType=FlyDataType.NONE, entityType="EE02", printName="I_HR_Employee ID", fieldLength=0)
	I_HR_Employee_ID,
	//
	@FlyElement(name="Payroll Movement Import", dataType=FlyDataType.ID, entityType="EE02", printName="Payroll Movement Import", fieldLength=10)
	I_HR_Movement_ID,
	//
	@FlyElement(name="Ship/Receipt Confirmation Import Line", description="Material Shipment or Receipt Confirmation Import Line", help="Import Confirmation Line Details", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm Import Line", fieldLength=22)
	I_InOutLineConfirm_ID,
	//
	@FlyElement(name="Import Inventory", description="Import Inventory Transactions", dataType=FlyDataType.ID, entityType="D", printName="Import Inventory", fieldLength=22)
	I_Inventory_ID,
	//
	@FlyElement(name="Import Invoice", description="Import Invoice", dataType=FlyDataType.ID, entityType="D", printName="Import Invoice", fieldLength=22)
	I_Invoice_ID,
	//
	@FlyElement(name="Imported", description="Has this import been processed", help="The Imported check box indicates if this import has been processed.", dataType=FlyDataType.YesNo, entityType="D", printName="Imported", fieldLength=1)
	I_IsImported,
	//
	@FlyElement(name="Image Alpha ", description="Image Texture Composite Alpha", help="Composite Alpha factor for taint color.", dataType=FlyDataType.Number, entityType="D", printName="Image Alpha", fieldLength=22)
	ImageAlpha,
	//
	@FlyElement(name="Image attached", description="The image to be printed is attached to the record", help="The image to be printed is stored in the database as attachment to this record. The image can be a gif, jpeg or png.", dataType=FlyDataType.YesNo, entityType="D", printName="Image attached", fieldLength=1)
	ImageIsAttached,
	//
	@FlyElement(name="Image Link", dataType=FlyDataType.String, entityType="D", printName="Image Link", fieldLength=510)
	ImageLink,
	//
	@FlyElement(name="Image URL", description="URL of  image", help="URL of image; The image is not stored in the database, but retrieved at runtime. The image can be a gif, jpeg or png.", dataType=FlyDataType.URL, entityType="D", printName="Image URL", fieldLength=120)
	ImageURL,
	//
	@FlyElement(name="I_Movement_ID", dataType=FlyDataType.ID, entityType="EE01", printName="I_Movement_ID", fieldLength=10)
	I_Movement_ID,
	//
	@FlyElement(name="Implosion", description="Implosion of a Bill of Materials refers to finding all the BOM''s in which a component is used.", help="Commonly called a Where-Used report.", dataType=FlyDataType.YesNo, entityType="EE01", printName="Implosion", fieldLength=1)
	Implosion,
	//
	@FlyElement(name="Import Fields", description="Create Fields from Table Columns", dataType=FlyDataType.Button, entityType="D", printName="Import Fields", fieldLength=1)
	ImportFields,
	//
	@FlyElement(name="Import Table", description="Import Table Columns from Database", dataType=FlyDataType.Button, entityType="D", printName="Import Table", fieldLength=1)
	ImportTable,
	//
	@FlyElement(name="Import Processor", dataType=FlyDataType.ID, entityType="EE05", printName="Import Processor", fieldLength=10)
	IMP_Processor_ID,
	//
	@FlyElement(name="Import Processor Log", dataType=FlyDataType.ID, entityType="EE05", printName="Import Processor Log", fieldLength=22)
	IMP_ProcessorLog_ID,
	//
	@FlyElement(name="Import Processor Parameter", dataType=FlyDataType.ID, entityType="EE05", printName="Import Processor Parameter", fieldLength=10)
	IMP_ProcessorParameter_ID,
	//
	@FlyElement(name="Import Processor Type", dataType=FlyDataType.TableDirect, entityType="EE05", printName="Import Processor Type", fieldLength=10)
	IMP_Processor_Type_ID,
	//
	@FlyElement(name="Inactivity Alert Days", description="Send Alert when there is no activity after days (0= no alert)", help="An email alert is sent when the request shows no activity for the number of days defined.", dataType=FlyDataType.Integer, entityType="D", printName="Inactivity Alert Days", fieldLength=22)
	InactivityAlertDays,
	//
	@FlyElement(name="Included Role", dataType=FlyDataType.Table, entityType="D", printName="Included Role", fieldLength=10)
	Included_Role_ID,
	//
	@FlyElement(name="Included Tab", description="Included Tab in this Tab (Master Detail)", help="You can include a Tab in a Tab. If displayed in single row record, the included tab is displayed as multi-row table.", dataType=FlyDataType.Table, entityType="D", printName="Included Tab", fieldLength=22)
	Included_Tab_ID,
	//
	@FlyElement(name="Include Disputed", description="Include disputed Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Include Disputed", fieldLength=0)
	IncludeInDispute,
	//
	@FlyElement(name="Income Summary Acct", description="Income Summary Account ", dataType=FlyDataType.Account, entityType="D", printName="Income Summary Acct", fieldLength=22)
	IncomeSummary_Acct,
	//
	@FlyElement(name="Increment", description="The number to increment the last document number by", help="The Increment indicates the number to increment the last document number by to arrive at the next sequence number", dataType=FlyDataType.Integer, entityType="D", printName="Increment", fieldLength=22)
	IncrementNo,
	//
	@FlyElement(name="Index Query", description="Text Search Query ", help="Text search query entered", dataType=FlyDataType.String, entityType="D", printName="Query", fieldLength=255)
	IndexQuery,
	//
	@FlyElement(name="Query Result", description="Result of the text query", dataType=FlyDataType.Integer, entityType="D", printName="Result", fieldLength=10)
	IndexQueryResult,
	//
	@FlyElement(name="Industry Info", description="Information of the industry (e.g. professional service, distribution of furnitures, ..)", help="This allows to have the three general situations of 'not open' - 'open' - 'closed'", dataType=FlyDataType.Text, entityType="D", printName="Industry Info", fieldLength=255)
	IndustryInfo,
	//
	@FlyElement(name="Info", description="Information", help="The Information displays data from the source document line.", dataType=FlyDataType.Text, entityType="D", printName="Info", fieldLength=4000)
	Info,
	//
	@FlyElement(name="Info Factory Class", description="Fully qualified class name that implements the InfoFactory interface", help="Fully qualified class name that implements the InfoFactory interface. This can be use to provide custom Info class for column.", dataType=FlyDataType.String, entityType="D", printName="Info Factory Class", fieldLength=255)
	InfoFactoryClass,
	//
	@FlyElement(name="Info To", dataType=FlyDataType.String, entityType="D", printName="Info To", fieldLength=60)
	Info_To,
	//
	@FlyElement(name="Inbound & Outbound Class", description="Custom class to implemeted new Inbound & Outbound Rule logic", help="If you select a custom Inbound & Outbound type, you need to create a class implementing org.eevolution.util.IInOutboundRule and set that on Inbound & Outbound Rule.", dataType=FlyDataType.NONE, entityType="EE03", printName="Â© Class", fieldLength=0)
	InOutboundClass,
	//
	@FlyElement(name="Inbound & Outbound Rule", description="Inbound & Outbound Rule determinated the putaway or pick location for goods stocked in the warehouse", help="Inbound & Outbound Rule are used to define which locators should be considered for putaway or picking.", dataType=FlyDataType.NONE, entityType="EE03", printName="Inbound & Outbound Rule", fieldLength=0)
	InOutBoundRule,
	//
	@FlyElement(name="Inbound & Outbound Type", description="Inbound & Outbound Type", help="The Inbound & Outbound Type defines the type of In & Out Operation to be Putaway or Picking.", dataType=FlyDataType.NONE, entityType="EE03", printName="Inbound & Outbound Type", fieldLength=0)
	InOutBoundType,
	//
	@FlyElement(name="Shipment/Receipt", description="MaterialShipment Document", help="The Material Shipment / Receipt ", dataType=FlyDataType.Search, entityType="D", printName="Shipment/Receipt", fieldLength=22)
	InOut_ID,
	//
	@FlyElement(name="Instructions", dataType=FlyDataType.Memo, entityType="D", printName="Instructions", fieldLength=1000)
	Instructions,
	//
	@FlyElement(name="Insurance Plan", description="The Insurance Plan", dataType=FlyDataType.String, entityType="EE02", printName="Insurance Plan", fieldLength=0)
	InsurancePlan,
	//
	@FlyElement(name="Intercompany Due From Acct", description="Intercompany Due From / Receivables Account", help="The Intercompany Due From account indicates the account that represents money owed to this organization from other organizations.", dataType=FlyDataType.Account, entityType="D", printName="Intercompany Due From Acct", fieldLength=22)
	IntercompanyDueFrom_Acct,
	//
	@FlyElement(name="Intercompany Due To Acct", description="Intercompany Due To / Payable Account", help="The Intercompany Due To Account indicates the account that represents money owed to other organizations.", dataType=FlyDataType.Account, entityType="D", printName="Intercompany Due To Acct", fieldLength=22)
	IntercompanyDueTo_Acct,
	//
	@FlyElement(name="Interest Amount", description="Interest Amount", help="The Interest Amount indicates any interest charged or received on a Bank Statement.", dataType=FlyDataType.Amount, entityType="D", printName="Interest", fieldLength=22)
	InterestAmt,
	//
	@FlyElement(name="Interest Area", description="Name of the Interest Area", help="Name of the Interest Area of the user", dataType=FlyDataType.String, entityType="D", printName="Interest Area", fieldLength=40)
	InterestAreaName,
	//
	@FlyElement(name="Interest in percent", description="Percentage interest to charge on overdue invoices", help="The Interest amount in percent indicates the interest to be charged on overdue invoices.  This field displays only if the charge interest checkbox has been selected.", dataType=FlyDataType.Number, entityType="D", printName="Interest in percent", fieldLength=22)
	InterestPercent,
	//
	@FlyElement(name="Set Inventory Count to", description="Set the value of the inventory count to Zero or On Hand Quantity", dataType=FlyDataType.NONE, entityType="D", printName="Set Inventory Count to", fieldLength=0)
	InventoryCountSet,
	//
	@FlyElement(name="Inventory No", dataType=FlyDataType.NONE, entityType="D", printName="Inventory No", fieldLength=0)
	InventoryNo,
	//
	@FlyElement(name="Inventory Type", description="Type of inventory difference", help="The type of inventory difference determines which account is used. The default is the Inventory Difference account defined for the warehouse.  Alternatively, you could select any charge.  This allows you to account for Internal Use or extraordinary inventory losses.", dataType=FlyDataType.List, entityType="D", printName="Inventory Type", fieldLength=1)
	InventoryType,
	//
	@FlyElement(name="Invert Account Sign", description="Enable invert account sign when a GL Distribution rule applied", help="for instance:		Original:		Debit Expense 1000	Credit Account Payable 1000 		Result :		Debit Account Payable 1000 	Credit Expense 1000	", dataType=FlyDataType.YesNo, entityType="D", printName="Invert Account Sign", fieldLength=1)
	InvertAccountSign,
	//
	@FlyElement(name="Invoice Amt", dataType=FlyDataType.Amount, entityType="D", printName="Invoice Amt", fieldLength=22)
	InvoiceAmt,
	//
	@FlyElement(name="Collection Status", description="Invoice Collection Status", help="Status of the invoice collection process", dataType=FlyDataType.List, entityType="D", printName="Collection Status", fieldLength=1)
	InvoiceCollectionType,
	//
	@FlyElement(name="Invoiced Amount", description="The amount invoiced", help="The amount invoiced", dataType=FlyDataType.Amount, entityType="D", printName="Invoiced Amount", fieldLength=22)
	InvoicedAmt,
	//
	@FlyElement(name="Invoice Day", description="Day of Invoice Generation", help="The Invoice Day indicates the day of invoice generation.  If twice monthly, the second time is 15 days after this day.", dataType=FlyDataType.Integer, entityType="D", printName="Invoice Day", fieldLength=22)
	InvoiceDay,
	//
	@FlyElement(name="Invoice day cut-off", description="Last day for including shipments", help="The Invoice Day Cut Off indicates the last day for shipments to be included in the current invoice schedule.  For example, if the invoice schedule is defined for the first day of the month, the cut off day may be the 25th of the month.  An shipment on the 24th of May would be included in the invoices sent on June 1st but a shipment on the 26th would be included in the invoices sent on July 1st.", dataType=FlyDataType.Integer, entityType="D", printName="Invoice day cut-off", fieldLength=22)
	InvoiceDayCutoff,
	//
	@FlyElement(name="Invoice Document No", description="Document Number of the Invoice", dataType=FlyDataType.String, entityType="D", printName="Invoice Document No", fieldLength=30)
	InvoiceDocumentNo,
	//
	@FlyElement(name="Quantity Invoiced ", description="The quantity invoiced", dataType=FlyDataType.Quantity, entityType="D", printName="Quantity Invoiced", fieldLength=22)
	InvoicedQty,
	//
	@FlyElement(name="Invoice Frequency", description="How often invoices will be generated", help="The Invoice Frequency indicates the frequency of invoice generation for a Business Partner.", dataType=FlyDataType.List, entityType="D", printName="Invoice Frequency", fieldLength=1)
	InvoiceFrequency,
	//
	@FlyElement(name="Invoice Mail Text", description="Email text used for sending invoices", help="Standard email template used to send invoices as attachments.", dataType=FlyDataType.Table, entityType="D", printName="Invoice Mail Text", fieldLength=22)
	Invoice_MailText_ID,
	//
	@FlyElement(name="Invoice Price", description="Unit price to be invoiced or 0 for default price", help="Unit Price in the currency of the business partner!  If it is 0, the standard price of the sales price list of the business partner (customer) is used.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Invoice Price", fieldLength=22)
	InvoicePrice,
	//
	@FlyElement(name="Invoice Print Format", description="Print Format for printing Invoices", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="Invoice Print Format", fieldLength=22)
	Invoice_PrintFormat_ID,
	//
	@FlyElement(name="Invoice Rule", description="Frequency and method of invoicing ", help="The Invoice Rule defines how a Business Partner is invoiced and the frequency of invoicing.", dataType=FlyDataType.List, entityType="D", printName="Invoice Rule", fieldLength=1)
	InvoiceRule,
	//
	@FlyElement(name="Invoice Week Day", description="Day to generate invoices", help="The Invoice Week Day indicates the day of the week to generate invoices.", dataType=FlyDataType.List, entityType="D", printName="Invoice Week Day", fieldLength=1)
	InvoiceWeekDay,
	//
	@FlyElement(name="Invoice weekday cutoff", description="Last day in the week for shipments to be included", help="The Invoice Week Day Cutoff indicates the last day of the week a shipment must be made to be included in the invoice schedule.", dataType=FlyDataType.List, entityType="D", printName="Weekday cutoff", fieldLength=1)
	InvoiceWeekDayCutoff,
	//
	@FlyElement(name="Import Order", description="Import Orders", dataType=FlyDataType.ID, entityType="D", printName="Import Order", fieldLength=22)
	I_Order_ID,
	//
	@FlyElement(name="IP Address", description="Defines the IP address to transfer data to", help="Contains info on the IP address to which we will transfer data", dataType=FlyDataType.String, entityType="D", printName="IP Address", fieldLength=20)
	IP_Address,
	//
	@FlyElement(name="Import Payment", description="Import Payment", dataType=FlyDataType.ID, entityType="D", printName="Import Payment", fieldLength=22)
	I_Payment_ID,
	//
	@FlyElement(name="Import Price List", dataType=FlyDataType.ID, entityType="D", printName="Import Price List", fieldLength=22)
	I_PriceList_ID,
	//
	@FlyElement(name="Import Product Attribute Set Instance ID", dataType=FlyDataType.NONE, entityType="EE01", printName="Import Product Attribute Set Instance ID", fieldLength=0)
	I_Product_ASI_ID,
	//
	@FlyElement(name="I_Product_BOM_ID", dataType=FlyDataType.ID, entityType="EE01", printName="I_Product_BOM_ID", fieldLength=10)
	I_Product_BOM_ID,
	//
	@FlyElement(name="Import Product", description="Import Item or Service", dataType=FlyDataType.ID, entityType="D", printName="Import Product", fieldLength=22)
	I_Product_ID,
	//
	@FlyElement(name="Import Product Planning", dataType=FlyDataType.ID, entityType="EE01", printName="Import Product Planning", fieldLength=10)
	I_ProductPlanning_ID,
	//
	@FlyElement(name="Import Report Line Set", description="Import Report Line Set values", dataType=FlyDataType.ID, entityType="D", printName="Import Report Line Set", fieldLength=22)
	I_ReportLine_ID,
	//
	@FlyElement(name="Abort Process", description="Aborts the current process", dataType=FlyDataType.NONE, entityType="D", printName="Abort Process", fieldLength=0)
	IsAbort,
	//
	@FlyElement(name="Access all Orgs", description="Access all Organizations (no org access control) of the client", help="When selected, the role has access to all organizations of the client automatically. This also increases performance where you have many organizations.", dataType=FlyDataType.YesNo, entityType="D", printName="Access all Orgs", fieldLength=1)
	IsAccessAllOrgs,
	//
	@FlyElement(name="Accrual", description="Indicates if Accrual or Cash Based accounting will be used", help="The Accrual checkbox indicates if this accounting schema will use accrual based account or cash based accounting.  The Accrual method recognizes revenue when the product or service is delivered.  Cash based method recognizes income when then payment is received.", dataType=FlyDataType.YesNo, entityType="D", printName="Accrual", fieldLength=1)
	IsAccrual,
	//
	@FlyElement(name="ACH", description="Automatic Clearing House", help="The ACH checkbox indicates if this Bank Account accepts ACH transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="ACH", fieldLength=1)
	IsACH,
	//
	@FlyElement(name="Achieved", description="The goal is achieved", help="The Achieved checkbox indicates if this goal has been achieved.", dataType=FlyDataType.YesNo, entityType="D", printName="Achieved", fieldLength=1)
	IsAchieved,
	//
	@FlyElement(name="Active", description="The record is active in the system", help="There are two methods of making records unavailable in the system: One is to delete the record, the other is to de-activate the record. A de-activated record is not available for selection, but available for reports.	There are two reasons for de-activating and not deleting records:	(1) The system requires the record for audit purposes.	(2) The record is referenced by other records. E.g., you cannot delete a Business Partner, if there are invoices for this partner record existing. You de-activate the Business Partner and prevent that this record is used for future entries.", dataType=FlyDataType.YesNo, entityType="D", printName="Active", fieldLength=1)
	IsActive,
	//
	@FlyElement(name="Activity Dimension", description="Include Activity as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Activity Dimension", fieldLength=1)
	IsActivityDim,
	//
	@FlyElement(name="Add Invoice Reference Line", description="Add a line on invoice with information about reference of shipment", help="It can have information about shipment no and shipment date", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Add Invoice Reference Line", fieldLength=1)
	IsAddInvoiceReferenceLine,
	//
	@FlyElement(name="Reverse Local Address Lines", description="Print Local Address in reverse Order", help="If NOT selected the local sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country.	If selected the local sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1.	The sequence of City/Region/Postal is determined by the local address format.", dataType=FlyDataType.YesNo, entityType="D", printName="Reverse Local Address", fieldLength=1)
	IsAddressLinesLocalReverse,
	//
	@FlyElement(name="Reverse Address Lines", description="Print Address in reverse Order", help="If NOT selected the sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country.	If selected the sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1.	The sequence of City/Region/Postal is determined by the address format.", dataType=FlyDataType.YesNo, entityType="D", printName="Reverse Address", fieldLength=1)
	IsAddressLinesReverse,
	//
	@FlyElement(name="Special AD Flag", description="Do we need to specially mention this ad?", help="If we have a block in content where announce content and also sponsored links we should mention the sponsored ones", dataType=FlyDataType.YesNo, entityType="D", printName="Special AD Flag", fieldLength=1)
	IsAdFlag,
	//
	@FlyElement(name="Adhoc Conversion", description="Perform conversion for all amounts to currency", help="If a currency is selected, only this currency will be reported. If adhoc conversion is selected, all currencies are converted to the defined currency", dataType=FlyDataType.YesNo, entityType="D", printName="Adhoc Conversion", fieldLength=1)
	IsAdhocConversion,
	//
	@FlyElement(name="Consider Adjacent Holidays As Leave?", description="Consider Adjacent Holidays As Leave?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Consider Adjacent Holidays As Leave?", fieldLength=0)
	IsAdjacentHolidayAsLeave,
	//
	@FlyElement(name="Adjust COGS", description="Adjust Cost of Good Sold", help="For Invoice costing methods, you can adjust the cost of goods sold. At the time of shipment, you may not have received the invoice for the receipt or cost adjustments like freight, customs, etc.", dataType=FlyDataType.YesNo, entityType="D", printName="Adjust COGS", fieldLength=1)
	IsAdjustCOGS,
	//
	@FlyElement(name="Advanced Tab", description="This Tab contains advanced Functionality", help="The tab with advanced functionality is only displayed, if enabled in Tools>Preference.", dataType=FlyDataType.YesNo, entityType="D", printName="Advanced Tab", fieldLength=1)
	IsAdvancedTab,
	//
	@FlyElement(name="Alert", description="Display alert message when referenced record is accessed", dataType=FlyDataType.NONE, entityType="D", printName="Alert", fieldLength=0)
	IsAlert,
	//
	@FlyElement(name="Import Sales History ID", dataType=FlyDataType.NONE, entityType="EE01", printName="Import Sales History ID", fieldLength=0)
	I_SalesHistory_ID,
	//
	@FlyElement(name="Include All Currencies", description="Report not just foreign currency Invoices", dataType=FlyDataType.YesNo, entityType="D", printName="All Currencies", fieldLength=1)
	IsAllCurrencies,
	//
	@FlyElement(name="All Nodes", description="All Nodes are included (Complete Tree)", help="If selected, all Nodes must be in the tree.", dataType=FlyDataType.YesNo, entityType="D", printName="All Nodes", fieldLength=1)
	IsAllNodes,
	//
	@FlyElement(name="Allocated", description="Indicates if the payment has been allocated", help="The Allocated checkbox indicates if a payment has been allocated or associated with an invoice or invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="Allocated", fieldLength=1)
	IsAllocated,
	//
	@FlyElement(name="Allow Copy", description="Defines whether the value of this field is considered in the copy of record", help="The default value is yes, it is recommended that values such as ID, document action, document status  should be defined as no.", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Copy", fieldLength=1)
	IsAllowCopy,
	//
	@FlyElement(name="Allowed En Cashment?", description="Allowed En Cashment? ", help="The Allowed En Cashment ", dataType=FlyDataType.YesNo, entityType="EE02", printName="Allowed En Cashment?", fieldLength=0)
	IsAllowedEnCashment,
	//
	@FlyElement(name="Allow Logging", description="Determine if a column must be recorded into the change log", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Logging", fieldLength=1)
	IsAllowLogging,
	//
	@FlyElement(name="Allow Negative", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Negative", fieldLength=1)
	IsAllowNegative,
	//
	@FlyElement(name="Allow Negative Posting", description="Allow to post negative accounting values", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Negative Posting", fieldLength=1)
	IsAllowNegativePosting,
	//
	@FlyElement(name="Allow Opposite Sign", description="Allow column values to be displayed with the opposite sign", help="Allows values to be displayed with the opposite sign to the calculated value if the 'Show Opposite Sign' flag is set on the Report Line. Note that all report calculations are performed before the sign is reversed.", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Opposite Sign", fieldLength=1)
	IsAllowOppositeSign,
	//
	@FlyElement(name="Allow Positive", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Positive", fieldLength=1)
	IsAllowPositive,
	//
	@FlyElement(name="Allowed to be Published", description="You allow to publish the information, not just statistical summary info", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Publish", fieldLength=1)
	IsAllowPublish,
	//
	@FlyElement(name="Allow RMA", description="Allow to consider RMA", help="When active, RMAs are considered", dataType=FlyDataType.YesNo, entityType="D", printName="Allow RMA", fieldLength=1)
	IsAllowRMA,
	//
	@FlyElement(name="Maintain Statistics", description="Maintain general statistics", help="Maintain and allow to transfer general statistics (number of clients, orgs, business partners, users, products, invoices) to get a better feeling for the application use.  This information is not published.", dataType=FlyDataType.YesNo, entityType="D", printName="Maintain Statistics", fieldLength=1)
	IsAllowStatistics,
	//
	@FlyElement(name="Always Updateable", description="The column is always updateable, even if the record is not active or processed", help="If selected and if the window / tab is not read only, you can always update the column.  This might be useful for comments, etc.", dataType=FlyDataType.YesNo, entityType="D", printName="Always Updateable", fieldLength=1)
	IsAlwaysUpdateable,
	//
	@FlyElement(name="Amount Limit", description="Send invoices only if the amount exceeds the limit", help="The Amount Limit checkbox indicates if invoices will be sent out if they are below the entered limit.   	", dataType=FlyDataType.YesNo, entityType="D", printName="Amt Limit", fieldLength=1)
	IsAmount,
	//
	@FlyElement(name="Apply Script", dataType=FlyDataType.YesNo, entityType="D", printName="Apply Script", fieldLength=1)
	isApply,
	//
	@FlyElement(name="Approved", description="Indicates if this document requires approval", help="The Approved checkbox indicates if this document requires approval before it can be processed.", dataType=FlyDataType.YesNo, entityType="D", printName="Approved", fieldLength=1)
	IsApproved,
	//
	@FlyElement(name="Activate Audit", description="Activate Audit Trail of what numbers are generated", help="The Activate Audit checkbox indicates if an audit trail of numbers generated will be kept.", dataType=FlyDataType.YesNo, entityType="D", printName="Activate Audit", fieldLength=1)
	IsAudited,
	//
	@FlyElement(name="Create Change Request", description="Automatically create BOM (Engineering) Change Request", help="Create automatically a Product Bill of Material  (Engineering) Change Request when the Request Group references a Product BOM", dataType=FlyDataType.YesNo, entityType="D", printName="Create Change Request", fieldLength=1)
	IsAutoChangeRequest,
	//
	@FlyElement(name="Autocomplete", description="Automatic completion for textfields", help="The autocompletion uses all existing values (from the same client and organization) of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Autocomplete", fieldLength=1)
	IsAutocomplete,
	//
	@FlyElement(name="Error Reporting", description="Automatically report Errors", help="To automate error reporting, submit errors to Adempiere. Only error (stack trace) information is submitted (no data or confidential information).  It helps us to react faster and proactively.  If you have a support contract, we will you inform about corrective measures.  This functionality is experimental at this point.", dataType=FlyDataType.YesNo, entityType="D", printName="Error Reporting", fieldLength=1)
	IsAutoErrorReport,
	//
	@FlyElement(name="Automatic Production", dataType=FlyDataType.YesNo, entityType="D", printName="Automatic Production", fieldLength=1)
	IsAutoProduction,
	//
	@FlyElement(name="Reconcile Automatically", description="Reconcile a payment automatically", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Reconcile Automatically", fieldLength=1)
	IsAutoReconciled,
	//
	@FlyElement(name="Auto numbering", description="Automatically assign the next number", help="The Auto Numbering checkbox indicates if the system will assign the next number automatically.", dataType=FlyDataType.YesNo, entityType="D", printName="Auto numbering", fieldLength=1)
	IsAutoSequence,
	//
	@FlyElement(name="Available", description="Resource is available", help="Resource is available for assignments", dataType=FlyDataType.YesNo, entityType="D", printName="Available", fieldLength=1)
	IsAvailable,
	//
	@FlyElement(name="Calculate Mean (µ)", description="Calculate Average of numeric content or length", help="Calculate the Mean (µ) of the data if the field is numeric, otherwise calculate the average length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Mean", fieldLength=1)
	IsAveraged,
	//
	@FlyElement(name="Backup value null", description="The backup value is null.", dataType=FlyDataType.NONE, entityType="D", printName="Backup value null", fieldLength=0)
	IsBackupNull,
	//
	@FlyElement(name="Balanced", dataType=FlyDataType.YesNo, entityType="D", printName="Balanced", fieldLength=1)
	IsBalanced,
	//
	@FlyElement(name="Balancing", description="All transactions within an element value must balance (e.g. cost centers)", help="The Balancing checkbox indicates the this element must balance in each journal transaction.  For example, if cost centers have been defined as an element which is balance then the debits and credits for each unique cost center must net to 0.00.  This is commonly used to define parts of an organization which report as their own entity.  Balancing is not an option for the Account element.", dataType=FlyDataType.YesNo, entityType="D", printName="Balancing", fieldLength=1)
	IsBalancing,
	//
	@FlyElement(name="Bank Account", description="Indicates if this is the Bank Account", help="The Bank Account checkbox indicates if this is account is the bank account.", dataType=FlyDataType.YesNo, entityType="D", printName="Bank Account", fieldLength=1)
	IsBankAccount,
	//
	@FlyElement(name="Base Language", description="The system information is maintained in this language", dataType=FlyDataType.YesNo, entityType="D", printName="Base Language", fieldLength=1)
	IsBaseLanguage,
	//
	@FlyElement(name="Is BatchTime", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is BatchTime", fieldLength=1)
	IsBatchTime,
	//
	@FlyElement(name="Before Approval", description="The Check is before the (manual) approval", help="If selected, the Budget Approval is before manual approvals - i.e. is only approved if budget is available.  This may cause that the use of the budget is delayed (after the approval)", dataType=FlyDataType.YesNo, entityType="D", printName="Before Approval", fieldLength=1)
	IsBeforeApproval,
	//
	@FlyElement(name="Beta Functionality", description="This functionality is considered Beta", help="Beta functionality is not fully tested or completed.", dataType=FlyDataType.YesNo, entityType="D", printName="Beta Functionality", fieldLength=1)
	IsBetaFunctionality,
	//
	@FlyElement(name="Bill of Materials", description="Bill of Materials", help="The Bill of Materials check box indicates if this product consists of a bill of materials.", dataType=FlyDataType.YesNo, entityType="D", printName="BOM", fieldLength=1)
	IsBillOfMaterial,
	//
	@FlyElement(name="Invoice Address", description="Business Partner Invoice/Bill Address", help="If the Invoice Address is selected, the location is used to send invoices to a customer or receive invoices from a vendor.", dataType=FlyDataType.YesNo, entityType="D", printName="Invoice Address", fieldLength=1)
	IsBillTo,
	//
	@FlyElement(name="Bill of Materials", description="Bill of Materials", help="The Bill of Materials check box indicates if this product consists of a bill of materials.", dataType=FlyDataType.YesNo, entityType="D", printName="BOM", fieldLength=1)
	IsBOM,
	//
	@FlyElement(name="Business Partner Dimension", description="Include Business Partner as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Business Partner Dimension", fieldLength=1)
	IsBPartnerDim,
	//
	@FlyElement(name="B.Partner Flat Discount", description="Use flat discount defined on Business Partner Level", help="For calculation of the discount, use the discount defined on Business Partner Level", dataType=FlyDataType.YesNo, entityType="D", printName="Partner Flat Discount", fieldLength=1)
	IsBPartnerFlatDiscount,
	//
	@FlyElement(name="Calculated", description="The value is calculated by the system", help="You cannot change values maintained by the system.", dataType=FlyDataType.YesNo, entityType="D", printName="Calculated", fieldLength=1)
	IsCalculated,
	//
	@FlyElement(name="Campaign Dimension", description="Include Campaign as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Campaign Dimension", fieldLength=1)
	IsCampaignDim,
	//
	@FlyElement(name="Approve own Documents", description="Users with this role can approve their own documents", help="If a user cannot approve their own documents (orders, etc.), it needs to be approved by someone else.", dataType=FlyDataType.YesNo, entityType="D", printName="Approve own", fieldLength=1)
	IsCanApproveOwnDoc,
	//
	@FlyElement(name="Cancelled", description="The transaction was cancelled", dataType=FlyDataType.YesNo, entityType="D", printName="Cancelled", fieldLength=1)
	IsCancelled,
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
	@FlyElement(name="Centrally maintained", description="Information maintained in System Element table", help="The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table  or 'Window' table.", dataType=FlyDataType.YesNo, entityType="D", printName="Centrally maintained", fieldLength=1)
	IsCentrallyMaintained,
	//
	@FlyElement(name="Maintain Change Log", description="Maintain a log of changes", help="If selected, a log of all changes is maintained.", dataType=FlyDataType.YesNo, entityType="D", printName="Change Log", fieldLength=1)
	IsChangeLog,
	//
	@FlyElement(name="Closed Status", description="The status is closed", help="This allows to have multiple closed status", dataType=FlyDataType.YesNo, entityType="D", printName="Closed", fieldLength=1)
	IsClosed,
	//
	@FlyElement(name="Close Document", description="Close Document (process)", dataType=FlyDataType.NONE, entityType="D", printName="Close", fieldLength=0)
	IsCloseDocument,
	//
	@FlyElement(name="Collapsed By Default", description="Flag to set the initial state of collapsible field group.", dataType=FlyDataType.YesNo, entityType="D", printName="Collapsed By Default", fieldLength=1)
	IsCollapsedByDefault,
	//
	@FlyElement(name="Collapsible", description="Flag to indicate the state of the dashboard panel", help="Flag to indicate the state of the dashboard panel (i.e. collapsible or static)", dataType=FlyDataType.YesNo, entityType="D", printName="Collapsible", fieldLength=1)
	IsCollapsible,
	//
	@FlyElement(name="Is collapsible by default", description="Flag to indicate if is collapsible by default", help="Flag to indicate if is collapsible by default", dataType=FlyDataType.YesNo, entityType="EE07", printName="Is collapsible by default", fieldLength=1)
	IsCollapsibleByDefault,
	//
	@FlyElement(name="Is Collect Cash?", description="Is Collect Cash?", help="Is Collect Cash?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Is Collect Cash?", fieldLength=0)
	IsCollectCash,
	//
	@FlyElement(name="Collective Asset", description="Asset Quantity is Collective", help="Asset Quantity is Collective", dataType=FlyDataType.NONE, entityType="D", printName="Collective Asset", fieldLength=0)
	IsCollectiveAsset,
	//
	@FlyElement(name="Commitment is Ceiling", description="The commitment amount/quantity is the chargeable ceiling ", help="The commitment amount and quantity is the maximum amount and quantity to be charged.  Ignored, if the amount or quantity is zero.", dataType=FlyDataType.YesNo, entityType="D", printName="Commit ceiling", fieldLength=1)
	IsCommitCeiling,
	//
	@FlyElement(name="Commitment", description="Is this document a (legal) commitment?", help="Commitment indicates if the document is legally binding.", dataType=FlyDataType.YesNo, entityType="D", printName="Commitment", fieldLength=1)
	IsCommitment,
	//
	@FlyElement(name="Complete", description="It is complete", help="Indication that this is complete", dataType=FlyDataType.YesNo, entityType="D", printName="Complete", fieldLength=1)
	IsComplete,
	//
	@FlyElement(name="Confidential Info", description="Can enter confidential information", help="When entering/updating Requests over the web, the user can mark his info as confidential", dataType=FlyDataType.YesNo, entityType="D", printName="Confidential Info", fieldLength=1)
	IsConfidentialInfo,
	//
	@FlyElement(name="Confirmed", description="Assignment is confirmed", help="Resource assignment is confirmed", dataType=FlyDataType.YesNo, entityType="D", printName="Confirmed", fieldLength=1)
	IsConfirmed,
	//
	@FlyElement(name="Is Consumes Forecast", description="Is Consumes Forecast", help="Indicates if the sales order line will generate or not a demand for MPS", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is Consumes Forecast", fieldLength=1)
	IsConsumesForecast,
	//
	@FlyElement(name="Copy Document No On Reversal", description="It Copy the Document No on Reversal Document instead of generate a new Sequence", help="Example of a Document #50000: when is reversed it generate a new sequence with next document no (#50001). If it flag is setted then the next sequence is not generate and the reversal document will be generated with #50000 wiht ^ as prefix: #50000^", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Copy Document No On Reversal", fieldLength=1)
	IsCopyDocNoOnReversal,
	//
	@FlyElement(name="Cost Frozen", description="Indicated that the Standard Cost is frozen", dataType=FlyDataType.YesNo, entityType="EE01", printName="Cost Frozen", fieldLength=1)
	IsCostFrozen,
	//
	@FlyElement(name="Cost Immediately", description="Update Costs immediately for testing", help="If selected, costs are updated immediately when a Cost Detail record is created (by matching or shipping).  Otherwise the costs are updated by batch or when the costs are needed for posting. You should select this only if you are testing,", dataType=FlyDataType.YesNo, entityType="D", printName="Cost Immediate", fieldLength=1)
	IsCostImmediate,
	//
	@FlyElement(name="Calculate Count (¿)", description="Count number of not empty elements", help="Calculate the total number (¿) of not empty (NULL) elements (maximum is the number of lines).", dataType=FlyDataType.YesNo, entityType="D", printName="Count", fieldLength=1)
	IsCounted,
	//
	@FlyElement(name="Create As Active", description="Create Asset and activate it", help="You may want to consider not to automatically make the asset active if you need to get some additional information", dataType=FlyDataType.YesNo, entityType="D", printName="Create Active", fieldLength=1)
	IsCreateAsActive,
	//
	@FlyElement(name="Create by Product", dataType=FlyDataType.YesNo, entityType="D", printName="Create by Product", fieldLength=1)
	IsCreateByProduct,
	//
	@FlyElement(name="Create Counter Document", description="Create Counter Document", help="If selected, create specified counter document.  If not selected, no counter document is created for the document type.", dataType=FlyDataType.YesNo, entityType="D", printName="Create Counter", fieldLength=1)
	IsCreateCounter,
	//
	@FlyElement(name="Records created", dataType=FlyDataType.List, entityType="D", printName="Records created", fieldLength=1)
	IsCreated,
	//
	@FlyElement(name="Create Elements from Column or Parameters", description="Create Elements from Column Names or Process Parameters", dataType=FlyDataType.YesNo, entityType="D", printName="Create Elements from Column or Parameters", fieldLength=1)
	IsCreateElement,
	//
	@FlyElement(name="Create Move", dataType=FlyDataType.YesNo, entityType="D", printName="Create Move", fieldLength=1)
	IsCreateMove,
	//
	@FlyElement(name="Create New Batch", description="If selected a new batch is created", help="Note that the balance check does not check that individual batches are balanced.", dataType=FlyDataType.YesNo, entityType="D", printName="New Batch", fieldLength=1)
	IsCreateNewBatch,
	//
	@FlyElement(name="Create New Journal", description="If selected a new journal within the batch is created", help="Note that the balance check does not check that individual journals are balanced.", dataType=FlyDataType.YesNo, entityType="D", printName="New Journal", fieldLength=1)
	IsCreateNewJournal,
	//
	@FlyElement(name="Create if Not Exists", description="Create it if not exists", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Create if Not Exists", fieldLength=1)
	IsCreateNonExisting,
	//
	@FlyElement(name="Create Plan", description="Indicates whether planned orders will be generated by MRP", help="Indicates whether planned orders will be generated by MRP, if this flag is not just MRP generate a 'Create' action notice", dataType=FlyDataType.YesNo, entityType="EE01", printName="Create Plan", fieldLength=1)
	IsCreatePlan,
	//
	@FlyElement(name="Create Reversal", description="Indicates that reversal movement will be created, if disabled the original movement will be deleted.", dataType=FlyDataType.YesNo, entityType="D", printName="Create Reversal", fieldLength=1)
	IsCreateReversal,
	//
	@FlyElement(name="Create Single Order", description="For all shipments create one Order", dataType=FlyDataType.YesNo, entityType="D", printName="Create Single Order", fieldLength=1)
	IsCreateSingleOrder,
	//
	@FlyElement(name="IsCreateSupply", description="Create supply for product not available", help="Allow create Manufacturing Order or Requisition Material for product not available", dataType=FlyDataType.YesNo, entityType="EE03", printName="Create supply", fieldLength=1)
	IsCreateSupply,
	//
	@FlyElement(name="Credit Approved", description="Credit  has been approved", help="Credit Approved indicates if the credit approval was successful for Orders", dataType=FlyDataType.YesNo, entityType="D", printName="Credit Approved", fieldLength=1)
	IsCreditApproved,
	//
	@FlyElement(name="Is Critical Component", description="Indicate that a Manufacturing Order can not begin without have this component", help="Indicate that a Manufacturing Order can not begin without have this component", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is Critical Component", fieldLength=1)
	IsCritical,
	//
	@FlyElement(name="Current vendor", description="Use this Vendor for pricing and stock replenishment", help="The Current Vendor indicates if prices are used and Product is reordered from this vendor", dataType=FlyDataType.YesNo, entityType="D", printName="Current vendor", fieldLength=1)
	IsCurrentVendor,
	//
	@FlyElement(name="Customer", description="Indicates if this Business Partner is a Customer", help="The Customer checkbox indicates if this Business Partner is a customer.  If it is select additional fields will display which further define this customer.", dataType=FlyDataType.YesNo, entityType="D", printName="Customer", fieldLength=1)
	IsCustomer,
	//
	@FlyElement(name="Customization", description="The change is a customization of the data dictionary and can be applied after Migration", help="The migration 'resets' the system to the current/original setting.  If selected you can save the customization and re-apply it.  Please note that you need to check, if your customization has no negative side effect in the new release.", dataType=FlyDataType.YesNo, entityType="D", printName="Customization", fieldLength=1)
	IsCustomization,
	//
	@FlyElement(name="Day Slot", description="Resource has day slot availability", help="Resource is only available on certain days", dataType=FlyDataType.YesNo, entityType="D", printName="Day Slot", fieldLength=1)
	IsDateSlot,
	//
	@FlyElement(name="Decimal Point", description="The number notation has a decimal point (no decimal comma)", help="If selected, Numbers are printed with a decimal point '.' - otherwise with a decimal comma ','.  The thousand separator is the opposite.	If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.YesNo, entityType="D", printName="Decimal Point", fieldLength=1)
	IsDecimalPoint,
	//
	@FlyElement(name="Default", description="Default value", help="The Default Checkbox indicates if this record will be used as a default value.", dataType=FlyDataType.YesNo, entityType="D", printName="Default", fieldLength=1)
	IsDefault,
	//
	@FlyElement(name="Default Counter Document", description="The document type is the default counter document type", help="When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction.  Example: when generating a Sales Order, use this Sales Order document type.	This default can be overwritten by defining explicit counter document relationships.", dataType=FlyDataType.YesNo, entityType="D", printName="Default Counter Doc", fieldLength=1)
	IsDefaultCounterDoc,
	//
	@FlyElement(name="Delayed Capture", description="Charge after Shipment", help="Delayed Capture is required, if you ship products.  The first credit card transaction is the Authorization, the second is the actual transaction after the shipment of the product.", dataType=FlyDataType.YesNo, entityType="D", printName="Delayed Capture", fieldLength=1)
	IsDelayedCapture,
	//
	@FlyElement(name="Records deletable", description="Indicates if records can be deleted from the database", help="The Records Deletable checkbox indicates if a record can be deleted from the database.  If records cannot be deleted, you can only deselect the Active flag", dataType=FlyDataType.YesNo, entityType="D", printName="Records deletable", fieldLength=1)
	IsDeleteable,
	//
	@FlyElement(name="Delete Planned Purchase Orders", dataType=FlyDataType.YesNo, entityType="D", printName="Delete Planned Purchase Orders", fieldLength=1)
	IsDeletePlannedPO,
	//
	@FlyElement(name="Delete Unconfirmed Production", dataType=FlyDataType.YesNo, entityType="D", printName="Delete Unconfirmed Production", fieldLength=10)
	IsDeleteUnconfirmedProduction,
	//
	@FlyElement(name="Is Deleting unused Elements", description="Is Deleting unused Elements", dataType=FlyDataType.YesNo, entityType="D", printName="Is Deleting unused Elements", fieldLength=1)
	IsDeletingUnusedElement,
	//
	@FlyElement(name="Delivered", dataType=FlyDataType.YesNo, entityType="D", printName="Delivered", fieldLength=1)
	IsDelivered,
	//
	@FlyElement(name="Dependent Entities", description="Also check access in dependent entities", help="Also dependent entities are included.  Please be aware, that enabling this rule has severe consequences and that this is only wanted in some circumstances.	<p>Example Rule: 'Include Payment Term Immediate with Dependent Entities'	<br>Primary effect: users with this role can only select the payment term Immediate	<br>Secondary effect (dependent entities): users with this role can see only invoices/orders with the payment term immediate.", dataType=FlyDataType.YesNo, entityType="D", printName="Dependent Entities", fieldLength=1)
	IsDependentEntities,
	//
	@FlyElement(name="Deployed", description="Entity is deployed", dataType=FlyDataType.YesNo, entityType="D", printName="Deployed", fieldLength=1)
	IsDeployed,
	//
	@FlyElement(name="Is Depreciable", description="This asset CAN be depreciated", dataType=FlyDataType.NONE, entityType="D", printName="Is Depreciable", fieldLength=0)
	IsDepreciable,
	//
	@FlyElement(name="Depreciate", description="The asset will be depreciated", help="The asset is used internally and will be depreciated", dataType=FlyDataType.YesNo, entityType="D", printName="Depreciate", fieldLength=1)
	IsDepreciated,
	//
	@FlyElement(name="Descending", description="Sort your data using a SQL Desc Order By statement", dataType=FlyDataType.NONE, entityType="D", printName="Descending", fieldLength=0)
	IsDesc,
	//
	@FlyElement(name="Description Only", description="if true, the line is just description and no transaction", help="If a line is Description Only, e.g. Product Inventory is not corrected. No accounting transactions are created and the amount or totals are not included in the document.  This for including descriptional detail lines, e.g. for an Work Order.", dataType=FlyDataType.YesNo, entityType="D", printName="Description", fieldLength=1)
	IsDescription,
	//
	@FlyElement(name="Calculate Deviation (s)", description="Calculate Standard Deviation", help="The Standard Deviation (s) is the a measure of dispersion - used in combination with the Mean (µ)", dataType=FlyDataType.YesNo, entityType="D", printName="Deviation", fieldLength=1)
	IsDeviationCalc,
	//
	@FlyElement(name="Directed", description="Tells whether one 'sees' the other end of the relation from each end or just from the source", dataType=FlyDataType.YesNo, entityType="D", printName="Directed", fieldLength=1)
	IsDirected,
	//
	@FlyElement(name="Direct print", description="Print without dialog", help="The Direct Print checkbox indicates that this report will print without a print dialog box being displayed.", dataType=FlyDataType.YesNo, entityType="D", printName="Direct print", fieldLength=1)
	IsDirectPrint,
	//
	@FlyElement(name="IsDiscountAllowedOnTotal", dataType=FlyDataType.YesNo, entityType="D", printName="IsDiscountAllowedOnTotal", fieldLength=1)
	IsDiscountAllowedOnTotal,
	//
	@FlyElement(name="Correct tax for Discounts/Charges", description="Correct the tax for payment discount and charges", help="Payment discounts may require to correct the tax.  This primarily applicable in VAT systems.  If the original invoice had tax records, the payment discount, write-off, etc. is corrected by the tax. The calculation of the tax is prorated based on the invoice.", dataType=FlyDataType.YesNo, entityType="D", printName="Correct tax for Discounts/Charges", fieldLength=1)
	IsDiscountCorrectsTax,
	//
	@FlyElement(name="Discount calculated from Line Amounts", description="Payment Discount calculation does not include Taxes and Charges", help="If the payment discount is calculated from line amounts only, the tax and charge amounts are not included. This is e.g. business practice in the US.  If not selected the total invoice amount is used to calculate the payment discount.", dataType=FlyDataType.YesNo, entityType="D", printName="Discount calculated from Line Amounts", fieldLength=1)
	IsDiscountLineAmt,
	//
	@FlyElement(name="Discount Printed", description="Print Discount on Invoice and Order", help="The Discount Printed Checkbox indicates if the discount will be printed on the document.", dataType=FlyDataType.YesNo, entityType="D", printName="Discount Printed", fieldLength=1)
	IsDiscountPrinted,
	//
	@FlyElement(name="IsDiscountUptoLimitPrice", dataType=FlyDataType.YesNo, entityType="D", printName="IsDiscountUptoLimitPrice", fieldLength=1)
	IsDiscountUptoLimitPrice,
	//
	@FlyElement(name="Displayed", description="Determines, if this field is displayed", help="If the field is displayed, the field Display Logic will determine at runtime, if it is actually displayed", dataType=FlyDataType.YesNo, entityType="D", printName="Displayed", fieldLength=1)
	IsDisplayed,
	//
	@FlyElement(name="Displayed in Grid", description="Determines, if this field is displayed in grid view", help="Default whether this field is displayed when grid view is selected.", dataType=FlyDataType.NONE, entityType="D", printName="Displayed in Grid", fieldLength=0)
	IsDisplayedGrid,
	//
	@FlyElement(name="Display Identifier", description="Display the record identifier", help="Display the columns that are marked as part of the identifier for this table.  ", dataType=FlyDataType.NONE, entityType="D", printName="Display Identifier", fieldLength=0)
	IsDisplayIdentifier,
	//
	@FlyElement(name="Display Legend", description="Display chart legend", help="Toggles the display of the chart legend", dataType=FlyDataType.YesNo, entityType="D", printName="Display Legend", fieldLength=1)
	IsDisplayLegend,
	//
	@FlyElement(name="Disposed", description="The asset is disposed", help="The asset is no longer used and disposed", dataType=FlyDataType.YesNo, entityType="D", printName="Disposed", fieldLength=1)
	IsDisposed,
	//
	@FlyElement(name="ISDN", description="ISDN or modem line", help="The ISDN identifies a ISDN or Modem line number.", dataType=FlyDataType.String, entityType="D", printName="ISDN", fieldLength=40)
	ISDN,
	//
	@FlyElement(name="Document Controlled", description="Control account - If an account is controlled by a document, you cannot post manually to it", dataType=FlyDataType.YesNo, entityType="D", printName="Doc Controlled", fieldLength=1)
	IsDocControlled,
	//
	@FlyElement(name="Document is Number Controlled", description="The document has a document sequence", help="The Document Number Controlled checkbox indicates if this document type will have a sequence number.", dataType=FlyDataType.YesNo, entityType="D", printName="Doc Number Controlled", fieldLength=1)
	IsDocNoControlled,
	//
	@FlyElement(name="Is Document", description="This flag determinate if the record is a document", help="This flag is used to mark those tables that behave like documents and allow create automatically columns like: C_DocType_ID, DocumentNo, DateDoc, DocAction, DocStatus, Processed, IsApproved, Description", dataType=FlyDataType.YesNo, entityType="D", printName="Is Document", fieldLength=1)
	IsDocument,
	//
	@FlyElement(name="Document Level", description="Tax is calculated on document level (rather than line by line)", help="If the tax is calculated on document level, all lines with that tax rate are added before calculating the total tax for the document.	Otherwise the tax is calculated per line and then added.	Due to rounding, the tax amount can differ.", dataType=FlyDataType.YesNo, entityType="D", printName="Doc Level", fieldLength=1)
	IsDocumentLevel,
	//
	@FlyElement(name="Drop Shipment", description="Drop Shipments are sent from the Vendor directly to the Customer", help="Drop Shipments do not cause any Inventory reservations or movements as the Shipment is from the Vendor's inventory. The Shipment of the Vendor to the Customer must be confirmed.", dataType=FlyDataType.YesNo, entityType="D", printName="Drop Ship", fieldLength=1)
	IsDropShip,
	//
	@FlyElement(name="Due", description="Subscription Renewal is Due", dataType=FlyDataType.YesNo, entityType="D", printName="Due", fieldLength=1)
	IsDue,
	//
	@FlyElement(name="Fixed due date", description="Payment is due on a fixed date", help="The Fixed Due Date checkbox indicates if invoices using this payment tern will be due on a fixed day of the month.  ", dataType=FlyDataType.YesNo, entityType="D", printName="Fixed due date", fieldLength=1)
	IsDueFixed,
	//
	@FlyElement(name="EMail when Due", description="Send EMail when Request becomes due", help="Send EMail when Request becomes due", dataType=FlyDataType.YesNo, entityType="D", printName="EMail when Due", fieldLength=1)
	IsEMailWhenDue,
	//
	@FlyElement(name="EMail when Overdue", description="Send EMail when Request becomes overdue", help="Send EMail when Request becomes overdue", dataType=FlyDataType.YesNo, entityType="D", printName="EMail when Overdue", fieldLength=1)
	IsEMailWhenOverdue,
	//
	@FlyElement(name="Is Embedded", description="When checked of include tab is embedded", dataType=FlyDataType.YesNo, entityType="D", printName="Allows setting as an Embedded  Tab or Horizontal Tab", fieldLength=1)
	IsEmbedded,
	//
	@FlyElement(name="Employee", description="Indicates if  this Business Partner is an employee", help="The Employee checkbox indicates if this Business Partner is an Employee.  If it is selected, additional fields will display which further identify this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="Employee", fieldLength=1)
	IsEmployee,
	//
	@FlyElement(name="EMU Member", description="This currency is member if the European Monetary Union", help="The Emu Member checkbox is used to indicate if this currency is a member of the European Economic Union.", dataType=FlyDataType.YesNo, entityType="D", printName="EMU Member", fieldLength=1)
	IsEMUMember,
	//
	@FlyElement(name="Enable POS Product Lookup", description="Allows product lookup in order to show search key , name , quantity available , standard price and list price for selecting a product", dataType=FlyDataType.YesNo, entityType="D", printName="Enable POS Product Lookup", fieldLength=1)
	IsEnableProductLookup,
	//
	@FlyElement(name="Encrypted", description="Display or Storage is encrypted", help="Display encryption (in Window/Tab/Field) - all characters are displayed as '*' - in the database it is stored in clear text. You will not be able to report on these columns.<br>	Data storage encryption (in Table/Column) - data is stored encrypted in the database (dangerous!) and you will not be able to report on those columns. Independent from Display encryption.", dataType=FlyDataType.Button, entityType="D", printName="Encrypted", fieldLength=1)
	IsEncrypted,
	//
	@FlyElement(name="End Product", description="End Product of production", dataType=FlyDataType.YesNo, entityType="D", printName="End Product", fieldLength=1)
	IsEndProduct,
	//
	@FlyElement(name="Error", description="An Error occurred in the execution", dataType=FlyDataType.YesNo, entityType="D", printName="Error", fieldLength=1)
	IsError,
	//
	@FlyElement(name="Escalated", description="This request has been escalated", help="The Escalated checkbox indicates that this request has been escalated or raised in importance.", dataType=FlyDataType.YesNo, entityType="D", printName="Escalated", fieldLength=1)
	IsEscalated,
	//
	@FlyElement(name="The Euro Currency", description="This currency is the Euro", help="The Euro Currency checkbox is used to indicate if this currency is the Euro Currency.", dataType=FlyDataType.YesNo, entityType="D", printName="The Euro Currency", fieldLength=1)
	IsEuro,
	//
	@FlyElement(name="IsEventRequired", dataType=FlyDataType.NONE, entityType="D", printName="IsEventRequired", fieldLength=0)
	IsEventRequired,
	//
	@FlyElement(name="Exclude", description="Exclude access to the data - if not selected Include access to the data", help="If selected (excluded), the role cannot access the data specified.  If not selected (included), the role can ONLY access the data specified. Exclude items represent a negative list (i.e. you don't have access to the listed items). Include items represent a positive list (i.e. you only have access to the listed items).	<br>You would usually  not mix Exclude and Include. If you have one include rule in your list, you would only have access to that item anyway.", dataType=FlyDataType.YesNo, entityType="D", printName="Exclude", fieldLength=1)
	IsExclude,
	//
	@FlyElement(name="Exclude Auto Delivery", description="Exclude from automatic Delivery", help="The product is excluded from generating Shipments.  This allows manual creation of shipments for high demand items. If selected, you need to create the shipment manually.	But, the item is always included, when the delivery rule of the Order is Force (e.g. for POS). 	This allows finer granularity of the Delivery Rule Manual.", dataType=FlyDataType.YesNo, entityType="D", printName="Exclude Delivery", fieldLength=1)
	IsExcludeAutoDelivery,
	//
	@FlyElement(name="Is Exclude Kanban", description="Exclude the Kanban execution", dataType=FlyDataType.YesNo, entityType="D", printName="Is Exclude Kanban", fieldLength=1)
	IsExcludeKanban,
	//
	@FlyElement(name="Is executed query by default", description="Is executed query by default", help="Allow define if a Browser is execute by default", dataType=FlyDataType.YesNo, entityType="EE07", printName="Is executed query by default", fieldLength=1)
	IsExecutedQueryByDefault,
	//
	@FlyElement(name="Explicit Cost Adjustment", description="Post the cost adjustment explicitly", help="If selected, landed costs are posted to the account in the line and then this posting is reversed by the postings to the cost adjustment accounts.  If not selected, it is directly posted to the cost adjustment accounts.", dataType=FlyDataType.YesNo, entityType="D", printName="Explicit Cost Adjustment", fieldLength=1)
	IsExplicitCostAdjustment,
	//
	@FlyElement(name="Export XML Backup", dataType=FlyDataType.YesNo, entityType="D", printName="Export XML Backup", fieldLength=1)
	IsExportXMLBackup,
	//
	@FlyElement(name="Fail if Build Differ", dataType=FlyDataType.YesNo, entityType="D", printName="Fail if Build Differ", fieldLength=1)
	IsFailOnBuildDiffer,
	//
	@FlyElement(name="Fail on Missing Model Validator", dataType=FlyDataType.YesNo, entityType="D", printName="Fail on Missing Model Validator", fieldLength=1)
	IsFailOnMissingModelValidator,
	//
	@FlyElement(name="Field Only", description="Label is not displayed", help="The Field Only checkbox indicates that the column will display without a label.", dataType=FlyDataType.YesNo, entityType="D", printName="Field Only", fieldLength=1)
	IsFieldOnly,
	//
	@FlyElement(name="Fill Shape", description="Fill the shape with the color selected", dataType=FlyDataType.YesNo, entityType="D", printName="Fill Shape", fieldLength=1)
	IsFilledRectangle,
	//
	@FlyElement(name="Final Close", description="Entries with Final Close cannot be re-opened", dataType=FlyDataType.YesNo, entityType="D", printName="Final Close", fieldLength=1)
	IsFinalClose,
	//
	@FlyElement(name="First name only", description="Print only the first name in greetings", help="The First Name Only checkbox indicates that only the first name of this contact should print in greetings.", dataType=FlyDataType.YesNo, entityType="D", printName="First name only", fieldLength=1)
	IsFirstNameOnly,
	//
	@FlyElement(name="Is a Fixed Asset", description="Indicates whether this group will be a Fixed Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Is a Fixed Asset ?", fieldLength=1)
	IsFixedAsset,
	//
	@FlyElement(name="Is Fixed Asset Invoice", description="Indicates if an Invoice is for a Fixed Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Is Fixed Asset Invoice", fieldLength=1)
	IsFixedAssetInvoice,
	//
	@FlyElement(name="Fixed Width", description="Column has a fixed width", help="The Column has a fixed width, independent from the content", dataType=FlyDataType.YesNo, entityType="D", printName="Fixed Width", fieldLength=1)
	IsFixedWidth,
	//
	@FlyElement(name="For all distribution", description="This reward is for all distribution", dataType=FlyDataType.YesNo, entityType="D", printName="For all distribution", fieldLength=1)
	IsForAllDistribution,
	//
	@FlyElement(name="Force", description="Force Operation", dataType=FlyDataType.YesNo, entityType="D", printName="Force", fieldLength=1)
	IsForce,
	//
	@FlyElement(name="Foreign Currency Account", description="Balances in foreign currency accounts are held in the nominated currency", help="Balances in foreign currency accounts are held in the nominated currency and translated to functional currency", dataType=FlyDataType.YesNo, entityType="D", printName="Foreign Currency", fieldLength=1)
	IsForeignCurrency,
	//
	@FlyElement(name="Form", description="If Selected, a Form is printed, if not selected a columnar List report", help="A form has individual elements with layout information (example: invoice, check)	<br>	A columnar list report has individual columns (example: list of invoices)", dataType=FlyDataType.YesNo, entityType="D", printName="Form", fieldLength=1)
	IsForm,
	//
	@FlyElement(name="Are you a former employee?", description="Are you a former employee?", help="Are you a former employee?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Are you a former employee?", fieldLength=0)
	IsFormerEmployee,
	//
	@FlyElement(name="Full BP Access", description="The user/contact has full access to Business Partner information and resources", help="If selected, the user has full access to the Business Partner (BP) information (Business Documents like Orders, Invoices - Requests) or resources (Assets, Downloads). If you deselect it, the user has no access rights unless, you explicitly grant it in tab 'BP Access'", dataType=FlyDataType.YesNo, entityType="D", printName="Full BP Access", fieldLength=1)
	IsFullBPAccess,
	//
	@FlyElement(name="Fully depreciated", description="The asset is fully depreciated", help="The asset costs are fully amortized.", dataType=FlyDataType.YesNo, entityType="D", printName="Fully depreciated", fieldLength=1)
	IsFullyDepreciated,
	//
	@FlyElement(name="Fully Qualified", description="This account is fully qualified", help="The Fully Qualified check box indicates that all required elements for an account combination are present.", dataType=FlyDataType.YesNo, entityType="D", printName="Fully Qualified", fieldLength=1)
	IsFullyQualified,
	//
	@FlyElement(name="Generated", description="This Line is generated", help="The Generated checkbox identifies a journal line that was generated from a source document.  Lines could also be entered manually or imported.", dataType=FlyDataType.YesNo, entityType="D", printName="Generated", fieldLength=1)
	IsGenerated,
	//
	@FlyElement(name="Generated Draft", dataType=FlyDataType.YesNo, entityType="D", printName="Generated Draft", fieldLength=1)
	IsGeneratedDraft,
	//
	@FlyElement(name="GL Budget Dimension", description="Include GL Budget as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="GL Budget Dimension", fieldLength=1)
	IsGLBudgetDim,
	//
	@FlyElement(name="Group by", description="After a group change, totals, etc. are printed", help="Grouping allows to print sub-totals. If a group changes, the totals are printed.  Group by columns need to be included in the sort order.", dataType=FlyDataType.YesNo, entityType="D", printName="Groupby", fieldLength=1)
	IsGroupBy,
	//
	@FlyElement(name="SQL Group Function", description="This function will generate a Group By Clause", help="The SQL Group Function checkbox indicates that this function will generate a Group by Clause in the resulting SQL.", dataType=FlyDataType.YesNo, entityType="D", printName="SQL Group Function", fieldLength=1)
	IsGroupFunction,
	//
	@FlyElement(name="Guarantee Date", description="Product has Guarantee or Expiry Date", help="For individual products, you can define a guarantee or expiry date", dataType=FlyDataType.YesNo, entityType="D", printName="Guarantee Date", fieldLength=1)
	IsGuaranteeDate,
	//
	@FlyElement(name="Mandatory Guarantee Date", description="The entry of a Guarantee Date is mandatory when creating a Product Instance", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Guarantee Date", fieldLength=1)
	IsGuaranteeDateMandatory,
	//
	@FlyElement(name="Half Day Leave Allowed ?", description="Half Day Leave Allowed ?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Half Day Leave Allowed ?", fieldLength=0)
	IsHalfDayLeaveAllowed,
	//
	@FlyElement(name="Has fixed Workgroup?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Has fixed Workgroup?", fieldLength=0)
	IsHasFixedWorkgroup,
	//
	@FlyElement(name="Heading only", description="Field without Column - Only label is displayed", help="The Heading Only checkbox indicates if just the label will display on the screen", dataType=FlyDataType.YesNo, entityType="D", printName="Heading only", fieldLength=1)
	IsHeading,
	//
	@FlyElement(name="One Line Only", description="If selected, only one line is printed", help="If the column has a width restriction, the text is broken into multiple lines. If One Line is selected, only the first line is printed.", dataType=FlyDataType.YesNo, entityType="D", printName="One Line", fieldLength=1)
	IsHeightOneLine,
	//
	@FlyElement(name="High Volume", description="Use Search instead of Pick list", help="The High Volume Checkbox indicates if a search screen will display as opposed to a pick list for selecting records from this table.", dataType=FlyDataType.YesNo, entityType="D", printName="High Volume", fieldLength=1)
	IsHighVolume,
	//
	@FlyElement(name="HR Approved", description="HR Approved", help="The Approved checkbox indicates if this document was approved by Human Resource.", dataType=FlyDataType.YesNo, entityType="EE02", printName="HR Approved", fieldLength=0)
	IsHRApproved,
	//
	@FlyElement(name="HTML", description="Text has HTML tags", dataType=FlyDataType.YesNo, entityType="D", printName="HTML", fieldLength=1)
	IsHtml,
	//
	@FlyElement(name="Identifier", description="This column is part of the record identifier", help="The Identifier checkbox indicates that this column is part of the identifier or key for this table.  ", dataType=FlyDataType.YesNo, entityType="D", printName="Identifier", fieldLength=1)
	IsIdentifier,
	//
	@FlyElement(name="Ignore Default Payroll", description="Ignore Default Payroll for Employee", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Ignore Default Payroll", fieldLength=1)
	IsIgnoreDefaultPayroll,
	//
	@FlyElement(name="Ignore Migration", description="Ignore this record in log migration", dataType=FlyDataType.YesNo, entityType="D", printName="Ignore Migration", fieldLength=1)
	IsIgnoreMigration,
	//
	@FlyElement(name="Ignore Processing Time", description="Do not include processing time for the DateNextRun calculation", help="When this is selected, the previous DateNextRun is always use as the source for the next DateNextRun calculation.", dataType=FlyDataType.YesNo, entityType="D", printName="Ignore Proccessing Time", fieldLength=1)
	IsIgnoreProcessingTime,
	//
	@FlyElement(name="Image Field", description="The image is retrieved from the data column", help="The Image URL is retrieved from the data column", dataType=FlyDataType.YesNo, entityType="D", printName="Image Field", fieldLength=1)
	IsImageField,
	//
	@FlyElement(name="Import only if No Errors", description="Only start the import, if there are no validation Errors", dataType=FlyDataType.NONE, entityType="D", printName="Import No Errors", fieldLength=0)
	IsImportOnlyNoErrors,
	//
	@FlyElement(name="Import Limit Price", dataType=FlyDataType.NONE, entityType="D", printName="Import Limit Price", fieldLength=0)
	IsImportPriceLimit,
	//
	@FlyElement(name="Import List price", dataType=FlyDataType.NONE, entityType="D", printName="Import List price", fieldLength=0)
	IsImportPriceList,
	//
	@FlyElement(name="Import Standard Price", dataType=FlyDataType.NONE, entityType="D", printName="Import Standard Price", fieldLength=0)
	IsImportPriceStd,
	//
	@FlyElement(name="Included", description="Defines whether this content / template is included into another one", help="Templates can be independent or included. Included Templates are also called subtemplates", dataType=FlyDataType.YesNo, entityType="D", printName="Included", fieldLength=1)
	IsInclude,
	//
	@FlyElement(name="Include Bank Balances", dataType=FlyDataType.NONE, entityType="EE06", printName="IsIncludeBankBalances", fieldLength=0)
	IsIncludeBankBalances,
	//
	@FlyElement(name="Include Cash Flow (manual)						records					", dataType=FlyDataType.NONE, entityType="EE06", printName="IsIncludeCashFlows", fieldLength=0)
	IsIncludeCashFlows,
	//
	@FlyElement(name="Include Invoices", dataType=FlyDataType.NONE, entityType="EE06", printName="IsIncludeInvoices", fieldLength=0)
	IsIncludeInvoices,
	//
	@FlyElement(name="IsIncludeNotAvailable", description="The product not available lines are include in the shipment", dataType=FlyDataType.YesNo, entityType="EE03", printName="Add product not available lines", fieldLength=1)
	IsIncludeNotAvailable,
	//
	@FlyElement(name="Include Nulls in Activity", description="Include nulls in the selection of the activity", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Activity", fieldLength=1)
	IsIncludeNullsActivity,
	//
	@FlyElement(name="Include Nulls in BPartner", description="Include nulls in the selection of the business partner", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in BPartner", fieldLength=1)
	IsIncludeNullsBPartner,
	//
	@FlyElement(name="Include Nulls in Campaign", description="Include nulls in the selection of the campaign", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Campaign", fieldLength=1)
	IsIncludeNullsCampaign,
	//
	@FlyElement(name="Include Nulls in Account", description="Include nulls in the selection of the account", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Account", fieldLength=1)
	IsIncludeNullsElementValue,
	//
	@FlyElement(name="Include Nulls in Location", description="Include nulls in the selection of the location", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Location", fieldLength=1)
	IsIncludeNullsLocation,
	//
	@FlyElement(name="Include Nulls in Org", description="Include nulls in the selection of the organization", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Org", fieldLength=1)
	IsIncludeNullsOrg,
	//
	@FlyElement(name="Include Nulls in Org Trx", description="Include nulls in the selection of the organization transaction", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Org Trx", fieldLength=1)
	IsIncludeNullsOrgTrx,
	//
	@FlyElement(name="Include Nulls in Product", description="Include nulls in the selection of the product", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Product", fieldLength=1)
	IsIncludeNullsProduct,
	//
	@FlyElement(name="Include Nulls in Project", description="Include nulls in the selection of the project", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Project", fieldLength=1)
	IsIncludeNullsProject,
	//
	@FlyElement(name="Include Nulls in Sales Region", description="Include nulls in the selection of the sales region", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Sales Region", fieldLength=1)
	IsIncludeNullsSalesRegion,
	//
	@FlyElement(name="Include Nulls in User 1", description="Include nulls in the selection of the user 1", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User 1", fieldLength=1)
	IsIncludeNullsUser1,
	//
	@FlyElement(name="Include Nulls in User 2", description="Include nulls in the selection of the user 2", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User 2", fieldLength=1)
	IsIncludeNullsUser2,
	//
	@FlyElement(name="Include Nulls in User 3", description="Include nulls in the selection of the user 3", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User 3", fieldLength=1)
	IsIncludeNullsUser3,
	//
	@FlyElement(name="Include Nulls in User 4", description="Include nulls in the selection of the user 4", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User 4", fieldLength=1)
	IsIncludeNullsUser4,
	//
	@FlyElement(name="Include Nulls in User Element 1", description="Include nulls in the selection of the user element 1", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User Element 1", fieldLength=1)
	IsIncludeNullsUserElement1,
	//
	@FlyElement(name="Include Nulls in User Element 2", description="Include nulls in the selection of the user element 2", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User Element 2", fieldLength=1)
	IsIncludeNullsUserElement2,
	//
	@FlyElement(name="Include Nulls in User List 1", description="Include nulls in the selection of the User List 1", dataType=FlyDataType.NONE, entityType="D", printName="Include Nulls in User List 1", fieldLength=0)
	IsIncludeNullsUserList1,
	//
	@FlyElement(name="Include Nulls in User List 2", description="Include nulls in the selection of the User List 2", dataType=FlyDataType.NONE, entityType="D", printName="Include Nulls in User List 2", fieldLength=0)
	IsIncludeNullsUserList2,
	//
	@FlyElement(name="Include Nulls in User List 3", description="Include nulls in the selection of the User List 3", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User List 3", fieldLength=1)
	IsIncludeNullsUserList3,
	//
	@FlyElement(name="Include Nulls in User List 4", description="Include nulls in the selection of the User List 4", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User List 4", fieldLength=1)
	IsIncludeNullsUserList4,
	//
	@FlyElement(name="Include Orders", dataType=FlyDataType.NONE, entityType="EE06", printName="IsIncludeOrders", fieldLength=0)
	IsIncludeOrders,
	//
	@FlyElement(name="Include Payments", description="Include payments in the aging report", dataType=FlyDataType.NONE, entityType="D", printName="Include Payments", fieldLength=0)
	IsIncludePayments,
	//
	@FlyElement(name="Indexed", description="Index the document for the internal search engine", help="For cross document search, the document can be indexed for faster search (Container, Document Type, Request Type)", dataType=FlyDataType.YesNo, entityType="D", printName="Indexed", fieldLength=1)
	IsIndexed,
	//
	@FlyElement(name="In Dispute", description="Document is in dispute", help="The document is in dispute. Use Requests to track details.", dataType=FlyDataType.YesNo, entityType="D", printName="In Dispute", fieldLength=1)
	IsInDispute,
	//
	@FlyElement(name="Is Information Only", description="When a Parameter is Information Only", dataType=FlyDataType.YesNo, entityType="D", printName="Is Information Only", fieldLength=1)
	IsInfoOnly,
	//
	@FlyElement(name="Send Info", description="Send informational messages and copies", dataType=FlyDataType.YesNo, entityType="D", printName="Send Info", fieldLength=1)
	IsInfoSent,
	//
	@FlyElement(name="Accounting Tab", description="This Tab contains accounting information", help="The Accounting Tab checkbox indicates if this window contains accounting information. To display accounting information, enable this in Tools>Preference and Role.", dataType=FlyDataType.YesNo, entityType="D", printName="Accounting Tab", fieldLength=1)
	IsInfoTab,
	//
	@FlyElement(name="Is In Payroll", description="Defined if any User Contact will be used for Calculate Payroll", dataType=FlyDataType.YesNo, entityType="EE02", printName="Is In Payroll", fieldLength=1)
	IsInPayroll,
	//
	@FlyElement(name="In Possession", description="The asset is in the possession of the organization", help="Assets which are not in possession are e.g. at Customer site and may or may not be owned by the company.", dataType=FlyDataType.YesNo, entityType="D", printName="In Possession", fieldLength=1)
	IsInPosession,
	//
	@FlyElement(name="In Production", description="The system is in production", dataType=FlyDataType.YesNo, entityType="D", printName="In Production", fieldLength=1)
	IsInProduction,
	//
	@FlyElement(name="Insert Record", description="The user can insert a new Record", help="If not selected, the user cannot create a new Record.  This is automatically disabled, if the Tab is Read Only.", dataType=FlyDataType.YesNo, entityType="D", printName="Insert Record", fieldLength=1)
	IsInsertRecord,
	//
	@FlyElement(name="Instance Attribute", description="The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date)", help="If selected, the individual instance of the product has this attribute - like the individual Serial or Lot Numbers or  Guarantee Date of a product instance.  If not selected, all instances of the product share the attribute (e.g. color=green).", dataType=FlyDataType.YesNo, entityType="D", printName="Instance Attribute", fieldLength=1)
	IsInstanceAttribute,
	//
	@FlyElement(name="Internal", description="Internal Organization", dataType=FlyDataType.YesNo, entityType="D", printName="Internal", fieldLength=1)
	IsInternal,
	//
	@FlyElement(name="Internal User", description="Is just for use internal", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Internal User", fieldLength=1)
	IsInternalUser,
	//
	@FlyElement(name="Interview Over", description="Interview Over Indicates whether an applicant will be interviewed", help="The Interview Over Indicates whether an applicant will be interviewed", dataType=FlyDataType.YesNo, entityType="EE02", printName="Interview Over", fieldLength=0)
	IsInterviewOver,
	//
	@FlyElement(name="In Transit", description="Movement is in transit", help="Material Movement is in transit - shipped, but not received.	The transaction is completed, if confirmed.", dataType=FlyDataType.YesNo, entityType="D", printName="In Transit", fieldLength=1)
	IsInTransit,
	//
	@FlyElement(name="Invited Vendors Only", description="Only invited vendors can respond to an RfQ", help="The Request for Quotation is only visible to the invited vendors", dataType=FlyDataType.YesNo, entityType="D", printName="Invited Vendors", fieldLength=1)
	IsInvitedVendorsOnly,
	//
	@FlyElement(name="Invoiced", description="Is this invoiced?", help="If selected, invoices are created", dataType=FlyDataType.YesNo, entityType="D", printName="Invoiced", fieldLength=1)
	IsInvoiced,
	//
	@FlyElement(name="Print detail records on invoice ", description="Print detail BOM elements on the invoice", help="The Print Details on Invoice indicates that the BOM element products will print on the Invoice as opposed to this product.", dataType=FlyDataType.YesNo, entityType="D", printName="Print detail on invoice", fieldLength=1)
	IsInvoicePrintDetails,
	//
	@FlyElement(name="Is Issue", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is Issue", fieldLength=1)
	IsIssue,
	//
	@FlyElement(name="Just Migrated", description="Value set by Migration for post-Migration tasks.", dataType=FlyDataType.YesNo, entityType="D", printName="Just Migrated", fieldLength=1)
	IsJustMigrated,
	//
	@FlyElement(name="Kanban controlled", description="This part is Kanban controlled", dataType=FlyDataType.YesNo, entityType="D", printName="Kanban controlled", fieldLength=1)
	IsKanban,
	//
	@FlyElement(name="Key column", description="This column is the key in this table", help="The key column must also be display sequence 0 in the field definition and may be hidden.", dataType=FlyDataType.YesNo, entityType="D", printName="Key column", fieldLength=1)
	IsKey,
	//
	@FlyElement(name="Landscape", description="Landscape orientation", dataType=FlyDataType.YesNo, entityType="D", printName="Landscape", fieldLength=1)
	IsLandscape,
	//
	@FlyElement(name="Is Leave Repeated?", description="Is Leave Repeated?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Is Leave Repeated?", fieldLength=0)
	IsLeaveRepeated,
	//
	@FlyElement(name="Leaves forward to next year", description="Leaves forward to next year", dataType=FlyDataType.YesNo, entityType="EE02", printName="Leaves forward to next year", fieldLength=0)
	IsLeavesForwardToNextYear,
	//
	@FlyElement(name="List Invoices", description="Include List of Invoices", dataType=FlyDataType.YesNo, entityType="D", printName="List Invoices", fieldLength=1)
	IsListInvoices,
	//
	@FlyElement(name="Location From Dimension", description="Include Location From as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Location From Dimension", fieldLength=1)
	IsLocFromDim,
	//
	@FlyElement(name="Location To  Dimension", description="Include Location To as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Location To Dimension", fieldLength=1)
	IsLocToDim,
	//
	@FlyElement(name="Logging", description="Do we need to log the banner impressions and clicks? (needs much performance)", help="As of performance we should only log banners if really necessary, as this takes a lot of performance", dataType=FlyDataType.YesNo, entityType="D", printName="Logging", fieldLength=1)
	IsLogged,
	//
	@FlyElement(name="Login User", help="Define if the user can login", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Login User", fieldLength=1)
	IsLoginUser,
	//
	@FlyElement(name="Lot", description="The product instances have a Lot Number", help="For individual products, you can define Lot Numbers", dataType=FlyDataType.YesNo, entityType="D", printName="Lot", fieldLength=1)
	IsLot,
	//
	@FlyElement(name="Mandatory Lot", description="The entry of Lot info is mandatory when creating a Product Instance", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Lot", fieldLength=1)
	IsLotMandatory,
	//
	@FlyElement(name="Manager", description="Defines employee as manager", help="The Manager defines employee as manager", dataType=FlyDataType.YesNo, entityType="EE02", printName="Manager", fieldLength=0)
	IsManager,
	//
	@FlyElement(name="Manager Approved", description="Manager Approved indicates if this document was approved by Manager.", help="The Manager Approved checkbox indicates if this document was approved by Manager.", dataType=FlyDataType.YesNo, entityType="EE02", printName="Manager Approved", fieldLength=0)
	IsManagerApproved,
	//
	@FlyElement(name="Mandatory", description="Data entry is required in this column", help="The field must have a value for the record to be saved to the database.", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory", fieldLength=1)
	IsMandatory,
	//
	@FlyElement(name="Mandatory Promotion Line", description="Order must have this promotion line", help="The mandatory promotion check box indicates that the order must have this promotion line", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Promotion Line", fieldLength=1)
	IsMandatoryPL,
	//
	@FlyElement(name="Mandatory Withholding", description="Monies must be withheld", help="The Mandatory Withholding checkbox indicates that monies must be withheld from this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Withholding", fieldLength=1)
	IsMandatoryWithholding,
	//
	@FlyElement(name="Manual", description="This is a manual process", help="The Manual check box indicates if the process will done manually.", dataType=FlyDataType.YesNo, entityType="D", printName="Manual", fieldLength=1)
	IsManual,
	//
	@FlyElement(name="Manufactured", description="This product is manufactured", dataType=FlyDataType.YesNo, entityType="D", printName="Manufactured", fieldLength=1)
	IsManufactured,
	//
	@FlyElement(name="Is Manufacturer", description="Indicate role of this Business partner as Manufacturer", dataType=FlyDataType.YesNo, entityType="D", printName="Is Manufacturer", fieldLength=1)
	IsManufacturer,
	//
	@FlyElement(name="Manufacturing Resource", dataType=FlyDataType.YesNo, entityType="EE01", printName="Manufacturing Resource", fieldLength=1)
	IsManufacturingResource,
	//
	@FlyElement(name="Calculate Maximum (?)", description="Calculate the maximum amount", help="Calculate the Maximum (¿)  of the data if the field is numeric, otherwise maximum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Calc Max", fieldLength=1)
	IsMaxCalc,
	//
	@FlyElement(name="Menu Assets", description="Show Menu Assets", dataType=FlyDataType.YesNo, entityType="D", printName="Assets", fieldLength=1)
	IsMenuAssets,
	//
	@FlyElement(name="Menu Contact", description="Show Menu Contact", dataType=FlyDataType.YesNo, entityType="D", printName="Contact", fieldLength=1)
	IsMenuContact,
	//
	@FlyElement(name="Menu Interests", description="Show Menu Interests", dataType=FlyDataType.YesNo, entityType="D", printName="Interests", fieldLength=1)
	IsMenuInterests,
	//
	@FlyElement(name="Menu Invoices", description="Show Menu Invoices", dataType=FlyDataType.YesNo, entityType="D", printName="Invoices", fieldLength=1)
	IsMenuInvoices,
	//
	@FlyElement(name="Menu Orders", description="Show Menu Orders", dataType=FlyDataType.YesNo, entityType="D", printName="Orders", fieldLength=1)
	IsMenuOrders,
	//
	@FlyElement(name="Menu Payments", description="Show Menu Payments", dataType=FlyDataType.YesNo, entityType="D", printName="Payments", fieldLength=1)
	IsMenuPayments,
	//
	@FlyElement(name="Menu Registrations", description="Show Menu Registrations", dataType=FlyDataType.YesNo, entityType="D", printName="Registrations", fieldLength=1)
	IsMenuRegistrations,
	//
	@FlyElement(name="Menu Requests", description="Show Menu Requests", dataType=FlyDataType.YesNo, entityType="D", printName="Requests", fieldLength=1)
	IsMenuRequests,
	//
	@FlyElement(name="Menu RfQs", description="Show Menu RfQs", dataType=FlyDataType.YesNo, entityType="D", printName="RfQs", fieldLength=1)
	IsMenuRfQs,
	//
	@FlyElement(name="Menu Shipments", description="Show Menu Shipments", dataType=FlyDataType.YesNo, entityType="D", printName="Shipments", fieldLength=1)
	IsMenuShipments,
	//
	@FlyElement(name="Is Milestone", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is Milestone", fieldLength=1)
	IsMilestone,
	//
	@FlyElement(name="Calculate Minimum (¿)", description="Calculate the minimum amount", help="Calculate the Minimum (¿) of the data if the field is numeric, otherwise minimum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Calc Min", fieldLength=1)
	IsMinCalc,
	//
	@FlyElement(name="Modified", description="The record is modified", help="Indication that the record is modified", dataType=FlyDataType.YesNo, entityType="D", printName="Modified", fieldLength=1)
	IsModified,
	//
	@FlyElement(name="Modify Price", description="Allow modifying the price", help="Allow modifying the price for products with a non zero price", dataType=FlyDataType.YesNo, entityType="D", printName="Modify Price", fieldLength=1)
	IsModifyPrice,
	//
	@FlyElement(name="Is MPS", description="Indicates if this product is part of the master production schedule", help="The independent demand products such as end products or spare parts, should be part of the MPS.	<br>	<br>	This flag is used to segregate the products to be used in reports and inquiries of the MPS and allows to calculate the MPS by the execution of a selective MRP process.", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is MPS", fieldLength=1)
	IsMPS,
	//
	@FlyElement(name="Multi Line Header", description="Print column headers on mutliple lines if necessary.", help="If selected, column header text will wrap onto the next line -- otherwise the text will be truncated.", dataType=FlyDataType.YesNo, entityType="D", printName="Multi Line Header", fieldLength=1)
	IsMultiLineHeader,
	//
	@FlyElement(name="Multi Lingual Documents", description="Documents are Multi Lingual", help="If selected, you enable multi lingual documents and need to maintain translations for entities used in documents (examples: Products, Payment Terms, ...).<br>	Please note, that the base language is always English.", dataType=FlyDataType.YesNo, entityType="D", printName="Multi Lingual Documents", fieldLength=1)
	IsMultiLingualDocument,
	//
	@FlyElement(name="Multi Row Only", description="This applies to Multi-Row view only", dataType=FlyDataType.YesNo, entityType="D", printName="Multi Row Only", fieldLength=1)
	IsMultiRowOnly,
	//
	@FlyElement(name="Natural Account", description="The primary natural account", help="The natural account is often based on (industry specific) chart of accounts", dataType=FlyDataType.YesNo, entityType="D", printName="Natural Account", fieldLength=1)
	IsNaturalAccount,
	//
	@FlyElement(name="Net Price", description="Net Price including all discounts", help="If price is set as 'Net Price' no further discounts will be applied.", dataType=FlyDataType.YesNo, entityType="D", printName="Net Price", fieldLength=1)
	IsNetPrice,
	//
	@FlyElement(name="New value null", description="The new value is null.", dataType=FlyDataType.NONE, entityType="D", printName="New value null", fieldLength=0)
	IsNewNull,
	//
	@FlyElement(name="Uses News", description="Template or container uses news channels", help="This content (container or template) uses news channels", dataType=FlyDataType.YesNo, entityType="D", printName="Uses News", fieldLength=1)
	IsNews,
	//
	@FlyElement(name="Next Business Day", description="Payment due on the next business day", help="The Next Business Day checkbox indicates that payment is due on the next business day after invoice or delivery.", dataType=FlyDataType.YesNo, entityType="D", printName="Next Business Day", fieldLength=1)
	IsNextBusinessDay,
	//
	@FlyElement(name="Next Line", description="Print item on next line", help="If not selected, the item is printed on the same line", dataType=FlyDataType.YesNo, entityType="D", printName="Next Line", fieldLength=1)
	IsNextLine,
	//
	@FlyElement(name="Next Page", description="The column is printed on the next page", help="Before printing this column, there will be a page break.", dataType=FlyDataType.YesNo, entityType="D", printName="Next Page", fieldLength=1)
	IsNextPage,
	//
	@FlyElement(name="No Save In History If Is Null", dataType=FlyDataType.YesNo, entityType="ECA02", printName="No Save In History If Is Null", fieldLength=1)
	IsNotSaveInHistoryIfNull,
	//
	@FlyElement(name="ISO Currency Code", description="Three letter ISO 4217 Code of the Currency", help="For details - http://www.unece.org/trade/rec/rec09en.htm", dataType=FlyDataType.String, entityType="D", printName="ISO Currency", fieldLength=3)
	ISO_Code,
	//
	@FlyElement(name="ISO Currency To Code", description="Three letter ISO 4217 Code of the To Currency", help="For details - http://www.unece.org/trade/rec/rec09en.htm", dataType=FlyDataType.String, entityType="D", printName="ISO Currency To", fieldLength=3)
	ISO_Code_To,
	//
	@FlyElement(name="Offer Quantity", description="This quantity is used in the Offer to the Customer", help="When multiple quantities are used in an Request for Quotation, the selected Quantity is used for generating the offer.  If none selected the lowest number is used.", dataType=FlyDataType.YesNo, entityType="D", printName="Offer Qty", fieldLength=1)
	IsOfferQty,
	//
	@FlyElement(name="Old value null", description="The old value was null.", dataType=FlyDataType.NONE, entityType="D", printName="Old value null", fieldLength=0)
	IsOldNull,
	//
	@FlyElement(name="One Asset Per UOM", description="Create one asset per UOM", help="If selected, one asset per UOM is created, otherwise one asset with the quantity received/shipped.  If you have multiple lines, one asset is created per line.", dataType=FlyDataType.YesNo, entityType="D", printName="One Asset Per UOM", fieldLength=1)
	IsOneAssetPerUOM,
	//
	@FlyElement(name="One time transaction", dataType=FlyDataType.YesNo, entityType="D", printName="One time transaction", fieldLength=1)
	IsOneTime,
	//
	@FlyElement(name="Online Access", description="Can be accessed online ", help="The Online Access check box indicates if the application can be accessed via the web. ", dataType=FlyDataType.YesNo, entityType="D", printName="Online Access", fieldLength=1)
	IsOnline,
	//
	@FlyElement(name="Only If BP has Balance", description="Include only if Business Partner has outstanding Balance", dataType=FlyDataType.NONE, entityType="D", printName="Only If BP has Balance", fieldLength=0)
	IsOnlyIfBPBalance,
	//
	@FlyElement(name="Open Status", description="The status is closed", help="This allows to have the three generat situations of 'not open' - 'open' - 'closed'", dataType=FlyDataType.YesNo, entityType="D", printName="Open", fieldLength=1)
	IsOpen,
	//
	@FlyElement(name="Open By Default", dataType=FlyDataType.YesNo, entityType="D", printName="Open By Default", fieldLength=1)
	IsOpenByDefault,
	//
	@FlyElement(name="Order by", description="Include in sort order", help="The records are ordered by the value of this column. If a column is used for grouping, it needs to be included in the sort order as well.", dataType=FlyDataType.YesNo, entityType="D", printName="Order by", fieldLength=1)
	IsOrderBy,
	//
	@FlyElement(name="Order By Value", description="Order list using the value column instead of the name column", help="Order list using the value column instead of the name column", dataType=FlyDataType.YesNo, entityType="D", printName="Order By Value", fieldLength=1)
	IsOrderByValue,
	//
	@FlyElement(name="OrgTrx Dimension", description="Include OrgTrx as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="OrgTrx Dimension", fieldLength=1)
	IsOrgTrxDim,
	//
	@FlyElement(name="Over Time Applicable", description="Is over time applicable to this Shift?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Over Time Applicable", fieldLength=0)
	IsOverTimeApplicable,
	//
	@FlyElement(name="Over/Under Payment", description="Over-Payment (unallocated) or Under-Payment (partial payment)", help="Overpayments (negative) are unallocated amounts and allow you to receive money for more than the particular invoice. 	Underpayments (positive) is a partial payment for the invoice. You do not write off the unpaid amount.", dataType=FlyDataType.YesNo, entityType="D", printName="Over/Under Payment", fieldLength=1)
	IsOverUnderPayment,
	//
	@FlyElement(name="Overwrite Date on Complete", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Date on Complete", fieldLength=1)
	IsOverwriteDateOnComplete,
	//
	@FlyElement(name="Overwrite Sequence on Complete", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Sequence on Complete", fieldLength=1)
	IsOverwriteSeqOnComplete,
	//
	@FlyElement(name="Own Bank", description="Bank for this Organization", help="The Own Bank field indicates if this bank is for this Organization as opposed to a Bank for a Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="Own Bank", fieldLength=1)
	IsOwnBank,
	//
	@FlyElement(name="Owned", description="The asset is owned by the organization", help="The asset may not be in possession, but the asset is legally owned by the organization", dataType=FlyDataType.YesNo, entityType="D", printName="Owned", fieldLength=1)
	IsOwned,
	//
	@FlyElement(name="Page break", description="Start with new page", help="Before printing this item, create a new page", dataType=FlyDataType.YesNo, entityType="D", printName="Page break", fieldLength=1)
	IsPageBreak,
	//
	@FlyElement(name="Paid", description="The document is paid", dataType=FlyDataType.YesNo, entityType="D", printName="Paid", fieldLength=1)
	IsPaid,
	//
	@FlyElement(name="Paid to third party", description="Amount paid to someone other than the Business Partner", help="The Paid to Third Party checkbox indicates that the amounts are paid to someone other than the Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="Paid to third party", fieldLength=1)
	IsPaidTo3Party,
	//
	@FlyElement(name="Paint Boundary Lines", description="Paint table boundary lines", help="Paint lines around table", dataType=FlyDataType.YesNo, entityType="D", printName="Paint boundary Lines", fieldLength=1)
	IsPaintBoundaryLines,
	//
	@FlyElement(name="Paint Header Lines", description="Paint Lines over/under the Header Line ", help="If selected, a line is painted above and below the header line using the stroke information", dataType=FlyDataType.YesNo, entityType="D", printName="Header Lines", fieldLength=1)
	IsPaintHeaderLines,
	//
	@FlyElement(name="Paint Horizontal Lines", description="Paint horizontal lines", help="Paint horizontal table lines", dataType=FlyDataType.YesNo, entityType="D", printName="Paint H Lines", fieldLength=1)
	IsPaintHLines,
	//
	@FlyElement(name="Paint Vertical Lines", description="Paint vertical lines", help="Paint vertical table lines", dataType=FlyDataType.YesNo, entityType="D", printName="Paint V Lines", fieldLength=1)
	IsPaintVLines,
	//
	@FlyElement(name="Parent link column", description="This column is a link to the parent table (e.g. header from lines) - incl. Association key columns", help="The Parent checkbox indicates if this column is a link to the parent table.", dataType=FlyDataType.YesNo, entityType="D", printName="Parent link column", fieldLength=1)
	IsParent,
	//
	@FlyElement(name="Is Part Unique Index", dataType=FlyDataType.YesNo, entityType="EE05", printName="Is Part Unique Index", fieldLength=1)
	IsPartUniqueIndex,
	//
	@FlyElement(name="Transfer passive", description="FTP passive transfer", help="Should the transfer be run in passive mode?", dataType=FlyDataType.YesNo, entityType="D", printName="Transfer passive", fieldLength=1)
	IsPassive,
	//
	@FlyElement(name="Pay-From Address", description="Business Partner pays from that address and we'll send dunning letters there", help="If the Pay-From Address is selected, this location is the address the Business Partner pays from and where dunning letters will be sent to.", dataType=FlyDataType.YesNo, entityType="D", printName="Pay-From Address", fieldLength=1)
	IsPayFrom,
	//
	@FlyElement(name="Payroll Account", description="Used for mark a bank account defined for payment of payroll", help="If you mark a business partner bank account like payroll account, it can be used for generate payment of payroll", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Payroll Account", fieldLength=1)
	IsPayrollAccount,
	//
	@FlyElement(name="Pay Schedule valid", description="Is the Payment Schedule is valid", help="Payment Schedules allow to have multiple due dates.", dataType=FlyDataType.YesNo, entityType="D", printName="Pay Schedule valid", fieldLength=1)
	IsPayScheduleValid,
	//
	@FlyElement(name="Is Percentage", description="Indicates that Quantity is expressed as Percentage (%)", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Is Percentage", fieldLength=1)
	IsPercentage,
	//
	@FlyElement(name="Percent withholding", description="Withholding amount is a percentage of the invoice amount", help="The Percent Withholding checkbox indicates if the withholding amount is a percentage of the invoice amount.", dataType=FlyDataType.YesNo, entityType="D", printName="Percent withholding", fieldLength=1)
	IsPercentWithholding,
	//
	@FlyElement(name="Personal Access", description="Allow access to all personal records", help="Users of this role have access to all records locked as personal.", dataType=FlyDataType.YesNo, entityType="D", printName="Personal Access", fieldLength=1)
	IsPersonalAccess,
	//
	@FlyElement(name="Personal Lock", description="Allow users with role to lock access to personal records", help="If enabled, the user with the role can prevent access of others to personal records.  If a record is locked, only the user or people who can read personal locked records can see the record.", dataType=FlyDataType.YesNo, entityType="D", printName="Personal Lock", fieldLength=1)
	IsPersonalLock,
	//
	@FlyElement(name="Phantom", description="Phantom Component", help="Phantom Component are not stored and produced with the product. This is an option to avild maintaining an Engineering and Manufacturing Bill of Materials.", dataType=FlyDataType.YesNo, entityType="D", printName="Phantom", fieldLength=1)
	IsPhantom,
	//
	@FlyElement(name="Print detail records on pick list", description="Print detail BOM elements on the pick list", help="The Print Details on Pick List indicates that the BOM element products will print on the Pick List as opposed to this product.", dataType=FlyDataType.YesNo, entityType="D", printName="Print detail records on pick list", fieldLength=1)
	IsPickListPrintDetails,
	//
	@FlyElement(name="Pick/QA Confirmation", description="Require Pick or QA Confirmation before processing", help="The processing of the Shipment (Receipt) requires Pick (QA) Confirmation. Note that shipments for automatic documents like POS/Warehouse Orders cannot have confirmations!", dataType=FlyDataType.YesNo, entityType="D", printName="Pick/QA Confirm", fieldLength=1)
	IsPickQAConfirm,
	//
	@FlyElement(name="Positive only", description="Do not generate negative commissions", help="The Positive Only check box indicates that if the result of the subtraction is negative, it is ignored.  This would mean that negative commissions would not be generated.", dataType=FlyDataType.YesNo, entityType="D", printName="Positive only", fieldLength=1)
	IsPositiveOnly,
	//
	@FlyElement(name="POS Required PIN", description="Indicates that a Supervisor Pin is mandatory to execute some tasks e.g. (Change Price , Offer Discount , Delete POS Line)", dataType=FlyDataType.YesNo, entityType="D", printName="POS Required PIN", fieldLength=1)
	IsPOSRequiredPIN,
	//
	@FlyElement(name="Use Postcode Lookup", description="Does this country have a post code web service", help="Enable the IsPostcodeLookup if you wish to configure a post code lookup web service", dataType=FlyDataType.YesNo, entityType="D", printName="Use Postcode Lookup", fieldLength=1)
	IsPostcodeLookup,
	//
	@FlyElement(name="Post if Clearing Equal", description="This flag controls if Adempiere must post when clearing (transit) and final accounts are the same", dataType=FlyDataType.YesNo, entityType="D", printName="Post if Clearing Equal", fieldLength=1)
	IsPostIfClearingEqual,
	//
	@FlyElement(name="Post Immediately (Deprecated)", description="Post the accounting immediately for testing (Deprecated)", help="If selected, the accounting consequences are immediately generated when completing a document.  Otherwise the document is posted by a batch process.  You should select this only if you are testing.	Deprecated column - use instead the functionality Client Accounting.", dataType=FlyDataType.YesNo, entityType="D", printName="Post Immediate", fieldLength=1)
	IsPostImmediate,
	//
	@FlyElement(name="Post Services Separately", description="Differentiate between Services and Product Receivable/Payables", help="If selected, you will post service related revenue to a different receivables account and service related cost to a different payables account.", dataType=FlyDataType.YesNo, entityType="D", printName="Post Services", fieldLength=1)
	IsPostServices,
	//
	@FlyElement(name="PO Tax exempt", description="Business partner is exempt from tax on purchases", help="If a business partner is exempt from tax on purchases, the exempt tax rate is used. For this, you need to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate.  This is required for tax reporting, so that you can track tax exempt transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="PO Tax exempt", fieldLength=1)
	IsPOTaxExempt,
	//
	@FlyElement(name="Prepare Split Document", description="Prepare generated split shipment/receipt document", dataType=FlyDataType.YesNo, entityType="D", printName="Prepare Split Doc", fieldLength=1)
	IsPrepareSplitDocument,
	//
	@FlyElement(name="Prepayment", description="The Payment/Receipt is a Prepayment", help="Payments not allocated to an invoice with a charge are posted to Unallocated Payments. When setting this flag, the payment is posted to the Customer or Vendor Prepayment account.", dataType=FlyDataType.YesNo, entityType="D", printName="Prepayment", fieldLength=1)
	IsPrepayment,
	//
	@FlyElement(name="isPresentForProduct", dataType=FlyDataType.YesNo, entityType="D", printName="Present for Product", fieldLength=1)
	isPresentForProduct,
	//
	@FlyElement(name="Primary", description="Indicates if this is the primary budget", help="The Primary checkbox indicates if this budget is the primary budget.", dataType=FlyDataType.YesNo, entityType="D", printName="Primary", fieldLength=1)
	IsPrimary,
	//
	@FlyElement(name="Print Barcode Text", description="Print barcode text beneath symbol", dataType=FlyDataType.NONE, entityType="D", printName="Print Barcode Text", fieldLength=0)
	IsPrintBarcodeText,
	//
	@FlyElement(name="Printed", description="Indicates if this document / line is printed", help="The Printed checkbox indicates if this document or line will included when printing.", dataType=FlyDataType.YesNo, entityType="D", printName="Printed", fieldLength=1)
	IsPrinted,
	//
	@FlyElement(name="Print Function Symbols", description="Print Symbols for Functions (Sum, Average, Count)", help="If selected, print symbols - otherwise print names of the function", dataType=FlyDataType.YesNo, entityType="D", printName="Print Function Symbols", fieldLength=1)
	IsPrintFunctionSymbols,
	//
	@FlyElement(name="Print Parameters", description="Print query parameters on list report", help="If selected, query parameters will be printed at the start of the report.", dataType=FlyDataType.YesNo, entityType="D", printName="Print Parameters", fieldLength=1)
	IsPrintParameters,
	//
	@FlyElement(name="Is Print Pick List", description="Indicate if a Pick List is print", help="When you select this checkbox a Pick list is printed", dataType=FlyDataType.YesNo, entityType="EE03", printName="Is Print Pick List", fieldLength=1)
	IsPrintPickList,
	//
	@FlyElement(name="Processing", dataType=FlyDataType.YesNo, entityType="D", printName="Processing", fieldLength=1)
	IsProcessing,
	//
	@FlyElement(name="Product Dimension", description="Include Product as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Product Dimension", fieldLength=1)
	IsProductDim,
	//
	@FlyElement(name="Project Dimension", description="Include Project as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Project Dimension", fieldLength=1)
	IsProjectDim,
	//
	@FlyElement(name="Project Phase  Dimension", description="Include Project Phase as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Project Phase Dimension", fieldLength=1)
	IsProjectPhaseDim,
	//
	@FlyElement(name="Project Task  Dimension", description="Include Project Task as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Project Task Dimension", fieldLength=1)
	IsProjectTaskDim,
	//
	@FlyElement(name="Prospect", description="Indicates this is a Prospect", help="The Prospect checkbox indicates an entity that is an active prospect.", dataType=FlyDataType.YesNo, entityType="D", printName="Prospect", fieldLength=1)
	IsProspect,
	//
	@FlyElement(name="Is Provident Fund Employee?", description="Is Provident Fund Employee?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Is Provident Fund Employee?", fieldLength=0)
	IsProvidentFund,
	//
	@FlyElement(name="Public", description="Public can read entry", help="If selected, public users can read/view the entry. Public are users without a Role in the system. Use security rules for more specific access control.", dataType=FlyDataType.YesNo, entityType="D", printName="Public", fieldLength=1)
	IsPublic,
	//
	@FlyElement(name="Public Write", description="Public can write entries", help="If selected, public users can write/create entries. Public are users without a Role in the system. Use security rules for more specific access control.", dataType=FlyDataType.YesNo, entityType="D", printName="Public Write", fieldLength=1)
	IsPublicWrite,
	//
	@FlyElement(name="Published", description="The Topic is published and can be viewed", help="If not selected, the Topic is not visible to the general public.", dataType=FlyDataType.YesNo, entityType="D", printName="Published", fieldLength=1)
	IsPublished,
	//
	@FlyElement(name="Purchased", description="Organization purchases this product", help="The Purchased check box indicates if this product is purchased by this organization.", dataType=FlyDataType.YesNo, entityType="D", printName="Purchased", fieldLength=1)
	IsPurchased,
	//
	@FlyElement(name="Purchase Quantity", description="This quantity is used in the Purchase Order to the Supplier", help="When multiple quantities are used in an Request for Quotation, the selected Quantity is used for generating the purchase order.  If none selected the lowest number is used.", dataType=FlyDataType.YesNo, entityType="D", printName="Purchase Qty", fieldLength=1)
	IsPurchaseQty,
	//
	@FlyElement(name="QC Pass", dataType=FlyDataType.YesNo, entityType="D", printName="QC Pass", fieldLength=1)
	IsQCPass,
	//
	@FlyElement(name="Is Qty Percentage", description="Indicate that this component is based in % Quantity", help="Indicate that this component is based in % Quantity", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is Qty Percentage", fieldLength=1)
	IsQtyPercentage,
	//
	@FlyElement(name="Quantity based", description="Trade discount break level based on Quantity (not value)", help="The calculation of the trade discount level is based on the quantity of the order and not the value amount of the order", dataType=FlyDataType.YesNo, entityType="D", printName="Quantity based", fieldLength=1)
	IsQuantityBased,
	//
	@FlyElement(name="Query Criteria", description="The column is also used as a query criteria", help="The column is used to enter queries - the SQL cannot be an expression", dataType=FlyDataType.YesNo, entityType="D", printName="Query Criteria", fieldLength=1)
	IsQueryCriteria,
	//
	@FlyElement(name="Quote All Quantities", description="Suppliers are requested to provide responses for all quantities", help="If selected, the response to the Request for Quotation needs to have a price for all Quantities", dataType=FlyDataType.YesNo, entityType="D", printName="Quote All Qty", fieldLength=1)
	IsQuoteAllQty,
	//
	@FlyElement(name="Quote Total Amt", description="The response can have just the total amount for the RfQ", help="If not selected, the response must be provided per line", dataType=FlyDataType.YesNo, entityType="D", printName="Quote Total Amt", fieldLength=1)
	IsQuoteTotalAmt,
	//
	@FlyElement(name="Range", description="The parameter is a range of values", help="The Range checkbox indicates that this parameter is a range of values.", dataType=FlyDataType.YesNo, entityType="D", printName="Range", fieldLength=1)
	IsRange,
	//
	@FlyElement(name="Read Only", description="Field is read only", help="The Read Only indicates that this field may only be Read.  It may not be updated.", dataType=FlyDataType.YesNo, entityType="D", printName="Read Only", fieldLength=1)
	IsReadOnly,
	//
	@FlyElement(name="Read Write", description="Field is read / write", help="The Read Write indicates that this field may be read and updated.", dataType=FlyDataType.YesNo, entityType="D", printName="Read Write", fieldLength=1)
	IsReadWrite,
	//
	@FlyElement(name="Recalculate", description="Allow recalculation", help="When active, a recalculation is allowed", dataType=FlyDataType.YesNo, entityType="D", printName="Recalculate", fieldLength=1)
	IsReCalculate,
	//
	@FlyElement(name="Receipt", description="This is a sales transaction (receipt)", dataType=FlyDataType.YesNo, entityType="D", printName="Receipt", fieldLength=1)
	IsReceipt,
	//
	@FlyElement(name="Reconciled", description="Payment is reconciled with bank statement", dataType=FlyDataType.YesNo, entityType="D", printName="Reconciled", fieldLength=1)
	IsReconciled,
	//
	@FlyElement(name="Registered", description="The application is registered.", dataType=FlyDataType.YesNo, entityType="D", printName="Registered", fieldLength=1)
	IsRegistered,
	//
	@FlyElement(name="Relative Position", description="The item is relative positioned (not absolute)", help="The relative positioning of the item is determined by X-Z space and next line", dataType=FlyDataType.YesNo, entityType="D", printName="Relative Position", fieldLength=1)
	IsRelativePosition,
	//
	@FlyElement(name="Remit-To Address", description="Business Partner payment address", help="If the Remit-To Address is selected, the location is used to send payments to the vendor.", dataType=FlyDataType.YesNo, entityType="D", printName="Remit-To Address", fieldLength=1)
	IsRemitTo,
	//
	@FlyElement(name="Replicated", description="The data is successfully replicated", help="The data replication was successful.", dataType=FlyDataType.YesNo, entityType="D", printName="Replicated", fieldLength=1)
	IsReplicated,
	//
	@FlyElement(name="Report", description="Indicates a Report record", help="The Report checkbox indicates that this record is a report as opposed to a process", dataType=FlyDataType.YesNo, entityType="D", printName="Report", fieldLength=1)
	IsReport,
	//
	@FlyElement(name="Reproducible", description="Problem can re reproduced in Gardenworld", help="The problem occurs also in the standard distribution in the demo client Gardenworld.", dataType=FlyDataType.List, entityType="D", printName="Reproducible", fieldLength=1)
	IsReproducible,
	//
	@FlyElement(name="Is DRP Required", description="Is DRP Required", help="If the DRP Required checkbox is ticked, this means it has been a change in some element which affect the material plan  for this product, i.e Network Distribution, Orders, Inventory, MPS, etc. and therefore  you need to executed again DRP to adjust the Planned Orders to the new conditions and to get the updated action messages.", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is DRP Required", fieldLength=1)
	IsRequiredDRP,
	//
	@FlyElement(name="Is MRP Required", description="Is MRP Required", help="If the MRP Required checkbox is ticked, this means it has been a change in some element which affect the material plan  for this product, i.e BOM, Orders, Inventory, MPS, etc. and therefore  you need to executed again MRP to adjust the Planned Orders to the new conditions and to get the updated action messages.", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is MRP Required", fieldLength=1)
	IsRequiredMRP,
	//
	@FlyElement(name="Re-Validate", description="Re-Validate entries", dataType=FlyDataType.NONE, entityType="D", printName="Re-Validate", fieldLength=0)
	IsReValidate,
	//
	@FlyElement(name="Reversal", description="This is a reversing transaction", help="The Reversal check box indicates if this is a reversal of a prior transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="Reversal", fieldLength=1)
	IsReversal,
	//
	@FlyElement(name="RfQ Quantity", description="The quantity is used when generating RfQ Responses", help="When generating the RfQ Responses, this quantity is included", dataType=FlyDataType.YesNo, entityType="D", printName="RfQ Quantity", fieldLength=1)
	IsRfQQty,
	//
	@FlyElement(name="Responses Accepted", description="Are Responses to the Request for Quotation accepted", help="If selected, responses for the RfQ are accepted", dataType=FlyDataType.YesNo, entityType="D", printName="Responses Accepted", fieldLength=1)
	IsRfQResponseAccepted,
	//
	@FlyElement(name="Tunnel via HTTP", description="Connect to Server via HTTP Tunnel", help="If selected, the connection to the server is via a HTTP tunnel, otherwise it uses an RMI/JNP connection", dataType=FlyDataType.YesNo, entityType="D", printName="Tunnel via HTTP", fieldLength=1)
	IsRMIoverHTTP,
	//
	@FlyElement(name="Running Total", description="Create a running total (sum)", help="A running total creates a sum at the end of a page and on the top of the next page for all columns, which have a Sum function.  You should define running total only once per format.", dataType=FlyDataType.YesNo, entityType="D", printName="Running Total", fieldLength=1)
	IsRunningTotal,
	//
	@FlyElement(name="Sales Lead", description="This contact is a sales lead", help="Sales leads can be converted into full contacts with Business Partners.", dataType=FlyDataType.NONE, entityType="D", printName="Sales Lead", fieldLength=0)
	IsSalesLead,
	//
	@FlyElement(name="Sales Region Dimension", description="Include Sales Region as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Region Dimension", fieldLength=1)
	IsSalesRegionDim,
	//
	@FlyElement(name="Sales Representative", description="Indicates if  the business partner is a sales representative or company agent", help="The Sales Rep checkbox indicates if this business partner is a sales representative. A sales representative may also be an employee, but does not need to be.", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Rep", fieldLength=1)
	IsSalesRep,
	//
	@FlyElement(name="Sales Tax", description="This is a sales tax (i.e. not a value added tax)", help="If selected AP tax is handled as expense, otherwise it is handled as a VAT credit.", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Tax", fieldLength=1)
	IsSalesTax,
	//
	@FlyElement(name="Same Currency", dataType=FlyDataType.YesNo, entityType="D", printName="Same Currency", fieldLength=1)
	IsSameCurrency,
	//
	@FlyElement(name="Same distribution for source and target", description="Use the same distribution for source and target", help="Use the same distribution for source and target. Source distribution is for the entitlement of the reward, target distribution is the distribution to get the product to apply the reward to", dataType=FlyDataType.YesNo, entityType="D", printName="Same distribution for source and target", fieldLength=1)
	IsSameDistribution,
	//
	@FlyElement(name="Same Line", description="Displayed on same line as previous field", help="The Same Line checkbox indicates that the field will display on the same line as the previous field.", dataType=FlyDataType.YesNo, entityType="D", printName="Same Line", fieldLength=1)
	IsSameLine,
	//
	@FlyElement(name="Same Tax", description="Use the same tax as the main transaction", help="The Same Tax checkbox indicates that this charge should use the same tax as the main transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="Same Tax", fieldLength=1)
	IsSameTax,
	//
	@FlyElement(name="Only from same Warehouse", dataType=FlyDataType.YesNo, entityType="D", printName="Only from same Warehouse", fieldLength=1)
	IsSameWarehouse,
	//
	@FlyElement(name="Save In Historic", dataType=FlyDataType.YesNo, entityType="D", printName="Save In Historic", fieldLength=1)
	IsSaveInHistoric,
	//
	@FlyElement(name="Secure content", description="Defines whether content needs to get encrypted", help="If you select this parameter this container will only get delivered over a secure connection i.e. SSL etc. if no encryption can be found no content will be delivered", dataType=FlyDataType.YesNo, entityType="D", printName="Secure content", fieldLength=1)
	IsSecure,
	//
	@FlyElement(name="Security enabled", description="If security is enabled, user access to data can be restricted via Roles", help="The Security Enabled checkbox indicates that user access to the data in this table can be restricted using Roles.", dataType=FlyDataType.YesNo, entityType="D", printName="Security enabled", fieldLength=1)
	IsSecurityEnabled,
	//
	@FlyElement(name="Selected", dataType=FlyDataType.YesNo, entityType="D", printName="Selected", fieldLength=1)
	IsSelected,
	//
	@FlyElement(name="Is selected by default", description="Allows auto select rows of a browser", help="Allows auto select rows of a browser", dataType=FlyDataType.YesNo, entityType="EE07", printName="Is selected by default", fieldLength=1)
	IsSelectedByDefault,
	//
	@FlyElement(name="Selected Winner", description="The response is the selected winner", help="The response is the selected winner. If selected on Response level, the line selections are ignored.", dataType=FlyDataType.YesNo, entityType="D", printName="Selected Winner", fieldLength=1)
	IsSelectedWinner,
	//
	@FlyElement(name="Selection Column", description="Is this column used for finding rows in windows", help="If selected, the column is listed in the first find window tab and in the selection part of the window", dataType=FlyDataType.YesNo, entityType="D", printName="Selection", fieldLength=1)
	IsSelectionColumn,
	//
	@FlyElement(name="Self-Service", description="This is a Self-Service entry or this entry can be changed via Self-Service", help="Self-Service allows users to enter data or update their data.  The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality.", dataType=FlyDataType.YesNo, entityType="D", printName="Self-Service", fieldLength=1)
	IsSelfService,
	//
	@FlyElement(name="Send RfQ Invitation to Vendors", description="Send the RfQ Invitation to the Vendors", dataType=FlyDataType.NONE, entityType="D", printName="Send RfQ to Vendor", fieldLength=0)
	IsSendRfQ,
	//
	@FlyElement(name="Serial No", description="The product instances have Serial Numbers", help="For individual products, you can define Serial Numbers", dataType=FlyDataType.YesNo, entityType="D", printName="Serial No", fieldLength=1)
	IsSerNo,
	//
	@FlyElement(name="Mandatory Serial No", description="The entry of a Serial No is mandatory when creating a Product Instance", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Serial No", fieldLength=1)
	IsSerNoMandatory,
	//
	@FlyElement(name="Server EMail", description="Send EMail from Server", help="When selected, mail is sent from the server rather then the client.  This decreases availability.  You would select this when you do not want to enable email relay for the client addresses in your mail server.", dataType=FlyDataType.YesNo, entityType="D", printName="Server EMail", fieldLength=1)
	IsServerEMail,
	//
	@FlyElement(name="Server Process", description="Run this Process on Server only", help="Enabling this flag disables to run the process on the client.  This potentially decreases the availability.", dataType=FlyDataType.YesNo, entityType="D", printName="Server Process", fieldLength=1)
	IsServerProcess,
	//
	@FlyElement(name="Credit Stop", description="Set the business partner to credit stop", help="If a dunning letter of this level is created, the business partner is set to Credit Stop (needs to be manually changed).", dataType=FlyDataType.YesNo, entityType="D", printName="Credit Stop", fieldLength=1)
	IsSetCreditStop,
	//
	@FlyElement(name="Set NL Position", description="Set New Line Position", help="When enabled, the current x (horizontal) Position before printing the item is saved. The next New Line will use the saved x (horizontal) Position, enabling to print data in columns.	The setting is not restricted to an area (header, content, footer), allowing to align information also with Header and Footer with the Content.", dataType=FlyDataType.YesNo, entityType="D", printName="Set NL Position", fieldLength=1)
	IsSetNLPosition,
	//
	@FlyElement(name="Set Payment Term", description="Set the payment term of the Business Partner", help="If a dunning letter of this level is created, the payment term of this business partner is overwritten.", dataType=FlyDataType.YesNo, entityType="D", printName="Set Payment Term", fieldLength=1)
	IsSetPaymentTerm,
	//
	@FlyElement(name="Shift Allocation", description="Shift Allocation", help="The Shift Allocation", dataType=FlyDataType.YesNo, entityType="EE02", printName="Shift Allocation", fieldLength=0)
	IsShiftAllocation,
	//
	@FlyElement(name="Ship/Receipt Confirmation", description="Require Ship or Receipt Confirmation before processing", help="The processing of the Shipment (Receipt) requires Ship (Receipt) Confirmation. Note that shipments for automatic documents like POS/Warehouse Orders cannot have confirmations!", dataType=FlyDataType.YesNo, entityType="D", printName="Ship/Receipt Confirm", fieldLength=1)
	IsShipConfirm,
	//
	@FlyElement(name="Ship Address", description="Business Partner Shipment Address", help="If the Ship Address is selected, the location is used to ship goods to a customer or receive goods from a vendor.", dataType=FlyDataType.YesNo, entityType="D", printName="Ship address", fieldLength=1)
	IsShipTo,
	//
	@FlyElement(name="Show Accounting", description="Users with this role can see accounting information", help="This allows to prevent access to any accounting information.", dataType=FlyDataType.YesNo, entityType="D", printName="Show Accounting", fieldLength=1)
	IsShowAcct,
	//
	@FlyElement(name="Show All Due", description="Show/print all due invoices", help="The dunning letter with this level includes all due invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="Show All Due", fieldLength=1)
	IsShowAllDue,
	//
	@FlyElement(name="Show Not Due", description="Show/print all invoices which are not due (yet).", help="The dunning letter with this level includes all not due invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="Show Not Due", fieldLength=1)
	IsShowNotDue,
	//
	@FlyElement(name="Show Opposite Sign", description="Display values with the opposite sign", help="Displays values for a Report Line with the opposite sign to the calculated value. The 'Allow Opposite Sign' flag on Report Column must also be set for this to take effect. Note that all report calculations are performed before the sign is reversed.", dataType=FlyDataType.YesNo, entityType="D", printName="Show Opposite Sign", fieldLength=1)
	IsShowOppositeSign,
	//
	@FlyElement(name="Show Total", description="Show totals into Smart Browser", help="Show totals for the column  of amount type.", dataType=FlyDataType.YesNo, entityType="EE07", printName="Show Total", fieldLength=1)
	IsShowTotal,
	//
	@FlyElement(name="Simulation", description="Performing the function is only simulated", dataType=FlyDataType.NONE, entityType="D", printName="Simulation", fieldLength=0)
	IsSimulation,
	//
	@FlyElement(name="Single Assignment only", description="Only one assignment at a time (no double-booking or overlapping)", help="If selected, you can only have one assignment for the resource at a single point in time.   It is also  not possible to have overlapping assignments.", dataType=FlyDataType.YesNo, entityType="D", printName="Single Assignment", fieldLength=1)
	IsSingleAssignment,
	//
	@FlyElement(name="Single Row Layout", description="Default for toggle between Single- and Multi-Row (Grid) Layout", help="The Single Row Layout checkbox indicates if the default display type for this window is a single row as opposed to multi row.", dataType=FlyDataType.YesNo, entityType="D", printName="Single Row Layout", fieldLength=1)
	IsSingleRow,
	//
	@FlyElement(name="SMTP Authentication", description="Your mail server requires Authentication", help="Some email servers require authentication before sending emails.  If yes, users are required to define their email user name and password.  If authentication is required and no user name and password is required, delivery will fail.", dataType=FlyDataType.YesNo, entityType="D", printName="SMTP Authentication", fieldLength=1)
	IsSmtpAuthorization,
	//
	@FlyElement(name="Sold", description="Organization sells this product", help="The Sold check box indicates if this product is sold by this organization.", dataType=FlyDataType.YesNo, entityType="D", printName="Sold", fieldLength=1)
	IsSold,
	//
	@FlyElement(name="Sales Price list", description="This is a Sales Price List", help="The Sales Price List check box indicates if this price list is used for sales transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Price list", fieldLength=1)
	IsSOPriceList,
	//
	@FlyElement(name="Order Tab", description="The Tab determines the Order", dataType=FlyDataType.YesNo, entityType="D", printName="Order Tab", fieldLength=1)
	IsSortTab,
	//
	@FlyElement(name="Sales Transaction", description="This is a Sales Transaction", help="The Sales Transaction checkbox indicates if this item is a Sales Transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Transaction", fieldLength=1)
	IsSOTrx,
	//
	@FlyElement(name="Split when Difference", description="Split document when there is a difference", help="If the confirmation contains differences, the original document is split allowing the original document (shipment) to be processed and updating Inventory - and the newly created document for handling the dispute at a later time. Until the confirmation is processed, the inventory is not updated.", dataType=FlyDataType.YesNo, entityType="D", printName="Split Difference", fieldLength=1)
	IsSplitWhenDifference,
	//
	@FlyElement(name="Standard Header/Footer", description="The standard Header and Footer is used", help="If the standard header is not used, it must be explicitly defined.", dataType=FlyDataType.YesNo, entityType="D", printName="Standard Header/Footer", fieldLength=1)
	IsStandardHeaderFooter,
	//
	@FlyElement(name="Is Statement", description="Dunning Level is a definition of a statement", dataType=FlyDataType.YesNo, entityType="D", printName="Is Statement", fieldLength=1)
	IsStatement,
	//
	@FlyElement(name="Std User Workflow", description="Standard Manual User Approval Workflow", help="If selected, only documents with an open status (drafted, in progress, approved, rejected, invalid) and standard user actions (prepare, complete, approve, reject) are allowed to continue.  Use this to prevent having to define details on how automatic processes (unlock, invalidate, post, re-activate) and when the document is closed for normal user action (completed, waiting, closed, voided, reversed).", dataType=FlyDataType.YesNo, entityType="D", printName="Std User Workflow", fieldLength=1)
	IsStdUserWorkflow,
	//
	@FlyElement(name="Stocked", description="Organization stocks this product", help="The Stocked check box indicates if this product is stocked by this Organization.", dataType=FlyDataType.YesNo, entityType="D", printName="Stocked", fieldLength=1)
	IsStocked,
	//
	@FlyElement(name="Stocktake", help="Enable stocktake enhancements, including facility to record first and second counts.", dataType=FlyDataType.NONE, entityType="D", printName="Stocktake", fieldLength=0)
	IsStocktake,
	//
	@FlyElement(name="Sub Acct Dimension", description="Include Sub Acct as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Sub Acct Dimension", fieldLength=1)
	IsSubAcctDim,
	//
	@FlyElement(name="Is Subcontracting", dataType=FlyDataType.YesNo, entityType="EE01", printName="Is Subcontracting", fieldLength=1)
	IsSubcontracting,
	//
	@FlyElement(name="Issue Description", description="Description of the Issue line", dataType=FlyDataType.String, entityType="D", printName="Issue Description", fieldLength=255)
	IssueDescription,
	//
	@FlyElement(name="Issue Line", description="Line number of the issue", dataType=FlyDataType.Integer, entityType="D", printName="Issue Line", fieldLength=22)
	IssueLine,
	//
	@FlyElement(name="Issue Method", description="There are two methods for issue the components to Manufacturing Order", help="Method Issue: The component are delivered one for one and is necessary indicate the delivered quantity for each component.		Method BackFlush: The component are delivered based in BOM, The  delivered quantity for each component is based in BOM or Formula and Manufacturing Order Quantity.		Use the field Backflush Group for grouping the component in a Backflush Method.", dataType=FlyDataType.List, entityType="EE01", printName="Issue Method", fieldLength=1)
	IssueMethod,
	//
	@FlyElement(name="Source", description="Issue Source", help="Source of the Issue", dataType=FlyDataType.List, entityType="D", printName="Source", fieldLength=1)
	IssueSource,
	//
	@FlyElement(name="Issue Status", description="Current Status of the Issue", help="Description of the current status of the issue", dataType=FlyDataType.Text, entityType="D", printName="Issue Status", fieldLength=2000)
	IssueStatus,
	//
	@FlyElement(name="Issue Summary", description="Issue Summary", dataType=FlyDataType.String, entityType="D", printName="Issue Summary", fieldLength=2000)
	IssueSummary,
	//
	@FlyElement(name="Calculate Sum (S)", description="Calculate the Sum of numeric content or length", help="Calculate the Sum (S) of the data if the field is numeric, otherwise total sum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Sum", fieldLength=1)
	IsSummarized,
	//
	@FlyElement(name="Summary Level", description="This is a summary entity", help="A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.", dataType=FlyDataType.YesNo, entityType="D", printName="Summary Level", fieldLength=1)
	IsSummary,
	//
	@FlyElement(name="Suppress Null", description="Suppress columns or elements with NULL value", help="If a Form entry is NULL and if selected, the field (including label) is not printed. <br>	If all elements in a table column are NULL and if selected, the column is not printed.", dataType=FlyDataType.YesNo, entityType="D", printName="Suppress Null", fieldLength=1)
	IsSuppressNull,
	//
	@FlyElement(name="Suppress Repeats", description="Suppress repeated elements in column.", help="Determines whether repeated elements in a column are repeated in a printed table.", dataType=FlyDataType.YesNo, entityType="D", printName="Suppress Repeats", fieldLength=1)
	IsSuppressRepeats,
	//
	@FlyElement(name="Synchronize Database", description="Change database table definition when changing dictionary definition", help="When selected, the database column definition is updated based on your entries in the Column definition of the Application Dictionary.", dataType=FlyDataType.Button, entityType="D", printName="Sync DB", fieldLength=1)
	IsSyncDatabase,
	//
	@FlyElement(name="System Language", description="The screens, etc. are maintained in this Language", help="Select, if you want to have translated screens available in this language.  Please notify your system administrator to run the language maintenance scripts to enable the use of this language.  If the language is not supplied, you can translate the terms yourself.", dataType=FlyDataType.YesNo, entityType="D", printName="System Language", fieldLength=1)
	IsSystemLanguage,
	//
	@FlyElement(name="Table Based", description="Table based List Reporting", help="Table based columnar list reporting is invoked from the Window Report button", dataType=FlyDataType.YesNo, entityType="D", printName="Table Based", fieldLength=1)
	IsTableBased,
	//
	@FlyElement(name="Used for Record ID", description="The document number  will be used as the record key", help="The Used for Record ID checkbox indicates if the document id will be used as the key to the record", dataType=FlyDataType.YesNo, entityType="D", printName="Used for Record ID", fieldLength=1)
	IsTableID,
	//
	@FlyElement(name="SO Tax exempt", description="Business partner is exempt from tax on sales", help="If a business partner is exempt from tax on sales, the exempt tax rate is used. For this, you need to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate.  This is required for tax reporting, so that you can track tax exempt transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="SO Tax exempt", fieldLength=1)
	IsTaxExempt,
	//
	@FlyElement(name="Price includes Tax", description="Tax is included in the price ", help="The Tax Included checkbox indicates if the prices include tax.  This is also known as the gross price.", dataType=FlyDataType.YesNo, entityType="D", printName="Price includes Tax", fieldLength=1)
	IsTaxIncluded,
	//
	@FlyElement(name="Prorate tax", description="Tax is Prorated", help="The Prorate Tax checkbox indicates if this tax is prorated.", dataType=FlyDataType.YesNo, entityType="D", printName="Prorate tax", fieldLength=1)
	IsTaxProrated,
	//
	@FlyElement(name="Tax withholding", description="This is a tax related withholding", help="The Tax Withholding checkbox indicates if this withholding is tax related.", dataType=FlyDataType.YesNo, entityType="D", printName="Tax withholding", fieldLength=1)
	IsTaxWithholding,
	//
	@FlyElement(name="Temporary exempt", description="Temporarily do not withhold taxes", help="The Temporary Exempt checkbox indicates that for a limited time, taxes will not be withheld for this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="Temporary exempt", fieldLength=1)
	IsTemporaryExempt,
	//
	@FlyElement(name="Test", description="Execute in Test Mode", dataType=FlyDataType.NONE, entityType="D", printName="Test", fieldLength=0)
	IsTest,
	//
	@FlyElement(name="Time based", description="Time based Revenue Recognition rather than Service Level based", help="Revenue Recognition can be time or service level based.", dataType=FlyDataType.YesNo, entityType="D", printName="Time based", fieldLength=1)
	IsTimeBased,
	//
	@FlyElement(name="Time Report", description="Line is a time report only (no expense)", help="The line contains only time information", dataType=FlyDataType.YesNo, entityType="D", printName="Time Report", fieldLength=1)
	IsTimeReport,
	//
	@FlyElement(name="Time Series", description="The domain data for the chart is organised by time.", help="A time series chart will automatically group and restrict the data by the time unit and scope specified.", dataType=FlyDataType.YesNo, entityType="D", printName="Time Series", fieldLength=1)
	IsTimeSeries,
	//
	@FlyElement(name="Time Slot", description="Resource has time slot availability", help="Resource is only available at certain times", dataType=FlyDataType.YesNo, entityType="D", printName="Time Slot", fieldLength=1)
	IsTimeSlot,
	//
	@FlyElement(name="Is To Formule ", dataType=FlyDataType.NONE, entityType="D", printName="Is To Formule ", fieldLength=0)
	IsToFormule,
	//
	@FlyElement(name="Paid totally", description="The document is totally paid", help="The document has been paid totally, i.e. there is nothing left to pay.", dataType=FlyDataType.YesNo, entityType="D", printName="Paid totally", fieldLength=1)
	IsTotallyPaid,
	//
	@FlyElement(name="Track Issues", description="Enable tracking issues for this asset", help="Issues created by automatic Error Reporting", dataType=FlyDataType.YesNo, entityType="D", printName="Track Issues", fieldLength=1)
	IsTrackIssues,
	//
	@FlyElement(name="Post Trade Discount", description="Generate postings for trade discounts", help="If the invoice is based on an item with a list price, the amount based on the list price and the discount is posted instead of the net amount.	Example: Quantity 10 - List Price: 20 - Actual Price: 17	If selected for a sales invoice 200 is posted to Product Revenue and 30 to Discount Granted - rather than 170 to Product Revenue.	The same applies to vendor invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="Trade Discount", fieldLength=1)
	IsTradeDiscountPosted,
	//
	@FlyElement(name="Transferred", description="Transferred to General Ledger (i.e. accounted)", help="The transferred checkbox indicates if the transactions associated with this document should be transferred to the General Ledger.", dataType=FlyDataType.YesNo, entityType="D", printName="Transferred", fieldLength=1)
	IsTransferred,
	//
	@FlyElement(name="Translated", description="This column is translated", help="The Translated checkbox indicates if this column is translated.", dataType=FlyDataType.YesNo, entityType="D", printName="Translated", fieldLength=1)
	IsTranslated,
	//
	@FlyElement(name="TranslationTab", description="This Tab contains translation information", help="The Translation Tab checkbox indicate if a tab contains translation information. To display translation information, enable this in Tools>Preference.", dataType=FlyDataType.YesNo, entityType="D", printName="TranslationTab", fieldLength=1)
	IsTranslationTab,
	//
	@FlyElement(name="Orders with unconfirmed Shipments", description="Generate shipments for Orders with open delivery confirmations?", help="You can also include orders who have outstanding confirmations (e.g. ordered=10 - not confirmed shipments=4 - would create a new shipment of 6 if available).", dataType=FlyDataType.NONE, entityType="D", printName="Orders with unconfirmed Shipments", fieldLength=0)
	IsUnconfirmedInOut,
	//
	@FlyElement(name="Updatable", description="Determines, if the field can be updated", help="The Updatable checkbox indicates if a field can be updated by the user.", dataType=FlyDataType.YesNo, entityType="D", printName="Updatable", fieldLength=1)
	IsUpdateable,
	//
	@FlyElement(name="Update Costing", dataType=FlyDataType.NONE, entityType="D", printName="Update Costing", fieldLength=0)
	IsUpdateCosting,
	//
	@FlyElement(name="Is Update Count Qty", description="Update count quantity on inventory", help="If selected, the count quantity will be set as well as the book quantity. Otherwise, the quantity will be left as it is.", dataType=FlyDataType.YesNo, entityType="D", printName="Is Update Count Qty", fieldLength=1)
	IsUpdateCountQty,
	//
	@FlyElement(name="Use Ad", description="Whether or not this templates uses Ad's", help="This describe whether or not this Template will use Ad's", dataType=FlyDataType.YesNo, entityType="D", printName="Use Ad", fieldLength=1)
	IsUseAd,
	//
	@FlyElement(name="IsUseASP", dataType=FlyDataType.YesNo, entityType="D", printName="IsUseASP", fieldLength=1)
	IsUseASP,
	//
	@FlyElement(name="Use Beta Functions", description="Enable the use of Beta Functionality", help="The exact scope of Beta Functionality is listed in the release note.  It is usually not recommended to enable Beta functionality in production environments.", dataType=FlyDataType.YesNo, entityType="D", printName="Use Beta", fieldLength=1)
	IsUseBetaFunctions,
	//
	@FlyElement(name="User 1 Dimension", description="Include User 1 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User 1 Dimension", fieldLength=1)
	IsUser1Dim,
	//
	@FlyElement(name="User 2 Dimension", description="Include User 2 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User 2 Dimension", fieldLength=1)
	IsUser2Dim,
	//
	@FlyElement(name="User 3 Dimension", description="Include User 3 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User 3 Dimension", fieldLength=1)
	IsUser3Dim,
	//
	@FlyElement(name="User 4 Dimension", description="Include User 4 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User 4 Dimension", fieldLength=1)
	IsUser4Dim,
	//
	@FlyElement(name="User Element 1 Dimension", description="Include User Element 1 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User Element 1 Dimension", fieldLength=1)
	IsUserElement1Dim,
	//
	@FlyElement(name="User Element 2 Dimension", description="Include User Element 2 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User Element 2 Dimension", fieldLength=1)
	IsUserElement2Dim,
	//
	@FlyElement(name="User updatable", description="The field can be updated by the user", help="The User Updatable checkbox indicate if the user can update  this field.", dataType=FlyDataType.YesNo, entityType="D", printName="User updatable", fieldLength=1)
	IsUserUpdateable,
	//
	@FlyElement(name="Use User Org Access", description="Use Org Access defined by user instead of Role Org Access", help="You can define the access to Organization either by Role or by User.  You would select this, if you have many organizations.", dataType=FlyDataType.YesNo, entityType="D", printName="Use User Org Access", fieldLength=1)
	IsUseUserOrgAccess,
	//
	@FlyElement(name="Valid", description="Element is valid", help="The element passed the validation check", dataType=FlyDataType.YesNo, entityType="D", printName="Valid", fieldLength=1)
	IsValid,
	//
	@FlyElement(name="Only Validate Data", description="Validate the date and do not process", dataType=FlyDataType.NONE, entityType="D", printName="Validate Only", fieldLength=0)
	IsValidateOnly,
	//
	@FlyElement(name="Display Value", description="Displays Value column with the Display column", help="The Display Value checkbox indicates if the value column will display with the display column.", dataType=FlyDataType.YesNo, entityType="D", printName="Display Value", fieldLength=1)
	IsValueDisplayed,
	//
	@FlyElement(name="Vanilla System", description="The system was NOT compiled from Source - i.e. standard distribution", help="You may have customizations, like additional columns, tables, etc - but no code modifications which require compiling from source.", dataType=FlyDataType.List, entityType="D", printName="Vanilla System", fieldLength=1)
	IsVanillaSystem,
	//
	@FlyElement(name="Calculate Variance (s²)", description="Calculate Variance", help="The Variance (s²) is the a measure of dispersion - used in combination with the Mean (µ)", dataType=FlyDataType.YesNo, entityType="D", printName="Variance", fieldLength=1)
	IsVarianceCalc,
	//
	@FlyElement(name="Vendor", description="Indicates if this Business Partner is a Vendor", help="The Vendor checkbox indicates if this Business Partner is a Vendor.  If it is selected, additional fields will display which further identify this vendor.", dataType=FlyDataType.YesNo, entityType="D", printName="Vendor", fieldLength=1)
	IsVendor,
	//
	@FlyElement(name="Verified", description="The BOM configuration has been verified", help="The Verified check box indicates if the configuration of this product has been verified.  This is used for products that consist of a bill of materials", dataType=FlyDataType.YesNo, entityType="D", printName="Verified", fieldLength=1)
	IsVerified,
	//
	@FlyElement(name="View", description="This is a view", help="This is a view rather than a table.  A view is always treated as read only in the system.", dataType=FlyDataType.YesNo, entityType="D", printName="View", fieldLength=1)
	IsView,
	//
	@FlyElement(name="Web Can Update", description="Entry can be updated from the Web", dataType=FlyDataType.YesNo, entityType="D", printName="Web Can Update", fieldLength=1)
	IsWebCanUpdate,
	//
	@FlyElement(name="Featured in Web Store", description="If selected, the product is displayed in the initial or any empty search", help="In the display of products in the Web Store, the product is displayed in the initial view or if no search criteria are entered. To be displayed, the product must be in the price list used.", dataType=FlyDataType.YesNo, entityType="D", printName="Featured", fieldLength=1)
	IsWebStoreFeatured,
	//
	@FlyElement(name="Webstore User", description="Is a user for Webstore", help="It is created from Webstore", dataType=FlyDataType.YesNo, entityType="ECA02", printName="Webstore User", fieldLength=1)
	IsWebstoreUser,
	//
	@FlyElement(name="Willing to commit", dataType=FlyDataType.YesNo, entityType="D", printName="Willing to commit", fieldLength=1)
	IsWillingToCommit,
	//
	@FlyElement(name="Is Willing to Relocate?", description="Is Willing to Relocate?", help="Is Willing to Relocate?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Is Willing to Relocate?", fieldLength=0)
	IsWillingToRelocate,
	//
	@FlyElement(name="Is Willing to Travel?", description="Is Willing to Travel?", help="Is Willing to Travel?", dataType=FlyDataType.YesNo, entityType="EE02", printName="Is Willing to Travel?", fieldLength=0)
	IsWillingToTravel,
	//
	@FlyElement(name="Work In Progress", dataType=FlyDataType.NONE, entityType="D", printName="WIP", fieldLength=0)
	IsWIP,
	//
	@FlyElement(name="Won", description="The opportunity was won", dataType=FlyDataType.NONE, entityType="D", printName="Won", fieldLength=0)
	IsWon,
	//
	@FlyElement(name="XY Position", description="The Function is XY position", help="This function positions for the next print operation", dataType=FlyDataType.YesNo, entityType="D", printName="XY Position", fieldLength=1)
	IsXYPosition,
	//
	@FlyElement(name="Print Item Name", dataType=FlyDataType.String, entityType="D", printName="Item Name", fieldLength=60)
	ItemName,
	//
	@FlyElement(name="I_Workflow_ID", dataType=FlyDataType.NONE, entityType="EE01", printName="Import Workflow", fieldLength=0)
	I_Workflow_ID,
	//
	@FlyElement(name="Jasper Process", description="The Jasper Process used by the printengine if any process defined", dataType=FlyDataType.Table, entityType="D", printName="Jasper Process", fieldLength=22)
	JasperProcess_ID,
	//
	@FlyElement(name="Jasper Process Now", dataType=FlyDataType.Button, entityType="D", printName="Jasper Process Now", fieldLength=1)
	JasperProcessing,
	//
	@FlyElement(name="Jasper Report", dataType=FlyDataType.String, entityType="D", printName="Jasper Report", fieldLength=255)
	JasperReport,
	//
	@FlyElement(name="Java Class", dataType=FlyDataType.String, entityType="EE05", printName="Java Class", fieldLength=255)
	JavaClass,
	//
	@FlyElement(name="Java Info", description="Java Version Info", dataType=FlyDataType.String, entityType="D", printName="Java Info", fieldLength=255)
	JavaInfo,
	//
	@FlyElement(name="Journal Line Description", dataType=FlyDataType.NONE, entityType="D", printName="Journal Line Description", fieldLength=0)
	Jnl_Line_Description,
	//
	@FlyElement(name="Job Application Date", description="Job Application Date", help="The Job Application Date", dataType=FlyDataType.Date, entityType="EE02", printName="Job Application Date", fieldLength=0)
	JobApplicationDate,
	//
	@FlyElement(name="Job Cant", dataType=FlyDataType.Integer, entityType="EE02", printName="Job Cant", fieldLength=10)
	JobCant,
	//
	@FlyElement(name="Job Education Name", description="Job Education Name of an Employee", help="The Job Education Name of an Employee", dataType=FlyDataType.String, entityType="EE02", printName="Job Education Name", fieldLength=255)
	JobEducationName,
	//
	@FlyElement(name="Job Education Value", description="Job Education Value of an Employee", help="The Job Education Value of an Employee", dataType=FlyDataType.String, entityType="EE02", printName="Job Education Value", fieldLength=60)
	JobEducationValue,
	//
	@FlyElement(name="Job Name", description="Job Name", dataType=FlyDataType.String, entityType="EE02", printName="Job Name", fieldLength=60)
	JobName,
	//
	@FlyElement(name="Job Type Name", description="The Job Type Name for a Job Openings", help="Job Type Name for Recruitment Management", dataType=FlyDataType.String, entityType="EE02", printName="Job Type Name", fieldLength=255)
	JobTypeName,
	//
	@FlyElement(name="Job Type Value", description="The Job Type Value for a Job Openings", help="Job Type Value for Recruitment Management", dataType=FlyDataType.String, entityType="EE02", printName="Job Type Value", fieldLength=60)
	JobTypeValue,
	//
	@FlyElement(name="Job Value", description="Job Value", dataType=FlyDataType.String, entityType="EE02", printName="Job Value", fieldLength=40)
	JobValue,
	//
	@FlyElement(name="Join Clause", description="Defined the Join Clause between Tables", dataType=FlyDataType.Text, entityType="EE07", printName="Join Caluse", fieldLength=255)
	JoinClause,
	//
	@FlyElement(name="Join Element", description="Semantics for multiple incoming Transitions", help="Semantics for multiple incoming Transitions for a Node/Activity. AND joins all concurrent threads - XOR requires one thread (no synchronization).", dataType=FlyDataType.List, entityType="D", printName="Join Element", fieldLength=1)
	JoinElement,
	//
	@FlyElement(name="Journal Document No", description="Document number of the Journal", dataType=FlyDataType.String, entityType="D", printName="Journal Doc No", fieldLength=30)
	JournalDocumentNo,
	//
	@FlyElement(name="jsp URL", description="Web URL of the jsp function", help="For the Web UI, define the URL to perform the function (usually a jsp). The URL also can be external to the system.", dataType=FlyDataType.URL, entityType="D", printName="jsp URL", fieldLength=120)
	JSPURL,
	//
	@FlyElement(name="Knowledge Category", description="Knowledge Category", help="Set up knowledge categories and values as a search aid. Examples are Release Version, Product Area, etc. Knowledge Category values act like keywords.", dataType=FlyDataType.TableDirect, entityType="D", printName="Category", fieldLength=22)
	K_Category_ID,
	//
	@FlyElement(name="Category Value", description="The value of the category", help="The value of the category is a keyword", dataType=FlyDataType.TableDirect, entityType="D", printName="Value", fieldLength=22)
	K_CategoryValue_ID,
	//
	@FlyElement(name="Entry Comment", description="Knowledge Entry Comment", help="Comment regarding a knowledge entry", dataType=FlyDataType.ID, entityType="D", printName="Comment", fieldLength=22)
	K_Comment_ID,
	//
	@FlyElement(name="Days to keep Log", description="Number of days to keep the log entries", help="Older Log entries may be deleted", dataType=FlyDataType.Integer, entityType="D", printName="Days keep Log", fieldLength=22)
	KeepLogDays,
	//
	@FlyElement(name="Entry", description="Knowledge Entry", help="The searchable Knowledge Entry", dataType=FlyDataType.Search, entityType="D", printName="Entry", fieldLength=22)
	K_Entry_ID,
	//
	@FlyElement(name="Related Entry", description="Related Entry for this Entry", help="Related Knowledge Entry for this Knowledge Entry", dataType=FlyDataType.Table, entityType="D", printName="Related Entry", fieldLength=22)
	K_EntryRelated_ID,
	//
	@FlyElement(name="Key Column", description="Key Column for Table", dataType=FlyDataType.String, entityType="D", printName="Key Column", fieldLength=60)
	KeyColumn,
	//
	@FlyElement(name="Keyword", description="Case insensitive keyword", help="Case insensitive keyword for matching. The individual keywords can be separated by space, comma, semicolon, tab or new line. Do not use filler words like 'a', 'the'. At this point, there are NO text search operators like 'or' and 'and'.", dataType=FlyDataType.String, entityType="D", printName="Keyword", fieldLength=60)
	Keyword,
	//
	@FlyElement(name="Keywords", description="List of Keywords - separated by space, comma or semicolon", help="List if individual keywords for search relevancy. The keywords are separated by space, comma or semicolon. ", dataType=FlyDataType.String, entityType="D", printName="Keywords", fieldLength=255)
	Keywords,
	//
	@FlyElement(name="Index", description="Text Search Index", help="Text search index keyword and excerpt across documents", dataType=FlyDataType.ID, entityType="D", printName="Index", fieldLength=10)
	K_INDEX_ID,
	//
	@FlyElement(name="Index Log", description="Text search log", dataType=FlyDataType.ID, entityType="D", printName="Log", fieldLength=10)
	K_IndexLog_ID,
	//
	@FlyElement(name="Index Stop", description="Keyword not to be indexed", help="Keyword not to be indexed, optional restricted to specific Document Type, Container or Request Type", dataType=FlyDataType.ID, entityType="D", printName="Index Stop", fieldLength=10)
	K_IndexStop_ID,
	//
	@FlyElement(name="Knowledge Source", description="Source of a Knowledge Entry", help="The Source of a Knowledge Entry is a pointer to the originating system. The Knowledge Entry has an additional entry (Description URL)  for more detailed info.", dataType=FlyDataType.ID, entityType="D", printName="Knowledge Source", fieldLength=22)
	K_Source_ID,
	//
	@FlyElement(name="Knowledge Synonym", description="Knowledge Keyword Synonym", help="Search Synonyms for Knowledge Keywords; Example: Product = Item", dataType=FlyDataType.ID, entityType="D", printName="Knowledge Synonym", fieldLength=22)
	K_Synonym_ID,
	//
	@FlyElement(name="Knowledge Topic", description="Knowledge Topic", help="Topic or Discussion Thead", dataType=FlyDataType.ID, entityType="D", printName="Topic", fieldLength=22)
	K_Topic_ID,
	//
	@FlyElement(name="Knowledge Type", description="Knowledge Type", help="Area of knowledge - A Type has multiple Topics", dataType=FlyDataType.ID, entityType="D", printName="Type", fieldLength=22)
	K_Type_ID,
	//
	@FlyElement(name="Label Format Type", description="Label Format Type", dataType=FlyDataType.List, entityType="D", printName="Label Format Type", fieldLength=1)
	LabelFormatType,
	//
	@FlyElement(name="Label Height", description="Height of the label", help="Physical height of the label", dataType=FlyDataType.Integer, entityType="D", printName="Label Height", fieldLength=22)
	LabelHeight,
	//
	@FlyElement(name="Label Width", description="Width of the Label", help="Physical Width of the Label", dataType=FlyDataType.Integer, entityType="D", printName="Label Width", fieldLength=22)
	LabelWidth,
	//
	@FlyElement(name="Cost Distribution", description="Landed Cost Distribution", help="How landed costs are distributed to material receipts", dataType=FlyDataType.List, entityType="D", printName="Cost Distribution", fieldLength=1)
	LandedCostDistribution,
	//
	@FlyElement(name="ISO Language Code", description="Lower-case two-letter ISO-3166 code - http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt ", help="The ISO Language Code indicates the standard ISO code for a language in lower case.  Information can be found at http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt ", dataType=FlyDataType.String, entityType="D", printName="ISO Language", fieldLength=2)
	LanguageISO,
	//
	@FlyElement(name="Last Build Info", dataType=FlyDataType.String, entityType="D", printName="Last Build Info", fieldLength=255)
	LastBuildInfo,
	//
	@FlyElement(name="Last Contact", description="Date this individual was last contacted", help="The Last Contact indicates the date that this Business Partner Contact was last contacted.", dataType=FlyDataType.Date, entityType="D", printName="Last Contact", fieldLength=7)
	LastContact,
	//
	@FlyElement(name="Last Deleted", dataType=FlyDataType.Integer, entityType="D", printName="Last Deleted", fieldLength=10)
	LastDeleted,
	//
	@FlyElement(name="Last Lock Time", description="Last time at which the terminal was locked", dataType=FlyDataType.DateTime, entityType="D", printName="Last Lock Time", fieldLength=7)
	LastLockTime,
	//
	@FlyElement(name="Last Maintenance", description="Last Maintenance Date", dataType=FlyDataType.DateTime, entityType="D", printName="Last Maintenance", fieldLength=7)
	LastMaintenanceDate,
	//
	@FlyElement(name="Last Note", description="Last Maintenance Note", dataType=FlyDataType.String, entityType="D", printName="Last Note", fieldLength=60)
	LastMaintenanceNote,
	//
	@FlyElement(name="Last Unit", description="Last Maintenance Unit", dataType=FlyDataType.Integer, entityType="D", printName="Last Unit", fieldLength=10)
	LastMaintenanceUnit,
	//
	@FlyElement(name="Last Maintenance Use Unit", dataType=FlyDataType.Integer, entityType="D", printName="Last Maintenance Use Unit", fieldLength=22)
	LastMaintenanceUseUnit,
	//
	@FlyElement(name="Last Maintenence Date", dataType=FlyDataType.Date, entityType="D", printName="Last Maintenence Date", fieldLength=29)
	LastMaintenenceDate,
	//
	@FlyElement(name="Last Name", description="Last Name of a person", help="The Last Name of a person", dataType=FlyDataType.String, entityType="EE02", printName="Last Name", fieldLength=0)
	LastName,
	//
	@FlyElement(name="Last Recalculated", description="The time last recalculated.", dataType=FlyDataType.DateTime, entityType="D", printName="Last Recalculated", fieldLength=7)
	LastRecalculated,
	//
	@FlyElement(name="Last Result", description="Result of last contact", help="The Last Result identifies the result of the last contact made.", dataType=FlyDataType.String, entityType="D", printName="Last Result", fieldLength=2000)
	LastResult,
	//
	@FlyElement(name="Last Result", description="Contains data on the last check result", help="If we ran into errors etc. you will find the details in here", dataType=FlyDataType.Text, entityType="D", printName="Last Result", fieldLength=2000)
	Last_Result,
	//
	@FlyElement(name="Last Run", dataType=FlyDataType.DateTime, entityType="D", printName="Last Run", fieldLength=10)
	LastRun,
	//
	@FlyElement(name="Last Synchronized", description="Date when last synchronized", dataType=FlyDataType.DateTime, entityType="D", printName="Last Synchronized", fieldLength=7)
	LastSynchronized,
	//
	@FlyElement(name="LDAP Domain", description="Directory service domain name - e.g. adempiere.org", help="If LDAP Host and Domain is specified, the user is authenticated via LDAP. The password in the User table is not used for connecting to Adempiere.", dataType=FlyDataType.String, entityType="D", printName="LDAP Domain", fieldLength=255)
	LDAPDomain,
	//
	@FlyElement(name="LDAP URL", description="Connection String to LDAP server starting with ldap://", help="LDAP connection string, e.g. ldap://dc.adempiere.org", dataType=FlyDataType.String, entityType="D", printName="LDAP URL", fieldLength=60)
	LDAPHost,
	//
	@FlyElement(name="Ldap Port", description="The port the server is listening", help="The default LDAP port is 389", dataType=FlyDataType.Integer, entityType="D", printName="Ldap Port", fieldLength=10)
	LdapPort,
	//
	@FlyElement(name="LDAP Query", dataType=FlyDataType.String, entityType="D", printName="LDAP Query", fieldLength=255)
	LDAPQuery,
	//
	@FlyElement(name="LDAP User Name", description="User Name used for authorization via LDAP (directory) services", help="Optional LDAP system user name for the user. If not defined, the normal Name of the user is used. This allows to use the internal (LDAP) user id (e.g. jjanke) and the normal display name (e.g. Jorg Janke).  The LDAP User Name can also be used without LDAP enables (see system window).  This would allow to sign in as jjanke and use the display name of Jorg Janke.", dataType=FlyDataType.String, entityType="D", printName="LDAP User", fieldLength=60)
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
	@FlyElement(name="Lead Time Offset", description="Optional Lead Time offset before starting production", help="Optional Lead Time offset before starting production", dataType=FlyDataType.Integer, entityType="D", printName="Lead Time Offset", fieldLength=10)
	LeadTimeOffset,
	//
	@FlyElement(name="Lessor", description="The Business Partner who rents or leases", dataType=FlyDataType.Search, entityType="D", printName="Lessor", fieldLength=10)
	Lease_BPartner_ID,
	//
	@FlyElement(name="Lease Termination", description="Lease Termination Date", help="Last Date of Lease", dataType=FlyDataType.Date, entityType="D", printName="Lease Termination", fieldLength=7)
	LeaseTerminationDate,
	//
	@FlyElement(name="Leave Credit Time Type", description="Leave Credit Time Type", help="The Leave Credit Time Type", dataType=FlyDataType.List, entityType="EE02", printName="Leave Credit Time Type", fieldLength=0)
	LeaveCreditTimeType,
	//
	@FlyElement(name="Leave Reason Type", description="Leave Reason Type", dataType=FlyDataType.List, entityType="EE02", printName="Leave Reason Type", fieldLength=0)
	LeaveReasonType,
	//
	@FlyElement(name="Maximum Level", description="Maximum Inventory level for this product", help="Indicates the maximum quantity of this product to be stocked in inventory.", dataType=FlyDataType.Amount, entityType="D", printName="Maximum Level", fieldLength=22)
	Level_Max,
	//
	@FlyElement(name="Minimum Level", description="Minimum Inventory level for this product", help="Indicates the minimum quantity of this product to be stocked in inventory.	", dataType=FlyDataType.Amount, entityType="D", printName="Minimum Level", fieldLength=22)
	Level_Min,
	//
	@FlyElement(name="Level no", dataType=FlyDataType.Integer, entityType="D", printName="Level no", fieldLength=22)
	LevelNo,
	//
	@FlyElement(name="Levels", dataType=FlyDataType.String, entityType="EE01", printName="Levels", fieldLength=250)
	Levels,
	//
	@FlyElement(name="Life use", description="Units of use until the asset is not usable anymore", help="Life use and the actual use may be used to calculate the depreciation", dataType=FlyDataType.Integer, entityType="D", printName="Life use", fieldLength=22)
	LifeUseUnits,
	//
	@FlyElement(name="Duration Limit", description="Maximum Duration in Duration Unit", help="Maximum (critical) Duration for time management purposes (e.g. starting an escalation procedure, etc.) in Duration Units.", dataType=FlyDataType.Integer, entityType="D", printName="Limit", fieldLength=22)
	Limit,
	//
	@FlyElement(name="Limit price Surcharge Amount", description="Amount added to the converted/copied price before multiplying", help="Indicates the amount to be added to the Limit price prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="Limit price Surcharge Amt", fieldLength=22)
	Limit_AddAmt,
	//
	@FlyElement(name="Limit price Base", description="Base price for calculation of the new price", help="Identifies the price to be used as the base for calculating a new price list.", dataType=FlyDataType.List, entityType="D", printName="Limit price Base", fieldLength=1)
	Limit_Base,
	//
	@FlyElement(name="Limit price Discount %", description="Discount in percent to be subtracted from base, if negative it will be added to base price", help="Indicates the discount in percent to be subtracted from base, if negative it will be added to base price", dataType=FlyDataType.Number, entityType="D", printName="Limit price Discount %", fieldLength=22)
	Limit_Discount,
	//
	@FlyElement(name="Fixed Limit Price", description="Fixed Limit Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="Fixed Limit", fieldLength=22)
	Limit_Fixed,
	//
	@FlyElement(name="Limit price max Margin", description="Maximum difference to original limit price; ignored if zero", help="Indicates the maximum margin for a product.  The margin is calculated by subtracting the original limit price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="Limit price max Margin", fieldLength=22)
	Limit_MaxAmt,
	//
	@FlyElement(name="Limit price min Margin", description="Minimum difference to original limit price; ignored if zero", help="Indicates the minimum margin for a product.  The margin is calculated by subtracting the original limit price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="Limit price min Margin", fieldLength=22)
	Limit_MinAmt,
	//
	@FlyElement(name="Limit price Rounding", description="Rounding of the final result", help="A drop down list box which indicates the rounding (if any) will apply to the final prices in this price list.", dataType=FlyDataType.List, entityType="D", printName="Limit price Rounding", fieldLength=1)
	Limit_Rounding,
	//
	@FlyElement(name="Line No", description="Unique line for this document", help="Indicates the unique line for a document.  It will also control the display order of the lines within a document.", dataType=FlyDataType.Integer, entityType="D", printName="Line No", fieldLength=22)
	Line,
	//
	@FlyElement(name="Line Alignment", description="Line Alignment", help="For relative positioning, the line alignment", dataType=FlyDataType.List, entityType="D", printName="Line Alignment", fieldLength=1)
	LineAlignmentType,
	//
	@FlyElement(name="Line Work Complete", description="Date when line work is (planned to be) complete", dataType=FlyDataType.Date, entityType="D", printName="Line Work Complete", fieldLength=7)
	LineDateWorkComplete,
	//
	@FlyElement(name="Line Work Start", description="Date when line work is (planned to be) started", dataType=FlyDataType.Date, entityType="D", printName="Line Work Start", fieldLength=7)
	LineDateWorkStart,
	//
	@FlyElement(name="Line Delivery Days", dataType=FlyDataType.Integer, entityType="D", printName="Line Delivery Days", fieldLength=22)
	LineDeliveryDays,
	//
	@FlyElement(name="Line Description", description="Description of the Line", dataType=FlyDataType.String, entityType="D", printName="Line Description", fieldLength=255)
	LineDescription,
	//
	@FlyElement(name="Line Discount %", description="Line Discount as a percentage", help="The Line Discount Percent indicates the discount for this line as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="Discount %", fieldLength=22)
	LineDiscount,
	//
	@FlyElement(name="Line Discount", description="Line Discount Amount", help="Indicates the discount for this line as an amount.", dataType=FlyDataType.Amount, entityType="D", printName="Discount", fieldLength=22)
	LineDiscountAmt,
	//
	@FlyElement(name="Line Distance", description="Distance between lines", dataType=FlyDataType.Integer, entityType="D", printName="Distance", fieldLength=22)
	LineDistance,
	//
	@FlyElement(name="Line Help/Comment", dataType=FlyDataType.String, entityType="D", printName="Line Comment", fieldLength=2000)
	LineHelp,
	//
	@FlyElement(name="Line ID", description="Transaction line ID (internal)", help="Internal link", dataType=FlyDataType.ID, entityType="D", printName="Line ID", fieldLength=22)
	Line_ID,
	//
	@FlyElement(name="Line Limit Amount", dataType=FlyDataType.Amount, entityType="D", printName="Limit Amt", fieldLength=22)
	LineLimitAmt,
	//
	@FlyElement(name="Line List Amount", dataType=FlyDataType.Amount, entityType="D", printName="List Amt", fieldLength=22)
	LineListAmt,
	//
	@FlyElement(name="Line Margin", description="Margin of the line - Planned Amount minus Costs", dataType=FlyDataType.Amount, entityType="D", printName="Line Margin", fieldLength=22)
	LineMargin,
	//
	@FlyElement(name="Line Amount", description="Line Extended Amount (Quantity * Actual Price) without Freight and Charges", help="Indicates the extended line amount based on the quantity and the actual price.  Any additional charges or freight are not included.  The Amount may or may not include tax.  If the price list is inclusive tax, the line amount is the same as the line total.", dataType=FlyDataType.Amount, entityType="D", printName="Line Amt", fieldLength=22)
	LineNetAmt,
	//
	@FlyElement(name="Line", description="Line No", dataType=FlyDataType.Integer, entityType="D", printName="Line", fieldLength=10)
	LineNo,
	//
	@FlyElement(name="Gross margin %", dataType=FlyDataType.Number, entityType="D", printName="Margin %", fieldLength=22)
	LineOverLimit,
	//
	@FlyElement(name="Gross Margin", dataType=FlyDataType.Amount, entityType="D", printName="Margin", fieldLength=22)
	LineOverLimitAmt,
	//
	@FlyElement(name="Line Color", description="Table line color", dataType=FlyDataType.Table, entityType="D", printName="Line Color", fieldLength=22)
	Line_PrintColor_ID,
	//
	@FlyElement(name="Line Stroke", description="Width of the Line Stroke", help="The width of the line stroke (line thickness) in Points.", dataType=FlyDataType.Number, entityType="D", printName="Line Stroke", fieldLength=22)
	LineStroke,
	//
	@FlyElement(name="Line Stroke Type", description="Type of the Line Stroke", help="Type of the line printed", dataType=FlyDataType.List, entityType="D", printName="Line Stroke Type", fieldLength=1)
	LineStrokeType,
	//
	@FlyElement(name="Line Total", description="Total line amount incl. Tax", help="Total line amount", dataType=FlyDataType.Amount, entityType="D", printName="Line Total", fieldLength=22)
	LineTotalAmt,
	//
	@FlyElement(name="Line Type", dataType=FlyDataType.List, entityType="D", printName="Line Type", fieldLength=1)
	LineType,
	//
	@FlyElement(name="Line Width", description="Width of the lines", dataType=FlyDataType.Integer, entityType="D", printName="Line Width", fieldLength=22)
	LineWidth,
	//
	@FlyElement(name="Link", description="Contains URL to a target", help="A Link should contain info on how to get to more information", dataType=FlyDataType.String, entityType="D", printName="Link", fieldLength=255)
	Link,
	//
	@FlyElement(name="Linked Order", description="This field links a sales order to the purchase order that is generated from it.", dataType=FlyDataType.Table, entityType="D", printName="Linked Order", fieldLength=22)
	Link_Order_ID,
	//
	@FlyElement(name="Linked Order Line", description="This field links a sales order line to the purchase order line that is generated from it.", dataType=FlyDataType.Table, entityType="D", printName="Linked Order Line", fieldLength=22)
	Link_OrderLine_ID,
	//
	@FlyElement(name="LinkURL", description="Contains URL to a target", help="A Link should contain info on how to get to more information", dataType=FlyDataType.String, entityType="D", printName="LinkURL", fieldLength=120)
	LinkURL,
	//
	@FlyElement(name="List price Surcharge Amount", description="List Price Surcharge Amount", help="The List Price Surcharge Amount indicates the amount to be added to the price prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="List price Surcharge Amt", fieldLength=22)
	List_AddAmt,
	//
	@FlyElement(name="List price Base", description="Price used as the basis for price list calculations", help="The List Price Base indicates the price to use as the basis for the calculation of a new price list.", dataType=FlyDataType.List, entityType="D", printName="List price Base", fieldLength=1)
	List_Base,
	//
	@FlyElement(name="List Details", description="List document details", help="The List Details checkbox indicates that the details for each document line will be displayed.", dataType=FlyDataType.YesNo, entityType="D", printName="List Details", fieldLength=1)
	ListDetails,
	//
	@FlyElement(name="List price Discount %", description="Discount from list price as a percentage", help="The List Price Discount Percentage indicates the percentage discount which will be subtracted from the base price.  A negative amount indicates the percentage which will be added to the base price.", dataType=FlyDataType.Number, entityType="D", printName="List price Discount %", fieldLength=22)
	List_Discount,
	//
	@FlyElement(name="Fixed List Price", description="Fixes List Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="Fixed List", fieldLength=22)
	List_Fixed,
	//
	@FlyElement(name="List price max Margin", description="Maximum margin for a product", help="The List Price Max Margin indicates the maximum margin for a product.  The margin is calculated by subtracting the original list price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="List price max Margin", fieldLength=22)
	List_MaxAmt,
	//
	@FlyElement(name="List price min Margin", description="Minimum margin for a product", help="The List Price Min Margin indicates the minimum margin for a product.  The margin is calculated by subtracting the original list price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="List price min Margin", fieldLength=22)
	List_MinAmt,
	//
	@FlyElement(name="List price Rounding", description="Rounding rule for final list price", help="The List Price Rounding indicates how the final list price will be rounded.", dataType=FlyDataType.List, entityType="D", printName="List price Rounding", fieldLength=1)
	List_Rounding,
	//
	@FlyElement(name="List Sources", description="List Report Line Sources", help="List the Source Accounts for Summary Accounts selected", dataType=FlyDataType.YesNo, entityType="D", printName="List Sources", fieldLength=1)
	ListSources,
	//
	@FlyElement(name="List Transactions", description="List the report transactions", help="List the transactions of the report source lines", dataType=FlyDataType.YesNo, entityType="D", printName="List Trx", fieldLength=1)
	ListTrx,
	//
	@FlyElement(name="Sequence", dataType=FlyDataType.Integer, entityType="D", printName="Sequence", fieldLength=22)
	LoadSeq,
	//
	@FlyElement(name="Local Host", description="Local Host Info", dataType=FlyDataType.String, entityType="D", printName="Local Host", fieldLength=120)
	Local_Host,
	//
	@FlyElement(name="Location comment", description="Additional comments or remarks concerning the location", dataType=FlyDataType.String, entityType="D", printName="Location comment", fieldLength=255)
	LocationComment,
	//
	@FlyElement(name="Locator To Key", dataType=FlyDataType.String, entityType="EE01", printName="Locator To Key", fieldLength=40)
	LocatorToValue,
	//
	@FlyElement(name="Locator Key", description="Key of the Warehouse Locator", dataType=FlyDataType.String, entityType="D", printName="Locator Key", fieldLength=40)
	LocatorValue,
	//
	@FlyElement(name="Locked", description="Whether the terminal is locked", dataType=FlyDataType.YesNo, entityType="D", printName="Locked", fieldLength=1)
	Locked,
	//
	@FlyElement(name="Lock Time", description="Time in minutes the terminal should be kept in a locked state.", dataType=FlyDataType.Integer, entityType="D", printName="Lock Time", fieldLength=10)
	LockTime,
	//
	@FlyElement(name="Locode", description="Location code - UN/LOCODE ", help="UN/Locode is a combination of a 2-character country code and a 3-character location code, e.g. BEANR is known as the city of Antwerp (ANR) which is located in Belgium (BE).	<p>See: http://www.unece.org/cefact/locode/service/main.htm", dataType=FlyDataType.String, entityType="D", printName="Locode", fieldLength=10)
	Locode,
	//
	@FlyElement(name="Logger", description="Logger Name", dataType=FlyDataType.String, entityType="D", printName="Logger", fieldLength=60)
	LoggerName,
	//
	@FlyElement(name="Login date", dataType=FlyDataType.Date, entityType="D", printName="Login date", fieldLength=10)
	LoginDate,
	//
	@FlyElement(name="Logo", dataType=FlyDataType.Image, entityType="D", printName="Logo", fieldLength=10)
	Logo_ID,
	//
	@FlyElement(name="Logo Report", dataType=FlyDataType.Image, entityType="D", printName="Logo Report", fieldLength=10)
	LogoReport_ID,
	//
	@FlyElement(name="Logo Web", dataType=FlyDataType.Image, entityType="D", printName="Logo Web", fieldLength=10)
	LogoWeb_ID,
	//
	@FlyElement(name="Log Type", description="Web Log Type", dataType=FlyDataType.List, entityType="D", printName="Log Type", fieldLength=1)
	LogType,
	//
	@FlyElement(name="Lookup ClassName", description="The class name of the postcode lookup plugin", help="Enter the class name of the post code lookup plugin for your postcode web service provider", dataType=FlyDataType.String, entityType="D", printName="Lookup ClassName", fieldLength=255)
	LookupClassName,
	//
	@FlyElement(name="Lookup Client ID", description="The ClientID or Login submitted to the Lookup URL", help="Enter the ClientID or Login for your account provided by the post code web service provider", dataType=FlyDataType.String, entityType="D", printName="Lookup Client ID", fieldLength=50)
	LookupClientID,
	//
	@FlyElement(name="Lookup Password", description="The password submitted to the Lookup URL", help="Enter the password for your account provided by the post code web service provider", dataType=FlyDataType.String, entityType="D", printName="Lookup Password", fieldLength=50)
	LookupPassword,
	//
	@FlyElement(name="Lookup URL", description="The URL of the web service that the plugin connects to in order to retrieve postcode data", help="Enter the URL of the web service that the plugin connects to in order to retrieve postcode data", dataType=FlyDataType.String, entityType="D", printName="Lookup URL", fieldLength=100)
	LookupUrl,
	//
	@FlyElement(name="Lot No", description="Lot number (alphanumeric)", help="The Lot Number indicates the specific lot that a product was part of.", dataType=FlyDataType.String, entityType="D", printName="Lot No", fieldLength=40)
	Lot,
	//
	@FlyElement(name="Lot Char End Overwrite", description="Lot/Batch End Indicator overwrite - default »", help="If not defined, the default character » is used", dataType=FlyDataType.String, entityType="D", printName="Lot Char End", fieldLength=1)
	LotCharEOverwrite,
	//
	@FlyElement(name="Lot Char Start Overwrite", description="Lot/Batch Start Indicator overwrite - default «", help="If not defined, the default character « is used", dataType=FlyDataType.String, entityType="D", printName="Lot Char Start", fieldLength=1)
	LotCharSOverwrite,
	//
	@FlyElement(name="Low Level", description="The Low Level is used to calculate the material plan and determines if a net requirement should be exploited", dataType=FlyDataType.Integer, entityType="EE01", printName="Low Level", fieldLength=8)
	LowLevel,
	//
	@FlyElement(name="Macro", description="Macro", dataType=FlyDataType.Text, entityType="D", printName="Macro", fieldLength=2000)
	Macro,
	//
	@FlyElement(name="Subject", description="Mail Header (Subject)", help="The subject of the mail message", dataType=FlyDataType.String, entityType="D", printName="Subject", fieldLength=2000)
	MailHeader,
	//
	@FlyElement(name="Message Type", description="Mail Message Type", dataType=FlyDataType.List, entityType="D", printName="Message Type", fieldLength=2)
	MailMsgType,
	//
	@FlyElement(name="Mail Text", description="Text used for Mail message", help="The Mail Text indicates the text used for mail messages.", dataType=FlyDataType.Text, entityType="D", printName="Mail Text", fieldLength=2000)
	MailText,
	//
	@FlyElement(name="Mail Text 2", description="Optional second text part used for Mail message", help="The Mail Text indicates the text used for mail messages.", dataType=FlyDataType.Text, entityType="D", printName="Mail Text 2", fieldLength=2000)
	MailText2,
	//
	@FlyElement(name="Mail Text 3", description="Optional third text part used for Mail message", help="The Mail Text indicates the text used for mail messages.", dataType=FlyDataType.Text, entityType="D", printName="Mail Text 3", fieldLength=2000)
	MailText3,
	//
	@FlyElement(name="Maintenance Mode", description="Language Maintenance Mode", dataType=FlyDataType.NONE, entityType="D", printName="Maintenance Mode", fieldLength=0)
	MaintenanceMode,
	//
	@FlyElement(name="Mandatory Logic", dataType=FlyDataType.Text, entityType="D", printName="Mandatory Logic", fieldLength=2000)
	MandatoryLogic,
	//
	@FlyElement(name="Mandatory Type", description="The specification of a Product Attribute Instance is mandatory", dataType=FlyDataType.List, entityType="D", printName="Mandatory Type", fieldLength=1)
	MandatoryType,
	//
	@FlyElement(name="Manual Actual", description="Manually entered actual value", help="The Manual Active identifies a manually entered actual measurement value.", dataType=FlyDataType.Number, entityType="D", printName="Manual Actual", fieldLength=22)
	ManualActual,
	//
	@FlyElement(name="Note", description="Note for manual entry", help="The Note allows for entry for additional information regarding a manual entry.", dataType=FlyDataType.Text, entityType="D", printName="Note", fieldLength=2000)
	ManualNote,
	//
	@FlyElement(name="Manufactured Year", dataType=FlyDataType.NONE, entityType="D", printName="Manufactured Year", fieldLength=0)
	ManufacturedYear,
	//
	@FlyElement(name="Manufacturer", description="Manufacturer of the Product", help="The manufacturer of the Product (used if different from the Business Partner / Vendor)", dataType=FlyDataType.String, entityType="D", printName="Manufacturer", fieldLength=30)
	Manufacturer,
	//
	@FlyElement(name="Manufacturer", dataType=FlyDataType.NONE, entityType="D", printName="Manufacturer", fieldLength=0)
	Manufacturer_ID,
	//
	@FlyElement(name="Manufacturing Resource Type", dataType=FlyDataType.List, entityType="EE01", printName="Manufacturing Resource Type", fieldLength=2)
	ManufacturingResourceType,
	//
	@FlyElement(name="Manufacturing Order Mail Text", description="Email text used for sending Manufacturing Order", help="Standard email template used to send Manufacturing Order as attachments.", dataType=FlyDataType.Table, entityType="EE01", printName="Manufacturing Order Text", fieldLength=22)
	Manuf_Order_MailText_ID,
	//
	@FlyElement(name="Manufacturing Order Print Format", description="Print Format for printing Manufacturing Order", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="EE01", printName="Manufacturing Order Print Format", fieldLength=22)
	Manuf_Order_PrintFormat_ID,
	//
	@FlyElement(name="Margin %", description="Margin for a product as a percentage", help="The Margin indicates the margin for this product as a percentage of the limit price and selling price.", dataType=FlyDataType.Number, entityType="D", printName="Margin %", fieldLength=22)
	Margin,
	//
	@FlyElement(name="Margin Amount", description="Difference between actual and limit price multiplied by the quantity", help="The margin amount is calculated as the difference between actual and limit price multiplied by the quantity", dataType=FlyDataType.Amount, entityType="D", printName="Margin Amt", fieldLength=22)
	MarginAmt,
	//
	@FlyElement(name="Bottom Margin", description="Bottom Space in 1/72 inch", help="Space on bottom of a page in 1/72 inch", dataType=FlyDataType.Integer, entityType="D", printName="Bottom", fieldLength=22)
	MarginBottom,
	//
	@FlyElement(name="Left Margin", description="Left Space in 1/72 inch", help="Space on left side of a page in 1/72 inch", dataType=FlyDataType.Integer, entityType="D", printName="Left", fieldLength=22)
	MarginLeft,
	//
	@FlyElement(name="Right Margin", description="Right Space in 1/72 inch", help="Space on right side of a page in 1/72 inch", dataType=FlyDataType.Integer, entityType="D", printName="Right", fieldLength=22)
	MarginRight,
	//
	@FlyElement(name="Top Margin", description="Top Space in 1/72 inch", help="Space on top of a page in 1/72 inch", dataType=FlyDataType.Integer, entityType="D", printName="Top", fieldLength=22)
	MarginTop,
	//
	@FlyElement(name="Marital Status", dataType=FlyDataType.List, entityType="EE02", printName="Marital Status", fieldLength=2)
	MaritalStatus,
	//
	@FlyElement(name="Mark 1 Percent", description="Percentage up to this color is used", help="Example 50 - i.e. below 50% this color is used", dataType=FlyDataType.Integer, entityType="D", printName="Mark 1 Percent", fieldLength=10)
	Mark1Percent,
	//
	@FlyElement(name="Mark 2 Percent", description="Percentage up to this color is used", help="Example 80 - e.g., if Mark 1 is 50 - this color is used between 50% and 80%", dataType=FlyDataType.Integer, entityType="D", printName="Mark 2 Percent", fieldLength=10)
	Mark2Percent,
	//
	@FlyElement(name="Mark 3 Percent", description="Percentage up to this color is used", help="Example 100 - e.g., if Mark 2 is 80 - this color is used between 80% and 100%", dataType=FlyDataType.Integer, entityType="D", printName="Mark 3 Percent", fieldLength=10)
	Mark3Percent,
	//
	@FlyElement(name="Mark 4 Percent", description="Percentage up to this color is used", help="Example 9999 - e.g., if Mark 3 is 100 - this color is used above 100%", dataType=FlyDataType.Integer, entityType="D", printName="Mark 4 Percent", fieldLength=10)
	Mark4Percent,
	//
	@FlyElement(name="Marriage Anniversary Date", description="Marriage Anniversary Date", help="Marriage Anniversary Date", dataType=FlyDataType.Date, entityType="EE02", printName="Marriage Anniversary Date", fieldLength=0)
	MarriageAnniversaryDate,
	//
	@FlyElement(name="Match Code", description="String identifying related accounting facts", dataType=FlyDataType.NONE, entityType="D", printName="Match Code", fieldLength=0)
	MatchCode,
	//
	@FlyElement(name="Match Requirement", description="Matching Requirement for Invoice", dataType=FlyDataType.NONE, entityType="D", printName="Match", fieldLength=0)
	MatchRequirement,
	//
	@FlyElement(name="Match Statement", dataType=FlyDataType.Button, entityType="D", printName="Match Statement", fieldLength=1)
	MatchStatement,
	//
	@FlyElement(name="Attribute", description="Product Attribute", help="Product Attribute like Color, Size", dataType=FlyDataType.TableDirect, entityType="D", printName="Attribute", fieldLength=22)
	M_Attribute_ID,
	//
	@FlyElement(name="Attribute Search", description="Common Search Attribute ", help="Attributes are specific to a Product Attribute Set (e.g. Size for T-Shirts: S,M,L). If you have multiple attributes and want to search under a common attribute, you define a search attribute. Example: have one Size search attribute combining the values of all different sizes (Size for Dress Shirt  XL,L,M,S,XS). The Attribute Search allows you to have all values available for selection.  This eases the maintenance of the individual product attribute.", dataType=FlyDataType.ID, entityType="D", printName="Attribute Search", fieldLength=22)
	M_AttributeSearch_ID,
	//
	@FlyElement(name="Exclude Attribute Set", description="Exclude the ability to enter Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude Attribute Set", fieldLength=10)
	M_AttributeSetExclude_ID,
	//
	@FlyElement(name="Attribute Set", description="Product Attribute Set", help="Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking.", dataType=FlyDataType.TableDirect, entityType="D", printName="Attribute Set", fieldLength=22)
	M_AttributeSet_ID,
	//
	@FlyElement(name="Attribute Set Instance", description="Product Attribute Set Instance", help="The values of the actual Product Attribute Instances.  The product level attributes are defined on Product level.", dataType=FlyDataType.ProductAttribute, entityType="D", printName="Attribute Set Instance", fieldLength=22)
	M_AttributeSetInstance_ID,
	//
	@FlyElement(name="Attribute Set Instance To", description="Target Product Attribute Set Instance", dataType=FlyDataType.ProductAttribute, entityType="D", printName="Attribute Set Instance To", fieldLength=10)
	M_AttributeSetInstanceTo_ID,
	//
	@FlyElement(name="Attribute Value", description="Product Attribute Value", help="Individual value of a product attribute (e.g. green, large, ..)", dataType=FlyDataType.ID, entityType="D", printName="Attribute Value", fieldLength=22)
	M_AttributeValue_ID,
	//
	@FlyElement(name="Max Amount", description="Maximum Amount in invoice currency", help="The Maximum Amount indicates the maximum amount in invoice currency.", dataType=FlyDataType.Amount, entityType="D", printName="Max Amt", fieldLength=22)
	MaxAmt,
	//
	@FlyElement(name="Max Click Count", description="Maximum Click Count until banner is deactivated", help="A banner has a maximum number of clicks after which it will get deactivated", dataType=FlyDataType.Integer, entityType="D", printName="Max Click Count", fieldLength=10)
	MaxClick,
	//
	@FlyElement(name="Maximum continous leaves", description="Maximum continous leaves", dataType=FlyDataType.Number, entityType="EE02", printName="Maximum continous leaves", fieldLength=0)
	MaxContinousLeaves,
	//
	@FlyElement(name="Max Height", description="Maximum Height in 1/72 if an inch - 0 = no restriction", help="Maximum height of the element in 1/72 of an inch (point). If zero (0), there is no height restriction.", dataType=FlyDataType.Integer, entityType="D", printName="Max Height", fieldLength=22)
	MaxHeight,
	//
	@FlyElement(name="Max Impression Count", description="Maximum Impression Count until banner is deactivated", help="A banner has a maximum number of impressions after which it will get deactivated", dataType=FlyDataType.Integer, entityType="D", printName="Max Impression Count", fieldLength=10)
	MaxImpression,
	//
	@FlyElement(name="Maximum Volume", dataType=FlyDataType.Number, entityType="EE03", printName="Maximum Volume", fieldLength=0)
	MaximumVolume,
	//
	@FlyElement(name="Maximum Weight", dataType=FlyDataType.Number, entityType="EE03", printName="Maximum Weight", fieldLength=0)
	MaximumWeight,
	//
	@FlyElement(name="Maximum write-off per Invoice", description="Maximum invoice amount to be written off in invoice currency", dataType=FlyDataType.NONE, entityType="D", printName="Maximum write-off per Invoice", fieldLength=0)
	MaxInvWriteOffAmt,
	//
	@FlyElement(name="Maximum leaves carry forwarded", description="Maximum leaves carry forwarded", dataType=FlyDataType.Number, entityType="EE02", printName="Maximum leaves carry forwarded", fieldLength=0)
	MaxLeavesToForward,
	//
	@FlyElement(name="Maximum Length", description="Maximum Length of Data", dataType=FlyDataType.NONE, entityType="D", printName="Maximum Length", fieldLength=0)
	MaxLength,
	//
	@FlyElement(name="Max Query Records", description="If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records", help="Enter the number of records a user will be able to query to avoid unnecessary system load.  If 0, no restrictions are imposed.", dataType=FlyDataType.Integer, entityType="D", printName="Max Query Records", fieldLength=10)
	MaxQueryRecords,
	//
	@FlyElement(name="Max Taxable", dataType=FlyDataType.Integer, entityType="EE04", printName="Max Taxable", fieldLength=10)
	MaxTaxable,
	//
	@FlyElement(name="Max Value", dataType=FlyDataType.Integer, entityType="EE02", printName="Max Value", fieldLength=10)
	MaxValue,
	//
	@FlyElement(name="Max Width", description="Maximum Width in 1/72 if an inch - 0 = no restriction", help="Maximum width of the element in 1/72 of an inch (point). If zero (0), there is no width restriction.", dataType=FlyDataType.Integer, entityType="D", printName="Max Width", fieldLength=22)
	MaxWidth,
	//
	@FlyElement(name="Alternative Group", description="Product BOM Alternative Group", help="Alternative groups allow you to group Bill of Material components, which are exclusive (i.e. only one is valid). Examples different engine sizes.", dataType=FlyDataType.ID, entityType="D", printName="Alternative Group", fieldLength=10)
	M_BOMAlternative_ID,
	//
	@FlyElement(name="BOM", description="Bill of Material", help="The composition of the Product", dataType=FlyDataType.ID, entityType="D", printName="BOM", fieldLength=10)
	M_BOM_ID,
	//
	@FlyElement(name="BOM Component", description="Bill of Material Component (Product)", help="The Bill of Material Component determines what products, services and outside processing is included in producing the Product. It references the operation and determines it's sequence.", dataType=FlyDataType.ID, entityType="D", printName="BOM Component", fieldLength=10)
	M_BOMProduct_ID,
	//
	@FlyElement(name="Business Partner Price", dataType=FlyDataType.ID, entityType="D", printName="Business Partner Price", fieldLength=22)
	M_BP_Price_ID,
	//
	@FlyElement(name="Change Notice", description="Bill of Materials (Engineering) Change Notice (Version)", dataType=FlyDataType.TableDirect, entityType="D", printName="Change Notice", fieldLength=10)
	M_ChangeNotice_ID,
	//
	@FlyElement(name="Change Request", description="BOM (Engineering) Change Request", help="Change requests for a Bill of Materials. They can be automatically created from Requests, if enabled in the Request Type and the Request Group refers to a Bill of Materials", dataType=FlyDataType.ID, entityType="D", printName="Change Request", fieldLength=10)
	M_ChangeRequest_ID,
	//
	@FlyElement(name="Product Classification Parent", dataType=FlyDataType.NONE, entityType="D", printName="Product Classification Parent", fieldLength=0)
	M_Classification_Parent_ID,
	//
	@FlyElement(name="Cost Detail", description="Cost Detail Information", dataType=FlyDataType.ID, entityType="D", printName="Cost Detail", fieldLength=10)
	M_CostDetail_ID,
	//
	@FlyElement(name="Cost Element", description="Product Cost Element", dataType=FlyDataType.TableDirect, entityType="D", printName="Cost Element", fieldLength=10)
	M_CostElement_ID,
	//
	@FlyElement(name="Cost Queue", description="FiFo/LiFo Cost Queue", help="Note that the cost queue may not be the same as the physical movement cost queue due to differences in costing level and warehouse priority.", dataType=FlyDataType.ID, entityType="D", printName="Cost Queue", fieldLength=10)
	M_CostQueue_ID,
	//
	@FlyElement(name="Cost Type", description="Type of Cost (e.g. Current, Plan, Future)", help="You can define multiple cost types. A cost type selected in an Accounting Schema is used for accounting.", dataType=FlyDataType.ID, entityType="D", printName="Cost Type", fieldLength=22)
	M_CostType_ID,
	//
	@FlyElement(name="Demand Detail", description="Material Demand Line Source Detail", help="Source Link for Material Demand Lines", dataType=FlyDataType.ID, entityType="D", printName="Demand Detail", fieldLength=22)
	M_DemandDetail_ID,
	//
	@FlyElement(name="Demand", description="Material Demand", help="Material Demand can be based on Forecast, Requisitions, Open Orders", dataType=FlyDataType.TableDirect, entityType="D", printName="Demand", fieldLength=22)
	M_Demand_ID,
	//
	@FlyElement(name="Demand Line", description="Material Demand Line", help="Demand for a product in a period", dataType=FlyDataType.ID, entityType="D", printName="Demand Line", fieldLength=22)
	M_DemandLine_ID,
	//
	@FlyElement(name="Discount Schema Break", description="Trade Discount Break", help="Trade discount based on breaks (steps)", dataType=FlyDataType.ID, entityType="D", printName="Discount Schema Break", fieldLength=22)
	M_DiscountSchemaBreak_ID,
	//
	@FlyElement(name="Discount Schema", description="Schema to calculate the trade discount percentage", help="After calculation of the (standard) price, the trade discount percentage is calculated and applied resulting in the final price.", dataType=FlyDataType.Table, entityType="D", printName="Discount Schema", fieldLength=22)
	M_DiscountSchema_ID,
	//
	@FlyElement(name="Discount Pricelist", description="Line of the pricelist trade discount schema", help="For the Pricelist Discount Type, you enter how the list, standard and limit price is calculated.", dataType=FlyDataType.ID, entityType="D", printName="Discount Pricelist", fieldLength=22)
	M_DiscountSchemaLine_ID,
	//
	@FlyElement(name="Distribution List", description="Distribution Lists allow to distribute products to a selected list of partners", help="Distribution list contain business partners and a distribution quantity or ratio for creating Orders", dataType=FlyDataType.TableDirect, entityType="D", printName="Distribution List", fieldLength=22)
	M_DistributionList_ID,
	//
	@FlyElement(name="Distribution List Line", description="Distribution List Line with Business Partner and Quantity/Percentage", help="The distribution can be based on Ratio, fixed quantity or both.	If the ratio and quantity is not 0, the quantity is calculated based on the ratio, but with the Quantity as a minimum.", dataType=FlyDataType.ID, entityType="D", printName="Distribution List Line", fieldLength=22)
	M_DistributionListLine_ID,
	//
	@FlyElement(name="Distribution Run", description="Distribution Run create Orders to distribute products to a selected list of partners", help="Distribution Run defines how Orders are created based on Distribution Lists", dataType=FlyDataType.ID, entityType="D", printName="Distribution Run", fieldLength=22)
	M_DistributionRun_ID,
	//
	@FlyElement(name="Distribution Run Line", description="Distribution Run Lines define Distribution List, the Product and Quantities", help="The order amount is based on the greater of the minimums of the product or distribution list and the quantity based on the ratio.", dataType=FlyDataType.ID, entityType="D", printName="Distribution Run Line", fieldLength=22)
	M_DistributionRunLine_ID,
	//
	@FlyElement(name="Measure Actual", description="Actual value that has been measured.", help="The Measure Actual indicates the actual measured value. The measured values are used in determining if a performance goal has been met", dataType=FlyDataType.Number, entityType="D", printName="Measure Actual", fieldLength=22)
	MeasureActual,
	//
	@FlyElement(name="Measure Data Type", description="Type of data - Status or in Time", help="Status represents values valid at a certain time (e.g. Open Invoices) - No history is maintained.<br>	Time represents a values at a given time (e.g. Invoice Amount on 1/1) - History is maintained", dataType=FlyDataType.List, entityType="D", printName="Data Type", fieldLength=1)
	MeasureDataType,
	//
	@FlyElement(name="Measure Display", description="Measure Scope initially displayed", dataType=FlyDataType.List, entityType="D", printName="Measure Display", fieldLength=1)
	MeasureDisplay,
	//
	@FlyElement(name="Measure Request Code", description="String for  taking measurement from Device Electronic Scales", dataType=FlyDataType.String, entityType="D", printName="Measure Request Code", fieldLength=20)
	MeasureRequestCode,
	//
	@FlyElement(name="Measure Scope", description="Performance Measure Scope", help="The scope of the goal can be broken down for initial display. 	Example: Scope is Year, Display is Month - the goal is entered as a yearly number, the display divides the goal by 12", dataType=FlyDataType.List, entityType="D", printName="Measure Scope", fieldLength=1)
	MeasureScope,
	//
	@FlyElement(name="Measure Target", description="Target value for measure", help="The Measure Target indicates the target or goal for this measure.  It is used as in comparing against the actual measures", dataType=FlyDataType.Number, entityType="D", printName="Measure Target", fieldLength=22)
	MeasureTarget,
	//
	@FlyElement(name="Measure Type", description="Determines how the actual performance is derived", help="The Measure Type indicates how the actual measure is determined.  For example, one measure may be manual while another is calculated.", dataType=FlyDataType.List, entityType="D", printName="Measure Type", fieldLength=1)
	MeasureType,
	//
	@FlyElement(name="Media Size", description="Java Media Size", help="The Java Media Size. Example: 'MediaSize.ISO.A4' (the package javax.print.attribute.standard is assumed). If you define your own media size, use the fully qualified name.	If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.String, entityType="D", printName="Media Size", fieldLength=40)
	MediaSize,
	//
	@FlyElement(name="Media Type", description="Defines the media type for the browser", help="The browser and the media server need info on the type of content", dataType=FlyDataType.List, entityType="D", printName="Media Type", fieldLength=3)
	MediaType,
	//
	@FlyElement(name="EDI Transaction", dataType=FlyDataType.ID, entityType="D", printName="EDI Trx", fieldLength=22)
	M_EDI_ID,
	//
	@FlyElement(name="EDI Log", dataType=FlyDataType.ID, entityType="D", printName="EDI Log", fieldLength=22)
	M_EDI_Info_ID,
	//
	@FlyElement(name="Memo", description="Memo Text", dataType=FlyDataType.String, entityType="D", printName="Memo", fieldLength=255)
	Memo,
	//
	@FlyElement(name="Menu Link", dataType=FlyDataType.String, entityType="D", printName="Menu Link", fieldLength=510)
	MenuLink,
	//
	@FlyElement(name="Message", description="EMail Message", help="Message of the EMail", dataType=FlyDataType.Text, entityType="D", printName="Message", fieldLength=2000)
	Message,
	//
	@FlyElement(name="Message 2", description="Optional second part of the EMail Message", help="Message of the EMail", dataType=FlyDataType.Text, entityType="D", printName="Message 2", fieldLength=2000)
	Message2,
	//
	@FlyElement(name="Message 3", description="Optional third part of the EMail Message", help="Message of the EMail", dataType=FlyDataType.Text, entityType="D", printName="Message 3", fieldLength=2000)
	Message3,
	//
	@FlyElement(name="Message ID", description="EMail Message ID", help="SMTP Message ID for tracking purposes", dataType=FlyDataType.String, entityType="D", printName="Message ID", fieldLength=120)
	MessageID,
	//
	@FlyElement(name="Meta Author", description="Author of the content", help="Author of the content for the Containers Meta Data", dataType=FlyDataType.String, entityType="D", printName="Meta Author", fieldLength=2000)
	Meta_Author,
	//
	@FlyElement(name="Meta Content Type", description="Defines the type of content i.e. 'text/html; charset=UTF-8'", help="With this tag you can overwrite the type of content and how search engines will interpret it. You should keep in mind that this will not influence how the Server and Client interpret the content.", dataType=FlyDataType.String, entityType="D", printName="Meta Content Type", fieldLength=2000)
	Meta_Content,
	//
	@FlyElement(name="Meta Copyright", description="Contains Copyright information for the content", help="This Tag contains detailed information about the content's copyright situation, how holds it for which timeframe etc.", dataType=FlyDataType.String, entityType="D", printName="Meta Copyright", fieldLength=2000)
	Meta_Copyright,
	//
	@FlyElement(name="Meta Description", description="Meta info describing the contents of the page", help="The Meta Description tag should contain a short description on the page content", dataType=FlyDataType.Text, entityType="D", printName="Meta Description", fieldLength=2000)
	Meta_Description,
	//
	@FlyElement(name="Meta Keywords", description="Contains the keywords for the content", help="Contains keyword info on the main search words this content is relevant to", dataType=FlyDataType.Text, entityType="D", printName="Meta Keywords", fieldLength=2000)
	Meta_Keywords,
	//
	@FlyElement(name="Meta Language", description="Language HTML Meta Tag", dataType=FlyDataType.String, entityType="D", printName="Meta Language", fieldLength=2)
	Meta_Language,
	//
	@FlyElement(name="Meta Publisher", description="Meta Publisher defines the publisher of the content", help="As author and publisher must not be the same person this tag saves the responsible publisher for the content", dataType=FlyDataType.String, entityType="D", printName="Meta Publisher", fieldLength=2000)
	Meta_Publisher,
	//
	@FlyElement(name="Meta RobotsTag", description="RobotsTag defines how search robots should handle this content", help="The Meta Robots Tag define on how a search engines robot should handle this page and the following ones. It defines two keywords: (NO)INDEX which defines whether or not to index this content and (NO)FOLLOW which defines whether or not to follow links. The most common combination is INDEX,FOLLOW which will force a search robot to index the content and follow links and images.", dataType=FlyDataType.String, entityType="D", printName="Meta RobotsTag", fieldLength=2000)
	Meta_RobotsTag,
	//
	@FlyElement(name="Method Change Variance", dataType=FlyDataType.CostsPrices, entityType="EE01", printName="Method Change Variance", fieldLength=0)
	MethodChangeVariance,
	//
	@FlyElement(name="Fixed in", description="Fixed in Change Notice", dataType=FlyDataType.Table, entityType="D", printName="Fixed in", fieldLength=10)
	M_FixChangeNotice_ID,
	//
	@FlyElement(name="Forecast", description="Material Forecast", help="Material Forecast", dataType=FlyDataType.ID, entityType="D", printName="Forecast", fieldLength=22)
	M_Forecast_ID,
	//
	@FlyElement(name="Forecast Line", description="Forecast Line", help="Forecast of Product Qyantity by Period", dataType=FlyDataType.Search, entityType="D", printName="Forecast Line", fieldLength=22)
	M_ForecastLine_ID,
	//
	@FlyElement(name="Freight Category", description="Category of the Freight", help="Freight Categories are used to calculate the Freight for the Shipper selected", dataType=FlyDataType.ID, entityType="D", printName="Freight Category", fieldLength=22)
	M_FreightCategory_ID,
	//
	@FlyElement(name="Freight", description="Freight Rate", help="Freight Rate for Shipper", dataType=FlyDataType.ID, entityType="D", printName="Freight", fieldLength=22)
	M_Freight_ID,
	//
	@FlyElement(name="Fixed Asset Class", dataType=FlyDataType.NONE, entityType="D", printName="Fixed Asset Class", fieldLength=0)
	MFX_Clasa,
	//
	@FlyElement(name="Fixed Asset Group", dataType=FlyDataType.NONE, entityType="D", printName="Fixed Asset Group", fieldLength=0)
	MFX_Grupa,
	//
	@FlyElement(name="Fixed Asset Subclass", dataType=FlyDataType.NONE, entityType="D", printName="Fixed Asset Subclass", fieldLength=0)
	MFX_SubClasa,
	//
	@FlyElement(name="Fixed Asset Subgroup", dataType=FlyDataType.NONE, entityType="D", printName="Fixed Asset SubGroup", fieldLength=0)
	MFX_SubGrupa,
	//
	@FlyElement(name="Micr", description="Combination of routing no, account and check no", help="The Micr number is the combination of the bank routing number, account number and check number", dataType=FlyDataType.String, entityType="D", printName="Micr", fieldLength=20)
	Micr,
	//
	@FlyElement(name="Middle Name", description="Middle Name of a person", help="The Middle Name of a person", dataType=FlyDataType.String, entityType="EE02", printName="Middle Name", fieldLength=0)
	MiddleName,
	//
	@FlyElement(name="Min Amount", description="Minimum Amount in invoice currency", help="The Minimum amount indicates the minimum amount as stated in the currency of the invoice.", dataType=FlyDataType.Amount, entityType="D", printName="Min Amt", fieldLength=22)
	MinAmt,
	//
	@FlyElement(name="Minimum Attendance Require", description="Minimum Attendance Require to elgibile leave", help="Minimum Attendance Require to elgibile leave", dataType=FlyDataType.Number, entityType="EE02", printName="Minimum Attendance Require", fieldLength=0)
	MinAttendanceRequire,
	//
	@FlyElement(name="Minimum Encashment Days in a Request", description="Minimum Encashment Days in a Request", help="The Minimum Encashment Days in a Request", dataType=FlyDataType.Amount, entityType="EE02", printName="Minimum Encashment Days in a Request", fieldLength=0)
	MinForencashmentDays,
	//
	@FlyElement(name="Minimum Amt", description="Minimum Amount in Document Currency", dataType=FlyDataType.Amount, entityType="D", printName="Minimum Amt", fieldLength=22)
	MinimumAmt,
	//
	@FlyElement(name="Minimum Volume", dataType=FlyDataType.Number, entityType="EE03", printName="Minimum Volume", fieldLength=0)
	MinimumVolume,
	//
	@FlyElement(name="Minimum Weight", description="Minimum Weight of a product", help="The Minimum Weight indicates the weight  of the product in the Weight UOM of the Client", dataType=FlyDataType.Amount, entityType="EE03", printName="Minimum Weight", fieldLength=0)
	MinimumWeight,
	//
	@FlyElement(name="Ship/Receipt Confirmation", description="Material Shipment or Receipt Confirmation", help="Confirmation of Shipment or Receipt - Created from the Shipment/Receipt", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm", fieldLength=22)
	M_InOutConfirm_ID,
	//
	@FlyElement(name="Shipment/Receipt", description="Material Shipment Document", help="The Material Shipment / Receipt ", dataType=FlyDataType.ID, entityType="D", printName="Shipment/Receipt", fieldLength=22)
	M_InOut_ID,
	//
	@FlyElement(name="Ship/Receipt Confirmation Line", description="Material Shipment or Receipt Confirmation Line", help="Confirmation details", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm Line", fieldLength=22)
	M_InOutLineConfirm_ID,
	//
	@FlyElement(name="Shipment/Receipt Line", description="Line on Shipment or Receipt document", help="The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document", dataType=FlyDataType.ID, entityType="D", printName="Shipment/Receipt Line", fieldLength=22)
	M_InOutLine_ID,
	//
	@FlyElement(name="Minimum Quantity", description="Minimum quantity for the business partner", help="If a minimum quantity is defined, and the quantity is based on the percentage is lower, the minimum quantity is used.", dataType=FlyDataType.Quantity, entityType="D", printName="Min Qty", fieldLength=22)
	MinQty,
	//
	@FlyElement(name="Min Taxable", dataType=FlyDataType.Integer, entityType="EE04", printName="Min Taxable", fieldLength=10)
	MinTaxable,
	//
	@FlyElement(name="Min Value", dataType=FlyDataType.Integer, entityType="EE02", printName="Min Value", fieldLength=10)
	MinValue,
	//
	@FlyElement(name="Phys.Inventory", description="Parameters for a Physical Inventory", help="The Physical Inventory indicates a unique parameters for a physical inventory.", dataType=FlyDataType.ID, entityType="D", printName="Phys.Inventory", fieldLength=22)
	M_Inventory_ID,
	//
	@FlyElement(name="Phys.Inventory Line", description="Unique line in an Inventory document", help="The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="Phys.Inventory Line", fieldLength=22)
	M_InventoryLine_ID,
	//
	@FlyElement(name="Mix Variance", dataType=FlyDataType.CostsPrices, entityType="EE01", printName="Mix Variance", fieldLength=0)
	MixVariance,
	//
	@FlyElement(name="Locator", description="Warehouse Locator", help="The Locator indicates where in a Warehouse a product is located.", dataType=FlyDataType.ID, entityType="D", printName="Locator", fieldLength=22)
	M_Locator_ID,
	//
	@FlyElement(name="Locator To", description="Location inventory is moved to", help="The Locator To indicates the location where the inventory is being moved to.", dataType=FlyDataType.Locator, entityType="D", printName="Locator To", fieldLength=22)
	M_LocatorTo_ID,
	//
	@FlyElement(name="Exclude Lot", description="Exclude the ability to create Lots in Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude Lot", fieldLength=10)
	M_LotCtlExclude_ID,
	//
	@FlyElement(name="Lot Control", description="Product Lot Control", help="Definition to create Lot numbers for Products", dataType=FlyDataType.ID, entityType="D", printName="Lot Control", fieldLength=22)
	M_LotCtl_ID,
	//
	@FlyElement(name="Lot", description="Product Lot Definition", help="The individual Lot of a Product", dataType=FlyDataType.ID, entityType="D", printName="Lot", fieldLength=22)
	M_Lot_ID,
	//
	@FlyElement(name="Match Invoice", description="Match Shipment/Receipt to Invoice", dataType=FlyDataType.ID, entityType="D", printName="Match Invoice", fieldLength=22)
	M_MatchInv_ID,
	//
	@FlyElement(name="Match PO", description="Match Purchase Order to Shipment/Receipt and Invoice", help="The matching record is usually created automatically.  If price matching is enabled on business partner group level, the matching might have to be approved.", dataType=FlyDataType.ID, entityType="D", printName="Match PO", fieldLength=22)
	M_MatchPO_ID,
	//
	@FlyElement(name="Move Confirm", description="Inventory Move Confirmation", help="The document is automatically created when the document type of the movement indicates In Transit.", dataType=FlyDataType.TableDirect, entityType="D", printName="Move Confirm", fieldLength=22)
	M_MovementConfirm_ID,
	//
	@FlyElement(name="Inventory Move", description="Movement of Inventory", help="The Inventory Movement uniquely identifies a group of movement lines.", dataType=FlyDataType.ID, entityType="D", printName="Move", fieldLength=22)
	M_Movement_ID,
	//
	@FlyElement(name="Move Line Confirm", description="Inventory Move Line Confirmation", dataType=FlyDataType.ID, entityType="D", printName="Move Line Confirm", fieldLength=22)
	M_MovementLineConfirm_ID,
	//
	@FlyElement(name="Move Line", description="Inventory Move document Line", help="The Movement Line indicates the inventory movement document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="Move Line", fieldLength=22)
	M_MovementLine_ID,
	//
	@FlyElement(name="Material Policy", description="Material Movement Policy", help="The Material Movement Policy determines how the stock is flowing (FiFo or LiFo) if a specific Product Instance was not selected.  The policy can not contradict the costing method (e.g. FiFo movement policy and LiFo costing method).", dataType=FlyDataType.List, entityType="D", printName="Mat Policy", fieldLength=1)
	MMPolicy,
	//
	@FlyElement(name="Mobile Phone", description="Identifies an alternate telephone mobile number.", help="The Mobile No field identifies an alternate telephone number.", dataType=FlyDataType.String, entityType="EE02", printName="Mobile Phone", fieldLength=0)
	MobilePhone,
	//
	@FlyElement(name="ModelPackage", description="Java Package of the model classes", help="By default, the Java model classes for extensions are in the compiere.model package.  If you provide a jar file in the classpath, you can define here your specific model package.  The model classes are used to save/modify/delete entries and as well as in Workflow.  Refer to the Compiere naming convention to make sure that your class is used rather then the base classes.", dataType=FlyDataType.String, entityType="D", printName="ModelPackage", fieldLength=255)
	ModelPackage,
	//
	@FlyElement(name="Model Validation Class", dataType=FlyDataType.String, entityType="D", printName="Model Validation Class", fieldLength=255)
	ModelValidationClass,
	//
	@FlyElement(name="Model Validation Classes", description="List of data model validation classes separated by ;", help="List of classes implementing the interface org.compiere.model.ModelValidator, separated by semicolon.	The class is called for the client and allows to validate documents in the prepare stage and monitor model changes.", dataType=FlyDataType.String, entityType="D", printName="Model Validation Classes", fieldLength=255)
	ModelValidationClasses,
	//
	@FlyElement(name="Moderation Type", description="Type of moderation", dataType=FlyDataType.List, entityType="D", printName="Moderation Type", fieldLength=1)
	ModerationType,
	//
	@FlyElement(name="Moderation Status", description="Status of Moderation", dataType=FlyDataType.List, entityType="D", printName="Moderation Status", fieldLength=1)
	ModeratorStatus,
	//
	@FlyElement(name="Module", dataType=FlyDataType.String, entityType="D", printName="Module", fieldLength=120)
	Module,
	//
	@FlyElement(name="Month_0_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_0_Amt", fieldLength=0)
	Month_0_Amt,
	//
	@FlyElement(name="Month_0_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_0_Qty", fieldLength=0)
	Month_0_Qty,
	//
	@FlyElement(name="Month_10_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_10_Amt", fieldLength=0)
	Month_10_Amt,
	//
	@FlyElement(name="Month_10_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_10_Qty", fieldLength=0)
	Month_10_Qty,
	//
	@FlyElement(name="Month_11_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_11_Amt", fieldLength=0)
	Month_11_Amt,
	//
	@FlyElement(name="Month_11_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_11_Qty", fieldLength=0)
	Month_11_Qty,
	//
	@FlyElement(name="Month_1_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_1_Amt", fieldLength=0)
	Month_1_Amt,
	//
	@FlyElement(name="Month_1_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_1_Qty", fieldLength=0)
	Month_1_Qty,
	//
	@FlyElement(name="Month_2_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_2_Amt", fieldLength=0)
	Month_2_Amt,
	//
	@FlyElement(name="Month_2_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_2_Qty", fieldLength=0)
	Month_2_Qty,
	//
	@FlyElement(name="Month_3_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_3_Amt", fieldLength=0)
	Month_3_Amt,
	//
	@FlyElement(name="Month_3_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_3_Qty", fieldLength=0)
	Month_3_Qty,
	//
	@FlyElement(name="Month_4_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_4_Amt", fieldLength=0)
	Month_4_Amt,
	//
	@FlyElement(name="Month_4_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_4_Qty", fieldLength=0)
	Month_4_Qty,
	//
	@FlyElement(name="Month_5_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_5_Amt", fieldLength=0)
	Month_5_Amt,
	//
	@FlyElement(name="Month_5_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_5_Qty", fieldLength=0)
	Month_5_Qty,
	//
	@FlyElement(name="Month_6_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_6_Amt", fieldLength=0)
	Month_6_Amt,
	//
	@FlyElement(name="Month_6_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_6_Qty", fieldLength=0)
	Month_6_Qty,
	//
	@FlyElement(name="Month_7_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_7_Amt", fieldLength=0)
	Month_7_Amt,
	//
	@FlyElement(name="Month_7_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_7_Qty", fieldLength=0)
	Month_7_Qty,
	//
	@FlyElement(name="Month_8_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_8_Amt", fieldLength=0)
	Month_8_Amt,
	//
	@FlyElement(name="Month_8_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_8_Qty", fieldLength=0)
	Month_8_Qty,
	//
	@FlyElement(name="Month_9_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_9_Amt", fieldLength=0)
	Month_9_Amt,
	//
	@FlyElement(name="Month_9_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_9_Qty", fieldLength=0)
	Month_9_Qty,
	//
	@FlyElement(name="Day of the Month", description="Day of the month 1 to 28/29/30/31", dataType=FlyDataType.Integer, entityType="D", printName="Month Day", fieldLength=22)
	MonthDay,
	//
	@FlyElement(name="Monthly Salary", description="Monthly Salary", help="The Monthly Salary of an Employee", dataType=FlyDataType.Number, entityType="EE02", printName="Monthly Salary", fieldLength=0)
	MonthlySalary,
	//
	@FlyElement(name="Monthly Salary (Concept)", description="Reference to concept used for monthly salary", dataType=FlyDataType.Table, entityType="ECA02", printName="Monthly Salary (Concept)", fieldLength=10)
	MonthlySalary_ID,
	//
	@FlyElement(name="Operation Resource", description="Product Operation Resource", help="Resources for the Operation. You can have multiple resources (e.g. tool, labor) per operation.", dataType=FlyDataType.ID, entityType="D", printName="Operation Resource", fieldLength=10)
	M_OperationResource_ID,
	//
	@FlyElement(name="Movement Date", description="Date a product was moved in or out of inventory", help="The Movement Date indicates the date that a product moved in or out of inventory.  This is the result of a shipment, receipt or inventory movement.", dataType=FlyDataType.Date, entityType="D", printName="Movement Date", fieldLength=7)
	MovementDate,
	//
	@FlyElement(name="Movement Quantity", description="Quantity of a product moved.", help="The Movement Quantity indicates the quantity of a product that has been moved.", dataType=FlyDataType.Quantity, entityType="D", printName="Qty", fieldLength=22)
	MovementQty,
	//
	@FlyElement(name="Movement Type", description="Method of moving the inventory", help="The Movement Type indicates the type of movement (in, out, to production, etc)", dataType=FlyDataType.List, entityType="D", printName="Movement Type", fieldLength=2)
	MovementType,
	//
	@FlyElement(name="Moving Time", dataType=FlyDataType.Integer, entityType="EE01", printName="Moving Time", fieldLength=22)
	MovingTime,
	//
	@FlyElement(name="Package", description="Shipment Package", help="A Shipment can have one or more Packages.  A Package may be individually tracked.", dataType=FlyDataType.TableDirect, entityType="D", printName="Package", fieldLength=22)
	M_Package_ID,
	//
	@FlyElement(name="Package Line", description="The detail content of the Package", help="Link to the shipment line", dataType=FlyDataType.ID, entityType="D", printName="Package Line", fieldLength=22)
	M_PackageLine_ID,
	//
	@FlyElement(name="Part Type", dataType=FlyDataType.ID, entityType="D", printName="Part Type", fieldLength=22)
	M_PartType_ID,
	//
	@FlyElement(name="Perpetual Inventory", description="Rules for generating physical inventory", help="The Perpetual Inventory identifies the Perpetual Inventory rule which generated this Physical Inventory.", dataType=FlyDataType.TableDirect, entityType="D", printName="Perpetual Inventory", fieldLength=22)
	M_PerpetualInv_ID,
	//
	@FlyElement(name="Price List", description="Unique identifier of a Price List", help="Price Lists are used to determine the pricing, margin and cost of items purchased or sold.", dataType=FlyDataType.ID, entityType="D", printName="Price List", fieldLength=22)
	M_PriceList_ID,
	//
	@FlyElement(name="Base Price List", description="Source for Price list calculations", help="The Base Price List identifies the Base Pricelist used for calculating prices (the source)", dataType=FlyDataType.Table, entityType="D", printName="Base Price List", fieldLength=22)
	M_Pricelist_Version_Base_ID,
	//
	@FlyElement(name="Price List Version", description="Identifies a unique instance of a Price List", help="Each Price List can have multiple versions.  The most common use is to indicate the dates that a Price List is valid for.", dataType=FlyDataType.TableDirect, entityType="D", printName="Price List Version", fieldLength=22)
	M_PriceList_Version_ID,
	//
	@FlyElement(name="BOM Line", dataType=FlyDataType.ID, entityType="D", printName="BOM Line", fieldLength=22)
	M_Product_BOM_ID,
	//
	@FlyElement(name="BOM Product", description="Bill of Material Component Product", help="The BOM Product identifies an element that is part of this Bill of Materials.", dataType=FlyDataType.Search, entityType="D", printName="BOM Product", fieldLength=22)
	M_ProductBOM_ID,
	//
	@FlyElement(name="Product Category", description="Category of a Product", help="Identifies the category which this product belongs to.  Product categories are used for pricing and selection.", dataType=FlyDataType.TableDirect, entityType="D", printName="Product Category", fieldLength=22)
	M_Product_Category_ID,
	//
	@FlyElement(name="Parent Product Category", dataType=FlyDataType.Table, entityType="D", printName="Parent Product Category", fieldLength=22)
	M_Product_Category_Parent_ID,
	//
	@FlyElement(name="Product Class", description="Class of a Product", help="Identifies the Class which this product belongs to", dataType=FlyDataType.ID, entityType="D", printName="Product Class", fieldLength=22)
	M_Product_Class_ID,
	//
	@FlyElement(name="Product Classification", description="Classification of a Product", help="Identifies the classification which this product belongs to.", dataType=FlyDataType.ID, entityType="D", printName="Product Classification", fieldLength=22)
	M_Product_Classification_ID,
	//
	@FlyElement(name="Product Class Parent", dataType=FlyDataType.NONE, entityType="D", printName="Product Class Parent", fieldLength=0)
	M_Product_Class_Parent_ID,
	//
	@FlyElement(name="Product Download", description="Product downloads", help="Define download for a product. If the product is an asset, the user can download the data.", dataType=FlyDataType.ID, entityType="D", printName="Product Download", fieldLength=10)
	M_ProductDownload_ID,
	//
	@FlyElement(name="Product for Freight", dataType=FlyDataType.Search, entityType="D", printName="Product for Freight", fieldLength=22)
	M_ProductFreight_ID,
	//
	@FlyElement(name="Product Group", description="Group of a Product", help="Identifies the Group which this product belongs to.", dataType=FlyDataType.TableDirect, entityType="D", printName="Product Group", fieldLength=22)
	M_Product_Group_ID,
	//
	@FlyElement(name="Product Group Parent", dataType=FlyDataType.NONE, entityType="D", printName="Product Group Parent", fieldLength=0)
	M_Product_Group_Parent_ID,
	//
	@FlyElement(name="Product", description="Product, Service, Item", help="Identifies an item which is either purchased or sold in this organization.", dataType=FlyDataType.ID, entityType="D", printName="Product", fieldLength=22)
	M_Product_ID,
	//
	@FlyElement(name="Production Batch", dataType=FlyDataType.TableDirect, entityType="D", printName="Production Batch", fieldLength=10)
	M_ProductionBatch_ID,
	//
	@FlyElement(name="Production Batch Line", dataType=FlyDataType.TableDirect, entityType="D", printName="Production Batch Line", fieldLength=10)
	M_ProductionBatchLine_ID,
	//
	@FlyElement(name="Production", description="Plan for producing a product", help="The Production uniquely identifies a Production Plan", dataType=FlyDataType.ID, entityType="D", printName="Production", fieldLength=22)
	M_Production_ID,
	//
	@FlyElement(name="Production Line", description="Document Line representing a production", help="The Production Line indicates the production document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="Production Line", fieldLength=22)
	M_ProductionLine_ID,
	//
	@FlyElement(name="Production Plan", description="Plan for how a product is produced", help="The Production Plan identifies the items and steps in generating a product.", dataType=FlyDataType.TableDirect, entityType="D", printName="Production Plan", fieldLength=22)
	M_ProductionPlan_ID,
	//
	@FlyElement(name="Membership", description="Product used to determine the price of the membership for the topic type", help="A topic can require to pay a membership fee.", dataType=FlyDataType.Table, entityType="D", printName="Membership", fieldLength=22)
	M_ProductMember_ID,
	//
	@FlyElement(name="Product Operation", description="Product Manufacturing Operation", help="The Operations to create the product.  Note that the actual used operation and sequence is determined by the BOM Product.", dataType=FlyDataType.ID, entityType="D", printName="Product Operation", fieldLength=10)
	M_ProductOperation_ID,
	//
	@FlyElement(name="Product Price Break", dataType=FlyDataType.ID, entityType="D", printName="Product Price Break", fieldLength=22)
	M_ProductPriceVendorBreak_ID,
	//
	@FlyElement(name="Product Quality Test", dataType=FlyDataType.ID, entityType="D", printName="Product Quality Test", fieldLength=22)
	M_Product_QualityTest_ID,
	//
	@FlyElement(name="Product Used", description="Product/Resource/Service used in Request", help="Invoicing uses the Product used.", dataType=FlyDataType.Search, entityType="D", printName="Product Used", fieldLength=10)
	M_ProductSpent_ID,
	//
	@FlyElement(name="To Product", description="Product to be converted to (must have UOM Conversion defined to From Product)", dataType=FlyDataType.NONE, entityType="D", printName="To Product", fieldLength=0)
	M_Product_To_ID,
	//
	@FlyElement(name="Promotion Distribution", dataType=FlyDataType.ID, entityType="D", printName="Promotion Distribution", fieldLength=22)
	M_PromotionDistribution_ID,
	//
	@FlyElement(name="Promotion Group", dataType=FlyDataType.ID, entityType="D", printName="Promotion Group", fieldLength=22)
	M_PromotionGroup_ID,
	//
	@FlyElement(name="Promotion Group Line", dataType=FlyDataType.ID, entityType="D", printName="Promotion Group Line", fieldLength=22)
	M_PromotionGroupLine_ID,
	//
	@FlyElement(name="Promotion", dataType=FlyDataType.ID, entityType="D", printName="Promotion", fieldLength=22)
	M_Promotion_ID,
	//
	@FlyElement(name="Promotion Line", dataType=FlyDataType.ID, entityType="D", printName="Promotion Line", fieldLength=22)
	M_PromotionLine_ID,
	//
	@FlyElement(name="Promotion Pre Condition", dataType=FlyDataType.ID, entityType="D", printName="Promotion Pre Condition", fieldLength=22)
	M_PromotionPreCondition_ID,
	//
	@FlyElement(name="Promotion Reward", dataType=FlyDataType.ID, entityType="D", printName="Promotion Reward", fieldLength=22)
	M_PromotionReward_ID,
	//
	@FlyElement(name="Quality Test", dataType=FlyDataType.TableDirect, entityType="D", printName="Quality Test", fieldLength=10)
	M_QualityTest_ID,
	//
	@FlyElement(name="Quality Test Result", dataType=FlyDataType.ID, entityType="D", printName="Quality Test Result", fieldLength=22)
	M_QualityTestResult_ID,
	//
	@FlyElement(name="M_ReplenishPlan ID", dataType=FlyDataType.TableDirect, entityType="D", printName="M_ReplenishPlan ID", fieldLength=10)
	M_ReplenishPlan_ID,
	//
	@FlyElement(name="M_ReplenishPlanLine ID", dataType=FlyDataType.TableDirect, entityType="D", printName="M_ReplenishPlanLine ID", fieldLength=10)
	M_ReplenishPlanLine_ID,
	//
	@FlyElement(name="Requisition", description="Material Requisition", dataType=FlyDataType.ID, entityType="D", printName="Requisition", fieldLength=22)
	M_Requisition_ID,
	//
	@FlyElement(name="Requisition Line", description="Material Requisition Line", dataType=FlyDataType.ID, entityType="D", printName="Requisition Line", fieldLength=22)
	M_RequisitionLine_ID,
	//
	@FlyElement(name="RMA", description="Return Material Authorization", help="A Return Material Authorization may be required to accept returns and to create Credit Memos", dataType=FlyDataType.TableDirect, entityType="D", printName="RMA", fieldLength=22)
	M_RMA_ID,
	//
	@FlyElement(name="RMA Line", description="Return Material Authorization Line", help="Detail information about the returned goods", dataType=FlyDataType.ID, entityType="D", printName="RMA Line", fieldLength=22)
	M_RMALine_ID,
	//
	@FlyElement(name="RMA Type", description="Return Material Authorization Type", help="Types of RMA", dataType=FlyDataType.TableDirect, entityType="D", printName="RMA Type", fieldLength=22)
	M_RMAType_ID,
	//
	@FlyElement(name="Demand No", description="MRP Demand No", dataType=FlyDataType.NONE, entityType="EE01", printName="Demand No", fieldLength=0)
	MRP_Demand_ID,
	//
	@FlyElement(name="Supply No", description="MRP Supply No", dataType=FlyDataType.NONE, entityType="EE01", printName="Supply No", fieldLength=0)
	MRP_Supply_ID,
	//
	@FlyElement(name="Exclude SerNo", description="Exclude the ability to create Serial Numbers in Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude SerNo", fieldLength=10)
	M_SerNoCtlExclude_ID,
	//
	@FlyElement(name="Serial No Control", description="Product Serial Number Control", help="Definition to create Serial numbers for Products", dataType=FlyDataType.ID, entityType="D", printName="Serial No Control", fieldLength=22)
	M_SerNoCtl_ID,
	//
	@FlyElement(name="Message Text", description="Textual Informational, Menu or Error Message", help="The Message Text indicates the message that will display ", dataType=FlyDataType.Text, entityType="D", printName="Message Text", fieldLength=2000)
	MsgText,
	//
	@FlyElement(name="Message Tip", description="Additional tip or help for this message", help="The Message Tip defines additional help or information about this message.", dataType=FlyDataType.Text, entityType="D", printName="Message Tip", fieldLength=2000)
	MsgTip,
	//
	@FlyElement(name="Message Type", description="Type of message (Informational, Menu or Error)", help="The Message Type indicates the type of message being defined.  Valid message types are Informational, Menu and Error.", dataType=FlyDataType.List, entityType="D", printName="Message Type", fieldLength=1)
	MsgType,
	//
	@FlyElement(name="Shipper", description="Method or manner of product delivery", help="The Shipper indicates the method of delivering product", dataType=FlyDataType.ID, entityType="D", printName="Shipper", fieldLength=22)
	M_Shipper_ID,
	//
	@FlyElement(name="Target distribution", description="Get product from target distribution to apply the promotion reward", dataType=FlyDataType.Table, entityType="D", printName="Target distribution", fieldLength=22)
	M_TargetDistribution_ID,
	//
	@FlyElement(name="Inventory Transaction", dataType=FlyDataType.ID, entityType="D", printName="Inventory Transaction", fieldLength=22)
	M_Transaction_ID,
	//
	@FlyElement(name="Multiplier", description="Type Multiplier (Credit = -1)", dataType=FlyDataType.Number, entityType="D", printName="Multiplier", fieldLength=22)
	Multiplier,
	//
	@FlyElement(name="Multiplier AP", description="Payables Multiplier", dataType=FlyDataType.Number, entityType="D", printName="Multiplier AP", fieldLength=22)
	MultiplierAP,
	//
	@FlyElement(name="Multiply Rate", description="Rate to multiple the source by to calculate the target.", help="To convert Source number to Target number, the Source is multiplied by the multiply rate.  If the Multiply Rate is entered, then the Divide Rate will be automatically calculated.", dataType=FlyDataType.Number, entityType="D", printName="Multiply Rate", fieldLength=22)
	MultiplyRate,
	//
	@FlyElement(name="Product quantity must be in stock", description="If not sufficient in stock in the warehouse, the BOM is not produced", dataType=FlyDataType.NONE, entityType="D", printName="Product quantity must be in stock", fieldLength=0)
	MustBeStocked,
	//
	@FlyElement(name="Warehouse", description="Storage Warehouse and Service Point", help="The Warehouse identifies a unique Warehouse where products are stored or Services are provided.", dataType=FlyDataType.ID, entityType="D", printName="Warehouse", fieldLength=22)
	M_Warehouse_ID,
	//
	@FlyElement(name="Source Warehouse", description="Optional Warehouse to replenish from", help="If defined, the warehouse selected is used to replenish the product(s)", dataType=FlyDataType.Table, entityType="D", printName="Source Warehouse", fieldLength=10)
	M_WarehouseSource_ID,
	//
	@FlyElement(name="NAICS/SIC", description="Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html", help="The NAICS/SIC identifies either of these codes that may be applicable to this Business Partner.", dataType=FlyDataType.String, entityType="D", printName="NAICS/SIC", fieldLength=6)
	NAICS,
	//
	@FlyElement(name="Name", description="Alphanumeric identifier of the entity", help="The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", dataType=FlyDataType.String, entityType="D", printName="Name", fieldLength=60)
	Name,
	//
	@FlyElement(name="Name 2", description="Additional Name", dataType=FlyDataType.String, entityType="D", printName="Name 2", fieldLength=60)
	Name2,
	//
	@FlyElement(name="Name Colour", dataType=FlyDataType.NONE, entityType="D", printName="Name Colour", fieldLength=0)
	Name_PrintColor_ID,
	//
	@FlyElement(name="Name Font", dataType=FlyDataType.NONE, entityType="D", printName="Name Font", fieldLength=0)
	Name_PrintFont_ID,
	//
	@FlyElement(name="National Code", dataType=FlyDataType.NONE, entityType="EE02", printName="National Code", fieldLength=60)
	NationalCode,
	//
	@FlyElement(name="Nationality", description="Nationality", dataType=FlyDataType.Table, entityType="EE02", printName="Nationality", fieldLength=0)
	Nationality_ID,
	//
	@FlyElement(name="Invoice net Amount", description="Net amount of this Invoice", help="Indicates the net amount for this invoice.  It does not include shipping or any additional charges.", dataType=FlyDataType.Amount, entityType="D", printName="Invoice net Amt", fieldLength=22)
	NetAmtToInvoice,
	//
	@FlyElement(name="Net Day", description="Day when payment is due net", help="When defined, overwrites the number of net days with the relative number of days to the the day defined.", dataType=FlyDataType.List, entityType="D", printName="Net Day", fieldLength=1)
	NetDay,
	//
	@FlyElement(name="Net Days", description="Net Days in which payment is due", help="Indicates the number of days after invoice date that payment is due.", dataType=FlyDataType.Integer, entityType="D", printName="Net Days", fieldLength=22)
	NetDays,
	//
	@FlyElement(name="Network Distribution Key", description="Key of the Network Distribution", dataType=FlyDataType.String, entityType="EE01", printName="Network Distribution Key", fieldLength=40)
	NetworkDistributionValue,
	//
	@FlyElement(name="New EMail Address", description="Enter new EMail Address - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New EMail Address", fieldLength=0)
	NewEMail,
	//
	@FlyElement(name="New EMail User ID", description="Enter new User ID of your internal EMail System - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New EMail User ID", fieldLength=0)
	NewEMailUser,
	//
	@FlyElement(name="New EMail User PW", description="Enter new User Password of your internal EMail System - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New EMail User PW", fieldLength=0)
	NewEMailUserPW,
	//
	@FlyElement(name="New Password", description="Enter the new password - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New Password", fieldLength=0)
	NewPassword,
	//
	@FlyElement(name="New Value", description="New field value", help="New data entered in the field", dataType=FlyDataType.String, entityType="D", printName="New Value", fieldLength=2000)
	NewValue,
	//
	@FlyElement(name="Next action", description="Next Action to be taken", help="The Next Action indicates the next action to be taken on this request.", dataType=FlyDataType.List, entityType="D", printName="Next action", fieldLength=1)
	NextAction,
	//
	@FlyElement(name="Next Job", dataType=FlyDataType.Table, entityType="EE02", printName="Next Job", fieldLength=10)
	Next_Job_ID,
	//
	@FlyElement(name="Next Maintenance Use Unit", dataType=FlyDataType.Integer, entityType="D", printName="Next Maintenance Use Unit", fieldLength=22)
	NextMaintenanceUseUnit,
	//
	@FlyElement(name="Next Maintenence", description="Next Maintenence Date", dataType=FlyDataType.DateTime, entityType="D", printName="Next Maintenence", fieldLength=7)
	NextMaintenenceDate,
	//
	@FlyElement(name="Next Unit", description="Next Maintenence Unit", dataType=FlyDataType.Integer, entityType="D", printName="Next Unit", fieldLength=10)
	NextMaintenenceUnit,
	//
	@FlyElement(name="Next Status", description="Move to next status automatically after timeout", help="After the timeout, change the status automatically", dataType=FlyDataType.Table, entityType="D", printName="Next Status", fieldLength=10)
	Next_Status_ID,
	//
	@FlyElement(name="Node", dataType=FlyDataType.ID, entityType="D", printName="Node", fieldLength=22)
	Node_ID,
	//
	@FlyElement(name="Node Name", dataType=FlyDataType.NONE, entityType="EE01", printName="Node Name", fieldLength=0)
	NodeName,
	//
	@FlyElement(name="Node Next Key", description="Next Node in Transition", help="The Next Node Serach Key indicates the next step or task in this Workflow.", dataType=FlyDataType.NONE, entityType="EE01", printName="Node Next Key", fieldLength=0)
	NodeNextValue,
	//
	@FlyElement(name="Node Key", dataType=FlyDataType.NONE, entityType="EE01", printName="Node Key", fieldLength=0)
	NodeValue,
	//
	@FlyElement(name="Expired Guarantee Mail", description="Send email to partners with expired guarantee", dataType=FlyDataType.NONE, entityType="D", printName="Expired Guarantee Mail", fieldLength=0)
	NoGuarantee_MailText_ID,
	//
	@FlyElement(name="Number of Inventory counts", description="Frequency of inventory counts per year", help="The Number of Inventory Counts indicates the number of times per year that inventory counts will be preformed", dataType=FlyDataType.Integer, entityType="D", printName="Number of Inventory counts", fieldLength=22)
	NoInventoryCount,
	//
	@FlyElement(name="Number of Months", dataType=FlyDataType.Integer, entityType="D", printName="Number of Months", fieldLength=22)
	NoMonths,
	//
	@FlyElement(name="Not Committed Aount", description="Amount not committed yet", dataType=FlyDataType.Amount, entityType="D", printName="Not Committed Amt", fieldLength=22)
	NonCommittedAmt,
	//
	@FlyElement(name="Number of Hours", description="Number of Hours This Shift Contains", dataType=FlyDataType.Amount, entityType="EE02", printName="Number of Hours", fieldLength=0)
	NoOfHours,
	//
	@FlyElement(name="No of Hours this Shift", description="No of Hours this Shift work hours of the shift", help="The No of Hours this Shift indicates work hours of the shift", dataType=FlyDataType.Amount, entityType="EE02", printName="No of Hours this Shift", fieldLength=0)
	NoOfHoursThisShift,
	//
	@FlyElement(name="Number of Leaves Allocated", description="Number of Leaves Allocated", help="The Number of Leaves Allocated", dataType=FlyDataType.Number, entityType="EE02", printName="Number of Leaves Allocated", fieldLength=0)
	NoOfLeavesAllocated,
	//
	@FlyElement(name="No Of Leaves Credited", description="No Of Leaves Credited", help="The No Of Leaves Credited of an Employee", dataType=FlyDataType.Number, entityType="EE02", printName="No Of Leaves Credited", fieldLength=0)
	NoOfLeavesCredited,
	//
	@FlyElement(name="No_Of_Periods", dataType=FlyDataType.NONE, entityType="D", printName="No_Of_Periods", fieldLength=0)
	No_Of_Periods,
	//
	@FlyElement(name="No Packages", description="Number of packages shipped", dataType=FlyDataType.Integer, entityType="D", printName="No Packages", fieldLength=22)
	NoPackages,
	//
	@FlyElement(name="Number of Periods", dataType=FlyDataType.NONE, entityType="EE01", printName="NoPeriods", fieldLength=0)
	NoPeriods,
	//
	@FlyElement(name="Processors", description="Number of Database Processors", dataType=FlyDataType.Integer, entityType="D", printName="Processors", fieldLength=22)
	NoProcessors,
	//
	@FlyElement(name="Number of Product counts", description="Frequency of product counts per year", help="The Number of Product Count indicates the number of times per year that a product should be counted.", dataType=FlyDataType.Integer, entityType="D", printName="Number of Product counts", fieldLength=22)
	NoProductCount,
	//
	@FlyElement(name="Note", description="Optional additional user defined information", help="The Note field allows for optional entry of user defined information regarding this record", dataType=FlyDataType.Text, entityType="D", printName="Note", fieldLength=2000)
	Note,
	//
	@FlyElement(name="Notice", description="Contains last write notice", help="Contains info on what changed with the last write", dataType=FlyDataType.Text, entityType="D", printName="Notice", fieldLength=2000)
	Notice,
	//
	@FlyElement(name="Notification Type", description="Type of Notifications", help="Emails or Notification sent out for Request Updates, etc.", dataType=FlyDataType.List, entityType="D", printName="Notification Type", fieldLength=1)
	NotificationType,
	//
	@FlyElement(name="Not-invoiced Receipts", description="Account for not-invoiced Material Receipts", help="The Not Invoiced Receipts account indicates the account used for recording receipts for materials that have not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="Not-invoiced Receipts", fieldLength=22)
	NotInvoicedReceipts_Acct,
	//
	@FlyElement(name="Not-invoiced Receivables", description="Account for not invoiced Receivables", help="The Not Invoiced Receivables account indicates the account used for recording receivables that have not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="Not-invoiced Receivables", fieldLength=22)
	NotInvoicedReceivables_Acct,
	//
	@FlyElement(name="Not-invoiced Revenue", description="Account for not invoiced Revenue", help="The Not Invoiced Revenue account indicates the account used for recording revenue that has not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="Not-invoiced Revenue", fieldLength=22)
	NotInvoicedRevenue_Acct,
	//
	@FlyElement(name="Not Posted", dataType=FlyDataType.NONE, entityType="D", printName="Not Posted", fieldLength=0)
	NotPosted,
	//
	@FlyElement(name="Null Columns", description="Columns with NULL value", help="Null values are used for showing 'no change'", dataType=FlyDataType.String, entityType="D", printName="Null Columns", fieldLength=255)
	NullColumns,
	//
	@FlyElement(name="Employees", description="Number of employees", help="Indicates the number of employees for this Business Partner.  This field displays only for Prospects.", dataType=FlyDataType.Integer, entityType="D", printName="Employees", fieldLength=22)
	NumberEmployees,
	//
	@FlyElement(name="Number of runs", description="Frequency of processing Perpetual Inventory", help="The Number of Runs indicates the number of times that the Perpetual Inventory has be processed.", dataType=FlyDataType.Integer, entityType="D", printName="Number of runs", fieldLength=22)
	NumberOfRuns,
	//
	@FlyElement(name="Number Colour", dataType=FlyDataType.NONE, entityType="D", printName="Number Colour", fieldLength=0)
	Number_PrintColor_ID,
	//
	@FlyElement(name="Number Font", dataType=FlyDataType.NONE, entityType="D", printName="Number Font", fieldLength=0)
	Number_PrintFont_ID,
	//
	@FlyElement(name="Obscure", description="Type of obscuring the data (limiting the display)", dataType=FlyDataType.List, entityType="D", printName="Obscure", fieldLength=3)
	ObscureType,
	//
	@FlyElement(name="Offer Amount", description="Amount of the Offer", dataType=FlyDataType.Amount, entityType="D", printName="Offer Amt", fieldLength=22)
	OfferAmt,
	//
	@FlyElement(name="Old Name", dataType=FlyDataType.String, entityType="D", printName="Old Name", fieldLength=60)
	OldName,
	//
	@FlyElement(name="Old Password", description="Old Password is required if you are not a System Administrator", dataType=FlyDataType.NONE, entityType="D", printName="Old Password", fieldLength=0)
	OldPassword,
	//
	@FlyElement(name="Old Value", description="The old file data", help="Old data overwritten in the field", dataType=FlyDataType.String, entityType="D", printName="Old Value", fieldLength=2000)
	OldValue,
	//
	@FlyElement(name="onevent", dataType=FlyDataType.NONE, entityType="D", printName="onevent", fieldLength=0)
	onevent,
	//
	@FlyElement(name="Friday", description="Available on Fridays", dataType=FlyDataType.YesNo, entityType="D", printName="Fr", fieldLength=1)
	OnFriday,
	//
	@FlyElement(name="Only Discount", description="Include only invoices where we would get payment discount", dataType=FlyDataType.NONE, entityType="D", printName="Only Discount", fieldLength=0)
	OnlyDiscount,
	//
	@FlyElement(name="Only Due", description="Include only due invoices", dataType=FlyDataType.NONE, entityType="D", printName="Only Due", fieldLength=0)
	OnlyDue,
	//
	@FlyElement(name="Only Sales Invoices", description="Otherwise also Payments and AP Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Only Sales Invoices", fieldLength=0)
	OnlySOTrx,
	//
	@FlyElement(name="Monday", description="Available on Mondays", dataType=FlyDataType.YesNo, entityType="D", printName="Mo", fieldLength=1)
	OnMonday,
	//
	@FlyElement(name="Saturday", description="Available on Saturday", dataType=FlyDataType.YesNo, entityType="D", printName="Sa", fieldLength=1)
	OnSaturday,
	//
	@FlyElement(name="Sunday", description="Available on Sundays", dataType=FlyDataType.YesNo, entityType="D", printName="Su", fieldLength=1)
	OnSunday,
	//
	@FlyElement(name="Thursday", description="Available on Thursdays", dataType=FlyDataType.YesNo, entityType="D", printName="Th", fieldLength=1)
	OnThursday,
	//
	@FlyElement(name="Tuesday", description="Available on Tuesdays", dataType=FlyDataType.YesNo, entityType="D", printName="Tu", fieldLength=1)
	OnTuesday,
	//
	@FlyElement(name="Wednesday", description="Available on Wednesdays", dataType=FlyDataType.YesNo, entityType="D", printName="We", fieldLength=1)
	OnWednesday,
	//
	@FlyElement(name="Open Amount", description="Open item amount", dataType=FlyDataType.Amount, entityType="D", printName="Open", fieldLength=22)
	OpenAmt,
	//
	@FlyElement(name="Open Positions", description="Number of places for this position.", help="The  Number Of Open Positions is used to control the balance of places allocated for this position.", dataType=FlyDataType.Integer, entityType="EE02", printName="Open Positions", fieldLength=0)
	OpenPositions,
	//
	@FlyElement(name="Open Requests", dataType=FlyDataType.NONE, entityType="D", printName="Open Requests", fieldLength=0)
	OpenRequests,
	//
	@FlyElement(name="Operand 1", description="First operand for calculation", dataType=FlyDataType.Table, entityType="D", printName="Operand 1", fieldLength=22)
	Oper_1_ID,
	//
	@FlyElement(name="Operand 2", description="Second operand for calculation", dataType=FlyDataType.Table, entityType="D", printName="Operand 2", fieldLength=22)
	Oper_2_ID,
	//
	@FlyElement(name="Operating System", description="Operating System Info", dataType=FlyDataType.String, entityType="D", printName="Operating System", fieldLength=255)
	OperatingSystemInfo,
	//
	@FlyElement(name="Operation", description="Compare Operation", dataType=FlyDataType.List, entityType="D", printName="Operation", fieldLength=2)
	Operation,
	//
	@FlyElement(name="Opportunity Amount", description="The estimated value of this opportunity.", dataType=FlyDataType.NONE, entityType="D", printName="Opportunity Amount", fieldLength=0)
	OpportunityAmt,
	//
	@FlyElement(name="Opportunity by Campaign", dataType=FlyDataType.NONE, entityType="D", printName="Opportunity by Campaign", fieldLength=0)
	OpportunityCampaign,
	//
	@FlyElement(name="Online Processing", description="This payment can be processed online", help="The Online Processing indicates if the payment can be processed online.", dataType=FlyDataType.Button, entityType="D", printName="Online Processing", fieldLength=1)
	OProcessing,
	//
	@FlyElement(name="Opt-out Date", description="Date the contact opted out", help="If the field has a date, the customer opted out (unsubscribed) and cannot receive mails for the Interest Area", dataType=FlyDataType.Date, entityType="D", printName="Opt-Out", fieldLength=7)
	OptOutDate,
	//
	@FlyElement(name="Sql ORDER BY", description="Fully qualified ORDER BY clause", help="The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection", dataType=FlyDataType.Text, entityType="D", printName="Order by clause", fieldLength=2000)
	OrderByClause,
	//
	@FlyElement(name="Order Info", dataType=FlyDataType.String, entityType="D", printName="Order Info", fieldLength=60)
	OrderInfo,
	//
	@FlyElement(name="Order Mail Text", description="Email text used for sending order acknowledgements or quotations", help="Standard email template used to send acknowledgements or quotations as attachments.", dataType=FlyDataType.Table, entityType="D", printName="Order Mail Text", fieldLength=22)
	Order_MailText_ID,
	//
	@FlyElement(name="Maximum Order Qty", description="Maximum order quantity in UOM", help="The Maximum Order Quantity indicates the biggest quantity of this product which can be ordered.", dataType=FlyDataType.Quantity, entityType="EE01", printName="Maximum Order Qty", fieldLength=10)
	Order_Max,
	//
	@FlyElement(name="Minimum Order Qty", description="Minimum order quantity in UOM", help="The Minimum Order Quantity indicates the smallest quantity of this product which can be ordered.", dataType=FlyDataType.Quantity, entityType="D", printName="Minimum Order Qty", fieldLength=22)
	Order_Min,
	//
	@FlyElement(name="Order Pack Qty", description="Package order size in UOM (e.g. order set of 5 units)", help="The Order Pack Quantity indicates the number of units in each pack of this product.", dataType=FlyDataType.Quantity, entityType="D", printName="Order Pack Qty", fieldLength=22)
	Order_Pack,
	//
	@FlyElement(name="Order Period", description="Order Period", help="Number of calendar days used to accumulate  the net requirements to integrate the quantity of a planned order under the policy of POQ.", dataType=FlyDataType.Quantity, entityType="EE01", printName="Order Period", fieldLength=22)
	Order_Period,
	//
	@FlyElement(name="Order Policy", description="Order Policy", help="If the DRP Required checkbox is ticked, this means it has been a change in some element which affect the material plan  for this product, i.e Network Distribution, Orders, Inventory, MPS, etc. and therefore  you need to executed again DRP to adjust the Planned Orders to the new conditions and to get the updated action messages.	<br>	<p>	Lot-For-Lot  (LFL): Creates planned orders to satisfy the demand, an order is created to satisfy each net requirement. so MRP process must generate one planned order for each demand not satisfied.	<p>	Period Order Quantity (POQ): Creates planned orders to satisfy the demand, the requirements are accumulated in a defined period and a planned order is created for the period quantity accumulation. The number of days are entered in the field Order Period.	<p>	Use  Fixed Order Quantity when you always need to ask for  the same Quantity of product, this Quantity is entered in the field Order Qty.	<br><br>	If the order policy is not FOQ and you enter a quantity in the Order Qty field, this quantity is the Economic Order Quantity.", dataType=FlyDataType.List, entityType="EE01", printName="Order Policy", fieldLength=3)
	Order_Policy,
	//
	@FlyElement(name="Order Print Format", description="Print Format for Orders, Quotes, Offers", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="Order Print Format", fieldLength=22)
	Order_PrintFormat_ID,
	//
	@FlyElement(name="Order Qty", description="Order Qty", help="Define the fixed quantity to be ordered when the order policy used is FOQ", dataType=FlyDataType.Quantity, entityType="EE01", printName="Order Qty", fieldLength=22)
	Order_Qty,
	//
	@FlyElement(name="Order Type", description="Type of Order: MRP records grouped by source (Sales Order, Purchase Order, Distribution Order, Requisition)", dataType=FlyDataType.String, entityType="D", printName="Order Type", fieldLength=510)
	OrderType,
	//
	@FlyElement(name="Org Column", description="Fully qualified Organization column (AD_Org_ID)", help="The Organization Column indicates the organization to be used in calculating this measurement.", dataType=FlyDataType.String, entityType="D", printName="Org Column", fieldLength=60)
	OrgColumn,
	//
	@FlyElement(name="Organization", description="Organizational entity within client", help="An organization is a unit of your client or legal entity - examples are store, department.", dataType=FlyDataType.Table, entityType="D", printName="Organization", fieldLength=22)
	Org_ID,
	//
	@FlyElement(name="Org Address", description="Organization Location/Address", dataType=FlyDataType.Location, entityType="D", printName="Org Address", fieldLength=22)
	Org_Location_ID,
	//
	@FlyElement(name="Organization Name", description="Name of the Organization", dataType=FlyDataType.String, entityType="D", printName="Org Name", fieldLength=60)
	OrgName,
	//
	@FlyElement(name="Trx Org Key", description="Key of the Transaction Organization", dataType=FlyDataType.String, entityType="D", printName="Trx Org Key", fieldLength=40)
	OrgTrxValue,
	//
	@FlyElement(name="Org Key", description="Key of the Organization", dataType=FlyDataType.String, entityType="D", printName="Org Key", fieldLength=40)
	OrgValue,
	//
	@FlyElement(name="Original Transaction ID", description="Original Transaction ID", help="The Original Transaction ID is used for reversing transactions and indicates the transaction that has been reversed.", dataType=FlyDataType.String, entityType="D", printName="Original Trx ID", fieldLength=20)
	Orig_TrxID,
	//
	@FlyElement(name="OS Command", description="Operating System Command", help="The OS Command is for optionally defining a command to that will be part of this task.  For example it can be used to starting a back up process or performing a file transfer.", dataType=FlyDataType.String, entityType="D", printName="OS Command", fieldLength=2000)
	OS_Command,
	//
	@FlyElement(name="On Screen Keyboard layout", description="The key layout to use for on screen keyboard for text fields.", help="If empty, the on screen keyboard will not be used.", dataType=FlyDataType.Table, entityType="D", printName="On Screen Keyboard layout", fieldLength=22)
	OSK_KeyLayout_ID,
	//
	@FlyElement(name="On Screen Number Pad layout", description="The key layout to use for on screen number pad for numeric fields.", help="If empty, the on screen numberpad will not be used.", dataType=FlyDataType.Table, entityType="D", printName="On Screen Number Pad layout", fieldLength=22)
	OSNP_KeyLayout_ID,
	//
	@FlyElement(name="Other SQL Clause", description="Other SQL Clause", help="Any other complete clause like GROUP BY, HAVING, ORDER BY, etc. after WHERE clause.", dataType=FlyDataType.Text, entityType="D", printName="Other Clause", fieldLength=2000)
	OtherClause,
	//
	@FlyElement(name="Out Shipment Line", description="Outgoing Shipment/Receipt", dataType=FlyDataType.Table, entityType="D", printName="Out Shipment Line", fieldLength=22)
	Out_M_InOutLine_ID,
	//
	@FlyElement(name="Out Inventory Line", description="Outgoing Inventory Line", dataType=FlyDataType.Table, entityType="D", printName="Out Inventory Line", fieldLength=22)
	Out_M_InventoryLine_ID,
	//
	@FlyElement(name="Out Production Line", description="Outgoing Production Line", dataType=FlyDataType.Table, entityType="D", printName="Out Production Line", fieldLength=22)
	Out_M_ProductionLine_ID,
	//
	@FlyElement(name="Out Transaction", description="Outgoing Transaction", dataType=FlyDataType.Table, entityType="D", printName="Out Transaction", fieldLength=22)
	Out_M_Transaction_ID,
	//
	@FlyElement(name="Alert after Days Due", description="Send email alert after number of days due (0=no alerts)", help="Send an email alert after the item is Due (after Date Next Action). If set to zero, no alert is sent.", dataType=FlyDataType.Integer, entityType="D", printName="Alert days Due", fieldLength=22)
	OverdueAlertDays,
	//
	@FlyElement(name="Escalate after Days Due", description="Escalation to superior after number of due days (0 = no)", help="The item will be escalated and assigned to the supervisor after the number of days over due. If 0, there is no escalation.", dataType=FlyDataType.Integer, entityType="D", printName="Escalate after Days", fieldLength=22)
	OverdueAssignDays,
	//
	@FlyElement(name="Overlap Units", description="Overlap Units are number of units that must be completed before they are moved the next activity", help="When there are two consecutive avtivity, you can sometimes save time by moving partial quantites from one activity to the next before the first activity as been completed.", dataType=FlyDataType.Integer, entityType="EE01", printName="Overlap Units", fieldLength=22)
	OverlapUnits,
	//
	@FlyElement(name="Overline Stroke Type", dataType=FlyDataType.List, entityType="D", printName="Overline Stroke Type", fieldLength=5)
	OverlineStrokeType,
	//
	@FlyElement(name="Over Time Amount", description="Is Over time Applicable  Then How Much Amount", dataType=FlyDataType.Amount, entityType="EE02", printName="Over Time Amount", fieldLength=0)
	OverTimeAmount,
	//
	@FlyElement(name="Overtime Amount", description="Hourly Overtime Rate", help="Hourly Amount without Benefits and Employer overhead", dataType=FlyDataType.Amount, entityType="D", printName="Overtime Amount", fieldLength=22)
	OvertimeAmt,
	//
	@FlyElement(name="Overtime Cost", description="Hourly Overtime Cost", help="Hourly Amount with Benefits and Employer overhead", dataType=FlyDataType.CostsPrices, entityType="D", printName="Overtime Cost", fieldLength=22)
	OvertimeCost,
	//
	@FlyElement(name="Over/Under Payment", description="Over-Payment (unallocated) or Under-Payment (partial payment) Amount", help="Overpayments (negative) are unallocated amounts and allow you to receive money for more than the particular invoice. 	Underpayments (positive) is a partial payment for the invoice. You do not write off the unpaid amount.", dataType=FlyDataType.Amount, entityType="D", printName="Over/Under Payment", fieldLength=22)
	OverUnderAmt,
	//
	@FlyElement(name="Overwrite Account", description="Overwrite the account segment Account with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Account", fieldLength=1)
	OverwriteAcct,
	//
	@FlyElement(name="Overwrite Activity", description="Overwrite the account segment Activity with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Activity", fieldLength=1)
	OverwriteActivity,
	//
	@FlyElement(name="Overwrite Bus.Partner", description="Overwrite the account segment Business Partner with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite BPartner", fieldLength=1)
	OverwriteBPartner,
	//
	@FlyElement(name="Overwrite Campaign", description="Overwrite the account segment Campaign with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Campaign", fieldLength=1)
	OverwriteCampaign,
	//
	@FlyElement(name="Overwrite Location From", description="Overwrite the account segment Location From with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Loc From", fieldLength=1)
	OverwriteLocFrom,
	//
	@FlyElement(name="Overwrite Location To", description="Overwrite the account segment Location From with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Loc To", fieldLength=1)
	OverwriteLocTo,
	//
	@FlyElement(name="Overwrite Organization", description="Overwrite the account segment Organization with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Org", fieldLength=1)
	OverwriteOrg,
	//
	@FlyElement(name="Overwrite Trx Organuzation", description="Overwrite the account segment Transaction Organization with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Trx Org", fieldLength=1)
	OverwriteOrgTrx,
	//
	@FlyElement(name="Overwrite Posting Type", description="Overwrite the posting type with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Posting Type", fieldLength=1)
	OverwritePostingType,
	//
	@FlyElement(name="Overwrite Price Limit", description="Overwrite Price Limit if the Price List  enforces the Price Limit", help="The Price List allows to enforce the Price Limit. If set, a user with this role can overwrite the price limit (i.e. enter any price).", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Price Limit", fieldLength=1)
	OverwritePriceLimit,
	//
	@FlyElement(name="Overwrite Product", description="Overwrite the account segment Product with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Product", fieldLength=1)
	OverwriteProduct,
	//
	@FlyElement(name="Overwrite Project", description="Overwrite the account segment Project with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Project", fieldLength=1)
	OverwriteProject,
	//
	@FlyElement(name="Overwrite Sales Region", description="Overwrite the account segment Sales Region with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite SalesRegion", fieldLength=1)
	OverwriteSalesRegion,
	//
	@FlyElement(name="Overwrite User1", description="Overwrite the account segment User 1 with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite User1", fieldLength=1)
	OverwriteUser1,
	//
	@FlyElement(name="Overwrite User2", description="Overwrite the account segment User 2 with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite User2", fieldLength=1)
	OverwriteUser2,
	//
	@FlyElement(name="Overwrite User3", description="Overwrite the account segment User 3 with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite User3", fieldLength=1)
	OverwriteUser3,
	//
	@FlyElement(name="Overwrite User4", description="Overwrite the account segment User 4 with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite User4", fieldLength=1)
	OverwriteUser4,
	//
	@FlyElement(name="Achievement", description="Performance Achievement", help="The Achievement identifies a unique task that is part of an overall performance goal.", dataType=FlyDataType.ID, entityType="D", printName="Achievement", fieldLength=22)
	PA_Achievement_ID,
	//
	@FlyElement(name="Amount Type", description="PA Amount Type for reporting", help="The amount type to report on: Quantity, Credit Only, Debit Only, Balance (expected sign) or Balance (accounted sign). 'Expected sign' adjusts the sign of the result based on the Account Type and Expected Sign of each Account Element, whereas 'accounted sign' always returns DR-CR.", dataType=FlyDataType.List, entityType="D", printName="Amount Type", fieldLength=1)
	PAAmountType,
	//
	@FlyElement(name="Benchmark Data", description="Performance Benchmark Data Point", help="Data Series Point to compare internal performance with (e.g. stock price, ...)", dataType=FlyDataType.ID, entityType="D", printName="Benchmark Data", fieldLength=10)
	PA_BenchmarkData_ID,
	//
	@FlyElement(name="Benchmark", description="Performance Benchmark", help="Data Series to compare internal performance with (e.g. stock price, ...)", dataType=FlyDataType.TableDirect, entityType="D", printName="Benchmark", fieldLength=10)
	PA_Benchmark_ID,
	//
	@FlyElement(name="Color Schema", description="Performance Color Schema", help="Visual representation of performance by color.  The Schema has often three levels (e.g. red-yellow-green).  Adempiere support two levels (e.g. red-green) or four levels (e.g. gray-bronze-silver-gold).  Note that Measures without a goal are represented white.  The percentages could be between 0 and unlimited (i.e. above 100%).", dataType=FlyDataType.ID, entityType="D", printName="Color Schema", fieldLength=10)
	PA_ColorSchema_ID,
	//
	@FlyElement(name="Dashboard Content", dataType=FlyDataType.ID, entityType="D", printName="Dashboard Content", fieldLength=10)
	PA_DashboardContent_ID,
	//
	@FlyElement(name="Document Status Indicator", dataType=FlyDataType.NONE, entityType="D", printName="Document Status Indicator", fieldLength=0)
	PA_DocumentStatus_ID,
	//
	@FlyElement(name="PageSize", dataType=FlyDataType.NONE, entityType="D", printName="PageSize", fieldLength=0)
	PageSize,
	//
	@FlyElement(name="Page URL", dataType=FlyDataType.URL, entityType="D", printName="Page URL", fieldLength=120)
	PageURL,
	//
	@FlyElement(name="Goal", description="Performance Goal", help="The Performance Goal indicates what this users performance will be measured against.", dataType=FlyDataType.ID, entityType="D", printName="Goal", fieldLength=22)
	PA_Goal_ID,
	//
	@FlyElement(name="Parent Goal", description="Parent Goal", help="You can create a hierarchy of goals by linking the sub-goals to the summary goal.	The measures are automatically rolled up", dataType=FlyDataType.Table, entityType="D", printName="Parent Goal", fieldLength=10)
	PA_GoalParent_ID,
	//
	@FlyElement(name="Goal Restriction", description="Performance Goal Restriction", help="Restriction of the performance measure to the Organization, Business Partner or Product defined.	Example: The performance is only measured for HQ	The measure must support the data, otherwise it is ignored.", dataType=FlyDataType.ID, entityType="D", printName="Goal Restriction", fieldLength=10)
	PA_GoalRestriction_ID,
	//
	@FlyElement(name="Reporting Hierarchy", description="Optional Reporting Hierarchy - If not selected the default hierarchy trees are used.", help="Reporting Hierarchy allows you to select different Hierarchies/Trees for the report.	Accounting Segments like Organization, Account, Product may have several hierarchies to accomodate different views on the business.", dataType=FlyDataType.ID, entityType="D", printName="Hierarchy", fieldLength=10)
	PA_Hierarchy_ID,
	//
	@FlyElement(name="Paid Amount", dataType=FlyDataType.Amount, entityType="D", printName="Paid", fieldLength=22)
	PaidAmt,
	//
	@FlyElement(name="Paid Until", description="Subscription is paid/valid until this date", dataType=FlyDataType.Date, entityType="D", printName="Paid Until", fieldLength=7)
	PaidUntilDate,
	//
	@FlyElement(name="Measure Calculation", description="Calculation method for measuring performance", help="The Measure Calculation indicates the method of measuring performance.", dataType=FlyDataType.TableDirect, entityType="D", printName="Measure Calculation", fieldLength=22)
	PA_MeasureCalc_ID,
	//
	@FlyElement(name="Measure", description="Concrete Performance Measurement", help="The Measure identifies a concrete, measurable indicator of performance.  For example, sales dollars, prospects contacted.", dataType=FlyDataType.TableDirect, entityType="D", printName="Measure", fieldLength=22)
	PA_Measure_ID,
	//
	@FlyElement(name="Period Type", description="PA Period Type", help="The Period Type to report on: Period, Year, Total or Natural. Natural = Year for P & L accounts, Total for Balance Sheet accounts.", dataType=FlyDataType.List, entityType="D", printName="Period Type", fieldLength=1)
	PAPeriodType,
	//
	@FlyElement(name="Default Parameter", description="Default value of the parameter", help="The default value can be a variable like @#Date@ ", dataType=FlyDataType.String, entityType="D", printName="Default Parameter", fieldLength=255)
	ParameterDefault,
	//
	@FlyElement(name="Parameter Name", dataType=FlyDataType.String, entityType="D", printName="Parameter Name", fieldLength=60)
	ParameterName,
	//
	@FlyElement(name="Parameter Type", dataType=FlyDataType.NONE, entityType="D", printName="Parameter Type", fieldLength=0)
	ParameterType,
	//
	@FlyElement(name="Parameter Value", dataType=FlyDataType.String, entityType="EE05", printName="Parameter Value", fieldLength=60)
	ParameterValue,
	//
	@FlyElement(name="Ratio Element", description="Performance Ratio Element", help="Individual calculation instruction for a ratio", dataType=FlyDataType.ID, entityType="D", printName="Ratio Element", fieldLength=10)
	PA_RatioElement_ID,
	//
	@FlyElement(name="Ratio", description="Performance Ratio", help="Calculation instruction set  for a performance ratio", dataType=FlyDataType.TableDirect, entityType="D", printName="Ratio", fieldLength=10)
	PA_Ratio_ID,
	//
	@FlyElement(name="Ratio Used", description="Performance Ratio Used", help="Existing Performance Ratio to be used in the calculation.  Make sure that the Ratio is not self-referencing (loop).", dataType=FlyDataType.Table, entityType="D", printName="Ratio Used", fieldLength=10)
	PA_RatioUsed_ID,
	//
	@FlyElement(name="Parent Column", description="The link column on the parent tab.", dataType=FlyDataType.Table, entityType="D", printName="Parent Column", fieldLength=22)
	Parent_Column_ID,
	//
	@FlyElement(name="Parent Account", description="The parent (summary) account", dataType=FlyDataType.Table, entityType="D", printName="Parent Account", fieldLength=22)
	ParentElementValue_ID,
	//
	@FlyElement(name="Parent", description="Parent of Entity", help="The Parent indicates the value used to represent the next level in a hierarchy or report to level for a record", dataType=FlyDataType.ID, entityType="D", printName="Parent", fieldLength=22)
	Parent_ID,
	//
	@FlyElement(name="Parent Menu", dataType=FlyDataType.Table, entityType="D", printName="Parent Menu", fieldLength=10)
	ParentMenu_ID,
	//
	@FlyElement(name="Parent Organization", description="Parent (superior) Organization ", help="Parent Organization - the next level in the organizational hierarchy.", dataType=FlyDataType.Table, entityType="D", printName="Parent Org", fieldLength=22)
	Parent_Org_ID,
	//
	@FlyElement(name="Parent Tax", description="Parent Tax indicates a tax that is made up of multiple taxes", help="The Parent Tax indicates a tax that is a reference for multiple taxes.  This allows you to charge multiple taxes on a document by entering the Parent Tax", dataType=FlyDataType.Table, entityType="D", printName="Parent Tax", fieldLength=22)
	Parent_Tax_ID,
	//
	@FlyElement(name="Parent Key", description="Key if the Parent", dataType=FlyDataType.String, entityType="D", printName="Parent Key", fieldLength=40)
	ParentValue,
	//
	@FlyElement(name="Report Column", description="Column in Report", dataType=FlyDataType.ID, entityType="D", printName="Report Column", fieldLength=22)
	PA_ReportColumn_ID,
	//
	@FlyElement(name="Report Column Set", description="Collection of Columns for Report", help="The Report Column Set identifies the columns used in a Report.", dataType=FlyDataType.TableDirect, entityType="D", printName="Report Column Set", fieldLength=22)
	PA_ReportColumnSet_ID,
	//
	@FlyElement(name="Report Cube", description="Define reporting cube for pre-calculation of summary accounting data.", help="Summary data will be generated for each period of the selected calendar, grouped by the selected dimensions..", dataType=FlyDataType.ID, entityType="D", printName="Report Cube", fieldLength=22)
	PA_ReportCube_ID,
	//
	@FlyElement(name="Financial Report", description="Financial Report", dataType=FlyDataType.ID, entityType="D", printName="Financial Report", fieldLength=22)
	PA_Report_ID,
	//
	@FlyElement(name="Report Line", dataType=FlyDataType.ID, entityType="D", printName="Report Line", fieldLength=22)
	PA_ReportLine_ID,
	//
	@FlyElement(name="Report Line Set", dataType=FlyDataType.TableDirect, entityType="D", printName="Report Line Set", fieldLength=22)
	PA_ReportLineSet_ID,
	//
	@FlyElement(name="Report Source", description="Restriction of what will be shown in Report Line", dataType=FlyDataType.ID, entityType="D", printName="Report Source", fieldLength=22)
	PA_ReportSource_ID,
	//
	@FlyElement(name="Parse Statement", description="Select if the SQL statement should be parsed based on terminating semi-colons.", help="Deselect if the SQL statement provided is a function definition (CREATE OR REPLACE FUNCTION...) rather than a collection of statements.  This prevents parsing of the function based on semi-colons which can occur in the function definition.  Also deselect this with single sql statements that have semi-colons in text within the statement.", dataType=FlyDataType.YesNo, entityType="D", printName="Parse", fieldLength=1)
	Parse,
	//
	@FlyElement(name="Partner ID", description="Partner ID or Account for the Payment Processor", help="Partner ID (Verisign) or Account ID (Optimal)", dataType=FlyDataType.String, entityType="D", printName="Partner ID", fieldLength=60)
	PartnerID,
	//
	@FlyElement(name="Partners Birth Date", description="Partners Birth Date", help="The Partners Birth Date", dataType=FlyDataType.Date, entityType="EE02", printName="Partners Birth Date", fieldLength=0)
	PartnersBirthDate,
	//
	@FlyElement(name="Partner's Name", description="Partner's Name", help="The Partner's Name of an Employee", dataType=FlyDataType.String, entityType="EE02", printName="Partner's Name", fieldLength=0)
	PartnersName,
	//
	@FlyElement(name="SLA Criteria", description="Service Level Agreement Criteria", help="Criteria to measure service level agreements (e.g. Quality, Delivery meets Promised date, ..)", dataType=FlyDataType.ID, entityType="D", printName="SLA Criteria", fieldLength=22)
	PA_SLA_Criteria_ID,
	//
	@FlyElement(name="SLA Goal", description="Service Level Agreement Goal", help="Goal for the SLA criteria for the Business Partner", dataType=FlyDataType.TableDirect, entityType="D", printName="SLA Goal", fieldLength=22)
	PA_SLA_Goal_ID,
	//
	@FlyElement(name="SLA Measure", description="Service Level Agreement Measure", help="View/Maintain the individual actual value / measure for the business partner service level agreement goal", dataType=FlyDataType.ID, entityType="D", printName="SLA Measure", fieldLength=22)
	PA_SLA_Measure_ID,
	//
	@FlyElement(name="Product Asset", description="Account for Product Asset (Inventory)", help="The Product Asset Account indicates the account used for valuing this a product in inventory.", dataType=FlyDataType.Account, entityType="D", printName="Product Asset", fieldLength=22)
	P_Asset_Acct,
	//
	@FlyElement(name="Password", description="Password of any length (case sensitive)", help="The Password for this User.  Passwords are required to identify authorized users.  For Adempiere Users, you can change the password via the Process 'Reset Password'.", dataType=FlyDataType.String, entityType="D", printName="Password", fieldLength=1024)
	Password,
	//
	@FlyElement(name="Password Info", dataType=FlyDataType.String, entityType="EE05", printName="Password Info", fieldLength=255)
	PasswordInfo,
	//
	@FlyElement(name="Past Due 1-30", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 1-30", fieldLength=22)
	PastDue1_30,
	//
	@FlyElement(name="Past Due 1-7", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 1-7", fieldLength=22)
	PastDue1_7,
	//
	@FlyElement(name="Past Due 31-60", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 31-60", fieldLength=22)
	PastDue31_60,
	//
	@FlyElement(name="Past Due > 31", dataType=FlyDataType.Amount, entityType="D", printName="Past Due > 31", fieldLength=22)
	PastDue31_Plus,
	//
	@FlyElement(name="Past Due 61-90", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 61-90", fieldLength=22)
	PastDue61_90,
	//
	@FlyElement(name="Past Due > 61", dataType=FlyDataType.Amount, entityType="D", printName="Past Due > 61", fieldLength=22)
	PastDue61_Plus,
	//
	@FlyElement(name="Past Due 8-30", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 8-30", fieldLength=22)
	PastDue8_30,
	//
	@FlyElement(name="Past Due > 91", dataType=FlyDataType.Amount, entityType="D", printName="Past Due > 91", fieldLength=22)
	PastDue91_Plus,
	//
	@FlyElement(name="Past Due", dataType=FlyDataType.Amount, entityType="D", printName="Past Due", fieldLength=22)
	PastDueAmt,
	//
	@FlyElement(name="Average Cost Variance", description="Average Cost Variance", help="The Average Cost Variance is used in weighted average costing to reflect differences when posting costs for negative inventory.", dataType=FlyDataType.Account, entityType="D", printName="Average Cost Variance", fieldLength=10)
	P_AverageCostVariance_Acct,
	//
	@FlyElement(name="Payment amount", description="Amount being paid", help="Indicates the amount this payment is for.  The payment amount can be for single or multiple invoices or a partial payment for an invoice.", dataType=FlyDataType.Amount, entityType="D", printName="Payment Amt", fieldLength=22)
	PayAmt,
	//
	@FlyElement(name="Payment BPartner", description="Business Partner responsible for the payment", dataType=FlyDataType.ID, entityType="D", printName="Payment BPartner", fieldLength=22)
	Pay_BPartner_ID,
	//
	@FlyElement(name="Payment date", description="Date Payment made", help="The Payment Date indicates the date the payment was made.", dataType=FlyDataType.Date, entityType="D", printName="Payment date", fieldLength=7)
	PayDate,
	//
	@FlyElement(name="Payment Discount Expense", description="Payment Discount Expense Account", help="Indicates the account to be charged for payment discount expenses.", dataType=FlyDataType.Account, entityType="D", printName="Pay discount expense", fieldLength=22)
	PayDiscount_Exp_Acct,
	//
	@FlyElement(name="Payment Discount Revenue", description="Payment Discount Revenue Account", help="Indicates the account to be charged for payment discount revenues.", dataType=FlyDataType.Account, entityType="D", printName="Pay discount revenue", fieldLength=22)
	PayDiscount_Rev_Acct,
	//
	@FlyElement(name="Payment Location", description="Location of the Business Partner responsible for the payment", dataType=FlyDataType.ID, entityType="D", printName="Payment Location", fieldLength=22)
	Pay_Location_ID,
	//
	@FlyElement(name="Payment Document No", description="Document number of the Payment", dataType=FlyDataType.String, entityType="D", printName="Payment Document No", fieldLength=30)
	PaymentDocumentNo,
	//
	@FlyElement(name="Payment Export Class", dataType=FlyDataType.String, entityType="D", printName="Payment Export Class", fieldLength=60)
	PaymentExportClass,
	//
	@FlyElement(name="Payment Frequency", description="Payment Frequency", help="The Payment Frequency", dataType=FlyDataType.List, entityType="EE02", printName="Payment Frequency", fieldLength=0)
	PaymentFrequency,
	//
	@FlyElement(name="Payment Rule", description="How you pay the invoice", help="The Payment Rule indicates the method of invoice payment.", dataType=FlyDataType.List, entityType="D", printName="Payment Rule", fieldLength=1)
	PaymentRule,
	//
	@FlyElement(name="Payment Rule", description="Purchase payment option", help="The Payment Rule indicates the method of purchase payment.", dataType=FlyDataType.List, entityType="D", printName="Payment Rule", fieldLength=1)
	PaymentRulePO,
	//
	@FlyElement(name="Payment Term", description="Payment Term", dataType=FlyDataType.String, entityType="D", printName="Payment Term", fieldLength=60)
	PaymentTerm,
	//
	@FlyElement(name="Payment Term Note", description="Note of a Payment Term", dataType=FlyDataType.String, entityType="D", printName="Payment Term Note", fieldLength=2000)
	PaymentTermNote,
	//
	@FlyElement(name="Payment Term Key", description="Key of the Payment Term", dataType=FlyDataType.String, entityType="D", printName="Payment Term Key", fieldLength=40)
	PaymentTermValue,
	//
	@FlyElement(name="Payment Processor Class", description="Payment Processor Java Class", help="Payment Processor class identifies the Java class used to process payments extending the org.compiere.model.PaymentProcessor class. <br>	Example implementations are Optimal Payments: org.compiere.model.PP_Optimal or Verisign: org.compiere.model.PP_PayFlowPro", dataType=FlyDataType.String, entityType="D", printName="Payment Processor Class", fieldLength=60)
	PayProcessorClass,
	//
	@FlyElement(name="Payroll Value", description="Define the a Search key of a payroll", dataType=FlyDataType.String, entityType="EE02", printName="Payroll Value", fieldLength=40)
	PayrollValue,
	//
	@FlyElement(name="Burden", description="The Burden account is the account used Manufacturing Order", help="The Burden is used for accounting the Burden", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Burden", fieldLength=22)
	P_Burden_Acct,
	//
	@FlyElement(name="Product COGS", description="Account for Cost of Goods Sold", help="The Product COGS Account indicates the account used when recording costs associated with this product.", dataType=FlyDataType.Account, entityType="D", printName="Product COGS", fieldLength=22)
	P_COGS_Acct,
	//
	@FlyElement(name="Cost Adjustment", description="Product Cost Adjustment Account", help="Account used for posting product cost adjustments (e.g. landed costs)", dataType=FlyDataType.Account, entityType="D", printName="Cost Adjustment", fieldLength=10)
	P_CostAdjustment_Acct,
	//
	@FlyElement(name="Cost Of Production", description="The Cost Of Production account is the account used Manufacturing Order", help="The Cost Of Production is used for accounting Non productive Labor	", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Cost Of Production", fieldLength=22)
	P_CostOfProduction_Acct,
	//
	@FlyElement(name="Process Date", description="Process Parameter", dataType=FlyDataType.DateTime, entityType="D", printName="P Date", fieldLength=7)
	P_Date,
	//
	@FlyElement(name="Process Date To", description="Process Parameter", dataType=FlyDataType.DateTime, entityType="D", printName="P Date To", fieldLength=7)
	P_Date_To,
	//
	@FlyElement(name="Confidentiality", description="Type of Confidentiality", dataType=FlyDataType.NONE, entityType="D", printName="Confidentiality", fieldLength=0)
	p_DefaultConfidentiality,
	//
	@FlyElement(name="User Importance", description="Priority of the issue for the User", dataType=FlyDataType.NONE, entityType="D", printName="User Importance", fieldLength=0)
	p_DefaultPriority,
	//
	@FlyElement(name="Percent", description="Percentage", help="The Percent indicates the percentage used.", dataType=FlyDataType.Number, entityType="D", printName="Percent", fieldLength=22)
	Percent,
	//
	@FlyElement(name="Percentage", description="Percent of the entire amount", help="Percentage of an amount (up to 100)", dataType=FlyDataType.Number, entityType="D", printName="Percentage", fieldLength=22)
	Percentage,
	//
	@FlyElement(name="Total Percent", description="Sum of the Percent details ", dataType=FlyDataType.Number, entityType="D", printName="Total Percent", fieldLength=22)
	PercentTotal,
	//
	@FlyElement(name="% Utilization", dataType=FlyDataType.Number, entityType="EE01", printName="% Utilization", fieldLength=10)
	PercentUtilization,
	//
	@FlyElement(name="Period Action", description="Action taken for this period", help="The Period Action indicates the action to be taken for this period.  For example 'Close Period' or 'Open Period'.", dataType=FlyDataType.List, entityType="D", printName="Period Action", fieldLength=1)
	PeriodAction,
	//
	@FlyElement(name="Periods of History", description="Number Period of History", dataType=FlyDataType.NONE, entityType="EE01", printName="Periods of History", fieldLength=0)
	PeriodHistory,
	//
	@FlyElement(name="Period Name", dataType=FlyDataType.NONE, entityType="EE01", printName="Period Name", fieldLength=0)
	PeriodName,
	//
	@FlyElement(name="Period No", description="Unique Period Number", help="The Period No identifies a specific period for this year. Each period is defined by a start and end date.  Date ranges for a calendar and year cannot overlap.", dataType=FlyDataType.Integer, entityType="D", printName="Period No", fieldLength=22)
	PeriodNo,
	//
	@FlyElement(name="Future Days", description="Number of days to be able to post to a future date (based on system date)", help="If Automatic Period Control is enabled, the current period is calculated based on the system date and you can always post to all days in the current period.  Future Days enable to post to future periods. E.g. today is Apr 15th and Future Days is set to 30, you can post up to May 15th", dataType=FlyDataType.Integer, entityType="D", printName="Future Days", fieldLength=22)
	Period_OpenFuture,
	//
	@FlyElement(name="History Days", description="Number of days to be able to post in the past (based on system date)", help="If Automatic Period Control is enabled, the current period is calculated based on the system date and you can always post to all days in the current period.  History Days enable to post to previous periods.  E.g. today is May 15th and History Days is set to 30, you can post back to April 15th", dataType=FlyDataType.Integer, entityType="D", printName="History Days", fieldLength=22)
	Period_OpenHistory,
	//
	@FlyElement(name="Period Status", description="Current state of this period", help="The Period Status indicates the current status for this period.  For example 'Closed', 'Open', 'Never Opened'.", dataType=FlyDataType.List, entityType="D", printName="Period Status", fieldLength=1)
	PeriodStatus,
	//
	@FlyElement(name="Period Type", description="Period Type", help="The Period Type indicates the type (Standard or Adjustment) of period.", dataType=FlyDataType.List, entityType="D", printName="Period Type", fieldLength=1)
	PeriodType,
	//
	@FlyElement(name="Error Folder", dataType=FlyDataType.NONE, entityType="D", printName="Error Folder", fieldLength=0)
	p_ErrorFolder,
	//
	@FlyElement(name="Product Expense", description="Account for Product Expense", help="The Product Expense Account indicates the account used to record expenses associated with this product.", dataType=FlyDataType.Account, entityType="D", printName="Product Expense", fieldLength=22)
	P_Expense_Acct,
	//
	@FlyElement(name="Floor Stock", description="The Floor Stock account is the account used Manufacturing Order", help="The Floor Stock is used for accounting the component with Issue method  is set Floor stock  into Bill of Material & Formula Window.		The components with Issue Method  defined as Floor stock is acounting next way:		Debit Floor Stock Account	Credit Work in Process Account", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Floor Stock", fieldLength=22)
	P_FloorStock_Acct,
	//
	@FlyElement(name="Phone", description="Identifies a telephone number", help="The Phone field identifies a telephone number", dataType=FlyDataType.String, entityType="D", printName="Phone", fieldLength=40)
	Phone,
	//
	@FlyElement(name="2nd Phone", description="Identifies an alternate telephone number.", help="The 2nd Phone field identifies an alternate telephone number.", dataType=FlyDataType.String, entityType="D", printName="2nd Phone", fieldLength=40)
	Phone2,
	//
	@FlyElement(name="Pick Date", description="Date/Time when picked for Shipment", dataType=FlyDataType.DateTime, entityType="D", printName="Pick Date", fieldLength=7)
	PickDate,
	//
	@FlyElement(name="Picked Qty", dataType=FlyDataType.Quantity, entityType="D", printName="Picked Qty", fieldLength=22)
	PickedQty,
	//
	@FlyElement(name="Process ID", dataType=FlyDataType.ID, entityType="D", printName="P ID", fieldLength=22)
	P_ID,
	//
	@FlyElement(name="IMAP Host", dataType=FlyDataType.NONE, entityType="D", printName="IMAP Host", fieldLength=0)
	p_IMAPHost,
	//
	@FlyElement(name="IMAP Password", dataType=FlyDataType.NONE, entityType="D", printName="IMAP Password", fieldLength=0)
	p_IMAPPwd,
	//
	@FlyElement(name="IMAP User", dataType=FlyDataType.NONE, entityType="D", printName="IMAP User", fieldLength=0)
	p_IMAPUser,
	//
	@FlyElement(name="PIN", description="Personal Identification Number", dataType=FlyDataType.String, entityType="D", printName="PIN", fieldLength=20)
	PIN,
	//
	@FlyElement(name="Inbox Folder", dataType=FlyDataType.NONE, entityType="D", printName="Inbox Folder", fieldLength=0)
	p_InboxFolder,
	//
	@FlyElement(name="PIN Entry Timeout", description="PIN Entry Timeout - the amount of time from initial display until the PIN entry dialog times out, in milliseconds.", dataType=FlyDataType.Integer, entityType="D", printName="PIN Entry Timeout", fieldLength=22)
	PINEntryTimeout,
	//
	@FlyElement(name="Inventory Clearing", description="Product Inventory Clearing Account", help="Account used for posting matched product (item) expenses (e.g. AP Invoice, Invoice Match).  You would use a different account then Product Expense, if you want to differentiate service related costs from item related costs. The balance on the clearing account should be zero and accounts for the timing difference between invoice receipt and matching.", dataType=FlyDataType.Account, entityType="D", printName="Inventory Clearing", fieldLength=10)
	P_InventoryClearing_Acct,
	//
	@FlyElement(name="Invoice Price Variance", description="Difference between Costs and Invoice Price (IPV)", help="The Invoice Price Variance is used reflects the difference between the current Costs and the Invoice Price.", dataType=FlyDataType.Account, entityType="D", printName="Invoice Price Variance", fieldLength=22)
	P_InvoicePriceVariance_Acct,
	//
	@FlyElement(name="Project Asset", description="Project Asset Account", help="The Project Asset account is the account used as the final asset account in capital projects", dataType=FlyDataType.Account, entityType="D", printName="Project Asset", fieldLength=22)
	PJ_Asset_Acct,
	//
	@FlyElement(name="Work In Progress", description="Account for Work in Progress", help="The Work in Process account is the account used in capital projects until the project is completed", dataType=FlyDataType.Account, entityType="D", printName="WIP Account", fieldLength=22)
	PJ_WIP_Acct,
	//
	@FlyElement(name="PK_Status", dataType=FlyDataType.String, entityType="D", printName="PK_Status", fieldLength=44)
	PK_Status,
	//
	@FlyElement(name="Package Version", dataType=FlyDataType.String, entityType="D", printName="Package Version", fieldLength=40)
	PK_Version,
	//
	@FlyElement(name="Labor", description="The Labor account is the account used Manufacturing Order", help="The Labor is used for accounting the productive Labor	", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Labor", fieldLength=22)
	P_Labor_Acct,
	//
	@FlyElement(name="Place of Birth", description="Place of Birth", dataType=FlyDataType.String, entityType="EE02", printName="Place of Birth", fieldLength=0)
	PlaceOfBirth,
	//
	@FlyElement(name="Place of Birth (Location)", description="Place of Birth (Location)", dataType=FlyDataType.Location, entityType="ECA02", printName="Place of Birth (Location)", fieldLength=10)
	PlaceOfBirth_ID,
	//
	@FlyElement(name="Planned Amount", description="Planned amount for this project", help="The Planned Amount indicates the anticipated amount for this project or project line.", dataType=FlyDataType.Amount, entityType="D", printName="Planned Amt", fieldLength=22)
	PlannedAmt,
	//
	@FlyElement(name="Planned Margin %", description="Project's planned margin as a percentage", help="The Planned Margin Percentage indicates the anticipated margin percentage for this project or project line", dataType=FlyDataType.Number, entityType="D", printName="Planned Margin", fieldLength=22)
	PlannedMargin,
	//
	@FlyElement(name="Planned Margin", description="Project's planned margin amount", help="The Planned Margin Amount indicates the anticipated margin amount for this project or project line.", dataType=FlyDataType.Amount, entityType="D", printName="Planned Margin", fieldLength=22)
	PlannedMarginAmt,
	//
	@FlyElement(name="Planned Price", description="Planned price for this project line", help="The Planned Price indicates the anticipated price for this project line.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Planned Price", fieldLength=22)
	PlannedPrice,
	//
	@FlyElement(name="Generate Planned Production Report", dataType=FlyDataType.Button, entityType="D", printName="Generate Planned Production Report", fieldLength=1)
	PlannedProductionReport,
	//
	@FlyElement(name="Planned Quantity", description="Planned quantity for this project", help="The Planned Quantity indicates the anticipated quantity for this project or project line", dataType=FlyDataType.Quantity, entityType="D", printName="Planned Qty", fieldLength=22)
	PlannedQty,
	//
	@FlyElement(name="Planner", description="Company Agent for Planning", help="The Master Planner indicates the company agent in charge of the MPS management. Any Master Planner must be a valid internal user.", dataType=FlyDataType.Table, entityType="EE01", printName="Planner", fieldLength=22)
	Planner_ID,
	//
	@FlyElement(name="Planner Key", description="Search Key of the Planning", dataType=FlyDataType.String, entityType="EE01", printName="Planner Key", fieldLength=40)
	PlannerValue,
	//
	@FlyElement(name="Planning Horizon", description="The planning horizon is the amount of time (Days) an organisation will look into the future when preparing a strategic plan.", help="The planning horizon is the amount of time (Days) an organisation will look into the future when preparing a strategic plan.", dataType=FlyDataType.Integer, entityType="EE01", printName="Planning Horizon", fieldLength=22)
	PlanningHorizon,
	//
	@FlyElement(name="Platform Info", description="Information about Server and Client Platform", help="Include information on Server, Network [Operating System, RAM, Disk, CPUs] and (number of) Clients.", dataType=FlyDataType.Text, entityType="D", printName="Platform", fieldLength=255)
	PlatformInfo,
	//
	@FlyElement(name="Method Change Variance", description="The Method Change Variance account is the account used Manufacturing Order", help="The Method Change Variance is used in Standard Costing. It reflects the difference between the Standard BOM , Standard Manufacturing Workflow and Manufacturing BOM Manufacturing Workflow.		If you change the method the manufacturing defined in BOM or Workflow Manufacturig then this variance is generate.", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Method Change Variance", fieldLength=22)
	P_MethodChangeVariance_Acct,
	//
	@FlyElement(name="Mix Variance", description="The Mix Variance account is the account used Manufacturing Order", help="The Mix Variance is used when a co-product  received in Inventory  is different the quantity  expected	", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Mix Variance", fieldLength=22)
	P_MixVariance_Acct,
	//
	@FlyElement(name="Process Message", dataType=FlyDataType.String, entityType="D", printName="P Msg", fieldLength=2000)
	P_Msg,
	//
	@FlyElement(name="Process Number", description="Process Parameter", dataType=FlyDataType.Number, entityType="D", printName="P Number", fieldLength=22)
	P_Number,
	//
	@FlyElement(name="Process Number To", description="Process Parameter", dataType=FlyDataType.Number, entityType="D", printName="P Number To", fieldLength=22)
	P_Number_To,
	//
	@FlyElement(name="PO Description", description="Description in PO Screens", dataType=FlyDataType.String, entityType="D", printName="PO Description", fieldLength=255)
	PO_Description,
	//
	@FlyElement(name="PO Discount Schema", description="Schema to calculate the purchase trade discount percentage", dataType=FlyDataType.Table, entityType="D", printName="PO Discount Schema", fieldLength=22)
	PO_DiscountSchema_ID,
	//
	@FlyElement(name="PO Help", description="Help for PO Screens", dataType=FlyDataType.Text, entityType="D", printName="PO Help", fieldLength=2000)
	PO_Help,
	//
	@FlyElement(name="PO Name", description="Name on PO Screens", dataType=FlyDataType.String, entityType="D", printName="PO Name", fieldLength=60)
	PO_Name,
	//
	@FlyElement(name="PO Number", description="Purchase Order Number", help="The PO Number indicates the number assigned to a purchase order", dataType=FlyDataType.String, entityType="D", printName="PO Number", fieldLength=60)
	PONum,
	//
	@FlyElement(name="PO Payment Term", description="Payment rules for a purchase order", help="The PO Payment Term indicates the payment term that will be used when this purchase order becomes an invoice.", dataType=FlyDataType.Table, entityType="D", printName="PO Payment Term", fieldLength=22)
	PO_PaymentTerm_ID,
	//
	@FlyElement(name="Purchase Pricelist", description="Price List used by this Business Partner", help="Identifies the price list used by a Vendor for products purchased by this organization.", dataType=FlyDataType.Table, entityType="D", printName="Purchase Pricelist", fieldLength=22)
	PO_PriceList_ID,
	//
	@FlyElement(name="PO Print name", description="Print name on PO Screens/Reports", dataType=FlyDataType.String, entityType="D", printName="PO Print", fieldLength=60)
	PO_PrintName,
	//
	@FlyElement(name="Order Reference", description="Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner", help="The business partner order reference is the order reference for this specific transaction; Often Purchase Order numbers are given to print on Invoices for easier reference.  A standard number can be defined in the Business Partner (Customer) window.", dataType=FlyDataType.String, entityType="D", printName="Order Reference", fieldLength=20)
	POReference,
	//
	@FlyElement(name="Port", dataType=FlyDataType.Integer, entityType="EE05", printName="Port", fieldLength=14)
	Port,
	//
	@FlyElement(name="Position", dataType=FlyDataType.String, entityType="D", printName="Position", fieldLength=10)
	Position,
	//
	@FlyElement(name="POS Key Layout Type", description="The type of Key Layout", help="Keyboard: used for POS text field on screen keyboard	Numberpad: used for POS numeric field on screen numberpad	Product: used to quickly add products to POS order", dataType=FlyDataType.List, entityType="D", printName="POS Key Layout Type", fieldLength=1)
	POSKeyLayoutType,
	//
	@FlyElement(name="Pos Period Name", dataType=FlyDataType.NONE, entityType="D", printName="Pos Period Name", fieldLength=0)
	PosPeriodName,
	//
	@FlyElement(name="Post Actual", description="Actual Values can be posted", help="The Post Actual indicates if actual values can be posted to this element value.", dataType=FlyDataType.YesNo, entityType="D", printName="Post Actual", fieldLength=1)
	PostActual,
	//
	@FlyElement(name="ZIP", description="Postal code", help="The Postal Code or ZIP identifies the postal code for this entity's address.", dataType=FlyDataType.String, entityType="D", printName="ZIP", fieldLength=10)
	Postal,
	//
	@FlyElement(name="Additional Zip", description="Additional ZIP or Postal code", help="The Additional ZIP or Postal Code identifies, if appropriate, any additional Postal Code information.", dataType=FlyDataType.String, entityType="D", printName="Additional Zip", fieldLength=10)
	Postal_Add,
	//
	@FlyElement(name="ZIP To", description="Postal code to", help="Consecutive range to", dataType=FlyDataType.String, entityType="D", printName="ZIP To", fieldLength=10)
	Postal_To,
	//
	@FlyElement(name="Post Budget", description="Budget values can be posted", help="The Post Budget indicates if budget values can be posted to this element value.", dataType=FlyDataType.YesNo, entityType="D", printName="Post Budget", fieldLength=1)
	PostBudget,
	//
	@FlyElement(name="Posted", description="Posting status", help="The Posted field indicates the status of the Generation of General Ledger Accounting Lines ", dataType=FlyDataType.Button, entityType="D", printName="Posted", fieldLength=1)
	Posted,
	//
	@FlyElement(name="Post Encumbrance", description="Post commitments to this account", dataType=FlyDataType.YesNo, entityType="D", printName="Post Encumbrance", fieldLength=1)
	PostEncumbrance,
	//
	@FlyElement(name="Posting Type", description="The type of posted amount for the transaction", help="The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.", dataType=FlyDataType.List, entityType="D", printName="Posting Type", fieldLength=1)
	PostingType,
	//
	@FlyElement(name="Post Processing", description="Process SQL after executing the query", help="Could be Update/Delete/etc. statement", dataType=FlyDataType.Text, entityType="D", printName="Post Processing", fieldLength=2000)
	PostProcessing,
	//
	@FlyElement(name="Post Statistical", description="Post statistical quantities to this account?", dataType=FlyDataType.YesNo, entityType="D", printName="Post Statistical", fieldLength=1)
	PostStatistical,
	//
	@FlyElement(name="Potential Life Time Value", description="Total Revenue expected", help="The Potential Life Time Value is the anticipated revenue in primary accounting currency to be generated by the Business Partner.", dataType=FlyDataType.Amount, entityType="D", printName="Potential Life Time Value", fieldLength=22)
	PotentialLifeTimeValue,
	//
	@FlyElement(name="Outside Processing", description="The Outside Processing Account is the account used in Manufacturing Order", help="The Outside Processing Account is used for accounting the Outside Processing", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Burden", fieldLength=22)
	P_OutsideProcessing_Acct,
	//
	@FlyElement(name="Overhead", description="The Overhead account is the account used  in Manufacturing Order ", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Overhead", fieldLength=22)
	P_Overhead_Acct,
	//
	@FlyElement(name="PO Window", description="Purchase Order Window", help="Window for Purchase Order (AP) Zooms", dataType=FlyDataType.Table, entityType="D", printName="PO Window", fieldLength=22)
	PO_Window_ID,
	//
	@FlyElement(name="Operational Calendar", description="Operational Period, allows to define the periods for the Operational Calendar", dataType=FlyDataType.NONE, entityType="EE01", printName="Operational Calendar", fieldLength=0)
	PP_Calendar_ID,
	//
	@FlyElement(name="Manufacturing Cost Collector", dataType=FlyDataType.TableDirect, entityType="EE01", printName="Manufacturing Cost Collector", fieldLength=10)
	PP_Cost_Collector_ID,
	//
	@FlyElement(name="Manufacturing Order MA", dataType=FlyDataType.ID, entityType="EE01", printName="Manufacturing Cost Collector", fieldLength=10)
	PP_Cost_CollectorMA_ID,
	//
	@FlyElement(name="Forecast Definition", dataType=FlyDataType.NONE, entityType="EE01", printName="Forecast Definition", fieldLength=0)
	PP_ForecastDefinition_ID,
	//
	@FlyElement(name="Forecast Definition Line", dataType=FlyDataType.NONE, entityType="EE01", printName="Forecast Definition Line", fieldLength=0)
	PP_ForecastDefinitionLine_ID,
	//
	@FlyElement(name="Forecast Rule", description="Forecast Rules define the business logic according to a previously implemented algorithm.", dataType=FlyDataType.NONE, entityType="EE01", printName="Forecast Rule", fieldLength=0)
	PP_ForecastRule_ID,
	//
	@FlyElement(name="Forecast Run Detail", description="Contains the forecasting calculation results based on forecast definition.", dataType=FlyDataType.NONE, entityType="EE01", printName="Forecast Run Detail", fieldLength=0)
	PP_ForecastRunDetail_ID,
	//
	@FlyElement(name="Forecast Run", description="Create the forecast simulation based on the forecast definition", dataType=FlyDataType.NONE, entityType="EE01", printName="Forecast Run", fieldLength=0)
	PP_ForecastRun_ID,
	//
	@FlyElement(name="Forecast Run Line", description="Contains the forecasting calculation results based on forecast definition.", dataType=FlyDataType.NONE, entityType="EE01", printName="Forecast Run Line", fieldLength=0)
	PP_ForecastRunLine_ID,
	//
	@FlyElement(name="Forecast Run Master", dataType=FlyDataType.NONE, entityType="EE01", printName="Forecast Run Master", fieldLength=0)
	PP_ForecastRunMaster_ID,
	//
	@FlyElement(name="Forecast Run Result", description="Containts  the forecast calculation results.", dataType=FlyDataType.NONE, entityType="EE01", printName="Forecast Run Result", fieldLength=0)
	PP_ForecastRunResult_ID,
	//
	@FlyElement(name="MRP Detail ID", description="Contains the supplies chronological relationships for each demand.", dataType=FlyDataType.NONE, entityType="EE01", printName="MRP Detail ID", fieldLength=0)
	PP_MRP_Detail_ID,
	//
	@FlyElement(name="Material Requirement Planning", description="MRP ID", dataType=FlyDataType.ID, entityType="EE01", printName="Material Requirement Planning", fieldLength=10)
	PP_MRP_ID,
	//
	@FlyElement(name="Manufacturing Order BOM", dataType=FlyDataType.TableDirect, entityType="EE01", printName="Manufacturing Order BOM", fieldLength=22)
	PP_Order_BOM_ID,
	//
	@FlyElement(name="Manufacturing Order BOM Line", dataType=FlyDataType.ID, entityType="EE01", printName="Manufacturing Order BOM Line", fieldLength=10)
	PP_Order_BOMLine_ID,
	//
	@FlyElement(name="Manufacturing Order Cost", dataType=FlyDataType.ID, entityType="EE01", printName="Manufacturing Order Cost", fieldLength=22)
	PP_Order_Cost_ID,
	//
	@FlyElement(name="Manufacturing Order", description="Manufacturing Order", dataType=FlyDataType.TableDirect, entityType="EE01", printName="Manufacturing Order", fieldLength=10)
	PP_Order_ID,
	//
	@FlyElement(name="Manufacturing Order Activity Next", dataType=FlyDataType.Table, entityType="EE01", printName="Manufacturing Order Activity Next", fieldLength=22)
	PP_Order_Next_ID,
	//
	@FlyElement(name="Manufacturing Order Activity Asset", dataType=FlyDataType.ID, entityType="EE01", printName="Manufacturing Order Activity Asset", fieldLength=22)
	PP_Order_Node_Asset_ID,
	//
	@FlyElement(name="Manufacturing Order Activity", description="Workflow Node (activity), step or process", help="The Workflow Node indicates a unique step or process in a Workflow.", dataType=FlyDataType.ID, entityType="EE01", printName="Manufacturing Order Activity", fieldLength=22)
	PP_Order_Node_ID,
	//
	@FlyElement(name="Manufacturing Order Activity Next", dataType=FlyDataType.ID, entityType="EE01", printName="Manufacturing Order Activity Next", fieldLength=10)
	PP_Order_NodeNext_ID,
	//
	@FlyElement(name="Manufacturing Order Activity Product", dataType=FlyDataType.ID, entityType="EE01", printName="Manufacturing Order Activity Product", fieldLength=22)
	PP_Order_Node_Product_ID,
	//
	@FlyElement(name="Manufacturing Order Workflow", dataType=FlyDataType.TableDirect, entityType="EE01", printName="Manufacturing Order Workflow", fieldLength=22)
	PP_Order_Workflow_ID,
	//
	@FlyElement(name="Current Period", description="Period Definition, allows to define time cycles for the Operational Calendar", dataType=FlyDataType.ID, entityType="EE01", printName="Current Period", fieldLength=22)
	PP_PeriodDefinition_ID,
	//
	@FlyElement(name="Operational Period", description="Forecast Definition Periods.", dataType=FlyDataType.NONE, entityType="EE01", printName="Operational Period", fieldLength=0)
	PP_Period_ID,
	//
	@FlyElement(name="BOM & Formula", description="BOM & Formula", dataType=FlyDataType.Search, entityType="EE01", printName="BOM & Formula", fieldLength=10)
	PP_Product_BOM_ID,
	//
	@FlyElement(name="BOM Line", description="BOM Line", help="The BOM Line is a unique identifier for a BOM line in an BOM.", dataType=FlyDataType.ID, entityType="EE01", printName="BOM Line", fieldLength=22)
	PP_Product_BOMLine_ID,
	//
	@FlyElement(name="Product Planning", description="Product Planning", help="Defines the planning data for each product to be able to calculate the Materials plan, these data can be maintained by Organization, Plant and Warehouse.", dataType=FlyDataType.ID, entityType="EE01", printName="Product Planning", fieldLength=22)
	PP_Product_Planning_ID,
	//
	@FlyElement(name="Purchase Price Variance", description="Difference between Standard Cost and Purchase Price (PPV)", help="The Purchase Price Variance is used in Standard Costing. It reflects the difference between the Standard Cost and the Purchase Order Price.", dataType=FlyDataType.Account, entityType="D", printName="Purchase Price Variance", fieldLength=22)
	P_PurchasePriceVariance_Acct,
	//
	@FlyElement(name="PPV Offset", description="Purchase Price Variance Offset Account", help="Offset account for standard costing purchase price variances. The counter account is Product PPV.", dataType=FlyDataType.Account, entityType="D", printName="PPV Offset", fieldLength=22)
	PPVOffset_Acct,
	//
	@FlyElement(name="Workflow Node Asset", dataType=FlyDataType.ID, entityType="EE01", printName="Workflow Node Asset", fieldLength=22)
	PP_WF_Node_Asset_ID,
	//
	@FlyElement(name="Workflow Node Product", dataType=FlyDataType.ID, entityType="EE01", printName="Workflow Node Product", fieldLength=22)
	PP_WF_Node_Product_ID,
	//
	@FlyElement(name="Rate Variance", description="The Rate Variance account is the account used Manufacturing Order", help="The Rate Variance is used in Standard Costing. It reflects the difference between the Standard Cost Rates and  The Cost Rates of Manufacturing Order.		If you change the Standard Rates then this variance is generate.", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Rate Variance", fieldLength=22)
	P_RateVariance_Acct,
	//
	@FlyElement(name="Preference Level", description="Determines what preferences the user can set", help="Preferences allow you to define default values.  If set to None, you cannot set any preference nor value preference. Only if set to Client, you can see the Record Info Change Log.", dataType=FlyDataType.List, entityType="D", printName="Preference Level", fieldLength=1)
	PreferenceType,
	//
	@FlyElement(name="Preferred Width", description="Preferred width in pixels", dataType=FlyDataType.Integer, entityType="D", printName="Preferred Width", fieldLength=10)
	PreferredWidth,
	//
	@FlyElement(name="Prefix", description="Prefix before the sequence number", help="The Prefix indicates the characters to print in front of the document number.", dataType=FlyDataType.String, entityType="D", printName="Prefix", fieldLength=255)
	Prefix,
	//
	@FlyElement(name="Premium Amount", description="Premium Amount", help="The Premium Amount of an Insurance", dataType=FlyDataType.Number, entityType="EE02", printName="Premium Amount", fieldLength=0)
	PremiumAmount,
	//
	@FlyElement(name="Pre Period Name", dataType=FlyDataType.NONE, entityType="D", printName="Pre Period Name", fieldLength=0)
	PrePeriodName,
	//
	@FlyElement(name="Pre Processing", description="Process SQL before executing the query", help="Could be Update/Delete/etc. statement", dataType=FlyDataType.Text, entityType="D", printName="Pre Processing", fieldLength=2000)
	PreProcessing,
	//
	@FlyElement(name="Request Folder", dataType=FlyDataType.NONE, entityType="D", printName="Request Folder", fieldLength=0)
	p_RequestFolder,
	//
	@FlyElement(name="Product Revenue", description="Account for Product Revenue (Sales Account)", help="The Product Revenue Account indicates the account used for recording sales revenue for this product.", dataType=FlyDataType.Account, entityType="D", printName="Product Revenue", fieldLength=22)
	P_Revenue_Acct,
	//
	@FlyElement(name="Price", description="Price", help="The Price indicates the Price for a product or service.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price", fieldLength=22)
	Price,
	//
	@FlyElement(name="Unit Price", description="Actual Price ", help="The Actual or Unit Price indicates the Price for a product in source currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Unit Price", fieldLength=22)
	PriceActual,
	//
	@FlyElement(name="Cost Price", description="Price per Unit of Measure including all indirect costs (Freight, etc.)", help="Optional Purchase Order Line cost price.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Cost Price", fieldLength=22)
	PriceCost,
	//
	@FlyElement(name="Price effective", description="Effective Date of Price", help="The Price Effective indicates the date this price is for. This allows you to enter future prices for products which will become effective when appropriate.", dataType=FlyDataType.Date, entityType="D", printName="Effective", fieldLength=7)
	PriceEffective,
	//
	@FlyElement(name="Price", description="Price Entered - the price based on the selected/base UoM", help="The price entered is converted to the actual price based on the UoM conversion", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price", fieldLength=22)
	PriceEntered,
	//
	@FlyElement(name="List Prive", description="Entered List Price", help="Price List converted to entered UOM", dataType=FlyDataType.CostsPrices, entityType="D", printName="List Price", fieldLength=22)
	PriceEnteredList,
	//
	@FlyElement(name="Price Invoiced", description="The priced invoiced to the customer (in the currency of the customer's AR price list) - 0 for default price", help="The invoiced price is derived from the Invoice Price entered and can be overwritten.  If the price is 0, the default price on the customer's invoice is used.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price Invoiced", fieldLength=22)
	PriceInvoiced,
	//
	@FlyElement(name="Last Invoice Price", description="Price of the last invoice for the product", help="The Last Invoice Price indicates the last price paid (per the invoice) for this product.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Last Invoice Price", fieldLength=22)
	PriceLastInv,
	//
	@FlyElement(name="Last PO Price", description="Price of the last purchase order for the product", help="The Last PO Price indicates the last price paid (per the purchase order) for this product.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Last PO Price", fieldLength=22)
	PriceLastPO,
	//
	@FlyElement(name="Limit Price", description="Lowest price for a product", help="The Price Limit indicates the lowest price for a product stated in the Price List Currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Limit Price", fieldLength=22)
	PriceLimit,
	//
	@FlyElement(name="Limit price Value", description="Value with limit price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Limit price Value", fieldLength=22)
	PriceLimitAmt,
	//
	@FlyElement(name="List Price", description="List Price", help="The List Price is the official List Price in the document currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="List Price", fieldLength=22)
	PriceList,
	//
	@FlyElement(name="List price Value", description="Valuation with List Price", dataType=FlyDataType.CostsPrices, entityType="D", printName="List price Value", fieldLength=22)
	PriceListAmt,
	//
	@FlyElement(name="Price Match Difference", description="Difference between Purchase and Invoice Price per matched line", help="The difference between purchase and invoice price may be used for requiring explicit approval if a Price Match Tolerance is defined on Business Partner Group level.", dataType=FlyDataType.Amount, entityType="D", printName="Price Match Difference", fieldLength=22)
	PriceMatchDifference,
	//
	@FlyElement(name="Price Match Tolerance", description="PO-Invoice Match Price Tolerance in percent of the purchase price", help="Tolerance in Percent of matching the purchase order price to the invoice price.  The difference is posted as Invoice Price Tolerance for Standard Costing.  If defined, the PO-Invoice match must be explicitly approved, if the matching difference is greater then the tolerance.<br>	Example: if the purchase price is $100 and the tolerance is 1 (percent), the invoice price must be between $99 and 101 to be automatically approved.", dataType=FlyDataType.Number, entityType="D", printName="Price Match Tolerance", fieldLength=22)
	PriceMatchTolerance,
	//
	@FlyElement(name="Price Override Type", description="Type of price override, fixed price or discount off list", dataType=FlyDataType.List, entityType="D", printName="Price Override Type", fieldLength=1)
	PriceOverrideType,
	//
	@FlyElement(name="PO Price", description="Price based on a purchase order", help="The PO Price indicates the price for a product per the purchase order.", dataType=FlyDataType.CostsPrices, entityType="D", printName="PO Price", fieldLength=22)
	PricePO,
	//
	@FlyElement(name="PO Price Value", description="Valuation with PO Price", dataType=FlyDataType.CostsPrices, entityType="D", printName="PO Price Value", fieldLength=22)
	PricePOAmt,
	//
	@FlyElement(name="Price Precision", description="Precision (number of decimals) for the Price", help="The prices of the price list are rounded to the precision entered.  This allows to have prices with below currency precision, e.g. $0.005. Enter the number of decimals or -1 for no rounding.", dataType=FlyDataType.Integer, entityType="D", printName="Price Precision", fieldLength=22)
	PricePrecision,
	//
	@FlyElement(name="Price Reimbursed", description="The reimbursed price (in currency of the employee's AP price list)", help="The reimbursed price is derived from the converted price and can be overwritten when approving the expense report.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price Reimbursed", fieldLength=22)
	PriceReimbursed,
	//
	@FlyElement(name="Standard Price", description="Standard Price", help="The Standard Price indicates the standard or normal price for a product on this price list", dataType=FlyDataType.CostsPrices, entityType="D", printName="Std Price", fieldLength=22)
	PriceStd,
	//
	@FlyElement(name="Std Price Value", description="Valuation with standard price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Std Price Value", fieldLength=22)
	PriceStdAmt,
	//
	@FlyElement(name="Primary Skills", description="Define of Primary Skills for this position", help="The Primary Skills are of most important and necessary for the position", dataType=FlyDataType.Text, entityType="EE02", printName="Primary Skills", fieldLength=0)
	PrimarySkills,
	//
	@FlyElement(name="Area", description="Print Area", help="Print area of this item", dataType=FlyDataType.List, entityType="D", printName="Area", fieldLength=1)
	PrintAreaType,
	//
	@FlyElement(name="Print Document", description="Document to print", dataType=FlyDataType.NONE, entityType="D", printName="Print Document", fieldLength=0)
	PrintDocument,
	//
	@FlyElement(name="Printer Name", description="Name of the Printer", help="Internal (Operating System) Name of the Printer; Please mote that the printer name may be different on different clients. Enter a printer name, which applies to ALL clients (e.g. printer on a server). <p>	If none is entered, the default printer is used. You specify your default printer when you log in. You can also change the default printer in Preferences.", dataType=FlyDataType.String, entityType="D", printName="Printer Name", fieldLength=40)
	PrinterName,
	//
	@FlyElement(name="Format Type", description="Print Format Type", help="The print format type determines what will be printed.", dataType=FlyDataType.List, entityType="D", printName="Format Type", fieldLength=1)
	PrintFormatType,
	//
	@FlyElement(name="Print Text", description="The label text to be printed on a document or correspondence.", help="The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters.", dataType=FlyDataType.String, entityType="D", printName="Text", fieldLength=60)
	PrintName,
	//
	@FlyElement(name="Print Label Suffix", description="The label text to be printed on a document or correspondence after the field", help="The Label to be printed indicates the name that will be printed on a document or correspondence after the field. The max length is 60 characters.", dataType=FlyDataType.String, entityType="D", printName="Label Suffix", fieldLength=60)
	PrintNameSuffix,
	//
	@FlyElement(name="Print Unprocessed Entries Only", dataType=FlyDataType.NONE, entityType="D", printName="Print Unprocessed Entries Only", fieldLength=0)
	PrintUnprocessedOnly,
	//
	@FlyElement(name="Priority", description="Indicates if this request is of a high, medium or low priority.", help="The Priority indicates the importance of this request.", dataType=FlyDataType.List, entityType="D", printName="Priority", fieldLength=1)
	Priority,
	//
	@FlyElement(name="Priority Base", description="Base of Priority", help="When deriving the Priority from Importance, the Base is 'added' to the User Importance.", dataType=FlyDataType.List, entityType="D", printName="Priority Base", fieldLength=1)
	PriorityBase,
	//
	@FlyElement(name="Relative Priority", description="Where inventory should be picked from first", help="The Relative Priority indicates the location to pick from first if an product is stored in more than one location.  (100 = highest priority, 0 = lowest).  For outgoing shipments, the location is picked with the highest priority where the entire quantity can be shipped from.  If there is no location, the location with the highest priority is used.	The Priority is ignored for products with Guarantee Date (always the oldest first) or if a specific instance is selected.	Incoming receipts are stored at the location with the highest priority, if not explicitly selected.", dataType=FlyDataType.Integer, entityType="D", printName="Relative Priority", fieldLength=22)
	PriorityNo,
	//
	@FlyElement(name="Priority", description="Priority of a document", help="The Priority indicates the importance (high, medium, low) of this document", dataType=FlyDataType.List, entityType="D", printName="Priority", fieldLength=1)
	PriorityRule,
	//
	@FlyElement(name="User Importance", description="Priority of the issue for the User", dataType=FlyDataType.List, entityType="D", printName="User Importance", fieldLength=1)
	PriorityUser,
	//
	@FlyElement(name="Private Note", description="Private Note - not visible to the other parties", dataType=FlyDataType.Text, entityType="D", printName="Private Note", fieldLength=2000)
	PrivateNote,
	//
	@FlyElement(name="Probability", dataType=FlyDataType.NONE, entityType="D", printName="Probability", fieldLength=0)
	Probability,
	//
	@FlyElement(name="Create", dataType=FlyDataType.Button, entityType="D", printName="Create", fieldLength=1)
	ProcCreate,
	//
	@FlyElement(name="Procedure", description="Name of the Database Procedure", help="The Procedure indicates the name of the database procedure called by this report or process.", dataType=FlyDataType.String, entityType="D", printName="Procedure", fieldLength=60)
	ProcedureName,
	//
	@FlyElement(name="Processed", description="The document has been processed", help="The Processed checkbox indicates that a document has been processed.", dataType=FlyDataType.YesNo, entityType="D", printName="Processed", fieldLength=1)
	Processed,
	//
	@FlyElement(name="Processed On", description="The date+time (expressed in decimal format) when the document has been processed", help="The ProcessedOn Date+Time save the exact moment (nanoseconds precision if allowed by the DB) when a document has been processed.", dataType=FlyDataType.Number, entityType="D", printName="Processed On", fieldLength=20)
	ProcessedOn,
	//
	@FlyElement(name="Process Now", dataType=FlyDataType.Button, entityType="D", printName="Process Now", fieldLength=1)
	Processing,
	//
	@FlyElement(name="Processing date", dataType=FlyDataType.Date, entityType="D", printName="Processing date", fieldLength=7)
	ProcessingDate,
	//
	@FlyElement(name="Process Name", description="Name of the Process", dataType=FlyDataType.String, entityType="EE02", printName="Process Name", fieldLength=60)
	ProcessName,
	//
	@FlyElement(name="Process Type", dataType=FlyDataType.List, entityType="EE01", printName="Process Type", fieldLength=2)
	ProcessType,
	//
	@FlyElement(name="Product", dataType=FlyDataType.String, entityType="D", printName="Product", fieldLength=40)
	Product,
	//
	@FlyElement(name="Product Attribute", description="Product Attribute Instance Description", dataType=FlyDataType.String, entityType="D", printName="Product Attribute", fieldLength=2000)
	ProductAttribute,
	//
	@FlyElement(name="Product Attribute To", description="Product Attribute Instance Description", dataType=FlyDataType.Text, entityType="EE01", printName="Product Attribute To", fieldLength=10)
	ProductAttributeTo,
	//
	@FlyElement(name="Product BOM Key", description="Key of Product BOM", dataType=FlyDataType.String, entityType="D", printName="Product BOM Key", fieldLength=40)
	Product_BOM_Value,
	//
	@FlyElement(name="Product Category Key", dataType=FlyDataType.String, entityType="D", printName="Product Category Key", fieldLength=40)
	ProductCategory_Value,
	//
	@FlyElement(name="Product Classification Key", description="The key value for the product classification", help="A product classification is a way to organize products", dataType=FlyDataType.String, entityType="D", printName="Product Classification Key", fieldLength=40)
	ProductClassification_Value,
	//
	@FlyElement(name="Product Class Key", description="The key value for the product class", help="A product class is a way to organize products", dataType=FlyDataType.String, entityType="D", printName="Product Class Key", fieldLength=40)
	ProductClass_Value,
	//
	@FlyElement(name="Product Column", description="Fully qualified Product column (M_Product_ID)", help="The Product Column indicates the product to use to use when calculating this measurement.", dataType=FlyDataType.String, entityType="D", printName="Product Column", fieldLength=60)
	ProductColumn,
	//
	@FlyElement(name="Product Description", description="Product Description", help="Description of the product", dataType=FlyDataType.String, entityType="D", printName="Prod Description", fieldLength=255)
	ProductDescription,
	//
	@FlyElement(name="Product Group Key", description="The key value for the product group", help="A product group is a way to organize products", dataType=FlyDataType.String, entityType="D", printName="Product Group Key", fieldLength=40)
	ProductGroup_Value,
	//
	@FlyElement(name="Production Info", dataType=FlyDataType.String, entityType="D", printName="Production Info", fieldLength=60)
	ProductionInfo,
	//
	@FlyElement(name="Production Quantity", description="Quantity of products to produce", help="The Production Quantity identifies the number of products to produce", dataType=FlyDataType.Quantity, entityType="D", printName="Production Qty", fieldLength=22)
	ProductionQty,
	//
	@FlyElement(name="Product Name", description="Name of the Product", dataType=FlyDataType.String, entityType="D", printName="Product Name", fieldLength=60)
	ProductName,
	//
	@FlyElement(name="Product Type", description="Type of product", help="The type of product also determines accounting consequences.", dataType=FlyDataType.List, entityType="D", printName="Product Type", fieldLength=1)
	ProductType,
	//
	@FlyElement(name="Product Key", description="Key of the Product", dataType=FlyDataType.String, entityType="D", printName="Product Key", fieldLength=40)
	ProductValue,
	//
	@FlyElement(name="Profile", description="Information to help profiling the system for solving support issues", help="Profile information do not contain sensitive information and are used to support issue detection and diagnostics", dataType=FlyDataType.String, entityType="D", printName="Profile", fieldLength=60)
	ProfileInfo,
	//
	@FlyElement(name="Project Balance", description="Total Project Balance", help="The project balance is the sum of all invoices and payments", dataType=FlyDataType.Amount, entityType="D", printName="Project Balance", fieldLength=22)
	ProjectBalanceAmt,
	//
	@FlyElement(name="Project Category", description="Project Category", help="The Project Category determines the behavior of the project:	General - no special accounting, e.g. for Presales or general tracking	Service - no special accounting, e.g. for Service/Charge projects	Work Order - creates Project/Job WIP transactions - ability to issue material	Asset - create Project Asset transactions - ability to issue material", dataType=FlyDataType.List, entityType="D", printName="Project Category", fieldLength=1)
	ProjectCategory,
	//
	@FlyElement(name="Line Level", description="Project Line Level", help="Level on which Project Lines are maintained", dataType=FlyDataType.List, entityType="D", printName="Line Level", fieldLength=1)
	ProjectLineLevel,
	//
	@FlyElement(name="Project Mail Text", description="Standard text for Project EMails", help="Standard text for Project EMails", dataType=FlyDataType.Table, entityType="D", printName="Project Mail Text", fieldLength=22)
	Project_MailText_ID,
	//
	@FlyElement(name="Project", description="Name of the Project", dataType=FlyDataType.String, entityType="D", printName="Project", fieldLength=60)
	ProjectName,
	//
	@FlyElement(name="Project Phase", description="Name of the Project Phase", dataType=FlyDataType.String, entityType="D", printName="Project Phase", fieldLength=60)
	ProjectPhaseName,
	//
	@FlyElement(name="Project Print Format", description="Standard Project Print Format", help="Standard Project Print Format", dataType=FlyDataType.Table, entityType="D", printName="Project Print Format", fieldLength=22)
	Project_PrintFormat_ID,
	//
	@FlyElement(name="Project Type", description="Name of the Project Type", dataType=FlyDataType.String, entityType="D", printName="Project Type", fieldLength=60)
	ProjectTypeName,
	//
	@FlyElement(name="Project Key", description="Key of the Project", dataType=FlyDataType.String, entityType="D", printName="Project Key", fieldLength=40)
	ProjectValue,
	//
	@FlyElement(name="Invoice Rule", description="Invoice Rule for the project", help="The Invoice Rule for the project determines how orders (and consequently invoices) are created.  The selection on project level can be overwritten on Phase or Task", dataType=FlyDataType.List, entityType="D", printName="Invoice Rule", fieldLength=1)
	ProjInvoiceRule,
	//
	@FlyElement(name="Promotion Code", description="User entered promotion code at sales time", help="If present, user entered the promotion code at sales time to get this promotion", dataType=FlyDataType.String, entityType="D", printName="Promotion Code", fieldLength=30)
	PromotionCode,
	//
	@FlyElement(name="Usage Counter", description="Usage counter", help="Counter to record how many times this promotion have been used", dataType=FlyDataType.Integer, entityType="D", printName="Usage Counter", fieldLength=22)
	PromotionCounter,
	//
	@FlyElement(name="Relative Priority", description="Which promotion should be apply to a product", help="The relative priority indicate the promotion to use when a product exists in more than one promotion. Promotion with the highest priority take precedence.", dataType=FlyDataType.Integer, entityType="D", printName="Relative Priority", fieldLength=22)
	PromotionPriority,
	//
	@FlyElement(name="Usage Limit", description="Maximum usage limit", help="Maximum number of time this promotion can be use", dataType=FlyDataType.Integer, entityType="D", printName="Usage Limit", fieldLength=22)
	PromotionUsageLimit,
	//
	@FlyElement(name="Protocol", description="Protocol", dataType=FlyDataType.String, entityType="D", printName="Protocol", fieldLength=20)
	Protocol,
	//
	@FlyElement(name="Proxy address", description=" Address of your proxy server", help="The Proxy Address must be defined if you must pass through a firewall to access your payment processor. ", dataType=FlyDataType.String, entityType="D", printName="Proxy address", fieldLength=60)
	ProxyAddress,
	//
	@FlyElement(name="Proxy logon", description="Logon of your proxy server", help="The Proxy Logon identifies the Logon ID for your proxy server.", dataType=FlyDataType.String, entityType="D", printName="Proxy logon", fieldLength=60)
	ProxyLogon,
	//
	@FlyElement(name="Proxy password", description="Password of your proxy server", help="The Proxy Password identifies the password for your proxy server.", dataType=FlyDataType.String, entityType="D", printName="Proxy password", fieldLength=60)
	ProxyPassword,
	//
	@FlyElement(name="Proxy port", description="Port of your proxy server", help="The Proxy Port identifies the port of your proxy server.", dataType=FlyDataType.Integer, entityType="D", printName="Proxy port", fieldLength=22)
	ProxyPort,
	//
	@FlyElement(name="Scrap", description="The Scrap account is the account used  in Manufacturing Order ", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Scrap", fieldLength=22)
	P_Scrap_Acct,
	//
	@FlyElement(name="Process String", description="Process Parameter", dataType=FlyDataType.String, entityType="D", printName="P String", fieldLength=255)
	P_String,
	//
	@FlyElement(name="Process String To", description="Process Parameter", dataType=FlyDataType.String, entityType="D", printName="P String To", fieldLength=255)
	P_String_To,
	//
	@FlyElement(name="Trade Discount Granted", description="Trade Discount Granted Account", help="The Trade Discount Granted Account indicates the account for granted trade discount in sales invoices", dataType=FlyDataType.Account, entityType="D", printName="Trade Discount Grant", fieldLength=22)
	P_TradeDiscountGrant_Acct,
	//
	@FlyElement(name="Trade Discount Received", description="Trade Discount Receivable Account", help="The Trade Discount Receivables Account indicates the account for received trade discounts in vendor invoices", dataType=FlyDataType.Account, entityType="D", printName="Trade Discount Received", fieldLength=22)
	P_TradeDiscountRec_Acct,
	//
	@FlyElement(name="Publication Date", description="Date on which this article will / should get published", help="Date on which this article will / should get published", dataType=FlyDataType.DateTime, entityType="D", printName="Publication Date", fieldLength=7)
	PubDate,
	//
	@FlyElement(name="Publish RfQ", dataType=FlyDataType.Button, entityType="D", printName="Publish RfQ", fieldLength=1)
	PublishRfQ,
	//
	@FlyElement(name="Publication Status", description="Status of Publication", help="Used for internal documentation", dataType=FlyDataType.List, entityType="D", printName="Publication Status", fieldLength=1)
	PublishStatus,
	//
	@FlyElement(name="Usage Variance", description="The Usage Variance account is the account used Manufacturing Order", help="The Usage Variance is used in Standard Costing. It reflects the difference between the  Quantities of Standard BOM  or Time Standard Manufacturing Workflow and Quantities of Manufacturing BOM or Time Manufacturing Workflow of Manufacturing Order.		If you change the Quantities or Time  defined in BOM or Workflow Manufacturig then this variance is generate.", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Usage Variance", fieldLength=22)
	P_UsageVariance_Acct,
	//
	@FlyElement(name="Work In Process", description="The Work in Process account is the account used Manufacturing Order", dataType=FlyDataType.Account, entityType="EE01", printName="Account for Work in Progress", fieldLength=22)
	P_WIP_Acct,
	//
	@FlyElement(name="Quality Specification", dataType=FlyDataType.ID, entityType="EE01", printName="Quality Specification", fieldLength=22)
	QM_Specification_ID,
	//
	@FlyElement(name="QM Specification Line", dataType=FlyDataType.ID, entityType="D", printName="QM Specification Line", fieldLength=22)
	QM_SpecificationLine_ID,
	//
	@FlyElement(name="Quantity", description="Quantity", help="The Quantity indicates the number of a specific product or item for this document.", dataType=FlyDataType.Amount, entityType="D", printName="Qty", fieldLength=22)
	Qty,
	//
	@FlyElement(name="Abnormal Quantity", description="Abnormal Demand Quantity", dataType=FlyDataType.NONE, entityType="EE01", printName="Abnormal Quantity", fieldLength=0)
	QtyAbnormal,
	//
	@FlyElement(name="Available Quantity", description="Available Quantity (On Hand - Reserved)", help="Quantity available to promise = On Hand minus Reserved Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Available", fieldLength=22)
	QtyAvailable,
	//
	@FlyElement(name="Backordered", description="Backordered Quantity", help="Calculated: ordered - delivered quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Backordered", fieldLength=22)
	QtyBackOrdered,
	//
	@FlyElement(name="Quantity in %", description="Indicate the Quantity % use in this Formula", help="Exist two way the add a compenent to a BOM or Formula:		1.- Adding a Component based in quantity to use in this BOM	2.- Adding a Component based in % to use the Order Quantity of Manufacturing Order in this Formula.	", dataType=FlyDataType.Number, entityType="EE01", printName="Quantity in %", fieldLength=22)
	QtyBatch,
	//
	@FlyElement(name="Qty Batchs", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Batchs", fieldLength=22)
	QtyBatchs,
	//
	@FlyElement(name="Qty Batch Size", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Batch Size", fieldLength=10)
	QtyBatchSize,
	//
	@FlyElement(name="Quantity", description="Indicate the Quantity  use in this BOM", help="Exist two way the add a compenent to a BOM or Formula:		1.- Adding a Component based in quantity to use in this BOM	2.- Adding a Component based in % to use the Order Quantity of Manufacturing Order in this Formula.	", dataType=FlyDataType.Number, entityType="EE01", printName="Quantity", fieldLength=22)
	QtyBOM,
	//
	@FlyElement(name="Quantity book", description="Book Quantity", help="The Quantity Book indicates the line count stored in the system for a product in inventory", dataType=FlyDataType.Quantity, entityType="D", printName="Qty book", fieldLength=22)
	QtyBook,
	//
	@FlyElement(name="Calculated Quantity", description="Calculated Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Calculated Qty", fieldLength=22)
	QtyCalculated,
	//
	@FlyElement(name="Qty Completed", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Completed", fieldLength=0)
	QtyCompleted,
	//
	@FlyElement(name="Quantity count", description="Counted Quantity", help="The Quantity Count indicates the actual inventory count taken for a product in inventory", dataType=FlyDataType.Quantity, entityType="D", printName="Qty count", fieldLength=22)
	QtyCount,
	//
	@FlyElement(name="QtyCsv", dataType=FlyDataType.Quantity, entityType="D", printName="QtyCsv", fieldLength=131089)
	QtyCsv,
	//
	@FlyElement(name="Delivered Quantity", description="Delivered Quantity", help="The Delivered Quantity indicates the quantity of a product that has been delivered.", dataType=FlyDataType.Quantity, entityType="D", printName="Delivered Qty", fieldLength=22)
	QtyDelivered,
	//
	@FlyElement(name="Qty Delivered Line", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Delivered Line", fieldLength=22)
	QtyDeliveredLine,
	//
	@FlyElement(name="Quantity", description="The Quantity Entered is based on the selected UoM", help="The Quantity Entered is converted to base product UoM quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Quantity", fieldLength=22)
	QtyEntered,
	//
	@FlyElement(name="Gross Requirements Quantity", dataType=FlyDataType.NONE, entityType="EE01", printName="Gross Req. Qty", fieldLength=0)
	QtyGrossReq,
	//
	@FlyElement(name="Internal Use Qty", description="Internal Use Quantity removed from Inventory", help="Quantity of product inventory used internally (positive if taken out - negative if returned)", dataType=FlyDataType.Quantity, entityType="D", printName="Internal Use", fieldLength=22)
	QtyInternalUse,
	//
	@FlyElement(name="Qty In Transit", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty In Transit", fieldLength=22)
	QtyInTransit,
	//
	@FlyElement(name="Quantity Invoiced", description="Invoiced Quantity", help="The Invoiced Quantity indicates the quantity of a product that have been invoiced.", dataType=FlyDataType.Quantity, entityType="D", printName="Invoiced", fieldLength=22)
	QtyInvoiced,
	//
	@FlyElement(name="Qty Issue Scrap Should Be", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Issue Scrap Should Be", fieldLength=22)
	QtyIssueScrapShouldBe,
	//
	@FlyElement(name="Qty Issue Should Be", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Issue Should Be", fieldLength=22)
	QtyIssueShouldBe,
	//
	@FlyElement(name="Lost Sales Qty", description="Quantity of potential sales", help="When an order is closed and there is a difference between the ordered quantity and the delivered (invoiced) quantity is the Lost Sales Quantity.  Note that the Lost Sales Quantity is 0 if you void an order, so close the order if you want to track lost opportunities.  [Void = data entry error - Close = the order is finished]", dataType=FlyDataType.Quantity, entityType="D", printName="Lost Sales Qty", fieldLength=22)
	QtyLostSales,
	//
	@FlyElement(name="Qty Movement Drafted", description="The sum of inOutLines line quantities which are in the Drafted status", help="The sum of inOutLines line quantities which are in the Drafted status", dataType=FlyDataType.NONE, entityType="D", printName="Qty Movement Drafted", fieldLength=0)
	QtyMovementDrafted,
	//
	@FlyElement(name="Multiplier Quantity", description="Value to multiply quantities by for generating commissions.", help="The Multiplier Quantity field indicates the amount to multiply the quantities accumulated for this commission run.", dataType=FlyDataType.Number, entityType="D", printName="Multiplier Qty", fieldLength=22)
	QtyMultiplier,
	//
	@FlyElement(name="On Hand Quantity", description="On Hand Quantity", help="The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse.", dataType=FlyDataType.Quantity, entityType="D", printName="On Hand Qty", fieldLength=22)
	QtyOnHand,
	//
	@FlyElement(name="On Hand Projected Quantity", description="On Hand Projected Quantity", help="The On Hand Projected Quantity indicates the quantity of a product that is on hand in time line.", dataType=FlyDataType.NONE, entityType="EE01", printName="On Hand Projected Qty", fieldLength=0)
	QtyOnHandProjected,
	//
	@FlyElement(name="On Hand Quantity Total", description="On Hand Quantity Total", help="The On Hand Quantity Total indicates the quantity of a product that is on hand in a warehouse.", dataType=FlyDataType.NONE, entityType="D", printName="On Hand Qty Total", fieldLength=0)
	QtyOnHandTotal,
	//
	@FlyElement(name="QtyOpenToInvoice", dataType=FlyDataType.NONE, entityType="D", printName="QtyOpenToInvoice", fieldLength=0)
	QtyOpenToInvoice,
	//
	@FlyElement(name="Ordered Quantity", description="Ordered Quantity", help="The Ordered Quantity indicates the quantity of a product that was ordered.", dataType=FlyDataType.Quantity, entityType="D", printName="Ordered Qty", fieldLength=22)
	QtyOrdered,
	//
	@FlyElement(name="Ordered Quantity Total", description="Ordered Quantity Total", help="The Ordered Quantity Total indicates the quantity of a product that was ordered.", dataType=FlyDataType.NONE, entityType="D", printName="Ordered Qty Total", fieldLength=0)
	QtyOrderedTotal,
	//
	@FlyElement(name="Quantity Plan", description="Planned Quantity", help="Planned Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Quantity Plan", fieldLength=22)
	QtyPlan,
	//
	@FlyElement(name="Qty Post", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Post", fieldLength=22)
	QtyPost,
	//
	@FlyElement(name="Quantity Price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Qty Price", fieldLength=22)
	QtyPrice,
	//
	@FlyElement(name="Inventory Quantity", dataType=FlyDataType.NONE, entityType="D", printName="Inventory Quantity", fieldLength=0)
	QtyRange,
	//
	@FlyElement(name="Quantity Ranking", dataType=FlyDataType.Integer, entityType="D", printName="Qty Ranking", fieldLength=22)
	QtyRanking,
	//
	@FlyElement(name="Quantity Reimbursed", description="The reimbursed quantity", help="The reimbursed quantity is derived from the entered quantity and can be overwritten when approving the expense report.", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Reimbursed", fieldLength=22)
	QtyReimbursed,
	//
	@FlyElement(name="Qty Reject", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Reject", fieldLength=22)
	QtyReject,
	//
	@FlyElement(name="Qty Required", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Required", fieldLength=22)
	QtyRequired,
	//
	@FlyElement(name="Reserved Quantity", description="Reserved Quantity", help="The Reserved Quantity indicates the quantity of a product that is currently reserved.", dataType=FlyDataType.Quantity, entityType="D", printName="Reserved Qty", fieldLength=22)
	QtyReserved,
	//
	@FlyElement(name="Reserved Quantity Total", description="Reserved Quantity Total", help="The Reserved Quantity Total indicates the quantity of a product that is currently reserved.", dataType=FlyDataType.NONE, entityType="D", printName="Reserved Qty Total", fieldLength=0)
	QtyReservedTotal,
	//
	@FlyElement(name="Reward Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Reward Quantity", fieldLength=0)
	QtyReward,
	//
	@FlyElement(name="Scheduled Receipts Quantity", dataType=FlyDataType.NONE, entityType="EE01", printName="Scheduled Receipts Qty", fieldLength=0)
	QtyScheduledReceipts,
	//
	@FlyElement(name="Scrap %", description="Scrap % Quantity for this componet", help="Scrap % Quantity for this componet", dataType=FlyDataType.Quantity, entityType="EE01", printName="Scrap %", fieldLength=22)
	QtyScrap,
	//
	@FlyElement(name="Qty Scrap Line", dataType=FlyDataType.Quantity, entityType="EE01", printName="Qty Scrap Line", fieldLength=22)
	QtyScrapLine,
	//
	@FlyElement(name="Quantity Used", description="Quantity used for this event", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Used", fieldLength=22)
	QtySpent,
	//
	@FlyElement(name="Subtract Quantity", description="Quantity to subtract when generating commissions", help="The Quantity Subtract identifies the quantity to be subtracted before multiplication", dataType=FlyDataType.Number, entityType="D", printName="Subtract Qty", fieldLength=22)
	QtySubtract,
	//
	@FlyElement(name="Qty to deliver", dataType=FlyDataType.Quantity, entityType="D", printName="Qty to deliver", fieldLength=22)
	QtyToDeliver,
	//
	@FlyElement(name="Qty to invoice", dataType=FlyDataType.Quantity, entityType="D", printName="Qty to invoice", fieldLength=22)
	QtyToInvoice,
	//
	@FlyElement(name="Quantity to Order", dataType=FlyDataType.Quantity, entityType="D", printName="Qty to Order", fieldLength=22)
	QtyToOrder,
	//
	@FlyElement(name="Quantity Used", dataType=FlyDataType.Amount, entityType="D", printName="Quantity Used in production", fieldLength=10)
	QtyUsed,
	//
	@FlyElement(name="Quality Rating", description="Method for rating vendors", help="The Quality Rating indicates how a vendor is rated (higher number = higher quality)", dataType=FlyDataType.Integer, entityType="D", printName="Quality Rating", fieldLength=22)
	QualityRating,
	//
	@FlyElement(name="Query", description="SQL", dataType=FlyDataType.Text, entityType="D", printName="Query", fieldLength=2000)
	Query,
	//
	@FlyElement(name="Query Source", description="Source of the Query", dataType=FlyDataType.List, entityType="D", printName="Source", fieldLength=1)
	QuerySource,
	//
	@FlyElement(name="Queuing Time", description="Queue time is the time a job waits at a work center before begin handled.", help="Queuing time has no implication on costs, but on Capacity Requirement Planning (CRP) to calculate the total time needed to manufacture a product.", dataType=FlyDataType.Quantity, entityType="EE01", printName="Queuing Time", fieldLength=10)
	QueuingTime,
	//
	@FlyElement(name="RfQ Type", description="Request for Quotation Type", dataType=FlyDataType.List, entityType="D", printName="RfQ Type", fieldLength=1)
	QuoteType,
	//
	@FlyElement(name="Race Name", description="Race Name", dataType=FlyDataType.String, entityType="EE02", printName="Race Name", fieldLength=60)
	RaceName,
	//
	@FlyElement(name="Race Value", description="Race Value", dataType=FlyDataType.String, entityType="EE02", printName="Race Value", fieldLength=40)
	RaceValue,
	//
	@FlyElement(name="Range Label", description="Label for the range axis.", dataType=FlyDataType.String, entityType="D", printName="Range Label", fieldLength=60)
	RangeLabel,
	//
	@FlyElement(name="Ranking", description="Relative Rank Number", help="One is the highest Rank", dataType=FlyDataType.Integer, entityType="D", printName="Ranking", fieldLength=22)
	Ranking,
	//
	@FlyElement(name="Rank RfQ", dataType=FlyDataType.Button, entityType="D", printName="Rank RfQ", fieldLength=1)
	RankRfQ,
	//
	@FlyElement(name="Rate", description="Rate or Tax or Exchange", help="The Rate indicates the percentage to be multiplied by the source to arrive at the tax or exchange amount.", dataType=FlyDataType.Number, entityType="D", printName="Rate", fieldLength=22)
	Rate,
	//
	@FlyElement(name="Rate Variance", dataType=FlyDataType.CostsPrices, entityType="EE01", printName="Rate Variance", fieldLength=0)
	RateVariance,
	//
	@FlyElement(name="Rating", description="Classification or Importance", help="The Rating is used to differentiate the importance", dataType=FlyDataType.String, entityType="D", printName="Rating", fieldLength=1)
	Rating,
	//
	@FlyElement(name="Ratio", description="Relative Ratio for Distributions", help="The relative weight of an distribution. If the total of all ratios is 100, it is the same as percent.", dataType=FlyDataType.Number, entityType="D", printName="Ratio", fieldLength=22)
	Ratio,
	//
	@FlyElement(name="Element Type", description="Ratio Element Type", help="Type of data used for the calculation", dataType=FlyDataType.List, entityType="D", printName="Element Type", fieldLength=1)
	RatioElementType,
	//
	@FlyElement(name="Operand", description="Ratio Operand", help="Operand how data is calculated.  If it is the first in the series, 'minus' will create a negative value, otherwise ignored.", dataType=FlyDataType.List, entityType="D", printName="Operand", fieldLength=1)
	RatioOperand,
	//
	@FlyElement(name="Total Ratio", description="Total of relative weight in a distribution", help="The total relative weight of an distribution. If the total of all ratios is 100, it is the same as percent.", dataType=FlyDataType.Number, entityType="D", printName="Total Ratio", fieldLength=22)
	RatioTotal,
	//
	@FlyElement(name="Authorization Code", description="Authorization Code returned", help="The Authorization Code indicates the code returned from the electronic transmission.", dataType=FlyDataType.String, entityType="D", printName="Authorization Code", fieldLength=20)
	R_AuthCode,
	//
	@FlyElement(name="Authorization Code (DC)", description="Authorization Code Delayed Capture returned", help="The Authorization Code indicates the code returned from the electronic transmission.", dataType=FlyDataType.String, entityType="D", printName="Authorization Code (DC)", fieldLength=20)
	R_AuthCode_DC,
	//
	@FlyElement(name="Address verified", description="This address has been verified", help="The Address Verified indicates if the address has been verified by the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="Address verified", fieldLength=1)
	R_AvsAddr,
	//
	@FlyElement(name="Zip verified", description="The Zip Code has been verified", help="The Zip Verified indicates if the zip code has been verified by the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="Zip verified", fieldLength=1)
	R_AvsZip,
	//
	@FlyElement(name="Category", description="Request Category", help="Category or Topic of the Request ", dataType=FlyDataType.TableDirect, entityType="D", printName="Category", fieldLength=10)
	R_Category_ID,
	//
	@FlyElement(name="CVV Match", description="Credit Card Verification Code Match", help="The Credit Card Verification Code was matched", dataType=FlyDataType.YesNo, entityType="D", printName="CVV Match", fieldLength=1)
	R_CVV2Match,
	//
	@FlyElement(name="Read Only Logic", description="Logic to determine if field is read only (applies only when field is read-write)", help="format := {expression} [{logic} {expression}]<br> 	expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> 	logic := {|}|{&}<br>	context := any global or window context <br>	value := strings or numbers<br>	logic operators	:= AND or OR with the previous result from left to right <br>	operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>	Examples: <br>	@AD_Table_ID@=14 | @Language@!GERGER <br>	@PriceLimit@>10 | @PriceList@>@PriceActual@<br>	@Name@>J<br>	Strings may be in single quotes (optional)", dataType=FlyDataType.Text, entityType="D", printName="Read Only Logic", fieldLength=2000)
	ReadOnlyLogic,
	//
	@FlyElement(name="Realized Gain Acct", description="Realized Gain Account", help="The Realized Gain Account indicates the account to be used when recording gains achieved from currency revaluation that have been realized.", dataType=FlyDataType.Account, entityType="D", printName="Realized Gain Acct", fieldLength=22)
	RealizedGain_Acct,
	//
	@FlyElement(name="Realized Loss Acct", description="Realized Loss Account", help="The Realized Loss Account indicates the account to be used when recording losses incurred from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="Realized Loss Acct", fieldLength=22)
	RealizedLoss_Acct,
	//
	@FlyElement(name="Receipt Footer Msg", description="This message will be displayed at the bottom of a receipt when doing a sales or purchase", dataType=FlyDataType.LongText, entityType="D", printName="Receipt Footer Msg", fieldLength=0)
	ReceiptFooterMsg,
	//
	@FlyElement(name="Info Received", description="Information of the receipt of the package (acknowledgement)", dataType=FlyDataType.String, entityType="D", printName="Info Received", fieldLength=255)
	ReceivedInfo,
	//
	@FlyElement(name="Received Inquiry Reply", dataType=FlyDataType.YesNo, entityType="D", printName="Inquiry reply", fieldLength=1)
	ReceiveInquiryReply,
	//
	@FlyElement(name="Receive Order Reply", dataType=FlyDataType.YesNo, entityType="D", printName="Order reply", fieldLength=1)
	ReceiveOrderReply,
	//
	@FlyElement(name="RecentItems Max Saved", dataType=FlyDataType.Integer, entityType="ECA02", printName="RecentItems Max Saved", fieldLength=10)
	RecentItemsMaxSaved,
	//
	@FlyElement(name="RecentItems Max Shown", dataType=FlyDataType.Integer, entityType="ECA02", printName="RecentItems Max Shown", fieldLength=10)
	RecentItemsMaxShown,
	//
	@FlyElement(name="Recognition frequency", dataType=FlyDataType.List, entityType="D", printName="Recognition frequency", fieldLength=1)
	RecognitionFrequency,
	//
	@FlyElement(name="Recognized Amount", dataType=FlyDataType.Amount, entityType="D", printName="Recognized Amt", fieldLength=22)
	RecognizedAmt,
	//
	@FlyElement(name="Record ID", description="Direct internal record ID", help="The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known.", dataType=FlyDataType.Button, entityType="D", printName="Record ID", fieldLength=22)
	Record_ID,
	//
	@FlyElement(name="RecordType", dataType=FlyDataType.String, entityType="D", printName="RecordType", fieldLength=0)
	RecordType,
	//
	@FlyElement(name="Recruited Employee", description="Recruited Employee for this Job Application", help="The Recruited Employee for this Job Application", dataType=FlyDataType.Table, entityType="EE02", printName="Recruited Employee", fieldLength=0)
	RecruitedEmployee_ID,
	//
	@FlyElement(name="Recurring Type", description="Type of Recurring Document", help="The type of document to be generated", dataType=FlyDataType.List, entityType="D", printName="Recurring Type", fieldLength=1)
	RecurringType,
	//
	@FlyElement(name="Red", description="RGB value", dataType=FlyDataType.Integer, entityType="D", printName="Red", fieldLength=22)
	Red,
	//
	@FlyElement(name="2nd Red", description="RGB value for second color", dataType=FlyDataType.Integer, entityType="D", printName="2nd Red", fieldLength=22)
	Red_1,
	//
	@FlyElement(name="Redo", dataType=FlyDataType.Button, entityType="D", printName="Redo", fieldLength=1)
	Redo,
	//
	@FlyElement(name="Employee Reference", description="Employee Reference", help="The Employee Reference", dataType=FlyDataType.Table, entityType="EE02", printName="Employee Reference", fieldLength=0)
	Ref_BPartner_ID,
	//
	@FlyElement(name="Past Period Definition", description="Period Definition, allows to define time cycles for the Operational Calendar", dataType=FlyDataType.NONE, entityType="EE01", printName="Past Period Definition", fieldLength=0)
	Ref_DefinitionPeriod_ID,
	//
	@FlyElement(name="Reference", description="Reference for this record", help="The Reference displays the source document number.", dataType=FlyDataType.String, entityType="D", printName="Reference", fieldLength=60)
	Reference,
	//
	@FlyElement(name="Reference No", description="Your customer or vendor number at the Business Partner's site", help="The reference number can be printed on orders and invoices to allow your business partner to faster identify your records.", dataType=FlyDataType.String, entityType="D", printName="Reference No", fieldLength=40)
	ReferenceNo,
	//
	@FlyElement(name="Referrer", description="Referring web address", dataType=FlyDataType.String, entityType="D", printName="Referrer", fieldLength=120)
	Referrer,
	//
	@FlyElement(name="Referenced Shipment", dataType=FlyDataType.ID, entityType="D", printName="Ref Ship", fieldLength=22)
	Ref_InOut_ID,
	//
	@FlyElement(name="Referenced Shipment Line", dataType=FlyDataType.ID, entityType="D", printName="Ref Ship Line", fieldLength=22)
	Ref_InOutLine_ID,
	//
	@FlyElement(name="Referenced Invoice", dataType=FlyDataType.ID, entityType="D", printName="Ref Invoice", fieldLength=22)
	Ref_Invoice_ID,
	//
	@FlyElement(name="Referenced Invoice Line", dataType=FlyDataType.ID, entityType="D", printName="Ref Invoice Line", fieldLength=22)
	Ref_InvoiceLine_ID,
	//
	@FlyElement(name="Referenced Order", description="Reference to corresponding Sales/Purchase Order", help="Reference of the Sales Order Line to the corresponding Purchase Order Line or vice versa.", dataType=FlyDataType.Search, entityType="D", printName="Ref Order", fieldLength=22)
	Ref_Order_ID,
	//
	@FlyElement(name="Referenced Order Line", description="Reference to corresponding Sales/Purchase Order", help="Reference of the Sales Order Line to the corresponding Purchase Order Line or vice versa.", dataType=FlyDataType.Search, entityType="D", printName="Ref Order Line", fieldLength=22)
	Ref_OrderLine_ID,
	//
	@FlyElement(name="Referenced Payment", dataType=FlyDataType.Table, entityType="D", printName="Ref Payment", fieldLength=10)
	Ref_Payment_ID,
	//
	@FlyElement(name="Referenced RMA", dataType=FlyDataType.Search, entityType="D", printName="Ref RMA", fieldLength=22)
	Ref_RMA_ID,
	//
	@FlyElement(name="Referenced RMA Line", dataType=FlyDataType.Table, entityType="D", printName="Ref RMA Line", fieldLength=22)
	Ref_RMALine_ID,
	//
	@FlyElement(name="Region", description="Name of the Region", help="The Region Name defines the name that will print when this region is used in a document.", dataType=FlyDataType.String, entityType="D", printName="Region", fieldLength=60)
	RegionName,
	//
	@FlyElement(name="Related Product", description="Related Product", dataType=FlyDataType.Search, entityType="D", printName="Related Product", fieldLength=22)
	RelatedProduct_ID,
	//
	@FlyElement(name="Related Product Type", dataType=FlyDataType.List, entityType="D", printName="Related Product Type", fieldLength=1)
	RelatedProductType,
	//
	@FlyElement(name="Relative Period", description="Period offset (0 is current)", dataType=FlyDataType.Number, entityType="D", printName="Relative Period", fieldLength=22)
	RelativePeriod,
	//
	@FlyElement(name="Relative Period To", description="Period offset (0 is current)", dataType=FlyDataType.NONE, entityType="D", printName="Relative Period To", fieldLength=0)
	RelativePeriodTo,
	//
	@FlyElement(name="Relative URL", description="Contains the relative URL for the container", help="The relative URL is used together with the webproject domain to display the content", dataType=FlyDataType.String, entityType="D", printName="Relative URL", fieldLength=120)
	RelativeURL,
	//
	@FlyElement(name="Relative Weight", description="Relative weight of this step (0 = ignored)", help="The relative weight allows you to adjust the project cycle report based on probabilities.  For example, if you have a 1:10 chance in closing a contract when it is in the prospect stage and a 1:2 chance when it is in the contract stage, you may put a weight of 0.1 and 0.5 on those steps. This allows sales funnels or measures of completion of your project.", dataType=FlyDataType.Number, entityType="D", printName="Relative Weight", fieldLength=22)
	RelativeWeight,
	//
	@FlyElement(name="Release No", description="Internal Release Number", dataType=FlyDataType.String, entityType="D", printName="Release No", fieldLength=10)
	ReleaseNo,
	//
	@FlyElement(name="Release Tag", description="Release Tag", dataType=FlyDataType.String, entityType="D", printName="Release Tag", fieldLength=60)
	ReleaseTag,
	//
	@FlyElement(name="Remaining Amt", description="Remaining Amount", dataType=FlyDataType.Amount, entityType="D", printName="Remaining Amt", fieldLength=22)
	RemainingAmt,
	//
	@FlyElement(name="Remarks", description="Remarks", dataType=FlyDataType.String, entityType="EE02", printName="Remarks", fieldLength=0)
	Remarks,
	//
	@FlyElement(name="Reminder Days", description="Days between sending Reminder Emails for a due or inactive Document", help="When a document is due for too long without activity, a reminder is sent. 0 means no reminders.	The Remind Days are the days when the next email reminder is sent.", dataType=FlyDataType.Integer, entityType="D", printName="Reminder Days", fieldLength=22)
	RemindDays,
	//
	@FlyElement(name="Remittance Mail Text", description="Email text used for sending payment remittances", help="Standard email template used to send remittances as attachments.", dataType=FlyDataType.Table, entityType="D", printName="Remittance Mail Text", fieldLength=22)
	Remittance_MailText_ID,
	//
	@FlyElement(name="Remittance Print Format", description="Print Format for separate Remittances", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="Remittance Print Format", fieldLength=22)
	Remittance_PrintFormat_ID,
	//
	@FlyElement(name="Remote Addr", description="Remote Address", help="The Remote Address indicates an alternative or external address.", dataType=FlyDataType.String, entityType="D", printName="Remote Addr", fieldLength=60)
	Remote_Addr,
	//
	@FlyElement(name="Remote Client", description="Remote Client to be used to replicate / synchronize data with.", help="The remote client used for data replication.", dataType=FlyDataType.Table, entityType="D", printName="Remote Client", fieldLength=22)
	Remote_Client_ID,
	//
	@FlyElement(name="Remote Host", description="Remote host Info", dataType=FlyDataType.String, entityType="D", printName="Remote Host", fieldLength=120)
	Remote_Host,
	//
	@FlyElement(name="Remote Organization", description="Remote Organization to be used to replicate / synchronize data with.", help="The remote organization used for data replication. If not selected, all organizations are replicated/synchronized.", dataType=FlyDataType.Table, entityType="D", printName="Remote Org", fieldLength=22)
	Remote_Org_ID,
	//
	@FlyElement(name="Remuneration Type", description="Type of Remuneration", dataType=FlyDataType.List, entityType="D", printName="Remuneration Type", fieldLength=1)
	RemunerationType,
	//
	@FlyElement(name="Renewal Date", dataType=FlyDataType.Date, entityType="D", printName="Renewal Date", fieldLength=7)
	RenewalDate,
	//
	@FlyElement(name="Repeat Distance", description="Distance in points to repeat gradient color - or zero", help="The gradient color is not repeated, if the value is zero. The distance is added to (or subtracted from) the starting point of the gradient.", dataType=FlyDataType.Integer, entityType="D", printName="Repeat Distance", fieldLength=22)
	RepeatDistance,
	//
	@FlyElement(name="Repeated type", description="Repeated type", help="The Repeated type", dataType=FlyDataType.List, entityType="EE02", printName="Repeated type", fieldLength=0)
	RepeatedType,
	//
	@FlyElement(name="Replenishment Class", description="Custom class to calculate Quantity to Order", help="If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level.", dataType=FlyDataType.String, entityType="D", printName="Replenishment Class", fieldLength=60)
	ReplenishmentClass,
	//
	@FlyElement(name="Create", description="Create from Replenishment", dataType=FlyDataType.List, entityType="D", printName="Create", fieldLength=1)
	ReplenishmentCreate,
	//
	@FlyElement(name="Replenish Plan Initial Setup", dataType=FlyDataType.Button, entityType="D", printName="Replenish Plan Initial Setup", fieldLength=1)
	ReplenishPlanInitialSetup,
	//
	@FlyElement(name="Replenish Type", description="Method for re-ordering a product", help="The Replenish Type indicates if this product will be manually re-ordered, ordered when the quantity is below the minimum quantity or ordered when it is below the maximum quantity. If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level.", dataType=FlyDataType.List, entityType="D", printName="Replenish Type", fieldLength=1)
	ReplenishType,
	//
	@FlyElement(name="Replication Type", description="Type of Data Replication", help="The Type of data Replication determines the direction of the data replication.  <br>	Reference means that the data in this system is read only -> <br>	Local means that the data in this system is not replicated to other systems - <br>	Merge means that the data in this system is synchronized with the other system <-> <br>", dataType=FlyDataType.List, entityType="D", printName="Replication Type", fieldLength=1)
	ReplicationType,
	//
	@FlyElement(name="Reply", description="Reply or Answer", dataType=FlyDataType.Text, entityType="D", printName="Reply", fieldLength=2000)
	Reply,
	//
	@FlyElement(name="Reply Price", description="Confirmed Price from EDI Partner", dataType=FlyDataType.CostsPrices, entityType="D", printName="Reply Price", fieldLength=22)
	Reply_Price,
	//
	@FlyElement(name="Reply Qty Available", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Available", fieldLength=22)
	Reply_QtyAvailable,
	//
	@FlyElement(name="Reply Qty Confirmed", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Confirmed", fieldLength=22)
	Reply_QtyConfirmed,
	//
	@FlyElement(name="Reply Received", dataType=FlyDataType.DateTime, entityType="D", printName="Reply", fieldLength=7)
	Reply_Received,
	//
	@FlyElement(name="Reply Remarks", dataType=FlyDataType.Text, entityType="D", printName="Remarks", fieldLength=2000)
	Reply_Remarks,
	//
	@FlyElement(name="Reply Ship date", dataType=FlyDataType.Date, entityType="D", printName="Ship date", fieldLength=7)
	Reply_ShipDate,
	//
	@FlyElement(name="reportline", dataType=FlyDataType.NONE, entityType="D", printName="reportline", fieldLength=0)
	reportline,
	//
	@FlyElement(name="Report Line Set Name", description="Name of the Report Line Set", dataType=FlyDataType.String, entityType="D", printName="Report Line Set Name", fieldLength=60)
	ReportLineSetName,
	//
	@FlyElement(name="reportlinestyle", dataType=FlyDataType.NONE, entityType="D", printName="reportlinestyle", fieldLength=0)
	reportlinestyle,
	//
	@FlyElement(name="Report Type", dataType=FlyDataType.NONE, entityType="D", printName="Report Type", fieldLength=0)
	ReportType,
	//
	@FlyElement(name="Request Amount", description="Amount associated with this request", help="The Request Amount indicates any amount that is associated with this request.  For example, a warranty amount or refund amount.", dataType=FlyDataType.Amount, entityType="D", printName="Request Amt", fieldLength=22)
	RequestAmt,
	//
	@FlyElement(name="Request Document No", description="Adempiere Request Document No", dataType=FlyDataType.String, entityType="D", printName="Request Document No", fieldLength=30)
	RequestDocumentNo,
	//
	@FlyElement(name="Request EMail", description="EMail address to send automated mails from or receive mails for automated processing (fully qualified)", help="EMails for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. The address must be filly qualified (e.g. joe.smith@company.com) and should be a valid address.", dataType=FlyDataType.String, entityType="D", printName="Request EMail", fieldLength=60)
	RequestEMail,
	//
	@FlyElement(name="Request Folder", description="EMail folder to process incoming emails; if empty INBOX is used", help="Email folder used to read emails to process as requests, If left empty the default mailbox (INBOX) will be used. Requires IMAP services.", dataType=FlyDataType.String, entityType="D", printName="Request Folder", fieldLength=20)
	RequestFolder,
	//
	@FlyElement(name="Request Price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Request Price", fieldLength=22)
	Request_Price,
	//
	@FlyElement(name="Request Qty", dataType=FlyDataType.Quantity, entityType="D", printName="Request Qty", fieldLength=22)
	Request_Qty,
	//
	@FlyElement(name="Request Ship date", dataType=FlyDataType.Date, entityType="D", printName="Request Ship date", fieldLength=7)
	Request_Shipdate,
	//
	@FlyElement(name="Request Type", dataType=FlyDataType.String, entityType="D", printName="Request Type", fieldLength=4)
	RequestType,
	//
	@FlyElement(name="Request User", description="User Name (ID) of the email owner", help="EMail user name for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. Required, if your mail server requires authentification as well as for processing incoming mails.", dataType=FlyDataType.String, entityType="D", printName="Request User", fieldLength=60)
	RequestUser,
	//
	@FlyElement(name="Request User Password", description="Password of the user name (ID) for mail processing", dataType=FlyDataType.String, entityType="D", printName="Request User PW", fieldLength=20)
	RequestUserPW,
	//
	@FlyElement(name="Requires Tax Certificate", description="This tax rate requires the Business Partner to be tax exempt", help="The Requires Tax Certificate indicates that a tax certificate is required for a Business Partner to be tax exempt.", dataType=FlyDataType.YesNo, entityType="D", printName="Requires Tax Certificate", fieldLength=1)
	RequiresTaxCertificate,
	//
	@FlyElement(name="Require CreditCard Verification Code", description="Require 3/4 digit Credit Verification Code", help="The Require CC Verification checkbox indicates if this bank accounts requires a verification number for credit card transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="Require Verification Code", fieldLength=1)
	RequireVV,
	//
	@FlyElement(name="Resource Description", description="Resource Allocation Description", dataType=FlyDataType.String, entityType="D", printName="Resource Description", fieldLength=255)
	ResourceDescription,
	//
	@FlyElement(name="Resource Key", description="Key of the Resource", dataType=FlyDataType.String, entityType="EE01", printName="Resource Key", fieldLength=40)
	ResourceValue,
	//
	@FlyElement(name="Response Text", description="Request Response Text", help="Text block to be copied into request response text", dataType=FlyDataType.Text, entityType="D", printName="Response Text", fieldLength=2000)
	ResponseText,
	//
	@FlyElement(name="Responsibilities", description="Role and responsibilities of the position.", help="The responsibilities for this position", dataType=FlyDataType.Text, entityType="EE02", printName="Responsibilities", fieldLength=0)
	Responsibilities,
	//
	@FlyElement(name="Responsible Name", dataType=FlyDataType.NONE, entityType="EE01", printName="Responsible Name", fieldLength=0)
	ResponsibleName,
	//
	@FlyElement(name="Responsible Type", description="Type of the Responsibility for a workflow", help="Type how the responsible user for the execution of a workflow is determined", dataType=FlyDataType.List, entityType="D", printName="Responsible Type", fieldLength=1)
	ResponsibleType,
	//
	@FlyElement(name="Result", description="Result of the action taken", help="The Result indicates the result of any action taken on this request.", dataType=FlyDataType.Integer, entityType="D", printName="Result", fieldLength=22)
	Result,
	//
	@FlyElement(name="Retained Earning Acct", dataType=FlyDataType.Account, entityType="D", printName="Retained Earning Acct", fieldLength=22)
	RetainedEarning_Acct,
	//
	@FlyElement(name="Reversal ID", description="ID of document reversal", dataType=FlyDataType.Table, entityType="D", printName="Reversal ID", fieldLength=22)
	Reversal_ID,
	//
	@FlyElement(name="Reversal Line", description="Use to keep the reversal line ID for reversing costing purpose", dataType=FlyDataType.Table, entityType="D", printName="Reversal Line", fieldLength=22)
	ReversalLine_ID,
	//
	@FlyElement(name="Revision", dataType=FlyDataType.String, entityType="EE01", printName="Revision", fieldLength=10)
	Revision,
	//
	@FlyElement(name="Reward Type", description="Type of reward which consists of percentage discount, flat discount or absolute amount", dataType=FlyDataType.List, entityType="D", printName="Reward Type", fieldLength=1)
	RewardType,
	//
	@FlyElement(name="Group", description="Request Group", help="Group of requests (e.g. version numbers, responsibility, ...)", dataType=FlyDataType.TableDirect, entityType="D", printName="Group", fieldLength=10)
	R_Group_ID,
	//
	@FlyElement(name="Info", description="Response info", help="The Info indicates any response information returned from the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="Info", fieldLength=2000)
	R_Info,
	//
	@FlyElement(name="Interest Area", description="Interest Area or Topic", help="Interest Areas reflect interest in a topic by a contact. Interest areas can be used for marketing campaigns.", dataType=FlyDataType.TableDirect, entityType="D", printName="Interest Area", fieldLength=22)
	R_InterestArea_ID,
	//
	@FlyElement(name="Known Issue", description="Known Issue", dataType=FlyDataType.Search, entityType="D", printName="Known Issue", fieldLength=10)
	R_IssueKnown_ID,
	//
	@FlyElement(name="Issue Project", description="Implementation Projects", dataType=FlyDataType.ID, entityType="D", printName="Issue Project", fieldLength=10)
	R_IssueProject_ID,
	//
	@FlyElement(name="Issue Recommendation", description="Recommendations how to fix an Issue", help="Recommendations how to fix an Issue", dataType=FlyDataType.ID, entityType="D", printName="Issue Recommendation", fieldLength=22)
	R_IssueRecommendation_ID,
	//
	@FlyElement(name="Issue Status", description="Status of an Issue", help="Status of an Issue", dataType=FlyDataType.ID, entityType="D", printName="Issue Status", fieldLength=10)
	R_IssueStatus_ID,
	//
	@FlyElement(name="Issue System", description="System creating the issue", dataType=FlyDataType.ID, entityType="D", printName="Issue System", fieldLength=10)
	R_IssueSystem_ID,
	//
	@FlyElement(name="IssueUser", description="User who reported issues", dataType=FlyDataType.ID, entityType="D", printName="Issue User", fieldLength=10)
	R_IssueUser_ID,
	//
	@FlyElement(name="Mail Template", description="Text templates for mailings", help="The Mail Template indicates the mail template for return messages. Mail text can include variables.  The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object).<br>	So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name.<br>	For Multi-Lingual systems, the template is translated based on the Business Partner's language selection.", dataType=FlyDataType.ID, entityType="D", printName="Mail Template", fieldLength=22)
	R_MailText_ID,
	//
	@FlyElement(name="Source Role", description="If set, this role will be used as label for the zoom destination instead of the destinations's window name", dataType=FlyDataType.List, entityType="D", printName="Source Role", fieldLength=50)
	Role_Source,
	//
	@FlyElement(name="Target Role", description="If set, this role will be used as label for the zoom destination instead of the destinations's window name", dataType=FlyDataType.List, entityType="D", printName="Target Role", fieldLength=50)
	Role_Target,
	//
	@FlyElement(name="Rollback Statement", description="SQL statement to rollback the current step.", dataType=FlyDataType.NONE, entityType="D", printName="Rollback Statement", fieldLength=0)
	RollbackStatement,
	//
	@FlyElement(name="Round Off Factor", description="Used to Round Off Payment Amount", dataType=FlyDataType.Number, entityType="D", printName="Round Off Factor", fieldLength=14)
	RoundOffFactor,
	//
	@FlyElement(name="Routing No", description="Bank Routing Number", help="The Bank Routing Number (ABA Number) identifies a legal Bank.  It is used in routing checks and electronic transactions.", dataType=FlyDataType.String, entityType="D", printName="Routing No", fieldLength=20)
	RoutingNo,
	//
	@FlyElement(name="Row Type", dataType=FlyDataType.String, entityType="D", printName="Row Type", fieldLength=1)
	RowType,
	//
	@FlyElement(name="Royalty Amount", description="(Included) Amount for copyright, etc.", dataType=FlyDataType.Amount, entityType="D", printName="Royalty Amount", fieldLength=22)
	RoyaltyAmt,
	//
	@FlyElement(name="Reference", description="Payment reference", help="The Payment Reference indicates the reference returned from the Credit Card Company for a payment", dataType=FlyDataType.String, entityType="D", printName="Reference", fieldLength=20)
	R_PnRef,
	//
	@FlyElement(name="Reference (DC)", description="Payment Reference Delayed Capture", help="The Payment Reference indicates the reference returned from the Credit Card Company for a payment", dataType=FlyDataType.String, entityType="D", printName="Reference (DC)", fieldLength=20)
	R_PnRef_DC,
	//
	@FlyElement(name="Revenue Recognition Amt", description="Revenue Recognition Amount", help="The amount for revenue recognition calculation.  If empty, the complete invoice amount is used.  The difference between Revenue Recognition Amount and Invoice Line Net Amount is immediately recognized as revenue.", dataType=FlyDataType.Amount, entityType="D", printName="RR Amt", fieldLength=22)
	RRAmt,
	//
	@FlyElement(name="Request History", description="Request has been changed", help="Old values", dataType=FlyDataType.ID, entityType="D", printName="Request History", fieldLength=22)
	R_RequestAction_ID,
	//
	@FlyElement(name="Request", description="Request from a Business Partner or Prospect", help="The Request identifies a unique request from a Business Partner or Prospect.", dataType=FlyDataType.ID, entityType="D", printName="Request", fieldLength=22)
	R_Request_ID,
	//
	@FlyElement(name="Request Processor", description="Processor for Requests", help="Processor for Requests", dataType=FlyDataType.ID, entityType="D", printName="Request Processor", fieldLength=22)
	R_RequestProcessor_ID,
	//
	@FlyElement(name="Request Processor Log", description="Result of the execution of the Request Processor", help="Result of the execution of the Request Processor", dataType=FlyDataType.ID, entityType="D", printName="Request Processor Log", fieldLength=22)
	R_RequestProcessorLog_ID,
	//
	@FlyElement(name="Request Routing", description="Automatic routing of requests", dataType=FlyDataType.ID, entityType="D", printName="Request Routing", fieldLength=22)
	R_RequestProcessor_Route_ID,
	//
	@FlyElement(name="Related Request", description="Related Request (Master Issue, ..)", help="Request related to this request", dataType=FlyDataType.Search, entityType="D", printName="Related Request", fieldLength=10)
	R_RequestRelated_ID,
	//
	@FlyElement(name="Request Type", description="Type of request (e.g. Inquiry, Complaint, ..)", help="Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.", dataType=FlyDataType.TableDirect, entityType="D", printName="Request Type", fieldLength=22)
	R_RequestType_ID,
	//
	@FlyElement(name="Request Update", description="Request Updates", dataType=FlyDataType.ID, entityType="D", printName="Request Update", fieldLength=10)
	R_RequestUpdate_ID,
	//
	@FlyElement(name="Resolution", description="Request Resolution", help="Resolution status (e.g. Fixed, Rejected, ..)", dataType=FlyDataType.TableDirect, entityType="D", printName="Resolution", fieldLength=10)
	R_Resolution_ID,
	//
	@FlyElement(name="Response Message", description="Response message", help="The Response Message indicates the message returned from the Credit Card Company as the result of a transmission", dataType=FlyDataType.String, entityType="D", printName="Message", fieldLength=60)
	R_RespMsg,
	//
	@FlyElement(name="Result", description="Result of transmission", help="The Response Result indicates the result of the transmission to the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="Result", fieldLength=20)
	R_Result,
	//
	@FlyElement(name="Revenue Recognition Start", description="Revenue Recognition Start Date", help="The date the revenue recognition starts.", dataType=FlyDataType.DateTime, entityType="D", printName="RR Start", fieldLength=7)
	RRStartDate,
	//
	@FlyElement(name="Standard Response", description="Request Standard Response ", help="Text blocks to be copied into request response text", dataType=FlyDataType.TableDirect, entityType="D", printName="Std Response", fieldLength=10)
	R_StandardResponse_ID,
	//
	@FlyElement(name="Status Category", description="Request Status Category", help="Category of Request Status enables to maintain different set of Status for different Request Categories", dataType=FlyDataType.ID, entityType="D", printName="Status Category", fieldLength=10)
	R_StatusCategory_ID,
	//
	@FlyElement(name="Status", description="Request Status", help="Status if the request (open, closed, investigating, ..)", dataType=FlyDataType.TableDirect, entityType="D", printName="Status", fieldLength=10)
	R_Status_ID,
	//
	@FlyElement(name="Rule Type", dataType=FlyDataType.List, entityType="D", printName="Rule Type", fieldLength=1)
	RuleType,
	//
	@FlyElement(name="Running Total Lines", description="Create Running Total Lines (page break) every x lines", help="When you want to print running totals, enter the number of lines per page after you want to create a running total line and page break. You should define running total only once per format.", dataType=FlyDataType.Integer, entityType="D", printName="RT Lines", fieldLength=22)
	RunningTotalLines,
	//
	@FlyElement(name="Maximum Runs", description="Number of recurring runs", help="Number of recurring documents to be generated in total", dataType=FlyDataType.Integer, entityType="D", printName="Max Runs", fieldLength=22)
	RunsMax,
	//
	@FlyElement(name="Remaining Runs", description="Number of recurring runs remaining", help="Number of recurring documents to be still generated", dataType=FlyDataType.Integer, entityType="D", printName="Remaining Runs", fieldLength=22)
	RunsRemaining,
	//
	@FlyElement(name="In Out Create From Identifier", dataType=FlyDataType.ID, entityType="D", printName="In Out Create From Identifier", fieldLength=10)
	RV_InOut_CreateFrom_ID,
	//
	@FlyElement(name="Invoice Create From Identifier", dataType=FlyDataType.ID, entityType="D", printName="Invoice Create From Identifier", fieldLength=10)
	RV_Invoice_CreateFrom_ID,
	//
	@FlyElement(name="RV_PP_ForecastRun ID", dataType=FlyDataType.NONE, entityType="EE01", printName="RV_PP_ForecastRun ID", fieldLength=0)
	RV_PP_ForecastRun_ID,
	//
	@FlyElement(name="Safety Stock Qty", description="Safety stock is a term used to describe a level of stock that is maintained below the cycle stock to buffer against stock-outs", help="Safety stock is defined as extra units of inventory carried as protection against possible stockouts. It is held when an organization cannot accurately predict demand and/or lead time for the product.		Rereference:	http://en.wikipedia.org/wiki/Safety_stock", dataType=FlyDataType.Quantity, entityType="EE01", printName="Safety Stock Qty", fieldLength=22)
	SafetyStock,
	//
	@FlyElement(name="Salary Range Value", description="The Salary Rage Value is use in Job Openings", help="Salary range value for Job Opening", dataType=FlyDataType.String, entityType="EE02", printName="Salary Range Value", fieldLength=60)
	SalaryRangeValue,
	//
	@FlyElement(name="Salary Structure Value", description="Salary Structure Value of an Employee", help="The Salary Structure Value define ", dataType=FlyDataType.String, entityType="EE02", printName="Salary Structure Value", fieldLength=60)
	SalaryStructureValue,
	//
	@FlyElement(name="Sales Pipeline", dataType=FlyDataType.NONE, entityType="D", printName="Sales Pipeline", fieldLength=0)
	SalesPipeline,
	//
	@FlyElement(name="Sales Region Value", dataType=FlyDataType.String, entityType="D", printName="Sales Region Value", fieldLength=60)
	SalesRegionValue,
	//
	@FlyElement(name="Sales Representative", description="Sales Representative or Company Agent", help="The Sales Representative indicates the Sales Rep for this Region.  Any Sales Rep must be a valid internal user.", dataType=FlyDataType.Table, entityType="D", printName="Sales Rep", fieldLength=22)
	SalesRep_ID,
	//
	@FlyElement(name="Sales Representative", dataType=FlyDataType.String, entityType="D", printName="Sales Rep", fieldLength=60)
	SalesRep_Name,
	//
	@FlyElement(name="Sales Volume in 1.000", description="Total Volume of Sales in Thousands of Currency", help="The Sales Volume indicates the total volume of sales for a Business Partner.", dataType=FlyDataType.Integer, entityType="D", printName="Sales Volume", fieldLength=22)
	SalesVolume,
	//
	@FlyElement(name="Salt", description="Random data added to improve password hash effectiveness", dataType=FlyDataType.String, entityType="D", printName="Salt", fieldLength=16)
	Salt,
	//
	@FlyElement(name="Schedule Type", description="Type of schedule", help="Define the method how the next occurrence is calculated", dataType=FlyDataType.List, entityType="D", printName="Schedule Type", fieldLength=1)
	ScheduleType,
	//
	@FlyElement(name="School/College", description="School/College", dataType=FlyDataType.String, entityType="EE02", printName="School/College", fieldLength=0)
	SchoolCollege,
	//
	@FlyElement(name="School/College Address", description="School/College Address", dataType=FlyDataType.Text, entityType="EE01", printName="School/College Address", fieldLength=0)
	SchoolCollegeAddress,
	//
	@FlyElement(name="Scrap %", description="Indicate the Scrap %  for calculate the Scrap Quantity", help="Scrap is useful to determinate a rigth Standard Cost and management a good supply.", dataType=FlyDataType.Number, entityType="EE01", printName="Scrap %", fieldLength=22)
	Scrap,
	//
	@FlyElement(name="Scrapped Quantity", description="The Quantity scrapped due to QA issues", dataType=FlyDataType.Quantity, entityType="D", printName="Scrapped Qty", fieldLength=22)
	ScrappedQty,
	//
	@FlyElement(name="Script", description="Dynamic Java Language Script to calculate result", help="Use Java language constructs to define the result of the calculation", dataType=FlyDataType.Text, entityType="D", printName="Script", fieldLength=2000)
	Script,
	//
	@FlyElement(name="Roll the Script", dataType=FlyDataType.Button, entityType="D", printName="Roll the Script", fieldLength=1)
	ScriptRoll,
	//
	@FlyElement(name="Search Shipment/Receipt", description="Material Shipment Document", help="The Material Shipment / Receipt ", dataType=FlyDataType.Search, entityType="D", printName="Search Shipment/Receipt", fieldLength=22)
	Search_InOut_ID,
	//
	@FlyElement(name="Search Invoice", description="Search Invoice Identifier", help="The Invoice Document.", dataType=FlyDataType.Search, entityType="D", printName="Search Invoice", fieldLength=22)
	Search_Invoice_ID,
	//
	@FlyElement(name="Search Order", description="Order Identifier", help="Order is a control document.", dataType=FlyDataType.Search, entityType="D", printName="Search Order", fieldLength=22)
	Search_Order_ID,
	//
	@FlyElement(name="Search Type", description="Which kind of search is used (Query or Table)", dataType=FlyDataType.String, entityType="D", printName="Search Type", fieldLength=1)
	SearchType,
	//
	@FlyElement(name="Secondary Skills", description="Define of Secondary Skills for this position", help="The Secondary Skills for the position", dataType=FlyDataType.Text, entityType="EE02", printName="Secondary Skills", fieldLength=0)
	SecondarySkills,
	//
	@FlyElement(name="Second Count Qty", dataType=FlyDataType.NONE, entityType="D", printName="2nd Count", fieldLength=0)
	SecondCountQty,
	//
	@FlyElement(name="Sql SELECT", description="SQL SELECT clause", help="The Select Clause indicates the SQL SELECT clause to use for selecting the record for a measure calculation. Do not include the SELECT itself.", dataType=FlyDataType.Text, entityType="D", printName="Select Clause", fieldLength=2000)
	SelectClause,
	//
	@FlyElement(name="Selected Product", dataType=FlyDataType.ID, entityType="EE01", printName="Selected Product", fieldLength=10)
	Sel_Product_ID,
	//
	@FlyElement(name="Send dunning letters", description="Indicates if dunning letters will be sent", help="The Send Dunning Letters checkbox indicates if dunning letters will be sent to Business Partners who use this dunning rule.", dataType=FlyDataType.YesNo, entityType="D", printName="Send dunning letters", fieldLength=1)
	SendDunningLetter,
	//
	@FlyElement(name="Send EMail", description="Enable sending Document EMail", help="Send emails with document attached (e.g. Invoice, Delivery Note, etc.)", dataType=FlyDataType.YesNo, entityType="D", printName="Send EMail", fieldLength=1)
	SendEMail,
	//
	@FlyElement(name="Send Inquiry", description="Quantity Availability Inquiry", dataType=FlyDataType.YesNo, entityType="D", printName="Send Inquiry", fieldLength=1)
	SendInquiry,
	//
	@FlyElement(name="Send", dataType=FlyDataType.Button, entityType="D", printName="Send", fieldLength=1)
	SendIt,
	//
	@FlyElement(name="Send Order", dataType=FlyDataType.YesNo, entityType="D", printName="Send Order", fieldLength=1)
	SendOrder,
	//
	@FlyElement(name="Element Separator", description="Element Separator", help="The Element Separator defines the delimiter printed between elements of the structure", dataType=FlyDataType.String, entityType="D", printName="Element Separator", fieldLength=1)
	Separator,
	//
	@FlyElement(name="Separator Character", dataType=FlyDataType.String, entityType="D", printName="Separator Character", fieldLength=1)
	SeparatorChar,
	//
	@FlyElement(name="Sequence", description="Method of ordering records; lowest number comes first", help="The Sequence indicates the order of records", dataType=FlyDataType.Integer, entityType="D", printName="Sequence", fieldLength=22)
	SeqNo,
	//
	@FlyElement(name="Grid Sequence", description="Method of ordering records; lowest number comes first", help="The Sequence indicates the order of columns in grid view", dataType=FlyDataType.NONE, entityType="D", printName="Grid Sequence", fieldLength=0)
	SeqNoGrid,
	//
	@FlyElement(name="Sequence", dataType=FlyDataType.Number, entityType="D", printName="Sequence", fieldLength=22)
	Sequence,
	//
	@FlyElement(name="Series Column", dataType=FlyDataType.NONE, entityType="D", printName="Optional column containing the datasource series", fieldLength=0)
	SeriesColumn,
	//
	@FlyElement(name="Serial No", description="Product Serial Number ", help="The Serial Number identifies a tracked, warranted product.  It can only be used when the quantity is 1.", dataType=FlyDataType.String, entityType="D", printName="Serial No", fieldLength=40)
	SerNo,
	//
	@FlyElement(name="SerNo Char End Overwrite", description="Serial Number End Indicator overwrite - default empty", help="If not defined, no character is used", dataType=FlyDataType.String, entityType="D", printName="SerNo Char End", fieldLength=1)
	SerNoCharEOverwrite,
	//
	@FlyElement(name="SerNo Char Start Overwrite", description="Serial Number Start Indicator overwrite - default #", help="If not defined, the default character # is used", dataType=FlyDataType.String, entityType="D", printName="SerNo Char Start", fieldLength=1)
	SerNoCharSOverwrite,
	//
	@FlyElement(name="Service date", description="Date service was provided", help="The Service Date indicates the date that the service was provided.", dataType=FlyDataType.Date, entityType="D", printName="Service date", fieldLength=7)
	ServiceDate,
	//
	@FlyElement(name="Quantity Invoiced", description="Quantity of product or service invoiced", help="The Quantity Invoiced indicates the total quantity of a product or service that has been invoiced.", dataType=FlyDataType.Number, entityType="D", printName="Qty Invoiced", fieldLength=22)
	ServiceLevelInvoiced,
	//
	@FlyElement(name="Quantity Provided", description="Quantity of service or product provided", help="The Quantity Provided indicates the total quantity of a product or service that has been received by the customer.", dataType=FlyDataType.Number, entityType="D", printName="Qty Provided", fieldLength=22)
	ServiceLevelProvided,
	//
	@FlyElement(name="Session ID", dataType=FlyDataType.ID, entityType="D", printName="Session ID", fieldLength=60)
	Session_ID,
	//
	@FlyElement(name="Only Set Customization", description="Set Customization for change records records with Dictionary Entity Type", dataType=FlyDataType.NONE, entityType="D", printName="Only Set Customization", fieldLength=0)
	SetCustomization,
	//
	@FlyElement(name="Set Future Costs to", description="Set the Future costs to the selection", dataType=FlyDataType.NONE, entityType="D", printName="Set Future Costs to", fieldLength=0)
	SetFutureCostTo,
	//
	@FlyElement(name="Set Standard Cost to", description="Set new Standard Costs to the selection", dataType=FlyDataType.NONE, entityType="D", printName="Set Standard Cost to", fieldLength=0)
	SetStandardCostTo,
	//
	@FlyElement(name="Setup Time", description="Setup time before starting Production", help="Once per operation", dataType=FlyDataType.Number, entityType="D", printName="Setup Time", fieldLength=22)
	SetupTime,
	//
	@FlyElement(name="Setup Time Real", dataType=FlyDataType.Integer, entityType="EE01", printName="Setup Time Real", fieldLength=22)
	SetupTimeReal,
	//
	@FlyElement(name="Setup Time Required", dataType=FlyDataType.Integer, entityType="EE01", printName="Setup Time Required", fieldLength=22)
	SetupTimeRequired,
	//
	@FlyElement(name="Expense Type", description="Expense report type", dataType=FlyDataType.TableDirect, entityType="D", printName="Expense Type", fieldLength=22)
	S_ExpenseType_ID,
	//
	@FlyElement(name="Shape Type", description="Type of the shape to be painted", dataType=FlyDataType.List, entityType="D", printName="Shape Type", fieldLength=1)
	ShapeType,
	//
	@FlyElement(name="Share", description="Share of Customer's business as a percentage", help="The Share indicates the percentage of this Business Partner's volume of the products supplied.", dataType=FlyDataType.Integer, entityType="D", printName="Share", fieldLength=22)
	ShareOfCustomer,
	//
	@FlyElement(name="Share Type", description="Type of sharing", help="Defines if a table is shared within a client or not.", dataType=FlyDataType.List, entityType="D", printName="Share Type", fieldLength=1)
	ShareType,
	//
	@FlyElement(name="Shelf Depth", description="Shelf depth required", help="The Shelf Depth indicates the depth dimension required on a shelf for a product ", dataType=FlyDataType.Integer, entityType="D", printName="Shelf Depth", fieldLength=22)
	ShelfDepth,
	//
	@FlyElement(name="Shelf Height", description="Shelf height required", help="The Shelf Height indicates the height dimension required on a shelf for a product", dataType=FlyDataType.Amount, entityType="D", printName="Shelf Height", fieldLength=22)
	ShelfHeight,
	//
	@FlyElement(name="Shelf Life Days", description="Shelf Life in days based on Product Instance Guarantee Date", help="Shelf Life of products with Guarantee Date instance compared to today.", dataType=FlyDataType.Integer, entityType="D", printName="Shelf Life Days", fieldLength=22)
	ShelfLifeDays,
	//
	@FlyElement(name="Min Shelf Life Days", description="Minimum Shelf Life in days based on Product Instance Guarantee Date", help="Minimum Shelf Life of products with Guarantee Date instance. If > 0 you cannot select products with a shelf life less than the minimum shelf life, unless you select 'Show All'", dataType=FlyDataType.Integer, entityType="D", printName="Min Shelf Life Days", fieldLength=22)
	ShelfLifeMinDays,
	//
	@FlyElement(name="Min Shelf Life %", description="Minimum Shelf Life in percent based on Product Instance Guarantee Date", help="Minimum Shelf Life of products with Guarantee Date instance. If > 0 you cannot select products with a shelf life ((Guarantee Date-Today) / Guarantee Days) less than the minimum shelf life, unless you select 'Show All'", dataType=FlyDataType.Integer, entityType="D", printName="Min Shelf Life %", fieldLength=22)
	ShelfLifeMinPct,
	//
	@FlyElement(name="Remaining Shelf Life %", description="Remaining shelf life in percent based on Guarantee Date", help="(Guarantee Date-Today) / Guarantee Days", dataType=FlyDataType.Integer, entityType="D", printName="Rem Shelf Life %", fieldLength=22)
	ShelfLifeRemainingPct,
	//
	@FlyElement(name="Shelf Width", description="Shelf width required", help="The Shelf Width indicates the width dimension required on a shelf for a product", dataType=FlyDataType.Integer, entityType="D", printName="Shelf Width", fieldLength=22)
	ShelfWidth,
	//
	@FlyElement(name="Shift From Time", description="Shift Starting Time", dataType=FlyDataType.Time, entityType="EE02", printName="Shift From Time", fieldLength=0)
	ShiftFromTime,
	//
	@FlyElement(name="Shift Group Value", description="Shift Group Value", help="The Shift Group provides a way to grouping of Shifts", dataType=FlyDataType.String, entityType="ECA02", printName="Shift Group Value", fieldLength=60)
	ShiftGroupValue,
	//
	@FlyElement(name="Shift To Time", description="Shift Ending At Time", dataType=FlyDataType.Time, entityType="EE02", printName="Shift To Time", fieldLength=0)
	ShiftToTime,
	//
	@FlyElement(name="Ship Date", description="Shipment Date/Time", help="Actual Date/Time of Shipment (pick up)", dataType=FlyDataType.DateTime, entityType="D", printName="Ship Date", fieldLength=7)
	ShipDate,
	//
	@FlyElement(name="Ship Description", dataType=FlyDataType.String, entityType="D", printName="Ship Description", fieldLength=255)
	ShipDescription,
	//
	@FlyElement(name="Shipment Mail Text", description="Email text used for sending delivery notes", help="Standard email template used to send delivery notes as attachments.", dataType=FlyDataType.Table, entityType="D", printName="Shipment Mail Text", fieldLength=22)
	Shipment_MailText_ID,
	//
	@FlyElement(name="Shipment Print Format", description="Print Format for Shipments, Receipts, Pick Lists", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="Shipment Print Format", fieldLength=22)
	Shipment_PrintFormat_ID,
	//
	@FlyElement(name="ShipperName", dataType=FlyDataType.String, entityType="EE01", printName="Shipper Name", fieldLength=40)
	ShipperName,
	//
	@FlyElement(name="Show Actual Amount", dataType=FlyDataType.NONE, entityType="D", printName="Show Actual Amount", fieldLength=0)
	ShowActualAmt,
	//
	@FlyElement(name="Show Committed Amount", dataType=FlyDataType.NONE, entityType="D", printName="Show Committed Amount", fieldLength=0)
	ShowCommittedAmt,
	//
	@FlyElement(name="Show Help", dataType=FlyDataType.List, entityType="D", printName="Show Help", fieldLength=1)
	ShowHelp,
	//
	@FlyElement(name="Show Planned Amount", dataType=FlyDataType.NONE, entityType="D", printName="Show Planned Amount", fieldLength=0)
	ShowPlannedAmt,
	//
	@FlyElement(name="Show Planned Margin Amount", dataType=FlyDataType.NONE, entityType="D", printName="Show Planned Margin Amount", fieldLength=0)
	ShowPlannedMarginAmt,
	//
	@FlyElement(name="Show Planned Quantity", dataType=FlyDataType.NONE, entityType="D", printName="Show Planned Quantity", fieldLength=0)
	ShowPlannedQty,
	//
	@FlyElement(name="Size X", description="X (horizontal) dimension size", help="Size of X (horizontal) dimension in Units", dataType=FlyDataType.Number, entityType="D", printName="Size X", fieldLength=5)
	SizeX,
	//
	@FlyElement(name="Size Y", description="Y (vertical) dimension size", help="Size of Y (vertical) dimension in Units", dataType=FlyDataType.Number, entityType="D", printName="Size Y", fieldLength=5)
	SizeY,
	//
	@FlyElement(name="Skill Type Name", description="Skill Type Name", dataType=FlyDataType.String, entityType="EE02", printName="Skill Type Name", fieldLength=60)
	SkillTypeName,
	//
	@FlyElement(name="Skill Type Value", description="Skill Type Value", dataType=FlyDataType.String, entityType="EE02", printName="Skill Type Value", fieldLength=40)
	SkillTypeValue,
	//
	@FlyElement(name="SKU", description="Stock Keeping Unit", help="The SKU indicates a user defined stock keeping unit.  It may be used for an additional bar code symbols or your own schema.", dataType=FlyDataType.String, entityType="D", printName="SKU", fieldLength=30)
	SKU,
	//
	@FlyElement(name="Mail Host", description="Hostname of Mail Server for SMTP and IMAP", help="The host name of the Mail Server for this client with SMTP services to send mail, and IMAP to process incoming mail.", dataType=FlyDataType.String, entityType="D", printName="Mail Host", fieldLength=60)
	SMTPHost,
	//
	@FlyElement(name="Credit Available", description="Available Credit based on Credit Limit (not Total Open Balance) and Credit Used", dataType=FlyDataType.Amount, entityType="D", printName="Credit Available", fieldLength=22)
	SO_CreditAvailable,
	//
	@FlyElement(name="Credit Limit", description="Total outstanding invoice amounts allowed", help="The Credit Limit indicates the total amount allowed 'on account' in primary accounting currency.  If the Credit Limit is 0, no check is performed.  Credit Management is based on the Total Open Amount, which includes Vendor activities.", dataType=FlyDataType.Amount, entityType="D", printName="Credit Limit", fieldLength=22)
	SO_CreditLimit,
	//
	@FlyElement(name="Credit Status", description="Business Partner Credit Status", help="Credit Management is inactive if Credit Status is No Credit Check, Credit Stop or if the Credit Limit is 0.	If active, the status is set automatically set to Credit Hold, if the Total Open Balance (including Vendor activities)  is higher then the Credit Limit. It is set to Credit Watch, if above 90% of the Credit Limit and Credit OK otherwise.", dataType=FlyDataType.List, entityType="D", printName="Credit Status", fieldLength=1)
	SOCreditStatus,
	//
	@FlyElement(name="Credit Used", description="Current open balance", help="The Credit Used indicates the total amount of open or unpaid invoices in primary accounting currency for the Business Partner. Credit Management is based on the Total Open Amount, which includes Vendor activities.", dataType=FlyDataType.Amount, entityType="D", printName="Credit Used", fieldLength=22)
	SO_CreditUsed,
	//
	@FlyElement(name="Order Description", description="Description to be used on orders", help="The Order Description identifies the standard description to use on orders for this Customer.", dataType=FlyDataType.String, entityType="D", printName="Order Description", fieldLength=255)
	SO_Description,
	//
	@FlyElement(name="SO/PO Type", description="Sales Tax applies to sales situations, Purchase Tax to purchase situations", help="Sales Tax: charged when selling - examples: Sales Tax, Output VAT (payable)	Purchase Tax: tax charged when purchasing - examples: Use Tax, Input VAT (receivable)", dataType=FlyDataType.List, entityType="D", printName="SO/PO Type", fieldLength=1)
	SOPOType,
	//
	@FlyElement(name="Sales Pricelist", dataType=FlyDataType.Table, entityType="D", printName="Sales Pricelist", fieldLength=22)
	SO_PriceList_ID,
	//
	@FlyElement(name="Record Sort No", description="Determines in what order the records are displayed", help="The Record Sort No indicates the ascending sort sequence of the records. If the number is negative, the records are sorted descending. 	Example: A tab with C_DocType_ID (1), DocumentNo (-2) will be sorted ascending by document type and descending by document number (SQL: ORDER BY C_DocType, DocumentNo DESC)", dataType=FlyDataType.Number, entityType="D", printName="Record Sort No", fieldLength=22)
	SortNo,
	//
	@FlyElement(name="Source Class", description="Source Class Name", dataType=FlyDataType.String, entityType="D", printName="Source Class", fieldLength=60)
	SourceClassName,
	//
	@FlyElement(name="Source Method", description="Source Method Name", dataType=FlyDataType.String, entityType="D", printName="Source Method", fieldLength=60)
	SourceMethodName,
	//
	@FlyElement(name="Source Updated", description="Date the source document was updated", dataType=FlyDataType.DateTime, entityType="D", printName="Source Updated", fieldLength=7)
	SourceUpdated,
	//
	@FlyElement(name="Column span", description="Number of columns spanned", dataType=FlyDataType.Integer, entityType="D", printName="Column span", fieldLength=10)
	SpanX,
	//
	@FlyElement(name="Row Span", description="Number of rows spanned", dataType=FlyDataType.Integer, entityType="D", printName="Row Span", fieldLength=10)
	SpanY,
	//
	@FlyElement(name="Split Element", description="Semantics for multiple outgoing Transitions", help="Semantics for multiple outgoing Transitions for a Node/Activity.  AND represents multiple concurrent threads - XOR represents the first transition with a true Transition condition.", dataType=FlyDataType.List, entityType="D", printName="Split Element", fieldLength=1)
	SplitElement,
	//
	@FlyElement(name="Sponsor Name", description="Sponsor Name", help="The Sponsor Name", dataType=FlyDataType.String, entityType="EE02", printName="Sponsor Name", fieldLength=0)
	SponsorName,
	//
	@FlyElement(name="SQLStatement", dataType=FlyDataType.Memo, entityType="D", printName="SQLStatement", fieldLength=2000)
	SQLStatement,
	//
	@FlyElement(name="Resource Assignment", description="Resource Assignment", dataType=FlyDataType.Assignment, entityType="D", printName="Assignment", fieldLength=22)
	S_ResourceAssignment_ID,
	//
	@FlyElement(name="Resource", description="Resource", dataType=FlyDataType.TableDirect, entityType="D", printName="Resource", fieldLength=22)
	S_Resource_ID,
	//
	@FlyElement(name="Resource Type", dataType=FlyDataType.TableDirect, entityType="D", printName="Resource Type", fieldLength=22)
	S_ResourceType_ID,
	//
	@FlyElement(name="Resource Unavailability", dataType=FlyDataType.ID, entityType="D", printName="Resource Unavailability", fieldLength=22)
	S_ResourceUnAvailable_ID,
	//
	@FlyElement(name="Social Security Code", dataType=FlyDataType.NONE, entityType="EE02", printName="Social Security Code", fieldLength=60)
	SSCode,
	//
	@FlyElement(name="Stack Trace", description="System Log Trace", dataType=FlyDataType.Text, entityType="D", printName="Stack Trace", fieldLength=2000)
	StackTrace,
	//
	@FlyElement(name="Standard Hours", description="Standard Work Hours based on Remuneration Type", help="Number of hours per Remuneration Type (e.g. Daily 8 hours, Weekly 40 hours, etc.) to determine when overtime starts", dataType=FlyDataType.Integer, entityType="D", printName="Standard Hours", fieldLength=10)
	StandardHours,
	//
	@FlyElement(name="Standard Quantity", description="Standard Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Standard Quantity", fieldLength=22)
	StandardQty,
	//
	@FlyElement(name="Start Date", description="First effective day (inclusive)", help="The Start Date indicates the first or starting date", dataType=FlyDataType.Date, entityType="D", printName="Start Date", fieldLength=7)
	StartDate,
	//
	@FlyElement(name="Start Count Impression", description="For rotation we need a start count", help="If we run banners in rotation we always show the one with the min of impressions, so if a new banner is added to impressions we don't want it to show up so often we set a startimpressions value. StartImpression+ActualImpression=CurrentImpression", dataType=FlyDataType.Integer, entityType="D", printName="Start Count Impression", fieldLength=10)
	StartImpression,
	//
	@FlyElement(name="Start Mode", description="Workflow Activity Start Mode ", help="How is the execution of an activity triggered. Automatic are triggered implicitly by the system, Manual explicitly by the User.", dataType=FlyDataType.List, entityType="D", printName="Start Mode", fieldLength=1)
	StartMode,
	//
	@FlyElement(name="Restart sequence every Year", description="Restart the sequence with Start on every 1/1", help="The Restart Sequence Every Year checkbox indicates that the documents sequencing should return to the starting number on the first day of the year.", dataType=FlyDataType.YesNo, entityType="D", printName="Restart sequence every Year", fieldLength=1)
	StartNewYear,
	//
	@FlyElement(name="Start No", description="Starting number/position", help="The Start Number indicates the starting position in the line or field number in the line", dataType=FlyDataType.Integer, entityType="D", printName="Start No", fieldLength=22)
	StartNo,
	//
	@FlyElement(name="Start Point", description="Start point of the gradient colors", help="The gradient starts at the start point (e.g. North). The repeat distance determines if and how often the gradient colors are repeated.  If starting from southern points, the upper color is actually at the button.", dataType=FlyDataType.List, entityType="D", printName="Start Point", fieldLength=22)
	StartPoint,
	//
	@FlyElement(name="Start Implementation/Production", description="The day you started the implementation (if implementing) - or production (went life) with Adempiere", dataType=FlyDataType.Date, entityType="D", printName="Start Implementation/Production", fieldLength=7)
	StartProductionDate,
	//
	@FlyElement(name="Start Time", description="Time started", dataType=FlyDataType.DateTime, entityType="D", printName="Start Time", fieldLength=7)
	StartTime,
	//
	@FlyElement(name="Statement date", description="Date of the statement", help="The Statement Date field defines the date of the statement.", dataType=FlyDataType.Date, entityType="D", printName="Statement date", fieldLength=7)
	StatementDate,
	//
	@FlyElement(name="Statement difference", description="Difference between statement ending balance and actual ending balance", help="The Statement Difference reflects the difference between the Statement Ending Balance and the Actual Ending Balance.", dataType=FlyDataType.Amount, entityType="D", printName="Statement difference", fieldLength=22)
	StatementDifference,
	//
	@FlyElement(name="Statement Line Date", description="Date of the Statement Line", dataType=FlyDataType.Date, entityType="D", printName="Statement Line Date", fieldLength=7)
	StatementLineDate,
	//
	@FlyElement(name="Statistic Count", description="Internal statistics how often the entity was used", help="For internal use.", dataType=FlyDataType.Integer, entityType="D", printName="Statistic Count", fieldLength=22)
	Statistic_Count,
	//
	@FlyElement(name="Statistic Seconds", description="Internal statistics how many seconds a process took", help="For internal use", dataType=FlyDataType.Integer, entityType="D", printName="Statistic Seconds", fieldLength=22)
	Statistic_Seconds,
	//
	@FlyElement(name="Statistics", description="Information to help profiling the system for solving support issues", help="Profile information do not contain sensitive information and are used to support issue detection and diagnostics as well as general anonymous statistics", dataType=FlyDataType.String, entityType="D", printName="Statistics", fieldLength=60)
	StatisticsInfo,
	//
	@FlyElement(name="Status", description="Status of the currently running check", help="Status of the currently running check", dataType=FlyDataType.List, entityType="D", printName="Status", fieldLength=2)
	Status,
	//
	@FlyElement(name="Status Code", dataType=FlyDataType.Integer, entityType="D", printName="Status Code", fieldLength=10)
	StatusCode,
	//
	@FlyElement(name="Standard price Surcharge Amount", description="Amount added to a price as a surcharge", help="The Standard Price Surcharge Amount indicates the amount to be added to the price prior to multiplication.	", dataType=FlyDataType.Amount, entityType="D", printName="Standard price Surcharge Amt", fieldLength=22)
	Std_AddAmt,
	//
	@FlyElement(name="Standard price Base", description="Base price for calculating new standard price", help="The Standard Price Base indicates the price to use as the basis for the calculation of a new price standard.	", dataType=FlyDataType.List, entityType="D", printName="Standard price Base", fieldLength=1)
	Std_Base,
	//
	@FlyElement(name="Standard price Discount %", description="Discount percentage to subtract from base price", help="The Standard Price Discount Percentage indicates the percentage discount which will be subtracted from the base price.  A negative amount indicates the percentage which will be added to the base price.", dataType=FlyDataType.Number, entityType="D", printName="Standard price Discount %", fieldLength=22)
	Std_Discount,
	//
	@FlyElement(name="Fixed Standard Price", description="Fixed Standard Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="Fixed Standard", fieldLength=22)
	Std_Fixed,
	//
	@FlyElement(name="Standard max Margin", description="Maximum margin allowed for a product", help="The Standard Price Max Margin indicates the maximum margin for a product.  The margin is calculated by subtracting the original Standard price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="Standard max Margin", fieldLength=22)
	Std_MaxAmt,
	//
	@FlyElement(name="Standard price min Margin", description="Minimum margin allowed for a product", help="The Standard Price Min Margin indicates the minimum margin for a product.  The margin is calculated by subtracting the original Standard price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="Standard price min Margin", fieldLength=22)
	Std_MinAmt,
	//
	@FlyElement(name="Standard Precision", description="Rule for rounding  calculated amounts", help="The Standard Precision defines the number of decimal places that amounts will be rounded to for accounting transactions and documents.", dataType=FlyDataType.Integer, entityType="D", printName="Standard Precision", fieldLength=22)
	StdPrecision,
	//
	@FlyElement(name="Standard price Rounding", description="Rounding rule for calculated price", help="The Standard Price Rounding indicates how the final Standard price will be rounded.", dataType=FlyDataType.List, entityType="D", printName="Standard price Rounding", fieldLength=1)
	Std_Rounding,
	//
	@FlyElement(name="Step type", description="Migration step type", dataType=FlyDataType.NONE, entityType="D", printName="Step Type", fieldLength=0)
	StepType,
	//
	@FlyElement(name="Expense Report", description="Time and Expense Report", dataType=FlyDataType.ID, entityType="D", printName="Expense Report", fieldLength=22)
	S_TimeExpense_ID,
	//
	@FlyElement(name="Expense Line", description="Time and Expense Report Line", dataType=FlyDataType.ID, entityType="D", printName="Expense Line", fieldLength=22)
	S_TimeExpenseLine_ID,
	//
	@FlyElement(name="Time Type", description="Type of time recorded", help="Differentiate time types for reporting purposes (In parallel to Activities)", dataType=FlyDataType.TableDirect, entityType="D", printName="Time Type", fieldLength=22)
	S_TimeType_ID,
	//
	@FlyElement(name="Statement amount", description="Statement Amount", help="The Statement Amount indicates the amount of a single statement line.", dataType=FlyDataType.Amount, entityType="D", printName="Statement Amt", fieldLength=22)
	StmtAmt,
	//
	@FlyElement(name="Statement Loader Class", description="Class name of the bank statement loader", help="The name of the actual bank statement loader implementing the interface org.compiere.impexp.BankStatementLoaderInterface", dataType=FlyDataType.String, entityType="D", printName="Statement Loader Class", fieldLength=60)
	StmtLoaderClass,
	//
	@FlyElement(name="Store Archive On File System", dataType=FlyDataType.YesNo, entityType="D", printName="Store Archive On File System", fieldLength=1)
	StoreArchiveOnFileSystem,
	//
	@FlyElement(name="Store Attachments On File System", dataType=FlyDataType.YesNo, entityType="D", printName="Store Attachments On File System", fieldLength=1)
	StoreAttachmentsOnFileSystem,
	//
	@FlyElement(name="Training Class", description="The actual training class instance", help="A scheduled class", dataType=FlyDataType.ID, entityType="D", printName="Training Class", fieldLength=22)
	S_Training_Class_ID,
	//
	@FlyElement(name="Training", description="Repeated Training", help="The training may have multiple actual classes", dataType=FlyDataType.TableDirect, entityType="D", printName="Training", fieldLength=22)
	S_Training_ID,
	//
	@FlyElement(name="Stregth Required", description="Stregth Required", help="The Stregth Required", dataType=FlyDataType.Integer, entityType="EE02", printName="Stregth Required", fieldLength=0)
	StrengthRequired,
	//
	@FlyElement(name="StructureXML", description="Autogenerated Containerdefinition as XML Code", help="Autogenerated Containerdefinition as XML Code", dataType=FlyDataType.Text, entityType="D", printName="StructureXML", fieldLength=2000)
	StructureXML,
	//
	@FlyElement(name="Stylesheet", description="CSS (Stylesheet) used", help="Base Stylesheet (.css file) to use - if empty, the default (standard.css) is used. The Style sheet can be a URL.", dataType=FlyDataType.String, entityType="D", printName="Stylesheet", fieldLength=60)
	Stylesheet,
	//
	@FlyElement(name="Sub Account Value", description="Sub account Value", help="The Element Value (e.g. Account) may have optional sub accounts Value for further detail. The sub account is dependent on the value of the account, so a further specification. If the sub-accounts are more or less the same, consider using another accounting dimension.", dataType=FlyDataType.String, entityType="D", printName="Sub Acct", fieldLength=40)
	SubAcctValue,
	//
	@FlyElement(name="Subflow Execution", description="Mode how the sub-workflow is executed", dataType=FlyDataType.List, entityType="D", printName="Subflow Execution", fieldLength=1)
	SubflowExecution,
	//
	@FlyElement(name="Subject", description="Email Message Subject", help="Subject of the EMail ", dataType=FlyDataType.Text, entityType="D", printName="Subject", fieldLength=255)
	Subject,
	//
	@FlyElement(name="Key Layout", description="Key Layout to be displayed when this key is pressed", dataType=FlyDataType.Table, entityType="D", printName="Key Layout", fieldLength=22)
	SubKeyLayout_ID,
	//
	@FlyElement(name="Subscribe Date", description="Date the contact actively subscribed", help="Date the contact subscribe the interest area", dataType=FlyDataType.Date, entityType="D", printName="Subscribe Date", fieldLength=7)
	SubscribeDate,
	//
	@FlyElement(name="Substitute", description="Entity which can be used in place of this entity", help="The Substitute identifies the entity to be used as a substitute for this entity.", dataType=FlyDataType.Search, entityType="D", printName="Substitute", fieldLength=22)
	Substitute_ID,
	//
	@FlyElement(name="Success", dataType=FlyDataType.String, entityType="D", printName="Success", fieldLength=20)
	Success,
	//
	@FlyElement(name="Suffix", description="Suffix after the number", help="The Suffix indicates the characters to append to the document number.", dataType=FlyDataType.String, entityType="D", printName="Suffix", fieldLength=255)
	Suffix,
	//
	@FlyElement(name="Generate Suggested Requisition Report", dataType=FlyDataType.Button, entityType="D", printName="Generate Suggested Requisition Report", fieldLength=1)
	SuggestedRequisitionReport,
	//
	@FlyElement(name="Summary", description="Textual summary of this request", help="The Summary allows free form text entry of a recap of this request.", dataType=FlyDataType.Text, entityType="D", printName="Summary", fieldLength=2000)
	Summary,
	//
	@FlyElement(name="Sum Qty on Hand", description="Summary of product on hand in all locators", dataType=FlyDataType.Quantity, entityType="D", printName="Sum Qty on Hand", fieldLength=131089)
	SumQtyOnHand,
	//
	@FlyElement(name="Supervisor", description="Supervisor for this user/organization - used for escalation and approval", help="The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.", dataType=FlyDataType.Search, entityType="D", printName="Supervisor", fieldLength=22)
	Supervisor_ID,
	//
	@FlyElement(name="Support EMail", description="EMail address to send support information and updates to", help="If not entered the registered email is used.", dataType=FlyDataType.String, entityType="D", printName="Support EMail", fieldLength=60)
	SupportEMail,
	//
	@FlyElement(name="Support Expires", description="Date when the Adempiere support expires", help="Check http://www.adempiere.org for support options", dataType=FlyDataType.Date, entityType="D", printName="Support Expires", fieldLength=7)
	SupportExpDate,
	//
	@FlyElement(name="Internal Users", description="Number of Internal Users for Adempiere Support", help="'You can purchase professional support from Adempiere, Inc. or their partners.  See http://www.adempiere.com for details.	'", dataType=FlyDataType.Integer, entityType="D", printName="Internal Users", fieldLength=22)
	SupportUnits,
	//
	@FlyElement(name="Suspense Balancing Acct", dataType=FlyDataType.Account, entityType="D", printName="Suspense Balancing Acct", fieldLength=22)
	SuspenseBalancing_Acct,
	//
	@FlyElement(name="Suspense Error Acct", dataType=FlyDataType.Account, entityType="D", printName="Suspense Error Acct", fieldLength=22)
	SuspenseError_Acct,
	//
	@FlyElement(name="Swift code", description="Swift Code or BIC", help="The Swift Code (Society of Worldwide Interbank Financial Telecommunications) or BIC (Bank Identifier Code) is an identifier of a Bank. The first 4 characters are the bank code, followed by the 2 character country code, the two character location code and optional 3 character branch code. For details see http://www.swift.com/biconline/index.cfm", dataType=FlyDataType.String, entityType="D", printName="Swift code", fieldLength=20)
	SwiftCode,
	//
	@FlyElement(name="Swipe", description="Track 1 and 2 of the Credit Card", help="Swiped information for Credit Card Presence Transactions", dataType=FlyDataType.String, entityType="D", printName="Swipe", fieldLength=80)
	Swipe,
	//
	@FlyElement(name="Synonym Name", description="The synonym for the name", help="The synonym broadens the search", dataType=FlyDataType.String, entityType="D", printName="Synonym Name", fieldLength=60)
	SynonymName,
	//
	@FlyElement(name="System Status", description="Status of the system - Support priority depends on system status", help="System status helps to prioritize support resources", dataType=FlyDataType.List, entityType="D", printName="System Status", fieldLength=1)
	SystemStatus,
	//
	@FlyElement(name="DB Table Alias", description="Alias of the table in the view", help="The DB Table Alias indicates the name of the alias in view.", dataType=FlyDataType.String, entityType="EE07", printName="DB Table Alias", fieldLength=20)
	TableAlias,
	//
	@FlyElement(name="DB Table Name", description="Name of the table in the database", help="The DB Table Name indicates the name of the table in database.", dataType=FlyDataType.String, entityType="D", printName="DB Table Name", fieldLength=40)
	TableName,
	//
	@FlyElement(name="Tab Level", description="Hierarchical Tab Level (0 = top)", help="Hierarchical level of the tab. If the level is 0, it is the top entity. Level 1 entries are dependent on level 0, etc.", dataType=FlyDataType.Integer, entityType="D", printName="Tab Level", fieldLength=22)
	TabLevel,
	//
	@FlyElement(name="Amount", dataType=FlyDataType.Amount, entityType="D", printName="Amt", fieldLength=22)
	T_Amount,
	//
	@FlyElement(name="Target_Directory", dataType=FlyDataType.String, entityType="D", printName="Target_Directory", fieldLength=255)
	Target_Directory,
	//
	@FlyElement(name="Target Frame", description="Which target should be used if user clicks?", help="Do we want the content to stay in same window, to open up a new one or to place it in a special frame?", dataType=FlyDataType.String, entityType="D", printName="Target Frame", fieldLength=20)
	Target_Frame,
	//
	@FlyElement(name="Target Quantity", description="Target Movement Quantity", help="The Quantity which should have been received", dataType=FlyDataType.Quantity, entityType="D", printName="Target Qty", fieldLength=22)
	TargetQty,
	//
	@FlyElement(name="Target URL", description="URL for the Target", help="URL of the Target Site", dataType=FlyDataType.URL, entityType="D", printName="Target URL", fieldLength=120)
	TargetURL,
	//
	@FlyElement(name="Task Status", description="Status of the Task", help="Completion Rate and Status of the Task", dataType=FlyDataType.List, entityType="D", printName="Task Status", fieldLength=1)
	TaskStatus,
	//
	@FlyElement(name="Tax Amount", description="Tax Amount for a document", help="The Tax Amount displays the total tax amount for a document.", dataType=FlyDataType.Amount, entityType="D", printName="Tax", fieldLength=22)
	TaxAmt,
	//
	@FlyElement(name="Tax base Amount", description="Base for calculating the tax amount", help="The Tax Base Amount indicates the base amount used for calculating the tax amount.", dataType=FlyDataType.Amount, entityType="D", printName="Tax base Amt", fieldLength=22)
	TaxBaseAmt,
	//
	@FlyElement(name="Tax Category Name", description="Name of tax category", dataType=FlyDataType.String, entityType="D", printName="Tax Category Name", fieldLength=60)
	TaxCategoryName,
	//
	@FlyElement(name="Tax Correction", description="Type of Tax Correction", help="Determines if/when tax is corrected. Discount could be agreed or granted underpayments; Write-off may be partial or complete write-off.", dataType=FlyDataType.List, entityType="D", printName="Tax Correction", fieldLength=1)
	TaxCorrectionType,
	//
	@FlyElement(name="Tax ID", description="Tax Identification", help="The Tax ID field identifies the legal Identification number of this Entity.", dataType=FlyDataType.String, entityType="D", printName="Tax ID", fieldLength=20)
	TaxID,
	//
	@FlyElement(name="Tax Indicator", description="Short form for Tax to be printed on documents", help="The Tax Indicator identifies the short name that will print on documents referencing this tax.", dataType=FlyDataType.String, entityType="D", printName="Tax Indicator", fieldLength=10)
	TaxIndicator,
	//
	@FlyElement(name="Tax Line Total", description="Tax Line Total Amount", dataType=FlyDataType.Amount, entityType="D", printName="Line Total", fieldLength=22)
	TaxLineTotal,
	//
	@FlyElement(name="Indented BOM Report", dataType=FlyDataType.ID, entityType="D", printName="Indented BOM Report", fieldLength=10)
	T_BOM_Indented_ID,
	//
	@FlyElement(name="Temporal BOM Line", dataType=FlyDataType.ID, entityType="EE01", printName="Temporal BOM Line", fieldLength=10)
	T_BOMLine_ID,
	//
	@FlyElement(name="Tax Credit", description="Account for Tax you can reclaim", help="The Tax Credit Account indicates the account used to record taxes that can be reclaimed", dataType=FlyDataType.Account, entityType="D", printName="Tax Credit", fieldLength=22)
	T_Credit_Acct,
	//
	@FlyElement(name="Date", dataType=FlyDataType.Date, entityType="D", printName="Date", fieldLength=7)
	T_Date,
	//
	@FlyElement(name="DateTime", dataType=FlyDataType.DateTime, entityType="D", printName="DateTime", fieldLength=7)
	T_DateTime,
	//
	@FlyElement(name="Tax Due", description="Account for Tax you have to pay", help="The Tax Due Account indicates the account used to record taxes that you are liable to pay.", dataType=FlyDataType.Account, entityType="D", printName="Tax Due", fieldLength=22)
	T_Due_Acct,
	//
	@FlyElement(name="Teardown Time", description="Time at the end of the operation", help="Once per operation", dataType=FlyDataType.Number, entityType="D", printName="Teardown Time", fieldLength=22)
	TeardownTime,
	//
	@FlyElement(name="TemplateXST", description="Contains the template code itself", help="Here we include the template code itself", dataType=FlyDataType.LongText, entityType="D", printName="TemplateXST", fieldLength=0)
	TemplateXST,
	//
	@FlyElement(name="Tender type", description="Method of Payment", help="The Tender Type indicates the method of payment (ACH or Direct Deposit, Credit Card, Check, Direct Debit)", dataType=FlyDataType.List, entityType="D", printName="Tender type", fieldLength=1)
	TenderType,
	//
	@FlyElement(name="Termination Date", description="Previous Termination Date", help="The Previous Termination Date", dataType=FlyDataType.Date, entityType="EE02", printName="Termination Date", fieldLength=0)
	TerminationDate,
	//
	@FlyElement(name="Test Export Model", dataType=FlyDataType.Button, entityType="EE05", printName="Test Export Model", fieldLength=1)
	TestExportModel,
	//
	@FlyElement(name="Test ID", dataType=FlyDataType.ID, entityType="D", printName="Test ID", fieldLength=22)
	Test_ID,
	//
	@FlyElement(name="Test Import Model", dataType=FlyDataType.Button, entityType="EE05", printName="Test Import Model", fieldLength=1)
	TestImportModel,
	//
	@FlyElement(name="Test Value", description="Value to test", dataType=FlyDataType.NONE, entityType="D", printName="Test Value", fieldLength=0)
	TestValue,
	//
	@FlyElement(name="Tax Expense", description="Account for paid tax you cannot reclaim", help="The Tax Expense Account indicates the account used to record the taxes that have been paid that cannot be reclaimed.", dataType=FlyDataType.Account, entityType="D", printName="Tax Expense", fieldLength=22)
	T_Expense_Acct,
	//
	@FlyElement(name="Description", dataType=FlyDataType.Memo, entityType="D", printName="Description", fieldLength=2000)
	Text,
	//
	@FlyElement(name="Details", dataType=FlyDataType.Text, entityType="D", printName="Details", fieldLength=4000)
	TextDetails,
	//
	@FlyElement(name="Text Message", description="Text Message", dataType=FlyDataType.Text, entityType="D", printName="Message", fieldLength=2000)
	TextMsg,
	//
	@FlyElement(name="Threshold max", description="Maximum gross amount for withholding calculation  (0=no limit)", help="The Threshold maximum indicates the maximum gross amount to be used in the withholding calculation .  A value of 0 indicates there is no limit.", dataType=FlyDataType.Amount, entityType="D", printName="Threshold max", fieldLength=22)
	ThresholdMax,
	//
	@FlyElement(name="Threshold min", description="Minimum gross amount for withholding calculation", help="The Threshold Minimum indicates the minimum gross amount to be used in the withholding calculation.", dataType=FlyDataType.Amount, entityType="D", printName="Threshold min", fieldLength=22)
	Thresholdmin,
	//
	@FlyElement(name="Thumb Image", description="Thumb Image", help="Thumb Image", dataType=FlyDataType.Image, entityType="EE02", printName="Thumb Image", fieldLength=0)
	ThumbImage_ID,
	//
	@FlyElement(name="Ticket Handler Class Name", description="Java Classname for Ticket Handler", help="The Classname identifies the Java classname used by this report or process.", dataType=FlyDataType.String, entityType="D", printName="Ticket Handler Class Name", fieldLength=60)
	TicketClassName,
	//
	@FlyElement(name="Time Fence", description="The Time Fence is the number of days since you execute the MRP process inside of which  the system must not change the planned orders. ", help="The system will generate  action messages warning if some order needs to be modified or created into the time fence.	<p>	The Limit time is used for the master plan products, the number of days is the equal or bigger than the product’s delivery time.	<p>	It is recommended to establish a limit time, so you don’t have a nervous manufacturing system or a systems that reacts to any change or plan modification.", dataType=FlyDataType.Quantity, entityType="EE01", printName="Time Fence", fieldLength=22)
	TimeFence,
	//
	@FlyElement(name="Time Offset", description="Number of time units to offset displayed chart data from the current date.", help="For example an offset of -12 with a chart time unit of Month will result in previous year data being displayed.", dataType=FlyDataType.Integer, entityType="D", printName="Time Offset", fieldLength=10)
	TimeOffset,
	//
	@FlyElement(name="Timeout", description="Is Timeout (In milliseconds) for sending or receive data", dataType=FlyDataType.Integer, entityType="D", printName="Timeout", fieldLength=0)
	Timeout,
	//
	@FlyElement(name="Timeout in Days", description="Timeout in Days to change Status automatically", help="After the number of days of inactivity, the status is changed automatically to the Next Status.  If no Next Status is defined, the status is not changed.", dataType=FlyDataType.Integer, entityType="D", printName="Timeout Days", fieldLength=10)
	TimeoutDays,
	//
	@FlyElement(name="Time Pattern", description="Java Time Pattern", help="Option Time pattern in Java notation. Examples: 'hh:mm:ss aaa z' - 'HH:mm:ss'	If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.String, entityType="D", printName="Time Pattern", fieldLength=20)
	TimePattern,
	//
	@FlyElement(name="Time Scope", description="The number of time units to include the chart result.", dataType=FlyDataType.Integer, entityType="D", printName="Time Scope", fieldLength=10)
	TimeScope,
	//
	@FlyElement(name="Times Dunned", description="Number of times dunned previously", dataType=FlyDataType.Integer, entityType="D", printName="# Dunned", fieldLength=22)
	TimesDunned,
	//
	@FlyElement(name="Slot End", description="Time when timeslot ends", help="Ending time for time slots", dataType=FlyDataType.Time, entityType="D", printName="Slot End", fieldLength=7)
	TimeSlotEnd,
	//
	@FlyElement(name="Slot Start", description="Time when timeslot starts", help="Starting time for time slots", dataType=FlyDataType.Time, entityType="D", printName="Slot Start", fieldLength=7)
	TimeSlotStart,
	//
	@FlyElement(name="Time Unit", description="The unit of time for grouping chart data.", dataType=FlyDataType.List, entityType="D", printName="Time Unit", fieldLength=1)
	TimeUnit,
	//
	@FlyElement(name="Integer", dataType=FlyDataType.Integer, entityType="D", printName="Integer", fieldLength=22)
	T_Integer,
	//
	@FlyElement(name="Title", description="Name this entity is referred to as", help="The Title indicates the name that an entity is referred to as.", dataType=FlyDataType.String, entityType="D", printName="Title", fieldLength=60)
	Title,
	//
	@FlyElement(name="Tax Liability", description="Account for Tax declaration liability", help="The Tax Liability Account indicates the account used to record your tax liability declaration.", dataType=FlyDataType.Account, entityType="D", printName="Tax Liability", fieldLength=22)
	T_Liability_Acct,
	//
	@FlyElement(name="Product", dataType=FlyDataType.Search, entityType="EE01", printName="Product", fieldLength=22)
	TM_Product_ID,
	//
	@FlyElement(name="Temporal MRP & CRP", dataType=FlyDataType.ID, entityType="EE01", printName="Temporal MRP & CRP", fieldLength=10)
	T_MRP_CRP_ID,
	//
	@FlyElement(name="Number", dataType=FlyDataType.Number, entityType="D", printName="Number", fieldLength=22)
	T_Number,
	//
	@FlyElement(name="To be Invoiced", description="If Shipment line is marked as ToBeInvoiced='N' then it is included in the generated Invoice line with price 0.0", dataType=FlyDataType.YesNo, entityType="D", printName="To be Invoiced", fieldLength=1)
	ToBeInvoiced,
	//
	@FlyElement(name="To", description="Receiving Country", help="The To Country indicates the receiving country on a document", dataType=FlyDataType.Table, entityType="D", printName="To", fieldLength=22)
	To_Country_ID,
	//
	@FlyElement(name="TokenType", description="Wiki Token Type", dataType=FlyDataType.List, entityType="D", printName="Token Type", fieldLength=1)
	TokenType,
	//
	@FlyElement(name="Topic Action", dataType=FlyDataType.List, entityType="D", printName="Topic Action", fieldLength=2)
	TopicAction,
	//
	@FlyElement(name="Topic Status", dataType=FlyDataType.List, entityType="D", printName="Topic Status", fieldLength=2)
	TopicStatus,
	//
	@FlyElement(name="To", description="Receiving Region", help="The To Region indicates the receiving region on a document", dataType=FlyDataType.Table, entityType="D", printName="To", fieldLength=22)
	To_Region_ID,
	//
	@FlyElement(name="Total Amount", description="Total Amount", help="The Total Amount indicates the total document amount.", dataType=FlyDataType.Amount, entityType="D", printName="Total Amt", fieldLength=22)
	TotalAmt,
	//
	@FlyElement(name="Total Credit", description="Total Credit in document currency", help="The Total Credit indicates the total credit amount for a journal or journal batch in the source currency", dataType=FlyDataType.Amount, entityType="D", printName="Total Credit", fieldLength=22)
	TotalCr,
	//
	@FlyElement(name="Total Debit", description="Total debit in document currency", help="The Total Debit indicates the total debit amount for a journal or journal batch in the source currency", dataType=FlyDataType.Amount, entityType="D", printName="Total Debit", fieldLength=22)
	TotalDr,
	//
	@FlyElement(name="Total Invoice Amount", description="Cumulative total lifetime invoice amount", help="The cumulative total lifetime invoice amount is used to calculate the total average price", dataType=FlyDataType.Amount, entityType="D", printName="Total Invoice Amount", fieldLength=22)
	TotalInvAmt,
	//
	@FlyElement(name="Total Invoice Cost", description="Total lifetime invoice costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="Total Invoice Cost", fieldLength=22)
	TotalInvCost,
	//
	@FlyElement(name="Total Invoice Quantity", description="Cumulative total lifetime invoice quantity", help="The cumulative total lifetime invoice quantity is used to calculate the total average price", dataType=FlyDataType.Quantity, entityType="D", printName="Total Invoice Quantity", fieldLength=22)
	TotalInvQty,
	//
	@FlyElement(name="Total of Leaves", description="Total of Leaves", help="The Total of Leaves of an Employee", dataType=FlyDataType.Number, entityType="EE02", printName="Total of Leaves", fieldLength=0)
	TotalLeaves,
	//
	@FlyElement(name="Total Lines", description="Total of all document lines", help="The Total amount displays the total of all lines in document currency", dataType=FlyDataType.Amount, entityType="D", printName="Total Lines", fieldLength=22)
	TotalLines,
	//
	@FlyElement(name="Open Balance", description="Total Open Balance Amount in primary Accounting Currency", help="The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amount is used for Credit Management.	Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).", dataType=FlyDataType.Amount, entityType="D", printName="Open Balance", fieldLength=22)
	TotalOpenBalance,
	//
	@FlyElement(name="Total Quantity", description="Total Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Total Qty", fieldLength=22)
	TotalQty,
	//
	@FlyElement(name="Total Relevant Experience", description="Total Relevant Experience", help="The Total Relevant Experience of a Job Application", dataType=FlyDataType.String, entityType="EE02", printName="Total Relevant Experience", fieldLength=0)
	TotalRelevantExperience,
	//
	@FlyElement(name="Qty", dataType=FlyDataType.Quantity, entityType="D", printName="Qty", fieldLength=22)
	T_Qty,
	//
	@FlyElement(name="Tracking Info", dataType=FlyDataType.String, entityType="D", printName="Tracking Info", fieldLength=255)
	TrackingInfo,
	//
	@FlyElement(name="Tracking No", description="Number to track the shipment", dataType=FlyDataType.String, entityType="D", printName="Tracking No", fieldLength=60)
	TrackingNo,
	//
	@FlyElement(name="Tracking URL", description="URL of the shipper to track shipments", help="The variable @TrackingNo@ in the URL is replaced by the actual tracking number of the shipment.", dataType=FlyDataType.URL, entityType="D", printName="Tracking URL", fieldLength=120)
	TrackingURL,
	//
	@FlyElement(name="Transaction Code", description="The transaction code represents the search definition", dataType=FlyDataType.String, entityType="D", printName="Transaction Code", fieldLength=8)
	TransactionCode,
	//
	@FlyElement(name="Bank for transfers", description="Bank account depending on currency will be used from this bank for doing transfers", dataType=FlyDataType.Table, entityType="D", printName="Bank for transfers", fieldLength=22)
	TransferBank_ID,
	//
	@FlyElement(name="CashBook for transfers", dataType=FlyDataType.Table, entityType="D", printName="CashBook for transfers", fieldLength=22)
	TransferCashBook_ID,
	//
	@FlyElement(name="Transfer Time", description="Transfer Time", help="Indicates the number of days the product needs to be moved from one warehouse to another.", dataType=FlyDataType.Quantity, entityType="EE01", printName="Transfer Time", fieldLength=10)
	TransferTime,
	//
	@FlyElement(name="Transition Code", description="Code resulting in TRUE of FALSE", help="The transition is executed, if the code results in TRUE (or is empty)", dataType=FlyDataType.Text, entityType="D", printName="Transition Code", fieldLength=2000)
	TransitionCode,
	//
	@FlyElement(name="Transport Height", dataType=FlyDataType.Number, entityType="EE03", printName="Transport Height", fieldLength=0)
	TransportHeight,
	//
	@FlyElement(name="Transport Length", dataType=FlyDataType.Number, entityType="EE03", printName="Transport Length", fieldLength=0)
	TransportLength,
	//
	@FlyElement(name="License Type", dataType=FlyDataType.List, entityType="EE03", printName="License Type", fieldLength=0)
	TransportLicenseType,
	//
	@FlyElement(name="Transport Mode", description="The modes of transport supported", dataType=FlyDataType.List, entityType="EE03", printName="Transport Mode", fieldLength=0)
	TransportMode,
	//
	@FlyElement(name="Transport Physical Type", description="The system divides the physical type of the transport unit into a part that carries the load, a mover, and other load bearing elements", dataType=FlyDataType.List, entityType="EE03", printName="Transport Physical Type", fieldLength=0)
	TransportPhysicalType,
	//
	@FlyElement(name="Transport Status", description="Transport unit status", dataType=FlyDataType.List, entityType="EE03", printName="Transport Status", fieldLength=0)
	TransportStatus,
	//
	@FlyElement(name="Transport Width", dataType=FlyDataType.Number, entityType="EE03", printName="Transport Width", fieldLength=0)
	TransportWidth,
	//
	@FlyElement(name="Tax Receivables", description="Account for Tax credit after tax declaration", help="The Tax Receivables Account indicates the account used to record the tax credit amount after your tax declaration.", dataType=FlyDataType.Account, entityType="D", printName="Tax Receivables", fieldLength=22)
	T_Receivables_Acct,
	//
	@FlyElement(name="Type | Area", description="Element this tree is built on (i.e Product, Business Partner)", help="The Tree Type / Area field determines the type of tree this is.  For example, you may define one tree for your Products and another tree for your Business Partners.", dataType=FlyDataType.List, entityType="D", printName="Type | Area", fieldLength=2)
	TreeType,
	//
	@FlyElement(name="T_ReplenishPlan ID", dataType=FlyDataType.NONE, entityType="D", printName="T_ReplenishPlan ID", fieldLength=10)
	T_ReplenishPlan_ID,
	//
	@FlyElement(name="Transaction Amount", description="Amount of a transaction", help="The Transaction Amount indicates the amount for a single transaction.", dataType=FlyDataType.Amount, entityType="D", printName="Transaction Amt", fieldLength=22)
	TrxAmt,
	//
	@FlyElement(name="Transaction", description="Name of the transaction", help="Internal name of the transaction", dataType=FlyDataType.String, entityType="D", printName="Trx Name", fieldLength=60)
	TrxName,
	//
	@FlyElement(name="Transaction received", dataType=FlyDataType.DateTime, entityType="D", printName="Trx received", fieldLength=7)
	TrxReceived,
	//
	@FlyElement(name="Transaction sent", dataType=FlyDataType.DateTime, entityType="D", printName="Trx sent", fieldLength=7)
	TrxSent,
	//
	@FlyElement(name="Transaction Type", description="Type of credit card transaction", help="The Transaction Type indicates the type of transaction to be submitted to the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="Trx Type", fieldLength=1)
	TrxType,
	//
	@FlyElement(name="Type", description="Type of Validation (SQL, Java Script, Java Language)", help="The Type indicates the type of validation that will occur.  This can be SQL, Java Script or Java Language.", dataType=FlyDataType.List, entityType="D", printName="Type", fieldLength=1)
	Type,
	//
	@FlyElement(name="MRP Type", description="MRP Type determines whether a record is demand or supply", dataType=FlyDataType.List, entityType="D", printName="MRP Type", fieldLength=1)
	TypeMRP,
	//
	@FlyElement(name="Black List Cheque", dataType=FlyDataType.ID, entityType="D", printName="Black List Cheque", fieldLength=22)
	U_BlackListCheque_ID,
	//
	@FlyElement(name="Key", dataType=FlyDataType.String, entityType="D", printName="Key", fieldLength=240)
	U_Key,
	//
	@FlyElement(name="Unapplied Payments", dataType=FlyDataType.NONE, entityType="D", printName="Unapplied Payments", fieldLength=0)
	UnappliedPayments,
	//
	@FlyElement(name="Unconfirmed Lines No To Ship", description="Number unconfirmed of shipment lines waiting for confirmation", dataType=FlyDataType.NONE, entityType="D", printName="Unconfirmed Lines No To Ship", fieldLength=0)
	unconfirmedLinesNoToShip,
	//
	@FlyElement(name="Underline Stroke Type", dataType=FlyDataType.List, entityType="D", printName="Underline Stroke Type", fieldLength=5)
	UnderlineStrokeType,
	//
	@FlyElement(name="Undo", dataType=FlyDataType.Button, entityType="D", printName="Undo", fieldLength=1)
	Undo,
	//
	@FlyElement(name="Unearned Revenue", description="Account for unearned revenue", help="The Unearned Revenue indicates the account used for recording invoices sent for products or services not yet delivered.  It is used in revenue recognition", dataType=FlyDataType.Account, entityType="D", printName="Unearned Revenue", fieldLength=22)
	UnEarnedRevenue_Acct,
	//
	@FlyElement(name="Uninstall", dataType=FlyDataType.YesNo, entityType="D", printName="Uninstall", fieldLength=1)
	Uninstall,
	//
	@FlyElement(name="Runtime per Unit", description="Time to produce one unit", dataType=FlyDataType.Number, entityType="D", printName="Unit Runtine", fieldLength=22)
	UnitRuntime,
	//
	@FlyElement(name="Units by Cycles", description="The Units by Cycles are defined for process type  Flow Repetitive Dedicated and  indicated the product to be manufactured on a production line for duration unit.", help="When Units by Cycles are defined the duration time is the total of time to manufactured the units", dataType=FlyDataType.Number, entityType="EE01", printName="Units by Cycles", fieldLength=14)
	UnitsCycles,
	//
	@FlyElement(name="UnitsPerPack", description="The Units Per Pack indicates the no of units of a product packed together.", dataType=FlyDataType.Integer, entityType="D", printName="UnitsPerPack", fieldLength=14)
	UnitsPerPack,
	//
	@FlyElement(name="Units Per Pallet", description="Units Per Pallet", help="The Units per Pallet indicates the number of units of this product which fit on a pallet.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Units Per Pallet", fieldLength=22)
	UnitsPerPallet,
	//
	@FlyElement(name="Unix Archive Path", dataType=FlyDataType.String, entityType="D", printName="Unix Archive Path", fieldLength=255)
	UnixArchivePath,
	//
	@FlyElement(name="Unix Attachment Path", dataType=FlyDataType.String, entityType="D", printName="Unix Attachment Path", fieldLength=255)
	UnixAttachmentPath,
	//
	@FlyElement(name="Unladen Weight", dataType=FlyDataType.Number, entityType="EE03", printName="Unladen Weight", fieldLength=0)
	UnladenWeight,
	//
	@FlyElement(name="UnlockingTime", description="Time at which the terminal should be unlocked", dataType=FlyDataType.DateTime, entityType="D", printName="UnlockingTime", fieldLength=7)
	UnlockingTime,
	//
	@FlyElement(name="Unrealized Gain Acct", description="Unrealized Gain Account for currency revaluation", help="The Unrealized Gain Account indicates the account to be used when recording gains achieved from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="Unrealized Gain Acct", fieldLength=22)
	UnrealizedGain_Acct,
	//
	@FlyElement(name="Unrealized Loss Acct", description="Unrealized Loss Account for currency revaluation", help="The Unrealized Loss Account indicates the account to be used when recording losses incurred from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="Unrealized Loss Acct", fieldLength=22)
	UnrealizedLoss_Acct,
	//
	@FlyElement(name="Symbol", description="Symbol for a Unit of Measure", help="The Symbol identifies the Symbol to be displayed and printed for a Unit of Measure", dataType=FlyDataType.String, entityType="D", printName="UoM", fieldLength=10)
	UOMSymbol,
	//
	@FlyElement(name="UOM Type", dataType=FlyDataType.List, entityType="D", printName="UOM Type", fieldLength=2)
	UOMType,
	//
	@FlyElement(name="UPC/EAN", description="Bar Code (Universal Product Code or its superset European Article Number)", help="Use this field to enter the bar code for the product in any of the bar code symbologies (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN, ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode) ", dataType=FlyDataType.String, entityType="D", printName="UPC/EAN", fieldLength=30)
	UPC,
	//
	@FlyElement(name="Update Balances", description="Update Accounting Balances first (not required for subsequent runs)", dataType=FlyDataType.NONE, entityType="D", printName="UpdateBalances", fieldLength=0)
	UpdateBalances,
	//
	@FlyElement(name="Updated", description="Date this record was updated", help="The Updated field indicates the date that this record was updated.", dataType=FlyDataType.DateTime, entityType="D", printName="Updated", fieldLength=7)
	Updated,
	//
	@FlyElement(name="Updated By", description="User who updated this records", help="The Updated By field indicates the user who updated this record.", dataType=FlyDataType.Table, entityType="D", printName="Updated By", fieldLength=22)
	UpdatedBy,
	//
	@FlyElement(name="Updated By Issue", dataType=FlyDataType.Table, entityType="EE01", printName="Updated By Issue", fieldLength=22)
	UpdatedByIssue,
	//
	@FlyElement(name="UpdatedDate", dataType=FlyDataType.String, entityType="D", printName="UpdatedDate", fieldLength=50)
	UpdatedDate,
	//
	@FlyElement(name="Update Default Accounts", description="Update Default Accounts", dataType=FlyDataType.NONE, entityType="D", printName="Update Default Accounts", fieldLength=0)
	UpdateDefaultAccounts,
	//
	@FlyElement(name="Update Quantities", dataType=FlyDataType.Button, entityType="D", printName="Update Quantities", fieldLength=1)
	UpdateQty,
	//
	@FlyElement(name="Update Quantity Count", dataType=FlyDataType.NONE, entityType="D", printName="UpdateQtyCount", fieldLength=0)
	UpdateQtyCount,
	//
	@FlyElement(name="Update Status", description="Automatically change the status after entry from web", help="Change the status automatically after the entry was changed via the Web", dataType=FlyDataType.Table, entityType="D", printName="Update Status", fieldLength=10)
	Update_Status_ID,
	//
	@FlyElement(name="POS Terminal", dataType=FlyDataType.ID, entityType="D", printName="POS Terminal", fieldLength=22)
	U_POSTerminal_ID,
	//
	@FlyElement(name="URL", description="Full URL address - e.g. http://www.adempiere.org", help="The URL defines an fully qualified web address like http://www.adempiere.org", dataType=FlyDataType.URL, entityType="D", printName="URL", fieldLength=120)
	URL,
	//
	@FlyElement(name="Role Menu", dataType=FlyDataType.ID, entityType="D", printName="Role Menu", fieldLength=22)
	U_RoleMenu_ID,
	//
	@FlyElement(name="Usage Variance", dataType=FlyDataType.CostsPrices, entityType="EE01", printName="Usage Variance", fieldLength=0)
	UsageVariance,
	//
	@FlyElement(name="Use Currency Balancing", dataType=FlyDataType.YesNo, entityType="D", printName="Use Currency Balancing", fieldLength=1)
	UseCurrencyBalancing,
	//
	@FlyElement(name="UseDate", dataType=FlyDataType.Date, entityType="D", printName="UseDate", fieldLength=7)
	UseDate,
	//
	@FlyElement(name="Used Leaves", description="Used Leaves", help="The Used Leaves of an Employee", dataType=FlyDataType.Number, entityType="EE02", printName="Used Leaves", fieldLength=0)
	UsedLeaves,
	//
	@FlyElement(name="Usable Life - Months", description="Months of the usable life of the asset", dataType=FlyDataType.Integer, entityType="D", printName="Usable life months", fieldLength=22)
	UseLifeMonths,
	//
	@FlyElement(name="Use Life - Months (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Use Life - Months (fiscal)", fieldLength=0)
	UseLifeMonths_F,
	//
	@FlyElement(name="Usable Life - Years", description="Years of the usable life of the asset", dataType=FlyDataType.Integer, entityType="D", printName="Usable life years", fieldLength=22)
	UseLifeYears,
	//
	@FlyElement(name="Use Life - Years (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Use Life - Years (fiscal)", fieldLength=0)
	UseLifeYears_F,
	//
	@FlyElement(name="User List 1", description="User defined list element #1", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User 1", fieldLength=22)
	User1_ID,
	//
	@FlyElement(name="User List 2", description="User defined list element #2", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User 2", fieldLength=22)
	User2_ID,
	//
	@FlyElement(name="User List 3", description="User defined list element #3", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User 3", fieldLength=22)
	User3_ID,
	//
	@FlyElement(name="User List 4", description="User defined list element #4", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User 4", fieldLength=22)
	User4_ID,
	//
	@FlyElement(name="User Agent", description="Browser Used", dataType=FlyDataType.String, entityType="D", printName="User Agent", fieldLength=255)
	UserAgent,
	//
	@FlyElement(name="UserDiscount", dataType=FlyDataType.Number, entityType="D", printName="UserDiscount", fieldLength=22)
	UserDiscount,
	//
	@FlyElement(name="User Element 1", description="User defined accounting Element", help="A user defined accounting element refers to a Adempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task).  Note that User Elements are optional and are populated from the context of the document (i.e. not requested)", dataType=FlyDataType.ID, entityType="D", printName="User Element 1", fieldLength=10)
	UserElement1_ID,
	//
	@FlyElement(name="User Element 2", description="User defined accounting Element", help="A user defined accounting element refers to a Adempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task).  Note that User Elements are optional and are populated from the context of the document (i.e. not requested)", dataType=FlyDataType.ID, entityType="D", printName="User Element 2", fieldLength=10)
	UserElement2_ID,
	//
	@FlyElement(name="User Element Value 1", description="User Element Value 1 defined accounting Element", help="A user defined accounting element refers to a Adempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task).  Note that User Elements are optional and are populated from the context of the document (i.e. not requested)", dataType=FlyDataType.String, entityType="D", printName="User Element Value 1", fieldLength=40)
	UserElementValue1,
	//
	@FlyElement(name="User Element Value 2", description="User Element Value 2 defined accounting Element", help="A user defined accounting element refers to a Adempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task).  Note that User Elements are optional and are populated from the context of the document (i.e. not requested)", dataType=FlyDataType.String, entityType="D", printName="User Element Value 2", fieldLength=40)
	UserElementValue2,
	//
	@FlyElement(name="User ID", description="User ID or account number", help="The User ID identifies a user and allows access to records or processes.", dataType=FlyDataType.String, entityType="D", printName="User ID", fieldLength=60)
	UserID,
	//
	@FlyElement(name="User Level", description="System Client Organization", help="The User Level field determines if users of this Role will have access to System level data, Organization level data, Client level data or Client and Organization level data.", dataType=FlyDataType.List, entityType="D", printName="User Level", fieldLength=3)
	UserLevel,
	//
	@FlyElement(name="Registered EMail", description="Email of the responsible for the System", help="Email of the responsible person for the system (registered in WebStore)", dataType=FlyDataType.String, entityType="D", printName="Registered EMail", fieldLength=60)
	UserName,
	//
	@FlyElement(name="User PIN", dataType=FlyDataType.String, entityType="D", printName="User PIN", fieldLength=20)
	UserPIN,
	//
	@FlyElement(name="User List Value 1", description="User value defined list element #1", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.String, entityType="D", printName="User List Value 1", fieldLength=40)
	UserValue1,
	//
	@FlyElement(name="User List Value 2", description="User value defined list element #2", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.String, entityType="D", printName="User List Value 2", fieldLength=40)
	UserValue2,
	//
	@FlyElement(name="User List Value 3", description="User value defined list element #3", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.String, entityType="D", printName="User List Value 3", fieldLength=40)
	UserValue3,
	//
	@FlyElement(name="User List Value 4", description="User value defined list element #3", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.String, entityType="D", printName="User List Value 4", fieldLength=40)
	UserValue4,
	//
	@FlyElement(name="Use Suspense Balancing", dataType=FlyDataType.YesNo, entityType="D", printName="Use Suspense Balancing", fieldLength=1)
	UseSuspenseBalancing,
	//
	@FlyElement(name="Use Suspense Error", dataType=FlyDataType.YesNo, entityType="D", printName="Use Suspense Error", fieldLength=1)
	UseSuspenseError,
	//
	@FlyElement(name="Use units", description="Currently used units of the assets", dataType=FlyDataType.Integer, entityType="D", printName="Use units", fieldLength=22)
	UseUnits,
	//
	@FlyElement(name="Immutable Universally Unique Identifier", description="Immutable Universally Unique Identifier", help="'A surrogate key in a database is a unique identifier for either an entity in the modeled world or an object in the database. The surrogate key is not derived from application data, unlike a natural (or business) key which is derived from application data. ' , According to Wikipedia http://en.wikipedia.org/wiki/Surrogate_key", dataType=FlyDataType.NONE, entityType="D", printName="UUID", fieldLength=0)
	UUID,
	//
	@FlyElement(name="Value", dataType=FlyDataType.String, entityType="D", printName="Value", fieldLength=240)
	U_Value,
	//
	@FlyElement(name="Web Menu", dataType=FlyDataType.TableDirect, entityType="D", printName="Web Menu", fieldLength=10)
	U_WebMenu_ID,
	//
	@FlyElement(name="Web Properties", dataType=FlyDataType.ID, entityType="D", printName="Web Properties", fieldLength=22)
	U_Web_Properties_ID,
	//
	@FlyElement(name="Validate Workflow", dataType=FlyDataType.Button, entityType="D", printName="Validateworkflow", fieldLength=1)
	ValidateWorkflow,
	//
	@FlyElement(name="Validation type", description="Different method of validating data", help="The Validation Type indicates the validation method to use.  These include list, table or data type validation.", dataType=FlyDataType.List, entityType="D", printName="Validation type", fieldLength=1)
	ValidationType,
	//
	@FlyElement(name="Valid from", description="Valid from including this date (first day)", help="The Valid From date indicates the first day of a date range", dataType=FlyDataType.Date, entityType="D", printName="Valid from", fieldLength=7)
	ValidFrom,
	//
	@FlyElement(name="Valid to", description="Valid to including this date (last day)", help="The Valid To date indicates the last day of a date range", dataType=FlyDataType.Date, entityType="D", printName="Valid to", fieldLength=7)
	ValidTo,
	//
	@FlyElement(name="Search Key", description="Search key for the record in the format required - must be unique", help="A search key allows you a fast method of finding a particular record.	If you leave the search key empty, the system automatically creates a numeric number.  The document sequence used for this fallback number is defined in the 'Maintain Sequence' window with the name 'DocumentNo_<TableName>', where TableName is the actual name of the table (e.g. C_Order).", dataType=FlyDataType.String, entityType="D", printName="Search Key", fieldLength=60)
	Value,
	//
	@FlyElement(name="Value To", description="Value To", dataType=FlyDataType.String, entityType="D", printName="Value To", fieldLength=40)
	Value2,
	//
	@FlyElement(name="Value Column", description="Fully qualified data value column", help="The Value Column contains the value data for the chart", dataType=FlyDataType.String, entityType="D", printName="Value Column", fieldLength=60)
	ValueColumn,
	//
	@FlyElement(name="Max. Value", description="Maximum Value for a field", help="The Maximum Value indicates the highest allowable value for a field", dataType=FlyDataType.String, entityType="D", printName="Max. Value", fieldLength=20)
	ValueMax,
	//
	@FlyElement(name="Min. Value", description="Minimum Value for a field", help="The Minimum Value indicates the lowest  allowable value for a field.", dataType=FlyDataType.String, entityType="D", printName="Min. Value", fieldLength=20)
	ValueMin,
	//
	@FlyElement(name="Value", description="Numeric Value", dataType=FlyDataType.Number, entityType="D", printName="Value", fieldLength=22)
	ValueNumber,
	//
	@FlyElement(name="Effective date", description="Date when money is available", help="The Effective Date indicates the date that money is available from the bank.", dataType=FlyDataType.Date, entityType="D", printName="Effective date", fieldLength=7)
	ValutaDate,
	//
	@FlyElement(name="Date", dataType=FlyDataType.Date, entityType="D", printName="Date", fieldLength=7)
	V_Date,
	//
	@FlyElement(name="Vehicle Status", dataType=FlyDataType.List, entityType="EE03", printName="Vehicle Status", fieldLength=0)
	VehicleStatus,
	//
	@FlyElement(name="Vehicle Type", description="Vehicle Type defines the mode of transport", dataType=FlyDataType.List, entityType="EE03", printName="Vehicle Type", fieldLength=0)
	VehicleType,
	//
	@FlyElement(name="Partner Category", description="Product Category of the Business Partner", help="The Business Partner Category identifies the category used by the Business Partner for this product.", dataType=FlyDataType.String, entityType="D", printName="BPartner Category", fieldLength=30)
	VendorCategory,
	//
	@FlyElement(name="Vendor ID", description="Vendor ID for the Payment Processor", dataType=FlyDataType.String, entityType="D", printName="Vendor ID", fieldLength=60)
	VendorID,
	//
	@FlyElement(name="Vendor", description="The Vendor of the product/service", dataType=FlyDataType.Table, entityType="D", printName="Vendor", fieldLength=22)
	Vendor_ID,
	//
	@FlyElement(name="Vendor Open Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Vendor Open Invoices", fieldLength=0)
	VendorOpenInvoices,
	//
	@FlyElement(name="Partner Product Key", description="Product Key of the Business Partner", help="The Business Partner Product Key identifies the number used by the Business Partner for this product. It can be printed on orders and invoices when you include the Product Key in the print format.", dataType=FlyDataType.String, entityType="D", printName="BPartner Product Key", fieldLength=40)
	VendorProductNo,
	//
	@FlyElement(name="Version", description="Version of the table definition", help="The Version indicates the version of this table definition.", dataType=FlyDataType.Amount, entityType="D", printName="Version", fieldLength=22)
	Version,
	//
	@FlyElement(name="Version No", description="Version Number", dataType=FlyDataType.String, entityType="D", printName="Version No", fieldLength=20)
	VersionNo,
	//
	@FlyElement(name="Value Format", description="Format of the value; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>Validation elements:</B>	 	(Space) any character	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters & Digits NO space	A	any Letters & Digits NO space converted to upper case	c	any Letters & Digits or space	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="Value Format", fieldLength=60)
	VFormat,
	//
	@FlyElement(name="Vendor Liability", description="Account for Vendor Liability", help="The Vendor Liability account indicates the account used for recording transactions for vendor liabilities", dataType=FlyDataType.Account, entityType="D", printName="Vendor Liability", fieldLength=22)
	V_Liability_Acct,
	//
	@FlyElement(name="Vendor Service Liability", description="Account for Vendor Service Liability", help="The Vendor Service Liability account indicates the account to use for recording service liabilities.  It is used if you need to distinguish between Liability for products and services. This account is only used, if posting to service accounts is enabled in the accounting schema.", dataType=FlyDataType.Account, entityType="D", printName="Vendor Service Liability", fieldLength=22)
	V_Liability_Services_Acct,
	//
	@FlyElement(name="Number", dataType=FlyDataType.String, entityType="D", printName="Number", fieldLength=22)
	V_Number,
	//
	@FlyElement(name="Voice authorization code", description="Voice Authorization Code from credit card company", help="The Voice Authorization Code indicates the code received from the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="Voice authorization code", fieldLength=20)
	VoiceAuthCode,
	//
	@FlyElement(name="Volume", description="Volume of a product", help="The Volume indicates the volume of the product in the Volume UOM of the Client", dataType=FlyDataType.Amount, entityType="D", printName="Volume", fieldLength=22)
	Volume,
	//
	@FlyElement(name="Volume Unit of Measure", dataType=FlyDataType.Table, entityType="EE03", printName="Volume Unit of Measure", fieldLength=0)
	Volume_UOM_ID,
	//
	@FlyElement(name="Vendor Prepayment", description="Account for Vendor Prepayments", help="The Vendor Prepayment Account indicates the account used to record prepayments from a vendor.", dataType=FlyDataType.Account, entityType="D", printName="Vendor Prepayment", fieldLength=22)
	V_Prepayment_Acct,
	//
	@FlyElement(name="String", dataType=FlyDataType.String, entityType="D", printName="String", fieldLength=2000)
	V_String,
	//
	@FlyElement(name="Advertisement", description="Web Advertisement", help="Advertisement on the Web", dataType=FlyDataType.ID, entityType="D", printName="Advertisement", fieldLength=22)
	W_Advertisement_ID,
	//
	@FlyElement(name="Wage Level", description="Wage Level", dataType=FlyDataType.List, entityType="EE02", printName="Wage Level", fieldLength=0)
	WageLevel,
	//
	@FlyElement(name="Waiting Time", description="Workflow Simulation Waiting time", help="Amount of time needed to prepare the performance of the task on Duration Units", dataType=FlyDataType.Integer, entityType="D", printName="Waiting Time", fieldLength=22)
	WaitingTime,
	//
	@FlyElement(name="Wait Time", description="Time in minutes to wait (sleep)", help="Time in minutes to be suspended (sleep)", dataType=FlyDataType.Integer, entityType="D", printName="Wait Time", fieldLength=22)
	WaitTime,
	//
	@FlyElement(name="Warehouse Address", description="Warehouse Location/Address", help="Address of Warehouse", dataType=FlyDataType.Location, entityType="D", printName="Warehouse Address", fieldLength=22)
	Warehouse_Location_ID,
	//
	@FlyElement(name="Warehouse", description="Warehouse Name", dataType=FlyDataType.String, entityType="D", printName="Warehouse", fieldLength=60)
	WarehouseName,
	//
	@FlyElement(name="Warehouse Key", description="Key of the Warehouse", help="Key to identify the Warehouse", dataType=FlyDataType.String, entityType="D", printName="Warehouse Key", fieldLength=40)
	WarehouseValue,
	//
	@FlyElement(name="Basket", description="Web Basket", help="Temporary Web Basket", dataType=FlyDataType.ID, entityType="D", printName="Basket", fieldLength=22)
	W_Basket_ID,
	//
	@FlyElement(name="Basket Line", description="Web Basket Line", help="Temporary Web Basket Line", dataType=FlyDataType.ID, entityType="D", printName="Basket Line", fieldLength=22)
	W_BasketLine_ID,
	//
	@FlyElement(name="Click Count", description="Web Click Management", help="Web Click Management", dataType=FlyDataType.TableDirect, entityType="D", printName="Click Ccount", fieldLength=22)
	W_ClickCount_ID,
	//
	@FlyElement(name="Web Click", description="Individual Web Click", help="Web Click Details", dataType=FlyDataType.ID, entityType="D", printName="Web Click", fieldLength=22)
	W_Click_ID,
	//
	@FlyElement(name="Counter Count", description="Web Counter Count Management", help="Web Counter Information", dataType=FlyDataType.ID, entityType="D", printName="Counter Count", fieldLength=22)
	W_CounterCount_ID,
	//
	@FlyElement(name="Web Counter", description="Individual Count hit", help="Web Counter Details", dataType=FlyDataType.ID, entityType="D", printName="Web Counter", fieldLength=22)
	W_Counter_ID,
	//
	@FlyElement(name="Warehouse Differences", description="Warehouse Differences Account", help="The Warehouse Differences Account indicates the account used recording differences identified during inventory counts.", dataType=FlyDataType.Account, entityType="D", printName="Warehouse Differences", fieldLength=22)
	W_Differences_Acct,
	//
	@FlyElement(name="Web Context", description="Web Server Context - e.g. /wstore", help="Unique Web Server Context for this Web Store - will set context-root in application.xml.	The web context usually starts with / and needs to be a valid context name (not checked).", dataType=FlyDataType.String, entityType="D", printName="Web Context", fieldLength=20)
	WebContext,
	//
	@FlyElement(name="Web Store Info", description="Web Store Header Information", help="Display HTML Info in the Web Store - by default in the header.	", dataType=FlyDataType.Text, entityType="D", printName="Web Info", fieldLength=2000)
	WebInfo,
	//
	@FlyElement(name="Web Order EMail", description="EMail address to receive notifications when web orders were processed", help="When processing a web order, a confirmation is sent to the EMail address of the customer from the request EMail address copying this email address when entered.", dataType=FlyDataType.String, entityType="D", printName="Web Order EMail", fieldLength=60)
	WebOrderEMail,
	//
	@FlyElement(name="Web Parameter 1", description="Web Site Parameter 1 (default: header image)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam1 - By default, it is positioned on the upper left side with 130 pixel width.", dataType=FlyDataType.String, entityType="D", printName="WebParam1", fieldLength=2000)
	WebParam1,
	//
	@FlyElement(name="Web Parameter 2", description="Web Site Parameter 2 (default index page)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam2 - By default, it is positioned after the header on the web store index page.", dataType=FlyDataType.String, entityType="D", printName="WebParam2", fieldLength=2000)
	WebParam2,
	//
	@FlyElement(name="Web Parameter 3", description="Web Site Parameter 3 (default left - menu)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam3 - By default, it is positioned at the end in the menu column with 130 pixel width.", dataType=FlyDataType.String, entityType="D", printName="WebParam3", fieldLength=2000)
	WebParam3,
	//
	@FlyElement(name="Web Parameter 4", description="Web Site Parameter 4 (default footer left)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam4 - By default, it is positioned on the left side of the footer with 130 pixel width.", dataType=FlyDataType.String, entityType="D", printName="WebParam 4", fieldLength=2000)
	WebParam4,
	//
	@FlyElement(name="Web Parameter 5", description="Web Site Parameter 5 (default footer center)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam5 - By default, it is positioned in the center of the footer.", dataType=FlyDataType.Text, entityType="D", printName="Web Param 5", fieldLength=2000)
	WebParam5,
	//
	@FlyElement(name="Web Parameter 6", description="Web Site Parameter 6 (default footer right)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam6 - By default, it is positioned on the right side of the footer.", dataType=FlyDataType.Text, entityType="D", printName="Web Parm 6", fieldLength=2000)
	WebParam6,
	//
	@FlyElement(name="Web Session", description="Web Session ID", dataType=FlyDataType.String, entityType="D", printName="Web Session", fieldLength=40)
	WebSession,
	//
	@FlyElement(name="Week1", dataType=FlyDataType.Quantity, entityType="D", printName="Week1", fieldLength=10)
	Week1,
	//
	@FlyElement(name="Week10", dataType=FlyDataType.Quantity, entityType="D", printName="Week10", fieldLength=10)
	Week10,
	//
	@FlyElement(name="Week11", dataType=FlyDataType.Quantity, entityType="D", printName="Week11", fieldLength=10)
	Week11,
	//
	@FlyElement(name="Week12", dataType=FlyDataType.Quantity, entityType="D", printName="Week12", fieldLength=10)
	Week12,
	//
	@FlyElement(name="Week13", dataType=FlyDataType.Quantity, entityType="D", printName="Week13", fieldLength=10)
	Week13,
	//
	@FlyElement(name="Week14", dataType=FlyDataType.Quantity, entityType="D", printName="Week14", fieldLength=10)
	Week14,
	//
	@FlyElement(name="Week15", dataType=FlyDataType.Quantity, entityType="D", printName="Week15", fieldLength=10)
	Week15,
	//
	@FlyElement(name="Week16", dataType=FlyDataType.Quantity, entityType="D", printName="Week16", fieldLength=10)
	Week16,
	//
	@FlyElement(name="Week17", dataType=FlyDataType.Quantity, entityType="D", printName="Week17", fieldLength=10)
	Week17,
	//
	@FlyElement(name="Week18", dataType=FlyDataType.Quantity, entityType="D", printName="Week18", fieldLength=10)
	Week18,
	//
	@FlyElement(name="Week19", dataType=FlyDataType.Quantity, entityType="D", printName="Week19", fieldLength=10)
	Week19,
	//
	@FlyElement(name="Week2", dataType=FlyDataType.Quantity, entityType="D", printName="Week2", fieldLength=10)
	Week2,
	//
	@FlyElement(name="Week20", dataType=FlyDataType.Quantity, entityType="D", printName="Week20", fieldLength=10)
	Week20,
	//
	@FlyElement(name="Week21", dataType=FlyDataType.Quantity, entityType="D", printName="Week21", fieldLength=10)
	Week21,
	//
	@FlyElement(name="Week22", dataType=FlyDataType.Quantity, entityType="D", printName="Week22", fieldLength=10)
	Week22,
	//
	@FlyElement(name="Week23", dataType=FlyDataType.Quantity, entityType="D", printName="Week23", fieldLength=10)
	Week23,
	//
	@FlyElement(name="Week24", dataType=FlyDataType.Quantity, entityType="D", printName="Week24", fieldLength=10)
	Week24,
	//
	@FlyElement(name="Week3", dataType=FlyDataType.Quantity, entityType="D", printName="Week3", fieldLength=10)
	Week3,
	//
	@FlyElement(name="Week4", dataType=FlyDataType.Quantity, entityType="D", printName="Week4", fieldLength=10)
	Week4,
	//
	@FlyElement(name="Week5", dataType=FlyDataType.Quantity, entityType="D", printName="Week5", fieldLength=10)
	Week5,
	//
	@FlyElement(name="Week6", dataType=FlyDataType.Quantity, entityType="D", printName="Week6", fieldLength=10)
	Week6,
	//
	@FlyElement(name="Week7", dataType=FlyDataType.Quantity, entityType="D", printName="Week7", fieldLength=10)
	Week7,
	//
	@FlyElement(name="Week8", dataType=FlyDataType.Quantity, entityType="D", printName="Week8", fieldLength=10)
	Week8,
	//
	@FlyElement(name="Week9", dataType=FlyDataType.Quantity, entityType="D", printName="Week9", fieldLength=10)
	Week9,
	//
	@FlyElement(name="Day of the Week", description="Day of the Week", dataType=FlyDataType.List, entityType="D", printName="Week Day", fieldLength=1)
	WeekDay,
	//
	@FlyElement(name="Weight", description="Weight of a product", help="The Weight indicates the weight  of the product in the Weight UOM of the Client", dataType=FlyDataType.Amount, entityType="D", printName="Weight", fieldLength=22)
	Weight,
	//
	@FlyElement(name="Weighted Amount", description="The amount adjusted by the probability.", dataType=FlyDataType.NONE, entityType="D", printName="Weighted Amount", fieldLength=0)
	WeightedAmt,
	//
	@FlyElement(name="Weight Unit of Measure", dataType=FlyDataType.Table, entityType="EE03", printName="Weight Unit of Measure", fieldLength=0)
	Weight_UOM_ID,
	//
	@FlyElement(name="WF Processor Name", dataType=FlyDataType.NONE, entityType="EE01", printName="WF Processor Name", fieldLength=0)
	WFProcessorName,
	//
	@FlyElement(name="Workflow State", description="State of the execution of the workflow", dataType=FlyDataType.List, entityType="D", printName="Wf State", fieldLength=2)
	WFState,
	//
	@FlyElement(name="Sql WHERE", description="Fully qualified SQL WHERE clause", help="The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means 'tablename.columnname'.", dataType=FlyDataType.Text, entityType="D", printName="Where clause", fieldLength=2000)
	WhereClause,
	//
	@FlyElement(name="Windows Archive Path", dataType=FlyDataType.String, entityType="D", printName="Windows Archive Path", fieldLength=255)
	WindowsArchivePath,
	//
	@FlyElement(name="Windows Attachment Path", dataType=FlyDataType.String, entityType="D", printName="Windows Attachment Path", fieldLength=255)
	WindowsAttachmentPath,
	//
	@FlyElement(name="WindowType", description="Type or classification of a Window", help="The Window Type indicates the type of window being defined (Maintain, Transaction or Query)", dataType=FlyDataType.List, entityType="D", printName="WindowType", fieldLength=1)
	WindowType,
	//
	@FlyElement(name="Window Height", dataType=FlyDataType.Integer, entityType="D", printName="Win Height", fieldLength=22)
	WinHeight,
	//
	@FlyElement(name="Inventory Adjustment", description="Account for Inventory value adjustments for Actual Costing", help="In actual costing systems, this account is used to post Inventory value adjustments. You could set it to the standard Inventory Asset account.", dataType=FlyDataType.Account, entityType="D", printName="Inventory Adjustment", fieldLength=22)
	W_InvActualAdjust_Acct,
	//
	@FlyElement(name="(Not Used)", description="Warehouse Inventory Asset Account - Currently not used", help="The Warehouse Inventory Asset Account identifies the account used for recording the value of your inventory. This is the counter account for inventory revaluation differences. The Product Asset account maintains the product asset value.", dataType=FlyDataType.Account, entityType="D", printName="(Not Used)", fieldLength=22)
	W_Inventory_Acct,
	//
	@FlyElement(name="Window Width", dataType=FlyDataType.Integer, entityType="D", printName="Win Width", fieldLength=22)
	WinWidth,
	//
	@FlyElement(name="Withholding", description="Account for Withholdings", help="The Withholding Account indicates the account used to record withholdings.", dataType=FlyDataType.Account, entityType="D", printName="Withholding", fieldLength=22)
	Withholding_Acct,
	//
	@FlyElement(name="Mail Message", description="Web Store Mail Message Template", dataType=FlyDataType.ID, entityType="D", printName="Mail Message", fieldLength=10)
	W_MailMsg_ID,
	//
	@FlyElement(name="Warehouse Area", description="Warehouse Area allow grouping the Warehouse Section", dataType=FlyDataType.NONE, entityType="EE03", printName="Warehouse Area", fieldLength=0)
	WM_Area_ID,
	//
	@FlyElement(name="Warehouse Area Type", description="Warehouse Area Type allow grouping the Warehouse Area for Type", dataType=FlyDataType.NONE, entityType="EE01", printName="Warehouse Area Type", fieldLength=0)
	WM_Area_Type_ID,
	//
	@FlyElement(name="Inboud & Outbound Definition", dataType=FlyDataType.NONE, entityType="EE03", printName="Inboud & Outbound Definition", fieldLength=0)
	WM_Definition_ID,
	//
	@FlyElement(name="In & Out Bound Order", dataType=FlyDataType.TableDirect, entityType="EE01", printName="In & Out Bound Order", fieldLength=0)
	WM_InOutBound_ID,
	//
	@FlyElement(name="Inbound & Outbound Order Line", dataType=FlyDataType.NONE, entityType="EE01", printName="Inbound & Outbound Order Line", fieldLength=0)
	WM_InOutBoundLine_ID,
	//
	@FlyElement(name="Inbound & Outbound Order Line MA ID", dataType=FlyDataType.NONE, entityType="EE03", printName="Inbound & Outbound Order Line MA ID", fieldLength=0)
	WM_InOutBoundLineMA_ID,
	//
	@FlyElement(name="Inbound & Outbound Rule", dataType=FlyDataType.NONE, entityType="EE03", printName="Inbound & Outbound Rule", fieldLength=0)
	WM_Rule_ID,
	//
	@FlyElement(name="Warehouse Section Detail", description="Define the Locations that belong to this section", dataType=FlyDataType.NONE, entityType="EE03", printName="Warehouse Section Deatil", fieldLength=0)
	WM_Section_Detail_ID,
	//
	@FlyElement(name="Warehouse Section", description="The Warehouse Section is an grouping of Locators with similar features.", help="The criteria for grouping the locators can be for Moving Type (Fast, Slow ), heavy part, bulky Material ", dataType=FlyDataType.NONE, entityType="EE03", printName="Warehouse Section", fieldLength=0)
	WM_Section_ID,
	//
	@FlyElement(name="Warehouse Section Type", dataType=FlyDataType.NONE, entityType="EE03", printName="Warehouse Section Type", fieldLength=0)
	WM_Section_Type_ID,
	//
	@FlyElement(name="Inbound & Outbound Strategy Detail ID", dataType=FlyDataType.NONE, entityType="EE03", printName="Inbound & Outbound Strategy Detail ID", fieldLength=0)
	WM_Strategy_Detail_ID,
	//
	@FlyElement(name="Warehouse Managamet Strategy", dataType=FlyDataType.NONE, entityType="EE03", printName="Warehouse Managamet Strategy", fieldLength=0)
	WM_Strategy_ID,
	//
	@FlyElement(name="Workflow", description="Workflow or tasks", help="The Workflow field identifies a unique workflow.   A workflow is a grouping of related tasks, in a specified sequence and optionally including approvals", dataType=FlyDataType.Table, entityType="D", printName="Workflow", fieldLength=22)
	Workflow_ID,
	//
	@FlyElement(name="Workflow Type", description="Type of Workflow", help="The type of workflow determines how the workflow is started.", dataType=FlyDataType.List, entityType="D", printName="Workflow Type", fieldLength=1)
	WorkflowType,
	//
	@FlyElement(name="Workflow Key", description="Key of the Workflow to start", dataType=FlyDataType.String, entityType="D", printName="Workflow", fieldLength=40)
	WorkflowValue,
	//
	@FlyElement(name="Work Group Value", description="Work Group Value used for import", help="The Work Group provides a way to grouping of Work", dataType=FlyDataType.String, entityType="ECA02", printName="Work Group Value", fieldLength=60)
	WorkGroupValue,
	//
	@FlyElement(name="Working Time", description="Workflow Simulation Execution Time", help="Amount of time the performer of the activity needs to perform the task in Duration Unit", dataType=FlyDataType.Integer, entityType="D", printName="Working Time", fieldLength=22)
	WorkingTime,
	//
	@FlyElement(name="Inventory Revaluation", description="Account for Inventory Revaluation", help="The Inventory Revaluation Account identifies the account used to records changes in inventory value due to currency revaluation.", dataType=FlyDataType.Account, entityType="D", printName="Inventory Revaluation", fieldLength=22)
	W_Revaluation_Acct,
	//
	@FlyElement(name="Write-off", description="Account for Receivables write-off", help="The Write Off Account identifies the account to book write off transactions to.", dataType=FlyDataType.Account, entityType="D", printName="Write-off", fieldLength=22)
	WriteOff_Acct,
	//
	@FlyElement(name="Write-off Amount", description="Amount to write-off", help="The Write Off Amount indicates the amount to be written off as uncollectible.", dataType=FlyDataType.Amount, entityType="D", printName="Write-off", fieldLength=22)
	WriteOffAmt,
	//
	@FlyElement(name="Web Store EMail", description="EMail address used as the sender (From)", help="The EMail address is used to send mails to users of the web store", dataType=FlyDataType.String, entityType="D", printName="Web Store EMail", fieldLength=60)
	WStoreEMail,
	//
	@FlyElement(name="Web Store", description="A Web Store of the Client", dataType=FlyDataType.ID, entityType="D", printName="Web Store", fieldLength=10)
	W_Store_ID,
	//
	@FlyElement(name="WebStore User", description="User ID of the Web Store EMail address", help="User ID to connect to the Mail Server", dataType=FlyDataType.String, entityType="D", printName="Web Store User", fieldLength=60)
	WStoreUser,
	//
	@FlyElement(name="WebStore Password", description="Password of the Web Store EMail address", help="Password to connect to the Mail Server", dataType=FlyDataType.String, entityType="D", printName="WebStore Password", fieldLength=20)
	WStoreUserPW,
	//
	@FlyElement(name="Web Service Field Input", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Field Input", fieldLength=0)
	WS_WebServiceFieldInput_ID,
	//
	@FlyElement(name="Web Service Field Output", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Field Output", fieldLength=0)
	WS_WebServiceFieldOutput_ID,
	//
	@FlyElement(name="Web Service", dataType=FlyDataType.NONE, entityType="D", printName="Web Service", fieldLength=0)
	WS_WebService_ID,
	//
	@FlyElement(name="Web Service Method", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Method", fieldLength=0)
	WS_WebServiceMethod_ID,
	//
	@FlyElement(name="Web Service Parameters", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Parameters", fieldLength=0)
	WS_WebService_Para_ID,
	//
	@FlyElement(name="Web Service Type", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Type", fieldLength=0)
	WS_WebServiceType_ID,
	//
	@FlyElement(name="Aisle (X)", description="X dimension, e.g., Aisle", help="The X dimension indicates the Aisle a product is located in.", dataType=FlyDataType.String, entityType="D", printName="X", fieldLength=60)
	X,
	//
	@FlyElement(name="UOM Code", description="UOM EDI X12 Code", help="The Unit of Measure Code indicates the EDI X12 Code Data Element 355 (Unit or Basis for Measurement)", dataType=FlyDataType.String, entityType="D", printName="UOM Code", fieldLength=4)
	X12DE355,
	//
	@FlyElement(name="X Position", description="Absolute X (horizontal) position in 1/72 of an inch", help="Absolute X (horizontal) position in 1/72 of an inch", dataType=FlyDataType.Integer, entityType="D", printName="X Position", fieldLength=22)
	XPosition,
	//
	@FlyElement(name="X Space", description="Relative X (horizontal) space in 1/72 of an inch", help="Relative X (horizontal) space in 1/72 of an inch in relation to the end of the previous item.", dataType=FlyDataType.Integer, entityType="D", printName="X Space", fieldLength=22)
	XSpace,
	//
	@FlyElement(name="XY Separator", description="The separator between the X and Y function.", dataType=FlyDataType.String, entityType="D", printName="XY Separator", fieldLength=20)
	XYSeparator,
	//
	@FlyElement(name="Bin (Y)", description="Y dimension, e.g., Bin", help="The Y dimension indicates the Bin a product is located in", dataType=FlyDataType.String, entityType="D", printName="Y", fieldLength=60)
	Y,
	//
	@FlyElement(name="Year of Passing", description="Year of Passing", help="The Year of Passing", dataType=FlyDataType.List, entityType="EE02", printName="Year of Passing", fieldLength=0)
	YearOfPassing,
	//
	@FlyElement(name="Yield %", description="The Yield is the percentage of a lot that is expected to be of acceptable wuality may fall below 100 percent", help="ADempiere Calculate the total yield for a product from the yield for each activity when the process Workflow Cost Roll-Up is executed.		The expected yield for an Activity can be expressed as:		Yield = Acceptable Units at Activity End x 100		The Total manufacturing yield for a product is determined by multiplying the yied percentage for each activity.		Manufacturing Yield = Yield % for Activity 10 x Yied % for Activity 20 , etc		Take care when setting yield to anything but 100% particularly when yied is used for multiples activities", dataType=FlyDataType.Integer, entityType="EE01", printName="Yield %", fieldLength=22)
	Yield,
	//
	@FlyElement(name="Y Position", description="Absolute Y (vertical) position in 1/72 of an inch", help="Absolute Y (vertical) position in 1/72 of an inch", dataType=FlyDataType.Integer, entityType="D", printName="Y Position", fieldLength=22)
	YPosition,
	//
	@FlyElement(name="Y Space", description="Relative Y (vertical) space in 1/72 of an inch", help="Relative Y (vertical) space in 1/72 of an inch in relation to the end of the previous item.", dataType=FlyDataType.Integer, entityType="D", printName="Y Space", fieldLength=22)
	YSpace,
	//
	@FlyElement(name="Level (Z)", description="Z dimension, e.g., Level", help="The Z dimension indicates the Level a product is located in.", dataType=FlyDataType.String, entityType="D", printName="Z", fieldLength=60)
	Z,
	//
	@FlyElement(name="Zoom_Field_ID", dataType=FlyDataType.NONE, entityType="D", printName="Zoom_Field_ID", fieldLength=0)
	Zoom_Field_ID,
	//
	@FlyElement(name="Zoom Logic", description="the result determines if the zoom condition is applied", help="format := {expression} [{logic} {expression}]<br> 	expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> 	logic := {|}|{&}<br>	context := any global or window context <br>	value := strings or numbers<br>	logic operators	:= AND or OR with the previous result from left to right <br>	operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>	Examples: <br>	@AD_Table_ID@=14 | @Language@!GERGER <br>	@PriceLimit@>10 | @PriceList@>@PriceActual@<br>	@Name@>J<br>	Strings may be in single quotes (optional)", dataType=FlyDataType.Text, entityType="D", printName="Zoom Logic", fieldLength=2000)
	ZoomLogic,
	//
	@FlyElement(name="Zoom_Tab_ID", dataType=FlyDataType.NONE, entityType="D", printName="Zoom_Tab_ID", fieldLength=0)
	Zoom_Tab_ID,
	//
	@FlyElement(name="Zoom_Window_ID", dataType=FlyDataType.NONE, entityType="D", printName="Zoom_Window_ID", fieldLength=0)
	Zoom_Window_ID,
	//
	@FlyElement(name="ZUL File Path", description="Absolute path to zul file", help="Absolute path to zul file that is use to generate dashboard content", dataType=FlyDataType.String, entityType="D", printName="ZUL File Path", fieldLength=255)
	ZulFilePath;
}