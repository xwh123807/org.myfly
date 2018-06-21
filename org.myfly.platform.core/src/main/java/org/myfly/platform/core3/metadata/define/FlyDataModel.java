package org.myfly.platform.core3.metadata.define;

import java.util.Map;

import org.myfly.platform.core3.domain.IAuditable;

public class FlyDataModel extends FlyTableDefinition {
	public FlyDataModel() {
	}

	public FlyDataModel(FlyTableDefinition builder) {
		super(builder);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2763660520511209664L;

	public <T extends IAuditable> T newEntityInstance(Map<String, Object> flyEntity) {
		return null;
	}

}
