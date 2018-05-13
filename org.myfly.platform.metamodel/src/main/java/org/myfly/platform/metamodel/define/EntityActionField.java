package org.myfly.platform.metamodel.define;

import org.myfly.platform.metamodel.domain.EntityAction;
import org.myfly.platform.metamodel.domain.EntityActionInfo;
import org.myfly.platform.metamodel.domain.FieldDataType;
import org.myfly.platform.metamodel.utils.AssertUtil;

public class EntityActionField extends FieldDefinition{
	public EntityActionField(final EntityAction ...actionDenifitions) {
		setLabel("操作");
		setName("actions");
		setDataType(FieldDataType.ACTIONS);
		setGetValueHandler(new GetFieldValueHandler() {

			@Override
			public Object getFieldValue(Object obj) {
				if (obj instanceof EntityActionInfo) {
					EntityActionInfo entityActionInfo = (EntityActionInfo) obj;
//					EntityActionsFieldRender render = new EntityActionsFieldRender(ViewType.VIEW, actionDenifitions,
//							entityActionInfo);
//					return render.html();
				} else {
					if (obj != null) {
						AssertUtil.parameterInvalide("(EntityActionInfo) obj",
								"参数必须是EntityActionInfo类型，实际是" + obj.getClass().getName());
					}
				}
				return obj;
			}
		});
	}
}
