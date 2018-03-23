package org.myfly.research.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@Table
@Document(indexName = "attachment")
public class Attachment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8197826071623697554L;

	@Id
	@Column(length=32)
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	@org.springframework.data.annotation.Id
	private String uid;
	
	@Column
	private String name;

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
}
