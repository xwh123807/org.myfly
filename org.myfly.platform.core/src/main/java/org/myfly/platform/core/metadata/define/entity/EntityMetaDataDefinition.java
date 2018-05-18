package org.myfly.platform.core.metadata.define.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.FieldDataType.FieldAttr;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FlyEnum;
import org.myfly.platform.core.metadata.annotation.FlySearchRelation;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.define.AssociationSetFieldValueHandler;
import org.myfly.platform.core.metadata.define.DefaultGetFieldValueHandler;
import org.myfly.platform.core.metadata.define.DefaultSetFieldValueHandler;
import org.myfly.platform.core.metadata.define.FKFieldDefinition;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.define.FlySearchRelationGetFieldValueHandler;
import org.myfly.platform.core.metadata.define.MetaDataDefinition;
import org.myfly.platform.core.metadata.define.SearchRelationGetFieldValueHandler;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.StringUtil;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.mapping.Association;
import org.springframework.data.mapping.PersistentProperty;
import org.springframework.data.mapping.SimpleAssociationHandler;
import org.springframework.data.mapping.SimplePropertyHandler;
import org.springframework.util.Assert;

public class EntityMetaDataDefinition extends MetaDataDefinition {

	public EntityMetaDataDefinition(JpaPersistentEntity<?> entity) {
		super(entity.findAnnotation(MetaDataView.class));
		updateTableDefinition(entity);
	}

	private void updateTableDefinition(Table table, Entity entity) {
		if (table != null) {
			getTableDefinition().setCatalog(table.catalog());
			getTableDefinition().setSchema(table.schema());
		}
	}

	private void updateTableDefinition(JpaPersistentEntity<?> entity) {
		Map<String, FieldDefinition> fieldsMap = new HashMap<String, FieldDefinition>();
		updateTableDefinition(entity.findAnnotation(Table.class), entity.findAnnotation(Entity.class));
		entity.doWithProperties(new SimplePropertyHandler() {

			@Override
			public void doWithPersistentProperty(PersistentProperty<?> property) {
				FieldDefinition fieldDefinition = new FieldDefinition(property.findAnnotation(FieldView.class));
				fieldDefinition.setName(property.getName());
				Column column = property.findAnnotation(Column.class);
				fieldDefinition.setMaxLength(column.length());
				fieldDefinition.setPrecision(column.precision());
				fieldDefinition.setScale(column.scale());
				fieldDefinition.setRequired(!column.nullable());
				if (StringUtils.isNotBlank(column.name())) {
					fieldDefinition.setFieldName(column.name());
				} else {
					fieldDefinition.setFieldName(StringUtil.getHibernateName(fieldDefinition.getName()));
				}
				fieldDefinition.setGetter(property.getGetter());
				fieldDefinition.setSetter(property.getSetter());
				// 判断是否扩展枚举类型
				FlyEnum enumView = property.findAnnotation(FlyEnum.class);
				if (enumView != null) {
					// 是扩展枚举类型
					fieldDefinition.setDataType(FieldDataType.FLYENUM);
					String entityName = "", attrName = "";
					if (StringUtils.isBlank(enumView.entityName()) && StringUtils.isBlank(enumView.attrName())) {
						// 在FlyEnum注解中，没有指定引用关系，表示需要新注册枚举类型
						entityName = getTableDefinition().getName();
						attrName = fieldDefinition.getName();
						// registerEnumType(entityName, attrName, fieldDefinition.getTitle());
					} else if (StringUtils.isNotBlank(enumView.entityName())
							&& StringUtils.isNotBlank(enumView.attrName())) {
						// 表示引用
						entityName = enumView.entityName();
						attrName = enumView.attrName();
					} else {
						Assert.isTrue(false, "实体[]属性[]，数据类型为SysEnum，注解@SysEnum的entityName和attrName的值，要不都为空，要不都不为空.");
					}
					fieldDefinition.setRelationClass(entityName);
					fieldDefinition.setRelationTable(attrName);
				}
				// 判断是否扩展查找关系
				FlySearchRelation searchRelation = property.findAnnotation(FlySearchRelation.class);
				if (searchRelation == null) {
					// 设置字段类型
					FieldAttr fieldAttr = FieldDataType.fromJavaType(property.getType(), column);
					if (FieldDataType.NONE.equals(fieldDefinition.getDataType())) {
						fieldDefinition.setDataType(fieldAttr.getDataType());
					}
					fieldDefinition.setMaxLength((int) fieldAttr.getLength());
					fieldDefinition.setPrecision((int) fieldAttr.getPrecision());
					// 是枚举类型时
					if (FieldDataType.SYSENUM.equals(fieldDefinition.getDataType())) {
						fieldDefinition.setRelationClass(property.getType().getName());
					}
					// 值类型
					if (property.getGetter() != null) {
						fieldDefinition.setType(property.getGetter().getReturnType());
					}
					// 设置
					fieldDefinition.setIdField(property.isIdProperty());
					// 设置getter、setter方法
					Assert.notNull(property.getGetter(),
							"实体[" + getTableDefinition().getName() + "]属性[" + fieldDefinition.getName() + "]的Getter.");
					Assert.notNull(property.getSetter(), "实体[" + getTableDefinition().getName() + "]属性["
							+ fieldDefinition.getName() + "]的Setter为空.");
					// 设置字段取值函数
					fieldDefinition.setGetValueHandler(new DefaultGetFieldValueHandler(fieldDefinition));
					// 设置实体赋值函数
					fieldDefinition.setSetValueHandler(new DefaultSetFieldValueHandler(fieldDefinition));
					fieldDefinition.setParent(this);
					// 设置值自动生成器
					GenericGenerator generator = property.findAnnotation(GenericGenerator.class);
					if (generator != null) {
						fieldDefinition.setGenerator(generator);
					}
				} else {
					// 平台扩展的查找关联类型
					fieldDefinition.setType(property.getType());
					AssertUtil.parameterInvalide(ArrayUtils.isEmpty(searchRelation.entityNames()),
							"searchRelation.entityNames()");
					if (searchRelation.entityNames().length == 1) {
						fieldDefinition.setRelationClass(searchRelation.entityNames()[0]);
						fieldDefinition.setRelationTable(searchRelation.entityNames()[0]);
					} else {
						AssertUtil.notSupport("多个关联实体还未支持");
					}
					fieldDefinition.setRequired(!searchRelation.optional());
					fieldDefinition.setDataType(FieldDataType.FLYSEARCHRELATION);
					// 设置显示字段
					fieldDefinition.setLabelField(EntityMetaDataConstants.DEFAULT_LABEL_FIELD_NAME);
					fieldDefinition.setGetValueHandler(new FlySearchRelationGetFieldValueHandler(fieldDefinition));
					fieldDefinition.setSetValueHandler(new AssociationSetFieldValueHandler(fieldDefinition));
					fieldDefinition.setParent(this);
				}
				fieldsMap.put(fieldDefinition.getName(), fieldDefinition);
			}
		});
		entity.doWithAssociations(new SimpleAssociationHandler() {

			@Override
			public void doWithAssociation(Association<? extends PersistentProperty<?>> association) {
				Column column = association.getInverse().findAnnotation(Column.class);
				final FieldDefinition field = new FieldDefinition(association.getInverse());
				field.setName(association.getInverse().getName());
				if (association.getInverse().isCollectionLike()) {
					// 子表关系
					field.setType(association.getInverse().getComponentType());
					String relationClass = field.getType().getName();
					field.setRelationClass(relationClass);
					field.setRelationTable(ClassUtil.getClassShortName(relationClass).toLowerCase());
					field.setDataType(FieldDataType.MDRELATION);
					// 设置字段取值函数
					field.setGetValueHandler(new DefaultGetFieldValueHandler(field));

					// 获取子表字段
					OneToMany oneToMany = association.getInverse().findAnnotation(OneToMany.class);
					if (oneToMany != null && StringUtils.isNotBlank(oneToMany.mappedBy())) {
						FieldDefinition tmp = new FieldDefinition();
						tmp.setTitle("临时，读取时更新");
						tmp.setName(oneToMany.mappedBy());
						field.setRelationField(tmp);
					} else {
						AssertUtil.parameterEmpty("OneToMany.mappedBy",
								"主子表关系必须设置实体[" + getTableDefinition().getName() + "]子表属性[" + field.getName()
										+ "]的OneToMany.mappedBy属性.");
					}

				} else {
					// 查找关系
					field.setType(association.getInverse().getType());
					String relationClass = field.getType().getName();
					field.setRelationClass(relationClass);
					field.setRelationTable(ClassUtil.getClassShortName(relationClass).toLowerCase());
					field.setDataType(FieldDataType.SEARCHRELATION);

					FKFieldDefinition fkFieldDefinition = new FKFieldDefinition(this);

					ManyToOne manyToOne = association.getInverse().findAnnotation(ManyToOne.class);
					if (manyToOne != null) {
						field.setRequired(!manyToOne.optional());
					}

					JoinColumn joinColumn = association.getInverse().findAnnotation(JoinColumn.class);
					if (joinColumn != null) {
						// 单个字段外键关联
						if (StringUtils.isNotBlank(joinColumn.name())) {
							field.setFieldName(StringUtil.getHibernateName(joinColumn.name()));
						} else {
							field.setFieldName(StringUtil.getHibernateName(field.getName() + "_uid"));
						}
						String[] fkFields = new String[] { field.getName() };
						String relationField = joinColumn.referencedColumnName();
						if (StringUtils.isBlank(relationField)) {
							relationField = "uid";
						}
						String[] relationFields = new String[] { relationField };
						fkFieldDefinition.setFkFields(fkFields);
						fkFieldDefinition.setRelationFields(relationFields);
					} else {
						// 多个字段外键关联
						JoinColumns joinColumns = association.getInverse().findAnnotation(JoinColumns.class);
						if (joinColumns != null) {
							// 复合外键关联，字段名称存放 name=refname;name2=refname2
							String fieldNames = "";
							String[] fkFields = new String[joinColumns.value().length];
							String[] relationFields = new String[joinColumns.value().length];
							int index = 0;
							for (JoinColumn joinColumn2 : joinColumns.value()) {
								fieldNames += ";" + joinColumn2.name() + "=" + joinColumn2.referencedColumnName();
								fkFields[index] = joinColumn2.name();
								relationFields[index] = joinColumn2.referencedColumnName();
								index++;
							}
							fieldNames = fieldNames.substring(1);
							// 标记为后续还要处理
							field.setFieldName("tmp|" + fieldNames);
							fkFieldDefinition.setFkFields(fkFields);
							fkFieldDefinition.setRelationFields(relationFields);
						}
					}
					// 设置显示字段
					MetaDataView metaDataView = field.getType().getAnnotation(MetaDataView.class);
					if (metaDataView != null && metaDataView.tableView() != null
							&& StringUtils.isNotBlank(metaDataView.tableView().labelField())) {
						field.setLabelField(metaDataView.tableView().labelField());
					} else {
						field.setLabelField(EntityMetaDataConstants.DEFAULT_LABEL_FIELD_NAME);
					}
					// 设置字段取值函数
					field.setGetValueHandler(new SearchRelationGetFieldValueHandler(field));
					//
					fkFieldDefinition.setName(field.getName());
					fkFieldDefinition.setField(field.getName());
					fkFieldDefinition.setRelationClass(field.getRelationClass());
					fkFieldDefinition.setRelationTable(field.getRelationTable());
					//metaData.getFkFieldDefinitions().put(fkFieldDefinition.getField(), fkFieldDefinition);
				}
				// 设置值类型
				if (association.getInverse().getGetter() != null) {
					field.setType(association.getInverse().getGetter().getReturnType());
				}
				// 设置
				field.setIdField(association.getInverse().isIdProperty());
				// 设置getter、setter方法
				field.setGetter(association.getInverse().getGetter());
				field.setSetter(association.getInverse().getSetter());
				// 设置实体赋值函数
				field.setSetValueHandler(new AssociationSetFieldValueHandler(field));
				field.setParent(this);
				fieldsMap.put(field.getName(), field);
			}
		});
	}
}
