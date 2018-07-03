package org.myfly.platform.core3.model.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Master")
@FlyTable(name = "Master", description = "测试主表，用于测试所有数据类型和特性")
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
