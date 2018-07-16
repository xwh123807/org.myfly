package org.myfly.platform.visualpage3.webui.view;

import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.webui.ViewMode;

public abstract class BaseView {
	private FlyViewModel viewModel;
	private ViewMode viewMode;

	public BaseView(FlyViewModel viewModel, ViewMode viewMode) {
		this.setViewModel(viewModel);
		this.setViewMode(viewMode);

	}

	public FlyViewModel getViewModel() {
		return viewModel;
	}

	public void setViewModel(FlyViewModel viewModel) {
		this.viewModel = viewModel;
	}

	public ViewMode getViewMode() {
		return viewMode;
	}

	public void setViewMode(ViewMode viewMode) {
		this.viewMode = viewMode;
	}
}
