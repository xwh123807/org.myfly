package org.myfly.platform.core.testmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(Master2Key.class)
public class Master2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7752692009039634204L;
	@Id
	private int id1;
	@Id
	private int id2;
	@Column
	private String name;
	@Column
	private Detail2 detail;

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Detail2 getDetail() {
		return detail;
	}

	public void setDetail(Detail2 detail) {
		this.detail = detail;
	}
}
