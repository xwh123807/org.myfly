package org.myfly.platform.metadata.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.commons.lang.StringUtils;
import org.myfly.platform.core.metadata.define.FKFieldDefinition;
import org.myfly.platform.core.metadata.define.PKFieldDefinition.KeyType;
import org.myfly.platform.core.metadata.define.TableDefinition;
import org.myfly.platform.core.metadata.internal.JsonEntityMetaData;
import org.myfly.platform.core.metadata.internal.JsonEntityMetaData.JsonFieldDefinition;
import org.myfly.platform.core.metadata.internal.JsonEntityMetaData.JsonPKFieldDefinition;
import org.myfly.platform.metadata.domain.MFKConstraint;
import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.service.IMetadataRepository;
import org.myfly.platform.system.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.util.Assert;

public abstract class AbstractMetadataRepository implements IMetadataRepository {
	@Autowired
	private DataSourceProperties dsProperties;

	@Override
	public MDataSource getCurrentDataSource() {
		MDataSource ds = new MDataSource();
		ds.setUid(UUIDUtil.newUUID());
		ds.setUrl(dsProperties.getUrl());
		ds.setUsername(dsProperties.getUsername());
		ds.setPassword(dsProperties.getPassword());
		ds.setDriverClassName(dsProperties.getDriverClassName());
		return ds;
	}

	protected JsonEntityMetaData buildMetaData(MTable table) {
		JsonEntityMetaData meta = new JsonEntityMetaData();
		meta.setEntityName(table.getTableName());
		meta.setDataSourceId(table.getDataSourceId());
		TableDefinition tableDefinition = new TableDefinition(table.getName(), table.getDescription());
		tableDefinition.setSchema(table.getSchemaName());
		tableDefinition.setCatalog(table.getCatalogName());
		tableDefinition.setTableName(table.getTableName());
		tableDefinition.setIndexName(table.getName().toLowerCase());
		tableDefinition.setPrimaryKeys(table.getPrimaryKeys());
		meta.setTableDefinition(tableDefinition);
		//主键
		Assert.notNull(table.getPrimaryKeys(), "实体[" + table.getEntityName() + "]没有定义主键.");
		JsonPKFieldDefinition jsonPKFieldDefinition = new JsonPKFieldDefinition();
		jsonPKFieldDefinition.setIdFields(StringUtils.split(table.getPrimaryKeys(), ","));
		if (jsonPKFieldDefinition.getIdFields().length == 1) {
			jsonPKFieldDefinition.setKeyType(KeyType.SINGLE);
		} else {
			jsonPKFieldDefinition.setKeyType(KeyType.MULTIID);
		}
		meta.setPkFieldDefinition(jsonPKFieldDefinition);

		//字段
		Map<String, JsonFieldDefinition> fieldMap = new LinkedHashMap<>();
		table.getFields().forEach(new Consumer<MField>() {

			@Override
			public void accept(MField field) {
				JsonFieldDefinition fieldDefinition = new JsonFieldDefinition();
				fieldDefinition.setName(field.getAttrName());
				fieldDefinition.setLabel(field.getName());
				fieldDefinition.setDescription(field.getDescription());
				fieldDefinition.setFieldName(field.getFieldName());
				fieldDefinition.setDataType(field.getFieldDataType());
				fieldDefinition.setMaxLength(field.getLength().intValue());
				fieldDefinition.setType(fieldDefinition.getDataType().getJavaType().getName());
				fieldDefinition.setRelationTable(field.getRelationTable());
				fieldDefinition.setRelationField(field.getRelationField());
				fieldMap.put(fieldDefinition.getName(), fieldDefinition);
			}
		});
		meta.setFieldMap(fieldMap);
		
		//外键
		Map<String, FKFieldDefinition> fkFields = new LinkedHashMap<>();
		table.getFkConstraints().forEach(new Consumer<MFKConstraint>() {

			@Override
			public void accept(MFKConstraint fkConstraint) {
				FKFieldDefinition fkField = new FKFieldDefinition(meta);
				fkField.setName(fkConstraint.getName());
				fkField.setField(fkConstraint.getPkAttrName());
				fkField.setFkFields(fkConstraint.getPkColumnNames().split(","));
				fkField.setRelationFields(fkConstraint.getFkColumnNames().split(","));
				fkField.setRelationTable(fkConstraint.getFkTableName());
				fkFields.put(fkField.getField(), fkField);
			}
		});
		meta.setFkFieldsMap(fkFields);
		return meta;
	}
}
