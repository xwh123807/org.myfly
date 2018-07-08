package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_EmailConfig")
@FlyTable(name = "EMail Configuration")
@FlyRefTable(apiName = "emailConfigID", name="邮箱配置", keyColumn = "emailConfigID", displayColumn = "name")
public class PEmailConfig extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3089925813304383070L;

	@Id
	@Column(length = 32)
	private String emailConfigID;

	@Column(length = 60)
	private String name;

	public String getEmailConfigID() {
		return emailConfigID;
	}

	public void setEmailConfigID(String emailConfigID) {
		this.emailConfigID = emailConfigID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
