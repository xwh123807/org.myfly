package org.myfly.platform.core.dbinit;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.myfly.platform.core.datamodel.define.FlyMemoryDataModel;
import org.myfly.platform.core.datamodel.model.PColumn;
import org.myfly.platform.core.datamodel.model.PDataType;
import org.myfly.platform.core.datamodel.model.PElement;
import org.myfly.platform.core.datamodel.model.PEntityType;
import org.myfly.platform.core.datamodel.model.PRefList;
import org.myfly.platform.core.datamodel.model.PRefTable;
import org.myfly.platform.core.datamodel.model.PReference;
import org.myfly.platform.core.datamodel.model.PTable;
import org.springframework.stereotype.Component;

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
			list.add(result);
		});
		getDataService().batchSaveEntity(list);
	}

	private void importRefTables() {
		List<PReference> list = new ArrayList<>();
		List<PRefTable> refList = new ArrayList<>();
		getFlyMemoryDataModel().getRefTables().values().stream().filter(p -> !p.isFromDB()).forEach(item -> {
			PReference result = item.toReferencePO();
			list.add(result);
			PRefTable refTable = item.toRefTablePO();
			refList.add(refTable);
		});
		getDataService().batchSaveEntity(list);
		getDataService().batchSaveEntity(refList);
	}

	private void importEntityTypes() {
		List<PEntityType> list = new ArrayList<>();
		getFlyMemoryDataModel().getEntityTypes().values().stream().filter(p -> !p.isFromDB()).forEach(item -> {
			PEntityType result = item.toEntityTypePO();
			list.add(result);
		});
		getDataService().batchSaveEntity(list);
	}

	private void importElements() {
		List<PElement> list = new ArrayList<>();
		getFlyMemoryDataModel().getElements().values().stream().filter(p -> !p.isFromDB()).forEach(item -> {
			PElement result = item.toElementPO();
			list.add(result);
		});
		getDataService().batchSaveEntity(list);
	}

	private void importRefLists() {
		List<PReference> list = new ArrayList<>();
		List<PRefList> refList = new ArrayList<>();
		getFlyMemoryDataModel().getRefLists().values().stream().forEach(item -> {
			PReference result = item.toReferencePO();
			if (!item.isFromDB()) {
				list.add(result);
			}
			item.getItems().values().stream().filter(p -> !p.isFromDB()).map(listItem -> listItem.toRefListPO())
					.forEach(refListPO -> refList.add(refListPO));
		});
		getDataService().batchSaveEntity(list);
		getDataService().batchSaveEntity(refList);
	}

	private void importFlyDataModels() {
		List<PTable> list = new ArrayList<>();
		List<PColumn> colList = new ArrayList<>();
		getFlyMemoryDataModel().getFlyDataModels().values().forEach(item -> {
			PTable result = item.toTablePO();
			if (!item.isFromDB()) {
				list.add(result);
			}
			item.getColumnMap().values().stream().filter(p -> !p.isFromDB()).map(column -> column.toColumnPO())
					.forEach(columnPO -> colList.add(columnPO));
		});
		getDataService().batchSaveEntity(list);
		getDataService().batchSaveEntity(colList);
	}
}
