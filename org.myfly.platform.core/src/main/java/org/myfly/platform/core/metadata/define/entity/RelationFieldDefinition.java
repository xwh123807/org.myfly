package org.myfly.platform.core.metadata.define.entity;

import java.lang.reflect.Field;

import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.utils.ClassUtil;
import org.springframework.data.mapping.Association;
import org.springframework.data.mapping.PersistentProperty;

public class RelationFieldDefinition extends EntityFieldDefinition{
	/**
	 * 如果是枚举类型，存放枚举类型名；如果是关联关系，存放关联类名
	 */
	private String relationClass;
	/**
	 * 如果是查找关系、主子表关系时，存放关联表名
	 */
	private String relationTable;
	/**
	 * 如果是主子表关系，存放子表对应的字段<br>
	 */
	private FieldDefinition relationField;
	
	public RelationFieldDefinition(Field field) {
		super(field);
		try {
			setRelationClass(ClassUtil.getFieldType(field).getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public RelationFieldDefinition(Association<? extends PersistentProperty<?>> property) {
		super(property.getInverse());
		setType(property.getInverse().getComponentType());
		setRelationClass(getType().getName());
		setRelationTable(ClassUtil.getClassShortName(getRelationClass()));
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

	public FieldDefinition getRelationField() {
		return relationField;
	}

	public void setRelationField(FieldDefinition relationField) {
		this.relationField = relationField;
	}

}
