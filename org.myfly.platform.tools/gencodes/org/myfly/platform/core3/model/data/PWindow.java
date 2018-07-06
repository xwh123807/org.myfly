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
    name = "PT_Window"
)
@FlyTable(
    name = "Window",
    description = "Data entry or display window",
    help = ""
)
public class PWindow {
  @Column(
      length = 32
  )
  private String windowID;

  @Column
  private Timestamp updated;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String orgID;

  @Column(
      length = 32
  )
  private String clientID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column
  private BigDecimal winWidth;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String colorID;

  @Column(
      length = 2000
  )
  private String help;

  @Column
  private Boolean isSOTrx;

  @Column(
      length = 1
  )
  private String processing;

  @Column
  private Boolean isDefault;

  @Column(
      length = 32
  )
  private String imageID;

  @Column
  private Boolean isBetaFunctionality;

  @Column
  private BigDecimal winHeight;

  @Column(
      length = 32
  )
  private String windowType;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 36
  )
  private String uUID;
}
