package org.myfly.platform.core.datamodel.builder;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.datamodel.annotation.FlyField;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.datamodel.define.FlyColumn;
import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.datamodel.model.PColumn;
import org.myfly.platform.core.datamodel.model.PTable;
import org.myfly.platform.core.dbinit.resources.EntityType;
import org.myfly.platform.core.domain.FlyDataType;
import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class FlyDataModelBuilder extends AbstractBuilder<PTable, FlyDataModel> {
	private static Log log = LogFactory.getLog(FlyDataModelBuilder.class);

	/**
	 * 从实体类构建
	 * @param table
	 * @param items
	 * @return
	 */
	public FlyDataModel convert(PTable table, List<PColumn> items) {
		FlyDataModel result = convert(table);
		result.setColumnMap(new LinkedHashMap<>());
		items.forEach(item -> {
			result.getColumnMap().put(item.getApiName(), convert(item));
		});
		return result;
	}

	@Override
	public FlyDataModel convert(PTable builder) {
		FlyDataModel result = new FlyDataModel();
		result.setFromDB(true);
		copyFlyMetaFields(result, builder);
		result.setAccessLevel(builder.getAccessLevel());
		result.setaCTriggerLength(builder.getaCTriggerLength());
		result.setApiName(builder.getApiName());
		result.setCopyColumnsFromTable(builder.getCopyColumnsFromTable());
		result.setDisplayColumn(builder.getDisplayColumn());
		result.setEntityType(builder.getEntityType());
		result.setImportTable(builder.getImportTable());
		result.setIsCentrallyMaintained(builder.getIsCentrallyMaintained());
		result.setIsChangeLog(builder.getIsChangeLog());
		result.setIsDeleteable(builder.getIsDeleteable());
		result.setIsDocument(builder.getIsDocument());
		result.setIsHighVolume(builder.getIsHighVolume());
		result.setIsIgnoreMigration(builder.getIsIgnoreMigration());
		result.setIsSecurityEnabled(builder.getIsSecurityEnabled());
		result.setIsView(builder.getIsView());
		result.setReplicationType(builder.getReplicationType());
		result.setTableID(builder.getTableID());
		result.setTableName(builder.getTableName());
		result.setWindowID(builder.getWindowID());
		return result;
	}

	public FlyColumn convert(PColumn builder) {
		FlyColumn result = new FlyColumn();
		result.setFromDB(true);
		copyFlyMetaFields(result, builder);
		result.setApiName(builder.getApiName());
		result.setCallout(builder.getCallout());
		result.setColumnID(builder.getColumnID());
		result.setColumnName(builder.getColumnName());
		result.setColumnSQL(builder.getColumnSQL());
		result.setDataType(builder.getDataType());
		result.setDefaultValue(builder.getDefaultValue());
		result.setElementID(builder.getElementID());
		result.setEntityType(builder.getEntityType());
		result.setFieldLength(builder.getFieldLength());
		result.setFormatPattern(builder.getFormatPattern());
		result.setInfoFactoryClass(builder.getInfoFactoryClass());
		result.setIsAllowCopy(builder.getIsAllowCopy());
		result.setIsAllowLogging(builder.getIsAllowLogging());
		result.setIsAlwaysUpdateable(builder.getIsAlwaysUpdateable());
		result.setIsAutocomplete(builder.getIsAutocomplete());
		result.setIsEncrypted(builder.getIsEncrypted());
		result.setIsIdentifier(builder.getIsIdentifier());
		result.setIsKey(builder.getIsKey());
		result.setIsMandatory(builder.getIsMandatory());
		result.setIsParent(builder.getIsParent());
		result.setIsRange(builder.getIsRange());
		result.setIsSelectionColumn(builder.getIsSelectionColumn());
		result.setIsSyncDatabase(builder.getIsSyncDatabase());
		result.setIsTranslated(builder.getIsTranslated());
		result.setIsUpdateable(builder.getIsUpdateable());
		result.setMandatoryLogic(builder.getMandatoryLogic());
		result.setReadOnlyLogic(builder.getReadOnlyLogic());
		result.setReferenceID(builder.getReferenceID());
		result.setSeqNo(builder.getSeqNo());
		result.setTableID(builder.getTableID());
		result.setValueMax(builder.getValueMax());
		result.setValueMin(builder.getValueMin());
		result.setVersion(builder.getVersion());
		result.setvFormat(builder.getvFormat());
		return result;
	}

	@Override
	public List<FlyDataModel> convertEntityClass(Class<? extends IFlyEntity> entityClass) {
		List<FlyDataModel> list = new ArrayList<>();
		list.add(buildTable(entityClass));
		return list;
	}

	/**
	 * 构建实体PTable
	 * 
	 * @param entityClass
	 */
	private FlyDataModel buildTable(Class<? extends IFlyEntity> entityClass) {
		FlyDataModel result = new FlyDataModel();
		result.setTableID(UUIDUtil.newUUID());
		result.setApiName(entityClass.getName());
		Table anno = entityClass.getAnnotation(Table.class);
		if (anno != null) {
			result.setTableName(anno.name());
		}
		FlyTable flyTable = entityClass.getAnnotation(FlyTable.class);
		if (flyTable != null) {
			result.setName(flyTable.name());
			result.setEntityType(flyTable.entityType().name());
			result.setDescription(flyTable.description());
			result.setHelp(flyTable.help());
			result.setAccessLevel(flyTable.accessLevel());
			result.setIsHighVolume(flyTable.isHighVolume());
			result.setIsChangeLog(flyTable.isChangeLog());
			result.setIsIgnoreMigration(flyTable.isIgnoreMigration());
			result.setIsDocument(flyTable.isDocument());
			result.setIsSecurityEnabled(flyTable.isSecurityEnabled());
			result.setIsDeleteable(flyTable.isDeleteable());
			result.setIsView(flyTable.isView());
			result.setIsCentrallyMaintained(flyTable.isCentrallyMaintained());
		}
		if (StringUtils.isBlank(result.getName())) {
			result.setName(entityClass.getSimpleName());
		}
		if (StringUtils.isBlank(result.getTableName())) {
			result.setTableName(result.getName());
		}
		result.setTableName(StringUtil.addUnderscores(result.getTableName()));

		// 构建字段
		result.setColumnMap(new LinkedHashMap<>());
		Map<String, FieldInfo> fieldInfos = EntityClassUtil.getEntityFieldInfo(entityClass);
		fieldInfos.values().forEach(fieldInfo -> {
			FlyColumn flyColumn = buildField(fieldInfo);
			flyColumn.setColumnName(StringUtil.addUnderscores(flyColumn.getColumnName()));
			flyColumn.setParent(result);
			if (BooleanUtils.isTrue(flyColumn.getIsKey())) {
				if (result.getPrimaryKey() == null) {
					result.setPrimaryKey(flyColumn);
				} else {
					log.warn("实体[" + entityClass.getName() + "]主键重复");
				}
			}
			flyColumn.setGetter(fieldInfo.getGetter());
			flyColumn.setSetter(fieldInfo.getSetter());
			flyColumn.setColumnID(UUIDUtil.newUUID());
			flyColumn.setTableID(result.getTableID());
			FlyEntityUtils.updateFlyEntityForSystem(flyColumn);
			result.getColumnMap().put(flyColumn.getApiName(), flyColumn);
		});
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}

	/**
	 * 构建实体PColumn
	 * 
	 * @param property
	 * @return
	 */
	private FlyColumn buildField(FieldInfo fieldInfo) {
		Field property = fieldInfo.getField();
		FlyColumn column = new FlyColumn();
		column.setColumnID(UUIDUtil.newUUID());
		column.setApiName(property.getName());
		if (property.getAnnotation(Id.class) != null) {
			column.setIsKey(true);
		}
		FlyField view = property.getAnnotation(FlyField.class);
		if (view != null) {
			column.setName(view.name());
			column.setEntityType(view.entityType().name());
			column.setDescription(view.description());
			column.setHelp(view.help());
			column.setColumnSQL(view.columnSQL());
			column.setDataType(view.dataType());
			column.setDefaultValue(view.defaultValue());
			column.setIsAllowCopy(view.isAllowCopy());
			column.setIsAllowLogging(view.isAllowLogging());
			column.setIsAlwaysUpdateable(view.isAlwaysUpdateable());
			column.setIsAutocomplete(view.isAutocomplete());
			column.setIsEncrypted(view.isEncrypted());
			column.setIsParent(view.isParent());
			column.setIsRange(view.isRange());
			column.setIsSelectionColumn(view.isSelectionColumn());
			column.setIsSyncDatabase(view.isSyncDatabase());
			column.setIsTranslated(view.isTranslated());
			column.setValueMin(view.valueMin());
			column.setValueMax(view.valueMax());
			column.setvFormat(view.vFormat());
		} else {
			// 设置默认值
			column.setEntityType(EntityType.D.name());
			column.setDataType(FlyDataType.NONE);
			column.setIsAllowCopy(true);
			column.setIsTranslated(true);
		}
		Column col = property.getAnnotation(Column.class);
		if (col != null) {
			column.setColumnName(col.name());
			column.setFieldLength(col.length());
			column.setIsMandatory(col.nullable());
		}
		if (StringUtils.isBlank(column.getColumnName())) {
			column.setColumnName(column.getApiName());
		}
		if (FlyDataType.NONE.equals(column.getDataType())) {
			FlyDataTypeUtils.updatColumnFromField(column, property);
		}
		return column;
	}
}
