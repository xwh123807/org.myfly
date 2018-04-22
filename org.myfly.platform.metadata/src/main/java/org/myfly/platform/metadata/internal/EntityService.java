package org.myfly.platform.metadata.internal;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.metadata.config.MetaDataProperties;
import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.service.IEntitySerivce;
import org.myfly.platform.system.domain.DevelopStateType;
import org.myfly.platform.system.domain.OwnerLevel;
import org.myfly.platform.system.domain.TableMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 实体服务
 * 
 * @author xiangwanhong
 *
 */

@Service
public class EntityService implements IEntitySerivce {
	private static Log log = LogFactory.getLog(EntityService.class);
	@Autowired
	private IJpaDataAccessService jpaAccessService;
	@Autowired
	private IEntityMetaDataService entityMetaDataService;
	@Autowired
	private MetaDataProperties metaDataProperties;

	public final String description = "系统数据，由系统初始化创建，不能修改和删除。";

	/**
	 * 从实体定义中获取STableMapping
	 */
	public TableMapping buildTableMappingFromEntity(EntityMetaData metaData) {
		TableMapping stableMapping = new TableMapping();
		stableMapping.setUid(UUIDUtil.newUUID());
		stableMapping.setTableName(metaData.getTableDefinition().getTableName());
		stableMapping.setEntityName(metaData.getEntityName());
		stableMapping.setClassName(metaData.getEntityClass().getName());
		stableMapping.setSchemaName(metaData.getTableDefinition().getSchema());
		return stableMapping;
	}

	private MTable buildTableFromEntity(EntityMetaData metaData) {
		MTable mtable = new MTable();
		mtable.setUid(UUIDUtil.newUUID());
		mtable.setName(metaData.getTableDefinition().getTitle());
		mtable.setDescription(metaData.getTableDefinition().getDescription());
		mtable.setSchemaName(metaData.getTableDefinition().getSchema());
		mtable.setEntityName(metaData.getEntityName());
		mtable.setTableName(metaData.getTableDefinition().getTableName());
		mtable.setOwnerLevel(OwnerLevel.SYSTEM);
		mtable.setEnableActivity(false);
		mtable.setEnableCommunication(false);
		mtable.setEnableReport(false);
		mtable.setEnableSearch(true);
		mtable.setEnableTrace(true);
		mtable.setDevelopState(DevelopStateType.DEPLOYED);
		return mtable;
	}
	
	@Transactional
	public void saveMetaData(TableMapping stableMapping, MTable mtable){
		jpaAccessService.saveEntity(stableMapping);
		jpaAccessService.saveEntity(mtable);
	}

	/**
	 * 保存系统级实体 1、遍历实体 2、存储实体到STableMapping中
	 */
	@Override
	public void initEntityMetadata() {
		if (!metaDataProperties.isEnable()){
			return;
		}
		if (log.isDebugEnabled()) {
			log.debug("初始化STableMapping");
		}
		// 保存实体表及映射
		for (Class<?> entity : entityMetaDataService.getAllEntityClasses()) {
			EntityMetaData metaData = entityMetaDataService.getEntityMetaData(entity.getName());
			TableMapping stableMapping = buildTableMappingFromEntity(metaData);
			if (log.isDebugEnabled()) {
				log.debug("处理实体，" + entity.getName());
			}
			final MTable mtable = buildTableFromEntity(metaData);
			// 保存实体的字段
			Set<MField> fields = new HashSet<>();
			for (FieldDefinition fieldDefinition : metaData.getFieldMap().values()) {
				MField field = new MField();
				field.setUid(UUIDUtil.newUUID());
				field.setName(fieldDefinition.getLabel());
				field.setDescription(fieldDefinition.getDescription());
				field.setAttrName(fieldDefinition.getName());
				field.setFieldName(fieldDefinition.getName());
				field.setFieldDataType(fieldDefinition.getDataType());
				field.setLength((long) fieldDefinition.getMaxLength());
				field.setRelationClassName(fieldDefinition.getRelationClass());
				field.setPrecisionSize((long) fieldDefinition.getPrecision());

				field.setCreated(DateUtil.nowSqlTimestamp());
				field.setTable(mtable);
				fields.add(field);
			}
			mtable.setFields(fields);
			saveMetaData(stableMapping, mtable);
		}
	}
}
