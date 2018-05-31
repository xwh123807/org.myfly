package org.myfly.platform.system.internal;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.context.UserContext;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.system.domain.IFlyEntity;
import org.myfly.platform.core.system.domain.IMenu;
import org.myfly.platform.core.system.service.IMenuService;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

/**
 * 菜单服务
 * 
 * @author xiangwanhong
 *
 */
@Service
public class MenuService implements IMenuService {
	@Autowired
	private IJpaDataAccessService dataAccessService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.system.service.internal.IMenuService#getAllMenus()
	 */
	@Override
	public List<IMenu> getAllMenus() {
		List<IMenu> list = new ArrayList<>();
		for (Menu item : dataAccessService.findAll(Menu.class, null, new Sort(Direction.ASC, "orderNumber"))){
			//只返回顶级菜单
			if (item.getParent() == null){
				list.add(item);
			}
		}
		return list;
	}

	@Override
	public void registerMenus(URL url) {
		Menu[] menus = JSONUtil.fromJSON(url, Menu[].class);
		if (ArrayUtils.isNotEmpty(menus)) {
			long orderNumber = 0;
			for (Menu menu : menus) {
				if (menu.getOrderNumber() == null){
					menu.setOrderNumber(orderNumber);
				}
				registerMenu(menu);
				orderNumber ++;
			}
		}
	}

	@Override
	@Transactional
	public void registerMenu(IMenu menu) {
		AssertUtil.parameterEmpty(menu, "menu");
		updateMenuAudit(menu);
		dataAccessService.saveEntity(menu);
	}

	/**
	 * 递归更新审计信息
	 * 
	 * @param menu
	 */
	private void updateMenuAudit(IMenu menu) {
		updateAudit(menu);
		if (CollectionUtils.isNotEmpty(menu.getSubMenus())) {
			long orderNumber = 0;
			for (IMenu item : menu.getSubMenus()) {
				if (item.getOrderNumber() == null){
					item.setOrderNumber(orderNumber);
				}
				item.setParent(menu);
				updateMenuAudit(item);
				orderNumber ++;
			}
		}
	}

	/**
	 * 更新实体系统信息
	 * 
	 * @param entity
	 */
	private void updateAudit(IFlyEntity entity) {
		if (StringUtils.isBlank(entity.getUid())){
			entity.setUid(UUIDUtil.newUUID());
		}
		if (entity.getCreated() == null) {
			entity.setCreated(DateUtil.nowSqlTimestamp());
		}
		if (entity.getCreatedBy() == null) {
			entity.setCreatedBy(UserContext.getUserSession().getUser());
		}
		if (entity.getUpdated() == null) {
			entity.setUpdated(entity.getCreated());
		}
		if (entity.getUpdatedBy() == null) {
			entity.setUpdatedBy(entity.getCreatedBy());
		}
		if (entity.getTenant() == null) {
			entity.setTenant(UserContext.getUserSession().getTenant());
		}
	}
}
