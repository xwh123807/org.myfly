package org.myfly.apps.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.Task;
import org.myfly.platform.system.metadata.annotation.FieldView;
import org.myfly.platform.system.metadata.annotation.FlySearchRelation;
import org.myfly.platform.system.metadata.annotation.MetaDataView;
import org.myfly.platform.system.metadata.annotation.TableView;

/**
 * Represents the relationship between a task and a lead, contacts, and other
 * objects related to the task. If Shared Activities is enabled, this object
 * doesn’t support triggers, workflow, or data validation rules.
 * 
 * 
 * 
 * @author xiangwanhong
 *
 */
@Table
@Entity
@MetaDataView(tableView=@TableView(commonSubTables={}))
public class TaskRelation extends SBaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2826896440720756018L;
	/**
	 * Indicates the Account ID of the relation.
	 */
	@FieldView(title = "客户")
	@FlySearchRelation(entityNames="Account")
	@Column
	private String accountId;
	/**
	 * Indicates whether the relation is an Account, Opportunity, Campaign,
	 * Case, other standard object, or a custom object. Value is false if
	 * RelationId is a contact or lead and true otherwise.
	 */
	@FieldView(title="isWhat")
	@Column
	private boolean what;
	/**
	 * Indicates the WhatId or WhoId in the relationship. For more information,
	 * see Task.
	 */
	@FieldView(title="相关项")
	@FlySearchRelation(entityNames="*")
	@Column
	private String relationId;
	/**
	 * Represents the ID of the associated Task.
	 */
	@FieldView(title="任务")
	@ManyToOne
	private Task task;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
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
	public boolean isWhat() {
		return what;
	}
	public void setWhat(boolean what) {
		this.what = what;
	}
}
