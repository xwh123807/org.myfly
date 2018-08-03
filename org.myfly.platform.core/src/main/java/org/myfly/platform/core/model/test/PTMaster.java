package org.myfly.platform.core.model.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_Master")
@FlyTable(name = "Master", description = "测试主表，用于测试所有数据类型和特性")
@FlyRefTable(apiName = "masterID", displayColumn = "name", keyColumn = "masterID", name = "Master")
public class PTMaster extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7581980474253180356L;
	
	@Id
	@Column(length=32)
	private String masterID;

	@Column
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasterID() {
		return masterID;
	}

	public void setMasterID(String masterID) {
		this.masterID = masterID;
	}
}
