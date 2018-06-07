package org.myfly.platform.core.testmodel;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.SectionType;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.system.domain.KeyEntity;

@Entity
@MetaDataView(
		//
		tableView = @TableView(title = "角色", description = "角色信息", labelField="title"),
		//
		listViews = @ListView(fields = { "title", "dataType", "active", "created" }, listStyle = ListStyle.TABLE),
		//
		formViews = @FormView(sections = {
				@SectionView(title = "用户信息", fieldSets = { @FieldSetView(title = "基本信息", fields = { "title", "dataType" }),
						@FieldSetView(title = "审计", fields = { "active", "created" }) }),
				@SectionView(type = SectionType.NOTE), @SectionView(type = SectionType.ATTACHMENT) }))
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Detail extends KeyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -379486704409415239L;

	@FieldView(title = "主记录")
	@JoinColumn()
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Master master;

	@Column(length = 100)
	@FieldView(title = "标识")
	private String title;
	
	@FieldView(title = "数据类型")
	@Column(length = 50)
	private FieldDataType dataType;

	@FieldView(title = "是否激活")
	@Column
	private boolean active;

	@FieldView(title = "新增时间")
	@Column
	private Timestamp created;

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public FieldDataType getDataType() {
		return dataType;
	}

	public void setDataType(FieldDataType dataType) {
		this.dataType = dataType;
	}
}
