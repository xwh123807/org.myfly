package org.myfly.platform.core.metadata.entity.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
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
}
