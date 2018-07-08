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
    name = "PT_Color"
)
@FlyTable(
    name = "System Color",
    description = "Color for backgrounds or indicators",
    help = ""
)
public class PColor {
  @Column
  private BigDecimal red;

  @Column
  private Timestamp updated;

  @Column(
      length = 32
  )
  private String colorID;

  @Column
  private Boolean isActive;

  @Column(
      length = 32
  )
  private String clientID;

  @Column
  private Timestamp created;

  @Column(
      length = 32
  )
  private String colorType;

  @Column(
      length = 32
  )
  private String orgID;

  @Column
  private BigDecimal lineWidth;

  @Column
  private BigDecimal alpha1;

  @Column
  private BigDecimal green1;

  @Column
  private BigDecimal alpha;

  @Column(
      length = 32
  )
  private String startPoint;

  @Column(
      length = 32
  )
  private String createdBy;

  @Column
  private BigDecimal green;

  @Column(
      length = 32
  )
  private String updatedBy;

  @Column
  private BigDecimal blue1;

  @Column(
      length = 60
  )
  private String name;

  @Column
  private Boolean isDefault;

  @Column
  private BigDecimal blue;

  @Column
  private BigDecimal lineDistance;

  @Column(
      length = 32
  )
  private String imageID;

  @Column
  private BigDecimal red1;

  @Column
  private BigDecimal imageAlpha;

  @Column
  private BigDecimal repeatDistance;

  @Column(
      length = 36
  )
  private String uUID;
}
