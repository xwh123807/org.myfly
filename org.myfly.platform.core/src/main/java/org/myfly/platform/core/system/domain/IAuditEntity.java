package org.myfly.platform.core.system.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 审计Entity
 * @author xiangwanhong
 *
 */
public interface IAuditEntity extends Serializable{
	/**
	 * 获取创建时间
	 * @return
	 */
	public Timestamp getCreated();
	
	public void setCreated(Timestamp date);
	/**
	 * 获取修改时间
	 * @return
	 */
	public Timestamp getUpdated();
	
	public void setUpdated(Timestamp date);
	/**
	 * 获取修改人
	 * @return
	 */
	public IUser getUpdatedBy();
	
	public void setUpdatedBy(IUser user);
	/**
	 * 获取创建人
	 * @return
	 */
	public IUser getCreatedBy();
	
	public void setCreatedBy(IUser user);
}
