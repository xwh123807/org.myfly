package org.myfly.platform.visualpage.ui.view;

import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.define.FieldSetDefinition;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.visualpage.ui.BaseFieldRender;
import org.myfly.platform.visualpage.ui.FieldRenderFactory;

/**
 * 字段集
 * 
 * @author xiangwanhong
 *
 */
public class FieldSetViewRender extends BaseRender {
	private FieldSetDefinition fieldSetDefinition;
	
	private EntityFieldDefinition[] fields;

	private boolean fullSize = false;

	public FieldSetViewRender(final FieldSetDefinition fieldSetDefinition, final EntityFieldDefinition[] fields,
			final ViewType viewType) {
		super(viewType);
		this.fields = fields;
		AssertUtil.parameterEmpty(fieldSetDefinition, "FieldSetViewRender.fieldSetDefinition");
		this.fieldSetDefinition = fieldSetDefinition;
	}

	public String html() {
		StringBuffer buffer = new StringBuffer();
		String sizeClass = isFullSize() ? "" : "col-sm-6";
		buffer.append("<fieldset class=\"form-horizontal " + sizeClass + "\""
				+ HtmlUtils.addProperty("render", getClass().getName()) + ">");
		for (EntityFieldDefinition field : fields) {
			BaseFieldRender render = FieldRenderFactory.getRender(field);
			render.setViewType(getViewType());
			buffer.append(render.html());
		}
		buffer.append("</fieldset>");
		return buffer.toString();
	}

	public boolean isFullSize() {
		return fullSize;
	}

	public void setFullSize(boolean fullSize) {
		this.fullSize = fullSize;
	}
}
