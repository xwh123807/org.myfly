package org.myfly.platform.core3.dbinit;

import java.lang.reflect.Field;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.model.dict.PDataType;
import org.springframework.stereotype.Component;

@Component
public class DataTypeImporter extends AbstractImporter<FlyDataType, PDataType> {

	@Override
	public PDataType convertField(Field field) {
		PDataType result = new PDataType();
		result.setDataTypeID(UUIDUtil.newUUID());
		result.setDataType(field.getName());
		FlyField flyField = field.getAnnotation(FlyField.class);
		if (flyField != null) {
			result.setName(flyField.name());
			result.setDescription(flyField.description());
			result.setHelp(flyField.help());
		}
		return result;
	}

}
