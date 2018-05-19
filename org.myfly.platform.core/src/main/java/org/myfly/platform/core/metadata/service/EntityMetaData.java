package org.myfly.platform.core.metadata.service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.define.FKFieldDefinition;
import org.myfly.platform.core.metadata.define.FormDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.define.OutlineDefinition;
import org.myfly.platform.core.metadata.define.PKFieldDefinition;
import org.myfly.platform.core.metadata.define.TableDefinition;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaDataDefinition;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.FuncUtil;

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
	 * 字段列表
	 */
	private Map<String, EntityFieldDefinition> fieldMap;
	/**
	 * 表基本信息
	 */
	private TableDefinition tableDefinition;
	/**
	 * 列表视图定义
	 */
	private Map<String, ListDefinition> listDefinitions;
	/**
	 * 表单实体定义
	 */
	private Map<String, FormDefinition> formDefinitions;
	/**
	 * 摘要视图定义
	 */
	private Map<String, OutlineDefinition> outlineDefinitions;
	/**
	 * 主键定义
	 */
	private PKFieldDefinition pkFieldDefinition;
	/**
	 * 外键定义,查找关系
	 */
	private Map<String, FKFieldDefinition> fkFieldDefinitions;

	public EntityMetaData(Class<?> entityClass) {
		EntityMetaDataDefinition metaData = new EntityMetaDataDefinition(entityClass);
		setEntityClass(entityClass);
		setEntityName(metaData.getName());
		setTableDefinition(metaData.getTableDefinition());
		setPkFieldDefinition(metaData.getTableDefinition().getPrimaryKey());
		setFkFieldDefinitions(metaData.getTableDefinition().getFkFieldDefinitions());
		fieldMap = new HashMap<>();
		FuncUtil.forEach(metaData.getTableDefinition().getFields(), fieldDefinition -> {
			addFieldDefinition((EntityFieldDefinition) fieldDefinition);
		});
		formDefinitions = new HashMap<>();
		FuncUtil.forEach(metaData.getFormDefinitions(), formDefinition -> {
			addFormDefinition(formDefinition);
		});
		listDefinitions = new HashMap<>();
		FuncUtil.forEach(metaData.getListDefinitions(), listDefinition -> {
			addListDenifition(listDefinition);
		});
		outlineDefinitions = new HashMap<>();
		FuncUtil.forEach(metaData.getOutlineDefinitions(), outlineDefinition -> {
			addOutlineDefinition(outlineDefinition);
		});
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

	public TableDefinition getTableDefinition() {
		return tableDefinition;
	}

	public void setTableDefinition(TableDefinition tableDefinition) {
		this.tableDefinition = tableDefinition;
	}

	public Map<String, ListDefinition> getListDefinitions() {
		return listDefinitions;
	}

	public Map<String, FormDefinition> getFormDefinitions() {
		return formDefinitions;
	}

	public Map<String, OutlineDefinition> getOutlineDefinitions() {
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
		getFormDefinitions().put(formDefinition.getName(), formDefinition);
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
		getOutlineDefinitions().put(outlineDefinition.getName(), outlineDefinition);
	}

	/**
	 * 增加列表视图定义
	 * 
	 * @param listDefinition
	 */
	private void addListDenifition(final ListDefinition listDefinition) {
		AssertUtil.parameterEmpty(listDefinition, "listDefinition");
		AssertUtil.parameterEmpty(listDefinition.getName(), "listDefinition.getName()");
		if (getListDefinitions().containsKey(listDefinition.getName())) {
			AssertUtil.parameterInvalide("listDefinition",
					"名称为[" + listDefinition.getName() + "]ListDefinition已经存在，请检查实体[" + getEntityName() + "]元模型定义.");
		}
		getListDefinitions().put(listDefinition.getName(), listDefinition);
	}

	@SuppressWarnings("unchecked")
	public <T extends EntityFieldDefinition> T getField(String name) {
		return (T) getFieldMap().get(name);
	}

	public FormDefinition getFormDefinition(String formViewName) {
		return getFormDefinitions().get(formViewName);
	}

	public ListDefinition getListDefinition(String listViewName) {
		return getListDefinitions().get(listViewName);
	}

	public <T extends EntityFieldDefinition> T[] getAllFields() {
		return (T[]) getFieldMap().values().stream().filter(item -> item.getDataType().equals(FieldDataType.MDRELATION))
				.collect(Collectors.toList()).toArray(new EntityFieldDefinition[] {});
	}
}
