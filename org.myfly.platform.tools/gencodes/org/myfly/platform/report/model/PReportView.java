package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_ReportView"
)
@FlyTable(
    name = "Report View",
    description = "View used to generate this report",
    help = ""
)
public class PReportView {
  @Column(
      length = 32
  )
  private String reportViewID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 2000
  )
  private String whereClause;

  @Column(
      length = 2000
  )
  private String orderByClause;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 60
  )
  private String printName;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String tableID;

  @Column
  private Boolean isCentrallyMaintained;
}
