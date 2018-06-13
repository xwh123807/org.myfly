package org.myfly.platform.core.metadata.entity.handler;

import java.util.Map;

import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.SearchRelationFieldDefinition;

/**
 * 关联实体属性值的设置和获取 <br>
 * 1、根据关联实体id，获取关联实体基本信息 <br>
 * 
 * @author xiangwanhong
 *
 */
public class SearchRelationFieldValueHandler extends DefaultFieldValueHandler {
	public SearchRelationFieldValueHandler(SearchRelationFieldDefinition fieldDefinition) {
		super(fieldDefinition);
	}

	private SearchRelationFieldDefinition getField() {
		return (SearchRelationFieldDefinition) getFieldDefinition();
	}

	@Override
	public Object getFieldValueFromEntity(Object entity) {
		// 取出关联实体
		Object relEntity = super.getFieldValueFromEntity(entity);
		if (relEntity != null) {
			return FlyEntityResult.formSearchRelationEntity(getField(), relEntity);
		} else {
			return null;
		}
	}

	@Override
	public void setFieldValueForEntity(Object entity, Object value) {
		if (value instanceof Map) {
			EntityMetaData relationMetaData = getField().getRelationEntityMetaData();
			Object ooEntity = FlyEntityResult.toSearchRelationEntity(relationMetaData, (Map<String, Object>) value);
			super.setFieldValueForEntity(entity, ooEntity);
		} else {
			super.setFieldValueForEntity(entity, value);
		}
	}
}
