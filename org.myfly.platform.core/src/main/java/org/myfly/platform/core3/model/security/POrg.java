package org.myfly.platform.core3.model.security;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

/**
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_Org")
@FlyTable(name = "Organization", description = "Organizational entity within client")
@FlyRefTable(apiName = "orgID", name = "Org ID", keyColumn = "orgID", displayColumn = "name")
public class POrg implements IFlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4936038273008540694L;

	@Id
	@Column(length = 32)
	private String orgID;

	@Column
	private Timestamp created;

	@Column(length = 32)
	private String createdBy;

	@Column
	private Timestamp updated;

	@Column(length = 32)
	private String updatedBy;

	@Column
	private Boolean isActive;

	@Column(length = 32)
	private String clientID;

	@Column(name = "Value", length = 40, unique = true)
	private String value;

	@Column(length = 60)
	private String name;

	@Column(length = 255)
	private String description;

	@Column(name = "IsSummary")
	private Boolean isSummary;

	@Column(length = 32)
	private String replicationStrategyID;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsSummary() {
		return isSummary;
	}

	public void setIsSummary(Boolean isSummary) {
		this.isSummary = isSummary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReplicationStrategyID() {
		return replicationStrategyID;
	}

	public void setReplicationStrategyID(String replicationStrategyID) {
		this.replicationStrategyID = replicationStrategyID;
	}

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
