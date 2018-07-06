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
    name = "PT_Ref_Table"
)
@FlyTable(
    name = "AD_Ref_Table",
    description = "Reference Table Definitions",
    help = ""
)
public class PRefTable {
  @Column
  private Timestamp created;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String display;

  @Column(
      length = 32
  )
  private String entityType;

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

  @Column(
      length = 32
  )
  private String tableID;

  @Column
  private Boolean isValueDisplayed;

  @Column(
      length = 32
  )
  private String windowID;

  @Column(
      length = 32
  )
  private String key;

  @Column(
      length = 2000
  )
  private String orderByClause;

  @Column(
      length = 2000
  )
  private String whereClause;

  @Column(
      length = 32
  )
  private String referenceID;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column
  private Boolean isAlert;

  @Column(
      length = 2000
  )
  private String displaySQL;

  @Column
  private Boolean isDisplayIdentifier;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 36
  )
  private String uUID;
}
