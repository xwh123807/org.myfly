package org.myfly.platform.visualpage.ui.view;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.define.SectionDefinition;
import org.myfly.platform.core.metadata.entity.EntityFormDefinition;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.visualpage.ui.WidgetBoxRender;
import org.myfly.platform.visualpage.ui.control.component.SocialRender;

/**
 * 
 * @author xiangwanhong
 *
 */
public class SectionViewRender extends BaseRender {
	private FieldSetViewRender[] fieldSets;
	private SubTableViewRender[] subTables;
	private SectionDefinition sectionDefinition;

	public SectionViewRender(EntityFormDefinition formDefinition, final SectionDefinition sectionDefinition,
			final ViewType viewType) {
		super(viewType);
		this.sectionDefinition = sectionDefinition;
		AssertUtil.parameterEmpty(sectionDefinition, "SectionRender.sectionDefinition");
		if (ArrayUtils.isNotEmpty(sectionDefinition.getFieldSets())) {
			fieldSets = Stream.of(sectionDefinition.getFieldSets()).map(
					item -> new FieldSetViewRender(item, formDefinition.getFields(item.getFields()), getViewType()))
					.collect(Collectors.toList()).toArray(new FieldSetViewRender[] {});
		}
		if (ViewType.EDIT.equals(viewType) || ViewType.NEW.equals(viewType)) {
			// 新增和编辑模式不显示子表
		} else if (ArrayUtils.isNotEmpty(sectionDefinition.getSubTables())) {
			subTables = Stream.of(sectionDefinition.getSubTables())
					.map(item -> new SubTableViewRender(
							formDefinition.getSubTableDefinitions().get(item.getSubTableAttr()), getViewType()))
					.collect(Collectors.toList()).toArray(new SubTableViewRender[] {});
		}
	}

	public SectionDefinition getSectionDefinition() {
		return sectionDefinition;
	}

	public String html() {
		StringBuffer sectionHtml = new StringBuffer();
		sectionHtml.append("<div" + HtmlUtils.addPropertys(new String[] { "name", "class", "render" },
				new String[] { sectionDefinition.getName(), sectionDefinition.getType().name(), getClass().getName() })
				+ ">");
		switch (sectionDefinition.getType()) {
		case CUSTOM:
		case NOTE:
		case ATTACHMENT:
			// 自定义部件
			if (fieldSets != null && fieldSets.length > 0) {
				StringBuffer buffer = new StringBuffer();
				for (FieldSetViewRender fieldSet : fieldSets) {
					buffer.append(fieldSet.html());
				}
				WidgetBoxRender box = new WidgetBoxRender(sectionDefinition.getTitle(), getViewType());
				box.setContent(buffer.toString());
				sectionHtml.append(box.html());
			}
			if (ArrayUtils.isNotEmpty(subTables)) {
				StringBuffer buffer = new StringBuffer();
				// 每个子表都显示在独立的WidgetBox中
				for (SubTableViewRender subTable : subTables) {
					buffer.append(subTable.html());
				}
				sectionHtml.append(buffer.toString());
			}
			break;
		case SOCIAL:
			SocialRender render = new SocialRender(getViewType());
			sectionHtml.append(render.html());
			break;
		default:
			break;
		}
		sectionHtml.append("</div>");
		return sectionHtml.toString();
	}
}
