package org.myfly.platform.visualpage.ui.view;

import org.myfly.platform.metamodel.define.ListDefinition;
import org.myfly.platform.metamodel.domain.EntityMetaData;
import org.myfly.platform.metamodel.domain.ViewType;
import org.myfly.platform.metamodel.utils.HtmlUtils;
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
	private ListDefinition listDefinition;
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
