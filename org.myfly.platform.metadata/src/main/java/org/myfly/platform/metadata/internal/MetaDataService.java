package org.myfly.platform.metadata.internal;

import java.util.List;

import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.repository.MFieldRepository;
import org.myfly.platform.metadata.repository.MTableRepository;
import org.myfly.platform.metadata.service.IMetaDataService;
import org.myfly.platform.system.core.domain.SGlobalName;
import org.myfly.platform.system.core.domain.TableMapping;
import org.myfly.platform.system.core.repository.SGlobalNameRepository;
import org.myfly.platform.system.core.repository.STableMappingRepository;
import org.myfly.platform.system.utils.AssertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames="metadata-service")
public class MetaDataService implements IMetaDataService{
	@Autowired
	private MTableRepository mtableRepository;
	@Autowired
	private MFieldRepository mfieldRepository;
	@Autowired
	private STableMappingRepository tableMappingRepository;
	@Autowired
	private SGlobalNameRepository globalNameRepository;
	
	/**
	 * 按表名查找
	 */
	@Override
	//TODO 由于对象涉及延迟加载，所以没法缓存
	//@Cacheable(key="'MTable-' + #tableName")
	public MTable findTableByTableName(String tableName){
		return mtableRepository.findByTableName(tableName);
	}
	
	/**
	 * 获取所有表映射信息
	 */
	@Override
	public List<TableMapping> findAllTableMapping() {
		return tableMappingRepository.findAll();
	}
	
	/**
	 * 根据数据库表名称获取实体映射信息
	 * @param tableName
	 * @return
	 */
	@Cacheable(key="'STableMapping-' + #tableName")
	public TableMapping findTableMapping(String tableName){
		AssertUtil.parameterEmpty(tableName, "tableName");
		TableMapping mapping = tableMappingRepository.findByTableName(tableName.toLowerCase());
		AssertUtil.recordNotFound(mapping, "STableMapping", "tableName", tableName);
		return mapping;
	}
	
	/**
	 * 根据uid获取对应的SGlobalName
	 * @param uid
	 * @return
	 */
	@Cacheable(key="'SGlobalName-' + #uid")
	public SGlobalName findGlobalName(String uid){
		AssertUtil.parameterEmpty(uid, "uid");
		SGlobalName entity = globalNameRepository.findOne(uid);
		AssertUtil.recordNotFound(entity, "SGlobalName", "uid", uid);
		return entity;
	}

	/*
	 * (non-Javadoc)
	 * @see org.myfly.platform.metadata.service.IMetaDataService#getSubTableName(java.lang.String, java.lang.String)
	 */
	@Override
	@Cacheable(key="'getSubTableName-' + #table + '-' + #subTableAttr")
	public String getSubTableName(String table, String subTableAttr) {
		AssertUtil.parameterEmpty(table, "table");
		AssertUtil.parameterEmpty(subTableAttr, "subTableAttr");
		MTable mtable = findTableByTableName(table);
		AssertUtil.recordNotFound(mtable, "MTable", "tableName", table);
		MField mfield = mfieldRepository.findByTableAndAttrName(mtable, subTableAttr);
		AssertUtil.recordNotFound(mfield, "MField", "table.attrName", table+"."+subTableAttr);
		return mfield.getRelationTable();
	}
}
