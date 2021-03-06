package org.myfly.platform.visualpage.ui.view;

import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.entity.EntityListDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.visualpage.ui.control.CardListRender;
import org.myfly.platform.visualpage.ui.control.SearchBoxRender;

/**
 * 搜索结果显示
 * 
 * @author xiangwanhong
 *
 */
public class SearchListViewRender extends BaseRender {
	private String name;
	private String entityName;
	private EntityMetaData entityMetaData;
	private EntityListDefinition listDefinition;
	private CardListRender cardListRender;

	public SearchListViewRender(final String entityName, ViewType viewType, final String name) {
		super(viewType);
		this.entityName = entityName;
		this.name = name;
	}

	@Override
	public String html() {
		entityMetaData = getEntityMataData(this.entityName);
		listDefinition = entityMetaData.getListDefinition(this.name);
		cardListRender = new CardListRender(listDefinition);
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
