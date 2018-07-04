package org.myfly.platform.core3.metadata.define;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ClassUtils;

/**
 * 内存数据模型 <br>
 * 1、系统启动后，在内存构建数据模型 <br>
 * 2、访问数据模型时，必须从内存数据模型中获取 <br>
 * 
 * @author xiangwanhong
 *
 */
public class FlyMemoryDataModel {
	/**
	 * 单实例
	 */
	private static FlyMemoryDataModel Instance = new FlyMemoryDataModel();
	/**
	 * 实体类型
	 */
	private Map<String, FEntityType> entityTypes;
	
	/**
	 * 数据类型
	 */
	private Map<String, FDataType> dataTypes;

	/**
	 * 系统元素
	 */
	private Map<String, FElement> elements;

	/**
	 * 引用表
	 */
	private Map<String, FRefTable> refTables;

	/**
	 * 应用列表
	 */
	private Map<String, FRefList> refLists;
	/**
	 * 数据模型，key为模型名称
	 */
	private Map<String, FlyDataModel> flyDataModels;

	private FlyMemoryDataModel() {
		flyDataModels = new ConcurrentHashMap<>();
		entityTypes = new ConcurrentHashMap<>();
		elements = new ConcurrentHashMap<>();
		refTables = new ConcurrentHashMap<>();
		refLists = new ConcurrentHashMap<>();
		dataTypes = new ConcurrentHashMap<>();
	}

	public static FlyMemoryDataModel getInstance() {
		return Instance;
	}

	public Map<String, FEntityType> getEntityTypes() {
		return this.entityTypes;
	}
	
	public Map<String, FDataType> getDataTypes(){
		return this.dataTypes;
	}

	public Map<String, FRefTable> getRefTables() {
		return this.refTables;
	}

	public Map<String, FElement> getElements() {
		return this.elements;
	}

	public Map<String, FRefList> getRefLists() {
		return this.refLists;
	}

	public Map<String, FlyDataModel> getFlyDataModels() {
		return this.flyDataModels;
	}

	/**
	 * 获取指定的实体模型
	 * 
	 * @param entityName
	 * @return
	 */
	public FlyDataModel getFlyDataModel(String entityName) {
		FlyDataModel result = getFlyDataModels().get(entityName);
		if (result == null) {
			for (String className : getFlyDataModels().keySet()) {
				String name = ClassUtils.getShortClassName(className);
				if (name.equalsIgnoreCase(entityName)) {
					return getFlyDataModels().get(className);
				}
			}
		}
		return result;
	}

	/**
	 * 添加列表到目标map中
	 * 
	 * @param list
	 * @param target
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addList(List<? extends IDefinition> list, Map target) {
		if (CollectionUtils.isNotEmpty(list)) {
			list.forEach((IDefinition item) -> {
				item.validate();
				if (!target.containsKey(item.getKey())) {
					target.put(item.getKey(), item);
				} else {
					// 重复
				}
			});
		}
	}

	/**
	 * 增加FEntityType
	 * 
	 * @param list
	 */
	public void addEntityTypes(List<FEntityType> list) {
		addList(list, getEntityTypes());
	}

	public void addElements(List<FElement> list) {
		addList(list, getElements());
	}

	public void addRefLists(List<FRefList> list) {
		addList(list, getRefLists());
	}

	public void addRefTables(List<FRefTable> list) {
		addList(list, getRefTables());
	}

	public void addFlyDataModels(List<FlyDataModel> list) {
		addList(list, getFlyDataModels());
	}

	public void addDataTypes(List<FDataType> list) {
		addList(list, getDataTypes());
	}
}
