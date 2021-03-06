package org.myfly.platform.core.process.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Process_Para"
)
@FlyTable(
    name = "Process Parameter",
    description = "",
    help = ""
)
public class PProcessPara {
  @Column(
      length = 32
  )
  private String processParaID;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String entityType;

  @Column
  private Boolean isMandatory;

  @Column
  private BigDecimal fieldLength;

  @Column(
      length = 20
  )
  private String valueMax;

  @Column(
      length = 30
  )
  private String columnName;

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
  private String processID;

  @Column
  private Boolean isRange;

  @Column(
      length = 32
  )
  private String referenceID;

  @Column(
      length = 32
  )
  private String valRuleID;

  @Column
  private BigDecimal seqNo;

  @Column(
      length = 2000
  )
  private String readOnlyLogic;

  @Column
  private Boolean isCentrallyMaintained;

  @Column(
      length = 2000
  )
  private String defaultValue2;

  @Column(
      length = 20
  )
  private String vFormat;

  @Column(
      length = 20
  )
  private String valueMin;

  @Column(
      length = 32
  )
  private String referenceValueID;

  @Column(
      length = 2000
  )
  private String defaultValue;

  @Column(
      length = 2000
  )
  private String displayLogic;

  @Column(
      length = 22
  )
  private String elementID;

  @Column
  private Boolean isInfoOnly;
}
