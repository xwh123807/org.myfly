package org.myfly.platform.core.datamodel.builder;

import java.lang.reflect.Field;

import org.myfly.platform.core.datamodel.annotation.FlyEntityType;
import org.myfly.platform.core.datamodel.define.FEntityType;
import org.myfly.platform.core.datamodel.model.PEntityType;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.util.Assert;

public class EntityTypeBuilder extends AbstractBuilder<PEntityType, FEntityType> {
	@Override
	public FEntityType convert(PEntityType builder) {
		FEntityType result = new FEntityType();
		copyFlyMetaFields(result, builder);
		result.setFromDB(true);
		result.setClasspath(builder.getClasspath());
		result.setEntityType(builder.getEntityType());
		result.setEntityTypeID(builder.getEntityTypeID());
		result.setModelPackage(builder.getModelPackage());
		result.setProcessing(builder.getProcessing());
		return result;
	}

	@Override
	public FEntityType convertEnum(Field field) {
		FlyEntityType anno = field.getAnnotation(FlyEntityType.class);
		Assert.notNull(anno, "不是有效的@FlyEntityType, " + field.toString());

		FEntityType result = new FEntityType();
		result.setEntityType(field.getName());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setModelPackage(anno.modelPackage());
		result.setClasspath(anno.classPath());
		result.setProcessing(false);
		result.setEntityTypeID(UUIDUtil.newUUID());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}
}
