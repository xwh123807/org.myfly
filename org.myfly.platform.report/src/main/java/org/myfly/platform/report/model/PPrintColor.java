package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_PrintColor")
@FlyTable(name = "Print Color", description = "Color used for printing and display", help = "")
public class PPrintColor extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8262678629803641459L;

	@Id
	@Column(length = 32)
	private String printColorID;

	@Column
	private Boolean isDefault;

	@Column(length = 60)
	private String name;

	@Column(length = 2000)
	private String code;

	public String getPrintColorID() {
		return printColorID;
	}

	public void setPrintColorID(String printColorID) {
		this.printColorID = printColorID;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
