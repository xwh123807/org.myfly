package org.myfly.platform.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core.domain.DBType;
import org.myfly.platform.core.domain.SBaseEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldView;

/**
 * 数据库连接配置信息
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PM)
public class MDataSource extends SBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6567379098361434502L;
	@Column
	@FieldView(title = "数据库类型")
	private DBType dbType;
	@Column
	@FieldView(title = "连接串")
	private String url;
	@Column
	@FieldView(title = "用户名")
	private String username;
	@Column
	@FieldView(title = "密码")
	private String password;
	@Column
	@FieldView(title = "驱动类")
	private String driverClassName;
	@Column
	@FieldView(title="语言包")
	private String dialect;

	public DBType getDbType() {
		return dbType;
	}

	public void setDbType(DBType dbType) {
		this.dbType = dbType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getDialect() {
		return dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
