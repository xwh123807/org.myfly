package org.myfly.platform.system.stdtest.internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.RandomUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.user.internal.SystemDataInitial;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.stdtest.domain.StdTestEmployee;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.stdtest.domain.StdTestTableSubA;
import org.myfly.platform.system.stdtest.domain.StdTestTableSubB;
import org.myfly.platform.system.stdtest.repository.StdTestTableRepository;
import org.myfly.platform.system.stdtest.service.IStdTestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StdTestDataService implements IStdTestDataService{
	@Autowired
	private StdTestTableRepository stdTestTableRepository;
	@Autowired
	private SystemDataInitial systemDataInitial;
	
	
	/**
	 * 子表记录数配置
	 */
	private int subTableRowCount = 25;
	
	private IFlyDataAccessService getFlyDataAccessService(String entityName){
		return AppUtil.getFlyDataAccessService(entityName);
	}
	
	public void initTestData(int initStdTestDataCount) {
		List<StdTestTable> stdTestTables = new ArrayList<>();
		List<StdTestEmployee> stdTestEmployees = new ArrayList<>();
		for (int i = 0; i < initStdTestDataCount; i ++){
			stdTestTables.add(createStdTestTable(i+1));
			stdTestEmployees.add(createStdTestEmployee(i+1));
		}
		getFlyDataAccessService(StdTestTable.class.getName()).saveEntity(stdTestTables);
		getFlyDataAccessService(StdTestEmployee.class.getName()).saveEntity(stdTestEmployees);
		
		//保存stdTestTables中的子表
		/*
		for (StdTestTable stdTestTable : stdTestTables){
			getFlyDataAccessService(StdTestTableSubA.class.getName()).saveEntity(stdTestTable.getDetails());
		}
		*/
	}

	private StdTestEmployee createStdTestEmployee(int index) {
		StdTestEmployee entity = new StdTestEmployee();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName("name" + index);
		entity.setAddress("address" + index);
		return entity;
	}

	private StdTestTable createStdTestTable(int index){
		StdTestTable entity = new StdTestTable();
		entity.setUid(UUIDUtil.newUUID());
		entity.setActive(true);
		entity.setBigDecimalField(new BigDecimal(index*1000));
		entity.setBigIntegerField(new BigInteger(String.valueOf(index*10000)));
		entity.setCreated(DateUtil.nowSqlTimestamp());
		entity.setDataType(FieldDataType.DATE);
		entity.setDateField(DateUtil.nowSqlTimestamp());
		entity.setDoubleField(RandomUtils.nextDouble(200, 2000000));
		entity.setFloatField(RandomUtils.nextFloat(1000, 100000));
		entity.setIntegerField(index);
		entity.setLongField((long) (index*100));
		entity.setLongText("long text " + index);
		entity.setName("name" + index);
		entity.setSmallText("短文本字符串" + index);
		entity.setStringField("StringField字符串" + index);
		entity.setUpdated(DateUtil.nowSqlTimestamp());
		entity.setSqlDateField(DateUtil.nowSqlDate());
		entity.setSqlTimestampField(DateUtil.nowSqlTimestamp());
		entity.setSqlTimeField(DateUtil.nowSqlTime());
		entity.setTenant(systemDataInitial.getSysStenant());
		entity.setCreatedBy(systemDataInitial.getSysSUser());
		entity.setUpdatedBy(systemDataInitial.getSysSUser());
		Set<StdTestTableSubA> details = new HashSet<>();
		Set<StdTestTableSubB> subs = new HashSet<>();
		for (int i = 0; i < subTableRowCount; i ++){
			StdTestTableSubA detail = createStdTestTableDetail(entity, i+1);
			details.add(detail);
			
			StdTestTableSubB sub = createStdTestTableSub(entity, i+1);
			subs.add(sub);
		}
		entity.setDetails(details);
		entity.setSubs(subs);
		return entity;
	}

	private StdTestTableSubA createStdTestTableDetail(StdTestTable masterTable, int index) {
		StdTestTableSubA entity = new StdTestTableSubA();
		entity.setUid(UUIDUtil.newUUID());
		entity.setStdTestTable(masterTable);
		entity.setActive(true);
		entity.setBigDecimalField(new BigDecimal(index*1000));
		entity.setBigIntegerField(new BigInteger(String.valueOf(index*10000)));
		entity.setCreated(DateUtil.nowSqlTimestamp());
		entity.setDataType(FieldDataType.DATE);
		entity.setDateField(DateUtil.nowSqlTimestamp());
		entity.setDoubleField(RandomUtils.nextDouble(200, 2000000));
		entity.setFloatField(RandomUtils.nextFloat(1000, 100000));
		entity.setIntegerField(index);
		entity.setLongField((long) (index*100));
		entity.setLongText("long text " + index);
		entity.setName("name" + index);
		entity.setSmallText("smalltext" + index);
		entity.setStringField("stringfield" + index);
		entity.setUpdated(DateUtil.nowSqlTimestamp());
		entity.setSqlDateField(DateUtil.nowSqlDate());
		entity.setSqlTimestampField(DateUtil.nowSqlTimestamp());
		entity.setSqlTimeField(DateUtil.nowSqlTime());
		entity.setTenant(systemDataInitial.getSysStenant());
		entity.setCreatedBy(systemDataInitial.getSysSUser());
		entity.setUpdatedBy(systemDataInitial.getSysSUser());
		return entity;
	}
	
	private StdTestTableSubB createStdTestTableSub(StdTestTable masterTable, int index) {
		StdTestTableSubB entity = new StdTestTableSubB();
		entity.setUid(UUIDUtil.newUUID());
		entity.setStdTestTable(masterTable);
		entity.setActive(true);
		entity.setBigDecimalField(new BigDecimal(index*1000));
		entity.setBigIntegerField(new BigInteger(String.valueOf(index*10000)));
		entity.setCreated(DateUtil.nowSqlTimestamp());
		entity.setDataType(FieldDataType.DATE);
		entity.setDateField(DateUtil.nowSqlTimestamp());
		entity.setDoubleField(RandomUtils.nextDouble(200, 2000000));
		entity.setFloatField(RandomUtils.nextFloat(1000, 100000));
		entity.setIntegerField(index);
		entity.setLongField((long) (index*100));
		entity.setLongText("long text " + index);
		entity.setName("name" + index);
		entity.setSmallText("smalltext" + index);
		entity.setStringField("stringfield" + index);
		entity.setUpdated(DateUtil.nowSqlTimestamp());
		entity.setSqlDateField(DateUtil.nowSqlDate());
		entity.setSqlTimestampField(DateUtil.nowSqlTimestamp());
		entity.setSqlTimeField(DateUtil.nowSqlTime());
		entity.setTenant(systemDataInitial.getSysStenant());
		entity.setCreatedBy(systemDataInitial.getSysSUser());
		entity.setUpdatedBy(systemDataInitial.getSysSUser());
		return entity;
	}

	@Override
	public void clearTestData() {
		stdTestTableRepository.deleteAll();
	}
}
