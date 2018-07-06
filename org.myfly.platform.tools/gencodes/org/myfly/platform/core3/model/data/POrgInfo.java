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
    name = "PT_OrgInfo"
)
@FlyTable(
    name = "Organization Info",
    description = "",
    help = ""
)
public class POrgInfo {
  @Column(
      length = 22
  )
  private String cLocationID;

  @Column
  private Timestamp created;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String orgID;

  @Column(
      length = 32
  )
  private String clientID;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String parentOrgID;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 32
  )
  private String mWarehouseID;

  @Column(
      length = 32
  )
  private String dropShipWarehouseID;

  @Column(
      length = 40
  )
  private String phone;

  @Column(
      length = 40
  )
  private String phone2;

  @Column(
      length = 32
  )
  private String pAGoalID;

  @Column(
      length = 11
  )
  private String dUNS;

  @Column(
      length = 20
  )
  private String taxID;

  @Column(
      length = 22
  )
  private String supervisorID;

  @Column(
      length = 32
  )
  private String orgTypeID;

  @Column(
      length = 32
  )
  private String transferBankID;

  @Column(
      length = 32
  )
  private String transferCashBookID;

  @Column(
      length = 0
  )
  private String receiptFooterMsg;

  @Column
  private byte[] logoID;

  @Column(
      length = 32
  )
  private String cCalendarID;

  @Column(
      length = 40
  )
  private String fax;

  @Column(
      length = 60
  )
  private String eMail;

  @Column(
      length = 36
  )
  private String uUID;
}
