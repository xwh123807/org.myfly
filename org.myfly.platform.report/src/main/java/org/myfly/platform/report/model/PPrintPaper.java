package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;
import org.myfly.platform.core3.domain.FlyEntity;

@Entity
@Table(name = "PT_PrintPaper")
@FlyTable(name = "Print Paper", description = "Printer paper definition", help = "")
public class PPrintPaper extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5717921095408549070L;

	@Id
	@Column(length = 32)
	private String printPaperID;

	@Column(length = 1)
	private String processing;

	@Column
	private BigDecimal marginLeft;

	@Column
	private BigDecimal marginBottom;

	@Column
	private BigDecimal marginRight;

	@Column(length = 2000)
	private String code;

	@Column(length = 255)
	private String description;

	@Column
	private Boolean isLandscape;

	@Column
	private BigDecimal marginTop;

	@Column(length = 32)
	private String dimensionUnits;

	@Column
	private Boolean isDefault;

	@Column(length = 60)
	private String name;

	@Column
	private BigDecimal sizeX;

	@Column
	private BigDecimal sizeY;

	public String getPrintPaperID() {
		return printPaperID;
	}

	public void setPrintPaperID(String printPaperID) {
		this.printPaperID = printPaperID;
	}

	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public BigDecimal getMarginLeft() {
		return marginLeft;
	}

	public void setMarginLeft(BigDecimal marginLeft) {
		this.marginLeft = marginLeft;
	}

	public BigDecimal getMarginBottom() {
		return marginBottom;
	}

	public void setMarginBottom(BigDecimal marginBottom) {
		this.marginBottom = marginBottom;
	}

	public BigDecimal getMarginRight() {
		return marginRight;
	}

	public void setMarginRight(BigDecimal marginRight) {
		this.marginRight = marginRight;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsLandscape() {
		return isLandscape;
	}

	public void setIsLandscape(Boolean isLandscape) {
		this.isLandscape = isLandscape;
	}

	public BigDecimal getMarginTop() {
		return marginTop;
	}

	public void setMarginTop(BigDecimal marginTop) {
		this.marginTop = marginTop;
	}

	public String getDimensionUnits() {
		return dimensionUnits;
	}

	public void setDimensionUnits(String dimensionUnits) {
		this.dimensionUnits = dimensionUnits;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSizeX() {
		return sizeX;
	}

	public void setSizeX(BigDecimal sizeX) {
		this.sizeX = sizeX;
	}

	public BigDecimal getSizeY() {
		return sizeY;
	}

	public void setSizeY(BigDecimal sizeY) {
		this.sizeY = sizeY;
	}
}
