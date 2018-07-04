package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.model.dict.PEntityType;
import org.springframework.util.Assert;

public class FEntityType extends PEntityType implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3348825959997859306L;

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

}
