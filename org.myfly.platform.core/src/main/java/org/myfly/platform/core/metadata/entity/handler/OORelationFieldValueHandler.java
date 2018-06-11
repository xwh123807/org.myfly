package org.myfly.platform.core.metadata.entity.handler;

import java.util.Map;

import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.OORelationFieldDefinition;

public class OORelationFieldValueHandler extends AbstractFieldValueHandler{
	private OORelationFieldDefinition getField() {
		return (OORelationFieldDefinition) getFieldDefinition();
	}
	
	public OORelationFieldValueHandler(EntityFieldDefinition fieldDefinition) {
		super(fieldDefinition);
	}

	@Override
	public Object getFieldValueFromMap(Map entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFieldValueFromEntity(Object entity) {
		return FlyEntityResult.fromEntity(getField().getRelationEntityMetaData(), entity);
	}

	@Override
	public void setFieldValueForMap(Map entity, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldValueForEntity(Object entity, Object value) {
		// TODO Auto-generated method stub
		
	}

}
