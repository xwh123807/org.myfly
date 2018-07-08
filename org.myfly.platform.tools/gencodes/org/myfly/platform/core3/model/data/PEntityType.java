package org.myfly.platform.core3.model.data;

import java.lang.Boolean;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

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
  @Column
  private Timestamp updated;

  @Column
  private Boolean isActive;

  @Column(
      length = 40
  )
  private String entityType;

  @Column(
      length = 32
  )
  private String entityTypeID;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 1
  )
  private String processing;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String updatedBy;

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
      length = 32
  )
  private String createdBy;

  @Column(
      length = 120
  )
  private String name;

  @Column(
      length = 36
  )
  private String uUID;
}
