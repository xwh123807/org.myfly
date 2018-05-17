package org.myfly.platform.core.metadata.service;

import java.util.List;

/**
 * 从JpaMetamodelMappingContext获取jpa实体类定义信息
 * 
 * @author xiangwanhong
 *
 */
public interface IJpaEntityService {
	/**
	 * 获取所有实体信息
	 * 
	 * @return
	 */
	public List<JpaEntityInfo> getJpaEntityInfos();

	/**
	 * 获取指定实体信息
	 * 
	 * @param name
	 * @return
	 */
	public JpaEntityInfo getJpaEntityInfo(final String name);
}
