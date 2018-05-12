package org.myfly.platform.visualpage.builder;

import org.myfly.platform.metamodel.domain.ViewMode;
import org.myfly.platform.metamodel.domain.ViewType;
import org.myfly.platform.metamodel.domain.VisualPageType;
import org.myfly.platform.metamodel.utils.AssertUtil;
import org.myfly.platform.visualpage.ui.view.ListViewRender;
import org.springframework.stereotype.Component;

/**
 * 用于实体列表查看页面
 * @author xiangwanhong
 *
 */
@Component
public class DefaultListTemplateBuilder extends BaseTemplateBuilder{
	@Override
	public VisualPageType getType() {
		return VisualPageType.LIST;
	}

	@Override
	public String buildTemplateContent(String entityName, String viewName, ViewMode viewMode) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		ListViewRender listViewRender = new ListViewRender(entityName, ViewType.VIEW, viewMode, viewName);
		return listViewRender.html();
	}

	@Override
	public String getDescription() {
		return "实体对象默认列表模板";
	}
}
