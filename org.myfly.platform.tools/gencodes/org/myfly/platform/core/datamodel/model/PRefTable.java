package org.myfly.platform.core.datamodel.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Ref_Table"
)
@FlyTable(
    name = "AD_Ref_Table",
    description = "Reference Table Definitions",
    help = ""
)
public class PRefTable {
  @Column(
      length = 32
  )
  private String display;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 32
  )
  private String tableID;

  @Column
  private Boolean isValueDisplayed;

  @Column(
      length = 32
  )
  private String windowID;

  @Column(
      length = 32
  )
  private String key;

  @Column(
      length = 2000
  )
  private String orderByClause;

  @Column(
      length = 2000
  )
  private String whereClause;

  @Column(
      length = 32
  )
  private String referenceID;

  @Column
  private Boolean isAlert;

  @Column(
      length = 2000
  )
  private String displaySQL;

  @Column
  private Boolean isDisplayIdentifier;
}
