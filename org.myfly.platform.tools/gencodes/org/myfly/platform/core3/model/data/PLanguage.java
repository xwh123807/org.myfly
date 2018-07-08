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
    name = "PT_Language"
)
@FlyTable(
    name = "Language ID",
    description = "",
    help = ""
)
public class PLanguage {
  @Column(
      length = 1
  )
  private String processing;

  @Column
  private Boolean isBaseLanguage;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 32
  )
  private String languageID;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 2
  )
  private String languageISO;

  @Column
  private Boolean isSystemLanguage;

  @Column(
      length = 20
  )
  private String datePattern;

  @Column
  private Boolean isDecimalPoint;

  @Column(
      length = 20
  )
  private String timePattern;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 6
  )
  private String language;

  @Column(
      length = 2
  )
  private String countryCode;

  @Column(
      length = 36
  )
  private String uUID;
}
