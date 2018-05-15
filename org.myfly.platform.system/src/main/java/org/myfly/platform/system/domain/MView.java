package org.myfly.platform.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.system.domain.FlyEntity;

/**
 * 视图
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PM)
@MetaDataView(
//
tableView = @TableView(title = "视图", description = "视图信息") ,
//
listViews = @ListView(fields = { "name", "description", "active", "createdBy", "created" }) ,
//
formViews = @FormView(sections = { @SectionView(title = "视图信息", fieldSets = {
		@FieldSetView(title = "基本信息", fields = { "name", "description" }),
		@FieldSetView(title = "审计", fields = { "active", "createdBy", "created", "updatedBy", "updated" }) }) }) )
public class MView extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4249024931888705359L;

	/**
	 * 简述
	 */
	@FieldView(title = "简述")
	@Column(length = 1000)
	private String description;

	public MView() {
		setInternalTable("MView");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
