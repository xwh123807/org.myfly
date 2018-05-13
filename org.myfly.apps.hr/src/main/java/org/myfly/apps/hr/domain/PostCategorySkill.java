package org.myfly.apps.hr.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
 * 职位序列技能，管理某个职位序列下需要掌握的技能
 * 
 * @author xiangwanhong
 *
 */
@Table(schema = SchemaConstants.HR)
@Entity
@MetaDataView(tableView = @TableView(title = "职位技能") ,
//
listViews = {
		//
		@ListView(name = "default", fields = { "postCategory", "skill" }, listStyle = ListStyle.TABLE) },
		//
		formViews = {
				//
				@FormView(name = "default", sections = {
						@SectionView(fieldSets = { @FieldSetView(fields = { "postCategory", "skill" }) }) }) })
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PostCategorySkill extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6609165918734311629L;

	@ManyToOne
	@FieldView(title = "职位序列")
	private PostCategory postCategory;

	@ManyToOne
	@FieldView(title = "技能")
	private Skill skill;

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public PostCategory getPostCategory() {
		return postCategory;
	}

	public void setPostCategory(PostCategory postCategory) {
		this.postCategory = postCategory;
	}
}
