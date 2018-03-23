package org.myfly.platform.system.stdtest.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.SBaseEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.metadata.define.SectionType;

/**
 * 内建实体测试子表，包含所有的数据类型
 * 
 * @author xiangwanhong
 *
 */

@Entity
@Table(schema = SchemaConstants.PT, name = "std_test_table_suba")
@MetaDataView(
// table
tableView = @TableView(title = "基准测试子表", description = "用于性能时") ,
//
listViews = @ListView(fields = { "name", "stringField", "longField", "bigDecimalField", "sqlDateField", "dataType",
		"active", "createdBy", "createdBy.email" }, serverSideMode = true) ,
		//
		formViews = @FormView(sections = {
				@SectionView(title = "主表区域", fieldSets = {
						@FieldSetView(title = "基本信息", fields = { "name", "stringField" }),
						@FieldSetView(title = "扩展信息", fields = { "longField", "bigDecimalField", "sqlDateField",
								"dataType" }) }),
				@SectionView(title = "审计区域", fieldSets = { @FieldSetView(title = "审计信息", fields = { "active", "created",
						"createdBy", "createdBy.email", "updated", "updatedBy", "updatedBy.email" }) }),
				@SectionView(type = SectionType.NOTE), @SectionView(type = SectionType.ATTACHMENT) }) )
public class StdTestTableSubA extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1714447364148096333L;

	@JoinColumn()
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private StdTestTable stdTestTable;

	@Column
	@FieldView(title = "字符串")
	private String stringField;

	@Column(length = 50)
	@FieldView(title = "短字符串")
	private String smallText;

	@Column(length = 1000)
	@FieldView(title = "长字符串")
	private String longText;

	@Column
	@FieldView(title = "长整形")
	private Long longField;

	@Column()
	@FieldView(title = "双字节浮点数")
	private Double doubleField;

	@Column
	@FieldView(title = "浮点数")
	private Float floatField;

	@Column
	@FieldView(title = "整形")
	private Integer integerField;

	@Column
	@FieldView(title = "字符串")
	private BigDecimal bigDecimalField;

	@Column
	@FieldView(title = "超大数值")
	private BigInteger bigIntegerField;

	@Column
	@FieldView(title = "时间")
	private Date dateField;

	@Column
	@FieldView(title = "日期")
	private java.sql.Date sqlDateField;

	@Column
	@FieldView(title = "时间")
	private java.sql.Time sqlTimeField;

	@Column
	@FieldView(title = "日期/时间")
	private java.sql.Timestamp sqlTimestampField;

	// @Column
	// @FieldView(title = "时间")
	// private Calendar calendarFieldField;

	@Column
	@Enumerated(EnumType.STRING)
	@FieldView(title = "字段类型")
	private FieldDataType dataType;

	public StdTestTableSubA() {
		setInternalTable("StdTestTableDetail");
	}

	public StdTestTable getStdTestTable() {
		return stdTestTable;
	}

	public void setStdTestTable(StdTestTable stdTestTable) {
		this.stdTestTable = stdTestTable;
	}

	public String getStringField() {
		return stringField;
	}

	public void setStringField(String stringField) {
		this.stringField = stringField;
	}

	public String getLongText() {
		return longText;
	}

	public void setLongText(String longText) {
		this.longText = longText;
	}

	public Long getLongField() {
		return longField;
	}

	public void setLongField(Long longField) {
		this.longField = longField;
	}

	public Double getDoubleField() {
		return doubleField;
	}

	public void setDoubleField(Double doubleField) {
		this.doubleField = doubleField;
	}

	public Float getFloatField() {
		return floatField;
	}

	public void setFloatField(Float floatField) {
		this.floatField = floatField;
	}

	public Integer getIntegerField() {
		return integerField;
	}

	public void setIntegerField(Integer integerField) {
		this.integerField = integerField;
	}

	public BigDecimal getBigDecimalField() {
		return bigDecimalField;
	}

	public void setBigDecimalField(BigDecimal bigDecimalField) {
		this.bigDecimalField = bigDecimalField;
	}

	public BigInteger getBigIntegerField() {
		return bigIntegerField;
	}

	public void setBigIntegerField(BigInteger bigIntegerField) {
		this.bigIntegerField = bigIntegerField;
	}

	public Date getDateField() {
		return dateField;
	}

	public void setDateField(Date dateField) {
		this.dateField = dateField;
	}

	public java.sql.Date getSqlDateField() {
		return sqlDateField;
	}

	public void setSqlDateField(java.sql.Date sqlDateField) {
		this.sqlDateField = sqlDateField;
	}

	public java.sql.Time getSqlTimeField() {
		return sqlTimeField;
	}

	public void setSqlTimeField(java.sql.Time sqlTimeField) {
		this.sqlTimeField = sqlTimeField;
	}

	public java.sql.Timestamp getSqlTimestampField() {
		return sqlTimestampField;
	}

	public void setSqlTimestampField(java.sql.Timestamp sqlTimestampField) {
		this.sqlTimestampField = sqlTimestampField;
	}

	public FieldDataType getDataType() {
		return dataType;
	}

	public void setDataType(FieldDataType dataType) {
		this.dataType = dataType;
	}

	public String getSmallText() {
		return smallText;
	}

	public void setSmallText(String smallText) {
		this.smallText = smallText;
	}
}
