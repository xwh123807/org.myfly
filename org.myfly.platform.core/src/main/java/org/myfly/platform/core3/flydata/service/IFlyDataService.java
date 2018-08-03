package org.myfly.platform.core3.flydata.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

/**
 * FlyData服务<br>
 * 1、entityName，实体名，值在系统中唯一，没有特别指定则为实体类名<br>
 * 2、实体类必须实现IFlyEntity3，或必须有IFlyEntity3中的字段<br>
 * 
 * @author xiangwanhong
 *
 */
public interface IFlyDataService {
	/**
	 * 查找单个实体，返回所有子表
	 * 
	 * @param entityName
	 *            实体名
	 * @param uid
	 *            主键
	 * @return
	 */
	public FlyEntityMap findOne(String entityName, String uid);

	/**
	 * 删除实体
	 * 
	 * @param entityName
	 *            实体名
	 * @param uid
	 *            主键
	 */
	public void delOne(String entityName, String uid);

	/**
	 * 新增实体保存，返回主键
	 * 
	 * @param entityName
	 *            实体名
	 * @param flyEntity
	 *            实体值
	 * @return
	 */
	public String saveEntity(String entityName, FlyEntityMap flyEntity);

	/**
	 * 新增实体，并返回实体，包含实体所有子表数据
	 * 
	 * @param entityName
	 *            实体名
	 * @param flyEntity
	 *            实体值
	 * @return
	 */
	FlyEntityMap saveEntityAndReturn(String entityName, FlyEntityMap flyEntity);

	/**
	 * 修改实体，用flyEntity替换旧实体所有属性
	 * 
	 * @param entityName
	 *            实体名
	 * @param uid
	 *            主键
	 * @param flyEntity
	 *            实体
	 */
	public void updateEntity(String entityName, String uid, FlyEntityMap flyEntity);
	
	/**
	 * 修改并返回实体
	 * @param entityName
	 * @param uid
	 * @param flyEntity
	 */
	public FlyEntityMap updateEntityAndReturn(String entityName, String uid, FlyEntityMap flyEntity);

	/**
	 * 合并实体，用flyEntity的属性覆盖原有实体
	 * 
	 * @param entityName
	 *            实体名
	 * @param uid
	 *            主键
	 * @param flyEntity
	 *            覆盖属性
	 */
	public void mergeEntity(String entityName, String uid, FlyEntityMap flyEntity);
	
	/**
	 * 合并并返回实体
	 * @param entityName
	 * @param uid
	 * @param flyEntity
	 */
	public FlyEntityMap mergeEntityAndReturn(String entityName, String uid, FlyEntityMap flyEntity);

	/**
	 * 查询所有实体
	 * 
	 * @param entityName
	 *            实体名
	 * @return
	 */
	public List<FlyEntityMap> findAll(String entityName);

	/**
	 * 查询单个实体，控制子表返回
	 * 
	 * @param entityName
	 *            实体名
	 * @param uid
	 *            主键
	 * @param hasSubTable
	 *            是否包含子表
	 * @param subTableAttrs
	 *            如果包含子表，此属性指定具体子表；为null时表示所有子表
	 * @return
	 */
	public FlyEntityMap find(String entityName, String uid, boolean hasSubTable, String[] subTableAttrs);

	/**
	 * 查找全部数据
	 * @param entityName
	 * @param hasSubTable
	 * @param subTableAttrs
	 * @return
	 */
	public List<FlyEntityMap> findAll(String entityName, boolean hasSubTable, String[] subTableAttrs);
	
	/**
	 * 按params过滤查询实体
	 * @param entityName
	 * @param params
	 * @return
	 */
	public List<FlyEntityMap> findByExample(String entityName, FlyEntityMap example);
	
	/**
	 * 
	 * @param entityName
	 * @param spec
	 * @param pageable
	 * @return
	 */
	public Page<FlyEntityMap> findAll(String entityName, Specification<?> spec, Pageable pageable);
}
