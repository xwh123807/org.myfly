package org.myfly.platform.core.metadata.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.collections4.map.HashedMap;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.define.FKFieldDefinition;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.define.MetaDataDefinition;
import org.myfly.platform.core.utils.EntityClassUtil;

public class EntityMetaDataDefinition extends MetaDataDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6919139894188294982L;
	/**
	 * 实体类名
	 */
	private String entityClass;
	/**
	 * 主键字段
	 */
	private PKFieldDefinition pkFieldDefinition;
	
	public EntityMetaDataDefinition() {
	}

	public EntityMetaDataDefinition(Class<?> entityClass) {
		super(entityClass.getAnnotation(MetaDataView.class));
		setEntityClass(entityClass.getName());
		setName(entityClass.getName());
		Table table = entityClass.getAnnotation(Table.class);
		if (table != null) {
			getTableDefinition().setTableName(table.name());
			getTableDefinition().setCatalog(table.catalog());
			getTableDefinition().setSchema(table.schema());
		}
		Entity entity = entityClass.getAnnotation(Entity.class);
		if (entity != null) {
			buildEntityFieldDefinitions(entityClass);
		}
	}

	private void buildEntityFieldDefinitions(Class<?> entityClass) {
		// 设置实体字段列表
		List<EntityFieldDefinition> fields = new ArrayList<>();
		EntityClassUtil.getEntityFieldInfo(entityClass).forEach((name, fieldInfo) -> {
			EntityFieldDefinition fieldDefinition = EntityFieldDefinitionFactory
					.buildEntityFieldDefinition(fieldInfo.getField());
			fields.add(fieldDefinition);
		});
		getTableDefinition().setFields(fields.toArray(new FieldDefinition[] {}));
		// 设置实体主键
		PKFieldDefinition pkField = new PKFieldDefinition();
		pkField.setIdFields(fields.stream().filter(item -> item.isIdField()).collect(Collectors.toList())
				.toArray(new EntityFieldDefinition[] {}));
		setPkFieldDefinition(pkField);
		// 设置实体外键
		Map<String, FKFieldDefinition> fkFields = new HashedMap<>();
		fields.stream().filter(item -> FieldDataType.SEARCHRELATION.equals(item.getDataType())).forEach(field -> {
			FKFieldDefinition fkField = new FKFieldDefinition((SearchRelationFieldDefinition) field);
			fkFields.put(fkField.getName(), fkField);
		});
		getTableDefinition().setFkFieldDefinitions(fkFields);
	}

	public String getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(String entityClass) {
		this.entityClass = entityClass;
	}

	public PKFieldDefinition getPkFieldDefinition() {
		return pkFieldDefinition;
	}

	public void setPkFieldDefinition(PKFieldDefinition pkFieldDefinition) {
		this.pkFieldDefinition = pkFieldDefinition;
	}
}
