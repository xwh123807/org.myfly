package org.myfly.platform.core3.metadata.define;

import java.lang.reflect.Method;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 表字段定义信息 <br>
 * 1、结构同AD_Column<br>
 * 2、支持序列化、反序列化<br>
 * 
 * @author xiangwanhong
 *
 */
public class FlyFieldDefinition extends AbstractDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6259297911684388369L;

	private String name;

	private EntityType entityType;

	private String description;

	private String help;

	private String columnName;

	private String columnSQL;

	private FlyDataType dataType;

	private Integer fieldLength;

	private String defaultValue;

	private boolean isAllowCopy;

	private boolean isAllowLogging;

	private boolean isAlwaysUpdateable;

	private boolean isAutocomplete;

	private boolean isEncrypted;

	private boolean isParent;
	/**
	 * 是否必填
	 */
	private boolean isMandatory;

	private boolean isRange;

	private boolean isSelectionColumn;

	private boolean isSyncDatabase;

	private boolean isTranslated;

	private String valueMin;

	private String valueMax;

	private String vFormat;

	@JsonIgnore
	private Method getter;

	@JsonIgnore
	private Method setter;

	public FlyFieldDefinition() {

	}

	/**
	 * 从字段构造器中获取属性定义，从Builder逐一复制属性
	 * 
	 * @param builder
	 */
	public FlyFieldDefinition(FlyFieldDefinition builder) {
		setApiName(builder.getApiName());
		setName(builder.getName());
		setEntityType(builder.getEntityType());
		setDescription(builder.getDescription());
		setHelp(builder.getHelp());
		setColumnName(builder.getColumnName());
		setColumnSQL(builder.getColumnSQL());
		setDataType(builder.getDataType());
		setFieldLength(builder.getFieldLength());
		setDefaultValue(builder.getDefaultValue());
		setAllowCopy(builder.isAllowCopy());
		setAllowLogging(builder.isAllowLogging());
		setAlwaysUpdateable(builder.isAlwaysUpdateable());
		setAutocomplete(builder.isAutocomplete());
		setEncrypted(builder.isEncrypted());
		setParent(builder.isParent());
		setMandatory(builder.isMandatory());
		setRange(builder.isRange());
		setSelectionColumn(builder.isSelectionColumn());
		setSyncDatabase(builder.isSyncDatabase());
		setTranslated(builder.isTranslated());
		setValueMin(builder.getValueMin());
		setValueMax(builder.getValueMax());
		setvFormat(builder.getvFormat());
		setGetter(builder.getGetter());
		setSetter(builder.getSetter());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnSQL() {
		return columnSQL;
	}

	public void setColumnSQL(String columnSQL) {
		this.columnSQL = columnSQL;
	}

	public FlyDataType getDataType() {
		return dataType;
	}

	public void setDataType(FlyDataType dataType) {
		this.dataType = dataType;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public boolean isAllowCopy() {
		return isAllowCopy;
	}

	public void setAllowCopy(boolean isAllowCopy) {
		this.isAllowCopy = isAllowCopy;
	}

	public boolean isAllowLogging() {
		return isAllowLogging;
	}

	public void setAllowLogging(boolean isAllowLogging) {
		this.isAllowLogging = isAllowLogging;
	}

	public boolean isAlwaysUpdateable() {
		return isAlwaysUpdateable;
	}

	public void setAlwaysUpdateable(boolean isAlwaysUpdateable) {
		this.isAlwaysUpdateable = isAlwaysUpdateable;
	}

	public boolean isAutocomplete() {
		return isAutocomplete;
	}

	public void setAutocomplete(boolean isAutocomplete) {
		this.isAutocomplete = isAutocomplete;
	}

	public boolean isEncrypted() {
		return isEncrypted;
	}

	public void setEncrypted(boolean isEncrypted) {
		this.isEncrypted = isEncrypted;
	}

	public boolean isParent() {
		return isParent;
	}

	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}

	public boolean isRange() {
		return isRange;
	}

	public void setRange(boolean isRange) {
		this.isRange = isRange;
	}

	public boolean isSelectionColumn() {
		return isSelectionColumn;
	}

	public void setSelectionColumn(boolean isSelectionColumn) {
		this.isSelectionColumn = isSelectionColumn;
	}

	public boolean isSyncDatabase() {
		return isSyncDatabase;
	}

	public void setSyncDatabase(boolean isSyncDatabase) {
		this.isSyncDatabase = isSyncDatabase;
	}

	public boolean isTranslated() {
		return isTranslated;
	}

	public void setTranslated(boolean isTranslated) {
		this.isTranslated = isTranslated;
	}

	public String getValueMin() {
		return valueMin;
	}

	public void setValueMin(String valueMin) {
		this.valueMin = valueMin;
	}

	public String getValueMax() {
		return valueMax;
	}

	public void setValueMax(String valueMax) {
		this.valueMax = valueMax;
	}

	public String getvFormat() {
		return vFormat;
	}

	public void setvFormat(String vFormat) {
		this.vFormat = vFormat;
	}

	public Integer getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	public Method getGetter() {
		return getter;
	}

	public void setGetter(Method getter) {
		this.getter = getter;
	}

	public Method getSetter() {
		return setter;
	}

	public void setSetter(Method setter) {
		this.setter = setter;
	}

	@Override
	public String toString() {
		return "apiName: " + getApiName();
	}

	public boolean isMandatory() {
		return isMandatory;
	}

	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	/**
	 * 获取字段值读取类
	 * 
	 * @return
	 */
	@JsonIgnore
	public IValueHandler getValueHandler() {
		return ValueHandlerFactory.getValueHandler(this);
	}

	@Override
	public void validate() {
		Assert.hasLength(getApiName(), "属性[apiName]不能为空");
		Assert.hasLength(getName(), "字段[" + getApiName() + "]属性[name]不能为空");
		Assert.hasLength(getColumnName(), "字段[" + getApiName() + "]属性[columnName]不能为空");
		Assert.notNull(getEntityType(), "字段[" + getApiName() + "]属性[entityType]不能为空");
		Assert.notNull(getDataType(), "字段[" + getApiName() + "]属性[dataType]不能为空");
		Assert.isTrue(!FlyDataType.NONE.equals(getDataType()), "字段[" + getApiName() + "]属性[dataType]必须指定");
		Assert.notNull(getGetter(), "字段[" + getApiName() + "]属性[getter]不能为空");
		Assert.notNull(getSetter(), "字段[" + getApiName() + "]属性[setter]不能为空");
	}
}