package org.myfly.platform.core.process.model;

import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PInstance_Log"
)
@FlyTable(
    name = "Log",
    description = "",
    help = ""
)
public class PPInstanceLog {
  @Column(
      length = 32
  )
  private String pID;

  @Column(
      length = 32
  )
  private String pInstanceLogID;

  @Column(
      length = 32
  )
  private String pInstanceID;

  @Column
  private BigDecimal pNumber;

  @Column(
      length = 2000
  )
  private String pMsg;

  @Column
  private Date pDate;
}
