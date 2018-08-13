package org.myfly.platform.core.datamodel.handler;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.datamodel.define.FRefTable;
import org.myfly.platform.core.datamodel.define.FlyColumn;
import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.utils.AppUtil;

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
			// FlyEntityMap result = new FlyEntityMap();
			// result.put(getRefTable().getKeyColumnName(), keyValue);
			RefObject result = new RefObject();
			result.setUid(keyValue);
			String value = AppUtil.getIDNameService().getNameValue(getRefDataModel().getTableName(),
					getRefDataModel().getColumnMap().get(getRefTable().getKeyColumnName()).getColumnName(),
					getRefDataModel().getColumnMap().get(getRefTable().getDisplayColumnName()).getColumnName(),
					keyValue);
			result.setLabel(value);
			// result.put(getRefTable().getDisplayColumnName(), value);
			return result;
		}
		return keyValue;
	}

}
