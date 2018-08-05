package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PrintPaper"
)
@FlyTable(
    name = "Print Paper",
    description = "Printer paper definition",
    help = ""
)
public class PPrintPaper {
  @Column(
      length = 32
  )
  private String printPaperID;

  @Column(
      length = 1
  )
  private String processing;

  @Column
  private BigDecimal marginLeft;

  @Column
  private BigDecimal marginBottom;

  @Column
  private BigDecimal marginRight;

  @Column(
      length = 2000
  )
  private String code;

  @Column(
      length = 255
  )
  private String description;

  @Column
  private Boolean isLandscape;

  @Column
  private BigDecimal marginTop;

  @Column(
      length = 32
  )
  private String dimensionUnits;

  @Column
  private Boolean isDefault;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private BigDecimal sizeX;

  @Column
  private BigDecimal sizeY;
}
