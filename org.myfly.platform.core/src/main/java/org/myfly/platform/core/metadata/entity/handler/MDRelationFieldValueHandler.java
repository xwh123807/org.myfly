package org.myfly.platform.core.metadata.entity.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.MDRelationFieldDefinition;

public class MDRelationFieldValueHandler extends DefaultFieldValueHandler {
	private MDRelationFieldDefinition getField() {
		return (MDRelationFieldDefinition) getFieldDefinition();
	}

	public MDRelationFieldValueHandler(EntityFieldDefinition fieldDefinition) {
		super(fieldDefinition);
	}

	/**
	 * 可能出现递归情况
	 */
	@Override
	public Object getFieldValueFromEntity(Object entity) {
		Collection<?> objs = (Collection<?>) super.getFieldValueFromEntity(entity);
		if (CollectionUtils.isNotEmpty(objs)) {
			List<FlyEntityResult> list = new ArrayList<>();
			objs.forEach(item -> {
				list.add(FlyEntityResult.fromEntity(getField().getRelationEntityMetaData(), item));
			});
			return list;
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setFieldValueForEntity(Object entity, Object value) {
		if (value == null || value instanceof Collection) {
			Collection values = (Collection) value;
			Set details = new HashSet<>();
			Collection originalEntitys = (Collection) getOriginalValue(entity);
			if (CollectionUtils.isNotEmpty(values)) {
				EntityMetaData relationMetaData = getField().getRelationEntityMetaData();
				((Collection) value).forEach(subEntity -> {
					Object ooEntity = FlyEntityResult.toEntity(relationMetaData, (Map<String, Object>) subEntity,
							false);
					details.add(ooEntity);
				});
				super.setFieldValueForEntity(entity, details);
			}else {
				//设置空置时
				originalEntitys.forEach(item -> {
					originalEntitys.remove(item);
				});
			}
		} else {
			super.setFieldValueForEntity(entity, value);
		}
	}
}
