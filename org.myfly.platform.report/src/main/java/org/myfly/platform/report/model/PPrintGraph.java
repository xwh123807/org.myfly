package org.myfly.platform.report.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_PrintGraph")
@FlyTable(name = "Graph", description = "Graph included in Reports", help = "")
public class PPrintGraph extends FlyEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8511200499163360103L;

	@Id
	@Column(length = 32)
	private String printGraphID;

	@Column(length = 32)
	private String data1PrintFormatItemID;

	@Column(length = 32)
	private String dataPrintFormatItemID;

	@Column(length = 60)
	private String name;

	@Column(length = 32)
	private String printFormatID;

	@Column(length = 32)
	private String graphType;

	@Column(length = 255)
	private String description;

	@Column(length = 32)
	private String descriptionPrintFormatItemID;

	@Column(length = 32)
	private String data2PrintFormatItemID;

	@Column(length = 32)
	private String data4PrintFormatItemID;

	@Column(length = 32)
	private String data3PrintFormatItemID;

	public String getPrintGraphID() {
		return printGraphID;
	}

	public void setPrintGraphID(String printGraphID) {
		this.printGraphID = printGraphID;
	}

	public String getData1PrintFormatItemID() {
		return data1PrintFormatItemID;
	}

	public void setData1PrintFormatItemID(String data1PrintFormatItemID) {
		this.data1PrintFormatItemID = data1PrintFormatItemID;
	}

	public String getDataPrintFormatItemID() {
		return dataPrintFormatItemID;
	}

	public void setDataPrintFormatItemID(String dataPrintFormatItemID) {
		this.dataPrintFormatItemID = dataPrintFormatItemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrintFormatID() {
		return printFormatID;
	}

	public void setPrintFormatID(String printFormatID) {
		this.printFormatID = printFormatID;
	}

	public String getGraphType() {
		return graphType;
	}

	public void setGraphType(String graphType) {
		this.graphType = graphType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionPrintFormatItemID() {
		return descriptionPrintFormatItemID;
	}

	public void setDescriptionPrintFormatItemID(String descriptionPrintFormatItemID) {
		this.descriptionPrintFormatItemID = descriptionPrintFormatItemID;
	}

	public String getData2PrintFormatItemID() {
		return data2PrintFormatItemID;
	}

	public void setData2PrintFormatItemID(String data2PrintFormatItemID) {
		this.data2PrintFormatItemID = data2PrintFormatItemID;
	}

	public String getData4PrintFormatItemID() {
		return data4PrintFormatItemID;
	}

	public void setData4PrintFormatItemID(String data4PrintFormatItemID) {
		this.data4PrintFormatItemID = data4PrintFormatItemID;
	}

	public String getData3PrintFormatItemID() {
		return data3PrintFormatItemID;
	}

	public void setData3PrintFormatItemID(String data3PrintFormatItemID) {
		this.data3PrintFormatItemID = data3PrintFormatItemID;
	}

}
