package org.myfly.apps.crm.domain;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.SUser;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 合同
 * 
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 价格手册 Pricebook2Id 查找(价格手册) <br>
 * 公司签字人 CompanySignedId 查找(用户) <br>
 * 公司签字日期 CompanySignedDate 日期 <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 发货地址 ShippingAddress 地址 <br>
 * 合同名称 Name 文本(80) <br>
 * 合同开始日期 StartDate 日期 <br>
 * 合同所有人 OwnerId 查找(用户) <br>
 * 合同条款（月） ContractTerm 数字(4, 0) <br>
 * 合同结束日期 EndDate 日期 <br>
 * 合同编号 ContractNumber 自动编号 <br>
 * 启用人 ActivatedById 查找(用户) <br>
 * 启用日期 ActivatedDate 日期/时间 <br>
 * 备注 Description 长文本区(32000) <br>
 * 客户名 AccountId 查找(客户) <br>
 * 客户签字人 CustomerSignedId 查找(联系人) <br>
 * 客户签字人职务 CustomerSignedTitle 文本(40) <br>
 * 客户签字日期 CustomerSignedDate 日期 <br>
 * 开单地址 BillingAddress 地址<br>
 * 所有人到期通知 OwnerExpirationNotice 选项列表 <br>
 * 特别条款 SpecialTerms 文本区(4000) <br>
 * 状态 Status 选项列表<br>
 * 
 * @author xiangwanhong
 *
 */
public class Contract extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3942522594861948232L;
	@FieldView(title = "价格手册")
	@Column
	private Pricebook pricebook;
	@FieldView(title = "公司签字人")
	@Column
	private SUser companySigned;
	@FieldView(title = "公司签字日期")
	@Column
	private Date companySignedDate;
	@FieldView(title = "发货地址")
	@Column
	private String shippingAddress;
	@FieldView(title = "合同开始日期")
	@Column
	private Date startDate;
	@FieldView(title = "合同所有人")
	@Column
	private SUser owner;
	@FieldView(title = "合同条款（月）")
	@Column
	private Long contractTerm;
	@FieldView(title = "合同结束日期")
	@Column
	private Date endDate;
	@FieldView(title = "合同编号")
	@Column
	private String contractNumber;
	@FieldView(title = "启用人")
	@Column
	private SUser activatedBy;
	@FieldView(title = "启用日期")
	@Column
	private Timestamp activatedDate;
	@FieldView(title = "备注")
	@Column
	private String description;
	@FieldView(title = "客户名")
	@Column
	private Account account;
	@FieldView(title = "客户签字人")
	@Column
	private Contact customerSigned;
	@FieldView(title = "客户签字人职务")
	@Column
	private String customerSignedTitle;
	@FieldView(title = "客户签字日期")
	@Column
	private Date customerSignedDate;
	@FieldView(title = "开单地址")
	@Column
	private String billingAddress;
	@FieldView(title = "所有人到期通知")
	@Column
	private EnumValue ownerExpirationNotice;
	@FieldView(title = "特别条款")
	@Column
	private String specialTerms;
	@FieldView(title = "状态")
	@Column
	private EnumValue status;
}
