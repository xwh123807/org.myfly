package org.myfly.platform.core3.metadata.define;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 表字段定义信息 <br>
 * 1、结构同AD_Column<br>
 * 2、支持序列化、反序列化<br>
 * 
 * @author xiangwanhong
 *
 */
public class FlyFieldDefinition implements Serializable, IDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6259297911684388369L;

	/**
	 * 字段值读取类，增强数据类型一般都需要实现特殊读取类 <br>
	 */
	@JsonIgnore
	private IValueHandler valueHandler;

	public FlyFieldDefinition() {

	}

	/**
	 * 从字段构造器中获取属性定义，从Builder逐一复制属性
	 * 
	 * @param builder
	 */
	public FlyFieldDefinition(FlyFieldDefinition builder) {

	}

	@Override
	public void validate() {
	}
}
