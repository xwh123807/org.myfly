package org.myfly.platform.visualpage3.webui;

import org.myfly.platform.visualpage3.define.FField;
import org.myfly.platform.visualpage3.webui.control.CheckBoxControl;
import org.myfly.platform.visualpage3.webui.control.DateControl;
import org.myfly.platform.visualpage3.webui.control.DateTimeControl;
import org.myfly.platform.visualpage3.webui.control.SelectControl;
import org.myfly.platform.visualpage3.webui.control.TextAreaControl;
import org.myfly.platform.visualpage3.webui.control.TextControl;
import org.myfly.platform.visualpage3.webui.control.TimeControl;
import org.myfly.platform.visualpage3.webui.control.UrlControl;

public class FieldControlFactory {
	/**
	 * 根据列定义获取对应控件
	 * 
	 * @param field
	 * @return
	 */
	public BaseFieldControl getControl(FField field, ViewMode viewMode) {
		BaseFieldControl result = null;
		switch (field.getDataType()) {
		case Date:
			result = new DateControl(field, viewMode);
			break;
		case Time:
			result = new TimeControl(field, viewMode);
			break;
		case DateTime:
			result = new DateTimeControl(field, viewMode);
			break;
		case String:
			result = new TextControl(field, viewMode);
			break;
		case Text:
		case LongText:
			result = new TextAreaControl(field, viewMode);
			break;
		case List:
			result = new SelectControl(field, viewMode);
			break;
		case YesNo:
			result = new CheckBoxControl(field, viewMode);
			break;
		case URL:
			result = new UrlControl(field, viewMode);
			break;
		default:
			break;
		}
		return result;
	}
}
