package org.myfly.platform.core3.metadata.define;

import java.io.Serializable;

import org.myfly.platform.core.utils.JSONUtil;

public class AbstractDefinition implements IDefinition, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5344322667983776839L;
	private String apiName;

	@Override
	public void validate() {

	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String toJson() {
		return JSONUtil.toJSON(this);
	}
}
