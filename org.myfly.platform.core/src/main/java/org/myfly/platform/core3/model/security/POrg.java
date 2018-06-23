package org.myfly.platform.core3.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.model.dict.PReplicationStrategy;

/**
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_Org")
@FlyTable(name = "Organization", description = "Organizational entity within client")
public class POrg extends FlyEntity {
	@FlyField(name = "Search Key", description = "Search key for the record in the format required - must be unique", help = "A search key allows you a fast method of finding a particular record.\n"
			+ "If you leave the search key empty, the system automatically creates a numeric number.  The document sequence used for this fallback number is defined in the \"Maintain Sequence\" window with the name \"DocumentNo_<TableName>\", where TableName is the actual name of the table (e.g. C_Order).")
	@Column(name = "Value", length = 40, unique = true)
	private String value;

	@FlyField(name = "Name", description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;
	
	@FlyField(name = "Description", description = "Optional short description of the record", help = "A description is limited to 255 characters.")
	@Column(length = 255)
	private String description;

	@FlyField(name = "Summary Level", description = "This is a summary entity", help = "A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.")
	@Column(name = "IsSummary")
	private Boolean isSummary;

	@FlyField(name = "Replication Strategy")
	@ManyToOne()
	private PReplicationStrategy replicationStrategy;

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

	public PReplicationStrategy getReplicationStrategy() {
		return replicationStrategy;
	}

	public void setReplicationStrategy(PReplicationStrategy replicationStrategy) {
		this.replicationStrategy = replicationStrategy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
