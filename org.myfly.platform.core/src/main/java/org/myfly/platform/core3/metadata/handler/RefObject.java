package org.myfly.platform.core3.metadata.handler;

import java.io.Serializable;

public class RefObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7777542842572438210L;
	public static final String UID = "__uid";
	public static final String LABEL = "__label";
	private String uid;
	private String label;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
