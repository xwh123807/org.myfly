package org.myfly.platform.tools.codebuilder;

import org.apache.commons.lang3.ArrayUtils;

public class ExportConstants {
	public static String[] EXPORT_CORE_TABLES = { "AD_EntityType", "AD_Table", "AD_Column", "AD_Reference",
			"AD_Ref_List", "AD_Ref_Table", "AD_Client", "AD_User", "AD_Org", "AD_OrgInfo", "AD_Role", "AD_Window",
			"AD_Tab", "AD_Field", "AD_FieldGroup", "AD_Color", "AD_Element", "AD_EMailConfig", "EXP_Processor",
			"EXP_ProcessorParameter", "AD_Image", "AD_Language", "AD_ReplicationStrategy", "AD_Process",
			"AD_Process_Para", "AD_Process_Access" };

	public static String[] EXPORT_REPORT_TABLES = { "AD_Print_Color", "AD_Print_Font", "AD_Print_Format",
			"AD_Print_Paper", "AD_Print_Table_Format", "AD_Report_View", "AD_Report_View_Col" };

	public static String[] getElementTables() {
		return ArrayUtils.addAll(EXPORT_CORE_TABLES, EXPORT_REPORT_TABLES);
	}
}
