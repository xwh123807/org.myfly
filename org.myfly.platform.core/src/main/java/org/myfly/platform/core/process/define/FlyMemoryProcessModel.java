package org.myfly.platform.core.process.define;

import java.util.Map;

public class FlyMemoryProcessModel {
	private Map<String, ProcessModel> processModels;

	public Map<String, ProcessModel> getProcessModels() {
		return processModels;
	}

	public void setProcessModels(Map<String, ProcessModel> processModels) {
		this.processModels = processModels;
	}
}
