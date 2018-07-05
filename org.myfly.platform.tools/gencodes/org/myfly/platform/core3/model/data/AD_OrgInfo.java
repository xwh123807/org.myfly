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
    name = "AD_OrgInfo"
)
@FlyTable(
    name = "Organization Info",
    description = "",
    help = ""
)
public class AD_OrgInfo {
  @Column(
      length = 22
  )
  private String c_Location_ID;

  @Column
  private Timestamp created;

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

  @Column(
      length = 32
  )
  private String parent_Org_ID;

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
  private String m_Warehouse_ID;

  @Column(
      length = 32
  )
  private String dropShip_Warehouse_ID;

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
  private String pA_Goal_ID;

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
  private String supervisor_ID;

  @Column(
      length = 32
  )
  private String aD_OrgType_ID;

  @Column(
      length = 32
  )
  private String transferBank_ID;

  @Column(
      length = 32
  )
  private String transferCashBook_ID;

  @Column(
      length = 0
  )
  private String receiptFooterMsg;

  @Column
  private byte[] logo_ID;

  @Column(
      length = 32
  )
  private String c_Calendar_ID;

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
