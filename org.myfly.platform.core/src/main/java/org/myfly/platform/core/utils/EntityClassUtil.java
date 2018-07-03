package org.myfly.platform.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core3.metadata.annotation.FlyField;

public class EntityClassUtil {

	/**
	 * 获取指定包下的实体类
	 * 
	 * @param packageName
	 * @return
	 */
	public static List<Class<?>> getEntityClasses(String packageName) {
		return ClassUtil.getClasses(packageName).stream().filter(item -> item.getAnnotation(Entity.class) != null)
				.collect(Collectors.toList());
	}

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
					|| field.getAnnotation(FlyField.class) != null || field.getAnnotation(Id.class) != null
					|| field.getAnnotation(OneToMany.class) != null || field.getAnnotation(ManyToOne.class) != null
					|| field.getAnnotation(OneToOne.class) != null || field.getAnnotation(EmbeddedId.class) != null) {
				list.add(field);
			}
		});
		if (entityClass.getSuperclass() != null) {
			list.addAll(getAllEntityFields(entityClass.getSuperclass()));
		}
		return list;
	}

	/**
	 * 获取实体类属性，包含超类重定义的实体属性
	 * @param entityClass
	 * @return
	 */
	public static List<Field> getAllEntityFields(String entityClass) {
		Class<?> cls = null;
		try {
			cls = Class.forName(entityClass);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
		return getAllEntityFields(cls);
	}

	/**
	 * 获取实体类所有属性
	 * 
	 * @param entityClass
	 * @return
	 */
	public static List<Field> getAllFields(Class<?> entityClass) {
		List<Field> list = new ArrayList<>();
		FuncUtil.forEach(entityClass.getDeclaredFields(), field -> {
			list.add(field);
		});
		if (entityClass.getSuperclass() != null) {
			list.addAll(getAllFields(entityClass.getSuperclass()));
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
	 * 获取实体类属性信息
	 * 
	 * @param entityClass
	 * @return
	 */
	public static Map<String, FieldInfo> getEntityFieldInfo(Class<?> entityClass) {
		List<Field> fields = getAllEntityFields(entityClass);
		Map<String, Method> methods = getAllMethods(entityClass);
		Map<String, FieldInfo> fieldInfos = new LinkedHashMap<>();
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
			if (fieldInfo.getGetter() == null) {
				fieldInfo.setGetter(methods.get("get" + methodName));
			}
			fieldInfo.setSetter(methods.get("set" + methodName));
			if (fieldInfo.getGetter() != null && fieldInfo.getSetter() != null) {
				fieldInfos.put(name, fieldInfo);
			}
		});
		return fieldInfos;
	}

	public static Map<String, FieldInfo> getEntityFieldInfo(String entityName) {
		try {
			return getEntityFieldInfo(Class.forName(entityName));
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("获取实体[" + entityName + "]字段信息失败： " + e.getMessage());
		}
	}

	/**
	 * 获取IDClass类属性信息
	 * 
	 * @param idClass
	 * @return
	 */
	public static Map<String, FieldInfo> getIdClassFieldInfo(Class<?> idClass) {
		List<Field> fields = getAllFields(idClass);
		fields.sort((a, b) -> a.getName().compareTo(b.getName()));
		Map<String, Method> methods = getAllMethods(idClass);
		Map<String, FieldInfo> fieldInfos = new LinkedHashMap<>();
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
			if (fieldInfo.getGetter() != null && fieldInfo.getSetter() != null) {
				fieldInfos.put(name, fieldInfo);
			}
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
