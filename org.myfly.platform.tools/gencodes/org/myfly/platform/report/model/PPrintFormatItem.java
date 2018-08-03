package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PrintFormatItem"
)
@FlyTable(
    name = "Print Format Item",
    description = "Item/Column in the Print format",
    help = ""
)
public class PPrintFormatItem {
  @Column
  private Boolean isDesc;

  @Column
  private Boolean isPrintBarcodeText;

  @Column(
      length = 2000
  )
  private String displayLogic;

  @Column(
      length = 32
  )
  private String printFormatItemID;

  @Column
  private Boolean isMaxCalc;

  @Column(
      length = 120
  )
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

  @Column(
      length = 32
  )
  private String printAreaType;

  @Column(
      length = 32
  )
  private String printFormatChildID;

  @Column
  private Boolean isSummarized;

  @Column(
      length = 32
  )
  private String columnID;

  @Column
  private Boolean isNextLine;

  @Column
  private Boolean isPageBreak;

  @Column(
      length = 32
  )
  private String lineAlignmentType;

  @Column
  private BigDecimal yPosition;

  @Column(
      length = 32
  )
  private String printColorID;

  @Column
  private Boolean isAveraged;

  @Column(
      length = 32
  )
  private String printFontID;

  @Column
  private Boolean isFixedWidth;

  @Column
  private Boolean isRelativePosition;

  @Column
  private Boolean isSuppressNull;

  @Column(
      length = 32
  )
  private String printGraphID;

  @Column
  private BigDecimal maxWidth;

  @Column
  private Boolean isSetNLPosition;

  @Column
  private Boolean isNextPage;

  @Column
  private Boolean isMinCalc;

  @Column(
      length = 60
  )
  private String printNameSuffix;

  @Column
  private BigDecimal arcDiameter;

  @Column(
      length = 32
  )
  private String shapeType;

  @Column
  private Boolean isFilledRectangle;

  @Column
  private BigDecimal lineWidth;

  @Column(
      length = 32
  )
  private String barcodeType;

  @Column(
      length = 22
  )
  private String formatPattern;

  @Column
  private Boolean isOrderBy;

  @Column
  private BigDecimal sortNo;

  @Column
  private Boolean isHeightOneLine;

  @Column
  private BigDecimal xPosition;

  @Column(
      length = 32
  )
  private String printFormatType;

  @Column(
      length = 32
  )
  private String printFormatID;

  @Column
  private BigDecimal xSpace;

  @Column
  private BigDecimal seqNo;

  @Column(
      length = 2000
  )
  private String printName;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private Boolean isCounted;

  @Column
  private BigDecimal belowColumn;

  @Column(
      length = 32
  )
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
}
