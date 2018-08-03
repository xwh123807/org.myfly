package org.myfly.platform.core3.model;

import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;
import org.myfly.platform.core3.domain.FlyEntity;

@Entity
@Table(name = "PT_View_Definition")
@FlyTable(name = "View Definition", description = "", help = "")
public class PViewDefinition extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 216240317706733199L;

	@Id
	@Column(length = 32)
	private String viewDefinitionID;

	@Column(length = 1)
	private String processing;

	@Column(length = 20)
	private String tableAlias;

	@Column(length = 255)
	private String joinClause;

	@Column(length = 32)
	private String tableID;

	@Column(length = 32)
	private String viewID;

	@Column
	private BigDecimal seqNo;

	public String getViewDefinitionID() {
		return viewDefinitionID;
	}

	public void setViewDefinitionID(String viewDefinitionID) {
		this.viewDefinitionID = viewDefinitionID;
	}

	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public String getTableAlias() {
		return tableAlias;
	}

	public void setTableAlias(String tableAlias) {
		this.tableAlias = tableAlias;
	}

	public String getJoinClause() {
		return joinClause;
	}

	public void setJoinClause(String joinClause) {
		this.joinClause = joinClause;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public String getViewID() {
		return viewID;
	}

	public void setViewID(String viewID) {
		this.viewID = viewID;
	}

	public BigDecimal getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}
}
