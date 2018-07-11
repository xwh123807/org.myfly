package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;

import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.visualpage3.define.FTab;
import org.myfly.platform.visualpage3.webui.BaseTableControl;

/**
 * el-table表格控件
 * 
 * @author xiangwanhong
 *
 */
public class ELTableControl extends BaseTableControl{
	public ELTableControl(FTab tab) {
		super(tab);
	}

	/**
	 * 
	 */
	private String model = "tableData";


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String html() {
		String html = MessageFormat.format(VueConstants.EL_TABLE_VIEW_HTML, getModel(),
				HtmlUtils.addAttrs(getTableAttrs()), getBodyHtml());
		return html;
	}

	private String getBodyHtml() {
		StringBuffer result = new StringBuffer();
		getTab().getFields().values().forEach(item -> {
			String label = item.getName();
			String model = item.getFlyColumn().getApiName();
			result.append(MessageFormat.format(VueConstants.EL_COLUMN_VIEW_HTML, model, label)).append("\n");
		});
		return result.toString();
	}
}
