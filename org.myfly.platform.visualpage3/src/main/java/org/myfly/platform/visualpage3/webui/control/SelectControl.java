package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;

import org.myfly.platform.visualpage3.define.FField;
import org.myfly.platform.visualpage3.webui.BaseFieldControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

public class SelectControl extends BaseFieldControl {

	public SelectControl(FField field, ViewMode viewMode) {
		super(field, viewMode);
	}

	@Override
	public String htmlForEdit() {
		String html = MessageFormat.format(VueConstants.SELECT_EDIT_HTML, getPlaceholder(), getModel(), getOptions());
		return html;
	}

	public String getOptions() {
		return "<el-option label=\"DEMO一\" value=\"demo1\"></el-option>"
				+ "<el-option label=\"DEMO二\" value=\"demo2\"></el-option>";
	}

	@Override
	public String htmlForView() {
		// TODO Auto-generated method stub
		return null;
	}
}
