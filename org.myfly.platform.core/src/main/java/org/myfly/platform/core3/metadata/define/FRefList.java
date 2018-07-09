package org.myfly.platform.core3.metadata.define;

import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.model.PReference;
import org.springframework.util.Assert;

public class FRefList extends PReference implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3727588422555872027L;

	/**
	 * 列表项
	 */
	private Map<String, FRefListItem> items;

	private boolean isFromDB;

	@Override
	public String getKey() {
		return getApiName();
	}

	@Override
	public void validate() {
		Assert.hasLength(getKey(), "属性[Key]不能为空");
		Assert.hasLength(getApiName(), "属性[ApiName]不能为空");
		Assert.hasLength(getEntityType(), "属性[EntityType]不能为空");
		Assert.hasLength(getName(), "属性[Name]不能为空");
		if (MapUtils.isNotEmpty(getItems())) {
			getItems().values().forEach(item -> {
				Assert.hasLength(item.getValue(), "属性[Value]不能为空");
				Assert.hasLength(item.getName(), "属性[Name]不能为空");
			});
		}
	}

	@Override
	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	@Override
	public void printJson() {
		System.out.println(toJson());
	}

	public Map<String, FRefListItem> getItems() {
		return items;
	}

	public void setItems(Map<String, FRefListItem> items) {
		this.items = items;
	}

	@Override
	public void setUid(String value) {
		setReferenceID(value);
	}

	@Override
	public String getUid() {
		return getReferenceID();
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		this.isFromDB = value;
	}

	public PReference toReferencePO() {
		PReference result = new PReference();
		result.setReferenceID(getReferenceID());
		result.setApiName(getApiName());
		result.setEntityType(getEntityType());
		result.setIsOrderByValue(getIsOrderByValue());
		result.setValidationType(getValidationType());
		result.setvFormat(getvFormat());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	@Override
	public String toString() {
		return "apiName: " + getApiName() + ", name: " + getName();
	}
}
