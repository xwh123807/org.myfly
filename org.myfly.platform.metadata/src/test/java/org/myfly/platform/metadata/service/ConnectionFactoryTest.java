package org.myfly.platform.metadata.service;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.system.core.domain.MDataSource;
import org.myfly.platform.system.data.internal.ConnectionFactory;

public class ConnectionFactoryTest {
	
	@Test
	public void getDataSourceForDerby() throws Exception{
		MDataSource ds = TestUtil.getDataSourceForEmbedDerby();
		
		DataSource dataSource = ConnectionFactory.getDataSource(ds);
		Assert.assertNotNull(dataSource);
		Connection con = ConnectionFactory.getConnection(ds);
		Assert.assertNotNull(con);
		con.close();
	}
	
}
