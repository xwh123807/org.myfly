package org.myfly.platform.system.stdtest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SKeyEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.SubTableView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.metadata.define.SQLOperator;

@Entity
@Table(schema = SchemaConstants.PT)
@MetaDataView(tableView =
//
@TableView(title = "基准测试职员表", description = "用于性能时") ,
//
listViews = @ListView(fields = { "uid", "name", "address" }, filters = {
		@FilterView(field = "name", operator = SQLOperator.LIKE),
		@FilterView(field = "address", operator = SQLOperator.LIKE) }) ,
		//
		formViews = @FormView(sections = {
				@SectionView(title = "主表区域", fieldSets = {
						@FieldSetView(title = "基本信息", fields = { "name", "address" }) }),
				@SectionView(subTables = { @SubTableView(tableAttr = "notes"),
						@SubTableView(tableAttr = "attachments") }) }) )

// @Indexed(index = "StdTestEmployee")
// @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class StdTestEmployee extends SKeyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7716882970631378997L;

	@Column(nullable = false)
	@FieldView(title = "姓名")
	private String name;

	@Column
	@FieldView(title = "地址")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
