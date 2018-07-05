package org.myfly.platform.core.flydata.internal;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.system.domain.IKeyEntity;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

/**
 * 通用数据访问服务
 * 
 * @author xiangwanhong
 *
 */

@Service
public class JpaDataAccessService implements IJpaDataAccessService {
	@Autowired
	private EntityManager entityManager;
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	@SuppressWarnings("rawtypes")
	public <T> SimpleJpaRepository getSimpleJpaRepository(final Class<T> entityClass) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		return new SimpleJpaRepository<>(entityClass, entityManager);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.system.service.IDataAccessService#findOne(java.lang.
	 * Class, java.io.Serializable)
	 */
	@Override
	public <T> T findOne(final Class<T> entityClass, final Serializable uid) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		AssertUtil.parameterEmpty(uid, "uid");
		return entityManager.find(entityClass, uid);
		// return (T) getSimpleJpaRepository(entityClass).getOne(uid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#refresh(java.
	 * lang.Object)
	 */
	@Override
	public <T> void refresh(T entity) {
		entityManager.refresh(entity);
	}

	@Override
	public <T> T findOne(Class<T> entityClass, Map<String, Object> keyParams) {
		return findOne(entityClass,
				AppUtil.getEntityMetaData(entityClass.getName()).getPkFieldDefinition().buildPK(keyParams));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.system.service.IDataAccessService#delOne(java.lang.
	 * Class, java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> void delOne(Class<T> entityClass, Serializable uid) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		AssertUtil.parameterEmpty(uid, "uid");
		getSimpleJpaRepository(entityClass).delete(uid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.system.service.IDataAccessService#delOne(java.lang.
	 * Object)
	 */
	@Override
	public <T> void delOne(T entity) {
		AssertUtil.parameterEmpty(entity, "entity");
		entityManager.remove(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#delAll(java.
	 * lang.Class)
	 */
	@Override
	public <T> void delAll(Class<T> entityClass) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		getSimpleJpaRepository(entityClass).deleteAllInBatch();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.system.service.IDataAccessService#saveEntity(org.myfly
	 * .platform.system.domain.IKeyEntity)
	 */
	@Override
	public <T> T saveEntity(final T entity) {
		AssertUtil.parameterEmpty(entity, "entity");
		beforeInsertFlyEntity(entity);
		entityManager.persist(entity);
		return entity;
		// return (T) getSimpleJpaRepository(entity.getClass()).save(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.system.service.IDataAccessService#saveEntity(java.lang
	 * .String, java.util.Map)
	 */
	@Override
	public <T> T saveEntity(Class<T> entityClass, Map<String, Object> values) {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(entityClass.getName());
		return internalSaveEntity(metaData.getEntityName(), values, metaData);
	}

	/**
	 * 新增实体保存
	 * 
	 * @param tableName
	 * @param values
	 * @param metaData
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private <T> T internalSaveEntity(final String tableName, final Map<String, Object> values,
			EntityMetaData metaData) {
		T entity = null;
		try {
			// 新增模式
			entity = EntityUtil.buildNewEntity(tableName, metaData, values);
			beforeInsertFlyEntity(entity);
			entity = saveEntity(entity);
		} catch (Exception e) {
			throw new RuntimeException("保存实体[" + tableName + "]失败，错误信息：" + e.getMessage());
		}
		return entity;
	}

	@Override
	public <T> T updateEntity(Class<T> entityClass, Serializable uid, Map<String, Object> values) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		AssertUtil.parameterEmpty(uid, "uid");
		T entity = findOne(entityClass, uid);
		EntityUtil.updateEntity(entity, null, values);
		return saveEntity(entity);
	}

	@Override
	public <T> T updateEntity(T entity) {
		AssertUtil.parameterEmpty(entity, "entity");
		return entityManager.merge(entity);
		// return (T) getSimpleJpaRepository(entity.getClass()).save(entity);
	}

	@Override
	public <T> T updateEntity(Serializable uid, T entity) {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(entity.getClass().getName());
		metaData.getPkFieldDefinition().getValueHandler().setFieldValue(entity, uid);
		return updateEntity(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#count(java.lang
	 * .Class, org.springframework.data.jpa.domain.Specifications)
	 */
	@Override
	public long count(Class entityClass, Specifications specifications) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		return getSimpleJpaRepository(entityClass).count(specifications);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.system.service.IDataAccessService#findAll(java.lang.
	 * Class)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findAll(Class<T> entityClass) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		return getSimpleJpaRepository(entityClass).findAll();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findAll(Class<T> entityClass, Specifications<?> spec, Sort sort) {
		return getSimpleJpaRepository(entityClass).findAll(spec, sort);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.system.service.IDataAccessService#findAll(java.lang.
	 * Class, org.springframework.data.domain.Pageable)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> Page<T> findAll(Class<T> entityClass, Pageable pageable) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		return getSimpleJpaRepository(entityClass).findAll(pageable);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#findAll(java.
	 * lang.Class, org.springframework.data.jpa.domain.Specifications,
	 * org.springframework.data.domain.Pageable)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> Page<T> findAll(Class<T> entityClass, Specifications<?> spec, Pageable pageable) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		return getSimpleJpaRepository(entityClass).findAll(spec, pageable);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#findAll(java.
	 * lang.Class, java.util.Map)
	 */
	@Override
	public <T> List<T> findAll(Class<T> entityClass, Map<String, Object> params) {
		return findAll(entityClass, QuerySpecificationUtil.buildQuerySpecifications(params), (Sort) null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#findAll(java.
	 * lang.Class, java.util.Map, org.springframework.data.domain.Pageable)
	 */
	@Override
	public <T> Page<T> findAll(Class<T> entityClass, Map<String, Object> params, Pageable pageable) {
		return findAll(entityClass, QuerySpecificationUtil.buildQuerySpecifications(params), pageable);
	}

	@Override
	public <T> void batchSaveEntity(List<T> batchList) {
		if (CollectionUtils.isNotEmpty(batchList)) {
			getSimpleJpaRepository(batchList.get(0).getClass()).save(batchList);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.system.service.IDataAccessService#transNameToUID(java.
	 * lang.String, java.lang.String)
	 */
	@Override
	public String transNameToUID(final String tableName, final String name) {
		AssertUtil.parameterEmpty(tableName, "tableName");
		AssertUtil.parameterEmpty(name, "name");
		Map<String, Object> params = new HashMap<>();
		params.put("name", name);
		List<? extends IKeyEntity> items = null;
		// findAll(tableName, params);
		if (items.size() != 1) {
			AssertUtil.parameterInvalide("name",
					"实体[" + tableName + "]只能有一条记录Name=[" + name + "]，实际是[" + items.size() + "]条");
		}
		return items.get(0).getUid();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.system.service.IDataAccessService#transUIDToName(java.
	 * lang.String, java.lang.String)
	 */
	@Override
	public String transUIDToName(final String tableName, final String uid) {
		// TODO transUIDToName
		return null;
		// AssertUtil.parameterEmpty(tableName, "tableName");
		// AssertUtil.parameterEmpty(uid, "uid");
		// SBaseEntity entity = findOne(tableName, uid);
		// AssertUtil.recordNotFound(entity, tableName, "uid", uid);
		// return entity.getName();
	}

	@Override
	public void flush() {
		entityManager.flush();
	}

	/**
	 * 新增FlyEntity实体前，自动填充数据
	 * 
	 * @param entity
	 */
	private void beforeInsertFlyEntity(Object entity) {
		IKeyEntity entity2 = null;
		if (entity instanceof IKeyEntity) {
			entity2 = (IKeyEntity) entity;
			if (StringUtils.isBlank(entity2.getUid())) {
				entity2.setUid(UUIDUtil.newUUID());
			}
		}
	}
}
