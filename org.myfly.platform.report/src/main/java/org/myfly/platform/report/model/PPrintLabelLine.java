package org.myfly.platform.report.model;

import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_PrintLabelLine")
@FlyTable(name = "Print Label Line", description = "Print Label Line Format", help = "")
public class PPrintLabelLine extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5415435601358809737L;

	@Id
	@Column(length = 32)
	private String printLabelLineID;

	@Column(length = 32)
	private String columnID;

	@Column
	private BigDecimal xPosition;

	@Column
	private BigDecimal yPosition;

	@Column(length = 32)
	private String labelFormatType;

	@Column(length = 32)
	private String labelPrinterFunctionID;

	@Column(length = 60)
	private String name;

	@Column
	private BigDecimal seqNo;

	@Column(length = 32)
	private String printLabelID;

	@Column(length = 60)
	private String printName;

	public String getPrintLabelLineID() {
		return printLabelLineID;
	}

	public void setPrintLabelLineID(String printLabelLineID) {
		this.printLabelLineID = printLabelLineID;
	}

	public String getColumnID() {
		return columnID;
	}

	public void setColumnID(String columnID) {
		this.columnID = columnID;
	}

	public BigDecimal getxPosition() {
		return xPosition;
	}

	public void setxPosition(BigDecimal xPosition) {
		this.xPosition = xPosition;
	}

	public BigDecimal getyPosition() {
		return yPosition;
	}

	public void setyPosition(BigDecimal yPosition) {
		this.yPosition = yPosition;
	}

	public String getLabelFormatType() {
		return labelFormatType;
	}

	public void setLabelFormatType(String labelFormatType) {
		this.labelFormatType = labelFormatType;
	}

	public String getLabelPrinterFunctionID() {
		return labelPrinterFunctionID;
	}

	public void setLabelPrinterFunctionID(String labelPrinterFunctionID) {
		this.labelPrinterFunctionID = labelPrinterFunctionID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public String getPrintLabelID() {
		return printLabelID;
	}

	public void setPrintLabelID(String printLabelID) {
		this.printLabelID = printLabelID;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

}
