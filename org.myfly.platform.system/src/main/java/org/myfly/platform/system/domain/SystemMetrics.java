package org.myfly.platform.system.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SKeyEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.metadata.define.ListStyle;

/**
 * 系统监控数据，定时收集
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PB)
@MetaDataView(
//
tableView = @TableView(title = "监控数据", description = "监控数据") ,
//
listViews = @ListView(fields = { "created", "name",
		"value" }, listStyle = ListStyle.TABLE, itemActions = {}, listActions = {}) ,
		//
		formViews = @FormView(sections = { @SectionView(title = "监控数据", fieldSets = {
				@FieldSetView(title = "监控数据", fields = { "created", "name", "value" }) }) }) ,
				//
				outlineViews = @OutlineView(title = "监控数据", sections = { @SectionView(fieldSets = {
						@FieldSetView(title = "监控数据", fields = { "created", "name", "value" }) }) }) )
public class SystemMetrics extends SKeyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7629918289777360894L;

	/**
	 * 创建时间，相同采集时间多个指标值相同
	 */
	@FieldView(title = "创建时间")
	@Column
	private Date created;
	/**
	 * 指标名
	 */
	@FieldView(title = "指标名")
	@Column
	private String name;
	/**
	 * 指标值
	 */
	@FieldView(title = "指标值")
	@Column
	private String value;

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
