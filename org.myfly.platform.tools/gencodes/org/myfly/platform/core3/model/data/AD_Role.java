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
    name = "AD_Role"
)
@FlyTable(
    name = "Role",
    description = "Responsibility Role",
    help = ""
)
public class AD_Role {
  @Column
  private Boolean isCanLoad;

  @Column
  private Boolean allow_Info_Order;

  @Column
  private Timestamp updated;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String aD_Client_ID;

  @Column(
      length = 32
  )
  private String aD_Role_ID;

  @Column(
      length = 32
  )
  private String aD_Org_ID;

  @Column
  private Boolean isChangeLog;

  @Column
  private Boolean allow_Info_MRP;

  @Column
  private Boolean allow_HTML_View;

  @Column
  private Boolean allow_XLS_View;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column
  private Boolean isCanApproveOwnDoc;

  @Column
  private BigDecimal amtApproval;

  @Column
  private Boolean allow_Info_Payment;

  @Column
  private Boolean allow_Info_Product;

  @Column(
      length = 22
  )
  private String supervisor_ID;

  @Column
  private Boolean isShowAcct;

  @Column
  private Boolean isPersonalLock;

  @Column
  private Boolean isPersonalAccess;

  @Column
  private Boolean isManual;

  @Column
  private Boolean allow_Info_Resource;

  @Column(
      length = 32
  )
  private String aD_Tree_Menu_ID;

  @Column
  private Boolean isCanExport;

  @Column(
      length = 32
  )
  private String preferenceType;

  @Column
  private Boolean isUseUserOrgAccess;

  @Column
  private Boolean overwritePriceLimit;

  @Column(
      length = 32
  )
  private String connectionProfile;

  @Column
  private Boolean allow_Info_Schedule;

  @Column
  private Boolean allow_Info_CRP;

  @Column
  private Boolean allow_Info_Account;

  @Column
  private Boolean allow_Info_BPartner;

  @Column
  private Boolean allow_Info_Asset;

  @Column
  private BigDecimal userDiscount;

  @Column(
      length = 32
  )
  private String c_Currency_ID;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String userLevel;

  @Column(
      length = 255
  )
  private String description;

  @Column
  private Boolean isCanReport;

  @Column
  private BigDecimal maxQueryRecords;

  @Column(
      length = 32
  )
  private String aD_Tree_Org_ID;

  @Column
  private BigDecimal confirmQueryRecords;

  @Column
  private Boolean allow_Info_InOut;

  @Column
  private Boolean allow_Info_CashJournal;

  @Column
  private Boolean allow_Info_Invoice;

  @Column
  private Boolean isAccessAllOrgs;

  @Column
  private Boolean isDiscountUptoLimitPrice;

  @Column
  private Boolean isDiscountAllowedOnTotal;

  @Column(
      length = 36
  )
  private String uUID;
}
