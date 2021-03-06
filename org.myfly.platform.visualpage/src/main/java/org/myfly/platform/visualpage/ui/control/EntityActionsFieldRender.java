package org.myfly.platform.visualpage.ui.control;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.domain.EntityActionInfo;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.annotation.EntityAction;
import org.myfly.platform.core.utils.EntityLinkUtil;
import org.myfly.platform.visualpage.ui.view.BaseRender;

/**
 * 实体操作工具条
 * 
 * @author xiangwanhong
 *
 */
public class EntityActionsFieldRender extends BaseRender {

	private EntityAction[] actionDenifitions;
	private EntityActionInfo actionInfo;

	public EntityActionsFieldRender(ViewType viewType, EntityAction[] actionDenifitions, EntityActionInfo actionInfo) {
		super(viewType);
		this.setActionDenifitions(actionDenifitions);
		this.setActionInfo(actionInfo);
	}

	@Override
	public String html() {
		return getActionInfo().isSubTableScene() ? getSubEntityActionsBar() : getEntityActionsBar();
	}

	/**
	 * 实体主表操作工具条
	 * 
	 * @return
	 */
	public String getEntityActionsBar() {
		StringBuffer buffer = new StringBuffer();
		if (ArrayUtils.isNotEmpty(getActionDenifitions())) {
			for (EntityAction acitonDenifition : getActionDenifitions()) {
				buffer.append(EntityLinkUtil.getEntityActionLinkHtml(acitonDenifition, getActionInfo().getTableName(),
						getActionInfo().getUid(), null, getActionInfo().getView(), true, false));
			}
		}
		return buffer.toString();
	}

	/**
	 * 实体子表操作工具条
	 * 
	 * @return
	 */
	public String getSubEntityActionsBar() {
		StringBuffer buffer = new StringBuffer();
		if (ArrayUtils.isNotEmpty(getActionDenifitions())) {
			for (EntityAction acitonDenifition : getActionDenifitions()) {
				buffer.append(EntityLinkUtil.getSubEntityActionLinkHtml(acitonDenifition, getActionInfo().getTableName(),
						getActionInfo().getUid(), getActionInfo().getSubTableAttr(), getActionInfo().getSubUid(), null,
						getActionInfo().getView(), true, false));
			}
		}
		return buffer.toString();
	}

	public EntityAction[] getActionDenifitions() {
		return actionDenifitions;
	}

	public void setActionDenifitions(EntityAction[] actionDenifitions) {
		this.actionDenifitions = actionDenifitions;
	}

	public EntityActionInfo getActionInfo() {
		return actionInfo;
	}

	public void setActionInfo(EntityActionInfo actionInfo) {
		this.actionInfo = actionInfo;
	}

}
