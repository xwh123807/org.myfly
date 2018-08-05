package org.myfly.platform.core.process.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Process_Access"
)
@FlyTable(
    name = "Process Access",
    description = "",
    help = ""
)
public class PProcessAccess {
  @Column(
      length = 32
  )
  private String roleID;

  @Column
  private Boolean isReadWrite;

  @Column(
      length = 32
  )
  private String processID;
}
