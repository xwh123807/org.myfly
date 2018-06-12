package org.myfly.platform.core.flydata.service;

import java.util.List;

/**
 * 实体增强数据访问服务
 * @author xiangwanhong
 *
 */
public interface IFlyEntityService {
	/**
	 * 新增实体，返回实体UID<br>
	 * 1、jsonEntity表示实体的json，可以反序列化实体类；<br>
	 * 2、按viewName定义的字段列表，重构实体类; <br>
	 * 3、支持实体的级联保存; <br>
	 * 4、返回实体UID <br>
	 * 
	 * @param entityName
	 * @param viewName
	 * @param jsonEntity
	 *            实体类Json
	 * @return 返回实体UID
	 */
	String saveEntity(String entityName, String viewName, String jsonEntity);

	/**
	 * 查找实体，返回增强实体<br>
	 * 1、按主键查找实体；<br>
	 * 2、返回增强实体，支持序列化；<br>
	 * 3、hasSubTable，标识是否包含子表；<br>
	 * 4、如果hasSubTable=true，subTableAttrs指定具体子表，如果没有指定表示取所有子表；<br>
	 * 
	 * @param entityName
	 * @param uid
	 * @param viewName
	 * @param hasSubTable
	 *            是否包含子表
	 * @param subTableAttrs
	 * @return
	 */
	FlyEntityResult find(String entityName, String uid, String viewName, boolean hasSubTable,
			String[] subTableAttrs);

	/**
	 * 修改实体<br>
	 * 1、jsonEntity表示实体的json，可以反序列化实体类；<br>
	 * 2、支持实体的级联修改；<br>
	 * 3、按viewName定义的字段列表，重构实体类; <br>
	 * 
	 * @param entityName
	 * @param viewName
	 * @param jsonEntity
	 *            实体类Json
	 */
	void updateEntity(String entityName, String uid, String viewName, String jsonEntity);
	
	/**
	 * 删除实体
	 * @param entityName
	 * @param uid
	 */
	void del(String entityName, String uid);
	
	/**
	 * 查询实体
	 * @param entityName
	 * @param listViewName
	 * @return
	 */
	List<FlyEntityResult> findAll(String entityName, String listViewName);
}
