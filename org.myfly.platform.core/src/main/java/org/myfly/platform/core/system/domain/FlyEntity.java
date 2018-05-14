package org.myfly.platform.core.system.domain;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.FieldView;

/**
 * 基础实体类，实体类都需继承本类。
 * @author xiangwanhong
 *
 */
@MappedSuperclass
@Inheritance(strategy=InheritanceType.JOINED)
public class FlyEntity extends KeyEntity implements IFlyEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 392066006775341218L;
	
	@FieldView(title="名称", minLength=1)
	@Column(length=255, nullable=false)
	private String name;

	/**
	 * 租户ID
	 */
	@FieldView(title="租户")
	@JoinColumn(updatable=false)
	@ManyToOne(optional = true, fetch=FetchType.LAZY)
	private ITenant tenant;
	/**
	 * 记录是否有效，默认有效
	 */
	@FieldView(title="激活")
	@Column
	private boolean active = true;
	
	/**
	 * 创建时间
	 */
	@FieldView(title="创建时间", dataType=FieldDataType.DATETIME)
	@Column
	private Timestamp created;
	/**
	 * 创建人
	 */
	@FieldView(title="创建者")
	@JoinColumn()
	@ManyToOne(optional = true, fetch=FetchType.LAZY)
	private IUser createdBy;
	/**
	 * 修改时间
	 */
	@FieldView(title="修改时间", dataType=FieldDataType.DATETIME)
	@Column
	private Timestamp updated;
	/**
	 * 修改人
	 */
	@FieldView(title="修改人")
	@JoinColumn()
	@ManyToOne(optional = true, fetch=FetchType.LAZY)
	private IUser updatedBy;
	
	public FlyEntity() {
	}

	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	public Timestamp getUpdated() {
		return updated;
	}
	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public ITenant getTenant() {
		return tenant;
	}

	public void setTenant(ITenant tenant) {
		this.tenant = tenant;
	}

	public IUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(IUser createdBy) {
		this.createdBy = createdBy;
	}

	public IUser getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(IUser updatedBy) {
		this.updatedBy = updatedBy;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setInternalTable(String tmp){
	}
	
	@Override
	public String toString() {
		return "uid: " + getUid() + ", name: " + getName();
	}
}
