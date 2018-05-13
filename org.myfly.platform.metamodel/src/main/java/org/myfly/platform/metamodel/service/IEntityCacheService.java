package org.myfly.platform.metamodel.service;

/**
 * 实体缓存访问服务
 * @author xiangwanhong
 *
 */
public interface IEntityCacheService {

	<T> T getEntity(String entityName, String uid);

}
