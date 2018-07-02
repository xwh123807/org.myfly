package org.myfly.platform.core3.dbinit;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.myfly.platform.core3.domain.IFlyEntity;

/**
 * 解析S类，并将结果T导入到数据库中 <br>
 * 
 * @author xiangwanhong
 *
 * @param <S>
 * @param <T>
 */
public abstract class AbstractEnumImporter<T extends IFlyEntity, S extends Enum<?>> extends AbstractImporter<T> {

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
				if (target != null) {
					getTargets().add(target);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public abstract T convertField(Field field);

}
