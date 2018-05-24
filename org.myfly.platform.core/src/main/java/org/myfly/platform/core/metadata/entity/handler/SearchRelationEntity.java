package org.myfly.platform.core.metadata.entity.handler;

import java.io.Serializable;

import org.myfly.platform.core.utils.JSONUtil;

/**
 * 查找关系实体基本信息
 * 
 * @author xiangwanhong
 *
 */
public class SearchRelationEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3679088206579988856L;
	/**
	 * 实体主键值，多主键字段间用“_”分割
	 */
	private String uid;
	/**
	 * 实体标题
	 */
	private String title;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return JSONUtil.toJSON(this);
	}
}
