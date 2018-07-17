package org.myfly.platform.visualpage3.webui.window;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.visualpage3.define.FField;
import org.myfly.platform.visualpage3.define.FTab;
import org.myfly.platform.visualpage3.webui.BaseControl;
import org.myfly.platform.visualpage3.webui.ControlFactory;
import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.control.BasePanel;

public class FormPanel extends BasePanel {

	private FTab tab;

	public FormPanel(FTab tab, ViewMode viewMode) {
		super(viewMode);
		this.setTab(tab);
	}

	@Override
	public String getTitle() {
		return getTab().getName();
	}

	@Override
	public BaseControl getContent() {
		return null;
	}

	public FTab getTab() {
		return tab;
	}

	public void setTab(FTab tab) {
		this.tab = tab;
	}

	@Override
	public String getContentHtml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<el-form ref=\"obj\" :model=\"obj\" size=\"mini\" label-width=\"160px\">\n");
		List<List<String>> groups = buildFieldGroup(getTab().getFields().values());
		for (List<String> group : groups) {
			buffer.append("<el-row>\n");
			int span = 24 / group.size();
			for (String name : group) {
				buffer.append("<el-col :span=" + span + ">").append("\n");
				FField field = getTab().getFields().get(name);
				if (FlyDataType.YesNo.equals(field.getDataType())) {
					buffer.append(" <el-form-item>\n");
					buffer.append(ControlFactory.getFieldControl(field, getViewMode()).html());
					buffer.append(" </el-form-item>");
				} else {
					buffer.append(" <el-form-item label=\"" + field.getName() + "\">\n");
					buffer.append(ControlFactory.getFieldControl(field, getViewMode()).html());
					buffer.append(" </el-form-item>");
				}
				buffer.append("</el-col>").append("\n");
			}
			buffer.append("</el-row>\n");
		}
		buffer.append("</el-form>\n");
		return buffer.toString();
	}

	/**
	 * 构建字段组
	 * 
	 * @param fields
	 * @return
	 */
	private List<List<String>> buildFieldGroup(Collection<FField> fields) {
		List<List<String>> result = new ArrayList<>();
		List<String> group = new ArrayList<>();
		for (FField field : fields) {
			if (group.size() > 0 && isLargeField(field)) {
				result.add(group);
				group = new ArrayList<>();
			}
			group.add(field.getFieldID());
			if (group.size() == 2 || isLargeField(field)) {
				result.add(group);
				group = new ArrayList<>();
			}
		}
		if (group.size() > 0) {
			result.add(group);
		}
		return result;
	}

	private boolean isLargeField(FField field) {
		return FlyDataType.Text.equals(field.getDataType()) || FlyDataType.LongText.equals(field.getDataType());
	}
}
