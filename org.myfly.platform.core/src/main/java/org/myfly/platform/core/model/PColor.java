package org.myfly.platform.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_Color")
@FlyTable(name = "System Color", description = "Color for backgrounds or indicators")
public class PColor extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 324411198826953026L;
	@Id
	@Column(length=32)
	private String colorID;

	public String getColorID() {
		return colorID;
	}

	public void setColorID(String colorID) {
		this.colorID = colorID;
	}
}
