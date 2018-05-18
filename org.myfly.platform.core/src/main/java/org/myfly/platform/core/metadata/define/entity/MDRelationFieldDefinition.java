package org.myfly.platform.core.metadata.define.entity;

import java.lang.reflect.Field;

import javax.persistence.OneToMany;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.ClassUtil;
import org.springframework.data.mapping.Association;
import org.springframework.data.mapping.PersistentProperty;

/**
 * OneToMany类型，MDRelation
 * @author xiangwanhong
 *
 */
public class MDRelationFieldDefinition extends RelationFieldDefinition {
	/**
	 * 为关联属性时，id转名称显示字段
	 */
	private String labelField;
	/**
	 * 主子表关系时：显示字段定义
	 */
	private FieldDefinition labelFieldDefinition;

	public MDRelationFieldDefinition(Field field) {
		super(field);
		setDataType(FieldDataType.MDRELATION);
		try {
			setType(ClassUtil.getFieldType(field));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public MDRelationFieldDefinition(Association<? extends PersistentProperty<?>> property) {
		this(property.getInverse().getField());
		// 获取子表字段
		OneToMany oneToMany = property.getInverse().findAnnotation(OneToMany.class);
		if (oneToMany != null && StringUtils.isNotBlank(oneToMany.mappedBy())) {
			FieldDefinition tmp = new FieldDefinition();
			tmp.setTitle("临时，读取时更新");
			tmp.setName(oneToMany.mappedBy());
			setRelationField(tmp);
		} else {
			AssertUtil.parameterEmpty("OneToMany.mappedBy",
					"主子表关系必须设置实体[getTableDefinition().getName()]子表属性[" + getName() + "]的OneToMany.mappedBy属性.");
		}
	}

	public String getLabelField() {
		return labelField;
	}

	public void setLabelField(String labelField) {
		this.labelField = labelField;
	}

	public FieldDefinition getLabelFieldDefinition() {
		return labelFieldDefinition;
	}

	public void setLabelFieldDefinition(FieldDefinition labelFieldDefinition) {
		this.labelFieldDefinition = labelFieldDefinition;
	}
}
