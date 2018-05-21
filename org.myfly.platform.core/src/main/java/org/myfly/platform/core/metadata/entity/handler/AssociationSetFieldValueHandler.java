package org.myfly.platform.core.metadata.entity.handler;

import java.util.Map;

import org.myfly.platform.core.metadata.entity.RelationFieldDefinition;
import org.myfly.platform.core.metadata.entity.SetFieldValueHandler;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.AssertUtil;

public class AssociationSetFieldValueHandler implements SetFieldValueHandler {
	private RelationFieldDefinition field;

	public AssociationSetFieldValueHandler(RelationFieldDefinition field) {
		this.field = field;
	}

	@Override
	public void setFieldValue(Object obj, Object value) {
		if (obj instanceof Map) {
			Map<String, Object> entity = ((Map<String, Object>) obj);
			if (field.getFieldName().contains("=")) {
				
			}else{
				entity.put(field.getFieldName(), value);
			}
		} else {
			try {
				if (value != null && value.getClass() == field.getType()) {
					// 类型相同，不需要转换
					field.getSetter().invoke(obj, value);
				} else {
					// 类型不同，需要进行转换
					EntityMetaData metaData = AppUtil.getEntityMataDataService()
							.getEntityMetaData(field.getRelationClass());
					Object newEntity = metaData.getPkFieldDefinition().newEntity((String) value);
					field.getSetter().invoke(obj, newEntity);
				}
			} catch (Exception e) {
				AssertUtil.parameterEmpty(field.getSetter(), "field.getSetter()",
						"属性[" + field.getName() + "]没有定义Set方法");
				throw new IllegalArgumentException(
						"属性[" + field.getName() + "]值[" + value + "]设置失败，错误信息：" + e.getMessage());
			}
		}
	}
}
