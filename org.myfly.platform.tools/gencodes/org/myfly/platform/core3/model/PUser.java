package org.myfly.platform.core3.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_User"
)
@FlyTable(
    name = "User/Contact",
    description = "User within the system - Internal or Business Partner Contact",
    help = ""
)
public class PUser {
  @Column
  private BigDecimal recentItemsMaxSaved;

  @Column
  private BigDecimal recentItemsMaxShown;

  @Column(
      length = 255
  )
  private String leadStatusDescription;

  @Column(
      length = 10
  )
  private String bPLocationID;

  @Column(
      length = 32
  )
  private String userID;

  @Column(
      length = 1
  )
  private String processing;

  @Column(
      length = 1
  )
  private String hasRole;

  @Column(
      length = 60
  )
  private String bPName;

  @Column
  private Boolean isWebstoreUser;

  @Column
  private Boolean isLoginUser;

  @Column
  private Boolean isInternalUser;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 22
  )
  private String cBPartnerID;

  @Column(
      length = 32
  )
  private String orgTrxID;

  @Column(
      length = 40
  )
  private String phone2;

  @Column(
      length = 32
  )
  private String cBPartnerLocationID;

  @Column(
      length = 22
  )
  private String supervisorID;

  @Column(
      length = 60
  )
  private String eMailUser;

  @Column(
      length = 40
  )
  private String title;

  @Column(
      length = 255
  )
  private String lastResult;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String cCampaignID;

  @Column
  private Date lastContact;

  @Column(
      length = 32
  )
  private String cJobID;

  @Column(
      length = 32
  )
  private String notificationType;

  @Column(
      length = 32
  )
  private String connectionProfile;

  @Column
  private Boolean isFullBPAccess;

  @Column(
      length = 40
  )
  private String value;

  @Column(
      length = 20
  )
  private String userPIN;

  @Column(
      length = 1024
  )
  private String password;

  @Column(
      length = 16
  )
  private String salt;

  @Column
  private Boolean isSalesLead;

  @Column(
      length = 32
  )
  private String cLocationID;

  @Column(
      length = 32
  )
  private String leadSource;

  @Column(
      length = 32
  )
  private String leadStatus;

  @Column(
      length = 255
  )
  private String leadSourceDescription;

  @Column(
      length = 32
  )
  private String salesRepID;

  @Column
  private Timestamp eMailVerifyDate;

  @Column(
      length = 60
  )
  private String eMail;

  @Column(
      length = 255
  )
  private String eMailUserPW;

  @Column(
      length = 40
  )
  private String phone;

  @Column
  private Date birthday;

  @Column(
      length = 32
  )
  private String cGreetingID;

  @Column(
      length = 40
  )
  private String fax;

  @Column(
      length = 2000
  )
  private String comments;

  @Column(
      length = 40
  )
  private String eMailVerify;

  @Column(
      length = 60
  )
  private String lDAPUser;

  @Column
  private Boolean isInPayroll;

  @Column(
      length = 32
  )
  private String eMailConfigID;
}
