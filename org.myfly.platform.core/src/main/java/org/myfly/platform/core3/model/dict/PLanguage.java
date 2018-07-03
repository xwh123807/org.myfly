package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Language")
@FlyTable(name = "Language ID")
public class PLanguage extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5014501422687483273L;

	@Id
	@Column(length=32)
	private String languageID;

	public String getLanguageID() {
		return languageID;
	}

	public void setLanguageID(String languageID) {
		this.languageID = languageID;
	}
}
