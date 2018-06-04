package org.myfly.platform.visualpage.ui.control;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.domain.EntityActionInfo;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.annotation.EntityAction;
import org.myfly.platform.core.utils.EntityUrlUtil;
import org.myfly.platform.core.utils.HtmlUtils;

/**
 * 表格操作工具条
 * 
 * @author xiangwanhong
 *
 */
public class EntityActionsTableRender extends EntityActionsFieldRender {

	public EntityActionsTableRender(ViewType viewType, EntityAction[] actionDenifitions, EntityActionInfo actionInfo) {
		super(viewType, actionDenifitions, actionInfo);
	}

	/**
	 * 获取实体操作工具条
	 */
	@Override
	public String getEntityActionsBar() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<span" + HtmlUtils.addPropertys(new String[] { "class", "render" },
				new String[] { "widget-toolbar", getClass().getName() }) + ">");
		if (ArrayUtils.isNotEmpty(getActionDenifitions())) {
			for (EntityAction acitonDenifition : getActionDenifitions()) {
				String url = EntityUrlUtil.getEntityActionUrl(acitonDenifition, getActionInfo().getTableName(),
						getActionInfo().getUid(), getActionInfo().getView());
				buffer.append("<input type='button' value='" + acitonDenifition.getTitle()
						+ "' onclick='javascript:openModal(\"" + url + "\", true)'/>");
			}
		}
		buffer.append("</span>");
		return buffer.toString();
	}

	/**
	 * 获取实体子表操作工具条
	 */
	@Override
	public String getSubEntityActionsBar() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<span" + HtmlUtils.addPropertys(new String[] { "class", "render" },
				new String[] { "widget-toolbar", getClass().getName() }) + ">");
		if (ArrayUtils.isNotEmpty(getActionDenifitions())) {
			for (EntityAction acitonDenifition : getActionDenifitions()) {
				String url = EntityUrlUtil.getSubEntityActionUrl(acitonDenifition, getActionInfo().getTableName(),
						getActionInfo().getUid(), getActionInfo().getSubTableAttr(), getActionInfo().getSubUid(), getActionInfo().getView());
				buffer.append("<input type='button' value='" + acitonDenifition.getTitle()
						+ "' onclick='javascript:openModal(\"" + url + "\", false)'/>");
			}
		}
		buffer.append("</span>");
		return buffer.toString();
	}
}
