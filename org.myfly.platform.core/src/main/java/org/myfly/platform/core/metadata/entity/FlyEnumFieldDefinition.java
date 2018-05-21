package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.FlyEnum;
import org.springframework.util.Assert;

public class FlyEnumFieldDefinition extends SearchRelationFieldDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6886492223532682142L;

	public FlyEnumFieldDefinition(Field field) {
		super(field);
		setDataType(FieldDataType.FLYENUM);

		// 判断是否扩展枚举类型
		FlyEnum enumView = field.getAnnotation(FlyEnum.class);
		// 是扩展枚举类型
		String entityName = "", attrName = "";
		if (StringUtils.isBlank(enumView.entityName()) && StringUtils.isBlank(enumView.attrName())) {
			// 在FlyEnum注解中，没有指定引用关系，表示需要新注册枚举类型
			// entityName = getTableDefinition().getName();
			// attrName = getName();
			// registerEnumType(entityName, attrName, getTitle());
		} else if (StringUtils.isNotBlank(enumView.entityName()) && StringUtils.isNotBlank(enumView.attrName())) {
			// 表示引用
			entityName = enumView.entityName();
			attrName = enumView.attrName();
		} else {
			Assert.isTrue(false, "实体[]属性[]，数据类型为SysEnum，注解@SysEnum的entityName和attrName的值，要不都为空，要不都不为空.");
		}
		setRelationClass(entityName);
		setRelationTable(attrName);
	}

}
