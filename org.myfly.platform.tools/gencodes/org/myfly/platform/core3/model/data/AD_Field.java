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
    name = "AD_Field"
)
@FlyTable(
    name = "Field",
    description = "Field on a database table",
    help = ""
)
public class AD_Field {
  @Column(
      length = 32
  )
  private String aD_Org_ID;

  @Column(
      length = 32
  )
  private String aD_Client_ID;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String aD_Field_ID;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String entityType;

  @Column
  private Boolean isEmbedded;

  @Column
  private Boolean isAllowCopy;

  @Column(
      length = 32
  )
  private String updatedBy;

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

  @Column(
      length = 32
  )
  private String createdBy;

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
  private String aD_FieldGroup_ID;

  @Column(
      length = 255
  )
  private String infoFactoryClass;

  @Column(
      length = 32
  )
  private String aD_Column_ID;

  @Column(
      length = 2000
  )
  private String displayLogic;

  @Column(
      length = 32
  )
  private String aD_Reference_ID;

  @Column(
      length = 32
  )
  private String isMandatory;

  @Column(
      length = 32
  )
  private String aD_Reference_Value_ID;

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
  private String aD_Tab_ID;

  @Column(
      length = 32
  )
  private String obscureType;

  @Column(
      length = 32
  )
  private String aD_Val_Rule_ID;

  @Column(
      length = 2000
  )
  private String defaultValue;

  @Column(
      length = 32
  )
  private String included_Tab_ID;

  @Column
  private Boolean isEncrypted;

  @Column(
      length = 36
  )
  private String uUID;
}
