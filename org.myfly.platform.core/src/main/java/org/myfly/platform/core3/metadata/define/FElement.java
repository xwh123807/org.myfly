package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.model.dict.PElement;
import org.springframework.util.Assert;

public class FElement extends PElement implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6072480122577529080L;

	private String referenceName;

	@Override
	public void validate() {
		Assert.hasLength(getKey(), "属性[Key]不能为空");
		Assert.hasLength(getEntityType(), "属性[EntityType]不能为空");
		Assert.hasLength(getName(), "属性[Name]不能为空");
		Assert.hasLength(getColumnName(), "属性[ColumnName]不能为空");
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
		return getColumnName();
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

}
