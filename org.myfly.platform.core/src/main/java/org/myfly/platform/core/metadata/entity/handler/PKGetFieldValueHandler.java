package org.myfly.platform.core.metadata.entity.handler;

import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.IGetFieldValueHandler;
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
public class PKGetFieldValueHandler implements IGetFieldValueHandler {
	private PKFieldDefinition pkFieldDefinition;

	public PKGetFieldValueHandler(PKFieldDefinition pkFieldDefinition) {
		this.setPkFieldDefinition(pkFieldDefinition);
	}

	@Override
	public Object getFieldValue(Object entity) {
		if (entity == null) {
			return null;
		} else {
			try {
				if (KeyType.SINGLE.equals(pkFieldDefinition.getKeyType())) {
					Object value = pkFieldDefinition.getFields()[0].getGetValueHandler().getFieldValue(entity);
					return ClassUtil.convertValueToString(value);
				} else if (KeyType.MULTIID.equals(pkFieldDefinition.getKeyType())) {
					String result = "";
					for (EntityFieldDefinition field : getPkFieldDefinition().getFields()) {
						Object value = field.getGetValueHandler().getFieldValue(entity);
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

	public PKFieldDefinition getPkFieldDefinition() {
		return pkFieldDefinition;
	}

	public void setPkFieldDefinition(PKFieldDefinition pkFieldDefinition) {
		this.pkFieldDefinition = pkFieldDefinition;
	}
}
