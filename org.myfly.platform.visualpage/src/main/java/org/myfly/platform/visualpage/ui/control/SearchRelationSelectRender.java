package org.myfly.platform.visualpage.ui.control;

import org.myfly.platform.core.metadata.entity.RelationFieldDefinition;
import org.myfly.platform.visualpage.ui.InputType;

public class SearchRelationSelectRender extends SelectFieldRender {

	@Override
	public String getOptions() {
		return "<option value=\"$!{obj." + getField().getName() + "}\">$!{obj." + getField().getName()
				+ "__label}</option>";
	}

	@Override
	public InputType getInputType() {
		return null;
	}

	@Override
	public String controlForEdit() {
		RelationFieldDefinition field = (RelationFieldDefinition)getField();
		return "<select class=\"select2-entity\" style=\"width:100%\" name=\"" + getField().getName()
				+ "\" data-entity=\"" + field.getRelationTable() + "\" data-value=\"${obj." + getField().getName()
				+ "}\" data-text=\"$!{obj." + getField().getName() + "__label}\">" + getOptions() + "</select>";
	}

	@Override
	public String controlForView() {
		return "<span class=\"bg-info\">$!{obj." + getField().getName() + "__link}</span>";
	}
	
	@Override
	public String controlForSearch() {
		return "<span class=\"bg-info\">$!{objitem." + getField().getName() + "__link}</span>";
	}
}
