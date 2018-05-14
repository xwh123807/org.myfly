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
 * 系统字典
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PB)
@MetaDataView(
//
tableView = @TableView(title = "系统字典", description = "系统字典信息") ,
//
listViews = @ListView(fields = { "name", "description", "active", "createdBy", "created" }) ,
//
formViews = @FormView(sections = { @SectionView(title = "系统字典信息", fieldSets = {
		@FieldSetView(title = "基本信息", fields = { "name", "description" }),
		@FieldSetView(title = "审计", fields = { "active", "createdBy", "created", "updatedBy", "updated" }) }) }) )
public class Dictionary extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7265528763653102956L;

	/**
	 * 简述
	 */
	@FieldView(title = "简述")
	@Column(length = 1000)
	private String description;

	public Dictionary() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
