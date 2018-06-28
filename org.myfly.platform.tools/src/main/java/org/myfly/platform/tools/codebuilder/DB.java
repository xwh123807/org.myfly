package org.myfly.platform.tools.codebuilder;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DB {
	private static DataSource dataSource;

	private static DataSource getDataSource() {
		if (dataSource == null) {
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName("org.postgresql.Driver");
			ds.setUrl("jdbc:postgresql://localhost:5432/eevolution");
			ds.setUsername("postgres");
			ds.setPassword("postgres");
			dataSource = ds;
		}
		return dataSource;
	}

	public static JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
