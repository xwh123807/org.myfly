package org.myfly.platform.core3.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

/**
 * 引用表验证<br>
 * 1、与PReference表为OneToOne关系；<br>
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_Ref_Table")
@FlyTable(name = "Reference Table", description = "Reference Table Definitions")
public class PRefTable extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -512774934156628786L;

	@Id
	@Column(length = 32)
	private String referenceID;

	@Column(length = 32)
	private String entityTypeID;

	@Column(length = 32)
	private String tableID;

	@Column(length = 32)
	private String displayColumn;

	@Column(length = 32)
	private String keyColumn;

	@Column(length = 32)
	private String windowID;

	@Column(length = 2000)
	private String displaySQL;

	@Column
	private Boolean isAlert;

	@Column
	private Boolean isDisplayIdentifier;

	@Column
	private Boolean isValueDisplayed;

	@Column(length = 2000)
	private String orderByClause;

	@Column(length = 2000)
	private String whereClause;

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public String getEntityTypeID() {
		return entityTypeID;
	}

	public void setEntityTypeID(String entityTypeID) {
		this.entityTypeID = entityTypeID;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public String getDisplayColumn() {
		return displayColumn;
	}

	public void setDisplayColumn(String displayColumn) {
		this.displayColumn = displayColumn;
	}

	public String getKeyColumn() {
		return keyColumn;
	}

	public void setKeyColumn(String keyColumn) {
		this.keyColumn = keyColumn;
	}

	public String getWindowID() {
		return windowID;
	}

	public void setWindowID(String windowID) {
		this.windowID = windowID;
	}

	public String getDisplaySQL() {
		return displaySQL;
	}

	public void setDisplaySQL(String displaySQL) {
		this.displaySQL = displaySQL;
	}

	public Boolean getIsAlert() {
		return isAlert;
	}

	public void setIsAlert(Boolean isAlert) {
		this.isAlert = isAlert;
	}

	public Boolean getIsDisplayIdentifier() {
		return isDisplayIdentifier;
	}

	public void setIsDisplayIdentifier(Boolean isDisplayIdentifier) {
		this.isDisplayIdentifier = isDisplayIdentifier;
	}

	public Boolean getIsValueDisplayed() {
		return isValueDisplayed;
	}

	public void setIsValueDisplayed(Boolean isValueDisplayed) {
		this.isValueDisplayed = isValueDisplayed;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}
}
