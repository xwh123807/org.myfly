package org.myfly.platform.core3.model.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_FieldGroup")
@FlyTable(name = "Field Group", description = "Logical grouping of fields")
public class PFieldGroup extends FlyEntity {
	@FlyField(name = "Entity Type", dataType = FlyDataType.Table, description = "Dictionary Entity Type; Determines ownership and synchronization", help = "The Entity Types \"Dictionary\", \"Adempiere\" and \"Application\" might be automatically synchronized and customizations deleted or overwritten.  \n"
			+ "\n" + "For customizations, copy the entity and select \"User\"!")
	@Column(name = "EntityType")
	private EntityType entityType;

	@FlyField(name = "Field Group Type")
	@Column(name = "FieldGroupType")
	private String fieldGroupType;

	@FlyField(name = "Name", description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;

	@FlyField(name = "Collapsed By Default", description = "Flag to set the initial state of collapsible field group.")
	@Column(name = "IsCollapsedByDefault")
	private Boolean isCollapsedByDefault;

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public String getFieldGroupType() {
		return fieldGroupType;
	}

	public void setFieldGroupType(String fieldGroupType) {
		this.fieldGroupType = fieldGroupType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsCollapsedByDefault() {
		return isCollapsedByDefault;
	}

	public void setIsCollapsedByDefault(Boolean isCollapsedByDefault) {
		this.isCollapsedByDefault = isCollapsedByDefault;
	}
}
