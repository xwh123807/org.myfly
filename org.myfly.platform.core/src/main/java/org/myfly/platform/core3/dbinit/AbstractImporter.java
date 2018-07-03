package org.myfly.platform.core3.dbinit;

import java.util.ArrayList;
import java.util.List;

import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.internal.FlySystemResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class AbstractImporter<T extends IFlyEntity> {
	@Autowired
	private IJpaDataAccessService dataService;

	private List<T> targets;

	public AbstractImporter() {
		setTargets(new ArrayList<>());
	}

	public List<T> getTargets() {
		return targets;
	}

	public void setTargets(List<T> targets) {
		this.targets = targets;
	}

	public IJpaDataAccessService getDataService() {
		return this.dataService;
	}

	/**
	 * 保存前处理
	 */
	public void beforeSave() {
		Assert.notEmpty(getTargets(), "属性[targets]不能为空");
		getTargets().forEach(target -> {
			target.setIsActive(true);
			target.setCreated(DateUtil.nowSqlTimestamp());
			target.setCreatedBy(FlySystemResource.UID_SYSTEM_USER);
			target.setUpdated(DateUtil.nowSqlTimestamp());
			target.setUpdatedBy(FlySystemResource.UID_SYSTEM_USER);
			target.setClientID(FlySystemResource.UID_SYSTEM_CLIENT);
			target.setOrgID(FlySystemResource.UID_ALL_ORG);
		});
	}

	/**
	 * 将targets实体保存到数据库中<br>
	 * 如果targets中有多个不同类型的实体，子类则需要覆盖save方法，分开保存不同类的实体<br>
	 */
	public void save() {
		beforeSave();
		getDataService().batchSaveEntity(getTargets());
	}

	public String toJson() {
		return JSONUtil.toJSON(getTargets());
	}

	public void printJson() {
		System.out.println(toJson());
	}
}
