package org.myfly.platform.visualpage3.webui.control;

/**
 * 控件Vue模板
 * @author xiangwanhong
 *
 */
public class VueConstants {
	public static final String DATE_EDIT_HTML = "<el-date-picker type=\"date\" placeholder=\"{0}\" v-model=\"{1}\" style=\"width: 100%;\"></el-date-picker>";
	
	public static final String TIME_EDIT_HTML = "<el-time-picker type=\"fixed-time\" placeholder=\"{0}\" v-model=\"{1}\" style=\"width: 100%;\"></el-time-picker>";
	
	public static final String DATETIME_EDIT_HTML = "<el-date-picker type=\"datetime\" placeholder=\"{0}\" v-model=\"{1}\" style=\"width: 100%;\"></el-date-picker>";
	
	public static final String TEXT_EDIT_HTML = "<el-input placeholder=\"{0}\" v-model=\"{1}\"></el-input>";
	
	public static final String TEXTAREA_EDIT_HTML = "<el-input type=\"textarea\" placeholder=\"{0}\" v-model=\"{1}\"></el-input>";
	
	public static final String CHECKBOX_EDIT_HTML = "<el-switch placeholder=\"{0}\" v-model=\"{1}\"></el-switch>";
	
	public static final String EMAIL_EDIT_HTML = "<el-input type=\"email\" placeholder=\"{0}\" v-model=\"{1}\"></el-input>";
	
	public static final String PASSWORD_EDIT_HTML = "<el-input type=\"password\" placeholder=\"{0}\" v-model=\"{1}\"></el-input>";
	
	public static final String URL_EDIT_HTML = "<el-input type=\"url\" placeholder=\"{0}\" v-model=\"{1}\"></el-input>";
	
	public static final String SELECT_EDIT_HTML = "<el-select placeholder=\"{0}\" v-model=\"{1}\">{2}</el-select>";
	
	public static final String TABLE_VIEW_HTML = "<el-table :data=\"{0}\" style=\"width: 100%\" {1}>{2}</el-table>";
	
	public static final String COLUMN_VIEW_HTML = "<el-table-column prop=\"{0}\" label=\"{1}\"></el-table-column>";
}
