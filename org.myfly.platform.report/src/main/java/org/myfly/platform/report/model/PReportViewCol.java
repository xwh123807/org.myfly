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
@Table(name = "PT_ReportView_Col")
@FlyTable(name = "Report view Column", description = "", help = "")
public class PReportViewCol extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1505753848747152553L;

	@Id
	@Column(length = 32)
	private String reportViewColID;

	@Column(length = 60)
	private String functionColumn;

	@Column(length = 32)
	private String columnID;

	@Column
	private Boolean isGroupFunction;

	@Column(length = 32)
	private String reportViewID;

	public String getReportViewColID() {
		return reportViewColID;
	}

	public void setReportViewColID(String reportViewColID) {
		this.reportViewColID = reportViewColID;
	}

	public String getFunctionColumn() {
		return functionColumn;
	}

	public void setFunctionColumn(String functionColumn) {
		this.functionColumn = functionColumn;
	}

	public String getColumnID() {
		return columnID;
	}

	public void setColumnID(String columnID) {
		this.columnID = columnID;
	}

	public Boolean getIsGroupFunction() {
		return isGroupFunction;
	}

	public void setIsGroupFunction(Boolean isGroupFunction) {
		this.isGroupFunction = isGroupFunction;
	}

	public String getReportViewID() {
		return reportViewID;
	}

	public void setReportViewID(String reportViewID) {
		this.reportViewID = reportViewID;
	}
}
