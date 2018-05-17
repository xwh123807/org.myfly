package org.myfly.platform.core.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 函数式编程工具类
 * 
 * @author xiangwanhong
 *
 */
public class FuncUtil {
	/**
	 * 遍历items
	 * 
	 * @param items
	 * @param action
	 */
	public static <T> void forEach(T[] items, Action<T> action) {
		if (items != null && items.length > 0) {
			for (int i = 0; i < items.length; i++) {
				action.execute(i, items[i]);
			}
		}
	}

	public static <T> void forEach(T[] items, Consumer<T> consumer) {
		if (items != null && items.length > 0) {
			for (int i = 0; i < items.length; i++) {
				consumer.accept(items[i]);
			}
		}
	}

	public interface Action<T> {
		public void execute(int index, T item);
	}

	/**
	 * 将items转换到List
	 * 
	 * @param items
	 * @param action
	 * @return
	 */
	public static <T, R> List<R> convert(final T[] items, ConvertAction<T, R> action) {
		List<R> results = new ArrayList<R>();
		if (items != null && items.length > 0) {
			for (int i = 0; i < items.length; i++) {
				results.add(action.execute(i, items[i]));
			}
		}
		return results;
	}

	@FunctionalInterface
	public interface ConvertAction<T, R> {
		R execute(int index, T item);
	}

	public static <T, R> List<R> convertCollection(final Collection<T> items, final Function<T, R> consumer) {
		List<R> results = new ArrayList<R>();
		items.forEach(new Consumer<T>() {

			@Override
			public void accept(T item) {
				results.add(consumer.apply(item));
			}
		});
		return results;
	}
}
