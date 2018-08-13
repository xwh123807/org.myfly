package org.myfly.platform.core.datamodel.handler;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.datamodel.define.FRefList;
import org.myfly.platform.core.datamodel.define.FRefListItem;
import org.myfly.platform.core.datamodel.define.FlyColumn;
import org.myfly.platform.core.datamodel.define.IValueHandler;

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
		if (value != null && refList != null) {
			String keyValue = null;
			if (value instanceof Enum) {
				keyValue = ((Enum<?>) value).name();
			} else if (value instanceof String) {
				keyValue = (String) value;
			}
			if (StringUtils.isNotBlank(keyValue)) {
				FRefListItem listItem = refList.getItems().get(keyValue);
				RefObject result = new RefObject();
				if (listItem != null) {
					result.setUid(listItem.getRefListID());
					result.setLabel(listItem.getName());
				}else {
					result.setLabel("在refList[" + refList.getName() + "]中找不到项目[" + keyValue + "]");
				}
				return result;
			}
		}
		return value;
	}
}
