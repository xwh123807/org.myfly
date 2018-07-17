package org.myfly.platform.visualpage3.webui.control;

public enum Action {
	//
	ARROW_FIRST("首张", "el-icon-d-arrow-left"),
	//
	ARROW_LAST("尾张", "el-icon-d-arrow-right"),
	//
	ARROW_PRIOR("上张", "el-icon-arrow-left"),
	//
	ARROW_NEXT("下张", "el-icon-arrow-right"),
	//
	DELETE("删除", "el-icon-delete"),
	//
	EDIT("编辑", "el-icon-edit"),
	//
	SHARE("分享", "el-icon-share"),
	//
	HELP("帮助", "el-icon-question"),
	//
	SEARCH("搜索", "el-icon-search"),
	//
	PRINT("打印", "el-icon-printer"),
	//
	SET("设置", "el-icon-setting"),
	//
	UPLOAD("上传", "el-icon-upload"),
	//
	DOWNLOAD("下载", "el-icon-download"),
	//
	REFRESH("刷新", "el-icon-refresh");

	private String title;
	private String icon;

	private Action(String title, String icon) {
		this.setTitle(title);
		this.setIcon(icon);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
