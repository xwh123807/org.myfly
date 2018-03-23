package org.myfly.apps.crm.domain;

import java.util.Date;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 市场活动成员
 * 
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 上次修改日期 LastModifiedDate 日期/时间 <br>
 * 传真 Fax 传真 <br>
 * 公司（账户） CompanyOrAccount 文本(255) <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 创建日期 CreatedDate 日期/时间 <br>
 * 名 FirstName 文本(40) <br>
 * 国家/地区 Country 文本(80) <br>
 * 城市 City 文本(40) <br>
 * 姓 LastName 文本(40) <br>
 * 州/省 State 文本(40) <br>
 * 已回复 HasResponded 复选框<br>
 * 市场活动 CampaignId 查找(市场活动) <br>
 * 手机 MobilePhone 电话 <br>
 * 描述 Description 文本(255)<br>
 * 潜在客户 LeadId 查找(潜在客户) <br>
 * 潜在客户来源 LeadSource 选项列表 <br>
 * 显示更多信息<br>
 * 状态 Status 选项列表 <br>
 * 显示更多信息<br>
 * 电子邮件 Email 电子邮件 <br>
 * 电话 Phone 电话<br>
 * 称谓 Salutation 选项列表 <br>
 * 显示更多信息<br>
 * 职务 Title 文本(80)<br>
 * 联系人 ContactId 查找(联系人) <br>
 * 街道 Street 文本(255) <br>
 * 请勿致电 DoNotCall 复选框 <br>
 * 退出传真列表 HasOptedOutOfFax 复选框 <br>
 * 退出邮寄列表 HasOptedOutOfEmail 复选框 <br>
 * 邮政编码 PostalCode 文本(20) <br>
 * 首次响应日期 FirstRespondedDate 日期<br>
 * 
 * @author xiangwanhong
 *
 */
public class CampaignMember extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8486399398921977957L;
	@FieldView(title = "传真")
	@Column
	private String fax;
	@FieldView(title = "公司（账户）")
	@Column
	private String companyOrAccount;
	@FieldView(title = "名")
	@Column
	private String firstName;
	@FieldView(title = "国家/地区")
	@Column
	private String country;
	@FieldView(title = "城市")
	@Column
	private String city;
	@FieldView(title = "姓")
	@Column
	private String lastName;
	@FieldView(title = "州/省")
	@Column
	private String state;
	@FieldView(title = "已回复")
	@Column
	private Boolean hasResponded;
	@FieldView(title = "市场活动")
	@Column
	private Campaign campaign;
	@FieldView(title = "手机")
	@Column
	private String MobilePhone;
	@FieldView(title = "描述")
	@Column
	private String Description;
	@FieldView(title = "潜在客户")
	@Column
	private Lead lead;
	@FieldView(title = "潜在客户来源")
	@Column
	private EnumValue LeadSource;
	@FieldView(title = "状态")
	@Column
	private EnumValue status;
	@FieldView(title = "电子邮件")
	@Column
	private String email;
	@FieldView(title = "电话")
	@Column
	private String phone;
	@FieldView(title = "称谓")
	@Column
	private EnumValue Salutation;
	@FieldView(title = "职务")
	@Column(length = 80)
	private String title;
	@FieldView(title = "联系人")
	@Column
	private Contact contact;
	@FieldView(title = "街道")
	@Column
	private String street;
	@FieldView(title = "请勿致电")
	@Column
	private Boolean doNotCall;
	@FieldView(title = "退出传真列表")
	@Column
	private Boolean hasOptedOutOfFax;
	@FieldView(title = "退出邮寄列表")
	@Column
	private Boolean hasOptedOutOfEmail;
	@FieldView(title = "邮政编码")
	@Column(length = 20)
	private String postalCode;
	@FieldView(title = "首次响应日期")
	@Column
	private Date firstRespondedDate;
}
