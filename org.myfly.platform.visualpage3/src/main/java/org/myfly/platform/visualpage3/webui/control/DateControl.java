package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;

import org.myfly.platform.visualpage3.define.FField;
import org.myfly.platform.visualpage3.webui.BaseFieldControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

/**
 * 日期选择控件
 * 
 * @author xiangwanhong
 *
 */
public class DateControl extends BaseFieldControl {

	public DateControl(FField field, ViewMode viewMode) {
		super(field, viewMode);
	}

	@Override
	public String htmlForEdit() {
		String html = MessageFormat.format(VueConstants.DATE_EDIT_HTML, getPlaceholder(), getModel());
		return html;
	}

	@Override
	public String htmlForView() {
		return null;
	}
}
