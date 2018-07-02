package org.myfly.platform.core3.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.model.dict.PLanguage;
import org.myfly.platform.core3.model.dict.PReplicationStrategy;

/**
 * 
 * @author xiangwanhong
 *
 */
@Table(name = "PT_Client")
@Entity
@FlyTable(name = "Client", description = "Client/Tenant for this installation.")
public class PClient extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8452625601049940882L;

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

	@FlyField(name = "Auto Archive", description = "Enable and level of automatic Archive of documents", help = "Adempiere allows to automatically create archives of Documents (e.g. Invoices) or Reports. You view the archived material with the Archive Viewer")
	@Column(name = "AutoArchive")
	private AutoArchive autoArchive;

	@FlyField(name = "Document Directory", description = "Directory for documents from the application server", help = "Directory to store documents by the application server.  The path/directory is accessed by the application server and may not be accessible to clients.")
	@Column(name = "DocumentDir")
	private String documentDir;

	@FlyField(name = "Email Test", dataType = FlyDataType.Button, description = "Test EMail")
	@Column(name = "EMailTest", length = 1)
	private String eMailTest;

	@FlyField(name = "Cost Immediately", description = "Update Costs immediately for testing", help = "If selected, costs are updated immediately when a Cost Detail record is created (by matching or shipping).  Otherwise the costs are updated by batch or when the costs are needed for posting. You should select this only if you are testing,")
	@Column(name = "IsCostImmediate")
	private Boolean isCostImmediate;

	@FlyField(name = "Multi Lingual Documents", description = "Documents are Multi Lingual", help = "If selected, you enable multi lingual documents and need to maintain translations for entities used in documents (examples: Products, Payment Terms, ...).<br>\n"
			+ "Please note, that the base language is always English.")
	@Column(name = "IsMultiLingualDocument")
	private Boolean isMultiLingualDocument;

	@FlyField(name = "Post Immediately (Deprecated)", description = "Post the accounting immediately for testing (Deprecated)", help = "If selected, the accounting consequences are immediately generated when completing a document.  Otherwise the document is posted by a batch process.  You should select this only if you are testing.\n"
			+ "Deprecated column - use instead the functionality Client Accounting.")
	@Column(name = "IsPostImmediate")
	private Boolean isPostImmediate;

	@FlyField(name = "Server EMail", description = "Send EMail from Server", help = "When selected, mail is sent from the server rather then the client.  This decreases availability.  You would select this when you do not want to enable email relay for the client addresses in your mail server.")
	@Column(name = "IsServerEMail")
	private Boolean isServerEMail;

	@FlyField(name = "IsUseASP", description = "", help = "")
	@Column(name = "IsUseASP")
	private Boolean isUseASP;

	@FlyField(name = "Use Beta Functions", defaultValue = "Y", description = "Enable the use of Beta Functionality", help = "The exact scope of Beta Functionality is listed in the release note.  It is usually not recommended to enable Beta functionality in production environments.")
	@Column(name = "IsUseBetaFunctions")
	private Boolean isUseBetaFunctions;

	@FlyField(name = "LDAP Query", description = "", help = "")
	@Column(name = "LDAPQuery")
	private String lDAPQuery;

	@FlyField(name = "Material Policy", defaultValue = "F", description = "Material Movement Policy", help = "The Material Movement Policy determines how the stock is flowing (FiFo or LiFo) if a specific Product Instance was not selected.  The policy can not contradict the costing method (e.g. FiFo movement policy and LiFo costing method).")
	@Column(name = "MMPolicy")
	private MMPolicy mMPolicy;

	@FlyField(name = "Model Validation Classes", description = "List of data model validation classes separated by ;", help = "List of classes implementing the interface org.compiere.model.ModelValidator, separated by semicolon.\n"
			+ "The class is called for the client and allows to validate documents in the prepare stage and monitor model changes.")
	@Column(name = "ModelValidationClasses")
	private String modelValidationClasses;

	@FlyField(name = "Request EMail", description = "EMail address to send automated mails from or receive mails for automated processing (fully qualified)", help = "EMails for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. The address must be filly qualified (e.g. joe.smith@company.com) and should be a valid address.")
	@Column(name = "RequestEMail")
	private String requestEMail;

	@FlyField(name = "Request Folder", description = "EMail folder to process incoming emails; if empty INBOX is used", help = "Email folder used to read emails to process as requests, If left empty the default mailbox (INBOX) will be used. Requires IMAP services.")
	@Column(name = "RequestFolder")
	private String requestFolder;

	@FlyField(name = "Request User", description = "User Name (ID) of the email owner", help = "EMail user name for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. Required, if your mail server requires authentification as well as for processing incoming mails.")
	@Column(name = "RequestUser", length = 60)
	private String requestUser;

	@FlyField(name = "Request User Password", description = "Password of the user name (ID) for mail processing", help = "")
	@Column(name = "RequestUserPW", length = 20)
	private String requestUserPW;

	@FlyField(name = "Store Archive On File System", description = "", help = "")
	@Column(name = "StoreArchiveOnFileSystem")
	private Boolean storeArchiveOnFileSystem;

	@FlyField(name = "Store Attachments On File System", description = "", help = "")
	@Column(name = "StoreAttachmentsOnFileSystem")
	private Boolean storeAttachmentsOnFileSystem;

	@FlyField(name = "Unix Archive Path", description = "", help = "")
	@Column(name = "UnixArchivePath")
	private String unixArchivePath;

	@FlyField(name = "Unix Attachment Path", description = "", help = "")
	@Column(name = "UnixAttachmentPath")
	private String unixAttachmentPath;

	@FlyField(name = "Windows Archive Path", description = "", help = "")
	@Column(name = "WindowsArchivePath")
	private String windowsArchivePath;

	@FlyField(name = "Windows Attachment Path", description = "", help = "")
	@Column(name = "WindowsAttachmentPath")
	private String windowsAttachmentPath;

	@FlyField(name = "Language", description = "Language for this entity", help = "The Language identifies the language to use for display and formatting")
	@ManyToOne()
	private PLanguage language;

	@FlyField(name = "Replication Strategy")
	@ManyToOne()
	private PReplicationStrategy replicationStrategy;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public AutoArchive getAutoArchive() {
		return autoArchive;
	}

	public void setAutoArchive(AutoArchive autoArchive) {
		this.autoArchive = autoArchive;
	}

	public String getDocumentDir() {
		return documentDir;
	}

	public void setDocumentDir(String documentDir) {
		this.documentDir = documentDir;
	}

	public String geteMailTest() {
		return eMailTest;
	}

	public void seteMailTest(String eMailTest) {
		this.eMailTest = eMailTest;
	}

	public Boolean getIsMultiLingualDocument() {
		return isMultiLingualDocument;
	}

	public void setIsMultiLingualDocument(Boolean isMultiLingualDocument) {
		this.isMultiLingualDocument = isMultiLingualDocument;
	}

	public Boolean getIsPostImmediate() {
		return isPostImmediate;
	}

	public void setIsPostImmediate(Boolean isPostImmediate) {
		this.isPostImmediate = isPostImmediate;
	}

	public Boolean getIsServerEMail() {
		return isServerEMail;
	}

	public void setIsServerEMail(Boolean isServerEMail) {
		this.isServerEMail = isServerEMail;
	}

	public Boolean getIsUseASP() {
		return isUseASP;
	}

	public void setIsUseASP(Boolean isUseASP) {
		this.isUseASP = isUseASP;
	}

	public Boolean getIsUseBetaFunctions() {
		return isUseBetaFunctions;
	}

	public void setIsUseBetaFunctions(Boolean isUseBetaFunctions) {
		this.isUseBetaFunctions = isUseBetaFunctions;
	}

	public String getlDAPQuery() {
		return lDAPQuery;
	}

	public void setlDAPQuery(String lDAPQuery) {
		this.lDAPQuery = lDAPQuery;
	}

	public MMPolicy getmMPolicy() {
		return mMPolicy;
	}

	public void setmMPolicy(MMPolicy mMPolicy) {
		this.mMPolicy = mMPolicy;
	}

	public String getModelValidationClasses() {
		return modelValidationClasses;
	}

	public void setModelValidationClasses(String modelValidationClasses) {
		this.modelValidationClasses = modelValidationClasses;
	}

	public String getRequestEMail() {
		return requestEMail;
	}

	public void setRequestEMail(String requestEMail) {
		this.requestEMail = requestEMail;
	}

	public String getRequestFolder() {
		return requestFolder;
	}

	public void setRequestFolder(String requestFolder) {
		this.requestFolder = requestFolder;
	}

	public String getRequestUser() {
		return requestUser;
	}

	public void setRequestUser(String requestUser) {
		this.requestUser = requestUser;
	}

	public String getRequestUserPW() {
		return requestUserPW;
	}

	public void setRequestUserPW(String requestUserPW) {
		this.requestUserPW = requestUserPW;
	}

	public Boolean getStoreArchiveOnFileSystem() {
		return storeArchiveOnFileSystem;
	}

	public void setStoreArchiveOnFileSystem(Boolean storeArchiveOnFileSystem) {
		this.storeArchiveOnFileSystem = storeArchiveOnFileSystem;
	}

	public Boolean getStoreAttachmentsOnFileSystem() {
		return storeAttachmentsOnFileSystem;
	}

	public void setStoreAttachmentsOnFileSystem(Boolean storeAttachmentsOnFileSystem) {
		this.storeAttachmentsOnFileSystem = storeAttachmentsOnFileSystem;
	}

	public String getUnixArchivePath() {
		return unixArchivePath;
	}

	public void setUnixArchivePath(String unixArchivePath) {
		this.unixArchivePath = unixArchivePath;
	}

	public String getUnixAttachmentPath() {
		return unixAttachmentPath;
	}

	public void setUnixAttachmentPath(String unixAttachmentPath) {
		this.unixAttachmentPath = unixAttachmentPath;
	}

	public String getWindowsArchivePath() {
		return windowsArchivePath;
	}

	public void setWindowsArchivePath(String windowsArchivePath) {
		this.windowsArchivePath = windowsArchivePath;
	}

	public String getWindowsAttachmentPath() {
		return windowsAttachmentPath;
	}

	public void setWindowsAttachmentPath(String windowsAttachmentPath) {
		this.windowsAttachmentPath = windowsAttachmentPath;
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

	public Boolean getIsCostImmediate() {
		return isCostImmediate;
	}

	public void setIsCostImmediate(Boolean isCostImmediate) {
		this.isCostImmediate = isCostImmediate;
	}

	public PReplicationStrategy getReplicationStrategy() {
		return replicationStrategy;
	}

	public void setReplicationStrategy(PReplicationStrategy replicationStrategy) {
		this.replicationStrategy = replicationStrategy;
	}
}
