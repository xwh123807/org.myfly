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
    name = "PT_PrintLabel"
)
@FlyTable(
    name = "Print Label",
    description = "Label Format to print",
    help = ""
)
public class PPrintLabel {
  @Column(
      length = 32
  )
  private String printLabelID;

  @Column(
      length = 32
  )
  private String labelPrinterID;

  @Column
  private BigDecimal labelHeight;

  @Column
  private Boolean isLandscape;

  @Column(
      length = 32
  )
  private String tableID;

  @Column
  private BigDecimal labelWidth;

  @Column(
      length = 40
  )
  private String printerName;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 60
  )
  private String name;
}
