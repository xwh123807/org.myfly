package org.myfly.platform.core.metadata.define;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 元模型定义类基类
 * 
 * @author xiangwanhong
 *
 */
public abstract class BaseDenifition {
	/**
	 * 父对象
	 */
	@JsonIgnore
	private Object parent;
	/**
	 * 名称，唯一，api标识
	 */
	private String name;

	public BaseDenifition(Object owner) {
		setParent(owner);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("unchecked")
	public <T> T getParent() {
		return (T) parent;
	}

	public void setParent(Object parent) {
		this.parent = parent;
	};

	/**
	 * 根据字段属性名称构建字段定义
	 * 
	 * @param names
	 * @return
	 */
	public FieldDefinition[] buildFieldDefinitions(final String[] names) {
		FieldDefinition[] fields = null;
		if (names != null && names.length > 0) {
			fields = new FieldDefinition[names.length];
			for (int i = 0; i < names.length; i++) {
				fields[i] = new FieldDefinition(names[i]);
			}
		}
		return fields;
	}

	/**
	 * 获取字段定义属性名列表
	 * 
	 * @param fields
	 * @return
	 */
	public String[] getFieldNames(FieldDefinition[] fields) {
		String[] names = new String[fields.length];
		for (int i = 0; i < fields.length; i++) {
			names[i] = fields[i].getName();
		}
		return names;
	}

	public <T, R> List<R> convert(final T[] items, Class<R> targetClass, Action<T, R> action) {
		List<R> results = new ArrayList<R>();
		if (items != null && items.length > 0) {
			for (int i = 0; i < items.length; i++) {
				results.add(action.execute(i, items[i]));
			}
		}
		return results;
	}

	public interface Action<T, R> {
		R execute(int index, T item);
	}

	// /**
	// * 按给定的动作集构建功能集
	// *
	// * @param parent
	// * @param entityActions
	// * @return
	// */
	// public static ActionDenifition[] buildActionDefinitions(Object parent,
	// EntityAction[] entityActions) {
	// List<ActionDenifition> actionDenifitions = new ArrayList<>();
	// if (ArrayUtils.isNotEmpty(entityActions)) {
	// for (EntityAction entityAction : entityActions) {
	// ActionDenifition actionDenifition = new ActionDenifition(parent,
	// entityAction);
	// actionDenifitions.add(actionDenifition);
	// }
	// }
	// return actionDenifitions.toArray(new ActionDenifition[] {});
	// }

	// /**
	// * 更新实体操作集
	// *
	// * @param listDefinition
	// * @param enableActions
	// * @param itemActions
	// * @param listActions
	// */
	// public static void updateListDefinitionEntityActions(ListDefinition
	// listDefinition, boolean enableActions,
	// EntityAction[] itemActions, EntityAction[] listActions) {
	// // 更新实体列表操作集
	// if (enableActions && (ArrayUtils.isEmpty(itemActions))) {
	// // 启用操作集，并且没有定义ActionView，则添加全部操作集
	// listDefinition.setItemActions(buildActionDefinitions(listDefinition,
	// EntityAction.getAllEntityActions()));
	// } else if (enableActions && (ArrayUtils.isNotEmpty(itemActions))) {
	// // 按注解配置
	// listDefinition.setItemActions(buildActionDefinitions(listDefinition,
	// itemActions));
	// } else {
	// // 没有启用操作集时，只添加基本操作集
	// listDefinition.setItemActions(buildActionDefinitions(listDefinition,
	// EntityAction.getBaseEntityActions()));
	// }
	//
	// // 更新实体列表操作集
	// if (enableActions && (ArrayUtils.isEmpty(listActions))) {
	// // 启用操作集，并且没有定义ActionView，则添加全部操作集
	// listDefinition
	// .setListActions(buildActionDefinitions(listDefinition,
	// EntityAction.getAllEntityListActions()));
	// } else if (enableActions && (ArrayUtils.isNotEmpty(listActions))) {
	// // 按注解配置
	// listDefinition.setListActions(buildActionDefinitions(listDefinition,
	// listActions));
	// } else {
	// // 没有启用操作集时，只添加基本操作集
	// listDefinition
	// .setListActions(buildActionDefinitions(listDefinition,
	// EntityAction.getBaseEntityListActions()));
	// }
	// }
}
