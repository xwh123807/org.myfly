package org.myfly.platform.visualpage3.application;

import org.myfly.platform.visualpage3.annotation.FlyTab;
import org.myfly.platform.visualpage3.annotation.FlyWindow;

public enum MyFlyViewModel_zh_CN {
	//
	@FlyWindow(name = "Table", description = "Table", help = "", tabs = {
			@FlyTab(name = "Table", description = "Table", help = "", table = "PTable") })
	Table
}
