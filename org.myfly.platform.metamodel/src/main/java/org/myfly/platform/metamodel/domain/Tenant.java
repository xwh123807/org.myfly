package org.myfly.platform.metamodel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.metamodel.annotation.FieldSetView;
import org.myfly.platform.metamodel.annotation.FieldView;
import org.myfly.platform.metamodel.annotation.FilterView;
import org.myfly.platform.metamodel.annotation.FormView;
import org.myfly.platform.metamodel.annotation.ListView;
import org.myfly.platform.metamodel.annotation.MetaDataView;
import org.myfly.platform.metamodel.annotation.SectionView;
import org.myfly.platform.metamodel.annotation.TableView;

/**
 * 租户
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PB, indexes = { @Index(name = "idx_stenant_name", unique = true, columnList = "name") })
@MetaDataView(
//
tableView = @TableView(title = "租户", description = "租户信息") ,
//
listViews = @ListView(fields = { "name", "description", "active", "createdBy", "created" }, filters = {
		@FilterView(field = "name") }) ,
		//
		formViews = @FormView(sections = {
				@SectionView(title = "租户信息", fieldSets = {
						@FieldSetView(title = "基本信息", fields = { "name", "description" }),
						@FieldSetView(title = "审计", fields = { "active", "createdBy", "created", "updatedBy",
								"updated" }) }),
				@SectionView(type = SectionType.NOTE), @SectionView(type = SectionType.ATTACHMENT) }) )
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Tenant extends SBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4313941690033964316L;

	/**
	 * 简述
	 */
	@FieldView(title = "简述")
	@Column(length = 1000)
	private String description;

	public Tenant() {
		setInternalTable("STenant");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
