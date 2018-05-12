package org.myfly.platform.core.visualpage.ui.control;

import org.myfly.platform.core.visualpage.ui.BaseRender;
import org.myfly.platform.core.visualpage.ui.view.FieldSetViewRender;
import org.myfly.platform.metamodel.define.FieldSetDefinition;
import org.myfly.platform.metamodel.define.ListDefinition;
import org.myfly.platform.metamodel.define.ViewType;
import org.myfly.platform.metamodel.utils.HtmlUtils;

/**
 * 卡片式
 * @author xiangwanhong
 *
 */
public class CardRender implements BaseRender{

	private ListDefinition listDefinition;

	public CardRender(ListDefinition listDefinition) {
		this.listDefinition = listDefinition;
	}

	@Override
	public String html() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div" + HtmlUtils.addProperty("render", getClass().getName()) + ">");
		FieldSetDefinition fieldSetDefinition = new FieldSetDefinition(listDefinition.getTitle());
		fieldSetDefinition.setFields(listDefinition.getFields());
		FieldSetViewRender fieldSetViewRender = new FieldSetViewRender(fieldSetDefinition , ViewType.VIEW);
		fieldSetViewRender.setFullSize(true);
		buffer.append(fieldSetViewRender.html());
		buffer.append("</div>");
		return buffer.toString();
	}

}
