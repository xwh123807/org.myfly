package org.myfly.platform.core.metadata.define;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;
import org.hsqldb.lib.StringUtil;
import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.myfly.platform.core.metadata.annotation.SectionType;
import org.myfly.platform.core.metadata.annotation.SectionView;
import org.myfly.platform.core.metadata.annotation.SubTableView;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 区域定义
 * 
 * @author xiangwanhong
 *
 */
public class SectionDefinition extends BaseDenifition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 585523041536521196L;
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

	public SectionDefinition(SectionView view) {
		setName(view.name());
		setTitle(view.title());
		setType(view.type());
		setFieldSetsFromView(view.fieldSets());
		setSubTablesFromView(view.subTables());
		if (StringUtil.isEmpty(getTitle())) {
			if (getType() == SectionType.NOTE) {
				setTitle(SectionType.NOTE.getTitle());
			} else if (getType() == SectionType.ATTACHMENT) {
				setTitle(SectionType.ATTACHMENT.getTitle());
			}
		}
	}

	public SectionDefinition() {
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

	@JsonIgnore
	public void setFieldSetsFromView(FieldSetView[] views) {
		setFieldSets(Stream.of(views).map(view -> new FieldSetDefinition(view)).collect(Collectors.toList())
				.toArray(new FieldSetDefinition[] {}));
	}

	public SubTableDefinition[] getSubTables() {
		return subTables;
	}

	public void setSubTables(SubTableDefinition[] subTables) {
		this.subTables = subTables;
	}

	@JsonIgnore
	public void setSubTablesFromView(SubTableView[] views) {
		setSubTables(Stream.of(views).map(view -> new SubTableDefinition(view)).collect(Collectors.toList())
				.toArray(new SubTableDefinition[] {}));
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
		return "name: " + getName() + ", type: " + getType() + ", title: " + getTitle() + ", fieldSets: "
				+ getFieldSets().length + ", subTables: " + getSubTables().length;
	}

	public void validate() {
		Assert.notNull(getType());
		if (getType() == SectionType.CUSTOM) {
			Assert.hasLength(getTitle());
		}
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
