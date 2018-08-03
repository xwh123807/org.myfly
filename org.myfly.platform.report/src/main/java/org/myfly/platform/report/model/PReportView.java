package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_ReportView")
@FlyTable(name = "Report View", description = "View used to generate this report", help = "")
public class PReportView extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5340496866595669268L;

	@Id
	@Column(length = 32)
	private String reportViewID;

	@Column(length = 32)
	private String entityType;

	@Column(length = 2000)
	private String whereClause;

	@Column(length = 2000)
	private String orderByClause;

	@Column(length = 60)
	private String name;

	@Column(length = 60)
	private String printName;

	@Column(length = 255)
	private String description;

	@Column(length = 32)
	private String tableID;

	@Column
	private Boolean isCentrallyMaintained;

	public String getReportViewID() {
		return reportViewID;
	}

	public void setReportViewID(String reportViewID) {
		this.reportViewID = reportViewID;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public Boolean getIsCentrallyMaintained() {
		return isCentrallyMaintained;
	}

	public void setIsCentrallyMaintained(Boolean isCentrallyMaintained) {
		this.isCentrallyMaintained = isCentrallyMaintained;
	}

}
