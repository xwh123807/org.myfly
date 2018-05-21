package org.myfly.platform.core.metadata.define;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.myfly.platform.core.metadata.annotation.Div1View;
import org.myfly.platform.core.metadata.annotation.Div2View;
import org.myfly.platform.core.metadata.annotation.Div3View;
import org.myfly.platform.core.metadata.annotation.DivType;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DivDefinition extends BaseDenifition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 355433472145493897L;

	private DivType divType;

	private int width;

	private String extClass;

	private SectionDefinition[] sections;

	private DivDefinition[] subs;

	public DivDefinition() {
	}

	public DivDefinition(Div1View view) {
		setName(view.name());
		setDivType(view.divType());
		setWidth(view.width());
		setExtClass(view.extClass());
		setSections(view.sections());
		setSubs(Stream.of(view.subs()).map(item -> new DivDefinition(item)).collect(Collectors.toList())
				.toArray(new DivDefinition[] {}));
	}

	public DivDefinition(Div2View view) {
		setName(view.name());
		setDivType(view.divType());
		setWidth(view.width());
		setExtClass(view.extClass());
		setSections(view.sections());
		setSubs(Stream.of(view.subs()).map(item -> new DivDefinition(item)).collect(Collectors.toList())
				.toArray(new DivDefinition[] {}));
	}

	public DivDefinition(Div3View view) {
		setName(view.name());
		setDivType(view.divType());
		setWidth(view.width());
		setExtClass(view.extClass());
		setSections(view.sections());
	}

	@JsonIgnore
	public void setSections(SectionView[] sections) {
		setSections(Stream.of(sections).map(view -> new SectionDefinition(view)).collect(Collectors.toList())
				.toArray(new SectionDefinition[] {}));
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
		Assert.notNull(getDivType());
	}

	public SectionDefinition[] getSections() {
		return sections;
	}

	public void setSections(SectionDefinition[] sections) {
		this.sections = sections;
	}
}
