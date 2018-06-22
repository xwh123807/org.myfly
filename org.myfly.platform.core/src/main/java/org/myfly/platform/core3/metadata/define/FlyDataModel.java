package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core3.domain.IFlyEntity;

public class FlyDataModel extends FlyTableDefinition {
	public FlyDataModel() {
	}

	public FlyDataModel(FlyTableDefinition builder) {
		super(builder);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2763660520511209664L;

	/**
	 * 创建实体实例
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "static-access" })
	public <T extends IFlyEntity> T newEntityInstance() {
		try {
			return (T) getClass().forName(getApiName()).newInstance();
		} catch (Exception e) {
			AssertUtil.parameterInvalide(getApiName(), "创建实体实例失败，" + e.getMessage());
		}
		return null;
	}
}
