package org.myfly.apps.crm.domain;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.SchemaConstants;
import org.myfly.platform.system.metadata.annotation.FieldView;
import org.myfly.platform.system.metadata.annotation.FlySearchRelation;

/**
 * 联系人
 * 
 * Data.com 密钥 Jigsaw 文本(20) <br>
 * 上次保持联系保存日期 LastCUUpdateDate 日期/时间 <br>
 * 上次保持联系请求日期 LastCURequestDate 日期/时间 <br>
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 传真 Fax 传真 <br>
 * 其他地址 OtherAddress 地址 <br>
 * 其它电话 OtherPhone 电话 <br>
 * 出生日期 Birthdate 日期 <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 助理 AssistantName 文本(40) <br>
 * 助理电话 AssistantPhone 电话 <br>
 * 勿致电 DoNotCall 复选框 <br>
 * 备注 Description 长文本区(32000) <br>
 * 姓名 Name 名称 <br>
 * 客户名 AccountId 查找(客户) <br>
 * 家庭电话 HomePhone 电话 <br>
 * 手机 MobilePhone 电话 <br>
 * 潜在客户来源 LeadSource 选项列表 <br>
 * 显示更多信息<br>
 * 电子邮件 Email 电子邮件 <br>
 * 电话 Phone 电话<br>
 * 直属上司 ReportsToId 查找(联系人) <br>
 * 职务 Title 文本(128) <br>
 * 联系人所有人 OwnerId 查找(用户)<br>
 * 退出传真列表 HasOptedOutOfFax 复选框 <br>
 * 退出邮寄列表 HasOptedOutOfEmail 复选框 <br>
 * 邮寄地址 MailingAddress 地址 <br>
 * 部门 Department 文本(80) <br>
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.CRM)
public class Contact extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5289795102633849528L;

	@FieldView(title = "上次保持联系保存日期")
	@Column
	private Timestamp lastCUUpdateDate;
	@FieldView(title = "上次保持联系请求日期")
	@Column
	private Timestamp lastCURequestDate;
	@FieldView(title = "传真")
	@Column
	private String fax;
	@FieldView(title = "其他地址")
	@Column
	private String otherAddress;
	@FieldView(title = "其它电话")
	@Column
	private String otherPhone;
	@FieldView(title = "出生日期")
	@Column
	private Date birthdate;
	@FieldView(title = "助理")
	@Column
	private String assistantName;
	@FieldView(title = "助理电话")
	@Column
	private String assistantPhone;
	@FieldView(title = "勿致电")
	@Column
	private Boolean doNotCall;
	@FieldView(title = "备注")
	@Column
	private String description;

	@FieldView(title = "客户名")
	@FlySearchRelation(entityNames="Account")
	private String accountId;
	
	@FieldView(title = "家庭电话")
	@Column
	private String homePhone;
	@FieldView(title = "手机")
	@Column
	private String mobilePhone;
	@FieldView(title = "潜在客户来源")
	@Column
	private EnumValue leadSource;
	@FieldView(title = "电子邮件")
	@Column
	private String email;
	@FieldView(title = "电话")
	@Column
	private String phone;
	
	@FieldView(title = "直属上司")
	@Column
	@FlySearchRelation(entityNames="SUser")
	private String reportsToId;
	
	@FieldView(title = "职务")
	@Column(length = 128)
	private String title;
	
	@FieldView(title = "联系人所有人")
	@Column
	@FlySearchRelation(entityNames="SUser")
	private String ownerId;
	
	@FieldView(title = "退出传真列表")
	@Column
	private Boolean hasOptedOutOfFax;
	@FieldView(title = "退出邮寄列表")
	@Column
	private Boolean hasOptedOutOfEmail;
	@FieldView(title = "邮寄地址")
	@Column
	private String mailingAddress;
	@FieldView(title = "部门")
	@Column(length = 80)
	private String department;
	
//	@FieldView(title = "业务机会")
//	private Set<Opportunity> opportunities;

	public Timestamp getLastCUUpdateDate() {
		return lastCUUpdateDate;
	}

	public void setLastCUUpdateDate(Timestamp lastCUUpdateDate) {
		this.lastCUUpdateDate = lastCUUpdateDate;
	}

	public Timestamp getLastCURequestDate() {
		return lastCURequestDate;
	}

	public void setLastCURequestDate(Timestamp lastCURequestDate) {
		this.lastCURequestDate = lastCURequestDate;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getOtherAddress() {
		return otherAddress;
	}

	public void setOtherAddress(String otherAddress) {
		this.otherAddress = otherAddress;
	}

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getAssistantName() {
		return assistantName;
	}

	public void setAssistantName(String assistantName) {
		this.assistantName = assistantName;
	}

	public String getAssistantPhone() {
		return assistantPhone;
	}

	public void setAssistantPhone(String assistantPhone) {
		this.assistantPhone = assistantPhone;
	}

	public Boolean getDoNotCall() {
		return doNotCall;
	}

	public void setDoNotCall(Boolean doNotCall) {
		this.doNotCall = doNotCall;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public EnumValue getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(EnumValue leadSource) {
		this.leadSource = leadSource;
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

	public String getReportsToId() {
		return reportsToId;
	}

	public void setReportsToId(String reportsToId) {
		this.reportsToId = reportsToId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Boolean getHasOptedOutOfFax() {
		return hasOptedOutOfFax;
	}

	public void setHasOptedOutOfFax(Boolean hasOptedOutOfFax) {
		this.hasOptedOutOfFax = hasOptedOutOfFax;
	}

	public Boolean getHasOptedOutOfEmail() {
		return hasOptedOutOfEmail;
	}

	public void setHasOptedOutOfEmail(Boolean hasOptedOutOfEmail) {
		this.hasOptedOutOfEmail = hasOptedOutOfEmail;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

//	public Set<Opportunity> getOpportunities() {
//		return opportunities;
//	}
//
//	public void setOpportunities(Set<Opportunity> opportunities) {
//		this.opportunities = opportunities;
//	}
}
