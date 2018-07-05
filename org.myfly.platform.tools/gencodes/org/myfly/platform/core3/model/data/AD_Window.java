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
    name = "AD_Window"
)
@FlyTable(
    name = "Window",
    description = "Data entry or display window",
    help = ""
)
public class AD_Window {
  @Column(
      length = 32
  )
  private String aD_Window_ID;

  @Column
  private Timestamp updated;

  @Column
  private Boolean isActive;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String aD_Org_ID;

  @Column(
      length = 32
  )
  private String aD_Client_ID;

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
  private String aD_Color_ID;

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
  private String aD_Image_ID;

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
