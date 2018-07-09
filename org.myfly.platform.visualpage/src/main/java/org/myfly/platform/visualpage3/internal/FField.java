package org.myfly.platform.visualpage3.internal;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.define.IDefinition;
import org.myfly.platform.visualpage3.model.PField;

public class FField extends PField implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7304780919645810513L;
	private boolean isFromDB;

	@Override
	public String getKey() {
		return getFieldID();
	}

	@Override
	public void setUid(String value) {
		setFieldID(value);
	}

	@Override
	public String getUid() {
		return getFieldID();
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		isFromDB = value;
	}

	@Override
	public void validate() {

	}

	@Override
	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	@Override
	public void printJson() {
		System.out.println(toJson());
	}

	public PField toFieldPO() {
		PField result = new PField();
		result.setFieldID(getFieldID());
		result.setFieldGroupID(getFieldGroupID());
		result.setColumnID(getColumnID());
		result.setDataType(getDataType());
		result.setEntityType(getEntityType());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

}
