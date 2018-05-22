package org.myfly.platform.core.metadata.entity;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.metadata.define.BaseDenifition;
import org.springframework.util.Assert;

/**
 * 实体主键定义类 <br>
 * 1、用于定义实体的主键，唯一标示；主键类型有：单主键、复合主键、主键类 <br>
 * 2、实现获取主键值功能 <br>
 * 3、实现设置主键值功能 <br>
 * 
 * @author xiangwanhong
 *
 */
public class PKFieldDefinition extends BaseDenifition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7648537105953605065L;

	/**
	 * 主键字段
	 */
	private String[] fields;
	/**
	 * 主键类型
	 */
	private KeyType keyType = KeyType.SINGLE;

	private IGetFieldValueHandler getValueHandler;

	private ISetFieldValueHandler setValueHandler;
	
	public PKFieldDefinition() {
	}

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
		if (ArrayUtils.isNotEmpty(fields)) {
			if (fields.length == 1) {
				setKeyType(KeyType.SINGLE);
			} else {
				setKeyType(KeyType.MULTIID);
			}
		}
		initFieldValueHandler();
	}
	
	private void initFieldValueHandler() {
		if (KeyType.SINGLE == getKeyType()) {
			
		}
	}

	public KeyType getKeyType() {
		return keyType;
	}

	public void setKeyType(KeyType keyType) {
		this.keyType = keyType;
	}

	public IGetFieldValueHandler getGetValueHandler() {
		return getValueHandler;
	}

	public void setGetValueHandler(IGetFieldValueHandler getValueHandler) {
		this.getValueHandler = getValueHandler;
	}

	public ISetFieldValueHandler getSetValueHandler() {
		return setValueHandler;
	}

	public void setSetValueHandler(ISetFieldValueHandler setValueHandler) {
		this.setValueHandler = setValueHandler;
	}

	@Override
	public String toString() {
		return super.toString() + ", keyType: " + getKeyType() + ", fields: " + getFields();
	}

	@Override
	public void validate() {
		Assert.notNull(getKeyType());
		Assert.notEmpty(getFields());
	}
}
