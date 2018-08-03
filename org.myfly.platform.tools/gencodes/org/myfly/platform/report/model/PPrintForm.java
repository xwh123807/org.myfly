package org.myfly.platform.report.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@Entity
@Table(
    name = "PT_PrintForm"
)
@FlyTable(
    name = "Print Form",
    description = "Form",
    help = ""
)
public class PPrintForm {
  @Column(
      length = 32
  )
  private String printFormID;

  @Column(
      length = 255
  )
  private String description;

  @Column(
      length = 32
  )
  private String projectPrintFormatID;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 32
  )
  private String orderMailTextID;

  @Column(
      length = 32
  )
  private String remittancePrintFormatID;

  @Column(
      length = 32
  )
  private String projectMailTextID;

  @Column(
      length = 32
  )
  private String remittanceMailTextID;

  @Column(
      length = 32
  )
  private String invoiceMailTextID;

  @Column(
      length = 32
  )
  private String shipmentMailTextID;

  @Column(
      length = 32
  )
  private String orderPrintFormatID;

  @Column(
      length = 32
  )
  private String manufOrderMailTextID;

  @Column(
      length = 32
  )
  private String manufOrderPrintFormatID;

  @Column(
      length = 32
  )
  private String shipmentPrintFormatID;

  @Column(
      length = 32
  )
  private String invoicePrintFormatID;

  @Column(
      length = 32
  )
  private String distribOrderMailTextID;

  @Column(
      length = 32
  )
  private String distribOrderPrintFormatID;
}
