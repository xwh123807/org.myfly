package org.myfly.platform.core.test.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.FuncUtil;
import org.myfly.platform.core.utils.FuncUtil.Action;
import org.myfly.platform.core.utils.FuncUtil.ConvertAction;

public class FuncUtilTest {
	@Test
	public void forEach() {
		String[] items = new String[] { "hello", "world" };
		FuncUtil.forEach(items, new Action<String>() {

			@Override
			public void execute(int index, String item) {
				Assert.assertEquals(items[index], item);
			}

		});

		FuncUtil.forEach(items, (index, item) -> Assert.assertEquals(items[index], item));
	}

	@Test
	public void convert() {
		String[] items = new String[] { "hello", "world" };
		String[] destItems = FuncUtil.convert(items, new ConvertAction<String, String>() {

			@Override
			public String execute(int index, String item) {
				Assert.assertEquals(items[index], item);
				return item;
			}

		}).toArray(new String[] {});
		Assert.assertArrayEquals(items, destItems);
	}

	@Test
	public void convertCollection() {
		List<String> items = Arrays.asList(new String[] { "hello", "world" });
		List<String> destItems = FuncUtil.convertCollection(items, new Function<String, String>() {

			@Override
			public String apply(String t) {
				return t;
			}

		});
		Assert.assertArrayEquals(items.toArray(new String[] {}), destItems.toArray(new String[] {}));
	}
}
