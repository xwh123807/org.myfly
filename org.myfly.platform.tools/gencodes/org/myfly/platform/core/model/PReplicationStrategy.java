package org.myfly.platform.core.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_ReplicationStrategy"
)
@FlyTable(
    name = "Replication Strategy",
    description = "Data Replication Strategy",
    help = ""
)
public class PReplicationStrategy {
  @Column(
      length = 32
  )
  private String replicationStrategyID;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String eXPProcessorID;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 40
  )
  private String value;
}
