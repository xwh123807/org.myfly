package org.myfly.platform.core3.model.security;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.model.dict.PEmailConfig;

@Entity
@Table(name = "PT_User")
@FlyTable(name = "User/Contact", description = "User within the system - Internal or Business Partner Contact")
public class PUser extends FlyEntity {
	@FlyField(name = "Search Key", description = "Search key for the record in the format required - must be unique", help = "A search key allows you a fast method of finding a particular record.\n"
			+ "If you leave the search key empty, the system automatically creates a numeric number.  The document sequence used for this fallback number is defined in the \"Maintain Sequence\" window with the name \"DocumentNo_<TableName>\", where TableName is the actual name of the table (e.g. C_Order).")
	@Column(name = "Value", length = 40, unique = true)
	private String value;

	@FlyField(name = "Name", description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;

	@FlyField(name = "Description", description = "Optional short description of the record", help = "A description is limited to 255 characters.")
	@Column(length = 255)
	private String description;

	@ManyToOne
	@FlyField(name = "EMail Configuration")
	private PEmailConfig emailConifg;

	@FlyField(name = "Birthday", description = "Birthday or Anniversary day", help = "Birthday or Anniversary day")
	@Column
	private Date birthday;

	@FlyField(name = "Comments", dataType = FlyDataType.Text, description = "Comments or additional information", help = "The Comments field allows for free form entry of additional information.")
	@Column(name = "Comments", length = 2000)
	private String comments;

	@FlyField(name = "Connection Profile", description = "How a Java Client connects to the server(s)", help = "Depending on the connection profile, different protocols are used and tasks are performed on the server rather then the client. Usually the user can select different profiles, unless it is enforced by the User or Role definition. The User level profile overwrites the Role based profile.")
	@Column(name = "ConnectionProfile")
	private ConnectionProfile connectionProfile;

	@FlyField(name = "EMail Address", dataType = FlyDataType.EMail, description = "Electronic Mail Address", help = "The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web.")
	@Column(name = "EMail", length = 60)
	private String eMail;

	@FlyField(name = "EMail User ID", description = "User Name (ID) in the Mail System", help = "The user name in the mail system is usually the string before the @ of your email address.  Required if the mail server requires authentification to send emails.")
	@Column(name = "EMailUser", length = 60)
	private String eMailUser;

	@FlyField(name = "EMail User Password", description = "Password of your email user id", help = "Required if the mail server requires authentification to send emails.")
	@Column(name = "EMailUserPW")
	private String eMailUserPW;

	@FlyField(name = "Verification Info", description = "Verification information of EMail Address", help = "The field contains additional information how the EMail Address has been verified")
	@Column(name = "EMailVerify", length = 40)
	private String eMailVerify;

	@FlyField(name = "EMail Verify", description = "Date Email was verified", help = "")
	@Column(name = "EMailVerifyDate")
	private Timestamp eMailVerifyDate;

	@FlyField(name = "Fax", description = "Facsimile number", help = "The Fax identifies a facsimile number for this Business Partner or  Location")
	@Column(name = "Fax")
	private String fax;

	@FlyField(name = "HasRole", description = "Has Role Y/N", help = "", columnSQL = "(CASE WHEN (SELECT count(*) FROM PT_User_Roles ur WHERE ur.PT_User_ID=PT_User.PT_User_ID AND ur.IsActive='Y') > 0 THEN 'Y' ELSE 'N' END)")
	@Column(name = "HasRole")
	private Boolean hasRole;

	@FlyField(name = "Full BP Access", defaultValue = "Y", description = "The user/contact has full access to Business Partner information and resources", help = "If selected, the user has full access to the Business Partner (BP) information (Business Documents like Orders, Invoices - Requests) or resources (Assets, Downloads). If you deselect it, the user has no access rights unless, you explicitly grant it in tab \"BP Access\"")
	@Column(name = "IsFullBPAccess")
	private Boolean isFullBPAccess;

	@FlyField(name = "Sales Lead", description = "This contact is a sales lead", help = "Sales leads can be converted into full contacts with Business Partners.")
	@Column(name = "IsSalesLead")
	private Boolean isSalesLead;

	@FlyField(name = "Webstore User", description = "Is a user for Webstore", help = "It is created from Webstore")
	@Column(name = "IsWebstoreUser")
	private Boolean isWebstoreUser;

	@FlyField(name = "Last Contact", description = "Date this individual was last contacted", help = "The Last Contact indicates the date that this Business Partner Contact was last contacted.")
	@Column(name = "LastContact")
	private Date lastContact;

	@FlyField(name = "Last Result", description = "Result of last contact", help = "The Last Result identifies the result of the last contact made.")
	@Column(name = "LastResult")
	private String lastResult;

	@FlyField(name = "LDAP User Name", description = "User Name used for authorization via LDAP (directory) services", help = "Optional LDAP system user name for the user. If not defined, the normal Name of the user is used. This allows to use the internal (LDAP) user id (e.g. jjanke) and the normal display name (e.g. Jorg Janke).  The LDAP User Name can also be used without LDAP enables (see system window).  This would allow to sign in as jjanke and use the display name of Jorg Janke.")
	@Column(name = "LDAPUser", length = 60)
	private Boolean lDAPUser;

	@FlyField(name = "Lead Source", description = "The source of this lead/opportunity", help = "")
	@Column(name = "LeadSource")
	private String leadSource;

	@FlyField(name = "Lead Source Description", description = "Additional information on the source of this lead/opportunity", help = "")
	@Column(name = "LeadSourceDescription")
	private String LeadSourceDescription;

	@FlyField(name = "Lead Status", description = "The status of this lead/opportunity in the sales cycle", help = "")
	@Column(name = "LeadStatus")
	private LeadStatus LeadStatus;

	@FlyField(name = "Lead Status Description", description = "Additional information on the status of this lead/opportunity", help = "")
	@Column(name = "LeadStatusDescription")
	private String leadStatusDescription;

	@FlyField(name = "Notification Type", defaultValue = "E", description = "Type of Notifications", help = "Emails or Notification sent out for Request Updates, etc.")
	@Column(name = "NotificationType")
	private NotificationType notificationType;

	@FlyField(name = "Password", description = "Password of any length (case sensitive)", help = "The Password for this User.  Passwords are required to identify authorized users.  For Adempiere Users, you can change the password via the Process \"Reset Password\".")
	@Column(name = "Password", length = 1024)
	private String password;

	@FlyField(name = "Phone", description = "Identifies a telephone number", help = "The Phone field identifies a telephone number")
	@Column(name = "Phone", length = 40)
	private String phone;

	@FlyField(name = "2nd Phone", description = "Identifies a telephone number", help = "The 2nd Phone field identifies an alternate telephone number.")
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

	public PEmailConfig getEmailConifg() {
		return emailConifg;
	}

	public void setEmailConifg(PEmailConfig emailConifg) {
		this.emailConifg = emailConifg;
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

	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	public void setConnectionProfile(ConnectionProfile connectionProfile) {
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

	public Boolean getIsWebstoreUser() {
		return isWebstoreUser;
	}

	public void setIsWebstoreUser(Boolean isWebstoreUser) {
		this.isWebstoreUser = isWebstoreUser;
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
		return LeadSourceDescription;
	}

	public void setLeadSourceDescription(String leadSourceDescription) {
		LeadSourceDescription = leadSourceDescription;
	}

	public LeadStatus getLeadStatus() {
		return LeadStatus;
	}

	public void setLeadStatus(LeadStatus leadStatus) {
		LeadStatus = leadStatus;
	}

	public String getLeadStatusDescription() {
		return leadStatusDescription;
	}

	public void setLeadStatusDescription(String leadStatusDescription) {
		this.leadStatusDescription = leadStatusDescription;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
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
}
