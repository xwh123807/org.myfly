package org.myfly.platform.core.process.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PInstance"
)
@FlyTable(
    name = "Process Instance",
    description = "Instance of the process",
    help = ""
)
public class PPInstance {
  @Column(
      length = 2000
  )
  private String errorMsg;

  @Column(
      length = 32
  )
  private String processID;

  @Column(
      length = 32
  )
  private String pInstanceID;

  @Column(
      length = 32
  )
  private String reportType;

  @Column(
      length = 32
  )
  private String printFormatID;

  @Column
  private BigDecimal result;

  @Column
  private Boolean isProcessing;

  @Column(
      length = 32
  )
  private String userID;

  @Column
  private BigDecimal recordID;

  @Column(
      length = 60
  )
  private String name;
}
