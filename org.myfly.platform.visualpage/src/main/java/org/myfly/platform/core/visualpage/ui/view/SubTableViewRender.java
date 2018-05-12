package org.myfly.platform.core.visualpage.ui.view;

import org.myfly.platform.core.visualpage.ui.control.EntityTableWidgetBoxRender;
import org.myfly.platform.metamodel.define.ListDefinition;
import org.myfly.platform.metamodel.define.ViewType;
import org.myfly.platform.metamodel.utils.AssertUtil;
import org.myfly.platform.metamodel.utils.HtmlUtils;

/**
 * 子表显示视图
 * 
 * @author xiangwanhong
 *
 */
public class SubTableViewRender extends BaseRender {
	private ListDefinition subTableDefinition;

	/**
	 * 当没有指定子表显示注解时，先取子表的ListView注解，如果也没有则显示全部字段
	 * 
	 * @param mtable
	 * @param subTableView
	 * @param attrName
	 */
	public SubTableViewRender(final ListDefinition subTableDefinition, final ViewType viewType) {
		super(viewType);
		AssertUtil.parameterEmpty(subTableDefinition, "SubTableViewRender.subTableDefinition");
		this.subTableDefinition = subTableDefinition;
	}

	public String html() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div" + HtmlUtils.addProperty("render", getClass().getName()) + ">");
		EntityTableWidgetBoxRender box = new EntityTableWidgetBoxRender(subTableDefinition, getViewType());
		buffer.append(box.html());
		buffer.append("</div>");
		return buffer.toString();
	}

}
