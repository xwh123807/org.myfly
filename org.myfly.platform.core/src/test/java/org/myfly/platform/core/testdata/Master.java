package org.myfly.platform.core.testdata;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.Div1View;
import org.myfly.platform.core.metadata.annotation.Div2View;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OrderView;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.myfly.platform.core.metadata.annotation.SQLOperator;
import org.myfly.platform.core.metadata.annotation.SectionType;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.SubTableView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.system.domain.KeyEntity;

/**
 * 角色
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name="SM_MASTER", catalog="TEST", schema="SAMPLE")
@MetaDataView(
		//
		tableView = @TableView(title = "主表", description = "主表信息"),
		//
		listViews = {
				@ListView(name="default", fields = { "name", "description", "active", "createdBy",
						"created" }, listStyle = ListStyle.TABLE),
				@ListView(name="list2", fields = { "name", "description", "createdBy",
						"created" }, listStyle = ListStyle.CARDLIST, filters = {
								@FilterView(field = "name", operator = SQLOperator.LIKE) }, orders = @OrderView(field = "name")) },
		//
		formViews = {
				//
				@FormView(sections = {
						@SectionView(title = "用户信息", fieldSets = {
								@FieldSetView(title = "基本信息", fields = { "name", "description" }),
								@FieldSetView(title = "审计", fields = { "active", "createdBy", "created", "updatedBy",
										"updated" }) }),
						@SectionView(type = SectionType.NOTE), @SectionView(type = SectionType.ATTACHMENT),
						@SectionView(title = "子表区域", subTables = @SubTableView(title = "明细记录", tableAttr = "details")) }),
				//
				@FormView(name = "form2", divs = @Div1View(subs = @Div2View(sections = @SectionView(type = SectionType.ATTACHMENT)))) },
		//
		outlineViews = { @OutlineView(title = "摘要信息", sections = @SectionView(title = "用户信息", fieldSets = {
				@FieldSetView(title = "基本信息", fields = { "name", "description" }),
				@FieldSetView(title = "审计", fields = { "active", "createdBy", "created", "updatedBy",
						"updated" }) })) })
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Master extends KeyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2217837879194985591L;
	
	@FieldView(title="名称")
	@Column(nullable=false)
	private String name;

	/**
	 * 简述
	 */
	@FieldView(title = "简述")
	@Column(length = 1000)
	private String description;
	
	@FieldView(title = "数据类型")
	@Column(length = 50)
	private FieldDataType dataType;

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

	public FieldDataType getDataType() {
		return dataType;
	}

	public void setDataType(FieldDataType dataType) {
		this.dataType = dataType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
