package org.myfly.platform.core.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Client"
)
@FlyTable(
    name = "Client",
    description = "Client/Tenant for this installation.",
    help = ""
)
public class PClient {
  @Column(
      length = 32
  )
  private String autoArchive;

  @Column
  private Boolean isUseASP;

  @Column(
      length = 255
  )
  private String lDAPQuery;

  @Column(
      length = 20
  )
  private String requestUserPW;

  @Column
  private Boolean isMultiLingualDocument;

  @Column(
      length = 60
  )
  private String requestUser;

  @Column
  private Boolean isUseBetaFunctions;

  @Column(
      length = 255
  )
  private String modelValidationClasses;

  @Column(
      length = 32
  )
  private String mMPolicy;

  @Column
  private Boolean isServerEMail;

  @Column(
      length = 1
  )
  private String eMailTest;

  @Column
  private Boolean storeAttachmentsOnFileSystem;

  @Column(
      length = 255
  )
  private String windowsAttachmentPath;

  @Column
  private Boolean storeArchiveOnFileSystem;

  @Column(
      length = 255
  )
  private String windowsArchivePath;

  @Column(
      length = 255
  )
  private String unixArchivePath;

  @Column(
      length = 32
  )
  private String eMailConfigID;

  @Column(
      length = 255
  )
  private String unixAttachmentPath;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 40
  )
  private String value;

  @Column(
      length = 20
  )
  private String requestFolder;

  @Column(
      length = 60
  )
  private String requestEMail;

  @Column(
      length = 32
  )
  private String language;

  @Column(
      length = 60
  )
  private String documentDir;

  @Column
  private Boolean isPostImmediate;

  @Column
  private Boolean isCostImmediate;

  @Column(
      length = 32
  )
  private String replicationStrategyID;
}
