package org.myfly.cloud.simpleservice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2835090827325887580L;

	@Id
	private String uid;
	
	@Column
	private String name;
	
	@Column
	private String description;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
