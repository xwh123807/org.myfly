package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;

import org.myfly.platform.visualpage3.define.FField;
import org.myfly.platform.visualpage3.webui.BaseFieldControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

public class TextAreaControl extends BaseFieldControl {

	public TextAreaControl(FField field, ViewMode viewMode) {
		super(field, viewMode);
	}

	@Override
	public String htmlForEdit() {
		String html = MessageFormat.format(VueConstants.TEXTAREA_EDIT_HTML, getPlaceholder(), getModel());
		return html;
	}

	@Override
	public String htmlForView() {
		return null;
	}

}
