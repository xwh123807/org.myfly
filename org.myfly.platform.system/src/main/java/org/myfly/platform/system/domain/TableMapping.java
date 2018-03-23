package org.myfly.platform.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalId;
import org.myfly.platform.core.domain.SKeyEntity;
import org.myfly.platform.core.domain.SchemaConstants;

/**
 * 表和实体对应关系，用于知道数据库表名，查找Hibernate Entity名称
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema=SchemaConstants.PB)
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TableMapping extends SKeyEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -964435141653057577L;
	/**
	 * 数据库表名
	 */
	@NaturalId
	@Column(length=50)
	private String tableName;
	/**
	 * 对应hibernate实体名
	 */
	@Column(length=50)
	private String entityName;
	/**
	 * 对应实体类名
	 */
	@Column(length=255)
	private String className;
	/**
	 * 表所属schema
	 */
	@Column(length=50)
	private String schemaName;
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
}
