package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;

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
		setValueHandler(new OORelationFieldValueHandler(this));
	}

}
