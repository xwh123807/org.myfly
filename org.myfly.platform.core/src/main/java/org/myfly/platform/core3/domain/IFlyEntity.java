package org.myfly.platform.core3.domain;

import java.sql.Timestamp;

import org.myfly.platform.core3.model.security.PClient;
import org.myfly.platform.core3.model.security.POrg;
import org.myfly.platform.core3.model.security.PUser;

/**
 * 
 * @author xiangwanhong
 *
 */
public interface IFlyEntity {
	public final String UID = "uid";
	public final String CREATED = "created";
	public final String CREATED_BY = "createdBy";
	public final String UPDATED = "updated";
	public final String UPDATED_BY = "updatedBy";
	public final String ACTIVE = "active";
	public final String CLIENT = "client";
	public final String ORG = "org";

	/**
	 * 
	 * @return
	 */
	public String getUid();

	public void setUid(String uid);

	public Timestamp getCreated();

	public void setCreated(Timestamp created);

	public Timestamp getUpdated();

	public void setUpdated(Timestamp updated);

	public Boolean getIsActive();

	public void setIsActive(Boolean active);

	public PUser getCreatedBy();

	public void setCreatedBy(PUser createdBy);

	public PUser getUpdatedBy();

	public void setUpdatedBy(PUser updatedBy);

	public PClient getClient();

	public void setClient(PClient client);

	public POrg getOrg();

	public void setOrg(POrg org);
}
