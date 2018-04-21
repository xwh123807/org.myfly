package org.myfly.platform.metadata.service;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.internal.DBMetadataRepository;
import org.myfly.platform.system.domain.MDataSource;

public class DBMetadataRepositoryForDerbyTest {
	@Test
	public void listTables() {
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForEmbedDerby();
		List<MTable> tables = repository.getTables(ds, false);
		Assert.assertNotNull(tables);
		Assert.assertTrue(!tables.isEmpty());
		tables.forEach(new Consumer<MTable>() {

			@Override
			public void accept(MTable table) {
				Assert.assertNotNull(table.getName());
				Map<String, MField> fields = repository.getFields(ds, table.getTableName());
				Assert.assertTrue(!fields.isEmpty());
			}
		});
	}

	@Test
	public void listTablesAndFields() {
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForEmbedDerby();
		List<MTable> tables = repository.getTables(ds, true);
		Assert.assertNotNull(tables);
		Assert.assertTrue(!tables.isEmpty());
		tables.forEach(new Consumer<MTable>() {

			@Override
			public void accept(MTable table) {
				Assert.assertNotNull(table.getName());
				Assert.assertTrue(!table.getFields().isEmpty());
				table.getFields().forEach(new Consumer<MField>() {

					@Override
					public void accept(MField field) {
						Assert.assertNotNull(field.getFieldName());
						Assert.assertNotNull(field.getTable());
					}
				});
			}
		});
	}

	@Test
	public void getTable() {
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForEmbedDerby();
		List<MTable> tables = repository.getTables(ds, false);
		Assert.assertNotNull(tables);
		Assert.assertTrue(!tables.isEmpty());
		tables.forEach(new Consumer<MTable>() {

			@Override
			public void accept(MTable table) {
				MTable table2 = repository.getTable(ds, table.getTableName());
				Assert.assertNotNull(table2);
				Assert.assertTrue(!table2.getFields().isEmpty());
			}

		});
	}

	@Test
	public void listEntityMetaDataForDerby() {
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForEmbedDerby();
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
	
	@Test
	public void sysTables(){
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForEmbedDerby();
		MTable table = repository.getTable(ds, "SYSTABLES");
		Assert.assertNotNull(table);
		Assert.assertNotNull(table.getPrimaryKeys());
	}
}
