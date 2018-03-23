package org.myfly.apps.crm.domain;

import java.util.Date;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.FieldDataType;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 个案
 * 
 * 
 * Web 公司 SuppliedCompany 文本(80) <br>
 * Web 名称 SuppliedName 文本(80) <br>
 * Web 电子邮件 SuppliedEmail 电子邮件 <br>
 * Web 电话 SuppliedPhone 文本(40) <br>
 * 上次修改人 LastModifiedById 查找(用户)<br>
 * 个案原因 Reason 选项列表 <br>
 * 显示更多信息<br>
 * 个案所有人 OwnerId 查找(用户,小组) <br>
 * 个案来源 Origin 选项列表 <br>
 * 显示更多信息<br>
 * 个案编号 CaseNumber 自动编号 <br>
 * 主题 Subject 文本(255) <br>
 * 优先级 Priority 选项列表 <br>
 * 显示更多信息<br>
 * 内部注释 Comments 文本区(4000) <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 创建时关闭 IsClosedOnCreate 复选框 <br>
 * 客户名 AccountId 查找(客户) <br>
 * 工作时间 BusinessHoursId 查找(工作时间) <br>
 * 已升级 IsEscalated 复选框 <br>
 * 开始日期/时间 CreatedDate 日期/时间 <br>
 * 描述 Description 长文本区(32000) <br>
 * 父级个案 ParentId 查找(个案)<br>
 * 状态 Status 选项列表 <br>
 * 显示更多信息<br>
 * 类型 Type 选项列表 <br>
 * 显示更多信息<br>
 * 结束日期/时间 ClosedDate 日期/时间 <br>
 * 联系人传真 ContactFax 电话 <br>
 * 联系人姓名 ContactId 查找(联系人) <br>
 * 联系人电子邮件 ContactEmail 电子邮件 <br>
 * 联系人电话 ContactPhone 电话 <br>
 * 联系人移动电话 ContactMobile 电话 <br>
 * 资产 AssetId 查找(资产)<br>
 * 
 * @author xiangwanhong
 *
 */
public class Case extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7309273896604542402L;

	@FieldView(title = "公司")
	@Column(length = 80)
	private String suppliedCompany;

	@FieldView(title = "名称")
	@Column(length = 80)
	private String suppliedName;

	@FieldView(title = "电子邮件", dataType = FieldDataType.EMAIL)
	@Column
	private String suppliedEmail;

	@FieldView(title = "电话", dataType = FieldDataType.URL)
	@Column(length = 40)
	private String suppliedPhone;

	@FieldView(title = "个案原因")
	@Column
	private EnumValue reason;

	/**
	 * 查找(用户,小组)
	 */
	@FieldView(title = "个案所有人")
	@Column
	private String ownerId;

	@FieldView(title = "个案来源")
	@Column
	private EnumValue origin;

	@FieldView(title = "个案编号", dataType = FieldDataType.AUTOINC)
	@Column
	private String caseNumber;

	@FieldView(title = "优先级")
	@Column
	private EnumValue priority;

	@FieldView(title = "内部注释")
	@Column(length = 4000)
	private String comments;

	@FieldView(title = "创建时关闭")
	@Column
	private Boolean isClosedOnCreate;

	@FieldView(title = "客户名")
	@Column
	private Account account;

	@FieldView(title = "工作时间")
	@Column
	private String businessHoursId;

	@FieldView(title = "已升级")
	@Column
	private Boolean isEscalated;

	@FieldView(title = "开始日期")
	@Column
	private Date createdDate;

	@FieldView(title = "描述")
	@Column
	private String description;

	@FieldView(title = "父级个案")
	@Column
	private Case parent;

	@FieldView(title = "状态")
	@Column
	private EnumValue status;

	@FieldView(title = "类型")
	@Column
	private EnumValue type;
	@FieldView(title = "结束日期")
	@Column
	private Date closedDate;
	@FieldView(title = "联系人传真")
	@Column
	private String contactFax;
	@FieldView(title = "联系人姓名")
	@Column
	private Contact contact;
	@FieldView(title = "联系人电子邮件")
	@Column
	private String contactEmail;
	@FieldView(title = "联系人电话")
	@Column
	private String contactPhone;
	@FieldView(title = "联系人移动电话")
	@Column
	private String contactMobile;
	@FieldView(title = "资产")
	@Column
	private Asset asset;
}
