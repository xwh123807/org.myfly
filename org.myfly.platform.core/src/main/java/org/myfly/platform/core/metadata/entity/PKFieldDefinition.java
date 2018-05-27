package org.myfly.platform.core.metadata.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.Embeddable;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.metadata.define.BaseDenifition;
import org.myfly.platform.core.metadata.entity.handler.IFieldValueHandler;
import org.myfly.platform.core.metadata.entity.handler.PKFieldValueHandler;
import org.myfly.platform.core.utils.ClassUtil;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 实体主键定义类 <br>
 * 1、用于定义实体的主键，唯一标示；主键类型有：单主键、复合主键、主键类 <br>
 * 2、实现获取主键值功能 <br>
 * 3、实现设置主键值功能 <br>
 * 
 * 参考资料：<br>
 * https://www.cnblogs.com/boywwj/p/8031106.html<br>
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
	private EntityFieldDefinition[] fields;
	/**
	 * 主键类型
	 */
	private KeyType keyType = KeyType.SINGLE;
	/**
	 * 主键类，当KeyType为复合主键时，需要指定主键类
	 */
	private Class<?> idClass;
	/**
	 * 主键值设置和获取
	 */
	@JsonIgnore
	private IFieldValueHandler valueHandler;

	public PKFieldDefinition() {
	}

	public EntityFieldDefinition[] getFields() {
		return fields;
	}

	public void setFields(EntityFieldDefinition[] fields) {
		this.fields = Stream.of(fields).sorted((a, b) -> a.getName().compareTo(b.getName()))
				.collect(Collectors.toList()).toArray(new EntityFieldDefinition[] {});
		if (ArrayUtils.isNotEmpty(fields)) {
			if (fields.length == 1) {
				if (fields[0].getType().getAnnotation(Embeddable.class) != null) {
					setKeyType(KeyType.EMBED);
					setIdClass(fields[0].getType());
				} else {
					setKeyType(KeyType.SINGLE);
				}
			} else {
				setKeyType(KeyType.MULTIID);
			}
		}
		initFieldValueHandler();
	}

	private void initFieldValueHandler() {
		setValueHandler(new PKFieldValueHandler(this));
	}

	public KeyType getKeyType() {
		return keyType;
	}

	public void setKeyType(KeyType keyType) {
		this.keyType = keyType;
	}

	public IFieldValueHandler getValueHandler() {
		return valueHandler;
	}

	public void setValueHandler(IFieldValueHandler valueHandler) {
		this.valueHandler = valueHandler;
	}

	@JsonIgnore
	public String[] getFieldNames() {
		return Stream.of(getFields()).map(item -> item.getName()).collect(Collectors.toList()).toArray(new String[] {});
	}

	@Override
	public String toString() {
		return super.toString() + ", keyType: " + getKeyType() + ", fields: " + getFields();
	}

	@Override
	public void validate() {
		Assert.notNull(getKeyType());
		Assert.notEmpty(getFields());
		switch (getKeyType()) {
		case SINGLE:
			Assert.isTrue(getFields().length == 1);
			break;
		case EMBED:
			Assert.isTrue(getFields().length == 1);
			Assert.notNull(getIdClass());
			break;
		case MULTIID:
			Assert.isTrue(getFields().length > 1);
			Assert.notNull(getIdClass());
			break;
		}
		Assert.notNull(getValueHandler());
	}

	public Class<?> getIdClass() {
		return idClass;
	}

	public void setIdClass(Class<?> idClass) {
		this.idClass = idClass;
	}

	/**
	 * 构建实体主键
	 * 
	 * @param uid
	 * @return
	 */
	public Serializable buildPK(String uid) {
		if (KeyType.SINGLE.equals(getKeyType())) {
			return (Serializable) ClassUtil.convert(uid, getFields()[0].getType());
		} else {
			// Object obj = getIdClass().newInstance();
		}
		return null;
	}

	/**
	 * 构建实体主键
	 * 
	 * @param keyParams
	 * @return
	 */
	public Serializable buildPK(Map<String, Object> keyParams) {
		if (KeyType.SINGLE.equals(getKeyType())) {
			return (Serializable) ClassUtil.convert(keyParams.get(getFields()[0].getName()), getFields()[0].getType());
		} else {
			// Object obj = getIdClass().newInstance();
		}
		return null;
	}
}
