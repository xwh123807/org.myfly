package org.myfly.platform.core.metadata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.define.FieldSetDefinition;
import org.myfly.platform.core.metadata.define.FormDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.define.SectionDefinition;
import org.myfly.platform.core.metadata.define.SubTableDefinition;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.user.domain.SUser;
import org.myfly.platform.system.domain.AccessLog;
import org.myfly.platform.system.domain.DataImportLog;
import org.myfly.platform.system.domain.TableMapping;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.stdtest.domain.StdTestTableSubA;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class EntityMetaServiceTest extends ServiceTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaService;
	
	@Test
	public void getAllEntityClasses(){
		List<Class<?>> list = entityMetaService.getAllEntityClasses();
		Assert.assertTrue(list.size() > 0);
	}

	@Test
	public void getEntityClassByEntityName() {
		Class<?> entity = entityMetaService.getEntityClass("stdtesttable");
		Assert.assertNotNull(entity);
		entity = entityMetaService.getEntityClass("StdTestTable");
		Assert.assertNotNull(entity);
	}

	@Test
	public void getEntityClassByEntityClassName() {
		Class<?> entity = entityMetaService.getEntityClass(StdTestTable.class.getName());
		Assert.assertNotNull(entity);
	}

	@Test
	public void getEntityMetaDataForStdTestTable() {
		String entityName = "stdtesttable";
		EntityMetaData meta = entityMetaService.getEntityMetaData(entityName);
		Assert.assertNotNull(meta);
		Assert.assertNotNull(meta.getTableDefinition());
		Assert.assertEquals("PT.STD_TEST_TABLE", meta.getTableDefinition().getTableName());
		Assert.assertEquals(StdTestTable.class, meta.getEntityClass());
		Assert.assertNotNull(meta.getFieldMap().size() > 0);
		Assert.assertTrue(meta.getFormDefinition(null).getSections().length > 0);
	}

	@Test
	public void getEntityMetaDataForStdTestTableDetail() {
		EntityMetaData meta = entityMetaService.getEntityMetaData(StdTestTableSubA.class.getName());
		Assert.assertNotNull(meta);
	}

	@Test
	public void getEntityMetaDataForSAccessLog() {
		EntityMetaData meta = entityMetaService.getEntityMetaData(AccessLog.class.getName());
		Assert.assertNotNull(meta);
	}

	@Test
	public void getEntityMetaDataForSUser() {
		EntityMetaData meta = entityMetaService.getEntityMetaData(SUser.class.getName());
		Assert.assertNotNull(meta);
	}

	@Test
	public void getEntityMetaDataForSTableMapping() {
		EntityMetaData meta = entityMetaService.getEntityMetaData(TableMapping.class.getName());
		Assert.assertNotNull(meta);
	}
	
	@Test
	public void getEntityMetaDataForSDataImportLog(){
		EntityMetaData meta = entityMetaService.getEntityMetaData(DataImportLog.class.getName());
		ListDefinition listDefinition = meta.getListDefinition(null);
		Assert.assertEquals("default", listDefinition.getName());
		Assert.assertEquals(11, listDefinition.getFields().length);
		Assert.assertEquals(3, listDefinition.getFilters().length);
		FormDefinition formDefinition = meta.getFormDefinition(null);
		Assert.assertEquals("all", formDefinition.getName());
		SectionDefinition sectionDefinition = formDefinition.getSections()[0];
		Assert.assertEquals(2, sectionDefinition.getFieldSets().length);
		FieldSetDefinition fieldSetDefinition = sectionDefinition.getFieldSets()[0];
		Assert.assertEquals(9, fieldSetDefinition.getFields().length);
	}
	
	@Test
	public void getEntityMetaDataForStdTestTableAndDefaut(){
		EntityMetaData meta = entityMetaService.getEntityMetaData(StdTestTable.class.getName());
		ListDefinition listDefinition = meta.getListDefinition(null);
		Assert.assertEquals("default", listDefinition.getName());
		Assert.assertEquals(9, listDefinition.getFields().length);
		Assert.assertEquals(2, listDefinition.getFilters().length);
		FormDefinition formDefinition = meta.getFormDefinition(null);
		Assert.assertEquals("default", formDefinition.getName());
//		SectionDefinition sectionDefinition = formDefinition.getSections()[0];
//		Assert.assertEquals(3, sectionDefinition.getFieldSets().length);
//		FieldSetDefinition fieldSetDefinition = sectionDefinition.getFieldSets()[0];
//		Assert.assertEquals(5, fieldSetDefinition.getFields().length);
//		
//		sectionDefinition = formDefinition.getSections()[2];
//		Assert.assertEquals(1, sectionDefinition.getSubTables().length);
//		SubTableDefinition subTableDefinition = sectionDefinition.getSubTables()[0];
//		Assert.assertEquals(10, subTableDefinition.getFields().length);
	}
	
	@Test
	public void getEntityMetaDataForStdTestTableAndAll(){
		EntityMetaData meta = entityMetaService.getEntityMetaData(StdTestTable.class.getName());
		ListDefinition listDefinition = meta.getListDefinition(EntityMetaDataConstants.DEFAULT_ALL_NAME);
		Assert.assertEquals("all", listDefinition.getName());
		Assert.assertEquals(23, listDefinition.getFields().length);
		Assert.assertEquals(22, listDefinition.getFilters().length);
		FormDefinition formDefinition = meta.getFormDefinition(EntityMetaDataConstants.DEFAULT_ALL_NAME);
		Assert.assertEquals("all", formDefinition.getName());
		SectionDefinition sectionDefinition = formDefinition.getSections()[0];
		Assert.assertEquals(2, sectionDefinition.getFieldSets().length);
		FieldSetDefinition fieldSetDefinition = sectionDefinition.getFieldSets()[0];
		Assert.assertEquals(11, fieldSetDefinition.getFields().length);
		
		sectionDefinition = formDefinition.getSections()[1];
		Assert.assertEquals(1, sectionDefinition.getSubTables().length);
		SubTableDefinition subTableDefinition = sectionDefinition.getSubTables()[0];
		
		sectionDefinition = formDefinition.getSections()[2];
		Assert.assertEquals(1, sectionDefinition.getSubTables().length);
		subTableDefinition = sectionDefinition.getSubTables()[0];
	}
}
