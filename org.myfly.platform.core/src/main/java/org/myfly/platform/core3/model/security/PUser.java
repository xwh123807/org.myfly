package org.myfly.platform.core3.model.security;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyReferences;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_User")
@FlyTable(name = "User/Contact", description = "User within the system - Internal or Business Partner Contact")
@FlyReferences(references = {
		@FlyRefTable(apiName = "userID", name = "PUser ID", keyColumn = "userID", displayColumn = "name"),
		@FlyRefTable(apiName = "createdBy", name = "创建人", keyColumn = "userID", displayColumn = "name"),
		@FlyRefTable(apiName = "updatedBy", name = "修改人", keyColumn = "userID", displayColumn = "name") })
public class PUser extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8858288388188667995L;

	@Id
	@Column(length = 32, name="UserID")
	private String userID;

	@Column(name = "Value", length = 40, unique = true)
	private String value;

	@Column(length = 60)
	private String name;

	@Column(length = 255)
	private String description;

	@Column(length = 32)
	private String emailConfigID;

	@Column
	private Date birthday;

	@Column(name = "Comments", length = 2000)
	private String comments;

	@Column(name = "ConnectionProfile")
	private String connectionProfile;

	@Column(name = "EMail", length = 60)
	private String eMail;

	@Column(name = "EMailUser", length = 60)
	private String eMailUser;

	@Column(name = "EMailUserPW")
	private String eMailUserPW;

	@Column(name = "EMailVerify", length = 40)
	private String eMailVerify;

	@Column(name = "EMailVerifyDate")
	private Timestamp eMailVerifyDate;

	@Column(name = "Fax")
	private String fax;

	@Column(name = "HasRole")
	private Boolean hasRole;

	@Column(name = "IsFullBPAccess")
	private Boolean isFullBPAccess;

	@Column(name = "IsSalesLead")
	private Boolean isSalesLead;

	// @Column(name = "IsWebstoreUser")
	// private Boolean isWebstoreUser;

	@Column(name = "LastContact")
	private Date lastContact;

	@Column(name = "LastResult")
	private String lastResult;

	@Column(name = "LDAPUser", length = 60)
	private Boolean lDAPUser;

	@Column(name = "LeadSource")
	private String leadSource;

	@Column(name = "LeadSourceDescription")
	private String leadSourceDescription;

	@Column(name = "LeadStatus")
	private String leadStatus;

	@Column(name = "LeadStatusDescription")
	private String leadStatusDescription;

	@Column(name = "NotificationType")
	private String notificationType;

	@Column(name = "Password", length = 1024)
	private String password;

	@Column(name = "Phone", length = 40)
	private String phone;

	@Column(name = "Phone2", length = 40)
	private String phone2;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getConnectionProfile() {
		return connectionProfile;
	}

	public void setConnectionProfile(String connectionProfile) {
		this.connectionProfile = connectionProfile;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String geteMailUser() {
		return eMailUser;
	}

	public void seteMailUser(String eMailUser) {
		this.eMailUser = eMailUser;
	}

	public String geteMailUserPW() {
		return eMailUserPW;
	}

	public void seteMailUserPW(String eMailUserPW) {
		this.eMailUserPW = eMailUserPW;
	}

	public String geteMailVerify() {
		return eMailVerify;
	}

	public void seteMailVerify(String eMailVerify) {
		this.eMailVerify = eMailVerify;
	}

	public Timestamp geteMailVerifyDate() {
		return eMailVerifyDate;
	}

	public void seteMailVerifyDate(Timestamp eMailVerifyDate) {
		this.eMailVerifyDate = eMailVerifyDate;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Boolean getHasRole() {
		return hasRole;
	}

	public void setHasRole(Boolean hasRole) {
		this.hasRole = hasRole;
	}

	public Boolean getIsFullBPAccess() {
		return isFullBPAccess;
	}

	public void setIsFullBPAccess(Boolean isFullBPAccess) {
		this.isFullBPAccess = isFullBPAccess;
	}

	public Boolean getIsSalesLead() {
		return isSalesLead;
	}

	public void setIsSalesLead(Boolean isSalesLead) {
		this.isSalesLead = isSalesLead;
	}

	public Date getLastContact() {
		return lastContact;
	}

	public void setLastContact(Date lastContact) {
		this.lastContact = lastContact;
	}

	public String getLastResult() {
		return lastResult;
	}

	public void setLastResult(String lastResult) {
		this.lastResult = lastResult;
	}

	public Boolean getlDAPUser() {
		return lDAPUser;
	}

	public void setlDAPUser(Boolean lDAPUser) {
		this.lDAPUser = lDAPUser;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public String getLeadSourceDescription() {
		return leadSourceDescription;
	}

	public void setLeadSourceDescription(String leadSourceDescription) {
		this.leadSourceDescription = leadSourceDescription;
	}

	public String getLeadStatus() {
		return leadStatus;
	}

	public void setLeadStatus(String leadStatus) {
		this.leadStatus = leadStatus;
	}

	public String getLeadStatusDescription() {
		return leadStatusDescription;
	}

	public void setLeadStatusDescription(String leadStatusDescription) {
		this.leadStatusDescription = leadStatusDescription;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getEmailConfigID() {
		return emailConfigID;
	}

	public void setEmailConfigID(String emailConfigID) {
		this.emailConfigID = emailConfigID;
	}
}
