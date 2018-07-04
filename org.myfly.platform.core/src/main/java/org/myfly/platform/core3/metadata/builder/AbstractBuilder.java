package org.myfly.platform.core3.metadata.builder;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.domain.IFlyMetaEntity;

public abstract class AbstractBuilder<S extends IFlyEntity, T extends IFlyEntity> {

	public void copyFlyFields(IFlyEntity result, IFlyEntity from) {
		result.setClientID(from.getClientID());
		result.setOrgID(from.getOrgID());
		result.setCreated(from.getCreated());
		result.setCreatedBy(from.getCreatedBy());
		result.setUpdated(from.getUpdated());
		result.setUpdatedBy(from.getUpdatedBy());
		result.setIsActive(from.getIsActive());
		if (result instanceof IFlyMetaEntity && from instanceof IFlyMetaEntity) {
			copyFlyMetaFields((IFlyMetaEntity) result, (IFlyMetaEntity) from);
		}
	}

	public void copyFlyMetaFields(IFlyMetaEntity result, IFlyMetaEntity from) {
		result.setName(from.getName());
		result.setDescription(from.getDescription());
		result.setHelp(from.getHelp());
	}

	/**
	 * 从实体类构建
	 * 
	 * @param builder
	 * @return
	 */
	public T build(S builder) {
		T result = convert(builder);
		return result;
	}

	public abstract T convert(S builder);

	/**
	 * 从枚举类构建
	 * 
	 * @param enumClass
	 * @return
	 */
	public List<T> loadFromEnumClass(Class<? extends Enum<?>> enumClass) {
		List<T> list = new ArrayList<>();
		for (Enum<?> item : enumClass.getEnumConstants()) {
			try {
				T target;
				target = convertEnum(enumClass.getDeclaredField(item.name()));
				list.add(target);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public T convertEnum(Field field) {
		return null;
	}

	/**
	 * 从实体类构建
	 * 
	 * @param entityClass
	 * @return
	 */
	public List<T> loadFromEntityClass(Class<? extends IFlyEntity> entityClass) {
		List<T> list = convertEntityClass(entityClass);
		return list;
	}

	public List<T> convertEntityClass(Class<? extends IFlyEntity> entityClass) {
		return null;
	}
}
