package org.myfly.platform.core3.metadata.builder;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.dbinit.resources.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.define.FlyColumn;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.model.PTable;

public class FlyDataModelBuilder extends AbstractBuilder<PTable, FlyDataModel> {
	private static Log log = LogFactory.getLog(FlyDataModelBuilder.class);

	@Override
	public FlyDataModel convert(PTable builder) {
		return null;
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
		if (StringUtils.isBlank(column.getName())) {
			column.setName(column.getApiName());
		}
		if (StringUtils.isBlank(column.getColumnName())) {
			column.setColumnName(StringUtil.getHibernateName(column.getApiName()));
		}
		if (FlyDataType.NONE.equals(column.getDataType())) {
			FlyDataTypeUtils.updatColumnFromField(column, property);
		}
		return column;
	}
}
