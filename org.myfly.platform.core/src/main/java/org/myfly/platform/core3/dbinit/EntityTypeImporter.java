package org.myfly.platform.core3.dbinit;

import java.lang.reflect.Field;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.model.dict.PEntityType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 从枚举EntityType中导入数据到PEntityType中
 * 
 * @author xiangwanhong
 *
 */
@Component
@Scope("prototype")
public class EntityTypeImporter extends AbstractEnumImporter<PEntityType, EntityType> {

	@Override
	public PEntityType convertField(Field field) {
		PEntityType result = new PEntityType();
		result.setEntityTypeID(UUIDUtil.newUUID());
		result.setEntityType(field.getName());
		FlyField flyField = field.getAnnotation(FlyField.class);
		if (flyField != null) {
			result.setName(flyField.name());
			result.setDescription(flyField.description());
			result.setHelp(flyField.help());
			result.setProcessing(false);
		}
		return result;
	}

}
