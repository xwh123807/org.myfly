package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.SQLOperator;
import org.myfly.platform.core.testdata.Master;

public class MasterMetaDataTest {
	public <T> void forEach(T[] items, Action<T> action) {
		if (items != null && items.length > 0) {
			for (int i = 0; i < items.length; i++) {
				action.execute(i, items[i]);
			}
		}
	}

	public interface Action<T> {
		public void execute(int index, T item);
	}

	@Test
	public void test() {
		MetaDataView view = Master.class.getAnnotation(MetaDataView.class);
		Assert.assertEquals(1, view.formViews().length);
		forEach(view.formViews(), new Action<FormView>() {

			@Override
			public void execute(int index, FormView item) {
				FormDefinition formDefinition = new FormDefinition(item);
				if (index == 0) {
					Assert.assertEquals("default", formDefinition.getName());
				}
			}

		});

		Assert.assertEquals(2, view.listViews().length);
		forEach(view.listViews(), new Action<ListView>() {

			@Override
			public void execute(int index, ListView item) {
				ListDefinition listDefinition = new ListDefinition(item);
				Assert.assertArrayEquals(item.fields(), listDefinition.getFieldNames());
				if (index == 0) {
					Assert.assertEquals("default", listDefinition.getName());
					Assert.assertEquals(ListStyle.TABLE, listDefinition.getListStyle());
				} else if (index == 1) {
					Assert.assertEquals(ListStyle.CARDLIST, listDefinition.getListStyle());
					FilterDefinition filter0 = listDefinition.getFilters()[0];
					Assert.assertEquals("name", filter0.getFieldName());
					Assert.assertEquals(SQLOperator.LIKE, filter0.getOperator());
					OrderDefinition order0 = listDefinition.getOrders()[0];
					Assert.assertEquals("name", order0.getName());
				}
			}

		});
	}

}
