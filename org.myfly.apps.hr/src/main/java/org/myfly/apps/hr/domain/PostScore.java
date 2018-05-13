package org.myfly.apps.hr.domain;

import javax.persistence.Column;
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
 * 职位分值定义
 * 
 * @author xiangwanhong
 *
 */
@Table(schema = SchemaConstants.HR)
@Entity
@MetaDataView(tableView = @TableView(title = "任职评分") ,
//
listViews = {
		//
		@ListView(name = "default", fields = { "post", "skill", "score" }, listStyle = ListStyle.TABLE) },
		//
		formViews = {
				//
				@FormView(name = "default", sections = {
						@SectionView(fieldSets = { @FieldSetView(fields = { "post", "skill", "score" }) }) }) })
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PostScore extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6777930584312405781L;

	@ManyToOne
	@FieldView(title = "职位")
	private Post post;

	@ManyToOne
	@FieldView(title = "技能")
	private Skill skill;

	@Column
	@FieldView(title = "分值")
	private Long score;

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}
}
