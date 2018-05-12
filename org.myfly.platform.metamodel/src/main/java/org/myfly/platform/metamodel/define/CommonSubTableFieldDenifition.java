package org.myfly.platform.metamodel.define;

import org.apache.commons.lang.ClassUtils;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.metamodel.domain.FieldDataType;
import org.myfly.platform.metamodel.utils.AppUtil;
import org.springframework.util.Assert;

/**
 * 通用子表字段定义
 * 
 * @author xiangwanhong
 *
 */
public class CommonSubTableFieldDenifition extends FieldDefinition {
	public CommonSubTableFieldDenifition(CommonSubTableType commonSubTableType, String relationTable,
			String relationClass) {
		setDataType(FieldDataType.FLYMDRELATION);
		setName(commonSubTableType.getAttrName());
		setLabel(commonSubTableType.getTitle());
		setRelationClass(commonSubTableType.getTableClass());
		setRelationTable(ClassUtils.getShortClassName(commonSubTableType.getTableClass()));
		setType(String.class);

		FieldDefinition fieldDefinition = new FieldDefinition();
		fieldDefinition.setLabel("临时，读取时更新");
		fieldDefinition.setName(commonSubTableType.getParentAttrName());
		fieldDefinition.setRelationTable(relationTable);
		fieldDefinition.setRelationClass(relationClass);
		fieldDefinition.setType(String.class);
		fieldDefinition.setDataType(FieldDataType.FLYSEARCHRELATION);

		EntityMetaData metaData = AppUtil.getEntityMataDataService()
				.getEntityMetaData(commonSubTableType.getTableClass());
		FieldDefinition parentField = metaData.getField(commonSubTableType.getParentAttrName());
		Assert.notNull(parentField, "实体[" + commonSubTableType.getTableClass() + "]不存在属性["
				+ commonSubTableType.getParentAttrName() + "]");
		fieldDefinition.setSetValueHandler(parentField.getSetValueHandler());
		fieldDefinition.setGetValueHandler(parentField.getGetValueHandler());
		fieldDefinition.setGetter(parentField.getGetter());
		fieldDefinition.setSetter(parentField.getSetter());

		setRelationField(fieldDefinition);
	}

}
