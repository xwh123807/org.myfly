package org.myfly.platform.metadata.service;

import java.util.List;
import java.util.function.Consumer;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.internal.EntityMetaData;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.internal.DBMetadataRepository;
import org.myfly.platform.system.domain.MDataSource;

public class DBMetadataRepositoryForOracleXeTest {
	@Test
	public void listEntityMetaDataForOracle() {
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForOracle();
		List<MTable> tables = repository.getTables(ds, false);
		Assert.assertNotNull(tables);
		Assert.assertTrue(!tables.isEmpty());
		tables.forEach(new Consumer<MTable>() {

			@Override
			public void accept(MTable table) {
				EntityMetaData meta = repository.getTableEntityMetaData(ds, table.getTableName());
				meta.validate();
			}
		});
	}
}
