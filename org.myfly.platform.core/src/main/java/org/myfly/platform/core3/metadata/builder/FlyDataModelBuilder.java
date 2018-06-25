package org.myfly.platform.core3.metadata.builder;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.internal.FlyMetaDataUtils;
import org.myfly.platform.core3.metadata.service.IFlyColumn;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.springframework.util.Assert;

/**
 * 数据模型构造器
 * 
 * @author xiangwanhong
 *
 */
public class FlyDataModelBuilder {
	private IFlyDataModel dataModel;
	private Class<?> entityClass;

	/**
	 * 从实体类构建实体数据模型
	 * 
	 * @param entityClass
	 */
	public FlyDataModelBuilder(Class<?> entityClass) {
		this.entityClass = entityClass;
		Assert.notNull(entityClass.getAnnotation(Entity.class), "类[" + entityClass.getName() + "]不是有效的实体类.");
	}

	/**
	 * 构建数据模型
	 */
	public void build() {
		dataModel = FlyMetaDataUtils.newFlyDataModelInstance();
		buildTable(entityClass);
		buildFields(entityClass);
	}

	/**
	 * 
	 * @return
	 */
	public IFlyDataModel getFlyDataModel() {
		return dataModel;
	}

	/**
	 * 验证
	 */
	public void validate() {
		Assert.hasLength(dataModel.getApiName(), "属性[apiName]不能为空");
		Assert.hasLength(dataModel.getName(), "实体[" + dataModel.getApiName() + "]属性[name]不能为空");
		Assert.hasLength(dataModel.getTableName(), "实体[" + dataModel.getApiName() + "]属性[tableName]不能为空");
		Assert.notEmpty(dataModel.getColumns(), "实体[" + dataModel.getApiName() + "]属性[fields]不能为空，且长度不能小于1");
		dataModel.getColumns().forEach(column -> {
			Assert.hasLength(column.getApiName(), "实体[" + dataModel.getApiName() + "]属性[apiName]不能为空");
			Assert.hasLength(column.getName(), "实体[" + dataModel.getApiName() + "]属性[name]不能为空");
			Assert.hasLength(column.getColumnName(), "实体[" + dataModel.getApiName() + "]属性[tableName]不能为空");
			Assert.isTrue(!FlyDataType.NONE.equals(column.getDataType()),
					"实体[" + dataModel.getApiName() + "]属性[dataType]不能为NONE");
		});
	}

	/**
	 * 从实体类属性中构建字段定义信息，读取注解@Column、@Id、@IdClass、@FlyField
	 * 
	 * @param entityClass
	 */
	private void buildTable(Class<?> entityClass) {
		dataModel.setApiName(entityClass.getName());
		Table table = entityClass.getAnnotation(Table.class);
		if (table != null) {
			dataModel.setTableName(table.name());
		}
		FlyTable flyTable = entityClass.getAnnotation(FlyTable.class);
		if (flyTable != null) {
			dataModel.setName(flyTable.name());
			dataModel.setEntityType(flyTable.entityType());
			dataModel.setDescription(flyTable.description());
			dataModel.setHelp(flyTable.help());
			dataModel.setAccessLevel(flyTable.accessLevel());
			dataModel.setIsHighVolume(flyTable.isHighVolume());
			dataModel.setIsChangeLog(flyTable.isChangeLog());
			dataModel.setIsIgnoreMigration(flyTable.isIgnoreMigration());
			dataModel.setIsDocument(flyTable.isDocument());
			dataModel.setIsSecurityEnabled(flyTable.isSecurityEnabled());
			dataModel.setIsDeleteable(flyTable.isDeleteable());
			dataModel.setIsView(flyTable.isView());
			dataModel.setIsCentrallyMaintained(flyTable.isCentrallyMaintained());
		}
		if (StringUtils.isBlank(dataModel.getName())) {
			dataModel.setName(entityClass.getSimpleName());
		}
		if (StringUtils.isBlank(dataModel.getTableName())) {
			dataModel.setTableName(dataModel.getName());
		}
	}

	/**
	 * 从实体类构建表定义信息，读取注解@Entity、@Table、@FlyTable
	 * 
	 * @param entityClass
	 */
	private void buildFields(Class<?> entityClass) {
		Set<IFlyColumn> columns = new HashSet<>();
		EntityClassUtil.getEntityFieldInfo(entityClass).values().forEach(fieldInfo -> {
			columns.add(buildField(fieldInfo.getField()));
		});
		dataModel.setColumns(columns);
	}

	private IFlyColumn buildField(Field property) {
		IFlyColumn column = FlyMetaDataUtils.newFlyColumnInstance();
		column.setApiName(property.getName());
		FlyField view = property.getAnnotation(FlyField.class);
		if (view != null) {
			column.setName(view.name());
			column.setEntityType(view.entityType());
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
			column.setEntityType(EntityType.D);
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
