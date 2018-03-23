package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.core.domain.SchemaConstants;

@Entity
@Table(schema = SchemaConstants.PT)
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6024404828370605365L;

	@Id
	@Column(nullable = false)
	private Long iid;
	@Column
	private Long imgId;
	@Column(length = 24)
	private String name;
	@Column
	private Double price;
	@Column(length = 50)
	private String data;

	public Long getIid() {
		return iid;
	}

	public void setIid(Long iid) {
		this.iid = iid;
	}

	public Long getImgId() {
		return imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
