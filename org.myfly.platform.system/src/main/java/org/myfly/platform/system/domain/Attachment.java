package org.myfly.platform.system.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SBaseEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.metadata.define.EntityAction;
import org.myfly.platform.core.metadata.define.ListStyle;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 附件 Represents a file that a User has uploaded and attached to a parent
 * object.
 * 
 * Attachment ID Id id 15 <br>
 * Body Body base64 <br>
 * Body Length BodyLength int 8 0 <br>
 * Content Type ContentType string 120 <br>
 * Created By CreatedById reference 15<br>
 * Created Date CreatedDate datetime<br>
 * Deleted IsDeleted boolean<br>
 * Description Description textarea 500<br>
 * File Name Name string 255<br>
 * Last Modified By LastModifiedById reference 15<br>
 * Last Modified Date LastModifiedDate datetime<br>
 * Owner Name OwnerId reference 15<br>
 * Parent ParentId reference 15<br>
 * Private IsPrivate boolean<br>
 * System Modstamp SystemModstamp datetime<br>
 * 
 * @author xiangwanhong
 *
 */

@Entity
@Table(schema = SchemaConstants.PB)
//@Indexed(index = "Attachment")
@MetaDataView(tableView = @TableView(title = "附件", commonSubTables = {}) ,
//
listViews = {
		//
		@ListView(name = "default", fields = { "name", "contentType", "tags", "body", "created",
				"createdBy" }, listStyle = ListStyle.CARDLIST, listActions = { EntityAction.UPLOAD }, itemActions = {
						EntityAction.VIEW }) })
@Document(indexName="attachment")
public class Attachment extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -300297650388390735L;

	@Column
	@FieldView(title = "长度")
	private Integer bodyLength;
	@FieldView(title = "文档类型")
	@Column
	private String contentType;
	@FieldView(title = "是否删除")
	@Column
	private Boolean deleted;
	@FieldView(title = "标记")
	@Column
	private String tags;
	@FieldView(title = "父对象")
	@Column
	private String parentId;
	@FieldView(title = "是否私有")
	@Column
	private Boolean privated;
	@FieldView(title = "内容")
	@Column
//	@Field(index = Index.YES, store = Store.NO)
	@Lob
	@Basic(fetch = FetchType.LAZY)
	//@TikaBridge
//	@FieldBridge(impl=FlyTikaBridge.class)
	private byte[] body;

	public Integer getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(Integer bodyLength) {
		this.bodyLength = bodyLength;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public byte[] getBody() {
		return body;
	}

	public void setBody(byte[] body) {
		this.body = body;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Boolean getPrivated() {
		return privated;
	}

	public void setPrivated(Boolean privated) {
		this.privated = privated;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		return "uid: " + getUid() + ",name:" + getName();
	}
}
