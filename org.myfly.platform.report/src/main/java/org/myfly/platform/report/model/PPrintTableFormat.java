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
@Table(name = "PT_PrintTableFormat")
@FlyTable(name = "Print Table Format", description = "Table Format in Reports", help = "")
public class PPrintTableFormat extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6380352093020228742L;

	@Column(length = 32)
	private String linePrintColorID;

	@Column(length = 32)
	private String hdrPrintFontID;

	@Id
	@Column(length = 32)
	private String printTableFormatID;

	@Column(length = 255)
	private String headerCenter;

	@Column
	private Boolean isPaintBoundaryLines;

	@Column
	private Boolean isPrintFunctionSymbols;

	@Column
	private Boolean isPaintVLines;

	@Column(length = 60)
	private String name;

	@Column(length = 32)
	private String functFGPrintColorID;

	@Column
	private Boolean imageIsAttached;

	@Column(length = 32)
	private String hdrTextBGPrintColorID;

	@Column(length = 32)
	private String hdrLinePrintColorID;

	@Column(length = 255)
	private String footerLeft;

	@Column
	private Boolean isPaintHeaderLines;

	@Column(length = 120)
	private String imageURL;

	@Column
	private Boolean isDefault;

	@Column(length = 255)
	private String headerRight;

	@Column(length = 255)
	private String description;

	@Column(length = 255)
	private String footerCenter;

	@Column
	private BigDecimal lineStroke;

	@Column(length = 32)
	private String hdrTextFGPrintColorID;

	@Column
	private Boolean isMultiLineHeader;

	@Column
	private Boolean isPaintHLines;

	@Column(length = 32)
	private String functPrintFontID;

	@Column
	private BigDecimal hdrStroke;

	@Column(length = 255)
	private String footerRight;

	@Column(length = 32)
	private String functBGPrintColorID;

	@Column(length = 32)
	private String lineStrokeType;

	@Column(length = 32)
	private String hdrStrokeType;

	@Column(length = 255)
	private String headerLeft;

	@Column(length = 32)
	private String imageID;

	public String getLinePrintColorID() {
		return linePrintColorID;
	}

	public void setLinePrintColorID(String linePrintColorID) {
		this.linePrintColorID = linePrintColorID;
	}

	public String getHdrPrintFontID() {
		return hdrPrintFontID;
	}

	public void setHdrPrintFontID(String hdrPrintFontID) {
		this.hdrPrintFontID = hdrPrintFontID;
	}

	public String getPrintTableFormatID() {
		return printTableFormatID;
	}

	public void setPrintTableFormatID(String printTableFormatID) {
		this.printTableFormatID = printTableFormatID;
	}

	public String getHeaderCenter() {
		return headerCenter;
	}

	public void setHeaderCenter(String headerCenter) {
		this.headerCenter = headerCenter;
	}

	public Boolean getIsPaintBoundaryLines() {
		return isPaintBoundaryLines;
	}

	public void setIsPaintBoundaryLines(Boolean isPaintBoundaryLines) {
		this.isPaintBoundaryLines = isPaintBoundaryLines;
	}

	public Boolean getIsPrintFunctionSymbols() {
		return isPrintFunctionSymbols;
	}

	public void setIsPrintFunctionSymbols(Boolean isPrintFunctionSymbols) {
		this.isPrintFunctionSymbols = isPrintFunctionSymbols;
	}

	public Boolean getIsPaintVLines() {
		return isPaintVLines;
	}

	public void setIsPaintVLines(Boolean isPaintVLines) {
		this.isPaintVLines = isPaintVLines;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunctFGPrintColorID() {
		return functFGPrintColorID;
	}

	public void setFunctFGPrintColorID(String functFGPrintColorID) {
		this.functFGPrintColorID = functFGPrintColorID;
	}

	public Boolean getImageIsAttached() {
		return imageIsAttached;
	}

	public void setImageIsAttached(Boolean imageIsAttached) {
		this.imageIsAttached = imageIsAttached;
	}

	public String getHdrTextBGPrintColorID() {
		return hdrTextBGPrintColorID;
	}

	public void setHdrTextBGPrintColorID(String hdrTextBGPrintColorID) {
		this.hdrTextBGPrintColorID = hdrTextBGPrintColorID;
	}

	public String getHdrLinePrintColorID() {
		return hdrLinePrintColorID;
	}

	public void setHdrLinePrintColorID(String hdrLinePrintColorID) {
		this.hdrLinePrintColorID = hdrLinePrintColorID;
	}

	public String getFooterLeft() {
		return footerLeft;
	}

	public void setFooterLeft(String footerLeft) {
		this.footerLeft = footerLeft;
	}

	public Boolean getIsPaintHeaderLines() {
		return isPaintHeaderLines;
	}

	public void setIsPaintHeaderLines(Boolean isPaintHeaderLines) {
		this.isPaintHeaderLines = isPaintHeaderLines;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getHeaderRight() {
		return headerRight;
	}

	public void setHeaderRight(String headerRight) {
		this.headerRight = headerRight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFooterCenter() {
		return footerCenter;
	}

	public void setFooterCenter(String footerCenter) {
		this.footerCenter = footerCenter;
	}

	public BigDecimal getLineStroke() {
		return lineStroke;
	}

	public void setLineStroke(BigDecimal lineStroke) {
		this.lineStroke = lineStroke;
	}

	public String getHdrTextFGPrintColorID() {
		return hdrTextFGPrintColorID;
	}

	public void setHdrTextFGPrintColorID(String hdrTextFGPrintColorID) {
		this.hdrTextFGPrintColorID = hdrTextFGPrintColorID;
	}

	public Boolean getIsMultiLineHeader() {
		return isMultiLineHeader;
	}

	public void setIsMultiLineHeader(Boolean isMultiLineHeader) {
		this.isMultiLineHeader = isMultiLineHeader;
	}

	public Boolean getIsPaintHLines() {
		return isPaintHLines;
	}

	public void setIsPaintHLines(Boolean isPaintHLines) {
		this.isPaintHLines = isPaintHLines;
	}

	public String getFunctPrintFontID() {
		return functPrintFontID;
	}

	public void setFunctPrintFontID(String functPrintFontID) {
		this.functPrintFontID = functPrintFontID;
	}

	public BigDecimal getHdrStroke() {
		return hdrStroke;
	}

	public void setHdrStroke(BigDecimal hdrStroke) {
		this.hdrStroke = hdrStroke;
	}

	public String getFooterRight() {
		return footerRight;
	}

	public void setFooterRight(String footerRight) {
		this.footerRight = footerRight;
	}

	public String getFunctBGPrintColorID() {
		return functBGPrintColorID;
	}

	public void setFunctBGPrintColorID(String functBGPrintColorID) {
		this.functBGPrintColorID = functBGPrintColorID;
	}

	public String getLineStrokeType() {
		return lineStrokeType;
	}

	public void setLineStrokeType(String lineStrokeType) {
		this.lineStrokeType = lineStrokeType;
	}

	public String getHdrStrokeType() {
		return hdrStrokeType;
	}

	public void setHdrStrokeType(String hdrStrokeType) {
		this.hdrStrokeType = hdrStrokeType;
	}

	public String getHeaderLeft() {
		return headerLeft;
	}

	public void setHeaderLeft(String headerLeft) {
		this.headerLeft = headerLeft;
	}

	public String getImageID() {
		return imageID;
	}

	public void setImageID(String imageID) {
		this.imageID = imageID;
	}
}
