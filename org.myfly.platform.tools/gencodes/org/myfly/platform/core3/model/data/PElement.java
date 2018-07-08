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
    name = "PT_Element"
)
@FlyTable(
    name = "System Element",
    description = "System Element enables the central maintenance of column description and help.",
    help = ""
)
public class PElement {
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
  private String elementID;

  @Column(
      length = 32
  )
  private String orgID;

  @Column(
      length = 32
  )
  private String clientID;

  @Column
  private Timestamp created;

  @Column
  private Timestamp updated;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 2000
  )
  private String pOHelp;

  @Column(
      length = 60
  )
  private String pOName;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 30
  )
  private String columnName;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 60
  )
  private String printName;

  @Column(
      length = 60
  )
  private String pOPrintName;

  @Column(
      length = 255
  )
  private String pODescription;

  @Column
  private BigDecimal fieldLength;

  @Column(
      length = 32
  )
  private String referenceID;

  @Column(
      length = 32
  )
  private String referenceValueID;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 36
  )
  private String uUID;
}
