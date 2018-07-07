package org.myfly.platform.core3.metadata.builder;

import java.lang.reflect.Field;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.define.FDataType;
import org.myfly.platform.core3.model.dict.PDataType;
import org.springframework.util.Assert;

public class DataTypeBuilder extends AbstractBuilder<PDataType, FDataType> {

	@Override
	public FDataType convert(PDataType builder) {
		return null;
	}

	@Override
	public FDataType convertEnum(Field field) {
		FlyField anno = field.getAnnotation(FlyField.class);
		Assert.notNull(anno, "不是有效的@FlyField, " + field.toString());

		FDataType result = new FDataType();
		result.setDataType(field.getName());
		result.setEntityType(anno.entityType().name());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setDataTypeID(UUIDUtil.newUUID());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}
}
