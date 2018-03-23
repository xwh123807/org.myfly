package org.myfly.apps.crm.domain;

import java.util.Date;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 业务机会产品
 * 
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 业务机会 OpportunityId 查找(业务机会) <br>
 * 产品 Product2Id 查找(产品) <br>
 * 产品代码 ProductCode 文本(255) <br>
 * 价目表价格 ListPrice 币种(16, 2) <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 小计 Subtotal 币种(16, 2) <br>
 * 总价 TotalPrice 币种(16, 2) <br>
 * 折扣 Discount 百分比(3, 2) <br>
 * 数量 Quantity 数字(10, 2) <br>
 * 日期 ServiceDate 日期 <br>
 * 行描述 Description 文本(255) <br>
 * 销售价格 UnitPrice 币种(16, 2)<br>
 * 
 * @author xiangwanhong
 *
 */
public class OpportunityLineItem extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2612986001757020551L;

	@FieldView(title = "业务机会")
	@Column
	private Opportunity opportunity;
	@FieldView(title = "产品")
	@Column
	private Product product;
	@FieldView(title = "产品代码")
	@Column
	private String ProductCode;
	@FieldView(title = "价目表价格")
	@Column
	private Double ListPrice;
	@FieldView(title = "小计")
	@Column
	private Double Subtotal;
	@FieldView(title = "总价")
	@Column
	private Double TotalPrice;
	@FieldView(title = "折扣")
	@Column
	private Double Discount;
	@FieldView(title = "数量")
	@Column
	private Long Quantity;
	@FieldView(title = "日期")
	@Column
	private Date ServiceDate;
	@FieldView(title = "行描述")
	@Column
	private String Description;
	@FieldView(title = "销售价格")
	@Column
	private Double UnitPrice;
}
