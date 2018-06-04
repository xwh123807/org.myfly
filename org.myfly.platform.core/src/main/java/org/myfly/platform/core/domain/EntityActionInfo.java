package org.myfly.platform.core.domain;

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
	private String tableName;
	/**
	 * 主表UID
	 */
	private String uid;
	/**
	 * 用于子表场景， 子表属性名
	 */
	private String subTableAttr;
	/**
	 * 子表UID
	 */
	private String subUid;
	/**
	 * 实体
	 */
	private Object entity;
	/**
	 * 显示名称
	 */
	private String text;
	/**
	 * 视图名称
	 */
	private String view;

	public EntityActionInfo(String tableName, String uid, String subTableAttr, String subUid, String text, String view,
			Object entity) {
		this.setTableName(tableName);
		this.setUid(uid);
		this.setSubTableAttr(subTableAttr);
		this.setSubUid(subUid);
		this.setEntity(entity);
		this.setText(text);
		this.setView(view);
	}

	/**
	 * 是否为子表场景
	 * 
	 * @return
	 */
	public boolean isSubTableScene() {
		return StringUtils.isNotBlank(getSubTableAttr());
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getSubTableAttr() {
		return subTableAttr;
	}

	public void setSubTableAttr(String subTableAttr) {
		this.subTableAttr = subTableAttr;
	}

	public String getSubUid() {
		return subUid;
	}

	public void setSubUid(String subUid) {
		this.subUid = subUid;
	}

	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
