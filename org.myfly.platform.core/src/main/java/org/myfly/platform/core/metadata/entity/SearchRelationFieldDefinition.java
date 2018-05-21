package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;

import javax.persistence.ManyToOne;

import org.myfly.platform.core.domain.FieldDataType;

public class SearchRelationFieldDefinition extends RelationFieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4919572441568871799L;

	public SearchRelationFieldDefinition(Field field) {
		super(field);
		setDataType(FieldDataType.SEARCHRELATION);
		ManyToOne manyToOne = field.getAnnotation(ManyToOne.class);
		setRequired(!manyToOne.optional());
	}

/*		

		ManyToOne manyToOne = association.getInverse().findAnnotation(ManyToOne.class);
		if (manyToOne != null) {
			setRequired(!manyToOne.optional());
		}
		
		FKFieldDefinition fkFieldDefinition = new FKFieldDefinition(this);
		JoinColumn joinColumn = association.getInverse().findAnnotation(JoinColumn.class);
		if (joinColumn != null) {
			// 单个字段外键关联
			if (StringUtils.isNotBlank(joinColumn.name())) {
				setFieldName(StringUtil.getHibernateName(joinColumn.name()));
			} else {
				setFieldName(StringUtil.getHibernateName(getName() + "_uid"));
			}
			String[] fkFields = new String[] { getName() };
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
				setFieldName("tmp|" + fieldNames);
				fkFieldDefinition.setFkFields(fkFields);
				fkFieldDefinition.setRelationFields(relationFields);
				// 设置显示字段
				MetaDataView metaDataView = getType().getAnnotation(MetaDataView.class);
				if (metaDataView != null && metaDataView.tableView() != null
						&& StringUtils.isNotBlank(metaDataView.tableView().labelField())) {
					setLabelField(metaDataView.tableView().labelField());
				} else {
					setLabelField(EntityMetaDataConstants.DEFAULT_LABEL_FIELD_NAME);
				}
				// 设置字段取值函数
				setGetValueHandler(new SearchRelationGetFieldValueHandler(this));
				//
				fkFieldDefinition.setName(getName());
				fkFieldDefinition.setField(getName());
				fkFieldDefinition.setRelationClass(getRelationClass());
				fkFieldDefinition.setRelationTable(getRelationTable());
			}
		}
*/		
}
