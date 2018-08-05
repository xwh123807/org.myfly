package org.myfly.platform.core.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

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
      length = 255
  )
  private String description;
}
