package org.myfly.platform.core3.metadata.define;

import java.util.Map;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.model.data.AccessLevel;
import org.springframework.util.Assert;

/**
 * 表定义信息 <br>
 * 1、结构同AD_Table;<br>
 * 2、支持序列化和反序列化；<br>
 * 
 * @author xiangwanhong
 *
 */
public class FlyTableDefinition extends AbstractDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4759627026349305119L;

	private String name;

	private String tableName;

	private EntityType entityType;

	private String description;

	private String help;

	private AccessLevel accessLevel;

	private boolean isHighVolume;

	private boolean isChangeLog;

	private boolean isIgnoreMigration;

	private boolean isDocument;

	private boolean isSecurityEnabled;

	private boolean isDeleteable;

	private boolean isView;

	private boolean isCentrallyMaintained;
	/**
	 * 表属性map，Key为属性名称
	 */
	private Map<String, FlyFieldDefinition> flyFields;

	public FlyTableDefinition() {
	}

	/**
	 * 从Builder中构建表定义信息，从builder逐一复制属性
	 * 
	 * @param builder
	 */
	public FlyTableDefinition(FlyTableDefinition builder) {
		setApiName(builder.getApiName());
		setName(builder.getName());
		setTableName(builder.getTableName());
		setEntityType(builder.getEntityType());
		setDescription(builder.getDescription());
		setHelp(builder.getHelp());
		setAccessLevel(builder.getAccessLevel());
		setHighVolume(builder.isHighVolume());
		setChangeLog(builder.isChangeLog());
		setIgnoreMigration(builder.isIgnoreMigration());
		setDocument(builder.isDocument());
		setSecurityEnabled(builder.isSecurityEnabled());
		setDeleteable(builder.isDeleteable());
		setView(builder.isView());
		setCentrallyMaintained(builder.isCentrallyMaintained());
		setFlyFields(builder.getFlyFields());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Map<String, FlyFieldDefinition> getFlyFields() {
		return flyFields;
	}

	public void setFlyFields(Map<String, FlyFieldDefinition> flyFields) {
		this.flyFields = flyFields;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public AccessLevel getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(AccessLevel accessLevel) {
		this.accessLevel = accessLevel;
	}

	public boolean isHighVolume() {
		return isHighVolume;
	}

	public void setHighVolume(boolean isHighVolume) {
		this.isHighVolume = isHighVolume;
	}

	public boolean isChangeLog() {
		return isChangeLog;
	}

	public void setChangeLog(boolean isChangeLog) {
		this.isChangeLog = isChangeLog;
	}

	public boolean isIgnoreMigration() {
		return isIgnoreMigration;
	}

	public void setIgnoreMigration(boolean isIgnoreMigration) {
		this.isIgnoreMigration = isIgnoreMigration;
	}

	public boolean isDocument() {
		return isDocument;
	}

	public void setDocument(boolean isDocument) {
		this.isDocument = isDocument;
	}

	public boolean isSecurityEnabled() {
		return isSecurityEnabled;
	}

	public void setSecurityEnabled(boolean isSecurityEnabled) {
		this.isSecurityEnabled = isSecurityEnabled;
	}

	public boolean isDeleteable() {
		return isDeleteable;
	}

	public void setDeleteable(boolean isDeleteable) {
		this.isDeleteable = isDeleteable;
	}

	public boolean isView() {
		return isView;
	}

	public void setView(boolean isView) {
		this.isView = isView;
	}

	public boolean isCentrallyMaintained() {
		return isCentrallyMaintained;
	}

	public void setCentrallyMaintained(boolean isCentrallyMaintained) {
		this.isCentrallyMaintained = isCentrallyMaintained;
	}

	@Override
	public String toString() {
		return "apiName: " + getApiName();
	}

	@Override
	public void validate() {
		Assert.hasLength(getApiName(), "属性[apiName]不能为空");
		Assert.hasLength(getName(), "实体[" + getApiName() + "]属性[name]不能为空");
		Assert.hasLength(getTableName(), "实体[" + getApiName() + "]属性[tableName]不能为空");
		Assert.notEmpty(getFlyFields(), "实体[" + getApiName() + "]属性[fields]不能为空，且长度不能小于1");
		getFlyFields().values().forEach(field -> field.validate());
	}
}
