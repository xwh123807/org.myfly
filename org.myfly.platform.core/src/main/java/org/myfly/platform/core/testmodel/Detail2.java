package org.myfly.platform.core.testmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Detail2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3600990053998339029L;

	@Id
	private int detailId;
	@Column
	private String title;
	@JoinColumns({ @JoinColumn(name = "id1", referencedColumnName = "id1"),
			@JoinColumn(name = "id2", referencedColumnName = "id2") })
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Master2 master;

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Master2 getMaster() {
		return master;
	}

	public void setMaster(Master2 master) {
		this.master = master;
	}
}
