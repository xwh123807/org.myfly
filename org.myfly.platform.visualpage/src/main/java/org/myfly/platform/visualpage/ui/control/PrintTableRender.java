package org.myfly.platform.visualpage.ui.control;

import org.myfly.platform.metamodel.define.ListDefinition;
import org.myfly.platform.metamodel.domain.ViewType;

/**
 * 供打印的表格，用于输出成Pdf
 * @author xiangwanhong
 *
 */
public class PrintTableRender extends VelocityTemplateTableRender{

	public PrintTableRender(ListDefinition listDefinition, ViewType viewType) {
		super(listDefinition, viewType);
		addExtAttr("border", "1");
	}

	@Override
	public String getTableClass() {
		return "";
	}
}
