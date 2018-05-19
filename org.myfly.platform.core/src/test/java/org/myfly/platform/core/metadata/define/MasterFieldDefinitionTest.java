package org.myfly.platform.core.metadata.define;

import java.sql.Timestamp;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.MDRelationFieldDefinition;
import org.myfly.platform.core.metadata.entity.SearchRelationFieldDefinition;
import org.myfly.platform.core.system.domain.ITenant;
import org.myfly.platform.core.testdata.Detail;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class MasterFieldDefinitionTest {
	@Test
	public void masterEntity() {
		Master master = new Master();
		EntityClassUtil.getAllEntityFields(Master.class).forEach(item -> {
			if (item.getName().equals("uid")) {
				// UID
				EntityFieldDefinition field = new EntityFieldDefinition(item);
				Assert.assertEquals("uid", field.getName());
				Assert.assertEquals("UID", field.getFieldName());
				Assert.assertEquals("UID", field.getTitle());
				Assert.assertEquals(FieldDataType.UUID, field.getDataType());
				Assert.assertEquals(32, field.getMaxLength());
				Assert.assertEquals(String.class, field.getType());
				Assert.assertTrue(field.isRequired());
				Assert.assertEquals("getUid", field.getGetter().getName());
				Assert.assertEquals("setUid", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
				String uid = UUIDUtil.newUUID();
				field.getSetValueHandler().setFieldValue(master, uid);
				Assert.assertEquals(uid, field.getGetValueHandler().getFieldValue(master));
			} else if (item.getName().equals("name")) {
				// String
				EntityFieldDefinition field = new EntityFieldDefinition(item);
				Assert.assertEquals("name", field.getName());
				Assert.assertEquals("NAME", field.getFieldName());
				Assert.assertEquals("名称", field.getTitle());
				Assert.assertEquals(FieldDataType.VARCHAR, field.getDataType());
				Assert.assertEquals(255, field.getMaxLength());
				Assert.assertEquals(1, field.getMinLength());
				Assert.assertEquals(String.class, field.getType());
				Assert.assertTrue(field.isRequired());
				Assert.assertEquals("getName", field.getGetter().getName());
				Assert.assertEquals("setName", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
				String name = "xwh";
				field.getSetValueHandler().setFieldValue(master, name);
				Assert.assertEquals(name, field.getGetValueHandler().getFieldValue(master));
			} else if ("description".equals(item.getName())) {
				// Text
				EntityFieldDefinition field = new EntityFieldDefinition(item);
				Assert.assertEquals("description", field.getName());
				Assert.assertEquals("description".toUpperCase(), field.getFieldName());
				Assert.assertEquals("简述", field.getTitle());
				Assert.assertEquals(FieldDataType.TEXT, field.getDataType());
				Assert.assertEquals(1000, field.getMaxLength());
				Assert.assertEquals(0, field.getMinLength());
				Assert.assertEquals(String.class, field.getType());
				Assert.assertFalse(field.isRequired());
				Assert.assertEquals("getDescription", field.getGetter().getName());
				Assert.assertEquals("setDescription", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
				String value = "description";
				field.getSetValueHandler().setFieldValue(master, value);
				Assert.assertEquals(value, field.getGetValueHandler().getFieldValue(master));
			} else if ("active".equals(item.getName())) {
				// Boolean
				EntityFieldDefinition field = new EntityFieldDefinition(item);
				Assert.assertEquals("active", field.getName());
				Assert.assertEquals("active".toUpperCase(), field.getFieldName());
				Assert.assertEquals("激活", field.getTitle());
				Assert.assertEquals(FieldDataType.CHECK, field.getDataType());
				Assert.assertEquals(255, field.getMaxLength());
				Assert.assertEquals(0, field.getMinLength());
				Assert.assertEquals(boolean.class, field.getType());
				Assert.assertFalse(field.isRequired());
				Assert.assertEquals("isActive", field.getGetter().getName());
				Assert.assertEquals("setActive", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
				boolean value = false;
				field.getSetValueHandler().setFieldValue(master, value);
				Assert.assertEquals(value, field.getGetValueHandler().getFieldValue(master));
			} else if ("created".equals(item.getName())) {
				// Timestamp
				EntityFieldDefinition field = new EntityFieldDefinition(item);
				Assert.assertEquals("created", field.getName());
				Assert.assertEquals("created".toUpperCase(), field.getFieldName());
				Assert.assertEquals("创建时间", field.getTitle());
				Assert.assertEquals(FieldDataType.DATETIME, field.getDataType());
				Assert.assertEquals(255, field.getMaxLength());
				Assert.assertEquals(0, field.getMinLength());
				Assert.assertEquals(Timestamp.class, field.getType());
				Assert.assertFalse(field.isRequired());
				Assert.assertEquals("getCreated", field.getGetter().getName());
				Assert.assertEquals("setCreated", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
				Timestamp value = DateUtil.nowSqlTimestamp();
				field.getSetValueHandler().setFieldValue(master, value);
				Assert.assertEquals(value, field.getGetValueHandler().getFieldValue(master));
			} else if ("details".equals(item.getName())) {
				// MDRelation OneToMany
				MDRelationFieldDefinition field = new MDRelationFieldDefinition(item);
				Assert.assertEquals("details", field.getName());
				Assert.assertEquals("details".toUpperCase(), field.getFieldName());
				Assert.assertEquals("明细记录", field.getTitle());
				Assert.assertEquals(FieldDataType.MDRELATION, field.getDataType());
				Assert.assertEquals(Set.class, field.getType());
				Assert.assertEquals("getDetails", field.getGetter().getName());
				Assert.assertEquals("setDetails", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
				Assert.assertEquals(Detail.class.getName(), field.getRelationClass());
				Assert.assertEquals("Detail", field.getRelationTable());
			} else if ("tenant".equals(item.getName())) {
				// SearchRelation ManyToOne
				SearchRelationFieldDefinition field = new SearchRelationFieldDefinition(item);
				Assert.assertEquals("tenant", field.getName());
				Assert.assertEquals("tenant".toUpperCase(), field.getFieldName());
				Assert.assertEquals("租户", field.getTitle());
				Assert.assertEquals(FieldDataType.SEARCHRELATION, field.getDataType());
				Assert.assertFalse(field.isRequired());
				Assert.assertEquals(ITenant.class, field.getType());
				Assert.assertEquals(ITenant.class.getName(), field.getRelationClass());
				Assert.assertEquals("getTenant", field.getGetter().getName());
				Assert.assertEquals("setTenant", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
			} else if ("dataType".equals(item.getName())) {
				// SysEnum 系统枚举类型，Java枚举类
				EntityFieldDefinition field = new EntityFieldDefinition(item);
				Assert.assertEquals("dataType", field.getName());
				Assert.assertEquals("DATA_TYPE", field.getFieldName());
				Assert.assertEquals("数据类型", field.getTitle());
				Assert.assertEquals(FieldDataType.SYSENUM, field.getDataType());
				Assert.assertEquals(50, field.getMaxLength());
				Assert.assertFalse(field.isRequired());
				Assert.assertEquals(FieldDataType.class, field.getType());
				Assert.assertEquals("getDataType", field.getGetter().getName());
				Assert.assertEquals("setDataType", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
				FieldDataType value = FieldDataType.SYSENUM;
				field.getSetValueHandler().setFieldValue(master, value);
				Assert.assertEquals(value, field.getGetValueHandler().getFieldValue(master));
				field.getSetValueHandler().setFieldValue(master, value.name());
				Assert.assertEquals(value, field.getGetValueHandler().getFieldValue(master));
			}
		});
	}
}