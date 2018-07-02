package org.myfly.platform.core3.dbinit;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.persistence.Column;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyReferences;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.builder.FlyDataTypeUtils;
import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PRefTable;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.data.ValidationType;
import org.myfly.platform.core3.model.dict.PReference;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 从实体类定义中导入数据到PTable、PColumn、PRefTable中
 * 
 * @author xiangwanhong
 *
 */
@Component
@Scope("prototype")
public class TableImporter extends AbstractClassImporter<IFlyEntity> {
	private PTable table;
	private List<PColumn> columns;
	private List<PReference> references;
	private List<PRefTable> refTables;

	public TableImporter() {
		columns = new ArrayList<>();
		references = new ArrayList<>();
		refTables = new ArrayList<>();
	}

	@Override
	public void convertClass(Class<? extends IFlyEntity> entityClass) {
		table = new PTable();
		table.setTableID(UUIDUtil.newUUID());
		buildTable(entityClass);
		buildRefTable(entityClass);
	}
	
	@Override
	public void convertFinish() {
		getTargets().add(getTable());
		getTargets().addAll(getReferences());
		getTargets().addAll(getRefTabls());
		getTargets().addAll(getColumns());
	}

	@Override
	public void convertField(FieldInfo field) {
		PColumn column = buildField(field.getField());
		column.setTableID(getTable().getTableID());
		getColumns().add(column);
	}

	/**
	 * 构建PReference、PRefTable
	 * 
	 * @param entityClass
	 */
	private void buildRefTable(Class<? extends IFlyEntity> entityClass) {
		ArrayList<FlyRefTable> refs = new ArrayList<>();
		FlyReferences annos = entityClass.getAnnotation(FlyReferences.class);
		if (annos != null && annos.references().length > 0) {
			Stream.of(annos.references()).forEach(item -> refs.add(item));
		}
		FlyRefTable anno = entityClass.getAnnotation(FlyRefTable.class);
		if (anno != null) {
			refs.add(anno);
		}
		refs.forEach(ref -> {
			PReference reference = new PReference();
			reference.setReferenceID(UUIDUtil.newUUID());
			reference.setName(ref.name());
			reference.setDescription(ref.description());
			reference.setHelp(ref.help());
			reference.setEntityType(ref.entityType());
			reference.setValidationType(ValidationType.T);
			getReferences().add(reference);

			PRefTable refTable = new PRefTable();
			refTable.setReferenceID(reference.getReferenceID());
			refTable.setEntityType(ref.entityType());
			refTable.setKeyColumn(ref.keyColumn());
			refTable.setDisplayColumn(ref.displayColumn());
			refTable.setDisplaySQL(ref.displaySQL());
			refTable.setIsAlert(ref.isAlert());
			refTable.setIsDisplayIdentifier(ref.isDisplayIdentifier());
			refTable.setIsValueDisplayed(ref.isValueDisplayed());
			refTable.setWhereClause(ref.whereClause());
			refTable.setOrderByClause(ref.orderByClause());
			refTable.setTableID(getTable().getTableID());
			getRefTabls().add(refTable);
		});
	}

	/**
	 * 构建实体PColumn
	 * 
	 * @param property
	 * @return
	 */
	private PColumn buildField(Field property) {
		PColumn column = new PColumn();
		column.setColumnID(UUIDUtil.newUUID());
		column.setApiName(property.getName());
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

	/**
	 * 构建实体PTable
	 * 
	 * @param entityClass
	 */
	private void buildTable(Class<? extends IFlyEntity> entityClass) {
		table.setApiName(entityClass.getName());
		Table anno = entityClass.getAnnotation(Table.class);
		if (table != null) {
			table.setTableName(anno.name());
		}
		FlyTable flyTable = entityClass.getAnnotation(FlyTable.class);
		if (flyTable != null) {
			table.setName(flyTable.name());
			table.setEntityType(flyTable.entityType().name());
			table.setDescription(flyTable.description());
			table.setHelp(flyTable.help());
			table.setAccessLevel(flyTable.accessLevel());
			table.setIsHighVolume(flyTable.isHighVolume());
			table.setIsChangeLog(flyTable.isChangeLog());
			table.setIsIgnoreMigration(flyTable.isIgnoreMigration());
			table.setIsDocument(flyTable.isDocument());
			table.setIsSecurityEnabled(flyTable.isSecurityEnabled());
			table.setIsDeleteable(flyTable.isDeleteable());
			table.setIsView(flyTable.isView());
			table.setIsCentrallyMaintained(flyTable.isCentrallyMaintained());
		}
		if (StringUtils.isBlank(table.getName())) {
			table.setName(entityClass.getSimpleName());
		}
		if (StringUtils.isBlank(table.getTableName())) {
			table.setTableName(table.getName());
		}
	}

	public PTable getTable() {
		return table;
	}

	public List<PColumn> getColumns() {
		return columns;
	}

	public List<PReference> getReferences() {
		return references;
	}

	public List<PRefTable> getRefTabls() {
		return refTables;
	}
}
