package org.myfly.platform.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FlySearchRelation;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OrderView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.metadata.define.CommonSubTableType;
import org.myfly.platform.core.metadata.define.ListStyle;
import org.myfly.platform.core.metadata.define.OrderType;
import org.myfly.platform.core.system.domain.FlyEntity;

/**
 * 备注
 * 
 * Represents a note, which is text associated with a custom object or a
 * standard object, such as a Contact, Contract, or Opportunity.
 * 
 * Body Body textarea 32000 <br>
 * Created By CreatedById reference 15<br>
 * Created Date CreatedDate datetime<br>
 * Deleted IsDeleted boolean<br>
 * Last Modified By LastModifiedById reference 15<br>
 * Last Modified Date LastModifiedDate datetime<br>
 * Note Id Id id 15<br>
 * Note Owner OwnerId reference 15<br>
 * Parent ParentId reference 15<br>
 * Private IsPrivate boolean<br>
 * System Modstamp SystemModstamp datetime<br>
 * Title Title string 80<br>
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PB)
@MetaDataView(
//
tableView = @TableView(title = "备注", commonSubTables={CommonSubTableType.ATTACHMENT}) ,
//
listViews = { @ListView(name = "default", fields = { "name", "body", "created", "createdBy" }, orders = {
		@OrderView(field = "updated", orderType = OrderType.DESC) }, listStyle = ListStyle.TABLE) },
		//
		formViews = { @FormView(name = "default", sections = { @SectionView(title = "详细信息", fieldSets = {
				@FieldSetView(fields = { "name", "parentId", "body", "updatedBy" }) }) }) })
public class Note extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5430537576936800169L;

	/**
	 * Body of the note. Limited to 32 KB.
	 */
	@FieldView(title = "内容", dataType = FieldDataType.TEXT)
	@Column
	private String body;
	/**
	 * If true, only the note owner or a user with the “Modify All Data”
	 * permission can view the note or query it via the API. Note that if a user
	 * who does not have the “Modify All Data” permission sets this field to
	 * true on a note that they do not own, then they can no longer query,
	 * delete, or update the note. Label is Private.
	 */
	@FieldView(title = "私有")
	@Column
	private Boolean isPrivate;
	/**
	 * ID of the user who owns the note.
	 */
	@FieldView(title = "所有者")
	@Column
	@FlySearchRelation(entityNames = "SUser")
	private String ownerId;
	/**
	 * Required. ID of the object associated with the note.
	 */
	@FieldView(title = "关联对象")
	@Column
	@FlySearchRelation(entityNames = "SUser")
	private String parentId;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getTitle() {
		return getName();
	}

	public void setTitle(String title) {
		setName(title);
	}
}
