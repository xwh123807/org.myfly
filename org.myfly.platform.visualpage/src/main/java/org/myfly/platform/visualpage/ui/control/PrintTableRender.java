package org.myfly.platform.visualpage.ui.control;

import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.entity.EntityListDefinition;

/**
 * 供打印的表格，用于输出成Pdf
 * @author xiangwanhong
 *
 */
public class PrintTableRender extends VelocityTemplateTableRender{

	public PrintTableRender(EntityListDefinition listDefinition, ViewType viewType) {
		super(listDefinition, viewType);
		addExtAttr("border", "1");
	}

	@Override
	public String getTableClass() {
		return "";
	}
}
