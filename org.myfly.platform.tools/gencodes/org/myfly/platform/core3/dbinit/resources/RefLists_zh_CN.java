package org.myfly.platform.core3.dbinit.resources;

import org.myfly.platform.core3.metadata.annotation.FlyRefItem;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;

public enum RefLists_zh_CN {
	//
	@FlyRefList(name="AD_Client AutoArchive", items={
	@FlyRefItem(name="None", value="N"),
	@FlyRefItem(name="All (Reports, Documents)", value="1"),
	@FlyRefItem(name="Documents", value="2"),
	@FlyRefItem(name="External Documents", value="3"),
})
	AD_Client_AutoArchive,
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
	@FlyRefList(name="AD_Color 类型", items={
	@FlyRefItem(name="常态", value="F"),
	@FlyRefItem(name="倾斜度", value="G"),
	@FlyRefItem(name="明细", value="L"),
	@FlyRefItem(name="织法", value="T"),
})
	AD_Color_Type,
	//
	@FlyRefList(name="AD_Column Encrypted", items={
	@FlyRefItem(name="Encrypted", value="Y"),
	@FlyRefItem(name="Not Encrypted", value="N"),
})
	AD_Column_Encrypted,
	//
	@FlyRefList(name="AD_FieldGroup", description="Field Group Type", items={
	@FlyRefItem(name="Tab", value="T"),
	@FlyRefItem(name="Label", value="L"),
	@FlyRefItem(name="Collapse", value="C"),
})
	AD_FieldGroup,
	//
	@FlyRefList(name="AD_Field ObscureType", items={
	@FlyRefItem(name="Obscure Digits but last 4", value="904"),
	@FlyRefItem(name="Obscure Digits but first/last 4", value="944"),
	@FlyRefItem(name="Obscure AlphaNumeric but first/last 4", value="A44"),
	@FlyRefItem(name="Obscure AlphaNumeric but last 4", value="A04"),
})
	AD_Field_ObscureType,
	//
	@FlyRefList(name="AD_Print 区域", items={
	@FlyRefItem(name="内容", value="C"),
	@FlyRefItem(name="头", value="H"),
	@FlyRefItem(name="脚", value="F"),
})
	AD_Print_Area,
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
	@FlyRefList(name="AD_PrintFormatItem ShapeType", items={
	@FlyRefItem(name="3D Rectangle", value="3"),
	@FlyRefItem(name="Oval", value="O"),
	@FlyRefItem(name="Round Rectangle", value="R"),
	@FlyRefItem(name="Normal Rectangle", value="N"),
})
	AD_PrintFormatItem_ShapeType,
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
	@FlyRefList(name="AD_Print 曲线图类型", items={
	@FlyRefItem(name="饼图", value="P"),
	@FlyRefItem(name="线图", value="L"),
	@FlyRefItem(name="直条图", value="B"),
})
	AD_Print_Graph_Type,
	//
	@FlyRefList(name="AD_Print 标签线类型", items={
	@FlyRefItem(name="字段", value="F"),
	@FlyRefItem(name="文本", value="T"),
})
	AD_Print_Label_Line_Type,
	//
	@FlyRefList(name="AD_Print 线对准", items={
	@FlyRefItem(name="没有", value="X"),
	@FlyRefItem(name="领先", value="L"),
	@FlyRefItem(name="中心", value="C"),
	@FlyRefItem(name="拖", value="T"),
})
	AD_Print_Line_Alignment,
	//
	@FlyRefList(name="AD_PrintPaper Units", items={
	@FlyRefItem(name="MM", value="M"),
	@FlyRefItem(name="Inch", value="I"),
})
	AD_PrintPaper_Units,
	//
	@FlyRefList(name="AD_PrintTableFormat Stroke", description="Stroke Type", items={
	@FlyRefItem(name="实线", value="S"),
	@FlyRefItem(name="虚线", value="D"),
	@FlyRefItem(name="点线", value="d"),
	@FlyRefItem(name="点划线", value="2"),
})
	AD_PrintTableFormat_Stroke,
	//
	@FlyRefList(name="AD_Reference 验证类型", description="Reference Validation Type list", help="e.g. I - Independent ", items={
	@FlyRefItem(name="列表验证", value="L"),
	@FlyRefItem(name="数据类型", value="D"),
	@FlyRefItem(name="表验证", value="T"),
})
	AD_Reference_Validation_Types,
	//
	@FlyRefList(name="AD_Role PreferenceType", description="Preference Type", items={
	@FlyRefItem(name="Client", value="C"),
	@FlyRefItem(name="Organization", value="O"),
	@FlyRefItem(name="User", value="U"),
	@FlyRefItem(name="None", value="N"),
})
	AD_Role_PreferenceType,
	//
	@FlyRefList(name="AD_Role 用户级别", items={
	@FlyRefItem(name="系统 ", value="S  "),
	@FlyRefItem(name="客户", value=" C "),
	@FlyRefItem(name="机构", value="  O"),
	@FlyRefItem(name="客户+机构", value=" CO"),
})
	AD_Role_User_Level,
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
	@FlyRefList(name="AD_Table 复制类型", description="复制类型", items={
	@FlyRefItem(name="本地复制", value="L"),
	@FlyRefItem(name="合并复制", value="M"),
	@FlyRefItem(name="引用复制", value="R"),
	@FlyRefItem(name="Broadcast", value="B"),
})
	AD_Table_Replication_Type,
	//
	@FlyRefList(name="AD_User ConnectionProfile", items={
	@FlyRefItem(name="VPN", value="V"),
	@FlyRefItem(name="WAN", value="W"),
	@FlyRefItem(name="LAN", value="L"),
	@FlyRefItem(name="Terminal Server", value="T"),
})
	AD_User_ConnectionProfile,
	//
	@FlyRefList(name="AD_User NotificationType", items={
	@FlyRefItem(name="None", value="X"),
	@FlyRefItem(name="EMail+Notice", value="B"),
	@FlyRefItem(name="EMail", value="E"),
	@FlyRefItem(name="Notice", value="N"),
})
	AD_User_NotificationType,
	//
	@FlyRefList(name="AD_Window 类型", description="视窗类型列表", help="e.g. M = Multi Single (one uppercase character)", items={
	@FlyRefItem(name="单一记录", value="S"),
	@FlyRefItem(name="维护", value="M"),
	@FlyRefItem(name="交易", value="T"),
	@FlyRefItem(name="只有查询", value="Q"),
})
	AD_Window_Types,
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
	@FlyRefList(name="EncryptionType List", items={
	@FlyRefItem(name="None", value="N"),
	@FlyRefItem(name="SSL", value="S"),
	@FlyRefItem(name="TLS", value="T"),
})
	EncryptionType_List,
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
	@FlyRefList(name="_MMPolicy", description="Material Movement Policy", items={
	@FlyRefItem(name="LiFo", value="L"),
	@FlyRefItem(name="FiFo", value="F"),
})
	_MMPolicy,
	//
	@FlyRefList(name="Protocol List", items={
	@FlyRefItem(name="SMTP", value="S"),
	@FlyRefItem(name="POP3", value="P"),
	@FlyRefItem(name="IMAP", value="I"),
})
	Protocol_List,
	//
	@FlyRefList(name="ShowHelp List", items={
	@FlyRefItem(name="Run silently - Take Defaults", value="S"),
	@FlyRefItem(name="Ask user (for future use)", value="A"),
	@FlyRefItem(name="Don't show help", value="N"),
	@FlyRefItem(name="Show Help", value="Y"),
})
	ShowHelp_List,
	//
	@FlyRefList(name="_YesNo", items={
	@FlyRefItem(name="是", value="Y"),
	@FlyRefItem(name="否", value="N"),
})
	_YesNo,
}