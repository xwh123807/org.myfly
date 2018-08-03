package org.myfly.platform.core.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_View")
@FlyTable(name = "View", description = "", help = "")
public class PView extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3655140917165038776L;

	@Id
	@Column(length = 32)
	private String viewID;

	@Column(length = 32)
	private String entityType;

	@Column(length = 60)
	private String value;

	@Column(length = 255)
	private String description;

	@Column(length = 2000)
	private String help;

	@Column(length = 1)
	private String copyFrom;

	@Column(length = 60)
	private String name;

	public String getViewID() {
		return viewID;
	}

	public void setViewID(String viewID) {
		this.viewID = viewID;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getCopyFrom() {
		return copyFrom;
	}

	public void setCopyFrom(String copyFrom) {
		this.copyFrom = copyFrom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
