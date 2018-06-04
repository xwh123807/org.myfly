package org.myfly.platform.core.metadata.entity;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.EntityAction;
import org.myfly.platform.core.metadata.entity.handler.EntityActionsFieldValueHandler;

/**
 * 实体操作集字段，用于定义实体的增、删、改操作
 * 
 * @author xiangwanhong
 *
 */
public class EntityActionsFieldDefinition extends EntityFieldDefinition {
	/**
	 * 可执行的操作集
	 */
	private EntityAction[] actions;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1413726443052399785L;

	/**
	 * 
	 * @param actions
	 */
	public EntityActionsFieldDefinition(EntityAction[] actions) {
		setName("actions");
		setTitle("操作");
		setType(String.class);
		setDataType(FieldDataType.ACTIONS);
		setActions(actions);
		setValueHandler(new EntityActionsFieldValueHandler(this));
	}

	public EntityAction[] getActions() {
		return actions;
	}

	public void setActions(EntityAction[] actions) {
		this.actions = actions;
	}
}
