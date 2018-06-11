package org.myfly.platform.core.metadata.entity.handler;

import org.myfly.platform.core.flydata.service.FlyEntityResult;

/**
 * 设置和获取实体属性值 <br>
 * 1、实体类型支持实体类和Map <br>
 * 
 * @author xiangwanhong
 *
 */
public interface IFieldValueHandler {
	/**
	 * 获取实体属性值
	 * 
	 * @param entity
	 * @return
	 */
	public Object getFieldValue(Object entity);

	/**
	 * 设置实体属性值
	 * @param entity
	 * @param value
	 */
	public void setFieldValue(Object entity, Object value);
	
	/**
	 * 获取实体增强属性值
	 * @param entity
	 * @return
	 */
	public FlyEntityResult getFlyFieldValue(Object entity);
}
