package org.myfly.platform.system.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.metadata.define.SQLOperator;
import org.myfly.platform.core.system.domain.IUser;
import org.myfly.platform.core.system.domain.KeyEntity;

/**
 * Http 访问日志
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PB)
@MetaDataView(
//
tableView = @TableView(title = "访问日志", description = "Http 访问日志") ,
//
listViews = @ListView(fields = { "host", "created", "method", "url", "status", "usedtime", "referer",
		"createdBy" }, filters = { @FilterView(field = "host", operator = SQLOperator.EQUAL),
				@FilterView(field = "status", operator = SQLOperator.EQUAL),
				@FilterView(field = "url", operator = SQLOperator.LIKE),
				@FilterView(field = "usedtime", operator = SQLOperator.GREATERTHANOREQUALTO) }, enableActions=false, serverSideMode = true) ,
				//
				formViews = @FormView(sections = { @SectionView(title = "访问日志", fieldSets = {
						@FieldSetView(title = "访问日志", fields = { "host", "created", "method", "url", "status",
								"usedtime", "referer", "createdBy", "requestLength", "responseLength" }) }) }) ,
								//
								outlineViews = @OutlineView(title = "访问日志", sections = { @SectionView(fieldSets = {
										@FieldSetView(title = "访问日志", fields = { "host", "created", "method", "url",
												"status", "usedtime", "referer", "createdBy" }) }) }) )
public class AccessLog extends KeyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4203818158504224728L;
	/**
	 * 访问时间
	 */
	@FieldView(title = "访问时间")
	@Column
	private Date created;
	/**
	 * 访问人
	 */
	@FieldView(title = "访问人")
	@JoinColumn(name = "createdId")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private IUser createdBy;
	/**
	 * 访问方式 GET|POST
	 */
	@Column
	@FieldView(title = "访问方式")
	private String method;
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
	 * 耗时
	 */
	@Column
	@FieldView(title = "耗时")
	private Long usedtime;
	/**
	 * 请求大小
	 */
	@Column
	@FieldView(title = "请求大小")
	private Long requestLength;
	/**
	 * 响应状态，如200，304
	 */
	@Column
	@FieldView(title = "状态")
	private Integer status;

	/**
	 * 响应长度
	 */
	@Column
	@FieldView(title = "响应大小")
	private Long responseLength;
	/**
	 * 访问IP
	 */
	@Column
	@FieldView(title = "访问IP")
	private String host;

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
		this.createdBy = createdBy;
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

	public Long getUsedtime() {
		return usedtime;
	}

	public void setUsedtime(Long usedtime) {
		this.usedtime = usedtime;
	}

	public Long getResponseLength() {
		return responseLength;
	}

	public void setResponseLength(Long responseLength) {
		this.responseLength = responseLength;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getRequestLength() {
		return requestLength;
	}

	public void setRequestLength(Long requestLength) {
		this.requestLength = requestLength;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
}
