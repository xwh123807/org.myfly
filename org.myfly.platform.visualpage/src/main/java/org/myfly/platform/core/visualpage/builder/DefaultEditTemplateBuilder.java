package org.myfly.platform.core.visualpage.builder;

import org.myfly.platform.core.visualpage.ui.view.FormViewRender;
import org.myfly.platform.metamodel.define.ViewMode;
import org.myfly.platform.metamodel.define.ViewType;
import org.myfly.platform.metamodel.define.VisualPageType;
import org.springframework.stereotype.Component;

/**
 * 默认编辑表单模板构建器，用于实体编辑页面
 * @author xiangwanhong
 *
 */
@Component
public class DefaultEditTemplateBuilder extends BaseTemplateBuilder{

	@Override
	public VisualPageType getType() {
		return VisualPageType.EDIT;
	}

	@Override
	public String getDescription() {
		return "默认编辑表单模板构建器";
	}

	@Override
	public String buildTemplateContent(String entityName, String viewName, final ViewMode viewMode) {
		FormViewRender render = new FormViewRender(entityName, ViewType.EDIT, viewMode, viewName);
		return render.html();
	}
}
