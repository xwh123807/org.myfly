package org.myfly.platform.metamodel.domain;

import org.apache.commons.lang3.StringUtils;

/**
 * 实体操作信息结构
 * 
 * @author xiangwanhong
 *
 */
public class EntityActionInfo {
	/**
	 * 实体表名，子表场景下也是主表名
	 */
	public String tableName;
	/**
	 * 主表UID
	 */
	public String uid;
	/**
	 * 用于子表场景， 子表属性名
	 */
	public String subTableAttr;
	/**
	 * 子表UID
	 */
	public String subUid;
	/**
	 * 实体
	 */
	public Object entity;
	/**
	 * 显示名称
	 */
	public String text;
	/**
	 * 视图名称
	 */
	public String view;

	public EntityActionInfo(String tableName, String uid, String subTableAttr, String subUid, String text, String view,
			Object entity) {
		this.tableName = tableName;
		this.uid = uid;
		this.subTableAttr = subTableAttr;
		this.subUid = subUid;
		this.entity = entity;
		this.text = text;
		this.view = view;
	}

	/**
	 * 是否为子表场景
	 * 
	 * @return
	 */
	public boolean isSubTableScene() {
		return StringUtils.isNotBlank(subTableAttr);
	}

}
