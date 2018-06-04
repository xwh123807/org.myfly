package org.myfly.platform.core.metadata.entity;

import org.myfly.platform.core.metadata.define.OutlineDefinition;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EntityOutlineDefinition extends OutlineDefinition{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8904093850819474196L;
	
	@JsonIgnore
	private EntityMetaData parent;

	public EntityOutlineDefinition(OutlineDefinition builder) {
		
	}
}
