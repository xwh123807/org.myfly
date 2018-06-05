package org.myfly.platform.visualpage.ui.view;

import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.entity.EntityListDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.visualpage.ui.control.EntityTableWidgetBoxRender;

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
		EntityListDefinition listDefinition = entityMetaData.getListDefinition(formViewName);
		EntityTableWidgetBoxRender box = new EntityTableWidgetBoxRender(listDefinition, getViewType());
		return box.html();
	}
}
