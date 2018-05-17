package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.annotation.Div1View;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.utils.FuncUtil;
import org.myfly.platform.core.utils.FuncUtil.ConvertAction;

/**
 * 大纲视图定义
 * 
 * @author xiangwanhong
 *
 */
public class OutlineDefinition extends BaseDenifition {
	/**
	 * 显示标题
	 */
	private String title;
	/**
	 * 显示内容定义
	 */
	private SectionDefinition[] sections;

	private DivDefinition[] divs;

	/**
	 * 
	 * @param view
	 */
	public OutlineDefinition(OutlineView view) {
		super(null);
		setTitle(view.title());
		setSections(view.sections());
		setDivs(view.divs());
	}

	private void setDivs(Div1View[] views) {
		divs = FuncUtil.convert(views, new ConvertAction<Div1View, DivDefinition>() {

			@Override
			public DivDefinition execute(int index, Div1View item) {
				return new DivDefinition(item);
			}

		}).toArray(new DivDefinition[] {});
	}

	private void setSections(SectionView[] views) {
		sections = FuncUtil.convert(views, new ConvertAction<SectionView, SectionDefinition>() {

			@Override
			public SectionDefinition execute(int index, SectionView item) {
				return new SectionDefinition(item);
			}

		}).toArray(new SectionDefinition[] {});
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

	public DivDefinition[] getDivs() {
		return divs;
	}

	public void setDivs(DivDefinition[] divs) {
		this.divs = divs;
	}
}
