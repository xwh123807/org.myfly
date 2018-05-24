package org.myfly.platform.system.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.system.domain.IUser;
import org.myfly.platform.core.system.domain.KeyEntity;

/**
 * 用户行为记录表
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PB)
@MetaDataView(
//
tableView = @TableView(title = "用户行为", description = "记录用户行为") ,
//
listViews = @ListView(fields = { "created", "createdBy", "userAction", "url", "referer" }) ,
//
formViews = @FormView(sections = { @SectionView(title = "用户行为信息", fieldSets = {
		@FieldSetView(title = "用户行为信息", fields = { "created", "createdBy", "userAction", "url", "referer" }) }) }) ,
		//
		outlineViews = @OutlineView(title = "用户行为信息", sections = {
				@SectionView(fieldSets = { @FieldSetView(title = "用户行为信息", fields = { "created", "createdBy",
						"userAction", "url", "referer" }) }) }) )
public class UserBehavior extends KeyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1665878487502578411L;
	/**
	 * 创建时间
	 */
	@FieldView(title = "创建时间")
	@Column
	private Date created;
	/**
	 * 用户
	 */
	@FieldView(title = "创建者")
	@JoinColumn(name = "createdId")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private User createdBy;
	/**
	 * 访问页面
	 */
	@Column(length = 1000)
	@FieldView(title = "访问页面")
	private String url;
	/**
	 * 父页面
	 */
	@Column(length = 1000)
	@FieldView(title = "父页面")
	private String referer;
	/**
	 * 页面类型，如果页面为实体，则为实体名称;如果是自定义对象，则为自定义对象名称
	 */
	@Column(length = 100)
	@FieldView(title = "页面类型")
	private String category;

	/**
	 * 用户动作
	 */
	@Column
	@Enumerated(EnumType.STRING)
	@FieldView(title = "动作")
	private UserAction userAction;

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public IUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(IUser createdBy) {
		this.createdBy = (User) createdBy;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getReferer() {
		return referer;
	}

	public void setReferer(String referer) {
		this.referer = referer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public UserAction getUserAction() {
		return userAction;
	}

	public void setUserAction(UserAction userAction) {
		this.userAction = userAction;
	}
}
