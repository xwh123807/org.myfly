package org.myfly.platform.core.visualpage.ui.control.button;

import org.myfly.platform.core.visualpage.ui.BaseButtonRender;
import org.myfly.platform.metamodel.utils.HttpUtil;
import org.springframework.web.bind.annotation.RequestMethod;

public class UpdateSaveSubmitButtonRender extends BaseButtonRender {
	@Override
	public String html() {
		return "<button class=\"btn btn-primary\" type=\"button\" name=\"" + HttpUtil.MYMETHOD_NAME
				+ "\"  value=\"" + RequestMethod.PUT + "\" onclick=\"javascript:formSubmit(event)\">保存</button>";
	}
}
