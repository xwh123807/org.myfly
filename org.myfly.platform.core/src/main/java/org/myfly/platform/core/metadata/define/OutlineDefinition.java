package org.myfly.platform.core.metadata.define;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.myfly.platform.core.metadata.annotation.Div1View;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.myfly.platform.core.metadata.annotation.SectionView;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 大纲视图定义
 * 
 * @author xiangwanhong
 *
 */
public class OutlineDefinition extends BaseDenifition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -837433089304931820L;
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
		setName(view.name());
		setTitle(view.title());
		setSectionsFromView(view.sections());
		setDivsFromView(view.divs());
	}

	public OutlineDefinition() {
	}
	
	public OutlineDefinition(OutlineDefinition builder) {
		setName(builder.getName());
	}

	@JsonIgnore
	private void setDivsFromView(Div1View[] views) {
		setDivs(Stream.of(views).map(view -> new DivDefinition(view)).collect(Collectors.toList())
				.toArray(new DivDefinition[] {}));
	}

	@JsonIgnore
	private void setSectionsFromView(SectionView[] views) {
		setSections(Stream.of(views).map(view -> new SectionDefinition(view)).collect(Collectors.toList())
				.toArray(new SectionDefinition[] {}));
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

	@Override
	public String toString() {
		return "name: " + getName() + ", title: " + getTitle() + ", divs: " + getDivs().length + ", sections:"
				+ getSections().length;
	}

	/**
	 * 获取使用字段列表
	 * @return
	 */
	@JsonIgnore
	public String[] getFields() {
		 return Stream.of(getSections()).flatMap(item -> Stream.of(item.getFields())).distinct()
				 .collect(Collectors.toList()).toArray(new String[] {});
	}
	
	@Override
	public void validate() {

	}
}
