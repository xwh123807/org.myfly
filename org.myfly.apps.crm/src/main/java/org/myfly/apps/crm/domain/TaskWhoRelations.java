package org.myfly.apps.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.Task;
import org.myfly.platform.system.metadata.annotation.FieldView;
import org.myfly.platform.system.metadata.annotation.FlySearchRelation;
import org.myfly.platform.system.metadata.annotation.MetaDataView;
import org.myfly.platform.system.metadata.annotation.TableView;

/**
 * TaskWhoRelation represents the relationship between a task and a lead or
 * contacts. This derived object is a filtered version of the TaskRelation on
 * page 1455 object; that is, IsParent is true and IsWhat is false. It doesn’t
 * represent relationships to accounts, opportunities, or other objects.
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table
@MetaDataView(tableView=@TableView(commonSubTables={}))
public class TaskWhoRelations extends SBaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5384370885453213192L;
	/**
	 * Indicates the ID of the contacts or lead related to the task.
	 */
	@FieldView(title="相关项")
	@FlySearchRelation(entityNames="*")
	@Column
	private String relationId;
	/**
	 * Indicates the ID of the task.
	 */
	@FieldView(title="任务")
	@ManyToOne
	private Task task;
	/**
	 * Indicates whether the person related to the task is a lead or contact.
	 */
	@FieldView(title="类型")
	@Column
	private EnumValue type;
	public String getRelationId() {
		return relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public EnumValue getType() {
		return type;
	}
	public void setType(EnumValue type) {
		this.type = type;
	}
}
