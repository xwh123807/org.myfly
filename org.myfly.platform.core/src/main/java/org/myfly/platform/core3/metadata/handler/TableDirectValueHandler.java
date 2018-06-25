package org.myfly.platform.core3.metadata.handler;

import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.metadata.define.ColumnDefinition;

public class TableDirectValueHandler extends DefaultValueHandler {

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
}
