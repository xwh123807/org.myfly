package org.myfly.platform.core3.metadata.builder;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;

/**
 * 从实体类中构建表定义信息，从实体类属性构建字段信息 <br>
 * 
 * @author xiangwanhong
 *
 */
public class EntityFlyTableBuilder extends FlyTableDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4409980077107637639L;

	public EntityFlyTableBuilder() {
	}

	/**
	 * 从实体类构建表、字段定义信息
	 * 
	 * @param entityClass
	 */
	public EntityFlyTableBuilder(Class<?> entityClass) {
		buildTableDefinition(entityClass);
		Entity entity = entityClass.getAnnotation(Entity.class);
		if (entity != null) {
			buildFieldDefintions(entityClass);
		}
	}

	/**
	 * 从实体类构建表定义信息，读取注解@Entity、@Table、@FlyTable
	 * 
	 * @param entityClass
	 */
	private void buildFieldDefintions(Class<?> entityClass) {
		// 设置实体字段列表
		Map<String, FlyFieldDefinition> fields = new LinkedHashMap<>();
		EntityClassUtil.getEntityFieldInfo(entityClass).values().stream().map(item -> new EntityFlyFieldBuilder(item))
				.forEach(builder -> {
					fields.put(builder.getApiName(), new FlyFieldDefinition(builder));
				});
		setFlyFields(fields);
	}

	/**
	 * 从实体类属性中构建字段定义信息，读取注解@Column、@Id、@IdClass、@FlyField
	 * 
	 * @param entityClass
	 */
	private void buildTableDefinition(Class<?> entityClass) {
		setApiName(entityClass.getName());
		Table table = entityClass.getAnnotation(Table.class);
		if (table != null) {
			setTableName(table.name());
		}
		FlyTable flyTable = entityClass.getAnnotation(FlyTable.class);
		if (flyTable != null) {
			setName(flyTable.name());
			setEntityType(flyTable.entityType());
			setDescription(flyTable.description());
			setHelp(flyTable.help());
			setAccessLevel(flyTable.accessLevel());
			setHighVolume(flyTable.isHighVolume());
			setChangeLog(flyTable.isChangeLog());
			setIgnoreMigration(flyTable.isIgnoreMigration());
			setDocument(flyTable.isDocument());
			setSecurityEnabled(flyTable.isSecurityEnabled());
			setDeleteable(flyTable.isDeleteable());
			setView(flyTable.isView());
			setCentrallyMaintained(flyTable.isCentrallyMaintained());
		}
		if (StringUtils.isBlank(getName())) {
			setName(entityClass.getSimpleName());
		}
	}
}
