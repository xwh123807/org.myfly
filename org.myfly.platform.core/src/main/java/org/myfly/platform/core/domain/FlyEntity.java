package org.myfly.platform.core.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 * 
 * @author xiangwanhong
 *
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class FlyEntity implements IFlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 746459563296000455L;

	@Column
	private Timestamp created;

	@Column(name = "CreatedBy", length = 32)
	private String createdBy;

	@Column
	private Timestamp updated;

	@Column(name = "UpdatedBy", length = 32)
	private String updatedBy;

	@Column(name = "IsActive")
	private Boolean isActive;

	@Column(length = 32, name="ClientID")
	private String clientID;

	@Column(length = 32)
	private String orgID;

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getOrgID() {
		return orgID;
	}

	public void setOrgID(String orgID) {
		this.orgID = orgID;
	}
}
