package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;

import org.myfly.platform.visualpage3.define.FField;
import org.myfly.platform.visualpage3.webui.BaseFieldControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

public class PasswordControl extends BaseFieldControl {

	public PasswordControl(FField field, ViewMode viewMode) {
		super(field, viewMode);
	}

	@Override
	public String htmlForEdit() {
		return MessageFormat.format(VueConstants.PASSWORD_EDIT_HTML, getPlaceholder(), getModel());
	}

	@Override
	public String htmlForView() {
		// TODO Auto-generated method stub
		return null;
	}

}
