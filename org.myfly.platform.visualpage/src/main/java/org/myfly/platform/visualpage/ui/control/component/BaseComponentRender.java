package org.myfly.platform.visualpage.ui.control.component;

import org.myfly.platform.metamodel.domain.ViewType;
import org.myfly.platform.metamodel.utils.HtmlUtils;
import org.myfly.platform.visualpage.ui.view.BaseRender;

public abstract class BaseComponentRender extends BaseRender{

	public BaseComponentRender(ViewType viewType) {
		super(viewType);
	}

	public abstract String getComponentName();
	
	@Override
	public String htmlForView() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div" + HtmlUtils.addPropertys(new String[] { "render" }, new String[] { getClass().getName() })
				+ ">");
		buffer.append("#parse(\"${pageInfo.layout}/components/" + getComponentName() + ".vm\")");
		buffer.append("</div>");
		return buffer.toString();
	}
	
	@Override
	public String htmlForPrint() {
		return "";
	}
}
