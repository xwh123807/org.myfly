package org.myfly.platform.core.metadata.builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.metadata.annotation.FetchMode;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;

public class DefaultListViewBuilder extends ListDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5429755838265125601L;

	public DefaultListViewBuilder(EntityMetaData entityMetaData) {
		setName(EntityMetaDataConstants.DEFAULT_ALL_NAME);
		setTitle(entityMetaData.getTableDefinition().getTitle());
		if (StringUtils.isBlank(getTitle())) {
			setTitle(entityMetaData.getEntityName());
		}
		setFields(getAllFields(entityMetaData.getAllFields()));
		setListStyle(ListStyle.TABLE);
		setFetchMode(FetchMode.SERVER_ALL);
		setEnableActions(true);
		setListActions(EntityMetaDataConstants.DEFAULT_ENTITY_LIST_ACTIONS);
		setItemActions(EntityMetaDataConstants.DEFAULT_ENTITY_ITEM_ACTIONS);
		setLabelField(entityMetaData.getTableDefinition().getLabelField());
	}

	private String[] getAllFields(EntityFieldDefinition[] allFields) {
		List<String> list = Stream.of(allFields).map(item -> item.getName()).collect(Collectors.toList());
		return list.toArray(new String[] {});
	}
}
