package org.myfly.platform.visualpage.ui.view;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.annotation.EntityAction;
import org.myfly.platform.core.metadata.entity.EntityListDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.EntityUrlUtil;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.visualpage.ui.control.EntityTableWidgetBoxRender;
import org.myfly.platform.visualpage.ui.control.SelectListViewRender;

/**
 * 实体列表视图，用于实体查询
 * 
 * @author xiangwanhong
 *
 */
public class ListViewRender extends BaseViewRender {
	private EntityMetaData entityMetaData;
	/**
	 * 实体列表定义
	 */
	private EntityListDefinition listDefinition;
	/**
	 * 查询条件显示区域
	 */
	private FilterSectionViewRender filters;
	/**
	 * 查询结果显示区域
	 */
	private EntityTableWidgetBoxRender box;

	/**
	 * 当有指定列表显示注解时，按注解定义显示；如果没有则显示全部字段
	 * 
	 * @param entityName
	 * @param viewType
	 * @param listViewName
	 */
	public ListViewRender(final String entityName, final ViewType viewType, final ViewMode viewMode,
			final String listViewName) {
		super(viewType, viewMode);
		AssertUtil.parameterEmpty(entityName, "ListViewRender.entityName");
		this.entityMetaData = getEntityMataData(entityName);
		listDefinition = entityMetaData.getListDefinition(listViewName);
	}

	public ListViewRender(final String entityName) {
		this(entityName, ViewType.LIST, ViewMode.PAGE, EntityMetaDataConstants.DEFAULT_NAME);
	}

	@Override
	public String htmlForView() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div " + HtmlUtils.addIdProperty()
				+ HtmlUtils.addPropertys(new String[] { "class", "entityName", "view", "render" }, new String[] {
						"col-xs-12", entityMetaData.getEntityName(), listDefinition.getName(), getClass().getName() })
				+ ">");
		// 视图选择区域
		SelectListViewRender selectViewRender = new SelectListViewRender(entityMetaData.getEntityName(), getViewType(),
				listDefinition.getName());
		buffer.append(selectViewRender.html());
		// 查询区域
		if (listDefinition != null && ArrayUtils.isNotEmpty(listDefinition.getFilters())) {
			String url = EntityUrlUtil.getEntityActionUrl(EntityAction.LIST, entityMetaData.getEntityName(), null,
					listDefinition.getName());
			filters = new FilterSectionViewRender(entityMetaData, listDefinition.getFilters(), getViewType(), url);
			buffer.append(filters.html());
		}
		// 查询结果区域
		box = new EntityTableWidgetBoxRender(listDefinition, getViewType());
		buffer.append(box.html());
		buffer.append("</div>");
		return buffer.toString();
	}

	@Override
	public String htmlForPrint() {
		box = new EntityTableWidgetBoxRender(listDefinition, getViewType());
		return box.html();
	}

	/**
	 * 列表视图访问URL
	 * 
	 * @return
	 */
	public String getUrl() {
		return EntityUrlUtil.getEntityActionUrl(EntityAction.LIST, entityMetaData.getEntityName(), null,
				listDefinition.getName());
	}
}
