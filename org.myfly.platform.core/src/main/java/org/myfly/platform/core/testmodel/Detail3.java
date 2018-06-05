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
public class Detail3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -379486704409415239L;

	@Id
	private int iid;

	@JoinColumns({ @JoinColumn(name = "id1", referencedColumnName = "id1"),
			@JoinColumn(name = "id2", referencedColumnName = "id2") })
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Master3 master;

	@Column
	private String name;

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public Master3 getMaster() {
		return master;
	}

	public void setMaster(Master3 master) {
		this.master = master;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
