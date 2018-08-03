package org.myfly.platform.visualpage3.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Tab"
)
@FlyTable(
    name = "Tab",
    description = "Tab within a Window",
    help = ""
)
public class PTab {
  @Column(
      length = 32
  )
  private String processID;

  @Column(
      length = 32
  )
  private String tabID;

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
  private String parentColumnID;

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
  private String tableID;

  @Column
  private Boolean hasTree;

  @Column(
      length = 32
  )
  private String columnSortYesNoID;

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
  private String imageID;

  @Column(
      length = 32
  )
  private String includedTabID;

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
  private String windowID;

  @Column
  private Boolean isSortTab;

  @Column
  private Boolean isReadOnly;

  @Column(
      length = 32
  )
  private String columnID;

  @Column(
      length = 32
  )
  private String columnSortOrderID;

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
}
