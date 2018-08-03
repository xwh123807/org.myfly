package org.myfly.platform.core3.process.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Process_Access")
@FlyTable(name = "Process Access", description = "", help = "")
public class PProcessAccess extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3762021632337440855L;

	@Id
	@Column(length = 32)
	private String uid;

	@Column(length = 32)
	private String processID;

	@Column(length = 32)
	private String roleID;

	@Column
	private Boolean isActive;

	@Column
	private Boolean isReadWrite;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsReadWrite() {
		return isReadWrite;
	}

	public void setIsReadWrite(Boolean isReadWrite) {
		this.isReadWrite = isReadWrite;
	}

}
