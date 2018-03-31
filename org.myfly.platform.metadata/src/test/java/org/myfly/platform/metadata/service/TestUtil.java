package org.myfly.platform.metadata.service;

import org.myfly.platform.core.domain.DBType;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.domain.MDataSource;

public class TestUtil {
	
	public static MDataSource getDataSourceForEmbedDerby() {
		MDataSource ds = new MDataSource();
		ds.setUid(UUIDUtil.newUUID());
		ds.setDbType(DBType.DERBY_EMBEDDED);
		ds.setUrl("jdbc:derby:memory:myfly;create=true");
		ds.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
		ds.setDialect("org.hibernate.dialect.DerbyDialect");
		ds.setUsername("sa");
		ds.setPassword("sa");
		return ds;
	}
	
	public static MDataSource getDataSourceForMySql(){
		MDataSource ds = new MDataSource();
		ds.setUid(UUIDUtil.newUUID());
		ds.setDbType(DBType.MYSQL);
		ds.setUrl("jdbc:mysql://192.168.99.100/myfly");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setDialect("org.hibernate.dialect.MySQLDialect");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
	}

	public static MDataSource getDataSourceForOracle() {
		MDataSource ds = new MDataSource();
		ds.setUid(UUIDUtil.newUUID());
		ds.setDbType(DBType.ORACLE);
		ds.setUrl("jdbc:oracle:thin:@10.51.102.10:1521:TY_DEMO");
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setDialect("org.hibernate.dialect.Oracle10gDialect");
		ds.setUsername("FMIS0300");
		ds.setPassword("FMIS0300");
		return ds;
	}
	
	public static MDataSource getDataSourceForOracleXE() {
		MDataSource ds = new MDataSource();
		ds.setUid(UUIDUtil.newUUID());
		ds.setDbType(DBType.ORACLE);
		ds.setUrl("jdbc:oracle:thin:@192.168.99.100:1521:xe");
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setDialect("org.hibernate.dialect.Oracle10gDialect");
		ds.setUsername("system");
		ds.setPassword("oracle");
		return ds;
	}
}
