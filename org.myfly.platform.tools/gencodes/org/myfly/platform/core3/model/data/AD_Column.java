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
    name = "AD_Column"
)
@FlyTable(
    name = "Column",
    description = "Column in the table",
    help = ""
)
public class AD_Column {
  @Column
  private BigDecimal seqNo;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String aD_Column_ID;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 20
  )
  private String valueMin;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String aD_Client_ID;

  @Column(
      length = 32
  )
  private String aD_Org_ID;

  @Column(
      length = 32
  )
  private String aD_Chart_ID;

  @Column(
      length = 20
  )
  private String valueMax;

  @Column(
      length = 32
  )
  private String aD_Table_ID;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private Boolean isMandatory;

  @Column
  private Boolean isTranslated;

  @Column(
      length = 2000
  )
  private String defaultValue;

  @Column(
      length = 60
  )
  private String vFormat;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column
  private Boolean isParent;

  @Column
  private Boolean isIdentifier;

  @Column(
      length = 22
  )
  private String aD_Element_ID;

  @Column
  private Boolean isSelectionColumn;

  @Column(
      length = 1
  )
  private String isSyncDatabase;

  @Column
  private Boolean isKey;

  @Column(
      length = 32
  )
  private String aD_Process_ID;

  @Column(
      length = 2000
  )
  private String readOnlyLogic;

  @Column(
      length = 22
  )
  private String formatPattern;

  @Column(
      length = 2000
  )
  private String mandatoryLogic;

  @Column
  private BigDecimal version;

  @Column(
      length = 32
  )
  private String aD_Reference_Value_ID;

  @Column(
      length = 2000
  )
  private String columnSQL;

  @Column(
      length = 30
  )
  private String columnName;

  @Column(
      length = 32
  )
  private String aD_Val_Rule_ID;

  @Column(
      length = 2000
  )
  private String help;

  @Column
  private BigDecimal fieldLength;

  @Column(
      length = 32
  )
  private String aD_Reference_ID;

  @Column
  private Boolean isUpdateable;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 255
  )
  private String callout;

  @Column
  private Boolean isAlwaysUpdateable;

  @Column(
      length = 1
  )
  private String isEncrypted;

  @Column(
      length = 255
  )
  private String infoFactoryClass;

  @Column
  private Boolean isAllowLogging;

  @Column
  private Boolean isAutocomplete;

  @Column
  private Boolean isRange;

  @Column
  private Boolean isAllowCopy;

  @Column(
      length = 36
  )
  private String uUID;
}
