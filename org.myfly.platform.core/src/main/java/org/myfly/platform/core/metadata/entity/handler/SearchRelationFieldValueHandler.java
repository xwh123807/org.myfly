package org.myfly.platform.core.metadata.entity.handler;

import java.util.Map;

import org.myfly.platform.core.metadata.entity.SearchRelationFieldDefinition;

/**
 * 关联实体属性值的设置和获取 <br>
 * 1、根据关联实体id，获取关联实体基本信息 <br>
 * 
 * @author xiangwanhong
 *
 */
public class SearchRelationFieldValueHandler extends AbstractFieldValueHandler {
	public SearchRelationFieldValueHandler(SearchRelationFieldDefinition fieldDefinition) {
		super(fieldDefinition);
	}

	private SearchRelationFieldDefinition getSearchRelationFieldDefinition() {
		return (SearchRelationFieldDefinition) getFieldDefinition();
	}

	@Override
	public Object getFieldValueFromMap(Map entity) {
		return null;
	}

	@Override
	public Object getFieldValueFromEntity(Object entity) {
		SearchRelationEntity srEntity = null;
		// 取出关联实体
		Object relEntity = null;
		try {
			relEntity = getFieldDefinition().getGetter().invoke(entity);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(
					"实体属性[" + getFieldDefinition().getName() + "]值获取失败，错误信息：" + e.getMessage());
		}
		if (relEntity != null) {
			srEntity = new SearchRelationEntity();
			// 关联实体主键
			srEntity.setUid((String) getSearchRelationFieldDefinition().getRelationEntityMetaData()
					.getPkFieldDefinition().getValueHandler().getFieldValue(relEntity));
			// 关联实体标签
			srEntity.setTitle((String) getSearchRelationFieldDefinition().getRelationEntityLabelField()
					.getValueHandler().getFieldValue(relEntity));
		}
		return srEntity;
	}

	@Override
	public void setFieldValueForMap(Map entity, Object value) {
	}

	@Override
	public void setFieldValueForEntity(Object entity, Object value) {
		try {
			if (value == null) {
				getSearchRelationFieldDefinition().getSetter().invoke(entity, null);
			} else {
				if (value.getClass().equals(getSearchRelationFieldDefinition().getType())) {
					getSearchRelationFieldDefinition().getSetter().invoke(entity, value);
				} else {

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
