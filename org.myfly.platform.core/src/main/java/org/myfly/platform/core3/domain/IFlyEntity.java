package org.myfly.platform.core3.domain;

import java.sql.Timestamp;

/**
 * 
 * @author xiangwanhong
 *
 */
public interface IFlyEntity {
	public final String UID = "uid";
	public final String CREATED = "created";
	public final String UPDATED = "updated";
	public final String ACTIVE = "active";

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
}
