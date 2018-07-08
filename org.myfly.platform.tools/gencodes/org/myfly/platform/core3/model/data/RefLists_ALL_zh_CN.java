package org.myfly.platform.core3.model.data;

import org.myfly.platform.core3.metadata.annotation.FlyRefItem;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;

public enum RefLists_ALL_zh_CN {
	//
	@FlyRefList(name="A_Table_Rate_Type", description="List that contains type of rate", items={
	@FlyRefItem(name="Amount", value="AM"),
	@FlyRefItem(name="Rate", value="RT"),
})
	A_Table_Rate_Type,
	//
	@FlyRefList(name="AD_Validation 规则类型", description="验证规则类型列表", help="e.g. S - SQL", items={
	@FlyRefItem(name="SQL", value="S"),
	@FlyRefItem(name="Java", value="J"),
	@FlyRefItem(name="Java Script", value="E"),
})
	AD_Validation_Rule_Types,
	//
	@FlyRefList(name="AD_Message 类型", description="信息类型列表", items={
	@FlyRefItem(name="错误", value="E"),
	@FlyRefItem(name="信息", value="I"),
	@FlyRefItem(name="菜单", value="M"),
})
	AD_Message_Type,
	//
	@FlyRefList(name="AD_Print 标签线类型", items={
	@FlyRefItem(name="字段", value="F"),
	@FlyRefItem(name="文本", value="T"),
})
	AD_Print_Label_Line_Type,
	//
	@FlyRefList(name="C_Recurring 频率", items={
	@FlyRefItem(name="每日的", value="D"),
	@FlyRefItem(name="每周的", value="W"),
	@FlyRefItem(name="每月的", value="M"),
	@FlyRefItem(name="每季的", value="Q"),
})
	C_Recurring_Frequency,
	//
	@FlyRefList(name="C_Recurring 类型", items={
	@FlyRefItem(name="发票", value="I"),
	@FlyRefItem(name="定单", value="O"),
	@FlyRefItem(name="总帐分类帐", value="G"),
	@FlyRefItem(name="项目", value="J"),
})
	C_Recurring_Type,
	//
	@FlyRefList(name="AD_Menu 动作", description="菜单动作列表", items={
	@FlyRefItem(name="表单", value="X"),
	@FlyRefItem(name="程序", value="P"),
	@FlyRefItem(name="报表", value="R"),
	@FlyRefItem(name="工作台", value="B"),
	@FlyRefItem(name="窗口 ", value="W"),
	@FlyRefItem(name="任务", value="T"),
	@FlyRefItem(name="工作流", value="F"),
	@FlyRefItem(name="Smart Browse", value="S"),
})
	AD_Menu_Action,
	//
	@FlyRefList(name="CM_Container Type", items={
	@FlyRefItem(name="Document", value="D"),
	@FlyRefItem(name="Internal Link", value="L"),
	@FlyRefItem(name="External URL", value="U"),
})
	CM_Container_Type,
	//
	@FlyRefList(name="CM_WebAccessLog Type", items={
	@FlyRefItem(name="Web Access", value="W"),
	@FlyRefItem(name="Ad display", value="A"),
	@FlyRefItem(name="Redirect", value="R"),
})
	CM_WebAccessLog_Type,
	//
	@FlyRefList(name="K_IndexLog QuerySource", items={
	@FlyRefItem(name="Self Service", value="W"),
	@FlyRefItem(name="Collaboration Management", value="C"),
	@FlyRefItem(name="Java Client", value="J"),
	@FlyRefItem(name="HTML Client", value="H"),
})
	K_IndexLog_QuerySource,
	//
	@FlyRefList(name="C_AcctSchema TaxCorrectionType", items={
	@FlyRefItem(name="None", value="N"),
	@FlyRefItem(name="Write-off only", value="W"),
	@FlyRefItem(name="Discount only", value="D"),
	@FlyRefItem(name="Write-off and Discount", value="B"),
})
	C_AcctSchema_TaxCorrectionType,
	//
	@FlyRefList(name="CM_Media Media Type", items={
	@FlyRefItem(name="text/js", value="JS"),
	@FlyRefItem(name="image/jpeg", value="JPG"),
	@FlyRefItem(name="image/png", value="PNG"),
	@FlyRefItem(name="application/pdf", value="PDF"),
	@FlyRefItem(name="text/css", value="CSS"),
	@FlyRefItem(name="image/gif", value="GIF"),
})
	CM_Media_Media_Type,
	//
	@FlyRefList(name="AD_Window 类型", description="视窗类型列表", help="e.g. M = Multi Single (one uppercase character)", items={
	@FlyRefItem(name="单一记录", value="S"),
	@FlyRefItem(name="维护", value="M"),
	@FlyRefItem(name="交易", value="T"),
	@FlyRefItem(name="只有查询", value="Q"),
})
	AD_Window_Types,
	//
	@FlyRefList(name="C_Conversion_Rate 类型", description="汇率类型类型", items={
	@FlyRefItem(name="公司", value="C"),
	@FlyRefItem(name="用户类型", value="U"),
	@FlyRefItem(name="手工比率", value="M"),
	@FlyRefItem(name="没有", value="N"),
	@FlyRefItem(name="现场", value="S"),
	@FlyRefItem(name="周期类型", value="P"),
	@FlyRefItem(name="固定", value="F"),
	@FlyRefItem(name="平均", value="A"),
})
	C_Conversion_Rate_Types,
	//
	@FlyRefList(name="M_InOutConfirm 类型", items={
	@FlyRefItem(name="供应商确认", value="XV"),
	@FlyRefItem(name="客户确认", value="XC"),
	@FlyRefItem(name="Drop Ship Confirm", value="DS"),
	@FlyRefItem(name="Ship/Receipt Confirm", value="SC"),
	@FlyRefItem(name="Pick/QA Confirm", value="PC"),
})
	M_InOutConfirm_Type,
	//
	@FlyRefList(name="C_Period 类型", description="分期类型列表", items={
	@FlyRefItem(name="标准日历分期", value="S"),
	@FlyRefItem(name="调整分期", value="A"),
})
	C_Period_Type,
	//
	@FlyRefList(name="C_Element 类型", description="会计科目类型", items={
	@FlyRefItem(name="帐户", value="A"),
	@FlyRefItem(name="用户定义", value="U"),
})
	C_Element_Type,
	//
	@FlyRefList(name="C_ElementValue AccountType", description="帐户类型目录", items={
	@FlyRefItem(name="资产", value="A"),
	@FlyRefItem(name="负债", value="L"),
	@FlyRefItem(name="收入", value="R"),
	@FlyRefItem(name="费用", value="E"),
	@FlyRefItem(name="权益", value="O"),
	@FlyRefItem(name="备忘录", value="M"),
})
	C_ElementValue_AccountType,
	//
	@FlyRefList(name="C_ElementValue 帐户符号", description="帐户符号列表", items={
	@FlyRefItem(name="普通", value="N"),
	@FlyRefItem(name="借方", value="D"),
	@FlyRefItem(name="贷方", value="C"),
})
	C_ElementValue_Account_Sign,
	//
	@FlyRefList(name="AD_TreeType 类型", description="树类型列表", help="Determines which element to use as the base for the information", items={
	@FlyRefItem(name="User 1", value="U1"),
	@FlyRefItem(name="User 2", value="U2"),
	@FlyRefItem(name="User 3", value="U3"),
	@FlyRefItem(name="User 4", value="U4"),
	@FlyRefItem(name="CM Container", value="CC"),
	@FlyRefItem(name="CM Container Stage", value="CS"),
	@FlyRefItem(name="CM Template", value="CT"),
	@FlyRefItem(name="CM Media", value="CM"),
	@FlyRefItem(name="菜单", value="MM"),
	@FlyRefItem(name="Element Value (Account, etc.)", value="EV"),
	@FlyRefItem(name="产品", value="PR"),
	@FlyRefItem(name="主业务伙伴", value="BP"),
	@FlyRefItem(name="组织", value="OO"),
	@FlyRefItem(name="物料清单", value="BB"),
	@FlyRefItem(name="项目", value="PJ"),
	@FlyRefItem(name="销售区域", value="SR"),
	@FlyRefItem(name="产品种类", value="PC"),
	@FlyRefItem(name="活动", value="MC"),
	@FlyRefItem(name="活动", value="AY"),
})
	AD_TreeType_Type,
	//
	@FlyRefList(name="X12DE98 Entity Identifier Code", description="X12DE98 Entity Identifier Code list", help="Identify organizational entity physical location property or individual list", items={
	@FlyRefItem(name="地方的办公室", value="12"),
	@FlyRefItem(name="办公费应付帐户", value="15"),
	@FlyRefItem(name="植物", value="16"),
	@FlyRefItem(name="小的业务", value="21"),
	@FlyRefItem(name="少数-拥有小的业务", value="22"),
	@FlyRefItem(name="少数-拥有了业务", value="23"),
	@FlyRefItem(name="女人拥有的小业务", value="24"),
	@FlyRefItem(name="女人拥有的业务", value="25"),
	@FlyRefItem(name="转包商", value="28"),
	@FlyRefItem(name="个人", value="2J"),
	@FlyRefItem(name="合伙", value="2K"),
	@FlyRefItem(name="公司", value="2L"),
	@FlyRefItem(name="下载位置", value="45"),
})
	X12DE98_Entity_Identifier_Code,
	//
	@FlyRefList(name="C_AcctSchema 成本计算方法", description="成本计算方法目录", items={
	@FlyRefItem(name="最近采购定单价格", value="p"),
	@FlyRefItem(name="_", value="x"),
	@FlyRefItem(name="标准成本计算", value="S"),
	@FlyRefItem(name="平均", value="A"),
	@FlyRefItem(name="后进先出", value="L"),
	@FlyRefItem(name="先进先出", value="F"),
	@FlyRefItem(name="Average Invoice", value="I"),
	@FlyRefItem(name="Last Invoice", value="i"),
	@FlyRefItem(name="User Defined", value="U"),
})
	C_AcctSchema_Costing_Method,
	//
	@FlyRefList(name="C_AcctSchema GAAP", description="General Accepted Accounting Principle list", items={
	@FlyRefItem(name="国际的 GAAP", value="UN"),
	@FlyRefItem(name="美国 GAAP", value="US"),
	@FlyRefItem(name="德国的 HGB", value="DE"),
	@FlyRefItem(name="法国会计规则", value="FR"),
	@FlyRefItem(name="定制会计规则", value="XX"),
})
	C_AcctSchema_GAAP,
	//
	@FlyRefList(name="AD_Table 复制类型", description="复制类型", items={
	@FlyRefItem(name="本地复制", value="L"),
	@FlyRefItem(name="合并复制", value="M"),
	@FlyRefItem(name="引用复制", value="R"),
	@FlyRefItem(name="Broadcast", value="B"),
})
	AD_Table_Replication_Type,
	//
	@FlyRefList(name="M_Product BOM 类型", items={
	@FlyRefItem(name="In alternative Group 5", value="5"),
	@FlyRefItem(name="In alternative Group 6", value="6"),
	@FlyRefItem(name="In alternative Group 7", value="7"),
	@FlyRefItem(name="In alternative Group 8", value="8"),
	@FlyRefItem(name="In alternative Group 9", value="9"),
	@FlyRefItem(name="标准部件", value="P"),
	@FlyRefItem(name="可选部件", value="O"),
	@FlyRefItem(name="替代方案组 1", value="1"),
	@FlyRefItem(name="替代方案组 2", value="2"),
	@FlyRefItem(name="改变naltve 组 3", value="3"),
	@FlyRefItem(name="替代方案组 4", value="4"),
})
	M_Product_BOM_Product_TypeX,
	//
	@FlyRefList(name="AD_Workflow Type", description="Workflow Type", items={
	@FlyRefItem(name="General", value="G"),
	@FlyRefItem(name="Document Process", value="P"),
	@FlyRefItem(name="Document Value", value="V"),
	@FlyRefItem(name="Quality", value="Q"),
	@FlyRefItem(name="Manufacturing", value="M"),
})
	AD_Workflow_Type,
	//
	@FlyRefList(name="M_Replenishment Create", items={
	@FlyRefItem(name="Inventory Move", value="MMM"),
	@FlyRefItem(name="Purchase Order", value="POO"),
	@FlyRefItem(name="Requisition", value="POR"),
	@FlyRefItem(name="Distribution Order", value="DOO"),
})
	M_Replenishment_Create,
	//
	@FlyRefList(name="AD_Role PreferenceType", description="Preference Type", items={
	@FlyRefItem(name="Client", value="C"),
	@FlyRefItem(name="Organization", value="O"),
	@FlyRefItem(name="User", value="U"),
	@FlyRefItem(name="None", value="N"),
})
	AD_Role_PreferenceType,
	//
	@FlyRefList(name="APAR", description="AP and/or AR", items={
	@FlyRefItem(name="Receivables & Payables", value="A"),
	@FlyRefItem(name="Receivables only", value="R"),
	@FlyRefItem(name="Payables only", value="P"),
})
	APAR,
	//
	@FlyRefList(name="All_Posting 类型", description="Posting Type (Actual Budget etc.) list", items={
	@FlyRefItem(name="实际", value="A"),
	@FlyRefItem(name="预算", value="B"),
	@FlyRefItem(name="债权", value="E"),
	@FlyRefItem(name="统计的", value="S"),
	@FlyRefItem(name="Reservation", value="R"),
})
	_Posting_Type,
	//
	@FlyRefList(name="All_Entity 类型", description="Entity Type (Dictionary, ..)", items={
	@FlyRefItem(name="字典", value="D"),
	@FlyRefItem(name="Adempiere", value="C"),
	@FlyRefItem(name="用户维护", value="U"),
	@FlyRefItem(name="应用", value="A"),
	@FlyRefItem(name="Customization", value="CUST"),
})
	_Entity_Type,
	//
	@FlyRefList(name="ShowHelp List", items={
	@FlyRefItem(name="Run silently - Take Defaults", value="S"),
	@FlyRefItem(name="Ask user (for future use)", value="A"),
	@FlyRefItem(name="Don't show help", value="N"),
	@FlyRefItem(name="Show Help", value="Y"),
})
	ShowHelp_List,
	//
	@FlyRefList(name="All_Document 状态", description="文档状态目录", items={
	@FlyRefItem(name="已批准", value="AP"),
	@FlyRefItem(name="关闭", value="CL"),
	@FlyRefItem(name="完成", value="CO"),
	@FlyRefItem(name="未活动的", value="IN"),
	@FlyRefItem(name="取消", value="RE"),
	@FlyRefItem(name="空虚", value="VO"),
	@FlyRefItem(name="未知的", value="??"),
	@FlyRefItem(name="过程中", value="IP"),
	@FlyRefItem(name="未核准", value="NA"),
	@FlyRefItem(name="等候付款", value="WP"),
	@FlyRefItem(name="起草", value="DR"),
	@FlyRefItem(name="等待确认", value="WC"),
})
	_Document_Status,
	//
	@FlyRefList(name="All_Document 动作", description="文档动作目录", items={
	@FlyRefItem(name="完成", value="CO"),
	@FlyRefItem(name="批准", value="AP"),
	@FlyRefItem(name="被拒", value="RJ"),
	@FlyRefItem(name="职位", value="PO"),
	@FlyRefItem(name="空白", value="VO"),
	@FlyRefItem(name="结束", value="CL"),
	@FlyRefItem(name="Reverse - Correction", value="RC"),
	@FlyRefItem(name="Reverse - Accrual", value="RA"),
	@FlyRefItem(name="转帐", value="IN"),
	@FlyRefItem(name="重新激活", value="RE"),
	@FlyRefItem(name="<没有>", value="--"),
	@FlyRefItem(name="Wait Complete", value="WC"),
	@FlyRefItem(name="程序", value="PR"),
	@FlyRefItem(name="解锁", value="XL"),
})
	_Document_Action,
	//
	@FlyRefList(name="M_Discount 累计级别", items={
	@FlyRefItem(name="明细", value="L"),
})
	M_Discount_CumulativeLevel,
	//
	@FlyRefList(name="M_Discount 类型", items={
	@FlyRefItem(name="直线的百分比", value="F"),
	@FlyRefItem(name="公式", value="S"),
	@FlyRefItem(name="休息", value="B"),
	@FlyRefItem(name="价目表", value="P"),
})
	M_Discount_Type,
	//
	@FlyRefList(name="AD_Color StartPoint", items={
	@FlyRefItem(name="北方", value="1"),
	@FlyRefItem(name="东北方", value="2"),
	@FlyRefItem(name="东方", value="3"),
	@FlyRefItem(name="东南方", value="4"),
	@FlyRefItem(name="南方", value="5"),
	@FlyRefItem(name="西南方", value="6"),
	@FlyRefItem(name="西方", value="7"),
	@FlyRefItem(name="西北方", value="8"),
})
	AD_Color_StartPoint,
	//
	@FlyRefList(name="M_Product_Costing 来源", items={
	@FlyRefItem(name="FiFo", value="F"),
	@FlyRefItem(name="LiFo", value="L"),
	@FlyRefItem(name="Average Invoice", value="I"),
	@FlyRefItem(name="Old Standard Cost", value="x"),
	@FlyRefItem(name="Future Standard Cost", value="f"),
	@FlyRefItem(name="标准成本", value="S"),
	@FlyRefItem(name="平均成本", value="A"),
	@FlyRefItem(name="最近采购定单价格", value="p"),
	@FlyRefItem(name="最近发票价格", value="i"),
	@FlyRefItem(name="价目表", value="LL"),
	@FlyRefItem(name="采购定单差异调整", value="DP"),
	@FlyRefItem(name="Adjust using Invoice Difference", value="DI"),
})
	CostUpdate_Source,
	//
	@FlyRefList(name="C_Tax SPPOType", items={
	@FlyRefItem(name="Both", value="B"),
	@FlyRefItem(name="销项税", value="S"),
	@FlyRefItem(name="进项税", value="P"),
})
	C_Tax_SPPOType,
	//
	@FlyRefList(name="C_BPartner SOCreditStatus", description="Sales Credit Status", items={
	@FlyRefItem(name="Credit Stop", value="S"),
	@FlyRefItem(name="Credit Hold", value="H"),
	@FlyRefItem(name="Credit Watch", value="W"),
	@FlyRefItem(name="No Credit Check", value="X"),
	@FlyRefItem(name="Credit OK", value="O"),
})
	C_BPartner_SOCreditStatus,
	//
	@FlyRefList(name="AD_Field ObscureType", items={
	@FlyRefItem(name="Obscure Digits but last 4", value="904"),
	@FlyRefItem(name="Obscure Digits but first/last 4", value="944"),
	@FlyRefItem(name="Obscure AlphaNumeric but first/last 4", value="A44"),
	@FlyRefItem(name="Obscure AlphaNumeric but last 4", value="A04"),
})
	AD_Field_ObscureType,
	//
	@FlyRefList(name="AD_Table_Access RuleType", description="AccessRuleType", items={
	@FlyRefItem(name="Accessing", value="A"),
	@FlyRefItem(name="Reporting", value="R"),
	@FlyRefItem(name="Exporting", value="E"),
})
	AD_Table_Access_RuleType,
	//
	@FlyRefList(name="M_TransactionAllocation 类型", items={
	@FlyRefItem(name="LiFo", value="L"),
	@FlyRefItem(name="FiFo", value="F"),
})
	M_TransactionAllocation_Type,
	//
	@FlyRefList(name="M_Inventory 类型", description="Inventory Type (Difference - Charge)", items={
	@FlyRefItem(name="Inventory Difference", value="D"),
	@FlyRefItem(name="Charge Account", value="C"),
})
	M_Inventory_Type,
	//
	@FlyRefList(name="C_ProjectType 分类", items={
	@FlyRefItem(name="General", value="N"),
	@FlyRefItem(name="资产项目", value="A"),
	@FlyRefItem(name="Work Order (Job)", value="W"),
	@FlyRefItem(name="服务(费用) 项目", value="S"),
})
	C_ProjectType_Category,
	//
	@FlyRefList(name="AD_Reference 验证类型", description="Reference Validation Type list", help="e.g. I - Independent ", items={
	@FlyRefItem(name="列表验证", value="L"),
	@FlyRefItem(name="数据类型", value="D"),
	@FlyRefItem(name="表验证", value="T"),
})
	AD_Reference_Validation_Types,
	//
	@FlyRefList(name="AD_Table 访问级别", description="Table Access and Sharing Level list", items={
	@FlyRefItem(name="系统+客户", value="6"),
	@FlyRefItem(name="机构", value="1"),
	@FlyRefItem(name="客户+机构", value="3"),
	@FlyRefItem(name="仅系统级", value="4"),
	@FlyRefItem(name="全部", value="7"),
	@FlyRefItem(name="仅客户级", value="2"),
})
	AD_Table_Access_Levels,
	//
	@FlyRefList(name="CRM Schedule", help="Forward and Backward Scheduling", items={
	@FlyRefItem(name="Backward ", value="B"),
	@FlyRefItem(name="Forward", value="F"),
})
	CRM_Schedule,
	//
	@FlyRefList(name="C_DocType SubTypeSO", description="定单类型列出", items={
	@FlyRefItem(name="信用定单", value="WI"),
	@FlyRefItem(name="POS定单", value="WR"),
	@FlyRefItem(name="仓库定单", value="WP"),
	@FlyRefItem(name="标准定单", value="SO"),
	@FlyRefItem(name="提议", value="ON"),
	@FlyRefItem(name="报价", value="OB"),
	@FlyRefItem(name="退回材料 **", value="RM"),
	@FlyRefItem(name="先付定单", value="PR"),
})
	C_DocType_SubTypeSO,
	//
	@FlyRefList(name="AD_Print 曲线图类型", items={
	@FlyRefItem(name="饼图", value="P"),
	@FlyRefItem(name="线图", value="L"),
	@FlyRefItem(name="直条图", value="B"),
})
	AD_Print_Graph_Type,
	//
	@FlyRefList(name="_MRP Order Type", items={
	@FlyRefItem(name="Safety Stock", value="STK"),
	@FlyRefItem(name="Forecast", value="FCT"),
	@FlyRefItem(name="Purchase Order", value="POO"),
	@FlyRefItem(name="Material Requisition", value="POR"),
	@FlyRefItem(name="Sales Order", value="SOO"),
	@FlyRefItem(name="Distribution Order", value="DOO"),
	@FlyRefItem(name="Manufacturing Order", value="MOP"),
})
	_MRP_Order_Type,
	//
	@FlyRefList(name="C_Payment CreditCard 类型", description="C_Payment Credit Card Type list", items={
	@FlyRefItem(name="美国证券交易所", value="A"),
	@FlyRefItem(name="自动柜员机", value="C"),
	@FlyRefItem(name="MasterCard", value="M"),
	@FlyRefItem(name="签证", value="V"),
	@FlyRefItem(name="采购卡片", value="P"),
	@FlyRefItem(name="用餐者", value="D"),
	@FlyRefItem(name="发现", value="N"),
})
	C_Payment_CreditCard_Type,
	//
	@FlyRefList(name="M_Product_ProductType", items={
	@FlyRefItem(name="项目", value="I"),
	@FlyRefItem(name="服务", value="S"),
	@FlyRefItem(name="资源", value="R"),
	@FlyRefItem(name="费用类型", value="E"),
	@FlyRefItem(name="在线", value="O"),
})
	M_Product_ProductType,
	//
	@FlyRefList(name="M_DiscountPriceList RoundingRule", description="定圆整规则目录的价格", items={
	@FlyRefItem(name="Whole Number .00", value="0"),
	@FlyRefItem(name="没有圆整", value="N"),
	@FlyRefItem(name="Quarter .25 .50 .75", value="Q"),
	@FlyRefItem(name="Dime .10, .20, .30, ...", value="D"),
	@FlyRefItem(name="Nickel .05, .10, .15, ...", value="5"),
	@FlyRefItem(name="Ten 10.00, 20.00, ..", value="T"),
	@FlyRefItem(name="币种精度", value="C"),
	@FlyRefItem(name="Ending in 9/5", value="9"),
})
	M_DiscountPriceList_RoundingRule,
	//
	@FlyRefList(name="AD_PrintFormatItem ShapeType", items={
	@FlyRefItem(name="3D Rectangle", value="3"),
	@FlyRefItem(name="Oval", value="O"),
	@FlyRefItem(name="Round Rectangle", value="R"),
	@FlyRefItem(name="Normal Rectangle", value="N"),
})
	AD_PrintFormatItem_ShapeType,
	//
	@FlyRefList(name="AD_Client AutoArchive", items={
	@FlyRefItem(name="None", value="N"),
	@FlyRefItem(name="All (Reports, Documents)", value="1"),
	@FlyRefItem(name="Documents", value="2"),
	@FlyRefItem(name="External Documents", value="3"),
})
	AD_Client_AutoArchive,
	//
	@FlyRefList(name="R_Request Confidential", items={
	@FlyRefItem(name="Public Information", value="A"),
	@FlyRefItem(name="Partner Confidential", value="C"),
	@FlyRefItem(name="Private Information", value="P"),
	@FlyRefItem(name="Internal", value="I"),
})
	R_Request_Confidential,
	//
	@FlyRefList(name="W_MailMsg Type", items={
	@FlyRefItem(name="Order Acknowledgement", value="OA"),
	@FlyRefItem(name="Payment Acknowledgement", value="PA"),
	@FlyRefItem(name="Payment Error", value="PE"),
	@FlyRefItem(name="User Verification", value="UV"),
	@FlyRefItem(name="User Password", value="UP"),
	@FlyRefItem(name="Subscribe", value="LS"),
	@FlyRefItem(name="UnSubscribe", value="LU"),
	@FlyRefItem(name="User Account", value="UA"),
	@FlyRefItem(name="Request", value="WR"),
})
	W_MailMsg_Type,
	//
	@FlyRefList(name="AD_SysConfig ConfigurationLevel", description="Configuration Level", items={
	@FlyRefItem(name="System", value="S"),
	@FlyRefItem(name="Client", value="C"),
	@FlyRefItem(name="Organization", value="O"),
})
	AD_SysConfig_ConfigurationLevel,
	//
	@FlyRefList(name="ASP_Status", items={
	@FlyRefItem(name="Hide", value="H"),
	@FlyRefItem(name="Show", value="S"),
	@FlyRefItem(name="Undefined", value="U"),
})
	ASP_Status,
	//
	@FlyRefList(name="AD_Rule_RuleType", items={
	@FlyRefItem(name="Aspect Orient Program", value="A"),
	@FlyRefItem(name="JSR 223 Scripting APIs", value="S"),
	@FlyRefItem(name="JSR 94 Rule Engine API", value="R"),
	@FlyRefItem(name="SQL", value="Q"),
})
	AD_Rule_RuleType,
	//
	@FlyRefList(name="AD_Rule_EventType", items={
	@FlyRefItem(name="Human Resource & Payroll", value="H"),
	@FlyRefItem(name="Measure for Performance Analysis", value="M"),
	@FlyRefItem(name="Callout", value="C"),
	@FlyRefItem(name="Process", value="P"),
	@FlyRefItem(name="Model Validator Table Event", value="T"),
	@FlyRefItem(name="Model Validator Document Event", value="D"),
	@FlyRefItem(name="Model Validator Login Event", value="L"),
	@FlyRefItem(name="GL Reconciliation", value="R"),
})
	AD_Rule_EventType,
	//
	@FlyRefList(name="EventModelValidator", items={
	@FlyRefItem(name="Table Before New", value="TBN"),
	@FlyRefItem(name="Table Before Change", value="TBC"),
	@FlyRefItem(name="Table Before Delete", value="TBD"),
	@FlyRefItem(name="Table After New", value="TAN"),
	@FlyRefItem(name="Table After Change", value="TAC"),
	@FlyRefItem(name="Table After Delete", value="TAD"),
	@FlyRefItem(name="Document Before Prepare", value="DBPR"),
	@FlyRefItem(name="Document Before Void", value="DBVO"),
	@FlyRefItem(name="Document Before Close", value="DBCL"),
	@FlyRefItem(name="Document Before Reactivate", value="DBAC"),
	@FlyRefItem(name="Document Before Reverse Correct", value="DBRC"),
	@FlyRefItem(name="Document Before Reverse Accrual", value="DBRA"),
	@FlyRefItem(name="Document Before Complete", value="DBCO"),
	@FlyRefItem(name="Document Before Post", value="DBPO"),
	@FlyRefItem(name="Document After Prepare", value="DAPR"),
	@FlyRefItem(name="Document After Void", value="DAVO"),
	@FlyRefItem(name="Document After Close", value="DACL"),
	@FlyRefItem(name="Document After Reactivate", value="DAAC"),
	@FlyRefItem(name="Document After Reverse Correct", value="DARC"),
	@FlyRefItem(name="Document After Reverse Accrual", value="DARA"),
	@FlyRefItem(name="Document After Complete", value="DACO"),
	@FlyRefItem(name="Document After Post", value="DAPO"),
	@FlyRefItem(name="Table After New Replication", value="TANR"),
	@FlyRefItem(name="Table After Change Replication", value="TACR"),
	@FlyRefItem(name="Table Before Delete Replication", value="TBDR"),
})
	EventModelValidator,
	//
	@FlyRefList(name="EventChangeLog", items={
	@FlyRefItem(name="Delete", value="D"),
	@FlyRefItem(name="Insert", value="I"),
	@FlyRefItem(name="Update", value="U"),
})
	EventChangeLog,
	//
	@FlyRefList(name="MigrationScriptStatus", description="Migration Script Status", items={
	@FlyRefItem(name="In Progress", value="IP"),
	@FlyRefItem(name="Completed", value="CO"),
	@FlyRefItem(name="Error", value="ER"),
})
	MigrationScriptStatus,
	//
	@FlyRefList(name="AD_User NotificationType", items={
	@FlyRefItem(name="None", value="X"),
	@FlyRefItem(name="EMail+Notice", value="B"),
	@FlyRefItem(name="EMail", value="E"),
	@FlyRefItem(name="Notice", value="N"),
})
	AD_User_NotificationType,
	//
	@FlyRefList(name="AD_Column Encrypted", items={
	@FlyRefItem(name="Encrypted", value="Y"),
	@FlyRefItem(name="Not Encrypted", value="N"),
})
	AD_Column_Encrypted,
	//
	@FlyRefList(name="C_AcctSchema CostingLevel", items={
	@FlyRefItem(name="Client", value="C"),
	@FlyRefItem(name="Organization", value="O"),
	@FlyRefItem(name="Batch/Lot", value="B"),
	@FlyRefItem(name="Warehouse", value="W"),
})
	C_AcctSchema_CostingLevel,
	//
	@FlyRefList(name="AD_WF_Node EMailRecipient", items={
	@FlyRefItem(name="Document Owner", value="D"),
	@FlyRefItem(name="Document Business Partner", value="B"),
	@FlyRefItem(name="WF Responsible", value="R"),
})
	AD_WF_Node_EMailRecipient,
	//
	@FlyRefList(name="C_AcctSchema CommitmentType", items={
	@FlyRefItem(name="PO/SO Commitment & Reservation", value="A"),
	@FlyRefItem(name="SO Commitment only", value="S"),
	@FlyRefItem(name="PO/SO Commitment", value="O"),
	@FlyRefItem(name="PO Commitment only", value="C"),
	@FlyRefItem(name="PO Commitment & Reservation", value="B"),
	@FlyRefItem(name="None", value="N"),
})
	C_AcctSchema_CommitmentType,
	//
	@FlyRefList(name="GL_BudgetControl Scope", items={
	@FlyRefItem(name="Period only", value="P"),
	@FlyRefItem(name="Year To Date", value="Y"),
	@FlyRefItem(name="Total", value="T"),
})
	GL_BudgetControl_Scope,
	//
	@FlyRefList(name="AD_User ConnectionProfile", items={
	@FlyRefItem(name="VPN", value="V"),
	@FlyRefItem(name="WAN", value="W"),
	@FlyRefItem(name="LAN", value="L"),
	@FlyRefItem(name="Terminal Server", value="T"),
})
	AD_User_ConnectionProfile,
	//
	@FlyRefList(name="AD_Client ShareType", items={
	@FlyRefItem(name="Client (all shared)", value="C"),
	@FlyRefItem(name="Org (not shared)", value="O"),
	@FlyRefItem(name="Client or Org", value="x"),
})
	AD_Client_ShareType,
	//
	@FlyRefList(name="R_Request TaskStatus", items={
	@FlyRefItem(name=" 0% Not Started", value="0"),
	@FlyRefItem(name="100% Complete", value="D"),
	@FlyRefItem(name=" 20% Started", value="2"),
	@FlyRefItem(name=" 80% Nearly Done", value="8"),
	@FlyRefItem(name=" 40% Busy", value="4"),
	@FlyRefItem(name=" 60% Good Progress", value="6"),
	@FlyRefItem(name=" 90% Finishing", value="9"),
	@FlyRefItem(name=" 95% Almost Done", value="A"),
	@FlyRefItem(name=" 99% Cleaning up", value="C"),
})
	R_Request_TaskStatus,
	//
	@FlyRefList(name="PA_Goal Scope", items={
	@FlyRefItem(name="Year", value="1"),
	@FlyRefItem(name="Quarter", value="3"),
	@FlyRefItem(name="Month", value="5"),
	@FlyRefItem(name="Total", value="0"),
	@FlyRefItem(name="Week", value="7"),
	@FlyRefItem(name="Day", value="8"),
})
	PA_Goal_Scope,
	//
	@FlyRefList(name="PA_Goal Restriction Type", items={
	@FlyRefItem(name="Bus.Partner Group", value="G"),
	@FlyRefItem(name="Product Category", value="C"),
	@FlyRefItem(name="Organization", value="O"),
	@FlyRefItem(name="Business Partner", value="B"),
	@FlyRefItem(name="Product", value="P"),
})
	PA_Goal_Restriction_Type,
	//
	@FlyRefList(name="AD_PrintPaper Units", items={
	@FlyRefItem(name="MM", value="M"),
	@FlyRefItem(name="Inch", value="I"),
})
	AD_PrintPaper_Units,
	//
	@FlyRefList(name="M_Inventory CountSet", items={
	@FlyRefItem(name="On Hand Qty", value="O"),
	@FlyRefItem(name="Zero", value="Z"),
})
	M_Inventory_CountSet,
	//
	@FlyRefList(name="AD_PrintFormatItem BarcodeType", items={
	@FlyRefItem(name="Code 39 USD3 w/o Checksum", value="us3"),
	@FlyRefItem(name="Code 39  3 of 9 linear with Checksum", value="3O9"),
	@FlyRefItem(name="Code 39 linear w/o Checksum", value="c39"),
	@FlyRefItem(name="EAN 13", value="E13"),
	@FlyRefItem(name="Codabar 2 of 7 linear", value="2o9"),
	@FlyRefItem(name="Code 39  3 of 9 linear w/o Checksum", value="3o9"),
	@FlyRefItem(name="Codeabar linear", value="COD"),
	@FlyRefItem(name="Code 128 dynamically switching", value="C28"),
	@FlyRefItem(name="Code 128 A character set", value="28A"),
	@FlyRefItem(name="Code 128 B character set", value="28B"),
	@FlyRefItem(name="Code 128 C character set", value="28C"),
	@FlyRefItem(name="Code 39 linear with Checksum", value="C39"),
	@FlyRefItem(name="EAN 128", value="E28"),
	@FlyRefItem(name="Global Trade Item No GTIN UCC/EAN 128", value="GTN"),
	@FlyRefItem(name="Codabar Monarch linear", value="MON"),
	@FlyRefItem(name="Codabar NW-7 linear", value="NW7"),
	@FlyRefItem(name="PDF417 two dimensional", value="417"),
	@FlyRefItem(name="SCC-14 shipping code UCC/EAN 128", value="C14"),
	@FlyRefItem(name="Shipment ID number UCC/EAN 128", value="SID"),
	@FlyRefItem(name="UCC 128", value="U28"),
	@FlyRefItem(name="Code 39 USD3 with Checksum", value="US3"),
	@FlyRefItem(name="Codabar USD-4 linear", value="US4"),
	@FlyRefItem(name="US Postal Service UCC/EAN 128", value="USP"),
	@FlyRefItem(name="SSCC-18 number UCC/EAN 128", value="C18"),
})
	AD_PrintFormatItem_BarcodeType,
	//
	@FlyRefList(name="_MMPolicy", description="Material Movement Policy", items={
	@FlyRefItem(name="LiFo", value="L"),
	@FlyRefItem(name="FiFo", value="F"),
})
	_MMPolicy,
	//
	@FlyRefList(name="M_CostElement Type", items={
	@FlyRefItem(name="Burden (M.Overhead)", value="B"),
	@FlyRefItem(name="Outside Processing", value="X"),
	@FlyRefItem(name="Resource", value="R"),
	@FlyRefItem(name="Material", value="M"),
	@FlyRefItem(name="Overhead", value="O"),
	@FlyRefItem(name="Landed Cost", value="L"),
})
	M_CostElement_Type,
	//
	@FlyRefList(name="C_LandedCost Distribution", items={
	@FlyRefItem(name="Quantity", value="Q"),
	@FlyRefItem(name="Line", value="L"),
	@FlyRefItem(name="Volume", value="V"),
	@FlyRefItem(name="Weight", value="W"),
	@FlyRefItem(name="Costs", value="C"),
})
	C_LandedCost_Distribution,
	//
	@FlyRefList(name="AD_System Status", items={
	@FlyRefItem(name="Production", value="P"),
	@FlyRefItem(name="Evaluation", value="E"),
	@FlyRefItem(name="Implementation", value="I"),
})
	AD_System_Status,
	//
	@FlyRefList(name="C_BP_Group PriorityBase", items={
	@FlyRefItem(name="Same", value="S"),
	@FlyRefItem(name="Lower", value="L"),
	@FlyRefItem(name="Higher", value="H"),
})
	C_BP_Group_PriorityBase,
	//
	@FlyRefList(name="AD_Color 类型", items={
	@FlyRefItem(name="常态", value="F"),
	@FlyRefItem(name="倾斜度", value="G"),
	@FlyRefItem(name="明细", value="L"),
	@FlyRefItem(name="织法", value="T"),
})
	AD_Color_Type,
	//
	@FlyRefList(name="AD_User BP AccessType", items={
	@FlyRefItem(name="Business Documents", value="B"),
	@FlyRefItem(name="Requests", value="R"),
	@FlyRefItem(name="Assets, Download", value="A"),
})
	AD_User_BP_AccessType,
	//
	@FlyRefList(name="C_Project InvoiceRule", items={
	@FlyRefItem(name="None", value="-"),
	@FlyRefItem(name="Committed Amount", value="C"),
	@FlyRefItem(name="Time&Material max Comitted", value="c"),
	@FlyRefItem(name="Time&Material", value="T"),
	@FlyRefItem(name="Product  Quantity", value="P"),
})
	C_Project_InvoiceRule,
	//
	@FlyRefList(name="C_Project LineLevel", items={
	@FlyRefItem(name="Project", value="P"),
	@FlyRefItem(name="Phase", value="A"),
	@FlyRefItem(name="Task", value="T"),
})
	C_Project_LineLevel,
	//
	@FlyRefList(name="C_Remuneration Type", items={
	@FlyRefItem(name="Hourly", value="H"),
	@FlyRefItem(name="Daily", value="D"),
	@FlyRefItem(name="Weekly", value="W"),
	@FlyRefItem(name="Monthly", value="M"),
	@FlyRefItem(name="Twice Monthly", value="T"),
	@FlyRefItem(name="Bi-Weekly", value="B"),
})
	C_Remuneration_Type,
	//
	@FlyRefList(name="C_Order InvoiceRule", description="开发票规则列表", items={
	@FlyRefItem(name="在定单配送之后", value="O"),
	@FlyRefItem(name="在配送之后", value="D"),
	@FlyRefItem(name="Customer Schedule after Delivery", value="S"),
	@FlyRefItem(name="立即的", value="I"),
})
	C_Order_InvoiceRule,
	//
	@FlyRefList(name="All_PriorityRule", description="优先权刻度目录", items={
	@FlyRefItem(name="高级", value="3"),
	@FlyRefItem(name="中等", value="5"),
	@FlyRefItem(name="低级", value="7"),
	@FlyRefItem(name="Urgent", value="1"),
	@FlyRefItem(name="Minor", value="9"),
})
	_PriorityRule,
	//
	@FlyRefList(name="C_Order FreightCostRule", description="运费规则列表", items={
	@FlyRefItem(name="已包括运费", value="I"),
	@FlyRefItem(name="计算", value="C"),
	@FlyRefItem(name="固定价格", value="F"),
	@FlyRefItem(name="明细", value="L"),
})
	C_Order_FreightCostRule,
	//
	@FlyRefList(name="C_Order DeliveryViaRule", description="配送经由规则列表", items={
	@FlyRefItem(name="配送", value="D"),
	@FlyRefItem(name="运输商", value="S"),
	@FlyRefItem(name="自提", value="P"),
})
	C_Order_DeliveryViaRule,
	//
	@FlyRefList(name="M_BOM Type", items={
	@FlyRefItem(name="Current Active", value="A"),
	@FlyRefItem(name="Make-To-Order", value="O"),
	@FlyRefItem(name="Previous", value="P"),
	@FlyRefItem(name="Previous, Spare", value="S"),
	@FlyRefItem(name="Future", value="F"),
	@FlyRefItem(name="Maintenance", value="M"),
	@FlyRefItem(name="Repair", value="R"),
	@FlyRefItem(name="Product Configure", value="C"),
	@FlyRefItem(name="Make-To-Kit", value="K"),
})
	M_BOM_Type,
	//
	@FlyRefList(name="M_BOM Use", items={
	@FlyRefItem(name="Master", value="A"),
	@FlyRefItem(name="Engineering", value="E"),
	@FlyRefItem(name="Manufacturing", value="M"),
	@FlyRefItem(name="Planning", value="P"),
	@FlyRefItem(name="Quality", value="Q"),
})
	M_BOM_Use,
	//
	@FlyRefList(name="M_BOMProduct Type", items={
	@FlyRefItem(name="Standard Product", value="S"),
	@FlyRefItem(name="Optional Product", value="O"),
	@FlyRefItem(name="Alternative", value="A"),
	@FlyRefItem(name="Alternative (Default)", value="D"),
	@FlyRefItem(name="Outside Processing", value="X"),
})
	M_BOMProduct_Type,
	//
	@FlyRefList(name="PA_Measure DataType", items={
	@FlyRefItem(name="Qty/Amount in Time", value="T"),
	@FlyRefItem(name="Status Qty/Amount", value="S"),
})
	PA_Measure_DataType,
	//
	@FlyRefList(name="PA_Benschmark Accumulation Type", items={
	@FlyRefItem(name="Average", value="A"),
	@FlyRefItem(name="Sum", value="S"),
})
	PA_Benschmark_Accumulation_Type,
	//
	@FlyRefList(name="PA_Ratio ElementType", items={
	@FlyRefItem(name="Ratio", value="R"),
	@FlyRefItem(name="Constant", value="C"),
	@FlyRefItem(name="Calculation", value="X"),
	@FlyRefItem(name="Account Value", value="A"),
})
	PA_Ratio_ElementType,
	//
	@FlyRefList(name="C_Invoice InvoiceCollectionType", items={
	@FlyRefItem(name="Dunning", value="D"),
	@FlyRefItem(name="Collection Agency", value="C"),
	@FlyRefItem(name="Legal Procedure", value="L"),
	@FlyRefItem(name="Uncollectable", value="U"),
})
	C_Invoice_InvoiceCollectionType,
	//
	@FlyRefList(name="CM_Chat ModerationType", items={
	@FlyRefItem(name="Not moderated", value="N"),
	@FlyRefItem(name="Before Publishing", value="B"),
	@FlyRefItem(name="After Publishing", value="A"),
})
	CM_Chat_ModerationType,
	//
	@FlyRefList(name="CM_ChatEntry ModeratorStatus", items={
	@FlyRefItem(name="Not Displayed", value="N"),
	@FlyRefItem(name="Published", value="P"),
	@FlyRefItem(name="To be reviewed", value="R"),
	@FlyRefItem(name="Suspicious", value="S"),
})
	CM_ChatEntry_ModeratorStatus,
	//
	@FlyRefList(name="CM_WikiToken Type", items={
	@FlyRefItem(name="SQL Command", value="Q"),
	@FlyRefItem(name="Internal Link", value="I"),
	@FlyRefItem(name="External Link", value="E"),
	@FlyRefItem(name="Style", value="S"),
})
	CM_WikiToken_Type,
	//
	@FlyRefList(name="CM_Chat EntryType", items={
	@FlyRefItem(name="Wiki", value="W"),
	@FlyRefItem(name="Note (flat)", value="N"),
	@FlyRefItem(name="Forum (threaded)", value="F"),
})
	CM_Chat_EntryType,
	//
	@FlyRefList(name="C_BPartner BPBankAcctUse", items={
	@FlyRefItem(name="None", value="N"),
	@FlyRefItem(name="Both", value="B"),
	@FlyRefItem(name="Direct Debit", value="D"),
	@FlyRefItem(name="Direct Deposit", value="T"),
})
	C_BPartner_BPBankAcctUse,
	//
	@FlyRefList(name="AD_Package_Type", description="Defines the type of packages available", items={
	@FlyRefItem(name="Local Transfer", value="L"),
	@FlyRefItem(name="Remote Transfer", value="R"),
	@FlyRefItem(name="XML File", value="X"),
})
	AD_Package_Type,
	//
	@FlyRefList(name="Package_Releases", description="List of Package Releases", help="Indicates what release the package is for.  Entering no specific release indicates the package is for all releases.", items={
	@FlyRefItem(name="Release 3.1.0", value="Release 3.1.0"),
	@FlyRefItem(name="Release 3.2.0", value="Release 3.2.0"),
	@FlyRefItem(name="Release 3.3.0", value="Release 3.3.0"),
	@FlyRefItem(name="Release 2.5.2a", value="Release 2.5.2a"),
	@FlyRefItem(name="Release 2.5.2b", value="Release 2.5.2b"),
	@FlyRefItem(name="Release 2.5.2c", value="Release 2.5.2c"),
	@FlyRefItem(name="Release 2.5.2d", value="Release 2.5.2d"),
	@FlyRefItem(name="Release 2.5.2e", value="Release 2.5.2e"),
	@FlyRefItem(name="Release 2.5.3a", value="Release 2.5.3a"),
	@FlyRefItem(name="Release 2.5.3b", value="Release 2.5.3b"),
	@FlyRefItem(name="No specific release", value="all"),
})
	Package_Releases,
	//
	@FlyRefList(name="AD_Package_Exp_DB", description="List of database types", help="This is a list of database types used by the inbound packaging processing to determine if the sql statement is fired.", items={
	@FlyRefItem(name="All Database Types", value="ALL"),
	@FlyRefItem(name="DB2", value="DB2"),
	@FlyRefItem(name="Firebird", value="Firebird"),
	@FlyRefItem(name="MySQL", value="MySQL"),
	@FlyRefItem(name="Oracle", value="Oracle"),
	@FlyRefItem(name="Postgres", value="Postgres"),
	@FlyRefItem(name="SQL Server", value="SQL"),
	@FlyRefItem(name="Sybase", value="Sybase"),
})
	AD_Package_Exp_DB,
	//
	@FlyRefList(name="AD_Package_Build_Type", items={
	@FlyRefItem(name="Workflow", value="F"),
	@FlyRefItem(name="Reference", value="REF"),
	@FlyRefItem(name="Dynamic Validation Rule", value="V"),
	@FlyRefItem(name="Message", value="MSG"),
	@FlyRefItem(name="PrintFormat", value="PFT"),
	@FlyRefItem(name="Model Validator", value="MV"),
	@FlyRefItem(name="Entity Type", value="ET"),
	@FlyRefItem(name="Workbench", value="B"),
	@FlyRefItem(name="File - Code or other", value="C"),
	@FlyRefItem(name="Data", value="D"),
	@FlyRefItem(name="Import Format", value="IMP"),
	@FlyRefItem(name="Application or Module", value="M"),
	@FlyRefItem(name="Process/Report", value="P"),
	@FlyRefItem(name="ReportView", value="R"),
	@FlyRefItem(name="Role", value="S"),
	@FlyRefItem(name="Code Snipit", value="SNI"),
	@FlyRefItem(name="SQL Statement", value="SQL"),
	@FlyRefItem(name="Table", value="T"),
	@FlyRefItem(name="Window", value="W"),
	@FlyRefItem(name="Form", value="X"),
	@FlyRefItem(name="Smart Browse", value="SB"),
	@FlyRefItem(name="Smart View", value="SV"),
})
	AD_Package_Build_Type,
	//
	@FlyRefList(name="AD_Package_Source_Type", description="List of package source types", items={
	@FlyRefItem(name="File", value="File"),
	@FlyRefItem(name="WebService", value="WS"),
})
	AD_Package_Source_Type,
	//
	@FlyRefList(name="PA_Ratio Operand", items={
	@FlyRefItem(name="Plus", value="P"),
	@FlyRefItem(name="Minus", value="N"),
	@FlyRefItem(name="Multiply", value="M"),
	@FlyRefItem(name="Divide", value="D"),
})
	PA_Ratio_Operand,
	//
	@FlyRefList(name="_PublishStatus", description="Publication Status", items={
	@FlyRefItem(name="Released", value="R"),
	@FlyRefItem(name="测试", value="T"),
	@FlyRefItem(name="Under Revision", value="U"),
	@FlyRefItem(name="Void", value="V"),
})
	_PublishStatus,
	//
	@FlyRefList(name="C_Invoice MatchRequirement", items={
	@FlyRefItem(name="None", value="N"),
	@FlyRefItem(name="Receipt", value="R"),
	@FlyRefItem(name="Purchase Order", value="P"),
	@FlyRefItem(name="Purchase Order and Receipt", value="B"),
})
	C_Invoice_MatchRequirement,
	//
	@FlyRefList(name="AD_Find 操作", items={
	@FlyRefItem(name=" =", value="=="),
	@FlyRefItem(name=">=", value=">="),
	@FlyRefItem(name=">", value=">>"),
	@FlyRefItem(name="<", value="<<"),
	@FlyRefItem(name=" ~", value="~~"),
	@FlyRefItem(name="<=", value="<="),
	@FlyRefItem(name="|<x>|", value="AB"),
	@FlyRefItem(name="sql", value="SQ"),
	@FlyRefItem(name="!=", value="!="),
})
	AD_Find_Operation,
	//
	@FlyRefList(name="AD_ImpFormat 类型", items={
	@FlyRefItem(name="产品", value="P"),
	@FlyRefItem(name="业务伙伴 ", value="B"),
	@FlyRefItem(name="帐户", value="A"),
	@FlyRefItem(name="总帐余款", value="S"),
	@FlyRefItem(name="交换比率", value="E"),
	@FlyRefItem(name="盘点", value="I"),
})
	AD_ImpFormat_Type,
	//
	@FlyRefList(name="AD_ImpFormat FormatType", items={
	@FlyRefItem(name="固定的位置", value="F"),
	@FlyRefItem(name="逗点分开", value="C"),
	@FlyRefItem(name="定位键分开", value="T"),
	@FlyRefItem(name="XML语言", value="X"),
	@FlyRefItem(name="Custom Separator Char", value="U"),
})
	AD_ImpFormat_FormatType,
	//
	@FlyRefList(name="AD_ImpFormat_Row 类型", items={
	@FlyRefItem(name="字符串", value="S"),
	@FlyRefItem(name="数字", value="N"),
	@FlyRefItem(name="日期", value="D"),
	@FlyRefItem(name="常数", value="C"),
})
	AD_ImpFormat_Row_Type,
	//
	@FlyRefList(name="M_InventoryCount QtyRange", items={
	@FlyRefItem(name="> 0", value=">"),
	@FlyRefItem(name="= 0", value="="),
	@FlyRefItem(name="< 0", value="<"),
	@FlyRefItem(name="非0", value="N"),
})
	M_InventoryCount_QtyRange,
	//
	@FlyRefList(name="C_Bank 帐户类型", items={
	@FlyRefItem(name="检查", value="C"),
	@FlyRefItem(name="储蓄", value="S"),
})
	C_Bank_Account_Type,
	//
	@FlyRefList(name="C_Cash Trx 类型", items={
	@FlyRefItem(name="转帐到银行帐户", value="T"),
	@FlyRefItem(name="发票", value="I"),
	@FlyRefItem(name="通用费用", value="E"),
	@FlyRefItem(name="通用收据", value="R"),
	@FlyRefItem(name="费用", value="C"),
	@FlyRefItem(name="差额", value="D"),
})
	C_Cash_Trx_Type,
	//
	@FlyRefList(name="R_Request 请求类型", items={
	@FlyRefItem(name="数据", value="I"),
	@FlyRefItem(name="服务", value="S"),
	@FlyRefItem(name="费用", value="C"),
	@FlyRefItem(name="帐户", value="A"),
	@FlyRefItem(name="帮助", value="H"),
	@FlyRefItem(name=" 警报", value="X"),
	@FlyRefItem(name="担保", value="W"),
	@FlyRefItem(name="其他", value="O"),
})
	R_Request_Request_Type,
	//
	@FlyRefList(name="R_Request 下一个动作", items={
	@FlyRefItem(name="没有", value="N"),
	@FlyRefItem(name="追踪", value="F"),
})
	R_Request_Next_Action,
	//
	@FlyRefList(name="R_Request 频率类型", items={
	@FlyRefItem(name="分钟", value="M"),
	@FlyRefItem(name="小时", value="H"),
	@FlyRefItem(name="日", value="D"),
})
	_Frequency_Type,
	//
	@FlyRefList(name="R_Request 应付款类型", items={
	@FlyRefItem(name="超储的", value="3"),
	@FlyRefItem(name="应付款", value="5"),
	@FlyRefItem(name="预定", value="7"),
})
	R_Request_Due_Type,
	//
	@FlyRefList(name="C_Commission DocBasis", items={
	@FlyRefItem(name="定单", value="O"),
	@FlyRefItem(name="发票", value="I"),
	@FlyRefItem(name="收货", value="R"),
})
	C_Commission_DocBasis,
	//
	@FlyRefList(name="C_Commission 频率", items={
	@FlyRefItem(name="Yearly", value="Y"),
	@FlyRefItem(name="每周的", value="W"),
	@FlyRefItem(name="每月的", value="M"),
	@FlyRefItem(name="每季的", value="Q"),
})
	C_Commission_Frequency,
	//
	@FlyRefList(name="AD_Role 用户级别", items={
	@FlyRefItem(name="系统 ", value="S  "),
	@FlyRefItem(name="客户", value=" C "),
	@FlyRefItem(name="机构", value="  O"),
	@FlyRefItem(name="客户+机构", value=" CO"),
})
	AD_Role_User_Level,
	//
	@FlyRefList(name="PA_Measure 类型", items={
	@FlyRefItem(name="Request", value="Q"),
	@FlyRefItem(name="Project", value="P"),
	@FlyRefItem(name="User defined", value="U"),
	@FlyRefItem(name="Ratio", value="R"),
	@FlyRefItem(name="手工", value="M"),
	@FlyRefItem(name="计算", value="C"),
	@FlyRefItem(name="进步", value="A"),
})
	PA_Measure_Type,
	//
	@FlyRefList(name="总帐种类类型", items={
	@FlyRefItem(name="System generated", value="S"),
	@FlyRefItem(name="文件", value="D"),
	@FlyRefItem(name="导入", value="I"),
	@FlyRefItem(name="手工", value="M"),
})
	GL_Category_Type,
	//
	@FlyRefList(name="PA_Report 金额类型", items={
	@FlyRefItem(name="分期余款", value="BP"),
	@FlyRefItem(name="只有分期信用", value="CP"),
	@FlyRefItem(name="只有分期借方", value="DP"),
	@FlyRefItem(name="分期量", value="QP"),
	@FlyRefItem(name="总量", value="QT"),
	@FlyRefItem(name="年余款", value="BY"),
	@FlyRefItem(name="只有年信用", value="CY"),
	@FlyRefItem(name="只有年借方", value="DY"),
	@FlyRefItem(name="年量", value="QY"),
	@FlyRefItem(name="只有总借方", value="DT"),
	@FlyRefItem(name="只有总贷方", value="CT"),
	@FlyRefItem(name="总余款", value="BT"),
	@FlyRefItem(name="Natural Balance", value="BN"),
})
	PA_Report_AmountType__deprecated_,
	//
	@FlyRefList(name="PA_Report 计算类型", items={
	@FlyRefItem(name="增加", value="A"),
	@FlyRefItem(name="减去", value="S"),
	@FlyRefItem(name="百分比", value="P"),
	@FlyRefItem(name="增加范围", value="R"),
})
	PA_Report_CalculationType,
	//
	@FlyRefList(name="PA_Report 列类型", items={
	@FlyRefItem(name="相对分期", value="R"),
	@FlyRefItem(name="计算", value="C"),
	@FlyRefItem(name="表值", value="S"),
})
	PA_Report_ColumnType,
	//
	@FlyRefList(name="PA_Report 货币类型", items={
	@FlyRefItem(name="来源币种", value="S"),
	@FlyRefItem(name="会计币种", value="A"),
})
	PA_Report_CurrencyType,
	//
	@FlyRefList(name="M_Replenish 类型", items={
	@FlyRefItem(name="Custom", value="9"),
	@FlyRefItem(name="维护最大值水平", value="2"),
	@FlyRefItem(name="手工", value="0"),
	@FlyRefItem(name="低于最小量水平定货", value="1"),
	@FlyRefItem(name="Replenish Plan Calculated", value="4"),
})
	M_Replenish_Type,
	//
	@FlyRefList(name="C_Payment AVS", items={
	@FlyRefItem(name="不匹配", value="N"),
	@FlyRefItem(name="不可用的", value="X"),
	@FlyRefItem(name="匹配", value="Y"),
})
	C_Payment_AVS,
	//
	@FlyRefList(name="C_Payment Trx 类型", items={
	@FlyRefItem(name="信用", value="C"),
	@FlyRefItem(name="延迟捕获", value="D"),
	@FlyRefItem(name="宣述授权", value="F"),
	@FlyRefItem(name="销售", value="S"),
	@FlyRefItem(name="空白", value="V"),
	@FlyRefItem(name="授权", value="A"),
})
	C_Payment_Trx_Type,
	//
	@FlyRefList(name="C_Payment 投标类型", items={
	@FlyRefItem(name="ACH", value="A"),
	@FlyRefItem(name="信用卡", value="C"),
	@FlyRefItem(name="支票", value="K"),
	@FlyRefItem(name="Cash", value="X"),
	@FlyRefItem(name="Direct Debit", value="D"),
	@FlyRefItem(name="Credit Memo", value="M"),
	@FlyRefItem(name="Account", value="T"),
})
	C_Payment_Tender_Type,
	//
	@FlyRefList(name="星期", description="星期列表", items={
	@FlyRefItem(name="星期日", value="7"),
	@FlyRefItem(name="星期一", value="1"),
	@FlyRefItem(name="星期二", value="2"),
	@FlyRefItem(name="星期三", value="3"),
	@FlyRefItem(name="星期四", value="4"),
	@FlyRefItem(name="星期五", value="5"),
	@FlyRefItem(name="星期六", value="6"),
})
	Weekdays,
	//
	@FlyRefList(name="C_InvoiceSchedule InvoiceFrequency", items={
	@FlyRefItem(name="每日的", value="D"),
	@FlyRefItem(name="每周的", value="W"),
	@FlyRefItem(name="每月的", value="M"),
	@FlyRefItem(name="两次每月的", value="T"),
})
	C_InvoiceSchedule_InvoiceFrequency,
	//
	@FlyRefList(name="AD_FieldGroup", description="Field Group Type", items={
	@FlyRefItem(name="Tab", value="T"),
	@FlyRefItem(name="Label", value="L"),
	@FlyRefItem(name="Collapse", value="C"),
})
	AD_FieldGroup,
	//
	@FlyRefList(name="C_PeriodControl 动作", items={
	@FlyRefItem(name="有效分期", value="O"),
	@FlyRefItem(name="关闭的分期", value="C"),
	@FlyRefItem(name="<没有动作>", value="N"),
	@FlyRefItem(name="永久关闭分期", value="P"),
})
	C_PeriodControl_Action,
	//
	@FlyRefList(name="C_PeriodControl状态", items={
	@FlyRefItem(name="打开", value="O"),
	@FlyRefItem(name="关闭", value="C"),
	@FlyRefItem(name="永久关闭", value="P"),
	@FlyRefItem(name="从未打开", value="N"),
})
	C_PeriodControl_Status,
	//
	@FlyRefList(name="GL_Budget 状态", items={
	@FlyRefItem(name="已批准", value="A"),
	@FlyRefItem(name="草稿", value="D"),
})
	GL_Budget_Status,
	//
	@FlyRefList(name="All_ErrorType", description="列出错误的类型", items={
	@FlyRefItem(name="错误", value="E"),
	@FlyRefItem(name="警告", value="W"),
	@FlyRefItem(name="信息", value="I"),
})
	_ErrorType,
	//
	@FlyRefList(name="C_AcctSchema ElementType", description="Element Types for Accounting Elements", help="Hardcoded 元素打字", items={
	@FlyRefItem(name="Sub Account", value="SA"),
	@FlyRefItem(name="User Element 1", value="X1"),
	@FlyRefItem(name="User Element 2", value="X2"),
	@FlyRefItem(name="用户 2", value="U2"),
	@FlyRefItem(name="机构", value="OO"),
	@FlyRefItem(name="帐户", value="AC"),
	@FlyRefItem(name="产品", value="PR"),
	@FlyRefItem(name="Bus.Partner", value="BP"),
	@FlyRefItem(name="Trx. Org", value="OT"),
	@FlyRefItem(name="活动", value="AY"),
	@FlyRefItem(name="来源位置", value="LF"),
	@FlyRefItem(name="目标位置", value="LT"),
	@FlyRefItem(name="销售区域", value="SR"),
	@FlyRefItem(name="项目", value="PJ"),
	@FlyRefItem(name="活动", value="MC"),
	@FlyRefItem(name="用户 1", value="U1"),
	@FlyRefItem(name="User List 3", value="U3"),
	@FlyRefItem(name="User List 4", value="U4"),
})
	C_AcctSchema_ElementType,
	//
	@FlyRefList(name="M_DiscountPriceList 基础", items={
	@FlyRefItem(name="列表价格", value="L"),
	@FlyRefItem(name="标准价格", value="S"),
	@FlyRefItem(name="限制 (采购定单) 价格", value="X"),
	@FlyRefItem(name="固定的价格", value="F"),
})
	M_DiscountPriceList_Base,
	//
	@FlyRefList(name="C_RevenueRecognition Frequency", description="Frequency of Revenue Recognition", items={
	@FlyRefItem(name="月", value="M"),
	@FlyRefItem(name="季", value="Q"),
	@FlyRefItem(name="年", value="Y"),
})
	C_RevenueRecognition_Frequency,
	//
	@FlyRefList(name="M_Inventory ReportType", items={
	@FlyRefItem(name="Blind list (w o book quantity)", value="B"),
	@FlyRefItem(name="Count list (with book quantity)", value="L"),
	@FlyRefItem(name="控制目录", value="C"),
})
	M_Inventory_ReportType,
	//
	@FlyRefList(name="AD_Print 字段对准", items={
	@FlyRefItem(name="缺省值", value="D"),
	@FlyRefItem(name="领先", value="L"),
	@FlyRefItem(name="拖", value="T"),
	@FlyRefItem(name="块", value="B"),
	@FlyRefItem(name="中心", value="C"),
})
	AD_Print_Field_Alignment,
	//
	@FlyRefList(name="AD_Print 线对准", items={
	@FlyRefItem(name="没有", value="X"),
	@FlyRefItem(name="领先", value="L"),
	@FlyRefItem(name="中心", value="C"),
	@FlyRefItem(name="拖", value="T"),
})
	AD_Print_Line_Alignment,
	//
	@FlyRefList(name="AD_Print 格式类型", items={
	@FlyRefItem(name="图像", value="I"),
	@FlyRefItem(name="字段", value="F"),
	@FlyRefItem(name="文本", value="T"),
	@FlyRefItem(name="打印格式", value="P"),
	@FlyRefItem(name="Rectangle", value="R"),
	@FlyRefItem(name="Line", value="L"),
})
	AD_Print_Format_Type,
	//
	@FlyRefList(name="AD_Print 区域", items={
	@FlyRefItem(name="内容", value="C"),
	@FlyRefItem(name="头", value="H"),
	@FlyRefItem(name="脚", value="F"),
})
	AD_Print_Area,
	//
	@FlyRefList(name="C_BP_EDI EDI 类型", items={
	@FlyRefItem(name="ASC X12", value="X"),
	@FlyRefItem(name="EDIFACT", value="E"),
	@FlyRefItem(name="发电子邮件给 EDI", value="M"),
})
	C_BP_EDI_EDI_Type,
	//
	@FlyRefList(name="M_EDI 状态", items={
	@FlyRefItem(name="草稿", value="D"),
	@FlyRefItem(name="已发送", value="S"),
	@FlyRefItem(name="确认", value="A"),
	@FlyRefItem(name="回答", value="C"),
})
	M_EDI_Status,
	//
	@FlyRefList(name="M_EDI Trx 类型", items={
	@FlyRefItem(name="查询", value="I"),
	@FlyRefItem(name="采购定单", value="O"),
})
	M_EDI_Trx_Type,
	//
	@FlyRefList(name="AD_Find AndOr", items={
	@FlyRefItem(name="而且", value="A"),
	@FlyRefItem(name="或", value="O"),
})
	AD_Find_AndOr,
	//
	@FlyRefList(name="WF_DurationUnit", items={
	@FlyRefItem(name="Year", value="Y"),
	@FlyRefItem(name="Month", value="M"),
	@FlyRefItem(name="Day", value="D"),
	@FlyRefItem(name="hour", value="h"),
	@FlyRefItem(name="minute", value="m"),
	@FlyRefItem(name="second", value="s"),
})
	WF_DurationUnit,
	//
	@FlyRefList(name="WF_Transition Type", items={
	@FlyRefItem(name="Regular", value="R"),
	@FlyRefItem(name="Loop Begin", value="B"),
	@FlyRefItem(name="Loop End", value="E"),
})
	WF_Transition_Type,
	//
	@FlyRefList(name="WF_Join_Split", items={
	@FlyRefItem(name="AND", value="A"),
	@FlyRefItem(name="XOR", value="X"),
})
	WF_Join_Split,
	//
	@FlyRefList(name="WF_Action", description="Superset of Menu Action", items={
	@FlyRefItem(name="文档动作", value="D"),
	@FlyRefItem(name="EMail", value="M"),
	@FlyRefItem(name="用户表单", value="X"),
	@FlyRefItem(name="应用任务", value="T"),
	@FlyRefItem(name="应用报表", value="R"),
	@FlyRefItem(name="应用进程", value="P"),
	@FlyRefItem(name="等待(睡眠)", value="Z"),
	@FlyRefItem(name="User Choice", value="C"),
	@FlyRefItem(name="User Workbench", value="B"),
	@FlyRefItem(name="子工作流", value="F"),
	@FlyRefItem(name="Set Variable", value="V"),
	@FlyRefItem(name="User Window", value="W"),
	@FlyRefItem(name="Smart View", value="Q"),
	@FlyRefItem(name="Smart Browse", value="S"),
})
	WF_Action,
	//
	@FlyRefList(name="WF_Start-Finish Mode", items={
	@FlyRefItem(name="自动", value="A"),
	@FlyRefItem(name="手动", value="M"),
})
	WF_Start_Finish_Mode,
	//
	@FlyRefList(name="WF_Participant 类型", items={
	@FlyRefItem(name="机构", value="O"),
	@FlyRefItem(name="人", value="H"),
	@FlyRefItem(name="角色", value="R"),
	@FlyRefItem(name="系统资源", value="S"),
})
	WF_Participant_Type,
	//
	@FlyRefList(name="WF_Instance 状态", items={
	@FlyRefItem(name="运行中", value="OR"),
	@FlyRefItem(name="挂起", value="OS"),
	@FlyRefItem(name="未启动", value="ON"),
	@FlyRefItem(name="完毕", value="CC"),
	@FlyRefItem(name="取消", value="CA"),
	@FlyRefItem(name="中止", value="CT"),
})
	WF_Instance_State,
	//
	@FlyRefList(name="WF_EventType", items={
	@FlyRefItem(name="进程被创建", value="PC"),
	@FlyRefItem(name="状态被改变", value="SC"),
	@FlyRefItem(name="处理完毕", value="PX"),
})
	WF_EventType,
	//
	@FlyRefList(name="WF_SubFlow 执行", items={
	@FlyRefItem(name="异步", value="A"),
	@FlyRefItem(name="同步", value="S"),
})
	WF_SubFlow_Execution,
	//
	@FlyRefList(name="All_Payment 规则", description="在 &出自付款选项", items={
	@FlyRefItem(name="信用卡", value="K"),
	@FlyRefItem(name="记帐", value="P"),
	@FlyRefItem(name="支票", value="S"),
	@FlyRefItem(name="转帐", value="T"),
	@FlyRefItem(name="现金", value="B"),
	@FlyRefItem(name="Direct Debit", value="D"),
	@FlyRefItem(name="Mixed", value="M"),
})
	_Payment_Rule,
	//
	@FlyRefList(name="M_Movement 类型", items={
	@FlyRefItem(name="制造 -", value="P-"),
	@FlyRefItem(name="客户归还", value="C+"),
	@FlyRefItem(name="客户物料出货", value="C-"),
	@FlyRefItem(name="库存在", value="I+"),
	@FlyRefItem(name="出库", value="I-"),
	@FlyRefItem(name="供应商收货", value="V+"),
	@FlyRefItem(name="供应商归还", value="V-"),
	@FlyRefItem(name="调拨从", value="M-"),
	@FlyRefItem(name="Work Order -", value="W-"),
	@FlyRefItem(name="调拨到", value="M+"),
	@FlyRefItem(name="制造 +", value="P+"),
	@FlyRefItem(name="Work Order +", value="W+"),
})
	M_Transaction_Movement_Type,
	//
	@FlyRefList(name="WF_LoopType", items={
	@FlyRefItem(name="While Loop", value="W"),
	@FlyRefItem(name="Repeat Until Loop", value="R"),
})
	WF_LoopType,
	//
	@FlyRefList(name="AD_Language Maintenance", items={
	@FlyRefItem(name="Re-Create Translation", value="R"),
	@FlyRefItem(name="Add Missing Translations", value="A"),
	@FlyRefItem(name="Delete Translation", value="D"),
})
	AD_Language_Maintenance,
	//
	@FlyRefList(name="AD_PrintTableFormat Stroke", description="Stroke Type", items={
	@FlyRefItem(name="实线", value="S"),
	@FlyRefItem(name="虚线", value="D"),
	@FlyRefItem(name="点线", value="d"),
	@FlyRefItem(name="点划线", value="2"),
})
	AD_PrintTableFormat_Stroke,
	//
	@FlyRefList(name="M_RelatedProduct 类型", items={
	@FlyRefItem(name="Web Promotion", value="P"),
	@FlyRefItem(name="Alternative", value="A"),
	@FlyRefItem(name="Supplemental", value="S"),
})
	M_RelatedProduct_Type,
	//
	@FlyRefList(name="C_RfQ QuoteType", items={
	@FlyRefItem(name="Quote Total only", value="T"),
	@FlyRefItem(name="Quote Selected Lines", value="S"),
	@FlyRefItem(name="Quote All Lines", value="A"),
})
	C_RfQ_QuoteType,
	//
	@FlyRefList(name="B_TopicType AuctionType", items={
	@FlyRefItem(name="Funding - All Bidders help funding a Topic", value="F"),
	@FlyRefItem(name="Auction - The highest Bidder wins the Topic", value="A"),
})
	B_TopicType_AuctionType,
	//
	@FlyRefList(name="AD_Scheduler Type", items={
	@FlyRefItem(name="Frequency", value="F"),
	@FlyRefItem(name="Week Day", value="W"),
	@FlyRefItem(name="Month Day", value="M"),
	@FlyRefItem(name="Cron Scheduling Pattern", value="C"),
})
	AD_Scheduler_Type,
	//
	@FlyRefList(name="M_AttributeSet MandatoryType", items={
	@FlyRefItem(name="Not Mandatary", value="N"),
	@FlyRefItem(name="Always Mandatory", value="Y"),
	@FlyRefItem(name="When Shipping", value="S"),
})
	M_AttributeSet_MandatoryType,
	//
	@FlyRefList(name="M_Attribute Value Type", items={
	@FlyRefItem(name="String (max 40)", value="S"),
	@FlyRefItem(name="Number", value="N"),
	@FlyRefItem(name="List", value="L"),
})
	M_Attribute_Value_Type,
	//
	@FlyRefList(name="PA_Report 行类型", items={
	@FlyRefItem(name="表值", value="S"),
	@FlyRefItem(name="计算", value="C"),
	@FlyRefItem(name="Tabbed Text", value="T"),
	@FlyRefItem(name="Customized Line", value="L"),
	@FlyRefItem(name="Blank line", value="B"),
})
	PA_Report_LineType,
	//
	@FlyRefList(name="A_Reval_Multiplier", description="Revaluation Multiplier Type", items={
	@FlyRefItem(name="Factor", value="FAC"),
	@FlyRefItem(name="Index", value="IND"),
})
	A_Reval_Multiplier,
	//
	@FlyRefList(name="All_Posted 状态", items={
	@FlyRefItem(name="未过帐", value="N"),
	@FlyRefItem(name="已过帐", value="Y"),
	@FlyRefItem(name="未平衡", value="b"),
	@FlyRefItem(name="不可兑换(无汇率)", value="c"),
	@FlyRefItem(name="无效帐户", value="i"),
	@FlyRefItem(name="关闭的分期", value="p"),
	@FlyRefItem(name="过账准备好", value="y"),
	@FlyRefItem(name="Posting Error", value="E"),
})
	_Posted_Status,
	//
	@FlyRefList(name="A_Reval_Effectivity", description="Sets the date as to when the revaluation will be based on", items={
	@FlyRefItem(name="Date Aquired", value="DA"),
	@FlyRefItem(name="Revaluation Date", value="RD"),
	@FlyRefItem(name="Date Depreciation Started", value="SD"),
})
	A_Reval_Effectivity,
	//
	@FlyRefList(name="A_Reval_Code", description="Lookup Valid Revaluation Codes", items={
	@FlyRefItem(name="Revaluation Code #3", value="R03"),
	@FlyRefItem(name="Revaluation Code #1", value="R01"),
	@FlyRefItem(name="Revaluation Code #2", value="R02"),
})
	A_Reval_Code,
	//
	@FlyRefList(name="A_Split_Type", description="Split Type", items={
	@FlyRefItem(name="Amount", value="AMT"),
	@FlyRefItem(name="Percentage", value="PER"),
	@FlyRefItem(name="Quantity", value="QTY"),
})
	A_Split_Type,
	//
	@FlyRefList(name="PA_ReportSource ElementType", description="Element Types for Accounting Elements - equal to C_AcctSchema ElementType plus Combination", help="Hardcoded Element Types", items={
	@FlyRefItem(name="Account", value="AC"),
	@FlyRefItem(name="Activity", value="AY"),
	@FlyRefItem(name="BPartner", value="BP"),
	@FlyRefItem(name="Location From", value="LF"),
	@FlyRefItem(name="Location To", value="LT"),
	@FlyRefItem(name="Campaign", value="MC"),
	@FlyRefItem(name="Organization", value="OO"),
	@FlyRefItem(name="Org Trx", value="OT"),
	@FlyRefItem(name="Project", value="PJ"),
	@FlyRefItem(name="Product", value="PR"),
	@FlyRefItem(name="Sub Account", value="SA"),
	@FlyRefItem(name="Sales Region", value="SR"),
	@FlyRefItem(name="User List 1", value="U1"),
	@FlyRefItem(name="User List 2", value="U2"),
	@FlyRefItem(name="User Element 1", value="X1"),
	@FlyRefItem(name="User Element 2", value="X2"),
	@FlyRefItem(name="Combination", value="CO"),
	@FlyRefItem(name="User List 3", value="U3"),
	@FlyRefItem(name="User List 4", value="U4"),
})
	PA_ReportSource_ElementType,
	//
	@FlyRefList(name="Scaling Factors", description="Factors for scaling the results of financial reports.", help="Currently supported: thousand, million.", items={
	@FlyRefItem(name="Thousand", value="k"),
	@FlyRefItem(name="Million", value="M"),
})
	Scaling_Factors,
	//
	@FlyRefList(name="_TransferType", description="Where money should be transfered to", items={
	@FlyRefItem(name="Bank Account", value="B"),
	@FlyRefItem(name="CashBook", value="C"),
})
	_TransferType,
	//
	@FlyRefList(name="SearchType", items={
	@FlyRefItem(name="Query", value="Q"),
	@FlyRefItem(name="Table", value="T"),
})
	SearchType,
	//
	@FlyRefList(name="AD_SearchDefinition_DataType", items={
	@FlyRefItem(name="Integer", value="I"),
	@FlyRefItem(name="String", value="S"),
})
	AD_SearchDefinition_DataType,
	//
	@FlyRefList(name="M_PromotionDistribution Operation", items={
	@FlyRefItem(name=">=", value=">="),
	@FlyRefItem(name="<=", value="<="),
})
	M_PromotionDistribution_Operation,
	//
	@FlyRefList(name="M_PromotionDistrition Type", description="Type of quantity distribution", items={
	@FlyRefItem(name="Min", value="I"),
	@FlyRefItem(name="Max", value="X"),
	@FlyRefItem(name="Minus", value="N"),
})
	M_PromotionDistrition_Type,
	//
	@FlyRefList(name="M_PromotionDistribution Sorting", description="Quantity distribution sorting direction", items={
	@FlyRefItem(name="Ascending", value="A"),
	@FlyRefItem(name="Descending", value="D"),
})
	M_PromotionDistribution_Sorting,
	//
	@FlyRefList(name="M_PromotionReward Type", items={
	@FlyRefItem(name="Percentage", value="P"),
	@FlyRefItem(name="Flat Discount", value="F"),
	@FlyRefItem(name="Absolute Amount", value="A"),
})
	M_PromotionReward_Type,
	//
	@FlyRefList(name="PA_Goal ChartType", description="Chart Type", items={
	@FlyRefItem(name="Bar Chart", value="BC"),
	@FlyRefItem(name="Pie Chart", value="PC"),
	@FlyRefItem(name="Ring Chart", value="RC"),
	@FlyRefItem(name="Line Chart", value="LC"),
	@FlyRefItem(name="Area Chart", value="AC"),
	@FlyRefItem(name="Waterfall Chart", value="WC"),
})
	PA_Goal_ChartType,
	//
	@FlyRefList(name="PA_DashboardContent GoalDisplay", description="Type of goal display on dashboard", items={
	@FlyRefItem(name="HTML Table", value="T"),
	@FlyRefItem(name="Chart", value="C"),
})
	PA_DashboardContent_GoalDisplay,
	//
	@FlyRefList(name="A_Depreciation_Manual_Period", description="List available periods for calculating manual depreciation expense", items={
	@FlyRefItem(name="Period", value="PR"),
	@FlyRefItem(name="Yearly", value="YR"),
})
	A_Depreciation_Manual_Period,
	//
	@FlyRefList(name="A_Reval_Method_Type", description="List of Revaluation Types", items={
	@FlyRefItem(name="Default", value="DFT"),
	@FlyRefItem(name="Inception to date", value="IDF"),
	@FlyRefItem(name="Year Balances", value="YBF"),
})
	A_Reval_Method_Type,
	//
	@FlyRefList(name="A_SourceType", description="Entry Source Types", help="Listing of entry source types", items={
	@FlyRefItem(name="Invoice", value="INV"),
	@FlyRefItem(name="Journal Entry", value="JRN"),
	@FlyRefItem(name="Manual", value="MAN"),
	@FlyRefItem(name="Imported", value="IMP"),
	@FlyRefItem(name="Project", value="PRJ"),
})
	A_SourceType,
	//
	@FlyRefList(name="A_CapvsExp", description="Capital vs Expense", help="Inidcates if charge is capital or expense", items={
	@FlyRefItem(name="Capital", value="Cap"),
	@FlyRefItem(name="Expense", value="Exp"),
})
	A_CapvsExp,
	//
	@FlyRefList(name="A_Disposed_Reason", description="Reason for Disposal", items={
	@FlyRefItem(name="Charity", value="C"),
	@FlyRefItem(name="Destroyed", value="D"),
	@FlyRefItem(name="Scraped", value="S"),
	@FlyRefItem(name="Sold", value="S1"),
	@FlyRefItem(name="Sold w/Trade", value="S2"),
	@FlyRefItem(name="Theft", value="T"),
})
	A_Disposed_Reason,
	//
	@FlyRefList(name="A_Disposal_Method", description="Method of Disposals", items={
	@FlyRefItem(name="Trade", value="T1"),
	@FlyRefItem(name="Trade w/cash", value="T2"),
	@FlyRefItem(name="Simple", value="S"),
	@FlyRefItem(name="Cash", value="C"),
	@FlyRefItem(name="Cash_", value="C_"),
	@FlyRefItem(name="Simple_", value="S_"),
	@FlyRefItem(name="Preservation", value="PR"),
	@FlyRefItem(name="Partial Retirement", value="PD"),
})
	A_Disposal_Method,
	//
	@FlyRefList(name="A_Update_Type", description="Update Type", items={
	@FlyRefItem(name="Addition", value="ADD"),
	@FlyRefItem(name="Balance", value="BAL"),
	@FlyRefItem(name="Create", value="CRT"),
	@FlyRefItem(name="Depreciation", value="DEP"),
	@FlyRefItem(name="Disposal", value="DIS"),
	@FlyRefItem(name="Expense", value="EXP"),
	@FlyRefItem(name="Forecast", value="FOR"),
	@FlyRefItem(name="Import", value="IMP"),
	@FlyRefItem(name="Revaluation", value="RVL"),
	@FlyRefItem(name="Setup", value="SET"),
	@FlyRefItem(name="Split", value="SPL"),
	@FlyRefItem(name="Transfer", value="TRN"),
	@FlyRefItem(name="Update", value="UPD"),
	@FlyRefItem(name="Usage", value="USE"),
})
	A_Update_Type,
	//
	@FlyRefList(name="A_Payment_Due", description="Payment due every", items={
	@FlyRefItem(name="15th of every month", value="15T"),
	@FlyRefItem(name="1st of every month", value="1st"),
	@FlyRefItem(name="Beginning of every month", value="BEG"),
	@FlyRefItem(name="Yearly on or before contract date", value="YER"),
})
	A_Payment_Due,
	//
	@FlyRefList(name="A_Finance_Method", description="Financing Methods", help="List of financing methods for assets", items={
	@FlyRefItem(name="Capitalized Lease", value="CL"),
	@FlyRefItem(name="Non-Capitalized Lease", value="NL"),
	@FlyRefItem(name="Owned", value="OW"),
	@FlyRefItem(name="Rented", value="RE"),
})
	A_Finance_Method,
	//
	@FlyRefList(name="A_Entry_Type", description="Entry Types for Fixed Assets", items={
	@FlyRefItem(name="Depreciation", value="DEP"),
	@FlyRefItem(name="Disposals", value="DIS"),
	@FlyRefItem(name="Forecasts", value="FOR"),
	@FlyRefItem(name="New", value="NEW"),
	@FlyRefItem(name="Splits", value="SPL"),
	@FlyRefItem(name="Transfers", value="TRN"),
})
	A_Entry_Type,
	//
	@FlyRefList(name="UOM Type", items={
	@FlyRefItem(name="Angle", value="AN"),
	@FlyRefItem(name="Area", value="AR"),
	@FlyRefItem(name="Data Storage", value="DS"),
	@FlyRefItem(name="Density", value="DE"),
	@FlyRefItem(name="Energy", value="EN"),
	@FlyRefItem(name="Force", value="FO"),
	@FlyRefItem(name="Kitchen Measures", value="KI"),
	@FlyRefItem(name="Length", value="LE"),
	@FlyRefItem(name="Power", value="PO"),
	@FlyRefItem(name="Pressure", value="PR"),
	@FlyRefItem(name="Temperature", value="TE"),
	@FlyRefItem(name="Time", value="TM"),
	@FlyRefItem(name="Torque", value="TO"),
	@FlyRefItem(name="Velocity", value="VE"),
	@FlyRefItem(name="Volume Liquid", value="VL"),
	@FlyRefItem(name="Volume Dry", value="VD"),
	@FlyRefItem(name="Weigth", value="WE"),
	@FlyRefItem(name="Currency", value="CU"),
	@FlyRefItem(name="Data Speed", value="DV"),
	@FlyRefItem(name="Frequency", value="FR"),
	@FlyRefItem(name="Other", value="OT"),
})
	UOM_Type,
	//
	@FlyRefList(name="PA_Report Period Type", items={
	@FlyRefItem(name="Year", value="Y"),
	@FlyRefItem(name="Total", value="T"),
	@FlyRefItem(name="Period", value="P"),
	@FlyRefItem(name="Natural", value="N"),
})
	PA_Report_Period_Type,
	//
	@FlyRefList(name="PA_Report Amount Type", items={
	@FlyRefItem(name="Balance (expected sign)", value="B"),
	@FlyRefItem(name="Credit Only", value="C"),
	@FlyRefItem(name="Debit Only", value="D"),
	@FlyRefItem(name="Quantity (expected sign)", value="Q"),
	@FlyRefItem(name="Balance (accounted sign)", value="S"),
	@FlyRefItem(name="Quantity (accounted sign)", value="R"),
})
	PA_Report_Amount_Type,
	//
	@FlyRefList(name="AD_RelationType Role", description="Defines the possible 'roles' a the records of a relation can have", items={
	@FlyRefItem(name="Order", value="Order"),
	@FlyRefItem(name="Invoice", value="Invoice"),
})
	AD_RelationType_Role,
	//
	@FlyRefList(name="AD_RelationType Type", description="'Type' of a relation type", help="For now we only have implicit realtion types, i.e. the record pairs are defined by the rule itself. In future we would like to have explicit type also. An explizit type just defines a template, the actual pairs can be added by a user or by the system itself.", items={
	@FlyRefItem(name="Implicit", value="I"),
	@FlyRefItem(name="Explicit", value="E"),
})
	AD_RelationType_Type,
	//
	@FlyRefList(name="A_Asset Actions", items={
	@FlyRefItem(name="Dispose", value="DI"),
	@FlyRefItem(name="Inbound", value="IB"),
	@FlyRefItem(name="Modify", value="MD"),
	@FlyRefItem(name="Outbound", value="OB"),
	@FlyRefItem(name="Reevaluate", value="RE"),
	@FlyRefItem(name="Retire", value="RT"),
	@FlyRefItem(name="Transfer", value="TR"),
})
	A_Asset_Actions,
	//
	@FlyRefList(name="POSKeyLayoutType", description="POS Key layout types", items={
	@FlyRefItem(name="Keyboard", value="K"),
	@FlyRefItem(name="Numberpad", value="N"),
	@FlyRefItem(name="Product", value="P"),
})
	POSKeyLayoutType,
	//
	@FlyRefList(name="M_Replenishment Production Create ", items={
	@FlyRefItem(name="Distribution Order", value="DOO"),
	@FlyRefItem(name="Inventory Movement", value="MMM"),
	@FlyRefItem(name="Purchase Order", value="POO"),
	@FlyRefItem(name="Requistion", value="POR"),
	@FlyRefItem(name="Production", value="MOP"),
})
	M_Replenishment_Production_Create_,
	//
	@FlyRefList(name="PriceOverrideType", description="Price Override Type", help="Fixed price or discount off list", items={
	@FlyRefItem(name="Fixed Price", value="P"),
	@FlyRefItem(name="Discount", value="D"),
})
	PriceOverrideType,
	//
	@FlyRefList(name="ChartOrientation", description="Chart Orientation", help="Horizontal or vertical", items={
	@FlyRefItem(name="Horizontal", value="H"),
	@FlyRefItem(name="Vertical", value="V"),
})
	ChartOrientation,
	//
	@FlyRefList(name="TimeUnit", description="Time units for charting.", items={
	@FlyRefItem(name="Day", value="D"),
	@FlyRefItem(name="Week", value="W"),
	@FlyRefItem(name="Month", value="M"),
	@FlyRefItem(name="Quarter", value="Q"),
	@FlyRefItem(name="Year", value="Y"),
})
	TimeUnit,
	//
	@FlyRefList(name="ChartType", description="Chart Type", items={
	@FlyRefItem(name="Area Chart", value="AC"),
	@FlyRefItem(name="Stacked Area Chart", value="AS"),
	@FlyRefItem(name="Bar Chart", value="BC"),
	@FlyRefItem(name="3D Bar Chart", value="B3"),
	@FlyRefItem(name="Stacked Bar Chart", value="BS"),
	@FlyRefItem(name="3D Stacked Bar Chart", value="B4"),
	@FlyRefItem(name="Line Chart", value="LC"),
	@FlyRefItem(name="3D Line Chart", value="L3"),
	@FlyRefItem(name="Waterfall Chart", value="WC"),
	@FlyRefItem(name="Pie Chart", value="PC"),
	@FlyRefItem(name="3D Pie Chart", value="P3"),
	@FlyRefItem(name="Ring Chart", value="RC"),
})
	ChartType,
	//
	@FlyRefList(name="AD_Migration Status", items={
	@FlyRefItem(name="Applied", value="A"),
	@FlyRefItem(name="Unapplied", value="U"),
	@FlyRefItem(name="Failed", value="F"),
	@FlyRefItem(name="Partially applied", value="P"),
})
	AD_Migration_Status,
	//
	@FlyRefList(name="AD_Migration Apply/Rollback", description="Apply or Rollback migration", items={
	@FlyRefItem(name="Apply", value="A"),
	@FlyRefItem(name="Rollback", value="R"),
})
	AD_Migration_Apply_Rollback,
	//
	@FlyRefList(name="Migration step type", description="Type of migration step", help="Either Application Dictionary change or SQL statement.", items={
	@FlyRefItem(name="Application Dictionary", value="AD"),
	@FlyRefItem(name="SQL Statement", value="SQL"),
})
	Migration_step_type,
	//
	@FlyRefList(name="_ReportStyle", description="The styles for a report are defined", items={
	@FlyRefItem(name="Total Line", value="X"),
	@FlyRefItem(name="Double Line for Total", value="Z"),
	@FlyRefItem(name="Underlined Descriptions", value="D"),
	@FlyRefItem(name="Centered Title", value="T"),
	@FlyRefItem(name="Line", value="L"),
	@FlyRefItem(name="Blank Line", value="S"),
})
	_ReportStyle,
	//
	@FlyRefList(name="Reconciliation Type", items={
	@FlyRefItem(name="Bank In Transit", value="BT"),
	@FlyRefItem(name="Payment Clearing (Unalloc Cash/Payment Selection)", value="PC"),
	@FlyRefItem(name="AR/AP Trade (Receivables/Vendor Liabilities)", value="TR"),
})
	Reconciliation_Type,
	//
	@FlyRefList(name="Event List", items={
	@FlyRefItem(name="onClick", value="onClick"),
	@FlyRefItem(name="onDoubleClick", value="onDoubleClick"),
})
	Event_List,
	//
	@FlyRefList(name="_Document Action Import budget", description="Document action list", items={
	@FlyRefItem(name="Draft", value="DR"),
	@FlyRefItem(name="Complete", value="CO"),
})
	_Document_Action_Import_budget,
	//
	@FlyRefList(name="A_Asset Status", description="Asset Status", items={
	@FlyRefItem(name="Activated", value="AC"),
	@FlyRefItem(name="Disposed", value="DI"),
	@FlyRefItem(name="Depreciated", value="DP"),
	@FlyRefItem(name="New", value="NW"),
	@FlyRefItem(name="Preservation", value="PR"),
	@FlyRefItem(name="Retired", value="RE"),
	@FlyRefItem(name="Sold", value="SO"),
})
	A_Asset_Status,
	//
	@FlyRefList(name="A_Tip_Finantare", description="Tip finantare investitii", items={
	@FlyRefItem(name="Cofinantare", value="C"),
	@FlyRefItem(name="Proprie", value="P"),
	@FlyRefItem(name="Terti", value="T"),
})
	A_Tip_Finantare,
	//
	@FlyRefList(name="A_Activation_Method", description="Activation Methods", items={
	@FlyRefItem(name="Activation", value="AA"),
})
	A_Activation_Method,
	//
	@FlyRefList(name="Yes-No-Unknown", items={
	@FlyRefItem(name="No", value="NX"),
	@FlyRefItem(name="- / Default No", value="XN"),
	@FlyRefItem(name="-", value="XX"),
	@FlyRefItem(name="- / Default Yes", value="XY"),
	@FlyRefItem(name="Yes", value="YX"),
})
	Yes_No_Unknown,
	//
	@FlyRefList(name="WS Parameter Type", items={
	@FlyRefItem(name="Constant", value="C"),
	@FlyRefItem(name="Free", value="F"),
})
	WS_Parameter_Type,
	//
	@FlyRefList(name="Lead Source", description="Lead Source", help="The source of a lead", items={
	@FlyRefItem(name="Cold Call", value="CC"),
	@FlyRefItem(name="Existing Customer", value="EC"),
	@FlyRefItem(name="Employee", value="EM"),
	@FlyRefItem(name="Partner", value="PT"),
	@FlyRefItem(name="Conference", value="CN"),
	@FlyRefItem(name="Trade Show", value="TS"),
	@FlyRefItem(name="Web Site", value="WS"),
	@FlyRefItem(name="Word of Mouth", value="WM"),
	@FlyRefItem(name="Email", value="EL"),
})
	Lead_Source,
	//
	@FlyRefList(name="Lead Status", items={
	@FlyRefItem(name="New", value="N"),
	@FlyRefItem(name="Working", value="W"),
	@FlyRefItem(name="Expired", value="E"),
	@FlyRefItem(name="Recycled", value="R"),
	@FlyRefItem(name="Converted", value="C"),
})
	Lead_Status,
	//
	@FlyRefList(name="C_ContactActivity Type", description="Contact Activity Types", items={
	@FlyRefItem(name="Email", value="EM"),
	@FlyRefItem(name="Phone call", value="PC"),
	@FlyRefItem(name="Meeting", value="ME"),
	@FlyRefItem(name="Task", value="TA"),
})
	C_ContactActivity_Type,
	//
	@FlyRefList(name="C_DocType DocBaseType", description="以文件类型作基础", items={
	@FlyRefItem(name="应收款信用备忘录", value="ARC"),
	@FlyRefItem(name="应付帐款", value="APP"),
	@FlyRefItem(name="应收款格式发票", value="ARF"),
	@FlyRefItem(name="应收款发票", value="ARI"),
	@FlyRefItem(name="应收帐款", value="ARR"),
	@FlyRefItem(name="总帐文件", value="GLD"),
	@FlyRefItem(name="物料运动", value="MMM"),
	@FlyRefItem(name="物料收货", value="MMR"),
	@FlyRefItem(name="物料配送", value="MMS"),
	@FlyRefItem(name="采购定单", value="POO"),
	@FlyRefItem(name="采购请求", value="POR"),
	@FlyRefItem(name="销售定单", value="SOO"),
	@FlyRefItem(name="现金簿", value="CMC"),
	@FlyRefItem(name="Payroll", value="HRP"),
	@FlyRefItem(name="Maintenance Order", value="MOF"),
	@FlyRefItem(name="Manufacturing Order", value="MOP"),
	@FlyRefItem(name="Quality Order", value="MQO"),
	@FlyRefItem(name="Fixed Assets Disposal", value="FAD"),
	@FlyRefItem(name="Fixed Assets Depreciation", value="FDP"),
	@FlyRefItem(name="应付款信用备忘录", value="APC"),
	@FlyRefItem(name="应付款发票", value="API"),
	@FlyRefItem(name="付款分配", value="CMA"),
	@FlyRefItem(name="银行对帐单", value="CMB"),
	@FlyRefItem(name="Distribution Order", value="DOO"),
	@FlyRefItem(name="Fixed Assets Addition", value="FAA"),
	@FlyRefItem(name="总帐分类帐", value="GLJ"),
	@FlyRefItem(name="Manufacturing Cost Collector", value="MCC"),
	@FlyRefItem(name="物料实际的库存", value="MMI"),
	@FlyRefItem(name="物料制造", value="MMP"),
	@FlyRefItem(name="匹配发票", value="MXI"),
	@FlyRefItem(name="匹配采购定单", value="MXP"),
	@FlyRefItem(name="Project Issue", value="PJI"),
	@FlyRefItem(name="Warehouse Management Order", value="WMO"),
	@FlyRefItem(name="AP Payment Selection", value="APS"),
	@FlyRefItem(name="Manufacturing Planned Order", value="MPO"),
	@FlyRefItem(name="Sales Commission", value="SOC"),
})
	C_DocType_DocBaseType,
	//
	@FlyRefList(name="_YesNo", items={
	@FlyRefItem(name="是", value="Y"),
	@FlyRefItem(name="否", value="N"),
})
	_YesNo,
	//
	@FlyRefList(name="C_Order DeliveryRule", description="配送规则列表", items={
	@FlyRefItem(name="在收款之后", value="R"),
	@FlyRefItem(name="平均ailability", value="A"),
	@FlyRefItem(name="定单明细完成", value="L"),
	@FlyRefItem(name="定单完成", value="O"),
	@FlyRefItem(name="Force", value="F"),
	@FlyRefItem(name="Manual", value="M"),
})
	C_Order_DeliveryRule,
	//
	@FlyRefList(name="EncryptionType List", items={
	@FlyRefItem(name="None", value="N"),
	@FlyRefItem(name="SSL", value="S"),
	@FlyRefItem(name="TLS", value="T"),
})
	EncryptionType_List,
	//
	@FlyRefList(name="AuthMechanisms List", items={
	@FlyRefItem(name="Login", value="L"),
	@FlyRefItem(name="Plain", value="P"),
	@FlyRefItem(name="Digest-MD5", value="D"),
	@FlyRefItem(name="NTLM", value="N"),
	@FlyRefItem(name="oAuth", value="O"),
})
	AuthMechanisms_List,
	//
	@FlyRefList(name="Protocol List", items={
	@FlyRefItem(name="SMTP", value="S"),
	@FlyRefItem(name="POP3", value="P"),
	@FlyRefItem(name="IMAP", value="I"),
})
	Protocol_List,
	//
	@FlyRefList(name="CreateFromType List", items={
	@FlyRefItem(name="RMA", value="A"),
	@FlyRefItem(name="Invoice", value="I"),
	@FlyRefItem(name="Order", value="O"),
	@FlyRefItem(name="Delivery / Receipt", value="R"),
})
	CreateFromType_List,
	//
	@FlyRefList(name="PA_ReportLine Line Stroke Type", items={
	@FlyRefItem(name="Solid", value="s"),
	@FlyRefItem(name="Double Solid", value="d_s"),
	@FlyRefItem(name="Dotted", value="d"),
	@FlyRefItem(name="Double Dotted", value="d_d"),
	@FlyRefItem(name="Dashed", value="D"),
	@FlyRefItem(name="Double Dashed", value="d_D"),
})
	PA_ReportLine_Line_Stroke_Type,
	//
	@FlyRefList(name="ReportType", items={
	@FlyRefItem(name="PDF", value="P"),
	@FlyRefItem(name="XLS", value="X"),
	@FlyRefItem(name="HTML", value="H"),
	@FlyRefItem(name="XLSX", value="XX"),
})
	ReportType,
	//
	@FlyRefList(name="Print Document", items={
	@FlyRefItem(name="Order", value="0"),
	@FlyRefItem(name="Shipment", value="1"),
	@FlyRefItem(name="Invoice", value="2"),
})
	Print_Document,
}