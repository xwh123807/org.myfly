package org.myfly.platform.tools.codebuilder;

import java.util.ArrayList;
import java.util.List;

public class ExportConstants {
	public static String[] EXPORT_CORE_TABLES = { "AD_EntityType", "AD_Table", "AD_Column", "AD_Reference",
			"AD_Ref_List", "AD_Ref_Table", "AD_Client", "AD_User", "AD_Org", "AD_OrgInfo", "AD_Role", "AD_Color",
			"AD_Element", "AD_EMailConfig", "EXP_Processor", "EXP_ProcessorParameter", "AD_Image", "AD_Language",
			"AD_ReplicationStrategy", "AD_Process", "AD_Process_Para", "AD_Process_Access", "AD_View_Definition",
			"AD_View", "AD_View_Column" };

	public static String[] EXPORT_VISUALPAGE_TABLES = { "AD_Window", "AD_Tab", "AD_Field", "AD_FieldGroup" };

	public static String[] EXPORT_REPORT_TABLES = { "AD_PrintTableFormat", "AD_PrintLabelLine", "AD_PrintLabel",
			"AD_PrintFormatItem", "AD_PrintColor", "AD_PrintPaper", "AD_PrintFormat", "AD_PrintForm", "AD_PrintGraph",
			"AD_PrintFont", "AD_ReportView", "AD_ReportView_Col" };

	public static PackageTable[] packageTables = {
			new PackageTable("org.myfly.platform.core3.model", EXPORT_CORE_TABLES),
			new PackageTable("org.myfly.platform.visualpage3.model", EXPORT_VISUALPAGE_TABLES),
			new PackageTable("org.myfly.platform.report.model", EXPORT_REPORT_TABLES) };

	public static String[] getElementTables() {
		List<String> list = new ArrayList<String>();
		for (PackageTable pt : packageTables) {
			for (String table : pt.getTableNames()) {
				list.add(table);
			}
		}
		return list.toArray(new String[] {});
	}

}
