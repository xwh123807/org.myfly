package org.myfly.platform.core.metadata.entity;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 实体列表视图定义
 * 
 * @author xiangwanhong
 *
 */
public class EntityListDefinition extends ListDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 127093404422811639L;
	/**
	 * 列表中用到的实体字段定义
	 */
	private EntityFieldDefinition[] fieldDefinitions;
	/**
	 * EntityMetaData
	 */
	@JsonIgnore
	private EntityMetaData parent;

	public EntityListDefinition(EntityMetaData parent, ListDefinition builder) {
		setParent(parent);
		setName(builder.getName());
		setTitle(builder.getTitle());
		setEnableActions(builder.isEnableActions());
		setListStyle(builder.getListStyle());
		setFields(builder.getFields());
		setFilters(builder.getFilters());
		setOrders(builder.getOrders());
		setListActions(builder.getListActions());
		setItemActions(builder.getItemActions());
		setFetchMode(builder.getFetchMode());
		setLabelField(builder.getLabelField());
	}
	
	public void config() {
		generateEntityFieldDefinitions(parent.getFieldMap());
	}

	/**
	 * 生成列表视图字段定义
	 * 
	 * @param fieldMap
	 */
	private void generateEntityFieldDefinitions(Map<String, EntityFieldDefinition> fieldMap) {
		List<EntityFieldDefinition> list = Stream.of(getFields()).map(name -> {
			EntityFieldDefinition field = fieldMap.get(name);
			if (field != null) {
				return field;
			} else {
				// 列表视图中用到的字段在实体中找不到的
				field = new EntityFieldDefinition();
				field.setName(name);
				field.setDataType(FieldDataType.AUTORELATION);
				return field;
			}
		}).collect(Collectors.toList());
		if (isEnableActions() && getItemActions().length > 0) {
			// 创建操作集字段
			EntityActionsFieldDefinition field = new EntityActionsFieldDefinition(getItemActions());
			list.add(field);
		}
		setFieldDefinitions(list.toArray(new EntityFieldDefinition[] {}));
	}

	public EntityFieldDefinition[] getFieldDefinitions() {
		return fieldDefinitions;
	}

	public void setFieldDefinitions(EntityFieldDefinition[] fieldDefinitions) {
		this.fieldDefinitions = fieldDefinitions;
	}

	public EntityMetaData getParent() {
		return parent;
	}
	
	public void setParent(EntityMetaData parent) {
		this.parent = parent;
	}
	
	/**
	 * 获取实体名称
	 * @return
	 */
	public String getEntityName() {
		return getParent().getEntityName();
	}
	
	@Override
	public void validate() {
		super.validate();
		Assert.notNull(getParent(), "属性[parent]不能为空.");
		Assert.notNull(getFieldDefinitions(), "属性[fieldDefinitions]不能为空.");
		Assert.isTrue(getFieldDefinitions().length >= getFields().length, "属性[fieldDefinitions]的长度["
				+ getFieldDefinitions().length + "]必须大于属性[fields]的长度[" + getFields().length + "]");
	}
}
