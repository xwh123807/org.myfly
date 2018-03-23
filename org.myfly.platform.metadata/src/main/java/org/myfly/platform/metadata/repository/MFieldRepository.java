package org.myfly.platform.metadata.repository;

import java.util.List;

import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "mfield", path = "mfield")
public interface MFieldRepository extends JpaRepository<MField, String>{
	/**
	 * 根据表ID获取该表的所有字段
	 * @param table
	 * @return
	 */
	public List<MField> findByTable(@Param("table")MTable table);
	/**
	 * 查找字段
	 * @param uid
	 * @param subTableAttr
	 * @return
	 */
	public MField findByTableAndAttrName(@Param("table")MTable table, @Param("attrName") String subTableAttr);
}
