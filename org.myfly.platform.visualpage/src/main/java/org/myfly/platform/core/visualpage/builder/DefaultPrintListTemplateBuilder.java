package org.myfly.platform.core.visualpage.builder;

import org.myfly.platform.core.visualpage.ui.view.ListViewRender;
import org.myfly.platform.metamodel.define.ViewMode;
import org.myfly.platform.metamodel.define.ViewType;
import org.myfly.platform.metamodel.define.VisualPageType;
import org.myfly.platform.metamodel.utils.AssertUtil;
import org.springframework.stereotype.Component;

/**
 * 用于实体列表打印页面
 * @author xiangwanhong
 *
 */
@Component
public class DefaultPrintListTemplateBuilder extends BaseTemplateBuilder {

	@Override
	public VisualPageType getType() {
		return VisualPageType.LISTPRINT;
	}

	@Override
	public String getDescription() {
		return "实体列表默认打印模板";
	}

	@Override
	public String buildTemplateContent(String entityName, String listViewName, ViewMode viewMode) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		ListViewRender listViewRender = new ListViewRender(entityName, ViewType.PRINT, viewMode, listViewName);
		return listViewRender.html();
	}
}
