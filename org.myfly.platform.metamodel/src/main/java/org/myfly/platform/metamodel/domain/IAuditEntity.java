package org.myfly.platform.metamodel.domain;

import java.io.Serializable;
import java.util.Date;

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
	public Date getCreated();
	/**
	 * 获取修改时间
	 * @return
	 */
	public Date getUpdated();
	/**
	 * 获取修改人
	 * @return
	 */
	public SUser getUpdatedBy();
	/**
	 * 获取创建人
	 * @return
	 */
	public SUser getCreatedBy();
}
