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
    name = "AD_Org"
)
@FlyTable(
    name = "Organization",
    description = "Organizational entity within client",
    help = ""
)
public class AD_Org {
  @Column(
      length = 32
  )
  private String aD_Org_ID;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String aD_Client_ID;

  @Column
  private Timestamp updated;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 32
  )
  private String createdBy;

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
  private String aD_ReplicationStrategy_ID;

  @Column(
      length = 36
  )
  private String uUID;
}
