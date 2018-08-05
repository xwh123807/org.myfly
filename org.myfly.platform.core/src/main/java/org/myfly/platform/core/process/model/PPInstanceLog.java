package org.myfly.platform.core.process.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_PInstance_Log")
@FlyTable(name = "Log", description = "", help = "")
public class PPInstanceLog extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1937710086686937001L;

	@Column(length = 32)
	private String pID;

	@Id
	@Column(length = 32)
	private String pinstanceLogID;

	@Column(length = 32)
	private String pinstanceID;

	@Column
	private BigDecimal pNumber;

	@Column(length = 2000)
	private String pmsg;

	@Column
	private Date pDate;

	public String getpID() {
		return pID;
	}

	public void setpID(String pID) {
		this.pID = pID;
	}

	public String getPinstanceLogID() {
		return pinstanceLogID;
	}

	public void setPinstanceLogID(String pinstanceLogID) {
		this.pinstanceLogID = pinstanceLogID;
	}

	public String getPinstanceID() {
		return pinstanceID;
	}

	public void setPinstanceID(String pinstanceID) {
		this.pinstanceID = pinstanceID;
	}

	public BigDecimal getpNumber() {
		return pNumber;
	}

	public void setpNumber(BigDecimal pNumber) {
		this.pNumber = pNumber;
	}

	public String getPmsg() {
		return pmsg;
	}

	public void setPmsg(String pmsg) {
		this.pmsg = pmsg;
	}

	public Date getpDate() {
		return pDate;
	}

	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}

}
