package org.myfly.platform.core3.metadata.builder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core3.metadata.define.FlyColumn;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.ValueHandlerFactory;
import org.myfly.platform.core3.metadata.repository.IPColumnRepository;
import org.myfly.platform.core3.metadata.repository.IPTableRepository;
import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * 构造数据模型<br>
 * 
 * @author xiangwanhong
 *
 */
@Component
@Scope("prototype")
public class FlyDataModelBuilder extends FlyDataModel {
	private static Log log = LogFactory.getLog(FlyDataModelBuilder.class);
	@Autowired
	private IPTableRepository tableRepo;

	@Autowired
	private IPColumnRepository columnRepo;

	private Map<String, FieldInfo> fieldInfos;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1815063451624942610L;

	public FlyDataModelBuilder build(String apiName) {
		PTable table = tableRepo.findByApiName(apiName);
		Assert.notNull(table, "找不到apiName[" + apiName + "]的Table");
		fieldInfos = EntityClassUtil.getEntityFieldInfo(apiName);
		Assert.notEmpty(fieldInfos);
		buildTable(table);
		buildFields(columnRepo.findByTableID(table.getTableID()));
		return this;
	}

	public void buildFields(List<PColumn> columns) {
		Assert.notEmpty(columns);
		setColumnMap(new HashMap<>());
		columns.forEach(item -> {
			getColumnMap().put(item.getApiName(), buildFlyColumn(item));
		});
	}

	private FlyColumn buildFlyColumn(PColumn builder) {
		FlyColumn column = new FlyColumn();
		column.setApiName(builder.getApiName());
		column.setName(builder.getName());
		column.setDescription(builder.getDescription());
		column.setHelp(builder.getHelp());
		column.setColumnName(builder.getColumnName());
		column.setDataType(builder.getDataType());
		column.setReferenceID(builder.getReferenceID());
		column.setElementID(builder.getElementID());
		column.setFieldLength(builder.getFieldLength());
		column.setValueHandler(ValueHandlerFactory.getValueHandler(column));
		column.setIsKey(builder.getIsKey());
		if (BooleanUtils.isTrue(builder.getIsKey())) {
			// 列是主键
			if (getPrimaryKey() == null) {
				setPrimaryKey(column);
			} else {
				log.warn("只支持单主键，请检查实体[" + getApiName() + "]");
				//throw new IllegalArgumentException("只支持单主键，请检查实体[" + getApiName() + "]");
			}
		}
		FieldInfo fieldInfo = fieldInfos.get(column.getApiName());
		if (fieldInfo != null) {
			column.setGetter(fieldInfo.getGetter());
			column.setSetter(fieldInfo.getSetter());
		}
		return column;
	}

	public void buildTable(PTable builder) {
		setApiName(builder.getApiName());
		setName(builder.getName());
		setDescription(builder.getDescription());
		setHelp(builder.getHelp());
		setTableName(builder.getTableName());
		setEntityType(builder.getEntityType());
	}
}
