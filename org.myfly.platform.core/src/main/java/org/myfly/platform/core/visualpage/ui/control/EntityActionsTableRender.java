package org.myfly.platform.core.visualpage.ui.control;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.utils.EntityUrlUtil;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.core.visualpage.ui.EntityAction;
import org.myfly.platform.core.visualpage.ui.EntityActionInfo;
import org.myfly.platform.core.visualpage.ui.ViewType;

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

	@Override
	public String getEntityActionsBar() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<span" + HtmlUtils.addPropertys(new String[] { "class", "render" },
				new String[] { "widget-toolbar", getClass().getName() }) + ">");
		if (ArrayUtils.isNotEmpty(getActionDenifitions())) {
			for (EntityAction acitonDenifition : getActionDenifitions()) {
				String url = EntityUrlUtil.getEntityActionUrl(acitonDenifition, getActionInfo().tableName,
						getActionInfo().uid, null);
				buffer.append("<input type='button' value='" + acitonDenifition.getTitle()
						+ "' onclick='javascript:openModal(\"" + url + "\", false)'/>");
			}
		}
		buffer.append("</span>");
		return buffer.toString();
	}

	@Override
	public String getSubEntityActionsBar() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<span" + HtmlUtils.addPropertys(new String[] { "class", "render" },
				new String[] { "widget-toolbar", getClass().getName() }) + ">");
		if (ArrayUtils.isNotEmpty(getActionDenifitions())) {
			for (EntityAction acitonDenifition : getActionDenifitions()) {
				String url = EntityUrlUtil.getSubEntityActionUrl(acitonDenifition, getActionInfo().tableName,
						getActionInfo().uid, getActionInfo().subTableAttr, getActionInfo().subUid, null);
				buffer.append("<input type='button' value='" + acitonDenifition.getTitle()
						+ "' onclick='javascript:openModal(\"" + url + "\", false)'/>");
			}
		}
		buffer.append("</span>");
		return buffer.toString();
	}
}
