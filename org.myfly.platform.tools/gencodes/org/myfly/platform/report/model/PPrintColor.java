package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PrintColor"
)
@FlyTable(
    name = "Print Color",
    description = "Color used for printing and display",
    help = ""
)
public class PPrintColor {
  @Column(
      length = 32
  )
  private String printColorID;

  @Column
  private Boolean isDefault;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 2000
  )
  private String code;
}
