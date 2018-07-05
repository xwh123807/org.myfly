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
    name = "AD_Table"
)
@FlyTable(
    name = "Table",
    description = "Table for the Fields",
    help = ""
)
public class AD_Table {
  @Column(
      length = 60
  )
  private String name;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String aD_Org_ID;

  @Column(
      length = 32
  )
  private String aD_Client_ID;

  @Column
  private Timestamp updated;

  @Column
  private Timestamp created;

  @Column
  private Boolean isHighVolume;

  @Column(
      length = 32
  )
  private String aD_Table_ID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String accessLevel;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 32
  )
  private String aD_Val_Rule_ID;

  @Column(
      length = 40
  )
  private String tableName;

  @Column(
      length = 32
  )
  private String aD_Window_ID;

  @Column(
      length = 32
  )
  private String replicationType;

  @Column
  private Boolean isChangeLog;

  @Column
  private BigDecimal aCTriggerLength;

  @Column
  private Boolean isIgnoreMigration;

  @Column
  private Boolean isDocument;

  @Column(
      length = 1
  )
  private String importTable;

  @Column
  private BigDecimal loadSeq;

  @Column
  private Boolean isSecurityEnabled;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column
  private Boolean isDeleteable;

  @Column(
      length = 32
  )
  private String pO_Window_ID;

  @Column
  private Boolean isView;

  @Column(
      length = 1
  )
  private String copyColumnsFromTable;

  @Column
  private Boolean isCentrallyMaintained;

  @Column(
      length = 36
  )
  private String uUID;
}
