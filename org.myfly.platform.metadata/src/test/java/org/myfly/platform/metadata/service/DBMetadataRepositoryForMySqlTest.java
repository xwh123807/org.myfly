package org.myfly.platform.metadata.service;

import java.util.List;
import java.util.function.Consumer;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.define.FKFieldDefinition;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.internal.EntityMetaData;
import org.myfly.platform.core.metadata.internal.JsonEntityMetaData;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.internal.DBMetadataRepository;
import org.myfly.platform.system.domain.MDataSource;

public class DBMetadataRepositoryForMySqlTest {
	@Test
	public void listEntityMetaDataForMySql() {
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForMySql();
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
	public void stdTestTable(){
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForMySql();
		EntityMetaData metaData = repository.getTableEntityMetaData(ds, "std_test_table");
		Assert.assertNotNull(metaData);
		Assert.assertNotNull(metaData.getTableDefinition().getCatalog());
		
		JsonEntityMetaData jsonMeta = new JsonEntityMetaData(metaData);
		System.out.println(jsonMeta.toJson());
		
		Assert.assertEquals(3, metaData.getFkFieldDefinitions().size());
		//校验查找关系
		FKFieldDefinition createdByFK =  metaData.getFkFieldDefinitions().get("created_by_uid");
		Assert.assertNotNull(createdByFK);
		Assert.assertEquals("created_by_uid", createdByFK.getField());
		Assert.assertEquals(new String[]{"created_by_uid"}, createdByFK.getFkFields());
		Assert.assertEquals(new String[]{"uid"}, createdByFK.getRelationFields());
		Assert.assertEquals("suser", createdByFK.getRelationTable());
		
		FKFieldDefinition updatedByFK =  metaData.getFkFieldDefinitions().get("updated_by_uid");
		Assert.assertNotNull(updatedByFK);
		Assert.assertEquals("updated_by_uid", updatedByFK.getField());
		Assert.assertEquals(new String[]{"updated_by_uid"}, updatedByFK.getFkFields());
		Assert.assertEquals(new String[]{"uid"}, updatedByFK.getRelationFields());
		Assert.assertEquals("suser", updatedByFK.getRelationTable());
		
		FKFieldDefinition tenantFK =  metaData.getFkFieldDefinitions().get("tenant_uid");
		Assert.assertNotNull(tenantFK);
		Assert.assertEquals("tenant_uid", tenantFK.getField());
		Assert.assertEquals(new String[]{"tenant_uid"}, tenantFK.getFkFields());
		Assert.assertEquals(new String[]{"uid"}, tenantFK.getRelationFields());
		Assert.assertEquals("tenant", tenantFK.getRelationTable());
		
		FieldDefinition suba = metaData.getFieldMap().get("sub_std_test_table_suba");
		Assert.assertNotNull(suba);
		Assert.assertEquals("std_test_table_suba", suba.getRelationTable());
		//Assert.assertEquals("std_test_table_uid", suba.getRelationField());
	}
	
	@Test
	public void customer(){
		DBMetadataRepository repository = new DBMetadataRepository();
		MDataSource ds = TestUtil.getDataSourceForMySql();
		EntityMetaData metaData = repository.getTableEntityMetaData(ds, "customer");
		Assert.assertNotNull(metaData);
		
		JsonEntityMetaData jsonMeta = new JsonEntityMetaData(metaData);
		System.out.println(jsonMeta.toJson());
		
		//校验查找关系
		FKFieldDefinition districtFK = metaData.getFkFieldDefinitions().get("district");
		Assert.assertNotNull(districtFK);
		Assert.assertEquals("district", districtFK.getField());
		Assert.assertEquals("district", districtFK.getRelationTable());
		Assert.assertArrayEquals(new String[]{"did", "wid"}, districtFK.getFkFields());
		Assert.assertArrayEquals(new String[]{"did", "wid"}, districtFK.getRelationFields());
		FieldDefinition districtField = metaData.getFieldMap().get(districtFK.getField());
		Assert.assertNotNull(districtField);
		Assert.assertEquals(FieldDataType.FLYSEARCHRELATION, districtField.getDataType());
	}
}
