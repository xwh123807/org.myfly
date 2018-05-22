package org.myfly.platform.core.testdata;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Master3Key implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -50207555185195776L;
	@Column
	private int id1;
	@Column
	private int id2;

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
}
