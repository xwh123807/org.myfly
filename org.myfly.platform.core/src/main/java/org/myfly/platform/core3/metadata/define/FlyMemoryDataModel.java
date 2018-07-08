package org.myfly.platform.core3.metadata.define;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ClassUtils;
import org.myfly.platform.core3.domain.FlyDataType;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * 内存数据模型 <br>
 * 1、系统启动后，在内存构建数据模型：先从数据库中加载，再从代码级加载 <br>
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

	public Map<String, FDataType> getDataTypes() {
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

	public void addDataTypes(List<FDataType> list) {
		addList(list, getDataTypes(), false);
	}

	/**
	 * 查找指定的FRefList
	 * 
	 * @param referenceID
	 * @return
	 */
	public FRefList getRefList(String referenceID) {
		for (FRefList item : getRefLists().values()) {
			if (item.getReferenceID().equals(referenceID)) {
				return item;
			}
		}
		return null;
	}

	/**
	 * 查找指定的FRefTable
	 * 
	 * @param referenceID
	 * @return
	 */
	public FRefTable getRefTable(String referenceID) {
		for (FRefTable item : getRefTables().values()) {
			if (item.getReferenceID().equals(referenceID)) {
				return item;
			}
		}
		return null;
	}

	/**
	 * 查找指定的FRefTable
	 * 
	 * @param tableApiName
	 * @return
	 */
	public FRefTable getRefTableByTable(String tableApiName) {
		for (FRefTable item : getRefTables().values()) {
			if (item.getTableClassName().equals(tableApiName)) {
				return item;
			}
		}
		return null;
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
	 * 添加列表到目标map中 <br>
	 * 1、先从数据库中加载，再从代码级加载 <br>
	 * TODO 重复兼容处理
	 * 
	 * @param list
	 * @param target
	 * @param forceOverride
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addList(List<? extends IDefinition> list, Map target, boolean forceOverride) {
		if (CollectionUtils.isNotEmpty(list)) {
			list.forEach((IDefinition item) -> {
				item.validate();
				if (!target.containsKey(item.getKey()) || forceOverride) {
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
		addList(list, getEntityTypes(), false);
	}

	public void addElements(List<FElement> list, boolean override) {
		addList(list, getElements(), override);
	}

	public void addRefLists(List<FRefList> list) {
		addList(list, getRefLists(), false);
	}

	public void addRefTables(List<FRefTable> list) {
		addList(list, getRefTables(), false);
	}

	public List<String> addFlyDataModels(List<FlyDataModel> list) {
		addList(list, getFlyDataModels(), false);
		return updateReferences(list);
	}

	/**
	 * 更新数据模型关联属性 <br>
	 * 1、PColumn.element和elementID <br>
	 * 
	 * @param item
	 * @return
	 */
	public List<String> updateReferences(List<FlyDataModel> list) {
		List<String> errors = new ArrayList<>();
		list.forEach(item -> {
			updateRefTable(item, errors);
			item.getColumnMap().values().stream().forEach(column -> {
				FElement element = getElements().get(column.getApiName());
				if (element != null) {
					if (StringUtils.hasLength(column.getElementID())) {
						if (!element.getElementID().equals(column.getElementID())) {
							errors.add("实体[" + item.getApiName() + "]的列[" + column.getApiName()
									+ "]的elementID与element的elementID不一致");
						}
					} else {
						column.setElementID(element.getElementID());
					}
					column.setElement(element);
					if (FlyDataType.List.equals(element.getDataType())) {
						//列表类型
						updateElementRefList(item.getApiName(), column, errors);
					} else if (FlyDataType.Table.equals(element.getDataType())
							|| FlyDataType.TableDirect.equals(element.getDataType())) {
						//表类型
						updateElementRefTable(item.getApiName(), column, errors);
					}
					copyFieldPropertyFromElement(column);
				} else {
					errors.add("实体[" + item.getApiName() + "]的列[" + column.getApiName() + "]没有对应的element");
				}
			});
		});
		return errors;
	}

	private void updateRefTable(FlyDataModel dataModel, List<String> errors) {
		FRefTable refTable = getRefTableByTable(dataModel.getApiName());
		if (refTable != null) {
			refTable.getRefTable().setTableID(dataModel.getTableID());
			FlyColumn keyColumn = dataModel.getColumnMap().get(refTable.getKeyColumnName());
			if (keyColumn != null) {
				refTable.getRefTable().setKeyColumn(keyColumn.getColumnID());
			} else {
				errors.add("实体[" + dataModel.getApiName() + "]没有名称为[" + refTable.getKeyColumnName() + "]的属性");
			}
			FlyColumn displayColumn = dataModel.getColumnMap().get(refTable.getDisplayColumnName());
			if (displayColumn != null) {
				refTable.getRefTable().setDisplayColumn(displayColumn.getColumnID());
			} else {
				errors.add("实体[" + dataModel.getApiName() + "]没有名称为[" + refTable.getDisplayColumnName() + "]的属性");
			}
		}
	}

	private void copyFieldPropertyFromElement(FlyColumn column) {
		FElement element = column.getElement();
		Assert.notNull(element);
		if (!StringUtils.hasLength(column.getName())) {
			column.setName(element.getName());
		}
		if (!StringUtils.hasLength(column.getDescription())) {
			column.setDescription(element.getDescription());
		}
		if (!StringUtils.hasLength(column.getHelp())) {
			column.setHelp(element.getHelp());
		}
		column.setDataType(element.getDataType());
		column.setEntityType(element.getEntityType());
		column.setFieldLength(element.getFieldLength());
		column.setReferenceID(element.getReferenceID());
	}

	/**
	 * 列表数据类型，校验列表是否对应
	 * 
	 * @param entityName
	 * @param column
	 * @param errors
	 */
	private void updateElementRefList(String entityName, FlyColumn column, List<String> errors) {
		FElement element = column.getElement();
		FRefList refList = null;
		if (StringUtils.hasLength(element.getReferenceID())) {
			// 按referenceID查找
			refList = getRefList(element.getReferenceID());
			if (refList == null) {
				errors.add("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" + element.getApiName()
						+ "]找不到referenceID=" + element.getReferenceID() + "的RefList");
			}
		} else if (StringUtils.hasLength(element.getReferenceName())) {
			// 按referenceName查找
			refList = getRefLists().get(element.getReferenceName());
			if (refList == null) {
				errors.add("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" + element.getApiName()
						+ "]找不到referenceName=" + element.getReferenceName() + "的RefList");
			}
		} else if (FlyDataType.YesNo.equals(column.getDataType())) {
			refList = getRefLists().get("YesNo");
		} else {
			// 都没指定，按属性名称查找
			refList = getRefLists().get(column.getApiName());
		}
		if (refList != null) {
			element.setReferenceID(refList.getReferenceID());
			element.setRefList(refList);
		} else {
			errors.add("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" + element.getApiName()
					+ "]的属性[RefList]不能为空");
		}
	}

	/**
	 * Table数据类型
	 * 
	 * @param apiName
	 * @param column
	 * @param errors
	 */
	private void updateElementRefTable(String entityName, FlyColumn column, List<String> errors) {
		FElement element = column.getElement();
		FRefTable refTable = null;
		if (StringUtils.hasLength(element.getReferenceID())) {
			// 按referenceID查找
			refTable = getRefTable(element.getReferenceID());
			if (refTable == null) {
				errors.add("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" + element.getApiName()
						+ "]找不到referenceID=" + element.getReferenceID() + "的RefTable");
			}
		} else if (StringUtils.hasLength(element.getReferenceName())) {
			// 按referenceName查找
			refTable = getRefTables().get(element.getReferenceName());
			if (refTable == null) {
				errors.add("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" + element.getApiName()
						+ "]找不到referenceName=" + element.getReferenceName() + "的RefTable");
			}
		} else {
			// 都没指定，按属性名称查找
			refTable = getRefTables().get(column.getApiName());
		}
		if (refTable != null) {
			element.setReferenceID(refTable.getReferenceID());
			element.setRefTable(refTable);
		} else {
			errors.add("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" + element.getApiName()
					+ "]的属性[RefTable]不能为空");
		}
	}
}
