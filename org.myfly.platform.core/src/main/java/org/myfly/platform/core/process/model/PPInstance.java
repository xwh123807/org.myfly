package org.myfly.platform.core.process.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_PInstance")
@FlyTable(name = "Process Instance", description = "Instance of the process", help = "")
@FlyRefTable(apiName = "pinstanceID", name = "进程实例", keyColumn = "pinstanceID", displayColumn = "name")
public class PPInstance extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5998431276026446702L;

	@Column(length = 2000)
	private String errorMsg;

	@Column(length = 32)
	private String processID;

	@Id
	@Column(length = 32)
	private String pinstanceID;

	@Column(length = 32)
	private String reportType;

	@Column(length = 32)
	private String printFormatID;

	@Column
	private BigDecimal result;

	@Column
	private Boolean isProcessing;

	@Column(length = 32)
	private String userID;

	@Column
	private BigDecimal recordID;

	@Column(length = 60)
	private String name;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}

	public String getPinstanceID() {
		return pinstanceID;
	}

	public void setPinstanceID(String pinstanceID) {
		this.pinstanceID = pinstanceID;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getPrintFormatID() {
		return printFormatID;
	}

	public void setPrintFormatID(String printFormatID) {
		this.printFormatID = printFormatID;
	}

	public BigDecimal getResult() {
		return result;
	}

	public void setResult(BigDecimal result) {
		this.result = result;
	}

	public Boolean getIsProcessing() {
		return isProcessing;
	}

	public void setIsProcessing(Boolean isProcessing) {
		this.isProcessing = isProcessing;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public BigDecimal getRecordID() {
		return recordID;
	}

	public void setRecordID(BigDecimal recordID) {
		this.recordID = recordID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
