package org.myfly.platform.core3.model.data;

import org.myfly.platform.core3.metadata.annotation.FlyRefItem;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;

public enum RefLists_ALL_zh_CN {
	//
	@FlyRefList(name="AD_Column Encrypted", items={
	@FlyRefItem(name="Encrypted", value="Encrypted"),
	@FlyRefItem(name="Not Encrypted", value="Not Encrypted"),
})
	AD_Column_Encrypted,
	//
	@FlyRefList(name="AD_FieldGroup", description="Field Group Type", items={
	@FlyRefItem(name="Tab", value="Tab"),
	@FlyRefItem(name="Label", value="Label"),
	@FlyRefItem(name="Collapse", value="Collapse"),
})
	AD_FieldGroup,
	//
	@FlyRefList(name="AD_Field ObscureType", items={
	@FlyRefItem(name="Obscure Digits but last 4", value="Obscure Digits but last 4"),
	@FlyRefItem(name="Obscure Digits but first/last 4", value="Obscure Digits but first/last 4"),
	@FlyRefItem(name="Obscure AlphaNumeric but first/last 4", value="Obscure AlphaNumeric but first/last 4"),
	@FlyRefItem(name="Obscure AlphaNumeric but last 4", value="Obscure AlphaNumeric but last 4"),
})
	AD_Field_ObscureType,
	//
	@FlyRefList(name="AD_Reference 验证类型", description="Reference Validation Type list", help="e.g. I - Independent ", items={
	@FlyRefItem(name="列表验证", value="列表验证"),
	@FlyRefItem(name="数据类型", value="数据类型"),
	@FlyRefItem(name="表验证", value="表验证"),
})
	AD_Reference_Validation_Types,
	//
	@FlyRefList(name="AD_Role PreferenceType", description="Preference Type", items={
	@FlyRefItem(name="Client", value="Client"),
	@FlyRefItem(name="Organization", value="Organization"),
	@FlyRefItem(name="User", value="User"),
	@FlyRefItem(name="None", value="None"),
})
	AD_Role_PreferenceType,
	//
	@FlyRefList(name="AD_Role 用户级别", items={
	@FlyRefItem(name="系统 ", value="系统 "),
	@FlyRefItem(name="客户", value="客户"),
	@FlyRefItem(name="机构", value="机构"),
	@FlyRefItem(name="客户+机构", value="客户+机构"),
})
	AD_Role_User_Level,
	//
	@FlyRefList(name="AD_Table 访问级别", description="Table Access and Sharing Level list", items={
	@FlyRefItem(name="系统+客户", value="系统+客户"),
	@FlyRefItem(name="机构", value="机构"),
	@FlyRefItem(name="客户+机构", value="客户+机构"),
	@FlyRefItem(name="仅系统级", value="仅系统级"),
	@FlyRefItem(name="全部", value="全部"),
	@FlyRefItem(name="仅客户级", value="仅客户级"),
})
	AD_Table_Access_Levels,
	//
	@FlyRefList(name="AD_Table 复制类型", description="复制类型", items={
	@FlyRefItem(name="本地复制", value="本地复制"),
	@FlyRefItem(name="合并复制", value="合并复制"),
	@FlyRefItem(name="引用复制", value="引用复制"),
	@FlyRefItem(name="Broadcast", value="Broadcast"),
})
	AD_Table_Replication_Type,
	//
	@FlyRefList(name="AD_User ConnectionProfile", items={
	@FlyRefItem(name="VPN", value="VPN"),
	@FlyRefItem(name="WAN", value="WAN"),
	@FlyRefItem(name="LAN", value="LAN"),
	@FlyRefItem(name="Terminal Server", value="Terminal Server"),
})
	AD_User_ConnectionProfile,
	//
	@FlyRefList(name="AD_User NotificationType", items={
	@FlyRefItem(name="None", value="None"),
	@FlyRefItem(name="EMail+Notice", value="EMail+Notice"),
	@FlyRefItem(name="EMail", value="EMail"),
	@FlyRefItem(name="Notice", value="Notice"),
})
	AD_User_NotificationType,
	//
	@FlyRefList(name="AD_Window 类型", description="视窗类型列表", help="e.g. M = Multi Single (one uppercase character)", items={
	@FlyRefItem(name="单一记录", value="单一记录"),
	@FlyRefItem(name="维护", value="维护"),
	@FlyRefItem(name="交易", value="交易"),
	@FlyRefItem(name="只有查询", value="只有查询"),
})
	AD_Window_Types,
	//
	@FlyRefList(name="Lead Source", description="Lead Source", help="The source of a lead", items={
	@FlyRefItem(name="Cold Call", value="Cold Call"),
	@FlyRefItem(name="Existing Customer", value="Existing Customer"),
	@FlyRefItem(name="Employee", value="Employee"),
	@FlyRefItem(name="Partner", value="Partner"),
	@FlyRefItem(name="Conference", value="Conference"),
	@FlyRefItem(name="Trade Show", value="Trade Show"),
	@FlyRefItem(name="Web Site", value="Web Site"),
	@FlyRefItem(name="Word of Mouth", value="Word of Mouth"),
	@FlyRefItem(name="Email", value="Email"),
})
	Lead_Source,
	//
	@FlyRefList(name="Lead Status", items={
	@FlyRefItem(name="New", value="New"),
	@FlyRefItem(name="Working", value="Working"),
	@FlyRefItem(name="Expired", value="Expired"),
	@FlyRefItem(name="Recycled", value="Recycled"),
	@FlyRefItem(name="Converted", value="Converted"),
})
	Lead_Status,
	//
	@FlyRefList(name="_YesNo", items={
	@FlyRefItem(name="是", value="是"),
	@FlyRefItem(name="否", value="否"),
})
	_YesNo,
}