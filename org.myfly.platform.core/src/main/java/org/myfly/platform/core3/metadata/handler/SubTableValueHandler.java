package org.myfly.platform.core3.metadata.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.metadata.define.FlyColumn;
import org.myfly.platform.core3.metadata.define.FlyDataModel;

public class SubTableValueHandler extends DefaultValueHandler {

	public SubTableValueHandler(FlyColumn column) {
		super(column);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getFieldValueForEntity(Object entity) {
		Collection<IFlyEntity> values = (Collection<IFlyEntity>) super.getFieldValueForEntity(entity);
		List<FlyEntityMap> list = new ArrayList<>();
		FlyDataModel dataModel = null;
		if (CollectionUtils.isNotEmpty(values)) {
			for (Object item : values) {
				if (dataModel == null) {
					dataModel = AppUtil.getFlyDataModel(item.getClass().getName());
				}
				list.add(FlyEntityUtils.fromEntity(dataModel, item));
			}
		}
		return list;
	}
	
	@Override
	public void setFieldValueForEntity(Object entity, Object value) {
		if (value == null || value instanceof Collection) {
			Collection values = (Collection) value;
			Set details = new HashSet<>();
			if (CollectionUtils.isNotEmpty(values)) {
				values.forEach(subEntity -> {
					Object ooEntity = FlyEntityUtils.toEntity(getFlyDataModel(), (Map<String, Object>) subEntity,
							false);
					details.add(ooEntity);
				});
				super.setFieldValueForEntity(entity, details);
			}
		} else {
			super.setFieldValueForEntity(entity, value);
		}
	}

	private FlyDataModel getFlyDataModel() {
		return null;
//		ParameterizedType type = (ParameterizedType) getGetter().getReturnType().
//		return AppUtil.getFlyDataModel(type.getActualTypeArguments()[0].getTypeName());
	}
}
