package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;

import javax.persistence.OneToOne;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.entity.handler.OORelationFieldValueHandler;

/**
 * 一对一属性
 * 
 * @author xiangwanhong
 *
 */
public class OORelationFieldDefinition extends RelationFieldDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2210485463105951768L;

	public OORelationFieldDefinition(Field field) {
		super(field);
		setDataType(FieldDataType.OORELATION);
		OneToOne oneToOne = field.getAnnotation(OneToOne.class);
		if (oneToOne != null && oneToOne.targetEntity() != void.class) {
			setRelationClass(oneToOne.targetEntity().getName());
		}
		setValueHandler(new OORelationFieldValueHandler(this));
	}

}
