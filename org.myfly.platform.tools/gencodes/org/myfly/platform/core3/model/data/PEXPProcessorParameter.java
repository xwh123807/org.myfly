package org.myfly.platform.core3.model.data;

import java.lang.Boolean;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_EXP_ProcessorParameter"
)
@FlyTable(
    name = "Processor Parameter",
    description = "",
    help = ""
)
public class PEXPProcessorParameter {
  @Column(
      length = 32
  )
  private String eXPProcessorParameterID;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp created;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String eXPProcessorID;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 60
  )
  private String parameterValue;

  @Column(
      length = 40
  )
  private String value;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 36
  )
  private String uUID;
}
