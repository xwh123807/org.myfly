package org.myfly.platform.core3.model.data;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_EXP_Processor"
)
@FlyTable(
    name = "Export Processor",
    description = "",
    help = ""
)
public class PEXPProcessor {
  @Column(
      length = 32
  )
  private String eXPProcessorID;

  @Column
  private Timestamp created;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 32
  )
  private String eXPProcessorTypeID;

  @Column(
      length = 255
  )
  private String passwordInfo;

  @Column(
      length = 40
  )
  private String value;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private BigDecimal port;

  @Column(
      length = 255
  )
  private String account;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 255
  )
  private String host;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 36
  )
  private String uUID;
}
