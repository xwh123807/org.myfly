package org.myfly.platform.core.visualpage.ui.control;

import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.metamodel.define.EntityAction;
import org.myfly.platform.metamodel.define.ViewType;
import org.myfly.platform.metamodel.utils.EntityUrlUtil;

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
