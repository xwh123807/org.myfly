package org.myfly.platform.core.utils;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Html工具类
 * 
 * @author xiangwanhong
 *
 */
public class HtmlUtils {
	/**
	 * 如果value不为空，则返回name='value'，否则返回空串
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public static String addProperty(String name, String value) {
		AssertUtil.parameterEmpty(name, "name");
		if (StringUtils.isNotEmpty(value)) {
			return " " + name + "='" + value + "'";
		} else {
			return "";
		}
	}

	public static String addPropertys(String names[], String values[]) {
		String result = "";
		for (int i = 0; i < names.length; i++) {
			result += addProperty(names[i], values[i]);
		}
		return result;
	}

	/**
	 * id=''
	 * 
	 * @return
	 */
	public static String addIdProperty() {
		return addProperty("id", UUIDUtil.newHtmlID());
	}

	/**
	 * 
	 * @param attrs
	 * @return
	 */
	public static String addAttrs(Map<String, String> attrs) {
		String buffer = "";
		if (MapUtils.isEmpty(attrs)) {
			buffer = "";
		} else {
			for (Entry<String, String> item : attrs.entrySet()) {
				buffer += item.getKey();
				if (StringUtils.isNotBlank(item.getValue())) {
					buffer += "=\"" + item.getValue() + "\"";
				}
			}
		}
		return buffer;
	}
}