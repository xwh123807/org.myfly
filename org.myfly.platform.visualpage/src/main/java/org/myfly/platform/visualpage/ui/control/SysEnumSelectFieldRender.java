package org.myfly.platform.visualpage.ui.control;

import java.util.List;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.domain.BaseEnum;
import org.myfly.platform.visualpage.ui.InputType;

/**
 * 系统枚举选择，枚举由枚举类定义
 * 
 * @author xiangwanhong
 *
 */
public class SysEnumSelectFieldRender extends SelectFieldRender {
	private static final Log log = LogFactory.getLog(SysEnumSelectFieldRender.class);

	@Override
	public String getOptions() {
		try {
			List<Enum> items = EnumUtils.getEnumList(ClassUtils.getClass(getField().getType().getName()));
			StringBuffer buffer = new StringBuffer();
			for (Enum item : items) {
				if (item instanceof BaseEnum) {
					buffer.append("<option value='" + ((Enum) item).name() + "'>" + ((BaseEnum)item).getTitle() + "</option>");
				}else {
					buffer.append("<option value='" + ((Enum) item).name() + "'>" + item.name() + "</option>");
				}
			}
			return buffer.toString();
		} catch (ClassNotFoundException e) {
			log.error("枚举类型[" + getField().getType().getName() + "]创建失败，错误信息：" + e.getMessage());
		}
		return "";
	}

	@Override
	public InputType getInputType() {
		return null;
	}

	@Override
	public String controlForView() {
		return "<span class=\"bg-info\">$!{obj." + getField().getName() + "__label}</span>";
	}

	@Override
	public String controlForSearch() {
		return "<span class=\"bg-info\">$!{objitem." + getField().getName() + "__label}</span>";
	}
}
