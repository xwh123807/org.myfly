package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.model.dict.PElement;
import org.springframework.util.Assert;

public class FElement extends PElement implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6072480122577529080L;

	private String referenceName;
	
	private boolean isFromDB;

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

	@Override
	public void setUid(String value) {
		setElementID(value);
	}

	@Override
	public String getUid() {
		return getElementID();
	}

	public PElement toElementPO() {
		PElement result = new PElement();
		result.setElementID(getElementID());
		result.setColumnName(getColumnName());
		result.setDataType(getDataType());
		result.setEntityType(getEntityType());
		result.setFieldLength(getFieldLength());
		result.setPrintName(getPrintName());
		result.setReferenceID(getReferenceID());
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
}
