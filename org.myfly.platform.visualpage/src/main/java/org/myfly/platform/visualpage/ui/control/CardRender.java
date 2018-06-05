package org.myfly.platform.visualpage.ui.control;

import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.define.FieldSetDefinition;
import org.myfly.platform.core.metadata.entity.EntityListDefinition;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.visualpage.ui.BaseRender;
import org.myfly.platform.visualpage.ui.view.FieldSetViewRender;

/**
 * 卡片式
 * 
 * @author xiangwanhong
 *
 */
public class CardRender implements BaseRender {

	private EntityListDefinition listDefinition;

	public CardRender(EntityListDefinition listDefinition) {
		this.listDefinition = listDefinition;
	}

	@Override
	public String html() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div" + HtmlUtils.addProperty("render", getClass().getName()) + ">");
		FieldSetDefinition fieldSetDefinition = new FieldSetDefinition();
		fieldSetDefinition.setTitle(listDefinition.getTitle());
		fieldSetDefinition.setFields(listDefinition.getFields());
		FieldSetViewRender fieldSetViewRender = new FieldSetViewRender(fieldSetDefinition,
				listDefinition.getFieldDefinitions(), ViewType.VIEW);
		fieldSetViewRender.setFullSize(true);
		buffer.append(fieldSetViewRender.html());
		buffer.append("</div>");
		return buffer.toString();
	}

}
