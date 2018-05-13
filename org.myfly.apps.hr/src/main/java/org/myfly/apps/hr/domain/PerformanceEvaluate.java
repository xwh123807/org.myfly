package org.myfly.apps.hr.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.myfly.platform.metamodel.annotation.FieldSetView;
import org.myfly.platform.metamodel.annotation.FieldView;
import org.myfly.platform.metamodel.annotation.FormView;
import org.myfly.platform.metamodel.annotation.ListView;
import org.myfly.platform.metamodel.annotation.MetaDataView;
import org.myfly.platform.metamodel.annotation.SectionView;
import org.myfly.platform.metamodel.annotation.SubTableView;
import org.myfly.platform.metamodel.annotation.TableView;
import org.myfly.platform.metamodel.domain.ListStyle;
import org.myfly.platform.metamodel.domain.SBaseEntity;
import org.myfly.platform.metamodel.domain.SUser;
import org.myfly.platform.metamodel.domain.SchemaConstants;

@Entity
@Table(schema = SchemaConstants.HR)
@MetaDataView(tableView = @TableView(title = "绩效评价主表") ,
//
listViews = {
		//
		@ListView(name = "default", fields = { "name", "user", "post", "totalScore" }, listStyle = ListStyle.TABLE) },
		//
		formViews = {
				//
				@FormView(name = "default", sections = {
						@SectionView(fieldSets = { @FieldSetView(fields = { "name", "user", "post", "totalScore" }) }),
						@SectionView(subTables = { @SubTableView(tableAttr = "details") }) }) })
public class PerformanceEvaluate extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -452531940935076679L;
	@ManyToOne
	@FieldView(title = "用户")
	private SUser user;
	@Column
	@FieldView(title = "期间")
	private Date period;
	@Column
	@FieldView(title = "得分")
	private Long totalScore;
	@ManyToOne
	@FieldView(title = "职位")
	private Post post;
	@OneToMany(mappedBy = "performanceEvaluate")
	private Set<PerformanceEvaluateDetail> details;

	public SUser getUser() {
		return user;
	}

	public void setUser(SUser user) {
		this.user = user;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public Long getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Set<PerformanceEvaluateDetail> getDetails() {
		return details;
	}

	public void setDetails(Set<PerformanceEvaluateDetail> details) {
		this.details = details;
	}
}
