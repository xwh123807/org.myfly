package org.myfly.platform.metadata.repository;

import java.util.List;

import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.system.core.domain.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "mtable", path = "mtable")
public interface MTableRepository extends JpaRepository<MTable, String>{
	/**
	 * 获取指定组织下所有的MTable
	 * @param tenant
	 * @return
	 */
	public List<MTable> findByTenant(@Param("tenant")Tenant tenant);
	
	/**
	 * 根据表名称获取表定义
	 * @param tableName
	 * @return
	 */
	public MTable findByTableName(@Param("tableName")String tableName);
}
