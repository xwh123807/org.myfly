package org.myfly.platform.core.metadata.define;

import org.apache.commons.lang.ClassUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.CommonSubTableType;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.RelationFieldDefinition;
import org.myfly.platform.core.utils.AppUtil;
import org.springframework.util.Assert;

/**
 * 通用子表字段定义
 * 
 * @author xiangwanhong
 *
 */
public class CommonSubTableFieldDenifition extends RelationFieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7537493796092126909L;

	public CommonSubTableFieldDenifition(CommonSubTableType commonSubTableType, String relationTable,
			String relationClass) {
		super(null);
		setDataType(FieldDataType.FLYMDRELATION);
		setName(commonSubTableType.getAttrName());
		setTitle(commonSubTableType.getTitle());
		setRelationClass(commonSubTableType.getTableClass());
		setRelationTable(ClassUtils.getShortClassName(commonSubTableType.getTableClass()));
		setType(String.class);

		RelationFieldDefinition fieldDefinition = new RelationFieldDefinition(null);
		fieldDefinition.setTitle("临时，读取时更新");
		fieldDefinition.setName(commonSubTableType.getParentAttrName());
		fieldDefinition.setRelationTable(relationTable);
		fieldDefinition.setRelationClass(relationClass);
		fieldDefinition.setType(String.class);
		fieldDefinition.setDataType(FieldDataType.FLYSEARCHRELATION);

		EntityMetaData metaData = AppUtil.getEntityMataDataService()
				.getEntityMetaData(commonSubTableType.getTableClass());
		RelationFieldDefinition parentField = metaData.getField(commonSubTableType.getParentAttrName());
		Assert.notNull(parentField,
				"实体[" + commonSubTableType.getTableClass() + "]不存在属性[" + commonSubTableType.getParentAttrName() + "]");
		fieldDefinition.setSetValueHandler(parentField.getSetValueHandler());
		fieldDefinition.setGetValueHandler(parentField.getGetValueHandler());
		fieldDefinition.setGetter(parentField.getGetter());
		fieldDefinition.setSetter(parentField.getSetter());

		setRelationField(fieldDefinition);
	}

}
