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
    name = "AD_Ref_Table"
)
@FlyTable(
    name = "AD_Ref_Table",
    description = "Reference Table Definitions",
    help = ""
)
public class AD_Ref_Table {
  @Column
  private Timestamp created;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String aD_Display;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 32
  )
  private String aD_Client_ID;

  @Column(
      length = 32
  )
  private String aD_Org_ID;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String aD_Table_ID;

  @Column
  private Boolean isValueDisplayed;

  @Column(
      length = 32
  )
  private String aD_Window_ID;

  @Column(
      length = 32
  )
  private String aD_Key;

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
  private String aD_Reference_ID;

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
