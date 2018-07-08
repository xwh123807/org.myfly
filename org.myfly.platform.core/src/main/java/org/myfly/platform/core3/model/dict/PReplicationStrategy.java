package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_ReplicationStrategy")
@FlyTable(name = "Replication Strategy", description = "Data Replication Strategy", //
		help = "The Data Replication Strategy determines what and how tables are replicated ")
@FlyRefTable(apiName = "replicationStrategyID", name = "Replication Strategy", keyColumn = "replicationStrategyID", displayColumn = "name")
public class PReplicationStrategy extends FlyMetaEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3586532049046238841L;

	@Id
	@Column(length = 32)
	private String replicationStrategyID;

	@Column(name = "Value", length = 40, unique = true)
	private String value;

	@Column(name = "EntityType")
	private String entityType;

	@Column(length = 32)
	private String expProcessorID;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getReplicationStrategyID() {
		return replicationStrategyID;
	}

	public void setReplicationStrategyID(String replicationStrategyID) {
		this.replicationStrategyID = replicationStrategyID;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getExpProcessorID() {
		return expProcessorID;
	}

	public void setExpProcessorID(String expProcessorID) {
		this.expProcessorID = expProcessorID;
	}

}
