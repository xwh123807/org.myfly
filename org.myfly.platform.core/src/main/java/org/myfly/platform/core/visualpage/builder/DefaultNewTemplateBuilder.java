package org.myfly.platform.core.visualpage.builder;

import org.myfly.platform.core.visualpage.service.ViewMode;
import org.myfly.platform.core.visualpage.service.ViewType;
import org.myfly.platform.core.visualpage.service.VisualPageType;
import org.myfly.platform.core.visualpage.ui.view.FormViewRender;
import org.springframework.stereotype.Component;

/**
 * 默认表单新增模板，用于实体新增页面
 * @author xiangwanhong
 *
 */
@Component
public class DefaultNewTemplateBuilder extends BaseTemplateBuilder{

	@Override
	public VisualPageType getType() {
		return VisualPageType.NEW;
	}

	@Override
	public String getDescription() {
		return "默认新增表单模板构建器";
	}

	@Override
	public String buildTemplateContent(String entityName, String formViewName, ViewMode viewMode) {
		FormViewRender render = new FormViewRender(entityName, ViewType.NEW, viewMode, formViewName);
		return render.html();
	}
}
