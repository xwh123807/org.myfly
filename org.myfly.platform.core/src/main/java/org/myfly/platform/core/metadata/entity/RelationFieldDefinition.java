package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;

import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.ClassUtil;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RelationFieldDefinition extends EntityFieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7379087760927442571L;
	/**
	 * 如果是枚举类型，存放枚举类型名；如果是关联关系，存放关联类名
	 */
	private String relationClass;
	/**
	 * 如果是查找关系、主子表关系时，存放关联表名
	 */
	private String relationTable;

	public RelationFieldDefinition(Field field) {
		super(field);
		try {
			setRelationClass(ClassUtil.getFieldType(field).getName());
			setRelationTable(ClassUtil.getClassShortName(getRelationClass()));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getRelationClass() {
		return relationClass;
	}

	public void setRelationClass(String relationClass) {
		this.relationClass = relationClass;
	}

	public String getRelationTable() {
		return relationTable;
	}

	public void setRelationTable(String relationTable) {
		this.relationTable = relationTable;
	}

	/**
	 * 获取关联实体元模型
	 * 
	 * @return
	 */
	@JsonIgnore
	public EntityMetaData getRelationEntityMetaData() {
		return AppUtil.getEntityMetaData(getRelationClass());
	}

	@JsonIgnore
	public EntityFieldDefinition getRelationEntityLabelField() {
		return getRelationEntityMetaData().getLableField();
	}
}
