package org.myfly.platform.core.metadata.define;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.metadata.annotation.EntityAction;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.OrderView;
import org.myfly.platform.core.utils.AssertUtil;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 实体列表定义
 * 
 * @author xiangwanhong
 *
 */
public class ListDefinition extends BaseDenifition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1964209913066697957L;
	/**
	 * 标题，显示在Box header上
	 */
	private String title;
	/**
	 * 表格表头，一般用于复杂表头
	 */
	private String header;
	/**
	 * 列表数据源主实体名称
	 */
	private String entityName;
	/**
	 * 字段列表
	 */
	private String[] fields;
	/**
	 * 过滤条件定义
	 */
	private FilterDefinition[] filters;
	/**
	 * 排序定义
	 */
	private OrderDefinition[] orders;
	/**
	 * 表格取数是否异步Ajax处理，如果是，则由客户端再次发送请求获取数据，用于大数据量的分页；如果为否，页面直接输出全部数据
	 */
	private boolean serverSideMode;
	/**
	 * 
	 */
	private boolean enableActions;
	/**
	 * 实体列表操作集
	 */
	private EntityAction[] listActions;
	/**
	 * 实体项操作集
	 */
	private EntityAction[] itemActions;
	/**
	 * 
	 * @return
	 */
	private String labelField;
	/**
	 * 列表显示样式
	 */
	private ListStyle listStyle;

	private String linkField;

	private String linkUrl;
	
	public ListDefinition(){
	}

	public ListDefinition(ListView view) {
		setName(view.name());
		setTitle(view.title());
		setHeader(view.header());
		setLabelField(view.labelField());
		setListStyle(view.listStyle());
		setEnableActions(view.enableActions());
		setServerSideMode(view.serverSideMode());
		setListActions(view.listActions());
		setItemActions(view.itemActions());
		setFields(view.fields());
		setFiltersFromView(view.filters());
		setOrdersFromView(view.orders());
	}

	@JsonIgnore
	private void setOrdersFromView(OrderView[] views) {
		setOrders(Stream.of(views).map(view -> new OrderDefinition(view)).collect(Collectors.toList())
				.toArray(new OrderDefinition[] {}));
	}

	@JsonIgnore
	private void setFiltersFromView(FilterView[] views) {
		setFilters(Stream.of(views).map(view -> new FilterDefinition(view)).collect(Collectors.toList())
				.toArray(new FilterDefinition[] {}));
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public FilterDefinition[] getFilters() {
		return filters;
	}

	public void setFilters(FilterDefinition[] filters) {
		this.filters = filters;
	}

	public boolean isServerSideMode() {
		return serverSideMode;
	}

	public void setServerSideMode(boolean serverSideMode) {
		this.serverSideMode = serverSideMode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isEnableActions() {
		return enableActions;
	}

	public void setEnableActions(boolean enableActions) {
		this.enableActions = enableActions;
	}

	public EntityAction[] getListActions() {
		return listActions;
	}

	public void setListActions(EntityAction[] listActions) {
		this.listActions = listActions;
	}

	public EntityAction[] getItemActions() {
		return itemActions;
	}

	public void setItemActions(EntityAction[] itemActions) {
		this.itemActions = itemActions;
	}

	public String getLabelField() {
		return labelField;
	}

	public void setLabelField(String labelField) {
		this.labelField = labelField;
	}

	public OrderDefinition[] getOrders() {
		return orders;
	}

	public void setOrders(OrderDefinition[] orders) {
		this.orders = orders;
	}

	/**
	 * 增加排序
	 * 
	 * @param orderDefinition
	 */
	public void addOrder(OrderDefinition orderDefinition) {
		AssertUtil.parameterEmpty(orderDefinition, "orderDefinition");
		if (getOrders() == null) {
			setOrders(new OrderDefinition[] { orderDefinition });
		} else {
			ArrayUtils.add(this.orders, orderDefinition);
		}
	}

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	public ListStyle getListStyle() {
		return listStyle;
	}

	public void setListStyle(ListStyle listStyle) {
		this.listStyle = listStyle;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getLinkField() {
		return linkField;
	}

	public void setLinkField(String linkField) {
		this.linkField = linkField;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	@Override
	public String toString() {
		return "name: " + getName() + ", fields: [" + getFields() + "]";
	}

	public void validate() {
	}
}
