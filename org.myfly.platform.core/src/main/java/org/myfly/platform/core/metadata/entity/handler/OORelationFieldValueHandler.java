package org.myfly.platform.core.metadata.entity.handler;

import java.util.Map;

import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.OORelationFieldDefinition;

/**
 * 一对一属性
 * 
 * @author xiangwanhong
 *
 */
public class OORelationFieldValueHandler extends DefaultFieldValueHandler {
	private OORelationFieldDefinition getField() {
		return (OORelationFieldDefinition) getFieldDefinition();
	}

	public OORelationFieldValueHandler(EntityFieldDefinition fieldDefinition) {
		super(fieldDefinition);
	}

	@Override
	public Object getFieldValueFromEntity(Object entity) {
		Object obj = super.getFieldValueFromEntity(entity);
		if (obj != null) {
			return FlyEntityResult.fromEntity(getField().getRelationEntityMetaData(), obj);
		} else {
			return null;
		}
	}

	@Override
	public void setFieldValueForEntity(Object entity, Object value) {
		if (value instanceof Map) {
			EntityMetaData relationMetaData = getField().getRelationEntityMetaData();
			Object originalEntity = getOriginalValue(entity);
			Object ooEntity;
			if (originalEntity == null) {
				//新增
				ooEntity = FlyEntityResult.toEntity(relationMetaData, (Map<String, Object>)value, true);
			}else {
				//修改
				ooEntity = FlyEntityResult.mergeEntity(relationMetaData, originalEntity, (Map) value, false);
			}
			super.setFieldValueForEntity(entity, ooEntity);
		} else {
			super.setFieldValueForEntity(entity, value);
		}
	}
}
