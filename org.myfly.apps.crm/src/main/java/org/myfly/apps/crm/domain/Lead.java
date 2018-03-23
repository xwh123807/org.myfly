package org.myfly.apps.crm.domain;

import java.util.Date;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.FieldDataType;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.SUser;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 潜在客户
 * 
 * Data.com 密钥 Jigsaw 文本(20) <br>
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 上次转移日期 LastTransferDate 日期 <br>
 * 传真 Fax 传真 <br>
 * 公司 Company 文本(255) <br>
 * 公司 D-U-N-S 编号 CompanyDunsNumber 文本(9) <br>
 * 分级 Rating 选项列表 <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 名称 Name 名称 <br>
 * 地址 Address 地址 <br>
 * 年收入 AnnualRevenue 币种(18, 0) <br>
 * 手机 MobilePhone 电话 <br>
 * 描述 Description 长文本区(32000) <br>
 * 潜在客户所有人 OwnerId 查找(用户,小组) <br>
 * 潜在客户来源 LeadSource 选项列表 <br>
 * 显示更多信息<br>
 * 潜在客户状态 Status 选项列表 <br>
 * 显示更多信息<br>
 * 电子邮件 Email 电子邮件 <br>
 * 电话 Phone 电话 <br>
 * 网址 Website URL(255)<br>
 * 职务 Title 文本(128)<br>
 * 职员数 NumberOfEmployees 数字(8, 0) <br>
 * 行业 Industry 选项列表 <br>
 * 显示更多信息<br>
 * 请勿致电 DoNotCall 复选框 <br>
 * 退出传真列表 HasOptedOutOfFax 复选框 <br>
 * 退出邮寄列表 HasOptedOutOfEmail 复选框<br>
 * 
 * @author xiangwanhong
 *
 */
public class Lead extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2444954383497681066L;

	@FieldView(title = "上次转移日期")
	private Date lastTransferDate;

	@FieldView(title = "传真", dataType = FieldDataType.FAX)
	private String fax;

	@FieldView(title = "公司")
	private String company;

	@FieldView(title = "公司 D-U-N-S 编号")
	private String companyDunsNumber;

	@FieldView(title = "分级")
	private EnumValue rating;

	@FieldView(title = "地址")
	private String address;

	@FieldView(title = "年收入")
	private Long annualRevenue;

	@FieldView(title = "手机", dataType = FieldDataType.TELPHONE)
	private String mobilePhone;

	@FieldView(title = "描述")
	private String description;

	@FieldView(title = "潜在客户所有人")
	private SUser ownerId;

	@FieldView(title = "潜在客户来源")
	private EnumValue leadSource;

	@FieldView(title = "潜在客户状态")
	private EnumValue status;

	@FieldView(title = "电子邮件", dataType = FieldDataType.EMAIL)
	private String email;

	@FieldView(title = "电话", dataType = FieldDataType.TELPHONE)
	private String phone;

	@FieldView(title = "网址", dataType = FieldDataType.URL)
	private String website;

	@FieldView(title = "职务")
	@Column(length = 128)
	private String title;

	@FieldView(title = "职员数")
	private Long numberOfEmployees;

	@FieldView(title = "行业")
	private EnumValue industry;

	@FieldView(title = "请勿致电")
	private Boolean doNotCall;

	@FieldView(title = "退出传真列表")
	private Boolean hasOptedOutOfFax;

	@FieldView(title = "退出邮寄列表")
	private Boolean hasOptedOutOfEmail;

}
