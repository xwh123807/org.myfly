package org.myfly.platform.core3.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

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

  @Column(
      length = 32
  )
  private String languageID;

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
      length = 6
  )
  private String language;

  @Column(
      length = 2
  )
  private String countryCode;
}
