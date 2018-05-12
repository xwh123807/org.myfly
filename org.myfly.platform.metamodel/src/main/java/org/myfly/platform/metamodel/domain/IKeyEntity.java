package org.myfly.platform.metamodel.domain;

import java.io.Serializable;

public interface IKeyEntity extends Serializable{
	public String getUid();
	public void setUid(String uid);
}
