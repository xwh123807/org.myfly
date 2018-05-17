package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.myfly.platform.core.utils.FuncUtil;
import org.myfly.platform.core.utils.FuncUtil.ConvertAction;

public class MetaDataDefinition extends BaseDenifition {
	private TableDefinition tableDefinition;

	private FormDefinition[] formDefinitions;

	private ListDefinition[] listDefinitions;

	private OutlineDefinition[] outlineDefinitions;

	public MetaDataDefinition(Object owner) {
		super(owner);
	}

	public MetaDataDefinition(MetaDataView view) {
		super(null);
		setMetaDataView(view);
	}

	private void setMetaDataView(MetaDataView view) {
		setTableDefinition(new TableDefinition(null, view.tableView()));
		setListDefinitions(view.listViews());
		setFormDefinitions(view.formViews());
		setOutlineDefinitions(view.outlineViews());
	}

	private void setOutlineDefinitions(OutlineView[] outlineViews) {
		outlineDefinitions = FuncUtil.convert(outlineViews, new ConvertAction<OutlineView, OutlineDefinition>() {

			@Override
			public OutlineDefinition execute(int index, OutlineView item) {
				return new OutlineDefinition(item);
			}

		}).toArray(new OutlineDefinition[] {});
	}

	private void setFormDefinitions(FormView[] formViews) {
		formDefinitions = FuncUtil.convert(formViews, new ConvertAction<FormView, FormDefinition>() {

			@Override
			public FormDefinition execute(int index, FormView item) {
				return new FormDefinition(item);
			}

		}).toArray(new FormDefinition[] {});
	}

	private void setListDefinitions(ListView[] listViews) {
		listDefinitions = FuncUtil.convert(listViews, new ConvertAction<ListView, ListDefinition>() {

			@Override
			public ListDefinition execute(int index, ListView item) {
				return new ListDefinition(item);
			}

		}).toArray(new ListDefinition[] {});
	}

	public TableDefinition getTableDefinition() {
		return tableDefinition;
	}

	public void setTableDefinition(TableDefinition tableDefinition) {
		this.tableDefinition = tableDefinition;
	}

	public FormDefinition[] getFormDefinitions() {
		return formDefinitions;
	}

	public void setFormDefinitions(FormDefinition[] formDefinitions) {
		this.formDefinitions = formDefinitions;
	}

	public ListDefinition[] getListDefinitions() {
		return listDefinitions;
	}

	public void setListDefinitions(ListDefinition[] listDefinitions) {
		this.listDefinitions = listDefinitions;
	}

	public OutlineDefinition[] getOutlineDefinitions() {
		return outlineDefinitions;
	}

	public void setOutlineDefinitions(OutlineDefinition[] outlineDefinitions) {
		this.outlineDefinitions = outlineDefinitions;
	}

}
