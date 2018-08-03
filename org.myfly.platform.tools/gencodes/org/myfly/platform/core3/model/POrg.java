package org.myfly.platform.core3.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Org"
)
@FlyTable(
    name = "Organization",
    description = "Organizational entity within client",
    help = ""
)
public class POrg {
  @Column(
      length = 60
  )
  private String name;

  @Column
  private Boolean isSummary;

  @Column(
      length = 40
  )
  private String value;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String replicationStrategyID;
}
