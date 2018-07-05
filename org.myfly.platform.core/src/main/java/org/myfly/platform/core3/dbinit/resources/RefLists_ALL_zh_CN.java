package org.myfly.platform.core3.dbinit.resources;

import org.myfly.platform.core3.metadata.annotation.FlyRefItem;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;

public enum RefLists_ALL_zh_CN {
	//
	@FlyRefList(name = "A_Table_Rate_Type", description = "List that contains type of rate", items = {
			@FlyRefItem(name = "Amount", value = "Amount"), @FlyRefItem(name = "Rate", value = "Rate"), })
	A_Table_Rate_Type,
	//
	@FlyRefList(name = "AD_Validation 规则类型", description = "验证规则类型列表", help = "e.g. S - SQL", items = {
			@FlyRefItem(name = "SQL", value = "SQL"), @FlyRefItem(name = "Java", value = "Java"),
			@FlyRefItem(name = "Java Script", value = "Java Script"), })
	AD_Validation_Rule_Types,
	//
	@FlyRefList(name = "AD_Message 类型", description = "信息类型列表", items = { @FlyRefItem(name = "错误", value = "错误"),
			@FlyRefItem(name = "信息", value = "信息"), @FlyRefItem(name = "菜单", value = "菜单"), })
	AD_Message_Type,
	//
	@FlyRefList(name = "AD_Print 标签线类型", items = { @FlyRefItem(name = "字段", value = "字段"),
			@FlyRefItem(name = "文本", value = "文本"), })
	AD_Print_Label_Line_Type,
	//
	@FlyRefList(name = "C_Recurring 频率", items = { @FlyRefItem(name = "每日的", value = "每日的"),
			@FlyRefItem(name = "每周的", value = "每周的"), @FlyRefItem(name = "每月的", value = "每月的"),
			@FlyRefItem(name = "每季的", value = "每季的"), })
	C_Recurring_Frequency,
	//
	@FlyRefList(name = "C_Recurring 类型", items = { @FlyRefItem(name = "发票", value = "发票"),
			@FlyRefItem(name = "定单", value = "定单"), @FlyRefItem(name = "总帐分类帐", value = "总帐分类帐"),
			@FlyRefItem(name = "项目", value = "项目"), })
	C_Recurring_Type,
	//
	@FlyRefList(name = "AD_Menu 动作", description = "菜单动作列表", items = { @FlyRefItem(name = "表单", value = "表单"),
			@FlyRefItem(name = "程序", value = "程序"), @FlyRefItem(name = "报表", value = "报表"),
			@FlyRefItem(name = "工作台", value = "工作台"), @FlyRefItem(name = "窗口 ", value = "窗口 "),
			@FlyRefItem(name = "任务", value = "任务"), @FlyRefItem(name = "工作流", value = "工作流"),
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
	@FlyRefList(name = "AD_Window 类型", description = "视窗类型列表", help = "e.g. M = Multi Single (one uppercase character)", items = {
			@FlyRefItem(name = "单一记录", value = "单一记录"), @FlyRefItem(name = "维护", value = "维护"),
			@FlyRefItem(name = "交易", value = "交易"), @FlyRefItem(name = "只有查询", value = "只有查询"), })
	AD_Window_Types,
	//
	@FlyRefList(name = "C_Conversion_Rate 类型", description = "汇率类型类型", items = { @FlyRefItem(name = "公司", value = "公司"),
			@FlyRefItem(name = "用户类型", value = "用户类型"), @FlyRefItem(name = "手工比率", value = "手工比率"),
			@FlyRefItem(name = "没有", value = "没有"), @FlyRefItem(name = "现场", value = "现场"),
			@FlyRefItem(name = "周期类型", value = "周期类型"), @FlyRefItem(name = "固定", value = "固定"),
			@FlyRefItem(name = "平均", value = "平均"), })
	C_Conversion_Rate_Types,
	//
	@FlyRefList(name = "M_InOutConfirm 类型", items = { @FlyRefItem(name = "供应商确认", value = "供应商确认"),
			@FlyRefItem(name = "客户确认", value = "客户确认"),
			@FlyRefItem(name = "Drop Ship Confirm", value = "Drop Ship Confirm"),
			@FlyRefItem(name = "Ship/Receipt Confirm", value = "Ship/Receipt Confirm"),
			@FlyRefItem(name = "Pick/QA Confirm", value = "Pick/QA Confirm"), })
	M_InOutConfirm_Type,
	//
	@FlyRefList(name = "C_Period 类型", description = "分期类型列表", items = { @FlyRefItem(name = "标准日历分期", value = "标准日历分期"),
			@FlyRefItem(name = "调整分期", value = "调整分期"), })
	C_Period_Type,
	//
	@FlyRefList(name = "C_Element 类型", description = "会计科目类型", items = { @FlyRefItem(name = "帐户", value = "帐户"),
			@FlyRefItem(name = "用户定义", value = "用户定义"), })
	C_Element_Type,
	//
	@FlyRefList(name = "C_ElementValue AccountType", description = "帐户类型目录", items = {
			@FlyRefItem(name = "资产", value = "资产"), @FlyRefItem(name = "负债", value = "负债"),
			@FlyRefItem(name = "收入", value = "收入"), @FlyRefItem(name = "费用", value = "费用"),
			@FlyRefItem(name = "权益", value = "权益"), @FlyRefItem(name = "备忘录", value = "备忘录"), })
	C_ElementValue_AccountType,
	//
	@FlyRefList(name = "C_ElementValue 帐户符号", description = "帐户符号列表", items = { @FlyRefItem(name = "普通", value = "普通"),
			@FlyRefItem(name = "借方", value = "借方"), @FlyRefItem(name = "贷方", value = "贷方"), })
	C_ElementValue_Account_Sign,
	//
	@FlyRefList(name = "AD_TreeType 类型", description = "树类型列表", help = "Determines which element to use as the base for the information", items = {
			@FlyRefItem(name = "User 1", value = "User 1"), @FlyRefItem(name = "User 2", value = "User 2"),
			@FlyRefItem(name = "User 3", value = "User 3"), @FlyRefItem(name = "User 4", value = "User 4"),
			@FlyRefItem(name = "CM Container", value = "CM Container"),
			@FlyRefItem(name = "CM Container Stage", value = "CM Container Stage"),
			@FlyRefItem(name = "CM Template", value = "CM Template"),
			@FlyRefItem(name = "CM Media", value = "CM Media"), @FlyRefItem(name = "菜单", value = "菜单"),
			@FlyRefItem(name = "Element Value (Account, etc.)", value = "Element Value (Account, etc.)"),
			@FlyRefItem(name = "产品", value = "产品"), @FlyRefItem(name = "主业务伙伴", value = "主业务伙伴"),
			@FlyRefItem(name = "组织", value = "组织"), @FlyRefItem(name = "物料清单", value = "物料清单"),
			@FlyRefItem(name = "项目", value = "项目"), @FlyRefItem(name = "销售区域", value = "销售区域"),
			@FlyRefItem(name = "产品种类", value = "产品种类"), @FlyRefItem(name = "活动", value = "活动"),
			@FlyRefItem(name = "活动", value = "活动"), })
	AD_TreeType_Type,
	//
	@FlyRefList(name = "X12DE98 Entity Identifier Code", description = "X12DE98 Entity Identifier Code list", help = "Identify organizational entity physical location property or individual list", items = {
			@FlyRefItem(name = "地方的办公室", value = "地方的办公室"), @FlyRefItem(name = "办公费应付帐户", value = "办公费应付帐户"),
			@FlyRefItem(name = "植物", value = "植物"), @FlyRefItem(name = "小的业务", value = "小的业务"),
			@FlyRefItem(name = "少数-拥有小的业务", value = "少数-拥有小的业务"), @FlyRefItem(name = "少数-拥有了业务", value = "少数-拥有了业务"),
			@FlyRefItem(name = "女人拥有的小业务", value = "女人拥有的小业务"), @FlyRefItem(name = "女人拥有的业务", value = "女人拥有的业务"),
			@FlyRefItem(name = "转包商", value = "转包商"), @FlyRefItem(name = "个人", value = "个人"),
			@FlyRefItem(name = "合伙", value = "合伙"), @FlyRefItem(name = "公司", value = "公司"),
			@FlyRefItem(name = "下载位置", value = "下载位置"), })
	X12DE98_Entity_Identifier_Code,
	//
	@FlyRefList(name = "C_AcctSchema 成本计算方法", description = "成本计算方法目录", items = {
			@FlyRefItem(name = "最近采购定单价格", value = "最近采购定单价格"), @FlyRefItem(name = "_", value = "_"),
			@FlyRefItem(name = "标准成本计算", value = "标准成本计算"), @FlyRefItem(name = "平均", value = "平均"),
			@FlyRefItem(name = "后进先出", value = "后进先出"), @FlyRefItem(name = "先进先出", value = "先进先出"),
			@FlyRefItem(name = "Average Invoice", value = "Average Invoice"),
			@FlyRefItem(name = "Last Invoice", value = "Last Invoice"),
			@FlyRefItem(name = "User Defined", value = "User Defined"), })
	C_AcctSchema_Costing_Method,
	//
	@FlyRefList(name = "C_AcctSchema GAAP", description = "General Accepted Accounting Principle list", items = {
			@FlyRefItem(name = "国际的 GAAP", value = "国际的 GAAP"), @FlyRefItem(name = "美国 GAAP", value = "美国 GAAP"),
			@FlyRefItem(name = "德国的 HGB", value = "德国的 HGB"), @FlyRefItem(name = "法国会计规则", value = "法国会计规则"),
			@FlyRefItem(name = "定制会计规则", value = "定制会计规则"), })
	C_AcctSchema_GAAP,
	//
	@FlyRefList(name = "AD_Table 复制类型", description = "复制类型", items = { @FlyRefItem(name = "本地复制", value = "本地复制"),
			@FlyRefItem(name = "合并复制", value = "合并复制"), @FlyRefItem(name = "引用复制", value = "引用复制"),
			@FlyRefItem(name = "Broadcast", value = "Broadcast"), })
	AD_Table_Replication_Type,
	//
	@FlyRefList(name = "M_Product BOM 类型", items = {
			@FlyRefItem(name = "In alternative Group 5", value = "In alternative Group 5"),
			@FlyRefItem(name = "In alternative Group 6", value = "In alternative Group 6"),
			@FlyRefItem(name = "In alternative Group 7", value = "In alternative Group 7"),
			@FlyRefItem(name = "In alternative Group 8", value = "In alternative Group 8"),
			@FlyRefItem(name = "In alternative Group 9", value = "In alternative Group 9"),
			@FlyRefItem(name = "标准部件", value = "标准部件"), @FlyRefItem(name = "可选部件", value = "可选部件"),
			@FlyRefItem(name = "替代方案组 1", value = "替代方案组 1"), @FlyRefItem(name = "替代方案组 2", value = "替代方案组 2"),
			@FlyRefItem(name = "改变naltve 组 3", value = "改变naltve 组 3"),
			@FlyRefItem(name = "替代方案组 4", value = "替代方案组 4"), })
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
	@FlyRefList(name = "All_Posting 类型", description = "Posting Type (Actual Budget etc.) list", items = {
			@FlyRefItem(name = "实际", value = "实际"), @FlyRefItem(name = "预算", value = "预算"),
			@FlyRefItem(name = "债权", value = "债权"), @FlyRefItem(name = "统计的", value = "统计的"),
			@FlyRefItem(name = "Reservation", value = "Reservation"), })
	_Posting_Type,
	//
	@FlyRefList(name = "All_Entity 类型", description = "Entity Type (Dictionary, ..)", items = {
			@FlyRefItem(name = "字典", value = "字典"), @FlyRefItem(name = "Adempiere", value = "Adempiere"),
			@FlyRefItem(name = "用户维护", value = "用户维护"), @FlyRefItem(name = "应用", value = "应用"),
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
	@FlyRefList(name = "All_Document 状态", description = "文档状态目录", items = { @FlyRefItem(name = "已批准", value = "已批准"),
			@FlyRefItem(name = "关闭", value = "关闭"), @FlyRefItem(name = "完成", value = "完成"),
			@FlyRefItem(name = "未活动的", value = "未活动的"), @FlyRefItem(name = "取消", value = "取消"),
			@FlyRefItem(name = "空虚", value = "空虚"), @FlyRefItem(name = "未知的", value = "未知的"),
			@FlyRefItem(name = "过程中", value = "过程中"), @FlyRefItem(name = "未核准", value = "未核准"),
			@FlyRefItem(name = "等候付款", value = "等候付款"), @FlyRefItem(name = "起草", value = "起草"),
			@FlyRefItem(name = "等待确认", value = "等待确认"), })
	_Document_Status,
	//
	@FlyRefList(name = "All_Document 动作", description = "文档动作目录", items = { @FlyRefItem(name = "完成", value = "完成"),
			@FlyRefItem(name = "批准", value = "批准"), @FlyRefItem(name = "被拒", value = "被拒"),
			@FlyRefItem(name = "职位", value = "职位"), @FlyRefItem(name = "空白", value = "空白"),
			@FlyRefItem(name = "结束", value = "结束"),
			@FlyRefItem(name = "Reverse - Correction", value = "Reverse - Correction"),
			@FlyRefItem(name = "Reverse - Accrual", value = "Reverse - Accrual"),
			@FlyRefItem(name = "转帐", value = "转帐"), @FlyRefItem(name = "重新激活", value = "重新激活"),
			@FlyRefItem(name = "<没有>", value = "<没有>"), @FlyRefItem(name = "Wait Complete", value = "Wait Complete"),
			@FlyRefItem(name = "程序", value = "程序"), @FlyRefItem(name = "解锁", value = "解锁"), })
	_Document_Action,
	//
	@FlyRefList(name = "M_Discount 累计级别", items = { @FlyRefItem(name = "明细", value = "明细"), })
	M_Discount_CumulativeLevel,
	//
	@FlyRefList(name = "M_Discount 类型", items = { @FlyRefItem(name = "直线的百分比", value = "直线的百分比"),
			@FlyRefItem(name = "公式", value = "公式"), @FlyRefItem(name = "休息", value = "休息"),
			@FlyRefItem(name = "价目表", value = "价目表"), })
	M_Discount_Type,
	//
	@FlyRefList(name = "AD_Color StartPoint", items = { @FlyRefItem(name = "北方", value = "北方"),
			@FlyRefItem(name = "东北方", value = "东北方"), @FlyRefItem(name = "东方", value = "东方"),
			@FlyRefItem(name = "东南方", value = "东南方"), @FlyRefItem(name = "南方", value = "南方"),
			@FlyRefItem(name = "西南方", value = "西南方"), @FlyRefItem(name = "西方", value = "西方"),
			@FlyRefItem(name = "西北方", value = "西北方"), })
	AD_Color_StartPoint,
	//
	@FlyRefList(name = "M_Product_Costing 来源", items = { @FlyRefItem(name = "FiFo", value = "FiFo"),
			@FlyRefItem(name = "LiFo", value = "LiFo"),
			@FlyRefItem(name = "Average Invoice", value = "Average Invoice"),
			@FlyRefItem(name = "Old Standard Cost", value = "Old Standard Cost"),
			@FlyRefItem(name = "Future Standard Cost", value = "Future Standard Cost"),
			@FlyRefItem(name = "标准成本", value = "标准成本"), @FlyRefItem(name = "平均成本", value = "平均成本"),
			@FlyRefItem(name = "最近采购定单价格", value = "最近采购定单价格"), @FlyRefItem(name = "最近发票价格", value = "最近发票价格"),
			@FlyRefItem(name = "价目表", value = "价目表"), @FlyRefItem(name = "采购定单差异调整", value = "采购定单差异调整"),
			@FlyRefItem(name = "Adjust using Invoice Difference", value = "Adjust using Invoice Difference"), })
	CostUpdate_Source,
	//
	@FlyRefList(name = "C_Tax SPPOType", items = { @FlyRefItem(name = "Both", value = "Both"),
			@FlyRefItem(name = "销项税", value = "销项税"), @FlyRefItem(name = "进项税", value = "进项税"), })
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
	@FlyRefList(name = "M_TransactionAllocation 类型", items = { @FlyRefItem(name = "LiFo", value = "LiFo"),
			@FlyRefItem(name = "FiFo", value = "FiFo"), })
	M_TransactionAllocation_Type,
	//
	@FlyRefList(name = "M_Inventory 类型", description = "Inventory Type (Difference - Charge)", items = {
			@FlyRefItem(name = "Inventory Difference", value = "Inventory Difference"),
			@FlyRefItem(name = "Charge Account", value = "Charge Account"), })
	M_Inventory_Type,
	//
	@FlyRefList(name = "C_ProjectType 分类", items = { @FlyRefItem(name = "General", value = "General"),
			@FlyRefItem(name = "资产项目", value = "资产项目"),
			@FlyRefItem(name = "Work Order (Job)", value = "Work Order (Job)"),
			@FlyRefItem(name = "服务(费用) 项目", value = "服务(费用) 项目"), })
	C_ProjectType_Category,
	//
	@FlyRefList(name = "AD_Reference 验证类型", description = "Reference Validation Type list", help = "e.g. I - Independent ", items = {
			@FlyRefItem(name = "列表验证", value = "列表验证"), @FlyRefItem(name = "数据类型", value = "数据类型"),
			@FlyRefItem(name = "表验证", value = "表验证"), })
	AD_Reference_Validation_Types,
	//
	@FlyRefList(name = "AD_Table 访问级别", description = "Table Access and Sharing Level list", items = {
			@FlyRefItem(name = "系统+客户", value = "系统+客户"), @FlyRefItem(name = "机构", value = "机构"),
			@FlyRefItem(name = "客户+机构", value = "客户+机构"), @FlyRefItem(name = "仅系统级", value = "仅系统级"),
			@FlyRefItem(name = "全部", value = "全部"), @FlyRefItem(name = "仅客户级", value = "仅客户级"), })
	AD_Table_Access_Levels,
	//
	@FlyRefList(name = "CRM Schedule", help = "Forward and Backward Scheduling", items = {
			@FlyRefItem(name = "Backward ", value = "Backward "), @FlyRefItem(name = "Forward", value = "Forward"), })
	CRM_Schedule,
	//
	@FlyRefList(name = "C_DocType SubTypeSO", description = "定单类型列出", items = {
			@FlyRefItem(name = "信用定单", value = "信用定单"), @FlyRefItem(name = "POS定单", value = "POS定单"),
			@FlyRefItem(name = "仓库定单", value = "仓库定单"), @FlyRefItem(name = "标准定单", value = "标准定单"),
			@FlyRefItem(name = "提议", value = "提议"), @FlyRefItem(name = "报价", value = "报价"),
			@FlyRefItem(name = "退回材料 **", value = "退回材料 **"), @FlyRefItem(name = "先付定单", value = "先付定单"), })
	C_DocType_SubTypeSO,
	//
	@FlyRefList(name = "AD_Print 曲线图类型", items = { @FlyRefItem(name = "饼图", value = "饼图"),
			@FlyRefItem(name = "线图", value = "线图"), @FlyRefItem(name = "直条图", value = "直条图"), })
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
	@FlyRefList(name = "C_Payment CreditCard 类型", description = "C_Payment Credit Card Type list", items = {
			@FlyRefItem(name = "美国证券交易所", value = "美国证券交易所"), @FlyRefItem(name = "自动柜员机", value = "自动柜员机"),
			@FlyRefItem(name = "MasterCard", value = "MasterCard"), @FlyRefItem(name = "签证", value = "签证"),
			@FlyRefItem(name = "采购卡片", value = "采购卡片"), @FlyRefItem(name = "用餐者", value = "用餐者"),
			@FlyRefItem(name = "发现", value = "发现"), })
	C_Payment_CreditCard_Type,
	//
	@FlyRefList(name = "M_Product_ProductType", items = { @FlyRefItem(name = "项目", value = "项目"),
			@FlyRefItem(name = "服务", value = "服务"), @FlyRefItem(name = "资源", value = "资源"),
			@FlyRefItem(name = "费用类型", value = "费用类型"), @FlyRefItem(name = "在线", value = "在线"), })
	M_Product_ProductType,
	//
	@FlyRefList(name = "M_DiscountPriceList RoundingRule", description = "定圆整规则目录的价格", items = {
			@FlyRefItem(name = "Whole Number .00", value = "Whole Number .00"),
			@FlyRefItem(name = "没有圆整", value = "没有圆整"),
			@FlyRefItem(name = "Quarter .25 .50 .75", value = "Quarter .25 .50 .75"),
			@FlyRefItem(name = "Dime .10, .20, .30, ...", value = "Dime .10, .20, .30, ..."),
			@FlyRefItem(name = "Nickel .05, .10, .15, ...", value = "Nickel .05, .10, .15, ..."),
			@FlyRefItem(name = "Ten 10.00, 20.00, ..", value = "Ten 10.00, 20.00, .."),
			@FlyRefItem(name = "币种精度", value = "币种精度"), @FlyRefItem(name = "Ending in 9/5", value = "Ending in 9/5"), })
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
	@FlyRefList(name = "AD_Color 类型", items = { @FlyRefItem(name = "常态", value = "常态"),
			@FlyRefItem(name = "倾斜度", value = "倾斜度"), @FlyRefItem(name = "明细", value = "明细"),
			@FlyRefItem(name = "织法", value = "织法"), })
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
	@FlyRefList(name = "C_Order InvoiceRule", description = "开发票规则列表", items = {
			@FlyRefItem(name = "在定单配送之后", value = "在定单配送之后"), @FlyRefItem(name = "在配送之后", value = "在配送之后"),
			@FlyRefItem(name = "Customer Schedule after Delivery", value = "Customer Schedule after Delivery"),
			@FlyRefItem(name = "立即的", value = "立即的"), })
	C_Order_InvoiceRule,
	//
	@FlyRefList(name = "All_PriorityRule", description = "优先权刻度目录", items = { @FlyRefItem(name = "高级", value = "高级"),
			@FlyRefItem(name = "中等", value = "中等"), @FlyRefItem(name = "低级", value = "低级"),
			@FlyRefItem(name = "Urgent", value = "Urgent"), @FlyRefItem(name = "Minor", value = "Minor"), })
	_PriorityRule,
	//
	@FlyRefList(name = "C_Order FreightCostRule", description = "运费规则列表", items = {
			@FlyRefItem(name = "已包括运费", value = "已包括运费"), @FlyRefItem(name = "计算", value = "计算"),
			@FlyRefItem(name = "固定价格", value = "固定价格"), @FlyRefItem(name = "明细", value = "明细"), })
	C_Order_FreightCostRule,
	//
	@FlyRefList(name = "C_Order DeliveryViaRule", description = "配送经由规则列表", items = {
			@FlyRefItem(name = "配送", value = "配送"), @FlyRefItem(name = "运输商", value = "运输商"),
			@FlyRefItem(name = "自提", value = "自提"), })
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
			@FlyRefItem(name = "Released", value = "Released"), @FlyRefItem(name = "测试", value = "测试"),
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
	@FlyRefList(name = "AD_Find 操作", items = { @FlyRefItem(name = " =", value = " ="),
			@FlyRefItem(name = ">=", value = ">="), @FlyRefItem(name = ">", value = ">"),
			@FlyRefItem(name = "<", value = "<"), @FlyRefItem(name = " ~", value = " ~"),
			@FlyRefItem(name = "<=", value = "<="), @FlyRefItem(name = "|<x>|", value = "|<x>|"),
			@FlyRefItem(name = "sql", value = "sql"), @FlyRefItem(name = "!=", value = "!="), })
	AD_Find_Operation,
	//
	@FlyRefList(name = "AD_ImpFormat 类型", items = { @FlyRefItem(name = "产品", value = "产品"),
			@FlyRefItem(name = "业务伙伴 ", value = "业务伙伴 "), @FlyRefItem(name = "帐户", value = "帐户"),
			@FlyRefItem(name = "总帐余款", value = "总帐余款"), @FlyRefItem(name = "交换比率", value = "交换比率"),
			@FlyRefItem(name = "盘点", value = "盘点"), })
	AD_ImpFormat_Type,
	//
	@FlyRefList(name = "AD_ImpFormat FormatType", items = { @FlyRefItem(name = "固定的位置", value = "固定的位置"),
			@FlyRefItem(name = "逗点分开", value = "逗点分开"), @FlyRefItem(name = "定位键分开", value = "定位键分开"),
			@FlyRefItem(name = "XML语言", value = "XML语言"),
			@FlyRefItem(name = "Custom Separator Char", value = "Custom Separator Char"), })
	AD_ImpFormat_FormatType,
	//
	@FlyRefList(name = "AD_ImpFormat_Row 类型", items = { @FlyRefItem(name = "字符串", value = "字符串"),
			@FlyRefItem(name = "数字", value = "数字"), @FlyRefItem(name = "日期", value = "日期"),
			@FlyRefItem(name = "常数", value = "常数"), })
	AD_ImpFormat_Row_Type,
	//
	@FlyRefList(name = "M_InventoryCount QtyRange", items = { @FlyRefItem(name = "> 0", value = "> 0"),
			@FlyRefItem(name = "= 0", value = "= 0"), @FlyRefItem(name = "< 0", value = "< 0"),
			@FlyRefItem(name = "非0", value = "非0"), })
	M_InventoryCount_QtyRange,
	//
	@FlyRefList(name = "C_Bank 帐户类型", items = { @FlyRefItem(name = "检查", value = "检查"),
			@FlyRefItem(name = "储蓄", value = "储蓄"), })
	C_Bank_Account_Type,
	//
	@FlyRefList(name = "C_Cash Trx 类型", items = { @FlyRefItem(name = "转帐到银行帐户", value = "转帐到银行帐户"),
			@FlyRefItem(name = "发票", value = "发票"), @FlyRefItem(name = "通用费用", value = "通用费用"),
			@FlyRefItem(name = "通用收据", value = "通用收据"), @FlyRefItem(name = "费用", value = "费用"),
			@FlyRefItem(name = "差额", value = "差额"), })
	C_Cash_Trx_Type,
	//
	@FlyRefList(name = "R_Request 请求类型", items = { @FlyRefItem(name = "数据", value = "数据"),
			@FlyRefItem(name = "服务", value = "服务"), @FlyRefItem(name = "费用", value = "费用"),
			@FlyRefItem(name = "帐户", value = "帐户"), @FlyRefItem(name = "帮助", value = "帮助"),
			@FlyRefItem(name = " 警报", value = " 警报"), @FlyRefItem(name = "担保", value = "担保"),
			@FlyRefItem(name = "其他", value = "其他"), })
	R_Request_Request_Type,
	//
	@FlyRefList(name = "R_Request 下一个动作", items = { @FlyRefItem(name = "没有", value = "没有"),
			@FlyRefItem(name = "追踪", value = "追踪"), })
	R_Request_Next_Action,
	//
	@FlyRefList(name = "R_Request 频率类型", items = { @FlyRefItem(name = "分钟", value = "分钟"),
			@FlyRefItem(name = "小时", value = "小时"), @FlyRefItem(name = "日", value = "日"), })
	_Frequency_Type,
	//
	@FlyRefList(name = "R_Request 应付款类型", items = { @FlyRefItem(name = "超储的", value = "超储的"),
			@FlyRefItem(name = "应付款", value = "应付款"), @FlyRefItem(name = "预定", value = "预定"), })
	R_Request_Due_Type,
	//
	@FlyRefList(name = "C_Commission DocBasis", items = { @FlyRefItem(name = "定单", value = "定单"),
			@FlyRefItem(name = "发票", value = "发票"), @FlyRefItem(name = "收货", value = "收货"), })
	C_Commission_DocBasis,
	//
	@FlyRefList(name = "C_Commission 频率", items = { @FlyRefItem(name = "Yearly", value = "Yearly"),
			@FlyRefItem(name = "每周的", value = "每周的"), @FlyRefItem(name = "每月的", value = "每月的"),
			@FlyRefItem(name = "每季的", value = "每季的"), })
	C_Commission_Frequency,
	//
	@FlyRefList(name = "AD_Role 用户级别", items = { @FlyRefItem(name = "系统 ", value = "系统 "),
			@FlyRefItem(name = "客户", value = "客户"), @FlyRefItem(name = "机构", value = "机构"),
			@FlyRefItem(name = "客户+机构", value = "客户+机构"), })
	AD_Role_User_Level,
	//
	@FlyRefList(name = "PA_Measure 类型", items = { @FlyRefItem(name = "Request", value = "Request"),
			@FlyRefItem(name = "Project", value = "Project"),
			@FlyRefItem(name = "User defined", value = "User defined"), @FlyRefItem(name = "Ratio", value = "Ratio"),
			@FlyRefItem(name = "手工", value = "手工"), @FlyRefItem(name = "计算", value = "计算"),
			@FlyRefItem(name = "进步", value = "进步"), })
	PA_Measure_Type,
	//
	@FlyRefList(name = "总帐种类类型", items = { @FlyRefItem(name = "System generated", value = "System generated"),
			@FlyRefItem(name = "文件", value = "文件"), @FlyRefItem(name = "导入", value = "导入"),
			@FlyRefItem(name = "手工", value = "手工"), })
	GL_Category_Type,
	//
	@FlyRefList(name = "PA_Report 金额类型", items = { @FlyRefItem(name = "分期余款", value = "分期余款"),
			@FlyRefItem(name = "只有分期信用", value = "只有分期信用"), @FlyRefItem(name = "只有分期借方", value = "只有分期借方"),
			@FlyRefItem(name = "分期量", value = "分期量"), @FlyRefItem(name = "总量", value = "总量"),
			@FlyRefItem(name = "年余款", value = "年余款"), @FlyRefItem(name = "只有年信用", value = "只有年信用"),
			@FlyRefItem(name = "只有年借方", value = "只有年借方"), @FlyRefItem(name = "年量", value = "年量"),
			@FlyRefItem(name = "只有总借方", value = "只有总借方"), @FlyRefItem(name = "只有总贷方", value = "只有总贷方"),
			@FlyRefItem(name = "总余款", value = "总余款"),
			@FlyRefItem(name = "Natural Balance", value = "Natural Balance"), })
	PA_Report_AmountType__deprecated_,
	//
	@FlyRefList(name = "PA_Report 计算类型", items = { @FlyRefItem(name = "增加", value = "增加"),
			@FlyRefItem(name = "减去", value = "减去"), @FlyRefItem(name = "百分比", value = "百分比"),
			@FlyRefItem(name = "增加范围", value = "增加范围"), })
	PA_Report_CalculationType,
	//
	@FlyRefList(name = "PA_Report 列类型", items = { @FlyRefItem(name = "相对分期", value = "相对分期"),
			@FlyRefItem(name = "计算", value = "计算"), @FlyRefItem(name = "表值", value = "表值"), })
	PA_Report_ColumnType,
	//
	@FlyRefList(name = "PA_Report 货币类型", items = { @FlyRefItem(name = "来源币种", value = "来源币种"),
			@FlyRefItem(name = "会计币种", value = "会计币种"), })
	PA_Report_CurrencyType,
	//
	@FlyRefList(name = "M_Replenish 类型", items = { @FlyRefItem(name = "Custom", value = "Custom"),
			@FlyRefItem(name = "维护最大值水平", value = "维护最大值水平"), @FlyRefItem(name = "手工", value = "手工"),
			@FlyRefItem(name = "低于最小量水平定货", value = "低于最小量水平定货"),
			@FlyRefItem(name = "Replenish Plan Calculated", value = "Replenish Plan Calculated"), })
	M_Replenish_Type,
	//
	@FlyRefList(name = "C_Payment AVS", items = { @FlyRefItem(name = "不匹配", value = "不匹配"),
			@FlyRefItem(name = "不可用的", value = "不可用的"), @FlyRefItem(name = "匹配", value = "匹配"), })
	C_Payment_AVS,
	//
	@FlyRefList(name = "C_Payment Trx 类型", items = { @FlyRefItem(name = "信用", value = "信用"),
			@FlyRefItem(name = "延迟捕获", value = "延迟捕获"), @FlyRefItem(name = "宣述授权", value = "宣述授权"),
			@FlyRefItem(name = "销售", value = "销售"), @FlyRefItem(name = "空白", value = "空白"),
			@FlyRefItem(name = "授权", value = "授权"), })
	C_Payment_Trx_Type,
	//
	@FlyRefList(name = "C_Payment 投标类型", items = { @FlyRefItem(name = "ACH", value = "ACH"),
			@FlyRefItem(name = "信用卡", value = "信用卡"), @FlyRefItem(name = "支票", value = "支票"),
			@FlyRefItem(name = "Cash", value = "Cash"), @FlyRefItem(name = "Direct Debit", value = "Direct Debit"),
			@FlyRefItem(name = "Credit Memo", value = "Credit Memo"),
			@FlyRefItem(name = "Account", value = "Account"), })
	C_Payment_Tender_Type,
	//
	@FlyRefList(name = "星期", description = "星期列表", items = { @FlyRefItem(name = "星期日", value = "星期日"),
			@FlyRefItem(name = "星期一", value = "星期一"), @FlyRefItem(name = "星期二", value = "星期二"),
			@FlyRefItem(name = "星期三", value = "星期三"), @FlyRefItem(name = "星期四", value = "星期四"),
			@FlyRefItem(name = "星期五", value = "星期五"), @FlyRefItem(name = "星期六", value = "星期六"), })
	Weekdays,
	//
	@FlyRefList(name = "C_InvoiceSchedule InvoiceFrequency", items = { @FlyRefItem(name = "每日的", value = "每日的"),
			@FlyRefItem(name = "每周的", value = "每周的"), @FlyRefItem(name = "每月的", value = "每月的"),
			@FlyRefItem(name = "两次每月的", value = "两次每月的"), })
	C_InvoiceSchedule_InvoiceFrequency,
	//
	@FlyRefList(name = "AD_FieldGroup", description = "Field Group Type", items = {
			@FlyRefItem(name = "Tab", value = "Tab"), @FlyRefItem(name = "Label", value = "Label"),
			@FlyRefItem(name = "Collapse", value = "Collapse"), })
	AD_FieldGroup,
	//
	@FlyRefList(name = "C_PeriodControl 动作", items = { @FlyRefItem(name = "有效分期", value = "有效分期"),
			@FlyRefItem(name = "关闭的分期", value = "关闭的分期"), @FlyRefItem(name = "<没有动作>", value = "<没有动作>"),
			@FlyRefItem(name = "永久关闭分期", value = "永久关闭分期"), })
	C_PeriodControl_Action,
	//
	@FlyRefList(name = "C_PeriodControl状态", items = { @FlyRefItem(name = "打开", value = "打开"),
			@FlyRefItem(name = "关闭", value = "关闭"), @FlyRefItem(name = "永久关闭", value = "永久关闭"),
			@FlyRefItem(name = "从未打开", value = "从未打开"), })
	C_PeriodControl_Status,
	//
	@FlyRefList(name = "GL_Budget 状态", items = { @FlyRefItem(name = "已批准", value = "已批准"),
			@FlyRefItem(name = "草稿", value = "草稿"), })
	GL_Budget_Status,
	//
	@FlyRefList(name = "All_ErrorType", description = "列出错误的类型", items = { @FlyRefItem(name = "错误", value = "错误"),
			@FlyRefItem(name = "警告", value = "警告"), @FlyRefItem(name = "信息", value = "信息"), })
	_ErrorType,
	//
	@FlyRefList(name = "C_AcctSchema ElementType", description = "Element Types for Accounting Elements", help = "Hardcoded 元素打字", items = {
			@FlyRefItem(name = "Sub Account", value = "Sub Account"),
			@FlyRefItem(name = "User Element 1", value = "User Element 1"),
			@FlyRefItem(name = "User Element 2", value = "User Element 2"), @FlyRefItem(name = "用户 2", value = "用户 2"),
			@FlyRefItem(name = "机构", value = "机构"), @FlyRefItem(name = "帐户", value = "帐户"),
			@FlyRefItem(name = "产品", value = "产品"), @FlyRefItem(name = "Bus.Partner", value = "Bus.Partner"),
			@FlyRefItem(name = "Trx. Org", value = "Trx. Org"), @FlyRefItem(name = "活动", value = "活动"),
			@FlyRefItem(name = "来源位置", value = "来源位置"), @FlyRefItem(name = "目标位置", value = "目标位置"),
			@FlyRefItem(name = "销售区域", value = "销售区域"), @FlyRefItem(name = "项目", value = "项目"),
			@FlyRefItem(name = "活动", value = "活动"), @FlyRefItem(name = "用户 1", value = "用户 1"),
			@FlyRefItem(name = "User List 3", value = "User List 3"),
			@FlyRefItem(name = "User List 4", value = "User List 4"), })
	C_AcctSchema_ElementType,
	//
	@FlyRefList(name = "M_DiscountPriceList 基础", items = { @FlyRefItem(name = "列表价格", value = "列表价格"),
			@FlyRefItem(name = "标准价格", value = "标准价格"), @FlyRefItem(name = "限制 (采购定单) 价格", value = "限制 (采购定单) 价格"),
			@FlyRefItem(name = "固定的价格", value = "固定的价格"), })
	M_DiscountPriceList_Base,
	//
	@FlyRefList(name = "C_RevenueRecognition Frequency", description = "Frequency of Revenue Recognition", items = {
			@FlyRefItem(name = "月", value = "月"), @FlyRefItem(name = "季", value = "季"),
			@FlyRefItem(name = "年", value = "年"), })
	C_RevenueRecognition_Frequency,
	//
	@FlyRefList(name = "M_Inventory ReportType", items = {
			@FlyRefItem(name = "Blind list (w o book quantity)", value = "Blind list (w o book quantity)"),
			@FlyRefItem(name = "Count list (with book quantity)", value = "Count list (with book quantity)"),
			@FlyRefItem(name = "控制目录", value = "控制目录"), })
	M_Inventory_ReportType,
	//
	@FlyRefList(name = "AD_Print 字段对准", items = { @FlyRefItem(name = "缺省值", value = "缺省值"),
			@FlyRefItem(name = "领先", value = "领先"), @FlyRefItem(name = "拖", value = "拖"),
			@FlyRefItem(name = "块", value = "块"), @FlyRefItem(name = "中心", value = "中心"), })
	AD_Print_Field_Alignment,
	//
	@FlyRefList(name = "AD_Print 线对准", items = { @FlyRefItem(name = "没有", value = "没有"),
			@FlyRefItem(name = "领先", value = "领先"), @FlyRefItem(name = "中心", value = "中心"),
			@FlyRefItem(name = "拖", value = "拖"), })
	AD_Print_Line_Alignment,
	//
	@FlyRefList(name = "AD_Print 格式类型", items = { @FlyRefItem(name = "图像", value = "图像"),
			@FlyRefItem(name = "字段", value = "字段"), @FlyRefItem(name = "文本", value = "文本"),
			@FlyRefItem(name = "打印格式", value = "打印格式"), @FlyRefItem(name = "Rectangle", value = "Rectangle"),
			@FlyRefItem(name = "Line", value = "Line"), })
	AD_Print_Format_Type,
	//
	@FlyRefList(name = "AD_Print 区域", items = { @FlyRefItem(name = "内容", value = "内容"),
			@FlyRefItem(name = "头", value = "头"), @FlyRefItem(name = "脚", value = "脚"), })
	AD_Print_Area,
	//
	@FlyRefList(name = "C_BP_EDI EDI 类型", items = { @FlyRefItem(name = "ASC X12", value = "ASC X12"),
			@FlyRefItem(name = "EDIFACT", value = "EDIFACT"), @FlyRefItem(name = "发电子邮件给 EDI", value = "发电子邮件给 EDI"), })
	C_BP_EDI_EDI_Type,
	//
	@FlyRefList(name = "M_EDI 状态", items = { @FlyRefItem(name = "草稿", value = "草稿"),
			@FlyRefItem(name = "已发送", value = "已发送"), @FlyRefItem(name = "确认", value = "确认"),
			@FlyRefItem(name = "回答", value = "回答"), })
	M_EDI_Status,
	//
	@FlyRefList(name = "M_EDI Trx 类型", items = { @FlyRefItem(name = "查询", value = "查询"),
			@FlyRefItem(name = "采购定单", value = "采购定单"), })
	M_EDI_Trx_Type,
	//
	@FlyRefList(name = "AD_Find AndOr", items = { @FlyRefItem(name = "而且", value = "而且"),
			@FlyRefItem(name = "或", value = "或"), })
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
			@FlyRefItem(name = "文档动作", value = "文档动作"), @FlyRefItem(name = "EMail", value = "EMail"),
			@FlyRefItem(name = "用户表单", value = "用户表单"), @FlyRefItem(name = "应用任务", value = "应用任务"),
			@FlyRefItem(name = "应用报表", value = "应用报表"), @FlyRefItem(name = "应用进程", value = "应用进程"),
			@FlyRefItem(name = "等待(睡眠)", value = "等待(睡眠)"), @FlyRefItem(name = "User Choice", value = "User Choice"),
			@FlyRefItem(name = "User Workbench", value = "User Workbench"), @FlyRefItem(name = "子工作流", value = "子工作流"),
			@FlyRefItem(name = "Set Variable", value = "Set Variable"),
			@FlyRefItem(name = "User Window", value = "User Window"),
			@FlyRefItem(name = "Smart View", value = "Smart View"),
			@FlyRefItem(name = "Smart Browse", value = "Smart Browse"), })
	WF_Action,
	//
	@FlyRefList(name = "WF_Start-Finish Mode", items = { @FlyRefItem(name = "自动", value = "自动"),
			@FlyRefItem(name = "手动", value = "手动"), })
	WF_Start_Finish_Mode,
	//
	@FlyRefList(name = "WF_Participant 类型", items = { @FlyRefItem(name = "机构", value = "机构"),
			@FlyRefItem(name = "人", value = "人"), @FlyRefItem(name = "角色", value = "角色"),
			@FlyRefItem(name = "系统资源", value = "系统资源"), })
	WF_Participant_Type,
	//
	@FlyRefList(name = "WF_Instance 状态", items = { @FlyRefItem(name = "运行中", value = "运行中"),
			@FlyRefItem(name = "挂起", value = "挂起"), @FlyRefItem(name = "未启动", value = "未启动"),
			@FlyRefItem(name = "完毕", value = "完毕"), @FlyRefItem(name = "取消", value = "取消"),
			@FlyRefItem(name = "中止", value = "中止"), })
	WF_Instance_State,
	//
	@FlyRefList(name = "WF_EventType", items = { @FlyRefItem(name = "进程被创建", value = "进程被创建"),
			@FlyRefItem(name = "状态被改变", value = "状态被改变"), @FlyRefItem(name = "处理完毕", value = "处理完毕"), })
	WF_EventType,
	//
	@FlyRefList(name = "WF_SubFlow 执行", items = { @FlyRefItem(name = "异步", value = "异步"),
			@FlyRefItem(name = "同步", value = "同步"), })
	WF_SubFlow_Execution,
	//
	@FlyRefList(name = "All_Payment 规则", description = "在 &出自付款选项", items = { @FlyRefItem(name = "信用卡", value = "信用卡"),
			@FlyRefItem(name = "记帐", value = "记帐"), @FlyRefItem(name = "支票", value = "支票"),
			@FlyRefItem(name = "转帐", value = "转帐"), @FlyRefItem(name = "现金", value = "现金"),
			@FlyRefItem(name = "Direct Debit", value = "Direct Debit"), @FlyRefItem(name = "Mixed", value = "Mixed"), })
	_Payment_Rule,
	//
	@FlyRefList(name = "M_Movement 类型", items = { @FlyRefItem(name = "制造 -", value = "制造 -"),
			@FlyRefItem(name = "客户归还", value = "客户归还"), @FlyRefItem(name = "客户物料出货", value = "客户物料出货"),
			@FlyRefItem(name = "库存在", value = "库存在"), @FlyRefItem(name = "出库", value = "出库"),
			@FlyRefItem(name = "供应商收货", value = "供应商收货"), @FlyRefItem(name = "供应商归还", value = "供应商归还"),
			@FlyRefItem(name = "调拨从", value = "调拨从"), @FlyRefItem(name = "Work Order -", value = "Work Order -"),
			@FlyRefItem(name = "调拨到", value = "调拨到"), @FlyRefItem(name = "制造 +", value = "制造 +"),
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
			@FlyRefItem(name = "实线", value = "实线"), @FlyRefItem(name = "虚线", value = "虚线"),
			@FlyRefItem(name = "点线", value = "点线"), @FlyRefItem(name = "点划线", value = "点划线"), })
	AD_PrintTableFormat_Stroke,
	//
	@FlyRefList(name = "M_RelatedProduct 类型", items = { @FlyRefItem(name = "Web Promotion", value = "Web Promotion"),
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
			@FlyRefItem(name = "Not Mandatary", value = "Not Mandatary"),
			@FlyRefItem(name = "Always Mandatory", value = "Always Mandatory"),
			@FlyRefItem(name = "When Shipping", value = "When Shipping"), })
	M_AttributeSet_MandatoryType,
	//
	@FlyRefList(name = "M_Attribute Value Type", items = {
			@FlyRefItem(name = "String (max 40)", value = "String (max 40)"),
			@FlyRefItem(name = "Number", value = "Number"), @FlyRefItem(name = "List", value = "List"), })
	M_Attribute_Value_Type,
	//
	@FlyRefList(name = "PA_Report 行类型", items = { @FlyRefItem(name = "表值", value = "表值"),
			@FlyRefItem(name = "计算", value = "计算"), @FlyRefItem(name = "Tabbed Text", value = "Tabbed Text"),
			@FlyRefItem(name = "Customized Line", value = "Customized Line"),
			@FlyRefItem(name = "Blank line", value = "Blank line"), })
	PA_Report_LineType,
	//
	@FlyRefList(name = "A_Reval_Multiplier", description = "Revaluation Multiplier Type", items = {
			@FlyRefItem(name = "Factor", value = "Factor"), @FlyRefItem(name = "Index", value = "Index"), })
	A_Reval_Multiplier,
	//
	@FlyRefList(name = "All_Posted 状态", items = { @FlyRefItem(name = "未过帐", value = "未过帐"),
			@FlyRefItem(name = "已过帐", value = "已过帐"), @FlyRefItem(name = "未平衡", value = "未平衡"),
			@FlyRefItem(name = "不可兑换(无汇率)", value = "不可兑换(无汇率)"), @FlyRefItem(name = "无效帐户", value = "无效帐户"),
			@FlyRefItem(name = "关闭的分期", value = "关闭的分期"), @FlyRefItem(name = "过账准备好", value = "过账准备好"),
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
	@FlyRefList(name = "_Document Action Import budget", description = "Document action list", items = {
			@FlyRefItem(name = "Draft", value = "Draft"), @FlyRefItem(name = "Complete", value = "Complete"), })
	_Document_Action_Import_budget,
	//
	@FlyRefList(name = "A_Asset Status", description = "Asset Status", items = {
			@FlyRefItem(name = "Activated", value = "Activated"), @FlyRefItem(name = "Disposed", value = "Disposed"),
			@FlyRefItem(name = "Depreciated", value = "Depreciated"), @FlyRefItem(name = "New", value = "New"),
			@FlyRefItem(name = "Preservation", value = "Preservation"),
			@FlyRefItem(name = "Retired", value = "Retired"), @FlyRefItem(name = "Sold", value = "Sold"), })
	A_Asset_Status,
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
	@FlyRefList(name = "C_DocType DocBaseType", description = "以文件类型作基础", items = {
			@FlyRefItem(name = "应收款信用备忘录", value = "应收款信用备忘录"), @FlyRefItem(name = "应付帐款", value = "应付帐款"),
			@FlyRefItem(name = "应收款格式发票", value = "应收款格式发票"), @FlyRefItem(name = "应收款发票", value = "应收款发票"),
			@FlyRefItem(name = "应收帐款", value = "应收帐款"), @FlyRefItem(name = "总帐文件", value = "总帐文件"),
			@FlyRefItem(name = "物料运动", value = "物料运动"), @FlyRefItem(name = "物料收货", value = "物料收货"),
			@FlyRefItem(name = "物料配送", value = "物料配送"), @FlyRefItem(name = "采购定单", value = "采购定单"),
			@FlyRefItem(name = "采购请求", value = "采购请求"), @FlyRefItem(name = "销售定单", value = "销售定单"),
			@FlyRefItem(name = "现金簿", value = "现金簿"), @FlyRefItem(name = "Payroll", value = "Payroll"),
			@FlyRefItem(name = "Maintenance Order", value = "Maintenance Order"),
			@FlyRefItem(name = "Manufacturing Order", value = "Manufacturing Order"),
			@FlyRefItem(name = "Quality Order", value = "Quality Order"),
			@FlyRefItem(name = "Fixed Assets Disposal", value = "Fixed Assets Disposal"),
			@FlyRefItem(name = "Fixed Assets Depreciation", value = "Fixed Assets Depreciation"),
			@FlyRefItem(name = "应付款信用备忘录", value = "应付款信用备忘录"), @FlyRefItem(name = "应付款发票", value = "应付款发票"),
			@FlyRefItem(name = "付款分配", value = "付款分配"), @FlyRefItem(name = "银行对帐单", value = "银行对帐单"),
			@FlyRefItem(name = "Distribution Order", value = "Distribution Order"),
			@FlyRefItem(name = "Fixed Assets Addition", value = "Fixed Assets Addition"),
			@FlyRefItem(name = "总帐分类帐", value = "总帐分类帐"),
			@FlyRefItem(name = "Manufacturing Cost Collector", value = "Manufacturing Cost Collector"),
			@FlyRefItem(name = "物料实际的库存", value = "物料实际的库存"), @FlyRefItem(name = "物料制造", value = "物料制造"),
			@FlyRefItem(name = "匹配发票", value = "匹配发票"), @FlyRefItem(name = "匹配采购定单", value = "匹配采购定单"),
			@FlyRefItem(name = "Project Issue", value = "Project Issue"),
			@FlyRefItem(name = "Warehouse Management Order", value = "Warehouse Management Order"),
			@FlyRefItem(name = "AP Payment Selection", value = "AP Payment Selection"),
			@FlyRefItem(name = "Manufacturing Planned Order", value = "Manufacturing Planned Order"),
			@FlyRefItem(name = "Sales Commission", value = "Sales Commission"), })
	C_DocType_DocBaseType,
	//
	@FlyRefList(name = "_YesNo", items = { @FlyRefItem(name = "是", value = "是"),
			@FlyRefItem(name = "否", value = "否"), })
	_YesNo,
	//
	@FlyRefList(name = "C_Order DeliveryRule", description = "配送规则列表", items = {
			@FlyRefItem(name = "在收款之后", value = "在收款之后"), @FlyRefItem(name = "平均ailability", value = "平均ailability"),
			@FlyRefItem(name = "定单明细完成", value = "定单明细完成"), @FlyRefItem(name = "定单完成", value = "定单完成"),
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
	@FlyRefList(name = "Print Document", items = { @FlyRefItem(name = "Order", value = "Order"),
			@FlyRefItem(name = "Shipment", value = "Shipment"), @FlyRefItem(name = "Invoice", value = "Invoice"), })
	Print_Document,
}