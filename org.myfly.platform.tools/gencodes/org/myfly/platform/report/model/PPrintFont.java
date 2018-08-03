package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PrintFont"
)
@FlyTable(
    name = "Print Font",
    description = "Maintain Print Font",
    help = ""
)
public class PPrintFont {
  @Column(
      length = 32
  )
  private String printFontID;

  @Column
  private Boolean isDefault;

  @Column(
      length = 2000
  )
  private String code;

  @Column(
      length = 60
  )
  private String name;
}
