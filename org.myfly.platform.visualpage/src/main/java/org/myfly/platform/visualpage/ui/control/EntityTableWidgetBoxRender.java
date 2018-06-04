package org.myfly.platform.visualpage.ui.control;

import org.myfly.platform.core.domain.EntityActionInfo;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.define.SubTableDefinition;
import org.myfly.platform.core.metadata.entity.EntityListDefinition;
import org.myfly.platform.visualpage.ui.WidgetBoxRender;

/**
 * 实体表格Widget Box
 * 
 * @author xiangwanhong
 *
 */
public class EntityTableWidgetBoxRender extends WidgetBoxRender {
	private EntityListDefinition listDefinition;
	private EntityActionInfo actionInfo;

	public EntityTableWidgetBoxRender(final EntityListDefinition listDefinition, final ViewType viewType) {
		super(listDefinition.getTitle(), viewType);
		this.listDefinition = listDefinition;
		String subTableAttr = listDefinition instanceof SubTableDefinition
				? ((SubTableDefinition) listDefinition).getSubTableAttr()
				: "";
		actionInfo = new EntityActionInfo(listDefinition.getParent().getEntityName(), "$!{obj.uid}", subTableAttr, "$!{obj.subuid}",
				null, listDefinition.getName(), null);
	}

	@Override
	public String getTableStyle() {
		return "padding:0px";
	}

	@Override
	public String getToolbarHtml() {
		return new EntityActionsTableRender(getViewType(), listDefinition.getListActions(), actionInfo).html();
	}

	@Override
	public String getContent() {
		if (ListStyle.TABLE.equals(listDefinition.getListStyle()) || ViewType.PRINT.equals(getViewType())) {
			// 表格显示模式
			EntityServerSideTableRender tableRender = EntityServerSideTableRender.getEntityTableRender(listDefinition,
					getViewType());
			tableRender.setHeader(listDefinition.getHeader());
			return tableRender.html();
		} else {
			// 卡片显示模式
			CardListRender cardListRender = new CardListRender(listDefinition);
			return cardListRender.html();
		}
	}
}
