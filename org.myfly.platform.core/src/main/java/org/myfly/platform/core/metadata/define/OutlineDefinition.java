package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.annotation.OutlineView;

/**
 * 大纲视图定义
 * 
 * @author xiangwanhong
 *
 */
public class OutlineDefinition {
	/**
	 * 显示标题
	 */
	private String title;
	/**
	 * 显示内容定义
	 */
	private SectionDefinition[] sections;

	/**
	 * 
	 * @param view
	 */
	public OutlineDefinition(OutlineView view) {
//		title = view.title();
//		if (view.sections().length > 0) {
//			sections = new SectionDefinition();
//			for (int i = 0; i < view.sections().length; i++) {
//				sections[i] = new SectionDefinition(view.sections()[i]);
//			}
//		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SectionDefinition[] getSections() {
		return sections;
	}

	public void setSections(SectionDefinition[] sections) {
		this.sections = sections;
	}
}
