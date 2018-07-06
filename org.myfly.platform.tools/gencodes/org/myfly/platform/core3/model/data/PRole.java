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
    name = "PT_Role"
)
@FlyTable(
    name = "Role",
    description = "Responsibility Role",
    help = ""
)
public class PRole {
  @Column
  private Boolean isCanLoad;

  @Column
  private Boolean allowInfoOrder;

  @Column
  private Timestamp updated;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 32
  )
  private String roleID;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private Boolean isChangeLog;

  @Column
  private Boolean allowInfoMRP;

  @Column
  private Boolean allowHTMLView;

  @Column
  private Boolean allowXLSView;

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
  private Boolean allowInfoPayment;

  @Column
  private Boolean allowInfoProduct;

  @Column(
      length = 22
  )
  private String supervisorID;

  @Column
  private Boolean isShowAcct;

  @Column
  private Boolean isPersonalLock;

  @Column
  private Boolean isPersonalAccess;

  @Column
  private Boolean isManual;

  @Column
  private Boolean allowInfoResource;

  @Column(
      length = 32
  )
  private String treeMenuID;

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
  private Boolean allowInfoSchedule;

  @Column
  private Boolean allowInfoCRP;

  @Column
  private Boolean allowInfoAccount;

  @Column
  private Boolean allowInfoBPartner;

  @Column
  private Boolean allowInfoAsset;

  @Column
  private BigDecimal userDiscount;

  @Column(
      length = 32
  )
  private String cCurrencyID;

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
  private String treeOrgID;

  @Column
  private BigDecimal confirmQueryRecords;

  @Column
  private Boolean allowInfoInOut;

  @Column
  private Boolean allowInfoCashJournal;

  @Column
  private Boolean allowInfoInvoice;

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
