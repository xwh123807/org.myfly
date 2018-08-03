package org.myfly.platform.core3.model;

import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_View_Definition"
)
@FlyTable(
    name = "View Definition",
    description = "",
    help = ""
)
public class PViewDefinition {
  @Column(
      length = 32
  )
  private String viewDefinitionID;

  @Column(
      length = 1
  )
  private String processing;

  @Column(
      length = 20
  )
  private String tableAlias;

  @Column(
      length = 255
  )
  private String joinClause;

  @Column(
      length = 32
  )
  private String tableID;

  @Column(
      length = 32
  )
  private String viewID;

  @Column
  private BigDecimal seqNo;
}
