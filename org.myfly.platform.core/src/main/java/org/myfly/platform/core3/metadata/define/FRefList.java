package org.myfly.platform.core3.metadata.define;

import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.model.dict.PRefList;
import org.myfly.platform.core3.model.dict.PReference;
import org.springframework.util.Assert;

public class FRefList extends PReference implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3727588422555872027L;

	private Map<String, PRefList> items;

	@Override
	public String getKey() {
		return getName();
	}

	@Override
	public void validate() {
		Assert.hasLength(getKey(), "属性[Key]不能为空");
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

	public Map<String, PRefList> getItems() {
		return items;
	}

	public void setItems(Map<String, PRefList> items) {
		this.items = items;
	}

}
