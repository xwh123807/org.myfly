package org.myfly.platform.core3.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_EMailConfig"
)
@FlyTable(
    name = "EMail Configuration",
    description = "EMail Configuration for create a SMTP Connection",
    help = ""
)
public class PEMailConfig {
  @Column(
      length = 60
  )
  private String name;

  @Column
  private Boolean isSmtpAuthorization;

  @Column(
      length = 60
  )
  private String sMTPHost;

  @Column
  private BigDecimal port;

  @Column(
      length = 32
  )
  private String authMechanism;

  @Column(
      length = 255
  )
  private String description;

  @Column
  private BigDecimal timeout;

  @Column
  private BigDecimal connectionTimeout;

  @Column(
      length = 255
  )
  private String lDAPDomain;

  @Column(
      length = 32
  )
  private String encryptionType;

  @Column(
      length = 32
  )
  private String protocol;

  @Column(
      length = 32
  )
  private String eMailConfigID;
}
