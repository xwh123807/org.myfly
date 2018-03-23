package org.myfly.apps.crm.domain;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 价格手册条目
 * 
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 产品 Product2Id 查找(产品) <br>
 * 产品代码 ProductCode 文本(255) <br>
 * 价格手册 Pricebook2Id 查找(价格手册) <br>
 * 价目表价格 UnitPrice 币种(16, 2) <br>
 * 使用标准价格 UseStandardPrice 复选框<br>
 * 创建人 CreatedById 查找(用户) <br>
 * 已启用 IsActive 复选框<br>
 * 
 * @author xiangwanhong
 *
 */
public class PricebookEntry extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6289001516033170111L;

	@FieldView(title = "产品")
	@Column
	private Product product;
	@FieldView(title = "产品代码")
	@Column
	private String productCode;
	@FieldView(title = "价格手册")
	@Column
	private Pricebook pricebook;
	@FieldView(title = "价目表价格")
	@Column
	private Double unitPrice;
	@FieldView(title = "使用标准价格")
	@Column
	private Boolean useStandardPrice;
}
