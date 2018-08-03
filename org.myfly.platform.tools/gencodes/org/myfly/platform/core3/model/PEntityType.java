package org.myfly.platform.core3.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_EntityType"
)
@FlyTable(
    name = "Entity Type",
    description = "System Entity Type",
    help = ""
)
public class PEntityType {
  @Column(
      length = 40
  )
  private String entityType;

  @Column(
      length = 32
  )
  private String entityTypeID;

  @Column(
      length = 1
  )
  private String processing;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 20
  )
  private String version;

  @Column(
      length = 255
  )
  private String modelPackage;

  @Column(
      length = 255
  )
  private String classpath;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 120
  )
  private String name;
}
