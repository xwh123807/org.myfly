package org.myfly.platform.visualpage.ui.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.domain.ViewMode;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.utils.AssertUtil;

/**
 * 大纲视图
 * @author xiangwanhong
 *
 */
public class OutlineViewRender extends BaseViewRender{
	private Log log = LogFactory.getLog(getClass());
	private SectionViewRender[] sections;
	private String entityName;
	private String formViewName;
	
	public OutlineViewRender(final String entityName, final ViewType viewType, ViewMode viewMode, String formViewName) {
		super(viewType, viewMode);
		this.entityName = entityName;
		this.formViewName = formViewName;
		AssertUtil.parameterEmpty(entityName, "OutlineViewRender.entityName");
	}	
	
	public String html() {
		/*
		StringBuffer buffer = new StringBuffer();
		for (SectionViewRender section : sections) {
			buffer.append(section.html());
		}
		return buffer.toString();
		*/
		FormViewRender render = new FormViewRender(entityName, getViewType(), getViewMode(), formViewName);
		return render.html();
	}
}
