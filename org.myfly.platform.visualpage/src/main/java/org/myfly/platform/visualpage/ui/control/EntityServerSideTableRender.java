package org.myfly.platform.visualpage.ui.control;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.StyleConstants;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.annotation.FetchMode;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityListDefinition;
import org.myfly.platform.core.metadata.entity.EntitySubTableDefinition;
import org.myfly.platform.core.utils.StringUtil;

/**
 * 服务端表格，只包含格式定义，不包含数据，由客户端Ajax异步完成取数
 * 
 * @author xiangwanhong
 *
 */
public class EntityServerSideTableRender extends HtmlTableRender {
	private EntityListDefinition listDefinition;

	private ViewType viewType;

	/**
	 * 
	 * @param viewType
	 * @param fields
	 * @param tableName
	 * @param subTableAttr
	 */
	public EntityServerSideTableRender(EntityListDefinition listDefinition, ViewType viewType) {
		this.setListDefinition(listDefinition);
		setViewType(viewType);
		addExtAttr("entityName", listDefinition.getParent().getEntityName());
		addExtAttr("view", listDefinition.getName());
		addExtAttr("render", getClass().getName());
		String subTableAttr = getSubTableAttr();
		if (StringUtil.isNotEmpty(subTableAttr)) {
			// 子表应用场景时，在table上增加属性subTableAttr、uid
			addExtAttr("subTableAttr", subTableAttr);
			addExtAttr("uid", "$!{uid}");
		}
	}

	@Override
	public String getTableClass() {
		return StyleConstants.TABLE_BASE_CLASS + " " + StyleConstants.TABLE_SERVER_SIDE_CLASS;
	}

	/**
	 * 获取子表属性名称
	 * 
	 * @return
	 */
	public String getSubTableAttr() {
		return getListDefinition() instanceof EntitySubTableDefinition
				? ((EntitySubTableDefinition) getListDefinition()).getSubTableAttr()
				: "";
	}

	/**
	 * 获取视图名称
	 * 
	 * @return
	 */
	public String getViewName() {
		return getListDefinition() instanceof EntitySubTableDefinition
				? ((EntitySubTableDefinition) getListDefinition()).getFormViewName()
				: getListDefinition().getName();
	}

	public EntityFieldDefinition[] getFieldDefinitions() {
		return getListDefinition().getFieldDefinitions();
	}

	/**
	 * 根据字段定义，获取列头定义
	 * 
	 * @return
	 */
	public String getRowHeader() {
		HtmlRowRender row = new HtmlRowRender();
		List<HtmlCellRender> cells = new ArrayList<>();
		for (FieldDefinition field : getFieldDefinitions()) {
			if (ViewType.PRINT.equals(getViewType()) && FieldDataType.ACTIONS.equals(field.getDataType())) {
				continue;
			} else {
				HtmlCellRender cell = new HtmlCellRender(field.getTitle());
				cell.setHeader(true);
				cells.add(cell);
			}
		}
		row.setCells(cells);
		return row.html();
	}

	@Override
	public String headerHtml() {
		if (StringUtils.isNotBlank(getHeader())) {
			return getHeader();
		} else {
			return "<thead>" + getRowHeader() + "</thead>";
		}
	}

	@Override
	public String footerHtml() {
		if (StringUtils.isNotBlank(getFooter())) {
			return getFooter();
		} else {
			return "<tfoot>" + getRowHeader() + "</tfoot>";
		}
	}

	/**
	 * 根据FetchMode获取表格
	 * 
	 * @param viewType
	 * 
	 * @param isServerSide
	 *            是否为Server端表格
	 * @param fields
	 * @param tableName
	 * @param subTableAttr
	 * @return
	 */
	public static EntityServerSideTableRender getEntityTableRender(EntityListDefinition listDefinition,
			ViewType viewType) {
		EntityServerSideTableRender render;
		if (ViewType.PRINT.equals(viewType)) {
			// 打印模式
			render = new PrintTableRender(listDefinition, viewType);
		} else if (FetchMode.SERVER_ALL.equals(listDefinition.getFetchMode())
				|| FetchMode.SERVER_PAGE.equals(listDefinition.getFetchMode())) {
			// 服务端取数模式
			render = new VelocityTemplateTableRender(listDefinition, viewType);
		} else {
			// 客户端异步取数模式
			render = new EntityServerSideTableRender(listDefinition, viewType);
		}
		return render;
	}

	public EntityListDefinition getListDefinition() {
		return listDefinition;
	}

	public void setListDefinition(EntityListDefinition listDefinition) {
		this.listDefinition = listDefinition;
	}

	public ViewType getViewType() {
		return viewType;
	}

	public void setViewType(ViewType viewType) {
		this.viewType = viewType;
	}
}
