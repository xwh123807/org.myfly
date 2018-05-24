package org.myfly.platform.core.metadata.entity.handler;

import java.lang.reflect.InvocationTargetException;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFieldValueFromEntity(Object entity) {
		SearchRelationEntity srEntity = new SearchRelationEntity();
		// 取出关联实体
		Object relEntity = null;
		try {
			relEntity = getFieldDefinition().getGetter().invoke(entity);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		if (relEntity != null) {
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
		// TODO Auto-generated method stub

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
