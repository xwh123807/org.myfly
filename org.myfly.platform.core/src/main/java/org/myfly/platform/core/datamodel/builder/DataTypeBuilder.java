package org.myfly.platform.core.datamodel.builder;

import java.lang.reflect.Field;

import org.myfly.platform.core.datamodel.annotation.FlyField;
import org.myfly.platform.core.datamodel.define.FDataType;
import org.myfly.platform.core.datamodel.model.PDataType;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.util.Assert;

public class DataTypeBuilder extends AbstractBuilder<PDataType, FDataType> {

	@Override
	public FDataType convert(PDataType builder) {
		FDataType result = new FDataType();
		result.setFromDB(true);
		result.setDataType(builder.getDataType());
		result.setDataTypeID(builder.getDataTypeID());
		result.setEntityType(builder.getEntityType());
		FlyEntityUtils.copyFlyMetaFields(result, builder);
		return result;
	}

	@Override
	public FDataType convertEnum(Field field) {
		FlyField anno = field.getAnnotation(FlyField.class);
		Assert.notNull(anno, "不是有效的@FlyField, " + field.toString());

		FDataType result = new FDataType();
		result.setDataType(field.getName());
		result.setDataTypeID(UUIDUtil.newUUID());
		result.setEntityType(anno.entityType().name());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}
}
