package org.myfly.platform.core.metadata;

import java.io.Serializable;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.define.PKFieldDefinition;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.tpcc.domain.District;
import org.myfly.platform.system.tpcc.domain.DistrictPK;
import org.myfly.platform.system.tpcc.domain.Warehouse;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class PKFieldDefinitionTest extends ServiceTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	@Test
	public void singleForStdTestTable() {
		PKFieldDefinition pkFieldDefinition = entityMetaDataService.getEntityMetaData("StdTestTable")
				.getPKFieldDefinition();
		StdTestTable stdTestTable = new StdTestTable();
		stdTestTable.setUid(UUIDUtil.newUUID());
		String value1 = (String) pkFieldDefinition.getFieldValue(stdTestTable);
		Assert.assertEquals(stdTestTable.getUid(), value1);
		
		stdTestTable = new StdTestTable();
		String value2 = UUIDUtil.newUUID();
		pkFieldDefinition.setFieldValue(stdTestTable, value2);
		Assert.assertEquals(value2, stdTestTable.getUid());
		
		stdTestTable = new StdTestTable();
		stdTestTable.setUid(UUIDUtil.newUUID());
		String pkValue = pkFieldDefinition.getPKValue(stdTestTable);
		Assert.assertEquals(stdTestTable.getUid(), pkValue);
		
		stdTestTable = new StdTestTable();
		String pkValue2 = UUIDUtil.newUUID();
		pkFieldDefinition.setPKValue(stdTestTable, pkValue2);
		Assert.assertEquals(stdTestTable.getUid(), pkValue2);
		
		stdTestTable = new StdTestTable();
		Serializable pkValue3 = UUIDUtil.newUUID();
		pkFieldDefinition.setPKValue(stdTestTable, pkValue3);
		Assert.assertEquals(stdTestTable.getUid(), pkValue3);
		
		String value3 = pkFieldDefinition.convertPKToString(pkValue3);
		Assert.assertEquals(value3, pkValue3);
		
		String value4 = UUIDUtil.newUUID();
		stdTestTable = pkFieldDefinition.newEntity(value4);
		Assert.assertEquals(value4, stdTestTable.getUid());
	}
	
	@Test
	public void singleForWarehouse(){
		PKFieldDefinition pkFieldDefinition = entityMetaDataService.getEntityMetaData("warehouse")
				.getPKFieldDefinition();
		Warehouse warehouse = new Warehouse();
		warehouse.setWid(10l);
		Long value1 = (Long) pkFieldDefinition.getFieldValue(warehouse);
		Assert.assertEquals(warehouse.getWid(), value1);
		
		warehouse = new Warehouse();
		Long value2 = 11l;
		pkFieldDefinition.setFieldValue(warehouse, value2);
		Assert.assertEquals(value2, warehouse.getWid());
		
		warehouse = new Warehouse();
		warehouse.setWid(12l);
		String pkValue = pkFieldDefinition.getPKValue(warehouse);
		Assert.assertEquals(String.valueOf(warehouse.getWid()), pkValue);
		
		warehouse = new Warehouse();
		String pkValue2 = "13";
		pkFieldDefinition.setPKValue(warehouse, pkValue2);
		Assert.assertEquals(Long.valueOf(pkValue2), warehouse.getWid());
		
		warehouse = new Warehouse();
		Serializable pkValue3 = 14L;
		pkFieldDefinition.setPKValue(warehouse, pkValue3);
		Assert.assertEquals(warehouse.getWid(), pkValue3);
		
		String value3 = pkFieldDefinition.convertPKToString(pkValue3);
		Assert.assertEquals(String.valueOf(pkValue3), value3);
		
		Long value4 = 15l;
		warehouse = pkFieldDefinition.newEntity(value4);
		Assert.assertEquals(value4, warehouse.getWid());
	}
	
	@Test
	public void singleForDistrict(){
		PKFieldDefinition pkFieldDefinition = entityMetaDataService.getEntityMetaData("district")
				.getPKFieldDefinition();
		District district = new District();
		district.setWid(10l);
		district.setDid(100l);
		String value1 =  (String) pkFieldDefinition.getFieldValue(district);
		Assert.assertEquals("100_10", value1);
		
		district = new District();
		DistrictPK value2 = new DistrictPK(11l, 101l);
		pkFieldDefinition.setFieldValue(district, value2);
		Assert.assertEquals(value2.getWid(), district.getWid());
		Assert.assertEquals(value2.getDid(), district.getDid());
		
		district = new District();
		district.setWid(12l);
		district.setDid(120l);
		String pkValue = pkFieldDefinition.getPKValue(district);
		Assert.assertEquals("120_12", pkValue);
		
		district = new District();
		String pkValue2 = "130_13";
		pkFieldDefinition.setPKValue(district, pkValue2);
		Assert.assertEquals(Long.valueOf(13), district.getWid());
		Assert.assertEquals(Long.valueOf(130), district.getDid());
		
		district = new District();
		DistrictPK pkValue3 = new DistrictPK(14l, 140l);
		pkFieldDefinition.setPKValue(district, pkValue3);
		Assert.assertEquals(pkValue3.getWid(), district.getWid());
		Assert.assertEquals(pkValue3.getDid(), district.getDid());
		
		String value3 = pkFieldDefinition.convertPKToString(pkValue3);
		Assert.assertEquals("140_14", value3);
		
		String value4 = "150_15";
		district = pkFieldDefinition.newEntity(value4);
		Assert.assertEquals(Long.valueOf(15), district.getWid());
		Assert.assertEquals(Long.valueOf(150), district.getDid());
	}
	
}
