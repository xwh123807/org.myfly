package org.myfly.platform.core3.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author xiangwanhong
 *
 */
public interface IFlyEntity extends Serializable{
	public final String CREATED = "created";
	public final String CREATED_BY = "createdBy";
	public final String UPDATED = "updated";
	public final String UPDATED_BY = "updatedBy";
	public final String ACTIVE = "isActive";
	public final String CLIENT = "clientID";
	public final String ORG = "orgID";

	public Timestamp getCreated();

	public void setCreated(Timestamp created);

	public Timestamp getUpdated();

	public void setUpdated(Timestamp updated);

	public Boolean getIsActive();

	public void setIsActive(Boolean active);

	public String getCreatedBy();

	public void setCreatedBy(String createdBy);

	public String getUpdatedBy();

	public void setUpdatedBy(String updatedBy);

	public String getClientID();

	public void setClientID(String clientID);

	public String getOrgID();

	public void setOrgID(String orgID);
}
