package org.myfly.platform.core.testdata;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Master3 extends Master3Key {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7583937792178435676L;
	@EmbeddedId
	private Master3Key key;

	public Master3Key getKey() {
		return key;
	}

	public void setKey(Master3Key key) {
		this.key = key;
	}
}
