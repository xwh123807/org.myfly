package org.myfly.platform.core3.model;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

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

  @Column(
      length = 32
  )
  private String colorID;

  @Column(
      length = 32
  )
  private String colorType;

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

  @Column
  private BigDecimal green;

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
}
