package org.myfly.platform.core.visualpage.ui.control.button;

import org.myfly.platform.core.visualpage.ui.BaseButtonRender;
import org.myfly.platform.metamodel.utils.HttpUtil;
import org.springframework.web.bind.annotation.RequestMethod;

public class SaveAndNewSubmitButtonRender extends BaseButtonRender {
	@Override
	public String html() {
		return "<button class=\"btn btn-default\" type=\"button\" name=\"" + HttpUtil.MYMETHOD_NAME + "\"  value=\""
				+ RequestMethod.PATCH + "\" onclick=\"javascript:formSubmit(event)\">保存并新增</button>";
	}
}
