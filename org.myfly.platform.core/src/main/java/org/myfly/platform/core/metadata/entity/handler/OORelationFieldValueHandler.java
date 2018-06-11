package org.myfly.platform.core.metadata.entity.handler;

import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.OORelationFieldDefinition;

public class OORelationFieldValueHandler extends DefaultFieldValueHandler{
	private OORelationFieldDefinition getField() {
		return (OORelationFieldDefinition) getFieldDefinition();
	}
	
	public OORelationFieldValueHandler(EntityFieldDefinition fieldDefinition) {
		super(fieldDefinition);
	}

	@Override
	public Object getFieldValueFromEntity(Object entity) {
		Object obj = super.getFieldValueFromEntity(entity);
		return FlyEntityResult.fromEntity(getField().getRelationEntityMetaData(), obj);
	}
}
