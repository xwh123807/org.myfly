package org.myfly.platform.core.visualpage.ui.view;

import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.internal.EntityMetaData;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.core.visualpage.ui.ViewType;
import org.myfly.platform.core.visualpage.ui.control.CardListRender;
import org.myfly.platform.core.visualpage.ui.control.SearchBoxRender;

/**
 * 搜索结果显示
 * 
 * @author xiangwanhong
 *
 */
public class SearchListViewRender extends BaseRender {
	private String name;
	private String entityName;

	public SearchListViewRender(final String entityName, ViewType viewType, final String name) {
		super(viewType);
		this.entityName = entityName;
		this.name = name;
	}

	@Override
	public String html() {
		EntityMetaData entityMetaData = getEntityMataData(this.entityName);
		ListDefinition listDefinition = entityMetaData.getListDefinition(this.name);
		CardListRender cardListRender = new CardListRender(listDefinition);
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div" + HtmlUtils.addPropertys(new String[] { "render" }, new String[] { getClass().getName() })
				+ ">");
		buffer.append(new SearchBoxRender().html());
		buffer.append("<div class='col-xs-12'>");
		buffer.append(cardListRender.html());
		buffer.append("</div>");
		buffer.append("</div>");
		return buffer.toString();
	}
}
