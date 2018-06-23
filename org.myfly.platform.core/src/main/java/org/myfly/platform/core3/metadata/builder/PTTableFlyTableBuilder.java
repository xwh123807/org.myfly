package org.myfly.platform.core3.metadata.builder;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PTable;

public class PTTableFlyTableBuilder extends FlyTableDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1049487663687606420L;

	public PTTableFlyTableBuilder(PTable builder) {
		setApiName(builder.getApiName());
		setName(builder.getName());
		setTableName(builder.getTableName());
		setEntityType(builder.getEntityType());
		setDescription(builder.getDescription());
		setHelp(builder.getHelp());
		setAccessLevel(builder.getAccessLevel());
		setHighVolume(builder.getIsHighVolume());
		setChangeLog(builder.getIsChangeLog());
		setIgnoreMigration(builder.getIsIgnoreMigration());
		setDocument(builder.getIsDocument());
		setSecurityEnabled(builder.getIsSecurityEnabled());
		setDeleteable(builder.getIsDeleteable());
		setView(builder.getIsView());
		setCentrallyMaintained(builder.getIsCentrallyMaintained());
		buildFieldDefintions(builder.getColumns());
	}

	private void buildFieldDefintions(Set<PColumn> columns) {
		Map<String, FlyFieldDefinition> fields = new LinkedHashMap<>();
		columns.stream().map(item -> new PTColumnFlyFieldBuilder(item)).forEach(builder -> {
			fields.put(builder.getApiName(), new FlyFieldDefinition(builder));
		});
		// 设置属性的getter和setter
		Map<String, FieldInfo> fieldInfos = EntityClassUtil.getEntityFieldInfo(ClassUtil.getClass(getApiName()));
		fields.values().forEach(field -> {
			FieldInfo fieldInfo = fieldInfos.get(field.getApiName());
			if (fieldInfo != null) {
				field.setGetter(fieldInfo.getGetter());
				field.setSetter(fieldInfo.getSetter());
			} else {
				throw new IllegalArgumentException("属性[" + field.getApiName() + "]在类[" + getApiName() + "]中没有定义");
			}
		});
		setFlyFields(fields);
	}

	public static PTable toPTable(FlyTableDefinition builder) {
		PTable table = new PTable();
		table.setUid(UUIDUtil.newUUID());
		table.setApiName(builder.getApiName());
		table.setName(builder.getName());
		table.setTableName(builder.getTableName());
		table.setEntityType(builder.getEntityType());
		table.setDescription(builder.getDescription());
		table.setHelp(builder.getHelp());
		table.setAccessLevel(builder.getAccessLevel());
		table.setIsHighVolume(builder.isHighVolume());
		table.setIsChangeLog(builder.isChangeLog());
		table.setIsIgnoreMigration(builder.isIgnoreMigration());
		table.setIsDocument(builder.isDocument());
		table.setIsSecurityEnabled(builder.isSecurityEnabled());
		table.setIsDeleteable(builder.isDeleteable());
		table.setIsView(builder.isView());
		table.setIsCentrallyMaintained(builder.isCentrallyMaintained());
		table.setColumns(new HashSet<>());
		builder.getFlyFields().values().forEach(flyField -> {
			PColumn column = PTColumnFlyFieldBuilder.toPColumn(flyField);
			column.setUid(UUIDUtil.newUUID());
			column.setTable(table);
			column.setIsActive(true);
			table.getColumns().add(column);
		});
		return table;
	}
}
