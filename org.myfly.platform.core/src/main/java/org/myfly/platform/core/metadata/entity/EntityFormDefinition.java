package org.myfly.platform.core.metadata.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.metadata.define.FormDefinition;
import org.myfly.platform.core.metadata.define.SubTableDefinition;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 实体表单视图定义
 * 
 * @author xiangwanhong
 *
 */
public class EntityFormDefinition extends FormDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9182728407102465689L;

	/**
	 * 表单中用到的实体字段定义
	 */
	@JsonIgnore
	private Map<String, EntityFieldDefinition> fieldDefinitions;
	/**
	 * 表单中用到的子表定义
	 */
	private Map<String, EntitySubTableDefinition> subTableDefinitions;

	@JsonIgnore
	private EntityMetaData parent;

	public EntityFormDefinition(EntityMetaData parent, FormDefinition builder) {
		setParent(parent);
		setName(builder.getName());
		setActions(builder.getActions());
		setSections(builder.getSections());
		setDivs(builder.getDivs());
	}

	public void config() {
		generateEntitySubTableDefinitions(getAllSubTables());
		generateEntityFieldDefinitions(getFields());
	}

	/**
	 * 生成表单视图使用到的实体子表定义
	 * 
	 * @param subTableDefinitions
	 */
	private void generateEntitySubTableDefinitions(Map<String, SubTableDefinition> map) {
		if (MapUtils.isEmpty(map)) {
			return;
		}
		setSubTableDefinitions(new HashMap<>());
		map.values().forEach(item -> {
			EntitySubTableDefinition subTableDefinition = new EntitySubTableDefinition(getParent(), item);
			subTableDefinition.setFormViewName(getName());
			subTableDefinition.config();
			getSubTableDefinitions().put(item.getName(), subTableDefinition);
		});
	}

	private void generateEntityFieldDefinitions(String[] fields) {
		if (ArrayUtils.isNotEmpty(fields)) {
			setFieldDefinitions(new HashMap<>());
			Stream.of(fields).forEach(name -> {
				getFieldDefinitions().put(name, getParent().getField(name));
			});
		}
	}

	/**
	 * 获取表单使用字段列表
	 * 
	 * @return
	 */
	@JsonIgnore
	public String[] getFields() {
		return Stream.of(getSections()).flatMap(item -> Stream.of(item.getFields())).distinct()
				.collect(Collectors.toList()).toArray(new String[] {});
	}

	/**
	 * 获取当前表单下使用到的子表
	 * 
	 * @return
	 */
	private Map<String, SubTableDefinition> getAllSubTables() {
		Map<String, SubTableDefinition> map = new HashMap<>();
		if (ArrayUtils.isNotEmpty(getSections())) {
			Stream.of(getSections()).forEach(item -> {
				if (ArrayUtils.isNotEmpty(item.getSubTables())) {
					Stream.of(item.getSubTables()).forEach(subTable -> {
						map.put(subTable.getName(), subTable);
					});
				}
			});
		}
		return map;
	}

	public Map<String, EntityFieldDefinition> getFieldDefinitions() {
		return fieldDefinitions;
	}

	public void setFieldDefinitions(Map<String, EntityFieldDefinition> fieldDefinitions) {
		this.fieldDefinitions = fieldDefinitions;
	}

	public Map<String, EntitySubTableDefinition> getSubTableDefinitions() {
		return subTableDefinitions;
	}

	public void setSubTableDefinitions(Map<String, EntitySubTableDefinition> subTableDefinitions) {
		this.subTableDefinitions = subTableDefinitions;
	}

	@Override
	public void validate() {
		super.validate();
		if (MapUtils.isNotEmpty(getFieldDefinitions())) {
			getFieldDefinitions().values().forEach(item -> item.validate());
		}
		if (MapUtils.isNotEmpty(getSubTableDefinitions())) {
			getSubTableDefinitions().values().forEach(item -> item.validate());
		}
	}

	public EntityMetaData getParent() {
		return parent;
	}

	public void setParent(EntityMetaData parent) {
		this.parent = parent;
	}

	public EntityFieldDefinition[] getFields(String[] fields) {
		return Stream.of(fields).filter(name -> getFieldDefinitions().containsKey(name))
				.map(name -> getFieldDefinitions().get(name)).collect(Collectors.toList())
				.toArray(new EntityFieldDefinition[] {});
	}
}
