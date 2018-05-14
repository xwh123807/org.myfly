package org.myfly.platform.core.system.domain;

import java.util.Set;

/**
 * 菜单
 * @author xiangwanhong
 *
 */
public interface IMenu extends IFlyEntity {
	public IMenu getParent();

	public void setParent(IMenu parent);

	public Set<IMenu> getSubMenus();

	public void setSubMenus(Set<IMenu> subMenus);

	public String getDescription();

	public void setDescription(String description);

	public String getIcon();

	public void setIcon(String icon);

	public String getUrl();

	public void setUrl(String url);

	public Long getOrderNumber();

	public void setOrderNumber(Long orderNumber);
}
