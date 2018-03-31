package org.myfly.platform.metadata.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SBaseEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldView;

/**
 * 索引定义
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PM)
public class MIndex extends SBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5017842610040841487L;
	@Column
	@FieldView(title = "字段")
	private String columnNames;
	@FieldView(title = "表")
	@JoinColumn()
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private MTable table;
	@Column
	@FieldView(title = "是否唯一")
	private boolean uniqued;

	public String getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(String columnNames) {
		this.columnNames = columnNames;
	}

	public MTable getTable() {
		return table;
	}

	public void setTable(MTable table) {
		this.table = table;
	}

	@Override
	public String toString() {
		return super.toString() + ", uniqued: " + isUniqued() + ", columnNames: " + getColumnNames();
	}

	public boolean isUniqued() {
		return uniqued;
	}

	public void setUniqued(boolean uniqued) {
		this.uniqued = uniqued;
	}
}
