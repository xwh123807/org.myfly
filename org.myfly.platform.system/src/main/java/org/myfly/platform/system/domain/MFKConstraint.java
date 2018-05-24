package org.myfly.platform.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldView;

/**
 * 外键
 * 
 * @author xiangwanhong
 *
 */
@Table(schema = SchemaConstants.PM)
@Entity
public class MFKConstraint extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6829567567154883194L;

	/**
	 * 表
	 */
	@FieldView(title = "表")
	@JoinColumn()
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private MTable pkTable;
	@Column
	@FieldView(title = "属性名")
	private String pkAttrName;
	/**
	 * 字段
	 */
	@Column
	@FieldView(title = "字段")
	private String pkColumnNames;
	@Column
	@FieldView(title = "关联数据库")
	private String fkTableCat;
	@Column
	@FieldView(title = "关联方案")
	private String fkTableSchema;
	@Column
	@FieldView(title = "关联表")
	private String fkTableName;
	@Column
	@FieldView(title = "关联字段")
	private String fkColumnNames;
	public MTable getPkTable() {
		return pkTable;
	}
	public void setPkTable(MTable pkTable) {
		this.pkTable = pkTable;
	}
	public String getPkColumnNames() {
		return pkColumnNames;
	}
	public void setPkColumnNames(String pkColumnNames) {
		this.pkColumnNames = pkColumnNames;
	}
	public String getFkTableCat() {
		return fkTableCat;
	}
	public void setFkTableCat(String fkTableCat) {
		this.fkTableCat = fkTableCat;
	}
	public String getFkTableSchema() {
		return fkTableSchema;
	}
	public void setFkTableSchema(String fkTableSchema) {
		this.fkTableSchema = fkTableSchema;
	}
	public String getFkColumnNames() {
		return fkColumnNames;
	}
	public void setFkColumnNames(String fkColumnNames) {
		this.fkColumnNames = fkColumnNames;
	}
	public String getFkTableName() {
		return fkTableName;
	}
	public void setFkTableName(String fkTableName) {
		this.fkTableName = fkTableName;
	}
	
	@Override
	public String toString() {
		return getPkColumnNames() + " on " + getFkTableName() + "(" + getFkColumnNames() +")";
	}
	public String getPkAttrName() {
		return pkAttrName;
	}
	public void setPkAttrName(String pkAttrName) {
		this.pkAttrName = pkAttrName;
	}
}
