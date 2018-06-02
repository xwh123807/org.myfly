package org.myfly.platform.visualpage.ui.control;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.StyleConstants;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.define.SubTableDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.utils.StringUtil;

/**
 * 服务端表格，只包含格式定义，不包含数据
 * 
 * @author xiangwanhong
 *
 */
public class EntityServerSideTableRender extends HtmlTableRender {
	private ListDefinition listDefinition;

	private ViewType viewType;

	/**
	 * 
	 * @param viewType
	 * @param fields
	 * @param tableName
	 * @param subTableAttr
	 */
	public EntityServerSideTableRender(ListDefinition listDefinition, ViewType viewType) {
		this.setListDefinition(listDefinition);
		setViewType(viewType);
		addExtAttr("entityName", listDefinition.getEntityName());
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

	public String getSubTableAttr() {
		return getListDefinition() instanceof SubTableDefinition
				? ((SubTableDefinition) getListDefinition()).getSubTableAttr()
				: "";
	}

	public FieldDefinition[] getFieldDefinitions() {
		if (StringUtils.isEmpty(getSubTableAttr())) {
			// 列表
			return Stream.of(getListDefinition().getFields())
					.map(name -> getListDefinition().getParent().getField(name)).collect(Collectors.toList())
					.toArray(new FieldDefinition[] {});
		} else {
			// 子表
			EntityMetaData subEntityMetaData = getListDefinition().getParent().getSubEntityMetaData(getSubTableAttr());
			return Stream
					.of(subEntityMetaData.getListDefinition(((SubTableDefinition) getListDefinition()).getRefName())
							.getFields())
					.map(name -> subEntityMetaData.getField(name)).collect(Collectors.toList())
					.toArray(new FieldDefinition[] {});
		}
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
	 * 根据isServerSide获取表格
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
	public static EntityServerSideTableRender getEntityTableRender(ListDefinition listDefinition, ViewType viewType) {
		EntityServerSideTableRender render;
		if (ViewType.PRINT.equals(viewType)) {
			render = new PrintTableRender(listDefinition, viewType);
		} else {
			render = !listDefinition.isServerSideMode() ? new VelocityTemplateTableRender(listDefinition, viewType)
					: new EntityServerSideTableRender(listDefinition, viewType);
		}
		return render;
	}

	public ListDefinition getListDefinition() {
		return listDefinition;
	}

	public void setListDefinition(ListDefinition listDefinition) {
		this.listDefinition = listDefinition;
	}

	public ViewType getViewType() {
		return viewType;
	}

	public void setViewType(ViewType viewType) {
		this.viewType = viewType;
	}
}
