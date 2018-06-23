package org.myfly.platform.core3.metadata.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.flydata.service.FlyEntityUtils;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;

public class SubTableValueHandler extends DefaultValueHandler {

	public SubTableValueHandler(FlyFieldDefinition field) {
		super(field);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getFieldValueForEntity(Object entity) {
		Collection<IFlyEntity> values = (Collection<IFlyEntity>) super.getFieldValueForEntity(entity);
		List<FlyEntityMap> list = new ArrayList<>();
		FlyDataModel dataModel = null;
		if (CollectionUtils.isNotEmpty(values)) {
			for (IFlyEntity item : values) {
				if (dataModel == null) {
					dataModel = AppUtil.getFlyDataModel(item.getClass().getName());
				}
				list.add(FlyEntityUtils.fromEntity(dataModel, item));
			}
		}
		return list;
	}
}