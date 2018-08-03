package org.myfly.platform.core3.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;
import org.myfly.platform.core3.domain.FlyEntity;

@Entity
@Table(name = "PT_View_Column")
@FlyTable(name = "View Column", description = "Column of View", help = "")
public class PViewColumn extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9032127043945993541L;

	@Id
	@Column(length = 32)
	private String viewColumnID;

	@Column(length = 32)
	private String entityType;

	@Column(length = 2000)
	private String help;

	@Column(length = 32)
	private String viewDefinitionID;

	@Column(length = 2000)
	private String columnSQL;

	@Column(length = 32)
	private String viewID;

	@Column(length = 32)
	private String columnID;

	@Column(length = 60)
	private String name;

	@Column(length = 255)
	private String columnName;

	@Column(length = 255)
	private String description;

	public String getViewColumnID() {
		return viewColumnID;
	}

	public void setViewColumnID(String viewColumnID) {
		this.viewColumnID = viewColumnID;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getViewDefinitionID() {
		return viewDefinitionID;
	}

	public void setViewDefinitionID(String viewDefinitionID) {
		this.viewDefinitionID = viewDefinitionID;
	}

	public String getColumnSQL() {
		return columnSQL;
	}

	public void setColumnSQL(String columnSQL) {
		this.columnSQL = columnSQL;
	}

	public String getViewID() {
		return viewID;
	}

	public void setViewID(String viewID) {
		this.viewID = viewID;
	}

	public String getColumnID() {
		return columnID;
	}

	public void setColumnID(String columnID) {
		this.columnID = columnID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
