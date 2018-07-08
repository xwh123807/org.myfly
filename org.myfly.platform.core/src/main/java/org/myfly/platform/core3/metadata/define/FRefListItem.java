package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.model.dict.PRefList;

public class FRefListItem extends PRefList implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1952277814743605392L;

	private boolean isFromDB;

	@Override
	public String getKey() {
		return getRefListID();
	}

	@Override
	public void setUid(String value) {
		setRefListID(value);
	}

	@Override
	public String getUid() {
		return getRefListID();
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

	public PRefList toRefListPO() {
		PRefList result = new PRefList();
		result.setRefListID(getRefListID());
		result.setReferenceID(getReferenceID());
		result.setEntityType(getEntityType());
		result.setValidFrom(getValidFrom());
		result.setValidTo(getValidTo());
		result.setValue(getValue());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}
	
	@Override
	public String toString() {
		return "name: " + getName() + ", value: " + getValue();
	}
}
