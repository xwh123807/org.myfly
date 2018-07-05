package org.myfly.platform.core3.model.data;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyElement;

public enum Element_ALL_zh_CN{
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
	@FlyElement(name="资产配送", description="资产的配送", help="The availability of the asset to the business partner (customer).", dataType=FlyDataType.ID, entityType="D", printName="资产配送", fieldLength=22)
	A_Asset_Delivery_ID,
	//
	@FlyElement(name="Asset Disposed", dataType=FlyDataType.ID, entityType="D", printName="Asset Disposed", fieldLength=22)
	A_Asset_Disposed_ID,
	//
	@FlyElement(name="Asset Group Accounting", dataType=FlyDataType.ID, entityType="D", printName="Asset Group Accounting", fieldLength=22)
	A_Asset_Group_Acct_ID,
	//
	@FlyElement(name="资产分类", description="群体的资产", help="The group of assets determines default accounts.  If an asset group is selected in the product category, assets are created when delivering the asset.", dataType=FlyDataType.TableDirect, entityType="D", printName="资产分类", fieldLength=22)
	A_Asset_Group_ID,
	//
	@FlyElement(name="Asset Group Key", dataType=FlyDataType.NONE, entityType="D", printName="Asset Group Key", fieldLength=0)
	A_Asset_Group_Value,
	//
	@FlyElement(name="资产", description="Asset used internally or by customers", help="An asset is either created by purchasing or by delivering a product.  An asset can be used internally or be a customer asset.", dataType=FlyDataType.ID, entityType="D", printName="资产", fieldLength=22)
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
	@FlyElement(name="资产报废", description="Internally used asset is not longer used.", dataType=FlyDataType.ID, entityType="D", printName="资产报废", fieldLength=22)
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
	@FlyElement(name="接受AMEX", description="接受美国人快递卡片", help="Indicates if American Express Cards are accepted as payment to this Bank Account", dataType=FlyDataType.YesNo, entityType="D", printName="接受AMEX", fieldLength=1)
	AcceptAMEX,
	//
	@FlyElement(name="接受自动柜员机", description="接受银行金融卡", help="Indicates if Bank ATM Cards are accepted for as payment to this Bank Account", dataType=FlyDataType.YesNo, entityType="D", printName="接受自动柜员机", fieldLength=1)
	AcceptATM,
	//
	@FlyElement(name="接受电子的检查", description="Accept ECheck (Electronic Checks)", help="Indicates if EChecks are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受 ECheck", fieldLength=1)
	AcceptCheck,
	//
	@FlyElement(name="接受公司", description="Accept Corporate Payment Cards", help="Indicates if Corporate Payment Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受公司", fieldLength=1)
	AcceptCorporate,
	//
	@FlyElement(name="接受用餐者", description="接受用餐者的俱乐部", help="Indicates if Diner's Club Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受用餐者", fieldLength=1)
	AcceptDiners,
	//
	@FlyElement(name="Accept Direct Debit", description="Accept Direct Debits (vendor initiated)", help="Accept Direct Debit transactions. Direct Debits are initiated by the vendor who has permission to deduct amounts from the payee's account.", dataType=FlyDataType.YesNo, entityType="D", printName="Direct Debit", fieldLength=1)
	AcceptDirectDebit,
	//
	@FlyElement(name="接受 ACH", description="Accept Automatic Clearing House", help="Indicates if ACH Payments are accepted as payment to this Bank Account", dataType=FlyDataType.YesNo, entityType="D", printName="接受 ACH", fieldLength=1)
	AcceptDirectDeposit,
	//
	@FlyElement(name="接受发现", description="接受发现卡片", help="Indicates if Discover Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受发现", fieldLength=1)
	AcceptDiscover,
	//
	@FlyElement(name="接受语言", description="Language accepted based on browser information", dataType=FlyDataType.String, entityType="D", printName="接受语言", fieldLength=60)
	AcceptLanguage,
	//
	@FlyElement(name="接受MasterCard", description="接受Master卡", help="Indicates if Master Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受 MC", fieldLength=1)
	AcceptMC,
	//
	@FlyElement(name="接受Visa卡", description="接受签证卡片", help="Indicates if Visa Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受Visa卡", fieldLength=1)
	AcceptVisa,
	//
	@FlyElement(name="数据访问级别", description="所要求的访问级别", help="Indicates the access level required for this record or process.", dataType=FlyDataType.List, entityType="D", printName="数据访问级别", fieldLength=1)
	AccessLevel,
	//
	@FlyElement(name="Access Type", description="The type of access for this rule", help="If you restrict Access to the entity, you also cannot Report or Export it (i.e. to have access is a requirement that you can report or export the data).  The Report and Export rules are further restrictions if you have access.", dataType=FlyDataType.List, entityType="D", printName="Access Type", fieldLength=1)
	AccessTypeRule,
	//
	@FlyElement(name="Account_Acct", dataType=FlyDataType.Account, entityType="D", printName="Account_Acct", fieldLength=22)
	Account_Acct,
	//
	@FlyElement(name="帐户", description="已使用帐户", help="帐户用", dataType=FlyDataType.Search, entityType="D", printName="帐户", fieldLength=22)
	Account_ID,
	//
	@FlyElement(name="帐户号", description="帐户数字", help="The Account Number indicates the Number assigned to this account", dataType=FlyDataType.String, entityType="D", printName="帐户号", fieldLength=20)
	AccountNo,
	//
	@FlyElement(name="财务符号", description="Indicates the Natural Sign of the Account as a Debit or Credit", help="Indicates if the expected balance for this account should be a Debit or a Credit.", dataType=FlyDataType.List, entityType="D", printName="符号", fieldLength=1)
	AccountSign,
	//
	@FlyElement(name="帐户类型", description="指示帐户的类型", help="Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo.  The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners.  Note:  Memo account amounts are ignored when checking for balancing", dataType=FlyDataType.List, entityType="D", printName="帐户类型", fieldLength=1)
	AccountType,
	//
	@FlyElement(name="帐户关键字", description="会计科目的关键字", dataType=FlyDataType.String, entityType="D", printName="帐户关键字", fieldLength=40)
	AccountValue,
	//
	@FlyElement(name="帐户模式名", description="会计模式的名称", dataType=FlyDataType.String, entityType="D", printName="会计模式名", fieldLength=60)
	AcctSchemaName,
	//
	@FlyElement(name="Accumulation Type", description="How to accumulate data on time axis", help="Sum adds the data points (e.g. stock volume) - Average is appropriate for e.g. Stock Price", dataType=FlyDataType.List, entityType="D", printName="Accumulation Type", fieldLength=1)
	AccumulationType,
	//
	@FlyElement(name="Change Acumulated Depreciation", dataType=FlyDataType.NONE, entityType="D", printName="Change Acumulated Depreciation", fieldLength=0)
	A_Change_Acumulated_Depr,
	//
	@FlyElement(name="帐户城市", description="City or the Credit Card or Account Holder", help="The Account City indicates the City of the Credit Card or Account holder", dataType=FlyDataType.String, entityType="D", printName="城市", fieldLength=60)
	A_City,
	//
	@FlyElement(name="Contract Date", dataType=FlyDataType.Date, entityType="D", printName="Contract Date", fieldLength=7)
	A_Contract_Date,
	//
	@FlyElement(name="帐户国家", description="国家 ", help="帐户国家名字", dataType=FlyDataType.String, entityType="D", printName="国家 ", fieldLength=40)
	A_Country,
	//
	@FlyElement(name="获得成本", description="使潜在客户成为客户的成本", help="The Acquisition Cost identifies the cost associated with making this prospect a customer.", dataType=FlyDataType.CostsPrices, entityType="D", printName="获得成本", fieldLength=22)
	AcqusitionCost,
	//
	@FlyElement(name="Create Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Create Asset", fieldLength=1)
	A_CreateAsset,
	//
	@FlyElement(name="动作", description="将被执行的动作", help="The Action field is a drop down list box which indicates the Action to be performed for this Menu Item.", dataType=FlyDataType.List, entityType="D", printName="动作", fieldLength=1)
	Action,
	//
	@FlyElement(name="Activity Value", dataType=FlyDataType.String, entityType="D", printName="Activity Value", fieldLength=40)
	ActivityValue,
	//
	@FlyElement(name="Auto Complete Min Length", description="Identifier autocomplete trigger length", dataType=FlyDataType.Integer, entityType="D", printName="Auto Complete Min Length", fieldLength=10)
	ACTriggerLength,
	//
	@FlyElement(name="实际金额", description="实际金额", help="Actual amount indicates the agreed upon amount for a document.", dataType=FlyDataType.Amount, entityType="D", printName="实际金额", fieldLength=22)
	ActualAmt,
	//
	@FlyElement(name="Actual Click Count", description="How many clicks have been counted", help="Contains info on the actual click count until now", dataType=FlyDataType.Integer, entityType="D", printName="Actual Click Count", fieldLength=10)
	ActualClick,
	//
	@FlyElement(name="Actual Impression Count", description="How many impressions have been counted", help="Contains info on the actual impression count until now", dataType=FlyDataType.Integer, entityType="D", printName="Actual Impression Count", fieldLength=10)
	ActualImpression,
	//
	@FlyElement(name="实际价值", description="实际收入", help="The Actual Life Time Value is the recorded revenue to be generated by this Business Partner.", dataType=FlyDataType.Amount, entityType="D", printName="实际价值", fieldLength=22)
	ActualLifeTimeValue,
	//
	@FlyElement(name="实际数量", description="实际量", help="The Actual Quantity indicates the quantity as referenced on a document.", dataType=FlyDataType.Quantity, entityType="D", printName="实际数量", fieldLength=22)
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
	@FlyElement(name="警报", description="Adempiere警报", help="Adempiere Alerts allow you define system conditions you want to be alerted of", dataType=FlyDataType.TableDirect, entityType="D", printName="警报", fieldLength=22)
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
	@FlyElement(name="警报规则", description="Definition of the alert element", dataType=FlyDataType.ID, entityType="D", printName="警报规则", fieldLength=22)
	AD_AlertRule_ID,
	//
	@FlyElement(name="Archive", description="Document and Report Archive", help="Depending on the Client Automatic Archive Level documents and reports are saved and available for view.", dataType=FlyDataType.ID, entityType="D", printName="Archive", fieldLength=22)
	AD_Archive_ID,
	//
	@FlyElement(name="附件", description="本文件附件", help="Attachment can be of any document file type and can be attached to any record in the system.", dataType=FlyDataType.ID, entityType="D", printName="附件", fieldLength=22)
	AD_Attachment_ID,
	//
	@FlyElement(name="Attachment Note", description="Personal Attachment Note", dataType=FlyDataType.ID, entityType="D", printName="Attachment Note", fieldLength=22)
	AD_AttachmentNote_ID,
	//
	@FlyElement(name="属性", dataType=FlyDataType.ID, entityType="D", printName="属性", fieldLength=22)
	AD_Attribute_ID,
	//
	@FlyElement(name="Backup", dataType=FlyDataType.ID, entityType="D", printName="Backup", fieldLength=22)
	AD_Backup_ID,
	//
	@FlyElement(name="变动日志", description="数据变化的日志", help="数据变化的日志", dataType=FlyDataType.ID, entityType="D", printName="变动日志", fieldLength=22)
	AD_ChangeLog_ID,
	//
	@FlyElement(name="Chart Datasource", dataType=FlyDataType.ID, entityType="D", printName="Chart Datasource", fieldLength=22)
	AD_ChartDatasource_ID,
	//
	@FlyElement(name="Chart", dataType=FlyDataType.ID, entityType="D", printName="Chart", fieldLength=22)
	AD_Chart_ID,
	//
	@FlyElement(name="客户", description="安装此软件的客户", help="客户是一个公司或者合法的实体。你不能在客户之间共享数据。", dataType=FlyDataType.TableDirect, entityType="D", printName="客户", fieldLength=22)
	AD_Client_ID,
	//
	@FlyElement(name="Client Share", description="Force (not) sharing of client/org entities", help="For entities with data access level of Client+Organization either force to share the entries or not. Example: Product and Business Partner can be either defined on Client level (shared) or on Org level (not shared).  You can define here of Products are always shared (i.e. always created under Organization '*') or if they are not shared (i.e. you cannot enter them with Organization '*')", dataType=FlyDataType.ID, entityType="D", printName="Client Share", fieldLength=10)
	AD_ClientShare_ID,
	//
	@FlyElement(name="颜色", description="Color for backgrounds or indicators", dataType=FlyDataType.ID, entityType="D", printName="颜色", fieldLength=22)
	AD_Color_ID,
	//
	@FlyElement(name="列", description="在表中的列", help="链接到数据库表中的列。", dataType=FlyDataType.ID, entityType="D", printName="列", fieldLength=22)
	AD_Column_ID,
	//
	@FlyElement(name="Column Link Process", dataType=FlyDataType.NONE, entityType="D", printName="Column Link Process", fieldLength=0)
	AD_ColumnProcess_ID,
	//
	@FlyElement(name="Link Process Parameter", dataType=FlyDataType.NONE, entityType="D", printName="Link Process Parameter", fieldLength=0)
	AD_ColumnProcessPara_ID,
	//
	@FlyElement(name="定单列", description="列决定定单", help="Integer Column of the table determining the order (display, sort, ..). If defined, the Order By replaces the default Order By clause. It should be fully qualified (i.e. 'tablename.columnname').", dataType=FlyDataType.Table, entityType="D", printName="定单列", fieldLength=22)
	AD_ColumnSortOrder_ID,
	//
	@FlyElement(name="已包括列", description="Column determining if a Table Column is included in Ordering", help="If a Included Column is defined, it decides, if a column is active in the ordering - otherwise it is determined that the Order Column has a value of one or greater", dataType=FlyDataType.Table, entityType="D", printName="已包括列", fieldLength=22)
	AD_ColumnSortYesNo_ID,
	//
	@FlyElement(name="桌面", description="工作台的集合", dataType=FlyDataType.ID, entityType="D", printName="桌面", fieldLength=22)
	AD_Desktop_ID,
	//
	@FlyElement(name="桌面工作台", dataType=FlyDataType.ID, entityType="D", printName="桌面工作台", fieldLength=22)
	AD_DesktopWorkbench_ID,
	//
	@FlyElement(name="显示列", description="将会显示的列", help="The Display Column indicates the column that will display. 显示列指明了将显示的列。", dataType=FlyDataType.Table, entityType="D", printName="显示列", fieldLength=22)
	AD_Display,
	//
	@FlyElement(name="地址 1", description="该位置的地址的第一行", help="The Address 1 identifies the address for an entity's location", dataType=FlyDataType.String, entityType="D", printName="地址 1", fieldLength=60)
	Address1,
	//
	@FlyElement(name="地址 2", description="该位置的地址的第二行", help="The Address 2 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="地址 2", fieldLength=60)
	Address2,
	//
	@FlyElement(name="Address 3", description="Address Line 3 for the location", help="The Address 2 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="Address 3", fieldLength=60)
	Address3,
	//
	@FlyElement(name="Address 4", description="Address Line 4 for the location", help="The Address 4 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="Address 4", fieldLength=60)
	Address4,
	//
	@FlyElement(name="系统元素", description="系统元素使得我们能够对列的描述和帮助进行集中维护。", help="系统元素使得我们能够对数据库字段的描述、帮助和词汇进行集中维护。", dataType=FlyDataType.ID, entityType="D", printName="元素", fieldLength=22)
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
	@FlyElement(name="错误", dataType=FlyDataType.ID, entityType="D", printName="错误", fieldLength=22)
	AD_Error_ID,
	//
	@FlyElement(name="字段组", description="字段的合乎逻辑的配列", help="The Field Group indicates the logical group that this field belongs to (History, Amounts, Quantities)", dataType=FlyDataType.TableDirect, entityType="D", printName="字段组", fieldLength=22)
	AD_FieldGroup_ID,
	//
	@FlyElement(name="字段", description="一张数据库表上的字段", help="字段标识了数据库表的字段。", dataType=FlyDataType.ID, entityType="D", printName="字段", fieldLength=22)
	AD_Field_ID,
	//
	@FlyElement(name="查找", dataType=FlyDataType.ID, entityType="D", printName="查找", fieldLength=22)
	AD_Find_ID,
	//
	@FlyElement(name="特别的窗体", description="特别的窗体", help="The Special Form field identifies a unique Special Form in the system.", dataType=FlyDataType.ID, entityType="D", printName="特别的窗体", fieldLength=22)
	AD_Form_ID,
	//
	@FlyElement(name="House Keeping Configuration", dataType=FlyDataType.ID, entityType="D", printName="House Keeping Configuration", fieldLength=22)
	AD_HouseKeeping_ID,
	//
	@FlyElement(name="图像", description="系统图像或图标", dataType=FlyDataType.TableDirect, entityType="D", printName="图像", fieldLength=22)
	AD_Image_ID,
	//
	@FlyElement(name="导入格式", dataType=FlyDataType.ID, entityType="D", printName="导入格式", fieldLength=22)
	AD_ImpFormat_ID,
	//
	@FlyElement(name="格式字段", dataType=FlyDataType.ID, entityType="D", printName="格式字段", fieldLength=22)
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
	@FlyElement(name="主键列", description="记录的唯一标识符", help="主键列标明了它是这个表的一条记录的唯一标示符。", dataType=FlyDataType.Table, entityType="D", printName="主键列", fieldLength=22)
	AD_Key,
	//
	@FlyElement(name="Label printer Function", description="Function of Label Printer", dataType=FlyDataType.TableDirect, entityType="D", printName="Label printer Function", fieldLength=22)
	AD_LabelPrinterFunction_ID,
	//
	@FlyElement(name="Label printer", description="Label Printer Definition", dataType=FlyDataType.ID, entityType="D", printName="Label printer", fieldLength=22)
	AD_LabelPrinter_ID,
	//
	@FlyElement(name="语言", description="本客户使用的语言", help="The Language identifies the language to use for display", dataType=FlyDataType.Table, entityType="D", printName="语言", fieldLength=6)
	AD_Language,
	//
	@FlyElement(name="语言ID", dataType=FlyDataType.ID, entityType="D", printName="语言ID", fieldLength=22)
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
	@FlyElement(name="菜单", description="标识菜单", help="The Menu identifies a unique Menu.  Menus are used to control the display of those screens a user has access to.", dataType=FlyDataType.ID, entityType="D", printName="菜单", fieldLength=22)
	AD_Menu_ID,
	//
	@FlyElement(name="信息", description="系统信息", help="Information and Error messages", dataType=FlyDataType.ID, entityType="D", printName="信息", fieldLength=22)
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
	@FlyElement(name="通知", description="系统通知", dataType=FlyDataType.ID, entityType="D", printName="通知", fieldLength=22)
	AD_Note_ID,
	//
	@FlyElement(name="Linked Organization", description="The Business Partner is another Organization for explicit Inter-Org transactions", help="The business partner is another organization in the system. So when performing transactions, the counter-document is created automatically. Example: You have BPartnerA linked to OrgA and BPartnerB linked to OrgB.  If you create a sales order for BPartnerB in OrgA a purchase order is created for BPartnerA in OrgB.  This allows to have explicit documents for Inter-Org transactions.", dataType=FlyDataType.Button, entityType="D", printName="Linked Org", fieldLength=22)
	AD_OrgBP_ID,
	//
	@FlyElement(name="Document Org", description="Document Organization (independent from account organization)", dataType=FlyDataType.Table, entityType="D", printName="Document Org", fieldLength=22)
	AD_OrgDoc_ID,
	//
	@FlyElement(name="机构", description="客户内的机构实体。", help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.", dataType=FlyDataType.TableDirect, entityType="D", printName="机构", fieldLength=22)
	AD_Org_ID,
	//
	@FlyElement(name="Only Organization", description="Create posting entries only for this organization", help="When you have multiple accounting schema, you may want to restrict the generation of postings entries for the additional accounting schema (i.e. not for the primary).  Example: You have a US and a FR organization. The primary accounting schema is in USD, the second in EUR.  If for the EUR accounting schema, you select the FR organizations, you would not create accounting entries for the transactions of the US organization in EUR.", dataType=FlyDataType.Table, entityType="D", printName="Only Org", fieldLength=10)
	AD_OrgOnly_ID,
	//
	@FlyElement(name="组织间", description="Organization valid for intercompany documents", help="The Inter Organization field identifies an Organization which can be used by this Organization for intercompany documents.", dataType=FlyDataType.Table, entityType="D", printName="组织间", fieldLength=22)
	AD_OrgTo_ID,
	//
	@FlyElement(name="交易机构", description="Performing or initiating organization", help="The organization which performs or initiates this transaction (for another organization).  The owning Organization may not be the transaction organization in a service bureau environment, with centralized services, and inter-organization transactions.", dataType=FlyDataType.Table, entityType="D", printName="交易机构", fieldLength=22)
	AD_OrgTrx_ID,
	//
	@FlyElement(name="机构类型", description="Organization Type allows you to categorize your organizations", help="Organization Type allows you to categorize your organizations for reporting purposes", dataType=FlyDataType.TableDirect, entityType="D", printName="机构类型", fieldLength=22)
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
	@FlyElement(name="进程实例", dataType=FlyDataType.ID, entityType="D", printName="进程实例", fieldLength=22)
	AD_PInstance_ID,
	//
	@FlyElement(name="日志", dataType=FlyDataType.ID, entityType="D", printName="日志", fieldLength=22)
	AD_PInstance_Log_ID,
	//
	@FlyElement(name="选项", description="个人选项", dataType=FlyDataType.ID, entityType="D", printName="选项", fieldLength=22)
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
	@FlyElement(name="打印颜色", description="打印用的颜色", help="打印用的颜色", dataType=FlyDataType.TableDirect, entityType="D", printName="打印颜色", fieldLength=22)
	AD_PrintColor_ID,
	//
	@FlyElement(name="打印字型", description="维护打印字型", help="打印用的字型", dataType=FlyDataType.TableDirect, entityType="D", printName="打印字型", fieldLength=22)
	AD_PrintFont_ID,
	//
	@FlyElement(name="已包括打印格式", description="Print format that is included here.", help="Included Print formats allow to e.g. Lines to Header records. The Column provides the parent link.", dataType=FlyDataType.Table, entityType="D", printName="已包括打印格式", fieldLength=22)
	AD_PrintFormatChild_ID,
	//
	@FlyElement(name="Header Print Format", dataType=FlyDataType.NONE, entityType="D", printName="Header Print Format", fieldLength=0)
	AD_PrintFormatHeader_ID,
	//
	@FlyElement(name="打印格式", description="数据打印格式", help="The print format determines how data is rendered for print.", dataType=FlyDataType.TableDirect, entityType="D", printName="打印格式", fieldLength=22)
	AD_PrintFormat_ID,
	//
	@FlyElement(name="打印格式项目", description="Item Column in the Print format", help="Item Column in the print format maintaining layout information", dataType=FlyDataType.ID, entityType="D", printName="打印格式项目", fieldLength=22)
	AD_PrintFormatItem_ID,
	//
	@FlyElement(name="打印表单", description="表单", dataType=FlyDataType.ID, entityType="D", printName="打印表单", fieldLength=22)
	AD_PrintForm_ID,
	//
	@FlyElement(name="图表", description="在报表中包括图表", help="Pie Line Graph to be printed in Reports", dataType=FlyDataType.ID, entityType="D", printName="图表", fieldLength=22)
	AD_PrintGraph_ID,
	//
	@FlyElement(name="打印标签 ", description="打印标签格式类型", help="打印分类格式", dataType=FlyDataType.TableDirect, entityType="D", printName="打印标签 ", fieldLength=22)
	AD_PrintLabel_ID,
	//
	@FlyElement(name="打印标签行", description="打印标签线格式", help="标签上的明细格式", dataType=FlyDataType.TableDirect, entityType="D", printName="标签线", fieldLength=22)
	AD_PrintLabelLine_ID,
	//
	@FlyElement(name="打印纸", description="打印机纸定义", help="Printer Paper Size, Orientation and Margins", dataType=FlyDataType.ID, entityType="D", printName="打印纸", fieldLength=22)
	AD_PrintPaper_ID,
	//
	@FlyElement(name="打印表格式", description="在报表中的表格式", help="Print Table Format determines Fonts, Colors of  the printed Table", dataType=FlyDataType.ID, entityType="D", printName="表格式", fieldLength=22)
	AD_PrintTableFormat_ID,
	//
	@FlyElement(name="进程", description="程序或报表", help="The Process field identifies a unique Process or Report in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="进程", fieldLength=22)
	AD_Process_ID,
	//
	@FlyElement(name="参数处理", dataType=FlyDataType.ID, entityType="D", printName="参数处理", fieldLength=22)
	AD_Process_Para_ID,
	//
	@FlyElement(name="Recent Item", dataType=FlyDataType.NONE, entityType="D", printName="Recent Item", fieldLength=0)
	AD_RecentItem_ID,
	//
	@FlyElement(name="引用", description="系统引用", help="The Reference indicates the type of reference field", dataType=FlyDataType.ID, entityType="D", printName="引用", fieldLength=22)
	AD_Reference_ID,
	//
	@FlyElement(name="Source Reference", dataType=FlyDataType.Table, entityType="D", printName="Source Reference", fieldLength=10)
	AD_Reference_Source_ID,
	//
	@FlyElement(name="Target Reference", dataType=FlyDataType.Table, entityType="D", printName="Target Reference", fieldLength=10)
	AD_Reference_Target_ID,
	//
	@FlyElement(name="引用关键字", description="Required to specify, if data type is Table or List", help="The Reference Value indicates where the reference values are stored.  It must be specified if the data type is Table or List.  ", dataType=FlyDataType.Table, entityType="D", printName="引用关键字", fieldLength=22)
	AD_Reference_Value_ID,
	//
	@FlyElement(name="引用列表", description="基于表的引用列表", help="The Reference List field indicates a list of reference values from a database tables.  Reference lists populate drop down list boxes in data entry screens", dataType=FlyDataType.ID, entityType="D", printName="引用列表", fieldLength=22)
	AD_Ref_List_ID,
	//
	@FlyElement(name="Registration", description="System Registration", help="The System Registration helps Adempiere to help the installed base", dataType=FlyDataType.ID, entityType="D", printName="Registration", fieldLength=22)
	AD_Registration_ID,
	//
	@FlyElement(name="Relation Type", dataType=FlyDataType.ID, entityType="D", printName="Relation Type", fieldLength=22)
	AD_RelationType_ID,
	//
	@FlyElement(name="复制", description="数据复制目标", help="Data Replication Target Details. Maintained on the central server.", dataType=FlyDataType.TableDirect, entityType="D", printName="复制", fieldLength=22)
	AD_Replication_ID,
	//
	@FlyElement(name="复制日志", description="数据复制日志明细", help="数据复制运行日志", dataType=FlyDataType.ID, entityType="D", printName="复制日志", fieldLength=22)
	AD_Replication_Log_ID,
	//
	@FlyElement(name="复制运行", description="数据复制运行", help="Data Replication Run information", dataType=FlyDataType.ID, entityType="D", printName="复制运行", fieldLength=22)
	AD_Replication_Run_ID,
	//
	@FlyElement(name="复制策略", description="数据复制策略", help="The Data Replication Strategy determines what and how tables are replicated ", dataType=FlyDataType.TableDirect, entityType="D", printName="复制策略", fieldLength=22)
	AD_ReplicationStrategy_ID,
	//
	@FlyElement(name="复制表", description="Data Replication Strategy Table Info", help="Determines how the table is replicated", dataType=FlyDataType.ID, entityType="D", printName="复制表", fieldLength=22)
	AD_ReplicationTable_ID,
	//
	@FlyElement(name="报表视图列", dataType=FlyDataType.ID, entityType="D", printName="报表视图列", fieldLength=22)
	AD_ReportView_Col_ID,
	//
	@FlyElement(name="报表视图", description="View used to generate this report", help="The Report View indicates the view used to generate this report.", dataType=FlyDataType.TableDirect, entityType="D", printName="报表视图", fieldLength=22)
	AD_ReportView_ID,
	//
	@FlyElement(name="角色", description="职责角色", help="The Role determines security and access a user who has this Role will have in the System.", dataType=FlyDataType.ID, entityType="D", printName="角色", fieldLength=22)
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
	@FlyElement(name="序列", description="文档序列", help="The Sequence defines the numbering sequence to be used for documents.", dataType=FlyDataType.ID, entityType="D", printName="序列", fieldLength=22)
	AD_Sequence_ID,
	//
	@FlyElement(name="会话", description="在线的用户期间或网络", help="Online or Web Session Information", dataType=FlyDataType.ID, entityType="D", printName="会话", fieldLength=22)
	AD_Session_ID,
	//
	@FlyElement(name="System Configurator", dataType=FlyDataType.ID, entityType="D", printName="System Configurator", fieldLength=10)
	AD_SysConfig_ID,
	//
	@FlyElement(name="系统 ", description="系统定义", help="通常的系统定义", dataType=FlyDataType.ID, entityType="D", printName="系统 ", fieldLength=22)
	AD_System_ID,
	//
	@FlyElement(name="页签", description="窗口内的页签", help="The Tab indicates a tab that displays within a window.", dataType=FlyDataType.ID, entityType="D", printName="页签", fieldLength=22)
	AD_Tab_ID,
	//
	@FlyElement(name="表", description="字段所在表", help="The Table indicates the table in which a field or fields reside.", dataType=FlyDataType.ID, entityType="D", printName="表", fieldLength=22)
	AD_Table_ID,
	//
	@FlyElement(name="Table Script Validator", dataType=FlyDataType.ID, entityType="D", printName="Table Script Validator", fieldLength=22)
	AD_Table_ScriptValidator_ID,
	//
	@FlyElement(name="任务", description="操作系统任务", help="The Task field identifies a Operation System Task in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="任务", fieldLength=22)
	AD_Task_ID,
	//
	@FlyElement(name="任务实例", dataType=FlyDataType.ID, entityType="D", printName="任务实例", fieldLength=22)
	AD_TaskInstance_ID,
	//
	@FlyElement(name="广告文本", description="广告的本文", help="The text of the advertisement with optional HTML tags. The HTML tags are not checked for correctness and may impact the remaining page.", dataType=FlyDataType.Memo, entityType="D", printName="广告文本", fieldLength=2000)
	AdText,
	//
	@FlyElement(name="Account Tree", description="Tree for Natural Account Tree", dataType=FlyDataType.Table, entityType="D", printName="Account Tree", fieldLength=10)
	AD_Tree_Account_ID,
	//
	@FlyElement(name="Primary Tree Activity", dataType=FlyDataType.Table, entityType="D", printName="Tree Activity", fieldLength=22)
	AD_Tree_Activity_ID,
	//
	@FlyElement(name="主树-业务伙伴", dataType=FlyDataType.Table, entityType="D", printName="主树-业务伙伴", fieldLength=22)
	AD_Tree_BPartner_ID,
	//
	@FlyElement(name="Primary Tree Campaign", dataType=FlyDataType.Table, entityType="D", printName="Tree Campaign", fieldLength=22)
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
	@FlyElement(name="树", description="标识树", help="The Tree field identifies a unique Tree in the system. Trees define roll ups or summary levels of information.  They are used in reports for defining report points and summarization levels.", dataType=FlyDataType.TableDirect, entityType="D", printName="树", fieldLength=22)
	AD_Tree_ID,
	//
	@FlyElement(name="主树-菜单", dataType=FlyDataType.Table, entityType="D", printName="主树-菜单", fieldLength=22)
	AD_Tree_Menu_ID,
	//
	@FlyElement(name="主树-机构", dataType=FlyDataType.Table, entityType="D", printName="主树-机构", fieldLength=22)
	AD_Tree_Org_ID,
	//
	@FlyElement(name="主树-产品", dataType=FlyDataType.Table, entityType="D", printName="主树-产品", fieldLength=22)
	AD_Tree_Product_ID,
	//
	@FlyElement(name="主树-项目", dataType=FlyDataType.Table, entityType="D", printName="主树-项目", fieldLength=22)
	AD_Tree_Project_ID,
	//
	@FlyElement(name="主树-销售区域", dataType=FlyDataType.Table, entityType="D", printName="主树-销售区域", fieldLength=22)
	AD_Tree_SalesRegion_ID,
	//
	@FlyElement(name="Asset Due On", dataType=FlyDataType.List, entityType="D", printName="Asset Due On", fieldLength=22)
	A_Due_On,
	//
	@FlyElement(name="User BP Access", description="User/contact access to Business Partner information and resources", help="If on User level, 'Full BP Access' is NOT selected, you need to give access explicitly here. ", dataType=FlyDataType.ID, entityType="D", printName="User BP Access", fieldLength=10)
	AD_UserBPAccess_ID,
	//
	@FlyElement(name="自定义字段", dataType=FlyDataType.ID, entityType="D", printName="自定义字段", fieldLength=22)
	AD_UserDef_Field_ID,
	//
	@FlyElement(name="自定义页签", dataType=FlyDataType.TableDirect, entityType="D", printName="自定义页签", fieldLength=22)
	AD_UserDef_Tab_ID,
	//
	@FlyElement(name="自定义窗口", dataType=FlyDataType.TableDirect, entityType="D", printName="自定义窗口", fieldLength=22)
	AD_UserDef_Win_ID,
	//
	@FlyElement(name="客户或联系人", description="User within the system - Internal or Business Partner Contact", help="The User identifies a unique user in the system. This could be an internal user or a business partner contact", dataType=FlyDataType.ID, entityType="D", printName="用户", fieldLength=22)
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
	@FlyElement(name="动态验证", description="验证规则", help="The Validation Rule indicates a unique validation rule.  These rules define how an entry is determined to valid or invalid. ", dataType=FlyDataType.TableDirect, entityType="D", printName="验证", fieldLength=22)
	AD_Val_Rule_ID,
	//
	@FlyElement(name="Workflow Activity", description="Workflow Activity", help="The Workflow Activity is the actual Workflow Node in a Workflow Process instance", dataType=FlyDataType.ID, entityType="D", printName="Wf Activity", fieldLength=22)
	AD_WF_Activity_ID,
	//
	@FlyElement(name="Workflow Activity Result", description="Result of the Workflow Process Activity", help="Activity Result of the execution of the Workflow Process Instrance", dataType=FlyDataType.ID, entityType="D", printName="Wf Activity Result", fieldLength=22)
	AD_WF_ActivityResult_ID,
	//
	@FlyElement(name="Workflow Block", description="Workflow Transaction Execution Block", help="A workflow execution block is optional and allows all work to be performed in a single transaction. If one step (node activity) fails, the entire work is rolled back.", dataType=FlyDataType.ID, entityType="D", printName="Wf Block", fieldLength=22)
	AD_WF_Block_ID,
	//
	@FlyElement(name="Workflow Event Audit", description="Workflow Process Activity Event Audit Information", help="History of chenges ov the Workflow Process Activity", dataType=FlyDataType.ID, entityType="D", printName="Wf Event Audit", fieldLength=22)
	AD_WF_EventAudit_ID,
	//
	@FlyElement(name="Transition Condition", description="Workflow Node Transition Condition", help="Optional restriction of transition of one node to the next", dataType=FlyDataType.ID, entityType="D", printName="Condition", fieldLength=22)
	AD_WF_NextCondition_ID,
	//
	@FlyElement(name="下一结点", description="在工作流中的下一个结点", help="The Next Node indicates the next step or task in this Workflow.", dataType=FlyDataType.Table, entityType="D", printName="下一结点", fieldLength=22)
	AD_WF_Next_ID,
	//
	@FlyElement(name="结点", description="Workflow Node, step or process", help="The Workflow Node indicates a unique step or process in a Workflow.", dataType=FlyDataType.ID, entityType="D", printName="结点", fieldLength=22)
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
	@FlyElement(name="窗口 ", description="数据输入或显示视窗", help="The Window field identifies a unique Window in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="窗口 ", fieldLength=22)
	AD_Window_ID,
	//
	@FlyElement(name="工作台", description="Collection of windows, reports", dataType=FlyDataType.TableDirect, entityType="D", printName="工作台", fieldLength=22)
	AD_Workbench_ID,
	//
	@FlyElement(name="工作台窗口", dataType=FlyDataType.ID, entityType="D", printName="工作台窗口", fieldLength=22)
	AD_WorkbenchWindow_ID,
	//
	@FlyElement(name="工作流", description="Workflow or combination of tasks", help="The Workflow field identifies a unique Workflow in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="工作流", fieldLength=22)
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
	@FlyElement(name="帐户电子邮件", description="电子邮件地址", help="The EMail Address indicates the EMail address off the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="电子邮件", fieldLength=60)
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
	@FlyElement(name="在配送之后", description="Due after delivery rather than after invoicing", help="The After Delivery checkbox indicates that payment is due after delivery as opposed to after invoicing.", dataType=FlyDataType.YesNo, entityType="D", printName="在配送之后", fieldLength=1)
	AfterDelivery,
	//
	@FlyElement(name="Funding Mode Account", dataType=FlyDataType.NONE, entityType="D", printName="Funding Mode Acct", fieldLength=0)
	A_FundingMode_Acct,
	//
	@FlyElement(name="Asset Funding Mode", dataType=FlyDataType.NONE, entityType="D", printName="Asset Funding Mode", fieldLength=0)
	A_FundingMode_ID,
	//
	@FlyElement(name="驾驶者执照", description="Payment Identification - Driver License", help="The Driver's License being used as identification.", dataType=FlyDataType.String, entityType="D", printName="驾驶者执照", fieldLength=20)
	A_Ident_DL,
	//
	@FlyElement(name="社会保险号", description="Payment Identification - Social Security No", help="The Social Security number being used as identification.", dataType=FlyDataType.String, entityType="D", printName="社会保险号", fieldLength=20)
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
	@FlyElement(name="警报信息", description="警报信息", help="The message of the email sent for the alert", dataType=FlyDataType.Text, entityType="D", printName="警报信息", fieldLength=2000)
	AlertMessage,
	//
	@FlyElement(name="Alert over Priority", description="Send alert email when over priority", help="Send alert email when a suspended activity is over the  priority defined", dataType=FlyDataType.Integer, entityType="D", printName="Alert over Priority", fieldLength=22)
	AlertOverPriority,
	//
	@FlyElement(name="警报主题", description="警报主题", help="The subject of the email message sent for the alert", dataType=FlyDataType.String, entityType="D", printName="警报主题", fieldLength=60)
	AlertSubject,
	//
	@FlyElement(name="别名", description="Defines an alternate method of indicating an account combination.", help="The Alias field allows you to define a alternate method for referring to a full account combination.  For example, the Account Receivable Account for Garden World may be aliased as GW_AR.", dataType=FlyDataType.String, entityType="D", printName="别名", fieldLength=40)
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
	@FlyElement(name="允许UoM分数", description="Allow Unit of Measure Fractions", help="If allowed, you can enter UoM Fractions", dataType=FlyDataType.YesNo, entityType="D", printName="允许UoM分数", fieldLength=1)
	AllowUoMFractions,
	//
	@FlyElement(name="Allow XLS View", dataType=FlyDataType.YesNo, entityType="D", printName="Allow XLS View", fieldLength=1)
	Allow_XLS_View,
	//
	@FlyElement(name="Check all DB Tables", description="Check not just this table", dataType=FlyDataType.NONE, entityType="D", printName="Check all DB Tables", fieldLength=0)
	AllTables,
	//
	@FlyElement(name="Alpha", description="颜色Alpha值 0-255", dataType=FlyDataType.Integer, entityType="D", printName="Alpha", fieldLength=22)
	Alpha,
	//
	@FlyElement(name="第二个Alpha", description="第二个颜色Alpha值", dataType=FlyDataType.Integer, entityType="D", printName="第二个Alpha", fieldLength=22)
	Alpha_1,
	//
	@FlyElement(name="Asset Monthly Payment", dataType=FlyDataType.Amount, entityType="D", printName="Asset Monthly Payment", fieldLength=22)
	A_Monthly_Payment,
	//
	@FlyElement(name="金额", description="被定义的币种金额", help="The Amount indicates the amount for this document line.", dataType=FlyDataType.Amount, entityType="D", printName="金额", fieldLength=22)
	Amount,
	//
	@FlyElement(name="AmountRefunded", dataType=FlyDataType.Amount, entityType="D", printName="AmountRefunded", fieldLength=22)
	AmountRefunded,
	//
	@FlyElement(name="AmountTendered", dataType=FlyDataType.Amount, entityType="D", printName="AmountTendered", fieldLength=22)
	AmountTendered,
	//
	@FlyElement(name="金额类型", description="金额的类型到报表", help="You can choose between the total and period amounts as well as the balance or just the debit credit amounts.", dataType=FlyDataType.List, entityType="D", printName="金额类型", fieldLength=2)
	AmountType,
	//
	@FlyElement(name="金额", description="金额", help="金额", dataType=FlyDataType.Amount, entityType="D", printName="金额", fieldLength=22)
	Amt,
	//
	@FlyElement(name="Accounted Amount", description="Amount Balance in Currency of Accounting Schema", dataType=FlyDataType.Amount, entityType="D", printName="Accounted", fieldLength=22)
	AmtAcct,
	//
	@FlyElement(name="Accounted Balance", description="Accounted Balance Amount", help="The Account Balance Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="Balance", fieldLength=22)
	AmtAcctBalance,
	//
	@FlyElement(name="帐户贷方", description="帐户贷方金额", help="The Account Credit Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="帐户贷方", fieldLength=22)
	AmtAcctCr,
	//
	@FlyElement(name="帐户借方", description="帐户借方金额", help="The Account Debit Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="帐户借方", fieldLength=22)
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
	@FlyElement(name="批准金额", description="The approval amount limit for this role", help="The Approval Amount field indicates the amount limit this Role has for approval of documents.", dataType=FlyDataType.Amount, entityType="D", printName="批准金额", fieldLength=22)
	AmtApproval,
	//
	@FlyElement(name="大写金额", description="大写金额", help="Amount in words will be printed.", dataType=FlyDataType.Amount, entityType="D", printName="大写金额", fieldLength=22)
	AmtInWords,
	//
	@FlyElement(name="Amount LL", description="Amount Lower Level Cost", help="Amount Lower Level Cost", dataType=FlyDataType.NONE, entityType="D", printName="Amt Lower Level", fieldLength=0)
	AmtLL,
	//
	@FlyElement(name="Lost Sales Amt", description="Amount of lost sales in Invoice Currency", dataType=FlyDataType.Amount, entityType="D", printName="Lost Sales Amt", fieldLength=22)
	AmtLostSales,
	//
	@FlyElement(name="乘数金额", description="Multiplier Amount for generating commissions", help="The Multiplier Amount indicates the amount to multiply the total amount generated by this commission run by.", dataType=FlyDataType.Number, entityType="D", printName="乘数金额", fieldLength=22)
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
	@FlyElement(name="贷方来源", description="贷方来源金额", help="The Source Credit Amount indicates the credit amount for this line in the source currency.", dataType=FlyDataType.Amount, entityType="D", printName="贷方来源", fieldLength=22)
	AmtSourceCr,
	//
	@FlyElement(name="借方来源", description="借方来源金额", help="The Source Debit Amount indicates the credit amount for this line in the source currency.", dataType=FlyDataType.Amount, entityType="D", printName="借方来源", fieldLength=22)
	AmtSourceDr,
	//
	@FlyElement(name="减去金额", description="Subtract Amount for generating commissions", help="The Subtract Amount indicates the amount to subtract from the total amount prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="减去金额", fieldLength=22)
	AmtSubtract,
	//
	@FlyElement(name="帐户名字", description="Name on Credit Card or Account holder", help="The Name of the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="帐户名字", fieldLength=60)
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
	@FlyElement(name="区号", description="长途区号", help="长途区号", dataType=FlyDataType.String, entityType="D", printName="区号", fieldLength=10)
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
	@FlyElement(name="资产折旧日期", description="最近折旧日期", help="Date of the last deprecation, if the asset is used internally and depreciated.", dataType=FlyDataType.Date, entityType="D", printName="资产折旧日期", fieldLength=7)
	AssetDepreciationDate,
	//
	@FlyElement(name="资产处理日期", description="Date when the asset is was disposed", dataType=FlyDataType.Date, entityType="D", printName="资产处理日期", fieldLength=7)
	AssetDisposalDate,
	//
	@FlyElement(name="市场价值金额", description="资产的市场价格", help="For reporting, the market value of the asset", dataType=FlyDataType.Amount, entityType="D", printName="市场价值金额", fieldLength=22)
	AssetMarketValueAmt,
	//
	@FlyElement(name="Depreciation Amount / Period", description="Applies to Straight Line depreciation", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Amount / Period", fieldLength=0)
	AssetPeriodDepreciationAmt,
	//
	@FlyElement(name="在服务日期内", description="Date when Asset was put into service", help="The date when the asset was put into service - usually used as start date for depreciation.", dataType=FlyDataType.Date, entityType="D", printName="在服务日期内", fieldLength=7)
	AssetServiceDate,
	//
	@FlyElement(name="Source Amount", dataType=FlyDataType.NONE, entityType="D", printName="Source Amount", fieldLength=0)
	AssetSourceAmt,
	//
	@FlyElement(name="Asset Value", dataType=FlyDataType.NONE, entityType="D", printName="Asset Value", fieldLength=0)
	AssetValue,
	//
	@FlyElement(name="资产价值", description="资产的帐面价格", dataType=FlyDataType.Amount, entityType="D", printName="资产价值", fieldLength=22)
	AssetValueAmt,
	//
	@FlyElement(name="分配来自", description="分配资源从", help="任务开始", dataType=FlyDataType.DateTime, entityType="D", printName="分配来自", fieldLength=7)
	AssignDateFrom,
	//
	@FlyElement(name="分配到", description="分配资源直到", help="任务结束", dataType=FlyDataType.DateTime, entityType="D", printName="分配到", fieldLength=7)
	AssignDateTo,
	//
	@FlyElement(name="From Asset", dataType=FlyDataType.Table, entityType="D", printName="From Asset", fieldLength=22)
	A_Start_Asset_ID,
	//
	@FlyElement(name="帐户州", description="State of the Credit Card or Account holder", help="The State of the Credit Card or Account holder", dataType=FlyDataType.String, entityType="D", printName="州", fieldLength=40)
	A_State,
	//
	@FlyElement(name="帐户街道", description="Street address of the Credit Card or Account holder", help="The Street Address of the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="街道", fieldLength=60)
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
	@FlyElement(name="属性", dataType=FlyDataType.String, entityType="D", printName="属性", fieldLength=60)
	Attribute,
	//
	@FlyElement(name="Attribute Name", description="Name of the Attribute", help="Identifier of the attribute", dataType=FlyDataType.String, entityType="D", printName="Attribute Name", fieldLength=60)
	AttributeName,
	//
	@FlyElement(name="Attribute Value", description="Value of the Attribute", dataType=FlyDataType.String, entityType="D", printName="Attribute Value", fieldLength=60)
	AttributeValue,
	//
	@FlyElement(name="Attribute Value Type", description="Type of Attribute Value", help="The Attribute Value type deternines the data/validation type", dataType=FlyDataType.List, entityType="D", printName="Attribute Value Type", fieldLength=1)
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
	@FlyElement(name="自动分期控制", description="If selected, the periods are automatically opened and closed", help="In the Automatic Period Control, periods are opened and closed based on the current date.  If the Manual alternative is activated, you have to open and close periods explicitly.", dataType=FlyDataType.YesNo, entityType="D", printName="自动分期控制", fieldLength=1)
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
	@FlyElement(name="Account Zip Postal", description="Zip Code of the Credit Card or Account Holder", help="The Zip Code of the Credit Card or Account Holder.", dataType=FlyDataType.String, entityType="D", printName="邮递区号 ", fieldLength=20)
	A_Zip,
	//
	@FlyElement(name="Backup Folder", description="Backup Folder", dataType=FlyDataType.FilePath, entityType="D", printName="Backup Folder", fieldLength=255)
	BackupFolder,
	//
	@FlyElement(name="Backup Value", description="The value of the column prior to migration.", dataType=FlyDataType.NONE, entityType="D", printName="Backup Value", fieldLength=0)
	BackupValue,
	//
	@FlyElement(name="余款", dataType=FlyDataType.Amount, entityType="D", printName="余款", fieldLength=22)
	Balance,
	//
	@FlyElement(name="银行帐户号", description="银行帐户号", dataType=FlyDataType.String, entityType="D", printName="银行帐户号", fieldLength=20)
	BankAccountNo,
	//
	@FlyElement(name="银行帐户类型", description="银行帐户类型", help="The Bank Account Type field indicates the type of account (savings, checking etc) this account  is defined as.", dataType=FlyDataType.List, entityType="D", printName="帐户类型", fieldLength=1)
	BankAccountType,
	//
	@FlyElement(name="Bank Name", dataType=FlyDataType.String, entityType="D", printName="Bank Name", fieldLength=120)
	BankName,
	//
	@FlyElement(name="Barcode Type", description="Type of barcode", dataType=FlyDataType.List, entityType="D", printName="Barcode", fieldLength=3)
	BarcodeType,
	//
	@FlyElement(name="Base", description="Calculation Base", dataType=FlyDataType.Number, entityType="D", printName="Base", fieldLength=22)
	Base,
	//
	@FlyElement(name="基本的价格目录", description="Pricelist to be used, if product not found on this pricelist", help="The Base Price List identifies the default price list to be used if a product is not found on the selected price list", dataType=FlyDataType.Table, entityType="D", printName="基础", fieldLength=22)
	BasePriceList_ID,
	//
	@FlyElement(name="银行资产", description="银行资产帐户", help="The Bank Asset Account identifies the account to be used for booking changes to the balance in this bank account", dataType=FlyDataType.Account, entityType="D", printName="银行资产", fieldLength=22)
	B_Asset_Acct,
	//
	@FlyElement(name="批描述", description="批的描述", dataType=FlyDataType.String, entityType="D", printName="批描述", fieldLength=255)
	BatchDescription,
	//
	@FlyElement(name="批文件号", description="文档批的数字", dataType=FlyDataType.String, entityType="D", printName="批文件号", fieldLength=30)
	BatchDocumentNo,
	//
	@FlyElement(name="BBAN", description="Basic Bank Account Number", help="The Basic (or Domestic) Bank Account Number is used in Bank transfers (see also IBAN). For details see ISO 13616 and http://www.ecbs.org/", dataType=FlyDataType.String, entityType="D", printName="BBAN", fieldLength=40)
	BBAN,
	//
	@FlyElement(name="Bid Comment", description="Make a comment to a Bid Topic", help="Everyone can give comments concerning a Bid Topic - e.g. Questions, Suggestions", dataType=FlyDataType.ID, entityType="D", printName="Bid Comment", fieldLength=22)
	B_BidComment_ID,
	//
	@FlyElement(name="Bid", description="Bid for a Topic", help="You can create a bid for a topic.  Depening on the type, the highest bidder wins the Topic - or you participate in funding for a Topic.", dataType=FlyDataType.ID, entityType="D", printName="Bid", fieldLength=22)
	B_Bid_ID,
	//
	@FlyElement(name="Buyer Funds", description="Buyer Funds for Bids on Topics", help="Available Funds (from Payments) and Committed or Uncommited funds for Bids", dataType=FlyDataType.ID, entityType="D", printName="Buyer Funds", fieldLength=22)
	B_BuyerFunds_ID,
	//
	@FlyElement(name="期初余款", description="Balance prior to any transactions", help="The Beginning Balance is the balance prior to making any adjustments for payments or disbursements.", dataType=FlyDataType.Amount, entityType="D", printName="期初余款", fieldLength=22)
	BeginningBalance,
	//
	@FlyElement(name="Beginning Qty Balance", description="Quantity Balance prior to any transactions", help="The Quantity Beginning Balance is the balance prior", dataType=FlyDataType.NONE, entityType="D", printName="Beginning Qty Balance", fieldLength=0)
	BeginningQtyBalance,
	//
	@FlyElement(name="下面列", description="Print this column below the column index entered", help="This column is printed in a second line below the content of the first line identified. Please be aware, that this is depends on the actual sequence. Enter a 1 to add the info below the first column.", dataType=FlyDataType.Integer, entityType="D", printName="下面列", fieldLength=22)
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
	@FlyElement(name="受益人", description="Business Partner to whom payment is made", help="The Beneficiary indicates the Business Partner to whom payment will be made.  This field is only displayed if the Paid to Third Party checkbox is selected.", dataType=FlyDataType.Table, entityType="D", printName="受益人", fieldLength=22)
	Beneficiary,
	//
	@FlyElement(name="Best Response Amount", description="Best Response Amount", help="Filled by Rank Response Process", dataType=FlyDataType.Amount, entityType="D", printName="Best Response", fieldLength=22)
	BestResponseAmt,
	//
	@FlyElement(name="银行费用", description="银行费用帐户", help="The Bank Expense Account identifies the account to be used for recording charges or fees incurred from this Bank.", dataType=FlyDataType.Account, entityType="D", printName="银行费用", fieldLength=22)
	B_Expense_Acct,
	//
	@FlyElement(name="下载交货业务伙伴", description="Business Partner for Drop Shipment", dataType=FlyDataType.Table, entityType="D", printName="下载交货业务伙伴", fieldLength=22)
	Bill_BPartner_ID,
	//
	@FlyElement(name="Invoice Tax ID", dataType=FlyDataType.String, entityType="D", printName="Invoice Tax ID", fieldLength=20)
	Bill_BPTaxID,
	//
	@FlyElement(name="Invoice Partner Key", dataType=FlyDataType.String, entityType="D", printName="Invoice Partner Key", fieldLength=40)
	Bill_BPValue,
	//
	@FlyElement(name="Invoice Address", dataType=FlyDataType.Location, entityType="D", printName="Invoice Address", fieldLength=22)
	Bill_C_Location_ID,
	//
	@FlyElement(name="Invoice Contact Name", dataType=FlyDataType.String, entityType="D", printName="Invoice Contact Name", fieldLength=60)
	Bill_ContactName,
	//
	@FlyElement(name="发票地址", description="Business Partner Shipment Location for Drop Shipment", dataType=FlyDataType.Table, entityType="D", printName="发票地址", fieldLength=22)
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
	@FlyElement(name="发票接收地址", description="帐单接收地址", help="The Bill Invoice To indicates the address to use when remitting bills", dataType=FlyDataType.Table, entityType="D", printName="发票接收地址", fieldLength=22)
	BillTo_ID,
	//
	@FlyElement(name="发票联系人", description="Business Partner Contact for Drop Shipment", dataType=FlyDataType.Table, entityType="D", printName="发票联系人", fieldLength=22)
	Bill_User_ID,
	//
	@FlyElement(name="二进制数据", description="二进制数据", help="The Binary field stores binary data.", dataType=FlyDataType.Binary, entityType="D", printName="二进制", fieldLength=4000)
	BinaryData,
	//
	@FlyElement(name="银行利息费用", description="银行利息费用帐户", help="The Bank Interest Expense Account identifies the account to be used for recording interest expenses.", dataType=FlyDataType.Account, entityType="D", printName="银行利息费用", fieldLength=22)
	B_InterestExp_Acct,
	//
	@FlyElement(name="银行利息收入", description="银行利息收入帐户", help="The Bank Interest Revenue Account identifies the account to be used for recording interest revenue from this Bank.", dataType=FlyDataType.Account, entityType="D", printName="银行利息收入", fieldLength=22)
	B_InterestRev_Acct,
	//
	@FlyElement(name="转帐中银行", description="转帐中银行帐户", help="The Bank in Transit Account identifies the account to be used for funds which are in transit.", dataType=FlyDataType.Account, entityType="D", printName="转帐中银行", fieldLength=22)
	B_InTransit_Acct,
	//
	@FlyElement(name="生日", description="生日或周年日", help="生日或周年日", dataType=FlyDataType.Date, entityType="D", printName="生日", fieldLength=7)
	Birthday,
	//
	@FlyElement(name="蓝色", description="蓝色的RGB值", dataType=FlyDataType.Integer, entityType="D", printName="蓝色", fieldLength=22)
	Blue,
	//
	@FlyElement(name="第二个蓝色", description="RGB 第二颜色值", dataType=FlyDataType.Integer, entityType="D", printName="第二个蓝色", fieldLength=22)
	Blue_1,
	//
	@FlyElement(name="Offer", description="Offer for a Topic", help="You can create an offer for a topic.", dataType=FlyDataType.ID, entityType="D", printName="Offer", fieldLength=22)
	B_Offer_ID,
	//
	@FlyElement(name="Component Type", description="BOM Product Type", dataType=FlyDataType.List, entityType="D", printName="Component Type", fieldLength=1)
	BOMProductType,
	//
	@FlyElement(name="物料清单数量", description="物料清单数量", help="The BOM Quantity indicates the quantity of the product in its Unit of Measure (multiplication)", dataType=FlyDataType.Quantity, entityType="D", printName="数量", fieldLength=22)
	BOMQty,
	//
	@FlyElement(name="物料清单类型", description="BOM 的类型", help="Type of Bill of Materials Part. A Standard Part (default) is always included in a BOM. An Optional Part can be selected in 'Drop BOM'. If a Part is member of one of the alternative groups, you can select one part in that group in the 'Drop BOM' functionaly (example: either 64/256/512 MB Memory).", dataType=FlyDataType.List, entityType="D", printName="物料清单类型", fieldLength=1)
	BOMType,
	//
	@FlyElement(name="BOM Use", description="The use of the Bill of Material", help="By default the Master BOM is used, if the alternatives are not defined", dataType=FlyDataType.List, entityType="D", printName="BOM Use", fieldLength=1)
	BOMUse,
	//
	@FlyElement(name="Access Type", description="Type of Access of the user/contact to Business Partner information and resources", help="If on User level, 'Full BP Access' is NOT selected, give access explicitly", dataType=FlyDataType.List, entityType="D", printName="Access Type", fieldLength=1)
	BPAccessType,
	//
	@FlyElement(name="B.Partner Column", description="Fully qualified Business Partner key column (C_BPartner_ID)", help="The Business Partner Column indicates the Business Partner to use when calculating this measurement", dataType=FlyDataType.String, entityType="D", printName="业务伙伴列", fieldLength=60)
	BPartnerColumn,
	//
	@FlyElement(name="伙伴的上级机构", description="业务伙伴的上级", help="The parent (organization) of the Business Partner for reporting purposes.", dataType=FlyDataType.ID, entityType="D", printName="伙伴的上级", fieldLength=22)
	BPartner_Parent_ID,
	//
	@FlyElement(name="业务伙伴关键字", description="业务伙伴的关键字", dataType=FlyDataType.String, entityType="D", printName="业务伙伴关键字", fieldLength=40)
	BPartnerValue,
	//
	@FlyElement(name="业务伙伴关键字", description="The Key of the Business Partner", dataType=FlyDataType.String, entityType="D", printName="业务伙伴关键字", fieldLength=40)
	BPartner_Value,
	//
	@FlyElement(name="付款选择", description="AP Payment Selection Clearing Account", dataType=FlyDataType.Account, entityType="D", printName="付款选择", fieldLength=22)
	B_PaymentSelect_Acct,
	//
	@FlyElement(name="Account Usage", description="Business Partner Bank Account usage", help="Determines how the bank account is used.", dataType=FlyDataType.List, entityType="D", printName="Account Usage", fieldLength=1)
	BPBankAcctUse,
	//
	@FlyElement(name="业务伙伴联系人问候", description="Greeting for Business Partner Contact", dataType=FlyDataType.String, entityType="D", printName="业务伙伴联系人问候", fieldLength=60)
	BPContactGreeting,
	//
	@FlyElement(name="业务伙伴问候", description="问候对业务伙伴", dataType=FlyDataType.String, entityType="D", printName="业务伙伴问候", fieldLength=60)
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
	@FlyElement(name="业务伙伴搜寻关键字", description="业务伙伴关键字值", help="Search Key of Business Partner", dataType=FlyDataType.String, entityType="D", printName="客户号", fieldLength=40)
	BPValue,
	//
	@FlyElement(name="Branch ID", description="Bank Branch ID", help="Dependent on the loader, you may have to provide a bank branch ID", dataType=FlyDataType.String, entityType="D", printName="Branch ID", fieldLength=20)
	BranchID,
	//
	@FlyElement(name="休息折扣 %", description="Trade Discount in Percent for the break level", help="Trade Discount in Percent for the break level", dataType=FlyDataType.Number, entityType="D", printName="休息折扣", fieldLength=22)
	BreakDiscount,
	//
	@FlyElement(name="休息价值", description="Low Value of trade discount break level", help="Starting Quantity or Amount Value for break level", dataType=FlyDataType.Number, entityType="D", printName="休息价值", fieldLength=22)
	BreakValue,
	//
	@FlyElement(name="银行估价增益", description="银行估价增益帐户", help="The Bank Revaluation Gain Account identifies the account to be used for recording gains that are recognized when converting currencies.", dataType=FlyDataType.Account, entityType="D", printName="银行估价增益", fieldLength=22)
	B_RevaluationGain_Acct,
	//
	@FlyElement(name="银行估价损失", description="银行估价损失帐户", help="The Bank Revaluation Loss Account identifies the account to be used for recording losses that are recognized when converting currencies.", dataType=FlyDataType.Account, entityType="D", printName="银行估价损失", fieldLength=22)
	B_RevaluationLoss_Acct,
	//
	@FlyElement(name="Seller Funds", description="Seller Funds from Offers on Topics", help="Available Funds (for Payments) and Committed or Uncommited funds from Offers", dataType=FlyDataType.ID, entityType="D", printName="Seller Funds", fieldLength=22)
	B_SellerFunds_ID,
	//
	@FlyElement(name="银行结算增益", description="银行结算增益帐户", help="The Bank Settlement Gain account identifies the account to be used when recording a currency gain when the settlement and receipt currency are not the same.", dataType=FlyDataType.Account, entityType="D", printName="银行结算增益", fieldLength=22)
	B_SettlementGain_Acct,
	//
	@FlyElement(name="银行结算损失", description="银行结算损失帐户", help="The Bank Settlement loss account identifies the account to be used when recording a currency loss when the settlement and receipt currency are not the same.", dataType=FlyDataType.Account, entityType="D", printName="银行结算损失", fieldLength=22)
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
	@FlyElement(name="预算状态", description="指示该预算的状态", help="The Budget Status indicates the current status of this budget (i.e Draft, Approved)", dataType=FlyDataType.List, entityType="D", printName="预算状态", fieldLength=1)
	BudgetStatus,
	//
	@FlyElement(name="未分派现金", description="Unallocated Cash Clearing Account", help="Receipts not allocated to Invoices", dataType=FlyDataType.Account, entityType="D", printName="未分派现金", fieldLength=22)
	B_UnallocatedCash_Acct,
	//
	@FlyElement(name="银行未经确认的收据", description="Bank Unidentified Receipts Account", help="The Bank Unidentified Receipts Account identifies the account to be used when recording receipts that can not be reconciled at the present time.", dataType=FlyDataType.Account, entityType="D", printName="未经确认的银行", fieldLength=22)
	B_Unidentified_Acct,
	//
	@FlyElement(name="Accounting Processor", description="Accounting Processor/Server Parameters", help="Accounting Processor/Server Parameters", dataType=FlyDataType.TableDirect, entityType="D", printName="Accounting Processor", fieldLength=22)
	C_AcctProcessor_ID,
	//
	@FlyElement(name="Accounting Processor Log", description="Result of the execution of the Accounting Processor", help="Result of the execution of the Accounting Processor", dataType=FlyDataType.ID, entityType="D", printName="Acct Processor Log", fieldLength=22)
	C_AcctProcessorLog_ID,
	//
	@FlyElement(name="主会计模式", description="主帐户规则", help="An Accounting  Schema defines the rules used accounting such as costing method, currency and calendar.", dataType=FlyDataType.Table, entityType="D", printName="主会计模式", fieldLength=22)
	C_AcctSchema1_ID,
	//
	@FlyElement(name="Acct.Schema Element", dataType=FlyDataType.ID, entityType="D", printName="Acct.Schema Element", fieldLength=22)
	C_AcctSchema_Element_ID,
	//
	@FlyElement(name="会计模式", description="帐户的规则", help="An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar", dataType=FlyDataType.TableDirect, entityType="D", printName="会计模式", fieldLength=22)
	C_AcctSchema_ID,
	//
	@FlyElement(name="活动", description="业务活动", help="Activities indicate tasks that are performed and used to utilize Activity based Costing", dataType=FlyDataType.Table, entityType="D", printName="活动", fieldLength=22)
	C_Activity_ID,
	//
	@FlyElement(name="计算类", description="Java Class for calculation, implementing Interface Measure", help="The Calculation Class indicates the Java Class used for calculating measures.", dataType=FlyDataType.String, entityType="D", printName="计算类", fieldLength=60)
	CalculationClass,
	//
	@FlyElement(name="计算", dataType=FlyDataType.List, entityType="D", printName="计算", fieldLength=1)
	CalculationType,
	//
	@FlyElement(name="年", description="日历年", help="The Year identifies the accounting year for a calendar.", dataType=FlyDataType.String, entityType="D", printName="年", fieldLength=4)
	CalendarYear,
	//
	@FlyElement(name="配置", description="付款配置", dataType=FlyDataType.TableDirect, entityType="D", printName="配置", fieldLength=22)
	C_AllocationHdr_ID,
	//
	@FlyElement(name="Allocation Line", description="Allocation Line", help="Allocation of Cash/Payment to Invoice", dataType=FlyDataType.ID, entityType="D", printName="Allocation Line", fieldLength=22)
	C_AllocationLine_ID,
	//
	@FlyElement(name="Callout", description="Function Calls separated by semicolons; SE_ SL_ UE_ UL_ - 1st: System User; 2nd: Enter Leave; 3rd: _ Underscore, - then Function Name", help="A Callout allow you to create Java extensions to perform certain tasks always after a value changed. Callouts should not be used for validation but consquences of a user selecting a certain value.	The callout is a Java class implementing org.compiere.model.Callout and a method name to call.  Example: 'org.compiere.model.CalloutRequest.copyText' instanciates the class 'CalloutRequest' and calls the method 'copyText'. You can have multiple callouts by separating them via a semicolon", dataType=FlyDataType.String, entityType="D", printName="Callout", fieldLength=255)
	Callout,
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
	@FlyElement(name="现金类型", description="现金来源", help="The Cash Type indicates the source for this Cash Journal Line.", dataType=FlyDataType.List, entityType="D", printName="现金类型", fieldLength=1)
	CashType,
	//
	@FlyElement(name="Category", dataType=FlyDataType.String, entityType="D", printName="Category", fieldLength=120)
	Category,
	//
	@FlyElement(name="Category Column", description="Fully qualified data category column", help="The Category Column determines how the chart data is grouped", dataType=FlyDataType.String, entityType="D", printName="Category Column", fieldLength=60)
	CategoryColumn,
	//
	@FlyElement(name="分类名", description="分类名", dataType=FlyDataType.String, entityType="D", printName="分类名", fieldLength=60)
	CategoryName,
	//
	@FlyElement(name="种类类型", description="Source of the Journal with this category", help="The Category Type indicates the source of the journal for this category.  Journals can be generated from a document, entered manually or imported.", dataType=FlyDataType.List, entityType="D", printName="种类类型", fieldLength=1)
	CategoryType,
	//
	@FlyElement(name="银行帐户文件", description="Checks, Transfers, etc.", help="Bank documents, you generate or track", dataType=FlyDataType.ID, entityType="D", printName="银行帐户文件", fieldLength=22)
	C_BankAccountDoc_ID,
	//
	@FlyElement(name="银行帐户", description="在银行的帐户", help="The Bank Account identifies an account at this Bank.", dataType=FlyDataType.ID, entityType="D", printName="银行帐户", fieldLength=22)
	C_BankAccount_ID,
	//
	@FlyElement(name="银行", description="银行", help="The Bank is a unique identifier of a Bank for this Organization or for a Business Partner with whom this Organization transacts.", dataType=FlyDataType.ID, entityType="D", printName="银行", fieldLength=22)
	C_Bank_ID,
	//
	@FlyElement(name="银行对帐单", description="银行对帐单", help="The Bank Statement identifies a unique Bank Statement for a defined time period.  The statement defines all transactions that occurred", dataType=FlyDataType.ID, entityType="D", printName="银行对帐单", fieldLength=22)
	C_BankStatement_ID,
	//
	@FlyElement(name="银行对帐单明细", description="Line on a statement from this Bank", help="The Bank Statement Line identifies a unique transaction (Payment, Withdrawal, Charge) for the defined time period at this Bank.", dataType=FlyDataType.ID, entityType="D", printName="银行对帐单明细", fieldLength=22)
	C_BankStatementLine_ID,
	//
	@FlyElement(name="Bank Statement Loader", description="Definition of Bank Statement Loader (SWIFT, OFX)", help="The loader definition privides the parameters to load bank statements from EFT formats like SWIFT (MT940) or OFX", dataType=FlyDataType.ID, entityType="D", printName="Bank Statement Loader", fieldLength=22)
	C_BankStatementLoader_ID,
	//
	@FlyElement(name="Bank Statement Matcher", description="Algorithm to match Bank Statement Info to Business Partners, Invoices and Payments", help="An algorithm to find Business Partners, Invoices, Payments in imported Bank Statements", dataType=FlyDataType.ID, entityType="D", printName="Bank Statement Matcher", fieldLength=22)
	C_BankStatementMatcher_ID,
	//
	@FlyElement(name="现金帐簿资产", description="现金帐簿资产帐户", help="The Cash Book Asset Account identifies the account to be used for recording payments into and disbursements from this cash book.", dataType=FlyDataType.Account, entityType="D", printName="现金帐簿资产", fieldLength=22)
	CB_Asset_Acct,
	//
	@FlyElement(name="现金转帐", description="Cash Transfer Clearing Account", help="Account for Invoices paid by cash", dataType=FlyDataType.Account, entityType="D", printName="现金转帐", fieldLength=22)
	CB_CashTransfer_Acct,
	//
	@FlyElement(name="现金帐簿差额", description="现金帐簿差额帐户", help="The Cash Book Differences Account identifies the account to be used for recording any differences that affect this cash book", dataType=FlyDataType.Account, entityType="D", printName="现金帐簿差额", fieldLength=22)
	CB_Differences_Acct,
	//
	@FlyElement(name="现金帐簿费用", description="现金帐簿费用帐户", help="The Cash Book Expense Account identifies the account to be used for general, non itemized expenses.", dataType=FlyDataType.Account, entityType="D", printName="现金帐簿费用", fieldLength=22)
	CB_Expense_Acct,
	//
	@FlyElement(name="业务伙伴模板", description="Business Partner used for creating new Business Partners on the fly", help="When creating a new Business Partner from the Business Partner Search Field (right-click: Create), the selected business partner is used as a template, e.g. to define price list, payment terms, etc.", dataType=FlyDataType.Search, entityType="D", printName="业务伙伴模板", fieldLength=22)
	C_BPartnerCashTrx_ID,
	//
	@FlyElement(name="业务伙伴 ", description="标识业务伙伴", help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson", dataType=FlyDataType.Search, entityType="D", printName="业务伙伴 ", fieldLength=22)
	C_BPartner_ID,
	//
	@FlyElement(name="业务伙伴地址", description="Identifies the (ship to) address for this Business Partner", help="The Partner address indicates the location of a Business Partner", dataType=FlyDataType.TableDirect, entityType="D", printName="业务伙伴地址", fieldLength=22)
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
	@FlyElement(name="业务伙伴银行帐户", description="Bank Account of the Business Partner", help="The Partner Bank Account identifies the bank account to be used for this Business Partner", dataType=FlyDataType.ID, entityType="D", printName="业务伙伴银行帐户", fieldLength=22)
	C_BP_BankAccount_ID,
	//
	@FlyElement(name="EDI 定义", description="电子的数据交换", dataType=FlyDataType.ID, entityType="D", printName="EDI 定义", fieldLength=22)
	C_BP_EDI_ID,
	//
	@FlyElement(name="业务伙伴组", description="业务伙伴组ID", help="The Business Partner Group ID provides a method of defining defaults to be used for individual Business Partners.", dataType=FlyDataType.TableDirect, entityType="D", printName="业务伙伴组", fieldLength=22)
	C_BP_Group_ID,
	//
	@FlyElement(name="Partner Relation", description="Business Partner Relation", help="Business Partner Relation allow to maintain Third Party Relationship rules: who receives invoices for shipments or pays for invoices.", dataType=FlyDataType.ID, entityType="D", printName="Partner Relation", fieldLength=22)
	C_BP_Relation_ID,
	//
	@FlyElement(name="现金帐簿收据", description="现金帐簿收据帐户", help="The Cash Book Receipt Account identifies the account to be used for general, non itemized cash book receipts.", dataType=FlyDataType.Account, entityType="D", printName="现金帐簿收据", fieldLength=22)
	CB_Receipt_Acct,
	//
	@FlyElement(name="日历", description="会计日历名字", help="The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used.  For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30.", dataType=FlyDataType.ID, entityType="D", printName="日历", fieldLength=22)
	C_Calendar_ID,
	//
	@FlyElement(name="战役", description="营销活动", help="The Campaign defines a unique marketing program.  Projects can be associated with a pre defined Marketing Campaign.  You can then report based on a specific Campaign.", dataType=FlyDataType.Table, entityType="D", printName="战役", fieldLength=22)
	C_Campaign_ID,
	//
	@FlyElement(name="现金帐簿", description="Cash Book for recording petty cash transactions", help="The Cash Book identifies a unique cash book.  The cash book is used to record cash transactions.", dataType=FlyDataType.TableDirect, entityType="D", printName="现金帐簿", fieldLength=22)
	C_CashBook_ID,
	//
	@FlyElement(name="Cash BPartner", description="BPartner to be used for Cash transactions", dataType=FlyDataType.Table, entityType="D", printName="Cash BPartner", fieldLength=22)
	C_CashBPartner_ID,
	//
	@FlyElement(name="现金簿", description="现金簿", help="The Cash Journal uniquely identifies a Cash Journal.  The Cash Journal will record transactions for the cash bank account", dataType=FlyDataType.ID, entityType="D", printName="现金簿", fieldLength=22)
	C_Cash_ID,
	//
	@FlyElement(name="现金簿明细", description="现金簿明细", help="The Cash Journal Line indicates a unique line in a cash journal.", dataType=FlyDataType.Search, entityType="D", printName="现金明细", fieldLength=22)
	C_CashLine_ID,
	//
	@FlyElement(name="渠道", description="销售频道", help="The Sales Channel identifies a channel (or method) of sales generation.", dataType=FlyDataType.TableDirect, entityType="D", printName="渠道", fieldLength=22)
	C_Channel_ID,
	//
	@FlyElement(name="费用", description="附加的文件收费", help="The Charge indicates a type of Charge (Handling, Shipping, Restocking)", dataType=FlyDataType.Table, entityType="D", printName="费用", fieldLength=22)
	C_Charge_ID,
	//
	@FlyElement(name="Charge Type", dataType=FlyDataType.ID, entityType="D", printName="Charge Type", fieldLength=22)
	C_ChargeType_ID,
	//
	@FlyElement(name="城市", description="城市", help="在一个国家中的城市", dataType=FlyDataType.Search, entityType="D", printName="城市", fieldLength=22)
	C_City_ID,
	//
	@FlyElement(name="City Value", dataType=FlyDataType.NONE, entityType="D", printName="City Value", fieldLength=0)
	C_City_Value,
	//
	@FlyElement(name="佣金金额", description="已产生佣金金额 ", help="The Commission Amount indicates the resulting amount from a Commission Run.", dataType=FlyDataType.ID, entityType="D", printName="委任 Amt", fieldLength=22)
	C_CommissionAmt_ID,
	//
	@FlyElement(name="佣金明细", description="Supporting information for Commission Amounts", help="The Commission Detail provides supporting information on a Commission Run.  Each document line that was part of the Commission Run will be reflected here.", dataType=FlyDataType.ID, entityType="D", printName="佣金明细", fieldLength=22)
	C_CommissionDetail_ID,
	//
	@FlyElement(name="Commission Group", dataType=FlyDataType.TableDirect, entityType="D", printName="Commission Group", fieldLength=22)
	C_CommissionGroup_ID,
	//
	@FlyElement(name="佣金", description="佣金", help="The Commission ID is a unique identifier of a set of commission rules.", dataType=FlyDataType.ID, entityType="D", printName="佣金", fieldLength=22)
	C_Commission_ID,
	//
	@FlyElement(name="佣金明细", description="佣金明细", help="The Commission Line is a unique instance of a Commission Run.  If the commission run was done in summary mode then there will be a single line representing the selected documents totals.  If the commission run was done in detail mode then each document that was included in the run will have its own commission line.", dataType=FlyDataType.TableDirect, entityType="D", printName="佣金明细", fieldLength=22)
	C_CommissionLine_ID,
	//
	@FlyElement(name="佣金运行", description="佣金运行或处理", help="The Commission Run is a unique system defined identifier of a specific run of commission.  When a Commission is processed on the Commission Screen, the Commission Run ID will display.", dataType=FlyDataType.TableDirect, entityType="D", printName="佣金运行", fieldLength=22)
	C_CommissionRun_ID,
	//
	@FlyElement(name="Commission Sales Rep ID", dataType=FlyDataType.NONE, entityType="D", printName="Commission Sales Rep ID", fieldLength=0)
	C_CommissionSalesRep_ID,
	//
	@FlyElement(name="Contact Activity", description="Events, tasks, communications related to a contact", dataType=FlyDataType.NONE, entityType="D", printName="Contact Activity", fieldLength=0)
	C_ContactActivity_ID,
	//
	@FlyElement(name="汇率", description="Rate used for converting currencies", help="The Conversion Rate defines the rate (multiply or divide) to use when converting a source currency to an accounting currency.", dataType=FlyDataType.ID, entityType="D", printName="汇率", fieldLength=22)
	C_Conversion_Rate_ID,
	//
	@FlyElement(name="Currency Type", description="Currency Conversion Rate Type", help="The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.", dataType=FlyDataType.TableDirect, entityType="D", printName="Currency Type", fieldLength=22)
	C_ConversionType_ID,
	//
	@FlyElement(name="Revaluation Conversion Type", description="Revaluation Currency Conversion Type", dataType=FlyDataType.Table, entityType="D", printName="Reval Conversion Type", fieldLength=22)
	C_ConversionTypeReval_ID,
	//
	@FlyElement(name="国家 ", description="国家 ", help="The Country defines a Country.  Each Country must be defined before it can be used in any document.", dataType=FlyDataType.TableDirect, entityType="D", printName="国家 ", fieldLength=22)
	C_Country_ID,
	//
	@FlyElement(name="货币", description="币种为该笔记录", help="Indicates the Currency to be used when processing or reporting on this record", dataType=FlyDataType.ID, entityType="D", printName="货币", fieldLength=22)
	C_Currency_ID,
	//
	@FlyElement(name="目标币种", description="目标币种", help="The Currency To defines the target currency for this conversion rate.", dataType=FlyDataType.Table, entityType="D", printName="目标币种", fieldLength=22)
	C_Currency_ID_To,
	//
	@FlyElement(name="项目周期", description="Identifier for this Project Cycle", help="Identifies a Project Cycle which can be made up of one or more steps or statuses", dataType=FlyDataType.ID, entityType="D", printName="项目周期", fieldLength=22)
	C_Cycle_ID,
	//
	@FlyElement(name="周期步骤", description="步骤为该周期", help="Identifies one or more steps within a Project Cycle. A cycle Step has multiple Phases", dataType=FlyDataType.TableDirect, entityType="D", printName="周期步骤", fieldLength=22)
	C_CycleStep_ID,
	//
	@FlyElement(name="Confirmed Mfg Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Confirmed Mfg Order Doc Type", fieldLength=0)
	C_DocType_ConfirmedOrder,
	//
	@FlyElement(name="Counter Document", description="Counter Document Relationship", help="When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction.  Example: a 'Standard Order' creates a 'Standard PO'. 	If you define a relationship here, you overwrite the default counter document type in the Document Type definition. This allows you to define a specific mapping.", dataType=FlyDataType.ID, entityType="D", printName="Counter Document", fieldLength=22)
	C_DocTypeCounter_ID,
	//
	@FlyElement(name="Difference Document", description="Document type for generating in dispute Shipments", help="If the confirmation contains differences, the original document is split allowing the original document (shipment) to be processed and updating Inventory - and the newly created document for handling the dispute at a later time. Until the confirmation is processed, the inventory is not updated. ", dataType=FlyDataType.Table, entityType="D", printName="Difference Doc", fieldLength=22)
	C_DocTypeDifference_ID,
	//
	@FlyElement(name="文件类型", description="文件类型或规则", help="The Document Type determines document sequence and processing rules", dataType=FlyDataType.ID, entityType="D", printName="文件类型", fieldLength=22)
	C_DocType_ID,
	//
	@FlyElement(name="文件类型为发票", description="Document type used for invoices generated from this sales document", help="The Document Type for Invoice indicates the document type that will be used when an invoice is generated from this sales document.  This field will display only when the base document type is Sales Order.", dataType=FlyDataType.Table, entityType="D", printName="文件类型发票", fieldLength=22)
	C_DocTypeInvoice_ID,
	//
	@FlyElement(name="Planned Mfg Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Planned Mfg Order Doc Type", fieldLength=0)
	C_DocType_PlannedOrder,
	//
	@FlyElement(name="Purchase Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Purchase Order Doc Type", fieldLength=10)
	C_DocType_PO,
	//
	@FlyElement(name="文件类型为 ProForma", description="Document type used for pro forma invoices generated from this sales document", help="he Document Type for Invoice indicates the document type that will be used when an invoice is generated from this sales document.  This field will display only when the base document type is Sales Order and the Pro Forma Invoice checkbox is selected", dataType=FlyDataType.Table, entityType="D", printName="文件类型 ProForma", fieldLength=22)
	C_DocTypeProforma_ID,
	//
	@FlyElement(name="Replenish Plan Requisition Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Replenish Plan Requisition Doc Type", fieldLength=0)
	C_DocType_Requisition,
	//
	@FlyElement(name="Revaluation Document Type", description="Document Type for Revaluation Journal", dataType=FlyDataType.Table, entityType="D", printName="Doc Type Reval", fieldLength=10)
	C_DocTypeReval_ID,
	//
	@FlyElement(name="物料出货文件类型", description="Document type used for shipments generated from this sales document", help="he Document Type for Shipments indicates the document type that will be used when a shipment is generated from this sales document.  This field will display only when the base document type is Sales Order.", dataType=FlyDataType.Table, entityType="D", printName="物料出货文件类型", fieldLength=22)
	C_DocTypeShipment_ID,
	//
	@FlyElement(name="目标文件类型", description="Target document type for conversing documents", help="You can convert document types (e.g. from Offer to Order or Invoice).  The conversion is then reflected in the current type.  This processing is initiated by selecting the appropriate Document Action.", dataType=FlyDataType.Table, entityType="D", printName="目标文件类型", fieldLength=22)
	C_DocTypeTarget_ID,
	//
	@FlyElement(name="催讨", description="Dunning Rules for overdue invoices", help="The Dunning indicates the rules and method of dunning for past due payments.", dataType=FlyDataType.TableDirect, entityType="D", printName="催讨", fieldLength=22)
	C_Dunning_ID,
	//
	@FlyElement(name="催讨水平", dataType=FlyDataType.ID, entityType="D", printName="催讨水平", fieldLength=22)
	C_DunningLevel_ID,
	//
	@FlyElement(name="催讨运行条目", description="催讨运行条目", dataType=FlyDataType.ID, entityType="D", printName="催讨运行条目", fieldLength=22)
	C_DunningRunEntry_ID,
	//
	@FlyElement(name="催讨运行", description="催讨运行", dataType=FlyDataType.ID, entityType="D", printName="催讨运行", fieldLength=22)
	C_DunningRun_ID,
	//
	@FlyElement(name="催讨运行明细", description="催讨运行明细", dataType=FlyDataType.ID, entityType="D", printName="催讨运行明细", fieldLength=22)
	C_DunningRunLine_ID,
	//
	@FlyElement(name="会计科目", description="会计科目", help="The Account Element uniquely identifies an Account Type.  These are commonly known as a Chart of Accounts.", dataType=FlyDataType.ID, entityType="D", printName="会计科目", fieldLength=22)
	C_Element_ID,
	//
	@FlyElement(name="会计科目", description="会计科目", help="Account Elements can be natural accounts or user defined values.", dataType=FlyDataType.ID, entityType="D", printName="会计科目", fieldLength=22)
	C_ElementValue_ID,
	//
	@FlyElement(name="称谓", description="Greeting to print on correspondence", help="The Greeting identifies the greeting to print on correspondence.", dataType=FlyDataType.ID, entityType="D", printName="称谓", fieldLength=22)
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
	@FlyElement(name="收费数量", dataType=FlyDataType.Integer, entityType="D", printName="收费数量", fieldLength=22)
	ChargeableQty,
	//
	@FlyElement(name="费用金额", description="费用金额", help="The Charge Amount indicates the amount for an additional charge.", dataType=FlyDataType.Amount, entityType="D", printName="费用金额", fieldLength=22)
	ChargeAmt,
	//
	@FlyElement(name="收费费用", description="Indicates if fees will be charged for overdue invoices", help="The Charge Fee checkbox indicates if the dunning letter will include fees for overdue invoices", dataType=FlyDataType.YesNo, entityType="D", printName="收费费用", fieldLength=1)
	ChargeFee,
	//
	@FlyElement(name="费用利润", description="Indicates if interest will be charged on overdue invoices", help="The Charge Interest checkbox indicates if interest will be charged on overdue invoice amounts.", dataType=FlyDataType.YesNo, entityType="D", printName="费用利润", fieldLength=1)
	ChargeInterest,
	//
	@FlyElement(name="费用名", description="费用名", dataType=FlyDataType.String, entityType="D", printName="费用名", fieldLength=60)
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
	@FlyElement(name="支票未", description="检查号", help="The Check Number indicates the number on the check.", dataType=FlyDataType.String, entityType="D", printName="检查号", fieldLength=20)
	CheckNo,
	//
	@FlyElement(name="Validate current (old) Value", description="Ensure that the old value of the change is the current value in the system (i.e. original situation)", dataType=FlyDataType.NONE, entityType="D", printName="Validate current (old) Value", fieldLength=0)
	CheckOldValue,
	//
	@FlyElement(name="检查打印格式", description="Print Format for printing Checks", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="检查打印格式", fieldLength=22)
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
	@FlyElement(name="收费费用", description="收费费用帐户", help="The Charge Expense Account identifies the account to use when recording charges paid to vendors.", dataType=FlyDataType.Account, entityType="D", printName="收费费用", fieldLength=22)
	Ch_Expense_Acct,
	//
	@FlyElement(name="收费收入", description="收费收入帐户", help="The Charge Revenue Account identifies the account to use when recording charges paid by customers.", dataType=FlyDataType.Account, entityType="D", printName="收费收入", fieldLength=22)
	Ch_Revenue_Acct,
	//
	@FlyElement(name="Invoice Batch", description="Expense Invoice Batch Header", dataType=FlyDataType.ID, entityType="D", printName="Invoice Batch", fieldLength=22)
	C_InvoiceBatch_ID,
	//
	@FlyElement(name="Invoice Batch Line", description="Expense Invoice Batch Line", dataType=FlyDataType.ID, entityType="D", printName="Invoice Batch Line", fieldLength=22)
	C_InvoiceBatchLine_ID,
	//
	@FlyElement(name="发票", description="开发票标识符", help="The Invoice ID uniquely identifies an Invoice Document.", dataType=FlyDataType.ID, entityType="D", printName="发票", fieldLength=22)
	C_Invoice_ID,
	//
	@FlyElement(name="发票明细", description="发票明细明细", help="The Invoice Line uniquely identifies a single line of an Invoice.", dataType=FlyDataType.ID, entityType="D", printName="发票明细", fieldLength=22)
	C_InvoiceLine_ID,
	//
	@FlyElement(name="发票付款排程", description="发票付款排程", help="The Invoice Payment Schedule determines when partial payments are due.", dataType=FlyDataType.ID, entityType="D", printName="发票薪资排程", fieldLength=22)
	C_InvoicePaySchedule_ID,
	//
	@FlyElement(name="Request Invoice", description="The generated invoice for this request", help="The optionally generated invoice for the request", dataType=FlyDataType.Search, entityType="D", printName="Request Invoice", fieldLength=10)
	C_InvoiceRequest_ID,
	//
	@FlyElement(name="发票排程", description="Schedule for generating Invoices", help="The Invoice Schedule identifies the frequency used when generating invoices.", dataType=FlyDataType.ID, entityType="D", printName="发票排程", fieldLength=22)
	C_InvoiceSchedule_ID,
	//
	@FlyElement(name="城市", description="标识城市", help="The City identifies a unique City for this Country or Region.", dataType=FlyDataType.String, entityType="D", printName="城市", fieldLength=60)
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
	@FlyElement(name="Landed Cost Allocation", description="Allocation for Land Costs", dataType=FlyDataType.ID, entityType="D", printName="Landed Cost Allocation", fieldLength=10)
	C_LandedCostAllocation_ID,
	//
	@FlyElement(name="Landed Cost", description="Landed cost to be allocated to material receipts", help="Landed costs allow you to allocate costs to previously received material receipts. Examples are freight, excise tax, insurance, etc.", dataType=FlyDataType.ID, entityType="D", printName="Landed Cost", fieldLength=22)
	C_LandedCost_ID,
	//
	@FlyElement(name="分类", description="分类为配列", help="The Classification can be used to optionally group products.", dataType=FlyDataType.String, entityType="D", printName="分类", fieldLength=12)
	Classification,
	//
	@FlyElement(name="类名", description="Java 类名", help="The Classname identifies the Java classname used by this report or process.", dataType=FlyDataType.String, entityType="D", printName="类名", fieldLength=60)
	Classname,
	//
	@FlyElement(name="Classpath", description="Extension Classpath", help="If your application requires additional jar files, enter them here. The jar files must be located in the $ADEMPIERE_HOME/lib directory.", dataType=FlyDataType.String, entityType="D", printName="Classpath", fieldLength=255)
	Classpath,
	//
	@FlyElement(name="实体关键字", description="客户的关键字", dataType=FlyDataType.String, entityType="D", printName="实体关键字", fieldLength=40)
	ClientValue,
	//
	@FlyElement(name="地址", description="位置或地址", help="The Location   Address field defines the location of an entity.", dataType=FlyDataType.ID, entityType="D", printName="地址", fieldLength=22)
	C_Location_ID,
	//
	@FlyElement(name="来源位置", description="Location that inventory was moved from", help="The Location From indicates the location that a product was moved from.", dataType=FlyDataType.Table, entityType="D", printName="来源位置", fieldLength=22)
	C_LocFrom_ID,
	//
	@FlyElement(name="目标位置", description="Location that inventory was moved to", help="The Location To indicates the location that a product was moved to.", dataType=FlyDataType.Table, entityType="D", printName="目标位置", fieldLength=22)
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
	@FlyElement(name="非业务日", description="Day on which business is not transacted", help="The Non Business Day identifies a day that should not be considered a day when business is transacted", dataType=FlyDataType.ID, entityType="D", printName="非业务日", fieldLength=22)
	C_NonBusinessDay_ID,
	//
	@FlyElement(name="错误信息", description="Validation Code 错误信息", help="The Validation Code displays the date, time and message of the error.", dataType=FlyDataType.Text, entityType="D", printName="错误信息", fieldLength=2000)
	Code,
	//
	@FlyElement(name="列0", dataType=FlyDataType.Amount, entityType="D", printName="列0", fieldLength=22)
	Col_0,
	//
	@FlyElement(name="列1", dataType=FlyDataType.Amount, entityType="D", printName="列1", fieldLength=22)
	Col_1,
	//
	@FlyElement(name="列10", dataType=FlyDataType.Amount, entityType="D", printName="列10", fieldLength=22)
	Col_10,
	//
	@FlyElement(name="列11", dataType=FlyDataType.Amount, entityType="D", printName="列11", fieldLength=22)
	Col_11,
	//
	@FlyElement(name="列12", dataType=FlyDataType.Amount, entityType="D", printName="列12", fieldLength=22)
	Col_12,
	//
	@FlyElement(name="列13", dataType=FlyDataType.Amount, entityType="D", printName="列13", fieldLength=22)
	Col_13,
	//
	@FlyElement(name="列14", dataType=FlyDataType.Amount, entityType="D", printName="列14", fieldLength=22)
	Col_14,
	//
	@FlyElement(name="列15", dataType=FlyDataType.Amount, entityType="D", printName="列15", fieldLength=22)
	Col_15,
	//
	@FlyElement(name="列16", dataType=FlyDataType.Amount, entityType="D", printName="列16", fieldLength=22)
	Col_16,
	//
	@FlyElement(name="列17", dataType=FlyDataType.Amount, entityType="D", printName="列17", fieldLength=22)
	Col_17,
	//
	@FlyElement(name="列18", dataType=FlyDataType.Amount, entityType="D", printName="列18", fieldLength=22)
	Col_18,
	//
	@FlyElement(name="列19", dataType=FlyDataType.Amount, entityType="D", printName="列19", fieldLength=22)
	Col_19,
	//
	@FlyElement(name="列2", dataType=FlyDataType.Amount, entityType="D", printName="列2", fieldLength=22)
	Col_2,
	//
	@FlyElement(name="列20", dataType=FlyDataType.Amount, entityType="D", printName="列20", fieldLength=22)
	Col_20,
	//
	@FlyElement(name="列3", dataType=FlyDataType.Amount, entityType="D", printName="列3", fieldLength=22)
	Col_3,
	//
	@FlyElement(name="列4", dataType=FlyDataType.Amount, entityType="D", printName="列4", fieldLength=22)
	Col_4,
	//
	@FlyElement(name="列5", dataType=FlyDataType.Amount, entityType="D", printName="列5", fieldLength=22)
	Col_5,
	//
	@FlyElement(name="列6", dataType=FlyDataType.Amount, entityType="D", printName="列6", fieldLength=22)
	Col_6,
	//
	@FlyElement(name="列7", dataType=FlyDataType.Amount, entityType="D", printName="列7", fieldLength=22)
	Col_7,
	//
	@FlyElement(name="列8", dataType=FlyDataType.Amount, entityType="D", printName="列8", fieldLength=22)
	Col_8,
	//
	@FlyElement(name="列9", dataType=FlyDataType.Amount, entityType="D", printName="列9", fieldLength=22)
	Col_9,
	//
	@FlyElement(name="颜色类型", description="Color presentation for this color", dataType=FlyDataType.List, entityType="D", printName="颜色类型", fieldLength=1)
	ColorType,
	//
	@FlyElement(name="数据库列名", description="Name of the column in the database", help="The Column Name indicates the name of a column on a table as defined in the database.", dataType=FlyDataType.String, entityType="D", printName="数据库列名", fieldLength=30)
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
	@FlyElement(name="列类型", dataType=FlyDataType.List, entityType="D", printName="列类型", fieldLength=1)
	ColumnType,
	//
	@FlyElement(name="ColValue", dataType=FlyDataType.String, entityType="D", printName="ColValue", fieldLength=2000)
	ColValue,
	//
	@FlyElement(name="组合", description="Unique combination of account elements", help="The Combination field defines the unique combination of element values which comprise this account.", dataType=FlyDataType.String, entityType="D", printName="组合", fieldLength=60)
	Combination,
	//
	@FlyElement(name="注释", description="Comments or additional information", help="The Comments field allows for free form entry of additional information.", dataType=FlyDataType.Text, entityType="D", printName="注释", fieldLength=2000)
	Comments,
	//
	@FlyElement(name="佣金", description="Commission stated as a percentage", help="The Commission indicates (as a percentage) the commission to be paid.", dataType=FlyDataType.Number, entityType="D", printName="佣金", fieldLength=22)
	Commission,
	//
	@FlyElement(name="佣金金额", description="佣金金额", help="The Commission Amount is the total calculated commission.  It is based on the parameters as defined for this Commission Run.", dataType=FlyDataType.Amount, entityType="D", printName="委任 Amt", fieldLength=22)
	CommissionAmt,
	//
	@FlyElement(name="Commissioned B.Partner", description="Business Partner receiving the Commission", dataType=FlyDataType.Table, entityType="D", printName="Comm B.Partner", fieldLength=22)
	Commission_BPartner_ID,
	//
	@FlyElement(name="Commission Converted Amount", description="Commission calculation basis Converted Amount", dataType=FlyDataType.Amount, entityType="D", printName="Comm Conv Amt", fieldLength=22)
	CommissionConvertedAmt,
	//
	@FlyElement(name="Commission only specified Orders", description="Commission only Orders or Invoices, where this Sales Rep is entered", help="Sales Reps are entered in Orders and Invoices. If selected, only Orders and Invoices for this Sales Reps are included in the calculation of the commission.", dataType=FlyDataType.YesNo, entityType="D", printName="委任定单", fieldLength=1)
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
	@FlyElement(name="已委托金额", description="The (legal) commitment amount", help="The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.", dataType=FlyDataType.Amount, entityType="D", printName="已委托金额", fieldLength=22)
	CommittedAmt,
	//
	@FlyElement(name="已委托数量", description="The (legal) commitment Quantity", help="The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.", dataType=FlyDataType.Quantity, entityType="D", printName="已委托数量", fieldLength=22)
	CommittedQty,
	//
	@FlyElement(name="提交警告", description="保存时显示警告", help="Warning or information displayed when committing the record", dataType=FlyDataType.Text, entityType="D", printName="提交警告", fieldLength=2000)
	CommitWarning,
	//
	@FlyElement(name="日用品编码", description="Commodity code used for tax calculation", help="The Commodity Code indicates a code that is used in tax calculations", dataType=FlyDataType.String, entityType="D", printName="日用品编码", fieldLength=20)
	CommodityCode,
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
	@FlyElement(name="Consolidate to one Document", description="Consilidate Lines into one Document", dataType=FlyDataType.YesNo, entityType="D", printName="Consolidate", fieldLength=1)
	ConsolidateDocument,
	//
	@FlyElement(name="常数值", description="Constant value", dataType=FlyDataType.String, entityType="D", printName="常数", fieldLength=60)
	ConstantValue,
	//
	@FlyElement(name="Activity Type", description="Type of activity, e.g. task, email, phone call", dataType=FlyDataType.NONE, entityType="D", printName="Activity Type", fieldLength=0)
	ContactActivityType,
	//
	@FlyElement(name="联系人描述", description="联系人的描述", dataType=FlyDataType.String, entityType="D", printName="联系人描述", fieldLength=255)
	ContactDescription,
	//
	@FlyElement(name="联系人名字", description="业务伙伴联系人名字", dataType=FlyDataType.String, entityType="D", printName="联系人名字", fieldLength=60)
	ContactName,
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
	@FlyElement(name="控制金额", description="If not zero, the Debit amount of the document must be equal this amount", help="If the control amount is zero, no check is performed.	Otherwise the total Debit amount must be equal to the control amount, before the document is processed.", dataType=FlyDataType.Amount, entityType="D", printName="控制金额", fieldLength=22)
	ControlAmt,
	//
	@FlyElement(name="ConventionType", dataType=FlyDataType.String, entityType="D", printName="ConventionType", fieldLength=10)
	ConventionType,
	//
	@FlyElement(name="转变日期", description="Date for selecting conversion rate", help="The Conversion Date identifies the date used for currency conversion. The conversion rate chosen must include this date in it's date range", dataType=FlyDataType.Date, entityType="D", printName="转变日期", fieldLength=7)
	ConversionDate,
	//
	@FlyElement(name="Currency Type Key", description="Key value for the Currency Conversion Rate Type", help="The date type key for the conversion of foreign currency transactions", dataType=FlyDataType.String, entityType="D", printName="Currency Conversion Type", fieldLength=40)
	ConversionTypeValue,
	//
	@FlyElement(name="已转换金额", description="已转换金额", help="The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate for this target currency.", dataType=FlyDataType.Amount, entityType="D", printName="转换", fieldLength=22)
	ConvertedAmt,
	//
	@FlyElement(name="坐标", description="位置坐标", help="This column contains the geographical coordinates (latitude longitude) of the location.<p>	In order to avoid unnecessary use of non-standard characters and space, the following standard presentation is used:<br>	0000N 00000W 0000S 00000E <br>	where the two last digits refer to minutes and the two or three first digits indicate the degrees	", dataType=FlyDataType.String, entityType="D", printName="坐标", fieldLength=15)
	Coordinates,
	//
	@FlyElement(name="Sales Opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Sales Opportunity", fieldLength=0)
	C_Opportunity_ID,
	//
	@FlyElement(name="Copy Columns From Table", dataType=FlyDataType.Button, entityType="D", printName="Copy Columns From Table", fieldLength=1)
	CopyColumnsFromTable,
	//
	@FlyElement(name="复制从", description="来自记录的复制", help="来自记录的复制", dataType=FlyDataType.Button, entityType="D", printName="复制从", fieldLength=1)
	CopyFrom,
	//
	@FlyElement(name="Copy From Report and Process", description="Copy settings from one report and process to another.", help="Copy the settings from the selected report and process to the current one.  This overwrites existing settings and translations.", dataType=FlyDataType.Button, entityType="D", printName="Copy From Report and Process", fieldLength=1)
	CopyFromProcess,
	//
	@FlyElement(name="Copylines", dataType=FlyDataType.Button, entityType="D", printName="Copylines", fieldLength=1)
	CopyLines,
	//
	@FlyElement(name="Copy Overwrite", description="Copy and Overwrite Default Accounts (DANGEROUS!!)", dataType=FlyDataType.NONE, entityType="D", printName="Copy Overwrite", fieldLength=0)
	CopyOverwriteAcct,
	//
	@FlyElement(name="销售定单", description="销售定单", help="The Sales Order ID is a unique identifier of a Sales Order.  This is controlled by the document sequence for this document type.", dataType=FlyDataType.ID, entityType="D", printName="销售定单", fieldLength=22)
	C_Order_ID,
	//
	@FlyElement(name="销售定单明细", description="销售定单明细", help="The Sales Order Line is a unique identifier for a line in an order.", dataType=FlyDataType.ID, entityType="D", printName="定单明细", fieldLength=22)
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
	@FlyElement(name="机构指派", description="Assigment to (transaction) Organization", help="Assignment to the transacation organization (cost center).", dataType=FlyDataType.ID, entityType="D", printName="机构指派", fieldLength=22)
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
	@FlyElement(name="Cost Value", description="Value with Cost", dataType=FlyDataType.Amount, entityType="D", printName="Cost Value", fieldLength=22)
	CostAmt,
	//
	@FlyElement(name="Cost Value LL", description="Value with Cost Lower Level", dataType=FlyDataType.NONE, entityType="D", printName="Cost Value Lower Level", fieldLength=0)
	CostAmtLL,
	//
	@FlyElement(name="平均成本", description="已加权平均的成本", help="Weighted average (actual) costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="平均成本", fieldLength=22)
	CostAverage,
	//
	@FlyElement(name="平均的成本金额总数", description="Cumulative average cost amounts (internal)", help="Current cumulative costs for calculating the average costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="平均的成本金额总数", fieldLength=22)
	CostAverageCumAmt,
	//
	@FlyElement(name="平均成本量总数", description="Cumulative average cost quantities (internal)", help="Current cumulative quantity for calculating the average costs", dataType=FlyDataType.Quantity, entityType="D", printName="平均成本量总数", fieldLength=22)
	CostAverageCumQty,
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
	@FlyElement(name="成本计算方法", description="Indicates how Costs will be calculated", help="The Costing Method indicates how costs will be calculated (Standard, Average)", dataType=FlyDataType.List, entityType="D", printName="成本计算方法", fieldLength=1)
	CostingMethod,
	//
	@FlyElement(name="成本计算精度", description="Rounding used costing calculations", help="The Costing Precision defines the number of decimal places that amounts will be rounded to when performing costing calculations.", dataType=FlyDataType.Integer, entityType="D", printName="成本计算精度", fieldLength=22)
	CostingPrecision,
	//
	@FlyElement(name="每定单成本", description="每定单固定的成本", help="The Cost Per Order indicates the fixed charge levied when an order for this product is placed.", dataType=FlyDataType.CostsPrices, entityType="D", printName="每定单成本", fieldLength=22)
	CostPerOrder,
	//
	@FlyElement(name="每交易成本", description="每交易固定的成本", help="The Cost per Transaction indicates the fixed cost per to be charged per transaction.", dataType=FlyDataType.CostsPrices, entityType="D", printName="每交易成本", fieldLength=22)
	CostPerTrx,
	//
	@FlyElement(name="成本", description="成本在帐户币种方面", help="The Costs indicates the cost of a campaign in an Organizations accounting currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="成本", fieldLength=22)
	Costs,
	//
	@FlyElement(name="标准成本", description="标准成本", help="Standard (plan) costs.", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本", fieldLength=22)
	CostStandard,
	//
	@FlyElement(name="标准成本", description="标准的成本", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本", fieldLength=22)
	CostStandardAmt,
	//
	@FlyElement(name="标准成本金额总数", description="Standard Cost Invoice Amount Sum (internal)", help="Current cumulative amount for calculating the standard cost difference based on (actual) invoice price", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本金额总数", fieldLength=22)
	CostStandardCumAmt,
	//
	@FlyElement(name="标准成本数量总数", description="Standard Cost Invoice Quantity Sum (internal)", help="Current cumulative quantity for calculating the standard cost difference based on (actual) invoice price", dataType=FlyDataType.Quantity, entityType="D", printName="标准成本数量总数", fieldLength=22)
	CostStandardCumQty,
	//
	@FlyElement(name="Standard Cost Invoice Difference", description="Standard Cost Invoice Difference", help="Accumulated difference of Invoice Costs to Standard Costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本发票差额", fieldLength=22)
	CostStandardInvDiff,
	//
	@FlyElement(name="标准采购定单成本金额总数", description="Standard Cost Purchase Order Amount Sum (internal)", help="Current cumulative amount for calculating the standard cost difference based on (planned) purchase order price", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准采购定单成本金额总数", fieldLength=22)
	CostStandardPOAmt,
	//
	@FlyElement(name="标准成本采购定单差额", description="Standard Cost Purchase Order Difference", help="Accumulated difference of Purchase Order Costs to Standard Costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本采购定单差额", fieldLength=22)
	CostStandardPODiff,
	//
	@FlyElement(name="标准采购定单成本数量总数", description="Standard Cost Purchase Order Quantity Sum (internal)", help="Current cumulative quantity for calculating the standard cost difference based on (planned) purchase order price", dataType=FlyDataType.Quantity, entityType="D", printName="标准采购定单成本数量总数", fieldLength=22)
	CostStandardPOQty,
	//
	@FlyElement(name="Count Entered", dataType=FlyDataType.NONE, entityType="D", printName="Entered", fieldLength=0)
	CountEntered,
	//
	@FlyElement(name="柜台", description="计数值", help="数字柜台", dataType=FlyDataType.Integer, entityType="D", printName="柜台", fieldLength=22)
	Counter,
	//
	@FlyElement(name="Counter Document Type", description="Generated Counter Document Type (To)", help="The Document Type of the generated counter document", dataType=FlyDataType.Table, entityType="D", printName="Counter Doc Type", fieldLength=22)
	Counter_C_DocType_ID,
	//
	@FlyElement(name="计算高成交量项目", description="计算高运动产品", help="The Count High Movement checkbox indicates if the those items with a high turnover will be counted", dataType=FlyDataType.YesNo, entityType="D", printName="计算高成交量项目", fieldLength=1)
	CountHighMovement,
	//
	@FlyElement(name="Order Count", dataType=FlyDataType.Integer, entityType="D", printName="Order Count", fieldLength=0)
	CountOrder,
	//
	@FlyElement(name="ISO国家代码", description="Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http:  www.chemie.fu-berlin.de diverse doc ISO_3166.html", help="For details - http:  www.din.de gremien nas nabd iso3166ma codlstp1.html or - http:  www.unece.org trade rec rec03en.htm", dataType=FlyDataType.String, entityType="D", printName="ISO 国家", fieldLength=2)
	CountryCode,
	//
	@FlyElement(name="Country", description="Country Name", dataType=FlyDataType.String, entityType="D", printName="Country", fieldLength=60)
	CountryName,
	//
	@FlyElement(name="Allocate Payment", description="Allocate Payment to Invoices", help="You can directly allocate payments to invoices when creating the Payment. 	Note that you can over- or under-allocate the payment.  When processing the payment, the allocation is created.", dataType=FlyDataType.ID, entityType="D", printName="Allocate Payment", fieldLength=10)
	C_PaymentAllocate_ID,
	//
	@FlyElement(name="付款批次", dataType=FlyDataType.TableDirect, entityType="D", printName="付款批次", fieldLength=22)
	C_PaymentBatch_ID,
	//
	@FlyElement(name="付款", description="付款标识符", help="The Payment is a unique identifier of this payment.", dataType=FlyDataType.Search, entityType="D", printName="付款", fieldLength=22)
	C_Payment_ID,
	//
	@FlyElement(name="付款处理器", description="Payment processor for electronic payments", help="The Payment Processor indicates the processor to be used for electronic payments", dataType=FlyDataType.ID, entityType="D", printName="付款处理器", fieldLength=22)
	C_PaymentProcessor_ID,
	//
	@FlyElement(name="付款条款", description="The terms for Payment of this transaction", help="Payment Terms identify the method and timing of payment for this transaction.  ", dataType=FlyDataType.ID, entityType="D", printName="付款条款", fieldLength=22)
	C_PaymentTerm_ID,
	//
	@FlyElement(name="付款排程", description="付款排程模板", help="Information when parts of the payment are due", dataType=FlyDataType.ID, entityType="D", printName="付款排程", fieldLength=22)
	C_PaySchedule_ID,
	//
	@FlyElement(name="支付选择帐单", description="付款选择检查", dataType=FlyDataType.ID, entityType="D", printName="支付选择帐单", fieldLength=22)
	C_PaySelectionCheck_ID,
	//
	@FlyElement(name="付款选择", description="付款选择", help="The Payment Selection identifies a unique Payment", dataType=FlyDataType.ID, entityType="D", printName="付款选择", fieldLength=22)
	C_PaySelection_ID,
	//
	@FlyElement(name="付款选择明细", description="付款选择明细", help="The Payment Selection Line identifies a unique line in a payment", dataType=FlyDataType.ID, entityType="D", printName="付款选择明细", fieldLength=22)
	C_PaySelectionLine_ID,
	//
	@FlyElement(name="Parent Pay Selection Line", dataType=FlyDataType.Table, entityType="D", printName="Parent Pay Selection Line", fieldLength=10)
	C_PaySelectionLine_Parent_ID,
	//
	@FlyElement(name="分期控制", dataType=FlyDataType.ID, entityType="D", printName="分期控制", fieldLength=22)
	C_PeriodControl_ID,
	//
	@FlyElement(name="分期", description="日历的分期", help="The Period indicates an exclusive range of dates for a calendar.", dataType=FlyDataType.ID, entityType="D", printName="分期", fieldLength=22)
	C_Period_ID,
	//
	@FlyElement(name="标准阶段", description="Standard Phase of the Project Type", help="Phase of the project with standard performance information", dataType=FlyDataType.TableDirect, entityType="D", printName="标准阶段", fieldLength=22)
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
	@FlyElement(name="客户预付款", description="Account for customer prepayments", help="The Customer Prepayment account indicates the account to be used for recording prepayments from a customer.", dataType=FlyDataType.Account, entityType="D", printName="客户预付款", fieldLength=22)
	C_Prepayment_Acct,
	//
	@FlyElement(name="项目", description="财务项目", help="Project ID is a user defined identifier for a Project", dataType=FlyDataType.ID, entityType="D", printName="项目", fieldLength=22)
	C_Project_ID,
	//
	@FlyElement(name="Project Issue", description="Project Issues (Material, Labor)", help="Issues to the project initiated by the 'Issue to Project' process. You can issue Receipts, Time and Expenses, or Stock.", dataType=FlyDataType.ID, entityType="D", printName="Project Issue", fieldLength=22)
	C_ProjectIssue_ID,
	//
	@FlyElement(name="项目明细", description="在一个项目中的任务或步骤", help="The Project Line indicates a unique project line.", dataType=FlyDataType.ID, entityType="D", printName="项目明细", fieldLength=22)
	C_ProjectLine_ID,
	//
	@FlyElement(name="项目阶段", description="一项目的项目阶段", dataType=FlyDataType.TableDirect, entityType="D", printName="项目阶段", fieldLength=22)
	C_ProjectPhase_ID,
	//
	@FlyElement(name="项目任务", description="Actual Project Task in a Phase", help="A Project Task in a Project Phase represents the actual work.", dataType=FlyDataType.TableDirect, entityType="D", printName="项目任务", fieldLength=22)
	C_ProjectTask_ID,
	//
	@FlyElement(name="项目类型", description="项目的类型", help="Type of the project with optional phases of the project with standard performance information", dataType=FlyDataType.ID, entityType="D", printName="项目类型", fieldLength=22)
	C_ProjectType_ID,
	//
	@FlyElement(name="Account (credit)", description="Account used", help="The (natural) account used", dataType=FlyDataType.NONE, entityType="D", printName="Account (credit)", fieldLength=0)
	CR_Account_ID,
	//
	@FlyElement(name="Create Confirm", dataType=FlyDataType.Button, entityType="D", printName="Create Confirm", fieldLength=1)
	CreateConfirm,
	//
	@FlyElement(name="产生复制", dataType=FlyDataType.Button, entityType="D", printName="产生复制", fieldLength=1)
	CreateCopy,
	//
	@FlyElement(name="创建日期", description="本记录产生日期", help="The Created field indicates the date that this record was created.", dataType=FlyDataType.DateTime, entityType="D", printName="创建日期", fieldLength=7)
	Created,
	//
	@FlyElement(name="创建人", description="产生该记录用户", help="The Created By field indicates the user who created this record.", dataType=FlyDataType.Table, entityType="D", printName="创建人", fieldLength=22)
	CreatedBy,
	//
	@FlyElement(name="CreatedDate", dataType=FlyDataType.String, entityType="D", printName="CreatedDate", fieldLength=50)
	CreatedDate,
	//
	@FlyElement(name="产生明细", description="Process which will generate a new document lines based on an existing document", help="The Create From process will create a new document based on information in an existing document selected by the user.", dataType=FlyDataType.Button, entityType="D", printName="产生明细", fieldLength=1)
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
	@FlyElement(name="产生新的组合", description="Create New Account Combination", dataType=FlyDataType.NONE, entityType="D", printName="产生新的组合", fieldLength=0)
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
	@FlyElement(name="Create PO", dataType=FlyDataType.Button, entityType="D", printName="Create PO", fieldLength=1)
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
	@FlyElement(name="客户应收帐款", description="Account for Customer Receivables", help="The Customer Receivables Accounts indicates the account to be used for recording transaction for customers receivables.", dataType=FlyDataType.Account, entityType="D", printName="客户应收帐款", fieldLength=22)
	C_Receivable_Acct,
	//
	@FlyElement(name="Receivable Services", description="Customer Accounts Receivables Services Account", help="Account to post services related Accounts Receivables if you want to differentiate between Services and Product related revenue. This account is only used, if posting to service accounts is enabled in the accounting schema.", dataType=FlyDataType.Account, entityType="D", printName="AR Services", fieldLength=10)
	C_Receivable_Services_Acct,
	//
	@FlyElement(name="重新开始", description="重新开始文件", help="重新开始文件", dataType=FlyDataType.TableDirect, entityType="D", printName="重新开始", fieldLength=22)
	C_Recurring_ID,
	//
	@FlyElement(name="重新开始运行", description="重新开始文件运行", help="History of Recurring Document Generation", dataType=FlyDataType.ID, entityType="D", printName="重新开始运行", fieldLength=22)
	C_Recurring_Run_ID,
	//
	@FlyElement(name="Exp. Month", description="期满月", help="The Expiry Month indicates the expiry month for this credit card.", dataType=FlyDataType.Integer, entityType="D", printName="Exp. Month", fieldLength=22)
	CreditCardExpMM,
	//
	@FlyElement(name="Exp. Year", description="期满年", help="The Expiry Year indicates the expiry year for this credit card.", dataType=FlyDataType.Integer, entityType="D", printName="Exp. Year", fieldLength=22)
	CreditCardExpYY,
	//
	@FlyElement(name="卡号", description="信用卡号", help="The Credit Card number indicates the number on the credit card, without blanks or spaces.", dataType=FlyDataType.String, entityType="D", printName="卡号", fieldLength=20)
	CreditCardNumber,
	//
	@FlyElement(name="信用卡", description="Credit Card (Visa, MC, AmEx)", help="The Credit Card drop down list box is used for selecting the type of Credit Card presented for payment.", dataType=FlyDataType.List, entityType="D", printName="信用卡", fieldLength=1)
	CreditCardType,
	//
	@FlyElement(name="信用卡确认", description="Verification code on credit card", help="The Credit Card Verification indicates the verification code on the credit card (AMEX 4 digits on front; MC,Visa 3 digits back)", dataType=FlyDataType.String, entityType="D", printName="信用卡确认", fieldLength=4)
	CreditCardVV,
	//
	@FlyElement(name="信用额度", description="信用的金额允许", help="The Credit Limit field indicates the credit limit for this account.", dataType=FlyDataType.Number, entityType="D", printName="信用额度", fieldLength=22)
	CreditLimit,
	//
	@FlyElement(name="Credit Watch %", description="Credit Watch - Percent of Credit Limit when OK switches to Watch", help="If Adempiere maintains credit status, the status 'Credit OK' is moved to 'Credit Watch' if the credit available reaches the percent entered.  If not defined, 90% is used.", dataType=FlyDataType.Number, entityType="D", printName="Credit Watch %", fieldLength=22)
	CreditWatchPercent,
	//
	@FlyElement(name="区域", description="Identifies a geographical Region", help="The Region identifies a unique Region for this Country.", dataType=FlyDataType.TableDirect, entityType="D", printName="区域", fieldLength=22)
	C_Region_ID,
	//
	@FlyElement(name="Remuneration", description="Wage or Salary", dataType=FlyDataType.ID, entityType="D", printName="Remuneration", fieldLength=10)
	C_Remuneration_ID,
	//
	@FlyElement(name="收入确认", description="记录的收入方法", help="The Revenue Recognition indicates how revenue will be recognized for this product", dataType=FlyDataType.TableDirect, entityType="D", printName="收入确认", fieldLength=22)
	C_RevenueRecognition_ID,
	//
	@FlyElement(name="收入确认计划", description="Plan for recognizing or recording revenue", help="The Revenue Recognition Plan identifies a unique Revenue Recognition Plan.", dataType=FlyDataType.TableDirect, entityType="D", printName="收入确认计划", fieldLength=22)
	C_RevenueRecognition_Plan_ID,
	//
	@FlyElement(name="收入确认运行", description="Revenue Recognition Run or Process", help="The Revenue Recognition Runs identifies a unique instance of processing revenue recognition.", dataType=FlyDataType.ID, entityType="D", printName="收入确认运行", fieldLength=22)
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
	@FlyElement(name="RfQ Subscriber", description="Request for Quotation Topic Subscriber", help="Subcriber to invite to respond to RfQs", dataType=FlyDataType.ID, entityType="D", printName="RfQ Subscriber", fieldLength=22)
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
	@FlyElement(name="销售区域", description="销售报导区域", help="The Sales Region indicates a specific area of sales coverage.", dataType=FlyDataType.ID, entityType="D", printName="销售区域", fieldLength=22)
	C_SalesRegion_ID,
	//
	@FlyElement(name="Sales Stage", description="Stages of the sales process", help="Define what stages your sales process will move through", dataType=FlyDataType.NONE, entityType="D", printName="Sales Stage", fieldLength=0)
	C_SalesStage_ID,
	//
	@FlyElement(name="服务水平", description="Product Revenue Recognition Service Level ", help="The Service Level defines a unique Service Level.", dataType=FlyDataType.ID, entityType="D", printName="服务水平", fieldLength=22)
	C_ServiceLevel_ID,
	//
	@FlyElement(name="服务水平明细", description="Product Revenue Recognition Service Level Line", help="The Service Level Line indicates a unique instance in a Service Level", dataType=FlyDataType.ID, entityType="D", printName="服务水平明细", fieldLength=22)
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
	@FlyElement(name="标准任务", description="项目类型任务模板", help="Standard Project Task in a Project Phase.", dataType=FlyDataType.ID, entityType="D", printName="标准任务", fieldLength=22)
	C_Task_ID,
	//
	@FlyElement(name="税分类", description="税分类", help="The Tax Category provides a method of grouping similar taxes.  For example, Sales Tax or Value Added Tax.", dataType=FlyDataType.TableDirect, entityType="D", printName="税分类", fieldLength=22)
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
	@FlyElement(name="税", description="税标识符", help="The Tax indicates the type of tax for this document line.", dataType=FlyDataType.TableDirect, entityType="D", printName="税", fieldLength=22)
	C_Tax_ID,
	//
	@FlyElement(name="Tax ZIP", description="Tax Postal/ZIP", help="For local tax, you may have to define a list of (ranges of) postal codes or ZIPs", dataType=FlyDataType.ID, entityType="D", printName="Tax ZIP", fieldLength=22)
	C_TaxPostal_ID,
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
	@FlyElement(name="Accumulated Qty", description="Total Quantity", help="Sum of the quantities", dataType=FlyDataType.Quantity, entityType="D", printName="Accumulated Qty", fieldLength=22)
	CumulatedQty,
	//
	@FlyElement(name="累计级别", description="累计计算的级别", dataType=FlyDataType.List, entityType="D", printName="累计级别", fieldLength=1)
	CumulativeLevel,
	//
	@FlyElement(name="度量单位转换", description="度量单位转变", help="The UOM Conversion identifies a unique to and from Unit of Measure, conversion rate and conversion date range.", dataType=FlyDataType.ID, entityType="D", printName="度量单位转换", fieldLength=22)
	C_UOM_Conversion_ID,
	//
	@FlyElement(name="度量单位", description="度量单位", help="The UOM defines a unique non monetary Unit of Measure", dataType=FlyDataType.ID, entityType="D", printName="度量单位", fieldLength=22)
	C_UOM_ID,
	//
	@FlyElement(name="长度单位", description="Standard Unit of Measure for Length", help="The Standard UOM for Length indicates the UOM to use for products referenced by length in a document.", dataType=FlyDataType.Table, entityType="D", printName="长度单位", fieldLength=22)
	C_UOM_Length_ID,
	//
	@FlyElement(name="时间单位", description="Standard Unit of Measure for Time", help="The Standard UOM for Time indicates the UOM to use for products referenced by time in a document.", dataType=FlyDataType.Table, entityType="D", printName="时间单位", fieldLength=22)
	C_UOM_Time_ID,
	//
	@FlyElement(name="UoM 到", description="Target or destination Unit of Measure", help="The UOM To indicates the destination UOM for a UOM Conversion pair.", dataType=FlyDataType.Table, entityType="D", printName="UoM 到", fieldLength=22)
	C_UOM_To_ID,
	//
	@FlyElement(name="体积单位", description="Standard Unit of Measure for Volume", help="The Standard UOM for Volume indicates the UOM to use for products referenced by volume in a document.", dataType=FlyDataType.Table, entityType="D", printName="体积单位", fieldLength=22)
	C_UOM_Volume_ID,
	//
	@FlyElement(name="重量单位", description="Standard Unit of Measure for Weight", help="The Standard UOM for Weight indicates the UOM to use for products referenced by weight in a document.", dataType=FlyDataType.Table, entityType="D", printName="重量单位", fieldLength=22)
	C_UOM_Weight_ID,
	//
	@FlyElement(name="Currency Balancing Acct", description="Account used when a currency is out of balance", help="The Currency Balancing Account indicates the account to used when a currency is out of balance (generally due to rounding)", dataType=FlyDataType.Account, entityType="D", printName="Currency Balancing Acct", fieldLength=22)
	CurrencyBalancing_Acct,
	//
	@FlyElement(name="汇率", description="币种汇率", help="The Currency Conversion Rate indicates the rate to use when converting the source currency to the accounting currency", dataType=FlyDataType.Number, entityType="D", printName="汇率", fieldLength=22)
	CurrencyRate,
	//
	@FlyElement(name="CurrencyRateType", dataType=FlyDataType.List, entityType="D", printName="CurrencyRateType", fieldLength=1)
	CurrencyRateType,
	//
	@FlyElement(name="币种类型", dataType=FlyDataType.List, entityType="D", printName="币种类型", fieldLength=1)
	CurrencyType,
	//
	@FlyElement(name="当前余款", description="当前余款", help="The Current Balance field indicates the current balance in this account.", dataType=FlyDataType.Number, entityType="D", printName="当前余款", fieldLength=22)
	CurrentBalance,
	//
	@FlyElement(name="当前成本价格", description="那现在使用过的成本价格", dataType=FlyDataType.CostsPrices, entityType="D", printName="当前成本价格", fieldLength=22)
	CurrentCostPrice,
	//
	@FlyElement(name="currentcostvalue", dataType=FlyDataType.NONE, entityType="D", printName="currentcostvalue", fieldLength=0)
	currentcostvalue,
	//
	@FlyElement(name="现在的下一个", description="下一个用到的数字", help="The Current Next indicates the next number to use for this document", dataType=FlyDataType.Integer, entityType="D", printName="现在的下一个", fieldLength=22)
	CurrentNext,
	//
	@FlyElement(name="现在的下一个", description="下一个序列为系统使用", help="This field is for system use only and should not be modified.", dataType=FlyDataType.Integer, entityType="D", printName="现在的下一个", fieldLength=22)
	CurrentNextSys,
	//
	@FlyElement(name="Current Quantity", description="Current Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Current Qty", fieldLength=22)
	CurrentQty,
	//
	@FlyElement(name="符号", description="Symbol of the currency (opt used for printing only)", help="The Currency Symbol defines the symbol that will print when this currency is used.", dataType=FlyDataType.String, entityType="D", printName="币种", fieldLength=10)
	CurSymbol,
	//
	@FlyElement(name="Employee Remuneration", description="Employee Wage or Salary Overwrite", help="Overwrite the standard Remuneration", dataType=FlyDataType.ID, entityType="D", printName="Employee Remuneration", fieldLength=10)
	C_UserRemuneration_ID,
	//
	@FlyElement(name="客户号", description="EDI 确认数字 ", dataType=FlyDataType.String, entityType="D", printName="客户号", fieldLength=20)
	CustomerNo,
	//
	@FlyElement(name="Customer Open Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Customer Open Invoices", fieldLength=0)
	CustomerOpenInvoices,
	//
	@FlyElement(name="Custom Prefix", description="Prefix for Custom entities", help="The prefix listed are ignored as customization for database or entity migration", dataType=FlyDataType.String, entityType="D", printName="Custom Prefix", fieldLength=60)
	CustomPrefix,
	//
	@FlyElement(name="组合", description="有效的帐户组合", help="The Combination identifies a valid combination of element which represent a GL account.", dataType=FlyDataType.ID, entityType="D", printName="组合", fieldLength=22)
	C_ValidCombination_ID,
	//
	@FlyElement(name="扣留", description="扣留类型定义", help="The Withholding indicates the type of withholding to be calculated.", dataType=FlyDataType.TableDirect, entityType="D", printName="扣留", fieldLength=22)
	C_Withholding_ID,
	//
	@FlyElement(name="Cycle Name", description="Name of the Project Cycle", dataType=FlyDataType.String, entityType="D", printName="Cycle", fieldLength=60)
	CycleName,
	//
	@FlyElement(name="Cycle Step Name", description="Name of the Prohect Cycle Step", dataType=FlyDataType.String, entityType="D", printName="Cycle Step", fieldLength=60)
	CycleStepName,
	//
	@FlyElement(name="年", description="日历年", help="The Year uniquely identifies an accounting year for a calendar.", dataType=FlyDataType.TableDirect, entityType="D", printName="年", fieldLength=22)
	C_Year_ID,
	//
	@FlyElement(name="数据列 2", description="数据列为线制成图表", help="Additional Graph Data Column for Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列 2", fieldLength=22)
	Data1_PrintFormatItem_ID,
	//
	@FlyElement(name="数据列 3", description="数据列为线制成图表", help="Additional Graph Data Column for Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列 3", fieldLength=22)
	Data2_PrintFormatItem_ID,
	//
	@FlyElement(name="数据列 4", description="数据列为线制成图表", help="Additional Graph Data Column for Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列 4", fieldLength=22)
	Data3_PrintFormatItem_ID,
	//
	@FlyElement(name="数据列 5", description="数据列为线制成图表", help="Additional Graph Data Column for Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列 5", fieldLength=22)
	Data4_PrintFormatItem_ID,
	//
	@FlyElement(name="Database", description="Database Information", dataType=FlyDataType.String, entityType="D", printName="Database", fieldLength=255)
	DatabaseInfo,
	//
	@FlyElement(name="数据格式", description="Format String in Java Notation, e.g. ddMMyy", help="The Date Format indicates how dates are defined on the record to be imported.  It must be in Java Notation", dataType=FlyDataType.String, entityType="D", printName="数据格式", fieldLength=20)
	DataFormat,
	//
	@FlyElement(name="数据列", description="Data Column for Pie and Line Charts", help="Graph Data Column for Pie and Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列", fieldLength=22)
	Data_PrintFormatItem_ID,
	//
	@FlyElement(name="数据类型", description="数据的类型", dataType=FlyDataType.List, entityType="D", printName="数据类型", fieldLength=1)
	DataType,
	//
	@FlyElement(name="日期", description="Date when business is not conducted", help="The Date field identifies a calendar date on which business will not be conducted.", dataType=FlyDataType.Date, entityType="D", printName="日期", fieldLength=7)
	Date1,
	//
	@FlyElement(name="记账日期", description="记账日期", help="The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document", dataType=FlyDataType.Date, entityType="D", printName="记账日期", fieldLength=7)
	DateAcct,
	//
	@FlyElement(name="DateAcct2", dataType=FlyDataType.NONE, entityType="D", printName="DateAcct2", fieldLength=0)
	DateAcct2,
	//
	@FlyElement(name="日期列", description="完全合格日期列", help="The Date Column indicates the date to be used when calculating this measurement", dataType=FlyDataType.String, entityType="D", printName="日期列", fieldLength=60)
	DateColumn,
	//
	@FlyElement(name="Complete Plan", description="Planned Completion Date", help="Date when the task is planned to be complete", dataType=FlyDataType.Date, entityType="D", printName="Complete Plan", fieldLength=7)
	DateCompletePlan,
	//
	@FlyElement(name="Date Confirm", description="Date Confirm of this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Confirm", fieldLength=29)
	DateConfirm,
	//
	@FlyElement(name="契约日期", description="The (planned) effective date of this document.", help="The contract date is used to determine when the document becomes effective. This is usually the contract date.  The contract date is used in reports and report parameters.", dataType=FlyDataType.Date, entityType="D", printName="契约日期", fieldLength=7)
	DateContract,
	//
	@FlyElement(name="配送日期", description="Date when the product was delivered", dataType=FlyDataType.Date, entityType="D", printName="配送日期", fieldLength=7)
	DateDelivered,
	//
	@FlyElement(name="文件日期", description="文件的日期", help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.", dataType=FlyDataType.Date, entityType="D", printName="文件日期", fieldLength=7)
	DateDoc,
	//
	@FlyElement(name="费用日期", description="费用日期", help="费用日期", dataType=FlyDataType.Date, entityType="D", printName="费用日期", fieldLength=7)
	DateExpense,
	//
	@FlyElement(name="完成日期", description="Finish or (planned) completion date", help="The finish date is used to indicate when the project is expected to be completed or has been completed.", dataType=FlyDataType.Date, entityType="D", printName="完成日期", fieldLength=7)
	DateFinish,
	//
	@FlyElement(name="Date Finish Schedule", description="Scheduled Finish date for this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Finish Schedule", fieldLength=29)
	DateFinishSchedule,
	//
	@FlyElement(name="Date Format", description="Date format used in the imput format", help="The date format is usually detected, but sometimes need to be defined.", dataType=FlyDataType.String, entityType="D", printName="Date Format", fieldLength=20)
	DateFormat,
	//
	@FlyElement(name="开始日期", description="出发日期为范围", help="The Date From indicates the starting date of a range.", dataType=FlyDataType.Date, entityType="D", printName="开始日期", fieldLength=7)
	DateFrom,
	//
	@FlyElement(name="Invited", description="Date when (last) invitation was sent", dataType=FlyDataType.Date, entityType="D", printName="Invited", fieldLength=7)
	DateInvited,
	//
	@FlyElement(name="发票日期", description="发票打印日期", help="The Date Invoice indicates the date printed on the invoice.", dataType=FlyDataType.Date, entityType="D", printName="发票日期", fieldLength=7)
	DateInvoiced,
	//
	@FlyElement(name="最近动作日期", description="Date this request was last acted on", help="The Date Last Action indicates that last time that the request was acted on.", dataType=FlyDataType.DateTime, entityType="D", printName="最近动作日期", fieldLength=7)
	DateLastAction,
	//
	@FlyElement(name="上次警报日期", description="上次发出警报的日期", help="The last alert date is updated when a reminder email is sent", dataType=FlyDataType.DateTime, entityType="D", printName="上次警报日期", fieldLength=7)
	DateLastAlert,
	//
	@FlyElement(name="最近盘点日期", description="最近盘点日期", help="The Date Last Inventory Count indicates the last time an Inventory count was done.", dataType=FlyDataType.Date, entityType="D", printName="最近盘点日期", fieldLength=7)
	DateLastInventory,
	//
	@FlyElement(name="最近运行日期", description="Date the process was last run.", help="The Date Last Run indicates the last time that a process was run.", dataType=FlyDataType.DateTime, entityType="D", printName="最近运行日期", fieldLength=7)
	DateLastRun,
	//
	@FlyElement(name="下次运行日期", description="Date that this request should be acted on", help="The Date Next Action indicates the next scheduled date for an action to occur for this request.", dataType=FlyDataType.DateTime, entityType="D", printName="下次运行日期", fieldLength=7)
	DateNextAction,
	//
	@FlyElement(name="下次运行日期", description="Date the process will run next", help="The Date Next Run indicates the next time this process will run.", dataType=FlyDataType.DateTime, entityType="D", printName="下次运行日期", fieldLength=7)
	DateNextRun,
	//
	@FlyElement(name="定单日期", description="定单日期", help="Indicates the Date an item was ordered.", dataType=FlyDataType.Date, entityType="D", printName="定单日期", fieldLength=7)
	DateOrdered,
	//
	@FlyElement(name="Date Pattern", description="Java Date Pattern", help="Option Date pattern in Java notation. Examples: dd.MM.yyyy - dd/MM/yyyy If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.String, entityType="D", printName="Date Pattern", fieldLength=20)
	DatePattern,
	//
	@FlyElement(name="打印日期", description="Date the document was printed.", help="Indicates the Date that a document was printed.", dataType=FlyDataType.Date, entityType="D", printName="打印日期", fieldLength=7)
	DatePrinted,
	//
	@FlyElement(name="允诺日期", description="定单允诺日期", help="The Date Promised indicates the date, if any, that an Order was promised for.", dataType=FlyDataType.Date, entityType="D", printName="允诺日期", fieldLength=7)
	DatePromised,
	//
	@FlyElement(name="收到日期", description="产品收到日", help="The Date Received indicates the date that product was received.", dataType=FlyDataType.Date, entityType="D", printName="收到日期", fieldLength=7)
	DateReceived,
	//
	@FlyElement(name="报表日期", description="Expense Time Report Date", help="Date of Expense Time Report", dataType=FlyDataType.Date, entityType="D", printName="报表日期", fieldLength=7)
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
	@FlyElement(name="结束日期", description="结束一日期范围的日期", help="The Date To indicates the end date of a range (inclusive)", dataType=FlyDataType.Date, entityType="D", printName="结束日期", fieldLength=7)
	DateTo,
	//
	@FlyElement(name="交易日期", description="交易日期", help="The Transaction Date indicates the date of the transaction.", dataType=FlyDataType.Date, entityType="D", printName="交易日期", fieldLength=7)
	DateTrx,
	//
	@FlyElement(name="估价日期", description="估价日期", dataType=FlyDataType.Date, entityType="D", printName="估价日期", fieldLength=7)
	DateValue,
	//
	@FlyElement(name="Work Complete", description="Date when work is (planned to be) complete", dataType=FlyDataType.Date, entityType="D", printName="Work Complete", fieldLength=7)
	DateWorkComplete,
	//
	@FlyElement(name="Work Start", description="Date when work is (planned to be) started", dataType=FlyDataType.Date, entityType="D", printName="Work Start", fieldLength=7)
	DateWorkStart,
	//
	@FlyElement(name="到期天后天数", description="到期天后开始催讨天数", help="The Days After Due Date indicates the number of days after the payment due date to initiate dunning.", dataType=FlyDataType.Number, entityType="D", printName="到期天后天数", fieldLength=22)
	DaysAfterDue,
	//
	@FlyElement(name="催讨间隔", description="Days between sending dunning notices", help="The Days Between Dunning indicates the number of days between sending dunning notices.", dataType=FlyDataType.Integer, entityType="D", printName="催讨间隔", fieldLength=22)
	DaysBetweenDunning,
	//
	@FlyElement(name="到期天数", description="Number of days due (negative: due in number of days)", dataType=FlyDataType.Integer, entityType="D", printName="到期天数", fieldLength=22)
	DaysDue,
	//
	@FlyElement(name="Days From", dataType=FlyDataType.Integer, entityType="D", printName="Days From", fieldLength=0)
	DaysFrom,
	//
	@FlyElement(name="Days To", dataType=FlyDataType.Integer, entityType="D", printName="Days To", fieldLength=0)
	DaysTo,
	//
	@FlyElement(name="数据库服务器地址", description="Address of the database server", dataType=FlyDataType.String, entityType="D", printName="DB服务器地址", fieldLength=255)
	DBAddress,
	//
	@FlyElement(name="数据库名", description="Database Name", dataType=FlyDataType.String, entityType="D", printName="数据库名", fieldLength=60)
	DBInstance,
	//
	@FlyElement(name="DBType", dataType=FlyDataType.List, entityType="D", printName="DBType", fieldLength=22)
	DBType,
	//
	@FlyElement(name="Decimal Pattern", description="Java Decimal Pattern", help="Option Decimal pattern in Java notation. Examples: 0000 will format 23 to 0023", dataType=FlyDataType.String, entityType="D", printName="Decimal Pattern", fieldLength=40)
	DecimalPattern,
	//
	@FlyElement(name="小数点", description="Decimal Point in the data file - if any", dataType=FlyDataType.String, entityType="D", printName="小数点", fieldLength=1)
	DecimalPoint,
	//
	@FlyElement(name="Decision date", dataType=FlyDataType.Date, entityType="D", printName="Decision date", fieldLength=7)
	DecisionDate,
	//
	@FlyElement(name="缺省帐户", description="Name of the Default Account Column", dataType=FlyDataType.String, entityType="D", printName="缺省帐户", fieldLength=30)
	Default_Account,
	//
	@FlyElement(name="Default Print Color", dataType=FlyDataType.Table, entityType="D", printName="Default Print Color", fieldLength=22)
	Default_AD_PrintColor_ID,
	//
	@FlyElement(name="Default Print Font", dataType=FlyDataType.Table, entityType="D", printName="Default Print Font", fieldLength=22)
	Default_AD_PrintFont_ID,
	//
	@FlyElement(name="缺省逻辑", description="Default value hierarchy, separated by ;", help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.", dataType=FlyDataType.Text, entityType="D", printName="缺省逻辑", fieldLength=2000)
	DefaultValue,
	//
	@FlyElement(name="缺省逻辑 2", description="Default value hierarchy, separated by ;", help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.", dataType=FlyDataType.String, entityType="D", printName="缺省逻辑 2", fieldLength=2000)
	DefaultValue2,
	//
	@FlyElement(name="Definite Sequence", dataType=FlyDataType.Table, entityType="D", printName="Definite Sequence", fieldLength=22)
	DefiniteSequence_ID,
	//
	@FlyElement(name="删除旧记录", description="Otherwise records will be added", dataType=FlyDataType.NONE, entityType="D", printName="删除旧记录", fieldLength=0)
	DeleteOld,
	//
	@FlyElement(name="删除以前导入了记录", description="Before processing delete old imported records in the import table", dataType=FlyDataType.NONE, entityType="D", printName="删除以前导入", fieldLength=0)
	DeleteOldImported,
	//
	@FlyElement(name="删除已存在会计分录", description="The selected accounting entries will be deleted!  DANGEROUS !!!", dataType=FlyDataType.NONE, entityType="D", printName="删除已存在会计分录", fieldLength=0)
	DeletePosting,
	//
	@FlyElement(name="配送确认", description="发电子邮件给配送证实", dataType=FlyDataType.String, entityType="D", printName="配送确认", fieldLength=120)
	DeliveryConfirmation,
	//
	@FlyElement(name="Delivery Count", description="Number of Deliveries", dataType=FlyDataType.Integer, entityType="D", printName="Delivery Count", fieldLength=22)
	DeliveryCount,
	//
	@FlyElement(name="Delivery Days", description="Number of Days (planned) until Delivery", dataType=FlyDataType.Integer, entityType="D", printName="Delivery Days", fieldLength=22)
	DeliveryDays,
	//
	@FlyElement(name="配送规则", description="Defines the timing of Delivery", help="The Delivery Rule indicates when an order should be delivered. For example should the order be delivered when the entire order is complete, when a line is complete or as the products become available.", dataType=FlyDataType.List, entityType="D", printName="配送规则", fieldLength=1)
	DeliveryRule,
	//
	@FlyElement(name="实际配送时间", description="Actual days between order and delivery", help="The Actual Delivery Time indicates the number of days elapsed between placing an order and the delivery of the order", dataType=FlyDataType.Integer, entityType="D", printName="实际配送时间", fieldLength=22)
	DeliveryTime_Actual,
	//
	@FlyElement(name="允诺配送时间", description="Promised days between order and delivery", help="The Promised Delivery Time indicates the number of days between the order date and the date that delivery was promised.", dataType=FlyDataType.Integer, entityType="D", printName="允诺配送时间", fieldLength=22)
	DeliveryTime_Promised,
	//
	@FlyElement(name="配送方法", description="定单配送方法", help="The Delivery Via indicates how the products should be delivered. For example, will the order be picked up or shipped.", dataType=FlyDataType.List, entityType="D", printName="配送方法", fieldLength=1)
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
	@FlyElement(name="DepreciationType", dataType=FlyDataType.String, entityType="D", printName="DepreciationType", fieldLength=10)
	DepreciationType,
	//
	@FlyElement(name="描述", description="该记录的可选描述", help="描述最多为 255 个字符。", dataType=FlyDataType.Text, entityType="D", printName="描述", fieldLength=255)
	Description,
	//
	@FlyElement(name="描述列", description="Description Column for Pie Line Bar Charts", help="Graph Description Column for Pie and Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="描述列", fieldLength=22)
	Description_PrintFormatItem_ID,
	//
	@FlyElement(name="描述网址", description="网址为描述", dataType=FlyDataType.URL, entityType="D", printName="描述网址", fieldLength=120)
	DescriptionURL,
	//
	@FlyElement(name="Destination_Directory", dataType=FlyDataType.String, entityType="D", printName="Destination_Directory", fieldLength=255)
	Destination_Directory,
	//
	@FlyElement(name="Destination_FileName", dataType=FlyDataType.String, entityType="D", printName="Destination_FileName", fieldLength=255)
	Destination_FileName,
	//
	@FlyElement(name="打印明细交易", dataType=FlyDataType.LongText, entityType="D", printName="打印明细交易", fieldLength=0)
	DetailInfo,
	//
	@FlyElement(name="Details/Source First", description="Details and Sources are printed before the Line", dataType=FlyDataType.NONE, entityType="D", printName="Details/Source First", fieldLength=0)
	DetailsSourceFirst,
	//
	@FlyElement(name="Developer Name", dataType=FlyDataType.String, entityType="D", printName="Developer Name", fieldLength=60)
	DeveloperName,
	//
	@FlyElement(name="差额", dataType=FlyDataType.Amount, entityType="D", printName="差额", fieldLength=22)
	DifferenceAmt,
	//
	@FlyElement(name="Difference", description="Difference Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Difference", fieldLength=22)
	DifferenceQty,
	//
	@FlyElement(name="Dimension Units", description="Units of Dimension", dataType=FlyDataType.List, entityType="D", printName="Units", fieldLength=1)
	DimensionUnits,
	//
	@FlyElement(name="Direct Deploy", dataType=FlyDataType.Button, entityType="D", printName="Direct Deploy", fieldLength=1)
	DirectDeploy,
	//
	@FlyElement(name="中止", description="该产品不再可用", help="The Discontinued check box indicates a product that has been discontinued.", dataType=FlyDataType.YesNo, entityType="D", printName="中止", fieldLength=1)
	Discontinued,
	//
	@FlyElement(name="Discontinued At", description="Discontinued At indicates Date when product was discontinued", dataType=FlyDataType.Date, entityType="D", printName="Discontinued At", fieldLength=7)
	DiscontinuedAt,
	//
	@FlyElement(name="中止人", description="中止人", help="The Discontinued By indicates the individual who discontinued this product", dataType=FlyDataType.NONE, entityType="D", printName="中止人", fieldLength=0)
	DiscontinuedBy,
	//
	@FlyElement(name="折扣 %", description="百分比折扣", help="The Discount indicates the discount applied or taken as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="折扣 %", fieldLength=22)
	Discount,
	//
	@FlyElement(name="打折 2%", description="百分比折扣", help="The Discount indicates the discount applied or taken as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="打折 2%", fieldLength=22)
	Discount2,
	//
	@FlyElement(name="折扣金额", description="有项目量的折扣", help="The Discount Amount indicates the discount amount for a document or line.", dataType=FlyDataType.Amount, entityType="D", printName="折扣", fieldLength=22)
	DiscountAmt,
	//
	@FlyElement(name="折扣日期", description="Last Date for payments with discount", help="Last Date where a deduction of the payment discount is allowed", dataType=FlyDataType.Date, entityType="D", printName="折扣日期", fieldLength=7)
	DiscountDate,
	//
	@FlyElement(name="折扣天数", description="Number of days from invoice date to be eligible for discount", help="The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.  ", dataType=FlyDataType.Integer, entityType="D", printName="折扣天数", fieldLength=22)
	DiscountDays,
	//
	@FlyElement(name="折扣天数 2", description="Number of days from invoice date to be eligible for discount", help="The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.  ", dataType=FlyDataType.Integer, entityType="D", printName="折扣天数 2", fieldLength=22)
	DiscountDays2,
	//
	@FlyElement(name="折扣类型", description="Type of trade discount calculation", help="Type of procedure used to calculate the trade discount percentage", dataType=FlyDataType.List, entityType="D", printName="折扣类型", fieldLength=1)
	DiscountType,
	//
	@FlyElement(name="显示长度", description="Length of the display in characters", help="The display length is mainly for String fields. The length has no impact, if the data type of the field is - Integer, Number, Amount	(length determined by the system) - YesNo	(Checkbox) - List, Table, TableDir	(length of combo boxes are determined by their content at runtime)", dataType=FlyDataType.Integer, entityType="D", printName="显示长度", fieldLength=22)
	DisplayLength,
	//
	@FlyElement(name="显示逻辑", description="If the Field is displayed, the result determines if the field is actually displayed", help="format		:= <表达> [<逻辑> <表达>] expression	:= @<上下文>@=<价值>或 @<上下文>@!<价值> logic		:= <|>|<&>	context		:= any global or window context value		:= strings logic operators	:= AND or OR with the previous result from left to right Example	'@AD_Table_ID@=14 | @Language@!'GERGER' As it is always a string comparison, the string delimiters are optional, but suggested for future compatibility", dataType=FlyDataType.Text, entityType="D", printName="显示逻辑", fieldLength=2000)
	DisplayLogic,
	//
	@FlyElement(name="地址打印格式", description="Format for printing this Address", help="The Address Print format defines the format to be used when this address prints.  The following notations are used: @C@=City  @P@=Postal  @A@=PostalAdd  @R@=Region", dataType=FlyDataType.String, entityType="D", printName="地址打印格式", fieldLength=20)
	DisplaySequence,
	//
	@FlyElement(name="本地地址格式", description="Format for printing this Address locally", help="The optional Local Address Print format defines the format to be used when this address prints for the Country.  If defined, this format is used for printing the address for the country rather then the standard address format.	 The following notations are used: @C@=City  @P@=Postal  @A@=PostalAdd  @R@=Region", dataType=FlyDataType.String, entityType="D", printName="本地地址格式", fieldLength=20)
	DisplaySequenceLocal,
	//
	@FlyElement(name="Display SQL", description="SQL for display of lookup value", help="Fully qualified subquery SQL", dataType=FlyDataType.NONE, entityType="D", printName="Display SQL", fieldLength=0)
	DisplaySQL,
	//
	@FlyElement(name="Distribution Sorting", description="Quantity distribution sorting by unit price", dataType=FlyDataType.List, entityType="D", printName="Distribution Sorting", fieldLength=1)
	DistributionSorting,
	//
	@FlyElement(name="Distribution Type", description="Type of quantity distribution calculation using comparison qty and order qty as operand", dataType=FlyDataType.List, entityType="D", printName="Distribution Type", fieldLength=1)
	DistributionType,
	//
	@FlyElement(name="除以100", description="Divide number by 100 to get correct amount", dataType=FlyDataType.YesNo, entityType="D", printName="除以100", fieldLength=1)
	DivideBy100,
	//
	@FlyElement(name="分开比率", description="To convert Source number to Target number, the Source is divided", help="To convert Source number to Target number, the Source is divided by the divide rate.  If you enter a Divide Rate, the Multiply Rate will be automatically calculated.", dataType=FlyDataType.Number, entityType="D", printName="分开比率", fieldLength=22)
	DivideRate,
	//
	@FlyElement(name="文档动作", description="The targeted status of the document", help="You find the current status in the Document Status field. The options are listed in a popup", dataType=FlyDataType.Button, entityType="D", printName="文件动作", fieldLength=2)
	DocAction,
	//
	@FlyElement(name="文档基本类型", description="文件的逻辑类型", help="The Document Base Type identifies the base or starting point for a document.  Multiple document types may share a single document base type.", dataType=FlyDataType.List, entityType="D", printName="文件基本类型", fieldLength=3)
	DocBaseType,
	//
	@FlyElement(name="计算基础", description="Basis for the calculation the commission", help="The Calculation Basis indicates the basis to be used for the commission calculation. ", dataType=FlyDataType.List, entityType="D", printName="计算基础", fieldLength=1)
	DocBasisType,
	//
	@FlyElement(name="文档序列", description="Document sequence determines the numbering of documents", help="The Document Sequence indicates the sequencing rule to use for this document type.", dataType=FlyDataType.Table, entityType="D", printName="文件序列", fieldLength=22)
	DocNoSequence_ID,
	//
	@FlyElement(name="文档状态", description="The current status of the document", help="The Document Status indicates the status of a document at this time.  If you want to change the document status, use the Document Action field", dataType=FlyDataType.List, entityType="D", printName="文件状态", fieldLength=2)
	DocStatus,
	//
	@FlyElement(name="销售定单子类型", description="销售定单替代人员类型", help="The SO Sub Type indicates the type of sales order this document refers to.  This field only appears when the Document Base Type is Sales Order.  The selection made here will determine which documents will be generated when an order is processed and which documents must be generated manually or in batches.  <br>	The following outlines this process.<br>销售定单子类型 <b>标准定单<b>意志仅仅产生那 <b>定单<b> document when the order is processed.  <br>那 <b>配送注解<b>, <b>发票<b>而且 <b>收货<b> must be generated via other processes.  <br>销售定单子类型 <b>仓库定单<b>意志产生那 <b>定单<b>而且 <b>配送注解<b>. <br>那 <b>发票<b>而且 <b>收货<b> must be generated via other processes.<br>销售定单子类型 <b>信用定单<b>意志产生那 <b>定单<b>, <b>配送注解<b>而且 <b>发票<b>. <br>那 <b>Reciept<b> must be generated via other processes.<br>销售定单子类型 <b>POS<b> (Point of Sale) will generate all document", dataType=FlyDataType.List, entityType="D", printName="销售定单子类型", fieldLength=2)
	DocSubTypeSO,
	//
	@FlyElement(name="文件类型名", description="文件类型名", dataType=FlyDataType.String, entityType="D", printName="DocType 名", fieldLength=60)
	DocTypeName,
	//
	@FlyElement(name="Document Amt", description="Document Amount", dataType=FlyDataType.Amount, entityType="D", printName="Document Amt", fieldLength=22)
	DocumentAmt,
	//
	@FlyElement(name="文件份数", description="Number of copies to be printed", help="The Document Copies indicates the number of copies of each document that will be generated.", dataType=FlyDataType.Integer, entityType="D", printName="份数", fieldLength=22)
	DocumentCopies,
	//
	@FlyElement(name="文档目录", description="Directory for documents from the application server", help="Directory to store documents by the application server.  The path directory is accessed by the application server and may not be accessible to clients.", dataType=FlyDataType.String, entityType="D", printName="文档目录", fieldLength=60)
	DocumentDir,
	//
	@FlyElement(name="文档号", description="Document sequence number of the document", help="The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in '<>'.		If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice).  If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the 'Maintain Sequence' window with the name 'DocumentNo_<TableName>', where TableName is the actual name of the table (e.g. C_Order).", dataType=FlyDataType.String, entityType="D", printName="文档号", fieldLength=30)
	DocumentNo,
	//
	@FlyElement(name="文件注释", description="Additional information for a Document", help="The Document Note is used for recording any additional information regarding this product.", dataType=FlyDataType.Text, entityType="D", printName="文件注释", fieldLength=2000)
	DocumentNote,
	//
	@FlyElement(name="文件类型", description="文件类型", dataType=FlyDataType.String, entityType="D", printName="文件类型", fieldLength=60)
	DocumentType,
	//
	@FlyElement(name="文件类型注释", description="Optional note of a document type", dataType=FlyDataType.String, entityType="D", printName="文件类型注释", fieldLength=2000)
	DocumentTypeNote,
	//
	@FlyElement(name="Document Value Logic", description="Logic to determine Workflow Start - If true, a workflow process is started for the document", dataType=FlyDataType.String, entityType="D", printName="Doc Value Logic", fieldLength=2000)
	DocValueLogic,
	//
	@FlyElement(name="Domain Label", description="Label for the domain axis.", dataType=FlyDataType.String, entityType="D", printName="Domain Label", fieldLength=60)
	DomainLabel,
	//
	@FlyElement(name="Pricing", dataType=FlyDataType.Button, entityType="D", printName="Pricing", fieldLength=1)
	DoPricing,
	//
	@FlyElement(name="下载网址", description="下载的网址", help="Semicolon separated list of URLs to be downloaded or distributed", dataType=FlyDataType.URL, entityType="D", printName="下载网址", fieldLength=120)
	DownloadURL,
	//
	@FlyElement(name="Account (debit)", description="Account used", help="The (natural) account used", dataType=FlyDataType.NONE, entityType="D", printName="Account (debit)", fieldLength=0)
	DR_Account_ID,
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
	@FlyElement(name="应付余额", description="付款应付款金额", help="Full amount of the payment due", dataType=FlyDataType.Amount, entityType="D", printName="应付余额", fieldLength=22)
	DueAmt,
	//
	@FlyElement(name="应付款日期", description="付款到期日", help="Date when the payment is due without deductions or discount", dataType=FlyDataType.Date, entityType="D", printName="应付款日期", fieldLength=7)
	DueDate,
	//
	@FlyElement(name="Due Date Tolerance", description="Tolerance in days between the Date Next Action and the date the request is regarded as overdue", help="When the Date Next Action is passed, the Request becomes Due. After the Due Date Tolerance, the Request becomes Overdue.", dataType=FlyDataType.Integer, entityType="D", printName="Due Date Tolerance", fieldLength=22)
	DueDateTolerance,
	//
	@FlyElement(name="应付款类型", description="Status of the next action for this Request", help="The Due Type indicates if this request is Due, Overdue or Scheduled.", dataType=FlyDataType.List, entityType="D", printName="应付款类型", fieldLength=1)
	DueType,
	//
	@FlyElement(name="催讨日期", description="催讨日期", dataType=FlyDataType.Date, entityType="D", printName="催讨日期", fieldLength=7)
	DunningDate,
	//
	@FlyElement(name="Dunning Grace Date", dataType=FlyDataType.Date, entityType="D", printName="Dunning Grace Date", fieldLength=7)
	DunningGrace,
	//
	@FlyElement(name="催讨打印格式", description="Print Format for printing Dunning Letters", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="催讨打印格式", fieldLength=22)
	Dunning_PrintFormat_ID,
	//
	@FlyElement(name="催讨", description="催促者 &Bradstreet 数字", help="Used for EDI - For details see   www.dnb.com dunsno list.htm", dataType=FlyDataType.String, entityType="D", printName="催讨", fieldLength=11)
	DUNS,
	//
	@FlyElement(name="Duration", description="Normal Duration in Duration Unit", help="Expected (normal) Length of time for the execution", dataType=FlyDataType.Integer, entityType="D", printName="Duration", fieldLength=22)
	Duration,
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
	@FlyElement(name="EDI 状态", dataType=FlyDataType.List, entityType="D", printName="EDI 状态", fieldLength=1)
	EDIStatus,
	//
	@FlyElement(name="EDI 类型", dataType=FlyDataType.List, entityType="D", printName="EDI 类型", fieldLength=1)
	EDIType,
	//
	@FlyElement(name="职员费用", description="职员费用帐户", help="The Employee Expense Account identifies the account to use for recording expenses for this employee.", dataType=FlyDataType.Account, entityType="D", printName="职员费用", fieldLength=22)
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
	@FlyElement(name="EFT Payee Account", description="Electronic Funds Transfer Payyee Account Information", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Payee Account", fieldLength=40)
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
	@FlyElement(name="Elapsed Time ms", description="Elapsed Time in mili seconds", help="Elapsed Time in mili seconds", dataType=FlyDataType.Number, entityType="D", printName="Elapsed Time", fieldLength=22)
	ElapsedTimeMS,
	//
	@FlyElement(name="Electronic Scales", description="Allows to define path for Device Electronic Scales e.g. /dev/ttyS0/", dataType=FlyDataType.String, entityType="D", printName="Electronic Scales", fieldLength=120)
	ElectronicScales,
	//
	@FlyElement(name="元素名", description="元素名", dataType=FlyDataType.String, entityType="D", printName="元素名", fieldLength=60)
	ElementName,
	//
	@FlyElement(name="Elements", description="Contains list of elements separated by CR", help="Contains a list of elements this template uses separated by a Carriage Return. Last line should be empty", dataType=FlyDataType.Text, entityType="D", printName="Elements", fieldLength=2000)
	Elements,
	//
	@FlyElement(name="类型", description="Element Type (account or user defined)", help="元素类型标明此元素是财务元素还是自定义元素。  ", dataType=FlyDataType.List, entityType="D", printName="类型", fieldLength=1)
	ElementType,
	//
	@FlyElement(name="元素关键字", description="元素的关键字", dataType=FlyDataType.String, entityType="D", printName="元素关键字", fieldLength=40)
	ElementValue,
	//
	@FlyElement(name="电邮", description="电子邮件地址", help="The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web.", dataType=FlyDataType.String, entityType="D", printName="电邮", fieldLength=60)
	EMail,
	//
	@FlyElement(name="错误电子邮件", description="Email address to send error messages to", dataType=FlyDataType.String, entityType="D", printName="错误电子邮件", fieldLength=60)
	EMail_Error_To,
	//
	@FlyElement(name="EMail Footer", description="Footer added to EMails", help="The footer is added to every email.", dataType=FlyDataType.Text, entityType="D", printName="EMail Footer", fieldLength=2000)
	EMailFooter,
	//
	@FlyElement(name="从电子邮件", description="Full Email address used to send requests - e.g. edi@organization.com", dataType=FlyDataType.String, entityType="D", printName="从电子邮件", fieldLength=60)
	EMail_From,
	//
	@FlyElement(name="从电子邮件", description="Password of the sending Email address", dataType=FlyDataType.String, entityType="D", printName="从电子邮件密码", fieldLength=20)
	EMail_From_Pwd,
	//
	@FlyElement(name="从电子邮件用户", description="User ID of the sending Email address (on default SMTP Host) - e.g. edi", dataType=FlyDataType.String, entityType="D", printName="从电子邮件用户", fieldLength=20)
	EMail_From_Uid,
	//
	@FlyElement(name="EMail Header", description="Header added to EMails", help="The header is added to every email.", dataType=FlyDataType.Text, entityType="D", printName="EMail Header", fieldLength=2000)
	EMailHeader,
	//
	@FlyElement(name="信息电子邮件", description="Email address to send informational messages and copies", help="The Info Email address indicates the address to use when sending informational messages or copies of other messages.", dataType=FlyDataType.String, entityType="D", printName="信息电子邮件", fieldLength=60)
	EMail_Info_To,
	//
	@FlyElement(name="发电子邮件给可携式电子文件", description="Email Invoice PDF files to customer", dataType=FlyDataType.NONE, entityType="D", printName="发电子邮件给可携式电子文件", fieldLength=0)
	EMailPDF,
	//
	@FlyElement(name="EMail Recipient", description="Recipient of the EMail", dataType=FlyDataType.List, entityType="D", printName="EMail Recipient", fieldLength=1)
	EMailRecipient,
	//
	@FlyElement(name="EMail Test", description="Test EMail", dataType=FlyDataType.Button, entityType="D", printName="EMail Test", fieldLength=1)
	EMailTest,
	//
	@FlyElement(name="发电子邮件给", description="Email address to send requests to - e.g. edi@manufacturer.com ", dataType=FlyDataType.String, entityType="D", printName="发电子邮件给", fieldLength=60)
	EMail_To,
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
	@FlyElement(name="欧元条目日期", description="Date when the currency joined   will join the EMU", help="The EMU Entry Date defines the date that this currency entered, or will enter the Economic Monetary Union.", dataType=FlyDataType.Date, entityType="D", printName="欧元条目日期", fieldLength=7)
	EMUEntryDate,
	//
	@FlyElement(name="欧元汇率", description="对欧元的官方比率", help="The EMU Rate defines the official rate to be used when converting from this currency to the Euro.", dataType=FlyDataType.Number, entityType="D", printName="欧元汇率", fieldLength=22)
	EMURate,
	//
	@FlyElement(name="加密密钥", description="Encryption Key used for securing data content", help="Please note that changing the key will make ALL previously encrypted data unreadable.", dataType=FlyDataType.String, entityType="D", printName="加密密钥", fieldLength=255)
	EncryptionKey,
	//
	@FlyElement(name="Encryption Type", description="Encryption Type used for securing data content", dataType=FlyDataType.List, entityType="D", printName="Encryption Type", fieldLength=1)
	EncryptionType,
	//
	@FlyElement(name="结束日期", description="Last effective date (inclusive)", help="The End Date indicates the last date in this range.", dataType=FlyDataType.Date, entityType="D", printName="结束日期", fieldLength=7)
	EndDate,
	//
	@FlyElement(name="终止余款", description="终止或结束余款", help="The Ending Balance is the result of adjusting the Beginning Balance by any payments or disbursements.", dataType=FlyDataType.Amount, entityType="D", printName="终止余款", fieldLength=22)
	EndingBalance,
	//
	@FlyElement(name="Ending Qty Balance", description="Quantity Ending  or closing balance", help="The Qunatity Ending Balance is the result of adjusting the Quantity Beginning Balance ", dataType=FlyDataType.NONE, entityType="D", printName="Ending Qty Balance", fieldLength=0)
	EndingQtyBalance,
	//
	@FlyElement(name="结束号", dataType=FlyDataType.Integer, entityType="D", printName="结束号", fieldLength=22)
	EndNo,
	//
	@FlyElement(name="End Time", description="End of the time span", dataType=FlyDataType.DateTime, entityType="D", printName="End Time", fieldLength=7)
	EndTime,
	//
	@FlyElement(name="End Wait", description="End of sleep time", help="End of suspension (sleep)", dataType=FlyDataType.DateTime, entityType="D", printName="End Wait", fieldLength=7)
	EndWaitTime,
	//
	@FlyElement(name="强制客户安全性", description="Send alerts to recipient only if the client security rules of the role allows", dataType=FlyDataType.YesNo, entityType="D", printName="强制客户安全性", fieldLength=1)
	EnforceClientSecurity,
	//
	@FlyElement(name="强制价格限制", description="Do not allow prices below the limit price", help="The Enforce Price Limit check box indicates that prices cannot be below the limit price in Orders. Invoices are not checked.", dataType=FlyDataType.YesNo, entityType="D", printName="强制价格限制", fieldLength=1)
	EnforcePriceLimit,
	//
	@FlyElement(name="强制角色安全性", description="Send alerts to recipient only if the data security rules of the role allows", dataType=FlyDataType.YesNo, entityType="D", printName="强制角色安全性", fieldLength=1)
	EnforceRoleSecurity,
	//
	@FlyElement(name="实体类型", description="字典实体类型; 确定所有者和同步性", help="实体类型'字典/Dictionary', 'Adempiere' 和 '应用/Application' 能够自动的同步因此客户化的工作将被删除或覆盖  		要客户化,请复制实体并选择'用户/User'!", dataType=FlyDataType.Table, entityType="D", printName="实体类型", fieldLength=40)
	EntityType,
	//
	@FlyElement(name="职员预付款", description="Account for Employee Expense Prepayments", help="The Employee Prepayment Account identifies the account to use for recording expense advances made to this employee.", dataType=FlyDataType.Account, entityType="D", printName="职员预付款", fieldLength=22)
	E_Prepayment_Acct,
	//
	@FlyElement(name="错误 Msg", dataType=FlyDataType.String, entityType="D", printName="错误 Msg", fieldLength=2000)
	ErrorMsg,
	//
	@FlyElement(name="Error Trace", description="System Error Trace", help="Java Trace Info", dataType=FlyDataType.Text, entityType="D", printName="Error Trace", fieldLength=2000)
	ErrorTrace,
	//
	@FlyElement(name="发票在甚至星期", description="在甚至星期送发票", help="The Invoice on Even Weeks checkbox indicates if biweekly invoices should be sent on even week numbers.", dataType=FlyDataType.YesNo, entityType="D", printName="发票在甚至星期", fieldLength=1)
	EvenInvoiceWeek,
	//
	@FlyElement(name="Event Change Log", description="Type of Event in Change Log", dataType=FlyDataType.List, entityType="D", printName="Event Change Log", fieldLength=1)
	EventChangeLog,
	//
	@FlyElement(name="Event Model Validator", dataType=FlyDataType.List, entityType="D", printName="Event Model Validator", fieldLength=4)
	EventModelValidator,
	//
	@FlyElement(name="事件类型", description="事件的类型", dataType=FlyDataType.List, entityType="D", printName="事件类型", fieldLength=2)
	EventType,
	//
	@FlyElement(name="Excerpt", description="Surrounding text of the keyword", help="A passage or segment taken from a document,", dataType=FlyDataType.Text, entityType="D", printName="Excerpt", fieldLength=2000)
	Excerpt,
	//
	@FlyElement(name="免税者理由", description="理由为未扣留", help="The Exempt Reason indicates the reason that monies are not withheld from this employee.", dataType=FlyDataType.String, entityType="D", printName="免税者理由", fieldLength=20)
	ExemptReason,
	//
	@FlyElement(name="Expected Close Date", description="Expected Close Date", help="The Expected Close Date indicates the expected last or final date", dataType=FlyDataType.NONE, entityType="D", printName="Expected Close Date", fieldLength=0)
	ExpectedCloseDate,
	//
	@FlyElement(name="Expected Result", dataType=FlyDataType.String, entityType="D", printName="Expected Result", fieldLength=22)
	ExpectedResult,
	//
	@FlyElement(name="Expense", dataType=FlyDataType.Amount, entityType="D", printName="Expense", fieldLength=22)
	Expense,
	//
	@FlyElement(name="费用金额", description="金额为费用", help="费用币种的金额", dataType=FlyDataType.Amount, entityType="D", printName="费用金额", fieldLength=22)
	ExpenseAmt,
	//
	@FlyElement(name="Expense (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Expense (fiscal)", fieldLength=0)
	Expense_F,
	//
	@FlyElement(name="Export to XML", description="Export this record to XML", dataType=FlyDataType.NONE, entityType="D", printName="Export to XML", fieldLength=0)
	ExportXML,
	//
	@FlyElement(name="银行账号格式", description="银行账号的格式", dataType=FlyDataType.String, entityType="D", printName="银行账号格式", fieldLength=20)
	ExpressionBankAccountNo,
	//
	@FlyElement(name="银行Routing码格式", description="Format of the Bank Routing Number", dataType=FlyDataType.String, entityType="D", printName="银行Routing码格式", fieldLength=20)
	ExpressionBankRoutingNo,
	//
	@FlyElement(name="电话号码格式", description="Format of the phone; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任意字符	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="电话号码格式", fieldLength=20)
	ExpressionPhone,
	//
	@FlyElement(name="邮编格式", description="Format of the postal code; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任何的个性	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="邮编格式", fieldLength=20)
	ExpressionPostal,
	//
	@FlyElement(name="附加邮编格式", description="Format of the value; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任何的个性	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="附加邮编格式", fieldLength=20)
	ExpressionPostal_Add,
	//
	@FlyElement(name="会计分录", dataType=FlyDataType.ID, entityType="D", printName="会计分录", fieldLength=22)
	Fact_Acct_ID,
	//
	@FlyElement(name="Factor", description="Scaling factor.", help="Numbers are divided by the scaling factor for presentation.  E.g. 123,000 with a scaling factor of 1,000 will display as 123.", dataType=FlyDataType.List, entityType="D", printName="Factor", fieldLength=1)
	Factor,
	//
	@FlyElement(name="Accounting Fact Reconciliation", dataType=FlyDataType.NONE, entityType="D", printName="Accounting Fact Reconciliation", fieldLength=0)
	Fact_Reconciliation_ID,
	//
	@FlyElement(name="传真", description="传真号", help="The Fax identifies a facsimile number for this Business Partner or  Location", dataType=FlyDataType.String, entityType="D", printName="传真", fieldLength=40)
	Fax,
	//
	@FlyElement(name="费用金额", description="Fee amount in invoice currency", help="The Fee Amount indicates the charge amount on a dunning letter for overdue invoices.  This field will only display if the charge fee checkbox has been selected.", dataType=FlyDataType.Amount, entityType="D", printName="费用", fieldLength=22)
	FeeAmt,
	//
	@FlyElement(name="字段对准", description="字段本文对准", help="Alignment of field text. The default is determined by the data display type: Numbers are right aligned, other data is left aligned", dataType=FlyDataType.List, entityType="D", printName="字段对准", fieldLength=1)
	FieldAlignmentType,
	//
	@FlyElement(name="Field Group Type", dataType=FlyDataType.List, entityType="D", printName="Field Group Type", fieldLength=10)
	FieldGroupType,
	//
	@FlyElement(name="长度", description="Length of the column in the database", help="The Length indicates the length of a column as defined in the database.", dataType=FlyDataType.Integer, entityType="D", printName="长度", fieldLength=22)
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
	@FlyElement(name="Find_ID", dataType=FlyDataType.Number, entityType="D", printName="Find_ID", fieldLength=22)
	Find_ID,
	//
	@FlyElement(name="Finish Mode", description="Workflow Activity Finish Mode", help="How the system operated at the end of an activity. Automatic  implies return when the invoked applications finished control - Manual the user has to explicitly terminate the activity.", dataType=FlyDataType.List, entityType="D", printName="Finish Mode", fieldLength=1)
	FinishMode,
	//
	@FlyElement(name="First Count Qty", dataType=FlyDataType.NONE, entityType="D", printName="1st Count", fieldLength=0)
	FirstCountQty,
	//
	@FlyElement(name="首次销售", description="首次销售日期", help="The First Sale Date identifies the date of the first sale to this Business Partner", dataType=FlyDataType.Date, entityType="D", printName="首次销售", fieldLength=7)
	FirstSale,
	//
	@FlyElement(name="Year", description="The Fiscal Year", help="The Year identifies the accounting year for a calendar.", dataType=FlyDataType.String, entityType="D", printName="Year", fieldLength=10)
	FiscalYear,
	//
	@FlyElement(name="固定金额", description="Fix amounted amount to be levied or paid", help="The Fixed Amount indicates a fixed amount to be levied or paid.", dataType=FlyDataType.Amount, entityType="D", printName="固定金额", fieldLength=22)
	FixAmt,
	//
	@FlyElement(name="fixedpercentage", dataType=FlyDataType.NONE, entityType="D", printName="fixedpercentage", fieldLength=0)
	fixedpercentage,
	//
	@FlyElement(name="固定月中止", description="Last day to include for next due date", help="The Fix Month Cutoff indicates the last day invoices can have to be included in the current due date.  This field only displays when the fixed due date checkbox has been selected.", dataType=FlyDataType.Integer, entityType="D", printName="固定月中止", fieldLength=22)
	FixMonthCutoff,
	//
	@FlyElement(name="固定月日", description="Day of the month of the due date", help="The Fix Month Day indicates the day of the month that invoices are due.  This field only displays if the fixed due date checkbox is selected.", dataType=FlyDataType.Integer, entityType="D", printName="固定月日", fieldLength=22)
	FixMonthDay,
	//
	@FlyElement(name="固定月抵销", description="Number of months (0=same, 1=following)", help="The Fixed Month Offset indicates the number of months from the current month to indicate an invoice is due.  A 0 indicates the same month, a 1 the following month.  This field will only display if the fixed due date checkbox is selected.", dataType=FlyDataType.Integer, entityType="D", printName="固定月抵销", fieldLength=22)
	FixMonthOffset,
	//
	@FlyElement(name="直线折扣 %", description="直线的折扣百分比 ", dataType=FlyDataType.Number, entityType="D", printName="直线折扣", fieldLength=22)
	FlatDiscount,
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
	@FlyElement(name="脚边距", description="Margin of the Footer in 1 72 of an inch", help="Distance from the bottom of the main content to the end of the printable page in 1 72 of an inch (point)", dataType=FlyDataType.Integer, entityType="D", printName="脚边距", fieldLength=22)
	FooterMargin,
	//
	@FlyElement(name="Footer Right", description="Content of the right portion of the footer.", dataType=FlyDataType.String, entityType="D", printName="Footer Right", fieldLength=255)
	FooterRight,
	//
	@FlyElement(name="Format Pattern", description="The pattern used to format a number or date.", help="A string complying with either Java SimpleDateFormat or DecimalFormat pattern syntax used to override the default presentation format of a date or number type field.", dataType=FlyDataType.String, entityType="D", printName="Format Pattern", fieldLength=22)
	FormatPattern,
	//
	@FlyElement(name="格式", description="数据的格式", help="The Format is a drop down list box for selecting the format type (text, tab delimited, XML, etc) of the file to be imported", dataType=FlyDataType.List, entityType="D", printName="格式", fieldLength=1)
	FormatType,
	//
	@FlyElement(name="Fully Qualified Domain Name", description="Fully Qualified Domain Name i.e. www.comdivision.com", help="This field contains the so called fully qualified domain name including host and domain, but not anything protocol specific like http or the document path.", dataType=FlyDataType.String, entityType="D", printName="Fully Qualified Domain Name", fieldLength=120)
	FQDN,
	//
	@FlyElement(name="运费金额 ", description="运费金额 ", help="The Freight Amount indicates the amount charged for Freight in the document currency.", dataType=FlyDataType.Amount, entityType="D", printName="运费金额", fieldLength=22)
	FreightAmt,
	//
	@FlyElement(name="运费成本规则", description="运费收费方法", help="The Freight Cost Rule indicates the method used when charging for freight.", dataType=FlyDataType.List, entityType="D", printName="运费成本规则", fieldLength=1)
	FreightCostRule,
	//
	@FlyElement(name="频率", description="事件的频率", help="The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks.", dataType=FlyDataType.Integer, entityType="D", printName="频率", fieldLength=22)
	Frequency,
	//
	@FlyElement(name="频率类型", description="事件的频率", help="The frequency type is used for calculating the date of the next event.", dataType=FlyDataType.List, entityType="D", printName="频率类型", fieldLength=1)
	FrequencyType,
	//
	@FlyElement(name="From子句", description="SQL的From子句", dataType=FlyDataType.Text, entityType="D", printName="From子句", fieldLength=2000)
	FromClause,
	//
	@FlyElement(name="函数背景颜色", description="函数背景颜色", help="Background color of a function row", dataType=FlyDataType.Table, entityType="D", printName="函数背景颜色", fieldLength=22)
	FunctBG_PrintColor_ID,
	//
	@FlyElement(name="函数颜色", description="函数前景颜色", help="Foreground color of a function row", dataType=FlyDataType.Table, entityType="D", printName="函数颜色", fieldLength=22)
	FunctFG_PrintColor_ID,
	//
	@FlyElement(name="函数列", description="Overwrite Column with Function ", help="The Function Column indicates that the column will be overridden with a function", dataType=FlyDataType.String, entityType="D", printName="函数列", fieldLength=60)
	FunctionColumn,
	//
	@FlyElement(name="Function Prefix", description="Data sent before the function", dataType=FlyDataType.String, entityType="D", printName="Function Prefix", fieldLength=40)
	FunctionPrefix,
	//
	@FlyElement(name="Function Suffix", description="Data sent after the function", dataType=FlyDataType.String, entityType="D", printName="Function Suffix", fieldLength=40)
	FunctionSuffix,
	//
	@FlyElement(name="函数字体", description="函数行字体", help="函数行字体", dataType=FlyDataType.Table, entityType="D", printName="函数字体", fieldLength=22)
	Funct_PrintFont_ID,
	//
	@FlyElement(name="未来成本价格", dataType=FlyDataType.CostsPrices, entityType="D", printName="未来成本价格", fieldLength=22)
	FutureCostPrice,
	//
	@FlyElement(name="公认会计准则", description="公认会计准则", help="The GAAP identifies the account principles that this accounting schema will adhere to.", dataType=FlyDataType.List, entityType="D", printName="公认会计准则", fieldLength=2)
	GAAP,
	//
	@FlyElement(name="Generate Class", description="Generate Class Button", dataType=FlyDataType.Button, entityType="D", printName="Generate Class", fieldLength=1)
	GenerateClass,
	//
	@FlyElement(name="产生目录", description="产生目录", dataType=FlyDataType.Button, entityType="D", printName="产生目录", fieldLength=1)
	GenerateList,
	//
	@FlyElement(name="生成定单", description="生成定单", dataType=FlyDataType.Button, entityType="D", printName="生成定单", fieldLength=1)
	GenerateOrder,
	//
	@FlyElement(name="Generate Report", dataType=FlyDataType.NONE, entityType="D", printName="Generate Report", fieldLength=0)
	GenerateReport,
	//
	@FlyElement(name="产生到", description="产生到", dataType=FlyDataType.Button, entityType="D", printName="产生到", fieldLength=1)
	GenerateTo,
	//
	@FlyElement(name="Budget Control", description="Budget Control", help="Budget Control allows you to restrict the use of expenditures, commitments (Purchase Orders) and reservations (Requisitions). If defined, you may not be able to approve Requisitions, Purchase Orders, or AP Invoices.", dataType=FlyDataType.ID, entityType="D", printName="Budget Control", fieldLength=10)
	GL_BudgetControl_ID,
	//
	@FlyElement(name="预算", description="通用分类帐预算", help="The General Ledger Budget identifies a user defined budget.  These can be used in reporting as a comparison against your actual amounts.", dataType=FlyDataType.TableDirect, entityType="D", printName="预算", fieldLength=22)
	GL_Budget_ID,
	//
	@FlyElement(name="总帐分类", description="总帐分类", help="The General Ledger Category is an optional, user defined method of grouping journal lines.", dataType=FlyDataType.TableDirect, entityType="D", printName="总帐分类", fieldLength=22)
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
	@FlyElement(name="分类帐批次", description="通用分类帐分类帐批次", help="The General Ledger Journal Batch identifies a group of journals to be processed as a group.", dataType=FlyDataType.TableDirect, entityType="D", printName="分类帐批次", fieldLength=22)
	GL_JournalBatch_ID,
	//
	@FlyElement(name="分类帐", description="通用分类帐分类帐", help="The General Ledger Journal identifies a group of journal lines which represent a logical business transaction", dataType=FlyDataType.ID, entityType="D", printName="分类帐", fieldLength=22)
	GL_Journal_ID,
	//
	@FlyElement(name="分类帐明细", description="通用分类帐分类帐明细", help="The General Ledger Journal Line identifies a single transaction in a journal.", dataType=FlyDataType.ID, entityType="D", printName="分类帐明细", fieldLength=22)
	GL_JournalLine_ID,
	//
	@FlyElement(name="Goal Display", description="Type of goal display on dashboard", help="Display goal on dashboard as html table or graph.", dataType=FlyDataType.List, entityType="D", printName="Goal Display", fieldLength=1)
	GoalDisplay,
	//
	@FlyElement(name="经营目标", description="Target achievement from 0..1", help="The Goal Performance indicates the target achievement from 0 to 1.", dataType=FlyDataType.Number, entityType="D", printName="经营目标", fieldLength=22)
	GoalPerformance,
	//
	@FlyElement(name="Restriction Type", description="Goal Restriction Type", help="Enter one or more records per Goal Restriction Type (e.g. Org o1, o2)", dataType=FlyDataType.List, entityType="D", printName="Restriction Type", fieldLength=1)
	GoalRestrictionType,
	//
	@FlyElement(name="Good for Days", description="Shelf Life Days remaning to Guarantee Date (minus minimum guarantee days)", help="Shelf Life of products with Guarantee Date instance compared to today minus the minimum guaranteed days.	(Guarantee Date-Today) – Min Guarantee Days", dataType=FlyDataType.Integer, entityType="D", printName="Good Days", fieldLength=22)
	GoodForDays,
	//
	@FlyElement(name="宽限天数", description="Days after due date to send first dunning letter", help="The Grace Days indicates the number of days after the due date to send the first dunning letter.  This field displays only if the send dunning letters checkbox has been selected.", dataType=FlyDataType.Integer, entityType="D", printName="宽限天数", fieldLength=22)
	GraceDays,
	//
	@FlyElement(name="总计", description="文件的总金额", help="The Grand Total displays the total amount including Tax and Freight in document currency", dataType=FlyDataType.Amount, entityType="D", printName="总计", fieldLength=22)
	GrandTotal,
	//
	@FlyElement(name="图表类型", description="图表类型", help="图表类型", dataType=FlyDataType.List, entityType="D", printName="图表类型", fieldLength=1)
	GraphType,
	//
	@FlyElement(name="绿色", description="RGB 值 ", dataType=FlyDataType.Integer, entityType="D", printName="绿色", fieldLength=22)
	Green,
	//
	@FlyElement(name="第二个绿色", description="RGB 第二颜色值", dataType=FlyDataType.Integer, entityType="D", printName="第二个绿色", fieldLength=22)
	Green_1,
	//
	@FlyElement(name="称谓", description="For letters, e.g. 'Dear {0}' or 'Dear Mr. {0}' - At runtime, '{0}' is replaced by the name", help="The Greeting indicates what will print on letters sent to a Business Partner.", dataType=FlyDataType.String, entityType="D", printName="称谓", fieldLength=60)
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
	@FlyElement(name="组关键字", description="业务伙伴组关键字", dataType=FlyDataType.String, entityType="D", printName="组关键字", fieldLength=40)
	GroupValue,
	//
	@FlyElement(name="保证日期", description="保证期满日", help="Date when the normal guarantee or availability expires", dataType=FlyDataType.Date, entityType="D", printName="保证日期", fieldLength=7)
	GuaranteeDate,
	//
	@FlyElement(name="保证天数", description="Number of days the product is guaranteed or available", help="If the value is 0, there is no limit to the availability or guarantee, otherwise the guarantee date is calculated by adding the days to the delivery date.", dataType=FlyDataType.Integer, entityType="D", printName="保证天数", fieldLength=22)
	GuaranteeDays,
	//
	@FlyElement(name="Min Guarantee Days", description="Minumum number of guarantee days", help="When selecting batch/products with a guarantee date, the minimum left guarantee days for automatic picking.  You can pick any batch/product manually. ", dataType=FlyDataType.Integer, entityType="D", printName="Min Guarantee", fieldLength=22)
	GuaranteeDaysMin,
	//
	@FlyElement(name="使用帐户别名", description="Ability to select (partial) account combinations by an Alias", help="The Alias checkbox indicates that account combination can be selected using a user defined alias or short key.", dataType=FlyDataType.YesNo, entityType="D", printName="别名", fieldLength=1)
	HasAlias,
	//
	@FlyElement(name="费用", description="Charges can be added to the document", help="The Charges checkbox indicates that charges can be added to this document.  Charges can include items like shipping, handling or bank charges.", dataType=FlyDataType.YesNo, entityType="D", printName="费用", fieldLength=1)
	HasCharges,
	//
	@FlyElement(name="使用组合控制", description="Combination of account elements are checked", help="The Combination Control checkbox indicates if the combination of account elements will be verified against the defined acceptable combination.", dataType=FlyDataType.YesNo, entityType="D", printName="组合控制", fieldLength=1)
	HasCombination,
	//
	@FlyElement(name="附加的邮政编码", description="有附加的邮政编码", help="The Additional Postal Code checkbox indicates if this address uses an additional Postal Code.  If it is selected an additional field displays for entry of the additional Postal Code.", dataType=FlyDataType.YesNo, entityType="D", printName="附加的邮政编码", fieldLength=1)
	HasPostal_Add,
	//
	@FlyElement(name="预格式发票", description="Indicates if Pro Forma Invoices can be generated from this document", help="The Pro Forma Invoice checkbox indicates if pro forma invoices can be generated from this sales document. A pro forma invoice indicates the amount that will be due should an order be shipped.", dataType=FlyDataType.YesNo, entityType="D", printName="预格式发票", fieldLength=1)
	HasProforma,
	//
	@FlyElement(name="该国有(省级)区划", description="该国有(省级)区划", help="The Country has Region checkbox is selected if the Country being defined is divided into regions.  If this checkbox is selected, the Region Tab is accessible.", dataType=FlyDataType.YesNo, entityType="D", printName="该国有(省级)区划", fieldLength=1)
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
	@FlyElement(name="有树", description="窗口有树", help="The Has Tree checkbox indicates if this window displays a tree metaphor.", dataType=FlyDataType.YesNo, entityType="D", printName="有树", fieldLength=1)
	HasTree,
	//
	@FlyElement(name="头明细颜色", description="表抬头线颜色", help="Color of the table header row lines", dataType=FlyDataType.Table, entityType="D", printName="头明细颜色", fieldLength=22)
	HdrLine_PrintColor_ID,
	//
	@FlyElement(name="抬头字型", description="抬头字型", help="表抬头的字型", dataType=FlyDataType.Table, entityType="D", printName="抬头字型", fieldLength=22)
	Hdr_PrintFont_ID,
	//
	@FlyElement(name="Header Stroke", description="Width of the Header Line Stroke", help="The width of the header line stroke (line thickness) in Points.", dataType=FlyDataType.Number, entityType="D", printName="Hdr Stroke", fieldLength=22)
	HdrStroke,
	//
	@FlyElement(name="Header Stroke Type", description="Type of the Header Line Stroke", help="Type of the line printed", dataType=FlyDataType.List, entityType="D", printName="Hdr Stroke Type", fieldLength=1)
	HdrStrokeType,
	//
	@FlyElement(name="抬头 BG 颜色", description="Background color of header row", help="Table header row background color", dataType=FlyDataType.Table, entityType="D", printName="抬头亿位元组颜色", fieldLength=22)
	HdrTextBG_PrintColor_ID,
	//
	@FlyElement(name="抬头颜色", description="Foreground color if the table header row", help="Table header row foreground color", dataType=FlyDataType.Table, entityType="D", printName="抬头颜色", fieldLength=22)
	HdrTextFG_PrintColor_ID,
	//
	@FlyElement(name="Header Center", description="Content of the center portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Center", fieldLength=255)
	HeaderCenter,
	//
	@FlyElement(name="Header Left", description="Content of the left portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Left", fieldLength=255)
	HeaderLeft,
	//
	@FlyElement(name="抬头边距", description="Margin of the Header in 1 72 of an inch", help="Distance from the top of the printable page to the start of the main content in 1 72 of an inch (point)", dataType=FlyDataType.Integer, entityType="D", printName="抬头边距", fieldLength=22)
	HeaderMargin,
	//
	@FlyElement(name="Header Right", description="Content of the right portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Right", fieldLength=255)
	HeaderRight,
	//
	@FlyElement(name="注释/帮助", description="注释或提示", help="The Help field contains a hint, comment or help about the use of this item.", dataType=FlyDataType.Text, entityType="D", printName="注释", fieldLength=2000)
	Help,
	//
	@FlyElement(name="HistoryYears", description="Number of years prior to current year to create in calendar", dataType=FlyDataType.Integer, entityType="D", printName="History Years", fieldLength=22)
	HistoryYears,
	//
	@FlyElement(name="主机地址", description="主人地址网址或 DNS", help="The Host Address identifies the URL or DNS of the target host", dataType=FlyDataType.String, entityType="D", printName="主机地址", fieldLength=60)
	HostAddress,
	//
	@FlyElement(name="主机端口", description="主办沟通港口", help="The Host Port identifies the port to communicate with the host.", dataType=FlyDataType.Integer, entityType="D", printName="主机端口", fieldLength=22)
	HostPort,
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
	@FlyElement(name="导入银行对帐单", description="银行对帐单的导入", dataType=FlyDataType.ID, entityType="D", printName="导入银行对帐单", fieldLength=22)
	I_BankStatement_ID,
	//
	@FlyElement(name="导入业务伙伴", dataType=FlyDataType.ID, entityType="D", printName="Import B.Partner", fieldLength=22)
	I_BPartner_ID,
	//
	@FlyElement(name="I_Budget_ID", dataType=FlyDataType.NONE, entityType="D", printName="I_Budget_ID", fieldLength=0)
	I_Budget_ID,
	//
	@FlyElement(name="Import Conversion Rate", description="Import Currency Conversion Rate", dataType=FlyDataType.ID, entityType="D", printName="Import Conversion Rate", fieldLength=22)
	I_Conversion_Rate_ID,
	//
	@FlyElement(name="ID范围结束", description="是否ID范围用，结束", help="The ID Range allows to restrict the range of the internally used IDs. Please note that the ID range is NOT enforced.", dataType=FlyDataType.Number, entityType="D", printName="ID结束", fieldLength=22)
	IDRangeEnd,
	//
	@FlyElement(name="ID范围开始", description="ID范围的开始用", help="The ID Range allows to restrict the range of the internally used IDs. The standard rages are 0-899,999 for the Application Dictionary 900,000-999,999 for Application Dictionary customizations extensions and > 1,000,000 for client data. The standard system limit is 9,999,999,999 but can easily be extended.  The ID range is on a per table basis.	Please note that the ID range is NOT enforced.", dataType=FlyDataType.Number, entityType="D", printName="ID开始", fieldLength=22)
	IDRangeStart,
	//
	@FlyElement(name="导入帐户", description="导入帐户值", dataType=FlyDataType.ID, entityType="D", printName="导入帐户", fieldLength=22)
	I_ElementValue_ID,
	//
	@FlyElement(name="导入错误信息", description="Messages generated from import process", help="The Import Error Message displays any error messages generated during the import process.", dataType=FlyDataType.String, entityType="D", printName="导入错误信息", fieldLength=2000)
	I_ErrorMsg,
	//
	@FlyElement(name="FA Journal", dataType=FlyDataType.Integer, entityType="D", printName="FA Journal", fieldLength=22)
	I_FAJournal_ID,
	//
	@FlyElement(name="Imported Fixed Asset", dataType=FlyDataType.NONE, entityType="D", printName="Imported Fixed Asset", fieldLength=0)
	I_FixedAsset_ID,
	//
	@FlyElement(name="导入总帐分类帐", description="Import General Ledger Journal", dataType=FlyDataType.ID, entityType="D", printName="导入总帐分类帐", fieldLength=22)
	I_GLJournal_ID,
	//
	@FlyElement(name="IgnorePrevProduction", description="IgnorePrevProduction", help="IgnorePrevProduction", dataType=FlyDataType.YesNo, entityType="D", printName="IgnorePrevProduction", fieldLength=1)
	IgnorePrevProduction,
	//
	@FlyElement(name="Ship/Receipt Confirmation Import Line", description="Material Shipment or Receipt Confirmation Import Line", help="Import Confirmation Line Details", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm Import Line", fieldLength=22)
	I_InOutLineConfirm_ID,
	//
	@FlyElement(name="导入库存", description="导入库存交易", dataType=FlyDataType.ID, entityType="D", printName="导入库存", fieldLength=22)
	I_Inventory_ID,
	//
	@FlyElement(name="导入发票", description="导入发票", dataType=FlyDataType.ID, entityType="D", printName="导入发票", fieldLength=22)
	I_Invoice_ID,
	//
	@FlyElement(name="已导入", description="Has this import been processed", help="The Imported check box indicates if this import has been processed.", dataType=FlyDataType.YesNo, entityType="D", printName="已导入", fieldLength=1)
	I_IsImported,
	//
	@FlyElement(name="图像阿尔发 ", description="图像织法含有种种要素的阿尔发", help="Composite Alpha factor for taint color.", dataType=FlyDataType.Number, entityType="D", printName="图像阿尔发 ", fieldLength=22)
	ImageAlpha,
	//
	@FlyElement(name="图像附件", description="The image to be printed is attached to the record", help="The image to be printed is stored in the database as attachment to this record. The image can be a gif, jpeg or png.", dataType=FlyDataType.YesNo, entityType="D", printName="图像附件", fieldLength=1)
	ImageIsAttached,
	//
	@FlyElement(name="Image Link", dataType=FlyDataType.String, entityType="D", printName="Image Link", fieldLength=510)
	ImageLink,
	//
	@FlyElement(name="图像网址", description="图像的网址", help="URL of image; The image is not stored in the database, but retrieved at runtime. The image can be a gif, jpeg or png.", dataType=FlyDataType.URL, entityType="D", printName="图像网址", fieldLength=120)
	ImageURL,
	//
	@FlyElement(name="导入字段", description="Create Fields from Table Columns", dataType=FlyDataType.Button, entityType="D", printName="导入字段", fieldLength=1)
	ImportFields,
	//
	@FlyElement(name="导入表", description="Import Table Columns from Database", dataType=FlyDataType.Button, entityType="D", printName="导入表", fieldLength=1)
	ImportTable,
	//
	@FlyElement(name="Inactivity Alert Days", description="Send Alert when there is no activity after days (0= no alert)", help="An email alert is sent when the request shows no activity for the number of days defined.", dataType=FlyDataType.Integer, entityType="D", printName="Inactivity Alert Days", fieldLength=22)
	InactivityAlertDays,
	//
	@FlyElement(name="Included Role", dataType=FlyDataType.Table, entityType="D", printName="Included Role", fieldLength=10)
	Included_Role_ID,
	//
	@FlyElement(name="已包括定位键", description="Included Tab in this Tab (Master Dateail)", help="You can include a Tab in a Tab. If displayed in single row record, the included tab is displayed as multi-row table.", dataType=FlyDataType.Table, entityType="D", printName="已包括定位键", fieldLength=22)
	Included_Tab_ID,
	//
	@FlyElement(name="Include Disputed", description="Include disputed Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Include Disputed", fieldLength=0)
	IncludeInDispute,
	//
	@FlyElement(name="收入汇总帐户", description="收入汇总帐户 ", dataType=FlyDataType.Account, entityType="D", printName="收入汇总帐户", fieldLength=22)
	IncomeSummary_Acct,
	//
	@FlyElement(name="增量", description="The number to increment the last document number by", help="The Increment indicates the number to increment the last document number by to arrive at the next sequence number", dataType=FlyDataType.Integer, entityType="D", printName="增量", fieldLength=22)
	IncrementNo,
	//
	@FlyElement(name="Index Query", description="Text Search Query ", help="Text search query entered", dataType=FlyDataType.String, entityType="D", printName="Query", fieldLength=255)
	IndexQuery,
	//
	@FlyElement(name="Query Result", description="Result of the text query", dataType=FlyDataType.Integer, entityType="D", printName="Result", fieldLength=10)
	IndexQueryResult,
	//
	@FlyElement(name="行业信息", description="行业的信息 (如.专业服务, 家具分销, ..)", help="Description if the industry ad precise as possible.", dataType=FlyDataType.Text, entityType="D", printName="行业信息", fieldLength=255)
	IndustryInfo,
	//
	@FlyElement(name="信息", description="数据", help="The Information displays data from the source document line.", dataType=FlyDataType.Text, entityType="D", printName="信息", fieldLength=4000)
	Info,
	//
	@FlyElement(name="Info Factory Class", description="Fully qualified class name that implements the InfoFactory interface", help="Fully qualified class name that implements the InfoFactory interface. This can be use to provide custom Info class for column.", dataType=FlyDataType.String, entityType="D", printName="Info Factory Class", fieldLength=255)
	InfoFactoryClass,
	//
	@FlyElement(name="信息到", dataType=FlyDataType.String, entityType="D", printName="信息到", fieldLength=60)
	Info_To,
	//
	@FlyElement(name="Shipment/Receipt", description="MaterialShipment Document", help="The Material Shipment / Receipt ", dataType=FlyDataType.Search, entityType="D", printName="Shipment/Receipt", fieldLength=22)
	InOut_ID,
	//
	@FlyElement(name="Instructions", dataType=FlyDataType.Memo, entityType="D", printName="Instructions", fieldLength=1000)
	Instructions,
	//
	@FlyElement(name="公司间应收帐户", description="Intercompany Due From   Receivables Account", help="The Intercompany Due From account indicates the account that represents money owed to this organization from other organizations.", dataType=FlyDataType.Account, entityType="D", printName="公司间应收帐户", fieldLength=22)
	IntercompanyDueFrom_Acct,
	//
	@FlyElement(name="公司间应付帐户", description="Intercompany Due To   Payable Account", help="The Intercompany Due To Account indicates the account that represents money owed to other organizations.", dataType=FlyDataType.Account, entityType="D", printName="公司间应付帐户", fieldLength=22)
	IntercompanyDueTo_Acct,
	//
	@FlyElement(name="关心点金额", description="关心点金额", help="The Interest Amount indicates any interest charged or received on a Bank Statement.", dataType=FlyDataType.Amount, entityType="D", printName="关心点", fieldLength=22)
	InterestAmt,
	//
	@FlyElement(name="Interest Area", description="Name of the Interest Area", help="Name of the Interest Area of the user", dataType=FlyDataType.String, entityType="D", printName="Interest Area", fieldLength=40)
	InterestAreaName,
	//
	@FlyElement(name="关心点占百分比", description="Percentage interest to charge on overdue invoices", help="The Interest amount in percent indicates the interest to be charged on overdue invoices.  This field displays only if the charge interest checkbox has been selected.", dataType=FlyDataType.Number, entityType="D", printName="关心点占百分比", fieldLength=22)
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
	@FlyElement(name="已开票金额", description="已开票金额", help="已开票金额", dataType=FlyDataType.Amount, entityType="D", printName="已开票金额", fieldLength=22)
	InvoicedAmt,
	//
	@FlyElement(name="开票日", description="发票产生日", help="The Invoice Day indicates the day of invoice generation.  If twice monthly, the second time is 15 days after this day.", dataType=FlyDataType.Integer, entityType="D", printName="开票日", fieldLength=22)
	InvoiceDay,
	//
	@FlyElement(name="含交货发票日", description="包括交货的最后日期", help="The Invoice Day Cut Off indicates the last day for shipments to be included in the current invoice schedule.  For example, if the invoice schedule is defined for the first day of the month, the cut off day may be the 25th of the month.  An shipment on the 24th of May would be included in the invoices sent on June 1st but a shipment on the 26th would be included in the invoices sent on July 1st.", dataType=FlyDataType.Integer, entityType="D", printName="含交货发票日", fieldLength=22)
	InvoiceDayCutoff,
	//
	@FlyElement(name="发票文件号", description="Document Number of the Invoice", dataType=FlyDataType.String, entityType="D", printName="发票文件号", fieldLength=30)
	InvoiceDocumentNo,
	//
	@FlyElement(name="已开票数量", description="The Quantity Invoiced", dataType=FlyDataType.Quantity, entityType="D", printName="已开票数量", fieldLength=22)
	InvoicedQty,
	//
	@FlyElement(name="开发票频率", description="How often invoices will be generated", help="The Invoice Frequency indicates the frequency of invoice generation for a Business Partner.", dataType=FlyDataType.List, entityType="D", printName="开发票频率", fieldLength=1)
	InvoiceFrequency,
	//
	@FlyElement(name="发票邮件本文", description="Email text used for sending invoices", help="Standard email template used to send invoices as attachments.", dataType=FlyDataType.Table, entityType="D", printName="Invoice Mail Text", fieldLength=22)
	Invoice_MailText_ID,
	//
	@FlyElement(name="发票价格", description="Unit price to be invoiced or 0 for default price", help="Unit Price in the currency of the business partner!  If it is 0, the standard price of the sales price list of the business partner (customer) is used.", dataType=FlyDataType.CostsPrices, entityType="D", printName="发票价格", fieldLength=22)
	InvoicePrice,
	//
	@FlyElement(name="发票打印格式", description="Print Format for printing Invoices", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="发票打印格式", fieldLength=22)
	Invoice_PrintFormat_ID,
	//
	@FlyElement(name="发票规则", description="Frequency and method of invoicing ", help="The Invoice Rule defines how a Business Partner is invoiced and the frequency of invoicing.", dataType=FlyDataType.List, entityType="D", printName="发票规则", fieldLength=1)
	InvoiceRule,
	//
	@FlyElement(name="开发票星期日", description="发票产生日", help="The Invoice Week Day indicates the day of the week to generate invoices.", dataType=FlyDataType.List, entityType="D", printName="开发票星期日", fieldLength=1)
	InvoiceWeekDay,
	//
	@FlyElement(name="含交货发票星期几", description="包括交货的最后星期几", help="The Invoice Week Day Cutoff indicates the last day of the week a shipment must be made to be included in the invoice schedule.", dataType=FlyDataType.List, entityType="D", printName="周日近路", fieldLength=1)
	InvoiceWeekDayCutoff,
	//
	@FlyElement(name="导入定单", description="导入定单", dataType=FlyDataType.ID, entityType="D", printName="导入定单", fieldLength=22)
	I_Order_ID,
	//
	@FlyElement(name="IP Address", description="Defines the IP address to transfer data to", help="Contains info on the IP address to which we will transfer data", dataType=FlyDataType.String, entityType="D", printName="IP Address", fieldLength=20)
	IP_Address,
	//
	@FlyElement(name="导入付款", description="导入付款", dataType=FlyDataType.ID, entityType="D", printName="导入付款", fieldLength=22)
	I_Payment_ID,
	//
	@FlyElement(name="Import Price List", dataType=FlyDataType.ID, entityType="D", printName="Import Price List", fieldLength=22)
	I_PriceList_ID,
	//
	@FlyElement(name="导入产品", description="导入项目或维修", dataType=FlyDataType.ID, entityType="D", printName="导入产品", fieldLength=22)
	I_Product_ID,
	//
	@FlyElement(name="导入报表行集合", description="导入报表行集合", dataType=FlyDataType.ID, entityType="D", printName="导入报表行集合", fieldLength=22)
	I_ReportLine_ID,
	//
	@FlyElement(name="Abort Process", description="Aborts the current process", dataType=FlyDataType.NONE, entityType="D", printName="Abort Process", fieldLength=0)
	IsAbort,
	//
	@FlyElement(name="Access all Orgs", description="Access all Organizations (no org access control) of the client", help="When selected, the role has access to all organizations of the client automatically. This also increases performance where you have many organizations.", dataType=FlyDataType.YesNo, entityType="D", printName="Access all Orgs", fieldLength=1)
	IsAccessAllOrgs,
	//
	@FlyElement(name="责权发生制", description="Indicates if Accrual or Cash Based accounting will be used", help="The Accrual checkbox indicates if this accounting schema will use accrual based account or cash based accounting.  The Accrual method recognizes revenue when the product or service is delivered.  Cash based method recognizes income when then payment is received.", dataType=FlyDataType.YesNo, entityType="D", printName="责权发生制", fieldLength=1)
	IsAccrual,
	//
	@FlyElement(name="ACH", description="自动票据交换所", help="The ACH checkbox indicates if this Bank Account accepts ACH transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="ACH", fieldLength=1)
	IsACH,
	//
	@FlyElement(name="达成", description="目标被达成", help="The Achieved checkbox indicates if this goal has been achieved.", dataType=FlyDataType.YesNo, entityType="D", printName="达成", fieldLength=1)
	IsAchieved,
	//
	@FlyElement(name="有效", description="本记录有效", help="There are two methods of making records unavailable in the system: One is to delete the record, the other is to de-activate the record. A de-activated record is not available for selection, but available for reports.	There are two reasons for de-activating and not deleting records:	(1) The system requires the record for audit purposes.	(2) The record is referenced by other records. E.g., you cannot delete a Business Partner, if there are invoices for this partner record existing. You de-activate the Business Partner and prevent that this record is used for future entries.", dataType=FlyDataType.YesNo, entityType="D", printName="有效", fieldLength=1)
	IsActive,
	//
	@FlyElement(name="Activity Dimension", description="Include Activity as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Activity Dimension", fieldLength=1)
	IsActivityDim,
	//
	@FlyElement(name="反转本地地址行的顺序", description="Print Local Address in reverse Order", help="If NOT selected the local sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country.	If selected the local sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1.	The sequence of City/Region/Postal is determined by the local address format.	", dataType=FlyDataType.YesNo, entityType="D", printName="反转本地地址", fieldLength=1)
	IsAddressLinesLocalReverse,
	//
	@FlyElement(name="反转地址行的顺序", description="Print Address in reverse Order", help="If NOT selected the sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country.	If selected the sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1.	The sequence of City/Region/Postal is determined by the address format.", dataType=FlyDataType.YesNo, entityType="D", printName="反转地址", fieldLength=1)
	IsAddressLinesReverse,
	//
	@FlyElement(name="Special AD Flag", description="Do we need to specially mention this ad?", help="If we have a block in content where announce content and also sponsored links we should mention the sponsored ones", dataType=FlyDataType.YesNo, entityType="D", printName="Special AD Flag", fieldLength=1)
	IsAdFlag,
	//
	@FlyElement(name="特殊转变", description="Perform conversion for all amounts to currency", help="If a currency is selected, only this currency will be reported. If adhoc conversion is selected, all currencies are converted to the defined currency", dataType=FlyDataType.YesNo, entityType="D", printName="特殊转变", fieldLength=1)
	IsAdhocConversion,
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
	@FlyElement(name="Include All Currencies", description="Report not just foreign currency Invoices", dataType=FlyDataType.YesNo, entityType="D", printName="All Currencies", fieldLength=1)
	IsAllCurrencies,
	//
	@FlyElement(name="所有结点", description="包括所有结点（完全树）", dataType=FlyDataType.YesNo, entityType="D", printName="所有结点", fieldLength=1)
	IsAllNodes,
	//
	@FlyElement(name="已分派", description="Indicates if the payment has been allocated", help="The Allocated checkbox indicates if a payment has been allocated or associated with an invoice or invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="已分派", fieldLength=1)
	IsAllocated,
	//
	@FlyElement(name="Allow Copy", description="Defines whether the value of this field is considered in the copy of record", help="The default value is yes, it is recommended that values such as ID, document action, document status  should be defined as no.", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Copy", fieldLength=1)
	IsAllowCopy,
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
	@FlyElement(name="允许公开信息", description="You allow to publish the information, not just statistical summary info", dataType=FlyDataType.YesNo, entityType="D", printName="信息公开", fieldLength=1)
	IsAllowPublish,
	//
	@FlyElement(name="Allow RMA", description="Allow to consider RMA", help="When active, RMAs are considered", dataType=FlyDataType.YesNo, entityType="D", printName="Allow RMA", fieldLength=1)
	IsAllowRMA,
	//
	@FlyElement(name="允许统计", description="Allow to transfer general statistics (number of clients, orgs, business partners, users, products, invoices)", help="Allow to transfer general statistics (number of clients, orgs, business partners, users, products, invoices) to get a better feeling for the size of the application.  This information is not published.", dataType=FlyDataType.YesNo, entityType="D", printName="允许统计", fieldLength=1)
	IsAllowStatistics,
	//
	@FlyElement(name="Always Updateable", description="The column is always updateable, even if the record is not active or processed", help="If selected and if the winow / tab is not read only, you can always update the column.  This might be useful for comments, etc.", dataType=FlyDataType.YesNo, entityType="D", printName="Always Updateable", fieldLength=1)
	IsAlwaysUpdateable,
	//
	@FlyElement(name="金额限制", description="只在金额超过允许值时发出发票", help="The Amount Limit checkbox indicates if invoices will be sent out if they are below the entered limit.   	", dataType=FlyDataType.YesNo, entityType="D", printName="金额限制", fieldLength=1)
	IsAmount,
	//
	@FlyElement(name="Apply Script", dataType=FlyDataType.YesNo, entityType="D", printName="Apply Script", fieldLength=1)
	isApply,
	//
	@FlyElement(name="已批准", description="指示该文档是否需要批准", help="The Approved checkbox indicates if this document requires approval before it can be processed.", dataType=FlyDataType.YesNo, entityType="D", printName="已批准", fieldLength=1)
	IsApproved,
	//
	@FlyElement(name="激活稽核", description="激活稽核跟踪已产生什么数子", help="The Activate Audit checkbox indicates if an audit trail of numbers generated will be kept.", dataType=FlyDataType.YesNo, entityType="D", printName="激活稽核", fieldLength=1)
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
	@FlyElement(name="自增长数", description="Automatically assign the next number", help="The Auto Numbering checkbox indicates if the system will assign the next number automatically.", dataType=FlyDataType.YesNo, entityType="D", printName="自增长数", fieldLength=1)
	IsAutoSequence,
	//
	@FlyElement(name="可用库存", description="资源是可用", help="Resource is available for assignments", dataType=FlyDataType.YesNo, entityType="D", printName="可用库存", fieldLength=1)
	IsAvailable,
	//
	@FlyElement(name="计算 Mean (μ)", description="Calculate Average of numeric content or length", help="Calculate the average of the data if the field is numeric, otherwise calculate the average length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="平均", fieldLength=1)
	IsAveraged,
	//
	@FlyElement(name="Backup value null", description="The backup value is null.", dataType=FlyDataType.NONE, entityType="D", printName="Backup value null", fieldLength=0)
	IsBackupNull,
	//
	@FlyElement(name="已平衡", dataType=FlyDataType.YesNo, entityType="D", printName="已平衡", fieldLength=1)
	IsBalanced,
	//
	@FlyElement(name="待平衡", description="All transactions within an element value must balance (e.g. cost centers)", help="The Balancing checkbox indicates the this element must balance in each journal transaction.  For example, if cost centers have been defined as an element which is balance then the debits and credits for each unique cost center must net to 0.00.  This is commonly used to define parts of an organization which report as their own entity.  Balancing is not an option for the Account element.", dataType=FlyDataType.YesNo, entityType="D", printName="待平衡", fieldLength=1)
	IsBalancing,
	//
	@FlyElement(name="银行帐户", description="Indicates if this is the Bank Account", help="The Bank Account checkbox indicates if this is account is the bank account.", dataType=FlyDataType.YesNo, entityType="D", printName="银行帐户", fieldLength=1)
	IsBankAccount,
	//
	@FlyElement(name="基本语言", description="The system information is maintained in this language", dataType=FlyDataType.YesNo, entityType="D", printName="基本语言", fieldLength=1)
	IsBaseLanguage,
	//
	@FlyElement(name="Before Approval", description="The Check is before the (manual) approval", help="If selected, the Budget Approval is before manual approvals - i.e. is only approved if budget is available.  This may cause that the use of the budget is delayed (after the approval)", dataType=FlyDataType.YesNo, entityType="D", printName="Before Approval", fieldLength=1)
	IsBeforeApproval,
	//
	@FlyElement(name="Beta 功能", description="This functionality is considered Beta", help="Beta functionality is not fully tested or completed.", dataType=FlyDataType.YesNo, entityType="D", printName="Beta 功能", fieldLength=1)
	IsBetaFunctionality,
	//
	@FlyElement(name="Bill of Materials", description="Bill of Materials", help="The Bill of Materials check box indicates if this product consists of a bill of materials.", dataType=FlyDataType.YesNo, entityType="D", printName="BOM", fieldLength=1)
	IsBillOfMaterial,
	//
	@FlyElement(name="帐单接收地址", description="Indicates that this address is the Bill to Address", help="The Bill to Address checkbox indicates if this location is the Bill to Address for this Business Partner", dataType=FlyDataType.YesNo, entityType="D", printName="帐单接收地址", fieldLength=1)
	IsBillTo,
	//
	@FlyElement(name="物料清单", description="物料清单", help="The Bill of Materials check box indicates if this product consists of a bill of materials.", dataType=FlyDataType.YesNo, entityType="D", printName="BOM", fieldLength=1)
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
	@FlyElement(name="集中维护", description="Information maintained in System Element table", help="The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table  or 'Window' table.", dataType=FlyDataType.YesNo, entityType="D", printName="集中维护", fieldLength=1)
	IsCentrallyMaintained,
	//
	@FlyElement(name="维护变化日志", description="维护变化的一个日志", help="If selected, a log of all changes is maintained.", dataType=FlyDataType.YesNo, entityType="D", printName="变化日志", fieldLength=1)
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
	@FlyElement(name="Collective Asset", description="Asset Quantity is Collective", help="Asset Quantity is Collective", dataType=FlyDataType.NONE, entityType="D", printName="Collective Asset", fieldLength=0)
	IsCollectiveAsset,
	//
	@FlyElement(name="债务极限", description="The commitment amount quantity is the chargeable ceiling ", help="The commitment amount and quantity is the maximum amount and quantity to be charged.  Ignored, if the amount or quantity is zero.", dataType=FlyDataType.YesNo, entityType="D", printName="委托天花板", fieldLength=1)
	IsCommitCeiling,
	//
	@FlyElement(name="债务", description="Is this document a (legal) commitment?", help="Commitment indicates if the document is legally binding.", dataType=FlyDataType.YesNo, entityType="D", printName="债务", fieldLength=1)
	IsCommitment,
	//
	@FlyElement(name="完成", description="已完成", help="Indication that this is complete", dataType=FlyDataType.YesNo, entityType="D", printName="完成", fieldLength=1)
	IsComplete,
	//
	@FlyElement(name="Confidential Info", description="Can enter confidential information", help="When entering/updating Requests over the web, the user can mark his info as confidential", dataType=FlyDataType.YesNo, entityType="D", printName="Confidential Info", fieldLength=1)
	IsConfidentialInfo,
	//
	@FlyElement(name="确认", description="任务是被证实的", help="Resource assignment is confirmed", dataType=FlyDataType.YesNo, entityType="D", printName="确认", fieldLength=1)
	IsConfirmed,
	//
	@FlyElement(name="Cost Immediately", description="Update Costs immediately for testing", help="If selected, costs are updated immediately when a Cost Detail record is created (by matching or shipping).  Otherwise the costs are updated by batch or when the costs are needed for posting. You should select this only if you are testing,", dataType=FlyDataType.YesNo, entityType="D", printName="Cost Immediate", fieldLength=1)
	IsCostImmediate,
	//
	@FlyElement(name="Calculate Count", description="Count number of not empty elements", help="Calculate the total number of not empty (NULL) elements (maximum is the number of lines).", dataType=FlyDataType.YesNo, entityType="D", printName="计数", fieldLength=1)
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
	@FlyElement(name="记录产生", dataType=FlyDataType.List, entityType="D", printName="记录产生", fieldLength=1)
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
	@FlyElement(name="Create Reversal", description="Indicates that reversal movement will be created, if disabled the original movement will be deleted.", dataType=FlyDataType.YesNo, entityType="D", printName="Create Reversal", fieldLength=1)
	IsCreateReversal,
	//
	@FlyElement(name="Create Single Order", description="For all shipments create one Order", dataType=FlyDataType.YesNo, entityType="D", printName="Create Single Order", fieldLength=1)
	IsCreateSingleOrder,
	//
	@FlyElement(name="信用核准", description="信用被核准", help="Credit Approved indicates if the credit approval was successful for Orders", dataType=FlyDataType.YesNo, entityType="D", printName="信用核准", fieldLength=1)
	IsCreditApproved,
	//
	@FlyElement(name="当前供应商", description="Use this Vendor for pricing and stock replenishment", help="The Current Vendor indicates if prices are used and Product is reordered from this vendor", dataType=FlyDataType.YesNo, entityType="D", printName="当前供应商", fieldLength=1)
	IsCurrentVendor,
	//
	@FlyElement(name="客户", description="Indicates if this Business Partner is a Customer", help="The Customer checkbox indicates if this Business Partner is a customer.  If it is select additional fields will display which further define this customer.", dataType=FlyDataType.YesNo, entityType="D", printName="客户", fieldLength=1)
	IsCustomer,
	//
	@FlyElement(name="Customization", description="The change is a customization of the data dictionary and can be applied after Migration", help="The migration 'resets' the system to the current/original setting.  If selected you can save the customization and re-apply it.  Please note that you need to check, if your customization has no negative side effect in the new release.", dataType=FlyDataType.YesNo, entityType="D", printName="Customization", fieldLength=1)
	IsCustomization,
	//
	@FlyElement(name="日跟踪", description="Resource has day slot availability", help="Resource is only available on certain days", dataType=FlyDataType.YesNo, entityType="D", printName="日跟踪", fieldLength=1)
	IsDateSlot,
	//
	@FlyElement(name="Decimal Point", description="The number notation has a decimal point (no decimal comma)", help="If selected, Numbers are printed with a decimal point '.' - otherwise with a decimal comma ','.  The thousand separator is the opposite.	If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.YesNo, entityType="D", printName="Decimal Point", fieldLength=1)
	IsDecimalPoint,
	//
	@FlyElement(name="缺省值", description="缺省值", help="The Default Checkbox indicates if this record will be used as a default value.", dataType=FlyDataType.YesNo, entityType="D", printName="缺省值", fieldLength=1)
	IsDefault,
	//
	@FlyElement(name="Default Counter Document", description="The document type is the default counter document type", help="When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction.  Example: when generating a Sales Order, use this Sales Order document type.	This default can be overwritten by defining explicit counter document relationships.", dataType=FlyDataType.YesNo, entityType="D", printName="Default Counter Doc", fieldLength=1)
	IsDefaultCounterDoc,
	//
	@FlyElement(name="延迟了抓取", description="物料出货后费用", help="Delayed Capture is required, if you ship products.  The first credit card transaction is the Authorization, the second is the actual transaction after the shipment of the product.", dataType=FlyDataType.YesNo, entityType="D", printName="延迟了抓取", fieldLength=1)
	IsDelayedCapture,
	//
	@FlyElement(name="可删除的记录", description="Indicates if records can be deleted from the database", help="The Records Deleteable checkbox indicates if a record can be deleted from the database.  If records cannot be deleted, you can only deselect the Active flag", dataType=FlyDataType.YesNo, entityType="D", printName="可删除的记录", fieldLength=1)
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
	@FlyElement(name="已配送", dataType=FlyDataType.YesNo, entityType="D", printName="已配送", fieldLength=1)
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
	@FlyElement(name="折旧", description="资产将会被折旧", help="The asset is used internally and will be depreciated", dataType=FlyDataType.YesNo, entityType="D", printName="折旧", fieldLength=1)
	IsDepreciated,
	//
	@FlyElement(name="Descending", description="Sort your data using a SQL Desc Order By statement", dataType=FlyDataType.NONE, entityType="D", printName="Descending", fieldLength=0)
	IsDesc,
	//
	@FlyElement(name="Description Only", description="if true, the line is just description and no transaction", help="If a line is Description Only, e.g. Product Inventory is not corrected. No accounting transactions are created and the amount or totals are not included in the document.  This for including descriptional detail lines, e.g. for an Work Order.", dataType=FlyDataType.YesNo, entityType="D", printName="Description", fieldLength=1)
	IsDescription,
	//
	@FlyElement(name="Calculate Deviation (σ)", description="Calculate Standard Deviation", help="The Standard Deviation (σ) is the a measure of dispersion - used in combination with the Mean (μ)", dataType=FlyDataType.YesNo, entityType="D", printName="Deviation", fieldLength=1)
	IsDeviationCalc,
	//
	@FlyElement(name="Directed", description="Tells whether one 'sees' the other end of the relation from each end or just from the source", dataType=FlyDataType.YesNo, entityType="D", printName="Directed", fieldLength=1)
	IsDirected,
	//
	@FlyElement(name="直接打印", description="没有对话框的打印", help="The Direct Print checkbox indicates that this report will print without a print dialog box being displayed.", dataType=FlyDataType.YesNo, entityType="D", printName="直接打印", fieldLength=1)
	IsDirectPrint,
	//
	@FlyElement(name="IsDiscountAllowedOnTotal", dataType=FlyDataType.YesNo, entityType="D", printName="IsDiscountAllowedOnTotal", fieldLength=1)
	IsDiscountAllowedOnTotal,
	//
	@FlyElement(name="根据折扣费用更正税", description="Correct the tax for payment discount and charges", help="Payment discounts may require to correct the tax.  This primarily applicable in VAT systems.  If the original invoice had tax records, the payment discount, write-off, etc. is corrected by the tax. The calculation of the tax is prorated based on the invoice.", dataType=FlyDataType.YesNo, entityType="D", printName="根据折扣费用更正税", fieldLength=1)
	IsDiscountCorrectsTax,
	//
	@FlyElement(name="从明细金额计算折扣", description="Payment Discount calculation does not include Taxes and Charges", help="If the payment discount is calculated from line amounts only, the tax and charge amounts are not included. This is e.g. business practice in the US.  If not selected the total invoice amount is used to calculate the payment discount.", dataType=FlyDataType.YesNo, entityType="D", printName="从明细金额计算折扣", fieldLength=1)
	IsDiscountLineAmt,
	//
	@FlyElement(name="打印折扣", description="Print Discount on Invoice and Order", help="The Discount Printed Checkbox indicates if the discount will be printed on the document.", dataType=FlyDataType.YesNo, entityType="D", printName="打印折扣", fieldLength=1)
	IsDiscountPrinted,
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
	@FlyElement(name="Display Legend", description="Display chart legend", help="Toggles the display of the chart legend", dataType=FlyDataType.YesNo, entityType="D", printName="Display Legend", fieldLength=1)
	IsDisplayLegend,
	//
	@FlyElement(name="处理", description="资产被处理", help="The asset is no longer used and disposed", dataType=FlyDataType.YesNo, entityType="D", printName="处理", fieldLength=1)
	IsDisposed,
	//
	@FlyElement(name="ISDN", description="ISDN或拨号", help="The ISDN identifies a ISDN or Modem line number.", dataType=FlyDataType.String, entityType="D", printName="ISDN", fieldLength=40)
	ISDN,
	//
	@FlyElement(name="文档受控", description="Control account - If an account is controlled by a document, you cannot post manually to it", dataType=FlyDataType.YesNo, entityType="D", printName="文档受控", fieldLength=1)
	IsDocControlled,
	//
	@FlyElement(name="文件号受控", description="The document has a document sequence", help="The Document Number Controlled checkbox indicates if this document type will have a sequence number.", dataType=FlyDataType.YesNo, entityType="D", printName="文件号受控", fieldLength=1)
	IsDocNoControlled,
	//
	@FlyElement(name="Is Document", description="This flag determinate if the record is a document", help="This flag is used to mark those tables that behave like documents and allow create automatically columns like: C_DocType_ID, DocumentNo, DateDoc, DocAction, DocStatus, Processed, IsApproved, Description", dataType=FlyDataType.YesNo, entityType="D", printName="Is Document", fieldLength=1)
	IsDocument,
	//
	@FlyElement(name="文档计算", description="根据文档计算税,而不是根据明细计算", help="If the tax is calculated on document level, all lines with that tax rate are added before calculating the total tax for the document.	Otherwise the tax is calculated per line and then added.	Due to rounding, the tax amount can differ.", dataType=FlyDataType.YesNo, entityType="D", printName="文件水平", fieldLength=1)
	IsDocumentLevel,
	//
	@FlyElement(name="Drop Shipment", description="Drop Shipments are sent from the Vendor directly to the Customer", help="Drop Shipments do not cause any Inventory reservations or movements as the Shipment is from the Vendor's inventory. The Shipment of the Vendor to the Customer must be confirmed.", dataType=FlyDataType.YesNo, entityType="D", printName="Drop Ship", fieldLength=1)
	IsDropShip,
	//
	@FlyElement(name="Due", description="Subscription Renewal is Due", dataType=FlyDataType.YesNo, entityType="D", printName="Due", fieldLength=1)
	IsDue,
	//
	@FlyElement(name="固定的应得东西日期", description="Payment is due on a fixed date", help="The Fixed Due Date checkbox indicates if invoices using this payment tern will be due on a fixed day of the month.  ", dataType=FlyDataType.YesNo, entityType="D", printName="固定的应得东西日期", fieldLength=1)
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
	@FlyElement(name="雇员", description="表明此业务伙伴为一个雇员", help="The Employee checkbox indicates if this Business Partner is an Employee.  If it is selected, additional fields will display which further identify this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="雇员", fieldLength=1)
	IsEmployee,
	//
	@FlyElement(name="欧元区成员", description="此货币为欧洲货币联盟的成员", help="The Emu Member checkbox is used to indicate if this currency is a member of the European Economic Union.", dataType=FlyDataType.YesNo, entityType="D", printName="欧元区成员", fieldLength=1)
	IsEMUMember,
	//
	@FlyElement(name="Enable POS Product Lookup", description="Allows product lookup in order to show search key , name , quantity available , standard price and list price for selecting a product", dataType=FlyDataType.YesNo, entityType="D", printName="Enable POS Product Lookup", fieldLength=1)
	IsEnableProductLookup,
	//
	@FlyElement(name="加密的", description="Display is encrypted by '*' - Independent from data storage encryption", help="Display encryption - all characters are displayed as '*'. Data storage encryption (i.e. you will not be able to report the data via report tools) is set in the Column definition.", dataType=FlyDataType.Button, entityType="D", printName="加密的", fieldLength=1)
	IsEncrypted,
	//
	@FlyElement(name="End Product", description="End Product of production", dataType=FlyDataType.YesNo, entityType="D", printName="End Product", fieldLength=1)
	IsEndProduct,
	//
	@FlyElement(name="Error", description="An Error occured in the execution", dataType=FlyDataType.YesNo, entityType="D", printName="Error", fieldLength=1)
	IsError,
	//
	@FlyElement(name="扩大", description="This request has been escalated", help="The Escalated checkbox indicates that this request has been escalated or raised in importance.", dataType=FlyDataType.YesNo, entityType="D", printName="扩大", fieldLength=1)
	IsEscalated,
	//
	@FlyElement(name="欧元币种", description="币种是欧元", help="The Euro Currency checkbox is used to indicate if this currency is the Euro Currency.", dataType=FlyDataType.YesNo, entityType="D", printName="欧元币种", fieldLength=1)
	IsEuro,
	//
	@FlyElement(name="IsEventRequired", dataType=FlyDataType.NONE, entityType="D", printName="IsEventRequired", fieldLength=0)
	IsEventRequired,
	//
	@FlyElement(name="排除", description="Exclude Access to the Data", help="If selected, the role cannot access the data specified.  If not selected, the role can ONLY access the data specified", dataType=FlyDataType.YesNo, entityType="D", printName="排除", fieldLength=1)
	IsExclude,
	//
	@FlyElement(name="Exclude Auto Delivery", description="Exclude from automatic Delivery", help="The product is excluded from generating Shipments.  This allows manual creation of shipments for high demand items. If selected, you need to create the shipment manually.	But, the item is always included, when the delivery rule of the Order is Force (e.g. for POS). 	This allows finer granularity of the Delivery Rule Manual.", dataType=FlyDataType.YesNo, entityType="D", printName="Exclude Delivery", fieldLength=1)
	IsExcludeAutoDelivery,
	//
	@FlyElement(name="Is Exclude Kanban", description="Exclude the Kanban execution", dataType=FlyDataType.YesNo, entityType="D", printName="Is Exclude Kanban", fieldLength=1)
	IsExcludeKanban,
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
	@FlyElement(name="仅显示字段", description="不显示标签", help="The Field Only checkbox indicates that the column will display without a label.", dataType=FlyDataType.YesNo, entityType="D", printName="仅显示字段", fieldLength=1)
	IsFieldOnly,
	//
	@FlyElement(name="Fill Shape", description="Fill the shape with the color selected", dataType=FlyDataType.YesNo, entityType="D", printName="Fill Shape", fieldLength=1)
	IsFilledRectangle,
	//
	@FlyElement(name="Final Close", description="Entries with Final Close cannot be re-opened", dataType=FlyDataType.YesNo, entityType="D", printName="Final Close", fieldLength=1)
	IsFinalClose,
	//
	@FlyElement(name="仅用名字", description="Print only the first name in greetings", help="The First Name Only checkbox indicates that only the first name of this contact should print in greetings.", dataType=FlyDataType.YesNo, entityType="D", printName="仅用名字", fieldLength=1)
	IsFirstNameOnly,
	//
	@FlyElement(name="Is a Fixed Asset", description="Indicates whether this group will be a Fixed Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Is a Fixed Asset ?", fieldLength=1)
	IsFixedAsset,
	//
	@FlyElement(name="Is Fixed Asset Invoice", description="Indicates if an Invoice is for a Fixed Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Is Fixed Asset Invoice", fieldLength=1)
	IsFixedAssetInvoice,
	//
	@FlyElement(name="固定的宽度", description="列有固定的宽度", help="The Column has a fixed width, independent from the content", dataType=FlyDataType.YesNo, entityType="D", printName="固定的宽度", fieldLength=1)
	IsFixedWidth,
	//
	@FlyElement(name="For all distribution", description="This reward is for all distribution", dataType=FlyDataType.YesNo, entityType="D", printName="For all distribution", fieldLength=1)
	IsForAllDistribution,
	//
	@FlyElement(name="Force", description="Force Operation", dataType=FlyDataType.YesNo, entityType="D", printName="Force", fieldLength=1)
	IsForce,
	//
	@FlyElement(name="Foreign Currency Account", description="Balances in foreign currency accounts are held in the nominated currency", help="Balances in foreign currency accounts are held in the nominated currency and translated to functional currency", dataType=FlyDataType.YesNo, entityType="D", printName="外国的币种", fieldLength=1)
	IsForeignCurrency,
	//
	@FlyElement(name="表单", description="If Selected, a Form is printed, if not selected a columnar List report", help="A form has individual elements with layout information (example: invoice, check)	<br>	A columnar list report has individual columns (example: list of invoices)", dataType=FlyDataType.YesNo, entityType="D", printName="表单", fieldLength=1)
	IsForm,
	//
	@FlyElement(name="Full BP Access", description="The user/contact has full access to Business Partner information and resources", help="If selected, the user has full access to the Business Partner (BP) information (Business Documents like Orders, Invoices - Requests) or resources (Assets, Downloads). If you deselect it, the user has no access rights unless, you explicitly grant it in tab 'BP Access'", dataType=FlyDataType.YesNo, entityType="D", printName="Full BP Access", fieldLength=1)
	IsFullBPAccess,
	//
	@FlyElement(name="完全折旧", description="The asset is fully depreciated", help="The asset costs are fully amortized.", dataType=FlyDataType.YesNo, entityType="D", printName="完全折旧", fieldLength=1)
	IsFullyDepreciated,
	//
	@FlyElement(name="完全合格", description="This account is fully qualified", help="The Fully Qualified check box indicates that all required elements for an account combination are present.", dataType=FlyDataType.YesNo, entityType="D", printName="完全合格", fieldLength=1)
	IsFullyQualified,
	//
	@FlyElement(name="生成的", description="这行被生成的", help="The Generated checkbox identifies a journal line that was generated from a source document.  Lines could also be entered manually or imported.", dataType=FlyDataType.YesNo, entityType="D", printName="生成的", fieldLength=1)
	IsGenerated,
	//
	@FlyElement(name="Generated Draft", dataType=FlyDataType.YesNo, entityType="D", printName="Generated Draft", fieldLength=1)
	IsGeneratedDraft,
	//
	@FlyElement(name="GL Budget Dimension", description="Include GL Budget as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="GL Budget Dimension", fieldLength=1)
	IsGLBudgetDim,
	//
	@FlyElement(name="分组", description="After a group change, totals, etc. are printed", help="Grouping allows to print sub-totals. If a group changes, the totals are printed.  Group by columns need to be included in the sort order.", dataType=FlyDataType.YesNo, entityType="D", printName="Groupby", fieldLength=1)
	IsGroupBy,
	//
	@FlyElement(name="SQL组函数", description="此函数将产生一个Group By子句", help="The SQL Group Function checkbox indicates that this function will generate a Group by Clause in the resulting SQL.", dataType=FlyDataType.YesNo, entityType="D", printName="SQL组函数", fieldLength=1)
	IsGroupFunction,
	//
	@FlyElement(name="保证日期", description="Product has Guarantee or Expiry Date", help="For individual products, you can define a guarantee or expiry date", dataType=FlyDataType.YesNo, entityType="D", printName="保证日期", fieldLength=1)
	IsGuaranteeDate,
	//
	@FlyElement(name="Mandatory Guarantee Date", description="The entry of a Guarantee Date is mandatory when creating a Product Instance", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Guarantee Date", fieldLength=1)
	IsGuaranteeDateMandatory,
	//
	@FlyElement(name="仅显示标题", description="Field without Column - Only label is displayed", help="The Heading Only checkbox indicates if just the label will display on the screen", dataType=FlyDataType.YesNo, entityType="D", printName="仅显示标题", fieldLength=1)
	IsHeading,
	//
	@FlyElement(name="仅一行", description="If selected, only one line is printed", help="If the column has a width restriction, the text is broken into multiple lines. If One Line is selected, only the first line is printed.", dataType=FlyDataType.YesNo, entityType="D", printName="仅一行", fieldLength=1)
	IsHeightOneLine,
	//
	@FlyElement(name="大量数据", description="Use Search instead of Pick list", help="那 High Volume Checkbox indicates if a search screen will display as opposed to a pick list for selecting records from this table.", dataType=FlyDataType.YesNo, entityType="D", printName="大量数据", fieldLength=1)
	IsHighVolume,
	//
	@FlyElement(name="HTML", description="本文有 HTML 标签", dataType=FlyDataType.YesNo, entityType="D", printName="HTML", fieldLength=1)
	IsHtml,
	//
	@FlyElement(name="标识符", description="本列是记录标识符的一部分", help="The Identifier checkbox indicates that this column is part of the identifier or key for this table.  ", dataType=FlyDataType.YesNo, entityType="D", printName="标识符", fieldLength=1)
	IsIdentifier,
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
	@FlyElement(name="发送信息", description="Send informational messages and copies", dataType=FlyDataType.YesNo, entityType="D", printName="发送信息", fieldLength=1)
	IsInfoSent,
	//
	@FlyElement(name="会计页签", description="This tab contain accounting information", help="The Accounting Tab checkbox indicates if this window contains accounting information.", dataType=FlyDataType.YesNo, entityType="D", printName="会计页签", fieldLength=1)
	IsInfoTab,
	//
	@FlyElement(name="在所有物中", description="The asset is in the possession of the organization", help="Assets which are not in possession are e.g. at Customer site and may or may not be owned by the company.", dataType=FlyDataType.YesNo, entityType="D", printName="在所有物中", fieldLength=1)
	IsInPosession,
	//
	@FlyElement(name="生产系统", description="系统是生产系统", dataType=FlyDataType.YesNo, entityType="D", printName="生产系统", fieldLength=1)
	IsInProduction,
	//
	@FlyElement(name="Insert Record", description="The user can insert a new Record", help="If not selected, the user cannot create a new Record.  This is automatically disabled, if the Tab is Read Only.", dataType=FlyDataType.YesNo, entityType="D", printName="Insert Record", fieldLength=1)
	IsInsertRecord,
	//
	@FlyElement(name="实例属性", description="The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date)", help="If selected, the individual instance of the product has this attribute - like the individual Serial or Lot Numbers or  Guarantee Date of a product instance.  If not selected, all instances of the product share the attribute (e.g. color=green).", dataType=FlyDataType.YesNo, entityType="D", printName="实例属性", fieldLength=1)
	IsInstanceAttribute,
	//
	@FlyElement(name="Internal", description="Internal Organization", dataType=FlyDataType.YesNo, entityType="D", printName="Internal", fieldLength=1)
	IsInternal,
	//
	@FlyElement(name="In Transit", description="Movement is in transit", help="Material Movement is in transit - shipped, but not received", dataType=FlyDataType.YesNo, entityType="D", printName="In Transit", fieldLength=1)
	IsInTransit,
	//
	@FlyElement(name="Invited Vendors Only", description="Only invited vendors can respond to an RfQ", help="The Request for Quotation is only visible to the invited vendors", dataType=FlyDataType.YesNo, entityType="D", printName="Invited Vendors", fieldLength=1)
	IsInvitedVendorsOnly,
	//
	@FlyElement(name="已开票", description="已开票", help="标示是否已开发票", dataType=FlyDataType.YesNo, entityType="D", printName="已开票", fieldLength=1)
	IsInvoiced,
	//
	@FlyElement(name="发票打印发票明细", description="Print detail BOM elements on the invoice", help="The Print Details on Invoice indicates that the BOM element products will print on the Invoice as opposed to this product.", dataType=FlyDataType.YesNo, entityType="D", printName="打印发票明细", fieldLength=1)
	IsInvoicePrintDetails,
	//
	@FlyElement(name="Just Migrated", description="Value set by Migration for post-Migation tasks.", dataType=FlyDataType.YesNo, entityType="D", printName="Just Migrated", fieldLength=1)
	IsJustMigrated,
	//
	@FlyElement(name="Kanban controlled", description="This part is Kanban controlled", dataType=FlyDataType.YesNo, entityType="D", printName="Kanban controlled", fieldLength=1)
	IsKanban,
	//
	@FlyElement(name="关键列", description="This column is the key in this table", help="The key column must also be display sequence 0 in the field definition and may be hidden.", dataType=FlyDataType.YesNo, entityType="D", printName="关键列", fieldLength=1)
	IsKey,
	//
	@FlyElement(name="水平", description="水平方向", dataType=FlyDataType.YesNo, entityType="D", printName="水平", fieldLength=1)
	IsLandscape,
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
	@FlyElement(name="批", description="The product instances have a Lot Number", help="For individual products, you can define Lot Numbers", dataType=FlyDataType.YesNo, entityType="D", printName="批", fieldLength=1)
	IsLot,
	//
	@FlyElement(name="Mandatory Lot", description="The entry of Lot info is mandatory when creating a Product Instance", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Lot", fieldLength=1)
	IsLotMandatory,
	//
	@FlyElement(name="强制性的", description="Data entry is required in this column", help="The Mandatory checkbox indicates if the field is required for a record to be save to the database.", dataType=FlyDataType.YesNo, entityType="D", printName="强制性的", fieldLength=1)
	IsMandatory,
	//
	@FlyElement(name="Mandatory Promotion Line", description="Order must have this promotion line", help="The mandatory promotion check box indicates that the order must have this promotion line", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Promotion Line", fieldLength=1)
	IsMandatoryPL,
	//
	@FlyElement(name="强制性的扣留", description="钱一定是扣留", help="The Mandatory Withholding checkbox indicates that monies must be withheld from this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="强制性的扣留", fieldLength=1)
	IsMandatoryWithholding,
	//
	@FlyElement(name="手工", description="这是手工的程序", help="The Manual check box indicates if the process will done manually.", dataType=FlyDataType.YesNo, entityType="D", printName="手工", fieldLength=1)
	IsManual,
	//
	@FlyElement(name="Manufactured", description="This product is manufactured", dataType=FlyDataType.YesNo, entityType="D", printName="Manufactured", fieldLength=1)
	IsManufactured,
	//
	@FlyElement(name="Is Manufacturer", description="Indicate role of this Business partner as Manufacturer", dataType=FlyDataType.YesNo, entityType="D", printName="Is Manufacturer", fieldLength=1)
	IsManufacturer,
	//
	@FlyElement(name="Calculate Maximim (↑)", description="Calculate the maximim amount", help="Calculate the Maximum (↑)  of the data if the field is numeric, otherwise maximum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Calc Max", fieldLength=1)
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
	@FlyElement(name="Calculate Minimum (↓)", description="Calculate the minimum amount", help="Calculate the Minimum (↓) of the data if the field is numeric, otherwise minimum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Calc Min", fieldLength=1)
	IsMinCalc,
	//
	@FlyElement(name="Modified", description="The record is modified", help="Indication that the record is modified", dataType=FlyDataType.YesNo, entityType="D", printName="Modified", fieldLength=1)
	IsModified,
	//
	@FlyElement(name="Modify Price", description="Allow modifying the price", help="Allow modifying the price for products with a non zero price", dataType=FlyDataType.YesNo, entityType="D", printName="Modify Price", fieldLength=1)
	IsModifyPrice,
	//
	@FlyElement(name="Multi Line Header", description="Print column headers on mutliple lines if necessary.", help="If selected, column header text will wrap onto the next line -- otherwise the text will be truncated.", dataType=FlyDataType.YesNo, entityType="D", printName="Multi Line Header", fieldLength=1)
	IsMultiLineHeader,
	//
	@FlyElement(name="多语言文件", description="多语言文件", help="If selected, you enable multi lingual documents and need to maintain translations for entities used in documents (examples: Products, Payment Terms, ...).<br>	Please note, that the base language is always English.", dataType=FlyDataType.YesNo, entityType="D", printName="多语言文件", fieldLength=1)
	IsMultiLingualDocument,
	//
	@FlyElement(name="Multi Row Only", description="This applies to Multi-Row view only", dataType=FlyDataType.YesNo, entityType="D", printName="Multi Row Only", fieldLength=1)
	IsMultiRowOnly,
	//
	@FlyElement(name="普通帐户", description="主要的普通帐户", help="The natural account is often based on (industry specific) chart of accounts", dataType=FlyDataType.YesNo, entityType="D", printName="普通帐户", fieldLength=1)
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
	@FlyElement(name="下一个业务日", description="Payment due on the next business day", help="The Next Business Day checkbox indicates that payment is due on the next business day after invoice or delivery.", dataType=FlyDataType.YesNo, entityType="D", printName="下一个业务日", fieldLength=1)
	IsNextBusinessDay,
	//
	@FlyElement(name="下一行", description="Print item on next line", help="If not selected, the item is printed on the same line", dataType=FlyDataType.YesNo, entityType="D", printName="下一行", fieldLength=1)
	IsNextLine,
	//
	@FlyElement(name="下一页", description="The column is printed on the next page", help="Before printing this column, there will be a page break.", dataType=FlyDataType.YesNo, entityType="D", printName="下一页", fieldLength=1)
	IsNextPage,
	//
	@FlyElement(name="ISO货币编码", description="币种的 ISO 4217 编码", help="For details - http:  www.unece.org trade rec rec09en.htm", dataType=FlyDataType.String, entityType="D", printName="ISO货币编码", fieldLength=3)
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
	@FlyElement(name="一次性交易", dataType=FlyDataType.YesNo, entityType="D", printName="一次性交易", fieldLength=1)
	IsOneTime,
	//
	@FlyElement(name="在线访问", description="在线能被存取 ", help="The Online Access check box indicates if the application can be accessed via the web. ", dataType=FlyDataType.YesNo, entityType="D", printName="在线访问", fieldLength=1)
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
	@FlyElement(name="多于或少于付款", description="Over-Payment (unallocated) or Under-Payment (partial payment)", help="Overpayments (negative) are unallocated amounts and allow you to receive money for more than the particular invoice. 	Underpayments (positive) is a partial payment for the invoice. You do not write off the unpaid amount.", dataType=FlyDataType.YesNo, entityType="D", printName="多于或少于付款", fieldLength=1)
	IsOverUnderPayment,
	//
	@FlyElement(name="Overwrite Date on Complete", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Date on Complete", fieldLength=1)
	IsOverwriteDateOnComplete,
	//
	@FlyElement(name="Overwrite Sequence on Complete", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Sequence on Complete", fieldLength=1)
	IsOverwriteSeqOnComplete,
	//
	@FlyElement(name="所有者的银行", description="Bank for this Organization", help="The Own Bank field indicates if this bank is for this Organization as opposed to a Bank for a Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="所有者的银行", fieldLength=1)
	IsOwnBank,
	//
	@FlyElement(name="拥有", description="The asset is owned by the organization", help="The asset may not be in possession, but the asset is legally owned by the organization", dataType=FlyDataType.YesNo, entityType="D", printName="拥有", fieldLength=1)
	IsOwned,
	//
	@FlyElement(name="新的页", description="有新的页开始", help="Before printing this item, create a new page", dataType=FlyDataType.YesNo, entityType="D", printName="新的页", fieldLength=1)
	IsPageBreak,
	//
	@FlyElement(name="支付", description="文件被支付", dataType=FlyDataType.YesNo, entityType="D", printName="支付", fieldLength=1)
	IsPaid,
	//
	@FlyElement(name="向第三方支付", description="Amount paid to someone other than the Business Partner", help="The Paid to Third Party checkbox indicates that the amounts are paid to someone other than the Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="向第三方支付", fieldLength=1)
	IsPaidTo3Party,
	//
	@FlyElement(name="绘图边界线", description="绘图表边界线", help="在表的周围绘图线", dataType=FlyDataType.YesNo, entityType="D", printName="绘图边界线", fieldLength=1)
	IsPaintBoundaryLines,
	//
	@FlyElement(name="Paint Header Lines", description="Paint Lines over/under the Header Line ", help="If selected, a line is painted above and below the header line using the stroke information", dataType=FlyDataType.YesNo, entityType="D", printName="Header Lines", fieldLength=1)
	IsPaintHeaderLines,
	//
	@FlyElement(name="绘图 H 线", description="Paint horizontal lines", help="绘图水平线表", dataType=FlyDataType.YesNo, entityType="D", printName="绘图 H 线", fieldLength=1)
	IsPaintHLines,
	//
	@FlyElement(name="绘图 V 线", description="垂直的线绘图", help="绘图垂直的表", dataType=FlyDataType.YesNo, entityType="D", printName="绘图 V 线", fieldLength=1)
	IsPaintVLines,
	//
	@FlyElement(name="父表连接列", description="This column is a link to the parent table (e.g. header from lines) - incl. Association key columns", help="The Parent checkbox indicates if this column is a link to the parent table.", dataType=FlyDataType.YesNo, entityType="D", printName="父表连接列", fieldLength=1)
	IsParent,
	//
	@FlyElement(name="Transfer passive", description="FTP passive transfer", help="Should the transfer be run in passive mode?", dataType=FlyDataType.YesNo, entityType="D", printName="Transfer passive", fieldLength=1)
	IsPassive,
	//
	@FlyElement(name="支付来自地址", description="Business Partner pays from that address and we'll send dunning letters there", help="The Pay From Address checkbox indicates if this location is the address the Business Partner pays from and where dunning letters will be sent.", dataType=FlyDataType.YesNo, entityType="D", printName="支付来自地址", fieldLength=1)
	IsPayFrom,
	//
	@FlyElement(name="Pay Schedule valid", description="Is the Payment Schedule is valid", help="Payment Schedules allow to have multiple due dates.", dataType=FlyDataType.YesNo, entityType="D", printName="Pay Schedule valid", fieldLength=1)
	IsPayScheduleValid,
	//
	@FlyElement(name="百分比扣留", description="Withholding amount is a percentage of the invoice amount", help="The Percent Withholding checkbox indicates if the withholding amount is a percentage of the invoice amount.", dataType=FlyDataType.YesNo, entityType="D", printName="百分比扣留", fieldLength=1)
	IsPercentWithholding,
	//
	@FlyElement(name="个人数据访问权", description="Allow access to all personal records", help="Users of this role have access to all records locked as personal.", dataType=FlyDataType.YesNo, entityType="D", printName="个人数据访问权", fieldLength=1)
	IsPersonalAccess,
	//
	@FlyElement(name="个人数据加锁", description="Allow users with role to lock access to personal records", help="If enabled, the user with the role can prevent access of others to personal records.  If a record is locked, only the user or people who can read personal locked records can see the record.", dataType=FlyDataType.YesNo, entityType="D", printName="Personal Lock", fieldLength=1)
	IsPersonalLock,
	//
	@FlyElement(name="Phantom", description="Phantom Component", help="Phantom Component are not stored and produced with the product. This is an option to avild maintaining an Engineering and Manufacturing Bill of Materials.", dataType=FlyDataType.YesNo, entityType="D", printName="Phantom", fieldLength=1)
	IsPhantom,
	//
	@FlyElement(name="提货列表打印明细", description="Print detail BOM elements on the pick list", help="The Print Details on Pick List indicates that the BOM element products will print on the Pick List as opposed to this product.", dataType=FlyDataType.YesNo, entityType="D", printName="提货列表打印明细", fieldLength=1)
	IsPickListPrintDetails,
	//
	@FlyElement(name="Pick/QA Confirmation", description="Require Pick or QA Confirmation before processing", help="The processing of the Shipment (Receipt) requires Pick (QA) Confirmation", dataType=FlyDataType.YesNo, entityType="D", printName="Pick/QA Confirm", fieldLength=1)
	IsPickQAConfirm,
	//
	@FlyElement(name="只有正数", description="Do not generate negative commissions", help="The Positive Only check box indicates that if the result of the subtraction is negative, it is ignored.  This would mean that negative commissions would not be generated.", dataType=FlyDataType.YesNo, entityType="D", printName="只有正数", fieldLength=1)
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
	@FlyElement(name="主", description="主预算", help="The Primary checkbox indicates if this budget is the primary budget.", dataType=FlyDataType.YesNo, entityType="D", printName="主", fieldLength=1)
	IsPrimary,
	//
	@FlyElement(name="Print Barcode Text", description="Print barcode text beneath symbol", dataType=FlyDataType.NONE, entityType="D", printName="Print Barcode Text", fieldLength=0)
	IsPrintBarcodeText,
	//
	@FlyElement(name="已打印", description="Indicates if this document is printed", help="The Printed checkbox indicates if this document will be printed.", dataType=FlyDataType.YesNo, entityType="D", printName="已打印", fieldLength=1)
	IsPrinted,
	//
	@FlyElement(name="打印功能符号", description="Print Symbols for Functions (Sum, Average, Count)", help="If selected, print symbols - otherwise print names of the function", dataType=FlyDataType.YesNo, entityType="D", printName="打印功能符号", fieldLength=1)
	IsPrintFunctionSymbols,
	//
	@FlyElement(name="Print Parameters", description="Print query parameters on list report", help="If selected, query parameters will be printed at the start of the report.", dataType=FlyDataType.YesNo, entityType="D", printName="Print Parameters", fieldLength=1)
	IsPrintParameters,
	//
	@FlyElement(name="正在处理", dataType=FlyDataType.YesNo, entityType="D", printName="正在处理", fieldLength=1)
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
	@FlyElement(name="有效视图 Active Prospect/Customer", description="Indicates a Prospect as opposed to an active Customer", help="The Prospect checkbox indicates an entity that is an active prospect but is not yet a customer.", dataType=FlyDataType.YesNo, entityType="D", printName="有效视图 Active Prospect/Customer", fieldLength=1)
	IsProspect,
	//
	@FlyElement(name="公众", description="公众可读条目", help="If selected, public users can read view the entry. Public are users without a Role in the system. Use security rules for more specic access control.", dataType=FlyDataType.YesNo, entityType="D", printName="公众", fieldLength=1)
	IsPublic,
	//
	@FlyElement(name="公众可写", description="公众可写条目", help="If selected, public users can write create entries. Public are users without a Role in the system. Use security rules for more specic access control.", dataType=FlyDataType.YesNo, entityType="D", printName="公众可写", fieldLength=1)
	IsPublicWrite,
	//
	@FlyElement(name="Published", description="The Topic is published and can be viewed", help="If not selected, the Topic is not visible to the general public.", dataType=FlyDataType.YesNo, entityType="D", printName="Published", fieldLength=1)
	IsPublished,
	//
	@FlyElement(name="采购", description="Organization purchases this product", help="The Purchased check box indicates if this product is purchased by this organization.", dataType=FlyDataType.YesNo, entityType="D", printName="采购", fieldLength=1)
	IsPurchased,
	//
	@FlyElement(name="Purchase Quantity", description="This quantity is used in the Purchase Order to the Supplier", help="When multiple quantities are used in an Request for Quotation, the selected Quantity is used for generating the purchase order.  If none selected the lowest number is used.", dataType=FlyDataType.YesNo, entityType="D", printName="Purchase Qty", fieldLength=1)
	IsPurchaseQty,
	//
	@FlyElement(name="QC Pass", dataType=FlyDataType.YesNo, entityType="D", printName="QC Pass", fieldLength=1)
	IsQCPass,
	//
	@FlyElement(name="数量基于", description="Trade discount break level based on Quantity (not value)", help="The calculation of the trade discount level is based on the quantity of the order and not the value amount of the order", dataType=FlyDataType.YesNo, entityType="D", printName="数量基于", fieldLength=1)
	IsQuantityBased,
	//
	@FlyElement(name="Query Criteria", description="The column is also used as a query criteria", help="The column is used to enter queries - the SQL cannot be an expression", dataType=FlyDataType.YesNo, entityType="D", printName="Query Criteria", fieldLength=1)
	IsQueryCriteria,
	//
	@FlyElement(name="Quote All Quantities", description="Suppliers are requested to provide responses for all quantities", help="If selected, the response to the Request for Quotation needs to have a price for all Quantities", dataType=FlyDataType.YesNo, entityType="D", printName="Quote All Qty", fieldLength=1)
	IsQuoteAllQty,
	//
	@FlyElement(name="Quote Total Amt", description="The respnse can have just the total amount for the RfQ", help="If not selected, the resonse must be provided per line", dataType=FlyDataType.YesNo, entityType="D", printName="Quote Total Amt", fieldLength=1)
	IsQuoteTotalAmt,
	//
	@FlyElement(name="范围", description="The parameter is a range of values", help="The Range checkbox indicates that this parameter is a range of values.", dataType=FlyDataType.YesNo, entityType="D", printName="范围", fieldLength=1)
	IsRange,
	//
	@FlyElement(name="只读", description="字段被只有读", help="The Read Only indicates that this field may only be Read.  It may not be updated.", dataType=FlyDataType.YesNo, entityType="D", printName="只读", fieldLength=1)
	IsReadOnly,
	//
	@FlyElement(name="读写", description="Field is read   write", help="The Read Write indicates that this field may be read and updated.", dataType=FlyDataType.YesNo, entityType="D", printName="读写", fieldLength=1)
	IsReadWrite,
	//
	@FlyElement(name="Recalculate", description="Allow recalculation", help="When active, a recalculation is allowed", dataType=FlyDataType.YesNo, entityType="D", printName="Recalculate", fieldLength=1)
	IsReCalculate,
	//
	@FlyElement(name="收货", description="This is a sales transaction (receipt)", dataType=FlyDataType.YesNo, entityType="D", printName="收货", fieldLength=1)
	IsReceipt,
	//
	@FlyElement(name="已对帐", dataType=FlyDataType.YesNo, entityType="D", printName="已对帐", fieldLength=1)
	IsReconciled,
	//
	@FlyElement(name="已注册", description="此应用系统已注册。", dataType=FlyDataType.YesNo, entityType="D", printName="已注册", fieldLength=1)
	IsRegistered,
	//
	@FlyElement(name="相对位置", description="The item is relative positioned (not absolute)", help="The relative positioning of the item is determined by X-Z space and next line", dataType=FlyDataType.YesNo, entityType="D", printName="相对位置", fieldLength=1)
	IsRelativePosition,
	//
	@FlyElement(name="免除-到地址", description="付款地址", help="The Remit to Address checkbox indicates if this location is the address to which we should send payments to this Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="免除-到地址", fieldLength=1)
	IsRemitTo,
	//
	@FlyElement(name="已复制", description="The data is successfully replicated", help="The data replication was successful.", dataType=FlyDataType.YesNo, entityType="D", printName="已复制", fieldLength=1)
	IsReplicated,
	//
	@FlyElement(name="报表", description="指示一笔报表记录", help="The Report checkbox indicates that this record is a report as opposed to a process", dataType=FlyDataType.YesNo, entityType="D", printName="报表", fieldLength=1)
	IsReport,
	//
	@FlyElement(name="Reproducible", description="Problem can re reproduced in Gardenworld", help="The problem occurs also in the standard distribution in the demo client Gardenworld.", dataType=FlyDataType.List, entityType="D", printName="Reproducible", fieldLength=1)
	IsReproducible,
	//
	@FlyElement(name="Re-Validate", description="Re-Validate entries", dataType=FlyDataType.NONE, entityType="D", printName="Re-Validate", fieldLength=0)
	IsReValidate,
	//
	@FlyElement(name="撤销(红冲)", description="撤销(红冲)交易", help="The Reversal check box indicates if this is a reversal of a prior transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="撤销(红冲)", fieldLength=1)
	IsReversal,
	//
	@FlyElement(name="RfQ Quantity", description="The quantity is used when generating RfQ Responses", help="When generating the RfQ Responses, this quantity is included", dataType=FlyDataType.YesNo, entityType="D", printName="RfQ Quantity", fieldLength=1)
	IsRfQQty,
	//
	@FlyElement(name="Responses Accepted", description="Are Resonses to the Request for Quotation accepted", help="If selected, responses for the RfQ are accepted", dataType=FlyDataType.YesNo, entityType="D", printName="Responses Accepted", fieldLength=1)
	IsRfQResponseAccepted,
	//
	@FlyElement(name="隧道经由 HTTP", description="Connect to Server via HTTP Tunnel", help="If selected, the connection to the server is via a HTTP tunnel, otherwise it uses an RMI JNP connection", dataType=FlyDataType.YesNo, entityType="D", printName="隧道经由 HTTP", fieldLength=1)
	IsRMIoverHTTP,
	//
	@FlyElement(name="Running Total", description="Create a running total (sum)", help="A running total creates a sum at the end of a page and on the top of the next page for all colums, which have a Sum function.  You should define running total only once per format.", dataType=FlyDataType.YesNo, entityType="D", printName="Running Total", fieldLength=1)
	IsRunningTotal,
	//
	@FlyElement(name="Sales Lead", description="This contact is a sales lead", help="Sales leads can be converted into full contacts with Business Partners.", dataType=FlyDataType.NONE, entityType="D", printName="Sales Lead", fieldLength=0)
	IsSalesLead,
	//
	@FlyElement(name="Sales Region Dimension", description="Include Sales Region as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Region Dimension", fieldLength=1)
	IsSalesRegionDim,
	//
	@FlyElement(name="销售代表", description="Indicates if  the employee is a sales representative or company agent", help="The Sales Rep checkbox indicates if this employee is also a sales representative.", dataType=FlyDataType.YesNo, entityType="D", printName="销售代表", fieldLength=1)
	IsSalesRep,
	//
	@FlyElement(name="Sales Tax", description="This is a sales tax (i.e. not a value added tax)", help="If selected AP tax is handled as expense, otherwise it is handled as a VAT credit.", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Tax", fieldLength=1)
	IsSalesTax,
	//
	@FlyElement(name="相同的币种", dataType=FlyDataType.YesNo, entityType="D", printName="相同的币种", fieldLength=1)
	IsSameCurrency,
	//
	@FlyElement(name="Same distribution for source and target", description="Use the same distribution for source and target", help="Use the same distribution for source and target. Source distribution is for the entitlement of the reward, target distribution is the distribution to get the product to apply the reward to", dataType=FlyDataType.YesNo, entityType="D", printName="Same distribution for source and target", fieldLength=1)
	IsSameDistribution,
	//
	@FlyElement(name="相同的行", description="Displayed on same line as previous field", help="The Same Line checkbox indicates that the field will display on the same line as the previous field.", dataType=FlyDataType.YesNo, entityType="D", printName="相同的行", fieldLength=1)
	IsSameLine,
	//
	@FlyElement(name="相同的税", description="Use the same tax as the main transaction", help="The Same Tax checkbox indicates that this charge should use the same tax as the main transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="相同的税", fieldLength=1)
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
	@FlyElement(name="启动安全性", description="If security is enabled, user access to data can be restricted via Roles", help="The Security Enabled checkbox indicates that user access to the data in this table can be restricted using Roles.", dataType=FlyDataType.YesNo, entityType="D", printName="启动安全性", fieldLength=1)
	IsSecurityEnabled,
	//
	@FlyElement(name="选择", dataType=FlyDataType.YesNo, entityType="D", printName="选择", fieldLength=1)
	IsSelected,
	//
	@FlyElement(name="Selected Winner", description="The resonse is the selected winner", help="The resonse is the selected winner. If selected on Response level, the line selections are ignored.", dataType=FlyDataType.YesNo, entityType="D", printName="Selected Winner", fieldLength=1)
	IsSelectedWinner,
	//
	@FlyElement(name="选择列", description="Is this column used for finding rows in windows", help="If selected, the column is listed in the first find window tab and in the selection part of the window", dataType=FlyDataType.YesNo, entityType="D", printName="选择", fieldLength=1)
	IsSelectionColumn,
	//
	@FlyElement(name="自助式服务", description="This is a Self-Service entry or this entry can be changed via Self-Service", help="Self-Service allows users to enter data or update their data.  The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality.", dataType=FlyDataType.YesNo, entityType="D", printName="自助式服务", fieldLength=1)
	IsSelfService,
	//
	@FlyElement(name="Send RfQ Invitation to Vendors", description="Send the RfQ Invitation to the Vendors", dataType=FlyDataType.NONE, entityType="D", printName="Send RfQ to Vendor", fieldLength=0)
	IsSendRfQ,
	//
	@FlyElement(name="序列号", description="The product instances have Serial Numbers", help="For individual products, you can define Serial Numbers", dataType=FlyDataType.YesNo, entityType="D", printName="序列号", fieldLength=1)
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
	@FlyElement(name="设定 NL 位置", description="设定新的线位置", help="When enabled, the current x (horizontal) Position before printing the item is saved. The next New Line will use the saved x (horizontal) Position, enabling to print data in columns.	The setting is not restricted to an area (header, content, footer), allowing to align information also with Header and Footer with the Content.", dataType=FlyDataType.YesNo, entityType="D", printName="设定 NL 位置", fieldLength=1)
	IsSetNLPosition,
	//
	@FlyElement(name="Set Payment Term", description="Set the payment term of the Business Partner", help="If a dunning letter of this level is created, the payment term of this business partner is overwritten.", dataType=FlyDataType.YesNo, entityType="D", printName="Set Payment Term", fieldLength=1)
	IsSetPaymentTerm,
	//
	@FlyElement(name="Ship/Receipt Confirmation", description="Require Ship or Receipt Confirmation before processing", help="The processing of the Shipment (Receipt) requires Ship (Receipt) Confirmation", dataType=FlyDataType.YesNo, entityType="D", printName="Ship/Receipt Confirm", fieldLength=1)
	IsShipConfirm,
	//
	@FlyElement(name="发运地址", description="Business Partner address to ship goods to", help="The Ship to Address checkbox indicates if this location is the address to use when shipping orders to this Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="发运地址", fieldLength=1)
	IsShipTo,
	//
	@FlyElement(name="显示财务", description="Users with this role can see accounting information", help="This allows to prevent access to any accounting information.", dataType=FlyDataType.YesNo, entityType="D", printName="显示财务", fieldLength=1)
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
	@FlyElement(name="模拟", description="Performing the function is only simulated", dataType=FlyDataType.NONE, entityType="D", printName="模拟", fieldLength=0)
	IsSimulation,
	//
	@FlyElement(name="只有单一任务", description="Only one assignment at a time (no double-booking or overlapping)", help="If selected, you can only have one assignment for the resource at a single point in time.   It is also  not possible to have overlapping assignments.", dataType=FlyDataType.YesNo, entityType="D", printName="单一任务", fieldLength=1)
	IsSingleAssignment,
	//
	@FlyElement(name="单记录排列", description="Default for toggle between Single- and Multi-Row (Grid) Layout", help="The Single Row Layout checkbox indicates if the default display type for this window is a single row as opposed to multi row.", dataType=FlyDataType.YesNo, entityType="D", printName="单记录排列", fieldLength=1)
	IsSingleRow,
	//
	@FlyElement(name="SMTP验证", description="Your mail server requires Authentification", help="Some email servers require authentification before sending emails.  If yes, users are required to define their email user name and password.  If authentification is required and no user name and password is required, delivery will fail.", dataType=FlyDataType.YesNo, entityType="D", printName="SMTP验证", fieldLength=1)
	IsSmtpAuthorization,
	//
	@FlyElement(name="销售", description="Organization sells this product", help="The Sold check box indicates if this product is sold by this organization.", dataType=FlyDataType.YesNo, entityType="D", printName="销售", fieldLength=1)
	IsSold,
	//
	@FlyElement(name="销售价目表", description="这是销售价目表", help="The Sales Price List check box indicates if this price list is used for sales transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="销售价目表", fieldLength=1)
	IsSOPriceList,
	//
	@FlyElement(name="定单页签", description="页签定单", dataType=FlyDataType.YesNo, entityType="D", printName="定单页签", fieldLength=1)
	IsSortTab,
	//
	@FlyElement(name="销售交易", description="这是销售交易", help="The Sales Transaction checkbox indicates if this item is a Sales Transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="销售交易", fieldLength=1)
	IsSOTrx,
	//
	@FlyElement(name="Split when Difference", description="Split document when there is a difference", help="If the confirmation contains differences, the original document is split allowing the original document (shipment) to be processed and updating Inventory - and the newly created document for handling the dispute at a later time. Until the confirmation is processed, the inventory is not updated. ", dataType=FlyDataType.YesNo, entityType="D", printName="Split Difference", fieldLength=1)
	IsSplitWhenDifference,
	//
	@FlyElement(name="Standard Header Footer", description="The standard Header and Footer is used", help="If the standard header is not used, it must be explicitly defined.", dataType=FlyDataType.YesNo, entityType="D", printName="Standard Header Footer", fieldLength=1)
	IsStandardHeaderFooter,
	//
	@FlyElement(name="Is Statement", description="Dunning Level is a definition of a statement", dataType=FlyDataType.YesNo, entityType="D", printName="Is Statement", fieldLength=1)
	IsStatement,
	//
	@FlyElement(name="Std User Workflow", description="Standard Manual User Approval Workflow", help="If selected, only documents with an open status (drafted, in progress, approved, rejected, invalid) and standard user actions (prepare, complete, approve, reject) are allowed to continue.  Use this to prevent having to define details on how automatic processes (unlock, invalidate, post, re-activate) and when the document is closed for normal user action (completed, waiting, closed, voided, reversed).", dataType=FlyDataType.YesNo, entityType="D", printName="Std User Workflow", fieldLength=1)
	IsStdUserWorkflow,
	//
	@FlyElement(name="存储", description="Organization stocks this product", help="The Stocked check box indicates if this product is stocked by this Organization.", dataType=FlyDataType.YesNo, entityType="D", printName="存储", fieldLength=1)
	IsStocked,
	//
	@FlyElement(name="Stocktake", help="Enable stocktake enhancements, including facility to record first and second counts.", dataType=FlyDataType.NONE, entityType="D", printName="Stocktake", fieldLength=0)
	IsStocktake,
	//
	@FlyElement(name="Sub Acct Dimension", description="Include Sub Acct as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Sub Acct Dimension", fieldLength=1)
	IsSubAcctDim,
	//
	@FlyElement(name="Issue Description", description="Description of the Issue line", dataType=FlyDataType.String, entityType="D", printName="Issue Description", fieldLength=255)
	IssueDescription,
	//
	@FlyElement(name="Issue Line", description="Line number of the issue", dataType=FlyDataType.Integer, entityType="D", printName="Issue Line", fieldLength=22)
	IssueLine,
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
	@FlyElement(name="计算总数", description="Calculate the total sum of numeric content or length", help="Calculate the total sum of the data if the field is numeric, otherwise total sum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="总数", fieldLength=1)
	IsSummarized,
	//
	@FlyElement(name="汇总级别", description="这是父类实体", help="A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.", dataType=FlyDataType.YesNo, entityType="D", printName="汇总级别", fieldLength=1)
	IsSummary,
	//
	@FlyElement(name="压缩空值", description="Suppress columns or elements with NULL value", help="If a Form entry is NULL and if selected, the field (including label) is not printed. <br>	If all elements in a table column are NULL and if selected, the column is not printed.", dataType=FlyDataType.YesNo, entityType="D", printName="压缩空值", fieldLength=1)
	IsSuppressNull,
	//
	@FlyElement(name="Suppress Repeats", description="Suppress repeated elements in column.", help="Determines whether repeated elements in a column are repeated in a printed table.", dataType=FlyDataType.YesNo, entityType="D", printName="Suppress Repeats", fieldLength=1)
	IsSuppressRepeats,
	//
	@FlyElement(name="同步数据库", description="Change database table definition when changing dictionary definition", help="When selected, the database column definition is updated based on your entries in the Column definition of the Application Dictionary.", dataType=FlyDataType.Button, entityType="D", printName="同步数据库", fieldLength=1)
	IsSyncDatabase,
	//
	@FlyElement(name="系统语言", description="The screens, etc. are maintained in this Language", help="Select, if you want to have translated screens available in this language.  Please notify your system administrator to run the language maintenance scripts to enable the use of this language.  If the language is not supplied, you can translate the terms yourself. ", dataType=FlyDataType.YesNo, entityType="D", printName="系统语言", fieldLength=1)
	IsSystemLanguage,
	//
	@FlyElement(name="基于表", description="表立基于了目录报表", help="Table based columnar list reporting is invoked from the Window Report button", dataType=FlyDataType.YesNo, entityType="D", printName="基于表", fieldLength=1)
	IsTableBased,
	//
	@FlyElement(name="用作记录的ID标识", description="The document number  will be used as the record key", help="The Used for Record ID checkbox indicates if the document id will be used as the key to the record", dataType=FlyDataType.YesNo, entityType="D", printName="用作记录的ID标识", fieldLength=1)
	IsTableID,
	//
	@FlyElement(name="免税业务伙伴", description="业务伙伴免税", help="If a business partner is exempt from tax, the exempt tax rate is used. For this, you need to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate.  This is required for tax reporting, so that you can track tax exempt transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="免税业务伙伴", fieldLength=1)
	IsTaxExempt,
	//
	@FlyElement(name="价格包括税", description="价格已包含税 ", help="The Tax Included checkbox indicates if the prices include tax.  This is also known as the gross price.", dataType=FlyDataType.YesNo, entityType="D", printName="价格包括税", fieldLength=1)
	IsTaxIncluded,
	//
	@FlyElement(name="比例分配税", description="税被比例分配", help="The Prorate Tax checkbox indicates if this tax is prorated.", dataType=FlyDataType.YesNo, entityType="D", printName="比例分配税", fieldLength=1)
	IsTaxProrated,
	//
	@FlyElement(name="税扣留", description="This is a tax related withholding", help="The Tax Withholding checkbox indicates if this withholding is tax related.", dataType=FlyDataType.YesNo, entityType="D", printName="税扣留", fieldLength=1)
	IsTaxWithholding,
	//
	@FlyElement(name="暂时的免税者", description="Temporarily do not withhold taxes", help="The Temporary Exempt checkbox indicates that for a limited time, taxes will not be withheld for this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="暂时的免税者", fieldLength=1)
	IsTemporaryExempt,
	//
	@FlyElement(name="测试", description="在测试模态中运行", dataType=FlyDataType.NONE, entityType="D", printName="测试", fieldLength=0)
	IsTest,
	//
	@FlyElement(name="基于时间", description="Time based Revenue Recognition rather than Service Level based", help="Revenue Recognition can be time or service level based.", dataType=FlyDataType.YesNo, entityType="D", printName="基于时间", fieldLength=1)
	IsTimeBased,
	//
	@FlyElement(name="时间报表", description="Line is a time report only (no expense)", help="The line contains only time information", dataType=FlyDataType.YesNo, entityType="D", printName="时间报表", fieldLength=1)
	IsTimeReport,
	//
	@FlyElement(name="Time Series", description="The domain data for the chart is organised by time.", help="A time series chart will automatically group and restrict the data by the time unit and scope specified.", dataType=FlyDataType.YesNo, entityType="D", printName="Time Series", fieldLength=1)
	IsTimeSeries,
	//
	@FlyElement(name="时间段", description="Resource has time slot availability", help="Resource is only available at certain times", dataType=FlyDataType.YesNo, entityType="D", printName="时间段", fieldLength=1)
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
	@FlyElement(name="过帐批发折扣", description="Generate postings for trade discounts", help="If the invoice is based on an item with a list price, the amount based on the list price and the discount is posted instead of the net amount.		Example: Quantity 10 - List Price: 20 - Actual Price: 17	If selected for a sales invoice 200 is posted to Product Revenue and 30 to Discount Granted - rather than 170 to Product Revenue.	The same applies to vendor invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="批发折扣", fieldLength=1)
	IsTradeDiscountPosted,
	//
	@FlyElement(name="已转移", description="Transferred to General Ledger (i.e. accounted)", help="The transferred checkbox indicates if the transactions associated with this document should be transferred to the General Ledger.", dataType=FlyDataType.YesNo, entityType="D", printName="已转移", fieldLength=1)
	IsTransferred,
	//
	@FlyElement(name="已翻译", description="列被翻译", help="The Translated checkbox indicates if this column is translated.", dataType=FlyDataType.YesNo, entityType="D", printName="已翻译", fieldLength=1)
	IsTranslated,
	//
	@FlyElement(name="翻译页签", description="This tab contains translation information", help="The Translation Tab checkbox indicate if a tab contains translation information.", dataType=FlyDataType.YesNo, entityType="D", printName="翻译页签", fieldLength=1)
	IsTranslationTab,
	//
	@FlyElement(name="Orders with unconfirmed Shipments", description="Generate shipments for Orders with open delivery confirmations?", help="You can also include orders who have outstanding confirmations (e.g. ordered=10 - not confirmed shipments=4 - would create a new shipment of 6 if available).", dataType=FlyDataType.NONE, entityType="D", printName="Orders with unconfirmed Shipments", fieldLength=0)
	IsUnconfirmedInOut,
	//
	@FlyElement(name="可更新的", description="Determines, if the field can be updated", help="The Updateable checkbox indicates if a field can be updated by the user.", dataType=FlyDataType.YesNo, entityType="D", printName="可更新的", fieldLength=1)
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
	@FlyElement(name="使用Beta功能", description="Enable the use of Beta Functionality", help="The exact scope of Beta Functionality is listed in the release note.  It is usually not recommended to enable Beta functionality in production environments.", dataType=FlyDataType.YesNo, entityType="D", printName="使用Beta", fieldLength=1)
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
	@FlyElement(name="用户可更新的", description="The field can be updated by the user", help="The User Updateable checkbox indicate if the user can update  this field.", dataType=FlyDataType.YesNo, entityType="D", printName="用户可更新的", fieldLength=1)
	IsUserUpdateable,
	//
	@FlyElement(name="Use User Org Access", description="Use Org Access defined by user instead of Role Org Access", help="You can define the access to Organization either by Role or by User.  You would select this, if you have many organizations.", dataType=FlyDataType.YesNo, entityType="D", printName="Use User Org Access", fieldLength=1)
	IsUseUserOrgAccess,
	//
	@FlyElement(name="有效的", description="元素有效", help="The element passed the validation check", dataType=FlyDataType.YesNo, entityType="D", printName="有效的", fieldLength=1)
	IsValid,
	//
	@FlyElement(name="Only Validate Data", description="Validate the date and do not process", dataType=FlyDataType.NONE, entityType="D", printName="Validate Only", fieldLength=0)
	IsValidateOnly,
	//
	@FlyElement(name="显示值", description="Displays Value column with the Display column", help="The Display Value checkbox indicates if the value column will display with the display column.", dataType=FlyDataType.YesNo, entityType="D", printName="显示值", fieldLength=1)
	IsValueDisplayed,
	//
	@FlyElement(name="Vanilla System", description="The system was NOT compiled from Source - i.e. standard distribution", help="You may have customizations, like additional columns, tables, etc - but no code modifications which require compiling from source.", dataType=FlyDataType.List, entityType="D", printName="Vanilla System", fieldLength=1)
	IsVanillaSystem,
	//
	@FlyElement(name="Calculate Variance (σ²)", description="Calculate Variance", help="The Variance (σ²) is the a measure of dispersion - used in combination with the Mean (μ)", dataType=FlyDataType.YesNo, entityType="D", printName="Variance", fieldLength=1)
	IsVarianceCalc,
	//
	@FlyElement(name="供应商", description="Indicates if this Business Partner is a Vendor", help="The Vendor checkbox indicates if this Business Partner is a Vendor.  If it is selected, additional fields will display which further identify this vendor.", dataType=FlyDataType.YesNo, entityType="D", printName="供应商", fieldLength=1)
	IsVendor,
	//
	@FlyElement(name="验证", description="The BOM configuration has been verified", help="The Verified check box indicates if the configuration of this product has been verified.  This is used for products that consist of a bill of materials", dataType=FlyDataType.YesNo, entityType="D", printName="验证", fieldLength=1)
	IsVerified,
	//
	@FlyElement(name="视图", description="这是视图", help="This is a view rather than a table.  A view is always treated as read only in the system.", dataType=FlyDataType.YesNo, entityType="D", printName="视图", fieldLength=1)
	IsView,
	//
	@FlyElement(name="Web Can Update", description="Entry can be updated from the Web", dataType=FlyDataType.YesNo, entityType="D", printName="Web Can Update", fieldLength=1)
	IsWebCanUpdate,
	//
	@FlyElement(name="Featured in Web Store", description="If selected, the product is displayed in the inital or any empy search", help="In the display of products in the Web Store, the product is displayed in the inital view or if no search criteria are entered. To be displayed, the product must be in the price list used.", dataType=FlyDataType.YesNo, entityType="D", printName="Featured", fieldLength=1)
	IsWebStoreFeatured,
	//
	@FlyElement(name="Willing to commit", dataType=FlyDataType.YesNo, entityType="D", printName="Willing to commit", fieldLength=1)
	IsWillingToCommit,
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
	@FlyElement(name="Jasper Process", description="The Jasper Process used by the printengine if any process defined", dataType=FlyDataType.Table, entityType="D", printName="Jasper Process", fieldLength=22)
	JasperProcess_ID,
	//
	@FlyElement(name="Jasper Process Now", dataType=FlyDataType.Button, entityType="D", printName="Jasper Process Now", fieldLength=1)
	JasperProcessing,
	//
	@FlyElement(name="Jasper Report", dataType=FlyDataType.String, entityType="D", printName="Jasper Report", fieldLength=255)
	JasperReport,
	//
	@FlyElement(name="Java Info", description="Java Version Info", dataType=FlyDataType.String, entityType="D", printName="Java Info", fieldLength=255)
	JavaInfo,
	//
	@FlyElement(name="Journal Line Description", dataType=FlyDataType.NONE, entityType="D", printName="Journal Line Description", fieldLength=0)
	Jnl_Line_Description,
	//
	@FlyElement(name="Join元素", description="Semantics for multiple incoming Transitions", help="Semantics for multiple incoming Transitions for a Node/Activity. AND joins all concurrent threads - XOR requires one thread (no synchronization).", dataType=FlyDataType.List, entityType="D", printName="Join元素", fieldLength=1)
	JoinElement,
	//
	@FlyElement(name="Journal Document No", description="Document number of the Journal", dataType=FlyDataType.String, entityType="D", printName="Journal Doc No", fieldLength=30)
	JournalDocumentNo,
	//
	@FlyElement(name="jsp URL", description="Web URL of the jsp function", help="For the Web UI, define the URL to perform the function (usually a jsp). The URL also can be external to the system.", dataType=FlyDataType.URL, entityType="D", printName="jsp URL", fieldLength=120)
	JSPURL,
	//
	@FlyElement(name="知识种类", description="知识种类", help="Set up knowledge categories and values as a search aid. Examples are Release Version, Product Area, etc. Knowledge Category values act like keyworks.", dataType=FlyDataType.TableDirect, entityType="D", printName="种类", fieldLength=22)
	K_Category_ID,
	//
	@FlyElement(name="分类值", description="分类值", help="The value of the category is a keyword", dataType=FlyDataType.TableDirect, entityType="D", printName="值", fieldLength=22)
	K_CategoryValue_ID,
	//
	@FlyElement(name="条目意见", description="知识条目意见", help="Comment regarding a knowledge entry", dataType=FlyDataType.ID, entityType="D", printName="意见", fieldLength=22)
	K_Comment_ID,
	//
	@FlyElement(name="日志保存天数", description="Number of days to keep the log entries", help="Older Log entries may be deleted", dataType=FlyDataType.Integer, entityType="D", printName="日志保存天数", fieldLength=22)
	KeepLogDays,
	//
	@FlyElement(name="条目", description="知识条目", help="The searchable Knowledge Entry", dataType=FlyDataType.Search, entityType="D", printName="条目", fieldLength=22)
	K_Entry_ID,
	//
	@FlyElement(name="相关条目", description="相关条目的条目", help="Related Knowlege Entry for this Knowledge Entry", dataType=FlyDataType.Table, entityType="D", printName="相关条目", fieldLength=22)
	K_EntryRelated_ID,
	//
	@FlyElement(name="Key Column", description="Key Column for Table", dataType=FlyDataType.String, entityType="D", printName="Key Column", fieldLength=60)
	KeyColumn,
	//
	@FlyElement(name="关键字", description="情形对关键字没有感觉的", help="Case insensitive keyword for matching. If there are two words, both words must exist.", dataType=FlyDataType.String, entityType="D", printName="关键字", fieldLength=60)
	Keyword,
	//
	@FlyElement(name="关键字", description="List of Keywords - separated by space, comma or semicolon", help="List if individual keywords for search relevancy. The keywords are separated by space, comma or semicolon. ", dataType=FlyDataType.String, entityType="D", printName="关键字", fieldLength=255)
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
	@FlyElement(name="知识来源", description="知识条目的来源", help="The Source of a Knowlegde Entry is a pointer to the originating system. The Knowledge Entry has an additional entry (Description URL)  for more detailed info.", dataType=FlyDataType.ID, entityType="D", printName="知识来源", fieldLength=22)
	K_Source_ID,
	//
	@FlyElement(name="知识同义字", description="知识关键字同义字", help="Search Synonyms for Knowledge Keywords; Example: Product = Item", dataType=FlyDataType.ID, entityType="D", printName="知识同义字", fieldLength=22)
	K_Synonym_ID,
	//
	@FlyElement(name="知识主题", description="知识主题", help="主题或讨论线索", dataType=FlyDataType.ID, entityType="D", printName="主题", fieldLength=22)
	K_Topic_ID,
	//
	@FlyElement(name="知识类型", description="知识类型", help="Area of knowlege - A Type has multiple Topics", dataType=FlyDataType.ID, entityType="D", printName="类型", fieldLength=22)
	K_Type_ID,
	//
	@FlyElement(name="标签格式类型", description="标签格式类型", dataType=FlyDataType.List, entityType="D", printName="标签格式类型", fieldLength=1)
	LabelFormatType,
	//
	@FlyElement(name="标签高度", description="标签的高度", help="标签的实际高度", dataType=FlyDataType.Integer, entityType="D", printName="标签高度", fieldLength=22)
	LabelHeight,
	//
	@FlyElement(name="标签宽度", description="标签的宽度", help="标签的实际宽度", dataType=FlyDataType.Integer, entityType="D", printName="标签宽度", fieldLength=22)
	LabelWidth,
	//
	@FlyElement(name="Cost Distribution", description="Landed Cost Distribution", help="How landed costs are distributed to material receipts", dataType=FlyDataType.List, entityType="D", printName="Cost Distribution", fieldLength=1)
	LandedCostDistribution,
	//
	@FlyElement(name="ISO 语言编码", description="Lower-case two-letter ISO-3166 code - http:  www.ics.uci.edu pub ietf http related iso639.txt ", help="The ISO Language Code indicates the standard ISO code for a language in lower case.  Information can be found at http:  www.ics.uci.edu pub ietf http related iso639.txt ", dataType=FlyDataType.String, entityType="D", printName="ISO 语言编码", fieldLength=2)
	LanguageISO,
	//
	@FlyElement(name="Last Build Info", dataType=FlyDataType.String, entityType="D", printName="Last Build Info", fieldLength=255)
	LastBuildInfo,
	//
	@FlyElement(name="最近联系人", description="Date this individual was last contacted", help="The Last Contact indicates the date that this Business Partner Contact was last contacted.", dataType=FlyDataType.Date, entityType="D", printName="最近联系人", fieldLength=7)
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
	@FlyElement(name="Last Recalculated", description="The time last recalculated.", dataType=FlyDataType.DateTime, entityType="D", printName="Last Recalculated", fieldLength=7)
	LastRecalculated,
	//
	@FlyElement(name="最近结果", description="最后的联系人结果", help="The Last Result identifies the result of the last contact made.", dataType=FlyDataType.String, entityType="D", printName="最近结果", fieldLength=2000)
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
	@FlyElement(name="LDAP查询", description="Directory service query string", dataType=FlyDataType.String, entityType="D", printName="LDAP查询", fieldLength=255)
	LDAPDomain,
	//
	@FlyElement(name="LDAP主机", description="Name or IP of the LDAP Server", help="Name or IP Address of the LDAP directory service server", dataType=FlyDataType.String, entityType="D", printName="LDAP主机", fieldLength=60)
	LDAPHost,
	//
	@FlyElement(name="Ldap Port", description="The port the server is listening", help="The default LDAP port is 389", dataType=FlyDataType.Integer, entityType="D", printName="Ldap Port", fieldLength=10)
	LdapPort,
	//
	@FlyElement(name="LDAP Query", dataType=FlyDataType.String, entityType="D", printName="LDAP Query", fieldLength=255)
	LDAPQuery,
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
	@FlyElement(name="Lead Time Offset", description="Optional Lead Time offset before starting production", help="Optional Lead Time offset before starting production", dataType=FlyDataType.Integer, entityType="D", printName="Lead Time Offset", fieldLength=10)
	LeadTimeOffset,
	//
	@FlyElement(name="Lessor", description="The Business Partner who rents or leases", dataType=FlyDataType.Search, entityType="D", printName="Lessor", fieldLength=10)
	Lease_BPartner_ID,
	//
	@FlyElement(name="Lease Termination", description="Lease Termination Date", help="Last Date of Lease", dataType=FlyDataType.Date, entityType="D", printName="Lease Termination", fieldLength=7)
	LeaseTerminationDate,
	//
	@FlyElement(name="库存上限", description="Maximum Inventory level for this product", help="Indicates the maximum quantity of this product to be stocked in inventory.", dataType=FlyDataType.Amount, entityType="D", printName="库存上限", fieldLength=22)
	Level_Max,
	//
	@FlyElement(name="库存下限", description="Minimum Inventory level for this product", help="Indicates the minimum quantity of this product to be stocked in inventory.	", dataType=FlyDataType.Amount, entityType="D", printName="库存下限", fieldLength=22)
	Level_Min,
	//
	@FlyElement(name="水平号", dataType=FlyDataType.Integer, entityType="D", printName="水平号", fieldLength=22)
	LevelNo,
	//
	@FlyElement(name="生活使用", description="Units of use until the asset is not usable anymore", help="Life use and the actual use may be used to calculate the depreciation", dataType=FlyDataType.Integer, entityType="D", printName="生活使用", fieldLength=22)
	LifeUseUnits,
	//
	@FlyElement(name="Duration Limit", description="Maximum Duration in Duration Unit", help="Maximum (critical) Duration for time management purposes (e.g. starting an escalation procedure, etc.) in Duration Units.", dataType=FlyDataType.Integer, entityType="D", printName="Limit", fieldLength=22)
	Limit,
	//
	@FlyElement(name="限制价格额外费", description="Amount added to the converted copied price before multiplying", help="Indicates the amount to be added to the Limit price prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="限制价格额外费", fieldLength=22)
	Limit_AddAmt,
	//
	@FlyElement(name="限制价格基础", description="Base price for calculation of the new price", help="Identifies the price to be used as the base for calculating a new price list.", dataType=FlyDataType.List, entityType="D", printName="限制价格基础", fieldLength=1)
	Limit_Base,
	//
	@FlyElement(name="限制价格折扣 %", description="Discount in percent to be subtracted from base, if negative it will be added to base price", help="Indicates the discount in percent to be subtracted from base, if negative it will be added to base price", dataType=FlyDataType.Number, entityType="D", printName="限制价格折扣 %", fieldLength=22)
	Limit_Discount,
	//
	@FlyElement(name="固定的限制价格", description="Fixed Limit Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="固定的限制", fieldLength=22)
	Limit_Fixed,
	//
	@FlyElement(name="限制价格最大差额", description="Maximum difference to original limit price; ignored if zero", help="Indicates the maximum margin for a product.  The margin is calculated by subtracting the original limit price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="限制价格最大差额", fieldLength=22)
	Limit_MaxAmt,
	//
	@FlyElement(name="限制价格最小差额", description="Minimum difference to original limit price; ignored if zero", help="Indicates the minimum margin for a product.  The margin is calculated by subtracting the original limit price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="限制价格最小差额", fieldLength=22)
	Limit_MinAmt,
	//
	@FlyElement(name="限制价格圆整", description="最后的结果圆整", help="A drop down list box which indicates the rounding (if any) will apply to the final prices in this price list.", dataType=FlyDataType.List, entityType="D", printName="限制价格圆整", fieldLength=1)
	Limit_Rounding,
	//
	@FlyElement(name="明细号", description="Unique line for this document", help="Indicates the unique line for a document.  It will also control the display order of the lines within a document.", dataType=FlyDataType.Integer, entityType="D", printName="明细号", fieldLength=22)
	Line,
	//
	@FlyElement(name="线对准", description="线对准", help="For relative positioning, the line alignment", dataType=FlyDataType.List, entityType="D", printName="线对准", fieldLength=1)
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
	@FlyElement(name="行描述", description="明细的描述", dataType=FlyDataType.String, entityType="D", printName="行描述", fieldLength=255)
	LineDescription,
	//
	@FlyElement(name="明细折扣 %", description="明细折扣如一百分比", help="The Line Discount Percent indicates the discount for this line as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="折扣 %", fieldLength=22)
	LineDiscount,
	//
	@FlyElement(name="明细折扣", description="明细折扣金额", help="Indicates the discount for this line as an amount.", dataType=FlyDataType.Amount, entityType="D", printName="折扣", fieldLength=22)
	LineDiscountAmt,
	//
	@FlyElement(name="行距离", description="在线之间的距离", dataType=FlyDataType.Integer, entityType="D", printName="距离", fieldLength=22)
	LineDistance,
	//
	@FlyElement(name="Line Help/Comment", dataType=FlyDataType.String, entityType="D", printName="Line Comment", fieldLength=2000)
	LineHelp,
	//
	@FlyElement(name="明细ID", description="Transaction line ID (internal)", help="内在的联编", dataType=FlyDataType.ID, entityType="D", printName="明细ID", fieldLength=22)
	Line_ID,
	//
	@FlyElement(name="明细限制金额", dataType=FlyDataType.Amount, entityType="D", printName="限制金额", fieldLength=22)
	LineLimitAmt,
	//
	@FlyElement(name="明细目录金额", dataType=FlyDataType.Amount, entityType="D", printName="列出金额", fieldLength=22)
	LineListAmt,
	//
	@FlyElement(name="Line Margin", description="Margin of the line - Planned Amount minus Costs", dataType=FlyDataType.Amount, entityType="D", printName="Line Margin", fieldLength=22)
	LineMargin,
	//
	@FlyElement(name="行净值", description="Line Net Amount (Quantity * Actual Price) without Freight and Charges", help="Indicates the line net amount based on the quantity and the actual price.  Any additional charges or freight are not included.", dataType=FlyDataType.Amount, entityType="D", printName="行净值", fieldLength=22)
	LineNetAmt,
	//
	@FlyElement(name="Line", description="Line No", dataType=FlyDataType.Integer, entityType="D", printName="Line", fieldLength=10)
	LineNo,
	//
	@FlyElement(name="总共的差额 %", dataType=FlyDataType.Number, entityType="D", printName="差额 %", fieldLength=22)
	LineOverLimit,
	//
	@FlyElement(name="总共的差额", dataType=FlyDataType.Amount, entityType="D", printName="差额", fieldLength=22)
	LineOverLimitAmt,
	//
	@FlyElement(name="线颜色", description="表线颜色", dataType=FlyDataType.Table, entityType="D", printName="线颜色", fieldLength=22)
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
	@FlyElement(name="行类型", dataType=FlyDataType.List, entityType="D", printName="行类型", fieldLength=1)
	LineType,
	//
	@FlyElement(name="线宽度", description="线的宽度", dataType=FlyDataType.Integer, entityType="D", printName="线宽度", fieldLength=22)
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
	@FlyElement(name="列表价格额外费", description="列表价格额外费", help="The List Price Surcharge Amount indicates the amount to be added to the price prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="列表价格额外费", fieldLength=22)
	List_AddAmt,
	//
	@FlyElement(name="列表价格基础", description="Price used as the basis for price list calculations", help="The List Price Base indicates the price to use as the basis for the calculation of a new price list.", dataType=FlyDataType.List, entityType="D", printName="列表价格基础", fieldLength=1)
	List_Base,
	//
	@FlyElement(name="列出明细", description="列出文件明细", help="The List Details checkbox indicates that the details for each document line will be displayed.", dataType=FlyDataType.YesNo, entityType="D", printName="列出明细", fieldLength=1)
	ListDetails,
	//
	@FlyElement(name="列表价格折扣 %", description="Discount from list price as a percentage", help="The List Price Discount Percentage indicates the percentage discount which will be subtracted from the base price.  A negative amount indicates the percentage which will be added to the base price.", dataType=FlyDataType.Number, entityType="D", printName="列表价格折扣 %", fieldLength=22)
	List_Discount,
	//
	@FlyElement(name="固定的列表价格", description="Fixes List Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="固定的目录", fieldLength=22)
	List_Fixed,
	//
	@FlyElement(name="列表价格最大差额", description="产品的最大的差额", help="The List Price Max Margin indicates the maximum margin for a product.  The margin is calculated by subtracting the original list price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="列表价格最大差额", fieldLength=22)
	List_MaxAmt,
	//
	@FlyElement(name="列表价格最小差额", description="产品最小量差额", help="The List Price Min Margin indicates the minimum margin for a product.  The margin is calculated by subtracting the original list price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="列表价格最小差额", fieldLength=22)
	List_MinAmt,
	//
	@FlyElement(name="列表价格圆整", description="Rounding rule for final list price", help="The List Price Rounding indicates how the final list price will be rounded.", dataType=FlyDataType.List, entityType="D", printName="列表价格圆整", fieldLength=1)
	List_Rounding,
	//
	@FlyElement(name="列出来源", description="列出报表行来源", help="List the Source Accounts for Summary Accounts selected", dataType=FlyDataType.YesNo, entityType="D", printName="列出来源", fieldLength=1)
	ListSources,
	//
	@FlyElement(name="列出交易", description="列出报表交易", help="List the transactions of the report source lines", dataType=FlyDataType.YesNo, entityType="D", printName="列出交易", fieldLength=1)
	ListTrx,
	//
	@FlyElement(name="序列", dataType=FlyDataType.Integer, entityType="D", printName="序列", fieldLength=22)
	LoadSeq,
	//
	@FlyElement(name="Local Host", description="Local Host Info", dataType=FlyDataType.String, entityType="D", printName="Local Host", fieldLength=120)
	Local_Host,
	//
	@FlyElement(name="位置意见", description="Additional comments or remarks concerning the location", dataType=FlyDataType.String, entityType="D", printName="位置意见", fieldLength=255)
	LocationComment,
	//
	@FlyElement(name="货位值", dataType=FlyDataType.String, entityType="D", printName="货位值", fieldLength=40)
	LocatorValue,
	//
	@FlyElement(name="Locked", description="Whether the terminal is locked", dataType=FlyDataType.YesNo, entityType="D", printName="Locked", fieldLength=1)
	Locked,
	//
	@FlyElement(name="Lock Time", description="Time in minutes the terminal should be kept in a locked state.", dataType=FlyDataType.Integer, entityType="D", printName="Lock Time", fieldLength=10)
	LockTime,
	//
	@FlyElement(name="本地码", description="Location code - UN LOCODE ", help="UN Locode is a combination of a 2-character country code and a 3-character location code, e.g. BEANR is known as the city of Antwerp (ANR) which is located in Belgium (BE).	<p>See: http:  www.unece.org cefact locode service main.htm", dataType=FlyDataType.String, entityType="D", printName="本地码", fieldLength=10)
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
	@FlyElement(name="批", description="批号", help="The Lot Number indicates the specific lot that a product was part of.", dataType=FlyDataType.String, entityType="D", printName="批", fieldLength=40)
	Lot,
	//
	@FlyElement(name="Lot Char End Overwrite", description="Lot/Batch End Indicator overwrite - default »", help="If not defined, the default character » is used", dataType=FlyDataType.String, entityType="D", printName="Lot Char End", fieldLength=1)
	LotCharEOverwrite,
	//
	@FlyElement(name="Lot Char Start Overwrite", description="Lot/Batch Start Indicator overwrite - default «", help="If not defined, the default character « is used", dataType=FlyDataType.String, entityType="D", printName="Lot Char Start", fieldLength=1)
	LotCharSOverwrite,
	//
	@FlyElement(name="Macro", description="Macro", dataType=FlyDataType.Text, entityType="D", printName="Macro", fieldLength=2000)
	Macro,
	//
	@FlyElement(name="邮寄抬头", dataType=FlyDataType.String, entityType="D", printName="邮寄抬头", fieldLength=2000)
	MailHeader,
	//
	@FlyElement(name="Message Type", description="Mail Message Type", dataType=FlyDataType.List, entityType="D", printName="Message Type", fieldLength=2)
	MailMsgType,
	//
	@FlyElement(name="邮寄本文", description="邮件信息用的本文", help="The Mail Text indicates the text used for mail messages.", dataType=FlyDataType.Text, entityType="D", printName="邮寄本文", fieldLength=2000)
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
	@FlyElement(name="实际手工", description="手工输入实际值", help="The Manual Active identifies a manually entered actual measurement value.", dataType=FlyDataType.Number, entityType="D", printName="实际手工", fieldLength=22)
	ManualActual,
	//
	@FlyElement(name=" 注解", description="人工输入的注解", help="The Note allows for entry for additional information regarding a manual entry.", dataType=FlyDataType.Text, entityType="D", printName=" 注解", fieldLength=2000)
	ManualNote,
	//
	@FlyElement(name="Manufactured Year", dataType=FlyDataType.NONE, entityType="D", printName="Manufactured Year", fieldLength=0)
	ManufacturedYear,
	//
	@FlyElement(name="制造商", dataType=FlyDataType.String, entityType="D", printName="制造商", fieldLength=30)
	Manufacturer,
	//
	@FlyElement(name="Manufacturer", dataType=FlyDataType.NONE, entityType="D", printName="Manufacturer", fieldLength=0)
	Manufacturer_ID,
	//
	@FlyElement(name="差额 %", description="Margin for a product as a percentage", help="The Margin indicates the margin for this product as a percentage of the limit price and selling price.", dataType=FlyDataType.Number, entityType="D", printName="差额 %", fieldLength=22)
	Margin,
	//
	@FlyElement(name="Margin Amount", description="Difference between actual and limit price multiplied by the quantity", help="The margin amount is calculated as the difference between actual and limit price multiplied by the quantity", dataType=FlyDataType.Amount, entityType="D", printName="Margin Amt", fieldLength=22)
	MarginAmt,
	//
	@FlyElement(name="底部边距", description="Bottom Space in 1 72 inch", help="Space on bottom of a page in 1 72 inch", dataType=FlyDataType.Integer, entityType="D", printName="底部", fieldLength=22)
	MarginBottom,
	//
	@FlyElement(name="左边边距", description="Left Space in 1 72 inch", help="Space on left side of a page in 1 72 inch", dataType=FlyDataType.Integer, entityType="D", printName="离开", fieldLength=22)
	MarginLeft,
	//
	@FlyElement(name="右边距", description="Right Space in 1 72 inch", help="Space on right side of a page in 1 72 inch", dataType=FlyDataType.Integer, entityType="D", printName="右", fieldLength=22)
	MarginRight,
	//
	@FlyElement(name="上边距", description="Top Space in 1 72 inch", help="Space on top of a page in 1 72 inch", dataType=FlyDataType.Integer, entityType="D", printName="顶端", fieldLength=22)
	MarginTop,
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
	@FlyElement(name="Match Code", description="String identifying related accounting facts", dataType=FlyDataType.NONE, entityType="D", printName="Match Code", fieldLength=0)
	MatchCode,
	//
	@FlyElement(name="Match Requirement", description="Matching Requirement for Invoice", dataType=FlyDataType.NONE, entityType="D", printName="Match", fieldLength=0)
	MatchRequirement,
	//
	@FlyElement(name="Match Statement", dataType=FlyDataType.Button, entityType="D", printName="Match Statement", fieldLength=1)
	MatchStatement,
	//
	@FlyElement(name="属性", description="产品属性", help="Product Attribute like Color, Size", dataType=FlyDataType.TableDirect, entityType="D", printName="属性", fieldLength=22)
	M_Attribute_ID,
	//
	@FlyElement(name="属性搜寻", description="通常的搜寻属性 ", help="Attributes are specific to a Product Attribute Set (e.g. Size for T-Shirts: S,M,L). If you have multiple attributes and want to search under a common sttribute, you define a search sttribute. Example: have one Size search attribute combining the values of all different sizes (Size for Dress Shirt  XL,L,M,S,XS). The Attribute Search allows you to have all values available for selection.  This eases the maintenance of the individual product attribute.", dataType=FlyDataType.ID, entityType="D", printName="属性搜寻", fieldLength=22)
	M_AttributeSearch_ID,
	//
	@FlyElement(name="Exclude Attribute Set", description="Exclude the ability to enter Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude Attribute Set", fieldLength=10)
	M_AttributeSetExclude_ID,
	//
	@FlyElement(name="属性组合", description="产品属性组合", help="Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking.", dataType=FlyDataType.TableDirect, entityType="D", printName="属性组合", fieldLength=22)
	M_AttributeSet_ID,
	//
	@FlyElement(name="属性组合实例", description="Product Attribute Set Instance", help="The values of the actual Product Attributes", dataType=FlyDataType.ProductAttribute, entityType="D", printName="属性组合实例", fieldLength=22)
	M_AttributeSetInstance_ID,
	//
	@FlyElement(name="Attribute Set Instance To", description="Target Product Attribute Set Instance", dataType=FlyDataType.ProductAttribute, entityType="D", printName="Attribute Set Instance To", fieldLength=10)
	M_AttributeSetInstanceTo_ID,
	//
	@FlyElement(name="属性值", description="产品属性值", help="Individual value of a product attribute (e.g. green, large, ..)", dataType=FlyDataType.ID, entityType="D", printName="属性值", fieldLength=22)
	M_AttributeValue_ID,
	//
	@FlyElement(name="最大金额", description="Maximum Amount in invoice currency", help="The Maximum Amount indicates the maximum amount in invoice currency.", dataType=FlyDataType.Amount, entityType="D", printName="最大金额", fieldLength=22)
	MaxAmt,
	//
	@FlyElement(name="Max Click Count", description="Maximum Click Count until banner is deactivated", help="A banner has a maximum number of clicks after which it will get deactivated", dataType=FlyDataType.Integer, entityType="D", printName="Max Click Count", fieldLength=10)
	MaxClick,
	//
	@FlyElement(name="最大高度", description="Maximum Height in 1 72 if an inch - 0 = no restriction", help="Maximum height of the element in 1 72 of an inch (point). If zero (0), there is no height restriction.", dataType=FlyDataType.Integer, entityType="D", printName="最大高度", fieldLength=22)
	MaxHeight,
	//
	@FlyElement(name="Max Impression Count", description="Maximum Impression Count until banner is deactivated", help="A banner has a maximum number of impressions after which it will get deactivated", dataType=FlyDataType.Integer, entityType="D", printName="Max Impression Count", fieldLength=10)
	MaxImpression,
	//
	@FlyElement(name="每发票最大销帐金额", description="Maximum invoice amount to be written off in invoice currency", dataType=FlyDataType.NONE, entityType="D", printName="每发票最大销帐金额", fieldLength=0)
	MaxInvWriteOffAmt,
	//
	@FlyElement(name="Maximum Length", description="Maximum Length of Data", dataType=FlyDataType.NONE, entityType="D", printName="Maximum Length", fieldLength=0)
	MaxLength,
	//
	@FlyElement(name="Max Query Records", description="If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records", help="Enter the number of records a user will be able to query to avoid unnecessary system load.  If 0, no restrictions are imposed.", dataType=FlyDataType.Integer, entityType="D", printName="Max Query Records", fieldLength=10)
	MaxQueryRecords,
	//
	@FlyElement(name="最大宽度", description="Maximum Width in 1 72 if an inch - 0 = no restriction", help="Maximum width of the element in 1 72 of an inch (point). If zero (0), there is no width restriction.", dataType=FlyDataType.Integer, entityType="D", printName="最大宽度", fieldLength=22)
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
	@FlyElement(name="成本类型", description="成本的类型", dataType=FlyDataType.ID, entityType="D", printName="成本类型", fieldLength=22)
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
	@FlyElement(name="打折模式休息", description="批发折扣休息", help="Trade discount based on breaks (steps)", dataType=FlyDataType.ID, entityType="D", printName="打折模式休息", fieldLength=22)
	M_DiscountSchemaBreak_ID,
	//
	@FlyElement(name="打折模式", description="Schema to calculate the trade discount percentage", help="After calculation of the (standard) price, the trade discount percentage is calculated and applied resulting in the final price.", dataType=FlyDataType.Table, entityType="D", printName="打折模式", fieldLength=22)
	M_DiscountSchema_ID,
	//
	@FlyElement(name="打折价格列表", description="Line of the pricelist trade discount schema", help="For the Pricelist Discount Type, you enter how the list, standard and limit price is calculated.", dataType=FlyDataType.ID, entityType="D", printName="打折价格列表", fieldLength=22)
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
	@FlyElement(name="Distribution Run Line", description="Distribution Run Lines define Distribution List, the Product and Quantiries", help="The order amount is based on the greater of the minimums of the product or distribution list and the quantity based on the ratio.", dataType=FlyDataType.ID, entityType="D", printName="Distribution Run Line", fieldLength=22)
	M_DistributionRunLine_ID,
	//
	@FlyElement(name="实际度量", description="Actual value that has been measured.", help="The Measure Actual indicates the actual measured value. The measured values are used in determining if a performance goal has been met", dataType=FlyDataType.Number, entityType="D", printName="实际度量", fieldLength=22)
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
	@FlyElement(name="度量目标", description="度量目标值", help="The Measure Target indicates the target or goal for this measure.  It is used as in comparing against the actual measures", dataType=FlyDataType.Number, entityType="D", printName="度量目标", fieldLength=22)
	MeasureTarget,
	//
	@FlyElement(name="度量类型", description="Determines how the actual performance is derived", help="The Measure Type indicates how the actual measure is determined.  For example, one measure may be manual while another is calculated.", dataType=FlyDataType.List, entityType="D", printName="度量类型", fieldLength=1)
	MeasureType,
	//
	@FlyElement(name="Media Size", description="Java Media Size", help="The Java Media Size. Example: 'MediaSize.ISO.A4' (the package javax.print.attribute.standard is assumed). If you define your own media size, use the fully qualified name.	If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.String, entityType="D", printName="Media Size", fieldLength=40)
	MediaSize,
	//
	@FlyElement(name="Media Type", description="Defines the media type for the browser", help="The browser and the media server need info on the type of content", dataType=FlyDataType.List, entityType="D", printName="Media Type", fieldLength=3)
	MediaType,
	//
	@FlyElement(name="EDI 交易", dataType=FlyDataType.ID, entityType="D", printName="EDI 交易", fieldLength=22)
	M_EDI_ID,
	//
	@FlyElement(name="EDI 日志", dataType=FlyDataType.ID, entityType="D", printName="EDI 日志", fieldLength=22)
	M_EDI_Info_ID,
	//
	@FlyElement(name="备忘录", description="备忘录文本", dataType=FlyDataType.String, entityType="D", printName="备忘录", fieldLength=255)
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
	@FlyElement(name="Message ID", description="发电子邮件给信息ID", help="SMTP Message ID for tracking purposes", dataType=FlyDataType.String, entityType="D", printName="信息ID", fieldLength=120)
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
	@FlyElement(name="Fixed in", description="Fixed in Change Notice", dataType=FlyDataType.Table, entityType="D", printName="Fixed in", fieldLength=10)
	M_FixChangeNotice_ID,
	//
	@FlyElement(name="Forecast", description="Material Forecast", help="Material Forecast", dataType=FlyDataType.ID, entityType="D", printName="Forecast", fieldLength=22)
	M_Forecast_ID,
	//
	@FlyElement(name="Forecast Line", description="Forecast Line", help="Forecast of Product Qyantity by Period", dataType=FlyDataType.Search, entityType="D", printName="Forecast Line", fieldLength=22)
	M_ForecastLine_ID,
	//
	@FlyElement(name="运费分类", description="运费分类", help="Freight Categories are used to calculate the Freight for the Shipper selected", dataType=FlyDataType.ID, entityType="D", printName="运费分类", fieldLength=22)
	M_FreightCategory_ID,
	//
	@FlyElement(name="运费", description="运费比率", help="运输商运费比率", dataType=FlyDataType.ID, entityType="D", printName="运费", fieldLength=22)
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
	@FlyElement(name="微寸", description="Combination of routing no, account and check no", help="The Micr number is the combination of the bank routing number, account number and check number", dataType=FlyDataType.String, entityType="D", printName="微寸", fieldLength=20)
	Micr,
	//
	@FlyElement(name="最小金额", description="Minimum Amount in invoice currency", help="The Minimum amount indicates the minimum amount as stated in the currency of the invoice.", dataType=FlyDataType.Amount, entityType="D", printName="最小 Amt", fieldLength=22)
	MinAmt,
	//
	@FlyElement(name="Minimum Amt", description="Minumum Amout in Document Currency", dataType=FlyDataType.Amount, entityType="D", printName="Minimum Amt", fieldLength=22)
	MinimumAmt,
	//
	@FlyElement(name="Ship/Receipt Confirmation", description="Material Shipment or Receipt Confirmation", help="Confirmation of Shipment or Receipt - Created from the Shipment/Receipt", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm", fieldLength=22)
	M_InOutConfirm_ID,
	//
	@FlyElement(name="发运|收货", description="物料出货或收货文件", help="The Shipment   Receipt ID indicates the unique document for this shipment or receipt.", dataType=FlyDataType.ID, entityType="D", printName="发运|收货", fieldLength=22)
	M_InOut_ID,
	//
	@FlyElement(name="Ship/Receipt Confirmation Line", description="Material Shipment or Receipt Confirmation Line", help="Confirmation details", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm Line", fieldLength=22)
	M_InOutLineConfirm_ID,
	//
	@FlyElement(name="收货明细", description="接收货明细", help="The Shipment Receipt Line indicates a unique line in a Shipment Receipt document", dataType=FlyDataType.ID, entityType="D", printName="收货明细", fieldLength=22)
	M_InOutLine_ID,
	//
	@FlyElement(name="Minimum Quantity", description="Minimum quantity for the business partner", help="If a minimum quantity is defined, and the quantity is based on the percentage is lower, the minimum quantity is used.", dataType=FlyDataType.Quantity, entityType="D", printName="Min Qty", fieldLength=22)
	MinQty,
	//
	@FlyElement(name="Phys.Inventory", description="盘点参数", help="The Physical Inventory indicates a unique parameters for a physical inventory.", dataType=FlyDataType.ID, entityType="D", printName="Phys.Inventory", fieldLength=22)
	M_Inventory_ID,
	//
	@FlyElement(name="Phys.Inventory Line", description="盘点明细", help="The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="Phys.Inventory Line", fieldLength=22)
	M_InventoryLine_ID,
	//
	@FlyElement(name="货位", description="仓库货位", help="The Locator ID indicates where in a Warehouse a product is located.", dataType=FlyDataType.ID, entityType="D", printName="货位", fieldLength=22)
	M_Locator_ID,
	//
	@FlyElement(name="目标货位", description="目标货位", help="The Locator To indicates the location where the inventory is being moved to.", dataType=FlyDataType.Locator, entityType="D", printName="目标货位", fieldLength=22)
	M_LocatorTo_ID,
	//
	@FlyElement(name="Exclude Lot", description="Exclude the ability to create Lots in Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude Lot", fieldLength=10)
	M_LotCtlExclude_ID,
	//
	@FlyElement(name="批控制", description="产品批控制", help="Definition to create Lot numbers for Products", dataType=FlyDataType.ID, entityType="D", printName="批控制", fieldLength=22)
	M_LotCtl_ID,
	//
	@FlyElement(name="批", description="产品批定义", help="The individual Lot of a Product", dataType=FlyDataType.ID, entityType="D", printName="批", fieldLength=22)
	M_Lot_ID,
	//
	@FlyElement(name="匹配发票", description="Match Shipment Receipt to Invoice", dataType=FlyDataType.ID, entityType="D", printName="匹配发票", fieldLength=22)
	M_MatchInv_ID,
	//
	@FlyElement(name="匹配采购定单", description="Match Purchase Order to Shipment Receipt", dataType=FlyDataType.ID, entityType="D", printName="匹配采购定单", fieldLength=22)
	M_MatchPO_ID,
	//
	@FlyElement(name="Move Confirm", description="Inventory Move Confirmation", help="The document is automatically created when the document type of the movement indicates In Transit.", dataType=FlyDataType.TableDirect, entityType="D", printName="Move Confirm", fieldLength=22)
	M_MovementConfirm_ID,
	//
	@FlyElement(name="库存移动", description="调拨", help="The Inventory Movement uniquely identifies a group of movement lines.", dataType=FlyDataType.ID, entityType="D", printName="调拨", fieldLength=22)
	M_Movement_ID,
	//
	@FlyElement(name="Move Line Confirm", description="Inventory Move Line Confirmation", dataType=FlyDataType.ID, entityType="D", printName="Move Line Confirm", fieldLength=22)
	M_MovementLineConfirm_ID,
	//
	@FlyElement(name="调拨明细", description="调拨明细", help="The Movement Line indicates the inventory movement document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="调拨明细", fieldLength=22)
	M_MovementLine_ID,
	//
	@FlyElement(name="Material Policy", description="Material Movement Policy", help="The Material Movement Policy determines how the stock is flowing (FiFo or LiFo) if a specific Product Instance was not selected.  The policy can not contradict the costing method (e.g. FiFo movement policy and LiFo costing method).", dataType=FlyDataType.List, entityType="D", printName="Mat Policy", fieldLength=1)
	MMPolicy,
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
	@FlyElement(name="Operation Resource", description="Product Operation Resource", help="Resources for the Operation. You can have multiple resources (e.g. tool, labor) per operation.", dataType=FlyDataType.ID, entityType="D", printName="Operation Resource", fieldLength=10)
	M_OperationResource_ID,
	//
	@FlyElement(name="调拨日期", description="Date a product was moved in or out of inventory", help="The Movement Date indicates the date that a product moved in or out of inventory.  This is the result of a shipment, receipt or inventory movement.", dataType=FlyDataType.Date, entityType="D", printName="调拨日期", fieldLength=7)
	MovementDate,
	//
	@FlyElement(name="调拨数量", description="Quantity of a product moved.", help="The Movement Quantity indicates the quantity of a product that has been moved.", dataType=FlyDataType.Quantity, entityType="D", printName="数量", fieldLength=22)
	MovementQty,
	//
	@FlyElement(name="调拨类型", description="Method of moving the inventory", help="The Movement Type indicates the type of movement (in, out, to production, etc)", dataType=FlyDataType.List, entityType="D", printName="调拨类型", fieldLength=2)
	MovementType,
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
	@FlyElement(name="永续盘点", description="Rules for generating physical inventory", help="The Perpetual Inventory identifies the Perpetual Inventory rule which generated this Physical Inventory.", dataType=FlyDataType.TableDirect, entityType="D", printName="永续盘点", fieldLength=22)
	M_PerpetualInv_ID,
	//
	@FlyElement(name="价目表", description="Unique identifier of a Price List", help="Price Lists are used to determine the pricing, margin and cost of items purchased or sold.", dataType=FlyDataType.ID, entityType="D", printName="价目表", fieldLength=22)
	M_PriceList_ID,
	//
	@FlyElement(name="基本价格列表", description="Source for Price list calculations", help="The Base Price List identifies the Base Pricelist used for calculating prices (the source)", dataType=FlyDataType.Table, entityType="D", printName="基本价格列表", fieldLength=22)
	M_Pricelist_Version_Base_ID,
	//
	@FlyElement(name="价目表版本", description="Identifies a unique instance of a Price List", help="Each Price List can have multiple versions.  The most common use is to indicate the dates that a Price List is valid for.", dataType=FlyDataType.TableDirect, entityType="D", printName="价目表版本", fieldLength=22)
	M_PriceList_Version_ID,
	//
	@FlyElement(name="物料清单明细", dataType=FlyDataType.ID, entityType="D", printName="物料清单明细", fieldLength=22)
	M_Product_BOM_ID,
	//
	@FlyElement(name="物料清单产品", description="产品物料清单", help="The BOM Product identifies an element that is part of this Bill of Materials.", dataType=FlyDataType.Search, entityType="D", printName="物料清单产品", fieldLength=22)
	M_ProductBOM_ID,
	//
	@FlyElement(name="产品分类", description="Category this product is part of", help="Identifies the category which this product belongs to.  Product categories are used for pricing.", dataType=FlyDataType.TableDirect, entityType="D", printName="产品分类", fieldLength=22)
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
	@FlyElement(name="产品为运费", dataType=FlyDataType.Search, entityType="D", printName="产品为运费", fieldLength=22)
	M_ProductFreight_ID,
	//
	@FlyElement(name="Product Group", description="Group of a Product", help="Identifies the Group which this product belongs to.", dataType=FlyDataType.TableDirect, entityType="D", printName="Product Group", fieldLength=22)
	M_Product_Group_ID,
	//
	@FlyElement(name="Product Group Parent", dataType=FlyDataType.NONE, entityType="D", printName="Product Group Parent", fieldLength=0)
	M_Product_Group_Parent_ID,
	//
	@FlyElement(name="产品", description="Product, Service, Item", help="Identifies an item which is either purchased or sold in this organization.", dataType=FlyDataType.ID, entityType="D", printName="产品", fieldLength=22)
	M_Product_ID,
	//
	@FlyElement(name="Production Batch", dataType=FlyDataType.TableDirect, entityType="D", printName="Production Batch", fieldLength=10)
	M_ProductionBatch_ID,
	//
	@FlyElement(name="Production Batch Line", dataType=FlyDataType.TableDirect, entityType="D", printName="Production Batch Line", fieldLength=10)
	M_ProductionBatchLine_ID,
	//
	@FlyElement(name="制造", description="产生一种产品的计划", help="The Production uniquely identifies a Production Plan", dataType=FlyDataType.ID, entityType="D", printName="制造", fieldLength=22)
	M_Production_ID,
	//
	@FlyElement(name="制造明细", description="制造明细", help="The Production Line indicates the production document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="制造明细", fieldLength=22)
	M_ProductionLine_ID,
	//
	@FlyElement(name="制造计划", description="Plan for how a product is produced", help="The Production Plan identifies the items and steps in generating a product.", dataType=FlyDataType.TableDirect, entityType="D", printName="制造计划", fieldLength=22)
	M_ProductionPlan_ID,
	//
	@FlyElement(name="Membership", description="Product used to deternine the price of the membership for the topic type", help="A topic can require to pay a membership fee.", dataType=FlyDataType.Table, entityType="D", printName="Membership", fieldLength=22)
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
	@FlyElement(name="Exclude SerNo", description="Exclude the ability to create Serial Numbers in Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude SerNo", fieldLength=10)
	M_SerNoCtlExclude_ID,
	//
	@FlyElement(name="序列号控制", description="产品序号控制", help="Definition to create Serial numbers for Products", dataType=FlyDataType.ID, entityType="D", printName="序列号控制", fieldLength=22)
	M_SerNoCtl_ID,
	//
	@FlyElement(name="消息文本", description="Textual Informational, Menu or Error Message", help="The Message Text indicates the message that will display ", dataType=FlyDataType.Text, entityType="D", printName="消息文本", fieldLength=2000)
	MsgText,
	//
	@FlyElement(name="消息提示", description="Additional tip or help for this message", help="The Message Tip defines additional help or information about this message.", dataType=FlyDataType.Text, entityType="D", printName="消息提示", fieldLength=2000)
	MsgTip,
	//
	@FlyElement(name="消息类型", description="Type of message (Informational, Menu or Error)", help="The Message Type indicates the type of message being defined.  Valid message types are Informational, Menu and Error.", dataType=FlyDataType.List, entityType="D", printName="消息类型", fieldLength=1)
	MsgType,
	//
	@FlyElement(name="运输商", description="Method or manner of product delivery", help="The Shipper indicates the method of delivering product", dataType=FlyDataType.ID, entityType="D", printName="运输商", fieldLength=22)
	M_Shipper_ID,
	//
	@FlyElement(name="Target distribution", description="Get product from target distribution to apply the promotion reward", dataType=FlyDataType.Table, entityType="D", printName="Target distribution", fieldLength=22)
	M_TargetDistribution_ID,
	//
	@FlyElement(name="库存交易", dataType=FlyDataType.ID, entityType="D", printName="Inventory Transaction", fieldLength=22)
	M_Transaction_ID,
	//
	@FlyElement(name="乘数", dataType=FlyDataType.Number, entityType="D", printName="乘数", fieldLength=22)
	Multiplier,
	//
	@FlyElement(name="应付款乘数", description="应付的增殖者", dataType=FlyDataType.Number, entityType="D", printName="应付款乘数", fieldLength=22)
	MultiplierAP,
	//
	@FlyElement(name="乘积比率", description="Rate to multiple the source by to calculate the target.", help="To convert Source number to Target number, the Source is multiplied by the multiply rate.  If the Multiply Rate is entered, then the Divide Rate will be automatically calculated.", dataType=FlyDataType.Number, entityType="D", printName="乘积比率", fieldLength=22)
	MultiplyRate,
	//
	@FlyElement(name="产品数量必须在库存中", description="如果库存不足,物料将不能生产", dataType=FlyDataType.NONE, entityType="D", printName="产品数量必须在库存中", fieldLength=0)
	MustBeStocked,
	//
	@FlyElement(name="仓库或服务位置", description="Storage Warehouse and Service Point", help="The Warehouse identifies a unique Warehouse where products are stored or Services are provided.", dataType=FlyDataType.ID, entityType="D", printName="仓库", fieldLength=22)
	M_Warehouse_ID,
	//
	@FlyElement(name="Source Warehouse", description="Optional Warehouse to replenish from", help="If defined, the warehouse selected is used to replenish the product(s)", dataType=FlyDataType.Table, entityType="D", printName="Source Warehouse", fieldLength=10)
	M_WarehouseSource_ID,
	//
	@FlyElement(name="NAICS SIC", description="Standard Industry Code or its successor NAIC - http:  www.osha.gov oshstats sicser.html", help="The NAICS SIC identifies either of these codes that may be applicable to this Business Partner.", dataType=FlyDataType.String, entityType="D", printName="NAICS SIC", fieldLength=6)
	NAICS,
	//
	@FlyElement(name="名称", description="Alphanumeric identifier of the entity", help="The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", dataType=FlyDataType.String, entityType="D", printName="名称", fieldLength=60)
	Name,
	//
	@FlyElement(name="命名 2", description="附加的名字", dataType=FlyDataType.String, entityType="D", printName="命名 2", fieldLength=60)
	Name2,
	//
	@FlyElement(name="Name Colour", dataType=FlyDataType.NONE, entityType="D", printName="Name Colour", fieldLength=0)
	Name_PrintColor_ID,
	//
	@FlyElement(name="Name Font", dataType=FlyDataType.NONE, entityType="D", printName="Name Font", fieldLength=0)
	Name_PrintFont_ID,
	//
	@FlyElement(name="发票净金额", description="该发票的网络金额", help="Indicates the net amount for this invoice.  It does not include shipping or any additional charges.", dataType=FlyDataType.Amount, entityType="D", printName="发票净金额", fieldLength=22)
	NetAmtToInvoice,
	//
	@FlyElement(name="总天数", description="付款到期日", help="When defined, overwrites the number of net days with the relative number of days to the the day defined.", dataType=FlyDataType.List, entityType="D", printName="总天数", fieldLength=1)
	NetDay,
	//
	@FlyElement(name="净天数", description="Net Days in which payment is due", help="Indicates the number of days after invoice date that payment is due.", dataType=FlyDataType.Integer, entityType="D", printName="净天数", fieldLength=22)
	NetDays,
	//
	@FlyElement(name="New Email Address", description="Enter new EMail Address - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New Email Address", fieldLength=0)
	NewEMail,
	//
	@FlyElement(name="New Email User ID", description="Enter new User ID of your internal EMail System - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New Email User ID", fieldLength=0)
	NewEMailUser,
	//
	@FlyElement(name="New Email User PW", description="Enter new User Password of your internal EMail System - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New Email User PW", fieldLength=0)
	NewEMailUserPW,
	//
	@FlyElement(name="新口令", description="Enter the new password - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="新口令", fieldLength=0)
	NewPassword,
	//
	@FlyElement(name="新的值", description="新的字段值", help="新的数据在字段中输入", dataType=FlyDataType.String, entityType="D", printName="新的值", fieldLength=2000)
	NewValue,
	//
	@FlyElement(name="下一个动作", description="下一个动作被采取", help="The Next Action indicates the next action to be taken on this request.", dataType=FlyDataType.List, entityType="D", printName="下一个动作", fieldLength=1)
	NextAction,
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
	@FlyElement(name="Node_ID", dataType=FlyDataType.ID, entityType="D", printName="Node_ID", fieldLength=22)
	Node_ID,
	//
	@FlyElement(name="已期满保证邮件", description="Send email to partners with expired guarantee", dataType=FlyDataType.NONE, entityType="D", printName="已期满保证邮件", fieldLength=0)
	NoGuarantee_MailText_ID,
	//
	@FlyElement(name="盘点的数字", description="Frequency of inventory counts per year", help="The Number of Inventory Counts indicates the number of times per year that inventory counts will be preformed", dataType=FlyDataType.Integer, entityType="D", printName="盘点的数字", fieldLength=22)
	NoInventoryCount,
	//
	@FlyElement(name="月的数字", dataType=FlyDataType.Integer, entityType="D", printName="月的数字", fieldLength=22)
	NoMonths,
	//
	@FlyElement(name="Not Committed Aount", description="Amount not committed yet", dataType=FlyDataType.Amount, entityType="D", printName="Not Committed Amt", fieldLength=22)
	NonCommittedAmt,
	//
	@FlyElement(name="No_Of_Periods", dataType=FlyDataType.NONE, entityType="D", printName="No_Of_Periods", fieldLength=0)
	No_Of_Periods,
	//
	@FlyElement(name="件数", description="物料出货包装的数字", dataType=FlyDataType.Integer, entityType="D", printName="件数", fieldLength=22)
	NoPackages,
	//
	@FlyElement(name="处理器数", description="数据库的处理器数", dataType=FlyDataType.Integer, entityType="D", printName="处理器数", fieldLength=22)
	NoProcessors,
	//
	@FlyElement(name="产品计数的数字", description="Frequency of product counts per year", help="The Number of Product Count indicates the number of times per year that a product should be counted.", dataType=FlyDataType.Integer, entityType="D", printName="产品计数的数字", fieldLength=22)
	NoProductCount,
	//
	@FlyElement(name=" 注解", description="Optional additional user defined information", help="The Note field allows for optional entry of user defined information regarding this record", dataType=FlyDataType.Text, entityType="D", printName=" 注解", fieldLength=2000)
	Note,
	//
	@FlyElement(name="Notice", description="Contains last write notice", help="Contains info on what changed with the last write", dataType=FlyDataType.Text, entityType="D", printName="Notice", fieldLength=2000)
	Notice,
	//
	@FlyElement(name="Notification Type", description="Type of Notifications", help="Emails or Notification sent out for Request Updates, etc.", dataType=FlyDataType.List, entityType="D", printName="Notification Type", fieldLength=1)
	NotificationType,
	//
	@FlyElement(name="未开票收货", description="未开票收货", help="The Not Invoiced Receipts account indicates the account used for recording receipts for materials that have not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="未开票收货", fieldLength=22)
	NotInvoicedReceipts_Acct,
	//
	@FlyElement(name="未开票应收帐款", description="未开票应收帐款帐户", help="The Not Invoiced Receivables account indicates the account used for recording receivables that have not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="未开票应收帐款", fieldLength=22)
	NotInvoicedReceivables_Acct,
	//
	@FlyElement(name="未开票收入", description="未开票收入帐户", help="The Not Invoiced Revenue account indicates the account used for recording revenue that has not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="未开票收入", fieldLength=22)
	NotInvoicedRevenue_Acct,
	//
	@FlyElement(name="Not Posted", dataType=FlyDataType.NONE, entityType="D", printName="Not Posted", fieldLength=0)
	NotPosted,
	//
	@FlyElement(name="Null Columns", description="Columns with NULL value", help="Null values are used for showing 'no change'", dataType=FlyDataType.String, entityType="D", printName="Null Columns", fieldLength=255)
	NullColumns,
	//
	@FlyElement(name="职员数", description="职员的人数", help="Indicates the number of employees for this Business Partner.  This field displays only for Prospects.", dataType=FlyDataType.Integer, entityType="D", printName="职员数", fieldLength=22)
	NumberEmployees,
	//
	@FlyElement(name="运行的数目", description="永续盘存运行频率", help="The Number of Runs indicates the number of times that the Perpetual Inventory has be processed.", dataType=FlyDataType.Integer, entityType="D", printName="运行的数目", fieldLength=22)
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
	@FlyElement(name="旧口令", description="Old Password is required if you are not a System Administrator", dataType=FlyDataType.NONE, entityType="D", printName="旧口令", fieldLength=0)
	OldPassword,
	//
	@FlyElement(name="旧的值", description="旧的文件数据", help="Old data overwritten in the field", dataType=FlyDataType.String, entityType="D", printName="旧的值", fieldLength=2000)
	OldValue,
	//
	@FlyElement(name="onevent", dataType=FlyDataType.NONE, entityType="D", printName="onevent", fieldLength=0)
	onevent,
	//
	@FlyElement(name="星期五", description="可用每个星期五", dataType=FlyDataType.YesNo, entityType="D", printName="周五", fieldLength=1)
	OnFriday,
	//
	@FlyElement(name="只有折扣", description="Include only invoices where we would get payment discount", dataType=FlyDataType.NONE, entityType="D", printName="只有折扣", fieldLength=0)
	OnlyDiscount,
	//
	@FlyElement(name="只有应付款", description="只包括应付款发票", dataType=FlyDataType.NONE, entityType="D", printName="只有应付款", fieldLength=0)
	OnlyDue,
	//
	@FlyElement(name="Only Sales Invoices", description="Otherwise also Payments and AP Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Only Sales Invoices", fieldLength=0)
	OnlySOTrx,
	//
	@FlyElement(name="星期一", description="可用每个星期一", dataType=FlyDataType.YesNo, entityType="D", printName="周一", fieldLength=1)
	OnMonday,
	//
	@FlyElement(name="星期六", description="可用在星期六", dataType=FlyDataType.YesNo, entityType="D", printName="周六", fieldLength=1)
	OnSaturday,
	//
	@FlyElement(name="星期日", description="可用每个星期日", dataType=FlyDataType.YesNo, entityType="D", printName="周日", fieldLength=1)
	OnSunday,
	//
	@FlyElement(name="星期四", description="可用每个星期四", dataType=FlyDataType.YesNo, entityType="D", printName="周四", fieldLength=1)
	OnThursday,
	//
	@FlyElement(name="星期二", description="可用每个星期二", dataType=FlyDataType.YesNo, entityType="D", printName="周二", fieldLength=1)
	OnTuesday,
	//
	@FlyElement(name="星期三", description="可用每个星期三", dataType=FlyDataType.YesNo, entityType="D", printName="周三", fieldLength=1)
	OnWednesday,
	//
	@FlyElement(name="未结金额", description="未结项目金额", dataType=FlyDataType.Amount, entityType="D", printName="打开", fieldLength=22)
	OpenAmt,
	//
	@FlyElement(name="Open Requests", dataType=FlyDataType.NONE, entityType="D", printName="Open Requests", fieldLength=0)
	OpenRequests,
	//
	@FlyElement(name="运算元 1", description="首先运算元为计算", dataType=FlyDataType.Table, entityType="D", printName="运算元 1", fieldLength=22)
	Oper_1_ID,
	//
	@FlyElement(name="运算元 2", description="Second operand for calculation", dataType=FlyDataType.Table, entityType="D", printName="运算元 2", fieldLength=22)
	Oper_2_ID,
	//
	@FlyElement(name="Operating System", description="Operating System Info", dataType=FlyDataType.String, entityType="D", printName="Operating System", fieldLength=255)
	OperatingSystemInfo,
	//
	@FlyElement(name="操作", dataType=FlyDataType.List, entityType="D", printName="操作", fieldLength=2)
	Operation,
	//
	@FlyElement(name="Opportunity Amount", description="The estimated value of this opportunity.", dataType=FlyDataType.NONE, entityType="D", printName="Opportunity Amount", fieldLength=0)
	OpportunityAmt,
	//
	@FlyElement(name="Opportunity by Campaign", dataType=FlyDataType.NONE, entityType="D", printName="Opportunity by Campaign", fieldLength=0)
	OpportunityCampaign,
	//
	@FlyElement(name="在线处理", description="This payment can be processed online", help="The Online Processing indicates if the payment can be processed online.", dataType=FlyDataType.Button, entityType="D", printName="在线处理", fieldLength=1)
	OProcessing,
	//
	@FlyElement(name="选择-外出日期", description="Date the contact opted out", help="If the field has a date, the customer opted out (unsubscribed) and cannot receive mails for the Interest Area", dataType=FlyDataType.Date, entityType="D", printName="选择-在外", fieldLength=7)
	OptOutDate,
	//
	@FlyElement(name="SQL的Order By子句", description="Fully qualified ORDER BY clause", help="The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection", dataType=FlyDataType.Text, entityType="D", printName="SQL的Order By子句", fieldLength=2000)
	OrderByClause,
	//
	@FlyElement(name="Order Info", dataType=FlyDataType.String, entityType="D", printName="Order Info", fieldLength=60)
	OrderInfo,
	//
	@FlyElement(name="定单邮件本文", description="Email text used for sending order acknowledgements or quotations", help="Standard email template used to send acknowledgements or quotations as attachments.", dataType=FlyDataType.Table, entityType="D", printName="定单邮件本文", fieldLength=22)
	Order_MailText_ID,
	//
	@FlyElement(name="最小量定单数量", description="在 UOM 中的最小量定单量", help="The Minimum Order Quantity indicates the smallest quantity of this product which can be ordered.", dataType=FlyDataType.Quantity, entityType="D", printName="最小量定单数量", fieldLength=22)
	Order_Min,
	//
	@FlyElement(name="定单包装数量", description="Package order size in UOM (e.g. order set of 5 units)", help="The Order Pack Quantity indicates the number of units in each pack of this product.", dataType=FlyDataType.Quantity, entityType="D", printName="定单包装数量", fieldLength=22)
	Order_Pack,
	//
	@FlyElement(name="定单打印格式", description="Print Format for Orders, Quotes, Offers", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="定单打印格式", fieldLength=22)
	Order_PrintFormat_ID,
	//
	@FlyElement(name="Order Type", description="Type of Order: MRP records grouped by source (Sales Order, Purchase Order, Distribution Order, Requisition)", dataType=FlyDataType.String, entityType="D", printName="Order Type", fieldLength=510)
	OrderType,
	//
	@FlyElement(name="组织 列", description="Fully qualified Organization column (AD_Org_ID)", help="The Organization Column indicates the organization to be used in calculating this measurement.", dataType=FlyDataType.String, entityType="D", printName="组织 列", fieldLength=60)
	OrgColumn,
	//
	@FlyElement(name="机构", description="Organizational entity within client", help="An organization is a unit of your client or legal entity - examples are store, department.", dataType=FlyDataType.Table, entityType="D", printName="机构", fieldLength=22)
	Org_ID,
	//
	@FlyElement(name="组织 位置", description="Organization Location Address", dataType=FlyDataType.Location, entityType="D", printName="组织 位置", fieldLength=22)
	Org_Location_ID,
	//
	@FlyElement(name="Organization Name", description="Name of the Organization", dataType=FlyDataType.String, entityType="D", printName="Org Name", fieldLength=60)
	OrgName,
	//
	@FlyElement(name="交易机构关键字", description="Key of the Transaction Organization", dataType=FlyDataType.String, entityType="D", printName="交易机构关键字", fieldLength=40)
	OrgTrxValue,
	//
	@FlyElement(name="机构 关键字", description="机构的关键字", dataType=FlyDataType.String, entityType="D", printName="机构 关键字", fieldLength=40)
	OrgValue,
	//
	@FlyElement(name="原交易ID", description="原交易ID", help="The Original Transaction ID is used for reversing transactions and indicates the transaction that has been reversed.", dataType=FlyDataType.String, entityType="D", printName="原Trx ID", fieldLength=20)
	Orig_TrxID,
	//
	@FlyElement(name="操作系统命令", description="操作系统命令", help="The OS Command is for optionally defining a command to that will be part of this task.  For example it can be used to starting a back up process or performing a file transfer.", dataType=FlyDataType.String, entityType="D", printName="操作系统命令", fieldLength=2000)
	OS_Command,
	//
	@FlyElement(name="On Screen Keyboard layout", description="The key layout to use for on screen keyboard for text fields.", help="If empty, the on screen keyboard will not be used.", dataType=FlyDataType.Table, entityType="D", printName="On Screen Keyboard layout", fieldLength=22)
	OSK_KeyLayout_ID,
	//
	@FlyElement(name="On Screen Number Pad layout", description="The key layout to use for on screen number pad for numeric fields.", help="If empty, the on screen numberpad will not be used.", dataType=FlyDataType.Table, entityType="D", printName="On Screen Number Pad layout", fieldLength=22)
	OSNP_KeyLayout_ID,
	//
	@FlyElement(name="Other Clause", description="Other SQL Clause", help="Any other complete clause like GROUP BY, HAVING, ORDER BY, etc. after WHERE clause.", dataType=FlyDataType.Text, entityType="D", printName="Other Clause", fieldLength=2000)
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
	@FlyElement(name=" 警报存储天数", description="Send email alert after number of days overdue (0=no alerts)", help="Send an email alert after the item is overdue. If set to zero, no alert is sent.", dataType=FlyDataType.Integer, entityType="D", printName="Alert days overdue", fieldLength=22)
	OverdueAlertDays,
	//
	@FlyElement(name="在天之后扩大超储的", description="Escalation to superior after number of overdue days", help="The item will be escalated and assigned to the supervisor after the number of days overdue.", dataType=FlyDataType.Integer, entityType="D", printName="在天之后扩大", fieldLength=22)
	OverdueAssignDays,
	//
	@FlyElement(name="Overline Stroke Type", dataType=FlyDataType.List, entityType="D", printName="Overline Stroke Type", fieldLength=5)
	OverlineStrokeType,
	//
	@FlyElement(name="Overtime Amount", description="Hourly Overtime Rate", help="Hourly Amount without Benefits and Employer overhead", dataType=FlyDataType.Amount, entityType="D", printName="Overtime Amount", fieldLength=22)
	OvertimeAmt,
	//
	@FlyElement(name="Overtime Cost", description="Hourly Overtime Cost", help="Hourly Amount with Benefits and Employer overhead", dataType=FlyDataType.CostsPrices, entityType="D", printName="Overtime Cost", fieldLength=22)
	OvertimeCost,
	//
	@FlyElement(name="多于或少于付款金额", description="Over-Payment (unallocated) or Under-Payment (partial payment) Amount", help="Overpayments (negative) are unallocated amounts and allow you to receive money for more than the particular invoice. 	Underpayments (positive) is a partial payment for the invoice. You do not write off the unpaid amount.", dataType=FlyDataType.Amount, entityType="D", printName="多于或少于付款金额", fieldLength=22)
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
	@FlyElement(name="成果", description="经营成果", help="The Achievement identifies a unique task that is part of an overall performance goal.", dataType=FlyDataType.ID, entityType="D", printName="成果", fieldLength=22)
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
	@FlyElement(name="标明网址的页数", dataType=FlyDataType.URL, entityType="D", printName="标明网址的页数", fieldLength=120)
	PageURL,
	//
	@FlyElement(name="目标", description="经营目标", help="The Performance Goal indicates what this users performance will be measured against.", dataType=FlyDataType.ID, entityType="D", printName="目标", fieldLength=22)
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
	@FlyElement(name="已支付金额", dataType=FlyDataType.Amount, entityType="D", printName="支付", fieldLength=22)
	PaidAmt,
	//
	@FlyElement(name="Paid Until", description="Subscription is paid/valid until this date", dataType=FlyDataType.Date, entityType="D", printName="Paid Until", fieldLength=7)
	PaidUntilDate,
	//
	@FlyElement(name="测量计算", description="Calculation method for measuring performance", help="The Measure Calculation indicates the method of measuring performance.", dataType=FlyDataType.TableDirect, entityType="D", printName="测量计算", fieldLength=22)
	PA_MeasureCalc_ID,
	//
	@FlyElement(name="度量", description="Concrete Performance Measurement", help="The Measure identifies a concrete, measurable indicator of performance.  For example, sales dollars, prospects contacted.", dataType=FlyDataType.TableDirect, entityType="D", printName="度量", fieldLength=22)
	PA_Measure_ID,
	//
	@FlyElement(name="Period Type", description="PA Period Type", help="The Period Type to report on: Period, Year, Total or Natural. Natural = Year for P & L accounts, Total for Balance Sheet accounts.", dataType=FlyDataType.List, entityType="D", printName="Period Type", fieldLength=1)
	PAPeriodType,
	//
	@FlyElement(name="Default Parameter", description="Default value of the parameter", help="The default value can be a variable like @#Date@ ", dataType=FlyDataType.String, entityType="D", printName="Default Parameter", fieldLength=255)
	ParameterDefault,
	//
	@FlyElement(name="参数名字", dataType=FlyDataType.String, entityType="D", printName="参数名字", fieldLength=60)
	ParameterName,
	//
	@FlyElement(name="Parameter Type", dataType=FlyDataType.NONE, entityType="D", printName="Parameter Type", fieldLength=0)
	ParameterType,
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
	@FlyElement(name="父类帐户", description="父类帐户", dataType=FlyDataType.Table, entityType="D", printName="父类帐户", fieldLength=22)
	ParentElementValue_ID,
	//
	@FlyElement(name="父类", description="实体的父类", help="The Parent indicates the value used to represent a summary level or report to level for a record", dataType=FlyDataType.ID, entityType="D", printName="父类", fieldLength=22)
	Parent_ID,
	//
	@FlyElement(name="Parent Menu", dataType=FlyDataType.Table, entityType="D", printName="Parent Menu", fieldLength=10)
	ParentMenu_ID,
	//
	@FlyElement(name="上级机构", description="上级(管理)机构", help="Parent Organization - the next level in the organizational hierarchy.", dataType=FlyDataType.Table, entityType="D", printName="上级机构", fieldLength=22)
	Parent_Org_ID,
	//
	@FlyElement(name="父类税", description="Parent Tax indicates a tax that is made up of multiple taxes", help="The Parent Tax indicates a tax that is a reference for multiple taxes.  This allows you to charge multiple taxes on a document by entering the Parent Tax", dataType=FlyDataType.Table, entityType="D", printName="父类税", fieldLength=22)
	Parent_Tax_ID,
	//
	@FlyElement(name="父类关键字", description="是否父类关键字", dataType=FlyDataType.String, entityType="D", printName="父类关键字", fieldLength=40)
	ParentValue,
	//
	@FlyElement(name="报表列", description="在报表中的列", dataType=FlyDataType.ID, entityType="D", printName="报表列", fieldLength=22)
	PA_ReportColumn_ID,
	//
	@FlyElement(name="报表列组合", description="Collection of Columns for Report", help="The Report Column Set identifies the columns used in a Report.", dataType=FlyDataType.TableDirect, entityType="D", printName="报表列组合", fieldLength=22)
	PA_ReportColumnSet_ID,
	//
	@FlyElement(name="Report Cube", description="Define reporting cube for pre-calculation of summary accounting data.", help="Summary data will be generated for each period of the selected calendar, grouped by the selected dimensions..", dataType=FlyDataType.ID, entityType="D", printName="Report Cube", fieldLength=22)
	PA_ReportCube_ID,
	//
	@FlyElement(name="财务报表", description="财务报表", dataType=FlyDataType.ID, entityType="D", printName="财务报表", fieldLength=22)
	PA_Report_ID,
	//
	@FlyElement(name="报表行", dataType=FlyDataType.ID, entityType="D", printName="报表行", fieldLength=22)
	PA_ReportLine_ID,
	//
	@FlyElement(name="报表行组合", dataType=FlyDataType.TableDirect, entityType="D", printName="报表行组合", fieldLength=22)
	PA_ReportLineSet_ID,
	//
	@FlyElement(name="报表来源", description="Restriction of what will be shown in Report Line", dataType=FlyDataType.ID, entityType="D", printName="报表来源", fieldLength=22)
	PA_ReportSource_ID,
	//
	@FlyElement(name="Parse Statement", description="Select if the SQL statement should be parsed based on terminating semi-colons.", help="Deselect if the SQL statement provided is a function definition (CREATE OR REPLACE FUNCTION...) rather than a collection of statements.  This prevents parsing of the function based on semi-colons which can occur in the function definition.  Also deselect this with single sql statements that have semi-colons in text within the statement.", dataType=FlyDataType.YesNo, entityType="D", printName="Parse", fieldLength=1)
	Parse,
	//
	@FlyElement(name="业务伙伴ID", description="Partner ID for the Payment Processor", dataType=FlyDataType.String, entityType="D", printName="业务伙伴ID", fieldLength=60)
	PartnerID,
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
	@FlyElement(name="产品资产", description="Account for Product Asset (Inventory)", help="The Product Asset Account indicates the account used for valuing this a product in inventory.", dataType=FlyDataType.Account, entityType="D", printName="产品资产", fieldLength=22)
	P_Asset_Acct,
	//
	@FlyElement(name="口令", description="任意长度的口令(区分大小写)", help="The Password indicates the Password for this User Id.  Passwords are required to identify authorized users.", dataType=FlyDataType.String, entityType="D", printName="口令", fieldLength=1024)
	Password,
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
	@FlyElement(name="付款金额", description="正被支付的金额", help="Indicates the amount this payment is for.  The payment amount can be for single or multiple invoices or a partial payment for an invoice.", dataType=FlyDataType.Amount, entityType="D", printName="付款金额", fieldLength=22)
	PayAmt,
	//
	@FlyElement(name="Payment BPartner", description="Business Partner responsible for the payment", dataType=FlyDataType.ID, entityType="D", printName="Payment BPartner", fieldLength=22)
	Pay_BPartner_ID,
	//
	@FlyElement(name="付款日期", description="付款日期", help="The Payment Date indicates the date the payment was made.", dataType=FlyDataType.Date, entityType="D", printName="付款日期", fieldLength=7)
	PayDate,
	//
	@FlyElement(name="付款折扣费用", description="Payment Discount Expense Account", help="Indicates the account to be charged for payment discount expenses.", dataType=FlyDataType.Account, entityType="D", printName="支付折扣费用", fieldLength=22)
	PayDiscount_Exp_Acct,
	//
	@FlyElement(name="付款折扣收入", description="Payment Discount Revenue Account", help="Indicates the account to be charged for payment discount revenues.", dataType=FlyDataType.Account, entityType="D", printName="支付折扣收入", fieldLength=22)
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
	@FlyElement(name="付款规则", description="你如何支付发票", help="The Payment Rule indicates the method of invoice payment.", dataType=FlyDataType.List, entityType="D", printName="付款规则", fieldLength=1)
	PaymentRule,
	//
	@FlyElement(name="付款规则", description="采购付款选项", help="The Payment Rule indicates the method of purchase payment.", dataType=FlyDataType.List, entityType="D", printName="付款规则", fieldLength=1)
	PaymentRulePO,
	//
	@FlyElement(name="付款条款", description="付款条款", dataType=FlyDataType.String, entityType="D", printName="付款条款", fieldLength=60)
	PaymentTerm,
	//
	@FlyElement(name="付款条款注解", description="付款条款注解", dataType=FlyDataType.String, entityType="D", printName="付款条款注解", fieldLength=2000)
	PaymentTermNote,
	//
	@FlyElement(name="付款条款关键字", description="付款条款的关键字", dataType=FlyDataType.String, entityType="D", printName="付款条款关键字", fieldLength=40)
	PaymentTermValue,
	//
	@FlyElement(name="付款处理器类", description="付款处理器java类", help="Payment Processor class identifies the Java class used to process payments", dataType=FlyDataType.String, entityType="D", printName="付款处理器类", fieldLength=60)
	PayProcessorClass,
	//
	@FlyElement(name="产品销售成本", description="Account for Cost of Goods Sold", help="The Product COGS Account indicates the account used when recording costs associated with this product.", dataType=FlyDataType.Account, entityType="D", printName="产品销售成本", fieldLength=22)
	P_COGS_Acct,
	//
	@FlyElement(name="Cost Adjustment", description="Product Cost Adjustment Account", help="Account used for posting product cost adjustments (e.g. landed costs)", dataType=FlyDataType.Account, entityType="D", printName="Cost Adjustment", fieldLength=10)
	P_CostAdjustment_Acct,
	//
	@FlyElement(name="处理日期", dataType=FlyDataType.DateTime, entityType="D", printName="处理日期", fieldLength=7)
	P_Date,
	//
	@FlyElement(name="处理日期到", dataType=FlyDataType.DateTime, entityType="D", printName="P 约会到", fieldLength=7)
	P_Date_To,
	//
	@FlyElement(name="Confidentiality", description="Type of Confidentiality", dataType=FlyDataType.NONE, entityType="D", printName="Confidentiality", fieldLength=0)
	p_DefaultConfidentiality,
	//
	@FlyElement(name="User Importance", description="Priority of the issue for the User", dataType=FlyDataType.NONE, entityType="D", printName="User Importance", fieldLength=0)
	p_DefaultPriority,
	//
	@FlyElement(name="百分比", description="扣留百分比", help="The Percent indicates the percentage used for withholding.", dataType=FlyDataType.Number, entityType="D", printName="百分比", fieldLength=22)
	Percent,
	//
	@FlyElement(name="百分比", description="整个的金额百分比", help="Percentage of an amount (up to 100)", dataType=FlyDataType.Number, entityType="D", printName="百分比", fieldLength=22)
	Percentage,
	//
	@FlyElement(name="Total Percent", description="Sum of the Percent details ", dataType=FlyDataType.Number, entityType="D", printName="Total Percent", fieldLength=22)
	PercentTotal,
	//
	@FlyElement(name="会计期动作", description="该分期被采取的动作", help="The Period Action indicates the action to be taken for this period.  For example 'Close Period' or 'Open Period'.", dataType=FlyDataType.List, entityType="D", printName="会计期动作", fieldLength=1)
	PeriodAction,
	//
	@FlyElement(name="会计期号", description="唯一的分期数字", help="The Period No identifies a specific period for this year. Each period is defined by a start and end date.  Date ranges for a calendar and year cannot overlap.", dataType=FlyDataType.Integer, entityType="D", printName="会计期号", fieldLength=22)
	PeriodNo,
	//
	@FlyElement(name="未来天数", description="Number of days to be able to post to a future date (based on system date)", help="If Automatic Period Control is enabled, the current period is calculated based on the system date and you can always post to all days in the current period.  Future Days enable to post to future periods. E.g. today is Apr 15th and Future Days is set to 30, you can post up to May 15th", dataType=FlyDataType.Integer, entityType="D", printName="未来天数", fieldLength=22)
	Period_OpenFuture,
	//
	@FlyElement(name="历史天数", description="Number of days to be able to post in the past (based on system date)", help="If Automatic Period Control is enabled, the current period is calculated based on the system date and you can always post to all days in the current period.  History Days enable to post to previous periods.  E.g. today is May 15th and History Days is set to 30, you can post back to April 15th", dataType=FlyDataType.Integer, entityType="D", printName="历史天数", fieldLength=22)
	Period_OpenHistory,
	//
	@FlyElement(name="会计期状态", description="该分期当前状态", help="The Period Status indicates the current status for this period.  For example 'Closed', 'Open', 'Never Opened'.", dataType=FlyDataType.List, entityType="D", printName="会计期状态", fieldLength=1)
	PeriodStatus,
	//
	@FlyElement(name="会计期类型", description="会计期类型", help="The Period Type indicates the type (Standard or Adjustment) of period.", dataType=FlyDataType.List, entityType="D", printName="会计期类型", fieldLength=1)
	PeriodType,
	//
	@FlyElement(name="Error Folder", dataType=FlyDataType.NONE, entityType="D", printName="Error Folder", fieldLength=0)
	p_ErrorFolder,
	//
	@FlyElement(name="产品费用", description="产品费用帐户", help="The Product Expense Account indicates the account used to record expenses associated with this product.", dataType=FlyDataType.Account, entityType="D", printName="产品费用", fieldLength=22)
	P_Expense_Acct,
	//
	@FlyElement(name="电话", description="电话号码", help="The Phone field identifies a telephone number", dataType=FlyDataType.String, entityType="D", printName="电话", fieldLength=40)
	Phone,
	//
	@FlyElement(name="可选电话", description="Identifies an alternate telephone number.", help="The 2nd Phone field identifies an alternate telephone number.", dataType=FlyDataType.String, entityType="D", printName="可选电话", fieldLength=40)
	Phone2,
	//
	@FlyElement(name="自提日期", description="Date Time when picked for Shipment", dataType=FlyDataType.DateTime, entityType="D", printName="自提日期", fieldLength=7)
	PickDate,
	//
	@FlyElement(name="Picked Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Picked Quantity", fieldLength=22)
	PickedQty,
	//
	@FlyElement(name="处理ID", dataType=FlyDataType.ID, entityType="D", printName="P ID", fieldLength=22)
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
	@FlyElement(name="发票价格差额", description="Difference between Costs and Invoice Price (IPV)", help="The Invoice Price Variance is used reflects the difference between the current Costs and the Invoice Price.", dataType=FlyDataType.Account, entityType="D", printName="发票价格差额", fieldLength=22)
	P_InvoicePriceVariance_Acct,
	//
	@FlyElement(name="项目资产", description="项目资产帐户", help="The Project Asset account is the account used as the final asset account in capital projects", dataType=FlyDataType.Account, entityType="D", printName="项目资产", fieldLength=22)
	PJ_Asset_Acct,
	//
	@FlyElement(name="进步的任务", description="在建工程帐户", help="The Work in Process account is the account used in capital projects until the project is completed", dataType=FlyDataType.Account, entityType="D", printName="WIP 帐户", fieldLength=22)
	PJ_WIP_Acct,
	//
	@FlyElement(name="PK_Status", dataType=FlyDataType.String, entityType="D", printName="PK_Status", fieldLength=44)
	PK_Status,
	//
	@FlyElement(name="Package Version", dataType=FlyDataType.String, entityType="D", printName="Package Version", fieldLength=40)
	PK_Version,
	//
	@FlyElement(name="已计划金额", description="Planned amount for this project", help="The Planned Amount indicates the anticipated amount for this project or project line.", dataType=FlyDataType.Amount, entityType="D", printName="已计划 Amt", fieldLength=22)
	PlannedAmt,
	//
	@FlyElement(name="已计划差额 %", description="Project's planned margin as a percentage", help="The Planned Margin Percentage indicates the anticipated margin percentage for this project or project line", dataType=FlyDataType.Number, entityType="D", printName="Planned Margin", fieldLength=22)
	PlannedMargin,
	//
	@FlyElement(name="已计划差额", description="Project's planned margin amount", help="The Planned Margin Amount indicates the anticipated margin amount for this project or project line.", dataType=FlyDataType.Amount, entityType="D", printName="已计划差额", fieldLength=22)
	PlannedMarginAmt,
	//
	@FlyElement(name="已计划价格", description="Planned price for this project line", help="The Planned Price indicates the anticipated price for this project line.", dataType=FlyDataType.CostsPrices, entityType="D", printName="已计划价格", fieldLength=22)
	PlannedPrice,
	//
	@FlyElement(name="Generate Planned Production Report", dataType=FlyDataType.Button, entityType="D", printName="Generate Planned Production Report", fieldLength=1)
	PlannedProductionReport,
	//
	@FlyElement(name="已计划数量", description="Planned quantity for this project", help="The Planned Quantity indicates the anticipated quantity for this project or project line", dataType=FlyDataType.Quantity, entityType="D", printName="已计划数量", fieldLength=22)
	PlannedQty,
	//
	@FlyElement(name="Platform Info", description="Information about Server and Client Platform", help="Include information on Server, Network [Operating System, RAM, Disk, CPUs] and (number of) Clients.", dataType=FlyDataType.Text, entityType="D", printName="Platform", fieldLength=255)
	PlatformInfo,
	//
	@FlyElement(name="信息处理", dataType=FlyDataType.String, entityType="D", printName="P Msg", fieldLength=2000)
	P_Msg,
	//
	@FlyElement(name="程序号", dataType=FlyDataType.Number, entityType="D", printName="程序号", fieldLength=22)
	P_Number,
	//
	@FlyElement(name="程序数字到", dataType=FlyDataType.Number, entityType="D", printName="目标程序号", fieldLength=22)
	P_Number_To,
	//
	@FlyElement(name="采购定单描述", description="在采购定单屏幕中的描述", dataType=FlyDataType.String, entityType="D", printName="采购定单描述", fieldLength=255)
	PO_Description,
	//
	@FlyElement(name="采购定单折扣模式", description="Schema to calculate the purchase trade discount percentage", dataType=FlyDataType.Table, entityType="D", printName="采购定单折扣模式", fieldLength=22)
	PO_DiscountSchema_ID,
	//
	@FlyElement(name="采购定单帮助", description="帮助为采购定单审查", dataType=FlyDataType.Text, entityType="D", printName="采购定单帮助", fieldLength=2000)
	PO_Help,
	//
	@FlyElement(name="采购定单名字", description="采购定单屏幕上的名字", dataType=FlyDataType.String, entityType="D", printName="采购定单名字", fieldLength=60)
	PO_Name,
	//
	@FlyElement(name="采购定单数字", description="采购定单数字", help="The PO Number indicates the number assigned to a purchase order", dataType=FlyDataType.String, entityType="D", printName="采购定单数字", fieldLength=60)
	PONum,
	//
	@FlyElement(name="采购定单付款条款", description="Payment rules for a purchase order", help="The PO Payment Term indicates the payment term that will be used when this purchase order becomes an invoice.", dataType=FlyDataType.Table, entityType="D", printName="采购定单付款条款", fieldLength=22)
	PO_PaymentTerm_ID,
	//
	@FlyElement(name="采购价目表", description="Price List used by this Business Partner", help="Identifies the price list used by a Vendor for products purchased by this organization.", dataType=FlyDataType.Table, entityType="D", printName="采购价目表", fieldLength=22)
	PO_PriceList_ID,
	//
	@FlyElement(name="采购定单打印名字", description="Print name on PO Screens Reports", dataType=FlyDataType.String, entityType="D", printName="采购定单打印", fieldLength=60)
	PO_PrintName,
	//
	@FlyElement(name="定单引用", description="Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner", help="The business partner order reference is the order reference for this specific transaction; Often Purchase Order numbers are given to print on Invoices for easier reference.  A standard number can be defined in the Business Partner (Customer) window.", dataType=FlyDataType.String, entityType="D", printName="定单引用", fieldLength=20)
	POReference,
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
	@FlyElement(name="过帐实际值", description="可过帐实际值", help="The Post Actual indicates if actual values can be posted to this element value.", dataType=FlyDataType.YesNo, entityType="D", printName="过帐实际值", fieldLength=1)
	PostActual,
	//
	@FlyElement(name="邮编", description="邮政编码", help="The Postal Code field identifies the postal code for this entity's address.", dataType=FlyDataType.String, entityType="D", printName="邮编", fieldLength=10)
	Postal,
	//
	@FlyElement(name="-", description="附加的邮政编码", help="The Additional ZIP or Postal Code identifies, if appropriate, any additional Postal Code information.", dataType=FlyDataType.String, entityType="D", printName="-", fieldLength=10)
	Postal_Add,
	//
	@FlyElement(name="ZIP To", description="Postal code to", help="Conecutive range to", dataType=FlyDataType.String, entityType="D", printName="ZIP To", fieldLength=10)
	Postal_To,
	//
	@FlyElement(name="过帐预算", description="预算值可被过帐", help="The Post Budget indicates if budget values can be posted to this element value.", dataType=FlyDataType.YesNo, entityType="D", printName="过帐预算", fieldLength=1)
	PostBudget,
	//
	@FlyElement(name="已过帐", description="过帐状态", help="The Posted field indicates the status of the Generation of General Ledger Accounting Lines ", dataType=FlyDataType.Button, entityType="D", printName="已过帐", fieldLength=1)
	Posted,
	//
	@FlyElement(name="过帐债权", description="Post commitments to this account", dataType=FlyDataType.YesNo, entityType="D", printName="过帐债权", fieldLength=1)
	PostEncumbrance,
	//
	@FlyElement(name="过帐类型", description="The type of amount that this journal updated", help="The Posting Type indicates the type of amount (Actual, Encumbrance, Budget) this journal updated.", dataType=FlyDataType.List, entityType="D", printName="过帐类型", fieldLength=1)
	PostingType,
	//
	@FlyElement(name="动作 SQL 划处理", description="Process Row by Row (not Set processing)", dataType=FlyDataType.Text, entityType="D", printName="动作 SQL 划处理", fieldLength=2000)
	PostProcessing,
	//
	@FlyElement(name="过帐统计数量", description="Post statistical quantities to this account?", dataType=FlyDataType.YesNo, entityType="D", printName="过帐统计数量", fieldLength=1)
	PostStatistical,
	//
	@FlyElement(name="潜在价值", description="总收入预期", help="The Potential Life Time Value is the anticipated revenue to be generated by this Business Partner.", dataType=FlyDataType.Amount, entityType="D", printName="潜在价值", fieldLength=22)
	PotentialLifeTimeValue,
	//
	@FlyElement(name="采购定单视窗", description="采购定单视窗", help="Window for Purchase Order (AP) Zooms", dataType=FlyDataType.Table, entityType="D", printName="采购定单视窗", fieldLength=22)
	PO_Window_ID,
	//
	@FlyElement(name="采购价格差额", description="Difference between Standard Cost and Purchase Price (PPV)", help="The Purchase Price Variance is used in Standard Costing. It reflects the difference between the Standard Cost and the Purchase Order Price.", dataType=FlyDataType.Account, entityType="D", printName="采购价格差额", fieldLength=22)
	P_PurchasePriceVariance_Acct,
	//
	@FlyElement(name="PPV 抵销", description="Purchase Price Variance Offset Account", help="Offset account for standard costing purchase price variances. The counter account is Product PPV.", dataType=FlyDataType.Account, entityType="D", printName="PPV 抵销", fieldLength=22)
	PPVOffset_Acct,
	//
	@FlyElement(name="Preference Level", description="Determines what preferences the user can set", help="Preferences allow you to define default values.  If set to None, you cannot set any preference nor value preference. Only if set to Client, you can see the Record Info Change Log.", dataType=FlyDataType.List, entityType="D", printName="Preference Level", fieldLength=1)
	PreferenceType,
	//
	@FlyElement(name="Preferred Width", description="Preferred width in pixels", dataType=FlyDataType.Integer, entityType="D", printName="Preferred Width", fieldLength=10)
	PreferredWidth,
	//
	@FlyElement(name="前缀", description="Prefix before the sequence number", help="The Prefix indicates the characters to print in front of the document number.", dataType=FlyDataType.String, entityType="D", printName="前缀", fieldLength=255)
	Prefix,
	//
	@FlyElement(name="Pre Period Name", dataType=FlyDataType.NONE, entityType="D", printName="Pre Period Name", fieldLength=0)
	PrePeriodName,
	//
	@FlyElement(name="动作 SQL 设定处理", description="Process SQL Set (not row-by-row)", dataType=FlyDataType.Text, entityType="D", printName="动作 SQL 设定处理", fieldLength=2000)
	PreProcessing,
	//
	@FlyElement(name="Request Folder", dataType=FlyDataType.NONE, entityType="D", printName="Request Folder", fieldLength=0)
	p_RequestFolder,
	//
	@FlyElement(name="产品收入", description="Account for Product Revenue (Sales Account)", help="The Product Revenue Account indicates the account used for recording sales revenue for this product.", dataType=FlyDataType.Account, entityType="D", printName="产品收入", fieldLength=22)
	P_Revenue_Acct,
	//
	@FlyElement(name="价格", description="价格", help="The Price indicates the Price for a product or service.", dataType=FlyDataType.CostsPrices, entityType="D", printName="价格", fieldLength=22)
	Price,
	//
	@FlyElement(name="单位价格", description="实际价格 ", help="The Actual or Unit Price indicates the Price for a product in source currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="单价", fieldLength=22)
	PriceActual,
	//
	@FlyElement(name="Cost Price", description="Price per Unit of Measure including all indirect costs (Freight, etc.)", help="Optional Purchase Order Line cost price.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Cost Price", fieldLength=22)
	PriceCost,
	//
	@FlyElement(name="有效的日期价格", description="有效的日期价格", help="The Price Effective indicates the date this price is for. This allows you to enter future prices for products which will become effective when appropriate.", dataType=FlyDataType.Date, entityType="D", printName="有效的", fieldLength=7)
	PriceEffective,
	//
	@FlyElement(name="Price", description="Price Entered - the price based on the selected UoM", help="The price entered is converted to the actual price based on the UoM conversion", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price", fieldLength=22)
	PriceEntered,
	//
	@FlyElement(name="List Prive", description="Entered List Price", help="Price List converted to entered UOM", dataType=FlyDataType.CostsPrices, entityType="D", printName="List Price", fieldLength=22)
	PriceEnteredList,
	//
	@FlyElement(name="Price Invoiced", description="The priced invoiced to the customer (in the currency of the customer's AR price list) - 0 for default price", help="The invoiced price is derived from the Invoice Price entered and can be overwritten.  If the price is 0, the default price on the customer's invoice is used.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price Invoiced", fieldLength=22)
	PriceInvoiced,
	//
	@FlyElement(name="最近发票价格", description="Price of the last invoice for the product", help="The Last Invoice Price indicates the last price paid (per the invoice) for this product.", dataType=FlyDataType.CostsPrices, entityType="D", printName="最近发票价格", fieldLength=22)
	PriceLastInv,
	//
	@FlyElement(name="最近采购定单价格", description="Price of the last purchase order for the product", help="The Last PO Price indicates the last price paid (per the purchase order) for this product.", dataType=FlyDataType.CostsPrices, entityType="D", printName="最近采购定单价格", fieldLength=22)
	PriceLastPO,
	//
	@FlyElement(name="限制价格", description="产品的最低价格", help="The Price Limit indicates the lowest price for a product stated in the Price List Currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="限制价格", fieldLength=22)
	PriceLimit,
	//
	@FlyElement(name="限制价格值", description="有限制价格的值", dataType=FlyDataType.CostsPrices, entityType="D", printName="限制价格值", fieldLength=22)
	PriceLimitAmt,
	//
	@FlyElement(name="公开报价", description="公开报价", help="The List Price is the official List Price in the document currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="公开报价", fieldLength=22)
	PriceList,
	//
	@FlyElement(name="列表价格", description="附价格列表估价", dataType=FlyDataType.CostsPrices, entityType="D", printName="列表价格", fieldLength=22)
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
	@FlyElement(name="采购定单价格", description="基于采购定单的价格", help="The PO Price indicates the price for a product per the purchase order.", dataType=FlyDataType.CostsPrices, entityType="D", printName="采购定单价格", fieldLength=22)
	PricePO,
	//
	@FlyElement(name="采购定单价格", description="附采购定单估价", dataType=FlyDataType.CostsPrices, entityType="D", printName="采购定单价格", fieldLength=22)
	PricePOAmt,
	//
	@FlyElement(name="Price Precision", description="Precision (number of decimals) for the Price", help="The prices of the price list are rounded to the precision entered.  This allows to have prices with below currency precision, e.g. $0.005. Enter the number of decimals or -1 for no rounding.", dataType=FlyDataType.Integer, entityType="D", printName="Price Precision", fieldLength=22)
	PricePrecision,
	//
	@FlyElement(name="Price Reimbursed", description="The reimbursed price (in currency of the employee's AP price list)", help="The reimbursed price is derived from the converted price and can be overwritten when approving the expense report.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price Reimbursed", fieldLength=22)
	PriceReimbursed,
	//
	@FlyElement(name="标准价格", description="标准价格", help="The Standard Price indicates the standard or normal price for a product on this price list", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准价格", fieldLength=22)
	PriceStd,
	//
	@FlyElement(name="标准价格", description="附标准的价格估价", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准价格", fieldLength=22)
	PriceStdAmt,
	//
	@FlyElement(name="区域", description="打印区域", help="打印该项目的区域", dataType=FlyDataType.List, entityType="D", printName="区域", fieldLength=1)
	PrintAreaType,
	//
	@FlyElement(name="Print Document", description="Document to print", dataType=FlyDataType.NONE, entityType="D", printName="Print Document", fieldLength=0)
	PrintDocument,
	//
	@FlyElement(name="打印机名", description="打印机的名字", help="Internal (Opereating System) Name of the Printer; Please mote that the printer name may be different on different clients. Enter a printer name, which applies to ALL clients (e.g. printer on a server). <p>	If none is entered, the default printer is used. You specify your default printer when you log in. You can also change the default printer in Preferences.", dataType=FlyDataType.String, entityType="D", printName="打印机名", fieldLength=40)
	PrinterName,
	//
	@FlyElement(name="格式类型", description="打印格式类型", help="The print format type determines what will be printed.", dataType=FlyDataType.List, entityType="D", printName="格式类型", fieldLength=1)
	PrintFormatType,
	//
	@FlyElement(name="打印文本", description="The label text to be printed on a document or correspondence.", help="The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters.", dataType=FlyDataType.String, entityType="D", printName="文本", fieldLength=60)
	PrintName,
	//
	@FlyElement(name="打印标签后缀", description="The label text to be printed on a document or correspondence after the field", help="The Label to be printed indicates the name that will be printed on a document or correspondence after the field. The max length is 60 characters.", dataType=FlyDataType.String, entityType="D", printName="标签后缀", fieldLength=60)
	PrintNameSuffix,
	//
	@FlyElement(name="Print Unprocessed Entries Only", dataType=FlyDataType.NONE, entityType="D", printName="Print Unprocessed Entries Only", fieldLength=0)
	PrintUnprocessedOnly,
	//
	@FlyElement(name="优先权", description="Indicates if this request is of a high, medium or low priority.", help="The Priority indicates the importance of this request.", dataType=FlyDataType.List, entityType="D", printName="优先权", fieldLength=1)
	Priority,
	//
	@FlyElement(name="Priority Base", description="Base of Priority", help="When deriving the Priority from Importance, the Base is 'added' to the User Importance.", dataType=FlyDataType.List, entityType="D", printName="Priority Base", fieldLength=1)
	PriorityBase,
	//
	@FlyElement(name="相对优先权", description="Where inventory should be picked from first", help="The Relative Priority indicates the location to pick from first if an product is stored in more than one location.  (0 = highest priority)", dataType=FlyDataType.Integer, entityType="D", printName="相对优先权", fieldLength=22)
	PriorityNo,
	//
	@FlyElement(name="优先级", description="文件的优先级", help="The Priority indicates the importance (high, medium, low) of this document", dataType=FlyDataType.List, entityType="D", printName="优先级", fieldLength=1)
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
	@FlyElement(name="产生", dataType=FlyDataType.Button, entityType="D", printName="产生", fieldLength=1)
	ProcCreate,
	//
	@FlyElement(name="过程", description="Name of the Database Procedure", help="The Procedure indicates the name of the database procedure called by this report or process.", dataType=FlyDataType.String, entityType="D", printName="过程", fieldLength=60)
	ProcedureName,
	//
	@FlyElement(name="已处理", description="The document has been processed", help="The Processed checkbox indicates that a document has been processed.", dataType=FlyDataType.YesNo, entityType="D", printName="已处理", fieldLength=1)
	Processed,
	//
	@FlyElement(name="Processed On", description="The date+time (expressed in decimal format) when the document has been processed", help="The ProcessedOn Date+Time save the exact moment (nanoseconds precision if allowed by the DB) when a document has been processed.", dataType=FlyDataType.Number, entityType="D", printName="Processed On", fieldLength=20)
	ProcessedOn,
	//
	@FlyElement(name="现在处理", dataType=FlyDataType.Button, entityType="D", printName="现在处理", fieldLength=1)
	Processing,
	//
	@FlyElement(name="处理日期", dataType=FlyDataType.Date, entityType="D", printName="处理日期", fieldLength=7)
	ProcessingDate,
	//
	@FlyElement(name="产品", dataType=FlyDataType.String, entityType="D", printName="产品", fieldLength=40)
	Product,
	//
	@FlyElement(name="Product Attribute", description="Product Attribute Instance Description", dataType=FlyDataType.String, entityType="D", printName="Product Attribute", fieldLength=2000)
	ProductAttribute,
	//
	@FlyElement(name="Product BOM Key", description="Key of Product BOM", dataType=FlyDataType.String, entityType="D", printName="Product BOM Key", fieldLength=40)
	Product_BOM_Value,
	//
	@FlyElement(name="产品分类关键字", dataType=FlyDataType.String, entityType="D", printName="产品分类关键字", fieldLength=40)
	ProductCategory_Value,
	//
	@FlyElement(name="Product Classification Key", description="The key value for the product classification", help="A product classification is a way to organize products", dataType=FlyDataType.String, entityType="D", printName="Product Classification Key", fieldLength=40)
	ProductClassification_Value,
	//
	@FlyElement(name="Product Class Key", description="The key value for the product class", help="A product class is a way to organize products", dataType=FlyDataType.String, entityType="D", printName="Product Class Key", fieldLength=40)
	ProductClass_Value,
	//
	@FlyElement(name="产品列", description="Fully qualified Product column (M_Product_ID)", help="The Product Column indicates the product to use to use when calculating this measurement.", dataType=FlyDataType.String, entityType="D", printName="产品列", fieldLength=60)
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
	@FlyElement(name="制造数量", description="Quantity of products to produce", help="The Production Quantity identifies the number of products to produce", dataType=FlyDataType.Quantity, entityType="D", printName="制造数量", fieldLength=22)
	ProductionQty,
	//
	@FlyElement(name="Product Name", description="Name of the Product", dataType=FlyDataType.String, entityType="D", printName="Product Name", fieldLength=60)
	ProductName,
	//
	@FlyElement(name="产品类型", description="产品的类型", help="The type of product also determines accounting consequences.", dataType=FlyDataType.List, entityType="D", printName="产品类型", fieldLength=1)
	ProductType,
	//
	@FlyElement(name="产品关键字", description="产品的关键字", dataType=FlyDataType.String, entityType="D", printName="产品关键字", fieldLength=40)
	ProductValue,
	//
	@FlyElement(name="Profile", description="Information to help profiling the system for solving support issues", help="Profile information do not contain sensitive information and are used to support issue detection and diagnostics", dataType=FlyDataType.String, entityType="D", printName="Profile", fieldLength=60)
	ProfileInfo,
	//
	@FlyElement(name="项目余额", description="项目总余额", help="The project balance is the sum of all invoices and payments", dataType=FlyDataType.Amount, entityType="D", printName="项目余额", fieldLength=22)
	ProjectBalanceAmt,
	//
	@FlyElement(name="Project Category", description="Project Category", help="The Project Category determines the behavior of the project:	General - no special accounting, e.g. for Presales or general tracking	Service - no special accounting, e.g. for Service/Charge projects	Work Order - creates Project/Job WIP transactions - ability to issue material	Asset - create Project Asset transactions - ability to issue material	", dataType=FlyDataType.List, entityType="D", printName="Project Category", fieldLength=1)
	ProjectCategory,
	//
	@FlyElement(name="Line Level", description="Project Line Level", help="Level on which Project Lines are maintained", dataType=FlyDataType.List, entityType="D", printName="Line Level", fieldLength=1)
	ProjectLineLevel,
	//
	@FlyElement(name="项目邮件本文", description="Standard text for Project EMails", help="Standard text for Project EMails", dataType=FlyDataType.Table, entityType="D", printName="项目邮件本文", fieldLength=22)
	Project_MailText_ID,
	//
	@FlyElement(name="Project", description="Name of the Project", dataType=FlyDataType.String, entityType="D", printName="Project", fieldLength=60)
	ProjectName,
	//
	@FlyElement(name="Project Phase", description="Name of the Project Phase", dataType=FlyDataType.String, entityType="D", printName="Project Phase", fieldLength=60)
	ProjectPhaseName,
	//
	@FlyElement(name="项目打印格式", description="标准项目打印格式", help="标准项目打印格式", dataType=FlyDataType.Table, entityType="D", printName="项目打印格式", fieldLength=22)
	Project_PrintFormat_ID,
	//
	@FlyElement(name="Project Type", description="Name of the Project Type", dataType=FlyDataType.String, entityType="D", printName="Project Type", fieldLength=60)
	ProjectTypeName,
	//
	@FlyElement(name="项目关键字", description="项目的关键字", dataType=FlyDataType.String, entityType="D", printName="项目关键字", fieldLength=40)
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
	@FlyElement(name="代理地址", description="代理服务器的地址", help="The Proxy Address must be defined if you must pass through a firewall to access your payment processor. ", dataType=FlyDataType.String, entityType="D", printName="代理地址", fieldLength=60)
	ProxyAddress,
	//
	@FlyElement(name="代理注册", description="你的代理服务器注册", help="The Proxy Logon identifies the Logon ID for your proxy server.", dataType=FlyDataType.String, entityType="D", printName="代理注册", fieldLength=60)
	ProxyLogon,
	//
	@FlyElement(name="代理密码", description="你的代理服务器的密码", help="The Proxy Password identifies the password for your proxy server.", dataType=FlyDataType.String, entityType="D", printName="代理密码", fieldLength=60)
	ProxyPassword,
	//
	@FlyElement(name="代理端口", description="你的代理服务器的港口", help="The Proxy Port identifies the port of your proxy server.", dataType=FlyDataType.Integer, entityType="D", printName="代理端口", fieldLength=22)
	ProxyPort,
	//
	@FlyElement(name="Process String", dataType=FlyDataType.String, entityType="D", printName="P String", fieldLength=255)
	P_String,
	//
	@FlyElement(name="Process String To", dataType=FlyDataType.String, entityType="D", printName="P_String_To", fieldLength=255)
	P_String_To,
	//
	@FlyElement(name="批发折扣允许", description="Trade Discount Granted Account", help="The Trade Discount Granted Account indicates the account for granted trade discount in sales invoices", dataType=FlyDataType.Account, entityType="D", printName="批发折扣授与", fieldLength=22)
	P_TradeDiscountGrant_Acct,
	//
	@FlyElement(name="已收到批发折扣", description="Trade Discount Receivable Account", help="The Trade Discount Receivables Account indicates the account for received trade discounts in vendor invoices", dataType=FlyDataType.Account, entityType="D", printName="已收到批发折扣", fieldLength=22)
	P_TradeDiscountRec_Acct,
	//
	@FlyElement(name="Publication Date", description="Date on which this article will / should get published", help="Date on which this article will / should get published", dataType=FlyDataType.DateTime, entityType="D", printName="Publication Date", fieldLength=7)
	PubDate,
	//
	@FlyElement(name="Publish RfQ", dataType=FlyDataType.Button, entityType="D", printName="Publish RfQ", fieldLength=1)
	PublishRfQ,
	//
	@FlyElement(name="发布状态", description="Status of Publication", help="Used for internal documentation", dataType=FlyDataType.List, entityType="D", printName="发布状态", fieldLength=1)
	PublishStatus,
	//
	@FlyElement(name="QM Specification Line", dataType=FlyDataType.ID, entityType="D", printName="QM Specification Line", fieldLength=22)
	QM_SpecificationLine_ID,
	//
	@FlyElement(name="数量", description="数量", help="The Quantity indicates the number of a specific product or item for this document.", dataType=FlyDataType.Amount, entityType="D", printName="数量", fieldLength=22)
	Qty,
	//
	@FlyElement(name="Available Quantity", description="Available Quantity (On Hand - Reserved)", help="Quantity available to promise = On Hand minus Reserved Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Available", fieldLength=22)
	QtyAvailable,
	//
	@FlyElement(name="Backordered", description="Backordered Quantity", help="Calculated: ordered - delivered quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Backordered", fieldLength=22)
	QtyBackOrdered,
	//
	@FlyElement(name="帐册数量", description="订购量", help="The Quantity Book indicates the line count stored in the system for a product in inventory", dataType=FlyDataType.Quantity, entityType="D", printName="已记帐数量", fieldLength=22)
	QtyBook,
	//
	@FlyElement(name="Calculated Quantity", description="Calculated Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Calculated Qty", fieldLength=22)
	QtyCalculated,
	//
	@FlyElement(name="Qty Completed", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Completed", fieldLength=0)
	QtyCompleted,
	//
	@FlyElement(name="计数数量", description="计算了量", help="The Quantity Count indicates the actual inventory count taken for a product in inventory", dataType=FlyDataType.Quantity, entityType="D", printName="计数", fieldLength=22)
	QtyCount,
	//
	@FlyElement(name="QtyCsv", dataType=FlyDataType.Quantity, entityType="D", printName="QtyCsv", fieldLength=131089)
	QtyCsv,
	//
	@FlyElement(name="已配送数量", description="已配送数量", help="The Delivered Quantity indicates the quantity of a product that has been delivered.", dataType=FlyDataType.Quantity, entityType="D", printName="已配送数量", fieldLength=22)
	QtyDelivered,
	//
	@FlyElement(name="Quantity", description="The Quantity Entered is based on the selected UoM", help="The Quantity Entered is converted to base product UoM quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Quantity", fieldLength=22)
	QtyEntered,
	//
	@FlyElement(name="Internal Use Qty", description="Internal Use Quantity removed from Inventory", help="Quantity of product inventory used internally (positive if taken out - negative if returned)", dataType=FlyDataType.Quantity, entityType="D", printName="Internal Use", fieldLength=22)
	QtyInternalUse,
	//
	@FlyElement(name="已开票量", description="已开票量", help="The Invoiced Quantity indicates the quantity of a product that have been invoiced.", dataType=FlyDataType.Quantity, entityType="D", printName="已开票", fieldLength=22)
	QtyInvoiced,
	//
	@FlyElement(name="Lost Sales Qty", description="Quantity of potential sales", help="When an order is closed and there is a difference between the ordered quantity and the delivered (invoiced) quantity is the Lost Sales Quantity.  Note that the Lost Sales Quantity is 0 if you void an order, so close the order if you want to track lost opportunities.  [Void = data entry error - Close = the order is finished]", dataType=FlyDataType.Quantity, entityType="D", printName="Lost Sales Qty", fieldLength=22)
	QtyLostSales,
	//
	@FlyElement(name="Qty Movement Drafted", description="The sum of inOutLines line quantities which are in the Drafted status", help="The sum of inOutLines line quantities which are in the Drafted status", dataType=FlyDataType.NONE, entityType="D", printName="Qty Movement Drafted", fieldLength=0)
	QtyMovementDrafted,
	//
	@FlyElement(name="乘数数量", description="Value to multiply quantities by for generating commissions.", help="The Multiplier Quantity field indicates the amount to multiply the quantities accumulated for this commission run.", dataType=FlyDataType.Number, entityType="D", printName="乘数数量", fieldLength=22)
	QtyMultiplier,
	//
	@FlyElement(name="在库库存", description="在库库存", help="The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse.", dataType=FlyDataType.Quantity, entityType="D", printName="库存数量", fieldLength=22)
	QtyOnHand,
	//
	@FlyElement(name="On Hand Quantity Total", description="On Hand Quantity Total", help="The On Hand Quantity Total indicates the quantity of a product that is on hand in a warehouse.", dataType=FlyDataType.NONE, entityType="D", printName="On Hand Qty Total", fieldLength=0)
	QtyOnHandTotal,
	//
	@FlyElement(name="QtyOpenToInvoice", dataType=FlyDataType.NONE, entityType="D", printName="QtyOpenToInvoice", fieldLength=0)
	QtyOpenToInvoice,
	//
	@FlyElement(name="已定单量", description="已定单量", help="The Ordered Quantity indicates the quantity of a product that was ordered.", dataType=FlyDataType.Quantity, entityType="D", printName="已定单量", fieldLength=22)
	QtyOrdered,
	//
	@FlyElement(name="Ordered Quantity Total", description="Ordered Quantity Total", help="The Ordered Quantity Total indicates the quantity of a product that was ordered.", dataType=FlyDataType.NONE, entityType="D", printName="Ordered Qty Total", fieldLength=0)
	QtyOrderedTotal,
	//
	@FlyElement(name="Quantity Plan", description="Planned Quantity", help="Planned Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Quantity Plan", fieldLength=22)
	QtyPlan,
	//
	@FlyElement(name="Quantity Price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Qty Price", fieldLength=22)
	QtyPrice,
	//
	@FlyElement(name="库存数量", dataType=FlyDataType.NONE, entityType="D", printName="库存数量", fieldLength=0)
	QtyRange,
	//
	@FlyElement(name="Quantity Ranking", dataType=FlyDataType.Integer, entityType="D", printName="Qty Ranking", fieldLength=22)
	QtyRanking,
	//
	@FlyElement(name="Quantity Reimbursed", description="The reimbursed quantity", help="The reimbursed quantity is derived from the entered quantity and can be overwritten when approving the expense report.", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Reimbursed", fieldLength=22)
	QtyReimbursed,
	//
	@FlyElement(name="保留库存", description="保留库存", help="The Reserved Quantity indicates the quantity of a product that is currently reserved for other orders.", dataType=FlyDataType.Quantity, entityType="D", printName="保留库存", fieldLength=22)
	QtyReserved,
	//
	@FlyElement(name="Reserved Quantity Total", description="Reserved Quantity Total", help="The Reserved Quantity Total indicates the quantity of a product that is currently reserved.", dataType=FlyDataType.NONE, entityType="D", printName="Reserved Qty Total", fieldLength=0)
	QtyReservedTotal,
	//
	@FlyElement(name="Reward Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Reward Quantity", fieldLength=0)
	QtyReward,
	//
	@FlyElement(name="Quantity Used", description="Quantity used for this event", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Used", fieldLength=22)
	QtySpent,
	//
	@FlyElement(name="减去数量", description="Quantity to subtract when generating commissions", help="The Quantity Subtract identifies the quantity to be subtracted before multiplication", dataType=FlyDataType.Number, entityType="D", printName="减去数量", fieldLength=22)
	QtySubtract,
	//
	@FlyElement(name="配送数量", dataType=FlyDataType.Quantity, entityType="D", printName="配送数量", fieldLength=22)
	QtyToDeliver,
	//
	@FlyElement(name="发票数量", dataType=FlyDataType.Quantity, entityType="D", printName="发票数量", fieldLength=22)
	QtyToInvoice,
	//
	@FlyElement(name="定单数量", dataType=FlyDataType.Quantity, entityType="D", printName="定单数量", fieldLength=22)
	QtyToOrder,
	//
	@FlyElement(name="Quantity Used", dataType=FlyDataType.Amount, entityType="D", printName="Quantity Used in production", fieldLength=10)
	QtyUsed,
	//
	@FlyElement(name="质量等级", description="评估供应商等级方法", help="The Quality Rating indicates how a vendor is rated (higher number = higher quality)", dataType=FlyDataType.Integer, entityType="D", printName="质量等级", fieldLength=22)
	QualityRating,
	//
	@FlyElement(name="Query", description="SQL", dataType=FlyDataType.Text, entityType="D", printName="Query", fieldLength=2000)
	Query,
	//
	@FlyElement(name="Query Source", description="Source of the Query", dataType=FlyDataType.List, entityType="D", printName="Source", fieldLength=1)
	QuerySource,
	//
	@FlyElement(name="RfQ Type", description="Request for Quotation Type", dataType=FlyDataType.List, entityType="D", printName="RfQ Type", fieldLength=1)
	QuoteType,
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
	@FlyElement(name="比率", description="比率or Tax or Exchange", help="The Rate indicates the percentage to be multiplied by the source to arrive at the tax or exchange amount.", dataType=FlyDataType.Number, entityType="D", printName="比率", fieldLength=22)
	Rate,
	//
	@FlyElement(name="等级", description="分类或重要", help="The Rating is used to differentiate the importance", dataType=FlyDataType.String, entityType="D", printName="等级", fieldLength=1)
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
	@FlyElement(name="授权码", description="被送回的授权码", help="The Authorization Code indicates the code returned from the electronic transmission.", dataType=FlyDataType.String, entityType="D", printName="授权码", fieldLength=20)
	R_AuthCode,
	//
	@FlyElement(name="授权码", description="Authorization Code Delayed Capture returned", help="The Authorization Code indicates the code returned from the electronic transmission.", dataType=FlyDataType.String, entityType="D", printName="授权码", fieldLength=20)
	R_AuthCode_DC,
	//
	@FlyElement(name="地址已验证", description="This address has been verified", help="The Address Verified indicates if the address has been verified by the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="地址已验证", fieldLength=1)
	R_AvsAddr,
	//
	@FlyElement(name="邮编已验证", description="The Zip Code has been verified", help="The Zip Verified indicates if the zip code has been verified by the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="邮编已验证", fieldLength=1)
	R_AvsZip,
	//
	@FlyElement(name="Category", description="Request Category", help="Category or Topic of the Request ", dataType=FlyDataType.TableDirect, entityType="D", printName="Category", fieldLength=10)
	R_Category_ID,
	//
	@FlyElement(name="CVV 匹配", description="Credit Card Verification Code Match", help="The Credit Card Verification Code was matched", dataType=FlyDataType.YesNo, entityType="D", printName="CVV 匹配", fieldLength=1)
	R_CVV2Match,
	//
	@FlyElement(name="只读逻辑", description="Logic to determine if field is read only (applies only when field is read-write)", help="format := {expression} [{logic} {expression}]<br> 	expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> 	logic := {|}|{&}<br>	context := any global or window context <br>	value := strings or numbers<br>	logic operators	:= AND or OR with the previous result from left to right <br>	operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>	Examples: <br>	@AD_Table_ID@=14 | @Language@!GERGER <br>	@PriceLimit@>10 | @PriceList@>@PriceActual@<br>	@Name@>J<br>	Strings may be in single quotes (optional)", dataType=FlyDataType.Text, entityType="D", printName="只读逻辑", fieldLength=2000)
	ReadOnlyLogic,
	//
	@FlyElement(name="已实现收益帐户", description="已实现收益帐户", help="The Realized Gain Account indicates the account to be used when recording gains achieved from currency revaluation that have been realized.", dataType=FlyDataType.Account, entityType="D", printName="已实现收益帐户", fieldLength=22)
	RealizedGain_Acct,
	//
	@FlyElement(name="已实现损失帐户", description="已实现损失帐户", help="The Realized Loss Account indicates the account to be used when recording losses incurred from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="已实现损失帐户", fieldLength=22)
	RealizedLoss_Acct,
	//
	@FlyElement(name="Receipt Footer Msg", description="This message will be displayed at the bottom of a receipt when doing a sales or purchase", dataType=FlyDataType.LongText, entityType="D", printName="Receipt Footer Msg", fieldLength=0)
	ReceiptFooterMsg,
	//
	@FlyElement(name="Info Received", description="Information of the receipt of the package (acknowledgement)", dataType=FlyDataType.String, entityType="D", printName="Info Received", fieldLength=255)
	ReceivedInfo,
	//
	@FlyElement(name="已接收查询答复", dataType=FlyDataType.YesNo, entityType="D", printName="查询答复", fieldLength=1)
	ReceiveInquiryReply,
	//
	@FlyElement(name="接收定单答复", dataType=FlyDataType.YesNo, entityType="D", printName="定单答复", fieldLength=1)
	ReceiveOrderReply,
	//
	@FlyElement(name="确认频率", dataType=FlyDataType.List, entityType="D", printName="确认频率", fieldLength=1)
	RecognitionFrequency,
	//
	@FlyElement(name="确认金额", dataType=FlyDataType.Amount, entityType="D", printName="确认金额", fieldLength=22)
	RecognizedAmt,
	//
	@FlyElement(name="记录ID", description="记录的内部ID", help="The Record ID is the internal unique identifier of a record", dataType=FlyDataType.Button, entityType="D", printName="记录ID", fieldLength=22)
	Record_ID,
	//
	@FlyElement(name="RecordType", dataType=FlyDataType.String, entityType="D", printName="RecordType", fieldLength=0)
	RecordType,
	//
	@FlyElement(name="重新开始类型", description="重新开始的类型文件", help="The type of document to be generated", dataType=FlyDataType.List, entityType="D", printName="重新开始类型", fieldLength=1)
	RecurringType,
	//
	@FlyElement(name="红色", description="RGB 值 ", dataType=FlyDataType.Integer, entityType="D", printName="红色", fieldLength=22)
	Red,
	//
	@FlyElement(name="2nd Red", description="RGB 第二颜色值", dataType=FlyDataType.Integer, entityType="D", printName="第二个红色", fieldLength=22)
	Red_1,
	//
	@FlyElement(name="Redo", dataType=FlyDataType.Button, entityType="D", printName="Redo", fieldLength=1)
	Redo,
	//
	@FlyElement(name="引用", description="本记录引用", help="The Reference displays the source document number.", dataType=FlyDataType.String, entityType="D", printName="引用", fieldLength=60)
	Reference,
	//
	@FlyElement(name="引用号", description="Your customer or vendor number at the Business Partner's site 你在业务伙伴那里的客户号或供应商号。", help="The reference number can be printed on orders and invoices to allow your business partner to faster identify your records.", dataType=FlyDataType.String, entityType="D", printName="引用号", fieldLength=40)
	ReferenceNo,
	//
	@FlyElement(name="Referrer", description="谈及网地址", dataType=FlyDataType.String, entityType="D", printName="Referrer", fieldLength=120)
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
	@FlyElement(name="销售单|采购单参考", description="Reference to corresponding Sales Purchase Order", help="Reference of the Sales Order Line to the corresponding Purchase Order Line or vice versa.", dataType=FlyDataType.Search, entityType="D", printName="销售单|采购单参考", fieldLength=22)
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
	@FlyElement(name="区域名字", description="该区域的名字", help="The Region Name defines the name that will print when this region is used in a document.", dataType=FlyDataType.String, entityType="D", printName="区域名字", fieldLength=60)
	RegionName,
	//
	@FlyElement(name="Related Product", description="Related Product", dataType=FlyDataType.Search, entityType="D", printName="Related Product", fieldLength=22)
	RelatedProduct_ID,
	//
	@FlyElement(name="Related Product Type", dataType=FlyDataType.List, entityType="D", printName="Related Product Type", fieldLength=1)
	RelatedProductType,
	//
	@FlyElement(name="相对分期", description="分期抵销", dataType=FlyDataType.Number, entityType="D", printName="相对分期", fieldLength=22)
	RelativePeriod,
	//
	@FlyElement(name="Relative Period To", description="Period offset (0 is current)", dataType=FlyDataType.NONE, entityType="D", printName="Relative Period To", fieldLength=0)
	RelativePeriodTo,
	//
	@FlyElement(name="Relative URL", description="Contains the relative URL for the container", help="The relative URL is used together with the webproject domain to display the content", dataType=FlyDataType.String, entityType="D", printName="Relative URL", fieldLength=120)
	RelativeURL,
	//
	@FlyElement(name="相对重量", description="Relative weight of this step (0 = ignored)", help="The relative weight allows you to adjust the report based on probabilities.  For example, if you have a 1:10 chance in closing a contract when it is in the prospect stage and a 1:2 chance when it is in the contract stage, you may put a weight of 0.1 and 0.5 on those steps. In the Cycle Report, you then could see, which stage is less or more compared to the other steps.  This is an alternative method for a funnel or measures completion of your project.", dataType=FlyDataType.Number, entityType="D", printName="相对重量", fieldLength=22)
	RelativeWeight,
	//
	@FlyElement(name="发行号", description="内部发行号", dataType=FlyDataType.String, entityType="D", printName="发行号", fieldLength=10)
	ReleaseNo,
	//
	@FlyElement(name="Release Tag", description="Release Tag", dataType=FlyDataType.String, entityType="D", printName="Release Tag", fieldLength=60)
	ReleaseTag,
	//
	@FlyElement(name="Remaining Amt", description="Remaining Amount", dataType=FlyDataType.Amount, entityType="D", printName="Remaining Amt", fieldLength=22)
	RemainingAmt,
	//
	@FlyElement(name="Reminder Days", description="Days between sending Reminder Emails for a due or inactive Document", help="When a document is due ot too long without activity, a reminder is sent. 0 means no reminders.	The Remind Days are the days when the next email reminder is sent.", dataType=FlyDataType.Integer, entityType="D", printName="Reminder Days", fieldLength=22)
	RemindDays,
	//
	@FlyElement(name="汇款邮件本文", description="Email text used for sending payment remittances", help="Standard email template used to send remittances as attachments.", dataType=FlyDataType.Table, entityType="D", printName="汇款邮件本文", fieldLength=22)
	Remittance_MailText_ID,
	//
	@FlyElement(name="汇款打印格式", description="Print Format for separate Remittances", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="汇款打印格式", fieldLength=22)
	Remittance_PrintFormat_ID,
	//
	@FlyElement(name="远程地址", description="远程地址", help="The Remote Address indicates an alternative or external address.", dataType=FlyDataType.String, entityType="D", printName="远程地址", fieldLength=60)
	Remote_Addr,
	//
	@FlyElement(name="远程客户", description="Remote Client to be used to replicate   synchronize data with.", help="The remote client used for data replication.", dataType=FlyDataType.Table, entityType="D", printName="远程客户", fieldLength=22)
	Remote_Client_ID,
	//
	@FlyElement(name="远程主机", dataType=FlyDataType.String, entityType="D", printName="远程主机", fieldLength=120)
	Remote_Host,
	//
	@FlyElement(name="远程组织", description="Remote Organization to be used to replicate   synchronize data with.", help="The remote organization used for data replication. If not selected, all organizations are replicated synchronized.", dataType=FlyDataType.Table, entityType="D", printName="远程组织", fieldLength=22)
	Remote_Org_ID,
	//
	@FlyElement(name="Remuneration Type", description="Type of Remuneration", dataType=FlyDataType.List, entityType="D", printName="Remuneration Type", fieldLength=1)
	RemunerationType,
	//
	@FlyElement(name="Renewal Date", dataType=FlyDataType.Date, entityType="D", printName="Renewal Date", fieldLength=7)
	RenewalDate,
	//
	@FlyElement(name="重复距离", description="Distance in points to repeat gradient color - or zero", help="The gradient color is not repeated, if the value is zero. The distance is added to (or subtracted from) the starting point of the gradient.", dataType=FlyDataType.Integer, entityType="D", printName="重复距离", fieldLength=22)
	RepeatDistance,
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
	@FlyElement(name="补货类型", description="Method for re-ordering a product", help="The Replenish Type indicates if this product will be manually re-ordered, ordered when the quantity is below the minimum quantity or ordered when it is below the maximum quantity.", dataType=FlyDataType.List, entityType="D", printName="补货类型", fieldLength=1)
	ReplenishType,
	//
	@FlyElement(name="复制类型", description="数据复制的类型", help="The Type of data Replication determines the directon of the data replication.  <br>	Reference means that the data in this system is read only -> <br>	Local means that the data in this system is not replicated to other systems - <br>	Merge means that the data in this system is synchronized with the other system <-> <br>	", dataType=FlyDataType.List, entityType="D", printName="复制类型", fieldLength=1)
	ReplicationType,
	//
	@FlyElement(name="Reply", description="Reply or Answer", dataType=FlyDataType.Text, entityType="D", printName="Reply", fieldLength=2000)
	Reply,
	//
	@FlyElement(name="答复价格", description="Confirmed Price from EDI Partner", dataType=FlyDataType.CostsPrices, entityType="D", printName="答复价格", fieldLength=22)
	Reply_Price,
	//
	@FlyElement(name="答复可用数量", dataType=FlyDataType.Quantity, entityType="D", printName="可用库存", fieldLength=22)
	Reply_QtyAvailable,
	//
	@FlyElement(name="答复被证实的数量", dataType=FlyDataType.Quantity, entityType="D", printName="已确认数量", fieldLength=22)
	Reply_QtyConfirmed,
	//
	@FlyElement(name="答复收到", dataType=FlyDataType.DateTime, entityType="D", printName="答复", fieldLength=7)
	Reply_Received,
	//
	@FlyElement(name="答复评论", dataType=FlyDataType.Text, entityType="D", printName="评论", fieldLength=2000)
	Reply_Remarks,
	//
	@FlyElement(name="答复交货日期", dataType=FlyDataType.Date, entityType="D", printName="发运日期", fieldLength=7)
	Reply_ShipDate,
	//
	@FlyElement(name="reportline", dataType=FlyDataType.NONE, entityType="D", printName="reportline", fieldLength=0)
	reportline,
	//
	@FlyElement(name="报表行组合名", description="报表行组合名", dataType=FlyDataType.String, entityType="D", printName="报表行组合名", fieldLength=60)
	ReportLineSetName,
	//
	@FlyElement(name="reportlinestyle", dataType=FlyDataType.NONE, entityType="D", printName="reportlinestyle", fieldLength=0)
	reportlinestyle,
	//
	@FlyElement(name="Report Type", dataType=FlyDataType.NONE, entityType="D", printName="Report Type", fieldLength=0)
	ReportType,
	//
	@FlyElement(name="请求金额", description="Amount associated with this request", help="The Request Amount indicates any amount that is associated with this request.  For example, a warranty amount or refund amount.", dataType=FlyDataType.Amount, entityType="D", printName="请求 Amt", fieldLength=22)
	RequestAmt,
	//
	@FlyElement(name="Request Document No", description="Adempiere Request Document No", dataType=FlyDataType.String, entityType="D", printName="Request Document No", fieldLength=30)
	RequestDocumentNo,
	//
	@FlyElement(name="请求电子邮件", description="EMail address to send automated mails from or receive mails for automated processing (fully qualified)", help="EMails for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. The address must be filly qualified (e.g. joe.smith@company.com) and should be a valid address.", dataType=FlyDataType.String, entityType="D", printName="请求电子邮件", fieldLength=60)
	RequestEMail,
	//
	@FlyElement(name="请求文件夹", description="EMail folder to process incoming emails; if empty INBOX is used", help="Email folder used to read emails to process as requests, If left empty the default mailbox (INBOX) will be used. Requires IMAP services.", dataType=FlyDataType.String, entityType="D", printName="请求文件夹", fieldLength=20)
	RequestFolder,
	//
	@FlyElement(name="请求价格", dataType=FlyDataType.CostsPrices, entityType="D", printName="请求价格", fieldLength=22)
	Request_Price,
	//
	@FlyElement(name="请求数量", dataType=FlyDataType.Quantity, entityType="D", printName="请求数量", fieldLength=22)
	Request_Qty,
	//
	@FlyElement(name="请求交货日期", dataType=FlyDataType.Date, entityType="D", printName="请求交货日期", fieldLength=7)
	Request_Shipdate,
	//
	@FlyElement(name="Request Type", dataType=FlyDataType.String, entityType="D", printName="Request Type", fieldLength=4)
	RequestType,
	//
	@FlyElement(name="请求用户", description="User Name (ID) of the email owner", help="EMail user name for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. Required, if your mail server requires authentification as well as for processing incoming mails.", dataType=FlyDataType.String, entityType="D", printName="请求用户", fieldLength=60)
	RequestUser,
	//
	@FlyElement(name="请求用户密码", description="Password of the user name (ID) for mail processing", dataType=FlyDataType.String, entityType="D", printName="请求用户密码", fieldLength=20)
	RequestUserPW,
	//
	@FlyElement(name="需要免税证书", description="本税率需要免税证书", help="The Requires Tax Certificate indicates that a tax certificate is required for a Business Partner to be tax exempt.", dataType=FlyDataType.YesNo, entityType="D", printName="需要免税证书", fieldLength=1)
	RequiresTaxCertificate,
	//
	@FlyElement(name="Require CreditCard Verification Code", description="Require 3 4 digit Credit Verification Code", help="The Require CC Verification checkbox indicates if this bank accounts requires a verification number for credit card transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="需要确认密码", fieldLength=1)
	RequireVV,
	//
	@FlyElement(name="资源描述", description="Resource Allocation Description", dataType=FlyDataType.String, entityType="D", printName="资源描述", fieldLength=255)
	ResourceDescription,
	//
	@FlyElement(name="Response Text", description="Request Response Text", help="Text block to be copied into request response text", dataType=FlyDataType.Text, entityType="D", printName="Response Text", fieldLength=2000)
	ResponseText,
	//
	@FlyElement(name="职责类型", description="工作流的职责类型", help="Type how the responsible user for the execution of a workflow is determined", dataType=FlyDataType.List, entityType="D", printName="职责类型", fieldLength=1)
	ResponsibleType,
	//
	@FlyElement(name="结果", description="采取的动作结果", help="The Result indicates the result of any action taken on this request.", dataType=FlyDataType.Integer, entityType="D", printName="结果", fieldLength=22)
	Result,
	//
	@FlyElement(name="未分配利润帐户", dataType=FlyDataType.Account, entityType="D", printName="未分配利润帐户", fieldLength=22)
	RetainedEarning_Acct,
	//
	@FlyElement(name="Reversal ID", description="ID of document reversal", dataType=FlyDataType.Table, entityType="D", printName="Reversal ID", fieldLength=22)
	Reversal_ID,
	//
	@FlyElement(name="Reversal Line", description="Use to keep the reversal line ID for reversing costing purpose", dataType=FlyDataType.Table, entityType="D", printName="Reversal Line", fieldLength=22)
	ReversalLine_ID,
	//
	@FlyElement(name="Reward Type", description="Type of reward which consists of percentage discount, flat discount or absolute amount", dataType=FlyDataType.List, entityType="D", printName="Reward Type", fieldLength=1)
	RewardType,
	//
	@FlyElement(name="Group", description="Request Group", help="Group of requests (e.g. version numbers, responsibility, ...)", dataType=FlyDataType.TableDirect, entityType="D", printName="Group", fieldLength=10)
	R_Group_ID,
	//
	@FlyElement(name="信息", description="回应信息", help="The Info indicates any response information returned from the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="信息", fieldLength=2000)
	R_Info,
	//
	@FlyElement(name="关心点区域", description="关心点区域或主题", help="Interest Areas reflect interest in a topic by a contact. Interest areas can be used for marketing campaigns.", dataType=FlyDataType.TableDirect, entityType="D", printName="关心点区域", fieldLength=22)
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
	@FlyElement(name="邮寄模板", description="本文模板为邮寄", help="The Mail Template indicates the mail template for return messages.", dataType=FlyDataType.ID, entityType="D", printName="邮寄模板", fieldLength=22)
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
	@FlyElement(name="路由号", description="银行工作路明细排定数字", help="The Bank Routing Number (ABA Number) identifies a legal Bank.  It is used in routing checks and electronic transactions.", dataType=FlyDataType.String, entityType="D", printName="路由号", fieldLength=20)
	RoutingNo,
	//
	@FlyElement(name="Row Type", dataType=FlyDataType.String, entityType="D", printName="Row Type", fieldLength=1)
	RowType,
	//
	@FlyElement(name="版权金额", description="(Included) Amount for copyright, etc.", dataType=FlyDataType.Amount, entityType="D", printName="版权金额", fieldLength=22)
	RoyaltyAmt,
	//
	@FlyElement(name="付款参考", description="付款参考", help="The Payment Reference indicates the reference returned from the Credit Card Company for a payment", dataType=FlyDataType.String, entityType="D", printName="参考", fieldLength=20)
	R_PnRef,
	//
	@FlyElement(name="叁考", description="Payment Reference Delayed Capture", help="The Payment Reference indicates the reference returned from the Credit Card Company for a payment", dataType=FlyDataType.String, entityType="D", printName="叁考", fieldLength=20)
	R_PnRef_DC,
	//
	@FlyElement(name="Revenue Recognition Amt", description="Revenue Recognition Amount", help="The amount for revenue recognition calculation.  If empty, the complete invoice amount is used.  The difference between Revenue Recognition Amount and Invoice Line Net Amount is immediately recognized as revenue.", dataType=FlyDataType.Amount, entityType="D", printName="RR Amt", fieldLength=22)
	RRAmt,
	//
	@FlyElement(name="请求动作", description="动作有被请求", help="The Request Action indicates if the Credit Card Company has requested further action be taken.", dataType=FlyDataType.ID, entityType="D", printName="请求动作", fieldLength=22)
	R_RequestAction_ID,
	//
	@FlyElement(name="请求", description="Request from a Business Partner or Prospect", help="The Request identifies a unique request from a Business Partner or Prospect.", dataType=FlyDataType.ID, entityType="D", printName="请求", fieldLength=22)
	R_Request_ID,
	//
	@FlyElement(name="请求处理器", dataType=FlyDataType.ID, entityType="D", printName="请求处理器", fieldLength=22)
	R_RequestProcessor_ID,
	//
	@FlyElement(name="Request Processor Log", dataType=FlyDataType.ID, entityType="D", printName="Request Processor Log", fieldLength=22)
	R_RequestProcessorLog_ID,
	//
	@FlyElement(name="请求工作路明细排定", description="自动请求的路由", dataType=FlyDataType.ID, entityType="D", printName="请求工作路明细排定", fieldLength=22)
	R_RequestProcessor_Route_ID,
	//
	@FlyElement(name="Related Request", description="Related Request (Master Issue, ..)", help="Request related to this request", dataType=FlyDataType.Search, entityType="D", printName="Related Request", fieldLength=10)
	R_RequestRelated_ID,
	//
	@FlyElement(name="请求类型", description="Type of request (e.g. Inquiry, Complaint, ..)", help="Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.", dataType=FlyDataType.TableDirect, entityType="D", printName="请求类型", fieldLength=22)
	R_RequestType_ID,
	//
	@FlyElement(name="Request Update", description="Request Updates", dataType=FlyDataType.ID, entityType="D", printName="Request Update", fieldLength=10)
	R_RequestUpdate_ID,
	//
	@FlyElement(name="Resolution", description="Request Resolution", help="Resolution status (e.g. Fixed, Rejected, ..)", dataType=FlyDataType.TableDirect, entityType="D", printName="Resolution", fieldLength=10)
	R_Resolution_ID,
	//
	@FlyElement(name="信息", description="回应信息", help="The Response Message indicates the message returned from the Credit Card Company as the result of a transmission", dataType=FlyDataType.String, entityType="D", printName="信息", fieldLength=60)
	R_RespMsg,
	//
	@FlyElement(name="结果", description="传输的结果", help="The Response Result indicates the result of the transmission to the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="结果", fieldLength=20)
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
	@FlyElement(name="最大的运行", description="重新开始的数字运行", help="Number of recurring documents to be generated in total", dataType=FlyDataType.Integer, entityType="D", printName="最大运行", fieldLength=22)
	RunsMax,
	//
	@FlyElement(name="剩余的运行", description="Number of recurring runs remaining", help="Number of recurring documents to be still generated", dataType=FlyDataType.Integer, entityType="D", printName="剩余的运行", fieldLength=22)
	RunsRemaining,
	//
	@FlyElement(name="In Out Create From Identifier", dataType=FlyDataType.ID, entityType="D", printName="In Out Create From Identifier", fieldLength=10)
	RV_InOut_CreateFrom_ID,
	//
	@FlyElement(name="Invoice Create From Identifier", dataType=FlyDataType.ID, entityType="D", printName="Invoice Create From Identifier", fieldLength=10)
	RV_Invoice_CreateFrom_ID,
	//
	@FlyElement(name="Sales Pipeline", dataType=FlyDataType.NONE, entityType="D", printName="Sales Pipeline", fieldLength=0)
	SalesPipeline,
	//
	@FlyElement(name="Sales Region Value", dataType=FlyDataType.String, entityType="D", printName="Sales Region Value", fieldLength=60)
	SalesRegionValue,
	//
	@FlyElement(name="销售代表", description="Sales Representative or Company Agent", help="The Sales Representative indicates the Sales Rep for this Region.  Any Sales Rep must be a valid internal user.", dataType=FlyDataType.Table, entityType="D", printName="销售代表", fieldLength=22)
	SalesRep_ID,
	//
	@FlyElement(name="销售代表", dataType=FlyDataType.String, entityType="D", printName="销售代表", fieldLength=60)
	SalesRep_Name,
	//
	@FlyElement(name="销售体积", description="总体积的销售", help="The Sales Volume indicates the total volume of sales for a Business Partner.", dataType=FlyDataType.Integer, entityType="D", printName="销售体积", fieldLength=22)
	SalesVolume,
	//
	@FlyElement(name="Salt", description="Random data added to improve password hash effectiveness", dataType=FlyDataType.String, entityType="D", printName="Salt", fieldLength=16)
	Salt,
	//
	@FlyElement(name="Schedule Type", description="Type of schedule", help="Define the method how the next occurance is calculated", dataType=FlyDataType.List, entityType="D", printName="Schedule Type", fieldLength=1)
	ScheduleType,
	//
	@FlyElement(name="Scrapped Quantity", description="The Quantity scrapped due to QA issues", dataType=FlyDataType.Quantity, entityType="D", printName="Scrapped Qty", fieldLength=22)
	ScrappedQty,
	//
	@FlyElement(name="脚本", description="Dynamic Java Language Script to calculate result", help="Use Java language constructs to define the result of the calculation", dataType=FlyDataType.Text, entityType="D", printName="脚本", fieldLength=2000)
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
	@FlyElement(name="Second Count Qty", dataType=FlyDataType.NONE, entityType="D", printName="2nd Count", fieldLength=0)
	SecondCountQty,
	//
	@FlyElement(name="select子句", description="SQL select子句", help="The Select Clause indicates the SQL SELECT clause to use for selecting the record for a measure calculation.", dataType=FlyDataType.Text, entityType="D", printName="select子句", fieldLength=2000)
	SelectClause,
	//
	@FlyElement(name="寄催讨信", description="Indicates if dunning letters will be sent", help="The Send Dunning Letters checkbox indicates if dunning letters will be sent to Business Partners who use this dunning rule.", dataType=FlyDataType.YesNo, entityType="D", printName="寄催讨信", fieldLength=1)
	SendDunningLetter,
	//
	@FlyElement(name="发送电子邮件", description="使送文件电子邮件能够", help="Send emails with document attached (e.g. Invoice, Delivery Note, etc.)", dataType=FlyDataType.YesNo, entityType="D", printName="发送电子邮件", fieldLength=1)
	SendEMail,
	//
	@FlyElement(name="发送查询", description="可用数量查询", dataType=FlyDataType.YesNo, entityType="D", printName="发送查询", fieldLength=1)
	SendInquiry,
	//
	@FlyElement(name="Send", dataType=FlyDataType.Button, entityType="D", printName="Send", fieldLength=1)
	SendIt,
	//
	@FlyElement(name="发送定单", dataType=FlyDataType.YesNo, entityType="D", printName="发送定单", fieldLength=1)
	SendOrder,
	//
	@FlyElement(name="元素分隔符", description="元素分隔符", help="The Element Separator defines the delimiter printed between elements of the structure", dataType=FlyDataType.String, entityType="D", printName="元素分隔符", fieldLength=1)
	Separator,
	//
	@FlyElement(name="Separator Character", dataType=FlyDataType.String, entityType="D", printName="Separator Character", fieldLength=1)
	SeparatorChar,
	//
	@FlyElement(name="序列", description="Method of ordering records; lowest number comes first", help="The Sequence indicates the order of records", dataType=FlyDataType.Integer, entityType="D", printName="序列", fieldLength=22)
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
	@FlyElement(name="序列号", description="产品序号 ", help="The Serial Number identifies a tracked, warranted product.  It can only be used when the quantity is 1.", dataType=FlyDataType.String, entityType="D", printName="序列号", fieldLength=40)
	SerNo,
	//
	@FlyElement(name="SerNo Char End Overwrite", description="Serial Number End Indicator overwrite - default empty", help="If not defined, no character is used", dataType=FlyDataType.String, entityType="D", printName="SerNo Char End", fieldLength=1)
	SerNoCharEOverwrite,
	//
	@FlyElement(name="SerNo Char Start Overwrite", description="Serial Number Start Indicator overwrite - default #", help="If not defined, the default character # is used", dataType=FlyDataType.String, entityType="D", printName="SerNo Char Start", fieldLength=1)
	SerNoCharSOverwrite,
	//
	@FlyElement(name="服务日期", description="服务提供日期", help="The Service Date indicates the date that the service was provided.", dataType=FlyDataType.Date, entityType="D", printName="服务日期", fieldLength=7)
	ServiceDate,
	//
	@FlyElement(name="已开票数量", description="Quantity of product or service invoiced", help="The Quantity Invoiced indicates the total quantity of a product or service that has been invoiced.", dataType=FlyDataType.Number, entityType="D", printName="已开票数量", fieldLength=22)
	ServiceLevelInvoiced,
	//
	@FlyElement(name="已提供数量", description="Quantity of service or product provided", help="The Quantity Provided indicates the total quantity of a product or service that has been received by the customer.", dataType=FlyDataType.Number, entityType="D", printName="已供货数量", fieldLength=22)
	ServiceLevelProvided,
	//
	@FlyElement(name="期间ID", dataType=FlyDataType.ID, entityType="D", printName="期间ID", fieldLength=60)
	Session_ID,
	//
	@FlyElement(name="Only Set Customization", description="Set Customization for change records records with Dictionary Entity Type", dataType=FlyDataType.NONE, entityType="D", printName="Only Set Customization", fieldLength=0)
	SetCustomization,
	//
	@FlyElement(name="设定未来成本到", description="Set the Future costs to the selection", dataType=FlyDataType.NONE, entityType="D", printName="设定未来成本到", fieldLength=0)
	SetFutureCostTo,
	//
	@FlyElement(name="设定标准成本", description="Set new Standard Costs from Future Costs", dataType=FlyDataType.NONE, entityType="D", printName="设定标准成本", fieldLength=0)
	SetStandardCostTo,
	//
	@FlyElement(name="Setup Time", description="Setup time before starting Production", help="Once per operation", dataType=FlyDataType.Number, entityType="D", printName="Setup Time", fieldLength=22)
	SetupTime,
	//
	@FlyElement(name="费用类型", description="费用报表类型", dataType=FlyDataType.TableDirect, entityType="D", printName="费用类型", fieldLength=22)
	S_ExpenseType_ID,
	//
	@FlyElement(name="Shape Type", description="Type of the shape to be painted", dataType=FlyDataType.List, entityType="D", printName="Shape Type", fieldLength=1)
	ShapeType,
	//
	@FlyElement(name="提成比例", description="Share of Customer's business as a percentage", help="The Share indicates the percentage of this Business Partner's volume of the products supplied.", dataType=FlyDataType.Integer, entityType="D", printName="提成比例", fieldLength=22)
	ShareOfCustomer,
	//
	@FlyElement(name="Share Type", description="Type of sharing", help="Defines if a table is shared within a client or not.", dataType=FlyDataType.List, entityType="D", printName="Share Type", fieldLength=1)
	ShareType,
	//
	@FlyElement(name="架深度", description="要求的架深度", help="The Shelf Depth indicates the depth dimension required on a shelf for a product ", dataType=FlyDataType.Integer, entityType="D", printName="架深度", fieldLength=22)
	ShelfDepth,
	//
	@FlyElement(name="架高度", description="要求的架高度", help="The Shelf Height indicates the height dimension required on a shelf for a product", dataType=FlyDataType.Amount, entityType="D", printName="架高度", fieldLength=22)
	ShelfHeight,
	//
	@FlyElement(name="Shelf Life Days", description="Shelf Life in days based on Product Instance Guarantee Date", help="Shelf Life of products with Guarantee Date instance compared to today.", dataType=FlyDataType.Integer, entityType="D", printName="Shelf Life Days", fieldLength=22)
	ShelfLifeDays,
	//
	@FlyElement(name="Min Shelf Life Days", description="Minimum Shelf Life in days based on Product Instance Guarantee Date", help="Miminum Shelf Life of products with Guarantee Date instance. If > 0 you cannot select products with a shelf life less than the minum shelf life, unless you select 'Show All'", dataType=FlyDataType.Integer, entityType="D", printName="Min Shelf Life Days", fieldLength=22)
	ShelfLifeMinDays,
	//
	@FlyElement(name="Min Shelf Life %", description="Minimum Shelf Life in percent based on Product Instance Guarantee Date", help="Miminum Shelf Life of products with Guarantee Date instance. If > 0 you cannot select products with a shelf life ((Guarantee Date-Today) / Guarantee Days) less than the minum shelf life, unless you select 'Show All'", dataType=FlyDataType.Integer, entityType="D", printName="Min Shelf Life %", fieldLength=22)
	ShelfLifeMinPct,
	//
	@FlyElement(name="Remaining Shelf Life %", description="Remaining shelf life in percent based on Guarantee Date", help="(Guarantee Date-Today) / Guarantee Days", dataType=FlyDataType.Integer, entityType="D", printName="Rem Shelf Life %", fieldLength=22)
	ShelfLifeRemainingPct,
	//
	@FlyElement(name="架宽度", description="要求的架宽度", help="The Shelf Width indicates the width dimension required on a shelf for a product", dataType=FlyDataType.Integer, entityType="D", printName="架宽度", fieldLength=22)
	ShelfWidth,
	//
	@FlyElement(name="发运日期", description="Shipment Date Time", help="Actual Date Time of Shipment (pick up)", dataType=FlyDataType.DateTime, entityType="D", printName="发运日期", fieldLength=7)
	ShipDate,
	//
	@FlyElement(name="Ship Description", dataType=FlyDataType.String, entityType="D", printName="Ship Description", fieldLength=255)
	ShipDescription,
	//
	@FlyElement(name="物料出货邮件本文", description="Email text used for sending delivery notes", help="Standard email template used to send delivery notes as attachments.", dataType=FlyDataType.Table, entityType="D", printName="物料出货邮件本文", fieldLength=22)
	Shipment_MailText_ID,
	//
	@FlyElement(name="物料出货打印格式", description="Print Format for Shipments, Receipts, Pick Lists", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="物料出货打印格式", fieldLength=22)
	Shipment_PrintFormat_ID,
	//
	@FlyElement(name="显示实际金额", dataType=FlyDataType.NONE, entityType="D", printName="显示实际金额", fieldLength=0)
	ShowActualAmt,
	//
	@FlyElement(name="显示委托金额", dataType=FlyDataType.NONE, entityType="D", printName="显示委托金额", fieldLength=0)
	ShowCommittedAmt,
	//
	@FlyElement(name="Show Help", dataType=FlyDataType.List, entityType="D", printName="Show Help", fieldLength=1)
	ShowHelp,
	//
	@FlyElement(name="显示已计划金额", dataType=FlyDataType.NONE, entityType="D", printName="显示已计划金额", fieldLength=0)
	ShowPlannedAmt,
	//
	@FlyElement(name="显示已计划差额金额", dataType=FlyDataType.NONE, entityType="D", printName="显示已计划差额金额", fieldLength=0)
	ShowPlannedMarginAmt,
	//
	@FlyElement(name="显示已计划数量", dataType=FlyDataType.NONE, entityType="D", printName="显示已计划数量", fieldLength=0)
	ShowPlannedQty,
	//
	@FlyElement(name="Size X", description="X (horizontal) dimension size", help="Size of X (horizontal) dimension in Units", dataType=FlyDataType.Number, entityType="D", printName="Size X", fieldLength=5)
	SizeX,
	//
	@FlyElement(name="Size Y", description="Y (vertical) dimension size", help="Size of Y (vertical) dimension in Units", dataType=FlyDataType.Number, entityType="D", printName="Size Y", fieldLength=5)
	SizeY,
	//
	@FlyElement(name="SKU", description="存货保管单位", help="The SKU indicates a user defined stock keeping unit.  It may be used for an additional bar code symbols or your own schema.", dataType=FlyDataType.String, entityType="D", printName="SKU", fieldLength=30)
	SKU,
	//
	@FlyElement(name="邮件主机", description="Hostname of Mail Server for SMTP and IMAP", help="The host name of the Mail Server for this client with SMTP services to send mail, and IMAP to process incoming mail.", dataType=FlyDataType.String, entityType="D", printName="邮件主机", fieldLength=60)
	SMTPHost,
	//
	@FlyElement(name="可用信用", description="可用信用", dataType=FlyDataType.Amount, entityType="D", printName="可用信用", fieldLength=22)
	SO_CreditAvailable,
	//
	@FlyElement(name="信用额度", description="Total outstanding invoice amounts allowed", help="The Credit Limit indicates the total amount allowed 'on account'.  If this is exceeded a warning message will be generated.", dataType=FlyDataType.Amount, entityType="D", printName="信用额度", fieldLength=22)
	SO_CreditLimit,
	//
	@FlyElement(name="Credit Status", description="Sales Credit Status", help="For Documentation only", dataType=FlyDataType.List, entityType="D", printName="Credit Status", fieldLength=1)
	SOCreditStatus,
	//
	@FlyElement(name="已用信用", description="当前未结余款", help="The Credit Used indicates the total amount of open or unpaid invoices for this Business Partner.", dataType=FlyDataType.Amount, entityType="D", printName="已用信用", fieldLength=22)
	SO_CreditUsed,
	//
	@FlyElement(name="定单描述", description="Description to be used on orders", help="The Order Description identifies the standard description to use on orders for this Customer.", dataType=FlyDataType.String, entityType="D", printName="定单描述", fieldLength=255)
	SO_Description,
	//
	@FlyElement(name="SO/PO Type", description="Sales Tax applies to sales situations, Purchase Tax to purchase situations", help="Sales Tax: charged when selling - examples: Sales Tax, Output VAT (payable)	Purchase Tax: tax charged when purchasing - examples: Use Tax, Input VAT (receivable)", dataType=FlyDataType.List, entityType="D", printName="SO/PO Type", fieldLength=1)
	SOPOType,
	//
	@FlyElement(name="Sales Pricelist", dataType=FlyDataType.Table, entityType="D", printName="Sales Pricelist", fieldLength=22)
	SO_PriceList_ID,
	//
	@FlyElement(name="记录排序号", description="决定记录按怎样的顺序显示。", help="The Record Sort No indicates the ascending sort sequence of the records", dataType=FlyDataType.Number, entityType="D", printName="记录排序号", fieldLength=22)
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
	@FlyElement(name="Split元素", description="Semantics for multiple outgoing Transitions", help="Semantics for multiple outgoing Transitions for a Node/Activity.  AND represents multiple concurrent threads - XOR represents the first transition with a true Transaition condition.", dataType=FlyDataType.List, entityType="D", printName="Split元素", fieldLength=1)
	SplitElement,
	//
	@FlyElement(name="SQLStatement", dataType=FlyDataType.Memo, entityType="D", printName="SQLStatement", fieldLength=2000)
	SQLStatement,
	//
	@FlyElement(name="资源任务", description="资源任务", dataType=FlyDataType.Assignment, entityType="D", printName="任务", fieldLength=22)
	S_ResourceAssignment_ID,
	//
	@FlyElement(name="资源", description="资源", dataType=FlyDataType.TableDirect, entityType="D", printName="资源", fieldLength=22)
	S_Resource_ID,
	//
	@FlyElement(name="资源类型", dataType=FlyDataType.TableDirect, entityType="D", printName="资源类型", fieldLength=22)
	S_ResourceType_ID,
	//
	@FlyElement(name="资源不可用", dataType=FlyDataType.ID, entityType="D", printName="资源不可用", fieldLength=22)
	S_ResourceUnAvailable_ID,
	//
	@FlyElement(name="Stack Trace", description="System Log Trace", dataType=FlyDataType.Text, entityType="D", printName="Stack Trace", fieldLength=2000)
	StackTrace,
	//
	@FlyElement(name="Standard Hours", description="Standard Work Hours based on Remuneration Type", help="Number of hours per Remuneration Type (e.g. Daily 8 hours, Weekly 40 hours, etc.) to determine when overtime starts", dataType=FlyDataType.Integer, entityType="D", printName="Standard Hours", fieldLength=10)
	StandardHours,
	//
	@FlyElement(name="标准量", description="标准量", dataType=FlyDataType.Quantity, entityType="D", printName="标准量", fieldLength=22)
	StandardQty,
	//
	@FlyElement(name="开始日期", description="First effective day (inclusive)", help="The Start Date indicates the first or starting date of a range.", dataType=FlyDataType.Date, entityType="D", printName="开始日期", fieldLength=7)
	StartDate,
	//
	@FlyElement(name="Start Count Impression", description="For rotation we need a start count", help="If we run banners in rotation we always show the one with the min of impressions, so if a new banner is added to impressions we don't want it to show up so often we set a startimpressions value. StartImpression+ActualImpression=CurrentImpression", dataType=FlyDataType.Integer, entityType="D", printName="Start Count Impression", fieldLength=10)
	StartImpression,
	//
	@FlyElement(name="启动方式", description="工作流活动的启动方式", help="How is the execution of an activity triggered. Automatic are triggered implicitly by the system, Manual explicitly by the User.", dataType=FlyDataType.List, entityType="D", printName="启动方式", fieldLength=1)
	StartMode,
	//
	@FlyElement(name="序列每年重新开始", description="Restart the sequence with Start on every 1 1", help="The Restart Sequence Every Year checkbox indicates that the documents sequencing should return to the starting number on the first day of the year.", dataType=FlyDataType.YesNo, entityType="D", printName="序列每年重新开始", fieldLength=1)
	StartNewYear,
	//
	@FlyElement(name="开始号", description="Starting number position", help="The Start Number indicates the starting number of the document or position", dataType=FlyDataType.Integer, entityType="D", printName="开始号", fieldLength=22)
	StartNo,
	//
	@FlyElement(name="开始点", description="Start point of the gradient colors", help="The gradient starts at the start point (e.g. North). The repeat distance determines if and how often the gradient colors are repeated.  If starting from southern points, the upper color is actually at the button.", dataType=FlyDataType.List, entityType="D", printName="开始点", fieldLength=22)
	StartPoint,
	//
	@FlyElement(name="实施或上线开始日期", description="The day you started the implementation (if implementing) - or production (went life) with Adempiere", dataType=FlyDataType.Date, entityType="D", printName="实施或上线开始日期", fieldLength=7)
	StartProductionDate,
	//
	@FlyElement(name="Start Time", description="Time started", dataType=FlyDataType.DateTime, entityType="D", printName="Start Time", fieldLength=7)
	StartTime,
	//
	@FlyElement(name="对帐单日期", description="Date of processing a statement", help="The Statement Date field defines the date of the statement being processed.", dataType=FlyDataType.Date, entityType="D", printName="对帐单日期", fieldLength=7)
	StatementDate,
	//
	@FlyElement(name="对帐单差额", description="Difference between statement ending balance and actual ending balance", help="The Statement Difference reflects the difference between the Statement Ending Balance and the Actual Ending Balance.", dataType=FlyDataType.Amount, entityType="D", printName="对帐单差额", fieldLength=22)
	StatementDifference,
	//
	@FlyElement(name="Statement Line Date", description="Date of the Statement Line", dataType=FlyDataType.Date, entityType="D", printName="Statement Line Date", fieldLength=7)
	StatementLineDate,
	//
	@FlyElement(name="统计计数", description="Internal statistics how often the entity was used", help="For internal use.", dataType=FlyDataType.Integer, entityType="D", printName="统计计数", fieldLength=22)
	Statistic_Count,
	//
	@FlyElement(name="统计数值秒", description="Internal statistics how many seconds a process took", help="对于内在的使用", dataType=FlyDataType.Integer, entityType="D", printName="统计数值秒", fieldLength=22)
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
	@FlyElement(name="标准价格额外费", description=" 加到价格中作为额外费的金额", help="The Standard Price Surcharge Amount indicates the amount to be added to the price prior to multiplication.	", dataType=FlyDataType.Amount, entityType="D", printName="标准价格额外费", fieldLength=22)
	Std_AddAmt,
	//
	@FlyElement(name="标准价格基础", description="Base price for calculating new standard price", help="The Standard Price Base indicates the price to use as the basis for the calculation of a new price standard.	", dataType=FlyDataType.List, entityType="D", printName="标准价格基础", fieldLength=1)
	Std_Base,
	//
	@FlyElement(name="标准价格折扣 %", description="Discount percentage to subtract from base price", help="The Standard Price Discount Percentage indicates the percentage discount which will be subtracted from the base price.  A negative amount indicates the percentage which will be added to the base price.", dataType=FlyDataType.Number, entityType="D", printName="标准价格折扣 %", fieldLength=22)
	Std_Discount,
	//
	@FlyElement(name="固定的标准价格", description="Fixed Standard Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="固定的标准", fieldLength=22)
	Std_Fixed,
	//
	@FlyElement(name="标准最大差额", description="Maximum margin allowed for a product", help="The Standard Price Max Margin indicates the maximum margin for a product.  The margin is calculated by subtracting the original Standard price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="标准最大差额", fieldLength=22)
	Std_MaxAmt,
	//
	@FlyElement(name="标准价格最小差额", description="Minimum margin allowed for a product", help="The Standard Price Min Margin indicates the minimum margin for a product.  The margin is calculated by subtracting the original Standard price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="标准价格最小差额", fieldLength=22)
	Std_MinAmt,
	//
	@FlyElement(name="标准精度", description="Rule for rounding  calculated amounts", help="The Standard Precision defines the number of decimal places that amounts will be rounded to for accounting transactions and documents.", dataType=FlyDataType.Integer, entityType="D", printName="标准精度", fieldLength=22)
	StdPrecision,
	//
	@FlyElement(name="标准价格圆整", description="Rounding rule for calculated price", help="The Standard Price Rounding indicates how the final Standard price will be rounded.", dataType=FlyDataType.List, entityType="D", printName="标准价格圆整", fieldLength=1)
	Std_Rounding,
	//
	@FlyElement(name="Step type", description="Migration step type", dataType=FlyDataType.NONE, entityType="D", printName="Step Type", fieldLength=0)
	StepType,
	//
	@FlyElement(name="费用报表", description="时间和费用报表", dataType=FlyDataType.ID, entityType="D", printName="费用报表", fieldLength=22)
	S_TimeExpense_ID,
	//
	@FlyElement(name="费用明细", description="时间和费用报表行", dataType=FlyDataType.ID, entityType="D", printName="费用明细", fieldLength=22)
	S_TimeExpenseLine_ID,
	//
	@FlyElement(name="时间类型", description="时间的类型记录", help="Differentiate time types for reporting purposes (In parallel to Activities)", dataType=FlyDataType.TableDirect, entityType="D", printName="时间类型", fieldLength=22)
	S_TimeType_ID,
	//
	@FlyElement(name="对帐单金额", description="对帐单金额", help="The Statement Amount indicates the amount of a single statement line.", dataType=FlyDataType.Amount, entityType="D", printName="对帐单金额", fieldLength=22)
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
	@FlyElement(name="训练类", description="The actual training class instance", help="一个预定的类", dataType=FlyDataType.ID, entityType="D", printName="训练类", fieldLength=22)
	S_Training_Class_ID,
	//
	@FlyElement(name="训练", description="重复的训练", help="The training may have multiple actual classes", dataType=FlyDataType.TableDirect, entityType="D", printName="训练", fieldLength=22)
	S_Training_ID,
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
	@FlyElement(name="订购日期", description="Date the contact actively subscribed", help="Date the contact subscribe the interest area", dataType=FlyDataType.Date, entityType="D", printName="订购日期", fieldLength=7)
	SubscribeDate,
	//
	@FlyElement(name="替代", description="Product which can be used in place of another product", help="The Substitute identifies the product to be used as a substitute for this product.", dataType=FlyDataType.Search, entityType="D", printName="替代", fieldLength=22)
	Substitute_ID,
	//
	@FlyElement(name="Success", dataType=FlyDataType.String, entityType="D", printName="Success", fieldLength=20)
	Success,
	//
	@FlyElement(name="后缀", description="在数字後面的后缀", help="The Suffix indicates the characters to append to the document number.", dataType=FlyDataType.String, entityType="D", printName="后缀", fieldLength=255)
	Suffix,
	//
	@FlyElement(name="Generate Suggested Requisition Report", dataType=FlyDataType.Button, entityType="D", printName="Generate Suggested Requisition Report", fieldLength=1)
	SuggestedRequisitionReport,
	//
	@FlyElement(name="汇总", description="Textual summary of this request", help="The Summary allows free form text entry of a recap of this request.", dataType=FlyDataType.Text, entityType="D", printName="汇总", fieldLength=2000)
	Summary,
	//
	@FlyElement(name="Sum Qty on Hand", description="Summary of product on hand in all locators", dataType=FlyDataType.Quantity, entityType="D", printName="Sum Qty on Hand", fieldLength=131089)
	SumQtyOnHand,
	//
	@FlyElement(name="管理者", description="Supervisor for this user - used for escalation", help="The Supervisor indicates who will be used for forwarding and escalating issues for this user.", dataType=FlyDataType.Search, entityType="D", printName="管理者", fieldLength=22)
	Supervisor_ID,
	//
	@FlyElement(name="Support EMail", description="EMail address to send support information and updates to", help="If not entered the registered email is used.", dataType=FlyDataType.String, entityType="D", printName="Support EMail", fieldLength=60)
	SupportEMail,
	//
	@FlyElement(name="Support Expires", description="Date when the Adempiere support expires", help="Check http://www.adempiere.org for support options", dataType=FlyDataType.Date, entityType="D", printName="Support Expires", fieldLength=7)
	SupportExpDate,
	//
	@FlyElement(name="内部用户数", description="Adempiere技术支持的单位数", help="You can purchase commercial support from ComPiere, Inc.	The fee is per 10 internal users. The number of od support units is displayed here.", dataType=FlyDataType.Integer, entityType="D", printName="内部用户数", fieldLength=22)
	SupportUnits,
	//
	@FlyElement(name="暂记平衡帐户", dataType=FlyDataType.Account, entityType="D", printName="暂记平衡帐户", fieldLength=22)
	SuspenseBalancing_Acct,
	//
	@FlyElement(name="暂记错误帐户", dataType=FlyDataType.Account, entityType="D", printName="暂记错误帐户", fieldLength=22)
	SuspenseError_Acct,
	//
	@FlyElement(name="金融电信学会编码", description="Swift Code (Society of Worldwide Interbank Financial Telecommunications)", help="The SWIFT code is an identifier of a Bank", dataType=FlyDataType.String, entityType="D", printName="金融电信学会编码", fieldLength=20)
	SwiftCode,
	//
	@FlyElement(name="Swipe", description="Track 1 and 2 of the Credit Card", help="Swiped information for Credit Card Presence Transactions", dataType=FlyDataType.String, entityType="D", printName="Swipe", fieldLength=80)
	Swipe,
	//
	@FlyElement(name="同义字", description="同义字为名字", help="The synonym broadens the search", dataType=FlyDataType.String, entityType="D", printName="同义字", fieldLength=60)
	SynonymName,
	//
	@FlyElement(name="System Status", description="Status of the system - Support priority depends on system status", help="System status helps to prioritize support resources", dataType=FlyDataType.List, entityType="D", printName="System Status", fieldLength=1)
	SystemStatus,
	//
	@FlyElement(name="数据库表名字", description="Name of the table in the database", help="The DB Table Name indicates the name of the table in database.", dataType=FlyDataType.String, entityType="D", printName="数据库表名字", fieldLength=40)
	TableName,
	//
	@FlyElement(name="定位键水平", description="Hierarchical Tab Level (0 = top)", help="Hierarchical level of the tab. If the level is 0, it is the top entity. Level 1 entries are dependent on level 0, etc.", dataType=FlyDataType.Integer, entityType="D", printName="定位键水平", fieldLength=22)
	TabLevel,
	//
	@FlyElement(name="金额", dataType=FlyDataType.Amount, entityType="D", printName="金额", fieldLength=22)
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
	@FlyElement(name="目标网址", description="网址为目标", help="目标位置的网址", dataType=FlyDataType.URL, entityType="D", printName="目标网址", fieldLength=120)
	TargetURL,
	//
	@FlyElement(name="Task Status", description="Status of the Task", help="Completion Rate and Status of the Task", dataType=FlyDataType.List, entityType="D", printName="Task Status", fieldLength=1)
	TaskStatus,
	//
	@FlyElement(name="税金额", description="文档税金额", help="The Tax Amount displays the total tax amount for a document.", dataType=FlyDataType.Amount, entityType="D", printName="税", fieldLength=22)
	TaxAmt,
	//
	@FlyElement(name="税基金额", description="Base for calculating the tax amount", help="The Tax Base Amount indicates the base amount used for calculating the tax amount.", dataType=FlyDataType.Amount, entityType="D", printName="税基金额", fieldLength=22)
	TaxBaseAmt,
	//
	@FlyElement(name="Tax Category Name", description="Name of tax category", dataType=FlyDataType.String, entityType="D", printName="Tax Category Name", fieldLength=60)
	TaxCategoryName,
	//
	@FlyElement(name="Tax Correction", description="Type of Tax Correction", help="Determines if/when tax is corrected. Discount could be agreed or granted underpayments; Write-off may be partial or complete write-off.", dataType=FlyDataType.List, entityType="D", printName="Tax Correction", fieldLength=1)
	TaxCorrectionType,
	//
	@FlyElement(name="税号", description="税务号", help="The Tax ID field identifies the legal Identification number of this Entity.", dataType=FlyDataType.String, entityType="D", printName="税号", fieldLength=20)
	TaxID,
	//
	@FlyElement(name="税标记", description="Short form for Tax to be printed on documents", help="The Tax Indicator identifies the short name that will print on documents referencing this tax.", dataType=FlyDataType.String, entityType="D", printName="税标记", fieldLength=10)
	TaxIndicator,
	//
	@FlyElement(name="Tax Line Total", description="Tax Line Total Amount", dataType=FlyDataType.Amount, entityType="D", printName="Line Total", fieldLength=22)
	TaxLineTotal,
	//
	@FlyElement(name="Indented BOM Report", dataType=FlyDataType.ID, entityType="D", printName="Indented BOM Report", fieldLength=10)
	T_BOM_Indented_ID,
	//
	@FlyElement(name="税信用", description="Account for Tax you can reclaim", help="The Tax Credit Account indicates the account used to record taxes that can be reclaimed", dataType=FlyDataType.Account, entityType="D", printName="税信用", fieldLength=22)
	T_Credit_Acct,
	//
	@FlyElement(name="日期", dataType=FlyDataType.Date, entityType="D", printName="日期", fieldLength=7)
	T_Date,
	//
	@FlyElement(name="日期时间", dataType=FlyDataType.DateTime, entityType="D", printName="日期时间", fieldLength=7)
	T_DateTime,
	//
	@FlyElement(name="应付税", description="Account for Tax you have to pay", help="The Tax Due Account indicates the account used to record taxes that you are liable to pay.", dataType=FlyDataType.Account, entityType="D", printName="应付税", fieldLength=22)
	T_Due_Acct,
	//
	@FlyElement(name="Teardown Time", description="Time at the end of the operation", help="Once per operation", dataType=FlyDataType.Number, entityType="D", printName="Teardown Time", fieldLength=22)
	TeardownTime,
	//
	@FlyElement(name="TemplateXST", description="Contains the template code itself", help="Here we include the template code itself", dataType=FlyDataType.LongText, entityType="D", printName="TemplateXST", fieldLength=0)
	TemplateXST,
	//
	@FlyElement(name="投标类型", description="付款方法", help="The Tender Type indicates the method of payment (ACH, Credit Card, Check)", dataType=FlyDataType.List, entityType="D", printName="投标类型", fieldLength=1)
	TenderType,
	//
	@FlyElement(name="测试ID", dataType=FlyDataType.ID, entityType="D", printName="测试ID", fieldLength=22)
	Test_ID,
	//
	@FlyElement(name="Test Value", description="Value to test", dataType=FlyDataType.NONE, entityType="D", printName="Test Value", fieldLength=0)
	TestValue,
	//
	@FlyElement(name="税费用", description="Account for paid tax you cannot reclaim", help="The Tax Expense Account indicates the account used to record the taxes that have been paid that cannot be reclaimed.", dataType=FlyDataType.Account, entityType="D", printName="税费用", fieldLength=22)
	T_Expense_Acct,
	//
	@FlyElement(name="Description", dataType=FlyDataType.Memo, entityType="D", printName="Description", fieldLength=2000)
	Text,
	//
	@FlyElement(name="Details", dataType=FlyDataType.Text, entityType="D", printName="Details", fieldLength=4000)
	TextDetails,
	//
	@FlyElement(name="文本消息", description="文本消息", dataType=FlyDataType.Text, entityType="D", printName="消息", fieldLength=2000)
	TextMsg,
	//
	@FlyElement(name="门槛最大", description="Maximum gross amount for withholding calculation  (0=no limit)", help="The Threshold maximum indicates the maximum gross amount to be used in the withholding calculation .  A value of 0 indicates there is no limit.", dataType=FlyDataType.Amount, entityType="D", printName="门槛最大", fieldLength=22)
	ThresholdMax,
	//
	@FlyElement(name="最小阈值", description="Minimum gross amount for withholding calculation", help="The Threshold Minimum indicates the minimum gross amount to be used in the withholding calculation.", dataType=FlyDataType.Amount, entityType="D", printName="最小阈值", fieldLength=22)
	Thresholdmin,
	//
	@FlyElement(name="Ticket Handler Class Name", description="Java Classname for Ticket Handler", help="The Classname identifies the Java classname used by this report or process.", dataType=FlyDataType.String, entityType="D", printName="Ticket Handler Class Name", fieldLength=60)
	TicketClassName,
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
	@FlyElement(name="时间段结束", description="时间段结束", help="终止时间时间留细长的孔", dataType=FlyDataType.Time, entityType="D", printName="时间段结束", fieldLength=7)
	TimeSlotEnd,
	//
	@FlyElement(name="时间段开始", description="时间段开始", help="出发时间时间留细长的孔", dataType=FlyDataType.Time, entityType="D", printName="时间段开始", fieldLength=7)
	TimeSlotStart,
	//
	@FlyElement(name="Time Unit", description="The unit of time for grouping chart data.", dataType=FlyDataType.List, entityType="D", printName="Time Unit", fieldLength=1)
	TimeUnit,
	//
	@FlyElement(name="整数", dataType=FlyDataType.Integer, entityType="D", printName="整数", fieldLength=22)
	T_Integer,
	//
	@FlyElement(name="名称", description="Name this entity is referred to as", help="The Title indicates the name that an entity is referred to as.", dataType=FlyDataType.String, entityType="D", printName="名称", fieldLength=60)
	Title,
	//
	@FlyElement(name="应负债", description="Account for Tax declaration liability", help="The Tax Liability Account indicates the account used to record your tax liability declaration.", dataType=FlyDataType.Account, entityType="D", printName="应负债", fieldLength=22)
	T_Liability_Acct,
	//
	@FlyElement(name="数字", dataType=FlyDataType.Number, entityType="D", printName="数字", fieldLength=22)
	T_Number,
	//
	@FlyElement(name="To be Invoiced", description="If Shipment line is marked as ToBeInvoiced='N' then it is included in the generated Invoice line with price 0.0", dataType=FlyDataType.YesNo, entityType="D", printName="To be Invoiced", fieldLength=1)
	ToBeInvoiced,
	//
	@FlyElement(name="到", description="接收国家", help="The To Country indicates the receiving country on a document", dataType=FlyDataType.Table, entityType="D", printName="到", fieldLength=22)
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
	@FlyElement(name="到", description="接收区域", help="The To Region indicates the receiving region on a document", dataType=FlyDataType.Table, entityType="D", printName="到", fieldLength=22)
	To_Region_ID,
	//
	@FlyElement(name="总金额", description="总金额", help="The Total Amount indicates the total document amount.", dataType=FlyDataType.Amount, entityType="D", printName="总金额", fieldLength=22)
	TotalAmt,
	//
	@FlyElement(name="总贷方", description="Total Credit in document currency", help="The Total Credit indicates the total credit amount for a journal or journal batch in the source currency", dataType=FlyDataType.Amount, entityType="D", printName="总贷方", fieldLength=22)
	TotalCr,
	//
	@FlyElement(name="总借方", description="Total debit in document currency", help="The Total Debit indicates the total debit amount for a journal or journal batch in the source currency", dataType=FlyDataType.Amount, entityType="D", printName="总借方", fieldLength=22)
	TotalDr,
	//
	@FlyElement(name="总发票金额", description="Cumulative total lifetime invoice amount", help="The cumulative total lifetime invoice amount is used to calculate the total average price", dataType=FlyDataType.Amount, entityType="D", printName="总发票金额", fieldLength=22)
	TotalInvAmt,
	//
	@FlyElement(name="总发票成本", description="总发票花费", dataType=FlyDataType.CostsPrices, entityType="D", printName="总发票成本", fieldLength=22)
	TotalInvCost,
	//
	@FlyElement(name="总发票数量", description="Cumulative total lifetime invoice quantity", help="The cumulative total lifetime invoice quantity is used to calculate the total average price", dataType=FlyDataType.Quantity, entityType="D", printName="总发票数量", fieldLength=22)
	TotalInvQty,
	//
	@FlyElement(name="明细总数", description="所有文件总数", help="The Total amount displays the total of all lines in document currency", dataType=FlyDataType.Amount, entityType="D", printName="明细总数", fieldLength=22)
	TotalLines,
	//
	@FlyElement(name="Open Balance", description="Total Open Balance Amount in primary Accounting Currency", help="The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.	Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).", dataType=FlyDataType.Amount, entityType="D", printName="Open Balance", fieldLength=22)
	TotalOpenBalance,
	//
	@FlyElement(name="Total Quantity", description="Total Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Total Qty", fieldLength=22)
	TotalQty,
	//
	@FlyElement(name="数量", dataType=FlyDataType.Quantity, entityType="D", printName="数量", fieldLength=22)
	T_Qty,
	//
	@FlyElement(name="Tracking Info", dataType=FlyDataType.String, entityType="D", printName="Tracking Info", fieldLength=255)
	TrackingInfo,
	//
	@FlyElement(name="追踪号", description="物料出货追踪数", dataType=FlyDataType.String, entityType="D", printName="追踪号", fieldLength=60)
	TrackingNo,
	//
	@FlyElement(name="追踪网址", description="URL of the shipper to track shipments", help="The variable @TrackingNo@ in the URL is replaced by the actual tracking number of the shipment.", dataType=FlyDataType.URL, entityType="D", printName="追踪网址", fieldLength=120)
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
	@FlyElement(name="Transition Code", description="Code resulting in TRUE of FALSE", help="The transition is executed, if the code results in TRUE (or is empty)", dataType=FlyDataType.Text, entityType="D", printName="Transition Code", fieldLength=2000)
	TransitionCode,
	//
	@FlyElement(name="税应收帐款", description="Account for Tax credit after tax declaration", help="The Tax Receivables Account indicates the account used to record the tax credit amount after your tax declaration.", dataType=FlyDataType.Account, entityType="D", printName="税应收帐款", fieldLength=22)
	T_Receivables_Acct,
	//
	@FlyElement(name="类型|区域", description="Element this tree is built on (i.e Product, Business Partner)", help="The Tree Type   Area field determines the type of tree this is.  For example, you may define one tree for your Products and another tree for your Business Partners.", dataType=FlyDataType.List, entityType="D", printName="类型|区域", fieldLength=2)
	TreeType,
	//
	@FlyElement(name="T_ReplenishPlan ID", dataType=FlyDataType.NONE, entityType="D", printName="T_ReplenishPlan ID", fieldLength=10)
	T_ReplenishPlan_ID,
	//
	@FlyElement(name="交易金额", description="一交易的金额", help="The Transaction Amount indicates the amount for a single transaction.", dataType=FlyDataType.Amount, entityType="D", printName="交易 Amt", fieldLength=22)
	TrxAmt,
	//
	@FlyElement(name="Transaction", description="Name of the transaction", help="Internal name of the transaction", dataType=FlyDataType.String, entityType="D", printName="Trx Name", fieldLength=60)
	TrxName,
	//
	@FlyElement(name="已接受交易", dataType=FlyDataType.DateTime, entityType="D", printName="已接收交易", fieldLength=7)
	TrxReceived,
	//
	@FlyElement(name="已发送交易", dataType=FlyDataType.DateTime, entityType="D", printName="已发送交易", fieldLength=7)
	TrxSent,
	//
	@FlyElement(name="交易类型", description="Type of credit card transaction", help="The Transaction Type indicates the type of transaction to be submitted to the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="交易类型", fieldLength=1)
	TrxType,
	//
	@FlyElement(name="类型", description="Type of Validation (SQL, Java Script, Java Language)", help="The Type indicates the type of validation that will occur.  This can be SQL, Java Script or Java Language.", dataType=FlyDataType.List, entityType="D", printName="类型", fieldLength=1)
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
	@FlyElement(name="未实现的收入", description="未实现收入帐户", help="The Unearned Revenue indicates the account used for recording invoices sent for products or services not yet delivered.  It is used in revenue recognition", dataType=FlyDataType.Account, entityType="D", printName="未实现的收入", fieldLength=22)
	UnEarnedRevenue_Acct,
	//
	@FlyElement(name="Uninstall", dataType=FlyDataType.YesNo, entityType="D", printName="Uninstall", fieldLength=1)
	Uninstall,
	//
	@FlyElement(name="Runtime per Unit", description="Time to produce one unit", dataType=FlyDataType.Number, entityType="D", printName="Unit Runtine", fieldLength=22)
	UnitRuntime,
	//
	@FlyElement(name="UnitsPerPack", description="The Units Per Pack indicates the no of units of a product packed together.", dataType=FlyDataType.Integer, entityType="D", printName="UnitsPerPack", fieldLength=14)
	UnitsPerPack,
	//
	@FlyElement(name="每货盘单位", description="每货盘单位", help="The Units per Pallet indicates the number of units of this product which fit on a pallet.", dataType=FlyDataType.CostsPrices, entityType="D", printName="每货盘单位", fieldLength=22)
	UnitsPerPallet,
	//
	@FlyElement(name="Unix Archive Path", dataType=FlyDataType.String, entityType="D", printName="Unix Archive Path", fieldLength=255)
	UnixArchivePath,
	//
	@FlyElement(name="Unix Attachment Path", dataType=FlyDataType.String, entityType="D", printName="Unix Attachment Path", fieldLength=255)
	UnixAttachmentPath,
	//
	@FlyElement(name="UnlockingTime", description="Time at which the terminal should be unlocked", dataType=FlyDataType.DateTime, entityType="D", printName="UnlockingTime", fieldLength=7)
	UnlockingTime,
	//
	@FlyElement(name="未实现增益帐户", description="Unrealized Gain Account for currency revaluation", help="The Unrealized Gain Account indicates the account to be used when recording gains achieved from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="未实现增益帐户", fieldLength=22)
	UnrealizedGain_Acct,
	//
	@FlyElement(name="U未实现损失帐户", description="Unrealized Loss Account for currency revaluation", help="The Unrealized Loss Account indicates the account to be used when recording losses incurred from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="U未实现损失帐户", fieldLength=22)
	UnrealizedLoss_Acct,
	//
	@FlyElement(name="符号", description="度量单位的符号", help="The Symbol identifies the Symbol to be displayed and printed for a Unit of Measure", dataType=FlyDataType.String, entityType="D", printName="UoM", fieldLength=10)
	UOMSymbol,
	//
	@FlyElement(name="UOM Type", dataType=FlyDataType.List, entityType="D", printName="UOM Type", fieldLength=2)
	UOMType,
	//
	@FlyElement(name="UPC/EAN条码", description="条形码", help="Use this field to enter the bar code for the product in any of the bar code symbologies (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN, ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI Plessey, and Pharmacode) ", dataType=FlyDataType.String, entityType="D", printName="UPC/EAN条码", fieldLength=30)
	UPC,
	//
	@FlyElement(name="Update Balances", description="Update Accounting Balances", dataType=FlyDataType.NONE, entityType="D", printName="UpdateBalances", fieldLength=0)
	UpdateBalances,
	//
	@FlyElement(name="已更新", description="本记录更新日期", help="The Updated field indicates the date that this record was updated.", dataType=FlyDataType.DateTime, entityType="D", printName="已更新", fieldLength=7)
	Updated,
	//
	@FlyElement(name="更新人", description="更新该记录用户", help="The Updated By field indicates the user who updated this record.", dataType=FlyDataType.Table, entityType="D", printName="更新人", fieldLength=22)
	UpdatedBy,
	//
	@FlyElement(name="UpdatedDate", dataType=FlyDataType.String, entityType="D", printName="UpdatedDate", fieldLength=50)
	UpdatedDate,
	//
	@FlyElement(name="更新缺省值帐户", description="更新缺省值帐户", dataType=FlyDataType.NONE, entityType="D", printName="更新缺省值帐户", fieldLength=0)
	UpdateDefaultAccounts,
	//
	@FlyElement(name="更新数量", dataType=FlyDataType.Button, entityType="D", printName="更新数量", fieldLength=1)
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
	@FlyElement(name="网址", description="网址", help="The URL defines an online address for this Business Partner.", dataType=FlyDataType.URL, entityType="D", printName="网址", fieldLength=120)
	URL,
	//
	@FlyElement(name="Role Menu", dataType=FlyDataType.ID, entityType="D", printName="Role Menu", fieldLength=22)
	U_RoleMenu_ID,
	//
	@FlyElement(name="使用币种平衡", dataType=FlyDataType.YesNo, entityType="D", printName="使用币种平衡", fieldLength=1)
	UseCurrencyBalancing,
	//
	@FlyElement(name="UseDate", dataType=FlyDataType.Date, entityType="D", printName="UseDate", fieldLength=7)
	UseDate,
	//
	@FlyElement(name="Usable Life - Months", description="Months of the usable life of the asset", dataType=FlyDataType.Integer, entityType="D", printName="可使用的生活月", fieldLength=22)
	UseLifeMonths,
	//
	@FlyElement(name="Use Life - Months (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Use Life - Months (fiscal)", fieldLength=0)
	UseLifeMonths_F,
	//
	@FlyElement(name="Usable Life - Years", description="Years of the usable life of the asset", dataType=FlyDataType.Integer, entityType="D", printName="可使用的生活年", fieldLength=22)
	UseLifeYears,
	//
	@FlyElement(name="Use Life - Years (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Use Life - Years (fiscal)", fieldLength=0)
	UseLifeYears_F,
	//
	@FlyElement(name="User1", description="用户定义元素 #1", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User1", fieldLength=22)
	User1_ID,
	//
	@FlyElement(name="User2", description="用户定义元素 #2", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User2", fieldLength=22)
	User2_ID,
	//
	@FlyElement(name="User List 3", description="User defined list element #3", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User 3", fieldLength=22)
	User3_ID,
	//
	@FlyElement(name="User List 4", description="User defined list element #4", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User 4", fieldLength=22)
	User4_ID,
	//
	@FlyElement(name="用户代理人", description="使用过的浏览器", dataType=FlyDataType.String, entityType="D", printName="用户代理人", fieldLength=255)
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
	@FlyElement(name="用户ID", description="用户ID", help="The User ID identifies a user and allows access to records or processes.", dataType=FlyDataType.String, entityType="D", printName="用户ID", fieldLength=60)
	UserID,
	//
	@FlyElement(name="用户级别", description="系统 客户 机构", help="The User Level field determines if users of this Role will have access to System level data, Organization level data, Client level data or Client and Organization level data.", dataType=FlyDataType.List, entityType="D", printName="用户级别", fieldLength=3)
	UserLevel,
	//
	@FlyElement(name="用户名字", description="User responsible for the System", help="The responsible person for the system", dataType=FlyDataType.String, entityType="D", printName="用户名字", fieldLength=60)
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
	@FlyElement(name="使用暂记平衡", dataType=FlyDataType.YesNo, entityType="D", printName="使用暂记平衡", fieldLength=1)
	UseSuspenseBalancing,
	//
	@FlyElement(name="使用暂记错误", dataType=FlyDataType.YesNo, entityType="D", printName="使用暂记错误", fieldLength=1)
	UseSuspenseError,
	//
	@FlyElement(name="使用单位", description="Currently used units of the assets", dataType=FlyDataType.Integer, entityType="D", printName="使用单位", fieldLength=22)
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
	@FlyElement(name="值到", description="值到", dataType=FlyDataType.String, entityType="D", printName="值到", fieldLength=40)
	Value2,
	//
	@FlyElement(name="Value Column", description="Fully qualified data value column", help="The Value Column contains the value data for the chart", dataType=FlyDataType.String, entityType="D", printName="Value Column", fieldLength=60)
	ValueColumn,
	//
	@FlyElement(name="最大值", description="字段的最大值", help="The Maximum Value indicates the highest allowable value for a field", dataType=FlyDataType.String, entityType="D", printName="最大值", fieldLength=20)
	ValueMax,
	//
	@FlyElement(name="最小值", description="字段最小量值", help="The Minimum Value indicates the lowest  allowable value for a field.", dataType=FlyDataType.String, entityType="D", printName="最小值", fieldLength=20)
	ValueMin,
	//
	@FlyElement(name="Value", description="Numeric Value", dataType=FlyDataType.Number, entityType="D", printName="Value", fieldLength=22)
	ValueNumber,
	//
	@FlyElement(name="有效的日期", description="付款已到期日", help="The Effective Date indicates the date that money is available from the bank.", dataType=FlyDataType.Date, entityType="D", printName="有效的日期", fieldLength=7)
	ValutaDate,
	//
	@FlyElement(name="V_Date", dataType=FlyDataType.Date, entityType="D", printName="V_Date", fieldLength=7)
	V_Date,
	//
	@FlyElement(name="供应商分类", description="供应商的产品种类", help="The Vendor Category identifies the category used by the vendor for this product.", dataType=FlyDataType.String, entityType="D", printName="供应商分类", fieldLength=30)
	VendorCategory,
	//
	@FlyElement(name="供应商ID", description="Vendor ID for the Payment Processor", dataType=FlyDataType.String, entityType="D", printName="供应商ID", fieldLength=60)
	VendorID,
	//
	@FlyElement(name="供应商", dataType=FlyDataType.Table, entityType="D", printName="供应商", fieldLength=22)
	Vendor_ID,
	//
	@FlyElement(name="Vendor Open Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Vendor Open Invoices", fieldLength=0)
	VendorOpenInvoices,
	//
	@FlyElement(name="伙伴产品号", description="供应商的产品未", help="The Vendor Product Number identifies the number used by the vendor for this product.", dataType=FlyDataType.String, entityType="D", printName="BP产品号", fieldLength=40)
	VendorProductNo,
	//
	@FlyElement(name="版本", description="Version of the table definition", help="The Version indicates the version of this table definition.", dataType=FlyDataType.Amount, entityType="D", printName="版本", fieldLength=22)
	Version,
	//
	@FlyElement(name="版本号", description="版本数字", dataType=FlyDataType.String, entityType="D", printName="版本号", fieldLength=20)
	VersionNo,
	//
	@FlyElement(name="值格式", description="Format of the value; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任何的个性	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="值格式", fieldLength=60)
	VFormat,
	//
	@FlyElement(name="供应商负债", description="供应商负债帐户", help="The Vendor Liability account indicates the account used for recording transactions for vendor liabilities", dataType=FlyDataType.Account, entityType="D", printName="供应商负债", fieldLength=22)
	V_Liability_Acct,
	//
	@FlyElement(name="供应商服务负债", description="Account for Vender Service Liability", help="The Vendor Service Liability account indicates the account to use for recording service liabilities.  It is used if you need to distinguish between Liability for products and services", dataType=FlyDataType.Account, entityType="D", printName="供应商服务负债", fieldLength=22)
	V_Liability_Services_Acct,
	//
	@FlyElement(name="V_Number", dataType=FlyDataType.String, entityType="D", printName="V_Number", fieldLength=22)
	V_Number,
	//
	@FlyElement(name="宣述授权码", description="Voice Authorization Code from credit card company", help="The Voice Authorization Code indicates the code received from the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="宣述授权码", fieldLength=20)
	VoiceAuthCode,
	//
	@FlyElement(name="体积", description="产品的体积", help="The Volume indicates the volume of the product in the Volume UOM of the Client", dataType=FlyDataType.Amount, entityType="D", printName="体积", fieldLength=22)
	Volume,
	//
	@FlyElement(name="供应商预付款", description="Account for Vendor Prepayments", help="The Vendor Prepayment Account indicates the account used to record prepayments from a vendor.", dataType=FlyDataType.Account, entityType="D", printName="供应商预付款", fieldLength=22)
	V_Prepayment_Acct,
	//
	@FlyElement(name="V_String", dataType=FlyDataType.String, entityType="D", printName="V_String", fieldLength=2000)
	V_String,
	//
	@FlyElement(name="广告", description="网络广告", help="网络上的广告", dataType=FlyDataType.ID, entityType="D", printName="广告", fieldLength=22)
	W_Advertisement_ID,
	//
	@FlyElement(name="等待时间", description="Workflow Simulation Waiting time", help="Amount of time needed to prepare the performance of the task on Duration Units", dataType=FlyDataType.Integer, entityType="D", printName="等待时间", fieldLength=22)
	WaitingTime,
	//
	@FlyElement(name="Wait Time", description="Time in minutes to wait (sleep)", help="Time in minutes to be suspended (sleep)", dataType=FlyDataType.Integer, entityType="D", printName="Wait Time", fieldLength=22)
	WaitTime,
	//
	@FlyElement(name="仓库位置", description="Warehouse Location Address", help="仓库的地址", dataType=FlyDataType.Location, entityType="D", printName="仓库位置", fieldLength=22)
	Warehouse_Location_ID,
	//
	@FlyElement(name="Warehouse", description="Warehouse Name", dataType=FlyDataType.String, entityType="D", printName="Warehouse", fieldLength=60)
	WarehouseName,
	//
	@FlyElement(name="仓库关键字", description="仓库的关键字", help="关键字", dataType=FlyDataType.String, entityType="D", printName="仓库关键字", fieldLength=40)
	WarehouseValue,
	//
	@FlyElement(name="W_Basket_ID", description="购物篮", help="暂时的购物篮", dataType=FlyDataType.ID, entityType="D", printName="W_Basket_ID", fieldLength=22)
	W_Basket_ID,
	//
	@FlyElement(name="购物篮明细", description="Web Basket Line", help="暂时的购物篮线", dataType=FlyDataType.ID, entityType="D", printName="购物篮明细", fieldLength=22)
	W_BasketLine_ID,
	//
	@FlyElement(name="点击计数", description="网络点击管理", help="网络点击管理", dataType=FlyDataType.TableDirect, entityType="D", printName="点击计数", fieldLength=22)
	W_ClickCount_ID,
	//
	@FlyElement(name="网络点击", description="个别的网络点击", help="网络点击 Datails", dataType=FlyDataType.ID, entityType="D", printName="网络点击", fieldLength=22)
	W_Click_ID,
	//
	@FlyElement(name="柜台计数", description="网络柜台计数管理", help="网络柜台数据", dataType=FlyDataType.ID, entityType="D", printName="柜台计数", fieldLength=22)
	W_CounterCount_ID,
	//
	@FlyElement(name="网络柜台", description="个人计数点击", help="网络柜台明细", dataType=FlyDataType.ID, entityType="D", printName="网络柜台", fieldLength=22)
	W_Counter_ID,
	//
	@FlyElement(name="储入仓库差额", description="储入仓库差额帐户", help="The Warehouse Differences Account indicates the account used recording differences identified during inventory counts.", dataType=FlyDataType.Account, entityType="D", printName="储入仓库差额", fieldLength=22)
	W_Differences_Acct,
	//
	@FlyElement(name="Web Context", description="Web Server Context - e.g. /wstore", help="Unique Web Server Context for this Web Store - will set context-root in application.xml.	The web context usually starts with / and needs to be a valid context name (not checked).", dataType=FlyDataType.String, entityType="D", printName="Web Context", fieldLength=20)
	WebContext,
	//
	@FlyElement(name="网上商店信息", description="Web Store Header Information", help="Display HTML Info in the Web Store - by default in the header.	", dataType=FlyDataType.Text, entityType="D", printName="Web信息", fieldLength=2000)
	WebInfo,
	//
	@FlyElement(name="网络定单电子邮件", description="EMail address to receive notifications when web orders were processed", help="When processig a web order, a confirmation is sent to the EMail addess of the customer from the request EMail address copying this email address when entered.", dataType=FlyDataType.String, entityType="D", printName="网络定单电子邮件", fieldLength=60)
	WebOrderEMail,
	//
	@FlyElement(name="Web参数1", description="Web参数1", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam1", dataType=FlyDataType.String, entityType="D", printName="Web参数1", fieldLength=2000)
	WebParam1,
	//
	@FlyElement(name="Web参数2", description="Web参数2", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam2", dataType=FlyDataType.String, entityType="D", printName="Web参数2", fieldLength=2000)
	WebParam2,
	//
	@FlyElement(name="Web参数3", description="Web参数3", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam3", dataType=FlyDataType.String, entityType="D", printName="Web参数3", fieldLength=2000)
	WebParam3,
	//
	@FlyElement(name="Web参数4", description="Web参数4", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam4", dataType=FlyDataType.String, entityType="D", printName="Web参数4", fieldLength=2000)
	WebParam4,
	//
	@FlyElement(name="Web参数5", description="Web Site Parameter 5 (default footer center)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam5 - By default, it is positioned in the center of the footer.", dataType=FlyDataType.Text, entityType="D", printName="Web参数5", fieldLength=2000)
	WebParam5,
	//
	@FlyElement(name="Web参数6", description="Web Site Parameter 6 (default footer right)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam6 - By default, it is positioned on the right side of the footer.", dataType=FlyDataType.Text, entityType="D", printName="Web参数6", fieldLength=2000)
	WebParam6,
	//
	@FlyElement(name="Web会话", description="Web会话ID", dataType=FlyDataType.String, entityType="D", printName="Web会话", fieldLength=40)
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
	@FlyElement(name="重量", description="一产品的重量", help="The Weight indicates the weight  of the product in the Weight UOM of the Client", dataType=FlyDataType.Amount, entityType="D", printName="重量", fieldLength=22)
	Weight,
	//
	@FlyElement(name="Weighted Amount", description="The amount adjusted by the probability.", dataType=FlyDataType.NONE, entityType="D", printName="Weighted Amount", fieldLength=0)
	WeightedAmt,
	//
	@FlyElement(name="工作流状态", description="State of the execution of the workflow", dataType=FlyDataType.List, entityType="D", printName="Wf状态", fieldLength=2)
	WFState,
	//
	@FlyElement(name="SQL的Where子句", description="Fully qualified WHERE clause", help="The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means 'tablename.columnname'.", dataType=FlyDataType.Text, entityType="D", printName="SQL的Where子句", fieldLength=2000)
	WhereClause,
	//
	@FlyElement(name="Windows Archive Path", dataType=FlyDataType.String, entityType="D", printName="Windows Archive Path", fieldLength=255)
	WindowsArchivePath,
	//
	@FlyElement(name="Windows Attachment Path", dataType=FlyDataType.String, entityType="D", printName="Windows Attachment Path", fieldLength=255)
	WindowsAttachmentPath,
	//
	@FlyElement(name="窗口类型", description="Type or classification of a Window", help="The Window Type indicates the type of window being defined (Maintain, Transaction or Query)", dataType=FlyDataType.List, entityType="D", printName="窗口类型", fieldLength=1)
	WindowType,
	//
	@FlyElement(name="Window Height", dataType=FlyDataType.Integer, entityType="D", printName="Win Height", fieldLength=22)
	WinHeight,
	//
	@FlyElement(name="库存调整", description="Account for Inventory value adjustments for Actual Costing", help="In actual costing systems, this account is used to post Inventory value adjustments. You could set it to the standard Inventory Asset account.", dataType=FlyDataType.Account, entityType="D", printName="库存调整", fieldLength=22)
	W_InvActualAdjust_Acct,
	//
	@FlyElement(name="仓库库存", description="Warehouse Inventory Asset Account", help="The Warehouse Inventory Asset Account identifies the account used for recording the value of your inventory.", dataType=FlyDataType.Account, entityType="D", printName="仓库库存", fieldLength=22)
	W_Inventory_Acct,
	//
	@FlyElement(name="Window Width", dataType=FlyDataType.Integer, entityType="D", printName="Win Width", fieldLength=22)
	WinWidth,
	//
	@FlyElement(name="扣留", description="扣交帐户", help="The Withholding Account indicates the account used to record withholdings.", dataType=FlyDataType.Account, entityType="D", printName="扣留", fieldLength=22)
	Withholding_Acct,
	//
	@FlyElement(name="Mail Message", description="Web Store Mail Message Template", dataType=FlyDataType.ID, entityType="D", printName="Mail Message", fieldLength=10)
	W_MailMsg_ID,
	//
	@FlyElement(name="工作流", description="工作流或任务", help="The Workflow field identifies a unique workflow.   A workflow is a grouping of related tasks, in a specified sequence and optionally including approvals", dataType=FlyDataType.Table, entityType="D", printName="工作流", fieldLength=22)
	Workflow_ID,
	//
	@FlyElement(name="工作流类型", description="工作流的类型", help="The type of workflow determines how the workflow is started.", dataType=FlyDataType.List, entityType="D", printName="工作流类型", fieldLength=1)
	WorkflowType,
	//
	@FlyElement(name="Workflow Key", description="Key of the Workflow to start", dataType=FlyDataType.String, entityType="D", printName="Workflow", fieldLength=40)
	WorkflowValue,
	//
	@FlyElement(name="工作流时间", description="Workflow Simulation Execution Time", help="Amount of time the performer of the activity needs to perform the task in Duration Unit", dataType=FlyDataType.Integer, entityType="D", printName="工作流时间", fieldLength=22)
	WorkingTime,
	//
	@FlyElement(name="库存估价", description="Account for Inventory Revaluation", help="The Inventory Revaluation Account identifies the account used to records changes in inventory value due to currency revaluation.", dataType=FlyDataType.Account, entityType="D", printName="库存估价", fieldLength=22)
	W_Revaluation_Acct,
	//
	@FlyElement(name="销帐", description="Account for Receivables write-off", help="The Write Off Account identifies the account to book write off transactions to.", dataType=FlyDataType.Account, entityType="D", printName="销帐", fieldLength=22)
	WriteOff_Acct,
	//
	@FlyElement(name="销帐金额", description="销帐金额", help="The Write Off Amount indicates the amount to be written off as uncollectible.", dataType=FlyDataType.Amount, entityType="D", printName="销帐", fieldLength=22)
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
	@FlyElement(name="走廊(X)", description="X dimension, e.g., Aisle", help="The X dimension indicates the Aisle a product is located in.", dataType=FlyDataType.String, entityType="D", printName="X", fieldLength=60)
	X,
	//
	@FlyElement(name="EDI 编码", description="UOM EDI Code", help="The Unit of Measure Code indicates the EDI X12 Code Data Element 355 (Unit or Basis for Measurement)", dataType=FlyDataType.String, entityType="D", printName="EDI 编码", fieldLength=4)
	X12DE355,
	//
	@FlyElement(name="X 位置", description="Absolute X (horizontal) position in 1 72 of an inch", help="Absolute X (horizontal) position in 1 72 of an inch", dataType=FlyDataType.Integer, entityType="D", printName="X 位置", fieldLength=22)
	XPosition,
	//
	@FlyElement(name="X 空间", description="Relative X (horizontal) space in 1 72 of an inch", help="Relative X (horizontal) space in 1 72 of an inch in relation to the end of the previous item.", dataType=FlyDataType.Integer, entityType="D", printName="X 空间", fieldLength=22)
	XSpace,
	//
	@FlyElement(name="XY Separator", description="The separator between the X and Y function.", dataType=FlyDataType.String, entityType="D", printName="XY Separator", fieldLength=20)
	XYSeparator,
	//
	@FlyElement(name="货柜(Y)", description="Y dimension, e.g., Bin", help="The Y dimension indicates the Bin a product is located in", dataType=FlyDataType.String, entityType="D", printName="Y", fieldLength=60)
	Y,
	//
	@FlyElement(name="Y 位置", description="Absolute Y (vertical) position in 1 72 of an inch", help="Absolute Y (vertical) position in 1 72 of an inch", dataType=FlyDataType.Integer, entityType="D", printName="Y 位置", fieldLength=22)
	YPosition,
	//
	@FlyElement(name="Y 空间", description="Relative Y (vertical) space in 1 72 of an inch", help="Relative Y (vertical) space in 1 72 of an inch in relation to the end of the previous item.", dataType=FlyDataType.Integer, entityType="D", printName="Y 空间", fieldLength=22)
	YSpace,
	//
	@FlyElement(name="货层(Z)", description="Z dimension, e.g., Level", help="The Z dimension indicates the Level a product is located in.", dataType=FlyDataType.String, entityType="D", printName="Z", fieldLength=60)
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
	ZulFilePath,
}