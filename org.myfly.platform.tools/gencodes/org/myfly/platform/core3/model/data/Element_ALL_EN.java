package org.myfly.platform.core3.model.data;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyElement;

public enum Element_ALL_EN{
	//
	@FlyElement(columnName="A_Account_Number", name="A_Account_Number", dataType=FlyDataType.Account, entityType="D", printName="A_Account_Number", fieldLength=22)
	aAccountNumber,
	//
	@FlyElement(columnName="A_Account_Number_Acct", name="A_Account_Number_Acct", dataType=FlyDataType.NONE, entityType="D", printName="A_Account_Number_Acct", fieldLength=0)
	aAccountNumberAcct,
	//
	@FlyElement(columnName="A_Accumdepreciation_Acct", name="Accumulated Depreciation Account", dataType=FlyDataType.Account, entityType="D", printName="Accumulated Depreciation Account", fieldLength=40)
	aAccumdepreciationAcct,
	//
	@FlyElement(columnName="A_Accumdepreciation_Acct_New", name="New Accum Depreciation Acct", dataType=FlyDataType.Account, entityType="D", printName="New Accum Depreciation Acct", fieldLength=22)
	aAccumdepreciationAcctNew,
	//
	@FlyElement(columnName="A_Accumdepreciation_Acct_Str", name="Old Asset Cost Acct", dataType=FlyDataType.String, entityType="D", printName="Old Asset Cost Acct", fieldLength=40)
	aAccumdepreciationAcctStr,
	//
	@FlyElement(columnName="A_Accumdepreciation_New_Acct", name="Accumulated Depreciation Account (new)", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Depreciation Account (new)", fieldLength=0)
	aAccumdepreciationNewAcct,
	//
	@FlyElement(columnName="A_Accumulated_Depr", name="Accumulated Depreciation", dataType=FlyDataType.Amount, entityType="D", printName="Accumulated Depreciation", fieldLength=22)
	aAccumulatedDepr,
	//
	@FlyElement(columnName="A_Accumulated_Depr_Adjust", name="Adjust Accumulated Depreciation", dataType=FlyDataType.NONE, entityType="D", printName="Adjust Accumulated Depreciation", fieldLength=0)
	aAccumulatedDeprAdjust,
	//
	@FlyElement(columnName="A_Accumulated_Depr_Delta", name="Accumulated Depreciation (delta)", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Depreciation (delta)", fieldLength=0)
	aAccumulatedDeprDelta,
	//
	@FlyElement(columnName="A_Accumulated_Depr_F", name="Accumulated Depreciation (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Depreciation (fiscal)", fieldLength=0)
	aAccumulatedDeprF,
	//
	@FlyElement(columnName="A_Accumulated_Depr_F_Delta", name="Accumulated Depreciation - fiscal (delta)", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Depreciation - fiscal (delta)", fieldLength=0)
	aAccumulatedDeprFDelta,
	//
	@FlyElement(columnName="A_Activation_Method", name="Activation Method", dataType=FlyDataType.NONE, entityType="D", printName="Activation Method", fieldLength=0)
	aActivationMethod,
	//
	@FlyElement(columnName="A_Amount_Split", name="Amount Split", dataType=FlyDataType.Amount, entityType="D", printName="Amount Split", fieldLength=22)
	aAmountSplit,
	//
	@FlyElement(columnName="A_Asset_Acct", name="Asset Acct", dataType=FlyDataType.Account, entityType="D", printName="AssetAcct", fieldLength=40)
	aAssetAcct,
	//
	@FlyElement(columnName="A_Asset_Acct_ID", name="A_Asset_Acct_ID", dataType=FlyDataType.Integer, entityType="D", printName="A_Asset_Acct_ID", fieldLength=22)
	aAssetAcctID,
	//
	@FlyElement(columnName="A_Asset_Acct_New", name="New Asset Cost Acct", dataType=FlyDataType.Account, entityType="D", printName="New Asset Cost Acct", fieldLength=22)
	aAssetAcctNew,
	//
	@FlyElement(columnName="A_Asset_Acct_Str", name="A_Asset_Acct_Str", dataType=FlyDataType.String, entityType="D", printName="A_Asset_Acct_Str", fieldLength=40)
	aAssetAcctStr,
	//
	@FlyElement(columnName="A_Asset_Action", name="Asset Action", dataType=FlyDataType.NONE, entityType="D", printName="Asset Action", fieldLength=0)
	aAssetAction,
	//
	@FlyElement(columnName="A_Asset_Addition_ID", name="Asset Addition", dataType=FlyDataType.ID, entityType="D", printName="Asset Addition", fieldLength=22)
	aAssetAdditionID,
	//
	@FlyElement(columnName="A_Asset_Change_ID", name="A_Asset_Change_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Change_ID", fieldLength=22)
	aAssetChangeID,
	//
	@FlyElement(columnName="A_Asset_Class_ID", name="Asset class", dataType=FlyDataType.NONE, entityType="D", printName="Asset class", fieldLength=0)
	aAssetClassID,
	//
	@FlyElement(columnName="A_Asset_Class_Value", name="Asset Class Key", dataType=FlyDataType.NONE, entityType="D", printName="Asset Class Key", fieldLength=0)
	aAssetClassValue,
	//
	@FlyElement(columnName="A_Asset_Cost", name="Asset Cost", dataType=FlyDataType.Amount, entityType="D", printName="Asset Cost", fieldLength=22)
	aAssetCost,
	//
	@FlyElement(columnName="A_Asset_Cost_Change", name="Asset Cost Change", dataType=FlyDataType.NONE, entityType="D", printName="Asset Cost Change", fieldLength=0)
	aAssetCostChange,
	//
	@FlyElement(columnName="A_Asset_Cost_Delta", name="Delta Asset Cost", dataType=FlyDataType.NONE, entityType="D", printName="Delta Asset Cost", fieldLength=0)
	aAssetCostDelta,
	//
	@FlyElement(columnName="A_Asset_CreateDate", name="Create Date", dataType=FlyDataType.Date, entityType="D", printName="Create Date", fieldLength=7)
	aAssetCreateDate,
	//
	@FlyElement(columnName="A_Asset_Delivery_ID", name="资产配送", description="资产的配送", help="The availability of the asset to the business partner (customer).", dataType=FlyDataType.ID, entityType="D", printName="资产配送", fieldLength=22)
	aAssetDeliveryID,
	//
	@FlyElement(columnName="A_Asset_Disposed_ID", name="Asset Disposed", dataType=FlyDataType.ID, entityType="D", printName="Asset Disposed", fieldLength=22)
	aAssetDisposedID,
	//
	@FlyElement(columnName="A_Asset_Group_Acct_ID", name="Asset Group Accounting", dataType=FlyDataType.ID, entityType="D", printName="Asset Group Accounting", fieldLength=22)
	aAssetGroupAcctID,
	//
	@FlyElement(columnName="A_Asset_Group_ID", name="资产分类", description="群体的资产", help="The group of assets determines default accounts.  If an asset group is selected in the product category, assets are created when delivering the asset.", dataType=FlyDataType.TableDirect, entityType="D", printName="资产分类", fieldLength=22)
	aAssetGroupID,
	//
	@FlyElement(columnName="A_Asset_Group_Value", name="Asset Group Key", dataType=FlyDataType.NONE, entityType="D", printName="Asset Group Key", fieldLength=0)
	aAssetGroupValue,
	//
	@FlyElement(columnName="A_Asset_ID", name="资产", description="Asset used internally or by customers", help="An asset is either created by purchasing or by delivering a product.  An asset can be used internally or be a customer asset.", dataType=FlyDataType.ID, entityType="D", printName="资产", fieldLength=22)
	aAssetID,
	//
	@FlyElement(columnName="A_Asset_ID_To", name="To Asset ID", dataType=FlyDataType.Table, entityType="D", printName="To Asset ID", fieldLength=22)
	aAssetIDTo,
	//
	@FlyElement(columnName="A_Asset_Info_Fin_ID", name="Asset Info Financial ID", dataType=FlyDataType.ID, entityType="D", printName="Asset Info Financial ID", fieldLength=22)
	aAssetInfoFinID,
	//
	@FlyElement(columnName="A_Asset_Info_Ins_ID", name="A_Asset_Info_Ins_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Info_Ins_ID", fieldLength=22)
	aAssetInfoInsID,
	//
	@FlyElement(columnName="A_Asset_Info_Lic_ID", name="A_Asset_Info_Lic_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Info_Lic_ID", fieldLength=22)
	aAssetInfoLicID,
	//
	@FlyElement(columnName="A_Asset_Info_Oth_ID", name="A_Asset_Info_Oth_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Info_Oth_ID", fieldLength=22)
	aAssetInfoOthID,
	//
	@FlyElement(columnName="A_Asset_Info_Tax_ID", name="Asset Info Tax", dataType=FlyDataType.ID, entityType="D", printName="Asset Info Tax", fieldLength=22)
	aAssetInfoTaxID,
	//
	@FlyElement(columnName="A_Asset_Life_Current_Year", name="A_Asset_Life_Current_Year", dataType=FlyDataType.Amount, entityType="D", printName="A_Asset_Life_Current_Year", fieldLength=22)
	aAssetLifeCurrentYear,
	//
	@FlyElement(columnName="A_Asset_Life_Years", name="Life Years", dataType=FlyDataType.Integer, entityType="D", printName="Life Years", fieldLength=22)
	aAssetLifeYears,
	//
	@FlyElement(columnName="A_Asset_Life_Years_F", name="Life Years (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Life Years (fiscal)", fieldLength=0)
	aAssetLifeYearsF,
	//
	@FlyElement(columnName="A_Asset_New_Acct", name="Asset Acct (new)", dataType=FlyDataType.NONE, entityType="D", printName="Asset Acct (new)", fieldLength=0)
	aAssetNewAcct,
	//
	@FlyElement(columnName="A_Asset_Product_ID", name="Asset Product", dataType=FlyDataType.NONE, entityType="D", printName="Asset Product", fieldLength=0)
	aAssetProductID,
	//
	@FlyElement(columnName="A_Asset_Remaining", name="Remaining Amt", dataType=FlyDataType.NONE, entityType="D", printName="Remaining Amt", fieldLength=0)
	aAssetRemaining,
	//
	@FlyElement(columnName="A_Asset_Remaining_F", name="Remaining Amt (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Remaining Amt (fiscal)", fieldLength=0)
	aAssetRemainingF,
	//
	@FlyElement(columnName="A_Asset_Retirement_ID", name="资产报废", description="Internally used asset is not longer used.", dataType=FlyDataType.ID, entityType="D", printName="资产报废", fieldLength=22)
	aAssetRetirementID,
	//
	@FlyElement(columnName="A_Asset_RevalDate", name="Revaluation Date", dataType=FlyDataType.Date, entityType="D", printName="Revaluation Date", fieldLength=7)
	aAssetRevalDate,
	//
	@FlyElement(columnName="A_Asset_Reval_Entry_ID", name="Asset Reval. Entry", dataType=FlyDataType.ID, entityType="D", printName="Asset Reval. Entry", fieldLength=22)
	aAssetRevalEntryID,
	//
	@FlyElement(columnName="A_Asset_Reval_ID", name="Asset Revaluation", dataType=FlyDataType.NONE, entityType="D", printName="Asset Revaluation", fieldLength=0)
	aAssetRevalID,
	//
	@FlyElement(columnName="A_Asset_Reval_Index_ID", name="Asset Reval Index", dataType=FlyDataType.ID, entityType="D", printName="Asset Reval Index", fieldLength=22)
	aAssetRevalIndexID,
	//
	@FlyElement(columnName="A_Asset_Split_ID", name="Asset Split", dataType=FlyDataType.ID, entityType="D", printName="Asset Split", fieldLength=22)
	aAssetSplitID,
	//
	@FlyElement(columnName="A_Asset_Spread_ID", name="A_Asset_Spread_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Spread_ID", fieldLength=22)
	aAssetSpreadID,
	//
	@FlyElement(columnName="A_Asset_Spread_Type", name="Spread Type", dataType=FlyDataType.Text, entityType="D", printName="Spread Type", fieldLength=20)
	aAssetSpreadType,
	//
	@FlyElement(columnName="A_Asset_Status", name="Asset Status", dataType=FlyDataType.NONE, entityType="D", printName="Asset Status", fieldLength=0)
	aAssetStatus,
	//
	@FlyElement(columnName="A_Asset_Trade_ID", name="Asset Trade", dataType=FlyDataType.Table, entityType="D", printName="Asset Trade", fieldLength=22)
	aAssetTradeID,
	//
	@FlyElement(columnName="A_Asset_Transfer_ID", name="A_Asset_Transfer_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Transfer_ID", fieldLength=22)
	aAssetTransferID,
	//
	@FlyElement(columnName="A_AssetType", name="Asset Type", dataType=FlyDataType.NONE, entityType="D", printName="Asset Type", fieldLength=0)
	aAssetType,
	//
	@FlyElement(columnName="A_Asset_Type_ID", name="Asset Type", dataType=FlyDataType.NONE, entityType="D", printName="Asset Type", fieldLength=0)
	aAssetTypeID,
	//
	@FlyElement(columnName="A_Asset_Type_Value", name="Asset Type Value", dataType=FlyDataType.NONE, entityType="D", printName="Asset Type Value", fieldLength=0)
	aAssetTypeValue,
	//
	@FlyElement(columnName="A_Asset_Use_ID", name="A_Asset_Use_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Asset_Use_ID", fieldLength=22)
	aAssetUseID,
	//
	@FlyElement(columnName="A_Base_Amount", name="A_Base_Amount", dataType=FlyDataType.Amount, entityType="D", printName="A_Base_Amount", fieldLength=22)
	aBaseAmount,
	//
	@FlyElement(columnName="A_Calc_Accumulated_Depr", name="A_Calc_Accumulated_Depr", dataType=FlyDataType.Amount, entityType="D", printName="A_Calc_Accumulated_Depr", fieldLength=22)
	aCalcAccumulatedDepr,
	//
	@FlyElement(columnName="A_CapvsExp", name="Capital/Expense", dataType=FlyDataType.List, entityType="D", printName="Capital/Expense", fieldLength=3)
	aCapvsExp,
	//
	@FlyElement(columnName="AcceptAMEX", name="接受AMEX", description="接受美国人快递卡片", help="Indicates if American Express Cards are accepted as payment to this Bank Account", dataType=FlyDataType.YesNo, entityType="D", printName="接受AMEX", fieldLength=1)
	acceptAMEX,
	//
	@FlyElement(columnName="AcceptATM", name="接受自动柜员机", description="接受银行金融卡", help="Indicates if Bank ATM Cards are accepted for as payment to this Bank Account", dataType=FlyDataType.YesNo, entityType="D", printName="接受自动柜员机", fieldLength=1)
	acceptATM,
	//
	@FlyElement(columnName="AcceptCheck", name="接受电子的检查", description="Accept ECheck (Electronic Checks)", help="Indicates if EChecks are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受 ECheck", fieldLength=1)
	acceptCheck,
	//
	@FlyElement(columnName="AcceptCorporate", name="接受公司", description="Accept Corporate Payment Cards", help="Indicates if Corporate Payment Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受公司", fieldLength=1)
	acceptCorporate,
	//
	@FlyElement(columnName="AcceptDiners", name="接受用餐者", description="接受用餐者的俱乐部", help="Indicates if Diner's Club Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受用餐者", fieldLength=1)
	acceptDiners,
	//
	@FlyElement(columnName="AcceptDirectDebit", name="Accept Direct Debit", description="Accept Direct Debits (vendor initiated)", help="Accept Direct Debit transactions. Direct Debits are initiated by the vendor who has permission to deduct amounts from the payee's account.", dataType=FlyDataType.YesNo, entityType="D", printName="Direct Debit", fieldLength=1)
	acceptDirectDebit,
	//
	@FlyElement(columnName="AcceptDirectDeposit", name="接受 ACH", description="Accept Automatic Clearing House", help="Indicates if ACH Payments are accepted as payment to this Bank Account", dataType=FlyDataType.YesNo, entityType="D", printName="接受 ACH", fieldLength=1)
	acceptDirectDeposit,
	//
	@FlyElement(columnName="AcceptDiscover", name="接受发现", description="接受发现卡片", help="Indicates if Discover Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受发现", fieldLength=1)
	acceptDiscover,
	//
	@FlyElement(columnName="AcceptLanguage", name="接受语言", description="Language accepted based on browser information", dataType=FlyDataType.String, entityType="D", printName="接受语言", fieldLength=60)
	acceptLanguage,
	//
	@FlyElement(columnName="AcceptMC", name="接受MasterCard", description="接受Master卡", help="Indicates if Master Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受 MC", fieldLength=1)
	acceptMC,
	//
	@FlyElement(columnName="AcceptVisa", name="接受Visa卡", description="接受签证卡片", help="Indicates if Visa Cards are accepted as payment to this Bank Account.", dataType=FlyDataType.YesNo, entityType="D", printName="接受Visa卡", fieldLength=1)
	acceptVisa,
	//
	@FlyElement(columnName="AccessLevel", name="数据访问级别", description="所要求的访问级别", help="Indicates the access level required for this record or process.", dataType=FlyDataType.List, entityType="D", printName="数据访问级别", fieldLength=1)
	accessLevel,
	//
	@FlyElement(columnName="AccessTypeRule", name="Access Type", description="The type of access for this rule", help="If you restrict Access to the entity, you also cannot Report or Export it (i.e. to have access is a requirement that you can report or export the data).  The Report and Export rules are further restrictions if you have access.", dataType=FlyDataType.List, entityType="D", printName="Access Type", fieldLength=1)
	accessTypeRule,
	//
	@FlyElement(columnName="Account_Acct", name="Account_Acct", dataType=FlyDataType.Account, entityType="D", printName="Account_Acct", fieldLength=22)
	accountAcct,
	//
	@FlyElement(columnName="Account_ID", name="帐户", description="已使用帐户", help="帐户用", dataType=FlyDataType.Search, entityType="D", printName="帐户", fieldLength=22)
	accountID,
	//
	@FlyElement(columnName="AccountNo", name="帐户号", description="帐户数字", help="The Account Number indicates the Number assigned to this account", dataType=FlyDataType.String, entityType="D", printName="帐户号", fieldLength=20)
	accountNo,
	//
	@FlyElement(columnName="AccountSign", name="财务符号", description="Indicates the Natural Sign of the Account as a Debit or Credit", help="Indicates if the expected balance for this account should be a Debit or a Credit.", dataType=FlyDataType.List, entityType="D", printName="符号", fieldLength=1)
	accountSign,
	//
	@FlyElement(columnName="AccountType", name="帐户类型", description="指示帐户的类型", help="Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo.  The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners.  Note:  Memo account amounts are ignored when checking for balancing", dataType=FlyDataType.List, entityType="D", printName="帐户类型", fieldLength=1)
	accountType,
	//
	@FlyElement(columnName="AccountValue", name="帐户关键字", description="会计科目的关键字", dataType=FlyDataType.String, entityType="D", printName="帐户关键字", fieldLength=40)
	accountValue,
	//
	@FlyElement(columnName="AcctSchemaName", name="帐户模式名", description="会计模式的名称", dataType=FlyDataType.String, entityType="D", printName="会计模式名", fieldLength=60)
	acctSchemaName,
	//
	@FlyElement(columnName="AccumulationType", name="Accumulation Type", description="How to accumulate data on time axis", help="Sum adds the data points (e.g. stock volume) - Average is appropriate for e.g. Stock Price", dataType=FlyDataType.List, entityType="D", printName="Accumulation Type", fieldLength=1)
	accumulationType,
	//
	@FlyElement(columnName="A_Change_Acumulated_Depr", name="Change Acumulated Depreciation", dataType=FlyDataType.NONE, entityType="D", printName="Change Acumulated Depreciation", fieldLength=0)
	aChangeAcumulatedDepr,
	//
	@FlyElement(columnName="A_City", name="帐户城市", description="City or the Credit Card or Account Holder", help="The Account City indicates the City of the Credit Card or Account holder", dataType=FlyDataType.String, entityType="D", printName="城市", fieldLength=60)
	aCity,
	//
	@FlyElement(columnName="A_Contract_Date", name="Contract Date", dataType=FlyDataType.Date, entityType="D", printName="Contract Date", fieldLength=7)
	aContractDate,
	//
	@FlyElement(columnName="A_Country", name="帐户国家", description="国家 ", help="帐户国家名字", dataType=FlyDataType.String, entityType="D", printName="国家 ", fieldLength=40)
	aCountry,
	//
	@FlyElement(columnName="AcqusitionCost", name="获得成本", description="使潜在客户成为客户的成本", help="The Acquisition Cost identifies the cost associated with making this prospect a customer.", dataType=FlyDataType.CostsPrices, entityType="D", printName="获得成本", fieldLength=22)
	acqusitionCost,
	//
	@FlyElement(columnName="A_CreateAsset", name="Create Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Create Asset", fieldLength=1)
	aCreateAsset,
	//
	@FlyElement(columnName="Action", name="动作", description="将被执行的动作", help="The Action field is a drop down list box which indicates the Action to be performed for this Menu Item.", dataType=FlyDataType.List, entityType="D", printName="动作", fieldLength=1)
	action,
	//
	@FlyElement(columnName="ActivityValue", name="Activity Value", dataType=FlyDataType.String, entityType="D", printName="Activity Value", fieldLength=40)
	activityValue,
	//
	@FlyElement(columnName="ACTriggerLength", name="Auto Complete Min Length", description="Identifier autocomplete trigger length", dataType=FlyDataType.Integer, entityType="D", printName="Auto Complete Min Length", fieldLength=10)
	aCTriggerLength,
	//
	@FlyElement(columnName="ActualAmt", name="实际金额", description="实际金额", help="Actual amount indicates the agreed upon amount for a document.", dataType=FlyDataType.Amount, entityType="D", printName="实际金额", fieldLength=22)
	actualAmt,
	//
	@FlyElement(columnName="ActualClick", name="Actual Click Count", description="How many clicks have been counted", help="Contains info on the actual click count until now", dataType=FlyDataType.Integer, entityType="D", printName="Actual Click Count", fieldLength=10)
	actualClick,
	//
	@FlyElement(columnName="ActualImpression", name="Actual Impression Count", description="How many impressions have been counted", help="Contains info on the actual impression count until now", dataType=FlyDataType.Integer, entityType="D", printName="Actual Impression Count", fieldLength=10)
	actualImpression,
	//
	@FlyElement(columnName="ActualLifeTimeValue", name="实际价值", description="实际收入", help="The Actual Life Time Value is the recorded revenue to be generated by this Business Partner.", dataType=FlyDataType.Amount, entityType="D", printName="实际价值", fieldLength=22)
	actualLifeTimeValue,
	//
	@FlyElement(columnName="ActualQty", name="实际数量", description="实际量", help="The Actual Quantity indicates the quantity as referenced on a document.", dataType=FlyDataType.Quantity, entityType="D", printName="实际数量", fieldLength=22)
	actualQty,
	//
	@FlyElement(columnName="A_Curr_Dep_Exp", name="A_Curr_Dep_Exp", dataType=FlyDataType.Amount, entityType="D", printName="A_Curr_Dep_Exp", fieldLength=22)
	aCurrDepExp,
	//
	@FlyElement(columnName="A_Current_Period", name="Current Period", dataType=FlyDataType.Integer, entityType="D", printName="Current Period", fieldLength=22)
	aCurrentPeriod,
	//
	@FlyElement(columnName="AccessLog_ID", name="Access Log", description="Log of Access to the System", dataType=FlyDataType.ID, entityType="D", printName="Access Log", fieldLength=22)
	accessLogID,
	//
	@FlyElement(columnName="Alert_ID", name="警报", description="Adempiere警报", help="Adempiere Alerts allow you define system conditions you want to be alerted of", dataType=FlyDataType.TableDirect, entityType="D", printName="警报", fieldLength=22)
	alertID,
	//
	@FlyElement(columnName="AlertProcessor_ID", name="Alert Processor", description="Alert Processor/Server Parameter", help="Alert Processor/Server Parameter", dataType=FlyDataType.TableDirect, entityType="D", printName="Alert Processor", fieldLength=22)
	alertProcessorID,
	//
	@FlyElement(columnName="AlertProcessorLog_ID", name="Alert Processor Log", description="Result of the execution of the Alert Processor", help="Result of the execution of the Alert Processor", dataType=FlyDataType.ID, entityType="D", printName="Alert Processor Log", fieldLength=22)
	alertProcessorLogID,
	//
	@FlyElement(columnName="AlertRecipient_ID", name="Alert Recipient", description="Recipient of the Alert Notification", help="You can send the notifications to users or roles", dataType=FlyDataType.ID, entityType="D", printName="Alert Recipient", fieldLength=22)
	alertRecipientID,
	//
	@FlyElement(columnName="AlertRule_ID", name="警报规则", description="Definition of the alert element", dataType=FlyDataType.ID, entityType="D", printName="警报规则", fieldLength=22)
	alertRuleID,
	//
	@FlyElement(columnName="Archive_ID", name="Archive", description="Document and Report Archive", help="Depending on the Client Automatic Archive Level documents and reports are saved and available for view.", dataType=FlyDataType.ID, entityType="D", printName="Archive", fieldLength=22)
	archiveID,
	//
	@FlyElement(columnName="Attachment_ID", name="附件", description="本文件附件", help="Attachment can be of any document file type and can be attached to any record in the system.", dataType=FlyDataType.ID, entityType="D", printName="附件", fieldLength=22)
	attachmentID,
	//
	@FlyElement(columnName="AttachmentNote_ID", name="Attachment Note", description="Personal Attachment Note", dataType=FlyDataType.ID, entityType="D", printName="Attachment Note", fieldLength=22)
	attachmentNoteID,
	//
	@FlyElement(columnName="Attribute_ID", name="属性", dataType=FlyDataType.ID, entityType="D", printName="属性", fieldLength=22)
	attributeID,
	//
	@FlyElement(columnName="Backup_ID", name="Backup", dataType=FlyDataType.ID, entityType="D", printName="Backup", fieldLength=22)
	backupID,
	//
	@FlyElement(columnName="ChangeLog_ID", name="变动日志", description="数据变化的日志", help="数据变化的日志", dataType=FlyDataType.ID, entityType="D", printName="变动日志", fieldLength=22)
	changeLogID,
	//
	@FlyElement(columnName="ChartDatasource_ID", name="Chart Datasource", dataType=FlyDataType.ID, entityType="D", printName="Chart Datasource", fieldLength=22)
	chartDatasourceID,
	//
	@FlyElement(columnName="Chart_ID", name="Chart", dataType=FlyDataType.ID, entityType="D", printName="Chart", fieldLength=22)
	chartID,
	//
	@FlyElement(columnName="Client_ID", name="客户", description="安装此软件的客户", help="客户是一个公司或者合法的实体。你不能在客户之间共享数据。", dataType=FlyDataType.TableDirect, entityType="D", printName="客户", fieldLength=22)
	clientID,
	//
	@FlyElement(columnName="ClientShare_ID", name="Client Share", description="Force (not) sharing of client/org entities", help="For entities with data access level of Client+Organization either force to share the entries or not. Example: Product and Business Partner can be either defined on Client level (shared) or on Org level (not shared).  You can define here of Products are always shared (i.e. always created under Organization '*') or if they are not shared (i.e. you cannot enter them with Organization '*')", dataType=FlyDataType.ID, entityType="D", printName="Client Share", fieldLength=10)
	clientShareID,
	//
	@FlyElement(columnName="Color_ID", name="颜色", description="Color for backgrounds or indicators", dataType=FlyDataType.ID, entityType="D", printName="颜色", fieldLength=22)
	colorID,
	//
	@FlyElement(columnName="Column_ID", name="列", description="在表中的列", help="链接到数据库表中的列。", dataType=FlyDataType.ID, entityType="D", printName="列", fieldLength=22)
	columnID,
	//
	@FlyElement(columnName="ColumnProcess_ID", name="Column Link Process", dataType=FlyDataType.NONE, entityType="D", printName="Column Link Process", fieldLength=0)
	columnProcessID,
	//
	@FlyElement(columnName="ColumnProcessPara_ID", name="Link Process Parameter", dataType=FlyDataType.NONE, entityType="D", printName="Link Process Parameter", fieldLength=0)
	columnProcessParaID,
	//
	@FlyElement(columnName="ColumnSortOrder_ID", name="定单列", description="列决定定单", help="Integer Column of the table determining the order (display, sort, ..). If defined, the Order By replaces the default Order By clause. It should be fully qualified (i.e. 'tablename.columnname').", dataType=FlyDataType.Table, entityType="D", printName="定单列", fieldLength=22)
	columnSortOrderID,
	//
	@FlyElement(columnName="ColumnSortYesNo_ID", name="已包括列", description="Column determining if a Table Column is included in Ordering", help="If a Included Column is defined, it decides, if a column is active in the ordering - otherwise it is determined that the Order Column has a value of one or greater", dataType=FlyDataType.Table, entityType="D", printName="已包括列", fieldLength=22)
	columnSortYesNoID,
	//
	@FlyElement(columnName="Desktop_ID", name="桌面", description="工作台的集合", dataType=FlyDataType.ID, entityType="D", printName="桌面", fieldLength=22)
	desktopID,
	//
	@FlyElement(columnName="DesktopWorkbench_ID", name="桌面工作台", dataType=FlyDataType.ID, entityType="D", printName="桌面工作台", fieldLength=22)
	desktopWorkbenchID,
	//
	@FlyElement(columnName="Display", name="显示列", description="将会显示的列", help="The Display Column indicates the column that will display. 显示列指明了将显示的列。", dataType=FlyDataType.Table, entityType="D", printName="显示列", fieldLength=22)
	display,
	//
	@FlyElement(columnName="Address1", name="地址 1", description="该位置的地址的第一行", help="The Address 1 identifies the address for an entity's location", dataType=FlyDataType.String, entityType="D", printName="地址 1", fieldLength=60)
	address1,
	//
	@FlyElement(columnName="Address2", name="地址 2", description="该位置的地址的第二行", help="The Address 2 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="地址 2", fieldLength=60)
	address2,
	//
	@FlyElement(columnName="Address3", name="Address 3", description="Address Line 3 for the location", help="The Address 2 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="Address 3", fieldLength=60)
	address3,
	//
	@FlyElement(columnName="Address4", name="Address 4", description="Address Line 4 for the location", help="The Address 4 provides additional address information for an entity.  It can be used for building location, apartment number or similar information.", dataType=FlyDataType.String, entityType="D", printName="Address 4", fieldLength=60)
	address4,
	//
	@FlyElement(columnName="Element_ID", name="系统元素", description="系统元素使得我们能够对列的描述和帮助进行集中维护。", help="系统元素使得我们能够对数据库字段的描述、帮助和词汇进行集中维护。", dataType=FlyDataType.ID, entityType="D", printName="元素", fieldLength=22)
	elementID,
	//
	@FlyElement(columnName="EMailConfig_ID", name="EMail Configuration", dataType=FlyDataType.TableDirect, entityType="D", printName="EMail Configuration", fieldLength=10)
	eMailConfigID,
	//
	@FlyElement(columnName="EntityType_ID", name="Entity Type", description="System Entity Type", help="The entity type determines the ownership of Application Dictionary entries.  The types 'Dictionary' and 'Adempiere' should not be used and are maintained by Adempiere (i.e. all changes are reversed during migration to the current definition).", dataType=FlyDataType.ID, entityType="D", printName="Entity Type", fieldLength=10)
	entityTypeID,
	//
	@FlyElement(columnName="A_Depreciation_Acct", name="Depreciation Account", dataType=FlyDataType.Account, entityType="D", printName="Depreciation Account", fieldLength=40)
	aDepreciationAcct,
	//
	@FlyElement(columnName="A_Depreciation_Acct_New", name="New Depreciation Exp Acct", dataType=FlyDataType.Account, entityType="D", printName="New Depreciation Exp Acct", fieldLength=22)
	aDepreciationAcctNew,
	//
	@FlyElement(columnName="A_Depreciation_Acct_Str", name="A_Depreciation_Acct_Str", dataType=FlyDataType.String, entityType="D", printName="A_Depreciation_Acct_Str", fieldLength=40)
	aDepreciationAcctStr,
	//
	@FlyElement(columnName="A_Depreciation_Build_ID", name="Build Depreciation", dataType=FlyDataType.ID, entityType="D", printName="Build Depreciation", fieldLength=22)
	aDepreciationBuildID,
	//
	@FlyElement(columnName="A_Depreciation_Calc_Type", name="Calculation Type", dataType=FlyDataType.Table, entityType="D", printName="Calculation Type", fieldLength=10)
	aDepreciationCalcType,
	//
	@FlyElement(columnName="A_Depreciation_Convention_ID", name="Depreciation Convention", dataType=FlyDataType.ID, entityType="D", printName="Depreciation Convention", fieldLength=22)
	aDepreciationConventionID,
	//
	@FlyElement(columnName="A_Depreciation_Conv_F_ID", name="Depreciation Convention (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Convention (fiscal)", fieldLength=0)
	aDepreciationConvFID,
	//
	@FlyElement(columnName="A_Depreciation_Conv_ID", name="Convention Type", dataType=FlyDataType.Table, entityType="D", printName="Convention Type", fieldLength=10)
	aDepreciationConvID,
	//
	@FlyElement(columnName="A_Depreciation_Entry_ID", name="Depreciation Entry", dataType=FlyDataType.ID, entityType="D", printName="Depreciation Entry", fieldLength=22)
	aDepreciationEntryID,
	//
	@FlyElement(columnName="A_Depreciation_Exp_ID", name="A_Depreciation_Exp_ID", dataType=FlyDataType.Integer, entityType="D", printName="A_Depreciation_Exp_ID", fieldLength=22)
	aDepreciationExpID,
	//
	@FlyElement(columnName="A_Depreciation_F_ID", name="Depreciation (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation (fiscal)", fieldLength=0)
	aDepreciationFID,
	//
	@FlyElement(columnName="A_Depreciation_Forecast_ID", name="Depreciation Forecast", dataType=FlyDataType.Integer, entityType="D", printName="Depreciation Forecast", fieldLength=22)
	aDepreciationForecastID,
	//
	@FlyElement(columnName="A_Depreciation_ID", name="Depreciation", dataType=FlyDataType.ID, entityType="D", printName="Depreciation", fieldLength=22)
	aDepreciationID,
	//
	@FlyElement(columnName="A_Depreciation_Manual_Amount", name="A_Depreciation_Manual_Amount", dataType=FlyDataType.Amount, entityType="D", printName="A_Depreciation_Manual_Amount", fieldLength=22)
	aDepreciationManualAmount,
	//
	@FlyElement(columnName="A_Depreciation_Manual_Period", name="A_Depreciation_Manual_Period", dataType=FlyDataType.List, entityType="D", printName="A_Depreciation_Manual_Period", fieldLength=2)
	aDepreciationManualPeriod,
	//
	@FlyElement(columnName="A_Depreciation_Method_F_ID", name="Depreciation Method (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Method (fiscal)", fieldLength=0)
	aDepreciationMethodFID,
	//
	@FlyElement(columnName="A_Depreciation_Method_ID", name="Depreciation Method", dataType=FlyDataType.ID, entityType="D", printName="Depreciation Method", fieldLength=10)
	aDepreciationMethodID,
	//
	@FlyElement(columnName="A_Depreciation_New_Acct", name="Depreciation Acct (new)", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Acct (new)", fieldLength=0)
	aDepreciationNewAcct,
	//
	@FlyElement(columnName="A_Depreciation_Rate", name="Rate", dataType=FlyDataType.Number, entityType="D", printName="Rate", fieldLength=22)
	aDepreciationRate,
	//
	@FlyElement(columnName="A_Depreciation_Table_Code", name="Depreciation Code", dataType=FlyDataType.String, entityType="D", printName="Depreciation Code", fieldLength=20)
	aDepreciationTableCode,
	//
	@FlyElement(columnName="A_Depreciation_Table_Detail_ID", name="Depreciation Table Detail", dataType=FlyDataType.ID, entityType="D", printName="Depreciation Table Detail", fieldLength=22)
	aDepreciationTableDetailID,
	//
	@FlyElement(columnName="A_Depreciation_Table_Header_ID", name="A_Depreciation_Table_Header_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Depreciation_Table_Header_ID", fieldLength=22)
	aDepreciationTableHeaderID,
	//
	@FlyElement(columnName="A_Depreciation_Variable_Perc", name="Variable Percent", dataType=FlyDataType.Number, entityType="D", printName="Variable Percent", fieldLength=22)
	aDepreciationVariablePerc,
	//
	@FlyElement(columnName="A_Depreciation_Variable_Perc_F", name="Variable Percent (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Variable Percent (fiscal)", fieldLength=0)
	aDepreciationVariablePercF,
	//
	@FlyElement(columnName="A_Depreciation_Workfile_ID", name="A_Depreciation_Workfile_ID", dataType=FlyDataType.ID, entityType="D", printName="A_Depreciation_Workfile_ID", fieldLength=22)
	aDepreciationWorkfileID,
	//
	@FlyElement(columnName="Error_ID", name="错误", dataType=FlyDataType.ID, entityType="D", printName="错误", fieldLength=22)
	errorID,
	//
	@FlyElement(columnName="FieldGroup_ID", name="字段组", description="字段的合乎逻辑的配列", help="The Field Group indicates the logical group that this field belongs to (History, Amounts, Quantities)", dataType=FlyDataType.TableDirect, entityType="D", printName="字段组", fieldLength=22)
	fieldGroupID,
	//
	@FlyElement(columnName="Field_ID", name="字段", description="一张数据库表上的字段", help="字段标识了数据库表的字段。", dataType=FlyDataType.ID, entityType="D", printName="字段", fieldLength=22)
	fieldID,
	//
	@FlyElement(columnName="Find_ID", name="查找", dataType=FlyDataType.ID, entityType="D", printName="查找", fieldLength=22)
	findID,
	//
	@FlyElement(columnName="Form_ID", name="特别的窗体", description="特别的窗体", help="The Special Form field identifies a unique Special Form in the system.", dataType=FlyDataType.ID, entityType="D", printName="特别的窗体", fieldLength=22)
	formID,
	//
	@FlyElement(columnName="HouseKeeping_ID", name="House Keeping Configuration", dataType=FlyDataType.ID, entityType="D", printName="House Keeping Configuration", fieldLength=22)
	houseKeepingID,
	//
	@FlyElement(columnName="Image_ID", name="图像", description="系统图像或图标", dataType=FlyDataType.TableDirect, entityType="D", printName="图像", fieldLength=22)
	imageID,
	//
	@FlyElement(columnName="ImpFormat_ID", name="导入格式", dataType=FlyDataType.ID, entityType="D", printName="导入格式", fieldLength=22)
	impFormatID,
	//
	@FlyElement(columnName="ImpFormat_Row_ID", name="格式字段", dataType=FlyDataType.ID, entityType="D", printName="格式字段", fieldLength=22)
	impFormatRowID,
	//
	@FlyElement(columnName="InfoColumn_ID", name="Info Column", description="Info Window Column", help="Column in the Info Window for display and/or selection.  If used for selection, the column cannot be a SQL expression. The SQL clause must be fully qualified based on the FROM clause in the Info Window definition", dataType=FlyDataType.ID, entityType="D", printName="Info Column", fieldLength=10)
	infoColumnID,
	//
	@FlyElement(columnName="InfoWindow_ID", name="Info Window", description="Info and search/select Window", help="The Info window is used to search and select records as well as display information relevant to the selection.", dataType=FlyDataType.ID, entityType="D", printName="Info Window", fieldLength=10)
	infoWindowID,
	//
	@FlyElement(columnName="A_Disposal_Amt", name="Disposal Amount", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Amt", fieldLength=0)
	aDisposalAmt,
	//
	@FlyElement(columnName="A_Disposal_Gain", name="Disposal Gain", dataType=FlyDataType.Account, entityType="D", printName="Disposal Gain", fieldLength=10)
	aDisposalGain,
	//
	@FlyElement(columnName="A_Disposal_Gain_Acct", name="Disposal Gain Acct", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Gain Acct", fieldLength=0)
	aDisposalGainAcct,
	//
	@FlyElement(columnName="A_Disposal_Loss", name="Loss on Disposal", dataType=FlyDataType.Account, entityType="D", printName="Loss on Disposal", fieldLength=40)
	aDisposalLoss,
	//
	@FlyElement(columnName="A_Disposal_Loss_Acct", name="Disposal Loss Acct", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Loss Acct", fieldLength=0)
	aDisposalLossAcct,
	//
	@FlyElement(columnName="A_Disposal_Loss_New", name="New Disposal Loss", dataType=FlyDataType.Account, entityType="D", printName="New Disposal Loss", fieldLength=22)
	aDisposalLossNew,
	//
	@FlyElement(columnName="A_Disposal_Loss_New_Acct", name="Disposal Loss Acct (new)", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Loss Acct (new)", fieldLength=0)
	aDisposalLossNewAcct,
	//
	@FlyElement(columnName="A_Disposal_Loss_Str", name="Disposal Loss Str", dataType=FlyDataType.String, entityType="D", printName="Disposal Loss Str", fieldLength=40)
	aDisposalLossStr,
	//
	@FlyElement(columnName="A_Disposal_Revenue", name="Disposal Revenue", dataType=FlyDataType.Account, entityType="D", printName="Disposal Revenue", fieldLength=40)
	aDisposalRevenue,
	//
	@FlyElement(columnName="A_Disposal_Revenue_Acct", name="Disposal Revenue Acct", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Revenue Acct", fieldLength=0)
	aDisposalRevenueAcct,
	//
	@FlyElement(columnName="A_Disposal_Revenue_New", name="New Disposal Revenue", dataType=FlyDataType.Account, entityType="D", printName="New Disposal Revenue", fieldLength=22)
	aDisposalRevenueNew,
	//
	@FlyElement(columnName="A_Disposal_Revenue_New_Acct", name="Disposal Revenue Acct (new)", dataType=FlyDataType.NONE, entityType="D", printName="Disposal Revenue Acct (new)", fieldLength=0)
	aDisposalRevenueNewAcct,
	//
	@FlyElement(columnName="A_Disposal_Revenue_Str", name="Disposal Revenue Str", dataType=FlyDataType.String, entityType="D", printName="Disposal Revenue Str", fieldLength=40)
	aDisposalRevenueStr,
	//
	@FlyElement(columnName="A_Disposed_Date", name="Disposed Date", dataType=FlyDataType.Date, entityType="D", printName="Disposed Date", fieldLength=7)
	aDisposedDate,
	//
	@FlyElement(columnName="A_Disposed_Method", name="Disposed Method", dataType=FlyDataType.List, entityType="D", printName="Disposed Method", fieldLength=10)
	aDisposedMethod,
	//
	@FlyElement(columnName="A_Disposed_Reason", name="Disposed Reason", dataType=FlyDataType.List, entityType="D", printName="Disposed Reason", fieldLength=10)
	aDisposedReason,
	//
	@FlyElement(columnName="Issue_ID", name="System Issue", description="Automatically created or manually entered System Issue", help="System Issues are created to speed up the resolution of any system related issues (potential bugs).  If enabled, they are automatically reported to Adempiere.  No data or confidential information is transferred.", dataType=FlyDataType.ID, entityType="D", printName="System Issue", fieldLength=10)
	issueID,
	//
	@FlyElement(columnName="Key", name="主键列", description="记录的唯一标识符", help="主键列标明了它是这个表的一条记录的唯一标示符。", dataType=FlyDataType.Table, entityType="D", printName="主键列", fieldLength=22)
	key,
	//
	@FlyElement(columnName="LabelPrinterFunction_ID", name="Label printer Function", description="Function of Label Printer", dataType=FlyDataType.TableDirect, entityType="D", printName="Label printer Function", fieldLength=22)
	labelPrinterFunctionID,
	//
	@FlyElement(columnName="LabelPrinter_ID", name="Label printer", description="Label Printer Definition", dataType=FlyDataType.ID, entityType="D", printName="Label printer", fieldLength=22)
	labelPrinterID,
	//
	@FlyElement(columnName="Language", name="语言", description="本客户使用的语言", help="The Language identifies the language to use for display", dataType=FlyDataType.Table, entityType="D", printName="语言", fieldLength=6)
	language,
	//
	@FlyElement(columnName="Language_ID", name="语言ID", dataType=FlyDataType.ID, entityType="D", printName="语言ID", fieldLength=22)
	languageID,
	//
	@FlyElement(columnName="LdapAccess_ID", name="Ldap Access", description="Ldap Access Log", help="Access via LDAP", dataType=FlyDataType.ID, entityType="D", printName="Ldap Access", fieldLength=10)
	ldapAccessID,
	//
	@FlyElement(columnName="LdapProcessor_ID", name="Ldap Processor", description="LDAP Server to authenticate and authorize external systems based on Adempiere", help="The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authenticate and authorize them.  There is only one server per Adempiere system.  The 'o' is the Client key and the optional 'ou' is the Interest Area key.", dataType=FlyDataType.ID, entityType="D", printName="Ldap Processor", fieldLength=10)
	ldapProcessorID,
	//
	@FlyElement(columnName="LdapProcessorLog_ID", name="Ldap Processor Log", description="LDAP Server Log", dataType=FlyDataType.ID, entityType="D", printName="Ldap Log", fieldLength=10)
	ldapProcessorLogID,
	//
	@FlyElement(columnName="Memo_ID", name="Memo", dataType=FlyDataType.NONE, entityType="D", printName="Memo", fieldLength=0)
	memoID,
	//
	@FlyElement(columnName="Menu_ID", name="菜单", description="标识菜单", help="The Menu identifies a unique Menu.  Menus are used to control the display of those screens a user has access to.", dataType=FlyDataType.ID, entityType="D", printName="菜单", fieldLength=22)
	menuID,
	//
	@FlyElement(columnName="Message_ID", name="信息", description="系统信息", help="Information and Error messages", dataType=FlyDataType.ID, entityType="D", printName="信息", fieldLength=22)
	messageID,
	//
	@FlyElement(columnName="MigrationData_ID", name="Migration data", dataType=FlyDataType.NONE, entityType="D", printName="Migration data", fieldLength=0)
	migrationDataID,
	//
	@FlyElement(columnName="Migration_ID", name="Migration", description="Migration change management.", help="Migration change management.", dataType=FlyDataType.NONE, entityType="D", printName="Migration", fieldLength=0)
	migrationID,
	//
	@FlyElement(columnName="MigrationScript_ID", name="Migration Script", description="Table to check whether the migration script has been applied", dataType=FlyDataType.ID, entityType="D", printName="Migration Script", fieldLength=10)
	migrationScriptID,
	//
	@FlyElement(columnName="MigrationStep_ID", name="Migration step", description="A single step in the migration process", dataType=FlyDataType.NONE, entityType="D", printName="Migration step", fieldLength=0)
	migrationStepID,
	//
	@FlyElement(columnName="ModelValidator_ID", name="Model Validator", dataType=FlyDataType.ID, entityType="D", printName="Model Validator", fieldLength=10)
	modelValidatorID,
	//
	@FlyElement(columnName="Modification_ID", name="Modification", description="System Modification or Extension", help="Description of the System modification or extension", dataType=FlyDataType.ID, entityType="D", printName="Modification", fieldLength=10)
	modificationID,
	//
	@FlyElement(columnName="Note_ID", name="通知", description="系统通知", dataType=FlyDataType.ID, entityType="D", printName="通知", fieldLength=22)
	noteID,
	//
	@FlyElement(columnName="OrgBP_ID", name="Linked Organization", description="The Business Partner is another Organization for explicit Inter-Org transactions", help="The business partner is another organization in the system. So when performing transactions, the counter-document is created automatically. Example: You have BPartnerA linked to OrgA and BPartnerB linked to OrgB.  If you create a sales order for BPartnerB in OrgA a purchase order is created for BPartnerA in OrgB.  This allows to have explicit documents for Inter-Org transactions.", dataType=FlyDataType.Button, entityType="D", printName="Linked Org", fieldLength=22)
	orgBPID,
	//
	@FlyElement(columnName="OrgDoc_ID", name="Document Org", description="Document Organization (independent from account organization)", dataType=FlyDataType.Table, entityType="D", printName="Document Org", fieldLength=22)
	orgDocID,
	//
	@FlyElement(columnName="Org_ID", name="机构", description="客户内的机构实体。", help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.", dataType=FlyDataType.TableDirect, entityType="D", printName="机构", fieldLength=22)
	orgID,
	//
	@FlyElement(columnName="OrgOnly_ID", name="Only Organization", description="Create posting entries only for this organization", help="When you have multiple accounting schema, you may want to restrict the generation of postings entries for the additional accounting schema (i.e. not for the primary).  Example: You have a US and a FR organization. The primary accounting schema is in USD, the second in EUR.  If for the EUR accounting schema, you select the FR organizations, you would not create accounting entries for the transactions of the US organization in EUR.", dataType=FlyDataType.Table, entityType="D", printName="Only Org", fieldLength=10)
	orgOnlyID,
	//
	@FlyElement(columnName="OrgTo_ID", name="组织间", description="Organization valid for intercompany documents", help="The Inter Organization field identifies an Organization which can be used by this Organization for intercompany documents.", dataType=FlyDataType.Table, entityType="D", printName="组织间", fieldLength=22)
	orgToID,
	//
	@FlyElement(columnName="OrgTrx_ID", name="交易机构", description="Performing or initiating organization", help="The organization which performs or initiates this transaction (for another organization).  The owning Organization may not be the transaction organization in a service bureau environment, with centralized services, and inter-organization transactions.", dataType=FlyDataType.Table, entityType="D", printName="交易机构", fieldLength=22)
	orgTrxID,
	//
	@FlyElement(columnName="OrgType_ID", name="机构类型", description="Organization Type allows you to categorize your organizations", help="Organization Type allows you to categorize your organizations for reporting purposes", dataType=FlyDataType.TableDirect, entityType="D", printName="机构类型", fieldLength=22)
	orgTypeID,
	//
	@FlyElement(columnName="Original_ID", name="Original", dataType=FlyDataType.ID, entityType="D", printName="Original", fieldLength=22)
	originalID,
	//
	@FlyElement(columnName="Override_Dict", name="Update System Maintained Application Dictionary", dataType=FlyDataType.YesNo, entityType="D", printName="AD_Override_Dict", fieldLength=1)
	overrideDict,
	//
	@FlyElement(columnName="Package_Code_New", name="New Package Code", dataType=FlyDataType.Memo, entityType="D", printName="New Package Code", fieldLength=2000)
	packageCodeNew,
	//
	@FlyElement(columnName="Package_Code_Old", name="Old Package Code", dataType=FlyDataType.Memo, entityType="D", printName="Old Package Code", fieldLength=2000)
	packageCodeOld,
	//
	@FlyElement(columnName="Package_Dir", name="Package Directory", description="Package directory, default to AdempiereHome/packages", dataType=FlyDataType.FilePath, entityType="D", printName="Package Directory", fieldLength=255)
	packageDir,
	//
	@FlyElement(columnName="Package_Exp_Common_ID", name="Common Package Exp.", dataType=FlyDataType.ID, entityType="D", printName="Common Package Exp.", fieldLength=10)
	packageExpCommonID,
	//
	@FlyElement(columnName="Package_Exp_Detail_ID", name="Package Exp. Detail", dataType=FlyDataType.ID, entityType="D", printName="Package Exp. Detail", fieldLength=22)
	packageExpDetailID,
	//
	@FlyElement(columnName="Package_Exp_ID", name="Package Exp.", dataType=FlyDataType.ID, entityType="D", printName="Package Exp.", fieldLength=22)
	packageExpID,
	//
	@FlyElement(columnName="Package_Imp_Backup_ID", name="Imp. Package Backup", dataType=FlyDataType.ID, entityType="D", printName="Imp. Package Backup", fieldLength=22)
	packageImpBackupID,
	//
	@FlyElement(columnName="Package_Imp_Bck_Dir", name="Package Imp. Bck. Directory", dataType=FlyDataType.String, entityType="D", printName="Package Imp. Bck. Directory", fieldLength=255)
	packageImpBckDir,
	//
	@FlyElement(columnName="Package_Imp_Detail_ID", name="Imp. Package Detail", dataType=FlyDataType.ID, entityType="D", printName="Imp. Package Detail", fieldLength=22)
	packageImpDetailID,
	//
	@FlyElement(columnName="Package_Imp_ID", name="Package Imp.", dataType=FlyDataType.ID, entityType="D", printName="Package Imp.", fieldLength=22)
	packageImpID,
	//
	@FlyElement(columnName="Package_Imp_Inst_ID", name="Package Imp. Inst.", dataType=FlyDataType.ID, entityType="D", printName="Package Imp. Inst.", fieldLength=10)
	packageImpInstID,
	//
	@FlyElement(columnName="Package_Imp_Org_Dir", name="Package Imp. Org. Dir.", dataType=FlyDataType.String, entityType="D", printName="Package Imp. Org. Dir.", fieldLength=255)
	packageImpOrgDir,
	//
	@FlyElement(columnName="Package_Imp_Proc_ID", name="Package Imp. Proc.", dataType=FlyDataType.ID, entityType="D", printName="Package Imp. Proc.", fieldLength=10)
	packageImpProcID,
	//
	@FlyElement(columnName="Package_Source", name="Package Source", description="Fully qualified package source file name", dataType=FlyDataType.FileName, entityType="D", printName="Package Source", fieldLength=255)
	packageSource,
	//
	@FlyElement(columnName="Package_Source_Type", name="Package Source Type", description="Type of package source - file, ftp, webservice etc", dataType=FlyDataType.List, entityType="D", printName="Package Source Type", fieldLength=10)
	packageSourceType,
	//
	@FlyElement(columnName="Package_Type", name="Package Type", dataType=FlyDataType.List, entityType="D", printName="Package Type", fieldLength=1)
	packageType,
	//
	@FlyElement(columnName="PInstance_ID", name="进程实例", dataType=FlyDataType.ID, entityType="D", printName="进程实例", fieldLength=22)
	pInstanceID,
	//
	@FlyElement(columnName="PInstance_Log_ID", name="日志", dataType=FlyDataType.ID, entityType="D", printName="日志", fieldLength=22)
	pInstanceLogID,
	//
	@FlyElement(columnName="Preference_ID", name="选项", description="个人选项", dataType=FlyDataType.ID, entityType="D", printName="选项", fieldLength=22)
	preferenceID,
	//
	@FlyElement(columnName="PrintColor1_ID", name="Color 1", description="First color used", dataType=FlyDataType.Table, entityType="D", printName="Color 1", fieldLength=10)
	printColor1ID,
	//
	@FlyElement(columnName="PrintColor2_ID", name="Color 2", description="Second color used", dataType=FlyDataType.Table, entityType="D", printName="Color 2", fieldLength=10)
	printColor2ID,
	//
	@FlyElement(columnName="PrintColor3_ID", name="Color 3", description="Third color used", dataType=FlyDataType.Table, entityType="D", printName="Color 3", fieldLength=10)
	printColor3ID,
	//
	@FlyElement(columnName="PrintColor4_ID", name="Color 4", description="Forth color used", dataType=FlyDataType.Table, entityType="D", printName="Color 4", fieldLength=10)
	printColor4ID,
	//
	@FlyElement(columnName="PrintColor_ID", name="打印颜色", description="打印用的颜色", help="打印用的颜色", dataType=FlyDataType.TableDirect, entityType="D", printName="打印颜色", fieldLength=22)
	printColorID,
	//
	@FlyElement(columnName="PrintFont_ID", name="打印字型", description="维护打印字型", help="打印用的字型", dataType=FlyDataType.TableDirect, entityType="D", printName="打印字型", fieldLength=22)
	printFontID,
	//
	@FlyElement(columnName="PrintFormatChild_ID", name="已包括打印格式", description="Print format that is included here.", help="Included Print formats allow to e.g. Lines to Header records. The Column provides the parent link.", dataType=FlyDataType.Table, entityType="D", printName="已包括打印格式", fieldLength=22)
	printFormatChildID,
	//
	@FlyElement(columnName="PrintFormatHeader_ID", name="Header Print Format", dataType=FlyDataType.NONE, entityType="D", printName="Header Print Format", fieldLength=0)
	printFormatHeaderID,
	//
	@FlyElement(columnName="PrintFormat_ID", name="打印格式", description="数据打印格式", help="The print format determines how data is rendered for print.", dataType=FlyDataType.TableDirect, entityType="D", printName="打印格式", fieldLength=22)
	printFormatID,
	//
	@FlyElement(columnName="PrintFormatItem_ID", name="打印格式项目", description="Item Column in the Print format", help="Item Column in the print format maintaining layout information", dataType=FlyDataType.ID, entityType="D", printName="打印格式项目", fieldLength=22)
	printFormatItemID,
	//
	@FlyElement(columnName="PrintForm_ID", name="打印表单", description="表单", dataType=FlyDataType.ID, entityType="D", printName="打印表单", fieldLength=22)
	printFormID,
	//
	@FlyElement(columnName="PrintGraph_ID", name="图表", description="在报表中包括图表", help="Pie Line Graph to be printed in Reports", dataType=FlyDataType.ID, entityType="D", printName="图表", fieldLength=22)
	printGraphID,
	//
	@FlyElement(columnName="PrintLabel_ID", name="打印标签 ", description="打印标签格式类型", help="打印分类格式", dataType=FlyDataType.TableDirect, entityType="D", printName="打印标签 ", fieldLength=22)
	printLabelID,
	//
	@FlyElement(columnName="PrintLabelLine_ID", name="打印标签行", description="打印标签线格式", help="标签上的明细格式", dataType=FlyDataType.TableDirect, entityType="D", printName="标签线", fieldLength=22)
	printLabelLineID,
	//
	@FlyElement(columnName="PrintPaper_ID", name="打印纸", description="打印机纸定义", help="Printer Paper Size, Orientation and Margins", dataType=FlyDataType.ID, entityType="D", printName="打印纸", fieldLength=22)
	printPaperID,
	//
	@FlyElement(columnName="PrintTableFormat_ID", name="打印表格式", description="在报表中的表格式", help="Print Table Format determines Fonts, Colors of  the printed Table", dataType=FlyDataType.ID, entityType="D", printName="表格式", fieldLength=22)
	printTableFormatID,
	//
	@FlyElement(columnName="Process_ID", name="进程", description="程序或报表", help="The Process field identifies a unique Process or Report in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="进程", fieldLength=22)
	processID,
	//
	@FlyElement(columnName="Process_Para_ID", name="参数处理", dataType=FlyDataType.ID, entityType="D", printName="参数处理", fieldLength=22)
	processParaID,
	//
	@FlyElement(columnName="RecentItem_ID", name="Recent Item", dataType=FlyDataType.NONE, entityType="D", printName="Recent Item", fieldLength=0)
	recentItemID,
	//
	@FlyElement(columnName="Reference_ID", name="引用", description="系统引用", help="The Reference indicates the type of reference field", dataType=FlyDataType.ID, entityType="D", printName="引用", fieldLength=22)
	referenceID,
	//
	@FlyElement(columnName="Reference_Source_ID", name="Source Reference", dataType=FlyDataType.Table, entityType="D", printName="Source Reference", fieldLength=10)
	referenceSourceID,
	//
	@FlyElement(columnName="Reference_Target_ID", name="Target Reference", dataType=FlyDataType.Table, entityType="D", printName="Target Reference", fieldLength=10)
	referenceTargetID,
	//
	@FlyElement(columnName="Reference_Value_ID", name="引用关键字", description="Required to specify, if data type is Table or List", help="The Reference Value indicates where the reference values are stored.  It must be specified if the data type is Table or List.  ", dataType=FlyDataType.Table, entityType="D", printName="引用关键字", fieldLength=22)
	referenceValueID,
	//
	@FlyElement(columnName="Ref_List_ID", name="引用列表", description="基于表的引用列表", help="The Reference List field indicates a list of reference values from a database tables.  Reference lists populate drop down list boxes in data entry screens", dataType=FlyDataType.ID, entityType="D", printName="引用列表", fieldLength=22)
	refListID,
	//
	@FlyElement(columnName="Registration_ID", name="Registration", description="System Registration", help="The System Registration helps Adempiere to help the installed base", dataType=FlyDataType.ID, entityType="D", printName="Registration", fieldLength=22)
	registrationID,
	//
	@FlyElement(columnName="RelationType_ID", name="Relation Type", dataType=FlyDataType.ID, entityType="D", printName="Relation Type", fieldLength=22)
	relationTypeID,
	//
	@FlyElement(columnName="Replication_ID", name="复制", description="数据复制目标", help="Data Replication Target Details. Maintained on the central server.", dataType=FlyDataType.TableDirect, entityType="D", printName="复制", fieldLength=22)
	replicationID,
	//
	@FlyElement(columnName="Replication_Log_ID", name="复制日志", description="数据复制日志明细", help="数据复制运行日志", dataType=FlyDataType.ID, entityType="D", printName="复制日志", fieldLength=22)
	replicationLogID,
	//
	@FlyElement(columnName="Replication_Run_ID", name="复制运行", description="数据复制运行", help="Data Replication Run information", dataType=FlyDataType.ID, entityType="D", printName="复制运行", fieldLength=22)
	replicationRunID,
	//
	@FlyElement(columnName="ReplicationStrategy_ID", name="复制策略", description="数据复制策略", help="The Data Replication Strategy determines what and how tables are replicated ", dataType=FlyDataType.TableDirect, entityType="D", printName="复制策略", fieldLength=22)
	replicationStrategyID,
	//
	@FlyElement(columnName="ReplicationTable_ID", name="复制表", description="Data Replication Strategy Table Info", help="Determines how the table is replicated", dataType=FlyDataType.ID, entityType="D", printName="复制表", fieldLength=22)
	replicationTableID,
	//
	@FlyElement(columnName="ReportView_Col_ID", name="报表视图列", dataType=FlyDataType.ID, entityType="D", printName="报表视图列", fieldLength=22)
	reportViewColID,
	//
	@FlyElement(columnName="ReportView_ID", name="报表视图", description="View used to generate this report", help="The Report View indicates the view used to generate this report.", dataType=FlyDataType.TableDirect, entityType="D", printName="报表视图", fieldLength=22)
	reportViewID,
	//
	@FlyElement(columnName="Role_ID", name="角色", description="职责角色", help="The Role determines security and access a user who has this Role will have in the System.", dataType=FlyDataType.ID, entityType="D", printName="角色", fieldLength=22)
	roleID,
	//
	@FlyElement(columnName="Rule_ID", name="Rule", dataType=FlyDataType.ID, entityType="D", printName="Rule", fieldLength=22)
	ruleID,
	//
	@FlyElement(columnName="Scheduler_ID", name="Scheduler", description="Schedule Processes", help="Schedule processes to be executed asynchronously", dataType=FlyDataType.TableDirect, entityType="D", printName="Scheduler", fieldLength=22)
	schedulerID,
	//
	@FlyElement(columnName="SchedulerLog_ID", name="Scheduler Log", description="Result of the execution of the Scheduler", help="Result of the execution of the Scheduler", dataType=FlyDataType.ID, entityType="D", printName="Scheduler Log", fieldLength=22)
	schedulerLogID,
	//
	@FlyElement(columnName="SchedulerRecipient_ID", name="Scheduler Recipient", description="Recipient of the Scheduler Notification", help="You can send the notifications to users or roles", dataType=FlyDataType.ID, entityType="D", printName="Scheduler Recipient", fieldLength=22)
	schedulerRecipientID,
	//
	@FlyElement(columnName="SearchDefinition_ID", name="Search Definition", dataType=FlyDataType.ID, entityType="D", printName="Search Definition", fieldLength=22)
	searchDefinitionID,
	//
	@FlyElement(columnName="Sequence_ID", name="序列", description="文档序列", help="The Sequence defines the numbering sequence to be used for documents.", dataType=FlyDataType.ID, entityType="D", printName="序列", fieldLength=22)
	sequenceID,
	//
	@FlyElement(columnName="Session_ID", name="会话", description="在线的用户期间或网络", help="Online or Web Session Information", dataType=FlyDataType.ID, entityType="D", printName="会话", fieldLength=22)
	sessionID,
	//
	@FlyElement(columnName="SysConfig_ID", name="System Configurator", dataType=FlyDataType.ID, entityType="D", printName="System Configurator", fieldLength=10)
	sysConfigID,
	//
	@FlyElement(columnName="System_ID", name="系统 ", description="系统定义", help="通常的系统定义", dataType=FlyDataType.ID, entityType="D", printName="系统 ", fieldLength=22)
	systemID,
	//
	@FlyElement(columnName="Tab_ID", name="页签", description="窗口内的页签", help="The Tab indicates a tab that displays within a window.", dataType=FlyDataType.ID, entityType="D", printName="页签", fieldLength=22)
	tabID,
	//
	@FlyElement(columnName="Table_ID", name="表", description="字段所在表", help="The Table indicates the table in which a field or fields reside.", dataType=FlyDataType.ID, entityType="D", printName="表", fieldLength=22)
	tableID,
	//
	@FlyElement(columnName="Table_ScriptValidator_ID", name="Table Script Validator", dataType=FlyDataType.ID, entityType="D", printName="Table Script Validator", fieldLength=22)
	tableScriptValidatorID,
	//
	@FlyElement(columnName="Task_ID", name="任务", description="操作系统任务", help="The Task field identifies a Operation System Task in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="任务", fieldLength=22)
	taskID,
	//
	@FlyElement(columnName="TaskInstance_ID", name="任务实例", dataType=FlyDataType.ID, entityType="D", printName="任务实例", fieldLength=22)
	taskInstanceID,
	//
	@FlyElement(columnName="AdText", name="广告文本", description="广告的本文", help="The text of the advertisement with optional HTML tags. The HTML tags are not checked for correctness and may impact the remaining page.", dataType=FlyDataType.Memo, entityType="D", printName="广告文本", fieldLength=2000)
	adText,
	//
	@FlyElement(columnName="Tree_Account_ID", name="Account Tree", description="Tree for Natural Account Tree", dataType=FlyDataType.Table, entityType="D", printName="Account Tree", fieldLength=10)
	treeAccountID,
	//
	@FlyElement(columnName="Tree_Activity_ID", name="Primary Tree Activity", dataType=FlyDataType.Table, entityType="D", printName="Tree Activity", fieldLength=22)
	treeActivityID,
	//
	@FlyElement(columnName="Tree_BPartner_ID", name="主树-业务伙伴", dataType=FlyDataType.Table, entityType="D", printName="主树-业务伙伴", fieldLength=22)
	treeBPartnerID,
	//
	@FlyElement(columnName="Tree_Campaign_ID", name="Primary Tree Campaign", dataType=FlyDataType.Table, entityType="D", printName="Tree Campaign", fieldLength=22)
	treeCampaignID,
	//
	@FlyElement(columnName="TreeCMC_ID", name="Container Tree", description="Container Tree", help="Container Tree", dataType=FlyDataType.Table, entityType="D", printName="Container Tree", fieldLength=10)
	treeCMCID,
	//
	@FlyElement(columnName="TreeCMM_ID", name="Media Tree", description="Media Tree", help="Media Tree", dataType=FlyDataType.Table, entityType="D", printName="Media Tree", fieldLength=10)
	treeCMMID,
	//
	@FlyElement(columnName="TreeCMS_ID", name="Stage Tree", description="Stage Tree", help="Stage Tree", dataType=FlyDataType.Table, entityType="D", printName="Stage Tree", fieldLength=10)
	treeCMSID,
	//
	@FlyElement(columnName="TreeCMT_ID", name="Template Tree", description="Template Tree", help="Template Tree", dataType=FlyDataType.Table, entityType="D", printName="Template Tree", fieldLength=10)
	treeCMTID,
	//
	@FlyElement(columnName="Tree_Favorite_ID", name="Tree Favorite ID", dataType=FlyDataType.NONE, entityType="D", printName="Tree Favorite ID", fieldLength=0)
	treeFavoriteID,
	//
	@FlyElement(columnName="Tree_Favorite_Node_ID", name="Tree Favorite Node ID", dataType=FlyDataType.NONE, entityType="D", printName="Tree Favorite Node ID", fieldLength=0)
	treeFavoriteNodeID,
	//
	@FlyElement(columnName="Tree_ID", name="树", description="标识树", help="The Tree field identifies a unique Tree in the system. Trees define roll ups or summary levels of information.  They are used in reports for defining report points and summarization levels.", dataType=FlyDataType.TableDirect, entityType="D", printName="树", fieldLength=22)
	treeID,
	//
	@FlyElement(columnName="Tree_Menu_ID", name="主树-菜单", dataType=FlyDataType.Table, entityType="D", printName="主树-菜单", fieldLength=22)
	treeMenuID,
	//
	@FlyElement(columnName="Tree_Org_ID", name="主树-机构", dataType=FlyDataType.Table, entityType="D", printName="主树-机构", fieldLength=22)
	treeOrgID,
	//
	@FlyElement(columnName="Tree_Product_ID", name="主树-产品", dataType=FlyDataType.Table, entityType="D", printName="主树-产品", fieldLength=22)
	treeProductID,
	//
	@FlyElement(columnName="Tree_Project_ID", name="主树-项目", dataType=FlyDataType.Table, entityType="D", printName="主树-项目", fieldLength=22)
	treeProjectID,
	//
	@FlyElement(columnName="Tree_SalesRegion_ID", name="主树-销售区域", dataType=FlyDataType.Table, entityType="D", printName="主树-销售区域", fieldLength=22)
	treeSalesRegionID,
	//
	@FlyElement(columnName="A_Due_On", name="Asset Due On", dataType=FlyDataType.List, entityType="D", printName="Asset Due On", fieldLength=22)
	aDueOn,
	//
	@FlyElement(columnName="UserBPAccess_ID", name="User BP Access", description="User/contact access to Business Partner information and resources", help="If on User level, 'Full BP Access' is NOT selected, you need to give access explicitly here. ", dataType=FlyDataType.ID, entityType="D", printName="User BP Access", fieldLength=10)
	userBPAccessID,
	//
	@FlyElement(columnName="UserDef_Field_ID", name="自定义字段", dataType=FlyDataType.ID, entityType="D", printName="自定义字段", fieldLength=22)
	userDefFieldID,
	//
	@FlyElement(columnName="UserDef_Tab_ID", name="自定义页签", dataType=FlyDataType.TableDirect, entityType="D", printName="自定义页签", fieldLength=22)
	userDefTabID,
	//
	@FlyElement(columnName="UserDef_Win_ID", name="自定义窗口", dataType=FlyDataType.TableDirect, entityType="D", printName="自定义窗口", fieldLength=22)
	userDefWinID,
	//
	@FlyElement(columnName="User_ID", name="客户或联系人", description="User within the system - Internal or Business Partner Contact", help="The User identifies a unique user in the system. This could be an internal user or a business partner contact", dataType=FlyDataType.ID, entityType="D", printName="用户", fieldLength=22)
	userID,
	//
	@FlyElement(columnName="UserMail_ID", name="User Mail", description="Mail sent to the user", help="Archive of mails sent to users", dataType=FlyDataType.ID, entityType="D", printName="User Mail", fieldLength=10)
	userMailID,
	//
	@FlyElement(columnName="UserQuery_ID", name="User Query", description="Saved User Query", dataType=FlyDataType.ID, entityType="D", printName="User Query", fieldLength=10)
	userQueryID,
	//
	@FlyElement(columnName="User_Substitute_ID", name="User Substitute", description="Substitute of the user", help="A user who can act for another user.", dataType=FlyDataType.ID, entityType="D", printName="User Substitute", fieldLength=22)
	userSubstituteID,
	//
	@FlyElement(columnName="Val_Rule_ID", name="动态验证", description="验证规则", help="The Validation Rule indicates a unique validation rule.  These rules define how an entry is determined to valid or invalid. ", dataType=FlyDataType.TableDirect, entityType="D", printName="验证", fieldLength=22)
	valRuleID,
	//
	@FlyElement(columnName="WF_Activity_ID", name="Workflow Activity", description="Workflow Activity", help="The Workflow Activity is the actual Workflow Node in a Workflow Process instance", dataType=FlyDataType.ID, entityType="D", printName="Wf Activity", fieldLength=22)
	wFActivityID,
	//
	@FlyElement(columnName="WF_ActivityResult_ID", name="Workflow Activity Result", description="Result of the Workflow Process Activity", help="Activity Result of the execution of the Workflow Process Instrance", dataType=FlyDataType.ID, entityType="D", printName="Wf Activity Result", fieldLength=22)
	wFActivityResultID,
	//
	@FlyElement(columnName="WF_Block_ID", name="Workflow Block", description="Workflow Transaction Execution Block", help="A workflow execution block is optional and allows all work to be performed in a single transaction. If one step (node activity) fails, the entire work is rolled back.", dataType=FlyDataType.ID, entityType="D", printName="Wf Block", fieldLength=22)
	wFBlockID,
	//
	@FlyElement(columnName="WF_EventAudit_ID", name="Workflow Event Audit", description="Workflow Process Activity Event Audit Information", help="History of chenges ov the Workflow Process Activity", dataType=FlyDataType.ID, entityType="D", printName="Wf Event Audit", fieldLength=22)
	wFEventAuditID,
	//
	@FlyElement(columnName="WF_NextCondition_ID", name="Transition Condition", description="Workflow Node Transition Condition", help="Optional restriction of transition of one node to the next", dataType=FlyDataType.ID, entityType="D", printName="Condition", fieldLength=22)
	wFNextConditionID,
	//
	@FlyElement(columnName="WF_Next_ID", name="下一结点", description="在工作流中的下一个结点", help="The Next Node indicates the next step or task in this Workflow.", dataType=FlyDataType.Table, entityType="D", printName="下一结点", fieldLength=22)
	wFNextID,
	//
	@FlyElement(columnName="WF_Node_ID", name="结点", description="Workflow Node, step or process", help="The Workflow Node indicates a unique step or process in a Workflow.", dataType=FlyDataType.ID, entityType="D", printName="结点", fieldLength=22)
	wFNodeID,
	//
	@FlyElement(columnName="WF_NodeNext_ID", name="Node Transition", description="Workflow Node Transition", help="The Next Nodes Tab defines the order or Nodes or Steps in a Workflow.", dataType=FlyDataType.ID, entityType="D", printName="Transition", fieldLength=22)
	wFNodeNextID,
	//
	@FlyElement(columnName="WF_Node_Para_ID", name="Workflow Node Parameter", description="Workflow Node Execution Parameter", help="Parameter for the execution of the Workflow Node", dataType=FlyDataType.ID, entityType="D", printName="Wf Node Parameter", fieldLength=22)
	wFNodeParaID,
	//
	@FlyElement(columnName="WF_ProcessData_ID", name="Workflow Process Data", description="Workflow Process Context", help="Context information of the workflow process and activity", dataType=FlyDataType.ID, entityType="D", printName="Wf Process Data", fieldLength=22)
	wFProcessDataID,
	//
	@FlyElement(columnName="WF_Process_ID", name="Workflow Process", description="Actual Workflow Process Instance", help="Instance of a workflow execution", dataType=FlyDataType.TableDirect, entityType="D", printName="Wf Process", fieldLength=22)
	wFProcessID,
	//
	@FlyElement(columnName="WF_Responsible_ID", name="Workflow Responsible", description="Responsible for Workflow Execution", help="The ultimate responsibility for a workflow is with an actual user. The Workflow Responsible allows to define ways to find that actual User.", dataType=FlyDataType.TableDirect, entityType="D", printName="Wf Responsible", fieldLength=22)
	wFResponsibleID,
	//
	@FlyElement(columnName="Window_ID", name="窗口 ", description="数据输入或显示视窗", help="The Window field identifies a unique Window in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="窗口 ", fieldLength=22)
	windowID,
	//
	@FlyElement(columnName="Workbench_ID", name="工作台", description="Collection of windows, reports", dataType=FlyDataType.TableDirect, entityType="D", printName="工作台", fieldLength=22)
	workbenchID,
	//
	@FlyElement(columnName="WorkbenchWindow_ID", name="工作台窗口", dataType=FlyDataType.ID, entityType="D", printName="工作台窗口", fieldLength=22)
	workbenchWindowID,
	//
	@FlyElement(columnName="Workflow_ID", name="工作流", description="Workflow or combination of tasks", help="The Workflow field identifies a unique Workflow in the system.", dataType=FlyDataType.TableDirect, entityType="D", printName="工作流", fieldLength=22)
	workflowID,
	//
	@FlyElement(columnName="WorkflowProcessor_ID", name="Workflow Processor", description="Workflow Processor Server", help="Workflow Processor Server", dataType=FlyDataType.TableDirect, entityType="D", printName="Workflow Processor", fieldLength=22)
	workflowProcessorID,
	//
	@FlyElement(columnName="WorkflowProcessorLog_ID", name="Workflow Processorl Log", description="Result of the execution of the Workflow Processor", help="Result of the execution of the Workflow Processor", dataType=FlyDataType.ID, entityType="D", printName="Workflow Processor Log", fieldLength=22)
	workflowProcessorLogID,
	//
	@FlyElement(columnName="ZoomCondition_ID", name="Zoom Condition", dataType=FlyDataType.NONE, entityType="D", printName="Zoom Condition", fieldLength=0)
	zoomConditionID,
	//
	@FlyElement(columnName="A_Effective_Date", name="Effective Date", dataType=FlyDataType.Date, entityType="D", printName="Effective Date", fieldLength=7)
	aEffectiveDate,
	//
	@FlyElement(columnName="A_EMail", name="帐户电子邮件", description="电子邮件地址", help="The EMail Address indicates the EMail address off the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="电子邮件", fieldLength=60)
	aEMail,
	//
	@FlyElement(columnName="A_End_Asset_ID", name="To Asset", dataType=FlyDataType.Table, entityType="D", printName="To Asset", fieldLength=22)
	aEndAssetID,
	//
	@FlyElement(columnName="A_Entry_Type", name="Entry Type", dataType=FlyDataType.List, entityType="D", printName="Entry Type", fieldLength=3)
	aEntryType,
	//
	@FlyElement(columnName="A_Expense_SL", name="SL Expense/Period", dataType=FlyDataType.NONE, entityType="D", printName="SL Expense/Period", fieldLength=0)
	aExpenseSL,
	//
	@FlyElement(columnName="A_Expense_SL_F", name="SL Expense/Period (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="SL Expense/Period (fiscal)", fieldLength=0)
	aExpenseSLF,
	//
	@FlyElement(columnName="A_Expired_Date", name="Asset Expired Date", dataType=FlyDataType.Date, entityType="D", printName="Asset Expired Date", fieldLength=7)
	aExpiredDate,
	//
	@FlyElement(columnName="A_Finance_Meth", name="Asset Finance Method", dataType=FlyDataType.List, entityType="D", printName="Asset Finance Method", fieldLength=2)
	aFinanceMeth,
	//
	@FlyElement(columnName="AfterDelivery", name="在配送之后", description="Due after delivery rather than after invoicing", help="The After Delivery checkbox indicates that payment is due after delivery as opposed to after invoicing.", dataType=FlyDataType.YesNo, entityType="D", printName="在配送之后", fieldLength=1)
	afterDelivery,
	//
	@FlyElement(columnName="A_FundingMode_Acct", name="Funding Mode Account", dataType=FlyDataType.NONE, entityType="D", printName="Funding Mode Acct", fieldLength=0)
	aFundingModeAcct,
	//
	@FlyElement(columnName="A_FundingMode_ID", name="Asset Funding Mode", dataType=FlyDataType.NONE, entityType="D", printName="Asset Funding Mode", fieldLength=0)
	aFundingModeID,
	//
	@FlyElement(columnName="A_Ident_DL", name="驾驶者执照", description="Payment Identification - Driver License", help="The Driver's License being used as identification.", dataType=FlyDataType.String, entityType="D", printName="驾驶者执照", fieldLength=20)
	aIdentDL,
	//
	@FlyElement(columnName="A_Ident_SSN", name="社会保险号", description="Payment Identification - Social Security No", help="The Social Security number being used as identification.", dataType=FlyDataType.String, entityType="D", printName="社会保险号", fieldLength=20)
	aIdentSSN,
	//
	@FlyElement(columnName="A_Ins_Premium", name="Asset Insurance Premium", dataType=FlyDataType.Amount, entityType="D", printName="Asset Insurance Premium", fieldLength=22)
	aInsPremium,
	//
	@FlyElement(columnName="A_Insurance_Co", name="Insurance Company", dataType=FlyDataType.String, entityType="D", printName="Insurance Company", fieldLength=22)
	aInsuranceCo,
	//
	@FlyElement(columnName="A_Ins_Value", name="Asset Insurance Value", dataType=FlyDataType.Amount, entityType="D", printName="Asset Insurance Value", fieldLength=22)
	aInsValue,
	//
	@FlyElement(columnName="A_Investment_CR", name="Asset Investment CR", dataType=FlyDataType.Integer, entityType="D", printName="Asset Investment CR", fieldLength=22)
	aInvestmentCR,
	//
	@FlyElement(columnName="A_Issuing_Agency", name="Issuing Agency", dataType=FlyDataType.String, entityType="D", printName="Issuing Agency", fieldLength=22)
	aIssuingAgency,
	//
	@FlyElement(columnName="AlertMessage", name="警报信息", description="警报信息", help="The message of the email sent for the alert", dataType=FlyDataType.Text, entityType="D", printName="警报信息", fieldLength=2000)
	alertMessage,
	//
	@FlyElement(columnName="AlertOverPriority", name="Alert over Priority", description="Send alert email when over priority", help="Send alert email when a suspended activity is over the  priority defined", dataType=FlyDataType.Integer, entityType="D", printName="Alert over Priority", fieldLength=22)
	alertOverPriority,
	//
	@FlyElement(columnName="AlertSubject", name="警报主题", description="警报主题", help="The subject of the email message sent for the alert", dataType=FlyDataType.String, entityType="D", printName="警报主题", fieldLength=60)
	alertSubject,
	//
	@FlyElement(columnName="Alias", name="别名", description="Defines an alternate method of indicating an account combination.", help="The Alias field allows you to define a alternate method for referring to a full account combination.  For example, the Account Receivable Account for Garden World may be aliased as GW_AR.", dataType=FlyDataType.String, entityType="D", printName="别名", fieldLength=40)
	alias,
	//
	@FlyElement(columnName="Alias_ValidCombination_ID", name="Alias", dataType=FlyDataType.NONE, entityType="D", printName="Alias", fieldLength=0)
	aliasValidCombinationID,
	//
	@FlyElement(columnName="A_License_Fee", name="Asset License Fee", dataType=FlyDataType.Amount, entityType="D", printName="Asset License Fee", fieldLength=22)
	aLicenseFee,
	//
	@FlyElement(columnName="A_License_No", name="Asset License No", dataType=FlyDataType.String, entityType="D", printName="Asset License No", fieldLength=120)
	aLicenseNo,
	//
	@FlyElement(columnName="A_Life_Period", name="Life Periods", dataType=FlyDataType.Integer, entityType="D", printName="Life Periods", fieldLength=22)
	aLifePeriod,
	//
	@FlyElement(columnName="A_Life_Period_2004", name="Life Periods 2004 (min)", dataType=FlyDataType.NONE, entityType="D", printName="Life Periods 2004 (min)", fieldLength=0)
	aLifePeriod2004,
	//
	@FlyElement(columnName="A_Life_Period_F", name="Life Period (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Life Period (fiscal)", fieldLength=0)
	aLifePeriodF,
	//
	@FlyElement(columnName="A_Life_Period_Max", name="Life periods (max)", dataType=FlyDataType.NONE, entityType="D", printName="Life periods (max)", fieldLength=0)
	aLifePeriodMax,
	//
	@FlyElement(columnName="A_Life_Period_Min", name="Life periods (min)", dataType=FlyDataType.NONE, entityType="D", printName="Life periods (min)", fieldLength=0)
	aLifePeriodMin,
	//
	@FlyElement(columnName="AllAllocations", name="All Allocations", dataType=FlyDataType.NONE, entityType="D", printName="All Allocations", fieldLength=0)
	allAllocations,
	//
	@FlyElement(columnName="AllAssets", name="All Assets", dataType=FlyDataType.NONE, entityType="D", printName="AllAssets", fieldLength=0)
	allAssets,
	//
	@FlyElement(columnName="AllFields", name="AllFields", dataType=FlyDataType.YesNo, entityType="D", printName="AllFields", fieldLength=1)
	allFields,
	//
	@FlyElement(columnName="AllocatedAmt", name="Allocated Amountt", description="Amount allocated to this document", dataType=FlyDataType.Amount, entityType="D", printName="Allocated Amt", fieldLength=22)
	allocatedAmt,
	//
	@FlyElement(columnName="AllocateOldest", name="Allocate Oldest First", description="Allocate payments to the oldest invoice", help="Allocate payments to the oldest invoice. There might be an unallocated amount remaining.", dataType=FlyDataType.NONE, entityType="D", printName="Allocate Oldest First", fieldLength=0)
	allocateOldest,
	//
	@FlyElement(columnName="AllocationNo", name="Allocation No", dataType=FlyDataType.Integer, entityType="D", printName="Allocation No", fieldLength=22)
	allocationNo,
	//
	@FlyElement(columnName="AllocationStrategyType", name="Allocation Strategy", description="Allocation Strategy", help="Allocation from incoming to outgoing transactions", dataType=FlyDataType.List, entityType="D", printName="Allocation", fieldLength=1)
	allocationStrategyType,
	//
	@FlyElement(columnName="AllowCitiesOutOfList", name="Allow Cities out of List", description="A flag to allow cities, currently not in the list, to be entered", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Cities out of List", fieldLength=1)
	allowCitiesOutOfList,
	//
	@FlyElement(columnName="Allow_HTML_View", name="Allow HTML View", dataType=FlyDataType.YesNo, entityType="D", printName="Allow HTML View", fieldLength=1)
	allowHTMLView,
	//
	@FlyElement(columnName="Allow_Info_Account", name="Allow Info Account", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Account", fieldLength=1)
	allowInfoAccount,
	//
	@FlyElement(columnName="Allow_Info_Asset", name="Allow Info Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Asset", fieldLength=1)
	allowInfoAsset,
	//
	@FlyElement(columnName="Allow_Info_BPartner", name="Allow Info BPartner", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info BPartner", fieldLength=1)
	allowInfoBPartner,
	//
	@FlyElement(columnName="Allow_Info_CashJournal", name="Allow Info CashJournal", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info CashJournal", fieldLength=1)
	allowInfoCashJournal,
	//
	@FlyElement(columnName="Allow_Info_InOut", name="Allow Info InOut", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info InOut", fieldLength=1)
	allowInfoInOut,
	//
	@FlyElement(columnName="Allow_Info_Invoice", name="Allow Info Invoice", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Invoice", fieldLength=1)
	allowInfoInvoice,
	//
	@FlyElement(columnName="Allow_Info_Order", name="Allow Info Order", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Order", fieldLength=1)
	allowInfoOrder,
	//
	@FlyElement(columnName="Allow_Info_Payment", name="Allow Info Payment", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Payment", fieldLength=1)
	allowInfoPayment,
	//
	@FlyElement(columnName="Allow_Info_Product", name="Allow Info Product", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Product", fieldLength=1)
	allowInfoProduct,
	//
	@FlyElement(columnName="Allow_Info_Resource", name="Allow Info Resource", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Resource", fieldLength=1)
	allowInfoResource,
	//
	@FlyElement(columnName="Allow_Info_Schedule", name="Allow Info Schedule", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Info Schedule", fieldLength=1)
	allowInfoSchedule,
	//
	@FlyElement(columnName="AllowUoMFractions", name="允许UoM分数", description="Allow Unit of Measure Fractions", help="If allowed, you can enter UoM Fractions", dataType=FlyDataType.YesNo, entityType="D", printName="允许UoM分数", fieldLength=1)
	allowUoMFractions,
	//
	@FlyElement(columnName="Allow_XLS_View", name="Allow XLS View", dataType=FlyDataType.YesNo, entityType="D", printName="Allow XLS View", fieldLength=1)
	allowXLSView,
	//
	@FlyElement(columnName="AllTables", name="Check all DB Tables", description="Check not just this table", dataType=FlyDataType.NONE, entityType="D", printName="Check all DB Tables", fieldLength=0)
	allTables,
	//
	@FlyElement(columnName="Alpha", name="Alpha", description="颜色Alpha值 0-255", dataType=FlyDataType.Integer, entityType="D", printName="Alpha", fieldLength=22)
	alpha,
	//
	@FlyElement(columnName="Alpha_1", name="第二个Alpha", description="第二个颜色Alpha值", dataType=FlyDataType.Integer, entityType="D", printName="第二个Alpha", fieldLength=22)
	alpha1,
	//
	@FlyElement(columnName="A_Monthly_Payment", name="Asset Monthly Payment", dataType=FlyDataType.Amount, entityType="D", printName="Asset Monthly Payment", fieldLength=22)
	aMonthlyPayment,
	//
	@FlyElement(columnName="Amount", name="金额", description="被定义的币种金额", help="The Amount indicates the amount for this document line.", dataType=FlyDataType.Amount, entityType="D", printName="金额", fieldLength=22)
	amount,
	//
	@FlyElement(columnName="AmountRefunded", name="AmountRefunded", dataType=FlyDataType.Amount, entityType="D", printName="AmountRefunded", fieldLength=22)
	amountRefunded,
	//
	@FlyElement(columnName="AmountTendered", name="AmountTendered", dataType=FlyDataType.Amount, entityType="D", printName="AmountTendered", fieldLength=22)
	amountTendered,
	//
	@FlyElement(columnName="AmountType", name="金额类型", description="金额的类型到报表", help="You can choose between the total and period amounts as well as the balance or just the debit credit amounts.", dataType=FlyDataType.List, entityType="D", printName="金额类型", fieldLength=2)
	amountType,
	//
	@FlyElement(columnName="Amt", name="金额", description="金额", help="金额", dataType=FlyDataType.Amount, entityType="D", printName="金额", fieldLength=22)
	amt,
	//
	@FlyElement(columnName="AmtAcct", name="Accounted Amount", description="Amount Balance in Currency of Accounting Schema", dataType=FlyDataType.Amount, entityType="D", printName="Accounted", fieldLength=22)
	amtAcct,
	//
	@FlyElement(columnName="AmtAcctBalance", name="Accounted Balance", description="Accounted Balance Amount", help="The Account Balance Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="Balance", fieldLength=22)
	amtAcctBalance,
	//
	@FlyElement(columnName="AmtAcctCr", name="帐户贷方", description="帐户贷方金额", help="The Account Credit Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="帐户贷方", fieldLength=22)
	amtAcctCr,
	//
	@FlyElement(columnName="AmtAcctDr", name="帐户借方", description="帐户借方金额", help="The Account Debit Amount indicates the transaction amount converted to this organization's accounting currency", dataType=FlyDataType.Amount, entityType="D", printName="帐户借方", fieldLength=22)
	amtAcctDr,
	//
	@FlyElement(columnName="AmtAcctOpenBalance", name="Acct Open Balance", description="Open Balance in document currency & rate", dataType=FlyDataType.Amount, entityType="D", printName="Acct Open Balance", fieldLength=22)
	amtAcctOpenBalance,
	//
	@FlyElement(columnName="AmtAcctOpenCr", name="Acct Open Cr", description="Open Credit in document currency & rate", dataType=FlyDataType.Amount, entityType="D", printName="Acct Open Cr", fieldLength=22)
	amtAcctOpenCr,
	//
	@FlyElement(columnName="AmtAcctOpenDr", name="Acct Open Dr", description="Open Debit in document currency & rate", dataType=FlyDataType.Amount, entityType="D", printName="Acct Open Dr", fieldLength=22)
	amtAcctOpenDr,
	//
	@FlyElement(columnName="AmtAcctOpenPosted", name="Open Posted Amount", dataType=FlyDataType.NONE, entityType="D", printName="Open Posted Amount", fieldLength=0)
	amtAcctOpenPosted,
	//
	@FlyElement(columnName="AmtAcctOpenSource", name="Open Source Amount", dataType=FlyDataType.NONE, entityType="D", printName="Open Source Amount", fieldLength=0)
	amtAcctOpenSource,
	//
	@FlyElement(columnName="AmtApproval", name="批准金额", description="The approval amount limit for this role", help="The Approval Amount field indicates the amount limit this Role has for approval of documents.", dataType=FlyDataType.Amount, entityType="D", printName="批准金额", fieldLength=22)
	amtApproval,
	//
	@FlyElement(columnName="AmtInWords", name="大写金额", description="大写金额", help="Amount in words will be printed.", dataType=FlyDataType.Amount, entityType="D", printName="大写金额", fieldLength=22)
	amtInWords,
	//
	@FlyElement(columnName="AmtLL", name="Amount LL", description="Amount Lower Level Cost", help="Amount Lower Level Cost", dataType=FlyDataType.NONE, entityType="D", printName="Amt Lower Level", fieldLength=0)
	amtLL,
	//
	@FlyElement(columnName="AmtLostSales", name="Lost Sales Amt", description="Amount of lost sales in Invoice Currency", dataType=FlyDataType.Amount, entityType="D", printName="Lost Sales Amt", fieldLength=22)
	amtLostSales,
	//
	@FlyElement(columnName="AmtMultiplier", name="乘数金额", description="Multiplier Amount for generating commissions", help="The Multiplier Amount indicates the amount to multiply the total amount generated by this commission run by.", dataType=FlyDataType.Number, entityType="D", printName="乘数金额", fieldLength=22)
	amtMultiplier,
	//
	@FlyElement(columnName="AmtRevalCr", name="Revaluated Amount Cr", description="Revaluated Cr Amount", dataType=FlyDataType.Amount, entityType="D", printName="Revaluated Amt Cr", fieldLength=22)
	amtRevalCr,
	//
	@FlyElement(columnName="AmtRevalCrDiff", name="Revaluated Difference Cr", description="Revaluated Cr Amount Difference", dataType=FlyDataType.Amount, entityType="D", printName="Difference Cr", fieldLength=22)
	amtRevalCrDiff,
	//
	@FlyElement(columnName="AmtRevalDiff", name="Revalue Diff", description="Revaluation difference", dataType=FlyDataType.NONE, entityType="D", printName="Revalue Diff", fieldLength=0)
	amtRevalDiff,
	//
	@FlyElement(columnName="AmtRevalDr", name="Revaluated Amount Dr", description="Revaluated Dr Amount", dataType=FlyDataType.Amount, entityType="D", printName="Revaluated Amt Dr", fieldLength=22)
	amtRevalDr,
	//
	@FlyElement(columnName="AmtRevalDrDiff", name="Revaluated Difference Dr", description="Revaluated Dr Amount Difference", dataType=FlyDataType.Amount, entityType="D", printName="Difference Dr", fieldLength=22)
	amtRevalDrDiff,
	//
	@FlyElement(columnName="AmtSource", name="Source Amount", description="Amount Balance in Source Currency", dataType=FlyDataType.Amount, entityType="D", printName="Source", fieldLength=22)
	amtSource,
	//
	@FlyElement(columnName="AmtSourceBalance", name="Source Balance", description="Source Balance Amount", help="The Source Balance Amount indicates the balance amount for this line in the source currency.", dataType=FlyDataType.Amount, entityType="D", printName="Source Balance", fieldLength=22)
	amtSourceBalance,
	//
	@FlyElement(columnName="AmtSourceCr", name="贷方来源", description="贷方来源金额", help="The Source Credit Amount indicates the credit amount for this line in the source currency.", dataType=FlyDataType.Amount, entityType="D", printName="贷方来源", fieldLength=22)
	amtSourceCr,
	//
	@FlyElement(columnName="AmtSourceDr", name="借方来源", description="借方来源金额", help="The Source Debit Amount indicates the credit amount for this line in the source currency.", dataType=FlyDataType.Amount, entityType="D", printName="借方来源", fieldLength=22)
	amtSourceDr,
	//
	@FlyElement(columnName="AmtSubtract", name="减去金额", description="Subtract Amount for generating commissions", help="The Subtract Amount indicates the amount to subtract from the total amount prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="减去金额", fieldLength=22)
	amtSubtract,
	//
	@FlyElement(columnName="A_Name", name="帐户名字", description="Name on Credit Card or Account holder", help="The Name of the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="帐户名字", fieldLength=60)
	aName,
	//
	@FlyElement(columnName="AndOr", name="And/Or", description="Logical operation: AND or OR", dataType=FlyDataType.List, entityType="D", printName="And/Or", fieldLength=1)
	andOr,
	//
	@FlyElement(columnName="A_New_Used", name="Asset New Used", dataType=FlyDataType.YesNo, entityType="D", printName="Asset New Used", fieldLength=1)
	aNewUsed,
	//
	@FlyElement(columnName="AnyAcct", name="Any Account", description="Match any value of the Account segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Acct", fieldLength=1)
	anyAcct,
	//
	@FlyElement(columnName="AnyActivity", name="Any Activity", description="Match any value of the Activity segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Activity", fieldLength=1)
	anyActivity,
	//
	@FlyElement(columnName="AnyBPartner", name="Any Bus.Partner", description="Match any value of the Business Partner segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any BPartner", fieldLength=1)
	anyBPartner,
	//
	@FlyElement(columnName="AnyCampaign", name="Any Campaign", description="Match any value of the Campaign segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Campaign", fieldLength=1)
	anyCampaign,
	//
	@FlyElement(columnName="AnyLocFrom", name="Any Location From", description="Match any value of the Location From segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Loc From", fieldLength=1)
	anyLocFrom,
	//
	@FlyElement(columnName="AnyLocTo", name="Any Location To", description="Match any value of the Location To segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Loc To", fieldLength=1)
	anyLocTo,
	//
	@FlyElement(columnName="AnyOrg", name="Any Organization", description="Match any value of the Organization segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Org", fieldLength=1)
	anyOrg,
	//
	@FlyElement(columnName="AnyOrgTrx", name="Any Trx Organization", description="Match any value of the Transaction Organization segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Trx Org", fieldLength=1)
	anyOrgTrx,
	//
	@FlyElement(columnName="AnyProduct", name="Any Product", description="Match any value of the Product segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Product", fieldLength=1)
	anyProduct,
	//
	@FlyElement(columnName="AnyProject", name="Any Project", description="Match any value of the Project segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Project", fieldLength=1)
	anyProject,
	//
	@FlyElement(columnName="AnySalesRegion", name="Any Sales Region", description="Match any value of the Sales Region segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any Sales Region", fieldLength=1)
	anySalesRegion,
	//
	@FlyElement(columnName="AnyUser1", name="Any User 1", description="Match any value of the User 1 segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any User 1", fieldLength=1)
	anyUser1,
	//
	@FlyElement(columnName="AnyUser2", name="Any User 2", description="Match any value of the User 2 segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any User 2", fieldLength=1)
	anyUser2,
	//
	@FlyElement(columnName="AnyUser3", name="Any User 3", description="Match any value of the User 3 segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any User 3", fieldLength=1)
	anyUser3,
	//
	@FlyElement(columnName="AnyUser4", name="Any User 4", description="Match any value of the User 4 segment", help="If selected, any value of the account segment will match. If not selected, but no value of the accounting segment is selected, the matched value must be null (i.e. not defined).", dataType=FlyDataType.YesNo, entityType="D", printName="Any User 4", fieldLength=1)
	anyUser4,
	//
	@FlyElement(columnName="APAR", name="AP - AR", description="Include Receivables and/or Payables transactions", dataType=FlyDataType.List, entityType="D", printName="AP - AR", fieldLength=1)
	aPAR,
	//
	@FlyElement(columnName="A_Parent_Asset_ID", name="Parent Asset", dataType=FlyDataType.Search, entityType="D", printName="Parent Asset", fieldLength=22)
	aParentAssetID,
	//
	@FlyElement(columnName="APEnquiry", name="AP Enquiry", dataType=FlyDataType.NONE, entityType="D", printName="AP Enquiry", fieldLength=0)
	aPEnquiry,
	//
	@FlyElement(columnName="A_Percent_Original", name="Original Percent", dataType=FlyDataType.Number, entityType="D", printName="Original Percent", fieldLength=22)
	aPercentOriginal,
	//
	@FlyElement(columnName="A_Percent_Split", name="A_Percent_Split", dataType=FlyDataType.Number, entityType="D", printName="A_Percent_Split", fieldLength=22)
	aPercentSplit,
	//
	@FlyElement(columnName="A_Period", name="Asset Period", dataType=FlyDataType.Integer, entityType="D", printName="Asset Period", fieldLength=22)
	aPeriod,
	//
	@FlyElement(columnName="A_Period_1", name="Period 1", dataType=FlyDataType.Number, entityType="D", printName="Period 1", fieldLength=22)
	aPeriod1,
	//
	@FlyElement(columnName="A_Period_10", name="Period 10", dataType=FlyDataType.Number, entityType="D", printName="Period 10", fieldLength=22)
	aPeriod10,
	//
	@FlyElement(columnName="A_Period_11", name="Period 11", dataType=FlyDataType.Number, entityType="D", printName="Period 11", fieldLength=22)
	aPeriod11,
	//
	@FlyElement(columnName="A_Period_12", name="Period 12", dataType=FlyDataType.Number, entityType="D", printName="Period 12", fieldLength=22)
	aPeriod12,
	//
	@FlyElement(columnName="A_Period_13", name="Period 13", dataType=FlyDataType.Number, entityType="D", printName="Period 13", fieldLength=22)
	aPeriod13,
	//
	@FlyElement(columnName="A_Period_14", name="Period 14", dataType=FlyDataType.Number, entityType="D", printName="Period 14", fieldLength=22)
	aPeriod14,
	//
	@FlyElement(columnName="A_Period_2", name="Period 2", dataType=FlyDataType.Number, entityType="D", printName="Period 2", fieldLength=22)
	aPeriod2,
	//
	@FlyElement(columnName="A_Period_3", name="Period 3", dataType=FlyDataType.Number, entityType="D", printName="Period 3", fieldLength=22)
	aPeriod3,
	//
	@FlyElement(columnName="A_Period_4", name="Period 4", dataType=FlyDataType.Number, entityType="D", printName="Period 4", fieldLength=22)
	aPeriod4,
	//
	@FlyElement(columnName="A_Period_5", name="Period 5", dataType=FlyDataType.Number, entityType="D", printName="Period 5", fieldLength=22)
	aPeriod5,
	//
	@FlyElement(columnName="A_Period_6", name="Period 6", dataType=FlyDataType.Number, entityType="D", printName="Period 6", fieldLength=22)
	aPeriod6,
	//
	@FlyElement(columnName="A_Period_7", name="Period 7", dataType=FlyDataType.Number, entityType="D", printName="Period 7", fieldLength=22)
	aPeriod7,
	//
	@FlyElement(columnName="A_Period_8", name="Period 8", dataType=FlyDataType.Number, entityType="D", printName="Period 8", fieldLength=22)
	aPeriod8,
	//
	@FlyElement(columnName="A_Period_9", name="Period 9", dataType=FlyDataType.Number, entityType="D", printName="Period 9", fieldLength=22)
	aPeriod9,
	//
	@FlyElement(columnName="A_Period_End", name="A_Period_End", dataType=FlyDataType.Integer, entityType="D", printName="A_Period_End", fieldLength=10)
	aPeriodEnd,
	//
	@FlyElement(columnName="A_Period_Forecast", name="A_Period_Forecast", dataType=FlyDataType.Number, entityType="D", printName="A_Period_Forecast", fieldLength=10)
	aPeriodForecast,
	//
	@FlyElement(columnName="A_Period_Posted", name="A_Period_Posted", dataType=FlyDataType.Integer, entityType="D", printName="A_Period_Posted", fieldLength=22)
	aPeriodPosted,
	//
	@FlyElement(columnName="A_Period_Start", name="A_Period_Start", dataType=FlyDataType.Integer, entityType="D", printName="A_Period_Start", fieldLength=10)
	aPeriodStart,
	//
	@FlyElement(columnName="A_Policy_No", name="Asset Policy No", dataType=FlyDataType.String, entityType="D", printName="Asset Policy No", fieldLength=100)
	aPolicyNo,
	//
	@FlyElement(columnName="Apply", name="Apply", description="Apply migration", dataType=FlyDataType.NONE, entityType="D", printName="Apply", fieldLength=0)
	apply,
	//
	@FlyElement(columnName="ApprovalAmt", name="Approval Amount", description="Document Approval Amount", help="Approval Amount for Workflow", dataType=FlyDataType.Amount, entityType="D", printName="Approval Amt", fieldLength=22)
	approvalAmt,
	//
	@FlyElement(columnName="A_Prior_Year_Accumulated_Depr", name="A_Prior_Year_Accumulated_Depr", dataType=FlyDataType.Amount, entityType="D", printName="A_Prior_Year_Accumulated_Depr", fieldLength=22)
	aPriorYearAccumulatedDepr,
	//
	@FlyElement(columnName="A_Proceeds", name="Asset Proceeds", dataType=FlyDataType.Amount, entityType="D", printName="Asset Proceeds", fieldLength=22)
	aProceeds,
	//
	@FlyElement(columnName="A_Processed", name="Processed", dataType=FlyDataType.YesNo, entityType="D", printName="Processed", fieldLength=1)
	aProcessed,
	//
	@FlyElement(columnName="A_Purchase_Option", name="Purchase Option", dataType=FlyDataType.YesNo, entityType="D", printName="Purchase Option", fieldLength=2)
	aPurchaseOption,
	//
	@FlyElement(columnName="A_Purchase_Option_Credit", name="Purchase Option Credit", dataType=FlyDataType.Integer, entityType="D", printName="Purchase Option Credit", fieldLength=22)
	aPurchaseOptionCredit,
	//
	@FlyElement(columnName="A_Purchase_Option_Credit_Per", name="Purchase Option Credit %", dataType=FlyDataType.Number, entityType="D", printName="Purchase Option Credit %", fieldLength=22)
	aPurchaseOptionCreditPer,
	//
	@FlyElement(columnName="A_Purchase_Price", name="Purchase Price", dataType=FlyDataType.Amount, entityType="D", printName="Purchase Price", fieldLength=22)
	aPurchasePrice,
	//
	@FlyElement(columnName="A_QTY_Current", name="Current Qty", dataType=FlyDataType.Number, entityType="D", printName="Current Qty", fieldLength=22)
	aQTYCurrent,
	//
	@FlyElement(columnName="A_QTY_Original", name="A_QTY_Original", dataType=FlyDataType.Number, entityType="D", printName="A_QTY_Original", fieldLength=22)
	aQTYOriginal,
	//
	@FlyElement(columnName="A_QTY_Split", name="Qty. Split", dataType=FlyDataType.Number, entityType="D", printName="Qty. Split", fieldLength=22)
	aQTYSplit,
	//
	@FlyElement(columnName="ArcDiameter", name="Arc Diameter", description="Arc Diameter for rounded Rectangles", help="Width of the horizontal/vertical diameter of the arc at the four corners", dataType=FlyDataType.Integer, entityType="D", printName="Arc Diameter", fieldLength=22)
	arcDiameter,
	//
	@FlyElement(columnName="AreaCode", name="区号", description="长途区号", help="长途区号", dataType=FlyDataType.String, entityType="D", printName="区号", fieldLength=10)
	areaCode,
	//
	@FlyElement(columnName="A_RegistrationAttribute_ID", name="Registration Attribute", description="Asset Registration Attribute", help="Define the individual values for the Asset Registration", dataType=FlyDataType.ID, entityType="D", printName="Registration Attribute", fieldLength=22)
	aRegistrationAttributeID,
	//
	@FlyElement(columnName="A_Registration_ID", name="Registration", description="User Asset Registration", help="User Registration of an Asset", dataType=FlyDataType.ID, entityType="D", printName="Registration", fieldLength=22)
	aRegistrationID,
	//
	@FlyElement(columnName="A_Remaining_Period", name="Remaining Period", dataType=FlyDataType.NONE, entityType="D", printName="Remaining Period", fieldLength=0)
	aRemainingPeriod,
	//
	@FlyElement(columnName="A_Renewal_Date", name="Asset Renewal Date", dataType=FlyDataType.Date, entityType="D", printName="Asset Renewal Date", fieldLength=7)
	aRenewalDate,
	//
	@FlyElement(columnName="AREnquiry", name="AR Enquiry", dataType=FlyDataType.NONE, entityType="D", printName="AR Enquiry", fieldLength=0)
	aREnquiry,
	//
	@FlyElement(columnName="A_Replace_Cost", name="Asset Replace Cost", dataType=FlyDataType.Amount, entityType="D", printName="Asset Replace Cost", fieldLength=22)
	aReplaceCost,
	//
	@FlyElement(columnName="A_Reval_Accumdep_Offset_Cur", name="Revaluation Accumulated Depreciation Offset for Current Year", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Accumulated Depreciation Offset for Current Year", fieldLength=22)
	aRevalAccumdepOffsetCur,
	//
	@FlyElement(columnName="A_Reval_Accumdep_Offset_Prior", name="Revaluation Accumulated Depreciation Offset for Prior Year", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Accumulated Depreciation Offset for Prior Year", fieldLength=22)
	aRevalAccumdepOffsetPrior,
	//
	@FlyElement(columnName="A_Reval_Adep_Offset_Cur_Acct", name="A_Reval_Accumdep_Offset_Cur", dataType=FlyDataType.NONE, entityType="D", printName="A_Reval_Accumdep_Offset_Cur", fieldLength=0)
	aRevalAdepOffsetCurAcct,
	//
	@FlyElement(columnName="A_Reval_Adep_Offset_Prior_Acct", name="A_Reval_Accumdep_Offset_Prior", dataType=FlyDataType.NONE, entityType="D", printName="A_Reval_Accumdep_Offset_Prior", fieldLength=0)
	aRevalAdepOffsetPriorAcct,
	//
	@FlyElement(columnName="A_Reval_Cal_Method", name="A_Reval_Cal_Method", dataType=FlyDataType.List, entityType="D", printName="A_Reval_Cal_Method", fieldLength=3)
	aRevalCalMethod,
	//
	@FlyElement(columnName="A_Reval_Code", name="Reval. Code", dataType=FlyDataType.List, entityType="D", printName="Reval. Code", fieldLength=3)
	aRevalCode,
	//
	@FlyElement(columnName="A_Reval_Cost_Offset", name="Revaluation Cost Offset for Current Year", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Cost Offset for Current Year", fieldLength=22)
	aRevalCostOffset,
	//
	@FlyElement(columnName="A_Reval_Cost_Offset_Acct", name="Reval Cost Offset Acct", dataType=FlyDataType.NONE, entityType="D", printName="Reval Cost Offset Acct", fieldLength=0)
	aRevalCostOffsetAcct,
	//
	@FlyElement(columnName="A_Reval_Cost_Offset_Prior", name="Revaluation Cost Offset for Prior Year", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Cost Offset for Prior Year", fieldLength=22)
	aRevalCostOffsetPrior,
	//
	@FlyElement(columnName="A_Reval_Cost_Offset_Prior_Acct", name="Reval Cost Offset Prior Acct", dataType=FlyDataType.NONE, entityType="D", printName="Reval Cost Offset Prior Acct", fieldLength=0)
	aRevalCostOffsetPriorAcct,
	//
	@FlyElement(columnName="A_Reval_Depexp_Offset", name="Revaluation Expense Offs", dataType=FlyDataType.Account, entityType="D", printName="Revaluation Expense Offs", fieldLength=22)
	aRevalDepexpOffset,
	//
	@FlyElement(columnName="A_Reval_Depexp_Offset_Acct", name="Reval Depexp Offset Acct", dataType=FlyDataType.NONE, entityType="D", printName="Reval Depexp Offset Acct", fieldLength=0)
	aRevalDepexpOffsetAcct,
	//
	@FlyElement(columnName="A_Reval_Effective_Date", name="Reval. Effective Date", dataType=FlyDataType.List, entityType="D", printName="Reval. Effective Date", fieldLength=2)
	aRevalEffectiveDate,
	//
	@FlyElement(columnName="A_Reval_Multiplier", name="Reval. Multiplier", dataType=FlyDataType.List, entityType="D", printName="Reval. Multiplier", fieldLength=3)
	aRevalMultiplier,
	//
	@FlyElement(columnName="A_Reval_Rate", name="Reval. Rate", dataType=FlyDataType.Number, entityType="D", printName="Reval. Rate", fieldLength=22)
	aRevalRate,
	//
	@FlyElement(columnName="A_Rev_Code", name="Rev. Code", dataType=FlyDataType.List, entityType="D", printName="Rev. Code", fieldLength=3)
	aRevCode,
	//
	@FlyElement(columnName="Args", name="Args", dataType=FlyDataType.String, entityType="D", printName="Args", fieldLength=510)
	args,
	//
	@FlyElement(columnName="A_Salvage_Value", name="Asset Salvage Value", dataType=FlyDataType.Amount, entityType="D", printName="Asset Salvage Value", fieldLength=10)
	aSalvageValue,
	//
	@FlyElement(columnName="A_SourceType", name="Source Type", dataType=FlyDataType.List, entityType="D", printName="Source Type", fieldLength=3)
	aSourceType,
	//
	@FlyElement(columnName="ASP_ClientException_ID", name="Client Exception", dataType=FlyDataType.ID, entityType="D", printName="Client Exception", fieldLength=22)
	aSPClientExceptionID,
	//
	@FlyElement(columnName="ASP_ClientLevel_ID", name="Client Level", dataType=FlyDataType.ID, entityType="D", printName="Client Level", fieldLength=22)
	aSPClientLevelID,
	//
	@FlyElement(columnName="ASP_Field_ID", name="ASP Field", dataType=FlyDataType.ID, entityType="D", printName="ASP Field", fieldLength=10)
	aSPFieldID,
	//
	@FlyElement(columnName="ASP_Form_ID", name="ASP Form", dataType=FlyDataType.ID, entityType="D", printName="ASP Form", fieldLength=10)
	aSPFormID,
	//
	@FlyElement(columnName="ASP_Level_ID", name="ASP Level", dataType=FlyDataType.TableDirect, entityType="D", printName="ASP Level", fieldLength=22)
	aSPLevelID,
	//
	@FlyElement(columnName="A_Split_Percent", name="Split Percent", dataType=FlyDataType.Number, entityType="D", printName="Split Percent", fieldLength=22)
	aSplitPercent,
	//
	@FlyElement(columnName="A_Split_Type", name="Split Type", dataType=FlyDataType.List, entityType="D", printName="Split Type", fieldLength=3)
	aSplitType,
	//
	@FlyElement(columnName="ASP_Module_ID", name="ASP Module", dataType=FlyDataType.ID, entityType="D", printName="ASP Module", fieldLength=22)
	aSPModuleID,
	//
	@FlyElement(columnName="ASP_Process_ID", name="ASP Process", dataType=FlyDataType.ID, entityType="D", printName="ASP Process", fieldLength=10)
	aSPProcessID,
	//
	@FlyElement(columnName="ASP_Process_Para_ID", name="ASP Process Parameter", dataType=FlyDataType.ID, entityType="D", printName="ASP Process Parameter", fieldLength=10)
	aSPProcessParaID,
	//
	@FlyElement(columnName="ASP_Status", name="ASP Status", dataType=FlyDataType.List, entityType="D", printName="ASP Status", fieldLength=1)
	aSPStatus,
	//
	@FlyElement(columnName="ASP_Tab_ID", name="ASP Tab", dataType=FlyDataType.ID, entityType="D", printName="ASP Tab", fieldLength=10)
	aSPTabID,
	//
	@FlyElement(columnName="ASP_Task_ID", name="ASP Task", dataType=FlyDataType.ID, entityType="D", printName="ASP Task", fieldLength=10)
	aSPTaskID,
	//
	@FlyElement(columnName="ASP_Window_ID", name="ASP Window", dataType=FlyDataType.ID, entityType="D", printName="ASP Window", fieldLength=10)
	aSPWindowID,
	//
	@FlyElement(columnName="ASP_Workflow_ID", name="ASP Workflow", dataType=FlyDataType.ID, entityType="D", printName="ASP Workflow", fieldLength=10)
	aSPWorkflowID,
	//
	@FlyElement(columnName="AssetAccumDepreciationAmt", name="AssetAccumDepreciationAmt", dataType=FlyDataType.Amount, entityType="D", printName="AssetAccumDepreciationAmt", fieldLength=22)
	assetAccumDepreciationAmt,
	//
	@FlyElement(columnName="AssetActivationDate", name="Activation Date", dataType=FlyDataType.NONE, entityType="D", printName="Activation Date", fieldLength=0)
	assetActivationDate,
	//
	@FlyElement(columnName="AssetAmtEntered", name="Entered Amount", dataType=FlyDataType.NONE, entityType="D", printName="Amount", fieldLength=0)
	assetAmtEntered,
	//
	@FlyElement(columnName="AssetBookValueAmt", name="AssetBookValueAmt", dataType=FlyDataType.Amount, entityType="D", printName="AssetBookValueAmt", fieldLength=22)
	assetBookValueAmt,
	//
	@FlyElement(columnName="AssetDepreciationDate", name="资产折旧日期", description="最近折旧日期", help="Date of the last deprecation, if the asset is used internally and depreciated.", dataType=FlyDataType.Date, entityType="D", printName="资产折旧日期", fieldLength=7)
	assetDepreciationDate,
	//
	@FlyElement(columnName="AssetDisposalDate", name="资产处理日期", description="Date when the asset is was disposed", dataType=FlyDataType.Date, entityType="D", printName="资产处理日期", fieldLength=7)
	assetDisposalDate,
	//
	@FlyElement(columnName="AssetMarketValueAmt", name="市场价值金额", description="资产的市场价格", help="For reporting, the market value of the asset", dataType=FlyDataType.Amount, entityType="D", printName="市场价值金额", fieldLength=22)
	assetMarketValueAmt,
	//
	@FlyElement(columnName="AssetPeriodDepreciationAmt", name="Depreciation Amount / Period", description="Applies to Straight Line depreciation", dataType=FlyDataType.NONE, entityType="D", printName="Depreciation Amount / Period", fieldLength=0)
	assetPeriodDepreciationAmt,
	//
	@FlyElement(columnName="AssetServiceDate", name="在服务日期内", description="Date when Asset was put into service", help="The date when the asset was put into service - usually used as start date for depreciation.", dataType=FlyDataType.Date, entityType="D", printName="在服务日期内", fieldLength=7)
	assetServiceDate,
	//
	@FlyElement(columnName="AssetSourceAmt", name="Source Amount", dataType=FlyDataType.NONE, entityType="D", printName="Source Amount", fieldLength=0)
	assetSourceAmt,
	//
	@FlyElement(columnName="AssetValue", name="Asset Value", dataType=FlyDataType.NONE, entityType="D", printName="Asset Value", fieldLength=0)
	assetValue,
	//
	@FlyElement(columnName="AssetValueAmt", name="资产价值", description="资产的帐面价格", dataType=FlyDataType.Amount, entityType="D", printName="资产价值", fieldLength=22)
	assetValueAmt,
	//
	@FlyElement(columnName="AssignDateFrom", name="分配来自", description="分配资源从", help="任务开始", dataType=FlyDataType.DateTime, entityType="D", printName="分配来自", fieldLength=7)
	assignDateFrom,
	//
	@FlyElement(columnName="AssignDateTo", name="分配到", description="分配资源直到", help="任务结束", dataType=FlyDataType.DateTime, entityType="D", printName="分配到", fieldLength=7)
	assignDateTo,
	//
	@FlyElement(columnName="A_Start_Asset_ID", name="From Asset", dataType=FlyDataType.Table, entityType="D", printName="From Asset", fieldLength=22)
	aStartAssetID,
	//
	@FlyElement(columnName="A_State", name="帐户州", description="State of the Credit Card or Account holder", help="The State of the Credit Card or Account holder", dataType=FlyDataType.String, entityType="D", printName="州", fieldLength=40)
	aState,
	//
	@FlyElement(columnName="A_Street", name="帐户街道", description="Street address of the Credit Card or Account holder", help="The Street Address of the Credit Card or Account holder.", dataType=FlyDataType.String, entityType="D", printName="街道", fieldLength=60)
	aStreet,
	//
	@FlyElement(columnName="A_Table_Rate_Type", name="Type", dataType=FlyDataType.List, entityType="D", printName="Type", fieldLength=2)
	aTableRateType,
	//
	@FlyElement(columnName="A_Tax_Entity", name="Asset Tax Entity", dataType=FlyDataType.String, entityType="D", printName="Asset Tax Entity", fieldLength=22)
	aTaxEntity,
	//
	@FlyElement(columnName="A_Term", name="Period/Yearly", dataType=FlyDataType.List, entityType="D", printName="Period/Yearly", fieldLength=2)
	aTerm,
	//
	@FlyElement(columnName="A_Tip_Finantare", name="Financing Type", description="Financing Type", dataType=FlyDataType.NONE, entityType="D", printName="Financing Type", fieldLength=0)
	aTipFinantare,
	//
	@FlyElement(columnName="A_Transfer_Balance", name="A_Transfer_Balance", dataType=FlyDataType.YesNo, entityType="D", printName="A_Transfer_Balance", fieldLength=1)
	aTransferBalance,
	//
	@FlyElement(columnName="A_Transfer_Balance_IS", name="A_Transfer_Balance_IS", dataType=FlyDataType.YesNo, entityType="D", printName="A_Transfer_Balance_IS", fieldLength=1)
	aTransferBalanceIS,
	//
	@FlyElement(columnName="AttachAsset", name="Attach Asset", description="Attach Asset to be delivered per email", dataType=FlyDataType.NONE, entityType="D", printName="Attach Asset", fieldLength=0)
	attachAsset,
	//
	@FlyElement(columnName="Attribute", name="属性", dataType=FlyDataType.String, entityType="D", printName="属性", fieldLength=60)
	attribute,
	//
	@FlyElement(columnName="AttributeName", name="Attribute Name", description="Name of the Attribute", help="Identifier of the attribute", dataType=FlyDataType.String, entityType="D", printName="Attribute Name", fieldLength=60)
	attributeName,
	//
	@FlyElement(columnName="AttributeValue", name="Attribute Value", description="Value of the Attribute", dataType=FlyDataType.String, entityType="D", printName="Attribute Value", fieldLength=60)
	attributeValue,
	//
	@FlyElement(columnName="AttributeValueType", name="Attribute Value Type", description="Type of Attribute Value", help="The Attribute Value type deternines the data/validation type", dataType=FlyDataType.List, entityType="D", printName="Attribute Value Type", fieldLength=1)
	attributeValueType,
	//
	@FlyElement(columnName="AuctionType", name="Auction Type", dataType=FlyDataType.List, entityType="D", printName="Auction Type", fieldLength=1)
	auctionType,
	//
	@FlyElement(columnName="A_User1", name="A_User1", dataType=FlyDataType.String, entityType="D", printName="A_User1", fieldLength=3)
	aUser1,
	//
	@FlyElement(columnName="A_User10", name="A_User10", dataType=FlyDataType.String, entityType="D", printName="A_User10", fieldLength=3)
	aUser10,
	//
	@FlyElement(columnName="A_User11", name="A_User11", dataType=FlyDataType.String, entityType="D", printName="A_User11", fieldLength=10)
	aUser11,
	//
	@FlyElement(columnName="A_User12", name="A_User12", dataType=FlyDataType.String, entityType="D", printName="A_User12", fieldLength=10)
	aUser12,
	//
	@FlyElement(columnName="A_User13", name="A_User13", dataType=FlyDataType.String, entityType="D", printName="A_User13", fieldLength=10)
	aUser13,
	//
	@FlyElement(columnName="A_User14", name="A_User14", dataType=FlyDataType.String, entityType="D", printName="A_User14", fieldLength=10)
	aUser14,
	//
	@FlyElement(columnName="A_User15", name="A_User15", dataType=FlyDataType.String, entityType="D", printName="A_User15", fieldLength=10)
	aUser15,
	//
	@FlyElement(columnName="A_User2", name="A_User2", dataType=FlyDataType.String, entityType="D", printName="A_User2", fieldLength=3)
	aUser2,
	//
	@FlyElement(columnName="A_User3", name="A_User3", dataType=FlyDataType.String, entityType="D", printName="A_User3", fieldLength=3)
	aUser3,
	//
	@FlyElement(columnName="A_User4", name="A_User4", dataType=FlyDataType.String, entityType="D", printName="A_User4", fieldLength=3)
	aUser4,
	//
	@FlyElement(columnName="A_User5", name="A_User5", dataType=FlyDataType.String, entityType="D", printName="A_User5", fieldLength=3)
	aUser5,
	//
	@FlyElement(columnName="A_User6", name="A_User6", dataType=FlyDataType.String, entityType="D", printName="A_User6", fieldLength=3)
	aUser6,
	//
	@FlyElement(columnName="A_User7", name="A_User7", dataType=FlyDataType.String, entityType="D", printName="A_User7", fieldLength=3)
	aUser7,
	//
	@FlyElement(columnName="A_User8", name="A_User8", dataType=FlyDataType.String, entityType="D", printName="A_User8", fieldLength=3)
	aUser8,
	//
	@FlyElement(columnName="A_User9", name="A_User9", dataType=FlyDataType.String, entityType="D", printName="A_User9", fieldLength=3)
	aUser9,
	//
	@FlyElement(columnName="AuthMechanism", name="Authentication Mechanism", dataType=FlyDataType.List, entityType="D", printName="Authentication Mechanism", fieldLength=1)
	authMechanism,
	//
	@FlyElement(columnName="Author", name="Author", description="Author/Creator of the Entity", dataType=FlyDataType.String, entityType="D", printName="Author", fieldLength=20)
	author,
	//
	@FlyElement(columnName="AutoArchive", name="Auto Archive", description="Enable and level of automatic Archive of documents", help="Adempiere allows to automatically create archives of Documents (e.g. Invoices) or Reports. You view the archived material with the Archive Viewer", dataType=FlyDataType.List, entityType="D", printName="Auto Archive", fieldLength=1)
	autoArchive,
	//
	@FlyElement(columnName="AutoDueDateDays", name="Auto Due Date Days", description="Automatic Due Date Days", help="If a due date is not defined and the Auto Due Days ins greater then zero, a due date in the number of days is automatically created.", dataType=FlyDataType.Integer, entityType="D", printName="Auto Due Date Days", fieldLength=10)
	autoDueDateDays,
	//
	@FlyElement(columnName="AutoLock", name="Auto Lock", description="Whether to automatically lock the terminal when till is closed", dataType=FlyDataType.YesNo, entityType="D", printName="Auto Lock", fieldLength=1)
	autoLock,
	//
	@FlyElement(columnName="AutoLogoutDelay", name="Auto Logout Delay", description="Automatically logout if terminal inactive for this period", help="Measured in seconds, zero for no automatic logout", dataType=FlyDataType.Integer, entityType="D", printName="Auto Logout Delay", fieldLength=10)
	autoLogoutDelay,
	//
	@FlyElement(columnName="AutoPeriodControl", name="自动分期控制", description="If selected, the periods are automatically opened and closed", help="In the Automatic Period Control, periods are opened and closed based on the current date.  If the Manual alternative is activated, you have to open and close periods explicitly.", dataType=FlyDataType.YesNo, entityType="D", printName="自动分期控制", fieldLength=1)
	autoPeriodControl,
	//
	@FlyElement(columnName="AvailableAmt", name="Available Amount", description="Amount available for allocation for this document", dataType=FlyDataType.Amount, entityType="D", printName="Available Amt", fieldLength=22)
	availableAmt,
	//
	@FlyElement(columnName="A_Valoare_Cofinantare", name="Own contribution", dataType=FlyDataType.NONE, entityType="D", printName="Own contribution", fieldLength=0)
	aValoareCofinantare,
	//
	@FlyElement(columnName="A_Valoare_Tert", name="Third contribution", dataType=FlyDataType.NONE, entityType="D", printName="Third contribution", fieldLength=0)
	aValoareTert,
	//
	@FlyElement(columnName="A_Value_2004", name="Value 2004", dataType=FlyDataType.NONE, entityType="D", printName="Value 2004", fieldLength=0)
	aValue2004,
	//
	@FlyElement(columnName="ax_case", name="ax_case", dataType=FlyDataType.NONE, entityType="D", printName="ax_case", fieldLength=0)
	axcase,
	//
	@FlyElement(columnName="A_Zip", name="Account Zip Postal", description="Zip Code of the Credit Card or Account Holder", help="The Zip Code of the Credit Card or Account Holder.", dataType=FlyDataType.String, entityType="D", printName="邮递区号 ", fieldLength=20)
	aZip,
	//
	@FlyElement(columnName="BackupFolder", name="Backup Folder", description="Backup Folder", dataType=FlyDataType.FilePath, entityType="D", printName="Backup Folder", fieldLength=255)
	backupFolder,
	//
	@FlyElement(columnName="BackupValue", name="Backup Value", description="The value of the column prior to migration.", dataType=FlyDataType.NONE, entityType="D", printName="Backup Value", fieldLength=0)
	backupValue,
	//
	@FlyElement(columnName="Balance", name="余款", dataType=FlyDataType.Amount, entityType="D", printName="余款", fieldLength=22)
	balance,
	//
	@FlyElement(columnName="BankAccountNo", name="银行帐户号", description="银行帐户号", dataType=FlyDataType.String, entityType="D", printName="银行帐户号", fieldLength=20)
	bankAccountNo,
	//
	@FlyElement(columnName="BankAccountType", name="银行帐户类型", description="银行帐户类型", help="The Bank Account Type field indicates the type of account (savings, checking etc) this account  is defined as.", dataType=FlyDataType.List, entityType="D", printName="帐户类型", fieldLength=1)
	bankAccountType,
	//
	@FlyElement(columnName="BankName", name="Bank Name", dataType=FlyDataType.String, entityType="D", printName="Bank Name", fieldLength=120)
	bankName,
	//
	@FlyElement(columnName="BarcodeType", name="Barcode Type", description="Type of barcode", dataType=FlyDataType.List, entityType="D", printName="Barcode", fieldLength=3)
	barcodeType,
	//
	@FlyElement(columnName="Base", name="Base", description="Calculation Base", dataType=FlyDataType.Number, entityType="D", printName="Base", fieldLength=22)
	base,
	//
	@FlyElement(columnName="BasePriceList_ID", name="基本的价格目录", description="Pricelist to be used, if product not found on this pricelist", help="The Base Price List identifies the default price list to be used if a product is not found on the selected price list", dataType=FlyDataType.Table, entityType="D", printName="基础", fieldLength=22)
	basePriceListID,
	//
	@FlyElement(columnName="B_Asset_Acct", name="银行资产", description="银行资产帐户", help="The Bank Asset Account identifies the account to be used for booking changes to the balance in this bank account", dataType=FlyDataType.Account, entityType="D", printName="银行资产", fieldLength=22)
	bAssetAcct,
	//
	@FlyElement(columnName="BatchDescription", name="批描述", description="批的描述", dataType=FlyDataType.String, entityType="D", printName="批描述", fieldLength=255)
	batchDescription,
	//
	@FlyElement(columnName="BatchDocumentNo", name="批文件号", description="文档批的数字", dataType=FlyDataType.String, entityType="D", printName="批文件号", fieldLength=30)
	batchDocumentNo,
	//
	@FlyElement(columnName="BBAN", name="BBAN", description="Basic Bank Account Number", help="The Basic (or Domestic) Bank Account Number is used in Bank transfers (see also IBAN). For details see ISO 13616 and http://www.ecbs.org/", dataType=FlyDataType.String, entityType="D", printName="BBAN", fieldLength=40)
	bBAN,
	//
	@FlyElement(columnName="B_BidComment_ID", name="Bid Comment", description="Make a comment to a Bid Topic", help="Everyone can give comments concerning a Bid Topic - e.g. Questions, Suggestions", dataType=FlyDataType.ID, entityType="D", printName="Bid Comment", fieldLength=22)
	bBidCommentID,
	//
	@FlyElement(columnName="B_Bid_ID", name="Bid", description="Bid for a Topic", help="You can create a bid for a topic.  Depening on the type, the highest bidder wins the Topic - or you participate in funding for a Topic.", dataType=FlyDataType.ID, entityType="D", printName="Bid", fieldLength=22)
	bBidID,
	//
	@FlyElement(columnName="B_BuyerFunds_ID", name="Buyer Funds", description="Buyer Funds for Bids on Topics", help="Available Funds (from Payments) and Committed or Uncommited funds for Bids", dataType=FlyDataType.ID, entityType="D", printName="Buyer Funds", fieldLength=22)
	bBuyerFundsID,
	//
	@FlyElement(columnName="BeginningBalance", name="期初余款", description="Balance prior to any transactions", help="The Beginning Balance is the balance prior to making any adjustments for payments or disbursements.", dataType=FlyDataType.Amount, entityType="D", printName="期初余款", fieldLength=22)
	beginningBalance,
	//
	@FlyElement(columnName="BeginningQtyBalance", name="Beginning Qty Balance", description="Quantity Balance prior to any transactions", help="The Quantity Beginning Balance is the balance prior", dataType=FlyDataType.NONE, entityType="D", printName="Beginning Qty Balance", fieldLength=0)
	beginningQtyBalance,
	//
	@FlyElement(columnName="BelowColumn", name="下面列", description="Print this column below the column index entered", help="This column is printed in a second line below the content of the first line identified. Please be aware, that this is depends on the actual sequence. Enter a 1 to add the info below the first column.", dataType=FlyDataType.Integer, entityType="D", printName="下面列", fieldLength=22)
	belowColumn,
	//
	@FlyElement(columnName="BenchmarkDate", name="Date", description="Benchmark Date", help="Date of the Benchmark Data Point", dataType=FlyDataType.DateTime, entityType="D", printName="Date", fieldLength=7)
	benchmarkDate,
	//
	@FlyElement(columnName="BenchmarkDifference", name="Benchmark Difference", description="Difference between Response Price and Benchmark Price", dataType=FlyDataType.Amount, entityType="D", printName="Benchmark Difference", fieldLength=22)
	benchmarkDifference,
	//
	@FlyElement(columnName="BenchmarkPrice", name="Benchmark Price", description="Price to compare responses to", dataType=FlyDataType.CostsPrices, entityType="D", printName="Benchmark Price", fieldLength=22)
	benchmarkPrice,
	//
	@FlyElement(columnName="BenchmarkValue", name="Value", description="Benchmark Value", help="Value of the Benchmark Data Point", dataType=FlyDataType.Number, entityType="D", printName="Value", fieldLength=22)
	benchmarkValue,
	//
	@FlyElement(columnName="Beneficiary", name="受益人", description="Business Partner to whom payment is made", help="The Beneficiary indicates the Business Partner to whom payment will be made.  This field is only displayed if the Paid to Third Party checkbox is selected.", dataType=FlyDataType.Table, entityType="D", printName="受益人", fieldLength=22)
	beneficiary,
	//
	@FlyElement(columnName="BestResponseAmt", name="Best Response Amount", description="Best Response Amount", help="Filled by Rank Response Process", dataType=FlyDataType.Amount, entityType="D", printName="Best Response", fieldLength=22)
	bestResponseAmt,
	//
	@FlyElement(columnName="B_Expense_Acct", name="银行费用", description="银行费用帐户", help="The Bank Expense Account identifies the account to be used for recording charges or fees incurred from this Bank.", dataType=FlyDataType.Account, entityType="D", printName="银行费用", fieldLength=22)
	bExpenseAcct,
	//
	@FlyElement(columnName="Bill_BPartner_ID", name="下载交货业务伙伴", description="Business Partner for Drop Shipment", dataType=FlyDataType.Table, entityType="D", printName="下载交货业务伙伴", fieldLength=22)
	billBPartnerID,
	//
	@FlyElement(columnName="Bill_BPTaxID", name="Invoice Tax ID", dataType=FlyDataType.String, entityType="D", printName="Invoice Tax ID", fieldLength=20)
	billBPTaxID,
	//
	@FlyElement(columnName="Bill_BPValue", name="Invoice Partner Key", dataType=FlyDataType.String, entityType="D", printName="Invoice Partner Key", fieldLength=40)
	billBPValue,
	//
	@FlyElement(columnName="Bill_C_Location_ID", name="Invoice Address", dataType=FlyDataType.Location, entityType="D", printName="Invoice Address", fieldLength=22)
	billCLocationID,
	//
	@FlyElement(columnName="Bill_ContactName", name="Invoice Contact Name", dataType=FlyDataType.String, entityType="D", printName="Invoice Contact Name", fieldLength=60)
	billContactName,
	//
	@FlyElement(columnName="Bill_Location_ID", name="发票地址", description="Business Partner Shipment Location for Drop Shipment", dataType=FlyDataType.Table, entityType="D", printName="发票地址", fieldLength=22)
	billLocationID,
	//
	@FlyElement(columnName="Bill_Name", name="Invoice Name", dataType=FlyDataType.String, entityType="D", printName="Invoice Name", fieldLength=60)
	billName,
	//
	@FlyElement(columnName="Bill_Name2", name="Invoice Name2", dataType=FlyDataType.String, entityType="D", printName="Invoice Name2", fieldLength=60)
	billName2,
	//
	@FlyElement(columnName="Bill_Phone", name="Invoice Phone", dataType=FlyDataType.String, entityType="D", printName="Invoice Phone", fieldLength=40)
	billPhone,
	//
	@FlyElement(columnName="Bill_Title", name="Invoice Title", dataType=FlyDataType.String, entityType="D", printName="Invoice Title", fieldLength=40)
	billTitle,
	//
	@FlyElement(columnName="BillTo_ID", name="发票接收地址", description="帐单接收地址", help="The Bill Invoice To indicates the address to use when remitting bills", dataType=FlyDataType.Table, entityType="D", printName="发票接收地址", fieldLength=22)
	billToID,
	//
	@FlyElement(columnName="Bill_User_ID", name="发票联系人", description="Business Partner Contact for Drop Shipment", dataType=FlyDataType.Table, entityType="D", printName="发票联系人", fieldLength=22)
	billUserID,
	//
	@FlyElement(columnName="BinaryData", name="二进制数据", description="二进制数据", help="The Binary field stores binary data.", dataType=FlyDataType.Binary, entityType="D", printName="二进制", fieldLength=4000)
	binaryData,
	//
	@FlyElement(columnName="B_InterestExp_Acct", name="银行利息费用", description="银行利息费用帐户", help="The Bank Interest Expense Account identifies the account to be used for recording interest expenses.", dataType=FlyDataType.Account, entityType="D", printName="银行利息费用", fieldLength=22)
	bInterestExpAcct,
	//
	@FlyElement(columnName="B_InterestRev_Acct", name="银行利息收入", description="银行利息收入帐户", help="The Bank Interest Revenue Account identifies the account to be used for recording interest revenue from this Bank.", dataType=FlyDataType.Account, entityType="D", printName="银行利息收入", fieldLength=22)
	bInterestRevAcct,
	//
	@FlyElement(columnName="B_InTransit_Acct", name="转帐中银行", description="转帐中银行帐户", help="The Bank in Transit Account identifies the account to be used for funds which are in transit.", dataType=FlyDataType.Account, entityType="D", printName="转帐中银行", fieldLength=22)
	bInTransitAcct,
	//
	@FlyElement(columnName="Birthday", name="生日", description="生日或周年日", help="生日或周年日", dataType=FlyDataType.Date, entityType="D", printName="生日", fieldLength=7)
	birthday,
	//
	@FlyElement(columnName="Blue", name="蓝色", description="蓝色的RGB值", dataType=FlyDataType.Integer, entityType="D", printName="蓝色", fieldLength=22)
	blue,
	//
	@FlyElement(columnName="Blue_1", name="第二个蓝色", description="RGB 第二颜色值", dataType=FlyDataType.Integer, entityType="D", printName="第二个蓝色", fieldLength=22)
	blue1,
	//
	@FlyElement(columnName="B_Offer_ID", name="Offer", description="Offer for a Topic", help="You can create an offer for a topic.", dataType=FlyDataType.ID, entityType="D", printName="Offer", fieldLength=22)
	bOfferID,
	//
	@FlyElement(columnName="BOMProductType", name="Component Type", description="BOM Product Type", dataType=FlyDataType.List, entityType="D", printName="Component Type", fieldLength=1)
	bOMProductType,
	//
	@FlyElement(columnName="BOMQty", name="物料清单数量", description="物料清单数量", help="The BOM Quantity indicates the quantity of the product in its Unit of Measure (multiplication)", dataType=FlyDataType.Quantity, entityType="D", printName="数量", fieldLength=22)
	bOMQty,
	//
	@FlyElement(columnName="BOMType", name="物料清单类型", description="BOM 的类型", help="Type of Bill of Materials Part. A Standard Part (default) is always included in a BOM. An Optional Part can be selected in 'Drop BOM'. If a Part is member of one of the alternative groups, you can select one part in that group in the 'Drop BOM' functionaly (example: either 64/256/512 MB Memory).", dataType=FlyDataType.List, entityType="D", printName="物料清单类型", fieldLength=1)
	bOMType,
	//
	@FlyElement(columnName="BOMUse", name="BOM Use", description="The use of the Bill of Material", help="By default the Master BOM is used, if the alternatives are not defined", dataType=FlyDataType.List, entityType="D", printName="BOM Use", fieldLength=1)
	bOMUse,
	//
	@FlyElement(columnName="BPAccessType", name="Access Type", description="Type of Access of the user/contact to Business Partner information and resources", help="If on User level, 'Full BP Access' is NOT selected, give access explicitly", dataType=FlyDataType.List, entityType="D", printName="Access Type", fieldLength=1)
	bPAccessType,
	//
	@FlyElement(columnName="BPartnerColumn", name="B.Partner Column", description="Fully qualified Business Partner key column (C_BPartner_ID)", help="The Business Partner Column indicates the Business Partner to use when calculating this measurement", dataType=FlyDataType.String, entityType="D", printName="业务伙伴列", fieldLength=60)
	bPartnerColumn,
	//
	@FlyElement(columnName="BPartner_Parent_ID", name="伙伴的上级机构", description="业务伙伴的上级", help="The parent (organization) of the Business Partner for reporting purposes.", dataType=FlyDataType.ID, entityType="D", printName="伙伴的上级", fieldLength=22)
	bPartnerParentID,
	//
	@FlyElement(columnName="BPartnerValue", name="业务伙伴关键字", description="业务伙伴的关键字", dataType=FlyDataType.String, entityType="D", printName="业务伙伴关键字", fieldLength=40)
	bPartnerValue,
	//
	@FlyElement(columnName="BPartner_Value", name="业务伙伴关键字", description="The Key of the Business Partner", dataType=FlyDataType.String, entityType="D", printName="业务伙伴关键字", fieldLength=40)
	bPartnerValue,
	//
	@FlyElement(columnName="B_PaymentSelect_Acct", name="付款选择", description="AP Payment Selection Clearing Account", dataType=FlyDataType.Account, entityType="D", printName="付款选择", fieldLength=22)
	bPaymentSelectAcct,
	//
	@FlyElement(columnName="BPBankAcctUse", name="Account Usage", description="Business Partner Bank Account usage", help="Determines how the bank account is used.", dataType=FlyDataType.List, entityType="D", printName="Account Usage", fieldLength=1)
	bPBankAcctUse,
	//
	@FlyElement(columnName="BPContactGreeting", name="业务伙伴联系人问候", description="Greeting for Business Partner Contact", dataType=FlyDataType.String, entityType="D", printName="业务伙伴联系人问候", fieldLength=60)
	bPContactGreeting,
	//
	@FlyElement(columnName="BPGreeting", name="业务伙伴问候", description="问候对业务伙伴", dataType=FlyDataType.String, entityType="D", printName="业务伙伴问候", fieldLength=60)
	bPGreeting,
	//
	@FlyElement(columnName="BP_Location_ID", name="BP Address", description="Address of the Business Partner", dataType=FlyDataType.NONE, entityType="D", printName="BP Address", fieldLength=0)
	bPLocationID,
	//
	@FlyElement(columnName="BPName", name="BP Name", dataType=FlyDataType.String, entityType="D", printName="BP Name", fieldLength=60)
	bPName,
	//
	@FlyElement(columnName="BPName2", name="BP Name2", dataType=FlyDataType.String, entityType="D", printName="BP Name2", fieldLength=60)
	bPName2,
	//
	@FlyElement(columnName="BPTaxID", name="Partner Tax ID", description="Tax ID of the Business Partner", dataType=FlyDataType.String, entityType="D", printName="BP Tax TD", fieldLength=20)
	bPTaxID,
	//
	@FlyElement(columnName="BPValue", name="业务伙伴搜寻关键字", description="业务伙伴关键字值", help="Search Key of Business Partner", dataType=FlyDataType.String, entityType="D", printName="客户号", fieldLength=40)
	bPValue,
	//
	@FlyElement(columnName="BranchID", name="Branch ID", description="Bank Branch ID", help="Dependent on the loader, you may have to provide a bank branch ID", dataType=FlyDataType.String, entityType="D", printName="Branch ID", fieldLength=20)
	branchID,
	//
	@FlyElement(columnName="BreakDiscount", name="休息折扣 %", description="Trade Discount in Percent for the break level", help="Trade Discount in Percent for the break level", dataType=FlyDataType.Number, entityType="D", printName="休息折扣", fieldLength=22)
	breakDiscount,
	//
	@FlyElement(columnName="BreakValue", name="休息价值", description="Low Value of trade discount break level", help="Starting Quantity or Amount Value for break level", dataType=FlyDataType.Number, entityType="D", printName="休息价值", fieldLength=22)
	breakValue,
	//
	@FlyElement(columnName="B_RevaluationGain_Acct", name="银行估价增益", description="银行估价增益帐户", help="The Bank Revaluation Gain Account identifies the account to be used for recording gains that are recognized when converting currencies.", dataType=FlyDataType.Account, entityType="D", printName="银行估价增益", fieldLength=22)
	bRevaluationGainAcct,
	//
	@FlyElement(columnName="B_RevaluationLoss_Acct", name="银行估价损失", description="银行估价损失帐户", help="The Bank Revaluation Loss Account identifies the account to be used for recording losses that are recognized when converting currencies.", dataType=FlyDataType.Account, entityType="D", printName="银行估价损失", fieldLength=22)
	bRevaluationLossAcct,
	//
	@FlyElement(columnName="B_SellerFunds_ID", name="Seller Funds", description="Seller Funds from Offers on Topics", help="Available Funds (for Payments) and Committed or Uncommited funds from Offers", dataType=FlyDataType.ID, entityType="D", printName="Seller Funds", fieldLength=22)
	bSellerFundsID,
	//
	@FlyElement(columnName="B_SettlementGain_Acct", name="银行结算增益", description="银行结算增益帐户", help="The Bank Settlement Gain account identifies the account to be used when recording a currency gain when the settlement and receipt currency are not the same.", dataType=FlyDataType.Account, entityType="D", printName="银行结算增益", fieldLength=22)
	bSettlementGainAcct,
	//
	@FlyElement(columnName="B_SettlementLoss_Acct", name="银行结算损失", description="银行结算损失帐户", help="The Bank Settlement loss account identifies the account to be used when recording a currency loss when the settlement and receipt currency are not the same.", dataType=FlyDataType.Account, entityType="D", printName="银行结算损失", fieldLength=22)
	bSettlementLossAcct,
	//
	@FlyElement(columnName="B_TopicCategory_ID", name="Topic Category", description="Auction Topic Category", help="For an Auction Topic Type, define the different Categories used.", dataType=FlyDataType.TableDirect, entityType="D", printName="Topic Category", fieldLength=22)
	bTopicCategoryID,
	//
	@FlyElement(columnName="B_Topic_ID", name="Topic", description="Auction Topic", help="Description of the item to sell or create.", dataType=FlyDataType.ID, entityType="D", printName="Topic", fieldLength=22)
	bTopicID,
	//
	@FlyElement(columnName="B_TopicType_ID", name="Topic Type", description="Auction Topic Type", help="The Auction Topic Type determines what kind of auction is used for a particular area", dataType=FlyDataType.TableDirect, entityType="D", printName="Topic Type", fieldLength=22)
	bTopicTypeID,
	//
	@FlyElement(columnName="BudgetCode", name="Budget Code ", dataType=FlyDataType.NONE, entityType="D", printName="Budget Code", fieldLength=0)
	budgetCode,
	//
	@FlyElement(columnName="BudgetControlScope", name="Control Scope", description="Scope of the Budget Control", dataType=FlyDataType.List, entityType="D", printName="Control Scope", fieldLength=1)
	budgetControlScope,
	//
	@FlyElement(columnName="BudgetStatus", name="预算状态", description="指示该预算的状态", help="The Budget Status indicates the current status of this budget (i.e Draft, Approved)", dataType=FlyDataType.List, entityType="D", printName="预算状态", fieldLength=1)
	budgetStatus,
	//
	@FlyElement(columnName="B_UnallocatedCash_Acct", name="未分派现金", description="Unallocated Cash Clearing Account", help="Receipts not allocated to Invoices", dataType=FlyDataType.Account, entityType="D", printName="未分派现金", fieldLength=22)
	bUnallocatedCashAcct,
	//
	@FlyElement(columnName="B_Unidentified_Acct", name="银行未经确认的收据", description="Bank Unidentified Receipts Account", help="The Bank Unidentified Receipts Account identifies the account to be used when recording receipts that can not be reconciled at the present time.", dataType=FlyDataType.Account, entityType="D", printName="未经确认的银行", fieldLength=22)
	bUnidentifiedAcct,
	//
	@FlyElement(columnName="C_AcctProcessor_ID", name="Accounting Processor", description="Accounting Processor/Server Parameters", help="Accounting Processor/Server Parameters", dataType=FlyDataType.TableDirect, entityType="D", printName="Accounting Processor", fieldLength=22)
	cAcctProcessorID,
	//
	@FlyElement(columnName="C_AcctProcessorLog_ID", name="Accounting Processor Log", description="Result of the execution of the Accounting Processor", help="Result of the execution of the Accounting Processor", dataType=FlyDataType.ID, entityType="D", printName="Acct Processor Log", fieldLength=22)
	cAcctProcessorLogID,
	//
	@FlyElement(columnName="C_AcctSchema1_ID", name="主会计模式", description="主帐户规则", help="An Accounting  Schema defines the rules used accounting such as costing method, currency and calendar.", dataType=FlyDataType.Table, entityType="D", printName="主会计模式", fieldLength=22)
	cAcctSchema1ID,
	//
	@FlyElement(columnName="C_AcctSchema_Element_ID", name="Acct.Schema Element", dataType=FlyDataType.ID, entityType="D", printName="Acct.Schema Element", fieldLength=22)
	cAcctSchemaElementID,
	//
	@FlyElement(columnName="C_AcctSchema_ID", name="会计模式", description="帐户的规则", help="An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar", dataType=FlyDataType.TableDirect, entityType="D", printName="会计模式", fieldLength=22)
	cAcctSchemaID,
	//
	@FlyElement(columnName="C_Activity_ID", name="活动", description="业务活动", help="Activities indicate tasks that are performed and used to utilize Activity based Costing", dataType=FlyDataType.Table, entityType="D", printName="活动", fieldLength=22)
	cActivityID,
	//
	@FlyElement(columnName="CalculationClass", name="计算类", description="Java Class for calculation, implementing Interface Measure", help="The Calculation Class indicates the Java Class used for calculating measures.", dataType=FlyDataType.String, entityType="D", printName="计算类", fieldLength=60)
	calculationClass,
	//
	@FlyElement(columnName="CalculationType", name="计算", dataType=FlyDataType.List, entityType="D", printName="计算", fieldLength=1)
	calculationType,
	//
	@FlyElement(columnName="CalendarYear", name="年", description="日历年", help="The Year identifies the accounting year for a calendar.", dataType=FlyDataType.String, entityType="D", printName="年", fieldLength=4)
	calendarYear,
	//
	@FlyElement(columnName="C_AllocationHdr_ID", name="配置", description="付款配置", dataType=FlyDataType.TableDirect, entityType="D", printName="配置", fieldLength=22)
	cAllocationHdrID,
	//
	@FlyElement(columnName="C_AllocationLine_ID", name="Allocation Line", description="Allocation Line", help="Allocation of Cash/Payment to Invoice", dataType=FlyDataType.ID, entityType="D", printName="Allocation Line", fieldLength=22)
	cAllocationLineID,
	//
	@FlyElement(columnName="Callout", name="Callout", description="Function Calls separated by semicolons; SE_ SL_ UE_ UL_ - 1st: System User; 2nd: Enter Leave; 3rd: _ Underscore, - then Function Name", help="A Callout allow you to create Java extensions to perform certain tasks always after a value changed. Callouts should not be used for validation but consquences of a user selecting a certain value.	The callout is a Java class implementing org.compiere.model.Callout and a method name to call.  Example: 'org.compiere.model.CalloutRequest.copyText' instanciates the class 'CalloutRequest' and calls the method 'copyText'. You can have multiple callouts by separating them via a semicolon", dataType=FlyDataType.String, entityType="D", printName="Callout", fieldLength=255)
	callout,
	//
	@FlyElement(columnName="CaptureSequence", name="Capture Sequence", help="The Capture Sequence defines the fields to be used when capturing an address on this country.  The following notations are used: @CO@=Country, @C@=City, @P@=Postal, @A@=PostalAdd, @R@=Region, @A1@=Address 1 to @A4@=Address 4.  Country is always mandatory, add a bang ! to make another field mandatory, for example @C!@ makes city mandatory, @A1!@ makes Address 1 mandatory.", dataType=FlyDataType.String, entityType="D", printName="Capture Sequence", fieldLength=60)
	captureSequence,
	//
	@FlyElement(columnName="Card_BankAccount_ID", name="Card Bank Account", description="Bank Account on which card transactions will be processed", dataType=FlyDataType.Table, entityType="D", printName="Card Bank Account", fieldLength=22)
	cardBankAccountID,
	//
	@FlyElement(columnName="CardTransferBankAccount_ID", name="Transfer Card trx to", description="Bank account on which to transfer Card transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Card trx to", fieldLength=22)
	cardTransferBankAccountID,
	//
	@FlyElement(columnName="CardTransferCashBook_ID", name="Transfer Card trx to", description="Cash Book on which to transfer all Card transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Card trx to", fieldLength=22)
	cardTransferCashBookID,
	//
	@FlyElement(columnName="CardTransferType", name="Card Transfer Type", dataType=FlyDataType.List, entityType="D", printName="Card Transfer Type", fieldLength=1)
	cardTransferType,
	//
	@FlyElement(columnName="CashBookTransferType", name="Cash Book Transfer Type", description="Where the money in the cash book should be transfered to. Either a Bank Account or another Cash Book", dataType=FlyDataType.List, entityType="D", printName="Cash Book Transfer Type", fieldLength=1)
	cashBookTransferType,
	//
	@FlyElement(columnName="CashDrawer", name="CashDrawer", dataType=FlyDataType.String, entityType="D", printName="Cash Drawer", fieldLength=120)
	cashDrawer,
	//
	@FlyElement(columnName="CashTransferBankAccount_ID", name="Transfer Cash trx to", description="Bank Account on which to transfer all Cash transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Cash trx to", fieldLength=22)
	cashTransferBankAccountID,
	//
	@FlyElement(columnName="CashTransferCashBook_ID", name="Transfer Cash trx to", description="Cash Book on which to transfer all Cash transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Cash trx to", fieldLength=22)
	cashTransferCashBookID,
	//
	@FlyElement(columnName="CashType", name="现金类型", description="现金来源", help="The Cash Type indicates the source for this Cash Journal Line.", dataType=FlyDataType.List, entityType="D", printName="现金类型", fieldLength=1)
	cashType,
	//
	@FlyElement(columnName="Category", name="Category", dataType=FlyDataType.String, entityType="D", printName="Category", fieldLength=120)
	category,
	//
	@FlyElement(columnName="CategoryColumn", name="Category Column", description="Fully qualified data category column", help="The Category Column determines how the chart data is grouped", dataType=FlyDataType.String, entityType="D", printName="Category Column", fieldLength=60)
	categoryColumn,
	//
	@FlyElement(columnName="CategoryName", name="分类名", description="分类名", dataType=FlyDataType.String, entityType="D", printName="分类名", fieldLength=60)
	categoryName,
	//
	@FlyElement(columnName="CategoryType", name="种类类型", description="Source of the Journal with this category", help="The Category Type indicates the source of the journal for this category.  Journals can be generated from a document, entered manually or imported.", dataType=FlyDataType.List, entityType="D", printName="种类类型", fieldLength=1)
	categoryType,
	//
	@FlyElement(columnName="C_BankAccountDoc_ID", name="银行帐户文件", description="Checks, Transfers, etc.", help="Bank documents, you generate or track", dataType=FlyDataType.ID, entityType="D", printName="银行帐户文件", fieldLength=22)
	cBankAccountDocID,
	//
	@FlyElement(columnName="C_BankAccount_ID", name="银行帐户", description="在银行的帐户", help="The Bank Account identifies an account at this Bank.", dataType=FlyDataType.ID, entityType="D", printName="银行帐户", fieldLength=22)
	cBankAccountID,
	//
	@FlyElement(columnName="C_Bank_ID", name="银行", description="银行", help="The Bank is a unique identifier of a Bank for this Organization or for a Business Partner with whom this Organization transacts.", dataType=FlyDataType.ID, entityType="D", printName="银行", fieldLength=22)
	cBankID,
	//
	@FlyElement(columnName="C_BankStatement_ID", name="银行对帐单", description="银行对帐单", help="The Bank Statement identifies a unique Bank Statement for a defined time period.  The statement defines all transactions that occurred", dataType=FlyDataType.ID, entityType="D", printName="银行对帐单", fieldLength=22)
	cBankStatementID,
	//
	@FlyElement(columnName="C_BankStatementLine_ID", name="银行对帐单明细", description="Line on a statement from this Bank", help="The Bank Statement Line identifies a unique transaction (Payment, Withdrawal, Charge) for the defined time period at this Bank.", dataType=FlyDataType.ID, entityType="D", printName="银行对帐单明细", fieldLength=22)
	cBankStatementLineID,
	//
	@FlyElement(columnName="C_BankStatementLoader_ID", name="Bank Statement Loader", description="Definition of Bank Statement Loader (SWIFT, OFX)", help="The loader definition privides the parameters to load bank statements from EFT formats like SWIFT (MT940) or OFX", dataType=FlyDataType.ID, entityType="D", printName="Bank Statement Loader", fieldLength=22)
	cBankStatementLoaderID,
	//
	@FlyElement(columnName="C_BankStatementMatcher_ID", name="Bank Statement Matcher", description="Algorithm to match Bank Statement Info to Business Partners, Invoices and Payments", help="An algorithm to find Business Partners, Invoices, Payments in imported Bank Statements", dataType=FlyDataType.ID, entityType="D", printName="Bank Statement Matcher", fieldLength=22)
	cBankStatementMatcherID,
	//
	@FlyElement(columnName="CB_Asset_Acct", name="现金帐簿资产", description="现金帐簿资产帐户", help="The Cash Book Asset Account identifies the account to be used for recording payments into and disbursements from this cash book.", dataType=FlyDataType.Account, entityType="D", printName="现金帐簿资产", fieldLength=22)
	cBAssetAcct,
	//
	@FlyElement(columnName="CB_CashTransfer_Acct", name="现金转帐", description="Cash Transfer Clearing Account", help="Account for Invoices paid by cash", dataType=FlyDataType.Account, entityType="D", printName="现金转帐", fieldLength=22)
	cBCashTransferAcct,
	//
	@FlyElement(columnName="CB_Differences_Acct", name="现金帐簿差额", description="现金帐簿差额帐户", help="The Cash Book Differences Account identifies the account to be used for recording any differences that affect this cash book", dataType=FlyDataType.Account, entityType="D", printName="现金帐簿差额", fieldLength=22)
	cBDifferencesAcct,
	//
	@FlyElement(columnName="CB_Expense_Acct", name="现金帐簿费用", description="现金帐簿费用帐户", help="The Cash Book Expense Account identifies the account to be used for general, non itemized expenses.", dataType=FlyDataType.Account, entityType="D", printName="现金帐簿费用", fieldLength=22)
	cBExpenseAcct,
	//
	@FlyElement(columnName="C_BPartnerCashTrx_ID", name="业务伙伴模板", description="Business Partner used for creating new Business Partners on the fly", help="When creating a new Business Partner from the Business Partner Search Field (right-click: Create), the selected business partner is used as a template, e.g. to define price list, payment terms, etc.", dataType=FlyDataType.Search, entityType="D", printName="业务伙伴模板", fieldLength=22)
	cBPartnerCashTrxID,
	//
	@FlyElement(columnName="C_BPartner_ID", name="业务伙伴 ", description="标识业务伙伴", help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson", dataType=FlyDataType.Search, entityType="D", printName="业务伙伴 ", fieldLength=22)
	cBPartnerID,
	//
	@FlyElement(columnName="C_BPartner_Location_ID", name="业务伙伴地址", description="Identifies the (ship to) address for this Business Partner", help="The Partner address indicates the location of a Business Partner", dataType=FlyDataType.TableDirect, entityType="D", printName="业务伙伴地址", fieldLength=22)
	cBPartnerLocationID,
	//
	@FlyElement(columnName="C_BPartnerRelation_ID", name="Related Partner", description="Related Business Partner", help="The related Business Partner Acts on behalf of the Business Partner - example the Related Partner pays invoices of the Business Partner - or we pay to the Related Partner for invoices received from the Business Partner", dataType=FlyDataType.Search, entityType="D", printName="Related Partner", fieldLength=22)
	cBPartnerRelationID,
	//
	@FlyElement(columnName="C_BPartnerRelation_Location_ID", name="Related Partner Location", description="Location of the related Business Partner", dataType=FlyDataType.Table, entityType="D", printName="Related Partner Location", fieldLength=22)
	cBPartnerRelationLocationID,
	//
	@FlyElement(columnName="C_BPartnerSR_ID", name="BPartner (Agent)", description="Business Partner (Agent or Sales Rep)", dataType=FlyDataType.Table, entityType="D", printName="BPartner (Agent)", fieldLength=10)
	cBPartnerSRID,
	//
	@FlyElement(columnName="C_BP_BankAccount_ID", name="业务伙伴银行帐户", description="Bank Account of the Business Partner", help="The Partner Bank Account identifies the bank account to be used for this Business Partner", dataType=FlyDataType.ID, entityType="D", printName="业务伙伴银行帐户", fieldLength=22)
	cBPBankAccountID,
	//
	@FlyElement(columnName="C_BP_EDI_ID", name="EDI 定义", description="电子的数据交换", dataType=FlyDataType.ID, entityType="D", printName="EDI 定义", fieldLength=22)
	cBPEDIID,
	//
	@FlyElement(columnName="C_BP_Group_ID", name="业务伙伴组", description="业务伙伴组ID", help="The Business Partner Group ID provides a method of defining defaults to be used for individual Business Partners.", dataType=FlyDataType.TableDirect, entityType="D", printName="业务伙伴组", fieldLength=22)
	cBPGroupID,
	//
	@FlyElement(columnName="C_BP_Relation_ID", name="Partner Relation", description="Business Partner Relation", help="Business Partner Relation allow to maintain Third Party Relationship rules: who receives invoices for shipments or pays for invoices.", dataType=FlyDataType.ID, entityType="D", printName="Partner Relation", fieldLength=22)
	cBPRelationID,
	//
	@FlyElement(columnName="CB_Receipt_Acct", name="现金帐簿收据", description="现金帐簿收据帐户", help="The Cash Book Receipt Account identifies the account to be used for general, non itemized cash book receipts.", dataType=FlyDataType.Account, entityType="D", printName="现金帐簿收据", fieldLength=22)
	cBReceiptAcct,
	//
	@FlyElement(columnName="C_Calendar_ID", name="日历", description="会计日历名字", help="The Calendar uniquely identifies an accounting calendar.  Multiple calendars can be used.  For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30.", dataType=FlyDataType.ID, entityType="D", printName="日历", fieldLength=22)
	cCalendarID,
	//
	@FlyElement(columnName="C_Campaign_ID", name="战役", description="营销活动", help="The Campaign defines a unique marketing program.  Projects can be associated with a pre defined Marketing Campaign.  You can then report based on a specific Campaign.", dataType=FlyDataType.Table, entityType="D", printName="战役", fieldLength=22)
	cCampaignID,
	//
	@FlyElement(columnName="C_CashBook_ID", name="现金帐簿", description="Cash Book for recording petty cash transactions", help="The Cash Book identifies a unique cash book.  The cash book is used to record cash transactions.", dataType=FlyDataType.TableDirect, entityType="D", printName="现金帐簿", fieldLength=22)
	cCashBookID,
	//
	@FlyElement(columnName="C_CashBPartner_ID", name="Cash BPartner", description="BPartner to be used for Cash transactions", dataType=FlyDataType.Table, entityType="D", printName="Cash BPartner", fieldLength=22)
	cCashBPartnerID,
	//
	@FlyElement(columnName="C_Cash_ID", name="现金簿", description="现金簿", help="The Cash Journal uniquely identifies a Cash Journal.  The Cash Journal will record transactions for the cash bank account", dataType=FlyDataType.ID, entityType="D", printName="现金簿", fieldLength=22)
	cCashID,
	//
	@FlyElement(columnName="C_CashLine_ID", name="现金簿明细", description="现金簿明细", help="The Cash Journal Line indicates a unique line in a cash journal.", dataType=FlyDataType.Search, entityType="D", printName="现金明细", fieldLength=22)
	cCashLineID,
	//
	@FlyElement(columnName="C_Channel_ID", name="渠道", description="销售频道", help="The Sales Channel identifies a channel (or method) of sales generation.", dataType=FlyDataType.TableDirect, entityType="D", printName="渠道", fieldLength=22)
	cChannelID,
	//
	@FlyElement(columnName="C_Charge_ID", name="费用", description="附加的文件收费", help="The Charge indicates a type of Charge (Handling, Shipping, Restocking)", dataType=FlyDataType.Table, entityType="D", printName="费用", fieldLength=22)
	cChargeID,
	//
	@FlyElement(columnName="C_ChargeType_ID", name="Charge Type", dataType=FlyDataType.ID, entityType="D", printName="Charge Type", fieldLength=22)
	cChargeTypeID,
	//
	@FlyElement(columnName="C_City_ID", name="城市", description="城市", help="在一个国家中的城市", dataType=FlyDataType.Search, entityType="D", printName="城市", fieldLength=22)
	cCityID,
	//
	@FlyElement(columnName="C_City_Value", name="City Value", dataType=FlyDataType.NONE, entityType="D", printName="City Value", fieldLength=0)
	cCityValue,
	//
	@FlyElement(columnName="C_CommissionAmt_ID", name="佣金金额", description="已产生佣金金额 ", help="The Commission Amount indicates the resulting amount from a Commission Run.", dataType=FlyDataType.ID, entityType="D", printName="委任 Amt", fieldLength=22)
	cCommissionAmtID,
	//
	@FlyElement(columnName="C_CommissionDetail_ID", name="佣金明细", description="Supporting information for Commission Amounts", help="The Commission Detail provides supporting information on a Commission Run.  Each document line that was part of the Commission Run will be reflected here.", dataType=FlyDataType.ID, entityType="D", printName="佣金明细", fieldLength=22)
	cCommissionDetailID,
	//
	@FlyElement(columnName="C_CommissionGroup_ID", name="Commission Group", dataType=FlyDataType.TableDirect, entityType="D", printName="Commission Group", fieldLength=22)
	cCommissionGroupID,
	//
	@FlyElement(columnName="C_Commission_ID", name="佣金", description="佣金", help="The Commission ID is a unique identifier of a set of commission rules.", dataType=FlyDataType.ID, entityType="D", printName="佣金", fieldLength=22)
	cCommissionID,
	//
	@FlyElement(columnName="C_CommissionLine_ID", name="佣金明细", description="佣金明细", help="The Commission Line is a unique instance of a Commission Run.  If the commission run was done in summary mode then there will be a single line representing the selected documents totals.  If the commission run was done in detail mode then each document that was included in the run will have its own commission line.", dataType=FlyDataType.TableDirect, entityType="D", printName="佣金明细", fieldLength=22)
	cCommissionLineID,
	//
	@FlyElement(columnName="C_CommissionRun_ID", name="佣金运行", description="佣金运行或处理", help="The Commission Run is a unique system defined identifier of a specific run of commission.  When a Commission is processed on the Commission Screen, the Commission Run ID will display.", dataType=FlyDataType.TableDirect, entityType="D", printName="佣金运行", fieldLength=22)
	cCommissionRunID,
	//
	@FlyElement(columnName="C_CommissionSalesRep_ID", name="Commission Sales Rep ID", dataType=FlyDataType.NONE, entityType="D", printName="Commission Sales Rep ID", fieldLength=0)
	cCommissionSalesRepID,
	//
	@FlyElement(columnName="C_ContactActivity_ID", name="Contact Activity", description="Events, tasks, communications related to a contact", dataType=FlyDataType.NONE, entityType="D", printName="Contact Activity", fieldLength=0)
	cContactActivityID,
	//
	@FlyElement(columnName="C_Conversion_Rate_ID", name="汇率", description="Rate used for converting currencies", help="The Conversion Rate defines the rate (multiply or divide) to use when converting a source currency to an accounting currency.", dataType=FlyDataType.ID, entityType="D", printName="汇率", fieldLength=22)
	cConversionRateID,
	//
	@FlyElement(columnName="C_ConversionType_ID", name="Currency Type", description="Currency Conversion Rate Type", help="The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.", dataType=FlyDataType.TableDirect, entityType="D", printName="Currency Type", fieldLength=22)
	cConversionTypeID,
	//
	@FlyElement(columnName="C_ConversionTypeReval_ID", name="Revaluation Conversion Type", description="Revaluation Currency Conversion Type", dataType=FlyDataType.Table, entityType="D", printName="Reval Conversion Type", fieldLength=22)
	cConversionTypeRevalID,
	//
	@FlyElement(columnName="C_Country_ID", name="国家 ", description="国家 ", help="The Country defines a Country.  Each Country must be defined before it can be used in any document.", dataType=FlyDataType.TableDirect, entityType="D", printName="国家 ", fieldLength=22)
	cCountryID,
	//
	@FlyElement(columnName="C_Currency_ID", name="货币", description="币种为该笔记录", help="Indicates the Currency to be used when processing or reporting on this record", dataType=FlyDataType.ID, entityType="D", printName="货币", fieldLength=22)
	cCurrencyID,
	//
	@FlyElement(columnName="C_Currency_ID_To", name="目标币种", description="目标币种", help="The Currency To defines the target currency for this conversion rate.", dataType=FlyDataType.Table, entityType="D", printName="目标币种", fieldLength=22)
	cCurrencyIDTo,
	//
	@FlyElement(columnName="C_Cycle_ID", name="项目周期", description="Identifier for this Project Cycle", help="Identifies a Project Cycle which can be made up of one or more steps or statuses", dataType=FlyDataType.ID, entityType="D", printName="项目周期", fieldLength=22)
	cCycleID,
	//
	@FlyElement(columnName="C_CycleStep_ID", name="周期步骤", description="步骤为该周期", help="Identifies one or more steps within a Project Cycle. A cycle Step has multiple Phases", dataType=FlyDataType.TableDirect, entityType="D", printName="周期步骤", fieldLength=22)
	cCycleStepID,
	//
	@FlyElement(columnName="C_DocType_ConfirmedOrder", name="Confirmed Mfg Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Confirmed Mfg Order Doc Type", fieldLength=0)
	cDocTypeConfirmedOrder,
	//
	@FlyElement(columnName="C_DocTypeCounter_ID", name="Counter Document", description="Counter Document Relationship", help="When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction.  Example: a 'Standard Order' creates a 'Standard PO'. 	If you define a relationship here, you overwrite the default counter document type in the Document Type definition. This allows you to define a specific mapping.", dataType=FlyDataType.ID, entityType="D", printName="Counter Document", fieldLength=22)
	cDocTypeCounterID,
	//
	@FlyElement(columnName="C_DocTypeDifference_ID", name="Difference Document", description="Document type for generating in dispute Shipments", help="If the confirmation contains differences, the original document is split allowing the original document (shipment) to be processed and updating Inventory - and the newly created document for handling the dispute at a later time. Until the confirmation is processed, the inventory is not updated. ", dataType=FlyDataType.Table, entityType="D", printName="Difference Doc", fieldLength=22)
	cDocTypeDifferenceID,
	//
	@FlyElement(columnName="C_DocType_ID", name="文件类型", description="文件类型或规则", help="The Document Type determines document sequence and processing rules", dataType=FlyDataType.ID, entityType="D", printName="文件类型", fieldLength=22)
	cDocTypeID,
	//
	@FlyElement(columnName="C_DocTypeInvoice_ID", name="文件类型为发票", description="Document type used for invoices generated from this sales document", help="The Document Type for Invoice indicates the document type that will be used when an invoice is generated from this sales document.  This field will display only when the base document type is Sales Order.", dataType=FlyDataType.Table, entityType="D", printName="文件类型发票", fieldLength=22)
	cDocTypeInvoiceID,
	//
	@FlyElement(columnName="C_DocType_PlannedOrder", name="Planned Mfg Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Planned Mfg Order Doc Type", fieldLength=0)
	cDocTypePlannedOrder,
	//
	@FlyElement(columnName="C_DocType_PO", name="Purchase Order Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Purchase Order Doc Type", fieldLength=10)
	cDocTypePO,
	//
	@FlyElement(columnName="C_DocTypeProforma_ID", name="文件类型为 ProForma", description="Document type used for pro forma invoices generated from this sales document", help="he Document Type for Invoice indicates the document type that will be used when an invoice is generated from this sales document.  This field will display only when the base document type is Sales Order and the Pro Forma Invoice checkbox is selected", dataType=FlyDataType.Table, entityType="D", printName="文件类型 ProForma", fieldLength=22)
	cDocTypeProformaID,
	//
	@FlyElement(columnName="C_DocType_Requisition", name="Replenish Plan Requisition Doc Type", dataType=FlyDataType.Table, entityType="D", printName="Replenish Plan Requisition Doc Type", fieldLength=0)
	cDocTypeRequisition,
	//
	@FlyElement(columnName="C_DocTypeReval_ID", name="Revaluation Document Type", description="Document Type for Revaluation Journal", dataType=FlyDataType.Table, entityType="D", printName="Doc Type Reval", fieldLength=10)
	cDocTypeRevalID,
	//
	@FlyElement(columnName="C_DocTypeShipment_ID", name="物料出货文件类型", description="Document type used for shipments generated from this sales document", help="he Document Type for Shipments indicates the document type that will be used when a shipment is generated from this sales document.  This field will display only when the base document type is Sales Order.", dataType=FlyDataType.Table, entityType="D", printName="物料出货文件类型", fieldLength=22)
	cDocTypeShipmentID,
	//
	@FlyElement(columnName="C_DocTypeTarget_ID", name="目标文件类型", description="Target document type for conversing documents", help="You can convert document types (e.g. from Offer to Order or Invoice).  The conversion is then reflected in the current type.  This processing is initiated by selecting the appropriate Document Action.", dataType=FlyDataType.Table, entityType="D", printName="目标文件类型", fieldLength=22)
	cDocTypeTargetID,
	//
	@FlyElement(columnName="C_Dunning_ID", name="催讨", description="Dunning Rules for overdue invoices", help="The Dunning indicates the rules and method of dunning for past due payments.", dataType=FlyDataType.TableDirect, entityType="D", printName="催讨", fieldLength=22)
	cDunningID,
	//
	@FlyElement(columnName="C_DunningLevel_ID", name="催讨水平", dataType=FlyDataType.ID, entityType="D", printName="催讨水平", fieldLength=22)
	cDunningLevelID,
	//
	@FlyElement(columnName="C_DunningRunEntry_ID", name="催讨运行条目", description="催讨运行条目", dataType=FlyDataType.ID, entityType="D", printName="催讨运行条目", fieldLength=22)
	cDunningRunEntryID,
	//
	@FlyElement(columnName="C_DunningRun_ID", name="催讨运行", description="催讨运行", dataType=FlyDataType.ID, entityType="D", printName="催讨运行", fieldLength=22)
	cDunningRunID,
	//
	@FlyElement(columnName="C_DunningRunLine_ID", name="催讨运行明细", description="催讨运行明细", dataType=FlyDataType.ID, entityType="D", printName="催讨运行明细", fieldLength=22)
	cDunningRunLineID,
	//
	@FlyElement(columnName="C_Element_ID", name="会计科目", description="会计科目", help="The Account Element uniquely identifies an Account Type.  These are commonly known as a Chart of Accounts.", dataType=FlyDataType.ID, entityType="D", printName="会计科目", fieldLength=22)
	cElementID,
	//
	@FlyElement(columnName="C_ElementValue_ID", name="会计科目", description="会计科目", help="Account Elements can be natural accounts or user defined values.", dataType=FlyDataType.ID, entityType="D", printName="会计科目", fieldLength=22)
	cElementValueID,
	//
	@FlyElement(columnName="C_Greeting_ID", name="称谓", description="Greeting to print on correspondence", help="The Greeting identifies the greeting to print on correspondence.", dataType=FlyDataType.ID, entityType="D", printName="称谓", fieldLength=22)
	cGreetingID,
	//
	@FlyElement(columnName="ChangeAmt", name="ChangeAmt", dataType=FlyDataType.Amount, entityType="D", printName="ChangeAmt", fieldLength=22)
	changeAmt,
	//
	@FlyElement(columnName="ChangeDate", name="ChangeDate", dataType=FlyDataType.DateTime, entityType="D", printName="ChangeDate", fieldLength=7)
	changeDate,
	//
	@FlyElement(columnName="ChangeSetting", name="Change the current Setting", description="Confirm that you want to change the current setting", dataType=FlyDataType.NONE, entityType="D", printName="Change Setting", fieldLength=0)
	changeSetting,
	//
	@FlyElement(columnName="ChangeType", name="ChangeType", dataType=FlyDataType.List, entityType="D", printName="ChangeType", fieldLength=3)
	changeType,
	//
	@FlyElement(columnName="CharacterData", name="Character Data", description="Long Character Field", dataType=FlyDataType.LongText, entityType="D", printName="Character Data", fieldLength=4000)
	characterData,
	//
	@FlyElement(columnName="ChargeableQty", name="收费数量", dataType=FlyDataType.Integer, entityType="D", printName="收费数量", fieldLength=22)
	chargeableQty,
	//
	@FlyElement(columnName="ChargeAmt", name="费用金额", description="费用金额", help="The Charge Amount indicates the amount for an additional charge.", dataType=FlyDataType.Amount, entityType="D", printName="费用金额", fieldLength=22)
	chargeAmt,
	//
	@FlyElement(columnName="ChargeFee", name="收费费用", description="Indicates if fees will be charged for overdue invoices", help="The Charge Fee checkbox indicates if the dunning letter will include fees for overdue invoices", dataType=FlyDataType.YesNo, entityType="D", printName="收费费用", fieldLength=1)
	chargeFee,
	//
	@FlyElement(columnName="ChargeInterest", name="费用利润", description="Indicates if interest will be charged on overdue invoices", help="The Charge Interest checkbox indicates if interest will be charged on overdue invoice amounts.", dataType=FlyDataType.YesNo, entityType="D", printName="费用利润", fieldLength=1)
	chargeInterest,
	//
	@FlyElement(columnName="ChargeName", name="费用名", description="费用名", dataType=FlyDataType.String, entityType="D", printName="费用名", fieldLength=60)
	chargeName,
	//
	@FlyElement(columnName="ChartOrientation", name="Orientation", description="The orientation of the chart.", dataType=FlyDataType.List, entityType="D", printName="Orientation", fieldLength=1)
	chartOrientation,
	//
	@FlyElement(columnName="ChartType", name="Chart Type", description="Type fo chart to render", dataType=FlyDataType.List, entityType="D", printName="Chart Type", fieldLength=2)
	chartType,
	//
	@FlyElement(columnName="ChatEntryType", name="Chat Entry Type", description="Type of Chat/Forum Entry", dataType=FlyDataType.List, entityType="D", printName="Chat Entry Type", fieldLength=1)
	chatEntryType,
	//
	@FlyElement(columnName="Check_BankAccount_ID", name="Check Bank Account", description="Bank Account to be used for processing Check transactions", dataType=FlyDataType.Table, entityType="D", printName="Check Bank Account", fieldLength=22)
	checkBankAccountID,
	//
	@FlyElement(columnName="CheckComplete", name="Check Complete", dataType=FlyDataType.Button, entityType="D", printName="Check Complete", fieldLength=1)
	checkComplete,
	//
	@FlyElement(columnName="Checked", name="Last Checked", description="Info when we did the last check", help="Info on the last check date", dataType=FlyDataType.DateTime, entityType="D", printName="Last Checked", fieldLength=7)
	checked,
	//
	@FlyElement(columnName="CheckNewValue", name="Validate current (new) Value", description="Ensure that the new value of the change is the current value in the system (i.e. no change since then)", dataType=FlyDataType.NONE, entityType="D", printName="Validate current (new) Value", fieldLength=0)
	checkNewValue,
	//
	@FlyElement(columnName="CheckNo", name="支票未", description="检查号", help="The Check Number indicates the number on the check.", dataType=FlyDataType.String, entityType="D", printName="检查号", fieldLength=20)
	checkNo,
	//
	@FlyElement(columnName="CheckOldValue", name="Validate current (old) Value", description="Ensure that the old value of the change is the current value in the system (i.e. original situation)", dataType=FlyDataType.NONE, entityType="D", printName="Validate current (old) Value", fieldLength=0)
	checkOldValue,
	//
	@FlyElement(columnName="Check_PrintFormat_ID", name="检查打印格式", description="Print Format for printing Checks", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="检查打印格式", fieldLength=22)
	checkPrintFormatID,
	//
	@FlyElement(columnName="CheckTransferBankAccount_ID", name="Tranfer Check trx to", description="Bank account on which to transfer Check transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Check trx to", fieldLength=22)
	checkTransferBankAccountID,
	//
	@FlyElement(columnName="CheckTransferCashBook_ID", name="Transfer Check trx to", description="Cash Book on which to transfer all Check transactions", dataType=FlyDataType.Table, entityType="D", printName="Transfer Check trx to", fieldLength=22)
	checkTransferCashBookID,
	//
	@FlyElement(columnName="CheckTransferType", name="Check Transfer Type", dataType=FlyDataType.List, entityType="D", printName="Check Transfer Type", fieldLength=1)
	checkTransferType,
	//
	@FlyElement(columnName="ChequeNo", name="Cheque No", dataType=FlyDataType.String, entityType="D", printName="Cheque No", fieldLength=120)
	chequeNo,
	//
	@FlyElement(columnName="Ch_Expense_Acct", name="收费费用", description="收费费用帐户", help="The Charge Expense Account identifies the account to use when recording charges paid to vendors.", dataType=FlyDataType.Account, entityType="D", printName="收费费用", fieldLength=22)
	chExpenseAcct,
	//
	@FlyElement(columnName="Ch_Revenue_Acct", name="收费收入", description="收费收入帐户", help="The Charge Revenue Account identifies the account to use when recording charges paid by customers.", dataType=FlyDataType.Account, entityType="D", printName="收费收入", fieldLength=22)
	chRevenueAcct,
	//
	@FlyElement(columnName="C_InvoiceBatch_ID", name="Invoice Batch", description="Expense Invoice Batch Header", dataType=FlyDataType.ID, entityType="D", printName="Invoice Batch", fieldLength=22)
	cInvoiceBatchID,
	//
	@FlyElement(columnName="C_InvoiceBatchLine_ID", name="Invoice Batch Line", description="Expense Invoice Batch Line", dataType=FlyDataType.ID, entityType="D", printName="Invoice Batch Line", fieldLength=22)
	cInvoiceBatchLineID,
	//
	@FlyElement(columnName="C_Invoice_ID", name="发票", description="开发票标识符", help="The Invoice ID uniquely identifies an Invoice Document.", dataType=FlyDataType.ID, entityType="D", printName="发票", fieldLength=22)
	cInvoiceID,
	//
	@FlyElement(columnName="C_InvoiceLine_ID", name="发票明细", description="发票明细明细", help="The Invoice Line uniquely identifies a single line of an Invoice.", dataType=FlyDataType.ID, entityType="D", printName="发票明细", fieldLength=22)
	cInvoiceLineID,
	//
	@FlyElement(columnName="C_InvoicePaySchedule_ID", name="发票付款排程", description="发票付款排程", help="The Invoice Payment Schedule determines when partial payments are due.", dataType=FlyDataType.ID, entityType="D", printName="发票薪资排程", fieldLength=22)
	cInvoicePayScheduleID,
	//
	@FlyElement(columnName="C_InvoiceRequest_ID", name="Request Invoice", description="The generated invoice for this request", help="The optionally generated invoice for the request", dataType=FlyDataType.Search, entityType="D", printName="Request Invoice", fieldLength=10)
	cInvoiceRequestID,
	//
	@FlyElement(columnName="C_InvoiceSchedule_ID", name="发票排程", description="Schedule for generating Invoices", help="The Invoice Schedule identifies the frequency used when generating invoices.", dataType=FlyDataType.ID, entityType="D", printName="发票排程", fieldLength=22)
	cInvoiceScheduleID,
	//
	@FlyElement(columnName="City", name="城市", description="标识城市", help="The City identifies a unique City for this Country or Region.", dataType=FlyDataType.String, entityType="D", printName="城市", fieldLength=60)
	city,
	//
	@FlyElement(columnName="C_JobAssignment_ID", name="Position Assignment", description="Assignment of Employee (User) to Job Position", dataType=FlyDataType.ID, entityType="D", printName="Position Assignment", fieldLength=10)
	cJobAssignmentID,
	//
	@FlyElement(columnName="C_JobCategory_ID", name="Position Category", description="Job Position Category", help="Classification of Job Positions", dataType=FlyDataType.TableDirect, entityType="D", printName="Position Category", fieldLength=10)
	cJobCategoryID,
	//
	@FlyElement(columnName="C_Job_ID", name="Position", description="Job Position", dataType=FlyDataType.ID, entityType="D", printName="Position", fieldLength=10)
	cJobID,
	//
	@FlyElement(columnName="C_JobRemuneration_ID", name="Position Remuneration", description="Remuneration for the Position", dataType=FlyDataType.ID, entityType="D", printName="Position Remuneration", fieldLength=10)
	cJobRemunerationID,
	//
	@FlyElement(columnName="C_LandedCostAllocation_ID", name="Landed Cost Allocation", description="Allocation for Land Costs", dataType=FlyDataType.ID, entityType="D", printName="Landed Cost Allocation", fieldLength=10)
	cLandedCostAllocationID,
	//
	@FlyElement(columnName="C_LandedCost_ID", name="Landed Cost", description="Landed cost to be allocated to material receipts", help="Landed costs allow you to allocate costs to previously received material receipts. Examples are freight, excise tax, insurance, etc.", dataType=FlyDataType.ID, entityType="D", printName="Landed Cost", fieldLength=22)
	cLandedCostID,
	//
	@FlyElement(columnName="Classification", name="分类", description="分类为配列", help="The Classification can be used to optionally group products.", dataType=FlyDataType.String, entityType="D", printName="分类", fieldLength=12)
	classification,
	//
	@FlyElement(columnName="Classname", name="类名", description="Java 类名", help="The Classname identifies the Java classname used by this report or process.", dataType=FlyDataType.String, entityType="D", printName="类名", fieldLength=60)
	classname,
	//
	@FlyElement(columnName="Classpath", name="Classpath", description="Extension Classpath", help="If your application requires additional jar files, enter them here. The jar files must be located in the $ADEMPIERE_HOME/lib directory.", dataType=FlyDataType.String, entityType="D", printName="Classpath", fieldLength=255)
	classpath,
	//
	@FlyElement(columnName="ClientValue", name="实体关键字", description="客户的关键字", dataType=FlyDataType.String, entityType="D", printName="实体关键字", fieldLength=40)
	clientValue,
	//
	@FlyElement(columnName="C_Location_ID", name="地址", description="位置或地址", help="The Location   Address field defines the location of an entity.", dataType=FlyDataType.ID, entityType="D", printName="地址", fieldLength=22)
	cLocationID,
	//
	@FlyElement(columnName="C_LocFrom_ID", name="来源位置", description="Location that inventory was moved from", help="The Location From indicates the location that a product was moved from.", dataType=FlyDataType.Table, entityType="D", printName="来源位置", fieldLength=22)
	cLocFromID,
	//
	@FlyElement(columnName="C_LocTo_ID", name="目标位置", description="Location that inventory was moved to", help="The Location To indicates the location that a product was moved to.", dataType=FlyDataType.Table, entityType="D", printName="目标位置", fieldLength=22)
	cLocToID,
	//
	@FlyElement(columnName="CloseDate", name="Close Date", description="Close Date", help="The Close Date indicates the last or final date", dataType=FlyDataType.DateTime, entityType="D", printName="Close Date", fieldLength=7)
	closeDate,
	//
	@FlyElement(columnName="CM_AccessProfile_ID", name="Web Access Profile", description="Web Access Profile", help="Define access to collaboration management content.  You can assign the profile to a internal role or for external access to business partner group.", dataType=FlyDataType.ID, entityType="D", printName="Access Profile", fieldLength=10)
	cMAccessProfileID,
	//
	@FlyElement(columnName="CM_Ad_Cat_ID", name="Advertisement Category", description="Advertisement Category like Banner Homepage ", help="The advertisement category defines a container for ad's like for example all banners used on the homepage in rotation are stored in a category 'Banner Homepage' etc.", dataType=FlyDataType.ID, entityType="D", printName="Advertisement Category", fieldLength=10)
	cMAdCatID,
	//
	@FlyElement(columnName="CM_Ad_ID", name="Advertisement", description="An Advertisement is something like a banner", help="You could use banner, partner infos, sponsored links etc. as an advertisement", dataType=FlyDataType.ID, entityType="D", printName="Advertisement", fieldLength=10)
	cMAdID,
	//
	@FlyElement(columnName="CM_BroadcastServer_ID", name="Broadcast Server", description="Web Broadcast Server", dataType=FlyDataType.ID, entityType="D", printName="Broadcast Server", fieldLength=10)
	cMBroadcastServerID,
	//
	@FlyElement(columnName="CM_ChatEntryGrandParent_ID", name="Chat Entry Grandparent", description="Link to Grand Parent (root level)", dataType=FlyDataType.Table, entityType="D", printName="Chat Entry Grandparent", fieldLength=10)
	cMChatEntryGrandParentID,
	//
	@FlyElement(columnName="CM_ChatEntry_ID", name="Chat Entry", description="Individual Chat / Discussion Entry", help="The entry can not be changed - just the confidentiality", dataType=FlyDataType.ID, entityType="D", printName="Chat Entry", fieldLength=10)
	cMChatEntryID,
	//
	@FlyElement(columnName="CM_ChatEntryParent_ID", name="Chat Entry Parent", description="Link to direct Parent", dataType=FlyDataType.Table, entityType="D", printName="Chat Entry Parent", fieldLength=10)
	cMChatEntryParentID,
	//
	@FlyElement(columnName="CM_Chat_ID", name="Chat", description="Chat or discussion thread", help="Thread of discussion", dataType=FlyDataType.ID, entityType="D", printName="Chat", fieldLength=10)
	cMChatID,
	//
	@FlyElement(columnName="CM_ChatType_ID", name="Chat Type", description="Type of discussion / chat", help="Chat Type allows you to receive subscriptions for particular content of discussions. It is linked to a table.", dataType=FlyDataType.ID, entityType="D", printName="Chat Type", fieldLength=10)
	cMChatTypeID,
	//
	@FlyElement(columnName="CM_Container_Element_ID", name="Container Element", description="Container element i.e. Headline, Content, Footer etc.", help="A container element defines the smallest definition of content, i.e. the headline, the content etc.", dataType=FlyDataType.ID, entityType="D", printName="Container Element", fieldLength=10)
	cMContainerElementID,
	//
	@FlyElement(columnName="CM_Container_ID", name="Web Container", description="Web Container contains content like images, text etc.", help="A Container defines the abstract level around the content, it defines how the content gets displayed, indexed and stored.", dataType=FlyDataType.ID, entityType="D", printName="Container", fieldLength=10)
	cMContainerID,
	//
	@FlyElement(columnName="CM_ContainerLink_ID", name="Container Link", description="Link to another Container in the Web Project", help="Internal Link", dataType=FlyDataType.Table, entityType="D", printName="Container Link", fieldLength=10)
	cMContainerLinkID,
	//
	@FlyElement(columnName="CM_ContainerTTable_ID", name="Container T.Table", description="Container Template Table", help="Link to individual Record", dataType=FlyDataType.ID, entityType="D", printName="Container T.Table", fieldLength=10)
	cMContainerTTableID,
	//
	@FlyElement(columnName="CM_Container_URL_ID", name="Container URL", description="Contains info on used URLs", help="We save the info on all used URLs for checking them on availability etc.", dataType=FlyDataType.ID, entityType="D", printName="Container URL", fieldLength=1)
	cMContainerURLID,
	//
	@FlyElement(columnName="CM_CStage_Element_ID", name="Container Stage Element", description="Container element i.e. Headline, Content, Footer etc.", help="A container element defines the smallest definition of content, i.e. the headline, the content etc.", dataType=FlyDataType.ID, entityType="D", printName="Container Stage Element", fieldLength=10)
	cMCStageElementID,
	//
	@FlyElement(columnName="CM_CStage_ID", name="Web Container Stage", description="Web Container Stage contains the staging content like images, text etc.", help="A Container defines the abstract level around the content, it defines how the content get's displayed, indexed and stored.	The ID is related 1 to 1 to the container ID", dataType=FlyDataType.ID, entityType="D", printName="Container Stage", fieldLength=10)
	cMCStageID,
	//
	@FlyElement(columnName="CM_CStageLink_ID", name="Container Link", description="Stage Link to another Container in the Web Project", help="Internal Link", dataType=FlyDataType.Table, entityType="D", printName="Container Link", fieldLength=10)
	cMCStageLinkID,
	//
	@FlyElement(columnName="CM_CStageTTable_ID", name="Stage T.Table", description="Container Stage Template Table", help="Link to individual Record", dataType=FlyDataType.ID, entityType="D", printName="Stage T.Table", fieldLength=10)
	cMCStageTTableID,
	//
	@FlyElement(columnName="CM_MediaDeploy_ID", name="Media Deploy", description="Media Deployment Log", help="Log of Media Deployments", dataType=FlyDataType.ID, entityType="D", printName="Media Deploy", fieldLength=10)
	cMMediaDeployID,
	//
	@FlyElement(columnName="CM_Media_ID", name="Media Item", description="Contains media content like images, flash movies etc.", help="This table contains all the media content like images, flash movies etc.", dataType=FlyDataType.ID, entityType="D", printName="Media Item", fieldLength=10)
	cMMediaID,
	//
	@FlyElement(columnName="CM_Media_Server_ID", name="Media Server", description="Media Server list to which content should get transfered", help="Media Server list to which content should get transferred", dataType=FlyDataType.ID, entityType="D", printName="Media Server", fieldLength=10)
	cMMediaServerID,
	//
	@FlyElement(columnName="CM_NewsChannel_ID", name="News Channel", description="News channel for rss feed", help="A news channel defines the content base for the RSS feed", dataType=FlyDataType.ID, entityType="D", printName="News Channel", fieldLength=10)
	cMNewsChannelID,
	//
	@FlyElement(columnName="CM_NewsItem_ID", name="News Item / Article", description="News item or article defines base content", help="A news item / article is kind of a teaser for more information on an article", dataType=FlyDataType.ID, entityType="D", printName="News Item / Article", fieldLength=10)
	cMNewsItemID,
	//
	@FlyElement(columnName="CM_Template_ID", name="Template", description="Template defines how content is displayed", help="A template describes how content should get displayed, it contains layout and maybe also scripts on how to handle the content", dataType=FlyDataType.ID, entityType="D", printName="Template", fieldLength=10)
	cMTemplateID,
	//
	@FlyElement(columnName="CM_TemplateTable_ID", name="Template Table", description="CM Template Table Link", help="Link a Template with a Table", dataType=FlyDataType.ID, entityType="D", printName="Template Table", fieldLength=10)
	cMTemplateTableID,
	//
	@FlyElement(columnName="CM_WebAccessLog_ID", name="Web Access Log", description="Web Access Log Information", dataType=FlyDataType.ID, entityType="D", printName="Web Access Log", fieldLength=10)
	cMWebAccessLogID,
	//
	@FlyElement(columnName="CM_WebProject_Domain_ID", name="WebProject Domain", description="Definition of Domainhandling", help="This data describes how the different Domains should get handled and how data is forwarded.", dataType=FlyDataType.ID, entityType="D", printName="WebProject Domain", fieldLength=10)
	cMWebProjectDomainID,
	//
	@FlyElement(columnName="CM_WebProject_ID", name="Web Project", description="A web project is the main data container for Containers, URLs, Ads, Media etc.", help="A web project is the meta definition which will contain later on all data within the Web Content Management Project. ", dataType=FlyDataType.ID, entityType="D", printName="Web Project", fieldLength=10)
	cMWebProjectID,
	//
	@FlyElement(columnName="CM_WikiToken_ID", name="Wiki Token", description="Wiki Token", dataType=FlyDataType.ID, entityType="D", printName="Wiki Token", fieldLength=10)
	cMWikiTokenID,
	//
	@FlyElement(columnName="C_NonBusinessDay_ID", name="非业务日", description="Day on which business is not transacted", help="The Non Business Day identifies a day that should not be considered a day when business is transacted", dataType=FlyDataType.ID, entityType="D", printName="非业务日", fieldLength=22)
	cNonBusinessDayID,
	//
	@FlyElement(columnName="Code", name="错误信息", description="Validation Code 错误信息", help="The Validation Code displays the date, time and message of the error.", dataType=FlyDataType.Text, entityType="D", printName="错误信息", fieldLength=2000)
	code,
	//
	@FlyElement(columnName="Col_0", name="列0", dataType=FlyDataType.Amount, entityType="D", printName="列0", fieldLength=22)
	col0,
	//
	@FlyElement(columnName="Col_1", name="列1", dataType=FlyDataType.Amount, entityType="D", printName="列1", fieldLength=22)
	col1,
	//
	@FlyElement(columnName="Col_10", name="列10", dataType=FlyDataType.Amount, entityType="D", printName="列10", fieldLength=22)
	col10,
	//
	@FlyElement(columnName="Col_11", name="列11", dataType=FlyDataType.Amount, entityType="D", printName="列11", fieldLength=22)
	col11,
	//
	@FlyElement(columnName="Col_12", name="列12", dataType=FlyDataType.Amount, entityType="D", printName="列12", fieldLength=22)
	col12,
	//
	@FlyElement(columnName="Col_13", name="列13", dataType=FlyDataType.Amount, entityType="D", printName="列13", fieldLength=22)
	col13,
	//
	@FlyElement(columnName="Col_14", name="列14", dataType=FlyDataType.Amount, entityType="D", printName="列14", fieldLength=22)
	col14,
	//
	@FlyElement(columnName="Col_15", name="列15", dataType=FlyDataType.Amount, entityType="D", printName="列15", fieldLength=22)
	col15,
	//
	@FlyElement(columnName="Col_16", name="列16", dataType=FlyDataType.Amount, entityType="D", printName="列16", fieldLength=22)
	col16,
	//
	@FlyElement(columnName="Col_17", name="列17", dataType=FlyDataType.Amount, entityType="D", printName="列17", fieldLength=22)
	col17,
	//
	@FlyElement(columnName="Col_18", name="列18", dataType=FlyDataType.Amount, entityType="D", printName="列18", fieldLength=22)
	col18,
	//
	@FlyElement(columnName="Col_19", name="列19", dataType=FlyDataType.Amount, entityType="D", printName="列19", fieldLength=22)
	col19,
	//
	@FlyElement(columnName="Col_2", name="列2", dataType=FlyDataType.Amount, entityType="D", printName="列2", fieldLength=22)
	col2,
	//
	@FlyElement(columnName="Col_20", name="列20", dataType=FlyDataType.Amount, entityType="D", printName="列20", fieldLength=22)
	col20,
	//
	@FlyElement(columnName="Col_3", name="列3", dataType=FlyDataType.Amount, entityType="D", printName="列3", fieldLength=22)
	col3,
	//
	@FlyElement(columnName="Col_4", name="列4", dataType=FlyDataType.Amount, entityType="D", printName="列4", fieldLength=22)
	col4,
	//
	@FlyElement(columnName="Col_5", name="列5", dataType=FlyDataType.Amount, entityType="D", printName="列5", fieldLength=22)
	col5,
	//
	@FlyElement(columnName="Col_6", name="列6", dataType=FlyDataType.Amount, entityType="D", printName="列6", fieldLength=22)
	col6,
	//
	@FlyElement(columnName="Col_7", name="列7", dataType=FlyDataType.Amount, entityType="D", printName="列7", fieldLength=22)
	col7,
	//
	@FlyElement(columnName="Col_8", name="列8", dataType=FlyDataType.Amount, entityType="D", printName="列8", fieldLength=22)
	col8,
	//
	@FlyElement(columnName="Col_9", name="列9", dataType=FlyDataType.Amount, entityType="D", printName="列9", fieldLength=22)
	col9,
	//
	@FlyElement(columnName="ColorType", name="颜色类型", description="Color presentation for this color", dataType=FlyDataType.List, entityType="D", printName="颜色类型", fieldLength=1)
	colorType,
	//
	@FlyElement(columnName="ColumnName", name="数据库列名", description="Name of the column in the database", help="The Column Name indicates the name of a column on a table as defined in the database.", dataType=FlyDataType.String, entityType="D", printName="数据库列名", fieldLength=30)
	columnName,
	//
	@FlyElement(columnName="ColumnNo", name="Column No", description="Dashboard content column number", help="Dashboard content column number, not used by the swing client at the moment.", dataType=FlyDataType.Integer, entityType="D", printName="Column No", fieldLength=14)
	columnNo,
	//
	@FlyElement(columnName="Columns", name="Columns", description="Number of columns", help="The number of columns in the layout grid", dataType=FlyDataType.Integer, entityType="D", printName="Columns", fieldLength=10)
	columns,
	//
	@FlyElement(columnName="ColumnSQL", name="Column SQL", description="Virtual Column (r/o)", help="You can define virtual columns (not stored in the database). If defined, the Column name is the synonym of the SQL expression defined here. The SQL expression must be valid.<br>	Example: 'Updated-Created' would list the age of the entry in days", dataType=FlyDataType.String, entityType="D", printName="Column SQL", fieldLength=2000)
	columnSQL,
	//
	@FlyElement(columnName="ColumnType", name="列类型", dataType=FlyDataType.List, entityType="D", printName="列类型", fieldLength=1)
	columnType,
	//
	@FlyElement(columnName="ColValue", name="ColValue", dataType=FlyDataType.String, entityType="D", printName="ColValue", fieldLength=2000)
	colValue,
	//
	@FlyElement(columnName="Combination", name="组合", description="Unique combination of account elements", help="The Combination field defines the unique combination of element values which comprise this account.", dataType=FlyDataType.String, entityType="D", printName="组合", fieldLength=60)
	combination,
	//
	@FlyElement(columnName="Comments", name="注释", description="Comments or additional information", help="The Comments field allows for free form entry of additional information.", dataType=FlyDataType.Text, entityType="D", printName="注释", fieldLength=2000)
	comments,
	//
	@FlyElement(columnName="Commission", name="佣金", description="Commission stated as a percentage", help="The Commission indicates (as a percentage) the commission to be paid.", dataType=FlyDataType.Number, entityType="D", printName="佣金", fieldLength=22)
	commission,
	//
	@FlyElement(columnName="CommissionAmt", name="佣金金额", description="佣金金额", help="The Commission Amount is the total calculated commission.  It is based on the parameters as defined for this Commission Run.", dataType=FlyDataType.Amount, entityType="D", printName="委任 Amt", fieldLength=22)
	commissionAmt,
	//
	@FlyElement(columnName="Commission_BPartner_ID", name="Commissioned B.Partner", description="Business Partner receiving the Commission", dataType=FlyDataType.Table, entityType="D", printName="Comm B.Partner", fieldLength=22)
	commissionBPartnerID,
	//
	@FlyElement(columnName="CommissionConvertedAmt", name="Commission Converted Amount", description="Commission calculation basis Converted Amount", dataType=FlyDataType.Amount, entityType="D", printName="Comm Conv Amt", fieldLength=22)
	commissionConvertedAmt,
	//
	@FlyElement(columnName="CommissionOrders", name="Commission only specified Orders", description="Commission only Orders or Invoices, where this Sales Rep is entered", help="Sales Reps are entered in Orders and Invoices. If selected, only Orders and Invoices for this Sales Reps are included in the calculation of the commission.", dataType=FlyDataType.YesNo, entityType="D", printName="委任定单", fieldLength=1)
	commissionOrders,
	//
	@FlyElement(columnName="CommissionQty", name="Commission Qty", description="Commission calculation basis Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Comm Qty", fieldLength=22)
	commissionQty,
	//
	@FlyElement(columnName="CommitmentOffset_Acct", name="Commitment Offset", description="Budgetary Commitment Offset Account", help="The Commitment Offset Account is used for posting Commitments and Reservations.  It is usually an off-balance sheet and gain-and-loss account.", dataType=FlyDataType.Account, entityType="D", printName="Commitment Offset", fieldLength=10)
	commitmentOffsetAcct,
	//
	@FlyElement(columnName="CommitmentOffsetSales_Acct", name="Commitment Offset Sales", description="Budgetary Commitment Offset Account for Sales", help="The Commitment Offset Account is used for posting Commitments Sales and Reservations.  It is usually an off-balance sheet and gain-and-loss account.", dataType=FlyDataType.Account, entityType="D", printName="Commitment Offset Sales", fieldLength=10)
	commitmentOffsetSalesAcct,
	//
	@FlyElement(columnName="CommitmentType", name="Commitment Type", description="Create Commitment and/or Reservations for Budget Control", help="The Posting Type Commitments is created when posting Purchase Orders; The Posting Type Reservation is created when posting Requisitions.  This is used for budgetary control.", dataType=FlyDataType.List, entityType="D", printName="Commitment Type", fieldLength=1)
	commitmentType,
	//
	@FlyElement(columnName="CommittedAmt", name="已委托金额", description="The (legal) commitment amount", help="The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.", dataType=FlyDataType.Amount, entityType="D", printName="已委托金额", fieldLength=22)
	committedAmt,
	//
	@FlyElement(columnName="CommittedQty", name="已委托数量", description="The (legal) commitment Quantity", help="The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.", dataType=FlyDataType.Quantity, entityType="D", printName="已委托数量", fieldLength=22)
	committedQty,
	//
	@FlyElement(columnName="CommitWarning", name="提交警告", description="保存时显示警告", help="Warning or information displayed when committing the record", dataType=FlyDataType.Text, entityType="D", printName="提交警告", fieldLength=2000)
	commitWarning,
	//
	@FlyElement(columnName="CommodityCode", name="日用品编码", description="Commodity code used for tax calculation", help="The Commodity Code indicates a code that is used in tax calculations", dataType=FlyDataType.String, entityType="D", printName="日用品编码", fieldLength=20)
	commodityCode,
	//
	@FlyElement(columnName="ConfidentialType", name="Confidentiality", description="Type of Confidentiality", dataType=FlyDataType.List, entityType="D", printName="Confidentiality", fieldLength=1)
	confidentialType,
	//
	@FlyElement(columnName="ConfidentialTypeEntry", name="Entry Confidentiality", description="Confidentiality of the individual entry", dataType=FlyDataType.List, entityType="D", printName="Entry Confidentiality", fieldLength=1)
	confidentialTypeEntry,
	//
	@FlyElement(columnName="ConfigurationLevel", name="Configuration Level", description="Configuration Level for this parameter", help="Configuration Level for this parameter	S - just allowed system configuration	C - client configurable parameter	O - org configurable parameter", dataType=FlyDataType.List, entityType="D", printName="Configuration Level for this parameter", fieldLength=1)
	configurationLevel,
	//
	@FlyElement(columnName="ConfirmationNo", name="Confirmation No", description="Confirmation Number", dataType=FlyDataType.String, entityType="D", printName="Confirmation No", fieldLength=20)
	confirmationNo,
	//
	@FlyElement(columnName="ConfirmedQty", name="Confirmed Quantity", description="Confirmation of a received quantity", help="Confirmation of a received quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Confirmed Qty", fieldLength=22)
	confirmedQty,
	//
	@FlyElement(columnName="ConfirmQueryRecords", name="Confirm Query Records", description="Require Confirmation if more records will be returned by the query (If not defined 500)", help="Enter the number of records the query will return without confirmation to avoid unnecessary system load.  If 0, the system default of 500 is used.", dataType=FlyDataType.Integer, entityType="D", printName="Confirm Query Records", fieldLength=10)
	confirmQueryRecords,
	//
	@FlyElement(columnName="ConfirmType", name="Confirmation Type", description="Type of confirmation", dataType=FlyDataType.List, entityType="D", printName="Confirm Type", fieldLength=2)
	confirmType,
	//
	@FlyElement(columnName="ConnectionProfile", name="Connection Profile", description="How a Java Client connects to the server(s)", help="Depending on the connection profile, different protocols are used and tasks are performed on the server rather then the client. Usually the user can select different profiles, unless it is enforced by the User or Role definition. The User level profile overwrites the Role based profile.", dataType=FlyDataType.List, entityType="D", printName="Connection Profile", fieldLength=1)
	connectionProfile,
	//
	@FlyElement(columnName="ConnectionTimeout", name="Connection Timeout", description="Is Timeout (In milliseconds) for establishing connection", dataType=FlyDataType.Integer, entityType="D", printName="Connection Timeout", fieldLength=0)
	connectionTimeout,
	//
	@FlyElement(columnName="ConsolidateDocument", name="Consolidate to one Document", description="Consilidate Lines into one Document", dataType=FlyDataType.YesNo, entityType="D", printName="Consolidate", fieldLength=1)
	consolidateDocument,
	//
	@FlyElement(columnName="ConstantValue", name="常数值", description="Constant value", dataType=FlyDataType.String, entityType="D", printName="常数", fieldLength=60)
	constantValue,
	//
	@FlyElement(columnName="ContactActivityType", name="Activity Type", description="Type of activity, e.g. task, email, phone call", dataType=FlyDataType.NONE, entityType="D", printName="Activity Type", fieldLength=0)
	contactActivityType,
	//
	@FlyElement(columnName="ContactDescription", name="联系人描述", description="联系人的描述", dataType=FlyDataType.String, entityType="D", printName="联系人描述", fieldLength=255)
	contactDescription,
	//
	@FlyElement(columnName="ContactName", name="联系人名字", description="业务伙伴联系人名字", dataType=FlyDataType.String, entityType="D", printName="联系人名字", fieldLength=60)
	contactName,
	//
	@FlyElement(columnName="ContainerLinkURL", name="External Link (URL)", description="External Link (URL) for the Container", help="External URL for the Container	", dataType=FlyDataType.URL, entityType="D", printName="External Link", fieldLength=60)
	containerLinkURL,
	//
	@FlyElement(columnName="ContainerType", name="Web Container Type", description="Web Container Type", help="This parameter defines the type of content for this container.", dataType=FlyDataType.List, entityType="D", printName="Container Type", fieldLength=1)
	containerType,
	//
	@FlyElement(columnName="ContainerXML", name="ContainerXML", description="Autogenerated Containerdefinition as XML Code", help="Autogenerated Containerdefinition as XML Code", dataType=FlyDataType.Text, entityType="D", printName="ContainerXML", fieldLength=2000)
	containerXML,
	//
	@FlyElement(columnName="ContentHTML", name="Content HTML", description="Contains the content itself", help="Contains the content itself as HTML code. Should normally only use basic tags, no real layouting", dataType=FlyDataType.Text, entityType="D", printName="Content HTML", fieldLength=2000)
	contentHTML,
	//
	@FlyElement(columnName="ContentText", name="Content", dataType=FlyDataType.LongText, entityType="D", printName="Content", fieldLength=0)
	contentText,
	//
	@FlyElement(columnName="ControlAmt", name="控制金额", description="If not zero, the Debit amount of the document must be equal this amount", help="If the control amount is zero, no check is performed.	Otherwise the total Debit amount must be equal to the control amount, before the document is processed.", dataType=FlyDataType.Amount, entityType="D", printName="控制金额", fieldLength=22)
	controlAmt,
	//
	@FlyElement(columnName="ConventionType", name="ConventionType", dataType=FlyDataType.String, entityType="D", printName="ConventionType", fieldLength=10)
	conventionType,
	//
	@FlyElement(columnName="ConversionDate", name="转变日期", description="Date for selecting conversion rate", help="The Conversion Date identifies the date used for currency conversion. The conversion rate chosen must include this date in it's date range", dataType=FlyDataType.Date, entityType="D", printName="转变日期", fieldLength=7)
	conversionDate,
	//
	@FlyElement(columnName="ConversionTypeValue", name="Currency Type Key", description="Key value for the Currency Conversion Rate Type", help="The date type key for the conversion of foreign currency transactions", dataType=FlyDataType.String, entityType="D", printName="Currency Conversion Type", fieldLength=40)
	conversionTypeValue,
	//
	@FlyElement(columnName="ConvertedAmt", name="已转换金额", description="已转换金额", help="The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate for this target currency.", dataType=FlyDataType.Amount, entityType="D", printName="转换", fieldLength=22)
	convertedAmt,
	//
	@FlyElement(columnName="Coordinates", name="坐标", description="位置坐标", help="This column contains the geographical coordinates (latitude longitude) of the location.<p>	In order to avoid unnecessary use of non-standard characters and space, the following standard presentation is used:<br>	0000N 00000W 0000S 00000E <br>	where the two last digits refer to minutes and the two or three first digits indicate the degrees	", dataType=FlyDataType.String, entityType="D", printName="坐标", fieldLength=15)
	coordinates,
	//
	@FlyElement(columnName="C_Opportunity_ID", name="Sales Opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Sales Opportunity", fieldLength=0)
	cOpportunityID,
	//
	@FlyElement(columnName="CopyColumnsFromTable", name="Copy Columns From Table", dataType=FlyDataType.Button, entityType="D", printName="Copy Columns From Table", fieldLength=1)
	copyColumnsFromTable,
	//
	@FlyElement(columnName="CopyFrom", name="复制从", description="来自记录的复制", help="来自记录的复制", dataType=FlyDataType.Button, entityType="D", printName="复制从", fieldLength=1)
	copyFrom,
	//
	@FlyElement(columnName="CopyFromProcess", name="Copy From Report and Process", description="Copy settings from one report and process to another.", help="Copy the settings from the selected report and process to the current one.  This overwrites existing settings and translations.", dataType=FlyDataType.Button, entityType="D", printName="Copy From Report and Process", fieldLength=1)
	copyFromProcess,
	//
	@FlyElement(columnName="CopyLines", name="Copylines", dataType=FlyDataType.Button, entityType="D", printName="Copylines", fieldLength=1)
	copyLines,
	//
	@FlyElement(columnName="CopyOverwriteAcct", name="Copy Overwrite", description="Copy and Overwrite Default Accounts (DANGEROUS!!)", dataType=FlyDataType.NONE, entityType="D", printName="Copy Overwrite", fieldLength=0)
	copyOverwriteAcct,
	//
	@FlyElement(columnName="C_Order_ID", name="销售定单", description="销售定单", help="The Sales Order ID is a unique identifier of a Sales Order.  This is controlled by the document sequence for this document type.", dataType=FlyDataType.ID, entityType="D", printName="销售定单", fieldLength=22)
	cOrderID,
	//
	@FlyElement(columnName="C_OrderLine_ID", name="销售定单明细", description="销售定单明细", help="The Sales Order Line is a unique identifier for a line in an order.", dataType=FlyDataType.ID, entityType="D", printName="定单明细", fieldLength=22)
	cOrderLineID,
	//
	@FlyElement(columnName="C_OrderPO_ID", name="Purchase Order", description="Purchase Order", dataType=FlyDataType.Table, entityType="D", printName="Purchase Order", fieldLength=22)
	cOrderPOID,
	//
	@FlyElement(columnName="C_OrderSource_ID", name="Order Source", dataType=FlyDataType.ID, entityType="D", printName="Order Source", fieldLength=10)
	cOrderSourceID,
	//
	@FlyElement(columnName="C_OrderSourceValue", name="Order Source Key", dataType=FlyDataType.String, entityType="D", printName="Order Source Key", fieldLength=40)
	cOrderSourceValue,
	//
	@FlyElement(columnName="C_OrgAssignment_ID", name="机构指派", description="Assigment to (transaction) Organization", help="Assignment to the transacation organization (cost center).", dataType=FlyDataType.ID, entityType="D", printName="机构指派", fieldLength=22)
	cOrgAssignmentID,
	//
	@FlyElement(columnName="Cost", name="Cost", description="Cost information", dataType=FlyDataType.CostsPrices, entityType="D", printName="Cost", fieldLength=22)
	cost,
	//
	@FlyElement(columnName="CostAdjustment", name="Cost Adjustment", description="Product Cost Adjustment", help="product cost adjustments", dataType=FlyDataType.NONE, entityType="D", printName="Cost Adjustment", fieldLength=0)
	costAdjustment,
	//
	@FlyElement(columnName="CostAdjustmentDate", name="Cost Adjustment Date", description="Product Cost Adjustment", help="product cost adjustments", dataType=FlyDataType.NONE, entityType="D", printName="Cost Adjustment Date", fieldLength=0)
	costAdjustmentDate,
	//
	@FlyElement(columnName="CostAdjustmentDateLL", name="Cost Adjustment Date", description="Date Product Cost Adjustment Lower Level", help="Date product cost adjustments Lower Level", dataType=FlyDataType.NONE, entityType="D", printName="Cost Adjustment Date", fieldLength=0)
	costAdjustmentDateLL,
	//
	@FlyElement(columnName="CostAdjustmentLL", name="Cost Adjustment LL", description="Product Cost Adjustment Lower Level", help="product cost adjustments", dataType=FlyDataType.NONE, entityType="D", printName="Cost Adjustment Lower Level", fieldLength=0)
	costAdjustmentLL,
	//
	@FlyElement(columnName="CostAmt", name="Cost Value", description="Value with Cost", dataType=FlyDataType.Amount, entityType="D", printName="Cost Value", fieldLength=22)
	costAmt,
	//
	@FlyElement(columnName="CostAmtLL", name="Cost Value LL", description="Value with Cost Lower Level", dataType=FlyDataType.NONE, entityType="D", printName="Cost Value Lower Level", fieldLength=0)
	costAmtLL,
	//
	@FlyElement(columnName="CostAverage", name="平均成本", description="已加权平均的成本", help="Weighted average (actual) costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="平均成本", fieldLength=22)
	costAverage,
	//
	@FlyElement(columnName="CostAverageCumAmt", name="平均的成本金额总数", description="Cumulative average cost amounts (internal)", help="Current cumulative costs for calculating the average costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="平均的成本金额总数", fieldLength=22)
	costAverageCumAmt,
	//
	@FlyElement(columnName="CostAverageCumQty", name="平均成本量总数", description="Cumulative average cost quantities (internal)", help="Current cumulative quantity for calculating the average costs", dataType=FlyDataType.Quantity, entityType="D", printName="平均成本量总数", fieldLength=22)
	costAverageCumQty,
	//
	@FlyElement(columnName="CostElementType", name="Cost Element Type", description="Type of Cost Element", dataType=FlyDataType.List, entityType="D", printName="Cost Element Type", fieldLength=1)
	costElementType,
	//
	@FlyElement(columnName="CostFuture", name="Future Cost", description="Cost information", dataType=FlyDataType.CostsPrices, entityType="D", printName="Future Cost", fieldLength=22)
	costFuture,
	//
	@FlyElement(columnName="CostingLevel", name="Costing Level", description="The lowest level to accumulate Costing Information", help="If you want to maintain different costs per organization (warehouse) or per Batch/Lot, you need to make sure that you define the costs for each of the organizations or batch/lot. The Costing Level is defined per Accounting Schema and can be overwritten by Product Category and Accounting Schema.", dataType=FlyDataType.List, entityType="D", printName="Costing Level", fieldLength=1)
	costingLevel,
	//
	@FlyElement(columnName="CostingMethod", name="成本计算方法", description="Indicates how Costs will be calculated", help="The Costing Method indicates how costs will be calculated (Standard, Average)", dataType=FlyDataType.List, entityType="D", printName="成本计算方法", fieldLength=1)
	costingMethod,
	//
	@FlyElement(columnName="CostingPrecision", name="成本计算精度", description="Rounding used costing calculations", help="The Costing Precision defines the number of decimal places that amounts will be rounded to when performing costing calculations.", dataType=FlyDataType.Integer, entityType="D", printName="成本计算精度", fieldLength=22)
	costingPrecision,
	//
	@FlyElement(columnName="CostPerOrder", name="每定单成本", description="每定单固定的成本", help="The Cost Per Order indicates the fixed charge levied when an order for this product is placed.", dataType=FlyDataType.CostsPrices, entityType="D", printName="每定单成本", fieldLength=22)
	costPerOrder,
	//
	@FlyElement(columnName="CostPerTrx", name="每交易成本", description="每交易固定的成本", help="The Cost per Transaction indicates the fixed cost per to be charged per transaction.", dataType=FlyDataType.CostsPrices, entityType="D", printName="每交易成本", fieldLength=22)
	costPerTrx,
	//
	@FlyElement(columnName="Costs", name="成本", description="成本在帐户币种方面", help="The Costs indicates the cost of a campaign in an Organizations accounting currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="成本", fieldLength=22)
	costs,
	//
	@FlyElement(columnName="CostStandard", name="标准成本", description="标准成本", help="Standard (plan) costs.", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本", fieldLength=22)
	costStandard,
	//
	@FlyElement(columnName="CostStandardAmt", name="标准成本", description="标准的成本", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本", fieldLength=22)
	costStandardAmt,
	//
	@FlyElement(columnName="CostStandardCumAmt", name="标准成本金额总数", description="Standard Cost Invoice Amount Sum (internal)", help="Current cumulative amount for calculating the standard cost difference based on (actual) invoice price", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本金额总数", fieldLength=22)
	costStandardCumAmt,
	//
	@FlyElement(columnName="CostStandardCumQty", name="标准成本数量总数", description="Standard Cost Invoice Quantity Sum (internal)", help="Current cumulative quantity for calculating the standard cost difference based on (actual) invoice price", dataType=FlyDataType.Quantity, entityType="D", printName="标准成本数量总数", fieldLength=22)
	costStandardCumQty,
	//
	@FlyElement(columnName="CostStandardInvDiff", name="Standard Cost Invoice Difference", description="Standard Cost Invoice Difference", help="Accumulated difference of Invoice Costs to Standard Costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本发票差额", fieldLength=22)
	costStandardInvDiff,
	//
	@FlyElement(columnName="CostStandardPOAmt", name="标准采购定单成本金额总数", description="Standard Cost Purchase Order Amount Sum (internal)", help="Current cumulative amount for calculating the standard cost difference based on (planned) purchase order price", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准采购定单成本金额总数", fieldLength=22)
	costStandardPOAmt,
	//
	@FlyElement(columnName="CostStandardPODiff", name="标准成本采购定单差额", description="Standard Cost Purchase Order Difference", help="Accumulated difference of Purchase Order Costs to Standard Costs", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准成本采购定单差额", fieldLength=22)
	costStandardPODiff,
	//
	@FlyElement(columnName="CostStandardPOQty", name="标准采购定单成本数量总数", description="Standard Cost Purchase Order Quantity Sum (internal)", help="Current cumulative quantity for calculating the standard cost difference based on (planned) purchase order price", dataType=FlyDataType.Quantity, entityType="D", printName="标准采购定单成本数量总数", fieldLength=22)
	costStandardPOQty,
	//
	@FlyElement(columnName="CountEntered", name="Count Entered", dataType=FlyDataType.NONE, entityType="D", printName="Entered", fieldLength=0)
	countEntered,
	//
	@FlyElement(columnName="Counter", name="柜台", description="计数值", help="数字柜台", dataType=FlyDataType.Integer, entityType="D", printName="柜台", fieldLength=22)
	counter,
	//
	@FlyElement(columnName="Counter_C_DocType_ID", name="Counter Document Type", description="Generated Counter Document Type (To)", help="The Document Type of the generated counter document", dataType=FlyDataType.Table, entityType="D", printName="Counter Doc Type", fieldLength=22)
	counterCDocTypeID,
	//
	@FlyElement(columnName="CountHighMovement", name="计算高成交量项目", description="计算高运动产品", help="The Count High Movement checkbox indicates if the those items with a high turnover will be counted", dataType=FlyDataType.YesNo, entityType="D", printName="计算高成交量项目", fieldLength=1)
	countHighMovement,
	//
	@FlyElement(columnName="CountOrder", name="Order Count", dataType=FlyDataType.Integer, entityType="D", printName="Order Count", fieldLength=0)
	countOrder,
	//
	@FlyElement(columnName="CountryCode", name="ISO国家代码", description="Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http:  www.chemie.fu-berlin.de diverse doc ISO_3166.html", help="For details - http:  www.din.de gremien nas nabd iso3166ma codlstp1.html or - http:  www.unece.org trade rec rec03en.htm", dataType=FlyDataType.String, entityType="D", printName="ISO 国家", fieldLength=2)
	countryCode,
	//
	@FlyElement(columnName="CountryName", name="Country", description="Country Name", dataType=FlyDataType.String, entityType="D", printName="Country", fieldLength=60)
	countryName,
	//
	@FlyElement(columnName="C_PaymentAllocate_ID", name="Allocate Payment", description="Allocate Payment to Invoices", help="You can directly allocate payments to invoices when creating the Payment. 	Note that you can over- or under-allocate the payment.  When processing the payment, the allocation is created.", dataType=FlyDataType.ID, entityType="D", printName="Allocate Payment", fieldLength=10)
	cPaymentAllocateID,
	//
	@FlyElement(columnName="C_PaymentBatch_ID", name="付款批次", dataType=FlyDataType.TableDirect, entityType="D", printName="付款批次", fieldLength=22)
	cPaymentBatchID,
	//
	@FlyElement(columnName="C_Payment_ID", name="付款", description="付款标识符", help="The Payment is a unique identifier of this payment.", dataType=FlyDataType.Search, entityType="D", printName="付款", fieldLength=22)
	cPaymentID,
	//
	@FlyElement(columnName="C_PaymentProcessor_ID", name="付款处理器", description="Payment processor for electronic payments", help="The Payment Processor indicates the processor to be used for electronic payments", dataType=FlyDataType.ID, entityType="D", printName="付款处理器", fieldLength=22)
	cPaymentProcessorID,
	//
	@FlyElement(columnName="C_PaymentTerm_ID", name="付款条款", description="The terms for Payment of this transaction", help="Payment Terms identify the method and timing of payment for this transaction.  ", dataType=FlyDataType.ID, entityType="D", printName="付款条款", fieldLength=22)
	cPaymentTermID,
	//
	@FlyElement(columnName="C_PaySchedule_ID", name="付款排程", description="付款排程模板", help="Information when parts of the payment are due", dataType=FlyDataType.ID, entityType="D", printName="付款排程", fieldLength=22)
	cPayScheduleID,
	//
	@FlyElement(columnName="C_PaySelectionCheck_ID", name="支付选择帐单", description="付款选择检查", dataType=FlyDataType.ID, entityType="D", printName="支付选择帐单", fieldLength=22)
	cPaySelectionCheckID,
	//
	@FlyElement(columnName="C_PaySelection_ID", name="付款选择", description="付款选择", help="The Payment Selection identifies a unique Payment", dataType=FlyDataType.ID, entityType="D", printName="付款选择", fieldLength=22)
	cPaySelectionID,
	//
	@FlyElement(columnName="C_PaySelectionLine_ID", name="付款选择明细", description="付款选择明细", help="The Payment Selection Line identifies a unique line in a payment", dataType=FlyDataType.ID, entityType="D", printName="付款选择明细", fieldLength=22)
	cPaySelectionLineID,
	//
	@FlyElement(columnName="C_PaySelectionLine_Parent_ID", name="Parent Pay Selection Line", dataType=FlyDataType.Table, entityType="D", printName="Parent Pay Selection Line", fieldLength=10)
	cPaySelectionLineParentID,
	//
	@FlyElement(columnName="C_PeriodControl_ID", name="分期控制", dataType=FlyDataType.ID, entityType="D", printName="分期控制", fieldLength=22)
	cPeriodControlID,
	//
	@FlyElement(columnName="C_Period_ID", name="分期", description="日历的分期", help="The Period indicates an exclusive range of dates for a calendar.", dataType=FlyDataType.ID, entityType="D", printName="分期", fieldLength=22)
	cPeriodID,
	//
	@FlyElement(columnName="C_Phase_ID", name="标准阶段", description="Standard Phase of the Project Type", help="Phase of the project with standard performance information", dataType=FlyDataType.TableDirect, entityType="D", printName="标准阶段", fieldLength=22)
	cPhaseID,
	//
	@FlyElement(columnName="C_POS_ID", name="POS Terminal", description="Point of Sales Terminal", help="The POS Terminal defines the defaults and functions available for the POS Form", dataType=FlyDataType.ID, entityType="D", printName="POS", fieldLength=22)
	cPOSID,
	//
	@FlyElement(columnName="C_POSKey_ID", name="POS Key", description="POS Function Key", help="Define a POS Function Key", dataType=FlyDataType.ID, entityType="D", printName="POS Key", fieldLength=22)
	cPOSKeyID,
	//
	@FlyElement(columnName="C_POSKeyLayout_ID", name="POS Key Layout", description="POS Function Key Layout", help="POS Function Key Layout", dataType=FlyDataType.TableDirect, entityType="D", printName="POS Key Layout", fieldLength=22)
	cPOSKeyLayoutID,
	//
	@FlyElement(columnName="C_Prepayment_Acct", name="客户预付款", description="Account for customer prepayments", help="The Customer Prepayment account indicates the account to be used for recording prepayments from a customer.", dataType=FlyDataType.Account, entityType="D", printName="客户预付款", fieldLength=22)
	cPrepaymentAcct,
	//
	@FlyElement(columnName="C_Project_ID", name="项目", description="财务项目", help="Project ID is a user defined identifier for a Project", dataType=FlyDataType.ID, entityType="D", printName="项目", fieldLength=22)
	cProjectID,
	//
	@FlyElement(columnName="C_ProjectIssue_ID", name="Project Issue", description="Project Issues (Material, Labor)", help="Issues to the project initiated by the 'Issue to Project' process. You can issue Receipts, Time and Expenses, or Stock.", dataType=FlyDataType.ID, entityType="D", printName="Project Issue", fieldLength=22)
	cProjectIssueID,
	//
	@FlyElement(columnName="C_ProjectLine_ID", name="项目明细", description="在一个项目中的任务或步骤", help="The Project Line indicates a unique project line.", dataType=FlyDataType.ID, entityType="D", printName="项目明细", fieldLength=22)
	cProjectLineID,
	//
	@FlyElement(columnName="C_ProjectPhase_ID", name="项目阶段", description="一项目的项目阶段", dataType=FlyDataType.TableDirect, entityType="D", printName="项目阶段", fieldLength=22)
	cProjectPhaseID,
	//
	@FlyElement(columnName="C_ProjectTask_ID", name="项目任务", description="Actual Project Task in a Phase", help="A Project Task in a Project Phase represents the actual work.", dataType=FlyDataType.TableDirect, entityType="D", printName="项目任务", fieldLength=22)
	cProjectTaskID,
	//
	@FlyElement(columnName="C_ProjectType_ID", name="项目类型", description="项目的类型", help="Type of the project with optional phases of the project with standard performance information", dataType=FlyDataType.ID, entityType="D", printName="项目类型", fieldLength=22)
	cProjectTypeID,
	//
	@FlyElement(columnName="CR_Account_ID", name="Account (credit)", description="Account used", help="The (natural) account used", dataType=FlyDataType.NONE, entityType="D", printName="Account (credit)", fieldLength=0)
	cRAccountID,
	//
	@FlyElement(columnName="CreateConfirm", name="Create Confirm", dataType=FlyDataType.Button, entityType="D", printName="Create Confirm", fieldLength=1)
	createConfirm,
	//
	@FlyElement(columnName="CreateCopy", name="产生复制", dataType=FlyDataType.Button, entityType="D", printName="产生复制", fieldLength=1)
	createCopy,
	//
	@FlyElement(columnName="Created", name="创建日期", description="本记录产生日期", help="The Created field indicates the date that this record was created.", dataType=FlyDataType.DateTime, entityType="D", printName="创建日期", fieldLength=7)
	created,
	//
	@FlyElement(columnName="CreatedBy", name="创建人", description="产生该记录用户", help="The Created By field indicates the user who created this record.", dataType=FlyDataType.Table, entityType="D", printName="创建人", fieldLength=22)
	createdBy,
	//
	@FlyElement(columnName="CreatedDate", name="CreatedDate", dataType=FlyDataType.String, entityType="D", printName="CreatedDate", fieldLength=50)
	createdDate,
	//
	@FlyElement(columnName="CreateFrom", name="产生明细", description="Process which will generate a new document lines based on an existing document", help="The Create From process will create a new document based on information in an existing document selected by the user.", dataType=FlyDataType.Button, entityType="D", printName="产生明细", fieldLength=1)
	createFrom,
	//
	@FlyElement(columnName="CreateFromInvoice", name="Create lines from Invoice", description="Process which will generate a new document lines based on an existing document", help="The Create From process will create a new document based on information in an existing document selected by the user.", dataType=FlyDataType.Button, entityType="D", printName="Create lines from Invoice", fieldLength=1)
	createFromInvoice,
	//
	@FlyElement(columnName="CreateFromOrder", name="Create lines from Order", description="Process which will generate a new document lines based on an existing document", help="The Create From process will create a new document based on information in an existing document selected by the user.", dataType=FlyDataType.Button, entityType="D", printName="Create lines from Order", fieldLength=1)
	createFromOrder,
	//
	@FlyElement(columnName="CreateFromType", name="Create From Type", dataType=FlyDataType.List, entityType="D", printName="Create From Type", fieldLength=1)
	createFromType,
	//
	@FlyElement(columnName="CreateLevelsSequentially", name="Create levels sequentially", description="Create Dunning Letter by level sequentially", help="If selected, the dunning letters are created in the sequence of the dunning levels.  Otherwise, the dunning level is based on the days (over)due.", dataType=FlyDataType.YesNo, entityType="D", printName="Sequential", fieldLength=1)
	createLevelsSequentially,
	//
	@FlyElement(columnName="CreateNewCombination", name="产生新的组合", description="Create New Account Combination", dataType=FlyDataType.NONE, entityType="D", printName="产生新的组合", fieldLength=0)
	createNewCombination,
	//
	@FlyElement(columnName="CreateOpportunity", name="CreateOpportunity", description="Create Opportunity", help="Create a new Sales Opportunity when converting a lead", dataType=FlyDataType.YesNo, entityType="D", printName="Create Opportunity", fieldLength=1)
	createOpportunity,
	//
	@FlyElement(columnName="CreatePackage", name="Create Package", dataType=FlyDataType.Button, entityType="D", printName="Create Package", fieldLength=1)
	createPackage,
	//
	@FlyElement(columnName="CreatePayment", name="Create Payment", dataType=FlyDataType.Button, entityType="D", printName="Create Payment", fieldLength=1)
	createPayment,
	//
	@FlyElement(columnName="CreatePO", name="Create PO", dataType=FlyDataType.Button, entityType="D", printName="Create PO", fieldLength=1)
	createPO,
	//
	@FlyElement(columnName="CreateReciprocalRate", name="Create Reciprocal Rate", description="Create Reciprocal Rate from current information", help="If selected, the imported USD->EUR rate is used to create/calculate the reciprocal rate EUR->USD.", dataType=FlyDataType.YesNo, entityType="D", printName="Create Reciprocal", fieldLength=1)
	createReciprocalRate,
	//
	@FlyElement(columnName="CreateShipment", name="Create Shipment", description="Create Shipment From Order Line", dataType=FlyDataType.Button, entityType="D", printName="Create Shipment", fieldLength=1)
	createShipment,
	//
	@FlyElement(columnName="CreateSO", name="Create SO", dataType=FlyDataType.Button, entityType="D", printName="Create SO", fieldLength=1)
	createSO,
	//
	@FlyElement(columnName="Creator", name="Creator", dataType=FlyDataType.String, entityType="D", printName="Creator", fieldLength=120)
	creator,
	//
	@FlyElement(columnName="CreatorContact", name="CreatorContact", dataType=FlyDataType.Text, entityType="D", printName="CreatorContact", fieldLength=510)
	creatorContact,
	//
	@FlyElement(columnName="C_Receivable_Acct", name="客户应收帐款", description="Account for Customer Receivables", help="The Customer Receivables Accounts indicates the account to be used for recording transaction for customers receivables.", dataType=FlyDataType.Account, entityType="D", printName="客户应收帐款", fieldLength=22)
	cReceivableAcct,
	//
	@FlyElement(columnName="C_Receivable_Services_Acct", name="Receivable Services", description="Customer Accounts Receivables Services Account", help="Account to post services related Accounts Receivables if you want to differentiate between Services and Product related revenue. This account is only used, if posting to service accounts is enabled in the accounting schema.", dataType=FlyDataType.Account, entityType="D", printName="AR Services", fieldLength=10)
	cReceivableServicesAcct,
	//
	@FlyElement(columnName="C_Recurring_ID", name="重新开始", description="重新开始文件", help="重新开始文件", dataType=FlyDataType.TableDirect, entityType="D", printName="重新开始", fieldLength=22)
	cRecurringID,
	//
	@FlyElement(columnName="C_Recurring_Run_ID", name="重新开始运行", description="重新开始文件运行", help="History of Recurring Document Generation", dataType=FlyDataType.ID, entityType="D", printName="重新开始运行", fieldLength=22)
	cRecurringRunID,
	//
	@FlyElement(columnName="CreditCardExpMM", name="Exp. Month", description="期满月", help="The Expiry Month indicates the expiry month for this credit card.", dataType=FlyDataType.Integer, entityType="D", printName="Exp. Month", fieldLength=22)
	creditCardExpMM,
	//
	@FlyElement(columnName="CreditCardExpYY", name="Exp. Year", description="期满年", help="The Expiry Year indicates the expiry year for this credit card.", dataType=FlyDataType.Integer, entityType="D", printName="Exp. Year", fieldLength=22)
	creditCardExpYY,
	//
	@FlyElement(columnName="CreditCardNumber", name="卡号", description="信用卡号", help="The Credit Card number indicates the number on the credit card, without blanks or spaces.", dataType=FlyDataType.String, entityType="D", printName="卡号", fieldLength=20)
	creditCardNumber,
	//
	@FlyElement(columnName="CreditCardType", name="信用卡", description="Credit Card (Visa, MC, AmEx)", help="The Credit Card drop down list box is used for selecting the type of Credit Card presented for payment.", dataType=FlyDataType.List, entityType="D", printName="信用卡", fieldLength=1)
	creditCardType,
	//
	@FlyElement(columnName="CreditCardVV", name="信用卡确认", description="Verification code on credit card", help="The Credit Card Verification indicates the verification code on the credit card (AMEX 4 digits on front; MC,Visa 3 digits back)", dataType=FlyDataType.String, entityType="D", printName="信用卡确认", fieldLength=4)
	creditCardVV,
	//
	@FlyElement(columnName="CreditLimit", name="信用额度", description="信用的金额允许", help="The Credit Limit field indicates the credit limit for this account.", dataType=FlyDataType.Number, entityType="D", printName="信用额度", fieldLength=22)
	creditLimit,
	//
	@FlyElement(columnName="CreditWatchPercent", name="Credit Watch %", description="Credit Watch - Percent of Credit Limit when OK switches to Watch", help="If Adempiere maintains credit status, the status 'Credit OK' is moved to 'Credit Watch' if the credit available reaches the percent entered.  If not defined, 90% is used.", dataType=FlyDataType.Number, entityType="D", printName="Credit Watch %", fieldLength=22)
	creditWatchPercent,
	//
	@FlyElement(columnName="C_Region_ID", name="区域", description="Identifies a geographical Region", help="The Region identifies a unique Region for this Country.", dataType=FlyDataType.TableDirect, entityType="D", printName="区域", fieldLength=22)
	cRegionID,
	//
	@FlyElement(columnName="C_Remuneration_ID", name="Remuneration", description="Wage or Salary", dataType=FlyDataType.ID, entityType="D", printName="Remuneration", fieldLength=10)
	cRemunerationID,
	//
	@FlyElement(columnName="C_RevenueRecognition_ID", name="收入确认", description="记录的收入方法", help="The Revenue Recognition indicates how revenue will be recognized for this product", dataType=FlyDataType.TableDirect, entityType="D", printName="收入确认", fieldLength=22)
	cRevenueRecognitionID,
	//
	@FlyElement(columnName="C_RevenueRecognition_Plan_ID", name="收入确认计划", description="Plan for recognizing or recording revenue", help="The Revenue Recognition Plan identifies a unique Revenue Recognition Plan.", dataType=FlyDataType.TableDirect, entityType="D", printName="收入确认计划", fieldLength=22)
	cRevenueRecognitionPlanID,
	//
	@FlyElement(columnName="C_RevenueRecognition_Run_ID", name="收入确认运行", description="Revenue Recognition Run or Process", help="The Revenue Recognition Runs identifies a unique instance of processing revenue recognition.", dataType=FlyDataType.ID, entityType="D", printName="收入确认运行", fieldLength=22)
	cRevenueRecognitionRunID,
	//
	@FlyElement(columnName="C_RfQ_ID", name="RfQ", description="Request for Quotation", help="Request for Quotation to be sent out to vendors of a RfQ Topic. After Vendor selection, optionally create Sales Order or Quote for Customer as well as Purchase Order  for Vendor(s)", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ", fieldLength=22)
	cRfQID,
	//
	@FlyElement(columnName="C_RfQLine_ID", name="RfQ Line", description="Request for Quotation Line", help="Request for Quotation Line", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Line", fieldLength=22)
	cRfQLineID,
	//
	@FlyElement(columnName="C_RfQLineQty_ID", name="RfQ Line Quantity", description="Request for Quotation Line Quantity", help="You may request a quotation for different quantities", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Line Qty", fieldLength=22)
	cRfQLineQtyID,
	//
	@FlyElement(columnName="C_RfQResponse_ID", name="RfQ Response", description="Request for Quotation Response from a potential Vendor", help="Request for Quotation Response from a potential Vendor", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Response", fieldLength=22)
	cRfQResponseID,
	//
	@FlyElement(columnName="C_RfQResponseLine_ID", name="RfQ Response Line", description="Request for Quotation Response Line", help="Request for Quotation Response Line from a potential Vendor", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Response Line", fieldLength=22)
	cRfQResponseLineID,
	//
	@FlyElement(columnName="C_RfQResponseLineQty_ID", name="RfQ Response Line Qty", description="Request for Quotation Response Line Quantity", help="Request for Quotation Response Line Quantity from a potential Vendor", dataType=FlyDataType.ID, entityType="D", printName="RfQ Response Line Qty", fieldLength=22)
	cRfQResponseLineQtyID,
	//
	@FlyElement(columnName="C_RfQ_Topic_ID", name="RfQ Topic", description="Topic for Request for Quotations", help="A Request for Quotation Topic allows you to maintain a subscriber list of potential Vendors to respond to RfQs", dataType=FlyDataType.TableDirect, entityType="D", printName="RfQ Topic", fieldLength=22)
	cRfQTopicID,
	//
	@FlyElement(columnName="C_RfQ_TopicSubscriber_ID", name="RfQ Subscriber", description="Request for Quotation Topic Subscriber", help="Subcriber to invite to respond to RfQs", dataType=FlyDataType.ID, entityType="D", printName="RfQ Subscriber", fieldLength=22)
	cRfQTopicSubscriberID,
	//
	@FlyElement(columnName="C_RfQ_TopicSubscriberOnly_ID", name="RfQ Topic Subscriber Restriction", description="Include Subscriber only for certain products or product categories", help="Products and/or  Product Categories for which the subscriber should be included.  If no product / category is entered, the subscriber is requested to answer requests for all lines in a RfQ", dataType=FlyDataType.ID, entityType="D", printName="RfQ Topic Subscriber Only", fieldLength=22)
	cRfQTopicSubscriberOnlyID,
	//
	@FlyElement(columnName="CronPattern", name="Cron Scheduling Pattern", description="Cron pattern to define when the process should be invoked.", help="Cron pattern to define when the process should be invoked. See http://en.wikipedia.org/wiki/Cron#crontab_syntax for cron scheduling syntax and example.", dataType=FlyDataType.String, entityType="D", printName="Cron Scheduling Pattern", fieldLength=255)
	cronPattern,
	//
	@FlyElement(columnName="C_SalesDashboard_ID", name="Sales Dashboard", dataType=FlyDataType.NONE, entityType="D", printName="Sales Dashboard", fieldLength=0)
	cSalesDashboardID,
	//
	@FlyElement(columnName="C_SalesRegion_ID", name="销售区域", description="销售报导区域", help="The Sales Region indicates a specific area of sales coverage.", dataType=FlyDataType.ID, entityType="D", printName="销售区域", fieldLength=22)
	cSalesRegionID,
	//
	@FlyElement(columnName="C_SalesStage_ID", name="Sales Stage", description="Stages of the sales process", help="Define what stages your sales process will move through", dataType=FlyDataType.NONE, entityType="D", printName="Sales Stage", fieldLength=0)
	cSalesStageID,
	//
	@FlyElement(columnName="C_ServiceLevel_ID", name="服务水平", description="Product Revenue Recognition Service Level ", help="The Service Level defines a unique Service Level.", dataType=FlyDataType.ID, entityType="D", printName="服务水平", fieldLength=22)
	cServiceLevelID,
	//
	@FlyElement(columnName="C_ServiceLevelLine_ID", name="服务水平明细", description="Product Revenue Recognition Service Level Line", help="The Service Level Line indicates a unique instance in a Service Level", dataType=FlyDataType.ID, entityType="D", printName="服务水平明细", fieldLength=22)
	cServiceLevelLineID,
	//
	@FlyElement(columnName="C_SubAcct_ID", name="Sub Account", description="Sub account for Element Value", help="The Element Value (e.g. Account) may have optional sub accounts for further detail. The sub account is dependent on the value of the account, so a further specification. If the sub-accounts are more or less the same, consider using another accounting dimension.", dataType=FlyDataType.ID, entityType="D", printName="Sub Acct", fieldLength=10)
	cSubAcctID,
	//
	@FlyElement(columnName="C_Subscription_Delivery_ID", name="Subscription Delivery", description="Optional Delivery Record for a Subscription", help="Record of deliveries for a subscription", dataType=FlyDataType.ID, entityType="D", printName="Subscription Delivery", fieldLength=22)
	cSubscriptionDeliveryID,
	//
	@FlyElement(columnName="C_Subscription_ID", name="Subscription", description="Subscription of a Business Partner of a Product to renew", help="Subscription of a Business Partner of a Product to renew", dataType=FlyDataType.TableDirect, entityType="D", printName="Subscription", fieldLength=22)
	cSubscriptionID,
	//
	@FlyElement(columnName="C_SubscriptionType_ID", name="Subscription Type", description="Type of subscription", help="Subscription type and renewal frequency", dataType=FlyDataType.TableDirect, entityType="D", printName="Subscription Type", fieldLength=22)
	cSubscriptionTypeID,
	//
	@FlyElement(columnName="C_Task_ID", name="标准任务", description="项目类型任务模板", help="Standard Project Task in a Project Phase.", dataType=FlyDataType.ID, entityType="D", printName="标准任务", fieldLength=22)
	cTaskID,
	//
	@FlyElement(columnName="C_TaxCategory_ID", name="税分类", description="税分类", help="The Tax Category provides a method of grouping similar taxes.  For example, Sales Tax or Value Added Tax.", dataType=FlyDataType.TableDirect, entityType="D", printName="税分类", fieldLength=22)
	cTaxCategoryID,
	//
	@FlyElement(columnName="C_TaxDeclarationAcct_ID", name="Tax Declaration Accounting", description="Tax Accounting Reconciliation ", help="Accounting related information for reconciliation with documents. It includes all revenue/expense and tax entries as a base for detail reporting", dataType=FlyDataType.ID, entityType="D", printName="Tax Declaration Acct", fieldLength=10)
	cTaxDeclarationAcctID,
	//
	@FlyElement(columnName="C_TaxDeclaration_ID", name="Tax Declaration", description="Define the declaration to the tax authorities", help="The tax declaration allows you to create supporting information and reconcile the documents with the accounting", dataType=FlyDataType.ID, entityType="D", printName="Tax Declaration", fieldLength=10)
	cTaxDeclarationID,
	//
	@FlyElement(columnName="C_TaxDeclarationLine_ID", name="Tax Declaration Line", description="Tax Declaration Document Information", help="The lines are created by the create process. You can delete them if you do not want to include them in a particular declaration. ", dataType=FlyDataType.ID, entityType="D", printName="Tax Declaration Line", fieldLength=10)
	cTaxDeclarationLineID,
	//
	@FlyElement(columnName="C_Tax_ID", name="税", description="税标识符", help="The Tax indicates the type of tax for this document line.", dataType=FlyDataType.TableDirect, entityType="D", printName="税", fieldLength=22)
	cTaxID,
	//
	@FlyElement(columnName="C_TaxPostal_ID", name="Tax ZIP", description="Tax Postal/ZIP", help="For local tax, you may have to define a list of (ranges of) postal codes or ZIPs", dataType=FlyDataType.ID, entityType="D", printName="Tax ZIP", fieldLength=22)
	cTaxPostalID,
	//
	@FlyElement(columnName="C_TemplateBPartner_ID", name="Template BPartner", description="BPartner that is to be used as template when new customers are created", dataType=FlyDataType.Table, entityType="D", printName="Template BPartner", fieldLength=22)
	cTemplateBPartnerID,
	//
	@FlyElement(columnName="CumulatedAmt", name="Accumulated Amt", description="Total Amount", help="Sum of all amounts", dataType=FlyDataType.Amount, entityType="D", printName="Accumulated Amt", fieldLength=22)
	cumulatedAmt,
	//
	@FlyElement(columnName="CumulatedAmtLL", name="Accumulated Amt LL", description="Total Amount", help="Sum of all amounts", dataType=FlyDataType.NONE, entityType="D", printName="Accumulated Amt Lower Lavel", fieldLength=0)
	cumulatedAmtLL,
	//
	@FlyElement(columnName="CumulatedQty", name="Accumulated Qty", description="Total Quantity", help="Sum of the quantities", dataType=FlyDataType.Quantity, entityType="D", printName="Accumulated Qty", fieldLength=22)
	cumulatedQty,
	//
	@FlyElement(columnName="CumulativeLevel", name="累计级别", description="累计计算的级别", dataType=FlyDataType.List, entityType="D", printName="累计级别", fieldLength=1)
	cumulativeLevel,
	//
	@FlyElement(columnName="C_UOM_Conversion_ID", name="度量单位转换", description="度量单位转变", help="The UOM Conversion identifies a unique to and from Unit of Measure, conversion rate and conversion date range.", dataType=FlyDataType.ID, entityType="D", printName="度量单位转换", fieldLength=22)
	cUOMConversionID,
	//
	@FlyElement(columnName="C_UOM_ID", name="度量单位", description="度量单位", help="The UOM defines a unique non monetary Unit of Measure", dataType=FlyDataType.ID, entityType="D", printName="度量单位", fieldLength=22)
	cUOMID,
	//
	@FlyElement(columnName="C_UOM_Length_ID", name="长度单位", description="Standard Unit of Measure for Length", help="The Standard UOM for Length indicates the UOM to use for products referenced by length in a document.", dataType=FlyDataType.Table, entityType="D", printName="长度单位", fieldLength=22)
	cUOMLengthID,
	//
	@FlyElement(columnName="C_UOM_Time_ID", name="时间单位", description="Standard Unit of Measure for Time", help="The Standard UOM for Time indicates the UOM to use for products referenced by time in a document.", dataType=FlyDataType.Table, entityType="D", printName="时间单位", fieldLength=22)
	cUOMTimeID,
	//
	@FlyElement(columnName="C_UOM_To_ID", name="UoM 到", description="Target or destination Unit of Measure", help="The UOM To indicates the destination UOM for a UOM Conversion pair.", dataType=FlyDataType.Table, entityType="D", printName="UoM 到", fieldLength=22)
	cUOMToID,
	//
	@FlyElement(columnName="C_UOM_Volume_ID", name="体积单位", description="Standard Unit of Measure for Volume", help="The Standard UOM for Volume indicates the UOM to use for products referenced by volume in a document.", dataType=FlyDataType.Table, entityType="D", printName="体积单位", fieldLength=22)
	cUOMVolumeID,
	//
	@FlyElement(columnName="C_UOM_Weight_ID", name="重量单位", description="Standard Unit of Measure for Weight", help="The Standard UOM for Weight indicates the UOM to use for products referenced by weight in a document.", dataType=FlyDataType.Table, entityType="D", printName="重量单位", fieldLength=22)
	cUOMWeightID,
	//
	@FlyElement(columnName="CurrencyBalancing_Acct", name="Currency Balancing Acct", description="Account used when a currency is out of balance", help="The Currency Balancing Account indicates the account to used when a currency is out of balance (generally due to rounding)", dataType=FlyDataType.Account, entityType="D", printName="Currency Balancing Acct", fieldLength=22)
	currencyBalancingAcct,
	//
	@FlyElement(columnName="CurrencyRate", name="汇率", description="币种汇率", help="The Currency Conversion Rate indicates the rate to use when converting the source currency to the accounting currency", dataType=FlyDataType.Number, entityType="D", printName="汇率", fieldLength=22)
	currencyRate,
	//
	@FlyElement(columnName="CurrencyRateType", name="CurrencyRateType", dataType=FlyDataType.List, entityType="D", printName="CurrencyRateType", fieldLength=1)
	currencyRateType,
	//
	@FlyElement(columnName="CurrencyType", name="币种类型", dataType=FlyDataType.List, entityType="D", printName="币种类型", fieldLength=1)
	currencyType,
	//
	@FlyElement(columnName="CurrentBalance", name="当前余款", description="当前余款", help="The Current Balance field indicates the current balance in this account.", dataType=FlyDataType.Number, entityType="D", printName="当前余款", fieldLength=22)
	currentBalance,
	//
	@FlyElement(columnName="CurrentCostPrice", name="当前成本价格", description="那现在使用过的成本价格", dataType=FlyDataType.CostsPrices, entityType="D", printName="当前成本价格", fieldLength=22)
	currentCostPrice,
	//
	@FlyElement(columnName="currentcostvalue", name="currentcostvalue", dataType=FlyDataType.NONE, entityType="D", printName="currentcostvalue", fieldLength=0)
	currentcostvalue,
	//
	@FlyElement(columnName="CurrentNext", name="现在的下一个", description="下一个用到的数字", help="The Current Next indicates the next number to use for this document", dataType=FlyDataType.Integer, entityType="D", printName="现在的下一个", fieldLength=22)
	currentNext,
	//
	@FlyElement(columnName="CurrentNextSys", name="现在的下一个", description="下一个序列为系统使用", help="This field is for system use only and should not be modified.", dataType=FlyDataType.Integer, entityType="D", printName="现在的下一个", fieldLength=22)
	currentNextSys,
	//
	@FlyElement(columnName="CurrentQty", name="Current Quantity", description="Current Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Current Qty", fieldLength=22)
	currentQty,
	//
	@FlyElement(columnName="CurSymbol", name="符号", description="Symbol of the currency (opt used for printing only)", help="The Currency Symbol defines the symbol that will print when this currency is used.", dataType=FlyDataType.String, entityType="D", printName="币种", fieldLength=10)
	curSymbol,
	//
	@FlyElement(columnName="C_UserRemuneration_ID", name="Employee Remuneration", description="Employee Wage or Salary Overwrite", help="Overwrite the standard Remuneration", dataType=FlyDataType.ID, entityType="D", printName="Employee Remuneration", fieldLength=10)
	cUserRemunerationID,
	//
	@FlyElement(columnName="CustomerNo", name="客户号", description="EDI 确认数字 ", dataType=FlyDataType.String, entityType="D", printName="客户号", fieldLength=20)
	customerNo,
	//
	@FlyElement(columnName="CustomerOpenInvoices", name="Customer Open Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Customer Open Invoices", fieldLength=0)
	customerOpenInvoices,
	//
	@FlyElement(columnName="CustomPrefix", name="Custom Prefix", description="Prefix for Custom entities", help="The prefix listed are ignored as customization for database or entity migration", dataType=FlyDataType.String, entityType="D", printName="Custom Prefix", fieldLength=60)
	customPrefix,
	//
	@FlyElement(columnName="C_ValidCombination_ID", name="组合", description="有效的帐户组合", help="The Combination identifies a valid combination of element which represent a GL account.", dataType=FlyDataType.ID, entityType="D", printName="组合", fieldLength=22)
	cValidCombinationID,
	//
	@FlyElement(columnName="C_Withholding_ID", name="扣留", description="扣留类型定义", help="The Withholding indicates the type of withholding to be calculated.", dataType=FlyDataType.TableDirect, entityType="D", printName="扣留", fieldLength=22)
	cWithholdingID,
	//
	@FlyElement(columnName="CycleName", name="Cycle Name", description="Name of the Project Cycle", dataType=FlyDataType.String, entityType="D", printName="Cycle", fieldLength=60)
	cycleName,
	//
	@FlyElement(columnName="CycleStepName", name="Cycle Step Name", description="Name of the Prohect Cycle Step", dataType=FlyDataType.String, entityType="D", printName="Cycle Step", fieldLength=60)
	cycleStepName,
	//
	@FlyElement(columnName="C_Year_ID", name="年", description="日历年", help="The Year uniquely identifies an accounting year for a calendar.", dataType=FlyDataType.TableDirect, entityType="D", printName="年", fieldLength=22)
	cYearID,
	//
	@FlyElement(columnName="Data1_PrintFormatItem_ID", name="数据列 2", description="数据列为线制成图表", help="Additional Graph Data Column for Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列 2", fieldLength=22)
	data1PrintFormatItemID,
	//
	@FlyElement(columnName="Data2_PrintFormatItem_ID", name="数据列 3", description="数据列为线制成图表", help="Additional Graph Data Column for Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列 3", fieldLength=22)
	data2PrintFormatItemID,
	//
	@FlyElement(columnName="Data3_PrintFormatItem_ID", name="数据列 4", description="数据列为线制成图表", help="Additional Graph Data Column for Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列 4", fieldLength=22)
	data3PrintFormatItemID,
	//
	@FlyElement(columnName="Data4_PrintFormatItem_ID", name="数据列 5", description="数据列为线制成图表", help="Additional Graph Data Column for Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列 5", fieldLength=22)
	data4PrintFormatItemID,
	//
	@FlyElement(columnName="DatabaseInfo", name="Database", description="Database Information", dataType=FlyDataType.String, entityType="D", printName="Database", fieldLength=255)
	databaseInfo,
	//
	@FlyElement(columnName="DataFormat", name="数据格式", description="Format String in Java Notation, e.g. ddMMyy", help="The Date Format indicates how dates are defined on the record to be imported.  It must be in Java Notation", dataType=FlyDataType.String, entityType="D", printName="数据格式", fieldLength=20)
	dataFormat,
	//
	@FlyElement(columnName="Data_PrintFormatItem_ID", name="数据列", description="Data Column for Pie and Line Charts", help="Graph Data Column for Pie and Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="数据列", fieldLength=22)
	dataPrintFormatItemID,
	//
	@FlyElement(columnName="DataType", name="数据类型", description="数据的类型", dataType=FlyDataType.List, entityType="D", printName="数据类型", fieldLength=1)
	dataType,
	//
	@FlyElement(columnName="Date1", name="日期", description="Date when business is not conducted", help="The Date field identifies a calendar date on which business will not be conducted.", dataType=FlyDataType.Date, entityType="D", printName="日期", fieldLength=7)
	date1,
	//
	@FlyElement(columnName="DateAcct", name="记账日期", description="记账日期", help="The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document", dataType=FlyDataType.Date, entityType="D", printName="记账日期", fieldLength=7)
	dateAcct,
	//
	@FlyElement(columnName="DateAcct2", name="DateAcct2", dataType=FlyDataType.NONE, entityType="D", printName="DateAcct2", fieldLength=0)
	dateAcct2,
	//
	@FlyElement(columnName="DateColumn", name="日期列", description="完全合格日期列", help="The Date Column indicates the date to be used when calculating this measurement", dataType=FlyDataType.String, entityType="D", printName="日期列", fieldLength=60)
	dateColumn,
	//
	@FlyElement(columnName="DateCompletePlan", name="Complete Plan", description="Planned Completion Date", help="Date when the task is planned to be complete", dataType=FlyDataType.Date, entityType="D", printName="Complete Plan", fieldLength=7)
	dateCompletePlan,
	//
	@FlyElement(columnName="DateConfirm", name="Date Confirm", description="Date Confirm of this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Confirm", fieldLength=29)
	dateConfirm,
	//
	@FlyElement(columnName="DateContract", name="契约日期", description="The (planned) effective date of this document.", help="The contract date is used to determine when the document becomes effective. This is usually the contract date.  The contract date is used in reports and report parameters.", dataType=FlyDataType.Date, entityType="D", printName="契约日期", fieldLength=7)
	dateContract,
	//
	@FlyElement(columnName="DateDelivered", name="配送日期", description="Date when the product was delivered", dataType=FlyDataType.Date, entityType="D", printName="配送日期", fieldLength=7)
	dateDelivered,
	//
	@FlyElement(columnName="DateDoc", name="文件日期", description="文件的日期", help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.", dataType=FlyDataType.Date, entityType="D", printName="文件日期", fieldLength=7)
	dateDoc,
	//
	@FlyElement(columnName="DateExpense", name="费用日期", description="费用日期", help="费用日期", dataType=FlyDataType.Date, entityType="D", printName="费用日期", fieldLength=7)
	dateExpense,
	//
	@FlyElement(columnName="DateFinish", name="完成日期", description="Finish or (planned) completion date", help="The finish date is used to indicate when the project is expected to be completed or has been completed.", dataType=FlyDataType.Date, entityType="D", printName="完成日期", fieldLength=7)
	dateFinish,
	//
	@FlyElement(columnName="DateFinishSchedule", name="Date Finish Schedule", description="Scheduled Finish date for this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Finish Schedule", fieldLength=29)
	dateFinishSchedule,
	//
	@FlyElement(columnName="DateFormat", name="Date Format", description="Date format used in the imput format", help="The date format is usually detected, but sometimes need to be defined.", dataType=FlyDataType.String, entityType="D", printName="Date Format", fieldLength=20)
	dateFormat,
	//
	@FlyElement(columnName="DateFrom", name="开始日期", description="出发日期为范围", help="The Date From indicates the starting date of a range.", dataType=FlyDataType.Date, entityType="D", printName="开始日期", fieldLength=7)
	dateFrom,
	//
	@FlyElement(columnName="DateInvited", name="Invited", description="Date when (last) invitation was sent", dataType=FlyDataType.Date, entityType="D", printName="Invited", fieldLength=7)
	dateInvited,
	//
	@FlyElement(columnName="DateInvoiced", name="发票日期", description="发票打印日期", help="The Date Invoice indicates the date printed on the invoice.", dataType=FlyDataType.Date, entityType="D", printName="发票日期", fieldLength=7)
	dateInvoiced,
	//
	@FlyElement(columnName="DateLastAction", name="最近动作日期", description="Date this request was last acted on", help="The Date Last Action indicates that last time that the request was acted on.", dataType=FlyDataType.DateTime, entityType="D", printName="最近动作日期", fieldLength=7)
	dateLastAction,
	//
	@FlyElement(columnName="DateLastAlert", name="上次警报日期", description="上次发出警报的日期", help="The last alert date is updated when a reminder email is sent", dataType=FlyDataType.DateTime, entityType="D", printName="上次警报日期", fieldLength=7)
	dateLastAlert,
	//
	@FlyElement(columnName="DateLastInventory", name="最近盘点日期", description="最近盘点日期", help="The Date Last Inventory Count indicates the last time an Inventory count was done.", dataType=FlyDataType.Date, entityType="D", printName="最近盘点日期", fieldLength=7)
	dateLastInventory,
	//
	@FlyElement(columnName="DateLastRun", name="最近运行日期", description="Date the process was last run.", help="The Date Last Run indicates the last time that a process was run.", dataType=FlyDataType.DateTime, entityType="D", printName="最近运行日期", fieldLength=7)
	dateLastRun,
	//
	@FlyElement(columnName="DateNextAction", name="下次运行日期", description="Date that this request should be acted on", help="The Date Next Action indicates the next scheduled date for an action to occur for this request.", dataType=FlyDataType.DateTime, entityType="D", printName="下次运行日期", fieldLength=7)
	dateNextAction,
	//
	@FlyElement(columnName="DateNextRun", name="下次运行日期", description="Date the process will run next", help="The Date Next Run indicates the next time this process will run.", dataType=FlyDataType.DateTime, entityType="D", printName="下次运行日期", fieldLength=7)
	dateNextRun,
	//
	@FlyElement(columnName="DateOrdered", name="定单日期", description="定单日期", help="Indicates the Date an item was ordered.", dataType=FlyDataType.Date, entityType="D", printName="定单日期", fieldLength=7)
	dateOrdered,
	//
	@FlyElement(columnName="DatePattern", name="Date Pattern", description="Java Date Pattern", help="Option Date pattern in Java notation. Examples: dd.MM.yyyy - dd/MM/yyyy If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.String, entityType="D", printName="Date Pattern", fieldLength=20)
	datePattern,
	//
	@FlyElement(columnName="DatePrinted", name="打印日期", description="Date the document was printed.", help="Indicates the Date that a document was printed.", dataType=FlyDataType.Date, entityType="D", printName="打印日期", fieldLength=7)
	datePrinted,
	//
	@FlyElement(columnName="DatePromised", name="允诺日期", description="定单允诺日期", help="The Date Promised indicates the date, if any, that an Order was promised for.", dataType=FlyDataType.Date, entityType="D", printName="允诺日期", fieldLength=7)
	datePromised,
	//
	@FlyElement(columnName="DateReceived", name="收到日期", description="产品收到日", help="The Date Received indicates the date that product was received.", dataType=FlyDataType.Date, entityType="D", printName="收到日期", fieldLength=7)
	dateReceived,
	//
	@FlyElement(columnName="DateReport", name="报表日期", description="Expense Time Report Date", help="Date of Expense Time Report", dataType=FlyDataType.Date, entityType="D", printName="报表日期", fieldLength=7)
	dateReport,
	//
	@FlyElement(columnName="DateRequired", name="Date Required", description="Date when required", dataType=FlyDataType.Date, entityType="D", printName="Date Required", fieldLength=7)
	dateRequired,
	//
	@FlyElement(columnName="DateResponse", name="Response Date", description="Date of the Response", help="Date of the Response", dataType=FlyDataType.Date, entityType="D", printName="Response Date", fieldLength=7)
	dateResponse,
	//
	@FlyElement(columnName="DateReval", name="Revaluation Date", description="Date of Revaluation", dataType=FlyDataType.Date, entityType="D", printName="Reval Date", fieldLength=7)
	dateReval,
	//
	@FlyElement(columnName="DateSimulation", name="Date Simulation", description="Simulation date for this Material Plan", dataType=FlyDataType.DateTime, entityType="D", printName="Date Simulation", fieldLength=29)
	dateSimulation,
	//
	@FlyElement(columnName="DateStart", name="Date Start", description="Date Start for this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Start", fieldLength=29)
	dateStart,
	//
	@FlyElement(columnName="DateStartPlan", name="Start Plan", description="Planned Start Date", help="Date when you plan to start", dataType=FlyDataType.Date, entityType="D", printName="Start Plan", fieldLength=7)
	dateStartPlan,
	//
	@FlyElement(columnName="DateStartSchedule", name="Date Start Schedule", description="Scheduled start date for this Order", dataType=FlyDataType.DateTime, entityType="D", printName="Date Start Schedule", fieldLength=29)
	dateStartSchedule,
	//
	@FlyElement(columnName="DateTo", name="结束日期", description="结束一日期范围的日期", help="The Date To indicates the end date of a range (inclusive)", dataType=FlyDataType.Date, entityType="D", printName="结束日期", fieldLength=7)
	dateTo,
	//
	@FlyElement(columnName="DateTrx", name="交易日期", description="交易日期", help="The Transaction Date indicates the date of the transaction.", dataType=FlyDataType.Date, entityType="D", printName="交易日期", fieldLength=7)
	dateTrx,
	//
	@FlyElement(columnName="DateValue", name="估价日期", description="估价日期", dataType=FlyDataType.Date, entityType="D", printName="估价日期", fieldLength=7)
	dateValue,
	//
	@FlyElement(columnName="DateWorkComplete", name="Work Complete", description="Date when work is (planned to be) complete", dataType=FlyDataType.Date, entityType="D", printName="Work Complete", fieldLength=7)
	dateWorkComplete,
	//
	@FlyElement(columnName="DateWorkStart", name="Work Start", description="Date when work is (planned to be) started", dataType=FlyDataType.Date, entityType="D", printName="Work Start", fieldLength=7)
	dateWorkStart,
	//
	@FlyElement(columnName="DaysAfterDue", name="到期天后天数", description="到期天后开始催讨天数", help="The Days After Due Date indicates the number of days after the payment due date to initiate dunning.", dataType=FlyDataType.Number, entityType="D", printName="到期天后天数", fieldLength=22)
	daysAfterDue,
	//
	@FlyElement(columnName="DaysBetweenDunning", name="催讨间隔", description="Days between sending dunning notices", help="The Days Between Dunning indicates the number of days between sending dunning notices.", dataType=FlyDataType.Integer, entityType="D", printName="催讨间隔", fieldLength=22)
	daysBetweenDunning,
	//
	@FlyElement(columnName="DaysDue", name="到期天数", description="Number of days due (negative: due in number of days)", dataType=FlyDataType.Integer, entityType="D", printName="到期天数", fieldLength=22)
	daysDue,
	//
	@FlyElement(columnName="DaysFrom", name="Days From", dataType=FlyDataType.Integer, entityType="D", printName="Days From", fieldLength=0)
	daysFrom,
	//
	@FlyElement(columnName="DaysTo", name="Days To", dataType=FlyDataType.Integer, entityType="D", printName="Days To", fieldLength=0)
	daysTo,
	//
	@FlyElement(columnName="DBAddress", name="数据库服务器地址", description="Address of the database server", dataType=FlyDataType.String, entityType="D", printName="DB服务器地址", fieldLength=255)
	dBAddress,
	//
	@FlyElement(columnName="DBInstance", name="数据库名", description="Database Name", dataType=FlyDataType.String, entityType="D", printName="数据库名", fieldLength=60)
	dBInstance,
	//
	@FlyElement(columnName="DBType", name="DBType", dataType=FlyDataType.List, entityType="D", printName="DBType", fieldLength=22)
	dBType,
	//
	@FlyElement(columnName="DecimalPattern", name="Decimal Pattern", description="Java Decimal Pattern", help="Option Decimal pattern in Java notation. Examples: 0000 will format 23 to 0023", dataType=FlyDataType.String, entityType="D", printName="Decimal Pattern", fieldLength=40)
	decimalPattern,
	//
	@FlyElement(columnName="DecimalPoint", name="小数点", description="Decimal Point in the data file - if any", dataType=FlyDataType.String, entityType="D", printName="小数点", fieldLength=1)
	decimalPoint,
	//
	@FlyElement(columnName="DecisionDate", name="Decision date", dataType=FlyDataType.Date, entityType="D", printName="Decision date", fieldLength=7)
	decisionDate,
	//
	@FlyElement(columnName="Default_Account", name="缺省帐户", description="Name of the Default Account Column", dataType=FlyDataType.String, entityType="D", printName="缺省帐户", fieldLength=30)
	defaultAccount,
	//
	@FlyElement(columnName="Default_AD_PrintColor_ID", name="Default Print Color", dataType=FlyDataType.Table, entityType="D", printName="Default Print Color", fieldLength=22)
	defaultADPrintColorID,
	//
	@FlyElement(columnName="Default_AD_PrintFont_ID", name="Default Print Font", dataType=FlyDataType.Table, entityType="D", printName="Default Print Font", fieldLength=22)
	defaultADPrintFontID,
	//
	@FlyElement(columnName="DefaultValue", name="缺省逻辑", description="Default value hierarchy, separated by ;", help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.", dataType=FlyDataType.Text, entityType="D", printName="缺省逻辑", fieldLength=2000)
	defaultValue,
	//
	@FlyElement(columnName="DefaultValue2", name="缺省逻辑 2", description="Default value hierarchy, separated by ;", help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.", dataType=FlyDataType.String, entityType="D", printName="缺省逻辑 2", fieldLength=2000)
	defaultValue2,
	//
	@FlyElement(columnName="DefiniteSequence_ID", name="Definite Sequence", dataType=FlyDataType.Table, entityType="D", printName="Definite Sequence", fieldLength=22)
	definiteSequenceID,
	//
	@FlyElement(columnName="DeleteOld", name="删除旧记录", description="Otherwise records will be added", dataType=FlyDataType.NONE, entityType="D", printName="删除旧记录", fieldLength=0)
	deleteOld,
	//
	@FlyElement(columnName="DeleteOldImported", name="删除以前导入了记录", description="Before processing delete old imported records in the import table", dataType=FlyDataType.NONE, entityType="D", printName="删除以前导入", fieldLength=0)
	deleteOldImported,
	//
	@FlyElement(columnName="DeletePosting", name="删除已存在会计分录", description="The selected accounting entries will be deleted!  DANGEROUS !!!", dataType=FlyDataType.NONE, entityType="D", printName="删除已存在会计分录", fieldLength=0)
	deletePosting,
	//
	@FlyElement(columnName="DeliveryConfirmation", name="配送确认", description="发电子邮件给配送证实", dataType=FlyDataType.String, entityType="D", printName="配送确认", fieldLength=120)
	deliveryConfirmation,
	//
	@FlyElement(columnName="DeliveryCount", name="Delivery Count", description="Number of Deliveries", dataType=FlyDataType.Integer, entityType="D", printName="Delivery Count", fieldLength=22)
	deliveryCount,
	//
	@FlyElement(columnName="DeliveryDays", name="Delivery Days", description="Number of Days (planned) until Delivery", dataType=FlyDataType.Integer, entityType="D", printName="Delivery Days", fieldLength=22)
	deliveryDays,
	//
	@FlyElement(columnName="DeliveryRule", name="配送规则", description="Defines the timing of Delivery", help="The Delivery Rule indicates when an order should be delivered. For example should the order be delivered when the entire order is complete, when a line is complete or as the products become available.", dataType=FlyDataType.List, entityType="D", printName="配送规则", fieldLength=1)
	deliveryRule,
	//
	@FlyElement(columnName="DeliveryTime_Actual", name="实际配送时间", description="Actual days between order and delivery", help="The Actual Delivery Time indicates the number of days elapsed between placing an order and the delivery of the order", dataType=FlyDataType.Integer, entityType="D", printName="实际配送时间", fieldLength=22)
	deliveryTimeActual,
	//
	@FlyElement(columnName="DeliveryTime_Promised", name="允诺配送时间", description="Promised days between order and delivery", help="The Promised Delivery Time indicates the number of days between the order date and the date that delivery was promised.", dataType=FlyDataType.Integer, entityType="D", printName="允诺配送时间", fieldLength=22)
	deliveryTimePromised,
	//
	@FlyElement(columnName="DeliveryViaRule", name="配送方法", description="定单配送方法", help="The Delivery Via indicates how the products should be delivered. For example, will the order be picked up or shipped.", dataType=FlyDataType.List, entityType="D", printName="配送方法", fieldLength=1)
	deliveryViaRule,
	//
	@FlyElement(columnName="DeltaAmt", name="Delta Amount", description="Difference Amount", dataType=FlyDataType.Amount, entityType="D", printName="Delta Amt", fieldLength=22)
	deltaAmt,
	//
	@FlyElement(columnName="DeltaQty", name="Delta Quantity", description="Quantity Difference", dataType=FlyDataType.Quantity, entityType="D", printName="Delta Qty", fieldLength=22)
	deltaQty,
	//
	@FlyElement(columnName="DeltaUseLifeYears", name="Delta Use Life Years", dataType=FlyDataType.NONE, entityType="D", printName="Delta Use Life Years", fieldLength=0)
	deltaUseLifeYears,
	//
	@FlyElement(columnName="DeltaUseLifeYears_F", name="Delta Use Life Years (fiscal)", description="Delta Use Life Years (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Delta Use Life Years (fiscal)", fieldLength=0)
	deltaUseLifeYearsF,
	//
	@FlyElement(columnName="DepreciationType", name="DepreciationType", dataType=FlyDataType.String, entityType="D", printName="DepreciationType", fieldLength=10)
	depreciationType,
	//
	@FlyElement(columnName="Description", name="描述", description="该记录的可选描述", help="描述最多为 255 个字符。", dataType=FlyDataType.Text, entityType="D", printName="描述", fieldLength=255)
	description,
	//
	@FlyElement(columnName="Description_PrintFormatItem_ID", name="描述列", description="Description Column for Pie Line Bar Charts", help="Graph Description Column for Pie and Line Bar Charts", dataType=FlyDataType.Table, entityType="D", printName="描述列", fieldLength=22)
	descriptionPrintFormatItemID,
	//
	@FlyElement(columnName="DescriptionURL", name="描述网址", description="网址为描述", dataType=FlyDataType.URL, entityType="D", printName="描述网址", fieldLength=120)
	descriptionURL,
	//
	@FlyElement(columnName="Destination_Directory", name="Destination_Directory", dataType=FlyDataType.String, entityType="D", printName="Destination_Directory", fieldLength=255)
	destinationDirectory,
	//
	@FlyElement(columnName="Destination_FileName", name="Destination_FileName", dataType=FlyDataType.String, entityType="D", printName="Destination_FileName", fieldLength=255)
	destinationFileName,
	//
	@FlyElement(columnName="DetailInfo", name="打印明细交易", dataType=FlyDataType.LongText, entityType="D", printName="打印明细交易", fieldLength=0)
	detailInfo,
	//
	@FlyElement(columnName="DetailsSourceFirst", name="Details/Source First", description="Details and Sources are printed before the Line", dataType=FlyDataType.NONE, entityType="D", printName="Details/Source First", fieldLength=0)
	detailsSourceFirst,
	//
	@FlyElement(columnName="DeveloperName", name="Developer Name", dataType=FlyDataType.String, entityType="D", printName="Developer Name", fieldLength=60)
	developerName,
	//
	@FlyElement(columnName="DifferenceAmt", name="差额", dataType=FlyDataType.Amount, entityType="D", printName="差额", fieldLength=22)
	differenceAmt,
	//
	@FlyElement(columnName="DifferenceQty", name="Difference", description="Difference Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Difference", fieldLength=22)
	differenceQty,
	//
	@FlyElement(columnName="DimensionUnits", name="Dimension Units", description="Units of Dimension", dataType=FlyDataType.List, entityType="D", printName="Units", fieldLength=1)
	dimensionUnits,
	//
	@FlyElement(columnName="DirectDeploy", name="Direct Deploy", dataType=FlyDataType.Button, entityType="D", printName="Direct Deploy", fieldLength=1)
	directDeploy,
	//
	@FlyElement(columnName="Discontinued", name="中止", description="该产品不再可用", help="The Discontinued check box indicates a product that has been discontinued.", dataType=FlyDataType.YesNo, entityType="D", printName="中止", fieldLength=1)
	discontinued,
	//
	@FlyElement(columnName="DiscontinuedAt", name="Discontinued At", description="Discontinued At indicates Date when product was discontinued", dataType=FlyDataType.Date, entityType="D", printName="Discontinued At", fieldLength=7)
	discontinuedAt,
	//
	@FlyElement(columnName="DiscontinuedBy", name="中止人", description="中止人", help="The Discontinued By indicates the individual who discontinued this product", dataType=FlyDataType.NONE, entityType="D", printName="中止人", fieldLength=0)
	discontinuedBy,
	//
	@FlyElement(columnName="Discount", name="折扣 %", description="百分比折扣", help="The Discount indicates the discount applied or taken as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="折扣 %", fieldLength=22)
	discount,
	//
	@FlyElement(columnName="Discount2", name="打折 2%", description="百分比折扣", help="The Discount indicates the discount applied or taken as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="打折 2%", fieldLength=22)
	discount2,
	//
	@FlyElement(columnName="DiscountAmt", name="折扣金额", description="有项目量的折扣", help="The Discount Amount indicates the discount amount for a document or line.", dataType=FlyDataType.Amount, entityType="D", printName="折扣", fieldLength=22)
	discountAmt,
	//
	@FlyElement(columnName="DiscountDate", name="折扣日期", description="Last Date for payments with discount", help="Last Date where a deduction of the payment discount is allowed", dataType=FlyDataType.Date, entityType="D", printName="折扣日期", fieldLength=7)
	discountDate,
	//
	@FlyElement(columnName="DiscountDays", name="折扣天数", description="Number of days from invoice date to be eligible for discount", help="The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.  ", dataType=FlyDataType.Integer, entityType="D", printName="折扣天数", fieldLength=22)
	discountDays,
	//
	@FlyElement(columnName="DiscountDays2", name="折扣天数 2", description="Number of days from invoice date to be eligible for discount", help="The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.  ", dataType=FlyDataType.Integer, entityType="D", printName="折扣天数 2", fieldLength=22)
	discountDays2,
	//
	@FlyElement(columnName="DiscountType", name="折扣类型", description="Type of trade discount calculation", help="Type of procedure used to calculate the trade discount percentage", dataType=FlyDataType.List, entityType="D", printName="折扣类型", fieldLength=1)
	discountType,
	//
	@FlyElement(columnName="DisplayLength", name="显示长度", description="Length of the display in characters", help="The display length is mainly for String fields. The length has no impact, if the data type of the field is - Integer, Number, Amount	(length determined by the system) - YesNo	(Checkbox) - List, Table, TableDir	(length of combo boxes are determined by their content at runtime)", dataType=FlyDataType.Integer, entityType="D", printName="显示长度", fieldLength=22)
	displayLength,
	//
	@FlyElement(columnName="DisplayLogic", name="显示逻辑", description="If the Field is displayed, the result determines if the field is actually displayed", help="format		:= <表达> [<逻辑> <表达>] expression	:= @<上下文>@=<价值>或 @<上下文>@!<价值> logic		:= <|>|<&>	context		:= any global or window context value		:= strings logic operators	:= AND or OR with the previous result from left to right Example	'@AD_Table_ID@=14 | @Language@!'GERGER' As it is always a string comparison, the string delimiters are optional, but suggested for future compatibility", dataType=FlyDataType.Text, entityType="D", printName="显示逻辑", fieldLength=2000)
	displayLogic,
	//
	@FlyElement(columnName="DisplaySequence", name="地址打印格式", description="Format for printing this Address", help="The Address Print format defines the format to be used when this address prints.  The following notations are used: @C@=City  @P@=Postal  @A@=PostalAdd  @R@=Region", dataType=FlyDataType.String, entityType="D", printName="地址打印格式", fieldLength=20)
	displaySequence,
	//
	@FlyElement(columnName="DisplaySequenceLocal", name="本地地址格式", description="Format for printing this Address locally", help="The optional Local Address Print format defines the format to be used when this address prints for the Country.  If defined, this format is used for printing the address for the country rather then the standard address format.	 The following notations are used: @C@=City  @P@=Postal  @A@=PostalAdd  @R@=Region", dataType=FlyDataType.String, entityType="D", printName="本地地址格式", fieldLength=20)
	displaySequenceLocal,
	//
	@FlyElement(columnName="DisplaySQL", name="Display SQL", description="SQL for display of lookup value", help="Fully qualified subquery SQL", dataType=FlyDataType.NONE, entityType="D", printName="Display SQL", fieldLength=0)
	displaySQL,
	//
	@FlyElement(columnName="DistributionSorting", name="Distribution Sorting", description="Quantity distribution sorting by unit price", dataType=FlyDataType.List, entityType="D", printName="Distribution Sorting", fieldLength=1)
	distributionSorting,
	//
	@FlyElement(columnName="DistributionType", name="Distribution Type", description="Type of quantity distribution calculation using comparison qty and order qty as operand", dataType=FlyDataType.List, entityType="D", printName="Distribution Type", fieldLength=1)
	distributionType,
	//
	@FlyElement(columnName="DivideBy100", name="除以100", description="Divide number by 100 to get correct amount", dataType=FlyDataType.YesNo, entityType="D", printName="除以100", fieldLength=1)
	divideBy100,
	//
	@FlyElement(columnName="DivideRate", name="分开比率", description="To convert Source number to Target number, the Source is divided", help="To convert Source number to Target number, the Source is divided by the divide rate.  If you enter a Divide Rate, the Multiply Rate will be automatically calculated.", dataType=FlyDataType.Number, entityType="D", printName="分开比率", fieldLength=22)
	divideRate,
	//
	@FlyElement(columnName="DocAction", name="文档动作", description="The targeted status of the document", help="You find the current status in the Document Status field. The options are listed in a popup", dataType=FlyDataType.Button, entityType="D", printName="文件动作", fieldLength=2)
	docAction,
	//
	@FlyElement(columnName="DocBaseType", name="文档基本类型", description="文件的逻辑类型", help="The Document Base Type identifies the base or starting point for a document.  Multiple document types may share a single document base type.", dataType=FlyDataType.List, entityType="D", printName="文件基本类型", fieldLength=3)
	docBaseType,
	//
	@FlyElement(columnName="DocBasisType", name="计算基础", description="Basis for the calculation the commission", help="The Calculation Basis indicates the basis to be used for the commission calculation. ", dataType=FlyDataType.List, entityType="D", printName="计算基础", fieldLength=1)
	docBasisType,
	//
	@FlyElement(columnName="DocNoSequence_ID", name="文档序列", description="Document sequence determines the numbering of documents", help="The Document Sequence indicates the sequencing rule to use for this document type.", dataType=FlyDataType.Table, entityType="D", printName="文件序列", fieldLength=22)
	docNoSequenceID,
	//
	@FlyElement(columnName="DocStatus", name="文档状态", description="The current status of the document", help="The Document Status indicates the status of a document at this time.  If you want to change the document status, use the Document Action field", dataType=FlyDataType.List, entityType="D", printName="文件状态", fieldLength=2)
	docStatus,
	//
	@FlyElement(columnName="DocSubTypeSO", name="销售定单子类型", description="销售定单替代人员类型", help="The SO Sub Type indicates the type of sales order this document refers to.  This field only appears when the Document Base Type is Sales Order.  The selection made here will determine which documents will be generated when an order is processed and which documents must be generated manually or in batches.  <br>	The following outlines this process.<br>销售定单子类型 <b>标准定单<b>意志仅仅产生那 <b>定单<b> document when the order is processed.  <br>那 <b>配送注解<b>, <b>发票<b>而且 <b>收货<b> must be generated via other processes.  <br>销售定单子类型 <b>仓库定单<b>意志产生那 <b>定单<b>而且 <b>配送注解<b>. <br>那 <b>发票<b>而且 <b>收货<b> must be generated via other processes.<br>销售定单子类型 <b>信用定单<b>意志产生那 <b>定单<b>, <b>配送注解<b>而且 <b>发票<b>. <br>那 <b>Reciept<b> must be generated via other processes.<br>销售定单子类型 <b>POS<b> (Point of Sale) will generate all document", dataType=FlyDataType.List, entityType="D", printName="销售定单子类型", fieldLength=2)
	docSubTypeSO,
	//
	@FlyElement(columnName="DocTypeName", name="文件类型名", description="文件类型名", dataType=FlyDataType.String, entityType="D", printName="DocType 名", fieldLength=60)
	docTypeName,
	//
	@FlyElement(columnName="DocumentAmt", name="Document Amt", description="Document Amount", dataType=FlyDataType.Amount, entityType="D", printName="Document Amt", fieldLength=22)
	documentAmt,
	//
	@FlyElement(columnName="DocumentCopies", name="文件份数", description="Number of copies to be printed", help="The Document Copies indicates the number of copies of each document that will be generated.", dataType=FlyDataType.Integer, entityType="D", printName="份数", fieldLength=22)
	documentCopies,
	//
	@FlyElement(columnName="DocumentDir", name="文档目录", description="Directory for documents from the application server", help="Directory to store documents by the application server.  The path directory is accessed by the application server and may not be accessible to clients.", dataType=FlyDataType.String, entityType="D", printName="文档目录", fieldLength=60)
	documentDir,
	//
	@FlyElement(columnName="DocumentNo", name="文档号", description="Document sequence number of the document", help="The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in '<>'.		If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice).  If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the 'Maintain Sequence' window with the name 'DocumentNo_<TableName>', where TableName is the actual name of the table (e.g. C_Order).", dataType=FlyDataType.String, entityType="D", printName="文档号", fieldLength=30)
	documentNo,
	//
	@FlyElement(columnName="DocumentNote", name="文件注释", description="Additional information for a Document", help="The Document Note is used for recording any additional information regarding this product.", dataType=FlyDataType.Text, entityType="D", printName="文件注释", fieldLength=2000)
	documentNote,
	//
	@FlyElement(columnName="DocumentType", name="文件类型", description="文件类型", dataType=FlyDataType.String, entityType="D", printName="文件类型", fieldLength=60)
	documentType,
	//
	@FlyElement(columnName="DocumentTypeNote", name="文件类型注释", description="Optional note of a document type", dataType=FlyDataType.String, entityType="D", printName="文件类型注释", fieldLength=2000)
	documentTypeNote,
	//
	@FlyElement(columnName="DocValueLogic", name="Document Value Logic", description="Logic to determine Workflow Start - If true, a workflow process is started for the document", dataType=FlyDataType.String, entityType="D", printName="Doc Value Logic", fieldLength=2000)
	docValueLogic,
	//
	@FlyElement(columnName="DomainLabel", name="Domain Label", description="Label for the domain axis.", dataType=FlyDataType.String, entityType="D", printName="Domain Label", fieldLength=60)
	domainLabel,
	//
	@FlyElement(columnName="DoPricing", name="Pricing", dataType=FlyDataType.Button, entityType="D", printName="Pricing", fieldLength=1)
	doPricing,
	//
	@FlyElement(columnName="DownloadURL", name="下载网址", description="下载的网址", help="Semicolon separated list of URLs to be downloaded or distributed", dataType=FlyDataType.URL, entityType="D", printName="下载网址", fieldLength=120)
	downloadURL,
	//
	@FlyElement(columnName="DR_Account_ID", name="Account (debit)", description="Account used", help="The (natural) account used", dataType=FlyDataType.NONE, entityType="D", printName="Account (debit)", fieldLength=0)
	dRAccountID,
	//
	@FlyElement(columnName="DropShip_BPartner_ID", name="Drop Shipment Partner", description="Business Partner to ship to", help="If empty the business partner will be shipped to.", dataType=FlyDataType.Search, entityType="D", printName="Drop Shipment  Partner", fieldLength=22)
	dropShipBPartnerID,
	//
	@FlyElement(columnName="DropShip_Location_ID", name="Drop Shipment Location", description="Business Partner Location for shipping to", dataType=FlyDataType.Table, entityType="D", printName="Drop Shipment Location", fieldLength=22)
	dropShipLocationID,
	//
	@FlyElement(columnName="DropShip_User_ID", name="Drop Shipment Contact", description="Business Partner Contact for drop shipment", dataType=FlyDataType.Table, entityType="D", printName="Drop Shipment Contact", fieldLength=22)
	dropShipUserID,
	//
	@FlyElement(columnName="DropShip_Warehouse_ID", name="Drop Ship Warehouse", description="The (logical) warehouse to use for recording drop ship receipts and shipments.", help="The drop ship warehouse will be used for recording material transactions relating to drop shipments to and from this organization.", dataType=FlyDataType.Table, entityType="D", printName="Drop Ship Warehouse", fieldLength=22)
	dropShipWarehouseID,
	//
	@FlyElement(columnName="Due0", name="Due Today", dataType=FlyDataType.Amount, entityType="D", printName="Due Today", fieldLength=22)
	due0,
	//
	@FlyElement(columnName="Due0_30", name="Due Today-30", dataType=FlyDataType.Amount, entityType="D", printName="Due Today-30", fieldLength=22)
	due030,
	//
	@FlyElement(columnName="Due0_7", name="Due Today-7", dataType=FlyDataType.Amount, entityType="D", printName="Due Today-7", fieldLength=22)
	due07,
	//
	@FlyElement(columnName="Due1_7", name="Due 1-7", dataType=FlyDataType.Amount, entityType="D", printName="Due 1-7", fieldLength=22)
	due17,
	//
	@FlyElement(columnName="Due31_60", name="Due 31-60", dataType=FlyDataType.Amount, entityType="D", printName="Due 31-60", fieldLength=22)
	due3160,
	//
	@FlyElement(columnName="Due31_Plus", name="Due > 31", dataType=FlyDataType.Amount, entityType="D", printName="Due > 31", fieldLength=22)
	due31Plus,
	//
	@FlyElement(columnName="Due61_90", name="Due 61-90", dataType=FlyDataType.Amount, entityType="D", printName="Due 61-90", fieldLength=22)
	due6190,
	//
	@FlyElement(columnName="Due61_Plus", name="Due > 61", dataType=FlyDataType.Amount, entityType="D", printName="Due > 61", fieldLength=22)
	due61Plus,
	//
	@FlyElement(columnName="Due8_30", name="Due 8-30", dataType=FlyDataType.Amount, entityType="D", printName="Due 8-30", fieldLength=22)
	due830,
	//
	@FlyElement(columnName="Due91_Plus", name="Due > 91", dataType=FlyDataType.Amount, entityType="D", printName="Due > 91", fieldLength=22)
	due91Plus,
	//
	@FlyElement(columnName="DueAmt", name="应付余额", description="付款应付款金额", help="Full amount of the payment due", dataType=FlyDataType.Amount, entityType="D", printName="应付余额", fieldLength=22)
	dueAmt,
	//
	@FlyElement(columnName="DueDate", name="应付款日期", description="付款到期日", help="Date when the payment is due without deductions or discount", dataType=FlyDataType.Date, entityType="D", printName="应付款日期", fieldLength=7)
	dueDate,
	//
	@FlyElement(columnName="DueDateTolerance", name="Due Date Tolerance", description="Tolerance in days between the Date Next Action and the date the request is regarded as overdue", help="When the Date Next Action is passed, the Request becomes Due. After the Due Date Tolerance, the Request becomes Overdue.", dataType=FlyDataType.Integer, entityType="D", printName="Due Date Tolerance", fieldLength=22)
	dueDateTolerance,
	//
	@FlyElement(columnName="DueType", name="应付款类型", description="Status of the next action for this Request", help="The Due Type indicates if this request is Due, Overdue or Scheduled.", dataType=FlyDataType.List, entityType="D", printName="应付款类型", fieldLength=1)
	dueType,
	//
	@FlyElement(columnName="DunningDate", name="催讨日期", description="催讨日期", dataType=FlyDataType.Date, entityType="D", printName="催讨日期", fieldLength=7)
	dunningDate,
	//
	@FlyElement(columnName="DunningGrace", name="Dunning Grace Date", dataType=FlyDataType.Date, entityType="D", printName="Dunning Grace Date", fieldLength=7)
	dunningGrace,
	//
	@FlyElement(columnName="Dunning_PrintFormat_ID", name="催讨打印格式", description="Print Format for printing Dunning Letters", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="催讨打印格式", fieldLength=22)
	dunningPrintFormatID,
	//
	@FlyElement(columnName="DUNS", name="催讨", description="催促者 &Bradstreet 数字", help="Used for EDI - For details see   www.dnb.com dunsno list.htm", dataType=FlyDataType.String, entityType="D", printName="催讨", fieldLength=11)
	dUNS,
	//
	@FlyElement(columnName="Duration", name="Duration", description="Normal Duration in Duration Unit", help="Expected (normal) Length of time for the execution", dataType=FlyDataType.Integer, entityType="D", printName="Duration", fieldLength=22)
	duration,
	//
	@FlyElement(columnName="DurationUnit", name="Duration Unit", description="Unit of Duration", help="Unit to define the length of time for the execution", dataType=FlyDataType.List, entityType="D", printName="Duration Unit", fieldLength=1)
	durationUnit,
	//
	@FlyElement(columnName="DynPriorityChange", name="Dynamic Priority Change", description="Change of priority when Activity is suspended waiting for user", help="Starting with the Process / Node priority level, the priority of the suspended activity can be changed dynamically. Example +5 every 10 minutes", dataType=FlyDataType.Number, entityType="D", printName="Dyn Priority Change", fieldLength=22)
	dynPriorityChange,
	//
	@FlyElement(columnName="DynPriorityStart", name="Dyn Priority Start", description="Starting priority before changed dynamically", dataType=FlyDataType.Integer, entityType="D", printName="Dyn Priority Start", fieldLength=22)
	dynPriorityStart,
	//
	@FlyElement(columnName="DynPriorityUnit", name="Dynamic Priority Unit", description="Change of priority when Activity is suspended waiting for user", help="Starting with the Process / Node priority level, the priority of the suspended activity can be changed dynamically. Example +5 every 10 minutes", dataType=FlyDataType.List, entityType="D", printName="Dyn Priority Unit", fieldLength=1)
	dynPriorityUnit,
	//
	@FlyElement(columnName="EDIStatus", name="EDI 状态", dataType=FlyDataType.List, entityType="D", printName="EDI 状态", fieldLength=1)
	eDIStatus,
	//
	@FlyElement(columnName="EDIType", name="EDI 类型", dataType=FlyDataType.List, entityType="D", printName="EDI 类型", fieldLength=1)
	eDIType,
	//
	@FlyElement(columnName="E_Expense_Acct", name="职员费用", description="职员费用帐户", help="The Employee Expense Account identifies the account to use for recording expenses for this employee.", dataType=FlyDataType.Account, entityType="D", printName="职员费用", fieldLength=22)
	eExpenseAcct,
	//
	@FlyElement(columnName="EftAmt", name="EFT Amount", description="Electronic Funds Transfer Amount", dataType=FlyDataType.Amount, entityType="D", printName="EFT Amount", fieldLength=22)
	eftAmt,
	//
	@FlyElement(columnName="EftCheckNo", name="EFT Check No", description="Electronic Funds Transfer Check No", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Check No", fieldLength=20)
	eftCheckNo,
	//
	@FlyElement(columnName="EftCurrency", name="EFT Currency", description="Electronic Funds Transfer Currency", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Currency", fieldLength=20)
	eftCurrency,
	//
	@FlyElement(columnName="EftMemo", name="EFT Memo", description="Electronic Funds Transfer Memo", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Memo", fieldLength=2000)
	eftMemo,
	//
	@FlyElement(columnName="EftPayee", name="EFT Payee", description="Electronic Funds Transfer Payee information", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Payee", fieldLength=255)
	eftPayee,
	//
	@FlyElement(columnName="EftPayeeAccount", name="EFT Payee Account", description="Electronic Funds Transfer Payyee Account Information", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Payee Account", fieldLength=40)
	eftPayeeAccount,
	//
	@FlyElement(columnName="EftReference", name="EFT Reference", description="Electronic Funds Transfer Reference", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Reference", fieldLength=60)
	eftReference,
	//
	@FlyElement(columnName="EftStatementDate", name="EFT Statement Date", description="Electronic Funds Transfer Statement Date", help="Information from EFT media", dataType=FlyDataType.Date, entityType="D", printName="EFT Statement Date", fieldLength=7)
	eftStatementDate,
	//
	@FlyElement(columnName="EftStatementLineDate", name="EFT Statement Line Date", description="Electronic Funds Transfer Statement Line Date", help="Information from EFT media", dataType=FlyDataType.Date, entityType="D", printName="EFT Statement Line Date", fieldLength=7)
	eftStatementLineDate,
	//
	@FlyElement(columnName="EftStatementReference", name="EFT Statement Reference", description="Electronic Funds Transfer Statement Reference", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Statement Reference", fieldLength=60)
	eftStatementReference,
	//
	@FlyElement(columnName="EftTrxID", name="EFT Trx ID", description="Electronic Funds Transfer Transaction ID", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Trx ID", fieldLength=40)
	eftTrxID,
	//
	@FlyElement(columnName="EftTrxType", name="EFT Trx Type", description="Electronic Funds Transfer Transaction Type", help="Information from EFT media", dataType=FlyDataType.String, entityType="D", printName="EFT Trx Type", fieldLength=20)
	eftTrxType,
	//
	@FlyElement(columnName="EftValutaDate", name="EFT Effective Date", description="Electronic Funds Transfer Valuta (effective) Date", help="Information from EFT media", dataType=FlyDataType.Date, entityType="D", printName="EFT Effective Date", fieldLength=7)
	eftValutaDate,
	//
	@FlyElement(columnName="ElapsedTimeMS", name="Elapsed Time ms", description="Elapsed Time in mili seconds", help="Elapsed Time in mili seconds", dataType=FlyDataType.Number, entityType="D", printName="Elapsed Time", fieldLength=22)
	elapsedTimeMS,
	//
	@FlyElement(columnName="ElectronicScales", name="Electronic Scales", description="Allows to define path for Device Electronic Scales e.g. /dev/ttyS0/", dataType=FlyDataType.String, entityType="D", printName="Electronic Scales", fieldLength=120)
	electronicScales,
	//
	@FlyElement(columnName="ElementName", name="元素名", description="元素名", dataType=FlyDataType.String, entityType="D", printName="元素名", fieldLength=60)
	elementName,
	//
	@FlyElement(columnName="Elements", name="Elements", description="Contains list of elements separated by CR", help="Contains a list of elements this template uses separated by a Carriage Return. Last line should be empty", dataType=FlyDataType.Text, entityType="D", printName="Elements", fieldLength=2000)
	elements,
	//
	@FlyElement(columnName="ElementType", name="类型", description="Element Type (account or user defined)", help="元素类型标明此元素是财务元素还是自定义元素。  ", dataType=FlyDataType.List, entityType="D", printName="类型", fieldLength=1)
	elementType,
	//
	@FlyElement(columnName="ElementValue", name="元素关键字", description="元素的关键字", dataType=FlyDataType.String, entityType="D", printName="元素关键字", fieldLength=40)
	elementValue,
	//
	@FlyElement(columnName="EMail", name="电邮", description="电子邮件地址", help="The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web.", dataType=FlyDataType.String, entityType="D", printName="电邮", fieldLength=60)
	eMail,
	//
	@FlyElement(columnName="EMail_Error_To", name="错误电子邮件", description="Email address to send error messages to", dataType=FlyDataType.String, entityType="D", printName="错误电子邮件", fieldLength=60)
	eMailErrorTo,
	//
	@FlyElement(columnName="EMailFooter", name="EMail Footer", description="Footer added to EMails", help="The footer is added to every email.", dataType=FlyDataType.Text, entityType="D", printName="EMail Footer", fieldLength=2000)
	eMailFooter,
	//
	@FlyElement(columnName="EMail_From", name="从电子邮件", description="Full Email address used to send requests - e.g. edi@organization.com", dataType=FlyDataType.String, entityType="D", printName="从电子邮件", fieldLength=60)
	eMailFrom,
	//
	@FlyElement(columnName="EMail_From_Pwd", name="从电子邮件", description="Password of the sending Email address", dataType=FlyDataType.String, entityType="D", printName="从电子邮件密码", fieldLength=20)
	eMailFromPwd,
	//
	@FlyElement(columnName="EMail_From_Uid", name="从电子邮件用户", description="User ID of the sending Email address (on default SMTP Host) - e.g. edi", dataType=FlyDataType.String, entityType="D", printName="从电子邮件用户", fieldLength=20)
	eMailFromUid,
	//
	@FlyElement(columnName="EMailHeader", name="EMail Header", description="Header added to EMails", help="The header is added to every email.", dataType=FlyDataType.Text, entityType="D", printName="EMail Header", fieldLength=2000)
	eMailHeader,
	//
	@FlyElement(columnName="EMail_Info_To", name="信息电子邮件", description="Email address to send informational messages and copies", help="The Info Email address indicates the address to use when sending informational messages or copies of other messages.", dataType=FlyDataType.String, entityType="D", printName="信息电子邮件", fieldLength=60)
	eMailInfoTo,
	//
	@FlyElement(columnName="EMailPDF", name="发电子邮件给可携式电子文件", description="Email Invoice PDF files to customer", dataType=FlyDataType.NONE, entityType="D", printName="发电子邮件给可携式电子文件", fieldLength=0)
	eMailPDF,
	//
	@FlyElement(columnName="EMailRecipient", name="EMail Recipient", description="Recipient of the EMail", dataType=FlyDataType.List, entityType="D", printName="EMail Recipient", fieldLength=1)
	eMailRecipient,
	//
	@FlyElement(columnName="EMailTest", name="EMail Test", description="Test EMail", dataType=FlyDataType.Button, entityType="D", printName="EMail Test", fieldLength=1)
	eMailTest,
	//
	@FlyElement(columnName="EMail_To", name="发电子邮件给", description="Email address to send requests to - e.g. edi@manufacturer.com ", dataType=FlyDataType.String, entityType="D", printName="发电子邮件给", fieldLength=60)
	eMailTo,
	//
	@FlyElement(columnName="EMailUser", name="电子邮件用户", description="User Name (ID) in the Mail System", help="The user name in the mail system is usually the string before the @ of your email address.  Required if the mail server requires authentification to send emails.", dataType=FlyDataType.String, entityType="D", printName="发电子邮件给用户", fieldLength=60)
	eMailUser,
	//
	@FlyElement(columnName="EMailUserPW", name="发电子邮件给用户密码", description="Password of your email user id", help="Required if the mail server requires authentification to send emails.", dataType=FlyDataType.String, entityType="D", printName="用电子邮件发密码", fieldLength=20)
	eMailUserPW,
	//
	@FlyElement(columnName="EMailVerify", name="Email验证", description="验证电子邮件地址", help="The field contains the date the EMail Address has been verified", dataType=FlyDataType.String, entityType="D", printName="Email验证", fieldLength=40)
	eMailVerify,
	//
	@FlyElement(columnName="EMailVerifyDate", name="EMail Verify", description="Date Email was verified", dataType=FlyDataType.DateTime, entityType="D", printName="EMail Verify", fieldLength=7)
	eMailVerifyDate,
	//
	@FlyElement(columnName="EMUEntryDate", name="欧元条目日期", description="Date when the currency joined   will join the EMU", help="The EMU Entry Date defines the date that this currency entered, or will enter the Economic Monetary Union.", dataType=FlyDataType.Date, entityType="D", printName="欧元条目日期", fieldLength=7)
	eMUEntryDate,
	//
	@FlyElement(columnName="EMURate", name="欧元汇率", description="对欧元的官方比率", help="The EMU Rate defines the official rate to be used when converting from this currency to the Euro.", dataType=FlyDataType.Number, entityType="D", printName="欧元汇率", fieldLength=22)
	eMURate,
	//
	@FlyElement(columnName="EncryptionKey", name="加密密钥", description="Encryption Key used for securing data content", help="Please note that changing the key will make ALL previously encrypted data unreadable.", dataType=FlyDataType.String, entityType="D", printName="加密密钥", fieldLength=255)
	encryptionKey,
	//
	@FlyElement(columnName="EncryptionType", name="Encryption Type", description="Encryption Type used for securing data content", dataType=FlyDataType.List, entityType="D", printName="Encryption Type", fieldLength=1)
	encryptionType,
	//
	@FlyElement(columnName="EndDate", name="结束日期", description="Last effective date (inclusive)", help="The End Date indicates the last date in this range.", dataType=FlyDataType.Date, entityType="D", printName="结束日期", fieldLength=7)
	endDate,
	//
	@FlyElement(columnName="EndingBalance", name="终止余款", description="终止或结束余款", help="The Ending Balance is the result of adjusting the Beginning Balance by any payments or disbursements.", dataType=FlyDataType.Amount, entityType="D", printName="终止余款", fieldLength=22)
	endingBalance,
	//
	@FlyElement(columnName="EndingQtyBalance", name="Ending Qty Balance", description="Quantity Ending  or closing balance", help="The Qunatity Ending Balance is the result of adjusting the Quantity Beginning Balance ", dataType=FlyDataType.NONE, entityType="D", printName="Ending Qty Balance", fieldLength=0)
	endingQtyBalance,
	//
	@FlyElement(columnName="EndNo", name="结束号", dataType=FlyDataType.Integer, entityType="D", printName="结束号", fieldLength=22)
	endNo,
	//
	@FlyElement(columnName="EndTime", name="End Time", description="End of the time span", dataType=FlyDataType.DateTime, entityType="D", printName="End Time", fieldLength=7)
	endTime,
	//
	@FlyElement(columnName="EndWaitTime", name="End Wait", description="End of sleep time", help="End of suspension (sleep)", dataType=FlyDataType.DateTime, entityType="D", printName="End Wait", fieldLength=7)
	endWaitTime,
	//
	@FlyElement(columnName="EnforceClientSecurity", name="强制客户安全性", description="Send alerts to recipient only if the client security rules of the role allows", dataType=FlyDataType.YesNo, entityType="D", printName="强制客户安全性", fieldLength=1)
	enforceClientSecurity,
	//
	@FlyElement(columnName="EnforcePriceLimit", name="强制价格限制", description="Do not allow prices below the limit price", help="The Enforce Price Limit check box indicates that prices cannot be below the limit price in Orders. Invoices are not checked.", dataType=FlyDataType.YesNo, entityType="D", printName="强制价格限制", fieldLength=1)
	enforcePriceLimit,
	//
	@FlyElement(columnName="EnforceRoleSecurity", name="强制角色安全性", description="Send alerts to recipient only if the data security rules of the role allows", dataType=FlyDataType.YesNo, entityType="D", printName="强制角色安全性", fieldLength=1)
	enforceRoleSecurity,
	//
	@FlyElement(columnName="EntityType", name="实体类型", description="字典实体类型; 确定所有者和同步性", help="实体类型'字典/Dictionary', 'Adempiere' 和 '应用/Application' 能够自动的同步因此客户化的工作将被删除或覆盖  		要客户化,请复制实体并选择'用户/User'!", dataType=FlyDataType.Table, entityType="D", printName="实体类型", fieldLength=40)
	entityType,
	//
	@FlyElement(columnName="E_Prepayment_Acct", name="职员预付款", description="Account for Employee Expense Prepayments", help="The Employee Prepayment Account identifies the account to use for recording expense advances made to this employee.", dataType=FlyDataType.Account, entityType="D", printName="职员预付款", fieldLength=22)
	ePrepaymentAcct,
	//
	@FlyElement(columnName="ErrorMsg", name="错误 Msg", dataType=FlyDataType.String, entityType="D", printName="错误 Msg", fieldLength=2000)
	errorMsg,
	//
	@FlyElement(columnName="ErrorTrace", name="Error Trace", description="System Error Trace", help="Java Trace Info", dataType=FlyDataType.Text, entityType="D", printName="Error Trace", fieldLength=2000)
	errorTrace,
	//
	@FlyElement(columnName="EvenInvoiceWeek", name="发票在甚至星期", description="在甚至星期送发票", help="The Invoice on Even Weeks checkbox indicates if biweekly invoices should be sent on even week numbers.", dataType=FlyDataType.YesNo, entityType="D", printName="发票在甚至星期", fieldLength=1)
	evenInvoiceWeek,
	//
	@FlyElement(columnName="EventChangeLog", name="Event Change Log", description="Type of Event in Change Log", dataType=FlyDataType.List, entityType="D", printName="Event Change Log", fieldLength=1)
	eventChangeLog,
	//
	@FlyElement(columnName="EventModelValidator", name="Event Model Validator", dataType=FlyDataType.List, entityType="D", printName="Event Model Validator", fieldLength=4)
	eventModelValidator,
	//
	@FlyElement(columnName="EventType", name="事件类型", description="事件的类型", dataType=FlyDataType.List, entityType="D", printName="事件类型", fieldLength=2)
	eventType,
	//
	@FlyElement(columnName="Excerpt", name="Excerpt", description="Surrounding text of the keyword", help="A passage or segment taken from a document,", dataType=FlyDataType.Text, entityType="D", printName="Excerpt", fieldLength=2000)
	excerpt,
	//
	@FlyElement(columnName="ExemptReason", name="免税者理由", description="理由为未扣留", help="The Exempt Reason indicates the reason that monies are not withheld from this employee.", dataType=FlyDataType.String, entityType="D", printName="免税者理由", fieldLength=20)
	exemptReason,
	//
	@FlyElement(columnName="ExpectedCloseDate", name="Expected Close Date", description="Expected Close Date", help="The Expected Close Date indicates the expected last or final date", dataType=FlyDataType.NONE, entityType="D", printName="Expected Close Date", fieldLength=0)
	expectedCloseDate,
	//
	@FlyElement(columnName="ExpectedResult", name="Expected Result", dataType=FlyDataType.String, entityType="D", printName="Expected Result", fieldLength=22)
	expectedResult,
	//
	@FlyElement(columnName="Expense", name="Expense", dataType=FlyDataType.Amount, entityType="D", printName="Expense", fieldLength=22)
	expense,
	//
	@FlyElement(columnName="ExpenseAmt", name="费用金额", description="金额为费用", help="费用币种的金额", dataType=FlyDataType.Amount, entityType="D", printName="费用金额", fieldLength=22)
	expenseAmt,
	//
	@FlyElement(columnName="Expense_F", name="Expense (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Expense (fiscal)", fieldLength=0)
	expenseF,
	//
	@FlyElement(columnName="ExportXML", name="Export to XML", description="Export this record to XML", dataType=FlyDataType.NONE, entityType="D", printName="Export to XML", fieldLength=0)
	exportXML,
	//
	@FlyElement(columnName="ExpressionBankAccountNo", name="银行账号格式", description="银行账号的格式", dataType=FlyDataType.String, entityType="D", printName="银行账号格式", fieldLength=20)
	expressionBankAccountNo,
	//
	@FlyElement(columnName="ExpressionBankRoutingNo", name="银行Routing码格式", description="Format of the Bank Routing Number", dataType=FlyDataType.String, entityType="D", printName="银行Routing码格式", fieldLength=20)
	expressionBankRoutingNo,
	//
	@FlyElement(columnName="ExpressionPhone", name="电话号码格式", description="Format of the phone; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任意字符	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="电话号码格式", fieldLength=20)
	expressionPhone,
	//
	@FlyElement(columnName="ExpressionPostal", name="邮编格式", description="Format of the postal code; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任何的个性	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="邮编格式", fieldLength=20)
	expressionPostal,
	//
	@FlyElement(columnName="ExpressionPostal_Add", name="附加邮编格式", description="Format of the value; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任何的个性	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="附加邮编格式", fieldLength=20)
	expressionPostalAdd,
	//
	@FlyElement(columnName="Fact_Acct_ID", name="会计分录", dataType=FlyDataType.ID, entityType="D", printName="会计分录", fieldLength=22)
	factAcctID,
	//
	@FlyElement(columnName="Factor", name="Factor", description="Scaling factor.", help="Numbers are divided by the scaling factor for presentation.  E.g. 123,000 with a scaling factor of 1,000 will display as 123.", dataType=FlyDataType.List, entityType="D", printName="Factor", fieldLength=1)
	factor,
	//
	@FlyElement(columnName="Fact_Reconciliation_ID", name="Accounting Fact Reconciliation", dataType=FlyDataType.NONE, entityType="D", printName="Accounting Fact Reconciliation", fieldLength=0)
	factReconciliationID,
	//
	@FlyElement(columnName="Fax", name="传真", description="传真号", help="The Fax identifies a facsimile number for this Business Partner or  Location", dataType=FlyDataType.String, entityType="D", printName="传真", fieldLength=40)
	fax,
	//
	@FlyElement(columnName="FeeAmt", name="费用金额", description="Fee amount in invoice currency", help="The Fee Amount indicates the charge amount on a dunning letter for overdue invoices.  This field will only display if the charge fee checkbox has been selected.", dataType=FlyDataType.Amount, entityType="D", printName="费用", fieldLength=22)
	feeAmt,
	//
	@FlyElement(columnName="FieldAlignmentType", name="字段对准", description="字段本文对准", help="Alignment of field text. The default is determined by the data display type: Numbers are right aligned, other data is left aligned", dataType=FlyDataType.List, entityType="D", printName="字段对准", fieldLength=1)
	fieldAlignmentType,
	//
	@FlyElement(columnName="FieldGroupType", name="Field Group Type", dataType=FlyDataType.List, entityType="D", printName="Field Group Type", fieldLength=10)
	fieldGroupType,
	//
	@FlyElement(columnName="FieldLength", name="长度", description="Length of the column in the database", help="The Length indicates the length of a column as defined in the database.", dataType=FlyDataType.Integer, entityType="D", printName="长度", fieldLength=22)
	fieldLength,
	//
	@FlyElement(columnName="File_Directory", name="File_Directory", dataType=FlyDataType.Text, entityType="D", printName="File_Directory", fieldLength=255)
	fileDirectory,
	//
	@FlyElement(columnName="FileName", name="File Name", description="Name of the local file or URL", help="Name of a file in the local directory space - or URL (file://.., http://.., ftp://..)", dataType=FlyDataType.String, entityType="D", printName="File Name", fieldLength=120)
	fileName,
	//
	@FlyElement(columnName="FilePathOrName", name="File Path or Name", description="Path of directory or name of the local file or URL", help="Path of the directory or name of a file in the local directory space - or URL (file://.., http://.., ftp://..)", dataType=FlyDataType.FilePathOrName, entityType="D", printName="File Path/Name", fieldLength=120)
	filePathOrName,
	//
	@FlyElement(columnName="FileSize", name="File Size", description="Size of the File in bytes", dataType=FlyDataType.Number, entityType="D", printName="File Size", fieldLength=22)
	fileSize,
	//
	@FlyElement(columnName="FinancialInstitutionID", name="Financial Institution ID", description="The ID of the Financial Institution / Bank", help="Depending on the loader, it might require a ID of the financial institution", dataType=FlyDataType.String, entityType="D", printName="Financial Institution ID", fieldLength=20)
	financialInstitutionID,
	//
	@FlyElement(columnName="Find_ID", name="Find_ID", dataType=FlyDataType.Number, entityType="D", printName="Find_ID", fieldLength=22)
	findID,
	//
	@FlyElement(columnName="FinishMode", name="Finish Mode", description="Workflow Activity Finish Mode", help="How the system operated at the end of an activity. Automatic  implies return when the invoked applications finished control - Manual the user has to explicitly terminate the activity.", dataType=FlyDataType.List, entityType="D", printName="Finish Mode", fieldLength=1)
	finishMode,
	//
	@FlyElement(columnName="FirstCountQty", name="First Count Qty", dataType=FlyDataType.NONE, entityType="D", printName="1st Count", fieldLength=0)
	firstCountQty,
	//
	@FlyElement(columnName="FirstSale", name="首次销售", description="首次销售日期", help="The First Sale Date identifies the date of the first sale to this Business Partner", dataType=FlyDataType.Date, entityType="D", printName="首次销售", fieldLength=7)
	firstSale,
	//
	@FlyElement(columnName="FiscalYear", name="Year", description="The Fiscal Year", help="The Year identifies the accounting year for a calendar.", dataType=FlyDataType.String, entityType="D", printName="Year", fieldLength=10)
	fiscalYear,
	//
	@FlyElement(columnName="FixAmt", name="固定金额", description="Fix amounted amount to be levied or paid", help="The Fixed Amount indicates a fixed amount to be levied or paid.", dataType=FlyDataType.Amount, entityType="D", printName="固定金额", fieldLength=22)
	fixAmt,
	//
	@FlyElement(columnName="fixedpercentage", name="fixedpercentage", dataType=FlyDataType.NONE, entityType="D", printName="fixedpercentage", fieldLength=0)
	fixedpercentage,
	//
	@FlyElement(columnName="FixMonthCutoff", name="固定月中止", description="Last day to include for next due date", help="The Fix Month Cutoff indicates the last day invoices can have to be included in the current due date.  This field only displays when the fixed due date checkbox has been selected.", dataType=FlyDataType.Integer, entityType="D", printName="固定月中止", fieldLength=22)
	fixMonthCutoff,
	//
	@FlyElement(columnName="FixMonthDay", name="固定月日", description="Day of the month of the due date", help="The Fix Month Day indicates the day of the month that invoices are due.  This field only displays if the fixed due date checkbox is selected.", dataType=FlyDataType.Integer, entityType="D", printName="固定月日", fieldLength=22)
	fixMonthDay,
	//
	@FlyElement(columnName="FixMonthOffset", name="固定月抵销", description="Number of months (0=same, 1=following)", help="The Fixed Month Offset indicates the number of months from the current month to indicate an invoice is due.  A 0 indicates the same month, a 1 the following month.  This field will only display if the fixed due date checkbox is selected.", dataType=FlyDataType.Integer, entityType="D", printName="固定月抵销", fieldLength=22)
	fixMonthOffset,
	//
	@FlyElement(columnName="FlatDiscount", name="直线折扣 %", description="直线的折扣百分比 ", dataType=FlyDataType.Number, entityType="D", printName="直线折扣", fieldLength=22)
	flatDiscount,
	//
	@FlyElement(columnName="Folder", name="Folder", description="A folder on a local or remote system to store data into", help="We store files in folders, especially media files.", dataType=FlyDataType.String, entityType="D", printName="Folder", fieldLength=60)
	folder,
	//
	@FlyElement(columnName="FooterCenter", name="Footer Center", description="Content of the center portion of the footer.", dataType=FlyDataType.String, entityType="D", printName="Footer Center", fieldLength=255)
	footerCenter,
	//
	@FlyElement(columnName="FooterLeft", name="Footer Left", description="Content of the left portion of the footer.", dataType=FlyDataType.String, entityType="D", printName="Footer Left", fieldLength=255)
	footerLeft,
	//
	@FlyElement(columnName="FooterMargin", name="脚边距", description="Margin of the Footer in 1 72 of an inch", help="Distance from the bottom of the main content to the end of the printable page in 1 72 of an inch (point)", dataType=FlyDataType.Integer, entityType="D", printName="脚边距", fieldLength=22)
	footerMargin,
	//
	@FlyElement(columnName="FooterRight", name="Footer Right", description="Content of the right portion of the footer.", dataType=FlyDataType.String, entityType="D", printName="Footer Right", fieldLength=255)
	footerRight,
	//
	@FlyElement(columnName="FormatPattern", name="Format Pattern", description="The pattern used to format a number or date.", help="A string complying with either Java SimpleDateFormat or DecimalFormat pattern syntax used to override the default presentation format of a date or number type field.", dataType=FlyDataType.String, entityType="D", printName="Format Pattern", fieldLength=22)
	formatPattern,
	//
	@FlyElement(columnName="FormatType", name="格式", description="数据的格式", help="The Format is a drop down list box for selecting the format type (text, tab delimited, XML, etc) of the file to be imported", dataType=FlyDataType.List, entityType="D", printName="格式", fieldLength=1)
	formatType,
	//
	@FlyElement(columnName="FQDN", name="Fully Qualified Domain Name", description="Fully Qualified Domain Name i.e. www.comdivision.com", help="This field contains the so called fully qualified domain name including host and domain, but not anything protocol specific like http or the document path.", dataType=FlyDataType.String, entityType="D", printName="Fully Qualified Domain Name", fieldLength=120)
	fQDN,
	//
	@FlyElement(columnName="FreightAmt", name="运费金额 ", description="运费金额 ", help="The Freight Amount indicates the amount charged for Freight in the document currency.", dataType=FlyDataType.Amount, entityType="D", printName="运费金额", fieldLength=22)
	freightAmt,
	//
	@FlyElement(columnName="FreightCostRule", name="运费成本规则", description="运费收费方法", help="The Freight Cost Rule indicates the method used when charging for freight.", dataType=FlyDataType.List, entityType="D", printName="运费成本规则", fieldLength=1)
	freightCostRule,
	//
	@FlyElement(columnName="Frequency", name="频率", description="事件的频率", help="The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks.", dataType=FlyDataType.Integer, entityType="D", printName="频率", fieldLength=22)
	frequency,
	//
	@FlyElement(columnName="FrequencyType", name="频率类型", description="事件的频率", help="The frequency type is used for calculating the date of the next event.", dataType=FlyDataType.List, entityType="D", printName="频率类型", fieldLength=1)
	frequencyType,
	//
	@FlyElement(columnName="FromClause", name="From子句", description="SQL的From子句", dataType=FlyDataType.Text, entityType="D", printName="From子句", fieldLength=2000)
	fromClause,
	//
	@FlyElement(columnName="FunctBG_PrintColor_ID", name="函数背景颜色", description="函数背景颜色", help="Background color of a function row", dataType=FlyDataType.Table, entityType="D", printName="函数背景颜色", fieldLength=22)
	functBGPrintColorID,
	//
	@FlyElement(columnName="FunctFG_PrintColor_ID", name="函数颜色", description="函数前景颜色", help="Foreground color of a function row", dataType=FlyDataType.Table, entityType="D", printName="函数颜色", fieldLength=22)
	functFGPrintColorID,
	//
	@FlyElement(columnName="FunctionColumn", name="函数列", description="Overwrite Column with Function ", help="The Function Column indicates that the column will be overridden with a function", dataType=FlyDataType.String, entityType="D", printName="函数列", fieldLength=60)
	functionColumn,
	//
	@FlyElement(columnName="FunctionPrefix", name="Function Prefix", description="Data sent before the function", dataType=FlyDataType.String, entityType="D", printName="Function Prefix", fieldLength=40)
	functionPrefix,
	//
	@FlyElement(columnName="FunctionSuffix", name="Function Suffix", description="Data sent after the function", dataType=FlyDataType.String, entityType="D", printName="Function Suffix", fieldLength=40)
	functionSuffix,
	//
	@FlyElement(columnName="Funct_PrintFont_ID", name="函数字体", description="函数行字体", help="函数行字体", dataType=FlyDataType.Table, entityType="D", printName="函数字体", fieldLength=22)
	functPrintFontID,
	//
	@FlyElement(columnName="FutureCostPrice", name="未来成本价格", dataType=FlyDataType.CostsPrices, entityType="D", printName="未来成本价格", fieldLength=22)
	futureCostPrice,
	//
	@FlyElement(columnName="GAAP", name="公认会计准则", description="公认会计准则", help="The GAAP identifies the account principles that this accounting schema will adhere to.", dataType=FlyDataType.List, entityType="D", printName="公认会计准则", fieldLength=2)
	gAAP,
	//
	@FlyElement(columnName="GenerateClass", name="Generate Class", description="Generate Class Button", dataType=FlyDataType.Button, entityType="D", printName="Generate Class", fieldLength=1)
	generateClass,
	//
	@FlyElement(columnName="GenerateList", name="产生目录", description="产生目录", dataType=FlyDataType.Button, entityType="D", printName="产生目录", fieldLength=1)
	generateList,
	//
	@FlyElement(columnName="GenerateOrder", name="生成定单", description="生成定单", dataType=FlyDataType.Button, entityType="D", printName="生成定单", fieldLength=1)
	generateOrder,
	//
	@FlyElement(columnName="GenerateReport", name="Generate Report", dataType=FlyDataType.NONE, entityType="D", printName="Generate Report", fieldLength=0)
	generateReport,
	//
	@FlyElement(columnName="GenerateTo", name="产生到", description="产生到", dataType=FlyDataType.Button, entityType="D", printName="产生到", fieldLength=1)
	generateTo,
	//
	@FlyElement(columnName="GL_BudgetControl_ID", name="Budget Control", description="Budget Control", help="Budget Control allows you to restrict the use of expenditures, commitments (Purchase Orders) and reservations (Requisitions). If defined, you may not be able to approve Requisitions, Purchase Orders, or AP Invoices.", dataType=FlyDataType.ID, entityType="D", printName="Budget Control", fieldLength=10)
	gLBudgetControlID,
	//
	@FlyElement(columnName="GL_Budget_ID", name="预算", description="通用分类帐预算", help="The General Ledger Budget identifies a user defined budget.  These can be used in reporting as a comparison against your actual amounts.", dataType=FlyDataType.TableDirect, entityType="D", printName="预算", fieldLength=22)
	gLBudgetID,
	//
	@FlyElement(columnName="GL_Category_ID", name="总帐分类", description="总帐分类", help="The General Ledger Category is an optional, user defined method of grouping journal lines.", dataType=FlyDataType.TableDirect, entityType="D", printName="总帐分类", fieldLength=22)
	gLCategoryID,
	//
	@FlyElement(columnName="GL_Distribution_ID", name="GL Distribution", description="General Ledger Distribution", help="If the account combination criteria of the Distribution is met, the posting to the account combination is replaced by the account combinations of the distribution lines.  The distribution is prorated based on the ratio of the lines. The distribution must be valid to be used.", dataType=FlyDataType.TableDirect, entityType="D", printName="GL Distribution", fieldLength=22)
	gLDistributionID,
	//
	@FlyElement(columnName="GL_DistributionLine_ID", name="GL Distribution Line", description="General Ledger Distribution Line", help="If the account combination criteria of the Distribution is met, the posting to the account combination is replaced by the account combinations of the distribution lines.  The distribution is prorated based on the ratio of the lines. ", dataType=FlyDataType.ID, entityType="D", printName="GL Distribution Line", fieldLength=22)
	gLDistributionLineID,
	//
	@FlyElement(columnName="GL_Fund_ID", name="GL Fund", description="General Ledger Funds Control", help="General Ledger Funds Control allows you to restrict the use of funds.  This is independent from budget control.", dataType=FlyDataType.ID, entityType="D", printName="GL Fund", fieldLength=10)
	gLFundID,
	//
	@FlyElement(columnName="GL_FundRestriction_ID", name="Fund Restriction", description="Restriction of Funds", help="If defined, you can use the fund only for the accounts selected.", dataType=FlyDataType.ID, entityType="D", printName="Fund Restriction", fieldLength=10)
	gLFundRestrictionID,
	//
	@FlyElement(columnName="GL_JournalBatch_ID", name="分类帐批次", description="通用分类帐分类帐批次", help="The General Ledger Journal Batch identifies a group of journals to be processed as a group.", dataType=FlyDataType.TableDirect, entityType="D", printName="分类帐批次", fieldLength=22)
	gLJournalBatchID,
	//
	@FlyElement(columnName="GL_Journal_ID", name="分类帐", description="通用分类帐分类帐", help="The General Ledger Journal identifies a group of journal lines which represent a logical business transaction", dataType=FlyDataType.ID, entityType="D", printName="分类帐", fieldLength=22)
	gLJournalID,
	//
	@FlyElement(columnName="GL_JournalLine_ID", name="分类帐明细", description="通用分类帐分类帐明细", help="The General Ledger Journal Line identifies a single transaction in a journal.", dataType=FlyDataType.ID, entityType="D", printName="分类帐明细", fieldLength=22)
	gLJournalLineID,
	//
	@FlyElement(columnName="GoalDisplay", name="Goal Display", description="Type of goal display on dashboard", help="Display goal on dashboard as html table or graph.", dataType=FlyDataType.List, entityType="D", printName="Goal Display", fieldLength=1)
	goalDisplay,
	//
	@FlyElement(columnName="GoalPerformance", name="经营目标", description="Target achievement from 0..1", help="The Goal Performance indicates the target achievement from 0 to 1.", dataType=FlyDataType.Number, entityType="D", printName="经营目标", fieldLength=22)
	goalPerformance,
	//
	@FlyElement(columnName="GoalRestrictionType", name="Restriction Type", description="Goal Restriction Type", help="Enter one or more records per Goal Restriction Type (e.g. Org o1, o2)", dataType=FlyDataType.List, entityType="D", printName="Restriction Type", fieldLength=1)
	goalRestrictionType,
	//
	@FlyElement(columnName="GoodForDays", name="Good for Days", description="Shelf Life Days remaning to Guarantee Date (minus minimum guarantee days)", help="Shelf Life of products with Guarantee Date instance compared to today minus the minimum guaranteed days.	(Guarantee Date-Today) – Min Guarantee Days", dataType=FlyDataType.Integer, entityType="D", printName="Good Days", fieldLength=22)
	goodForDays,
	//
	@FlyElement(columnName="GraceDays", name="宽限天数", description="Days after due date to send first dunning letter", help="The Grace Days indicates the number of days after the due date to send the first dunning letter.  This field displays only if the send dunning letters checkbox has been selected.", dataType=FlyDataType.Integer, entityType="D", printName="宽限天数", fieldLength=22)
	graceDays,
	//
	@FlyElement(columnName="GrandTotal", name="总计", description="文件的总金额", help="The Grand Total displays the total amount including Tax and Freight in document currency", dataType=FlyDataType.Amount, entityType="D", printName="总计", fieldLength=22)
	grandTotal,
	//
	@FlyElement(columnName="GraphType", name="图表类型", description="图表类型", help="图表类型", dataType=FlyDataType.List, entityType="D", printName="图表类型", fieldLength=1)
	graphType,
	//
	@FlyElement(columnName="Green", name="绿色", description="RGB 值 ", dataType=FlyDataType.Integer, entityType="D", printName="绿色", fieldLength=22)
	green,
	//
	@FlyElement(columnName="Green_1", name="第二个绿色", description="RGB 第二颜色值", dataType=FlyDataType.Integer, entityType="D", printName="第二个绿色", fieldLength=22)
	green1,
	//
	@FlyElement(columnName="Greeting", name="称谓", description="For letters, e.g. 'Dear {0}' or 'Dear Mr. {0}' - At runtime, '{0}' is replaced by the name", help="The Greeting indicates what will print on letters sent to a Business Partner.", dataType=FlyDataType.String, entityType="D", printName="称谓", fieldLength=60)
	greeting,
	//
	@FlyElement(columnName="GrossRAmt", name="Gross Amount", description="Gross Remuneration Amount", help="Gross Salary or Wage Amount (without Overtime, Benefits and Employer overhead)", dataType=FlyDataType.Amount, entityType="D", printName="Gross", fieldLength=22)
	grossRAmt,
	//
	@FlyElement(columnName="GrossRCost", name="Gross Cost", description="Gross Remuneration Costs", help="Gross Salary or Wage Costs (without Overtime, with Benefits and Employer overhead)", dataType=FlyDataType.CostsPrices, entityType="D", printName="Gross Cost", fieldLength=22)
	grossRCost,
	//
	@FlyElement(columnName="Group1", name="Group1", dataType=FlyDataType.String, entityType="D", printName="Group1", fieldLength=255)
	group1,
	//
	@FlyElement(columnName="Group2", name="Group2", dataType=FlyDataType.String, entityType="D", printName="Group2", fieldLength=255)
	group2,
	//
	@FlyElement(columnName="GroupValue", name="组关键字", description="业务伙伴组关键字", dataType=FlyDataType.String, entityType="D", printName="组关键字", fieldLength=40)
	groupValue,
	//
	@FlyElement(columnName="GuaranteeDate", name="保证日期", description="保证期满日", help="Date when the normal guarantee or availability expires", dataType=FlyDataType.Date, entityType="D", printName="保证日期", fieldLength=7)
	guaranteeDate,
	//
	@FlyElement(columnName="GuaranteeDays", name="保证天数", description="Number of days the product is guaranteed or available", help="If the value is 0, there is no limit to the availability or guarantee, otherwise the guarantee date is calculated by adding the days to the delivery date.", dataType=FlyDataType.Integer, entityType="D", printName="保证天数", fieldLength=22)
	guaranteeDays,
	//
	@FlyElement(columnName="GuaranteeDaysMin", name="Min Guarantee Days", description="Minumum number of guarantee days", help="When selecting batch/products with a guarantee date, the minimum left guarantee days for automatic picking.  You can pick any batch/product manually. ", dataType=FlyDataType.Integer, entityType="D", printName="Min Guarantee", fieldLength=22)
	guaranteeDaysMin,
	//
	@FlyElement(columnName="HasAlias", name="使用帐户别名", description="Ability to select (partial) account combinations by an Alias", help="The Alias checkbox indicates that account combination can be selected using a user defined alias or short key.", dataType=FlyDataType.YesNo, entityType="D", printName="别名", fieldLength=1)
	hasAlias,
	//
	@FlyElement(columnName="HasCharges", name="费用", description="Charges can be added to the document", help="The Charges checkbox indicates that charges can be added to this document.  Charges can include items like shipping, handling or bank charges.", dataType=FlyDataType.YesNo, entityType="D", printName="费用", fieldLength=1)
	hasCharges,
	//
	@FlyElement(columnName="HasCombination", name="使用组合控制", description="Combination of account elements are checked", help="The Combination Control checkbox indicates if the combination of account elements will be verified against the defined acceptable combination.", dataType=FlyDataType.YesNo, entityType="D", printName="组合控制", fieldLength=1)
	hasCombination,
	//
	@FlyElement(columnName="HasPostal_Add", name="附加的邮政编码", description="有附加的邮政编码", help="The Additional Postal Code checkbox indicates if this address uses an additional Postal Code.  If it is selected an additional field displays for entry of the additional Postal Code.", dataType=FlyDataType.YesNo, entityType="D", printName="附加的邮政编码", fieldLength=1)
	hasPostalAdd,
	//
	@FlyElement(columnName="HasProforma", name="预格式发票", description="Indicates if Pro Forma Invoices can be generated from this document", help="The Pro Forma Invoice checkbox indicates if pro forma invoices can be generated from this sales document. A pro forma invoice indicates the amount that will be due should an order be shipped.", dataType=FlyDataType.YesNo, entityType="D", printName="预格式发票", fieldLength=1)
	hasProforma,
	//
	@FlyElement(columnName="HasRegion", name="该国有(省级)区划", description="该国有(省级)区划", help="The Country has Region checkbox is selected if the Country being defined is divided into regions.  If this checkbox is selected, the Region Tab is accessible.", dataType=FlyDataType.YesNo, entityType="D", printName="该国有(省级)区划", fieldLength=1)
	hasRegion,
	//
	@FlyElement(columnName="HasRole", name="HasRole", description="Has Role Y/N", dataType=FlyDataType.List, entityType="D", printName="Has Role Y/N", fieldLength=1)
	hasRole,
	//
	@FlyElement(columnName="HasSubMenu", name="Has SubMenu", dataType=FlyDataType.YesNo, entityType="D", printName="Has SubMenu", fieldLength=1)
	hasSubMenu,
	//
	@FlyElement(columnName="HasSupplyDemand", name="Has Supply/Demand", description="This product has supply or demand in the current Replenish Plan run.", dataType=FlyDataType.YesNo, entityType="D", printName="Has Supply/Demand", fieldLength=1)
	hasSupplyDemand,
	//
	@FlyElement(columnName="HasTree", name="有树", description="窗口有树", help="The Has Tree checkbox indicates if this window displays a tree metaphor.", dataType=FlyDataType.YesNo, entityType="D", printName="有树", fieldLength=1)
	hasTree,
	//
	@FlyElement(columnName="HdrLine_PrintColor_ID", name="头明细颜色", description="表抬头线颜色", help="Color of the table header row lines", dataType=FlyDataType.Table, entityType="D", printName="头明细颜色", fieldLength=22)
	hdrLinePrintColorID,
	//
	@FlyElement(columnName="Hdr_PrintFont_ID", name="抬头字型", description="抬头字型", help="表抬头的字型", dataType=FlyDataType.Table, entityType="D", printName="抬头字型", fieldLength=22)
	hdrPrintFontID,
	//
	@FlyElement(columnName="HdrStroke", name="Header Stroke", description="Width of the Header Line Stroke", help="The width of the header line stroke (line thickness) in Points.", dataType=FlyDataType.Number, entityType="D", printName="Hdr Stroke", fieldLength=22)
	hdrStroke,
	//
	@FlyElement(columnName="HdrStrokeType", name="Header Stroke Type", description="Type of the Header Line Stroke", help="Type of the line printed", dataType=FlyDataType.List, entityType="D", printName="Hdr Stroke Type", fieldLength=1)
	hdrStrokeType,
	//
	@FlyElement(columnName="HdrTextBG_PrintColor_ID", name="抬头 BG 颜色", description="Background color of header row", help="Table header row background color", dataType=FlyDataType.Table, entityType="D", printName="抬头亿位元组颜色", fieldLength=22)
	hdrTextBGPrintColorID,
	//
	@FlyElement(columnName="HdrTextFG_PrintColor_ID", name="抬头颜色", description="Foreground color if the table header row", help="Table header row foreground color", dataType=FlyDataType.Table, entityType="D", printName="抬头颜色", fieldLength=22)
	hdrTextFGPrintColorID,
	//
	@FlyElement(columnName="HeaderCenter", name="Header Center", description="Content of the center portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Center", fieldLength=255)
	headerCenter,
	//
	@FlyElement(columnName="HeaderLeft", name="Header Left", description="Content of the left portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Left", fieldLength=255)
	headerLeft,
	//
	@FlyElement(columnName="HeaderMargin", name="抬头边距", description="Margin of the Header in 1 72 of an inch", help="Distance from the top of the printable page to the start of the main content in 1 72 of an inch (point)", dataType=FlyDataType.Integer, entityType="D", printName="抬头边距", fieldLength=22)
	headerMargin,
	//
	@FlyElement(columnName="HeaderRight", name="Header Right", description="Content of the right portion of the header.", dataType=FlyDataType.String, entityType="D", printName="Header Right", fieldLength=255)
	headerRight,
	//
	@FlyElement(columnName="Help", name="注释/帮助", description="注释或提示", help="The Help field contains a hint, comment or help about the use of this item.", dataType=FlyDataType.Text, entityType="D", printName="注释", fieldLength=2000)
	help,
	//
	@FlyElement(columnName="HistoryYears", name="HistoryYears", description="Number of years prior to current year to create in calendar", dataType=FlyDataType.Integer, entityType="D", printName="History Years", fieldLength=22)
	historyYears,
	//
	@FlyElement(columnName="HostAddress", name="主机地址", description="主人地址网址或 DNS", help="The Host Address identifies the URL or DNS of the target host", dataType=FlyDataType.String, entityType="D", printName="主机地址", fieldLength=60)
	hostAddress,
	//
	@FlyElement(columnName="HostPort", name="主机端口", description="主办沟通港口", help="The Host Port identifies the port to communicate with the host.", dataType=FlyDataType.Integer, entityType="D", printName="主机端口", fieldLength=22)
	hostPort,
	//
	@FlyElement(columnName="HTML", name="HTML", dataType=FlyDataType.LongText, entityType="D", printName="HTML", fieldLength=0)
	hTML,
	//
	@FlyElement(columnName="Hyphen", name="Hyphen", dataType=FlyDataType.String, entityType="D", printName="Hyphen", fieldLength=20)
	hyphen,
	//
	@FlyElement(columnName="I_Asset_ID", name="Asset", dataType=FlyDataType.ID, entityType="D", printName="Asset", fieldLength=22)
	iAssetID,
	//
	@FlyElement(columnName="IBAN", name="IBAN", description="International Bank Account Number", help="If your bank provides an International Bank Account Number, enter it here	Details ISO 13616 and http://www.ecbs.org. The account number has the maximum length of 22 characters (without spaces). The IBAN is often printed with a apace after 4 characters. Do not enter the spaces in Adempiere.", dataType=FlyDataType.String, entityType="D", printName="IBAN", fieldLength=40)
	iBAN,
	//
	@FlyElement(columnName="I_BankStatement_ID", name="导入银行对帐单", description="银行对帐单的导入", dataType=FlyDataType.ID, entityType="D", printName="导入银行对帐单", fieldLength=22)
	iBankStatementID,
	//
	@FlyElement(columnName="I_BPartner_ID", name="导入业务伙伴", dataType=FlyDataType.ID, entityType="D", printName="Import B.Partner", fieldLength=22)
	iBPartnerID,
	//
	@FlyElement(columnName="I_Budget_ID", name="I_Budget_ID", dataType=FlyDataType.NONE, entityType="D", printName="I_Budget_ID", fieldLength=0)
	iBudgetID,
	//
	@FlyElement(columnName="I_Conversion_Rate_ID", name="Import Conversion Rate", description="Import Currency Conversion Rate", dataType=FlyDataType.ID, entityType="D", printName="Import Conversion Rate", fieldLength=22)
	iConversionRateID,
	//
	@FlyElement(columnName="IDRangeEnd", name="ID范围结束", description="是否ID范围用，结束", help="The ID Range allows to restrict the range of the internally used IDs. Please note that the ID range is NOT enforced.", dataType=FlyDataType.Number, entityType="D", printName="ID结束", fieldLength=22)
	iDRangeEnd,
	//
	@FlyElement(columnName="IDRangeStart", name="ID范围开始", description="ID范围的开始用", help="The ID Range allows to restrict the range of the internally used IDs. The standard rages are 0-899,999 for the Application Dictionary 900,000-999,999 for Application Dictionary customizations extensions and > 1,000,000 for client data. The standard system limit is 9,999,999,999 but can easily be extended.  The ID range is on a per table basis.	Please note that the ID range is NOT enforced.", dataType=FlyDataType.Number, entityType="D", printName="ID开始", fieldLength=22)
	iDRangeStart,
	//
	@FlyElement(columnName="I_ElementValue_ID", name="导入帐户", description="导入帐户值", dataType=FlyDataType.ID, entityType="D", printName="导入帐户", fieldLength=22)
	iElementValueID,
	//
	@FlyElement(columnName="I_ErrorMsg", name="导入错误信息", description="Messages generated from import process", help="The Import Error Message displays any error messages generated during the import process.", dataType=FlyDataType.String, entityType="D", printName="导入错误信息", fieldLength=2000)
	iErrorMsg,
	//
	@FlyElement(columnName="I_FAJournal_ID", name="FA Journal", dataType=FlyDataType.Integer, entityType="D", printName="FA Journal", fieldLength=22)
	iFAJournalID,
	//
	@FlyElement(columnName="I_FixedAsset_ID", name="Imported Fixed Asset", dataType=FlyDataType.NONE, entityType="D", printName="Imported Fixed Asset", fieldLength=0)
	iFixedAssetID,
	//
	@FlyElement(columnName="I_GLJournal_ID", name="导入总帐分类帐", description="Import General Ledger Journal", dataType=FlyDataType.ID, entityType="D", printName="导入总帐分类帐", fieldLength=22)
	iGLJournalID,
	//
	@FlyElement(columnName="IgnorePrevProduction", name="IgnorePrevProduction", description="IgnorePrevProduction", help="IgnorePrevProduction", dataType=FlyDataType.YesNo, entityType="D", printName="IgnorePrevProduction", fieldLength=1)
	ignorePrevProduction,
	//
	@FlyElement(columnName="I_InOutLineConfirm_ID", name="Ship/Receipt Confirmation Import Line", description="Material Shipment or Receipt Confirmation Import Line", help="Import Confirmation Line Details", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm Import Line", fieldLength=22)
	iInOutLineConfirmID,
	//
	@FlyElement(columnName="I_Inventory_ID", name="导入库存", description="导入库存交易", dataType=FlyDataType.ID, entityType="D", printName="导入库存", fieldLength=22)
	iInventoryID,
	//
	@FlyElement(columnName="I_Invoice_ID", name="导入发票", description="导入发票", dataType=FlyDataType.ID, entityType="D", printName="导入发票", fieldLength=22)
	iInvoiceID,
	//
	@FlyElement(columnName="I_IsImported", name="已导入", description="Has this import been processed", help="The Imported check box indicates if this import has been processed.", dataType=FlyDataType.YesNo, entityType="D", printName="已导入", fieldLength=1)
	iIsImported,
	//
	@FlyElement(columnName="ImageAlpha", name="图像阿尔发 ", description="图像织法含有种种要素的阿尔发", help="Composite Alpha factor for taint color.", dataType=FlyDataType.Number, entityType="D", printName="图像阿尔发 ", fieldLength=22)
	imageAlpha,
	//
	@FlyElement(columnName="ImageIsAttached", name="图像附件", description="The image to be printed is attached to the record", help="The image to be printed is stored in the database as attachment to this record. The image can be a gif, jpeg or png.", dataType=FlyDataType.YesNo, entityType="D", printName="图像附件", fieldLength=1)
	imageIsAttached,
	//
	@FlyElement(columnName="ImageLink", name="Image Link", dataType=FlyDataType.String, entityType="D", printName="Image Link", fieldLength=510)
	imageLink,
	//
	@FlyElement(columnName="ImageURL", name="图像网址", description="图像的网址", help="URL of image; The image is not stored in the database, but retrieved at runtime. The image can be a gif, jpeg or png.", dataType=FlyDataType.URL, entityType="D", printName="图像网址", fieldLength=120)
	imageURL,
	//
	@FlyElement(columnName="ImportFields", name="导入字段", description="Create Fields from Table Columns", dataType=FlyDataType.Button, entityType="D", printName="导入字段", fieldLength=1)
	importFields,
	//
	@FlyElement(columnName="ImportTable", name="导入表", description="Import Table Columns from Database", dataType=FlyDataType.Button, entityType="D", printName="导入表", fieldLength=1)
	importTable,
	//
	@FlyElement(columnName="InactivityAlertDays", name="Inactivity Alert Days", description="Send Alert when there is no activity after days (0= no alert)", help="An email alert is sent when the request shows no activity for the number of days defined.", dataType=FlyDataType.Integer, entityType="D", printName="Inactivity Alert Days", fieldLength=22)
	inactivityAlertDays,
	//
	@FlyElement(columnName="Included_Role_ID", name="Included Role", dataType=FlyDataType.Table, entityType="D", printName="Included Role", fieldLength=10)
	includedRoleID,
	//
	@FlyElement(columnName="Included_Tab_ID", name="已包括定位键", description="Included Tab in this Tab (Master Dateail)", help="You can include a Tab in a Tab. If displayed in single row record, the included tab is displayed as multi-row table.", dataType=FlyDataType.Table, entityType="D", printName="已包括定位键", fieldLength=22)
	includedTabID,
	//
	@FlyElement(columnName="IncludeInDispute", name="Include Disputed", description="Include disputed Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Include Disputed", fieldLength=0)
	includeInDispute,
	//
	@FlyElement(columnName="IncomeSummary_Acct", name="收入汇总帐户", description="收入汇总帐户 ", dataType=FlyDataType.Account, entityType="D", printName="收入汇总帐户", fieldLength=22)
	incomeSummaryAcct,
	//
	@FlyElement(columnName="IncrementNo", name="增量", description="The number to increment the last document number by", help="The Increment indicates the number to increment the last document number by to arrive at the next sequence number", dataType=FlyDataType.Integer, entityType="D", printName="增量", fieldLength=22)
	incrementNo,
	//
	@FlyElement(columnName="IndexQuery", name="Index Query", description="Text Search Query ", help="Text search query entered", dataType=FlyDataType.String, entityType="D", printName="Query", fieldLength=255)
	indexQuery,
	//
	@FlyElement(columnName="IndexQueryResult", name="Query Result", description="Result of the text query", dataType=FlyDataType.Integer, entityType="D", printName="Result", fieldLength=10)
	indexQueryResult,
	//
	@FlyElement(columnName="IndustryInfo", name="行业信息", description="行业的信息 (如.专业服务, 家具分销, ..)", help="Description if the industry ad precise as possible.", dataType=FlyDataType.Text, entityType="D", printName="行业信息", fieldLength=255)
	industryInfo,
	//
	@FlyElement(columnName="Info", name="信息", description="数据", help="The Information displays data from the source document line.", dataType=FlyDataType.Text, entityType="D", printName="信息", fieldLength=4000)
	info,
	//
	@FlyElement(columnName="InfoFactoryClass", name="Info Factory Class", description="Fully qualified class name that implements the InfoFactory interface", help="Fully qualified class name that implements the InfoFactory interface. This can be use to provide custom Info class for column.", dataType=FlyDataType.String, entityType="D", printName="Info Factory Class", fieldLength=255)
	infoFactoryClass,
	//
	@FlyElement(columnName="Info_To", name="信息到", dataType=FlyDataType.String, entityType="D", printName="信息到", fieldLength=60)
	infoTo,
	//
	@FlyElement(columnName="InOut_ID", name="Shipment/Receipt", description="MaterialShipment Document", help="The Material Shipment / Receipt ", dataType=FlyDataType.Search, entityType="D", printName="Shipment/Receipt", fieldLength=22)
	inOutID,
	//
	@FlyElement(columnName="Instructions", name="Instructions", dataType=FlyDataType.Memo, entityType="D", printName="Instructions", fieldLength=1000)
	instructions,
	//
	@FlyElement(columnName="IntercompanyDueFrom_Acct", name="公司间应收帐户", description="Intercompany Due From   Receivables Account", help="The Intercompany Due From account indicates the account that represents money owed to this organization from other organizations.", dataType=FlyDataType.Account, entityType="D", printName="公司间应收帐户", fieldLength=22)
	intercompanyDueFromAcct,
	//
	@FlyElement(columnName="IntercompanyDueTo_Acct", name="公司间应付帐户", description="Intercompany Due To   Payable Account", help="The Intercompany Due To Account indicates the account that represents money owed to other organizations.", dataType=FlyDataType.Account, entityType="D", printName="公司间应付帐户", fieldLength=22)
	intercompanyDueToAcct,
	//
	@FlyElement(columnName="InterestAmt", name="关心点金额", description="关心点金额", help="The Interest Amount indicates any interest charged or received on a Bank Statement.", dataType=FlyDataType.Amount, entityType="D", printName="关心点", fieldLength=22)
	interestAmt,
	//
	@FlyElement(columnName="InterestAreaName", name="Interest Area", description="Name of the Interest Area", help="Name of the Interest Area of the user", dataType=FlyDataType.String, entityType="D", printName="Interest Area", fieldLength=40)
	interestAreaName,
	//
	@FlyElement(columnName="InterestPercent", name="关心点占百分比", description="Percentage interest to charge on overdue invoices", help="The Interest amount in percent indicates the interest to be charged on overdue invoices.  This field displays only if the charge interest checkbox has been selected.", dataType=FlyDataType.Number, entityType="D", printName="关心点占百分比", fieldLength=22)
	interestPercent,
	//
	@FlyElement(columnName="InventoryCountSet", name="Set Inventory Count to", description="Set the value of the inventory count to Zero or On Hand Quantity", dataType=FlyDataType.NONE, entityType="D", printName="Set Inventory Count to", fieldLength=0)
	inventoryCountSet,
	//
	@FlyElement(columnName="InventoryNo", name="Inventory No", dataType=FlyDataType.NONE, entityType="D", printName="Inventory No", fieldLength=0)
	inventoryNo,
	//
	@FlyElement(columnName="InventoryType", name="Inventory Type", description="Type of inventory difference", help="The type of inventory difference determines which account is used. The default is the Inventory Difference account defined for the warehouse.  Alternatively, you could select any charge.  This allows you to account for Internal Use or extraordinary inventory losses.", dataType=FlyDataType.List, entityType="D", printName="Inventory Type", fieldLength=1)
	inventoryType,
	//
	@FlyElement(columnName="InvertAccountSign", name="Invert Account Sign", description="Enable invert account sign when a GL Distribution rule applied", help="for instance:		Original:		Debit Expense 1000	Credit Account Payable 1000 		Result :		Debit Account Payable 1000 	Credit Expense 1000	", dataType=FlyDataType.YesNo, entityType="D", printName="Invert Account Sign", fieldLength=1)
	invertAccountSign,
	//
	@FlyElement(columnName="InvoiceAmt", name="Invoice Amt", dataType=FlyDataType.Amount, entityType="D", printName="Invoice Amt", fieldLength=22)
	invoiceAmt,
	//
	@FlyElement(columnName="InvoiceCollectionType", name="Collection Status", description="Invoice Collection Status", help="Status of the invoice collection process", dataType=FlyDataType.List, entityType="D", printName="Collection Status", fieldLength=1)
	invoiceCollectionType,
	//
	@FlyElement(columnName="InvoicedAmt", name="已开票金额", description="已开票金额", help="已开票金额", dataType=FlyDataType.Amount, entityType="D", printName="已开票金额", fieldLength=22)
	invoicedAmt,
	//
	@FlyElement(columnName="InvoiceDay", name="开票日", description="发票产生日", help="The Invoice Day indicates the day of invoice generation.  If twice monthly, the second time is 15 days after this day.", dataType=FlyDataType.Integer, entityType="D", printName="开票日", fieldLength=22)
	invoiceDay,
	//
	@FlyElement(columnName="InvoiceDayCutoff", name="含交货发票日", description="包括交货的最后日期", help="The Invoice Day Cut Off indicates the last day for shipments to be included in the current invoice schedule.  For example, if the invoice schedule is defined for the first day of the month, the cut off day may be the 25th of the month.  An shipment on the 24th of May would be included in the invoices sent on June 1st but a shipment on the 26th would be included in the invoices sent on July 1st.", dataType=FlyDataType.Integer, entityType="D", printName="含交货发票日", fieldLength=22)
	invoiceDayCutoff,
	//
	@FlyElement(columnName="InvoiceDocumentNo", name="发票文件号", description="Document Number of the Invoice", dataType=FlyDataType.String, entityType="D", printName="发票文件号", fieldLength=30)
	invoiceDocumentNo,
	//
	@FlyElement(columnName="InvoicedQty", name="已开票数量", description="The Quantity Invoiced", dataType=FlyDataType.Quantity, entityType="D", printName="已开票数量", fieldLength=22)
	invoicedQty,
	//
	@FlyElement(columnName="InvoiceFrequency", name="开发票频率", description="How often invoices will be generated", help="The Invoice Frequency indicates the frequency of invoice generation for a Business Partner.", dataType=FlyDataType.List, entityType="D", printName="开发票频率", fieldLength=1)
	invoiceFrequency,
	//
	@FlyElement(columnName="Invoice_MailText_ID", name="发票邮件本文", description="Email text used for sending invoices", help="Standard email template used to send invoices as attachments.", dataType=FlyDataType.Table, entityType="D", printName="Invoice Mail Text", fieldLength=22)
	invoiceMailTextID,
	//
	@FlyElement(columnName="InvoicePrice", name="发票价格", description="Unit price to be invoiced or 0 for default price", help="Unit Price in the currency of the business partner!  If it is 0, the standard price of the sales price list of the business partner (customer) is used.", dataType=FlyDataType.CostsPrices, entityType="D", printName="发票价格", fieldLength=22)
	invoicePrice,
	//
	@FlyElement(columnName="Invoice_PrintFormat_ID", name="发票打印格式", description="Print Format for printing Invoices", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="发票打印格式", fieldLength=22)
	invoicePrintFormatID,
	//
	@FlyElement(columnName="InvoiceRule", name="发票规则", description="Frequency and method of invoicing ", help="The Invoice Rule defines how a Business Partner is invoiced and the frequency of invoicing.", dataType=FlyDataType.List, entityType="D", printName="发票规则", fieldLength=1)
	invoiceRule,
	//
	@FlyElement(columnName="InvoiceWeekDay", name="开发票星期日", description="发票产生日", help="The Invoice Week Day indicates the day of the week to generate invoices.", dataType=FlyDataType.List, entityType="D", printName="开发票星期日", fieldLength=1)
	invoiceWeekDay,
	//
	@FlyElement(columnName="InvoiceWeekDayCutoff", name="含交货发票星期几", description="包括交货的最后星期几", help="The Invoice Week Day Cutoff indicates the last day of the week a shipment must be made to be included in the invoice schedule.", dataType=FlyDataType.List, entityType="D", printName="周日近路", fieldLength=1)
	invoiceWeekDayCutoff,
	//
	@FlyElement(columnName="I_Order_ID", name="导入定单", description="导入定单", dataType=FlyDataType.ID, entityType="D", printName="导入定单", fieldLength=22)
	iOrderID,
	//
	@FlyElement(columnName="IP_Address", name="IP Address", description="Defines the IP address to transfer data to", help="Contains info on the IP address to which we will transfer data", dataType=FlyDataType.String, entityType="D", printName="IP Address", fieldLength=20)
	iPAddress,
	//
	@FlyElement(columnName="I_Payment_ID", name="导入付款", description="导入付款", dataType=FlyDataType.ID, entityType="D", printName="导入付款", fieldLength=22)
	iPaymentID,
	//
	@FlyElement(columnName="I_PriceList_ID", name="Import Price List", dataType=FlyDataType.ID, entityType="D", printName="Import Price List", fieldLength=22)
	iPriceListID,
	//
	@FlyElement(columnName="I_Product_ID", name="导入产品", description="导入项目或维修", dataType=FlyDataType.ID, entityType="D", printName="导入产品", fieldLength=22)
	iProductID,
	//
	@FlyElement(columnName="I_ReportLine_ID", name="导入报表行集合", description="导入报表行集合", dataType=FlyDataType.ID, entityType="D", printName="导入报表行集合", fieldLength=22)
	iReportLineID,
	//
	@FlyElement(columnName="IsAbort", name="Abort Process", description="Aborts the current process", dataType=FlyDataType.NONE, entityType="D", printName="Abort Process", fieldLength=0)
	isAbort,
	//
	@FlyElement(columnName="IsAccessAllOrgs", name="Access all Orgs", description="Access all Organizations (no org access control) of the client", help="When selected, the role has access to all organizations of the client automatically. This also increases performance where you have many organizations.", dataType=FlyDataType.YesNo, entityType="D", printName="Access all Orgs", fieldLength=1)
	isAccessAllOrgs,
	//
	@FlyElement(columnName="IsAccrual", name="责权发生制", description="Indicates if Accrual or Cash Based accounting will be used", help="The Accrual checkbox indicates if this accounting schema will use accrual based account or cash based accounting.  The Accrual method recognizes revenue when the product or service is delivered.  Cash based method recognizes income when then payment is received.", dataType=FlyDataType.YesNo, entityType="D", printName="责权发生制", fieldLength=1)
	isAccrual,
	//
	@FlyElement(columnName="IsACH", name="ACH", description="自动票据交换所", help="The ACH checkbox indicates if this Bank Account accepts ACH transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="ACH", fieldLength=1)
	isACH,
	//
	@FlyElement(columnName="IsAchieved", name="达成", description="目标被达成", help="The Achieved checkbox indicates if this goal has been achieved.", dataType=FlyDataType.YesNo, entityType="D", printName="达成", fieldLength=1)
	isAchieved,
	//
	@FlyElement(columnName="IsActive", name="有效", description="本记录有效", help="There are two methods of making records unavailable in the system: One is to delete the record, the other is to de-activate the record. A de-activated record is not available for selection, but available for reports.	There are two reasons for de-activating and not deleting records:	(1) The system requires the record for audit purposes.	(2) The record is referenced by other records. E.g., you cannot delete a Business Partner, if there are invoices for this partner record existing. You de-activate the Business Partner and prevent that this record is used for future entries.", dataType=FlyDataType.YesNo, entityType="D", printName="有效", fieldLength=1)
	isActive,
	//
	@FlyElement(columnName="IsActivityDim", name="Activity Dimension", description="Include Activity as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Activity Dimension", fieldLength=1)
	isActivityDim,
	//
	@FlyElement(columnName="IsAddressLinesLocalReverse", name="反转本地地址行的顺序", description="Print Local Address in reverse Order", help="If NOT selected the local sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country.	If selected the local sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1.	The sequence of City/Region/Postal is determined by the local address format.	", dataType=FlyDataType.YesNo, entityType="D", printName="反转本地地址", fieldLength=1)
	isAddressLinesLocalReverse,
	//
	@FlyElement(columnName="IsAddressLinesReverse", name="反转地址行的顺序", description="Print Address in reverse Order", help="If NOT selected the sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country.	If selected the sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1.	The sequence of City/Region/Postal is determined by the address format.", dataType=FlyDataType.YesNo, entityType="D", printName="反转地址", fieldLength=1)
	isAddressLinesReverse,
	//
	@FlyElement(columnName="IsAdFlag", name="Special AD Flag", description="Do we need to specially mention this ad?", help="If we have a block in content where announce content and also sponsored links we should mention the sponsored ones", dataType=FlyDataType.YesNo, entityType="D", printName="Special AD Flag", fieldLength=1)
	isAdFlag,
	//
	@FlyElement(columnName="IsAdhocConversion", name="特殊转变", description="Perform conversion for all amounts to currency", help="If a currency is selected, only this currency will be reported. If adhoc conversion is selected, all currencies are converted to the defined currency", dataType=FlyDataType.YesNo, entityType="D", printName="特殊转变", fieldLength=1)
	isAdhocConversion,
	//
	@FlyElement(columnName="IsAdjustCOGS", name="Adjust COGS", description="Adjust Cost of Good Sold", help="For Invoice costing methods, you can adjust the cost of goods sold. At the time of shipment, you may not have received the invoice for the receipt or cost adjustments like freight, customs, etc.", dataType=FlyDataType.YesNo, entityType="D", printName="Adjust COGS", fieldLength=1)
	isAdjustCOGS,
	//
	@FlyElement(columnName="IsAdvancedTab", name="Advanced Tab", description="This Tab contains advanced Functionality", help="The tab with advanced functionality is only displayed, if enabled in Tools>Preference.", dataType=FlyDataType.YesNo, entityType="D", printName="Advanced Tab", fieldLength=1)
	isAdvancedTab,
	//
	@FlyElement(columnName="IsAlert", name="Alert", description="Display alert message when referenced record is accessed", dataType=FlyDataType.NONE, entityType="D", printName="Alert", fieldLength=0)
	isAlert,
	//
	@FlyElement(columnName="IsAllCurrencies", name="Include All Currencies", description="Report not just foreign currency Invoices", dataType=FlyDataType.YesNo, entityType="D", printName="All Currencies", fieldLength=1)
	isAllCurrencies,
	//
	@FlyElement(columnName="IsAllNodes", name="所有结点", description="包括所有结点（完全树）", dataType=FlyDataType.YesNo, entityType="D", printName="所有结点", fieldLength=1)
	isAllNodes,
	//
	@FlyElement(columnName="IsAllocated", name="已分派", description="Indicates if the payment has been allocated", help="The Allocated checkbox indicates if a payment has been allocated or associated with an invoice or invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="已分派", fieldLength=1)
	isAllocated,
	//
	@FlyElement(columnName="IsAllowCopy", name="Allow Copy", description="Defines whether the value of this field is considered in the copy of record", help="The default value is yes, it is recommended that values such as ID, document action, document status  should be defined as no.", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Copy", fieldLength=1)
	isAllowCopy,
	//
	@FlyElement(columnName="IsAllowLogging", name="Allow Logging", description="Determine if a column must be recorded into the change log", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Logging", fieldLength=1)
	isAllowLogging,
	//
	@FlyElement(columnName="IsAllowNegative", name="Allow Negative", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Negative", fieldLength=1)
	isAllowNegative,
	//
	@FlyElement(columnName="IsAllowNegativePosting", name="Allow Negative Posting", description="Allow to post negative accounting values", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Negative Posting", fieldLength=1)
	isAllowNegativePosting,
	//
	@FlyElement(columnName="IsAllowOppositeSign", name="Allow Opposite Sign", description="Allow column values to be displayed with the opposite sign", help="Allows values to be displayed with the opposite sign to the calculated value if the 'Show Opposite Sign' flag is set on the Report Line. Note that all report calculations are performed before the sign is reversed.", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Opposite Sign", fieldLength=1)
	isAllowOppositeSign,
	//
	@FlyElement(columnName="IsAllowPositive", name="Allow Positive", dataType=FlyDataType.YesNo, entityType="D", printName="Allow Positive", fieldLength=1)
	isAllowPositive,
	//
	@FlyElement(columnName="IsAllowPublish", name="允许公开信息", description="You allow to publish the information, not just statistical summary info", dataType=FlyDataType.YesNo, entityType="D", printName="信息公开", fieldLength=1)
	isAllowPublish,
	//
	@FlyElement(columnName="IsAllowRMA", name="Allow RMA", description="Allow to consider RMA", help="When active, RMAs are considered", dataType=FlyDataType.YesNo, entityType="D", printName="Allow RMA", fieldLength=1)
	isAllowRMA,
	//
	@FlyElement(columnName="IsAllowStatistics", name="允许统计", description="Allow to transfer general statistics (number of clients, orgs, business partners, users, products, invoices)", help="Allow to transfer general statistics (number of clients, orgs, business partners, users, products, invoices) to get a better feeling for the size of the application.  This information is not published.", dataType=FlyDataType.YesNo, entityType="D", printName="允许统计", fieldLength=1)
	isAllowStatistics,
	//
	@FlyElement(columnName="IsAlwaysUpdateable", name="Always Updateable", description="The column is always updateable, even if the record is not active or processed", help="If selected and if the winow / tab is not read only, you can always update the column.  This might be useful for comments, etc.", dataType=FlyDataType.YesNo, entityType="D", printName="Always Updateable", fieldLength=1)
	isAlwaysUpdateable,
	//
	@FlyElement(columnName="IsAmount", name="金额限制", description="只在金额超过允许值时发出发票", help="The Amount Limit checkbox indicates if invoices will be sent out if they are below the entered limit.   	", dataType=FlyDataType.YesNo, entityType="D", printName="金额限制", fieldLength=1)
	isAmount,
	//
	@FlyElement(columnName="isApply", name="Apply Script", dataType=FlyDataType.YesNo, entityType="D", printName="Apply Script", fieldLength=1)
	isApply,
	//
	@FlyElement(columnName="IsApproved", name="已批准", description="指示该文档是否需要批准", help="The Approved checkbox indicates if this document requires approval before it can be processed.", dataType=FlyDataType.YesNo, entityType="D", printName="已批准", fieldLength=1)
	isApproved,
	//
	@FlyElement(columnName="IsAudited", name="激活稽核", description="激活稽核跟踪已产生什么数子", help="The Activate Audit checkbox indicates if an audit trail of numbers generated will be kept.", dataType=FlyDataType.YesNo, entityType="D", printName="激活稽核", fieldLength=1)
	isAudited,
	//
	@FlyElement(columnName="IsAutoChangeRequest", name="Create Change Request", description="Automatically create BOM (Engineering) Change Request", help="Create automatically a Product Bill of Material  (Engineering) Change Request when the Request Group references a Product BOM", dataType=FlyDataType.YesNo, entityType="D", printName="Create Change Request", fieldLength=1)
	isAutoChangeRequest,
	//
	@FlyElement(columnName="IsAutocomplete", name="Autocomplete", description="Automatic completion for textfields", help="The autocompletion uses all existing values (from the same client and organization) of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Autocomplete", fieldLength=1)
	isAutocomplete,
	//
	@FlyElement(columnName="IsAutoErrorReport", name="Error Reporting", description="Automatically report Errors", help="To automate error reporting, submit errors to Adempiere. Only error (stack trace) information is submitted (no data or confidential information).  It helps us to react faster and proactively.  If you have a support contract, we will you inform about corrective measures.  This functionality is experimental at this point.", dataType=FlyDataType.YesNo, entityType="D", printName="Error Reporting", fieldLength=1)
	isAutoErrorReport,
	//
	@FlyElement(columnName="IsAutoProduction", name="Automatic Production", dataType=FlyDataType.YesNo, entityType="D", printName="Automatic Production", fieldLength=1)
	isAutoProduction,
	//
	@FlyElement(columnName="IsAutoSequence", name="自增长数", description="Automatically assign the next number", help="The Auto Numbering checkbox indicates if the system will assign the next number automatically.", dataType=FlyDataType.YesNo, entityType="D", printName="自增长数", fieldLength=1)
	isAutoSequence,
	//
	@FlyElement(columnName="IsAvailable", name="可用库存", description="资源是可用", help="Resource is available for assignments", dataType=FlyDataType.YesNo, entityType="D", printName="可用库存", fieldLength=1)
	isAvailable,
	//
	@FlyElement(columnName="IsAveraged", name="计算 Mean (μ)", description="Calculate Average of numeric content or length", help="Calculate the average of the data if the field is numeric, otherwise calculate the average length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="平均", fieldLength=1)
	isAveraged,
	//
	@FlyElement(columnName="IsBackupNull", name="Backup value null", description="The backup value is null.", dataType=FlyDataType.NONE, entityType="D", printName="Backup value null", fieldLength=0)
	isBackupNull,
	//
	@FlyElement(columnName="IsBalanced", name="已平衡", dataType=FlyDataType.YesNo, entityType="D", printName="已平衡", fieldLength=1)
	isBalanced,
	//
	@FlyElement(columnName="IsBalancing", name="待平衡", description="All transactions within an element value must balance (e.g. cost centers)", help="The Balancing checkbox indicates the this element must balance in each journal transaction.  For example, if cost centers have been defined as an element which is balance then the debits and credits for each unique cost center must net to 0.00.  This is commonly used to define parts of an organization which report as their own entity.  Balancing is not an option for the Account element.", dataType=FlyDataType.YesNo, entityType="D", printName="待平衡", fieldLength=1)
	isBalancing,
	//
	@FlyElement(columnName="IsBankAccount", name="银行帐户", description="Indicates if this is the Bank Account", help="The Bank Account checkbox indicates if this is account is the bank account.", dataType=FlyDataType.YesNo, entityType="D", printName="银行帐户", fieldLength=1)
	isBankAccount,
	//
	@FlyElement(columnName="IsBaseLanguage", name="基本语言", description="The system information is maintained in this language", dataType=FlyDataType.YesNo, entityType="D", printName="基本语言", fieldLength=1)
	isBaseLanguage,
	//
	@FlyElement(columnName="IsBeforeApproval", name="Before Approval", description="The Check is before the (manual) approval", help="If selected, the Budget Approval is before manual approvals - i.e. is only approved if budget is available.  This may cause that the use of the budget is delayed (after the approval)", dataType=FlyDataType.YesNo, entityType="D", printName="Before Approval", fieldLength=1)
	isBeforeApproval,
	//
	@FlyElement(columnName="IsBetaFunctionality", name="Beta 功能", description="This functionality is considered Beta", help="Beta functionality is not fully tested or completed.", dataType=FlyDataType.YesNo, entityType="D", printName="Beta 功能", fieldLength=1)
	isBetaFunctionality,
	//
	@FlyElement(columnName="IsBillOfMaterial", name="Bill of Materials", description="Bill of Materials", help="The Bill of Materials check box indicates if this product consists of a bill of materials.", dataType=FlyDataType.YesNo, entityType="D", printName="BOM", fieldLength=1)
	isBillOfMaterial,
	//
	@FlyElement(columnName="IsBillTo", name="帐单接收地址", description="Indicates that this address is the Bill to Address", help="The Bill to Address checkbox indicates if this location is the Bill to Address for this Business Partner", dataType=FlyDataType.YesNo, entityType="D", printName="帐单接收地址", fieldLength=1)
	isBillTo,
	//
	@FlyElement(columnName="IsBOM", name="物料清单", description="物料清单", help="The Bill of Materials check box indicates if this product consists of a bill of materials.", dataType=FlyDataType.YesNo, entityType="D", printName="BOM", fieldLength=1)
	isBOM,
	//
	@FlyElement(columnName="IsBPartnerDim", name="Business Partner Dimension", description="Include Business Partner as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Business Partner Dimension", fieldLength=1)
	isBPartnerDim,
	//
	@FlyElement(columnName="IsBPartnerFlatDiscount", name="B.Partner Flat Discount", description="Use flat discount defined on Business Partner Level", help="For calculation of the discount, use the discount defined on Business Partner Level", dataType=FlyDataType.YesNo, entityType="D", printName="Partner Flat Discount", fieldLength=1)
	isBPartnerFlatDiscount,
	//
	@FlyElement(columnName="IsCalculated", name="Calculated", description="The value is calculated by the system", help="You cannot change values maintained by the system.", dataType=FlyDataType.YesNo, entityType="D", printName="Calculated", fieldLength=1)
	isCalculated,
	//
	@FlyElement(columnName="IsCampaignDim", name="Campaign Dimension", description="Include Campaign as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Campaign Dimension", fieldLength=1)
	isCampaignDim,
	//
	@FlyElement(columnName="IsCanApproveOwnDoc", name="Approve own Documents", description="Users with this role can approve their own documents", help="If a user cannot approve their own documents (orders, etc.), it needs to be approved by someone else.", dataType=FlyDataType.YesNo, entityType="D", printName="Approve own", fieldLength=1)
	isCanApproveOwnDoc,
	//
	@FlyElement(columnName="IsCancelled", name="Cancelled", description="The transaction was cancelled", dataType=FlyDataType.YesNo, entityType="D", printName="Cancelled", fieldLength=1)
	isCancelled,
	//
	@FlyElement(columnName="IsCanExport", name="Can Export", description="Users with this role can export data", help="You can restrict the ability to export data from Adempiere.", dataType=FlyDataType.YesNo, entityType="D", printName="Can Export", fieldLength=1)
	isCanExport,
	//
	@FlyElement(columnName="IsCanLoad", name="Can Load", description="Users with this role can load data", help="You can restrict the ability to load data from Adempiere.", dataType=FlyDataType.YesNo, entityType="D", printName="Can Load", fieldLength=1)
	isCanLoad,
	//
	@FlyElement(columnName="IsCanReport", name="Can Report", description="Users with this role can create reports", help="You can restrict the ability to report on data.", dataType=FlyDataType.YesNo, entityType="D", printName="Can Report", fieldLength=1)
	isCanReport,
	//
	@FlyElement(columnName="IsCentrallyMaintained", name="集中维护", description="Information maintained in System Element table", help="The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table  or 'Window' table.", dataType=FlyDataType.YesNo, entityType="D", printName="集中维护", fieldLength=1)
	isCentrallyMaintained,
	//
	@FlyElement(columnName="IsChangeLog", name="维护变化日志", description="维护变化的一个日志", help="If selected, a log of all changes is maintained.", dataType=FlyDataType.YesNo, entityType="D", printName="变化日志", fieldLength=1)
	isChangeLog,
	//
	@FlyElement(columnName="IsClosed", name="Closed Status", description="The status is closed", help="This allows to have multiple closed status", dataType=FlyDataType.YesNo, entityType="D", printName="Closed", fieldLength=1)
	isClosed,
	//
	@FlyElement(columnName="IsCloseDocument", name="Close Document", description="Close Document (process)", dataType=FlyDataType.NONE, entityType="D", printName="Close", fieldLength=0)
	isCloseDocument,
	//
	@FlyElement(columnName="IsCollapsedByDefault", name="Collapsed By Default", description="Flag to set the initial state of collapsible field group.", dataType=FlyDataType.YesNo, entityType="D", printName="Collapsed By Default", fieldLength=1)
	isCollapsedByDefault,
	//
	@FlyElement(columnName="IsCollapsible", name="Collapsible", description="Flag to indicate the state of the dashboard panel", help="Flag to indicate the state of the dashboard panel (i.e. collapsible or static)", dataType=FlyDataType.YesNo, entityType="D", printName="Collapsible", fieldLength=1)
	isCollapsible,
	//
	@FlyElement(columnName="IsCollectiveAsset", name="Collective Asset", description="Asset Quantity is Collective", help="Asset Quantity is Collective", dataType=FlyDataType.NONE, entityType="D", printName="Collective Asset", fieldLength=0)
	isCollectiveAsset,
	//
	@FlyElement(columnName="IsCommitCeiling", name="债务极限", description="The commitment amount quantity is the chargeable ceiling ", help="The commitment amount and quantity is the maximum amount and quantity to be charged.  Ignored, if the amount or quantity is zero.", dataType=FlyDataType.YesNo, entityType="D", printName="委托天花板", fieldLength=1)
	isCommitCeiling,
	//
	@FlyElement(columnName="IsCommitment", name="债务", description="Is this document a (legal) commitment?", help="Commitment indicates if the document is legally binding.", dataType=FlyDataType.YesNo, entityType="D", printName="债务", fieldLength=1)
	isCommitment,
	//
	@FlyElement(columnName="IsComplete", name="完成", description="已完成", help="Indication that this is complete", dataType=FlyDataType.YesNo, entityType="D", printName="完成", fieldLength=1)
	isComplete,
	//
	@FlyElement(columnName="IsConfidentialInfo", name="Confidential Info", description="Can enter confidential information", help="When entering/updating Requests over the web, the user can mark his info as confidential", dataType=FlyDataType.YesNo, entityType="D", printName="Confidential Info", fieldLength=1)
	isConfidentialInfo,
	//
	@FlyElement(columnName="IsConfirmed", name="确认", description="任务是被证实的", help="Resource assignment is confirmed", dataType=FlyDataType.YesNo, entityType="D", printName="确认", fieldLength=1)
	isConfirmed,
	//
	@FlyElement(columnName="IsCostImmediate", name="Cost Immediately", description="Update Costs immediately for testing", help="If selected, costs are updated immediately when a Cost Detail record is created (by matching or shipping).  Otherwise the costs are updated by batch or when the costs are needed for posting. You should select this only if you are testing,", dataType=FlyDataType.YesNo, entityType="D", printName="Cost Immediate", fieldLength=1)
	isCostImmediate,
	//
	@FlyElement(columnName="IsCounted", name="Calculate Count", description="Count number of not empty elements", help="Calculate the total number of not empty (NULL) elements (maximum is the number of lines).", dataType=FlyDataType.YesNo, entityType="D", printName="计数", fieldLength=1)
	isCounted,
	//
	@FlyElement(columnName="IsCreateAsActive", name="Create As Active", description="Create Asset and activate it", help="You may want to consider not to automatically make the asset active if you need to get some additional information", dataType=FlyDataType.YesNo, entityType="D", printName="Create Active", fieldLength=1)
	isCreateAsActive,
	//
	@FlyElement(columnName="IsCreateByProduct", name="Create by Product", dataType=FlyDataType.YesNo, entityType="D", printName="Create by Product", fieldLength=1)
	isCreateByProduct,
	//
	@FlyElement(columnName="IsCreateCounter", name="Create Counter Document", description="Create Counter Document", help="If selected, create specified counter document.  If not selected, no counter document is created for the document type.", dataType=FlyDataType.YesNo, entityType="D", printName="Create Counter", fieldLength=1)
	isCreateCounter,
	//
	@FlyElement(columnName="IsCreated", name="记录产生", dataType=FlyDataType.List, entityType="D", printName="记录产生", fieldLength=1)
	isCreated,
	//
	@FlyElement(columnName="IsCreateElement", name="Create Elements from Column or Parameters", description="Create Elements from Column Names or Process Parameters", dataType=FlyDataType.YesNo, entityType="D", printName="Create Elements from Column or Parameters", fieldLength=1)
	isCreateElement,
	//
	@FlyElement(columnName="IsCreateMove", name="Create Move", dataType=FlyDataType.YesNo, entityType="D", printName="Create Move", fieldLength=1)
	isCreateMove,
	//
	@FlyElement(columnName="IsCreateNewBatch", name="Create New Batch", description="If selected a new batch is created", help="Note that the balance check does not check that individual batches are balanced.", dataType=FlyDataType.YesNo, entityType="D", printName="New Batch", fieldLength=1)
	isCreateNewBatch,
	//
	@FlyElement(columnName="IsCreateNewJournal", name="Create New Journal", description="If selected a new journal within the batch is created", help="Note that the balance check does not check that individual journals are balanced.", dataType=FlyDataType.YesNo, entityType="D", printName="New Journal", fieldLength=1)
	isCreateNewJournal,
	//
	@FlyElement(columnName="IsCreateReversal", name="Create Reversal", description="Indicates that reversal movement will be created, if disabled the original movement will be deleted.", dataType=FlyDataType.YesNo, entityType="D", printName="Create Reversal", fieldLength=1)
	isCreateReversal,
	//
	@FlyElement(columnName="IsCreateSingleOrder", name="Create Single Order", description="For all shipments create one Order", dataType=FlyDataType.YesNo, entityType="D", printName="Create Single Order", fieldLength=1)
	isCreateSingleOrder,
	//
	@FlyElement(columnName="IsCreditApproved", name="信用核准", description="信用被核准", help="Credit Approved indicates if the credit approval was successful for Orders", dataType=FlyDataType.YesNo, entityType="D", printName="信用核准", fieldLength=1)
	isCreditApproved,
	//
	@FlyElement(columnName="IsCurrentVendor", name="当前供应商", description="Use this Vendor for pricing and stock replenishment", help="The Current Vendor indicates if prices are used and Product is reordered from this vendor", dataType=FlyDataType.YesNo, entityType="D", printName="当前供应商", fieldLength=1)
	isCurrentVendor,
	//
	@FlyElement(columnName="IsCustomer", name="客户", description="Indicates if this Business Partner is a Customer", help="The Customer checkbox indicates if this Business Partner is a customer.  If it is select additional fields will display which further define this customer.", dataType=FlyDataType.YesNo, entityType="D", printName="客户", fieldLength=1)
	isCustomer,
	//
	@FlyElement(columnName="IsCustomization", name="Customization", description="The change is a customization of the data dictionary and can be applied after Migration", help="The migration 'resets' the system to the current/original setting.  If selected you can save the customization and re-apply it.  Please note that you need to check, if your customization has no negative side effect in the new release.", dataType=FlyDataType.YesNo, entityType="D", printName="Customization", fieldLength=1)
	isCustomization,
	//
	@FlyElement(columnName="IsDateSlot", name="日跟踪", description="Resource has day slot availability", help="Resource is only available on certain days", dataType=FlyDataType.YesNo, entityType="D", printName="日跟踪", fieldLength=1)
	isDateSlot,
	//
	@FlyElement(columnName="IsDecimalPoint", name="Decimal Point", description="The number notation has a decimal point (no decimal comma)", help="If selected, Numbers are printed with a decimal point '.' - otherwise with a decimal comma ','.  The thousand separator is the opposite.	If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.YesNo, entityType="D", printName="Decimal Point", fieldLength=1)
	isDecimalPoint,
	//
	@FlyElement(columnName="IsDefault", name="缺省值", description="缺省值", help="The Default Checkbox indicates if this record will be used as a default value.", dataType=FlyDataType.YesNo, entityType="D", printName="缺省值", fieldLength=1)
	isDefault,
	//
	@FlyElement(columnName="IsDefaultCounterDoc", name="Default Counter Document", description="The document type is the default counter document type", help="When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction.  Example: when generating a Sales Order, use this Sales Order document type.	This default can be overwritten by defining explicit counter document relationships.", dataType=FlyDataType.YesNo, entityType="D", printName="Default Counter Doc", fieldLength=1)
	isDefaultCounterDoc,
	//
	@FlyElement(columnName="IsDelayedCapture", name="延迟了抓取", description="物料出货后费用", help="Delayed Capture is required, if you ship products.  The first credit card transaction is the Authorization, the second is the actual transaction after the shipment of the product.", dataType=FlyDataType.YesNo, entityType="D", printName="延迟了抓取", fieldLength=1)
	isDelayedCapture,
	//
	@FlyElement(columnName="IsDeleteable", name="可删除的记录", description="Indicates if records can be deleted from the database", help="The Records Deleteable checkbox indicates if a record can be deleted from the database.  If records cannot be deleted, you can only deselect the Active flag", dataType=FlyDataType.YesNo, entityType="D", printName="可删除的记录", fieldLength=1)
	isDeleteable,
	//
	@FlyElement(columnName="IsDeletePlannedPO", name="Delete Planned Purchase Orders", dataType=FlyDataType.YesNo, entityType="D", printName="Delete Planned Purchase Orders", fieldLength=1)
	isDeletePlannedPO,
	//
	@FlyElement(columnName="IsDeleteUnconfirmedProduction", name="Delete Unconfirmed Production", dataType=FlyDataType.YesNo, entityType="D", printName="Delete Unconfirmed Production", fieldLength=10)
	isDeleteUnconfirmedProduction,
	//
	@FlyElement(columnName="IsDeletingUnusedElement", name="Is Deleting unused Elements", description="Is Deleting unused Elements", dataType=FlyDataType.YesNo, entityType="D", printName="Is Deleting unused Elements", fieldLength=1)
	isDeletingUnusedElement,
	//
	@FlyElement(columnName="IsDelivered", name="已配送", dataType=FlyDataType.YesNo, entityType="D", printName="已配送", fieldLength=1)
	isDelivered,
	//
	@FlyElement(columnName="IsDependentEntities", name="Dependent Entities", description="Also check access in dependent entities", help="Also dependent entities are included.  Please be aware, that enabling this rule has severe consequences and that this is only wanted in some circumstances.	<p>Example Rule: 'Include Payment Term Immediate with Dependent Entities'	<br>Primary effect: users with this role can only select the payment term Immediate	<br>Secondary effect (dependent entities): users with this role can see only invoices/orders with the payment term immediate.", dataType=FlyDataType.YesNo, entityType="D", printName="Dependent Entities", fieldLength=1)
	isDependentEntities,
	//
	@FlyElement(columnName="IsDeployed", name="Deployed", description="Entity is deployed", dataType=FlyDataType.YesNo, entityType="D", printName="Deployed", fieldLength=1)
	isDeployed,
	//
	@FlyElement(columnName="IsDepreciable", name="Is Depreciable", description="This asset CAN be depreciated", dataType=FlyDataType.NONE, entityType="D", printName="Is Depreciable", fieldLength=0)
	isDepreciable,
	//
	@FlyElement(columnName="IsDepreciated", name="折旧", description="资产将会被折旧", help="The asset is used internally and will be depreciated", dataType=FlyDataType.YesNo, entityType="D", printName="折旧", fieldLength=1)
	isDepreciated,
	//
	@FlyElement(columnName="IsDesc", name="Descending", description="Sort your data using a SQL Desc Order By statement", dataType=FlyDataType.NONE, entityType="D", printName="Descending", fieldLength=0)
	isDesc,
	//
	@FlyElement(columnName="IsDescription", name="Description Only", description="if true, the line is just description and no transaction", help="If a line is Description Only, e.g. Product Inventory is not corrected. No accounting transactions are created and the amount or totals are not included in the document.  This for including descriptional detail lines, e.g. for an Work Order.", dataType=FlyDataType.YesNo, entityType="D", printName="Description", fieldLength=1)
	isDescription,
	//
	@FlyElement(columnName="IsDeviationCalc", name="Calculate Deviation (σ)", description="Calculate Standard Deviation", help="The Standard Deviation (σ) is the a measure of dispersion - used in combination with the Mean (μ)", dataType=FlyDataType.YesNo, entityType="D", printName="Deviation", fieldLength=1)
	isDeviationCalc,
	//
	@FlyElement(columnName="IsDirected", name="Directed", description="Tells whether one 'sees' the other end of the relation from each end or just from the source", dataType=FlyDataType.YesNo, entityType="D", printName="Directed", fieldLength=1)
	isDirected,
	//
	@FlyElement(columnName="IsDirectPrint", name="直接打印", description="没有对话框的打印", help="The Direct Print checkbox indicates that this report will print without a print dialog box being displayed.", dataType=FlyDataType.YesNo, entityType="D", printName="直接打印", fieldLength=1)
	isDirectPrint,
	//
	@FlyElement(columnName="IsDiscountAllowedOnTotal", name="IsDiscountAllowedOnTotal", dataType=FlyDataType.YesNo, entityType="D", printName="IsDiscountAllowedOnTotal", fieldLength=1)
	isDiscountAllowedOnTotal,
	//
	@FlyElement(columnName="IsDiscountCorrectsTax", name="根据折扣费用更正税", description="Correct the tax for payment discount and charges", help="Payment discounts may require to correct the tax.  This primarily applicable in VAT systems.  If the original invoice had tax records, the payment discount, write-off, etc. is corrected by the tax. The calculation of the tax is prorated based on the invoice.", dataType=FlyDataType.YesNo, entityType="D", printName="根据折扣费用更正税", fieldLength=1)
	isDiscountCorrectsTax,
	//
	@FlyElement(columnName="IsDiscountLineAmt", name="从明细金额计算折扣", description="Payment Discount calculation does not include Taxes and Charges", help="If the payment discount is calculated from line amounts only, the tax and charge amounts are not included. This is e.g. business practice in the US.  If not selected the total invoice amount is used to calculate the payment discount.", dataType=FlyDataType.YesNo, entityType="D", printName="从明细金额计算折扣", fieldLength=1)
	isDiscountLineAmt,
	//
	@FlyElement(columnName="IsDiscountPrinted", name="打印折扣", description="Print Discount on Invoice and Order", help="The Discount Printed Checkbox indicates if the discount will be printed on the document.", dataType=FlyDataType.YesNo, entityType="D", printName="打印折扣", fieldLength=1)
	isDiscountPrinted,
	//
	@FlyElement(columnName="IsDiscountUptoLimitPrice", name="IsDiscountUptoLimitPrice", dataType=FlyDataType.YesNo, entityType="D", printName="IsDiscountUptoLimitPrice", fieldLength=1)
	isDiscountUptoLimitPrice,
	//
	@FlyElement(columnName="IsDisplayed", name="显示", description="Determines, if this field is displayed", help="If the field is displayed, the field Display Logic will determine at runtime, if it is actually displayed", dataType=FlyDataType.YesNo, entityType="D", printName="显示", fieldLength=1)
	isDisplayed,
	//
	@FlyElement(columnName="IsDisplayedGrid", name="Displayed in Grid", description="Determines, if this field is displayed in grid view", help="Default whether this field is displayed when grid view is selected.", dataType=FlyDataType.NONE, entityType="D", printName="Displayed in Grid", fieldLength=0)
	isDisplayedGrid,
	//
	@FlyElement(columnName="IsDisplayIdentifier", name="Display Identifier", description="Display the record identifier", help="Display the columns that are marked as part of the identifier for this table.  ", dataType=FlyDataType.NONE, entityType="D", printName="Display Identifier", fieldLength=0)
	isDisplayIdentifier,
	//
	@FlyElement(columnName="IsDisplayLegend", name="Display Legend", description="Display chart legend", help="Toggles the display of the chart legend", dataType=FlyDataType.YesNo, entityType="D", printName="Display Legend", fieldLength=1)
	isDisplayLegend,
	//
	@FlyElement(columnName="IsDisposed", name="处理", description="资产被处理", help="The asset is no longer used and disposed", dataType=FlyDataType.YesNo, entityType="D", printName="处理", fieldLength=1)
	isDisposed,
	//
	@FlyElement(columnName="ISDN", name="ISDN", description="ISDN或拨号", help="The ISDN identifies a ISDN or Modem line number.", dataType=FlyDataType.String, entityType="D", printName="ISDN", fieldLength=40)
	iSDN,
	//
	@FlyElement(columnName="IsDocControlled", name="文档受控", description="Control account - If an account is controlled by a document, you cannot post manually to it", dataType=FlyDataType.YesNo, entityType="D", printName="文档受控", fieldLength=1)
	isDocControlled,
	//
	@FlyElement(columnName="IsDocNoControlled", name="文件号受控", description="The document has a document sequence", help="The Document Number Controlled checkbox indicates if this document type will have a sequence number.", dataType=FlyDataType.YesNo, entityType="D", printName="文件号受控", fieldLength=1)
	isDocNoControlled,
	//
	@FlyElement(columnName="IsDocument", name="Is Document", description="This flag determinate if the record is a document", help="This flag is used to mark those tables that behave like documents and allow create automatically columns like: C_DocType_ID, DocumentNo, DateDoc, DocAction, DocStatus, Processed, IsApproved, Description", dataType=FlyDataType.YesNo, entityType="D", printName="Is Document", fieldLength=1)
	isDocument,
	//
	@FlyElement(columnName="IsDocumentLevel", name="文档计算", description="根据文档计算税,而不是根据明细计算", help="If the tax is calculated on document level, all lines with that tax rate are added before calculating the total tax for the document.	Otherwise the tax is calculated per line and then added.	Due to rounding, the tax amount can differ.", dataType=FlyDataType.YesNo, entityType="D", printName="文件水平", fieldLength=1)
	isDocumentLevel,
	//
	@FlyElement(columnName="IsDropShip", name="Drop Shipment", description="Drop Shipments are sent from the Vendor directly to the Customer", help="Drop Shipments do not cause any Inventory reservations or movements as the Shipment is from the Vendor's inventory. The Shipment of the Vendor to the Customer must be confirmed.", dataType=FlyDataType.YesNo, entityType="D", printName="Drop Ship", fieldLength=1)
	isDropShip,
	//
	@FlyElement(columnName="IsDue", name="Due", description="Subscription Renewal is Due", dataType=FlyDataType.YesNo, entityType="D", printName="Due", fieldLength=1)
	isDue,
	//
	@FlyElement(columnName="IsDueFixed", name="固定的应得东西日期", description="Payment is due on a fixed date", help="The Fixed Due Date checkbox indicates if invoices using this payment tern will be due on a fixed day of the month.  ", dataType=FlyDataType.YesNo, entityType="D", printName="固定的应得东西日期", fieldLength=1)
	isDueFixed,
	//
	@FlyElement(columnName="IsEMailWhenDue", name="EMail when Due", description="Send EMail when Request becomes due", help="Send EMail when Request becomes due", dataType=FlyDataType.YesNo, entityType="D", printName="EMail when Due", fieldLength=1)
	isEMailWhenDue,
	//
	@FlyElement(columnName="IsEMailWhenOverdue", name="EMail when Overdue", description="Send EMail when Request becomes overdue", help="Send EMail when Request becomes overdue", dataType=FlyDataType.YesNo, entityType="D", printName="EMail when Overdue", fieldLength=1)
	isEMailWhenOverdue,
	//
	@FlyElement(columnName="IsEmbedded", name="Is Embedded", description="When checked of include tab is embedded", dataType=FlyDataType.YesNo, entityType="D", printName="Allows setting as an Embedded  Tab or Horizontal Tab", fieldLength=1)
	isEmbedded,
	//
	@FlyElement(columnName="IsEmployee", name="雇员", description="表明此业务伙伴为一个雇员", help="The Employee checkbox indicates if this Business Partner is an Employee.  If it is selected, additional fields will display which further identify this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="雇员", fieldLength=1)
	isEmployee,
	//
	@FlyElement(columnName="IsEMUMember", name="欧元区成员", description="此货币为欧洲货币联盟的成员", help="The Emu Member checkbox is used to indicate if this currency is a member of the European Economic Union.", dataType=FlyDataType.YesNo, entityType="D", printName="欧元区成员", fieldLength=1)
	isEMUMember,
	//
	@FlyElement(columnName="IsEnableProductLookup", name="Enable POS Product Lookup", description="Allows product lookup in order to show search key , name , quantity available , standard price and list price for selecting a product", dataType=FlyDataType.YesNo, entityType="D", printName="Enable POS Product Lookup", fieldLength=1)
	isEnableProductLookup,
	//
	@FlyElement(columnName="IsEncrypted", name="加密的", description="Display is encrypted by '*' - Independent from data storage encryption", help="Display encryption - all characters are displayed as '*'. Data storage encryption (i.e. you will not be able to report the data via report tools) is set in the Column definition.", dataType=FlyDataType.Button, entityType="D", printName="加密的", fieldLength=1)
	isEncrypted,
	//
	@FlyElement(columnName="IsEndProduct", name="End Product", description="End Product of production", dataType=FlyDataType.YesNo, entityType="D", printName="End Product", fieldLength=1)
	isEndProduct,
	//
	@FlyElement(columnName="IsError", name="Error", description="An Error occured in the execution", dataType=FlyDataType.YesNo, entityType="D", printName="Error", fieldLength=1)
	isError,
	//
	@FlyElement(columnName="IsEscalated", name="扩大", description="This request has been escalated", help="The Escalated checkbox indicates that this request has been escalated or raised in importance.", dataType=FlyDataType.YesNo, entityType="D", printName="扩大", fieldLength=1)
	isEscalated,
	//
	@FlyElement(columnName="IsEuro", name="欧元币种", description="币种是欧元", help="The Euro Currency checkbox is used to indicate if this currency is the Euro Currency.", dataType=FlyDataType.YesNo, entityType="D", printName="欧元币种", fieldLength=1)
	isEuro,
	//
	@FlyElement(columnName="IsEventRequired", name="IsEventRequired", dataType=FlyDataType.NONE, entityType="D", printName="IsEventRequired", fieldLength=0)
	isEventRequired,
	//
	@FlyElement(columnName="IsExclude", name="排除", description="Exclude Access to the Data", help="If selected, the role cannot access the data specified.  If not selected, the role can ONLY access the data specified", dataType=FlyDataType.YesNo, entityType="D", printName="排除", fieldLength=1)
	isExclude,
	//
	@FlyElement(columnName="IsExcludeAutoDelivery", name="Exclude Auto Delivery", description="Exclude from automatic Delivery", help="The product is excluded from generating Shipments.  This allows manual creation of shipments for high demand items. If selected, you need to create the shipment manually.	But, the item is always included, when the delivery rule of the Order is Force (e.g. for POS). 	This allows finer granularity of the Delivery Rule Manual.", dataType=FlyDataType.YesNo, entityType="D", printName="Exclude Delivery", fieldLength=1)
	isExcludeAutoDelivery,
	//
	@FlyElement(columnName="IsExcludeKanban", name="Is Exclude Kanban", description="Exclude the Kanban execution", dataType=FlyDataType.YesNo, entityType="D", printName="Is Exclude Kanban", fieldLength=1)
	isExcludeKanban,
	//
	@FlyElement(columnName="IsExplicitCostAdjustment", name="Explicit Cost Adjustment", description="Post the cost adjustment explicitly", help="If selected, landed costs are posted to the account in the line and then this posting is reversed by the postings to the cost adjustment accounts.  If not selected, it is directly posted to the cost adjustment accounts.", dataType=FlyDataType.YesNo, entityType="D", printName="Explicit Cost Adjustment", fieldLength=1)
	isExplicitCostAdjustment,
	//
	@FlyElement(columnName="IsExportXMLBackup", name="Export XML Backup", dataType=FlyDataType.YesNo, entityType="D", printName="Export XML Backup", fieldLength=1)
	isExportXMLBackup,
	//
	@FlyElement(columnName="IsFailOnBuildDiffer", name="Fail if Build Differ", dataType=FlyDataType.YesNo, entityType="D", printName="Fail if Build Differ", fieldLength=1)
	isFailOnBuildDiffer,
	//
	@FlyElement(columnName="IsFailOnMissingModelValidator", name="Fail on Missing Model Validator", dataType=FlyDataType.YesNo, entityType="D", printName="Fail on Missing Model Validator", fieldLength=1)
	isFailOnMissingModelValidator,
	//
	@FlyElement(columnName="IsFieldOnly", name="仅显示字段", description="不显示标签", help="The Field Only checkbox indicates that the column will display without a label.", dataType=FlyDataType.YesNo, entityType="D", printName="仅显示字段", fieldLength=1)
	isFieldOnly,
	//
	@FlyElement(columnName="IsFilledRectangle", name="Fill Shape", description="Fill the shape with the color selected", dataType=FlyDataType.YesNo, entityType="D", printName="Fill Shape", fieldLength=1)
	isFilledRectangle,
	//
	@FlyElement(columnName="IsFinalClose", name="Final Close", description="Entries with Final Close cannot be re-opened", dataType=FlyDataType.YesNo, entityType="D", printName="Final Close", fieldLength=1)
	isFinalClose,
	//
	@FlyElement(columnName="IsFirstNameOnly", name="仅用名字", description="Print only the first name in greetings", help="The First Name Only checkbox indicates that only the first name of this contact should print in greetings.", dataType=FlyDataType.YesNo, entityType="D", printName="仅用名字", fieldLength=1)
	isFirstNameOnly,
	//
	@FlyElement(columnName="IsFixedAsset", name="Is a Fixed Asset", description="Indicates whether this group will be a Fixed Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Is a Fixed Asset ?", fieldLength=1)
	isFixedAsset,
	//
	@FlyElement(columnName="IsFixedAssetInvoice", name="Is Fixed Asset Invoice", description="Indicates if an Invoice is for a Fixed Asset", dataType=FlyDataType.YesNo, entityType="D", printName="Is Fixed Asset Invoice", fieldLength=1)
	isFixedAssetInvoice,
	//
	@FlyElement(columnName="IsFixedWidth", name="固定的宽度", description="列有固定的宽度", help="The Column has a fixed width, independent from the content", dataType=FlyDataType.YesNo, entityType="D", printName="固定的宽度", fieldLength=1)
	isFixedWidth,
	//
	@FlyElement(columnName="IsForAllDistribution", name="For all distribution", description="This reward is for all distribution", dataType=FlyDataType.YesNo, entityType="D", printName="For all distribution", fieldLength=1)
	isForAllDistribution,
	//
	@FlyElement(columnName="IsForce", name="Force", description="Force Operation", dataType=FlyDataType.YesNo, entityType="D", printName="Force", fieldLength=1)
	isForce,
	//
	@FlyElement(columnName="IsForeignCurrency", name="Foreign Currency Account", description="Balances in foreign currency accounts are held in the nominated currency", help="Balances in foreign currency accounts are held in the nominated currency and translated to functional currency", dataType=FlyDataType.YesNo, entityType="D", printName="外国的币种", fieldLength=1)
	isForeignCurrency,
	//
	@FlyElement(columnName="IsForm", name="表单", description="If Selected, a Form is printed, if not selected a columnar List report", help="A form has individual elements with layout information (example: invoice, check)	<br>	A columnar list report has individual columns (example: list of invoices)", dataType=FlyDataType.YesNo, entityType="D", printName="表单", fieldLength=1)
	isForm,
	//
	@FlyElement(columnName="IsFullBPAccess", name="Full BP Access", description="The user/contact has full access to Business Partner information and resources", help="If selected, the user has full access to the Business Partner (BP) information (Business Documents like Orders, Invoices - Requests) or resources (Assets, Downloads). If you deselect it, the user has no access rights unless, you explicitly grant it in tab 'BP Access'", dataType=FlyDataType.YesNo, entityType="D", printName="Full BP Access", fieldLength=1)
	isFullBPAccess,
	//
	@FlyElement(columnName="IsFullyDepreciated", name="完全折旧", description="The asset is fully depreciated", help="The asset costs are fully amortized.", dataType=FlyDataType.YesNo, entityType="D", printName="完全折旧", fieldLength=1)
	isFullyDepreciated,
	//
	@FlyElement(columnName="IsFullyQualified", name="完全合格", description="This account is fully qualified", help="The Fully Qualified check box indicates that all required elements for an account combination are present.", dataType=FlyDataType.YesNo, entityType="D", printName="完全合格", fieldLength=1)
	isFullyQualified,
	//
	@FlyElement(columnName="IsGenerated", name="生成的", description="这行被生成的", help="The Generated checkbox identifies a journal line that was generated from a source document.  Lines could also be entered manually or imported.", dataType=FlyDataType.YesNo, entityType="D", printName="生成的", fieldLength=1)
	isGenerated,
	//
	@FlyElement(columnName="IsGeneratedDraft", name="Generated Draft", dataType=FlyDataType.YesNo, entityType="D", printName="Generated Draft", fieldLength=1)
	isGeneratedDraft,
	//
	@FlyElement(columnName="IsGLBudgetDim", name="GL Budget Dimension", description="Include GL Budget as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="GL Budget Dimension", fieldLength=1)
	isGLBudgetDim,
	//
	@FlyElement(columnName="IsGroupBy", name="分组", description="After a group change, totals, etc. are printed", help="Grouping allows to print sub-totals. If a group changes, the totals are printed.  Group by columns need to be included in the sort order.", dataType=FlyDataType.YesNo, entityType="D", printName="Groupby", fieldLength=1)
	isGroupBy,
	//
	@FlyElement(columnName="IsGroupFunction", name="SQL组函数", description="此函数将产生一个Group By子句", help="The SQL Group Function checkbox indicates that this function will generate a Group by Clause in the resulting SQL.", dataType=FlyDataType.YesNo, entityType="D", printName="SQL组函数", fieldLength=1)
	isGroupFunction,
	//
	@FlyElement(columnName="IsGuaranteeDate", name="保证日期", description="Product has Guarantee or Expiry Date", help="For individual products, you can define a guarantee or expiry date", dataType=FlyDataType.YesNo, entityType="D", printName="保证日期", fieldLength=1)
	isGuaranteeDate,
	//
	@FlyElement(columnName="IsGuaranteeDateMandatory", name="Mandatory Guarantee Date", description="The entry of a Guarantee Date is mandatory when creating a Product Instance", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Guarantee Date", fieldLength=1)
	isGuaranteeDateMandatory,
	//
	@FlyElement(columnName="IsHeading", name="仅显示标题", description="Field without Column - Only label is displayed", help="The Heading Only checkbox indicates if just the label will display on the screen", dataType=FlyDataType.YesNo, entityType="D", printName="仅显示标题", fieldLength=1)
	isHeading,
	//
	@FlyElement(columnName="IsHeightOneLine", name="仅一行", description="If selected, only one line is printed", help="If the column has a width restriction, the text is broken into multiple lines. If One Line is selected, only the first line is printed.", dataType=FlyDataType.YesNo, entityType="D", printName="仅一行", fieldLength=1)
	isHeightOneLine,
	//
	@FlyElement(columnName="IsHighVolume", name="大量数据", description="Use Search instead of Pick list", help="那 High Volume Checkbox indicates if a search screen will display as opposed to a pick list for selecting records from this table.", dataType=FlyDataType.YesNo, entityType="D", printName="大量数据", fieldLength=1)
	isHighVolume,
	//
	@FlyElement(columnName="IsHtml", name="HTML", description="本文有 HTML 标签", dataType=FlyDataType.YesNo, entityType="D", printName="HTML", fieldLength=1)
	isHtml,
	//
	@FlyElement(columnName="IsIdentifier", name="标识符", description="本列是记录标识符的一部分", help="The Identifier checkbox indicates that this column is part of the identifier or key for this table.  ", dataType=FlyDataType.YesNo, entityType="D", printName="标识符", fieldLength=1)
	isIdentifier,
	//
	@FlyElement(columnName="IsIgnoreMigration", name="Ignore Migration", description="Ignore this record in log migration", dataType=FlyDataType.YesNo, entityType="D", printName="Ignore Migration", fieldLength=1)
	isIgnoreMigration,
	//
	@FlyElement(columnName="IsIgnoreProcessingTime", name="Ignore Processing Time", description="Do not include processing time for the DateNextRun calculation", help="When this is selected, the previous DateNextRun is always use as the source for the next DateNextRun calculation.", dataType=FlyDataType.YesNo, entityType="D", printName="Ignore Proccessing Time", fieldLength=1)
	isIgnoreProcessingTime,
	//
	@FlyElement(columnName="IsImageField", name="Image Field", description="The image is retrieved from the data column", help="The Image URL is retrieved from the data column", dataType=FlyDataType.YesNo, entityType="D", printName="Image Field", fieldLength=1)
	isImageField,
	//
	@FlyElement(columnName="IsImportOnlyNoErrors", name="Import only if No Errors", description="Only start the import, if there are no validation Errors", dataType=FlyDataType.NONE, entityType="D", printName="Import No Errors", fieldLength=0)
	isImportOnlyNoErrors,
	//
	@FlyElement(columnName="IsImportPriceLimit", name="Import Limit Price", dataType=FlyDataType.NONE, entityType="D", printName="Import Limit Price", fieldLength=0)
	isImportPriceLimit,
	//
	@FlyElement(columnName="IsImportPriceList", name="Import List price", dataType=FlyDataType.NONE, entityType="D", printName="Import List price", fieldLength=0)
	isImportPriceList,
	//
	@FlyElement(columnName="IsImportPriceStd", name="Import Standard Price", dataType=FlyDataType.NONE, entityType="D", printName="Import Standard Price", fieldLength=0)
	isImportPriceStd,
	//
	@FlyElement(columnName="IsInclude", name="Included", description="Defines whether this content / template is included into another one", help="Templates can be independent or included. Included Templates are also called subtemplates", dataType=FlyDataType.YesNo, entityType="D", printName="Included", fieldLength=1)
	isInclude,
	//
	@FlyElement(columnName="IsIncludeNullsActivity", name="Include Nulls in Activity", description="Include nulls in the selection of the activity", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Activity", fieldLength=1)
	isIncludeNullsActivity,
	//
	@FlyElement(columnName="IsIncludeNullsBPartner", name="Include Nulls in BPartner", description="Include nulls in the selection of the business partner", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in BPartner", fieldLength=1)
	isIncludeNullsBPartner,
	//
	@FlyElement(columnName="IsIncludeNullsCampaign", name="Include Nulls in Campaign", description="Include nulls in the selection of the campaign", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Campaign", fieldLength=1)
	isIncludeNullsCampaign,
	//
	@FlyElement(columnName="IsIncludeNullsElementValue", name="Include Nulls in Account", description="Include nulls in the selection of the account", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Account", fieldLength=1)
	isIncludeNullsElementValue,
	//
	@FlyElement(columnName="IsIncludeNullsLocation", name="Include Nulls in Location", description="Include nulls in the selection of the location", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Location", fieldLength=1)
	isIncludeNullsLocation,
	//
	@FlyElement(columnName="IsIncludeNullsOrg", name="Include Nulls in Org", description="Include nulls in the selection of the organization", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Org", fieldLength=1)
	isIncludeNullsOrg,
	//
	@FlyElement(columnName="IsIncludeNullsOrgTrx", name="Include Nulls in Org Trx", description="Include nulls in the selection of the organization transaction", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Org Trx", fieldLength=1)
	isIncludeNullsOrgTrx,
	//
	@FlyElement(columnName="IsIncludeNullsProduct", name="Include Nulls in Product", description="Include nulls in the selection of the product", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Product", fieldLength=1)
	isIncludeNullsProduct,
	//
	@FlyElement(columnName="IsIncludeNullsProject", name="Include Nulls in Project", description="Include nulls in the selection of the project", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Project", fieldLength=1)
	isIncludeNullsProject,
	//
	@FlyElement(columnName="IsIncludeNullsSalesRegion", name="Include Nulls in Sales Region", description="Include nulls in the selection of the sales region", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in Sales Region", fieldLength=1)
	isIncludeNullsSalesRegion,
	//
	@FlyElement(columnName="IsIncludeNullsUser1", name="Include Nulls in User 1", description="Include nulls in the selection of the user 1", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User 1", fieldLength=1)
	isIncludeNullsUser1,
	//
	@FlyElement(columnName="IsIncludeNullsUser2", name="Include Nulls in User 2", description="Include nulls in the selection of the user 2", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User 2", fieldLength=1)
	isIncludeNullsUser2,
	//
	@FlyElement(columnName="IsIncludeNullsUser3", name="Include Nulls in User 3", description="Include nulls in the selection of the user 3", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User 3", fieldLength=1)
	isIncludeNullsUser3,
	//
	@FlyElement(columnName="IsIncludeNullsUser4", name="Include Nulls in User 4", description="Include nulls in the selection of the user 4", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User 4", fieldLength=1)
	isIncludeNullsUser4,
	//
	@FlyElement(columnName="IsIncludeNullsUserElement1", name="Include Nulls in User Element 1", description="Include nulls in the selection of the user element 1", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User Element 1", fieldLength=1)
	isIncludeNullsUserElement1,
	//
	@FlyElement(columnName="IsIncludeNullsUserElement2", name="Include Nulls in User Element 2", description="Include nulls in the selection of the user element 2", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User Element 2", fieldLength=1)
	isIncludeNullsUserElement2,
	//
	@FlyElement(columnName="IsIncludeNullsUserList1", name="Include Nulls in User List 1", description="Include nulls in the selection of the User List 1", dataType=FlyDataType.NONE, entityType="D", printName="Include Nulls in User List 1", fieldLength=0)
	isIncludeNullsUserList1,
	//
	@FlyElement(columnName="IsIncludeNullsUserList2", name="Include Nulls in User List 2", description="Include nulls in the selection of the User List 2", dataType=FlyDataType.NONE, entityType="D", printName="Include Nulls in User List 2", fieldLength=0)
	isIncludeNullsUserList2,
	//
	@FlyElement(columnName="IsIncludeNullsUserList3", name="Include Nulls in User List 3", description="Include nulls in the selection of the User List 3", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User List 3", fieldLength=1)
	isIncludeNullsUserList3,
	//
	@FlyElement(columnName="IsIncludeNullsUserList4", name="Include Nulls in User List 4", description="Include nulls in the selection of the User List 4", dataType=FlyDataType.YesNo, entityType="D", printName="Include Nulls in User List 4", fieldLength=1)
	isIncludeNullsUserList4,
	//
	@FlyElement(columnName="IsIncludePayments", name="Include Payments", description="Include payments in the aging report", dataType=FlyDataType.NONE, entityType="D", printName="Include Payments", fieldLength=0)
	isIncludePayments,
	//
	@FlyElement(columnName="IsIndexed", name="Indexed", description="Index the document for the internal search engine", help="For cross document search, the document can be indexed for faster search (Container, Document Type, Request Type)", dataType=FlyDataType.YesNo, entityType="D", printName="Indexed", fieldLength=1)
	isIndexed,
	//
	@FlyElement(columnName="IsInDispute", name="In Dispute", description="Document is in dispute", help="The document is in dispute. Use Requests to track details.", dataType=FlyDataType.YesNo, entityType="D", printName="In Dispute", fieldLength=1)
	isInDispute,
	//
	@FlyElement(columnName="IsInfoOnly", name="Is Information Only", description="When a Parameter is Information Only", dataType=FlyDataType.YesNo, entityType="D", printName="Is Information Only", fieldLength=1)
	isInfoOnly,
	//
	@FlyElement(columnName="IsInfoSent", name="发送信息", description="Send informational messages and copies", dataType=FlyDataType.YesNo, entityType="D", printName="发送信息", fieldLength=1)
	isInfoSent,
	//
	@FlyElement(columnName="IsInfoTab", name="会计页签", description="This tab contain accounting information", help="The Accounting Tab checkbox indicates if this window contains accounting information.", dataType=FlyDataType.YesNo, entityType="D", printName="会计页签", fieldLength=1)
	isInfoTab,
	//
	@FlyElement(columnName="IsInPosession", name="在所有物中", description="The asset is in the possession of the organization", help="Assets which are not in possession are e.g. at Customer site and may or may not be owned by the company.", dataType=FlyDataType.YesNo, entityType="D", printName="在所有物中", fieldLength=1)
	isInPosession,
	//
	@FlyElement(columnName="IsInProduction", name="生产系统", description="系统是生产系统", dataType=FlyDataType.YesNo, entityType="D", printName="生产系统", fieldLength=1)
	isInProduction,
	//
	@FlyElement(columnName="IsInsertRecord", name="Insert Record", description="The user can insert a new Record", help="If not selected, the user cannot create a new Record.  This is automatically disabled, if the Tab is Read Only.", dataType=FlyDataType.YesNo, entityType="D", printName="Insert Record", fieldLength=1)
	isInsertRecord,
	//
	@FlyElement(columnName="IsInstanceAttribute", name="实例属性", description="The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date)", help="If selected, the individual instance of the product has this attribute - like the individual Serial or Lot Numbers or  Guarantee Date of a product instance.  If not selected, all instances of the product share the attribute (e.g. color=green).", dataType=FlyDataType.YesNo, entityType="D", printName="实例属性", fieldLength=1)
	isInstanceAttribute,
	//
	@FlyElement(columnName="IsInternal", name="Internal", description="Internal Organization", dataType=FlyDataType.YesNo, entityType="D", printName="Internal", fieldLength=1)
	isInternal,
	//
	@FlyElement(columnName="IsInTransit", name="In Transit", description="Movement is in transit", help="Material Movement is in transit - shipped, but not received", dataType=FlyDataType.YesNo, entityType="D", printName="In Transit", fieldLength=1)
	isInTransit,
	//
	@FlyElement(columnName="IsInvitedVendorsOnly", name="Invited Vendors Only", description="Only invited vendors can respond to an RfQ", help="The Request for Quotation is only visible to the invited vendors", dataType=FlyDataType.YesNo, entityType="D", printName="Invited Vendors", fieldLength=1)
	isInvitedVendorsOnly,
	//
	@FlyElement(columnName="IsInvoiced", name="已开票", description="已开票", help="标示是否已开发票", dataType=FlyDataType.YesNo, entityType="D", printName="已开票", fieldLength=1)
	isInvoiced,
	//
	@FlyElement(columnName="IsInvoicePrintDetails", name="发票打印发票明细", description="Print detail BOM elements on the invoice", help="The Print Details on Invoice indicates that the BOM element products will print on the Invoice as opposed to this product.", dataType=FlyDataType.YesNo, entityType="D", printName="打印发票明细", fieldLength=1)
	isInvoicePrintDetails,
	//
	@FlyElement(columnName="IsJustMigrated", name="Just Migrated", description="Value set by Migration for post-Migation tasks.", dataType=FlyDataType.YesNo, entityType="D", printName="Just Migrated", fieldLength=1)
	isJustMigrated,
	//
	@FlyElement(columnName="IsKanban", name="Kanban controlled", description="This part is Kanban controlled", dataType=FlyDataType.YesNo, entityType="D", printName="Kanban controlled", fieldLength=1)
	isKanban,
	//
	@FlyElement(columnName="IsKey", name="关键列", description="This column is the key in this table", help="The key column must also be display sequence 0 in the field definition and may be hidden.", dataType=FlyDataType.YesNo, entityType="D", printName="关键列", fieldLength=1)
	isKey,
	//
	@FlyElement(columnName="IsLandscape", name="水平", description="水平方向", dataType=FlyDataType.YesNo, entityType="D", printName="水平", fieldLength=1)
	isLandscape,
	//
	@FlyElement(columnName="IsListInvoices", name="List Invoices", description="Include List of Invoices", dataType=FlyDataType.YesNo, entityType="D", printName="List Invoices", fieldLength=1)
	isListInvoices,
	//
	@FlyElement(columnName="IsLocFromDim", name="Location From Dimension", description="Include Location From as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Location From Dimension", fieldLength=1)
	isLocFromDim,
	//
	@FlyElement(columnName="IsLocToDim", name="Location To  Dimension", description="Include Location To as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Location To Dimension", fieldLength=1)
	isLocToDim,
	//
	@FlyElement(columnName="IsLogged", name="Logging", description="Do we need to log the banner impressions and clicks? (needs much performance)", help="As of performance we should only log banners if really necessary, as this takes a lot of performance", dataType=FlyDataType.YesNo, entityType="D", printName="Logging", fieldLength=1)
	isLogged,
	//
	@FlyElement(columnName="IsLot", name="批", description="The product instances have a Lot Number", help="For individual products, you can define Lot Numbers", dataType=FlyDataType.YesNo, entityType="D", printName="批", fieldLength=1)
	isLot,
	//
	@FlyElement(columnName="IsLotMandatory", name="Mandatory Lot", description="The entry of Lot info is mandatory when creating a Product Instance", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Lot", fieldLength=1)
	isLotMandatory,
	//
	@FlyElement(columnName="IsMandatory", name="强制性的", description="Data entry is required in this column", help="The Mandatory checkbox indicates if the field is required for a record to be save to the database.", dataType=FlyDataType.YesNo, entityType="D", printName="强制性的", fieldLength=1)
	isMandatory,
	//
	@FlyElement(columnName="IsMandatoryPL", name="Mandatory Promotion Line", description="Order must have this promotion line", help="The mandatory promotion check box indicates that the order must have this promotion line", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Promotion Line", fieldLength=1)
	isMandatoryPL,
	//
	@FlyElement(columnName="IsMandatoryWithholding", name="强制性的扣留", description="钱一定是扣留", help="The Mandatory Withholding checkbox indicates that monies must be withheld from this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="强制性的扣留", fieldLength=1)
	isMandatoryWithholding,
	//
	@FlyElement(columnName="IsManual", name="手工", description="这是手工的程序", help="The Manual check box indicates if the process will done manually.", dataType=FlyDataType.YesNo, entityType="D", printName="手工", fieldLength=1)
	isManual,
	//
	@FlyElement(columnName="IsManufactured", name="Manufactured", description="This product is manufactured", dataType=FlyDataType.YesNo, entityType="D", printName="Manufactured", fieldLength=1)
	isManufactured,
	//
	@FlyElement(columnName="IsManufacturer", name="Is Manufacturer", description="Indicate role of this Business partner as Manufacturer", dataType=FlyDataType.YesNo, entityType="D", printName="Is Manufacturer", fieldLength=1)
	isManufacturer,
	//
	@FlyElement(columnName="IsMaxCalc", name="Calculate Maximim (↑)", description="Calculate the maximim amount", help="Calculate the Maximum (↑)  of the data if the field is numeric, otherwise maximum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Calc Max", fieldLength=1)
	isMaxCalc,
	//
	@FlyElement(columnName="IsMenuAssets", name="Menu Assets", description="Show Menu Assets", dataType=FlyDataType.YesNo, entityType="D", printName="Assets", fieldLength=1)
	isMenuAssets,
	//
	@FlyElement(columnName="IsMenuContact", name="Menu Contact", description="Show Menu Contact", dataType=FlyDataType.YesNo, entityType="D", printName="Contact", fieldLength=1)
	isMenuContact,
	//
	@FlyElement(columnName="IsMenuInterests", name="Menu Interests", description="Show Menu Interests", dataType=FlyDataType.YesNo, entityType="D", printName="Interests", fieldLength=1)
	isMenuInterests,
	//
	@FlyElement(columnName="IsMenuInvoices", name="Menu Invoices", description="Show Menu Invoices", dataType=FlyDataType.YesNo, entityType="D", printName="Invoices", fieldLength=1)
	isMenuInvoices,
	//
	@FlyElement(columnName="IsMenuOrders", name="Menu Orders", description="Show Menu Orders", dataType=FlyDataType.YesNo, entityType="D", printName="Orders", fieldLength=1)
	isMenuOrders,
	//
	@FlyElement(columnName="IsMenuPayments", name="Menu Payments", description="Show Menu Payments", dataType=FlyDataType.YesNo, entityType="D", printName="Payments", fieldLength=1)
	isMenuPayments,
	//
	@FlyElement(columnName="IsMenuRegistrations", name="Menu Registrations", description="Show Menu Registrations", dataType=FlyDataType.YesNo, entityType="D", printName="Registrations", fieldLength=1)
	isMenuRegistrations,
	//
	@FlyElement(columnName="IsMenuRequests", name="Menu Requests", description="Show Menu Requests", dataType=FlyDataType.YesNo, entityType="D", printName="Requests", fieldLength=1)
	isMenuRequests,
	//
	@FlyElement(columnName="IsMenuRfQs", name="Menu RfQs", description="Show Menu RfQs", dataType=FlyDataType.YesNo, entityType="D", printName="RfQs", fieldLength=1)
	isMenuRfQs,
	//
	@FlyElement(columnName="IsMenuShipments", name="Menu Shipments", description="Show Menu Shipments", dataType=FlyDataType.YesNo, entityType="D", printName="Shipments", fieldLength=1)
	isMenuShipments,
	//
	@FlyElement(columnName="IsMinCalc", name="Calculate Minimum (↓)", description="Calculate the minimum amount", help="Calculate the Minimum (↓) of the data if the field is numeric, otherwise minimum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="Calc Min", fieldLength=1)
	isMinCalc,
	//
	@FlyElement(columnName="IsModified", name="Modified", description="The record is modified", help="Indication that the record is modified", dataType=FlyDataType.YesNo, entityType="D", printName="Modified", fieldLength=1)
	isModified,
	//
	@FlyElement(columnName="IsModifyPrice", name="Modify Price", description="Allow modifying the price", help="Allow modifying the price for products with a non zero price", dataType=FlyDataType.YesNo, entityType="D", printName="Modify Price", fieldLength=1)
	isModifyPrice,
	//
	@FlyElement(columnName="IsMultiLineHeader", name="Multi Line Header", description="Print column headers on mutliple lines if necessary.", help="If selected, column header text will wrap onto the next line -- otherwise the text will be truncated.", dataType=FlyDataType.YesNo, entityType="D", printName="Multi Line Header", fieldLength=1)
	isMultiLineHeader,
	//
	@FlyElement(columnName="IsMultiLingualDocument", name="多语言文件", description="多语言文件", help="If selected, you enable multi lingual documents and need to maintain translations for entities used in documents (examples: Products, Payment Terms, ...).<br>	Please note, that the base language is always English.", dataType=FlyDataType.YesNo, entityType="D", printName="多语言文件", fieldLength=1)
	isMultiLingualDocument,
	//
	@FlyElement(columnName="IsMultiRowOnly", name="Multi Row Only", description="This applies to Multi-Row view only", dataType=FlyDataType.YesNo, entityType="D", printName="Multi Row Only", fieldLength=1)
	isMultiRowOnly,
	//
	@FlyElement(columnName="IsNaturalAccount", name="普通帐户", description="主要的普通帐户", help="The natural account is often based on (industry specific) chart of accounts", dataType=FlyDataType.YesNo, entityType="D", printName="普通帐户", fieldLength=1)
	isNaturalAccount,
	//
	@FlyElement(columnName="IsNetPrice", name="Net Price", description="Net Price including all discounts", help="If price is set as 'Net Price' no further discounts will be applied.", dataType=FlyDataType.YesNo, entityType="D", printName="Net Price", fieldLength=1)
	isNetPrice,
	//
	@FlyElement(columnName="IsNewNull", name="New value null", description="The new value is null.", dataType=FlyDataType.NONE, entityType="D", printName="New value null", fieldLength=0)
	isNewNull,
	//
	@FlyElement(columnName="IsNews", name="Uses News", description="Template or container uses news channels", help="This content (container or template) uses news channels", dataType=FlyDataType.YesNo, entityType="D", printName="Uses News", fieldLength=1)
	isNews,
	//
	@FlyElement(columnName="IsNextBusinessDay", name="下一个业务日", description="Payment due on the next business day", help="The Next Business Day checkbox indicates that payment is due on the next business day after invoice or delivery.", dataType=FlyDataType.YesNo, entityType="D", printName="下一个业务日", fieldLength=1)
	isNextBusinessDay,
	//
	@FlyElement(columnName="IsNextLine", name="下一行", description="Print item on next line", help="If not selected, the item is printed on the same line", dataType=FlyDataType.YesNo, entityType="D", printName="下一行", fieldLength=1)
	isNextLine,
	//
	@FlyElement(columnName="IsNextPage", name="下一页", description="The column is printed on the next page", help="Before printing this column, there will be a page break.", dataType=FlyDataType.YesNo, entityType="D", printName="下一页", fieldLength=1)
	isNextPage,
	//
	@FlyElement(columnName="ISO_Code", name="ISO货币编码", description="币种的 ISO 4217 编码", help="For details - http:  www.unece.org trade rec rec09en.htm", dataType=FlyDataType.String, entityType="D", printName="ISO货币编码", fieldLength=3)
	iSOCode,
	//
	@FlyElement(columnName="ISO_Code_To", name="ISO Currency To Code", description="Three letter ISO 4217 Code of the To Currency", help="For details - http://www.unece.org/trade/rec/rec09en.htm", dataType=FlyDataType.String, entityType="D", printName="ISO Currency To", fieldLength=3)
	iSOCodeTo,
	//
	@FlyElement(columnName="IsOfferQty", name="Offer Quantity", description="This quantity is used in the Offer to the Customer", help="When multiple quantities are used in an Request for Quotation, the selected Quantity is used for generating the offer.  If none selected the lowest number is used.", dataType=FlyDataType.YesNo, entityType="D", printName="Offer Qty", fieldLength=1)
	isOfferQty,
	//
	@FlyElement(columnName="IsOldNull", name="Old value null", description="The old value was null.", dataType=FlyDataType.NONE, entityType="D", printName="Old value null", fieldLength=0)
	isOldNull,
	//
	@FlyElement(columnName="IsOneAssetPerUOM", name="One Asset Per UOM", description="Create one asset per UOM", help="If selected, one asset per UOM is created, otherwise one asset with the quantity received/shipped.  If you have multiple lines, one asset is created per line.", dataType=FlyDataType.YesNo, entityType="D", printName="One Asset Per UOM", fieldLength=1)
	isOneAssetPerUOM,
	//
	@FlyElement(columnName="IsOneTime", name="一次性交易", dataType=FlyDataType.YesNo, entityType="D", printName="一次性交易", fieldLength=1)
	isOneTime,
	//
	@FlyElement(columnName="IsOnline", name="在线访问", description="在线能被存取 ", help="The Online Access check box indicates if the application can be accessed via the web. ", dataType=FlyDataType.YesNo, entityType="D", printName="在线访问", fieldLength=1)
	isOnline,
	//
	@FlyElement(columnName="IsOnlyIfBPBalance", name="Only If BP has Balance", description="Include only if Business Partner has outstanding Balance", dataType=FlyDataType.NONE, entityType="D", printName="Only If BP has Balance", fieldLength=0)
	isOnlyIfBPBalance,
	//
	@FlyElement(columnName="IsOpen", name="Open Status", description="The status is closed", help="This allows to have the three generat situations of 'not open' - 'open' - 'closed'", dataType=FlyDataType.YesNo, entityType="D", printName="Open", fieldLength=1)
	isOpen,
	//
	@FlyElement(columnName="IsOpenByDefault", name="Open By Default", dataType=FlyDataType.YesNo, entityType="D", printName="Open By Default", fieldLength=1)
	isOpenByDefault,
	//
	@FlyElement(columnName="IsOrderBy", name="Order by", description="Include in sort order", help="The records are ordered by the value of this column. If a column is used for grouping, it needs to be included in the sort order as well.", dataType=FlyDataType.YesNo, entityType="D", printName="Order by", fieldLength=1)
	isOrderBy,
	//
	@FlyElement(columnName="IsOrderByValue", name="Order By Value", description="Order list using the value column instead of the name column", help="Order list using the value column instead of the name column", dataType=FlyDataType.YesNo, entityType="D", printName="Order By Value", fieldLength=1)
	isOrderByValue,
	//
	@FlyElement(columnName="IsOrgTrxDim", name="OrgTrx Dimension", description="Include OrgTrx as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="OrgTrx Dimension", fieldLength=1)
	isOrgTrxDim,
	//
	@FlyElement(columnName="IsOverUnderPayment", name="多于或少于付款", description="Over-Payment (unallocated) or Under-Payment (partial payment)", help="Overpayments (negative) are unallocated amounts and allow you to receive money for more than the particular invoice. 	Underpayments (positive) is a partial payment for the invoice. You do not write off the unpaid amount.", dataType=FlyDataType.YesNo, entityType="D", printName="多于或少于付款", fieldLength=1)
	isOverUnderPayment,
	//
	@FlyElement(columnName="IsOverwriteDateOnComplete", name="Overwrite Date on Complete", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Date on Complete", fieldLength=1)
	isOverwriteDateOnComplete,
	//
	@FlyElement(columnName="IsOverwriteSeqOnComplete", name="Overwrite Sequence on Complete", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Sequence on Complete", fieldLength=1)
	isOverwriteSeqOnComplete,
	//
	@FlyElement(columnName="IsOwnBank", name="所有者的银行", description="Bank for this Organization", help="The Own Bank field indicates if this bank is for this Organization as opposed to a Bank for a Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="所有者的银行", fieldLength=1)
	isOwnBank,
	//
	@FlyElement(columnName="IsOwned", name="拥有", description="The asset is owned by the organization", help="The asset may not be in possession, but the asset is legally owned by the organization", dataType=FlyDataType.YesNo, entityType="D", printName="拥有", fieldLength=1)
	isOwned,
	//
	@FlyElement(columnName="IsPageBreak", name="新的页", description="有新的页开始", help="Before printing this item, create a new page", dataType=FlyDataType.YesNo, entityType="D", printName="新的页", fieldLength=1)
	isPageBreak,
	//
	@FlyElement(columnName="IsPaid", name="支付", description="文件被支付", dataType=FlyDataType.YesNo, entityType="D", printName="支付", fieldLength=1)
	isPaid,
	//
	@FlyElement(columnName="IsPaidTo3Party", name="向第三方支付", description="Amount paid to someone other than the Business Partner", help="The Paid to Third Party checkbox indicates that the amounts are paid to someone other than the Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="向第三方支付", fieldLength=1)
	isPaidTo3Party,
	//
	@FlyElement(columnName="IsPaintBoundaryLines", name="绘图边界线", description="绘图表边界线", help="在表的周围绘图线", dataType=FlyDataType.YesNo, entityType="D", printName="绘图边界线", fieldLength=1)
	isPaintBoundaryLines,
	//
	@FlyElement(columnName="IsPaintHeaderLines", name="Paint Header Lines", description="Paint Lines over/under the Header Line ", help="If selected, a line is painted above and below the header line using the stroke information", dataType=FlyDataType.YesNo, entityType="D", printName="Header Lines", fieldLength=1)
	isPaintHeaderLines,
	//
	@FlyElement(columnName="IsPaintHLines", name="绘图 H 线", description="Paint horizontal lines", help="绘图水平线表", dataType=FlyDataType.YesNo, entityType="D", printName="绘图 H 线", fieldLength=1)
	isPaintHLines,
	//
	@FlyElement(columnName="IsPaintVLines", name="绘图 V 线", description="垂直的线绘图", help="绘图垂直的表", dataType=FlyDataType.YesNo, entityType="D", printName="绘图 V 线", fieldLength=1)
	isPaintVLines,
	//
	@FlyElement(columnName="IsParent", name="父表连接列", description="This column is a link to the parent table (e.g. header from lines) - incl. Association key columns", help="The Parent checkbox indicates if this column is a link to the parent table.", dataType=FlyDataType.YesNo, entityType="D", printName="父表连接列", fieldLength=1)
	isParent,
	//
	@FlyElement(columnName="IsPassive", name="Transfer passive", description="FTP passive transfer", help="Should the transfer be run in passive mode?", dataType=FlyDataType.YesNo, entityType="D", printName="Transfer passive", fieldLength=1)
	isPassive,
	//
	@FlyElement(columnName="IsPayFrom", name="支付来自地址", description="Business Partner pays from that address and we'll send dunning letters there", help="The Pay From Address checkbox indicates if this location is the address the Business Partner pays from and where dunning letters will be sent.", dataType=FlyDataType.YesNo, entityType="D", printName="支付来自地址", fieldLength=1)
	isPayFrom,
	//
	@FlyElement(columnName="IsPayScheduleValid", name="Pay Schedule valid", description="Is the Payment Schedule is valid", help="Payment Schedules allow to have multiple due dates.", dataType=FlyDataType.YesNo, entityType="D", printName="Pay Schedule valid", fieldLength=1)
	isPayScheduleValid,
	//
	@FlyElement(columnName="IsPercentWithholding", name="百分比扣留", description="Withholding amount is a percentage of the invoice amount", help="The Percent Withholding checkbox indicates if the withholding amount is a percentage of the invoice amount.", dataType=FlyDataType.YesNo, entityType="D", printName="百分比扣留", fieldLength=1)
	isPercentWithholding,
	//
	@FlyElement(columnName="IsPersonalAccess", name="个人数据访问权", description="Allow access to all personal records", help="Users of this role have access to all records locked as personal.", dataType=FlyDataType.YesNo, entityType="D", printName="个人数据访问权", fieldLength=1)
	isPersonalAccess,
	//
	@FlyElement(columnName="IsPersonalLock", name="个人数据加锁", description="Allow users with role to lock access to personal records", help="If enabled, the user with the role can prevent access of others to personal records.  If a record is locked, only the user or people who can read personal locked records can see the record.", dataType=FlyDataType.YesNo, entityType="D", printName="Personal Lock", fieldLength=1)
	isPersonalLock,
	//
	@FlyElement(columnName="IsPhantom", name="Phantom", description="Phantom Component", help="Phantom Component are not stored and produced with the product. This is an option to avild maintaining an Engineering and Manufacturing Bill of Materials.", dataType=FlyDataType.YesNo, entityType="D", printName="Phantom", fieldLength=1)
	isPhantom,
	//
	@FlyElement(columnName="IsPickListPrintDetails", name="提货列表打印明细", description="Print detail BOM elements on the pick list", help="The Print Details on Pick List indicates that the BOM element products will print on the Pick List as opposed to this product.", dataType=FlyDataType.YesNo, entityType="D", printName="提货列表打印明细", fieldLength=1)
	isPickListPrintDetails,
	//
	@FlyElement(columnName="IsPickQAConfirm", name="Pick/QA Confirmation", description="Require Pick or QA Confirmation before processing", help="The processing of the Shipment (Receipt) requires Pick (QA) Confirmation", dataType=FlyDataType.YesNo, entityType="D", printName="Pick/QA Confirm", fieldLength=1)
	isPickQAConfirm,
	//
	@FlyElement(columnName="IsPositiveOnly", name="只有正数", description="Do not generate negative commissions", help="The Positive Only check box indicates that if the result of the subtraction is negative, it is ignored.  This would mean that negative commissions would not be generated.", dataType=FlyDataType.YesNo, entityType="D", printName="只有正数", fieldLength=1)
	isPositiveOnly,
	//
	@FlyElement(columnName="IsPOSRequiredPIN", name="POS Required PIN", description="Indicates that a Supervisor Pin is mandatory to execute some tasks e.g. (Change Price , Offer Discount , Delete POS Line)", dataType=FlyDataType.YesNo, entityType="D", printName="POS Required PIN", fieldLength=1)
	isPOSRequiredPIN,
	//
	@FlyElement(columnName="IsPostcodeLookup", name="Use Postcode Lookup", description="Does this country have a post code web service", help="Enable the IsPostcodeLookup if you wish to configure a post code lookup web service", dataType=FlyDataType.YesNo, entityType="D", printName="Use Postcode Lookup", fieldLength=1)
	isPostcodeLookup,
	//
	@FlyElement(columnName="IsPostIfClearingEqual", name="Post if Clearing Equal", description="This flag controls if Adempiere must post when clearing (transit) and final accounts are the same", dataType=FlyDataType.YesNo, entityType="D", printName="Post if Clearing Equal", fieldLength=1)
	isPostIfClearingEqual,
	//
	@FlyElement(columnName="IsPostImmediate", name="Post Immediately (Deprecated)", description="Post the accounting immediately for testing (Deprecated)", help="If selected, the accounting consequences are immediately generated when completing a document.  Otherwise the document is posted by a batch process.  You should select this only if you are testing.	Deprecated column - use instead the functionality Client Accounting.", dataType=FlyDataType.YesNo, entityType="D", printName="Post Immediate", fieldLength=1)
	isPostImmediate,
	//
	@FlyElement(columnName="IsPostServices", name="Post Services Separately", description="Differentiate between Services and Product Receivable/Payables", help="If selected, you will post service related revenue to a different receivables account and service related cost to a different payables account.", dataType=FlyDataType.YesNo, entityType="D", printName="Post Services", fieldLength=1)
	isPostServices,
	//
	@FlyElement(columnName="IsPOTaxExempt", name="PO Tax exempt", description="Business partner is exempt from tax on purchases", help="If a business partner is exempt from tax on purchases, the exempt tax rate is used. For this, you need to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate.  This is required for tax reporting, so that you can track tax exempt transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="PO Tax exempt", fieldLength=1)
	isPOTaxExempt,
	//
	@FlyElement(columnName="IsPrepareSplitDocument", name="Prepare Split Document", description="Prepare generated split shipment/receipt document", dataType=FlyDataType.YesNo, entityType="D", printName="Prepare Split Doc", fieldLength=1)
	isPrepareSplitDocument,
	//
	@FlyElement(columnName="IsPrepayment", name="Prepayment", description="The Payment/Receipt is a Prepayment", help="Payments not allocated to an invoice with a charge are posted to Unallocated Payments. When setting this flag, the payment is posted to the Customer or Vendor Prepayment account.", dataType=FlyDataType.YesNo, entityType="D", printName="Prepayment", fieldLength=1)
	isPrepayment,
	//
	@FlyElement(columnName="isPresentForProduct", name="isPresentForProduct", dataType=FlyDataType.YesNo, entityType="D", printName="Present for Product", fieldLength=1)
	isPresentForProduct,
	//
	@FlyElement(columnName="IsPrimary", name="主", description="主预算", help="The Primary checkbox indicates if this budget is the primary budget.", dataType=FlyDataType.YesNo, entityType="D", printName="主", fieldLength=1)
	isPrimary,
	//
	@FlyElement(columnName="IsPrintBarcodeText", name="Print Barcode Text", description="Print barcode text beneath symbol", dataType=FlyDataType.NONE, entityType="D", printName="Print Barcode Text", fieldLength=0)
	isPrintBarcodeText,
	//
	@FlyElement(columnName="IsPrinted", name="已打印", description="Indicates if this document is printed", help="The Printed checkbox indicates if this document will be printed.", dataType=FlyDataType.YesNo, entityType="D", printName="已打印", fieldLength=1)
	isPrinted,
	//
	@FlyElement(columnName="IsPrintFunctionSymbols", name="打印功能符号", description="Print Symbols for Functions (Sum, Average, Count)", help="If selected, print symbols - otherwise print names of the function", dataType=FlyDataType.YesNo, entityType="D", printName="打印功能符号", fieldLength=1)
	isPrintFunctionSymbols,
	//
	@FlyElement(columnName="IsPrintParameters", name="Print Parameters", description="Print query parameters on list report", help="If selected, query parameters will be printed at the start of the report.", dataType=FlyDataType.YesNo, entityType="D", printName="Print Parameters", fieldLength=1)
	isPrintParameters,
	//
	@FlyElement(columnName="IsProcessing", name="正在处理", dataType=FlyDataType.YesNo, entityType="D", printName="正在处理", fieldLength=1)
	isProcessing,
	//
	@FlyElement(columnName="IsProductDim", name="Product Dimension", description="Include Product as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Product Dimension", fieldLength=1)
	isProductDim,
	//
	@FlyElement(columnName="IsProjectDim", name="Project Dimension", description="Include Project as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Project Dimension", fieldLength=1)
	isProjectDim,
	//
	@FlyElement(columnName="IsProjectPhaseDim", name="Project Phase  Dimension", description="Include Project Phase as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Project Phase Dimension", fieldLength=1)
	isProjectPhaseDim,
	//
	@FlyElement(columnName="IsProjectTaskDim", name="Project Task  Dimension", description="Include Project Task as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Project Task Dimension", fieldLength=1)
	isProjectTaskDim,
	//
	@FlyElement(columnName="IsProspect", name="有效视图 Active Prospect/Customer", description="Indicates a Prospect as opposed to an active Customer", help="The Prospect checkbox indicates an entity that is an active prospect but is not yet a customer.", dataType=FlyDataType.YesNo, entityType="D", printName="有效视图 Active Prospect/Customer", fieldLength=1)
	isProspect,
	//
	@FlyElement(columnName="IsPublic", name="公众", description="公众可读条目", help="If selected, public users can read view the entry. Public are users without a Role in the system. Use security rules for more specic access control.", dataType=FlyDataType.YesNo, entityType="D", printName="公众", fieldLength=1)
	isPublic,
	//
	@FlyElement(columnName="IsPublicWrite", name="公众可写", description="公众可写条目", help="If selected, public users can write create entries. Public are users without a Role in the system. Use security rules for more specic access control.", dataType=FlyDataType.YesNo, entityType="D", printName="公众可写", fieldLength=1)
	isPublicWrite,
	//
	@FlyElement(columnName="IsPublished", name="Published", description="The Topic is published and can be viewed", help="If not selected, the Topic is not visible to the general public.", dataType=FlyDataType.YesNo, entityType="D", printName="Published", fieldLength=1)
	isPublished,
	//
	@FlyElement(columnName="IsPurchased", name="采购", description="Organization purchases this product", help="The Purchased check box indicates if this product is purchased by this organization.", dataType=FlyDataType.YesNo, entityType="D", printName="采购", fieldLength=1)
	isPurchased,
	//
	@FlyElement(columnName="IsPurchaseQty", name="Purchase Quantity", description="This quantity is used in the Purchase Order to the Supplier", help="When multiple quantities are used in an Request for Quotation, the selected Quantity is used for generating the purchase order.  If none selected the lowest number is used.", dataType=FlyDataType.YesNo, entityType="D", printName="Purchase Qty", fieldLength=1)
	isPurchaseQty,
	//
	@FlyElement(columnName="IsQCPass", name="QC Pass", dataType=FlyDataType.YesNo, entityType="D", printName="QC Pass", fieldLength=1)
	isQCPass,
	//
	@FlyElement(columnName="IsQuantityBased", name="数量基于", description="Trade discount break level based on Quantity (not value)", help="The calculation of the trade discount level is based on the quantity of the order and not the value amount of the order", dataType=FlyDataType.YesNo, entityType="D", printName="数量基于", fieldLength=1)
	isQuantityBased,
	//
	@FlyElement(columnName="IsQueryCriteria", name="Query Criteria", description="The column is also used as a query criteria", help="The column is used to enter queries - the SQL cannot be an expression", dataType=FlyDataType.YesNo, entityType="D", printName="Query Criteria", fieldLength=1)
	isQueryCriteria,
	//
	@FlyElement(columnName="IsQuoteAllQty", name="Quote All Quantities", description="Suppliers are requested to provide responses for all quantities", help="If selected, the response to the Request for Quotation needs to have a price for all Quantities", dataType=FlyDataType.YesNo, entityType="D", printName="Quote All Qty", fieldLength=1)
	isQuoteAllQty,
	//
	@FlyElement(columnName="IsQuoteTotalAmt", name="Quote Total Amt", description="The respnse can have just the total amount for the RfQ", help="If not selected, the resonse must be provided per line", dataType=FlyDataType.YesNo, entityType="D", printName="Quote Total Amt", fieldLength=1)
	isQuoteTotalAmt,
	//
	@FlyElement(columnName="IsRange", name="范围", description="The parameter is a range of values", help="The Range checkbox indicates that this parameter is a range of values.", dataType=FlyDataType.YesNo, entityType="D", printName="范围", fieldLength=1)
	isRange,
	//
	@FlyElement(columnName="IsReadOnly", name="只读", description="字段被只有读", help="The Read Only indicates that this field may only be Read.  It may not be updated.", dataType=FlyDataType.YesNo, entityType="D", printName="只读", fieldLength=1)
	isReadOnly,
	//
	@FlyElement(columnName="IsReadWrite", name="读写", description="Field is read   write", help="The Read Write indicates that this field may be read and updated.", dataType=FlyDataType.YesNo, entityType="D", printName="读写", fieldLength=1)
	isReadWrite,
	//
	@FlyElement(columnName="IsReCalculate", name="Recalculate", description="Allow recalculation", help="When active, a recalculation is allowed", dataType=FlyDataType.YesNo, entityType="D", printName="Recalculate", fieldLength=1)
	isReCalculate,
	//
	@FlyElement(columnName="IsReceipt", name="收货", description="This is a sales transaction (receipt)", dataType=FlyDataType.YesNo, entityType="D", printName="收货", fieldLength=1)
	isReceipt,
	//
	@FlyElement(columnName="IsReconciled", name="已对帐", dataType=FlyDataType.YesNo, entityType="D", printName="已对帐", fieldLength=1)
	isReconciled,
	//
	@FlyElement(columnName="IsRegistered", name="已注册", description="此应用系统已注册。", dataType=FlyDataType.YesNo, entityType="D", printName="已注册", fieldLength=1)
	isRegistered,
	//
	@FlyElement(columnName="IsRelativePosition", name="相对位置", description="The item is relative positioned (not absolute)", help="The relative positioning of the item is determined by X-Z space and next line", dataType=FlyDataType.YesNo, entityType="D", printName="相对位置", fieldLength=1)
	isRelativePosition,
	//
	@FlyElement(columnName="IsRemitTo", name="免除-到地址", description="付款地址", help="The Remit to Address checkbox indicates if this location is the address to which we should send payments to this Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="免除-到地址", fieldLength=1)
	isRemitTo,
	//
	@FlyElement(columnName="IsReplicated", name="已复制", description="The data is successfully replicated", help="The data replication was successful.", dataType=FlyDataType.YesNo, entityType="D", printName="已复制", fieldLength=1)
	isReplicated,
	//
	@FlyElement(columnName="IsReport", name="报表", description="指示一笔报表记录", help="The Report checkbox indicates that this record is a report as opposed to a process", dataType=FlyDataType.YesNo, entityType="D", printName="报表", fieldLength=1)
	isReport,
	//
	@FlyElement(columnName="IsReproducible", name="Reproducible", description="Problem can re reproduced in Gardenworld", help="The problem occurs also in the standard distribution in the demo client Gardenworld.", dataType=FlyDataType.List, entityType="D", printName="Reproducible", fieldLength=1)
	isReproducible,
	//
	@FlyElement(columnName="IsReValidate", name="Re-Validate", description="Re-Validate entries", dataType=FlyDataType.NONE, entityType="D", printName="Re-Validate", fieldLength=0)
	isReValidate,
	//
	@FlyElement(columnName="IsReversal", name="撤销(红冲)", description="撤销(红冲)交易", help="The Reversal check box indicates if this is a reversal of a prior transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="撤销(红冲)", fieldLength=1)
	isReversal,
	//
	@FlyElement(columnName="IsRfQQty", name="RfQ Quantity", description="The quantity is used when generating RfQ Responses", help="When generating the RfQ Responses, this quantity is included", dataType=FlyDataType.YesNo, entityType="D", printName="RfQ Quantity", fieldLength=1)
	isRfQQty,
	//
	@FlyElement(columnName="IsRfQResponseAccepted", name="Responses Accepted", description="Are Resonses to the Request for Quotation accepted", help="If selected, responses for the RfQ are accepted", dataType=FlyDataType.YesNo, entityType="D", printName="Responses Accepted", fieldLength=1)
	isRfQResponseAccepted,
	//
	@FlyElement(columnName="IsRMIoverHTTP", name="隧道经由 HTTP", description="Connect to Server via HTTP Tunnel", help="If selected, the connection to the server is via a HTTP tunnel, otherwise it uses an RMI JNP connection", dataType=FlyDataType.YesNo, entityType="D", printName="隧道经由 HTTP", fieldLength=1)
	isRMIoverHTTP,
	//
	@FlyElement(columnName="IsRunningTotal", name="Running Total", description="Create a running total (sum)", help="A running total creates a sum at the end of a page and on the top of the next page for all colums, which have a Sum function.  You should define running total only once per format.", dataType=FlyDataType.YesNo, entityType="D", printName="Running Total", fieldLength=1)
	isRunningTotal,
	//
	@FlyElement(columnName="IsSalesLead", name="Sales Lead", description="This contact is a sales lead", help="Sales leads can be converted into full contacts with Business Partners.", dataType=FlyDataType.NONE, entityType="D", printName="Sales Lead", fieldLength=0)
	isSalesLead,
	//
	@FlyElement(columnName="IsSalesRegionDim", name="Sales Region Dimension", description="Include Sales Region as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Region Dimension", fieldLength=1)
	isSalesRegionDim,
	//
	@FlyElement(columnName="IsSalesRep", name="销售代表", description="Indicates if  the employee is a sales representative or company agent", help="The Sales Rep checkbox indicates if this employee is also a sales representative.", dataType=FlyDataType.YesNo, entityType="D", printName="销售代表", fieldLength=1)
	isSalesRep,
	//
	@FlyElement(columnName="IsSalesTax", name="Sales Tax", description="This is a sales tax (i.e. not a value added tax)", help="If selected AP tax is handled as expense, otherwise it is handled as a VAT credit.", dataType=FlyDataType.YesNo, entityType="D", printName="Sales Tax", fieldLength=1)
	isSalesTax,
	//
	@FlyElement(columnName="IsSameCurrency", name="相同的币种", dataType=FlyDataType.YesNo, entityType="D", printName="相同的币种", fieldLength=1)
	isSameCurrency,
	//
	@FlyElement(columnName="IsSameDistribution", name="Same distribution for source and target", description="Use the same distribution for source and target", help="Use the same distribution for source and target. Source distribution is for the entitlement of the reward, target distribution is the distribution to get the product to apply the reward to", dataType=FlyDataType.YesNo, entityType="D", printName="Same distribution for source and target", fieldLength=1)
	isSameDistribution,
	//
	@FlyElement(columnName="IsSameLine", name="相同的行", description="Displayed on same line as previous field", help="The Same Line checkbox indicates that the field will display on the same line as the previous field.", dataType=FlyDataType.YesNo, entityType="D", printName="相同的行", fieldLength=1)
	isSameLine,
	//
	@FlyElement(columnName="IsSameTax", name="相同的税", description="Use the same tax as the main transaction", help="The Same Tax checkbox indicates that this charge should use the same tax as the main transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="相同的税", fieldLength=1)
	isSameTax,
	//
	@FlyElement(columnName="IsSameWarehouse", name="Only from same Warehouse", dataType=FlyDataType.YesNo, entityType="D", printName="Only from same Warehouse", fieldLength=1)
	isSameWarehouse,
	//
	@FlyElement(columnName="IsSaveInHistoric", name="Save In Historic", dataType=FlyDataType.YesNo, entityType="D", printName="Save In Historic", fieldLength=1)
	isSaveInHistoric,
	//
	@FlyElement(columnName="IsSecure", name="Secure content", description="Defines whether content needs to get encrypted", help="If you select this parameter this container will only get delivered over a secure connection i.e. SSL etc. if no encryption can be found no content will be delivered", dataType=FlyDataType.YesNo, entityType="D", printName="Secure content", fieldLength=1)
	isSecure,
	//
	@FlyElement(columnName="IsSecurityEnabled", name="启动安全性", description="If security is enabled, user access to data can be restricted via Roles", help="The Security Enabled checkbox indicates that user access to the data in this table can be restricted using Roles.", dataType=FlyDataType.YesNo, entityType="D", printName="启动安全性", fieldLength=1)
	isSecurityEnabled,
	//
	@FlyElement(columnName="IsSelected", name="选择", dataType=FlyDataType.YesNo, entityType="D", printName="选择", fieldLength=1)
	isSelected,
	//
	@FlyElement(columnName="IsSelectedWinner", name="Selected Winner", description="The resonse is the selected winner", help="The resonse is the selected winner. If selected on Response level, the line selections are ignored.", dataType=FlyDataType.YesNo, entityType="D", printName="Selected Winner", fieldLength=1)
	isSelectedWinner,
	//
	@FlyElement(columnName="IsSelectionColumn", name="选择列", description="Is this column used for finding rows in windows", help="If selected, the column is listed in the first find window tab and in the selection part of the window", dataType=FlyDataType.YesNo, entityType="D", printName="选择", fieldLength=1)
	isSelectionColumn,
	//
	@FlyElement(columnName="IsSelfService", name="自助式服务", description="This is a Self-Service entry or this entry can be changed via Self-Service", help="Self-Service allows users to enter data or update their data.  The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality.", dataType=FlyDataType.YesNo, entityType="D", printName="自助式服务", fieldLength=1)
	isSelfService,
	//
	@FlyElement(columnName="IsSendRfQ", name="Send RfQ Invitation to Vendors", description="Send the RfQ Invitation to the Vendors", dataType=FlyDataType.NONE, entityType="D", printName="Send RfQ to Vendor", fieldLength=0)
	isSendRfQ,
	//
	@FlyElement(columnName="IsSerNo", name="序列号", description="The product instances have Serial Numbers", help="For individual products, you can define Serial Numbers", dataType=FlyDataType.YesNo, entityType="D", printName="序列号", fieldLength=1)
	isSerNo,
	//
	@FlyElement(columnName="IsSerNoMandatory", name="Mandatory Serial No", description="The entry of a Serial No is mandatory when creating a Product Instance", dataType=FlyDataType.YesNo, entityType="D", printName="Mandatory Serial No", fieldLength=1)
	isSerNoMandatory,
	//
	@FlyElement(columnName="IsServerEMail", name="Server EMail", description="Send EMail from Server", help="When selected, mail is sent from the server rather then the client.  This decreases availability.  You would select this when you do not want to enable email relay for the client addresses in your mail server.", dataType=FlyDataType.YesNo, entityType="D", printName="Server EMail", fieldLength=1)
	isServerEMail,
	//
	@FlyElement(columnName="IsServerProcess", name="Server Process", description="Run this Process on Server only", help="Enabling this flag disables to run the process on the client.  This potentially decreases the availability.", dataType=FlyDataType.YesNo, entityType="D", printName="Server Process", fieldLength=1)
	isServerProcess,
	//
	@FlyElement(columnName="IsSetCreditStop", name="Credit Stop", description="Set the business partner to credit stop", help="If a dunning letter of this level is created, the business partner is set to Credit Stop (needs to be manually changed).", dataType=FlyDataType.YesNo, entityType="D", printName="Credit Stop", fieldLength=1)
	isSetCreditStop,
	//
	@FlyElement(columnName="IsSetNLPosition", name="设定 NL 位置", description="设定新的线位置", help="When enabled, the current x (horizontal) Position before printing the item is saved. The next New Line will use the saved x (horizontal) Position, enabling to print data in columns.	The setting is not restricted to an area (header, content, footer), allowing to align information also with Header and Footer with the Content.", dataType=FlyDataType.YesNo, entityType="D", printName="设定 NL 位置", fieldLength=1)
	isSetNLPosition,
	//
	@FlyElement(columnName="IsSetPaymentTerm", name="Set Payment Term", description="Set the payment term of the Business Partner", help="If a dunning letter of this level is created, the payment term of this business partner is overwritten.", dataType=FlyDataType.YesNo, entityType="D", printName="Set Payment Term", fieldLength=1)
	isSetPaymentTerm,
	//
	@FlyElement(columnName="IsShipConfirm", name="Ship/Receipt Confirmation", description="Require Ship or Receipt Confirmation before processing", help="The processing of the Shipment (Receipt) requires Ship (Receipt) Confirmation", dataType=FlyDataType.YesNo, entityType="D", printName="Ship/Receipt Confirm", fieldLength=1)
	isShipConfirm,
	//
	@FlyElement(columnName="IsShipTo", name="发运地址", description="Business Partner address to ship goods to", help="The Ship to Address checkbox indicates if this location is the address to use when shipping orders to this Business Partner.", dataType=FlyDataType.YesNo, entityType="D", printName="发运地址", fieldLength=1)
	isShipTo,
	//
	@FlyElement(columnName="IsShowAcct", name="显示财务", description="Users with this role can see accounting information", help="This allows to prevent access to any accounting information.", dataType=FlyDataType.YesNo, entityType="D", printName="显示财务", fieldLength=1)
	isShowAcct,
	//
	@FlyElement(columnName="IsShowAllDue", name="Show All Due", description="Show/print all due invoices", help="The dunning letter with this level includes all due invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="Show All Due", fieldLength=1)
	isShowAllDue,
	//
	@FlyElement(columnName="IsShowNotDue", name="Show Not Due", description="Show/print all invoices which are not due (yet).", help="The dunning letter with this level includes all not due invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="Show Not Due", fieldLength=1)
	isShowNotDue,
	//
	@FlyElement(columnName="IsShowOppositeSign", name="Show Opposite Sign", description="Display values with the opposite sign", help="Displays values for a Report Line with the opposite sign to the calculated value. The 'Allow Opposite Sign' flag on Report Column must also be set for this to take effect. Note that all report calculations are performed before the sign is reversed.", dataType=FlyDataType.YesNo, entityType="D", printName="Show Opposite Sign", fieldLength=1)
	isShowOppositeSign,
	//
	@FlyElement(columnName="IsSimulation", name="模拟", description="Performing the function is only simulated", dataType=FlyDataType.NONE, entityType="D", printName="模拟", fieldLength=0)
	isSimulation,
	//
	@FlyElement(columnName="IsSingleAssignment", name="只有单一任务", description="Only one assignment at a time (no double-booking or overlapping)", help="If selected, you can only have one assignment for the resource at a single point in time.   It is also  not possible to have overlapping assignments.", dataType=FlyDataType.YesNo, entityType="D", printName="单一任务", fieldLength=1)
	isSingleAssignment,
	//
	@FlyElement(columnName="IsSingleRow", name="单记录排列", description="Default for toggle between Single- and Multi-Row (Grid) Layout", help="The Single Row Layout checkbox indicates if the default display type for this window is a single row as opposed to multi row.", dataType=FlyDataType.YesNo, entityType="D", printName="单记录排列", fieldLength=1)
	isSingleRow,
	//
	@FlyElement(columnName="IsSmtpAuthorization", name="SMTP验证", description="Your mail server requires Authentification", help="Some email servers require authentification before sending emails.  If yes, users are required to define their email user name and password.  If authentification is required and no user name and password is required, delivery will fail.", dataType=FlyDataType.YesNo, entityType="D", printName="SMTP验证", fieldLength=1)
	isSmtpAuthorization,
	//
	@FlyElement(columnName="IsSold", name="销售", description="Organization sells this product", help="The Sold check box indicates if this product is sold by this organization.", dataType=FlyDataType.YesNo, entityType="D", printName="销售", fieldLength=1)
	isSold,
	//
	@FlyElement(columnName="IsSOPriceList", name="销售价目表", description="这是销售价目表", help="The Sales Price List check box indicates if this price list is used for sales transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="销售价目表", fieldLength=1)
	isSOPriceList,
	//
	@FlyElement(columnName="IsSortTab", name="定单页签", description="页签定单", dataType=FlyDataType.YesNo, entityType="D", printName="定单页签", fieldLength=1)
	isSortTab,
	//
	@FlyElement(columnName="IsSOTrx", name="销售交易", description="这是销售交易", help="The Sales Transaction checkbox indicates if this item is a Sales Transaction.", dataType=FlyDataType.YesNo, entityType="D", printName="销售交易", fieldLength=1)
	isSOTrx,
	//
	@FlyElement(columnName="IsSplitWhenDifference", name="Split when Difference", description="Split document when there is a difference", help="If the confirmation contains differences, the original document is split allowing the original document (shipment) to be processed and updating Inventory - and the newly created document for handling the dispute at a later time. Until the confirmation is processed, the inventory is not updated. ", dataType=FlyDataType.YesNo, entityType="D", printName="Split Difference", fieldLength=1)
	isSplitWhenDifference,
	//
	@FlyElement(columnName="IsStandardHeaderFooter", name="Standard Header Footer", description="The standard Header and Footer is used", help="If the standard header is not used, it must be explicitly defined.", dataType=FlyDataType.YesNo, entityType="D", printName="Standard Header Footer", fieldLength=1)
	isStandardHeaderFooter,
	//
	@FlyElement(columnName="IsStatement", name="Is Statement", description="Dunning Level is a definition of a statement", dataType=FlyDataType.YesNo, entityType="D", printName="Is Statement", fieldLength=1)
	isStatement,
	//
	@FlyElement(columnName="IsStdUserWorkflow", name="Std User Workflow", description="Standard Manual User Approval Workflow", help="If selected, only documents with an open status (drafted, in progress, approved, rejected, invalid) and standard user actions (prepare, complete, approve, reject) are allowed to continue.  Use this to prevent having to define details on how automatic processes (unlock, invalidate, post, re-activate) and when the document is closed for normal user action (completed, waiting, closed, voided, reversed).", dataType=FlyDataType.YesNo, entityType="D", printName="Std User Workflow", fieldLength=1)
	isStdUserWorkflow,
	//
	@FlyElement(columnName="IsStocked", name="存储", description="Organization stocks this product", help="The Stocked check box indicates if this product is stocked by this Organization.", dataType=FlyDataType.YesNo, entityType="D", printName="存储", fieldLength=1)
	isStocked,
	//
	@FlyElement(columnName="IsStocktake", name="Stocktake", help="Enable stocktake enhancements, including facility to record first and second counts.", dataType=FlyDataType.NONE, entityType="D", printName="Stocktake", fieldLength=0)
	isStocktake,
	//
	@FlyElement(columnName="IsSubAcctDim", name="Sub Acct Dimension", description="Include Sub Acct as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="Sub Acct Dimension", fieldLength=1)
	isSubAcctDim,
	//
	@FlyElement(columnName="IssueDescription", name="Issue Description", description="Description of the Issue line", dataType=FlyDataType.String, entityType="D", printName="Issue Description", fieldLength=255)
	issueDescription,
	//
	@FlyElement(columnName="IssueLine", name="Issue Line", description="Line number of the issue", dataType=FlyDataType.Integer, entityType="D", printName="Issue Line", fieldLength=22)
	issueLine,
	//
	@FlyElement(columnName="IssueSource", name="Source", description="Issue Source", help="Source of the Issue", dataType=FlyDataType.List, entityType="D", printName="Source", fieldLength=1)
	issueSource,
	//
	@FlyElement(columnName="IssueStatus", name="Issue Status", description="Current Status of the Issue", help="Description of the current status of the issue", dataType=FlyDataType.Text, entityType="D", printName="Issue Status", fieldLength=2000)
	issueStatus,
	//
	@FlyElement(columnName="IssueSummary", name="Issue Summary", description="Issue Summary", dataType=FlyDataType.String, entityType="D", printName="Issue Summary", fieldLength=2000)
	issueSummary,
	//
	@FlyElement(columnName="IsSummarized", name="计算总数", description="Calculate the total sum of numeric content or length", help="Calculate the total sum of the data if the field is numeric, otherwise total sum length of the field.", dataType=FlyDataType.YesNo, entityType="D", printName="总数", fieldLength=1)
	isSummarized,
	//
	@FlyElement(columnName="IsSummary", name="汇总级别", description="这是父类实体", help="A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.", dataType=FlyDataType.YesNo, entityType="D", printName="汇总级别", fieldLength=1)
	isSummary,
	//
	@FlyElement(columnName="IsSuppressNull", name="压缩空值", description="Suppress columns or elements with NULL value", help="If a Form entry is NULL and if selected, the field (including label) is not printed. <br>	If all elements in a table column are NULL and if selected, the column is not printed.", dataType=FlyDataType.YesNo, entityType="D", printName="压缩空值", fieldLength=1)
	isSuppressNull,
	//
	@FlyElement(columnName="IsSuppressRepeats", name="Suppress Repeats", description="Suppress repeated elements in column.", help="Determines whether repeated elements in a column are repeated in a printed table.", dataType=FlyDataType.YesNo, entityType="D", printName="Suppress Repeats", fieldLength=1)
	isSuppressRepeats,
	//
	@FlyElement(columnName="IsSyncDatabase", name="同步数据库", description="Change database table definition when changing dictionary definition", help="When selected, the database column definition is updated based on your entries in the Column definition of the Application Dictionary.", dataType=FlyDataType.Button, entityType="D", printName="同步数据库", fieldLength=1)
	isSyncDatabase,
	//
	@FlyElement(columnName="IsSystemLanguage", name="系统语言", description="The screens, etc. are maintained in this Language", help="Select, if you want to have translated screens available in this language.  Please notify your system administrator to run the language maintenance scripts to enable the use of this language.  If the language is not supplied, you can translate the terms yourself. ", dataType=FlyDataType.YesNo, entityType="D", printName="系统语言", fieldLength=1)
	isSystemLanguage,
	//
	@FlyElement(columnName="IsTableBased", name="基于表", description="表立基于了目录报表", help="Table based columnar list reporting is invoked from the Window Report button", dataType=FlyDataType.YesNo, entityType="D", printName="基于表", fieldLength=1)
	isTableBased,
	//
	@FlyElement(columnName="IsTableID", name="用作记录的ID标识", description="The document number  will be used as the record key", help="The Used for Record ID checkbox indicates if the document id will be used as the key to the record", dataType=FlyDataType.YesNo, entityType="D", printName="用作记录的ID标识", fieldLength=1)
	isTableID,
	//
	@FlyElement(columnName="IsTaxExempt", name="免税业务伙伴", description="业务伙伴免税", help="If a business partner is exempt from tax, the exempt tax rate is used. For this, you need to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate.  This is required for tax reporting, so that you can track tax exempt transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="免税业务伙伴", fieldLength=1)
	isTaxExempt,
	//
	@FlyElement(columnName="IsTaxIncluded", name="价格包括税", description="价格已包含税 ", help="The Tax Included checkbox indicates if the prices include tax.  This is also known as the gross price.", dataType=FlyDataType.YesNo, entityType="D", printName="价格包括税", fieldLength=1)
	isTaxIncluded,
	//
	@FlyElement(columnName="IsTaxProrated", name="比例分配税", description="税被比例分配", help="The Prorate Tax checkbox indicates if this tax is prorated.", dataType=FlyDataType.YesNo, entityType="D", printName="比例分配税", fieldLength=1)
	isTaxProrated,
	//
	@FlyElement(columnName="IsTaxWithholding", name="税扣留", description="This is a tax related withholding", help="The Tax Withholding checkbox indicates if this withholding is tax related.", dataType=FlyDataType.YesNo, entityType="D", printName="税扣留", fieldLength=1)
	isTaxWithholding,
	//
	@FlyElement(columnName="IsTemporaryExempt", name="暂时的免税者", description="Temporarily do not withhold taxes", help="The Temporary Exempt checkbox indicates that for a limited time, taxes will not be withheld for this employee.", dataType=FlyDataType.YesNo, entityType="D", printName="暂时的免税者", fieldLength=1)
	isTemporaryExempt,
	//
	@FlyElement(columnName="IsTest", name="测试", description="在测试模态中运行", dataType=FlyDataType.NONE, entityType="D", printName="测试", fieldLength=0)
	isTest,
	//
	@FlyElement(columnName="IsTimeBased", name="基于时间", description="Time based Revenue Recognition rather than Service Level based", help="Revenue Recognition can be time or service level based.", dataType=FlyDataType.YesNo, entityType="D", printName="基于时间", fieldLength=1)
	isTimeBased,
	//
	@FlyElement(columnName="IsTimeReport", name="时间报表", description="Line is a time report only (no expense)", help="The line contains only time information", dataType=FlyDataType.YesNo, entityType="D", printName="时间报表", fieldLength=1)
	isTimeReport,
	//
	@FlyElement(columnName="IsTimeSeries", name="Time Series", description="The domain data for the chart is organised by time.", help="A time series chart will automatically group and restrict the data by the time unit and scope specified.", dataType=FlyDataType.YesNo, entityType="D", printName="Time Series", fieldLength=1)
	isTimeSeries,
	//
	@FlyElement(columnName="IsTimeSlot", name="时间段", description="Resource has time slot availability", help="Resource is only available at certain times", dataType=FlyDataType.YesNo, entityType="D", printName="时间段", fieldLength=1)
	isTimeSlot,
	//
	@FlyElement(columnName="IsToFormule", name="Is To Formule ", dataType=FlyDataType.NONE, entityType="D", printName="Is To Formule ", fieldLength=0)
	isToFormule,
	//
	@FlyElement(columnName="IsTotallyPaid", name="Paid totally", description="The document is totally paid", help="The document has been paid totally, i.e. there is nothing left to pay.", dataType=FlyDataType.YesNo, entityType="D", printName="Paid totally", fieldLength=1)
	isTotallyPaid,
	//
	@FlyElement(columnName="IsTrackIssues", name="Track Issues", description="Enable tracking issues for this asset", help="Issues created by automatic Error Reporting", dataType=FlyDataType.YesNo, entityType="D", printName="Track Issues", fieldLength=1)
	isTrackIssues,
	//
	@FlyElement(columnName="IsTradeDiscountPosted", name="过帐批发折扣", description="Generate postings for trade discounts", help="If the invoice is based on an item with a list price, the amount based on the list price and the discount is posted instead of the net amount.		Example: Quantity 10 - List Price: 20 - Actual Price: 17	If selected for a sales invoice 200 is posted to Product Revenue and 30 to Discount Granted - rather than 170 to Product Revenue.	The same applies to vendor invoices.", dataType=FlyDataType.YesNo, entityType="D", printName="批发折扣", fieldLength=1)
	isTradeDiscountPosted,
	//
	@FlyElement(columnName="IsTransferred", name="已转移", description="Transferred to General Ledger (i.e. accounted)", help="The transferred checkbox indicates if the transactions associated with this document should be transferred to the General Ledger.", dataType=FlyDataType.YesNo, entityType="D", printName="已转移", fieldLength=1)
	isTransferred,
	//
	@FlyElement(columnName="IsTranslated", name="已翻译", description="列被翻译", help="The Translated checkbox indicates if this column is translated.", dataType=FlyDataType.YesNo, entityType="D", printName="已翻译", fieldLength=1)
	isTranslated,
	//
	@FlyElement(columnName="IsTranslationTab", name="翻译页签", description="This tab contains translation information", help="The Translation Tab checkbox indicate if a tab contains translation information.", dataType=FlyDataType.YesNo, entityType="D", printName="翻译页签", fieldLength=1)
	isTranslationTab,
	//
	@FlyElement(columnName="IsUnconfirmedInOut", name="Orders with unconfirmed Shipments", description="Generate shipments for Orders with open delivery confirmations?", help="You can also include orders who have outstanding confirmations (e.g. ordered=10 - not confirmed shipments=4 - would create a new shipment of 6 if available).", dataType=FlyDataType.NONE, entityType="D", printName="Orders with unconfirmed Shipments", fieldLength=0)
	isUnconfirmedInOut,
	//
	@FlyElement(columnName="IsUpdateable", name="可更新的", description="Determines, if the field can be updated", help="The Updateable checkbox indicates if a field can be updated by the user.", dataType=FlyDataType.YesNo, entityType="D", printName="可更新的", fieldLength=1)
	isUpdateable,
	//
	@FlyElement(columnName="IsUpdateCosting", name="Update Costing", dataType=FlyDataType.NONE, entityType="D", printName="Update Costing", fieldLength=0)
	isUpdateCosting,
	//
	@FlyElement(columnName="IsUpdateCountQty", name="Is Update Count Qty", description="Update count quantity on inventory", help="If selected, the count quantity will be set as well as the book quantity. Otherwise, the quantity will be left as it is.", dataType=FlyDataType.YesNo, entityType="D", printName="Is Update Count Qty", fieldLength=1)
	isUpdateCountQty,
	//
	@FlyElement(columnName="IsUseAd", name="Use Ad", description="Whether or not this templates uses Ad's", help="This describe whether or not this Template will use Ad's", dataType=FlyDataType.YesNo, entityType="D", printName="Use Ad", fieldLength=1)
	isUseAd,
	//
	@FlyElement(columnName="IsUseASP", name="IsUseASP", dataType=FlyDataType.YesNo, entityType="D", printName="IsUseASP", fieldLength=1)
	isUseASP,
	//
	@FlyElement(columnName="IsUseBetaFunctions", name="使用Beta功能", description="Enable the use of Beta Functionality", help="The exact scope of Beta Functionality is listed in the release note.  It is usually not recommended to enable Beta functionality in production environments.", dataType=FlyDataType.YesNo, entityType="D", printName="使用Beta", fieldLength=1)
	isUseBetaFunctions,
	//
	@FlyElement(columnName="IsUser1Dim", name="User 1 Dimension", description="Include User 1 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User 1 Dimension", fieldLength=1)
	isUser1Dim,
	//
	@FlyElement(columnName="IsUser2Dim", name="User 2 Dimension", description="Include User 2 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User 2 Dimension", fieldLength=1)
	isUser2Dim,
	//
	@FlyElement(columnName="IsUser3Dim", name="User 3 Dimension", description="Include User 3 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User 3 Dimension", fieldLength=1)
	isUser3Dim,
	//
	@FlyElement(columnName="IsUser4Dim", name="User 4 Dimension", description="Include User 4 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User 4 Dimension", fieldLength=1)
	isUser4Dim,
	//
	@FlyElement(columnName="IsUserElement1Dim", name="User Element 1 Dimension", description="Include User Element 1 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User Element 1 Dimension", fieldLength=1)
	isUserElement1Dim,
	//
	@FlyElement(columnName="IsUserElement2Dim", name="User Element 2 Dimension", description="Include User Element 2 as a cube dimension", dataType=FlyDataType.YesNo, entityType="D", printName="User Element 2 Dimension", fieldLength=1)
	isUserElement2Dim,
	//
	@FlyElement(columnName="IsUserUpdateable", name="用户可更新的", description="The field can be updated by the user", help="The User Updateable checkbox indicate if the user can update  this field.", dataType=FlyDataType.YesNo, entityType="D", printName="用户可更新的", fieldLength=1)
	isUserUpdateable,
	//
	@FlyElement(columnName="IsUseUserOrgAccess", name="Use User Org Access", description="Use Org Access defined by user instead of Role Org Access", help="You can define the access to Organization either by Role or by User.  You would select this, if you have many organizations.", dataType=FlyDataType.YesNo, entityType="D", printName="Use User Org Access", fieldLength=1)
	isUseUserOrgAccess,
	//
	@FlyElement(columnName="IsValid", name="有效的", description="元素有效", help="The element passed the validation check", dataType=FlyDataType.YesNo, entityType="D", printName="有效的", fieldLength=1)
	isValid,
	//
	@FlyElement(columnName="IsValidateOnly", name="Only Validate Data", description="Validate the date and do not process", dataType=FlyDataType.NONE, entityType="D", printName="Validate Only", fieldLength=0)
	isValidateOnly,
	//
	@FlyElement(columnName="IsValueDisplayed", name="显示值", description="Displays Value column with the Display column", help="The Display Value checkbox indicates if the value column will display with the display column.", dataType=FlyDataType.YesNo, entityType="D", printName="显示值", fieldLength=1)
	isValueDisplayed,
	//
	@FlyElement(columnName="IsVanillaSystem", name="Vanilla System", description="The system was NOT compiled from Source - i.e. standard distribution", help="You may have customizations, like additional columns, tables, etc - but no code modifications which require compiling from source.", dataType=FlyDataType.List, entityType="D", printName="Vanilla System", fieldLength=1)
	isVanillaSystem,
	//
	@FlyElement(columnName="IsVarianceCalc", name="Calculate Variance (σ²)", description="Calculate Variance", help="The Variance (σ²) is the a measure of dispersion - used in combination with the Mean (μ)", dataType=FlyDataType.YesNo, entityType="D", printName="Variance", fieldLength=1)
	isVarianceCalc,
	//
	@FlyElement(columnName="IsVendor", name="供应商", description="Indicates if this Business Partner is a Vendor", help="The Vendor checkbox indicates if this Business Partner is a Vendor.  If it is selected, additional fields will display which further identify this vendor.", dataType=FlyDataType.YesNo, entityType="D", printName="供应商", fieldLength=1)
	isVendor,
	//
	@FlyElement(columnName="IsVerified", name="验证", description="The BOM configuration has been verified", help="The Verified check box indicates if the configuration of this product has been verified.  This is used for products that consist of a bill of materials", dataType=FlyDataType.YesNo, entityType="D", printName="验证", fieldLength=1)
	isVerified,
	//
	@FlyElement(columnName="IsView", name="视图", description="这是视图", help="This is a view rather than a table.  A view is always treated as read only in the system.", dataType=FlyDataType.YesNo, entityType="D", printName="视图", fieldLength=1)
	isView,
	//
	@FlyElement(columnName="IsWebCanUpdate", name="Web Can Update", description="Entry can be updated from the Web", dataType=FlyDataType.YesNo, entityType="D", printName="Web Can Update", fieldLength=1)
	isWebCanUpdate,
	//
	@FlyElement(columnName="IsWebStoreFeatured", name="Featured in Web Store", description="If selected, the product is displayed in the inital or any empy search", help="In the display of products in the Web Store, the product is displayed in the inital view or if no search criteria are entered. To be displayed, the product must be in the price list used.", dataType=FlyDataType.YesNo, entityType="D", printName="Featured", fieldLength=1)
	isWebStoreFeatured,
	//
	@FlyElement(columnName="IsWillingToCommit", name="Willing to commit", dataType=FlyDataType.YesNo, entityType="D", printName="Willing to commit", fieldLength=1)
	isWillingToCommit,
	//
	@FlyElement(columnName="IsWIP", name="Work In Progress", dataType=FlyDataType.NONE, entityType="D", printName="WIP", fieldLength=0)
	isWIP,
	//
	@FlyElement(columnName="IsWon", name="Won", description="The opportunity was won", dataType=FlyDataType.NONE, entityType="D", printName="Won", fieldLength=0)
	isWon,
	//
	@FlyElement(columnName="IsXYPosition", name="XY Position", description="The Function is XY position", help="This function positions for the next print operation", dataType=FlyDataType.YesNo, entityType="D", printName="XY Position", fieldLength=1)
	isXYPosition,
	//
	@FlyElement(columnName="ItemName", name="Print Item Name", dataType=FlyDataType.String, entityType="D", printName="Item Name", fieldLength=60)
	itemName,
	//
	@FlyElement(columnName="JasperProcess_ID", name="Jasper Process", description="The Jasper Process used by the printengine if any process defined", dataType=FlyDataType.Table, entityType="D", printName="Jasper Process", fieldLength=22)
	jasperProcessID,
	//
	@FlyElement(columnName="JasperProcessing", name="Jasper Process Now", dataType=FlyDataType.Button, entityType="D", printName="Jasper Process Now", fieldLength=1)
	jasperProcessing,
	//
	@FlyElement(columnName="JasperReport", name="Jasper Report", dataType=FlyDataType.String, entityType="D", printName="Jasper Report", fieldLength=255)
	jasperReport,
	//
	@FlyElement(columnName="JavaInfo", name="Java Info", description="Java Version Info", dataType=FlyDataType.String, entityType="D", printName="Java Info", fieldLength=255)
	javaInfo,
	//
	@FlyElement(columnName="Jnl_Line_Description", name="Journal Line Description", dataType=FlyDataType.NONE, entityType="D", printName="Journal Line Description", fieldLength=0)
	jnlLineDescription,
	//
	@FlyElement(columnName="JoinElement", name="Join元素", description="Semantics for multiple incoming Transitions", help="Semantics for multiple incoming Transitions for a Node/Activity. AND joins all concurrent threads - XOR requires one thread (no synchronization).", dataType=FlyDataType.List, entityType="D", printName="Join元素", fieldLength=1)
	joinElement,
	//
	@FlyElement(columnName="JournalDocumentNo", name="Journal Document No", description="Document number of the Journal", dataType=FlyDataType.String, entityType="D", printName="Journal Doc No", fieldLength=30)
	journalDocumentNo,
	//
	@FlyElement(columnName="JSPURL", name="jsp URL", description="Web URL of the jsp function", help="For the Web UI, define the URL to perform the function (usually a jsp). The URL also can be external to the system.", dataType=FlyDataType.URL, entityType="D", printName="jsp URL", fieldLength=120)
	jSPURL,
	//
	@FlyElement(columnName="K_Category_ID", name="知识种类", description="知识种类", help="Set up knowledge categories and values as a search aid. Examples are Release Version, Product Area, etc. Knowledge Category values act like keyworks.", dataType=FlyDataType.TableDirect, entityType="D", printName="种类", fieldLength=22)
	kCategoryID,
	//
	@FlyElement(columnName="K_CategoryValue_ID", name="分类值", description="分类值", help="The value of the category is a keyword", dataType=FlyDataType.TableDirect, entityType="D", printName="值", fieldLength=22)
	kCategoryValueID,
	//
	@FlyElement(columnName="K_Comment_ID", name="条目意见", description="知识条目意见", help="Comment regarding a knowledge entry", dataType=FlyDataType.ID, entityType="D", printName="意见", fieldLength=22)
	kCommentID,
	//
	@FlyElement(columnName="KeepLogDays", name="日志保存天数", description="Number of days to keep the log entries", help="Older Log entries may be deleted", dataType=FlyDataType.Integer, entityType="D", printName="日志保存天数", fieldLength=22)
	keepLogDays,
	//
	@FlyElement(columnName="K_Entry_ID", name="条目", description="知识条目", help="The searchable Knowledge Entry", dataType=FlyDataType.Search, entityType="D", printName="条目", fieldLength=22)
	kEntryID,
	//
	@FlyElement(columnName="K_EntryRelated_ID", name="相关条目", description="相关条目的条目", help="Related Knowlege Entry for this Knowledge Entry", dataType=FlyDataType.Table, entityType="D", printName="相关条目", fieldLength=22)
	kEntryRelatedID,
	//
	@FlyElement(columnName="KeyColumn", name="Key Column", description="Key Column for Table", dataType=FlyDataType.String, entityType="D", printName="Key Column", fieldLength=60)
	keyColumn,
	//
	@FlyElement(columnName="Keyword", name="关键字", description="情形对关键字没有感觉的", help="Case insensitive keyword for matching. If there are two words, both words must exist.", dataType=FlyDataType.String, entityType="D", printName="关键字", fieldLength=60)
	keyword,
	//
	@FlyElement(columnName="Keywords", name="关键字", description="List of Keywords - separated by space, comma or semicolon", help="List if individual keywords for search relevancy. The keywords are separated by space, comma or semicolon. ", dataType=FlyDataType.String, entityType="D", printName="关键字", fieldLength=255)
	keywords,
	//
	@FlyElement(columnName="K_INDEX_ID", name="Index", description="Text Search Index", help="Text search index keyword and excerpt across documents", dataType=FlyDataType.ID, entityType="D", printName="Index", fieldLength=10)
	kINDEXID,
	//
	@FlyElement(columnName="K_IndexLog_ID", name="Index Log", description="Text search log", dataType=FlyDataType.ID, entityType="D", printName="Log", fieldLength=10)
	kIndexLogID,
	//
	@FlyElement(columnName="K_IndexStop_ID", name="Index Stop", description="Keyword not to be indexed", help="Keyword not to be indexed, optional restricted to specific Document Type, Container or Request Type", dataType=FlyDataType.ID, entityType="D", printName="Index Stop", fieldLength=10)
	kIndexStopID,
	//
	@FlyElement(columnName="K_Source_ID", name="知识来源", description="知识条目的来源", help="The Source of a Knowlegde Entry is a pointer to the originating system. The Knowledge Entry has an additional entry (Description URL)  for more detailed info.", dataType=FlyDataType.ID, entityType="D", printName="知识来源", fieldLength=22)
	kSourceID,
	//
	@FlyElement(columnName="K_Synonym_ID", name="知识同义字", description="知识关键字同义字", help="Search Synonyms for Knowledge Keywords; Example: Product = Item", dataType=FlyDataType.ID, entityType="D", printName="知识同义字", fieldLength=22)
	kSynonymID,
	//
	@FlyElement(columnName="K_Topic_ID", name="知识主题", description="知识主题", help="主题或讨论线索", dataType=FlyDataType.ID, entityType="D", printName="主题", fieldLength=22)
	kTopicID,
	//
	@FlyElement(columnName="K_Type_ID", name="知识类型", description="知识类型", help="Area of knowlege - A Type has multiple Topics", dataType=FlyDataType.ID, entityType="D", printName="类型", fieldLength=22)
	kTypeID,
	//
	@FlyElement(columnName="LabelFormatType", name="标签格式类型", description="标签格式类型", dataType=FlyDataType.List, entityType="D", printName="标签格式类型", fieldLength=1)
	labelFormatType,
	//
	@FlyElement(columnName="LabelHeight", name="标签高度", description="标签的高度", help="标签的实际高度", dataType=FlyDataType.Integer, entityType="D", printName="标签高度", fieldLength=22)
	labelHeight,
	//
	@FlyElement(columnName="LabelWidth", name="标签宽度", description="标签的宽度", help="标签的实际宽度", dataType=FlyDataType.Integer, entityType="D", printName="标签宽度", fieldLength=22)
	labelWidth,
	//
	@FlyElement(columnName="LandedCostDistribution", name="Cost Distribution", description="Landed Cost Distribution", help="How landed costs are distributed to material receipts", dataType=FlyDataType.List, entityType="D", printName="Cost Distribution", fieldLength=1)
	landedCostDistribution,
	//
	@FlyElement(columnName="LanguageISO", name="ISO 语言编码", description="Lower-case two-letter ISO-3166 code - http:  www.ics.uci.edu pub ietf http related iso639.txt ", help="The ISO Language Code indicates the standard ISO code for a language in lower case.  Information can be found at http:  www.ics.uci.edu pub ietf http related iso639.txt ", dataType=FlyDataType.String, entityType="D", printName="ISO 语言编码", fieldLength=2)
	languageISO,
	//
	@FlyElement(columnName="LastBuildInfo", name="Last Build Info", dataType=FlyDataType.String, entityType="D", printName="Last Build Info", fieldLength=255)
	lastBuildInfo,
	//
	@FlyElement(columnName="LastContact", name="最近联系人", description="Date this individual was last contacted", help="The Last Contact indicates the date that this Business Partner Contact was last contacted.", dataType=FlyDataType.Date, entityType="D", printName="最近联系人", fieldLength=7)
	lastContact,
	//
	@FlyElement(columnName="LastDeleted", name="Last Deleted", dataType=FlyDataType.Integer, entityType="D", printName="Last Deleted", fieldLength=10)
	lastDeleted,
	//
	@FlyElement(columnName="LastLockTime", name="Last Lock Time", description="Last time at which the terminal was locked", dataType=FlyDataType.DateTime, entityType="D", printName="Last Lock Time", fieldLength=7)
	lastLockTime,
	//
	@FlyElement(columnName="LastMaintenanceDate", name="Last Maintenance", description="Last Maintenance Date", dataType=FlyDataType.DateTime, entityType="D", printName="Last Maintenance", fieldLength=7)
	lastMaintenanceDate,
	//
	@FlyElement(columnName="LastMaintenanceNote", name="Last Note", description="Last Maintenance Note", dataType=FlyDataType.String, entityType="D", printName="Last Note", fieldLength=60)
	lastMaintenanceNote,
	//
	@FlyElement(columnName="LastMaintenanceUnit", name="Last Unit", description="Last Maintenance Unit", dataType=FlyDataType.Integer, entityType="D", printName="Last Unit", fieldLength=10)
	lastMaintenanceUnit,
	//
	@FlyElement(columnName="LastMaintenanceUseUnit", name="Last Maintenance Use Unit", dataType=FlyDataType.Integer, entityType="D", printName="Last Maintenance Use Unit", fieldLength=22)
	lastMaintenanceUseUnit,
	//
	@FlyElement(columnName="LastMaintenenceDate", name="Last Maintenence Date", dataType=FlyDataType.Date, entityType="D", printName="Last Maintenence Date", fieldLength=29)
	lastMaintenenceDate,
	//
	@FlyElement(columnName="LastRecalculated", name="Last Recalculated", description="The time last recalculated.", dataType=FlyDataType.DateTime, entityType="D", printName="Last Recalculated", fieldLength=7)
	lastRecalculated,
	//
	@FlyElement(columnName="LastResult", name="最近结果", description="最后的联系人结果", help="The Last Result identifies the result of the last contact made.", dataType=FlyDataType.String, entityType="D", printName="最近结果", fieldLength=2000)
	lastResult,
	//
	@FlyElement(columnName="Last_Result", name="Last Result", description="Contains data on the last check result", help="If we ran into errors etc. you will find the details in here", dataType=FlyDataType.Text, entityType="D", printName="Last Result", fieldLength=2000)
	lastResult,
	//
	@FlyElement(columnName="LastRun", name="Last Run", dataType=FlyDataType.DateTime, entityType="D", printName="Last Run", fieldLength=10)
	lastRun,
	//
	@FlyElement(columnName="LastSynchronized", name="Last Synchronized", description="Date when last synchronized", dataType=FlyDataType.DateTime, entityType="D", printName="Last Synchronized", fieldLength=7)
	lastSynchronized,
	//
	@FlyElement(columnName="LDAPDomain", name="LDAP查询", description="Directory service query string", dataType=FlyDataType.String, entityType="D", printName="LDAP查询", fieldLength=255)
	lDAPDomain,
	//
	@FlyElement(columnName="LDAPHost", name="LDAP主机", description="Name or IP of the LDAP Server", help="Name or IP Address of the LDAP directory service server", dataType=FlyDataType.String, entityType="D", printName="LDAP主机", fieldLength=60)
	lDAPHost,
	//
	@FlyElement(columnName="LdapPort", name="Ldap Port", description="The port the server is listening", help="The default LDAP port is 389", dataType=FlyDataType.Integer, entityType="D", printName="Ldap Port", fieldLength=10)
	ldapPort,
	//
	@FlyElement(columnName="LDAPQuery", name="LDAP Query", dataType=FlyDataType.String, entityType="D", printName="LDAP Query", fieldLength=255)
	lDAPQuery,
	//
	@FlyElement(columnName="LDAPUser", name="通过LDAP认证", description="Authorize via LDAP (directory) services", help="The user is authorized via LDAP. If LDAP authorization cannot be obtained, access is refused - the password is ignored for local access.", dataType=FlyDataType.String, entityType="D", printName="LDAP认证", fieldLength=60)
	lDAPUser,
	//
	@FlyElement(columnName="LeadSource", name="Lead Source", description="The source of this lead/opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Lead Source", fieldLength=0)
	leadSource,
	//
	@FlyElement(columnName="LeadSourceDescription", name="Lead Source Description", description="Additional information on the source of this lead/opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Lead Source Description", fieldLength=0)
	leadSourceDescription,
	//
	@FlyElement(columnName="LeadStatus", name="Lead Status", description="The status of this lead/opportunity in the sales cycle", dataType=FlyDataType.NONE, entityType="D", printName="Lead Status", fieldLength=0)
	leadStatus,
	//
	@FlyElement(columnName="LeadStatusDescription", name="Lead Status Description", description="Additional information on the status of this lead/opportunity", dataType=FlyDataType.NONE, entityType="D", printName="Lead Status Description", fieldLength=0)
	leadStatusDescription,
	//
	@FlyElement(columnName="LeadTimeOffset", name="Lead Time Offset", description="Optional Lead Time offset before starting production", help="Optional Lead Time offset before starting production", dataType=FlyDataType.Integer, entityType="D", printName="Lead Time Offset", fieldLength=10)
	leadTimeOffset,
	//
	@FlyElement(columnName="Lease_BPartner_ID", name="Lessor", description="The Business Partner who rents or leases", dataType=FlyDataType.Search, entityType="D", printName="Lessor", fieldLength=10)
	leaseBPartnerID,
	//
	@FlyElement(columnName="LeaseTerminationDate", name="Lease Termination", description="Lease Termination Date", help="Last Date of Lease", dataType=FlyDataType.Date, entityType="D", printName="Lease Termination", fieldLength=7)
	leaseTerminationDate,
	//
	@FlyElement(columnName="Level_Max", name="库存上限", description="Maximum Inventory level for this product", help="Indicates the maximum quantity of this product to be stocked in inventory.", dataType=FlyDataType.Amount, entityType="D", printName="库存上限", fieldLength=22)
	levelMax,
	//
	@FlyElement(columnName="Level_Min", name="库存下限", description="Minimum Inventory level for this product", help="Indicates the minimum quantity of this product to be stocked in inventory.	", dataType=FlyDataType.Amount, entityType="D", printName="库存下限", fieldLength=22)
	levelMin,
	//
	@FlyElement(columnName="LevelNo", name="水平号", dataType=FlyDataType.Integer, entityType="D", printName="水平号", fieldLength=22)
	levelNo,
	//
	@FlyElement(columnName="LifeUseUnits", name="生活使用", description="Units of use until the asset is not usable anymore", help="Life use and the actual use may be used to calculate the depreciation", dataType=FlyDataType.Integer, entityType="D", printName="生活使用", fieldLength=22)
	lifeUseUnits,
	//
	@FlyElement(columnName="Limit", name="Duration Limit", description="Maximum Duration in Duration Unit", help="Maximum (critical) Duration for time management purposes (e.g. starting an escalation procedure, etc.) in Duration Units.", dataType=FlyDataType.Integer, entityType="D", printName="Limit", fieldLength=22)
	limit,
	//
	@FlyElement(columnName="Limit_AddAmt", name="限制价格额外费", description="Amount added to the converted copied price before multiplying", help="Indicates the amount to be added to the Limit price prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="限制价格额外费", fieldLength=22)
	limitAddAmt,
	//
	@FlyElement(columnName="Limit_Base", name="限制价格基础", description="Base price for calculation of the new price", help="Identifies the price to be used as the base for calculating a new price list.", dataType=FlyDataType.List, entityType="D", printName="限制价格基础", fieldLength=1)
	limitBase,
	//
	@FlyElement(columnName="Limit_Discount", name="限制价格折扣 %", description="Discount in percent to be subtracted from base, if negative it will be added to base price", help="Indicates the discount in percent to be subtracted from base, if negative it will be added to base price", dataType=FlyDataType.Number, entityType="D", printName="限制价格折扣 %", fieldLength=22)
	limitDiscount,
	//
	@FlyElement(columnName="Limit_Fixed", name="固定的限制价格", description="Fixed Limit Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="固定的限制", fieldLength=22)
	limitFixed,
	//
	@FlyElement(columnName="Limit_MaxAmt", name="限制价格最大差额", description="Maximum difference to original limit price; ignored if zero", help="Indicates the maximum margin for a product.  The margin is calculated by subtracting the original limit price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="限制价格最大差额", fieldLength=22)
	limitMaxAmt,
	//
	@FlyElement(columnName="Limit_MinAmt", name="限制价格最小差额", description="Minimum difference to original limit price; ignored if zero", help="Indicates the minimum margin for a product.  The margin is calculated by subtracting the original limit price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="限制价格最小差额", fieldLength=22)
	limitMinAmt,
	//
	@FlyElement(columnName="Limit_Rounding", name="限制价格圆整", description="最后的结果圆整", help="A drop down list box which indicates the rounding (if any) will apply to the final prices in this price list.", dataType=FlyDataType.List, entityType="D", printName="限制价格圆整", fieldLength=1)
	limitRounding,
	//
	@FlyElement(columnName="Line", name="明细号", description="Unique line for this document", help="Indicates the unique line for a document.  It will also control the display order of the lines within a document.", dataType=FlyDataType.Integer, entityType="D", printName="明细号", fieldLength=22)
	line,
	//
	@FlyElement(columnName="LineAlignmentType", name="线对准", description="线对准", help="For relative positioning, the line alignment", dataType=FlyDataType.List, entityType="D", printName="线对准", fieldLength=1)
	lineAlignmentType,
	//
	@FlyElement(columnName="LineDateWorkComplete", name="Line Work Complete", description="Date when line work is (planned to be) complete", dataType=FlyDataType.Date, entityType="D", printName="Line Work Complete", fieldLength=7)
	lineDateWorkComplete,
	//
	@FlyElement(columnName="LineDateWorkStart", name="Line Work Start", description="Date when line work is (planned to be) started", dataType=FlyDataType.Date, entityType="D", printName="Line Work Start", fieldLength=7)
	lineDateWorkStart,
	//
	@FlyElement(columnName="LineDeliveryDays", name="Line Delivery Days", dataType=FlyDataType.Integer, entityType="D", printName="Line Delivery Days", fieldLength=22)
	lineDeliveryDays,
	//
	@FlyElement(columnName="LineDescription", name="行描述", description="明细的描述", dataType=FlyDataType.String, entityType="D", printName="行描述", fieldLength=255)
	lineDescription,
	//
	@FlyElement(columnName="LineDiscount", name="明细折扣 %", description="明细折扣如一百分比", help="The Line Discount Percent indicates the discount for this line as a percentage.", dataType=FlyDataType.Number, entityType="D", printName="折扣 %", fieldLength=22)
	lineDiscount,
	//
	@FlyElement(columnName="LineDiscountAmt", name="明细折扣", description="明细折扣金额", help="Indicates the discount for this line as an amount.", dataType=FlyDataType.Amount, entityType="D", printName="折扣", fieldLength=22)
	lineDiscountAmt,
	//
	@FlyElement(columnName="LineDistance", name="行距离", description="在线之间的距离", dataType=FlyDataType.Integer, entityType="D", printName="距离", fieldLength=22)
	lineDistance,
	//
	@FlyElement(columnName="LineHelp", name="Line Help/Comment", dataType=FlyDataType.String, entityType="D", printName="Line Comment", fieldLength=2000)
	lineHelp,
	//
	@FlyElement(columnName="Line_ID", name="明细ID", description="Transaction line ID (internal)", help="内在的联编", dataType=FlyDataType.ID, entityType="D", printName="明细ID", fieldLength=22)
	lineID,
	//
	@FlyElement(columnName="LineLimitAmt", name="明细限制金额", dataType=FlyDataType.Amount, entityType="D", printName="限制金额", fieldLength=22)
	lineLimitAmt,
	//
	@FlyElement(columnName="LineListAmt", name="明细目录金额", dataType=FlyDataType.Amount, entityType="D", printName="列出金额", fieldLength=22)
	lineListAmt,
	//
	@FlyElement(columnName="LineMargin", name="Line Margin", description="Margin of the line - Planned Amount minus Costs", dataType=FlyDataType.Amount, entityType="D", printName="Line Margin", fieldLength=22)
	lineMargin,
	//
	@FlyElement(columnName="LineNetAmt", name="行净值", description="Line Net Amount (Quantity * Actual Price) without Freight and Charges", help="Indicates the line net amount based on the quantity and the actual price.  Any additional charges or freight are not included.", dataType=FlyDataType.Amount, entityType="D", printName="行净值", fieldLength=22)
	lineNetAmt,
	//
	@FlyElement(columnName="LineNo", name="Line", description="Line No", dataType=FlyDataType.Integer, entityType="D", printName="Line", fieldLength=10)
	lineNo,
	//
	@FlyElement(columnName="LineOverLimit", name="总共的差额 %", dataType=FlyDataType.Number, entityType="D", printName="差额 %", fieldLength=22)
	lineOverLimit,
	//
	@FlyElement(columnName="LineOverLimitAmt", name="总共的差额", dataType=FlyDataType.Amount, entityType="D", printName="差额", fieldLength=22)
	lineOverLimitAmt,
	//
	@FlyElement(columnName="Line_PrintColor_ID", name="线颜色", description="表线颜色", dataType=FlyDataType.Table, entityType="D", printName="线颜色", fieldLength=22)
	linePrintColorID,
	//
	@FlyElement(columnName="LineStroke", name="Line Stroke", description="Width of the Line Stroke", help="The width of the line stroke (line thickness) in Points.", dataType=FlyDataType.Number, entityType="D", printName="Line Stroke", fieldLength=22)
	lineStroke,
	//
	@FlyElement(columnName="LineStrokeType", name="Line Stroke Type", description="Type of the Line Stroke", help="Type of the line printed", dataType=FlyDataType.List, entityType="D", printName="Line Stroke Type", fieldLength=1)
	lineStrokeType,
	//
	@FlyElement(columnName="LineTotalAmt", name="Line Total", description="Total line amount incl. Tax", help="Total line amount", dataType=FlyDataType.Amount, entityType="D", printName="Line Total", fieldLength=22)
	lineTotalAmt,
	//
	@FlyElement(columnName="LineType", name="行类型", dataType=FlyDataType.List, entityType="D", printName="行类型", fieldLength=1)
	lineType,
	//
	@FlyElement(columnName="LineWidth", name="线宽度", description="线的宽度", dataType=FlyDataType.Integer, entityType="D", printName="线宽度", fieldLength=22)
	lineWidth,
	//
	@FlyElement(columnName="Link", name="Link", description="Contains URL to a target", help="A Link should contain info on how to get to more information", dataType=FlyDataType.String, entityType="D", printName="Link", fieldLength=255)
	link,
	//
	@FlyElement(columnName="Link_Order_ID", name="Linked Order", description="This field links a sales order to the purchase order that is generated from it.", dataType=FlyDataType.Table, entityType="D", printName="Linked Order", fieldLength=22)
	linkOrderID,
	//
	@FlyElement(columnName="Link_OrderLine_ID", name="Linked Order Line", description="This field links a sales order line to the purchase order line that is generated from it.", dataType=FlyDataType.Table, entityType="D", printName="Linked Order Line", fieldLength=22)
	linkOrderLineID,
	//
	@FlyElement(columnName="LinkURL", name="LinkURL", description="Contains URL to a target", help="A Link should contain info on how to get to more information", dataType=FlyDataType.String, entityType="D", printName="LinkURL", fieldLength=120)
	linkURL,
	//
	@FlyElement(columnName="List_AddAmt", name="列表价格额外费", description="列表价格额外费", help="The List Price Surcharge Amount indicates the amount to be added to the price prior to multiplication.", dataType=FlyDataType.Amount, entityType="D", printName="列表价格额外费", fieldLength=22)
	listAddAmt,
	//
	@FlyElement(columnName="List_Base", name="列表价格基础", description="Price used as the basis for price list calculations", help="The List Price Base indicates the price to use as the basis for the calculation of a new price list.", dataType=FlyDataType.List, entityType="D", printName="列表价格基础", fieldLength=1)
	listBase,
	//
	@FlyElement(columnName="ListDetails", name="列出明细", description="列出文件明细", help="The List Details checkbox indicates that the details for each document line will be displayed.", dataType=FlyDataType.YesNo, entityType="D", printName="列出明细", fieldLength=1)
	listDetails,
	//
	@FlyElement(columnName="List_Discount", name="列表价格折扣 %", description="Discount from list price as a percentage", help="The List Price Discount Percentage indicates the percentage discount which will be subtracted from the base price.  A negative amount indicates the percentage which will be added to the base price.", dataType=FlyDataType.Number, entityType="D", printName="列表价格折扣 %", fieldLength=22)
	listDiscount,
	//
	@FlyElement(columnName="List_Fixed", name="固定的列表价格", description="Fixes List Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="固定的目录", fieldLength=22)
	listFixed,
	//
	@FlyElement(columnName="List_MaxAmt", name="列表价格最大差额", description="产品的最大的差额", help="The List Price Max Margin indicates the maximum margin for a product.  The margin is calculated by subtracting the original list price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="列表价格最大差额", fieldLength=22)
	listMaxAmt,
	//
	@FlyElement(columnName="List_MinAmt", name="列表价格最小差额", description="产品最小量差额", help="The List Price Min Margin indicates the minimum margin for a product.  The margin is calculated by subtracting the original list price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="列表价格最小差额", fieldLength=22)
	listMinAmt,
	//
	@FlyElement(columnName="List_Rounding", name="列表价格圆整", description="Rounding rule for final list price", help="The List Price Rounding indicates how the final list price will be rounded.", dataType=FlyDataType.List, entityType="D", printName="列表价格圆整", fieldLength=1)
	listRounding,
	//
	@FlyElement(columnName="ListSources", name="列出来源", description="列出报表行来源", help="List the Source Accounts for Summary Accounts selected", dataType=FlyDataType.YesNo, entityType="D", printName="列出来源", fieldLength=1)
	listSources,
	//
	@FlyElement(columnName="ListTrx", name="列出交易", description="列出报表交易", help="List the transactions of the report source lines", dataType=FlyDataType.YesNo, entityType="D", printName="列出交易", fieldLength=1)
	listTrx,
	//
	@FlyElement(columnName="LoadSeq", name="序列", dataType=FlyDataType.Integer, entityType="D", printName="序列", fieldLength=22)
	loadSeq,
	//
	@FlyElement(columnName="Local_Host", name="Local Host", description="Local Host Info", dataType=FlyDataType.String, entityType="D", printName="Local Host", fieldLength=120)
	localHost,
	//
	@FlyElement(columnName="LocationComment", name="位置意见", description="Additional comments or remarks concerning the location", dataType=FlyDataType.String, entityType="D", printName="位置意见", fieldLength=255)
	locationComment,
	//
	@FlyElement(columnName="LocatorValue", name="货位值", dataType=FlyDataType.String, entityType="D", printName="货位值", fieldLength=40)
	locatorValue,
	//
	@FlyElement(columnName="Locked", name="Locked", description="Whether the terminal is locked", dataType=FlyDataType.YesNo, entityType="D", printName="Locked", fieldLength=1)
	locked,
	//
	@FlyElement(columnName="LockTime", name="Lock Time", description="Time in minutes the terminal should be kept in a locked state.", dataType=FlyDataType.Integer, entityType="D", printName="Lock Time", fieldLength=10)
	lockTime,
	//
	@FlyElement(columnName="Locode", name="本地码", description="Location code - UN LOCODE ", help="UN Locode is a combination of a 2-character country code and a 3-character location code, e.g. BEANR is known as the city of Antwerp (ANR) which is located in Belgium (BE).	<p>See: http:  www.unece.org cefact locode service main.htm", dataType=FlyDataType.String, entityType="D", printName="本地码", fieldLength=10)
	locode,
	//
	@FlyElement(columnName="LoggerName", name="Logger", description="Logger Name", dataType=FlyDataType.String, entityType="D", printName="Logger", fieldLength=60)
	loggerName,
	//
	@FlyElement(columnName="LoginDate", name="Login date", dataType=FlyDataType.Date, entityType="D", printName="Login date", fieldLength=10)
	loginDate,
	//
	@FlyElement(columnName="Logo_ID", name="Logo", dataType=FlyDataType.Image, entityType="D", printName="Logo", fieldLength=10)
	logoID,
	//
	@FlyElement(columnName="LogoReport_ID", name="Logo Report", dataType=FlyDataType.Image, entityType="D", printName="Logo Report", fieldLength=10)
	logoReportID,
	//
	@FlyElement(columnName="LogoWeb_ID", name="Logo Web", dataType=FlyDataType.Image, entityType="D", printName="Logo Web", fieldLength=10)
	logoWebID,
	//
	@FlyElement(columnName="LogType", name="Log Type", description="Web Log Type", dataType=FlyDataType.List, entityType="D", printName="Log Type", fieldLength=1)
	logType,
	//
	@FlyElement(columnName="LookupClassName", name="Lookup ClassName", description="The class name of the postcode lookup plugin", help="Enter the class name of the post code lookup plugin for your postcode web service provider", dataType=FlyDataType.String, entityType="D", printName="Lookup ClassName", fieldLength=255)
	lookupClassName,
	//
	@FlyElement(columnName="LookupClientID", name="Lookup Client ID", description="The ClientID or Login submitted to the Lookup URL", help="Enter the ClientID or Login for your account provided by the post code web service provider", dataType=FlyDataType.String, entityType="D", printName="Lookup Client ID", fieldLength=50)
	lookupClientID,
	//
	@FlyElement(columnName="LookupPassword", name="Lookup Password", description="The password submitted to the Lookup URL", help="Enter the password for your account provided by the post code web service provider", dataType=FlyDataType.String, entityType="D", printName="Lookup Password", fieldLength=50)
	lookupPassword,
	//
	@FlyElement(columnName="LookupUrl", name="Lookup URL", description="The URL of the web service that the plugin connects to in order to retrieve postcode data", help="Enter the URL of the web service that the plugin connects to in order to retrieve postcode data", dataType=FlyDataType.String, entityType="D", printName="Lookup URL", fieldLength=100)
	lookupUrl,
	//
	@FlyElement(columnName="Lot", name="批", description="批号", help="The Lot Number indicates the specific lot that a product was part of.", dataType=FlyDataType.String, entityType="D", printName="批", fieldLength=40)
	lot,
	//
	@FlyElement(columnName="LotCharEOverwrite", name="Lot Char End Overwrite", description="Lot/Batch End Indicator overwrite - default »", help="If not defined, the default character » is used", dataType=FlyDataType.String, entityType="D", printName="Lot Char End", fieldLength=1)
	lotCharEOverwrite,
	//
	@FlyElement(columnName="LotCharSOverwrite", name="Lot Char Start Overwrite", description="Lot/Batch Start Indicator overwrite - default «", help="If not defined, the default character « is used", dataType=FlyDataType.String, entityType="D", printName="Lot Char Start", fieldLength=1)
	lotCharSOverwrite,
	//
	@FlyElement(columnName="Macro", name="Macro", description="Macro", dataType=FlyDataType.Text, entityType="D", printName="Macro", fieldLength=2000)
	macro,
	//
	@FlyElement(columnName="MailHeader", name="邮寄抬头", dataType=FlyDataType.String, entityType="D", printName="邮寄抬头", fieldLength=2000)
	mailHeader,
	//
	@FlyElement(columnName="MailMsgType", name="Message Type", description="Mail Message Type", dataType=FlyDataType.List, entityType="D", printName="Message Type", fieldLength=2)
	mailMsgType,
	//
	@FlyElement(columnName="MailText", name="邮寄本文", description="邮件信息用的本文", help="The Mail Text indicates the text used for mail messages.", dataType=FlyDataType.Text, entityType="D", printName="邮寄本文", fieldLength=2000)
	mailText,
	//
	@FlyElement(columnName="MailText2", name="Mail Text 2", description="Optional second text part used for Mail message", help="The Mail Text indicates the text used for mail messages.", dataType=FlyDataType.Text, entityType="D", printName="Mail Text 2", fieldLength=2000)
	mailText2,
	//
	@FlyElement(columnName="MailText3", name="Mail Text 3", description="Optional third text part used for Mail message", help="The Mail Text indicates the text used for mail messages.", dataType=FlyDataType.Text, entityType="D", printName="Mail Text 3", fieldLength=2000)
	mailText3,
	//
	@FlyElement(columnName="MaintenanceMode", name="Maintenance Mode", description="Language Maintenance Mode", dataType=FlyDataType.NONE, entityType="D", printName="Maintenance Mode", fieldLength=0)
	maintenanceMode,
	//
	@FlyElement(columnName="MandatoryLogic", name="Mandatory Logic", dataType=FlyDataType.Text, entityType="D", printName="Mandatory Logic", fieldLength=2000)
	mandatoryLogic,
	//
	@FlyElement(columnName="MandatoryType", name="Mandatory Type", description="The specification of a Product Attribute Instance is mandatory", dataType=FlyDataType.List, entityType="D", printName="Mandatory Type", fieldLength=1)
	mandatoryType,
	//
	@FlyElement(columnName="ManualActual", name="实际手工", description="手工输入实际值", help="The Manual Active identifies a manually entered actual measurement value.", dataType=FlyDataType.Number, entityType="D", printName="实际手工", fieldLength=22)
	manualActual,
	//
	@FlyElement(columnName="ManualNote", name=" 注解", description="人工输入的注解", help="The Note allows for entry for additional information regarding a manual entry.", dataType=FlyDataType.Text, entityType="D", printName=" 注解", fieldLength=2000)
	manualNote,
	//
	@FlyElement(columnName="ManufacturedYear", name="Manufactured Year", dataType=FlyDataType.NONE, entityType="D", printName="Manufactured Year", fieldLength=0)
	manufacturedYear,
	//
	@FlyElement(columnName="Manufacturer", name="制造商", dataType=FlyDataType.String, entityType="D", printName="制造商", fieldLength=30)
	manufacturer,
	//
	@FlyElement(columnName="Manufacturer_ID", name="Manufacturer", dataType=FlyDataType.NONE, entityType="D", printName="Manufacturer", fieldLength=0)
	manufacturerID,
	//
	@FlyElement(columnName="Margin", name="差额 %", description="Margin for a product as a percentage", help="The Margin indicates the margin for this product as a percentage of the limit price and selling price.", dataType=FlyDataType.Number, entityType="D", printName="差额 %", fieldLength=22)
	margin,
	//
	@FlyElement(columnName="MarginAmt", name="Margin Amount", description="Difference between actual and limit price multiplied by the quantity", help="The margin amount is calculated as the difference between actual and limit price multiplied by the quantity", dataType=FlyDataType.Amount, entityType="D", printName="Margin Amt", fieldLength=22)
	marginAmt,
	//
	@FlyElement(columnName="MarginBottom", name="底部边距", description="Bottom Space in 1 72 inch", help="Space on bottom of a page in 1 72 inch", dataType=FlyDataType.Integer, entityType="D", printName="底部", fieldLength=22)
	marginBottom,
	//
	@FlyElement(columnName="MarginLeft", name="左边边距", description="Left Space in 1 72 inch", help="Space on left side of a page in 1 72 inch", dataType=FlyDataType.Integer, entityType="D", printName="离开", fieldLength=22)
	marginLeft,
	//
	@FlyElement(columnName="MarginRight", name="右边距", description="Right Space in 1 72 inch", help="Space on right side of a page in 1 72 inch", dataType=FlyDataType.Integer, entityType="D", printName="右", fieldLength=22)
	marginRight,
	//
	@FlyElement(columnName="MarginTop", name="上边距", description="Top Space in 1 72 inch", help="Space on top of a page in 1 72 inch", dataType=FlyDataType.Integer, entityType="D", printName="顶端", fieldLength=22)
	marginTop,
	//
	@FlyElement(columnName="Mark1Percent", name="Mark 1 Percent", description="Percentage up to this color is used", help="Example 50 - i.e. below 50% this color is used", dataType=FlyDataType.Integer, entityType="D", printName="Mark 1 Percent", fieldLength=10)
	mark1Percent,
	//
	@FlyElement(columnName="Mark2Percent", name="Mark 2 Percent", description="Percentage up to this color is used", help="Example 80 - e.g., if Mark 1 is 50 - this color is used between 50% and 80%", dataType=FlyDataType.Integer, entityType="D", printName="Mark 2 Percent", fieldLength=10)
	mark2Percent,
	//
	@FlyElement(columnName="Mark3Percent", name="Mark 3 Percent", description="Percentage up to this color is used", help="Example 100 - e.g., if Mark 2 is 80 - this color is used between 80% and 100%", dataType=FlyDataType.Integer, entityType="D", printName="Mark 3 Percent", fieldLength=10)
	mark3Percent,
	//
	@FlyElement(columnName="Mark4Percent", name="Mark 4 Percent", description="Percentage up to this color is used", help="Example 9999 - e.g., if Mark 3 is 100 - this color is used above 100%", dataType=FlyDataType.Integer, entityType="D", printName="Mark 4 Percent", fieldLength=10)
	mark4Percent,
	//
	@FlyElement(columnName="MatchCode", name="Match Code", description="String identifying related accounting facts", dataType=FlyDataType.NONE, entityType="D", printName="Match Code", fieldLength=0)
	matchCode,
	//
	@FlyElement(columnName="MatchRequirement", name="Match Requirement", description="Matching Requirement for Invoice", dataType=FlyDataType.NONE, entityType="D", printName="Match", fieldLength=0)
	matchRequirement,
	//
	@FlyElement(columnName="MatchStatement", name="Match Statement", dataType=FlyDataType.Button, entityType="D", printName="Match Statement", fieldLength=1)
	matchStatement,
	//
	@FlyElement(columnName="M_Attribute_ID", name="属性", description="产品属性", help="Product Attribute like Color, Size", dataType=FlyDataType.TableDirect, entityType="D", printName="属性", fieldLength=22)
	mAttributeID,
	//
	@FlyElement(columnName="M_AttributeSearch_ID", name="属性搜寻", description="通常的搜寻属性 ", help="Attributes are specific to a Product Attribute Set (e.g. Size for T-Shirts: S,M,L). If you have multiple attributes and want to search under a common sttribute, you define a search sttribute. Example: have one Size search attribute combining the values of all different sizes (Size for Dress Shirt  XL,L,M,S,XS). The Attribute Search allows you to have all values available for selection.  This eases the maintenance of the individual product attribute.", dataType=FlyDataType.ID, entityType="D", printName="属性搜寻", fieldLength=22)
	mAttributeSearchID,
	//
	@FlyElement(columnName="M_AttributeSetExclude_ID", name="Exclude Attribute Set", description="Exclude the ability to enter Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude Attribute Set", fieldLength=10)
	mAttributeSetExcludeID,
	//
	@FlyElement(columnName="M_AttributeSet_ID", name="属性组合", description="产品属性组合", help="Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking.", dataType=FlyDataType.TableDirect, entityType="D", printName="属性组合", fieldLength=22)
	mAttributeSetID,
	//
	@FlyElement(columnName="M_AttributeSetInstance_ID", name="属性组合实例", description="Product Attribute Set Instance", help="The values of the actual Product Attributes", dataType=FlyDataType.ProductAttribute, entityType="D", printName="属性组合实例", fieldLength=22)
	mAttributeSetInstanceID,
	//
	@FlyElement(columnName="M_AttributeSetInstanceTo_ID", name="Attribute Set Instance To", description="Target Product Attribute Set Instance", dataType=FlyDataType.ProductAttribute, entityType="D", printName="Attribute Set Instance To", fieldLength=10)
	mAttributeSetInstanceToID,
	//
	@FlyElement(columnName="M_AttributeValue_ID", name="属性值", description="产品属性值", help="Individual value of a product attribute (e.g. green, large, ..)", dataType=FlyDataType.ID, entityType="D", printName="属性值", fieldLength=22)
	mAttributeValueID,
	//
	@FlyElement(columnName="MaxAmt", name="最大金额", description="Maximum Amount in invoice currency", help="The Maximum Amount indicates the maximum amount in invoice currency.", dataType=FlyDataType.Amount, entityType="D", printName="最大金额", fieldLength=22)
	maxAmt,
	//
	@FlyElement(columnName="MaxClick", name="Max Click Count", description="Maximum Click Count until banner is deactivated", help="A banner has a maximum number of clicks after which it will get deactivated", dataType=FlyDataType.Integer, entityType="D", printName="Max Click Count", fieldLength=10)
	maxClick,
	//
	@FlyElement(columnName="MaxHeight", name="最大高度", description="Maximum Height in 1 72 if an inch - 0 = no restriction", help="Maximum height of the element in 1 72 of an inch (point). If zero (0), there is no height restriction.", dataType=FlyDataType.Integer, entityType="D", printName="最大高度", fieldLength=22)
	maxHeight,
	//
	@FlyElement(columnName="MaxImpression", name="Max Impression Count", description="Maximum Impression Count until banner is deactivated", help="A banner has a maximum number of impressions after which it will get deactivated", dataType=FlyDataType.Integer, entityType="D", printName="Max Impression Count", fieldLength=10)
	maxImpression,
	//
	@FlyElement(columnName="MaxInvWriteOffAmt", name="每发票最大销帐金额", description="Maximum invoice amount to be written off in invoice currency", dataType=FlyDataType.NONE, entityType="D", printName="每发票最大销帐金额", fieldLength=0)
	maxInvWriteOffAmt,
	//
	@FlyElement(columnName="MaxLength", name="Maximum Length", description="Maximum Length of Data", dataType=FlyDataType.NONE, entityType="D", printName="Maximum Length", fieldLength=0)
	maxLength,
	//
	@FlyElement(columnName="MaxQueryRecords", name="Max Query Records", description="If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records", help="Enter the number of records a user will be able to query to avoid unnecessary system load.  If 0, no restrictions are imposed.", dataType=FlyDataType.Integer, entityType="D", printName="Max Query Records", fieldLength=10)
	maxQueryRecords,
	//
	@FlyElement(columnName="MaxWidth", name="最大宽度", description="Maximum Width in 1 72 if an inch - 0 = no restriction", help="Maximum width of the element in 1 72 of an inch (point). If zero (0), there is no width restriction.", dataType=FlyDataType.Integer, entityType="D", printName="最大宽度", fieldLength=22)
	maxWidth,
	//
	@FlyElement(columnName="M_BOMAlternative_ID", name="Alternative Group", description="Product BOM Alternative Group", help="Alternative groups allow you to group Bill of Material components, which are exclusive (i.e. only one is valid). Examples different engine sizes.", dataType=FlyDataType.ID, entityType="D", printName="Alternative Group", fieldLength=10)
	mBOMAlternativeID,
	//
	@FlyElement(columnName="M_BOM_ID", name="BOM", description="Bill of Material", help="The composition of the Product", dataType=FlyDataType.ID, entityType="D", printName="BOM", fieldLength=10)
	mBOMID,
	//
	@FlyElement(columnName="M_BOMProduct_ID", name="BOM Component", description="Bill of Material Component (Product)", help="The Bill of Material Component determines what products, services and outside processing is included in producing the Product. It references the operation and determines it's sequence.", dataType=FlyDataType.ID, entityType="D", printName="BOM Component", fieldLength=10)
	mBOMProductID,
	//
	@FlyElement(columnName="M_BP_Price_ID", name="Business Partner Price", dataType=FlyDataType.ID, entityType="D", printName="Business Partner Price", fieldLength=22)
	mBPPriceID,
	//
	@FlyElement(columnName="M_ChangeNotice_ID", name="Change Notice", description="Bill of Materials (Engineering) Change Notice (Version)", dataType=FlyDataType.TableDirect, entityType="D", printName="Change Notice", fieldLength=10)
	mChangeNoticeID,
	//
	@FlyElement(columnName="M_ChangeRequest_ID", name="Change Request", description="BOM (Engineering) Change Request", help="Change requests for a Bill of Materials. They can be automatically created from Requests, if enabled in the Request Type and the Request Group refers to a Bill of Materials", dataType=FlyDataType.ID, entityType="D", printName="Change Request", fieldLength=10)
	mChangeRequestID,
	//
	@FlyElement(columnName="M_Classification_Parent_ID", name="Product Classification Parent", dataType=FlyDataType.NONE, entityType="D", printName="Product Classification Parent", fieldLength=0)
	mClassificationParentID,
	//
	@FlyElement(columnName="M_CostDetail_ID", name="Cost Detail", description="Cost Detail Information", dataType=FlyDataType.ID, entityType="D", printName="Cost Detail", fieldLength=10)
	mCostDetailID,
	//
	@FlyElement(columnName="M_CostElement_ID", name="Cost Element", description="Product Cost Element", dataType=FlyDataType.TableDirect, entityType="D", printName="Cost Element", fieldLength=10)
	mCostElementID,
	//
	@FlyElement(columnName="M_CostQueue_ID", name="Cost Queue", description="FiFo/LiFo Cost Queue", help="Note that the cost queue may not be the same as the physical movement cost queue due to differences in costing level and warehouse priority.", dataType=FlyDataType.ID, entityType="D", printName="Cost Queue", fieldLength=10)
	mCostQueueID,
	//
	@FlyElement(columnName="M_CostType_ID", name="成本类型", description="成本的类型", dataType=FlyDataType.ID, entityType="D", printName="成本类型", fieldLength=22)
	mCostTypeID,
	//
	@FlyElement(columnName="M_DemandDetail_ID", name="Demand Detail", description="Material Demand Line Source Detail", help="Source Link for Material Demand Lines", dataType=FlyDataType.ID, entityType="D", printName="Demand Detail", fieldLength=22)
	mDemandDetailID,
	//
	@FlyElement(columnName="M_Demand_ID", name="Demand", description="Material Demand", help="Material Demand can be based on Forecast, Requisitions, Open Orders", dataType=FlyDataType.TableDirect, entityType="D", printName="Demand", fieldLength=22)
	mDemandID,
	//
	@FlyElement(columnName="M_DemandLine_ID", name="Demand Line", description="Material Demand Line", help="Demand for a product in a period", dataType=FlyDataType.ID, entityType="D", printName="Demand Line", fieldLength=22)
	mDemandLineID,
	//
	@FlyElement(columnName="M_DiscountSchemaBreak_ID", name="打折模式休息", description="批发折扣休息", help="Trade discount based on breaks (steps)", dataType=FlyDataType.ID, entityType="D", printName="打折模式休息", fieldLength=22)
	mDiscountSchemaBreakID,
	//
	@FlyElement(columnName="M_DiscountSchema_ID", name="打折模式", description="Schema to calculate the trade discount percentage", help="After calculation of the (standard) price, the trade discount percentage is calculated and applied resulting in the final price.", dataType=FlyDataType.Table, entityType="D", printName="打折模式", fieldLength=22)
	mDiscountSchemaID,
	//
	@FlyElement(columnName="M_DiscountSchemaLine_ID", name="打折价格列表", description="Line of the pricelist trade discount schema", help="For the Pricelist Discount Type, you enter how the list, standard and limit price is calculated.", dataType=FlyDataType.ID, entityType="D", printName="打折价格列表", fieldLength=22)
	mDiscountSchemaLineID,
	//
	@FlyElement(columnName="M_DistributionList_ID", name="Distribution List", description="Distribution Lists allow to distribute products to a selected list of partners", help="Distribution list contain business partners and a distribution quantity or ratio for creating Orders", dataType=FlyDataType.TableDirect, entityType="D", printName="Distribution List", fieldLength=22)
	mDistributionListID,
	//
	@FlyElement(columnName="M_DistributionListLine_ID", name="Distribution List Line", description="Distribution List Line with Business Partner and Quantity/Percentage", help="The distribution can be based on Ratio, fixed quantity or both.	If the ratio and quantity is not 0, the quantity is calculated based on the ratio, but with the Quantity as a minimum.", dataType=FlyDataType.ID, entityType="D", printName="Distribution List Line", fieldLength=22)
	mDistributionListLineID,
	//
	@FlyElement(columnName="M_DistributionRun_ID", name="Distribution Run", description="Distribution Run create Orders to distribute products to a selected list of partners", help="Distribution Run defines how Orders are created based on Distribution Lists", dataType=FlyDataType.ID, entityType="D", printName="Distribution Run", fieldLength=22)
	mDistributionRunID,
	//
	@FlyElement(columnName="M_DistributionRunLine_ID", name="Distribution Run Line", description="Distribution Run Lines define Distribution List, the Product and Quantiries", help="The order amount is based on the greater of the minimums of the product or distribution list and the quantity based on the ratio.", dataType=FlyDataType.ID, entityType="D", printName="Distribution Run Line", fieldLength=22)
	mDistributionRunLineID,
	//
	@FlyElement(columnName="MeasureActual", name="实际度量", description="Actual value that has been measured.", help="The Measure Actual indicates the actual measured value. The measured values are used in determining if a performance goal has been met", dataType=FlyDataType.Number, entityType="D", printName="实际度量", fieldLength=22)
	measureActual,
	//
	@FlyElement(columnName="MeasureDataType", name="Measure Data Type", description="Type of data - Status or in Time", help="Status represents values valid at a certain time (e.g. Open Invoices) - No history is maintained.<br>	Time represents a values at a given time (e.g. Invoice Amount on 1/1) - History is maintained", dataType=FlyDataType.List, entityType="D", printName="Data Type", fieldLength=1)
	measureDataType,
	//
	@FlyElement(columnName="MeasureDisplay", name="Measure Display", description="Measure Scope initially displayed", dataType=FlyDataType.List, entityType="D", printName="Measure Display", fieldLength=1)
	measureDisplay,
	//
	@FlyElement(columnName="MeasureRequestCode", name="Measure Request Code", description="String for  taking measurement from Device Electronic Scales", dataType=FlyDataType.String, entityType="D", printName="Measure Request Code", fieldLength=20)
	measureRequestCode,
	//
	@FlyElement(columnName="MeasureScope", name="Measure Scope", description="Performance Measure Scope", help="The scope of the goal can be broken down for initial display. 	Example: Scope is Year, Display is Month - the goal is entered as a yearly number, the display divides the goal by 12", dataType=FlyDataType.List, entityType="D", printName="Measure Scope", fieldLength=1)
	measureScope,
	//
	@FlyElement(columnName="MeasureTarget", name="度量目标", description="度量目标值", help="The Measure Target indicates the target or goal for this measure.  It is used as in comparing against the actual measures", dataType=FlyDataType.Number, entityType="D", printName="度量目标", fieldLength=22)
	measureTarget,
	//
	@FlyElement(columnName="MeasureType", name="度量类型", description="Determines how the actual performance is derived", help="The Measure Type indicates how the actual measure is determined.  For example, one measure may be manual while another is calculated.", dataType=FlyDataType.List, entityType="D", printName="度量类型", fieldLength=1)
	measureType,
	//
	@FlyElement(columnName="MediaSize", name="Media Size", description="Java Media Size", help="The Java Media Size. Example: 'MediaSize.ISO.A4' (the package javax.print.attribute.standard is assumed). If you define your own media size, use the fully qualified name.	If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.String, entityType="D", printName="Media Size", fieldLength=40)
	mediaSize,
	//
	@FlyElement(columnName="MediaType", name="Media Type", description="Defines the media type for the browser", help="The browser and the media server need info on the type of content", dataType=FlyDataType.List, entityType="D", printName="Media Type", fieldLength=3)
	mediaType,
	//
	@FlyElement(columnName="M_EDI_ID", name="EDI 交易", dataType=FlyDataType.ID, entityType="D", printName="EDI 交易", fieldLength=22)
	mEDIID,
	//
	@FlyElement(columnName="M_EDI_Info_ID", name="EDI 日志", dataType=FlyDataType.ID, entityType="D", printName="EDI 日志", fieldLength=22)
	mEDIInfoID,
	//
	@FlyElement(columnName="Memo", name="备忘录", description="备忘录文本", dataType=FlyDataType.String, entityType="D", printName="备忘录", fieldLength=255)
	memo,
	//
	@FlyElement(columnName="MenuLink", name="Menu Link", dataType=FlyDataType.String, entityType="D", printName="Menu Link", fieldLength=510)
	menuLink,
	//
	@FlyElement(columnName="Message", name="Message", description="EMail Message", help="Message of the EMail", dataType=FlyDataType.Text, entityType="D", printName="Message", fieldLength=2000)
	message,
	//
	@FlyElement(columnName="Message2", name="Message 2", description="Optional second part of the EMail Message", help="Message of the EMail", dataType=FlyDataType.Text, entityType="D", printName="Message 2", fieldLength=2000)
	message2,
	//
	@FlyElement(columnName="Message3", name="Message 3", description="Optional third part of the EMail Message", help="Message of the EMail", dataType=FlyDataType.Text, entityType="D", printName="Message 3", fieldLength=2000)
	message3,
	//
	@FlyElement(columnName="MessageID", name="Message ID", description="发电子邮件给信息ID", help="SMTP Message ID for tracking purposes", dataType=FlyDataType.String, entityType="D", printName="信息ID", fieldLength=120)
	messageID,
	//
	@FlyElement(columnName="Meta_Author", name="Meta Author", description="Author of the content", help="Author of the content for the Containers Meta Data", dataType=FlyDataType.String, entityType="D", printName="Meta Author", fieldLength=2000)
	metaAuthor,
	//
	@FlyElement(columnName="Meta_Content", name="Meta Content Type", description="Defines the type of content i.e. 'text/html; charset=UTF-8'", help="With this tag you can overwrite the type of content and how search engines will interpret it. You should keep in mind that this will not influence how the Server and Client interpret the content.", dataType=FlyDataType.String, entityType="D", printName="Meta Content Type", fieldLength=2000)
	metaContent,
	//
	@FlyElement(columnName="Meta_Copyright", name="Meta Copyright", description="Contains Copyright information for the content", help="This Tag contains detailed information about the content's copyright situation, how holds it for which timeframe etc.", dataType=FlyDataType.String, entityType="D", printName="Meta Copyright", fieldLength=2000)
	metaCopyright,
	//
	@FlyElement(columnName="Meta_Description", name="Meta Description", description="Meta info describing the contents of the page", help="The Meta Description tag should contain a short description on the page content", dataType=FlyDataType.Text, entityType="D", printName="Meta Description", fieldLength=2000)
	metaDescription,
	//
	@FlyElement(columnName="Meta_Keywords", name="Meta Keywords", description="Contains the keywords for the content", help="Contains keyword info on the main search words this content is relevant to", dataType=FlyDataType.Text, entityType="D", printName="Meta Keywords", fieldLength=2000)
	metaKeywords,
	//
	@FlyElement(columnName="Meta_Language", name="Meta Language", description="Language HTML Meta Tag", dataType=FlyDataType.String, entityType="D", printName="Meta Language", fieldLength=2)
	metaLanguage,
	//
	@FlyElement(columnName="Meta_Publisher", name="Meta Publisher", description="Meta Publisher defines the publisher of the content", help="As author and publisher must not be the same person this tag saves the responsible publisher for the content", dataType=FlyDataType.String, entityType="D", printName="Meta Publisher", fieldLength=2000)
	metaPublisher,
	//
	@FlyElement(columnName="Meta_RobotsTag", name="Meta RobotsTag", description="RobotsTag defines how search robots should handle this content", help="The Meta Robots Tag define on how a search engines robot should handle this page and the following ones. It defines two keywords: (NO)INDEX which defines whether or not to index this content and (NO)FOLLOW which defines whether or not to follow links. The most common combination is INDEX,FOLLOW which will force a search robot to index the content and follow links and images.", dataType=FlyDataType.String, entityType="D", printName="Meta RobotsTag", fieldLength=2000)
	metaRobotsTag,
	//
	@FlyElement(columnName="M_FixChangeNotice_ID", name="Fixed in", description="Fixed in Change Notice", dataType=FlyDataType.Table, entityType="D", printName="Fixed in", fieldLength=10)
	mFixChangeNoticeID,
	//
	@FlyElement(columnName="M_Forecast_ID", name="Forecast", description="Material Forecast", help="Material Forecast", dataType=FlyDataType.ID, entityType="D", printName="Forecast", fieldLength=22)
	mForecastID,
	//
	@FlyElement(columnName="M_ForecastLine_ID", name="Forecast Line", description="Forecast Line", help="Forecast of Product Qyantity by Period", dataType=FlyDataType.Search, entityType="D", printName="Forecast Line", fieldLength=22)
	mForecastLineID,
	//
	@FlyElement(columnName="M_FreightCategory_ID", name="运费分类", description="运费分类", help="Freight Categories are used to calculate the Freight for the Shipper selected", dataType=FlyDataType.ID, entityType="D", printName="运费分类", fieldLength=22)
	mFreightCategoryID,
	//
	@FlyElement(columnName="M_Freight_ID", name="运费", description="运费比率", help="运输商运费比率", dataType=FlyDataType.ID, entityType="D", printName="运费", fieldLength=22)
	mFreightID,
	//
	@FlyElement(columnName="MFX_Clasa", name="Fixed Asset Class", dataType=FlyDataType.NONE, entityType="D", printName="Fixed Asset Class", fieldLength=0)
	mFXClasa,
	//
	@FlyElement(columnName="MFX_Grupa", name="Fixed Asset Group", dataType=FlyDataType.NONE, entityType="D", printName="Fixed Asset Group", fieldLength=0)
	mFXGrupa,
	//
	@FlyElement(columnName="MFX_SubClasa", name="Fixed Asset Subclass", dataType=FlyDataType.NONE, entityType="D", printName="Fixed Asset Subclass", fieldLength=0)
	mFXSubClasa,
	//
	@FlyElement(columnName="MFX_SubGrupa", name="Fixed Asset Subgroup", dataType=FlyDataType.NONE, entityType="D", printName="Fixed Asset SubGroup", fieldLength=0)
	mFXSubGrupa,
	//
	@FlyElement(columnName="Micr", name="微寸", description="Combination of routing no, account and check no", help="The Micr number is the combination of the bank routing number, account number and check number", dataType=FlyDataType.String, entityType="D", printName="微寸", fieldLength=20)
	micr,
	//
	@FlyElement(columnName="MinAmt", name="最小金额", description="Minimum Amount in invoice currency", help="The Minimum amount indicates the minimum amount as stated in the currency of the invoice.", dataType=FlyDataType.Amount, entityType="D", printName="最小 Amt", fieldLength=22)
	minAmt,
	//
	@FlyElement(columnName="MinimumAmt", name="Minimum Amt", description="Minumum Amout in Document Currency", dataType=FlyDataType.Amount, entityType="D", printName="Minimum Amt", fieldLength=22)
	minimumAmt,
	//
	@FlyElement(columnName="M_InOutConfirm_ID", name="Ship/Receipt Confirmation", description="Material Shipment or Receipt Confirmation", help="Confirmation of Shipment or Receipt - Created from the Shipment/Receipt", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm", fieldLength=22)
	mInOutConfirmID,
	//
	@FlyElement(columnName="M_InOut_ID", name="发运|收货", description="物料出货或收货文件", help="The Shipment   Receipt ID indicates the unique document for this shipment or receipt.", dataType=FlyDataType.ID, entityType="D", printName="发运|收货", fieldLength=22)
	mInOutID,
	//
	@FlyElement(columnName="M_InOutLineConfirm_ID", name="Ship/Receipt Confirmation Line", description="Material Shipment or Receipt Confirmation Line", help="Confirmation details", dataType=FlyDataType.ID, entityType="D", printName="Ship/Receipt Confirm Line", fieldLength=22)
	mInOutLineConfirmID,
	//
	@FlyElement(columnName="M_InOutLine_ID", name="收货明细", description="接收货明细", help="The Shipment Receipt Line indicates a unique line in a Shipment Receipt document", dataType=FlyDataType.ID, entityType="D", printName="收货明细", fieldLength=22)
	mInOutLineID,
	//
	@FlyElement(columnName="MinQty", name="Minimum Quantity", description="Minimum quantity for the business partner", help="If a minimum quantity is defined, and the quantity is based on the percentage is lower, the minimum quantity is used.", dataType=FlyDataType.Quantity, entityType="D", printName="Min Qty", fieldLength=22)
	minQty,
	//
	@FlyElement(columnName="M_Inventory_ID", name="Phys.Inventory", description="盘点参数", help="The Physical Inventory indicates a unique parameters for a physical inventory.", dataType=FlyDataType.ID, entityType="D", printName="Phys.Inventory", fieldLength=22)
	mInventoryID,
	//
	@FlyElement(columnName="M_InventoryLine_ID", name="Phys.Inventory Line", description="盘点明细", help="The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="Phys.Inventory Line", fieldLength=22)
	mInventoryLineID,
	//
	@FlyElement(columnName="M_Locator_ID", name="货位", description="仓库货位", help="The Locator ID indicates where in a Warehouse a product is located.", dataType=FlyDataType.ID, entityType="D", printName="货位", fieldLength=22)
	mLocatorID,
	//
	@FlyElement(columnName="M_LocatorTo_ID", name="目标货位", description="目标货位", help="The Locator To indicates the location where the inventory is being moved to.", dataType=FlyDataType.Locator, entityType="D", printName="目标货位", fieldLength=22)
	mLocatorToID,
	//
	@FlyElement(columnName="M_LotCtlExclude_ID", name="Exclude Lot", description="Exclude the ability to create Lots in Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude Lot", fieldLength=10)
	mLotCtlExcludeID,
	//
	@FlyElement(columnName="M_LotCtl_ID", name="批控制", description="产品批控制", help="Definition to create Lot numbers for Products", dataType=FlyDataType.ID, entityType="D", printName="批控制", fieldLength=22)
	mLotCtlID,
	//
	@FlyElement(columnName="M_Lot_ID", name="批", description="产品批定义", help="The individual Lot of a Product", dataType=FlyDataType.ID, entityType="D", printName="批", fieldLength=22)
	mLotID,
	//
	@FlyElement(columnName="M_MatchInv_ID", name="匹配发票", description="Match Shipment Receipt to Invoice", dataType=FlyDataType.ID, entityType="D", printName="匹配发票", fieldLength=22)
	mMatchInvID,
	//
	@FlyElement(columnName="M_MatchPO_ID", name="匹配采购定单", description="Match Purchase Order to Shipment Receipt", dataType=FlyDataType.ID, entityType="D", printName="匹配采购定单", fieldLength=22)
	mMatchPOID,
	//
	@FlyElement(columnName="M_MovementConfirm_ID", name="Move Confirm", description="Inventory Move Confirmation", help="The document is automatically created when the document type of the movement indicates In Transit.", dataType=FlyDataType.TableDirect, entityType="D", printName="Move Confirm", fieldLength=22)
	mMovementConfirmID,
	//
	@FlyElement(columnName="M_Movement_ID", name="库存移动", description="调拨", help="The Inventory Movement uniquely identifies a group of movement lines.", dataType=FlyDataType.ID, entityType="D", printName="调拨", fieldLength=22)
	mMovementID,
	//
	@FlyElement(columnName="M_MovementLineConfirm_ID", name="Move Line Confirm", description="Inventory Move Line Confirmation", dataType=FlyDataType.ID, entityType="D", printName="Move Line Confirm", fieldLength=22)
	mMovementLineConfirmID,
	//
	@FlyElement(columnName="M_MovementLine_ID", name="调拨明细", description="调拨明细", help="The Movement Line indicates the inventory movement document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="调拨明细", fieldLength=22)
	mMovementLineID,
	//
	@FlyElement(columnName="MMPolicy", name="Material Policy", description="Material Movement Policy", help="The Material Movement Policy determines how the stock is flowing (FiFo or LiFo) if a specific Product Instance was not selected.  The policy can not contradict the costing method (e.g. FiFo movement policy and LiFo costing method).", dataType=FlyDataType.List, entityType="D", printName="Mat Policy", fieldLength=1)
	mMPolicy,
	//
	@FlyElement(columnName="ModelPackage", name="ModelPackage", description="Java Package of the model classes", help="By default, the Java model classes for extensions are in the compiere.model package.  If you provide a jar file in the classpath, you can define here your specific model package.  The model classes are used to save/modify/delete entries and as well as in Workflow.  Refer to the Compiere naming convention to make sure that your class is used rather then the base classes.", dataType=FlyDataType.String, entityType="D", printName="ModelPackage", fieldLength=255)
	modelPackage,
	//
	@FlyElement(columnName="ModelValidationClass", name="Model Validation Class", dataType=FlyDataType.String, entityType="D", printName="Model Validation Class", fieldLength=255)
	modelValidationClass,
	//
	@FlyElement(columnName="ModelValidationClasses", name="Model Validation Classes", description="List of data model validation classes separated by ;", help="List of classes implementing the interface org.compiere.model.ModelValidator, separated by semicolon.	The class is called for the client and allows to validate documents in the prepare stage and monitor model changes.", dataType=FlyDataType.String, entityType="D", printName="Model Validation Classes", fieldLength=255)
	modelValidationClasses,
	//
	@FlyElement(columnName="ModerationType", name="Moderation Type", description="Type of moderation", dataType=FlyDataType.List, entityType="D", printName="Moderation Type", fieldLength=1)
	moderationType,
	//
	@FlyElement(columnName="ModeratorStatus", name="Moderation Status", description="Status of Moderation", dataType=FlyDataType.List, entityType="D", printName="Moderation Status", fieldLength=1)
	moderatorStatus,
	//
	@FlyElement(columnName="Module", name="Module", dataType=FlyDataType.String, entityType="D", printName="Module", fieldLength=120)
	module,
	//
	@FlyElement(columnName="Month_0_Amt", name="Month_0_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_0_Amt", fieldLength=0)
	month0Amt,
	//
	@FlyElement(columnName="Month_0_Qty", name="Month_0_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_0_Qty", fieldLength=0)
	month0Qty,
	//
	@FlyElement(columnName="Month_10_Amt", name="Month_10_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_10_Amt", fieldLength=0)
	month10Amt,
	//
	@FlyElement(columnName="Month_10_Qty", name="Month_10_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_10_Qty", fieldLength=0)
	month10Qty,
	//
	@FlyElement(columnName="Month_11_Amt", name="Month_11_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_11_Amt", fieldLength=0)
	month11Amt,
	//
	@FlyElement(columnName="Month_11_Qty", name="Month_11_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_11_Qty", fieldLength=0)
	month11Qty,
	//
	@FlyElement(columnName="Month_1_Amt", name="Month_1_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_1_Amt", fieldLength=0)
	month1Amt,
	//
	@FlyElement(columnName="Month_1_Qty", name="Month_1_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_1_Qty", fieldLength=0)
	month1Qty,
	//
	@FlyElement(columnName="Month_2_Amt", name="Month_2_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_2_Amt", fieldLength=0)
	month2Amt,
	//
	@FlyElement(columnName="Month_2_Qty", name="Month_2_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_2_Qty", fieldLength=0)
	month2Qty,
	//
	@FlyElement(columnName="Month_3_Amt", name="Month_3_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_3_Amt", fieldLength=0)
	month3Amt,
	//
	@FlyElement(columnName="Month_3_Qty", name="Month_3_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_3_Qty", fieldLength=0)
	month3Qty,
	//
	@FlyElement(columnName="Month_4_Amt", name="Month_4_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_4_Amt", fieldLength=0)
	month4Amt,
	//
	@FlyElement(columnName="Month_4_Qty", name="Month_4_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_4_Qty", fieldLength=0)
	month4Qty,
	//
	@FlyElement(columnName="Month_5_Amt", name="Month_5_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_5_Amt", fieldLength=0)
	month5Amt,
	//
	@FlyElement(columnName="Month_5_Qty", name="Month_5_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_5_Qty", fieldLength=0)
	month5Qty,
	//
	@FlyElement(columnName="Month_6_Amt", name="Month_6_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_6_Amt", fieldLength=0)
	month6Amt,
	//
	@FlyElement(columnName="Month_6_Qty", name="Month_6_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_6_Qty", fieldLength=0)
	month6Qty,
	//
	@FlyElement(columnName="Month_7_Amt", name="Month_7_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_7_Amt", fieldLength=0)
	month7Amt,
	//
	@FlyElement(columnName="Month_7_Qty", name="Month_7_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_7_Qty", fieldLength=0)
	month7Qty,
	//
	@FlyElement(columnName="Month_8_Amt", name="Month_8_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_8_Amt", fieldLength=0)
	month8Amt,
	//
	@FlyElement(columnName="Month_8_Qty", name="Month_8_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_8_Qty", fieldLength=0)
	month8Qty,
	//
	@FlyElement(columnName="Month_9_Amt", name="Month_9_Amt", dataType=FlyDataType.NONE, entityType="D", printName="Month_9_Amt", fieldLength=0)
	month9Amt,
	//
	@FlyElement(columnName="Month_9_Qty", name="Month_9_Qty", dataType=FlyDataType.NONE, entityType="D", printName="Month_9_Qty", fieldLength=0)
	month9Qty,
	//
	@FlyElement(columnName="MonthDay", name="Day of the Month", description="Day of the month 1 to 28/29/30/31", dataType=FlyDataType.Integer, entityType="D", printName="Month Day", fieldLength=22)
	monthDay,
	//
	@FlyElement(columnName="M_OperationResource_ID", name="Operation Resource", description="Product Operation Resource", help="Resources for the Operation. You can have multiple resources (e.g. tool, labor) per operation.", dataType=FlyDataType.ID, entityType="D", printName="Operation Resource", fieldLength=10)
	mOperationResourceID,
	//
	@FlyElement(columnName="MovementDate", name="调拨日期", description="Date a product was moved in or out of inventory", help="The Movement Date indicates the date that a product moved in or out of inventory.  This is the result of a shipment, receipt or inventory movement.", dataType=FlyDataType.Date, entityType="D", printName="调拨日期", fieldLength=7)
	movementDate,
	//
	@FlyElement(columnName="MovementQty", name="调拨数量", description="Quantity of a product moved.", help="The Movement Quantity indicates the quantity of a product that has been moved.", dataType=FlyDataType.Quantity, entityType="D", printName="数量", fieldLength=22)
	movementQty,
	//
	@FlyElement(columnName="MovementType", name="调拨类型", description="Method of moving the inventory", help="The Movement Type indicates the type of movement (in, out, to production, etc)", dataType=FlyDataType.List, entityType="D", printName="调拨类型", fieldLength=2)
	movementType,
	//
	@FlyElement(columnName="M_Package_ID", name="Package", description="Shipment Package", help="A Shipment can have one or more Packages.  A Package may be individually tracked.", dataType=FlyDataType.TableDirect, entityType="D", printName="Package", fieldLength=22)
	mPackageID,
	//
	@FlyElement(columnName="M_PackageLine_ID", name="Package Line", description="The detail content of the Package", help="Link to the shipment line", dataType=FlyDataType.ID, entityType="D", printName="Package Line", fieldLength=22)
	mPackageLineID,
	//
	@FlyElement(columnName="M_PartType_ID", name="Part Type", dataType=FlyDataType.ID, entityType="D", printName="Part Type", fieldLength=22)
	mPartTypeID,
	//
	@FlyElement(columnName="M_PerpetualInv_ID", name="永续盘点", description="Rules for generating physical inventory", help="The Perpetual Inventory identifies the Perpetual Inventory rule which generated this Physical Inventory.", dataType=FlyDataType.TableDirect, entityType="D", printName="永续盘点", fieldLength=22)
	mPerpetualInvID,
	//
	@FlyElement(columnName="M_PriceList_ID", name="价目表", description="Unique identifier of a Price List", help="Price Lists are used to determine the pricing, margin and cost of items purchased or sold.", dataType=FlyDataType.ID, entityType="D", printName="价目表", fieldLength=22)
	mPriceListID,
	//
	@FlyElement(columnName="M_Pricelist_Version_Base_ID", name="基本价格列表", description="Source for Price list calculations", help="The Base Price List identifies the Base Pricelist used for calculating prices (the source)", dataType=FlyDataType.Table, entityType="D", printName="基本价格列表", fieldLength=22)
	mPricelistVersionBaseID,
	//
	@FlyElement(columnName="M_PriceList_Version_ID", name="价目表版本", description="Identifies a unique instance of a Price List", help="Each Price List can have multiple versions.  The most common use is to indicate the dates that a Price List is valid for.", dataType=FlyDataType.TableDirect, entityType="D", printName="价目表版本", fieldLength=22)
	mPriceListVersionID,
	//
	@FlyElement(columnName="M_Product_BOM_ID", name="物料清单明细", dataType=FlyDataType.ID, entityType="D", printName="物料清单明细", fieldLength=22)
	mProductBOMID,
	//
	@FlyElement(columnName="M_ProductBOM_ID", name="物料清单产品", description="产品物料清单", help="The BOM Product identifies an element that is part of this Bill of Materials.", dataType=FlyDataType.Search, entityType="D", printName="物料清单产品", fieldLength=22)
	mProductBOMID,
	//
	@FlyElement(columnName="M_Product_Category_ID", name="产品分类", description="Category this product is part of", help="Identifies the category which this product belongs to.  Product categories are used for pricing.", dataType=FlyDataType.TableDirect, entityType="D", printName="产品分类", fieldLength=22)
	mProductCategoryID,
	//
	@FlyElement(columnName="M_Product_Category_Parent_ID", name="Parent Product Category", dataType=FlyDataType.Table, entityType="D", printName="Parent Product Category", fieldLength=22)
	mProductCategoryParentID,
	//
	@FlyElement(columnName="M_Product_Class_ID", name="Product Class", description="Class of a Product", help="Identifies the Class which this product belongs to", dataType=FlyDataType.ID, entityType="D", printName="Product Class", fieldLength=22)
	mProductClassID,
	//
	@FlyElement(columnName="M_Product_Classification_ID", name="Product Classification", description="Classification of a Product", help="Identifies the classification which this product belongs to.", dataType=FlyDataType.ID, entityType="D", printName="Product Classification", fieldLength=22)
	mProductClassificationID,
	//
	@FlyElement(columnName="M_Product_Class_Parent_ID", name="Product Class Parent", dataType=FlyDataType.NONE, entityType="D", printName="Product Class Parent", fieldLength=0)
	mProductClassParentID,
	//
	@FlyElement(columnName="M_ProductDownload_ID", name="Product Download", description="Product downloads", help="Define download for a product. If the product is an asset, the user can download the data.", dataType=FlyDataType.ID, entityType="D", printName="Product Download", fieldLength=10)
	mProductDownloadID,
	//
	@FlyElement(columnName="M_ProductFreight_ID", name="产品为运费", dataType=FlyDataType.Search, entityType="D", printName="产品为运费", fieldLength=22)
	mProductFreightID,
	//
	@FlyElement(columnName="M_Product_Group_ID", name="Product Group", description="Group of a Product", help="Identifies the Group which this product belongs to.", dataType=FlyDataType.TableDirect, entityType="D", printName="Product Group", fieldLength=22)
	mProductGroupID,
	//
	@FlyElement(columnName="M_Product_Group_Parent_ID", name="Product Group Parent", dataType=FlyDataType.NONE, entityType="D", printName="Product Group Parent", fieldLength=0)
	mProductGroupParentID,
	//
	@FlyElement(columnName="M_Product_ID", name="产品", description="Product, Service, Item", help="Identifies an item which is either purchased or sold in this organization.", dataType=FlyDataType.ID, entityType="D", printName="产品", fieldLength=22)
	mProductID,
	//
	@FlyElement(columnName="M_ProductionBatch_ID", name="Production Batch", dataType=FlyDataType.TableDirect, entityType="D", printName="Production Batch", fieldLength=10)
	mProductionBatchID,
	//
	@FlyElement(columnName="M_ProductionBatchLine_ID", name="Production Batch Line", dataType=FlyDataType.TableDirect, entityType="D", printName="Production Batch Line", fieldLength=10)
	mProductionBatchLineID,
	//
	@FlyElement(columnName="M_Production_ID", name="制造", description="产生一种产品的计划", help="The Production uniquely identifies a Production Plan", dataType=FlyDataType.ID, entityType="D", printName="制造", fieldLength=22)
	mProductionID,
	//
	@FlyElement(columnName="M_ProductionLine_ID", name="制造明细", description="制造明细", help="The Production Line indicates the production document line (if applicable) for this transaction", dataType=FlyDataType.ID, entityType="D", printName="制造明细", fieldLength=22)
	mProductionLineID,
	//
	@FlyElement(columnName="M_ProductionPlan_ID", name="制造计划", description="Plan for how a product is produced", help="The Production Plan identifies the items and steps in generating a product.", dataType=FlyDataType.TableDirect, entityType="D", printName="制造计划", fieldLength=22)
	mProductionPlanID,
	//
	@FlyElement(columnName="M_ProductMember_ID", name="Membership", description="Product used to deternine the price of the membership for the topic type", help="A topic can require to pay a membership fee.", dataType=FlyDataType.Table, entityType="D", printName="Membership", fieldLength=22)
	mProductMemberID,
	//
	@FlyElement(columnName="M_ProductOperation_ID", name="Product Operation", description="Product Manufacturing Operation", help="The Operations to create the product.  Note that the actual used operation and sequence is determined by the BOM Product.", dataType=FlyDataType.ID, entityType="D", printName="Product Operation", fieldLength=10)
	mProductOperationID,
	//
	@FlyElement(columnName="M_ProductPriceVendorBreak_ID", name="Product Price Break", dataType=FlyDataType.ID, entityType="D", printName="Product Price Break", fieldLength=22)
	mProductPriceVendorBreakID,
	//
	@FlyElement(columnName="M_Product_QualityTest_ID", name="Product Quality Test", dataType=FlyDataType.ID, entityType="D", printName="Product Quality Test", fieldLength=22)
	mProductQualityTestID,
	//
	@FlyElement(columnName="M_ProductSpent_ID", name="Product Used", description="Product/Resource/Service used in Request", help="Invoicing uses the Product used.", dataType=FlyDataType.Search, entityType="D", printName="Product Used", fieldLength=10)
	mProductSpentID,
	//
	@FlyElement(columnName="M_Product_To_ID", name="To Product", description="Product to be converted to (must have UOM Conversion defined to From Product)", dataType=FlyDataType.NONE, entityType="D", printName="To Product", fieldLength=0)
	mProductToID,
	//
	@FlyElement(columnName="M_PromotionDistribution_ID", name="Promotion Distribution", dataType=FlyDataType.ID, entityType="D", printName="Promotion Distribution", fieldLength=22)
	mPromotionDistributionID,
	//
	@FlyElement(columnName="M_PromotionGroup_ID", name="Promotion Group", dataType=FlyDataType.ID, entityType="D", printName="Promotion Group", fieldLength=22)
	mPromotionGroupID,
	//
	@FlyElement(columnName="M_PromotionGroupLine_ID", name="Promotion Group Line", dataType=FlyDataType.ID, entityType="D", printName="Promotion Group Line", fieldLength=22)
	mPromotionGroupLineID,
	//
	@FlyElement(columnName="M_Promotion_ID", name="Promotion", dataType=FlyDataType.ID, entityType="D", printName="Promotion", fieldLength=22)
	mPromotionID,
	//
	@FlyElement(columnName="M_PromotionLine_ID", name="Promotion Line", dataType=FlyDataType.ID, entityType="D", printName="Promotion Line", fieldLength=22)
	mPromotionLineID,
	//
	@FlyElement(columnName="M_PromotionPreCondition_ID", name="Promotion Pre Condition", dataType=FlyDataType.ID, entityType="D", printName="Promotion Pre Condition", fieldLength=22)
	mPromotionPreConditionID,
	//
	@FlyElement(columnName="M_PromotionReward_ID", name="Promotion Reward", dataType=FlyDataType.ID, entityType="D", printName="Promotion Reward", fieldLength=22)
	mPromotionRewardID,
	//
	@FlyElement(columnName="M_QualityTest_ID", name="Quality Test", dataType=FlyDataType.TableDirect, entityType="D", printName="Quality Test", fieldLength=10)
	mQualityTestID,
	//
	@FlyElement(columnName="M_QualityTestResult_ID", name="Quality Test Result", dataType=FlyDataType.ID, entityType="D", printName="Quality Test Result", fieldLength=22)
	mQualityTestResultID,
	//
	@FlyElement(columnName="M_ReplenishPlan_ID", name="M_ReplenishPlan ID", dataType=FlyDataType.TableDirect, entityType="D", printName="M_ReplenishPlan ID", fieldLength=10)
	mReplenishPlanID,
	//
	@FlyElement(columnName="M_ReplenishPlanLine_ID", name="M_ReplenishPlanLine ID", dataType=FlyDataType.TableDirect, entityType="D", printName="M_ReplenishPlanLine ID", fieldLength=10)
	mReplenishPlanLineID,
	//
	@FlyElement(columnName="M_Requisition_ID", name="Requisition", description="Material Requisition", dataType=FlyDataType.ID, entityType="D", printName="Requisition", fieldLength=22)
	mRequisitionID,
	//
	@FlyElement(columnName="M_RequisitionLine_ID", name="Requisition Line", description="Material Requisition Line", dataType=FlyDataType.ID, entityType="D", printName="Requisition Line", fieldLength=22)
	mRequisitionLineID,
	//
	@FlyElement(columnName="M_RMA_ID", name="RMA", description="Return Material Authorization", help="A Return Material Authorization may be required to accept returns and to create Credit Memos", dataType=FlyDataType.TableDirect, entityType="D", printName="RMA", fieldLength=22)
	mRMAID,
	//
	@FlyElement(columnName="M_RMALine_ID", name="RMA Line", description="Return Material Authorization Line", help="Detail information about the returned goods", dataType=FlyDataType.ID, entityType="D", printName="RMA Line", fieldLength=22)
	mRMALineID,
	//
	@FlyElement(columnName="M_RMAType_ID", name="RMA Type", description="Return Material Authorization Type", help="Types of RMA", dataType=FlyDataType.TableDirect, entityType="D", printName="RMA Type", fieldLength=22)
	mRMATypeID,
	//
	@FlyElement(columnName="M_SerNoCtlExclude_ID", name="Exclude SerNo", description="Exclude the ability to create Serial Numbers in Attribute Sets", dataType=FlyDataType.ID, entityType="D", printName="Exclude SerNo", fieldLength=10)
	mSerNoCtlExcludeID,
	//
	@FlyElement(columnName="M_SerNoCtl_ID", name="序列号控制", description="产品序号控制", help="Definition to create Serial numbers for Products", dataType=FlyDataType.ID, entityType="D", printName="序列号控制", fieldLength=22)
	mSerNoCtlID,
	//
	@FlyElement(columnName="MsgText", name="消息文本", description="Textual Informational, Menu or Error Message", help="The Message Text indicates the message that will display ", dataType=FlyDataType.Text, entityType="D", printName="消息文本", fieldLength=2000)
	msgText,
	//
	@FlyElement(columnName="MsgTip", name="消息提示", description="Additional tip or help for this message", help="The Message Tip defines additional help or information about this message.", dataType=FlyDataType.Text, entityType="D", printName="消息提示", fieldLength=2000)
	msgTip,
	//
	@FlyElement(columnName="MsgType", name="消息类型", description="Type of message (Informational, Menu or Error)", help="The Message Type indicates the type of message being defined.  Valid message types are Informational, Menu and Error.", dataType=FlyDataType.List, entityType="D", printName="消息类型", fieldLength=1)
	msgType,
	//
	@FlyElement(columnName="M_Shipper_ID", name="运输商", description="Method or manner of product delivery", help="The Shipper indicates the method of delivering product", dataType=FlyDataType.ID, entityType="D", printName="运输商", fieldLength=22)
	mShipperID,
	//
	@FlyElement(columnName="M_TargetDistribution_ID", name="Target distribution", description="Get product from target distribution to apply the promotion reward", dataType=FlyDataType.Table, entityType="D", printName="Target distribution", fieldLength=22)
	mTargetDistributionID,
	//
	@FlyElement(columnName="M_Transaction_ID", name="库存交易", dataType=FlyDataType.ID, entityType="D", printName="Inventory Transaction", fieldLength=22)
	mTransactionID,
	//
	@FlyElement(columnName="Multiplier", name="乘数", dataType=FlyDataType.Number, entityType="D", printName="乘数", fieldLength=22)
	multiplier,
	//
	@FlyElement(columnName="MultiplierAP", name="应付款乘数", description="应付的增殖者", dataType=FlyDataType.Number, entityType="D", printName="应付款乘数", fieldLength=22)
	multiplierAP,
	//
	@FlyElement(columnName="MultiplyRate", name="乘积比率", description="Rate to multiple the source by to calculate the target.", help="To convert Source number to Target number, the Source is multiplied by the multiply rate.  If the Multiply Rate is entered, then the Divide Rate will be automatically calculated.", dataType=FlyDataType.Number, entityType="D", printName="乘积比率", fieldLength=22)
	multiplyRate,
	//
	@FlyElement(columnName="MustBeStocked", name="产品数量必须在库存中", description="如果库存不足,物料将不能生产", dataType=FlyDataType.NONE, entityType="D", printName="产品数量必须在库存中", fieldLength=0)
	mustBeStocked,
	//
	@FlyElement(columnName="M_Warehouse_ID", name="仓库或服务位置", description="Storage Warehouse and Service Point", help="The Warehouse identifies a unique Warehouse where products are stored or Services are provided.", dataType=FlyDataType.ID, entityType="D", printName="仓库", fieldLength=22)
	mWarehouseID,
	//
	@FlyElement(columnName="M_WarehouseSource_ID", name="Source Warehouse", description="Optional Warehouse to replenish from", help="If defined, the warehouse selected is used to replenish the product(s)", dataType=FlyDataType.Table, entityType="D", printName="Source Warehouse", fieldLength=10)
	mWarehouseSourceID,
	//
	@FlyElement(columnName="NAICS", name="NAICS SIC", description="Standard Industry Code or its successor NAIC - http:  www.osha.gov oshstats sicser.html", help="The NAICS SIC identifies either of these codes that may be applicable to this Business Partner.", dataType=FlyDataType.String, entityType="D", printName="NAICS SIC", fieldLength=6)
	nAICS,
	//
	@FlyElement(columnName="Name", name="名称", description="Alphanumeric identifier of the entity", help="The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", dataType=FlyDataType.String, entityType="D", printName="名称", fieldLength=60)
	name,
	//
	@FlyElement(columnName="Name2", name="命名 2", description="附加的名字", dataType=FlyDataType.String, entityType="D", printName="命名 2", fieldLength=60)
	name2,
	//
	@FlyElement(columnName="Name_PrintColor_ID", name="Name Colour", dataType=FlyDataType.NONE, entityType="D", printName="Name Colour", fieldLength=0)
	namePrintColorID,
	//
	@FlyElement(columnName="Name_PrintFont_ID", name="Name Font", dataType=FlyDataType.NONE, entityType="D", printName="Name Font", fieldLength=0)
	namePrintFontID,
	//
	@FlyElement(columnName="NetAmtToInvoice", name="发票净金额", description="该发票的网络金额", help="Indicates the net amount for this invoice.  It does not include shipping or any additional charges.", dataType=FlyDataType.Amount, entityType="D", printName="发票净金额", fieldLength=22)
	netAmtToInvoice,
	//
	@FlyElement(columnName="NetDay", name="总天数", description="付款到期日", help="When defined, overwrites the number of net days with the relative number of days to the the day defined.", dataType=FlyDataType.List, entityType="D", printName="总天数", fieldLength=1)
	netDay,
	//
	@FlyElement(columnName="NetDays", name="净天数", description="Net Days in which payment is due", help="Indicates the number of days after invoice date that payment is due.", dataType=FlyDataType.Integer, entityType="D", printName="净天数", fieldLength=22)
	netDays,
	//
	@FlyElement(columnName="NewEMail", name="New Email Address", description="Enter new EMail Address - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New Email Address", fieldLength=0)
	newEMail,
	//
	@FlyElement(columnName="NewEMailUser", name="New Email User ID", description="Enter new User ID of your internal EMail System - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New Email User ID", fieldLength=0)
	newEMailUser,
	//
	@FlyElement(columnName="NewEMailUserPW", name="New Email User PW", description="Enter new User Password of your internal EMail System - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="New Email User PW", fieldLength=0)
	newEMailUserPW,
	//
	@FlyElement(columnName="NewPassword", name="新口令", description="Enter the new password - not changed if empty", dataType=FlyDataType.NONE, entityType="D", printName="新口令", fieldLength=0)
	newPassword,
	//
	@FlyElement(columnName="NewValue", name="新的值", description="新的字段值", help="新的数据在字段中输入", dataType=FlyDataType.String, entityType="D", printName="新的值", fieldLength=2000)
	newValue,
	//
	@FlyElement(columnName="NextAction", name="下一个动作", description="下一个动作被采取", help="The Next Action indicates the next action to be taken on this request.", dataType=FlyDataType.List, entityType="D", printName="下一个动作", fieldLength=1)
	nextAction,
	//
	@FlyElement(columnName="NextMaintenanceUseUnit", name="Next Maintenance Use Unit", dataType=FlyDataType.Integer, entityType="D", printName="Next Maintenance Use Unit", fieldLength=22)
	nextMaintenanceUseUnit,
	//
	@FlyElement(columnName="NextMaintenenceDate", name="Next Maintenence", description="Next Maintenence Date", dataType=FlyDataType.DateTime, entityType="D", printName="Next Maintenence", fieldLength=7)
	nextMaintenenceDate,
	//
	@FlyElement(columnName="NextMaintenenceUnit", name="Next Unit", description="Next Maintenence Unit", dataType=FlyDataType.Integer, entityType="D", printName="Next Unit", fieldLength=10)
	nextMaintenenceUnit,
	//
	@FlyElement(columnName="Next_Status_ID", name="Next Status", description="Move to next status automatically after timeout", help="After the timeout, change the status automatically", dataType=FlyDataType.Table, entityType="D", printName="Next Status", fieldLength=10)
	nextStatusID,
	//
	@FlyElement(columnName="Node_ID", name="Node_ID", dataType=FlyDataType.ID, entityType="D", printName="Node_ID", fieldLength=22)
	nodeID,
	//
	@FlyElement(columnName="NoGuarantee_MailText_ID", name="已期满保证邮件", description="Send email to partners with expired guarantee", dataType=FlyDataType.NONE, entityType="D", printName="已期满保证邮件", fieldLength=0)
	noGuaranteeMailTextID,
	//
	@FlyElement(columnName="NoInventoryCount", name="盘点的数字", description="Frequency of inventory counts per year", help="The Number of Inventory Counts indicates the number of times per year that inventory counts will be preformed", dataType=FlyDataType.Integer, entityType="D", printName="盘点的数字", fieldLength=22)
	noInventoryCount,
	//
	@FlyElement(columnName="NoMonths", name="月的数字", dataType=FlyDataType.Integer, entityType="D", printName="月的数字", fieldLength=22)
	noMonths,
	//
	@FlyElement(columnName="NonCommittedAmt", name="Not Committed Aount", description="Amount not committed yet", dataType=FlyDataType.Amount, entityType="D", printName="Not Committed Amt", fieldLength=22)
	nonCommittedAmt,
	//
	@FlyElement(columnName="No_Of_Periods", name="No_Of_Periods", dataType=FlyDataType.NONE, entityType="D", printName="No_Of_Periods", fieldLength=0)
	noOfPeriods,
	//
	@FlyElement(columnName="NoPackages", name="件数", description="物料出货包装的数字", dataType=FlyDataType.Integer, entityType="D", printName="件数", fieldLength=22)
	noPackages,
	//
	@FlyElement(columnName="NoProcessors", name="处理器数", description="数据库的处理器数", dataType=FlyDataType.Integer, entityType="D", printName="处理器数", fieldLength=22)
	noProcessors,
	//
	@FlyElement(columnName="NoProductCount", name="产品计数的数字", description="Frequency of product counts per year", help="The Number of Product Count indicates the number of times per year that a product should be counted.", dataType=FlyDataType.Integer, entityType="D", printName="产品计数的数字", fieldLength=22)
	noProductCount,
	//
	@FlyElement(columnName="Note", name=" 注解", description="Optional additional user defined information", help="The Note field allows for optional entry of user defined information regarding this record", dataType=FlyDataType.Text, entityType="D", printName=" 注解", fieldLength=2000)
	note,
	//
	@FlyElement(columnName="Notice", name="Notice", description="Contains last write notice", help="Contains info on what changed with the last write", dataType=FlyDataType.Text, entityType="D", printName="Notice", fieldLength=2000)
	notice,
	//
	@FlyElement(columnName="NotificationType", name="Notification Type", description="Type of Notifications", help="Emails or Notification sent out for Request Updates, etc.", dataType=FlyDataType.List, entityType="D", printName="Notification Type", fieldLength=1)
	notificationType,
	//
	@FlyElement(columnName="NotInvoicedReceipts_Acct", name="未开票收货", description="未开票收货", help="The Not Invoiced Receipts account indicates the account used for recording receipts for materials that have not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="未开票收货", fieldLength=22)
	notInvoicedReceiptsAcct,
	//
	@FlyElement(columnName="NotInvoicedReceivables_Acct", name="未开票应收帐款", description="未开票应收帐款帐户", help="The Not Invoiced Receivables account indicates the account used for recording receivables that have not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="未开票应收帐款", fieldLength=22)
	notInvoicedReceivablesAcct,
	//
	@FlyElement(columnName="NotInvoicedRevenue_Acct", name="未开票收入", description="未开票收入帐户", help="The Not Invoiced Revenue account indicates the account used for recording revenue that has not yet been invoiced.", dataType=FlyDataType.Account, entityType="D", printName="未开票收入", fieldLength=22)
	notInvoicedRevenueAcct,
	//
	@FlyElement(columnName="NotPosted", name="Not Posted", dataType=FlyDataType.NONE, entityType="D", printName="Not Posted", fieldLength=0)
	notPosted,
	//
	@FlyElement(columnName="NullColumns", name="Null Columns", description="Columns with NULL value", help="Null values are used for showing 'no change'", dataType=FlyDataType.String, entityType="D", printName="Null Columns", fieldLength=255)
	nullColumns,
	//
	@FlyElement(columnName="NumberEmployees", name="职员数", description="职员的人数", help="Indicates the number of employees for this Business Partner.  This field displays only for Prospects.", dataType=FlyDataType.Integer, entityType="D", printName="职员数", fieldLength=22)
	numberEmployees,
	//
	@FlyElement(columnName="NumberOfRuns", name="运行的数目", description="永续盘存运行频率", help="The Number of Runs indicates the number of times that the Perpetual Inventory has be processed.", dataType=FlyDataType.Integer, entityType="D", printName="运行的数目", fieldLength=22)
	numberOfRuns,
	//
	@FlyElement(columnName="Number_PrintColor_ID", name="Number Colour", dataType=FlyDataType.NONE, entityType="D", printName="Number Colour", fieldLength=0)
	numberPrintColorID,
	//
	@FlyElement(columnName="Number_PrintFont_ID", name="Number Font", dataType=FlyDataType.NONE, entityType="D", printName="Number Font", fieldLength=0)
	numberPrintFontID,
	//
	@FlyElement(columnName="ObscureType", name="Obscure", description="Type of obscuring the data (limiting the display)", dataType=FlyDataType.List, entityType="D", printName="Obscure", fieldLength=3)
	obscureType,
	//
	@FlyElement(columnName="OfferAmt", name="Offer Amount", description="Amount of the Offer", dataType=FlyDataType.Amount, entityType="D", printName="Offer Amt", fieldLength=22)
	offerAmt,
	//
	@FlyElement(columnName="OldName", name="Old Name", dataType=FlyDataType.String, entityType="D", printName="Old Name", fieldLength=60)
	oldName,
	//
	@FlyElement(columnName="OldPassword", name="旧口令", description="Old Password is required if you are not a System Administrator", dataType=FlyDataType.NONE, entityType="D", printName="旧口令", fieldLength=0)
	oldPassword,
	//
	@FlyElement(columnName="OldValue", name="旧的值", description="旧的文件数据", help="Old data overwritten in the field", dataType=FlyDataType.String, entityType="D", printName="旧的值", fieldLength=2000)
	oldValue,
	//
	@FlyElement(columnName="onevent", name="onevent", dataType=FlyDataType.NONE, entityType="D", printName="onevent", fieldLength=0)
	onevent,
	//
	@FlyElement(columnName="OnFriday", name="星期五", description="可用每个星期五", dataType=FlyDataType.YesNo, entityType="D", printName="周五", fieldLength=1)
	onFriday,
	//
	@FlyElement(columnName="OnlyDiscount", name="只有折扣", description="Include only invoices where we would get payment discount", dataType=FlyDataType.NONE, entityType="D", printName="只有折扣", fieldLength=0)
	onlyDiscount,
	//
	@FlyElement(columnName="OnlyDue", name="只有应付款", description="只包括应付款发票", dataType=FlyDataType.NONE, entityType="D", printName="只有应付款", fieldLength=0)
	onlyDue,
	//
	@FlyElement(columnName="OnlySOTrx", name="Only Sales Invoices", description="Otherwise also Payments and AP Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Only Sales Invoices", fieldLength=0)
	onlySOTrx,
	//
	@FlyElement(columnName="OnMonday", name="星期一", description="可用每个星期一", dataType=FlyDataType.YesNo, entityType="D", printName="周一", fieldLength=1)
	onMonday,
	//
	@FlyElement(columnName="OnSaturday", name="星期六", description="可用在星期六", dataType=FlyDataType.YesNo, entityType="D", printName="周六", fieldLength=1)
	onSaturday,
	//
	@FlyElement(columnName="OnSunday", name="星期日", description="可用每个星期日", dataType=FlyDataType.YesNo, entityType="D", printName="周日", fieldLength=1)
	onSunday,
	//
	@FlyElement(columnName="OnThursday", name="星期四", description="可用每个星期四", dataType=FlyDataType.YesNo, entityType="D", printName="周四", fieldLength=1)
	onThursday,
	//
	@FlyElement(columnName="OnTuesday", name="星期二", description="可用每个星期二", dataType=FlyDataType.YesNo, entityType="D", printName="周二", fieldLength=1)
	onTuesday,
	//
	@FlyElement(columnName="OnWednesday", name="星期三", description="可用每个星期三", dataType=FlyDataType.YesNo, entityType="D", printName="周三", fieldLength=1)
	onWednesday,
	//
	@FlyElement(columnName="OpenAmt", name="未结金额", description="未结项目金额", dataType=FlyDataType.Amount, entityType="D", printName="打开", fieldLength=22)
	openAmt,
	//
	@FlyElement(columnName="OpenRequests", name="Open Requests", dataType=FlyDataType.NONE, entityType="D", printName="Open Requests", fieldLength=0)
	openRequests,
	//
	@FlyElement(columnName="Oper_1_ID", name="运算元 1", description="首先运算元为计算", dataType=FlyDataType.Table, entityType="D", printName="运算元 1", fieldLength=22)
	oper1ID,
	//
	@FlyElement(columnName="Oper_2_ID", name="运算元 2", description="Second operand for calculation", dataType=FlyDataType.Table, entityType="D", printName="运算元 2", fieldLength=22)
	oper2ID,
	//
	@FlyElement(columnName="OperatingSystemInfo", name="Operating System", description="Operating System Info", dataType=FlyDataType.String, entityType="D", printName="Operating System", fieldLength=255)
	operatingSystemInfo,
	//
	@FlyElement(columnName="Operation", name="操作", dataType=FlyDataType.List, entityType="D", printName="操作", fieldLength=2)
	operation,
	//
	@FlyElement(columnName="OpportunityAmt", name="Opportunity Amount", description="The estimated value of this opportunity.", dataType=FlyDataType.NONE, entityType="D", printName="Opportunity Amount", fieldLength=0)
	opportunityAmt,
	//
	@FlyElement(columnName="OpportunityCampaign", name="Opportunity by Campaign", dataType=FlyDataType.NONE, entityType="D", printName="Opportunity by Campaign", fieldLength=0)
	opportunityCampaign,
	//
	@FlyElement(columnName="OProcessing", name="在线处理", description="This payment can be processed online", help="The Online Processing indicates if the payment can be processed online.", dataType=FlyDataType.Button, entityType="D", printName="在线处理", fieldLength=1)
	oProcessing,
	//
	@FlyElement(columnName="OptOutDate", name="选择-外出日期", description="Date the contact opted out", help="If the field has a date, the customer opted out (unsubscribed) and cannot receive mails for the Interest Area", dataType=FlyDataType.Date, entityType="D", printName="选择-在外", fieldLength=7)
	optOutDate,
	//
	@FlyElement(columnName="OrderByClause", name="SQL的Order By子句", description="Fully qualified ORDER BY clause", help="The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection", dataType=FlyDataType.Text, entityType="D", printName="SQL的Order By子句", fieldLength=2000)
	orderByClause,
	//
	@FlyElement(columnName="OrderInfo", name="Order Info", dataType=FlyDataType.String, entityType="D", printName="Order Info", fieldLength=60)
	orderInfo,
	//
	@FlyElement(columnName="Order_MailText_ID", name="定单邮件本文", description="Email text used for sending order acknowledgements or quotations", help="Standard email template used to send acknowledgements or quotations as attachments.", dataType=FlyDataType.Table, entityType="D", printName="定单邮件本文", fieldLength=22)
	orderMailTextID,
	//
	@FlyElement(columnName="Order_Min", name="最小量定单数量", description="在 UOM 中的最小量定单量", help="The Minimum Order Quantity indicates the smallest quantity of this product which can be ordered.", dataType=FlyDataType.Quantity, entityType="D", printName="最小量定单数量", fieldLength=22)
	orderMin,
	//
	@FlyElement(columnName="Order_Pack", name="定单包装数量", description="Package order size in UOM (e.g. order set of 5 units)", help="The Order Pack Quantity indicates the number of units in each pack of this product.", dataType=FlyDataType.Quantity, entityType="D", printName="定单包装数量", fieldLength=22)
	orderPack,
	//
	@FlyElement(columnName="Order_PrintFormat_ID", name="定单打印格式", description="Print Format for Orders, Quotes, Offers", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="定单打印格式", fieldLength=22)
	orderPrintFormatID,
	//
	@FlyElement(columnName="OrderType", name="Order Type", description="Type of Order: MRP records grouped by source (Sales Order, Purchase Order, Distribution Order, Requisition)", dataType=FlyDataType.String, entityType="D", printName="Order Type", fieldLength=510)
	orderType,
	//
	@FlyElement(columnName="OrgColumn", name="组织 列", description="Fully qualified Organization column (AD_Org_ID)", help="The Organization Column indicates the organization to be used in calculating this measurement.", dataType=FlyDataType.String, entityType="D", printName="组织 列", fieldLength=60)
	orgColumn,
	//
	@FlyElement(columnName="Org_ID", name="机构", description="Organizational entity within client", help="An organization is a unit of your client or legal entity - examples are store, department.", dataType=FlyDataType.Table, entityType="D", printName="机构", fieldLength=22)
	orgID,
	//
	@FlyElement(columnName="Org_Location_ID", name="组织 位置", description="Organization Location Address", dataType=FlyDataType.Location, entityType="D", printName="组织 位置", fieldLength=22)
	orgLocationID,
	//
	@FlyElement(columnName="OrgName", name="Organization Name", description="Name of the Organization", dataType=FlyDataType.String, entityType="D", printName="Org Name", fieldLength=60)
	orgName,
	//
	@FlyElement(columnName="OrgTrxValue", name="交易机构关键字", description="Key of the Transaction Organization", dataType=FlyDataType.String, entityType="D", printName="交易机构关键字", fieldLength=40)
	orgTrxValue,
	//
	@FlyElement(columnName="OrgValue", name="机构 关键字", description="机构的关键字", dataType=FlyDataType.String, entityType="D", printName="机构 关键字", fieldLength=40)
	orgValue,
	//
	@FlyElement(columnName="Orig_TrxID", name="原交易ID", description="原交易ID", help="The Original Transaction ID is used for reversing transactions and indicates the transaction that has been reversed.", dataType=FlyDataType.String, entityType="D", printName="原Trx ID", fieldLength=20)
	origTrxID,
	//
	@FlyElement(columnName="OS_Command", name="操作系统命令", description="操作系统命令", help="The OS Command is for optionally defining a command to that will be part of this task.  For example it can be used to starting a back up process or performing a file transfer.", dataType=FlyDataType.String, entityType="D", printName="操作系统命令", fieldLength=2000)
	oSCommand,
	//
	@FlyElement(columnName="OSK_KeyLayout_ID", name="On Screen Keyboard layout", description="The key layout to use for on screen keyboard for text fields.", help="If empty, the on screen keyboard will not be used.", dataType=FlyDataType.Table, entityType="D", printName="On Screen Keyboard layout", fieldLength=22)
	oSKKeyLayoutID,
	//
	@FlyElement(columnName="OSNP_KeyLayout_ID", name="On Screen Number Pad layout", description="The key layout to use for on screen number pad for numeric fields.", help="If empty, the on screen numberpad will not be used.", dataType=FlyDataType.Table, entityType="D", printName="On Screen Number Pad layout", fieldLength=22)
	oSNPKeyLayoutID,
	//
	@FlyElement(columnName="OtherClause", name="Other Clause", description="Other SQL Clause", help="Any other complete clause like GROUP BY, HAVING, ORDER BY, etc. after WHERE clause.", dataType=FlyDataType.Text, entityType="D", printName="Other Clause", fieldLength=2000)
	otherClause,
	//
	@FlyElement(columnName="Out_M_InOutLine_ID", name="Out Shipment Line", description="Outgoing Shipment/Receipt", dataType=FlyDataType.Table, entityType="D", printName="Out Shipment Line", fieldLength=22)
	outMInOutLineID,
	//
	@FlyElement(columnName="Out_M_InventoryLine_ID", name="Out Inventory Line", description="Outgoing Inventory Line", dataType=FlyDataType.Table, entityType="D", printName="Out Inventory Line", fieldLength=22)
	outMInventoryLineID,
	//
	@FlyElement(columnName="Out_M_ProductionLine_ID", name="Out Production Line", description="Outgoing Production Line", dataType=FlyDataType.Table, entityType="D", printName="Out Production Line", fieldLength=22)
	outMProductionLineID,
	//
	@FlyElement(columnName="Out_M_Transaction_ID", name="Out Transaction", description="Outgoing Transaction", dataType=FlyDataType.Table, entityType="D", printName="Out Transaction", fieldLength=22)
	outMTransactionID,
	//
	@FlyElement(columnName="OverdueAlertDays", name=" 警报存储天数", description="Send email alert after number of days overdue (0=no alerts)", help="Send an email alert after the item is overdue. If set to zero, no alert is sent.", dataType=FlyDataType.Integer, entityType="D", printName="Alert days overdue", fieldLength=22)
	overdueAlertDays,
	//
	@FlyElement(columnName="OverdueAssignDays", name="在天之后扩大超储的", description="Escalation to superior after number of overdue days", help="The item will be escalated and assigned to the supervisor after the number of days overdue.", dataType=FlyDataType.Integer, entityType="D", printName="在天之后扩大", fieldLength=22)
	overdueAssignDays,
	//
	@FlyElement(columnName="OverlineStrokeType", name="Overline Stroke Type", dataType=FlyDataType.List, entityType="D", printName="Overline Stroke Type", fieldLength=5)
	overlineStrokeType,
	//
	@FlyElement(columnName="OvertimeAmt", name="Overtime Amount", description="Hourly Overtime Rate", help="Hourly Amount without Benefits and Employer overhead", dataType=FlyDataType.Amount, entityType="D", printName="Overtime Amount", fieldLength=22)
	overtimeAmt,
	//
	@FlyElement(columnName="OvertimeCost", name="Overtime Cost", description="Hourly Overtime Cost", help="Hourly Amount with Benefits and Employer overhead", dataType=FlyDataType.CostsPrices, entityType="D", printName="Overtime Cost", fieldLength=22)
	overtimeCost,
	//
	@FlyElement(columnName="OverUnderAmt", name="多于或少于付款金额", description="Over-Payment (unallocated) or Under-Payment (partial payment) Amount", help="Overpayments (negative) are unallocated amounts and allow you to receive money for more than the particular invoice. 	Underpayments (positive) is a partial payment for the invoice. You do not write off the unpaid amount.", dataType=FlyDataType.Amount, entityType="D", printName="多于或少于付款金额", fieldLength=22)
	overUnderAmt,
	//
	@FlyElement(columnName="OverwriteAcct", name="Overwrite Account", description="Overwrite the account segment Account with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Account", fieldLength=1)
	overwriteAcct,
	//
	@FlyElement(columnName="OverwriteActivity", name="Overwrite Activity", description="Overwrite the account segment Activity with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Activity", fieldLength=1)
	overwriteActivity,
	//
	@FlyElement(columnName="OverwriteBPartner", name="Overwrite Bus.Partner", description="Overwrite the account segment Business Partner with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite BPartner", fieldLength=1)
	overwriteBPartner,
	//
	@FlyElement(columnName="OverwriteCampaign", name="Overwrite Campaign", description="Overwrite the account segment Campaign with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Campaign", fieldLength=1)
	overwriteCampaign,
	//
	@FlyElement(columnName="OverwriteLocFrom", name="Overwrite Location From", description="Overwrite the account segment Location From with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Loc From", fieldLength=1)
	overwriteLocFrom,
	//
	@FlyElement(columnName="OverwriteLocTo", name="Overwrite Location To", description="Overwrite the account segment Location From with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Loc To", fieldLength=1)
	overwriteLocTo,
	//
	@FlyElement(columnName="OverwriteOrg", name="Overwrite Organization", description="Overwrite the account segment Organization with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Org", fieldLength=1)
	overwriteOrg,
	//
	@FlyElement(columnName="OverwriteOrgTrx", name="Overwrite Trx Organuzation", description="Overwrite the account segment Transaction Organization with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Trx Org", fieldLength=1)
	overwriteOrgTrx,
	//
	@FlyElement(columnName="OverwritePostingType", name="Overwrite Posting Type", description="Overwrite the posting type with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Posting Type", fieldLength=1)
	overwritePostingType,
	//
	@FlyElement(columnName="OverwritePriceLimit", name="Overwrite Price Limit", description="Overwrite Price Limit if the Price List  enforces the Price Limit", help="The Price List allows to enforce the Price Limit. If set, a user with this role can overwrite the price limit (i.e. enter any price).", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Price Limit", fieldLength=1)
	overwritePriceLimit,
	//
	@FlyElement(columnName="OverwriteProduct", name="Overwrite Product", description="Overwrite the account segment Product with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Product", fieldLength=1)
	overwriteProduct,
	//
	@FlyElement(columnName="OverwriteProject", name="Overwrite Project", description="Overwrite the account segment Project with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite Project", fieldLength=1)
	overwriteProject,
	//
	@FlyElement(columnName="OverwriteSalesRegion", name="Overwrite Sales Region", description="Overwrite the account segment Sales Region with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite SalesRegion", fieldLength=1)
	overwriteSalesRegion,
	//
	@FlyElement(columnName="OverwriteUser1", name="Overwrite User1", description="Overwrite the account segment User 1 with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite User1", fieldLength=1)
	overwriteUser1,
	//
	@FlyElement(columnName="OverwriteUser2", name="Overwrite User2", description="Overwrite the account segment User 2 with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite User2", fieldLength=1)
	overwriteUser2,
	//
	@FlyElement(columnName="OverwriteUser3", name="Overwrite User3", description="Overwrite the account segment User 3 with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite User3", fieldLength=1)
	overwriteUser3,
	//
	@FlyElement(columnName="OverwriteUser4", name="Overwrite User4", description="Overwrite the account segment User 4 with the value specified", help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.", dataType=FlyDataType.YesNo, entityType="D", printName="Overwrite User4", fieldLength=1)
	overwriteUser4,
	//
	@FlyElement(columnName="PA_Achievement_ID", name="成果", description="经营成果", help="The Achievement identifies a unique task that is part of an overall performance goal.", dataType=FlyDataType.ID, entityType="D", printName="成果", fieldLength=22)
	pAAchievementID,
	//
	@FlyElement(columnName="PAAmountType", name="Amount Type", description="PA Amount Type for reporting", help="The amount type to report on: Quantity, Credit Only, Debit Only, Balance (expected sign) or Balance (accounted sign). 'Expected sign' adjusts the sign of the result based on the Account Type and Expected Sign of each Account Element, whereas 'accounted sign' always returns DR-CR.", dataType=FlyDataType.List, entityType="D", printName="Amount Type", fieldLength=1)
	pAAmountType,
	//
	@FlyElement(columnName="PA_BenchmarkData_ID", name="Benchmark Data", description="Performance Benchmark Data Point", help="Data Series Point to compare internal performance with (e.g. stock price, ...)", dataType=FlyDataType.ID, entityType="D", printName="Benchmark Data", fieldLength=10)
	pABenchmarkDataID,
	//
	@FlyElement(columnName="PA_Benchmark_ID", name="Benchmark", description="Performance Benchmark", help="Data Series to compare internal performance with (e.g. stock price, ...)", dataType=FlyDataType.TableDirect, entityType="D", printName="Benchmark", fieldLength=10)
	pABenchmarkID,
	//
	@FlyElement(columnName="PA_ColorSchema_ID", name="Color Schema", description="Performance Color Schema", help="Visual representation of performance by color.  The Schema has often three levels (e.g. red-yellow-green).  Adempiere support two levels (e.g. red-green) or four levels (e.g. gray-bronze-silver-gold).  Note that Measures without a goal are represented white.  The percentages could be between 0 and unlimited (i.e. above 100%).", dataType=FlyDataType.ID, entityType="D", printName="Color Schema", fieldLength=10)
	pAColorSchemaID,
	//
	@FlyElement(columnName="PA_DashboardContent_ID", name="Dashboard Content", dataType=FlyDataType.ID, entityType="D", printName="Dashboard Content", fieldLength=10)
	pADashboardContentID,
	//
	@FlyElement(columnName="PA_DocumentStatus_ID", name="Document Status Indicator", dataType=FlyDataType.NONE, entityType="D", printName="Document Status Indicator", fieldLength=0)
	pADocumentStatusID,
	//
	@FlyElement(columnName="PageSize", name="PageSize", dataType=FlyDataType.NONE, entityType="D", printName="PageSize", fieldLength=0)
	pageSize,
	//
	@FlyElement(columnName="PageURL", name="标明网址的页数", dataType=FlyDataType.URL, entityType="D", printName="标明网址的页数", fieldLength=120)
	pageURL,
	//
	@FlyElement(columnName="PA_Goal_ID", name="目标", description="经营目标", help="The Performance Goal indicates what this users performance will be measured against.", dataType=FlyDataType.ID, entityType="D", printName="目标", fieldLength=22)
	pAGoalID,
	//
	@FlyElement(columnName="PA_GoalParent_ID", name="Parent Goal", description="Parent Goal", help="You can create a hierarchy of goals by linking the sub-goals to the summary goal.	The measures are automatically rolled up", dataType=FlyDataType.Table, entityType="D", printName="Parent Goal", fieldLength=10)
	pAGoalParentID,
	//
	@FlyElement(columnName="PA_GoalRestriction_ID", name="Goal Restriction", description="Performance Goal Restriction", help="Restriction of the performance measure to the Organization, Business Partner or Product defined.	Example: The performance is only measured for HQ	The measure must support the data, otherwise it is ignored.", dataType=FlyDataType.ID, entityType="D", printName="Goal Restriction", fieldLength=10)
	pAGoalRestrictionID,
	//
	@FlyElement(columnName="PA_Hierarchy_ID", name="Reporting Hierarchy", description="Optional Reporting Hierarchy - If not selected the default hierarchy trees are used.", help="Reporting Hierarchy allows you to select different Hierarchies/Trees for the report.	Accounting Segments like Organization, Account, Product may have several hierarchies to accomodate different views on the business.", dataType=FlyDataType.ID, entityType="D", printName="Hierarchy", fieldLength=10)
	pAHierarchyID,
	//
	@FlyElement(columnName="PaidAmt", name="已支付金额", dataType=FlyDataType.Amount, entityType="D", printName="支付", fieldLength=22)
	paidAmt,
	//
	@FlyElement(columnName="PaidUntilDate", name="Paid Until", description="Subscription is paid/valid until this date", dataType=FlyDataType.Date, entityType="D", printName="Paid Until", fieldLength=7)
	paidUntilDate,
	//
	@FlyElement(columnName="PA_MeasureCalc_ID", name="测量计算", description="Calculation method for measuring performance", help="The Measure Calculation indicates the method of measuring performance.", dataType=FlyDataType.TableDirect, entityType="D", printName="测量计算", fieldLength=22)
	pAMeasureCalcID,
	//
	@FlyElement(columnName="PA_Measure_ID", name="度量", description="Concrete Performance Measurement", help="The Measure identifies a concrete, measurable indicator of performance.  For example, sales dollars, prospects contacted.", dataType=FlyDataType.TableDirect, entityType="D", printName="度量", fieldLength=22)
	pAMeasureID,
	//
	@FlyElement(columnName="PAPeriodType", name="Period Type", description="PA Period Type", help="The Period Type to report on: Period, Year, Total or Natural. Natural = Year for P & L accounts, Total for Balance Sheet accounts.", dataType=FlyDataType.List, entityType="D", printName="Period Type", fieldLength=1)
	pAPeriodType,
	//
	@FlyElement(columnName="ParameterDefault", name="Default Parameter", description="Default value of the parameter", help="The default value can be a variable like @#Date@ ", dataType=FlyDataType.String, entityType="D", printName="Default Parameter", fieldLength=255)
	parameterDefault,
	//
	@FlyElement(columnName="ParameterName", name="参数名字", dataType=FlyDataType.String, entityType="D", printName="参数名字", fieldLength=60)
	parameterName,
	//
	@FlyElement(columnName="ParameterType", name="Parameter Type", dataType=FlyDataType.NONE, entityType="D", printName="Parameter Type", fieldLength=0)
	parameterType,
	//
	@FlyElement(columnName="PA_RatioElement_ID", name="Ratio Element", description="Performance Ratio Element", help="Individual calculation instruction for a ratio", dataType=FlyDataType.ID, entityType="D", printName="Ratio Element", fieldLength=10)
	pARatioElementID,
	//
	@FlyElement(columnName="PA_Ratio_ID", name="Ratio", description="Performance Ratio", help="Calculation instruction set  for a performance ratio", dataType=FlyDataType.TableDirect, entityType="D", printName="Ratio", fieldLength=10)
	pARatioID,
	//
	@FlyElement(columnName="PA_RatioUsed_ID", name="Ratio Used", description="Performance Ratio Used", help="Existing Performance Ratio to be used in the calculation.  Make sure that the Ratio is not self-referencing (loop).", dataType=FlyDataType.Table, entityType="D", printName="Ratio Used", fieldLength=10)
	pARatioUsedID,
	//
	@FlyElement(columnName="Parent_Column_ID", name="Parent Column", description="The link column on the parent tab.", dataType=FlyDataType.Table, entityType="D", printName="Parent Column", fieldLength=22)
	parentColumnID,
	//
	@FlyElement(columnName="ParentElementValue_ID", name="父类帐户", description="父类帐户", dataType=FlyDataType.Table, entityType="D", printName="父类帐户", fieldLength=22)
	parentElementValueID,
	//
	@FlyElement(columnName="Parent_ID", name="父类", description="实体的父类", help="The Parent indicates the value used to represent a summary level or report to level for a record", dataType=FlyDataType.ID, entityType="D", printName="父类", fieldLength=22)
	parentID,
	//
	@FlyElement(columnName="ParentMenu_ID", name="Parent Menu", dataType=FlyDataType.Table, entityType="D", printName="Parent Menu", fieldLength=10)
	parentMenuID,
	//
	@FlyElement(columnName="Parent_Org_ID", name="上级机构", description="上级(管理)机构", help="Parent Organization - the next level in the organizational hierarchy.", dataType=FlyDataType.Table, entityType="D", printName="上级机构", fieldLength=22)
	parentOrgID,
	//
	@FlyElement(columnName="Parent_Tax_ID", name="父类税", description="Parent Tax indicates a tax that is made up of multiple taxes", help="The Parent Tax indicates a tax that is a reference for multiple taxes.  This allows you to charge multiple taxes on a document by entering the Parent Tax", dataType=FlyDataType.Table, entityType="D", printName="父类税", fieldLength=22)
	parentTaxID,
	//
	@FlyElement(columnName="ParentValue", name="父类关键字", description="是否父类关键字", dataType=FlyDataType.String, entityType="D", printName="父类关键字", fieldLength=40)
	parentValue,
	//
	@FlyElement(columnName="PA_ReportColumn_ID", name="报表列", description="在报表中的列", dataType=FlyDataType.ID, entityType="D", printName="报表列", fieldLength=22)
	pAReportColumnID,
	//
	@FlyElement(columnName="PA_ReportColumnSet_ID", name="报表列组合", description="Collection of Columns for Report", help="The Report Column Set identifies the columns used in a Report.", dataType=FlyDataType.TableDirect, entityType="D", printName="报表列组合", fieldLength=22)
	pAReportColumnSetID,
	//
	@FlyElement(columnName="PA_ReportCube_ID", name="Report Cube", description="Define reporting cube for pre-calculation of summary accounting data.", help="Summary data will be generated for each period of the selected calendar, grouped by the selected dimensions..", dataType=FlyDataType.ID, entityType="D", printName="Report Cube", fieldLength=22)
	pAReportCubeID,
	//
	@FlyElement(columnName="PA_Report_ID", name="财务报表", description="财务报表", dataType=FlyDataType.ID, entityType="D", printName="财务报表", fieldLength=22)
	pAReportID,
	//
	@FlyElement(columnName="PA_ReportLine_ID", name="报表行", dataType=FlyDataType.ID, entityType="D", printName="报表行", fieldLength=22)
	pAReportLineID,
	//
	@FlyElement(columnName="PA_ReportLineSet_ID", name="报表行组合", dataType=FlyDataType.TableDirect, entityType="D", printName="报表行组合", fieldLength=22)
	pAReportLineSetID,
	//
	@FlyElement(columnName="PA_ReportSource_ID", name="报表来源", description="Restriction of what will be shown in Report Line", dataType=FlyDataType.ID, entityType="D", printName="报表来源", fieldLength=22)
	pAReportSourceID,
	//
	@FlyElement(columnName="Parse", name="Parse Statement", description="Select if the SQL statement should be parsed based on terminating semi-colons.", help="Deselect if the SQL statement provided is a function definition (CREATE OR REPLACE FUNCTION...) rather than a collection of statements.  This prevents parsing of the function based on semi-colons which can occur in the function definition.  Also deselect this with single sql statements that have semi-colons in text within the statement.", dataType=FlyDataType.YesNo, entityType="D", printName="Parse", fieldLength=1)
	parse,
	//
	@FlyElement(columnName="PartnerID", name="业务伙伴ID", description="Partner ID for the Payment Processor", dataType=FlyDataType.String, entityType="D", printName="业务伙伴ID", fieldLength=60)
	partnerID,
	//
	@FlyElement(columnName="PA_SLA_Criteria_ID", name="SLA Criteria", description="Service Level Agreement Criteria", help="Criteria to measure service level agreements (e.g. Quality, Delivery meets Promised date, ..)", dataType=FlyDataType.ID, entityType="D", printName="SLA Criteria", fieldLength=22)
	pASLACriteriaID,
	//
	@FlyElement(columnName="PA_SLA_Goal_ID", name="SLA Goal", description="Service Level Agreement Goal", help="Goal for the SLA criteria for the Business Partner", dataType=FlyDataType.TableDirect, entityType="D", printName="SLA Goal", fieldLength=22)
	pASLAGoalID,
	//
	@FlyElement(columnName="PA_SLA_Measure_ID", name="SLA Measure", description="Service Level Agreement Measure", help="View/Maintain the individual actual value / measure for the business partner service level agreement goal", dataType=FlyDataType.ID, entityType="D", printName="SLA Measure", fieldLength=22)
	pASLAMeasureID,
	//
	@FlyElement(columnName="P_Asset_Acct", name="产品资产", description="Account for Product Asset (Inventory)", help="The Product Asset Account indicates the account used for valuing this a product in inventory.", dataType=FlyDataType.Account, entityType="D", printName="产品资产", fieldLength=22)
	pAssetAcct,
	//
	@FlyElement(columnName="Password", name="口令", description="任意长度的口令(区分大小写)", help="The Password indicates the Password for this User Id.  Passwords are required to identify authorized users.", dataType=FlyDataType.String, entityType="D", printName="口令", fieldLength=1024)
	password,
	//
	@FlyElement(columnName="PastDue1_30", name="Past Due 1-30", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 1-30", fieldLength=22)
	pastDue130,
	//
	@FlyElement(columnName="PastDue1_7", name="Past Due 1-7", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 1-7", fieldLength=22)
	pastDue17,
	//
	@FlyElement(columnName="PastDue31_60", name="Past Due 31-60", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 31-60", fieldLength=22)
	pastDue3160,
	//
	@FlyElement(columnName="PastDue31_Plus", name="Past Due > 31", dataType=FlyDataType.Amount, entityType="D", printName="Past Due > 31", fieldLength=22)
	pastDue31Plus,
	//
	@FlyElement(columnName="PastDue61_90", name="Past Due 61-90", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 61-90", fieldLength=22)
	pastDue6190,
	//
	@FlyElement(columnName="PastDue61_Plus", name="Past Due > 61", dataType=FlyDataType.Amount, entityType="D", printName="Past Due > 61", fieldLength=22)
	pastDue61Plus,
	//
	@FlyElement(columnName="PastDue8_30", name="Past Due 8-30", dataType=FlyDataType.Amount, entityType="D", printName="Past Due 8-30", fieldLength=22)
	pastDue830,
	//
	@FlyElement(columnName="PastDue91_Plus", name="Past Due > 91", dataType=FlyDataType.Amount, entityType="D", printName="Past Due > 91", fieldLength=22)
	pastDue91Plus,
	//
	@FlyElement(columnName="PastDueAmt", name="Past Due", dataType=FlyDataType.Amount, entityType="D", printName="Past Due", fieldLength=22)
	pastDueAmt,
	//
	@FlyElement(columnName="P_AverageCostVariance_Acct", name="Average Cost Variance", description="Average Cost Variance", help="The Average Cost Variance is used in weighted average costing to reflect differences when posting costs for negative inventory.", dataType=FlyDataType.Account, entityType="D", printName="Average Cost Variance", fieldLength=10)
	pAverageCostVarianceAcct,
	//
	@FlyElement(columnName="PayAmt", name="付款金额", description="正被支付的金额", help="Indicates the amount this payment is for.  The payment amount can be for single or multiple invoices or a partial payment for an invoice.", dataType=FlyDataType.Amount, entityType="D", printName="付款金额", fieldLength=22)
	payAmt,
	//
	@FlyElement(columnName="Pay_BPartner_ID", name="Payment BPartner", description="Business Partner responsible for the payment", dataType=FlyDataType.ID, entityType="D", printName="Payment BPartner", fieldLength=22)
	payBPartnerID,
	//
	@FlyElement(columnName="PayDate", name="付款日期", description="付款日期", help="The Payment Date indicates the date the payment was made.", dataType=FlyDataType.Date, entityType="D", printName="付款日期", fieldLength=7)
	payDate,
	//
	@FlyElement(columnName="PayDiscount_Exp_Acct", name="付款折扣费用", description="Payment Discount Expense Account", help="Indicates the account to be charged for payment discount expenses.", dataType=FlyDataType.Account, entityType="D", printName="支付折扣费用", fieldLength=22)
	payDiscountExpAcct,
	//
	@FlyElement(columnName="PayDiscount_Rev_Acct", name="付款折扣收入", description="Payment Discount Revenue Account", help="Indicates the account to be charged for payment discount revenues.", dataType=FlyDataType.Account, entityType="D", printName="支付折扣收入", fieldLength=22)
	payDiscountRevAcct,
	//
	@FlyElement(columnName="Pay_Location_ID", name="Payment Location", description="Location of the Business Partner responsible for the payment", dataType=FlyDataType.ID, entityType="D", printName="Payment Location", fieldLength=22)
	payLocationID,
	//
	@FlyElement(columnName="PaymentDocumentNo", name="Payment Document No", description="Document number of the Payment", dataType=FlyDataType.String, entityType="D", printName="Payment Document No", fieldLength=30)
	paymentDocumentNo,
	//
	@FlyElement(columnName="PaymentExportClass", name="Payment Export Class", dataType=FlyDataType.String, entityType="D", printName="Payment Export Class", fieldLength=60)
	paymentExportClass,
	//
	@FlyElement(columnName="PaymentRule", name="付款规则", description="你如何支付发票", help="The Payment Rule indicates the method of invoice payment.", dataType=FlyDataType.List, entityType="D", printName="付款规则", fieldLength=1)
	paymentRule,
	//
	@FlyElement(columnName="PaymentRulePO", name="付款规则", description="采购付款选项", help="The Payment Rule indicates the method of purchase payment.", dataType=FlyDataType.List, entityType="D", printName="付款规则", fieldLength=1)
	paymentRulePO,
	//
	@FlyElement(columnName="PaymentTerm", name="付款条款", description="付款条款", dataType=FlyDataType.String, entityType="D", printName="付款条款", fieldLength=60)
	paymentTerm,
	//
	@FlyElement(columnName="PaymentTermNote", name="付款条款注解", description="付款条款注解", dataType=FlyDataType.String, entityType="D", printName="付款条款注解", fieldLength=2000)
	paymentTermNote,
	//
	@FlyElement(columnName="PaymentTermValue", name="付款条款关键字", description="付款条款的关键字", dataType=FlyDataType.String, entityType="D", printName="付款条款关键字", fieldLength=40)
	paymentTermValue,
	//
	@FlyElement(columnName="PayProcessorClass", name="付款处理器类", description="付款处理器java类", help="Payment Processor class identifies the Java class used to process payments", dataType=FlyDataType.String, entityType="D", printName="付款处理器类", fieldLength=60)
	payProcessorClass,
	//
	@FlyElement(columnName="P_COGS_Acct", name="产品销售成本", description="Account for Cost of Goods Sold", help="The Product COGS Account indicates the account used when recording costs associated with this product.", dataType=FlyDataType.Account, entityType="D", printName="产品销售成本", fieldLength=22)
	pCOGSAcct,
	//
	@FlyElement(columnName="P_CostAdjustment_Acct", name="Cost Adjustment", description="Product Cost Adjustment Account", help="Account used for posting product cost adjustments (e.g. landed costs)", dataType=FlyDataType.Account, entityType="D", printName="Cost Adjustment", fieldLength=10)
	pCostAdjustmentAcct,
	//
	@FlyElement(columnName="P_Date", name="处理日期", dataType=FlyDataType.DateTime, entityType="D", printName="处理日期", fieldLength=7)
	pDate,
	//
	@FlyElement(columnName="P_Date_To", name="处理日期到", dataType=FlyDataType.DateTime, entityType="D", printName="P 约会到", fieldLength=7)
	pDateTo,
	//
	@FlyElement(columnName="p_DefaultConfidentiality", name="Confidentiality", description="Type of Confidentiality", dataType=FlyDataType.NONE, entityType="D", printName="Confidentiality", fieldLength=0)
	pDefaultConfidentiality,
	//
	@FlyElement(columnName="p_DefaultPriority", name="User Importance", description="Priority of the issue for the User", dataType=FlyDataType.NONE, entityType="D", printName="User Importance", fieldLength=0)
	pDefaultPriority,
	//
	@FlyElement(columnName="Percent", name="百分比", description="扣留百分比", help="The Percent indicates the percentage used for withholding.", dataType=FlyDataType.Number, entityType="D", printName="百分比", fieldLength=22)
	percent,
	//
	@FlyElement(columnName="Percentage", name="百分比", description="整个的金额百分比", help="Percentage of an amount (up to 100)", dataType=FlyDataType.Number, entityType="D", printName="百分比", fieldLength=22)
	percentage,
	//
	@FlyElement(columnName="PercentTotal", name="Total Percent", description="Sum of the Percent details ", dataType=FlyDataType.Number, entityType="D", printName="Total Percent", fieldLength=22)
	percentTotal,
	//
	@FlyElement(columnName="PeriodAction", name="会计期动作", description="该分期被采取的动作", help="The Period Action indicates the action to be taken for this period.  For example 'Close Period' or 'Open Period'.", dataType=FlyDataType.List, entityType="D", printName="会计期动作", fieldLength=1)
	periodAction,
	//
	@FlyElement(columnName="PeriodNo", name="会计期号", description="唯一的分期数字", help="The Period No identifies a specific period for this year. Each period is defined by a start and end date.  Date ranges for a calendar and year cannot overlap.", dataType=FlyDataType.Integer, entityType="D", printName="会计期号", fieldLength=22)
	periodNo,
	//
	@FlyElement(columnName="Period_OpenFuture", name="未来天数", description="Number of days to be able to post to a future date (based on system date)", help="If Automatic Period Control is enabled, the current period is calculated based on the system date and you can always post to all days in the current period.  Future Days enable to post to future periods. E.g. today is Apr 15th and Future Days is set to 30, you can post up to May 15th", dataType=FlyDataType.Integer, entityType="D", printName="未来天数", fieldLength=22)
	periodOpenFuture,
	//
	@FlyElement(columnName="Period_OpenHistory", name="历史天数", description="Number of days to be able to post in the past (based on system date)", help="If Automatic Period Control is enabled, the current period is calculated based on the system date and you can always post to all days in the current period.  History Days enable to post to previous periods.  E.g. today is May 15th and History Days is set to 30, you can post back to April 15th", dataType=FlyDataType.Integer, entityType="D", printName="历史天数", fieldLength=22)
	periodOpenHistory,
	//
	@FlyElement(columnName="PeriodStatus", name="会计期状态", description="该分期当前状态", help="The Period Status indicates the current status for this period.  For example 'Closed', 'Open', 'Never Opened'.", dataType=FlyDataType.List, entityType="D", printName="会计期状态", fieldLength=1)
	periodStatus,
	//
	@FlyElement(columnName="PeriodType", name="会计期类型", description="会计期类型", help="The Period Type indicates the type (Standard or Adjustment) of period.", dataType=FlyDataType.List, entityType="D", printName="会计期类型", fieldLength=1)
	periodType,
	//
	@FlyElement(columnName="p_ErrorFolder", name="Error Folder", dataType=FlyDataType.NONE, entityType="D", printName="Error Folder", fieldLength=0)
	pErrorFolder,
	//
	@FlyElement(columnName="P_Expense_Acct", name="产品费用", description="产品费用帐户", help="The Product Expense Account indicates the account used to record expenses associated with this product.", dataType=FlyDataType.Account, entityType="D", printName="产品费用", fieldLength=22)
	pExpenseAcct,
	//
	@FlyElement(columnName="Phone", name="电话", description="电话号码", help="The Phone field identifies a telephone number", dataType=FlyDataType.String, entityType="D", printName="电话", fieldLength=40)
	phone,
	//
	@FlyElement(columnName="Phone2", name="可选电话", description="Identifies an alternate telephone number.", help="The 2nd Phone field identifies an alternate telephone number.", dataType=FlyDataType.String, entityType="D", printName="可选电话", fieldLength=40)
	phone2,
	//
	@FlyElement(columnName="PickDate", name="自提日期", description="Date Time when picked for Shipment", dataType=FlyDataType.DateTime, entityType="D", printName="自提日期", fieldLength=7)
	pickDate,
	//
	@FlyElement(columnName="PickedQty", name="Picked Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Picked Quantity", fieldLength=22)
	pickedQty,
	//
	@FlyElement(columnName="P_ID", name="处理ID", dataType=FlyDataType.ID, entityType="D", printName="P ID", fieldLength=22)
	pID,
	//
	@FlyElement(columnName="p_IMAPHost", name="IMAP Host", dataType=FlyDataType.NONE, entityType="D", printName="IMAP Host", fieldLength=0)
	pIMAPHost,
	//
	@FlyElement(columnName="p_IMAPPwd", name="IMAP Password", dataType=FlyDataType.NONE, entityType="D", printName="IMAP Password", fieldLength=0)
	pIMAPPwd,
	//
	@FlyElement(columnName="p_IMAPUser", name="IMAP User", dataType=FlyDataType.NONE, entityType="D", printName="IMAP User", fieldLength=0)
	pIMAPUser,
	//
	@FlyElement(columnName="PIN", name="PIN", description="Personal Identification Number", dataType=FlyDataType.String, entityType="D", printName="PIN", fieldLength=20)
	pIN,
	//
	@FlyElement(columnName="p_InboxFolder", name="Inbox Folder", dataType=FlyDataType.NONE, entityType="D", printName="Inbox Folder", fieldLength=0)
	pInboxFolder,
	//
	@FlyElement(columnName="PINEntryTimeout", name="PIN Entry Timeout", description="PIN Entry Timeout - the amount of time from initial display until the PIN entry dialog times out, in milliseconds.", dataType=FlyDataType.Integer, entityType="D", printName="PIN Entry Timeout", fieldLength=22)
	pINEntryTimeout,
	//
	@FlyElement(columnName="P_InventoryClearing_Acct", name="Inventory Clearing", description="Product Inventory Clearing Account", help="Account used for posting matched product (item) expenses (e.g. AP Invoice, Invoice Match).  You would use a different account then Product Expense, if you want to differentiate service related costs from item related costs. The balance on the clearing account should be zero and accounts for the timing difference between invoice receipt and matching.", dataType=FlyDataType.Account, entityType="D", printName="Inventory Clearing", fieldLength=10)
	pInventoryClearingAcct,
	//
	@FlyElement(columnName="P_InvoicePriceVariance_Acct", name="发票价格差额", description="Difference between Costs and Invoice Price (IPV)", help="The Invoice Price Variance is used reflects the difference between the current Costs and the Invoice Price.", dataType=FlyDataType.Account, entityType="D", printName="发票价格差额", fieldLength=22)
	pInvoicePriceVarianceAcct,
	//
	@FlyElement(columnName="PJ_Asset_Acct", name="项目资产", description="项目资产帐户", help="The Project Asset account is the account used as the final asset account in capital projects", dataType=FlyDataType.Account, entityType="D", printName="项目资产", fieldLength=22)
	pJAssetAcct,
	//
	@FlyElement(columnName="PJ_WIP_Acct", name="进步的任务", description="在建工程帐户", help="The Work in Process account is the account used in capital projects until the project is completed", dataType=FlyDataType.Account, entityType="D", printName="WIP 帐户", fieldLength=22)
	pJWIPAcct,
	//
	@FlyElement(columnName="PK_Status", name="PK_Status", dataType=FlyDataType.String, entityType="D", printName="PK_Status", fieldLength=44)
	pKStatus,
	//
	@FlyElement(columnName="PK_Version", name="Package Version", dataType=FlyDataType.String, entityType="D", printName="Package Version", fieldLength=40)
	pKVersion,
	//
	@FlyElement(columnName="PlannedAmt", name="已计划金额", description="Planned amount for this project", help="The Planned Amount indicates the anticipated amount for this project or project line.", dataType=FlyDataType.Amount, entityType="D", printName="已计划 Amt", fieldLength=22)
	plannedAmt,
	//
	@FlyElement(columnName="PlannedMargin", name="已计划差额 %", description="Project's planned margin as a percentage", help="The Planned Margin Percentage indicates the anticipated margin percentage for this project or project line", dataType=FlyDataType.Number, entityType="D", printName="Planned Margin", fieldLength=22)
	plannedMargin,
	//
	@FlyElement(columnName="PlannedMarginAmt", name="已计划差额", description="Project's planned margin amount", help="The Planned Margin Amount indicates the anticipated margin amount for this project or project line.", dataType=FlyDataType.Amount, entityType="D", printName="已计划差额", fieldLength=22)
	plannedMarginAmt,
	//
	@FlyElement(columnName="PlannedPrice", name="已计划价格", description="Planned price for this project line", help="The Planned Price indicates the anticipated price for this project line.", dataType=FlyDataType.CostsPrices, entityType="D", printName="已计划价格", fieldLength=22)
	plannedPrice,
	//
	@FlyElement(columnName="PlannedProductionReport", name="Generate Planned Production Report", dataType=FlyDataType.Button, entityType="D", printName="Generate Planned Production Report", fieldLength=1)
	plannedProductionReport,
	//
	@FlyElement(columnName="PlannedQty", name="已计划数量", description="Planned quantity for this project", help="The Planned Quantity indicates the anticipated quantity for this project or project line", dataType=FlyDataType.Quantity, entityType="D", printName="已计划数量", fieldLength=22)
	plannedQty,
	//
	@FlyElement(columnName="PlatformInfo", name="Platform Info", description="Information about Server and Client Platform", help="Include information on Server, Network [Operating System, RAM, Disk, CPUs] and (number of) Clients.", dataType=FlyDataType.Text, entityType="D", printName="Platform", fieldLength=255)
	platformInfo,
	//
	@FlyElement(columnName="P_Msg", name="信息处理", dataType=FlyDataType.String, entityType="D", printName="P Msg", fieldLength=2000)
	pMsg,
	//
	@FlyElement(columnName="P_Number", name="程序号", dataType=FlyDataType.Number, entityType="D", printName="程序号", fieldLength=22)
	pNumber,
	//
	@FlyElement(columnName="P_Number_To", name="程序数字到", dataType=FlyDataType.Number, entityType="D", printName="目标程序号", fieldLength=22)
	pNumberTo,
	//
	@FlyElement(columnName="PO_Description", name="采购定单描述", description="在采购定单屏幕中的描述", dataType=FlyDataType.String, entityType="D", printName="采购定单描述", fieldLength=255)
	pODescription,
	//
	@FlyElement(columnName="PO_DiscountSchema_ID", name="采购定单折扣模式", description="Schema to calculate the purchase trade discount percentage", dataType=FlyDataType.Table, entityType="D", printName="采购定单折扣模式", fieldLength=22)
	pODiscountSchemaID,
	//
	@FlyElement(columnName="PO_Help", name="采购定单帮助", description="帮助为采购定单审查", dataType=FlyDataType.Text, entityType="D", printName="采购定单帮助", fieldLength=2000)
	pOHelp,
	//
	@FlyElement(columnName="PO_Name", name="采购定单名字", description="采购定单屏幕上的名字", dataType=FlyDataType.String, entityType="D", printName="采购定单名字", fieldLength=60)
	pOName,
	//
	@FlyElement(columnName="PONum", name="采购定单数字", description="采购定单数字", help="The PO Number indicates the number assigned to a purchase order", dataType=FlyDataType.String, entityType="D", printName="采购定单数字", fieldLength=60)
	pONum,
	//
	@FlyElement(columnName="PO_PaymentTerm_ID", name="采购定单付款条款", description="Payment rules for a purchase order", help="The PO Payment Term indicates the payment term that will be used when this purchase order becomes an invoice.", dataType=FlyDataType.Table, entityType="D", printName="采购定单付款条款", fieldLength=22)
	pOPaymentTermID,
	//
	@FlyElement(columnName="PO_PriceList_ID", name="采购价目表", description="Price List used by this Business Partner", help="Identifies the price list used by a Vendor for products purchased by this organization.", dataType=FlyDataType.Table, entityType="D", printName="采购价目表", fieldLength=22)
	pOPriceListID,
	//
	@FlyElement(columnName="PO_PrintName", name="采购定单打印名字", description="Print name on PO Screens Reports", dataType=FlyDataType.String, entityType="D", printName="采购定单打印", fieldLength=60)
	pOPrintName,
	//
	@FlyElement(columnName="POReference", name="定单引用", description="Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner", help="The business partner order reference is the order reference for this specific transaction; Often Purchase Order numbers are given to print on Invoices for easier reference.  A standard number can be defined in the Business Partner (Customer) window.", dataType=FlyDataType.String, entityType="D", printName="定单引用", fieldLength=20)
	pOReference,
	//
	@FlyElement(columnName="Position", name="Position", dataType=FlyDataType.String, entityType="D", printName="Position", fieldLength=10)
	position,
	//
	@FlyElement(columnName="POSKeyLayoutType", name="POS Key Layout Type", description="The type of Key Layout", help="Keyboard: used for POS text field on screen keyboard	Numberpad: used for POS numeric field on screen numberpad	Product: used to quickly add products to POS order", dataType=FlyDataType.List, entityType="D", printName="POS Key Layout Type", fieldLength=1)
	pOSKeyLayoutType,
	//
	@FlyElement(columnName="PosPeriodName", name="Pos Period Name", dataType=FlyDataType.NONE, entityType="D", printName="Pos Period Name", fieldLength=0)
	posPeriodName,
	//
	@FlyElement(columnName="PostActual", name="过帐实际值", description="可过帐实际值", help="The Post Actual indicates if actual values can be posted to this element value.", dataType=FlyDataType.YesNo, entityType="D", printName="过帐实际值", fieldLength=1)
	postActual,
	//
	@FlyElement(columnName="Postal", name="邮编", description="邮政编码", help="The Postal Code field identifies the postal code for this entity's address.", dataType=FlyDataType.String, entityType="D", printName="邮编", fieldLength=10)
	postal,
	//
	@FlyElement(columnName="Postal_Add", name="-", description="附加的邮政编码", help="The Additional ZIP or Postal Code identifies, if appropriate, any additional Postal Code information.", dataType=FlyDataType.String, entityType="D", printName="-", fieldLength=10)
	postalAdd,
	//
	@FlyElement(columnName="Postal_To", name="ZIP To", description="Postal code to", help="Conecutive range to", dataType=FlyDataType.String, entityType="D", printName="ZIP To", fieldLength=10)
	postalTo,
	//
	@FlyElement(columnName="PostBudget", name="过帐预算", description="预算值可被过帐", help="The Post Budget indicates if budget values can be posted to this element value.", dataType=FlyDataType.YesNo, entityType="D", printName="过帐预算", fieldLength=1)
	postBudget,
	//
	@FlyElement(columnName="Posted", name="已过帐", description="过帐状态", help="The Posted field indicates the status of the Generation of General Ledger Accounting Lines ", dataType=FlyDataType.Button, entityType="D", printName="已过帐", fieldLength=1)
	posted,
	//
	@FlyElement(columnName="PostEncumbrance", name="过帐债权", description="Post commitments to this account", dataType=FlyDataType.YesNo, entityType="D", printName="过帐债权", fieldLength=1)
	postEncumbrance,
	//
	@FlyElement(columnName="PostingType", name="过帐类型", description="The type of amount that this journal updated", help="The Posting Type indicates the type of amount (Actual, Encumbrance, Budget) this journal updated.", dataType=FlyDataType.List, entityType="D", printName="过帐类型", fieldLength=1)
	postingType,
	//
	@FlyElement(columnName="PostProcessing", name="动作 SQL 划处理", description="Process Row by Row (not Set processing)", dataType=FlyDataType.Text, entityType="D", printName="动作 SQL 划处理", fieldLength=2000)
	postProcessing,
	//
	@FlyElement(columnName="PostStatistical", name="过帐统计数量", description="Post statistical quantities to this account?", dataType=FlyDataType.YesNo, entityType="D", printName="过帐统计数量", fieldLength=1)
	postStatistical,
	//
	@FlyElement(columnName="PotentialLifeTimeValue", name="潜在价值", description="总收入预期", help="The Potential Life Time Value is the anticipated revenue to be generated by this Business Partner.", dataType=FlyDataType.Amount, entityType="D", printName="潜在价值", fieldLength=22)
	potentialLifeTimeValue,
	//
	@FlyElement(columnName="PO_Window_ID", name="采购定单视窗", description="采购定单视窗", help="Window for Purchase Order (AP) Zooms", dataType=FlyDataType.Table, entityType="D", printName="采购定单视窗", fieldLength=22)
	pOWindowID,
	//
	@FlyElement(columnName="P_PurchasePriceVariance_Acct", name="采购价格差额", description="Difference between Standard Cost and Purchase Price (PPV)", help="The Purchase Price Variance is used in Standard Costing. It reflects the difference between the Standard Cost and the Purchase Order Price.", dataType=FlyDataType.Account, entityType="D", printName="采购价格差额", fieldLength=22)
	pPurchasePriceVarianceAcct,
	//
	@FlyElement(columnName="PPVOffset_Acct", name="PPV 抵销", description="Purchase Price Variance Offset Account", help="Offset account for standard costing purchase price variances. The counter account is Product PPV.", dataType=FlyDataType.Account, entityType="D", printName="PPV 抵销", fieldLength=22)
	pPVOffsetAcct,
	//
	@FlyElement(columnName="PreferenceType", name="Preference Level", description="Determines what preferences the user can set", help="Preferences allow you to define default values.  If set to None, you cannot set any preference nor value preference. Only if set to Client, you can see the Record Info Change Log.", dataType=FlyDataType.List, entityType="D", printName="Preference Level", fieldLength=1)
	preferenceType,
	//
	@FlyElement(columnName="PreferredWidth", name="Preferred Width", description="Preferred width in pixels", dataType=FlyDataType.Integer, entityType="D", printName="Preferred Width", fieldLength=10)
	preferredWidth,
	//
	@FlyElement(columnName="Prefix", name="前缀", description="Prefix before the sequence number", help="The Prefix indicates the characters to print in front of the document number.", dataType=FlyDataType.String, entityType="D", printName="前缀", fieldLength=255)
	prefix,
	//
	@FlyElement(columnName="PrePeriodName", name="Pre Period Name", dataType=FlyDataType.NONE, entityType="D", printName="Pre Period Name", fieldLength=0)
	prePeriodName,
	//
	@FlyElement(columnName="PreProcessing", name="动作 SQL 设定处理", description="Process SQL Set (not row-by-row)", dataType=FlyDataType.Text, entityType="D", printName="动作 SQL 设定处理", fieldLength=2000)
	preProcessing,
	//
	@FlyElement(columnName="p_RequestFolder", name="Request Folder", dataType=FlyDataType.NONE, entityType="D", printName="Request Folder", fieldLength=0)
	pRequestFolder,
	//
	@FlyElement(columnName="P_Revenue_Acct", name="产品收入", description="Account for Product Revenue (Sales Account)", help="The Product Revenue Account indicates the account used for recording sales revenue for this product.", dataType=FlyDataType.Account, entityType="D", printName="产品收入", fieldLength=22)
	pRevenueAcct,
	//
	@FlyElement(columnName="Price", name="价格", description="价格", help="The Price indicates the Price for a product or service.", dataType=FlyDataType.CostsPrices, entityType="D", printName="价格", fieldLength=22)
	price,
	//
	@FlyElement(columnName="PriceActual", name="单位价格", description="实际价格 ", help="The Actual or Unit Price indicates the Price for a product in source currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="单价", fieldLength=22)
	priceActual,
	//
	@FlyElement(columnName="PriceCost", name="Cost Price", description="Price per Unit of Measure including all indirect costs (Freight, etc.)", help="Optional Purchase Order Line cost price.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Cost Price", fieldLength=22)
	priceCost,
	//
	@FlyElement(columnName="PriceEffective", name="有效的日期价格", description="有效的日期价格", help="The Price Effective indicates the date this price is for. This allows you to enter future prices for products which will become effective when appropriate.", dataType=FlyDataType.Date, entityType="D", printName="有效的", fieldLength=7)
	priceEffective,
	//
	@FlyElement(columnName="PriceEntered", name="Price", description="Price Entered - the price based on the selected UoM", help="The price entered is converted to the actual price based on the UoM conversion", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price", fieldLength=22)
	priceEntered,
	//
	@FlyElement(columnName="PriceEnteredList", name="List Prive", description="Entered List Price", help="Price List converted to entered UOM", dataType=FlyDataType.CostsPrices, entityType="D", printName="List Price", fieldLength=22)
	priceEnteredList,
	//
	@FlyElement(columnName="PriceInvoiced", name="Price Invoiced", description="The priced invoiced to the customer (in the currency of the customer's AR price list) - 0 for default price", help="The invoiced price is derived from the Invoice Price entered and can be overwritten.  If the price is 0, the default price on the customer's invoice is used.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price Invoiced", fieldLength=22)
	priceInvoiced,
	//
	@FlyElement(columnName="PriceLastInv", name="最近发票价格", description="Price of the last invoice for the product", help="The Last Invoice Price indicates the last price paid (per the invoice) for this product.", dataType=FlyDataType.CostsPrices, entityType="D", printName="最近发票价格", fieldLength=22)
	priceLastInv,
	//
	@FlyElement(columnName="PriceLastPO", name="最近采购定单价格", description="Price of the last purchase order for the product", help="The Last PO Price indicates the last price paid (per the purchase order) for this product.", dataType=FlyDataType.CostsPrices, entityType="D", printName="最近采购定单价格", fieldLength=22)
	priceLastPO,
	//
	@FlyElement(columnName="PriceLimit", name="限制价格", description="产品的最低价格", help="The Price Limit indicates the lowest price for a product stated in the Price List Currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="限制价格", fieldLength=22)
	priceLimit,
	//
	@FlyElement(columnName="PriceLimitAmt", name="限制价格值", description="有限制价格的值", dataType=FlyDataType.CostsPrices, entityType="D", printName="限制价格值", fieldLength=22)
	priceLimitAmt,
	//
	@FlyElement(columnName="PriceList", name="公开报价", description="公开报价", help="The List Price is the official List Price in the document currency.", dataType=FlyDataType.CostsPrices, entityType="D", printName="公开报价", fieldLength=22)
	priceList,
	//
	@FlyElement(columnName="PriceListAmt", name="列表价格", description="附价格列表估价", dataType=FlyDataType.CostsPrices, entityType="D", printName="列表价格", fieldLength=22)
	priceListAmt,
	//
	@FlyElement(columnName="PriceMatchDifference", name="Price Match Difference", description="Difference between Purchase and Invoice Price per matched line", help="The difference between purchase and invoice price may be used for requiring explicit approval if a Price Match Tolerance is defined on Business Partner Group level.", dataType=FlyDataType.Amount, entityType="D", printName="Price Match Difference", fieldLength=22)
	priceMatchDifference,
	//
	@FlyElement(columnName="PriceMatchTolerance", name="Price Match Tolerance", description="PO-Invoice Match Price Tolerance in percent of the purchase price", help="Tolerance in Percent of matching the purchase order price to the invoice price.  The difference is posted as Invoice Price Tolerance for Standard Costing.  If defined, the PO-Invoice match must be explicitly approved, if the matching difference is greater then the tolerance.<br>	Example: if the purchase price is $100 and the tolerance is 1 (percent), the invoice price must be between $99 and 101 to be automatically approved.", dataType=FlyDataType.Number, entityType="D", printName="Price Match Tolerance", fieldLength=22)
	priceMatchTolerance,
	//
	@FlyElement(columnName="PriceOverrideType", name="Price Override Type", description="Type of price override, fixed price or discount off list", dataType=FlyDataType.List, entityType="D", printName="Price Override Type", fieldLength=1)
	priceOverrideType,
	//
	@FlyElement(columnName="PricePO", name="采购定单价格", description="基于采购定单的价格", help="The PO Price indicates the price for a product per the purchase order.", dataType=FlyDataType.CostsPrices, entityType="D", printName="采购定单价格", fieldLength=22)
	pricePO,
	//
	@FlyElement(columnName="PricePOAmt", name="采购定单价格", description="附采购定单估价", dataType=FlyDataType.CostsPrices, entityType="D", printName="采购定单价格", fieldLength=22)
	pricePOAmt,
	//
	@FlyElement(columnName="PricePrecision", name="Price Precision", description="Precision (number of decimals) for the Price", help="The prices of the price list are rounded to the precision entered.  This allows to have prices with below currency precision, e.g. $0.005. Enter the number of decimals or -1 for no rounding.", dataType=FlyDataType.Integer, entityType="D", printName="Price Precision", fieldLength=22)
	pricePrecision,
	//
	@FlyElement(columnName="PriceReimbursed", name="Price Reimbursed", description="The reimbursed price (in currency of the employee's AP price list)", help="The reimbursed price is derived from the converted price and can be overwritten when approving the expense report.", dataType=FlyDataType.CostsPrices, entityType="D", printName="Price Reimbursed", fieldLength=22)
	priceReimbursed,
	//
	@FlyElement(columnName="PriceStd", name="标准价格", description="标准价格", help="The Standard Price indicates the standard or normal price for a product on this price list", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准价格", fieldLength=22)
	priceStd,
	//
	@FlyElement(columnName="PriceStdAmt", name="标准价格", description="附标准的价格估价", dataType=FlyDataType.CostsPrices, entityType="D", printName="标准价格", fieldLength=22)
	priceStdAmt,
	//
	@FlyElement(columnName="PrintAreaType", name="区域", description="打印区域", help="打印该项目的区域", dataType=FlyDataType.List, entityType="D", printName="区域", fieldLength=1)
	printAreaType,
	//
	@FlyElement(columnName="PrintDocument", name="Print Document", description="Document to print", dataType=FlyDataType.NONE, entityType="D", printName="Print Document", fieldLength=0)
	printDocument,
	//
	@FlyElement(columnName="PrinterName", name="打印机名", description="打印机的名字", help="Internal (Opereating System) Name of the Printer; Please mote that the printer name may be different on different clients. Enter a printer name, which applies to ALL clients (e.g. printer on a server). <p>	If none is entered, the default printer is used. You specify your default printer when you log in. You can also change the default printer in Preferences.", dataType=FlyDataType.String, entityType="D", printName="打印机名", fieldLength=40)
	printerName,
	//
	@FlyElement(columnName="PrintFormatType", name="格式类型", description="打印格式类型", help="The print format type determines what will be printed.", dataType=FlyDataType.List, entityType="D", printName="格式类型", fieldLength=1)
	printFormatType,
	//
	@FlyElement(columnName="PrintName", name="打印文本", description="The label text to be printed on a document or correspondence.", help="The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters.", dataType=FlyDataType.String, entityType="D", printName="文本", fieldLength=60)
	printName,
	//
	@FlyElement(columnName="PrintNameSuffix", name="打印标签后缀", description="The label text to be printed on a document or correspondence after the field", help="The Label to be printed indicates the name that will be printed on a document or correspondence after the field. The max length is 60 characters.", dataType=FlyDataType.String, entityType="D", printName="标签后缀", fieldLength=60)
	printNameSuffix,
	//
	@FlyElement(columnName="PrintUnprocessedOnly", name="Print Unprocessed Entries Only", dataType=FlyDataType.NONE, entityType="D", printName="Print Unprocessed Entries Only", fieldLength=0)
	printUnprocessedOnly,
	//
	@FlyElement(columnName="Priority", name="优先权", description="Indicates if this request is of a high, medium or low priority.", help="The Priority indicates the importance of this request.", dataType=FlyDataType.List, entityType="D", printName="优先权", fieldLength=1)
	priority,
	//
	@FlyElement(columnName="PriorityBase", name="Priority Base", description="Base of Priority", help="When deriving the Priority from Importance, the Base is 'added' to the User Importance.", dataType=FlyDataType.List, entityType="D", printName="Priority Base", fieldLength=1)
	priorityBase,
	//
	@FlyElement(columnName="PriorityNo", name="相对优先权", description="Where inventory should be picked from first", help="The Relative Priority indicates the location to pick from first if an product is stored in more than one location.  (0 = highest priority)", dataType=FlyDataType.Integer, entityType="D", printName="相对优先权", fieldLength=22)
	priorityNo,
	//
	@FlyElement(columnName="PriorityRule", name="优先级", description="文件的优先级", help="The Priority indicates the importance (high, medium, low) of this document", dataType=FlyDataType.List, entityType="D", printName="优先级", fieldLength=1)
	priorityRule,
	//
	@FlyElement(columnName="PriorityUser", name="User Importance", description="Priority of the issue for the User", dataType=FlyDataType.List, entityType="D", printName="User Importance", fieldLength=1)
	priorityUser,
	//
	@FlyElement(columnName="PrivateNote", name="Private Note", description="Private Note - not visible to the other parties", dataType=FlyDataType.Text, entityType="D", printName="Private Note", fieldLength=2000)
	privateNote,
	//
	@FlyElement(columnName="Probability", name="Probability", dataType=FlyDataType.NONE, entityType="D", printName="Probability", fieldLength=0)
	probability,
	//
	@FlyElement(columnName="ProcCreate", name="产生", dataType=FlyDataType.Button, entityType="D", printName="产生", fieldLength=1)
	procCreate,
	//
	@FlyElement(columnName="ProcedureName", name="过程", description="Name of the Database Procedure", help="The Procedure indicates the name of the database procedure called by this report or process.", dataType=FlyDataType.String, entityType="D", printName="过程", fieldLength=60)
	procedureName,
	//
	@FlyElement(columnName="Processed", name="已处理", description="The document has been processed", help="The Processed checkbox indicates that a document has been processed.", dataType=FlyDataType.YesNo, entityType="D", printName="已处理", fieldLength=1)
	processed,
	//
	@FlyElement(columnName="ProcessedOn", name="Processed On", description="The date+time (expressed in decimal format) when the document has been processed", help="The ProcessedOn Date+Time save the exact moment (nanoseconds precision if allowed by the DB) when a document has been processed.", dataType=FlyDataType.Number, entityType="D", printName="Processed On", fieldLength=20)
	processedOn,
	//
	@FlyElement(columnName="Processing", name="现在处理", dataType=FlyDataType.Button, entityType="D", printName="现在处理", fieldLength=1)
	processing,
	//
	@FlyElement(columnName="ProcessingDate", name="处理日期", dataType=FlyDataType.Date, entityType="D", printName="处理日期", fieldLength=7)
	processingDate,
	//
	@FlyElement(columnName="Product", name="产品", dataType=FlyDataType.String, entityType="D", printName="产品", fieldLength=40)
	product,
	//
	@FlyElement(columnName="ProductAttribute", name="Product Attribute", description="Product Attribute Instance Description", dataType=FlyDataType.String, entityType="D", printName="Product Attribute", fieldLength=2000)
	productAttribute,
	//
	@FlyElement(columnName="Product_BOM_Value", name="Product BOM Key", description="Key of Product BOM", dataType=FlyDataType.String, entityType="D", printName="Product BOM Key", fieldLength=40)
	productBOMValue,
	//
	@FlyElement(columnName="ProductCategory_Value", name="产品分类关键字", dataType=FlyDataType.String, entityType="D", printName="产品分类关键字", fieldLength=40)
	productCategoryValue,
	//
	@FlyElement(columnName="ProductClassification_Value", name="Product Classification Key", description="The key value for the product classification", help="A product classification is a way to organize products", dataType=FlyDataType.String, entityType="D", printName="Product Classification Key", fieldLength=40)
	productClassificationValue,
	//
	@FlyElement(columnName="ProductClass_Value", name="Product Class Key", description="The key value for the product class", help="A product class is a way to organize products", dataType=FlyDataType.String, entityType="D", printName="Product Class Key", fieldLength=40)
	productClassValue,
	//
	@FlyElement(columnName="ProductColumn", name="产品列", description="Fully qualified Product column (M_Product_ID)", help="The Product Column indicates the product to use to use when calculating this measurement.", dataType=FlyDataType.String, entityType="D", printName="产品列", fieldLength=60)
	productColumn,
	//
	@FlyElement(columnName="ProductDescription", name="Product Description", description="Product Description", help="Description of the product", dataType=FlyDataType.String, entityType="D", printName="Prod Description", fieldLength=255)
	productDescription,
	//
	@FlyElement(columnName="ProductGroup_Value", name="Product Group Key", description="The key value for the product group", help="A product group is a way to organize products", dataType=FlyDataType.String, entityType="D", printName="Product Group Key", fieldLength=40)
	productGroupValue,
	//
	@FlyElement(columnName="ProductionInfo", name="Production Info", dataType=FlyDataType.String, entityType="D", printName="Production Info", fieldLength=60)
	productionInfo,
	//
	@FlyElement(columnName="ProductionQty", name="制造数量", description="Quantity of products to produce", help="The Production Quantity identifies the number of products to produce", dataType=FlyDataType.Quantity, entityType="D", printName="制造数量", fieldLength=22)
	productionQty,
	//
	@FlyElement(columnName="ProductName", name="Product Name", description="Name of the Product", dataType=FlyDataType.String, entityType="D", printName="Product Name", fieldLength=60)
	productName,
	//
	@FlyElement(columnName="ProductType", name="产品类型", description="产品的类型", help="The type of product also determines accounting consequences.", dataType=FlyDataType.List, entityType="D", printName="产品类型", fieldLength=1)
	productType,
	//
	@FlyElement(columnName="ProductValue", name="产品关键字", description="产品的关键字", dataType=FlyDataType.String, entityType="D", printName="产品关键字", fieldLength=40)
	productValue,
	//
	@FlyElement(columnName="ProfileInfo", name="Profile", description="Information to help profiling the system for solving support issues", help="Profile information do not contain sensitive information and are used to support issue detection and diagnostics", dataType=FlyDataType.String, entityType="D", printName="Profile", fieldLength=60)
	profileInfo,
	//
	@FlyElement(columnName="ProjectBalanceAmt", name="项目余额", description="项目总余额", help="The project balance is the sum of all invoices and payments", dataType=FlyDataType.Amount, entityType="D", printName="项目余额", fieldLength=22)
	projectBalanceAmt,
	//
	@FlyElement(columnName="ProjectCategory", name="Project Category", description="Project Category", help="The Project Category determines the behavior of the project:	General - no special accounting, e.g. for Presales or general tracking	Service - no special accounting, e.g. for Service/Charge projects	Work Order - creates Project/Job WIP transactions - ability to issue material	Asset - create Project Asset transactions - ability to issue material	", dataType=FlyDataType.List, entityType="D", printName="Project Category", fieldLength=1)
	projectCategory,
	//
	@FlyElement(columnName="ProjectLineLevel", name="Line Level", description="Project Line Level", help="Level on which Project Lines are maintained", dataType=FlyDataType.List, entityType="D", printName="Line Level", fieldLength=1)
	projectLineLevel,
	//
	@FlyElement(columnName="Project_MailText_ID", name="项目邮件本文", description="Standard text for Project EMails", help="Standard text for Project EMails", dataType=FlyDataType.Table, entityType="D", printName="项目邮件本文", fieldLength=22)
	projectMailTextID,
	//
	@FlyElement(columnName="ProjectName", name="Project", description="Name of the Project", dataType=FlyDataType.String, entityType="D", printName="Project", fieldLength=60)
	projectName,
	//
	@FlyElement(columnName="ProjectPhaseName", name="Project Phase", description="Name of the Project Phase", dataType=FlyDataType.String, entityType="D", printName="Project Phase", fieldLength=60)
	projectPhaseName,
	//
	@FlyElement(columnName="Project_PrintFormat_ID", name="项目打印格式", description="标准项目打印格式", help="标准项目打印格式", dataType=FlyDataType.Table, entityType="D", printName="项目打印格式", fieldLength=22)
	projectPrintFormatID,
	//
	@FlyElement(columnName="ProjectTypeName", name="Project Type", description="Name of the Project Type", dataType=FlyDataType.String, entityType="D", printName="Project Type", fieldLength=60)
	projectTypeName,
	//
	@FlyElement(columnName="ProjectValue", name="项目关键字", description="项目的关键字", dataType=FlyDataType.String, entityType="D", printName="项目关键字", fieldLength=40)
	projectValue,
	//
	@FlyElement(columnName="ProjInvoiceRule", name="Invoice Rule", description="Invoice Rule for the project", help="The Invoice Rule for the project determines how orders (and consequently invoices) are created.  The selection on project level can be overwritten on Phase or Task", dataType=FlyDataType.List, entityType="D", printName="Invoice Rule", fieldLength=1)
	projInvoiceRule,
	//
	@FlyElement(columnName="PromotionCode", name="Promotion Code", description="User entered promotion code at sales time", help="If present, user entered the promotion code at sales time to get this promotion", dataType=FlyDataType.String, entityType="D", printName="Promotion Code", fieldLength=30)
	promotionCode,
	//
	@FlyElement(columnName="PromotionCounter", name="Usage Counter", description="Usage counter", help="Counter to record how many times this promotion have been used", dataType=FlyDataType.Integer, entityType="D", printName="Usage Counter", fieldLength=22)
	promotionCounter,
	//
	@FlyElement(columnName="PromotionPriority", name="Relative Priority", description="Which promotion should be apply to a product", help="The relative priority indicate the promotion to use when a product exists in more than one promotion. Promotion with the highest priority take precedence.", dataType=FlyDataType.Integer, entityType="D", printName="Relative Priority", fieldLength=22)
	promotionPriority,
	//
	@FlyElement(columnName="PromotionUsageLimit", name="Usage Limit", description="Maximum usage limit", help="Maximum number of time this promotion can be use", dataType=FlyDataType.Integer, entityType="D", printName="Usage Limit", fieldLength=22)
	promotionUsageLimit,
	//
	@FlyElement(columnName="Protocol", name="Protocol", description="Protocol", dataType=FlyDataType.String, entityType="D", printName="Protocol", fieldLength=20)
	protocol,
	//
	@FlyElement(columnName="ProxyAddress", name="代理地址", description="代理服务器的地址", help="The Proxy Address must be defined if you must pass through a firewall to access your payment processor. ", dataType=FlyDataType.String, entityType="D", printName="代理地址", fieldLength=60)
	proxyAddress,
	//
	@FlyElement(columnName="ProxyLogon", name="代理注册", description="你的代理服务器注册", help="The Proxy Logon identifies the Logon ID for your proxy server.", dataType=FlyDataType.String, entityType="D", printName="代理注册", fieldLength=60)
	proxyLogon,
	//
	@FlyElement(columnName="ProxyPassword", name="代理密码", description="你的代理服务器的密码", help="The Proxy Password identifies the password for your proxy server.", dataType=FlyDataType.String, entityType="D", printName="代理密码", fieldLength=60)
	proxyPassword,
	//
	@FlyElement(columnName="ProxyPort", name="代理端口", description="你的代理服务器的港口", help="The Proxy Port identifies the port of your proxy server.", dataType=FlyDataType.Integer, entityType="D", printName="代理端口", fieldLength=22)
	proxyPort,
	//
	@FlyElement(columnName="P_String", name="Process String", dataType=FlyDataType.String, entityType="D", printName="P String", fieldLength=255)
	pString,
	//
	@FlyElement(columnName="P_String_To", name="Process String To", dataType=FlyDataType.String, entityType="D", printName="P_String_To", fieldLength=255)
	pStringTo,
	//
	@FlyElement(columnName="P_TradeDiscountGrant_Acct", name="批发折扣允许", description="Trade Discount Granted Account", help="The Trade Discount Granted Account indicates the account for granted trade discount in sales invoices", dataType=FlyDataType.Account, entityType="D", printName="批发折扣授与", fieldLength=22)
	pTradeDiscountGrantAcct,
	//
	@FlyElement(columnName="P_TradeDiscountRec_Acct", name="已收到批发折扣", description="Trade Discount Receivable Account", help="The Trade Discount Receivables Account indicates the account for received trade discounts in vendor invoices", dataType=FlyDataType.Account, entityType="D", printName="已收到批发折扣", fieldLength=22)
	pTradeDiscountRecAcct,
	//
	@FlyElement(columnName="PubDate", name="Publication Date", description="Date on which this article will / should get published", help="Date on which this article will / should get published", dataType=FlyDataType.DateTime, entityType="D", printName="Publication Date", fieldLength=7)
	pubDate,
	//
	@FlyElement(columnName="PublishRfQ", name="Publish RfQ", dataType=FlyDataType.Button, entityType="D", printName="Publish RfQ", fieldLength=1)
	publishRfQ,
	//
	@FlyElement(columnName="PublishStatus", name="发布状态", description="Status of Publication", help="Used for internal documentation", dataType=FlyDataType.List, entityType="D", printName="发布状态", fieldLength=1)
	publishStatus,
	//
	@FlyElement(columnName="QM_SpecificationLine_ID", name="QM Specification Line", dataType=FlyDataType.ID, entityType="D", printName="QM Specification Line", fieldLength=22)
	qMSpecificationLineID,
	//
	@FlyElement(columnName="Qty", name="数量", description="数量", help="The Quantity indicates the number of a specific product or item for this document.", dataType=FlyDataType.Amount, entityType="D", printName="数量", fieldLength=22)
	qty,
	//
	@FlyElement(columnName="QtyAvailable", name="Available Quantity", description="Available Quantity (On Hand - Reserved)", help="Quantity available to promise = On Hand minus Reserved Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Available", fieldLength=22)
	qtyAvailable,
	//
	@FlyElement(columnName="QtyBackOrdered", name="Backordered", description="Backordered Quantity", help="Calculated: ordered - delivered quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Backordered", fieldLength=22)
	qtyBackOrdered,
	//
	@FlyElement(columnName="QtyBook", name="帐册数量", description="订购量", help="The Quantity Book indicates the line count stored in the system for a product in inventory", dataType=FlyDataType.Quantity, entityType="D", printName="已记帐数量", fieldLength=22)
	qtyBook,
	//
	@FlyElement(columnName="QtyCalculated", name="Calculated Quantity", description="Calculated Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Calculated Qty", fieldLength=22)
	qtyCalculated,
	//
	@FlyElement(columnName="QtyCompleted", name="Qty Completed", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Completed", fieldLength=0)
	qtyCompleted,
	//
	@FlyElement(columnName="QtyCount", name="计数数量", description="计算了量", help="The Quantity Count indicates the actual inventory count taken for a product in inventory", dataType=FlyDataType.Quantity, entityType="D", printName="计数", fieldLength=22)
	qtyCount,
	//
	@FlyElement(columnName="QtyCsv", name="QtyCsv", dataType=FlyDataType.Quantity, entityType="D", printName="QtyCsv", fieldLength=131089)
	qtyCsv,
	//
	@FlyElement(columnName="QtyDelivered", name="已配送数量", description="已配送数量", help="The Delivered Quantity indicates the quantity of a product that has been delivered.", dataType=FlyDataType.Quantity, entityType="D", printName="已配送数量", fieldLength=22)
	qtyDelivered,
	//
	@FlyElement(columnName="QtyEntered", name="Quantity", description="The Quantity Entered is based on the selected UoM", help="The Quantity Entered is converted to base product UoM quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Quantity", fieldLength=22)
	qtyEntered,
	//
	@FlyElement(columnName="QtyInternalUse", name="Internal Use Qty", description="Internal Use Quantity removed from Inventory", help="Quantity of product inventory used internally (positive if taken out - negative if returned)", dataType=FlyDataType.Quantity, entityType="D", printName="Internal Use", fieldLength=22)
	qtyInternalUse,
	//
	@FlyElement(columnName="QtyInvoiced", name="已开票量", description="已开票量", help="The Invoiced Quantity indicates the quantity of a product that have been invoiced.", dataType=FlyDataType.Quantity, entityType="D", printName="已开票", fieldLength=22)
	qtyInvoiced,
	//
	@FlyElement(columnName="QtyLostSales", name="Lost Sales Qty", description="Quantity of potential sales", help="When an order is closed and there is a difference between the ordered quantity and the delivered (invoiced) quantity is the Lost Sales Quantity.  Note that the Lost Sales Quantity is 0 if you void an order, so close the order if you want to track lost opportunities.  [Void = data entry error - Close = the order is finished]", dataType=FlyDataType.Quantity, entityType="D", printName="Lost Sales Qty", fieldLength=22)
	qtyLostSales,
	//
	@FlyElement(columnName="QtyMovementDrafted", name="Qty Movement Drafted", description="The sum of inOutLines line quantities which are in the Drafted status", help="The sum of inOutLines line quantities which are in the Drafted status", dataType=FlyDataType.NONE, entityType="D", printName="Qty Movement Drafted", fieldLength=0)
	qtyMovementDrafted,
	//
	@FlyElement(columnName="QtyMultiplier", name="乘数数量", description="Value to multiply quantities by for generating commissions.", help="The Multiplier Quantity field indicates the amount to multiply the quantities accumulated for this commission run.", dataType=FlyDataType.Number, entityType="D", printName="乘数数量", fieldLength=22)
	qtyMultiplier,
	//
	@FlyElement(columnName="QtyOnHand", name="在库库存", description="在库库存", help="The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse.", dataType=FlyDataType.Quantity, entityType="D", printName="库存数量", fieldLength=22)
	qtyOnHand,
	//
	@FlyElement(columnName="QtyOnHandTotal", name="On Hand Quantity Total", description="On Hand Quantity Total", help="The On Hand Quantity Total indicates the quantity of a product that is on hand in a warehouse.", dataType=FlyDataType.NONE, entityType="D", printName="On Hand Qty Total", fieldLength=0)
	qtyOnHandTotal,
	//
	@FlyElement(columnName="QtyOpenToInvoice", name="QtyOpenToInvoice", dataType=FlyDataType.NONE, entityType="D", printName="QtyOpenToInvoice", fieldLength=0)
	qtyOpenToInvoice,
	//
	@FlyElement(columnName="QtyOrdered", name="已定单量", description="已定单量", help="The Ordered Quantity indicates the quantity of a product that was ordered.", dataType=FlyDataType.Quantity, entityType="D", printName="已定单量", fieldLength=22)
	qtyOrdered,
	//
	@FlyElement(columnName="QtyOrderedTotal", name="Ordered Quantity Total", description="Ordered Quantity Total", help="The Ordered Quantity Total indicates the quantity of a product that was ordered.", dataType=FlyDataType.NONE, entityType="D", printName="Ordered Qty Total", fieldLength=0)
	qtyOrderedTotal,
	//
	@FlyElement(columnName="QtyPlan", name="Quantity Plan", description="Planned Quantity", help="Planned Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Quantity Plan", fieldLength=22)
	qtyPlan,
	//
	@FlyElement(columnName="QtyPrice", name="Quantity Price", dataType=FlyDataType.CostsPrices, entityType="D", printName="Qty Price", fieldLength=22)
	qtyPrice,
	//
	@FlyElement(columnName="QtyRange", name="库存数量", dataType=FlyDataType.NONE, entityType="D", printName="库存数量", fieldLength=0)
	qtyRange,
	//
	@FlyElement(columnName="QtyRanking", name="Quantity Ranking", dataType=FlyDataType.Integer, entityType="D", printName="Qty Ranking", fieldLength=22)
	qtyRanking,
	//
	@FlyElement(columnName="QtyReimbursed", name="Quantity Reimbursed", description="The reimbursed quantity", help="The reimbursed quantity is derived from the entered quantity and can be overwritten when approving the expense report.", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Reimbursed", fieldLength=22)
	qtyReimbursed,
	//
	@FlyElement(columnName="QtyReserved", name="保留库存", description="保留库存", help="The Reserved Quantity indicates the quantity of a product that is currently reserved for other orders.", dataType=FlyDataType.Quantity, entityType="D", printName="保留库存", fieldLength=22)
	qtyReserved,
	//
	@FlyElement(columnName="QtyReservedTotal", name="Reserved Quantity Total", description="Reserved Quantity Total", help="The Reserved Quantity Total indicates the quantity of a product that is currently reserved.", dataType=FlyDataType.NONE, entityType="D", printName="Reserved Qty Total", fieldLength=0)
	qtyReservedTotal,
	//
	@FlyElement(columnName="QtyReward", name="Reward Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Reward Quantity", fieldLength=0)
	qtyReward,
	//
	@FlyElement(columnName="QtySpent", name="Quantity Used", description="Quantity used for this event", dataType=FlyDataType.Quantity, entityType="D", printName="Qty Used", fieldLength=22)
	qtySpent,
	//
	@FlyElement(columnName="QtySubtract", name="减去数量", description="Quantity to subtract when generating commissions", help="The Quantity Subtract identifies the quantity to be subtracted before multiplication", dataType=FlyDataType.Number, entityType="D", printName="减去数量", fieldLength=22)
	qtySubtract,
	//
	@FlyElement(columnName="QtyToDeliver", name="配送数量", dataType=FlyDataType.Quantity, entityType="D", printName="配送数量", fieldLength=22)
	qtyToDeliver,
	//
	@FlyElement(columnName="QtyToInvoice", name="发票数量", dataType=FlyDataType.Quantity, entityType="D", printName="发票数量", fieldLength=22)
	qtyToInvoice,
	//
	@FlyElement(columnName="QtyToOrder", name="定单数量", dataType=FlyDataType.Quantity, entityType="D", printName="定单数量", fieldLength=22)
	qtyToOrder,
	//
	@FlyElement(columnName="QtyUsed", name="Quantity Used", dataType=FlyDataType.Amount, entityType="D", printName="Quantity Used in production", fieldLength=10)
	qtyUsed,
	//
	@FlyElement(columnName="QualityRating", name="质量等级", description="评估供应商等级方法", help="The Quality Rating indicates how a vendor is rated (higher number = higher quality)", dataType=FlyDataType.Integer, entityType="D", printName="质量等级", fieldLength=22)
	qualityRating,
	//
	@FlyElement(columnName="Query", name="Query", description="SQL", dataType=FlyDataType.Text, entityType="D", printName="Query", fieldLength=2000)
	query,
	//
	@FlyElement(columnName="QuerySource", name="Query Source", description="Source of the Query", dataType=FlyDataType.List, entityType="D", printName="Source", fieldLength=1)
	querySource,
	//
	@FlyElement(columnName="QuoteType", name="RfQ Type", description="Request for Quotation Type", dataType=FlyDataType.List, entityType="D", printName="RfQ Type", fieldLength=1)
	quoteType,
	//
	@FlyElement(columnName="RangeLabel", name="Range Label", description="Label for the range axis.", dataType=FlyDataType.String, entityType="D", printName="Range Label", fieldLength=60)
	rangeLabel,
	//
	@FlyElement(columnName="Ranking", name="Ranking", description="Relative Rank Number", help="One is the highest Rank", dataType=FlyDataType.Integer, entityType="D", printName="Ranking", fieldLength=22)
	ranking,
	//
	@FlyElement(columnName="RankRfQ", name="Rank RfQ", dataType=FlyDataType.Button, entityType="D", printName="Rank RfQ", fieldLength=1)
	rankRfQ,
	//
	@FlyElement(columnName="Rate", name="比率", description="比率or Tax or Exchange", help="The Rate indicates the percentage to be multiplied by the source to arrive at the tax or exchange amount.", dataType=FlyDataType.Number, entityType="D", printName="比率", fieldLength=22)
	rate,
	//
	@FlyElement(columnName="Rating", name="等级", description="分类或重要", help="The Rating is used to differentiate the importance", dataType=FlyDataType.String, entityType="D", printName="等级", fieldLength=1)
	rating,
	//
	@FlyElement(columnName="Ratio", name="Ratio", description="Relative Ratio for Distributions", help="The relative weight of an distribution. If the total of all ratios is 100, it is the same as percent.", dataType=FlyDataType.Number, entityType="D", printName="Ratio", fieldLength=22)
	ratio,
	//
	@FlyElement(columnName="RatioElementType", name="Element Type", description="Ratio Element Type", help="Type of data used for the calculation", dataType=FlyDataType.List, entityType="D", printName="Element Type", fieldLength=1)
	ratioElementType,
	//
	@FlyElement(columnName="RatioOperand", name="Operand", description="Ratio Operand", help="Operand how data is calculated.  If it is the first in the series, 'minus' will create a negative value, otherwise ignored.", dataType=FlyDataType.List, entityType="D", printName="Operand", fieldLength=1)
	ratioOperand,
	//
	@FlyElement(columnName="RatioTotal", name="Total Ratio", description="Total of relative weight in a distribution", help="The total relative weight of an distribution. If the total of all ratios is 100, it is the same as percent.", dataType=FlyDataType.Number, entityType="D", printName="Total Ratio", fieldLength=22)
	ratioTotal,
	//
	@FlyElement(columnName="R_AuthCode", name="授权码", description="被送回的授权码", help="The Authorization Code indicates the code returned from the electronic transmission.", dataType=FlyDataType.String, entityType="D", printName="授权码", fieldLength=20)
	rAuthCode,
	//
	@FlyElement(columnName="R_AuthCode_DC", name="授权码", description="Authorization Code Delayed Capture returned", help="The Authorization Code indicates the code returned from the electronic transmission.", dataType=FlyDataType.String, entityType="D", printName="授权码", fieldLength=20)
	rAuthCodeDC,
	//
	@FlyElement(columnName="R_AvsAddr", name="地址已验证", description="This address has been verified", help="The Address Verified indicates if the address has been verified by the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="地址已验证", fieldLength=1)
	rAvsAddr,
	//
	@FlyElement(columnName="R_AvsZip", name="邮编已验证", description="The Zip Code has been verified", help="The Zip Verified indicates if the zip code has been verified by the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="邮编已验证", fieldLength=1)
	rAvsZip,
	//
	@FlyElement(columnName="R_Category_ID", name="Category", description="Request Category", help="Category or Topic of the Request ", dataType=FlyDataType.TableDirect, entityType="D", printName="Category", fieldLength=10)
	rCategoryID,
	//
	@FlyElement(columnName="R_CVV2Match", name="CVV 匹配", description="Credit Card Verification Code Match", help="The Credit Card Verification Code was matched", dataType=FlyDataType.YesNo, entityType="D", printName="CVV 匹配", fieldLength=1)
	rCVV2Match,
	//
	@FlyElement(columnName="ReadOnlyLogic", name="只读逻辑", description="Logic to determine if field is read only (applies only when field is read-write)", help="format := {expression} [{logic} {expression}]<br> 	expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> 	logic := {|}|{&}<br>	context := any global or window context <br>	value := strings or numbers<br>	logic operators	:= AND or OR with the previous result from left to right <br>	operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>	Examples: <br>	@AD_Table_ID@=14 | @Language@!GERGER <br>	@PriceLimit@>10 | @PriceList@>@PriceActual@<br>	@Name@>J<br>	Strings may be in single quotes (optional)", dataType=FlyDataType.Text, entityType="D", printName="只读逻辑", fieldLength=2000)
	readOnlyLogic,
	//
	@FlyElement(columnName="RealizedGain_Acct", name="已实现收益帐户", description="已实现收益帐户", help="The Realized Gain Account indicates the account to be used when recording gains achieved from currency revaluation that have been realized.", dataType=FlyDataType.Account, entityType="D", printName="已实现收益帐户", fieldLength=22)
	realizedGainAcct,
	//
	@FlyElement(columnName="RealizedLoss_Acct", name="已实现损失帐户", description="已实现损失帐户", help="The Realized Loss Account indicates the account to be used when recording losses incurred from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="已实现损失帐户", fieldLength=22)
	realizedLossAcct,
	//
	@FlyElement(columnName="ReceiptFooterMsg", name="Receipt Footer Msg", description="This message will be displayed at the bottom of a receipt when doing a sales or purchase", dataType=FlyDataType.LongText, entityType="D", printName="Receipt Footer Msg", fieldLength=0)
	receiptFooterMsg,
	//
	@FlyElement(columnName="ReceivedInfo", name="Info Received", description="Information of the receipt of the package (acknowledgement)", dataType=FlyDataType.String, entityType="D", printName="Info Received", fieldLength=255)
	receivedInfo,
	//
	@FlyElement(columnName="ReceiveInquiryReply", name="已接收查询答复", dataType=FlyDataType.YesNo, entityType="D", printName="查询答复", fieldLength=1)
	receiveInquiryReply,
	//
	@FlyElement(columnName="ReceiveOrderReply", name="接收定单答复", dataType=FlyDataType.YesNo, entityType="D", printName="定单答复", fieldLength=1)
	receiveOrderReply,
	//
	@FlyElement(columnName="RecognitionFrequency", name="确认频率", dataType=FlyDataType.List, entityType="D", printName="确认频率", fieldLength=1)
	recognitionFrequency,
	//
	@FlyElement(columnName="RecognizedAmt", name="确认金额", dataType=FlyDataType.Amount, entityType="D", printName="确认金额", fieldLength=22)
	recognizedAmt,
	//
	@FlyElement(columnName="Record_ID", name="记录ID", description="记录的内部ID", help="The Record ID is the internal unique identifier of a record", dataType=FlyDataType.Button, entityType="D", printName="记录ID", fieldLength=22)
	recordID,
	//
	@FlyElement(columnName="RecordType", name="RecordType", dataType=FlyDataType.String, entityType="D", printName="RecordType", fieldLength=0)
	recordType,
	//
	@FlyElement(columnName="RecurringType", name="重新开始类型", description="重新开始的类型文件", help="The type of document to be generated", dataType=FlyDataType.List, entityType="D", printName="重新开始类型", fieldLength=1)
	recurringType,
	//
	@FlyElement(columnName="Red", name="红色", description="RGB 值 ", dataType=FlyDataType.Integer, entityType="D", printName="红色", fieldLength=22)
	red,
	//
	@FlyElement(columnName="Red_1", name="2nd Red", description="RGB 第二颜色值", dataType=FlyDataType.Integer, entityType="D", printName="第二个红色", fieldLength=22)
	red1,
	//
	@FlyElement(columnName="Redo", name="Redo", dataType=FlyDataType.Button, entityType="D", printName="Redo", fieldLength=1)
	redo,
	//
	@FlyElement(columnName="Reference", name="引用", description="本记录引用", help="The Reference displays the source document number.", dataType=FlyDataType.String, entityType="D", printName="引用", fieldLength=60)
	reference,
	//
	@FlyElement(columnName="ReferenceNo", name="引用号", description="Your customer or vendor number at the Business Partner's site 你在业务伙伴那里的客户号或供应商号。", help="The reference number can be printed on orders and invoices to allow your business partner to faster identify your records.", dataType=FlyDataType.String, entityType="D", printName="引用号", fieldLength=40)
	referenceNo,
	//
	@FlyElement(columnName="Referrer", name="Referrer", description="谈及网地址", dataType=FlyDataType.String, entityType="D", printName="Referrer", fieldLength=120)
	referrer,
	//
	@FlyElement(columnName="Ref_InOut_ID", name="Referenced Shipment", dataType=FlyDataType.ID, entityType="D", printName="Ref Ship", fieldLength=22)
	refInOutID,
	//
	@FlyElement(columnName="Ref_InOutLine_ID", name="Referenced Shipment Line", dataType=FlyDataType.ID, entityType="D", printName="Ref Ship Line", fieldLength=22)
	refInOutLineID,
	//
	@FlyElement(columnName="Ref_Invoice_ID", name="Referenced Invoice", dataType=FlyDataType.ID, entityType="D", printName="Ref Invoice", fieldLength=22)
	refInvoiceID,
	//
	@FlyElement(columnName="Ref_InvoiceLine_ID", name="Referenced Invoice Line", dataType=FlyDataType.ID, entityType="D", printName="Ref Invoice Line", fieldLength=22)
	refInvoiceLineID,
	//
	@FlyElement(columnName="Ref_Order_ID", name="Referenced Order", description="Reference to corresponding Sales/Purchase Order", help="Reference of the Sales Order Line to the corresponding Purchase Order Line or vice versa.", dataType=FlyDataType.Search, entityType="D", printName="Ref Order", fieldLength=22)
	refOrderID,
	//
	@FlyElement(columnName="Ref_OrderLine_ID", name="销售单|采购单参考", description="Reference to corresponding Sales Purchase Order", help="Reference of the Sales Order Line to the corresponding Purchase Order Line or vice versa.", dataType=FlyDataType.Search, entityType="D", printName="销售单|采购单参考", fieldLength=22)
	refOrderLineID,
	//
	@FlyElement(columnName="Ref_Payment_ID", name="Referenced Payment", dataType=FlyDataType.Table, entityType="D", printName="Ref Payment", fieldLength=10)
	refPaymentID,
	//
	@FlyElement(columnName="Ref_RMA_ID", name="Referenced RMA", dataType=FlyDataType.Search, entityType="D", printName="Ref RMA", fieldLength=22)
	refRMAID,
	//
	@FlyElement(columnName="Ref_RMALine_ID", name="Referenced RMA Line", dataType=FlyDataType.Table, entityType="D", printName="Ref RMA Line", fieldLength=22)
	refRMALineID,
	//
	@FlyElement(columnName="RegionName", name="区域名字", description="该区域的名字", help="The Region Name defines the name that will print when this region is used in a document.", dataType=FlyDataType.String, entityType="D", printName="区域名字", fieldLength=60)
	regionName,
	//
	@FlyElement(columnName="RelatedProduct_ID", name="Related Product", description="Related Product", dataType=FlyDataType.Search, entityType="D", printName="Related Product", fieldLength=22)
	relatedProductID,
	//
	@FlyElement(columnName="RelatedProductType", name="Related Product Type", dataType=FlyDataType.List, entityType="D", printName="Related Product Type", fieldLength=1)
	relatedProductType,
	//
	@FlyElement(columnName="RelativePeriod", name="相对分期", description="分期抵销", dataType=FlyDataType.Number, entityType="D", printName="相对分期", fieldLength=22)
	relativePeriod,
	//
	@FlyElement(columnName="RelativePeriodTo", name="Relative Period To", description="Period offset (0 is current)", dataType=FlyDataType.NONE, entityType="D", printName="Relative Period To", fieldLength=0)
	relativePeriodTo,
	//
	@FlyElement(columnName="RelativeURL", name="Relative URL", description="Contains the relative URL for the container", help="The relative URL is used together with the webproject domain to display the content", dataType=FlyDataType.String, entityType="D", printName="Relative URL", fieldLength=120)
	relativeURL,
	//
	@FlyElement(columnName="RelativeWeight", name="相对重量", description="Relative weight of this step (0 = ignored)", help="The relative weight allows you to adjust the report based on probabilities.  For example, if you have a 1:10 chance in closing a contract when it is in the prospect stage and a 1:2 chance when it is in the contract stage, you may put a weight of 0.1 and 0.5 on those steps. In the Cycle Report, you then could see, which stage is less or more compared to the other steps.  This is an alternative method for a funnel or measures completion of your project.", dataType=FlyDataType.Number, entityType="D", printName="相对重量", fieldLength=22)
	relativeWeight,
	//
	@FlyElement(columnName="ReleaseNo", name="发行号", description="内部发行号", dataType=FlyDataType.String, entityType="D", printName="发行号", fieldLength=10)
	releaseNo,
	//
	@FlyElement(columnName="ReleaseTag", name="Release Tag", description="Release Tag", dataType=FlyDataType.String, entityType="D", printName="Release Tag", fieldLength=60)
	releaseTag,
	//
	@FlyElement(columnName="RemainingAmt", name="Remaining Amt", description="Remaining Amount", dataType=FlyDataType.Amount, entityType="D", printName="Remaining Amt", fieldLength=22)
	remainingAmt,
	//
	@FlyElement(columnName="RemindDays", name="Reminder Days", description="Days between sending Reminder Emails for a due or inactive Document", help="When a document is due ot too long without activity, a reminder is sent. 0 means no reminders.	The Remind Days are the days when the next email reminder is sent.", dataType=FlyDataType.Integer, entityType="D", printName="Reminder Days", fieldLength=22)
	remindDays,
	//
	@FlyElement(columnName="Remittance_MailText_ID", name="汇款邮件本文", description="Email text used for sending payment remittances", help="Standard email template used to send remittances as attachments.", dataType=FlyDataType.Table, entityType="D", printName="汇款邮件本文", fieldLength=22)
	remittanceMailTextID,
	//
	@FlyElement(columnName="Remittance_PrintFormat_ID", name="汇款打印格式", description="Print Format for separate Remittances", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="汇款打印格式", fieldLength=22)
	remittancePrintFormatID,
	//
	@FlyElement(columnName="Remote_Addr", name="远程地址", description="远程地址", help="The Remote Address indicates an alternative or external address.", dataType=FlyDataType.String, entityType="D", printName="远程地址", fieldLength=60)
	remoteAddr,
	//
	@FlyElement(columnName="Remote_Client_ID", name="远程客户", description="Remote Client to be used to replicate   synchronize data with.", help="The remote client used for data replication.", dataType=FlyDataType.Table, entityType="D", printName="远程客户", fieldLength=22)
	remoteClientID,
	//
	@FlyElement(columnName="Remote_Host", name="远程主机", dataType=FlyDataType.String, entityType="D", printName="远程主机", fieldLength=120)
	remoteHost,
	//
	@FlyElement(columnName="Remote_Org_ID", name="远程组织", description="Remote Organization to be used to replicate   synchronize data with.", help="The remote organization used for data replication. If not selected, all organizations are replicated synchronized.", dataType=FlyDataType.Table, entityType="D", printName="远程组织", fieldLength=22)
	remoteOrgID,
	//
	@FlyElement(columnName="RemunerationType", name="Remuneration Type", description="Type of Remuneration", dataType=FlyDataType.List, entityType="D", printName="Remuneration Type", fieldLength=1)
	remunerationType,
	//
	@FlyElement(columnName="RenewalDate", name="Renewal Date", dataType=FlyDataType.Date, entityType="D", printName="Renewal Date", fieldLength=7)
	renewalDate,
	//
	@FlyElement(columnName="RepeatDistance", name="重复距离", description="Distance in points to repeat gradient color - or zero", help="The gradient color is not repeated, if the value is zero. The distance is added to (or subtracted from) the starting point of the gradient.", dataType=FlyDataType.Integer, entityType="D", printName="重复距离", fieldLength=22)
	repeatDistance,
	//
	@FlyElement(columnName="ReplenishmentClass", name="Replenishment Class", description="Custom class to calculate Quantity to Order", help="If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level.", dataType=FlyDataType.String, entityType="D", printName="Replenishment Class", fieldLength=60)
	replenishmentClass,
	//
	@FlyElement(columnName="ReplenishmentCreate", name="Create", description="Create from Replenishment", dataType=FlyDataType.List, entityType="D", printName="Create", fieldLength=1)
	replenishmentCreate,
	//
	@FlyElement(columnName="ReplenishPlanInitialSetup", name="Replenish Plan Initial Setup", dataType=FlyDataType.Button, entityType="D", printName="Replenish Plan Initial Setup", fieldLength=1)
	replenishPlanInitialSetup,
	//
	@FlyElement(columnName="ReplenishType", name="补货类型", description="Method for re-ordering a product", help="The Replenish Type indicates if this product will be manually re-ordered, ordered when the quantity is below the minimum quantity or ordered when it is below the maximum quantity.", dataType=FlyDataType.List, entityType="D", printName="补货类型", fieldLength=1)
	replenishType,
	//
	@FlyElement(columnName="ReplicationType", name="复制类型", description="数据复制的类型", help="The Type of data Replication determines the directon of the data replication.  <br>	Reference means that the data in this system is read only -> <br>	Local means that the data in this system is not replicated to other systems - <br>	Merge means that the data in this system is synchronized with the other system <-> <br>	", dataType=FlyDataType.List, entityType="D", printName="复制类型", fieldLength=1)
	replicationType,
	//
	@FlyElement(columnName="Reply", name="Reply", description="Reply or Answer", dataType=FlyDataType.Text, entityType="D", printName="Reply", fieldLength=2000)
	reply,
	//
	@FlyElement(columnName="Reply_Price", name="答复价格", description="Confirmed Price from EDI Partner", dataType=FlyDataType.CostsPrices, entityType="D", printName="答复价格", fieldLength=22)
	replyPrice,
	//
	@FlyElement(columnName="Reply_QtyAvailable", name="答复可用数量", dataType=FlyDataType.Quantity, entityType="D", printName="可用库存", fieldLength=22)
	replyQtyAvailable,
	//
	@FlyElement(columnName="Reply_QtyConfirmed", name="答复被证实的数量", dataType=FlyDataType.Quantity, entityType="D", printName="已确认数量", fieldLength=22)
	replyQtyConfirmed,
	//
	@FlyElement(columnName="Reply_Received", name="答复收到", dataType=FlyDataType.DateTime, entityType="D", printName="答复", fieldLength=7)
	replyReceived,
	//
	@FlyElement(columnName="Reply_Remarks", name="答复评论", dataType=FlyDataType.Text, entityType="D", printName="评论", fieldLength=2000)
	replyRemarks,
	//
	@FlyElement(columnName="Reply_ShipDate", name="答复交货日期", dataType=FlyDataType.Date, entityType="D", printName="发运日期", fieldLength=7)
	replyShipDate,
	//
	@FlyElement(columnName="reportline", name="reportline", dataType=FlyDataType.NONE, entityType="D", printName="reportline", fieldLength=0)
	reportline,
	//
	@FlyElement(columnName="ReportLineSetName", name="报表行组合名", description="报表行组合名", dataType=FlyDataType.String, entityType="D", printName="报表行组合名", fieldLength=60)
	reportLineSetName,
	//
	@FlyElement(columnName="reportlinestyle", name="reportlinestyle", dataType=FlyDataType.NONE, entityType="D", printName="reportlinestyle", fieldLength=0)
	reportlinestyle,
	//
	@FlyElement(columnName="ReportType", name="Report Type", dataType=FlyDataType.NONE, entityType="D", printName="Report Type", fieldLength=0)
	reportType,
	//
	@FlyElement(columnName="RequestAmt", name="请求金额", description="Amount associated with this request", help="The Request Amount indicates any amount that is associated with this request.  For example, a warranty amount or refund amount.", dataType=FlyDataType.Amount, entityType="D", printName="请求 Amt", fieldLength=22)
	requestAmt,
	//
	@FlyElement(columnName="RequestDocumentNo", name="Request Document No", description="Adempiere Request Document No", dataType=FlyDataType.String, entityType="D", printName="Request Document No", fieldLength=30)
	requestDocumentNo,
	//
	@FlyElement(columnName="RequestEMail", name="请求电子邮件", description="EMail address to send automated mails from or receive mails for automated processing (fully qualified)", help="EMails for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. The address must be filly qualified (e.g. joe.smith@company.com) and should be a valid address.", dataType=FlyDataType.String, entityType="D", printName="请求电子邮件", fieldLength=60)
	requestEMail,
	//
	@FlyElement(columnName="RequestFolder", name="请求文件夹", description="EMail folder to process incoming emails; if empty INBOX is used", help="Email folder used to read emails to process as requests, If left empty the default mailbox (INBOX) will be used. Requires IMAP services.", dataType=FlyDataType.String, entityType="D", printName="请求文件夹", fieldLength=20)
	requestFolder,
	//
	@FlyElement(columnName="Request_Price", name="请求价格", dataType=FlyDataType.CostsPrices, entityType="D", printName="请求价格", fieldLength=22)
	requestPrice,
	//
	@FlyElement(columnName="Request_Qty", name="请求数量", dataType=FlyDataType.Quantity, entityType="D", printName="请求数量", fieldLength=22)
	requestQty,
	//
	@FlyElement(columnName="Request_Shipdate", name="请求交货日期", dataType=FlyDataType.Date, entityType="D", printName="请求交货日期", fieldLength=7)
	requestShipdate,
	//
	@FlyElement(columnName="RequestType", name="Request Type", dataType=FlyDataType.String, entityType="D", printName="Request Type", fieldLength=4)
	requestType,
	//
	@FlyElement(columnName="RequestUser", name="请求用户", description="User Name (ID) of the email owner", help="EMail user name for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. Required, if your mail server requires authentification as well as for processing incoming mails.", dataType=FlyDataType.String, entityType="D", printName="请求用户", fieldLength=60)
	requestUser,
	//
	@FlyElement(columnName="RequestUserPW", name="请求用户密码", description="Password of the user name (ID) for mail processing", dataType=FlyDataType.String, entityType="D", printName="请求用户密码", fieldLength=20)
	requestUserPW,
	//
	@FlyElement(columnName="RequiresTaxCertificate", name="需要免税证书", description="本税率需要免税证书", help="The Requires Tax Certificate indicates that a tax certificate is required for a Business Partner to be tax exempt.", dataType=FlyDataType.YesNo, entityType="D", printName="需要免税证书", fieldLength=1)
	requiresTaxCertificate,
	//
	@FlyElement(columnName="RequireVV", name="Require CreditCard Verification Code", description="Require 3 4 digit Credit Verification Code", help="The Require CC Verification checkbox indicates if this bank accounts requires a verification number for credit card transactions.", dataType=FlyDataType.YesNo, entityType="D", printName="需要确认密码", fieldLength=1)
	requireVV,
	//
	@FlyElement(columnName="ResourceDescription", name="资源描述", description="Resource Allocation Description", dataType=FlyDataType.String, entityType="D", printName="资源描述", fieldLength=255)
	resourceDescription,
	//
	@FlyElement(columnName="ResponseText", name="Response Text", description="Request Response Text", help="Text block to be copied into request response text", dataType=FlyDataType.Text, entityType="D", printName="Response Text", fieldLength=2000)
	responseText,
	//
	@FlyElement(columnName="ResponsibleType", name="职责类型", description="工作流的职责类型", help="Type how the responsible user for the execution of a workflow is determined", dataType=FlyDataType.List, entityType="D", printName="职责类型", fieldLength=1)
	responsibleType,
	//
	@FlyElement(columnName="Result", name="结果", description="采取的动作结果", help="The Result indicates the result of any action taken on this request.", dataType=FlyDataType.Integer, entityType="D", printName="结果", fieldLength=22)
	result,
	//
	@FlyElement(columnName="RetainedEarning_Acct", name="未分配利润帐户", dataType=FlyDataType.Account, entityType="D", printName="未分配利润帐户", fieldLength=22)
	retainedEarningAcct,
	//
	@FlyElement(columnName="Reversal_ID", name="Reversal ID", description="ID of document reversal", dataType=FlyDataType.Table, entityType="D", printName="Reversal ID", fieldLength=22)
	reversalID,
	//
	@FlyElement(columnName="ReversalLine_ID", name="Reversal Line", description="Use to keep the reversal line ID for reversing costing purpose", dataType=FlyDataType.Table, entityType="D", printName="Reversal Line", fieldLength=22)
	reversalLineID,
	//
	@FlyElement(columnName="RewardType", name="Reward Type", description="Type of reward which consists of percentage discount, flat discount or absolute amount", dataType=FlyDataType.List, entityType="D", printName="Reward Type", fieldLength=1)
	rewardType,
	//
	@FlyElement(columnName="R_Group_ID", name="Group", description="Request Group", help="Group of requests (e.g. version numbers, responsibility, ...)", dataType=FlyDataType.TableDirect, entityType="D", printName="Group", fieldLength=10)
	rGroupID,
	//
	@FlyElement(columnName="R_Info", name="信息", description="回应信息", help="The Info indicates any response information returned from the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="信息", fieldLength=2000)
	rInfo,
	//
	@FlyElement(columnName="R_InterestArea_ID", name="关心点区域", description="关心点区域或主题", help="Interest Areas reflect interest in a topic by a contact. Interest areas can be used for marketing campaigns.", dataType=FlyDataType.TableDirect, entityType="D", printName="关心点区域", fieldLength=22)
	rInterestAreaID,
	//
	@FlyElement(columnName="R_IssueKnown_ID", name="Known Issue", description="Known Issue", dataType=FlyDataType.Search, entityType="D", printName="Known Issue", fieldLength=10)
	rIssueKnownID,
	//
	@FlyElement(columnName="R_IssueProject_ID", name="Issue Project", description="Implementation Projects", dataType=FlyDataType.ID, entityType="D", printName="Issue Project", fieldLength=10)
	rIssueProjectID,
	//
	@FlyElement(columnName="R_IssueRecommendation_ID", name="Issue Recommendation", description="Recommendations how to fix an Issue", help="Recommendations how to fix an Issue", dataType=FlyDataType.ID, entityType="D", printName="Issue Recommendation", fieldLength=22)
	rIssueRecommendationID,
	//
	@FlyElement(columnName="R_IssueStatus_ID", name="Issue Status", description="Status of an Issue", help="Status of an Issue", dataType=FlyDataType.ID, entityType="D", printName="Issue Status", fieldLength=10)
	rIssueStatusID,
	//
	@FlyElement(columnName="R_IssueSystem_ID", name="Issue System", description="System creating the issue", dataType=FlyDataType.ID, entityType="D", printName="Issue System", fieldLength=10)
	rIssueSystemID,
	//
	@FlyElement(columnName="R_IssueUser_ID", name="IssueUser", description="User who reported issues", dataType=FlyDataType.ID, entityType="D", printName="Issue User", fieldLength=10)
	rIssueUserID,
	//
	@FlyElement(columnName="R_MailText_ID", name="邮寄模板", description="本文模板为邮寄", help="The Mail Template indicates the mail template for return messages.", dataType=FlyDataType.ID, entityType="D", printName="邮寄模板", fieldLength=22)
	rMailTextID,
	//
	@FlyElement(columnName="Role_Source", name="Source Role", description="If set, this role will be used as label for the zoom destination instead of the destinations's window name", dataType=FlyDataType.List, entityType="D", printName="Source Role", fieldLength=50)
	roleSource,
	//
	@FlyElement(columnName="Role_Target", name="Target Role", description="If set, this role will be used as label for the zoom destination instead of the destinations's window name", dataType=FlyDataType.List, entityType="D", printName="Target Role", fieldLength=50)
	roleTarget,
	//
	@FlyElement(columnName="RollbackStatement", name="Rollback Statement", description="SQL statement to rollback the current step.", dataType=FlyDataType.NONE, entityType="D", printName="Rollback Statement", fieldLength=0)
	rollbackStatement,
	//
	@FlyElement(columnName="RoundOffFactor", name="Round Off Factor", description="Used to Round Off Payment Amount", dataType=FlyDataType.Number, entityType="D", printName="Round Off Factor", fieldLength=14)
	roundOffFactor,
	//
	@FlyElement(columnName="RoutingNo", name="路由号", description="银行工作路明细排定数字", help="The Bank Routing Number (ABA Number) identifies a legal Bank.  It is used in routing checks and electronic transactions.", dataType=FlyDataType.String, entityType="D", printName="路由号", fieldLength=20)
	routingNo,
	//
	@FlyElement(columnName="RowType", name="Row Type", dataType=FlyDataType.String, entityType="D", printName="Row Type", fieldLength=1)
	rowType,
	//
	@FlyElement(columnName="RoyaltyAmt", name="版权金额", description="(Included) Amount for copyright, etc.", dataType=FlyDataType.Amount, entityType="D", printName="版权金额", fieldLength=22)
	royaltyAmt,
	//
	@FlyElement(columnName="R_PnRef", name="付款参考", description="付款参考", help="The Payment Reference indicates the reference returned from the Credit Card Company for a payment", dataType=FlyDataType.String, entityType="D", printName="参考", fieldLength=20)
	rPnRef,
	//
	@FlyElement(columnName="R_PnRef_DC", name="叁考", description="Payment Reference Delayed Capture", help="The Payment Reference indicates the reference returned from the Credit Card Company for a payment", dataType=FlyDataType.String, entityType="D", printName="叁考", fieldLength=20)
	rPnRefDC,
	//
	@FlyElement(columnName="RRAmt", name="Revenue Recognition Amt", description="Revenue Recognition Amount", help="The amount for revenue recognition calculation.  If empty, the complete invoice amount is used.  The difference between Revenue Recognition Amount and Invoice Line Net Amount is immediately recognized as revenue.", dataType=FlyDataType.Amount, entityType="D", printName="RR Amt", fieldLength=22)
	rRAmt,
	//
	@FlyElement(columnName="R_RequestAction_ID", name="请求动作", description="动作有被请求", help="The Request Action indicates if the Credit Card Company has requested further action be taken.", dataType=FlyDataType.ID, entityType="D", printName="请求动作", fieldLength=22)
	rRequestActionID,
	//
	@FlyElement(columnName="R_Request_ID", name="请求", description="Request from a Business Partner or Prospect", help="The Request identifies a unique request from a Business Partner or Prospect.", dataType=FlyDataType.ID, entityType="D", printName="请求", fieldLength=22)
	rRequestID,
	//
	@FlyElement(columnName="R_RequestProcessor_ID", name="请求处理器", dataType=FlyDataType.ID, entityType="D", printName="请求处理器", fieldLength=22)
	rRequestProcessorID,
	//
	@FlyElement(columnName="R_RequestProcessorLog_ID", name="Request Processor Log", dataType=FlyDataType.ID, entityType="D", printName="Request Processor Log", fieldLength=22)
	rRequestProcessorLogID,
	//
	@FlyElement(columnName="R_RequestProcessor_Route_ID", name="请求工作路明细排定", description="自动请求的路由", dataType=FlyDataType.ID, entityType="D", printName="请求工作路明细排定", fieldLength=22)
	rRequestProcessorRouteID,
	//
	@FlyElement(columnName="R_RequestRelated_ID", name="Related Request", description="Related Request (Master Issue, ..)", help="Request related to this request", dataType=FlyDataType.Search, entityType="D", printName="Related Request", fieldLength=10)
	rRequestRelatedID,
	//
	@FlyElement(columnName="R_RequestType_ID", name="请求类型", description="Type of request (e.g. Inquiry, Complaint, ..)", help="Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.", dataType=FlyDataType.TableDirect, entityType="D", printName="请求类型", fieldLength=22)
	rRequestTypeID,
	//
	@FlyElement(columnName="R_RequestUpdate_ID", name="Request Update", description="Request Updates", dataType=FlyDataType.ID, entityType="D", printName="Request Update", fieldLength=10)
	rRequestUpdateID,
	//
	@FlyElement(columnName="R_Resolution_ID", name="Resolution", description="Request Resolution", help="Resolution status (e.g. Fixed, Rejected, ..)", dataType=FlyDataType.TableDirect, entityType="D", printName="Resolution", fieldLength=10)
	rResolutionID,
	//
	@FlyElement(columnName="R_RespMsg", name="信息", description="回应信息", help="The Response Message indicates the message returned from the Credit Card Company as the result of a transmission", dataType=FlyDataType.String, entityType="D", printName="信息", fieldLength=60)
	rRespMsg,
	//
	@FlyElement(columnName="R_Result", name="结果", description="传输的结果", help="The Response Result indicates the result of the transmission to the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="结果", fieldLength=20)
	rResult,
	//
	@FlyElement(columnName="RRStartDate", name="Revenue Recognition Start", description="Revenue Recognition Start Date", help="The date the revenue recognition starts.", dataType=FlyDataType.DateTime, entityType="D", printName="RR Start", fieldLength=7)
	rRStartDate,
	//
	@FlyElement(columnName="R_StandardResponse_ID", name="Standard Response", description="Request Standard Response ", help="Text blocks to be copied into request response text", dataType=FlyDataType.TableDirect, entityType="D", printName="Std Response", fieldLength=10)
	rStandardResponseID,
	//
	@FlyElement(columnName="R_StatusCategory_ID", name="Status Category", description="Request Status Category", help="Category of Request Status enables to maintain different set of Status for different Request Categories", dataType=FlyDataType.ID, entityType="D", printName="Status Category", fieldLength=10)
	rStatusCategoryID,
	//
	@FlyElement(columnName="R_Status_ID", name="Status", description="Request Status", help="Status if the request (open, closed, investigating, ..)", dataType=FlyDataType.TableDirect, entityType="D", printName="Status", fieldLength=10)
	rStatusID,
	//
	@FlyElement(columnName="RuleType", name="Rule Type", dataType=FlyDataType.List, entityType="D", printName="Rule Type", fieldLength=1)
	ruleType,
	//
	@FlyElement(columnName="RunningTotalLines", name="Running Total Lines", description="Create Running Total Lines (page break) every x lines", help="When you want to print running totals, enter the number of lines per page after you want to create a running total line and page break. You should define running total only once per format.", dataType=FlyDataType.Integer, entityType="D", printName="RT Lines", fieldLength=22)
	runningTotalLines,
	//
	@FlyElement(columnName="RunsMax", name="最大的运行", description="重新开始的数字运行", help="Number of recurring documents to be generated in total", dataType=FlyDataType.Integer, entityType="D", printName="最大运行", fieldLength=22)
	runsMax,
	//
	@FlyElement(columnName="RunsRemaining", name="剩余的运行", description="Number of recurring runs remaining", help="Number of recurring documents to be still generated", dataType=FlyDataType.Integer, entityType="D", printName="剩余的运行", fieldLength=22)
	runsRemaining,
	//
	@FlyElement(columnName="RV_InOut_CreateFrom_ID", name="In Out Create From Identifier", dataType=FlyDataType.ID, entityType="D", printName="In Out Create From Identifier", fieldLength=10)
	rVInOutCreateFromID,
	//
	@FlyElement(columnName="RV_Invoice_CreateFrom_ID", name="Invoice Create From Identifier", dataType=FlyDataType.ID, entityType="D", printName="Invoice Create From Identifier", fieldLength=10)
	rVInvoiceCreateFromID,
	//
	@FlyElement(columnName="SalesPipeline", name="Sales Pipeline", dataType=FlyDataType.NONE, entityType="D", printName="Sales Pipeline", fieldLength=0)
	salesPipeline,
	//
	@FlyElement(columnName="SalesRegionValue", name="Sales Region Value", dataType=FlyDataType.String, entityType="D", printName="Sales Region Value", fieldLength=60)
	salesRegionValue,
	//
	@FlyElement(columnName="SalesRep_ID", name="销售代表", description="Sales Representative or Company Agent", help="The Sales Representative indicates the Sales Rep for this Region.  Any Sales Rep must be a valid internal user.", dataType=FlyDataType.Table, entityType="D", printName="销售代表", fieldLength=22)
	salesRepID,
	//
	@FlyElement(columnName="SalesRep_Name", name="销售代表", dataType=FlyDataType.String, entityType="D", printName="销售代表", fieldLength=60)
	salesRepName,
	//
	@FlyElement(columnName="SalesVolume", name="销售体积", description="总体积的销售", help="The Sales Volume indicates the total volume of sales for a Business Partner.", dataType=FlyDataType.Integer, entityType="D", printName="销售体积", fieldLength=22)
	salesVolume,
	//
	@FlyElement(columnName="Salt", name="Salt", description="Random data added to improve password hash effectiveness", dataType=FlyDataType.String, entityType="D", printName="Salt", fieldLength=16)
	salt,
	//
	@FlyElement(columnName="ScheduleType", name="Schedule Type", description="Type of schedule", help="Define the method how the next occurance is calculated", dataType=FlyDataType.List, entityType="D", printName="Schedule Type", fieldLength=1)
	scheduleType,
	//
	@FlyElement(columnName="ScrappedQty", name="Scrapped Quantity", description="The Quantity scrapped due to QA issues", dataType=FlyDataType.Quantity, entityType="D", printName="Scrapped Qty", fieldLength=22)
	scrappedQty,
	//
	@FlyElement(columnName="Script", name="脚本", description="Dynamic Java Language Script to calculate result", help="Use Java language constructs to define the result of the calculation", dataType=FlyDataType.Text, entityType="D", printName="脚本", fieldLength=2000)
	script,
	//
	@FlyElement(columnName="ScriptRoll", name="Roll the Script", dataType=FlyDataType.Button, entityType="D", printName="Roll the Script", fieldLength=1)
	scriptRoll,
	//
	@FlyElement(columnName="Search_InOut_ID", name="Search Shipment/Receipt", description="Material Shipment Document", help="The Material Shipment / Receipt ", dataType=FlyDataType.Search, entityType="D", printName="Search Shipment/Receipt", fieldLength=22)
	searchInOutID,
	//
	@FlyElement(columnName="Search_Invoice_ID", name="Search Invoice", description="Search Invoice Identifier", help="The Invoice Document.", dataType=FlyDataType.Search, entityType="D", printName="Search Invoice", fieldLength=22)
	searchInvoiceID,
	//
	@FlyElement(columnName="Search_Order_ID", name="Search Order", description="Order Identifier", help="Order is a control document.", dataType=FlyDataType.Search, entityType="D", printName="Search Order", fieldLength=22)
	searchOrderID,
	//
	@FlyElement(columnName="SearchType", name="Search Type", description="Which kind of search is used (Query or Table)", dataType=FlyDataType.String, entityType="D", printName="Search Type", fieldLength=1)
	searchType,
	//
	@FlyElement(columnName="SecondCountQty", name="Second Count Qty", dataType=FlyDataType.NONE, entityType="D", printName="2nd Count", fieldLength=0)
	secondCountQty,
	//
	@FlyElement(columnName="SelectClause", name="select子句", description="SQL select子句", help="The Select Clause indicates the SQL SELECT clause to use for selecting the record for a measure calculation.", dataType=FlyDataType.Text, entityType="D", printName="select子句", fieldLength=2000)
	selectClause,
	//
	@FlyElement(columnName="SendDunningLetter", name="寄催讨信", description="Indicates if dunning letters will be sent", help="The Send Dunning Letters checkbox indicates if dunning letters will be sent to Business Partners who use this dunning rule.", dataType=FlyDataType.YesNo, entityType="D", printName="寄催讨信", fieldLength=1)
	sendDunningLetter,
	//
	@FlyElement(columnName="SendEMail", name="发送电子邮件", description="使送文件电子邮件能够", help="Send emails with document attached (e.g. Invoice, Delivery Note, etc.)", dataType=FlyDataType.YesNo, entityType="D", printName="发送电子邮件", fieldLength=1)
	sendEMail,
	//
	@FlyElement(columnName="SendInquiry", name="发送查询", description="可用数量查询", dataType=FlyDataType.YesNo, entityType="D", printName="发送查询", fieldLength=1)
	sendInquiry,
	//
	@FlyElement(columnName="SendIt", name="Send", dataType=FlyDataType.Button, entityType="D", printName="Send", fieldLength=1)
	sendIt,
	//
	@FlyElement(columnName="SendOrder", name="发送定单", dataType=FlyDataType.YesNo, entityType="D", printName="发送定单", fieldLength=1)
	sendOrder,
	//
	@FlyElement(columnName="Separator", name="元素分隔符", description="元素分隔符", help="The Element Separator defines the delimiter printed between elements of the structure", dataType=FlyDataType.String, entityType="D", printName="元素分隔符", fieldLength=1)
	separator,
	//
	@FlyElement(columnName="SeparatorChar", name="Separator Character", dataType=FlyDataType.String, entityType="D", printName="Separator Character", fieldLength=1)
	separatorChar,
	//
	@FlyElement(columnName="SeqNo", name="序列", description="Method of ordering records; lowest number comes first", help="The Sequence indicates the order of records", dataType=FlyDataType.Integer, entityType="D", printName="序列", fieldLength=22)
	seqNo,
	//
	@FlyElement(columnName="SeqNoGrid", name="Grid Sequence", description="Method of ordering records; lowest number comes first", help="The Sequence indicates the order of columns in grid view", dataType=FlyDataType.NONE, entityType="D", printName="Grid Sequence", fieldLength=0)
	seqNoGrid,
	//
	@FlyElement(columnName="Sequence", name="Sequence", dataType=FlyDataType.Number, entityType="D", printName="Sequence", fieldLength=22)
	sequence,
	//
	@FlyElement(columnName="SeriesColumn", name="Series Column", dataType=FlyDataType.NONE, entityType="D", printName="Optional column containing the datasource series", fieldLength=0)
	seriesColumn,
	//
	@FlyElement(columnName="SerNo", name="序列号", description="产品序号 ", help="The Serial Number identifies a tracked, warranted product.  It can only be used when the quantity is 1.", dataType=FlyDataType.String, entityType="D", printName="序列号", fieldLength=40)
	serNo,
	//
	@FlyElement(columnName="SerNoCharEOverwrite", name="SerNo Char End Overwrite", description="Serial Number End Indicator overwrite - default empty", help="If not defined, no character is used", dataType=FlyDataType.String, entityType="D", printName="SerNo Char End", fieldLength=1)
	serNoCharEOverwrite,
	//
	@FlyElement(columnName="SerNoCharSOverwrite", name="SerNo Char Start Overwrite", description="Serial Number Start Indicator overwrite - default #", help="If not defined, the default character # is used", dataType=FlyDataType.String, entityType="D", printName="SerNo Char Start", fieldLength=1)
	serNoCharSOverwrite,
	//
	@FlyElement(columnName="ServiceDate", name="服务日期", description="服务提供日期", help="The Service Date indicates the date that the service was provided.", dataType=FlyDataType.Date, entityType="D", printName="服务日期", fieldLength=7)
	serviceDate,
	//
	@FlyElement(columnName="ServiceLevelInvoiced", name="已开票数量", description="Quantity of product or service invoiced", help="The Quantity Invoiced indicates the total quantity of a product or service that has been invoiced.", dataType=FlyDataType.Number, entityType="D", printName="已开票数量", fieldLength=22)
	serviceLevelInvoiced,
	//
	@FlyElement(columnName="ServiceLevelProvided", name="已提供数量", description="Quantity of service or product provided", help="The Quantity Provided indicates the total quantity of a product or service that has been received by the customer.", dataType=FlyDataType.Number, entityType="D", printName="已供货数量", fieldLength=22)
	serviceLevelProvided,
	//
	@FlyElement(columnName="Session_ID", name="期间ID", dataType=FlyDataType.ID, entityType="D", printName="期间ID", fieldLength=60)
	sessionID,
	//
	@FlyElement(columnName="SetCustomization", name="Only Set Customization", description="Set Customization for change records records with Dictionary Entity Type", dataType=FlyDataType.NONE, entityType="D", printName="Only Set Customization", fieldLength=0)
	setCustomization,
	//
	@FlyElement(columnName="SetFutureCostTo", name="设定未来成本到", description="Set the Future costs to the selection", dataType=FlyDataType.NONE, entityType="D", printName="设定未来成本到", fieldLength=0)
	setFutureCostTo,
	//
	@FlyElement(columnName="SetStandardCostTo", name="设定标准成本", description="Set new Standard Costs from Future Costs", dataType=FlyDataType.NONE, entityType="D", printName="设定标准成本", fieldLength=0)
	setStandardCostTo,
	//
	@FlyElement(columnName="SetupTime", name="Setup Time", description="Setup time before starting Production", help="Once per operation", dataType=FlyDataType.Number, entityType="D", printName="Setup Time", fieldLength=22)
	setupTime,
	//
	@FlyElement(columnName="S_ExpenseType_ID", name="费用类型", description="费用报表类型", dataType=FlyDataType.TableDirect, entityType="D", printName="费用类型", fieldLength=22)
	sExpenseTypeID,
	//
	@FlyElement(columnName="ShapeType", name="Shape Type", description="Type of the shape to be painted", dataType=FlyDataType.List, entityType="D", printName="Shape Type", fieldLength=1)
	shapeType,
	//
	@FlyElement(columnName="ShareOfCustomer", name="提成比例", description="Share of Customer's business as a percentage", help="The Share indicates the percentage of this Business Partner's volume of the products supplied.", dataType=FlyDataType.Integer, entityType="D", printName="提成比例", fieldLength=22)
	shareOfCustomer,
	//
	@FlyElement(columnName="ShareType", name="Share Type", description="Type of sharing", help="Defines if a table is shared within a client or not.", dataType=FlyDataType.List, entityType="D", printName="Share Type", fieldLength=1)
	shareType,
	//
	@FlyElement(columnName="ShelfDepth", name="架深度", description="要求的架深度", help="The Shelf Depth indicates the depth dimension required on a shelf for a product ", dataType=FlyDataType.Integer, entityType="D", printName="架深度", fieldLength=22)
	shelfDepth,
	//
	@FlyElement(columnName="ShelfHeight", name="架高度", description="要求的架高度", help="The Shelf Height indicates the height dimension required on a shelf for a product", dataType=FlyDataType.Amount, entityType="D", printName="架高度", fieldLength=22)
	shelfHeight,
	//
	@FlyElement(columnName="ShelfLifeDays", name="Shelf Life Days", description="Shelf Life in days based on Product Instance Guarantee Date", help="Shelf Life of products with Guarantee Date instance compared to today.", dataType=FlyDataType.Integer, entityType="D", printName="Shelf Life Days", fieldLength=22)
	shelfLifeDays,
	//
	@FlyElement(columnName="ShelfLifeMinDays", name="Min Shelf Life Days", description="Minimum Shelf Life in days based on Product Instance Guarantee Date", help="Miminum Shelf Life of products with Guarantee Date instance. If > 0 you cannot select products with a shelf life less than the minum shelf life, unless you select 'Show All'", dataType=FlyDataType.Integer, entityType="D", printName="Min Shelf Life Days", fieldLength=22)
	shelfLifeMinDays,
	//
	@FlyElement(columnName="ShelfLifeMinPct", name="Min Shelf Life %", description="Minimum Shelf Life in percent based on Product Instance Guarantee Date", help="Miminum Shelf Life of products with Guarantee Date instance. If > 0 you cannot select products with a shelf life ((Guarantee Date-Today) / Guarantee Days) less than the minum shelf life, unless you select 'Show All'", dataType=FlyDataType.Integer, entityType="D", printName="Min Shelf Life %", fieldLength=22)
	shelfLifeMinPct,
	//
	@FlyElement(columnName="ShelfLifeRemainingPct", name="Remaining Shelf Life %", description="Remaining shelf life in percent based on Guarantee Date", help="(Guarantee Date-Today) / Guarantee Days", dataType=FlyDataType.Integer, entityType="D", printName="Rem Shelf Life %", fieldLength=22)
	shelfLifeRemainingPct,
	//
	@FlyElement(columnName="ShelfWidth", name="架宽度", description="要求的架宽度", help="The Shelf Width indicates the width dimension required on a shelf for a product", dataType=FlyDataType.Integer, entityType="D", printName="架宽度", fieldLength=22)
	shelfWidth,
	//
	@FlyElement(columnName="ShipDate", name="发运日期", description="Shipment Date Time", help="Actual Date Time of Shipment (pick up)", dataType=FlyDataType.DateTime, entityType="D", printName="发运日期", fieldLength=7)
	shipDate,
	//
	@FlyElement(columnName="ShipDescription", name="Ship Description", dataType=FlyDataType.String, entityType="D", printName="Ship Description", fieldLength=255)
	shipDescription,
	//
	@FlyElement(columnName="Shipment_MailText_ID", name="物料出货邮件本文", description="Email text used for sending delivery notes", help="Standard email template used to send delivery notes as attachments.", dataType=FlyDataType.Table, entityType="D", printName="物料出货邮件本文", fieldLength=22)
	shipmentMailTextID,
	//
	@FlyElement(columnName="Shipment_PrintFormat_ID", name="物料出货打印格式", description="Print Format for Shipments, Receipts, Pick Lists", help="You need to define a Print Format to print the document.", dataType=FlyDataType.Table, entityType="D", printName="物料出货打印格式", fieldLength=22)
	shipmentPrintFormatID,
	//
	@FlyElement(columnName="ShowActualAmt", name="显示实际金额", dataType=FlyDataType.NONE, entityType="D", printName="显示实际金额", fieldLength=0)
	showActualAmt,
	//
	@FlyElement(columnName="ShowCommittedAmt", name="显示委托金额", dataType=FlyDataType.NONE, entityType="D", printName="显示委托金额", fieldLength=0)
	showCommittedAmt,
	//
	@FlyElement(columnName="ShowHelp", name="Show Help", dataType=FlyDataType.List, entityType="D", printName="Show Help", fieldLength=1)
	showHelp,
	//
	@FlyElement(columnName="ShowPlannedAmt", name="显示已计划金额", dataType=FlyDataType.NONE, entityType="D", printName="显示已计划金额", fieldLength=0)
	showPlannedAmt,
	//
	@FlyElement(columnName="ShowPlannedMarginAmt", name="显示已计划差额金额", dataType=FlyDataType.NONE, entityType="D", printName="显示已计划差额金额", fieldLength=0)
	showPlannedMarginAmt,
	//
	@FlyElement(columnName="ShowPlannedQty", name="显示已计划数量", dataType=FlyDataType.NONE, entityType="D", printName="显示已计划数量", fieldLength=0)
	showPlannedQty,
	//
	@FlyElement(columnName="SizeX", name="Size X", description="X (horizontal) dimension size", help="Size of X (horizontal) dimension in Units", dataType=FlyDataType.Number, entityType="D", printName="Size X", fieldLength=5)
	sizeX,
	//
	@FlyElement(columnName="SizeY", name="Size Y", description="Y (vertical) dimension size", help="Size of Y (vertical) dimension in Units", dataType=FlyDataType.Number, entityType="D", printName="Size Y", fieldLength=5)
	sizeY,
	//
	@FlyElement(columnName="SKU", name="SKU", description="存货保管单位", help="The SKU indicates a user defined stock keeping unit.  It may be used for an additional bar code symbols or your own schema.", dataType=FlyDataType.String, entityType="D", printName="SKU", fieldLength=30)
	sKU,
	//
	@FlyElement(columnName="SMTPHost", name="邮件主机", description="Hostname of Mail Server for SMTP and IMAP", help="The host name of the Mail Server for this client with SMTP services to send mail, and IMAP to process incoming mail.", dataType=FlyDataType.String, entityType="D", printName="邮件主机", fieldLength=60)
	sMTPHost,
	//
	@FlyElement(columnName="SO_CreditAvailable", name="可用信用", description="可用信用", dataType=FlyDataType.Amount, entityType="D", printName="可用信用", fieldLength=22)
	sOCreditAvailable,
	//
	@FlyElement(columnName="SO_CreditLimit", name="信用额度", description="Total outstanding invoice amounts allowed", help="The Credit Limit indicates the total amount allowed 'on account'.  If this is exceeded a warning message will be generated.", dataType=FlyDataType.Amount, entityType="D", printName="信用额度", fieldLength=22)
	sOCreditLimit,
	//
	@FlyElement(columnName="SOCreditStatus", name="Credit Status", description="Sales Credit Status", help="For Documentation only", dataType=FlyDataType.List, entityType="D", printName="Credit Status", fieldLength=1)
	sOCreditStatus,
	//
	@FlyElement(columnName="SO_CreditUsed", name="已用信用", description="当前未结余款", help="The Credit Used indicates the total amount of open or unpaid invoices for this Business Partner.", dataType=FlyDataType.Amount, entityType="D", printName="已用信用", fieldLength=22)
	sOCreditUsed,
	//
	@FlyElement(columnName="SO_Description", name="定单描述", description="Description to be used on orders", help="The Order Description identifies the standard description to use on orders for this Customer.", dataType=FlyDataType.String, entityType="D", printName="定单描述", fieldLength=255)
	sODescription,
	//
	@FlyElement(columnName="SOPOType", name="SO/PO Type", description="Sales Tax applies to sales situations, Purchase Tax to purchase situations", help="Sales Tax: charged when selling - examples: Sales Tax, Output VAT (payable)	Purchase Tax: tax charged when purchasing - examples: Use Tax, Input VAT (receivable)", dataType=FlyDataType.List, entityType="D", printName="SO/PO Type", fieldLength=1)
	sOPOType,
	//
	@FlyElement(columnName="SO_PriceList_ID", name="Sales Pricelist", dataType=FlyDataType.Table, entityType="D", printName="Sales Pricelist", fieldLength=22)
	sOPriceListID,
	//
	@FlyElement(columnName="SortNo", name="记录排序号", description="决定记录按怎样的顺序显示。", help="The Record Sort No indicates the ascending sort sequence of the records", dataType=FlyDataType.Number, entityType="D", printName="记录排序号", fieldLength=22)
	sortNo,
	//
	@FlyElement(columnName="SourceClassName", name="Source Class", description="Source Class Name", dataType=FlyDataType.String, entityType="D", printName="Source Class", fieldLength=60)
	sourceClassName,
	//
	@FlyElement(columnName="SourceMethodName", name="Source Method", description="Source Method Name", dataType=FlyDataType.String, entityType="D", printName="Source Method", fieldLength=60)
	sourceMethodName,
	//
	@FlyElement(columnName="SourceUpdated", name="Source Updated", description="Date the source document was updated", dataType=FlyDataType.DateTime, entityType="D", printName="Source Updated", fieldLength=7)
	sourceUpdated,
	//
	@FlyElement(columnName="SpanX", name="Column span", description="Number of columns spanned", dataType=FlyDataType.Integer, entityType="D", printName="Column span", fieldLength=10)
	spanX,
	//
	@FlyElement(columnName="SpanY", name="Row Span", description="Number of rows spanned", dataType=FlyDataType.Integer, entityType="D", printName="Row Span", fieldLength=10)
	spanY,
	//
	@FlyElement(columnName="SplitElement", name="Split元素", description="Semantics for multiple outgoing Transitions", help="Semantics for multiple outgoing Transitions for a Node/Activity.  AND represents multiple concurrent threads - XOR represents the first transition with a true Transaition condition.", dataType=FlyDataType.List, entityType="D", printName="Split元素", fieldLength=1)
	splitElement,
	//
	@FlyElement(columnName="SQLStatement", name="SQLStatement", dataType=FlyDataType.Memo, entityType="D", printName="SQLStatement", fieldLength=2000)
	sQLStatement,
	//
	@FlyElement(columnName="S_ResourceAssignment_ID", name="资源任务", description="资源任务", dataType=FlyDataType.Assignment, entityType="D", printName="任务", fieldLength=22)
	sResourceAssignmentID,
	//
	@FlyElement(columnName="S_Resource_ID", name="资源", description="资源", dataType=FlyDataType.TableDirect, entityType="D", printName="资源", fieldLength=22)
	sResourceID,
	//
	@FlyElement(columnName="S_ResourceType_ID", name="资源类型", dataType=FlyDataType.TableDirect, entityType="D", printName="资源类型", fieldLength=22)
	sResourceTypeID,
	//
	@FlyElement(columnName="S_ResourceUnAvailable_ID", name="资源不可用", dataType=FlyDataType.ID, entityType="D", printName="资源不可用", fieldLength=22)
	sResourceUnAvailableID,
	//
	@FlyElement(columnName="StackTrace", name="Stack Trace", description="System Log Trace", dataType=FlyDataType.Text, entityType="D", printName="Stack Trace", fieldLength=2000)
	stackTrace,
	//
	@FlyElement(columnName="StandardHours", name="Standard Hours", description="Standard Work Hours based on Remuneration Type", help="Number of hours per Remuneration Type (e.g. Daily 8 hours, Weekly 40 hours, etc.) to determine when overtime starts", dataType=FlyDataType.Integer, entityType="D", printName="Standard Hours", fieldLength=10)
	standardHours,
	//
	@FlyElement(columnName="StandardQty", name="标准量", description="标准量", dataType=FlyDataType.Quantity, entityType="D", printName="标准量", fieldLength=22)
	standardQty,
	//
	@FlyElement(columnName="StartDate", name="开始日期", description="First effective day (inclusive)", help="The Start Date indicates the first or starting date of a range.", dataType=FlyDataType.Date, entityType="D", printName="开始日期", fieldLength=7)
	startDate,
	//
	@FlyElement(columnName="StartImpression", name="Start Count Impression", description="For rotation we need a start count", help="If we run banners in rotation we always show the one with the min of impressions, so if a new banner is added to impressions we don't want it to show up so often we set a startimpressions value. StartImpression+ActualImpression=CurrentImpression", dataType=FlyDataType.Integer, entityType="D", printName="Start Count Impression", fieldLength=10)
	startImpression,
	//
	@FlyElement(columnName="StartMode", name="启动方式", description="工作流活动的启动方式", help="How is the execution of an activity triggered. Automatic are triggered implicitly by the system, Manual explicitly by the User.", dataType=FlyDataType.List, entityType="D", printName="启动方式", fieldLength=1)
	startMode,
	//
	@FlyElement(columnName="StartNewYear", name="序列每年重新开始", description="Restart the sequence with Start on every 1 1", help="The Restart Sequence Every Year checkbox indicates that the documents sequencing should return to the starting number on the first day of the year.", dataType=FlyDataType.YesNo, entityType="D", printName="序列每年重新开始", fieldLength=1)
	startNewYear,
	//
	@FlyElement(columnName="StartNo", name="开始号", description="Starting number position", help="The Start Number indicates the starting number of the document or position", dataType=FlyDataType.Integer, entityType="D", printName="开始号", fieldLength=22)
	startNo,
	//
	@FlyElement(columnName="StartPoint", name="开始点", description="Start point of the gradient colors", help="The gradient starts at the start point (e.g. North). The repeat distance determines if and how often the gradient colors are repeated.  If starting from southern points, the upper color is actually at the button.", dataType=FlyDataType.List, entityType="D", printName="开始点", fieldLength=22)
	startPoint,
	//
	@FlyElement(columnName="StartProductionDate", name="实施或上线开始日期", description="The day you started the implementation (if implementing) - or production (went life) with Adempiere", dataType=FlyDataType.Date, entityType="D", printName="实施或上线开始日期", fieldLength=7)
	startProductionDate,
	//
	@FlyElement(columnName="StartTime", name="Start Time", description="Time started", dataType=FlyDataType.DateTime, entityType="D", printName="Start Time", fieldLength=7)
	startTime,
	//
	@FlyElement(columnName="StatementDate", name="对帐单日期", description="Date of processing a statement", help="The Statement Date field defines the date of the statement being processed.", dataType=FlyDataType.Date, entityType="D", printName="对帐单日期", fieldLength=7)
	statementDate,
	//
	@FlyElement(columnName="StatementDifference", name="对帐单差额", description="Difference between statement ending balance and actual ending balance", help="The Statement Difference reflects the difference between the Statement Ending Balance and the Actual Ending Balance.", dataType=FlyDataType.Amount, entityType="D", printName="对帐单差额", fieldLength=22)
	statementDifference,
	//
	@FlyElement(columnName="StatementLineDate", name="Statement Line Date", description="Date of the Statement Line", dataType=FlyDataType.Date, entityType="D", printName="Statement Line Date", fieldLength=7)
	statementLineDate,
	//
	@FlyElement(columnName="Statistic_Count", name="统计计数", description="Internal statistics how often the entity was used", help="For internal use.", dataType=FlyDataType.Integer, entityType="D", printName="统计计数", fieldLength=22)
	statisticCount,
	//
	@FlyElement(columnName="Statistic_Seconds", name="统计数值秒", description="Internal statistics how many seconds a process took", help="对于内在的使用", dataType=FlyDataType.Integer, entityType="D", printName="统计数值秒", fieldLength=22)
	statisticSeconds,
	//
	@FlyElement(columnName="StatisticsInfo", name="Statistics", description="Information to help profiling the system for solving support issues", help="Profile information do not contain sensitive information and are used to support issue detection and diagnostics as well as general anonymous statistics", dataType=FlyDataType.String, entityType="D", printName="Statistics", fieldLength=60)
	statisticsInfo,
	//
	@FlyElement(columnName="Status", name="Status", description="Status of the currently running check", help="Status of the currently running check", dataType=FlyDataType.List, entityType="D", printName="Status", fieldLength=2)
	status,
	//
	@FlyElement(columnName="StatusCode", name="Status Code", dataType=FlyDataType.Integer, entityType="D", printName="Status Code", fieldLength=10)
	statusCode,
	//
	@FlyElement(columnName="Std_AddAmt", name="标准价格额外费", description=" 加到价格中作为额外费的金额", help="The Standard Price Surcharge Amount indicates the amount to be added to the price prior to multiplication.	", dataType=FlyDataType.Amount, entityType="D", printName="标准价格额外费", fieldLength=22)
	stdAddAmt,
	//
	@FlyElement(columnName="Std_Base", name="标准价格基础", description="Base price for calculating new standard price", help="The Standard Price Base indicates the price to use as the basis for the calculation of a new price standard.	", dataType=FlyDataType.List, entityType="D", printName="标准价格基础", fieldLength=1)
	stdBase,
	//
	@FlyElement(columnName="Std_Discount", name="标准价格折扣 %", description="Discount percentage to subtract from base price", help="The Standard Price Discount Percentage indicates the percentage discount which will be subtracted from the base price.  A negative amount indicates the percentage which will be added to the base price.", dataType=FlyDataType.Number, entityType="D", printName="标准价格折扣 %", fieldLength=22)
	stdDiscount,
	//
	@FlyElement(columnName="Std_Fixed", name="固定的标准价格", description="Fixed Standard Price (not calculated)", dataType=FlyDataType.Amount, entityType="D", printName="固定的标准", fieldLength=22)
	stdFixed,
	//
	@FlyElement(columnName="Std_MaxAmt", name="标准最大差额", description="Maximum margin allowed for a product", help="The Standard Price Max Margin indicates the maximum margin for a product.  The margin is calculated by subtracting the original Standard price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="标准最大差额", fieldLength=22)
	stdMaxAmt,
	//
	@FlyElement(columnName="Std_MinAmt", name="标准价格最小差额", description="Minimum margin allowed for a product", help="The Standard Price Min Margin indicates the minimum margin for a product.  The margin is calculated by subtracting the original Standard price from the newly calculated price.  If this field contains 0.00 then it is ignored.", dataType=FlyDataType.Amount, entityType="D", printName="标准价格最小差额", fieldLength=22)
	stdMinAmt,
	//
	@FlyElement(columnName="StdPrecision", name="标准精度", description="Rule for rounding  calculated amounts", help="The Standard Precision defines the number of decimal places that amounts will be rounded to for accounting transactions and documents.", dataType=FlyDataType.Integer, entityType="D", printName="标准精度", fieldLength=22)
	stdPrecision,
	//
	@FlyElement(columnName="Std_Rounding", name="标准价格圆整", description="Rounding rule for calculated price", help="The Standard Price Rounding indicates how the final Standard price will be rounded.", dataType=FlyDataType.List, entityType="D", printName="标准价格圆整", fieldLength=1)
	stdRounding,
	//
	@FlyElement(columnName="StepType", name="Step type", description="Migration step type", dataType=FlyDataType.NONE, entityType="D", printName="Step Type", fieldLength=0)
	stepType,
	//
	@FlyElement(columnName="S_TimeExpense_ID", name="费用报表", description="时间和费用报表", dataType=FlyDataType.ID, entityType="D", printName="费用报表", fieldLength=22)
	sTimeExpenseID,
	//
	@FlyElement(columnName="S_TimeExpenseLine_ID", name="费用明细", description="时间和费用报表行", dataType=FlyDataType.ID, entityType="D", printName="费用明细", fieldLength=22)
	sTimeExpenseLineID,
	//
	@FlyElement(columnName="S_TimeType_ID", name="时间类型", description="时间的类型记录", help="Differentiate time types for reporting purposes (In parallel to Activities)", dataType=FlyDataType.TableDirect, entityType="D", printName="时间类型", fieldLength=22)
	sTimeTypeID,
	//
	@FlyElement(columnName="StmtAmt", name="对帐单金额", description="对帐单金额", help="The Statement Amount indicates the amount of a single statement line.", dataType=FlyDataType.Amount, entityType="D", printName="对帐单金额", fieldLength=22)
	stmtAmt,
	//
	@FlyElement(columnName="StmtLoaderClass", name="Statement Loader Class", description="Class name of the bank statement loader", help="The name of the actual bank statement loader implementing the interface org.compiere.impexp.BankStatementLoaderInterface", dataType=FlyDataType.String, entityType="D", printName="Statement Loader Class", fieldLength=60)
	stmtLoaderClass,
	//
	@FlyElement(columnName="StoreArchiveOnFileSystem", name="Store Archive On File System", dataType=FlyDataType.YesNo, entityType="D", printName="Store Archive On File System", fieldLength=1)
	storeArchiveOnFileSystem,
	//
	@FlyElement(columnName="StoreAttachmentsOnFileSystem", name="Store Attachments On File System", dataType=FlyDataType.YesNo, entityType="D", printName="Store Attachments On File System", fieldLength=1)
	storeAttachmentsOnFileSystem,
	//
	@FlyElement(columnName="S_Training_Class_ID", name="训练类", description="The actual training class instance", help="一个预定的类", dataType=FlyDataType.ID, entityType="D", printName="训练类", fieldLength=22)
	sTrainingClassID,
	//
	@FlyElement(columnName="S_Training_ID", name="训练", description="重复的训练", help="The training may have multiple actual classes", dataType=FlyDataType.TableDirect, entityType="D", printName="训练", fieldLength=22)
	sTrainingID,
	//
	@FlyElement(columnName="StructureXML", name="StructureXML", description="Autogenerated Containerdefinition as XML Code", help="Autogenerated Containerdefinition as XML Code", dataType=FlyDataType.Text, entityType="D", printName="StructureXML", fieldLength=2000)
	structureXML,
	//
	@FlyElement(columnName="Stylesheet", name="Stylesheet", description="CSS (Stylesheet) used", help="Base Stylesheet (.css file) to use - if empty, the default (standard.css) is used. The Style sheet can be a URL.", dataType=FlyDataType.String, entityType="D", printName="Stylesheet", fieldLength=60)
	stylesheet,
	//
	@FlyElement(columnName="SubAcctValue", name="Sub Account Value", description="Sub account Value", help="The Element Value (e.g. Account) may have optional sub accounts Value for further detail. The sub account is dependent on the value of the account, so a further specification. If the sub-accounts are more or less the same, consider using another accounting dimension.", dataType=FlyDataType.String, entityType="D", printName="Sub Acct", fieldLength=40)
	subAcctValue,
	//
	@FlyElement(columnName="SubflowExecution", name="Subflow Execution", description="Mode how the sub-workflow is executed", dataType=FlyDataType.List, entityType="D", printName="Subflow Execution", fieldLength=1)
	subflowExecution,
	//
	@FlyElement(columnName="Subject", name="Subject", description="Email Message Subject", help="Subject of the EMail ", dataType=FlyDataType.Text, entityType="D", printName="Subject", fieldLength=255)
	subject,
	//
	@FlyElement(columnName="SubKeyLayout_ID", name="Key Layout", description="Key Layout to be displayed when this key is pressed", dataType=FlyDataType.Table, entityType="D", printName="Key Layout", fieldLength=22)
	subKeyLayoutID,
	//
	@FlyElement(columnName="SubscribeDate", name="订购日期", description="Date the contact actively subscribed", help="Date the contact subscribe the interest area", dataType=FlyDataType.Date, entityType="D", printName="订购日期", fieldLength=7)
	subscribeDate,
	//
	@FlyElement(columnName="Substitute_ID", name="替代", description="Product which can be used in place of another product", help="The Substitute identifies the product to be used as a substitute for this product.", dataType=FlyDataType.Search, entityType="D", printName="替代", fieldLength=22)
	substituteID,
	//
	@FlyElement(columnName="Success", name="Success", dataType=FlyDataType.String, entityType="D", printName="Success", fieldLength=20)
	success,
	//
	@FlyElement(columnName="Suffix", name="后缀", description="在数字後面的后缀", help="The Suffix indicates the characters to append to the document number.", dataType=FlyDataType.String, entityType="D", printName="后缀", fieldLength=255)
	suffix,
	//
	@FlyElement(columnName="SuggestedRequisitionReport", name="Generate Suggested Requisition Report", dataType=FlyDataType.Button, entityType="D", printName="Generate Suggested Requisition Report", fieldLength=1)
	suggestedRequisitionReport,
	//
	@FlyElement(columnName="Summary", name="汇总", description="Textual summary of this request", help="The Summary allows free form text entry of a recap of this request.", dataType=FlyDataType.Text, entityType="D", printName="汇总", fieldLength=2000)
	summary,
	//
	@FlyElement(columnName="SumQtyOnHand", name="Sum Qty on Hand", description="Summary of product on hand in all locators", dataType=FlyDataType.Quantity, entityType="D", printName="Sum Qty on Hand", fieldLength=131089)
	sumQtyOnHand,
	//
	@FlyElement(columnName="Supervisor_ID", name="管理者", description="Supervisor for this user - used for escalation", help="The Supervisor indicates who will be used for forwarding and escalating issues for this user.", dataType=FlyDataType.Search, entityType="D", printName="管理者", fieldLength=22)
	supervisorID,
	//
	@FlyElement(columnName="SupportEMail", name="Support EMail", description="EMail address to send support information and updates to", help="If not entered the registered email is used.", dataType=FlyDataType.String, entityType="D", printName="Support EMail", fieldLength=60)
	supportEMail,
	//
	@FlyElement(columnName="SupportExpDate", name="Support Expires", description="Date when the Adempiere support expires", help="Check http://www.adempiere.org for support options", dataType=FlyDataType.Date, entityType="D", printName="Support Expires", fieldLength=7)
	supportExpDate,
	//
	@FlyElement(columnName="SupportUnits", name="内部用户数", description="Adempiere技术支持的单位数", help="You can purchase commercial support from ComPiere, Inc.	The fee is per 10 internal users. The number of od support units is displayed here.", dataType=FlyDataType.Integer, entityType="D", printName="内部用户数", fieldLength=22)
	supportUnits,
	//
	@FlyElement(columnName="SuspenseBalancing_Acct", name="暂记平衡帐户", dataType=FlyDataType.Account, entityType="D", printName="暂记平衡帐户", fieldLength=22)
	suspenseBalancingAcct,
	//
	@FlyElement(columnName="SuspenseError_Acct", name="暂记错误帐户", dataType=FlyDataType.Account, entityType="D", printName="暂记错误帐户", fieldLength=22)
	suspenseErrorAcct,
	//
	@FlyElement(columnName="SwiftCode", name="金融电信学会编码", description="Swift Code (Society of Worldwide Interbank Financial Telecommunications)", help="The SWIFT code is an identifier of a Bank", dataType=FlyDataType.String, entityType="D", printName="金融电信学会编码", fieldLength=20)
	swiftCode,
	//
	@FlyElement(columnName="Swipe", name="Swipe", description="Track 1 and 2 of the Credit Card", help="Swiped information for Credit Card Presence Transactions", dataType=FlyDataType.String, entityType="D", printName="Swipe", fieldLength=80)
	swipe,
	//
	@FlyElement(columnName="SynonymName", name="同义字", description="同义字为名字", help="The synonym broadens the search", dataType=FlyDataType.String, entityType="D", printName="同义字", fieldLength=60)
	synonymName,
	//
	@FlyElement(columnName="SystemStatus", name="System Status", description="Status of the system - Support priority depends on system status", help="System status helps to prioritize support resources", dataType=FlyDataType.List, entityType="D", printName="System Status", fieldLength=1)
	systemStatus,
	//
	@FlyElement(columnName="TableName", name="数据库表名字", description="Name of the table in the database", help="The DB Table Name indicates the name of the table in database.", dataType=FlyDataType.String, entityType="D", printName="数据库表名字", fieldLength=40)
	tableName,
	//
	@FlyElement(columnName="TabLevel", name="定位键水平", description="Hierarchical Tab Level (0 = top)", help="Hierarchical level of the tab. If the level is 0, it is the top entity. Level 1 entries are dependent on level 0, etc.", dataType=FlyDataType.Integer, entityType="D", printName="定位键水平", fieldLength=22)
	tabLevel,
	//
	@FlyElement(columnName="T_Amount", name="金额", dataType=FlyDataType.Amount, entityType="D", printName="金额", fieldLength=22)
	tAmount,
	//
	@FlyElement(columnName="Target_Directory", name="Target_Directory", dataType=FlyDataType.String, entityType="D", printName="Target_Directory", fieldLength=255)
	targetDirectory,
	//
	@FlyElement(columnName="Target_Frame", name="Target Frame", description="Which target should be used if user clicks?", help="Do we want the content to stay in same window, to open up a new one or to place it in a special frame?", dataType=FlyDataType.String, entityType="D", printName="Target Frame", fieldLength=20)
	targetFrame,
	//
	@FlyElement(columnName="TargetQty", name="Target Quantity", description="Target Movement Quantity", help="The Quantity which should have been received", dataType=FlyDataType.Quantity, entityType="D", printName="Target Qty", fieldLength=22)
	targetQty,
	//
	@FlyElement(columnName="TargetURL", name="目标网址", description="网址为目标", help="目标位置的网址", dataType=FlyDataType.URL, entityType="D", printName="目标网址", fieldLength=120)
	targetURL,
	//
	@FlyElement(columnName="TaskStatus", name="Task Status", description="Status of the Task", help="Completion Rate and Status of the Task", dataType=FlyDataType.List, entityType="D", printName="Task Status", fieldLength=1)
	taskStatus,
	//
	@FlyElement(columnName="TaxAmt", name="税金额", description="文档税金额", help="The Tax Amount displays the total tax amount for a document.", dataType=FlyDataType.Amount, entityType="D", printName="税", fieldLength=22)
	taxAmt,
	//
	@FlyElement(columnName="TaxBaseAmt", name="税基金额", description="Base for calculating the tax amount", help="The Tax Base Amount indicates the base amount used for calculating the tax amount.", dataType=FlyDataType.Amount, entityType="D", printName="税基金额", fieldLength=22)
	taxBaseAmt,
	//
	@FlyElement(columnName="TaxCategoryName", name="Tax Category Name", description="Name of tax category", dataType=FlyDataType.String, entityType="D", printName="Tax Category Name", fieldLength=60)
	taxCategoryName,
	//
	@FlyElement(columnName="TaxCorrectionType", name="Tax Correction", description="Type of Tax Correction", help="Determines if/when tax is corrected. Discount could be agreed or granted underpayments; Write-off may be partial or complete write-off.", dataType=FlyDataType.List, entityType="D", printName="Tax Correction", fieldLength=1)
	taxCorrectionType,
	//
	@FlyElement(columnName="TaxID", name="税号", description="税务号", help="The Tax ID field identifies the legal Identification number of this Entity.", dataType=FlyDataType.String, entityType="D", printName="税号", fieldLength=20)
	taxID,
	//
	@FlyElement(columnName="TaxIndicator", name="税标记", description="Short form for Tax to be printed on documents", help="The Tax Indicator identifies the short name that will print on documents referencing this tax.", dataType=FlyDataType.String, entityType="D", printName="税标记", fieldLength=10)
	taxIndicator,
	//
	@FlyElement(columnName="TaxLineTotal", name="Tax Line Total", description="Tax Line Total Amount", dataType=FlyDataType.Amount, entityType="D", printName="Line Total", fieldLength=22)
	taxLineTotal,
	//
	@FlyElement(columnName="T_BOM_Indented_ID", name="Indented BOM Report", dataType=FlyDataType.ID, entityType="D", printName="Indented BOM Report", fieldLength=10)
	tBOMIndentedID,
	//
	@FlyElement(columnName="T_Credit_Acct", name="税信用", description="Account for Tax you can reclaim", help="The Tax Credit Account indicates the account used to record taxes that can be reclaimed", dataType=FlyDataType.Account, entityType="D", printName="税信用", fieldLength=22)
	tCreditAcct,
	//
	@FlyElement(columnName="T_Date", name="日期", dataType=FlyDataType.Date, entityType="D", printName="日期", fieldLength=7)
	tDate,
	//
	@FlyElement(columnName="T_DateTime", name="日期时间", dataType=FlyDataType.DateTime, entityType="D", printName="日期时间", fieldLength=7)
	tDateTime,
	//
	@FlyElement(columnName="T_Due_Acct", name="应付税", description="Account for Tax you have to pay", help="The Tax Due Account indicates the account used to record taxes that you are liable to pay.", dataType=FlyDataType.Account, entityType="D", printName="应付税", fieldLength=22)
	tDueAcct,
	//
	@FlyElement(columnName="TeardownTime", name="Teardown Time", description="Time at the end of the operation", help="Once per operation", dataType=FlyDataType.Number, entityType="D", printName="Teardown Time", fieldLength=22)
	teardownTime,
	//
	@FlyElement(columnName="TemplateXST", name="TemplateXST", description="Contains the template code itself", help="Here we include the template code itself", dataType=FlyDataType.LongText, entityType="D", printName="TemplateXST", fieldLength=0)
	templateXST,
	//
	@FlyElement(columnName="TenderType", name="投标类型", description="付款方法", help="The Tender Type indicates the method of payment (ACH, Credit Card, Check)", dataType=FlyDataType.List, entityType="D", printName="投标类型", fieldLength=1)
	tenderType,
	//
	@FlyElement(columnName="Test_ID", name="测试ID", dataType=FlyDataType.ID, entityType="D", printName="测试ID", fieldLength=22)
	testID,
	//
	@FlyElement(columnName="TestValue", name="Test Value", description="Value to test", dataType=FlyDataType.NONE, entityType="D", printName="Test Value", fieldLength=0)
	testValue,
	//
	@FlyElement(columnName="T_Expense_Acct", name="税费用", description="Account for paid tax you cannot reclaim", help="The Tax Expense Account indicates the account used to record the taxes that have been paid that cannot be reclaimed.", dataType=FlyDataType.Account, entityType="D", printName="税费用", fieldLength=22)
	tExpenseAcct,
	//
	@FlyElement(columnName="Text", name="Description", dataType=FlyDataType.Memo, entityType="D", printName="Description", fieldLength=2000)
	text,
	//
	@FlyElement(columnName="TextDetails", name="Details", dataType=FlyDataType.Text, entityType="D", printName="Details", fieldLength=4000)
	textDetails,
	//
	@FlyElement(columnName="TextMsg", name="文本消息", description="文本消息", dataType=FlyDataType.Text, entityType="D", printName="消息", fieldLength=2000)
	textMsg,
	//
	@FlyElement(columnName="ThresholdMax", name="门槛最大", description="Maximum gross amount for withholding calculation  (0=no limit)", help="The Threshold maximum indicates the maximum gross amount to be used in the withholding calculation .  A value of 0 indicates there is no limit.", dataType=FlyDataType.Amount, entityType="D", printName="门槛最大", fieldLength=22)
	thresholdMax,
	//
	@FlyElement(columnName="Thresholdmin", name="最小阈值", description="Minimum gross amount for withholding calculation", help="The Threshold Minimum indicates the minimum gross amount to be used in the withholding calculation.", dataType=FlyDataType.Amount, entityType="D", printName="最小阈值", fieldLength=22)
	thresholdmin,
	//
	@FlyElement(columnName="TicketClassName", name="Ticket Handler Class Name", description="Java Classname for Ticket Handler", help="The Classname identifies the Java classname used by this report or process.", dataType=FlyDataType.String, entityType="D", printName="Ticket Handler Class Name", fieldLength=60)
	ticketClassName,
	//
	@FlyElement(columnName="TimeOffset", name="Time Offset", description="Number of time units to offset displayed chart data from the current date.", help="For example an offset of -12 with a chart time unit of Month will result in previous year data being displayed.", dataType=FlyDataType.Integer, entityType="D", printName="Time Offset", fieldLength=10)
	timeOffset,
	//
	@FlyElement(columnName="Timeout", name="Timeout", description="Is Timeout (In milliseconds) for sending or receive data", dataType=FlyDataType.Integer, entityType="D", printName="Timeout", fieldLength=0)
	timeout,
	//
	@FlyElement(columnName="TimeoutDays", name="Timeout in Days", description="Timeout in Days to change Status automatically", help="After the number of days of inactivity, the status is changed automatically to the Next Status.  If no Next Status is defined, the status is not changed.", dataType=FlyDataType.Integer, entityType="D", printName="Timeout Days", fieldLength=10)
	timeoutDays,
	//
	@FlyElement(columnName="TimePattern", name="Time Pattern", description="Java Time Pattern", help="Option Time pattern in Java notation. Examples: 'hh:mm:ss aaa z' - 'HH:mm:ss'	If the pattern for your language is not correct, please create a Adempiere support request with the correct information", dataType=FlyDataType.String, entityType="D", printName="Time Pattern", fieldLength=20)
	timePattern,
	//
	@FlyElement(columnName="TimeScope", name="Time Scope", description="The number of time units to include the chart result.", dataType=FlyDataType.Integer, entityType="D", printName="Time Scope", fieldLength=10)
	timeScope,
	//
	@FlyElement(columnName="TimesDunned", name="Times Dunned", description="Number of times dunned previously", dataType=FlyDataType.Integer, entityType="D", printName="# Dunned", fieldLength=22)
	timesDunned,
	//
	@FlyElement(columnName="TimeSlotEnd", name="时间段结束", description="时间段结束", help="终止时间时间留细长的孔", dataType=FlyDataType.Time, entityType="D", printName="时间段结束", fieldLength=7)
	timeSlotEnd,
	//
	@FlyElement(columnName="TimeSlotStart", name="时间段开始", description="时间段开始", help="出发时间时间留细长的孔", dataType=FlyDataType.Time, entityType="D", printName="时间段开始", fieldLength=7)
	timeSlotStart,
	//
	@FlyElement(columnName="TimeUnit", name="Time Unit", description="The unit of time for grouping chart data.", dataType=FlyDataType.List, entityType="D", printName="Time Unit", fieldLength=1)
	timeUnit,
	//
	@FlyElement(columnName="T_Integer", name="整数", dataType=FlyDataType.Integer, entityType="D", printName="整数", fieldLength=22)
	tInteger,
	//
	@FlyElement(columnName="Title", name="名称", description="Name this entity is referred to as", help="The Title indicates the name that an entity is referred to as.", dataType=FlyDataType.String, entityType="D", printName="名称", fieldLength=60)
	title,
	//
	@FlyElement(columnName="T_Liability_Acct", name="应负债", description="Account for Tax declaration liability", help="The Tax Liability Account indicates the account used to record your tax liability declaration.", dataType=FlyDataType.Account, entityType="D", printName="应负债", fieldLength=22)
	tLiabilityAcct,
	//
	@FlyElement(columnName="T_Number", name="数字", dataType=FlyDataType.Number, entityType="D", printName="数字", fieldLength=22)
	tNumber,
	//
	@FlyElement(columnName="ToBeInvoiced", name="To be Invoiced", description="If Shipment line is marked as ToBeInvoiced='N' then it is included in the generated Invoice line with price 0.0", dataType=FlyDataType.YesNo, entityType="D", printName="To be Invoiced", fieldLength=1)
	toBeInvoiced,
	//
	@FlyElement(columnName="To_Country_ID", name="到", description="接收国家", help="The To Country indicates the receiving country on a document", dataType=FlyDataType.Table, entityType="D", printName="到", fieldLength=22)
	toCountryID,
	//
	@FlyElement(columnName="TokenType", name="TokenType", description="Wiki Token Type", dataType=FlyDataType.List, entityType="D", printName="Token Type", fieldLength=1)
	tokenType,
	//
	@FlyElement(columnName="TopicAction", name="Topic Action", dataType=FlyDataType.List, entityType="D", printName="Topic Action", fieldLength=2)
	topicAction,
	//
	@FlyElement(columnName="TopicStatus", name="Topic Status", dataType=FlyDataType.List, entityType="D", printName="Topic Status", fieldLength=2)
	topicStatus,
	//
	@FlyElement(columnName="To_Region_ID", name="到", description="接收区域", help="The To Region indicates the receiving region on a document", dataType=FlyDataType.Table, entityType="D", printName="到", fieldLength=22)
	toRegionID,
	//
	@FlyElement(columnName="TotalAmt", name="总金额", description="总金额", help="The Total Amount indicates the total document amount.", dataType=FlyDataType.Amount, entityType="D", printName="总金额", fieldLength=22)
	totalAmt,
	//
	@FlyElement(columnName="TotalCr", name="总贷方", description="Total Credit in document currency", help="The Total Credit indicates the total credit amount for a journal or journal batch in the source currency", dataType=FlyDataType.Amount, entityType="D", printName="总贷方", fieldLength=22)
	totalCr,
	//
	@FlyElement(columnName="TotalDr", name="总借方", description="Total debit in document currency", help="The Total Debit indicates the total debit amount for a journal or journal batch in the source currency", dataType=FlyDataType.Amount, entityType="D", printName="总借方", fieldLength=22)
	totalDr,
	//
	@FlyElement(columnName="TotalInvAmt", name="总发票金额", description="Cumulative total lifetime invoice amount", help="The cumulative total lifetime invoice amount is used to calculate the total average price", dataType=FlyDataType.Amount, entityType="D", printName="总发票金额", fieldLength=22)
	totalInvAmt,
	//
	@FlyElement(columnName="TotalInvCost", name="总发票成本", description="总发票花费", dataType=FlyDataType.CostsPrices, entityType="D", printName="总发票成本", fieldLength=22)
	totalInvCost,
	//
	@FlyElement(columnName="TotalInvQty", name="总发票数量", description="Cumulative total lifetime invoice quantity", help="The cumulative total lifetime invoice quantity is used to calculate the total average price", dataType=FlyDataType.Quantity, entityType="D", printName="总发票数量", fieldLength=22)
	totalInvQty,
	//
	@FlyElement(columnName="TotalLines", name="明细总数", description="所有文件总数", help="The Total amount displays the total of all lines in document currency", dataType=FlyDataType.Amount, entityType="D", printName="明细总数", fieldLength=22)
	totalLines,
	//
	@FlyElement(columnName="TotalOpenBalance", name="Open Balance", description="Total Open Balance Amount in primary Accounting Currency", help="The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.	Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).", dataType=FlyDataType.Amount, entityType="D", printName="Open Balance", fieldLength=22)
	totalOpenBalance,
	//
	@FlyElement(columnName="TotalQty", name="Total Quantity", description="Total Quantity", dataType=FlyDataType.Quantity, entityType="D", printName="Total Qty", fieldLength=22)
	totalQty,
	//
	@FlyElement(columnName="T_Qty", name="数量", dataType=FlyDataType.Quantity, entityType="D", printName="数量", fieldLength=22)
	tQty,
	//
	@FlyElement(columnName="TrackingInfo", name="Tracking Info", dataType=FlyDataType.String, entityType="D", printName="Tracking Info", fieldLength=255)
	trackingInfo,
	//
	@FlyElement(columnName="TrackingNo", name="追踪号", description="物料出货追踪数", dataType=FlyDataType.String, entityType="D", printName="追踪号", fieldLength=60)
	trackingNo,
	//
	@FlyElement(columnName="TrackingURL", name="追踪网址", description="URL of the shipper to track shipments", help="The variable @TrackingNo@ in the URL is replaced by the actual tracking number of the shipment.", dataType=FlyDataType.URL, entityType="D", printName="追踪网址", fieldLength=120)
	trackingURL,
	//
	@FlyElement(columnName="TransactionCode", name="Transaction Code", description="The transaction code represents the search definition", dataType=FlyDataType.String, entityType="D", printName="Transaction Code", fieldLength=8)
	transactionCode,
	//
	@FlyElement(columnName="TransferBank_ID", name="Bank for transfers", description="Bank account depending on currency will be used from this bank for doing transfers", dataType=FlyDataType.Table, entityType="D", printName="Bank for transfers", fieldLength=22)
	transferBankID,
	//
	@FlyElement(columnName="TransferCashBook_ID", name="CashBook for transfers", dataType=FlyDataType.Table, entityType="D", printName="CashBook for transfers", fieldLength=22)
	transferCashBookID,
	//
	@FlyElement(columnName="TransitionCode", name="Transition Code", description="Code resulting in TRUE of FALSE", help="The transition is executed, if the code results in TRUE (or is empty)", dataType=FlyDataType.Text, entityType="D", printName="Transition Code", fieldLength=2000)
	transitionCode,
	//
	@FlyElement(columnName="T_Receivables_Acct", name="税应收帐款", description="Account for Tax credit after tax declaration", help="The Tax Receivables Account indicates the account used to record the tax credit amount after your tax declaration.", dataType=FlyDataType.Account, entityType="D", printName="税应收帐款", fieldLength=22)
	tReceivablesAcct,
	//
	@FlyElement(columnName="TreeType", name="类型|区域", description="Element this tree is built on (i.e Product, Business Partner)", help="The Tree Type   Area field determines the type of tree this is.  For example, you may define one tree for your Products and another tree for your Business Partners.", dataType=FlyDataType.List, entityType="D", printName="类型|区域", fieldLength=2)
	treeType,
	//
	@FlyElement(columnName="T_ReplenishPlan_ID", name="T_ReplenishPlan ID", dataType=FlyDataType.NONE, entityType="D", printName="T_ReplenishPlan ID", fieldLength=10)
	tReplenishPlanID,
	//
	@FlyElement(columnName="TrxAmt", name="交易金额", description="一交易的金额", help="The Transaction Amount indicates the amount for a single transaction.", dataType=FlyDataType.Amount, entityType="D", printName="交易 Amt", fieldLength=22)
	trxAmt,
	//
	@FlyElement(columnName="TrxName", name="Transaction", description="Name of the transaction", help="Internal name of the transaction", dataType=FlyDataType.String, entityType="D", printName="Trx Name", fieldLength=60)
	trxName,
	//
	@FlyElement(columnName="TrxReceived", name="已接受交易", dataType=FlyDataType.DateTime, entityType="D", printName="已接收交易", fieldLength=7)
	trxReceived,
	//
	@FlyElement(columnName="TrxSent", name="已发送交易", dataType=FlyDataType.DateTime, entityType="D", printName="已发送交易", fieldLength=7)
	trxSent,
	//
	@FlyElement(columnName="TrxType", name="交易类型", description="Type of credit card transaction", help="The Transaction Type indicates the type of transaction to be submitted to the Credit Card Company.", dataType=FlyDataType.List, entityType="D", printName="交易类型", fieldLength=1)
	trxType,
	//
	@FlyElement(columnName="Type", name="类型", description="Type of Validation (SQL, Java Script, Java Language)", help="The Type indicates the type of validation that will occur.  This can be SQL, Java Script or Java Language.", dataType=FlyDataType.List, entityType="D", printName="类型", fieldLength=1)
	type,
	//
	@FlyElement(columnName="TypeMRP", name="MRP Type", description="MRP Type determines whether a record is demand or supply", dataType=FlyDataType.List, entityType="D", printName="MRP Type", fieldLength=1)
	typeMRP,
	//
	@FlyElement(columnName="U_BlackListCheque_ID", name="Black List Cheque", dataType=FlyDataType.ID, entityType="D", printName="Black List Cheque", fieldLength=22)
	uBlackListChequeID,
	//
	@FlyElement(columnName="U_Key", name="Key", dataType=FlyDataType.String, entityType="D", printName="Key", fieldLength=240)
	uKey,
	//
	@FlyElement(columnName="UnappliedPayments", name="Unapplied Payments", dataType=FlyDataType.NONE, entityType="D", printName="Unapplied Payments", fieldLength=0)
	unappliedPayments,
	//
	@FlyElement(columnName="unconfirmedLinesNoToShip", name="Unconfirmed Lines No To Ship", description="Number unconfirmed of shipment lines waiting for confirmation", dataType=FlyDataType.NONE, entityType="D", printName="Unconfirmed Lines No To Ship", fieldLength=0)
	unconfirmedLinesNoToShip,
	//
	@FlyElement(columnName="UnderlineStrokeType", name="Underline Stroke Type", dataType=FlyDataType.List, entityType="D", printName="Underline Stroke Type", fieldLength=5)
	underlineStrokeType,
	//
	@FlyElement(columnName="Undo", name="Undo", dataType=FlyDataType.Button, entityType="D", printName="Undo", fieldLength=1)
	undo,
	//
	@FlyElement(columnName="UnEarnedRevenue_Acct", name="未实现的收入", description="未实现收入帐户", help="The Unearned Revenue indicates the account used for recording invoices sent for products or services not yet delivered.  It is used in revenue recognition", dataType=FlyDataType.Account, entityType="D", printName="未实现的收入", fieldLength=22)
	unEarnedRevenueAcct,
	//
	@FlyElement(columnName="Uninstall", name="Uninstall", dataType=FlyDataType.YesNo, entityType="D", printName="Uninstall", fieldLength=1)
	uninstall,
	//
	@FlyElement(columnName="UnitRuntime", name="Runtime per Unit", description="Time to produce one unit", dataType=FlyDataType.Number, entityType="D", printName="Unit Runtine", fieldLength=22)
	unitRuntime,
	//
	@FlyElement(columnName="UnitsPerPack", name="UnitsPerPack", description="The Units Per Pack indicates the no of units of a product packed together.", dataType=FlyDataType.Integer, entityType="D", printName="UnitsPerPack", fieldLength=14)
	unitsPerPack,
	//
	@FlyElement(columnName="UnitsPerPallet", name="每货盘单位", description="每货盘单位", help="The Units per Pallet indicates the number of units of this product which fit on a pallet.", dataType=FlyDataType.CostsPrices, entityType="D", printName="每货盘单位", fieldLength=22)
	unitsPerPallet,
	//
	@FlyElement(columnName="UnixArchivePath", name="Unix Archive Path", dataType=FlyDataType.String, entityType="D", printName="Unix Archive Path", fieldLength=255)
	unixArchivePath,
	//
	@FlyElement(columnName="UnixAttachmentPath", name="Unix Attachment Path", dataType=FlyDataType.String, entityType="D", printName="Unix Attachment Path", fieldLength=255)
	unixAttachmentPath,
	//
	@FlyElement(columnName="UnlockingTime", name="UnlockingTime", description="Time at which the terminal should be unlocked", dataType=FlyDataType.DateTime, entityType="D", printName="UnlockingTime", fieldLength=7)
	unlockingTime,
	//
	@FlyElement(columnName="UnrealizedGain_Acct", name="未实现增益帐户", description="Unrealized Gain Account for currency revaluation", help="The Unrealized Gain Account indicates the account to be used when recording gains achieved from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="未实现增益帐户", fieldLength=22)
	unrealizedGainAcct,
	//
	@FlyElement(columnName="UnrealizedLoss_Acct", name="U未实现损失帐户", description="Unrealized Loss Account for currency revaluation", help="The Unrealized Loss Account indicates the account to be used when recording losses incurred from currency revaluation that have yet to be realized.", dataType=FlyDataType.Account, entityType="D", printName="U未实现损失帐户", fieldLength=22)
	unrealizedLossAcct,
	//
	@FlyElement(columnName="UOMSymbol", name="符号", description="度量单位的符号", help="The Symbol identifies the Symbol to be displayed and printed for a Unit of Measure", dataType=FlyDataType.String, entityType="D", printName="UoM", fieldLength=10)
	uOMSymbol,
	//
	@FlyElement(columnName="UOMType", name="UOM Type", dataType=FlyDataType.List, entityType="D", printName="UOM Type", fieldLength=2)
	uOMType,
	//
	@FlyElement(columnName="UPC", name="UPC/EAN条码", description="条形码", help="Use this field to enter the bar code for the product in any of the bar code symbologies (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN, ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI Plessey, and Pharmacode) ", dataType=FlyDataType.String, entityType="D", printName="UPC/EAN条码", fieldLength=30)
	uPC,
	//
	@FlyElement(columnName="UpdateBalances", name="Update Balances", description="Update Accounting Balances", dataType=FlyDataType.NONE, entityType="D", printName="UpdateBalances", fieldLength=0)
	updateBalances,
	//
	@FlyElement(columnName="Updated", name="已更新", description="本记录更新日期", help="The Updated field indicates the date that this record was updated.", dataType=FlyDataType.DateTime, entityType="D", printName="已更新", fieldLength=7)
	updated,
	//
	@FlyElement(columnName="UpdatedBy", name="更新人", description="更新该记录用户", help="The Updated By field indicates the user who updated this record.", dataType=FlyDataType.Table, entityType="D", printName="更新人", fieldLength=22)
	updatedBy,
	//
	@FlyElement(columnName="UpdatedDate", name="UpdatedDate", dataType=FlyDataType.String, entityType="D", printName="UpdatedDate", fieldLength=50)
	updatedDate,
	//
	@FlyElement(columnName="UpdateDefaultAccounts", name="更新缺省值帐户", description="更新缺省值帐户", dataType=FlyDataType.NONE, entityType="D", printName="更新缺省值帐户", fieldLength=0)
	updateDefaultAccounts,
	//
	@FlyElement(columnName="UpdateQty", name="更新数量", dataType=FlyDataType.Button, entityType="D", printName="更新数量", fieldLength=1)
	updateQty,
	//
	@FlyElement(columnName="UpdateQtyCount", name="Update Quantity Count", dataType=FlyDataType.NONE, entityType="D", printName="UpdateQtyCount", fieldLength=0)
	updateQtyCount,
	//
	@FlyElement(columnName="Update_Status_ID", name="Update Status", description="Automatically change the status after entry from web", help="Change the status automatically after the entry was changed via the Web", dataType=FlyDataType.Table, entityType="D", printName="Update Status", fieldLength=10)
	updateStatusID,
	//
	@FlyElement(columnName="U_POSTerminal_ID", name="POS Terminal", dataType=FlyDataType.ID, entityType="D", printName="POS Terminal", fieldLength=22)
	uPOSTerminalID,
	//
	@FlyElement(columnName="URL", name="网址", description="网址", help="The URL defines an online address for this Business Partner.", dataType=FlyDataType.URL, entityType="D", printName="网址", fieldLength=120)
	uRL,
	//
	@FlyElement(columnName="U_RoleMenu_ID", name="Role Menu", dataType=FlyDataType.ID, entityType="D", printName="Role Menu", fieldLength=22)
	uRoleMenuID,
	//
	@FlyElement(columnName="UseCurrencyBalancing", name="使用币种平衡", dataType=FlyDataType.YesNo, entityType="D", printName="使用币种平衡", fieldLength=1)
	useCurrencyBalancing,
	//
	@FlyElement(columnName="UseDate", name="UseDate", dataType=FlyDataType.Date, entityType="D", printName="UseDate", fieldLength=7)
	useDate,
	//
	@FlyElement(columnName="UseLifeMonths", name="Usable Life - Months", description="Months of the usable life of the asset", dataType=FlyDataType.Integer, entityType="D", printName="可使用的生活月", fieldLength=22)
	useLifeMonths,
	//
	@FlyElement(columnName="UseLifeMonths_F", name="Use Life - Months (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Use Life - Months (fiscal)", fieldLength=0)
	useLifeMonthsF,
	//
	@FlyElement(columnName="UseLifeYears", name="Usable Life - Years", description="Years of the usable life of the asset", dataType=FlyDataType.Integer, entityType="D", printName="可使用的生活年", fieldLength=22)
	useLifeYears,
	//
	@FlyElement(columnName="UseLifeYears_F", name="Use Life - Years (fiscal)", dataType=FlyDataType.NONE, entityType="D", printName="Use Life - Years (fiscal)", fieldLength=0)
	useLifeYearsF,
	//
	@FlyElement(columnName="User1_ID", name="User1", description="用户定义元素 #1", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User1", fieldLength=22)
	user1ID,
	//
	@FlyElement(columnName="User2_ID", name="User2", description="用户定义元素 #2", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User2", fieldLength=22)
	user2ID,
	//
	@FlyElement(columnName="User3_ID", name="User List 3", description="User defined list element #3", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User 3", fieldLength=22)
	user3ID,
	//
	@FlyElement(columnName="User4_ID", name="User List 4", description="User defined list element #4", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.Table, entityType="D", printName="User 4", fieldLength=22)
	user4ID,
	//
	@FlyElement(columnName="UserAgent", name="用户代理人", description="使用过的浏览器", dataType=FlyDataType.String, entityType="D", printName="用户代理人", fieldLength=255)
	userAgent,
	//
	@FlyElement(columnName="UserDiscount", name="UserDiscount", dataType=FlyDataType.Number, entityType="D", printName="UserDiscount", fieldLength=22)
	userDiscount,
	//
	@FlyElement(columnName="UserElement1_ID", name="User Element 1", description="User defined accounting Element", help="A user defined accounting element refers to a Adempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task).  Note that User Elements are optional and are populated from the context of the document (i.e. not requested)", dataType=FlyDataType.ID, entityType="D", printName="User Element 1", fieldLength=10)
	userElement1ID,
	//
	@FlyElement(columnName="UserElement2_ID", name="User Element 2", description="User defined accounting Element", help="A user defined accounting element refers to a Adempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task).  Note that User Elements are optional and are populated from the context of the document (i.e. not requested)", dataType=FlyDataType.ID, entityType="D", printName="User Element 2", fieldLength=10)
	userElement2ID,
	//
	@FlyElement(columnName="UserElementValue1", name="User Element Value 1", description="User Element Value 1 defined accounting Element", help="A user defined accounting element refers to a Adempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task).  Note that User Elements are optional and are populated from the context of the document (i.e. not requested)", dataType=FlyDataType.String, entityType="D", printName="User Element Value 1", fieldLength=40)
	userElementValue1,
	//
	@FlyElement(columnName="UserElementValue2", name="User Element Value 2", description="User Element Value 2 defined accounting Element", help="A user defined accounting element refers to a Adempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task).  Note that User Elements are optional and are populated from the context of the document (i.e. not requested)", dataType=FlyDataType.String, entityType="D", printName="User Element Value 2", fieldLength=40)
	userElementValue2,
	//
	@FlyElement(columnName="UserID", name="用户ID", description="用户ID", help="The User ID identifies a user and allows access to records or processes.", dataType=FlyDataType.String, entityType="D", printName="用户ID", fieldLength=60)
	userID,
	//
	@FlyElement(columnName="UserLevel", name="用户级别", description="系统 客户 机构", help="The User Level field determines if users of this Role will have access to System level data, Organization level data, Client level data or Client and Organization level data.", dataType=FlyDataType.List, entityType="D", printName="用户级别", fieldLength=3)
	userLevel,
	//
	@FlyElement(columnName="UserName", name="用户名字", description="User responsible for the System", help="The responsible person for the system", dataType=FlyDataType.String, entityType="D", printName="用户名字", fieldLength=60)
	userName,
	//
	@FlyElement(columnName="UserPIN", name="User PIN", dataType=FlyDataType.String, entityType="D", printName="User PIN", fieldLength=20)
	userPIN,
	//
	@FlyElement(columnName="UserValue1", name="User List Value 1", description="User value defined list element #1", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.String, entityType="D", printName="User List Value 1", fieldLength=40)
	userValue1,
	//
	@FlyElement(columnName="UserValue2", name="User List Value 2", description="User value defined list element #2", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.String, entityType="D", printName="User List Value 2", fieldLength=40)
	userValue2,
	//
	@FlyElement(columnName="UserValue3", name="User List Value 3", description="User value defined list element #3", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.String, entityType="D", printName="User List Value 3", fieldLength=40)
	userValue3,
	//
	@FlyElement(columnName="UserValue4", name="User List Value 4", description="User value defined list element #3", help="The user defined element displays the optional elements that have been defined for this account combination.", dataType=FlyDataType.String, entityType="D", printName="User List Value 4", fieldLength=40)
	userValue4,
	//
	@FlyElement(columnName="UseSuspenseBalancing", name="使用暂记平衡", dataType=FlyDataType.YesNo, entityType="D", printName="使用暂记平衡", fieldLength=1)
	useSuspenseBalancing,
	//
	@FlyElement(columnName="UseSuspenseError", name="使用暂记错误", dataType=FlyDataType.YesNo, entityType="D", printName="使用暂记错误", fieldLength=1)
	useSuspenseError,
	//
	@FlyElement(columnName="UseUnits", name="使用单位", description="Currently used units of the assets", dataType=FlyDataType.Integer, entityType="D", printName="使用单位", fieldLength=22)
	useUnits,
	//
	@FlyElement(columnName="UUID", name="Immutable Universally Unique Identifier", description="Immutable Universally Unique Identifier", help="'A surrogate key in a database is a unique identifier for either an entity in the modeled world or an object in the database. The surrogate key is not derived from application data, unlike a natural (or business) key which is derived from application data. ' , According to Wikipedia http://en.wikipedia.org/wiki/Surrogate_key", dataType=FlyDataType.NONE, entityType="D", printName="UUID", fieldLength=0)
	uUID,
	//
	@FlyElement(columnName="U_Value", name="Value", dataType=FlyDataType.String, entityType="D", printName="Value", fieldLength=240)
	uValue,
	//
	@FlyElement(columnName="U_WebMenu_ID", name="Web Menu", dataType=FlyDataType.TableDirect, entityType="D", printName="Web Menu", fieldLength=10)
	uWebMenuID,
	//
	@FlyElement(columnName="U_Web_Properties_ID", name="Web Properties", dataType=FlyDataType.ID, entityType="D", printName="Web Properties", fieldLength=22)
	uWebPropertiesID,
	//
	@FlyElement(columnName="ValidateWorkflow", name="Validate Workflow", dataType=FlyDataType.Button, entityType="D", printName="Validateworkflow", fieldLength=1)
	validateWorkflow,
	//
	@FlyElement(columnName="ValidationType", name="验证类型", description="Different method of validating data", help="The Validation Type indicates the validation method to use.  These include list, table or data type validation.", dataType=FlyDataType.List, entityType="D", printName="验证类型", fieldLength=1)
	validationType,
	//
	@FlyElement(columnName="ValidFrom", name="开始有效", description="Valid from including this date (first day)", help="The Valid From date indicates the first day of a date range", dataType=FlyDataType.Date, entityType="D", printName="开始有效", fieldLength=7)
	validFrom,
	//
	@FlyElement(columnName="ValidTo", name="结束有效", description="Valid to including this date (last day)", help="The Valid To date indicates the last day of a date range", dataType=FlyDataType.Date, entityType="D", printName="结束有效", fieldLength=7)
	validTo,
	//
	@FlyElement(columnName="Value", name="检索关键字", description="记录的检索关键字在格式上是必须的 -并且必须唯一", help="A search key allows you a fast method of finding a particular record.	If you leave the search key empty, the system automatically creates a numeric number.  The document sequence used for this fallback number is defined in the 'Maintain Sequence' window with the name 'DocumentNo_<TableName>', where TableName is the actual name of the table (e.g. C_Order).", dataType=FlyDataType.String, entityType="D", printName="检索关键字", fieldLength=60)
	value,
	//
	@FlyElement(columnName="Value2", name="值到", description="值到", dataType=FlyDataType.String, entityType="D", printName="值到", fieldLength=40)
	value2,
	//
	@FlyElement(columnName="ValueColumn", name="Value Column", description="Fully qualified data value column", help="The Value Column contains the value data for the chart", dataType=FlyDataType.String, entityType="D", printName="Value Column", fieldLength=60)
	valueColumn,
	//
	@FlyElement(columnName="ValueMax", name="最大值", description="字段的最大值", help="The Maximum Value indicates the highest allowable value for a field", dataType=FlyDataType.String, entityType="D", printName="最大值", fieldLength=20)
	valueMax,
	//
	@FlyElement(columnName="ValueMin", name="最小值", description="字段最小量值", help="The Minimum Value indicates the lowest  allowable value for a field.", dataType=FlyDataType.String, entityType="D", printName="最小值", fieldLength=20)
	valueMin,
	//
	@FlyElement(columnName="ValueNumber", name="Value", description="Numeric Value", dataType=FlyDataType.Number, entityType="D", printName="Value", fieldLength=22)
	valueNumber,
	//
	@FlyElement(columnName="ValutaDate", name="有效的日期", description="付款已到期日", help="The Effective Date indicates the date that money is available from the bank.", dataType=FlyDataType.Date, entityType="D", printName="有效的日期", fieldLength=7)
	valutaDate,
	//
	@FlyElement(columnName="V_Date", name="V_Date", dataType=FlyDataType.Date, entityType="D", printName="V_Date", fieldLength=7)
	vDate,
	//
	@FlyElement(columnName="VendorCategory", name="供应商分类", description="供应商的产品种类", help="The Vendor Category identifies the category used by the vendor for this product.", dataType=FlyDataType.String, entityType="D", printName="供应商分类", fieldLength=30)
	vendorCategory,
	//
	@FlyElement(columnName="VendorID", name="供应商ID", description="Vendor ID for the Payment Processor", dataType=FlyDataType.String, entityType="D", printName="供应商ID", fieldLength=60)
	vendorID,
	//
	@FlyElement(columnName="Vendor_ID", name="供应商", dataType=FlyDataType.Table, entityType="D", printName="供应商", fieldLength=22)
	vendorID,
	//
	@FlyElement(columnName="VendorOpenInvoices", name="Vendor Open Invoices", dataType=FlyDataType.NONE, entityType="D", printName="Vendor Open Invoices", fieldLength=0)
	vendorOpenInvoices,
	//
	@FlyElement(columnName="VendorProductNo", name="伙伴产品号", description="供应商的产品未", help="The Vendor Product Number identifies the number used by the vendor for this product.", dataType=FlyDataType.String, entityType="D", printName="BP产品号", fieldLength=40)
	vendorProductNo,
	//
	@FlyElement(columnName="Version", name="版本", description="Version of the table definition", help="The Version indicates the version of this table definition.", dataType=FlyDataType.Amount, entityType="D", printName="版本", fieldLength=22)
	version,
	//
	@FlyElement(columnName="VersionNo", name="版本号", description="版本数字", dataType=FlyDataType.String, entityType="D", printName="版本号", fieldLength=20)
	versionNo,
	//
	@FlyElement(columnName="VFormat", name="值格式", description="Format of the value; Can contain fixed format elements, Variables: '_lLoOaAcCa09'", help="<B>验证元素:<B>(空格)任何的个性	_	Space (fixed character)	l	any Letter a..Z NO space	L	any Letter a..Z NO space converted to upper case	o	any Letter a..Z or space	O	any Letter a..Z or space converted to upper case	a	any Letters &数字无空格	A	any Letters & Digits NO space converted to upper case	c	any Letters &数字或空间	C	any Letters & Digits or space converted to upper case	0	Digits 0..9 NO space	9	Digits 0..9 or space		Example of format '(000)_000-0000'", dataType=FlyDataType.String, entityType="D", printName="值格式", fieldLength=60)
	vFormat,
	//
	@FlyElement(columnName="V_Liability_Acct", name="供应商负债", description="供应商负债帐户", help="The Vendor Liability account indicates the account used for recording transactions for vendor liabilities", dataType=FlyDataType.Account, entityType="D", printName="供应商负债", fieldLength=22)
	vLiabilityAcct,
	//
	@FlyElement(columnName="V_Liability_Services_Acct", name="供应商服务负债", description="Account for Vender Service Liability", help="The Vendor Service Liability account indicates the account to use for recording service liabilities.  It is used if you need to distinguish between Liability for products and services", dataType=FlyDataType.Account, entityType="D", printName="供应商服务负债", fieldLength=22)
	vLiabilityServicesAcct,
	//
	@FlyElement(columnName="V_Number", name="V_Number", dataType=FlyDataType.String, entityType="D", printName="V_Number", fieldLength=22)
	vNumber,
	//
	@FlyElement(columnName="VoiceAuthCode", name="宣述授权码", description="Voice Authorization Code from credit card company", help="The Voice Authorization Code indicates the code received from the Credit Card Company.", dataType=FlyDataType.String, entityType="D", printName="宣述授权码", fieldLength=20)
	voiceAuthCode,
	//
	@FlyElement(columnName="Volume", name="体积", description="产品的体积", help="The Volume indicates the volume of the product in the Volume UOM of the Client", dataType=FlyDataType.Amount, entityType="D", printName="体积", fieldLength=22)
	volume,
	//
	@FlyElement(columnName="V_Prepayment_Acct", name="供应商预付款", description="Account for Vendor Prepayments", help="The Vendor Prepayment Account indicates the account used to record prepayments from a vendor.", dataType=FlyDataType.Account, entityType="D", printName="供应商预付款", fieldLength=22)
	vPrepaymentAcct,
	//
	@FlyElement(columnName="V_String", name="V_String", dataType=FlyDataType.String, entityType="D", printName="V_String", fieldLength=2000)
	vString,
	//
	@FlyElement(columnName="W_Advertisement_ID", name="广告", description="网络广告", help="网络上的广告", dataType=FlyDataType.ID, entityType="D", printName="广告", fieldLength=22)
	wAdvertisementID,
	//
	@FlyElement(columnName="WaitingTime", name="等待时间", description="Workflow Simulation Waiting time", help="Amount of time needed to prepare the performance of the task on Duration Units", dataType=FlyDataType.Integer, entityType="D", printName="等待时间", fieldLength=22)
	waitingTime,
	//
	@FlyElement(columnName="WaitTime", name="Wait Time", description="Time in minutes to wait (sleep)", help="Time in minutes to be suspended (sleep)", dataType=FlyDataType.Integer, entityType="D", printName="Wait Time", fieldLength=22)
	waitTime,
	//
	@FlyElement(columnName="Warehouse_Location_ID", name="仓库位置", description="Warehouse Location Address", help="仓库的地址", dataType=FlyDataType.Location, entityType="D", printName="仓库位置", fieldLength=22)
	warehouseLocationID,
	//
	@FlyElement(columnName="WarehouseName", name="Warehouse", description="Warehouse Name", dataType=FlyDataType.String, entityType="D", printName="Warehouse", fieldLength=60)
	warehouseName,
	//
	@FlyElement(columnName="WarehouseValue", name="仓库关键字", description="仓库的关键字", help="关键字", dataType=FlyDataType.String, entityType="D", printName="仓库关键字", fieldLength=40)
	warehouseValue,
	//
	@FlyElement(columnName="W_Basket_ID", name="W_Basket_ID", description="购物篮", help="暂时的购物篮", dataType=FlyDataType.ID, entityType="D", printName="W_Basket_ID", fieldLength=22)
	wBasketID,
	//
	@FlyElement(columnName="W_BasketLine_ID", name="购物篮明细", description="Web Basket Line", help="暂时的购物篮线", dataType=FlyDataType.ID, entityType="D", printName="购物篮明细", fieldLength=22)
	wBasketLineID,
	//
	@FlyElement(columnName="W_ClickCount_ID", name="点击计数", description="网络点击管理", help="网络点击管理", dataType=FlyDataType.TableDirect, entityType="D", printName="点击计数", fieldLength=22)
	wClickCountID,
	//
	@FlyElement(columnName="W_Click_ID", name="网络点击", description="个别的网络点击", help="网络点击 Datails", dataType=FlyDataType.ID, entityType="D", printName="网络点击", fieldLength=22)
	wClickID,
	//
	@FlyElement(columnName="W_CounterCount_ID", name="柜台计数", description="网络柜台计数管理", help="网络柜台数据", dataType=FlyDataType.ID, entityType="D", printName="柜台计数", fieldLength=22)
	wCounterCountID,
	//
	@FlyElement(columnName="W_Counter_ID", name="网络柜台", description="个人计数点击", help="网络柜台明细", dataType=FlyDataType.ID, entityType="D", printName="网络柜台", fieldLength=22)
	wCounterID,
	//
	@FlyElement(columnName="W_Differences_Acct", name="储入仓库差额", description="储入仓库差额帐户", help="The Warehouse Differences Account indicates the account used recording differences identified during inventory counts.", dataType=FlyDataType.Account, entityType="D", printName="储入仓库差额", fieldLength=22)
	wDifferencesAcct,
	//
	@FlyElement(columnName="WebContext", name="Web Context", description="Web Server Context - e.g. /wstore", help="Unique Web Server Context for this Web Store - will set context-root in application.xml.	The web context usually starts with / and needs to be a valid context name (not checked).", dataType=FlyDataType.String, entityType="D", printName="Web Context", fieldLength=20)
	webContext,
	//
	@FlyElement(columnName="WebInfo", name="网上商店信息", description="Web Store Header Information", help="Display HTML Info in the Web Store - by default in the header.	", dataType=FlyDataType.Text, entityType="D", printName="Web信息", fieldLength=2000)
	webInfo,
	//
	@FlyElement(columnName="WebOrderEMail", name="网络定单电子邮件", description="EMail address to receive notifications when web orders were processed", help="When processig a web order, a confirmation is sent to the EMail addess of the customer from the request EMail address copying this email address when entered.", dataType=FlyDataType.String, entityType="D", printName="网络定单电子邮件", fieldLength=60)
	webOrderEMail,
	//
	@FlyElement(columnName="WebParam1", name="Web参数1", description="Web参数1", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam1", dataType=FlyDataType.String, entityType="D", printName="Web参数1", fieldLength=2000)
	webParam1,
	//
	@FlyElement(columnName="WebParam2", name="Web参数2", description="Web参数2", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam2", dataType=FlyDataType.String, entityType="D", printName="Web参数2", fieldLength=2000)
	webParam2,
	//
	@FlyElement(columnName="WebParam3", name="Web参数3", description="Web参数3", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam3", dataType=FlyDataType.String, entityType="D", printName="Web参数3", fieldLength=2000)
	webParam3,
	//
	@FlyElement(columnName="WebParam4", name="Web参数4", description="Web参数4", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam4", dataType=FlyDataType.String, entityType="D", printName="Web参数4", fieldLength=2000)
	webParam4,
	//
	@FlyElement(columnName="WebParam5", name="Web参数5", description="Web Site Parameter 5 (default footer center)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam5 - By default, it is positioned in the center of the footer.", dataType=FlyDataType.Text, entityType="D", printName="Web参数5", fieldLength=2000)
	webParam5,
	//
	@FlyElement(columnName="WebParam6", name="Web参数6", description="Web Site Parameter 6 (default footer right)", help="The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam6 - By default, it is positioned on the right side of the footer.", dataType=FlyDataType.Text, entityType="D", printName="Web参数6", fieldLength=2000)
	webParam6,
	//
	@FlyElement(columnName="WebSession", name="Web会话", description="Web会话ID", dataType=FlyDataType.String, entityType="D", printName="Web会话", fieldLength=40)
	webSession,
	//
	@FlyElement(columnName="Week1", name="Week1", dataType=FlyDataType.Quantity, entityType="D", printName="Week1", fieldLength=10)
	week1,
	//
	@FlyElement(columnName="Week10", name="Week10", dataType=FlyDataType.Quantity, entityType="D", printName="Week10", fieldLength=10)
	week10,
	//
	@FlyElement(columnName="Week11", name="Week11", dataType=FlyDataType.Quantity, entityType="D", printName="Week11", fieldLength=10)
	week11,
	//
	@FlyElement(columnName="Week12", name="Week12", dataType=FlyDataType.Quantity, entityType="D", printName="Week12", fieldLength=10)
	week12,
	//
	@FlyElement(columnName="Week13", name="Week13", dataType=FlyDataType.Quantity, entityType="D", printName="Week13", fieldLength=10)
	week13,
	//
	@FlyElement(columnName="Week14", name="Week14", dataType=FlyDataType.Quantity, entityType="D", printName="Week14", fieldLength=10)
	week14,
	//
	@FlyElement(columnName="Week15", name="Week15", dataType=FlyDataType.Quantity, entityType="D", printName="Week15", fieldLength=10)
	week15,
	//
	@FlyElement(columnName="Week16", name="Week16", dataType=FlyDataType.Quantity, entityType="D", printName="Week16", fieldLength=10)
	week16,
	//
	@FlyElement(columnName="Week17", name="Week17", dataType=FlyDataType.Quantity, entityType="D", printName="Week17", fieldLength=10)
	week17,
	//
	@FlyElement(columnName="Week18", name="Week18", dataType=FlyDataType.Quantity, entityType="D", printName="Week18", fieldLength=10)
	week18,
	//
	@FlyElement(columnName="Week19", name="Week19", dataType=FlyDataType.Quantity, entityType="D", printName="Week19", fieldLength=10)
	week19,
	//
	@FlyElement(columnName="Week2", name="Week2", dataType=FlyDataType.Quantity, entityType="D", printName="Week2", fieldLength=10)
	week2,
	//
	@FlyElement(columnName="Week20", name="Week20", dataType=FlyDataType.Quantity, entityType="D", printName="Week20", fieldLength=10)
	week20,
	//
	@FlyElement(columnName="Week21", name="Week21", dataType=FlyDataType.Quantity, entityType="D", printName="Week21", fieldLength=10)
	week21,
	//
	@FlyElement(columnName="Week22", name="Week22", dataType=FlyDataType.Quantity, entityType="D", printName="Week22", fieldLength=10)
	week22,
	//
	@FlyElement(columnName="Week23", name="Week23", dataType=FlyDataType.Quantity, entityType="D", printName="Week23", fieldLength=10)
	week23,
	//
	@FlyElement(columnName="Week24", name="Week24", dataType=FlyDataType.Quantity, entityType="D", printName="Week24", fieldLength=10)
	week24,
	//
	@FlyElement(columnName="Week3", name="Week3", dataType=FlyDataType.Quantity, entityType="D", printName="Week3", fieldLength=10)
	week3,
	//
	@FlyElement(columnName="Week4", name="Week4", dataType=FlyDataType.Quantity, entityType="D", printName="Week4", fieldLength=10)
	week4,
	//
	@FlyElement(columnName="Week5", name="Week5", dataType=FlyDataType.Quantity, entityType="D", printName="Week5", fieldLength=10)
	week5,
	//
	@FlyElement(columnName="Week6", name="Week6", dataType=FlyDataType.Quantity, entityType="D", printName="Week6", fieldLength=10)
	week6,
	//
	@FlyElement(columnName="Week7", name="Week7", dataType=FlyDataType.Quantity, entityType="D", printName="Week7", fieldLength=10)
	week7,
	//
	@FlyElement(columnName="Week8", name="Week8", dataType=FlyDataType.Quantity, entityType="D", printName="Week8", fieldLength=10)
	week8,
	//
	@FlyElement(columnName="Week9", name="Week9", dataType=FlyDataType.Quantity, entityType="D", printName="Week9", fieldLength=10)
	week9,
	//
	@FlyElement(columnName="WeekDay", name="Day of the Week", description="Day of the Week", dataType=FlyDataType.List, entityType="D", printName="Week Day", fieldLength=1)
	weekDay,
	//
	@FlyElement(columnName="Weight", name="重量", description="一产品的重量", help="The Weight indicates the weight  of the product in the Weight UOM of the Client", dataType=FlyDataType.Amount, entityType="D", printName="重量", fieldLength=22)
	weight,
	//
	@FlyElement(columnName="WeightedAmt", name="Weighted Amount", description="The amount adjusted by the probability.", dataType=FlyDataType.NONE, entityType="D", printName="Weighted Amount", fieldLength=0)
	weightedAmt,
	//
	@FlyElement(columnName="WFState", name="工作流状态", description="State of the execution of the workflow", dataType=FlyDataType.List, entityType="D", printName="Wf状态", fieldLength=2)
	wFState,
	//
	@FlyElement(columnName="WhereClause", name="SQL的Where子句", description="Fully qualified WHERE clause", help="The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means 'tablename.columnname'.", dataType=FlyDataType.Text, entityType="D", printName="SQL的Where子句", fieldLength=2000)
	whereClause,
	//
	@FlyElement(columnName="WindowsArchivePath", name="Windows Archive Path", dataType=FlyDataType.String, entityType="D", printName="Windows Archive Path", fieldLength=255)
	windowsArchivePath,
	//
	@FlyElement(columnName="WindowsAttachmentPath", name="Windows Attachment Path", dataType=FlyDataType.String, entityType="D", printName="Windows Attachment Path", fieldLength=255)
	windowsAttachmentPath,
	//
	@FlyElement(columnName="WindowType", name="窗口类型", description="Type or classification of a Window", help="The Window Type indicates the type of window being defined (Maintain, Transaction or Query)", dataType=FlyDataType.List, entityType="D", printName="窗口类型", fieldLength=1)
	windowType,
	//
	@FlyElement(columnName="WinHeight", name="Window Height", dataType=FlyDataType.Integer, entityType="D", printName="Win Height", fieldLength=22)
	winHeight,
	//
	@FlyElement(columnName="W_InvActualAdjust_Acct", name="库存调整", description="Account for Inventory value adjustments for Actual Costing", help="In actual costing systems, this account is used to post Inventory value adjustments. You could set it to the standard Inventory Asset account.", dataType=FlyDataType.Account, entityType="D", printName="库存调整", fieldLength=22)
	wInvActualAdjustAcct,
	//
	@FlyElement(columnName="W_Inventory_Acct", name="仓库库存", description="Warehouse Inventory Asset Account", help="The Warehouse Inventory Asset Account identifies the account used for recording the value of your inventory.", dataType=FlyDataType.Account, entityType="D", printName="仓库库存", fieldLength=22)
	wInventoryAcct,
	//
	@FlyElement(columnName="WinWidth", name="Window Width", dataType=FlyDataType.Integer, entityType="D", printName="Win Width", fieldLength=22)
	winWidth,
	//
	@FlyElement(columnName="Withholding_Acct", name="扣留", description="扣交帐户", help="The Withholding Account indicates the account used to record withholdings.", dataType=FlyDataType.Account, entityType="D", printName="扣留", fieldLength=22)
	withholdingAcct,
	//
	@FlyElement(columnName="W_MailMsg_ID", name="Mail Message", description="Web Store Mail Message Template", dataType=FlyDataType.ID, entityType="D", printName="Mail Message", fieldLength=10)
	wMailMsgID,
	//
	@FlyElement(columnName="Workflow_ID", name="工作流", description="工作流或任务", help="The Workflow field identifies a unique workflow.   A workflow is a grouping of related tasks, in a specified sequence and optionally including approvals", dataType=FlyDataType.Table, entityType="D", printName="工作流", fieldLength=22)
	workflowID,
	//
	@FlyElement(columnName="WorkflowType", name="工作流类型", description="工作流的类型", help="The type of workflow determines how the workflow is started.", dataType=FlyDataType.List, entityType="D", printName="工作流类型", fieldLength=1)
	workflowType,
	//
	@FlyElement(columnName="WorkflowValue", name="Workflow Key", description="Key of the Workflow to start", dataType=FlyDataType.String, entityType="D", printName="Workflow", fieldLength=40)
	workflowValue,
	//
	@FlyElement(columnName="WorkingTime", name="工作流时间", description="Workflow Simulation Execution Time", help="Amount of time the performer of the activity needs to perform the task in Duration Unit", dataType=FlyDataType.Integer, entityType="D", printName="工作流时间", fieldLength=22)
	workingTime,
	//
	@FlyElement(columnName="W_Revaluation_Acct", name="库存估价", description="Account for Inventory Revaluation", help="The Inventory Revaluation Account identifies the account used to records changes in inventory value due to currency revaluation.", dataType=FlyDataType.Account, entityType="D", printName="库存估价", fieldLength=22)
	wRevaluationAcct,
	//
	@FlyElement(columnName="WriteOff_Acct", name="销帐", description="Account for Receivables write-off", help="The Write Off Account identifies the account to book write off transactions to.", dataType=FlyDataType.Account, entityType="D", printName="销帐", fieldLength=22)
	writeOffAcct,
	//
	@FlyElement(columnName="WriteOffAmt", name="销帐金额", description="销帐金额", help="The Write Off Amount indicates the amount to be written off as uncollectible.", dataType=FlyDataType.Amount, entityType="D", printName="销帐", fieldLength=22)
	writeOffAmt,
	//
	@FlyElement(columnName="WStoreEMail", name="Web Store EMail", description="EMail address used as the sender (From)", help="The EMail address is used to send mails to users of the web store", dataType=FlyDataType.String, entityType="D", printName="Web Store EMail", fieldLength=60)
	wStoreEMail,
	//
	@FlyElement(columnName="W_Store_ID", name="Web Store", description="A Web Store of the Client", dataType=FlyDataType.ID, entityType="D", printName="Web Store", fieldLength=10)
	wStoreID,
	//
	@FlyElement(columnName="WStoreUser", name="WebStore User", description="User ID of the Web Store EMail address", help="User ID to connect to the Mail Server", dataType=FlyDataType.String, entityType="D", printName="Web Store User", fieldLength=60)
	wStoreUser,
	//
	@FlyElement(columnName="WStoreUserPW", name="WebStore Password", description="Password of the Web Store EMail address", help="Password to connect to the Mail Server", dataType=FlyDataType.String, entityType="D", printName="WebStore Password", fieldLength=20)
	wStoreUserPW,
	//
	@FlyElement(columnName="WS_WebServiceFieldInput_ID", name="Web Service Field Input", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Field Input", fieldLength=0)
	wSWebServiceFieldInputID,
	//
	@FlyElement(columnName="WS_WebServiceFieldOutput_ID", name="Web Service Field Output", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Field Output", fieldLength=0)
	wSWebServiceFieldOutputID,
	//
	@FlyElement(columnName="WS_WebService_ID", name="Web Service", dataType=FlyDataType.NONE, entityType="D", printName="Web Service", fieldLength=0)
	wSWebServiceID,
	//
	@FlyElement(columnName="WS_WebServiceMethod_ID", name="Web Service Method", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Method", fieldLength=0)
	wSWebServiceMethodID,
	//
	@FlyElement(columnName="WS_WebService_Para_ID", name="Web Service Parameters", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Parameters", fieldLength=0)
	wSWebServiceParaID,
	//
	@FlyElement(columnName="WS_WebServiceType_ID", name="Web Service Type", dataType=FlyDataType.NONE, entityType="D", printName="Web Service Type", fieldLength=0)
	wSWebServiceTypeID,
	//
	@FlyElement(columnName="X", name="走廊(X)", description="X dimension, e.g., Aisle", help="The X dimension indicates the Aisle a product is located in.", dataType=FlyDataType.String, entityType="D", printName="X", fieldLength=60)
	x,
	//
	@FlyElement(columnName="X12DE355", name="EDI 编码", description="UOM EDI Code", help="The Unit of Measure Code indicates the EDI X12 Code Data Element 355 (Unit or Basis for Measurement)", dataType=FlyDataType.String, entityType="D", printName="EDI 编码", fieldLength=4)
	x12DE355,
	//
	@FlyElement(columnName="XPosition", name="X 位置", description="Absolute X (horizontal) position in 1 72 of an inch", help="Absolute X (horizontal) position in 1 72 of an inch", dataType=FlyDataType.Integer, entityType="D", printName="X 位置", fieldLength=22)
	xPosition,
	//
	@FlyElement(columnName="XSpace", name="X 空间", description="Relative X (horizontal) space in 1 72 of an inch", help="Relative X (horizontal) space in 1 72 of an inch in relation to the end of the previous item.", dataType=FlyDataType.Integer, entityType="D", printName="X 空间", fieldLength=22)
	xSpace,
	//
	@FlyElement(columnName="XYSeparator", name="XY Separator", description="The separator between the X and Y function.", dataType=FlyDataType.String, entityType="D", printName="XY Separator", fieldLength=20)
	xYSeparator,
	//
	@FlyElement(columnName="Y", name="货柜(Y)", description="Y dimension, e.g., Bin", help="The Y dimension indicates the Bin a product is located in", dataType=FlyDataType.String, entityType="D", printName="Y", fieldLength=60)
	y,
	//
	@FlyElement(columnName="YPosition", name="Y 位置", description="Absolute Y (vertical) position in 1 72 of an inch", help="Absolute Y (vertical) position in 1 72 of an inch", dataType=FlyDataType.Integer, entityType="D", printName="Y 位置", fieldLength=22)
	yPosition,
	//
	@FlyElement(columnName="YSpace", name="Y 空间", description="Relative Y (vertical) space in 1 72 of an inch", help="Relative Y (vertical) space in 1 72 of an inch in relation to the end of the previous item.", dataType=FlyDataType.Integer, entityType="D", printName="Y 空间", fieldLength=22)
	ySpace,
	//
	@FlyElement(columnName="Z", name="货层(Z)", description="Z dimension, e.g., Level", help="The Z dimension indicates the Level a product is located in.", dataType=FlyDataType.String, entityType="D", printName="Z", fieldLength=60)
	z,
	//
	@FlyElement(columnName="Zoom_Field_ID", name="Zoom_Field_ID", dataType=FlyDataType.NONE, entityType="D", printName="Zoom_Field_ID", fieldLength=0)
	zoomFieldID,
	//
	@FlyElement(columnName="ZoomLogic", name="Zoom Logic", description="the result determines if the zoom condition is applied", help="format := {expression} [{logic} {expression}]<br> 	expression := @{context}@{operand}{value} or @{context}@{operand}{value}<br> 	logic := {|}|{&}<br>	context := any global or window context <br>	value := strings or numbers<br>	logic operators	:= AND or OR with the previous result from left to right <br>	operand := eq{=}, gt{&gt;}, le{&lt;}, not{~^!} <br>	Examples: <br>	@AD_Table_ID@=14 | @Language@!GERGER <br>	@PriceLimit@>10 | @PriceList@>@PriceActual@<br>	@Name@>J<br>	Strings may be in single quotes (optional)", dataType=FlyDataType.Text, entityType="D", printName="Zoom Logic", fieldLength=2000)
	zoomLogic,
	//
	@FlyElement(columnName="Zoom_Tab_ID", name="Zoom_Tab_ID", dataType=FlyDataType.NONE, entityType="D", printName="Zoom_Tab_ID", fieldLength=0)
	zoomTabID,
	//
	@FlyElement(columnName="Zoom_Window_ID", name="Zoom_Window_ID", dataType=FlyDataType.NONE, entityType="D", printName="Zoom_Window_ID", fieldLength=0)
	zoomWindowID,
	//
	@FlyElement(columnName="ZulFilePath", name="ZUL File Path", description="Absolute path to zul file", help="Absolute path to zul file that is use to generate dashboard content", dataType=FlyDataType.String, entityType="D", printName="ZUL File Path", fieldLength=255)
	zulFilePath,
}