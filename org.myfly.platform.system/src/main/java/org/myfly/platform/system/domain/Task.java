package org.myfly.platform.system.domain;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FlySearchRelation;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;

/**
 * 任务
 * 
 * 上次修改人 LastModifiedById 查找(用户)<br>
 * 主题 Subject 选项列表 显示更多信息 <br>
 * 任务子类型 TaskSubtype 选项列表 <br>
 * 优先级 Priority 选项列表 显示更多信息 <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 到期日期 ActivityDate 日期/时间 <br>
 * 名称 WhoId 查找(联系人,潜在客户) <br>
 * 周期间隔 RecurrenceInterval 数字(9, 0) <br>
 * 呼叫持续时间 CallDurationInSeconds 数字(8, 0) <br>
 * 状态 Status 选项列表 显示更多信息 <br>
 * 电子邮件 Email 电子邮件 <br>
 * 电话 Phone 电话 <br>
 * 电话对象标识符 CallObject 文本(255) <br>
 * 电话类型 CallType 选项列表 <br>
 * 电话结果 CallDisposition 文本(255) <br>
 * 留言 Description 长文本区(32000) <br>
 * 相关项 WhatId 查找(合同,订单,市场活动,客户,业务机会,产品,资产,个案,解决方案,报价) <br>
 * 类型 Type 选项列表 显示更多信息 <br>
 * 被分配人 OwnerId 查找(用户,日历) <br>
 * 重复此任务 RecurrenceRegeneratedType 选项列表<br>
 * 
 * @author xiangwanhong
 */
@Table(schema = SchemaConstants.PB)
@Entity
@MetaDataView(
//
tableView = @TableView(title = "任务", commonSubTables={}) ,
//
formViews = {
		//
		@FormView(name = "call", sections = {
				//
				@SectionView(title = "电话", fieldSets = @FieldSetView(fields = { "name", "description", "whoId",
						"whatId" }) ) }),
		//
		@FormView(name = "email", sections = {
				//
				@SectionView(title = "电子邮件", fieldSets = @FieldSetView(fields = { "name", "email" }) ) }),
		//
		@FormView(name = "event", sections = {
				//
				@SectionView(title = "事件", fieldSets = @FieldSetView(fields = {"name", "description"}) ) }),
		//
		@FormView(name = "task") },
		//
		listViews = { @ListView(name = "default", fields = { "name", "accountId", "phone", "email", "ownerId" }) })
public class Task extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2719441202296774306L;

	/**
	 * Provides standard subtypes to facilitate creating and searching for
	 * specific task subtypes. This field isn’t updateable.TaskSubtype values: •
	 * Task • Email • Call
	 */
	@FieldView(title = "任务子类型")
	@Column
	@Enumerated(EnumType.STRING)
	private TaskSubtype taskSubtype;

	@FieldView(title = "优先级")
	@Column
	private EnumValue priority;

	@FieldView(title = "到期日期")
	@Column
	private Date activityDate;

	/**
	 * 查找(联系人,潜在客户)
	 */
	@FieldView(title = "名称")
	@Column
	@FlySearchRelation(entityNames = "Contact")
	private String whoId;

	@FieldView(title = "周期间隔")
	@Column
	private Long recurrenceInterval;

	@FieldView(title = "呼叫持续时间")
	@Column
	private Long callDurationInSeconds;

	@FieldView(title = "状态")
	@Column
	private EnumValue status;

	@FieldView(title = "电子邮件", dataType = FieldDataType.EMAIL)
	@Column
	private String email;

	@FieldView(title = "电话", dataType = FieldDataType.TELPHONE)
	@Column
	private String phone;

	@FieldView(title = "电话对象标识符")
	@Column
	private String callObject;

	@FieldView(title = "电话类型")
	@Column
	private EnumValue callType;

	@FieldView(title = "电话结果")
	@Column
	private String callDisposition;

	@FieldView(title = "留言")
	@Column
	private String description;
	/**
	 * 查找(合同,订单,市场活动,客户,业务机会,产品,资产,个案,解决方案,报价)
	 */
	@FieldView(title = "相关项")
	@Column
	private String whatId;

	/**
	 * The type of task, such as Call or Meeting.
	 */
	@FieldView(title = "类型")
	@Column
	private EnumValue type;
	/**
	 * 查找(用户,日历)
	 */
	@FieldView(title = "被分配人")
	@Column
	private String ownerId;

	/**
	 * Represents the ID of the related Account. The AccountId is determined as
	 * follows. If the value of WhatId is any of the following objects, then
	 * Salesforce uses that object’s AccountId.If the value of the WhatIdfield
	 * is any other object, and the value of the WhoId field is a Contact
	 * object, then Salesforce uses that contact’s AccountId. (If your
	 * organization uses Shared Activities, then Salesforce uses the AccountId
	 * of the primary contact.)
	 */
	@FieldView(title = "客户")
	@FlySearchRelation(entityNames = "Account")
	@Column
	private String accountId;

	/**
	 * ID of the PartnerNetworkConnection that shared this record with your
	 * organization. This field is only available if you have enabled Salesforce
	 * to Salesforce.
	 */
	@Column
	private String connectionReceivedId;

	/**
	 * ID of the PartnerNetworkConnection that you shared this record with. This
	 * field is only available if you have enabled Salesforce to Salesforce.
	 * Beginning with API version 15.0, the ConnectionSentId field is no longer
	 * supported. The ConnectionSentId field is still visible, but the value is
	 * null. You can use the new PartnerNetworkRecordConnection object to
	 * forward records to connections.
	 */
	@Column
	private String connectionSentId;

	/**
	 * Represents what triggers a repeating task to repeat. Add this field to a
	 * page layout together with the RecurrenceInterval field, which determines
	 * the number of days between the triggering date (due date or close date)
	 * and the due date of the next repeating task in the series. Label is
	 * Repeat This Task. This field has the following picklist values: • None:
	 * The task doesn’t repeat. • After due date: The next repeating task will
	 * be due the specified number of days after the current task’s due date. •
	 * After the task is closed: The next repeating task will be due the
	 * specified number of days after the current task is closed. • (Task
	 * closed): This task, now closed, was opened as part of a repeating series.
	 */
	@FieldView(title = "重复此任务")
	@Column
	private EnumValue recurrenceRegeneratedType;

	/**
	 * Indicates whether the event has been archived.
	 */
	@FieldView(title = "已归档")
	@Column
	private Boolean isArchived;
	/**
	 * Indicates whether the task has been completed (true) or not (false). Is
	 * only set indirectly via the Status picklist. Label is Closed.
	 */
	@FieldView(title = "已关闭")
	@Column
	private Boolean isClosed;
	/**
	 * Indicates a high-priority task. This field is derived from the Priority
	 * field.
	 */
	@FieldView(title = "高优先级")
	@Column
	private Boolean isHighPriority;
	/**
	 * Indicates whether the task is scheduled to repeat itself (true) or only
	 * occurs once (false). This is a read-only field on update, but not on
	 * create. If this field value is true, then RecurrenceStartDateOnly,
	 * RecurrenceEndDateOnly, RecurrenceType, and any recurrence fields
	 * associated with the given recurrence type must be populated. See
	 * Recurring Tasks.
	 */
	@FieldView(title = "循环任务")
	@Column
	private Boolean isRecurrence;
	/**
	 * Indicates whether a popup reminder has been set for the task (true) or
	 * not (false).
	 */
	@FieldView(title = "自动提醒")
	@Column
	private Boolean isReminderSet;
	/**
	 * Indicates whether a task associated with an object can be viewed in the
	 * Customer Portal (true) or not (false). If your organization has enabled
	 * Communities, tasks marked IsVisibleInSelfService are visible to any
	 * external user in the community, as long as the user has access to the
	 * record the task was created on. This field is available when Customer
	 * Portal or partner portal are enabled OR Communities is enabled and you
	 * have Customer Portal or partner portal licenses.
	 */
	@FieldView(title = "可见")
	@Column
	private Boolean isVisibleInSelfService;
	/**
	 * Read-only. Not required on create. ID of the main record of the recurring
	 * task. Subsequent occurrences have the same value in this field.
	 */
	@FieldView(title = "主任务")
	@Column
	private Task recurrenceActivityId;
	/**
	 * The day of the month in which the task repeats.
	 */
	@Column
	private Long recurrenceDayOfMonth;
	/**
	 * The day or days of the week on which the task repeats. This field
	 * contains a bitmask. The values are as follows: • Sunday = 1 • Monday = 2
	 * • Tuesday = 4 • Wednesday = 8 • Thursday = 16 • Friday = 32 • Saturday =
	 * 64 Multiple days are represented as the sum of their numerical values.
	 * For example, Tuesday and Thursday = 4 + 16 = 20.
	 */
	@Column
	private Long recurrenceDayOfWeekMask;
	/**
	 * The last date on which the task repeats. This field has a timestamp that
	 * is always set to midnight in the Coordinated Universal Time (UTC) time
	 * zone. The timestamp is not relevant; do not attempt to alter it in order
	 * to accommodate time zone differences.
	 */
	@Column
	private Timestamp recurrenceEndDateOnly;
	/**
	 * The frequency of the recurring task. For example, “2nd” or “3rd.”
	 */
	@Column
	private EnumValue recurrenceInstance;
	/**
	 * The month of the year in which the task repeats.
	 */
	@Column
	private EnumValue recurrenceMonthOfYear;
	/**
	 * The date when the recurring task begins. Must be a date and time before
	 * RecurrenceEndDateOnly.
	 */
	@Column
	private Timestamp recurrenceStartDateOnly;
	/**
	 * The time zone associated with the recurring task. For example, “UTC-8:00”
	 * for Pacific Standard Time.
	 */
	@Column
	private EnumValue recurrenceTimeZoneSidKey;
	/**
	 * Indicates how often the task repeats. For example, daily, weekly, or
	 * every nth month (where “nth” is defined in RecurrenceInstance).
	 */
	@FieldView(title = "循环类型")
	@Column
	private EnumValue recurrenceType;
	/**
	 * Represents the time when the reminder is scheduled to fire, if
	 * IsReminderSet is set to true. If IsReminderSet is set to false, then the
	 * user may have deselected the reminder checkbox in the Salesforce user
	 * interface, or the reminder has already fired at the time indicated by the
	 * value.
	 */
	@Column
	private Time reminderDateTime;
	/**
	 * Available to organizations that have Shared Activities enabled. Count of
	 * related TaskRelations pertaining to WhatId. Count of the WhatId must be 1
	 * or less.
	 */
	@Column
	private Long whatCount;
	/**
	 * Available to organizations that have Shared Activities enabled. Count of
	 * related TaskRelations pertaining to WhoId.
	 */
	@Column
	private Long whoCount;
	/**
	 * A string array of contact or lead IDs related to this task. This
	 * JunctionIdList field is linked to the TaskWhoRelations child
	 * relationship. TaskWhoIds is only available when the shared activities
	 * setting is enabled. The first contact or lead ID in the list becomes the
	 * primary WhoId if you don’t specify a primary WhoId.
	 */
//	@FieldView(title = "接收人")
//	@OneToMany(mappedBy = "task", fetch = FetchType.LAZY)
//	private Set<TaskWhoRelations> taskWhoIds;
//
//	@FieldView(title = "干系人")
//	@OneToMany(mappedBy = "task", fetch = FetchType.LAZY)
//	private Set<TaskRelation> taskRelations;

	public TaskSubtype getTaskSubtype() {
		return taskSubtype;
	}

	public void setTaskSubtype(TaskSubtype taskSubtype) {
		this.taskSubtype = taskSubtype;
	}

	public EnumValue getPriority() {
		return priority;
	}

	public void setPriority(EnumValue priority) {
		this.priority = priority;
	}

	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public String getWhoId() {
		return whoId;
	}

	public void setWhoId(String whoId) {
		this.whoId = whoId;
	}

	public Long getRecurrenceInterval() {
		return recurrenceInterval;
	}

	public void setRecurrenceInterval(Long recurrenceInterval) {
		this.recurrenceInterval = recurrenceInterval;
	}

	public Long getCallDurationInSeconds() {
		return callDurationInSeconds;
	}

	public void setCallDurationInSeconds(Long callDurationInSeconds) {
		this.callDurationInSeconds = callDurationInSeconds;
	}

	public EnumValue getStatus() {
		return status;
	}

	public void setStatus(EnumValue status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCallObject() {
		return callObject;
	}

	public void setCallObject(String callObject) {
		this.callObject = callObject;
	}

	public EnumValue getCallType() {
		return callType;
	}

	public void setCallType(EnumValue callType) {
		this.callType = callType;
	}

	public String getCallDisposition() {
		return callDisposition;
	}

	public void setCallDisposition(String callDisposition) {
		this.callDisposition = callDisposition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWhatId() {
		return whatId;
	}

	public void setWhatId(String whatId) {
		this.whatId = whatId;
	}

	public EnumValue getType() {
		return type;
	}

	public void setType(EnumValue type) {
		this.type = type;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getConnectionReceivedId() {
		return connectionReceivedId;
	}

	public void setConnectionReceivedId(String connectionReceivedId) {
		this.connectionReceivedId = connectionReceivedId;
	}

	public String getConnectionSentId() {
		return connectionSentId;
	}

	public void setConnectionSentId(String connectionSentId) {
		this.connectionSentId = connectionSentId;
	}

	public EnumValue getRecurrenceRegeneratedType() {
		return recurrenceRegeneratedType;
	}

	public void setRecurrenceRegeneratedType(EnumValue recurrenceRegeneratedType) {
		this.recurrenceRegeneratedType = recurrenceRegeneratedType;
	}

	public Boolean getIsArchived() {
		return isArchived;
	}

	public void setIsArchived(Boolean isArchived) {
		this.isArchived = isArchived;
	}

	public Boolean getIsClosed() {
		return isClosed;
	}

	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}

	public Boolean getIsHighPriority() {
		return isHighPriority;
	}

	public void setIsHighPriority(Boolean isHighPriority) {
		this.isHighPriority = isHighPriority;
	}

	public Boolean getIsRecurrence() {
		return isRecurrence;
	}

	public void setIsRecurrence(Boolean isRecurrence) {
		this.isRecurrence = isRecurrence;
	}

	public Boolean getIsReminderSet() {
		return isReminderSet;
	}

	public void setIsReminderSet(Boolean isReminderSet) {
		this.isReminderSet = isReminderSet;
	}

	public Boolean getIsVisibleInSelfService() {
		return isVisibleInSelfService;
	}

	public void setIsVisibleInSelfService(Boolean isVisibleInSelfService) {
		this.isVisibleInSelfService = isVisibleInSelfService;
	}

	public Task getRecurrenceActivityId() {
		return recurrenceActivityId;
	}

	public void setRecurrenceActivityId(Task recurrenceActivityId) {
		this.recurrenceActivityId = recurrenceActivityId;
	}

	public Long getRecurrenceDayOfMonth() {
		return recurrenceDayOfMonth;
	}

	public void setRecurrenceDayOfMonth(Long recurrenceDayOfMonth) {
		this.recurrenceDayOfMonth = recurrenceDayOfMonth;
	}

	public Long getRecurrenceDayOfWeekMask() {
		return recurrenceDayOfWeekMask;
	}

	public void setRecurrenceDayOfWeekMask(Long recurrenceDayOfWeekMask) {
		this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
	}

	public Timestamp getRecurrenceEndDateOnly() {
		return recurrenceEndDateOnly;
	}

	public void setRecurrenceEndDateOnly(Timestamp recurrenceEndDateOnly) {
		this.recurrenceEndDateOnly = recurrenceEndDateOnly;
	}

	public EnumValue getRecurrenceInstance() {
		return recurrenceInstance;
	}

	public void setRecurrenceInstance(EnumValue recurrenceInstance) {
		this.recurrenceInstance = recurrenceInstance;
	}

	public EnumValue getRecurrenceMonthOfYear() {
		return recurrenceMonthOfYear;
	}

	public void setRecurrenceMonthOfYear(EnumValue recurrenceMonthOfYear) {
		this.recurrenceMonthOfYear = recurrenceMonthOfYear;
	}

	public Timestamp getRecurrenceStartDateOnly() {
		return recurrenceStartDateOnly;
	}

	public void setRecurrenceStartDateOnly(Timestamp recurrenceStartDateOnly) {
		this.recurrenceStartDateOnly = recurrenceStartDateOnly;
	}

	public EnumValue getRecurrenceTimeZoneSidKey() {
		return recurrenceTimeZoneSidKey;
	}

	public void setRecurrenceTimeZoneSidKey(EnumValue recurrenceTimeZoneSidKey) {
		this.recurrenceTimeZoneSidKey = recurrenceTimeZoneSidKey;
	}

	public EnumValue getRecurrenceType() {
		return recurrenceType;
	}

	public void setRecurrenceType(EnumValue recurrenceType) {
		this.recurrenceType = recurrenceType;
	}

	public Time getReminderDateTime() {
		return reminderDateTime;
	}

	public void setReminderDateTime(Time reminderDateTime) {
		this.reminderDateTime = reminderDateTime;
	}

	public Long getWhatCount() {
		return whatCount;
	}

	public void setWhatCount(Long whatCount) {
		this.whatCount = whatCount;
	}

	public Long getWhoCount() {
		return whoCount;
	}

	public void setWhoCount(Long whoCount) {
		this.whoCount = whoCount;
	}
//
//	public Set<TaskWhoRelations> getTaskWhoIds() {
//		return taskWhoIds;
//	}
//
//	public void setTaskWhoIds(Set<TaskWhoRelations> taskWhoIds) {
//		this.taskWhoIds = taskWhoIds;
//	}
//
//	public Set<TaskRelation> getTaskRelations() {
//		return taskRelations;
//	}
//
//	public void setTaskRelations(Set<TaskRelation> taskRelations) {
//		this.taskRelations = taskRelations;
//	}
}
