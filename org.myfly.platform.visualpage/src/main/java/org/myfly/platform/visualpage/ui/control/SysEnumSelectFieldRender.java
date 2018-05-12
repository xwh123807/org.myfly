package org.myfly.platform.visualpage.ui.control;

import java.util.List;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.metamodel.domain.BaseEnum;
import org.myfly.platform.metamodel.utils.AssertUtil;
import org.myfly.platform.visualpage.ui.InputType;

/**
 * 系统枚举选择，枚举由枚举类定义
 * @author xiangwanhong
 *
 */
public class SysEnumSelectFieldRender extends SelectFieldRender {
	private static final Log log = LogFactory.getLog(SysEnumSelectFieldRender.class);

	@Override
	public String getOptions() {
		AssertUtil.parameterEmpty(getField().getRelationClass(), "getField().getRelationClass()");
		try {
			List<? extends BaseEnum> items = EnumUtils.getEnumList(ClassUtils.getClass(getField().getRelationClass()));
			StringBuffer buffer = new StringBuffer();
			for (BaseEnum item : items) {
				buffer.append("<option value='" + ((Enum) item).name() + "'>" + item.getTitle() + "</option>");
			}
			return buffer.toString();
		} catch (ClassNotFoundException e) {
			log.error("枚举类型[" + getField().getRelationClass() + "]创建失败，错误信息：" + e.getMessage());
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
