package org.myfly.platform.core.viewmodel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_FieldGroup")
@FlyTable(name = "Field Group", description = "Logical grouping of fields")
@FlyRefTable(apiName = "fieldGroupID", name = "字段组", keyColumn = "fieldGroupID", displayColumn = "name")
public class PFieldGroup extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1600413601509448304L;

	@Id
	@Column(length = 32)
	private String fieldGroupID;

	@Column(name = "EntityType")
	private String entityType;

	@Column(name = "FieldGroupType")
	private FieldGroupType fieldGroupType;

	@Column(length = 60, unique = true)
	private String name;

	@Column(name = "IsCollapsedByDefault")
	private Boolean isCollapsedByDefault;

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public FieldGroupType getFieldGroupType() {
		return fieldGroupType;
	}

	public void setFieldGroupType(FieldGroupType fieldGroupType) {
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

	public String getFieldGroupID() {
		return fieldGroupID;
	}

	public void setFieldGroupID(String fieldGroupID) {
		this.fieldGroupID = fieldGroupID;
	}
}
