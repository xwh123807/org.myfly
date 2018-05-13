package org.myfly.apps.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.metamodel.annotation.FieldSetView;
import org.myfly.platform.metamodel.annotation.FieldView;
import org.myfly.platform.metamodel.annotation.FormView;
import org.myfly.platform.metamodel.annotation.ListView;
import org.myfly.platform.metamodel.annotation.MetaDataView;
import org.myfly.platform.metamodel.annotation.SectionView;
import org.myfly.platform.metamodel.annotation.TableView;
import org.myfly.platform.metamodel.domain.ListStyle;
import org.myfly.platform.metamodel.domain.SBaseEntity;
import org.myfly.platform.metamodel.domain.SchemaConstants;

/**
 * 技能
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.HR)
@MetaDataView(tableView = @TableView(title = "技能") ,
//
listViews = {
		//
		@ListView(name = "default", fields = { "name", "description" }, listStyle = ListStyle.TABLE) },
		//
		formViews = {
				//
				@FormView(name = "default", sections = {
						@SectionView(fieldSets = { @FieldSetView(fields = { "name", "description" }) }) }) })
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Skill extends SBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964726675661198591L;

	@Column
	@FieldView(title="描述")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
