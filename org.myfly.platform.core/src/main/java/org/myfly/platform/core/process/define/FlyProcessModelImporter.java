package org.myfly.platform.core.process.define;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.lang3.BooleanUtils;
import org.myfly.platform.core.dbinit.ModelImporter;
import org.myfly.platform.core.process.model.PProcess;
import org.myfly.platform.core.process.model.PProcessPara;
import org.springframework.stereotype.Component;

@Component
public class FlyProcessModelImporter extends ModelImporter {

	@Override
	@Transactional
	public void importAll() {
		importProcessModels();
	}

	private void importProcessModels() {
		List<PProcess> processList = new ArrayList<>();
		List<PProcessPara> paraList = new ArrayList<>();
		FlyMemoryProcessModel.getInstance().getProcessModels().values().forEach(model -> {
			if (!BooleanUtils.isTrue(model.isFromDB())) {
				processList.add(model.toProcessPO());
			}
			model.getParas().values().forEach(item -> {
				if (!BooleanUtils.isTrue(item.isFromDB())) {
					paraList.add(item.toProcessParaPO());
				}
			});
		});
		getDataService().batchSaveEntity(processList);
		getDataService().batchSaveEntity(paraList);
	}

}
