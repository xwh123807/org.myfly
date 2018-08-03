package org.myfly.platform.report.model;

import java.lang.Boolean;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_PrintFont")
@FlyTable(name = "Print Font", description = "Maintain Print Font", help = "")
public class PPrintFont extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2458019364980983307L;

	@Id
	@Column(length = 32)
	private String printFontID;

	@Column
	private Boolean isDefault;

	@Column(length = 2000)
	private String code;

	@Column(length = 60)
	private String name;

	public String getPrintFontID() {
		return printFontID;
	}

	public void setPrintFontID(String printFontID) {
		this.printFontID = printFontID;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
