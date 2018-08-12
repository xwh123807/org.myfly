package org.myfly.platform.core.process.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_Process")
@FlyTable(name = "过程", description = "Process or Report", help = "")
@FlyRefTable(apiName = "processID", keyColumn = "processID", displayColumn = "name", name = "进程")
public class PProcess extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 640570265000229678L;

	@Id
	@Column(name="ProcessID", length = 32)
	private String processID;
	
	@Column(length = 255, name = "ApiName", unique = true)
	private String apiName;

	@Column(length = 255)
	private String description;

	@Column(length = 32)
	private String entityType;

	@Column(length = 60)
	private String name;

	@Column(length = 32)
	private String workflowID;

	@Column(length = 255)
	private String classname;

	@Column(length = 32)
	private String printFormatID;

	@Column
	private Boolean isDirectPrint;

	@Column(length = 40)
	private String workflowValue;

	@Column(length = 255)
	private String jasperReport;

	@Column(length = 32)
	private String formID;

	@Column
	private Boolean isServerProcess;

	@Column(length = 32)
	private String showHelp;

	@Column
	private BigDecimal statisticSeconds;

	@Column(length = 2000)
	private String help;

	@Column(length = 32)
	private String reportViewID;

	@Column(length = 60)
	private String procedureName;

	@Column
	private BigDecimal statisticCount;

	@Column(length = 40)
	private String value;

	@Column(length = 32)
	private String browseID;

	@Column(length = 1)
	private String copyFromProcess;

	@Column(length = 1)
	private String generateClass;

	@Column(length = 32)
	private String accessLevel;

	@Column
	private Boolean isBetaFunctionality;

	@Column
	private Boolean isReport;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkflowID() {
		return workflowID;
	}

	public void setWorkflowID(String workflowID) {
		this.workflowID = workflowID;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getPrintFormatID() {
		return printFormatID;
	}

	public void setPrintFormatID(String printFormatID) {
		this.printFormatID = printFormatID;
	}

	public Boolean getIsDirectPrint() {
		return isDirectPrint;
	}

	public void setIsDirectPrint(Boolean isDirectPrint) {
		this.isDirectPrint = isDirectPrint;
	}

	public String getWorkflowValue() {
		return workflowValue;
	}

	public void setWorkflowValue(String workflowValue) {
		this.workflowValue = workflowValue;
	}

	public String getJasperReport() {
		return jasperReport;
	}

	public void setJasperReport(String jasperReport) {
		this.jasperReport = jasperReport;
	}

	public String getFormID() {
		return formID;
	}

	public void setFormID(String formID) {
		this.formID = formID;
	}

	public Boolean getIsServerProcess() {
		return isServerProcess;
	}

	public void setIsServerProcess(Boolean isServerProcess) {
		this.isServerProcess = isServerProcess;
	}

	public String getShowHelp() {
		return showHelp;
	}

	public void setShowHelp(String showHelp) {
		this.showHelp = showHelp;
	}

	public BigDecimal getStatisticSeconds() {
		return statisticSeconds;
	}

	public void setStatisticSeconds(BigDecimal statisticSeconds) {
		this.statisticSeconds = statisticSeconds;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getReportViewID() {
		return reportViewID;
	}

	public void setReportViewID(String reportViewID) {
		this.reportViewID = reportViewID;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public BigDecimal getStatisticCount() {
		return statisticCount;
	}

	public void setStatisticCount(BigDecimal statisticCount) {
		this.statisticCount = statisticCount;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getBrowseID() {
		return browseID;
	}

	public void setBrowseID(String browseID) {
		this.browseID = browseID;
	}

	public String getCopyFromProcess() {
		return copyFromProcess;
	}

	public void setCopyFromProcess(String copyFromProcess) {
		this.copyFromProcess = copyFromProcess;
	}

	public String getGenerateClass() {
		return generateClass;
	}

	public void setGenerateClass(String generateClass) {
		this.generateClass = generateClass;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public Boolean getIsBetaFunctionality() {
		return isBetaFunctionality;
	}

	public void setIsBetaFunctionality(Boolean isBetaFunctionality) {
		this.isBetaFunctionality = isBetaFunctionality;
	}

	public Boolean getIsReport() {
		return isReport;
	}

	public void setIsReport(Boolean isReport) {
		this.isReport = isReport;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

}
