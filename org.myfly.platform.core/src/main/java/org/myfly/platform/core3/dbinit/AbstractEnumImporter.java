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
public abstract class AbstractEnumImporter<S extends Enum<?>, T extends IFlyEntity> extends AbstractImporter {

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

}
