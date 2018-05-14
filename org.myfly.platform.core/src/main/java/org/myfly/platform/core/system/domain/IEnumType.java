package org.myfly.platform.core.system.domain;

import java.util.Set;

/**
 * 枚举类型，用于定义实体的枚举属性
 * 
 * @author xiangwanhong
 *
 */
public interface IEnumType extends IFlyEntity {
	public String getDescription();

	public void setDescription(String description);

	/**
	 * 实体名称
	 * @return
	 */
	public String getEntityName();

	public void setEntityName(String entityName);

	/**
	 * 实体的枚举属性
	 * @return
	 */
	public String getAttrName();

	public void setAttrName(String attrName);

	public Set<IEnumValue> getEnumValues();

	public void setEnumValues(Set<IEnumValue> enumValues);
}
