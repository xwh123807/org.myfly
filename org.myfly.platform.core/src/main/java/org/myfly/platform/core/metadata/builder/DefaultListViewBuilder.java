package org.myfly.platform.core.metadata.builder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.myfly.platform.core.metadata.annotation.FetchMode;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;

public class DefaultListViewBuilder extends ListViewBuilder {
	public DefaultListViewBuilder(EntityMetaData entityMetaData) {
		setName(EntityMetaDataConstants.DEFAULT_ALL_NAME);
		setTitle(entityMetaData.getTableDefinition().getTitle());
		setFields(getAllFields(entityMetaData.getAllFields()));
		setListStyle(ListStyle.TABLE);
		setEntityName(entityMetaData.getEntityName());
		setFetchMode(FetchMode.SERVER_ALL);
		setEnableActions(true);
		setListActions(EntityMetaDataConstants.DEFAULT_ENTITY_LIST_ACTIONS);
		setItemActions(EntityMetaDataConstants.DEFAULT_ENTITY_ITEM_ACTIONS);
		setLabelField(entityMetaData.getTableDefinition().getLabelField());
	}

	private String[] getAllFields(EntityFieldDefinition[] allFields) {
		return Stream.of(allFields).map(item -> item.getName()).collect(Collectors.toList()).toArray(new String[] {});
	}
}
