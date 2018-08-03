package org.myfly.platform.core.flydata.internal;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.utils.AssertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 通用数据访问服务
 * 
 * @author xiangwanhong
 *
 */

@Service
@Transactional(readOnly = true)
public class JpaDataAccessService implements IJpaDataAccessService {
	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("rawtypes")
	public <T> SimpleJpaRepository getSimpleJpaRepository(final Class<T> entityClass) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		return new SimpleJpaRepository<>(entityClass, entityManager);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#existsById(java
	 * .lang.Class, java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> boolean existsById(Class<T> entityClass, Serializable uid) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		AssertUtil.parameterEmpty(uid, "uid");
		return getSimpleJpaRepository(entityClass).existsById(uid);
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
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.system.service.IDataAccessService#delOne(java.lang.
	 * Class, java.io.Serializable)
	 */
	@Override
	public <T> void delOne(Class<T> entityClass, Serializable uid) {
		AssertUtil.parameterEmpty(entityClass, "entityClass");
		AssertUtil.parameterEmpty(uid, "uid");
		entityManager.remove(null);
		// getSimpleJpaRepository(entityClass).delete(uid);
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
		// getSimpleJpaRepository(entity.getClass()).delete(entity);
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
	@Transactional
	public <T> T saveEntity(final T entity) {
		AssertUtil.parameterEmpty(entity, "entity");
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
		return null;
	}

	@Override
	public <T> T updateEntity(Class<T> entityClass, Serializable uid, Map<String, Object> values) {
		return null;
	}

	@Override
	public <T> T updateEntity(T entity) {
		AssertUtil.parameterEmpty(entity, "entity");
		return entityManager.merge(entity);
		// return (T) getSimpleJpaRepository(entity.getClass()).save(entity);
	}

	@Override
	public <T> T updateEntity(Serializable uid, T entity) {
		return entity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#count(java.lang
	 * .Class, org.springframework.data.jpa.domain.Specifications)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public long count(Class<?> entityClass, Specification<?> specifications) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core.flydata.service.IJpaDataAccessService#findAll(java.
	 * lang.Class, org.springframework.data.jpa.domain.Specification)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findAll(Class<T> entityClass, Specification<?> spec) {
		return getSimpleJpaRepository(entityClass).findAll(spec);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findAll(Class<T> entityClass, Specification<?> spec, Sort sort) {
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
	public <T> Page<T> findAll(Class<T> entityClass, Specification<?> spec, Pageable pageable) {
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
		return null;
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
		return null;
	}

	@Override
	public <T> void batchSaveEntity(List<T> batchList) {
		if (CollectionUtils.isNotEmpty(batchList)) {
			// getSimpleJpaRepository(batchList.get(0).getClass()).save(batchList);
			batchList.forEach(item -> {
				entityManager.persist(item);
			});
		}
	}

	@Override
	public void flush() {
		entityManager.flush();
	}
}
