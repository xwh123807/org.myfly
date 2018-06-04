package org.myfly.platform.core.metadata.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	private Map<String, EntityFieldDefinition> fieldDefinitions;
	/**
	 * 表单中用到的子表定义
	 */
	private Map<String, EntitySubTableDefinition> subTableDefinitions;

	public EntityFormDefinition(FormDefinition builder) {
		setName(builder.getName());
		setActions(builder.getActions());
		setSections(builder.getSections());
		setDivs(builder.getDivs());
	}

	/**
	 * 获取使用字段列表
	 * 
	 * @return
	 */
	@JsonIgnore
	public String[] getFields() {
		return Stream.of(getSections()).flatMap(item -> Stream.of(item.getFields())).distinct()
				.collect(Collectors.toList()).toArray(new String[] {});
	}

	/**
	 * 获取当期表单下使用到的子表
	 * 
	 * @return
	 */
	private Map<String, SubTableDefinition> getAllSubTables() {
		Map<String, SubTableDefinition> list = new HashMap<>();
		Stream.of(getSections()).flatMap(item -> Stream.of(item.getSubTables()))
				.forEach(s -> list.put(s.getSubTableAttr(), s));
		return list;
	}

	@JsonIgnore
	public SubTableDefinition getSubTableDefinition(String subTableAttr) {
		return getAllSubTables().get(subTableAttr);
	}

	public Map<String, EntityFieldDefinition> getFieldDefinitions() {
		return fieldDefinitions;
	}

	public void setFieldDefinitions(Map<String, EntityFieldDefinition> fieldDefinitions) {
		this.fieldDefinitions = fieldDefinitions;
	}

	@Override
	public void validate() {
		super.validate();
	}

	public Map<String, EntitySubTableDefinition> getSubTableDefinitions() {
		return subTableDefinitions;
	}

	public void setSubTableDefinitions(Map<String, EntitySubTableDefinition> subTableDefinitions) {
		this.subTableDefinitions = subTableDefinitions;
	}
}
