package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.model.dict.PDataType;

public class FDataType extends PDataType implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7760900680553503319L;

	@Override
	public String getKey() {
		return getDataType();
	}

	@Override
	public void setUid(String value) {
		setDataTypeID(value);
	}

	@Override
	public String getUid() {
		return getDataTypeID();
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

	public PDataType toPO() {
		PDataType result = new PDataType();
		result.setDataTypeID(UUIDUtil.newUUID());
		result.setDataType(getDataType());
		result.setEntityType(getEntityType());
		return result;
	}
}
