package org.myfly.apps.crm.domain;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.FieldDataType;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.Task;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * Represents an event in the calendar. In the user interface, event and task
 * records are collectively referred to as activities.
 * 
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 专用 IsPrivate 复选框 <br>
 * 主题 Subject 选项列表 <br>
 * 事件子类型 EventSubtype 选项列表 <br>
 * 位置 Location 文本(255) <br>
 * 全天事件 IsAllDayEvent 复选框 <br>
 * 内容 Description 长文本区(32000) <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 名称 WhoId 查找(联系人,潜在客户) <br>
 * 开始 StartDateTime 日期/时间 <br>
 * 持续时间 DurationInMinutes 数字(8, 0) <br>
 * 日期 ActivityDate 日期/时间 <br>
 * 时间 ActivityDateTime 日期/时间 <br>
 * 时间显示为 ShowAs 选项列表 <br>
 * 电子邮件 Email 电子邮件 <br>
 * 电话 Phone 电话 <br>
 * 相关项 WhatId 查找(合同,订单,市场活动,客户,业务机会,产品,资产,个案,解决方案,报价) <br>
 * 类型 Type 选项列表 <br>
 * 显示更多信息<br>
 * 结束 EndDateTime 日期/时间 <br>
 * 被分配人 OwnerId 查找(用户,日历)<br>
 * 
 * @author xiangwanhong
 *
 */
public class Event extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4368162857120666343L;

	@FieldView(title = "专用")
	@Column
	private Boolean isPrivate;

	/**
	 * Provides standard subtypes to facilitate creating and searching for
	 * events. This field isn’t updateable.
	 */
	@FieldView(title = "事件子类型")
	@Column
	private EnumValue eventSubtype;

	@FieldView(title = "位置")
	@Column
	private String location;

	@FieldView(title = "全天事件")
	@Column
	private Boolean isAllDayEvent;

	@FieldView(title = "内容")
	@Column
	private String description;

	/**
	 * 相关人名称，查找(联系人,潜在客户)
	 */
	@FieldView(title = "名称")
	private String whoId;

	@FieldView(title = "开始")
	@Column
	private Timestamp StartDateTime;

	@FieldView(title = "持续时间")
	@Column(length = 8)
	private Long durationInMinutes;

	/**
	 * Contains the event’s due date if the IsAllDayEvent flag is set to true.
	 * This field is a date field with a timestamp that is always set to
	 * midnight in the Coordinated Universal Time (UTC) time zone. Don’t attempt
	 * to alter the timestamp to account for time zone differences. Label is Due
	 * Date Only. This field is required in versions 12.0 and earlier if the
	 * IsAllDayEvent flag is set to true. The value for this field and
	 * StartDateTime must match, or one of them must be null.
	 */
	@FieldView(title = "活动日期")
	@Column
	private Date activityDate;

	@FieldView(title = "活动时间")
	@Column
	private Time activityDateTime;

	@FieldView(title = "时间显示为")
	@Column
	private String showAs;

	@FieldView(title = "邮件", dataType = FieldDataType.EMAIL)
	@Column
	private String email;

	@FieldView(title = "电话", dataType = FieldDataType.TELPHONE)
	@Column
	private String phone;

	/**
	 * 查找(合同,订单,市场活动,客户,业务机会,产品,资产,个案,解决方案,报价)
	 */
	@FieldView(title = "相关项")
	@Column
	private String whatId;

	@FieldView(title = "结束")
	@Column
	private Timestamp endDateTime;

	/**
	 * Indicates the event type, such as Call, Email, or Meeting.
	 */
	@FieldView(title = "类型")
	@Column
	private EnumValue type;

	/**
	 * 被分配人 OwnerId 查找(用户,日历)
	 */
	@FieldView(title = "被分配人")
	@Column
	private String ownerId;
	/**
	 * A string array of contact or lead IDs who accepted this event. This
	 * JunctionIdList is linked to the AcceptedEventRelation child relationship
	 */
	private Set<AcceptedEventRelation> AcceptedEventInviteeIds;

	/**
	 * Represents the ID of the related Account. The AccountId is determined as
	 * follows. If the value of WhatId is any of the following objects, then
	 * Salesforce uses that object’s AccountId.If the value of the WhatIdfield
	 * is any other object, and the value of the WhoId field is a Contact
	 * object, then Salesforce uses that contact’s AccountId. (If your
	 * organization uses Shared Activities, then Salesforce uses the AccountId
	 * of the primary contact.)
	 */
	private String accountId;
	/**
	 * The client globally unique identifier identifies the external API client
	 * used to create the event. Label is Client GUID.
	 */
	private String ClientGuid;
	/**
	 * Available only for organizations with the multicurrency feature enabled.
	 * Contains the ISO code for any currency allowed by the organization.
	 */
	private EnumValue CurrencyIsoCode;
	/**
	 * A string array of contact, lead, or user IDs who declined this event.
	 * This JunctionIdList is linked to the DeclinedEventRelation child
	 * relationship.
	 */
	private Set<DeclinedEventRelation> DeclinedEventInviteeIds;
	/**
	 * A logical segment of your organization’s data. Available only if the
	 * organization has the Division permission enabled.
	 */
	private EnumValue Division;

	/**
	 * A string array of contact or lead IDs used to create many-to-many
	 * relationships with a shared event. EventWhoIds is available when the
	 * shared activities setting is enabled. The first contact or lead ID in the
	 * list becomes the primary WhoId if you don’t specify a primary WhoId.
	 */
	private Set<EventRelation> EventWhoIds;
	/**
	 * Read-only. Available in API versions 19.0 and later. The possible values
	 * are: • 0 (Non–group event)—An event with no invitees. • 1 (Group
	 * event)—An event with invitees. • 2 (Proposed event)—An event created when
	 * a user requests a meeting with a contact, lead, or person account using
	 * the Salesforce user interface. When the user confirms the meeting, the
	 * proposed event becomes a group event. You can’t create, edit, or delete
	 * proposed events in the API. For more information, see How Cloud Scheduler
	 * Works in Salesforce Classic in the Salesforce help.
	 */
	private EnumValue GroupEventType;
	/**
	 * Indicates whether the ActivityDate field (true) or the ActivityDateTime
	 * field (false) is used to define the date or time of the event. Label is
	 * All-Day Event. See also DurationInMinutes and EndDateTime.
	 */
	private Boolean IsAllDayEvent;
	/**
	 * Indicates whether the event has been archived.
	 */
	private Boolean isArchived;
	/**
	 * Indicates whether the event is a child of another event (true) or not
	 * (false). For a child event, you can update IsReminderSet and
	 * ReminderDateTime only. You can query and delete a child event. If the
	 * objects related to the child event are different from those related to
	 * the parent event (this difference is possible if you use API version 25.0
	 * or earlier) and one of the objects related to the child event is deleted,
	 * the objects related to the parent event are updated to ensure data
	 * integrity.
	 */
	private Boolean IsChild;
	/**
	 * Indicates whether the event is managed by an external client. If the
	 * value of this field is false, the event isn’t owned or managed by an
	 * external client, and Salesforce can be used to update it. If the value is
	 * true, Salesforce can be used to change only noncritical fields on the
	 * event. Label is Is Client Managed.
	 */
	private Boolean IsClientManaged;
	/**
	 * Indicates whether the event is a group event—that is, whether it has
	 * invitees (true) or not (false).
	 */
	private Boolean IsGroupEvent;
	/**
	 * Indicates whether users other than the creator of the event can (false)
	 * or can’t (true) see the event details when viewing the event user’s
	 * calendar. However, users with the View All Data or Modify All Data
	 * permission can see private events in reports and searches, or when
	 * viewing other users’ calendars. Private events can’t be associated with
	 * opportunities, accounts, cases, campaigns, contracts, leads, or contacts.
	 * Label is Private.
	 */
	private Boolean IsPrivate;
	/**
	 * Indicates whether the task is scheduled to repeat itself (true) or only
	 * occurs once (false). This is a read-only field on update, but not on
	 * create. If this field value is true, then RecurrenceStartDateOnly,
	 * RecurrenceEndDateOnly, RecurrenceType, and any recurrence fields
	 * associated with the given recurrence type must be populated. See
	 * Recurring Tasks.
	 */
	private Boolean isRecurrence;
	/**
	 * Indicates whether a popup reminder has been set for the task (true) or
	 * not (false).
	 */
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
	private Boolean isVisibleInSelfService;
	/**
	 * Read-only. Not required on create. ID of the main record of the recurring
	 * task. Subsequent occurrences have the same value in this field.
	 */
	private Task recurrenceActivityId;
	/**
	 * The day of the month in which the task repeats.
	 */
	private Long recurrenceDayOfMonth;
	/**
	 * The day or days of the week on which the task repeats. This field
	 * contains a bitmask. The values are as follows: • Sunday = 1 • Monday = 2
	 * • Tuesday = 4 • Wednesday = 8 • Thursday = 16 • Friday = 32 • Saturday =
	 * 64 Multiple days are represented as the sum of their numerical values.
	 * For example, Tuesday and Thursday = 4 + 16 = 20.
	 */
	private Long recurrenceDayOfWeekMask;
	/**
	 * The last date on which the task repeats. This field has a timestamp that
	 * is always set to midnight in the Coordinated Universal Time (UTC) time
	 * zone. The timestamp is not relevant; do not attempt to alter it in order
	 * to accommodate time zone differences.
	 */
	private Timestamp recurrenceEndDateOnly;
	/**
	 * The frequency of the recurring task. For example, “2nd” or “3rd.”
	 */
	private EnumValue recurrenceInstance;
	/**
	 * The month of the year in which the task repeats.
	 */
	private EnumValue recurrenceMonthOfYear;
	/**
	 * The date when the recurring task begins. Must be a date and time before
	 * RecurrenceEndDateOnly.
	 */
	private Timestamp recurrenceStartDateOnly;
	/**
	 * The time zone associated with the recurring task. For example, “UTC-8:00”
	 * for Pacific Standard Time.
	 */
	private EnumValue recurrenceTimeZoneSidKey;
	/**
	 * Indicates how often the task repeats. For example, daily, weekly, or
	 * every nth month (where “nth” is defined in RecurrenceInstance).
	 */
	private EnumValue recurrenceType;
	/**
	 * Represents the time when the reminder is scheduled to fire, if
	 * IsReminderSet is set to true. If IsReminderSet is set to false, then the
	 * user may have deselected the reminder checkbox in the Salesforce user
	 * interface, or the reminder has already fired at the time indicated by the
	 * value.
	 */
	private Time ReminderDateTime;
	/**
	 * A string array of contact, lead, or user IDs who are undecided about this
	 * event. This JunctionIdList is linked to the UndecidedEventRelation child
	 * relationship.
	 */
	private Set<UndecidedEventRelation> UndecidedEventInviteeIds;
	/**
	 * Available to organizations that have Shared Activities enabled. Count of
	 * related TaskRelations pertaining to WhatId. Count of the WhatId must be 1
	 * or less.
	 */
	private Long whatCount;
	/**
	 * Available to organizations that have Shared Activities enabled. Count of
	 * related TaskRelations pertaining to WhoId.
	 */
	private Long whoCount;
}
