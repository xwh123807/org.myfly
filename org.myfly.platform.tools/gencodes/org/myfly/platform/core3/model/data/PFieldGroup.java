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
    name = "PT_FieldGroup"
)
@FlyTable(
    name = "Field Group",
    description = "Logical grouping of fields",
    help = ""
)
public class PFieldGroup {
  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String fieldGroupID;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 32
  )
  private String updatedBy;

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

  @Column(
      length = 36
  )
  private String uUID;
}