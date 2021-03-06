package org.myfly.platform.visualpage.ui.control;

import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.annotation.EntityAction;
import org.myfly.platform.core.utils.EntityUrlUtil;

public class SelectListViewRender extends SelectViewRender {

	public SelectListViewRender(String entityName, ViewType viewType, String viewName) {
		super(entityName, viewType, viewName);
	}

	@Override
	public Map<String, String> getOptions() {
		Map<String, String> map = new HashMap<>();
		for (String name : getEntityMetaData().getListDefinitions().keySet()) {
			map.put(name, name);
		}
		return map;
	}

	@Override
	public String getUrl() {
		return EntityUrlUtil.getEntityActionUrl(EntityAction.LIST, getEntityMetaData().getEntityName(), null, null);
	}
}
