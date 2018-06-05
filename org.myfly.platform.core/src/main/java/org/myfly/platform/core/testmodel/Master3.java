package org.myfly.platform.core.testmodel;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Master3 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7583937792178435676L;
	@EmbeddedId
	private Master3Key key;
	@Column
	private String name;
	@Column
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "master")
	private Set<Detail3> details;

	public Master3Key getKey() {
		return key;
	}

	public void setKey(Master3Key key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Detail3> getDetails() {
		return details;
	}

	public void setDetails(Set<Detail3> details) {
		this.details = details;
	}
}
