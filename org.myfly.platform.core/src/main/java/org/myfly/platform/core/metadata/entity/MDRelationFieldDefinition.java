package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

import javax.persistence.OneToMany;

import org.apache.commons.lang3.StringUtils;
import org.apache.derby.iapi.util.StringUtil;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.entity.handler.MDRelationFieldValueHandler;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.ClassUtil;

/**
 * OneToMany类型，MDRelation
 * 
 * @author xiangwanhong
 *
 */
public class MDRelationFieldDefinition extends RelationFieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4827191183459588619L;
	/**
	 * 如果是主子表关系，存放子表对应的字段<br>
	 */
	private String relationField;

	public MDRelationFieldDefinition(Field field) {
		super(field);
		setDataType(FieldDataType.MDRELATION);
		OneToMany oneToMany = field.getAnnotation(OneToMany.class);
		if (oneToMany != null && StringUtils.isNotBlank(oneToMany.mappedBy())) {
			setRelationField(oneToMany.mappedBy());
		} else {
			AssertUtil.parameterEmpty("OneToMany.mappedBy",
					"主子表关系必须设置实体[getTableDefinition().getName()]子表属性[" + getName() + "]的OneToMany.mappedBy属性.");
		}
		//接口方式
		if (oneToMany != null && oneToMany.targetEntity() != void.class) {
			setRelationClass(oneToMany.targetEntity().getName());
			setRelationTable(ClassUtil.getClassShortName(getRelationClass()));
		}
		setValueHandler(new MDRelationFieldValueHandler(this));
	}

	public String getRelationField() {
		return relationField;
	}

	public void setRelationField(String relationField) {
		this.relationField = relationField;
	}

}
