package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;

import org.myfly.platform.visualpage3.define.FField;
import org.myfly.platform.visualpage3.webui.BaseFieldControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

public class EmailControl extends BaseFieldControl {

	public EmailControl(FField field, ViewMode viewMode) {
		super(field, viewMode);
	}

	@Override
	public String htmlForEdit() {
		return MessageFormat.format(VueConstants.EMAIL_EDIT_HTML, getPlaceholder(), getModel());
	}

	@Override
	public String htmlForView() {
		// TODO Auto-generated method stub
		return null;
	}

}
