package org.myfly.platform.core3.model;

import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Ref_List"
)
@FlyTable(
    name = "Reference List",
    description = "Reference List based on Table",
    help = ""
)
public class PRefList {
  @Column(
      length = 32
  )
  private String entityType;

  @Column(
      length = 32
  )
  private String refListID;

  @Column(
      length = 60
  )
  private String value;

  @Column(
      length = 32
  )
  private String referenceID;

  @Column(
      length = 255
  )
  private String description;

  @Column
  private Date validFrom;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private Date validTo;
}
