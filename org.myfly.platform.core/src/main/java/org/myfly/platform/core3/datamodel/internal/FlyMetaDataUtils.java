package org.myfly.platform.core3.datamodel.internal;

import org.myfly.platform.core3.domain.IFlyEntity;

public class FlyMetaDataUtils {
	/**
	 * 创建实体类
	 * 
	 * @param entityClass
	 * @return
	 */
	public static <T extends IFlyEntity> T newFlyEntityInstance(Class<T> entityClass) {
		try {
			return (T) entityClass.newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException(
					"创建实体类[" + entityClass.getClass().getName() + "]失败，错误信息: " + e.getMessage());
		}
	}

}
