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
    name = "PT_Reference"
)
@FlyTable(
    name = "Reference",
    description = "System Reference (Pick List)",
    help = ""
)
public class PReference {
  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String referenceID;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp created;

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

  @Column(
      length = 32
  )
  private String updatedBy;

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

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 36
  )
  private String uUID;
}
