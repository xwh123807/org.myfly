package org.myfly.platform.visualpage3.define;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core3.metadata.define.IDefinition;

public class FlyMemoryViewModel {
	private static FlyMemoryViewModel instance = new FlyMemoryViewModel();

	private Map<String, FlyViewModel> viewModels;

	private FlyMemoryViewModel() {
		viewModels = new ConcurrentHashMap<>();
	}

	public static FlyMemoryViewModel getInstance() {
		return instance;
	}

	/**
	 * @return the viewModels
	 */
	public Map<String, FlyViewModel> getFlyViewModels() {
		return viewModels;
	}

	public void addViewModels(List<FlyViewModel> list) {
		addList(list, getFlyViewModels(), true);
	}

	/**
	 * 添加列表到目标map中 <br>
	 * 1、先从数据库中加载，再从代码级加载 <br>
	 * TODO 重复兼容处理
	 * 
	 * @param list
	 * @param target
	 * @param forceOverride
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addList(List<? extends IDefinition> list, Map target, boolean forceOverride) {
		if (CollectionUtils.isNotEmpty(list)) {
			list.forEach((IDefinition item) -> {
				item.validate();
				if (!target.containsKey(item.getKey()) || forceOverride) {
					target.put(item.getKey(), item);
				} else {
					// 重复
				}
			});
		}
	}

	/**
	 * 按名称获取显示模型，忽略大小写
	 * 
	 * @param windowName
	 * @return
	 */
	public FlyViewModel getFlyViewModel(String windowName) {
		FlyViewModel result = getFlyViewModels().get(windowName);
		if (result == null) {
			for (String apiName : getFlyViewModels().keySet()) {
				if (apiName.equalsIgnoreCase(windowName)) {
					return getFlyViewModels().get(apiName);
				}
			}
		}
		return result;
	}

}
