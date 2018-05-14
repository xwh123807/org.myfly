package org.myfly.platform.core.system.domain;

import java.io.Serializable;

/**
 * uid主键
 * @author xiangwanhong
 *
 */
public interface IKeyEntity extends Serializable{
	public String getUid();
	public void setUid(String uid);
}
