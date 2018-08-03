package org.myfly.platform.core3.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_View_Column"
)
@FlyTable(
    name = "View Column",
    description = "Column of View",
    help = ""
)
public class PViewColumn {
  @Column(
      length = 32
  )
  private String viewColumnID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 2000
  )
  private String help;

  @Column(
      length = 32
  )
  private String viewDefinitionID;

  @Column(
      length = 2000
  )
  private String columnSQL;

  @Column(
      length = 32
  )
  private String viewID;

  @Column(
      length = 32
  )
  private String columnID;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 255
  )
  private String columnName;

  @Column(
      length = 255
  )
  private String description;
}
