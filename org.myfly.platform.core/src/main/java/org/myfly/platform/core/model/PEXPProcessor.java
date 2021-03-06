package org.myfly.platform.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_EXP_Processor")
@FlyTable(name = "Export Processor")
@FlyRefTable(apiName="expProcessorID", keyColumn="expProcessorID", displayColumn="expProcessorID", name="EXP Processor")
public class PEXPProcessor extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6894715864696842004L;

	@Id
	@Column(length=32)
	private String expProcessorID;

	public String getExpProcessorID() {
		return expProcessorID;
	}

	public void setExpProcessorID(String expProcessorID) {
		this.expProcessorID = expProcessorID;
	}
}
