package org.myfly.platform.core3.dbinit;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.define.FlyMemoryDataModel;
import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PRefTable;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.dict.PDataType;
import org.myfly.platform.core3.model.dict.PElement;
import org.myfly.platform.core3.model.dict.PEntityType;
import org.myfly.platform.core3.model.dict.PRefList;
import org.myfly.platform.core3.model.dict.PReference;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 保存数据模型中没有报存到数据的<br>
 * 1、用于数据库初始化<br>
 * 2、代码级元模型有变动（新增或修改）<br>
 * 
 * @author xiangwanhong
 *
 */
@Component
public class FlyDataModelImporter extends ModelImporter {
	private FlyMemoryDataModel getFlyMemoryDataModel() {
		return FlyMemoryDataModel.getInstance();
	}

	@Transactional
	public void importAll() {
		importEntityTypes();
		importDataTypes();
		importRefLists();
		importRefTables();
		importElements();
		importFlyDataModels();
	}

	private void importDataTypes() {
		List<PDataType> list = new ArrayList<>();
		getFlyMemoryDataModel().getDataTypes().values().stream().filter(p -> !p.isFromDB()).forEach(item -> {
			PDataType result = item.toDataTypePO();
			if (!StringUtils.hasLength(result.getDataTypeID())) {
				result.setDataTypeID(UUIDUtil.newUUID());
				FlyEntityUtils.updateFlyEntityForSystem(result);
				list.add(result);
			}
		});
		getDataService().batchSaveEntity(list);
	}

	private void importRefTables() {
		List<PReference> list = new ArrayList<>();
		List<PRefTable> refList = new ArrayList<>();
		getFlyMemoryDataModel().getRefTables().values().stream().filter(p -> !p.isFromDB()).forEach(item -> {
			PReference result = item.toReferencePO();
			if (!StringUtils.hasLength(result.getReferenceID())) {
				result.setReferenceID(UUIDUtil.newUUID());
				FlyEntityUtils.updateFlyEntityForSystem(result);
				list.add(result);
				PRefTable refTable = item.toRefTablePO();
				refTable.setReferenceID(result.getReferenceID());
				FlyEntityUtils.updateFlyEntityForSystem(refTable);
				refList.add(refTable);
			}
		});
		getDataService().batchSaveEntity(list);
		getDataService().batchSaveEntity(refList);
	}

	private void importEntityTypes() {
		List<PEntityType> list = new ArrayList<>();
		getFlyMemoryDataModel().getEntityTypes().values().stream().filter(p -> !p.isFromDB()).forEach(item -> {
			PEntityType result = item.toEntityTypePO();
			if (!StringUtils.hasLength(result.getEntityTypeID())) {
				result.setEntityTypeID(UUIDUtil.newUUID());
				FlyEntityUtils.updateFlyEntityForSystem(result);
				list.add(result);
			}
		});
		getDataService().batchSaveEntity(list);
	}

	private void importElements() {
		List<PElement> list = new ArrayList<>();
		getFlyMemoryDataModel().getElements().values().stream().filter(p -> !p.isFromDB()).forEach(item -> {
			PElement result = item.toElementPO();
			if (!StringUtils.hasLength(result.getElementID())) {
				result.setElementID(UUIDUtil.newUUID());
				FlyEntityUtils.updateFlyEntityForSystem(result);
				list.add(result);
			}
		});
		getDataService().batchSaveEntity(list);
	}

	private void importRefLists() {
		List<PReference> list = new ArrayList<>();
		List<PRefList> refList = new ArrayList<>();
		getFlyMemoryDataModel().getRefLists().values().stream().forEach(item -> {
			PReference result = item.toReferencePO();
			if (!StringUtils.hasLength(result.getReferenceID())) {
				result.setReferenceID(UUIDUtil.newUUID());
				FlyEntityUtils.updateFlyEntityForSystem(result);
				if (!item.isFromDB()) {
					list.add(result);
				}
				List<PRefList> items = item.toRefListPOs();
				items.forEach(refItem -> {
					refItem.setReferenceID(result.getReferenceID());
					refItem.setRefListID(UUIDUtil.newUUID());
					FlyEntityUtils.updateFlyEntityForSystem(refItem);
					refList.add(refItem);
				});
			}
		});
		getDataService().batchSaveEntity(list);
		getDataService().batchSaveEntity(refList);
	}

	private void importFlyDataModels() {
		List<PTable> list = new ArrayList<>();
		List<PColumn> colList = new ArrayList<>();
		getFlyMemoryDataModel().getFlyDataModels().values().forEach(item -> {
			PTable result = item.toTablePO();
			if (!StringUtils.hasLength(result.getTableID())) {
				result.setTableID(UUIDUtil.newUUID());
				FlyEntityUtils.updateFlyEntityForSystem(result);
				if (!item.isFromDB()) {
					list.add(result);
				}
				List<PColumn> items = item.toColumnPOs();
				items.forEach(colItem -> {
					colItem.setTableID(result.getTableID());
					colItem.setColumnID(UUIDUtil.newUUID());
					FlyEntityUtils.updateFlyEntityForSystem(colItem);
					colList.add(colItem);
				});
			}
		});
		getDataService().batchSaveEntity(list);
		getDataService().batchSaveEntity(colList);
	}
}
