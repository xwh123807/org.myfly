package org.myfly.platform.core.system.domain;

/**
 * FlyEntity基类接口
 * @author xiangwanhong
 *
 */
public interface IFlyEntity extends IKeyEntity, IAuditEntity {
	/**
	 * 名称，用于记录标题
	 * @return
	 */
	public String getName();

	public void setName(String name);

	/**
	 * 记录是否激活
	 * @return
	 */
	public boolean isActive();

	public void setActive(boolean active);

	/**
	 * 记录所在组织
	 * @return
	 */
	public ITenant getTenant();

	public void setTenant(ITenant tenant);
}
