package org.myfly.platform.visualpage.builder;

import org.myfly.platform.metamodel.domain.ViewMode;
import org.myfly.platform.metamodel.domain.ViewType;
import org.myfly.platform.metamodel.domain.VisualPageType;
import org.myfly.platform.metamodel.utils.AssertUtil;
import org.myfly.platform.visualpage.ui.view.FormViewRender;
import org.springframework.stereotype.Component;

/**
 * 用于实体单屏打印页面
 * @author xiangwanhong
 *
 */
@Component
public class DefaultPrintTemplateBuilder extends BaseTemplateBuilder {

	@Override
	public VisualPageType getType() {
		return VisualPageType.PRINT;
	}

	@Override
	public String getDescription() {
		return "实体默认打印模板";
	}

	@Override
	public String buildTemplateContent(String entityName, String formViewName, ViewMode viewMode) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		FormViewRender render = new FormViewRender(entityName, ViewType.PRINT, viewMode, formViewName);
		return render.html();
	}
}
