package org.myfly.platform.core.datamodel.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Reference"
)
@FlyTable(
    name = "Reference",
    description = "System Reference (Pick List)",
    help = ""
)
public class PReference {
  @Column(
      length = 32
  )
  private String referenceID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 32
  )
  private String validationType;

  @Column(
      length = 2000
  )
  private String help;

  @Column
  private Boolean isOrderByValue;

  @Column(
      length = 40
  )
  private String vFormat;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 255
  )
  private String description;
}
