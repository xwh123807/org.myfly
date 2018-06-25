package org.myfly.platform.core3.dbinit;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core3.metadata.builder.BuildInFlyViewModelBuilder;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.view.PWindow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysViewModel {
	private Log log = LogFactory.getLog(SysDataModel.class);

	@Autowired
	private IJpaDataAccessService dataService;

	public void initSysViewModel() {
		List<PTable> tables = dataService.findAll(PTable.class);
		tables.forEach(table -> {
			if (log.isInfoEnabled()) {
				log.info("导入实体[" + table.getApiName() + "]默认显示模型...");
			}
			PWindow window = BuildInFlyViewModelBuilder.buildWindow(table);
			dataService.saveEntity(window);
			table.setWindow(window);
			dataService.saveEntity(table);
		});
	}
}
