package org.myfly.platform.core.metadata.builder;

import org.myfly.platform.core.metadata.define.OutlineDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;

public class DefaultOutlineViewBuilder extends OutlineDefinition{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8539630799654867808L;

	public DefaultOutlineViewBuilder(EntityMetaData entityMetaData) {
		setName(EntityMetaDataConstants.DEFAULT_ALL_NAME);
	}
}
