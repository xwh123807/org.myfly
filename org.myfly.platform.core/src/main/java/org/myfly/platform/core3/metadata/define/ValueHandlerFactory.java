package org.myfly.platform.core3.metadata.define;

import java.util.Map;

import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core3.metadata.handler.DefaultValueHandler;
import org.myfly.platform.core3.metadata.handler.ListValueHandler;
import org.myfly.platform.core3.metadata.handler.SubTableValueHandler;
import org.myfly.platform.core3.metadata.handler.TableDirectValueHandler;
import org.myfly.platform.core3.metadata.service.IFlyColumn;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * 字段值读取类工厂
 * 
 * @author xiangwanhong
 *
 */
@Component
public class ValueHandlerFactory {

	@Cacheable(cacheNames = "entity-fields")
	public Map<String, FieldInfo> getEntityFields(String entityName) {
		return EntityClassUtil.getEntityFieldInfo(entityName);
	}

	public FieldInfo getFieldInfo(String entityName, String fieldName) {
		return getEntityFields(entityName).get(fieldName);
	}

	/**
	 * 根据数据类型获取字段值读取类 <br>
	 * 
	 * @param dataType
	 * @return
	 */
	public IValueHandler getValueHandler(IFlyColumn column) {
		IValueHandler result = null;
		FieldInfo fieldInfo = getFieldInfo(column.getTable().getApiName(), column.getApiName());
		ColumnDefinition columnDefinition = new ColumnDefinition(column, fieldInfo);
		switch (column.getDataType()) {
		case List:
		case Table:
			result = new ListValueHandler(columnDefinition);
			break;
		case TableDirect:
			result = new TableDirectValueHandler(columnDefinition);
			break;
		case SubTable:
			result = new SubTableValueHandler(columnDefinition);
			break;
		default:
			result = new DefaultValueHandler(columnDefinition);
		}
		return result;
	}
}
