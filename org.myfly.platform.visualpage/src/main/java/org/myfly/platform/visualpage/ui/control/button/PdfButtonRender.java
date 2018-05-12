package org.myfly.platform.visualpage.ui.control.button;

import org.myfly.platform.visualpage.ui.BaseButtonRender;

public class PdfButtonRender extends BaseButtonRender {
	@Override
	public String html() {
		return "<button class=\"btn btn-default\" type=\"button\">导出PDF</button>";
	}
}
