package org.myfly.platform.report.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_PrintForm")
@FlyTable(name = "Print Form", description = "Form", help = "")
public class PPrintForm extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8766435070511689297L;

	@Id
	@Column(length = 32)
	private String printFormID;

	@Column(length = 255)
	private String description;

	@Column(length = 32)
	private String projectPrintFormatID;

	@Column(length = 60)
	private String name;

	@Column(length = 32)
	private String orderMailTextID;

	@Column(length = 32)
	private String remittancePrintFormatID;

	@Column(length = 32)
	private String projectMailTextID;

	@Column(length = 32)
	private String remittanceMailTextID;

	@Column(length = 32)
	private String invoiceMailTextID;

	@Column(length = 32)
	private String shipmentMailTextID;

	@Column(length = 32)
	private String orderPrintFormatID;

	@Column(length = 32)
	private String manufOrderMailTextID;

	@Column(length = 32)
	private String manufOrderPrintFormatID;

	@Column(length = 32)
	private String shipmentPrintFormatID;

	@Column(length = 32)
	private String invoicePrintFormatID;

	@Column(length = 32)
	private String distribOrderMailTextID;

	@Column(length = 32)
	private String distribOrderPrintFormatID;

	public String getPrintFormID() {
		return printFormID;
	}

	public void setPrintFormID(String printFormID) {
		this.printFormID = printFormID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProjectPrintFormatID() {
		return projectPrintFormatID;
	}

	public void setProjectPrintFormatID(String projectPrintFormatID) {
		this.projectPrintFormatID = projectPrintFormatID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderMailTextID() {
		return orderMailTextID;
	}

	public void setOrderMailTextID(String orderMailTextID) {
		this.orderMailTextID = orderMailTextID;
	}

	public String getRemittancePrintFormatID() {
		return remittancePrintFormatID;
	}

	public void setRemittancePrintFormatID(String remittancePrintFormatID) {
		this.remittancePrintFormatID = remittancePrintFormatID;
	}

	public String getProjectMailTextID() {
		return projectMailTextID;
	}

	public void setProjectMailTextID(String projectMailTextID) {
		this.projectMailTextID = projectMailTextID;
	}

	public String getRemittanceMailTextID() {
		return remittanceMailTextID;
	}

	public void setRemittanceMailTextID(String remittanceMailTextID) {
		this.remittanceMailTextID = remittanceMailTextID;
	}

	public String getInvoiceMailTextID() {
		return invoiceMailTextID;
	}

	public void setInvoiceMailTextID(String invoiceMailTextID) {
		this.invoiceMailTextID = invoiceMailTextID;
	}

	public String getShipmentMailTextID() {
		return shipmentMailTextID;
	}

	public void setShipmentMailTextID(String shipmentMailTextID) {
		this.shipmentMailTextID = shipmentMailTextID;
	}

	public String getOrderPrintFormatID() {
		return orderPrintFormatID;
	}

	public void setOrderPrintFormatID(String orderPrintFormatID) {
		this.orderPrintFormatID = orderPrintFormatID;
	}

	public String getManufOrderMailTextID() {
		return manufOrderMailTextID;
	}

	public void setManufOrderMailTextID(String manufOrderMailTextID) {
		this.manufOrderMailTextID = manufOrderMailTextID;
	}

	public String getManufOrderPrintFormatID() {
		return manufOrderPrintFormatID;
	}

	public void setManufOrderPrintFormatID(String manufOrderPrintFormatID) {
		this.manufOrderPrintFormatID = manufOrderPrintFormatID;
	}

	public String getShipmentPrintFormatID() {
		return shipmentPrintFormatID;
	}

	public void setShipmentPrintFormatID(String shipmentPrintFormatID) {
		this.shipmentPrintFormatID = shipmentPrintFormatID;
	}

	public String getInvoicePrintFormatID() {
		return invoicePrintFormatID;
	}

	public void setInvoicePrintFormatID(String invoicePrintFormatID) {
		this.invoicePrintFormatID = invoicePrintFormatID;
	}

	public String getDistribOrderMailTextID() {
		return distribOrderMailTextID;
	}

	public void setDistribOrderMailTextID(String distribOrderMailTextID) {
		this.distribOrderMailTextID = distribOrderMailTextID;
	}

	public String getDistribOrderPrintFormatID() {
		return distribOrderPrintFormatID;
	}

	public void setDistribOrderPrintFormatID(String distribOrderPrintFormatID) {
		this.distribOrderPrintFormatID = distribOrderPrintFormatID;
	}

}
