package org.myfly.platform.core.flydata.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public interface IJpaDataAccessService {
	/**
	 * 获取JpaRepository
	 * 
	 * @param entityClass
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	<T> SimpleJpaRepository getSimpleJpaRepository(Class<T> entityClass);

	/**
	 * 查找指定表中主键UID对应的记录
	 * 
	 * @param entityClass
	 * @param uid
	 *            主键
	 * @return
	 */
	<T> T findOne(Class<T> entityClass, Serializable uid);
	
	/**
	 * 
	 * @param entityClass
	 * @param uid
	 * @return
	 */
	<T> boolean existsById(Class<T> entityClass, Serializable uid);
	
	/**
	 * 刷新实体
	 * @param entity
	 */
	<T> void refresh(T entity);
	
	/**
	 * 按主键查找实体
	 * @param entityClass
	 * @param keyParams
	 * @return
	 */
	<T> T findOne(Class<T> entityClass, Specification<?> specifications);
	/**
	 * 查找指定表中所有的数据
	 * 
	 * @param entityClass
	 * @return
	 */
	<T> List<T> findAll(Class<T> entityClass);

	/**
	 * 查找指定表中所有数据，分页返回
	 * 
	 * @param tableName
	 * @param pageable
	 * @return
	 */
	<T> Page<T> findAll(Class<T> entityClass, Pageable pageable);

	/**
	 * 删除实体
	 * 
	 * @param entity
	 */
	<T> void delOne(T entity);

	/**
	 * 
	 * @param entityClass
	 * @param uid
	 */
	<T> void delOne(Class<T> entityClass, Serializable uid);

	/**
	 * 删除所有实体
	 * 
	 * @param entityClass
	 */
	<T> void delAll(Class<T> entityClass);

	/**
	 * 保存实体
	 * 
	 * @param entity
	 * @return
	 */
	<T> T saveEntity(T entity);

	/**
	 * 保存实体，返回保存后的实体，values中已经设置好主键
	 * 
	 * @param tableName
	 * @param values
	 * @return
	 */
	<T> T saveEntity(Class<T> entityClass, Map<String, Object> values);

	/**
	 * 修改实体，只覆盖部分属性
	 * 
	 * @param tableName
	 * @param values
	 * @return
	 */
	<T> T updateEntity(Class<T> entityClass, Serializable uid, Map<String, Object> values);

	/**
	 * 修改实体，用新实体替换原有实体
	 * 
	 * @param uid
	 * @param entity
	 * @return
	 */
	<T> T updateEntity(Serializable uid, T entity);

	/**
	 * 修改实体，用新实体替换原有实体
	 * 
	 * @param entity
	 * @return
	 */
	<T> T updateEntity(T entity);

	/**
	 * 批量保存实体
	 * 
	 * @param batchList
	 */
	<T> void batchSaveEntity(final List<T> batchList);

	/**
	 * 统计实体记录数
	 * 
	 * @param entityClass
	 * @param specifications
	 * @return
	 */
	long count(Class<?> entityClass, Specification<?> specifications);

	/**
	 * 分页查询实体数据
	 * 
	 * @param entityClass
	 *            主实体名
	 * @param spec
	 *            查询定义
	 * @param pageable
	 * @return
	 */
	<T> Page<T> findAll(Class<T> entityClass, Specification<?> spec, Pageable pageable);

	/**
	 * 实体数据查询，返回满足条件的所有记录
	 * 
	 * @param entityClass
	 * @param spec
	 * @return
	 */
	<T> List<T> findAll(Class<T> entityClass, Specification<?> spec, Sort sort);
	
	/**
	 * 实体数据查询
	 * @param entityClass
	 * @param spec
	 * @return
	 */
	<T> List<T> findAll(Class<T> entityClass, Specification<?> spec);

	/**
	 * 实体数据查询
	 * 
	 * @param tableName
	 * @param params
	 * @return
	 */
	<T> List<T> findAll(Class<T> entityClass, Map<String, Object> params);

	/**
	 * 实体数据分页查询
	 * 
	 * @param tableName
	 * @param params
	 * @param pageable
	 * @return
	 */
	<T> Page<T> findAll(Class<T> entityClass, Map<String, Object> params, Pageable pageable);

	/**
	 * 刷新数据，将事务提交
	 */
	void flush();

}
