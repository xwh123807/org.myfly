package org.myfly.platform.core3.metadata.define;

import java.io.Serializable;
import java.util.Map;

/**
 * 表定义信息 <br>
 * 1、结构同AD_Table;<br>
 * 2、支持序列化和反序列化；<br>
 * 
 * @author xiangwanhong
 *
 */
public class FlyTableDefinition implements Serializable, IDefinition{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4759627026349305119L;
	/**
	 * 表属性map，Key为属性名称
	 */
	private Map<String, FlyFieldDefinition> flyFields;

	public FlyTableDefinition() {
	}

	/**
	 * 从Builder中构建表定义信息，从builder逐一复制属性
	 * 
	 * @param builder
	 */
	public FlyTableDefinition(FlyTableDefinition builder) {

	}

	@Override
	public void validate() {
	}
}
