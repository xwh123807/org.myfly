package org.myfly.platform.core.metadata.builder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;

public class DefaultListViewBuilder extends ListViewBuilder {
	public DefaultListViewBuilder(EntityMetaData entityMetaData) {
		setName("ALL");
		setFields(getAllFields(entityMetaData.getAllFields()));
	}

	private String[] getAllFields(EntityFieldDefinition[] allFields) {
		return Stream.of(allFields).map(item -> item.getName()).collect(Collectors.toList()).toArray(new String[] {});
	}
}
