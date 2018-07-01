package org.myfly.platform.core3.dbinit;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.internal.FlySystemResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * 解析S类，并将结果T导入到数据库中 <br>
 * 
 * @author xiangwanhong
 *
 * @param <S>
 * @param <T>
 */
public abstract class AbstractImporter<S extends Enum<?>, T extends IFlyEntity> {
	@Autowired
	private IJpaDataAccessService dataService;

	private List<T> targets;

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
	 * 加载枚举类，遍历枚举项，逐一转换<br>
	 * 
	 * @param enumClass
	 */
	public void load(Class<S> enumClass) {
		setTargets(new ArrayList<>());
		for (Enum<?> item : enumClass.getEnumConstants()) {
			T target;
			try {
				target = convertField(enumClass.getDeclaredField(item.name()));
				getTargets().add(target);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public abstract T convertField(Field field);

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
	 * 将targets实体保存到数据库中
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
