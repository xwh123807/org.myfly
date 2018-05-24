package org.myfly.platform.core.metadata.entity.handler;

import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.KeyType;
import org.myfly.platform.core.metadata.entity.PKFieldDefinition;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.ClassUtil;

/**
 * 获取实体主键值 <br>
 * 1、返回结果转换为字符串 <br>
 * 2、如果有多个主键时，主键值用“_”符号拼接 <br>
 * 
 * @author xiangwanhong
 *
 */
public class PKFieldValueHandler implements IFieldValueHandler {
	private PKFieldDefinition pkFieldDefinition;

	public PKFieldValueHandler(PKFieldDefinition pkFieldDefinition) {
		this.setPkFieldDefinition(pkFieldDefinition);
	}

	public PKFieldDefinition getPkFieldDefinition() {
		return pkFieldDefinition;
	}

	public void setPkFieldDefinition(PKFieldDefinition pkFieldDefinition) {
		this.pkFieldDefinition = pkFieldDefinition;
	}

	@Override
	public Object getFieldValue(Object entity) {
		if (entity == null) {
			return null;
		} else {
			try {
				if (KeyType.SINGLE.equals(pkFieldDefinition.getKeyType())) {
					Object value = pkFieldDefinition.getFields()[0].getValueHandler().getFieldValue(entity);
					return ClassUtil.convertValueToString(value);
				} else if (KeyType.MULTIID.equals(pkFieldDefinition.getKeyType())) {
					String result = "";
					for (EntityFieldDefinition field : getPkFieldDefinition().getFields()) {
						Object value = field.getValueHandler().getFieldValue(entity);
						result += "_" + ClassUtil.convertValueToString(value);
					}
					return result.substring(1);
				} else {
					AssertUtil.notSupport(KeyType.MULTIID.getTitle() + "还未实现");
					return null;
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("获取主键值失败，错误信息：" + e.getMessage());
			}
		}
	}

	@Override
	public void setFieldValue(Object entity, Object value) {
		AssertUtil.parameterNotEmpty(null, entity, value);
		try {
			if (KeyType.SINGLE.equals(getPkFieldDefinition().getKeyType())) {
				pkFieldDefinition.getFields()[0].getValueHandler().setFieldValue(entity, value);
			} else if (KeyType.MULTIID.equals(getPkFieldDefinition().getKeyType())) {
				String[] values = ((String) value).split("_");
				if (pkFieldDefinition.getFields().length != values.length) {
					throw new IllegalArgumentException(
							values + "与主键字段个数" + pkFieldDefinition.getFields().length + "不相同.");
				}
				for (int i = 0; i < pkFieldDefinition.getFields().length; i++) {
					pkFieldDefinition.getFields()[i].getValueHandler().setFieldValue(entity, values[i]);
				}
			} else {
				AssertUtil.notSupport(KeyType.MULTIID.getTitle() + "还未实现");
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("设置主键值失败，错误信息：" + e.getMessage());
		}
	}
}
