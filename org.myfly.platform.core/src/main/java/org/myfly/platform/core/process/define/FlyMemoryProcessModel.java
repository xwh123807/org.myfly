package org.myfly.platform.core.process.define;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.datamodel.define.IDefinition;

public class FlyMemoryProcessModel {
	private static FlyMemoryProcessModel instance = new FlyMemoryProcessModel();
	
	private Map<String, FlyProcessModel> processModels;
	
	private FlyMemoryProcessModel() {
		processModels = new LinkedHashMap<>();
	}
	
	public static FlyMemoryProcessModel getInstance() {
		return instance;
	}

	public Map<String, FlyProcessModel> getProcessModels() {
		return processModels;
	}

	public void setProcessModels(Map<String, FlyProcessModel> processModels) {
		this.processModels = processModels;
	}

	public void addProcessModels(List<FlyProcessModel> list) {
		addList(list, processModels, true);
	}
	
	public void addList(List<? extends IDefinition> list, Map target, boolean forceOverride) {
		if (CollectionUtils.isNotEmpty(list)) {
			list.forEach((IDefinition item) -> {
				item.validate();
				if (!target.containsKey(item.getKey()) || forceOverride) {
					target.put(item.getKey(), item);
				} else {
					// 重复
				}
			});
		}
	}
}
