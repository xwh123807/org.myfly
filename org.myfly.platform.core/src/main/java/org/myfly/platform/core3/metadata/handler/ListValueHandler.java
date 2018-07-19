package org.myfly.platform.core3.metadata.handler;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.metadata.define.FRefList;
import org.myfly.platform.core3.metadata.define.FRefListItem;
import org.myfly.platform.core3.metadata.define.FlyColumn;
import org.myfly.platform.core3.metadata.define.IValueHandler;
import org.springframework.util.Assert;

/**
 * 列表(一般为枚举)数据类型字段值读取类
 * 
 * @author xiangwanhong
 *
 */
public class ListValueHandler extends DefaultValueHandler implements IValueHandler {
	private FRefList refList;

	public ListValueHandler(FlyColumn column) {
		super(column);
		refList = column.getElement().getRefList();
	}

	@Override
	public Object getFieldValueForEntity(Object entity) {
		Object value = super.getFieldValueForEntity(entity);
		if (value != null) {
			String keyValue = null;
			if (value instanceof Enum) {
				keyValue = ((Enum<?>) value).name();
			} else if (value instanceof String) {
				keyValue = (String) value;
			}
			if (StringUtils.isNotBlank(keyValue)) {
				FRefListItem listItem = refList.getItems().get(keyValue);
				Assert.notNull(listItem, "在refList[" + refList.getName() + "]中找不到项目[" + keyValue + "]");
				FlyEntityMap result = new FlyEntityMap();
				result.put("refListID", listItem.getRefListID());
				result.put("value", listItem.getValue());
				result.put("name", listItem.getName());
				result.put("description", listItem.getDescription());
				result.put("help", listItem.getHelp());
				return result;
			}
		}
		return value;
	}
}
