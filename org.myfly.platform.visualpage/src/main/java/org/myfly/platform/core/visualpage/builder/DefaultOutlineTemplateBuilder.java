package org.myfly.platform.core.visualpage.builder;

import org.myfly.platform.core.visualpage.ui.view.OutlineViewRender;
import org.myfly.platform.metamodel.define.ViewMode;
import org.myfly.platform.metamodel.define.ViewType;
import org.myfly.platform.metamodel.define.VisualPageType;
import org.springframework.stereotype.Component;

/**
 * 用于实体摘要视图页面
 * @author xiangwanhong
 *
 */
@Component
public class DefaultOutlineTemplateBuilder extends BaseTemplateBuilder{

	@Override
	public VisualPageType getType() {
		return VisualPageType.OUTLINE;
	}

	@Override
	public String getDescription() {
		return "默认大纲表单模板构建器";
	}

	@Override
	public String buildTemplateContent(String entityName, String formViewName, ViewMode viewMode) {
		OutlineViewRender render = new OutlineViewRender(entityName, ViewType.VIEW, viewMode, formViewName);
		return render.html();
	}
}
