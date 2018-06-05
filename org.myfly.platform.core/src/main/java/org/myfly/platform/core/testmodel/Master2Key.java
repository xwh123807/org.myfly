package org.myfly.platform.core.testmodel;

import java.io.Serializable;

public class Master2Key implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -50207555185195776L;

	private int id1;
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

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + Long.valueOf(id1).hashCode();
		result = PRIME * result + Long.valueOf(id2).hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Master2Key other = (Master2Key) obj;
		return id1 == other.id1 && id2 == other.id2;
	}
}
