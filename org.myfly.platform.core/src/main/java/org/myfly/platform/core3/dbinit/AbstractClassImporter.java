package org.myfly.platform.core3.dbinit;

import java.util.ArrayList;
import java.util.List;

import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.domain.IFlyEntity;

public abstract class AbstractClassImporter<S extends IFlyEntity> {
	/**
	 * 需要保存的实体
	 */
	private List<S> targets;
	
	public AbstractClassImporter() {
		targets = new ArrayList<>();
	}
	
	public void load(Class<? extends IFlyEntity> entityClass) {
		convertClass(entityClass);
		EntityClassUtil.getEntityFieldInfo(entityClass).values().forEach(fieldInfo -> {
			convertField(fieldInfo);
		});
		convertFinish();
	}
	
	public void convertFinish() {
	}
	
	public abstract void convertClass(Class<? extends IFlyEntity> entityClass);
	
	public abstract void convertField(FieldInfo field);
	
	public void save() {
		
	}

	public List<S> getTargets() {
		return targets;
	}

	public void setTargets(List<S> targets) {
		this.targets = targets;
	}
	
	public String toJson() {
		return JSONUtil.toJSON(getTargets());
	}
	
	public void printJson() {
		System.out.println(toJson());
	}
}
