package org.myfly.platform.core3.dbinit;

import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core3.domain.IFlyEntity;

public abstract class AbstractClassImporter<S extends IFlyEntity> extends AbstractImporter<S> {

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
}
