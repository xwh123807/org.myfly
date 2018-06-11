package org.myfly.platform.core.metadata.entity;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.Entity;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.builder.DefaultFormViewBuilder;
import org.myfly.platform.core.metadata.builder.DefaultListViewBuilder;
import org.myfly.platform.core.metadata.builder.DefaultOutlineViewBuilder;
import org.myfly.platform.core.metadata.define.FKFieldDefinition;
import org.myfly.platform.core.metadata.define.FormDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.define.OutlineDefinition;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.FuncUtil;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 实体元模型<br>
 * 实体元模型定义有以下三种方式：<br>
 * 1、实体类，JPA实现，使用到@Entity注解; <br>
 * 2、空类，JDBC实现，在类上增加注解@MeataDataView注解; TODO 还未实现<br>
 * 3、JDBC实现，从代码构建、或从json反序列化构建MetaDataDefinition； TODO 还未实现<br>
 * 
 * @author xiangwanhong
 *
 */
public class EntityMetaData {
	/**
	 * 实体名称，实体的唯一标示，不能重复，如果是实体类，entityName为类名称
	 */
	private String entityName;
	/**
	 * 实体类名，为空时表示没有对应实体类
	 */
	private Class<?> entityClass;
	/**
	 * 是否为Jpa实体类
	 */
	private boolean isJpaEntity;
	/**
	 * 本实体定义的字段列表
	 */
	private Map<String, EntityFieldDefinition> fieldMap;
	/**
	 * 表单、或子表中用到的非本实体字段<br>
	 * 第一个Map标识实体名称，实体的entityName值 <br>
	 * 第二个Map标识属性名称 <br>
	 */
	private Map<String, Map<String, EntityFieldDefinition>> extFieldMap;
	/**
	 * 表基本信息
	 */
	private EntityTableDefinition tableDefinition;
	/**
	 * 列表视图定义
	 */
	private Map<String, EntityListDefinition> listDefinitions;
	/**
	 * 表单实体定义
	 */
	private Map<String, EntityFormDefinition> formDefinitions;
	/**
	 * 摘要视图定义
	 */
	private Map<String, EntityOutlineDefinition> outlineDefinitions;
	/**
	 * 主键定义
	 */
	private PKFieldDefinition pkFieldDefinition;
	/**
	 * 外键定义,查找关系
	 */
	private Map<String, FKFieldDefinition> fkFieldDefinitions;

	/**
	 * 从类中构建实体元模型 <br>
	 * 
	 * @param entityClass
	 */
	public EntityMetaData(Class<?> entityClass) {
		EntityMetaDataDefinition metaData = new EntityMetaDataDefinition(entityClass);
		setEntityClass(entityClass);
		setJpaEntity(entityClass.getAnnotation(Entity.class) != null);
		setEntityName(metaData.getName());
		//字段
		fieldMap = new HashMap<>();
		FuncUtil.forEach(metaData.getTableDefinition().getFields(), fieldDefinition -> {
			addFieldDefinition((EntityFieldDefinition) fieldDefinition);
		});
		//表
		setTableDefinition(new EntityTableDefinition(this, metaData.getTableDefinition()));
		setPkFieldDefinition(metaData.getPkFieldDefinition());
		setFkFieldDefinitions(metaData.getTableDefinition().getFkFieldDefinitions());
		//formDefinitions
		formDefinitions = new HashMap<>();
		FuncUtil.forEach(metaData.getFormDefinitions(), formDefinition -> {
			addFormDefinition(formDefinition);
		});
		//listDefinitions
		listDefinitions = new HashMap<>();
		FuncUtil.forEach(metaData.getListDefinitions(), listDefinition -> {
			addListDefinition(listDefinition);
		});
		//outlineDefinitions
		outlineDefinitions = new HashMap<>();
		FuncUtil.forEach(metaData.getOutlineDefinitions(), outlineDefinition -> {
			addOutlineDefinition(outlineDefinition);
		});
		addDefaultDefinition(this);
		validate();
	}

	/**
	 * 构建缺省视图
	 * 
	 * @param entityMetaData
	 */
	private void addDefaultDefinition(EntityMetaData entityMetaData) {
		addListDefinition(new ListDefinition(new DefaultListViewBuilder(entityMetaData)));
		addFormDefinition(new FormDefinition(new DefaultFormViewBuilder(entityMetaData)));
		addOutlineDefinition(new OutlineDefinition(new DefaultOutlineViewBuilder(entityMetaData)));
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Class<?> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<?> entityClass) {
		this.entityClass = entityClass;
	}

	public Map<String, EntityFieldDefinition> getFieldMap() {
		return fieldMap;
	}

	public EntityTableDefinition getTableDefinition() {
		return tableDefinition;
	}

	public void setTableDefinition(EntityTableDefinition tableDefinition) {
		this.tableDefinition = tableDefinition;
	}

	public Map<String, EntityListDefinition> getListDefinitions() {
		return listDefinitions;
	}

	public Map<String, EntityFormDefinition> getFormDefinitions() {
		return formDefinitions;
	}

	public Map<String, EntityOutlineDefinition> getOutlineDefinitions() {
		return outlineDefinitions;
	}

	public PKFieldDefinition getPkFieldDefinition() {
		return pkFieldDefinition;
	}

	public void setPkFieldDefinition(PKFieldDefinition pkFieldDefinition) {
		this.pkFieldDefinition = pkFieldDefinition;
	}

	public Map<String, FKFieldDefinition> getFkFieldDefinitions() {
		return fkFieldDefinitions;
	}

	public void setFkFieldDefinitions(Map<String, FKFieldDefinition> fkFieldDefinitions) {
		this.fkFieldDefinitions = fkFieldDefinitions;
	}

	private void addFieldDefinition(EntityFieldDefinition fieldDefinition) {
		AssertUtil.parameterEmpty(fieldDefinition, "fieldDefinition");
		AssertUtil.parameterEmpty(fieldDefinition.getName(), "fieldDefinition.getName()");
		if (getFieldMap().containsKey(fieldDefinition.getName())) {
			AssertUtil.parameterInvalide("fieldDefinition",
					"名称为[" + fieldDefinition.getName() + "]FieldDefinition已经存在，请检查实体[" + getEntityName() + "]元模型定义.");
		}
		fieldDefinition.setParent(this);
		getFieldMap().put(fieldDefinition.getName(), fieldDefinition);
	}

	/**
	 * 增加表单视图定义
	 * 
	 * @param formDefinition
	 */
	private void addFormDefinition(FormDefinition formDefinition) {
		AssertUtil.parameterEmpty(formDefinition, "formDefinition");
		AssertUtil.parameterEmpty(formDefinition.getName(), "formDefinition.getName()");
		if (getFormDefinitions().containsKey(formDefinition.getName())) {
			AssertUtil.parameterInvalide("formDefinition",
					"名称为[" + formDefinition.getName() + "]FormDefinition已经存在，请检查实体[" + getEntityName() + "]元模型定义.");
		}
		EntityFormDefinition definition = new EntityFormDefinition(this, formDefinition);
		definition.config();
		getFormDefinitions().put(definition.getName(), definition);
	}

	/**
	 * 增加表单视图定义
	 * 
	 * @param formDefinition
	 */
	private void addOutlineDefinition(OutlineDefinition outlineDefinition) {
		AssertUtil.parameterEmpty(outlineDefinition, "outlineDefinition");
		AssertUtil.parameterEmpty(outlineDefinition.getName(), "outlineDefinition.getName()");
		if (getOutlineDefinitions().containsKey(outlineDefinition.getName())) {
			AssertUtil.parameterInvalide("outlineDefinition", "名称为[" + outlineDefinition.getName()
					+ "]OutlineDefinition已经存在，请检查实体[" + getEntityName() + "]元模型定义.");
		}
		EntityOutlineDefinition definition = new EntityOutlineDefinition(outlineDefinition);
		getOutlineDefinitions().put(outlineDefinition.getName(), definition);
	}

	/**
	 * 增加列表视图定义
	 * 
	 * @param listDefinition
	 */
	private void addListDefinition(final ListDefinition listDefinition) {
		AssertUtil.parameterEmpty(listDefinition, "listDefinition");
		AssertUtil.parameterEmpty(listDefinition.getName(), "listDefinition.getName()");
		if (getListDefinitions().containsKey(listDefinition.getName())) {
			AssertUtil.parameterInvalide("listDefinition",
					"名称为[" + listDefinition.getName() + "]ListDefinition已经存在，请检查实体[" + getEntityName() + "]元模型定义.");
		}
		EntityListDefinition definition = new EntityListDefinition(this, listDefinition);
		definition.config();
		getListDefinitions().put(definition.getName(), definition);
	}

	@SuppressWarnings("unchecked")
	public <T extends EntityFieldDefinition> T getField(String name) {
		return (T) getFieldMap().get(name);
	}

	/**
	 * 获取指定表单视图
	 * 
	 * @param formViewName
	 * @return
	 */
	@JsonIgnore
	public EntityFormDefinition getFormDefinition(String formViewName) {
		return getDefinition(formViewName, getFormDefinitions());
	}

	/**
	 * 获取指定列表视图
	 * 
	 * @param listViewName
	 * @return
	 */
	@JsonIgnore
	public EntityListDefinition getListDefinition(String listViewName) {
		return getDefinition(listViewName, getListDefinitions());
	}

	/**
	 * 获取指定大纲视图
	 * 
	 * @param outlineViewName
	 * @return
	 */
	@JsonIgnore
	public OutlineDefinition getOutlineDefinition(String outlineViewName) {
		return getDefinition(outlineViewName, getOutlineDefinitions());
	}

	/**
	 * 获取指定视图单定义 <br>
	 * 1、如果存在指定视图名，则直接返回 <br>
	 * 2、如果formViewName为空，则返回default，如果还没有则返回all <br>
	 * 
	 * @param formViewName
	 * @return
	 */
	private <T> T getDefinition(String viewName, Map<String, T> items) {
		if (StringUtils.isNotBlank(viewName) && items.containsKey(viewName)) {
			return items.get(viewName);
		} else {
			return items.containsKey(EntityMetaDataConstants.DEFAULT_NAME)
					? items.get(EntityMetaDataConstants.DEFAULT_NAME)
					: items.get(EntityMetaDataConstants.DEFAULT_ALL_NAME);
		}
	}

	/**
	 * 获取实体字段定义，不包含子表属性
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@JsonIgnore
	public <T extends EntityFieldDefinition> T[] getAllFields() {
		return (T[]) getFieldMap().values().stream()
				.filter(item -> !item.getDataType().equals(FieldDataType.MDRELATION)).collect(Collectors.toList())
				.toArray(new EntityFieldDefinition[] {});
	}

	/**
	 * 创建实体实例
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T newEntityInstance() {
		if (getEntityClass() == null) {
			return null;
		}
		try {
			return (T) getEntityClass().newInstance();
		} catch (Exception e) {
			AssertUtil.parameterInvalide(getEntityClass().getName(), "创建实体实例失败，" + e.getMessage());
		}
		return null;
	}

	/**
	 * 创建实体实例，并设置主键值
	 * 
	 * @param uid
	 * @return
	 */
	public <T> T newEntityInstance(String uid) {
		Object entity = newEntityInstance();
		getPkFieldDefinition().getValueHandler().setFieldValue(entity, uid);
		return (T) entity;
	}

	/**
	 * 获取标签字段定义
	 * 
	 * @return
	 */
	@JsonIgnore
	public EntityFieldDefinition getLableField() {
		return getField(getTableDefinition().getLabelField());
	}

	public boolean isJpaEntity() {
		return isJpaEntity;
	}

	public void setJpaEntity(boolean isJpaEntity) {
		this.isJpaEntity = isJpaEntity;
	}

	/**
	 * 获取字段定义
	 * 
	 * @param fields
	 * @return
	 */
	@JsonIgnore
	public EntityFieldDefinition[] getFields(String[] fields) {
		return Stream.of(fields).map(name -> getField(name)).collect(Collectors.toList())
				.toArray(new EntityFieldDefinition[] {});
	}

	/**
	 * 获取属性名
	 * 
	 * @return
	 */
	@JsonIgnore
	public String[] getFieldNames() {
		EntityFieldDefinition[] fields = getAllFields();
		return Stream.of(fields).map(item -> item.getName()).collect(Collectors.toList()).toArray(new String[] {});
	}

	/**
	 * 获取子表实体元模型
	 * 
	 * @param subTableAttr
	 * @return
	 */
	@JsonIgnore
	public EntityMetaData getSubEntityMetaData(String subTableAttr) {
		MDRelationFieldDefinition mdRelation = getField(subTableAttr);
		return AppUtil.getEntityMetaData(mdRelation.getRelationClass());
	}

	public Map<String, Map<String, EntityFieldDefinition>> getExtFieldMap() {
		return extFieldMap;
	}

	public void setExtFieldMap(Map<String, Map<String, EntityFieldDefinition>> extFieldMap) {
		this.extFieldMap = extFieldMap;
	}

	/**
	 * 获取当前表单定义的扩展字段
	 * 
	 * @param name
	 * @return
	 */
	public EntityFieldDefinition getFormExtField(String name) {
		return getExtFieldMap().get(getEntityName()).get(name);
	}

	/**
	 * 获取子表定义的扩展字段，如果子表不存在或属性不存在都返回为空
	 * 
	 * @param subTableAttr
	 * @param name
	 * @return
	 */
	public EntityFieldDefinition getSubTableExtField(String subTableAttr, String name) {
		Map<String, EntityFieldDefinition> fields = getExtFieldMap().get(subTableAttr);
		if (MapUtils.isNotEmpty(fields)) {
			return fields.get(name);
		} else {
			return null;
		}
	}

	/**
	 * 获取子表字段定义信息
	 * 
	 * @param formViewName
	 * @param subTableAttr
	 * @return
	 */
	public EntityFieldDefinition[] getSubTableFieldDefinitions(String formViewName, String subTableAttr) {
		return getFormDefinition(formViewName).getSubTableDefinitions().get(subTableAttr).getFieldDefinitions();
	}

	/**
	 * 根据字段数据库名称获取对应属性名称
	 * 
	 * @param dbFieldName
	 * @return
	 */
	public EntityFieldDefinition getFieldByFieldName(String dbFieldName) {
		for (EntityFieldDefinition field : getFieldMap().values()) {
			if (field.getFieldName().equalsIgnoreCase(dbFieldName)) {
				return field;
			}
		}
		return null;
	}

	/**
	 * 验证 <br>
	 * 1、验证列表视图中字段是否都存在；<br>
	 * 2、验证表单视图中字段是否都存在；<br>
	 * 3、验证大纲视图中字段是否都存在<br>
	 */
	public void validate() {
		Assert.hasLength(getEntityName(), "属性[entityName]不能为空.");
		Assert.hasLength(getEntityName(), "属性[entityClass]不能为空.");
		Assert.notNull(getTableDefinition(), "属性[tableDefinition]不能为空.");
		getTableDefinition().validate();
		Assert.notNull(getPkFieldDefinition(), "属性[pkFieldDefinition]不能为空.");
		getPkFieldDefinition().validate();
		Assert.isTrue(MapUtils.isNotEmpty(getFieldMap()), "属性[fieldMap]不能为空.");
		Assert.isTrue(MapUtils.isNotEmpty(getListDefinitions()) && (getListDefinitions().size() > 0),
				"属性[listDefinitions]不能为空，且长度至少为1.");
		Assert.isTrue(MapUtils.isNotEmpty(getFormDefinitions()) && (getFormDefinitions().size() > 0),
				"属性[formDefinitions]不能为空，且长度至少为1.");
		Assert.isTrue(MapUtils.isNotEmpty(getOutlineDefinitions()) && (getOutlineDefinitions().size() > 0),
				"属性[outlineDefinitions]不能为空，且长度至少为1.");

		getFieldMap().values().forEach(item -> item.validate());
		getListDefinitions().values().forEach(item -> {
			item.validate();
			Stream.of(item.getFields()).forEach(name -> {
				if (!getFieldMap().containsKey(name)) {
					throw new RuntimeException(MessageFormat.format("实体[{0}]中名称为[{1}]列表视图中不存在[{2}]字段.", getEntityName(),
							item.getName(), name));
				}
			});
		});
		getFormDefinitions().values().forEach(item -> {
			item.validate();
			Stream.of(item.getFields()).forEach(name -> {
				if (!getFieldMap().containsKey(name)) {
					throw new RuntimeException(MessageFormat.format("实体[{0}]中名称为[{1}]表单视图中不存在[{2}]字段.", getEntityName(),
							item.getName(), name));
				}
			});
		});
		// getOutlineDefinitions().values().forEach(item -> {
		// item.validate();
		// Stream.of(item.getFields()).forEach(name -> {
		// if (!getFieldMap().containsKey(name)) {
		// throw new
		// RuntimeException(MessageFormat.format("实体[{0}]中名称为[{1}]摘要视图中不存在[{2}]字段.",
		// getEntityName(),
		// item.getName(), name));
		// }
		// });
		// });
	}
	
	@Override
	public String toString() {
		return "entityName: " + getEntityName();
	}
}
