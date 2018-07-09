package org.myfly.platform.core3.model.security;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

/**
 * 
 * @author xiangwanhong
 *
 */
@Table(name = "PT_Client", uniqueConstraints = @UniqueConstraint(columnNames = "clientID"))
@Entity
@FlyTable(name = "Client", description = "Client/Tenant for this installation.")
@FlyRefTable(apiName = "clientID", name = "PClient ID", keyColumn = "clientID", displayColumn = "name")
public class PClient implements IFlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8452625601049940882L;

	@Id
	@Column(length = 32, name="ClientID")
	private String clientID;

	@Column
	private Timestamp created;

	@Column(length = 32)
	private String createdBy;

	@Column
	private Timestamp updated;

	@Column(length = 32)
	private String updatedBy;

	@Column
	private Boolean isActive;

	@Column(length = 32)
	private String orgID;

	@Column(name = "Value", length = 40, unique = true)
	private String value;

	@Column(length = 60)
	private String name;

	@Column(length = 255)
	private String description;

	@Column(name = "AutoArchive")
	private AutoArchive autoArchive;

	@Column(name = "DocumentDir")
	private String documentDir;

	@Column(name = "EMailTest", length = 1)
	private String eMailTest;

	@Column(name = "IsCostImmediate")
	private Boolean isCostImmediate;

	@Column(name = "IsMultiLingualDocument")
	private Boolean isMultiLingualDocument;

	@Column(name = "IsPostImmediate")
	private Boolean isPostImmediate;

	@Column(name = "IsServerEMail")
	private Boolean isServerEMail;

	@Column(name = "IsUseASP")
	private Boolean isUseASP;

	@Column(name = "IsUseBetaFunctions")
	private Boolean isUseBetaFunctions;

	@Column(name = "LDAPQuery")
	private String lDAPQuery;

	@Column(name = "MMPolicy")
	private MMPolicy mMPolicy;

	@Column(name = "ModelValidationClasses")
	private String modelValidationClasses;

	@Column(name = "RequestEMail")
	private String requestEMail;

	@Column(name = "RequestFolder")
	private String requestFolder;

	@Column(name = "RequestUser", length = 60)
	private String requestUser;

	@Column(name = "RequestUserPW", length = 20)
	private String requestUserPW;

	@Column(name = "StoreArchiveOnFileSystem")
	private Boolean storeArchiveOnFileSystem;

	@Column(name = "StoreAttachmentsOnFileSystem")
	private Boolean storeAttachmentsOnFileSystem;

	@Column(name = "UnixArchivePath")
	private String unixArchivePath;

	@Column(name = "UnixAttachmentPath")
	private String unixAttachmentPath;

	@Column(name = "WindowsArchivePath")
	private String windowsArchivePath;

	@Column(name = "WindowsAttachmentPath")
	private String windowsAttachmentPath;

	@Column(length = 32)
	private String languageID;

	@Column(length = 32)
	private String replicationStrategyID;

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

	public String getLanguageID() {
		return languageID;
	}

	public void setLanguageID(String languageID) {
		this.languageID = languageID;
	}

	public String getReplicationStrategyID() {
		return replicationStrategyID;
	}

	public void setReplicationStrategyID(String replicationStrategyID) {
		this.replicationStrategyID = replicationStrategyID;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getOrgID() {
		return orgID;
	}

	public void setOrgID(String orgID) {
		this.orgID = orgID;
	}
}
