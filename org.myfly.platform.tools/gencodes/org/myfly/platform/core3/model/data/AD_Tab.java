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
    name = "AD_Tab"
)
@FlyTable(
    name = "Tab",
    description = "Tab within a Window",
    help = ""
)
public class AD_Tab {
  @Column(
      length = 32
  )
  private String aD_Process_ID;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String aD_Org_ID;

  @Column(
      length = 32
  )
  private String aD_Client_ID;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String aD_Tab_ID;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 1
  )
  private String processing;

  @Column(
      length = 2000
  )
  private String orderByClause;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 32
  )
  private String parent_Column_ID;

  @Column(
      length = 2000
  )
  private String whereClause;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private BigDecimal seqNo;

  @Column(
      length = 32
  )
  private String aD_Table_ID;

  @Column
  private Boolean hasTree;

  @Column(
      length = 32
  )
  private String aD_ColumnSortYesNo_ID;

  @Column(
      length = 2000
  )
  private String commitWarning;

  @Column
  private Boolean isInfoTab;

  @Column(
      length = 1
  )
  private String importFields;

  @Column(
      length = 32
  )
  private String aD_Image_ID;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 32
  )
  private String included_Tab_ID;

  @Column
  private BigDecimal tabLevel;

  @Column
  private Boolean isAdvancedTab;

  @Column
  private Boolean isTranslationTab;

  @Column
  private Boolean isSingleRow;

  @Column(
      length = 32
  )
  private String aD_Window_ID;

  @Column
  private Boolean isSortTab;

  @Column
  private Boolean isReadOnly;

  @Column(
      length = 32
  )
  private String aD_Column_ID;

  @Column(
      length = 32
  )
  private String aD_ColumnSortOrder_ID;

  @Column(
      length = 2000
  )
  private String readOnlyLogic;

  @Column(
      length = 2000
  )
  private String displayLogic;

  @Column
  private Boolean isInsertRecord;

  @Column(
      length = 36
  )
  private String uUID;
}
