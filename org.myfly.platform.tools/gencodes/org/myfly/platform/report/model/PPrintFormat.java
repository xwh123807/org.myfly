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
    name = "PT_PrintFormat"
)
@FlyTable(
    name = "Print Format",
    description = "Data Print Format",
    help = ""
)
public class PPrintFormat {
  @Column
  private Boolean isPrintParameters;

  @Column(
      length = 32
  )
  private String printFormatID;

  @Column(
      length = 32
  )
  private String printFontID;

  @Column(
      length = 32
  )
  private String reportViewID;

  @Column(
      length = 32
  )
  private String printColorID;

  @Column
  private Boolean isDefault;

  @Column(
      length = 255
  )
  private String description;

  @Column
  private BigDecimal headerMargin;

  @Column(
      length = 40
  )
  private String printerName;

  @Column(
      length = 255
  )
  private String classname;

  @Column(
      length = 510
  )
  private String args;

  @Column
  private Boolean isForm;

  @Column
  private Boolean isStandardHeaderFooter;

  @Column(
      length = 32
  )
  private String printTableFormatID;

  @Column(
      length = 32
  )
  private String tableID;

  @Column
  private Boolean isTableBased;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private BigDecimal footerMargin;

  @Column(
      length = 1
  )
  private String createCopy;

  @Column(
      length = 32
  )
  private String printPaperID;

  @Column(
      length = 32
  )
  private String jasperProcessID;

  @Column
  private Boolean isSummary;
}
