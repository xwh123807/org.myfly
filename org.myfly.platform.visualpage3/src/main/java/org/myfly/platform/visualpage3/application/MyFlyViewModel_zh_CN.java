package org.myfly.platform.visualpage3.application;

import org.myfly.platform.visualpage3.annotation.FlyTab;
import org.myfly.platform.visualpage3.annotation.FlyWindow;

public enum MyFlyViewModel_zh_CN {
	//
	@FlyWindow(name = "Data Type", description="数据类型", help = "", tabs = {
			@FlyTab(name="Data Type", description="数据类型", help="", table = "PDataType")
	})
	DataType,
	//
	@FlyWindow(name = "实体类型", description="实体类型", help = "", tabs = {
			@FlyTab(name="实体类型", description="实体类型", help="", table = "PEntityType")
	})
	EntityType,
	//
	@FlyWindow(name = "系统元素", description="系统元素", help = "", tabs = {
			@FlyTab(name="系统元素", description="系统元素", help="", table = "PElement")
	})
	Element,
	//
	@FlyWindow(name = "客户", description="客户", help = "", tabs = {
			@FlyTab(name="客户", description="客户", help="", table = "PClient")
	})
	Client,
	//
	@FlyWindow(name = "Table", description = "Table", help = "", tabs = {
			@FlyTab(name = "Table", description = "Table", help = "", table = "PTable") })
	Table,
	//
	@FlyWindow(name = "Window", description = "Window", help = "", tabs = {
			@FlyTab(table = "PWindow", name = "Window", description = "Window") })
	Window
}
