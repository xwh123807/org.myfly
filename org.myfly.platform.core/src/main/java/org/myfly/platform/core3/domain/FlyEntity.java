package org.myfly.platform.core3.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.model.security.PClient;
import org.myfly.platform.core3.model.security.POrg;
import org.myfly.platform.core3.model.security.PUser;

/**
 * 
 * @author xiangwanhong
 *
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class FlyEntity implements IFlyEntity {
	@Id
	@org.springframework.data.annotation.Id
	@Column(length = 32, updatable = false, nullable = false)
	@FlyField(name = "Immutable Universally Unique Identifier", description = "Immutable Universally Unique Identifier", help = "\"A surrogate key in a database is a unique identifier for either an entity in the modeled world or an object in the database. The surrogate key is not derived from application data, unlike a natural (or business) key which is derived from application data. \" , According to Wikipedia http://en.wikipedia.org/wiki/Surrogate_key")
	private String uid;

	@FlyField(name = "Created", description = "Date this record was created", help = "The Created field indicates the date that this record was created.")
	@Column
	private Timestamp created;

	@FlyField(name = "Created By", dataType = FlyDataType.TableDirect, defaultValue = "@#PT_User_ID@")
	@ManyToOne
	private PUser createdBy;

	@FlyField(name = "Updated", description = "Date this record was updated", help = "The Updated field indicates the date that this record was updated.")
	@Column
	private Timestamp updated;

	@FlyField(name = "Updated By", dataType = FlyDataType.TableDirect, defaultValue = "@#PT_User_ID@")
	@ManyToOne
	private PUser updatedBy;

	@FlyField(name = "Active", defaultValue = "Y", description = "The record is active in the system", help = "There are two methods of making records unavailable in the system: One is to delete the record, the other is to de-activate the record. A de-activated record is not available for selection, but available for reports.\n"
			+ "There are two reasons for de-activating and not deleting records:\n"
			+ "(1) The system requires the record for audit purposes.\n"
			+ "(2) The record is referenced by other records. E.g., you cannot delete a Business Partner, if there are invoices for this partner record existing. You de-activate the Business Partner and prevent that this record is used for future entries.")
	@Column
	private Boolean isActive;

	@FlyField(name = "Client", dataType = FlyDataType.TableDirect, defaultValue = "@#PT_Client_ID@")
	@ManyToOne
	private PClient client;

	@FlyField(name = "Organization", dataType = FlyDataType.TableDirect, defaultValue = "@#PT_Org_ID@")
	@ManyToOne
	private POrg org;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	@Override
	public Boolean getIsActive() {
		return isActive;
	}

	@Override
	public void setIsActive(Boolean active) {
		this.isActive = active;
	}

	public PUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(PUser createdBy) {
		this.createdBy = createdBy;
	}

	public PUser getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(PUser updatedBy) {
		this.updatedBy = updatedBy;
	}

	public PClient getClient() {
		return client;
	}

	public void setClient(PClient client) {
		this.client = client;
	}

	public POrg getOrg() {
		return org;
	}

	public void setOrg(POrg org) {
		this.org = org;
	}

}
