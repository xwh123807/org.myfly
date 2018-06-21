package org.myfly.platform.core3.domain;

import java.sql.Timestamp;

public interface IAuditable {
	public String getUid();

	public void setUid(String uid);

	public Timestamp getCreated();

	public void setCreated(Timestamp created);

	public Timestamp getUpdated();

	public void setUpdated(Timestamp updated);

	public Boolean getActive();

	public void setActive(Boolean active);
}
