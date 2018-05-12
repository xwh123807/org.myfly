package org.myfly.platform.visualpage.ui.view;

import org.myfly.platform.metamodel.define.EntityAction;
import org.myfly.platform.metamodel.define.EntityMetaData;
import org.myfly.platform.metamodel.define.FormDefinition;
import org.myfly.platform.metamodel.define.ViewMode;
import org.myfly.platform.metamodel.define.ViewType;
import org.myfly.platform.metamodel.utils.AssertUtil;
import org.myfly.platform.metamodel.utils.EntityUrlUtil;
import org.myfly.platform.metamodel.utils.HtmlUtils;
import org.myfly.platform.visualpage.ui.BaseButtonRender;
import org.myfly.platform.visualpage.ui.ButtonRenderFactory;
import org.myfly.platform.visualpage.ui.control.DivsRender;
import org.myfly.platform.visualpage.ui.control.FormToolbarRender;
import org.myfly.platform.visualpage.ui.control.SelectFormViewRender;

/**
 * 实体表单Render，用于实体表单查看、增加、编辑模式
 * 
 * @author xiangwanhong
 *
 */
public class FormViewRender extends BaseViewRender {
	private EntityMetaData entityMetaData;
	private FormDefinition formDefinition;
	private String entityName;
	private SectionViewRender[] sections;

	/**
	 * 
	 * @param entityName
	 *            实体名称
	 * @param viewType
	 *            视图类型
	 * @param formViewName
	 *            视图定义名称
	 */
	public FormViewRender(final String entityName, final ViewType viewType, final ViewMode viewMode,
			final String formViewName) {
		super(viewType, viewMode);
		this.entityName = entityName;
		AssertUtil.parameterEmpty(entityName, "ViewFormRender.entityName");

		this.entityMetaData = getEntityMataData(entityName);
		this.formDefinition = entityMetaData.getFormDefinition(formViewName);
	}

	public String htmlForView() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div" + HtmlUtils.addPropertys(new String[] { "class", "render" },
				new String[] { "", getClass().getName() }) + ">");
		// 视图切换
		buffer.append("<div class='col-xs-12'>");
		SelectFormViewRender selectFormViewRender = new SelectFormViewRender(entityName, getViewType(), formDefinition.getName());
		buffer.append(selectFormViewRender.html());
		buffer.append("</div>");
		buffer.append(
				"<form" + HtmlUtils.addIdProperty()
						+ HtmlUtils.addPropertys(new String[] { "method", "class", "entityName", "view", "uid" },
								new String[] { "post", "form-edit formview", entityName, formDefinition.getName(), "$!{uid}" })
				+ ">");
		// 工具条
		if (!ViewMode.MODALPAGE.equals(getViewMode())) {
			// 为主记录区域增加工具条
			FormToolbarRender toolbar = new FormToolbarRender(formDefinition, formDefinition.getName());
			toolbar.setViewType(getViewType());
			buffer.append(toolbar.html());
		}

		sections = new SectionViewRender[formDefinition.getSections().length];
		for (int i = 0; i < sections.length; i++) {
			sections[i] = new SectionViewRender(formDefinition.getSections()[i], getViewType());
		}
		DivsRender divsRender = new DivsRender(formDefinition.getDivs(), sections);
		buffer.append(divsRender.html());
		buffer.append("</form>");
		buffer.append("</div>");
		return buffer.toString();
	}

	@Override
	public String getModalAction() {
		StringBuffer buffer = new StringBuffer();
		for (EntityAction action : EntityAction.getActionsByViewType(getViewType())) {
			if (!EntityAction.BACK.equals(action)) {
				String url = EntityUrlUtil.getEntityActionUrl(action, formDefinition.getParent().getEntityName(),
						"$!{uid}", null);
				BaseButtonRender button = ButtonRenderFactory.getRender(action, url);
				buffer.append(button.html());
			}
		}
		return buffer.toString();
	}

	/**
	 * 表单视图url
	 * 
	 * @return
	 */
	public String getUrl() {
		return EntityUrlUtil.getEntityActionUrl(EntityAction.VIEW, entityName, "${uid}", formDefinition.getName());
	}
}
