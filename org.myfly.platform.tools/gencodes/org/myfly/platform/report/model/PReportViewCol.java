package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_ReportView_Col"
)
@FlyTable(
    name = "Report view Column",
    description = "",
    help = ""
)
public class PReportViewCol {
  @Column(
      length = 32
  )
  private String reportViewColID;

  @Column(
      length = 60
  )
  private String functionColumn;

  @Column(
      length = 32
  )
  private String columnID;

  @Column
  private Boolean isGroupFunction;

  @Column(
      length = 32
  )
  private String reportViewID;
}
