package org.myfly.platform.visualpage.builder;

import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.visualpage.service.VisualPageType;
import org.myfly.platform.visualpage.ui.view.ListOutlineViewRender;
import org.springframework.stereotype.Component;

@Component
public class DefaultListOutlineTemplateBuilder extends BaseTemplateBuilder{

	@Override
	public VisualPageType getType() {
		return VisualPageType.LISTOUTLINE;
	}

	@Override
	public String getDescription() {
		return "默认大纲列表模板构建器";
	}

	@Override
	public String buildTemplateContent(String entityName, String formViewName, ViewMode viewMode) {
		ListOutlineViewRender render = new ListOutlineViewRender(entityName, formViewName, viewMode);
		return render.html();
	}
}
