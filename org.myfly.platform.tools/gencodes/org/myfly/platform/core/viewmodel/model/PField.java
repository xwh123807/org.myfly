package org.myfly.platform.core.viewmodel.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Field"
)
@FlyTable(
    name = "Field",
    description = "Field on a database table",
    help = ""
)
public class PField {
  @Column(
      length = 32
  )
  private String fieldID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column
  private Boolean isEmbedded;

  @Column
  private Boolean isAllowCopy;

  @Column(
      length = 255
  )
  private String description;

  @Column
  private Boolean isDisplayed;

  @Column
  private Boolean isFieldOnly;

  @Column
  private BigDecimal sortNo;

  @Column
  private Boolean isCentrallyMaintained;

  @Column
  private BigDecimal seqNo;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private Boolean isReadOnly;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 32
  )
  private String fieldGroupID;

  @Column(
      length = 255
  )
  private String infoFactoryClass;

  @Column(
      length = 32
  )
  private String columnID;

  @Column(
      length = 2000
  )
  private String displayLogic;

  @Column(
      length = 32
  )
  private String referenceID;

  @Column(
      length = 32
  )
  private String isMandatory;

  @Column(
      length = 32
  )
  private String referenceValueID;

  @Column
  private BigDecimal preferredWidth;

  @Column
  private Boolean isDisplayedGrid;

  @Column
  private BigDecimal seqNoGrid;

  @Column
  private BigDecimal displayLength;

  @Column
  private Boolean isSameLine;

  @Column
  private Boolean isHeading;

  @Column(
      length = 32
  )
  private String tabID;

  @Column(
      length = 32
  )
  private String obscureType;

  @Column(
      length = 32
  )
  private String valRuleID;

  @Column(
      length = 2000
  )
  private String defaultValue;

  @Column(
      length = 32
  )
  private String includedTabID;

  @Column
  private Boolean isEncrypted;
}
