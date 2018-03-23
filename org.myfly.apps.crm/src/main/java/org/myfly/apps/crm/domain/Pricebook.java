package org.myfly.apps.crm.domain;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 价格手册
 * 
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 价格手册名 Name 文本(255) <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 已启用 IsActive 复选框 <br>
 * 描述 Description 文本(255) <br>
 * 是标准价格手册 IsStandard 复选框<br>
 * 
 * @author xiangwanhong
 *
 */
public class Pricebook extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5606220606701757694L;
	@FieldView(title = "描述")
	@Column
	private String description;
	@FieldView(title = "是标准价格手册")
	@Column
	private boolean isStandard;
}
