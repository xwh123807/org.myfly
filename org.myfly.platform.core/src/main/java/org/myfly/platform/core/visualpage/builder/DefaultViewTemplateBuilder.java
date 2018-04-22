package org.myfly.platform.core.visualpage.builder;

import org.myfly.platform.core.visualpage.service.VisualPageType;
import org.myfly.platform.core.visualpage.ui.ViewMode;
import org.myfly.platform.core.visualpage.ui.ViewType;
import org.myfly.platform.core.visualpage.ui.view.FormViewRender;
import org.springframework.stereotype.Component;

/**
 * 默认只读表单模板构建器，用于实体查看页面
 * @author xiangwanhong
 *
 */
@Component
public class DefaultViewTemplateBuilder extends BaseTemplateBuilder{

	@Override
	public VisualPageType getType() {
		return VisualPageType.VIEW;
	}

	@Override
	public String getDescription() {
		return "默认只读表单模板构建器";
	}

	@Override
	public String buildTemplateContent(String entityName, String formViewName, ViewMode viewMode) {
		FormViewRender render = new FormViewRender(entityName, ViewType.VIEW, viewMode, formViewName);
		return render.html();
	}
}
