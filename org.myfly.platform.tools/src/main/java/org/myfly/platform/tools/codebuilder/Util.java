package org.myfly.platform.tools.codebuilder;

public class Util {
	/**
	 * AD_Table\AD_Ref_List
	 * @param tableName
	 * @return
	 */
	public static String toTableName(String tableName) {
		String name = tableName;
		if (name.startsWith("AD_")) {
			name = name.substring(3);
		}
		return "PT_" + name;
	}
	
	/**
	 * AD_Table\AD_Ref_List
	 * @param tableName
	 * @return
	 */
	public static String toTableApiName(String tableName) {
		String name = tableName;
		if (name.startsWith("AD_")) {
			name = name.substring(3);
		}
		name = name.replaceAll("_", "");
		return "P" + name;
	}

	/**
	 * AD_Chart_ID\AccessLevel\ACTriggerLength\AD_Ref_List_ID\Allow_Info_Product\IsCanExport
	 * 
	 * @param columnName
	 * @return
	 */
	public static String toFieldApiName(String columnName) {
		String name = columnName;
		if (name.startsWith("AD_")) {
			name = name.substring(3);
		}
		name = name.replaceAll("_", "");
		name = name.substring(0, 1).toLowerCase() + name.substring(1);
		return name;
	}
	
	/**
	 * 
	 * @param columnName
	 * @return
	 */
	public static String toFieldName(String columnName) {
		String name = columnName;
		if (name.startsWith("AD_")) {
			name = name.substring(3);
		}
		return name;
	}
}
