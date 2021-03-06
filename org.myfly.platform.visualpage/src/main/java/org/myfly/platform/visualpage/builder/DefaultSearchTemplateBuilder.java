package org.myfly.platform.visualpage.builder;

import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.visualpage.service.VisualPageType;
import org.myfly.platform.visualpage.ui.view.SearchListViewRender;
import org.springframework.stereotype.Component;

/**
 * 用于实体搜索页面
 * @author xiangwanhong
 *
 */
@Component
public class DefaultSearchTemplateBuilder extends BaseTemplateBuilder{
	@Override
	public VisualPageType getType() {
		return VisualPageType.SEARCH;
	}
	
	@Override
	public String buildTemplateContent(String entityName, String name, ViewMode viewMode) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		SearchListViewRender searchListViewRender = new SearchListViewRender(entityName, ViewType.VIEW, name);
		return searchListViewRender.html();
	}

	@Override
	public String getDescription() {
		return "实体对象搜索模板";
	}
}
