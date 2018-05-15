package org.myfly.platform.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.SQLOperator;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.system.domain.FlyEntity;

/**
 * 对象字段定义
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PM)
@MetaDataView(
//
tableView = @TableView(title = "字段", description = "字段信息") ,
//
listViews = @ListView(fields = { "name", "attrName", "fieldDataType", "length", "description", "active", "createdBy",
		"created" }, filters = { @FilterView(field = "attrName", operator = SQLOperator.EQUAL) }) ,
		//
		formViews = @FormView(sections = { @SectionView(title = "字段信息", fieldSets = {
				@FieldSetView(title = "基本信息", fields = { "name", "description", "attrName", "fieldName" }),
				@FieldSetView(title = "数据类型", fields = { "mustRequired", "fieldDataType", "length", "minLength",
						"precisionSize", "relationTable", "relationClassName", "enumName" }),
				@FieldSetView(title = "开发信息", fields = { "softApp", "softAppVersion", "stdField", "indexed",
						"enableTrace", "controlField" }),
				@FieldSetView(title = "审计", fields = { "active", "createdBy", "created", "updatedBy",
						"updated" }) }) }) )
// @Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="javaClassName")
public class MField extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8983666788038291589L;

	/**
	 * 关联表，用于在查找和主从表情况
	 */
	@FieldView(title = "关联表")
	@Column(length=50)
	private String relationTable;
	
	@FieldView(title = "关联字段")
	@Column(length=50)
	private String relationField;

	@FieldView(title = "表")
	@JoinColumn()
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private MTable table;

	/**
	 * 如果是实体类，则为实体的属性名称
	 */
	@FieldView(title = "属性名")
	@Column(length = 255, nullable = false)
	private String attrName;

	/**
	 * 数据库字段名称
	 */
	@FieldView(title = "字段名")
	@Column(length = 255, nullable = false)
	private String fieldName;

	/**
	 * 描述
	 */
	@FieldView(title = "描述")
	@Column(length = 1000)
	private String description;

	/**
	 * 来源软件包
	 */
	@FieldView(title = "来源软件包")
	@JoinColumn()
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private SoftApp softApp;
	/**
	 * 软件包版本
	 */
	@FieldView(title = "软件包版本")
	@Column(length = 10)
	private String softAppVersion;
	/**
	 * 字段数据类型
	 */
	@FieldView(title = "数据类型")
	@Column
	private FieldDataType fieldDataType;
	/**
	 * 已索引
	 */
	@FieldView(title = "已索引")
	@Column
	private Boolean indexed;
	/**
	 * 控制字段
	 */
	@FieldView(title = "控制字段")
	@JoinColumn(name = "controlField")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private MField controlField;
	/**
	 * 跟踪历史
	 */
	@FieldView(title = "跟踪历史")
	@Column
	private Boolean enableTrace;
	/**
	 * 是否为标准字段
	 */
	@FieldView(title = "标准字段")
	@Column
	private Boolean stdField;
	/**
	 * 字段长度
	 */
	@FieldView(title = "长度")
	@Column
	private Long length;
	/**
	 * 最小长度
	 */
	@FieldView(title = "最小长度")
	@Column
	private Long minLength;
	/**
	 * 精度
	 */
	@FieldView(title = "精度")
	@Column
	private Long precisionSize;
	/**
	 * 是否必须有值
	 */
	@FieldView(title = "不能为空")
	@Column
	private Boolean mustRequired;
	/**
	 * 如果是枚举类型时，存放枚举类名称
	 */
	@Column
	@FieldView(title = "枚举类", description = "是系统枚举类型时，存放枚举类名称")
	private String enumName;

	/**
	 * 关联表实体类
	 */
	@FieldView(title = "关联表实体类")
	@Column
	private String relationClassName;

	public MField() {
		setInternalTable("MField");
	}

	public MTable getTable() {
		return table;
	}

	public void setTable(MTable table) {
		this.table = table;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SoftApp getSoftApp() {
		return softApp;
	}

	public void setSoftApp(SoftApp softApp) {
		this.softApp = softApp;
	}

	public String getSoftAppVersion() {
		return softAppVersion;
	}

	public void setSoftAppVersion(String softAppVersion) {
		this.softAppVersion = softAppVersion;
	}

	public FieldDataType getFieldDataType() {
		return fieldDataType;
	}

	public void setFieldDataType(FieldDataType fieldDataType) {
		this.fieldDataType = fieldDataType;
	}

	public Boolean getIndexed() {
		return indexed;
	}

	public void setIndexed(Boolean indexed) {
		this.indexed = indexed;
	}

	public MField getControlField() {
		return controlField;
	}

	public void setControlField(MField controlField) {
		this.controlField = controlField;
	}

	public Boolean getEnableTrace() {
		return enableTrace;
	}

	public void setEnableTrace(Boolean enableTrace) {
		this.enableTrace = enableTrace;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getEnumName() {
		return enumName;
	}

	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}

	public Boolean getStdField() {
		return stdField;
	}

	public void setStdField(Boolean stdField) {
		this.stdField = stdField;
	}

	public String getRelationClassName() {
		return relationClassName;
	}

	public void setRelationClassName(String relationClassName) {
		this.relationClassName = relationClassName;
	}

	public Long getMinLength() {
		return minLength;
	}

	public void setMinLength(Long minLength) {
		this.minLength = minLength;
	}

	public Boolean getMustRequired() {
		return mustRequired;
	}

	public void setMustRequired(Boolean mustRequired) {
		this.mustRequired = mustRequired;
	}

	public Long getPrecisionSize() {
		return precisionSize;
	}

	public void setPrecisionSize(Long precisionSize) {
		this.precisionSize = precisionSize;
	}

	@Override
	public String toString() {
		return "uid: " + getUid() + ", name: " + getName() + ", attrName: " + getAttrName() + ", fieldName: "
				+ getFieldName() + ", dataType: " + getFieldDataType();
	}

	public String getRelationTable() {
		return relationTable;
	}

	public void setRelationTable(String relationTable) {
		this.relationTable = relationTable;
	}

	public String getRelationField() {
		return relationField;
	}

	public void setRelationField(String relationField) {
		this.relationField = relationField;
	}
}
