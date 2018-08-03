package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_PrintLabel")
@FlyTable(name = "Print Label", description = "Label Format to print", help = "")
public class PPrintLabel extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4444627506387069387L;

	@Id
	@Column(length = 32)
	private String printLabelID;

	@Column(length = 32)
	private String labelPrinterID;

	@Column
	private BigDecimal labelHeight;

	@Column
	private Boolean isLandscape;

	@Column(length = 32)
	private String tableID;

	@Column
	private BigDecimal labelWidth;

	@Column(length = 40)
	private String printerName;

	@Column(length = 255)
	private String description;

	@Column(length = 60)
	private String name;

	public String getPrintLabelID() {
		return printLabelID;
	}

	public void setPrintLabelID(String printLabelID) {
		this.printLabelID = printLabelID;
	}

	public String getLabelPrinterID() {
		return labelPrinterID;
	}

	public void setLabelPrinterID(String labelPrinterID) {
		this.labelPrinterID = labelPrinterID;
	}

	public BigDecimal getLabelHeight() {
		return labelHeight;
	}

	public void setLabelHeight(BigDecimal labelHeight) {
		this.labelHeight = labelHeight;
	}

	public Boolean getIsLandscape() {
		return isLandscape;
	}

	public void setIsLandscape(Boolean isLandscape) {
		this.isLandscape = isLandscape;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public BigDecimal getLabelWidth() {
		return labelWidth;
	}

	public void setLabelWidth(BigDecimal labelWidth) {
		this.labelWidth = labelWidth;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
