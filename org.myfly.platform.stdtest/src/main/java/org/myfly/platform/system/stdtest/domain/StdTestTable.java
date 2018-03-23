package org.myfly.platform.system.stdtest.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.SBaseEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.SubTableView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.metadata.define.ListStyle;
import org.myfly.platform.core.metadata.define.SQLOperator;
import org.myfly.platform.core.metadata.define.SectionType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 内建实体测试表，包含所有的数据类型
 * 
 * @author xiangwanhong
 *
 */

@Entity
@Table(schema = SchemaConstants.PT, indexes = { @javax.persistence.Index(unique = false, columnList = "name") })
@MetaDataView(
//
tableView = @TableView(title = "基准测试主表", description = "用于性能时") ,
//
listViews = { @ListView(name = "default", fields = { "name", "stringField", "longField", "bigDecimalField",
		"sqlDateField", "dataType", "createdBy", "createdBy.email" }, filters = {
				@FilterView(field = "stringField", operator = SQLOperator.LIKE),
				@FilterView(field = "smallText", operator = SQLOperator.EQUAL) }, listStyle = ListStyle.CARDLIST),
		//
		@ListView(name = "表格", fields = { "name", "stringField", "longField", "bigDecimalField", "sqlDateField",
				"dataType", "createdBy", "createdBy.email" }, filters = {
						@FilterView(field = "stringField", operator = SQLOperator.LIKE),
						@FilterView(field = "smallText", operator = SQLOperator.EQUAL),
						@FilterView(field = "dataType", operator = SQLOperator.EQUAL) }, listStyle = ListStyle.TABLE) },
						//
						formViews = {
								@FormView(name = "default", sections = {
										@SectionView(title = "主表区域", fieldSets = {
												@FieldSetView(title = "字符字段", fields = { "name", "dataType", "longText",
														"smallText", "stringField" }),
												@FieldSetView(title = "数值字段", fields = { "bigDecimalField",
														"bigIntegerField", "doubleField", "floatField", "integerField",
														"longField", }),
										@FieldSetView(title = "日期/时间", fields = { "dateField", "sqlDateField",
												"sqlTimeField", "sqlTimestampField" }) }),
								@SectionView(title = "审计区域", fieldSets = { @FieldSetView(title = "审计信息", fields = {
										"active", "created", "createdBy", "createdBy.email", "updated", "updatedBy",
										"updatedBy.email", "tenant" }) }),
								@SectionView(title = "子表区域", subTables = {
										@SubTableView(tableAttr = "details", listStyle = ListStyle.TABLE),
										@SubTableView(tableAttr = "subs", listStyle = ListStyle.CARDLIST) }),
								@SectionView(type = SectionType.NOTE), @SectionView(type = SectionType.ATTACHMENT) }),
								//
								@FormView(name = "表格", sections = {
										@SectionView(title = "主表区域", fieldSets = {
												@FieldSetView(title = "字符字段", fields = { "name", "dataType", "longText",
														"smallText", "stringField", "bigDecimalField",
														"bigIntegerField" }),
												@FieldSetView(title = "数值字段", fields = { "doubleField", "floatField",
														"integerField", "longField", "dateField", "sqlDateField",
														"sqlTimeField", "sqlTimestampField" }) }),
										@SectionView(title = "审计区域", fieldSets = {
												@FieldSetView(title = "审计信息", fields = { "active", "created",
														"createdBy", "createdBy.email", "updated", "updatedBy",
														"updatedBy.email", "tenant" }) }),
										@SectionView(title = "子表区域", subTables = {
												@SubTableView(tableAttr = "details", title = "明细记录", listStyle = ListStyle.TABLE),
												@SubTableView(tableAttr = "subs", title = "子表二", listStyle = ListStyle.TABLE) }),
										@SectionView(type = SectionType.NOTE),
										@SectionView(type = SectionType.ATTACHMENT)

		}) })
//@Indexed(index = "StdTestTable")
public class StdTestTable extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1714447364148096333L;

	@Column
	@FieldView(title = "字符串")
//	@Field(index = Index.YES, store = Store.NO)
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

	@Column(precision = 20, scale = 2)
	@FieldView(title = "双字节浮点数")
	private Double doubleField;

	@Column(precision = 20, scale = 4)
	@FieldView(title = "浮点数")
	private Float floatField;

	@Column
	@FieldView(title = "整形")
	private Integer integerField;

	@Column(precision = 20, scale = 6)
	@FieldView(title = "超大数值")
	private BigDecimal bigDecimalField;

	@Column
	@FieldView(title = "超大整形")
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

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "stdTestTable")
	@FieldView(title = "明细记录", description = "明细记录")
	@OrderBy("updated ASC")
	private Set<StdTestTableSubA> details;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "stdTestTable")
	@FieldView(title = "明细记录二", description = "明细记录二")
	@OrderBy("updated ASC")
	private Set<StdTestTableSubB> subs;

	public StdTestTable() {
		setInternalTable("StdTestTable");
	}

	@Transient
//	@Field(index = Index.YES, store = Store.NO)
	@JsonIgnore
	public String getFullText() {
		return getName() + " " + getStringField();
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

	// public Calendar getCalendarFieldField() {
	// return calendarFieldField;
	// }
	//
	// public void setCalendarFieldField(Calendar calendarFieldField) {
	// this.calendarFieldField = calendarFieldField;
	// }

	public FieldDataType getDataType() {
		return dataType;
	}

	public void setDataType(FieldDataType dataType) {
		this.dataType = dataType;
	}

	public Set<StdTestTableSubA> getDetails() {
		return details;
	}

	public void setDetails(Set<StdTestTableSubA> details) {
		this.details = details;
	}

	public String getSmallText() {
		return smallText;
	}

	public void setSmallText(String smallText) {
		this.smallText = smallText;
	}

	public Set<StdTestTableSubB> getSubs() {
		return subs;
	}

	public void setSubs(Set<StdTestTableSubB> subs) {
		this.subs = subs;
	}

}
