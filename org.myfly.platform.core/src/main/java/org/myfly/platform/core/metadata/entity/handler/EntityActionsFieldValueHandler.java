package org.myfly.platform.core.metadata.entity.handler;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.EntityActionInfo;
import org.myfly.platform.core.metadata.annotation.EntityAction;
import org.myfly.platform.core.metadata.entity.EntityActionsFieldDefinition;
import org.myfly.platform.core.utils.EntityLinkUtil;

/**
 * 操作集字段
 * 
 * @author xiangwanhong
 *
 */
public class EntityActionsFieldValueHandler implements IFieldValueHandler {
	private EntityActionsFieldDefinition field;

	public EntityActionsFieldDefinition getField() {
		return field;
	}

	public void setField(EntityActionsFieldDefinition field) {
		this.field = field;
	}

	public EntityActionsFieldValueHandler(EntityActionsFieldDefinition field) {
		setField(field);
	}

	@Override
	public Object getFieldValue(Object entity) {
		if (entity instanceof EntityActionInfo) {
			EntityActionInfo actionInfo = (EntityActionInfo) entity;
			StringBuffer buffer = new StringBuffer();
			if (StringUtils.isBlank(actionInfo.getSubTableAttr())) {
				for (EntityAction action : field.getActions()) {
					String url = EntityLinkUtil.getEntityActionLinkHtml(action, actionInfo.getTableName(),
							actionInfo.getUid(), action.getTitle(), actionInfo.getView(), false, false);
					buffer.append(url);
				}
			} else {
				// 子表
				for (EntityAction action : field.getActions()) {
					String url = EntityLinkUtil.getSubEntityActionLinkHtml(action, actionInfo.getTableName(),
							actionInfo.getUid(), actionInfo.getSubTableAttr(), actionInfo.getSubUid(),
							action.getTitle(), actionInfo.getView(), false, false);
					buffer.append(url);
				}
			}
			return buffer.toString();
		} else {
			throw new IllegalArgumentException("参数必须是EntityActionInfo类型.");
		}
	}

	@Override
	public void setFieldValue(Object entity, Object value) {
		throw new RuntimeException("Actinos属性不支持setFieldValue方法.");
	}

}
