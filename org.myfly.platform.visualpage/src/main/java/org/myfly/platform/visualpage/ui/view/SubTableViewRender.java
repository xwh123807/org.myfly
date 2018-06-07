package org.myfly.platform.visualpage.ui.view;

import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.entity.EntitySubTableDefinition;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.visualpage.ui.control.EntityTableWidgetBoxRender;

/**
 * 子表显示视图
 * 
 * @author xiangwanhong
 *
 */
public class SubTableViewRender extends BaseRender {
	private EntitySubTableDefinition subTableDefinition;

	/**
	 * 当没有指定子表显示注解时，先取子表的ListView注解，如果也没有则显示全部字段
	 * 
	 * @param mtable
	 * @param subTableView
	 * @param attrName
	 */
	public SubTableViewRender(final EntitySubTableDefinition subTableDefinition, final ViewType viewType) {
		super(viewType);
		AssertUtil.parameterEmpty(subTableDefinition, "SubTableViewRender.subTableDefinition");
		this.subTableDefinition = subTableDefinition;
	}

	public String html() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(
				"<div" + HtmlUtils.addPropertys(new String[] { "render", "subTableAttr", "labelField", "refName" },
						new String[] { getClass().getName(), subTableDefinition.getSubTableAttr(),
								subTableDefinition.getLabelField(), subTableDefinition.getRefName() })
						+ ">");
		EntityTableWidgetBoxRender box = new EntityTableWidgetBoxRender(subTableDefinition, getViewType());
		buffer.append(box.html());
		buffer.append("</div>");
		return buffer.toString();
	}

}
