package org.myfly.platform.core.visualpage.builder;

import org.myfly.platform.core.visualpage.ui.view.FormViewRender;
import org.myfly.platform.metamodel.define.ViewMode;
import org.myfly.platform.metamodel.define.ViewType;
import org.myfly.platform.metamodel.define.VisualPageType;
import org.myfly.platform.metamodel.utils.AssertUtil;
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
