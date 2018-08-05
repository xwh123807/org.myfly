package org.myfly.platform.report.model;

import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PrintLabelLine"
)
@FlyTable(
    name = "Print Label Line",
    description = "Print Label Line Format",
    help = ""
)
public class PPrintLabelLine {
  @Column(
      length = 32
  )
  private String printLabelLineID;

  @Column(
      length = 32
  )
  private String columnID;

  @Column
  private BigDecimal xPosition;

  @Column
  private BigDecimal yPosition;

  @Column(
      length = 32
  )
  private String labelFormatType;

  @Column(
      length = 32
  )
  private String labelPrinterFunctionID;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private BigDecimal seqNo;

  @Column(
      length = 32
  )
  private String printLabelID;

  @Column(
      length = 60
  )
  private String printName;
}
