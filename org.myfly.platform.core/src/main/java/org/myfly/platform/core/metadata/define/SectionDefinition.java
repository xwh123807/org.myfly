package org.myfly.platform.core.metadata.define;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.SectionType;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.SubTableView;
import org.springframework.util.Assert;

/**
 * 区域定义
 * 
 * @author xiangwanhong
 *
 */
public class SectionDefinition extends BaseDenifition {
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 区域类型
	 */
	private SectionType type;
	/**
	 * 字段集
	 */
	private FieldSetDefinition[] fieldSets;
	/**
	 * 子表
	 */
	private SubTableDefinition[] subTables;

	public SectionDefinition(FormDefinition parent, String title) {
		super(parent);
		setTitle(title);
		setType(SectionType.CUSTOM);
	}

	public SectionDefinition(SectionView view) {
		super(null);
		setName(view.name());
		setTitle(view.title());
		setType(view.type());
		setFieldSets(view.fieldSets());
		setSubTables(view.subTables());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public FieldSetDefinition[] getFieldSets() {
		return fieldSets;
	}

	public void setFieldSets(FieldSetDefinition[] fieldSets) {
		this.fieldSets = fieldSets;
	}

	public void setFieldSets(FieldSetView[] views) {
		if (views != null && views.length > 0) {
			fieldSets = new FieldSetDefinition[views.length];
			for (int i = 0; i < views.length; i++) {
				fieldSets[i] = new FieldSetDefinition(views[i]);
			}
		}
	}

	public SubTableDefinition[] getSubTables() {
		return subTables;
	}

	public void setSubTables(SubTableDefinition[] subTables) {
		this.subTables = subTables;
	}

	public void setSubTables(SubTableView[] views) {
		if (views != null && views.length > 0) {
			subTables = new SubTableDefinition[views.length];
			for (int i = 0; i < views.length; i++) {
				subTables[i] = new SubTableDefinition(getParent(), views[i]);
			}
		}
	}

	/**
	 * 增加子表定义
	 * 
	 * @param subTable
	 */
	public void addSubTable(SubTableDefinition subTable) {
		if (ArrayUtils.isEmpty(subTables)) {
			subTables = new SubTableDefinition[1];
			subTables[0] = subTable;
		} else {
			ArrayUtils.add(subTables, subTable);
		}
	}

	public SectionType getType() {
		return type;
	}

	public void setType(SectionType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "name: " + getName() + ", type: " + getType();
	}

	public void validate() {
		Assert.notNull(getType());
		if (ArrayUtils.isNotEmpty(getFieldSets())) {
			for (FieldSetDefinition fieldSet : getFieldSets()) {
				fieldSet.validate();
			}
		}
		if (ArrayUtils.isNotEmpty(getSubTables())) {
			for (SubTableDefinition subtable : getSubTables()) {
				subtable.validate();
			}
		}
	}
}
