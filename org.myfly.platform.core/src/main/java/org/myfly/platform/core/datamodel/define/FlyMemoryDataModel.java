package org.myfly.platform.core.datamodel.define;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ClassUtils;
import org.myfly.platform.core.domain.FlyDataType;
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
		flyDataModels = new LinkedHashMap<>();
		entityTypes = new LinkedHashMap<>();
		elements = new LinkedHashMap<>();
		refTables = new LinkedHashMap<>();
		refLists = new LinkedHashMap<>();
		dataTypes = new LinkedHashMap<>();
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
	 * 查找指定的FRefTable，可能存在多条记录
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
	public List<FRefTable> getRefTableByTable(String tableApiName) {
		return getRefTables().values().stream().filter(item -> item.getTableApiName().equals(tableApiName))
				.collect(Collectors.toList());
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
				if (item.isFromDB()) {
					item.validate();
				}
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
	 * 1、更新引用表，将 2、获取列对应的系统元素，PColumn.element和elementID <br>
	 * 
	 * @param item
	 * @return
	 */
	public List<String> updateReferences(List<FlyDataModel> list) {
		List<String> errors = new ArrayList<>();
		list.forEach(item -> {
			// 更新引用表
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
						// 列表类型
						updateElementRefList(item.getApiName(), column, errors);
					} else if (FlyDataType.Table.equals(element.getDataType())
							|| FlyDataType.TableDirect.equals(element.getDataType())) {
						// 表类型
						updateElementRefTable(item.getApiName(), column, errors);
					}
					// 从系统元素复制元素的属性
					copyFieldPropertyFromElement(column);
					// 主键列，则将类型值为ID
					if (BooleanUtils.isTrue(column.getIsKey())) {
						column.setDataType(FlyDataType.ID);
						column.setValueHandler(ValueHandlerFactory.getValueHandler(column));
					}
//					if (column.isRefTableColumn()) {
//						if (!BooleanUtils.isTrue(column.getIsKey()) && column.getElement().getRefTable() != null
//								&& column.getElement().getRefTable().getTableApiName().equals(item.getApiName())) {
//							column.setDataType(FlyDataType.ID);
//							column.setValueHandler(ValueHandlerFactory.getValueHandler(column));
//						}
//					}
				} else {
					errors.add("实体[" + item.getApiName() + "]的列[" + column.getApiName() + "]没有对应的element");
				}
			});
		});
		return errors;
	}

	/**
	 * 更新引用表定义，根据keyColumnName、displayColumnName更新对应的columnID
	 * 
	 * @param dataModel
	 * @param errors
	 */
	private void updateRefTable(FlyDataModel dataModel, List<String> errors) {
		List<FRefTable> refTables = getRefTableByTable(dataModel.getApiName());
		if (CollectionUtils.isNotEmpty(refTables)) {
			refTables.forEach(refTable -> {
				if (!StringUtils.hasLength(refTable.getRefTable().getTableID())) {
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
						errors.add(
								"实体[" + dataModel.getApiName() + "]没有名称为[" + refTable.getDisplayColumnName() + "]的属性");
					}
				} else if (!refTable.getRefTable().getTableID().equals(dataModel.getTableID())) {
					errors.add("引用表[" + refTable.getApiName() + "]与实体[" + dataModel.getApiName() + "]的tableID属性不一致");
				}
				refTable.validate();
			});
		}
	}

	/**
	 * 从系统元素复制属性到字段
	 * 
	 * @param column
	 */
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
		column.setValueHandler(ValueHandlerFactory.getValueHandler(column));
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
			// 找不到引用属性对应的引用表，可能是未正确定义或者引用表没有加载
			element.setHelp("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" + element.getApiName()
					+ "]的属性[RefTable]不能为空");
			System.err.println("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" + element.getApiName()
					+ "]的属性[RefTable]不能为空");
			// errors.add("实体[" + entityName + "]的属性[" + column.getApiName() + "]对应元素[" +
			// element.getApiName()
			// + "]的属性[RefTable]不能为空");
		}
	}
}
