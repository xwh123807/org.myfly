package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PrintTableFormat"
)
@FlyTable(
    name = "Print Table Format",
    description = "Table Format in Reports",
    help = ""
)
public class PPrintTableFormat {
  @Column(
      length = 32
  )
  private String linePrintColorID;

  @Column(
      length = 32
  )
  private String hdrPrintFontID;

  @Column(
      length = 32
  )
  private String printTableFormatID;

  @Column(
      length = 255
  )
  private String headerCenter;

  @Column
  private Boolean isPaintBoundaryLines;

  @Column
  private Boolean isPrintFunctionSymbols;

  @Column
  private Boolean isPaintVLines;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String functFGPrintColorID;

  @Column
  private Boolean imageIsAttached;

  @Column(
      length = 32
  )
  private String hdrTextBGPrintColorID;

  @Column(
      length = 32
  )
  private String hdrLinePrintColorID;

  @Column(
      length = 255
  )
  private String footerLeft;

  @Column
  private Boolean isPaintHeaderLines;

  @Column(
      length = 120
  )
  private String imageURL;

  @Column
  private Boolean isDefault;

  @Column(
      length = 255
  )
  private String headerRight;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 255
  )
  private String footerCenter;

  @Column
  private BigDecimal lineStroke;

  @Column(
      length = 32
  )
  private String hdrTextFGPrintColorID;

  @Column
  private Boolean isMultiLineHeader;

  @Column
  private Boolean isPaintHLines;

  @Column(
      length = 32
  )
  private String functPrintFontID;

  @Column
  private BigDecimal hdrStroke;

  @Column(
      length = 255
  )
  private String footerRight;

  @Column(
      length = 32
  )
  private String functBGPrintColorID;

  @Column(
      length = 32
  )
  private String lineStrokeType;

  @Column(
      length = 32
  )
  private String hdrStrokeType;

  @Column(
      length = 255
  )
  private String headerLeft;

  @Column(
      length = 32
  )
  private String imageID;
}
