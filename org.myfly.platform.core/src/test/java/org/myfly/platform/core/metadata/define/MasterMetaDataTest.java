package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.myfly.platform.core.metadata.annotation.SQLOperator;
import org.myfly.platform.core.metadata.annotation.SectionType;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.FuncUtil;
import org.myfly.platform.core.utils.FuncUtil.Action;

public class MasterMetaDataTest {
	@Test
	public void test() {
		MetaDataView view = Master.class.getAnnotation(MetaDataView.class);
		Assert.assertEquals(2, view.formViews().length);
		FuncUtil.forEach(view.formViews(), new Action<FormView>() {

			@Override
			public void execute(int index, FormView item) {
				FormDefinition formDefinition = new FormDefinition(item);
				formDefinition.validate();
				Assert.assertNotNull(formDefinition.toString());
				Assert.assertArrayEquals(item.actions(), formDefinition.getActions());
				if (index == 0) {
					// form default
					Assert.assertEquals("default", formDefinition.getName());
					Assert.assertEquals(4, formDefinition.getSections().length);
					FuncUtil.forEach(formDefinition.getSections(), new Action<SectionDefinition>() {

						@Override
						public void execute(int index, SectionDefinition section) {
							section.validate();
							Assert.assertNotNull(section.toString());
							if (index == 0) {
								Assert.assertEquals("用户信息", section.getTitle());
								Assert.assertEquals(SectionType.CUSTOM, section.getType());
								Assert.assertEquals(2, section.getFieldSets().length);
								FuncUtil.forEach(section.getFieldSets(), new Action<FieldSetDefinition>() {

									@Override
									public void execute(int index, FieldSetDefinition fieldSet) {
										fieldSet.validate();
										Assert.assertNotNull(fieldSet.toString());
										if (index == 0) {
											Assert.assertEquals("基本信息", fieldSet.getTitle());
											Assert.assertArrayEquals(new String[] { "name", "dataType", "description" },
													fieldSet.getFields());
										} else if (index == 1) {
											Assert.assertEquals("审计", fieldSet.getTitle());
											Assert.assertArrayEquals(new String[] { "active", "created" },
													fieldSet.getFields());
										}
									}

								});
							} else if (index == 1) {
								Assert.assertEquals(SectionType.NOTE.getTitle(), section.getTitle());
								Assert.assertEquals(SectionType.NOTE, section.getType());
							} else if (index == 2) {
								Assert.assertEquals(SectionType.ATTACHMENT.getTitle(), section.getTitle());
								Assert.assertEquals(SectionType.ATTACHMENT, section.getType());
							} else if (index == 3) {
								Assert.assertEquals("子表区域", section.getTitle());
								Assert.assertEquals(1, section.getSubTables().length);
								FuncUtil.forEach(section.getSubTables(), new Action<SubTableDefinition>() {

									@Override
									public void execute(int index, SubTableDefinition subTable) {
										subTable.validate();
										Assert.assertNotNull(subTable.toString());
										if (index == 0) {
											Assert.assertEquals("明细记录", subTable.getTitle());
											Assert.assertEquals("details", subTable.getSubTableAttr());
										}
									}

								});
							}
						}
					});
				} else if (index == 1) {
					// form2
					Assert.assertEquals("form2", formDefinition.getName());
					Assert.assertEquals(1, formDefinition.getDivs().length);
					// div0
					FuncUtil.forEach(formDefinition.getDivs(), new Action<DivDefinition>() {
						@Override
						public void execute(int index, DivDefinition item) {
							item.validate();
							Assert.assertNotNull(item.toString());
							if (index == 0) {
								// div1
								FuncUtil.forEach(item.getSubs(), new Action<DivDefinition>() {

									@Override
									public void execute(int index, DivDefinition item) {
										item.validate();
										Assert.assertNotNull(item.toString());
										// div 2
										if (index == 0) {
											FuncUtil.forEach(item.getSections(), new Action<SectionDefinition>() {

												@Override
												public void execute(int index, SectionDefinition item) {
													item.validate();
													Assert.assertNotNull(item.toString());
													if (index == 0) {
														Assert.assertEquals(SectionType.ATTACHMENT, item.getType());
													}
												}

											});
										}
									}

								});
							}
						}

					});
				}
			}

		});

		Assert.assertEquals(2, view.listViews().length);
		FuncUtil.forEach(view.listViews(), new Action<ListView>() {

			@Override
			public void execute(int index, ListView item) {
				ListDefinition listDefinition = new ListDefinition(item);
				listDefinition.validate();
				Assert.assertNotNull(listDefinition.toString());
				Assert.assertArrayEquals(item.fields(), listDefinition.getFields());
				if (index == 0) {
					Assert.assertEquals("default", listDefinition.getName());
					Assert.assertEquals(ListStyle.TABLE, listDefinition.getListStyle());
				} else if (index == 1) {
					listView1(listDefinition);
				}
			}

		});

		Assert.assertEquals(1, view.outlineViews().length);
		FuncUtil.forEach(view.outlineViews(), new Action<OutlineView>() {

			@Override
			public void execute(int index, OutlineView item) {
				OutlineDefinition outlineDefinition = new OutlineDefinition(item);
				outlineDefinition.validate();
				Assert.assertNotNull(outlineDefinition.toString());
				Assert.assertEquals("摘要信息", outlineDefinition.getTitle());
				Assert.assertEquals(1, outlineDefinition.getSections().length);

				FuncUtil.forEach(outlineDefinition.getSections(), new Action<SectionDefinition>() {

					@Override
					public void execute(int index, SectionDefinition item) {
						item.validate();
						Assert.assertNotNull(item.toString());
						if (index == 0) {
							Assert.assertEquals("用户信息", item.getTitle());
							Assert.assertEquals(2, item.getFieldSets().length);
							FuncUtil.forEach(item.getFieldSets(), new Action<FieldSetDefinition>() {

								@Override
								public void execute(int index, FieldSetDefinition item) {
									item.validate();
									Assert.assertNotNull(item.toString());
									if (index == 0) {
										Assert.assertArrayEquals(new String[] { "name", "dataType", "description" },
												item.getFields());
									}
								}

							});
						}
					}

				});
			}

		});
	}

	private void listView1(ListDefinition listDefinition) {
		Assert.assertEquals(ListStyle.CARDLIST, listDefinition.getListStyle());
		FilterDefinition filter0 = listDefinition.getFilters()[0];
		Assert.assertEquals("name", filter0.getField());
		Assert.assertEquals(SQLOperator.LIKE, filter0.getOperator());
		filter0.validate();
		Assert.assertNotNull(filter0.toString());
		OrderDefinition order0 = listDefinition.getOrders()[0];
		Assert.assertEquals("name", order0.getName());
		order0.validate();
		Assert.assertNotNull(order0.toString());
	}
}
