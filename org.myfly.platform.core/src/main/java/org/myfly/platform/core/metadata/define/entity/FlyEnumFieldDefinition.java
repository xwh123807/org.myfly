package org.myfly.platform.core.metadata.define.entity;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.FlyEnum;
import org.springframework.data.mapping.PersistentProperty;
import org.springframework.util.Assert;

public class FlyEnumFieldDefinition extends EntityFieldDefinition {

	public FlyEnumFieldDefinition(PersistentProperty<?> property) {
		super(property);
		setDataType(FieldDataType.FLYENUM);

		// 判断是否扩展枚举类型
		FlyEnum enumView = property.findAnnotation(FlyEnum.class);
		if (enumView != null) {
			// 是扩展枚举类型
			setDataType(FieldDataType.FLYENUM);
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

}
