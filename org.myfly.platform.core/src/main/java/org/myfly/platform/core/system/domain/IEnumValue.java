package org.myfly.platform.core.system.domain;

/**
 * 枚举值
 * 
 * @author xiangwanhong
 *
 */
public interface IEnumValue extends IFlyEntity {
	/**
	 * 所属枚举类型
	 * 
	 * @return
	 */
	public IEnumType getEnumType();

	public void setEnumType(IEnumType enumType);

	/**
	 * 是否为默认值
	 * 
	 * @return
	 */
	public Boolean getIsDefault();

	public void setIsDefault(Boolean isDefault);
}
