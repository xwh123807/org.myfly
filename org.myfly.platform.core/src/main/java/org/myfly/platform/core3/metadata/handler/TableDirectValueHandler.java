package org.myfly.platform.core3.metadata.handler;

import java.util.Map;

import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.metadata.define.ColumnDefinition;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;

public class TableDirectValueHandler extends DefaultValueHandler {
	private IFlyDataModel getFlyDataModel() {
		return AppUtil.getFlyDataModel(getColumnDefinition().getFieldInfo().getField().getType().getName());
	}

	public TableDirectValueHandler(ColumnDefinition columnDefinition) {
		super(columnDefinition);
	}

	@Override
	public Object getFieldValueForEntity(Object entity) {
		IFlyEntity relationEntity = (IFlyEntity) super.getFieldValueForEntity(entity);
		if (relationEntity != null) {
			FlyEntityMap flyEntity = new FlyEntityMap();
			flyEntity.setUid(relationEntity.getUid());
			return flyEntity;
		} else {
			return null;
		}
	}

	@Override
	public void setFieldValueForEntity(Object entity, Object value) {
		if (value instanceof Map) {
			Object ooEntity = FlyEntityUtils.toEntity(getFlyDataModel(), (Map<String, Object>) value, false);
			super.setFieldValueForEntity(entity, ooEntity);
		} else {
			super.setFieldValueForEntity(entity, value);
		}
	}
}
