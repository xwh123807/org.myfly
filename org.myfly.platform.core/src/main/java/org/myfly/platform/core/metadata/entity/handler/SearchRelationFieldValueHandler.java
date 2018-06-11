package org.myfly.platform.core.metadata.entity.handler;

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
		SearchRelationEntity srEntity = null;
		if (relEntity != null) {
			srEntity = new SearchRelationEntity();
			// 关联实体主键
			srEntity.setUid((String) getField().getRelationEntityMetaData().getPkFieldDefinition().getValueHandler()
					.getFieldValue(relEntity));
			// 关联实体标签
			srEntity.setTitle(
					(String) getField().getRelationEntityLabelField().getValueHandler().getFieldValue(relEntity));
		}
		return srEntity;
	}

}
