package org.myfly.platform.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Id;

import org.myfly.platform.core.metadata.annotation.FieldView;

public class EntityClassUtil {

	/**
	 * 获取实体类属性，包含超类重定义的实体属性
	 * 
	 * @param entityClass
	 * @return
	 */
	public static List<Field> getAllEntityFields(Class<?> entityClass) {
		List<Field> list = new ArrayList<>();
		FuncUtil.forEach(entityClass.getDeclaredFields(), field -> {
			if (field.getAnnotation(Column.class) != null || field.getAnnotation(FieldView.class) != null
					|| field.getAnnotation(Id.class) != null) {
				list.add(field);
			}
		});
		if (entityClass.getSuperclass() != null) {
			list.addAll(getAllEntityFields(entityClass.getSuperclass()));
		}
		return list;
	}

	/**
	 * 获取类所有方法，包含基类
	 * 
	 * @param cls
	 * @return
	 */
	public static Map<String, Method> getAllMethods(Class<?> cls) {
		Map<String, Method> list = new HashMap<>();
		FuncUtil.forEach(cls.getDeclaredMethods(), method -> {
			list.put(method.getName(), method);
		});
		if (cls.getSuperclass() != null) {
			list.putAll(getAllMethods(cls.getSuperclass()));
		}
		return list;
	}

	/**
	 * 获取实体类信息
	 * 
	 * @param entityClass
	 * @return
	 */
	public static Map<String, FieldInfo> getEntityFieldInfo(Class<?> entityClass) {
		List<Field> fields = getAllEntityFields(entityClass);
		Map<String, Method> methods = getAllMethods(entityClass);
		Map<String, FieldInfo> fieldInfos = new HashMap<>();
		fields.forEach(field -> {
			FieldInfo fieldInfo = new FieldInfo();
			String name = field.getName();
			String methodName = name.substring(0, 1).toUpperCase() + name.substring(1);
			fieldInfo.setField(field);
			if (Boolean.class.equals(field.getType()) || boolean.class.equals(field.getType())) {
				fieldInfo.setGetter(methods.get("is" + methodName));
			} else {
				fieldInfo.setGetter(methods.get("get" + methodName));
			}
			fieldInfo.setSetter(methods.get("set" + methodName));
			fieldInfos.put(name, fieldInfo);
		});
		return fieldInfos;
	}

	public static class FieldInfo {
		// 属性
		private Field field;
		// 属性对应的get方法
		private Method getter;
		// 属性对应的set方法
		private Method setter;

		public Field getField() {
			return field;
		}

		public void setField(Field field) {
			this.field = field;
		}

		public Method getGetter() {
			return getter;
		}

		public void setGetter(Method getter) {
			this.getter = getter;
		}

		public Method getSetter() {
			return setter;
		}

		public void setSetter(Method setter) {
			this.setter = setter;
		}
	}
}
