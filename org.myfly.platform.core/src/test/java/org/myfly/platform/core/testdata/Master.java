package org.myfly.platform.core.testdata;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OrderView;
import org.myfly.platform.core.metadata.annotation.SQLOperator;
import org.myfly.platform.core.metadata.annotation.SectionType;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.system.domain.FlyEntity;

/**
 * 角色
 * 
 * @author xiangwanhong
 *
 */
@MetaDataView(
		//
		tableView = @TableView(title = "主表", description = "主表信息"),
		//
		listViews = {
				@ListView(fields = { "name", "description", "active", "createdBy",
						"created" }, listStyle = ListStyle.TABLE),
				@ListView(fields = { "name", "description", "createdBy",
						"created" }, listStyle = ListStyle.CARDLIST, filters = {
								@FilterView(field = "name", operator = SQLOperator.LIKE) }, orders = @OrderView(field = "name")) },
		//
		formViews = @FormView(sections = {
				@SectionView(title = "用户信息", fieldSets = {
						@FieldSetView(title = "基本信息", fields = { "name", "description" }),
						@FieldSetView(title = "审计", fields = { "active", "createdBy", "created", "updatedBy",
								"updated" }) }),
				@SectionView(type = SectionType.NOTE), @SectionView(type = SectionType.ATTACHMENT) }))
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Master extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2217837879194985591L;

	/**
	 * 简述
	 */
	@FieldView(title = "简述")
	@Column(length = 1000)
	private String description;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "master")
	@FieldView(title = "明细记录")
	private Set<Detail> details;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Detail> getDetails() {
		return details;
	}

	public void setDetails(Set<Detail> details) {
		this.details = details;
	}
}
