package org.myfly.platform.core.visualpage.ui.view;

import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.visualpage.ui.control.EntityTableWidgetBoxRender;
import org.myfly.platform.metamodel.define.ListDefinition;
import org.myfly.platform.metamodel.define.ViewMode;
import org.myfly.platform.metamodel.define.ViewType;

public class ListOutlineViewRender extends BaseRender{

	private String entityName;
	private String formViewName;


	public ListOutlineViewRender(String entityName, String formViewName, ViewMode viewMode) {
		super(ViewType.LISTOUTLINE);
		this.entityName = entityName;
		this.formViewName = formViewName;
	}

	
	@Override
	public String htmlForView() {
		EntityMetaData entityMetaData = getEntityMataData(entityName);
		ListDefinition listDefinition = entityMetaData.getListDefinition(formViewName);
		EntityTableWidgetBoxRender box = new EntityTableWidgetBoxRender(listDefinition, getViewType());
		return box.html();
	}
}
