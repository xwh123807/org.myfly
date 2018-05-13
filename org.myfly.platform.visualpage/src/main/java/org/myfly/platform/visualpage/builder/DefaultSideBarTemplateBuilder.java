package org.myfly.platform.visualpage.builder;

import org.myfly.platform.visualpage.service.VisualPageType;
import org.myfly.platform.visualpage.ui.BaseRender;
import org.springframework.stereotype.Component;

@Component
public class DefaultSideBarTemplateBuilder extends BaseTemplateBuilder {

	@Override
	public VisualPageType getType() {
		return VisualPageType.RENDER;
	}

	@Override
	public String getDescription() {
		return "自定义子页面";
	}

	@Override
	public String buildTemplateContent(BaseRender render) {
		if (render != null) {
			return render.html();
		} else {
			return "";
		}
	}
}
