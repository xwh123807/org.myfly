package org.myfly.platform.core.viewmodel.application;

import org.myfly.platform.core.viewmodel.annotation.FlyTab;
import org.myfly.platform.core.viewmodel.annotation.FlyWindow;

public enum MyFlyViewModel_zh_CN {
	//
	@FlyWindow(name = "数据类型", description = "数据类型", help = "", tabs = {
			@FlyTab(name = "数据类型", description = "数据类型", help = "", table = "PDataType") })
	DataType,
	//
	@FlyWindow(name = "实体类型", description = "实体类型", help = "", tabs = {
			@FlyTab(name = "实体类型", description = "实体类型", help = "", table = "PEntityType") })
	EntityType,
	//
	@FlyWindow(name = "系统元素", description = "系统元素", help = "", tabs = {
			@FlyTab(name = "系统元素", description = "系统元素", help = "", table = "PElement"),
			@FlyTab(name = "使用字段", table = "PColumn", tabLevel = 1) })
	Element,
	//
	@FlyWindow(name = "引用", description = "引用", tabs = { @FlyTab(name = "引用", table = "PReference"),
			@FlyTab(name = "引用表", table = "PRefTable", tabLevel = 1),
			@FlyTab(name = "引用值", table = "PRefList", tabLevel = 1) })
	Reference,
	//
	@FlyWindow(name = "客户", description = "客户", help = "", tabs = {
			@FlyTab(name = "客户", description = "客户", help = "", table = "PClient"),
			@FlyTab(name = "用户", description = "用户", help = "", table = "PUser", tabLevel = 1),
			@FlyTab(name = "窗口", table = "PWindow", tabLevel = 1) })
	Client,
	//
	@FlyWindow(name = "组织", tabs = { @FlyTab(name = "组织", table = "POrg") })
	Org,
	//
	@FlyWindow(name = "用户", tabs = { @FlyTab(name = "用户", table = "PUser") })
	User,
	//
	@FlyWindow(name = "表", description = "Table", help = "", tabs = {
			@FlyTab(name = "表", description = "Table", help = "", table = "PTable"),
			@FlyTab(name = "列", description = "", help = "", table = "PColumn", tabLevel = 1) })
	Table,
	//
	@FlyWindow(name = "窗口", description = "Window", help = "", tabs = {
			@FlyTab(name = "窗口", description = "Window", help = "", table = "PWindow"),
			@FlyTab(name = "页", description = "", help = "", table = "PTab", tabLevel = 1),
			@FlyTab(name = "字段", description = "", help = "", table = "PField", tabLevel = 2) })
	Window,
	//
	@FlyWindow(name = "过程", description = "Process", help = "", tabs = {
			@FlyTab(name = "过程", description = "Process", help = "", table = "PProcess"),
			@FlyTab(name = "过程参数", description = "", help = "", table = "PProcessPara", tabLevel = 1) })
	Process
}
