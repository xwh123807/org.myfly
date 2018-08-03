package org.myfly.platform.core.datamodel.define;

import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.model.PDataType;
import org.myfly.platform.core.utils.JSONUtil;
import org.springframework.util.Assert;

public class FDataType extends PDataType implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7760900680553503319L;
	
	private boolean isFromDB;

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
		Assert.hasLength(getKey(), "属性[Key]不能为空");
		Assert.hasLength(getEntityType(), "属性[EntityType]不能为空");
		Assert.hasLength(getName(), "属性[Name]不能为空");
	}

	@Override
	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	@Override
	public void printJson() {
		System.out.println(toJson());
	}

	public PDataType toDataTypePO() {
		PDataType result = new PDataType();
		result.setDataTypeID(getDataTypeID());
		result.setDataType(getDataType());
		result.setEntityType(getEntityType());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		this.isFromDB = value;
	}
	
	@Override
	public String toString() {
		return "dataType: " + getDataType() + ", name: " + getName();
	}
}
