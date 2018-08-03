package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_PrintFormat")
@FlyTable(name = "Print Format", description = "Data Print Format", help = "")
public class PPrintFormat extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3157239881591976681L;

	@Column
	private Boolean isPrintParameters;

	@Id
	@Column(length = 32)
	private String printFormatID;

	@Column(length = 32)
	private String printFontID;

	@Column(length = 32)
	private String reportViewID;

	@Column(length = 32)
	private String printColorID;

	@Column
	private Boolean isDefault;

	@Column(length = 255)
	private String description;

	@Column
	private BigDecimal headerMargin;

	@Column(length = 40)
	private String printerName;

	@Column(length = 255)
	private String classname;

	@Column(length = 510)
	private String args;

	@Column
	private Boolean isForm;

	@Column
	private Boolean isStandardHeaderFooter;

	@Column(length = 32)
	private String printTableFormatID;

	@Column(length = 32)
	private String tableID;

	@Column
	private Boolean isTableBased;

	@Column(length = 60)
	private String name;

	@Column
	private BigDecimal footerMargin;

	@Column(length = 1)
	private String createCopy;

	@Column(length = 32)
	private String printPaperID;

	@Column(length = 32)
	private String jasperProcessID;

	@Column
	private Boolean isSummary;

	public Boolean getIsPrintParameters() {
		return isPrintParameters;
	}

	public void setIsPrintParameters(Boolean isPrintParameters) {
		this.isPrintParameters = isPrintParameters;
	}

	public String getPrintFormatID() {
		return printFormatID;
	}

	public void setPrintFormatID(String printFormatID) {
		this.printFormatID = printFormatID;
	}

	public String getPrintFontID() {
		return printFontID;
	}

	public void setPrintFontID(String printFontID) {
		this.printFontID = printFontID;
	}

	public String getReportViewID() {
		return reportViewID;
	}

	public void setReportViewID(String reportViewID) {
		this.reportViewID = reportViewID;
	}

	public String getPrintColorID() {
		return printColorID;
	}

	public void setPrintColorID(String printColorID) {
		this.printColorID = printColorID;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getHeaderMargin() {
		return headerMargin;
	}

	public void setHeaderMargin(BigDecimal headerMargin) {
		this.headerMargin = headerMargin;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getArgs() {
		return args;
	}

	public void setArgs(String args) {
		this.args = args;
	}

	public Boolean getIsForm() {
		return isForm;
	}

	public void setIsForm(Boolean isForm) {
		this.isForm = isForm;
	}

	public Boolean getIsStandardHeaderFooter() {
		return isStandardHeaderFooter;
	}

	public void setIsStandardHeaderFooter(Boolean isStandardHeaderFooter) {
		this.isStandardHeaderFooter = isStandardHeaderFooter;
	}

	public String getPrintTableFormatID() {
		return printTableFormatID;
	}

	public void setPrintTableFormatID(String printTableFormatID) {
		this.printTableFormatID = printTableFormatID;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public Boolean getIsTableBased() {
		return isTableBased;
	}

	public void setIsTableBased(Boolean isTableBased) {
		this.isTableBased = isTableBased;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getFooterMargin() {
		return footerMargin;
	}

	public void setFooterMargin(BigDecimal footerMargin) {
		this.footerMargin = footerMargin;
	}

	public String getCreateCopy() {
		return createCopy;
	}

	public void setCreateCopy(String createCopy) {
		this.createCopy = createCopy;
	}

	public String getPrintPaperID() {
		return printPaperID;
	}

	public void setPrintPaperID(String printPaperID) {
		this.printPaperID = printPaperID;
	}

	public String getJasperProcessID() {
		return jasperProcessID;
	}

	public void setJasperProcessID(String jasperProcessID) {
		this.jasperProcessID = jasperProcessID;
	}

	public Boolean getIsSummary() {
		return isSummary;
	}

	public void setIsSummary(Boolean isSummary) {
		this.isSummary = isSummary;
	}

}
