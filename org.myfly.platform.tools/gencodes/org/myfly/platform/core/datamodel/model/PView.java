package org.myfly.platform.core.datamodel.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_View"
)
@FlyTable(
    name = "View",
    description = "",
    help = ""
)
public class PView {
  @Column(
      length = 32
  )
  private String viewID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 60
  )
  private String value;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 1
  )
  private String copyFrom;

  @Column(
      length = 60
  )
  private String name;
}
