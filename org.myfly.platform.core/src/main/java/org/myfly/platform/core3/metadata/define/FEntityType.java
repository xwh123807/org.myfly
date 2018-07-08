package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.model.dict.PEntityType;
import org.springframework.util.Assert;

public class FEntityType extends PEntityType implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3348825959997859306L;

	private boolean isFromDB;

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

	@Override
	public String getKey() {
		return getEntityType();
	}

	@Override
	public void setUid(String value) {
		setEntityTypeID(value);
	}

	@Override
	public String getUid() {
		return getEntityTypeID();
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		this.isFromDB = value;
	}

	public PEntityType toEntityTypePO() {
		PEntityType result = new PEntityType();
		result.setClasspath(getClasspath());
		result.setEntityType(getEntityType());
		result.setEntityTypeID(getEntityTypeID());
		result.setModelPackage(getModelPackage());
		result.setProcessing(getProcessing());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	@Override
	public String toString() {
		return "entityType: " + getEntityType() + ", name: " + getName();
	}
}
