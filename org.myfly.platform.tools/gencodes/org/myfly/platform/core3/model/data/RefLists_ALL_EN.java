package org.myfly.platform.core3.model.data;

import org.myfly.platform.core3.metadata.annotation.FlyRefItem;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;

public enum RefLists_ALL_EN {
	//
	@FlyRefList(name="发电子邮件给 EDI", items={
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
	@FlyRefList(name="AD_Reference Validation Types", description="Reference Validation Type list", help="e.g. I - Independent ", items={
	@FlyRefItem(name="列表验证", value="列表验证"),
	@FlyRefItem(name="数据类型", value="数据类型"),
	@FlyRefItem(name="表验证", value="表验证"),
})
	AD_Reference_Validation_Types,
	//
	@FlyRefList(name="采购请求", items={
	@FlyRefItem(name="Client", value="Client"),
	@FlyRefItem(name="Organization", value="Organization"),
	@FlyRefItem(name="User", value="User"),
	@FlyRefItem(name="None", value="None"),
})
	AD_Role_PreferenceType,
	//
	@FlyRefList(name="固定价格", description="固定的运费价格", items={
	@FlyRefItem(name="系统 ", value="系统 "),
	@FlyRefItem(name="客户", value="客户"),
	@FlyRefItem(name="机构", value="机构"),
	@FlyRefItem(name="客户+机构", value="客户+机构"),
})
	AD_Role_User_Level,
	//
	@FlyRefList(name="AD_Table Access Levels", description="Table Access and Sharing Level list", items={
	@FlyRefItem(name="系统+客户", value="系统+客户"),
	@FlyRefItem(name="机构", value="机构"),
	@FlyRefItem(name="客户+机构", value="客户+机构"),
	@FlyRefItem(name="仅系统级", value="仅系统级"),
	@FlyRefItem(name="全部", value="全部"),
	@FlyRefItem(name="仅客户级", value="仅客户级"),
})
	AD_Table_Access_Levels,
	//
	@FlyRefList(name="普通", description="Natural sign of the Account Type", items={
	@FlyRefItem(name="本地复制", value="本地复制"),
	@FlyRefItem(name="合并复制", value="合并复制"),
	@FlyRefItem(name="引用复制", value="引用复制"),
	@FlyRefItem(name="Broadcast", value="Broadcast"),
})
	AD_Table_Replication_Type,
	//
	@FlyRefList(name="而且", items={
	@FlyRefItem(name="VPN", value="VPN"),
	@FlyRefItem(name="WAN", value="WAN"),
	@FlyRefItem(name="LAN", value="LAN"),
	@FlyRefItem(name="Terminal Server", value="Terminal Server"),
})
	AD_User_ConnectionProfile,
	//
	@FlyRefList(name="控制目录", items={
	@FlyRefItem(name="None", value="None"),
	@FlyRefItem(name="EMail+Notice", value="EMail+Notice"),
	@FlyRefItem(name="EMail", value="EMail"),
	@FlyRefItem(name="Notice", value="Notice"),
})
	AD_User_NotificationType,
	//
	@FlyRefList(name="信息", help="e.g. M = Multi/Single (one uppercase character)", items={
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
	@FlyRefList(name="活动", items={
	@FlyRefItem(name="是", value="是"),
	@FlyRefItem(name="否", value="否"),
})
	_YesNo,
}