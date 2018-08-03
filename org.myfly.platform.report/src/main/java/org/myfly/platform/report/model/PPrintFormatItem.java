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
@Table(name = "PT_PrintFormatItem")
@FlyTable(name = "Print Format Item", description = "Item/Column in the Print format", help = "")
public class PPrintFormatItem extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2584550368708481453L;

	@Column
	private Boolean isDesc;

	@Column
	private Boolean isPrintBarcodeText;

	@Column(length = 2000)
	private String displayLogic;

	@Id
	@Column(length = 32)
	private String printFormatItemID;

	@Column
	private Boolean isMaxCalc;

	@Column(length = 120)
	private String imageURL;

	@Column
	private Boolean isVarianceCalc;

	@Column
	private Boolean imageIsAttached;

	@Column
	private BigDecimal maxHeight;

	@Column
	private Boolean isPrinted;

	@Column
	private Boolean isGroupBy;

	@Column(length = 32)
	private String printAreaType;

	@Column(length = 32)
	private String printFormatChildID;

	@Column
	private Boolean isSummarized;

	@Column(length = 32)
	private String columnID;

	@Column
	private Boolean isNextLine;

	@Column
	private Boolean isPageBreak;

	@Column(length = 32)
	private String lineAlignmentType;

	@Column
	private BigDecimal yPosition;

	@Column(length = 32)
	private String printColorID;

	@Column
	private Boolean isAveraged;

	@Column(length = 32)
	private String printFontID;

	@Column
	private Boolean isFixedWidth;

	@Column
	private Boolean isRelativePosition;

	@Column
	private Boolean isSuppressNull;

	@Column(length = 32)
	private String printGraphID;

	@Column
	private BigDecimal maxWidth;

	@Column
	private Boolean isSetNLPosition;

	@Column
	private Boolean isNextPage;

	@Column
	private Boolean isMinCalc;

	@Column(length = 60)
	private String printNameSuffix;

	@Column
	private BigDecimal arcDiameter;

	@Column(length = 32)
	private String shapeType;

	@Column
	private Boolean isFilledRectangle;

	@Column
	private BigDecimal lineWidth;

	@Column(length = 32)
	private String barcodeType;

	@Column(length = 22)
	private String formatPattern;

	@Column
	private Boolean isOrderBy;

	@Column
	private BigDecimal sortNo;

	@Column
	private Boolean isHeightOneLine;

	@Column
	private BigDecimal xPosition;

	@Column(length = 32)
	private String printFormatType;

	@Column(length = 32)
	private String printFormatID;

	@Column
	private BigDecimal xSpace;

	@Column
	private BigDecimal seqNo;

	@Column(length = 2000)
	private String printName;

	@Column(length = 60)
	private String name;

	@Column
	private Boolean isCounted;

	@Column
	private BigDecimal belowColumn;

	@Column(length = 32)
	private String fieldAlignmentType;

	@Column
	private BigDecimal runningTotalLines;

	@Column
	private BigDecimal ySpace;

	@Column
	private Boolean isRunningTotal;

	@Column
	private Boolean isDeviationCalc;

	@Column
	private Boolean isSuppressRepeats;

	@Column
	private Boolean isCentrallyMaintained;

	@Column
	private Boolean isImageField;

	public Boolean getIsDesc() {
		return isDesc;
	}

	public void setIsDesc(Boolean isDesc) {
		this.isDesc = isDesc;
	}

	public Boolean getIsPrintBarcodeText() {
		return isPrintBarcodeText;
	}

	public void setIsPrintBarcodeText(Boolean isPrintBarcodeText) {
		this.isPrintBarcodeText = isPrintBarcodeText;
	}

	public String getDisplayLogic() {
		return displayLogic;
	}

	public void setDisplayLogic(String displayLogic) {
		this.displayLogic = displayLogic;
	}

	public String getPrintFormatItemID() {
		return printFormatItemID;
	}

	public void setPrintFormatItemID(String printFormatItemID) {
		this.printFormatItemID = printFormatItemID;
	}

	public Boolean getIsMaxCalc() {
		return isMaxCalc;
	}

	public void setIsMaxCalc(Boolean isMaxCalc) {
		this.isMaxCalc = isMaxCalc;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Boolean getIsVarianceCalc() {
		return isVarianceCalc;
	}

	public void setIsVarianceCalc(Boolean isVarianceCalc) {
		this.isVarianceCalc = isVarianceCalc;
	}

	public Boolean getImageIsAttached() {
		return imageIsAttached;
	}

	public void setImageIsAttached(Boolean imageIsAttached) {
		this.imageIsAttached = imageIsAttached;
	}

	public BigDecimal getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(BigDecimal maxHeight) {
		this.maxHeight = maxHeight;
	}

	public Boolean getIsPrinted() {
		return isPrinted;
	}

	public void setIsPrinted(Boolean isPrinted) {
		this.isPrinted = isPrinted;
	}

	public Boolean getIsGroupBy() {
		return isGroupBy;
	}

	public void setIsGroupBy(Boolean isGroupBy) {
		this.isGroupBy = isGroupBy;
	}

	public String getPrintAreaType() {
		return printAreaType;
	}

	public void setPrintAreaType(String printAreaType) {
		this.printAreaType = printAreaType;
	}

	public String getPrintFormatChildID() {
		return printFormatChildID;
	}

	public void setPrintFormatChildID(String printFormatChildID) {
		this.printFormatChildID = printFormatChildID;
	}

	public Boolean getIsSummarized() {
		return isSummarized;
	}

	public void setIsSummarized(Boolean isSummarized) {
		this.isSummarized = isSummarized;
	}

	public String getColumnID() {
		return columnID;
	}

	public void setColumnID(String columnID) {
		this.columnID = columnID;
	}

	public Boolean getIsNextLine() {
		return isNextLine;
	}

	public void setIsNextLine(Boolean isNextLine) {
		this.isNextLine = isNextLine;
	}

	public Boolean getIsPageBreak() {
		return isPageBreak;
	}

	public void setIsPageBreak(Boolean isPageBreak) {
		this.isPageBreak = isPageBreak;
	}

	public String getLineAlignmentType() {
		return lineAlignmentType;
	}

	public void setLineAlignmentType(String lineAlignmentType) {
		this.lineAlignmentType = lineAlignmentType;
	}

	public BigDecimal getyPosition() {
		return yPosition;
	}

	public void setyPosition(BigDecimal yPosition) {
		this.yPosition = yPosition;
	}

	public String getPrintColorID() {
		return printColorID;
	}

	public void setPrintColorID(String printColorID) {
		this.printColorID = printColorID;
	}

	public Boolean getIsAveraged() {
		return isAveraged;
	}

	public void setIsAveraged(Boolean isAveraged) {
		this.isAveraged = isAveraged;
	}

	public String getPrintFontID() {
		return printFontID;
	}

	public void setPrintFontID(String printFontID) {
		this.printFontID = printFontID;
	}

	public Boolean getIsFixedWidth() {
		return isFixedWidth;
	}

	public void setIsFixedWidth(Boolean isFixedWidth) {
		this.isFixedWidth = isFixedWidth;
	}

	public Boolean getIsRelativePosition() {
		return isRelativePosition;
	}

	public void setIsRelativePosition(Boolean isRelativePosition) {
		this.isRelativePosition = isRelativePosition;
	}

	public Boolean getIsSuppressNull() {
		return isSuppressNull;
	}

	public void setIsSuppressNull(Boolean isSuppressNull) {
		this.isSuppressNull = isSuppressNull;
	}

	public String getPrintGraphID() {
		return printGraphID;
	}

	public void setPrintGraphID(String printGraphID) {
		this.printGraphID = printGraphID;
	}

	public BigDecimal getMaxWidth() {
		return maxWidth;
	}

	public void setMaxWidth(BigDecimal maxWidth) {
		this.maxWidth = maxWidth;
	}

	public Boolean getIsSetNLPosition() {
		return isSetNLPosition;
	}

	public void setIsSetNLPosition(Boolean isSetNLPosition) {
		this.isSetNLPosition = isSetNLPosition;
	}

	public Boolean getIsNextPage() {
		return isNextPage;
	}

	public void setIsNextPage(Boolean isNextPage) {
		this.isNextPage = isNextPage;
	}

	public Boolean getIsMinCalc() {
		return isMinCalc;
	}

	public void setIsMinCalc(Boolean isMinCalc) {
		this.isMinCalc = isMinCalc;
	}

	public String getPrintNameSuffix() {
		return printNameSuffix;
	}

	public void setPrintNameSuffix(String printNameSuffix) {
		this.printNameSuffix = printNameSuffix;
	}

	public BigDecimal getArcDiameter() {
		return arcDiameter;
	}

	public void setArcDiameter(BigDecimal arcDiameter) {
		this.arcDiameter = arcDiameter;
	}

	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	public Boolean getIsFilledRectangle() {
		return isFilledRectangle;
	}

	public void setIsFilledRectangle(Boolean isFilledRectangle) {
		this.isFilledRectangle = isFilledRectangle;
	}

	public BigDecimal getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(BigDecimal lineWidth) {
		this.lineWidth = lineWidth;
	}

	public String getBarcodeType() {
		return barcodeType;
	}

	public void setBarcodeType(String barcodeType) {
		this.barcodeType = barcodeType;
	}

	public String getFormatPattern() {
		return formatPattern;
	}

	public void setFormatPattern(String formatPattern) {
		this.formatPattern = formatPattern;
	}

	public Boolean getIsOrderBy() {
		return isOrderBy;
	}

	public void setIsOrderBy(Boolean isOrderBy) {
		this.isOrderBy = isOrderBy;
	}

	public BigDecimal getSortNo() {
		return sortNo;
	}

	public void setSortNo(BigDecimal sortNo) {
		this.sortNo = sortNo;
	}

	public Boolean getIsHeightOneLine() {
		return isHeightOneLine;
	}

	public void setIsHeightOneLine(Boolean isHeightOneLine) {
		this.isHeightOneLine = isHeightOneLine;
	}

	public BigDecimal getxPosition() {
		return xPosition;
	}

	public void setxPosition(BigDecimal xPosition) {
		this.xPosition = xPosition;
	}

	public String getPrintFormatType() {
		return printFormatType;
	}

	public void setPrintFormatType(String printFormatType) {
		this.printFormatType = printFormatType;
	}

	public String getPrintFormatID() {
		return printFormatID;
	}

	public void setPrintFormatID(String printFormatID) {
		this.printFormatID = printFormatID;
	}

	public BigDecimal getxSpace() {
		return xSpace;
	}

	public void setxSpace(BigDecimal xSpace) {
		this.xSpace = xSpace;
	}

	public BigDecimal getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsCounted() {
		return isCounted;
	}

	public void setIsCounted(Boolean isCounted) {
		this.isCounted = isCounted;
	}

	public BigDecimal getBelowColumn() {
		return belowColumn;
	}

	public void setBelowColumn(BigDecimal belowColumn) {
		this.belowColumn = belowColumn;
	}

	public String getFieldAlignmentType() {
		return fieldAlignmentType;
	}

	public void setFieldAlignmentType(String fieldAlignmentType) {
		this.fieldAlignmentType = fieldAlignmentType;
	}

	public BigDecimal getRunningTotalLines() {
		return runningTotalLines;
	}

	public void setRunningTotalLines(BigDecimal runningTotalLines) {
		this.runningTotalLines = runningTotalLines;
	}

	public BigDecimal getySpace() {
		return ySpace;
	}

	public void setySpace(BigDecimal ySpace) {
		this.ySpace = ySpace;
	}

	public Boolean getIsRunningTotal() {
		return isRunningTotal;
	}

	public void setIsRunningTotal(Boolean isRunningTotal) {
		this.isRunningTotal = isRunningTotal;
	}

	public Boolean getIsDeviationCalc() {
		return isDeviationCalc;
	}

	public void setIsDeviationCalc(Boolean isDeviationCalc) {
		this.isDeviationCalc = isDeviationCalc;
	}

	public Boolean getIsSuppressRepeats() {
		return isSuppressRepeats;
	}

	public void setIsSuppressRepeats(Boolean isSuppressRepeats) {
		this.isSuppressRepeats = isSuppressRepeats;
	}

	public Boolean getIsCentrallyMaintained() {
		return isCentrallyMaintained;
	}

	public void setIsCentrallyMaintained(Boolean isCentrallyMaintained) {
		this.isCentrallyMaintained = isCentrallyMaintained;
	}

	public Boolean getIsImageField() {
		return isImageField;
	}

	public void setIsImageField(Boolean isImageField) {
		this.isImageField = isImageField;
	}

}
