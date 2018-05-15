package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.annotation.Div1View;
import org.myfly.platform.core.metadata.annotation.Div2View;
import org.myfly.platform.core.metadata.annotation.Div3View;
import org.myfly.platform.core.metadata.annotation.DivType;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.utils.FuncUtil;
import org.myfly.platform.core.utils.FuncUtil.ConvertAction;

public class DivDefinition extends BaseDenifition {
	private DivType divType;

	private int width;

	private String extClass;

	private SectionDefinition[] sections;

	private DivDefinition[] subs;

	public DivDefinition() {
		super(null);
	}

	public DivDefinition(Div1View view) {
		super(null);
		setName(view.name());
		setDivType(view.divType());
		setWidth(view.width());
		setExtClass(view.extClass());
		setSections(view.sections());
		subs = FuncUtil.convert(view.subs(), new ConvertAction<Div2View, DivDefinition>() {

			@Override
			public DivDefinition execute(int index, Div2View item) {
				return new DivDefinition(item);
			}

		}).toArray(new DivDefinition[] {});
	}

	public DivDefinition(Div2View view) {
		super(null);
		setName(view.name());
		setDivType(view.divType());
		setWidth(view.width());
		setExtClass(view.extClass());
		setSections(view.sections());
		setSubs(FuncUtil.convert(view.subs(), new ConvertAction<Div3View, DivDefinition>() {

			@Override
			public DivDefinition execute(int index, Div3View item) {
				return new DivDefinition(item);
			}

		}).toArray(new DivDefinition[] {}));
	}

	public DivDefinition(Div3View view) {
		super(null);
		setName(view.name());
		setDivType(view.divType());
		setWidth(view.width());
		setExtClass(view.extClass());
		setSections(view.sections());
	}

	public void setSections(SectionView[] sections) {
		this.sections = FuncUtil.convert(sections, new ConvertAction<SectionView, SectionDefinition>() {

			@Override
			public SectionDefinition execute(int index, SectionView item) {
				return new SectionDefinition(item);
			}

		}).toArray(new SectionDefinition[] {});
	}

	public DivType getDivType() {
		return divType;
	}

	public void setDivType(DivType divType) {
		this.divType = divType;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getExtClass() {
		return extClass;
	}

	public void setExtClass(String extClass) {
		this.extClass = extClass;
	}

	public DivDefinition[] getSubs() {
		return subs;
	}

	public void setSubs(DivDefinition[] subs) {
		this.subs = subs;
	}

	@Override
	public String toString() {
		return "name: " + getName() + ", divType: " + getDivType() + ", width: " + getWidth() + ", extClass: "
				+ getExtClass();
	}

	public void validate() {
	}

	public SectionDefinition[] getSections() {
		return sections;
	}

	public void setSections(SectionDefinition[] sections) {
		this.sections = sections;
	}
}
