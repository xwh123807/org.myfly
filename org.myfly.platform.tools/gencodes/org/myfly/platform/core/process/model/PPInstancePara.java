package org.myfly.platform.core.process.model;

import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PInstance_Para"
)
@FlyTable(
    name = "AD_PInstance_Para",
    description = "",
    help = ""
)
public class PPInstancePara {
  @Column
  private BigDecimal pNumberTo;

  @Column(
      length = 32
  )
  private String seqNo;

  @Column
  private Timestamp pDate;

  @Column(
      length = 60
  )
  private String infoTo;

  @Column(
      length = 60
  )
  private String info;

  @Column(
      length = 255
  )
  private String pString;

  @Column
  private BigDecimal pNumber;

  @Column(
      length = 32
  )
  private String pInstanceID;

  @Column
  private Timestamp pDateTo;

  @Column(
      length = 255
  )
  private String pStringTo;

  @Column(
      length = 60
  )
  private String parameterName;
}
