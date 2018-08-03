package org.myfly.platform.report.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PrintGraph"
)
@FlyTable(
    name = "Graph",
    description = "Graph included in Reports",
    help = ""
)
public class PPrintGraph {
  @Column(
      length = 32
  )
  private String printGraphID;

  @Column(
      length = 32
  )
  private String data1PrintFormatItemID;

  @Column(
      length = 32
  )
  private String dataPrintFormatItemID;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String printFormatID;

  @Column(
      length = 32
  )
  private String graphType;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String descriptionPrintFormatItemID;

  @Column(
      length = 32
  )
  private String data2PrintFormatItemID;

  @Column(
      length = 32
  )
  private String data4PrintFormatItemID;

  @Column(
      length = 32
  )
  private String data3PrintFormatItemID;
}
