package org.myfly.platform.core3.dbinit.resources;

import org.myfly.platform.core3.metadata.annotation.FlyRefItem;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;

public enum MyRefLists_zh_CN {
	//
	@FlyRefList(name = "AD_Client AutoArchive", items = { @FlyRefItem(name = "None", value = "N"),
			@FlyRefItem(name = "All (Reports, Documents)", value = "1"), @FlyRefItem(name = "Documents", value = "2"),
			@FlyRefItem(name = "External Documents", value = "3"), })
	autoArchive,
	//
	@FlyRefList(name = "AD_Color StartPoint", items = { @FlyRefItem(name = "北方", value = "1"),
			@FlyRefItem(name = "东北方", value = "2"), @FlyRefItem(name = "东方", value = "3"),
			@FlyRefItem(name = "东南方", value = "4"), @FlyRefItem(name = "南方", value = "5"),
			@FlyRefItem(name = "西南方", value = "6"), @FlyRefItem(name = "西方", value = "7"),
			@FlyRefItem(name = "西北方", value = "8"), })
	startPoint,
	//
	@FlyRefList(name = "AD_Color 类型", items = { @FlyRefItem(name = "常态", value = "F"),
			@FlyRefItem(name = "倾斜度", value = "G"), @FlyRefItem(name = "明细", value = "L"),
			@FlyRefItem(name = "织法", value = "T"), })
	colorType,
	//
	@FlyRefList(name = "AD_Column Encrypted", items = { @FlyRefItem(name = "Encrypted", value = "Y"),
			@FlyRefItem(name = "Not Encrypted", value = "N"), })
	encrypted,
	//
	@FlyRefList(name = "AD_FieldGroup", description = "Field Group Type", items = {
			@FlyRefItem(name = "Tab", value = "T"), @FlyRefItem(name = "Label", value = "L"),
			@FlyRefItem(name = "Collapse", value = "C"), })
	fieldGroupType,
	//
	@FlyRefList(name = "AD_Field ObscureType", items = { @FlyRefItem(name = "Obscure Digits but last 4", value = "904"),
			@FlyRefItem(name = "Obscure Digits but first/last 4", value = "944"),
			@FlyRefItem(name = "Obscure AlphaNumeric but first/last 4", value = "A44"),
			@FlyRefItem(name = "Obscure AlphaNumeric but last 4", value = "A04"), })
	obscureType,
	//
	@FlyRefList(name = "AD_Reference 验证类型", description = "Reference Validation Type list", help = "e.g. I - Independent ", items = {
			@FlyRefItem(name = "列表验证", value = "L"), @FlyRefItem(name = "数据类型", value = "D"),
			@FlyRefItem(name = "表验证", value = "T"), })
	validationType,
	//
	@FlyRefList(name = "AD_Role PreferenceType", description = "Preference Type", items = {
			@FlyRefItem(name = "Client", value = "C"), @FlyRefItem(name = "Organization", value = "O"),
			@FlyRefItem(name = "User", value = "U"), @FlyRefItem(name = "None", value = "N"), })
	preferenceType,
	//
	@FlyRefList(name = "AD_Role 用户级别", items = { @FlyRefItem(name = "系统 ", value = "S  "),
			@FlyRefItem(name = "客户", value = " C "), @FlyRefItem(name = "机构", value = "  O"),
			@FlyRefItem(name = "客户+机构", value = " CO"), })
	userLevel,
	//
	@FlyRefList(name = "AD_Table 访问级别", description = "Table Access and Sharing Level list", items = {
			@FlyRefItem(name = "系统+客户", value = "SYSTEMCLEINT"), @FlyRefItem(name = "机构", value = "ORGANIZATION"),
			@FlyRefItem(name = "客户+机构", value = "CLIENTORGANIZATION"), @FlyRefItem(name = "仅系统级", value = "SYSTEM"),
			@FlyRefItem(name = "全部", value = "ALL"), @FlyRefItem(name = "仅客户级", value = "CLIENT"), })
	accessLevel,
	//
	@FlyRefList(name = "AD_Table 复制类型", description = "复制类型", items = { @FlyRefItem(name = "本地复制", value = "L"),
			@FlyRefItem(name = "合并复制", value = "M"), @FlyRefItem(name = "引用复制", value = "R"),
			@FlyRefItem(name = "Broadcast", value = "B"), })
	replicationType,
	//
	@FlyRefList(name = "AD_User ConnectionProfile", items = { @FlyRefItem(name = "VPN", value = "V"),
			@FlyRefItem(name = "WAN", value = "W"), @FlyRefItem(name = "LAN", value = "L"),
			@FlyRefItem(name = "Terminal Server", value = "T"), })
	connectionProfile,
	//
	@FlyRefList(name = "AD_User NotificationType", items = { @FlyRefItem(name = "None", value = "X"),
			@FlyRefItem(name = "EMail+Notice", value = "B"), @FlyRefItem(name = "EMail", value = "E"),
			@FlyRefItem(name = "Notice", value = "N"), })
	notificationType,
	//
	@FlyRefList(name = "AD_Window 类型", description = "视窗类型列表", help = "e.g. M = Multi Single (one uppercase character)", items = {
			@FlyRefItem(name = "单一记录", value = "S"), @FlyRefItem(name = "维护", value = "M"),
			@FlyRefItem(name = "交易", value = "T"), @FlyRefItem(name = "只有查询", value = "Q"), })
	windowType,
	//
	@FlyRefList(name = "Lead Source", description = "Lead Source", help = "The source of a lead", items = {
			@FlyRefItem(name = "Cold Call", value = "CC"), @FlyRefItem(name = "Existing Customer", value = "EC"),
			@FlyRefItem(name = "Employee", value = "EM"), @FlyRefItem(name = "Partner", value = "PT"),
			@FlyRefItem(name = "Conference", value = "CN"), @FlyRefItem(name = "Trade Show", value = "TS"),
			@FlyRefItem(name = "Web Site", value = "WS"), @FlyRefItem(name = "Word of Mouth", value = "WM"),
			@FlyRefItem(name = "Email", value = "EL"), })
	leadSource,
	//
	@FlyRefList(name = "Lead Status", items = { @FlyRefItem(name = "New", value = "N"),
			@FlyRefItem(name = "Working", value = "W"), @FlyRefItem(name = "Expired", value = "E"),
			@FlyRefItem(name = "Recycled", value = "R"), @FlyRefItem(name = "Converted", value = "C"), })
	leadStatus,
	//
	@FlyRefList(name = "MMPolicy", description = "Material Movement Policy", items = {
			@FlyRefItem(name = "LiFo", value = "L"), @FlyRefItem(name = "FiFo", value = "F"), })
	mmPolicy,
	//
	@FlyRefList(name = "Yes/No", items = { @FlyRefItem(name = "是", value = "Y"),
			@FlyRefItem(name = "否", value = "N"), })
	YesNo,
}