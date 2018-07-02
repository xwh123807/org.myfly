package org.myfly.platform.core3.dbinit;

import java.lang.reflect.Field;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.model.dict.PDataType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 从枚举FlyDataType导入数据到PDataType中.
 * 
 * @author xiangwanhong
 *
 */
@Component
@Scope("prototype")
public class DataTypeImporter extends AbstractEnumImporter<PDataType, FlyDataType> {

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
