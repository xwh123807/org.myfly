package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;

import org.myfly.platform.visualpage3.define.FField;
import org.myfly.platform.visualpage3.webui.BaseFieldControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

/**
 * 时间选择控件
 * 
 * @author xiangwanhong
 *
 */
public class TimeControl extends BaseFieldControl {

	public TimeControl(FField field, ViewMode viewMode) {
		super(field, viewMode);
	}

	@Override
	public String htmlForEdit() {
		String html = MessageFormat.format(VueConstants.TIME_EDIT_HTML, getPlaceholder(), getModel());
		return html;
	}

	@Override
	public String htmlForView() {
		// TODO Auto-generated method stub
		return null;
	}
}
