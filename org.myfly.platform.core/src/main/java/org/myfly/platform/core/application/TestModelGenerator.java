package org.myfly.platform.core.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.testmodel.Detail;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 测试模型数据生成
 * 
 * @author xiangwanhong
 *
 */
@Component
@Transactional
public class TestModelGenerator {
	private Log log = LogFactory.getLog(TestModelGenerator.class);
	/**
	 * 是否已经初始化，如果已经初始化则退出
	 */
	private static boolean isInited;
	/**
	 * master主记录数
	 */
	private int masterCount = 50;
	/**
	 * 每个主记录的明细记录数
	 */
	private int detailCount = 50;
	@Autowired
	private IJpaDataAccessService dataService;

	/**
	 * 初始测试模型
	 */
	public void initAllTestModel() {
		if (isInited) {
			return;
		}
		initMasterModel();
		isInited = true;
	}

	/**
	 * 初始master-detail模型
	 */
	public void initMasterModel() {
		//dataService.delAll(Master.class);
		//如果已经存在记录数超过masterCount，则不添加
		long count = dataService.count(Master.class, null);
		if (count >= masterCount) {
			if (log.isInfoEnabled()) {
				log.info("数据库中TestModel[Master-Detail]数据已经有" + count +"行，不添加数据.");
			}
			return;
		}
		List<Master> masters = new ArrayList<>();
		IntStream.range(0, masterCount).forEach(i -> {
			Master master = new Master();
			master.setUid(UUIDUtil.newUUID());
			master.setName("name " + i);
			master.setDetails(new HashSet<>());
			IntStream.range(0, detailCount).forEach(j -> {
				Detail detail = new Detail();
				detail.setUid(UUIDUtil.newUUID());
				detail.setMaster(master);
				detail.setTitle("title" + j);
				master.getDetails().add(detail);
			});
			masters.add(master);
		});
		dataService.batchSaveEntity(masters);
	}
}
