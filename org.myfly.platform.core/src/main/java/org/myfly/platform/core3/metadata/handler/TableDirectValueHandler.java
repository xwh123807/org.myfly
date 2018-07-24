package org.myfly.platform.core3.metadata.handler;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.metadata.define.FRefTable;
import org.myfly.platform.core3.metadata.define.FlyColumn;
import org.myfly.platform.core3.metadata.define.FlyDataModel;

public class TableDirectValueHandler extends DefaultValueHandler {
	private FRefTable refTable;
	private FlyDataModel refDataModel;

	private FRefTable getRefTable() {
		return this.refTable;
	}

	private FlyDataModel getRefDataModel() {
		if (refDataModel == null) {
			refDataModel = AppUtil.getFlyDataModel(getRefTable().getTableApiName());
		}
		return refDataModel;
	}

	public TableDirectValueHandler(FlyColumn column) {
		super(column);
		refTable = column.getElement().getRefTable();
	}

	@Override
	public Object getFieldValueForEntity(Object entity) {
		String keyValue = (String) super.getFieldValueForEntity(entity);
		if (refTable != null && StringUtils.isNotBlank(keyValue)) {
			FlyEntityMap result = new FlyEntityMap();
			result.put(getRefTable().getKeyColumnName(), keyValue);
			Object value = AppUtil.getIDNameService().getNameValue(getRefDataModel().getTableName(),
					getRefDataModel().getColumnMap().get(getRefTable().getKeyColumnName()).getColumnName(),
					getRefDataModel().getColumnMap().get(getRefTable().getDisplayColumnName()).getColumnName(),
					keyValue);
			result.put(getRefTable().getDisplayColumnName(), value);
			return result;
		}
		return keyValue;
	}

	@Override
	public void setFieldValueForEntity(Object entity, Object value) {
		// if (value instanceof Map) {
		// Object ooEntity = FlyEntityUtils.toEntity(getFlyDataModel(), (Map<String,
		// Object>) value, false);
		// super.setFieldValueForEntity(entity, ooEntity);
		// } else {
		// super.setFieldValueForEntity(entity, value);
		// }
	}
}
