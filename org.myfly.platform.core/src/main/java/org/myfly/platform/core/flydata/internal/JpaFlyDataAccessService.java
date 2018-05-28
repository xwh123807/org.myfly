package org.myfly.platform.core.flydata.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.EntityQueryMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.metadata.annotation.SQLOperator;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.define.FilterDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.define.SubTableDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.MDRelationFieldDefinition;
import org.myfly.platform.core.metadata.entity.PKFieldDefinition;
import org.myfly.platform.core.system.domain.IKeyEntity;
import org.myfly.platform.core.utils.AssertUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service("jpaFlyDataAccessService")
@Transactional
public class JpaFlyDataAccessService extends AbstractFlyDataAccessService {
	@Override
	public <T> T findOne(String entityName, String uid) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		AssertUtil.parameterEmpty(uid, "uid");
		EntityMetaData metaData = getEntityMetaData(entityName);
		Serializable pkValue = metaData.getPkFieldDefinition().buildPK(uid);
		return (T) getJpaDataAccessService().findOne(metaData.getEntityClass(), pkValue);
	}

	@Override
	public <T> T findOne(String entityName, Map<String, Object> keyParams) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		Assert.notEmpty(keyParams);
		EntityMetaData metaData = getEntityMetaData(entityName);
		Serializable pkValue = metaData.getPkFieldDefinition().buildPK(keyParams);
		return (T) getJpaDataAccessService().findOne(metaData.getEntityClass(), pkValue);
	}

	@Override
	public <T> List<T> findAll2(String entityName, Map<String, Object> params) {
		return getJpaDataAccessService().findAll(getEntityClass(entityName), params);
	}

	@Override
	public FlyEntityMap findOne(String entityName, String uid, String formViewName, boolean printMode) {
		EntityMetaData entityMetaData = getEntityMetaData(entityName);
		Serializable pkValue = entityMetaData.getPkFieldDefinition().buildPK(uid);
		Object result = getJpaDataAccessService().findOne(entityMetaData.getEntityClass(), pkValue);
		if (result != null) {
			if (result instanceof IKeyEntity) {
				try {
					String value = ((IKeyEntity) result).getUid();
					Assert.hasLength(value);
				} catch (Exception e) {
					return null;
				}
			}
			return convertToViewMap(entityName, null, null, result,
					entityMetaData.getFormDefinition(formViewName).getFields(), formViewName, uid, formViewName,
					printMode);
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public long count(String entityName, String listViewName, EntityQueryMap params) {
		Specifications specifications = getEntityQuerySpecifications(entityName, listViewName, params);
		return getJpaDataAccessService().count(getEntityClass(entityName), specifications);
	}

	@Override
	public long count(String entityName, String uid, String subTableAttr, String formViewName, EntityQueryMap params) {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean hasFilter(FilterDefinition[] filterDefinitions, String paramName) {
		if (ArrayUtils.isNotEmpty(filterDefinitions)) {
			for (FilterDefinition filter : filterDefinitions) {
				if (filter.getField().equals(paramName)) {

				}
			}
		}
		return false;
	}

	/**
	 * 获取实体查询定义
	 * 
	 * @param entityName
	 * @param params
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private Specifications getEntityQuerySpecifications(String entityName, String view, EntityQueryMap params) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		EntityMetaData metaData = getEntityMetaData(entityName);
		FilterDefinition[] filterDefinitions = metaData.getListDefinition(view).getFilters();
		// 添加没有在FilterDefinition中定义的过滤条件，缺省都为And，如果有多值缺省为In
		if (MapUtils.isNotEmpty(params)) {
			for (String paramName : params.keySet()) {
				FieldDefinition field = metaData.getField(paramName);
				if ((field != null) && !hasFilter(filterDefinitions, paramName)) {
					SQLOperator sqlOperator = (params.get(paramName).length == 1) ? SQLOperator.EQUAL : SQLOperator.IN;
					FilterDefinition filter = new FilterDefinition(field.getName(), sqlOperator);
					filterDefinitions = ArrayUtils.add(filterDefinitions, filter);
				}
			}
		}
		Specifications specifications = QuerySpecificationUtil.buildQuerySpecifications(metaData, filterDefinitions,
				params);
		return specifications;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Page<FlyEntityMap> findAll(String entityName, String listViewName, EntityQueryMap params, Pageable pageable,
			boolean printMode) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		EntityMetaData metaData = getEntityMetaData(entityName);
		ListDefinition listDefinition = metaData.getListDefinition(listViewName);
		Specifications specifications = getEntityQuerySpecifications(entityName, listViewName, params);
		Page<Object> pageData1 = (Page<Object>) getJpaDataAccessService().findAll(metaData.getEntityClass(),
				specifications, pageable);
		List list = new ArrayList<>();
		for (Object entity : pageData1.getContent()) {
			String pkValue = (String) metaData.getPkFieldDefinition().getValueHandler().getFieldValue(entity);
			list.add(convertToViewMap(entityName, null, null, entity, listDefinition.getFields(),
					listDefinition.getLabelField(), pkValue, listViewName, printMode));
		}
		return new PageImpl<>(list, pageable, pageData1.getTotalElements());
	}

	@Override
	public List<FlyEntityMap> findAllForSubEntity(String entityName, String uid, String subTableAttr,
			String formViewName, EntityQueryMap params, int page, int size, boolean printMode) {
		Pageable pageable = new PageRequest(page, size);
		return internalFindAllForSubEntity(entityName, uid, subTableAttr, formViewName, params, pageable, false,
				printMode);
	}

	@Override
	public List<FlyEntityMap> findAllForSubEntity(String entityName, String uid, String subTableAttr,
			String formViewName, EntityQueryMap params, boolean printMode) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		AssertUtil.parameterEmpty(uid, "uid");
		AssertUtil.parameterEmpty(subTableAttr, "subTableAttr");
		return internalFindAllForSubEntity(entityName, uid, subTableAttr, formViewName, params, null, false, printMode);
	}

	@Override
	public Page<FlyEntityMap> findAllForSubEntityWithPage(String entityName, String uid, String subTableAttr,
			String formViewName, EntityQueryMap params, Pageable pageable, boolean printMode) {
		AssertUtil.parameterEmpty(entityName, "entityName");
		AssertUtil.parameterEmpty(uid, "uid");
		AssertUtil.parameterEmpty(subTableAttr, "subTableAttr");
		return internalFindAllForSubEntity(entityName, uid, subTableAttr, formViewName, params, pageable, true,
				printMode);
	}

	/**
	 * 子表数据查询，根据needPageable参数控制返回数据是否分页
	 * 
	 * @param entityName
	 * @param uid
	 * @param subTableAttr
	 * @param params
	 * @param pageable
	 * @param needPageable
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private <T> T internalFindAllForSubEntity(String entityName, String uid, String subTableAttr, String view,
			EntityQueryMap params, Pageable pageable, boolean needPageable, boolean printMode) {

		EntityMetaData entityMetaData = getEntityMetaData(entityName);
		AssertUtil.parameterEmpty(entityMetaData, "entityMetaData");
		SubTableDefinition subTable = entityMetaData.getFormDefinition(view).getSubTableDefinition(subTableAttr);
		Assert.notNull(subTable, "实体[" + entityName + "]在视图[" + view + "]下没有显示定义子表[" + subTableAttr + "]");
		MDRelationFieldDefinition subField = entityMetaData.getField(subTableAttr);
		String subentityName = subField.getRelationClass();
		AssertUtil.parameterEmpty(subField, "subField", "实体[" + entityName + "]不存在属性[" + subTableAttr + "]");
		final String subTableField = subField.getRelationField();
		AssertUtil.parameterEmpty(subTableField, "subTableField");
		EntityMetaData subEntityMetaData = getEntityMetaData(subentityName);

		if (MapUtils.isEmpty(params)) {
			params = new EntityQueryMap();
		}
		if (FieldDataType.FLYMDRELATION.equals(subField.getDataType())) {
			params.put(subField.getRelationField(), new String[] { uid });
		}
		Specifications specifications = getEntityQuerySpecifications(subentityName, view, params);
		if (FieldDataType.MDRELATION.equals(subField.getDataType())) {
			try {
				final Object entity = entityMetaData.newEntityInstance(uid);
				Specification entityFilter = new Specification() {
					@Override
					public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cb) {
						return cb.equal(root.get(subTableField), entity);
					}
				};
				if (specifications == null) {
					specifications = Specifications.where(entityFilter);
				} else {
					specifications.and(entityFilter);
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("构造查询条件失败，错误信息：" + e.getMessage());
			}
		}
		PKFieldDefinition pkFieldDefinition = subEntityMetaData.getPkFieldDefinition();
		if (needPageable) {
			Page pageData1 = getJpaDataAccessService().findAll(getEntityClass(subentityName), specifications, pageable);
			List<Map<String, String>> list = new ArrayList<>();
			for (Object entity : pageData1.getContent()) {
				String pkValue = (String) pkFieldDefinition.getValueHandler().getFieldValue(entity);
				list.add(convertToViewMap(entityName, uid, subTableAttr, entity,
						entityMetaData.getSubTableFields(view, subTableAttr), subTable.getLabelField(), pkValue, view,
						printMode));
			}
			return (T) new PageImpl(list, pageable, pageData1.getTotalElements());
		} else {
			List result = (List) getJpaDataAccessService().findAll(getEntityClass(subentityName), specifications,
					(Sort) null);
			List list = new ArrayList<>();
			for (Object entity : result) {
				String pkValue = (String) pkFieldDefinition.getValueHandler().getFieldValue(entity);
				list.add(convertToViewMap(entityName, uid, subTableAttr, entity,
						entityMetaData.getSubTableFields(view, subTableAttr), subTable.getLabelField(), pkValue, view,
						printMode));
			}
			return (T) list;
		}
	}

	@Override
	public void delOne(String entityName, String uid) {
		getJpaDataAccessService().delOne(getEntityClass(entityName), uid);
	}

	@Override
	public void del(String entityName) {
		getJpaDataAccessService().delAll(getEntityClass(entityName));
	}

	@Override
	public String saveEntity(String entityName, String formViewName, EntityMap values) {
		Assert.hasLength(entityName);
		Assert.notEmpty(values);
		Object entity = values.newEntity(entityName, null);
		return saveEntity(entity);
	}

	@Override
	public <T> String saveEntity(T entity) {
		Assert.notNull(entity);
		getJpaDataAccessService().saveEntity(entity);
		return (String) getEntityMetaData(entity.getClass().getName()).getPkFieldDefinition().getValueHandler()
				.getFieldValue(entity);
	}

	@Override
	public String saveEntity(String entityName, Map<String, Object> values) {
		Object entity = EntityUtil.buildNewEntity(entityName, null, values);
		return saveEntity(entity);
	}

	@Override
	public String saveEntity(String entityName, String uid, String subTableAttr, String formViewName,
			EntityMap values) {
		Assert.notEmpty(values);
		Object entity = values.newSubEntity(entityName, uid, subTableAttr, null);
		return saveEntity(entity);
	}

	@Override
	public <T> void saveEntity(List<T> entities) {
		getJpaDataAccessService().batchSaveEntity(entities);
		// entities.forEach(item -> getJpaDataAccessService().saveEntity(item));
	}

	@Override
	public <T> void updateEntity(T entity) {
		Assert.notNull(entity);
		getJpaDataAccessService().updateEntity(entity);
	}

	@Override
	public void updateEntity(String entityName, String uid, String subTableAttr, String subUid, String formViewName,
			EntityMap values) {
		Assert.notEmpty(values);
		Object entity = values.newSubEntity(entityName, uid, subTableAttr, subUid);
		getJpaDataAccessService().updateEntity(entity);
	}

	@Override
	public void updateEntity(String entityName, String uid, String formViewName, EntityMap values) {
		Object entity = values.newEntity(entityName, uid);
		getJpaDataAccessService().updateEntity(uid, entity);
	}

	@Override
	public void updateEntity(String entityName, String uid, Map<String, Object> values) {
		getJpaDataAccessService().updateEntity(getEntityClass(entityName), uid, values);
	}

	@Override
	public long count(String entityName, Map<String, String> params) {
		return 0;
	}

	@Override
	public long count2(String entityName, Map<String, Object> params) {
		return getJpaDataAccessService().count(getEntityClass(entityName),
				QuerySpecificationUtil.buildQuerySpecifications(params));
	}
}
