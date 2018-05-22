package org.myfly.platform.core.metadata.entity.handler;

import org.myfly.platform.core.metadata.entity.ISetFieldValueHandler;
import org.myfly.platform.core.metadata.entity.KeyType;
import org.myfly.platform.core.metadata.entity.PKFieldDefinition;
import org.myfly.platform.core.utils.AssertUtil;

/**
 * 设置实体主键值 <br>
 * 1、主键值传入参数为字符串 <br>
 * 2、如果有多个主键时，主键值用“_”符号拼接 <br>
 * 
 * @author xiangwanhong
 *
 */
public class PKSetFieldValueHandler implements ISetFieldValueHandler {

	private PKFieldDefinition pkFieldDefinition;

	public PKSetFieldValueHandler(PKFieldDefinition pkFieldDefinition) {
		this.setPkFieldDefinition(pkFieldDefinition);
	}

	@Override
	public void setFieldValue(Object entity, Object value) {
		AssertUtil.parameterNotEmpty(null, entity, value);
		try {
			if (KeyType.SINGLE.equals(getPkFieldDefinition().getKeyType())) {
				pkFieldDefinition.getFields()[0].getSetValueHandler().setFieldValue(entity, value);
			} else if (KeyType.MULTIID.equals(getPkFieldDefinition().getKeyType())) {
				String[] values = ((String) value).split("_");
				if (pkFieldDefinition.getFields().length != values.length) {
					throw new IllegalArgumentException(
							values + "与主键字段个数" + pkFieldDefinition.getFields().length + "不相同.");
				}
				for (int i = 0; i < pkFieldDefinition.getFields().length; i++) {
					pkFieldDefinition.getFields()[i].getSetValueHandler().setFieldValue(entity, values[i]);
				}
			} else {
				AssertUtil.notSupport(KeyType.MULTIID.getTitle() + "还未实现");
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("设置主键值失败，错误信息：" + e.getMessage());
		}
	}

	public PKFieldDefinition getPkFieldDefinition() {
		return pkFieldDefinition;
	}

	public void setPkFieldDefinition(PKFieldDefinition pkFieldDefinition) {
		this.pkFieldDefinition = pkFieldDefinition;
	}

}
