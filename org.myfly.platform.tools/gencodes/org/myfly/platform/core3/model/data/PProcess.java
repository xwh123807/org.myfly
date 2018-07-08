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
    name = "PT_Process"
)
@FlyTable(
    name = "Process",
    description = "Process or Report",
    help = ""
)
public class PProcess {
  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private Timestamp created;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String processID;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String workflowID;

  @Column(
      length = 255
  )
  private String classname;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 32
  )
  private String printFormatID;

  @Column
  private Boolean isDirectPrint;

  @Column(
      length = 40
  )
  private String workflowValue;

  @Column(
      length = 255
  )
  private String jasperReport;

  @Column(
      length = 32
  )
  private String formID;

  @Column
  private Boolean isServerProcess;

  @Column(
      length = 32
  )
  private String showHelp;

  @Column
  private BigDecimal statisticSeconds;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 32
  )
  private String reportViewID;

  @Column(
      length = 60
  )
  private String procedureName;

  @Column
  private BigDecimal statisticCount;

  @Column(
      length = 40
  )
  private String value;

  @Column(
      length = 32
  )
  private String browseID;

  @Column(
      length = 1
  )
  private String copyFromProcess;

  @Column(
      length = 1
  )
  private String generateClass;

  @Column(
      length = 32
  )
  private String accessLevel;

  @Column
  private Boolean isBetaFunctionality;

  @Column
  private Boolean isReport;

  @Column(
      length = 36
  )
  private String uUID;
}
