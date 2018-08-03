package org.myfly.platform.visualpage3.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_FieldGroup"
)
@FlyTable(
    name = "Field Group",
    description = "Logical grouping of fields",
    help = ""
)
public class PFieldGroup {
  @Column(
      length = 32
  )
  private String fieldGroupID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String fieldGroupType;

  @Column
  private Boolean isCollapsedByDefault;
}
