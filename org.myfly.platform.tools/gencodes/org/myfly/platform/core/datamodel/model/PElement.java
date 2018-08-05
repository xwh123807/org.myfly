package org.myfly.platform.core.datamodel.model;

import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Element"
)
@FlyTable(
    name = "System Element",
    description = "System Element enables the central maintenance of column description and help.",
    help = ""
)
public class PElement {
  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String elementID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 2000
  )
  private String pOHelp;

  @Column(
      length = 60
  )
  private String pOName;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 30
  )
  private String columnName;

  @Column(
      length = 60
  )
  private String printName;

  @Column(
      length = 60
  )
  private String pOPrintName;

  @Column(
      length = 255
  )
  private String pODescription;

  @Column
  private BigDecimal fieldLength;

  @Column(
      length = 32
  )
  private String referenceID;

  @Column(
      length = 32
  )
  private String referenceValueID;
}
