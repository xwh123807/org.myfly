package org.myfly.platform.core3.model.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core3.domain.FlyEntity;

@Entity
@Table(name="PT_Detail")
@FlyRefTable(apiName = "detailID", displayColumn = "name", keyColumn = "detailID", name = "Detail")
public class PTDetail extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4451063686901889950L;
	@Id
	@Column(length=32)
	private String detailID;
	
	@Column
	private String name;
	
	@Column(length=32)
	private String masterID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetailID() {
		return detailID;
	}

	public void setDetailID(String detailID) {
		this.detailID = detailID;
	}

	public String getMasterID() {
		return masterID;
	}

	public void setMasterID(String masterID) {
		this.masterID = masterID;
	}
}
