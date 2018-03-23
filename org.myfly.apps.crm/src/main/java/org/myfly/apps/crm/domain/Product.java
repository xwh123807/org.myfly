package org.myfly.apps.crm.domain;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 产品
 * 
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 产品代码 ProductCode 文本(255) <br>
 * 产品名称 Name 文本(255) <br>
 * 产品描述 Description 文本区(4000) <br>
 * 产品系列 Family 选项列表 <br>
 * 显示更多信息<br>
 * 创建人 CreatedById 查找(用户) <br>
 * 已启用 IsActive 复选框<br>
 * 
 * @author xiangwanhong
 *
 */
public class Product extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8338454862658842790L;

	@FieldView(title = "产品代码")
	@Column
	private String productCode;
	@FieldView(title = "产品描述")
	@Column
	private String Description;
	@FieldView(title = "产品系列")
	@Column
	private EnumValue family;
}
